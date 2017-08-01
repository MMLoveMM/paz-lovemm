package cn.lovemm.controller;

import cn.lovemm.controller.config.gt.GeetestConfig;
import cn.lovemm.controller.config.gt.GeetestLib;
import cn.lovemm.model.BlogUser;
import cn.lovemm.model.SUser;
import cn.lovemm.service.BlogUserService;
import cn.lovemm.service.SUserService;
import cn.lovemm.util.RequestUtil;
import cn.lovemm.vo.Constant;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.*;
import org.apache.shiro.session.Session;
import org.apache.shiro.subject.Subject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;


/**
 * Created by pangpj on 2017/3/30.
 */

@Controller
public class MainController {
    private static final Logger logger = LoggerFactory.getLogger(MainController.class);

    @Autowired
    private BlogUserService blogUserService;

    @RequestMapping(value = "/getDate")
    @ResponseBody
    public Date getDate() {

        return new Date();
    }

    @RequestMapping(value = "/toLogin")
    public String toLogin() {
        logger.info("进入登录页面");

        return "login";
    }

    @RequestMapping(value = "/error/to404")
    public String to404() {
        logger.info("404");

        return "error/404/404";
    }

    @RequestMapping(value = "/error/to500")
    public String to500() {
        logger.info("500");

        return "error/other/500";
    }

    @RequestMapping(value = "/public/toIndex")
    public String toIndex() {
        logger.info("进入首页");

        return "index/index";
    }

    @RequestMapping(value = "/public/toBlog")
    public String toBlog() {
        logger.info("进入博客");

        return "blog/blog";
    }

    @RequestMapping(value = "/public/toNotes")
    public String toNotes() {
        logger.info("进入笔记");

        return "notes/notes";
    }

    @RequestMapping(value = "/public/toOther")
    public String toOther() {
        logger.info("进入其他");

        return "other/other";
    }

    /**
     * 登录验证
     * @param request
     * @param username
     * @param password
     * @param challenge
     * @param validate
     * @param seccode
     * @return
     */
    @RequestMapping(value = "/public/validate")
    @ResponseBody
    public String login(HttpServletRequest request, @RequestParam(required = true) String username,
                        @RequestParam(required = true) String password,
                        @RequestParam(value = GeetestLib.fn_geetest_challenge, required = true) String challenge,
                        @RequestParam(value = GeetestLib.fn_geetest_validate, required = true) String validate,
                        @RequestParam(value = GeetestLib.fn_geetest_seccode, required = true) String seccode) {

        Session session = SecurityUtils.getSubject().getSession();
        GeetestLib gtSdk = new GeetestLib(GeetestConfig.getGeetest_id(),
                GeetestConfig.getGeetest_key(), GeetestConfig.isnewfailback());

        //从session中获取gt-server状态
        int gt_server_status_code = (Integer) request.getSession().getAttribute(gtSdk.gtServerStatusSessionKey);

        //从session中获取userid
        String userid = (String)request.getSession().getAttribute("userid");

        int gtResult = 0;

        if (gt_server_status_code == 1) {
            //gt-server正常，向gt-server进行二次验证
            gtResult = gtSdk.enhencedValidateRequest(challenge, validate, seccode, userid);
            logger.info("gtResult : ", gtResult);
        } else {
            // gt-server非正常情况下，进行failback模式验证
            logger.info("failback:use your own server captcha validate");
            gtResult = gtSdk.failbackValidateRequest(challenge, validate, seccode);
            logger.info("gtResult : ", gtResult);
        }

        if (gtResult != 1) {    //验证失败
            logger.error("图形验证失败");
            return "图形验证失败";
        }

        //验证用户名密码
        String errorInfo = null;
        Subject currentUser = SecurityUtils.getSubject();
        UsernamePasswordToken token = new UsernamePasswordToken(username, password);

        try {
            currentUser.login(token);
            //验证是否登录成功
            if (currentUser.isAuthenticated()) {
                String ip = RequestUtil.getIp(request);
                BlogUser sUser = (BlogUser)SecurityUtils.getSubject().getPrincipal();
                logger.info("用户:{} - 登录成功, 当前IP : {}, 上次IP : {}",
                        sUser.getUserId(), ip, sUser.getLastLoginIp());
                //更新用户登录记录
                BlogUser upUser = new BlogUser();
                upUser.setUserId(sUser.getUserId());
                upUser.setLastLoginTime(new Date());
                upUser.setLastLoginIp(ip);
                upUser.setLoginTimes(sUser.getLoginTimes() + 1);
                blogUserService.updateByPrimaryKeySelective(upUser);
                return Constant.SUCCESS;
            }
        }catch (UnknownAccountException uae) {
            logger.error("用户名[" + username + "]用户不存在");
            errorInfo = "用户名不存在";
        } catch (IncorrectCredentialsException ice) {
            logger.error("用户名[" + username + "]密码错误");
            errorInfo = "密码错误";
        } catch (LockedAccountException lae) {
            logger.error("用户名[" + username + "]已锁定");
            errorInfo = "用户已锁定";
        } catch (ExcessiveAttemptsException eae) {
            logger.error("用户名[" + username + "]超出错误次数限制");
            errorInfo = "超出错误次数";
        } catch (AuthenticationException ae) {
            logger.error("用户名[" + username + "]其他错误");
            errorInfo = "其他错误";
        }
        token.clear();
        return errorInfo;
    }
    /**
     * 获取验证
     * @param request
     * @param response
     * @throws IOException
     */
    @RequestMapping(value = "/public/getVerify")
    public void getVerify(HttpServletRequest request, HttpServletResponse response) throws IOException {
        GeetestLib gtSdk = new GeetestLib(GeetestConfig.getGeetest_id(),
                GeetestConfig.getGeetest_key(), GeetestConfig.isnewfailback());

        String resStr = "{}";

        //自定义userid
        String userid = "1204667098@qq.com";

        //进行验证预处理
        int gtServerStatus = gtSdk.preProcess(userid);

        //将服务器状态设置到session中
        request.getSession().setAttribute(gtSdk.gtServerStatusSessionKey, gtServerStatus);

        //将userid设置到session中
        request.getSession().setAttribute("userid", userid);

        resStr = gtSdk.getResponseStr();

        PrintWriter out = response.getWriter();
        out.println(resStr);
    }

}

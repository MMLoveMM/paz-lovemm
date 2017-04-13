package cn.lovemm.controller;

import cn.lovemm.util.PwdUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;


/**
 * Created by pangpj on 2017/3/30.
 */

@Controller
public class MainController {
    private static final Logger logger = LoggerFactory.getLogger(MainController.class);

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


}
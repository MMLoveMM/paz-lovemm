package cn.lovemm.controller;

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

    @RequestMapping(value = "/public/toLogin")
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

}

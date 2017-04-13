package cn.lovemm.controller;

import cn.lovemm.model.SUser;
import cn.lovemm.model.SUserExample;
import cn.lovemm.service.SUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by pangpj on 2017/4/2.
 */

@Controller
public class TestConterller {

    @Autowired
    private SUserService sUserService;

    @RequestMapping(value = "getData")
    @ResponseBody
    public List<SUser> getsUserService() {

        return sUserService.selectByExample(new SUserExample());
    }
}

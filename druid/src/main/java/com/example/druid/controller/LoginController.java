package com.example.druid.controller;

import com.alibaba.fastjson.JSON;
import com.example.druid.bean.*;
import com.example.druid.dao.LoginMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * @author xiaolong
 * @create 2020-07-13 16:28
 * @description
 */
@RestController
public class LoginController {

    private Logger logger= LoggerFactory.getLogger(getClass());

    @Autowired
    private LoginMapper loginMapper;

    @RequestMapping("/login")
    Object login(HttpServletRequest request){
        List<Login> logins=loginMapper.findall();
//        System.out.println(request.getSession().getId());
        logger.error(request.getSession().getId());
        return JSON.toJSONString(logins);
    }
}

package com.drew.controller;

import com.alibaba.fastjson.JSON;
import com.drew.model.UserModel;
import org.springframework.beans.BeanUtils;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import com.drew.pojo.UserLoginPojo;

/**
 * @author zhangTao
 * @Date:2019/4/8 18:31
 */
@RestController
@RequestMapping("/user")
public class UserController {
    /*
    * 跳转到用户注册页面
    */
    @RequestMapping("/uiRegist")
    public ModelAndView uiRegist() {
        ModelAndView mav = new ModelAndView("hello");//通过ModelAndView构造方法可以指定返回的页面名称，也可以通过setViewName()方法跳转到指定的页面
        mav.setViewName("register");
        return mav;
    }

    /*
    * 用户填写注册信息后注册
    */
    @RequestMapping("/doRegist")
    public ModelAndView doRegist(@ModelAttribute UserModel userModel) {
        //如果用户是不已工作，则居住地（省、市）及公司为空
        if (!"worker".equals(userModel.getIdentity())) {
            userModel.setAddr_province("");
            userModel.setAddr_city("");
        }
        UserLoginPojo user = new UserLoginPojo();
        BeanUtils.copyProperties(userModel, user);
        String s = JSON.toJSONString(user);
        System.out.println(s+"==============================");
        ModelAndView mav = new ModelAndView("hello");//通过ModelAndView构造方法可以指定返回的页面名称，也可以通过setViewName()方法跳转到指定的页面
        mav.setViewName("register");
        return mav;
    }
}

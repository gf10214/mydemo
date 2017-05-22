package com.wondersgroup.mydemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.ValidationException;


/**
 * Created by Administrator on 2017/1/3 0003.
 */
@Controller
@RequestMapping("/tcm")
public class TcmDemo {
    @RequestMapping("/list")
    public String getList(String a,Model model){
        if(StringUtils.isEmpty(a)){
            throw new ValidationException("参数错误");
        }
        model.addAttribute("hello","hello");
        return "tcm";
    }
}

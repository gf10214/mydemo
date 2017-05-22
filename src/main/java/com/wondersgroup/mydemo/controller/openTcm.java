package com.wondersgroup.mydemo.controller;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Administrator on 2017/1/3 0003.
 */
@Controller
public class openTcm {
    private static int st = 0;      //静态的
    private int index = 0;          //非静态
    @RequestMapping("openTcm")
    public String openTcm(){
        System.out.println(st++ + " | " + index++);
        System.out.println(Thread.currentThread());
        return "openTcm";
    }
    @RequestMapping("parent")
    public String parent(){
        return "parent";
    }
    @RequestMapping("children")
    public String child(){
        return "children";
    }

    @ResponseBody
    @RequestMapping("score")
    public String score(){
        return "77";
    }

}

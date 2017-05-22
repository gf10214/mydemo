package com.wondersgroup.mydemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by wangshuo on 2017/5/22.
 */
@Controller
public class FormController {
    @RequestMapping("form")
    public String openTcm(){
        return "from";
    }
    @RequestMapping("saveForm")
    public void saveForm(@RequestParam(value = "file", required = false) MultipartFile[] files, String name,
                                       HttpServletResponse response){
        JsonResponseEntity<String> result = new JsonResponseEntity<>();
        System.out.println(files);
        System.out.println(name);
        result.setMsg("成功了");
        response.setCharacterEncoding("UTF-8");
        response.setHeader("Content-Type", "text/html");
        try {
            response.getWriter().write(JsonMapper.getInstance().toJson(result));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}

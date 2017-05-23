package com.wondersgroup.mydemo.controller;

import org.apache.tomcat.util.http.fileupload.FileUploadBase;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MaxUploadSizeExceededException;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;

/**
 * Created by wangshuo on 2017/5/22.
 */
@Controller
public class FormController {
    @RequestMapping("form")
    public String openTcm(){
        return "from";
    }
    @RequestMapping("form2")
    public String openTcm2(){
        return "form2";
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

    @ExceptionHandler(MaxUploadSizeExceededException.class)
    public String handleException(MaxUploadSizeExceededException ex, HttpServletRequest request) {
        System.out.println("错误文件上传");
        return "form2";
    }

    private String getFileKB(long byteFile){
        if(byteFile==0)
            return "0KB";
        long kb=1024;
        return ""+byteFile/kb+"KB";
    }

}

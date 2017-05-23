package com.wondersgroup.mydemo.Interceptor;

import com.wondersgroup.mydemo.controller.JsonMapper;
import com.wondersgroup.mydemo.controller.JsonResponseEntity;
import org.apache.tomcat.util.http.fileupload.servlet.ServletFileUpload;
import org.apache.tomcat.util.http.fileupload.servlet.ServletRequestContext;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by wangshuo on 2017/5/24.
 */
public class MaxSizeInterceptor extends HandlerInterceptorAdapter {
    private Long maxSize;
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        //判断是否文件上传
        if(request!=null && ServletFileUpload.isMultipartContent(request)) {
            ServletRequestContext ctx = new ServletRequestContext(request);
            JsonResponseEntity<String> result = new JsonResponseEntity<>();
            //获取上传文件尺寸大小
            long requestSize = ctx.contentLength();
            if (requestSize > maxSize) {
                //当上传文件大小超过指定大小限制后，模拟抛出MaxUploadSizeExceededException异常
                response.setCharacterEncoding("UTF-8");
                response.setHeader("Content-Type", "text/html");
                result.setCode(1);
                result.setMsg("文件过大");
                response.getWriter().write(JsonMapper.getInstance().toJson(result));
                return false;
            }
        }
        return true;
    }
    public void setMaxSize(long maxSize) {
        this.maxSize = maxSize;
    }
}

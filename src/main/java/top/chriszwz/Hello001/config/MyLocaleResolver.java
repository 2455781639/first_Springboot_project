package top.chriszwz.Hello001.config;

import org.apache.tomcat.jni.Local;
import org.springframework.web.servlet.LocaleResolver;
import org.thymeleaf.util.StringUtils;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Locale;

public class MyLocaleResolver implements LocaleResolver {

    //解析请求
    @Override
    public Locale resolveLocale(HttpServletRequest httpServletRequest) {
        //获取请求中的参数链接
        String s = httpServletRequest.getParameter("l");
        Locale locale = Locale.getDefault();
        // 如果没有就使用默认
        if(!StringUtils.isEmpty(s)){
            //国家、地区
            String[] split = s.split("_");
            locale = new Locale(split[0],split[1]);
        }
        return locale;
    }

    @Override
    public void setLocale(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Locale locale) {}
}

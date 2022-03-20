package com.example.springbootdemo.MyConfgtion;

import org.springframework.web.servlet.LocaleResolver;
import org.thymeleaf.util.StringUtils;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Locale;

public class MyLocaleResolver implements LocaleResolver {
    @Override
    public Locale resolveLocale(HttpServletRequest request) {
        Locale aDefault;
        String langue = request.getParameter("langue");
        if (StringUtils.isEmpty(langue)){

             aDefault = Locale.getDefault();
            System.out.println("===="+aDefault);


        }else {

            String[] param = langue.split("_");
            aDefault = new Locale(param[0], param[1]);
            System.out.println(" aDefault "+aDefault);

        }


        return aDefault;
    }

    @Override
    public void setLocale(HttpServletRequest request, HttpServletResponse response, Locale locale) {

    }
}

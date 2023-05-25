package com.msb;

import org.springframework.lang.Nullable;
import org.springframework.web.servlet.LocaleResolver;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Locale;

/**
 * Created by 17081290 on 2021/1/4.
// */
public class MyLocaleResolver implements LocaleResolver{

   public Locale resolveLocale(HttpServletRequest request) {
       Locale locale =  null;
       String localeStr = request.getParameter("locale");
       if(localeStr !=null && !"".equals(localeStr)){
           Locale locale1 = new Locale(localeStr.split("_")[0], localeStr.split("_")[1]);
          }else{
            locale = request.getLocale();
       }
       return locale;
    }


  public void setLocale(HttpServletRequest request, HttpServletResponse response, Locale locale){
      throw new UnsupportedOperationException("Cannot change HTTP accept header - use a different locale resolution strategy");
  }

}

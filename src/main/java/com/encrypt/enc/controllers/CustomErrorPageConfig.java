package com.encrypt.enc.controllers;
import org.springframework.boot.autoconfigure.web.servlet.error.ErrorViewResolver;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpStatus;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

@Configuration
public class CustomErrorPageConfig {

    @Bean
    public ErrorViewResolver customErrorViewResolver() {
        return (HttpServletRequest request, HttpStatus status, Map<String, Object> model) -> {
            ModelAndView modelAndView = new ModelAndView();
            modelAndView.setViewName("error-page"); // Create a JSP file named "error-page.jsp" for error handling
            return modelAndView;
        };
    }
}

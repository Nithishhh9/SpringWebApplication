package com.nithish.SpringWeb.Model;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AOPSpring {
    @Before("execution(public * com.nithish.SpringWeb.controller.ProductController.getProducts())")
    public void Welcome()
    {
        System.out.println("Welcome");
    }

}

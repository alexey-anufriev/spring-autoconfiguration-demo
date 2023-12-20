package com.alexeyanufriev.autoconfigdemo.app.beans;

import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnBean(DependencyBean.class)
public class MainBean {

    public MainBean() {
        System.out.println("MainBean created");
    }

}

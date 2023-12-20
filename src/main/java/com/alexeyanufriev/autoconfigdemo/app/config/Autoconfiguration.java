package com.alexeyanufriev.autoconfigdemo.app.config;

import com.alexeyanufriev.autoconfigdemo.app.beans.DependencyBean;
import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.context.annotation.Bean;

@AutoConfiguration
public class Autoconfiguration {

    @Bean
    public DependencyBean dependencyBean() {
        return new DependencyBean();
    }

}

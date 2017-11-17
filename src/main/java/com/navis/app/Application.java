package com.navis.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Application extends SpringBootServletInitializer {

    private static ApplicationContext appContext;

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(Application.class);
    }

    @Autowired
    public void setAppContext(ApplicationContext context) {
        appContext = context;
    }

    public static String[] getBeans() {
        return appContext.getBeanDefinitionNames();
    }

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}

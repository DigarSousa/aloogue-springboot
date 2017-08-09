package com.aloogue.config;

import org.h2.server.web.WebServlet;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DatabaseConfig {
    @Value("${spring.h2.console.path}")
    String path;

    @Value("${spring.h2.console.enabled}")
    Boolean enabled;

    @Bean
    ServletRegistrationBean h2servletRegistration() {
        ServletRegistrationBean servletRegistrationBean = new ServletRegistrationBean(new WebServlet());
        servletRegistrationBean.addUrlMappings(path);
        servletRegistrationBean.setEnabled(enabled);
        return servletRegistrationBean;
    }
}

package com.aloogue.config;

import org.h2.server.web.WebServlet;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;


@Profile("dev")
@Configuration
@EnableConfigurationProperties
@ConfigurationProperties(prefix = "h2")
public class DatabaseConfig {
    private String path;
    private boolean consoleEnabled;

    public void setPath(String path) {
        this.path = path;
    }

    public void setConsoleEnabled(boolean consoleEnabled) {
        this.consoleEnabled = consoleEnabled;
    }

    @Bean
    ServletRegistrationBean h2servletRegistration() {
        ServletRegistrationBean servletRegistrationBean = new ServletRegistrationBean(new WebServlet());
        servletRegistrationBean.addUrlMappings(path);
        servletRegistrationBean.setEnabled(consoleEnabled);
        return servletRegistrationBean;
    }

}

package com.welfare;


import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.support.ErrorPageFilter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.PropertySource;

import javax.sql.DataSource;
import java.beans.PropertyVetoException;

@SpringBootApplication
@PropertySource(value = "jdbc.properties")
public class WelfareCloudApplication {
    public static void main(String[] args) {
        SpringApplication.run(WelfareCloudApplication.class,args);
    }

    @Value("${jdbc.url}")
    private String url;
    @Value("${jdbc.user}")
    private String user;
    @Value("${jdbc.password}")
    private String password;
    @Value("${jdbc.driverClass}")
    private String driver;

    @Bean
    @ConfigurationProperties(prefix = "jdbc")
    public DataSource dataSource() throws PropertyVetoException {
        ComboPooledDataSource build = DataSourceBuilder.create().type(ComboPooledDataSource.class).build();
        build.setDriverClass(driver);
        build.setUser(user);
        build.setPassword(password);
        build.setJdbcUrl(url);
        return build;
    }

    @Bean
    public ErrorPageFilter errorPageFilter() {
        return new ErrorPageFilter();
    }

    @Bean
    public FilterRegistrationBean disableSpringBootErrorFilter(ErrorPageFilter filter) {
        FilterRegistrationBean filterRegistrationBean = new FilterRegistrationBean();
        filterRegistrationBean.setFilter(filter);
        filterRegistrationBean.setEnabled(false);
        return filterRegistrationBean;
    }

}

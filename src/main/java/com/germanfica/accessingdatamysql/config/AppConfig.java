package com.germanfica.accessingdatamysql.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.PropertySource;
import javax.sql.DataSource;

@Configuration
@PropertySource("classpath:config/db.properties")
public class AppConfig {
    // == fields ==
    @Value("${datasource.username}")
    private String username;
    @Value("${datasource.password}")
    private String password;
    @Value("${datasource.driverClassName}")
    private String driverClassName;
    @Value("${datasource.url}")
    private String url;

    // == beans methods ==
    /**
     * Basic implementation of {@code javax.sql.DataSource} that is configured via JavaBeans properties.
     *
     * @return the DataSource that has been configured
     */
    @Bean(name = "mySqlDataSource")
    @Primary
    public DataSource dataSource() {
        DataSourceBuilder ds =  DataSourceBuilder.create();
        ds.driverClassName(driverClassName);
        ds.url(url);
        ds.username(username);
        ds.password(password);
        return ds.build();
    }
}

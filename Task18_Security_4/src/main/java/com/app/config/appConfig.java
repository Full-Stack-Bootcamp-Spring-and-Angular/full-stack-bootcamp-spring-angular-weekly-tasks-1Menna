package com.app.config;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import javax.sql.DataSource;
import java.beans.PropertyVetoException;

@Configuration
@EnableWebMvc
@ComponentScan("com.app")
@PropertySource("classpath:application.properties")
public class appConfig implements org.springframework.web.servlet.config.annotation.WebMvcConfigurer{

    @Autowired
    Environment environment;

    @Value("${jdbc.driver}")
    String driver;
    @Bean
    public DataSource dataSource(){
        // create connection pool
        ComboPooledDataSource myDataSource = new ComboPooledDataSource();
        try{
            // set database connection properties
            myDataSource.setDriverClass(driver);
            myDataSource.setJdbcUrl(environment.getProperty("jdbc.url"));
            myDataSource.setUser(environment.getProperty("jdbc.username"));
            myDataSource.setPassword(environment.getProperty("jdbc.password"));

            // set connection pool
            myDataSource.setInitialPoolSize(Integer.parseInt(environment.getProperty("connection.pool.initialPoolSize")));
            myDataSource.setMinPoolSize(Integer.parseInt(environment.getProperty("connection.pool.minPoolSize")));
            myDataSource.setMaxPoolSize(Integer.parseInt(environment.getProperty("connection.pool.maxPoolSize")));
            myDataSource.setMaxIdleTime(Integer.parseInt(environment.getProperty("connection.pool.maxIdleTime")));

        } catch (PropertyVetoException ex) {
            throw new RuntimeException(ex);
        }
        return myDataSource;
    }


    @Bean
    public ViewResolver viewResolver(){
        InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();

        viewResolver.setPrefix("/WEB-INF/view/");
        viewResolver.setSuffix(".jsp");

        return viewResolver;
    }

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry){
        registry.addResourceHandler("/resources/**").addResourceLocations("/resources/");
    }
}

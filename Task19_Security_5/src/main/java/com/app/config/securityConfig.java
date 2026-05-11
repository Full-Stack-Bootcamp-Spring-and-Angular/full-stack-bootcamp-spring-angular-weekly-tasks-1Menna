package com.app.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;


import javax.sql.DataSource;

@Configuration
@EnableWebSecurity
public class securityConfig extends WebSecurityConfigurerAdapter {

    @Autowired
    private DataSource dataSource;


    // Authentication
    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.jdbcAuthentication().dataSource(dataSource); // new way
    }

    // Authorization
    @Override
    protected void configure(HttpSecurity http) throws Exception {
         http.authorizeRequests()
                 .antMatchers("/admin").hasRole("ADMIN")
                 .antMatchers("/system").hasAnyRole("SYSTEM","ADMIN")
                 .antMatchers("/resources/**").permitAll()
                 .antMatchers("/register").permitAll()
                 .anyRequest().authenticated()
                 .and()
                 .formLogin()
                 .loginPage("/login")
                 .loginProcessingUrl("/authenticateTheUser")
                 .permitAll()
                 .and()
                 .logout()
                 .logoutUrl("/SignOut")
                 .permitAll()
                 .and()
                 .exceptionHandling()
                 .accessDeniedPage("/accessDenied");

    }


}

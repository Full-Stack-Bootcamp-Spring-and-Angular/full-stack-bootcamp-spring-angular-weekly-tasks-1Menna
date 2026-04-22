package com.app.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;

@Configuration
@EnableWebSecurity
public class securityConfig extends WebSecurityConfigurerAdapter {

    // Authentication
    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        User.UserBuilder users = User.withDefaultPasswordEncoder();

        auth.inMemoryAuthentication()
                .withUser(users.username("menna").password("123").roles("ADMIN"))
                .withUser(users.username("systemApp").password("456").roles("SYSTEM"));

    }

    // Authorization

    @Override
    protected void configure(HttpSecurity http) throws Exception {
         http.authorizeRequests()
                 .antMatchers("/admin").hasRole("ADMIN")
                 .antMatchers("/system").hasRole("SYSTEM")
                 .antMatchers("/resources/**").permitAll()
                 .anyRequest().authenticated()
                 .and()
                 .formLogin()
                 .loginPage("/login")
                 .loginProcessingUrl("/authenticateTheUser")
                 .permitAll()
                 .and()
                 .logout()
                 .logoutUrl("/SignOut")
                 .permitAll();

    }
}

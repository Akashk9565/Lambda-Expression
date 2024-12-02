package com.security.SecurityApp;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
//@EnableMethodSecurity
public class SecurityConfig {
	
	@Bean
	public PasswordEncoder PasswordEncoder() {
		return new BCryptPasswordEncoder();
	}

	@Bean
	public UserDetailsService userDetailsService() {

		UserDetails normalUser = User
				.withUsername("akash")
				.password(PasswordEncoder()
				.encode ("password"))
				.roles("ADMIN")
				.build();

		UserDetails adminUser = User
				.withUsername("akshay")
				.password(PasswordEncoder()
				.encode ("password"))
				.roles("NORMAL")
				.build();
		return  new InMemoryUserDetailsManager(normalUser, adminUser);
		
	}

	@Bean
	public SecurityFilterChain filterChain(HttpSecurity httpSecurity) throws Exception {

		httpSecurity
				.csrf()
				.disable()
				.authorizeHttpRequests()
				
				.requestMatchers("/home/admin")
				.hasRole("ADMIN")
				.requestMatchers("home/normal")
				.hasRole("NORMAL")
				
				.requestMatchers("/home/createUsers")
				.hasRole("ADMIN")
				.requestMatchers("/home/getUsers")
				.hasRole("ADMIN")
				.requestMatchers("/home/getUsers")
				.hasRole("NORMAL")
				
				.requestMatchers("/home/public")
				.permitAll()
				
				.anyRequest()
				.authenticated()
				.and()
				.formLogin();

		return httpSecurity.build();
	}
}

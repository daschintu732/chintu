package com.ashokit.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

import static org.springframework.security.config.Customizer.withDefaults;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

	@Bean
	public SecurityFilterChain enableSecurity(HttpSecurity https) throws Exception 
	{
		https.authorizeHttpRequests((request) -> 
						request.antMatchers("/", "/login", "/about").permitAll()
						.anyRequest().authenticated()).formLogin(withDefaults());

		return https.build();
	}
}

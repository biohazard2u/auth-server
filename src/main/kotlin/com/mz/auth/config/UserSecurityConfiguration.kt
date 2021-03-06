package com.mz.auth.config

import org.springframework.context.annotation.Configuration
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder
import org.springframework.security.config.annotation.web.builders.HttpSecurity
import org.springframework.security.config.annotation.web.builders.WebSecurity
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter

/**
 * This configuration specifies which urls are to be intercepted,
 *	and are to be accessed by which users and having which roles.
 */
@Configuration
@EnableWebSecurity
open class UserSecurityConfiguration : WebSecurityConfigurerAdapter() {

	// ADMIN role required To access URL /user/getUsers 
	override fun configure(http: HttpSecurity?) {
		http!!.authorizeRequests()
				.antMatchers("/").permitAll()
				.antMatchers("/user/getUsers")
					.hasAnyRole("ADMIN")
					.anyRequest().authenticated()
				.and().formLogin().permitAll()
				.and().logout().permitAll();
		// Cross Site Request Forgery (CSRF, pronounced "sea surf")
		http.csrf().disable();
	}
	
	// We create an ADMIN role with following credentials
	override fun configure(auth: AuthenticationManagerBuilder?) {

//		// NOT SECURE so it is not recommended for production environments
//		auth?.inMemoryAuthentication()
//				?.passwordEncoder(NoOpPasswordEncoder.getInstance())
//				?.withUser("admin")?.password("admin")?.roles("ADMIN");

		// NOT SECURE so it is not recommended for production environments
		auth?.inMemoryAuthentication()?.withUser("admin")?.password("{noop}admin")
				?.authorities("ROLE_ADMIN")
	}
}
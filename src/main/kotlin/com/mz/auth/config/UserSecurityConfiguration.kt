package com.mz.auth.config

import org.springframework.context.annotation.Configuration
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter

@Configuration
@EnableWebSecurity
class UserSecurityConfiguration : WebSecurityConfigurerAdapter {
	
	override fun configure(auth: AuthenticationManagerBuilder?) {
		super.configure(auth)
	}

	override fun configure(web: WebSecurity?) {
		super.configure(web)
	}

	override fun configure(http: HttpSecurity?) {
		super.configure(http)
	}
}
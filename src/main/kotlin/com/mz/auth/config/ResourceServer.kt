package com.mz.auth.config

import org.springframework.security.config.annotation.web.builders.HttpSecurity
import org.springframework.security.oauth2.config.annotation.web.configuration.ResourceServerConfigurerAdapter

class ResourceServer : ResourceServerConfigurerAdapter() {

	override fun configure(http: HttpSecurity?) {
		http!!.requestMatchers().antMatchers("/user/getUsersList/**").and().authorizeRequests().anyRequest()
				.access("#oauth2.hasScope('read')")
	}
}
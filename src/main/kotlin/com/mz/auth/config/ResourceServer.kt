package com.mz.auth.config

import org.springframework.context.annotation.Configuration
import org.springframework.security.config.annotation.web.builders.HttpSecurity
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer
import org.springframework.security.oauth2.config.annotation.web.configuration.ResourceServerConfigurerAdapter

/**
 * This class allows any request with valid access token and scope to get the requested resource.
 */
@Configuration
@EnableResourceServer
open class ResourceServer : ResourceServerConfigurerAdapter() {

	/**
	 * This is to configure the access rules for secure resources.
	 */
	override fun configure(http: HttpSecurity?) {
		http!!.requestMatchers().antMatchers("/user/getUsers/**").and().authorizeRequests().anyRequest()
				.access("#oauth2.hasScope('read')")
	}
}
package com.mz.auth.config

import org.springframework.security.oauth2.config.annotation.configurers.ClientDetailsServiceConfigurer
import org.springframework.security.oauth2.config.annotation.web.configuration.AuthorizationServerConfigurerAdapter

class AuthorizationServerConfig : AuthorizationServerConfigurerAdapter() {

	override fun configure(clients: ClientDetailsServiceConfigurer?) {
		clients?.inMemory()?.withClient("client123")?.secret("secret")?.authorizedGrantTypes("authorization_code")
				?.scopes("read")?.authorities("CLIENT");
	}
}
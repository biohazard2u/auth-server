package com.mz.auth.config

import org.springframework.context.annotation.Configuration
import org.springframework.security.oauth2.config.annotation.configurers.ClientDetailsServiceConfigurer
import org.springframework.security.oauth2.config.annotation.web.configuration.AuthorizationServerConfigurerAdapter
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer

/**
 * This is to configure an authorization server using EnableAuthorizationServer annotation.
 * The server is customized by extending the class AuthorizationServerConfigurerAdapter.
 * The authorization server does not secure the authorization end point i.e. /oauth/authorize.
 */
@Configuration
@EnableAuthorizationServer
open class AuthorizationServerConfig : AuthorizationServerConfigurerAdapter() {

	/**
	 * Using in memory client service we setup the clients that can access the server.
	 * Thus, if we get a request with that client+secret+grantType+scope+authority
	 *			-> resource owner may allow to share data with CLIENT application
	 */
	override fun configure(clients: ClientDetailsServiceConfigurer?) {
		clients?.inMemory()?.withClient("client123")?.secret("secret")?.authorizedGrantTypes("authorization_code")
				?.scopes("read")?.authorities("CLIENT");
	}
}
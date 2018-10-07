package com.mz.auth.controller

import com.mz.auth.model.User
import com.mz.auth.service.UserService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class UserController(val userService: UserService) {
	
	@GetMapping("/id")
	fun getUserById(): User {
		return userService.getUserById("id1")
	}
}
package com.mz.auth.controller

import com.mz.auth.model.User
import com.mz.auth.service.UserService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController
import org.springframework.web.bind.annotation.RequestMapping

@RestController
@RequestMapping("user")
class UserController(val userService: UserService) {
	
	@GetMapping("/getUsersList")
	fun getUsersList(): List<User> {
		return userService.getUsersList()
	}
	
	@GetMapping("/id")
	fun getUserById(): User {
		return userService.getUserById("id1")
	}
	
	
}
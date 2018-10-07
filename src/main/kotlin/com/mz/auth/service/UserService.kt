package com.mz.auth.service

import com.mz.auth.model.User
import org.springframework.stereotype.Service

@Service
class UserService {

	fun getUserById(userId: String): User {
		return User(userId, "NameHere")
	}
}
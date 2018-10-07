package com.mz.auth.service

import com.mz.auth.model.User
import org.springframework.stereotype.Service

@Service
class UserService {

	fun getUsersList(): List<User>{
		var user1: User = User("1", "Marcos")
		var user2: User = User("2", "Karita")
		var user3: User = User("3", "Enma")
		
		return listOf(user1, user2, user3)
	}
	
	fun getUserById(userId: String): User {
		return User(userId, "NameHere")
	}
}
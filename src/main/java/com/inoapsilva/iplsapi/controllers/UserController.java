package com.inoapsilva.iplsapi.controllers;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import com.inoapsilva.iplsapi.models.UserModel;

@RestController
public class UserController {

	@GetMapping(value = "test/{id}")
	public UserModel getUser(@PathVariable Long id) {
		UserModel User = new UserModel();
		User.setId(id);
		User.setName("Zé");
		User.setPassword("1234");

		return User;
	}

	@PostMapping(value = "testa")
	public UserModel editUser() {
		UserModel User = new UserModel();
		User.setName("Zé");
		User.setPassword("1234");

		return User;
	}

	@PutMapping(value = "testb")
	public UserModel removeUser() {
		UserModel User = new UserModel();
		User.setName("Zé");
		User.setPassword("1234");

		return User;
	}

	@DeleteMapping(value = "testc")
	public UserModel searchUser() {
		UserModel User = new UserModel();
		User.setName("Zé");
		User.setPassword("1234");

		return User;
	}
}

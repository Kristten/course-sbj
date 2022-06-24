package com.triersistemas.course.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.triersistemas.course.entities.Users;

@RestController
@RequestMapping("/users")
public class UserResource {
	@GetMapping
	public ResponseEntity<Users> findAll(){
		Users u = new Users(1L, "Maria", "maria@gmail.com", "99999999", "12345");
		return ResponseEntity.ok().body(u);
	}

}

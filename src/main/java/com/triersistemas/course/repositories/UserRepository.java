package com.triersistemas.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.triersistemas.course.entities.Users;


public interface UserRepository extends JpaRepository<Users, Long> {

}

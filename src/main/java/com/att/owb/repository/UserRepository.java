package com.att.owb.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.att.owb.entity.User;

public interface UserRepository extends JpaRepository<User, Integer> {

}

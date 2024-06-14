package com.UserMangement.SpringProject.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.UserMangement.SpringProject.entity.User;



public interface UserRepository extends JpaRepository<User, Long> {

}
package com.example.taskdemo.persistence.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.taskdemo.persistence.entity.User;

public interface UserRepo extends JpaRepository<User,Integer>{
    
}

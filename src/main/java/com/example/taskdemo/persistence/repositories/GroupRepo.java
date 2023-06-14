package com.example.taskdemo.persistence.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.taskdemo.persistence.entity.Group;

public interface GroupRepo extends JpaRepository<Group,String>{
    
}

package com.example.taskdemo.business.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.taskdemo.business.dtos.UserDto;
import com.example.taskdemo.business.mappers.UserMapper;
import com.example.taskdemo.business.service.UserService;
import com.example.taskdemo.persistence.entity.User;
import com.example.taskdemo.persistence.repositories.UserRepo;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserRepo userRepo;
    @Autowired
    private UserMapper userMapper;

    @Override
    public List<UserDto> getAll() {
        return userMapper.mapToUserDtos(userRepo.findAll());
    }

    @Override
    public UserDto getById(int id) {
        Optional<User> user =userRepo.findById(id);
        return userMapper.mapDto(user.get());
    }
    

    
}

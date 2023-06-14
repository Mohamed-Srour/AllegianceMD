package com.example.taskdemo.business.service;

import java.util.List;

import org.mapstruct.control.MappingControl.Use;

import com.example.taskdemo.business.dtos.UserDto;

public interface UserService {
    List<UserDto> getAll();
    UserDto getById(int id);
}

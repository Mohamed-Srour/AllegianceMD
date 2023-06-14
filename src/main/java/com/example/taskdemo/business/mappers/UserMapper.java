package com.example.taskdemo.business.mappers;

import java.util.List;

import org.mapstruct.Mapper;

import com.example.taskdemo.persistence.entity.User;
import com.example.taskdemo.business.dtos.UserDto;

@Mapper(componentModel = "spring")
public interface UserMapper {

    List<User> mapToUsers(List<UserDto> users);

    List<UserDto> mapToUserDtos(List<User> users) ;

    UserDto mapDto(User user);
    
}

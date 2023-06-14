package com.example.taskdemo.business.dtos;

import java.util.Set;

import com.example.taskdemo.persistence.entity.Group;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserDto {

    private Integer id_user;
    private String user_name;
    private String email;   
    private Set<GroupDto> groups;
}

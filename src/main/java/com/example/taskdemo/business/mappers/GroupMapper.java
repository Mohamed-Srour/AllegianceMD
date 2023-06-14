package com.example.taskdemo.business.mappers;

import java.util.List;
import org.mapstruct.Mapper;

import com.example.taskdemo.business.dtos.GroupDto;
import com.example.taskdemo.persistence.entity.Group;

@Mapper(componentModel = "spring")
public interface GroupMapper {
    
    List<GroupDto> mapToGroupDtos(List<Group> groups);

    List<Group> mapToGroups(List<GroupDto> groups);
}

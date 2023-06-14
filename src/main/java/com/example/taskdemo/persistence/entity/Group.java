package com.example.taskdemo.persistence.entity;

import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Table(name = "group", catalog = "task")
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Group {

    @Id
    private String group_name;


    @ManyToMany(fetch = FetchType.LAZY)
    private Set<User> users= new HashSet<User>();

}


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

// @Data
// @Table(name = "group")
// @Entity
// @AllArgsConstructor
// @NoArgsConstructor
// public class Group {

//     @Id
//     private String group_name;


//     @ManyToMany(fetch = FetchType.LAZY)
//     @JoinTable(name = "user_has_group", catalog = "task", joinColumns = {
//             @JoinColumn(name = "group_name", nullable = false, updatable = false) }, inverseJoinColumns = {
//             @JoinColumn(name = "id_user", nullable = false, updatable = false) })
//     private Set<User> users= new HashSet<User>();

// }


@Entity
@Table(name="group"
    ,catalog="task"
)
public class Group  implements java.io.Serializable {


     private String groupName;
     private Set<User> users = new HashSet<User>(0);

    public Group() {
    }

	
    public Group(String groupName) {
        this.groupName = groupName;
    }
    public Group(String groupName, Set<User> users) {
       this.groupName = groupName;
       this.users = users;
    }
   
     @Id 

    
    @Column(name="group_name", unique=true, nullable=false, length=255)
    public String getGroupName() {
        return this.groupName;
    }
    
    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

@ManyToMany(fetch=FetchType.LAZY, mappedBy="groups")
    public Set<User> getUsers() {
        return this.users;
    }
    
    public void setUsers(Set<User> users) {
        this.users = users;
    }




}

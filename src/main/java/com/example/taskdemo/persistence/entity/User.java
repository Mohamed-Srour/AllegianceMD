package com.example.taskdemo.persistence.entity;

import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Table(name = "user" ,catalog = "task")
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_user;
    private String user_name;
    private String email;

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "user_has_group", catalog = "task", joinColumns = {
            @JoinColumn(name = "id_user", nullable = false, updatable = false) }, inverseJoinColumns = {
            @JoinColumn(name = "group_name", nullable = false, updatable = false) })
    private Set<Group> groups=new HashSet<Group>();
}


// @Entity
// @Table(name="user"
//     ,catalog="task"
// )
// public class User  implements java.io.Serializable {


//      private int idUser;
//      private String userName;
//      private String email;
//      private Set<Group> groups = new HashSet<Group>(0);

//     public User() {
//     }

	
//     public User(int idUser) {
//         this.idUser = idUser;
//     }
//     public User(int idUser, String userName, String email, Set<Group> groups) {
//        this.idUser = idUser;
//        this.userName = userName;
//        this.email = email;
//        this.groups = groups;
//     }
   
//      @Id 

    
//     @Column(name="id_user", unique=true, nullable=false)
//     public int getIdUser() {
//         return this.idUser;
//     }
    
//     public void setIdUser(int idUser) {
//         this.idUser = idUser;
//     }

    
//     @Column(name="user_name", length=255)
//     public String getUserName() {
//         return this.userName;
//     }
    
//     public void setUserName(String userName) {
//         this.userName = userName;
//     }

    
//     @Column(name="email", length=255)
//     public String getEmail() {
//         return this.email;
//     }
    
//     public void setEmail(String email) {
//         this.email = email;
//     }

// @ManyToMany(fetch=FetchType.LAZY)
//     @JoinTable(name="user_has_group", catalog="task", joinColumns = { 
//         @JoinColumn(name="id_user", nullable=false, updatable=false) }, inverseJoinColumns = { 
//         @JoinColumn(name="group_name", nullable=false, updatable=false) })
//     public Set<Group> getGroups() {
//         return this.groups;
//     }
    
//     public void setGroups(Set<Group> groups) {
//         this.groups = groups;
//     }




// }




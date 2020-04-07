package com.cai.security;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Setter
@Getter
public class User implements java.io.Serializable{

    @Id
    @Column
    private Long id;
    @Column
    private String name;
    @Column
    private String password;
    @Column
    private String role;
    // 省略get set 等
}
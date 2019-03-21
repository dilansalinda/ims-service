package com.dilan.ims.service.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

/**
 * User: Dilan Salinda
 * Date: 3/13/2019
 * Time: 10:55 AM
 */

@Entity
@Table(name = "user")
@Getter
@Setter
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "name")
    private String name;
    @Column(name = "password")
    private String password;
    @Column(name = "createdAt")
    private String createdat;
    @Column(name = "updatedAt")
    private String updatedat;
    @Column(name = "email")
    private String email;
    @Column(name = "is_active")
    private String isActive;
}


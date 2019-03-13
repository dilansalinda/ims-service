package com.dilan.ims.service.domain;

import org.springframework.data.jpa.repository.Query;

import javax.persistence.*;

/**
 * User: Dilan Salinda
 * Date: 3/13/2019
 * Time: 10:55 AM
 */

@Entity
@Table(name = "c_iuser")
public class cUser {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String password;
    private String createdat;
    private String updatedat;
    private String email;
    private String isActive;
    private String ad1;
    private String ad2;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getCreatedAt() {
        return createdat;
    }

    public void setCreatedAt(String createdat) {
        this.createdat = createdat;
    }

    public String getUpdatedAt() {
        return updatedat;
    }

    public void setUpdatedAt(String updatedat) {
        this.updatedat = updatedat;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getIsActive() {
        return isActive;
    }

    public void setIsActive(String isActive) {
        this.isActive = isActive;
    }

    public String getAd1() {
        return ad1;
    }

    public void setAd1(String ad1) {
        this.ad1 = ad1;
    }

    public String getAd2() {
        return ad2;
    }

    public void setAd2(String ad2) {
        this.ad2 = ad2;
    }
}


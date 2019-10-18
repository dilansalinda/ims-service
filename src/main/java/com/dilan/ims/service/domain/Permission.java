/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dilan.ims.service.domain;

import javax.persistence.*;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;

/**
 *
 * @author Malinda
 */
@Entity
@Table(name = "permission", catalog = "ims", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Permission.findAll", query = "SELECT p FROM Permission p")
    , @NamedQuery(name = "Permission.findById", query = "SELECT p FROM Permission p WHERE p.id = :id")
    , @NamedQuery(name = "Permission.findByType", query = "SELECT p FROM Permission p WHERE p.type = :type")
    , @NamedQuery(name = "Permission.findByIsActive", query = "SELECT p FROM Permission p WHERE p.isActive = :isActive")})
public class Permission implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id", nullable = false)
    private Integer id;
    @Basic(optional = false)
    @Column(name = "type", nullable = false, length = 45)
    private String type;
    @Basic(optional = false)
    @Column(name = "is_active", nullable = false)
    private int isActive;
//    @JoinColumn(name = "user_id", referencedColumnName = "id", nullable = false)
//    @ManyToOne(optional = false)
//    private User userId;

    public Permission() {
    }

    public Permission(Integer id) {
        this.id = id;
    }

    public Permission(Integer id, String type, int isActive) {
        this.id = id;
        this.type = type;
        this.isActive = isActive;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getIsActive() {
        return isActive;
    }

    public void setIsActive(int isActive) {
        this.isActive = isActive;
    }


    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Permission)) {
            return false;
        }
        Permission other = (Permission) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "javaapplication1.Permission[ id=" + id + " ]";
    }
    
}

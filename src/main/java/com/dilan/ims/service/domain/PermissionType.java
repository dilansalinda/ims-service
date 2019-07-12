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
@Table(name = "permission_type", catalog = "ims", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "PermissionType.findAll", query = "SELECT p FROM PermissionType p")
    , @NamedQuery(name = "PermissionType.findById", query = "SELECT p FROM PermissionType p WHERE p.id = :id")
    , @NamedQuery(name = "PermissionType.findByIsActive", query = "SELECT p FROM PermissionType p WHERE p.isActive = :isActive")
    , @NamedQuery(name = "PermissionType.findByType", query = "SELECT p FROM PermissionType p WHERE p.type = :type")})
public class PermissionType implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id", nullable = false)
    private Integer id;
    @Column(name = "is_active", length = 255)
    private String isActive;
    @Column(name = "type", length = 255)
    private String type;

    public PermissionType() {
    }

    public PermissionType(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getIsActive() {
        return isActive;
    }

    public void setIsActive(String isActive) {
        this.isActive = isActive;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
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
        if (!(object instanceof PermissionType)) {
            return false;
        }
        PermissionType other = (PermissionType) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "javaapplication1.PermissionType[ id=" + id + " ]";
    }
    
}

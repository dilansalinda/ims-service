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
@Table(name = "user_permission", catalog = "ims", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "UserPermission.findAll", query = "SELECT u FROM UserPermission u")
    , @NamedQuery(name = "UserPermission.findById", query = "SELECT u FROM UserPermission u WHERE u.id = :id")
    , @NamedQuery(name = "UserPermission.findByPermissionTypeId", query = "SELECT u FROM UserPermission u WHERE u.permissionTypeId = :permissionTypeId")
    , @NamedQuery(name = "UserPermission.findByUserId", query = "SELECT u FROM UserPermission u WHERE u.userId = :userId")})
public class UserPermission implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id", nullable = false)
    private Integer id;
    @Column(name = "permission_type_id")
    private Integer permissionTypeId;
    @Column(name = "user_id")
    private Integer userId;

    public UserPermission() {
    }

    public UserPermission(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getPermissionTypeId() {
        return permissionTypeId;
    }

    public void setPermissionTypeId(Integer permissionTypeId) {
        this.permissionTypeId = permissionTypeId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof UserPermission)) {
            return false;
        }
        UserPermission other = (UserPermission) object;
        return (this.id != null || other.id == null) && (this.id == null || this.id.equals(other.id));
    }

    @Override
    public String toString() {
        return "javaapplication1.UserPermission[ id=" + id + " ]";
    }
    
}

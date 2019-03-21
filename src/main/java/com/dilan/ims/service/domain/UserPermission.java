package com.dilan.ims.service.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

/**
 * User: Dilan Salinda
 * Date: 2019-03-20
 * Time: 07:08 AM
 */
@Entity
@Table(name = "user_permission")
@Getter
@Setter
public class UserPermission {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "user_id")
    private Integer userId;
    @Column(name = "permission_type_id")
    private Integer permissionTypeId;
}

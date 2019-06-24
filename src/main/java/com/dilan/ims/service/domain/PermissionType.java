package com.dilan.ims.service.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

/**
 * User: Dilan Salinda
 * Date: 2019-03-20
 * Time: 06:55 AM
 */
@Entity
@Table(name = "permission_type")
@Setter
@Getter
public class PermissionType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "type")
    private String type;
    @Column(name = "is_active")
    private String isActive;

    @OneToMany( targetEntity=UserPermission.class )
    private List userPermission;
}

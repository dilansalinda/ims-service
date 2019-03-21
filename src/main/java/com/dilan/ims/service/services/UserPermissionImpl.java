package com.dilan.ims.service.services;

import com.dilan.ims.service.domain.UserPermission;
import com.dilan.ims.service.repositories.UserPermissionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * User: Dilan Salinda
 * Date: 3/13/2019
 * Time: 11:01 AM
 */
@Service
public class UserPermissionImpl implements UserPermissionService {

    private UserPermissionRepository userPermissionRepository;

    @Autowired
    public UserPermissionImpl(UserPermissionRepository userPermissionRepository) {
        this.userPermissionRepository = userPermissionRepository;;
    }

    @Override
    public List<UserPermission> getAll() {
        List<UserPermission> userPermissions = new ArrayList<>();
        userPermissionRepository.findAll().forEach(userPermissions::add);
        return userPermissions;
    }

}

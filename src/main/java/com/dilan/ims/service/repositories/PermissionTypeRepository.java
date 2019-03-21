package com.dilan.ims.service.repositories;

import com.dilan.ims.service.domain.PermissionType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * User: Dilan Salinda
 * Date: 3/13/2019
 * Time: 10:58 AM
 */
@Repository
public interface PermissionTypeRepository extends JpaRepository<PermissionType, Integer> {

}

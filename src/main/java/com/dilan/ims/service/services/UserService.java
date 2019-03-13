package com.dilan.ims.service.services;

import com.dilan.ims.service.domain.cUser;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

/**
 * User: Dilan Salinda
 * Date: 3/13/2019
 * Time: 11:00 AM
 */
public interface UserService {

    List<cUser> getAll();

    cUser isUserExist(String user);

    cUser saveUser(cUser user);
}

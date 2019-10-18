package com.dilan.ims.service.services;

import com.dilan.ims.service.domain.User;

import java.util.List;

/**
 * User: Dilan Salinda
 * Date: 3/13/2019
 * Time: 11:00 AM
 */

public interface IUserService {

    List<User> getAll();

    User isUserExist(String user);

    User saveUser(User user);

    User userLogin(String userName, String password);
}

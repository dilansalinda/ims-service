package com.dilan.ims.service.services;

import com.dilan.ims.service.domain.cUser;
import com.dilan.ims.service.repositories.UserRepository;
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
public class UserServiceImpl implements UserService {

    private UserRepository userRepository;

    @Autowired
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;;
    }

    @Override
    public List<cUser> getAll() {
        List<cUser> users = new ArrayList<>();
        userRepository.findAll().forEach(users::add);
        return users;
    }

    @Override
    public cUser isUserExist(String user) {
        return userRepository.findByName(user);
    }

    @Override
    public cUser saveUser(cUser user) {
        return userRepository.save(user);
    }


}

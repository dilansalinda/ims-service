package com.dilan.ims.service.services;

import com.dilan.ims.service.domain.User;
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
    public List<User> getAll() {
        List<User> users = new ArrayList<>();
        userRepository.findAll().forEach(users::add);
        return users;
    }

    @Override
    public User isUserExist(String user) {
        return userRepository.findByName(user);
    }

    @Override
    public User saveUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public User userLogin(String username, String password) {
        try{
            User user = userRepository.findByNameAndPassword(username,password);
            if(user != null){
                return  user;
            }

        }catch (Exception e){
            e.printStackTrace();
        }
        return new User();
    }


}

package com.dilan.ims.service.services;

import com.dilan.ims.service.domain.User;
import com.dilan.ims.service.repositories.UserPermissionRepository;
import com.dilan.ims.service.repositories.UserRepository;
import com.dilan.ims.service.services.IUserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import static org.junit.Assert.assertTrue;

/**
 * User: Dilan Salinda
 * Date: 3/13/2019
 * Time: 11:01 AM
 */
public class UserServiceTest {

    @Test
    public void testGetAll() {
        User user = new User();
        assertTrue(Objects.isNull(user.getEmail()));
    }

}




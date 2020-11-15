package com.dilan.ims.service.services;

import com.dilan.ims.service.domain.User;
import com.dilan.ims.service.repositories.UserRepository;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Objects;

import static org.junit.Assert.assertEquals;
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

    @Test
    public void testIsUserExist() {
        User user = new User();
        user.setName("rukshan");
        assertEquals(null,user.getUsername());
    }

}




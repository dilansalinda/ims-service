package com.dilan.ims.service.repositories;

import com.dilan.ims.service.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

/**
 * User: Dilan Salinda
 * Date: 3/13/2019
 * Time: 10:58 AM
 */
@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

    @Query("select u from User u where u.name = ?1")
    User findByName(String Name);
}

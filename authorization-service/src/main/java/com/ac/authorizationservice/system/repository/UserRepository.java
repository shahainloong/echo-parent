package com.ac.authorizationservice.system.repository;

import com.ac.authorizationservice.system.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

/**
 * @author hailong.sha
 */
public interface UserRepository extends JpaRepository<User, Integer> {
    Optional<User> findByUsername(String username);

    @Transactional
    void deleteByUsername( String username);

//    @Query("select status from user where username= :username")
//    Optional<String> findUserStatusByName(@Param("username") String username);
}

package com.ac.authorizationservice.security.service;

import com.ac.authorizationservice.system.entity.User;
import com.ac.authorizationservice.system.service.UserService;
import com.ac.authorizationservice.security.entity.JwtUser;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;


/**
 * @author hailong.sha
 */
@Service
public class UserDetailsServiceImpl implements UserDetailsService {

    private final UserService userService;

    public UserDetailsServiceImpl(UserService userService) {
        this.userService = userService;
    }
    @Override
    public UserDetails loadUserByUsername(String name) throws UsernameNotFoundException {
        User user = userService.findUserByUserName(name);
        return new JwtUser(user);
    }

}

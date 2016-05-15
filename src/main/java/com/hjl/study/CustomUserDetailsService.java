package com.hjl.study;

import java.util.HashSet;
import java.util.Set;

import org.springframework.dao.DataAccessException;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

public class CustomUserDetailsService implements UserDetailsService
{
  public UserDetails loadUserByUsername(String username)
          throws UsernameNotFoundException, DataAccessException
    {
    System.out.println("username recieved :: " + username);
    
    //Get this user details from database and set its roles also here
    Set<GrantedAuthority> authorities = new HashSet<GrantedAuthority>();
    SimpleGrantedAuthority testRole = new SimpleGrantedAuthority("ROLE_USER");
    authorities.add(testRole);
    UserDetails user = new User(username, "password", true, true, true, true, authorities);
    return user;
    }
}
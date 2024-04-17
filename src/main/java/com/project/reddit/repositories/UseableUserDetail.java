package com.project.reddit.repositories;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

public interface UseableUserDetail {
    
    UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException; 
}

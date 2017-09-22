package com.jwt.starter.security.service;

import com.jwt.starter.security.api.JwtUser;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;

/**
 * Created by john on 17-2-20.
 */
@Service("jwtUserRulesService")
public class JwtUserRulesService {
    public final boolean ruleLegal(Authentication authentication, String rule){
        Object userDetails = authentication.getPrincipal();

        if (!(userDetails instanceof UserDetails)){
            return false;
        }

        if (userDetails instanceof JwtUser){
            if (((JwtUser) userDetails).getRules().contains(rule)){
                return true;
            }
        }

        return false;
    }
}

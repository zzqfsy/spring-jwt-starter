package com.jwt.starter.security.api;


import com.jwt.starter.service.core.domain.SAuthGroup;
import com.jwt.starter.service.core.domain.SMember;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public final class JwtUserFactory {

    private JwtUserFactory() {
    }

    public static JwtUser create(SMember user) {
        return new JwtUser(
            user.getId().longValue(),
            user.getUsername(),
            null, //user.getFirstname(),
            null, //user.getLastname(),
            user.getPassword(),
            null, //user.getEmail(),
            mapToGrantedAuthorities(user.getsAuthGroups()),
            mapToGrantedRules(user.getsAuthGroups()),
            user.getStatus().equals(1),
            user.getModifyTime()
        );
    }

    private static List<GrantedAuthority> mapToGrantedAuthorities(List<SAuthGroup> authorities) {
        return authorities.stream()
                          .map(authority -> new SimpleGrantedAuthority(authority.getModule()))
                          .collect(Collectors.toList());
    }

    private static List<String> mapToGrantedRules(List<SAuthGroup> authorities) {
        String rules = authorities.stream().map(SAuthGroup::getRules).reduce("", (a, b) -> a + "," + b);
        List<String> result = Arrays.asList(rules.split(","));
        //List<String> empty = Arrays.asList("");
        //result.removeAll(empty);
        return result;
    }
}

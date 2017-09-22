package com.jwt.starter.service.core;

import com.jwt.starter.service.core.domain.SMember;

public interface MemberService {
    SMember findByUsername(String username);
}

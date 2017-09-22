package com.jwt.starter.utils;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.security.NoSuchAlgorithmException;

/**
 * Created by john on 17-2-14.
 */
public class PHPMD5PasswordEncoder implements PasswordEncoder {
    private final Log logger = LogFactory.getLog(getClass());

    public PHPMD5PasswordEncoder() {
    }

    @Override
    public String encode(CharSequence rawPassword) {
        String result = null;
        try {
            result = PHPMD5Utils.md5(rawPassword.toString());
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }

        return result;
    }

    @Override
    public boolean matches(CharSequence rawPassword, String encodedPassword) {
        if (encodedPassword == null || encodedPassword.length() == 0) {
            logger.warn("Empty encoded password");
            return false;
        }

        return encodedPassword.equals(encode(rawPassword));
    }
}

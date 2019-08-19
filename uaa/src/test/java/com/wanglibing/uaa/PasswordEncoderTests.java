package com.wanglibing.uaa;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

/**
 * @author: iamwlb
 * @date: 2019-08-19 09:46
 */
public class PasswordEncoderTests {
    public static void main(String[] args) {
        System.out.println(new BCryptPasswordEncoder().encode("secret"));
    }
}

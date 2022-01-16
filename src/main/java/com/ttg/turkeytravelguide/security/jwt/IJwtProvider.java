package com.ttg.turkeytravelguide.security.jwt;

import com.ttg.turkeytravelguide.security.UserPrincipal;
import org.springframework.security.core.Authentication;

import javax.servlet.http.HttpServletRequest;

public interface IJwtProvider
{
    String generateToken(UserPrincipal auth);


    Authentication getAuthentication(HttpServletRequest request);

    boolean validateToken(HttpServletRequest request);
}

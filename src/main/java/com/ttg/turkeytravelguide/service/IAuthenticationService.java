package com.ttg.turkeytravelguide.service;


import com.ttg.turkeytravelguide.model.User;

public interface IAuthenticationService
{
    User signInAndReturnJWT(User signInRequest);
}

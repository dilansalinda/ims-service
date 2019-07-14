package com.dilan.ims.service.utils;

import org.springframework.stereotype.Component;

@Component
public class serviceAuthenticator {

    public static String serviceKey ="123";

    public static boolean authenticateAPICall(String key) {

        if (key.endsWith(serviceKey)){
            return true;
        }
        return false;
    }



}

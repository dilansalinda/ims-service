package com.dilan.ims.service.utils;

import org.springframework.stereotype.Component;

@Component
public class ServiceAuthenticator {

    private ServiceAuthenticator() {}

    public static final String SERVICE_KEY ="123";

    public static boolean authenticateAPICall(String key) {

        return key.endsWith(SERVICE_KEY);
    }



}

package com.dilan.ims.service.utils;

import org.apache.commons.codec.binary.Base64;

/**
 * User: Dilan Salinda
 * Date: 3/13/2019
 * Time: 11:38 AM
 */
public class encoder {

    public String encodeString(String inputString){
        String withSalt = "1dilan3"+inputString;
        Base64 base64 = new Base64();
        return new String(base64.encode(withSalt.getBytes()));
    }

}

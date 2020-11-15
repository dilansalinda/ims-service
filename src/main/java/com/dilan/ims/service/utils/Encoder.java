package com.dilan.ims.service.utils;

import org.apache.commons.codec.binary.Base64;
/**
 * User: Dilan Salinda
 * Date: 3/13/2019
 * Time: 11:38 AM
 */
public class Encoder {

    public static String encodeString(String inputString) {
        String withSalt = "1dilan3" + inputString + "ims";
        Base64 base64 = new Base64();
        return new String(base64.encode(withSalt.getBytes()));
    }

    public String decodeString(String inputString) {
        byte[] byteArray = Base64.decodeBase64(inputString.getBytes());
        String decodedString = new String(byteArray);
        String d=  decodedString.substring(7);
        return d.substring(0, d.length() - 3);
    }

}


package com.qqq.WXhongbao;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class rg_yqwbjjm {

    public rg_yqwbjjm ()  { }

    public static String rg_n71904 (String rg_n71905) {
        String reStr = null;
               try {
                   MessageDigest md5 = MessageDigest.getInstance("MD5");
                   byte[] bytes = md5.digest(rg_n71905.getBytes());
                   StringBuffer stringBuffer = new StringBuffer();
                   for (byte b : bytes){
                       int bt = b&0xff;
                       if (bt < 16){
                           stringBuffer.append(0);
                       }
                       stringBuffer.append(Integer.toHexString(bt));
                   }
                   reStr = stringBuffer.toString();
               } catch (NoSuchAlgorithmException e) {
                   e.printStackTrace();
               }
               return reStr;
    }
}

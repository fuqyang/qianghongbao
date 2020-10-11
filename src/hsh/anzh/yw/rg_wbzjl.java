
package hsh.anzh.yw;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.text.TextUtils;
import java.io.BufferedOutputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.StringBuilder;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class rg_wbzjl {

    public rg_wbzjl ()  { }

     public static Object ByteDObject(byte[] by)
    {
     Object obj = null;
     try {
      ByteArrayInputStream bi = new ByteArrayInputStream(by);
      ObjectInputStream oi = new ObjectInputStream(bi);
      obj = oi.readObject();
      bi.close();
      oi.close();
     } catch (Exception e) {
      e.printStackTrace();
     }
            return obj;
    }
     public static byte[] byteToArray(List<Byte> byteList){
      if(byteList != null && byteList.size() > 0){
       byte[] bytes = new byte[byteList.size()];
       for (int i = 0; i < byteList.size(); i++) {
        bytes[i] = byteList.get(i);
       }
       return bytes;
      }
      else{
       return null;
      }
     }
    public static List<byte[]> byteSplit(byte[] array, byte[] split){
            List<byte[]> newArray = new ArrayList<byte[]>();
            List<Byte> newByte = new ArrayList<Byte>();
            boolean bol;
            for (byte b : array) {
      }
            for (byte b : split) {
      }
            for (int i = 0; i < array.length; i++) {
             bol = false;
             if(i < array.length + 1 - split.length){
              bol = true;
              for (int j = 0; j < split.length; j++) {
               if(array[i + j] != split[j]){
                bol = false;
                break;
               }
        }
             }
             if(bol){
              if(newByte.size() > 0){
               newArray.add(byteToArray(newByte));
              }
                 newByte = new ArrayList<Byte>();
                 i += split.length - 1;
             }
             else{
              newByte.add(array[i]);
             }
      }
            if(newByte.size() > 0){
       newArray.add(byteToArray(newByte));
      }
            return newArray;
     }

    public static boolean rg_n58868 (String rg_n58869, String rg_n58870) {
        android.content.SharedPreferences.Editor rg_n58871;
        rg_n58871 = hsh.anzh.jb.rg_chxpzhb.rg_n13243 (hsh.anzh.jb.rg_yychx.rg_n2555 ("volapp", true), false);
        rg_n58871.putString (rg_n58869, rg_n58870);
        return (rg_n58871.commit ());
    }
}

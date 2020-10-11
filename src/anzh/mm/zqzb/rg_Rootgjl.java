
package anzh.mm.zqzb;

public class rg_Rootgjl {

    public rg_Rootgjl ()  { }

     static Process process;
     static java.io.DataInputStream inputStream;
     static java.io.DataOutputStream  outputStream;
     static java.io.BufferedReader reader;

    public static int rg_n62420 (String rg_n62421) {
          int i = -1;
            try {
              Process process = Runtime.getRuntime().exec("su");
              outputStream = new java.io.DataOutputStream(process.getOutputStream());
              outputStream.writeBytes(rg_n62421 + "\n");
              outputStream.flush();
              outputStream.writeBytes("exit\n");
              outputStream.flush();
              process.waitFor();
              i = process.exitValue();
            } catch (Exception e) {
              e.printStackTrace();
            } finally {
              if (outputStream != null) {
                try {
                  outputStream.close();
                } catch (java.io.IOException e2) {
                  e2.printStackTrace();
                }
              }
            }
            return i;
    }
}

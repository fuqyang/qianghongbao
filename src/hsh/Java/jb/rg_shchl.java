
package hsh.Java.jb;

public class rg_shchl {

    public static void rg_n50941 (java.io.OutputStream rg_n50942) {
        try {
            rg_n50942.close ();
        } catch (Exception e) { }
    }

    public static boolean rg_n50946 (java.io.OutputStream rg_n50947, byte [] rg_n50948, int rg_n50949, int rg_n50950, rg_zhtl rg_n50951) {
        if (rg_n50951 == null || rg_n50951.rg_n51251 () == false) {
           try {
               rg_n50947.write (rg_n50948, rg_n50949, rg_n50950);
               return true;
           } catch (Exception e) {
               if (rg_n50951 != null)
                   rg_n50951.rg_n51248 (rg_zhtl.rg_n51242);
           }
        }
        return false;
    }
}

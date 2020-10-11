
package hsh.Java.jb;

public class rg_shrl {

    public static void rg_n50820 (java.io.InputStream rg_n50821) {
        try {
            rg_n50821.close ();
        } catch (Exception e) { }
    }

    public static int rg_n50822 (java.io.InputStream rg_n50823, byte [] rg_n50824, int rg_n50825, int rg_n50826, rg_zhtl rg_n50827) {
        if (rg_n50827 == null || rg_n50827.rg_n51251 () == false) {
           try {
               return rg_n50823.read (rg_n50824, rg_n50825, rg_n50826);
           } catch (Exception e) {
               if (rg_n50827 != null)
                   rg_n50827.rg_n51248 (rg_zhtl.rg_n51242);
           }
        }
        return -1;
    }

    public static int rg_n50828 (java.io.InputStream rg_n50829, byte [] rg_n50830, rg_zhtl rg_n50831) {
        return (rg_n50822 (rg_n50829, rg_n50830, 0, rg_n50830.length, rg_n50831));
    }
}

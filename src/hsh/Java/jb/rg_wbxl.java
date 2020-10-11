
package hsh.Java.jb;

public final class rg_wbxl {

    public static boolean rg_n52576 (String rg_n52577) {
        return (rg_n52577 == null || rg_n52577.isEmpty ());
    }

    public static String rg_n52578 (byte [] rg_n52579) {
        try {
            return new String (rg_n52579);
        } catch (Exception e) {
            return "";
        }
    }

    public static String rg_n52584 (byte [] rg_n52585, String rg_n52586) {
        try {
            return new String (rg_n52585, rg_n52586);
        } catch (Exception e) {
            return "";
        }
    }

    public static boolean rg_n52611 (String rg_n52612, String rg_n52613, boolean rg_n52614) {
        return (rg_n52614 ? rg_n52612.equalsIgnoreCase (rg_n52613) :  rg_n52612.equals (rg_n52613));
    }

    public static byte [] rg_n52636 (String rg_n52637, String rg_n52638) {
         try {
             return rg_n52637.getBytes (rg_n52638);
         } catch (Exception e) {
             return null;
         }
    }

    public static String rg_n52694 (String rg_n52695, int rg_n52696, int rg_n52697) {
        if (rg_n52697 < 0)
            return rg_n52695.substring (rg_n52696);
        else
            return rg_n52695.substring (rg_n52696, rg_n52696 + rg_n52697);
    }

    public static String rg_n52705 (String rg_n52706, int rg_n52707) {
        final int nLength = rg_n52706.length ();
        return rg_n52706.substring (nLength - rg_n52707, nLength);
    }
}


package hsh.Java.jb;

public class rg_HTTPljl {

    public static final int rg_n51629 = 200;
    public static final int rg_n51643 = 301;
    public static final int rg_n51644 = 302;

    public static void rg_n51668 (java.net.HttpURLConnection rg_n51669, boolean rg_n51670) {
        rg_n51669.setInstanceFollowRedirects(rg_n51670);
    }

    public static void rg_n51673 (java.net.HttpURLConnection rg_n51674, String rg_n51675) {
        try {
            rg_n51674.setRequestMethod(rg_n51675);
        } catch (Exception e) { }
    }

    public static int rg_n51676 (java.net.HttpURLConnection rg_n51677) {
        try {
            return rg_n51677.getResponseCode();
        } catch (Exception e) {
            return -1;
        }
    }
}

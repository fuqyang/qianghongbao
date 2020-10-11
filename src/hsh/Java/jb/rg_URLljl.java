
package hsh.Java.jb;

public class rg_URLljl {

    public static void rg_n51510 (java.net.URLConnection rg_n51511, int rg_n51512) {
        try {
            rg_n51511.setConnectTimeout(rg_n51512);
        } catch (Exception e) { }
    }

    public static void rg_n51537 (java.net.URLConnection rg_n51538, boolean rg_n51539) {
        try {
            rg_n51538.setDoInput(rg_n51539);
        } catch (Exception e) { }
    }

    public static void rg_n51542 (java.net.URLConnection rg_n51543, boolean rg_n51544) {
        try {
            rg_n51543.setDoOutput(rg_n51544);
        } catch (Exception e) { }
    }

    public static java.io.InputStream rg_n51552 (java.net.URLConnection rg_n51553) {
        try {
            return rg_n51553.getInputStream();
        } catch (Exception e) {
            return null;
        }
    }

    public static java.io.OutputStream rg_n51554 (java.net.URLConnection rg_n51555) {
        try {
            return rg_n51555.getOutputStream();
        } catch (Exception e) {
            return null;
        }
    }

    public static java.util.Map<String, java.util.List<String>> rg_n51558 (java.net.URLConnection rg_n51559) {
        return rg_n51559.getHeaderFields();
    }

    public static void rg_n51593 (java.net.URLConnection rg_n51594, String rg_n51595, String rg_n51596) {
        try {
            rg_n51594.addRequestProperty(rg_n51595, rg_n51596);
        } catch (Exception e) { }
    }

    public static void rg_n51601 (java.net.URLConnection rg_n51602) {
        try {
            rg_n51602.connect();
        } catch (Exception e) { }
    }
}

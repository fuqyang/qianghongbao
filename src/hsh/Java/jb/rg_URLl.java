
package hsh.Java.jb;

public final class rg_URLl {

    public static java.net.URL rg_n51481 (String rg_n51482) {
        try {
            return new java.net.URL(rg_n51482);
        } catch (Exception e) {
            return null;
        }
    }

    public static java.net.URLConnection rg_n51486 (java.net.URL rg_n51487) {
        try {
            return rg_n51487.openConnection();
        } catch (Exception e) {
            return null;
        }
    }

    public static java.net.URLConnection rg_n51488 (java.net.URL rg_n51489, java.net.Proxy rg_n51490) {
        try {
            return rg_n51489.openConnection(rg_n51490);
        } catch (Exception e) {
            return null;
        }
    }
}

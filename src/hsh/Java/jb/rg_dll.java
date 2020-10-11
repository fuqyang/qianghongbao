
package hsh.Java.jb;

public class rg_dll {

    public static final int rg_n51492 = 1;

    public static java.net.Proxy rg_n51494 (int rg_n51495, java.net.InetSocketAddress rg_n51496) {
        java.net.Proxy.Type type;
        if (rg_n51495 == 2){
            type = java.net.Proxy.Type.SOCKS;
        }else if(rg_n51495 == 1){
            type = java.net.Proxy.Type.HTTP;
        }else{
            type = java.net.Proxy.Type.DIRECT;
        }
        try {
            return new java.net.Proxy(type, rg_n51496);
        } catch (Exception e) {
            return null;
        }
    }
}

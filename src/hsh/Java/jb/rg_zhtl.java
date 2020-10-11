
package hsh.Java.jb;

public class rg_zhtl {

    public rg_zhtl ()  { }

    public static final int rg_n51241 = 0;
    public static final int rg_n51242 = -1;
    public static final int rg_n51243 = -100;
    protected int rg_n51245;

    public synchronized boolean rg_n51248 (int rg_n51249) {
        rg_n51245 = rg_n51249;
        return (rg_n51250 ());
    }

    public synchronized boolean rg_n51250 () {
        return (rg_n51245 >= 0);
    }

    public synchronized boolean rg_n51251 () {
        return (rg_n51245 < 0);
    }
}

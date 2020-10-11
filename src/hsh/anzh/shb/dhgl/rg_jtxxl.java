
package hsh.anzh.shb.dhgl;

public class rg_jtxxl {

    public rg_jtxxl ()  { }

    public static String rg_n26329 () {
        String rg_n26330 = "";
        try
        {
            java.lang.Class rg_n26331;
            rg_n26331 = java.lang.Class.forName("android.os.SystemProperties");
            java.lang.reflect.Method rg_n26332;
            rg_n26332 = rg_n26331.getMethod("get", String.class);
            rg_n26330 = hsh.Java.jb.rg_dxl.rg_n50032 (rg_n26332.invoke(rg_n26331, "ro.serialno"));
        }
        catch (Exception e_catched)
        {
        }
        return (rg_n26330);
    }

    public static String rg_n26340 (android.content.Context rg_n26341) {
        return android.provider.Settings.System.getString(rg_n26341.getContentResolver(), android.provider.Settings.Secure.ANDROID_ID);
    }
}

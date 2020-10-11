
package hsh.anzh.jb;

public class rg_yyanzhl {

    public rg_yyanzhl ()  { }

    public static void rg_n2570 (android.app.Activity rg_n2571, java.io.File rg_n2572) {
        if (android.os.Build.VERSION.SDK_INT >= 24)
        {
            android.net.Uri rg_n2573;
            rg_n2573 = rg_zybshfl.rg_n9779 (rg_n2571, rg_n2572);
            rg_n2577 (rg_n2571, rg_n2573);
        }
        else
        {
            rg_n2574 (rg_n2571, rg_n2572);
        }
    }

    public static void rg_n2574 (android.app.Activity rg_n2575, java.io.File rg_n2576) {
        android.content.Intent intentInstall = new android.content.Intent(android.content.Intent.ACTION_VIEW);
        intentInstall.setDataAndType(android.net.Uri.fromFile(rg_n2576), "application/vnd.android.package-archive");
        intentInstall.setFlags(android.content.Intent.FLAG_ACTIVITY_NEW_TASK);
        rg_n2575.startActivity(intentInstall);
    }

    public static void rg_n2577 (android.app.Activity rg_n2578, android.net.Uri rg_n2579) {
        android.content.Intent intentInstall = new android.content.Intent(android.content.Intent.ACTION_VIEW);
        intentInstall.setFlags(android.content.Intent.FLAG_GRANT_READ_URI_PERMISSION);
        intentInstall.setDataAndType(rg_n2579, "application/vnd.android.package-archive");
        rg_n2578.startActivity(intentInstall);
    }
}

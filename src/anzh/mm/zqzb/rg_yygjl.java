
package anzh.mm.zqzb;

public class rg_yygjl {

    public rg_yygjl ()  { }

    private static android.content.pm.Signature[] getAppSignature(final String packageName) {
        try {
            android.content.pm.PackageManager pm = hsh.anzh.jb.rg_yychx.sGetApp ().getPackageManager();
            android.content.pm.PackageInfo pi = pm.getPackageInfo(packageName, android.content.pm.PackageManager.GET_SIGNATURES);
            return pi == null ? null : pi.signatures;
        } catch (android.content.pm.PackageManager.NameNotFoundException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static boolean rg_n61862 (android.content.Context rg_n61863, String rg_n61864) {
        try
        {
            android.content.pm.PackageInfo rg_n61865;
            rg_n61865 = (rg_n61863.getPackageManager ().getPackageInfo(rg_n61864, 0));
            if (rg_n61865 == null)
            {
                return (false);
            }
            else
            {
                return (true);
            }
        }
        catch (Exception e_catched)
        {
            return (false);
        }
    }
}


package hsh.anzh.jb;

public class rg_yhshqxgjl {

    public rg_yhshqxgjl ()  { }

    public com.voldp.runtimepermission.VolPermission.Builder builder = com.voldp.runtimepermission.VolPermission.with(rg_yychx.sGetApp ()).setPermissionListener(new com.voldp.runtimepermission.PermissionListener(){
        @Override
        public void onPermissionGranted() {
            rg_n46880();
        }
        @Override
        public void onPermissionDenied(java.util.List<String> deniedPermissions) {
            rg_n46881(deniedPermissions);
        }
        @Override public void showWindowPermissionDenyDialog() {}
    });

    public void rg_n46864 (boolean rg_n46865, boolean rg_n46866, boolean rg_n46867, String rg_n46868, String rg_n46869, String rg_n46870, String rg_n46871, String rg_n46872, String rg_n46873, boolean rg_n46874, String rg_n46875, boolean rg_n46876) {
        this.builder.setPermissions(rg_n46879 ());
        if (rg_n46865)
        {
            builder.setRationaleMessage(rg_n46868);
            builder.setRationaleTitle(rg_n46869);
            builder.setRationaleConfirmText(rg_n46870);
        }
        if (rg_n46866)
        {
            builder.setDeniedMessage(rg_n46871);
            builder.setDeniedTitle(rg_n46872);
            builder.setDeniedCloseButtonText(rg_n46873);
            if (rg_n46874)
            {
                builder.setGotoSettingButton(true);
                builder.setGotoSettingButtonText(rg_n46875);
            }
            else
            {
                builder.setGotoSettingButton(false);
            }
        }
        builder.setDeniedExitApp(rg_n46867);
        this.builder.setScreenOrientation(rg_n46876 ? android.content.pm.ActivityInfo.SCREEN_ORIENTATION_PORTRAIT : android.content.pm.ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE).check();
    }

    public String [] rg_n46879 () {
        try
        {
            return rg_yychx.sGetApp ().getPackageManager().getPackageInfo(rg_yychx.sGetApp ().getPackageName(), 0x00001000).requestedPermissions;
        }
        catch (Exception e_catched)
        {
            return (null);
        }
    }

    public static interface re_n46880 { int dispatch (rg_yhshqxgjl objSource, int nTagNumber); }
    private re_n46880 rd_n46880;
    private int rd_n46880_tag;
    public void rl_yhshqxgjl_n46880 (re_n46880 objListener, int nTagNumber) {
        synchronized (this) { rd_n46880 = objListener;  rd_n46880_tag = nTagNumber; }
    }
    public int rg_n46880 () {
        re_n46880 objDispatcher;  int nTagNumber;
        synchronized (this) { objDispatcher = rd_n46880;  nTagNumber = rd_n46880_tag; }
        return (objDispatcher != null ? objDispatcher.dispatch (this, nTagNumber) : 0);
    }

    public static interface re_n46881 { int dispatch (rg_yhshqxgjl objSource, int nTagNumber, java.util.List<String> rg_n46882); }
    private re_n46881 rd_n46881;
    private int rd_n46881_tag;
    public void rl_yhshqxgjl_n46881 (re_n46881 objListener, int nTagNumber) {
        synchronized (this) { rd_n46881 = objListener;  rd_n46881_tag = nTagNumber; }
    }
    public int rg_n46881 (java.util.List<String> rg_n46882) {
        re_n46881 objDispatcher;  int nTagNumber;
        synchronized (this) { objDispatcher = rd_n46881;  nTagNumber = rd_n46881_tag; }
        return (objDispatcher != null ? objDispatcher.dispatch (this, nTagNumber, rg_n46882) : 0);
    }
}

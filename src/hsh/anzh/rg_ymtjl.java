
package hsh.anzh;

public class rg_ymtjl {

    public rg_ymtjl ()  { }

    public static void rg_n48112 (final String rg_n48113, final String rg_n48114, final boolean rg_n48115) {
        if (hsh.anzh.jb.rg_yychx.sIsUiThread ()) {
            try {
                com.umeng.commonsdk.UMConfigure.init(hsh.anzh.jb.rg_yychx.sGetApp (), rg_n48113, rg_n48114, 1, null);
            } catch (Exception e) { }
        } else {
            hsh.anzh.jb.rg_yychx.sRunOnUiThread (new Runnable () {
                @Override public void run () {
                    try {
                        com.umeng.commonsdk.UMConfigure.init(hsh.anzh.jb.rg_yychx.sGetApp (), rg_n48113, rg_n48114, 1, null);
                    } catch (Exception e) { }
                } } );
        }
        if (rg_n48115)
        {
            com.umeng.analytics.MobclickAgent.setPageCollectionMode(com.umeng.analytics.MobclickAgent.PageMode.AUTO);
        }
        else
        {
            com.umeng.analytics.MobclickAgent.setPageCollectionMode(com.umeng.analytics.MobclickAgent.PageMode.MANUAL);
        }
    }
}

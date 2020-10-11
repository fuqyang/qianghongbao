
package hsh.anzh.jb;

public class rg_yychx extends android.app.Application {

    protected java.util.HashMap<String, java.lang.Object> rg_n2509 = new java.util.HashMap<String, java.lang.Object> ();
    private static rg_yychx ms_objApp;
    protected rg_qjshjcchql rg_n2568 = new rg_qjshjcchql ();
    protected rg_UIdzzhhql rg_n2569 = new rg_UIdzzhhql ();
    public void onCreate () {
        super.onCreate ();
        sPermitDiskAndNetworkOperInsideUIThread ();
        ms_objApp = this;
        rg_n2569.init ();
        rg_n2510 ();
    }
    public static void sPermitDiskAndNetworkOperInsideUIThread () {
        android.os.StrictMode.setThreadPolicy (new android.os.StrictMode.ThreadPolicy.Builder ().permitAll ().build ());
    }
    public static void sRunOnUiThread (Runnable action) {
        ms_objApp.rg_n2569.RunOnUiThread (action);
    }
    public static rg_yychx sGetApp () {
        return ms_objApp;
    }
    public static rg_qjshjcchql sGetGlobalDataCache () {
        return ms_objApp.rg_n2568;
    }
    public static boolean sIsUiThread () {
        return ms_objApp.rg_n2569.IsUiThread ();
    }
    private void CleanupGlobalData () {
        rg_n2511 ();
        rg_n2509.clear ();
        rg_n2568.Cleanup ();
    }
    private int m_nStartupState = 0;
    private static int ms_nStartupState = 0;
    public static void sOnStartupClassEnter () {
        ms_objApp.m_nStartupState = ms_nStartupState = 1;
        ms_objApp.CleanupGlobalData ();
    }
    public static boolean sCheckRestart (android.content.Context context) {
        if (ms_objApp.m_nStartupState == 1 && ms_nStartupState == 1)
            return true;
        Class<?> clsStartup = com.qqq.WXhongbao.rg_qdl.class;
        if (android.app.Activity.class.isAssignableFrom (clsStartup)) {
            try {
                android.content.Intent intent = new android.content.Intent (context, clsStartup);
                intent.addFlags (android.content.Intent.FLAG_ACTIVITY_CLEAR_TOP |
                        android.content.Intent.FLAG_ACTIVITY_CLEAR_TASK |
                        android.content.Intent.FLAG_ACTIVITY_NEW_TASK);
                context.startActivity (intent);
            } catch (Exception e) { }
        }
        return false;
    }
    public static void sForceRestart () {
        ms_objApp.m_nStartupState = ms_nStartupState = -1;
    }
    private static final String cs_strServiceStartUserData = "@service_start_user_data";
    public static int sGetServiceStartUserData (android.content.Intent objIntent) {
        return objIntent.getIntExtra (cs_strServiceStartUserData, 0);
    }
    public static final String cs_strServiceStartParams = "@service_start_params";
    public static boolean sMyStartService (Class clsService, android.os.Bundle bundle, Object... params) {
        rg_qjshjcchql objCache = sGetGlobalDataCache ();
        int nParamDataIdentifier = 0;
        try {
            android.content.Intent objIntent = new android.content.Intent (ms_objApp, clsService);
            if (bundle != null)
                objIntent.putExtras (bundle);
            if (params != null && params.length > 0) {
                nParamDataIdentifier = objCache.Push (params);
                objIntent.putExtra (cs_strServiceStartParams, nParamDataIdentifier);
            }
            if (ms_objApp.startService (objIntent) != null)
                return true;
        } catch (Exception e) { }
        objCache.Remove (nParamDataIdentifier);
        return false;
    }
    public static boolean sMyStopService (Class clsService) {
        android.content.Intent objIntent = new android.content.Intent (ms_objApp, clsService);
        try {
            return ms_objApp.stopService (objIntent);
        } catch (Exception e) {
            return false;
        }
    }

    public void rg_n2510 () {
    }

    public void rg_n2511 () {
    }

    public static rg_yychx rg_n2541 () {
        return ms_objApp;
    }

    public static void rg_n2542 (final String rg_n2543, final boolean rg_n2544) {
        if (rg_yychx.sIsUiThread ()) {
            try {
                android.widget.Toast.makeText (ms_objApp, rg_n2543,
                    (rg_n2544 ? android.widget.Toast.LENGTH_LONG : android.widget.Toast.LENGTH_SHORT)).show ();
            } catch (Exception e) { }
        } else {
            rg_yychx.sRunOnUiThread (new Runnable () {
                @Override public void run () {
                    try {
                        android.widget.Toast.makeText (ms_objApp, rg_n2543,
                                (rg_n2544 ? android.widget.Toast.LENGTH_LONG : android.widget.Toast.LENGTH_SHORT)).show ();
                    } catch (Exception e) { }
                } } );
        }
    }

    public static android.content.res.Resources rg_n2553 () {
        return ms_objApp.getResources ();
    }

    public static android.content.SharedPreferences rg_n2555 (String rg_n2556, boolean rg_n2557) {
        return ms_objApp.getSharedPreferences (rg_n2556,
            (rg_n2557 ? (android.content.Context.MODE_APPEND | android.content.Context.MODE_PRIVATE) : android.content.Context.MODE_PRIVATE));
    }
}

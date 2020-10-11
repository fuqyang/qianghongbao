
package hsh.anzh.jb;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.*;

public class AndComActivity {

    private static final int rg_n4832 = com.qqq.WXhongbao.R.string.rg_n4832;
    private static final int rg_n4836 = com.qqq.WXhongbao.R.drawable.info_icon;
    private static final int rg_n4837 = com.qqq.WXhongbao.R.string.rg_n4837;
    public static final int rg_n4934 = android.R.attr.colorForeground;
    public static final int rg_n4936 = android.R.attr.colorBackground;
    private static final String cs_strActivityLoadParams = "@activity_params";
    public static void sStartNewActivity (final android.content.Context context, final Class clsActivity,
            final android.os.Bundle bundle, final int nRequestCode, final int nAddFlags, final Object... params) {
        if (rg_yychx.sIsUiThread ()) {
            try {
                _sStartNewActivity (context, clsActivity, bundle, nRequestCode, nAddFlags,  params);
            } catch (Exception e) { }
        } else {
            rg_yychx.sRunOnUiThread (new Runnable () {
                @Override public void run () {
                    try {
                        _sStartNewActivity (context, clsActivity, bundle, nRequestCode, nAddFlags,  params);
                    } catch (Exception e) { }
                } } );
        }
    }
    public static boolean _sStartNewActivity (android.content.Context context, Class clsActivity,
            android.os.Bundle bundle, int nRequestCode, int nAddFlags, Object... params) {
        rg_qjshjcchql objCache = rg_yychx.sGetGlobalDataCache ();
        int nParamDataIdentifier = 0;
        try {
            android.content.Intent objIntent = new android.content.Intent (context, clsActivity);
            if (nAddFlags != 0)
                objIntent.addFlags (nAddFlags);
            if (bundle != null)
                objIntent.putExtras (bundle);
            if (params != null && params.length > 0) {
                nParamDataIdentifier = objCache.Push (params);
                objIntent.putExtra (cs_strActivityLoadParams, nParamDataIdentifier);
            }
            if (nRequestCode != 0 && context instanceof android.app.Activity)
                ((android.app.Activity)context).startActivityForResult (objIntent, nRequestCode);
            else
                context.startActivity (objIntent);
            return true;
        } catch (Exception e) { }
        objCache.Remove (nParamDataIdentifier);
        return false;
    }

    public static void rg_n4827 (final android.app.Activity rg_n4828, int rg_n4829, final String rg_n4830, final String rg_n4831) {
        final android.graphics.drawable.Drawable objDrawable = rg_zyglq.rg_n11901 (rg_n4829);
        if (rg_yychx.sIsUiThread ()) {
            try {
                new android.app.AlertDialog.Builder (rg_n4828).
                       setIcon (objDrawable).setPositiveButton (rg_n4832, null).
                       setTitle (rg_n4831).setMessage (rg_n4830).show ();
            } catch (Exception e) { }
        } else {
            rg_yychx.sRunOnUiThread (new Runnable () {
                @Override public void run () {
                    try {
                        new android.app.AlertDialog.Builder (rg_n4828).
                                   setIcon (objDrawable).setPositiveButton (rg_n4832, null).
                                   setTitle (rg_n4831).setMessage (rg_n4830).show ();
                    } catch (Exception e) { }
                } } );
        }
    }

    public static void rg_n4833 (final android.app.Activity rg_n4834, final String rg_n4835) {
        AndComActivity.rg_n4827 (rg_n4834, rg_n4836, rg_n4835, rg_zyglq.rg_n11898 (rg_n4837, ""));
    }

    public static boolean rg_n4929 (android.app.Activity rg_n4930, String rg_n4931) {
        android.content.Intent intent = rg_n4930.getPackageManager().getLaunchIntentForPackage(rg_n4931);
        intent.setFlags(android.content.Intent.FLAG_ACTIVITY_NEW_TASK|android.content.Intent.FLAG_ACTIVITY_RESET_TASK_IF_NEEDED | android.content.Intent.FLAG_ACTIVITY_CLEAR_TOP) ;
        try
        {
            rg_n4930.startActivity(intent);
            return (true);
        }
        catch (Exception e_catched)
        {
            return (false);
        }
    }
}

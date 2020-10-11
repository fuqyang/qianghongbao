
package hsh.anzh.jb;

import android.view.ViewGroup;

public class rg_dhkl extends hsh.Java.jb.rg_bjl implements android.content.DialogInterface.OnShowListener,
android.content.DialogInterface.OnDismissListener,
android.content.DialogInterface.OnCancelListener {

    public rg_dhkl ()  { }

    public android.app.Dialog m_dlg;
    public rg_dhkl (android.app.Dialog dlg) {
        init (dlg);
    }
    void init (android.app.Dialog dlg) {
        m_dlg = dlg;
        m_dlg.setOnShowListener (this);
        m_dlg.setOnDismissListener (this);
        m_dlg.setOnCancelListener (this);
    }
    @Override public void onShow (android.content.DialogInterface dialog) { rg_n7410 (); }
    @Override public void onDismiss (android.content.DialogInterface dialog) { rg_n7412 (); }
    @Override public void onCancel (android.content.DialogInterface dialog) { rg_n7411 (); }

    public void rg_n7350 (final String rg_n7351) {
        if (rg_yychx.sIsUiThread ()) {
            try {
                m_dlg.setTitle (rg_n7351);
            } catch (Exception e) { }
        } else {
            rg_yychx.sRunOnUiThread (new Runnable () {
                @Override public void run () {
                    try {
                        m_dlg.setTitle (rg_n7351);
                    } catch (Exception e) { }
                } } );
        }
    }

    public void rg_n7352 (boolean rg_n7353) {
        m_dlg.setCanceledOnTouchOutside (rg_n7353);
    }

    public void rg_n7354 (boolean rg_n7355) {
        m_dlg.setCancelable (rg_n7355);
    }

    public void rg_n7373 () {
        if (rg_yychx.sIsUiThread ()) {
            try {
                m_dlg.show ();
            } catch (Exception e) { }
        } else {
            rg_yychx.sRunOnUiThread (new Runnable () {
                @Override public void run () {
                    try {
                        m_dlg.show ();
                    } catch (Exception e) { }
                } } );
        }
    }

    public void rg_n7376 () {
        if (rg_yychx.sIsUiThread ()) {
            try {
                m_dlg.dismiss ();
            } catch (Exception e) { }
        } else {
            rg_yychx.sRunOnUiThread (new Runnable () {
                @Override public void run () {
                    try {
                        m_dlg.dismiss ();
                    } catch (Exception e) { }
                } } );
        }
    }

    public AndroidView rg_n7383 (int rg_n7384) {
        return AndroidView.sSafeGetVolView (m_dlg.findViewById (rg_n7384));
    }

    public void rg_n7387 (final int rg_n7388) {
        if (rg_yychx.sIsUiThread ()) {
            try {
                m_dlg.getWindow ().getDecorView ().setBackgroundColor (rg_n7388);
            } catch (Exception e) { }
        } else {
            rg_yychx.sRunOnUiThread (new Runnable () {
                @Override public void run () {
                    try {
                        m_dlg.getWindow ().getDecorView ().setBackgroundColor (rg_n7388);
                    } catch (Exception e) { }
                } } );
        }
    }

    public void rg_n7402 (final int rg_n7403, final int rg_n7404) {
        if (rg_yychx.sIsUiThread ()) {
            try {
                android.view.WindowManager.LayoutParams params = m_dlg.getWindow().getAttributes();
                if (params != null) {
                    params.width = rg_n7403;
                    params.height = rg_n7404;
                    m_dlg.getWindow().setAttributes (params);
                };
            } catch (Exception e) { }
        } else {
            rg_yychx.sRunOnUiThread (new Runnable () {
                @Override public void run () {
                    try {
                        android.view.WindowManager.LayoutParams params = m_dlg.getWindow().getAttributes();
                            if (params != null) {
                                params.width = rg_n7403;
                                params.height = rg_n7404;
                                m_dlg.getWindow().setAttributes (params);
                            };
                    } catch (Exception e) { }
                } } );
        }
    }

    public static interface re_n7410 { int dispatch (rg_dhkl objSource, int nTagNumber); }
    private re_n7410 rd_n7410;
    private int rd_n7410_tag;
    public void rl_dhkl_n7410 (re_n7410 objListener, int nTagNumber) {
        synchronized (this) { rd_n7410 = objListener;  rd_n7410_tag = nTagNumber; }
    }
    public int rg_n7410 () {
        re_n7410 objDispatcher;  int nTagNumber;
        synchronized (this) { objDispatcher = rd_n7410;  nTagNumber = rd_n7410_tag; }
        return (objDispatcher != null ? objDispatcher.dispatch (this, nTagNumber) : 0);
    }

    public static interface re_n7411 { int dispatch (rg_dhkl objSource, int nTagNumber); }
    private re_n7411 rd_n7411;
    private int rd_n7411_tag;
    public void rl_dhkl_n7411 (re_n7411 objListener, int nTagNumber) {
        synchronized (this) { rd_n7411 = objListener;  rd_n7411_tag = nTagNumber; }
    }
    public int rg_n7411 () {
        re_n7411 objDispatcher;  int nTagNumber;
        synchronized (this) { objDispatcher = rd_n7411;  nTagNumber = rd_n7411_tag; }
        return (objDispatcher != null ? objDispatcher.dispatch (this, nTagNumber) : 0);
    }

    public static interface re_n7412 { int dispatch (rg_dhkl objSource, int nTagNumber); }
    private re_n7412 rd_n7412;
    private int rd_n7412_tag;
    public void rl_dhkl_n7412 (re_n7412 objListener, int nTagNumber) {
        synchronized (this) { rd_n7412 = objListener;  rd_n7412_tag = nTagNumber; }
    }
    public int rg_n7412 () {
        re_n7412 objDispatcher;  int nTagNumber;
        synchronized (this) { objDispatcher = rd_n7412;  nTagNumber = rd_n7412_tag; }
        return (objDispatcher != null ? objDispatcher.dispatch (this, nTagNumber) : 0);
    }
}

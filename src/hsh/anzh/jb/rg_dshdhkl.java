
package hsh.anzh.jb;

import android.app.AlertDialog;
import android.view.ViewGroup;

public class rg_dshdhkl extends rg_dhkl implements 
     android.content.DialogInterface.OnClickListener,
     android.content.DialogInterface.OnMultiChoiceClickListener {

    public rg_dshdhkl ()  { }

    rg_dshdhkl (android.app.Dialog dlg) { super (dlg); }
    @Override public void onClick (android.content.DialogInterface dialog, int which, boolean isChecked) { rg_n7448 (which, isChecked); }
    @Override public void onClick (android.content.DialogInterface dialog, int which) { rg_n7451 (which); }

    public static rg_dshdhkl rg_n7416 (android.app.Activity rg_n7417) {
        return new rg_dshdhkl (new AlertDialog.Builder (rg_n7417).create ());
    }

    public void rg_n7431 (final String rg_n7432) {
        if (rg_yychx.sIsUiThread ()) {
            try {
                ((android.app.AlertDialog) m_dlg).setMessage (rg_n7432);
            } catch (Exception e) { }
        } else {
            rg_yychx.sRunOnUiThread (new Runnable () {
                @Override public void run () {
                    try {
                        ((android.app.AlertDialog) m_dlg).setMessage (rg_n7432);
                    } catch (Exception e) { }
                } } );
        }
    }

    public void rg_n7438 (final AndroidView rg_n7439, final int rg_n7440, final int rg_n7441, final int rg_n7442, final int rg_n7443) {
        if (rg_yychx.sIsUiThread ()) {
            try {
                ((android.app.AlertDialog) m_dlg).setView (rg_n7439.GetView(), rg_n7440, rg_n7441, rg_n7442, rg_n7443);
            } catch (Exception e) { }
        } else {
            rg_yychx.sRunOnUiThread (new Runnable () {
                @Override public void run () {
                    try {
                        ((android.app.AlertDialog) m_dlg).setView (rg_n7439.GetView(), rg_n7440, rg_n7441, rg_n7442, rg_n7443);
                    } catch (Exception e) { }
                } } );
        }
    }

    public static interface re_n7448 { int dispatch (rg_dshdhkl objSource, int nTagNumber, int rg_n7449, boolean rg_n7450); }
    private re_n7448 rd_n7448;
    private int rd_n7448_tag;
    public void rl_dshdhkl_n7448 (re_n7448 objListener, int nTagNumber) {
        synchronized (this) { rd_n7448 = objListener;  rd_n7448_tag = nTagNumber; }
    }
    public int rg_n7448 (int rg_n7449, boolean rg_n7450) {
        re_n7448 objDispatcher;  int nTagNumber;
        synchronized (this) { objDispatcher = rd_n7448;  nTagNumber = rd_n7448_tag; }
        return (objDispatcher != null ? objDispatcher.dispatch (this, nTagNumber, rg_n7449, rg_n7450) : 0);
    }

    public static interface re_n7451 { int dispatch (rg_dshdhkl objSource, int nTagNumber, int rg_n7452); }
    private re_n7451 rd_n7451;
    private int rd_n7451_tag;
    public void rl_dshdhkl_n7451 (re_n7451 objListener, int nTagNumber) {
        synchronized (this) { rd_n7451 = objListener;  rd_n7451_tag = nTagNumber; }
    }
    public int rg_n7451 (int rg_n7452) {
        re_n7451 objDispatcher;  int nTagNumber;
        synchronized (this) { objDispatcher = rd_n7451;  nTagNumber = rd_n7451_tag; }
        return (objDispatcher != null ? objDispatcher.dispatch (this, nTagNumber, rg_n7452) : 0);
    }
}

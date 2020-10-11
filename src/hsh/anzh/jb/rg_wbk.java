
package hsh.anzh.jb;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.*;

public class rg_wbk extends AndroidView {

    public rg_wbk ()  { }

    public rg_wbk (android.content.Context context, TextView view, Object objInitData) { super (context, view, objInitData); }
    public rg_wbk (android.content.Context context, TextView view) { this (context, view, null); }
    public TextView GetTextView () { return (TextView)GetView (); }
    public static rg_wbk sNewInstance (android.content.Context context) {
        return sNewInstanceAndAttachView (context, new TextView (context), null);
    }
    public static rg_wbk sNewInstance (android.content.Context context, Object objInitData) {
        return sNewInstanceAndAttachView (context, new TextView (context), objInitData);
    }
    public static rg_wbk sNewInstanceAndAttachView (android.content.Context context, TextView viewAttach) {
        return sNewInstanceAndAttachView (context, viewAttach, null);
    }
    public static rg_wbk sNewInstanceAndAttachView (android.content.Context context, TextView viewAttach, Object objInitData) {
        rg_wbk objControl = new rg_wbk (context, viewAttach, objInitData);
        objControl.onInitControlContent (context, objInitData);
        return objControl;
    }
    protected int rg_n7087 = 0;
    protected int rg_n7088 = 0;
    android.text.TextWatcher m_objTextWatcher;

    public void rg_n7046 (int rg_n7047) {
        rg_n7178 ((int)rg_n7047);
    }

    public void rg_n7049 (final String rg_n7050) {
        if (rg_yychx.sIsUiThread ()) {
            try {
                GetTextView ().setText (rg_n7050);
            } catch (Exception e) { }
        } else {
            rg_yychx.sRunOnUiThread (new Runnable () {
                @Override public void run () {
                    try {
                        GetTextView ().setText (rg_n7050);
                    } catch (Exception e) { }
                } } );
        }
    }

    public void rg_n7093 (final int rg_n7094) {
        rg_n7088 = rg_n7094;
        if (rg_yychx.sIsUiThread ()) {
            try {
                GetTextView ().setTypeface (rg_ztl.rg_n3428 (rg_n7087), rg_n7088);
            } catch (Exception e) { }
        } else {
            rg_yychx.sRunOnUiThread (new Runnable () {
                @Override public void run () {
                    try {
                        GetTextView ().setTypeface (rg_ztl.rg_n3428 (rg_n7087), rg_n7088);
                    } catch (Exception e) { }
                } } );
        }
    }

    public void rg_n7099 (final double rg_n7100) {
        if (rg_yychx.sIsUiThread ()) {
            try {
                GetTextView ().setTextSize ((float)rg_n7100);
            } catch (Exception e) { }
        } else {
            rg_yychx.sRunOnUiThread (new Runnable () {
                @Override public void run () {
                    try {
                        GetTextView ().setTextSize ((float)rg_n7100);
                    } catch (Exception e) { }
                } } );
        }
    }

    public void rg_n7105 (final int rg_n7106) {
        if (rg_yychx.sIsUiThread ()) {
            try {
                GetTextView ().setTextColor (rg_n7106);
            } catch (Exception e) { }
        } else {
            rg_yychx.sRunOnUiThread (new Runnable () {
                @Override public void run () {
                    try {
                        GetTextView ().setTextColor (rg_n7106);
                    } catch (Exception e) { }
                } } );
        }
    }

    public void rg_n7112 (final int rg_n7113) {
        if (rg_yychx.sIsUiThread ()) {
            try {
                GetTextView ().setGravity (rg_n7113 |
                    (GetTextView ().getGravity () & ~(android.view.Gravity.RELATIVE_HORIZONTAL_GRAVITY_MASK | android.view.Gravity.CLIP_HORIZONTAL)));
            } catch (Exception e) { }
        } else {
            rg_yychx.sRunOnUiThread (new Runnable () {
                @Override public void run () {
                    try {
                        GetTextView ().setGravity (rg_n7113 |
                                (GetTextView ().getGravity () & ~(android.view.Gravity.RELATIVE_HORIZONTAL_GRAVITY_MASK | android.view.Gravity.CLIP_HORIZONTAL)));
                    } catch (Exception e) { }
                } } );
        }
    }

    public void rg_n7117 (final String rg_n7118) {
        if (rg_yychx.sIsUiThread ()) {
            try {
                GetTextView ().setHint (rg_n7118);
            } catch (Exception e) { }
        } else {
            rg_yychx.sRunOnUiThread (new Runnable () {
                @Override public void run () {
                    try {
                        GetTextView ().setHint (rg_n7118);
                    } catch (Exception e) { }
                } } );
        }
    }

    public void rg_n7167 (final String rg_n7168) {
        if (rg_yychx.sIsUiThread ()) {
            try {
                GetTextView ().append (rg_n7168);
            } catch (Exception e) { }
        } else {
            rg_yychx.sRunOnUiThread (new Runnable () {
                @Override public void run () {
                    try {
                        GetTextView ().append (rg_n7168);
                    } catch (Exception e) { }
                } } );
        }
    }

    public void rg_n7178 (final int rg_n7179) {
        if (rg_yychx.sIsUiThread ()) {
            try {
                GetTextView ().setInputType (rg_n7179);
            } catch (Exception e) { }
        } else {
            rg_yychx.sRunOnUiThread (new Runnable () {
                @Override public void run () {
                    try {
                        GetTextView ().setInputType (rg_n7179);
                    } catch (Exception e) { }
                } } );
        }
    }
}

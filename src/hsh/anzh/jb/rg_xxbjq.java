
package hsh.anzh.jb;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.*;

public class rg_xxbjq extends AndroidViewGroup {

    public rg_xxbjq ()  { }

    public rg_xxbjq (android.content.Context context, LinearLayout view, Object objInitData) { super (context, view, objInitData); }
    public rg_xxbjq (android.content.Context context, LinearLayout view) { this (context, view, null); }
    public LinearLayout GetLinearLayout () { return (LinearLayout)GetView (); }
    public static rg_xxbjq sNewInstance (android.content.Context context) {
        return sNewInstanceAndAttachView (context, new LinearLayout (context), null);
    }
    public static rg_xxbjq sNewInstance (android.content.Context context, Object objInitData) {
        return sNewInstanceAndAttachView (context, new LinearLayout (context), objInitData);
    }
    public static rg_xxbjq sNewInstanceAndAttachView (android.content.Context context, LinearLayout viewAttach) {
        return sNewInstanceAndAttachView (context, viewAttach, null);
    }
    public static rg_xxbjq sNewInstanceAndAttachView (android.content.Context context, LinearLayout viewAttach, Object objInitData) {
        rg_xxbjq objControl = new rg_xxbjq (context, viewAttach, objInitData);
        objControl.onInitControlContent (context, objInitData);
        return objControl;
    }

    public void rg_n6313 (final int rg_n6314) {
        if ((this.GetLinearLayout ().getOrientation ()) != rg_n6314)
        {
            if (rg_yychx.sIsUiThread ()) {
                try {
                    GetLinearLayout ().setOrientation (rg_n6314);
                } catch (Exception e) { }
            } else {
                rg_yychx.sRunOnUiThread (new Runnable () {
                    @Override public void run () {
                        try {
                            GetLinearLayout ().setOrientation (rg_n6314);
                        } catch (Exception e) { }
                    } } );
            }
        }
    }

    public void rg_n6329 (final int rg_n6330) {
        if (rg_yychx.sIsUiThread ()) {
            try {
                GetLinearLayout ().setHorizontalGravity (rg_n6330);
            } catch (Exception e) { }
        } else {
            rg_yychx.sRunOnUiThread (new Runnable () {
                @Override public void run () {
                    try {
                        GetLinearLayout ().setHorizontalGravity (rg_n6330);
                    } catch (Exception e) { }
                } } );
        }
    }
}

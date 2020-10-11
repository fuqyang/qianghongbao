
package hsh.anzh.jb;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.*;

public class rg_tpann extends rg_tpk {

    public rg_tpann ()  { }

    public rg_tpann (android.content.Context context, ImageButton view, Object objInitData) { super (context, view, objInitData); }
    public rg_tpann (android.content.Context context, ImageButton view) { this (context, view, null); }
    public ImageButton GetImageButton () { return (ImageButton)GetView (); }
    public static rg_tpann sNewInstance (android.content.Context context) {
        return sNewInstanceAndAttachView (context, new ImageButton (context), null);
    }
    public static rg_tpann sNewInstance (android.content.Context context, Object objInitData) {
        return sNewInstanceAndAttachView (context, new ImageButton (context), objInitData);
    }
    public static rg_tpann sNewInstanceAndAttachView (android.content.Context context, ImageButton viewAttach) {
        return sNewInstanceAndAttachView (context, viewAttach, null);
    }
    public static rg_tpann sNewInstanceAndAttachView (android.content.Context context, ImageButton viewAttach, Object objInitData) {
        rg_tpann objControl = new rg_tpann (context, viewAttach, objInitData);
        objControl.onInitControlContent (context, objInitData);
        return objControl;
    }
    protected void OnInitView (android.content.Context context, Object objInitData) {
        super.OnInitView (context, objInitData);
        rg_n5450 (true);
    }
}


package hsh.anzh.jb;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.*;

public class rg_zxgdrq extends rg_zhbjq {

    public rg_zxgdrq ()  { }

    public rg_zxgdrq (android.content.Context context, rg_anzhzxgdrq view, Object objInitData) { super (context, view, objInitData); }
    public rg_zxgdrq (android.content.Context context, rg_anzhzxgdrq view) { this (context, view, null); }
    public rg_anzhzxgdrq GetScrollView () { return (rg_anzhzxgdrq)GetView (); }
    public static rg_zxgdrq sNewInstance (android.content.Context context) {
        return sNewInstanceAndAttachView (context, new rg_anzhzxgdrq (context), null);
    }
    public static rg_zxgdrq sNewInstance (android.content.Context context, Object objInitData) {
        return sNewInstanceAndAttachView (context, new rg_anzhzxgdrq (context), objInitData);
    }
    public static rg_zxgdrq sNewInstanceAndAttachView (android.content.Context context, rg_anzhzxgdrq viewAttach) {
        return sNewInstanceAndAttachView (context, viewAttach, null);
    }
    public static rg_zxgdrq sNewInstanceAndAttachView (android.content.Context context, rg_anzhzxgdrq viewAttach, Object objInitData) {
        rg_zxgdrq objControl = new rg_zxgdrq (context, viewAttach, objInitData);
        objControl.onInitControlContent (context, objInitData);
        return objControl;
    }
}

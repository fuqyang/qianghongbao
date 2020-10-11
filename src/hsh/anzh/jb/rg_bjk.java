
package hsh.anzh.jb;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.*;

public class rg_bjk extends rg_wbk {

    public rg_bjk ()  { }

    public rg_bjk (android.content.Context context, EditText view, Object objInitData) { super (context, view, objInitData); }
    public rg_bjk (android.content.Context context, EditText view) { this (context, view, null); }
    public EditText GetEditText () { return (EditText)GetView (); }
    public static rg_bjk sNewInstance (android.content.Context context) {
        return sNewInstanceAndAttachView (context, new EditText (context), null);
    }
    public static rg_bjk sNewInstance (android.content.Context context, Object objInitData) {
        return sNewInstanceAndAttachView (context, new EditText (context), objInitData);
    }
    public static rg_bjk sNewInstanceAndAttachView (android.content.Context context, EditText viewAttach) {
        return sNewInstanceAndAttachView (context, viewAttach, null);
    }
    public static rg_bjk sNewInstanceAndAttachView (android.content.Context context, EditText viewAttach, Object objInitData) {
        rg_bjk objControl = new rg_bjk (context, viewAttach, objInitData);
        objControl.onInitControlContent (context, objInitData);
        return objControl;
    }
}

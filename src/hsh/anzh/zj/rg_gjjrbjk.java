
package hsh.anzh.zj;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.*;

public class rg_gjjrbjk extends hsh.anzh.jb.rg_bjk {

    public rg_gjjrbjk ()  { }

    public rg_gjjrbjk (android.content.Context context, com.rengwuxian.materialedittext.MaterialEditText view, Object objInitData) { super (context, view, objInitData); }
    public rg_gjjrbjk (android.content.Context context, com.rengwuxian.materialedittext.MaterialEditText view) { this (context, view, null); }
    public com.rengwuxian.materialedittext.MaterialEditText GetMaterialEditText () { return (com.rengwuxian.materialedittext.MaterialEditText)GetView (); }
    public static rg_gjjrbjk sNewInstance (android.content.Context context) {
        return sNewInstanceAndAttachView (context, new com.rengwuxian.materialedittext.MaterialEditText (context), null);
    }
    public static rg_gjjrbjk sNewInstance (android.content.Context context, Object objInitData) {
        return sNewInstanceAndAttachView (context, new com.rengwuxian.materialedittext.MaterialEditText (context), objInitData);
    }
    public static rg_gjjrbjk sNewInstanceAndAttachView (android.content.Context context, com.rengwuxian.materialedittext.MaterialEditText viewAttach) {
        return sNewInstanceAndAttachView (context, viewAttach, null);
    }
    public static rg_gjjrbjk sNewInstanceAndAttachView (android.content.Context context, com.rengwuxian.materialedittext.MaterialEditText viewAttach, Object objInitData) {
        rg_gjjrbjk objControl = new rg_gjjrbjk (context, viewAttach, objInitData);
        objControl.onInitControlContent (context, objInitData);
        return objControl;
    }

    public void rg_n16843 (final boolean rg_n16844) {
        if (hsh.anzh.jb.rg_yychx.sIsUiThread ()) {
            try {
                GetMaterialEditText ().setShowClearButton (rg_n16844);
            } catch (Exception e) { }
        } else {
            hsh.anzh.jb.rg_yychx.sRunOnUiThread (new Runnable () {
                @Override public void run () {
                    try {
                        GetMaterialEditText ().setShowClearButton (rg_n16844);
                    } catch (Exception e) { }
                } } );
        }
    }

    public void rg_n16861 (final String rg_n16862) {
        if (hsh.anzh.jb.rg_yychx.sIsUiThread ()) {
            try {
                GetMaterialEditText ().setFloatingLabelText (rg_n16862);
            } catch (Exception e) { }
        } else {
            hsh.anzh.jb.rg_yychx.sRunOnUiThread (new Runnable () {
                @Override public void run () {
                    try {
                        GetMaterialEditText ().setFloatingLabelText (rg_n16862);
                    } catch (Exception e) { }
                } } );
        }
    }

    public void rg_n16876 (final int rg_n16877) {
        if (hsh.anzh.jb.rg_yychx.sIsUiThread ()) {
            try {
                GetMaterialEditText ().setBaseColor (rg_n16877);
            } catch (Exception e) { }
        } else {
            hsh.anzh.jb.rg_yychx.sRunOnUiThread (new Runnable () {
                @Override public void run () {
                    try {
                        GetMaterialEditText ().setBaseColor (rg_n16877);
                    } catch (Exception e) { }
                } } );
        }
    }

    public void rg_n16878 (final int rg_n16879) {
        if (hsh.anzh.jb.rg_yychx.sIsUiThread ()) {
            try {
                GetMaterialEditText ().setPrimaryColor (rg_n16879);
            } catch (Exception e) { }
        } else {
            hsh.anzh.jb.rg_yychx.sRunOnUiThread (new Runnable () {
                @Override public void run () {
                    try {
                        GetMaterialEditText ().setPrimaryColor (rg_n16879);
                    } catch (Exception e) { }
                } } );
        }
    }

    public void rg_n16888 (final int rg_n16889) {
        if (hsh.anzh.jb.rg_yychx.sIsUiThread ()) {
            try {
                GetMaterialEditText ().setFloatingLabel (rg_n16889);
            } catch (Exception e) { }
        } else {
            hsh.anzh.jb.rg_yychx.sRunOnUiThread (new Runnable () {
                @Override public void run () {
                    try {
                        GetMaterialEditText ().setFloatingLabel (rg_n16889);
                    } catch (Exception e) { }
                } } );
        }
    }

    public void rg_n16898 (final int rg_n16899) {
        if (hsh.anzh.jb.rg_yychx.sIsUiThread ()) {
            try {
                GetMaterialEditText ().setMaxCharacters (rg_n16899);
            } catch (Exception e) { }
        } else {
            hsh.anzh.jb.rg_yychx.sRunOnUiThread (new Runnable () {
                @Override public void run () {
                    try {
                        GetMaterialEditText ().setMaxCharacters (rg_n16899);
                    } catch (Exception e) { }
                } } );
        }
    }
}

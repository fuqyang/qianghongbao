
package hsh.anzh.jb;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.view.View;
import android.view.ViewGroup;
import android.widget.*;

public class rg_tpk extends AndroidView {

    public rg_tpk ()  { }

    public rg_tpk (android.content.Context context, ImageView view, Object objInitData) { super (context, view, objInitData); }
    public rg_tpk (android.content.Context context, ImageView view) { this (context, view, null); }
    public ImageView GetImageView () { return (ImageView)GetView (); }
    public static rg_tpk sNewInstance (android.content.Context context) {
        return sNewInstanceAndAttachView (context, new ImageView (context), null);
    }
    public static rg_tpk sNewInstance (android.content.Context context, Object objInitData) {
        return sNewInstanceAndAttachView (context, new ImageView (context), objInitData);
    }
    public static rg_tpk sNewInstanceAndAttachView (android.content.Context context, ImageView viewAttach) {
        return sNewInstanceAndAttachView (context, viewAttach, null);
    }
    public static rg_tpk sNewInstanceAndAttachView (android.content.Context context, ImageView viewAttach, Object objInitData) {
        rg_tpk objControl = new rg_tpk (context, viewAttach, objInitData);
        objControl.onInitControlContent (context, objInitData);
        return objControl;
    }
}

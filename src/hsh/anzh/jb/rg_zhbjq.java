
package hsh.anzh.jb;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.*;

public class rg_zhbjq extends AndroidViewGroup {

    public rg_zhbjq ()  { }

    public rg_zhbjq (android.content.Context context, FrameLayout view, Object objInitData) { super (context, view, objInitData); }
    public rg_zhbjq (android.content.Context context, FrameLayout view) { this (context, view, null); }
    public FrameLayout GetFrameLayout () { return (FrameLayout)GetView (); }
    public static rg_zhbjq sNewInstance (android.content.Context context) {
        return sNewInstanceAndAttachView (context, new FrameLayout (context), null);
    }
    public static rg_zhbjq sNewInstance (android.content.Context context, Object objInitData) {
        return sNewInstanceAndAttachView (context, new FrameLayout (context), objInitData);
    }
    public static rg_zhbjq sNewInstanceAndAttachView (android.content.Context context, FrameLayout viewAttach) {
        return sNewInstanceAndAttachView (context, viewAttach, null);
    }
    public static rg_zhbjq sNewInstanceAndAttachView (android.content.Context context, FrameLayout viewAttach, Object objInitData) {
        rg_zhbjq objControl = new rg_zhbjq (context, viewAttach, objInitData);
        objControl.onInitControlContent (context, objInitData);
        return objControl;
    }
    private AndroidLayout m_objLayout;
    public AndroidLayout SetLayoutContent (AndroidLayout objLayout, boolean blListenWindowAttachState, Object objUserData1, Object objUserData2) {
        m_objLayout = objLayout.initAndAddIntoViewGroup (this, blListenWindowAttachState, null, objUserData1, objUserData2, true);
        return m_objLayout;
    }

    public void rg_n6361 (final AndroidView rg_n6362, int rg_n6363, int rg_n6364) {
        ViewGroup.LayoutParams pmLayout = rg_n6362.GetView ().getLayoutParams ();
        if (pmLayout instanceof FrameLayout.LayoutParams) {
            FrameLayout.LayoutParams pm = (FrameLayout.LayoutParams)pmLayout;
            final int nNewGravity = (rg_n6363 | rg_n6364);
            if (pm.gravity != nNewGravity) {
                pm.gravity = nNewGravity;
                final FrameLayout.LayoutParams pmNew = pm;
                if (rg_yychx.sIsUiThread ()) {
                    try {
                        rg_n6362.GetView ().setLayoutParams (pmNew);
                    } catch (Exception e) { }
                } else {
                    rg_yychx.sRunOnUiThread (new Runnable () {
                        @Override public void run () {
                            try {
                                rg_n6362.GetView ().setLayoutParams (pmNew);
                            } catch (Exception e) { }
                        } } );
                }
            } }
    }
}


package hsh.anzh.jb;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.*;

public class AndroidLayout {

    public AndroidLayout ()  { }

    protected static final int rg_n6411 = com.qqq.WXhongbao.R.id.rg_n6411;
    private rg_xxbjq m_linearLayout;
    protected android.content.Context m_context;
    public AndroidLayout initAndAddIntoViewGroup (AndroidViewGroup container, boolean blListenWindowAttachState,
            AndroidView posControl, Object objUserData1, Object objUserData2, boolean blRemoveAllFirst) {
        return initAndAddIntoViewGroup (container.GetView ().getContext (), container,
                blListenWindowAttachState, posControl, objUserData1, objUserData2, blRemoveAllFirst);
    }
    private AndroidLayout initAndAddIntoViewGroup (android.content.Context context, final AndroidViewGroup container,
            boolean blListenWindowAttachState, AndroidView posControl, final Object objUserData1, final Object objUserData2,
            final boolean blRemoveAllFirst) {
        m_linearLayout = null;
        m_context = context;
        LinearLayout viewLayout = onCreateLayout ();
        if (viewLayout == null)
            return null;
        viewLayout.setTag (rg_n6411, this);
        m_linearLayout = rg_xxbjq.sNewInstanceAndAttachView (context, viewLayout);
        if (blListenWindowAttachState) {
            viewLayout.addOnAttachStateChangeListener (new View.OnAttachStateChangeListener () {
                @Override public void onViewAttachedToWindow (View v) { rg_n6375 (true); }
                @Override public void onViewDetachedFromWindow (View v) { rg_n6375 (false); }
            } ) ;
        }
        if (container != null) {
            final int nIndex = (posControl == null ? -1 : container.GetViewGroup ().indexOfChild (posControl.GetView ()));
            if (rg_yychx.sIsUiThread ()) {
                try {
                    AddCreatedView (container, nIndex, objUserData1, objUserData2, blRemoveAllFirst);
                } catch (Exception e) { }
            } else {
                rg_yychx.sRunOnUiThread (new Runnable () {
                    @Override public void run () {
                        try {
                            AddCreatedView (container, nIndex, objUserData1, objUserData2, blRemoveAllFirst);
                        } catch (Exception e) { }
                    } } );
            }
        }
        else {
            rg_n6371 (null, objUserData1, objUserData2);
        }
        return this;
    }
    private void AddCreatedView (AndroidViewGroup container, int nIndex, Object objUserData1, Object objUserData2, boolean blRemoveAllFirst) {
        ViewGroup vg = container.GetViewGroup ();
        int nRealIndex = nIndex;
        if (blRemoveAllFirst) {
            vg.removeAllViews ();
            nRealIndex = -1;
        }
        if (nRealIndex < 0)
            vg.addView (m_linearLayout.GetView ());
        else
            vg.addView (m_linearLayout.GetView (), nRealIndex);
        rg_n6371 (container, objUserData1, objUserData2);
    }
    public static AndroidLayout sSafeGetLayoutObject (View view) {
        if (view != null) {
            Object obj = view.getTag (rg_n6411);
            if (obj != null && obj instanceof AndroidLayout)
                return (AndroidLayout)obj;
        }
        return null;
    }
    protected LinearLayout onCreateLayout () {
        return null;
    }

    public void rg_n6371 (AndroidViewGroup rg_n6372, java.lang.Object rg_n6373, java.lang.Object rg_n6374) {
    }

    public void rg_n6375 (boolean rg_n6376) {
    }
}

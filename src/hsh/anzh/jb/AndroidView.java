
package hsh.anzh.jb;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.*;

public class AndroidView extends hsh.Java.jb.rg_bjl {

    public AndroidView ()  { }

    public static final int rg_n5715 = -1;
    public static final int rg_n5716 = -2;
    protected static final int rg_n5805 = com.qqq.WXhongbao.R.id.rg_n5805;
    private View m_view;
    private rg_zjshxdhbfq m_animator;
    private View.OnAttachStateChangeListener m_stateChangeListener;
    private android.view.ViewTreeObserver.OnDrawListener m_drawListener;
    private android.view.ViewTreeObserver.OnGlobalLayoutListener m_layoutListener;
    public AndroidView (android.content.Context context, View view, Object objInitData) {
        m_view = view;
        m_view.setTag (rg_n5805, this);
    }
    public AndroidView (android.content.Context context, View view) {
        this (context, view, null);
    }
    public void onInitControlContent (android.content.Context context, Object objInitData) {
        OnInitView (context, objInitData);
        rg_n4366 (context, objInitData);
    }
    public View GetView () { return m_view; }
    public static AndroidView sNewInstance (android.content.Context context) {
        return sNewInstanceAndAttachView (context, new View (context), null);
    }
    public static AndroidView sNewInstance (android.content.Context context, Object objInitData) {
        return sNewInstanceAndAttachView (context, new View (context), objInitData);
    }
    public static AndroidView sNewInstanceAndAttachView (android.content.Context context, View viewAttach) {
        return sNewInstanceAndAttachView (context, viewAttach, null);
    }
    public static AndroidView sNewInstanceAndAttachView (android.content.Context context, View viewAttach, Object objInitData) {
        AndroidView objControl = new AndroidView (context, viewAttach, objInitData);
        objControl.onInitControlContent (context, objInitData);
        return objControl;
    }
    public static AndroidView sSafeGetVolView (View view) {
        if (view != null) {
            Object obj = view.getTag (rg_n5805);
            if (obj != null && obj instanceof AndroidView)
                return (AndroidView)obj;
        }
        return null;
    }
    protected void OnInitView (android.content.Context context, Object objInitData) {
    }

    public static interface re_n5428 { int dispatch (AndroidView objSource, int nTagNumber); }
    private re_n5428 rd_n5428;
    private int rd_n5428_tag;
    public void rl_AndroidView_n5428 (re_n5428 objListener, int nTagNumber) {
        synchronized (this) { rd_n5428 = objListener;  rd_n5428_tag = nTagNumber; }
    }
    public int rg_n5428 () {
        re_n5428 objDispatcher;  int nTagNumber;
        synchronized (this) { objDispatcher = rd_n5428;  nTagNumber = rd_n5428_tag; }
        return (objDispatcher != null ? objDispatcher.dispatch (this, nTagNumber) : 0);
    }

    public void rg_n5450 (final boolean rg_n5451) {
        if (rg_yychx.sIsUiThread ()) {
            try {
                m_view.setClickable (rg_n5451);
            } catch (Exception e) { }
        } else {
            rg_yychx.sRunOnUiThread (new Runnable () {
                @Override public void run () {
                    try {
                        m_view.setClickable (rg_n5451);
                    } catch (Exception e) { }
                } } );
        }
        try {
            if (rg_n5451) {
               m_view.setOnClickListener (new View.OnClickListener () {
                       @Override public void onClick (View v) {
                           rg_n5428 ();
                       } } );
            } else {
                m_view.setOnClickListener (null);
            };
        } catch (Exception e) { }
    }

    public void rg_n5474 (final boolean rg_n5475) {
        if (rg_yychx.sIsUiThread ()) {
            try {
                m_view.setEnabled (rg_n5475);
            } catch (Exception e) { }
        } else {
            rg_yychx.sRunOnUiThread (new Runnable () {
                @Override public void run () {
                    try {
                        m_view.setEnabled (rg_n5475);
                    } catch (Exception e) { }
                } } );
        }
    }

    public void rg_n5477 (final int rg_n5478) {
        if (rg_yychx.sIsUiThread ()) {
            try {
                m_view.setVisibility (rg_n5478);
            } catch (Exception e) { }
        } else {
            rg_yychx.sRunOnUiThread (new Runnable () {
                @Override public void run () {
                    try {
                        m_view.setVisibility (rg_n5478);
                    } catch (Exception e) { }
                } } );
        }
    }

    public void rg_n5493 (final int rg_n5494) {
        m_view.setId (Math.max (1, rg_n5494));
    }

    public void rg_n5670 (final int rg_n5671) {
        if (rg_yychx.sIsUiThread ()) {
            try {
                m_view.setBackgroundResource (rg_n5671);
            } catch (Exception e) { }
        } else {
            rg_yychx.sRunOnUiThread (new Runnable () {
                @Override public void run () {
                    try {
                        m_view.setBackgroundResource (rg_n5671);
                    } catch (Exception e) { }
                } } );
        }
    }

    public void rg_n5677 (final android.graphics.drawable.Drawable rg_n5678) {
        if (rg_n5678 != null)
        {
            if (rg_yychx.sIsUiThread ()) {
                try {
                    m_view.setBackground (rg_n5678);
                } catch (Exception e) { }
            } else {
                rg_yychx.sRunOnUiThread (new Runnable () {
                    @Override public void run () {
                        try {
                            m_view.setBackground (rg_n5678);
                        } catch (Exception e) { }
                    } } );
            }
        }
    }

    public void rg_n5679 (rg_zhtdtxb rg_n5680) {
        rg_n5677 (rg_n5680.rg_n8183 ());
    }

    public void rg_n5702 (final int rg_n5703, final int rg_n5704, final int rg_n5705, final int rg_n5706) {
        if (rg_yychx.sIsUiThread ()) {
            try {
                m_view.setPadding (rg_n5703, rg_n5704, rg_n5705, rg_n5706);
            } catch (Exception e) { }
        } else {
            rg_yychx.sRunOnUiThread (new Runnable () {
                @Override public void run () {
                    try {
                        m_view.setPadding (rg_n5703, rg_n5704, rg_n5705, rg_n5706);
                    } catch (Exception e) { }
                } } );
        }
    }

    public void rg_n5710 (int rg_n5711, int rg_n5712, int rg_n5713, int rg_n5714) {
        ViewGroup.LayoutParams pmLayout = m_view.getLayoutParams ();
        if (pmLayout == null || pmLayout instanceof ViewGroup.MarginLayoutParams == false)
            return;
        ViewGroup.MarginLayoutParams pmMargin = (ViewGroup.MarginLayoutParams)pmLayout;
        final android.graphics.Rect rtNew = new android.graphics.Rect (
                (rg_n5711 == -1 ?  pmMargin.leftMargin : rg_n5711),
                (rg_n5712 == -1 ?  pmMargin.topMargin : rg_n5712),
                (rg_n5713 == -1 ?  pmMargin.rightMargin : rg_n5713),
                (rg_n5714 == -1 ?  pmMargin.bottomMargin : rg_n5714));
        if (rg_yychx.sIsUiThread ()) {
            try {
                ViewGroup.MarginLayoutParams pmNewMargin = (ViewGroup.MarginLayoutParams)m_view.getLayoutParams ();
                pmNewMargin.setMargins (rtNew.left, rtNew.top, rtNew.right, rtNew.bottom);
                m_view.setLayoutParams (pmNewMargin);
            } catch (Exception e) { }
        } else {
            rg_yychx.sRunOnUiThread (new Runnable () {
                @Override public void run () {
                    try {
                        ViewGroup.MarginLayoutParams pmNewMargin = (ViewGroup.MarginLayoutParams)m_view.getLayoutParams ();
                            pmNewMargin.setMargins (rtNew.left, rtNew.top, rtNew.right, rtNew.bottom);
                            m_view.setLayoutParams (pmNewMargin);
                    } catch (Exception e) { }
                } } );
        }
    }

    public void rg_n5723 (final int rg_n5724, final int rg_n5725) {
        if (rg_yychx.sIsUiThread ()) {
            try {
                ViewGroup.LayoutParams pmLayout = m_view.getLayoutParams ();
                if (pmLayout != null) {
                    pmLayout.width = rg_n5724;
                    pmLayout.height = rg_n5725;
                    m_view.setLayoutParams (pmLayout);
                } else {
                   m_view.setLayoutParams (new ViewGroup.LayoutParams (rg_n5724, rg_n5725));
                };
            } catch (Exception e) { }
        } else {
            rg_yychx.sRunOnUiThread (new Runnable () {
                @Override public void run () {
                    try {
                        ViewGroup.LayoutParams pmLayout = m_view.getLayoutParams ();
                            if (pmLayout != null) {
                                pmLayout.width = rg_n5724;
                                pmLayout.height = rg_n5725;
                                m_view.setLayoutParams (pmLayout);
                            } else {
                               m_view.setLayoutParams (new ViewGroup.LayoutParams (rg_n5724, rg_n5725));
                            };
                    } catch (Exception e) { }
                } } );
        }
    }

    protected void rg_n4366 (android.content.Context rg_n5806, java.lang.Object rg_n5807) {
    }
}

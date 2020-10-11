
package hsh.anzh.gn.mzhaifw;

public class rg_mzhaifwl extends android.accessibilityservice.AccessibilityService {

    @Override public void onCreate () {
        super.onCreate ();
        hsh.anzh.jb.rg_yychx.sPermitDiskAndNetworkOperInsideUIThread ();
        rg_n144 ();
    }
    @Override public int onStartCommand (android.content.Intent intent, int flags, int startId) {
        final int nResult = super.onStartCommand (intent, flags, startId);
        rg_n153 (intent, null, 0);
        return nResult;
    }
    @Override public void onDestroy () {
        rg_n145 ();
        super.onDestroy ();
    }
    @Override public void onInterrupt () {
        rg_n146 ();
    }
    @Override public void onAccessibilityEvent (android.view.accessibility.AccessibilityEvent event) {
        rg_n151 (event);
    }
    @Override protected void onServiceConnected () {
        rg_n147 ();
        super.onServiceConnected();
    }
    @Override protected boolean onGesture (int gestureId) {
        return rg_n148 (gestureId);
    }
    @Override public boolean onUnbind (android.content.Intent intent) {
        rg_n157 ();
        return false;
    }

    public void rg_n144 () {
    }

    public void rg_n145 () {
    }

    public void rg_n146 () {
    }

    public void rg_n147 () {
    }

    public boolean rg_n148 (int rg_n149) {
        return (false);
    }

    @Override public boolean onKeyEvent (android.view.KeyEvent rg_n150) {
        return (false);
    }

    public void rg_n151 (android.view.accessibility.AccessibilityEvent rg_n152) {
    }

    public void rg_n153 (android.content.Intent rg_n154, java.lang.Object [] rg_n155, int rg_n156) {
    }

    public void rg_n157 () {
    }
}

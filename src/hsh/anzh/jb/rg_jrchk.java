
package hsh.anzh.jb;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.*;

public class rg_jrchk extends android.support.v7.app.AppCompatActivity {

    private static final String cs_strActivityLoadParams = "@activity_params";
    protected boolean onInitAndroidActivity () {
        if (rg_yychx.sCheckRestart (this) == false)
            return false;
        rg_n1521 ();
        return true;
    }
    protected void onStart ()    {  super.onStart ();  m_blCleanupMethodCalled = false;  rg_n1512 ();  }
    protected void onRestart ()  {  super.onRestart ();  rg_n1513 ();  }
    protected void onResume ()   {  super.onResume ();  rg_n1516 ();  }
    protected void onPause ()    {  super.onPause ();  rg_n1517 ();  }
    protected void onNewIntent(android.content.Intent intent) { super.onNewIntent(intent); rg_n1514 (intent);  }
    protected void onStop () {
        super.onStop ();
        rg_n1519 ();
        if (isChangingConfigurations ())
            rg_yychx.sForceRestart  ();
        if (isFinishing ())
            SendCleanupNotify ();
    }
    protected void onDestroy () {
        super.onDestroy ();
        SendCleanupNotify ();
        rg_n1520 ();
    }
    private boolean m_blCleanupMethodCalled;
    void SendCleanupNotify () {
        if (m_blCleanupMethodCalled == false) {
            m_blCleanupMethodCalled = true;
            rg_n1518 ();
        }
    }
    @Override protected void onCreate (android.os.Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        rg_yychx.sPermitDiskAndNetworkOperInsideUIThread ();
        if (getClass ().equals (com.qqq.WXhongbao.rg_qdl.class))
            rg_yychx.sOnStartupClassEnter ();
        android.content.Intent objIntent = getIntent ();
        final int nParamDataIdentifier = objIntent.getIntExtra (cs_strActivityLoadParams, 0);
        Object[] aryParams = rg_yychx.sGetGlobalDataCache ().Pop (nParamDataIdentifier);
        if (nParamDataIdentifier != 0 && aryParams == null)
            rg_yychx.sForceRestart ();
        if (onInitAndroidActivity () == false) {
            finish ();
            return;
        }
        rg_n1508 (objIntent, aryParams, (aryParams == null ? 0 : aryParams.length));
    }
    @Override public boolean onCreateOptionsMenu (android.view.Menu menu) {
        final boolean blDisplay = rg_n1522 (menu);
        return (super.onCreateOptionsMenu (menu) && blDisplay);
    }
    @Override public boolean onPrepareOptionsMenu (android.view.Menu menu) {
        final boolean blDisplay = rg_n1524 (menu);
        return (super.onPrepareOptionsMenu (menu) && blDisplay);
    }
    @Override public boolean onOptionsItemSelected (android.view.MenuItem item) {
        if (rg_n1529 (item, false))
            return true;
        return super.onOptionsItemSelected (item);
    }
    @Override public void onOptionsMenuClosed (android.view.Menu menu) {
        rg_n1532 (menu, false);
         super.onOptionsMenuClosed (menu);
    }
    @Override public boolean onContextItemSelected (android.view.MenuItem item) {
        if (rg_n1529 (item, true))
            return true;
        return super.onContextItemSelected (item);
    }
    @Override public void onContextMenuClosed (android.view.Menu menu) {
        rg_n1532 (menu, true);
        super.onContextMenuClosed (menu);
    }
    @Override public void onCreateContextMenu (android.view.ContextMenu menu, View v, android.view.ContextMenu.ContextMenuInfo menuInfo) {
        AndroidView volView = AndroidView.sSafeGetVolView (v);
        if (volView != null)
            rg_n1526 (volView, menu);
        super.onCreateContextMenu (menu, v, menuInfo);
    }
    protected void onActivityResult (int requestCode, int resultCode, android.content.Intent data) {
        super.onActivityResult (requestCode, resultCode, data);
        rg_n1535 (requestCode, resultCode, data);
    }
    @Override public boolean dispatchKeyEvent (android.view.KeyEvent event) {
        if (rg_n1543 (event))
            return true;
        return super.dispatchKeyEvent (event);
    }
    @Override public boolean dispatchKeyShortcutEvent (android.view.KeyEvent event) {
        if (rg_n1545 (event))
            return true;
        return super.dispatchKeyShortcutEvent (event);
    }
    @Override public boolean dispatchTouchEvent (android.view.MotionEvent event) {
        if (rg_n1551 (event))
            return true;
        return super.dispatchTouchEvent (event);
    }
    @Override public boolean dispatchTrackballEvent (android.view.MotionEvent event) {
        if (rg_n1555 (event))
            return true;
        return super.dispatchTrackballEvent (event);
    }
    @Override public boolean dispatchGenericMotionEvent (android.view.MotionEvent event) {
        if (rg_n1539 (event))
            return true;
        return super.dispatchGenericMotionEvent (event);
    }
    @Override public boolean onTouchEvent (android.view.MotionEvent event) {
        if (rg_n1553 (event))
            return true;
        return super.onTouchEvent (event);
    }
    @Override public boolean onGenericMotionEvent (android.view.MotionEvent event) {
        if (rg_n1541 (event))
            return true;
        return super.onGenericMotionEvent (event);
    }
    @Override public boolean onTrackballEvent (android.view.MotionEvent event) {
        if (rg_n1557 (event))
            return true;
        return super.onTrackballEvent (event);
    }
    @Override public boolean onKeyDown (int keyCode, android.view.KeyEvent event) {
        if (rg_n1547 (rg_anjtzhlx.rg_n13311, keyCode, event))
            return true;
        return super.onKeyDown (keyCode, event);
    }
    @Override public boolean onKeyLongPress (int keyCode, android.view.KeyEvent event) {
        if (rg_n1547 (rg_anjtzhlx.rg_n13313, keyCode, event))
            return true;
        return super.onKeyLongPress (keyCode, event);
    }
    @Override public boolean onKeyMultiple (int keyCode, int repeatCount, android.view.KeyEvent event) {
        if (rg_n1547 (rg_anjtzhlx.rg_n13314, keyCode, event))
            return true;
        return super.onKeyMultiple (keyCode, repeatCount, event);
    }
    @Override public boolean onKeyShortcut (int keyCode, android.view.KeyEvent event) {
        if (rg_n1547 (rg_anjtzhlx.rg_n13315, keyCode, event))
            return true;
        return super.onKeyShortcut (keyCode, event);
    }
    @Override public boolean onKeyUp (int keyCode, android.view.KeyEvent event) {
        if (rg_n1547 (rg_anjtzhlx.rg_n13312, keyCode, event))
            return true;
        return super.onKeyUp (keyCode, event);
    }
    @Override public void onBackPressed () {
        if (rg_n1559 ())
            return;
        super.onBackPressed ();
    }
    @Override public void onUserInteraction () {
        super.onUserInteraction ();
        rg_n1561 ();
    }
    @Override public void onUserLeaveHint () {
        rg_n1562 ();
        super.onUserLeaveHint ();
    }
    @Override public void onWindowFocusChanged (boolean hasFocus) {
        super.onWindowFocusChanged (hasFocus);
        rg_n1563 (hasFocus);
    }
    @Override public CharSequence onCreateDescription () {
        final String strDesc = rg_n1560 ();
        return (strDesc != null ? strDesc : super.onCreateDescription ());
    }

    public void rg_n1508 (android.content.Intent rg_n1509, java.lang.Object [] rg_n1510, int rg_n1511) {
    }

    public void rg_n1512 () {
    }

    public void rg_n1513 () {
    }

    public void rg_n1514 (android.content.Intent rg_n1515) {
    }

    public void rg_n1516 () {
    }

    public void rg_n1517 () {
    }

    public void rg_n1518 () {
    }

    public void rg_n1519 () {
    }

    public void rg_n1520 () {
    }

    public void rg_n1521 () {
    }

    public boolean rg_n1522 (android.view.Menu rg_n1523) {
        return (true);
    }

    public boolean rg_n1524 (android.view.Menu rg_n1525) {
        return (true);
    }

    public void rg_n1526 (AndroidView rg_n1527, android.view.ContextMenu rg_n1528) {
    }

    public boolean rg_n1529 (android.view.MenuItem rg_n1530, boolean rg_n1531) {
        return (false);
    }

    public void rg_n1532 (android.view.Menu rg_n1533, boolean rg_n1534) {
    }

    public void rg_n1535 (int rg_n1536, int rg_n1537, android.content.Intent rg_n1538) {
    }

    public boolean rg_n1539 (android.view.MotionEvent rg_n1540) {
        return (false);
    }

    public boolean rg_n1541 (android.view.MotionEvent rg_n1542) {
        return (false);
    }

    public boolean rg_n1543 (android.view.KeyEvent rg_n1544) {
        return (false);
    }

    public boolean rg_n1545 (android.view.KeyEvent rg_n1546) {
        return (false);
    }

    public boolean rg_n1547 (int rg_n1548, int rg_n1549, android.view.KeyEvent rg_n1550) {
        return (false);
    }

    public boolean rg_n1551 (android.view.MotionEvent rg_n1552) {
        return (false);
    }

    public boolean rg_n1553 (android.view.MotionEvent rg_n1554) {
        return (false);
    }

    public boolean rg_n1555 (android.view.MotionEvent rg_n1556) {
        return (false);
    }

    public boolean rg_n1557 (android.view.MotionEvent rg_n1558) {
        return (false);
    }

    public boolean rg_n1559 () {
        return (false);
    }

    public String rg_n1560 () {
        return (null);
    }

    public void rg_n1561 () {
    }

    public void rg_n1562 () {
    }

    public void rg_n1563 (boolean rg_n1564) {
    }

    @Override public void onRequestPermissionsResult (int rg_n1565, String [] rg_n1566, int [] rg_n1567) {
    }

    public AndroidViewGroup GetAndroidActivityContainer () {
        return (null);
    }
}

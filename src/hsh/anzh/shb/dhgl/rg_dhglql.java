
package hsh.anzh.shb.dhgl;

import android.telephony.ServiceState;
import android.telephony.TelephonyManager;

public class rg_dhglql extends android.telephony.PhoneStateListener {

    public rg_dhglql () {
        rg_n25691 ();
    }

    private android.telephony.TelephonyManager mTelephonyManager;

    protected void rg_n25691 () {
        mTelephonyManager = (android.telephony.TelephonyManager) hsh.anzh.jb.rg_yychx.sGetApp().getSystemService(android.content.Context.TELEPHONY_SERVICE);
    }

    public String rg_n25696 () {
        return mTelephonyManager.getLine1Number ();
    }
}

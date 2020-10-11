
package com.qqq.WXhongbao;

public class rg_ZFBgbkjm extends rg_rwjchl {

    public rg_ZFBgbkjm ()  { }

    public static rg_mzhaifwchkshjjshq rg_n71933;
    protected static rg_ZFBgbkjm rg_n71934;
    protected String rg_n71935 = "com.alipay.android.phone.discovery.envelope.get.SnsCouponDetailActivity";

    public void rg_n71682 (android.view.accessibility.AccessibilityEvent rg_n71936) {
        super.rg_n71682 (rg_n71936);
        if (rg_n71841 == false)
        {
            return;
        }
        if (hsh.Java.jb.rg_wbxl.rg_n52611 (String.valueOf(rg_n71936.getPackageName()), "com.eg.android.AlipayGphone", false) == false)
        {
            return;
        }
        if (rg_n71936.getEventType() != hsh.anzh.gn.mzhaifw.rg_mzhaishjlx.rg_n333)
        {
            return;
        }
        if (hsh.Java.jb.rg_wbxl.rg_n52611 (String.valueOf(rg_n71936.getClassName()), rg_n71935, false) || hsh.Java.jb.rg_wbxl.rg_n52611 (String.valueOf(rg_n71936.getClassName()), "com.alipay.mobile.framework.app.ui.DialogHelper$APGenericProgressDialog", false))
        {
            android.view.accessibility.AccessibilityNodeInfo rg_n71938;
            rg_n71938 = anzh.mm.mzhaicz.rg_mzhaifzhl.rg_n63997 ("拆红包", null);
            if (rg_n71938 != null)
            {
                rg_n71854 (rg_n71938);
                if (rg_n71933 != null)
                {
                    rg_n71933.rg_n71894 (hsh.anzh.gn.mzhaifw.rg_mzhaifwqjczlx.rg_n180);
                }
                rg_ZFBltjm.rg_n71930 ().rg_n71841 = true;
                rg_ZFBgbkjm.rg_n71943 ().rg_n71841 = false;
            }
            else
            {
                if (rg_n71933 != null)
                {
                    rg_n71933.rg_n71894 (hsh.anzh.gn.mzhaifw.rg_mzhaifwqjczlx.rg_n180);
                }
                rg_ZFBltjm.rg_n71930 ().rg_n71841 = true;
                rg_ZFBgbkjm.rg_n71943 ().rg_n71841 = false;
            }
        }
        return;
    }

    public static synchronized rg_ZFBgbkjm rg_n71943 () {
        if (rg_n71934 == null)
        {
            rg_n71934 = new rg_ZFBgbkjm ();
        }
        return (rg_n71934);
    }

    public static void rg_n71944 (rg_mzhaifwchkshjjshq rg_n71945) {
        rg_n71933 = rg_n71945;
    }
}

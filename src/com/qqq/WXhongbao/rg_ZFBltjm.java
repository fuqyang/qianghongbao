
package com.qqq.WXhongbao;

public class rg_ZFBltjm extends rg_rwjchl {

    public rg_ZFBltjm ()  { }

    public static rg_mzhaifwchkshjjshq rg_n71917;
    protected static rg_ZFBltjm rg_n71918;
    protected String rg_n71919 = "com.alipay.mobile.chatapp.ui.GroupChatMsgActivity_";

    public void rg_n71682 (android.view.accessibility.AccessibilityEvent rg_n71920) {
        super.rg_n71682 (rg_n71920);
        if (rg_n71841 == false)
        {
            return;
        }
        if (hsh.Java.jb.rg_wbxl.rg_n52611 (String.valueOf(rg_n71920.getPackageName()), "com.eg.android.AlipayGphone", false) == false)
        {
            return;
        }
        if (hsh.Java.jb.rg_wbxl.rg_n52611 (String.valueOf(rg_n71920.getClassName()), rg_n71919, false) || hsh.Java.jb.rg_wbxl.rg_n52611 (String.valueOf(rg_n71920.getClassName()), "android.widget.ListView", false) || hsh.Java.jb.rg_wbxl.rg_n52611 (String.valueOf(rg_n71920.getClassName()), "android.widget.FrameLayout", false) || hsh.Java.jb.rg_wbxl.rg_n52611 (String.valueOf(rg_n71920.getClassName()), "android.app.AlertDialog", false))
        {
            java.util.List<android.view.accessibility.AccessibilityNodeInfo> rg_n71921;
            android.view.accessibility.AccessibilityNodeInfo rg_n71922;
            int rg_n71926;
            android.graphics.Rect rg_n71927 = new android.graphics.Rect ();
            int rg_n71928;
            int rg_n71929;
            rg_n71921 = anzh.mm.mzhaicz.rg_mzhaifzhl.rg_n64017 ("一个红包", null);
            rg_n71926 = rg_n71921.size ();
            if (rg_n71921 != null && rg_n71921.size () > 0)
            {
                rg_n71922 = rg_n71921.get (rg_qjbll.rg_n71721);
                if (rg_n71922 != null)
                {
                    rg_n71922.getBoundsInScreen(rg_n71927);
                    rg_n71928 = rg_n71927.centerX ();
                    rg_n71929 = rg_n71927.centerY ();
                    anzh.mm.mzhaicz.rg_mzhaifzhl.rg_n63893 (rg_n71928, rg_n71929);
                    if (rg_qjbll.rg_n71721 <= rg_n71921.size () - 2)
                    {
                        rg_qjbll.rg_n71721 = rg_qjbll.rg_n71721 + 1;
                    }
                    rg_ZFBltjm.rg_n71930 ().rg_n71841 = false;
                    rg_ZFBgbkjm.rg_n71943 ().rg_n71841 = true;
                }
            }
            else
            {
                rg_ZFBltjm.rg_n71930 ().rg_n71841 = true;
                rg_ZFBgbkjm.rg_n71943 ().rg_n71841 = false;
            }
        }
        return;
    }

    public static synchronized rg_ZFBltjm rg_n71930 () {
        if (rg_n71918 == null)
        {
            rg_n71918 = new rg_ZFBltjm ();
        }
        return (rg_n71918);
    }

    public static void rg_n71931 (rg_mzhaifwchkshjjshq rg_n71932) {
        rg_n71917 = rg_n71932;
    }
}

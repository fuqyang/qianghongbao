
package com.qqq.WXhongbao;

public class rg_gbkjm extends rg_rwjchl {

    public rg_gbkjm ()  { }

    public static rg_mzhaifwchkshjjshq rg_n71879;
    protected static rg_gbkjm rg_n71880;
    protected String rg_n71881 = "com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNotHookReceiveUI";

    public void rg_n71682 (android.view.accessibility.AccessibilityEvent rg_n71882) {
        super.rg_n71682 (rg_n71882);
        if (rg_n71841 == false)
        {
            return;
        }
        if (hsh.Java.jb.rg_wbxl.rg_n52611 (String.valueOf(rg_n71882.getPackageName()), rg_chxgjl.rg_n71726, false) == false)
        {
            return;
        }
        if (rg_n71882.getEventType() != hsh.anzh.gn.mzhaifw.rg_mzhaishjlx.rg_n333)
        {
            return;
        }
        if (hsh.Java.jb.rg_wbxl.rg_n52611 (String.valueOf(rg_n71882.getClassName()), rg_n71881, false))
        {
            java.util.List<android.view.accessibility.AccessibilityNodeInfo> rg_n71883;
            android.view.accessibility.AccessibilityNodeInfo rg_n71884;
            rg_n71883 = anzh.mm.mzhaicz.rg_mzhaifzhl.rg_n64002 ("com.tencent.mm:id/den", rg_n71842.getRootInActiveWindow ());
            if (rg_n71883 != null && rg_n71883.size () > 0)
            {
                rg_n71884 = rg_n71883.get (0);
                hsh.anzh.gn.mzhaifw.rg_mzhaijdxxl.rg_n720 (rg_n71884, hsh.anzh.gn.mzhaifw.rg_mzhaifwjddzlx.rg_n869, null);
                hsh.Java.jb.rg_xchjchl.rg_n52934 (2000);
                if (rg_n71879 != null)
                {
                    rg_n71879.rg_n71894 (hsh.anzh.gn.mzhaifw.rg_mzhaifwqjczlx.rg_n180);
                }
                rg_qgbrwl.rg_n71868 ().rg_n71841 = true;
                rg_gbykjm.rg_n71876 ().rg_n71841 = false;
                rg_gbkjm.rg_n71886 ().rg_n71841 = false;
            }
            else
            {
                if (rg_n71879 != null)
                {
                    rg_n71879.rg_n71894 (hsh.anzh.gn.mzhaifw.rg_mzhaifwqjczlx.rg_n180);
                }
            }
        }
        return;
    }

    public static synchronized rg_gbkjm rg_n71886 () {
        if (rg_n71880 == null)
        {
            rg_n71880 = new rg_gbkjm ();
        }
        return (rg_n71880);
    }

    public static void rg_n71887 (rg_mzhaifwchkshjjshq rg_n71888) {
        rg_n71879 = rg_n71888;
    }
}

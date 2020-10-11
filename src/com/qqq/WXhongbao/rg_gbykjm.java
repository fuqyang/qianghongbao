
package com.qqq.WXhongbao;

public class rg_gbykjm extends rg_rwjchl {

    public rg_gbykjm ()  { }

    public static rg_mzhaifwchkshjjshq rg_n71869;
    protected static rg_gbykjm rg_n71870;
    protected String rg_n71871 = "com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyDetailUI";

    public void rg_n71682 (android.view.accessibility.AccessibilityEvent rg_n71872) {
        super.rg_n71682 (rg_n71872);
        if (rg_n71841 == false)
        {
            return;
        }
        if (hsh.Java.jb.rg_wbxl.rg_n52611 (String.valueOf(rg_n71872.getPackageName()), rg_chxgjl.rg_n71726, false) == false)
        {
            return;
        }
        if (rg_n71872.getEventType() != hsh.anzh.gn.mzhaifw.rg_mzhaishjlx.rg_n333)
        {
            return;
        }
        if (hsh.Java.jb.rg_wbxl.rg_n52611 (String.valueOf(rg_n71872.getClassName()), rg_n71871, false))
        {
            if (rg_n71869 != null)
            {
                rg_n71869.rg_n71894 (hsh.anzh.gn.mzhaifw.rg_mzhaifwqjczlx.rg_n180);
            }
            rg_qgbrwl.rg_n71868 ().rg_n71841 = true;
            rg_gbykjm.rg_n71876 ().rg_n71841 = false;
            rg_gbkjm.rg_n71886 ().rg_n71841 = false;
        }
        else if (hsh.Java.jb.rg_wbxl.rg_n52611 (String.valueOf(rg_n71872.getClassName()), "com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNotHookReceiveUI", false))
        {
            java.util.List<android.view.accessibility.AccessibilityNodeInfo> rg_n71873;
            android.view.accessibility.AccessibilityNodeInfo rg_n71874;
            rg_n71873 = anzh.mm.mzhaicz.rg_mzhaifzhl.rg_n64002 ("com.tencent.mm:id/den", rg_n71842.getRootInActiveWindow ());
            if (rg_n71873 != null && rg_n71873.size () > 0)
            {
                rg_n71874 = rg_n71873.get (0);
                hsh.anzh.gn.mzhaifw.rg_mzhaijdxxl.rg_n720 (rg_n71874, hsh.anzh.gn.mzhaifw.rg_mzhaifwjddzlx.rg_n869, null);
                hsh.Java.jb.rg_xchjchl.rg_n52934 (2000);
                if (rg_n71869 != null)
                {
                    rg_n71869.rg_n71894 (hsh.anzh.gn.mzhaifw.rg_mzhaifwqjczlx.rg_n180);
                }
                rg_qgbrwl.rg_n71868 ().rg_n71841 = true;
                rg_gbykjm.rg_n71876 ().rg_n71841 = false;
                rg_gbkjm.rg_n71886 ().rg_n71841 = false;
            }
            else
            {
                if (rg_n71869 != null)
                {
                    rg_n71869.rg_n71894 (hsh.anzh.gn.mzhaifw.rg_mzhaifwqjczlx.rg_n180);
                    rg_qgbrwl.rg_n71868 ().rg_n71841 = true;
                    rg_gbykjm.rg_n71876 ().rg_n71841 = false;
                    rg_gbkjm.rg_n71886 ().rg_n71841 = false;
                }
            }
        }
        return;
    }

    public static synchronized rg_gbykjm rg_n71876 () {
        if (rg_n71870 == null)
        {
            rg_n71870 = new rg_gbykjm ();
        }
        return (rg_n71870);
    }

    public static void rg_n71877 (rg_mzhaifwchkshjjshq rg_n71878) {
        rg_n71869 = rg_n71878;
    }
}

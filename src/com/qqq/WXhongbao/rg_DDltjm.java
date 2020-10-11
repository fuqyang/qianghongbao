
package com.qqq.WXhongbao;

public class rg_DDltjm extends rg_rwjchl {

    public rg_DDltjm ()  { }

    public static rg_mzhaifwchkshjjshq rg_n71679;
    protected static rg_DDltjm rg_n71680;
    protected String rg_n71681 = "";

    public void rg_n71682 (android.view.accessibility.AccessibilityEvent rg_n71683) {
        super.rg_n71682 (rg_n71683);
        if (rg_n71841 == false)
        {
            return;
        }
        if (hsh.Java.jb.rg_wbxl.rg_n52611 (String.valueOf(rg_n71683.getPackageName()), "com.alibaba.android.rimet", false) == false)
        {
            return;
        }
        java.util.List<android.view.accessibility.AccessibilityNodeInfo> rg_n71684;
        android.view.accessibility.AccessibilityNodeInfo rg_n71685;
        int rg_n71686;
        rg_n71684 = rg_n71849 ("com.alibaba.android.rimet:id/chatting_content_view_stub");
        rg_n71686 = rg_n71684.size ();
        if (rg_n71684 != null && rg_n71684.size () > 0)
        {
            rg_n71685 = rg_n71684.get (rg_qjbll.rg_n71722);
            if (rg_n71685 != null)
            {
                rg_n71854 (rg_n71685);
                if (rg_qjbll.rg_n71722 <= rg_n71686 - 2)
                {
                    rg_qjbll.rg_n71722 = rg_qjbll.rg_n71722 + 1;
                }
                rg_DDltjm.rg_n71687 ().rg_n71841 = false;
                rg_DDgbkjm.rg_n71697 ().rg_n71841 = true;
            }
        }
        else
        {
            rg_DDltjm.rg_n71687 ().rg_n71841 = true;
            rg_DDgbkjm.rg_n71697 ().rg_n71841 = false;
        }
        return;
    }

    public static synchronized rg_DDltjm rg_n71687 () {
        if (rg_n71680 == null)
        {
            rg_n71680 = new rg_DDltjm ();
        }
        return (rg_n71680);
    }

    public static void rg_n71688 (rg_mzhaifwchkshjjshq rg_n71689) {
        rg_n71679 = rg_n71689;
    }
}

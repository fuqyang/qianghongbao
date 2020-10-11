
package com.qqq.WXhongbao;

public class rg_DDgbkjm extends rg_rwjchl {

    public rg_DDgbkjm ()  { }

    public static rg_mzhaifwchkshjjshq rg_n71690;
    protected static rg_DDgbkjm rg_n71691;
    protected String rg_n71692 = "com.alibaba.android.dingtalk.redpackets.activities.FestivalRedPacketsPickActivity";

    public void rg_n71682 (android.view.accessibility.AccessibilityEvent rg_n71693) {
        super.rg_n71682 (rg_n71693);
        if (rg_n71841 == false)
        {
            return;
        }
        if (hsh.Java.jb.rg_wbxl.rg_n52611 (String.valueOf(rg_n71693.getPackageName()), "com.alibaba.android.rimet", false) == false)
        {
            return;
        }
        if (rg_n71693.getEventType() != hsh.anzh.gn.mzhaifw.rg_mzhaishjlx.rg_n333)
        {
            return;
        }
        if (hsh.Java.jb.rg_wbxl.rg_n52611 (String.valueOf(rg_n71693.getClassName()), rg_n71692, false) || hsh.Java.jb.rg_wbxl.rg_n52611 (String.valueOf(rg_n71693.getClassName()), "com.toshiba_dealin.developerhelper.ui.activity.HierarchyActivity", false))
        {
            android.view.accessibility.AccessibilityNodeInfo rg_n71695;
            rg_n71695 = rg_n71846 ("com.alibaba.android.rimet:id/rl_content");
            if (rg_n71695 != null)
            {
                anzh.mm.mzhaicz.rg_mzhaifzhl.rg_n63893 (500, 1250);
                hsh.Java.jb.rg_xchjchl.rg_n52934 (2000);
                if (rg_n71690 != null)
                {
                    rg_n71690.rg_n71894 (hsh.anzh.gn.mzhaifw.rg_mzhaifwqjczlx.rg_n180);
                }
                rg_DDltjm.rg_n71687 ().rg_n71841 = true;
                rg_DDgbkjm.rg_n71697 ().rg_n71841 = false;
                hsh.Java.jb.rg_xchjchl.rg_n52934 (500);
            }
            else
            {
                if (rg_n71690 != null)
                {
                    rg_n71690.rg_n71894 (hsh.anzh.gn.mzhaifw.rg_mzhaifwqjczlx.rg_n180);
                }
                rg_DDltjm.rg_n71687 ().rg_n71841 = true;
                rg_DDgbkjm.rg_n71697 ().rg_n71841 = false;
            }
        }
        else if (hsh.Java.jb.rg_wbxl.rg_n52611 (String.valueOf(rg_n71693.getClassName()), "com.alibaba.android.dingtalk.redpackets.activities.RedPacketsDetailActivity", false))
        {
            if (rg_n71690 != null)
            {
                rg_n71690.rg_n71894 (hsh.anzh.gn.mzhaifw.rg_mzhaifwqjczlx.rg_n180);
            }
            rg_DDltjm.rg_n71687 ().rg_n71841 = true;
            rg_DDgbkjm.rg_n71697 ().rg_n71841 = false;
            hsh.Java.jb.rg_xchjchl.rg_n52934 (500);
        }
        return;
    }

    public static synchronized rg_DDgbkjm rg_n71697 () {
        if (rg_n71691 == null)
        {
            rg_n71691 = new rg_DDgbkjm ();
        }
        return (rg_n71691);
    }

    public static void rg_n71698 (rg_mzhaifwchkshjjshq rg_n71699) {
        rg_n71690 = rg_n71699;
    }
}

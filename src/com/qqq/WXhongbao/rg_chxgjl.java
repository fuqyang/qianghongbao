
package com.qqq.WXhongbao;

public class rg_chxgjl {

    public rg_chxgjl ()  { }

    protected static final String rg_n71725 = "com.qqq.WXhongbao/.AutoService";
    public static final String rg_n71726 = "com.tencent.mm";

    public static boolean rg_n71727 (android.content.Context rg_n71728) {
        android.view.accessibility.AccessibilityManager rg_n71729;
        rg_n71729 = (android.view.accessibility.AccessibilityManager)rg_n71728.getSystemService (hsh.anzh.jb.rg_anzhhj.rg_n5034);
        if (rg_n71729 == null)
        {
            return (false);
        }
        java.util.List<android.accessibilityservice.AccessibilityServiceInfo> rg_n71730;
        rg_n71730 = rg_n71729.getEnabledAccessibilityServiceList(hsh.anzh.gn.mzhaifw.rg_mzhaifklx.rg_n338);
        if (rg_n71730 == null || rg_n71730.size () == 0)
        {
            return (false);
        }
        int rg_n71731 = 0;
        for (rg_n71731 = 0; rg_n71731 < rg_n71730.size (); rg_n71731++)
        {
            android.accessibilityservice.AccessibilityServiceInfo rg_n71732;
            rg_n71732 = rg_n71730.get (rg_n71731);
            if (hsh.Java.jb.rg_wbxl.rg_n52611 (rg_n71732.getId(), rg_n71725, false))
            {
                return (true);
            }
        }
        return (false);
    }
}

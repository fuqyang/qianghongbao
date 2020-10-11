
package com.qqq.WXhongbao;

public class rg_QQltjm extends rg_rwjchl {

    public rg_QQltjm ()  { }

    public static rg_mzhaifwchkshjjshq rg_n71700;
    protected static rg_QQltjm rg_n71701;
    protected String rg_n71702 = "com.tencent.mobileqq.activity.ChatActivity";

    public void rg_n71682 (android.view.accessibility.AccessibilityEvent rg_n71703) {
        super.rg_n71682 (rg_n71703);
        if (rg_n71841 == false)
        {
            return;
        }
        if (hsh.Java.jb.rg_wbxl.rg_n52611 (String.valueOf(rg_n71703.getPackageName()), "com.tencent.mobileqq", false) == false)
        {
            return;
        }
        if (hsh.Java.jb.rg_wbxl.rg_n52611 (String.valueOf(rg_n71703.getClassName()), rg_n71702, false) || hsh.Java.jb.rg_wbxl.rg_n52611 (String.valueOf(rg_n71703.getClassName()), "android.widget.ListView", false) || hsh.Java.jb.rg_wbxl.rg_n52611 (String.valueOf(rg_n71703.getClassName()), "android.widget.FrameLayout", false) || hsh.Java.jb.rg_wbxl.rg_n52611 (String.valueOf(rg_n71703.getClassName()), "android.widget.AbsListView", false) || hsh.Java.jb.rg_wbxl.rg_n52611 (String.valueOf(rg_n71703.getClassName()), "com.tencent.mobileqq.activity.SplashActivity", false))
        {
            java.util.List<android.view.accessibility.AccessibilityNodeInfo> rg_n71704;
            android.view.accessibility.AccessibilityNodeInfo rg_n71705;
            rg_n71704 = rg_n71849 ("com.tencent.mobileqq:id/h3v");
            if (rg_n71704 != null && rg_n71704.size () > 0)
            {
                rg_n71705 = rg_n71704.get (rg_qjbll.rg_n71720);
                if (rg_n71705 != null && (String.valueOf(rg_n71705.getContentDescription()).contains ("口令:")))
                {
                    rg_n71854 (rg_n71705);
                    if (rg_qjbll.rg_n71720 <= rg_n71704.size () - 2)
                    {
                        rg_qjbll.rg_n71720 = rg_qjbll.rg_n71720 + 1;
                    }
                    android.view.accessibility.AccessibilityNodeInfo rg_n71707;
                    android.view.accessibility.AccessibilityNodeInfo rg_n71708;
                    android.view.accessibility.AccessibilityNodeInfo rg_n71709;
                    rg_n71708 = rg_n71846 ("com.tencent.mobileqq:id/input");
                    rg_n71707 = rg_n71846 ("com.tencent.mobileqq:id/fun_btn");
                    rg_n71709 = rg_n71846 ("com.tencent.mobileqq:id/awh");
                    if (rg_n71709 != null && rg_n71708 != null && rg_n71707 != null)
                    {
                        rg_n71854 (rg_n71709);
                        rg_n71854 (rg_n71707);
                        hsh.Java.jb.rg_xchjchl.rg_n52934 (2000);
                        if (rg_n71700 != null)
                        {
                            rg_n71700.rg_n71894 (hsh.anzh.gn.mzhaifw.rg_mzhaifwqjczlx.rg_n180);
                        }
                        hsh.Java.jb.rg_xchjchl.rg_n52934 (2000);
                        rg_n71856 (rg_n71708, "感谢老板");
                        rg_n71854 (rg_n71707);
                    }
                    else
                    {
                        hsh.Java.jb.rg_xchjchl.rg_n52934 (2000);
                        if (rg_n71700 != null)
                        {
                            rg_n71700.rg_n71894 (hsh.anzh.gn.mzhaifw.rg_mzhaifwqjczlx.rg_n180);
                        }
                    }
                }
                else if (rg_n71705 != null)
                {
                    rg_n71854 (rg_n71705);
                    if (rg_qjbll.rg_n71720 <= rg_n71704.size () - 2)
                    {
                        rg_qjbll.rg_n71720 = rg_qjbll.rg_n71720 + 1;
                    }
                    hsh.Java.jb.rg_xchjchl.rg_n52934 (2000);
                    if (rg_n71700 != null)
                    {
                        rg_n71700.rg_n71894 (hsh.anzh.gn.mzhaifw.rg_mzhaifwqjczlx.rg_n180);
                    }
                    hsh.Java.jb.rg_xchjchl.rg_n52934 (2000);
                    android.view.accessibility.AccessibilityNodeInfo rg_n71710;
                    android.view.accessibility.AccessibilityNodeInfo rg_n71711;
                    rg_n71711 = rg_n71846 ("com.tencent.mobileqq:id/input");
                    rg_n71710 = rg_n71846 ("com.tencent.mobileqq:id/fun_btn");
                    if (rg_n71711 != null)
                    {
                        rg_n71856 (rg_n71711, "感谢老板");
                        rg_n71854 (rg_n71710);
                    }
                }
            }
        }
        return;
    }

    public static synchronized rg_QQltjm rg_n71712 () {
        if (rg_n71701 == null)
        {
            rg_n71701 = new rg_QQltjm ();
        }
        return (rg_n71701);
    }

    public static void rg_n71713 (rg_mzhaifwchkshjjshq rg_n71714) {
        rg_n71700 = rg_n71714;
    }
}

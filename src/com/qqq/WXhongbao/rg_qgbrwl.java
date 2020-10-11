
package com.qqq.WXhongbao;

public class rg_qgbrwl extends rg_rwjchl {

    public rg_qgbrwl ()  { }

    protected static rg_qgbrwl rg_n71860;
    public static rg_mzhaifwchkshjjshq rg_n71861;
    protected String rg_n71862 = "com.tencent.mm.ui.LauncherUI";

    public static void rg_n71863 (rg_mzhaifwchkshjjshq rg_n71864) {
        rg_n71861 = rg_n71864;
    }

    public void rg_n71682 (android.view.accessibility.AccessibilityEvent rg_n71865) {
        super.rg_n71682 (rg_n71865);
        hsh.anzh.jb.rg_chygn.rg_n13052 (String.valueOf(rg_n71865.getClassName()));
        hsh.anzh.jb.rg_chygn.rg_n13052 (String.valueOf (rg_n71841));
        if (rg_n71841 == false)
        {
            return;
        }
        if (hsh.Java.jb.rg_wbxl.rg_n52611 (String.valueOf(rg_n71865.getPackageName()), rg_chxgjl.rg_n71726, false) == false)
        {
            return;
        }
        if (hsh.Java.jb.rg_wbxl.rg_n52611 (String.valueOf(rg_n71865.getClassName()), rg_n71862, false) || hsh.Java.jb.rg_wbxl.rg_n52611 (String.valueOf(rg_n71865.getClassName()), "android.widget.ListView", false) || hsh.Java.jb.rg_wbxl.rg_n52611 (String.valueOf(rg_n71865.getClassName()), "android.widget.FrameLayout", false))
        {
            java.util.List<android.view.accessibility.AccessibilityNodeInfo> rg_n71866;
            android.view.accessibility.AccessibilityNodeInfo rg_n71867;
            rg_n71866 = rg_n71849 ("com.tencent.mm:id/al7");
            if (rg_n71866 != null && rg_n71866.size () > 0)
            {
                rg_n71867 = rg_n71866.get (rg_qjbll.rg_n71723);
                if (rg_n71867 != null)
                {
                    rg_n71854 (rg_n71867);
                    if (rg_qjbll.rg_n71723 <= rg_n71866.size () - 2)
                    {
                        rg_qjbll.rg_n71723 = rg_qjbll.rg_n71723 + 1;
                    }
                    rg_qgbrwl.rg_n71868 ().rg_n71841 = false;
                    rg_gbkjm.rg_n71886 ().rg_n71841 = false;
                    rg_gbykjm.rg_n71876 ().rg_n71841 = true;
                }
            }
            else
            {
                rg_qgbrwl.rg_n71868 ().rg_n71841 = true;
                rg_gbkjm.rg_n71886 ().rg_n71841 = false;
                rg_gbykjm.rg_n71876 ().rg_n71841 = false;
            }
        }
        return;
    }

    public static synchronized rg_qgbrwl rg_n71868 () {
        if (rg_n71860 == null)
        {
            rg_n71860 = new rg_qgbrwl ();
        }
        return (rg_n71860);
    }
}

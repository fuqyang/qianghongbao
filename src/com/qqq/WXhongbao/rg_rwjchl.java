
package com.qqq.WXhongbao;

public class rg_rwjchl {

    public rg_rwjchl ()  { }

    public boolean rg_n71841;
    protected hsh.anzh.gn.mzhaifw.rg_mzhaifwl rg_n71842;

    public void rg_n71843 (hsh.anzh.gn.mzhaifw.rg_mzhaifwl rg_n71844) {
        rg_n71842 = rg_n71844;
    }

    public void rg_n71682 (android.view.accessibility.AccessibilityEvent rg_n71845) {
    }

    public android.view.accessibility.AccessibilityNodeInfo rg_n71846 (String rg_n71847) {
        if (rg_n71842 == null)
        {
            throw new RuntimeException ("请先启用自动服务！");
        }
        java.util.List<android.view.accessibility.AccessibilityNodeInfo> rg_n71848;
        rg_n71848 = (rg_n71842.getRootInActiveWindow ().findAccessibilityNodeInfosByViewId(rg_n71847));
        if (rg_n71848 != null && rg_n71848.size () > 0)
        {
            return (rg_n71848.get (0));
        }
        return (null);
    }

    public java.util.List<android.view.accessibility.AccessibilityNodeInfo> rg_n71849 (String rg_n71850) {
        if (rg_n71842 == null)
        {
            throw new RuntimeException ("请先启用自动服务！");
        }
        return (rg_n71842.getRootInActiveWindow ().findAccessibilityNodeInfosByViewId(rg_n71850));
    }

    public boolean rg_n71854 (android.view.accessibility.AccessibilityNodeInfo rg_n71855) {
        if (rg_n71855 == null)
        {
            return (false);
        }
        while (rg_n71855 != null)
        {
            if (rg_n71855.isClickable())
            {
                return (hsh.anzh.gn.mzhaifw.rg_mzhaijdxxl.rg_n720 (rg_n71855, hsh.anzh.gn.mzhaifw.rg_mzhaifwjddzlx.rg_n869, null));
            }
            rg_n71855 = rg_n71855.getParent();
        }
        return (false);
    }

    public void rg_n71856 (android.view.accessibility.AccessibilityNodeInfo rg_n71857, String rg_n71858) {
        while (rg_n71857.isEditable())
        {
            if (android.os.Build.VERSION.SDK_INT >= 21)
            {
                android.os.Bundle rg_n71859 = new android.os.Bundle ();
                rg_n71859.putString (hsh.anzh.gn.mzhaifw.rg_mzhaifwjddzcshlx.rg_n863, rg_n71858);
                hsh.anzh.gn.mzhaifw.rg_mzhaijdxxl.rg_n720 (rg_n71857, hsh.anzh.gn.mzhaifw.rg_mzhaifwjddzlx.rg_n885, rg_n71859);
                return;
            }
            else if (android.os.Build.VERSION.SDK_INT >= 18)
            {
                hsh.anzh.jb.rg_jtbglq.rg_n4503 (rg_n71858, null);
                hsh.anzh.gn.mzhaifw.rg_mzhaijdxxl.rg_n720 (rg_n71857, hsh.anzh.gn.mzhaifw.rg_mzhaifwjddzlx.rg_n867, null);
                hsh.anzh.gn.mzhaifw.rg_mzhaijdxxl.rg_n720 (rg_n71857, hsh.anzh.gn.mzhaifw.rg_mzhaifwjddzlx.rg_n876, null);
                return;
            }
            rg_n71857 = rg_n71857.getParent();
        }
    }
}

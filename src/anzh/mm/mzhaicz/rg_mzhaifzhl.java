
package anzh.mm.mzhaicz;

import java.lang.ref.WeakReference;

public class rg_mzhaifzhl {

    public rg_mzhaifzhl ()  { }

    private static java.lang.ref.WeakReference<android.accessibilityservice.AccessibilityService> serviceWeakReference;
    private static java.util.List<android.view.accessibility.AccessibilityNodeInfo>allNodes = new java.util.ArrayList<android.view.accessibility.AccessibilityNodeInfo>();
    private static void refreshAllNode(android.view.accessibility.AccessibilityNodeInfo parent){
        if (serviceWeakReference != null && serviceWeakReference.get() != null){
            allNodes.clear();
            getAllNodes(parent == null ? serviceWeakReference.get().getRootInActiveWindow() : parent);
        }
    }
    private static void getAllNodes(android.view.accessibility.AccessibilityNodeInfo parent){
        if (parent == null) return;
        allNodes.add(parent);
        if (parent.getChildCount() > 0){
            for (int i = 0; i < parent.getChildCount(); i++){
                if (parent.getChild(i) != null && parent.getChild(i).getChildCount() > 0){
                    getAllNodes(parent.getChild(i));
                }else{
                    allNodes.add(parent.getChild(i));
                }
            }
        }
    }

    public static synchronized void rg_n63877 (android.accessibilityservice.AccessibilityService rg_n63878) {
        if (serviceWeakReference == null && rg_n63878 != null){
            serviceWeakReference = new WeakReference<android.accessibilityservice.AccessibilityService>(rg_n63878);
        }
    }

    public static boolean rg_n63893 (int rg_n63894, int rg_n63895) {
        if (android.os.Build.VERSION.SDK_INT >= 24)
        {
            android.accessibilityservice.GestureDescription.Builder rg_n63896 = new android.accessibilityservice.GestureDescription.Builder ();
            android.graphics.Path rg_n63897 = new android.graphics.Path ();
            rg_n63897.moveTo ((float)rg_n63894, (float)rg_n63895);
            android.accessibilityservice.GestureDescription.StrokeDescription rg_n63898;
            rg_n63898 = new android.accessibilityservice.GestureDescription.StrokeDescription(rg_n63897, 0, 50);
            rg_n63896.addStroke(rg_n63898);
            if (serviceWeakReference != null && serviceWeakReference.get() != null){
                return serviceWeakReference.get().dispatchGesture(rg_n63896.build(), null, null);
            }
        }
        return (anzh.mm.zqzb.rg_Rootgjl.rg_n62420 ("input tap " + String.valueOf (rg_n63894) + " " + String.valueOf (rg_n63895)) == 0);
    }

    public static android.view.accessibility.AccessibilityNodeInfo rg_n63997 (String rg_n63998, android.view.accessibility.AccessibilityNodeInfo rg_n63999) {
        if (serviceWeakReference != null && serviceWeakReference.get() != null){
            refreshAllNode(rg_n63999);
            if (allNodes.isEmpty()) return null;
            for (android.view.accessibility.AccessibilityNodeInfo temp : allNodes){
                if (temp != null && temp.getContentDescription() != null && temp.getContentDescription().toString().contains(rg_n63998)){
                    return temp;
                }
            }
        }
        return null;
    }

    public static java.util.List<android.view.accessibility.AccessibilityNodeInfo> rg_n64002 (String rg_n64003, android.view.accessibility.AccessibilityNodeInfo rg_n64004) {
        if (serviceWeakReference != null && serviceWeakReference.get() != null){
            android.view.accessibility.AccessibilityNodeInfo rootNode = serviceWeakReference.get().getRootInActiveWindow();
            if (rootNode == null) return null;
            java.util.List<android.view.accessibility.AccessibilityNodeInfo> nodeInfoList = rg_n64004 == null ? rootNode.findAccessibilityNodeInfosByViewId(rg_n64003) : rg_n64004.findAccessibilityNodeInfosByViewId(rg_n64003);
            if (nodeInfoList != null && !nodeInfoList.isEmpty()) {
                return nodeInfoList;
            }
        }
        return null;
    }

    public static java.util.List<android.view.accessibility.AccessibilityNodeInfo> rg_n64017 (String rg_n64018, android.view.accessibility.AccessibilityNodeInfo rg_n64019) {
        if (serviceWeakReference != null && serviceWeakReference.get() != null){
            refreshAllNode(rg_n64019);
            if (allNodes.isEmpty()) return null;
            java.util.List<android.view.accessibility.AccessibilityNodeInfo>nodeList = new java.util.ArrayList<android.view.accessibility.AccessibilityNodeInfo>();
            for (android.view.accessibility.AccessibilityNodeInfo temp : allNodes){
                if (temp != null && temp.getContentDescription() != null && temp.getContentDescription().toString().contains(rg_n64018)){
                    nodeList.add(temp);
                }
            }
            return nodeList;
        }
        return null;
    }
}

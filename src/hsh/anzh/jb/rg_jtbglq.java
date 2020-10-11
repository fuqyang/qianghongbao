
package hsh.anzh.jb;

public class rg_jtbglq {

    public rg_jtbglq ()  { }

    android.content.ClipboardManager.OnPrimaryClipChangedListener m_listener;

    public static void rg_n4503 (String rg_n4504, String rg_n4505) {
        android.content.ClipboardManager mgrClip = (android.content.ClipboardManager)rg_yychx.sGetApp ().getSystemService (android.content.Context.CLIPBOARD_SERVICE);
        mgrClip.setPrimaryClip (android.content.ClipData.newPlainText (rg_n4505, rg_n4504));
    }
}

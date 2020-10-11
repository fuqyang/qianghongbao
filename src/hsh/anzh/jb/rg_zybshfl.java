
package hsh.anzh.jb;

public class rg_zybshfl {

    public static android.net.Uri rg_n9779 (android.app.Activity rg_n9780, java.io.File rg_n9781) {
        android.net.Uri fileUri = null;
        if (android.os.Build.VERSION.SDK_INT >= 24)
            fileUri = android.support.v4.content.FileProvider.getUriForFile(rg_n9780, rg_n9780.getPackageName() + ".fileprovider", rg_n9781);
        else
            fileUri = android.net.Uri.fromFile(rg_n9781);
        return fileUri;
    }
}

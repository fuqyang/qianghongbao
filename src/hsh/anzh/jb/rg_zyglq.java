
package hsh.anzh.jb;

public class rg_zyglq {

    public static double LP2DP (final int nUnitType, final double dbLPSize) {
        android.util.DisplayMetrics metrics = rg_yychx.rg_n2553 ().getDisplayMetrics ();
        switch (nUnitType) {
            case rg_chcchw.rg_n11871:
                return dbLPSize;
            case rg_chcchw.rg_n11872:
                return dbLPSize * metrics.density;
            case rg_chcchw.rg_n11873:
                return dbLPSize * metrics.scaledDensity;
            case rg_chcchw.rg_n11874:
                return dbLPSize * metrics.xdpi * (1.0 / 72);
            case rg_chcchw.rg_n11875:
                return dbLPSize * metrics.xdpi;
            case rg_chcchw.rg_n11876:
                return dbLPSize * metrics.xdpi * (1.0 / 25.4);
            }
        return 0;
    }
    public static double DP2LP (final int nUnitType, final double dbDPSize) {
        android.util.DisplayMetrics metrics = rg_yychx.rg_n2553 ().getDisplayMetrics ();
        switch (nUnitType) {
            case rg_chcchw.rg_n11871:
                return dbDPSize;
            case rg_chcchw.rg_n11872:
                return dbDPSize / metrics.density;
            case rg_chcchw.rg_n11873:
                return dbDPSize / metrics.scaledDensity;
            case rg_chcchw.rg_n11874:
                return dbDPSize * 72 / metrics.xdpi;
            case rg_chcchw.rg_n11875:
                return dbDPSize / metrics.xdpi;
            case rg_chcchw.rg_n11876:
                return dbDPSize * 25.4 / metrics.xdpi;
            }
        return 0;
    }

    public static String rg_n11898 (int rg_n11899, String rg_n11900) {
        if (rg_n11899 == (int)0)
            return rg_n11900;
        try {
            return rg_yychx.rg_n2553 ().getString (rg_n11899);
        } catch (Exception e) {
            return rg_n11900;
        }
    }

    public static android.graphics.drawable.Drawable rg_n11901 (int rg_n11902) {
        if (rg_n11902 == (int)0)
            return null;
        try {
            return rg_yychx.rg_n2553 ().getDrawable (rg_n11902);
        } catch (Exception e) {
            return null;
        }
    }
}

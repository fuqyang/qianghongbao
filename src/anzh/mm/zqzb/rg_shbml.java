
package anzh.mm.zqzb;

public class rg_shbml {

    public rg_shbml ()  { }

    public static final int rg_n62040 = 0;
    public static final int rg_n62041 = 1;
    public static final int rg_n62042 = 2;
    public static final int rg_n62043 = 3;
    public static final int rg_n62044 = 4;
    public static final int rg_n62045 = 5;
    public static final int rg_n62046 = 6;
    public static final int rg_n62047 = 7;
    public static final int rg_n62048 = 8;
    public static final int rg_n62049 = 9;
    public static final int rg_n62050 = 10;
    public static final int rg_n62051 = 11;
    public static final int rg_n62052 = 12;
    public static final int rg_n62053 = 13;

    public static String rg_n62054 (int rg_n62055, android.app.Activity rg_n62056) {
        android.telephony.TelephonyManager rg_n62057;
        rg_n62057 = (android.telephony.TelephonyManager)rg_n62056.getSystemService (hsh.anzh.jb.rg_anzhhj.rg_n5023);
        if (rg_n62057 != null)
        {
            if (rg_n62055 == rg_shbml.rg_n62040)
            {
                if (android.os.Build.VERSION.SDK_INT >= 26)
                {
                    return rg_n62057.getImei();
                }
                else
                {
                    String rg_n62058;
                    rg_n62058 = rg_n62057.getDeviceId();
                    if (rg_n62058 == null)
                    {
                        return ("");
                    }
                    return (rg_n62058);
                }
            }
            else if (rg_n62055 == rg_shbml.rg_n62041)
            {
                if (android.os.Build.VERSION.SDK_INT >= 26)
                {
                    String rg_n62059 = "";
                    rg_n62059= rg_n62057.getMeid();
                    if (rg_n62059 == null)
                    {
                        return ("");
                    }
                    return (rg_n62059);
                }
            }
            else if (rg_n62055 == rg_shbml.rg_n62042)
            {
                String rg_n62060;
                rg_n62060 = rg_n62057.getSubscriberId();
                if (rg_n62060 == null)
                {
                    return ("");
                }
                return (rg_n62060);
            }
            else if (rg_n62055 == rg_shbml.rg_n62043)
            {
                if (android.os.Build.VERSION.SDK_INT >= 28)
                {
                    int rg_n62061 = 0;
                    rg_n62061=rg_n62057.getSimCarrierId();
                    return (String.valueOf (rg_n62061));
                }
                return ("");
            }
            else if (rg_n62055 == rg_shbml.rg_n62044)
            {
                String rg_n62062 = "";
                if (android.os.Build.VERSION.SDK_INT >= 28)
                {
                    rg_n62062= String.valueOf (rg_n62057.getSimCarrierIdName());
                    if (rg_n62062 == null)
                    {
                        return ("");
                    }
                    return (rg_n62062);
                }
                return ("");
            }
            else if (rg_n62055 == rg_shbml.rg_n62045)
            {
                String rg_n62063;
                rg_n62063 = rg_n62057.getSimCountryIso();
                if (rg_n62063 == null)
                {
                    return ("");
                }
                return (rg_n62063);
            }
            else if (rg_n62055 == rg_shbml.rg_n62046)
            {
                String rg_n62064;
                rg_n62064 = rg_n62057.getSimSerialNumber();
                if (rg_n62064 == null)
                {
                    return ("");
                }
                return (rg_n62064);
            }
            else if (rg_n62055 == rg_shbml.rg_n62047)
            {
                String rg_n62065;
                rg_n62065 = rg_n62057.getSimOperator();
                if (rg_n62065 == null)
                {
                    return ("");
                }
                return (rg_n62065);
            }
            else if (rg_n62055 == rg_shbml.rg_n62048)
            {
                String rg_n62066;
                rg_n62066 = rg_n62057.getSimOperatorName();
                if (rg_n62066 == null)
                {
                    return ("");
                }
                return (rg_n62066);
            }
            else if (rg_n62055 == rg_shbml.rg_n62049)
            {
                String rg_n62067;
                rg_n62067 = rg_n62057.getNetworkOperatorName();
                if (rg_n62067 == null)
                {
                    return ("");
                }
                return (rg_n62067);
            }
            else if (rg_n62055 == rg_shbml.rg_n62050)
            {
                String rg_n62068;
                rg_n62068 = rg_n62057.getNetworkOperator();
                if (rg_n62068 == null)
                {
                    return ("");
                }
                return (rg_n62068);
            }
            else if (rg_n62055 == rg_shbml.rg_n62051)
            {
                return (rg_jtgjl.rg_n62198 ());
            }
            else if (rg_n62055 == rg_shbml.rg_n62052)
            {
                String rg_n62069;
                rg_n62069 = hsh.anzh.shb.dhgl.rg_jtxxl.rg_n26329 ();
                if (rg_n62069 == null)
                {
                    return ("");
                }
                return (rg_n62069);
            }
            else if (rg_n62055 == rg_shbml.rg_n62053)
            {
                return (hsh.anzh.shb.dhgl.rg_jtxxl.rg_n26340 (rg_n62056));
            }
            else
            {
                return ("");
            }
        }
        return ("");
    }
}


package anzh.mm.zqzb;

public class rg_zhfbgjl {

    public rg_zhfbgjl ()  { }

    public static boolean rg_n61775 (android.content.Context rg_n61776, String rg_n61777) {
        try
        {
            if (rg_yygjl.rg_n61862 (rg_n61776, "com.eg.android.AlipayGphone"))
            {
                android.content.Intent rg_n61778;
                String rg_n61779;
                rg_n61779 = hsh.Java.jb.rg_URLbml.rg_n54971 (rg_n61777, "UTF-8");
                rg_n61779 = "alipayqr://platformapi/startapp?saId=10000007&clientVersion=3.7.0.0718&qrcode=" + rg_n61779;
                rg_n61779 = rg_n61779 + "%3F_s%3Dweb-other&_t=" + String.valueOf (System.currentTimeMillis ());
                rg_n61778 = new android.content.Intent(hsh.anzh.jb.rg_qdczlx.rg_n10156, android.net.Uri.parse (rg_n61779));
                rg_n61778.addFlags(hsh.anzh.jb.rg_qdxxbzhlx.rg_n10260);
                hsh.anzh.jb.rg_anzhchkhj.rg_n4987 (rg_n61776, rg_n61778, null);
                return (true);
            }
            return (false);
        }
        catch (Exception e_catched)
        {
            return (false);
        }
    }
}


package anzh.mm.wlcz;

public class rg_wlchlfwl {

    public rg_wlchlfwl ()  { }

    protected static org.jsoup.nodes.Document rg_n64991;
    protected static com.lzy.okgo.model.Response rg_n65070;

    public static byte [] rg_n65048 (String rg_n65049, int rg_n65050, String rg_n65051, String rg_n65052, String rg_n65053, boolean rg_n65054) {
        hsh.anzh.wl.OKHTTPfw.rg_wlfwl rg_n65055 = new hsh.anzh.wl.OKHTTPfw.rg_wlfwl ();
        rg_n65055.rg_n45039 (3);
        com.lzy.okgo.model.HttpParams rg_n65056 = new com.lzy.okgo.model.HttpParams ();
        String rg_n65057;
        com.lzy.okgo.OkGo.getInstance().setOkHttpClient(com.lzy.okgo.OkGo.getInstance().getOkHttpClient().newBuilder().followRedirects(rg_n65054 ? false : true).build());
        if (rg_n65051.equals ("") == false)
        {
            if (rg_n65051.substring (0, 1).equals ("&"))
            {
                rg_n65057 = anzh.mm.jbshjlx.rg_wbczgjl.rg_n63655 (rg_n65051, 1);
            }
            else
            {
                rg_n65057 = rg_n65051;
            }
            String [] rg_n65058;
            int rg_n65059 = 0;
            rg_n65058 = anzh.mm.jbshjlx.rg_wbczgjl.rg_n63326 (rg_n65057, "&");
            for (rg_n65059 = 0; rg_n65059 < rg_n65058.length; rg_n65059++)
            {
                String [] rg_n65060;
                rg_n65060 = anzh.mm.jbshjlx.rg_wbczgjl.rg_n63326 (rg_n65058 [rg_n65059], "=");
                if (rg_n65060.length == 2)
                {
                    rg_n65056.put(rg_n65060 [0], rg_n65060 [1], false);
                }
                else if (rg_n65060.length == 1)
                {
                    rg_n65056.put(rg_n65060 [0], "", false);
                }
            }
        }
        com.lzy.okgo.model.HttpHeaders rg_n65061 = new com.lzy.okgo.model.HttpHeaders ();
        if (rg_n65052.equals ("") == false)
        {
            if (rg_n65052.toUpperCase ().startsWith (("Cookie".toUpperCase ()), 0))
            {
                String [] rg_n65062;
                rg_n65062 = anzh.mm.jbshjlx.rg_wbczgjl.rg_n63326 (rg_n65052, ":");
                rg_n65061.put(rg_n65062 [0], rg_n65062 [1]);
            }
            else
            {
                rg_n65061.put("Cookie", rg_n65052);
            }
        }
        if (rg_n65053.equals ("") == false)
        {
            String [] rg_n65063;
            rg_n65063 = anzh.mm.jbshjlx.rg_wbczgjl.rg_n63326 (rg_n65053, "\n");
            int rg_n65064 = 0;
            for (rg_n65064 = 0; rg_n65064 < rg_n65063.length; rg_n65064++)
            {
                String rg_n65065;
                String rg_n65066;
                rg_n65065 = anzh.mm.jbshjlx.rg_wbczgjl.rg_n63471 (rg_n65063 [rg_n65064], ":", 1);
                rg_n65066 = anzh.mm.jbshjlx.rg_wbczgjl.rg_n63655 (rg_n65063 [rg_n65064], rg_n65065.length () + 1);
                rg_n65061.put(rg_n65065, rg_n65066);
            }
        }
        String rg_n65067;
        if ((rg_n65049.toUpperCase ().startsWith ("HTTP", 0)) == false)
        {
            rg_n65067 = "http://" + rg_n65049;
        }
        else
        {
            rg_n65067 = rg_n65049;
        }
        rg_n65070 = rg_n65055.rg_n45005 (rg_n65067, rg_n65050, rg_n65056, rg_n65061, hsh.anzh.wl.OKHTTPfw.rg_wlfwhcmsh.rg_n45215, -1, null, false, false, null, null, null, null);
        return ((byte [])rg_n65070.body());
    }
}

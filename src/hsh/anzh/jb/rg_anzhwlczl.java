
package hsh.anzh.jb;

public class rg_anzhwlczl {

    public rg_anzhwlczl ()  { }

    public static byte [] rg_n10441 (String rg_n10442, int rg_n10443, String rg_n10444, String rg_n10445, String rg_n10446, boolean rg_n10447, String rg_n10448, int rg_n10449, int rg_n10450, rg_wlqqshjl rg_n10451) {
        java.net.URL rg_n10452;
        java.net.HttpURLConnection rg_n10453;
        String rg_n10454 = "GET";
        rg_n10452 = hsh.Java.jb.rg_URLl.rg_n51481 (rg_n10442);
        if (rg_n10452 == null)
        {
            return (new byte [0]);
        }
        if (rg_n10448 != null && hsh.Java.jb.rg_wbxl.rg_n52576 (rg_n10448) == false)
        {
            java.net.Proxy rg_n10455;
            java.net.InetSocketAddress rg_n10456;
            rg_n10456 = hsh.Java.jb.rg_tjzdzhl.rg_n51615 (rg_n10448, rg_n10449);
            rg_n10455 = hsh.Java.jb.rg_dll.rg_n51494 (hsh.Java.jb.rg_dll.rg_n51492, rg_n10456);
            rg_n10453 = (java.net.HttpURLConnection)hsh.Java.jb.rg_URLl.rg_n51488 (rg_n10452, rg_n10455);
        }
        else
        {
            rg_n10453 = (java.net.HttpURLConnection)hsh.Java.jb.rg_URLl.rg_n51486 (rg_n10452);
        }
        if (rg_n10453 == null)
        {
            return (new byte [0]);
        }
        hsh.Java.jb.rg_URLljl.rg_n51510 (rg_n10453, rg_n10450);
        if (rg_n10443 == 0)
        {
            hsh.Java.jb.rg_HTTPljl.rg_n51673 (rg_n10453, "GET");
        }
        else if (rg_n10443 == 1)
        {
            hsh.Java.jb.rg_HTTPljl.rg_n51673 (rg_n10453, "POST");
            hsh.Java.jb.rg_URLljl.rg_n51542 (rg_n10453, true);
            hsh.Java.jb.rg_URLljl.rg_n51537 (rg_n10453, true);
        }
        else if (rg_n10443 == 2)
        {
            hsh.Java.jb.rg_HTTPljl.rg_n51673 (rg_n10453, "HEAD");
        }
        else if (rg_n10443 == 3)
        {
            hsh.Java.jb.rg_HTTPljl.rg_n51673 (rg_n10453, "PUT");
            hsh.Java.jb.rg_URLljl.rg_n51542 (rg_n10453, true);
            hsh.Java.jb.rg_URLljl.rg_n51537 (rg_n10453, true);
        }
        else if (rg_n10443 == 4)
        {
            hsh.Java.jb.rg_HTTPljl.rg_n51673 (rg_n10453, "OPTIONS");
        }
        else if (rg_n10443 == 5)
        {
            hsh.Java.jb.rg_HTTPljl.rg_n51673 (rg_n10453, "DELETE");
        }
        else if (rg_n10443 == 6)
        {
            hsh.Java.jb.rg_HTTPljl.rg_n51673 (rg_n10453, "TRACE");
        }
        else
        {
            hsh.Java.jb.rg_HTTPljl.rg_n51673 (rg_n10453, rg_n10454);
        }
        if (hsh.Java.jb.rg_wbxl.rg_n52576 (rg_n10445) == false)
        {
            hsh.Java.jb.rg_URLljl.rg_n51593 (rg_n10453, "Cookie", rg_n10445);
        }
        if (rg_n10446 != null && hsh.Java.jb.rg_wbxl.rg_n52576 (rg_n10446) == false)
        {
            String [] rg_n10457;
            int rg_n10458 = 0;
            rg_n10457 = rg_n10446.split ("\n", 0);
            for (rg_n10458 = 0; rg_n10458 < rg_n10457.length; rg_n10458++)
            {
                String rg_n10459;
                String rg_n10460;
                int rg_n10461;
                rg_n10461 = (rg_n10457 [rg_n10458].indexOf (":", 0));
                if (rg_n10461 != -1)
                {
                    rg_n10459 = hsh.Java.jb.rg_wbxl.rg_n52694 (rg_n10457 [rg_n10458], 0, rg_n10461);
                    rg_n10460 = hsh.Java.jb.rg_wbxl.rg_n52694 (rg_n10457 [rg_n10458], rg_n10461 + 1, -1);
                    hsh.Java.jb.rg_URLljl.rg_n51593 (rg_n10453, rg_n10459, rg_n10460);
                }
            }
        }
        hsh.Java.jb.rg_HTTPljl.rg_n51668 (rg_n10453, rg_n10447);
        hsh.Java.jb.rg_URLljl.rg_n51601 (rg_n10453);
        if (rg_n10443 == 1 && rg_n10444 != null && hsh.Java.jb.rg_wbxl.rg_n52576 (rg_n10444) == false)
        {
            java.io.PrintWriter rg_n10462;
            rg_n10462 = hsh.Java.jb.rg_dyxchl.rg_n52461 (hsh.Java.jb.rg_URLljl.rg_n51554 (rg_n10453), false);
            if (rg_n10462 == null)
            {
                return (new byte [0]);
            }
            rg_n10462.print (rg_n10444);
            hsh.Java.jb.rg_xchl.rg_n52406 (rg_n10462);
        }
        if (hsh.Java.jb.rg_HTTPljl.rg_n51676 (rg_n10453) == hsh.Java.jb.rg_HTTPljl.rg_n51629 || hsh.Java.jb.rg_HTTPljl.rg_n51676 (rg_n10453) == hsh.Java.jb.rg_HTTPljl.rg_n51644)
        {
            java.io.InputStream rg_n10463;
            java.io.ByteArrayOutputStream rg_n10464 = new java.io.ByteArrayOutputStream ();
            rg_n10463 = hsh.Java.jb.rg_URLljl.rg_n51552 (rg_n10453);
            if (rg_n10451 != null)
            {
                rg_n10451.rg_n10427 = rg_n10453.getHeaderField("Set-Cookie");
                java.util.Set<String> rg_n10465;
                rg_n10465 = (hsh.Java.jb.rg_URLljl.rg_n51558 (rg_n10453).keySet());
                java.util.Iterator<String> rg_n10466;
                rg_n10466 = rg_n10465.iterator ();
                while (rg_n10466.hasNext ())
                {
                    String rg_n10467;
                    String rg_n10468;
                    rg_n10467 = hsh.Java.jb.rg_wbmjql.rg_n53489 (rg_n10466);
                    rg_n10468 = rg_n10453.getHeaderField(rg_n10467);
                    if (hsh.Java.jb.rg_wbxl.rg_n52576 (rg_n10451.rg_n10428))
                    {
                        rg_n10451.rg_n10428 = rg_n10467 + ":" + rg_n10468;
                    }
                    else
                    {
                        rg_n10451.rg_n10428 = rg_n10451.rg_n10428 + "\n" + rg_n10467 + ":" + rg_n10468;
                    }
                }
            }
            byte [] rg_n10469 = new byte [2048];
            int rg_n10470 = 0;
            while (rg_n10470 != -1)
            {
                rg_n10470 = hsh.Java.jb.rg_shrl.rg_n50828 (rg_n10463, rg_n10469, null);
                hsh.Java.jb.rg_shchl.rg_n50946 (rg_n10464, rg_n10469, 0, rg_n10470, null);
            }
            byte [] rg_n10471;
            rg_n10471 = rg_n10464.toByteArray ();
            hsh.Java.jb.rg_shrl.rg_n50820 (rg_n10463);
            hsh.Java.jb.rg_shchl.rg_n50941 (rg_n10464);
            return (rg_n10471);
        }
        else
        {
            rg_chygn.dbg_log (String.valueOf (hsh.Java.jb.rg_HTTPljl.rg_n51676 (rg_n10453)),"");
            return (new byte [0]);
        }
    }

    public void rg_n10472 (String rg_n10473, int rg_n10474) {
        hsh.Java.jb.rg_xchl1 rg_n10475 = new hsh.Java.jb.rg_xchl1 ();
        rg_n10475.rl_xchl1_n52944 (new hsh.Java.jb.rg_xchl1.re_n52944 () {
            public int dispatch (hsh.Java.jb.rg_xchl1 objSource, int nTagNumber, java.lang.Object rg_n52945, java.lang.Object rg_n52946) {
                return rg_n10489 (objSource, nTagNumber, rg_n52945, rg_n52946);
            }
        }, 0);
        rg_n10475.rg_n52941 ((Object)rg_n10473, (Object)rg_n10474);
    }

    protected int rg_n10489 (hsh.Java.jb.rg_xchl1 rg_n10490, int rg_n10491, java.lang.Object rg_n10492, java.lang.Object rg_n10493) {
        rg_wlqqshjl rg_n10494 = new rg_wlqqshjl ();
        byte [] rg_n10495;
        rg_n10495 = null;
        if (rg_n10491 == 0)
        {
            rg_n10495 = rg_n10441 (String.valueOf (rg_n10492), 0, null, null, null, true, null, 0, 5000, rg_n10494);
        }
        else if (rg_n10491 == 1)
        {
            android.os.Bundle rg_n10496;
            rg_n10496 = (android.os.Bundle)rg_n10492;
            rg_n10495 = rg_n10441 (rg_n10496.getString ("网址", ""), rg_n10496.getInt ("访问方式", 0), rg_n10496.getString ("提交信息", ""), rg_n10496.getString ("提交Cookies", ""), rg_n10496.getString ("附加协议头", ""), rg_n10496.getBoolean ("禁止重定向", false), rg_n10496.getString ("代理地址", ""), rg_n10496.getInt ("代理端口", 0), rg_n10496.getInt ("超时", 0), rg_n10494);
        }
        final byte[] data = rg_n10495;
        final String cookies = rg_n10494.rg_n10427;
        final String response = rg_n10494.rg_n10428;
        final int i = (int)(Integer)rg_n10493;
        if (rg_yychx.sIsUiThread ()) {
            try {
                rg_n10497(data, cookies, response, i);
            } catch (Exception e) { }
        } else {
            rg_yychx.sRunOnUiThread (new Runnable () {
                @Override public void run () {
                    try {
                        rg_n10497(data, cookies, response, i);
                    } catch (Exception e) { }
                } } );
        }
        return (0);
    }

    public static interface re_n10497 { int dispatch (rg_anzhwlczl objSource, int nTagNumber, byte [] rg_n10498, String rg_n10499, String rg_n10500, int rg_n10501); }
    private re_n10497 rd_n10497;
    private int rd_n10497_tag;
    public void rl_anzhwlczl_n10497 (re_n10497 objListener, int nTagNumber) {
        synchronized (this) { rd_n10497 = objListener;  rd_n10497_tag = nTagNumber; }
    }
    public int rg_n10497 (byte [] rg_n10498, String rg_n10499, String rg_n10500, int rg_n10501) {
        re_n10497 objDispatcher;  int nTagNumber;
        synchronized (this) { objDispatcher = rd_n10497;  nTagNumber = rd_n10497_tag; }
        return (objDispatcher != null ? objDispatcher.dispatch (this, nTagNumber, rg_n10498, rg_n10499, rg_n10500, rg_n10501) : 0);
    }
}

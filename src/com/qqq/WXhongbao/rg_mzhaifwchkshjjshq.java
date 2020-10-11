
package com.qqq.WXhongbao;

public class rg_mzhaifwchkshjjshq {

    public rg_mzhaifwchkshjjshq ()  { }

    public static interface re_n71894 { int dispatch (rg_mzhaifwchkshjjshq objSource, int nTagNumber, int rg_n71895); }
    private re_n71894 rd_n71894;
    private int rd_n71894_tag;
    public void rl_mzhaifwchkshjjshq_n71894 (re_n71894 objListener, int nTagNumber) {
        synchronized (this) { rd_n71894 = objListener;  rd_n71894_tag = nTagNumber; }
    }
    public int rg_n71894 (int rg_n71895) {
        re_n71894 objDispatcher;  int nTagNumber;
        synchronized (this) { objDispatcher = rd_n71894;  nTagNumber = rd_n71894_tag; }
        return (objDispatcher != null ? objDispatcher.dispatch (this, nTagNumber, rg_n71895) : 0);
    }
}

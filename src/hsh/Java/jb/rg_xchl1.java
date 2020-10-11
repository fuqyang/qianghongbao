
package hsh.Java.jb;

public class rg_xchl1 extends java.lang.Thread {

    private Object m_objUserData1, m_objUserData2;
    @Override
    public void run () {
        rg_n52944 (m_objUserData1, m_objUserData2);
        m_objUserData1 = m_objUserData2 = null;
    }

    public boolean rg_n52941 (java.lang.Object rg_n52942, java.lang.Object rg_n52943) {
        m_objUserData1 = rg_n52942;
        m_objUserData2 = rg_n52943;
        try {
            start ();
            return true;
        } catch (Exception e) { }
        m_objUserData1 = m_objUserData2 = null;
        return false;
    }

    public static interface re_n52944 { int dispatch (rg_xchl1 objSource, int nTagNumber, java.lang.Object rg_n52945, java.lang.Object rg_n52946); }
    private re_n52944 rd_n52944;
    private int rd_n52944_tag;
    public void rl_xchl1_n52944 (re_n52944 objListener, int nTagNumber) {
        synchronized (this) { rd_n52944 = objListener;  rd_n52944_tag = nTagNumber; }
    }
    public int rg_n52944 (java.lang.Object rg_n52945, java.lang.Object rg_n52946) {
        re_n52944 objDispatcher;  int nTagNumber;
        synchronized (this) { objDispatcher = rd_n52944;  nTagNumber = rd_n52944_tag; }
        return (objDispatcher != null ? objDispatcher.dispatch (this, nTagNumber, rg_n52945, rg_n52946) : 0);
    }
}


package hsh.anzh.wl.OKHTTPxz;

public class rg_wlxzjtl extends com.lzy.okserver.download.DownloadListener implements com.lzy.okserver.task.XExecutor.OnAllTaskEndListener {

    public rg_wlxzjtl(Object tag) {
        super(tag);
    }
    @Override
    public void onStart(com.lzy.okgo.model.Progress progress) {
        rg_n45445(tag,progress);
    }
    @Override
    public void onRemove(com.lzy.okgo.model.Progress progress) {
        rg_n45448(tag,progress);
    }
    @Override
    public void onProgress(com.lzy.okgo.model.Progress progress) {
        rg_n45451(tag,progress);
    }
    @Override
    public void onError(com.lzy.okgo.model.Progress progress) {
        rg_n45454(tag,progress);
    }
    @Override
    public void onFinish(java.io.File file, com.lzy.okgo.model.Progress progress) {
        rg_n45457(tag,file, progress);
    }
    @Override
    public void onAllTaskEnd() {
        rg_n45461(tag);
    }

    public static interface re_n45445 { int dispatch (rg_wlxzjtl objSource, int nTagNumber, java.lang.Object rg_n45446, com.lzy.okgo.model.Progress rg_n45447); }
    private re_n45445 rd_n45445;
    private int rd_n45445_tag;
    public void rl_wlxzjtl_n45445 (re_n45445 objListener, int nTagNumber) {
        synchronized (this) { rd_n45445 = objListener;  rd_n45445_tag = nTagNumber; }
    }
    public int rg_n45445 (java.lang.Object rg_n45446, com.lzy.okgo.model.Progress rg_n45447) {
        re_n45445 objDispatcher;  int nTagNumber;
        synchronized (this) { objDispatcher = rd_n45445;  nTagNumber = rd_n45445_tag; }
        return (objDispatcher != null ? objDispatcher.dispatch (this, nTagNumber, rg_n45446, rg_n45447) : 0);
    }

    public static interface re_n45448 { int dispatch (rg_wlxzjtl objSource, int nTagNumber, java.lang.Object rg_n45449, com.lzy.okgo.model.Progress rg_n45450); }
    private re_n45448 rd_n45448;
    private int rd_n45448_tag;
    public void rl_wlxzjtl_n45448 (re_n45448 objListener, int nTagNumber) {
        synchronized (this) { rd_n45448 = objListener;  rd_n45448_tag = nTagNumber; }
    }
    public int rg_n45448 (java.lang.Object rg_n45449, com.lzy.okgo.model.Progress rg_n45450) {
        re_n45448 objDispatcher;  int nTagNumber;
        synchronized (this) { objDispatcher = rd_n45448;  nTagNumber = rd_n45448_tag; }
        return (objDispatcher != null ? objDispatcher.dispatch (this, nTagNumber, rg_n45449, rg_n45450) : 0);
    }

    public static interface re_n45451 { int dispatch (rg_wlxzjtl objSource, int nTagNumber, java.lang.Object rg_n45452, com.lzy.okgo.model.Progress rg_n45453); }
    private re_n45451 rd_n45451;
    private int rd_n45451_tag;
    public void rl_wlxzjtl_n45451 (re_n45451 objListener, int nTagNumber) {
        synchronized (this) { rd_n45451 = objListener;  rd_n45451_tag = nTagNumber; }
    }
    public int rg_n45451 (java.lang.Object rg_n45452, com.lzy.okgo.model.Progress rg_n45453) {
        re_n45451 objDispatcher;  int nTagNumber;
        synchronized (this) { objDispatcher = rd_n45451;  nTagNumber = rd_n45451_tag; }
        return (objDispatcher != null ? objDispatcher.dispatch (this, nTagNumber, rg_n45452, rg_n45453) : 0);
    }

    public static interface re_n45454 { int dispatch (rg_wlxzjtl objSource, int nTagNumber, java.lang.Object rg_n45455, com.lzy.okgo.model.Progress rg_n45456); }
    private re_n45454 rd_n45454;
    private int rd_n45454_tag;
    public void rl_wlxzjtl_n45454 (re_n45454 objListener, int nTagNumber) {
        synchronized (this) { rd_n45454 = objListener;  rd_n45454_tag = nTagNumber; }
    }
    public int rg_n45454 (java.lang.Object rg_n45455, com.lzy.okgo.model.Progress rg_n45456) {
        re_n45454 objDispatcher;  int nTagNumber;
        synchronized (this) { objDispatcher = rd_n45454;  nTagNumber = rd_n45454_tag; }
        return (objDispatcher != null ? objDispatcher.dispatch (this, nTagNumber, rg_n45455, rg_n45456) : 0);
    }

    public static interface re_n45457 { int dispatch (rg_wlxzjtl objSource, int nTagNumber, java.lang.Object rg_n45458, java.io.File rg_n45459, com.lzy.okgo.model.Progress rg_n45460); }
    private re_n45457 rd_n45457;
    private int rd_n45457_tag;
    public void rl_wlxzjtl_n45457 (re_n45457 objListener, int nTagNumber) {
        synchronized (this) { rd_n45457 = objListener;  rd_n45457_tag = nTagNumber; }
    }
    public int rg_n45457 (java.lang.Object rg_n45458, java.io.File rg_n45459, com.lzy.okgo.model.Progress rg_n45460) {
        re_n45457 objDispatcher;  int nTagNumber;
        synchronized (this) { objDispatcher = rd_n45457;  nTagNumber = rd_n45457_tag; }
        return (objDispatcher != null ? objDispatcher.dispatch (this, nTagNumber, rg_n45458, rg_n45459, rg_n45460) : 0);
    }

    public static interface re_n45461 { int dispatch (rg_wlxzjtl objSource, int nTagNumber, java.lang.Object rg_n45462); }
    private re_n45461 rd_n45461;
    private int rd_n45461_tag;
    public void rl_wlxzjtl_n45461 (re_n45461 objListener, int nTagNumber) {
        synchronized (this) { rd_n45461 = objListener;  rd_n45461_tag = nTagNumber; }
    }
    public int rg_n45461 (java.lang.Object rg_n45462) {
        re_n45461 objDispatcher;  int nTagNumber;
        synchronized (this) { objDispatcher = rd_n45461;  nTagNumber = rd_n45461_tag; }
        return (objDispatcher != null ? objDispatcher.dispatch (this, nTagNumber, rg_n45462) : 0);
    }
}

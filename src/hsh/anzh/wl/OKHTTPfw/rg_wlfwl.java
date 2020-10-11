
package hsh.anzh.wl.OKHTTPfw;

public class rg_wlfwl {

    public rg_wlfwl () {
        rg_n45035 ();
    }

    private int getCacheMode(com.lzy.okgo.cache.CacheMode mode){
        switch(mode){
            case DEFAULT:
                return 0;
            case NO_CACHE:
                return 1;
            case REQUEST_FAILED_READ_CACHE:
                return 2;
            case IF_NONE_CACHE_REQUEST:
                return 3;
            case FIRST_CACHE_THEN_REQUEST:
                return 4;
        }
        return 0;
    }
    private com.lzy.okgo.cache.CacheMode setCacheMode(int mode){
        switch(mode){
            case 0:
                return com.lzy.okgo.cache.CacheMode.DEFAULT;
            case 1:
                return com.lzy.okgo.cache.CacheMode.NO_CACHE;
            case 2:
                return com.lzy.okgo.cache.CacheMode.REQUEST_FAILED_READ_CACHE;
            case 3:
                return com.lzy.okgo.cache.CacheMode.IF_NONE_CACHE_REQUEST;
            case 4:
                return com.lzy.okgo.cache.CacheMode.FIRST_CACHE_THEN_REQUEST;
        }
        return com.lzy.okgo.cache.CacheMode.DEFAULT;
    }
    private class BytesConvert implements com.lzy.okgo.convert.Converter<byte[]>{
        @Override
        public byte[] convertResponse(okhttp3.Response response) throws Throwable {
            okhttp3.ResponseBody body = response.body();
            return body == null ? new byte[0] : body.bytes();
        }
    }
    private abstract class BytesCallback extends com.lzy.okgo.callback.AbsCallback<byte[]>{
        private BytesConvert convert = new BytesConvert();
        public byte[] convertResponse(okhttp3.Response response) throws Throwable {
            byte[] bytes = this.convert.convertResponse(response);
            response.close();
            return bytes;
        }
    }
    private com.lzy.okgo.callback.StringCallback getStringCallback(final int indexTag){
        return new com.lzy.okgo.callback.StringCallback() {
            @Override
            public void onSuccess(com.lzy.okgo.model.Response<String> response) {
                rg_n45069(response.body(), response, response.getRawCall().request().tag(), indexTag);
            }
            @Override
            public void onCacheSuccess(com.lzy.okgo.model.Response<String> response) {
                rg_n45074(response, response.getRawCall().request().tag(), indexTag);
            }
            @Override
            public void onError(com.lzy.okgo.model.Response<String> response) {
                super.onError(response);
                rg_n45078(response.getException(), response, response.getRawCall().request().tag(), indexTag);
            }
            @Override
            public void onStart(com.lzy.okgo.request.base.Request<String, ? extends com.lzy.okgo.request.base.Request> request) {
                rg_n45083(request == null ? null : request.getTag(), indexTag);
            }
            @Override
            public void onFinish() {
                rg_n45086(indexTag);
            }
            @Override
            public void uploadProgress(com.lzy.okgo.model.Progress progress) {
                rg_n45088(progress, progress.request == null ? null : progress.request.getTag(), indexTag);
            }
            @Override
            public void downloadProgress(com.lzy.okgo.model.Progress progress) {
                rg_n45092(progress, progress.request == null ? null : progress.request.getTag(), indexTag);
            }
        };
    }
    private com.lzy.okgo.callback.BitmapCallback getBitmapCallback(final int indexTag){
        return new com.lzy.okgo.callback.BitmapCallback() {
            @Override
            public void onSuccess(com.lzy.okgo.model.Response<android.graphics.Bitmap> response) {
                rg_n45096(response.body(), response, response.getRawCall().request().tag(), indexTag);
            }
            @Override
            public void onCacheSuccess(com.lzy.okgo.model.Response<android.graphics.Bitmap> response) {
                rg_n45101(response, response.getRawCall().request().tag(), indexTag);
            }
            @Override
            public void onError(com.lzy.okgo.model.Response<android.graphics.Bitmap> response) {
                super.onError(response);
                rg_n45105(response.getException(), response, response.getRawCall().request().tag(), indexTag);
            }
            @Override
            public void onStart(com.lzy.okgo.request.base.Request<android.graphics.Bitmap, ? extends com.lzy.okgo.request.base.Request> request) {
                rg_n45110(request == null ? null : request.getTag(), indexTag);
            }
            @Override
            public void onFinish() {
                rg_n45113(indexTag);
            }
            @Override
            public void uploadProgress(com.lzy.okgo.model.Progress progress) {
                rg_n45115(progress, progress.request == null ? null : progress.request.getTag(), indexTag);
            }
            @Override
            public void downloadProgress(com.lzy.okgo.model.Progress progress) {
                rg_n45119(progress, progress.request == null ? null : progress.request.getTag(), indexTag);
            }
        };
    }
    private BytesCallback getBytesCallback(final int indexTag){
        return new BytesCallback() {
            @Override
            public void onSuccess(com.lzy.okgo.model.Response<byte[]> response) {
                rg_n45123(response.body(), response, response.getRawCall().request().tag(), indexTag);
            }
            @Override
            public void onCacheSuccess(com.lzy.okgo.model.Response<byte[]> response) {
                rg_n45128(response, response.getRawCall().request().tag(), indexTag);
            }
            @Override
            public void onError(com.lzy.okgo.model.Response<byte[]> response) {
                super.onError(response);
                rg_n45132(response.getException(), response, response.getRawCall().request().tag(), indexTag);
            }
            @Override
            public void onStart(com.lzy.okgo.request.base.Request<byte[], ? extends com.lzy.okgo.request.base.Request> request) {
                rg_n45137(request == null ? null : request.getTag(), indexTag);
            }
            @Override
            public void onFinish() {
                rg_n45140(indexTag);
            }
            @Override
            public void uploadProgress(com.lzy.okgo.model.Progress progress) {
                rg_n45142(progress, progress.request == null ? null : progress.request.getTag(), indexTag);
            }
            @Override
            public void downloadProgress(com.lzy.okgo.model.Progress progress) {
                rg_n45146(progress, progress.request == null ? null : progress.request.getTag(), indexTag);
            }
        };
    }
    private com.lzy.okgo.callback.FileCallback getFileCallback(final int indexTag, String folder, String fileName){
        return new com.lzy.okgo.callback.FileCallback(folder, fileName) {
            @Override
            public void onSuccess(com.lzy.okgo.model.Response<java.io.File> response) {
                rg_n45150(response.body(), response, response.getRawCall().request().tag(), indexTag);
            }
            @Override
            public void onCacheSuccess(com.lzy.okgo.model.Response<java.io.File> response) {
                rg_n45155(response, response.getRawCall().request().tag(), indexTag);
            }
            @Override
            public void onError(com.lzy.okgo.model.Response<java.io.File> response) {
                super.onError(response);
                rg_n45159(response.getException(), response, response.getRawCall().request().tag(), indexTag);
            }
            @Override
            public void onStart(com.lzy.okgo.request.base.Request<java.io.File, ? extends com.lzy.okgo.request.base.Request> request) {
                rg_n45164(request == null ? null : request.getTag(), indexTag);
            }
            @Override
            public void onFinish() {
                rg_n45167(indexTag);
            }
            @Override
            public void uploadProgress(com.lzy.okgo.model.Progress progress) {
                rg_n45169(progress, progress.request == null ? null : progress.request.getTag(), indexTag);
            }
            @Override
            public void downloadProgress(com.lzy.okgo.model.Progress progress) {
                rg_n45173(progress, progress.request == null ? null : progress.request.getTag(), indexTag);
            }
        };
    }

    public com.lzy.okgo.model.Response rg_n45005 (String rg_n45006, int rg_n45007, com.lzy.okgo.model.HttpParams rg_n45008, com.lzy.okgo.model.HttpHeaders rg_n45009, int rg_n45010, int rg_n45011, java.lang.Object rg_n45012, boolean rg_n45013, boolean rg_n45014, String rg_n45015, String rg_n45016, byte [] rg_n45017, java.io.File rg_n45018) {
        if (hsh.Java.jb.rg_wbxl.rg_n52576 (rg_n45006))
        {
            return (null);
        }
        if (rg_n45007 == rg_wlfwfsh.rg_n45177)
        {
            com.lzy.okgo.request.GetRequest request = com.lzy.okgo.OkGo.<byte[]>get(rg_n45006);
            if (rg_n45008 != null)
                request.params(rg_n45008);
            if (rg_n45009 != null)
                request.headers(rg_n45009);
            if (rg_n45010 != -1)
                request.cacheMode(setCacheMode(rg_n45010));
            if (rg_n45011 > -1)
                request.retryCount(rg_n45011);
            request.tag(rg_n45012);
            com.lzy.okgo.adapter.Call<byte[]> call = request.converter(new BytesConvert()).adapt();
            try {
                return call.execute();
            } catch (Exception e) {
                return null;
            }
        }
        else if (rg_n45007 == rg_wlfwfsh.rg_n45178)
        {
            com.lzy.okgo.request.PostRequest request = com.lzy.okgo.OkGo.<byte[]>post(rg_n45006);
            if (rg_n45008 != null)
                request.params(rg_n45008);
            if (rg_n45009 != null)
                request.headers(rg_n45009);
            if (rg_n45010 != -1)
                request.cacheMode(setCacheMode(rg_n45010));
            if (rg_n45011 > -1)
                request.retryCount(rg_n45011);
            request.tag(rg_n45012);
            if (rg_n45015 != null)
                request.upString(rg_n45015);
            if (rg_n45016 != null)
                request.upJson(rg_n45016);
            if (rg_n45017 != null)
                request.upBytes(rg_n45017);
            if (rg_n45018 != null)
                request.upFile(rg_n45018);
            request.isMultipart(rg_n45014);
            request.isSpliceUrl(rg_n45013);
            com.lzy.okgo.adapter.Call<byte[]> call = request.converter(new BytesConvert()).adapt();
            try {
                return call.execute();
            } catch (Exception e) {
                return null;
            }
        }
        else if (rg_n45007 == rg_wlfwfsh.rg_n45184)
        {
            com.lzy.okgo.request.TraceRequest request = com.lzy.okgo.OkGo.<byte[]>trace(rg_n45006);
            if (rg_n45008 != null)
                request.params(rg_n45008);
            if (rg_n45009 != null)
                request.headers(rg_n45009);
            if (rg_n45010 != -1)
                request.cacheMode(setCacheMode(rg_n45010));
            if (rg_n45011 > -1)
                request.retryCount(rg_n45011);
            request.tag(rg_n45012);
            com.lzy.okgo.adapter.Call<byte[]> call = request.converter(new BytesConvert()).adapt();
            try {
                return call.execute();
            } catch (Exception e) {
                return null;
            }
        }
        else if (rg_n45007 == rg_wlfwfsh.rg_n45181)
        {
            com.lzy.okgo.request.HeadRequest request = com.lzy.okgo.OkGo.<byte[]>head(rg_n45006);
            if (rg_n45008 != null)
                request.params(rg_n45008);
            if (rg_n45009 != null)
                request.headers(rg_n45009);
            if (rg_n45010 != -1)
                request.cacheMode(setCacheMode(rg_n45010));
            if (rg_n45011 > -1)
                request.retryCount(rg_n45011);
            request.tag(rg_n45012);
            com.lzy.okgo.adapter.Call<byte[]> call = request.converter(new BytesConvert()).adapt();
            try {
                return call.execute();
            } catch (Exception e) {
                return null;
            }
        }
        else if (rg_n45007 == rg_wlfwfsh.rg_n45182)
        {
            com.lzy.okgo.request.DeleteRequest request = com.lzy.okgo.OkGo.<byte[]>delete(rg_n45006);
            if (rg_n45008 != null)
                request.params(rg_n45008);
            if (rg_n45009 != null)
                request.headers(rg_n45009);
            if (rg_n45010 != -1)
                request.cacheMode(setCacheMode(rg_n45010));
            if (rg_n45011 > -1)
                request.retryCount(rg_n45011);
            request.tag(rg_n45012);
            if (rg_n45015 != null)
                request.upString(rg_n45015);
            if (rg_n45016 != null)
                request.upJson(rg_n45016);
            if (rg_n45017 != null)
                request.upBytes(rg_n45017);
            if (rg_n45018 != null)
                request.upFile(rg_n45018);
            request.isMultipart(rg_n45014);
            request.isSpliceUrl(rg_n45013);
            com.lzy.okgo.adapter.Call<byte[]> call = request.converter(new BytesConvert()).adapt();
            try {
                return call.execute();
            } catch (Exception e) {
                return null;
            }
        }
        else if (rg_n45007 == rg_wlfwfsh.rg_n45180)
        {
            com.lzy.okgo.request.OptionsRequest request = com.lzy.okgo.OkGo.<byte[]>options(rg_n45006);
            if (rg_n45008 != null)
                request.params(rg_n45008);
            if (rg_n45009 != null)
                request.headers(rg_n45009);
            if (rg_n45010 != -1)
                request.cacheMode(setCacheMode(rg_n45010));
            if (rg_n45011 > -1)
                request.retryCount(rg_n45011);
            request.tag(rg_n45012);
            if (rg_n45015 != null)
                request.upString(rg_n45015);
            if (rg_n45016 != null)
                request.upJson(rg_n45016);
            if (rg_n45017 != null)
                request.upBytes(rg_n45017);
            if (rg_n45018 != null)
                request.upFile(rg_n45018);
            request.isMultipart(rg_n45014);
            request.isSpliceUrl(rg_n45013);
            com.lzy.okgo.adapter.Call<byte[]> call = request.converter(new BytesConvert()).adapt();
            try {
                return call.execute();
            } catch (Exception e) {
                return null;
            }
        }
        else if (rg_n45007 == rg_wlfwfsh.rg_n45183)
        {
            com.lzy.okgo.request.PatchRequest request = com.lzy.okgo.OkGo.<byte[]>patch(rg_n45006);
            if (rg_n45008 != null)
                request.params(rg_n45008);
            if (rg_n45009 != null)
                request.headers(rg_n45009);
            if (rg_n45010 != -1)
                request.cacheMode(setCacheMode(rg_n45010));
            if (rg_n45011 > -1)
                request.retryCount(rg_n45011);
            request.tag(rg_n45012);
            if (rg_n45015 != null)
                request.upString(rg_n45015);
            if (rg_n45016 != null)
                request.upJson(rg_n45016);
            if (rg_n45017 != null)
                request.upBytes(rg_n45017);
            if (rg_n45018 != null)
                request.upFile(rg_n45018);
            request.isMultipart(rg_n45014);
            request.isSpliceUrl(rg_n45013);
            com.lzy.okgo.adapter.Call<byte[]> call = request.converter(new BytesConvert()).adapt();
            try {
                return call.execute();
            } catch (Exception e) {
                return null;
            }
        }
        else if (rg_n45007 == rg_wlfwfsh.rg_n45179)
        {
            com.lzy.okgo.request.PutRequest request = com.lzy.okgo.OkGo.<byte[]>put(rg_n45006);
            if (rg_n45008 != null)
                request.params(rg_n45008);
            if (rg_n45009 != null)
                request.headers(rg_n45009);
            if (rg_n45010 != -1)
                request.cacheMode(setCacheMode(rg_n45010));
            if (rg_n45011 > -1)
                request.retryCount(rg_n45011);
            request.tag(rg_n45012);
            if (rg_n45015 != null)
                request.upString(rg_n45015);
            if (rg_n45016 != null)
                request.upJson(rg_n45016);
            if (rg_n45017 != null)
                request.upBytes(rg_n45017);
            if (rg_n45018 != null)
                request.upFile(rg_n45018);
            request.isMultipart(rg_n45014);
            request.isSpliceUrl(rg_n45013);
            com.lzy.okgo.adapter.Call<byte[]> call = request.converter(new BytesConvert()).adapt();
            try {
                return call.execute();
            } catch (Exception e) {
                return null;
            }
        }
        return (null);
    }

    protected void rg_n45035 () {
        com.lzy.okgo.OkGo.getInstance().init(hsh.anzh.jb.rg_yychx.sGetApp());
    }

    public void rg_n45039 (int rg_n45040) {
        okhttp3.OkHttpClient tempClient;
        if (rg_n45040 == 0)
            tempClient = com.lzy.okgo.OkGo.getInstance().getOkHttpClient().newBuilder().cookieJar(okhttp3.CookieJar.NO_COOKIES).build();
        else if (rg_n45040 == 1)
            tempClient = com.lzy.okgo.OkGo.getInstance().getOkHttpClient().newBuilder().cookieJar(new com.lzy.okgo.cookie.CookieJarImpl(new com.lzy.okgo.cookie.store.MemoryCookieStore())).build();
        else if (rg_n45040 == 2)
            tempClient = com.lzy.okgo.OkGo.getInstance().getOkHttpClient().newBuilder().cookieJar(new com.lzy.okgo.cookie.CookieJarImpl(new com.lzy.okgo.cookie.store.SPCookieStore(hsh.anzh.jb.rg_yychx.sGetApp()))).build();
        else if (rg_n45040 == 3)
            tempClient = com.lzy.okgo.OkGo.getInstance().getOkHttpClient().newBuilder().cookieJar(new com.lzy.okgo.cookie.CookieJarImpl(new com.lzy.okgo.cookie.store.DBCookieStore(hsh.anzh.jb.rg_yychx.sGetApp()))).build();
        else
            tempClient = com.lzy.okgo.OkGo.getInstance().getOkHttpClient().newBuilder().cookieJar(okhttp3.CookieJar.NO_COOKIES).build();
        com.lzy.okgo.OkGo.getInstance().setOkHttpClient(tempClient);
    }

    public static interface re_n45069 { int dispatch (rg_wlfwl objSource, int nTagNumber, String rg_n45070, com.lzy.okgo.model.Response rg_n45071, java.lang.Object rg_n45072, int rg_n45073); }
    private re_n45069 rd_n45069;
    private int rd_n45069_tag;
    public void rl_wlfwl_n45069 (re_n45069 objListener, int nTagNumber) {
        synchronized (this) { rd_n45069 = objListener;  rd_n45069_tag = nTagNumber; }
    }
    public int rg_n45069 (String rg_n45070, com.lzy.okgo.model.Response rg_n45071, java.lang.Object rg_n45072, int rg_n45073) {
        re_n45069 objDispatcher;  int nTagNumber;
        synchronized (this) { objDispatcher = rd_n45069;  nTagNumber = rd_n45069_tag; }
        return (objDispatcher != null ? objDispatcher.dispatch (this, nTagNumber, rg_n45070, rg_n45071, rg_n45072, rg_n45073) : 0);
    }

    public static interface re_n45074 { int dispatch (rg_wlfwl objSource, int nTagNumber, com.lzy.okgo.model.Response rg_n45075, java.lang.Object rg_n45076, int rg_n45077); }
    private re_n45074 rd_n45074;
    private int rd_n45074_tag;
    public void rl_wlfwl_n45074 (re_n45074 objListener, int nTagNumber) {
        synchronized (this) { rd_n45074 = objListener;  rd_n45074_tag = nTagNumber; }
    }
    public int rg_n45074 (com.lzy.okgo.model.Response rg_n45075, java.lang.Object rg_n45076, int rg_n45077) {
        re_n45074 objDispatcher;  int nTagNumber;
        synchronized (this) { objDispatcher = rd_n45074;  nTagNumber = rd_n45074_tag; }
        return (objDispatcher != null ? objDispatcher.dispatch (this, nTagNumber, rg_n45075, rg_n45076, rg_n45077) : 0);
    }

    public static interface re_n45078 { int dispatch (rg_wlfwl objSource, int nTagNumber, java.lang.Throwable rg_n45079, com.lzy.okgo.model.Response rg_n45080, java.lang.Object rg_n45081, int rg_n45082); }
    private re_n45078 rd_n45078;
    private int rd_n45078_tag;
    public void rl_wlfwl_n45078 (re_n45078 objListener, int nTagNumber) {
        synchronized (this) { rd_n45078 = objListener;  rd_n45078_tag = nTagNumber; }
    }
    public int rg_n45078 (java.lang.Throwable rg_n45079, com.lzy.okgo.model.Response rg_n45080, java.lang.Object rg_n45081, int rg_n45082) {
        re_n45078 objDispatcher;  int nTagNumber;
        synchronized (this) { objDispatcher = rd_n45078;  nTagNumber = rd_n45078_tag; }
        return (objDispatcher != null ? objDispatcher.dispatch (this, nTagNumber, rg_n45079, rg_n45080, rg_n45081, rg_n45082) : 0);
    }

    public static interface re_n45083 { int dispatch (rg_wlfwl objSource, int nTagNumber, java.lang.Object rg_n45084, int rg_n45085); }
    private re_n45083 rd_n45083;
    private int rd_n45083_tag;
    public void rl_wlfwl_n45083 (re_n45083 objListener, int nTagNumber) {
        synchronized (this) { rd_n45083 = objListener;  rd_n45083_tag = nTagNumber; }
    }
    public int rg_n45083 (java.lang.Object rg_n45084, int rg_n45085) {
        re_n45083 objDispatcher;  int nTagNumber;
        synchronized (this) { objDispatcher = rd_n45083;  nTagNumber = rd_n45083_tag; }
        return (objDispatcher != null ? objDispatcher.dispatch (this, nTagNumber, rg_n45084, rg_n45085) : 0);
    }

    public static interface re_n45086 { int dispatch (rg_wlfwl objSource, int nTagNumber, int rg_n45087); }
    private re_n45086 rd_n45086;
    private int rd_n45086_tag;
    public void rl_wlfwl_n45086 (re_n45086 objListener, int nTagNumber) {
        synchronized (this) { rd_n45086 = objListener;  rd_n45086_tag = nTagNumber; }
    }
    public int rg_n45086 (int rg_n45087) {
        re_n45086 objDispatcher;  int nTagNumber;
        synchronized (this) { objDispatcher = rd_n45086;  nTagNumber = rd_n45086_tag; }
        return (objDispatcher != null ? objDispatcher.dispatch (this, nTagNumber, rg_n45087) : 0);
    }

    public static interface re_n45088 { int dispatch (rg_wlfwl objSource, int nTagNumber, com.lzy.okgo.model.Progress rg_n45089, java.lang.Object rg_n45090, int rg_n45091); }
    private re_n45088 rd_n45088;
    private int rd_n45088_tag;
    public void rl_wlfwl_n45088 (re_n45088 objListener, int nTagNumber) {
        synchronized (this) { rd_n45088 = objListener;  rd_n45088_tag = nTagNumber; }
    }
    public int rg_n45088 (com.lzy.okgo.model.Progress rg_n45089, java.lang.Object rg_n45090, int rg_n45091) {
        re_n45088 objDispatcher;  int nTagNumber;
        synchronized (this) { objDispatcher = rd_n45088;  nTagNumber = rd_n45088_tag; }
        return (objDispatcher != null ? objDispatcher.dispatch (this, nTagNumber, rg_n45089, rg_n45090, rg_n45091) : 0);
    }

    public static interface re_n45092 { int dispatch (rg_wlfwl objSource, int nTagNumber, com.lzy.okgo.model.Progress rg_n45093, java.lang.Object rg_n45094, int rg_n45095); }
    private re_n45092 rd_n45092;
    private int rd_n45092_tag;
    public void rl_wlfwl_n45092 (re_n45092 objListener, int nTagNumber) {
        synchronized (this) { rd_n45092 = objListener;  rd_n45092_tag = nTagNumber; }
    }
    public int rg_n45092 (com.lzy.okgo.model.Progress rg_n45093, java.lang.Object rg_n45094, int rg_n45095) {
        re_n45092 objDispatcher;  int nTagNumber;
        synchronized (this) { objDispatcher = rd_n45092;  nTagNumber = rd_n45092_tag; }
        return (objDispatcher != null ? objDispatcher.dispatch (this, nTagNumber, rg_n45093, rg_n45094, rg_n45095) : 0);
    }

    public static interface re_n45096 { int dispatch (rg_wlfwl objSource, int nTagNumber, android.graphics.Bitmap rg_n45097, com.lzy.okgo.model.Response rg_n45098, java.lang.Object rg_n45099, int rg_n45100); }
    private re_n45096 rd_n45096;
    private int rd_n45096_tag;
    public void rl_wlfwl_n45096 (re_n45096 objListener, int nTagNumber) {
        synchronized (this) { rd_n45096 = objListener;  rd_n45096_tag = nTagNumber; }
    }
    public int rg_n45096 (android.graphics.Bitmap rg_n45097, com.lzy.okgo.model.Response rg_n45098, java.lang.Object rg_n45099, int rg_n45100) {
        re_n45096 objDispatcher;  int nTagNumber;
        synchronized (this) { objDispatcher = rd_n45096;  nTagNumber = rd_n45096_tag; }
        return (objDispatcher != null ? objDispatcher.dispatch (this, nTagNumber, rg_n45097, rg_n45098, rg_n45099, rg_n45100) : 0);
    }

    public static interface re_n45101 { int dispatch (rg_wlfwl objSource, int nTagNumber, com.lzy.okgo.model.Response rg_n45102, java.lang.Object rg_n45103, int rg_n45104); }
    private re_n45101 rd_n45101;
    private int rd_n45101_tag;
    public void rl_wlfwl_n45101 (re_n45101 objListener, int nTagNumber) {
        synchronized (this) { rd_n45101 = objListener;  rd_n45101_tag = nTagNumber; }
    }
    public int rg_n45101 (com.lzy.okgo.model.Response rg_n45102, java.lang.Object rg_n45103, int rg_n45104) {
        re_n45101 objDispatcher;  int nTagNumber;
        synchronized (this) { objDispatcher = rd_n45101;  nTagNumber = rd_n45101_tag; }
        return (objDispatcher != null ? objDispatcher.dispatch (this, nTagNumber, rg_n45102, rg_n45103, rg_n45104) : 0);
    }

    public static interface re_n45105 { int dispatch (rg_wlfwl objSource, int nTagNumber, java.lang.Throwable rg_n45106, com.lzy.okgo.model.Response rg_n45107, java.lang.Object rg_n45108, int rg_n45109); }
    private re_n45105 rd_n45105;
    private int rd_n45105_tag;
    public void rl_wlfwl_n45105 (re_n45105 objListener, int nTagNumber) {
        synchronized (this) { rd_n45105 = objListener;  rd_n45105_tag = nTagNumber; }
    }
    public int rg_n45105 (java.lang.Throwable rg_n45106, com.lzy.okgo.model.Response rg_n45107, java.lang.Object rg_n45108, int rg_n45109) {
        re_n45105 objDispatcher;  int nTagNumber;
        synchronized (this) { objDispatcher = rd_n45105;  nTagNumber = rd_n45105_tag; }
        return (objDispatcher != null ? objDispatcher.dispatch (this, nTagNumber, rg_n45106, rg_n45107, rg_n45108, rg_n45109) : 0);
    }

    public static interface re_n45110 { int dispatch (rg_wlfwl objSource, int nTagNumber, java.lang.Object rg_n45111, int rg_n45112); }
    private re_n45110 rd_n45110;
    private int rd_n45110_tag;
    public void rl_wlfwl_n45110 (re_n45110 objListener, int nTagNumber) {
        synchronized (this) { rd_n45110 = objListener;  rd_n45110_tag = nTagNumber; }
    }
    public int rg_n45110 (java.lang.Object rg_n45111, int rg_n45112) {
        re_n45110 objDispatcher;  int nTagNumber;
        synchronized (this) { objDispatcher = rd_n45110;  nTagNumber = rd_n45110_tag; }
        return (objDispatcher != null ? objDispatcher.dispatch (this, nTagNumber, rg_n45111, rg_n45112) : 0);
    }

    public static interface re_n45113 { int dispatch (rg_wlfwl objSource, int nTagNumber, int rg_n45114); }
    private re_n45113 rd_n45113;
    private int rd_n45113_tag;
    public void rl_wlfwl_n45113 (re_n45113 objListener, int nTagNumber) {
        synchronized (this) { rd_n45113 = objListener;  rd_n45113_tag = nTagNumber; }
    }
    public int rg_n45113 (int rg_n45114) {
        re_n45113 objDispatcher;  int nTagNumber;
        synchronized (this) { objDispatcher = rd_n45113;  nTagNumber = rd_n45113_tag; }
        return (objDispatcher != null ? objDispatcher.dispatch (this, nTagNumber, rg_n45114) : 0);
    }

    public static interface re_n45115 { int dispatch (rg_wlfwl objSource, int nTagNumber, com.lzy.okgo.model.Progress rg_n45116, java.lang.Object rg_n45117, int rg_n45118); }
    private re_n45115 rd_n45115;
    private int rd_n45115_tag;
    public void rl_wlfwl_n45115 (re_n45115 objListener, int nTagNumber) {
        synchronized (this) { rd_n45115 = objListener;  rd_n45115_tag = nTagNumber; }
    }
    public int rg_n45115 (com.lzy.okgo.model.Progress rg_n45116, java.lang.Object rg_n45117, int rg_n45118) {
        re_n45115 objDispatcher;  int nTagNumber;
        synchronized (this) { objDispatcher = rd_n45115;  nTagNumber = rd_n45115_tag; }
        return (objDispatcher != null ? objDispatcher.dispatch (this, nTagNumber, rg_n45116, rg_n45117, rg_n45118) : 0);
    }

    public static interface re_n45119 { int dispatch (rg_wlfwl objSource, int nTagNumber, com.lzy.okgo.model.Progress rg_n45120, java.lang.Object rg_n45121, int rg_n45122); }
    private re_n45119 rd_n45119;
    private int rd_n45119_tag;
    public void rl_wlfwl_n45119 (re_n45119 objListener, int nTagNumber) {
        synchronized (this) { rd_n45119 = objListener;  rd_n45119_tag = nTagNumber; }
    }
    public int rg_n45119 (com.lzy.okgo.model.Progress rg_n45120, java.lang.Object rg_n45121, int rg_n45122) {
        re_n45119 objDispatcher;  int nTagNumber;
        synchronized (this) { objDispatcher = rd_n45119;  nTagNumber = rd_n45119_tag; }
        return (objDispatcher != null ? objDispatcher.dispatch (this, nTagNumber, rg_n45120, rg_n45121, rg_n45122) : 0);
    }

    public static interface re_n45123 { int dispatch (rg_wlfwl objSource, int nTagNumber, byte [] rg_n45124, com.lzy.okgo.model.Response rg_n45125, java.lang.Object rg_n45126, int rg_n45127); }
    private re_n45123 rd_n45123;
    private int rd_n45123_tag;
    public void rl_wlfwl_n45123 (re_n45123 objListener, int nTagNumber) {
        synchronized (this) { rd_n45123 = objListener;  rd_n45123_tag = nTagNumber; }
    }
    public int rg_n45123 (byte [] rg_n45124, com.lzy.okgo.model.Response rg_n45125, java.lang.Object rg_n45126, int rg_n45127) {
        re_n45123 objDispatcher;  int nTagNumber;
        synchronized (this) { objDispatcher = rd_n45123;  nTagNumber = rd_n45123_tag; }
        return (objDispatcher != null ? objDispatcher.dispatch (this, nTagNumber, rg_n45124, rg_n45125, rg_n45126, rg_n45127) : 0);
    }

    public static interface re_n45128 { int dispatch (rg_wlfwl objSource, int nTagNumber, com.lzy.okgo.model.Response rg_n45129, java.lang.Object rg_n45130, int rg_n45131); }
    private re_n45128 rd_n45128;
    private int rd_n45128_tag;
    public void rl_wlfwl_n45128 (re_n45128 objListener, int nTagNumber) {
        synchronized (this) { rd_n45128 = objListener;  rd_n45128_tag = nTagNumber; }
    }
    public int rg_n45128 (com.lzy.okgo.model.Response rg_n45129, java.lang.Object rg_n45130, int rg_n45131) {
        re_n45128 objDispatcher;  int nTagNumber;
        synchronized (this) { objDispatcher = rd_n45128;  nTagNumber = rd_n45128_tag; }
        return (objDispatcher != null ? objDispatcher.dispatch (this, nTagNumber, rg_n45129, rg_n45130, rg_n45131) : 0);
    }

    public static interface re_n45132 { int dispatch (rg_wlfwl objSource, int nTagNumber, java.lang.Throwable rg_n45133, com.lzy.okgo.model.Response rg_n45134, java.lang.Object rg_n45135, int rg_n45136); }
    private re_n45132 rd_n45132;
    private int rd_n45132_tag;
    public void rl_wlfwl_n45132 (re_n45132 objListener, int nTagNumber) {
        synchronized (this) { rd_n45132 = objListener;  rd_n45132_tag = nTagNumber; }
    }
    public int rg_n45132 (java.lang.Throwable rg_n45133, com.lzy.okgo.model.Response rg_n45134, java.lang.Object rg_n45135, int rg_n45136) {
        re_n45132 objDispatcher;  int nTagNumber;
        synchronized (this) { objDispatcher = rd_n45132;  nTagNumber = rd_n45132_tag; }
        return (objDispatcher != null ? objDispatcher.dispatch (this, nTagNumber, rg_n45133, rg_n45134, rg_n45135, rg_n45136) : 0);
    }

    public static interface re_n45137 { int dispatch (rg_wlfwl objSource, int nTagNumber, java.lang.Object rg_n45138, int rg_n45139); }
    private re_n45137 rd_n45137;
    private int rd_n45137_tag;
    public void rl_wlfwl_n45137 (re_n45137 objListener, int nTagNumber) {
        synchronized (this) { rd_n45137 = objListener;  rd_n45137_tag = nTagNumber; }
    }
    public int rg_n45137 (java.lang.Object rg_n45138, int rg_n45139) {
        re_n45137 objDispatcher;  int nTagNumber;
        synchronized (this) { objDispatcher = rd_n45137;  nTagNumber = rd_n45137_tag; }
        return (objDispatcher != null ? objDispatcher.dispatch (this, nTagNumber, rg_n45138, rg_n45139) : 0);
    }

    public static interface re_n45140 { int dispatch (rg_wlfwl objSource, int nTagNumber, int rg_n45141); }
    private re_n45140 rd_n45140;
    private int rd_n45140_tag;
    public void rl_wlfwl_n45140 (re_n45140 objListener, int nTagNumber) {
        synchronized (this) { rd_n45140 = objListener;  rd_n45140_tag = nTagNumber; }
    }
    public int rg_n45140 (int rg_n45141) {
        re_n45140 objDispatcher;  int nTagNumber;
        synchronized (this) { objDispatcher = rd_n45140;  nTagNumber = rd_n45140_tag; }
        return (objDispatcher != null ? objDispatcher.dispatch (this, nTagNumber, rg_n45141) : 0);
    }

    public static interface re_n45142 { int dispatch (rg_wlfwl objSource, int nTagNumber, com.lzy.okgo.model.Progress rg_n45143, java.lang.Object rg_n45144, int rg_n45145); }
    private re_n45142 rd_n45142;
    private int rd_n45142_tag;
    public void rl_wlfwl_n45142 (re_n45142 objListener, int nTagNumber) {
        synchronized (this) { rd_n45142 = objListener;  rd_n45142_tag = nTagNumber; }
    }
    public int rg_n45142 (com.lzy.okgo.model.Progress rg_n45143, java.lang.Object rg_n45144, int rg_n45145) {
        re_n45142 objDispatcher;  int nTagNumber;
        synchronized (this) { objDispatcher = rd_n45142;  nTagNumber = rd_n45142_tag; }
        return (objDispatcher != null ? objDispatcher.dispatch (this, nTagNumber, rg_n45143, rg_n45144, rg_n45145) : 0);
    }

    public static interface re_n45146 { int dispatch (rg_wlfwl objSource, int nTagNumber, com.lzy.okgo.model.Progress rg_n45147, java.lang.Object rg_n45148, int rg_n45149); }
    private re_n45146 rd_n45146;
    private int rd_n45146_tag;
    public void rl_wlfwl_n45146 (re_n45146 objListener, int nTagNumber) {
        synchronized (this) { rd_n45146 = objListener;  rd_n45146_tag = nTagNumber; }
    }
    public int rg_n45146 (com.lzy.okgo.model.Progress rg_n45147, java.lang.Object rg_n45148, int rg_n45149) {
        re_n45146 objDispatcher;  int nTagNumber;
        synchronized (this) { objDispatcher = rd_n45146;  nTagNumber = rd_n45146_tag; }
        return (objDispatcher != null ? objDispatcher.dispatch (this, nTagNumber, rg_n45147, rg_n45148, rg_n45149) : 0);
    }

    public static interface re_n45150 { int dispatch (rg_wlfwl objSource, int nTagNumber, java.io.File rg_n45151, com.lzy.okgo.model.Response rg_n45152, java.lang.Object rg_n45153, int rg_n45154); }
    private re_n45150 rd_n45150;
    private int rd_n45150_tag;
    public void rl_wlfwl_n45150 (re_n45150 objListener, int nTagNumber) {
        synchronized (this) { rd_n45150 = objListener;  rd_n45150_tag = nTagNumber; }
    }
    public int rg_n45150 (java.io.File rg_n45151, com.lzy.okgo.model.Response rg_n45152, java.lang.Object rg_n45153, int rg_n45154) {
        re_n45150 objDispatcher;  int nTagNumber;
        synchronized (this) { objDispatcher = rd_n45150;  nTagNumber = rd_n45150_tag; }
        return (objDispatcher != null ? objDispatcher.dispatch (this, nTagNumber, rg_n45151, rg_n45152, rg_n45153, rg_n45154) : 0);
    }

    public static interface re_n45155 { int dispatch (rg_wlfwl objSource, int nTagNumber, com.lzy.okgo.model.Response rg_n45156, java.lang.Object rg_n45157, int rg_n45158); }
    private re_n45155 rd_n45155;
    private int rd_n45155_tag;
    public void rl_wlfwl_n45155 (re_n45155 objListener, int nTagNumber) {
        synchronized (this) { rd_n45155 = objListener;  rd_n45155_tag = nTagNumber; }
    }
    public int rg_n45155 (com.lzy.okgo.model.Response rg_n45156, java.lang.Object rg_n45157, int rg_n45158) {
        re_n45155 objDispatcher;  int nTagNumber;
        synchronized (this) { objDispatcher = rd_n45155;  nTagNumber = rd_n45155_tag; }
        return (objDispatcher != null ? objDispatcher.dispatch (this, nTagNumber, rg_n45156, rg_n45157, rg_n45158) : 0);
    }

    public static interface re_n45159 { int dispatch (rg_wlfwl objSource, int nTagNumber, java.lang.Throwable rg_n45160, com.lzy.okgo.model.Response rg_n45161, java.lang.Object rg_n45162, int rg_n45163); }
    private re_n45159 rd_n45159;
    private int rd_n45159_tag;
    public void rl_wlfwl_n45159 (re_n45159 objListener, int nTagNumber) {
        synchronized (this) { rd_n45159 = objListener;  rd_n45159_tag = nTagNumber; }
    }
    public int rg_n45159 (java.lang.Throwable rg_n45160, com.lzy.okgo.model.Response rg_n45161, java.lang.Object rg_n45162, int rg_n45163) {
        re_n45159 objDispatcher;  int nTagNumber;
        synchronized (this) { objDispatcher = rd_n45159;  nTagNumber = rd_n45159_tag; }
        return (objDispatcher != null ? objDispatcher.dispatch (this, nTagNumber, rg_n45160, rg_n45161, rg_n45162, rg_n45163) : 0);
    }

    public static interface re_n45164 { int dispatch (rg_wlfwl objSource, int nTagNumber, java.lang.Object rg_n45165, int rg_n45166); }
    private re_n45164 rd_n45164;
    private int rd_n45164_tag;
    public void rl_wlfwl_n45164 (re_n45164 objListener, int nTagNumber) {
        synchronized (this) { rd_n45164 = objListener;  rd_n45164_tag = nTagNumber; }
    }
    public int rg_n45164 (java.lang.Object rg_n45165, int rg_n45166) {
        re_n45164 objDispatcher;  int nTagNumber;
        synchronized (this) { objDispatcher = rd_n45164;  nTagNumber = rd_n45164_tag; }
        return (objDispatcher != null ? objDispatcher.dispatch (this, nTagNumber, rg_n45165, rg_n45166) : 0);
    }

    public static interface re_n45167 { int dispatch (rg_wlfwl objSource, int nTagNumber, int rg_n45168); }
    private re_n45167 rd_n45167;
    private int rd_n45167_tag;
    public void rl_wlfwl_n45167 (re_n45167 objListener, int nTagNumber) {
        synchronized (this) { rd_n45167 = objListener;  rd_n45167_tag = nTagNumber; }
    }
    public int rg_n45167 (int rg_n45168) {
        re_n45167 objDispatcher;  int nTagNumber;
        synchronized (this) { objDispatcher = rd_n45167;  nTagNumber = rd_n45167_tag; }
        return (objDispatcher != null ? objDispatcher.dispatch (this, nTagNumber, rg_n45168) : 0);
    }

    public static interface re_n45169 { int dispatch (rg_wlfwl objSource, int nTagNumber, com.lzy.okgo.model.Progress rg_n45170, java.lang.Object rg_n45171, int rg_n45172); }
    private re_n45169 rd_n45169;
    private int rd_n45169_tag;
    public void rl_wlfwl_n45169 (re_n45169 objListener, int nTagNumber) {
        synchronized (this) { rd_n45169 = objListener;  rd_n45169_tag = nTagNumber; }
    }
    public int rg_n45169 (com.lzy.okgo.model.Progress rg_n45170, java.lang.Object rg_n45171, int rg_n45172) {
        re_n45169 objDispatcher;  int nTagNumber;
        synchronized (this) { objDispatcher = rd_n45169;  nTagNumber = rd_n45169_tag; }
        return (objDispatcher != null ? objDispatcher.dispatch (this, nTagNumber, rg_n45170, rg_n45171, rg_n45172) : 0);
    }

    public static interface re_n45173 { int dispatch (rg_wlfwl objSource, int nTagNumber, com.lzy.okgo.model.Progress rg_n45174, java.lang.Object rg_n45175, int rg_n45176); }
    private re_n45173 rd_n45173;
    private int rd_n45173_tag;
    public void rl_wlfwl_n45173 (re_n45173 objListener, int nTagNumber) {
        synchronized (this) { rd_n45173 = objListener;  rd_n45173_tag = nTagNumber; }
    }
    public int rg_n45173 (com.lzy.okgo.model.Progress rg_n45174, java.lang.Object rg_n45175, int rg_n45176) {
        re_n45173 objDispatcher;  int nTagNumber;
        synchronized (this) { objDispatcher = rd_n45173;  nTagNumber = rd_n45173_tag; }
        return (objDispatcher != null ? objDispatcher.dispatch (this, nTagNumber, rg_n45174, rg_n45175, rg_n45176) : 0);
    }
}

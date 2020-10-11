
package hsh.anzh.wl.OKHTTPxz;

public class rg_wlxzl {

    public rg_wlxzl ()  { }

    public static void rg_n45370 () {
        com.lzy.okgo.OkGo.getInstance().init(hsh.anzh.jb.rg_yychx.sGetApp());
    }

    public static com.lzy.okserver.download.DownloadTask rg_n45403 (String rg_n45404, String rg_n45405, int rg_n45406, com.lzy.okgo.model.HttpParams rg_n45407, com.lzy.okgo.model.HttpHeaders rg_n45408, boolean rg_n45409, boolean rg_n45410, String rg_n45411, String rg_n45412, byte [] rg_n45413, java.io.File rg_n45414) {
        if (hsh.Java.jb.rg_wbxl.rg_n52576 (rg_n45405))
        {
            return (null);
        }
        if (rg_n45406 == hsh.anzh.wl.OKHTTPfw.rg_wlfwfsh.rg_n45177)
        {
            com.lzy.okgo.request.GetRequest request = com.lzy.okgo.OkGo.<java.io.File>get(rg_n45405);
            if (rg_n45407 != null)
                request.params(rg_n45407);
            if (rg_n45408 != null)
                request.headers(rg_n45408);
            return com.lzy.okserver.OkDownload.request(rg_n45404, request);
        }
        else if (rg_n45406 == hsh.anzh.wl.OKHTTPfw.rg_wlfwfsh.rg_n45178)
        {
            com.lzy.okgo.request.PostRequest request = com.lzy.okgo.OkGo.<java.io.File>post(rg_n45405);
            if (rg_n45407 != null)
                request.params(rg_n45407);
            if (rg_n45408 != null)
                request.headers(rg_n45408);
            if (rg_n45411 != null)
                request.upString(rg_n45411);
            if (rg_n45412 != null)
                request.upJson(rg_n45412);
            if (rg_n45413 != null)
                request.upBytes(rg_n45413);
            if (rg_n45414 != null)
                request.upFile(rg_n45414);
            request.isMultipart(rg_n45410);
            request.isSpliceUrl(rg_n45409);
            return com.lzy.okserver.OkDownload.request(rg_n45404, request);
        }
        else if (rg_n45406 == hsh.anzh.wl.OKHTTPfw.rg_wlfwfsh.rg_n45184)
        {
            com.lzy.okgo.request.TraceRequest request = com.lzy.okgo.OkGo.<java.io.File>trace(rg_n45405);
            if (rg_n45407 != null)
                request.params(rg_n45407);
            if (rg_n45408 != null)
                request.headers(rg_n45408);
            return com.lzy.okserver.OkDownload.request(rg_n45404, request);
        }
        else if (rg_n45406 == hsh.anzh.wl.OKHTTPfw.rg_wlfwfsh.rg_n45181)
        {
            com.lzy.okgo.request.HeadRequest request = com.lzy.okgo.OkGo.<java.io.File>head(rg_n45405);
            if (rg_n45407 != null)
                request.params(rg_n45407);
            if (rg_n45408 != null)
                request.headers(rg_n45408);
            return com.lzy.okserver.OkDownload.request(rg_n45404, request);
        }
        else if (rg_n45406 == hsh.anzh.wl.OKHTTPfw.rg_wlfwfsh.rg_n45182)
        {
            com.lzy.okgo.request.DeleteRequest request = com.lzy.okgo.OkGo.<java.io.File>delete(rg_n45405);
            if (rg_n45407 != null)
                request.params(rg_n45407);
            if (rg_n45408 != null)
                request.headers(rg_n45408);
            if (rg_n45411 != null)
                request.upString(rg_n45411);
            if (rg_n45412 != null)
                request.upJson(rg_n45412);
            if (rg_n45413 != null)
                request.upBytes(rg_n45413);
            if (rg_n45414 != null)
                request.upFile(rg_n45414);
            request.isMultipart(rg_n45410);
            request.isSpliceUrl(rg_n45409);
            return com.lzy.okserver.OkDownload.request(rg_n45404, request);
        }
        else if (rg_n45406 == hsh.anzh.wl.OKHTTPfw.rg_wlfwfsh.rg_n45180)
        {
            com.lzy.okgo.request.OptionsRequest request = com.lzy.okgo.OkGo.<java.io.File>options(rg_n45405);
            if (rg_n45407 != null)
                request.params(rg_n45407);
            if (rg_n45408 != null)
                request.headers(rg_n45408);
            if (rg_n45411 != null)
                request.upString(rg_n45411);
            if (rg_n45412 != null)
                request.upJson(rg_n45412);
            if (rg_n45413 != null)
                request.upBytes(rg_n45413);
            if (rg_n45414 != null)
                request.upFile(rg_n45414);
            request.isMultipart(rg_n45410);
            request.isSpliceUrl(rg_n45409);
            return com.lzy.okserver.OkDownload.request(rg_n45404, request);
        }
        else if (rg_n45406 == hsh.anzh.wl.OKHTTPfw.rg_wlfwfsh.rg_n45183)
        {
            com.lzy.okgo.request.PatchRequest request = com.lzy.okgo.OkGo.<java.io.File>patch(rg_n45405);
            if (rg_n45407 != null)
                request.params(rg_n45407);
            if (rg_n45408 != null)
                request.headers(rg_n45408);
            if (rg_n45411 != null)
                request.upString(rg_n45411);
            if (rg_n45412 != null)
                request.upJson(rg_n45412);
            if (rg_n45413 != null)
                request.upBytes(rg_n45413);
            if (rg_n45414 != null)
                request.upFile(rg_n45414);
            request.isMultipart(rg_n45410);
            request.isSpliceUrl(rg_n45409);
            return com.lzy.okserver.OkDownload.request(rg_n45404, request);
        }
        else if (rg_n45406 == hsh.anzh.wl.OKHTTPfw.rg_wlfwfsh.rg_n45179)
        {
            com.lzy.okgo.request.PutRequest request = com.lzy.okgo.OkGo.<java.io.File>put(rg_n45405);
            if (rg_n45407 != null)
                request.params(rg_n45407);
            if (rg_n45408 != null)
                request.headers(rg_n45408);
            if (rg_n45411 != null)
                request.upString(rg_n45411);
            if (rg_n45412 != null)
                request.upJson(rg_n45412);
            if (rg_n45413 != null)
                request.upBytes(rg_n45413);
            if (rg_n45414 != null)
                request.upFile(rg_n45414);
            request.isMultipart(rg_n45410);
            request.isSpliceUrl(rg_n45409);
            return com.lzy.okserver.OkDownload.request(rg_n45404, request);
        }
        return (null);
    }
}

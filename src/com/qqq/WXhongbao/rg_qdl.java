
package com.qqq.WXhongbao;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.*;

public class rg_qdl extends hsh.anzh.jb.rg_jrchk {

    public rg_qdl ()  { }

    protected hsh.anzh.jb.rg_ann rg_n71733;
    protected hsh.anzh.jb.rg_wbk rg_n71734;
    protected hsh.anzh.jb.rg_wbk rg_n71735;
    protected hsh.anzh.jb.rg_ann rg_n71736;
    protected hsh.anzh.jb.rg_xxbjq rg_n71737;
    protected hsh.anzh.zj.rg_gjjrbjk rg_n71738;
    protected hsh.anzh.zj.rg_gjjrbjk rg_n71739;
    protected hsh.anzh.zj.rg_gjjrbjk rg_n71740;
    protected hsh.anzh.zj.rg_gjjrbjk rg_n71741;
    protected hsh.anzh.jb.rg_ann rg_n71742;
    protected hsh.anzh.jb.rg_dshdhkl rg_n71743;
    protected String rg_n71744 = "";
    protected String rg_n71745 = "";
    protected String rg_n71746 = "";
    protected hsh.anzh.jb.rg_anzhwlczl rg_n71747 = new hsh.anzh.jb.rg_anzhwlczl ();
    protected hsh.anzh.jb.rg_jddhkl rg_n71748;
    protected hsh.anzh.jb.rg_yhshqxgjl rg_n71749 = new hsh.anzh.jb.rg_yhshqxgjl ();

    {
        rg_n71747.rl_anzhwlczl_n10497 (new hsh.anzh.jb.rg_anzhwlczl.re_n10497 () {
            public int dispatch (hsh.anzh.jb.rg_anzhwlczl objSource, int nTagNumber, byte [] rg_n10498, String rg_n10499, String rg_n10500, int rg_n10501) {
                return rg_n71821 (objSource, nTagNumber, rg_n10498, rg_n10499, rg_n10500, rg_n10501);
            }
        }, 0);
        rg_n71749.rl_yhshqxgjl_n46880 (new hsh.anzh.jb.rg_yhshqxgjl.re_n46880 () {
            public int dispatch (hsh.anzh.jb.rg_yhshqxgjl objSource, int nTagNumber) {
                return rg_n71754 (objSource, nTagNumber);
            }
        }, 0);
        rg_n71749.rl_yhshqxgjl_n46881 (new hsh.anzh.jb.rg_yhshqxgjl.re_n46881 () {
            public int dispatch (hsh.anzh.jb.rg_yhshqxgjl objSource, int nTagNumber, java.util.List<String> rg_n46882) {
                return rg_n71757 (objSource, nTagNumber, rg_n46882);
            }
        }, 0);
    }

    protected hsh.anzh.jb.rg_xxbjq rp_1;
    @Override public hsh.anzh.jb.AndroidViewGroup GetAndroidActivityContainer () {
        return rp_1;
    }

    @Override
    protected boolean onInitAndroidActivity () {
        if (super.onInitAndroidActivity () == false)
            return false;

        setContentView (R.layout.rg_qdl);
        rp_1 = new hsh.anzh.jb.rg_xxbjq (this, (LinearLayout)findViewById (R.id.rg_qdl));
        rp_1.onInitControlContent (this, null);

        rg_n71733 = new hsh.anzh.jb.rg_ann (this, (Button)findViewById (R.id.rg_n71733));
        rg_n71733.onInitControlContent (this, null);
        rg_n71733.rg_n5474 (false);
        rg_n71733.rl_AndroidView_n5428 (new hsh.anzh.jb.AndroidView.re_n5428 () {
            public int dispatch (hsh.anzh.jb.AndroidView objSource, int nTagNumber) {
                return rg_n71764 ((hsh.anzh.jb.rg_ann)objSource, nTagNumber);
            }
        }, 0);
        rg_n71734 = new hsh.anzh.jb.rg_wbk (this, (TextView)findViewById (R.id.rg_n71734));
        rg_n71734.onInitControlContent (this, null);
        rg_n71735 = new hsh.anzh.jb.rg_wbk (this, (TextView)findViewById (R.id.rg_n71735));
        rg_n71735.onInitControlContent (this, null);
        rg_n71735.rg_n7049 ("本插件适用：\n1.最新版7.0.16的微信红包；\n2.V8.4.1.4680的QQ普通红包，拼手气红包以及口令红包，在抢完的同时自动发送\"感谢老板\"防封；\n3.支付宝10.1.99.7000最新版支付宝拼手气红包；\n4.适用最新版钉钉5.1.13拼手气红包。\n使用方法：\n1.点开\"启动服务\"按钮，选中\"无障碍\"中\"自动抢红包服务\"并将其打开；\n2.然后回来首页，再次点击\"启动服务\"按钮，进入微信页面，即可对微信，QQ，钉钉，支付宝进行抢相关的红包了！\n重要提示：\n如果感觉不错，请点击\"支持作者\"按钮，来捐赠作者！！！");
        rg_n71736 = new hsh.anzh.jb.rg_ann (this, (Button)findViewById (R.id.rg_n71736));
        rg_n71736.onInitControlContent (this, null);
        rg_n71736.rl_AndroidView_n5428 (new hsh.anzh.jb.AndroidView.re_n5428 () {
            public int dispatch (hsh.anzh.jb.AndroidView objSource, int nTagNumber) {
                return rg_n71764 ((hsh.anzh.jb.rg_ann)objSource, nTagNumber);
            }
        }, 0);
        rg_n71737 = new hsh.anzh.jb.rg_xxbjq (this, (LinearLayout)findViewById (R.id.rg_n71737));
        rg_n71737.onInitControlContent (this, null);
        rg_n71738 = new hsh.anzh.zj.rg_gjjrbjk (this, (com.rengwuxian.materialedittext.MaterialEditText)findViewById (R.id.rg_n71738));
        rg_n71738.onInitControlContent (this, null);
        rg_n71738.rg_n16861 ("请输入用户名");
        rg_n71738.rg_n7117 ("请输入用户名");
        rg_n71738.rg_n7099 (15);
        rg_n71738.rg_n16876 (0xFFFFFFFF);
        rg_n71738.rg_n16888 (hsh.anzh.zj.rg_gjbjkfdbqlx.rg_n16924);
        rg_n71738.rg_n16898 (20);
        rg_n71738.rg_n16878 (0xFFC0C0C0);
        rg_n71738.rg_n7105 (0xFFFFFFFF);
        rg_n71738.rg_n5450 (true);
        rg_n71738.rg_n16843 (true);
        rg_n71739 = new hsh.anzh.zj.rg_gjjrbjk (this, (com.rengwuxian.materialedittext.MaterialEditText)findViewById (R.id.rg_n71739));
        rg_n71739.onInitControlContent (this, null);
        rg_n71739.rg_n16861 ("请输入密码");
        rg_n71739.rg_n7117 ("请输入密码");
        rg_n71739.rg_n7099 (15);
        rg_n71739.rg_n16876 (0xFFFFFFFF);
        rg_n71739.rg_n16888 (hsh.anzh.zj.rg_gjbjkfdbqlx.rg_n16924);
        rg_n71739.rg_n16898 (20);
        rg_n71739.rg_n16878 (0xFFC0C0C0);
        rg_n71739.rg_n7105 (0xFFFFFFFF);
        rg_n71739.rg_n5450 (true);
        rg_n71739.rg_n7046 (hsh.anzh.jb.rg_chyshrlx.rg_n7004);
        rg_n71739.rg_n16843 (true);
        rg_n71740 = new hsh.anzh.zj.rg_gjjrbjk (this, (com.rengwuxian.materialedittext.MaterialEditText)findViewById (R.id.rg_n71740));
        rg_n71740.onInitControlContent (this, null);
        rg_n71740.rg_n16861 ("请再次输入密码");
        rg_n71740.rg_n7117 ("请再次输入密码");
        rg_n71740.rg_n7099 (15);
        rg_n71740.rg_n16876 (0xFFFFFFFF);
        rg_n71740.rg_n16888 (hsh.anzh.zj.rg_gjbjkfdbqlx.rg_n16924);
        rg_n71740.rg_n16898 (20);
        rg_n71740.rg_n16878 (0xFFC0C0C0);
        rg_n71740.rg_n7105 (0xFFFFFFFF);
        rg_n71740.rg_n5450 (true);
        rg_n71740.rg_n7046 (hsh.anzh.jb.rg_chyshrlx.rg_n7004);
        rg_n71740.rg_n16843 (true);
        rg_n71741 = new hsh.anzh.zj.rg_gjjrbjk (this, (com.rengwuxian.materialedittext.MaterialEditText)findViewById (R.id.rg_n71741));
        rg_n71741.onInitControlContent (this, null);
        rg_n71741.rg_n16861 ("请输入注册码");
        rg_n71741.rg_n7117 ("请输入注册码");
        rg_n71741.rg_n7099 (15);
        rg_n71741.rg_n16876 (0xFFFFFFFF);
        rg_n71741.rg_n16888 (hsh.anzh.zj.rg_gjbjkfdbqlx.rg_n16924);
        rg_n71741.rg_n16898 (20);
        rg_n71741.rg_n16878 (0xFFC0C0C0);
        rg_n71741.rg_n7105 (0xFFFFFFFF);
        rg_n71741.rg_n5450 (true);
        rg_n71741.rg_n16843 (true);
        rg_n71742 = new hsh.anzh.jb.rg_ann (this, (Button)findViewById (R.id.rg_n71742));
        rg_n71742.onInitControlContent (this, null);
        rg_n71742.rl_AndroidView_n5428 (new hsh.anzh.jb.AndroidView.re_n5428 () {
            public int dispatch (hsh.anzh.jb.AndroidView objSource, int nTagNumber) {
                return rg_n71764 ((hsh.anzh.jb.rg_ann)objSource, nTagNumber);
            }
        }, 0);
        return true;
    }

    protected int rg_n71754 (hsh.anzh.jb.rg_yhshqxgjl rg_n71755, int rg_n71756) {
        rg_n71762 ("权限申请结果:已允许所有权限");
        return (0);
    }

    protected int rg_n71757 (hsh.anzh.jb.rg_yhshqxgjl rg_n71758, int rg_n71759, java.util.List<String> rg_n71760) {
        rg_n71762 ("权限申请结果:权限被拒绝");
        if (rg_n71760 != null)
        {
            int rg_n71761 = 0;
            for (rg_n71761 = 0; rg_n71761 < rg_n71760.size (); rg_n71761++)
            {
                rg_n71762 (rg_n71760.get (rg_n71761));
            }
        }
        return (0);
    }

    protected void rg_n71762 (String rg_n71763) {
        rg_n71734.rg_n7049 (rg_n71763 + "\n" + String.valueOf (rg_n71734.GetTextView ().getText ()));
    }

    protected int rg_n71764 (hsh.anzh.jb.rg_ann rg_n71765, int rg_n71766) {
        if (rg_n71765 == rg_n71733)
        {
            if (rg_chxgjl.rg_n71727 (this))
            {
                hsh.anzh.jb.AndComActivity.rg_n4929 (this, rg_chxgjl.rg_n71726);
                hsh.anzh.jb.rg_yychx.rg_n2542 ("任务已启动！", false);
                rg_qgbrwl.rg_n71868 ().rg_n71841 = true;
                rg_gbkjm.rg_n71886 ().rg_n71841 = false;
                rg_gbykjm.rg_n71876 ().rg_n71841 = false;
                rg_QQltjm.rg_n71712 ().rg_n71841 = true;
                rg_ZFBltjm.rg_n71930 ().rg_n71841 = true;
                rg_ZFBgbkjm.rg_n71943 ().rg_n71841 = false;
                rg_DDltjm.rg_n71687 ().rg_n71841 = true;
                rg_DDgbkjm.rg_n71697 ().rg_n71841 = false;
            }
            else
            {
                hsh.anzh.jb.rg_yychx.rg_n2542 ("请先启用服务", false);
                hsh.anzh.gn.mzhaifw.rg_mzhaigll.rg_n542 (this);
            }
        }
        else if (rg_n71766 == 2)
        {
            rg_n71790 (rg_n71746, "/sdcard/", "红包秒抢.apk");
        }
        else if (rg_n71765 == rg_n71742)
        {
            String rg_n71767;
            String rg_n71768;
            if (String.valueOf (rg_n71742.GetTextView ().getText ()).equals ("确定注册"))
            {
                rg_n71767 = anzh.mm.zqzb.rg_shbml.rg_n62054 (anzh.mm.zqzb.rg_shbml.rg_n62040, this);
                if (rg_n71767.equals (""))
                {
                    rg_n71767 = anzh.mm.zqzb.rg_shbml.rg_n62054 (anzh.mm.zqzb.rg_shbml.rg_n62053, this);
                }
                if (String.valueOf (rg_n71739.GetTextView ().getText ()).equals (String.valueOf (rg_n71740.GetTextView ().getText ())) == false)
                {
                    com.wuliguanhua.toast.Toasts.warning(hsh.anzh.jb.rg_yychx.rg_n2541(), "两次密码输入不一致", (true ? com.wuliguanhua.toast.Toasts.LENGTH_LONG : com.wuliguanhua.toast.Toasts.LENGTH_SHORT), true).show();
                    return (0);
                }
                rg_n71768 = hsh.Java.jb.rg_wbxl.rg_n52584 (anzh.mm.wlcz.rg_wlchlfwl.rg_n65048 ("http://127.0.0.1/hongbaomiaoqiang/public/getkey", hsh.anzh.wl.OKHTTPfw.rg_wlfwfsh.rg_n45178, "&UserIMEI=" + rg_n71767 + "&UserName=" + String.valueOf (rg_n71738.GetTextView ().getText ()) + "&PassWord=" + String.valueOf (rg_n71739.GetTextView ().getText ()) + "&changshang=" + android.os.Build.BRAND + "&xinghao=" + android.os.Build.MODEL, "", "", false), hsh.Java.jb.rg_wbbm.rg_n52516);
                if (rg_n71768.equals ("fail") || rg_n71768 == null || rg_n71768.equals (""))
                {
                    com.wuliguanhua.toast.Toasts.error(hsh.anzh.jb.rg_yychx.rg_n2541(), "注册失败！", (true ? com.wuliguanhua.toast.Toasts.LENGTH_LONG : com.wuliguanhua.toast.Toasts.LENGTH_SHORT), true).show();
                    return (0);
                }
                else
                {
                    rg_n71741.rg_n7049 (rg_n71768);
                    hsh.anzh.yw.rg_wbzjl.rg_n58868 ("key", rg_n71768);
                    rg_n71742.rg_n7049 ("开始使用");
                }
            }
            else if (String.valueOf (rg_n71742.GetTextView ().getText ()).equals ("开始使用"))
            {
                rg_n71733.rg_n5474 (true);
                rg_n71737.rg_n5477 (hsh.anzh.jb.rg_zjkshzht.rg_n5351);
            }
        }
        else if (rg_n71765 == rg_n71736)
        {
            anzh.mm.zqzb.rg_zhfbgjl.rg_n61775 (this, "https://qr.alipay.com/fkx13578bxlmmuehmvnqy77");
            com.wuliguanhua.toast.Toasts.info(hsh.anzh.jb.rg_yychx.rg_n2541(), "请捐赠作者已支持更新此软件！", (true ? com.wuliguanhua.toast.Toasts.LENGTH_LONG : com.wuliguanhua.toast.Toasts.LENGTH_SHORT), true).show();
        }
        return (0);
    }

    protected void rg_n71769 () {
        hsh.anzh.jb.rg_xxbjq rg_n71770 = new hsh.anzh.jb.rg_xxbjq (this, new LinearLayout (this));
        rg_n71770.onInitControlContent (this, null);
        rg_n71770.rg_n6313 (hsh.anzh.jb.rg_xxbjfx.rg_n6307);
        hsh.anzh.jb.rg_xxbjq rg_n71771 = new hsh.anzh.jb.rg_xxbjq (this, new LinearLayout (this));
        rg_n71771.onInitControlContent (this, null);
        rg_n71771.rg_n5670 (R.drawable.zt);
        rg_n71771.rg_n6313 (hsh.anzh.jb.rg_xxbjfx.rg_n6307);
        hsh.anzh.jb.rg_zxgdrq rg_n71772 = new hsh.anzh.jb.rg_zxgdrq (this, new hsh.anzh.jb.rg_anzhzxgdrq (this));
        rg_n71772.onInitControlContent (this, null);
        hsh.anzh.jb.rg_zhbjq rg_n71773 = new hsh.anzh.jb.rg_zhbjq (this, new FrameLayout (this));
        rg_n71773.onInitControlContent (this, null);
        hsh.anzh.jb.rg_ann rg_n71774 = new hsh.anzh.jb.rg_ann (this, new Button (this));
        rg_n71774.onInitControlContent (this, null);
        rg_n71774.rg_n5670 (R.drawable.bjt);
        rg_n71774.rg_n7049 ("开始升级");
        rg_n71774.rg_n5493 (1000);
        hsh.anzh.jb.rg_tpann rg_n71775 = new hsh.anzh.jb.rg_tpann (this, new ImageButton (this));
        rg_n71775.onInitControlContent (this, null);
        hsh.anzh.jb.rg_tpk rg_n71776 = new hsh.anzh.jb.rg_tpk (this, new ImageView (this));
        rg_n71776.onInitControlContent (this, null);
        rg_n71776.rg_n5670 (R.drawable.st);
        hsh.anzh.jb.rg_tpk rg_n71777 = new hsh.anzh.jb.rg_tpk (this, new ImageView (this));
        rg_n71777.onInitControlContent (this, null);
        rg_n71777.rg_n5670 (R.drawable.xt);
        hsh.anzh.jb.rg_wbk rg_n71778 = new hsh.anzh.jb.rg_wbk (this, new TextView (this));
        rg_n71778.onInitControlContent (this, null);
        rg_n71778.rg_n7049 ("发现新版本V2.0");
        rg_n71778.rg_n7099 (18);
        rg_n71778.rg_n7093 (hsh.anzh.jb.rg_ztfg.rg_n3419);
        rg_n71778.rg_n7112 (hsh.anzh.jb.rg_shpdjfsh.rg_n6289);
        rg_n71778.rg_n7105 (hsh.anzh.jb.rg_ysl.rg_n7732);
        rg_n71778.rg_n5493 (2000);
        hsh.anzh.jb.rg_wbk rg_n71779 = new hsh.anzh.jb.rg_wbk (this, new TextView (this));
        rg_n71779.onInitControlContent (this, null);
        rg_n71779.rg_n7105 (hsh.anzh.jb.rg_ysl.rg_n7734);
        rg_n71779.rg_n7099 (16);
        rg_n71779.rg_n5493 (3000);
        hsh.anzh.jb.rg_zhtdtxb rg_n71780 = new hsh.anzh.jb.rg_zhtdtxb ();
        rg_n71780.rg_n8182 = R.drawable.sj1;
        rg_n71780.rg_n8177 = R.drawable.sj2;
        int rg_n71781;
        rg_n71743 = hsh.anzh.jb.rg_dshdhkl.rg_n7416 (this);
        rg_n71743.rg_n7387 (hsh.anzh.jb.rg_ysl.rg_n7743);
        rg_n71781 = hsh.anzh.yw.rg_jtl.rg_n59064 () / 6 * 4;
        rg_n71743.rg_n7402 (hsh.anzh.yw.rg_jtl.rg_n59065 () - 190, rg_n71781);
        rg_n71770.rg_n5928 (rg_n71773, null);
        rg_n71770.rg_n5928 (rg_n71777, null);
        rg_n71770.rg_n5928 (rg_n71775, null);
        rg_n71773.rg_n5928 (rg_n71771, null);
        rg_n71773.rg_n5928 (rg_n71776, null);
        rg_n71773.rg_n5928 (rg_n71774, null);
        rg_n71771.rg_n5928 (rg_n71778, null);
        rg_n71771.rg_n5928 (rg_n71772, null);
        rg_n71772.rg_n5928 (rg_n71779, null);
        rg_n71770.rg_n5723 (hsh.anzh.jb.AndroidView.rg_n5715, hsh.anzh.jb.AndroidView.rg_n5715);
        rg_n71773.rg_n5723 (hsh.anzh.jb.AndroidView.rg_n5715, rg_n71781 - 280);
        rg_n71771.rg_n5723 (hsh.anzh.jb.AndroidView.rg_n5715, hsh.anzh.jb.AndroidView.rg_n5715);
        rg_n71779.rg_n5723 (hsh.anzh.jb.AndroidView.rg_n5715, hsh.anzh.jb.AndroidView.rg_n5715);
        rg_n71772.rg_n5723 (hsh.anzh.jb.AndroidView.rg_n5715, hsh.anzh.jb.AndroidView.rg_n5715);
        rg_n71771.rg_n5710 (-1, 50, -1, -1);
        rg_n71776.rg_n5723 (200, 180);
        rg_n71778.rg_n5710 (-1, 110, -1, -1);
        rg_n71772.rg_n5710 (60, 10, 35, 200);
        rg_n71774.rg_n5723 (hsh.anzh.jb.AndroidView.rg_n5716, 90);
        rg_n71774.rg_n5702 (0, 0, 0, 0);
        rg_n71774.rg_n5710 (-1, -1, -1, 25);
        rg_n71777.rg_n5723 (1, 70);
        rg_n71775.rg_n5679 (rg_n71780);
        rg_n71775.rg_n5723 (90, 90);
        rg_n71775.rg_n5710 (-1, -1, -1, 25);
        rg_n71770.rg_n6329 (hsh.anzh.jb.rg_shpdjfsh.rg_n6289);
        rg_n71773.rg_n6361 (rg_n71776, hsh.anzh.jb.rg_shpdjfsh.rg_n6289, hsh.anzh.jb.rg_chzhdjfsh.rg_n6299);
        rg_n71773.rg_n6361 (rg_n71774, hsh.anzh.jb.rg_shpdjfsh.rg_n6289, hsh.anzh.jb.rg_chzhdjfsh.rg_n6302);
        rg_n71778.rg_n7049 ("发现新版本V" + rg_n71744);
        String [] rg_n71782;
        int rg_n71783 = 0;
        rg_n71782 = anzh.mm.jbshjlx.rg_wbczgjl.rg_n63333 (rg_n71745, ";");
        for (rg_n71783 = 0; rg_n71783 < rg_n71782.length; rg_n71783++)
        {
            rg_n71779.rg_n7167 ("\n" + rg_n71782 [rg_n71783] + "\n");
        }
        rg_n71743.rg_n7438 (rg_n71770, 0, 0, 0, 0);
        rg_n71748.rg_n7376 ();
        rg_n71743.rg_n7373 ();
        rg_n71775.rl_AndroidView_n5428 (new hsh.anzh.jb.AndroidView.re_n5428 () {
            public int dispatch (hsh.anzh.jb.AndroidView objSource, int nTagNumber) {
                return rg_n71814 ((hsh.anzh.jb.rg_tpann)objSource, nTagNumber);
            }
        }, 1);
        rg_n71774.rl_AndroidView_n5428 (new hsh.anzh.jb.AndroidView.re_n5428 () {
            public int dispatch (hsh.anzh.jb.AndroidView objSource, int nTagNumber) {
                return rg_n71764 ((hsh.anzh.jb.rg_ann)objSource, nTagNumber);
            }
        }, 2);
    }

    protected int rg_n71784 (hsh.Java.jb.rg_xchl1 rg_n71785, int rg_n71786, java.lang.Object rg_n71787, java.lang.Object rg_n71788) {
        String rg_n71789;
        rg_n71789 = hsh.Java.jb.rg_dxl.rg_n50032 (rg_n71787);
        rg_n71747.rg_n10472 (rg_n71789, 0);
        rg_n71785.interrupt ();
        return (0);
    }

    protected String rg_n71790 (String rg_n71791, String rg_n71792, String rg_n71793) {
        com.lzy.okserver.download.DownloadTask rg_n71794;
        rg_n71794 = hsh.anzh.wl.OKHTTPxz.rg_wlxzl.rg_n45403 (rg_n71791, rg_n71791, hsh.anzh.wl.OKHTTPfw.rg_wlfwfsh.rg_n45177, null, null, false, false, null, null, null, null);
        if (rg_n71794 != null)
        {
            hsh.anzh.wl.OKHTTPxz.rg_wlxzjtl rg_n71795;
            rg_n71795 = new hsh.anzh.wl.OKHTTPxz.rg_wlxzjtl(null);
            rg_n71795.rl_wlxzjtl_n45451 (new hsh.anzh.wl.OKHTTPxz.rg_wlxzjtl.re_n45451 () {
                public int dispatch (hsh.anzh.wl.OKHTTPxz.rg_wlxzjtl objSource, int nTagNumber, java.lang.Object rg_n45452, com.lzy.okgo.model.Progress rg_n45453) {
                    return rg_n71796 (objSource, nTagNumber, rg_n45452, rg_n45453);
                }
            }, 0);
            rg_n71795.rl_wlxzjtl_n45457 (new hsh.anzh.wl.OKHTTPxz.rg_wlxzjtl.re_n45457 () {
                public int dispatch (hsh.anzh.wl.OKHTTPxz.rg_wlxzjtl objSource, int nTagNumber, java.lang.Object rg_n45458, java.io.File rg_n45459, com.lzy.okgo.model.Progress rg_n45460) {
                    return rg_n71802 (objSource, nTagNumber, rg_n45458, rg_n45459, rg_n45460);
                }
            }, 0);
            rg_n71795.rl_wlxzjtl_n45454 (new hsh.anzh.wl.OKHTTPxz.rg_wlxzjtl.re_n45454 () {
                public int dispatch (hsh.anzh.wl.OKHTTPxz.rg_wlxzjtl objSource, int nTagNumber, java.lang.Object rg_n45455, com.lzy.okgo.model.Progress rg_n45456) {
                    return rg_n71809 (objSource, nTagNumber, rg_n45455, rg_n45456);
                }
            }, 0);
            rg_n71794.register(rg_n71795);
            rg_n71794.save();
            rg_n71794.folder(rg_n71792);
            rg_n71794.fileName(rg_n71793);
            rg_n71794.start();
            return (rg_n71794.progress.tag + "0%");
        }
        else
        {
            return ("任务创建失败！");
        }
    }

    protected int rg_n71796 (hsh.anzh.wl.OKHTTPxz.rg_wlxzjtl rg_n71797, int rg_n71798, java.lang.Object rg_n71799, com.lzy.okgo.model.Progress rg_n71800) {
        hsh.anzh.jb.rg_ann rg_n71801 = new hsh.anzh.jb.rg_ann (this, new Button (this));
        rg_n71801.onInitControlContent (this, null);
        rg_n71801 = (hsh.anzh.jb.rg_ann)rg_n71743.rg_n7383 (1000);
        rg_n71801.rg_n7049 (String.valueOf ((int)Math.round (hsh.anzh.wl.OKHTTPfw.rg_wlfwjdl.rg_n45261 (rg_n71800) * 100)) + "%");
        return (0);
    }

    protected int rg_n71802 (hsh.anzh.wl.OKHTTPxz.rg_wlxzjtl rg_n71803, int rg_n71804, java.lang.Object rg_n71805, java.io.File rg_n71806, com.lzy.okgo.model.Progress rg_n71807) {
        java.io.File rg_n71808;
        rg_n71808 = new java.io.File ("/sdcard/" + rg_n71807.fileName);
        hsh.anzh.jb.rg_yyanzhl.rg_n2570 (this, rg_n71808);
        return (0);
    }

    protected int rg_n71809 (hsh.anzh.wl.OKHTTPxz.rg_wlxzjtl rg_n71810, int rg_n71811, java.lang.Object rg_n71812, com.lzy.okgo.model.Progress rg_n71813) {
        hsh.anzh.jb.AndComActivity.rg_n4833 (this, "下载失败");
        return (0);
    }

    protected int rg_n71814 (hsh.anzh.jb.rg_tpann rg_n71815, int rg_n71816) {
        if (rg_n71816 == 1)
        {
            rg_n71743.rg_n7376 ();
        }
        return (0);
    }

    public void rg_n1508 (android.content.Intent rg_n71817, java.lang.Object [] rg_n71818, int rg_n71819) {
        super.rg_n1508 (rg_n71817, rg_n71818, rg_n71819);
        rg_n71749.builder.setPermissions(hsh.anzh.jb.rg_anzhqx.rg_n12268);
        rg_n71749.builder.setPermissions(hsh.anzh.jb.rg_anzhqx.rg_n12269);
        rg_n71749.builder.setPermissions(hsh.anzh.jb.rg_anzhqx.rg_n12303);
        rg_n71749.builder.setPermissions(hsh.anzh.jb.rg_anzhqx.rg_n12304);
        rg_n71749.rg_n46864 (true, true, false, "本程序运行需要您授予权限", "提示", "确定", "您拒绝了权限导致本程序无法正常运行，请前往系统设置手动启用权限", "提示", "关闭", true, "设置", true);
        hsh.anzh.rg_ymtjl.rg_n48112 ("5f215eaeb4b08b653e8f68ed", "Voldev", false);
        hsh.anzh.wl.OKHTTPxz.rg_wlxzl.rg_n45370 ();
        hsh.Java.jb.rg_xchl1 rg_n71820 = new hsh.Java.jb.rg_xchl1 ();
        rg_n71748 = hsh.anzh.jb.rg_jddhkl.rg_n7453 (this);
        rg_n71748.rg_n7350 ("正在检测");
        rg_n71748.rg_n7431 ("请稍等。。。");
        rg_n71748.rg_n7352 (true);
        rg_n71748.rg_n7354 (true);
        rg_n71748.rg_n7373 ();
        rg_n71820.rl_xchl1_n52944 (new hsh.Java.jb.rg_xchl1.re_n52944 () {
            public int dispatch (hsh.Java.jb.rg_xchl1 objSource, int nTagNumber, java.lang.Object rg_n52945, java.lang.Object rg_n52946) {
                return rg_n71784 (objSource, nTagNumber, rg_n52945, rg_n52946);
            }
        }, 0);
        rg_n71820.rg_n52941 ((Object)"http://127.0.0.1/bbxx.txt", null);
        {
            rg_n71733.rg_n5474 (true);
            rg_n71737.rg_n5477 (hsh.anzh.jb.rg_zjkshzht.rg_n5351);
        }
    }

    protected int rg_n71821 (hsh.anzh.jb.rg_anzhwlczl rg_n71822, int rg_n71823, byte [] rg_n71824, String rg_n71825, String rg_n71826, int rg_n71827) {
        String rg_n71828;
        String [] rg_n71829;
        String rg_n71830;
        rg_n71828 = hsh.Java.jb.rg_wbxl.rg_n52584 (rg_n71824, hsh.Java.jb.rg_wbbm.rg_n52522);
        rg_n71829 = anzh.mm.jbshjlx.rg_wbczgjl.rg_n63333 (rg_n71828, "@");
        if (rg_n71829.length == 0)
        {
            rg_n71748.rg_n7376 ();
            hsh.anzh.jb.AndComActivity.rg_n4833 (this, "获取信息失败");
            return (0);
        }
        rg_n71744 = rg_n71829 [0];
        rg_n71746 = rg_n71829 [1];
        rg_n71745 = rg_n71829 [2];
        rg_n71830 = hsh.anzh.wlghzhchk.rg_yyczl.rg_n70932 ();
        rg_n71744 = anzh.mm.jbshjlx.rg_wbczgjl.rg_n63452 (rg_n71744);
        rg_n71830 = anzh.mm.jbshjlx.rg_wbczgjl.rg_n63452 (rg_n71830);
        rg_n71744 = hsh.Java.jb.rg_wbxl.rg_n52578 (hsh.anzh.yw.rg_bml.rg_n59223 (rg_n71744));
        rg_n71830 = hsh.Java.jb.rg_wbxl.rg_n52578 (hsh.anzh.yw.rg_bml.rg_n59223 (rg_n71830));
        hsh.anzh.jb.rg_chygn.dbg_log (rg_n71744,"");
        hsh.anzh.jb.rg_chygn.dbg_log (rg_n71830,"");
        hsh.anzh.jb.rg_chygn.dbg_log (rg_yqwbjjm.rg_n71904 (rg_n71744),"");
        hsh.anzh.jb.rg_chygn.dbg_log (rg_yqwbjjm.rg_n71904 (rg_n71830),"");
        hsh.anzh.jb.rg_chygn.dbg_log (String.valueOf (hsh.anzh.yw.rg_shzl.rg_n58758 (hsh.anzh.yw.rg_bml.rg_n59223 (rg_n71744))),"");
        hsh.anzh.jb.rg_chygn.dbg_log (String.valueOf (hsh.anzh.yw.rg_shzl.rg_n58758 (hsh.anzh.yw.rg_bml.rg_n59223 (rg_n71830))),"");
        if (rg_n71744.equals (rg_n71830) == false)
        {
            rg_n71769 ();
        }
        else
        {
            rg_n71748.rg_n7376 ();
            hsh.anzh.jb.AndComActivity.rg_n4833 (this, "当前没有更新版本！");
        }
        return (0);
    }

    public void rg_n1520 () {
        com.wuliguanhua.toast.Toasts.error(hsh.anzh.jb.rg_yychx.rg_n2541(), "程序被退出，请重新启动服务！", (true ? com.wuliguanhua.toast.Toasts.LENGTH_LONG : com.wuliguanhua.toast.Toasts.LENGTH_SHORT), true).show();
        super.rg_n1520 ();
    }

    public void rg_n1516 () {
        super.rg_n1516 ();
        com.umeng.analytics.MobclickAgent.onResume(this);
    }

    public void rg_n1517 () {
        super.rg_n1517 ();
        com.umeng.analytics.MobclickAgent.onPause(this);
    }

    public void rg_n1519 () {
        com.wuliguanhua.toast.Toasts.error(hsh.anzh.jb.rg_yychx.rg_n2541(), "程序被退出，请重新启动服务！", (true ? com.wuliguanhua.toast.Toasts.LENGTH_LONG : com.wuliguanhua.toast.Toasts.LENGTH_SHORT), true).show();
        super.rg_n1519 ();
    }

    public void rg_n1518 () {
        com.wuliguanhua.toast.Toasts.error(hsh.anzh.jb.rg_yychx.rg_n2541(), "程序被退出，请重新启动服务！", (true ? com.wuliguanhua.toast.Toasts.LENGTH_LONG : com.wuliguanhua.toast.Toasts.LENGTH_SHORT), true).show();
        super.rg_n1518 ();
    }
}

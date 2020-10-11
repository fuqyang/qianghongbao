
package hsh.anzh.jb;

public class rg_zhtdtxb {

    public rg_zhtdtxb ()  { }

    public int rg_n8173;
    public int rg_n8174;
    public int rg_n8175;
    public int rg_n8176;
    public int rg_n8177;
    public int rg_n8178;
    public int rg_n8179;
    public int rg_n8180;
    public int rg_n8181;
    public int rg_n8182;

    public android.graphics.drawable.StateListDrawable rg_n8183 () {
        android.graphics.drawable.Drawable rg_n8184;
        rg_n8184 = rg_zyglq.rg_n11901 (rg_n8182);
        if (rg_n8184 == null)
        {
            return (null);
        }
        android.graphics.drawable.StateListDrawable list = new android.graphics.drawable.StateListDrawable ();
        if (rg_n8176 != 0)
            list.addState (new int [] { -android.R.attr.state_enabled }, rg_zyglq.rg_n11901 (rg_n8176));
        if (rg_n8177 != 0)
            list.addState (new int [] { android.R.attr.state_pressed, android.R.attr.state_window_focused }, rg_zyglq.rg_n11901 (rg_n8177));
        if (rg_n8181 != 0)
            list.addState (new int [] { android.R.attr.state_drag_can_accept, android.R.attr.state_window_focused }, rg_zyglq.rg_n11901 (rg_n8181));
        if (rg_n8180 != 0)
            list.addState (new int [] { android.R.attr.state_drag_hovered, android.R.attr.state_window_focused }, rg_zyglq.rg_n11901 (rg_n8180));
        if (rg_n8179 != 0)
            list.addState (new int [] { android.R.attr.state_hovered, android.R.attr.state_window_focused }, rg_zyglq.rg_n11901 (rg_n8179));
        if (rg_n8174 != 0)
            list.addState (new int [] { android.R.attr.state_selected }, rg_zyglq.rg_n11901 (rg_n8174));
        if (rg_n8175 != 0)
            list.addState (new int [] { android.R.attr.state_focused }, rg_zyglq.rg_n11901 (rg_n8175));
        if (rg_n8178 != 0)
            list.addState (new int [] { android.R.attr.state_activated }, rg_zyglq.rg_n11901 (rg_n8178));
        if (rg_n8173 != 0)
            list.addState (new int [] { android.R.attr.state_window_focused }, rg_zyglq.rg_n11901 (rg_n8173));
        list.addState (android.util.StateSet.WILD_CARD, rg_n8184);
        return list;
    }
}

            package p000;

            import android.content.Context;
            import android.graphics.PorterDuff;
            import android.graphics.drawable.Drawable;
            import com.box.gallery.R;
            import java.lang.invoke.VarHandle;
            
            public final class I11oo00 {
                public static final PorterDuff.Mode I00000oOI = PorterDuff.Mode.SRC_IN;
                public static I11oo00 I0000Il00O;
                public Oi0loIIIoI I00000oIO;

                public static synchronized I11oo00 I00000oIO() {
                    try {
/* 6 */                 if (I0000Il00O == null) {
/* 8 */                     I0000Il00O();
                        }
                    } catch (Throwable th) {
/* 20 */                throw th;
                    }
/* 14 */            return I0000Il00O;
                }

                public static synchronized void I0000Il00O() {
/* 6 */             if (I0000Il00O == null) {
/* 10 */                I11oo00 i11oo00 = new I11oo00();
/* 13 */                I0000Il00O = i11oo00;
/* 19 */                i11oo00.I00000oIO = Oi0loIIIoI.I0000Il00O();
/* 23 */                Oi0loIIIoI oi0loIIIoI = I0000Il00O.I00000oIO;
/* 28 */                I0Oi111ii i0Oi111ii = new I0Oi111ii(1);
/* 44 */                i0Oi111ii.I00iiI = new int[]{R.drawable.abc_textfield_search_default_mtrl_alpha, R.drawable.abc_textfield_default_mtrl_alpha, R.drawable.abc_ab_share_pack_mtrl_alpha};
/* 52 */                i0Oi111ii.I00iiO = new int[]{R.drawable.abc_ic_commit_search_api_mtrl_alpha, R.drawable.abc_seekbar_tick_mark_material, R.drawable.abc_ic_menu_share_mtrl_alpha, R.drawable.abc_ic_menu_copy_mtrl_am_alpha, R.drawable.abc_ic_menu_cut_mtrl_alpha, R.drawable.abc_ic_menu_selectall_mtrl_alpha, R.drawable.abc_ic_menu_paste_mtrl_am_alpha};
/* 59 */                i0Oi111ii.I00iio = new int[]{R.drawable.abc_textfield_activated_mtrl_alpha, R.drawable.abc_textfield_search_activated_mtrl_alpha, R.drawable.abc_cab_background_top_mtrl_alpha, R.drawable.abc_text_cursor_material, R.drawable.abc_text_select_handle_left_mtrl, R.drawable.abc_text_select_handle_middle_mtrl, R.drawable.abc_text_select_handle_right_mtrl};
/* 74 */                i0Oi111ii.I00ilI0I1 = new int[]{R.drawable.abc_popup_background_mtrl_mult, R.drawable.abc_cab_background_internal_bg, R.drawable.abc_menu_hardkey_panel_mtrl_mult};
/* 86 */                i0Oi111ii.I00ilO0 = new int[]{R.drawable.abc_tab_indicator_material, R.drawable.abc_textfield_search_material};
/* 104 */               i0Oi111ii.I00io1l = new int[]{R.drawable.abc_btn_check_material, R.drawable.abc_btn_radio_material, R.drawable.abc_btn_check_material_anim, R.drawable.abc_btn_radio_material_anim};
/* 106 */               VarHandle.storeStoreFence();
                        synchronized (oi0loIIIoI) {
/* 110 */                   oi0loIIIoI.I0000oI00 = i0Oi111ii;
                        }
                    }
                }

                public final synchronized Drawable I00000oOI(Context context, int i) {
/* 4 */             return this.I00000oIO.I0000O(context, i);
                }
            }

            package p000;

            import android.content.Context;
            import android.content.res.Resources;
            import android.graphics.Point;
            import android.graphics.Rect;
            import android.os.Handler;
            import android.view.Display;
            import android.view.Gravity;
            import android.view.LayoutInflater;
            import android.view.View;
            import android.view.WindowManager;
            import android.widget.PopupWindow;
            import com.box.gallery.R;
            import java.lang.invoke.VarHandle;
            import java.util.ArrayList;
            
            public class O1ioooII10 {
                public final Context I00000oIO;
                public final O1illlIiilIl I00000oOI;
                public final boolean I0000Il00O;
                public final int I0000O;
                public View I0000oI00;
                public int I0001Ioi1lo = 8388611;
                public boolean I000II;
                public O1l0OiO10IoI I000O01llI0;
                public O1ioll1O01 I000OOo1O;
                public PopupWindow.OnDismissListener I000OiO;
                public final O1iooliOi I000iOII;

                public O1ioooII10(Context context, O1illlIiilIl o1illlIiilIl, View view, boolean z, int i, int i2) {
/* 11 */            O1iooliOi o1iooliOi = new O1iooliOi();
/* 14 */            o1iooliOi.I00iOIl = this;
/* 16 */            VarHandle.storeStoreFence();
/* 19 */            this.I000iOII = o1iooliOi;
/* 21 */            this.I00000oIO = context;
/* 23 */            this.I00000oOI = o1illlIiilIl;
/* 25 */            this.I0000oI00 = view;
/* 27 */            this.I0000Il00O = z;
/* 29 */            this.I0000O = i;
                }

                /* JADX WARN: Multi-variable type inference failed */
                public final O1ioll1O01 I00000oIO() throws Resources.NotFoundException {
                    OlIlil1IO1I olIlil1IO1I;
/* 1 */             O1ioll1O01 o1ioll1O01 = this.I000OOo1O;
                    O1ioll1O01 o1ioll1O012 = o1ioll1O01;
/* 3 */             if (o1ioll1O01 == null) {
/* 7 */                 Context context = this.I00000oIO;
/* 15 */                Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
/* 21 */                Point point = new Point();
/* 24 */                defaultDisplay.getRealSize(point);
/* 31 */                int iMin = Math.min(point.x, point.y);
/* 42 */                int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.abc_cascading_menus_min_smallest_width);
/* 46 */                View view = this.I0000oI00;
/* 48 */                int i = 2;
/* 49 */                boolean z = false;
/* 50 */                O1illlIiilIl o1illlIiilIl = this.I00000oOI;
/* 55 */                boolean z2 = this.I0000Il00O;
/* 57 */                int i2 = this.I0000O;
/* 59 */                if (iMin >= dimensionPixelSize) {
/* 63 */                    IO0iOlIO1o iO0iOlIO1o = new IO0iOlIO1o();
/* 71 */                    iO0iOlIO1o.I00io1l = new ArrayList();
/* 78 */                    iO0iOlIO1o.I00ioIO = new ArrayList();
/* 82 */                    I1I0llO0I i1I0llO0I = new I1I0llO0I(i);
/* 85 */                    i1I0llO0I.I00iiI = iO0iOlIO1o;
/* 87 */                    VarHandle.storeStoreFence();
/* 90 */                    iO0iOlIO1o.I00l0I0l0lO1 = i1I0llO0I;
/* 95 */                    I0oIl0io0II1 i0oIl0io0II1 = new I0oIl0io0II1(1);
/* 98 */                    i0oIl0io0II1.I00iiI = iO0iOlIO1o;
/* 100 */                   VarHandle.storeStoreFence();
/* 103 */                   iO0iOlIO1o.I00l0OO0IO = i0oIl0io0II1;
/* 108 */                   Oi0Oooi oi0Oooi = new Oi0Oooi(6, z ? 1 : 0);
/* 111 */                   oi0Oooi.I00iiI = iO0iOlIO1o;
/* 113 */                   VarHandle.storeStoreFence();
/* 116 */                   iO0iOlIO1o.I00li1OI = oi0Oooi;
/* 118 */                   iO0iOlIO1o.I00ll1 = 0;
/* 120 */                   iO0iOlIO1o.I00lli11 = 0;
/* 122 */                   iO0iOlIO1o.I00iiI = context;
/* 124 */                   iO0iOlIO1o.I00lll10 = view;
/* 126 */                   iO0iOlIO1o.I00iio = i2;
/* 128 */                   iO0iOlIO1o.I00ilI0I1 = z2;
/* 130 */                   iO0iOlIO1o.I00oO101o = false;
/* 140 */                   iO0iOlIO1o.I00o0l1o1o0 = view.getLayoutDirection() != 1 ? 1 : 0;
/* 142 */                   Resources resources = context.getResources();
/* 161 */                   iO0iOlIO1o.I00iiO = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
/* 168 */                   iO0iOlIO1o.I00ilO0 = new Handler();
/* 170 */                   VarHandle.storeStoreFence();
                            olIlil1IO1I = iO0iOlIO1o;
                        } else {
/* 176 */                   OlIlil1IO1I olIlil1IO1I2 = new OlIlil1IO1I();
/* 181 */                   int i3 = 3;
/* 182 */                   I1I0llO0I i1I0llO0I2 = new I1I0llO0I(i3);
/* 185 */                   i1I0llO0I2.I00iiI = olIlil1IO1I2;
/* 187 */                   VarHandle.storeStoreFence();
/* 190 */                   olIlil1IO1I2.I00l0I0l0lO1 = i1I0llO0I2;
/* 194 */                   I0oIl0io0II1 i0oIl0io0II12 = new I0oIl0io0II1(i3);
/* 197 */                   i0oIl0io0II12.I00iiI = olIlil1IO1I2;
/* 199 */                   VarHandle.storeStoreFence();
/* 202 */                   olIlil1IO1I2.I00l0OO0IO = i0oIl0io0II12;
/* 204 */                   olIlil1IO1I2.I00oII = 0;
/* 206 */                   olIlil1IO1I2.I00iiI = context;
/* 208 */                   olIlil1IO1I2.I00iiO = o1illlIiilIl;
/* 210 */                   olIlil1IO1I2.I00ilI0I1 = z2;
/* 224 */                   olIlil1IO1I2.I00iio = new O1ilIool(o1illlIiilIl, LayoutInflater.from(context), z2, R.layout.abc_popup_menu_item_layout);
/* 226 */                   olIlil1IO1I2.I00io1l = i2;
/* 228 */                   Resources resources2 = context.getResources();
/* 247 */                   olIlil1IO1I2.I00ilO0 = Math.max(resources2.getDisplayMetrics().widthPixels / 2, resources2.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
/* 249 */                   olIlil1IO1I2.I00ll1 = view;
/* 257 */                   olIlil1IO1I2.I00ioIO = new O1l0IO(context, null, i2, 0);
/* 259 */                   o1illlIiilIl.I00000oOI(olIlil1IO1I2, context);
/* 262 */                   VarHandle.storeStoreFence();
                            olIlil1IO1I = olIlil1IO1I2;
                        }
/* 265 */               olIlil1IO1I.I000l1(o1illlIiilIl);
/* 270 */               olIlil1IO1I.I0010I0i(this.I000iOII);
/* 275 */               olIlil1IO1I.I000o00OoI0I(this.I0000oI00);
/* 280 */               olIlil1IO1I.I000II(this.I000O01llI0);
/* 285 */               olIlil1IO1I.I000oI1ioi(this.I000II);
/* 290 */               olIlil1IO1I.I00100l0(this.I0001Ioi1lo);
/* 293 */               this.I000OOo1O = olIlil1IO1I;
                        o1ioll1O012 = olIlil1IO1I;
                    }
/* 743 */           return o1ioll1O012;
                }

                public final boolean I00000oOI() {
/* 1 */             O1ioll1O01 o1ioll1O01 = this.I000OOo1O;
                    return o1ioll1O01 != null && o1ioll1O01.I00000oIO();
                }

                public void I0000Il00O() {
/* 2 */             this.I000OOo1O = null;
/* 4 */             PopupWindow.OnDismissListener onDismissListener = this.I000OiO;
/* 6 */             if (onDismissListener != null) {
/* 8 */                 onDismissListener.onDismiss();
                    }
                }

                public final void I0000O(int i, int i2, boolean z, boolean z2) {
/* 1 */             O1ioll1O01 o1ioll1O01I00000oIO = I00000oIO();
/* 5 */             o1ioll1O01I00000oIO.I0010o(z2);
/* 8 */             if (z) {
/* 25 */                if ((Gravity.getAbsoluteGravity(this.I0001Ioi1lo, this.I0000oI00.getLayoutDirection()) & 7) == 5) {
/* 33 */                    i -= this.I0000oI00.getWidth();
                        }
/* 34 */                o1ioll1O01I00000oIO.I00100o1O0lo(i);
/* 37 */                o1ioll1O01I00000oIO.I00111O(i2);
/* 58 */                int i3 = (int) ((this.I00000oIO.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
/* 70 */                o1ioll1O01I00000oIO.I00iOIl = new Rect(i - i3, i2 - i3, i + i3, i2 + i3);
                    }
/* 72 */            o1ioll1O01I00000oIO.I0001Ioi1lo();
                }
            }

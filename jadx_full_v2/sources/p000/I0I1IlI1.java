            package p000;

            import android.content.Context;
            import android.view.View;
            import com.box.gallery.R;
            
/* 48 */    public final class I0I1IlI1 extends O1ioooII10 {
                public final int I000l1 = 1;
                public final I0I1ii0i I000lI;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public I0I1IlI1(I0I1ii0i i0I1ii0i, Context context, Oli1l1l0 oli1l1l0, View view) {
/* 15 */            super(context, oli1l1l0, view, false, R.attr.actionOverflowMenuStyle, 0);
/* 4 */             this.I000lI = i0I1ii0i;
/* 25 */            if ((oli1l1l0.I001lIiIIo1O.I001i1lo1io & 32) != 32) {
/* 28 */                View view2 = i0I1ii0i.I00l0I0l0lO1;
/* 36 */                this.I0000oI00 = view2 == null ? (View) i0I1ii0i.I00ioIO : view2;
                    }
/* 38 */            Oi0Oooi oi0Oooi = i0I1ii0i.I00ol1;
/* 40 */            this.I000O01llI0 = oi0Oooi;
/* 42 */            O1ioll1O01 o1ioll1O01 = this.I000OOo1O;
/* 44 */            if (o1ioll1O01 != null) {
/* 46 */                o1ioll1O01.I000II(oi0Oooi);
                    }
                }

                @Override
                public final void I0000Il00O() {
/* 1 */             int i = this.I000l1;
/* 4 */             I0I1ii0i i0I1ii0i = this.I000lI;
                    switch (i) {
                        case 0:
/* 23 */                    i0I1ii0i.I00oIiI10 = null;
/* 25 */                    super.I0000Il00O();
                            break;
                        default:
/* 9 */                     O1illlIiilIl o1illlIiilIl = i0I1ii0i.I00iiO;
/* 11 */                    if (o1illlIiilIl != null) {
/* 14 */                        o1illlIiilIl.I0000Il00O(true);
                            }
/* 17 */                    i0I1ii0i.I00oII = null;
/* 19 */                    super.I0000Il00O();
                            break;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
/* 49 */        public I0I1IlI1(I0I1ii0i i0I1ii0i, Context context, O1illlIiilIl o1illlIiilIl, View view) {
/* 51 */            super(context, o1illlIiilIl, view, true, R.attr.actionOverflowMenuStyle, 0);
/* 50 */            this.I000lI = i0I1ii0i;
/* 52 */            this.I0001Ioi1lo = 8388613;
/* 53 */            Oi0Oooi oi0Oooi = i0I1ii0i.I00ol1;
/* 54 */            this.I000O01llI0 = oi0Oooi;
/* 55 */            O1ioll1O01 o1ioll1O01 = this.I000OOo1O;
                    if (o1ioll1O01 != null) {
/* 56 */                o1ioll1O01.I000II(oi0Oooi);
                    }
                }
            }

            package p000;

            import android.view.View;
            import android.view.WindowInsets;
            
/* 3 */     public class i00i0II extends i00Ooo0i11 {
                static {
/* 4 */             i00iooo00li.I0000Il00O(null, WindowInsets.CONSUMED);
                }

                public i00i0II(i00iooo00li i00iooo00liVar, WindowInsets windowInsets) {
/* 1 */             super(i00iooo00liVar, windowInsets);
                }

                @Override
                public Ioo0l0I I000OOo1O(int i) {
/* 11 */            return Ioo0l0I.I00000oOI(this.I0000Il00O.getInsets(i00iOo0O.I00000oIO(i)));
                }

                @Override
                public Ioo0l0I I000OiO(int i) {
/* 11 */            return Ioo0l0I.I00000oOI(this.I0000Il00O.getInsetsIgnoringVisibility(i00iOo0O.I00000oIO(i)));
                }

                @Override
                public boolean I001IIilI0O(int i) {
/* 7 */             return this.I0000Il00O.isVisible(i00iOo0O.I00000oIO(i));
                }

/* 4 */         public i00i0II(i00iooo00li i00iooo00liVar, i00i0II i00i0ii) {
/* 5 */             super(i00iooo00liVar, i00i0ii);
                }

                @Override
/* 28 */        public final void I0000O(View view) {
                }
            }

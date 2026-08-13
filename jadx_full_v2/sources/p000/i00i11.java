            package p000;

            import android.view.View;
            import android.view.WindowInsets;
            
/* 3 */     public class i00i11 extends i00i0o0I1i0o {
                public static final i00iooo00li I0010I0i = i00iooo00li.I0000Il00O(null, WindowInsets.CONSUMED);

                public i00i11(i00iooo00li i00iooo00liVar, WindowInsets windowInsets) {
/* 1 */             super(i00iooo00liVar, windowInsets);
                }

                @Override
                public Ioo0l0I I000OOo1O(int i) {
/* 11 */            return Ioo0l0I.I00000oOI(this.I0000Il00O.getInsets(i00il0oII.I00000oIO(i)));
                }

                @Override
                public Ioo0l0I I000OiO(int i) {
/* 11 */            return Ioo0l0I.I00000oOI(this.I0000Il00O.getInsetsIgnoringVisibility(i00il0oII.I00000oIO(i)));
                }

                @Override
                public boolean I001IIilI0O(int i) {
/* 7 */             return this.I0000Il00O.isVisible(i00il0oII.I00000oIO(i));
                }

/* 4 */         public i00i11(i00iooo00li i00iooo00liVar, i00i11 i00i11Var) {
/* 5 */             super(i00iooo00liVar, i00i11Var);
                }

                @Override
/* 28 */        public void I00100l0(View view) {
                }
            }

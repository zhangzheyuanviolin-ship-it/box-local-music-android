            package p000;

            import android.view.WindowInsets;
            
/* 10 */    public class i00Oi000 extends i00OOi {
                public Ioo0l0I I000o00OoI0I;

                public i00Oi000(i00iooo00li i00iooo00liVar, i00Oi000 i00oi000) {
/* 1 */             super(i00iooo00liVar, i00oi000);
/* 5 */             this.I000o00OoI0I = null;
/* 9 */             this.I000o00OoI0I = i00oi000.I000o00OoI0I;
                }

                @Override
                public i00iooo00li I00000oOI() {
/* 8 */             return i00iooo00li.I0000Il00O(null, this.I0000Il00O.consumeStableInsets());
                }

                @Override
                public i00iooo00li I0000Il00O() {
/* 8 */             return i00iooo00li.I0000Il00O(null, this.I0000Il00O.consumeSystemWindowInsets());
                }

                @Override
                public final Ioo0l0I I000l1() {
/* 1 */             Ioo0l0I ioo0l0I = this.I000o00OoI0I;
/* 3 */             if (ioo0l0I != null) {
/* 55 */                return ioo0l0I;
                    }
/* 5 */             WindowInsets windowInsets = this.I0000Il00O;
/* 23 */            Ioo0l0I ioo0l0II00000oIO = Ioo0l0I.I00000oIO(windowInsets.getStableInsetLeft(), windowInsets.getStableInsetTop(), windowInsets.getStableInsetRight(), windowInsets.getStableInsetBottom());
/* 27 */            this.I000o00OoI0I = ioo0l0II00000oIO;
/* 55 */            return ioo0l0II00000oIO;
                }

                @Override
                public boolean I0010o() {
/* 3 */             return this.I0000Il00O.isConsumed();
                }

/* 11 */        public i00Oi000(i00iooo00li i00iooo00liVar, WindowInsets windowInsets) {
/* 12 */            super(i00iooo00liVar, windowInsets);
/* 13 */            this.I000o00OoI0I = null;
                }
            }

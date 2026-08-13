            package p000;

            import android.view.WindowInsets;
            
/* 22 */    public abstract class i00O1OOiIil extends i00OOOOi {
                public final WindowInsets.Builder I0000Il00O;

                public i00O1OOiIil(i00iooo00li i00iooo00liVar) {
/* 1 */             super(i00iooo00liVar);
/* 4 */             WindowInsets windowInsetsI00000oOI = i00iooo00liVar.I00000oOI();
/* 21 */            this.I0000Il00O = windowInsetsI00000oOI != null ? new WindowInsets.Builder(windowInsetsI00000oOI) : new WindowInsets.Builder();
                }

                @Override
                public i00iooo00li I00000oOI() {
/* 1 */             I00000oIO();
/* 11 */            i00iooo00li i00iooo00liVarI0000Il00O = i00iooo00li.I0000Il00O(null, this.I0000Il00O.build());
/* 15 */            i00i1I1 i00i1i1 = i00iooo00liVarI0000Il00O.I00000oIO;
/* 17 */            i00i1i1.I001i1O0Ol(null);
/* 20 */            i00i1i1.I001IO000(null);
/* 25 */            i00i1i1.I001lIiIIo1O(this.I00000oIO);
/* 30 */            i00i1i1.I001lllioOl(this.I00000oOI);
/* 55 */            return i00iooo00liVarI0000Il00O;
                }

                @Override
                public void I0000O(Ioo0l0I ioo0l0I) {
/* 7 */             this.I0000Il00O.setStableInsets(ioo0l0I.I0000Il00O());
                }

                @Override
                public void I0000oI00(Ioo0l0I ioo0l0I) {
/* 7 */             this.I0000Il00O.setSystemWindowInsets(ioo0l0I.I0000Il00O());
                }

/* 23 */        public i00O1OOiIil() {
/* 25 */            this.I0000Il00O = new WindowInsets.Builder();
                }
            }

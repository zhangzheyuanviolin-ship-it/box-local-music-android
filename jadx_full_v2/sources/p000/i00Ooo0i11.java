            package p000;

            import android.view.WindowInsets;
            
/* 10 */    public class i00Ooo0i11 extends i00Oi1Ii01 {
                public Ioo0l0I I000oI1ioi;
                public Ioo0l0I I00100l0;
                public Ioo0l0I I00100o1O0lo;

                public i00Ooo0i11(i00iooo00li i00iooo00liVar, WindowInsets windowInsets) {
/* 1 */             super(i00iooo00liVar, windowInsets);
/* 5 */             this.I000oI1ioi = null;
/* 7 */             this.I00100l0 = null;
/* 9 */             this.I00100o1O0lo = null;
                }

                @Override
                public Ioo0l0I I000iOII() {
/* 1 */             Ioo0l0I ioo0l0I = this.I00100l0;
/* 3 */             if (ioo0l0I != null) {
/* 20 */                return ioo0l0I;
                    }
/* 11 */            Ioo0l0I ioo0l0II00000oOI = Ioo0l0I.I00000oOI(this.I0000Il00O.getMandatorySystemGestureInsets());
/* 15 */            this.I00100l0 = ioo0l0II00000oOI;
/* 20 */            return ioo0l0II00000oOI;
                }

                @Override
                public Ioo0l0I I000lI() {
/* 1 */             Ioo0l0I ioo0l0I = this.I000oI1ioi;
/* 3 */             if (ioo0l0I != null) {
/* 20 */                return ioo0l0I;
                    }
/* 11 */            Ioo0l0I ioo0l0II00000oOI = Ioo0l0I.I00000oOI(this.I0000Il00O.getSystemGestureInsets());
/* 15 */            this.I000oI1ioi = ioo0l0II00000oOI;
/* 20 */            return ioo0l0II00000oOI;
                }

                @Override
                public Ioo0l0I I000oI1ioi() {
/* 1 */             Ioo0l0I ioo0l0I = this.I00100o1O0lo;
/* 3 */             if (ioo0l0I != null) {
/* 20 */                return ioo0l0I;
                    }
/* 11 */            Ioo0l0I ioo0l0II00000oOI = Ioo0l0I.I00000oOI(this.I0000Il00O.getTappableElementInsets());
/* 15 */            this.I00100o1O0lo = ioo0l0II00000oOI;
/* 20 */            return ioo0l0II00000oOI;
                }

                @Override
                public i00iooo00li I0010I0i(int i, int i2, int i3, int i4) {
/* 8 */             return i00iooo00li.I0000Il00O(null, this.I0000Il00O.inset(i, i2, i3, i4));
                }

/* 11 */        public i00Ooo0i11(i00iooo00li i00iooo00liVar, i00Ooo0i11 i00ooo0i11) {
/* 12 */            super(i00iooo00liVar, i00ooo0i11);
/* 13 */            this.I000oI1ioi = null;
/* 14 */            this.I00100l0 = null;
/* 15 */            this.I00100o1O0lo = null;
                }
            }

            package p000;
            
            public final class O10IIlII01 extends I00io1l {
                public O10IIl I00000oIO;
                public int I00000oOI;
                public boolean I0000Il00O;

                @Override
                public final boolean I0000Il00O(II0oOIlio0 iI0oOIlio0) {
/* 3 */             if (!this.I0000Il00O) {
/* 11 */                return true;
                    }
/* 11 */            return true;
                }

                @Override
                public final II0oOIlio0 I0001Ioi1lo() {
/* 1 */             return this.I00000oIO;
                }

                @Override
                public final boolean I000II() {
/* 1 */             return true;
                }

                @Override
                public final II0oOO1 I000OOo1O(IiiliIioo0oi iiiliIioo0oi) {
/* 4 */             if (iiiliIioo0oi.I000OOo1O) {
/* 10 */                if (this.I00000oIO.I00000oOI == null) {
/* 55 */                    return null;
                        }
/* 17 */                II0oOIlio0 iI0oOIlio0I0001Ioi1lo = iiiliIioo0oi.I000O01llI0().I0001Ioi1lo();
/* 30 */                this.I0000Il00O = (iI0oOIlio0I0001Ioi1lo instanceof OIoi1lo00I00) || (iI0oOIlio0I0001Ioi1lo instanceof O10IIl);
/* 34 */                return II0oOO1.I00000oIO(iiiliIioo0oi.I0001Ioi1lo);
                    }
/* 39 */            int i = iiiliIioo0oi.I000O01llI0;
/* 41 */            int i2 = this.I00000oOI;
/* 43 */            if (i >= i2) {
/* 51 */                return new II0oOO1(-1, iiiliIioo0oi.I0000O + i2, false);
                    }
/* 55 */            return null;
                }
            }

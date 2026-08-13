            package p000;
            
            public final class O101iIO extends I00io1l {
                public O1011010Ii I00000oIO;
                public boolean I00000oOI;
                public int I0000Il00O;

                @Override
                public final boolean I0000Il00O(II0oOIlio0 iI0oOIlio0) {
/* 4 */             if (!(iI0oOIlio0 instanceof O10IIl)) {
/* 3 */                 return false;
                    }
/* 9 */             if (this.I00000oOI && this.I0000Il00O == 1) {
/* 15 */                this.I00000oOI = false;
                    }
/* 8 */             return true;
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
/* 6 */                 this.I00000oOI = true;
/* 9 */                 this.I0000Il00O = 0;
                    } else if (this.I00000oOI) {
                        this.I0000Il00O++;
                    }
/* 23 */            return II0oOO1.I00000oIO(iiiliIioo0oi.I0000Il00O);
                }
            }

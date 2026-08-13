            package p000;

            import java.io.IOException;
            
            public final class I1llI1Iil extends I00OOll1 {
                @Override
                public final void I000oI1ioi(O1OIll00i o1OIll00i, boolean z) throws IOException {
/* 5 */             o1OIll00i.I00Ol1ll1(48, z, this.I00iOIl);
                }

                @Override
                public final int I0010I0i(boolean z) {
/* 5 */             int iI0010I0i = z ? 4 : 3;
/* 8 */             int length = this.I00iOIl.length;
/* 10 */            for (int i = 0; i < length; i++) {
/* 25 */                iI0010I0i += this.I00iOIl[i].I0000O().I0010I0i(true);
                    }
/* 49 */            return iI0010I0i;
                }

                @Override
                public final I001lloI I00II0oii1o() {
/* 7 */             return new I1lioO11Il(I001i1O0Ol());
                }

                @Override
                public final I00O0o1oo I00IO1() {
/* 3 */             I00O0o1oo[] i00O0o1ooArrI001iOo1i0O = I001iOo1i0O();
/* 11 */            return new I1ll1ioil(I1ll1ioil.I001iOo1i0O(i00O0o1ooArrI001iOo1i0O), i00O0o1ooArrI001iOo1i0O);
                }

                @Override
                public final I00OilO00Il I00IO1oi11O() {
/* 6 */             return new I1lli01ioi(false, this.I00iOIl);
                }
            }

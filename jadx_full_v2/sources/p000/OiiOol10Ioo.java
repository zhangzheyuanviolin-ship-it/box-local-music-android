            package p000;
            
            public final class OiiOol10Ioo implements IllOOo00lI {
                public OiiO01I11iI I00iOIl;
                public int I00iiI;
                public int I00iiO;
                public Oiil1o0OIi I00iio;
                public O0ioIllo0i1 I00ilI0I1;

                @Override
                public final Object invoke() {
/* 1 */             OiiO01I11iI oiiO01I11iI = this.I00iOIl;
/* 3 */             int i = this.I00iiI;
/* 5 */             int i2 = this.I00iiO;
/* 7 */             Oiil1o0OIi oiil1o0OIi = this.I00iio;
/* 17 */            int iIntValue = ((Number) this.I00ilI0I1.getValue()).intValue();
/* 21 */            boolean zI00000oIO = oiil1o0OIi.I00000oIO();
/* 37 */            boolean z = oiil1o0OIi.I000OOo1O() == Ii0OiIIl00OO.I00iOIl;
/* 40 */            long jI000iOII = oiiO01I11iI.I0001Ioi1lo.I000iOII(i);
/* 44 */            Oo0iil0o0oI oo0iil0o0oI = oiiO01I11iI.I0001Ioi1lo;
/* 46 */            OI0OIIiOi oI0OIIiOi = oo0iil0o0oI.I00000oOI;
/* 48 */            int i3 = Oo0lI00l.I0000Il00O;
/* 54 */            int iI000O01llI0 = (int) (jI000iOII >> 32);
/* 55 */            int i4 = oI0OIIiOi.I0001Ioi1lo;
/* 61 */            if (oI0OIIiOi.I0000O(iI000O01llI0) != iIntValue) {
/* 73 */                iI000O01llI0 = iIntValue >= i4 ? oo0iil0o0oI.I000O01llI0(i4 - 1) : oo0iil0o0oI.I000O01llI0(iIntValue);
                    }
/* 83 */            int iI0000Il00O = (int) (jI000iOII & 4294967295L);
/* 88 */            if (oI0OIIiOi.I0000O(iI0000Il00O) != iIntValue) {
/* 99 */                iI0000Il00O = iIntValue >= i4 ? oI0OIIiOi.I0000Il00O(i4 - 1, false) : oI0OIIiOi.I0000Il00O(iIntValue, false);
                    }
/* 103 */           if (iI000O01llI0 == i2) {
/* 105 */               return oiiO01I11iI.I00000oIO(iI0000Il00O);
                    }
/* 110 */           if (iI0000Il00O == i2) {
/* 112 */               return oiiO01I11iI.I00000oIO(iI000O01llI0);
                    }
/* 119 */           if (!(zI00000oIO ^ z) ? i >= iI000O01llI0 : i > iI0000Il00O) {
/* 126 */               iI000O01llI0 = iI0000Il00O;
                    }
/* 127 */           return oiiO01I11iI.I00000oIO(iI000O01llI0);
                }
            }

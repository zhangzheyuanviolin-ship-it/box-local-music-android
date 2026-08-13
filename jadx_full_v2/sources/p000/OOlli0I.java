            package p000;

            import java.util.ArrayList;
            
            public final class OOlli0I {
                public final OOlioiIOOO1 I00000oIO;
                public final ArrayList I00000oOI;
                public final int I0000Il00O;
                public final IOI0oloi01 I0000O;
                public final I0Oi111ii I0000oI00;
                public final int I0001Ioi1lo;
                public final int I000II;
                public final int I000O01llI0;
                public int I000OOo1O;

                public OOlli0I(OOlioiIOOO1 oOlioiIOOO1, ArrayList arrayList, int i, IOI0oloi01 iOI0oloi01, I0Oi111ii i0Oi111ii, int i2, int i3, int i4) {
/* 4 */             this.I00000oIO = oOlioiIOOO1;
/* 6 */             this.I00000oOI = arrayList;
/* 8 */             this.I0000Il00O = i;
/* 10 */            this.I0000O = iOI0oloi01;
/* 12 */            this.I0000oI00 = i0Oi111ii;
/* 14 */            this.I0001Ioi1lo = i2;
/* 16 */            this.I000II = i3;
/* 18 */            this.I000O01llI0 = i4;
                }

                public static OOlli0I I00000oIO(OOlli0I oOlli0I, int i, IOI0oloi01 iOI0oloi01, I0Oi111ii i0Oi111ii, int i2) {
/* 3 */             if ((i2 & 1) != 0) {
/* 5 */                 i = oOlli0I.I0000Il00O;
                    }
/* 7 */             int i3 = i;
/* 10 */            if ((i2 & 2) != 0) {
/* 12 */                iOI0oloi01 = oOlli0I.I0000O;
                    }
/* 14 */            IOI0oloi01 iOI0oloi012 = iOI0oloi01;
/* 17 */            if ((i2 & 4) != 0) {
/* 19 */                i0Oi111ii = oOlli0I.I0000oI00;
                    }
/* 22 */            int i4 = oOlli0I.I0001Ioi1lo;
/* 24 */            int i5 = oOlli0I.I000II;
/* 26 */            int i6 = oOlli0I.I000O01llI0;
/* 34 */            return new OOlli0I(oOlli0I.I00000oIO, oOlli0I.I00000oOI, i3, iOI0oloi012, i0Oi111ii, i4, i5, i6);
                }

                public final Oi1001l0Il I00000oOI(I0Oi111ii i0Oi111ii) {
/* 1 */             ArrayList arrayList = this.I00000oOI;
/* 3 */             int size = arrayList.size();
/* 8 */             int i = this.I0000Il00O;
/* 10 */            if (i >= size) {
/* 154 */               I000II.I001IO000("Check failed.");
/* 7 */                 return null;
                    }
                    this.I000OOo1O++;
/* 20 */            IOI0oloi01 iOI0oloi01 = this.I0000O;
/* 24 */            if (iOI0oloi01 != null) {
/* 28 */                Il11O1o il11O1o = (Il11O1o) iOI0oloi01.I0000Il00O;
/* 32 */                IoOi01OlIl1o ioOi01OlIl1o = (IoOi01OlIl1o) i0Oi111ii.I00iiI;
/* 36 */                IoOi01OlIl1o ioOi01OlIl1o2 = il11O1o.I00000oOI.I000O01llI0;
/* 42 */                if (ioOi01OlIl1o.I0000oI00 != ioOi01OlIl1o2.I0000oI00 || !O0000Ioio00.I0000O(ioOi01OlIl1o.I0000O, ioOi01OlIl1o2.I0000O)) {
/* 75 */                    IOOlIIilOl0.I0001Ioi1lo(arrayList.get(i - 1), "network interceptor ", " must retain the same host and port");
/* 7 */                     return null;
                        }
/* 56 */                if (this.I000OOo1O != 1) {
/* 64 */                    IOOlIIilOl0.I0001Ioi1lo(arrayList.get(i - 1), "network interceptor ", " must call proceed() exactly once");
/* 7 */                     return null;
                        }
                    }
/* 79 */            int i2 = i + 1;
/* 83 */            OOlli0I oOlli0II00000oIO = I00000oIO(this, i2, null, i0Oi111ii, 58);
/* 91 */            IooilIO1I iooilIO1I = (IooilIO1I) arrayList.get(i);
/* 93 */            Oi1001l0Il oi1001l0IlI00000oIO = iooilIO1I.I00000oIO(oOlli0II00000oIO);
/* 99 */            if (oi1001l0IlI00000oIO == null) {
/* 151 */               throw new NullPointerException("interceptor " + iooilIO1I + " returned null");
                    }
/* 101 */           if (iOI0oloi01 != null && i2 < arrayList.size() && oOlli0II00000oIO.I000OOo1O != 1) {
/* 114 */               IOOlIIilOl0.I0001Ioi1lo(iooilIO1I, "network interceptor ", " must call proceed() exactly once");
/* 7 */                 return null;
                    }
/* 120 */           if (oi1001l0IlI00000oIO.I00io1l != null) {
/* 122 */               return oi1001l0IlI00000oIO;
                    }
/* 125 */           IOOlIIilOl0.I0001Ioi1lo(iooilIO1I, "interceptor ", " returned a response with no body");
/* 7 */             return null;
                }
            }

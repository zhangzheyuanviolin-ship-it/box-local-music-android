            package p000;

            import java.io.IOException;
            import java.lang.invoke.VarHandle;
            import java.util.Collections;
            import java.util.List;
            
            public final class O0IIio11 extends Io00OlOi0 {
                public static final O0IIio11 I00io1l;
                public static final O0II0llIl I00ioIO = new O0II0llIl(3);
                public IIOII1 I00iOIl;
                public List I00iiI;
                public List I00iiO;
                public int I00iio;
                public byte I00ilI0I1;
                public int I00ilO0;

                static {
/* 11 */            O0IIio11 o0IIio11 = new O0IIio11();
/* 15 */            o0IIio11.I00iio = -1;
/* 17 */            o0IIio11.I00ilI0I1 = (byte) -1;
/* 19 */            o0IIio11.I00ilO0 = -1;
/* 23 */            o0IIio11.I00iOIl = IIOII1.I00iOIl;
/* 25 */            VarHandle.storeStoreFence();
/* 28 */            I00io1l = o0IIio11;
/* 30 */            List list = Collections.EMPTY_LIST;
/* 32 */            o0IIio11.I00iiI = list;
/* 34 */            o0IIio11.I00iiO = list;
                }

                @Override
                public final boolean I00000oOI() {
/* 4 */             if (this.I00ilI0I1 == 1) {
/* 3 */                 return true;
                    }
/* 7 */             this.I00ilI0I1 = (byte) 1;
/* 3 */             return true;
                }

                @Override
                public final int I0000Il00O() {
                    List list;
/* 1 */             int i = this.I00ilO0;
/* 4 */             if (i != -1) {
/* 6 */                 return i;
                    }
/* 7 */             int i2 = 0;
/* 9 */             int iI000II = 0;
/* 16 */            for (int i3 = 0; i3 < this.I00iiI.size(); i3++) {
/* 31 */                iI000II += I1I1OO00o1o.I000II(1, (I01Ilioliio) this.I00iiI.get(i3));
                    }
/* 35 */            int iI0001Ioi1lo = 0;
                    while (true) {
/* 38 */                int size = this.I00iiO.size();
/* 42 */                list = this.I00iiO;
/* 44 */                if (i2 >= size) {
                            break;
                        }
/* 60 */                iI0001Ioi1lo += I1I1OO00o1o.I0001Ioi1lo(((Integer) list.get(i2)).intValue());
/* 61 */                i2++;
                    }
/* 64 */            int iI0001Ioi1lo2 = iI000II + iI0001Ioi1lo;
/* 69 */            if (!list.isEmpty()) {
/* 77 */                iI0001Ioi1lo2 = iI0001Ioi1lo2 + 1 + I1I1OO00o1o.I0001Ioi1lo(iI0001Ioi1lo);
                    }
/* 78 */            this.I00iio = iI0001Ioi1lo;
/* 86 */            int size2 = this.I00iOIl.size() + iI0001Ioi1lo2;
/* 87 */            this.I00ilO0 = size2;
/* 113 */           return size2;
                }

                @Override
                public final Ilooool1l0 I0000O() {
/* 3 */             O0IIi1lI o0IIi1lI = new O0IIi1lI();
/* 6 */             List list = Collections.EMPTY_LIST;
/* 8 */             o0IIi1lI.I00iiO = list;
/* 10 */            o0IIi1lI.I00iio = list;
/* 29 */            return o0IIi1lI;
                }

                @Override
                public final Ilooool1l0 I0000oI00() {
/* 3 */             O0IIi1lI o0IIi1lI = new O0IIi1lI();
/* 6 */             List list = Collections.EMPTY_LIST;
/* 8 */             o0IIi1lI.I00iiO = list;
/* 10 */            o0IIi1lI.I00iio = list;
/* 12 */            o0IIi1lI.I000II(this);
/* 29 */            return o0IIi1lI;
                }

                @Override
                public final void I0001Ioi1lo(I1I1OO00o1o i1I1OO00o1o) throws IOException {
/* 1 */             I0000Il00O();
/* 12 */            for (int i = 0; i < this.I00iiI.size(); i++) {
/* 23 */                i1I1OO00o1o.I00II0Ol1O0l(1, (I01Ilioliio) this.I00iiI.get(i));
                    }
/* 35 */            if (this.I00iiO.size() > 0) {
/* 39 */                i1I1OO00o1o.I00Io1lO(42);
/* 44 */                i1I1OO00o1o.I00Io1lO(this.I00iio);
                    }
/* 53 */            for (int i2 = 0; i2 < this.I00iiO.size(); i2++) {
/* 67 */                i1I1OO00o1o.I001lloI(((Integer) this.I00iiO.get(i2)).intValue());
                    }
/* 75 */            i1I1OO00o1o.I00IO1oi11O(this.I00iOIl);
                }
            }

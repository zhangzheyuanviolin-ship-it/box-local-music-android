            package p000;

            import java.io.IOException;
            import java.lang.invoke.VarHandle;
            
            public final class O0III0iooOOi extends Io00OlOi0 {
                public static final O0III0iooOOi I00io1l;
                public static final O0II0llIl I00ioIO = new O0II0llIl(1);
                public IIOII1 I00iOIl;
                public int I00iiI;
                public int I00iiO;
                public int I00iio;
                public byte I00ilI0I1;
                public int I00ilO0;

                static {
/* 11 */            O0III0iooOOi o0III0iooOOi = new O0III0iooOOi();
/* 15 */            o0III0iooOOi.I00ilI0I1 = (byte) -1;
/* 17 */            o0III0iooOOi.I00ilO0 = -1;
/* 21 */            o0III0iooOOi.I00iOIl = IIOII1.I00iOIl;
/* 23 */            VarHandle.storeStoreFence();
/* 26 */            I00io1l = o0III0iooOOi;
/* 29 */            o0III0iooOOi.I00iiO = 0;
/* 31 */            o0III0iooOOi.I00iio = 0;
                }

                public static O0II10 I000OOo1O(O0III0iooOOi o0III0iooOOi) {
/* 4 */             O0II10 o0ii10 = new O0II10(1);
/* 7 */             o0ii10.I000OOo1O(o0III0iooOOi);
/* 49 */            return o0ii10;
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
/* 1 */             int i = this.I00ilO0;
/* 4 */             if (i != -1) {
/* 6 */                 return i;
                    }
/* 20 */            int iI0000oI00 = (this.I00iiI & 1) == 1 ? I1I1OO00o1o.I0000oI00(1, this.I00iiO) : 0;
/* 25 */            if ((this.I00iiI & 2) == 2) {
/* 33 */                iI0000oI00 += I1I1OO00o1o.I0000oI00(2, this.I00iio);
                    }
/* 40 */            int size = this.I00iOIl.size() + iI0000oI00;
/* 41 */            this.I00ilO0 = size;
/* 113 */           return size;
                }

                @Override
                public final Ilooool1l0 I0000O() {
/* 4 */             return new O0II10(1);
                }

                @Override
                public final Ilooool1l0 I0000oI00() {
/* 1 */             return I000OOo1O(this);
                }

                @Override
                public final void I0001Ioi1lo(I1I1OO00o1o i1I1OO00o1o) throws IOException {
/* 1 */             I0000Il00O();
/* 8 */             if ((this.I00iiI & 1) == 1) {
/* 12 */                i1I1OO00o1o.I001lllioOl(1, this.I00iiO);
                    }
/* 19 */            if ((this.I00iiI & 2) == 2) {
/* 23 */                i1I1OO00o1o.I001lllioOl(2, this.I00iio);
                    }
/* 28 */            i1I1OO00o1o.I00IO1oi11O(this.I00iOIl);
                }
            }

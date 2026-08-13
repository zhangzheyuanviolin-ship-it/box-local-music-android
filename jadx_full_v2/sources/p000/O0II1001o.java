            package p000;

            import java.io.IOException;
            import java.lang.invoke.VarHandle;
            
            public final class O0II1001o extends Io00OlOi0 {
                public static final O0II1001o I00io1l;
                public static final O0II0llIl I00ioIO = new O0II0llIl(0);
                public IIOII1 I00iOIl;
                public int I00iiI;
                public int I00iiO;
                public int I00iio;
                public byte I00ilI0I1;
                public int I00ilO0;

                static {
/* 11 */            O0II1001o o0II1001o = new O0II1001o();
/* 15 */            o0II1001o.I00ilI0I1 = (byte) -1;
/* 17 */            o0II1001o.I00ilO0 = -1;
/* 21 */            o0II1001o.I00iOIl = IIOII1.I00iOIl;
/* 23 */            VarHandle.storeStoreFence();
/* 26 */            I00io1l = o0II1001o;
/* 28 */            o0II1001o.I00iiO = 0;
/* 30 */            o0II1001o.I00iio = 0;
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
/* 4 */             return new O0II10(0);
                }

                @Override
                public final Ilooool1l0 I0000oI00() {
/* 4 */             O0II10 o0ii10 = new O0II10(0);
/* 7 */             o0ii10.I000O01llI0(this);
/* 29 */            return o0ii10;
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

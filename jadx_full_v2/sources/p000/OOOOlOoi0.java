            package p000;

            import java.io.IOException;
            import java.lang.invoke.VarHandle;
            
            public final class OOOOlOoi0 extends Io00OlOi0 {
                public static final OOOOlOoi0 I00io1l;
                public static final O0II0llIl I00ioIO = new O0II0llIl(6);
                public IIOII1 I00iOIl;
                public int I00iiI;
                public int I00iiO;
                public OOOOlIoIlOi I00iio;
                public byte I00ilI0I1;
                public int I00ilO0;

                static {
/* 11 */            OOOOlOoi0 oOOOlOoi0 = new OOOOlOoi0();
/* 15 */            oOOOlOoi0.I00ilI0I1 = (byte) -1;
/* 17 */            oOOOlOoi0.I00ilO0 = -1;
/* 21 */            oOOOlOoi0.I00iOIl = IIOII1.I00iOIl;
/* 23 */            VarHandle.storeStoreFence();
/* 26 */            I00io1l = oOOOlOoi0;
/* 29 */            oOOOlOoi0.I00iiO = 0;
/* 33 */            oOOOlOoi0.I00iio = OOOOlIoIlOi.I00o0l1o1o0;
                }

                @Override
                public final boolean I00000oOI() {
/* 1 */             byte b = this.I00ilI0I1;
/* 4 */             if (b == 1) {
/* 3 */                 return true;
                    }
/* 8 */             if (b == 0) {
/* 7 */                 return false;
                    }
/* 11 */            int i = this.I00iiI;
/* 15 */            if ((i & 1) != 1) {
/* 38 */                this.I00ilI0I1 = (byte) 0;
/* 7 */                 return false;
                    }
/* 19 */            if ((i & 2) != 2) {
/* 35 */                this.I00ilI0I1 = (byte) 0;
/* 7 */                 return false;
                    }
/* 27 */            if (this.I00iio.I00000oOI()) {
/* 32 */                this.I00ilI0I1 = (byte) 1;
/* 3 */                 return true;
                    }
/* 29 */            this.I00ilI0I1 = (byte) 0;
/* 7 */             return false;
                }

                @Override
                public final int I0000Il00O() {
/* 1 */             int i = this.I00ilO0;
/* 4 */             if (i != -1) {
/* 6 */                 return i;
                    }
/* 20 */            int iI0000oI00 = (this.I00iiI & 1) == 1 ? I1I1OO00o1o.I0000oI00(1, this.I00iiO) : 0;
/* 25 */            if ((this.I00iiI & 2) == 2) {
/* 33 */                iI0000oI00 += I1I1OO00o1o.I000II(2, this.I00iio);
                    }
/* 40 */            int size = this.I00iOIl.size() + iI0000oI00;
/* 41 */            this.I00ilO0 = size;
/* 113 */           return size;
                }

                @Override
                public final Ilooool1l0 I0000O() {
/* 4 */             OOOOOlOO oOOOOlOO = new OOOOOlOO(0);
/* 9 */             oOOOOlOO.I00ilI0I1 = OOOOlIoIlOi.I00o0l1o1o0;
/* 29 */            return oOOOOlOO;
                }

                @Override
                public final Ilooool1l0 I0000oI00() {
/* 4 */             OOOOOlOO oOOOOlOO = new OOOOOlOO(0);
/* 9 */             oOOOOlOO.I00ilI0I1 = OOOOlIoIlOi.I00o0l1o1o0;
/* 11 */            oOOOOlOO.I000O01llI0(this);
/* 29 */            return oOOOOlOO;
                }

                @Override
                public final void I0001Ioi1lo(I1I1OO00o1o i1I1OO00o1o) throws IOException {
/* 1 */             I0000Il00O();
/* 8 */             if ((this.I00iiI & 1) == 1) {
/* 12 */                i1I1OO00o1o.I001lllioOl(1, this.I00iiO);
                    }
/* 19 */            if ((this.I00iiI & 2) == 2) {
/* 23 */                i1I1OO00o1o.I00II0Ol1O0l(2, this.I00iio);
                    }
/* 28 */            i1I1OO00o1o.I00IO1oi11O(this.I00iOIl);
                }
            }

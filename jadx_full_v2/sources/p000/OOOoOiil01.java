            package p000;

            import java.io.IOException;
            import java.lang.invoke.VarHandle;
            
            public final class OOOoOiil01 extends Io00OlOi0 {
                public static final OOOoOiil01 I00ioIO;
                public static final O0II0llIl I00l0I0l0lO1 = new O0II0llIl(20);
                public IIOII1 I00iOIl;
                public int I00iiI;
                public int I00iiO;
                public int I00iio;
                public OOOoI1io I00ilI0I1;
                public byte I00ilO0;
                public int I00io1l;

                static {
/* 12 */            OOOoOiil01 oOOoOiil01 = new OOOoOiil01();
/* 16 */            oOOoOiil01.I00ilO0 = (byte) -1;
/* 18 */            oOOoOiil01.I00io1l = -1;
/* 22 */            oOOoOiil01.I00iOIl = IIOII1.I00iOIl;
/* 24 */            VarHandle.storeStoreFence();
/* 27 */            I00ioIO = oOOoOiil01;
/* 29 */            oOOoOiil01.I00iiO = -1;
/* 32 */            oOOoOiil01.I00iio = 0;
/* 36 */            oOOoOiil01.I00ilI0I1 = OOOoI1io.PACKAGE;
                }

                @Override
                public final boolean I00000oOI() {
/* 1 */             byte b = this.I00ilO0;
/* 4 */             if (b == 1) {
/* 3 */                 return true;
                    }
/* 8 */             if (b == 0) {
/* 7 */                 return false;
                    }
/* 15 */            if ((this.I00iiI & 2) == 2) {
/* 17 */                this.I00ilO0 = (byte) 1;
/* 3 */                 return true;
                    }
/* 20 */            this.I00ilO0 = (byte) 0;
/* 7 */             return false;
                }

                @Override
                public final int I0000Il00O() {
/* 1 */             int i = this.I00io1l;
/* 4 */             if (i != -1) {
/* 6 */                 return i;
                    }
/* 20 */            int iI0000oI00 = (this.I00iiI & 1) == 1 ? I1I1OO00o1o.I0000oI00(1, this.I00iiO) : 0;
/* 25 */            if ((this.I00iiI & 2) == 2) {
/* 33 */                iI0000oI00 += I1I1OO00o1o.I0000oI00(2, this.I00iio);
                    }
/* 38 */            if ((this.I00iiI & 4) == 4) {
/* 49 */                iI0000oI00 += I1I1OO00o1o.I0000O(3, this.I00ilI0I1.I00iOIl);
                    }
/* 56 */            int size = this.I00iOIl.size() + iI0000oI00;
/* 57 */            this.I00io1l = size;
/* 113 */           return size;
                }

                @Override
                public final Ilooool1l0 I0000O() {
/* 3 */             OOOoI0IlO oOOoI0IlO = new OOOoI0IlO();
/* 7 */             oOOoI0IlO.I00iiO = -1;
/* 11 */            oOOoI0IlO.I00ilI0I1 = OOOoI1io.PACKAGE;
/* 29 */            return oOOoI0IlO;
                }

                @Override
                public final Ilooool1l0 I0000oI00() {
/* 3 */             OOOoI0IlO oOOoI0IlO = new OOOoI0IlO();
/* 7 */             oOOoI0IlO.I00iiO = -1;
/* 11 */            oOOoI0IlO.I00ilI0I1 = OOOoI1io.PACKAGE;
/* 13 */            oOOoI0IlO.I000II(this);
/* 29 */            return oOOoI0IlO;
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
/* 30 */            if ((this.I00iiI & 4) == 4) {
/* 37 */                i1I1OO00o1o.I001lIiIIo1O(3, this.I00ilI0I1.I00iOIl);
                    }
/* 42 */            i1I1OO00o1o.I00IO1oi11O(this.I00iOIl);
                }
            }

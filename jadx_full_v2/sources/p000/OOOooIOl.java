            package p000;

            import java.io.IOException;
            import java.lang.invoke.VarHandle;
            
            public final class OOOooIOl extends Io00OlOi0 {
                public static final OOOooIOl I00ioIO;
                public static final O0II0llIl I00l0I0l0lO1 = new O0II0llIl(23);
                public IIOII1 I00iOIl;
                public int I00iiI;
                public OOOoil1l010 I00iiO;
                public OOi001oo1OOI I00iio;
                public int I00ilI0I1;
                public byte I00ilO0;
                public int I00io1l;

                static {
/* 12 */            OOOooIOl oOOooIOl = new OOOooIOl();
/* 16 */            oOOooIOl.I00ilO0 = (byte) -1;
/* 18 */            oOOooIOl.I00io1l = -1;
/* 22 */            oOOooIOl.I00iOIl = IIOII1.I00iOIl;
/* 24 */            VarHandle.storeStoreFence();
/* 27 */            I00ioIO = oOOooIOl;
/* 31 */            oOOooIOl.I00iiO = OOOoil1l010.INV;
/* 35 */            oOOooIOl.I00iio = OOi001oo1OOI.I00oO101o;
/* 38 */            oOOooIOl.I00ilI0I1 = 0;
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
/* 15 */            if ((this.I00iiI & 2) != 2 || this.I00iio.I00000oOI()) {
/* 28 */                this.I00ilO0 = (byte) 1;
/* 3 */                 return true;
                    }
/* 25 */            this.I00ilO0 = (byte) 0;
/* 7 */             return false;
                }

                @Override
                public final int I0000Il00O() {
/* 1 */             int i = this.I00io1l;
/* 4 */             if (i != -1) {
/* 6 */                 return i;
                    }
/* 22 */            int iI0000O = (this.I00iiI & 1) == 1 ? I1I1OO00o1o.I0000O(1, this.I00iiO.I00iOIl) : 0;
/* 27 */            if ((this.I00iiI & 2) == 2) {
/* 35 */                iI0000O += I1I1OO00o1o.I000II(2, this.I00iio);
                    }
/* 40 */            if ((this.I00iiI & 4) == 4) {
/* 49 */                iI0000O += I1I1OO00o1o.I0000oI00(3, this.I00ilI0I1);
                    }
/* 56 */            int size = this.I00iOIl.size() + iI0000O;
/* 57 */            this.I00io1l = size;
/* 113 */           return size;
                }

                @Override
                public final Ilooool1l0 I0000O() {
/* 3 */             OOOoiOOolo1 oOOoiOOolo1 = new OOOoiOOolo1();
/* 8 */             oOOoiOOolo1.I00iiO = OOOoil1l010.INV;
/* 12 */            oOOoiOOolo1.I00iio = OOi001oo1OOI.I00oO101o;
/* 29 */            return oOOoiOOolo1;
                }

                @Override
                public final Ilooool1l0 I0000oI00() {
/* 3 */             OOOoiOOolo1 oOOoiOOolo1 = new OOOoiOOolo1();
/* 8 */             oOOoiOOolo1.I00iiO = OOOoil1l010.INV;
/* 12 */            oOOoiOOolo1.I00iio = OOi001oo1OOI.I00oO101o;
/* 14 */            oOOoiOOolo1.I000II(this);
/* 29 */            return oOOoiOOolo1;
                }

                @Override
                public final void I0001Ioi1lo(I1I1OO00o1o i1I1OO00o1o) throws IOException {
/* 1 */             I0000Il00O();
/* 8 */             if ((this.I00iiI & 1) == 1) {
/* 14 */                i1I1OO00o1o.I001lIiIIo1O(1, this.I00iiO.I00iOIl);
                    }
/* 21 */            if ((this.I00iiI & 2) == 2) {
/* 25 */                i1I1OO00o1o.I00II0Ol1O0l(2, this.I00iio);
                    }
/* 32 */            if ((this.I00iiI & 4) == 4) {
/* 37 */                i1I1OO00o1o.I001lllioOl(3, this.I00ilI0I1);
                    }
/* 42 */            i1I1OO00o1o.I00IO1oi11O(this.I00iOIl);
                }
            }

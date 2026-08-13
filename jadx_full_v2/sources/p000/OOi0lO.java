            package p000;

            import java.io.IOException;
            import java.lang.invoke.VarHandle;
            
            public final class OOi0lO extends Io00OlOi0 {
                public static final OOi0lO I00li1OI;
                public static final O0II0llIl I00ll1 = new O0II0llIl(28);
                public IIOII1 I00iOIl;
                public int I00iiI;
                public int I00iiO;
                public int I00iio;
                public OOi0l11Ioi I00ilI0I1;
                public int I00ilO0;
                public int I00io1l;
                public OOi0l1Oi I00ioIO;
                public byte I00l0I0l0lO1;
                public int I00l0OO0IO;

                static {
/* 12 */            OOi0lO oOi0lO = new OOi0lO();
/* 16 */            oOi0lO.I00l0I0l0lO1 = (byte) -1;
/* 18 */            oOi0lO.I00l0OO0IO = -1;
/* 22 */            oOi0lO.I00iOIl = IIOII1.I00iOIl;
/* 24 */            VarHandle.storeStoreFence();
/* 27 */            I00li1OI = oOi0lO;
/* 30 */            oOi0lO.I00iiO = 0;
/* 32 */            oOi0lO.I00iio = 0;
/* 36 */            oOi0lO.I00ilI0I1 = OOi0l11Ioi.ERROR;
/* 38 */            oOi0lO.I00ilO0 = 0;
/* 40 */            oOi0lO.I00io1l = 0;
/* 44 */            oOi0lO.I00ioIO = OOi0l1Oi.LANGUAGE_VERSION;
                }

                @Override
                public final boolean I00000oOI() {
/* 4 */             if (this.I00l0I0l0lO1 == 1) {
/* 3 */                 return true;
                    }
/* 7 */             this.I00l0I0l0lO1 = (byte) 1;
/* 3 */             return true;
                }

                @Override
                public final int I0000Il00O() {
/* 1 */             int i = this.I00l0OO0IO;
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
/* 55 */            if ((this.I00iiI & 8) == 8) {
/* 63 */                iI0000oI00 += I1I1OO00o1o.I0000oI00(4, this.I00ilO0);
                    }
/* 69 */            if ((this.I00iiI & 16) == 16) {
/* 78 */                iI0000oI00 += I1I1OO00o1o.I0000oI00(5, this.I00io1l);
                    }
/* 84 */            if ((this.I00iiI & 32) == 32) {
/* 95 */                iI0000oI00 += I1I1OO00o1o.I0000O(6, this.I00ioIO.I00iOIl);
                    }
/* 102 */           int size = this.I00iOIl.size() + iI0000oI00;
/* 103 */           this.I00l0OO0IO = size;
/* 113 */           return size;
                }

                @Override
                public final Ilooool1l0 I0000O() {
/* 3 */             OOi0io001 oOi0io001 = new OOi0io001();
/* 8 */             oOi0io001.I00ilI0I1 = OOi0l11Ioi.ERROR;
/* 12 */            oOi0io001.I00ioIO = OOi0l1Oi.LANGUAGE_VERSION;
/* 29 */            return oOi0io001;
                }

                @Override
                public final Ilooool1l0 I0000oI00() {
/* 3 */             OOi0io001 oOi0io001 = new OOi0io001();
/* 8 */             oOi0io001.I00ilI0I1 = OOi0l11Ioi.ERROR;
/* 12 */            oOi0io001.I00ioIO = OOi0l1Oi.LANGUAGE_VERSION;
/* 14 */            oOi0io001.I000II(this);
/* 29 */            return oOi0io001;
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
/* 45 */            if ((this.I00iiI & 8) == 8) {
/* 49 */                i1I1OO00o1o.I001lllioOl(4, this.I00ilO0);
                    }
/* 57 */            if ((this.I00iiI & 16) == 16) {
/* 62 */                i1I1OO00o1o.I001lllioOl(5, this.I00io1l);
                    }
/* 70 */            if ((this.I00iiI & 32) == 32) {
/* 77 */                i1I1OO00o1o.I001lIiIIo1O(6, this.I00ioIO.I00iOIl);
                    }
/* 82 */            i1I1OO00o1o.I00IO1oi11O(this.I00iOIl);
                }
            }

            package p000;

            import java.io.IOException;
            import java.lang.invoke.VarHandle;
            
            public final class OOOi1IIOOO01 extends Io00OlOi0 {
                public static final OOOi1IIOOO01 I00io1l;
                public static final O0II0llIl I00ioIO = new O0II0llIl(9);
                public IIOII1 I00iOIl;
                public int I00iiI;
                public int I00iiO;
                public O1101ooIo0l I00iio;
                public byte I00ilI0I1;
                public int I00ilO0;

                static {
/* 12 */            OOOi1IIOOO01 oOOi1IIOOO01 = new OOOi1IIOOO01();
/* 16 */            oOOi1IIOOO01.I00ilI0I1 = (byte) -1;
/* 18 */            oOOi1IIOOO01.I00ilO0 = -1;
/* 20 */            O1101ooIo0l o1101ooIo0l = IIOII1.I00iOIl;
/* 22 */            oOOi1IIOOO01.I00iOIl = o1101ooIo0l;
/* 24 */            VarHandle.storeStoreFence();
/* 27 */            I00io1l = oOOi1IIOOO01;
/* 30 */            oOOi1IIOOO01.I00iiO = 0;
/* 32 */            oOOi1IIOOO01.I00iio = o1101ooIo0l;
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
/* 27 */                this.I00ilI0I1 = (byte) 0;
/* 7 */                 return false;
                    }
/* 19 */            if ((i & 2) == 2) {
/* 21 */                this.I00ilI0I1 = (byte) 1;
/* 3 */                 return true;
                    }
/* 24 */            this.I00ilI0I1 = (byte) 0;
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
/* 27 */                O1101ooIo0l o1101ooIo0l = this.I00iio;
/* 47 */                iI0000oI00 += o1101ooIo0l.size() + I1I1OO00o1o.I000OOo1O(o1101ooIo0l.size()) + I1I1OO00o1o.I000iOII(2);
                    }
/* 54 */            int size = this.I00iOIl.size() + iI0000oI00;
/* 55 */            this.I00ilO0 = size;
/* 113 */           return size;
                }

                @Override
                public final Ilooool1l0 I0000O() {
/* 4 */             OOOOOlOO oOOOOlOO = new OOOOOlOO(1);
/* 9 */             oOOOOlOO.I00ilI0I1 = IIOII1.I00iOIl;
/* 29 */            return oOOOOlOO;
                }

                @Override
                public final Ilooool1l0 I0000oI00() {
/* 4 */             OOOOOlOO oOOOOlOO = new OOOOOlOO(1);
/* 9 */             oOOOOlOO.I00ilI0I1 = IIOII1.I00iOIl;
/* 11 */            oOOOOlOO.I000OOo1O(this);
/* 29 */            return oOOOOlOO;
                }

                @Override
                public final void I0001Ioi1lo(I1I1OO00o1o i1I1OO00o1o) throws IOException {
/* 1 */             I0000Il00O();
/* 8 */             if ((this.I00iiI & 1) == 1) {
/* 12 */                i1I1OO00o1o.I001lllioOl(1, this.I00iiO);
                    }
/* 19 */            if ((this.I00iiI & 2) == 2) {
/* 21 */                O1101ooIo0l o1101ooIo0l = this.I00iio;
/* 23 */                i1I1OO00o1o.I00IoIO0lI(2, 2);
/* 30 */                i1I1OO00o1o.I00Io1lO(o1101ooIo0l.size());
/* 33 */                i1I1OO00o1o.I00IO1oi11O(o1101ooIo0l);
                    }
/* 38 */            i1I1OO00o1o.I00IO1oi11O(this.I00iOIl);
                }
            }

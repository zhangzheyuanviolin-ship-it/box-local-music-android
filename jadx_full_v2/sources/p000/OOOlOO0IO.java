            package p000;

            import java.io.IOException;
            import java.lang.invoke.VarHandle;
            import java.util.Collections;
            import java.util.List;
            
            public final class OOOlOO0IO extends Io00OlOi0 {
                public static final OOOlOO0IO I00ll1;
                public static final O0II0llIl I00lli11 = new O0II0llIl(14);
                public IIOII1 I00iOIl;
                public int I00iiI;
                public int I00iiO;
                public int I00iio;
                public OOOl1oi I00ilI0I1;
                public OOi001oo1OOI I00ilO0;
                public int I00io1l;
                public List I00ioIO;
                public List I00l0I0l0lO1;
                public byte I00l0OO0IO;
                public int I00li1OI;

                static {
/* 12 */            OOOlOO0IO oOOlOO0IO = new OOOlOO0IO();
/* 16 */            oOOlOO0IO.I00l0OO0IO = (byte) -1;
/* 18 */            oOOlOO0IO.I00li1OI = -1;
/* 22 */            oOOlOO0IO.I00iOIl = IIOII1.I00iOIl;
/* 24 */            VarHandle.storeStoreFence();
/* 27 */            I00ll1 = oOOlOO0IO;
/* 30 */            oOOlOO0IO.I00iiO = 0;
/* 32 */            oOOlOO0IO.I00iio = 0;
/* 36 */            oOOlOO0IO.I00ilI0I1 = OOOl1oi.TRUE;
/* 40 */            oOOlOO0IO.I00ilO0 = OOi001oo1OOI.I00oO101o;
/* 42 */            oOOlOO0IO.I00io1l = 0;
/* 44 */            List list = Collections.EMPTY_LIST;
/* 46 */            oOOlOO0IO.I00ioIO = list;
/* 48 */            oOOlOO0IO.I00l0I0l0lO1 = list;
                }

                @Override
                public final boolean I00000oOI() {
/* 1 */             byte b = this.I00l0OO0IO;
/* 4 */             if (b == 1) {
/* 3 */                 return true;
                    }
/* 8 */             if (b == 0) {
/* 7 */                 return false;
                    }
/* 16 */            if ((this.I00iiI & 8) == 8 && !this.I00ilO0.I00000oOI()) {
/* 26 */                this.I00l0OO0IO = (byte) 0;
/* 7 */                 return false;
                    }
/* 36 */            for (int i = 0; i < this.I00ioIO.size(); i++) {
/* 50 */                if (!((OOOlOO0IO) this.I00ioIO.get(i)).I00000oOI()) {
/* 52 */                    this.I00l0OO0IO = (byte) 0;
/* 7 */                     return false;
                        }
                    }
/* 65 */            for (int i2 = 0; i2 < this.I00l0I0l0lO1.size(); i2++) {
/* 79 */                if (!((OOOlOO0IO) this.I00l0I0l0lO1.get(i2)).I00000oOI()) {
/* 81 */                    this.I00l0OO0IO = (byte) 0;
/* 7 */                     return false;
                        }
                    }
/* 87 */            this.I00l0OO0IO = (byte) 1;
/* 3 */             return true;
                }

                @Override
                public final int I0000Il00O() {
/* 1 */             int i = this.I00li1OI;
/* 4 */             if (i != -1) {
/* 6 */                 return i;
                    }
/* 21 */            int iI0000oI00 = (this.I00iiI & 1) == 1 ? I1I1OO00o1o.I0000oI00(1, this.I00iiO) : 0;
/* 26 */            if ((this.I00iiI & 2) == 2) {
/* 34 */                iI0000oI00 += I1I1OO00o1o.I0000oI00(2, this.I00iio);
                    }
/* 39 */            if ((this.I00iiI & 4) == 4) {
/* 50 */                iI0000oI00 += I1I1OO00o1o.I0000O(3, this.I00ilI0I1.I00iOIl);
                    }
/* 56 */            if ((this.I00iiI & 8) == 8) {
/* 64 */                iI0000oI00 += I1I1OO00o1o.I000II(4, this.I00ilO0);
                    }
/* 70 */            if ((this.I00iiI & 16) == 16) {
/* 79 */                iI0000oI00 += I1I1OO00o1o.I0000oI00(5, this.I00io1l);
                    }
/* 87 */            for (int i2 = 0; i2 < this.I00ioIO.size(); i2++) {
/* 102 */               iI0000oI00 += I1I1OO00o1o.I000II(6, (I01Ilioliio) this.I00ioIO.get(i2));
                    }
/* 112 */           for (int i3 = 0; i3 < this.I00l0I0l0lO1.size(); i3++) {
/* 127 */               iI0000oI00 += I1I1OO00o1o.I000II(7, (I01Ilioliio) this.I00l0I0l0lO1.get(i3));
                    }
/* 137 */           int size = this.I00iOIl.size() + iI0000oI00;
/* 138 */           this.I00li1OI = size;
/* 541 */           return size;
                }

                @Override
                public final Ilooool1l0 I0000O() {
/* 1 */             return OOOl0llOi.I000II();
                }

                @Override
                public final Ilooool1l0 I0000oI00() {
/* 1 */             OOOl0llOi oOOl0llOiI000II = OOOl0llOi.I000II();
/* 5 */             oOOl0llOiI000II.I000O01llI0(this);
/* 29 */            return oOOl0llOiI000II;
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
/* 49 */                i1I1OO00o1o.I00II0Ol1O0l(4, this.I00ilO0);
                    }
/* 57 */            if ((this.I00iiI & 16) == 16) {
/* 62 */                i1I1OO00o1o.I001lllioOl(5, this.I00io1l);
                    }
/* 73 */            for (int i = 0; i < this.I00ioIO.size(); i++) {
/* 84 */                i1I1OO00o1o.I00II0Ol1O0l(6, (I01Ilioliio) this.I00ioIO.get(i));
                    }
/* 96 */            for (int i2 = 0; i2 < this.I00l0I0l0lO1.size(); i2++) {
/* 107 */               i1I1OO00o1o.I00II0Ol1O0l(7, (I01Ilioliio) this.I00l0I0l0lO1.get(i2));
                    }
/* 115 */           i1I1OO00o1o.I00IO1oi11O(this.I00iOIl);
                }
            }

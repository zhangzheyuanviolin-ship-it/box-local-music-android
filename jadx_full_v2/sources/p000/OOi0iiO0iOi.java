            package p000;

            import java.io.IOException;
            import java.lang.invoke.VarHandle;
            import java.util.Collections;
            import java.util.List;
            
            public final class OOi0iiO0iOi extends Io000liOIo {
                public static final OOi0iiO0iOi I00lll10;
                public static final O0II0llIl I00o0iI0io1 = new O0II0llIl(27);
                public IIOII1 I00iiI;
                public int I00iiO;
                public int I00iio;
                public int I00ilI0I1;
                public OOi001oo1OOI I00ilO0;
                public int I00io1l;
                public OOi001oo1OOI I00ioIO;
                public int I00l0I0l0lO1;
                public List I00l0OO0IO;
                public OOOOlIoIlOi I00li1OI;
                public byte I00ll1;
                public int I00lli11;

                static {
/* 12 */            OOi0iiO0iOi oOi0iiO0iOi = new OOi0iiO0iOi();
/* 16 */            oOi0iiO0iOi.I00ll1 = (byte) -1;
/* 18 */            oOi0iiO0iOi.I00lli11 = -1;
/* 22 */            oOi0iiO0iOi.I00iiI = IIOII1.I00iOIl;
/* 24 */            VarHandle.storeStoreFence();
/* 27 */            I00lll10 = oOi0iiO0iOi;
/* 30 */            oOi0iiO0iOi.I00iio = 0;
/* 32 */            oOi0iiO0iOi.I00ilI0I1 = 0;
/* 34 */            OOi001oo1OOI oOi001oo1OOI = OOi001oo1OOI.I00oO101o;
/* 36 */            oOi0iiO0iOi.I00ilO0 = oOi001oo1OOI;
/* 38 */            oOi0iiO0iOi.I00io1l = 0;
/* 40 */            oOi0iiO0iOi.I00ioIO = oOi001oo1OOI;
/* 42 */            oOi0iiO0iOi.I00l0I0l0lO1 = 0;
/* 46 */            oOi0iiO0iOi.I00l0OO0IO = Collections.EMPTY_LIST;
/* 50 */            oOi0iiO0iOi.I00li1OI = OOOOlIoIlOi.I00o0l1o1o0;
                }

                @Override
                public final I01Ilioliio I00000oIO() {
/* 1 */             return I00lll10;
                }

                @Override
                public final boolean I00000oOI() {
/* 1 */             byte b = this.I00ll1;
/* 4 */             if (b == 1) {
/* 3 */                 return true;
                    }
/* 8 */             if (b == 0) {
/* 7 */                 return false;
                    }
/* 11 */            int i = this.I00iiO;
/* 16 */            if ((i & 2) != 2) {
/* 110 */               this.I00ll1 = (byte) 0;
/* 7 */                 return false;
                    }
/* 20 */            if ((i & 4) == 4 && !this.I00ilO0.I00000oOI()) {
/* 30 */                this.I00ll1 = (byte) 0;
/* 7 */                 return false;
                    }
/* 38 */            if ((this.I00iiO & 16) == 16 && !this.I00ioIO.I00000oOI()) {
/* 48 */                this.I00ll1 = (byte) 0;
/* 7 */                 return false;
                    }
/* 58 */            for (int i2 = 0; i2 < this.I00l0OO0IO.size(); i2++) {
/* 72 */                if (!((OOOi000ooO) this.I00l0OO0IO.get(i2)).I00000oOI()) {
/* 74 */                    this.I00ll1 = (byte) 0;
/* 7 */                     return false;
                        }
                    }
/* 85 */            if ((this.I00iiO & 64) == 64 && !this.I00li1OI.I00000oOI()) {
/* 95 */                this.I00ll1 = (byte) 0;
/* 7 */                 return false;
                    }
/* 102 */           if (I000OOo1O()) {
/* 107 */               this.I00ll1 = (byte) 1;
/* 3 */                 return true;
                    }
/* 104 */           this.I00ll1 = (byte) 0;
/* 7 */             return false;
                }

                @Override
                public final int I0000Il00O() {
/* 1 */             int i = this.I00lli11;
/* 4 */             if (i != -1) {
/* 6 */                 return i;
                    }
/* 21 */            int iI0000oI00 = (this.I00iiO & 1) == 1 ? I1I1OO00o1o.I0000oI00(1, this.I00iio) : 0;
/* 26 */            if ((this.I00iiO & 2) == 2) {
/* 34 */                iI0000oI00 += I1I1OO00o1o.I0000oI00(2, this.I00ilI0I1);
                    }
/* 39 */            if ((this.I00iiO & 4) == 4) {
/* 48 */                iI0000oI00 += I1I1OO00o1o.I000II(3, this.I00ilO0);
                    }
/* 54 */            if ((this.I00iiO & 16) == 16) {
/* 62 */                iI0000oI00 += I1I1OO00o1o.I000II(4, this.I00ioIO);
                    }
/* 68 */            if ((this.I00iiO & 8) == 8) {
/* 77 */                iI0000oI00 += I1I1OO00o1o.I0000oI00(5, this.I00io1l);
                    }
/* 83 */            if ((this.I00iiO & 32) == 32) {
/* 92 */                iI0000oI00 += I1I1OO00o1o.I0000oI00(6, this.I00l0I0l0lO1);
                    }
/* 99 */            for (int i2 = 0; i2 < this.I00l0OO0IO.size(); i2++) {
/* 114 */               iI0000oI00 += I1I1OO00o1o.I000II(7, (I01Ilioliio) this.I00l0OO0IO.get(i2));
                    }
/* 123 */           if ((this.I00iiO & 64) == 64) {
/* 131 */               iI0000oI00 += I1I1OO00o1o.I000II(8, this.I00li1OI);
                    }
/* 143 */           int size = this.I00iiI.size() + I000OiO() + iI0000oI00;
/* 144 */           this.I00lli11 = size;
/* 541 */           return size;
                }

                @Override
                public final Ilooool1l0 I0000O() {
/* 1 */             return OOi0i1i.I000O01llI0();
                }

                @Override
                public final Ilooool1l0 I0000oI00() {
/* 1 */             OOi0i1i oOi0i1iI000O01llI0 = OOi0i1i.I000O01llI0();
/* 5 */             oOi0i1iI000O01llI0.I000OOo1O(this);
/* 29 */            return oOi0i1iI000O01llI0;
                }

                @Override
                public final void I0001Ioi1lo(I1I1OO00o1o i1I1OO00o1o) throws IOException {
/* 1 */             I0000Il00O();
/* 4 */             OlOO1i11110 olOO1i11110I000o00OoI0I = I000o00OoI0I();
/* 12 */            if ((this.I00iiO & 1) == 1) {
/* 16 */                i1I1OO00o1o.I001lllioOl(1, this.I00iio);
                    }
/* 23 */            if ((this.I00iiO & 2) == 2) {
/* 27 */                i1I1OO00o1o.I001lllioOl(2, this.I00ilI0I1);
                    }
/* 34 */            if ((this.I00iiO & 4) == 4) {
/* 39 */                i1I1OO00o1o.I00II0Ol1O0l(3, this.I00ilO0);
                    }
/* 47 */            if ((this.I00iiO & 16) == 16) {
/* 51 */                i1I1OO00o1o.I00II0Ol1O0l(4, this.I00ioIO);
                    }
/* 59 */            if ((this.I00iiO & 8) == 8) {
/* 64 */                i1I1OO00o1o.I001lllioOl(5, this.I00io1l);
                    }
/* 72 */            if ((this.I00iiO & 32) == 32) {
/* 77 */                i1I1OO00o1o.I001lllioOl(6, this.I00l0I0l0lO1);
                    }
/* 87 */            for (int i = 0; i < this.I00l0OO0IO.size(); i++) {
/* 98 */                i1I1OO00o1o.I00II0Ol1O0l(7, (I01Ilioliio) this.I00l0OO0IO.get(i));
                    }
/* 109 */           if ((this.I00iiO & 64) == 64) {
/* 113 */               i1I1OO00o1o.I00II0Ol1O0l(8, this.I00li1OI);
                    }
/* 118 */           olOO1i11110I000o00OoI0I.I001iOo1i0O(200, i1I1OO00o1o);
/* 123 */           i1I1OO00o1o.I00IO1oi11O(this.I00iiI);
                }
            }

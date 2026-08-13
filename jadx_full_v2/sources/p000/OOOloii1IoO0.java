            package p000;

            import java.io.IOException;
            import java.lang.invoke.VarHandle;
            import java.util.Collections;
            import java.util.List;
            
            public final class OOOloii1IoO0 extends Io000liOIo {
                public static final OOOloii1IoO0 I00li1OI;
                public static final O0II0llIl I00ll1 = new O0II0llIl(16);
                public IIOII1 I00iiI;
                public int I00iiO;
                public List I00iio;
                public List I00ilI0I1;
                public List I00ilO0;
                public OOi0i0OO0lol I00io1l;
                public OOi0liO I00ioIO;
                public byte I00l0I0l0lO1;
                public int I00l0OO0IO;

                static {
/* 12 */            OOOloii1IoO0 oOOloii1IoO0 = new OOOloii1IoO0();
/* 16 */            oOOloii1IoO0.I00l0I0l0lO1 = (byte) -1;
/* 18 */            oOOloii1IoO0.I00l0OO0IO = -1;
/* 22 */            oOOloii1IoO0.I00iiI = IIOII1.I00iOIl;
/* 24 */            VarHandle.storeStoreFence();
/* 27 */            I00li1OI = oOOloii1IoO0;
/* 29 */            List list = Collections.EMPTY_LIST;
/* 31 */            oOOloii1IoO0.I00iio = list;
/* 33 */            oOOloii1IoO0.I00ilI0I1 = list;
/* 35 */            oOOloii1IoO0.I00ilO0 = list;
/* 39 */            oOOloii1IoO0.I00io1l = OOi0i0OO0lol.I00io1l;
/* 43 */            oOOloii1IoO0.I00ioIO = OOi0liO.I00ilI0I1;
                }

                @Override
                public final I01Ilioliio I00000oIO() {
/* 1 */             return I00li1OI;
                }

                @Override
                public final boolean I00000oOI() {
/* 1 */             byte b = this.I00l0I0l0lO1;
/* 4 */             if (b == 1) {
/* 3 */                 return true;
                    }
/* 8 */             if (b == 0) {
/* 7 */                 return false;
                    }
/* 18 */            for (int i = 0; i < this.I00iio.size(); i++) {
/* 32 */                if (!((OOOll1o0) this.I00iio.get(i)).I00000oOI()) {
/* 34 */                    this.I00l0I0l0lO1 = (byte) 0;
/* 7 */                     return false;
                        }
                    }
/* 47 */            for (int i2 = 0; i2 < this.I00ilI0I1.size(); i2++) {
/* 61 */                if (!((OOOo0i11Ol) this.I00ilI0I1.get(i2)).I00000oOI()) {
/* 63 */                    this.I00l0I0l0lO1 = (byte) 0;
/* 7 */                     return false;
                        }
                    }
/* 76 */            for (int i3 = 0; i3 < this.I00ilO0.size(); i3++) {
/* 90 */                if (!((OOi0IOIIOO) this.I00ilO0.get(i3)).I00000oOI()) {
/* 92 */                    this.I00l0I0l0lO1 = (byte) 0;
/* 7 */                     return false;
                        }
                    }
/* 101 */           if ((this.I00iiO & 1) == 1 && !this.I00io1l.I00000oOI()) {
/* 111 */               this.I00l0I0l0lO1 = (byte) 0;
/* 7 */                 return false;
                    }
/* 118 */           if (I000OOo1O()) {
/* 123 */               this.I00l0I0l0lO1 = (byte) 1;
/* 3 */                 return true;
                    }
/* 120 */           this.I00l0I0l0lO1 = (byte) 0;
/* 7 */             return false;
                }

                @Override
                public final int I0000Il00O() {
/* 1 */             int i = this.I00l0OO0IO;
/* 4 */             if (i != -1) {
/* 6 */                 return i;
                    }
/* 9 */             int iI000II = 0;
/* 16 */            for (int i2 = 0; i2 < this.I00iio.size(); i2++) {
/* 31 */                iI000II += I1I1OO00o1o.I000II(3, (I01Ilioliio) this.I00iio.get(i2));
                    }
/* 42 */            for (int i3 = 0; i3 < this.I00ilI0I1.size(); i3++) {
/* 57 */                iI000II += I1I1OO00o1o.I000II(4, (I01Ilioliio) this.I00ilI0I1.get(i3));
                    }
/* 67 */            for (int i4 = 0; i4 < this.I00ilO0.size(); i4++) {
/* 82 */                iI000II += I1I1OO00o1o.I000II(5, (I01Ilioliio) this.I00ilO0.get(i4));
                    }
/* 90 */            if ((this.I00iiO & 1) == 1) {
/* 100 */               iI000II += I1I1OO00o1o.I000II(30, this.I00io1l);
                    }
/* 105 */           if ((this.I00iiO & 2) == 2) {
/* 115 */               iI000II += I1I1OO00o1o.I000II(32, this.I00ioIO);
                    }
/* 127 */           int size = this.I00iiI.size() + I000OiO() + iI000II;
/* 128 */           this.I00l0OO0IO = size;
/* 541 */           return size;
                }

                @Override
                public final Ilooool1l0 I0000O() {
/* 1 */             return OOOlo0l.I000O01llI0();
                }

                @Override
                public final Ilooool1l0 I0000oI00() {
/* 1 */             OOOlo0l oOOlo0lI000O01llI0 = OOOlo0l.I000O01llI0();
/* 5 */             oOOlo0lI000O01llI0.I000OOo1O(this);
/* 29 */            return oOOlo0lI000O01llI0;
                }

                @Override
                public final void I0001Ioi1lo(I1I1OO00o1o i1I1OO00o1o) throws IOException {
/* 1 */             I0000Il00O();
/* 4 */             OlOO1i11110 olOO1i11110I000o00OoI0I = I000o00OoI0I();
/* 16 */            for (int i = 0; i < this.I00iio.size(); i++) {
/* 27 */                i1I1OO00o1o.I00II0Ol1O0l(3, (I01Ilioliio) this.I00iio.get(i));
                    }
/* 40 */            for (int i2 = 0; i2 < this.I00ilI0I1.size(); i2++) {
/* 51 */                i1I1OO00o1o.I00II0Ol1O0l(4, (I01Ilioliio) this.I00ilI0I1.get(i2));
                    }
/* 63 */            for (int i3 = 0; i3 < this.I00ilO0.size(); i3++) {
/* 74 */                i1I1OO00o1o.I00II0Ol1O0l(5, (I01Ilioliio) this.I00ilO0.get(i3));
                    }
/* 84 */            if ((this.I00iiO & 1) == 1) {
/* 90 */                i1I1OO00o1o.I00II0Ol1O0l(30, this.I00io1l);
                    }
/* 97 */            if ((this.I00iiO & 2) == 2) {
/* 103 */               i1I1OO00o1o.I00II0Ol1O0l(32, this.I00ioIO);
                    }
/* 108 */           olOO1i11110I000o00OoI0I.I001iOo1i0O(200, i1I1OO00o1o);
/* 113 */           i1I1OO00o1o.I00IO1oi11O(this.I00iiI);
                }
            }

            package p000;

            import java.io.IOException;
            import java.lang.invoke.VarHandle;
            import java.util.Collections;
            import java.util.List;
            
            public final class OOOloll11 extends Io000liOIo {
                public static final OOOloll11 I00l0OO0IO;
                public static final O0II0llIl I00li1OI = new O0II0llIl(17);
                public IIOII1 I00iiI;
                public int I00iiO;
                public OOOoiIli I00iio;
                public OOOoOl1 I00ilI0I1;
                public OOOloii1IoO0 I00ilO0;
                public List I00io1l;
                public byte I00ioIO;
                public int I00l0I0l0lO1;

                static {
/* 12 */            OOOloll11 oOOloll11 = new OOOloll11();
/* 16 */            oOOloll11.I00ioIO = (byte) -1;
/* 18 */            oOOloll11.I00l0I0l0lO1 = -1;
/* 22 */            oOOloll11.I00iiI = IIOII1.I00iOIl;
/* 24 */            VarHandle.storeStoreFence();
/* 27 */            I00l0OO0IO = oOOloll11;
/* 31 */            oOOloll11.I00iio = OOOoiIli.I00ilI0I1;
/* 35 */            oOOloll11.I00ilI0I1 = OOOoOl1.I00ilI0I1;
/* 39 */            oOOloll11.I00ilO0 = OOOloii1IoO0.I00li1OI;
/* 43 */            oOOloll11.I00io1l = Collections.EMPTY_LIST;
                }

                @Override
                public final I01Ilioliio I00000oIO() {
/* 1 */             return I00l0OO0IO;
                }

                @Override
                public final boolean I00000oOI() {
/* 1 */             byte b = this.I00ioIO;
/* 4 */             if (b == 1) {
/* 3 */                 return true;
                    }
/* 8 */             if (b == 0) {
/* 7 */                 return false;
                    }
/* 15 */            if ((this.I00iiO & 2) == 2 && !this.I00ilI0I1.I00000oOI()) {
/* 25 */                this.I00ioIO = (byte) 0;
/* 7 */                 return false;
                    }
/* 32 */            if ((this.I00iiO & 4) == 4 && !this.I00ilO0.I00000oOI()) {
/* 42 */                this.I00ioIO = (byte) 0;
/* 7 */                 return false;
                    }
/* 52 */            for (int i = 0; i < this.I00io1l.size(); i++) {
/* 66 */                if (!((OOOi0i1IOo) this.I00io1l.get(i)).I00000oOI()) {
/* 68 */                    this.I00ioIO = (byte) 0;
/* 7 */                     return false;
                        }
                    }
/* 78 */            if (I000OOo1O()) {
/* 83 */                this.I00ioIO = (byte) 1;
/* 3 */                 return true;
                    }
/* 80 */            this.I00ioIO = (byte) 0;
/* 7 */             return false;
                }

                @Override
                public final int I0000Il00O() {
/* 1 */             int i = this.I00l0I0l0lO1;
/* 4 */             if (i != -1) {
/* 6 */                 return i;
                    }
/* 21 */            int iI000II = (this.I00iiO & 1) == 1 ? I1I1OO00o1o.I000II(1, this.I00iio) : 0;
/* 26 */            if ((this.I00iiO & 2) == 2) {
/* 34 */                iI000II += I1I1OO00o1o.I000II(2, this.I00ilI0I1);
                    }
/* 39 */            if ((this.I00iiO & 4) == 4) {
/* 48 */                iI000II += I1I1OO00o1o.I000II(3, this.I00ilO0);
                    }
/* 55 */            for (int i2 = 0; i2 < this.I00io1l.size(); i2++) {
/* 69 */                iI000II += I1I1OO00o1o.I000II(4, (I01Ilioliio) this.I00io1l.get(i2));
                    }
/* 84 */            int size = this.I00iiI.size() + I000OiO() + iI000II;
/* 85 */            this.I00l0I0l0lO1 = size;
/* 113 */           return size;
                }

                @Override
                public final Ilooool1l0 I0000O() {
/* 1 */             return OOOlolOl11I.I000O01llI0();
                }

                @Override
                public final Ilooool1l0 I0000oI00() {
/* 1 */             OOOlolOl11I oOOlolOl11II000O01llI0 = OOOlolOl11I.I000O01llI0();
/* 5 */             oOOlolOl11II000O01llI0.I000OOo1O(this);
/* 29 */            return oOOlolOl11II000O01llI0;
                }

                @Override
                public final void I0001Ioi1lo(I1I1OO00o1o i1I1OO00o1o) throws IOException {
/* 1 */             I0000Il00O();
/* 4 */             OlOO1i11110 olOO1i11110I000o00OoI0I = I000o00OoI0I();
/* 12 */            if ((this.I00iiO & 1) == 1) {
/* 16 */                i1I1OO00o1o.I00II0Ol1O0l(1, this.I00iio);
                    }
/* 23 */            if ((this.I00iiO & 2) == 2) {
/* 27 */                i1I1OO00o1o.I00II0Ol1O0l(2, this.I00ilI0I1);
                    }
/* 34 */            if ((this.I00iiO & 4) == 4) {
/* 39 */                i1I1OO00o1o.I00II0Ol1O0l(3, this.I00ilO0);
                    }
/* 49 */            for (int i = 0; i < this.I00io1l.size(); i++) {
/* 59 */                i1I1OO00o1o.I00II0Ol1O0l(4, (I01Ilioliio) this.I00io1l.get(i));
                    }
/* 67 */            olOO1i11110I000o00OoI0I.I001iOo1i0O(200, i1I1OO00o1o);
/* 72 */            i1I1OO00o1o.I00IO1oi11O(this.I00iiI);
                }
            }

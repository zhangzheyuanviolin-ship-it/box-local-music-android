            package p000;

            import java.io.IOException;
            import java.lang.invoke.VarHandle;
            import java.util.Collections;
            import java.util.List;
            
            public final class OOOl0lIlIoil extends Io000liOIo {
                public static final OOOl0lIlIoil I00ioIO;
                public static final O0II0llIl I00l0I0l0lO1 = new O0II0llIl(13);
                public IIOII1 I00iiI;
                public int I00iiO;
                public int I00iio;
                public List I00ilI0I1;
                public byte I00ilO0;
                public int I00io1l;

                static {
/* 12 */            OOOl0lIlIoil oOOl0lIlIoil = new OOOl0lIlIoil();
/* 16 */            oOOl0lIlIoil.I00ilO0 = (byte) -1;
/* 18 */            oOOl0lIlIoil.I00io1l = -1;
/* 22 */            oOOl0lIlIoil.I00iiI = IIOII1.I00iOIl;
/* 24 */            VarHandle.storeStoreFence();
/* 27 */            I00ioIO = oOOl0lIlIoil;
/* 30 */            oOOl0lIlIoil.I00iio = 0;
/* 34 */            oOOl0lIlIoil.I00ilI0I1 = Collections.EMPTY_LIST;
                }

                @Override
                public final I01Ilioliio I00000oIO() {
/* 1 */             return I00ioIO;
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
/* 18 */            for (int i = 0; i < this.I00ilI0I1.size(); i++) {
/* 32 */                if (!((OOOi000ooO) this.I00ilI0I1.get(i)).I00000oOI()) {
/* 34 */                    this.I00ilO0 = (byte) 0;
/* 7 */                     return false;
                        }
                    }
/* 44 */            if (I000OOo1O()) {
/* 49 */                this.I00ilO0 = (byte) 1;
/* 3 */                 return true;
                    }
/* 46 */            this.I00ilO0 = (byte) 0;
/* 7 */             return false;
                }

                @Override
                public final int I0000Il00O() {
/* 1 */             int i = this.I00io1l;
/* 4 */             if (i != -1) {
/* 6 */                 return i;
                    }
/* 21 */            int iI0000oI00 = (this.I00iiO & 1) == 1 ? I1I1OO00o1o.I0000oI00(1, this.I00iio) : 0;
/* 28 */            for (int i2 = 0; i2 < this.I00ilI0I1.size(); i2++) {
/* 43 */                iI0000oI00 += I1I1OO00o1o.I000II(2, (I01Ilioliio) this.I00ilI0I1.get(i2));
                    }
/* 58 */            int size = this.I00iiI.size() + I000OiO() + iI0000oI00;
/* 59 */            this.I00io1l = size;
/* 113 */           return size;
                }

                @Override
                public final Ilooool1l0 I0000O() {
/* 3 */             OOOl000lO1Il oOOl000lO1Il = new OOOl000lO1Il();
/* 8 */             oOOl000lO1Il.I00ilO0 = Collections.EMPTY_LIST;
/* 29 */            return oOOl000lO1Il;
                }

                @Override
                public final Ilooool1l0 I0000oI00() {
/* 3 */             OOOl000lO1Il oOOl000lO1Il = new OOOl000lO1Il();
/* 8 */             oOOl000lO1Il.I00ilO0 = Collections.EMPTY_LIST;
/* 10 */            oOOl000lO1Il.I000O01llI0(this);
/* 29 */            return oOOl000lO1Il;
                }

                @Override
                public final void I0001Ioi1lo(I1I1OO00o1o i1I1OO00o1o) throws IOException {
/* 1 */             I0000Il00O();
/* 4 */             OlOO1i11110 olOO1i11110I000o00OoI0I = I000o00OoI0I();
/* 12 */            if ((this.I00iiO & 1) == 1) {
/* 16 */                i1I1OO00o1o.I001lllioOl(1, this.I00iio);
                    }
/* 26 */            for (int i = 0; i < this.I00ilI0I1.size(); i++) {
/* 37 */                i1I1OO00o1o.I00II0Ol1O0l(2, (I01Ilioliio) this.I00ilI0I1.get(i));
                    }
/* 45 */            olOO1i11110I000o00OoI0I.I001iOo1i0O(200, i1I1OO00o1o);
/* 50 */            i1I1OO00o1o.I00IO1oi11O(this.I00iiI);
                }
            }

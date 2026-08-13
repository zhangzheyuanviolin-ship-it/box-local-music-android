            package p000;

            import java.io.IOException;
            import java.lang.invoke.VarHandle;
            import java.util.Collections;
            import java.util.List;
            
            public final class OOOiIOiii extends Io000liOIo {
                public static final OOOiIOiii I00li1OI;
                public static final O0II0llIl I00ll1 = new O0II0llIl(10);
                public IIOII1 I00iiI;
                public int I00iiO;
                public int I00iio;
                public List I00ilI0I1;
                public List I00ilO0;
                public List I00io1l;
                public List I00ioIO;
                public byte I00l0I0l0lO1;
                public int I00l0OO0IO;

                static {
/* 12 */            OOOiIOiii oOOiIOiii = new OOOiIOiii();
/* 16 */            oOOiIOiii.I00l0I0l0lO1 = (byte) -1;
/* 18 */            oOOiIOiii.I00l0OO0IO = -1;
/* 22 */            oOOiIOiii.I00iiI = IIOII1.I00iOIl;
/* 24 */            VarHandle.storeStoreFence();
/* 27 */            I00li1OI = oOOiIOiii;
/* 30 */            oOOiIOiii.I00iio = 6;
/* 32 */            List list = Collections.EMPTY_LIST;
/* 34 */            oOOiIOiii.I00ilI0I1 = list;
/* 36 */            oOOiIOiii.I00ilO0 = list;
/* 38 */            oOOiIOiii.I00io1l = list;
/* 40 */            oOOiIOiii.I00ioIO = list;
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
/* 18 */            for (int i = 0; i < this.I00ilI0I1.size(); i++) {
/* 32 */                if (!((OOi0iiO0iOi) this.I00ilI0I1.get(i)).I00000oOI()) {
/* 34 */                    this.I00l0I0l0lO1 = (byte) 0;
/* 7 */                     return false;
                        }
                    }
/* 47 */            for (int i2 = 0; i2 < this.I00io1l.size(); i2++) {
/* 61 */                if (!((OOOi1IIOOO01) this.I00io1l.get(i2)).I00000oOI()) {
/* 63 */                    this.I00l0I0l0lO1 = (byte) 0;
/* 7 */                     return false;
                        }
                    }
/* 76 */            for (int i3 = 0; i3 < this.I00ioIO.size(); i3++) {
/* 90 */                if (!((OOOi000ooO) this.I00ioIO.get(i3)).I00000oOI()) {
/* 92 */                    this.I00l0I0l0lO1 = (byte) 0;
/* 7 */                     return false;
                        }
                    }
/* 102 */           if (I000OOo1O()) {
/* 107 */               this.I00l0I0l0lO1 = (byte) 1;
/* 3 */                 return true;
                    }
/* 104 */           this.I00l0I0l0lO1 = (byte) 0;
/* 7 */             return false;
                }

                @Override
                public final int I0000Il00O() {
                    List list;
/* 1 */             int i = this.I00l0OO0IO;
/* 4 */             if (i != -1) {
/* 6 */                 return i;
                    }
/* 21 */            int iI0000oI00 = (this.I00iiO & 1) == 1 ? I1I1OO00o1o.I0000oI00(1, this.I00iio) : 0;
/* 30 */            for (int i2 = 0; i2 < this.I00ilI0I1.size(); i2++) {
/* 44 */                iI0000oI00 += I1I1OO00o1o.I000II(2, (I01Ilioliio) this.I00ilI0I1.get(i2));
                    }
/* 55 */            for (int i3 = 0; i3 < this.I00ioIO.size(); i3++) {
/* 70 */                iI0000oI00 += I1I1OO00o1o.I000II(3, (I01Ilioliio) this.I00ioIO.get(i3));
                    }
/* 74 */            int i4 = 0;
/* 75 */            int iI0001Ioi1lo = 0;
                    while (true) {
/* 78 */                int size = this.I00ilO0.size();
/* 82 */                list = this.I00ilO0;
/* 84 */                if (i4 >= size) {
                            break;
                        }
/* 100 */               iI0001Ioi1lo += I1I1OO00o1o.I0001Ioi1lo(((Integer) list.get(i4)).intValue());
/* 101 */               i4++;
                    }
/* 110 */           int size2 = (list.size() * 2) + iI0000oI00 + iI0001Ioi1lo;
/* 117 */           for (int i5 = 0; i5 < this.I00io1l.size(); i5++) {
/* 133 */               size2 += I1I1OO00o1o.I000II(32, (I01Ilioliio) this.I00io1l.get(i5));
                    }
/* 148 */           int size3 = this.I00iiI.size() + I000OiO() + size2;
/* 149 */           this.I00l0OO0IO = size3;
/* 541 */           return size3;
                }

                @Override
                public final Ilooool1l0 I0000O() {
/* 1 */             return OOOiII.I000O01llI0();
                }

                @Override
                public final Ilooool1l0 I0000oI00() {
/* 1 */             OOOiII oOOiIII000O01llI0 = OOOiII.I000O01llI0();
/* 5 */             oOOiIII000O01llI0.I000OOo1O(this);
/* 29 */            return oOOiIII000O01llI0;
                }

                @Override
                public final void I0001Ioi1lo(I1I1OO00o1o i1I1OO00o1o) throws IOException {
/* 1 */             I0000Il00O();
/* 4 */             OlOO1i11110 olOO1i11110I000o00OoI0I = I000o00OoI0I();
/* 12 */            if ((this.I00iiO & 1) == 1) {
/* 16 */                i1I1OO00o1o.I001lllioOl(1, this.I00iio);
                    }
/* 27 */            for (int i = 0; i < this.I00ilI0I1.size(); i++) {
/* 38 */                i1I1OO00o1o.I00II0Ol1O0l(2, (I01Ilioliio) this.I00ilI0I1.get(i));
                    }
/* 51 */            for (int i2 = 0; i2 < this.I00ioIO.size(); i2++) {
/* 62 */                i1I1OO00o1o.I00II0Ol1O0l(3, (I01Ilioliio) this.I00ioIO.get(i2));
                    }
/* 75 */            for (int i3 = 0; i3 < this.I00ilO0.size(); i3++) {
/* 91 */                i1I1OO00o1o.I001lllioOl(31, ((Integer) this.I00ilO0.get(i3)).intValue());
                    }
/* 103 */           for (int i4 = 0; i4 < this.I00io1l.size(); i4++) {
/* 115 */               i1I1OO00o1o.I00II0Ol1O0l(32, (I01Ilioliio) this.I00io1l.get(i4));
                    }
/* 123 */           olOO1i11110I000o00OoI0I.I001iOo1i0O(19000, i1I1OO00o1o);
/* 128 */           i1I1OO00o1o.I00IO1oi11O(this.I00iiI);
                }
            }

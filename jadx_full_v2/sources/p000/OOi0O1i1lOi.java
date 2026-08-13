            package p000;

            import java.io.IOException;
            import java.lang.invoke.VarHandle;
            import java.util.Collections;
            import java.util.List;
            
            public final class OOi0O1i1lOi extends Io000liOIo {
                public static final OOi0O1i1lOi I00lll10;
                public static final O0II0llIl I00o0iI0io1 = new O0II0llIl(25);
                public IIOII1 I00iiI;
                public int I00iiO;
                public int I00iio;
                public int I00ilI0I1;
                public boolean I00ilO0;
                public OOi0Illolii I00io1l;
                public List I00ioIO;
                public List I00l0I0l0lO1;
                public int I00l0OO0IO;
                public List I00li1OI;
                public byte I00ll1;
                public int I00lli11;

                static {
/* 12 */            OOi0O1i1lOi oOi0O1i1lOi = new OOi0O1i1lOi();
/* 16 */            oOi0O1i1lOi.I00l0OO0IO = -1;
/* 18 */            oOi0O1i1lOi.I00ll1 = (byte) -1;
/* 20 */            oOi0O1i1lOi.I00lli11 = -1;
/* 24 */            oOi0O1i1lOi.I00iiI = IIOII1.I00iOIl;
/* 26 */            VarHandle.storeStoreFence();
/* 29 */            I00lll10 = oOi0O1i1lOi;
/* 32 */            oOi0O1i1lOi.I00iio = 0;
/* 34 */            oOi0O1i1lOi.I00ilI0I1 = 0;
/* 36 */            oOi0O1i1lOi.I00ilO0 = false;
/* 40 */            oOi0O1i1lOi.I00io1l = OOi0Illolii.INV;
/* 42 */            List list = Collections.EMPTY_LIST;
/* 44 */            oOi0O1i1lOi.I00ioIO = list;
/* 46 */            oOi0O1i1lOi.I00l0I0l0lO1 = list;
/* 48 */            oOi0O1i1lOi.I00li1OI = list;
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
/* 15 */            if ((i & 1) != 1) {
/* 94 */                this.I00ll1 = (byte) 0;
/* 7 */                 return false;
                    }
/* 19 */            if ((i & 2) != 2) {
/* 91 */                this.I00ll1 = (byte) 0;
/* 7 */                 return false;
                    }
/* 28 */            for (int i2 = 0; i2 < this.I00ioIO.size(); i2++) {
/* 42 */                if (!((OOi001oo1OOI) this.I00ioIO.get(i2)).I00000oOI()) {
/* 44 */                    this.I00ll1 = (byte) 0;
/* 7 */                     return false;
                        }
                    }
/* 57 */            for (int i3 = 0; i3 < this.I00li1OI.size(); i3++) {
/* 71 */                if (!((OOOi000ooO) this.I00li1OI.get(i3)).I00000oOI()) {
/* 73 */                    this.I00ll1 = (byte) 0;
/* 7 */                     return false;
                        }
                    }
/* 83 */            if (I000OOo1O()) {
/* 88 */                this.I00ll1 = (byte) 1;
/* 3 */                 return true;
                    }
/* 85 */            this.I00ll1 = (byte) 0;
/* 7 */             return false;
                }

                @Override
                public final int I0000Il00O() {
                    List list;
/* 1 */             int i = this.I00lli11;
/* 4 */             if (i != -1) {
/* 6 */                 return i;
                    }
/* 21 */            int iI0000oI00 = (this.I00iiO & 1) == 1 ? I1I1OO00o1o.I0000oI00(1, this.I00iio) : 0;
/* 26 */            if ((this.I00iiO & 2) == 2) {
/* 34 */                iI0000oI00 += I1I1OO00o1o.I0000oI00(2, this.I00ilI0I1);
                    }
/* 39 */            if ((this.I00iiO & 4) == 4) {
/* 47 */                iI0000oI00 += I1I1OO00o1o.I000iOII(3) + 1;
                    }
/* 53 */            if ((this.I00iiO & 8) == 8) {
/* 63 */                iI0000oI00 += I1I1OO00o1o.I0000O(4, this.I00io1l.I00iOIl);
                    }
/* 71 */            for (int i2 = 0; i2 < this.I00ioIO.size(); i2++) {
/* 86 */                iI0000oI00 += I1I1OO00o1o.I000II(5, (I01Ilioliio) this.I00ioIO.get(i2));
                    }
/* 90 */            int i3 = 0;
/* 91 */            int iI0001Ioi1lo = 0;
                    while (true) {
/* 94 */                int size = this.I00l0I0l0lO1.size();
/* 98 */                list = this.I00l0I0l0lO1;
/* 100 */               if (i3 >= size) {
                            break;
                        }
/* 116 */               iI0001Ioi1lo += I1I1OO00o1o.I0001Ioi1lo(((Integer) list.get(i3)).intValue());
/* 117 */               i3++;
                    }
/* 120 */           int iI000II = iI0000oI00 + iI0001Ioi1lo;
/* 125 */           if (!list.isEmpty()) {
/* 133 */               iI000II = iI000II + 1 + I1I1OO00o1o.I0001Ioi1lo(iI0001Ioi1lo);
                    }
/* 134 */           this.I00l0OO0IO = iI0001Ioi1lo;
/* 142 */           for (int i4 = 0; i4 < this.I00li1OI.size(); i4++) {
/* 158 */               iI000II += I1I1OO00o1o.I000II(100, (I01Ilioliio) this.I00li1OI.get(i4));
                    }
/* 173 */           int size2 = this.I00iiI.size() + I000OiO() + iI000II;
/* 174 */           this.I00lli11 = size2;
/* 541 */           return size2;
                }

                @Override
                public final Ilooool1l0 I0000O() {
/* 1 */             return OOi0IlOIIO.I000O01llI0();
                }

                @Override
                public final Ilooool1l0 I0000oI00() {
/* 1 */             OOi0IlOIIO oOi0IlOIIOI000O01llI0 = OOi0IlOIIO.I000O01llI0();
/* 5 */             oOi0IlOIIOI000O01llI0.I000OOo1O(this);
/* 29 */            return oOi0IlOIIOI000O01llI0;
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
/* 35 */            if ((this.I00iiO & 4) == 4) {
/* 37 */                boolean z = this.I00ilO0;
/* 40 */                i1I1OO00o1o.I00IoIO0lI(3, 0);
/* 43 */                i1I1OO00o1o.I00IO1(z ? 1 : 0);
                    }
/* 51 */            if ((this.I00iiO & 8) == 8) {
/* 57 */                i1I1OO00o1o.I001lIiIIo1O(4, this.I00io1l.I00iOIl);
                    }
/* 67 */            for (int i = 0; i < this.I00ioIO.size(); i++) {
/* 78 */                i1I1OO00o1o.I00II0Ol1O0l(5, (I01Ilioliio) this.I00ioIO.get(i));
                    }
/* 90 */            if (this.I00l0I0l0lO1.size() > 0) {
/* 94 */                i1I1OO00o1o.I00Io1lO(50);
/* 99 */                i1I1OO00o1o.I00Io1lO(this.I00l0OO0IO);
                    }
/* 109 */           for (int i2 = 0; i2 < this.I00l0I0l0lO1.size(); i2++) {
/* 123 */               i1I1OO00o1o.I001lloI(((Integer) this.I00l0I0l0lO1.get(i2)).intValue());
                    }
/* 135 */           for (int i3 = 0; i3 < this.I00li1OI.size(); i3++) {
/* 147 */               i1I1OO00o1o.I00II0Ol1O0l(100, (I01Ilioliio) this.I00li1OI.get(i3));
                    }
/* 155 */           olOO1i11110I000o00OoI0I.I001iOo1i0O(1000, i1I1OO00o1o);
/* 160 */           i1I1OO00o1o.I00IO1oi11O(this.I00iiI);
                }
            }

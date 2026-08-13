            package p000;

            import java.io.IOException;
            import java.lang.invoke.VarHandle;
            import java.util.Collections;
            import java.util.List;
            
            public final class OOi0IOIIOO extends Io000liOIo {
                public static final OOi0IOIIOO I00o0l1o1o0;
                public static final O0II0llIl I00o101lO = new O0II0llIl(24);
                public IIOII1 I00iiI;
                public int I00iiO;
                public int I00iio;
                public int I00ilI0I1;
                public List I00ilO0;
                public OOi001oo1OOI I00io1l;
                public int I00ioIO;
                public OOi001oo1OOI I00l0I0l0lO1;
                public int I00l0OO0IO;
                public List I00li1OI;
                public List I00ll1;
                public List I00lli11;
                public byte I00lll10;
                public int I00o0iI0io1;

                static {
/* 12 */            OOi0IOIIOO oOi0IOIIOO = new OOi0IOIIOO();
/* 16 */            oOi0IOIIOO.I00lll10 = (byte) -1;
/* 18 */            oOi0IOIIOO.I00o0iI0io1 = -1;
/* 22 */            oOi0IOIIOO.I00iiI = IIOII1.I00iOIl;
/* 24 */            VarHandle.storeStoreFence();
/* 27 */            I00o0l1o1o0 = oOi0IOIIOO;
/* 30 */            oOi0IOIIOO.I00iio = 6;
/* 33 */            oOi0IOIIOO.I00ilI0I1 = 0;
/* 35 */            List list = Collections.EMPTY_LIST;
/* 37 */            oOi0IOIIOO.I00ilO0 = list;
/* 39 */            OOi001oo1OOI oOi001oo1OOI = OOi001oo1OOI.I00oO101o;
/* 41 */            oOi0IOIIOO.I00io1l = oOi001oo1OOI;
/* 43 */            oOi0IOIIOO.I00ioIO = 0;
/* 45 */            oOi0IOIIOO.I00l0I0l0lO1 = oOi001oo1OOI;
/* 47 */            oOi0IOIIOO.I00l0OO0IO = 0;
/* 49 */            oOi0IOIIOO.I00li1OI = list;
/* 51 */            oOi0IOIIOO.I00ll1 = list;
/* 53 */            oOi0IOIIOO.I00lli11 = list;
                }

                @Override
                public final I01Ilioliio I00000oIO() {
/* 1 */             return I00o0l1o1o0;
                }

                @Override
                public final boolean I00000oOI() {
/* 1 */             byte b = this.I00lll10;
/* 4 */             if (b == 1) {
/* 3 */                 return true;
                    }
/* 8 */             if (b == 0) {
/* 7 */                 return false;
                    }
/* 15 */            if ((this.I00iiO & 2) != 2) {
/* 151 */               this.I00lll10 = (byte) 0;
/* 7 */                 return false;
                    }
/* 24 */            for (int i = 0; i < this.I00ilO0.size(); i++) {
/* 38 */                if (!((OOi0O1i1lOi) this.I00ilO0.get(i)).I00000oOI()) {
/* 40 */                    this.I00lll10 = (byte) 0;
/* 7 */                     return false;
                        }
                    }
/* 50 */            if ((this.I00iiO & 4) == 4 && !this.I00io1l.I00000oOI()) {
/* 60 */                this.I00lll10 = (byte) 0;
/* 7 */                 return false;
                    }
/* 68 */            if ((this.I00iiO & 16) == 16 && !this.I00l0I0l0lO1.I00000oOI()) {
/* 78 */                this.I00lll10 = (byte) 0;
/* 7 */                 return false;
                    }
/* 88 */            for (int i2 = 0; i2 < this.I00li1OI.size(); i2++) {
/* 102 */               if (!((OOOi000ooO) this.I00li1OI.get(i2)).I00000oOI()) {
/* 104 */                   this.I00lll10 = (byte) 0;
/* 7 */                     return false;
                        }
                    }
/* 117 */           for (int i3 = 0; i3 < this.I00lli11.size(); i3++) {
/* 131 */               if (!((OOOi1IIOOO01) this.I00lli11.get(i3)).I00000oOI()) {
/* 133 */                   this.I00lll10 = (byte) 0;
/* 7 */                     return false;
                        }
                    }
/* 143 */           if (I000OOo1O()) {
/* 148 */               this.I00lll10 = (byte) 1;
/* 3 */                 return true;
                    }
/* 145 */           this.I00lll10 = (byte) 0;
/* 7 */             return false;
                }

                @Override
                public final int I0000Il00O() {
                    List list;
/* 1 */             int i = this.I00o0iI0io1;
/* 4 */             if (i != -1) {
/* 6 */                 return i;
                    }
/* 21 */            int iI0000oI00 = (this.I00iiO & 1) == 1 ? I1I1OO00o1o.I0000oI00(1, this.I00iio) : 0;
/* 26 */            if ((this.I00iiO & 2) == 2) {
/* 34 */                iI0000oI00 += I1I1OO00o1o.I0000oI00(2, this.I00ilI0I1);
                    }
/* 42 */            for (int i2 = 0; i2 < this.I00ilO0.size(); i2++) {
/* 57 */                iI0000oI00 += I1I1OO00o1o.I000II(3, (I01Ilioliio) this.I00ilO0.get(i2));
                    }
/* 65 */            if ((this.I00iiO & 4) == 4) {
/* 73 */                iI0000oI00 += I1I1OO00o1o.I000II(4, this.I00io1l);
                    }
/* 79 */            if ((this.I00iiO & 8) == 8) {
/* 88 */                iI0000oI00 += I1I1OO00o1o.I0000oI00(5, this.I00ioIO);
                    }
/* 94 */            if ((this.I00iiO & 16) == 16) {
/* 103 */               iI0000oI00 += I1I1OO00o1o.I000II(6, this.I00l0I0l0lO1);
                    }
/* 109 */           if ((this.I00iiO & 32) == 32) {
/* 118 */               iI0000oI00 += I1I1OO00o1o.I0000oI00(7, this.I00l0OO0IO);
                    }
/* 126 */           for (int i3 = 0; i3 < this.I00li1OI.size(); i3++) {
/* 140 */               iI0000oI00 += I1I1OO00o1o.I000II(8, (I01Ilioliio) this.I00li1OI.get(i3));
                    }
/* 144 */           int i4 = 0;
/* 145 */           int iI0001Ioi1lo = 0;
                    while (true) {
/* 148 */               int size = this.I00ll1.size();
/* 152 */               list = this.I00ll1;
/* 154 */               if (i4 >= size) {
                            break;
                        }
/* 170 */               iI0001Ioi1lo += I1I1OO00o1o.I0001Ioi1lo(((Integer) list.get(i4)).intValue());
/* 171 */               i4++;
                    }
/* 180 */           int size2 = (list.size() * 2) + iI0000oI00 + iI0001Ioi1lo;
/* 187 */           for (int i5 = 0; i5 < this.I00lli11.size(); i5++) {
/* 201 */               size2 += I1I1OO00o1o.I000II(32, (I01Ilioliio) this.I00lli11.get(i5));
                    }
/* 216 */           int size3 = this.I00iiI.size() + I000OiO() + size2;
/* 217 */           this.I00o0iI0io1 = size3;
/* 541 */           return size3;
                }

                @Override
                public final Ilooool1l0 I0000O() {
/* 1 */             return OOi00iIO.I000O01llI0();
                }

                @Override
                public final Ilooool1l0 I0000oI00() {
/* 1 */             OOi00iIO oOi00iIOI000O01llI0 = OOi00iIO.I000O01llI0();
/* 5 */             oOi00iIOI000O01llI0.I000OOo1O(this);
/* 29 */            return oOi00iIOI000O01llI0;
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
/* 38 */            for (int i = 0; i < this.I00ilO0.size(); i++) {
/* 49 */                i1I1OO00o1o.I00II0Ol1O0l(3, (I01Ilioliio) this.I00ilO0.get(i));
                    }
/* 59 */            if ((this.I00iiO & 4) == 4) {
/* 63 */                i1I1OO00o1o.I00II0Ol1O0l(4, this.I00io1l);
                    }
/* 71 */            if ((this.I00iiO & 8) == 8) {
/* 76 */                i1I1OO00o1o.I001lllioOl(5, this.I00ioIO);
                    }
/* 84 */            if ((this.I00iiO & 16) == 16) {
/* 89 */                i1I1OO00o1o.I00II0Ol1O0l(6, this.I00l0I0l0lO1);
                    }
/* 97 */            if ((this.I00iiO & 32) == 32) {
/* 102 */               i1I1OO00o1o.I001lllioOl(7, this.I00l0OO0IO);
                    }
/* 112 */           for (int i2 = 0; i2 < this.I00li1OI.size(); i2++) {
/* 122 */               i1I1OO00o1o.I00II0Ol1O0l(8, (I01Ilioliio) this.I00li1OI.get(i2));
                    }
/* 135 */           for (int i3 = 0; i3 < this.I00ll1.size(); i3++) {
/* 151 */               i1I1OO00o1o.I001lllioOl(31, ((Integer) this.I00ll1.get(i3)).intValue());
                    }
/* 163 */           for (int i4 = 0; i4 < this.I00lli11.size(); i4++) {
/* 173 */               i1I1OO00o1o.I00II0Ol1O0l(32, (I01Ilioliio) this.I00lli11.get(i4));
                    }
/* 181 */           olOO1i11110I000o00OoI0I.I001iOo1i0O(200, i1I1OO00o1o);
/* 186 */           i1I1OO00o1o.I00IO1oi11O(this.I00iiI);
                }
            }

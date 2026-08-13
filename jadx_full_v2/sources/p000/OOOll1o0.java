            package p000;

            import com.google.mlkit.vision.barcode.common.Barcode;
            import java.io.IOException;
            import java.lang.invoke.VarHandle;
            import java.util.Collections;
            import java.util.List;
            
            public final class OOOll1o0 extends Io000liOIo {
                public static final OOOll1o0 I00oli;
                public static final O0II0llIl I00oliIiO01i = new O0II0llIl(15);
                public IIOII1 I00iiI;
                public int I00iiO;
                public int I00iio;
                public int I00ilI0I1;
                public int I00ilO0;
                public OOi001oo1OOI I00io1l;
                public int I00ioIO;
                public List I00l0I0l0lO1;
                public OOi001oo1OOI I00l0OO0IO;
                public int I00li1OI;
                public List I00ll1;
                public List I00lli11;
                public int I00lll10;
                public List I00o0iI0io1;
                public List I00o0l1o1o0;
                public OOi0i0OO0lol I00o101lO;
                public List I00oI0i;
                public OOOilI I00oII;
                public List I00oIiI10;
                public List I00oO101o;
                public List I00oOio10iI1;
                public byte I00ol1;
                public int I00olI;

                static {
/* 12 */            OOOll1o0 oOOll1o0 = new OOOll1o0();
/* 16 */            oOOll1o0.I00lll10 = -1;
/* 18 */            oOOll1o0.I00ol1 = (byte) -1;
/* 20 */            oOOll1o0.I00olI = -1;
/* 24 */            oOOll1o0.I00iiI = IIOII1.I00iOIl;
/* 26 */            VarHandle.storeStoreFence();
/* 29 */            I00oli = oOOll1o0;
/* 31 */            oOOll1o0.I00100o1O0lo();
                }

                @Override
                public final I01Ilioliio I00000oIO() {
/* 1 */             return I00oli;
                }

                @Override
                public final boolean I00000oOI() {
/* 1 */             byte b = this.I00ol1;
/* 4 */             if (b == 1) {
/* 3 */                 return true;
                    }
/* 8 */             if (b == 0) {
/* 7 */                 return false;
                    }
/* 11 */            int i = this.I00iiO;
/* 16 */            if ((i & 4) != 4) {
/* 303 */               this.I00ol1 = (byte) 0;
/* 7 */                 return false;
                    }
/* 21 */            if ((i & 8) == 8 && !this.I00io1l.I00000oOI()) {
/* 31 */                this.I00ol1 = (byte) 0;
/* 7 */                 return false;
                    }
/* 41 */            for (int i2 = 0; i2 < this.I00l0I0l0lO1.size(); i2++) {
/* 55 */                if (!((OOi0O1i1lOi) this.I00l0I0l0lO1.get(i2)).I00000oOI()) {
/* 57 */                    this.I00ol1 = (byte) 0;
/* 7 */                     return false;
                        }
                    }
/* 68 */            if ((this.I00iiO & 32) == 32 && !this.I00l0OO0IO.I00000oOI()) {
/* 78 */                this.I00ol1 = (byte) 0;
/* 7 */                 return false;
                    }
/* 88 */            for (int i3 = 0; i3 < this.I00ll1.size(); i3++) {
/* 102 */               if (!((OOi001oo1OOI) this.I00ll1.get(i3)).I00000oOI()) {
/* 104 */                   this.I00ol1 = (byte) 0;
/* 7 */                     return false;
                        }
                    }
/* 117 */           for (int i4 = 0; i4 < this.I00o0iI0io1.size(); i4++) {
/* 131 */               if (!((OOi0iiO0iOi) this.I00o0iI0io1.get(i4)).I00000oOI()) {
/* 133 */                   this.I00ol1 = (byte) 0;
/* 7 */                     return false;
                        }
                    }
/* 146 */           for (int i5 = 0; i5 < this.I00o0l1o1o0.size(); i5++) {
/* 160 */               if (!((OOi0iiO0iOi) this.I00o0l1o1o0.get(i5)).I00000oOI()) {
/* 162 */                   this.I00ol1 = (byte) 0;
/* 7 */                     return false;
                        }
                    }
/* 173 */           if ((this.I00iiO & Barcode.FORMAT_ITF) == 128 && !this.I00o101lO.I00000oOI()) {
/* 183 */               this.I00ol1 = (byte) 0;
/* 7 */                 return false;
                    }
/* 191 */           if ((this.I00iiO & Barcode.FORMAT_QR_CODE) == 256 && !this.I00oII.I00000oOI()) {
/* 201 */               this.I00ol1 = (byte) 0;
/* 7 */                 return false;
                    }
/* 211 */           for (int i6 = 0; i6 < this.I00oIiI10.size(); i6++) {
/* 225 */               if (!((OOOi1IIOOO01) this.I00oIiI10.get(i6)).I00000oOI()) {
/* 227 */                   this.I00ol1 = (byte) 0;
/* 7 */                     return false;
                        }
                    }
/* 240 */           for (int i7 = 0; i7 < this.I00oO101o.size(); i7++) {
/* 254 */               if (!((OOOi000ooO) this.I00oO101o.get(i7)).I00000oOI()) {
/* 256 */                   this.I00ol1 = (byte) 0;
/* 7 */                     return false;
                        }
                    }
/* 269 */           for (int i8 = 0; i8 < this.I00oOio10iI1.size(); i8++) {
/* 283 */               if (!((OOOi000ooO) this.I00oOio10iI1.get(i8)).I00000oOI()) {
/* 285 */                   this.I00ol1 = (byte) 0;
/* 7 */                     return false;
                        }
                    }
/* 295 */           if (I000OOo1O()) {
/* 300 */               this.I00ol1 = (byte) 1;
/* 3 */                 return true;
                    }
/* 297 */           this.I00ol1 = (byte) 0;
/* 7 */             return false;
                }

                @Override
                public final int I0000Il00O() {
                    List list;
                    List list2;
/* 1 */             int i = this.I00olI;
/* 4 */             if (i != -1) {
/* 6 */                 return i;
                    }
/* 22 */            int iI0000oI00 = (this.I00iiO & 2) == 2 ? I1I1OO00o1o.I0000oI00(1, this.I00ilI0I1) : 0;
/* 27 */            if ((this.I00iiO & 4) == 4) {
/* 35 */                iI0000oI00 += I1I1OO00o1o.I0000oI00(2, this.I00ilO0);
                    }
/* 41 */            if ((this.I00iiO & 8) == 8) {
/* 50 */                iI0000oI00 += I1I1OO00o1o.I000II(3, this.I00io1l);
                    }
/* 58 */            for (int i2 = 0; i2 < this.I00l0I0l0lO1.size(); i2++) {
/* 72 */                iI0000oI00 += I1I1OO00o1o.I000II(4, (I01Ilioliio) this.I00l0I0l0lO1.get(i2));
                    }
/* 81 */            if ((this.I00iiO & 32) == 32) {
/* 90 */                iI0000oI00 += I1I1OO00o1o.I000II(5, this.I00l0OO0IO);
                    }
/* 98 */            for (int i3 = 0; i3 < this.I00o0l1o1o0.size(); i3++) {
/* 113 */               iI0000oI00 += I1I1OO00o1o.I000II(6, (I01Ilioliio) this.I00o0l1o1o0.get(i3));
                    }
/* 122 */           if ((this.I00iiO & 16) == 16) {
/* 131 */               iI0000oI00 += I1I1OO00o1o.I0000oI00(7, this.I00ioIO);
                    }
/* 137 */           if ((this.I00iiO & 64) == 64) {
/* 145 */               iI0000oI00 += I1I1OO00o1o.I0000oI00(8, this.I00li1OI);
                    }
/* 149 */           if ((this.I00iiO & 1) == 1) {
/* 159 */               iI0000oI00 += I1I1OO00o1o.I0000oI00(9, this.I00iio);
                    }
/* 167 */           for (int i4 = 0; i4 < this.I00ll1.size(); i4++) {
/* 183 */               iI0000oI00 += I1I1OO00o1o.I000II(10, (I01Ilioliio) this.I00ll1.get(i4));
                    }
/* 187 */           int i5 = 0;
/* 188 */           int iI0001Ioi1lo = 0;
                    while (true) {
/* 191 */               int size = this.I00lli11.size();
/* 195 */               list = this.I00lli11;
/* 197 */               if (i5 >= size) {
                            break;
                        }
/* 213 */               iI0001Ioi1lo += I1I1OO00o1o.I0001Ioi1lo(((Integer) list.get(i5)).intValue());
/* 214 */               i5++;
                    }
/* 217 */           int iI000II = iI0000oI00 + iI0001Ioi1lo;
/* 222 */           if (!list.isEmpty()) {
/* 230 */               iI000II = iI000II + 1 + I1I1OO00o1o.I0001Ioi1lo(iI0001Ioi1lo);
                    }
/* 231 */           this.I00lll10 = iI0001Ioi1lo;
/* 240 */           for (int i6 = 0; i6 < this.I00oO101o.size(); i6++) {
/* 256 */               iI000II += I1I1OO00o1o.I000II(12, (I01Ilioliio) this.I00oO101o.get(i6));
                    }
/* 267 */           for (int i7 = 0; i7 < this.I00o0iI0io1.size(); i7++) {
/* 283 */               iI000II += I1I1OO00o1o.I000II(13, (I01Ilioliio) this.I00o0iI0io1.get(i7));
                    }
/* 292 */           if ((this.I00iiO & Barcode.FORMAT_ITF) == 128) {
/* 302 */               iI000II += I1I1OO00o1o.I000II(30, this.I00o101lO);
                    }
/* 303 */           int i8 = 0;
/* 304 */           int iI0001Ioi1lo2 = 0;
                    while (true) {
/* 307 */               int size2 = this.I00oI0i.size();
/* 311 */               list2 = this.I00oI0i;
/* 313 */               if (i8 >= size2) {
                            break;
                        }
/* 329 */               iI0001Ioi1lo2 += I1I1OO00o1o.I0001Ioi1lo(((Integer) list2.get(i8)).intValue());
/* 330 */               i8++;
                    }
/* 339 */           int size3 = (list2.size() * 2) + iI000II + iI0001Ioi1lo2;
/* 345 */           if ((this.I00iiO & Barcode.FORMAT_QR_CODE) == 256) {
/* 353 */               size3 += I1I1OO00o1o.I000II(32, this.I00oII);
                    }
/* 361 */           for (int i9 = 0; i9 < this.I00oIiI10.size(); i9++) {
/* 377 */               size3 += I1I1OO00o1o.I000II(33, (I01Ilioliio) this.I00oIiI10.get(i9));
                    }
/* 387 */           for (int i10 = 0; i10 < this.I00oOio10iI1.size(); i10++) {
/* 403 */               size3 += I1I1OO00o1o.I000II(34, (I01Ilioliio) this.I00oOio10iI1.get(i10));
                    }
/* 418 */           int size4 = this.I00iiI.size() + I000OiO() + size3;
/* 419 */           this.I00olI = size4;
/* 541 */           return size4;
                }

                @Override
                public final Ilooool1l0 I0000O() {
/* 1 */             return OOOll0o0oIoI.I000O01llI0();
                }

                @Override
                public final Ilooool1l0 I0000oI00() {
/* 1 */             OOOll0o0oIoI oOOll0o0oIoII000O01llI0 = OOOll0o0oIoI.I000O01llI0();
/* 5 */             oOOll0o0oIoII000O01llI0.I000OOo1O(this);
/* 29 */            return oOOll0o0oIoII000O01llI0;
                }

                @Override
                public final void I0001Ioi1lo(I1I1OO00o1o i1I1OO00o1o) throws IOException {
/* 1 */             I0000Il00O();
/* 4 */             OlOO1i11110 olOO1i11110I000o00OoI0I = I000o00OoI0I();
/* 13 */            if ((this.I00iiO & 2) == 2) {
/* 17 */                i1I1OO00o1o.I001lllioOl(1, this.I00ilI0I1);
                    }
/* 24 */            if ((this.I00iiO & 4) == 4) {
/* 28 */                i1I1OO00o1o.I001lllioOl(2, this.I00ilO0);
                    }
/* 36 */            if ((this.I00iiO & 8) == 8) {
/* 41 */                i1I1OO00o1o.I00II0Ol1O0l(3, this.I00io1l);
                    }
/* 52 */            for (int i = 0; i < this.I00l0I0l0lO1.size(); i++) {
/* 62 */                i1I1OO00o1o.I00II0Ol1O0l(4, (I01Ilioliio) this.I00l0I0l0lO1.get(i));
                    }
/* 73 */            if ((this.I00iiO & 32) == 32) {
/* 78 */                i1I1OO00o1o.I00II0Ol1O0l(5, this.I00l0OO0IO);
                    }
/* 88 */            for (int i2 = 0; i2 < this.I00o0l1o1o0.size(); i2++) {
/* 99 */                i1I1OO00o1o.I00II0Ol1O0l(6, (I01Ilioliio) this.I00o0l1o1o0.get(i2));
                    }
/* 110 */           if ((this.I00iiO & 16) == 16) {
/* 115 */               i1I1OO00o1o.I001lllioOl(7, this.I00ioIO);
                    }
/* 123 */           if ((this.I00iiO & 64) == 64) {
/* 127 */               i1I1OO00o1o.I001lllioOl(8, this.I00li1OI);
                    }
/* 133 */           if ((this.I00iiO & 1) == 1) {
/* 139 */               i1I1OO00o1o.I001lllioOl(9, this.I00iio);
                    }
/* 149 */           for (int i3 = 0; i3 < this.I00ll1.size(); i3++) {
/* 161 */               i1I1OO00o1o.I00II0Ol1O0l(10, (I01Ilioliio) this.I00ll1.get(i3));
                    }
/* 173 */           if (this.I00lli11.size() > 0) {
/* 177 */               i1I1OO00o1o.I00Io1lO(90);
/* 182 */               i1I1OO00o1o.I00Io1lO(this.I00lll10);
                    }
/* 192 */           for (int i4 = 0; i4 < this.I00lli11.size(); i4++) {
/* 206 */               i1I1OO00o1o.I001lloI(((Integer) this.I00lli11.get(i4)).intValue());
                    }
/* 219 */           for (int i5 = 0; i5 < this.I00oO101o.size(); i5++) {
/* 231 */               i1I1OO00o1o.I00II0Ol1O0l(12, (I01Ilioliio) this.I00oO101o.get(i5));
                    }
/* 244 */           for (int i6 = 0; i6 < this.I00o0iI0io1.size(); i6++) {
/* 256 */               i1I1OO00o1o.I00II0Ol1O0l(13, (I01Ilioliio) this.I00o0iI0io1.get(i6));
                    }
/* 267 */           if ((this.I00iiO & Barcode.FORMAT_ITF) == 128) {
/* 273 */               i1I1OO00o1o.I00II0Ol1O0l(30, this.I00o101lO);
                    }
/* 283 */           for (int i7 = 0; i7 < this.I00oI0i.size(); i7++) {
/* 299 */               i1I1OO00o1o.I001lllioOl(31, ((Integer) this.I00oI0i.get(i7)).intValue());
                    }
/* 310 */           if ((this.I00iiO & Barcode.FORMAT_QR_CODE) == 256) {
/* 314 */               i1I1OO00o1o.I00II0Ol1O0l(32, this.I00oII);
                    }
/* 324 */           for (int i8 = 0; i8 < this.I00oIiI10.size(); i8++) {
/* 336 */               i1I1OO00o1o.I00II0Ol1O0l(33, (I01Ilioliio) this.I00oIiI10.get(i8));
                    }
/* 348 */           for (int i9 = 0; i9 < this.I00oOio10iI1.size(); i9++) {
/* 360 */               i1I1OO00o1o.I00II0Ol1O0l(34, (I01Ilioliio) this.I00oOio10iI1.get(i9));
                    }
/* 368 */           olOO1i11110I000o00OoI0I.I001iOo1i0O(19000, i1I1OO00o1o);
/* 373 */           i1I1OO00o1o.I00IO1oi11O(this.I00iiI);
                }

                public final void I00100o1O0lo() {
/* 2 */             this.I00iio = 6;
/* 4 */             this.I00ilI0I1 = 6;
/* 7 */             this.I00ilO0 = 0;
/* 9 */             OOi001oo1OOI oOi001oo1OOI = OOi001oo1OOI.I00oO101o;
/* 11 */            this.I00io1l = oOi001oo1OOI;
/* 13 */            this.I00ioIO = 0;
/* 15 */            List list = Collections.EMPTY_LIST;
/* 17 */            this.I00l0I0l0lO1 = list;
/* 19 */            this.I00l0OO0IO = oOi001oo1OOI;
/* 21 */            this.I00li1OI = 0;
/* 23 */            this.I00ll1 = list;
/* 25 */            this.I00lli11 = list;
/* 27 */            this.I00o0iI0io1 = list;
/* 29 */            this.I00o0l1o1o0 = list;
/* 33 */            this.I00o101lO = OOi0i0OO0lol.I00io1l;
/* 35 */            this.I00oI0i = list;
/* 39 */            this.I00oII = OOOilI.I00ilI0I1;
/* 41 */            this.I00oIiI10 = list;
/* 43 */            this.I00oO101o = list;
/* 45 */            this.I00oOio10iI1 = list;
                }
            }

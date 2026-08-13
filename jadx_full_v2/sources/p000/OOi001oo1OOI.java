            package p000;

            import com.google.mlkit.vision.barcode.common.Barcode;
            import java.io.IOException;
            import java.lang.invoke.VarHandle;
            import java.util.Collections;
            import java.util.List;
            
            public final class OOi001oo1OOI extends Io000liOIo {
                public static final OOi001oo1OOI I00oO101o;
                public static final O0II0llIl I00oOio10iI1 = new O0II0llIl(22);
                public IIOII1 I00iiI;
                public int I00iiO;
                public List I00iio;
                public boolean I00ilI0I1;
                public int I00ilO0;
                public OOi001oo1OOI I00io1l;
                public int I00ioIO;
                public int I00l0I0l0lO1;
                public int I00l0OO0IO;
                public int I00li1OI;
                public int I00ll1;
                public OOi001oo1OOI I00lli11;
                public int I00lll10;
                public OOi001oo1OOI I00o0iI0io1;
                public int I00o0l1o1o0;
                public int I00o101lO;
                public List I00oI0i;
                public byte I00oII;
                public int I00oIiI10;

                static {
/* 12 */            OOi001oo1OOI oOi001oo1OOI = new OOi001oo1OOI();
/* 16 */            oOi001oo1OOI.I00oII = (byte) -1;
/* 18 */            oOi001oo1OOI.I00oIiI10 = -1;
/* 22 */            oOi001oo1OOI.I00iiI = IIOII1.I00iOIl;
/* 24 */            VarHandle.storeStoreFence();
/* 27 */            I00oO101o = oOi001oo1OOI;
/* 29 */            oOi001oo1OOI.I0010I0i();
                }

                public static OOOoooI I0010o(OOi001oo1OOI oOi001oo1OOI) {
/* 1 */             OOOoooI oOOoooII000O01llI0 = OOOoooI.I000O01llI0();
/* 5 */             oOOoooII000O01llI0.I000OOo1O(oOi001oo1OOI);
/* 49 */            return oOOoooII000O01llI0;
                }

                @Override
                public final I01Ilioliio I00000oIO() {
/* 1 */             return I00oO101o;
                }

                @Override
                public final boolean I00000oOI() {
/* 1 */             byte b = this.I00oII;
/* 4 */             if (b == 1) {
/* 3 */                 return true;
                    }
/* 8 */             if (b == 0) {
/* 7 */                 return false;
                    }
/* 18 */            for (int i = 0; i < this.I00iio.size(); i++) {
/* 32 */                if (!((OOOooIOl) this.I00iio.get(i)).I00000oOI()) {
/* 34 */                    this.I00oII = (byte) 0;
/* 7 */                     return false;
                        }
                    }
/* 44 */            if ((this.I00iiO & 4) == 4 && !this.I00io1l.I00000oOI()) {
/* 54 */                this.I00oII = (byte) 0;
/* 7 */                 return false;
                    }
/* 62 */            if ((this.I00iiO & Barcode.FORMAT_QR_CODE) == 256 && !this.I00lli11.I00000oOI()) {
/* 72 */                this.I00oII = (byte) 0;
/* 7 */                 return false;
                    }
/* 80 */            if ((this.I00iiO & Barcode.FORMAT_UPC_E) == 1024 && !this.I00o0iI0io1.I00000oOI()) {
/* 90 */                this.I00oII = (byte) 0;
/* 7 */                 return false;
                    }
/* 100 */           for (int i2 = 0; i2 < this.I00oI0i.size(); i2++) {
/* 114 */               if (!((OOOi000ooO) this.I00oI0i.get(i2)).I00000oOI()) {
/* 116 */                   this.I00oII = (byte) 0;
/* 7 */                     return false;
                        }
                    }
/* 126 */           if (I000OOo1O()) {
/* 131 */               this.I00oII = (byte) 1;
/* 3 */                 return true;
                    }
/* 128 */           this.I00oII = (byte) 0;
/* 7 */             return false;
                }

                @Override
                public final int I0000Il00O() {
/* 1 */             int i = this.I00oIiI10;
/* 4 */             if (i != -1) {
/* 6 */                 return i;
                    }
/* 23 */            int iI0000oI00 = (this.I00iiO & Barcode.FORMAT_AZTEC) == 4096 ? I1I1OO00o1o.I0000oI00(1, this.I00o101lO) : 0;
/* 32 */            for (int i2 = 0; i2 < this.I00iio.size(); i2++) {
/* 46 */                iI0000oI00 += I1I1OO00o1o.I000II(2, (I01Ilioliio) this.I00iio.get(i2));
                    }
/* 53 */            if ((this.I00iiO & 1) == 1) {
/* 61 */                iI0000oI00 += I1I1OO00o1o.I000iOII(3) + 1;
                    }
/* 66 */            if ((this.I00iiO & 2) == 2) {
/* 74 */                iI0000oI00 += I1I1OO00o1o.I0000oI00(4, this.I00ilO0);
                    }
/* 78 */            if ((this.I00iiO & 4) == 4) {
/* 87 */                iI0000oI00 += I1I1OO00o1o.I000II(5, this.I00io1l);
                    }
/* 93 */            if ((this.I00iiO & 16) == 16) {
/* 102 */               iI0000oI00 += I1I1OO00o1o.I0000oI00(6, this.I00l0I0l0lO1);
                    }
/* 108 */           if ((this.I00iiO & 32) == 32) {
/* 117 */               iI0000oI00 += I1I1OO00o1o.I0000oI00(7, this.I00l0OO0IO);
                    }
/* 123 */           if ((this.I00iiO & 8) == 8) {
/* 131 */               iI0000oI00 += I1I1OO00o1o.I0000oI00(8, this.I00ioIO);
                    }
/* 137 */           if ((this.I00iiO & 64) == 64) {
/* 147 */               iI0000oI00 += I1I1OO00o1o.I0000oI00(9, this.I00li1OI);
                    }
/* 153 */           if ((this.I00iiO & Barcode.FORMAT_QR_CODE) == 256) {
/* 163 */               iI0000oI00 += I1I1OO00o1o.I000II(10, this.I00lli11);
                    }
/* 169 */           if ((this.I00iiO & Barcode.FORMAT_UPC_A) == 512) {
/* 179 */               iI0000oI00 += I1I1OO00o1o.I0000oI00(11, this.I00lll10);
                    }
/* 185 */           if ((this.I00iiO & Barcode.FORMAT_ITF) == 128) {
/* 195 */               iI0000oI00 += I1I1OO00o1o.I0000oI00(12, this.I00ll1);
                    }
/* 201 */           if ((this.I00iiO & Barcode.FORMAT_UPC_E) == 1024) {
/* 211 */               iI0000oI00 += I1I1OO00o1o.I000II(13, this.I00o0iI0io1);
                    }
/* 217 */           if ((this.I00iiO & Barcode.FORMAT_PDF417) == 2048) {
/* 227 */               iI0000oI00 += I1I1OO00o1o.I0000oI00(14, this.I00o0l1o1o0);
                    }
/* 234 */           for (int i3 = 0; i3 < this.I00oI0i.size(); i3++) {
/* 250 */               iI0000oI00 += I1I1OO00o1o.I000II(100, (I01Ilioliio) this.I00oI0i.get(i3));
                    }
/* 265 */           int size = this.I00iiI.size() + I000OiO() + iI0000oI00;
/* 266 */           this.I00oIiI10 = size;
/* 541 */           return size;
                }

                @Override
                public final Ilooool1l0 I0000O() {
/* 1 */             return OOOoooI.I000O01llI0();
                }

                @Override
                public final Ilooool1l0 I0000oI00() {
/* 1 */             return I0010o(this);
                }

                @Override
                public final void I0001Ioi1lo(I1I1OO00o1o i1I1OO00o1o) throws IOException {
/* 1 */             I0000Il00O();
/* 4 */             OlOO1i11110 olOO1i11110I000o00OoI0I = I000o00OoI0I();
/* 14 */            if ((this.I00iiO & Barcode.FORMAT_AZTEC) == 4096) {
/* 18 */                i1I1OO00o1o.I001lllioOl(1, this.I00o101lO);
                    }
/* 30 */            for (int i = 0; i < this.I00iio.size(); i++) {
/* 40 */                i1I1OO00o1o.I00II0Ol1O0l(2, (I01Ilioliio) this.I00iio.get(i));
                    }
/* 49 */            if ((this.I00iiO & 1) == 1) {
/* 51 */                boolean z = this.I00ilI0I1;
/* 54 */                i1I1OO00o1o.I00IoIO0lI(3, 0);
/* 57 */                i1I1OO00o1o.I00IO1(z ? 1 : 0);
                    }
/* 64 */            if ((this.I00iiO & 2) == 2) {
/* 68 */                i1I1OO00o1o.I001lllioOl(4, this.I00ilO0);
                    }
/* 74 */            if ((this.I00iiO & 4) == 4) {
/* 79 */                i1I1OO00o1o.I00II0Ol1O0l(5, this.I00io1l);
                    }
/* 87 */            if ((this.I00iiO & 16) == 16) {
/* 92 */                i1I1OO00o1o.I001lllioOl(6, this.I00l0I0l0lO1);
                    }
/* 100 */           if ((this.I00iiO & 32) == 32) {
/* 105 */               i1I1OO00o1o.I001lllioOl(7, this.I00l0OO0IO);
                    }
/* 113 */           if ((this.I00iiO & 8) == 8) {
/* 117 */               i1I1OO00o1o.I001lllioOl(8, this.I00ioIO);
                    }
/* 125 */           if ((this.I00iiO & 64) == 64) {
/* 131 */               i1I1OO00o1o.I001lllioOl(9, this.I00li1OI);
                    }
/* 139 */           if ((this.I00iiO & Barcode.FORMAT_QR_CODE) == 256) {
/* 145 */               i1I1OO00o1o.I00II0Ol1O0l(10, this.I00lli11);
                    }
/* 153 */           if ((this.I00iiO & Barcode.FORMAT_UPC_A) == 512) {
/* 159 */               i1I1OO00o1o.I001lllioOl(11, this.I00lll10);
                    }
/* 167 */           if ((this.I00iiO & Barcode.FORMAT_ITF) == 128) {
/* 173 */               i1I1OO00o1o.I001lllioOl(12, this.I00ll1);
                    }
/* 181 */           if ((this.I00iiO & Barcode.FORMAT_UPC_E) == 1024) {
/* 187 */               i1I1OO00o1o.I00II0Ol1O0l(13, this.I00o0iI0io1);
                    }
/* 195 */           if ((this.I00iiO & Barcode.FORMAT_PDF417) == 2048) {
/* 201 */               i1I1OO00o1o.I001lllioOl(14, this.I00o0l1o1o0);
                    }
/* 210 */           for (int i2 = 0; i2 < this.I00oI0i.size(); i2++) {
/* 222 */               i1I1OO00o1o.I00II0Ol1O0l(100, (I01Ilioliio) this.I00oI0i.get(i2));
                    }
/* 230 */           olOO1i11110I000o00OoI0I.I001iOo1i0O(200, i1I1OO00o1o);
/* 235 */           i1I1OO00o1o.I00IO1oi11O(this.I00iiI);
                }

                public final boolean I00100o1O0lo() {
                    return (this.I00iiO & 16) == 16;
                }

                public final void I0010I0i() {
/* 1 */             List list = Collections.EMPTY_LIST;
/* 3 */             this.I00iio = list;
/* 6 */             this.I00ilI0I1 = false;
/* 8 */             this.I00ilO0 = 0;
/* 10 */            OOi001oo1OOI oOi001oo1OOI = I00oO101o;
/* 12 */            this.I00io1l = oOi001oo1OOI;
/* 14 */            this.I00ioIO = 0;
/* 16 */            this.I00l0I0l0lO1 = 0;
/* 18 */            this.I00l0OO0IO = 0;
/* 20 */            this.I00li1OI = 0;
/* 22 */            this.I00ll1 = 0;
/* 24 */            this.I00lli11 = oOi001oo1OOI;
/* 26 */            this.I00lll10 = 0;
/* 28 */            this.I00o0iI0io1 = oOi001oo1OOI;
/* 30 */            this.I00o0l1o1o0 = 0;
/* 32 */            this.I00o101lO = 0;
/* 34 */            this.I00oI0i = list;
                }
            }

            package p000;

            import com.google.mlkit.vision.barcode.common.Barcode;
            import java.io.IOException;
            import java.lang.invoke.VarHandle;
            import java.util.Collections;
            import java.util.List;
            
            public final class OOOOlIoIlOi extends Io00OlOi0 {
                public static final OOOOlIoIlOi I00o0l1o1o0;
                public static final O0II0llIl I00o101lO = new O0II0llIl(7);
                public IIOII1 I00iOIl;
                public int I00iiI;
                public OOOOil0 I00iiO;
                public long I00iio;
                public float I00ilI0I1;
                public double I00ilO0;
                public int I00io1l;
                public int I00ioIO;
                public int I00l0I0l0lO1;
                public OOOi000ooO I00l0OO0IO;
                public List I00li1OI;
                public int I00ll1;
                public int I00lli11;
                public byte I00lll10;
                public int I00o0iI0io1;

                static {
/* 11 */            OOOOlIoIlOi oOOOlIoIlOi = new OOOOlIoIlOi();
/* 15 */            oOOOlIoIlOi.I00lll10 = (byte) -1;
/* 17 */            oOOOlIoIlOi.I00o0iI0io1 = -1;
/* 21 */            oOOOlIoIlOi.I00iOIl = IIOII1.I00iOIl;
/* 23 */            VarHandle.storeStoreFence();
/* 26 */            I00o0l1o1o0 = oOOOlIoIlOi;
/* 28 */            oOOOlIoIlOi.I000OOo1O();
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
/* 16 */            if ((this.I00iiI & Barcode.FORMAT_ITF) == 128 && !this.I00l0OO0IO.I00000oOI()) {
/* 26 */                this.I00lll10 = (byte) 0;
/* 7 */                 return false;
                    }
/* 36 */            for (int i = 0; i < this.I00li1OI.size(); i++) {
/* 50 */                if (!((OOOOlIoIlOi) this.I00li1OI.get(i)).I00000oOI()) {
/* 52 */                    this.I00lll10 = (byte) 0;
/* 7 */                     return false;
                        }
                    }
/* 58 */            this.I00lll10 = (byte) 1;
/* 3 */             return true;
                }

                @Override
                public final int I0000Il00O() {
/* 1 */             int i = this.I00o0iI0io1;
/* 4 */             if (i != -1) {
/* 6 */                 return i;
                    }
/* 23 */            int iI0000O = (this.I00iiI & 1) == 1 ? I1I1OO00o1o.I0000O(1, this.I00iiO.I00iOIl) : 0;
/* 28 */            if ((this.I00iiI & 2) == 2) {
/* 30 */                long j = this.I00iio;
/* 48 */                iI0000O += I1I1OO00o1o.I000OiO((j >> 63) ^ (j << 1)) + I1I1OO00o1o.I000iOII(2);
                    }
/* 53 */            if ((this.I00iiI & 4) == 4) {
/* 61 */                iI0000O += I1I1OO00o1o.I000iOII(3) + 4;
                    }
/* 67 */            if ((this.I00iiI & 8) == 8) {
/* 74 */                iI0000O += I1I1OO00o1o.I000iOII(4) + 8;
                    }
/* 80 */            if ((this.I00iiI & 16) == 16) {
/* 89 */                iI0000O += I1I1OO00o1o.I0000oI00(5, this.I00io1l);
                    }
/* 95 */            if ((this.I00iiI & 32) == 32) {
/* 104 */               iI0000O += I1I1OO00o1o.I0000oI00(6, this.I00ioIO);
                    }
/* 110 */           if ((this.I00iiI & 64) == 64) {
/* 119 */               iI0000O += I1I1OO00o1o.I0000oI00(7, this.I00l0I0l0lO1);
                    }
/* 125 */           if ((this.I00iiI & Barcode.FORMAT_ITF) == 128) {
/* 133 */               iI0000O += I1I1OO00o1o.I000II(8, this.I00l0OO0IO);
                    }
/* 140 */           for (int i2 = 0; i2 < this.I00li1OI.size(); i2++) {
/* 156 */               iI0000O += I1I1OO00o1o.I000II(9, (I01Ilioliio) this.I00li1OI.get(i2));
                    }
/* 165 */           if ((this.I00iiI & Barcode.FORMAT_UPC_A) == 512) {
/* 175 */               iI0000O += I1I1OO00o1o.I0000oI00(10, this.I00lli11);
                    }
/* 181 */           if ((this.I00iiI & Barcode.FORMAT_QR_CODE) == 256) {
/* 191 */               iI0000O += I1I1OO00o1o.I0000oI00(11, this.I00ll1);
                    }
/* 198 */           int size = this.I00iOIl.size() + iI0000O;
/* 199 */           this.I00o0iI0io1 = size;
/* 541 */           return size;
                }

                @Override
                public final Ilooool1l0 I0000O() {
/* 1 */             return OOOOi0ooOlOo.I000II();
                }

                @Override
                public final Ilooool1l0 I0000oI00() {
/* 1 */             OOOOi0ooOlOo oOOOi0ooOlOoI000II = OOOOi0ooOlOo.I000II();
/* 5 */             oOOOi0ooOlOoI000II.I000O01llI0(this);
/* 29 */            return oOOOi0ooOlOoI000II;
                }

                @Override
                public final void I0001Ioi1lo(I1I1OO00o1o i1I1OO00o1o) throws IOException {
/* 1 */             I0000Il00O();
/* 8 */             if ((this.I00iiI & 1) == 1) {
/* 14 */                i1I1OO00o1o.I001lIiIIo1O(1, this.I00iiO.I00iOIl);
                    }
/* 22 */            if ((this.I00iiI & 2) == 2) {
/* 24 */                long j = this.I00iio;
/* 26 */                i1I1OO00o1o.I00IoIO0lI(2, 0);
/* 35 */                i1I1OO00o1o.I00Io1o110i((j >> 63) ^ (j << 1));
                    }
/* 43 */            if ((this.I00iiI & 4) == 4) {
/* 45 */                float f = this.I00ilI0I1;
/* 48 */                i1I1OO00o1o.I00IoIO0lI(3, 5);
/* 55 */                i1I1OO00o1o.I00IioO0OiOi(Float.floatToRawIntBits(f));
                    }
/* 63 */            if ((this.I00iiI & 8) == 8) {
/* 65 */                double d = this.I00ilO0;
/* 67 */                i1I1OO00o1o.I00IoIO0lI(4, 1);
/* 74 */                i1I1OO00o1o.I00IlilI0i0i(Double.doubleToRawLongBits(d));
                    }
/* 82 */            if ((this.I00iiI & 16) == 16) {
/* 86 */                i1I1OO00o1o.I001lllioOl(5, this.I00io1l);
                    }
/* 94 */            if ((this.I00iiI & 32) == 32) {
/* 99 */                i1I1OO00o1o.I001lllioOl(6, this.I00ioIO);
                    }
/* 107 */           if ((this.I00iiI & 64) == 64) {
/* 112 */               i1I1OO00o1o.I001lllioOl(7, this.I00l0I0l0lO1);
                    }
/* 120 */           if ((this.I00iiI & Barcode.FORMAT_ITF) == 128) {
/* 124 */               i1I1OO00o1o.I00II0Ol1O0l(8, this.I00l0OO0IO);
                    }
/* 133 */           for (int i = 0; i < this.I00li1OI.size(); i++) {
/* 145 */               i1I1OO00o1o.I00II0Ol1O0l(9, (I01Ilioliio) this.I00li1OI.get(i));
                    }
/* 156 */           if ((this.I00iiI & Barcode.FORMAT_UPC_A) == 512) {
/* 162 */               i1I1OO00o1o.I001lllioOl(10, this.I00lli11);
                    }
/* 170 */           if ((this.I00iiI & Barcode.FORMAT_QR_CODE) == 256) {
/* 176 */               i1I1OO00o1o.I001lllioOl(11, this.I00ll1);
                    }
/* 181 */           i1I1OO00o1o.I00IO1oi11O(this.I00iOIl);
                }

                public final void I000OOo1O() {
/* 3 */             this.I00iiO = OOOOil0.BYTE;
/* 7 */             this.I00iio = 0L;
/* 10 */            this.I00ilI0I1 = 0.0f;
/* 14 */            this.I00ilO0 = 0.0d;
/* 17 */            this.I00io1l = 0;
/* 19 */            this.I00ioIO = 0;
/* 21 */            this.I00l0I0l0lO1 = 0;
/* 25 */            this.I00l0OO0IO = OOOi000ooO.I00io1l;
/* 29 */            this.I00li1OI = Collections.EMPTY_LIST;
/* 31 */            this.I00ll1 = 0;
/* 33 */            this.I00lli11 = 0;
                }
            }

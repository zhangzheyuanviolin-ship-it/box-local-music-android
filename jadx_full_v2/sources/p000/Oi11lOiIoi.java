            package p000;

            import com.google.mlkit.vision.barcode.common.Barcode;
            
            public final class Oi11lOiIoi implements IiIooOOOI {
                public int I00iOIl;
                public float I00iiI = 1.0f;
                public float I00iiO = 1.0f;
                public float I00iio = 1.0f;
                public float I00ilI0I1;
                public float I00ilO0;
                public float I00io1l;
                public long I00ioIO;
                public long I00l0I0l0lO1;
                public float I00l0OO0IO;
                public float I00li1OI;
                public float I00ll1;
                public float I00lli11;
                public long I00lll10;
                public OioOIi1o0I I00o0iI0io1;
                public boolean I00o0l1o1o0;
                public int I00o101lO;
                public long I00oI0i;
                public O0iOIOiIIII I00oII;
                public IiIooOOOI I00oIiI10;
                public O0iOOoiioO I00oO101o;
                public IOOil0 I00oOio10iI1;
                public int I00ol1;
                public l1lOoiII1l I00olI;

                public Oi11lOiIoi() {
/* 12 */            long j = Io10Oi10I.I00000oIO;
/* 14 */            this.I00ioIO = j;
/* 16 */            this.I00l0I0l0lO1 = j;
/* 20 */            this.I00lli11 = 8.0f;
/* 24 */            this.I00lll10 = OoI0l01O.I00000oOI;
/* 28 */            this.I00o0iI0io1 = iO0ioilo.I00000oIO;
/* 31 */            this.I00o101lO = 0;
/* 38 */            this.I00oI0i = 9205357640488583168L;
/* 42 */            this.I00oII = O0iOIOiIIII.I00000oIO;
/* 48 */            this.I00oIiI10 = il0oI1oIi.I00000oIO(1.0f, 1.0f);
/* 52 */            this.I00oO101o = O0iOOoiioO.I00iOIl;
/* 55 */            this.I00ol1 = 3;
                }

                @Override
                public final float I00000oIO() {
/* 3 */             return this.I00oIiI10.I00000oIO();
                }

                public final void I00000oOI() {
/* 3 */             I000iOII(1.0f);
/* 6 */             I000l1(1.0f);
/* 9 */             I0000Il00O(1.0f);
/* 13 */            I001l0I00(0.0f);
/* 16 */            I001lllioOl(0.0f);
/* 19 */            I000oI1ioi(0.0f);
/* 22 */            long j = Io10Oi10I.I00000oIO;
/* 24 */            I0000O(j);
/* 27 */            I001IIilI0O(j);
/* 30 */            I000O01llI0(0.0f);
/* 33 */            I000OOo1O(0.0f);
/* 36 */            I000OiO(0.0f);
/* 45 */            if (this.I00lli11 != 8.0f) {
                        this.I00iOIl |= Barcode.FORMAT_PDF417;
/* 54 */                this.I00lli11 = 8.0f;
                    }
/* 58 */            I001iOo1i0O(OoI0l01O.I00000oOI);
/* 63 */            I0010o(iO0ioilo.I00000oIO);
/* 67 */            I0001Ioi1lo(false);
/* 71 */            I000II(null);
/* 77 */            if (this.I00ol1 != 3) {
                        this.I00iOIl |= 524288;
/* 87 */                this.I00ol1 = 3;
                    }
/* 91 */            if (this.I00o101lO != 0) {
                        this.I00iOIl |= 32768;
/* 102 */               this.I00o101lO = 0;
                    }
/* 104 */           O0iOIOiIIII o0iOIOiIIII = O0iOIOiIIII.I00000oIO;
/* 112 */           if (!O0000Ioio00.I0000O(this.I00oII, o0iOIOiIIII)) {
                        this.I00iOIl |= 1048576;
/* 121 */               this.I00oII = o0iOIOiIIII;
                    }
/* 128 */           this.I00oI0i = 9205357640488583168L;
/* 130 */           this.I00olI = null;
/* 132 */           this.I00iOIl = 0;
                }

                public final void I0000Il00O(float f) {
/* 5 */             if (this.I00iio == f) {
/* 7 */                 return;
                    }
                    this.I00iOIl |= 4;
/* 14 */            this.I00iio = f;
                }

                public final void I0000O(long j) {
/* 1 */             long j2 = this.I00ioIO;
/* 3 */             int i = IOOiio0i.I000oI1ioi;
/* 9 */             if (Ooi0i1.I00000oOI(j2, j)) {
/* 29 */                return;
                    }
                    this.I00iOIl |= 64;
/* 17 */            this.I00ioIO = j;
                }

                public final void I0001Ioi1lo(boolean z) {
/* 3 */             if (this.I00o0l1o1o0 != z) {
                        this.I00iOIl |= 16384;
/* 11 */                this.I00o0l1o1o0 = z;
                    }
                }

                public final void I000II(IOOil0 iOOil0) {
/* 7 */             if (O0000Ioio00.I0000O(this.I00oOio10iI1, iOOil0)) {
/* 29 */                return;
                    }
                    this.I00iOIl |= 262144;
/* 16 */            this.I00oOio10iI1 = iOOil0;
                }

                public final void I000O01llI0(float f) {
/* 5 */             if (this.I00l0OO0IO == f) {
/* 7 */                 return;
                    }
                    this.I00iOIl |= Barcode.FORMAT_QR_CODE;
/* 14 */            this.I00l0OO0IO = f;
                }

                public final void I000OOo1O(float f) {
/* 5 */             if (this.I00li1OI == f) {
/* 7 */                 return;
                    }
                    this.I00iOIl |= Barcode.FORMAT_UPC_A;
/* 14 */            this.I00li1OI = f;
                }

                public final void I000OiO(float f) {
/* 5 */             if (this.I00ll1 == f) {
/* 7 */                 return;
                    }
                    this.I00iOIl |= Barcode.FORMAT_UPC_E;
/* 14 */            this.I00ll1 = f;
                }

                public final void I000iOII(float f) {
/* 5 */             if (this.I00iiI == f) {
/* 7 */                 return;
                    }
                    this.I00iOIl |= 1;
/* 14 */            this.I00iiI = f;
                }

                public final void I000l1(float f) {
/* 5 */             if (this.I00iiO == f) {
/* 7 */                 return;
                    }
                    this.I00iOIl |= 2;
/* 14 */            this.I00iiO = f;
                }

                public final void I000oI1ioi(float f) {
/* 5 */             if (this.I00io1l == f) {
/* 7 */                 return;
                    }
                    this.I00iOIl |= 32;
/* 14 */            this.I00io1l = f;
                }

                public final void I0010o(OioOIi1o0I oioOIi1o0I) {
/* 7 */             if (O0000Ioio00.I0000O(this.I00o0iI0io1, oioOIi1o0I)) {
/* 29 */                return;
                    }
                    this.I00iOIl |= 8192;
/* 15 */            this.I00o0iI0io1 = oioOIi1o0I;
                }

                public final void I001IIilI0O(long j) {
/* 1 */             long j2 = this.I00l0I0l0lO1;
/* 3 */             int i = IOOiio0i.I000oI1ioi;
/* 9 */             if (Ooi0i1.I00000oOI(j2, j)) {
/* 29 */                return;
                    }
                    this.I00iOIl |= Barcode.FORMAT_ITF;
/* 17 */            this.I00l0I0l0lO1 = j;
                }

                public final void I001iOo1i0O(long j) {
/* 7 */             if (OoI0l01O.I00000oOI(this.I00lll10, j)) {
/* 29 */                return;
                    }
                    this.I00iOIl |= Barcode.FORMAT_AZTEC;
/* 15 */            this.I00lll10 = j;
                }

                public final void I001l0I00(float f) {
/* 5 */             if (this.I00ilI0I1 == f) {
/* 7 */                 return;
                    }
                    this.I00iOIl |= 8;
/* 14 */            this.I00ilI0I1 = f;
                }

                public final void I001lllioOl(float f) {
/* 5 */             if (this.I00ilO0 == f) {
/* 7 */                 return;
                    }
                    this.I00iOIl |= 16;
/* 14 */            this.I00ilO0 = f;
                }

                @Override
                public final float I00Ol00() {
/* 3 */             return this.I00oIiI10.I00Ol00();
                }
            }

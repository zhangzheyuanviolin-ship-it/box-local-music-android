            package p000;

            import com.google.mlkit.vision.barcode.common.Barcode;
            import java.util.ArrayList;
            import java.util.Collections;
            import java.util.List;
            
            public final class OOOOi0ooOlOo extends Ilooool1l0 implements O1lIi00l {
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

                public static OOOOi0ooOlOo I000II() {
/* 3 */             OOOOi0ooOlOo oOOOi0ooOlOo = new OOOOi0ooOlOo();
/* 8 */             oOOOi0ooOlOo.I00iiO = OOOOil0.BYTE;
/* 12 */            oOOOi0ooOlOo.I00l0OO0IO = OOOi000ooO.I00io1l;
/* 16 */            oOOOi0ooOlOo.I00li1OI = Collections.EMPTY_LIST;
/* 29 */            return oOOOi0ooOlOo;
                }

                @Override
                public final I01Ilioliio I0000Il00O() {
/* 1 */             OOOOlIoIlOi oOOOlIoIlOiI0001Ioi1lo = I0001Ioi1lo();
/* 9 */             if (oOOOlIoIlOiI0001Ioi1lo.I00000oOI()) {
/* 11 */                return oOOOlIoIlOiI0001Ioi1lo;
                    }
/* 29 */            throw new IOiIIo1l();
                }

                /* JADX WARN: Removed duplicated region for block: B:14:0x0019  */
                @Override
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Ilooool1l0 I0000O(IOOOIOiO0io1 iOOOIOiO0io1, Il1lll0iI il1lll0iI) throws Throwable {
/* 1 */             OOOOlIoIlOi oOOOlIoIlOi = null;
                    try {
                        try {
/* 10 */                    I000O01llI0((OOOOlIoIlOi) OOOOlIoIlOi.I00o101lO.I0000Il00O(iOOOIOiO0io1, il1lll0iI));
/* 13 */                    return this;
                        } catch (O001110li e) {
/* 19 */                    OOOOlIoIlOi oOOOlIoIlOi2 = (OOOOlIoIlOi) e.I00iOIl;
                            try {
/* 21 */                        throw e;
                            } catch (Throwable th) {
/* 22 */                        th = th;
/* 23 */                        oOOOlIoIlOi = oOOOlIoIlOi2;
/* 24 */                        if (oOOOlIoIlOi != null) {
/* 26 */                            I000O01llI0(oOOOlIoIlOi);
                                }
/* 89 */                        throw th;
                            }
                        }
                    } catch (Throwable th2) {
/* 14 */                th = th2;
/* 24 */                if (oOOOlIoIlOi != null) {
                        }
/* 89 */                throw th;
                    }
                }

                @Override
                public final Ilooool1l0 I0000oI00(Io00OlOi0 io00OlOi0) {
/* 3 */             I000O01llI0((OOOOlIoIlOi) io00OlOi0);
/* 49 */            return this;
                }

                public final OOOOlIoIlOi I0001Ioi1lo() {
/* 3 */             OOOOlIoIlOi oOOOlIoIlOi = new OOOOlIoIlOi();
/* 7 */             oOOOlIoIlOi.I00lll10 = (byte) -1;
/* 9 */             oOOOlIoIlOi.I00o0iI0io1 = -1;
/* 13 */            oOOOlIoIlOi.I00iOIl = this.I00iOIl;
/* 15 */            int i = this.I00iiI;
/* 20 */            int i2 = (i & 1) != 1 ? 0 : 1;
/* 26 */            oOOOlIoIlOi.I00iiO = this.I00iiO;
/* 31 */            if ((i & 2) == 2) {
/* 33 */                i2 |= 2;
                    }
/* 37 */            oOOOlIoIlOi.I00iio = this.I00iio;
/* 42 */            if ((i & 4) == 4) {
/* 44 */                i2 |= 4;
                    }
/* 48 */            oOOOlIoIlOi.I00ilI0I1 = this.I00ilI0I1;
/* 54 */            if ((i & 8) == 8) {
/* 56 */                i2 |= 8;
                    }
/* 60 */            oOOOlIoIlOi.I00ilO0 = this.I00ilO0;
/* 66 */            if ((i & 16) == 16) {
/* 68 */                i2 |= 16;
                    }
/* 72 */            oOOOlIoIlOi.I00io1l = this.I00io1l;
/* 78 */            if ((i & 32) == 32) {
/* 80 */                i2 |= 32;
                    }
/* 84 */            oOOOlIoIlOi.I00ioIO = this.I00ioIO;
/* 90 */            if ((i & 64) == 64) {
/* 92 */                i2 |= 64;
                    }
/* 96 */            oOOOlIoIlOi.I00l0I0l0lO1 = this.I00l0I0l0lO1;
/* 102 */           if ((i & Barcode.FORMAT_ITF) == 128) {
/* 104 */               i2 |= Barcode.FORMAT_ITF;
                    }
/* 108 */           oOOOlIoIlOi.I00l0OO0IO = this.I00l0OO0IO;
/* 114 */           if ((i & Barcode.FORMAT_QR_CODE) == 256) {
/* 122 */               this.I00li1OI = Collections.unmodifiableList(this.I00li1OI);
                        this.I00iiI &= -257;
                    }
/* 132 */           oOOOlIoIlOi.I00li1OI = this.I00li1OI;
/* 138 */           if ((i & Barcode.FORMAT_UPC_A) == 512) {
/* 140 */               i2 |= Barcode.FORMAT_QR_CODE;
                    }
/* 144 */           oOOOlIoIlOi.I00ll1 = this.I00ll1;
/* 149 */           if ((i & Barcode.FORMAT_UPC_E) == 1024) {
/* 151 */               i2 |= Barcode.FORMAT_UPC_A;
                    }
/* 155 */           oOOOlIoIlOi.I00lli11 = this.I00lli11;
/* 157 */           oOOOlIoIlOi.I00iiI = i2;
/* 541 */           return oOOOlIoIlOi;
                }

                public final void I000O01llI0(OOOOlIoIlOi oOOOlIoIlOi) {
                    OOOi000ooO oOOi000ooO;
/* 3 */             if (oOOOlIoIlOi == OOOOlIoIlOi.I00o0l1o1o0) {
/* 5 */                 return;
                    }
/* 10 */            if ((oOOOlIoIlOi.I00iiI & 1) == 1) {
/* 12 */                OOOOil0 oOOOil0 = oOOOlIoIlOi.I00iiO;
/* 14 */                oOOOil0.getClass();
/* 20 */                this.I00iiI = 1 | this.I00iiI;
/* 22 */                this.I00iiO = oOOOil0;
                    }
/* 24 */            int i = oOOOlIoIlOi.I00iiI;
/* 29 */            if ((i & 2) == 2) {
/* 31 */                long j = oOOOlIoIlOi.I00iio;
                        this.I00iiI |= 2;
/* 38 */                this.I00iio = j;
                    }
/* 43 */            if ((i & 4) == 4) {
/* 45 */                float f = oOOOlIoIlOi.I00ilI0I1;
/* 50 */                this.I00iiI = 4 | this.I00iiI;
/* 52 */                this.I00ilI0I1 = f;
                    }
/* 58 */            if ((i & 8) == 8) {
/* 60 */                double d = oOOOlIoIlOi.I00ilO0;
                        this.I00iiI |= 8;
/* 67 */                this.I00ilO0 = d;
                    }
/* 73 */            if ((i & 16) == 16) {
/* 75 */                int i2 = oOOOlIoIlOi.I00io1l;
/* 80 */                this.I00iiI = 16 | this.I00iiI;
/* 82 */                this.I00io1l = i2;
                    }
/* 88 */            if ((i & 32) == 32) {
/* 90 */                int i3 = oOOOlIoIlOi.I00ioIO;
/* 95 */                this.I00iiI = 32 | this.I00iiI;
/* 97 */                this.I00ioIO = i3;
                    }
/* 103 */           if ((i & 64) == 64) {
/* 105 */               int i4 = oOOOlIoIlOi.I00l0I0l0lO1;
/* 110 */               this.I00iiI = 64 | this.I00iiI;
/* 112 */               this.I00l0I0l0lO1 = i4;
                    }
/* 117 */           if ((i & Barcode.FORMAT_ITF) == 128) {
/* 119 */               OOOi000ooO oOOi000ooO2 = oOOOlIoIlOi.I00l0OO0IO;
/* 124 */               if ((this.I00iiI & Barcode.FORMAT_ITF) != 128 || (oOOi000ooO = this.I00l0OO0IO) == OOOi000ooO.I00io1l) {
/* 155 */                   this.I00l0OO0IO = oOOi000ooO2;
                        } else {
/* 135 */                   OOOOo00i00Io oOOOo00i00Io = new OOOOo00i00Io(0);
/* 140 */                   oOOOo00i00Io.I00iio = Collections.EMPTY_LIST;
/* 142 */                   oOOOo00i00Io.I000O01llI0(oOOi000ooO);
/* 145 */                   oOOOo00i00Io.I000O01llI0(oOOi000ooO2);
/* 152 */                   this.I00l0OO0IO = oOOOo00i00Io.I0001Ioi1lo();
                        }
                        this.I00iiI |= Barcode.FORMAT_ITF;
                    }
/* 170 */           if (!oOOOlIoIlOi.I00li1OI.isEmpty()) {
/* 178 */               if (this.I00li1OI.isEmpty()) {
/* 182 */                   this.I00li1OI = oOOOlIoIlOi.I00li1OI;
                            this.I00iiI &= -257;
                        } else {
/* 194 */                   if ((this.I00iiI & Barcode.FORMAT_QR_CODE) != 256) {
/* 203 */                       this.I00li1OI = new ArrayList(this.I00li1OI);
                                this.I00iiI |= Barcode.FORMAT_QR_CODE;
                            }
/* 214 */                   this.I00li1OI.addAll(oOOOlIoIlOi.I00li1OI);
                        }
                    }
/* 217 */           int i5 = oOOOlIoIlOi.I00iiI;
/* 223 */           if ((i5 & Barcode.FORMAT_QR_CODE) == 256) {
/* 225 */               int i6 = oOOOlIoIlOi.I00ll1;
                        this.I00iiI |= Barcode.FORMAT_UPC_A;
/* 232 */               this.I00ll1 = i6;
                    }
/* 235 */           if ((i5 & Barcode.FORMAT_UPC_A) == 512) {
/* 237 */               int i7 = oOOOlIoIlOi.I00lli11;
                        this.I00iiI |= Barcode.FORMAT_UPC_E;
/* 245 */               this.I00lli11 = i7;
                    }
/* 255 */           this.I00iOIl = this.I00iOIl.I0000O(oOOOlIoIlOi.I00iOIl);
                }

                public final Object clone() {
/* 1 */             OOOOi0ooOlOo oOOOi0ooOlOoI000II = I000II();
/* 9 */             oOOOi0ooOlOoI000II.I000O01llI0(I0001Ioi1lo());
/* 29 */            return oOOOi0ooOlOoI000II;
                }
            }

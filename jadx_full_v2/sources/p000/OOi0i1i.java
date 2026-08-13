            package p000;

            import com.google.mlkit.vision.barcode.common.Barcode;
            import java.util.ArrayList;
            import java.util.Collections;
            import java.util.List;
            
            public final class OOi0i1i extends Io000lII0l {
                public int I00iio;
                public int I00ilI0I1;
                public int I00ilO0;
                public OOi001oo1OOI I00io1l;
                public int I00ioIO;
                public OOi001oo1OOI I00l0I0l0lO1;
                public int I00l0OO0IO;
                public List I00li1OI;
                public OOOOlIoIlOi I00ll1;

                public static OOi0i1i I000O01llI0() {
/* 3 */             OOi0i1i oOi0i1i = new OOi0i1i();
/* 6 */             OOi001oo1OOI oOi001oo1OOI = OOi001oo1OOI.I00oO101o;
/* 8 */             oOi0i1i.I00io1l = oOi001oo1OOI;
/* 10 */            oOi0i1i.I00l0I0l0lO1 = oOi001oo1OOI;
/* 14 */            oOi0i1i.I00li1OI = Collections.EMPTY_LIST;
/* 18 */            oOi0i1i.I00ll1 = OOOOlIoIlOi.I00o0l1o1o0;
/* 29 */            return oOi0i1i;
                }

                @Override
                public final I01Ilioliio I0000Il00O() {
/* 1 */             OOi0iiO0iOi oOi0iiO0iOiI000II = I000II();
/* 9 */             if (oOi0iiO0iOiI000II.I00000oOI()) {
/* 11 */                return oOi0iiO0iOiI000II;
                    }
/* 29 */            throw new IOiIIo1l();
                }

                /* JADX WARN: Removed duplicated region for block: B:14:0x0019  */
                @Override
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Ilooool1l0 I0000O(IOOOIOiO0io1 iOOOIOiO0io1, Il1lll0iI il1lll0iI) throws Throwable {
/* 1 */             OOi0iiO0iOi oOi0iiO0iOi = null;
                    try {
                        try {
/* 10 */                    I000OOo1O((OOi0iiO0iOi) OOi0iiO0iOi.I00o0iI0io1.I0000Il00O(iOOOIOiO0io1, il1lll0iI));
/* 13 */                    return this;
                        } catch (O001110li e) {
/* 19 */                    OOi0iiO0iOi oOi0iiO0iOi2 = (OOi0iiO0iOi) e.I00iOIl;
                            try {
/* 21 */                        throw e;
                            } catch (Throwable th) {
/* 22 */                        th = th;
/* 23 */                        oOi0iiO0iOi = oOi0iiO0iOi2;
/* 24 */                        if (oOi0iiO0iOi != null) {
/* 26 */                            I000OOo1O(oOi0iiO0iOi);
                                }
/* 89 */                        throw th;
                            }
                        }
                    } catch (Throwable th2) {
/* 14 */                th = th2;
/* 24 */                if (oOi0iiO0iOi != null) {
                        }
/* 89 */                throw th;
                    }
                }

                @Override
                public final Ilooool1l0 I0000oI00(Io00OlOi0 io00OlOi0) {
/* 3 */             I000OOo1O((OOi0iiO0iOi) io00OlOi0);
/* 49 */            return this;
                }

                public final OOi0iiO0iOi I000II() {
/* 3 */             OOi0iiO0iOi oOi0iiO0iOi = new OOi0iiO0iOi(this);
/* 7 */             oOi0iiO0iOi.I00ll1 = (byte) -1;
/* 9 */             oOi0iiO0iOi.I00lli11 = -1;
/* 13 */            oOi0iiO0iOi.I00iiI = this.I00iOIl;
/* 15 */            int i = this.I00iio;
/* 20 */            int i2 = (i & 1) != 1 ? 0 : 1;
/* 26 */            oOi0iiO0iOi.I00iio = this.I00ilI0I1;
/* 31 */            if ((i & 2) == 2) {
/* 33 */                i2 |= 2;
                    }
/* 37 */            oOi0iiO0iOi.I00ilI0I1 = this.I00ilO0;
/* 42 */            if ((i & 4) == 4) {
/* 44 */                i2 |= 4;
                    }
/* 48 */            oOi0iiO0iOi.I00ilO0 = this.I00io1l;
/* 54 */            if ((i & 8) == 8) {
/* 56 */                i2 |= 8;
                    }
/* 60 */            oOi0iiO0iOi.I00io1l = this.I00ioIO;
/* 66 */            if ((i & 16) == 16) {
/* 68 */                i2 |= 16;
                    }
/* 72 */            oOi0iiO0iOi.I00ioIO = this.I00l0I0l0lO1;
/* 78 */            if ((i & 32) == 32) {
/* 80 */                i2 |= 32;
                    }
/* 84 */            oOi0iiO0iOi.I00l0I0l0lO1 = this.I00l0OO0IO;
/* 90 */            if ((i & 64) == 64) {
/* 98 */                this.I00li1OI = Collections.unmodifiableList(this.I00li1OI);
                        this.I00iio &= -65;
                    }
/* 108 */           oOi0iiO0iOi.I00l0OO0IO = this.I00li1OI;
/* 113 */           if ((i & Barcode.FORMAT_ITF) == 128) {
/* 115 */               i2 |= 64;
                    }
/* 119 */           oOi0iiO0iOi.I00li1OI = this.I00ll1;
/* 121 */           oOi0iiO0iOi.I00iiO = i2;
/* 541 */           return oOi0iiO0iOi;
                }

                public final void I000OOo1O(OOi0iiO0iOi oOi0iiO0iOi) {
                    OOOOlIoIlOi oOOOlIoIlOi;
                    OOi001oo1OOI oOi001oo1OOI;
                    OOi001oo1OOI oOi001oo1OOI2;
/* 3 */             if (oOi0iiO0iOi == OOi0iiO0iOi.I00lll10) {
/* 5 */                 return;
                    }
/* 6 */             int i = oOi0iiO0iOi.I00iiO;
/* 11 */            if ((i & 1) == 1) {
/* 13 */                int i2 = oOi0iiO0iOi.I00iio;
/* 18 */                this.I00iio = 1 | this.I00iio;
/* 20 */                this.I00ilI0I1 = i2;
                    }
/* 25 */            if ((i & 2) == 2) {
/* 27 */                int i3 = oOi0iiO0iOi.I00ilI0I1;
/* 32 */                this.I00iio = 2 | this.I00iio;
/* 34 */                this.I00ilO0 = i3;
                    }
/* 38 */            if ((i & 4) == 4) {
/* 40 */                OOi001oo1OOI oOi001oo1OOI3 = oOi0iiO0iOi.I00ilO0;
/* 45 */                if ((this.I00iio & 4) != 4 || (oOi001oo1OOI2 = this.I00io1l) == OOi001oo1OOI.I00oO101o) {
/* 67 */                    this.I00io1l = oOi001oo1OOI3;
                        } else {
/* 53 */                    OOOoooI oOOoooII0010o = OOi001oo1OOI.I0010o(oOi001oo1OOI2);
/* 57 */                    oOOoooII0010o.I000OOo1O(oOi001oo1OOI3);
/* 64 */                    this.I00io1l = oOOoooII0010o.I000II();
                        }
                        this.I00iio |= 4;
                    }
/* 74 */            int i4 = oOi0iiO0iOi.I00iiO;
/* 80 */            if ((i4 & 8) == 8) {
/* 82 */                int i5 = oOi0iiO0iOi.I00io1l;
/* 87 */                this.I00iio = 8 | this.I00iio;
/* 89 */                this.I00ioIO = i5;
                    }
/* 94 */            if ((i4 & 16) == 16) {
/* 96 */                OOi001oo1OOI oOi001oo1OOI4 = oOi0iiO0iOi.I00ioIO;
/* 101 */               if ((this.I00iio & 16) != 16 || (oOi001oo1OOI = this.I00l0I0l0lO1) == OOi001oo1OOI.I00oO101o) {
/* 123 */                   this.I00l0I0l0lO1 = oOi001oo1OOI4;
                        } else {
/* 109 */                   OOOoooI oOOoooII0010o2 = OOi001oo1OOI.I0010o(oOi001oo1OOI);
/* 113 */                   oOOoooII0010o2.I000OOo1O(oOi001oo1OOI4);
/* 120 */                   this.I00l0I0l0lO1 = oOOoooII0010o2.I000II();
                        }
                        this.I00iio |= 16;
                    }
/* 135 */           if ((oOi0iiO0iOi.I00iiO & 32) == 32) {
/* 137 */               int i6 = oOi0iiO0iOi.I00l0I0l0lO1;
/* 142 */               this.I00iio = 32 | this.I00iio;
/* 144 */               this.I00l0OO0IO = i6;
                    }
/* 154 */           if (!oOi0iiO0iOi.I00l0OO0IO.isEmpty()) {
/* 162 */               if (this.I00li1OI.isEmpty()) {
/* 166 */                   this.I00li1OI = oOi0iiO0iOi.I00l0OO0IO;
                            this.I00iio &= -65;
                        } else {
/* 178 */                   if ((this.I00iio & 64) != 64) {
/* 187 */                       this.I00li1OI = new ArrayList(this.I00li1OI);
                                this.I00iio |= 64;
                            }
/* 198 */                   this.I00li1OI.addAll(oOi0iiO0iOi.I00l0OO0IO);
                        }
                    }
/* 204 */           if ((oOi0iiO0iOi.I00iiO & 64) == 64) {
/* 206 */               OOOOlIoIlOi oOOOlIoIlOi2 = oOi0iiO0iOi.I00li1OI;
/* 213 */               if ((this.I00iio & Barcode.FORMAT_ITF) != 128 || (oOOOlIoIlOi = this.I00ll1) == OOOOlIoIlOi.I00o0l1o1o0) {
/* 238 */                   this.I00ll1 = oOOOlIoIlOi2;
                        } else {
/* 221 */                   OOOOi0ooOlOo oOOOi0ooOlOoI000II = OOOOi0ooOlOo.I000II();
/* 225 */                   oOOOi0ooOlOoI000II.I000O01llI0(oOOOlIoIlOi);
/* 228 */                   oOOOi0ooOlOoI000II.I000O01llI0(oOOOlIoIlOi2);
/* 235 */                   this.I00ll1 = oOOOi0ooOlOoI000II.I0001Ioi1lo();
                        }
                        this.I00iio |= Barcode.FORMAT_ITF;
                    }
/* 245 */           I0001Ioi1lo(oOi0iiO0iOi);
/* 256 */           this.I00iOIl = this.I00iOIl.I0000O(oOi0iiO0iOi.I00iiI);
                }

                public final Object clone() {
/* 1 */             OOi0i1i oOi0i1iI000O01llI0 = I000O01llI0();
/* 9 */             oOi0i1iI000O01llI0.I000OOo1O(I000II());
/* 29 */            return oOi0i1iI000O01llI0;
                }
            }

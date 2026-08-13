            package p000;

            import com.google.mlkit.vision.barcode.common.Barcode;
            import java.util.ArrayList;
            import java.util.Collections;
            import java.util.List;
            
            public final class OOi00iIO extends Io000lII0l {
                public int I00iio;
                public int I00ilI0I1;
                public int I00ilO0;
                public List I00io1l;
                public OOi001oo1OOI I00ioIO;
                public int I00l0I0l0lO1;
                public OOi001oo1OOI I00l0OO0IO;
                public int I00li1OI;
                public List I00ll1;
                public List I00lli11;
                public List I00lll10;

                public static OOi00iIO I000O01llI0() {
/* 3 */             OOi00iIO oOi00iIO = new OOi00iIO();
/* 7 */             oOi00iIO.I00ilI0I1 = 6;
/* 9 */             List list = Collections.EMPTY_LIST;
/* 11 */            oOi00iIO.I00io1l = list;
/* 13 */            OOi001oo1OOI oOi001oo1OOI = OOi001oo1OOI.I00oO101o;
/* 15 */            oOi00iIO.I00ioIO = oOi001oo1OOI;
/* 17 */            oOi00iIO.I00l0OO0IO = oOi001oo1OOI;
/* 19 */            oOi00iIO.I00ll1 = list;
/* 21 */            oOi00iIO.I00lli11 = list;
/* 23 */            oOi00iIO.I00lll10 = list;
/* 29 */            return oOi00iIO;
                }

                @Override
                public final I01Ilioliio I0000Il00O() {
/* 1 */             OOi0IOIIOO oOi0IOIIOOI000II = I000II();
/* 9 */             if (oOi0IOIIOOI000II.I00000oOI()) {
/* 11 */                return oOi0IOIIOOI000II;
                    }
/* 29 */            throw new IOiIIo1l();
                }

                /* JADX WARN: Removed duplicated region for block: B:14:0x0019  */
                @Override
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Ilooool1l0 I0000O(IOOOIOiO0io1 iOOOIOiO0io1, Il1lll0iI il1lll0iI) throws Throwable {
/* 1 */             OOi0IOIIOO oOi0IOIIOO = null;
                    try {
                        try {
/* 10 */                    I000OOo1O((OOi0IOIIOO) OOi0IOIIOO.I00o101lO.I0000Il00O(iOOOIOiO0io1, il1lll0iI));
/* 13 */                    return this;
                        } catch (O001110li e) {
/* 19 */                    OOi0IOIIOO oOi0IOIIOO2 = (OOi0IOIIOO) e.I00iOIl;
                            try {
/* 21 */                        throw e;
                            } catch (Throwable th) {
/* 22 */                        th = th;
/* 23 */                        oOi0IOIIOO = oOi0IOIIOO2;
/* 24 */                        if (oOi0IOIIOO != null) {
/* 26 */                            I000OOo1O(oOi0IOIIOO);
                                }
/* 89 */                        throw th;
                            }
                        }
                    } catch (Throwable th2) {
/* 14 */                th = th2;
/* 24 */                if (oOi0IOIIOO != null) {
                        }
/* 89 */                throw th;
                    }
                }

                @Override
                public final Ilooool1l0 I0000oI00(Io00OlOi0 io00OlOi0) {
/* 3 */             I000OOo1O((OOi0IOIIOO) io00OlOi0);
/* 49 */            return this;
                }

                public final OOi0IOIIOO I000II() {
                    int i;
/* 3 */             OOi0IOIIOO oOi0IOIIOO = new OOi0IOIIOO(this);
/* 7 */             oOi0IOIIOO.I00lll10 = (byte) -1;
/* 9 */             oOi0IOIIOO.I00o0iI0io1 = -1;
/* 13 */            oOi0IOIIOO.I00iiI = this.I00iOIl;
/* 15 */            int i2 = this.I00iio;
/* 20 */            int i3 = (i2 & 1) != 1 ? 0 : 1;
/* 26 */            oOi0IOIIOO.I00iio = this.I00ilI0I1;
/* 31 */            if ((i2 & 2) == 2) {
/* 33 */                i3 |= 2;
                    }
/* 37 */            oOi0IOIIOO.I00ilI0I1 = this.I00ilO0;
/* 42 */            if ((i2 & 4) == 4) {
/* 50 */                this.I00io1l = Collections.unmodifiableList(this.I00io1l);
/* 54 */                i = this.I00iio & (-5);
/* 56 */                this.I00iio = i;
                    } else {
/* 59 */                i = i2;
                    }
/* 62 */            oOi0IOIIOO.I00ilO0 = this.I00io1l;
/* 68 */            if ((i2 & 8) == 8) {
/* 70 */                i3 |= 4;
                    }
/* 74 */            oOi0IOIIOO.I00io1l = this.I00ioIO;
/* 80 */            if ((i2 & 16) == 16) {
/* 82 */                i3 |= 8;
                    }
/* 86 */            oOi0IOIIOO.I00ioIO = this.I00l0I0l0lO1;
/* 92 */            if ((i2 & 32) == 32) {
/* 94 */                i3 |= 16;
                    }
/* 98 */            oOi0IOIIOO.I00l0I0l0lO1 = this.I00l0OO0IO;
/* 103 */           if ((i2 & 64) == 64) {
/* 105 */               i3 |= 32;
                    }
/* 109 */           oOi0IOIIOO.I00l0OO0IO = this.I00li1OI;
/* 115 */           if ((i & Barcode.FORMAT_ITF) == 128) {
/* 123 */               this.I00ll1 = Collections.unmodifiableList(this.I00ll1);
/* 127 */               i = this.I00iio & (-129);
/* 129 */               this.I00iio = i;
                    }
/* 133 */           oOi0IOIIOO.I00li1OI = this.I00ll1;
/* 139 */           if ((i & Barcode.FORMAT_QR_CODE) == 256) {
/* 147 */               this.I00lli11 = Collections.unmodifiableList(this.I00lli11);
/* 151 */               i = this.I00iio & (-257);
/* 153 */               this.I00iio = i;
                    }
/* 157 */           oOi0IOIIOO.I00ll1 = this.I00lli11;
/* 162 */           if ((i & Barcode.FORMAT_UPC_A) == 512) {
/* 170 */               this.I00lll10 = Collections.unmodifiableList(this.I00lll10);
                        this.I00iio &= -513;
                    }
/* 180 */           oOi0IOIIOO.I00lli11 = this.I00lll10;
/* 182 */           oOi0IOIIOO.I00iiO = i3;
/* 541 */           return oOi0IOIIOO;
                }

                public final void I000OOo1O(OOi0IOIIOO oOi0IOIIOO) {
                    OOi001oo1OOI oOi001oo1OOI;
                    OOi001oo1OOI oOi001oo1OOI2;
/* 3 */             if (oOi0IOIIOO == OOi0IOIIOO.I00o0l1o1o0) {
/* 5 */                 return;
                    }
/* 6 */             int i = oOi0IOIIOO.I00iiO;
/* 11 */            if ((i & 1) == 1) {
/* 13 */                int i2 = oOi0IOIIOO.I00iio;
/* 18 */                this.I00iio = 1 | this.I00iio;
/* 20 */                this.I00ilI0I1 = i2;
                    }
/* 24 */            if ((i & 2) == 2) {
/* 26 */                int i3 = oOi0IOIIOO.I00ilI0I1;
/* 31 */                this.I00iio = 2 | this.I00iio;
/* 33 */                this.I00ilO0 = i3;
                    }
/* 42 */            if (!oOi0IOIIOO.I00ilO0.isEmpty()) {
/* 50 */                if (this.I00io1l.isEmpty()) {
/* 54 */                    this.I00io1l = oOi0IOIIOO.I00ilO0;
                            this.I00iio &= -5;
                        } else {
/* 66 */                    if ((this.I00iio & 4) != 4) {
/* 75 */                        this.I00io1l = new ArrayList(this.I00io1l);
                                this.I00iio |= 4;
                            }
/* 86 */                    this.I00io1l.addAll(oOi0IOIIOO.I00ilO0);
                        }
                    }
/* 94 */            if ((oOi0IOIIOO.I00iiO & 4) == 4) {
/* 96 */                OOi001oo1OOI oOi001oo1OOI3 = oOi0IOIIOO.I00io1l;
/* 101 */               if ((this.I00iio & 8) != 8 || (oOi001oo1OOI2 = this.I00ioIO) == OOi001oo1OOI.I00oO101o) {
/* 123 */                   this.I00ioIO = oOi001oo1OOI3;
                        } else {
/* 109 */                   OOOoooI oOOoooII0010o = OOi001oo1OOI.I0010o(oOi001oo1OOI2);
/* 113 */                   oOOoooII0010o.I000OOo1O(oOi001oo1OOI3);
/* 120 */                   this.I00ioIO = oOOoooII0010o.I000II();
                        }
                        this.I00iio |= 8;
                    }
/* 130 */           int i4 = oOi0IOIIOO.I00iiO;
/* 136 */           if ((i4 & 8) == 8) {
/* 138 */               int i5 = oOi0IOIIOO.I00ioIO;
                        this.I00iio |= 16;
/* 145 */               this.I00l0I0l0lO1 = i5;
                    }
/* 150 */           if ((i4 & 16) == 16) {
/* 152 */               OOi001oo1OOI oOi001oo1OOI4 = oOi0IOIIOO.I00l0I0l0lO1;
/* 157 */               if ((this.I00iio & 32) != 32 || (oOi001oo1OOI = this.I00l0OO0IO) == OOi001oo1OOI.I00oO101o) {
/* 179 */                   this.I00l0OO0IO = oOi001oo1OOI4;
                        } else {
/* 165 */                   OOOoooI oOOoooII0010o2 = OOi001oo1OOI.I0010o(oOi001oo1OOI);
/* 169 */                   oOOoooII0010o2.I000OOo1O(oOi001oo1OOI4);
/* 176 */                   this.I00l0OO0IO = oOOoooII0010o2.I000II();
                        }
                        this.I00iio |= 32;
                    }
/* 189 */           if ((oOi0IOIIOO.I00iiO & 32) == 32) {
/* 191 */               int i6 = oOi0IOIIOO.I00l0OO0IO;
                        this.I00iio |= 64;
/* 199 */               this.I00li1OI = i6;
                    }
/* 207 */           if (!oOi0IOIIOO.I00li1OI.isEmpty()) {
/* 215 */               if (this.I00ll1.isEmpty()) {
/* 219 */                   this.I00ll1 = oOi0IOIIOO.I00li1OI;
                            this.I00iio &= -129;
                        } else {
/* 233 */                   if ((this.I00iio & Barcode.FORMAT_ITF) != 128) {
/* 242 */                       this.I00ll1 = new ArrayList(this.I00ll1);
                                this.I00iio |= Barcode.FORMAT_ITF;
                            }
/* 253 */                   this.I00ll1.addAll(oOi0IOIIOO.I00li1OI);
                        }
                    }
/* 262 */           if (!oOi0IOIIOO.I00ll1.isEmpty()) {
/* 270 */               if (this.I00lli11.isEmpty()) {
/* 274 */                   this.I00lli11 = oOi0IOIIOO.I00ll1;
                            this.I00iio &= -257;
                        } else {
/* 288 */                   if ((this.I00iio & Barcode.FORMAT_QR_CODE) != 256) {
/* 297 */                       this.I00lli11 = new ArrayList(this.I00lli11);
                                this.I00iio |= Barcode.FORMAT_QR_CODE;
                            }
/* 308 */                   this.I00lli11.addAll(oOi0IOIIOO.I00ll1);
                        }
                    }
/* 317 */           if (!oOi0IOIIOO.I00lli11.isEmpty()) {
/* 325 */               if (this.I00lll10.isEmpty()) {
/* 329 */                   this.I00lll10 = oOi0IOIIOO.I00lli11;
                            this.I00iio &= -513;
                        } else {
/* 343 */                   if ((this.I00iio & Barcode.FORMAT_UPC_A) != 512) {
/* 352 */                       this.I00lll10 = new ArrayList(this.I00lll10);
                                this.I00iio |= Barcode.FORMAT_UPC_A;
                            }
/* 363 */                   this.I00lll10.addAll(oOi0IOIIOO.I00lli11);
                        }
                    }
/* 366 */           I0001Ioi1lo(oOi0IOIIOO);
/* 377 */           this.I00iOIl = this.I00iOIl.I0000O(oOi0IOIIOO.I00iiI);
                }

                public final Object clone() {
/* 1 */             OOi00iIO oOi00iIOI000O01llI0 = I000O01llI0();
/* 9 */             oOi00iIOI000O01llI0.I000OOo1O(I000II());
/* 29 */            return oOi00iIOI000O01llI0;
                }
            }

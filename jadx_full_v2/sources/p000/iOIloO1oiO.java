            package p000;

            import android.graphics.Bitmap;
            import com.google.mlkit.vision.barcode.common.Barcode;
            import java.lang.invoke.VarHandle;
            import kotlin.jvm.functions.Function1;
            
            public abstract class iOIloO1oiO {
                /* JADX WARN: Removed duplicated region for block: B:50:0x0079  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public static final void I00000oIO(OIOlil0i oIOlil0i, I0iolI1I11l1 i0iolI1I11l1, IOii1l iOii1l, IloI0lOlll1 iloI0lOlll1, int i) {
                    int i2;
/* 5 */             iloI0lOlll1.I00i0O(-1090171650);
/* 11 */            if ((i & 6) == 0) {
/* 31 */                i2 = ((i & 8) == 0 ? iloI0lOlll1.I000II(oIOlil0i) : iloI0lOlll1.I000OOo1O(oIOlil0i) ? 4 : 2) | i;
                    } else {
/* 33 */                i2 = i;
                    }
/* 38 */            if ((i & 48) == 0) {
/* 50 */                i2 |= iloI0lOlll1.I000II(i0iolI1I11l1) ? 32 : 16;
                    }
/* 53 */            if ((i & 384) == 0) {
/* 66 */                i2 |= iloI0lOlll1.I000OOo1O(iOii1l) ? Barcode.FORMAT_QR_CODE : Barcode.FORMAT_ITF;
                    }
/* 72 */            int i3 = 1;
/* 84 */            if (iloI0lOlll1.I00OIl(i2 & 1, (i2 & 147) != 146)) {
/* 111 */               boolean z = ((i2 & 14) == 4 || ((i2 & 8) != 0 && iloI0lOlll1.I000II(oIOlil0i))) | ((i2 & 112) == 32);
/* 112 */               Object objI00O0i0ii = iloI0lOlll1.I00O0i0ii();
/* 116 */               if (!z) {
                            Object obj = objI00O0i0ii;
/* 120 */                   if (objI00O0i0ii == IOl11li.I00000oIO) {
/* 124 */                       Io11Oo io11Oo = new Io11Oo();
/* 127 */                       io11Oo.I00iOIl = i0iolI1I11l1;
/* 129 */                       io11Oo.I00iiI = oIOlil0i;
/* 133 */                       io11Oo.I00iiO = 0L;
/* 135 */                       VarHandle.storeStoreFence();
/* 138 */                       iloI0lOlll1.I00iio(io11Oo);
                                obj = io11Oo;
                            }
/* 162 */                   I0olo0.I00000oIO((Io11Oo) obj, null, new OO1loiii(false, Oii0IOl.I00iOIl, false), iOii1l, iloI0lOlll1, ((i2 << 3) & 7168) | 384, 2);
                        }
                    } else {
/* 166 */               iloI0lOlll1.I00OilO00Il();
                    }
/* 169 */           OOloioIl oOloioIlI001IO000 = iloI0lOlll1.I001IO000();
/* 173 */           if (oOloioIlI001IO000 != null) {
/* 177 */               I0IliiililIo i0IliiililIo = new I0IliiililIo(i3);
/* 180 */               i0IliiililIo.I00iiO = oIOlil0i;
/* 182 */               i0IliiililIo.I00iio = i0iolI1I11l1;
/* 184 */               i0IliiililIo.I00ilI0I1 = iOii1l;
/* 186 */               i0IliiililIo.I00iiI = i;
/* 188 */               VarHandle.storeStoreFence();
/* 191 */               oOloioIlI001IO000.I0000O = i0IliiililIo;
                    }
                }

                /* JADX WARN: Removed duplicated region for block: B:72:0x00cf  */
                /* JADX WARN: Removed duplicated region for block: B:73:0x00d1  */
                /* JADX WARN: Removed duplicated region for block: B:94:0x0105  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public static final void I00000oOI(OIOlil0i oIOlil0i, boolean z, Oi0il01O01IO oi0il01O01IO, boolean z2, long j, float f, O1ooiI111i o1ooiI111i, IloI0lOlll1 iloI0lOlll1, int i) {
                    int i2;
                    long j2;
                    int i3;
                    boolean z3;
/* 18 */            iloI0lOlll1.I00i0O(-466280168);
/* 24 */            if ((i & 6) == 0) {
/* 44 */                i2 = ((i & 8) == 0 ? iloI0lOlll1.I000II(oIOlil0i) : iloI0lOlll1.I000OOo1O(oIOlil0i) ? 4 : 2) | i;
                    } else {
/* 46 */                i2 = i;
                    }
/* 51 */            if ((i & 48) == 0) {
/* 63 */                i2 |= iloI0lOlll1.I000O01llI0(z) ? 32 : 16;
                    }
/* 66 */            if ((i & 384) == 0) {
/* 83 */                i2 |= iloI0lOlll1.I0000oI00(oi0il01O01IO.ordinal()) ? Barcode.FORMAT_QR_CODE : Barcode.FORMAT_ITF;
                    }
/* 86 */            if ((i & 3072) == 0) {
/* 99 */                i2 |= iloI0lOlll1.I000O01llI0(z2) ? Barcode.FORMAT_PDF417 : Barcode.FORMAT_UPC_E;
                    }
/* 102 */           if ((i & 24576) == 0) {
/* 104 */               i2 |= 8192;
                    }
/* 109 */           if ((1572864 & i) == 0) {
/* 122 */               i2 |= iloI0lOlll1.I000II(o1ooiI111i) ? 1048576 : 524288;
                    }
/* 142 */           if (iloI0lOlll1.I00OIl(i2 & 1, (533651 & i2) != 533650)) {
/* 144 */               iloI0lOlll1.I00Ol00();
/* 152 */               if ((i & 1) == 0 || iloI0lOlll1.I001lloI()) {
/* 168 */                   i3 = i2 & (-57345);
/* 169 */                   j2 = 9205357640488583168L;
                        } else {
/* 161 */                   iloI0lOlll1.I00OilO00Il();
/* 164 */                   i3 = i2 & (-57345);
/* 165 */                   j2 = j;
                        }
/* 174 */               iloI0lOlll1.I0010o();
/* 177 */               if (z) {
/* 179 */                   Oil0IoooOio oil0IoooOio = Oiil1O.I00000oIO;
/* 210 */                   z3 = (oi0il01O01IO == Oi0il01O01IO.I00iOIl && !z2) || (oi0il01O01IO == Oi0il01O01IO.I00iiI && z2);
                        } else {
/* 194 */                   Oil0IoooOio oil0IoooOio2 = Oiil1O.I00000oIO;
/* 198 */                   if ((oi0il01O01IO != Oi0il01O01IO.I00iOIl || z2) && (oi0il01O01IO != Oi0il01O01IO.I00iiI || !z2)) {
                            }
                        }
/* 216 */               II0Il1o iI0Il1o = z3 ? I0iilI1i0i.I00000oOI : I0iilI1i0i.I00000oIO;
/* 218 */               int i4 = i3 & 14;
/* 251 */               boolean zI000O01llI0 = (i4 == 4 || ((i3 & 8) != 0 && iloI0lOlll1.I000OOo1O(oIOlil0i))) | ((i3 & 112) == 32) | iloI0lOlll1.I000O01llI0(z3);
/* 252 */               Object objI00O0i0ii = iloI0lOlll1.I00O0i0ii();
/* 256 */               if (!zI000O01llI0) {
                            Object obj = objI00O0i0ii;
/* 260 */                   if (objI00O0i0ii == IOl11li.I00000oIO) {
/* 264 */                       I0ooI00 i0ooI00 = new I0ooI00();
/* 267 */                       i0ooI00.I00iOIl = oIOlil0i;
/* 269 */                       i0ooI00.I00iiI = z;
/* 271 */                       i0ooI00.I00iiO = z3;
/* 273 */                       VarHandle.storeStoreFence();
/* 276 */                       iloI0lOlll1.I00iio(i0ooI00);
                                obj = i0ooI00;
                            }
/* 281 */                   O1ooiI111i o1ooiI111iI00000oOI = OiioloIlOlIi.I00000oOI(o1ooiI111i, false, (Function1) obj);
/* 291 */                   Oooii1o1 oooii1o1 = (Oooii1o1) iloI0lOlll1.I000iOII(IOlO0o100i1i.I00111O);
/* 295 */                   I0ooIIliii10 i0ooIIliii10 = new I0ooIIliii10();
/* 298 */                   i0ooIIliii10.I00iOIl = oooii1o1;
/* 300 */                   i0ooIIliii10.I00iiI = j2;
/* 302 */                   i0ooIIliii10.I00iiO = z3;
/* 304 */                   i0ooIIliii10.I00iio = o1ooiI111iI00000oOI;
/* 306 */                   i0ooIIliii10.I00ilI0I1 = oIOlil0i;
/* 308 */                   VarHandle.storeStoreFence();
/* 320 */                   I00000oIO(oIOlil0i, iI0Il1o, iiioOl1O.I00000oOI(1365123137, i0ooIIliii10, iloI0lOlll1), iloI0lOlll1, i4 | 384);
                        }
                    } else {
/* 324 */               iloI0lOlll1.I00OilO00Il();
/* 327 */               j2 = j;
                    }
/* 329 */           OOloioIl oOloioIlI001IO000 = iloI0lOlll1.I001IO000();
/* 333 */           if (oOloioIlI001IO000 != null) {
/* 337 */               I0ooIoI11iO i0ooIoI11iO = new I0ooIoI11iO();
/* 340 */               i0ooIoI11iO.I00iOIl = oIOlil0i;
/* 342 */               i0ooIoI11iO.I00iiI = z;
/* 344 */               i0ooIoI11iO.I00iiO = oi0il01O01IO;
/* 346 */               i0ooIoI11iO.I00iio = z2;
/* 348 */               i0ooIoI11iO.I00ilI0I1 = j2;
/* 352 */               i0ooIoI11iO.I00ilO0 = f;
/* 354 */               i0ooIoI11iO.I00io1l = o1ooiI111i;
/* 356 */               i0ooIoI11iO.I00ioIO = i;
/* 358 */               VarHandle.storeStoreFence();
/* 361 */               oOloioIlI001IO000.I0000O = i0ooIoI11iO;
                    }
                }

                public static final void I0000Il00O(O1ooiI111i o1ooiI111i, IllOOo00lI illOOo00lI, boolean z, IloI0lOlll1 iloI0lOlll1, int i) {
                    int i2;
/* 4 */             iloI0lOlll1.I00i0O(2111672474);
/* 9 */             if ((i & 6) == 0) {
/* 20 */                i2 = (iloI0lOlll1.I000II(o1ooiI111i) ? 4 : 2) | i;
                    } else {
/* 22 */                i2 = i;
                    }
/* 46 */            int i3 = i2 | (iloI0lOlll1.I000OOo1O(illOOo00lI) ? 32 : 16) | (iloI0lOlll1.I000O01llI0(z) ? Barcode.FORMAT_QR_CODE : Barcode.FORMAT_ITF);
/* 51 */            int i4 = 0;
/* 63 */            if (iloI0lOlll1.I00OIl(i3 & 1, (i3 & 147) != 146)) {
/* 65 */                Oil0IoooOio oil0IoooOio = Oiil1O.I00000oIO;
/* 69 */                O1ooiI111i o1ooiI111iI000o00OoI0I = Ol0iOOO0.I000o00OoI0I(o1ooiI111i, 25.0f, 25.0f);
/* 75 */                I0oooI i0oooI = new I0oooI(i4);
/* 78 */                i0oooI.I00iiI = illOOo00lI;
/* 80 */                i0oooI.I00iiO = z;
/* 82 */                VarHandle.storeStoreFence();
/* 89 */                lOO1OIO00.I00000oIO(iloI0lOlll1, iilOllOlO1.I00000oIO(o1ooiI111iI000o00OoI0I, i0oooI));
                    } else {
/* 93 */                iloI0lOlll1.I00OilO00Il();
                    }
/* 96 */            OOloioIl oOloioIlI001IO000 = iloI0lOlll1.I001IO000();
/* 100 */           if (oOloioIlI001IO000 != null) {
/* 104 */               I0oololOOll1 i0oololOOll1 = new I0oololOOll1(i4);
/* 107 */               i0oololOOll1.I00iio = o1ooiI111i;
/* 109 */               i0oololOOll1.I00ilI0I1 = illOOo00lI;
/* 111 */               i0oololOOll1.I00iiI = z;
/* 113 */               i0oololOOll1.I00iiO = i;
/* 115 */               VarHandle.storeStoreFence();
/* 118 */               oOloioIlI001IO000.I0000O = i0oololOOll1;
                    }
                }

                /* JADX WARN: Removed duplicated region for block: B:11:0x0029  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public static final I0oO00o I0000O(IIi11Illi1I iIi11Illi1I, float f) {
/* 12 */            int iCeil = ((int) Math.ceil(f)) * 2;
/* 14 */            I0oO00o i0oO00oI00000oIO = illIo1lI.I00000oIO;
/* 16 */            I0lIooIo1 i0lIooIo1I00000oIO = illIo1lI.I00000oOI;
/* 18 */            IIolilIo iIolilIo = illIo1lI.I0000Il00O;
/* 20 */            if (i0oO00oI00000oIO == null || i0lIooIo1I00000oIO == null) {
/* 43 */                i0oO00oI00000oIO = ioIIOlOIO0.I00000oIO(iCeil, iCeil, 1);
/* 47 */                illIo1lI.I00000oIO = i0oO00oI00000oIO;
/* 49 */                i0lIooIo1I00000oIO = I0lO01i00oi.I00000oIO(i0oO00oI00000oIO);
/* 53 */                illIo1lI.I00000oOI = i0lIooIo1I00000oIO;
                    } else {
/* 24 */                Bitmap bitmap = i0oO00oI00000oIO.I00000oIO;
/* 30 */                if (iCeil > bitmap.getWidth() || iCeil > bitmap.getHeight()) {
                        }
                    }
/* 39 */            I0oO00o i0oO00o = i0oO00oI00000oIO;
/* 40 */            I0lIooIo1 i0lIooIo1 = i0lIooIo1I00000oIO;
/* 56 */            if (iIolilIo == null) {
/* 60 */                iIolilIo = new IIolilIo();
/* 63 */                illIo1lI.I0000Il00O = iIolilIo;
                    }
/* 65 */            IIolilIo iIolilIo2 = iIolilIo;
/* 66 */            IIolil1 iIolil1 = iIolilIo2.I00iOIl;
/* 70 */            O0iOOoiioO layoutDirection = iIi11Illi1I.I00iOIl.getLayoutDirection();
/* 74 */            Bitmap bitmap2 = i0oO00o.I00000oIO;
/* 76 */            float width = bitmap2.getWidth();
/* 81 */            float height = bitmap2.getHeight();
/* 107 */           IiIooOOOI iiIooOOOI = iIolil1.I00000oIO;
/* 109 */           O0iOOoiioO o0iOOoiioO = iIolil1.I00000oOI;
/* 111 */           IIolOo iIolOo = iIolil1.I0000Il00O;
/* 113 */           long j = iIolil1.I0000O;
/* 115 */           iIolil1.I00000oIO = iIi11Illi1I;
/* 117 */           iIolil1.I00000oOI = layoutDirection;
/* 119 */           iIolil1.I0000Il00O = i0lIooIo1;
/* 121 */           iIolil1.I0000O = (Float.floatToRawIntBits(width) << 32) | (Float.floatToRawIntBits(height) & 4294967295L);
/* 123 */           i0lIooIo1.I000II();
/* 145 */           IilloIOOO0i.I00ilI0I1(iIolilIo2, IOOiio0i.I00000oOI, 0L, iIolilIo2.I0000oI00(), 0.0f, null, 0, 58);
/* 181 */           IilloIOOO0i.I00ilI0I1(iIolilIo2, iiO01ll11o1l.I0000Il00O(4278190080L), 0L, (Float.floatToRawIntBits(f) << 32) | (Float.floatToRawIntBits(f) & 4294967295L), 0.0f, null, 0, 120);
/* 218 */           IilloIOOO0i.I00iiO(iIolilIo2, iiO01ll11o1l.I0000Il00O(4278190080L), f, (Float.floatToRawIntBits(f) << 32) | (Float.floatToRawIntBits(f) & 4294967295L), null, 120);
/* 221 */           i0lIooIo1.I00100l0();
/* 224 */           iIolil1.I00000oIO = iiIooOOOI;
/* 226 */           iIolil1.I00000oOI = o0iOOoiioO;
/* 228 */           iIolil1.I0000Il00O = iIolOo;
/* 230 */           iIolil1.I0000O = j;
/* 332 */           return i0oO00o;
                }
            }

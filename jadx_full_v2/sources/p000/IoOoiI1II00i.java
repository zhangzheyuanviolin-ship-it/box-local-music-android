            package p000;

            import android.graphics.BlendModeColorFilter;
            import com.google.mlkit.vision.barcode.common.Barcode;
            import java.lang.invoke.VarHandle;
            import kotlin.jvm.functions.Function1;
            
            public abstract class IoOoiI1II00i {
                public static final O1ooiI111i I00000oIO = Ol0iOOO0.I000lI(O1ooIo101ll.I00000oIO, Ol11ooiiI11.I0000Il00O);

                public static final void I00000oIO(IoiOolO1iOo ioiOolO1iOo, String str, O1ooiI111i o1ooiI111i, long j, IloI0lOlll1 iloI0lOlll1, int i, int i2) {
                    int i3;
                    long j2;
                    long j3;
                    O1ooiI111i o1ooiI111i2;
/* 10 */            iloI0lOlll1.I00i0O(-126890956);
/* 15 */            if ((i & 6) == 0) {
/* 26 */                i3 = (iloI0lOlll1.I000II(ioiOolO1iOo) ? 4 : 2) | i;
                    } else {
/* 28 */                i3 = i;
                    }
/* 31 */            if ((i & 48) == 0) {
/* 44 */                i3 |= iloI0lOlll1.I000II(str) ? 32 : 16;
                    }
/* 45 */            int i4 = i2 & 4;
/* 47 */            if (i4 != 0) {
/* 49 */                i3 |= 384;
                    } else if ((i & 384) == 0) {
/* 67 */                i3 |= iloI0lOlll1.I000II(o1ooiI111i) ? Barcode.FORMAT_QR_CODE : Barcode.FORMAT_ITF;
                    }
/* 70 */            if ((i & 3072) == 0) {
/* 87 */                i3 |= ((i2 & 8) == 0 && iloI0lOlll1.I0001Ioi1lo(j)) ? Barcode.FORMAT_PDF417 : Barcode.FORMAT_UPC_E;
                    }
/* 92 */            int i5 = 0;
/* 104 */           if (iloI0lOlll1.I00OIl(i3 & 1, (i3 & 1171) != 1170)) {
/* 106 */               iloI0lOlll1.I00Ol00();
/* 111 */               if ((i & 1) == 0 || iloI0lOlll1.I001lloI()) {
/* 132 */                   if (i4 != 0) {
/* 134 */                       o1ooiI111i = O1ooIo101ll.I00000oIO;
                            }
/* 138 */                   if ((i2 & 8) != 0) {
/* 150 */                       i3 &= -7169;
/* 148 */                       j3 = ((IOOiio0i) iloI0lOlll1.I000iOII(IOoIioIOoolI.I00000oIO)).I00000oIO;
/* 153 */                       o1ooiI111i2 = o1ooiI111i;
                            }
/* 154 */                   iloI0lOlll1.I0010o();
/* 176 */                   I00000oOI(li1OOO.I00000oOI(ioiOolO1iOo, iloI0lOlll1), str, o1ooiI111i2, j3, iloI0lOlll1, (i3 & 112) | 8 | (i3 & 896) | (i3 & 7168), 0);
/* 179 */                   o1ooiI111i = o1ooiI111i2;
/* 180 */                   j2 = j3;
                        } else {
/* 120 */                   iloI0lOlll1.I00OilO00Il();
/* 125 */                   if ((i2 & 8) != 0) {
/* 127 */                       i3 &= -7169;
                            }
                        }
/* 129 */               o1ooiI111i2 = o1ooiI111i;
/* 130 */               j3 = j;
/* 154 */               iloI0lOlll1.I0010o();
/* 176 */               I00000oOI(li1OOO.I00000oOI(ioiOolO1iOo, iloI0lOlll1), str, o1ooiI111i2, j3, iloI0lOlll1, (i3 & 112) | 8 | (i3 & 896) | (i3 & 7168), 0);
/* 179 */               o1ooiI111i = o1ooiI111i2;
/* 180 */               j2 = j3;
                    } else {
/* 182 */               iloI0lOlll1.I00OilO00Il();
/* 185 */               j2 = j;
                    }
/* 186 */           OOloioIl oOloioIlI001IO000 = iloI0lOlll1.I001IO000();
/* 190 */           if (oOloioIlI001IO000 != null) {
/* 194 */               IoOo1OOiiIl ioOo1OOiiIl = new IoOo1OOiiIl(i5);
/* 197 */               ioOo1OOiiIl.I00io1l = ioiOolO1iOo;
/* 199 */               ioOo1OOiiIl.I00iiI = str;
/* 201 */               ioOo1OOiiIl.I00iiO = o1ooiI111i;
/* 203 */               ioOo1OOiiIl.I00iio = j2;
/* 205 */               ioOo1OOiiIl.I00ilI0I1 = i;
/* 207 */               ioOo1OOiiIl.I00ilO0 = i2;
/* 209 */               VarHandle.storeStoreFence();
/* 212 */               oOloioIlI001IO000.I0000O = ioOo1OOiiIl;
                    }
                }

                /* JADX WARN: Removed duplicated region for block: B:101:0x0194  */
                /* JADX WARN: Removed duplicated region for block: B:103:? A[RETURN, SYNTHETIC] */
                /* JADX WARN: Removed duplicated region for block: B:33:0x005a  */
                /* JADX WARN: Removed duplicated region for block: B:40:0x006c  */
                /* JADX WARN: Removed duplicated region for block: B:43:0x0074  */
                /* JADX WARN: Removed duplicated region for block: B:44:0x0076  */
                /* JADX WARN: Removed duplicated region for block: B:47:0x007f  */
                /* JADX WARN: Removed duplicated region for block: B:71:0x00ce A[ADDED_TO_REGION] */
                /* JADX WARN: Removed duplicated region for block: B:72:0x00d0  */
                /* JADX WARN: Removed duplicated region for block: B:74:0x00d8  */
                /* JADX WARN: Removed duplicated region for block: B:76:0x00db  */
                /* JADX WARN: Removed duplicated region for block: B:80:0x00fd  */
                /* JADX WARN: Removed duplicated region for block: B:89:0x012f  */
                /* JADX WARN: Removed duplicated region for block: B:92:0x0149  */
                /* JADX WARN: Removed duplicated region for block: B:96:0x016d  */
                /* JADX WARN: Removed duplicated region for block: B:98:0x0189  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public static final void I00000oOI(OIoOo11 oIoOo11, String str, O1ooiI111i o1ooiI111i, long j, IloI0lOlll1 iloI0lOlll1, int i, int i2) {
                    int i3;
                    O1ooiI111i o1ooiI111i2;
                    long j2;
                    long j3;
                    O1ooiI111i o1ooiI111i3;
                    OOloioIl oOloioIlI001IO000;
                    long j4;
                    boolean z;
                    Object objI00O0i0ii;
                    II0oIl iI0oIl;
                    O1ooiI111i o1ooiI111i4;
/* 14 */            iloI0lOlll1.I00i0O(-2142239481);
/* 19 */            if ((i & 6) == 0) {
/* 39 */                i3 = ((i & 8) == 0 ? iloI0lOlll1.I000II(oIoOo11) : iloI0lOlll1.I000OOo1O(oIoOo11) ? 4 : 2) | i;
                    } else {
/* 41 */                i3 = i;
                    }
/* 44 */            if ((i & 48) == 0) {
/* 57 */                i3 |= iloI0lOlll1.I000II(str) ? 32 : 16;
                    }
/* 58 */            int i4 = i2 & 4;
/* 60 */            if (i4 == 0) {
/* 69 */                if ((i & 384) == 0) {
/* 71 */                    o1ooiI111i2 = o1ooiI111i;
/* 84 */                    i3 |= iloI0lOlll1.I000II(o1ooiI111i2) ? Barcode.FORMAT_QR_CODE : Barcode.FORMAT_ITF;
                        }
/* 89 */                if ((i & 3072) != 0) {
/* 93 */                    j2 = j;
/* 107 */                   i3 |= ((i2 & 8) == 0 && iloI0lOlll1.I0001Ioi1lo(j2)) ? 2048 : Barcode.FORMAT_UPC_E;
                        } else {
/* 109 */                   j2 = j;
                        }
/* 126 */               if (iloI0lOlll1.I00OIl(i3 & 1, (i3 & 1171) == 1170)) {
/* 394 */                   iloI0lOlll1.I00OilO00Il();
/* 397 */                   j3 = j2;
/* 398 */                   o1ooiI111i3 = o1ooiI111i2;
                        } else {
/* 128 */                   iloI0lOlll1.I00Ol00();
/* 131 */                   int i5 = i & 1;
/* 133 */                   O1ooiI111i o1ooiI111i5 = O1ooIo101ll.I00000oIO;
/* 135 */                   if (i5 == 0 || iloI0lOlll1.I001lloI()) {
/* 159 */                       if (i4 != 0) {
/* 161 */                           o1ooiI111i2 = o1ooiI111i5;
                                }
/* 164 */                       if ((i2 & 8) != 0) {
/* 174 */                           j2 = ((IOOiio0i) iloI0lOlll1.I000iOII(IOoIioIOoolI.I00000oIO)).I00000oIO;
/* 151 */                           i3 &= -7169;
                                }
/* 153 */                       j4 = j2;
/* 155 */                       o1ooiI111i3 = o1ooiI111i2;
/* 177 */                       iloI0lOlll1.I0010o();
/* 198 */                       z = (((i3 & 7168) ^ 3072) <= 2048 && iloI0lOlll1.I0001Ioi1lo(j4)) || (i3 & 3072) == 2048;
/* 199 */                       objI00O0i0ii = iloI0lOlll1.I00O0i0ii();
/* 203 */                       Object obj = IOl11li.I00000oIO;
/* 205 */                       if (z || objI00O0i0ii == obj) {
/* 215 */                           if (Ooi0i1.I00000oOI(j4, IOOiio0i.I000o00OoI0I)) {
/* 236 */                               iI0oIl = new II0oIl(new BlendModeColorFilter(iiO01ll11o1l.I000OOo1O(j4), iOIill.I00000oIO(5)));
/* 239 */                               iI0oIl.I00000oOI = j4;
/* 241 */                               iI0oIl.I0000Il00O = 5;
/* 243 */                               VarHandle.storeStoreFence();
                                    } else {
/* 217 */                               iI0oIl = null;
                                    }
/* 218 */                           objI00O0i0ii = iI0oIl;
/* 247 */                           iloI0lOlll1.I00iio(objI00O0i0ii);
                                }
/* 250 */                       IOOil0 iOOil0 = (IOOil0) objI00O0i0ii;
/* 252 */                       if (str == null) {
/* 257 */                           iloI0lOlll1.I00i01iIIliI(-537002883);
/* 268 */                           boolean z2 = (i3 & 112) == 32;
/* 269 */                           Object objI00O0i0ii2 = iloI0lOlll1.I00O0i0ii();
                                    Object obj2 = objI00O0i0ii2;
/* 273 */                           if (z2 || objI00O0i0ii2 == obj) {
/* 281 */                               I0ioO0Oio0ll i0ioO0Oio0ll = new I0ioO0Oio0ll(18);
/* 284 */                               i0ioO0Oio0ll.I00iiI = str;
/* 286 */                               VarHandle.storeStoreFence();
/* 289 */                               iloI0lOlll1.I00iio(i0ioO0Oio0ll);
                                        obj2 = i0ioO0Oio0ll;
                                    }
/* 295 */                           O1ooiI111i o1ooiI111iI00000oOI = OiioloIlOlIi.I00000oOI(o1ooiI111i5, false, (Function1) obj2);
/* 299 */                           iloI0lOlll1.I0010I0i(false);
/* 302 */                           o1ooiI111i4 = o1ooiI111iI00000oOI;
                                } else {
/* 308 */                           iloI0lOlll1.I00i01iIIliI(-536844101);
/* 311 */                           iloI0lOlll1.I0010I0i(false);
/* 314 */                           o1ooiI111i4 = o1ooiI111i5;
                                }
/* 328 */                       if (Ol0i1I.I00000oOI(oIoOo11.I000OOo1O(), 9205357640488583168L)) {
/* 330 */                           long jI000OOo1O = oIoOo11.I000OOo1O();
/* 347 */                           if (Float.isInfinite(Float.intBitsToFloat((int) (jI000OOo1O >> 32))) && Float.isInfinite(Float.intBitsToFloat((int) (jI000OOo1O & 4294967295L)))) {
/* 366 */                               o1ooiI111i5 = I00000oIO;
                                    }
/* 368 */                           O1ooiI111i o1ooiI111iI0000O = o1ooiI111i3.I0000O(o1ooiI111i5);
/* 377 */                           j3 = j4;
/* 390 */                           II1oOI10.I00000oIO(iO01O00o.I00000oIO(o1ooiI111iI0000O, oIoOo11, null, IOoOIiOl1llI.I00000oOI, 0.0f, iOOil0, 22).I0000O(o1ooiI111i4), iloI0lOlll1, 0);
                                }
                            } else {
/* 144 */                       iloI0lOlll1.I00OilO00Il();
/* 149 */                       if ((i2 & 8) != 0) {
/* 151 */                           i3 &= -7169;
                                }
/* 153 */                       j4 = j2;
/* 155 */                       o1ooiI111i3 = o1ooiI111i2;
/* 177 */                       iloI0lOlll1.I0010o();
/* 198 */                       if (((i3 & 7168) ^ 3072) <= 2048) {
/* 199 */                           objI00O0i0ii = iloI0lOlll1.I00O0i0ii();
/* 203 */                           Object obj3 = IOl11li.I00000oIO;
/* 205 */                           if (z) {
/* 215 */                               if (Ooi0i1.I00000oOI(j4, IOOiio0i.I000o00OoI0I)) {
                                        }
/* 218 */                               objI00O0i0ii = iI0oIl;
/* 247 */                               iloI0lOlll1.I00iio(objI00O0i0ii);
/* 250 */                               IOOil0 iOOil02 = (IOOil0) objI00O0i0ii;
/* 252 */                               if (str == null) {
                                        }
/* 328 */                               if (Ol0i1I.I00000oOI(oIoOo11.I000OOo1O(), 9205357640488583168L)) {
                                        }
                                    }
                                } else {
/* 199 */                           objI00O0i0ii = iloI0lOlll1.I00O0i0ii();
/* 203 */                           Object obj32 = IOl11li.I00000oIO;
/* 205 */                           if (z) {
                                    }
                                }
                            }
                        }
/* 399 */               oOloioIlI001IO000 = iloI0lOlll1.I001IO000();
/* 403 */               if (oOloioIlI001IO000 == null) {
/* 408 */                   IoOo1OOiiIl ioOo1OOiiIl = new IoOo1OOiiIl(1);
/* 411 */                   ioOo1OOiiIl.I00io1l = oIoOo11;
/* 413 */                   ioOo1OOiiIl.I00iiI = str;
/* 415 */                   ioOo1OOiiIl.I00iiO = o1ooiI111i3;
/* 417 */                   ioOo1OOiiIl.I00iio = j3;
/* 419 */                   ioOo1OOiiIl.I00ilI0I1 = i;
/* 421 */                   ioOo1OOiiIl.I00ilO0 = i2;
/* 423 */                   VarHandle.storeStoreFence();
/* 426 */                   oOloioIlI001IO000.I0000O = ioOo1OOiiIl;
/* 965 */                   return;
                        }
/* 965 */               return;
                    }
/* 62 */            i3 |= 384;
/* 64 */            o1ooiI111i2 = o1ooiI111i;
/* 89 */            if ((i & 3072) != 0) {
                    }
/* 126 */           if (iloI0lOlll1.I00OIl(i3 & 1, (i3 & 1171) == 1170)) {
                    }
/* 399 */           oOloioIlI001IO000 = iloI0lOlll1.I001IO000();
/* 403 */           if (oOloioIlI001IO000 == null) {
                    }
                }
            }

            package p000;

            import com.google.mlkit.vision.barcode.common.Barcode;
            import java.lang.invoke.VarHandle;
            
            public abstract class Ol11ooI {
                public static final OIo1i1 I00000oIO = new OIo1i1(12.0f, 2.0f, 12.0f, 2.0f);

                /* JADX WARN: Removed duplicated region for block: B:23:0x003f  */
                /* JADX WARN: Removed duplicated region for block: B:30:0x0051  */
                /* JADX WARN: Removed duplicated region for block: B:32:0x0058  */
                /* JADX WARN: Removed duplicated region for block: B:41:0x0071  */
                /* JADX WARN: Removed duplicated region for block: B:43:0x0075  */
                /* JADX WARN: Removed duplicated region for block: B:52:0x0091  */
                /* JADX WARN: Removed duplicated region for block: B:53:0x0093  */
                /* JADX WARN: Removed duplicated region for block: B:56:0x009c  */
                /* JADX WARN: Removed duplicated region for block: B:65:0x00e9  */
                /* JADX WARN: Removed duplicated region for block: B:68:0x00f5  */
                /* JADX WARN: Removed duplicated region for block: B:70:? A[RETURN, SYNTHETIC] */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public static final void I00000oIO(IllOOo00lI illOOo00lI, int i, IoiOolO1iOo ioiOolO1iOo, float f, String str, boolean z, IloI0lOlll1 iloI0lOlll1, int i2, int i3) {
                    int i4;
                    int i5;
                    int i6;
                    int i7;
                    String str2;
                    int i8;
                    boolean z2;
                    float f2;
                    int i9;
                    OOloioIl oOloioIlI001IO000;
/* 14 */            iloI0lOlll1.I00i0O(-1340621513);
/* 19 */            if ((i2 & 6) == 0) {
/* 30 */                i4 = (iloI0lOlll1.I000OOo1O(illOOo00lI) ? 4 : 2) | i2;
                    } else {
/* 32 */                i4 = i2;
                    }
/* 33 */            int i10 = i3 & 2;
/* 35 */            if (i10 != 0) {
/* 37 */                i4 |= 48;
                    } else {
/* 44 */                if ((i2 & 48) == 0) {
/* 46 */                    i5 = i;
/* 59 */                    i4 |= iloI0lOlll1.I0000oI00(i5) ? 32 : 16;
                        }
/* 62 */                if ((i2 & 384) == 0) {
/* 75 */                    i4 |= iloI0lOlll1.I000II(ioiOolO1iOo) ? Barcode.FORMAT_QR_CODE : Barcode.FORMAT_ITF;
                        }
/* 76 */                i6 = i4 | 27648;
/* 78 */                i7 = i3 & 32;
/* 80 */                if (i7 == 0) {
/* 85 */                    i6 = 224256 | i4;
                        } else {
/* 92 */                    if ((196608 & i2) == 0) {
/* 94 */                        str2 = str;
/* 107 */                       i6 |= iloI0lOlll1.I000II(str2) ? 131072 : 65536;
                            }
/* 108 */                   i8 = i3 & 64;
/* 112 */                   if (i8 == 0) {
/* 119 */                       if ((1572864 & i2) == 0) {
/* 121 */                           z2 = z;
/* 134 */                           i6 |= iloI0lOlll1.I000O01llI0(z2) ? 1048576 : 524288;
                                }
/* 155 */                       if (iloI0lOlll1.I00OIl(i6 & 1, (599187 & i6) == 599186)) {
/* 234 */                           iloI0lOlll1.I00OilO00Il();
/* 237 */                           f2 = f;
/* 239 */                           i9 = i5;
                                } else {
/* 157 */                           i9 = i10 == 0 ? i5 : 0;
/* 161 */                           if (i7 != 0) {
/* 163 */                               str2 = null;
                                    }
/* 168 */                           boolean z3 = i8 != 0 ? true : z2;
/* 173 */                           O1ooiI111i o1ooiI111iI000II = Ol0iOOO0.I000II(O1ooIo101ll.I00000oIO, 32.0f);
/* 179 */                           Ol11l1lO ol11l1lO = new Ol11l1lO();
/* 182 */                           ol11l1lO.I00iOIl = ioiOolO1iOo;
/* 184 */                           f2 = 18.0f;
/* 186 */                           ol11l1lO.I00iiI = 18.0f;
/* 188 */                           ol11l1lO.I00iiO = str2;
/* 190 */                           ol11l1lO.I00iio = i9;
/* 192 */                           VarHandle.storeStoreFence();
/* 227 */                           iOiO0o0oi.I00000oOI(illOOo00lI, o1ooiI111iI000II, z3, null, null, null, I00000oIO, iiioOl1O.I00000oOI(-770310391, ol11l1lO, iloI0lOlll1), iloI0lOlll1, (i6 & 14) | 817889328 | ((i6 >> 12) & 896), 376);
/* 230 */                           z2 = z3;
/* 231 */                           str2 = str2;
                                }
/* 240 */                       oOloioIlI001IO000 = iloI0lOlll1.I001IO000();
/* 244 */                       if (oOloioIlI001IO000 == null) {
/* 248 */                           Ol11o011Il1 ol11o011Il1 = new Ol11o011Il1();
/* 251 */                           ol11o011Il1.I00iOIl = illOOo00lI;
/* 253 */                           ol11o011Il1.I00iiI = i9;
/* 255 */                           ol11o011Il1.I00iiO = ioiOolO1iOo;
/* 257 */                           ol11o011Il1.I00iio = f2;
/* 259 */                           ol11o011Il1.I00ilI0I1 = str2;
/* 261 */                           ol11o011Il1.I00ilO0 = z2;
/* 263 */                           ol11o011Il1.I00io1l = i2;
/* 265 */                           ol11o011Il1.I00ioIO = i3;
/* 267 */                           VarHandle.storeStoreFence();
/* 270 */                           oOloioIlI001IO000.I0000O = ol11o011Il1;
/* 1821 */                          return;
                                }
/* 1821 */                      return;
                            }
/* 114 */                   i6 |= 1572864;
/* 115 */                   z2 = z;
/* 155 */                   if (iloI0lOlll1.I00OIl(i6 & 1, (599187 & i6) == 599186)) {
                            }
/* 240 */                   oOloioIlI001IO000 = iloI0lOlll1.I001IO000();
/* 244 */                   if (oOloioIlI001IO000 == null) {
                            }
                        }
/* 86 */                str2 = str;
/* 108 */               i8 = i3 & 64;
/* 112 */               if (i8 == 0) {
                        }
/* 115 */               z2 = z;
/* 155 */               if (iloI0lOlll1.I00OIl(i6 & 1, (599187 & i6) == 599186)) {
                        }
/* 240 */               oOloioIlI001IO000 = iloI0lOlll1.I001IO000();
/* 244 */               if (oOloioIlI001IO000 == null) {
                        }
                    }
/* 39 */            i5 = i;
/* 62 */            if ((i2 & 384) == 0) {
                    }
/* 76 */            i6 = i4 | 27648;
/* 78 */            i7 = i3 & 32;
/* 80 */            if (i7 == 0) {
                    }
/* 86 */            str2 = str;
/* 108 */           i8 = i3 & 64;
/* 112 */           if (i8 == 0) {
                    }
/* 115 */           z2 = z;
/* 155 */           if (iloI0lOlll1.I00OIl(i6 & 1, (599187 & i6) == 599186)) {
                    }
/* 240 */           oOloioIlI001IO000 = iloI0lOlll1.I001IO000();
/* 244 */           if (oOloioIlI001IO000 == null) {
                    }
                }
            }

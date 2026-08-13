            package p000;

            import android.view.View;
            import android.view.contentcapture.ContentCaptureSession;
            import com.google.mlkit.vision.barcode.common.Barcode;
            import java.lang.invoke.VarHandle;
            
            public final class I0lii0I00 extends IlllollI implements IllOOo00lI {
                public final int I00ioIO;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public I0lii0I00(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
/* 8 */             super(i, i2, cls, obj, str, str2);
/* 1 */             this.I00ioIO = i3;
                }

                /* JADX WARN: Removed duplicated region for block: B:32:0x009a  */
                /* JADX WARN: Removed duplicated region for block: B:80:0x0152  */
                @Override
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object invoke() throws Exception {
                    IIlOoolol0ll iIlOoolol0ll;
/* 3 */             int i = this.I00ioIO;
/* 5 */             int i2 = 8;
/* 8 */             OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
/* 11 */            Object obj = this.I00iiI;
                    switch (i) {
                        case 0:
/* 426 */                   View view = (View) obj;
/* 428 */                   view.setImportantForContentCapture(1);
/* 431 */                   ContentCaptureSession contentCaptureSession = view.getContentCaptureSession();
/* 435 */                   if (contentCaptureSession == null) {
/* 10 */                        return null;
                            }
/* 440 */                   IoloOio0I ioloOio0I = new IoloOio0I(i2);
/* 443 */                   ioloOio0I.I00iiO = contentCaptureSession;
/* 445 */                   ioloOio0I.I00iiI = view;
/* 447 */                   VarHandle.storeStoreFence();
/* 450 */                   return ioloOio0I;
                        case 1:
/* 422 */                   ((Runnable) obj).run();
/* 425 */                   return ooiIlOl1iI;
                        case 2:
/* 382 */                   OlO0OIIl1 olO0OIIl1 = ((I1iOI11ioi1) obj).I00000oOI;
/* 416 */                   olO0OIIl1.I000lI(null, I1iO1loOII1.I00000oIO((I1iO1loOII1) olO0OIIl1.getValue(), I1iIll0i.I00iOIl, 0, null, 0, null, "", Il01100l.I00iOIl, Il011I1OiO0I.I00iOIl, null, 0.0f, null, null, 1822));
/* 419 */                   return ooiIlOl1iI;
                        case 3:
/* 375 */                   return ((Olol1IOOol0) obj).I00O10llo();
                        case 4:
/* 74 */                    Ili1O0oO00o ili1O0oO00o = (Ili1O0oO00o) obj;
/* 76 */                    OI10IIO oi10iio = ili1O0oO00o.I0000Il00O;
/* 78 */                    OI10IIO oi10iio2 = ili1O0oO00o.I0000O;
/* 80 */                    Ili1ioOlo0oO ili1ioOlo0oO = ili1O0oO00o.I00000oIO;
/* 82 */                    IliIO10oO0 iliIO10oO0I000II = ili1ioOlo0oO.I000II();
/* 88 */                    if (iliIO10oO0I000II == null) {
/* 90 */                        Object[] objArr = oi10iio2.I00000oOI;
/* 92 */                        long[] jArr = oi10iio2.I00000oIO;
                                int length = jArr.length - 2;
/* 97 */                        if (length >= 0) {
/* 99 */                            int i3 = 0;
                                    while (true) {
/* 102 */                               long j = jArr[i3];
/* 119 */                               if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
/* 126 */                                   int i4 = 8 - ((~(i3 - length)) >>> 31);
/* 129 */                                   for (int i5 = 0; i5 < i4; i5++) {
/* 135 */                                       if ((j & 255) < 128) {
/* 146 */                                           ((Ili0l001o1Io) objArr[(i3 << 3) + i5]).I00IO1(IliI0101O0Oi.I00iiO);
                                                }
/* 149 */                                       j >>= 8;
                                            }
/* 153 */                                   if (i4 == 8) {
/* 155 */                                       if (i3 != length) {
/* 157 */                                           i3++;
                                                }
                                            }
                                        }
                                    }
                                }
                            } else if (iliIO10oO0I000II.I00lll10) {
/* 177 */                       if (oi10iio.I0000Il00O(iliIO10oO0I000II)) {
/* 179 */                           iliIO10oO0I000II.I01101olii();
                                }
/* 182 */                       IliI0101O0Oi iliI0101O0OiI01101IOlO = iliIO10oO0I000II.I01101IOlO();
/* 190 */                       if (!iliIO10oO0I000II.I00iOIl.I00lll10) {
/* 194 */                           IolioOO1.I0000Il00O("visitAncestors called on an unattached node");
                                }
/* 197 */                       O1ooOo o1ooOo = iliIO10oO0I000II.I00iOIl;
/* 199 */                       O0iiOioolIi o0iiOioolIiI000O01llI0 = il0lI1i1olii.I000O01llI0(iliIO10oO0I000II);
/* 203 */                       int i6 = 0;
/* 204 */                       while (o0iiOioolIiI000O01llI0 != null) {
/* 216 */                           if ((((O1ooOo) o0iiOioolIiI000O01llI0.I010101Oo1lO.I00io1l).I00iio & 5120) != 0) {
/* 218 */                               while (o1ooOo != null) {
/* 220 */                                   int i7 = o1ooOo.I00iiO;
/* 224 */                                   if ((i7 & 5120) != 0) {
/* 228 */                                       if ((i7 & Barcode.FORMAT_UPC_E) != 0) {
/* 230 */                                           i6++;
                                                }
/* 234 */                                       if ((o1ooOo instanceof Ili0l001o1Io) && oi10iio2.I0000Il00O(o1ooOo)) {
/* 243 */                                           if (i6 <= 1) {
/* 248 */                                               ((Ili0l001o1Io) o1ooOo).I00IO1(iliI0101O0OiI01101IOlO);
                                                    } else {
/* 257 */                                               ((Ili0l001o1Io) o1ooOo).I00IO1(IliI0101O0Oi.I00iiI);
                                                    }
/* 260 */                                           oi10iio2.I000l1(o1ooOo);
                                                }
                                            }
/* 263 */                                   o1ooOo = o1ooOo.I00ilI0I1;
                                        }
                                    }
/* 266 */                           o0iiOioolIiI000O01llI0 = o0iiOioolIiI000O01llI0.I001IO000();
/* 281 */                           o1ooOo = (o0iiOioolIiI000O01llI0 == null || (iIlOoolol0ll = o0iiOioolIiI000O01llI0.I010101Oo1lO) == null) ? null : (Olo11IOO) iIlOoolol0ll.I00ilO0;
                                }
/* 283 */                       Object[] objArr2 = oi10iio2.I00000oOI;
/* 285 */                       long[] jArr2 = oi10iio2.I00000oIO;
                                int length2 = jArr2.length - 2;
/* 290 */                       if (length2 >= 0) {
/* 292 */                           int i8 = 0;
                                    while (true) {
/* 293 */                               long j2 = jArr2[i8];
/* 303 */                               if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
/* 310 */                                   int i9 = 8 - ((~(i8 - length2)) >>> 31);
/* 313 */                                   for (int i10 = 0; i10 < i9; i10++) {
/* 319 */                                       if ((j2 & 255) < 128) {
/* 330 */                                           ((Ili0l001o1Io) objArr2[(i8 << 3) + i10]).I00IO1(IliI0101O0Oi.I00iiO);
                                                }
/* 333 */                                       j2 >>= 8;
                                            }
/* 337 */                                   if (i9 == 8) {
/* 339 */                                       if (i8 != length2) {
/* 341 */                                           i8++;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
/* 348 */                   if (ili1ioOlo0oO.I000II() == null || ili1ioOlo0oO.I0000Il00O.I01101IOlO() == IliI0101O0Oi.I00iiO) {
/* 360 */                       ili1ioOlo0oO.I0000O();
                            }
/* 363 */                   oi10iio.I00000oOI();
/* 366 */                   oi10iio2.I00000oOI();
/* 370 */                   ili1O0oO00o.I0000oI00 = false;
/* 372 */                   return ooiIlOl1iI;
                        case 5:
/* 69 */                    return Boolean.valueOf(IliIO10oO0.I0110o(((IliIlIlo1i1) obj).I00oOio10iI1));
                        default:
/* 16 */                    Oi1oIiOiIi0 oi1oIiOiIi0 = (Oi1oIiOiIi0) obj;
/* 18 */                    IIOlO1ii iIOlO1ii = oi1oIiOiIi0.I00000oIO;
/* 20 */                    if (iIOlO1ii == null) {
/* 57 */                        O0000Ioio00.I000OOo1O("coroutineScope");
/* 60 */                        throw null;
                            }
/* 22 */                    il001oo1.I00000oOI(iIOlO1ii, null);
/* 25 */                    oi1oIiOiIi0.I0001Ioi1lo();
/* 28 */                    I0Oi111ii i0Oi111ii = oi1oIiOiIi0.I0000oI00;
/* 30 */                    if (i0Oi111ii == null) {
/* 51 */                        O0000Ioio00.I000OOo1O("connectionManager");
/* 54 */                        throw null;
                            }
/* 36 */                    ((OO01l1) i0Oi111ii.I00ilI0I1).close();
/* 41 */                    Olil10OiIi1l olil10OiIi1l = (Olil10OiIi1l) i0Oi111ii.I00ilO0;
/* 43 */                    if (olil10OiIi1l != null) {
/* 45 */                        olil10OiIi1l.close();
                            }
/* 48 */                    return ooiIlOl1iI;
                    }
                }
            }

            package p000;

            import android.content.Context;
            import android.graphics.Bitmap;
            import android.os.Looper;
            import android.os.NetworkOnMainThreadException;
            import android.webkit.MimeTypeMap;
            import java.io.IOException;
            import java.lang.invoke.VarHandle;
            import java.security.MessageDigest;
            import java.security.NoSuchAlgorithmException;
            import java.util.ArrayDeque;
            import java.util.Iterator;
            import java.util.LinkedHashMap;
            import java.util.Map;
            import java.util.concurrent.atomic.AtomicInteger;
            
            public final class IoOOiOO0O implements IlIO00OOi1OO {
                public static final IIi100 I0000oI00 = new IIi100(true, true, -1, -1, false, false, false, -1, -1, false, false, false, null);
                public static final IIi100 I0001Ioi1lo = new IIi100(true, false, -1, -1, false, false, false, -1, -1, true, false, false, null);
                public String I00000oIO;
                public OIil0IlIIol I00000oOI;
                public OllO00oiil I0000Il00O;
                public OllO00oiil I0000O;

                public static String I0000O(O1ii0l1iii o1ii0l1iii, String str) {
                    String strI00000oOI;
/* 7 */             String str2 = o1ii0l1iii != null ? o1ii0l1iii.I00000oIO : null;
/* 8 */             if ((str2 == null || OlOolloIIOl0.I000l1(str2, "text/plain", false)) && (strI00000oOI = I000O01llI0.I00000oOI(MimeTypeMap.getSingleton(), str)) != null) {
/* 29 */                return strI00000oOI;
                    }
/* 30 */            if (str2 != null) {
/* 34 */                return OlOoOIi0o.I00O10llo(str2, ';');
                    }
/* 1 */             return null;
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:37:0x00c5  */
                /* JADX WARN: Removed duplicated region for block: B:39:0x00c8 A[Catch: Exception -> 0x005f, TRY_ENTER, TryCatch #2 {Exception -> 0x005f, blocks: (B:20:0x0054, B:59:0x0157, B:103:0x021d, B:104:0x0222, B:39:0x00c8, B:41:0x00d4, B:48:0x00ff, B:51:0x0118, B:56:0x0145, B:44:0x00e7, B:46:0x00ef, B:53:0x0130, B:54:0x0137, B:55:0x0138), top: B:111:0x002f }] */
                /* JADX WARN: Removed duplicated region for block: B:55:0x0138 A[Catch: Exception -> 0x005f, TryCatch #2 {Exception -> 0x005f, blocks: (B:20:0x0054, B:59:0x0157, B:103:0x021d, B:104:0x0222, B:39:0x00c8, B:41:0x00d4, B:48:0x00ff, B:51:0x0118, B:56:0x0145, B:44:0x00e7, B:46:0x00ef, B:53:0x0130, B:54:0x0137, B:55:0x0138), top: B:111:0x002f }] */
                /* JADX WARN: Removed duplicated region for block: B:58:0x0155  */
                /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
                /* JADX WARN: Removed duplicated region for block: B:87:0x01e1 A[Catch: Exception -> 0x0207, TryCatch #4 {Exception -> 0x0207, blocks: (B:85:0x01db, B:87:0x01e1, B:89:0x01fe, B:91:0x0203, B:90:0x0201, B:95:0x020a, B:96:0x020f), top: B:114:0x01db }] */
                /* JADX WARN: Removed duplicated region for block: B:95:0x020a A[Catch: Exception -> 0x0207, TryCatch #4 {Exception -> 0x0207, blocks: (B:85:0x01db, B:87:0x01e1, B:89:0x01fe, B:91:0x0203, B:90:0x0201, B:95:0x020a, B:96:0x020f), top: B:114:0x01db }] */
                /* JADX WARN: Type inference failed for: r2v0, types: [OIil0IlIIol] */
                /* JADX WARN: Type inference failed for: r2v1, types: [java.io.Closeable] */
                /* JADX WARN: Type inference failed for: r2v22 */
                @Override
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object I00000oIO(IOoil1iiIilo iOoil1iiIilo) throws Exception {
                    IoOOOOlO0oOo ioOOOOlO0oOo;
                    OOll1l0ll oOll1l0ll;
                    IIi1OiooiI iIi1OiooiII00000oIO;
                    Object objI00000oOI;
                    OOllIO oOllIO;
                    OOll1l0ll oOll1l0ll2;
                    Oi1001l0Il oi1001l0Il;
                    OOll1l0ll oOll1l0llI000O01llI0;
                    String str;
                    Oi1001l0Il oi1001l0Il2;
                    IoiOloi ioiOloi;
/* 1 */             IoOOiOO0O ioOOiOO0O = this;
/* 5 */             ?? r2 = ioOOiOO0O.I00000oOI;
/* 7 */             String str2 = ioOOiOO0O.I00000oIO;
/* 11 */            if (iOoil1iiIilo instanceof IoOOOOlO0oOo) {
/* 14 */                ioOOOOlO0oOo = (IoOOOOlO0oOo) iOoil1iiIilo;
/* 16 */                int i = ioOOOOlO0oOo.I00ilO0;
/* 22 */                if ((i & Integer.MIN_VALUE) != 0) {
/* 25 */                    ioOOOOlO0oOo.I00ilO0 = i - Integer.MIN_VALUE;
                        } else {
/* 32 */                    ioOOOOlO0oOo = new IoOOOOlO0oOo(ioOOiOO0O, (IOoilo) iOoil1iiIilo);
                        }
                    }
/* 35 */            Object obj = ioOOOOlO0oOo.I00iio;
/* 37 */            Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 39 */            int i2 = ioOOOOlO0oOo.I00ilO0;
                    try {
                    } catch (Exception e) {
/* 96 */                e = e;
                    }
/* 48 */            if (i2 == 0) {
/* 99 */                lIoii1l01l0i.I00000oOI(obj);
/* 107 */               if (!r2.I000o00OoI0I.I00iOIl || (oOllIO = (OOllIO) ioOOiOO0O.I0000O.getValue()) == null) {
/* 198 */                   oOll1l0ll = null;
/* 199 */                   if (oOll1l0ll == null) {
/* 201 */                       IlIiOO0ilI ilIiOO0ilII0000Il00O = ioOOiOO0O.I0000Il00O();
/* 207 */                       Iii1oi1l1II iii1oi1l1II = (Iii1oi1l1II) oOll1l0ll.I00iiI;
/* 211 */                       if (iii1oi1l1II.I00iiI) {
/* 312 */                           throw new IllegalStateException("snapshot is closed");
                                }
/* 227 */                       Long l = ilIiOO0ilII0000Il00O.I001i1lo1io((OO0IIO1Il) iii1oi1l1II.I00iOIl.I0000Il00O.get(0)).I0000O;
/* 229 */                       if (l != null && l.longValue() == 0) {
/* 252 */                           return new OlIIO11IoO1(ioOOiOO0O.I000II(oOll1l0ll), I0000O(null, str2), Ii1I1OOilolI.I00iiO);
                                }
/* 269 */                       iIi1OiooiII00000oIO = new IIi1OIllI(ioOOiOO0O.I0000oI00(), ioOOiOO0O.I0001Ioi1lo(oOll1l0ll)).I00000oIO();
/* 273 */                       IIi1IIlllIi iIi1IIlllIi = iIi1OiooiII00000oIO.I00000oOI;
/* 277 */                       if (iIi1OiooiII00000oIO.I00000oIO == null && iIi1IIlllIi != null) {
/* 301 */                           return new OlIIO11IoO1(ioOOiOO0O.I000II(oOll1l0ll), I0000O((O1ii0l1iii) iIi1IIlllIi.I00000oOI.getValue(), str2), Ii1I1OOilolI.I00iiO);
                                }
                            } else {
/* 322 */                       iIi1OiooiII00000oIO = new IIi1OIllI(ioOOiOO0O.I0000oI00(), null).I00000oIO();
                            }
/* 326 */                   I0Oi111ii i0Oi111ii = iIi1OiooiII00000oIO.I00000oIO;
/* 328 */                   ioOOOOlO0oOo.I00iOIl = ioOOiOO0O;
/* 330 */                   ioOOOOlO0oOo.I00iiI = oOll1l0ll;
/* 332 */                   ioOOOOlO0oOo.I00iiO = iIi1OiooiII00000oIO;
/* 334 */                   ioOOOOlO0oOo.I00ilO0 = 1;
/* 336 */                   objI00000oOI = ioOOiOO0O.I00000oOI(i0Oi111ii, ioOOOOlO0oOo);
/* 340 */                   if (objI00000oOI != ii0111o) {
                            }
/* 467 */                   return ii0111o;
                        }
/* 119 */               String str3 = r2.I000OOo1O;
/* 121 */               if (str3 == null) {
/* 123 */                   str3 = str2;
                        }
/* 124 */               IiiI0l01O iiiI0l01O = oOllIO.I00000oOI;
/* 128 */               byte[] bytes = str3.getBytes(IO1IOI.I00000oIO);
/* 134 */               MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
/* 139 */               messageDigest.update(bytes, 0, bytes.length);
/* 142 */               byte[] bArrDigest = messageDigest.digest();
/* 148 */               char[] cArr = new char[bArrDigest.length * 2];
/* 152 */               int i3 = 0;
/* 154 */               for (byte b : bArrDigest) {
/* 158 */                   int i4 = i3 + 1;
/* 160 */                   char[] cArr2 = I0lllI01iooo.I00000oIO;
/* 168 */                   cArr[i3] = cArr2[(b >> 4) & 15];
/* 170 */                   i3 += 2;
/* 176 */                   cArr[i4] = cArr2[b & 15];
                        }
/* 186 */               Iii1oi1l1II iii1oi1l1III000II = iiiI0l01O.I000II(new String(cArr));
/* 190 */               if (iii1oi1l1III000II != null) {
/* 194 */                   oOll1l0ll = new OOll1l0ll(iii1oi1l1III000II);
                        }
/* 199 */               if (oOll1l0ll == null) {
                        }
/* 326 */               I0Oi111ii i0Oi111ii2 = iIi1OiooiII00000oIO.I00000oIO;
/* 328 */               ioOOOOlO0oOo.I00iOIl = ioOOiOO0O;
/* 330 */               ioOOOOlO0oOo.I00iiI = oOll1l0ll;
/* 332 */               ioOOOOlO0oOo.I00iiO = iIi1OiooiII00000oIO;
/* 334 */               ioOOOOlO0oOo.I00ilO0 = 1;
/* 336 */               objI00000oOI = ioOOiOO0O.I00000oOI(i0Oi111ii2, ioOOOOlO0oOo);
/* 340 */               if (objI00000oOI != ii0111o) {
                        }
/* 467 */               return ii0111o;
/* 548 */               if (r2 != 0) {
/* 550 */                   I000O01llI0.I00000oIO(r2);
                        }
/* 1261 */              throw e;
                    }
/* 50 */            if (i2 == 1) {
/* 79 */                IIi1OiooiI iIi1OiooiI = (IIi1OiooiI) ioOOOOlO0oOo.I00iiO;
/* 81 */                oOll1l0ll = ioOOOOlO0oOo.I00iiI;
/* 83 */                IoOOiOO0O ioOOiOO0O2 = ioOOOOlO0oOo.I00iOIl;
/* 85 */                lIoii1l01l0i.I00000oOI(obj);
/* 90 */                iIi1OiooiII00000oIO = iIi1OiooiI;
/* 91 */                ioOOiOO0O = ioOOiOO0O2;
/* 92 */                objI00000oOI = obj;
                    } else {
/* 52 */                if (i2 != 2) {
/* 73 */                    I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 47 */                    return null;
                        }
/* 57 */                oi1001l0Il = (Oi1001l0Il) ioOOOOlO0oOo.I00iiO;
/* 59 */                oOll1l0ll2 = ioOOOOlO0oOo.I00iiI;
/* 61 */                ioOOiOO0O = ioOOOOlO0oOo.I00iOIl;
                        try {
/* 63 */                    lIoii1l01l0i.I00000oOI(obj);
/* 474 */                   oi1001l0Il2 = (Oi1001l0Il) obj;
                            try {
/* 476 */                       Bitmap.Config[] configArr = I000O01llI0.I00000oIO;
/* 478 */                       ioiOloi = oi1001l0Il2.I00io1l;
/* 480 */                       if (ioiOloi != null) {
/* 528 */                           throw new IllegalStateException("response body == null");
                                }
/* 484 */                       IIIIlO11I0lO iIIIlO11I0lOI00iOIl = ioiOloi.I00iOIl();
/* 490 */                       Context context = ioOOiOO0O.I00000oOI.I00000oIO;
/* 516 */                       return new OlIIO11IoO1(new OlI1oO01O0(iIIIlO11I0lOI00iOIl, null), I0000O(ioiOloi.I0000Il00O(), ioOOiOO0O.I00000oIO), oi1001l0Il2.I00ioIO != null ? Ii1I1OOilolI.I00iio : Ii1I1OOilolI.I00iiO);
                            } catch (Exception e2) {
/* 520 */                       e = e2;
/* 521 */                       oi1001l0Il = oi1001l0Il2;
                                try {
/* 535 */                           I000O01llI0.I00000oIO(oi1001l0Il);
/* 538 */                           throw e;
                                } catch (Exception e3) {
/* 539 */                           e = e3;
/* 540 */                           r2 = oOll1l0ll2;
                                }
                            }
                        } catch (Exception e4) {
/* 68 */                    e = e4;
/* 535 */                   I000O01llI0.I00000oIO(oi1001l0Il);
/* 538 */                   throw e;
                        }
                    }
/* 344 */           Oi1001l0Il oi1001l0Il3 = (Oi1001l0Il) objI00000oOI;
/* 346 */           Bitmap.Config[] configArr2 = I000O01llI0.I00000oIO;
/* 348 */           IoiOloi ioiOloi2 = oi1001l0Il3.I00io1l;
/* 350 */           if (ioiOloi2 == null) {
/* 547 */               throw new IllegalStateException("response body == null");
                    }
                    try {
/* 356 */               oOll1l0llI000O01llI0 = ioOOiOO0O.I000O01llI0(oOll1l0ll, iIi1OiooiII00000oIO.I00000oIO, oi1001l0Il3, iIi1OiooiII00000oIO.I00000oOI);
/* 360 */               str = ioOOiOO0O.I00000oIO;
                    } catch (Exception e5) {
/* 529 */               e = e5;
/* 532 */               oOll1l0ll2 = oOll1l0ll;
/* 533 */               oi1001l0Il = oi1001l0Il3;
                    }
                    try {
/* 362 */               if (oOll1l0llI000O01llI0 != null) {
/* 366 */                   IlIOloI10 ilIOloI10I000II = ioOOiOO0O.I000II(oOll1l0llI000O01llI0);
/* 370 */                   IIi1IIlllIi iIi1IIlllIiI0001Ioi1lo = ioOOiOO0O.I0001Ioi1lo(oOll1l0llI000O01llI0);
/* 396 */                   return new OlIIO11IoO1(ilIOloI10I000II, I0000O(iIi1IIlllIiI0001Ioi1lo != null ? (O1ii0l1iii) iIi1IIlllIiI0001Ioi1lo.I00000oOI.getValue() : null, str), Ii1I1OOilolI.I00iio);
                        }
/* 408 */               if (ioiOloi2.I00000oIO() > 0) {
/* 412 */                   IIIIlO11I0lO iIIIlO11I0lOI00iOIl2 = ioiOloi2.I00iOIl();
/* 418 */                   Context context2 = ioOOiOO0O.I00000oOI.I00000oIO;
/* 442 */                   return new OlIIO11IoO1(new OlI1oO01O0(iIIIlO11I0lOI00iOIl2, null), I0000O(ioiOloi2.I0000Il00O(), str), oi1001l0Il3.I00ioIO != null ? Ii1I1OOilolI.I00iio : Ii1I1OOilolI.I00iiO);
                        }
/* 446 */               I000O01llI0.I00000oIO(oi1001l0Il3);
/* 449 */               I0Oi111ii i0Oi111iiI0000oI00 = ioOOiOO0O.I0000oI00();
/* 453 */               ioOOOOlO0oOo.I00iOIl = ioOOiOO0O;
/* 455 */               ioOOOOlO0oOo.I00iiI = oOll1l0llI000O01llI0;
/* 457 */               ioOOOOlO0oOo.I00iiO = oi1001l0Il3;
/* 459 */               ioOOOOlO0oOo.I00ilO0 = 2;
/* 461 */               Object objI00000oOI2 = ioOOiOO0O.I00000oOI(i0Oi111iiI0000oI00, ioOOOOlO0oOo);
/* 465 */               if (objI00000oOI2 != ii0111o) {
/* 470 */                   oOll1l0ll2 = oOll1l0llI000O01llI0;
/* 471 */                   obj = objI00000oOI2;
/* 472 */                   oi1001l0Il = oi1001l0Il3;
/* 474 */                   oi1001l0Il2 = (Oi1001l0Il) obj;
/* 476 */                   Bitmap.Config[] configArr3 = I000O01llI0.I00000oIO;
/* 478 */                   ioiOloi = oi1001l0Il2.I00io1l;
/* 480 */                   if (ioiOloi != null) {
                            }
                        }
/* 467 */               return ii0111o;
                    } catch (Exception e6) {
/* 400 */               e = e6;
/* 386 */               oi1001l0Il = oi1001l0Il3;
/* 387 */               oOll1l0ll2 = oOll1l0llI000O01llI0;
/* 535 */               I000O01llI0.I00000oIO(oi1001l0Il);
/* 538 */               throw e;
                    }
                }

                /* JADX WARN: Removed duplicated region for block: B:53:0x0138  */
                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object I00000oOI(I0Oi111ii i0Oi111ii, IOoilo iOoilo) throws Throwable {
                    IoOOIl01 ioOOIl01;
                    OOliOOlol1 oOliOOlol1;
                    Oi1001l0Il oi1001l0IlI0000oI00;
                    int i;
                    IoiOloi ioiOloi;
/* 3 */             if (iOoilo instanceof IoOOIl01) {
/* 6 */                 ioOOIl01 = (IoOOIl01) iOoilo;
/* 8 */                 int i2 = ioOOIl01.I00iiO;
/* 14 */                if ((i2 & Integer.MIN_VALUE) != 0) {
/* 17 */                    ioOOIl01.I00iiO = i2 - Integer.MIN_VALUE;
                        } else {
/* 22 */                    ioOOIl01 = new IoOOIl01(this, iOoilo);
                        }
                    }
/* 25 */            Object objI0010I0i = ioOOIl01.I00iOIl;
/* 27 */            Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 29 */            int i3 = ioOOIl01.I00iiO;
/* 31 */            OOliOOlol1 oOliOOlol12 = null;
/* 33 */            if (i3 == 0) {
/* 48 */                lIoii1l01l0i.I00000oOI(objI0010I0i);
/* 51 */                Bitmap.Config[] configArr = I000O01llI0.I00000oIO;
/* 65 */                if (O0000Ioio00.I0000O(Looper.myLooper(), Looper.getMainLooper())) {
/* 73 */                    if (this.I00000oOI.I000oI1ioi.I00iOIl) {
/* 102 */                       throw new NetworkOnMainThreadException();
                            }
/* 81 */                    OIOlo0OloOi oIOlo0OloOi = (OIOlo0OloOi) this.I0000Il00O.getValue();
/* 83 */                    oIOlo0OloOi.getClass();
/* 91 */                    oi1001l0IlI0000oI00 = new OOlioiIOOO1(oIOlo0OloOi, i0Oi111ii).I0000oI00();
/* 294 */                   i = oi1001l0IlI0000oI00.I00iio;
/* 298 */                   if ((200 > i && i < 300) || i == 304) {
/* 349 */                       return oi1001l0IlI0000oI00;
                            }
/* 309 */                   ioiOloi = oi1001l0IlI0000oI00.I00io1l;
/* 311 */                   if (ioiOloi != null) {
/* 313 */                       I000O01llI0.I00000oIO(ioiOloi);
                            }
/* 348 */                   throw new IOiIIo1l("HTTP " + oi1001l0IlI0000oI00.I00iio + ": " + oi1001l0IlI0000oI00.I00iiO, 3);
                        }
/* 109 */               OIOlo0OloOi oIOlo0OloOi2 = (OIOlo0OloOi) this.I0000Il00O.getValue();
/* 111 */               oIOlo0OloOi2.getClass();
/* 116 */               OOlioiIOOO1 oOlioiIOOO1 = new OOlioiIOOO1(oIOlo0OloOi2, i0Oi111ii);
/* 119 */               ioOOIl01.I00iiO = 1;
/* 127 */               IIoOoIol0Io0 iIoOoIol0Io0 = new IIoOoIol0Io0(1, l00iIoI.I0000Il00O(ioOOIl01));
/* 130 */               iIoOoIol0Io0.I00111O();
/* 137 */               I01i01OoI i01i01OoI = new I01i01OoI(10);
/* 140 */               i01i01OoI.I00iiI = oOlioiIOOO1;
/* 142 */               i01i01OoI.I00iiO = iIoOoIol0Io0;
/* 144 */               VarHandle.storeStoreFence();
/* 154 */               if (!oOlioiIOOO1.I00ilI0I1.compareAndSet(false, true)) {
/* 355 */                   I000II.I001IO000("Already Executed");
/* 31 */                    return null;
                        }
/* 156 */               oOlioiIOOO1.I0000Il00O();
/* 159 */               o01l1ioOo0 o01l1iooo0 = oIOlo0OloOi2.I00iOIl;
/* 163 */               OOliOOlol1 oOliOOlol13 = new OOliOOlol1();
/* 166 */               oOliOOlol13.I00iiO = oOlioiIOOO1;
/* 168 */               oOliOOlol13.I00iOIl = i01i01OoI;
/* 175 */               oOliOOlol13.I00iiI = new AtomicInteger(0);
/* 177 */               VarHandle.storeStoreFence();
                        synchronized (o01l1iooo0) {
/* 185 */                   ((ArrayDeque) o01l1iooo0.I00iiI).add(oOliOOlol13);
/* 192 */                   String str = ((IoOi01OlIl1o) i0Oi111ii.I00iiI).I0000O;
/* 198 */                   Iterator it = ((ArrayDeque) o01l1iooo0.I00iiO).iterator();
                            while (true) {
/* 206 */                       if (it.hasNext()) {
/* 212 */                           oOliOOlol1 = (OOliOOlol1) it.next();
/* 228 */                           if (O0000Ioio00.I0000O(((IoOi01OlIl1o) oOliOOlol1.I00iiO.I00iiI.I00iiI).I0000O, str)) {
                                        break;
                                    }
                                } else {
/* 236 */                           Iterator it2 = ((ArrayDeque) o01l1iooo0.I00iiI).iterator();
/* 244 */                           while (it2.hasNext()) {
/* 250 */                               oOliOOlol1 = (OOliOOlol1) it2.next();
/* 266 */                               if (O0000Ioio00.I0000O(((IoOi01OlIl1o) oOliOOlol1.I00iiO.I00iiI.I00iiI).I0000O, str)) {
                                        }
                                    }
                                }
                            }
/* 230 */                   oOliOOlol12 = oOliOOlol1;
/* 269 */                   if (oOliOOlol12 != null) {
/* 273 */                       oOliOOlol13.I00iiI = oOliOOlol12.I00iiI;
                            }
                        }
/* 276 */               o01l1iooo0.I000oI1ioi();
/* 279 */               iIoOoIol0Io0.I001IO000(i01i01OoI);
/* 282 */               objI0010I0i = iIoOoIol0Io0.I0010I0i();
/* 286 */               Ii0111o ii0111o2 = Ii0111o.I00iOIl;
/* 288 */               if (objI0010I0i == ii0111o) {
/* 290 */                   return ii0111o;
                        }
                    } else {
/* 35 */                if (i3 != 1) {
/* 44 */                    I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 31 */                    return null;
                        }
/* 37 */                lIoii1l01l0i.I00000oOI(objI0010I0i);
                    }
/* 292 */           oi1001l0IlI0000oI00 = (Oi1001l0Il) objI0010I0i;
/* 294 */           i = oi1001l0IlI0000oI00.I00iio;
/* 298 */           if (200 > i) {
/* 309 */               ioiOloi = oi1001l0IlI0000oI00.I00io1l;
/* 311 */               if (ioiOloi != null) {
                        }
/* 348 */               throw new IOiIIo1l("HTTP " + oi1001l0IlI0000oI00.I00iio + ": " + oi1001l0IlI0000oI00.I00iiO, 3);
                    }
/* 309 */           ioiOloi = oi1001l0IlI0000oI00.I00io1l;
/* 311 */           if (ioiOloi != null) {
                    }
/* 348 */           throw new IOiIIo1l("HTTP " + oi1001l0IlI0000oI00.I00iio + ": " + oi1001l0IlI0000oI00.I00iiO, 3);
/* 349 */           return oi1001l0IlI0000oI00;
                }

                public final IlIiOO0ilI I0000Il00O() {
/* 9 */             return ((OOllIO) this.I0000O.getValue()).I00000oIO;
                }

                public final I0Oi111ii I0000oI00() {
/* 5 */             I1ii1o0 i1ii1o0 = new I1ii1o0(14);
/* 10 */            i1ii1o0.I00IoiI(this.I00000oIO);
/* 13 */            OIil0IlIIol oIil0IlIIol = this.I00000oOI;
/* 21 */            i1ii1o0.I00iio = oIil0IlIIol.I000OiO.I000OOo1O();
/* 39 */            for (Map.Entry entry : oIil0IlIIol.I000iOII.I00000oIO.entrySet()) {
/* 51 */                Class cls = (Class) entry.getKey();
/* 53 */                Object value = entry.getValue();
/* 59 */                LinkedHashMap linkedHashMap = (LinkedHashMap) i1ii1o0.I00ilO0;
/* 61 */                if (value == null) {
/* 63 */                    linkedHashMap.remove(cls);
                        } else {
/* 71 */                    if (linkedHashMap.isEmpty()) {
/* 78 */                        i1ii1o0.I00ilO0 = new LinkedHashMap();
                            }
/* 88 */                    ((LinkedHashMap) i1ii1o0.I00ilO0).put(cls, cls.cast(value));
                        }
                    }
/* 92 */            IIi11lllool1 iIi11lllool1 = oIil0IlIIol.I000o00OoI0I;
/* 94 */            boolean z = iIi11lllool1.I00iOIl;
/* 98 */            boolean z2 = oIil0IlIIol.I000oI1ioi.I00iOIl;
/* 100 */           if (!z2 && z) {
/* 106 */               i1ii1o0.I0010o(IIi100.I000oI1ioi);
                    } else if (!z2 || z) {
/* 130 */               if (!z2 && !z) {
/* 136 */                   i1ii1o0.I0010o(I0001Ioi1lo);
                        }
                    } else if (iIi11lllool1.I00iiI) {
/* 120 */               i1ii1o0.I0010o(IIi100.I000o00OoI0I);
                    } else {
/* 126 */               i1ii1o0.I0010o(I0000oI00);
                    }
/* 139 */           return i1ii1o0.I00100o1O0lo();
                }

                public final IIi1IIlllIi I0001Ioi1lo(OOll1l0ll oOll1l0ll) throws Throwable {
                    Throwable th;
                    IIi1IIlllIi iIi1IIlllIi;
                    try {
/* 2 */                 IlIiOO0ilI ilIiOO0ilII0000Il00O = I0000Il00O();
/* 8 */                 Iii1oi1l1II iii1oi1l1II = (Iii1oi1l1II) oOll1l0ll.I00iiI;
/* 12 */                if (iii1oi1l1II.I00iiI) {
/* 68 */                    throw new IllegalStateException("snapshot is closed");
                        }
/* 31 */                OOliO0 oOliO0 = new OOliO0(ilIiOO0ilII0000Il00O.I00IioO0OiOi((OO0IIO1Il) iii1oi1l1II.I00iOIl.I0000Il00O.get(0)));
                        try {
/* 36 */                    iIi1IIlllIi = new IIi1IIlllIi(oOliO0);
                            try {
/* 39 */                        oOliO0.close();
/* 42 */                        th = null;
                            } catch (Throwable th2) {
/* 44 */                        th = th2;
                            }
                        } catch (Throwable th3) {
                            try {
/* 47 */                        oOliO0.close();
                            } catch (Throwable th4) {
/* 52 */                        ilIilolOlIoO.I00000oIO(th3, th4);
                            }
/* 55 */                    th = th3;
/* 56 */                    iIi1IIlllIi = null;
                        }
/* 57 */                if (th == null) {
/* 59 */                    return iIi1IIlllIi;
                        }
/* 60 */                throw th;
                    } catch (IOException unused) {
/* 1 */                 return null;
                    }
                }

                public final IlIOloI10 I000II(OOll1l0ll oOll1l0ll) {
/* 3 */             Iii1oi1l1II iii1oi1l1II = (Iii1oi1l1II) oOll1l0ll.I00iiI;
/* 7 */             if (iii1oi1l1II.I00iiI) {
/* 51 */                I000II.I001IO000("snapshot is closed");
/* 54 */                return null;
                    }
/* 18 */            OO0IIO1Il oO0IIO1Il = (OO0IIO1Il) iii1oi1l1II.I00iOIl.I0000Il00O.get(1);
/* 20 */            IlIiOO0ilI ilIiOO0ilII0000Il00O = I0000Il00O();
/* 26 */            String str = this.I00000oOI.I000OOo1O;
/* 28 */            if (str == null) {
/* 30 */                str = this.I00000oIO;
                    }
/* 34 */            IlIOloI10 ilIOloI10 = new IlIOloI10();
/* 37 */            ilIOloI10.I00iOIl = oO0IIO1Il;
/* 39 */            ilIOloI10.I00iiI = ilIiOO0ilII0000Il00O;
/* 41 */            ilIOloI10.I00iiO = str;
/* 43 */            ilIOloI10.I00iio = oOll1l0ll;
/* 45 */            VarHandle.storeStoreFence();
/* 48 */            return ilIOloI10;
                }

                /* JADX WARN: Removed duplicated region for block: B:123:0x00b3 A[EXC_TOP_SPLITTER, SYNTHETIC] */
                /* JADX WARN: Removed duplicated region for block: B:35:0x00ae  */
                /* JADX WARN: Removed duplicated region for block: B:96:0x017e  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final OOll1l0ll I000O01llI0(OOll1l0ll oOll1l0ll, I0Oi111ii i0Oi111ii, Oi1001l0Il oi1001l0Il, IIi1IIlllIi iIi1IIlllIi) throws NoSuchAlgorithmException {
                    Oi00IilOloo0 oi00IilOloo0;
                    Throwable th;
                    I1ii1l10IO i1ii1l10IOI0000Il00O;
/* 7 */             Throwable th2 = null;
/* 8 */             if (this.I00000oOI.I000o00OoI0I.I00iiI && !i0Oi111ii.I000oI1ioi().I00000oOI) {
/* 18 */                IIi100 iIi100I00000oIO = oi1001l0Il.I00lll10;
/* 20 */                if (iIi100I00000oIO == null) {
/* 24 */                    iIi100I00000oIO = iOiiO0.I00000oIO(oi1001l0Il.I00ilO0);
/* 28 */                    oi1001l0Il.I00lll10 = iIi100I00000oIO;
                        }
/* 32 */                if (!iIi100I00000oIO.I00000oOI && !O0000Ioio00.I0000O(oi1001l0Il.I00ilO0.I00000oOI("Vary"), "*")) {
/* 51 */                    if (oOll1l0ll != null) {
/* 55 */                        Iii1oi1l1II iii1oi1l1II = (Iii1oi1l1II) oOll1l0ll.I00iiI;
/* 57 */                        IiiI0l01O iiiI0l01O = iii1oi1l1II.I00iiO;
                                synchronized (iiiI0l01O) {
/* 60 */                            iii1oi1l1II.close();
/* 67 */                            i1ii1l10IOI0000Il00O = iiiI0l01O.I0000Il00O(iii1oi1l1II.I00iOIl.I00000oIO);
                                }
/* 175 */                       oi00IilOloo0 = i1ii1l10IOI0000Il00O != null ? new Oi00IilOloo0(i1ii1l10IOI0000Il00O) : null;
                                try {
/* 176 */                           if (oi00IilOloo0 != null) {
                                        try {
/* 184 */                                   if (oi1001l0Il.I00iio != 304 || iIi1IIlllIi == null) {
/* 280 */                                       OOliIlo01o oOliIlo01oI00000oIO = l1l0I1OIOIO1.I00000oIO(I0000Il00O().I00IOO(((I1ii1l10IO) oi00IilOloo0.I00iOIl).I0000Il00O(0)));
                                                try {
/* 289 */                                           new IIi1IIlllIi(oi1001l0Il).I00000oIO(oOliIlo01oI00000oIO);
                                                    try {
/* 292 */                                               oOliIlo01oI00000oIO.close();
/* 295 */                                               th = null;
                                                    } catch (Throwable th3) {
/* 297 */                                               th = th3;
                                                    }
                                                } catch (Throwable th4) {
                                                    try {
/* 300 */                                               oOliIlo01oI00000oIO.close();
                                                    } catch (Throwable th5) {
/* 305 */                                               ilIilolOlIoO.I00000oIO(th4, th5);
                                                    }
/* 308 */                                           th = th4;
                                                }
/* 309 */                                       if (th != null) {
/* 368 */                                           throw th;
                                                }
/* 328 */                                       OOliIlo01o oOliIlo01oI00000oIO2 = l1l0I1OIOIO1.I00000oIO(I0000Il00O().I00IOO(((I1ii1l10IO) oi00IilOloo0.I00iOIl).I0000Il00O(1)));
                                                try {
/* 338 */                                           oi1001l0Il.I00io1l.I00iOIl().I00OIO1(oOliIlo01oI00000oIO2);
                                                    try {
/* 341 */                                               oOliIlo01oI00000oIO2.close();
                                                    } catch (Throwable th6) {
/* 345 */                                               th2 = th6;
                                                    }
                                                } catch (Throwable th7) {
/* 348 */                                           th2 = th7;
                                                    try {
/* 349 */                                               oOliIlo01oI00000oIO2.close();
                                                    } catch (Throwable th8) {
/* 354 */                                               ilIilolOlIoO.I00000oIO(th2, th8);
                                                    }
                                                }
/* 357 */                                       if (th2 != null) {
/* 367 */                                           throw th2;
                                                }
                                            } else {
/* 188 */                                       Oi10001 oi10001I00000oIO = oi1001l0Il.I00000oIO();
/* 204 */                                       oi10001I00000oIO.I0001Ioi1lo = iOiiOiOliIO.I00000oIO(iIi1IIlllIi.I0001Ioi1lo, oi1001l0Il.I00ilO0).I000OOo1O();
/* 206 */                                       Oi1001l0Il oi1001l0IlI00000oIO = oi10001I00000oIO.I00000oIO();
/* 226 */                                       OOliIlo01o oOliIlo01oI00000oIO3 = l1l0I1OIOIO1.I00000oIO(I0000Il00O().I00IOO(((I1ii1l10IO) oi00IilOloo0.I00iOIl).I0000Il00O(0)));
                                                try {
/* 235 */                                           new IIi1IIlllIi(oi1001l0IlI00000oIO).I00000oIO(oOliIlo01oI00000oIO3);
                                                    try {
/* 238 */                                               oOliIlo01oI00000oIO3.close();
                                                    } catch (Throwable th9) {
/* 242 */                                               th2 = th9;
                                                    }
                                                } catch (Throwable th10) {
/* 245 */                                           th2 = th10;
                                                    try {
/* 246 */                                               oOliIlo01oI00000oIO3.close();
                                                    } catch (Throwable th11) {
/* 251 */                                               ilIilolOlIoO.I00000oIO(th2, th11);
                                                    }
                                                }
/* 254 */                                       if (th2 != null) {
/* 257 */                                           throw th2;
                                                }
                                            }
/* 359 */                                   OOll1l0ll oOll1l0llI001IO000 = oi00IilOloo0.I001IO000();
/* 363 */                                   I000O01llI0.I00000oIO(oi1001l0Il);
/* 366 */                                   return oOll1l0llI001IO000;
                                        } catch (Exception e) {
/* 369 */                                   Bitmap.Config[] configArr = I000O01llI0.I00000oIO;
                                            try {
/* 375 */                                       ((I1ii1l10IO) oi00IilOloo0.I00iOIl).I00000oOI(false);
                                            } catch (Exception unused) {
                                            }
/* 378 */                                   throw e;
                                        }
                                    }
                                } catch (Throwable th12) {
/* 379 */                           I000O01llI0.I00000oIO(oi1001l0Il);
/* 382 */                           throw th12;
                                }
                            } else {
/* 89 */                        OOllIO oOllIO = (OOllIO) this.I0000O.getValue();
/* 91 */                        if (oOllIO != null) {
/* 95 */                            String str = this.I00000oOI.I000OOo1O;
/* 97 */                            if (str == null) {
/* 99 */                                str = this.I00000oIO;
                                    }
/* 101 */                           IiiI0l01O iiiI0l01O2 = oOllIO.I00000oOI;
/* 105 */                           byte[] bytes = str.getBytes(IO1IOI.I00000oIO);
/* 111 */                           MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
/* 116 */                           messageDigest.update(bytes, 0, bytes.length);
/* 119 */                           byte[] bArrDigest = messageDigest.digest();
/* 126 */                           char[] cArr = new char[bArrDigest.length * 2];
/* 130 */                           int i = 0;
/* 131 */                           for (byte b : bArrDigest) {
/* 135 */                               int i2 = i + 1;
/* 137 */                               char[] cArr2 = I0lllI01iooo.I00000oIO;
/* 145 */                               cArr[i] = cArr2[(b >> 4) & 15];
/* 147 */                               i += 2;
/* 153 */                               cArr[i2] = cArr2[b & 15];
                                    }
/* 163 */                           I1ii1l10IO i1ii1l10IOI0000Il00O2 = iiiI0l01O2.I0000Il00O(new String(cArr));
/* 167 */                           if (i1ii1l10IOI0000Il00O2 != null) {
/* 171 */                               oi00IilOloo0 = new Oi00IilOloo0(i1ii1l10IOI0000Il00O2);
                                    }
/* 176 */                           if (oi00IilOloo0 != null) {
                                    }
                                }
                            }
                        }
                    } else if (oOll1l0ll != null) {
/* 385 */               I000O01llI0.I00000oIO(oOll1l0ll);
                    }
/* 7 */             return null;
                }
            }

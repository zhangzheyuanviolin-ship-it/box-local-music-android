            package p000;

            import android.content.Context;
            import android.content.res.Resources;
            import android.graphics.Paint;
            import android.graphics.Typeface;
            import android.graphics.fonts.Font;
            import android.graphics.fonts.FontFamily;
            import android.graphics.text.PositionedGlyphs;
            import android.graphics.text.TextRunShaper;
            import android.os.Handler;
            import android.os.Looper;
            import android.os.Trace;
            import android.text.TextUtils;
            import android.util.Log;
            import java.io.IOException;
            import java.lang.invoke.VarHandle;
            import java.util.ArrayList;
            import java.util.List;
            import java.util.concurrent.ConcurrentHashMap;
            import java.util.concurrent.ExecutionException;
            import java.util.concurrent.ThreadPoolExecutor;
            import java.util.concurrent.TimeUnit;
            import java.util.concurrent.TimeoutException;
            
            public abstract class OoOl10O1o {
                public static final i1i0olI I00000oIO;
                public static final O1Il00 I00000oOI;
                public static Paint I0000Il00O;

                static {
/* 3 */             lOo0I0iOi11O.I00000oIO("TypefaceCompat static init");
/* 10 */            i1i0olI i1i0oli = new i1i0olI(16);
/* 15 */            new ConcurrentHashMap();
/* 18 */            I00000oIO = i1i0oli;
/* 27 */            I00000oOI = new O1Il00(16);
/* 30 */            I0000Il00O = null;
/* 32 */            Trace.endSection();
                }

                public static Typeface I00000oIO(Context context, Ilili1O1io[] ilili1O1ioArr, int i) {
/* 3 */             lOo0I0iOi11O.I00000oIO("TypefaceCompat.createFromFontInfo");
                    try {
/* 8 */                 I00000oIO.getClass();
/* 15 */                Typeface typefaceBuild = null;
                        try {
/* 16 */                    FontFamily fontFamilyI000lI = i1i0olI.I000lI(ilili1O1ioArr, context.getContentResolver());
/* 20 */                    if (fontFamilyI000lI != null) {
/* 40 */                        typefaceBuild = new Typeface.CustomFallbackBuilder(fontFamilyI000lI).setStyle(i1i0olI.I000l1(fontFamilyI000lI, i).getStyle()).build();
                            }
                        } catch (Exception e) {
/* 50 */                    Log.w("TypefaceCompatApi29Impl", "Font load failed", e);
                        }
/* 56 */                return typefaceBuild;
                    } finally {
/* 58 */                Trace.endSection();
                    }
                }

                /* JADX WARN: Code restructure failed: missing block: B:40:0x00da, code lost:
                
                    r8 = r11.build();
                 */
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:129:0x02cc  */
                /* JADX WARN: Removed duplicated region for block: B:133:0x02d7  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public static Typeface I00000oOI(Context context, Iliii01Iil iliii01Iil, Resources resources, int i, String str, int i2, int i3, I1I1OO00o1o i1I1OO00o1o, boolean z) {
                    Typeface typefaceBuild;
                    FontFamily fontFamilyBuild;
/* 12 */            Typeface typefaceBuild2 = null;
/* 13 */            int i4 = 0;
/* 14 */            if (iliii01Iil instanceof IliioIiloIOi) {
/* 16 */                IliioIiloIOi iliioIiloIOi = (IliioIiloIOi) iliii01Iil;
/* 20 */                String str2 = iliioIiloIOi.I0000O;
/* 26 */                int i5 = 1;
/* 27 */                if (TextUtils.isEmpty(str2) || (typefaceBuild = I0000oI00(str2)) == null) {
/* 37 */                    ArrayList arrayList = iliioIiloIOi.I00000oIO;
/* 43 */                    if (arrayList.size() == 1) {
/* 53 */                        typefaceBuild = I0000oI00(((IliiOI0I0) arrayList.get(0)).I0000oI00);
                            } else {
/* 59 */                        int i6 = 0;
                                while (true) {
/* 64 */                            if (i6 >= arrayList.size()) {
/* 86 */                                Typeface.CustomFallbackBuilder customFallbackBuilder = null;
/* 87 */                                int i7 = 0;
                                        while (true) {
/* 92 */                                    if (i7 >= arrayList.size()) {
                                                break;
                                            }
/* 98 */                                    IliiOI0I0 iliiOI0I0 = (IliiOI0I0) arrayList.get(i7);
/* 105 */                                   if (i7 == arrayList.size() - 1 && TextUtils.isEmpty(iliiOI0I0.I0001Ioi1lo)) {
/* 117 */                                       customFallbackBuilder.setSystemFallback(iliiOI0I0.I0000oI00);
                                                break;
                                            }
/* 121 */                                   String str3 = iliiOI0I0.I0000oI00;
/* 123 */                                   String str4 = iliiOI0I0.I0001Ioi1lo;
/* 129 */                                   Font fontI0001Ioi1lo = I0001Ioi1lo(I0000oI00(str3));
/* 133 */                                   if (fontI0001Ioi1lo == null) {
/* 156 */                                       Log.w("TypefaceCompat", "Unable identify the primary font for " + iliiOI0I0.I0000oI00 + ". Falling back to provider font.");
                                                break;
                                            }
/* 164 */                                   if (TextUtils.isEmpty(str4)) {
/* 200 */                                       fontFamilyBuild = new FontFamily.Builder(fontI0001Ioi1lo).build();
                                            } else {
                                                try {
/* 184 */                                           fontFamilyBuild = new FontFamily.Builder(new Font.Builder(fontI0001Ioi1lo).setFontVariationSettings(str4).build()).build();
                                                } catch (IOException unused) {
/* 191 */                                           Log.e("TypefaceCompat", "Failed to clone Font instance. Fall back to provider font.");
                                                }
                                            }
/* 204 */                                   if (customFallbackBuilder == null) {
/* 208 */                                       customFallbackBuilder = new Typeface.CustomFallbackBuilder(fontFamilyBuild);
                                            } else {
/* 212 */                                       customFallbackBuilder.addCustomFallback(fontFamilyBuild);
                                            }
/* 215 */                                   i7++;
                                        }
                                    } else {
/* 78 */                                if (I0000oI00(((IliiOI0I0) arrayList.get(i6)).I0000oI00) == null) {
                                            break;
                                        }
/* 83 */                                i6++;
                                    }
                                }
/* 80 */                        typefaceBuild = null;
                            }
                        }
/* 223 */               if (typefaceBuild != null) {
/* 225 */                   if (i1I1OO00o1o != null) {
/* 227 */                       i1I1OO00o1o.I00000oOI(typefaceBuild);
                            }
/* 236 */                   I00000oOI.I0000O(I0000O(resources, i, str, i2, i3), typefaceBuild);
/* 239 */                   return typefaceBuild;
                        }
/* 248 */               Object[] objArr = !z ? i1I1OO00o1o != null : iliioIiloIOi.I0000Il00O != 0;
/* 259 */               int i8 = z ? iliioIiloIOi.I00000oOI : -1;
/* 266 */               Handler handler = new Handler(Looper.getMainLooper());
/* 271 */               Oi00IilOloo0 oi00IilOloo0 = new Oi00IilOloo0();
/* 274 */               oi00IilOloo0.I00iOIl = i1I1OO00o1o;
/* 276 */               ArrayList arrayList2 = iliioIiloIOi.I00000oIO;
/* 282 */               II0i0l01ooIO iI0i0l01ooIO = new II0i0l01ooIO(1);
/* 285 */               iI0i0l01ooIO.I00iiI = handler;
/* 287 */               VarHandle.storeStoreFence();
/* 291 */               IoloOio0I ioloOio0I = new IoloOio0I(5);
/* 294 */               ioloOio0I.I00iiI = oi00IilOloo0;
/* 296 */               ioloOio0I.I00iiO = iI0i0l01ooIO;
/* 298 */               VarHandle.storeStoreFence();
/* 301 */               if (objArr != true) {
/* 458 */                   String strI00000oIO = IliiOlIoO.I00000oIO(i3, arrayList2);
/* 468 */                   Typeface typeface = (Typeface) IliiOlIoO.I00000oIO.I0000Il00O(strI00000oIO);
/* 470 */                   if (typeface != null) {
/* 474 */                       IlloOi1I1OO illoOi1I1OO = new IlloOi1I1OO(i5);
/* 477 */                       illoOi1I1OO.I00iiI = oi00IilOloo0;
/* 479 */                       illoOi1I1OO.I00iiO = typeface;
/* 481 */                       VarHandle.storeStoreFence();
/* 484 */                       iI0i0l01ooIO.execute(illoOi1I1OO);
/* 487 */                       typefaceBuild2 = typeface;
                            } else {
/* 491 */                       IioO0ilo1Ii iioO0ilo1Ii = new IioO0ilo1Ii(1);
/* 494 */                       iioO0ilo1Ii.I00000oOI = ioloOio0I;
/* 496 */                       VarHandle.storeStoreFence();
                                synchronized (IliiOlIoO.I0000Il00O) {
                                    try {
/* 502 */                               Ol0Ii10o1 ol0Ii10o1 = IliiOlIoO.I0000O;
/* 508 */                               ArrayList arrayList3 = (ArrayList) ol0Ii10o1.get(strI00000oIO);
/* 510 */                               if (arrayList3 != null) {
/* 512 */                                   arrayList3.add(iioO0ilo1Ii);
                                        } else {
/* 521 */                                   ArrayList arrayList4 = new ArrayList();
/* 524 */                                   arrayList4.add(iioO0ilo1Ii);
/* 527 */                                   ol0Ii10o1.put(strI00000oIO, arrayList4);
/* 533 */                                   IliiOOi1 iliiOOi1 = new IliiOOi1(i5);
/* 536 */                                   iliiOOi1.I00000oOI = strI00000oIO;
/* 538 */                                   iliiOOi1.I0000Il00O = context;
/* 540 */                                   iliiOOi1.I0000oI00 = arrayList2;
/* 542 */                                   iliiOOi1.I0000O = i3;
/* 544 */                                   VarHandle.storeStoreFence();
/* 547 */                                   ThreadPoolExecutor threadPoolExecutor = IliiOlIoO.I00000oOI;
/* 552 */                                   IioO0ilo1Ii iioO0ilo1Ii2 = new IioO0ilo1Ii(2);
/* 555 */                                   iioO0ilo1Ii2.I00000oOI = strI00000oIO;
/* 557 */                                   VarHandle.storeStoreFence();
/* 578 */                                   Handler handler2 = Looper.myLooper() == null ? new Handler(Looper.getMainLooper()) : new Handler();
/* 583 */                                   O10oO1IiI1 o10oO1IiI1 = new O10oO1IiI1(i5);
/* 586 */                                   o10oO1IiI1.I00iiI = iliiOOi1;
/* 588 */                                   o10oO1IiI1.I00iiO = iioO0ilo1Ii2;
/* 590 */                                   o10oO1IiI1.I00iio = handler2;
/* 592 */                                   threadPoolExecutor.execute(o10oO1IiI1);
                                        }
                                    } finally {
                                    }
                                }
                            }
                        } else {
/* 307 */                   if (arrayList2.size() > 1) {
/* 454 */                       I000II.I000iOII("Fallbacks with blocking fetches are not supported for performance reasons");
/* 12 */                        return null;
                            }
/* 313 */                   IliiOI0I0 iliiOI0I02 = (IliiOI0I0) arrayList2.get(0);
/* 315 */                   O1Il00 o1Il00 = IliiOlIoO.I00000oIO;
/* 321 */                   String strI00000oIO2 = IliiOlIoO.I00000oIO(i3, List.of(iliiOI0I02));
/* 331 */                   Typeface typeface2 = (Typeface) IliiOlIoO.I00000oIO.I0000Il00O(strI00000oIO2);
/* 333 */                   if (typeface2 != null) {
/* 337 */                       IlloOi1I1OO illoOi1I1OO2 = new IlloOi1I1OO(i5);
/* 340 */                       illoOi1I1OO2.I00iiI = oi00IilOloo0;
/* 342 */                       illoOi1I1OO2.I00iiO = typeface2;
/* 344 */                       VarHandle.storeStoreFence();
/* 347 */                       iI0i0l01ooIO.execute(illoOi1I1OO2);
/* 350 */                       typefaceBuild2 = typeface2;
                            } else if (i8 == -1) {
/* 359 */                       IliiOioI1l1I iliiOioI1l1II00000oOI = IliiOlIoO.I00000oOI(strI00000oIO2, context, List.of(iliiOI0I02), i3);
/* 363 */                       ioloOio0I.I00Iooi00oi(iliiOioI1l1II00000oOI);
/* 366 */                       typefaceBuild2 = iliiOioI1l1II00000oOI.I00000oIO;
                            } else {
/* 372 */                       IliiOOi1 iliiOOi12 = new IliiOOi1(i4);
/* 375 */                       iliiOOi12.I00000oOI = strI00000oIO2;
/* 377 */                       iliiOOi12.I0000Il00O = context;
/* 379 */                       iliiOOi12.I0000oI00 = iliiOI0I02;
/* 381 */                       iliiOOi12.I0000O = i3;
/* 383 */                       VarHandle.storeStoreFence();
                                try {
                                    try {
                                        try {
/* 399 */                                   IliiOioI1l1I iliiOioI1l1I = (IliiOioI1l1I) IliiOlIoO.I00000oOI.submit(iliiOOi12).get(i8, TimeUnit.MILLISECONDS);
/* 401 */                                   ioloOio0I.I00Iooi00oi(iliiOioI1l1I);
/* 404 */                                   typefaceBuild2 = iliiOioI1l1I.I00000oIO;
                                        } catch (InterruptedException e) {
/* 420 */                                   throw e;
                                        }
                                    } catch (ExecutionException e2) {
/* 426 */                               throw new RuntimeException(e2);
                                    } catch (TimeoutException unused2) {
/* 419 */                               throw new InterruptedException("timeout");
                                    }
                                } catch (InterruptedException unused3) {
/* 429 */                           II0i0l01ooIO iI0i0l01ooIO2 = (II0i0l01ooIO) ioloOio0I.I00iiO;
/* 433 */                           Oi00IilOloo0 oi00IilOloo02 = (Oi00IilOloo0) ioloOio0I.I00iiI;
/* 437 */                           IIiOiIiO01O iIiOiIiO01O = new IIiOiIiO01O(i4);
/* 440 */                           iIiOiIiO01O.I00iiO = oi00IilOloo02;
/* 442 */                           iIiOiIiO01O.I00iiI = -3;
/* 444 */                           VarHandle.storeStoreFence();
/* 447 */                           iI0i0l01ooIO2.execute(iIiOiIiO01O);
                                }
                            }
                        }
                    } else {
/* 603 */               IliiloiI1i iliiloiI1i = (IliiloiI1i) iliii01Iil;
/* 605 */               I00000oIO.getClass();
                        try {
/* 608 */                   IliioI1oiI[] iliioI1oiIArr = iliiloiI1i.I00000oIO;
/* 610 */                   int length = iliioI1oiIArr.length;
/* 611 */                   FontFamily.Builder builder = null;
/* 612 */                   while (i4 < length) {
/* 614 */                       IliioI1oiI iliioI1oiI = iliioI1oiIArr[i4];
                                try {
                                    try {
/* 649 */                               Font fontBuild = new Font.Builder(resources, iliioI1oiI.I0000oI00).setWeight(iliioI1oiI.I00000oIO).setSlant(iliioI1oiI.I00000oOI ? 1 : 0).setTtcIndex(iliioI1oiI.I0000O).setFontVariationSettings(iliioI1oiI.I0000Il00O).build();
/* 653 */                               if (builder == null) {
/* 657 */                                   builder = new FontFamily.Builder(fontBuild);
                                        } else {
/* 664 */                                   builder.addFont(fontBuild);
                                        }
                                    } catch (IOException unused4) {
                                    }
/* 674 */                           i4++;
                                } catch (Exception e3) {
/* 662 */                           e = e3;
/* 712 */                           Log.w("TypefaceCompatApi29Impl", "Font load failed", e);
/* 715 */                           if (i1I1OO00o1o != null) {
                                    }
/* 726 */                           if (typefaceBuild2 != null) {
                                    }
/* 1821 */                          return typefaceBuild2;
                                }
                            }
/* 679 */                   if (builder != null) {
/* 682 */                       FontFamily fontFamilyBuild2 = builder.build();
/* 703 */                       typefaceBuild2 = new Typeface.CustomFallbackBuilder(fontFamilyBuild2).setStyle(i1i0olI.I000l1(fontFamilyBuild2, i3).getStyle()).build();
                            }
                        } catch (Exception e4) {
/* 668 */                   e = e4;
                        }
/* 715 */               if (i1I1OO00o1o != null) {
/* 717 */                   if (typefaceBuild2 != null) {
/* 719 */                       i1I1OO00o1o.I00000oOI(typefaceBuild2);
                            } else {
/* 723 */                       i1I1OO00o1o.I00000oIO(-3);
                            }
                        }
                    }
/* 726 */           if (typefaceBuild2 != null) {
/* 734 */               I00000oOI.I0000O(I0000O(resources, i, str, i2, i3), typefaceBuild2);
                    }
/* 1821 */          return typefaceBuild2;
                }

                public static Typeface I0000Il00O(Resources resources, int i, String str, int i2, int i3) {
                    Typeface typefaceBuild;
/* 3 */             I00000oIO.getClass();
                    try {
/* 11 */                Font fontBuild = new Font.Builder(resources, i).build();
/* 37 */                typefaceBuild = new Typeface.CustomFallbackBuilder(new FontFamily.Builder(fontBuild).build()).setStyle(fontBuild.getStyle()).build();
                    } catch (Exception e) {
/* 47 */                Log.w("TypefaceCompatApi29Impl", "Font load failed", e);
/* 50 */                typefaceBuild = null;
                    }
/* 51 */            if (typefaceBuild != null) {
/* 59 */                I00000oOI.I0000O(I0000O(resources, i, str, i2, i3), typefaceBuild);
                    }
/* 399 */           return typefaceBuild;
                }

                public static String I0000O(Resources resources, int i, String str, int i2, int i3) {
/* 39 */            return resources.getResourcePackageName(i) + '-' + str + '-' + i2 + '-' + i + '-' + i3;
                }

                public static Typeface I0000oI00(String str) {
/* 2 */             if (str != null && !str.isEmpty()) {
/* 12 */                Typeface typefaceCreate = Typeface.create(str, 0);
/* 18 */                Typeface typefaceCreate2 = Typeface.create(Typeface.DEFAULT, 0);
/* 22 */                if (typefaceCreate != null && !typefaceCreate.equals(typefaceCreate2)) {
/* 30 */                    return typefaceCreate;
                        }
                    }
/* 1 */             return null;
                }

                public static Font I0001Ioi1lo(Typeface typeface) {
/* 1 */             Paint paint = I0000Il00O;
/* 3 */             if (paint == null) {
/* 7 */                 paint = new Paint();
/* 10 */                I0000Il00O = paint;
                    }
/* 14 */            paint.setTextSize(10.0f);
/* 19 */            I0000Il00O.setTypeface(typeface);
/* 33 */            PositionedGlyphs positionedGlyphsShapeTextRun = TextRunShaper.shapeTextRun((CharSequence) " ", 0, 1, 0, 1, 0.0f, 0.0f, false, I0000Il00O);
/* 41 */            if (positionedGlyphsShapeTextRun.glyphCount() == 0) {
/* 43 */                return null;
                    }
/* 46 */            return positionedGlyphsShapeTextRun.getFont(0);
                }
            }

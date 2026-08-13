            package p000;

            import android.content.Context;
            import android.graphics.Bitmap;
            import android.graphics.BitmapFactory;
            import android.graphics.Canvas;
            import android.graphics.ColorSpace;
            import android.graphics.Matrix;
            import android.graphics.Paint;
            import android.graphics.RectF;
            import android.graphics.drawable.BitmapDrawable;
            import java.lang.invoke.VarHandle;
            import java.util.Collection;
            import java.util.List;
            import java.util.Set;
            import javax.net.ssl.SSLPeerUnverifiedException;
            
            public final class I10oIiiliil extends O0iO10011II implements IllOOo00lI {
                public final int I00iOIl;
                public final Object I00iiI;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public I10oIiiliil(Object obj, int i) {
/* 6 */             super(0);
/* 1 */             this.I00iOIl = i;
/* 3 */             this.I00iiI = obj;
                }

                /* JADX WARN: Removed duplicated region for block: B:51:0x00f6  */
                @Override
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object invoke() throws Exception {
                    Il1IIl1 il1IIl1;
                    int i;
                    int iMin;
                    double dMax;
                    Bitmap bitmapCreateBitmap;
                    int i2;
/* 3 */             int i3 = this.I00iOIl;
/* 5 */             boolean z = false;
/* 7 */             Object obj = this.I00iiI;
                    switch (i3) {
                        case 0:
/* 796 */                   OoI1iOl0IoI ooI1iOl0IoI = (OoI1iOl0IoI) obj;
/* 800 */                   Object objI00olI = ooI1iOl0IoI.I00000oIO.I00olI();
/* 804 */                   Il0OoI0oO1Ii il0OoI0oO1Ii = Il0OoI0oO1Ii.I00iiO;
/* 806 */                   if (objI00olI == il0OoI0oO1Ii && ooI1iOl0IoI.I0000O.getValue() == il0OoI0oO1Ii) {
/* 816 */                       z = true;
                            }
/* 817 */                   return Boolean.valueOf(z);
                        case 1:
/* 792 */                   return (IoiOl011o) ((I1Oo1iio0) obj).I00o101lO.getValue();
                        case 2:
/* 93 */                    II0loOioolO iI0loOioolO = (II0loOioolO) obj;
/* 97 */                    BitmapFactory.Options options = new BitmapFactory.Options();
/* 100 */                   OIil0IlIIol oIil0IlIIol = iI0loOioolO.I00000oOI;
/* 104 */                   IoiOloi ioiOloi = iI0loOioolO.I00000oIO;
/* 110 */                   II0li0ooIOi iI0li0ooIOi = new II0li0ooIOi(ioiOloi.I00iOIl());
/* 115 */                   OOliO0 oOliO0 = new OOliO0(iI0li0ooIOi);
/* 118 */                   options.inJustDecodeBounds = true;
/* 126 */                   int i4 = 2;
/* 131 */                   BitmapFactory.decodeStream(new II101Ool(oOliO0.peek(), i4), null, options);
/* 134 */                   Exception exc = iI0li0ooIOi.I00iiI;
/* 136 */                   if (exc != null) {
/* 783 */                       throw exc;
                            }
/* 138 */                   options.inJustDecodeBounds = false;
/* 140 */                   Paint paint = Il1O11IioiI.I00000oIO;
/* 142 */                   String str = options.outMimeType;
/* 144 */                   Il1O00 il1O00 = iI0loOioolO.I0000O;
/* 146 */                   Set set = Il1O1lI00.I00000oIO;
/* 148 */                   int iOrdinal = il1O00.ordinal();
/* 156 */                   if (iOrdinal == 0) {
/* 247 */                       il1IIl1 = Il1IIl1.I0000Il00O;
                            } else {
/* 158 */                       if (iOrdinal != 1) {
/* 160 */                           if (iOrdinal != 2) {
/* 163 */                               I000II.I00000oIO();
/* 130 */                               return null;
                                    }
                                } else if (str == null || !Il1O1lI00.I00000oIO.contains(str)) {
                                }
/* 188 */                       II101Ool iI101Ool = new II101Ool(oOliO0.peek(), i4);
/* 191 */                       Il1IooOOi11i il1IooOOi11i = new Il1IooOOi11i();
/* 194 */                       il1IooOOi11i.I00iOIl = iI101Ool;
/* 198 */                       il1IooOOi11i.I00iiI = 1073741824;
/* 200 */                       VarHandle.storeStoreFence();
/* 203 */                       Il1Ilio1Ol1 il1Ilio1Ol1 = new Il1Ilio1Ol1(il1IooOOi11i);
/* 210 */                       int iI0000O = il1Ilio1Ol1.I0000O(1, "Orientation");
/* 227 */                       boolean z2 = iI0000O == 2 || iI0000O == 7 || iI0000O == 4 || iI0000O == 5;
                                switch (il1Ilio1Ol1.I0000O(1, "Orientation")) {
                                    case 3:
                                    case 4:
/* 241 */                               i2 = 180;
                                        break;
                                    case 5:
                                    case 8:
/* 239 */                               i2 = 270;
                                        break;
                                    case 6:
                                    case 7:
/* 237 */                               i2 = 90;
                                        break;
                                    default:
/* 235 */                               i2 = 0;
                                        break;
                                }
/* 243 */                       il1IIl1 = new Il1IIl1(z2, i2);
                            }
/* 249 */                   int i5 = il1IIl1.I00000oIO;
/* 251 */                   boolean z3 = il1IIl1.I00000oOI;
/* 253 */                   Exception exc2 = iI0li0ooIOi.I00iiI;
/* 255 */                   if (exc2 != null) {
/* 782 */                       throw exc2;
                            }
/* 257 */                   options.inMutable = false;
/* 259 */                   ColorSpace colorSpace = oIil0IlIIol.I0000Il00O;
/* 261 */                   Context context = oIil0IlIIol.I00000oIO;
/* 263 */                   Ol0i11lo1l1I ol0i11lo1l1I = oIil0IlIIol.I0000O;
/* 265 */                   if (colorSpace != null) {
/* 267 */                       options.inPreferredColorSpace = colorSpace;
                            }
/* 271 */                   options.inPremultiplied = oIil0IlIIol.I000O01llI0;
/* 273 */                   Bitmap.Config config = oIil0IlIIol.I00000oOI;
/* 275 */                   if ((z3 || i5 > 0) && (config == null || config == Bitmap.Config.HARDWARE)) {
/* 285 */                       config = Bitmap.Config.ARGB_8888;
                            }
/* 290 */                   if (oIil0IlIIol.I000II && config == Bitmap.Config.ARGB_8888 && O0000Ioio00.I0000O(options.outMimeType, "image/jpeg")) {
/* 306 */                       config = Bitmap.Config.RGB_565;
                            }
/* 308 */                   Bitmap.Config config2 = options.outConfig;
/* 310 */                   Bitmap.Config config3 = Bitmap.Config.RGBA_F16;
/* 312 */                   if (config2 == config3 && config != Bitmap.Config.HARDWARE) {
/* 318 */                       config = config3;
                            }
/* 319 */                   options.inPreferredConfig = config;
/* 321 */                   ioOiI0O0I iooii0o0iI000O01llI0 = ioiOloi.I000O01llI0();
/* 327 */                   if ((iooii0o0iI000O01llI0 instanceof Oi0loOI1I0l) && O0000Ioio00.I0000O(ol0i11lo1l1I, Ol0i11lo1l1I.I0000Il00O)) {
/* 337 */                       options.inSampleSize = 1;
/* 339 */                       options.inScaled = true;
/* 345 */                       options.inDensity = ((Oi0loOI1I0l) iooii0o0iI000O01llI0).I00000oIO;
/* 357 */                       options.inTargetDensity = context.getResources().getDisplayMetrics().densityDpi;
                            } else {
/* 361 */                       int i6 = options.outWidth;
/* 363 */                       if (i6 <= 0 || (i = options.outHeight) <= 0) {
/* 554 */                           options.inSampleSize = 1;
/* 556 */                           z = false;
/* 557 */                           options.inScaled = false;
                                } else {
/* 379 */                           int i7 = (i5 == 90 || i5 == 270) ? i : i6;
/* 380 */                           if (i5 != 90 && i5 != 270) {
/* 385 */                               i6 = i;
                                    }
/* 386 */                           OiO0llO0IO oiO0llO0IO = oIil0IlIIol.I0000oI00;
/* 388 */                           Ol0i11lo1l1I ol0i11lo1l1I2 = Ol0i11lo1l1I.I0000Il00O;
/* 400 */                           int iI0000O2 = O0000Ioio00.I0000O(ol0i11lo1l1I, ol0i11lo1l1I2) ? i7 : I000O01llI0.I0000O(ol0i11lo1l1I.I00000oIO, oiO0llO0IO);
/* 414 */                           int iI0000O3 = O0000Ioio00.I0000O(ol0i11lo1l1I, ol0i11lo1l1I2) ? i6 : I000O01llI0.I0000O(ol0i11lo1l1I.I00000oOI, oiO0llO0IO);
/* 420 */                           int iHighestOneBit = Integer.highestOneBit(i7 / iI0000O2);
/* 426 */                           int iHighestOneBit2 = Integer.highestOneBit(i6 / iI0000O3);
/* 430 */                           int iOrdinal2 = oiO0llO0IO.ordinal();
/* 434 */                           if (iOrdinal2 == 0) {
/* 449 */                               iMin = Math.min(iHighestOneBit, iHighestOneBit2);
                                    } else {
/* 436 */                               if (iOrdinal2 != 1) {
/* 443 */                                   I000II.I00000oIO();
/* 446 */                                   return null;
                                        }
/* 438 */                               iMin = Math.max(iHighestOneBit, iHighestOneBit2);
                                    }
/* 453 */                           if (iMin < 1) {
/* 455 */                               iMin = 1;
                                    }
/* 456 */                           options.inSampleSize = iMin;
                                    double d = iMin;
/* 471 */                           double d2 = iI0000O2 / (i7 / d);
/* 473 */                           double d3 = iI0000O3 / (i6 / d);
/* 475 */                           int iOrdinal3 = oiO0llO0IO.ordinal();
/* 479 */                           if (iOrdinal3 == 0) {
/* 493 */                               dMax = Math.max(d2, d3);
                                    } else {
/* 482 */                               if (iOrdinal3 != 1) {
/* 489 */                                   I000II.I00000oIO();
/* 446 */                                   return null;
                                        }
/* 484 */                               dMax = Math.min(d2, d3);
                                    }
/* 501 */                           if (oIil0IlIIol.I0001Ioi1lo && dMax > 1.0d) {
/* 507 */                               dMax = 1.0d;
                                    }
/* 514 */                           boolean z4 = dMax == 1.0d;
/* 517 */                           options.inScaled = !z4;
/* 519 */                           if (!z4) {
/* 531 */                               if (dMax > 1.0d) {
/* 538 */                                   options.inDensity = O1OooO0IlOo.I0001Ioi1lo(2.147483647E9d / dMax);
/* 540 */                                   options.inTargetDensity = Integer.MAX_VALUE;
                                        } else {
/* 544 */                                   options.inDensity = Integer.MAX_VALUE;
/* 551 */                                   options.inTargetDensity = O1OooO0IlOo.I0001Ioi1lo(2.147483647E9d * dMax);
                                        }
                                    }
/* 542 */                           z = false;
                                }
                            }
                            try {
/* 566 */                       Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(new II101Ool(oOliO0, 2), null, options);
/* 570 */                       oOliO0.close();
/* 573 */                       Exception exc3 = iI0li0ooIOi.I00iiI;
/* 575 */                       if (exc3 != null) {
/* 773 */                           throw exc3;
                                }
/* 577 */                       if (bitmapDecodeStream == null) {
/* 768 */                           I000II.I001IO000("BitmapFactory returned a null bitmap. Often this means BitmapFactory could not decode the image data read from the input source (e.g. network, disk, or memory) as it's not encoded as a valid image format.");
/* 565 */                           return null;
                                }
/* 589 */                       bitmapDecodeStream.setDensity(context.getResources().getDisplayMetrics().densityDpi);
/* 592 */                       if (z3 || i5 > 0) {
/* 598 */                           Matrix matrix = new Matrix();
/* 608 */                           float width = bitmapDecodeStream.getWidth() / 2.0f;
/* 614 */                           float height = bitmapDecodeStream.getHeight() / 2.0f;
/* 615 */                           if (z3) {
/* 621 */                               matrix.postScale(-1.0f, 1.0f, width, height);
                                    }
/* 624 */                           if (i5 > 0) {
/* 627 */                               matrix.postRotate(i5, width, height);
                                    }
/* 643 */                           RectF rectF = new RectF(0.0f, 0.0f, bitmapDecodeStream.getWidth(), bitmapDecodeStream.getHeight());
/* 646 */                           matrix.mapRect(rectF);
/* 649 */                           float f = rectF.left;
/* 653 */                           if (f != 0.0f || rectF.top != 0.0f) {
/* 668 */                               matrix.postTranslate(-f, -rectF.top);
                                    }
/* 672 */                           if (i5 == 90 || i5 == 270) {
/* 700 */                               int height2 = bitmapDecodeStream.getHeight();
/* 704 */                               int width2 = bitmapDecodeStream.getWidth();
/* 708 */                               Bitmap.Config config4 = bitmapDecodeStream.getConfig();
/* 712 */                               if (config4 == null) {
/* 714 */                                   config4 = Bitmap.Config.ARGB_8888;
                                        }
/* 716 */                               bitmapCreateBitmap = Bitmap.createBitmap(height2, width2, config4);
                                    } else {
/* 679 */                               int width3 = bitmapDecodeStream.getWidth();
/* 683 */                               int height3 = bitmapDecodeStream.getHeight();
/* 687 */                               Bitmap.Config config5 = bitmapDecodeStream.getConfig();
/* 691 */                               if (config5 == null) {
/* 693 */                                   config5 = Bitmap.Config.ARGB_8888;
                                        }
/* 695 */                               bitmapCreateBitmap = Bitmap.createBitmap(width3, height3, config5);
                                    }
/* 727 */                           new Canvas(bitmapCreateBitmap).drawBitmap(bitmapDecodeStream, matrix, Il1O11IioiI.I00000oIO);
/* 730 */                           bitmapDecodeStream.recycle();
/* 733 */                           bitmapDecodeStream = bitmapCreateBitmap;
                                }
/* 742 */                       BitmapDrawable bitmapDrawable = new BitmapDrawable(context.getResources(), bitmapDecodeStream);
/* 748 */                       if (options.inSampleSize > 1 || options.inScaled) {
/* 754 */                           z = true;
                                }
/* 755 */                       Ii1iIolil1 ii1iIolil1 = new Ii1iIolil1();
/* 758 */                       ii1iIolil1.I00000oIO = bitmapDrawable;
/* 760 */                       ii1iIolil1.I00000oOI = z;
/* 762 */                       VarHandle.storeStoreFence();
/* 772 */                       return ii1iIolil1;
                            } catch (Throwable th) {
                                try {
/* 776 */                           throw th;
                                } catch (Throwable th2) {
/* 778 */                           ii1OOii.I00000oIO(oOliO0, th);
/* 781 */                           throw th2;
                                }
                            }
                        case 3:
/* 84 */                    I10o01O0oo0I i10o01O0oo0I = new I10o01O0oo0I(1);
/* 87 */                    i10o01O0oo0I.I00iiI = (Iilo1I) obj;
/* 89 */                    VarHandle.storeStoreFence();
/* 92 */                    return i10o01O0oo0I;
                        case 4:
/* 77 */                    return (List) obj;
                        case 5:
                            try {
/* 71 */                        return (List) ((IllOOo00lI) obj).invoke();
                            } catch (SSLPeerUnverifiedException unused) {
/* 74 */                        return Il01100l.I00iOIl;
                            }
                        default:
/* 24 */                    Collection<OiolI10I1oOO> collectionI0000O = ((Oiool011li) obj).I00l0I0l0lO1.I0000Il00O().I0000Il00O.I0000O();
/* 32 */                    if (!collectionI0000O.isEmpty()) {
/* 42 */                        for (OiolI10I1oOO oiolI10I1oOO : collectionI0000O) {
/* 54 */                            if (oiolI10I1oOO.I0000O() || oiolI10I1oOO.I0000oI00()) {
                                    }
                                }
                            }
/* 62 */                    return OoiIlOl1iI.I00000oIO;
                    }
                }
            }

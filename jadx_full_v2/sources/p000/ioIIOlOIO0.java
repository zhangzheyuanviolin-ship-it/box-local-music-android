            package p000;

            import android.graphics.Bitmap;
            import android.graphics.ColorSpace;
            import android.os.Build;
            import android.util.DisplayMetrics;
            import java.lang.invoke.VarHandle;
            import java.util.Arrays;
            
            public abstract class ioIIOlOIO0 {
                /* JADX WARN: Removed duplicated region for block: B:59:0x0122 A[PHI: r1
                  0x0122: PHI (r1v52 android.graphics.ColorSpace) = (r1v38 android.graphics.ColorSpace), (r1v49 android.graphics.ColorSpace) binds: [B:58:0x0120, B:66:0x013d] A[DONT_GENERATE, DONT_INLINE]] */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public static I0oO00o I00000oIO(int i, int i2, int i3) {
                    ColorSpace rgb;
                    ColorSpace.Rgb rgb2;
                    ColorSpace colorSpace;
/* 1 */             Oi1IOl oi1IOl = IOOlIOOi0O0.I0000oI00;
/* 3 */             iOIlOlI0Ii.I00000oOI(i3);
/* 6 */             Bitmap.Config configI00000oOI = iOIlOlI0Ii.I00000oOI(i3);
/* 14 */            if (O0000Ioio00.I0000O(oi1IOl, oi1IOl)) {
/* 18 */                rgb = ColorSpace.get(ColorSpace.Named.SRGB);
                    } else if (O0000Ioio00.I0000O(oi1IOl, IOOlIOOi0O0.I00100o1O0lo)) {
/* 35 */                rgb = ColorSpace.get(ColorSpace.Named.ACES);
                    } else if (O0000Ioio00.I0000O(oi1IOl, IOOlIOOi0O0.I0010I0i)) {
/* 50 */                rgb = ColorSpace.get(ColorSpace.Named.ACESCG);
                    } else if (O0000Ioio00.I0000O(oi1IOl, IOOlIOOi0O0.I000oI1ioi)) {
/* 65 */                rgb = ColorSpace.get(ColorSpace.Named.ADOBE_RGB);
                    } else if (O0000Ioio00.I0000O(oi1IOl, IOOlIOOi0O0.I000OiO)) {
/* 80 */                rgb = ColorSpace.get(ColorSpace.Named.BT2020);
                    } else if (O0000Ioio00.I0000O(oi1IOl, IOOlIOOi0O0.I000OOo1O)) {
/* 95 */                rgb = ColorSpace.get(ColorSpace.Named.BT709);
                    } else if (O0000Ioio00.I0000O(oi1IOl, IOOlIOOi0O0.I00111O)) {
/* 110 */               rgb = ColorSpace.get(ColorSpace.Named.CIE_LAB);
                    } else if (O0000Ioio00.I0000O(oi1IOl, IOOlIOOi0O0.I0010o)) {
/* 125 */               rgb = ColorSpace.get(ColorSpace.Named.CIE_XYZ);
                    } else if (O0000Ioio00.I0000O(oi1IOl, IOOlIOOi0O0.I000iOII)) {
/* 140 */               rgb = ColorSpace.get(ColorSpace.Named.DCI_P3);
                    } else if (O0000Ioio00.I0000O(oi1IOl, IOOlIOOi0O0.I000l1)) {
/* 155 */               rgb = ColorSpace.get(ColorSpace.Named.DISPLAY_P3);
                    } else if (O0000Ioio00.I0000O(oi1IOl, IOOlIOOi0O0.I000II)) {
/* 171 */               rgb = ColorSpace.get(ColorSpace.Named.EXTENDED_SRGB);
                    } else if (O0000Ioio00.I0000O(oi1IOl, IOOlIOOi0O0.I000O01llI0)) {
/* 187 */               rgb = ColorSpace.get(ColorSpace.Named.LINEAR_EXTENDED_SRGB);
                    } else if (O0000Ioio00.I0000O(oi1IOl, IOOlIOOi0O0.I0001Ioi1lo)) {
/* 203 */               rgb = ColorSpace.get(ColorSpace.Named.LINEAR_SRGB);
                    } else if (O0000Ioio00.I0000O(oi1IOl, IOOlIOOi0O0.I000lI)) {
/* 219 */               rgb = ColorSpace.get(ColorSpace.Named.NTSC_1953);
                    } else if (O0000Ioio00.I0000O(oi1IOl, IOOlIOOi0O0.I00100l0)) {
/* 235 */               rgb = ColorSpace.get(ColorSpace.Named.PRO_PHOTO_RGB);
                    } else {
/* 247 */               if (!O0000Ioio00.I0000O(oi1IOl, IOOlIOOi0O0.I000o00OoI0I)) {
/* 288 */                   ColorSpace colorSpace2 = O0000Ioio00.I0000O(oi1IOl, IOOlIOOi0O0.I001IO000) ? ColorSpace.get(ColorSpace.Named.BT2020_HLG) : O0000Ioio00.I0000O(oi1IOl, IOOlIOOi0O0.I001i1O0Ol) ? ColorSpace.get(ColorSpace.Named.BT2020_PQ) : null;
/* 289 */                   if (colorSpace2 == null) {
/* 298 */                       if (Build.VERSION.SDK_INT >= 36) {
/* 317 */                           colorSpace2 = O0000Ioio00.I0000O(oi1IOl, IOOlIOOi0O0.I001i1lo1io) ? ColorSpace.get(ColorSpace.Named.OK_LAB) : null;
/* 318 */                           if (colorSpace2 != null) {
/* 291 */                               colorSpace = colorSpace2;
                                    }
                                }
/* 321 */                       if (oi1IOl != null) {
/* 323 */                           String str = oi1IOl.I00000oIO;
/* 327 */                           float[] fArrI00000oIO = oi1IOl.I0000O.I00000oIO();
/* 331 */                           OoI0i1io ooI0i1io = oi1IOl.I000II;
/* 359 */                           ColorSpace.Rgb.TransferParameters transferParameters = ooI0i1io != null ? new ColorSpace.Rgb.TransferParameters(ooI0i1io.I00000oOI, ooI0i1io.I0000Il00O, ooI0i1io.I0000O, ooI0i1io.I0000oI00, ooI0i1io.I0001Ioi1lo, ooI0i1io.I000II, ooI0i1io.I00000oIO) : null;
/* 363 */                           float[] fArr = oi1IOl.I000OOo1O;
/* 366 */                           if (transferParameters != null) {
/* 372 */                               rgb2 = new ColorSpace.Rgb(str, oi1IOl.I000O01llI0, fArrI00000oIO, transferParameters);
/* 381 */                               if (!Float.isNaN(fArr[0]) && !Arrays.equals(rgb2.getTransform(), fArr)) {
/* 398 */                                   rgb = new ColorSpace.Rgb(str, fArr, transferParameters);
                                        }
                                    } else {
/* 405 */                               float[] fArr2 = oi1IOl.I000O01llI0;
/* 407 */                               Oi1IIIOloilO oi1IIIOloilO = oi1IOl.I000l1;
/* 411 */                               IOOlI0o iOOlI0o = new IOOlI0o(0);
/* 414 */                               iOOlI0o.I00000oOI = oi1IIIOloilO;
/* 416 */                               VarHandle.storeStoreFence();
/* 419 */                               Oi1IIIOloilO oi1IIIOloilO2 = oi1IOl.I000oI1ioi;
/* 424 */                               IOOlI0o iOOlI0o2 = new IOOlI0o(1);
/* 427 */                               iOOlI0o2.I00000oOI = oi1IIIOloilO2;
/* 429 */                               VarHandle.storeStoreFence();
/* 436 */                               rgb2 = new ColorSpace.Rgb(str, fArr2, fArrI00000oIO, iOOlI0o, iOOlI0o2, oi1IOl.I0000oI00, oi1IOl.I0001Ioi1lo);
                                    }
/* 394 */                           colorSpace = rgb2;
                                } else {
/* 442 */                           rgb = ColorSpace.get(ColorSpace.Named.SRGB);
                                }
                            }
/* 460 */                   return new I0oO00o(Bitmap.createBitmap((DisplayMetrics) null, i, i2, configI00000oOI, true, colorSpace));
                        }
/* 251 */               rgb = ColorSpace.get(ColorSpace.Named.SMPTE_C);
                    }
/* 22 */            colorSpace = rgb;
/* 460 */           return new I0oO00o(Bitmap.createBitmap((DisplayMetrics) null, i, i2, configI00000oOI, true, colorSpace));
                }
            }

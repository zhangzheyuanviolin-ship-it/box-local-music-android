            package p000;

            import com.google.ai.edge.gallery.BuildConfig;
            import com.google.mlkit.vision.barcode.common.Barcode;
            import com.google.mlkit.vision.common.InputImage;
            import com.google.mlkit.vision.pose.PoseLandmark;
            import java.lang.reflect.Field;
            import java.nio.charset.Charset;
            import java.security.AccessController;
            import java.util.Arrays;
            import java.util.Iterator;
            import java.util.List;
            import java.util.Map;
            import sun.misc.Unsafe;
            
            public final class i11lOO implements i11lo1 {
                public static final int[] I000l1 = new int[0];
                public static final Unsafe I000lI;
                public int[] I00000oIO;
                public Object[] I00000oOI;
                public int I0000Il00O;
                public int I0000O;
                public i1111ll I0000oI00;
                public boolean I0001Ioi1lo;
                public int[] I000II;
                public int I000O01llI0;
                public int I000OOo1O;
                public loIOiIO1O1 I000OiO;
                public liIoOiiO1Oi I000iOII;

                static {
                    Unsafe unsafe;
                    try {
/* 16 */                unsafe = (Unsafe) AccessController.doPrivileged(new OoiioO0o(3));
                    } catch (Throwable unused) {
/* 19 */                unsafe = null;
                    }
/* 20 */            I000lI = unsafe;
                }

                public static boolean I00100l0(Object obj) {
/* 1 */             if (obj == null) {
/* 3 */                 return false;
                    }
/* 7 */             if (obj instanceof i11O1oIl) {
/* 11 */                return ((i11O1oIl) obj).I000II();
                    }
/* 16 */            return true;
                }

                public static final int I0010I0i(byte[] bArr, int i, int i2, i11oIoi1 i11oioi1, Class cls, i111i0I1 i111i0i1) {
/* 1 */             i11oIoi1 i11oioi12 = i11oIoi1.I00iiO;
                    switch (i11oioi1.ordinal()) {
                        case 0:
/* 164 */                   int i3 = i + 8;
/* 178 */                   i111i0i1.I0000Il00O = Double.valueOf(Double.longBitsToDouble(liOI1I0oIO.I000oI1ioi(i, bArr)));
/* 180 */                   return i3;
                        case 1:
/* 147 */                   int i4 = i + 4;
/* 161 */                   i111i0i1.I0000Il00O = Float.valueOf(Float.intBitsToFloat(liOI1I0oIO.I00000oOI(i, bArr)));
/* 163 */                   return i4;
                        case 2:
                        case 3:
/* 134 */                   int iI000iOII = liOI1I0oIO.I000iOII(bArr, i, i111i0i1);
/* 144 */                   i111i0i1.I0000Il00O = Long.valueOf(i111i0i1.I00000oOI);
/* 146 */                   return iI000iOII;
                        case 4:
                        case 12:
                        case 13:
/* 121 */                   int iI000O01llI0 = liOI1I0oIO.I000O01llI0(bArr, i, i111i0i1);
/* 131 */                   i111i0i1.I0000Il00O = Integer.valueOf(i111i0i1.I00000oIO);
/* 133 */                   return iI000O01llI0;
                        case 5:
                        case 15:
/* 108 */                   int i5 = i + 8;
/* 118 */                   i111i0i1.I0000Il00O = Long.valueOf(liOI1I0oIO.I000oI1ioi(i, bArr));
/* 120 */                   return i5;
                        case 6:
                        case 14:
/* 95 */                    int i6 = i + 4;
/* 105 */                   i111i0i1.I0000Il00O = Integer.valueOf(liOI1I0oIO.I00000oOI(i, bArr));
/* 107 */                   return i6;
                        case 7:
/* 73 */                    int iI000iOII2 = liOI1I0oIO.I000iOII(bArr, i, i111i0i1);
/* 92 */                    i111i0i1.I0000Il00O = Boolean.valueOf(i111i0i1.I00000oOI != 0);
/* 94 */                    return iI000iOII2;
                        case 8:
/* 68 */                    return liOI1I0oIO.I0001Ioi1lo(bArr, i, i111i0i1);
                        case 9:
                        default:
/* 17 */                    throw new RuntimeException("unsupported field type.");
                        case 10:
/* 63 */                    return liOI1I0oIO.I0000Il00O(i11liii0.I0000Il00O.I00000oIO(cls), bArr, i, i2, i111i0i1);
                        case 11:
/* 52 */                    return liOI1I0oIO.I00000oIO(bArr, i, i111i0i1);
                        case 16:
/* 35 */                    int iI000O01llI02 = liOI1I0oIO.I000O01llI0(bArr, i, i111i0i1);
/* 49 */                    i111i0i1.I0000Il00O = Integer.valueOf(liOIi1io0lo.I00000oIO(i111i0i1.I00000oIO));
/* 51 */                    return iI000O01llI02;
                        case 17:
/* 18 */                    int iI000iOII3 = liOI1I0oIO.I000iOII(bArr, i, i111i0i1);
/* 32 */                    i111i0i1.I0000Il00O = Long.valueOf(liOIi1io0lo.I00000oOI(i111i0i1.I00000oOI));
/* 34 */                    return iI000iOII3;
                    }
                }

                public static i11o1i I00111O(Object obj) {
/* 1 */             i11O1oIl i11o1oil = (i11O1oIl) obj;
/* 3 */             i11o1i i11o1iVar = i11o1oil.zbc;
/* 7 */             if (i11o1iVar != i11o1i.I0001Ioi1lo) {
/* 29 */                return i11o1iVar;
                    }
/* 9 */             i11o1i i11o1iVarI00000oOI = i11o1i.I00000oOI();
/* 13 */            i11o1oil.zbc = i11o1iVarI00000oOI;
/* 29 */            return i11o1iVarI00000oOI;
                }

                public static int I001IIilI0O(long j, Object obj) {
/* 7 */             return ((Integer) i11oI1O.I000II(j, obj)).intValue();
                }

                public static int I001i1O0Ol(int i) {
/* 3 */             return (i >>> 20) & 255;
                }

                public static long I001iOo1i0O(long j, Object obj) {
/* 7 */             return ((Long) i11oI1O.I000II(j, obj)).longValue();
                }

                public static Field I00II0Ol1O0l(Class cls, String str) {
                    try {
/* 1 */                 return cls.getDeclaredField(str);
                    } catch (NoSuchFieldException unused) {
/* 6 */                 Field[] declaredFields = cls.getDeclaredFields();
/* 12 */                for (Field field : declaredFields) {
/* 24 */                    if (str.equals(field.getName())) {
/* 26 */                        return field;
                            }
                        }
/* 48 */                IoOOl0iOl1io.I0001Ioi1lo(Arrays.toString(declaredFields), IIl001iO0Io.I00111O("Field ", str, " for ", cls.getName(), " not found. Known fields are "));
/* 51 */                return null;
                    }
                }

                @Override
                public final boolean I00000oIO(i11O1oIl i11o1oil, i11O1oIl i11o1oil2) {
                    boolean zI0000oI00;
/* 1 */             int[] iArr = this.I00000oIO;
/* 4 */             int i = 0;
                    while (true) {
/* 6 */                 if (i < iArr.length) {
/* 8 */                     int iI001i1lo1io = I001i1lo1io(i);
/* 15 */                    long j = iI001i1lo1io & 1048575;
                            switch (I001i1O0Ol(iI001i1lo1io)) {
                                case 0:
/* 432 */                           if (!I000lI(i11o1oil, i11o1oil2, i)) {
                                        break;
                                    } else {
/* 434 */                               Ooil0oIOI0l0 ooil0oIOI0l0 = i11oI1O.I0000Il00O;
/* 454 */                               if (Double.doubleToLongBits(ooil0oIOI0l0.I000iOII(j, i11o1oil)) != Double.doubleToLongBits(ooil0oIOI0l0.I000iOII(j, i11o1oil2))) {
                                            break;
                                        } else {
                                            continue;
/* 456 */                                   i += 3;
                                        }
                                    }
                                case 1:
/* 405 */                           if (!I000lI(i11o1oil, i11o1oil2, i)) {
                                        break;
                                    } else {
/* 407 */                               Ooil0oIOI0l0 ooil0oIOI0l02 = i11oI1O.I0000Il00O;
/* 425 */                               if (Float.floatToIntBits(ooil0oIOI0l02.I000l1(j, i11o1oil)) != Float.floatToIntBits(ooil0oIOI0l02.I000l1(j, i11o1oil2))) {
                                            break;
                                        } else {
                                            continue;
/* 456 */                                   i += 3;
                                        }
                                    }
                                case 2:
/* 386 */                           if (!I000lI(i11o1oil, i11o1oil2, i) || i11oI1O.I0001Ioi1lo(j, i11o1oil) != i11oI1O.I0001Ioi1lo(j, i11o1oil2)) {
                                        break;
                                    } else {
                                        continue;
/* 456 */                               i += 3;
                                    }
                                    break;
                                case 3:
/* 367 */                           if (!I000lI(i11o1oil, i11o1oil2, i) || i11oI1O.I0001Ioi1lo(j, i11o1oil) != i11oI1O.I0001Ioi1lo(j, i11o1oil2)) {
                                        break;
                                    } else {
                                        continue;
/* 456 */                               i += 3;
                                    }
                                    break;
                                case 4:
/* 350 */                           if (!I000lI(i11o1oil, i11o1oil2, i) || i11oI1O.I0000oI00(j, i11o1oil) != i11oI1O.I0000oI00(j, i11o1oil2)) {
                                        break;
                                    } else {
                                        continue;
/* 456 */                               i += 3;
                                    }
                                    break;
                                case 5:
/* 330 */                           if (!I000lI(i11o1oil, i11o1oil2, i) || i11oI1O.I0001Ioi1lo(j, i11o1oil) != i11oI1O.I0001Ioi1lo(j, i11o1oil2)) {
                                        break;
                                    } else {
                                        continue;
/* 456 */                               i += 3;
                                    }
                                    break;
                                case 6:
/* 312 */                           if (!I000lI(i11o1oil, i11o1oil2, i) || i11oI1O.I0000oI00(j, i11o1oil) != i11oI1O.I0000oI00(j, i11o1oil2)) {
                                        break;
                                    } else {
                                        continue;
/* 456 */                               i += 3;
                                    }
                                    break;
                                case 7:
/* 292 */                           if (!I000lI(i11o1oil, i11o1oil2, i)) {
                                        break;
                                    } else {
/* 294 */                               Ooil0oIOI0l0 ooil0oIOI0l03 = i11oI1O.I0000Il00O;
/* 304 */                               if (ooil0oIOI0l03.I00100o1O0lo(j, i11o1oil) != ooil0oIOI0l03.I00100o1O0lo(j, i11o1oil2)) {
                                            break;
                                        } else {
                                            continue;
/* 456 */                                   i += 3;
                                        }
                                    }
                                case 8:
/* 270 */                           if (!I000lI(i11o1oil, i11o1oil2, i) || !i11o00oiil.I0000oI00(i11oI1O.I000II(j, i11o1oil), i11oI1O.I000II(j, i11o1oil2))) {
                                        break;
                                    } else {
                                        continue;
/* 456 */                               i += 3;
                                    }
                                    break;
                                case 9:
/* 248 */                           if (!I000lI(i11o1oil, i11o1oil2, i) || !i11o00oiil.I0000oI00(i11oI1O.I000II(j, i11o1oil), i11oI1O.I000II(j, i11o1oil2))) {
                                        break;
                                    } else {
                                        continue;
/* 456 */                               i += 3;
                                    }
                                    break;
                                case 10:
/* 226 */                           if (!I000lI(i11o1oil, i11o1oil2, i) || !i11o00oiil.I0000oI00(i11oI1O.I000II(j, i11o1oil), i11oI1O.I000II(j, i11o1oil2))) {
                                        break;
                                    } else {
                                        continue;
/* 456 */                               i += 3;
                                    }
                                    break;
                                case 11:
/* 208 */                           if (!I000lI(i11o1oil, i11o1oil2, i) || i11oI1O.I0000oI00(j, i11o1oil) != i11oI1O.I0000oI00(j, i11o1oil2)) {
                                        break;
                                    } else {
                                        continue;
/* 456 */                               i += 3;
                                    }
                                    break;
                                case 12:
/* 190 */                           if (!I000lI(i11o1oil, i11o1oil2, i) || i11oI1O.I0000oI00(j, i11o1oil) != i11oI1O.I0000oI00(j, i11o1oil2)) {
                                        break;
                                    } else {
                                        continue;
/* 456 */                               i += 3;
                                    }
                                    break;
                                case 13:
/* 172 */                           if (!I000lI(i11o1oil, i11o1oil2, i) || i11oI1O.I0000oI00(j, i11o1oil) != i11oI1O.I0000oI00(j, i11o1oil2)) {
                                        break;
                                    } else {
                                        continue;
/* 456 */                               i += 3;
                                    }
                                    break;
                                case 14:
/* 152 */                           if (!I000lI(i11o1oil, i11o1oil2, i) || i11oI1O.I0001Ioi1lo(j, i11o1oil) != i11oI1O.I0001Ioi1lo(j, i11o1oil2)) {
                                        break;
                                    } else {
                                        continue;
/* 456 */                               i += 3;
                                    }
                                    break;
                                case 15:
/* 134 */                           if (!I000lI(i11o1oil, i11o1oil2, i) || i11oI1O.I0000oI00(j, i11o1oil) != i11oI1O.I0000oI00(j, i11o1oil2)) {
                                        break;
                                    } else {
                                        continue;
/* 456 */                               i += 3;
                                    }
                                    break;
                                case 16:
/* 114 */                           if (!I000lI(i11o1oil, i11o1oil2, i) || i11oI1O.I0001Ioi1lo(j, i11o1oil) != i11oI1O.I0001Ioi1lo(j, i11o1oil2)) {
                                        break;
                                    } else {
                                        continue;
/* 456 */                               i += 3;
                                    }
                                    break;
                                case 17:
/* 92 */                            if (!I000lI(i11o1oil, i11o1oil2, i) || !i11o00oiil.I0000oI00(i11oI1O.I000II(j, i11o1oil), i11oI1O.I000II(j, i11o1oil2))) {
                                        break;
                                    } else {
                                        continue;
/* 456 */                               i += 3;
                                    }
                                    break;
                                case PoseLandmark.RIGHT_PINKY:
                                case PoseLandmark.LEFT_INDEX:
                                case PoseLandmark.RIGHT_INDEX:
                                case PoseLandmark.LEFT_THUMB:
                                case PoseLandmark.RIGHT_THUMB:
                                case PoseLandmark.LEFT_HIP:
                                case PoseLandmark.RIGHT_HIP:
                                case PoseLandmark.LEFT_KNEE:
                                case PoseLandmark.RIGHT_KNEE:
                                case 27:
                                case PoseLandmark.RIGHT_ANKLE:
                                case PoseLandmark.LEFT_HEEL:
                                case 30:
                                case PoseLandmark.LEFT_FOOT_INDEX:
                                case 32:
                                case 33:
                                case 34:
                                case InputImage.IMAGE_FORMAT_YUV_420_888:
                                case 36:
                                case 37:
                                case 38:
                                case 39:
                                case 40:
                                case 41:
                                case 42:
                                case 43:
                                case 44:
                                case BuildConfig.VERSION_CODE:
                                case 46:
                                case 47:
                                case 48:
                                case 49:
/* 80 */                            zI0000oI00 = i11o00oiil.I0000oI00(i11oI1O.I000II(j, i11o1oil), i11oI1O.I000II(j, i11o1oil2));
                                    break;
                                case 50:
/* 67 */                            zI0000oI00 = i11o00oiil.I0000oI00(i11oI1O.I000II(j, i11o1oil), i11oI1O.I000II(j, i11o1oil2));
                                    break;
                                case 51:
                                case 52:
                                case 53:
                                case 54:
                                case 55:
                                case 56:
                                case 57:
                                case 58:
                                case 59:
                                case 60:
                                case 61:
                                case 62:
                                case 63:
                                case Barcode.FORMAT_EAN_8:
                                case 65:
                                case 66:
                                case 67:
                                case 68:
/* 31 */                            long j2 = iArr[i + 2] & 1048575;
/* 41 */                            if (i11oI1O.I0000oI00(j2, i11o1oil) != i11oI1O.I0000oI00(j2, i11o1oil2) || !i11o00oiil.I0000oI00(i11oI1O.I000II(j, i11o1oil), i11oI1O.I000II(j, i11o1oil2))) {
                                        break;
                                    } else {
                                        continue;
/* 456 */                               i += 3;
                                    }
                                    break;
                                default:
/* 456 */                           i += 3;
                            }
/* 84 */                    if (zI0000oI00) {
/* 456 */                       i += 3;
                            }
                        } else if (i11o1oil.zbc.equals(i11o1oil2.zbc)) {
/* 473 */                   if (this.I0001Ioi1lo) {
/* 483 */                       return ((i11O011) i11o1oil).zbb.equals(((i11O011) i11o1oil2).zbb);
                            }
/* 488 */                   return true;
                        }
                    }
/* 3 */             return false;
                }

                @Override
                public final void I00000oOI(Object obj, byte[] bArr, int i, int i2, i111i0I1 i111i0i1) throws i11i01Oo {
/* 8 */             I0010o(obj, bArr, i, i2, 0, i111i0i1);
                }

                /* JADX WARN: Removed duplicated region for block: B:44:0x00db A[PHI: r2
                  0x00db: PHI (r2v34 int) = (r2v10 int), (r2v35 int) binds: [B:85:0x01ea, B:43:0x00d9] A[DONT_GENERATE, DONT_INLINE]] */
                @Override
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final int I0000Il00O(i11O1oIl i11o1oil) {
                    int i;
                    long jDoubleToLongBits;
                    int i2;
                    int iFloatToIntBits;
                    int i3;
                    int i4;
/* 1 */             int[] iArr = this.I00000oIO;
/* 4 */             int i5 = 0;
/* 6 */             for (int i6 = 0; i6 < iArr.length; i6 += 3) {
/* 8 */                 int iI001i1lo1io = I001i1lo1io(i6);
/* 15 */                int i7 = 1048575 & iI001i1lo1io;
/* 16 */                int iI001i1O0Ol = I001i1O0Ol(iI001i1lo1io);
/* 20 */                int i8 = iArr[i6];
                        long j = i7;
/* 23 */                int i9 = 1237;
/* 27 */                int iHashCode = 37;
                        switch (iI001i1O0Ol) {
                            case 0:
/* 555 */                       i = i5 * 53;
/* 563 */                       jDoubleToLongBits = Double.doubleToLongBits(i11oI1O.I0000Il00O.I000iOII(j, i11o1oil));
/* 567 */                       Charset charset = i11Oo1I1i.I00000oIO;
/* 74 */                        i5 = i + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                                break;
                            case 1:
/* 541 */                       i2 = i5 * 53;
/* 549 */                       iFloatToIntBits = Float.floatToIntBits(i11oI1O.I0000Il00O.I000l1(j, i11o1oil));
/* 52 */                        i5 = iFloatToIntBits + i2;
                                break;
                            case 2:
/* 531 */                       i = i5 * 53;
/* 533 */                       jDoubleToLongBits = i11oI1O.I0001Ioi1lo(j, i11o1oil);
/* 537 */                       Charset charset2 = i11Oo1I1i.I00000oIO;
/* 74 */                        i5 = i + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                                break;
                            case 3:
/* 521 */                       i = i5 * 53;
/* 523 */                       jDoubleToLongBits = i11oI1O.I0001Ioi1lo(j, i11o1oil);
/* 527 */                       Charset charset3 = i11Oo1I1i.I00000oIO;
/* 74 */                        i5 = i + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                                break;
                            case 4:
/* 513 */                       i2 = i5 * 53;
/* 515 */                       iFloatToIntBits = i11oI1O.I0000oI00(j, i11o1oil);
/* 52 */                        i5 = iFloatToIntBits + i2;
                                break;
                            case 5:
/* 503 */                       i = i5 * 53;
/* 505 */                       jDoubleToLongBits = i11oI1O.I0001Ioi1lo(j, i11o1oil);
/* 509 */                       Charset charset4 = i11Oo1I1i.I00000oIO;
/* 74 */                        i5 = i + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                                break;
                            case 6:
/* 495 */                       i2 = i5 * 53;
/* 497 */                       iFloatToIntBits = i11oI1O.I0000oI00(j, i11o1oil);
/* 52 */                        i5 = iFloatToIntBits + i2;
                                break;
                            case 7:
/* 481 */                       i3 = i5 * 53;
/* 485 */                       boolean zI00100o1O0lo = i11oI1O.I0000Il00O.I00100o1O0lo(j, i11o1oil);
/* 489 */                       Charset charset5 = i11Oo1I1i.I00000oIO;
/* 491 */                       if (zI00100o1O0lo) {
/* 220 */                           i9 = 1231;
                                }
/* 221 */                       i5 = i9 + i3;
                                break;
                            case 8:
/* 467 */                       i2 = i5 * 53;
/* 475 */                       iFloatToIntBits = ((String) i11oI1O.I000II(j, i11o1oil)).hashCode();
/* 52 */                        i5 = iFloatToIntBits + i2;
                                break;
                            case 9:
/* 454 */                       i4 = i5 * 53;
/* 456 */                       Object objI000II = i11oI1O.I000II(j, i11o1oil);
/* 460 */                       if (objI000II != null) {
/* 462 */                           iHashCode = objI000II.hashCode();
                                }
/* 387 */                       i5 = i4 + iHashCode;
                                break;
                            case 10:
/* 442 */                       i2 = i5 * 53;
/* 448 */                       iFloatToIntBits = i11oI1O.I000II(j, i11o1oil).hashCode();
/* 52 */                        i5 = iFloatToIntBits + i2;
                                break;
                            case 11:
/* 434 */                       i2 = i5 * 53;
/* 436 */                       iFloatToIntBits = i11oI1O.I0000oI00(j, i11o1oil);
/* 52 */                        i5 = iFloatToIntBits + i2;
                                break;
                            case 12:
/* 426 */                       i2 = i5 * 53;
/* 428 */                       iFloatToIntBits = i11oI1O.I0000oI00(j, i11o1oil);
/* 52 */                        i5 = iFloatToIntBits + i2;
                                break;
                            case 13:
/* 418 */                       i2 = i5 * 53;
/* 420 */                       iFloatToIntBits = i11oI1O.I0000oI00(j, i11o1oil);
/* 52 */                        i5 = iFloatToIntBits + i2;
                                break;
                            case 14:
/* 408 */                       i = i5 * 53;
/* 410 */                       jDoubleToLongBits = i11oI1O.I0001Ioi1lo(j, i11o1oil);
/* 414 */                       Charset charset6 = i11Oo1I1i.I00000oIO;
/* 74 */                        i5 = i + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                                break;
                            case 15:
/* 400 */                       i2 = i5 * 53;
/* 402 */                       iFloatToIntBits = i11oI1O.I0000oI00(j, i11o1oil);
/* 52 */                        i5 = iFloatToIntBits + i2;
                                break;
                            case 16:
/* 390 */                       i = i5 * 53;
/* 392 */                       jDoubleToLongBits = i11oI1O.I0001Ioi1lo(j, i11o1oil);
/* 396 */                       Charset charset7 = i11Oo1I1i.I00000oIO;
/* 74 */                        i5 = i + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                                break;
                            case 17:
/* 375 */                       i4 = i5 * 53;
/* 377 */                       Object objI000II2 = i11oI1O.I000II(j, i11o1oil);
/* 381 */                       if (objI000II2 != null) {
/* 383 */                           iHashCode = objI000II2.hashCode();
                                }
/* 387 */                       i5 = i4 + iHashCode;
                                break;
                            case PoseLandmark.RIGHT_PINKY:
                            case PoseLandmark.LEFT_INDEX:
                            case PoseLandmark.RIGHT_INDEX:
                            case PoseLandmark.LEFT_THUMB:
                            case PoseLandmark.RIGHT_THUMB:
                            case PoseLandmark.LEFT_HIP:
                            case PoseLandmark.RIGHT_HIP:
                            case PoseLandmark.LEFT_KNEE:
                            case PoseLandmark.RIGHT_KNEE:
                            case 27:
                            case PoseLandmark.RIGHT_ANKLE:
                            case PoseLandmark.LEFT_HEEL:
                            case 30:
                            case PoseLandmark.LEFT_FOOT_INDEX:
                            case 32:
                            case 33:
                            case 34:
                            case InputImage.IMAGE_FORMAT_YUV_420_888:
                            case 36:
                            case 37:
                            case 38:
                            case 39:
                            case 40:
                            case 41:
                            case 42:
                            case 43:
                            case 44:
                            case BuildConfig.VERSION_CODE:
                            case 46:
                            case 47:
                            case 48:
                            case 49:
/* 363 */                       i2 = i5 * 53;
/* 369 */                       iFloatToIntBits = i11oI1O.I000II(j, i11o1oil).hashCode();
/* 52 */                        i5 = iFloatToIntBits + i2;
                                break;
                            case 50:
/* 351 */                       i2 = i5 * 53;
/* 357 */                       iFloatToIntBits = i11oI1O.I000II(j, i11o1oil).hashCode();
/* 52 */                        i5 = iFloatToIntBits + i2;
                                break;
                            case 51:
/* 329 */                       if (I00100o1O0lo(i11o1oil, i8, i6)) {
/* 331 */                           i = i5 * 53;
/* 343 */                           jDoubleToLongBits = Double.doubleToLongBits(((Double) i11oI1O.I000II(j, i11o1oil)).doubleValue());
/* 347 */                           Charset charset8 = i11Oo1I1i.I00000oIO;
/* 74 */                            i5 = i + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                                    break;
                                } else {
                                    break;
                                }
                            case 52:
/* 305 */                       if (I00100o1O0lo(i11o1oil, i8, i6)) {
/* 307 */                           i2 = i5 * 53;
/* 319 */                           iFloatToIntBits = Float.floatToIntBits(((Float) i11oI1O.I000II(j, i11o1oil)).floatValue());
/* 52 */                            i5 = iFloatToIntBits + i2;
                                    break;
                                } else {
                                    break;
                                }
                            case 53:
/* 289 */                       if (I00100o1O0lo(i11o1oil, i8, i6)) {
/* 291 */                           i = i5 * 53;
/* 293 */                           jDoubleToLongBits = I001iOo1i0O(j, i11o1oil);
/* 297 */                           Charset charset9 = i11Oo1I1i.I00000oIO;
/* 74 */                            i5 = i + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                                    break;
                                } else {
                                    break;
                                }
                            case 54:
/* 273 */                       if (I00100o1O0lo(i11o1oil, i8, i6)) {
/* 275 */                           i = i5 * 53;
/* 277 */                           jDoubleToLongBits = I001iOo1i0O(j, i11o1oil);
/* 281 */                           Charset charset10 = i11Oo1I1i.I00000oIO;
/* 74 */                            i5 = i + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                                    break;
                                } else {
                                    break;
                                }
                            case 55:
/* 259 */                       if (I00100o1O0lo(i11o1oil, i8, i6)) {
/* 261 */                           i2 = i5 * 53;
/* 263 */                           iFloatToIntBits = I001IIilI0O(j, i11o1oil);
/* 52 */                            i5 = iFloatToIntBits + i2;
                                    break;
                                } else {
                                    break;
                                }
                            case 56:
/* 243 */                       if (I00100o1O0lo(i11o1oil, i8, i6)) {
/* 245 */                           i = i5 * 53;
/* 247 */                           jDoubleToLongBits = I001iOo1i0O(j, i11o1oil);
/* 251 */                           Charset charset11 = i11Oo1I1i.I00000oIO;
/* 74 */                            i5 = i + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                                    break;
                                } else {
                                    break;
                                }
                            case 57:
/* 229 */                       if (I00100o1O0lo(i11o1oil, i8, i6)) {
/* 231 */                           i2 = i5 * 53;
/* 233 */                           iFloatToIntBits = I001IIilI0O(j, i11o1oil);
/* 52 */                            i5 = iFloatToIntBits + i2;
                                    break;
                                } else {
                                    break;
                                }
                            case 58:
/* 202 */                       if (I00100o1O0lo(i11o1oil, i8, i6)) {
/* 204 */                           i3 = i5 * 53;
/* 212 */                           boolean zBooleanValue = ((Boolean) i11oI1O.I000II(j, i11o1oil)).booleanValue();
/* 216 */                           Charset charset12 = i11Oo1I1i.I00000oIO;
/* 218 */                           if (zBooleanValue) {
                                    }
/* 221 */                           i5 = i9 + i3;
                                    break;
                                } else {
                                    break;
                                }
                            case 59:
/* 182 */                       if (I00100o1O0lo(i11o1oil, i8, i6)) {
/* 184 */                           i2 = i5 * 53;
/* 192 */                           iFloatToIntBits = ((String) i11oI1O.I000II(j, i11o1oil)).hashCode();
/* 52 */                            i5 = iFloatToIntBits + i2;
                                    break;
                                } else {
                                    break;
                                }
                            case 60:
/* 165 */                       if (I00100o1O0lo(i11o1oil, i8, i6)) {
/* 167 */                           i2 = i5 * 53;
/* 173 */                           iFloatToIntBits = i11oI1O.I000II(j, i11o1oil).hashCode();
/* 52 */                            i5 = iFloatToIntBits + i2;
                                    break;
                                } else {
                                    break;
                                }
                            case 61:
/* 148 */                       if (I00100o1O0lo(i11o1oil, i8, i6)) {
/* 150 */                           i2 = i5 * 53;
/* 156 */                           iFloatToIntBits = i11oI1O.I000II(j, i11o1oil).hashCode();
/* 52 */                            i5 = iFloatToIntBits + i2;
                                    break;
                                } else {
                                    break;
                                }
                            case 62:
/* 135 */                       if (I00100o1O0lo(i11o1oil, i8, i6)) {
/* 137 */                           i2 = i5 * 53;
/* 139 */                           iFloatToIntBits = I001IIilI0O(j, i11o1oil);
/* 52 */                            i5 = iFloatToIntBits + i2;
                                    break;
                                } else {
                                    break;
                                }
                            case 63:
/* 122 */                       if (I00100o1O0lo(i11o1oil, i8, i6)) {
/* 124 */                           i2 = i5 * 53;
/* 126 */                           iFloatToIntBits = I001IIilI0O(j, i11o1oil);
/* 52 */                            i5 = iFloatToIntBits + i2;
                                    break;
                                } else {
                                    break;
                                }
                            case Barcode.FORMAT_EAN_8:
/* 109 */                       if (I00100o1O0lo(i11o1oil, i8, i6)) {
/* 111 */                           i2 = i5 * 53;
/* 113 */                           iFloatToIntBits = I001IIilI0O(j, i11o1oil);
/* 52 */                            i5 = iFloatToIntBits + i2;
                                    break;
                                } else {
                                    break;
                                }
                            case 65:
/* 94 */                        if (I00100o1O0lo(i11o1oil, i8, i6)) {
/* 96 */                            i = i5 * 53;
/* 98 */                            jDoubleToLongBits = I001iOo1i0O(j, i11o1oil);
/* 102 */                           Charset charset13 = i11Oo1I1i.I00000oIO;
/* 74 */                            i5 = i + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                                    break;
                                } else {
                                    break;
                                }
                            case 66:
/* 81 */                        if (I00100o1O0lo(i11o1oil, i8, i6)) {
/* 83 */                            i2 = i5 * 53;
/* 85 */                            iFloatToIntBits = I001IIilI0O(j, i11o1oil);
/* 52 */                            i5 = iFloatToIntBits + i2;
                                    break;
                                } else {
                                    break;
                                }
                            case 67:
/* 60 */                        if (I00100o1O0lo(i11o1oil, i8, i6)) {
/* 62 */                            i = i5 * 53;
/* 64 */                            jDoubleToLongBits = I001iOo1i0O(j, i11o1oil);
/* 68 */                            Charset charset14 = i11Oo1I1i.I00000oIO;
/* 74 */                            i5 = i + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                                    break;
                                } else {
                                    break;
                                }
                            case 68:
/* 40 */                        if (I00100o1O0lo(i11o1oil, i8, i6)) {
/* 42 */                            i2 = i5 * 53;
/* 48 */                            iFloatToIntBits = i11oI1O.I000II(j, i11o1oil).hashCode();
/* 52 */                            i5 = iFloatToIntBits + i2;
                                    break;
                                } else {
                                    break;
                                }
                        }
                    }
/* 583 */           int iHashCode2 = i11o1oil.zbc.hashCode() + (i5 * 53);
/* 586 */           if (!this.I0001Ioi1lo) {
/* 602 */               return iHashCode2;
                    }
/* 600 */           return ((i11O011) i11o1oil).zbb.I00000oIO.hashCode() + (iHashCode2 * 53);
                }

                @Override
                public final void I0000O(Object obj, Object obj2) {
                    Object obj3;
/* 1 */             int[] iArr = this.I00000oIO;
/* 7 */             if (!I00100l0(obj)) {
/* 518 */               I000II.I000iOII("Mutating immutable message: ".concat(String.valueOf(obj)));
/* 521 */               return;
                    }
/* 9 */             obj2.getClass();
/* 12 */            int i = 0;
/* 14 */            while (i < iArr.length) {
/* 16 */                int iI001i1lo1io = I001i1lo1io(i);
/* 23 */                int i2 = iI001i1lo1io & 1048575;
/* 25 */                int iI001i1O0Ol = I001i1O0Ol(iI001i1lo1io);
/* 29 */                int i3 = iArr[i];
                        long j = i2;
                        switch (iI001i1O0Ol) {
                            case 0:
/* 471 */                       obj3 = obj;
/* 476 */                       if (I000o00OoI0I(i, obj2)) {
/* 478 */                           Ooil0oIOI0l0 ooil0oIOI0l0 = i11oI1O.I0000Il00O;
/* 484 */                           ooil0oIOI0l0.I000oI1ioi(obj3, j, ooil0oIOI0l0.I000iOII(j, obj2));
/* 487 */                           I000l1(i, obj3);
                                    continue;
                                }
/* 490 */                       i += 3;
/* 492 */                       obj = obj3;
                            case 1:
/* 451 */                       obj3 = obj;
/* 456 */                       if (I000o00OoI0I(i, obj2)) {
/* 458 */                           Ooil0oIOI0l0 ooil0oIOI0l02 = i11oI1O.I0000Il00O;
/* 464 */                           ooil0oIOI0l02.I00100l0(obj3, j, ooil0oIOI0l02.I000l1(j, obj2));
/* 467 */                           I000l1(i, obj3);
                                } else {
                                    continue;
                                }
/* 490 */                       i += 3;
/* 492 */                       obj = obj3;
                            case 2:
/* 429 */                       obj3 = obj;
/* 434 */                       if (I000o00OoI0I(i, obj2)) {
/* 444 */                           i11oI1O.I0000Il00O.I00000oOI.putLong(obj3, j, i11oI1O.I0001Ioi1lo(j, obj2));
/* 447 */                           I000l1(i, obj3);
                                } else {
                                    continue;
                                }
/* 490 */                       i += 3;
/* 492 */                       obj = obj3;
                            case 3:
/* 407 */                       obj3 = obj;
/* 412 */                       if (I000o00OoI0I(i, obj2)) {
/* 422 */                           i11oI1O.I0000Il00O.I00000oOI.putLong(obj3, j, i11oI1O.I0001Ioi1lo(j, obj2));
/* 425 */                           I000l1(i, obj3);
                                } else {
                                    continue;
                                }
/* 490 */                       i += 3;
/* 492 */                       obj = obj3;
                            case 4:
/* 389 */                       obj3 = obj;
/* 394 */                       if (I000o00OoI0I(i, obj2)) {
/* 400 */                           i11oI1O.I000O01llI0(obj3, i11oI1O.I0000oI00(j, obj2), j);
/* 403 */                           I000l1(i, obj3);
                                } else {
                                    continue;
                                }
/* 490 */                       i += 3;
/* 492 */                       obj = obj3;
                            case 5:
/* 367 */                       obj3 = obj;
/* 372 */                       if (I000o00OoI0I(i, obj2)) {
/* 382 */                           i11oI1O.I0000Il00O.I00000oOI.putLong(obj3, j, i11oI1O.I0001Ioi1lo(j, obj2));
/* 385 */                           I000l1(i, obj3);
                                } else {
                                    continue;
                                }
/* 490 */                       i += 3;
/* 492 */                       obj = obj3;
                            case 6:
/* 348 */                       obj3 = obj;
/* 353 */                       if (I000o00OoI0I(i, obj2)) {
/* 359 */                           i11oI1O.I000O01llI0(obj3, i11oI1O.I0000oI00(j, obj2), j);
/* 362 */                           I000l1(i, obj3);
                                } else {
                                    continue;
                                }
/* 490 */                       i += 3;
/* 492 */                       obj = obj3;
                            case 7:
/* 327 */                       obj3 = obj;
/* 332 */                       if (I000o00OoI0I(i, obj2)) {
/* 334 */                           Ooil0oIOI0l0 ooil0oIOI0l03 = i11oI1O.I0000Il00O;
/* 340 */                           ooil0oIOI0l03.I000lI(obj3, j, ooil0oIOI0l03.I00100o1O0lo(j, obj2));
/* 343 */                           I000l1(i, obj3);
                                } else {
                                    continue;
                                }
/* 490 */                       i += 3;
/* 492 */                       obj = obj3;
                            case 8:
/* 308 */                       obj3 = obj;
/* 313 */                       if (I000o00OoI0I(i, obj2)) {
/* 319 */                           i11oI1O.I000OOo1O(obj3, j, i11oI1O.I000II(j, obj2));
/* 322 */                           I000l1(i, obj3);
                                } else {
                                    continue;
                                }
/* 490 */                       i += 3;
/* 492 */                       obj = obj3;
                            case 9:
/* 302 */                       obj3 = obj;
/* 303 */                       I000OiO(i, obj3, obj2);
                                continue;
/* 490 */                       i += 3;
/* 492 */                       obj = obj3;
                            case 10:
/* 283 */                       obj3 = obj;
/* 288 */                       if (I000o00OoI0I(i, obj2)) {
/* 294 */                           i11oI1O.I000OOo1O(obj3, j, i11oI1O.I000II(j, obj2));
/* 297 */                           I000l1(i, obj3);
                                } else {
                                    continue;
                                }
/* 490 */                       i += 3;
/* 492 */                       obj = obj3;
                            case 11:
/* 264 */                       obj3 = obj;
/* 269 */                       if (I000o00OoI0I(i, obj2)) {
/* 275 */                           i11oI1O.I000O01llI0(obj3, i11oI1O.I0000oI00(j, obj2), j);
/* 278 */                           I000l1(i, obj3);
                                } else {
                                    continue;
                                }
/* 490 */                       i += 3;
/* 492 */                       obj = obj3;
                            case 12:
/* 245 */                       obj3 = obj;
/* 250 */                       if (I000o00OoI0I(i, obj2)) {
/* 256 */                           i11oI1O.I000O01llI0(obj3, i11oI1O.I0000oI00(j, obj2), j);
/* 259 */                           I000l1(i, obj3);
                                } else {
                                    continue;
                                }
/* 490 */                       i += 3;
/* 492 */                       obj = obj3;
                            case 13:
/* 226 */                       obj3 = obj;
/* 231 */                       if (I000o00OoI0I(i, obj2)) {
/* 237 */                           i11oI1O.I000O01llI0(obj3, i11oI1O.I0000oI00(j, obj2), j);
/* 240 */                           I000l1(i, obj3);
                                } else {
                                    continue;
                                }
/* 490 */                       i += 3;
/* 492 */                       obj = obj3;
                            case 14:
/* 203 */                       obj3 = obj;
/* 208 */                       if (I000o00OoI0I(i, obj2)) {
/* 218 */                           i11oI1O.I0000Il00O.I00000oOI.putLong(obj3, j, i11oI1O.I0001Ioi1lo(j, obj2));
/* 221 */                           I000l1(i, obj3);
                                } else {
                                    continue;
                                }
/* 490 */                       i += 3;
/* 492 */                       obj = obj3;
                            case 15:
/* 184 */                       obj3 = obj;
/* 189 */                       if (I000o00OoI0I(i, obj2)) {
/* 195 */                           i11oI1O.I000O01llI0(obj3, i11oI1O.I0000oI00(j, obj2), j);
/* 198 */                           I000l1(i, obj3);
                                } else {
                                    continue;
                                }
/* 490 */                       i += 3;
/* 492 */                       obj = obj3;
                            case 16:
/* 165 */                       if (I000o00OoI0I(i, obj2)) {
/* 175 */                           obj3 = obj;
/* 176 */                           i11oI1O.I0000Il00O.I00000oOI.putLong(obj3, j, i11oI1O.I0001Ioi1lo(j, obj2));
/* 179 */                           I000l1(i, obj3);
                                }
/* 490 */                       i += 3;
/* 492 */                       obj = obj3;
                                break;
                            case 17:
/* 157 */                       I000OiO(i, obj, obj2);
                                break;
                            case PoseLandmark.RIGHT_PINKY:
                            case PoseLandmark.LEFT_INDEX:
                            case PoseLandmark.RIGHT_INDEX:
                            case PoseLandmark.LEFT_THUMB:
                            case PoseLandmark.RIGHT_THUMB:
                            case PoseLandmark.LEFT_HIP:
                            case PoseLandmark.RIGHT_HIP:
                            case PoseLandmark.LEFT_KNEE:
                            case PoseLandmark.RIGHT_KNEE:
                            case 27:
                            case PoseLandmark.RIGHT_ANKLE:
                            case PoseLandmark.LEFT_HEEL:
                            case 30:
                            case PoseLandmark.LEFT_FOOT_INDEX:
                            case 32:
                            case 33:
                            case 34:
                            case InputImage.IMAGE_FORMAT_YUV_420_888:
                            case 36:
                            case 37:
                            case 38:
                            case 39:
                            case 40:
                            case 41:
                            case 42:
                            case 43:
                            case 44:
                            case BuildConfig.VERSION_CODE:
                            case 46:
                            case 47:
                            case 48:
                            case 49:
/* 114 */                       i11Oi1oO i11oi1ooI00OIl = (i11Oi1oO) i11oI1O.I000II(j, obj);
/* 120 */                       i11Oi1oO i11oi1oo = (i11Oi1oO) i11oI1O.I000II(j, obj2);
/* 122 */                       int size = i11oi1ooI00OIl.size();
/* 126 */                       int size2 = i11oi1oo.size();
/* 130 */                       if (size > 0 && size2 > 0) {
/* 139 */                           if (!((i111I0010O) i11oi1ooI00OIl).I00iOIl) {
/* 142 */                               i11oi1ooI00OIl = i11oi1ooI00OIl.I00OIl(size2 + size);
                                    }
/* 146 */                           i11oi1ooI00OIl.addAll(i11oi1oo);
                                }
/* 149 */                       if (size > 0) {
/* 152 */                           i11oi1oo = i11oi1ooI00OIl;
                                }
/* 153 */                       i11oI1O.I000OOo1O(obj, j, i11oi1oo);
                                break;
                            case 50:
/* 92 */                        loIOiIO1O1 loioiio1o1 = i11o00oiil.I00000oIO;
/* 106 */                       i11oI1O.I000OOo1O(obj, j, liOIl1li0IIO.I00000oIO(i11oI1O.I000II(j, obj), i11oI1O.I000II(j, obj2)));
                                break;
                            case 51:
                            case 52:
                            case 53:
                            case 54:
                            case 55:
                            case 56:
                            case 57:
                            case 58:
                            case 59:
/* 73 */                        if (I00100o1O0lo(obj2, i3, i)) {
/* 79 */                            i11oI1O.I000OOo1O(obj, j, i11oI1O.I000II(j, obj2));
/* 88 */                            i11oI1O.I000O01llI0(obj, i3, iArr[i + 2] & 1048575);
                                    break;
                                }
                                break;
                            case 60:
/* 65 */                        I000iOII(i, obj, obj2);
                                break;
                            case 61:
                            case 62:
                            case 63:
                            case Barcode.FORMAT_EAN_8:
                            case 65:
                            case 66:
                            case 67:
/* 46 */                        if (I00100o1O0lo(obj2, i3, i)) {
/* 52 */                            i11oI1O.I000OOo1O(obj, j, i11oI1O.I000II(j, obj2));
/* 61 */                            i11oI1O.I000O01llI0(obj, i3, iArr[i + 2] & 1048575);
                                    break;
                                }
                                break;
                            case 68:
/* 38 */                        I000iOII(i, obj, obj2);
                                break;
                        }
/* 35 */                obj3 = obj;
/* 490 */               i += 3;
/* 492 */               obj = obj3;
                    }
/* 495 */           Object obj4 = obj;
/* 496 */           i11o00oiil.I00100l0(obj4, obj2);
/* 501 */           if (this.I0001Ioi1lo) {
/* 503 */               i11o00oiil.I000oI1ioi(obj4, obj2);
                    }
                }

                /* JADX WARN: Removed duplicated region for block: B:28:0x006f  */
                @Override
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final void I0000oI00(Object obj) {
/* 1 */             int[] iArr = this.I00000oIO;
/* 7 */             if (I00100l0(obj)) {
/* 14 */                if (obj instanceof i11O1oIl) {
/* 17 */                    i11O1oIl i11o1oil = (i11O1oIl) obj;
/* 19 */                    i11o1oil.I0000oI00();
/* 22 */                    i11o1oil.zba = 0;
/* 24 */                    i11o1oil.I0000Il00O();
                        }
/* 29 */                for (int i = 0; i < iArr.length; i += 3) {
/* 31 */                    int iI001i1lo1io = I001i1lo1io(i);
/* 38 */                    int i2 = 1048575 & iI001i1lo1io;
/* 39 */                    int iI001i1O0Ol = I001i1O0Ol(iI001i1lo1io);
                            long j = i2;
/* 46 */                    Unsafe unsafe = I000lI;
/* 48 */                    if (iI001i1O0Ol != 9) {
/* 52 */                        if (iI001i1O0Ol != 60 && iI001i1O0Ol != 68) {
                                    switch (iI001i1O0Ol) {
                                        case PoseLandmark.RIGHT_PINKY:
                                        case PoseLandmark.LEFT_INDEX:
                                        case PoseLandmark.RIGHT_INDEX:
                                        case PoseLandmark.LEFT_THUMB:
                                        case PoseLandmark.RIGHT_THUMB:
                                        case PoseLandmark.LEFT_HIP:
                                        case PoseLandmark.RIGHT_HIP:
                                        case PoseLandmark.LEFT_KNEE:
                                        case PoseLandmark.RIGHT_KNEE:
                                        case 27:
                                        case PoseLandmark.RIGHT_ANKLE:
                                        case PoseLandmark.LEFT_HEEL:
                                        case 30:
                                        case PoseLandmark.LEFT_FOOT_INDEX:
                                        case 32:
                                        case 33:
                                        case 34:
                                        case InputImage.IMAGE_FORMAT_YUV_420_888:
                                        case 36:
                                        case 37:
                                        case 38:
                                        case 39:
                                        case 40:
                                        case 41:
                                        case 42:
                                        case 43:
                                        case 44:
                                        case BuildConfig.VERSION_CODE:
                                        case 46:
                                        case 47:
                                        case 48:
                                        case 49:
/* 83 */                                    i111I0010O i111i0010o = (i111I0010O) ((i11Oi1oO) i11oI1O.I000II(j, obj));
/* 87 */                                    if (i111i0010o.I00iOIl) {
/* 89 */                                        i111i0010o.I00iOIl = false;
                                                break;
                                            } else {
                                                break;
                                            }
                                        case 50:
/* 62 */                                    Object object = unsafe.getObject(obj, j);
/* 66 */                                    if (object != null) {
/* 71 */                                        ((i11l1l0IiI) object).I00iOIl = false;
/* 73 */                                        unsafe.putObject(obj, j, object);
                                                break;
                                            } else {
                                                break;
                                            }
                                    }
                                } else if (I00100o1O0lo(obj, iArr[i], i)) {
/* 108 */                           I001lIiIIo1O(i).I0000oI00(unsafe.getObject(obj, j));
                                }
                            } else if (I000o00OoI0I(i, obj)) {
/* 126 */                       I001lIiIIo1O(i).I0000oI00(unsafe.getObject(obj, j));
                            }
                        }
/* 134 */               this.I000OiO.getClass();
/* 140 */               i11o1i i11o1iVar = ((i11O1oIl) obj).zbc;
/* 144 */               if (i11o1iVar.I0000oI00) {
/* 146 */                   i11o1iVar.I0000oI00 = false;
                        }
/* 150 */               if (this.I0001Ioi1lo) {
/* 154 */                   this.I000iOII.getClass();
/* 161 */                   ((i11O011) obj).zbb.I0000O();
                        }
                    }
                }

                @Override
                public final boolean I0001Ioi1lo(Object obj) {
                    int i;
                    int i2;
                    int i3;
/* 3 */             int[] iArr = this.I00000oIO;
/* 9 */             int i4 = 0;
/* 10 */            int i5 = 0;
/* 11 */            int i6 = 1048575;
                    loop0: while (true) {
/* 15 */                if (i5 < this.I000O01llI0) {
/* 19 */                    int i7 = this.I000II[i5];
/* 21 */                    int i8 = iArr[i7];
/* 23 */                    int iI001i1lo1io = I001i1lo1io(i7);
/* 29 */                    int i9 = iArr[i7 + 2];
/* 31 */                    int i10 = i9 & 1048575;
/* 35 */                    int i11 = 1 << (i9 >>> 20);
/* 37 */                    if (i10 != i6) {
/* 39 */                        if (i10 != 1048575) {
/* 44 */                            i4 = I000lI.getInt(obj, i10);
                                }
/* 48 */                        i = i4;
/* 49 */                        i6 = i10;
                            } else {
/* 51 */                        i = i4;
                            }
/* 55 */                    if ((268435456 & iI001i1lo1io) != 0) {
/* 57 */                        i2 = i7;
/* 58 */                        i3 = i6;
/* 64 */                        if (!I000oI1ioi(obj, i2, i3, i, i11)) {
                                    break;
                                }
                            } else {
/* 67 */                        i2 = i7;
/* 68 */                        i3 = i6;
                            }
/* 69 */                    int iI001i1O0Ol = I001i1O0Ol(iI001i1lo1io);
/* 75 */                    if (iI001i1O0Ol == 9 || iI001i1O0Ol == 17) {
/* 247 */                       if (I000oI1ioi(obj, i2, i3, i, i11) && !I001lIiIIo1O(i2).I0001Ioi1lo(i11oI1O.I000II(iI001i1lo1io & 1048575, obj))) {
                                    break;
                                }
/* 267 */                       i5++;
/* 269 */                       i6 = i3;
/* 270 */                       i4 = i;
                            } else {
/* 83 */                        if (iI001i1O0Ol != 27) {
/* 87 */                            if (iI001i1O0Ol == 60 || iI001i1O0Ol == 68) {
/* 182 */                               if (I00100o1O0lo(obj, i8, i2) && !I001lIiIIo1O(i2).I0001Ioi1lo(i11oI1O.I000II(iI001i1lo1io & 1048575, obj))) {
                                            break;
                                        }
/* 267 */                               i5++;
/* 269 */                               i6 = i3;
/* 270 */                               i4 = i;
                                    } else if (iI001i1O0Ol != 49) {
/* 99 */                                if (iI001i1O0Ol != 50) {
                                            continue;
                                        } else {
/* 110 */                                   i11l1l0IiI i11l1l0iii = (i11l1l0IiI) i11oI1O.I000II(iI001i1lo1io & 1048575, obj);
/* 116 */                                   if (i11l1l0iii.isEmpty()) {
                                                continue;
                                            } else {
/* 118 */                                       int i12 = i2 / 3;
/* 137 */                                       if (((i11oIoi1) ((i11l1l0) this.I00000oOI[i12 + i12]).I00000oIO.I00iio).I00iOIl == i11oO1.I00l0I0l0lO1) {
/* 147 */                                           i11lo1 i11lo1VarI00000oIO = null;
/* 152 */                                           for (Object obj2 : i11l1l0iii.values()) {
/* 158 */                                               if (i11lo1VarI00000oIO == null) {
/* 166 */                                                   i11lo1VarI00000oIO = i11liii0.I0000Il00O.I00000oIO(obj2.getClass());
                                                        }
/* 174 */                                               if (!i11lo1VarI00000oIO.I0001Ioi1lo(obj2)) {
                                                            break loop0;
                                                        }
                                                    }
                                                } else {
                                                    continue;
                                                }
                                            }
                                        }
/* 267 */                               i5++;
/* 269 */                               i6 = i3;
/* 270 */                               i4 = i;
                                    }
                                }
/* 209 */                       List list = (List) i11oI1O.I000II(iI001i1lo1io & 1048575, obj);
/* 215 */                       if (list.isEmpty()) {
                                    continue;
                                } else {
/* 217 */                           i11lo1 i11lo1VarI001lIiIIo1O = I001lIiIIo1O(i2);
/* 226 */                           for (int i13 = 0; i13 < list.size(); i13++) {
/* 236 */                               if (!i11lo1VarI001lIiIIo1O.I0001Ioi1lo(list.get(i13))) {
                                            break loop0;
                                        }
                                    }
                                }
/* 267 */                       i5++;
/* 269 */                       i6 = i3;
/* 270 */                       i4 = i;
                            }
                        } else if (!this.I0001Ioi1lo || ((i11O011) obj).zbb.I0001Ioi1lo()) {
/* 14 */                    return true;
                        }
                    }
/* 5 */             return false;
                }

                /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
                /* JADX WARN: Removed duplicated region for block: B:7:0x0027  */
                @Override
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final void I000II(Object obj, i11I1Ili i11i1ili) {
                    Map.Entry entry;
                    boolean z;
                    int i;
                    int i2;
                    int i3;
                    int i4;
                    int i5;
                    int i6;
                    boolean z2;
/* 1 */             i11lOO i11loo = this;
/* 7 */             liIoOiiO1Oi liiooiio1oi = i11loo.I000iOII;
/* 9 */             int[] iArr = i11loo.I00000oIO;
/* 13 */            if (i11loo.I0001Ioi1lo) {
/* 18 */                i11Ii1iI0 i11ii1ii0 = ((i11O011) obj).zbb;
/* 40 */                entry = !i11ii1ii0.I00000oIO.isEmpty() ? (Map.Entry) i11ii1ii0.I0000Il00O().next() : null;
                    }
/* 41 */            int i7 = 1048575;
/* 44 */            int i8 = 1048575;
/* 45 */            int i9 = 0;
/* 46 */            int i10 = 0;
/* 48 */            while (i9 < iArr.length) {
/* 50 */                int iI001i1lo1io = i11loo.I001i1lo1io(i9);
/* 54 */                int iI001i1O0Ol = I001i1O0Ol(iI001i1lo1io);
/* 58 */                int i11 = iArr[i9];
/* 64 */                Unsafe unsafe = I000lI;
/* 66 */                if (iI001i1O0Ol <= 17) {
/* 70 */                    int i12 = iArr[i9 + 2];
/* 72 */                    z = true;
/* 74 */                    int i13 = i12 & i7;
/* 76 */                    if (i13 != i8) {
/* 83 */                        i10 = i13 == i7 ? 0 : unsafe.getInt(obj, i13);
/* 88 */                        i8 = i13;
                            }
/* 95 */                    i = iI001i1lo1io;
/* 91 */                    i2 = 1 << (i12 >>> 20);
                        } else {
/* 99 */                    z = true;
/* 101 */                   i = iI001i1lo1io;
/* 102 */                   i2 = 0;
                        }
/* 103 */               if (entry != null) {
/* 114 */                   if (i11 >= 32149011) {
/* 117 */                       liiooiio1oi.getClass();
/* 126 */                       i11oIoi1 i11oioi1 = i11oIoi1.I00iiO;
/* 128 */                       throw null;
                            }
                        }
/* 129 */               long j = i & i7;
/* 135 */               int i14 = 2;
                        switch (iI001i1O0Ol) {
                            case 0:
/* 1903 */                      if (i11loo.I000oI1ioi(obj, i9, i8, i10, i2)) {
/* 1919 */                          ((i11I0o0ii) i11i1ili.I00iiI).I000OiO(i11, Double.doubleToRawLongBits(i11oI1O.I0000Il00O.I000iOII(j, obj)));
                                    break;
                                } else {
                                    break;
                                }
                            case 1:
/* 1878 */                      if (i11loo.I000oI1ioi(obj, i9, i8, i10, i2)) {
/* 1894 */                          ((i11I0o0ii) i11i1ili.I00iiI).I000O01llI0(i11, Float.floatToRawIntBits(i11oI1O.I0000Il00O.I000l1(j, obj)));
                                    break;
                                } else {
                                    break;
                                }
                            case 2:
/* 1859 */                      if (i11loo.I000oI1ioi(obj, i9, i8, i10, i2)) {
/* 1869 */                          ((i11I0o0ii) i11i1ili.I00iiI).I0010I0i(i11, unsafe.getLong(obj, j));
                                    break;
                                } else {
                                    break;
                                }
                            case 3:
/* 1838 */                      if (i11loo.I000oI1ioi(obj, i9, i8, i10, i2)) {
/* 1848 */                          ((i11I0o0ii) i11i1ili.I00iiI).I0010I0i(i11, unsafe.getLong(obj, j));
                                    break;
                                } else {
                                    break;
                                }
                            case 4:
/* 1817 */                      if (i11loo.I000oI1ioi(obj, i9, i8, i10, i2)) {
/* 1827 */                          ((i11I0o0ii) i11i1ili.I00iiI).I000l1(i11, unsafe.getInt(obj, j));
                                    break;
                                } else {
                                    break;
                                }
                            case 5:
/* 1795 */                      if (i11loo.I000oI1ioi(obj, i9, i8, i10, i2)) {
/* 1805 */                          ((i11I0o0ii) i11i1ili.I00iiI).I000OiO(i11, unsafe.getLong(obj, j));
                                    break;
                                } else {
                                    break;
                                }
                            case 6:
/* 1773 */                      if (i11loo.I000oI1ioi(obj, i9, i8, i10, i2)) {
/* 1783 */                          ((i11I0o0ii) i11i1ili.I00iiI).I000O01llI0(i11, unsafe.getInt(obj, j));
                                    break;
                                } else {
                                    break;
                                }
                            case 7:
/* 1744 */                      if (i11loo.I000oI1ioi(obj, i9, i8, i10, i2)) {
/* 1748 */                          boolean zI00100o1O0lo = i11oI1O.I0000Il00O.I00100o1O0lo(j, obj);
/* 1754 */                          i11I0o0ii i11i0o0ii = (i11I0o0ii) i11i1ili.I00iiI;
/* 1758 */                          i11i0o0ii.I00100o1O0lo(i11 << 3);
/* 1761 */                          i11i0o0ii.I0000O(zI00100o1O0lo ? (byte) 1 : (byte) 0);
                                    break;
                                } else {
                                    break;
                                }
                            case 8:
/* 1698 */                      if (i11loo.I000oI1ioi(obj, i9, i8, i10, i2)) {
/* 1700 */                          Object object = unsafe.getObject(obj, j);
/* 1706 */                          if (object instanceof String) {
/* 1712 */                              i11I0o0ii i11i0o0ii2 = (i11I0o0ii) i11i1ili.I00iiI;
/* 1720 */                              i11i0o0ii2.I00100o1O0lo((i11 << 3) | 2);
/* 1723 */                              i11i0o0ii2.I000o00OoI0I((String) object);
                                        break;
                                    } else {
/* 1734 */                              ((i11I0o0ii) i11i1ili.I00iiI).I0001Ioi1lo(i11, (i11I0IiII0Ol) object);
                                        break;
                                    }
                                } else {
                                    break;
                                }
                            case 9:
/* 1676 */                      if (i11loo.I000oI1ioi(obj, i9, i8, i10, i2)) {
/* 1686 */                          i11i1ili.I0000Il00O(i11, unsafe.getObject(obj, j), i11loo.I001lIiIIo1O(i9));
                                    break;
                                } else {
                                    break;
                                }
                            case 10:
/* 1652 */                      if (i11loo.I000oI1ioi(obj, i9, i8, i10, i2)) {
/* 1664 */                          ((i11I0o0ii) i11i1ili.I00iiI).I0001Ioi1lo(i11, (i11I0IiII0Ol) unsafe.getObject(obj, j));
                                    break;
                                } else {
                                    break;
                                }
                            case 11:
/* 1630 */                      if (i11loo.I000oI1ioi(obj, i9, i8, i10, i2)) {
/* 1640 */                          ((i11I0o0ii) i11i1ili.I00iiI).I00100l0(i11, unsafe.getInt(obj, j));
                                    break;
                                } else {
                                    break;
                                }
                            case 12:
/* 1608 */                      if (i11loo.I000oI1ioi(obj, i9, i8, i10, i2)) {
/* 1618 */                          ((i11I0o0ii) i11i1ili.I00iiI).I000l1(i11, unsafe.getInt(obj, j));
                                    break;
                                } else {
                                    break;
                                }
                            case 13:
/* 1586 */                      if (i11loo.I000oI1ioi(obj, i9, i8, i10, i2)) {
/* 1596 */                          ((i11I0o0ii) i11i1ili.I00iiI).I000O01llI0(i11, unsafe.getInt(obj, j));
                                    break;
                                } else {
                                    break;
                                }
                            case 14:
/* 1564 */                      if (i11loo.I000oI1ioi(obj, i9, i8, i10, i2)) {
/* 1574 */                          ((i11I0o0ii) i11i1ili.I00iiI).I000OiO(i11, unsafe.getLong(obj, j));
                                    break;
                                } else {
                                    break;
                                }
                            case 15:
/* 1537 */                      if (i11loo.I000oI1ioi(obj, i9, i8, i10, i2)) {
/* 1539 */                          int i15 = unsafe.getInt(obj, j);
/* 1552 */                          ((i11I0o0ii) i11i1ili.I00iiI).I00100l0(i11, (i15 >> 31) ^ (i15 + i15));
                                    break;
                                } else {
                                    break;
                                }
                            case 16:
/* 1509 */                      if (i11loo.I000oI1ioi(obj, i9, i8, i10, i2)) {
/* 1511 */                          long j2 = unsafe.getLong(obj, j);
/* 1525 */                          ((i11I0o0ii) i11i1ili.I00iiI).I0010I0i(i11, (j2 + j2) ^ (j2 >> 63));
                                    break;
                                } else {
                                    break;
                                }
                            case 17:
/* 1487 */                      if (i11loo.I000oI1ioi(obj, i9, i8, i10, i2)) {
/* 1497 */                          i11i1ili.I00000oIO(i11, unsafe.getObject(obj, j), i11loo.I001lIiIIo1O(i9));
                                    break;
                                } else {
                                    break;
                                }
                            case PoseLandmark.RIGHT_PINKY:
/* 1460 */                      i3 = i8;
/* 1462 */                      i4 = i10;
/* 1475 */                      i11o00oiil.I0010I0i(iArr[i9], (List) unsafe.getObject(obj, j), i11i1ili, false);
/* 1023 */                      i8 = i3;
/* 1025 */                      i10 = i4;
                                break;
                            case PoseLandmark.LEFT_INDEX:
/* 1440 */                      i3 = i8;
/* 1442 */                      i4 = i10;
/* 1455 */                      i11o00oiil.I001IO000(iArr[i9], (List) unsafe.getObject(obj, j), i11i1ili, false);
/* 1023 */                      i8 = i3;
/* 1025 */                      i10 = i4;
                                break;
                            case PoseLandmark.RIGHT_INDEX:
/* 1420 */                      i3 = i8;
/* 1422 */                      i4 = i10;
/* 1435 */                      i11o00oiil.I001i1lo1io(iArr[i9], (List) unsafe.getObject(obj, j), i11i1ili, false);
/* 1023 */                      i8 = i3;
/* 1025 */                      i10 = i4;
                                break;
                            case PoseLandmark.LEFT_THUMB:
/* 1400 */                      i3 = i8;
/* 1402 */                      i4 = i10;
/* 1415 */                      i11o00oiil.I0000O(iArr[i9], (List) unsafe.getObject(obj, j), i11i1ili, false);
/* 1023 */                      i8 = i3;
/* 1025 */                      i10 = i4;
                                break;
                            case PoseLandmark.RIGHT_THUMB:
/* 1380 */                      i3 = i8;
/* 1382 */                      i4 = i10;
/* 1395 */                      i11o00oiil.I001i1O0Ol(iArr[i9], (List) unsafe.getObject(obj, j), i11i1ili, false);
/* 1023 */                      i8 = i3;
/* 1025 */                      i10 = i4;
                                break;
                            case PoseLandmark.LEFT_HIP:
/* 1360 */                      i3 = i8;
/* 1362 */                      i4 = i10;
/* 1375 */                      i11o00oiil.I001IIilI0O(iArr[i9], (List) unsafe.getObject(obj, j), i11i1ili, false);
/* 1023 */                      i8 = i3;
/* 1025 */                      i10 = i4;
                                break;
                            case PoseLandmark.RIGHT_HIP:
/* 1340 */                      i3 = i8;
/* 1342 */                      i4 = i10;
/* 1355 */                      i11o00oiil.I00111O(iArr[i9], (List) unsafe.getObject(obj, j), i11i1ili, false);
/* 1023 */                      i8 = i3;
/* 1025 */                      i10 = i4;
                                break;
                            case PoseLandmark.LEFT_KNEE:
/* 1320 */                      i3 = i8;
/* 1322 */                      i4 = i10;
/* 1335 */                      i11o00oiil.I00100o1O0lo(iArr[i9], (List) unsafe.getObject(obj, j), i11i1ili, false);
/* 1023 */                      i8 = i3;
/* 1025 */                      i10 = i4;
                                break;
                            case PoseLandmark.RIGHT_KNEE:
/* 1219 */                      i5 = i8;
/* 1221 */                      i6 = i10;
/* 1225 */                      int i16 = iArr[i9];
/* 1231 */                      List list = (List) unsafe.getObject(obj, j);
/* 1233 */                      loIOiIO1O1 loioiio1o1 = i11o00oiil.I00000oIO;
/* 1235 */                      if (list != null && !list.isEmpty()) {
/* 1245 */                          i11I0o0ii i11i0o0ii3 = (i11I0o0ii) i11i1ili.I00iiI;
/* 1249 */                          if (list instanceof i11iOOOi01l) {
/* 1252 */                              i11iOOOi01l i11ioooi01l = (i11iOOOi01l) list;
/* 1259 */                              for (int i17 = 0; i17 < list.size(); i17++) {
/* 1261 */                                  Object objI000l1 = i11ioooi01l.I000l1();
/* 1267 */                                  if (objI000l1 instanceof String) {
/* 1277 */                                      i11i0o0ii3.I00100o1O0lo((i16 << 3) | 2);
/* 1280 */                                      i11i0o0ii3.I000o00OoI0I((String) objI000l1);
                                            } else {
/* 1286 */                                      i11i0o0ii3.I0001Ioi1lo(i16, (i11I0IiII0Ol) objI000l1);
                                            }
                                        }
                                    } else {
/* 1297 */                              for (int i18 = 0; i18 < list.size(); i18++) {
/* 1303 */                                  String str = (String) list.get(i18);
/* 1311 */                                  i11i0o0ii3.I00100o1O0lo((i16 << 3) | 2);
/* 1314 */                                  i11i0o0ii3.I000o00OoI0I(str);
                                        }
                                    }
                                }
/* 711 */                       i8 = i5;
/* 713 */                       i10 = i6;
                                break;
                            case 27:
/* 1174 */                      i5 = i8;
/* 1176 */                      i6 = i10;
/* 1180 */                      int i19 = iArr[i9];
/* 1186 */                      List list2 = (List) unsafe.getObject(obj, j);
/* 1188 */                      i11lo1 i11lo1VarI001lIiIIo1O = i11loo.I001lIiIIo1O(i9);
/* 1192 */                      loIOiIO1O1 loioiio1o12 = i11o00oiil.I00000oIO;
/* 1194 */                      if (list2 != null && !list2.isEmpty()) {
/* 1207 */                          for (int i20 = 0; i20 < list2.size(); i20++) {
/* 1213 */                              i11i1ili.I0000Il00O(i19, list2.get(i20), i11lo1VarI001lIiIIo1O);
                                    }
                                }
/* 711 */                       i8 = i5;
/* 713 */                       i10 = i6;
                                break;
                            case PoseLandmark.RIGHT_ANKLE:
/* 1124 */                      i5 = i8;
/* 1126 */                      i6 = i10;
/* 1130 */                      int i21 = iArr[i9];
/* 1136 */                      List list3 = (List) unsafe.getObject(obj, j);
/* 1138 */                      loIOiIO1O1 loioiio1o13 = i11o00oiil.I00000oIO;
/* 1140 */                      if (list3 != null && !list3.isEmpty()) {
/* 1148 */                          i11i1ili.getClass();
/* 1156 */                          for (int i22 = 0; i22 < list3.size(); i22++) {
/* 1168 */                              ((i11I0o0ii) i11i1ili.I00iiI).I0001Ioi1lo(i21, (i11I0IiII0Ol) list3.get(i22));
                                    }
                                }
/* 711 */                       i8 = i5;
/* 713 */                       i10 = i6;
                                break;
                            case PoseLandmark.LEFT_HEEL:
/* 1105 */                      i3 = i8;
/* 1107 */                      i4 = i10;
/* 1111 */                      z2 = false;
/* 1120 */                      i11o00oiil.I0000Il00O(iArr[i9], (List) unsafe.getObject(obj, j), i11i1ili, false);
/* 1023 */                      i8 = i3;
/* 1025 */                      i10 = i4;
                                break;
                            case 30:
/* 1086 */                      i3 = i8;
/* 1088 */                      i4 = i10;
/* 1092 */                      z2 = false;
/* 1101 */                      i11o00oiil.I0010o(iArr[i9], (List) unsafe.getObject(obj, j), i11i1ili, false);
/* 1023 */                      i8 = i3;
/* 1025 */                      i10 = i4;
                                break;
                            case PoseLandmark.LEFT_FOOT_INDEX:
/* 1067 */                      i3 = i8;
/* 1069 */                      i4 = i10;
/* 1073 */                      z2 = false;
/* 1082 */                      i11o00oiil.I001iOo1i0O(iArr[i9], (List) unsafe.getObject(obj, j), i11i1ili, false);
/* 1023 */                      i8 = i3;
/* 1025 */                      i10 = i4;
                                break;
                            case 32:
/* 1048 */                      i3 = i8;
/* 1050 */                      i4 = i10;
/* 1054 */                      z2 = false;
/* 1063 */                      i11o00oiil.I001l0I00(iArr[i9], (List) unsafe.getObject(obj, j), i11i1ili, false);
/* 1023 */                      i8 = i3;
/* 1025 */                      i10 = i4;
                                break;
                            case 33:
/* 1029 */                      i3 = i8;
/* 1031 */                      i4 = i10;
/* 1035 */                      z2 = false;
/* 1044 */                      i11o00oiil.I00000oIO(iArr[i9], (List) unsafe.getObject(obj, j), i11i1ili, false);
/* 1023 */                      i8 = i3;
/* 1025 */                      i10 = i4;
                                break;
                            case 34:
/* 1004 */                      i3 = i8;
/* 1006 */                      i4 = i10;
/* 1018 */                      z2 = false;
/* 1019 */                      i11o00oiil.I00000oOI(iArr[i9], (List) unsafe.getObject(obj, j), i11i1ili, false);
/* 1023 */                      i8 = i3;
/* 1025 */                      i10 = i4;
                                break;
                            case InputImage.IMAGE_FORMAT_YUV_420_888:
/* 983 */                       i5 = i8;
/* 985 */                       i6 = i10;
/* 999 */                       i11o00oiil.I0010I0i(iArr[i9], (List) unsafe.getObject(obj, j), i11i1ili, z);
/* 711 */                       i8 = i5;
/* 713 */                       i10 = i6;
                                break;
                            case 36:
/* 962 */                       i5 = i8;
/* 964 */                       i6 = i10;
/* 978 */                       i11o00oiil.I001IO000(iArr[i9], (List) unsafe.getObject(obj, j), i11i1ili, z);
/* 711 */                       i8 = i5;
/* 713 */                       i10 = i6;
                                break;
                            case 37:
/* 941 */                       i5 = i8;
/* 943 */                       i6 = i10;
/* 957 */                       i11o00oiil.I001i1lo1io(iArr[i9], (List) unsafe.getObject(obj, j), i11i1ili, z);
/* 711 */                       i8 = i5;
/* 713 */                       i10 = i6;
                                break;
                            case 38:
/* 920 */                       i5 = i8;
/* 922 */                       i6 = i10;
/* 936 */                       i11o00oiil.I0000O(iArr[i9], (List) unsafe.getObject(obj, j), i11i1ili, z);
/* 711 */                       i8 = i5;
/* 713 */                       i10 = i6;
                                break;
                            case 39:
/* 899 */                       i5 = i8;
/* 901 */                       i6 = i10;
/* 915 */                       i11o00oiil.I001i1O0Ol(iArr[i9], (List) unsafe.getObject(obj, j), i11i1ili, z);
/* 711 */                       i8 = i5;
/* 713 */                       i10 = i6;
                                break;
                            case 40:
/* 878 */                       i5 = i8;
/* 880 */                       i6 = i10;
/* 894 */                       i11o00oiil.I001IIilI0O(iArr[i9], (List) unsafe.getObject(obj, j), i11i1ili, z);
/* 711 */                       i8 = i5;
/* 713 */                       i10 = i6;
                                break;
                            case 41:
/* 857 */                       i5 = i8;
/* 859 */                       i6 = i10;
/* 873 */                       i11o00oiil.I00111O(iArr[i9], (List) unsafe.getObject(obj, j), i11i1ili, z);
/* 711 */                       i8 = i5;
/* 713 */                       i10 = i6;
                                break;
                            case 42:
/* 836 */                       i5 = i8;
/* 838 */                       i6 = i10;
/* 852 */                       i11o00oiil.I00100o1O0lo(iArr[i9], (List) unsafe.getObject(obj, j), i11i1ili, z);
/* 711 */                       i8 = i5;
/* 713 */                       i10 = i6;
                                break;
                            case 43:
/* 816 */                       i5 = i8;
/* 818 */                       i6 = i10;
/* 832 */                       i11o00oiil.I0000Il00O(iArr[i9], (List) unsafe.getObject(obj, j), i11i1ili, z);
/* 711 */                       i8 = i5;
/* 713 */                       i10 = i6;
                                break;
                            case 44:
/* 796 */                       i5 = i8;
/* 798 */                       i6 = i10;
/* 812 */                       i11o00oiil.I0010o(iArr[i9], (List) unsafe.getObject(obj, j), i11i1ili, z);
/* 711 */                       i8 = i5;
/* 713 */                       i10 = i6;
                                break;
                            case BuildConfig.VERSION_CODE:
/* 776 */                       i5 = i8;
/* 778 */                       i6 = i10;
/* 792 */                       i11o00oiil.I001iOo1i0O(iArr[i9], (List) unsafe.getObject(obj, j), i11i1ili, z);
/* 711 */                       i8 = i5;
/* 713 */                       i10 = i6;
                                break;
                            case 46:
/* 756 */                       i5 = i8;
/* 758 */                       i6 = i10;
/* 772 */                       i11o00oiil.I001l0I00(iArr[i9], (List) unsafe.getObject(obj, j), i11i1ili, z);
/* 711 */                       i8 = i5;
/* 713 */                       i10 = i6;
                                break;
                            case 47:
/* 736 */                       i5 = i8;
/* 738 */                       i6 = i10;
/* 752 */                       i11o00oiil.I00000oIO(iArr[i9], (List) unsafe.getObject(obj, j), i11i1ili, z);
/* 711 */                       i8 = i5;
/* 713 */                       i10 = i6;
                                break;
                            case 48:
/* 717 */                       i5 = i8;
/* 719 */                       i6 = i10;
/* 732 */                       i11o00oiil.I00000oOI(iArr[i9], (List) unsafe.getObject(obj, j), i11i1ili, true);
/* 711 */                       i8 = i5;
/* 713 */                       i10 = i6;
                                break;
                            case 49:
/* 666 */                       i5 = i8;
/* 668 */                       i6 = i10;
/* 672 */                       int i23 = iArr[i9];
/* 678 */                       List list4 = (List) unsafe.getObject(obj, j);
/* 680 */                       i11lo1 i11lo1VarI001lIiIIo1O2 = i11loo.I001lIiIIo1O(i9);
/* 684 */                       loIOiIO1O1 loioiio1o14 = i11o00oiil.I00000oIO;
/* 686 */                       if (list4 != null && !list4.isEmpty()) {
/* 699 */                           for (int i24 = 0; i24 < list4.size(); i24++) {
/* 705 */                               i11i1ili.I00000oIO(i23, list4.get(i24), i11lo1VarI001lIiIIo1O2);
                                    }
                                }
/* 711 */                       i8 = i5;
/* 713 */                       i10 = i6;
                                break;
                            case 50:
/* 555 */                       Object object2 = unsafe.getObject(obj, j);
/* 559 */                       if (object2 != null) {
/* 561 */                           int i25 = i9 / 3;
/* 570 */                           iOliil ioliil = ((i11l1l0) i11loo.I00000oOI[i25 + i25]).I00000oIO;
/* 576 */                           i11I0o0ii i11i0o0ii4 = (i11I0o0ii) i11i1ili.I00iiI;
/* 582 */                           Iterator it = ((i11l1l0IiI) object2).entrySet().iterator();
/* 590 */                           while (it.hasNext()) {
/* 596 */                               Map.Entry entry2 = (Map.Entry) it.next();
/* 598 */                               i11i0o0ii4.I000oI1ioi(i11, i14);
/* 601 */                               Object key = entry2.getKey();
/* 605 */                               Object value = entry2.getValue();
/* 609 */                               int i26 = i8;
/* 613 */                               i11oIoi1 i11oioi12 = (i11oIoi1) ioliil.I00iiI;
/* 615 */                               int i27 = i10;
/* 619 */                               i11oIoi1 i11oioi13 = (i11oIoi1) ioliil.I00iio;
/* 621 */                               Iterator it2 = it;
/* 623 */                               boolean z3 = z;
/* 635 */                               i11i0o0ii4.I00100o1O0lo(i11Ii1iI0.I00000oIO(i11oioi13, 2, value) + i11Ii1iI0.I00000oIO(i11oioi12, z3 ? 1 : 0, key));
/* 638 */                               Object key2 = entry2.getKey();
/* 642 */                               Object value2 = entry2.getValue();
/* 650 */                               i11Ii1iI0.I0000oI00(i11i0o0ii4, (i11oIoi1) ioliil.I00iiI, z3 ? 1 : 0, key2);
/* 653 */                               i11Ii1iI0.I0000oI00(i11i0o0ii4, i11oioi13, 2, value2);
/* 656 */                               i14 = 2;
/* 657 */                               it = it2;
/* 659 */                               i8 = i26;
/* 661 */                               i10 = i27;
/* 663 */                               z = true;
                                    }
                                }
                                break;
                            case 51:
/* 528 */                       if (i11loo.I00100o1O0lo(obj, i11, i9)) {
/* 548 */                           ((i11I0o0ii) i11i1ili.I00iiI).I000OiO(i11, Double.doubleToRawLongBits(((Double) i11oI1O.I000II(j, obj)).doubleValue()));
                                }
                                break;
                            case 52:
/* 499 */                       if (i11loo.I00100o1O0lo(obj, i11, i9)) {
/* 519 */                           ((i11I0o0ii) i11i1ili.I00iiI).I000O01llI0(i11, Float.floatToRawIntBits(((Float) i11oI1O.I000II(j, obj)).floatValue()));
                                }
                                break;
                            case 53:
/* 480 */                       if (i11loo.I00100o1O0lo(obj, i11, i9)) {
/* 490 */                           ((i11I0o0ii) i11i1ili.I00iiI).I0010I0i(i11, I001iOo1i0O(j, obj));
                                }
                                break;
                            case 54:
/* 461 */                       if (i11loo.I00100o1O0lo(obj, i11, i9)) {
/* 471 */                           ((i11I0o0ii) i11i1ili.I00iiI).I0010I0i(i11, I001iOo1i0O(j, obj));
                                }
                                break;
                            case 55:
/* 442 */                       if (i11loo.I00100o1O0lo(obj, i11, i9)) {
/* 452 */                           ((i11I0o0ii) i11i1ili.I00iiI).I000l1(i11, I001IIilI0O(j, obj));
                                }
                                break;
                            case 56:
/* 423 */                       if (i11loo.I00100o1O0lo(obj, i11, i9)) {
/* 433 */                           ((i11I0o0ii) i11i1ili.I00iiI).I000OiO(i11, I001iOo1i0O(j, obj));
                                }
                                break;
                            case 57:
/* 404 */                       if (i11loo.I00100o1O0lo(obj, i11, i9)) {
/* 414 */                           ((i11I0o0ii) i11i1ili.I00iiI).I000O01llI0(i11, I001IIilI0O(j, obj));
                                }
                                break;
                            case 58:
/* 374 */                       if (i11loo.I00100o1O0lo(obj, i11, i9)) {
/* 382 */                           boolean zBooleanValue = ((Boolean) i11oI1O.I000II(j, obj)).booleanValue();
/* 388 */                           i11I0o0ii i11i0o0ii5 = (i11I0o0ii) i11i1ili.I00iiI;
/* 392 */                           i11i0o0ii5.I00100o1O0lo(i11 << 3);
/* 395 */                           i11i0o0ii5.I0000O(zBooleanValue ? (byte) 1 : (byte) 0);
                                }
                                break;
                            case 59:
/* 332 */                       if (i11loo.I00100o1O0lo(obj, i11, i9)) {
/* 334 */                           Object object3 = unsafe.getObject(obj, j);
/* 340 */                           if (object3 instanceof String) {
/* 346 */                               i11I0o0ii i11i0o0ii6 = (i11I0o0ii) i11i1ili.I00iiI;
/* 351 */                               i11i0o0ii6.I00100o1O0lo(2 | (i11 << 3));
/* 354 */                               i11i0o0ii6.I000o00OoI0I((String) object3);
                                    } else {
/* 365 */                               ((i11I0o0ii) i11i1ili.I00iiI).I0001Ioi1lo(i11, (i11I0IiII0Ol) object3);
                                    }
                                }
                                break;
                            case 60:
/* 311 */                       if (i11loo.I00100o1O0lo(obj, i11, i9)) {
/* 321 */                           i11i1ili.I0000Il00O(i11, unsafe.getObject(obj, j), i11loo.I001lIiIIo1O(i9));
                                }
                                break;
                            case 61:
/* 288 */                       if (i11loo.I00100o1O0lo(obj, i11, i9)) {
/* 300 */                           ((i11I0o0ii) i11i1ili.I00iiI).I0001Ioi1lo(i11, (i11I0IiII0Ol) unsafe.getObject(obj, j));
                                }
                                break;
                            case 62:
/* 267 */                       if (i11loo.I00100o1O0lo(obj, i11, i9)) {
/* 277 */                           ((i11I0o0ii) i11i1ili.I00iiI).I00100l0(i11, I001IIilI0O(j, obj));
                                }
                                break;
                            case 63:
/* 249 */                       if (i11loo.I00100o1O0lo(obj, i11, i9)) {
/* 259 */                           ((i11I0o0ii) i11i1ili.I00iiI).I000l1(i11, I001IIilI0O(j, obj));
                                }
                                break;
                            case Barcode.FORMAT_EAN_8:
/* 231 */                       if (i11loo.I00100o1O0lo(obj, i11, i9)) {
/* 241 */                           ((i11I0o0ii) i11i1ili.I00iiI).I000O01llI0(i11, I001IIilI0O(j, obj));
                                }
                                break;
                            case 65:
/* 213 */                       if (i11loo.I00100o1O0lo(obj, i11, i9)) {
/* 223 */                           ((i11I0o0ii) i11i1ili.I00iiI).I000OiO(i11, I001iOo1i0O(j, obj));
                                }
                                break;
                            case 66:
/* 190 */                       if (i11loo.I00100o1O0lo(obj, i11, i9)) {
/* 192 */                           int iI001IIilI0O = I001IIilI0O(j, obj);
/* 205 */                           ((i11I0o0ii) i11i1ili.I00iiI).I00100l0(i11, (iI001IIilI0O >> 31) ^ (iI001IIilI0O + iI001IIilI0O));
                                }
                                break;
                            case 67:
/* 166 */                       if (i11loo.I00100o1O0lo(obj, i11, i9)) {
/* 168 */                           long jI001iOo1i0O = I001iOo1i0O(j, obj);
/* 182 */                           ((i11I0o0ii) i11i1ili.I00iiI).I0010I0i(i11, (jI001iOo1i0O + jI001iOo1i0O) ^ (jI001iOo1i0O >> 63));
                                }
                                break;
                            case 68:
/* 146 */                       if (i11loo.I00100o1O0lo(obj, i11, i9)) {
/* 158 */                           i11i1ili.I00000oIO(i11, unsafe.getObject(obj, j), i11loo.I001lIiIIo1O(i9));
                                }
                                break;
                        }
/* 1922 */              i9 += 3;
/* 1924 */              i7 = 1048575;
/* 1927 */              i11loo = this;
                    }
/* 1933 */          if (entry == null) {
/* 1940 */              ((i11O1oIl) obj).zbc.I0000O(i11i1ili);
/* 1943 */              return;
                    }
/* 1944 */          liiooiio1oi.getClass();
/* 1953 */          i11oIoi1 i11oioi14 = i11oIoi1.I00iiO;
/* 1955 */          throw null;
                }

                /* JADX WARN: Removed duplicated region for block: B:144:0x03a3 A[PHI: r18
                  0x03a3: PHI (r18v21 int) = (r18v3 int), (r18v4 int), (r18v10 int), (r18v12 int), (r18v13 int), (r18v14 int), (r18v18 int), (r18v22 int) binds: [B:207:0x0550, B:203:0x0532, B:177:0x0495, B:164:0x0432, B:160:0x0416, B:156:0x03fa, B:149:0x03c2, B:143:0x03a1] A[DONT_GENERATE, DONT_INLINE]] */
                /* JADX WARN: Removed duplicated region for block: B:197:0x04f8 A[PHI: r18
                  0x04f8: PHI (r18v8 int) = (r18v2 int), (r18v9 int) binds: [B:211:0x056e, B:196:0x04f6] A[DONT_GENERATE, DONT_INLINE]] */
                /* JADX WARN: Removed duplicated region for block: B:230:0x05fe  */
                /* JADX WARN: Removed duplicated region for block: B:233:0x060d A[PHI: r7
                  0x060d: PHI (r7v9 int) = (r7v1 int), (r7v5 int), (r7v10 int) binds: [B:272:0x0710, B:257:0x06b7, B:232:0x060b] A[DONT_GENERATE, DONT_INLINE]] */
                /* JADX WARN: Removed duplicated region for block: B:34:0x00ad  */
                @Override
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final int I000O01llI0(i1111ll i1111llVar) {
                    int i;
                    int i2;
                    int iI00000oOI;
                    int iI0000Il00O;
                    int iI00000oOI2;
                    int iI0000oI00;
                    int iI00000oOI3;
                    int iI00000oIO;
                    int i3;
                    int iI00000oOI4;
                    int i4;
                    int iI00000oIO2;
                    int i5;
                    int iI000O01llI0;
                    int size;
                    int iI000o00OoI0I;
                    int iI00000oOI5;
                    int iI00000oOI6;
                    int iI00000oOI7;
                    int iI00000oOI8;
                    int size2;
                    int iI00000oOI9;
                    int iI00000oIO3;
                    int iI00000oOI10;
                    int iI0000Il00O2;
                    int iI00000oOI11;
                    int iI0000oI002;
                    int iI001IIilI0O;
/* 1 */             i11lOO i11loo = this;
/* 3 */             i1111ll i1111llVar2 = i1111llVar;
/* 5 */             int[] iArr = i11loo.I00000oIO;
/* 7 */             int i6 = 1048575;
/* 10 */            int i7 = 1048575;
/* 11 */            int i8 = 0;
/* 12 */            int i9 = 0;
/* 13 */            int iI0000oI003 = 0;
/* 15 */            while (i8 < iArr.length) {
/* 17 */                int iI001i1lo1io = i11loo.I001i1lo1io(i8);
/* 21 */                int iI001i1O0Ol = I001i1O0Ol(iI001i1lo1io);
/* 27 */                int i10 = iArr[i8];
/* 29 */                int i11 = iArr[i8 + 2];
/* 31 */                int i12 = i11 & i6;
/* 36 */                Unsafe unsafe = I000lI;
/* 38 */                if (iI001i1O0Ol <= 17) {
/* 40 */                    if (i12 != i7) {
/* 47 */                        i9 = i12 == i6 ? 0 : unsafe.getInt(i1111llVar2, i12);
/* 52 */                        i7 = i12;
                            }
/* 55 */                    i = 1 << (i11 >>> 20);
                        } else {
/* 58 */                    i = 0;
                        }
/* 59 */                int i13 = iI001i1lo1io & i6;
/* 64 */                if (iI001i1O0Ol >= i11IiII0.I00iiI.I00iOIl) {
/* 68 */                    int i14 = i11IiII0.I00iiO.I00iOIl;
                        }
                        long j = i13;
/* 73 */                int iI00000oOI12 = 4;
                        switch (iI001i1O0Ol) {
                            case 0:
/* 1818 */                      if (i11loo.I000oI1ioi(i1111llVar2, i8, i7, i9, i)) {
/* 1822 */                          iI0000oI003 = OooioIOo1.I0000oI00(i10 << 3, 8, iI0000oI003);
                                    break;
                                } else {
                                    break;
                                }
                            case 1:
/* 1803 */                      i2 = 4;
/* 1809 */                      if (i11loo.I000oI1ioi(i1111llVar2, i8, i7, i9, i)) {
/* 1552 */                          iI0000oI003 = OooioIOo1.I0000oI00(i10 << 3, i2, iI0000oI003);
                                }
/* 1497 */                      i11loo = this;
                                break;
                            case 2:
/* 1785 */                      if (i11loo.I000oI1ioi(i1111llVar2, i8, i7, i9, i)) {
/* 1789 */                          long j2 = unsafe.getLong(i1111llVar2, j);
/* 1793 */                          iI00000oOI = i11I0o0ii.I00000oOI(i10 << 3);
/* 1797 */                          iI0000Il00O = i11I0o0ii.I0000Il00O(j2);
/* 1496 */                          iI0000oI003 += iI0000Il00O + iI00000oOI;
                                }
/* 1497 */                      i11loo = this;
                                break;
                            case 3:
/* 1762 */                      if (i11loo.I000oI1ioi(i1111llVar2, i8, i7, i9, i)) {
/* 1766 */                          long j3 = unsafe.getLong(i1111llVar2, j);
/* 1770 */                          iI00000oOI = i11I0o0ii.I00000oOI(i10 << 3);
/* 1774 */                          iI0000Il00O = i11I0o0ii.I0000Il00O(j3);
/* 1496 */                          iI0000oI003 += iI0000Il00O + iI00000oOI;
                                }
/* 1497 */                      i11loo = this;
                                break;
                            case 4:
/* 1738 */                      if (i11loo.I000oI1ioi(i1111llVar2, i8, i7, i9, i)) {
/* 1742 */                          long j4 = unsafe.getInt(i1111llVar2, j);
/* 1747 */                          iI00000oOI = i11I0o0ii.I00000oOI(i10 << 3);
/* 1751 */                          iI0000Il00O = i11I0o0ii.I0000Il00O(j4);
/* 1496 */                          iI0000oI003 += iI0000Il00O + iI00000oOI;
                                }
/* 1497 */                      i11loo = this;
                                break;
                            case 5:
/* 1729 */                      if (i11loo.I000oI1ioi(i1111llVar2, i8, i7, i9, i)) {
/* 1537 */                          iI0000oI003 = OooioIOo1.I0000oI00(i10 << 3, 8, iI0000oI003);
                                }
/* 1497 */                      i11loo = this;
                                break;
                            case 6:
/* 1714 */                      i2 = 4;
/* 1720 */                      if (i11loo.I000oI1ioi(i1111llVar2, i8, i7, i9, i)) {
                                }
/* 1497 */                      i11loo = this;
                                break;
                            case 7:
/* 1703 */                      if (i11loo.I000oI1ioi(i1111llVar2, i8, i7, i9, i)) {
/* 1708 */                          iI0000oI003 = OooioIOo1.I0000oI00(i10 << 3, 1, iI0000oI003);
                                }
/* 1497 */                      i11loo = this;
                                break;
                            case 8:
/* 1663 */                      if (i11loo.I000oI1ioi(i1111llVar2, i8, i7, i9, i)) {
/* 1665 */                          int i15 = i10 << 3;
/* 1667 */                          Object object = unsafe.getObject(i1111llVar2, j);
/* 1673 */                          if (object instanceof i11I0IiII0Ol) {
/* 1677 */                              iI00000oOI2 = i11I0o0ii.I00000oOI(i15);
/* 1681 */                              iI0000oI00 = ((i11I0IiII0Ol) object).I0000oI00();
/* 1621 */                              iI0000oI003 = OooioIOo1.I0001Ioi1lo(iI0000oI00, iI0000oI00, iI00000oOI2, iI0000oI003);
                                    } else {
/* 1688 */                              iI00000oOI = i11I0o0ii.I00000oOI(i15);
/* 1692 */                              iI0000Il00O = i11I0o0ii.I00000oIO((String) object);
/* 1496 */                              iI0000oI003 += iI0000Il00O + iI00000oOI;
                                    }
                                }
/* 1497 */                      i11loo = this;
                                break;
                            case 9:
/* 1632 */                      if (i11loo.I000oI1ioi(i1111llVar2, i8, i7, i9, i)) {
/* 1634 */                          Object object2 = unsafe.getObject(i1111llVar2, j);
/* 1638 */                          i11lo1 i11lo1VarI001lIiIIo1O = i11loo.I001lIiIIo1O(i8);
/* 1642 */                          loIOiIO1O1 loioiio1o1 = i11o00oiil.I00000oIO;
/* 1648 */                          iI00000oOI3 = i11I0o0ii.I00000oOI(i10 << 3);
/* 1652 */                          iI00000oIO = ((i1111ll) object2).I00000oIO(i11lo1VarI001lIiIIo1O);
/* 286 */                           iI0000oI003 = OooioIOo1.I0001Ioi1lo(iI00000oIO, iI00000oIO, iI00000oOI3, iI0000oI003);
                                    break;
                                } else {
                                    break;
                                }
                            case 10:
/* 1603 */                      if (i11loo.I000oI1ioi(i1111llVar2, i8, i7, i9, i)) {
/* 1611 */                          i11I0IiII0Ol i11i0iiii0ol = (i11I0IiII0Ol) unsafe.getObject(i1111llVar2, j);
/* 1613 */                          iI00000oOI2 = i11I0o0ii.I00000oOI(i10 << 3);
/* 1617 */                          iI0000oI00 = i11i0iiii0ol.I0000oI00();
/* 1621 */                          iI0000oI003 = OooioIOo1.I0001Ioi1lo(iI0000oI00, iI0000oI00, iI00000oOI2, iI0000oI003);
                                }
/* 1497 */                      i11loo = this;
                                break;
                            case 11:
/* 1585 */                      if (i11loo.I000oI1ioi(i1111llVar2, i8, i7, i9, i)) {
/* 1589 */                          i3 = unsafe.getInt(i1111llVar2, j);
/* 1593 */                          iI00000oOI4 = i11I0o0ii.I00000oOI(i10 << 3);
/* 1523 */                          iI0000oI003 = OooioIOo1.I0000oI00(i3, iI00000oOI4, iI0000oI003);
                                }
/* 1497 */                      i11loo = this;
                                break;
                            case 12:
/* 1562 */                      if (i11loo.I000oI1ioi(i1111llVar2, i8, i7, i9, i)) {
/* 1566 */                          long j5 = unsafe.getInt(i1111llVar2, j);
/* 1571 */                          iI00000oOI = i11I0o0ii.I00000oOI(i10 << 3);
/* 1575 */                          iI0000Il00O = i11I0o0ii.I0000Il00O(j5);
/* 1496 */                          iI0000oI003 += iI0000Il00O + iI00000oOI;
                                }
/* 1497 */                      i11loo = this;
                                break;
                            case 13:
/* 1542 */                      i2 = 4;
/* 1548 */                      if (i11loo.I000oI1ioi(i1111llVar2, i8, i7, i9, i)) {
                                }
/* 1497 */                      i11loo = this;
                                break;
                            case 14:
/* 1533 */                      if (i11loo.I000oI1ioi(i1111llVar2, i8, i7, i9, i)) {
                                }
/* 1497 */                      i11loo = this;
                                break;
                            case 15:
/* 1506 */                      if (i11loo.I000oI1ioi(i1111llVar2, i8, i7, i9, i)) {
/* 1510 */                          int i16 = unsafe.getInt(i1111llVar2, j);
/* 1518 */                          iI00000oOI4 = i11I0o0ii.I00000oOI(i10 << 3);
/* 1522 */                          i3 = (i16 >> 31) ^ (i16 + i16);
/* 1523 */                          iI0000oI003 = OooioIOo1.I0000oI00(i3, iI00000oOI4, iI0000oI003);
                                }
/* 1497 */                      i11loo = this;
                                break;
                            case 16:
/* 1474 */                      if (i11loo.I000oI1ioi(i1111llVar2, i8, i7, i9, i)) {
/* 1478 */                          long j6 = unsafe.getLong(i1111llVar2, j);
/* 1486 */                          iI00000oOI = i11I0o0ii.I00000oOI(i10 << 3);
/* 1491 */                          iI0000Il00O = i11I0o0ii.I0000Il00O((j6 >> 63) ^ (j6 + j6));
/* 1496 */                          iI0000oI003 += iI0000Il00O + iI00000oOI;
                                }
/* 1497 */                      i11loo = this;
                                break;
                            case 17:
/* 1444 */                      if (i11loo.I000oI1ioi(i1111llVar2, i8, i7, i9, i)) {
/* 1450 */                          i1111ll i1111llVar3 = (i1111ll) unsafe.getObject(i1111llVar2, j);
/* 1452 */                          i11lo1 i11lo1VarI001lIiIIo1O2 = i11loo.I001lIiIIo1O(i8);
/* 1458 */                          int iI00000oOI13 = i11I0o0ii.I00000oOI(i10 << 3);
/* 1462 */                          i4 = iI00000oOI13 + iI00000oOI13;
/* 1463 */                          iI00000oIO2 = i1111llVar3.I00000oIO(i11lo1VarI001lIiIIo1O2);
/* 109 */                           iI0000oI003 += iI00000oIO2 + i4;
                                    break;
                                } else {
                                    break;
                                }
                            case PoseLandmark.RIGHT_PINKY:
/* 1425 */                      i5 = i7;
/* 1433 */                      iI000O01llI0 = i11o00oiil.I000O01llI0(i10, (List) unsafe.getObject(i1111llVar2, j));
/* 989 */                       iI0000oI003 += iI000O01llI0;
/* 536 */                       i7 = i5;
                                break;
                            case PoseLandmark.LEFT_INDEX:
/* 1411 */                      i5 = i7;
/* 1419 */                      iI000O01llI0 = i11o00oiil.I000II(i10, (List) unsafe.getObject(i1111llVar2, j));
/* 989 */                       iI0000oI003 += iI000O01llI0;
/* 536 */                       i7 = i5;
                                break;
                            case PoseLandmark.RIGHT_INDEX:
/* 1377 */                      i5 = i7;
/* 1383 */                      List list = (List) unsafe.getObject(i1111llVar2, j);
/* 1385 */                      loIOiIO1O1 loioiio1o12 = i11o00oiil.I00000oIO;
/* 1409 */                      iI00000oOI6 = list.size() == 0 ? 0 : (i11I0o0ii.I00000oOI(i10 << 3) * list.size()) + i11o00oiil.I000OiO(list);
/* 1286 */                      iI0000oI003 += iI00000oOI6;
/* 536 */                       i7 = i5;
                                break;
                            case PoseLandmark.LEFT_THUMB:
/* 1347 */                      i5 = i7;
/* 1353 */                      List list2 = (List) unsafe.getObject(i1111llVar2, j);
/* 1355 */                      loIOiIO1O1 loioiio1o13 = i11o00oiil.I00000oIO;
/* 1357 */                      size = list2.size();
/* 1361 */                      if (size != 0) {
/* 1367 */                          iI000o00OoI0I = i11o00oiil.I000o00OoI0I(list2);
/* 1371 */                          iI00000oOI5 = i11I0o0ii.I00000oOI(i10 << 3);
/* 945 */                           iI00000oOI7 = (iI00000oOI5 * size) + iI000o00OoI0I;
/* 946 */                           iI0000oI003 += iI00000oOI7;
/* 536 */                           i7 = i5;
                                    break;
                                }
/* 932 */                       iI00000oOI7 = 0;
/* 946 */                       iI0000oI003 += iI00000oOI7;
/* 536 */                       i7 = i5;
                            case PoseLandmark.RIGHT_THUMB:
/* 1317 */                      i5 = i7;
/* 1323 */                      List list3 = (List) unsafe.getObject(i1111llVar2, j);
/* 1325 */                      loIOiIO1O1 loioiio1o14 = i11o00oiil.I00000oIO;
/* 1327 */                      size = list3.size();
/* 1331 */                      if (size != 0) {
/* 1337 */                          iI000o00OoI0I = i11o00oiil.I000OOo1O(list3);
/* 1341 */                          iI00000oOI5 = i11I0o0ii.I00000oOI(i10 << 3);
/* 945 */                           iI00000oOI7 = (iI00000oOI5 * size) + iI000o00OoI0I;
/* 946 */                           iI0000oI003 += iI00000oOI7;
/* 536 */                           i7 = i5;
                                    break;
                                }
/* 932 */                       iI00000oOI7 = 0;
/* 946 */                       iI0000oI003 += iI00000oOI7;
/* 536 */                       i7 = i5;
                            case PoseLandmark.LEFT_HIP:
/* 1303 */                      i5 = i7;
/* 1311 */                      iI000O01llI0 = i11o00oiil.I000O01llI0(i10, (List) unsafe.getObject(i1111llVar2, j));
/* 989 */                       iI0000oI003 += iI000O01llI0;
/* 536 */                       i7 = i5;
                                break;
                            case PoseLandmark.RIGHT_HIP:
/* 1289 */                      i5 = i7;
/* 1297 */                      iI000O01llI0 = i11o00oiil.I000II(i10, (List) unsafe.getObject(i1111llVar2, j));
/* 989 */                       iI0000oI003 += iI000O01llI0;
/* 536 */                       i7 = i5;
                                break;
                            case PoseLandmark.LEFT_KNEE:
/* 1257 */                      i5 = i7;
/* 1263 */                      List list4 = (List) unsafe.getObject(i1111llVar2, j);
/* 1265 */                      loIOiIO1O1 loioiio1o15 = i11o00oiil.I00000oIO;
/* 1267 */                      int size3 = list4.size();
/* 1271 */                      if (size3 != 0) {
/* 1285 */                          iI00000oOI6 = (i11I0o0ii.I00000oOI(i10 << 3) + 1) * size3;
                                }
/* 1286 */                      iI0000oI003 += iI00000oOI6;
/* 536 */                       i7 = i5;
                                break;
                            case PoseLandmark.RIGHT_KNEE:
/* 1160 */                      i5 = i7;
/* 1166 */                      List list5 = (List) unsafe.getObject(i1111llVar2, j);
/* 1168 */                      loIOiIO1O1 loioiio1o16 = i11o00oiil.I00000oIO;
/* 1170 */                      int size4 = list5.size();
/* 1174 */                      if (size4 == 0) {
/* 932 */                           iI00000oOI7 = 0;
                                } else {
/* 1184 */                          iI00000oOI7 = i11I0o0ii.I00000oOI(i10 << 3) * size4;
/* 1187 */                          if (list5 instanceof i11iOOOi01l) {
/* 1189 */                              i11iOOOi01l i11ioooi01l = (i11iOOOi01l) list5;
/* 1192 */                              for (int i17 = 0; i17 < size4; i17++) {
/* 1194 */                                  Object objI000l1 = i11ioooi01l.I000l1();
/* 1200 */                                  if (objI000l1 instanceof i11I0IiII0Ol) {
/* 1204 */                                      int iI0000oI004 = ((i11I0IiII0Ol) objI000l1).I0000oI00();
/* 1208 */                                      iI00000oOI7 = OooioIOo1.I0000oI00(iI0000oI004, iI0000oI004, iI00000oOI7);
                                            } else {
/* 1219 */                                      iI00000oOI7 = i11I0o0ii.I00000oIO((String) objI000l1) + iI00000oOI7;
                                            }
                                        }
                                    } else {
/* 1225 */                              for (int i18 = 0; i18 < size4; i18++) {
/* 1227 */                                  Object obj = list5.get(i18);
/* 1233 */                                  if (obj instanceof i11I0IiII0Ol) {
/* 1237 */                                      int iI0000oI005 = ((i11I0IiII0Ol) obj).I0000oI00();
/* 1241 */                                      iI00000oOI7 = OooioIOo1.I0000oI00(iI0000oI005, iI0000oI005, iI00000oOI7);
                                            } else {
/* 1252 */                                      iI00000oOI7 = i11I0o0ii.I00000oIO((String) obj) + iI00000oOI7;
                                            }
                                        }
                                    }
                                }
/* 946 */                       iI0000oI003 += iI00000oOI7;
/* 536 */                       i7 = i5;
                                break;
                            case 27:
/* 1110 */                      i5 = i7;
/* 1116 */                      List list6 = (List) unsafe.getObject(i1111llVar2, j);
/* 1118 */                      i11lo1 i11lo1VarI001lIiIIo1O3 = i11loo.I001lIiIIo1O(i8);
/* 1122 */                      loIOiIO1O1 loioiio1o17 = i11o00oiil.I00000oIO;
/* 1124 */                      int size5 = list6.size();
/* 1128 */                      if (size5 == 0) {
/* 1130 */                          iI00000oOI8 = 0;
                                } else {
/* 1139 */                          iI00000oOI8 = i11I0o0ii.I00000oOI(i10 << 3) * size5;
/* 1141 */                          for (int i19 = 0; i19 < size5; i19++) {
/* 1149 */                              int iI00000oIO4 = ((i1111ll) list6.get(i19)).I00000oIO(i11lo1VarI001lIiIIo1O3);
/* 1153 */                              iI00000oOI8 = OooioIOo1.I0000oI00(iI00000oIO4, iI00000oIO4, iI00000oOI8);
                                    }
                                }
/* 535 */                       iI0000oI003 += iI00000oOI8;
/* 536 */                       i7 = i5;
                                break;
                            case PoseLandmark.RIGHT_ANKLE:
/* 1061 */                      i5 = i7;
/* 1067 */                      List list7 = (List) unsafe.getObject(i1111llVar2, j);
/* 1069 */                      loIOiIO1O1 loioiio1o18 = i11o00oiil.I00000oIO;
/* 1071 */                      int size6 = list7.size();
/* 1075 */                      if (size6 != 0) {
/* 1085 */                          iI00000oOI7 = i11I0o0ii.I00000oOI(i10 << 3) * size6;
/* 1091 */                          for (int i20 = 0; i20 < list7.size(); i20++) {
/* 1099 */                              int iI0000oI006 = ((i11I0IiII0Ol) list7.get(i20)).I0000oI00();
/* 1103 */                              iI00000oOI7 = OooioIOo1.I0000oI00(iI0000oI006, iI0000oI006, iI00000oOI7);
                                    }
                                }
/* 946 */                       iI0000oI003 += iI00000oOI7;
/* 536 */                       i7 = i5;
                                break;
                            case PoseLandmark.LEFT_HEEL:
/* 1033 */                      i5 = i7;
/* 1039 */                      List list8 = (List) unsafe.getObject(i1111llVar2, j);
/* 1041 */                      loIOiIO1O1 loioiio1o19 = i11o00oiil.I00000oIO;
/* 1043 */                      size = list8.size();
/* 1047 */                      if (size != 0) {
/* 1052 */                          iI000o00OoI0I = i11o00oiil.I000lI(list8);
/* 1056 */                          iI00000oOI5 = i11I0o0ii.I00000oOI(i10 << 3);
/* 945 */                           iI00000oOI7 = (iI00000oOI5 * size) + iI000o00OoI0I;
/* 946 */                           iI0000oI003 += iI00000oOI7;
/* 536 */                           i7 = i5;
                                    break;
                                }
/* 932 */                       iI00000oOI7 = 0;
/* 946 */                       iI0000oI003 += iI00000oOI7;
/* 536 */                       i7 = i5;
                            case 30:
/* 1005 */                      i5 = i7;
/* 1011 */                      List list9 = (List) unsafe.getObject(i1111llVar2, j);
/* 1013 */                      loIOiIO1O1 loioiio1o110 = i11o00oiil.I00000oIO;
/* 1015 */                      size = list9.size();
/* 1019 */                      if (size != 0) {
/* 1024 */                          iI000o00OoI0I = i11o00oiil.I0001Ioi1lo(list9);
/* 1028 */                          iI00000oOI5 = i11I0o0ii.I00000oOI(i10 << 3);
/* 945 */                           iI00000oOI7 = (iI00000oOI5 * size) + iI000o00OoI0I;
/* 946 */                           iI0000oI003 += iI00000oOI7;
/* 536 */                           i7 = i5;
                                    break;
                                }
/* 932 */                       iI00000oOI7 = 0;
/* 946 */                       iI0000oI003 += iI00000oOI7;
/* 536 */                       i7 = i5;
                            case PoseLandmark.LEFT_FOOT_INDEX:
/* 992 */                       i5 = i7;
/* 1000 */                      iI000O01llI0 = i11o00oiil.I000II(i10, (List) unsafe.getObject(i1111llVar2, j));
/* 989 */                       iI0000oI003 += iI000O01llI0;
/* 536 */                       i7 = i5;
                                break;
                            case 32:
/* 977 */                       i5 = i7;
/* 985 */                       iI000O01llI0 = i11o00oiil.I000O01llI0(i10, (List) unsafe.getObject(i1111llVar2, j));
/* 989 */                       iI0000oI003 += iI000O01llI0;
/* 536 */                       i7 = i5;
                                break;
                            case 33:
/* 949 */                       i5 = i7;
/* 955 */                       List list10 = (List) unsafe.getObject(i1111llVar2, j);
/* 957 */                       loIOiIO1O1 loioiio1o111 = i11o00oiil.I00000oIO;
/* 959 */                       size = list10.size();
/* 963 */                       if (size != 0) {
/* 968 */                           iI000o00OoI0I = i11o00oiil.I000iOII(list10);
/* 972 */                           iI00000oOI5 = i11I0o0ii.I00000oOI(i10 << 3);
/* 945 */                           iI00000oOI7 = (iI00000oOI5 * size) + iI000o00OoI0I;
/* 946 */                           iI0000oI003 += iI00000oOI7;
/* 536 */                           i7 = i5;
                                    break;
                                }
/* 932 */                       iI00000oOI7 = 0;
/* 946 */                       iI0000oI003 += iI00000oOI7;
/* 536 */                       i7 = i5;
                            case 34:
/* 916 */                       i5 = i7;
/* 922 */                       List list11 = (List) unsafe.getObject(i1111llVar2, j);
/* 924 */                       loIOiIO1O1 loioiio1o112 = i11o00oiil.I00000oIO;
/* 926 */                       size = list11.size();
/* 930 */                       if (size != 0) {
/* 936 */                           iI000o00OoI0I = i11o00oiil.I000l1(list11);
/* 940 */                           iI00000oOI5 = i11I0o0ii.I00000oOI(i10 << 3);
/* 945 */                           iI00000oOI7 = (iI00000oOI5 * size) + iI000o00OoI0I;
/* 946 */                           iI0000oI003 += iI00000oOI7;
/* 536 */                           i7 = i5;
                                    break;
                                }
/* 932 */                       iI00000oOI7 = 0;
/* 946 */                       iI0000oI003 += iI00000oOI7;
/* 536 */                       i7 = i5;
                            case InputImage.IMAGE_FORMAT_YUV_420_888:
/* 891 */                       i5 = i7;
/* 897 */                       List list12 = (List) unsafe.getObject(i1111llVar2, j);
/* 899 */                       loIOiIO1O1 loioiio1o113 = i11o00oiil.I00000oIO;
/* 905 */                       size2 = list12.size() * 8;
/* 906 */                       if (size2 > 0) {
/* 910 */                           iI00000oOI9 = i11I0o0ii.I00000oOI(i10 << 3);
/* 610 */                           iI0000oI003 = OooioIOo1.I0001Ioi1lo(size2, iI00000oOI9, size2, iI0000oI003);
                                }
/* 536 */                       i7 = i5;
                                break;
                            case 36:
/* 866 */                       i5 = i7;
/* 872 */                       List list13 = (List) unsafe.getObject(i1111llVar2, j);
/* 874 */                       loIOiIO1O1 loioiio1o114 = i11o00oiil.I00000oIO;
/* 880 */                       size2 = list13.size() * 4;
/* 881 */                       if (size2 > 0) {
/* 885 */                           iI00000oOI9 = i11I0o0ii.I00000oOI(i10 << 3);
/* 610 */                           iI0000oI003 = OooioIOo1.I0001Ioi1lo(size2, iI00000oOI9, size2, iI0000oI003);
                                }
/* 536 */                       i7 = i5;
                                break;
                            case 37:
/* 844 */                       i5 = i7;
/* 852 */                       size2 = i11o00oiil.I000OiO((List) unsafe.getObject(i1111llVar2, j));
/* 856 */                       if (size2 > 0) {
/* 860 */                           iI00000oOI9 = i11I0o0ii.I00000oOI(i10 << 3);
/* 610 */                           iI0000oI003 = OooioIOo1.I0001Ioi1lo(size2, iI00000oOI9, size2, iI0000oI003);
                                }
/* 536 */                       i7 = i5;
                                break;
                            case 38:
/* 822 */                       i5 = i7;
/* 830 */                       size2 = i11o00oiil.I000o00OoI0I((List) unsafe.getObject(i1111llVar2, j));
/* 834 */                       if (size2 > 0) {
/* 838 */                           iI00000oOI9 = i11I0o0ii.I00000oOI(i10 << 3);
/* 610 */                           iI0000oI003 = OooioIOo1.I0001Ioi1lo(size2, iI00000oOI9, size2, iI0000oI003);
                                }
/* 536 */                       i7 = i5;
                                break;
                            case 39:
/* 800 */                       i5 = i7;
/* 808 */                       size2 = i11o00oiil.I000OOo1O((List) unsafe.getObject(i1111llVar2, j));
/* 812 */                       if (size2 > 0) {
/* 816 */                           iI00000oOI9 = i11I0o0ii.I00000oOI(i10 << 3);
/* 610 */                           iI0000oI003 = OooioIOo1.I0001Ioi1lo(size2, iI00000oOI9, size2, iI0000oI003);
                                }
/* 536 */                       i7 = i5;
                                break;
                            case 40:
/* 775 */                       i5 = i7;
/* 781 */                       List list14 = (List) unsafe.getObject(i1111llVar2, j);
/* 783 */                       loIOiIO1O1 loioiio1o115 = i11o00oiil.I00000oIO;
/* 789 */                       size2 = list14.size() * 8;
/* 790 */                       if (size2 > 0) {
/* 794 */                           iI00000oOI9 = i11I0o0ii.I00000oOI(i10 << 3);
/* 610 */                           iI0000oI003 = OooioIOo1.I0001Ioi1lo(size2, iI00000oOI9, size2, iI0000oI003);
                                }
/* 536 */                       i7 = i5;
                                break;
                            case 41:
/* 750 */                       i5 = i7;
/* 756 */                       List list15 = (List) unsafe.getObject(i1111llVar2, j);
/* 758 */                       loIOiIO1O1 loioiio1o116 = i11o00oiil.I00000oIO;
/* 764 */                       size2 = list15.size() * 4;
/* 765 */                       if (size2 > 0) {
/* 769 */                           iI00000oOI9 = i11I0o0ii.I00000oOI(i10 << 3);
/* 610 */                           iI0000oI003 = OooioIOo1.I0001Ioi1lo(size2, iI00000oOI9, size2, iI0000oI003);
                                }
/* 536 */                       i7 = i5;
                                break;
                            case 42:
/* 726 */                       i5 = i7;
/* 732 */                       List list16 = (List) unsafe.getObject(i1111llVar2, j);
/* 734 */                       loIOiIO1O1 loioiio1o117 = i11o00oiil.I00000oIO;
/* 736 */                       size2 = list16.size();
/* 740 */                       if (size2 > 0) {
/* 744 */                           iI00000oOI9 = i11I0o0ii.I00000oOI(i10 << 3);
/* 610 */                           iI0000oI003 = OooioIOo1.I0001Ioi1lo(size2, iI00000oOI9, size2, iI0000oI003);
                                }
/* 536 */                       i7 = i5;
                                break;
                            case 43:
/* 705 */                       i5 = i7;
/* 713 */                       size2 = i11o00oiil.I000lI((List) unsafe.getObject(i1111llVar2, j));
/* 717 */                       if (size2 > 0) {
/* 721 */                           iI00000oOI9 = i11I0o0ii.I00000oOI(i10 << 3);
/* 610 */                           iI0000oI003 = OooioIOo1.I0001Ioi1lo(size2, iI00000oOI9, size2, iI0000oI003);
                                }
/* 536 */                       i7 = i5;
                                break;
                            case 44:
/* 684 */                       i5 = i7;
/* 692 */                       size2 = i11o00oiil.I0001Ioi1lo((List) unsafe.getObject(i1111llVar2, j));
/* 696 */                       if (size2 > 0) {
/* 700 */                           iI00000oOI9 = i11I0o0ii.I00000oOI(i10 << 3);
/* 610 */                           iI0000oI003 = OooioIOo1.I0001Ioi1lo(size2, iI00000oOI9, size2, iI0000oI003);
                                }
/* 536 */                       i7 = i5;
                                break;
                            case BuildConfig.VERSION_CODE:
/* 660 */                       i5 = i7;
/* 666 */                       List list17 = (List) unsafe.getObject(i1111llVar2, j);
/* 668 */                       loIOiIO1O1 loioiio1o118 = i11o00oiil.I00000oIO;
/* 674 */                       size2 = list17.size() * 4;
/* 675 */                       if (size2 > 0) {
/* 679 */                           iI00000oOI9 = i11I0o0ii.I00000oOI(i10 << 3);
/* 610 */                           iI0000oI003 = OooioIOo1.I0001Ioi1lo(size2, iI00000oOI9, size2, iI0000oI003);
                                }
/* 536 */                       i7 = i5;
                                break;
                            case 46:
/* 636 */                       i5 = i7;
/* 642 */                       List list18 = (List) unsafe.getObject(i1111llVar2, j);
/* 644 */                       loIOiIO1O1 loioiio1o119 = i11o00oiil.I00000oIO;
/* 650 */                       size2 = list18.size() * 8;
/* 651 */                       if (size2 > 0) {
/* 655 */                           iI00000oOI9 = i11I0o0ii.I00000oOI(i10 << 3);
/* 610 */                           iI0000oI003 = OooioIOo1.I0001Ioi1lo(size2, iI00000oOI9, size2, iI0000oI003);
                                }
/* 536 */                       i7 = i5;
                                break;
                            case 47:
/* 615 */                       i5 = i7;
/* 623 */                       size2 = i11o00oiil.I000iOII((List) unsafe.getObject(i1111llVar2, j));
/* 627 */                       if (size2 > 0) {
/* 631 */                           iI00000oOI9 = i11I0o0ii.I00000oOI(i10 << 3);
/* 610 */                           iI0000oI003 = OooioIOo1.I0001Ioi1lo(size2, iI00000oOI9, size2, iI0000oI003);
                                }
/* 536 */                       i7 = i5;
                                break;
                            case 48:
/* 590 */                       i5 = i7;
/* 598 */                       size2 = i11o00oiil.I000l1((List) unsafe.getObject(i1111llVar2, j));
/* 602 */                       if (size2 > 0) {
/* 606 */                           iI00000oOI9 = i11I0o0ii.I00000oOI(i10 << 3);
/* 610 */                           iI0000oI003 = OooioIOo1.I0001Ioi1lo(size2, iI00000oOI9, size2, iI0000oI003);
                                }
/* 536 */                       i7 = i5;
                                break;
                            case 49:
/* 540 */                       i5 = i7;
/* 546 */                       List list19 = (List) unsafe.getObject(i1111llVar2, j);
/* 548 */                       i11lo1 i11lo1VarI001lIiIIo1O4 = i11loo.I001lIiIIo1O(i8);
/* 552 */                       loIOiIO1O1 loioiio1o120 = i11o00oiil.I00000oIO;
/* 554 */                       int size7 = list19.size();
/* 558 */                       if (size7 == 0) {
/* 560 */                           iI00000oIO3 = 0;
                                } else {
/* 563 */                           iI00000oIO3 = 0;
/* 564 */                           for (int i21 = 0; i21 < size7; i21++) {
/* 570 */                               i1111ll i1111llVar4 = (i1111ll) list19.get(i21);
/* 574 */                               int iI00000oOI14 = i11I0o0ii.I00000oOI(i10 << 3);
/* 584 */                               iI00000oIO3 += i1111llVar4.I00000oIO(i11lo1VarI001lIiIIo1O4) + iI00000oOI14 + iI00000oOI14;
                                    }
                                }
/* 588 */                       iI0000oI003 += iI00000oIO3;
/* 536 */                       i7 = i5;
                                break;
                            case 50:
/* 444 */                       Object object3 = unsafe.getObject(i1111llVar2, j);
/* 448 */                       int i22 = i8 / 3;
/* 455 */                       i11l1l0IiI i11l1l0iii = (i11l1l0IiI) object3;
/* 457 */                       i11l1l0 i11l1l0Var = (i11l1l0) i11loo.I00000oOI[i22 + i22];
/* 463 */                       if (i11l1l0iii.isEmpty()) {
/* 465 */                           iI00000oOI8 = 0;
                                } else {
/* 477 */                           iI00000oOI8 = 0;
/* 482 */                           for (Map.Entry entry : i11l1l0iii.entrySet()) {
/* 490 */                               Object key = entry.getKey();
/* 494 */                               Object value = entry.getValue();
/* 498 */                               iOliil ioliil = i11l1l0Var.I00000oIO;
/* 502 */                               int iI00000oOI15 = i11I0o0ii.I00000oOI(i10 << 3);
/* 514 */                               int i23 = i7;
/* 526 */                               int iI00000oIO5 = i11Ii1iI0.I00000oIO((i11oIoi1) ioliil.I00iio, 2, value) + i11Ii1iI0.I00000oIO((i11oIoi1) ioliil.I00iiI, 1, key);
/* 527 */                               iI00000oOI8 = OooioIOo1.I0001Ioi1lo(iI00000oIO5, iI00000oIO5, iI00000oOI15, iI00000oOI8);
/* 531 */                               i7 = i23;
                                    }
                                }
/* 466 */                       i5 = i7;
/* 535 */                       iI0000oI003 += iI00000oOI8;
/* 536 */                       i7 = i5;
                                break;
                            case 51:
/* 440 */                       if (i11loo.I00100o1O0lo(i1111llVar2, i10, i8)) {
/* 176 */                           iI0000oI003 = OooioIOo1.I0000oI00(i10 << 3, 8, iI0000oI003);
                                    break;
                                } else {
                                    break;
                                }
                            case 52:
/* 432 */                       if (!i11loo.I00100o1O0lo(i1111llVar2, i10, i8)) {
                                    break;
                                }
/* 188 */                       iI001IIilI0O = i10 << 3;
/* 162 */                       iI0000oI003 = OooioIOo1.I0000oI00(iI001IIilI0O, iI00000oOI12, iI0000oI003);
                                break;
                            case 53:
/* 410 */                       if (i11loo.I00100o1O0lo(i1111llVar2, i10, i8)) {
/* 414 */                           long jI001iOo1i0O = I001iOo1i0O(j, i1111llVar2);
/* 418 */                           iI00000oOI10 = i11I0o0ii.I00000oOI(i10 << 3);
/* 422 */                           iI0000Il00O2 = i11I0o0ii.I0000Il00O(jI001iOo1i0O);
/* 138 */                           iI0000oI003 += iI0000Il00O2 + iI00000oOI10;
                                    break;
                                } else {
                                    break;
                                }
                            case 54:
/* 388 */                       if (i11loo.I00100o1O0lo(i1111llVar2, i10, i8)) {
/* 392 */                           long jI001iOo1i0O2 = I001iOo1i0O(j, i1111llVar2);
/* 396 */                           iI00000oOI10 = i11I0o0ii.I00000oOI(i10 << 3);
/* 400 */                           iI0000Il00O2 = i11I0o0ii.I0000Il00O(jI001iOo1i0O2);
/* 138 */                           iI0000oI003 += iI0000Il00O2 + iI00000oOI10;
                                    break;
                                } else {
                                    break;
                                }
                            case 55:
/* 365 */                       if (i11loo.I00100o1O0lo(i1111llVar2, i10, i8)) {
/* 369 */                           long jI001IIilI0O = I001IIilI0O(j, i1111llVar2);
/* 374 */                           iI00000oOI10 = i11I0o0ii.I00000oOI(i10 << 3);
/* 378 */                           iI0000Il00O2 = i11I0o0ii.I0000Il00O(jI001IIilI0O);
/* 138 */                           iI0000oI003 += iI0000Il00O2 + iI00000oOI10;
                                    break;
                                } else {
                                    break;
                                }
                            case 56:
/* 357 */                       if (!i11loo.I00100o1O0lo(i1111llVar2, i10, i8)) {
                                    break;
                                }
                                break;
                            case 57:
/* 349 */                       if (!i11loo.I00100o1O0lo(i1111llVar2, i10, i8)) {
                                    break;
                                }
/* 188 */                       iI001IIilI0O = i10 << 3;
/* 162 */                       iI0000oI003 = OooioIOo1.I0000oI00(iI001IIilI0O, iI00000oOI12, iI0000oI003);
                                break;
                            case 58:
/* 335 */                       if (i11loo.I00100o1O0lo(i1111llVar2, i10, i8)) {
/* 339 */                           iI0000oI003 = OooioIOo1.I0000oI00(i10 << 3, 1, iI0000oI003);
                                    break;
                                } else {
                                    break;
                                }
                            case 59:
/* 296 */                       if (i11loo.I00100o1O0lo(i1111llVar2, i10, i8)) {
/* 298 */                           int i24 = i10 << 3;
/* 300 */                           Object object4 = unsafe.getObject(i1111llVar2, j);
/* 306 */                           if (object4 instanceof i11I0IiII0Ol) {
/* 310 */                               iI00000oOI11 = i11I0o0ii.I00000oOI(i24);
/* 314 */                               iI0000oI002 = ((i11I0IiII0Ol) object4).I0000oI00();
/* 252 */                               iI0000oI003 = OooioIOo1.I0001Ioi1lo(iI0000oI002, iI0000oI002, iI00000oOI11, iI0000oI003);
                                        break;
                                    } else {
/* 321 */                               iI00000oOI10 = i11I0o0ii.I00000oOI(i24);
/* 325 */                               iI0000Il00O2 = i11I0o0ii.I00000oIO((String) object4);
/* 138 */                               iI0000oI003 += iI0000Il00O2 + iI00000oOI10;
                                        break;
                                    }
                                } else {
                                    break;
                                }
                            case 60:
/* 262 */                       if (i11loo.I00100o1O0lo(i1111llVar2, i10, i8)) {
/* 264 */                           Object object5 = unsafe.getObject(i1111llVar2, j);
/* 268 */                           i11lo1 i11lo1VarI001lIiIIo1O5 = i11loo.I001lIiIIo1O(i8);
/* 272 */                           loIOiIO1O1 loioiio1o121 = i11o00oiil.I00000oIO;
/* 278 */                           iI00000oOI3 = i11I0o0ii.I00000oOI(i10 << 3);
/* 282 */                           iI00000oIO = ((i1111ll) object5).I00000oIO(i11lo1VarI001lIiIIo1O5);
/* 286 */                           iI0000oI003 = OooioIOo1.I0001Ioi1lo(iI00000oIO, iI00000oIO, iI00000oOI3, iI0000oI003);
                                    break;
                                } else {
                                    break;
                                }
                            case 61:
/* 234 */                       if (i11loo.I00100o1O0lo(i1111llVar2, i10, i8)) {
/* 242 */                           i11I0IiII0Ol i11i0iiii0ol2 = (i11I0IiII0Ol) unsafe.getObject(i1111llVar2, j);
/* 244 */                           iI00000oOI11 = i11I0o0ii.I00000oOI(i10 << 3);
/* 248 */                           iI0000oI002 = i11i0iiii0ol2.I0000oI00();
/* 252 */                           iI0000oI003 = OooioIOo1.I0001Ioi1lo(iI0000oI002, iI0000oI002, iI00000oOI11, iI0000oI003);
                                    break;
                                } else {
                                    break;
                                }
                            case 62:
/* 217 */                       if (i11loo.I00100o1O0lo(i1111llVar2, i10, i8)) {
/* 221 */                           iI001IIilI0O = I001IIilI0O(j, i1111llVar2);
/* 225 */                           iI00000oOI12 = i11I0o0ii.I00000oOI(i10 << 3);
/* 162 */                           iI0000oI003 = OooioIOo1.I0000oI00(iI001IIilI0O, iI00000oOI12, iI0000oI003);
                                    break;
                                } else {
                                    break;
                                }
                            case 63:
/* 195 */                       if (i11loo.I00100o1O0lo(i1111llVar2, i10, i8)) {
/* 199 */                           long jI001IIilI0O2 = I001IIilI0O(j, i1111llVar2);
/* 204 */                           iI00000oOI10 = i11I0o0ii.I00000oOI(i10 << 3);
/* 208 */                           iI0000Il00O2 = i11I0o0ii.I0000Il00O(jI001IIilI0O2);
/* 138 */                           iI0000oI003 += iI0000Il00O2 + iI00000oOI10;
                                    break;
                                } else {
                                    break;
                                }
                            case Barcode.FORMAT_EAN_8:
/* 186 */                       if (!i11loo.I00100o1O0lo(i1111llVar2, i10, i8)) {
                                    break;
                                }
/* 188 */                       iI001IIilI0O = i10 << 3;
/* 162 */                       iI0000oI003 = OooioIOo1.I0000oI00(iI001IIilI0O, iI00000oOI12, iI0000oI003);
                                break;
                            case 65:
/* 172 */                       if (!i11loo.I00100o1O0lo(i1111llVar2, i10, i8)) {
                                    break;
                                }
                                break;
                            case 66:
/* 145 */                       if (i11loo.I00100o1O0lo(i1111llVar2, i10, i8)) {
/* 149 */                           int iI001IIilI0O2 = I001IIilI0O(j, i1111llVar2);
/* 157 */                           iI00000oOI12 = i11I0o0ii.I00000oOI(i10 << 3);
/* 161 */                           iI001IIilI0O = (iI001IIilI0O2 >> 31) ^ (iI001IIilI0O2 + iI001IIilI0O2);
/* 162 */                           iI0000oI003 = OooioIOo1.I0000oI00(iI001IIilI0O, iI00000oOI12, iI0000oI003);
                                    break;
                                } else {
                                    break;
                                }
                            case 67:
/* 116 */                       if (i11loo.I00100o1O0lo(i1111llVar2, i10, i8)) {
/* 120 */                           long jI001iOo1i0O3 = I001iOo1i0O(j, i1111llVar2);
/* 128 */                           iI00000oOI10 = i11I0o0ii.I00000oOI(i10 << 3);
/* 133 */                           iI0000Il00O2 = i11I0o0ii.I0000Il00O((jI001iOo1i0O3 >> 63) ^ (jI001iOo1i0O3 + jI001iOo1i0O3));
/* 138 */                           iI0000oI003 += iI0000Il00O2 + iI00000oOI10;
                                    break;
                                } else {
                                    break;
                                }
                            case 68:
/* 85 */                        if (i11loo.I00100o1O0lo(i1111llVar2, i10, i8)) {
/* 91 */                            i1111ll i1111llVar5 = (i1111ll) unsafe.getObject(i1111llVar2, j);
/* 93 */                            i11lo1 i11lo1VarI001lIiIIo1O6 = i11loo.I001lIiIIo1O(i8);
/* 99 */                            int iI00000oOI16 = i11I0o0ii.I00000oOI(i10 << 3);
/* 103 */                           i4 = iI00000oOI16 + iI00000oOI16;
/* 104 */                           iI00000oIO2 = i1111llVar5.I00000oIO(i11lo1VarI001lIiIIo1O6);
/* 109 */                           iI0000oI003 += iI00000oIO2 + i4;
                                    break;
                                } else {
                                    break;
                                }
                        }
/* 1826 */              i8 += 3;
/* 1828 */              i1111llVar2 = i1111llVar;
/* 1830 */              i6 = 1048575;
                    }
/* 1845 */          int iI00000oIO6 = ((i11O1oIl) i1111llVar).zbc.I00000oIO() + iI0000oI003;
/* 1848 */          if (i11loo.I0001Ioi1lo) {
/* 1856 */              i11o10OIl i11o10oil = ((i11O011) i1111llVar).zbb.I00000oIO;
/* 1861 */              if (i11o10oil.I00iiI > 0) {
/* 1903 */                  throw null;
                        }
/* 1867 */              Iterator it = i11o10oil.I00000oIO().iterator();
/* 1875 */              if (it.hasNext()) {
/* 1882 */                  Map.Entry entry2 = (Map.Entry) it.next();
/* 1890 */                  entry2.getValue();
/* 1893 */                  throw null;
                        }
                    }
/* 1904 */          return iI00000oIO6;
                }

                @Override
                public final Object I000OOo1O() {
/* 11 */            return (i11O1oIl) ((i11O1oIl) this.I0000oI00).I000OOo1O(4, null);
                }

                public final void I000OiO(int i, Object obj, Object obj2) {
/* 5 */             if (I000o00OoI0I(i, obj2)) {
/* 15 */                long jI001i1lo1io = I001i1lo1io(i) & 1048575;
/* 17 */                Unsafe unsafe = I000lI;
/* 19 */                Object object = unsafe.getObject(obj2, jI001i1lo1io);
/* 23 */                if (object == null) {
/* 100 */                   I000II.I001IO000(IlIi0I0.I000OiO(this.I00000oIO[i], "Source subfield ", " is present but null: ", obj2.toString()));
/* 408 */                   return;
                        }
/* 25 */                i11lo1 i11lo1VarI001lIiIIo1O = I001lIiIIo1O(i);
/* 33 */                if (!I000o00OoI0I(i, obj)) {
/* 39 */                    if (I00100l0(object)) {
/* 45 */                        Object objI000OOo1O = i11lo1VarI001lIiIIo1O.I000OOo1O();
/* 49 */                        i11lo1VarI001lIiIIo1O.I0000O(objI000OOo1O, object);
/* 52 */                        unsafe.putObject(obj, jI001i1lo1io, objI000OOo1O);
                            } else {
/* 41 */                        unsafe.putObject(obj, jI001i1lo1io, object);
                            }
/* 55 */                    I000l1(i, obj);
/* 58 */                    return;
                        }
/* 59 */                Object object2 = unsafe.getObject(obj, jI001i1lo1io);
/* 67 */                if (!I00100l0(object2)) {
/* 69 */                    Object objI000OOo1O2 = i11lo1VarI001lIiIIo1O.I000OOo1O();
/* 73 */                    i11lo1VarI001lIiIIo1O.I0000O(objI000OOo1O2, object2);
/* 76 */                    unsafe.putObject(obj, jI001i1lo1io, objI000OOo1O2);
/* 79 */                    object2 = objI000OOo1O2;
                        }
/* 80 */                i11lo1VarI001lIiIIo1O.I0000O(object2, object);
                    }
                }

                public final void I000iOII(int i, Object obj, Object obj2) {
/* 1 */             int[] iArr = this.I00000oIO;
/* 3 */             int i2 = iArr[i];
/* 9 */             if (I00100o1O0lo(obj2, i2, i)) {
/* 19 */                long jI001i1lo1io = I001i1lo1io(i) & 1048575;
/* 21 */                Unsafe unsafe = I000lI;
/* 23 */                Object object = unsafe.getObject(obj2, jI001i1lo1io);
/* 27 */                if (object == null) {
/* 108 */                   I000II.I001IO000(IlIi0I0.I000OiO(iArr[i], "Source subfield ", " is present but null: ", obj2.toString()));
/* 408 */                   return;
                        }
/* 29 */                i11lo1 i11lo1VarI001lIiIIo1O = I001lIiIIo1O(i);
/* 37 */                if (!I00100o1O0lo(obj, i2, i)) {
/* 43 */                    if (I00100l0(object)) {
/* 49 */                        Object objI000OOo1O = i11lo1VarI001lIiIIo1O.I000OOo1O();
/* 53 */                        i11lo1VarI001lIiIIo1O.I0000O(objI000OOo1O, object);
/* 56 */                        unsafe.putObject(obj, jI001i1lo1io, objI000OOo1O);
                            } else {
/* 45 */                        unsafe.putObject(obj, jI001i1lo1io, object);
                            }
/* 65 */                    i11oI1O.I000O01llI0(obj, i2, iArr[i + 2] & 1048575);
/* 68 */                    return;
                        }
/* 69 */                Object object2 = unsafe.getObject(obj, jI001i1lo1io);
/* 77 */                if (!I00100l0(object2)) {
/* 79 */                    Object objI000OOo1O2 = i11lo1VarI001lIiIIo1O.I000OOo1O();
/* 83 */                    i11lo1VarI001lIiIIo1O.I0000O(objI000OOo1O2, object2);
/* 86 */                    unsafe.putObject(obj, jI001i1lo1io, objI000OOo1O2);
/* 89 */                    object2 = objI000OOo1O2;
                        }
/* 90 */                i11lo1VarI001lIiIIo1O.I0000O(object2, object);
                    }
                }

                public final void I000l1(int i, Object obj) {
/* 5 */             int i2 = this.I00000oIO[i + 2];
/* 10 */            long j = 1048575 & i2;
/* 17 */            if (j == 1048575) {
/* 19 */                return;
                    }
/* 30 */            i11oI1O.I000O01llI0(obj, (1 << (i2 >>> 20)) | i11oI1O.I0000oI00(j, obj), j);
                }

                public final boolean I000lI(i11O1oIl i11o1oil, i11O1oIl i11o1oil2, int i) {
                    return I000o00OoI0I(i, i11o1oil) == I000o00OoI0I(i, i11o1oil2);
                }

                public final boolean I000o00OoI0I(int i, Object obj) {
/* 5 */             int i2 = this.I00000oIO[i + 2];
/* 10 */            long j = i2 & 1048575;
/* 20 */            if (j != 1048575) {
                        return ((1 << (i2 >>> 20)) & i11oI1O.I0000oI00(j, obj)) != 0;
                    }
/* 22 */            int iI001i1lo1io = I001i1lo1io(i);
/* 26 */            long j2 = iI001i1lo1io & 1048575;
                    switch (I001i1O0Ol(iI001i1lo1io)) {
                        case 0:
/* 232 */                   if (Double.doubleToRawLongBits(i11oI1O.I0000Il00O.I000iOII(j2, obj)) != 0) {
                            }
                            break;
                        case 1:
/* 217 */                   if (Float.floatToRawIntBits(i11oI1O.I0000Il00O.I000l1(j2, obj)) != 0) {
                            }
                            break;
                        case 2:
/* 204 */                   if (i11oI1O.I0001Ioi1lo(j2, obj) != 0) {
                            }
                            break;
                        case 3:
/* 195 */                   if (i11oI1O.I0001Ioi1lo(j2, obj) != 0) {
                            }
                            break;
                        case 4:
/* 186 */                   if (i11oI1O.I0000oI00(j2, obj) != 0) {
                            }
                            break;
                        case 5:
/* 179 */                   if (i11oI1O.I0001Ioi1lo(j2, obj) != 0) {
                            }
                            break;
                        case 6:
/* 170 */                   if (i11oI1O.I0000oI00(j2, obj) != 0) {
                            }
                            break;
                        case 7:
                            break;
                        case 8:
/* 124 */                   Object objI000II = i11oI1O.I000II(j2, obj);
/* 130 */                   if (!(objI000II instanceof String)) {
/* 144 */                       if (!(objI000II instanceof i11I0IiII0Ol)) {
/* 155 */                           OIiilo1Ool0o.I00100o1O0lo();
                                    break;
                                } else if (!i11I0IiII0Ol.I00iiI.equals(objI000II)) {
                                }
                            } else if (!((String) objI000II).isEmpty()) {
                            }
                            break;
                        case 9:
/* 120 */                   if (i11oI1O.I000II(j2, obj) != null) {
                            }
                            break;
                        case 10:
/* 112 */                   if (!i11I0IiII0Ol.I00iiI.equals(i11oI1O.I000II(j2, obj))) {
                            }
                            break;
                        case 11:
/* 98 */                    if (i11oI1O.I0000oI00(j2, obj) != 0) {
                            }
                            break;
                        case 12:
/* 90 */                    if (i11oI1O.I0000oI00(j2, obj) != 0) {
                            }
                            break;
                        case 13:
/* 82 */                    if (i11oI1O.I0000oI00(j2, obj) != 0) {
                            }
                            break;
                        case 14:
/* 74 */                    if (i11oI1O.I0001Ioi1lo(j2, obj) != 0) {
                            }
                            break;
                        case 15:
/* 64 */                    if (i11oI1O.I0000oI00(j2, obj) != 0) {
                            }
                            break;
                        case 16:
/* 56 */                    if (i11oI1O.I0001Ioi1lo(j2, obj) != 0) {
                            }
                            break;
                        case 17:
/* 46 */                    if (i11oI1O.I000II(j2, obj) != null) {
                            }
                            break;
                        default:
/* 38 */                    OIiilo1Ool0o.I00100o1O0lo();
                            break;
                    }
/* 18 */            return false;
                }

                public final boolean I000oI1ioi(Object obj, int i, int i2, int i3, int i4) {
                    return i2 == 1048575 ? I000o00OoI0I(i, obj) : (i3 & i4) != 0;
                }

                public final boolean I00100o1O0lo(Object obj, int i, int i2) {
                    return i11oI1O.I0000oI00((long) (this.I00000oIO[i2 + 2] & 1048575), obj) == i;
                }

                /*  JADX ERROR: Type inference failed
                    jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
                    	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                    	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                    	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
                    */
                public final int I0010o(java.lang.Object r43, byte[] r44, int r45, int r46, int r47, p000.i111i0I1 r48) throws p000.i11i01Oo {
                    /*  JADX ERROR: Method code generation error
                        java.lang.NullPointerException
                        */
                    /*  JADX ERROR: Type inference failed
                        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
                        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                        */
                    /*
                        Method dump skipped, instructions count: 4398
                        To view this dump change 'Code comments level' option to 'DEBUG'
                    */
                    throw new UnsupportedOperationException("Method not decompiled: p000.i11lOO.I0010o(java.lang.Object, byte[], int, int, int, i111i0I1):int");
                }

                public final int I001IO000(int i, int i2) {
/* 1 */             int[] iArr = this.I00000oIO;
                    int length = (iArr.length / 3) - 1;
/* 8 */             while (i2 <= length) {
/* 12 */                int i3 = (length + i2) >>> 1;
/* 14 */                int i4 = i3 * 3;
/* 16 */                int i5 = iArr[i4];
/* 18 */                if (i == i5) {
/* 20 */                    return i4;
                        }
/* 21 */                if (i < i5) {
                            length = i3 - 1;
                        } else {
/* 26 */                    i2 = i3 + 1;
                        }
                    }
/* 6 */             return -1;
                }

                public final int I001i1lo1io(int i) {
/* 5 */             return this.I00000oIO[i + 1];
                }

                public final i11OO1IIo I001l0I00(int i) {
/* 1 */             int i2 = i / 3;
/* 10 */            return (i11OO1IIo) this.I00000oOI[i2 + i2 + 1];
                }

                public final i11lo1 I001lIiIIo1O(int i) {
/* 1 */             Object[] objArr = this.I00000oOI;
/* 3 */             int i2 = i / 3;
/* 5 */             int i3 = i2 + i2;
/* 8 */             i11lo1 i11lo1Var = (i11lo1) objArr[i3];
/* 10 */            if (i11lo1Var != null) {
/* 12 */                return i11lo1Var;
                    }
/* 21 */            i11lo1 i11lo1VarI00000oIO = i11liii0.I0000Il00O.I00000oIO((Class) objArr[i3 + 1]);
/* 25 */            objArr[i3] = i11lo1VarI00000oIO;
/* 29 */            return i11lo1VarI00000oIO;
                }

                public final Object I001lllioOl(int i, Object obj) {
/* 1 */             i11lo1 i11lo1VarI001lIiIIo1O = I001lIiIIo1O(i);
/* 12 */            int iI001i1lo1io = I001i1lo1io(i) & 1048575;
/* 17 */            if (!I000o00OoI0I(i, obj)) {
/* 19 */                return i11lo1VarI001lIiIIo1O.I000OOo1O();
                    }
/* 27 */            Object object = I000lI.getObject(obj, iI001i1lo1io);
/* 35 */            if (I00100l0(object)) {
/* 37 */                return object;
                    }
/* 38 */            Object objI000OOo1O = i11lo1VarI001lIiIIo1O.I000OOo1O();
/* 42 */            if (object != null) {
/* 44 */                i11lo1VarI001lIiIIo1O.I0000O(objI000OOo1O, object);
                    }
/* 106 */           return objI000OOo1O;
                }

                public final Object I001lloI(Object obj, int i, int i2) {
/* 1 */             i11lo1 i11lo1VarI001lIiIIo1O = I001lIiIIo1O(i2);
/* 9 */             if (!I00100o1O0lo(obj, i, i2)) {
/* 11 */                return i11lo1VarI001lIiIIo1O.I000OOo1O();
                    }
/* 27 */            Object object = I000lI.getObject(obj, I001i1lo1io(i2) & 1048575);
/* 35 */            if (I00100l0(object)) {
/* 37 */                return object;
                    }
/* 38 */            Object objI000OOo1O = i11lo1VarI001lIiIIo1O.I000OOo1O();
/* 42 */            if (object != null) {
/* 44 */                i11lo1VarI001lIiIIo1O.I0000O(objI000OOo1O, object);
                    }
/* 98 */            return objI000OOo1O;
                }
            }

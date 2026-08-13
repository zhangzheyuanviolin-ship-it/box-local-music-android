            package p000;

            import com.google.ai.edge.gallery.BuildConfig;
            import com.google.mlkit.vision.barcode.common.Barcode;
            import com.google.mlkit.vision.common.InputImage;
            import com.google.mlkit.vision.pose.PoseLandmark;
            import java.lang.reflect.Field;
            import java.nio.charset.Charset;
            import java.security.AccessController;
            import java.util.Arrays;
            import java.util.List;
            import sun.misc.Unsafe;
            
            public final class i1lo1lloo01 implements i1o1Oo {
                public static final int[] I000OiO = new int[0];
                public static final Unsafe I000iOII;
                public int[] I00000oIO;
                public Object[] I00000oOI;
                public int I0000Il00O;
                public int I0000O;
                public i1O0oIO I0000oI00;
                public int[] I0001Ioi1lo;
                public int I000II;
                public int I000O01llI0;
                public loIOiIO1O1 I000OOo1O;

                static {
                    Unsafe unsafe;
                    try {
/* 16 */                unsafe = (Unsafe) AccessController.doPrivileged(new OoiioO0o(4));
                    } catch (Throwable unused) {
/* 19 */                unsafe = null;
                    }
/* 20 */            I000iOII = unsafe;
                }

                public static boolean I000II(Object obj) {
/* 1 */             if (obj == null) {
/* 3 */                 return false;
                    }
/* 7 */             if (obj instanceof i1ii0Io) {
/* 11 */                return ((i1ii0Io) obj).I000O01llI0();
                    }
/* 16 */            return true;
                }

                public static int I000OiO(i1ii0Io i1ii0io, long j) {
/* 7 */             return ((Integer) i1oo0I1oIiI.I0000Il00O(i1ii0io, j)).intValue();
                }

                public static int I000l1(int i) {
/* 3 */             return (i >>> 20) & 255;
                }

                public static Field I0010I0i(Class cls, String str) {
                    try {
/* 1 */                 return cls.getDeclaredField(str);
                    } catch (NoSuchFieldException e) {
/* 7 */                 Field[] declaredFields = cls.getDeclaredFields();
/* 13 */                for (Field field : declaredFields) {
/* 25 */                    if (str.equals(field.getName())) {
/* 27 */                        return field;
                            }
                        }
/* 33 */                String name = cls.getName();
/* 37 */                String string = Arrays.toString(declaredFields);
/* 47 */                StringBuilder sbI00111O = IIl001iO0Io.I00111O("Field ", str, " for ", name, " not found. Known fields are ");
/* 51 */                sbI00111O.append(string);
/* 106 */               throw new RuntimeException(sbI00111O.toString(), e);
                    }
                }

                @Override
                public final void I00000oIO(Object obj, Object obj2) {
                    Object obj3;
/* 1 */             int[] iArr = this.I00000oIO;
/* 7 */             if (!I000II(obj)) {
/* 513 */               I000II.I000iOII("Mutating immutable message: ".concat(String.valueOf(obj)));
/* 516 */               return;
                    }
/* 9 */             obj2.getClass();
/* 12 */            int i = 0;
/* 14 */            while (i < iArr.length) {
/* 16 */                int iI000lI = I000lI(i);
/* 23 */                int i2 = iI000lI & 1048575;
/* 25 */                int iI000l1 = I000l1(iI000lI);
/* 29 */                int i3 = iArr[i];
                        long j = i2;
                        switch (iI000l1) {
                            case 0:
/* 473 */                       obj3 = obj;
/* 478 */                       if (I0001Ioi1lo(i, obj2)) {
/* 480 */                           Ooil0oIOI0l0 ooil0oIOI0l0 = i1oo0I1oIiI.I0000Il00O;
/* 486 */                           ooil0oIOI0l0.I001lllioOl(obj3, j, ooil0oIOI0l0.I0010I0i(obj2, j));
/* 489 */                           I001IIilI0O(i, obj3);
                                    continue;
                                }
/* 492 */                       i += 3;
/* 494 */                       obj = obj3;
                            case 1:
/* 453 */                       obj3 = obj;
/* 458 */                       if (I0001Ioi1lo(i, obj2)) {
/* 460 */                           Ooil0oIOI0l0 ooil0oIOI0l02 = i1oo0I1oIiI.I0000Il00O;
/* 466 */                           ooil0oIOI0l02.I00IO1(obj3, j, ooil0oIOI0l02.I001IIilI0O(obj2, j));
/* 469 */                           I001IIilI0O(i, obj3);
                                } else {
                                    continue;
                                }
/* 492 */                       i += 3;
/* 494 */                       obj = obj3;
                            case 2:
/* 431 */                       obj3 = obj;
/* 436 */                       if (I0001Ioi1lo(i, obj2)) {
/* 446 */                           i1oo0I1oIiI.I0000Il00O.I00000oOI.putLong(obj3, j, i1oo0I1oIiI.I00000oOI(obj2, j));
/* 449 */                           I001IIilI0O(i, obj3);
                                } else {
                                    continue;
                                }
/* 492 */                       i += 3;
/* 494 */                       obj = obj3;
                            case 3:
/* 409 */                       obj3 = obj;
/* 414 */                       if (I0001Ioi1lo(i, obj2)) {
/* 424 */                           i1oo0I1oIiI.I0000Il00O.I00000oOI.putLong(obj3, j, i1oo0I1oIiI.I00000oOI(obj2, j));
/* 427 */                           I001IIilI0O(i, obj3);
                                } else {
                                    continue;
                                }
/* 492 */                       i += 3;
/* 494 */                       obj = obj3;
                            case 4:
/* 391 */                       obj3 = obj;
/* 396 */                       if (I0001Ioi1lo(i, obj2)) {
/* 402 */                           i1oo0I1oIiI.I0001Ioi1lo(obj3, i1oo0I1oIiI.I00000oIO(obj2, j), j);
/* 405 */                           I001IIilI0O(i, obj3);
                                } else {
                                    continue;
                                }
/* 492 */                       i += 3;
/* 494 */                       obj = obj3;
                            case 5:
/* 369 */                       obj3 = obj;
/* 374 */                       if (I0001Ioi1lo(i, obj2)) {
/* 384 */                           i1oo0I1oIiI.I0000Il00O.I00000oOI.putLong(obj3, j, i1oo0I1oIiI.I00000oOI(obj2, j));
/* 387 */                           I001IIilI0O(i, obj3);
                                } else {
                                    continue;
                                }
/* 492 */                       i += 3;
/* 494 */                       obj = obj3;
                            case 6:
/* 350 */                       obj3 = obj;
/* 355 */                       if (I0001Ioi1lo(i, obj2)) {
/* 361 */                           i1oo0I1oIiI.I0001Ioi1lo(obj3, i1oo0I1oIiI.I00000oIO(obj2, j), j);
/* 364 */                           I001IIilI0O(i, obj3);
                                } else {
                                    continue;
                                }
/* 492 */                       i += 3;
/* 494 */                       obj = obj3;
                            case 7:
/* 329 */                       obj3 = obj;
/* 334 */                       if (I0001Ioi1lo(i, obj2)) {
/* 336 */                           Ooil0oIOI0l0 ooil0oIOI0l03 = i1oo0I1oIiI.I0000Il00O;
/* 342 */                           ooil0oIOI0l03.I001iOo1i0O(obj3, j, ooil0oIOI0l03.I00IlilI0i0i(j, obj2));
/* 345 */                           I001IIilI0O(i, obj3);
                                } else {
                                    continue;
                                }
/* 492 */                       i += 3;
/* 494 */                       obj = obj3;
                            case 8:
/* 310 */                       obj3 = obj;
/* 315 */                       if (I0001Ioi1lo(i, obj2)) {
/* 321 */                           i1oo0I1oIiI.I000II(obj3, j, i1oo0I1oIiI.I0000Il00O(obj2, j));
/* 324 */                           I001IIilI0O(i, obj3);
                                } else {
                                    continue;
                                }
/* 492 */                       i += 3;
/* 494 */                       obj = obj3;
                            case 9:
/* 304 */                       obj3 = obj;
/* 305 */                       I0010o(i, obj3, obj2);
                                continue;
/* 492 */                       i += 3;
/* 494 */                       obj = obj3;
                            case 10:
/* 285 */                       obj3 = obj;
/* 290 */                       if (I0001Ioi1lo(i, obj2)) {
/* 296 */                           i1oo0I1oIiI.I000II(obj3, j, i1oo0I1oIiI.I0000Il00O(obj2, j));
/* 299 */                           I001IIilI0O(i, obj3);
                                } else {
                                    continue;
                                }
/* 492 */                       i += 3;
/* 494 */                       obj = obj3;
                            case 11:
/* 266 */                       obj3 = obj;
/* 271 */                       if (I0001Ioi1lo(i, obj2)) {
/* 277 */                           i1oo0I1oIiI.I0001Ioi1lo(obj3, i1oo0I1oIiI.I00000oIO(obj2, j), j);
/* 280 */                           I001IIilI0O(i, obj3);
                                } else {
                                    continue;
                                }
/* 492 */                       i += 3;
/* 494 */                       obj = obj3;
                            case 12:
/* 247 */                       obj3 = obj;
/* 252 */                       if (I0001Ioi1lo(i, obj2)) {
/* 258 */                           i1oo0I1oIiI.I0001Ioi1lo(obj3, i1oo0I1oIiI.I00000oIO(obj2, j), j);
/* 261 */                           I001IIilI0O(i, obj3);
                                } else {
                                    continue;
                                }
/* 492 */                       i += 3;
/* 494 */                       obj = obj3;
                            case 13:
/* 228 */                       obj3 = obj;
/* 233 */                       if (I0001Ioi1lo(i, obj2)) {
/* 239 */                           i1oo0I1oIiI.I0001Ioi1lo(obj3, i1oo0I1oIiI.I00000oIO(obj2, j), j);
/* 242 */                           I001IIilI0O(i, obj3);
                                } else {
                                    continue;
                                }
/* 492 */                       i += 3;
/* 494 */                       obj = obj3;
                            case 14:
/* 205 */                       obj3 = obj;
/* 210 */                       if (I0001Ioi1lo(i, obj2)) {
/* 220 */                           i1oo0I1oIiI.I0000Il00O.I00000oOI.putLong(obj3, j, i1oo0I1oIiI.I00000oOI(obj2, j));
/* 223 */                           I001IIilI0O(i, obj3);
                                } else {
                                    continue;
                                }
/* 492 */                       i += 3;
/* 494 */                       obj = obj3;
                            case 15:
/* 186 */                       obj3 = obj;
/* 191 */                       if (I0001Ioi1lo(i, obj2)) {
/* 197 */                           i1oo0I1oIiI.I0001Ioi1lo(obj3, i1oo0I1oIiI.I00000oIO(obj2, j), j);
/* 200 */                           I001IIilI0O(i, obj3);
                                } else {
                                    continue;
                                }
/* 492 */                       i += 3;
/* 494 */                       obj = obj3;
                            case 16:
/* 167 */                       if (I0001Ioi1lo(i, obj2)) {
/* 177 */                           obj3 = obj;
/* 178 */                           i1oo0I1oIiI.I0000Il00O.I00000oOI.putLong(obj3, j, i1oo0I1oIiI.I00000oOI(obj2, j));
/* 181 */                           I001IIilI0O(i, obj3);
                                }
/* 492 */                       i += 3;
/* 494 */                       obj = obj3;
                                break;
                            case 17:
/* 159 */                       I0010o(i, obj, obj2);
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
/* 114 */                       i1iliO0I i1ilio0iI00000oOI = (i1iliO0I) i1oo0I1oIiI.I0000Il00O(obj, j);
/* 120 */                       i1iliO0I i1ilio0i = (i1iliO0I) i1oo0I1oIiI.I0000Il00O(obj2, j);
/* 122 */                       int size = i1ilio0iI00000oOI.size();
/* 126 */                       int size2 = i1ilio0i.size();
/* 130 */                       if (size > 0 && size2 > 0) {
/* 139 */                           if (!((i1o10iIooI) i1ilio0iI00000oOI).I00iOIl) {
/* 144 */                               i1ilio0iI00000oOI = ((i1o10iIooI) i1ilio0iI00000oOI).I00000oOI(size2 + size);
                                    }
/* 148 */                           i1ilio0iI00000oOI.addAll(i1ilio0i);
                                }
/* 151 */                       if (size > 0) {
/* 154 */                           i1ilio0i = i1ilio0iI00000oOI;
                                }
/* 155 */                       i1oo0I1oIiI.I000II(obj, j, i1ilio0i);
                                break;
                            case 50:
/* 92 */                        loIOiIO1O1 loioiio1o1 = i1oI0oIO0.I00000oIO;
/* 106 */                       i1oo0I1oIiI.I000II(obj, j, liOiOli.I00000oIO(i1oo0I1oIiI.I0000Il00O(obj, j), i1oo0I1oIiI.I0000Il00O(obj2, j)));
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
/* 73 */                        if (I000O01llI0(obj2, i3, i)) {
/* 79 */                            i1oo0I1oIiI.I000II(obj, j, i1oo0I1oIiI.I0000Il00O(obj2, j));
/* 88 */                            i1oo0I1oIiI.I0001Ioi1lo(obj, i3, iArr[i + 2] & 1048575);
                                    break;
                                }
                                break;
                            case 60:
/* 65 */                        I00111O(i, obj, obj2);
                                break;
                            case 61:
                            case 62:
                            case 63:
                            case Barcode.FORMAT_EAN_8:
                            case 65:
                            case 66:
                            case 67:
/* 46 */                        if (I000O01llI0(obj2, i3, i)) {
/* 52 */                            i1oo0I1oIiI.I000II(obj, j, i1oo0I1oIiI.I0000Il00O(obj2, j));
/* 61 */                            i1oo0I1oIiI.I0001Ioi1lo(obj, i3, iArr[i + 2] & 1048575);
                                    break;
                                }
                                break;
                            case 68:
/* 38 */                        I00111O(i, obj, obj2);
                                break;
                        }
/* 35 */                obj3 = obj;
/* 492 */               i += 3;
/* 494 */               obj = obj3;
                    }
/* 498 */           i1oI0oIO0.I00000oIO(obj, obj2);
                }

                /* JADX WARN: Removed duplicated region for block: B:44:0x00e8 A[PHI: r1
                  0x00e8: PHI (r1v34 int) = (r1v10 int), (r1v35 int) binds: [B:85:0x0209, B:43:0x00e6] A[DONT_GENERATE, DONT_INLINE]] */
                @Override
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final int I00000oOI(i1ii0Io i1ii0io) {
                    int i;
                    long jDoubleToLongBits;
                    int i2;
                    int iFloatToIntBits;
                    int i3;
                    int i4;
/* 1 */             int i5 = 0;
/* 2 */             int i6 = 0;
                    while (true) {
/* 3 */                 int[] iArr = this.I00000oIO;
/* 6 */                 if (i5 >= iArr.length) {
/* 614 */                   return i1ii0io.zzc.hashCode() + (i6 * 53);
                        }
/* 8 */                 int iI000lI = I000lI(i5);
/* 15 */                int i7 = 1048575 & iI000lI;
/* 16 */                int iI000l1 = I000l1(iI000lI);
/* 20 */                int i8 = iArr[i5];
                        long j = i7;
/* 23 */                int i9 = 1237;
/* 27 */                int iHashCode = 37;
                        switch (iI000l1) {
                            case 0:
/* 586 */                       i = i6 * 53;
/* 594 */                       jDoubleToLongBits = Double.doubleToLongBits(i1oo0I1oIiI.I0000Il00O.I0010I0i(i1ii0io, j));
/* 598 */                       Charset charset = i1io0O.I00000oIO;
/* 80 */                        i6 = i + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                                break;
                            case 1:
/* 572 */                       i2 = i6 * 53;
/* 580 */                       iFloatToIntBits = Float.floatToIntBits(i1oo0I1oIiI.I0000Il00O.I001IIilI0O(i1ii0io, j));
/* 52 */                        i6 = iFloatToIntBits + i2;
                                break;
                            case 2:
/* 562 */                       i = i6 * 53;
/* 564 */                       jDoubleToLongBits = i1oo0I1oIiI.I00000oOI(i1ii0io, j);
/* 568 */                       Charset charset2 = i1io0O.I00000oIO;
/* 80 */                        i6 = i + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                                break;
                            case 3:
/* 552 */                       i = i6 * 53;
/* 554 */                       jDoubleToLongBits = i1oo0I1oIiI.I00000oOI(i1ii0io, j);
/* 558 */                       Charset charset3 = i1io0O.I00000oIO;
/* 80 */                        i6 = i + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                                break;
                            case 4:
/* 544 */                       i2 = i6 * 53;
/* 546 */                       iFloatToIntBits = i1oo0I1oIiI.I00000oIO(i1ii0io, j);
/* 52 */                        i6 = iFloatToIntBits + i2;
                                break;
                            case 5:
/* 534 */                       i = i6 * 53;
/* 536 */                       jDoubleToLongBits = i1oo0I1oIiI.I00000oOI(i1ii0io, j);
/* 540 */                       Charset charset4 = i1io0O.I00000oIO;
/* 80 */                        i6 = i + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                                break;
                            case 6:
/* 526 */                       i2 = i6 * 53;
/* 528 */                       iFloatToIntBits = i1oo0I1oIiI.I00000oIO(i1ii0io, j);
/* 52 */                        i6 = iFloatToIntBits + i2;
                                break;
                            case 7:
/* 512 */                       i3 = i6 * 53;
/* 516 */                       boolean zI00IlilI0i0i = i1oo0I1oIiI.I0000Il00O.I00IlilI0i0i(j, i1ii0io);
/* 520 */                       Charset charset5 = i1io0O.I00000oIO;
/* 522 */                       if (zI00IlilI0i0i) {
/* 233 */                           i9 = 1231;
                                }
/* 234 */                       i6 = i9 + i3;
                                break;
                            case 8:
/* 498 */                       i2 = i6 * 53;
/* 506 */                       iFloatToIntBits = ((String) i1oo0I1oIiI.I0000Il00O(i1ii0io, j)).hashCode();
/* 52 */                        i6 = iFloatToIntBits + i2;
                                break;
                            case 9:
/* 485 */                       i4 = i6 * 53;
/* 487 */                       Object objI0000Il00O = i1oo0I1oIiI.I0000Il00O(i1ii0io, j);
/* 491 */                       if (objI0000Il00O != null) {
/* 493 */                           iHashCode = objI0000Il00O.hashCode();
                                }
/* 418 */                       i6 = i4 + iHashCode;
                                break;
                            case 10:
/* 473 */                       i2 = i6 * 53;
/* 479 */                       iFloatToIntBits = i1oo0I1oIiI.I0000Il00O(i1ii0io, j).hashCode();
/* 52 */                        i6 = iFloatToIntBits + i2;
                                break;
                            case 11:
/* 465 */                       i2 = i6 * 53;
/* 467 */                       iFloatToIntBits = i1oo0I1oIiI.I00000oIO(i1ii0io, j);
/* 52 */                        i6 = iFloatToIntBits + i2;
                                break;
                            case 12:
/* 457 */                       i2 = i6 * 53;
/* 459 */                       iFloatToIntBits = i1oo0I1oIiI.I00000oIO(i1ii0io, j);
/* 52 */                        i6 = iFloatToIntBits + i2;
                                break;
                            case 13:
/* 449 */                       i2 = i6 * 53;
/* 451 */                       iFloatToIntBits = i1oo0I1oIiI.I00000oIO(i1ii0io, j);
/* 52 */                        i6 = iFloatToIntBits + i2;
                                break;
                            case 14:
/* 439 */                       i = i6 * 53;
/* 441 */                       jDoubleToLongBits = i1oo0I1oIiI.I00000oOI(i1ii0io, j);
/* 445 */                       Charset charset6 = i1io0O.I00000oIO;
/* 80 */                        i6 = i + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                                break;
                            case 15:
/* 431 */                       i2 = i6 * 53;
/* 433 */                       iFloatToIntBits = i1oo0I1oIiI.I00000oIO(i1ii0io, j);
/* 52 */                        i6 = iFloatToIntBits + i2;
                                break;
                            case 16:
/* 421 */                       i = i6 * 53;
/* 423 */                       jDoubleToLongBits = i1oo0I1oIiI.I00000oOI(i1ii0io, j);
/* 427 */                       Charset charset7 = i1io0O.I00000oIO;
/* 80 */                        i6 = i + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                                break;
                            case 17:
/* 406 */                       i4 = i6 * 53;
/* 408 */                       Object objI0000Il00O2 = i1oo0I1oIiI.I0000Il00O(i1ii0io, j);
/* 412 */                       if (objI0000Il00O2 != null) {
/* 414 */                           iHashCode = objI0000Il00O2.hashCode();
                                }
/* 418 */                       i6 = i4 + iHashCode;
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
/* 394 */                       i2 = i6 * 53;
/* 400 */                       iFloatToIntBits = i1oo0I1oIiI.I0000Il00O(i1ii0io, j).hashCode();
/* 52 */                        i6 = iFloatToIntBits + i2;
                                break;
                            case 50:
/* 382 */                       i2 = i6 * 53;
/* 388 */                       iFloatToIntBits = i1oo0I1oIiI.I0000Il00O(i1ii0io, j).hashCode();
/* 52 */                        i6 = iFloatToIntBits + i2;
                                break;
                            case 51:
/* 360 */                       if (!I000O01llI0(i1ii0io, i8, i5)) {
                                    break;
                                } else {
/* 362 */                           i = i6 * 53;
/* 374 */                           jDoubleToLongBits = Double.doubleToLongBits(((Double) i1oo0I1oIiI.I0000Il00O(i1ii0io, j)).doubleValue());
/* 378 */                           Charset charset8 = i1io0O.I00000oIO;
/* 80 */                            i6 = i + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                                    break;
                                }
                            case 52:
/* 336 */                       if (!I000O01llI0(i1ii0io, i8, i5)) {
                                    break;
                                } else {
/* 338 */                           i2 = i6 * 53;
/* 350 */                           iFloatToIntBits = Float.floatToIntBits(((Float) i1oo0I1oIiI.I0000Il00O(i1ii0io, j)).floatValue());
/* 52 */                            i6 = iFloatToIntBits + i2;
                                    break;
                                }
                            case 53:
/* 314 */                       if (!I000O01llI0(i1ii0io, i8, i5)) {
                                    break;
                                } else {
/* 316 */                           i = i6 * 53;
/* 324 */                           jDoubleToLongBits = ((Long) i1oo0I1oIiI.I0000Il00O(i1ii0io, j)).longValue();
/* 328 */                           Charset charset9 = i1io0O.I00000oIO;
/* 80 */                            i6 = i + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                                    break;
                                }
                            case 54:
/* 292 */                       if (!I000O01llI0(i1ii0io, i8, i5)) {
                                    break;
                                } else {
/* 294 */                           i = i6 * 53;
/* 302 */                           jDoubleToLongBits = ((Long) i1oo0I1oIiI.I0000Il00O(i1ii0io, j)).longValue();
/* 306 */                           Charset charset10 = i1io0O.I00000oIO;
/* 80 */                            i6 = i + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                                    break;
                                }
                            case 55:
/* 278 */                       if (!I000O01llI0(i1ii0io, i8, i5)) {
                                    break;
                                } else {
/* 280 */                           i2 = i6 * 53;
/* 282 */                           iFloatToIntBits = I000OiO(i1ii0io, j);
/* 52 */                            i6 = iFloatToIntBits + i2;
                                    break;
                                }
                            case 56:
/* 256 */                       if (!I000O01llI0(i1ii0io, i8, i5)) {
                                    break;
                                } else {
/* 258 */                           i = i6 * 53;
/* 266 */                           jDoubleToLongBits = ((Long) i1oo0I1oIiI.I0000Il00O(i1ii0io, j)).longValue();
/* 270 */                           Charset charset11 = i1io0O.I00000oIO;
/* 80 */                            i6 = i + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                                    break;
                                }
                            case 57:
/* 242 */                       if (!I000O01llI0(i1ii0io, i8, i5)) {
                                    break;
                                } else {
/* 244 */                           i2 = i6 * 53;
/* 246 */                           iFloatToIntBits = I000OiO(i1ii0io, j);
/* 52 */                            i6 = iFloatToIntBits + i2;
                                    break;
                                }
                            case 58:
/* 215 */                       if (!I000O01llI0(i1ii0io, i8, i5)) {
                                    break;
                                } else {
/* 217 */                           i3 = i6 * 53;
/* 225 */                           boolean zBooleanValue = ((Boolean) i1oo0I1oIiI.I0000Il00O(i1ii0io, j)).booleanValue();
/* 229 */                           Charset charset12 = i1io0O.I00000oIO;
/* 231 */                           if (zBooleanValue) {
                                    }
/* 234 */                           i6 = i9 + i3;
                                    break;
                                }
                                break;
                            case 59:
/* 195 */                       if (!I000O01llI0(i1ii0io, i8, i5)) {
                                    break;
                                } else {
/* 197 */                           i2 = i6 * 53;
/* 205 */                           iFloatToIntBits = ((String) i1oo0I1oIiI.I0000Il00O(i1ii0io, j)).hashCode();
/* 52 */                            i6 = iFloatToIntBits + i2;
                                    break;
                                }
                            case 60:
/* 177 */                       if (!I000O01llI0(i1ii0io, i8, i5)) {
                                    break;
                                } else {
/* 179 */                           i2 = i6 * 53;
/* 185 */                           iFloatToIntBits = i1oo0I1oIiI.I0000Il00O(i1ii0io, j).hashCode();
/* 52 */                            i6 = iFloatToIntBits + i2;
                                    break;
                                }
                            case 61:
/* 160 */                       if (!I000O01llI0(i1ii0io, i8, i5)) {
                                    break;
                                } else {
/* 162 */                           i2 = i6 * 53;
/* 168 */                           iFloatToIntBits = i1oo0I1oIiI.I0000Il00O(i1ii0io, j).hashCode();
/* 52 */                            i6 = iFloatToIntBits + i2;
                                    break;
                                }
                            case 62:
/* 147 */                       if (!I000O01llI0(i1ii0io, i8, i5)) {
                                    break;
                                } else {
/* 149 */                           i2 = i6 * 53;
/* 151 */                           iFloatToIntBits = I000OiO(i1ii0io, j);
/* 52 */                            i6 = iFloatToIntBits + i2;
                                    break;
                                }
                            case 63:
/* 134 */                       if (!I000O01llI0(i1ii0io, i8, i5)) {
                                    break;
                                } else {
/* 136 */                           i2 = i6 * 53;
/* 138 */                           iFloatToIntBits = I000OiO(i1ii0io, j);
/* 52 */                            i6 = iFloatToIntBits + i2;
                                    break;
                                }
                            case Barcode.FORMAT_EAN_8:
/* 121 */                       if (!I000O01llI0(i1ii0io, i8, i5)) {
                                    break;
                                } else {
/* 123 */                           i2 = i6 * 53;
/* 125 */                           iFloatToIntBits = I000OiO(i1ii0io, j);
/* 52 */                            i6 = iFloatToIntBits + i2;
                                    break;
                                }
                            case 65:
/* 100 */                       if (!I000O01llI0(i1ii0io, i8, i5)) {
                                    break;
                                } else {
/* 102 */                           i = i6 * 53;
/* 110 */                           jDoubleToLongBits = ((Long) i1oo0I1oIiI.I0000Il00O(i1ii0io, j)).longValue();
/* 114 */                           Charset charset13 = i1io0O.I00000oIO;
/* 80 */                            i6 = i + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                                    break;
                                }
                            case 66:
/* 87 */                        if (!I000O01llI0(i1ii0io, i8, i5)) {
                                    break;
                                } else {
/* 89 */                            i2 = i6 * 53;
/* 91 */                            iFloatToIntBits = I000OiO(i1ii0io, j);
/* 52 */                            i6 = iFloatToIntBits + i2;
                                    break;
                                }
                            case 67:
/* 60 */                        if (!I000O01llI0(i1ii0io, i8, i5)) {
                                    break;
                                } else {
/* 62 */                            i = i6 * 53;
/* 70 */                            jDoubleToLongBits = ((Long) i1oo0I1oIiI.I0000Il00O(i1ii0io, j)).longValue();
/* 74 */                            Charset charset14 = i1io0O.I00000oIO;
/* 80 */                            i6 = i + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                                    break;
                                }
                            case 68:
/* 40 */                        if (!I000O01llI0(i1ii0io, i8, i5)) {
                                    break;
                                } else {
/* 42 */                            i2 = i6 * 53;
/* 48 */                            iFloatToIntBits = i1oo0I1oIiI.I0000Il00O(i1ii0io, j).hashCode();
/* 52 */                            i6 = iFloatToIntBits + i2;
                                    break;
                                }
                        }
/* 602 */               i5 += 3;
                    }
                }

                @Override
                public final void I0000Il00O(Object obj, byte[] bArr, int i, int i2, i1O1ll0i0 i1o1ll0i0) throws i1ioIilo10 {
/* 8 */             I000OOo1O(obj, bArr, i, i2, 0, i1o1ll0i0);
                }

                @Override
                public final boolean I0000O(i1ii0Io i1ii0io, i1ii0Io i1ii0io2) {
                    boolean zI00000oOI;
/* 1 */             int[] iArr = this.I00000oIO;
/* 4 */             int i = 0;
                    while (true) {
/* 6 */                 if (i < iArr.length) {
/* 8 */                     int iI000lI = I000lI(i);
/* 15 */                    long j = iI000lI & 1048575;
                            switch (I000l1(iI000lI)) {
                                case 0:
/* 432 */                           if (!I0000oI00(i1ii0io, i1ii0io2, i)) {
                                        break;
                                    } else {
/* 434 */                               Ooil0oIOI0l0 ooil0oIOI0l0 = i1oo0I1oIiI.I0000Il00O;
/* 454 */                               if (Double.doubleToLongBits(ooil0oIOI0l0.I0010I0i(i1ii0io, j)) != Double.doubleToLongBits(ooil0oIOI0l0.I0010I0i(i1ii0io2, j))) {
                                            break;
                                        } else {
                                            continue;
/* 456 */                                   i += 3;
                                        }
                                    }
                                case 1:
/* 405 */                           if (!I0000oI00(i1ii0io, i1ii0io2, i)) {
                                        break;
                                    } else {
/* 407 */                               Ooil0oIOI0l0 ooil0oIOI0l02 = i1oo0I1oIiI.I0000Il00O;
/* 425 */                               if (Float.floatToIntBits(ooil0oIOI0l02.I001IIilI0O(i1ii0io, j)) != Float.floatToIntBits(ooil0oIOI0l02.I001IIilI0O(i1ii0io2, j))) {
                                            break;
                                        } else {
                                            continue;
/* 456 */                                   i += 3;
                                        }
                                    }
                                case 2:
/* 386 */                           if (!I0000oI00(i1ii0io, i1ii0io2, i) || i1oo0I1oIiI.I00000oOI(i1ii0io, j) != i1oo0I1oIiI.I00000oOI(i1ii0io2, j)) {
                                        break;
                                    } else {
                                        continue;
/* 456 */                               i += 3;
                                    }
                                    break;
                                case 3:
/* 367 */                           if (!I0000oI00(i1ii0io, i1ii0io2, i) || i1oo0I1oIiI.I00000oOI(i1ii0io, j) != i1oo0I1oIiI.I00000oOI(i1ii0io2, j)) {
                                        break;
                                    } else {
                                        continue;
/* 456 */                               i += 3;
                                    }
                                    break;
                                case 4:
/* 350 */                           if (!I0000oI00(i1ii0io, i1ii0io2, i) || i1oo0I1oIiI.I00000oIO(i1ii0io, j) != i1oo0I1oIiI.I00000oIO(i1ii0io2, j)) {
                                        break;
                                    } else {
                                        continue;
/* 456 */                               i += 3;
                                    }
                                    break;
                                case 5:
/* 330 */                           if (!I0000oI00(i1ii0io, i1ii0io2, i) || i1oo0I1oIiI.I00000oOI(i1ii0io, j) != i1oo0I1oIiI.I00000oOI(i1ii0io2, j)) {
                                        break;
                                    } else {
                                        continue;
/* 456 */                               i += 3;
                                    }
                                    break;
                                case 6:
/* 312 */                           if (!I0000oI00(i1ii0io, i1ii0io2, i) || i1oo0I1oIiI.I00000oIO(i1ii0io, j) != i1oo0I1oIiI.I00000oIO(i1ii0io2, j)) {
                                        break;
                                    } else {
                                        continue;
/* 456 */                               i += 3;
                                    }
                                    break;
                                case 7:
/* 292 */                           if (!I0000oI00(i1ii0io, i1ii0io2, i)) {
                                        break;
                                    } else {
/* 294 */                               Ooil0oIOI0l0 ooil0oIOI0l03 = i1oo0I1oIiI.I0000Il00O;
/* 304 */                               if (ooil0oIOI0l03.I00IlilI0i0i(j, i1ii0io) != ooil0oIOI0l03.I00IlilI0i0i(j, i1ii0io2)) {
                                            break;
                                        } else {
                                            continue;
/* 456 */                                   i += 3;
                                        }
                                    }
                                case 8:
/* 270 */                           if (!I0000oI00(i1ii0io, i1ii0io2, i) || !i1oI0oIO0.I00000oOI(i1oo0I1oIiI.I0000Il00O(i1ii0io, j), i1oo0I1oIiI.I0000Il00O(i1ii0io2, j))) {
                                        break;
                                    } else {
                                        continue;
/* 456 */                               i += 3;
                                    }
                                    break;
                                case 9:
/* 248 */                           if (!I0000oI00(i1ii0io, i1ii0io2, i) || !i1oI0oIO0.I00000oOI(i1oo0I1oIiI.I0000Il00O(i1ii0io, j), i1oo0I1oIiI.I0000Il00O(i1ii0io2, j))) {
                                        break;
                                    } else {
                                        continue;
/* 456 */                               i += 3;
                                    }
                                    break;
                                case 10:
/* 226 */                           if (!I0000oI00(i1ii0io, i1ii0io2, i) || !i1oI0oIO0.I00000oOI(i1oo0I1oIiI.I0000Il00O(i1ii0io, j), i1oo0I1oIiI.I0000Il00O(i1ii0io2, j))) {
                                        break;
                                    } else {
                                        continue;
/* 456 */                               i += 3;
                                    }
                                    break;
                                case 11:
/* 208 */                           if (!I0000oI00(i1ii0io, i1ii0io2, i) || i1oo0I1oIiI.I00000oIO(i1ii0io, j) != i1oo0I1oIiI.I00000oIO(i1ii0io2, j)) {
                                        break;
                                    } else {
                                        continue;
/* 456 */                               i += 3;
                                    }
                                    break;
                                case 12:
/* 190 */                           if (!I0000oI00(i1ii0io, i1ii0io2, i) || i1oo0I1oIiI.I00000oIO(i1ii0io, j) != i1oo0I1oIiI.I00000oIO(i1ii0io2, j)) {
                                        break;
                                    } else {
                                        continue;
/* 456 */                               i += 3;
                                    }
                                    break;
                                case 13:
/* 172 */                           if (!I0000oI00(i1ii0io, i1ii0io2, i) || i1oo0I1oIiI.I00000oIO(i1ii0io, j) != i1oo0I1oIiI.I00000oIO(i1ii0io2, j)) {
                                        break;
                                    } else {
                                        continue;
/* 456 */                               i += 3;
                                    }
                                    break;
                                case 14:
/* 152 */                           if (!I0000oI00(i1ii0io, i1ii0io2, i) || i1oo0I1oIiI.I00000oOI(i1ii0io, j) != i1oo0I1oIiI.I00000oOI(i1ii0io2, j)) {
                                        break;
                                    } else {
                                        continue;
/* 456 */                               i += 3;
                                    }
                                    break;
                                case 15:
/* 134 */                           if (!I0000oI00(i1ii0io, i1ii0io2, i) || i1oo0I1oIiI.I00000oIO(i1ii0io, j) != i1oo0I1oIiI.I00000oIO(i1ii0io2, j)) {
                                        break;
                                    } else {
                                        continue;
/* 456 */                               i += 3;
                                    }
                                    break;
                                case 16:
/* 114 */                           if (!I0000oI00(i1ii0io, i1ii0io2, i) || i1oo0I1oIiI.I00000oOI(i1ii0io, j) != i1oo0I1oIiI.I00000oOI(i1ii0io2, j)) {
                                        break;
                                    } else {
                                        continue;
/* 456 */                               i += 3;
                                    }
                                    break;
                                case 17:
/* 92 */                            if (!I0000oI00(i1ii0io, i1ii0io2, i) || !i1oI0oIO0.I00000oOI(i1oo0I1oIiI.I0000Il00O(i1ii0io, j), i1oo0I1oIiI.I0000Il00O(i1ii0io2, j))) {
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
/* 80 */                            zI00000oOI = i1oI0oIO0.I00000oOI(i1oo0I1oIiI.I0000Il00O(i1ii0io, j), i1oo0I1oIiI.I0000Il00O(i1ii0io2, j));
                                    break;
                                case 50:
/* 67 */                            zI00000oOI = i1oI0oIO0.I00000oOI(i1oo0I1oIiI.I0000Il00O(i1ii0io, j), i1oo0I1oIiI.I0000Il00O(i1ii0io2, j));
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
/* 41 */                            if (i1oo0I1oIiI.I00000oIO(i1ii0io, j2) != i1oo0I1oIiI.I00000oIO(i1ii0io2, j2) || !i1oI0oIO0.I00000oOI(i1oo0I1oIiI.I0000Il00O(i1ii0io, j), i1oo0I1oIiI.I0000Il00O(i1ii0io2, j))) {
                                        break;
                                    } else {
                                        continue;
/* 456 */                               i += 3;
                                    }
                                    break;
                                default:
/* 456 */                           i += 3;
                            }
/* 84 */                    if (zI00000oOI) {
/* 456 */                       i += 3;
                            }
                        } else if (i1ii0io.zzc.equals(i1ii0io2.zzc)) {
/* 471 */                   return true;
                        }
                    }
/* 3 */             return false;
                }

                public final boolean I0000oI00(i1ii0Io i1ii0io, i1ii0Io i1ii0io2, int i) {
                    return I0001Ioi1lo(i, i1ii0io) == I0001Ioi1lo(i, i1ii0io2);
                }

                public final boolean I0001Ioi1lo(int i, Object obj) {
/* 5 */             int i2 = this.I00000oIO[i + 2];
/* 10 */            long j = i2 & 1048575;
/* 20 */            if (j != 1048575) {
                        return ((1 << (i2 >>> 20)) & i1oo0I1oIiI.I00000oIO(obj, j)) != 0;
                    }
/* 22 */            int iI000lI = I000lI(i);
/* 26 */            long j2 = iI000lI & 1048575;
                    switch (I000l1(iI000lI)) {
                        case 0:
/* 232 */                   if (Double.doubleToRawLongBits(i1oo0I1oIiI.I0000Il00O.I0010I0i(obj, j2)) != 0) {
                            }
                            break;
                        case 1:
/* 217 */                   if (Float.floatToRawIntBits(i1oo0I1oIiI.I0000Il00O.I001IIilI0O(obj, j2)) != 0) {
                            }
                            break;
                        case 2:
/* 204 */                   if (i1oo0I1oIiI.I00000oOI(obj, j2) != 0) {
                            }
                            break;
                        case 3:
/* 195 */                   if (i1oo0I1oIiI.I00000oOI(obj, j2) != 0) {
                            }
                            break;
                        case 4:
/* 186 */                   if (i1oo0I1oIiI.I00000oIO(obj, j2) != 0) {
                            }
                            break;
                        case 5:
/* 179 */                   if (i1oo0I1oIiI.I00000oOI(obj, j2) != 0) {
                            }
                            break;
                        case 6:
/* 170 */                   if (i1oo0I1oIiI.I00000oIO(obj, j2) != 0) {
                            }
                            break;
                        case 7:
                            break;
                        case 8:
/* 124 */                   Object objI0000Il00O = i1oo0I1oIiI.I0000Il00O(obj, j2);
/* 130 */                   if (!(objI0000Il00O instanceof String)) {
/* 144 */                       if (!(objI0000Il00O instanceof i1OOli0lO)) {
/* 155 */                           OIiilo1Ool0o.I00100o1O0lo();
                                    break;
                                } else if (!i1OOli0lO.I00iiO.equals(objI0000Il00O)) {
                                }
                            } else if (!((String) objI0000Il00O).isEmpty()) {
                            }
                            break;
                        case 9:
/* 120 */                   if (i1oo0I1oIiI.I0000Il00O(obj, j2) != null) {
                            }
                            break;
                        case 10:
/* 112 */                   if (!i1OOli0lO.I00iiO.equals(i1oo0I1oIiI.I0000Il00O(obj, j2))) {
                            }
                            break;
                        case 11:
/* 98 */                    if (i1oo0I1oIiI.I00000oIO(obj, j2) != 0) {
                            }
                            break;
                        case 12:
/* 90 */                    if (i1oo0I1oIiI.I00000oIO(obj, j2) != 0) {
                            }
                            break;
                        case 13:
/* 82 */                    if (i1oo0I1oIiI.I00000oIO(obj, j2) != 0) {
                            }
                            break;
                        case 14:
/* 74 */                    if (i1oo0I1oIiI.I00000oOI(obj, j2) != 0) {
                            }
                            break;
                        case 15:
/* 64 */                    if (i1oo0I1oIiI.I00000oIO(obj, j2) != 0) {
                            }
                            break;
                        case 16:
/* 56 */                    if (i1oo0I1oIiI.I00000oOI(obj, j2) != 0) {
                            }
                            break;
                        case 17:
/* 46 */                    if (i1oo0I1oIiI.I0000Il00O(obj, j2) != null) {
                            }
                            break;
                        default:
/* 38 */                    OIiilo1Ool0o.I00100o1O0lo();
                            break;
                    }
/* 18 */            return false;
                }

                public final boolean I000O01llI0(Object obj, int i, int i2) {
                    return i1oo0I1oIiI.I00000oIO(obj, (long) (this.I00000oIO[i2 + 2] & 1048575)) == i;
                }

                /* JADX WARN: Code restructure failed: missing block: B:103:0x0296, code lost:
                
                    throw new p000.i1ioIilo10("Protocol message had invalid UTF-8.");
                 */
                /* JADX WARN: Code restructure failed: missing block: B:124:0x02ec, code lost:
                
                    throw new p000.i1ioIilo10("Protocol message had invalid UTF-8.");
                 */
                /* JADX WARN: Code restructure failed: missing block: B:139:0x0355, code lost:
                
                    throw new p000.i1ioIilo10("Protocol message had invalid UTF-8.");
                 */
                /* JADX WARN: Code restructure failed: missing block: B:173:0x0465, code lost:
                
                    r6 = r12;
                    r7 = r13;
                    r4 = r14;
                    r8 = r27;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:178:0x0491, code lost:
                
                    r2 = r8;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:179:0x0492, code lost:
                
                    r3 = r10;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:184:0x04b5, code lost:
                
                    r5 = r42;
                    r1 = r7;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:46:0x013a, code lost:
                
                    r3 = r8;
                    r6 = r11;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:47:0x013c, code lost:
                
                    r8 = r12;
                    r7 = r13;
                    r4 = r14;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:54:0x016e, code lost:
                
                    r5 = r42;
                 */
                /* JADX WARN: Removed duplicated region for block: B:118:0x02c6  */
                /* JADX WARN: Removed duplicated region for block: B:120:0x02c9 A[PHI: r5
                  0x02c9: PHI (r5v34 byte) = (r5v33 byte), (r5v38 byte) binds: [B:117:0x02c4, B:119:0x02c8] A[DONT_GENERATE, DONT_INLINE]] */
                /* JADX WARN: Removed duplicated region for block: B:122:0x02cf  */
                /* JADX WARN: Removed duplicated region for block: B:26:0x006b  */
                /* JADX WARN: Removed duplicated region for block: B:491:0x0b7e  */
                /* JADX WARN: Removed duplicated region for block: B:529:0x02e7 A[SYNTHETIC] */
                /* JADX WARN: Removed duplicated region for block: B:588:0x087d A[SYNTHETIC] */
                /* JADX WARN: Removed duplicated region for block: B:589:0x0b4e A[SYNTHETIC] */
                /* JADX WARN: Removed duplicated region for block: B:590:0x0057 A[SYNTHETIC] */
                /* JADX WARN: Removed duplicated region for block: B:611:0x0895 A[SYNTHETIC] */
                /* JADX WARN: Removed duplicated region for block: B:613:0x0b61 A[SYNTHETIC] */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final int I000OOo1O(Object obj, byte[] bArr, int i, int i2, int i3, i1O1ll0i0 i1o1ll0i0) throws i1ioIilo10 {
                    Object obj2;
                    int[] iArr;
                    Unsafe unsafe;
                    int i4;
                    int i5;
                    int i6;
                    int iI000iOII;
                    byte[] bArr2;
                    int i7;
                    int i8;
                    int i9;
                    i1O1ll0i0 i1o1ll0i02;
                    int i10;
                    i1oi1lOoII1 i1oi1looii1I00000oIO;
                    int i11;
                    int i12;
                    int i13;
                    byte[] bArr3;
                    i1O1ll0i0 i1o1ll0i03;
                    Object obj3;
                    int i14;
                    Unsafe unsafe2;
                    int i15;
                    int i16;
                    int i17;
                    int iI0001Ioi1lo;
                    int i18;
                    int i19;
                    int i20;
                    byte b;
                    byte b2;
                    byte[] bArr4;
                    i1O1ll0i0 i1o1ll0i04;
                    int iI000O01llI0;
                    Unsafe unsafe3;
                    Object obj4;
                    i1O1ll0i0 i1o1ll0i05;
                    byte[] bArr5;
                    Unsafe unsafe4;
                    int i21;
                    byte[] bArr6;
                    int i22;
                    int i23;
                    i1lIOII i1lioii;
                    int i24;
                    int iI0001Ioi1lo2;
                    int iI000O01llI02;
                    int i25;
                    int i26;
                    i1O1ll0i0 i1o1ll0i06;
                    int iI00000oIO;
                    byte[] bArr7;
                    i1O1ll0i0 i1o1ll0i07;
                    int i27;
                    int i28;
                    int i29;
                    i1O1ll0i0 i1o1ll0i08;
                    int i30;
                    byte[] bArr8;
                    byte[] bArr9;
                    i1O1ll0i0 i1o1ll0i09;
                    int i31;
                    byte[] bArr10;
/* 3 */             Object obj5 = obj;
/* 5 */             byte[] bArr11 = bArr;
/* 7 */             int i32 = i2;
/* 9 */             i1O1ll0i0 i1o1ll0i010 = i1o1ll0i0;
/* 11 */            int[] iArr2 = this.I00000oIO;
/* 13 */            int i33 = this.I0000O;
/* 19 */            if (!I000II(obj5)) {
/* 3071 */              I000II.I000iOII("Mutating immutable message: ".concat(String.valueOf(obj5)));
/* 3074 */              return 0;
                    }
/* 21 */            int iI0000oI00 = i;
/* 23 */            int i34 = -1;
/* 24 */            int i35 = 0;
/* 25 */            int i36 = 1048575;
/* 28 */            int i37 = 0;
/* 29 */            int i38 = 0;
                    while (true) {
/* 31 */                int i39 = 1048575;
                        while (true) {
/* 34 */                    Unsafe unsafe5 = I000iOII;
/* 36 */                    if (iI0000oI00 < i32) {
/* 38 */                        int iI000II = iI0000oI00 + 1;
/* 40 */                        int i40 = bArr11[iI0000oI00];
/* 42 */                        if (i40 < 0) {
/* 44 */                            iI000II = liOO0oio.I000II(i40, bArr11, iI000II, i1o1ll0i010);
/* 48 */                            i40 = i1o1ll0i010.I00000oIO;
                                }
/* 50 */                        i38 = i40;
/* 52 */                        int i41 = i38 >>> 3;
/* 54 */                        int i42 = this.I0000Il00O;
/* 57 */                        if (i41 > i34) {
/* 69 */                            iI000iOII = (i41 < i42 || i41 > i33) ? -1 : I000iOII(i41, i35 / 3);
                                } else if (i41 < i42 || i41 > i33) {
/* 84 */                            i6 = -1;
/* 85 */                            iI000iOII = -1;
/* 86 */                            if (iI000iOII != i6) {
/* 88 */                                bArr2 = bArr;
/* 90 */                                obj2 = obj5;
/* 91 */                                i7 = i36;
/* 93 */                                iArr = iArr2;
/* 95 */                                i8 = i33;
/* 97 */                                i9 = iI000II;
/* 98 */                                i5 = i38;
/* 100 */                               i35 = 0;
/* 101 */                               i4 = i3;
/* 103 */                               i1o1ll0i02 = i1o1ll0i010;
/* 104 */                               unsafe = unsafe5;
/* 105 */                               i10 = i41;
                                    } else {
/* 108 */                               int i43 = i38 & 7;
/* 112 */                               int i44 = iArr2[iI000iOII + 1];
/* 114 */                               int iI000l1 = I000l1(i44);
/* 120 */                               long j = i44 & i39;
/* 125 */                               Unsafe unsafe6 = I000iOII;
/* 133 */                               String str = "";
/* 137 */                               iArr = iArr2;
/* 141 */                               i8 = i33;
/* 147 */                               if (iI000l1 <= 17) {
/* 151 */                                   int i45 = iArr[iI000iOII + 2];
/* 155 */                                   int i46 = 1 << (i45 >>> 20);
/* 157 */                                   int i47 = i45 & i39;
/* 159 */                                   if (i47 != i36) {
/* 161 */                                       i13 = iI000II;
/* 163 */                                       int i48 = i39;
/* 165 */                                       i11 = iI000l1;
/* 167 */                                       i12 = i44;
/* 169 */                                       if (i36 != i48) {
/* 172 */                                           unsafe5.putInt(obj5, i36, i37);
                                                }
/* 180 */                                       i37 = i47 == i48 ? 0 : unsafe5.getInt(obj5, i47);
                                            } else {
/* 186 */                                       i11 = iI000l1;
/* 188 */                                       i12 = i44;
/* 190 */                                       i13 = iI000II;
/* 192 */                                       i47 = i36;
                                            }
                                            switch (i11) {
                                                case 0:
/* 1249 */                                          bArr4 = bArr;
/* 1251 */                                          obj3 = obj5;
/* 1252 */                                          i14 = i37;
/* 1254 */                                          unsafe = unsafe5;
/* 1255 */                                          i10 = i41;
/* 1261 */                                          i15 = i13;
/* 1263 */                                          i16 = i47;
/* 1265 */                                          i1o1ll0i04 = i1o1ll0i0;
/* 1267 */                                          if (i43 == 1) {
/* 1269 */                                              iI000O01llI0 = i15 + 8;
/* 1271 */                                              i37 = i14 | i46;
/* 1277 */                                              double dLongBitsToDouble = Double.longBitsToDouble(liOO0oio.I000iOII(i15, bArr4));
/* 1283 */                                              obj5 = obj3;
/* 1284 */                                              i1oo0I1oIiI.I0000Il00O.I001lllioOl(obj5, j, dLongBitsToDouble);
                                                        break;
                                                    }
/* 970 */                                           obj4 = obj3;
/* 1288 */                                          i37 = i14;
/* 1290 */                                          i4 = i3;
/* 1292 */                                          i9 = i15;
/* 1293 */                                          bArr2 = bArr4;
/* 1294 */                                          i1o1ll0i02 = i1o1ll0i04;
/* 1295 */                                          i35 = iI000iOII;
/* 1296 */                                          i5 = i38;
/* 1298 */                                          i7 = i16;
/* 1300 */                                          obj2 = obj4;
                                                    break;
                                                case 1:
/* 1210 */                                          bArr4 = bArr;
/* 1212 */                                          obj3 = obj5;
/* 1213 */                                          i14 = i37;
/* 1215 */                                          unsafe = unsafe5;
/* 1216 */                                          i10 = i41;
/* 1220 */                                          i15 = i13;
/* 1223 */                                          i16 = i47;
/* 1225 */                                          i1o1ll0i04 = i1o1ll0i0;
/* 1227 */                                          if (i43 == 5) {
/* 1229 */                                              iI0000oI00 = i15 + 4;
/* 1231 */                                              i37 = i14 | i46;
/* 1243 */                                              i1oo0I1oIiI.I0000Il00O.I00IO1(obj3, j, Float.intBitsToFloat(liOO0oio.I00000oOI(i15, bArr4)));
/* 1246 */                                              i32 = i2;
                                                        break;
                                                    }
/* 970 */                                           obj4 = obj3;
/* 1288 */                                          i37 = i14;
/* 1290 */                                          i4 = i3;
/* 1292 */                                          i9 = i15;
/* 1293 */                                          bArr2 = bArr4;
/* 1294 */                                          i1o1ll0i02 = i1o1ll0i04;
/* 1295 */                                          i35 = iI000iOII;
/* 1296 */                                          i5 = i38;
/* 1298 */                                          i7 = i16;
/* 1300 */                                          obj2 = obj4;
                                                    break;
                                                case 2:
                                                case 3:
/* 1176 */                                          bArr4 = bArr;
/* 1178 */                                          obj3 = obj5;
/* 1179 */                                          i14 = i37;
/* 1181 */                                          unsafe3 = unsafe5;
/* 1182 */                                          i10 = i41;
/* 1186 */                                          i15 = i13;
/* 1188 */                                          i16 = i47;
/* 1190 */                                          i1o1ll0i04 = i1o1ll0i0;
/* 1192 */                                          if (i43 == 0) {
/* 1194 */                                              i37 = i14 | i46;
/* 1196 */                                              iI000O01llI0 = liOO0oio.I000O01llI0(bArr4, i15, i1o1ll0i04);
/* 1202 */                                              obj5 = obj3;
/* 1203 */                                              unsafe3.putLong(obj5, j, i1o1ll0i04.I00000oOI);
                                                        break;
                                                    }
/* 1173 */                                          unsafe = unsafe3;
/* 970 */                                           obj4 = obj3;
/* 1288 */                                          i37 = i14;
/* 1290 */                                          i4 = i3;
/* 1292 */                                          i9 = i15;
/* 1293 */                                          bArr2 = bArr4;
/* 1294 */                                          i1o1ll0i02 = i1o1ll0i04;
/* 1295 */                                          i35 = iI000iOII;
/* 1296 */                                          i5 = i38;
/* 1298 */                                          i7 = i16;
/* 1300 */                                          obj2 = obj4;
                                                    break;
                                                case 4:
                                                case 11:
/* 1138 */                                          bArr4 = bArr;
/* 1140 */                                          obj3 = obj5;
/* 1141 */                                          i14 = i37;
/* 1143 */                                          unsafe3 = unsafe5;
/* 1144 */                                          i10 = i41;
/* 1148 */                                          i15 = i13;
/* 1150 */                                          i16 = i47;
/* 1152 */                                          i1o1ll0i04 = i1o1ll0i0;
/* 1154 */                                          if (i43 == 0) {
/* 1156 */                                              i37 = i14 | i46;
/* 1158 */                                              int iI0001Ioi1lo3 = liOO0oio.I0001Ioi1lo(bArr4, i15, i1o1ll0i04);
/* 1164 */                                              unsafe3.putInt(obj3, j, i1o1ll0i04.I00000oIO);
/* 1167 */                                              i32 = i2;
/* 1169 */                                              iI0000oI00 = iI0001Ioi1lo3;
                                                        break;
                                                    }
/* 1173 */                                          unsafe = unsafe3;
/* 970 */                                           obj4 = obj3;
/* 1288 */                                          i37 = i14;
/* 1290 */                                          i4 = i3;
/* 1292 */                                          i9 = i15;
/* 1293 */                                          bArr2 = bArr4;
/* 1294 */                                          i1o1ll0i02 = i1o1ll0i04;
/* 1295 */                                          i35 = iI000iOII;
/* 1296 */                                          i5 = i38;
/* 1298 */                                          i7 = i16;
/* 1300 */                                          obj2 = obj4;
                                                    break;
                                                case 5:
                                                case 14:
/* 1086 */                                          obj3 = obj5;
/* 1087 */                                          i14 = i37;
/* 1090 */                                          i10 = i41;
/* 1096 */                                          i15 = i13;
/* 1098 */                                          i16 = i47;
/* 1100 */                                          if (i43 == 1) {
/* 1102 */                                              int i49 = i15 + 8;
/* 1106 */                                              long jI000iOII = liOO0oio.I000iOII(i15, bArr);
/* 1110 */                                              i1o1ll0i04 = i1o1ll0i0;
/* 1111 */                                              obj5 = obj3;
/* 1118 */                                              unsafe5.putLong(obj5, j, jI000iOII);
/* 1121 */                                              i32 = i2;
/* 1123 */                                              iI0000oI00 = i49;
/* 1124 */                                              bArr11 = bArr;
/* 1104 */                                              i37 = i14 | i46;
                                                        break;
                                                    } else {
/* 1133 */                                              bArr4 = bArr;
/* 1134 */                                              i1o1ll0i04 = i1o1ll0i0;
/* 1135 */                                              unsafe = unsafe5;
/* 970 */                                               obj4 = obj3;
/* 1288 */                                              i37 = i14;
/* 1290 */                                              i4 = i3;
/* 1292 */                                              i9 = i15;
/* 1293 */                                              bArr2 = bArr4;
/* 1294 */                                              i1o1ll0i02 = i1o1ll0i04;
/* 1295 */                                              i35 = iI000iOII;
/* 1296 */                                              i5 = i38;
/* 1298 */                                              i7 = i16;
/* 1300 */                                              obj2 = obj4;
                                                        break;
                                                    }
                                                case 6:
                                                case 13:
/* 1032 */                                          bArr3 = bArr;
/* 1034 */                                          i1o1ll0i03 = i1o1ll0i0;
/* 1036 */                                          obj3 = obj5;
/* 1037 */                                          i14 = i37;
/* 1039 */                                          unsafe2 = unsafe5;
/* 1040 */                                          i10 = i41;
/* 1044 */                                          i15 = i13;
/* 1047 */                                          i16 = i47;
/* 1049 */                                          if (i43 != 5) {
/* 967 */                                               bArr4 = bArr3;
/* 968 */                                               unsafe = unsafe2;
/* 969 */                                               i1o1ll0i04 = i1o1ll0i03;
/* 970 */                                               obj4 = obj3;
/* 1288 */                                              i37 = i14;
/* 1290 */                                              i4 = i3;
/* 1292 */                                              i9 = i15;
/* 1293 */                                              bArr2 = bArr4;
/* 1294 */                                              i1o1ll0i02 = i1o1ll0i04;
/* 1295 */                                              i35 = iI000iOII;
/* 1296 */                                              i5 = i38;
/* 1298 */                                              i7 = i16;
/* 1300 */                                              obj2 = obj4;
                                                        break;
                                                    } else {
/* 1059 */                                              unsafe2.putInt(obj3, j, liOO0oio.I00000oOI(i15, bArr3));
/* 1062 */                                              bArr11 = bArr3;
/* 1051 */                                              iI0000oI00 = i15 + 4;
/* 1053 */                                              i37 = i14 | i46;
/* 1065 */                                              obj5 = obj3;
/* 1066 */                                              i35 = iI000iOII;
/* 1067 */                                              i36 = i16;
/* 1069 */                                              iArr2 = iArr;
/* 1071 */                                              i33 = i8;
/* 1073 */                                              i39 = 1048575;
/* 1076 */                                              i32 = i2;
/* 1078 */                                              i1o1ll0i010 = i1o1ll0i03;
/* 1079 */                                              i34 = i10;
                                                    }
                                                case 7:
/* 973 */                                           bArr3 = bArr;
/* 975 */                                           i1o1ll0i03 = i1o1ll0i0;
/* 977 */                                           obj3 = obj5;
/* 978 */                                           i14 = i37;
/* 980 */                                           unsafe2 = unsafe5;
/* 981 */                                           i10 = i41;
/* 985 */                                           i15 = i13;
/* 987 */                                           i16 = i47;
/* 989 */                                           if (i43 != 0) {
/* 967 */                                               bArr4 = bArr3;
/* 968 */                                               unsafe = unsafe2;
/* 969 */                                               i1o1ll0i04 = i1o1ll0i03;
/* 970 */                                               obj4 = obj3;
/* 1288 */                                              i37 = i14;
/* 1290 */                                              i4 = i3;
/* 1292 */                                              i9 = i15;
/* 1293 */                                              bArr2 = bArr4;
/* 1294 */                                              i1o1ll0i02 = i1o1ll0i04;
/* 1295 */                                              i35 = iI000iOII;
/* 1296 */                                              i5 = i38;
/* 1298 */                                              i7 = i16;
/* 1300 */                                              obj2 = obj4;
                                                        break;
                                                    } else {
/* 991 */                                               int i50 = i14 | i46;
/* 993 */                                               int iI000O01llI03 = liOO0oio.I000O01llI0(bArr3, i15, i1o1ll0i03);
/* 1009 */                                              i1oo0I1oIiI.I0000Il00O.I001iOo1i0O(obj3, j, i1o1ll0i03.I00000oOI != 0);
/* 1012 */                                              i32 = i2;
/* 1014 */                                              i37 = i50;
/* 1015 */                                              i1o1ll0i010 = i1o1ll0i03;
/* 1016 */                                              i35 = iI000iOII;
/* 1017 */                                              i34 = i10;
/* 1018 */                                              iArr2 = iArr;
/* 1020 */                                              i33 = i8;
/* 1022 */                                              i39 = 1048575;
/* 1025 */                                              bArr11 = bArr3;
/* 1026 */                                              iI0000oI00 = iI000O01llI03;
/* 1027 */                                              obj5 = obj3;
/* 1028 */                                              i36 = i16;
                                                    }
                                                case 8:
/* 497 */                                           bArr3 = bArr;
/* 499 */                                           i1o1ll0i03 = i1o1ll0i0;
/* 501 */                                           obj3 = obj5;
/* 502 */                                           i14 = i37;
/* 504 */                                           unsafe2 = unsafe5;
/* 505 */                                           i10 = i41;
/* 509 */                                           i15 = i13;
/* 512 */                                           if (i43 != 2) {
/* 965 */                                               i16 = i47;
/* 967 */                                               bArr4 = bArr3;
/* 968 */                                               unsafe = unsafe2;
/* 969 */                                               i1o1ll0i04 = i1o1ll0i03;
/* 970 */                                               obj4 = obj3;
/* 1288 */                                              i37 = i14;
/* 1290 */                                              i4 = i3;
/* 1292 */                                              i9 = i15;
/* 1293 */                                              bArr2 = bArr4;
/* 1294 */                                              i1o1ll0i02 = i1o1ll0i04;
/* 1295 */                                              i35 = iI000iOII;
/* 1296 */                                              i5 = i38;
/* 1298 */                                              i7 = i16;
/* 1300 */                                              obj2 = obj4;
                                                        break;
                                                    } else {
/* 516 */                                               if ((i12 & 536870912) != 0) {
/* 518 */                                                   iI0001Ioi1lo = liOO0oio.I0001Ioi1lo(bArr3, i15, i1o1ll0i03);
/* 522 */                                                   int i51 = i1o1ll0i03.I00000oIO;
/* 524 */                                                   if (i51 < 0) {
/* 908 */                                                       throw new i1ioIilo10("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                                            }
/* 526 */                                                   int i52 = i14 | i46;
/* 528 */                                                   if (i51 == 0) {
/* 530 */                                                       i1o1ll0i03.I0000Il00O = "";
/* 532 */                                                       i20 = i52;
/* 534 */                                                       i17 = i47;
                                                            } else {
/* 539 */                                                       int i53 = i1oooOlO100I.I00000oIO;
/* 541 */                                                       int length = bArr3.length;
/* 549 */                                                       if ((iI0001Ioi1lo | i51 | ((length - iI0001Ioi1lo) - i51)) < 0) {
/* 899 */                                                           OoOil11Ol1o.I000o00OoI0I("buffer length=%d, index=%d, size=%d", new Object[]{Integer.valueOf(length), Integer.valueOf(iI0001Ioi1lo), Integer.valueOf(i51)});
/* 880 */                                                           return 0;
                                                                }
/* 551 */                                                       int i54 = iI0001Ioi1lo + i51;
/* 553 */                                                       char[] cArr = new char[i51];
/* 555 */                                                       int i55 = 0;
                                                                while (true) {
/* 556 */                                                           i19 = iI0001Ioi1lo;
/* 558 */                                                           if (iI0001Ioi1lo < i54 && (b2 = bArr3[i19]) >= 0) {
/* 569 */                                                               cArr[i55] = (char) b2;
/* 564 */                                                               iI0001Ioi1lo = i19 + 1;
/* 566 */                                                               i55++;
                                                                    }
                                                                }
/* 576 */                                                       int i56 = i19;
/* 578 */                                                       while (i56 < i54) {
/* 580 */                                                           int i57 = i56;
/* 582 */                                                           i56 = i57 + 1;
/* 584 */                                                           int i58 = i52;
/* 586 */                                                           byte b3 = bArr3[i57];
/* 588 */                                                           if (b3 >= 0) {
/* 590 */                                                               int i59 = i55 + 1;
/* 593 */                                                               cArr[i55] = (char) b3;
                                                                        while (true) {
/* 595 */                                                                   i55 = i59;
/* 597 */                                                                   if (i56 < i54 && (b = bArr3[i56]) >= 0) {
/* 603 */                                                                       i56++;
/* 605 */                                                                       i59 = i55 + 1;
/* 608 */                                                                       cArr[i55] = (char) b;
                                                                            }
                                                                        }
/* 611 */                                                               i52 = i58;
                                                                    } else {
/* 614 */                                                               int i60 = i47;
/* 618 */                                                               if (b3 >= -32) {
/* 672 */                                                                   if (b3 < -16) {
/* 676 */                                                                       if (i56 >= i54 - 1) {
/* 755 */                                                                           throw new i1ioIilo10("Protocol message had invalid UTF-8.");
                                                                                }
/* 678 */                                                                       int i61 = i55 + 1;
/* 680 */                                                                       int i62 = i57 + 2;
/* 682 */                                                                       byte b4 = bArr3[i56];
/* 684 */                                                                       int i63 = i57 + 3;
/* 686 */                                                                       byte b5 = bArr3[i62];
/* 692 */                                                                       if (liOoi0ol0I1.I00000oIO(b4)) {
                                                                                    break;
                                                                                } else {
/* 694 */                                                                           int i64 = i54;
/* 702 */                                                                           if (b3 == -32) {
/* 704 */                                                                               if (b4 < -96) {
                                                                                            break;
                                                                                        } else {
/* 706 */                                                                                   b3 = -32;
/* 709 */                                                                                   if (b3 == -19) {
                                                                                            }
                                                                                        }
                                                                                    } else if (b3 == -19) {
/* 711 */                                                                               if (b4 >= -96) {
                                                                                            break;
                                                                                        } else {
/* 713 */                                                                                   b3 = -19;
/* 718 */                                                                                   if (!liOoi0ol0I1.I00000oIO(b5)) {
                                                                                            }
                                                                                        }
                                                                                    } else if (!liOoi0ol0I1.I00000oIO(b5)) {
                                                                                        break;
                                                                                    } else {
/* 733 */                                                                               cArr[i55] = (char) (((b4 & 63) << 6) | ((b3 & 15) << 12) | (b5 & 63));
/* 735 */                                                                               i52 = i58;
/* 737 */                                                                               i56 = i63;
/* 739 */                                                                               i54 = i64;
/* 741 */                                                                               i55 = i61;
                                                                                    }
                                                                                }
                                                                            } else {
/* 756 */                                                                       int i65 = i54;
/* 760 */                                                                       if (i56 >= i65 - 2) {
/* 860 */                                                                           throw new i1ioIilo10("Protocol message had invalid UTF-8.");
                                                                                }
/* 764 */                                                                       byte b6 = bArr3[i56];
/* 766 */                                                                       int i66 = i57 + 3;
/* 768 */                                                                       byte b7 = bArr3[i57 + 2];
/* 770 */                                                                       int i67 = i57 + 4;
/* 772 */                                                                       byte b8 = bArr3[i66];
/* 778 */                                                                       if (liOoi0ol0I1.I00000oIO(b6)) {
                                                                                    break;
                                                                                } else if ((((b6 + 112) + (b3 << 28)) >> 30) != 0 || liOoi0ol0I1.I00000oIO(b7) || liOoi0ol0I1.I00000oIO(b8)) {
                                                                                    break;
                                                                                } else {
/* 818 */                                                                           int i68 = ((b6 & 63) << 12) | ((b3 & 7) << 18) | ((b7 & 63) << 6) | (b8 & 63);
/* 826 */                                                                           cArr[i55] = (char) ((i68 >>> 10) + 55232);
/* 837 */                                                                           cArr[i55 + 1] = (char) ((i68 & 1023) + 56320);
/* 839 */                                                                           i55 += 2;
/* 841 */                                                                           i52 = i58;
/* 843 */                                                                           i56 = i67;
/* 845 */                                                                           i54 = i65;
                                                                                }
                                                                            }
                                                                        } else {
/* 620 */                                                                   if (i56 >= i54) {
/* 669 */                                                                       throw new i1ioIilo10("Protocol message had invalid UTF-8.");
                                                                            }
/* 622 */                                                                   int i69 = i55 + 1;
/* 624 */                                                                   int i70 = i57 + 2;
/* 626 */                                                                   byte b9 = bArr3[i56];
/* 632 */                                                                   if (b3 < -62 || liOoi0ol0I1.I00000oIO(b9)) {
                                                                                break;
                                                                            } else {
/* 648 */                                                                       cArr[i55] = (char) (((b3 & 31) << 6) | (b9 & 63));
/* 650 */                                                                       i52 = i58;
/* 652 */                                                                       i55 = i69;
/* 653 */                                                                       i56 = i70;
                                                                            }
                                                                        }
/* 655 */                                                               i47 = i60;
                                                                    }
                                                                }
/* 861 */                                                       i20 = i52;
/* 863 */                                                       int i71 = i54;
/* 865 */                                                       i17 = i47;
/* 870 */                                                       str = new String(cArr, 0, i55);
/* 873 */                                                       i1o1ll0i03.I0000Il00O = str;
/* 875 */                                                       iI0001Ioi1lo = i71;
                                                            }
/* 877 */                                                   i18 = i20;
                                                        } else {
/* 909 */                                                   i17 = i47;
/* 911 */                                                   iI0001Ioi1lo = liOO0oio.I0001Ioi1lo(bArr3, i15, i1o1ll0i03);
/* 915 */                                                   int i72 = i1o1ll0i03.I00000oIO;
/* 917 */                                                   if (i72 < 0) {
/* 964 */                                                       throw new i1ioIilo10("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                                            }
/* 919 */                                                   i18 = i14 | i46;
/* 921 */                                                   if (i72 == 0) {
/* 923 */                                                       i1o1ll0i03.I0000Il00O = "";
                                                            } else {
/* 930 */                                                       str = new String(bArr3, iI0001Ioi1lo, i72, i1io0O.I00000oIO);
/* 933 */                                                       i1o1ll0i03.I0000Il00O = str;
/* 935 */                                                       iI0001Ioi1lo += i72;
                                                            }
                                                        }
/* 936 */                                               unsafe2.putObject(obj3, j, str);
/* 939 */                                               bArr11 = bArr3;
/* 940 */                                               iI0000oI00 = iI0001Ioi1lo;
/* 941 */                                               i1o1ll0i010 = i1o1ll0i03;
/* 942 */                                               i37 = i18;
/* 943 */                                               obj5 = obj3;
/* 944 */                                               i35 = iI000iOII;
/* 945 */                                               i34 = i10;
/* 946 */                                               i36 = i17;
/* 948 */                                               iArr2 = iArr;
/* 950 */                                               i33 = i8;
/* 952 */                                               i39 = 1048575;
/* 955 */                                               i32 = i2;
                                                    }
                                                    break;
                                                case 9:
/* 428 */                                           i1o1ll0i05 = i1o1ll0i0;
/* 431 */                                           i10 = i41;
/* 433 */                                           int i73 = i13;
/* 437 */                                           if (i43 == 2) {
/* 439 */                                               i37 |= i46;
/* 442 */                                               Object objI00100l0 = I00100l0(iI000iOII, obj5);
/* 457 */                                               int iI000OiO = liOO0oio.I000OiO(objI00100l0, I000oI1ioi(iI000iOII), bArr, i73, i2, i1o1ll0i05);
/* 475 */                                               unsafe6.putObject(obj, I000lI(iI000iOII) & 1048575, objI00100l0);
/* 478 */                                               I001IIilI0O(iI000iOII, obj);
/* 481 */                                               i32 = i2;
/* 483 */                                               bArr11 = bArr;
/* 484 */                                               iI0000oI00 = iI000OiO;
/* 485 */                                               i1o1ll0i010 = i1o1ll0i05;
/* 486 */                                               obj5 = obj;
                                                        break;
                                                    } else {
/* 490 */                                               Object obj6 = obj5;
/* 491 */                                               i15 = i73;
/* 492 */                                               bArr4 = bArr;
/* 493 */                                               unsafe = unsafe5;
/* 494 */                                               obj4 = obj6;
/* 329 */                                               i14 = i37;
/* 331 */                                               i16 = i47;
/* 333 */                                               i1o1ll0i04 = i1o1ll0i05;
/* 1288 */                                              i37 = i14;
/* 1290 */                                              i4 = i3;
/* 1292 */                                              i9 = i15;
/* 1293 */                                              bArr2 = bArr4;
/* 1294 */                                              i1o1ll0i02 = i1o1ll0i04;
/* 1295 */                                              i35 = iI000iOII;
/* 1296 */                                              i5 = i38;
/* 1298 */                                              i7 = i16;
/* 1300 */                                              obj2 = obj4;
                                                        break;
                                                    }
                                                case 10:
/* 399 */                                           bArr5 = bArr;
/* 401 */                                           i1o1ll0i05 = i1o1ll0i0;
/* 403 */                                           unsafe4 = unsafe5;
/* 404 */                                           i10 = i41;
/* 408 */                                           i21 = i13;
/* 412 */                                           if (i43 == 2) {
/* 414 */                                               i37 |= i46;
/* 416 */                                               iI0000oI00 = liOO0oio.I00000oIO(bArr5, i21, i1o1ll0i05);
/* 422 */                                               unsafe4.putObject(obj5, j, i1o1ll0i05.I0000Il00O);
                                                        break;
                                                    }
/* 325 */                                           obj4 = obj5;
/* 326 */                                           unsafe = unsafe4;
/* 327 */                                           i15 = i21;
/* 328 */                                           bArr4 = bArr5;
/* 329 */                                           i14 = i37;
/* 331 */                                           i16 = i47;
/* 333 */                                           i1o1ll0i04 = i1o1ll0i05;
/* 1288 */                                          i37 = i14;
/* 1290 */                                          i4 = i3;
/* 1292 */                                          i9 = i15;
/* 1293 */                                          bArr2 = bArr4;
/* 1294 */                                          i1o1ll0i02 = i1o1ll0i04;
/* 1295 */                                          i35 = iI000iOII;
/* 1296 */                                          i5 = i38;
/* 1298 */                                          i7 = i16;
/* 1300 */                                          obj2 = obj4;
                                                    break;
                                                case 12:
/* 370 */                                           bArr5 = bArr;
/* 372 */                                           i1o1ll0i05 = i1o1ll0i0;
/* 374 */                                           unsafe4 = unsafe5;
/* 375 */                                           i10 = i41;
/* 379 */                                           i21 = i13;
/* 382 */                                           if (i43 == 0) {
/* 384 */                                               iI0000oI00 = liOO0oio.I0001Ioi1lo(bArr5, i21, i1o1ll0i05);
/* 388 */                                               int i74 = i1o1ll0i05.I00000oIO;
/* 390 */                                               I000o00OoI0I(iI000iOII);
/* 393 */                                               i37 |= i46;
/* 395 */                                               unsafe4.putInt(obj5, j, i74);
                                                        break;
                                                    }
/* 325 */                                           obj4 = obj5;
/* 326 */                                           unsafe = unsafe4;
/* 327 */                                           i15 = i21;
/* 328 */                                           bArr4 = bArr5;
/* 329 */                                           i14 = i37;
/* 331 */                                           i16 = i47;
/* 333 */                                           i1o1ll0i04 = i1o1ll0i05;
/* 1288 */                                          i37 = i14;
/* 1290 */                                          i4 = i3;
/* 1292 */                                          i9 = i15;
/* 1293 */                                          bArr2 = bArr4;
/* 1294 */                                          i1o1ll0i02 = i1o1ll0i04;
/* 1295 */                                          i35 = iI000iOII;
/* 1296 */                                          i5 = i38;
/* 1298 */                                          i7 = i16;
/* 1300 */                                          obj2 = obj4;
                                                    break;
                                                case 15:
/* 336 */                                           bArr5 = bArr;
/* 338 */                                           i1o1ll0i05 = i1o1ll0i0;
/* 340 */                                           unsafe4 = unsafe5;
/* 341 */                                           i10 = i41;
/* 345 */                                           i21 = i13;
/* 348 */                                           if (i43 == 0) {
/* 350 */                                               i37 |= i46;
/* 352 */                                               iI0000oI00 = liOO0oio.I0001Ioi1lo(bArr5, i21, i1o1ll0i05);
/* 356 */                                               int i75 = i1o1ll0i05.I00000oIO;
/* 364 */                                               unsafe4.putInt(obj5, j, (i75 >>> 1) ^ (-(i75 & 1)));
                                                        break;
                                                    }
/* 325 */                                           obj4 = obj5;
/* 326 */                                           unsafe = unsafe4;
/* 327 */                                           i15 = i21;
/* 328 */                                           bArr4 = bArr5;
/* 329 */                                           i14 = i37;
/* 331 */                                           i16 = i47;
/* 333 */                                           i1o1ll0i04 = i1o1ll0i05;
/* 1288 */                                          i37 = i14;
/* 1290 */                                          i4 = i3;
/* 1292 */                                          i9 = i15;
/* 1293 */                                          bArr2 = bArr4;
/* 1294 */                                          i1o1ll0i02 = i1o1ll0i04;
/* 1295 */                                          i35 = iI000iOII;
/* 1296 */                                          i5 = i38;
/* 1298 */                                          i7 = i16;
/* 1300 */                                          obj2 = obj4;
                                                    break;
                                                case 16:
/* 277 */                                           bArr5 = bArr;
/* 281 */                                           i21 = i13;
/* 284 */                                           if (i43 == 0) {
/* 286 */                                               i37 |= i46;
/* 288 */                                               int iI000O01llI04 = liOO0oio.I000O01llI0(bArr5, i21, i1o1ll0i0);
/* 292 */                                               long j2 = i1o1ll0i0.I00000oOI;
/* 301 */                                               obj5 = obj;
/* 303 */                                               i1o1ll0i05 = i1o1ll0i0;
/* 305 */                                               i10 = i41;
/* 309 */                                               unsafe5.putLong(obj5, j, (j2 >>> 1) ^ (-(j2 & 1)));
/* 312 */                                               i32 = i2;
/* 314 */                                               iI0000oI00 = iI000O01llI04;
                                                        break;
                                                    } else {
/* 321 */                                               i1o1ll0i05 = i1o1ll0i0;
/* 322 */                                               unsafe4 = unsafe5;
/* 323 */                                               i10 = i41;
/* 325 */                                               obj4 = obj5;
/* 326 */                                               unsafe = unsafe4;
/* 327 */                                               i15 = i21;
/* 328 */                                               bArr4 = bArr5;
/* 329 */                                               i14 = i37;
/* 331 */                                               i16 = i47;
/* 333 */                                               i1o1ll0i04 = i1o1ll0i05;
/* 1288 */                                              i37 = i14;
/* 1290 */                                              i4 = i3;
/* 1292 */                                              i9 = i15;
/* 1293 */                                              bArr2 = bArr4;
/* 1294 */                                              i1o1ll0i02 = i1o1ll0i04;
/* 1295 */                                              i35 = iI000iOII;
/* 1296 */                                              i5 = i38;
/* 1298 */                                              i7 = i16;
/* 1300 */                                              obj2 = obj4;
                                                        break;
                                                    }
                                                default:
/* 197 */                                           if (i43 == 3) {
/* 201 */                                               Object objI00100l02 = I00100l0(iI000iOII, obj5);
/* 222 */                                               int iI000OOo1O = liOO0oio.I000OOo1O(objI00100l02, I000oI1ioi(iI000iOII), bArr, i13, i2, (i41 << 3) | 4, i1o1ll0i0);
/* 239 */                                               unsafe6.putObject(obj5, I000lI(iI000iOII) & 1048575, objI00100l02);
/* 242 */                                               I001IIilI0O(iI000iOII, obj5);
/* 245 */                                               i32 = i2;
/* 247 */                                               i1o1ll0i010 = i1o1ll0i0;
/* 248 */                                               iI0000oI00 = iI000OOo1O;
/* 249 */                                               bArr11 = bArr;
/* 199 */                                               i37 |= i46;
/* 251 */                                               i36 = i47;
/* 252 */                                               i35 = iI000iOII;
/* 253 */                                               i34 = i41;
                                                        break;
                                                    } else {
/* 261 */                                               bArr4 = bArr;
/* 263 */                                               obj4 = obj5;
/* 264 */                                               i14 = i37;
/* 266 */                                               i16 = i47;
/* 268 */                                               unsafe = unsafe5;
/* 269 */                                               i10 = i41;
/* 271 */                                               i15 = i13;
/* 273 */                                               i1o1ll0i04 = i1o1ll0i0;
/* 1288 */                                              i37 = i14;
/* 1290 */                                              i4 = i3;
/* 1292 */                                              i9 = i15;
/* 1293 */                                              bArr2 = bArr4;
/* 1294 */                                              i1o1ll0i02 = i1o1ll0i04;
/* 1295 */                                              i35 = iI000iOII;
/* 1296 */                                              i5 = i38;
/* 1298 */                                              i7 = i16;
/* 1300 */                                              obj2 = obj4;
                                                        break;
                                                    }
                                            }
                                        } else {
/* 1311 */                                  i7 = i36;
/* 1313 */                                  int i76 = iI000II;
/* 1318 */                                  Object obj7 = obj5;
/* 1319 */                                  unsafe = unsafe5;
/* 1324 */                                  int i77 = i37;
/* 1328 */                                  if (iI000l1 != 27) {
/* 1411 */                                      obj2 = obj7;
/* 1412 */                                      i5 = i38;
/* 1416 */                                      if (iI000l1 <= 49) {
                                                    long j3 = i44;
/* 1425 */                                          i1iliO0I i1ilio0iI00000oOI = (i1iliO0I) unsafe.getObject(obj2, j);
/* 1434 */                                          if (!((i1o10iIooI) i1ilio0iI00000oOI).I00iOIl) {
/* 1436 */                                              int size = i1ilio0iI00000oOI.size();
/* 1443 */                                              i1ilio0iI00000oOI = ((i1o10iIooI) i1ilio0iI00000oOI).I00000oOI(size + size);
/* 1447 */                                              unsafe.putObject(obj2, j, i1ilio0iI00000oOI);
                                                    }
                                                    switch (iI000l1) {
                                                        case PoseLandmark.RIGHT_PINKY:
                                                        case InputImage.IMAGE_FORMAT_YUV_420_888:
/* 2153 */                                                  bArr7 = bArr;
/* 2155 */                                                  i1o1ll0i07 = i1o1ll0i0;
/* 2157 */                                                  i27 = iI000iOII;
/* 2159 */                                                  i28 = i41;
/* 2161 */                                                  i29 = i76;
/* 2166 */                                                  if (i43 == 2) {
/* 2215 */                                                      OIiilo1Ool0o.I00000oIO();
/* 2164 */                                                      return 0;
                                                            }
/* 2169 */                                                  if (i43 == 1) {
/* 2211 */                                                      OIiilo1Ool0o.I00000oIO();
/* 2164 */                                                      return 0;
                                                            }
/* 2171 */                                                  iI0000oI00 = i29;
/* 2172 */                                                  if (iI0000oI00 != i29) {
/* 2198 */                                                      i4 = i3;
/* 2200 */                                                      i9 = iI0000oI00;
/* 2201 */                                                      bArr2 = bArr7;
/* 2202 */                                                      i1o1ll0i02 = i1o1ll0i07;
/* 2203 */                                                      i35 = i27;
/* 2205 */                                                      i37 = i77;
/* 2207 */                                                      i10 = i28;
                                                                break;
                                                            } else {
/* 2174 */                                                      i32 = i2;
/* 2176 */                                                      bArr11 = bArr7;
/* 2177 */                                                      i1o1ll0i010 = i1o1ll0i07;
/* 2178 */                                                      obj5 = obj2;
/* 2179 */                                                      i35 = i27;
/* 2181 */                                                      i36 = i7;
/* 2183 */                                                      i37 = i77;
/* 2185 */                                                      i34 = i28;
/* 2187 */                                                      iArr2 = iArr;
/* 2189 */                                                      i39 = 1048575;
/* 2192 */                                                      i38 = i5;
/* 2194 */                                                      i33 = i8;
                                                            }
                                                        case PoseLandmark.LEFT_INDEX:
                                                        case 36:
/* 2126 */                                                  bArr7 = bArr;
/* 2128 */                                                  i1o1ll0i07 = i1o1ll0i0;
/* 2130 */                                                  i27 = iI000iOII;
/* 2132 */                                                  i28 = i41;
/* 2134 */                                                  i29 = i76;
/* 2139 */                                                  if (i43 == 2) {
/* 2149 */                                                      OIiilo1Ool0o.I00000oIO();
/* 2137 */                                                      return 0;
                                                            }
/* 2142 */                                                  if (i43 == 5) {
/* 2145 */                                                      OIiilo1Ool0o.I00000oIO();
/* 2137 */                                                      return 0;
                                                            }
/* 2171 */                                                  iI0000oI00 = i29;
/* 2172 */                                                  if (iI0000oI00 != i29) {
                                                            }
                                                            break;
                                                        case PoseLandmark.RIGHT_INDEX:
                                                        case PoseLandmark.LEFT_THUMB:
                                                        case 37:
                                                        case 38:
/* 2100 */                                                  bArr7 = bArr;
/* 2102 */                                                  i1o1ll0i07 = i1o1ll0i0;
/* 2104 */                                                  i27 = iI000iOII;
/* 2106 */                                                  i28 = i41;
/* 2108 */                                                  i29 = i76;
/* 2113 */                                                  if (i43 == 2) {
/* 2122 */                                                      OIiilo1Ool0o.I00000oIO();
/* 2111 */                                                      return 0;
                                                            }
/* 2115 */                                                  if (i43 == 0) {
/* 2118 */                                                      OIiilo1Ool0o.I00000oIO();
/* 2111 */                                                      return 0;
                                                            }
/* 2171 */                                                  iI0000oI00 = i29;
/* 2172 */                                                  if (iI0000oI00 != i29) {
                                                            }
                                                            break;
                                                        case PoseLandmark.RIGHT_THUMB:
                                                        case PoseLandmark.LEFT_HEEL:
                                                        case 39:
                                                        case 43:
/* 2074 */                                                  bArr7 = bArr;
/* 2076 */                                                  i1o1ll0i07 = i1o1ll0i0;
/* 2078 */                                                  i27 = iI000iOII;
/* 2080 */                                                  i28 = i41;
/* 2082 */                                                  i29 = i76;
/* 2087 */                                                  if (i43 == 2) {
/* 2096 */                                                      OIiilo1Ool0o.I00000oIO();
/* 2085 */                                                      return 0;
                                                            }
/* 2089 */                                                  if (i43 == 0) {
/* 2092 */                                                      OIiilo1Ool0o.I00000oIO();
/* 2085 */                                                      return 0;
                                                            }
/* 2171 */                                                  iI0000oI00 = i29;
/* 2172 */                                                  if (iI0000oI00 != i29) {
                                                            }
                                                            break;
                                                        case PoseLandmark.LEFT_HIP:
                                                        case 32:
                                                        case 40:
                                                        case 46:
/* 2046 */                                                  bArr7 = bArr;
/* 2048 */                                                  i1o1ll0i07 = i1o1ll0i0;
/* 2050 */                                                  i27 = iI000iOII;
/* 2052 */                                                  i28 = i41;
/* 2054 */                                                  i29 = i76;
/* 2059 */                                                  if (i43 == 2) {
/* 2070 */                                                      OIiilo1Ool0o.I00000oIO();
/* 2057 */                                                      return 0;
                                                            }
/* 2062 */                                                  if (i43 == 1) {
/* 2066 */                                                      OIiilo1Ool0o.I00000oIO();
/* 2057 */                                                      return 0;
                                                            }
/* 2171 */                                                  iI0000oI00 = i29;
/* 2172 */                                                  if (iI0000oI00 != i29) {
                                                            }
                                                            break;
                                                        case PoseLandmark.RIGHT_HIP:
                                                        case PoseLandmark.LEFT_FOOT_INDEX:
                                                        case 41:
                                                        case BuildConfig.VERSION_CODE:
/* 2018 */                                                  bArr7 = bArr;
/* 2020 */                                                  i1o1ll0i07 = i1o1ll0i0;
/* 2022 */                                                  i27 = iI000iOII;
/* 2024 */                                                  i28 = i41;
/* 2026 */                                                  i29 = i76;
/* 2031 */                                                  if (i43 == 2) {
/* 2042 */                                                      OIiilo1Ool0o.I00000oIO();
/* 2029 */                                                      return 0;
                                                            }
/* 2034 */                                                  if (i43 == 5) {
/* 2038 */                                                      OIiilo1Ool0o.I00000oIO();
/* 2029 */                                                      return 0;
                                                            }
/* 2171 */                                                  iI0000oI00 = i29;
/* 2172 */                                                  if (iI0000oI00 != i29) {
                                                            }
                                                            break;
                                                        case PoseLandmark.LEFT_KNEE:
                                                        case 42:
/* 1989 */                                                  bArr7 = bArr;
/* 1991 */                                                  i1o1ll0i07 = i1o1ll0i0;
/* 1993 */                                                  i27 = iI000iOII;
/* 1995 */                                                  i28 = i41;
/* 1997 */                                                  i29 = i76;
/* 2000 */                                                  if (i43 == 2) {
/* 2014 */                                                      OIiilo1Ool0o.I00000oIO();
/* 2012 */                                                      return 0;
                                                            }
/* 2002 */                                                  if (i43 == 0) {
/* 2006 */                                                      OIiilo1Ool0o.I00000oIO();
/* 2009 */                                                      return 0;
                                                            }
/* 2171 */                                                  iI0000oI00 = i29;
/* 2172 */                                                  if (iI0000oI00 != i29) {
                                                            }
                                                            break;
                                                        case PoseLandmark.RIGHT_KNEE:
/* 1780 */                                                  bArr7 = bArr;
/* 1782 */                                                  int i78 = i2;
/* 1784 */                                                  i1o1ll0i07 = i1o1ll0i0;
/* 1786 */                                                  i1iliO0I i1ilio0i = i1ilio0iI00000oOI;
/* 1787 */                                                  i29 = i76;
/* 1790 */                                                  if (i43 == 2) {
/* 1799 */                                                      if ((j3 & 536870912) == 0) {
/* 1801 */                                                          iI0000oI00 = liOO0oio.I0001Ioi1lo(bArr7, i29, i1o1ll0i07);
/* 1805 */                                                          int i79 = i1o1ll0i07.I00000oIO;
/* 1807 */                                                          if (i79 < 0) {
/* 1876 */                                                              throw new i1ioIilo10("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                                                    }
/* 1809 */                                                          if (i79 == 0) {
/* 1811 */                                                              i1ilio0i.add("");
/* 1814 */                                                              i27 = iI000iOII;
                                                                    } else {
/* 1819 */                                                              i27 = iI000iOII;
/* 1826 */                                                              i1ilio0i.add(new String(bArr7, iI0000oI00, i79, i1io0O.I00000oIO));
/* 1829 */                                                              iI0000oI00 += i79;
                                                                    }
/* 1830 */                                                          while (iI0000oI00 < i78) {
/* 1832 */                                                              int iI0001Ioi1lo4 = liOO0oio.I0001Ioi1lo(bArr7, iI0000oI00, i1o1ll0i07);
/* 1838 */                                                              if (i5 == i1o1ll0i07.I00000oIO) {
/* 1840 */                                                                  iI0000oI00 = liOO0oio.I0001Ioi1lo(bArr7, iI0001Ioi1lo4, i1o1ll0i07);
/* 1844 */                                                                  int i80 = i1o1ll0i07.I00000oIO;
/* 1846 */                                                                  if (i80 < 0) {
/* 1870 */                                                                      throw new i1ioIilo10("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                                                            }
/* 1848 */                                                                  if (i80 == 0) {
/* 1850 */                                                                      i1ilio0i.add("");
                                                                            } else {
/* 1861 */                                                                      i1ilio0i.add(new String(bArr7, iI0000oI00, i80, i1io0O.I00000oIO));
/* 1829 */                                                                      iI0000oI00 += i80;
                                                                            }
                                                                        } else {
/* 1528 */                                                                  i28 = i41;
/* 2172 */                                                                  if (iI0000oI00 != i29) {
                                                                            }
                                                                        }
                                                                    }
/* 1528 */                                                          i28 = i41;
/* 2172 */                                                          if (iI0000oI00 != i29) {
                                                                    }
                                                                } else {
/* 1877 */                                                          i27 = iI000iOII;
/* 1879 */                                                          iI0000oI00 = liOO0oio.I0001Ioi1lo(bArr7, i29, i1o1ll0i07);
/* 1883 */                                                          int i81 = i1o1ll0i07.I00000oIO;
/* 1885 */                                                          if (i81 < 0) {
/* 1988 */                                                              throw new i1ioIilo10("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                                                    }
/* 1887 */                                                          if (i81 == 0) {
/* 1889 */                                                              i1ilio0i.add("");
/* 1892 */                                                              i28 = i41;
                                                                    } else {
/* 1895 */                                                              int i82 = iI0000oI00 + i81;
/* 1901 */                                                              if (!i1oooOlO100I.I00000oOI(bArr7, iI0000oI00, i82)) {
/* 1982 */                                                                  throw new i1ioIilo10("Protocol message had invalid UTF-8.");
                                                                        }
/* 1907 */                                                              i28 = i41;
/* 1914 */                                                              i1ilio0i.add(new String(bArr7, iI0000oI00, i81, i1io0O.I00000oIO));
/* 1917 */                                                              iI0000oI00 = i82;
                                                                    }
/* 1919 */                                                          while (iI0000oI00 < i78) {
/* 1921 */                                                              int iI0001Ioi1lo5 = liOO0oio.I0001Ioi1lo(bArr7, iI0000oI00, i1o1ll0i07);
/* 1927 */                                                              if (i5 == i1o1ll0i07.I00000oIO) {
/* 1929 */                                                                  iI0000oI00 = liOO0oio.I0001Ioi1lo(bArr7, iI0001Ioi1lo5, i1o1ll0i07);
/* 1933 */                                                                  int i83 = i1o1ll0i07.I00000oIO;
/* 1935 */                                                                  if (i83 < 0) {
/* 1976 */                                                                      throw new i1ioIilo10("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                                                            }
/* 1937 */                                                                  if (i83 == 0) {
/* 1939 */                                                                      i1ilio0i.add("");
                                                                            } else {
/* 1943 */                                                                      int i84 = iI0000oI00 + i83;
/* 1949 */                                                                      if (!i1oooOlO100I.I00000oOI(bArr7, iI0000oI00, i84)) {
/* 1970 */                                                                          throw new i1ioIilo10("Protocol message had invalid UTF-8.");
                                                                                }
/* 1958 */                                                                      i1ilio0i.add(new String(bArr7, iI0000oI00, i83, i1io0O.I00000oIO));
/* 1961 */                                                                      i78 = i2;
/* 1963 */                                                                      iI0000oI00 = i84;
                                                                            }
                                                                        } else if (iI0000oI00 != i29) {
                                                                        }
                                                                    }
/* 2172 */                                                          if (iI0000oI00 != i29) {
                                                                    }
                                                                }
                                                            }
/* 1566 */                                                  i27 = iI000iOII;
/* 1568 */                                                  i28 = i41;
/* 2171 */                                                  iI0000oI00 = i29;
/* 2172 */                                                  if (iI0000oI00 != i29) {
                                                            }
                                                            break;
                                                        case 27:
/* 1750 */                                                  i1o1ll0i08 = i1o1ll0i0;
/* 1752 */                                                  i30 = i76;
/* 1755 */                                                  if (i43 == 2) {
/* 1766 */                                                      iI0000oI00 = liOO0oio.I0000O(I000oI1ioi(iI000iOII), i5, bArr, i30, i2, i1ilio0iI00000oOI, i1o1ll0i08);
/* 1770 */                                                      bArr7 = bArr;
/* 1771 */                                                      i29 = i30;
/* 1773 */                                                      i1o1ll0i07 = i1o1ll0i08;
/* 1526 */                                                      i27 = iI000iOII;
/* 1528 */                                                      i28 = i41;
/* 2172 */                                                      if (iI0000oI00 != i29) {
                                                                }
                                                            } else {
/* 1776 */                                                      bArr7 = bArr;
/* 1564 */                                                      i1o1ll0i07 = i1o1ll0i08;
/* 1565 */                                                      i29 = i30;
/* 1566 */                                                      i27 = iI000iOII;
/* 1568 */                                                      i28 = i41;
/* 2171 */                                                      iI0000oI00 = i29;
/* 2172 */                                                      if (iI0000oI00 != i29) {
                                                                }
                                                            }
                                                            break;
                                                        case PoseLandmark.RIGHT_ANKLE:
/* 1639 */                                                  bArr8 = bArr;
/* 1643 */                                                  i1o1ll0i08 = i1o1ll0i0;
/* 1645 */                                                  i30 = i76;
/* 1648 */                                                  if (i43 == 2) {
/* 1650 */                                                      iI0000oI00 = liOO0oio.I0001Ioi1lo(bArr8, i30, i1o1ll0i08);
/* 1654 */                                                      int i85 = i1o1ll0i08.I00000oIO;
/* 1656 */                                                      if (i85 < 0) {
/* 1745 */                                                          throw new i1ioIilo10("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                                                }
/* 1662 */                                                      if (i85 > bArr8.length - iI0000oI00) {
/* 1739 */                                                          throw new i1ioIilo10("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                                                }
/* 1664 */                                                      if (i85 == 0) {
/* 1668 */                                                          i1ilio0iI00000oOI.add(i1OOli0lO.I00iiO);
                                                                } else {
/* 1676 */                                                          i1ilio0iI00000oOI.add(i1OOli0lO.I000OOo1O(bArr8, iI0000oI00, i85));
/* 1679 */                                                          iI0000oI00 += i85;
                                                                }
/* 1680 */                                                      while (iI0000oI00 < i2) {
/* 1682 */                                                          int iI0001Ioi1lo6 = liOO0oio.I0001Ioi1lo(bArr8, iI0000oI00, i1o1ll0i08);
/* 1688 */                                                          if (i5 == i1o1ll0i08.I00000oIO) {
/* 1690 */                                                              iI0000oI00 = liOO0oio.I0001Ioi1lo(bArr8, iI0001Ioi1lo6, i1o1ll0i08);
/* 1694 */                                                              int i86 = i1o1ll0i08.I00000oIO;
/* 1696 */                                                              if (i86 < 0) {
/* 1729 */                                                                  throw new i1ioIilo10("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                                                        }
/* 1700 */                                                              if (i86 > bArr8.length - iI0000oI00) {
/* 1723 */                                                                  throw new i1ioIilo10("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                                                        }
/* 1702 */                                                              if (i86 == 0) {
/* 1706 */                                                                  i1ilio0iI00000oOI.add(i1OOli0lO.I00iiO);
                                                                        } else {
/* 1714 */                                                                  i1ilio0iI00000oOI.add(i1OOli0lO.I000OOo1O(bArr8, iI0000oI00, i86));
/* 1679 */                                                                  iI0000oI00 += i86;
                                                                        }
                                                                    } else {
/* 1730 */                                                              bArr7 = bArr8;
/* 1731 */                                                              i1o1ll0i07 = i1o1ll0i08;
/* 1525 */                                                              i29 = i30;
/* 1526 */                                                              i27 = iI000iOII;
/* 1528 */                                                              i28 = i41;
/* 2172 */                                                              if (iI0000oI00 != i29) {
                                                                        }
                                                                    }
                                                                }
/* 1730 */                                                      bArr7 = bArr8;
/* 1731 */                                                      i1o1ll0i07 = i1o1ll0i08;
/* 1525 */                                                      i29 = i30;
/* 1526 */                                                      i27 = iI000iOII;
/* 1528 */                                                      i28 = i41;
/* 2172 */                                                      if (iI0000oI00 != i29) {
                                                                }
                                                            }
/* 1563 */                                                  bArr7 = bArr8;
/* 1564 */                                                  i1o1ll0i07 = i1o1ll0i08;
/* 1565 */                                                  i29 = i30;
/* 1566 */                                                  i27 = iI000iOII;
/* 1568 */                                                  i28 = i41;
/* 2171 */                                                  iI0000oI00 = i29;
/* 2172 */                                                  if (iI0000oI00 != i29) {
                                                            }
                                                            break;
                                                        case 30:
                                                        case 44:
/* 1615 */                                                  bArr9 = bArr;
/* 1619 */                                                  i1o1ll0i09 = i1o1ll0i0;
/* 1621 */                                                  i31 = i76;
/* 1626 */                                                  if (i43 == 2) {
/* 1635 */                                                      OIiilo1Ool0o.I00000oIO();
/* 1624 */                                                      return 0;
                                                            }
/* 1628 */                                                  if (i43 == 0) {
/* 1631 */                                                      OIiilo1Ool0o.I00000oIO();
/* 1624 */                                                      return 0;
                                                            }
/* 1598 */                                                  bArr7 = bArr9;
/* 1599 */                                                  i1o1ll0i07 = i1o1ll0i09;
/* 1600 */                                                  i29 = i31;
/* 1601 */                                                  i27 = iI000iOII;
/* 1603 */                                                  i28 = i41;
/* 2171 */                                                  iI0000oI00 = i29;
/* 2172 */                                                  if (iI0000oI00 != i29) {
                                                            }
                                                            break;
                                                        case 33:
                                                        case 47:
/* 1583 */                                                  bArr9 = bArr;
/* 1587 */                                                  i1o1ll0i09 = i1o1ll0i0;
/* 1589 */                                                  i31 = i76;
/* 1594 */                                                  if (i43 == 2) {
/* 1611 */                                                      OIiilo1Ool0o.I00000oIO();
/* 1592 */                                                      return 0;
                                                            }
/* 1596 */                                                  if (i43 == 0) {
/* 1607 */                                                      OIiilo1Ool0o.I00000oIO();
/* 1592 */                                                      return 0;
                                                            }
/* 1598 */                                                  bArr7 = bArr9;
/* 1599 */                                                  i1o1ll0i07 = i1o1ll0i09;
/* 1600 */                                                  i29 = i31;
/* 1601 */                                                  i27 = iI000iOII;
/* 1603 */                                                  i28 = i41;
/* 2171 */                                                  iI0000oI00 = i29;
/* 2172 */                                                  if (iI0000oI00 != i29) {
                                                            }
                                                            break;
                                                        case 34:
                                                        case 48:
/* 1550 */                                                  bArr8 = bArr;
/* 1554 */                                                  i1o1ll0i08 = i1o1ll0i0;
/* 1556 */                                                  i30 = i76;
/* 1559 */                                                  if (i43 == 2) {
/* 1579 */                                                      OIiilo1Ool0o.I00000oIO();
/* 1577 */                                                      return 0;
                                                            }
/* 1561 */                                                  if (i43 == 0) {
/* 1571 */                                                      OIiilo1Ool0o.I00000oIO();
/* 1574 */                                                      return 0;
                                                            }
/* 1563 */                                                  bArr7 = bArr8;
/* 1564 */                                                  i1o1ll0i07 = i1o1ll0i08;
/* 1565 */                                                  i29 = i30;
/* 1566 */                                                  i27 = iI000iOII;
/* 1568 */                                                  i28 = i41;
/* 2171 */                                                  iI0000oI00 = i29;
/* 2172 */                                                  if (iI0000oI00 != i29) {
                                                            }
                                                            break;
                                                        default:
/* 1454 */                                                  if (i43 == 3) {
/* 1458 */                                                      int i87 = (i5 & (-8)) | 4;
/* 1460 */                                                      i1o1Oo i1o1ooI000oI1ioi = I000oI1ioi(iI000iOII);
/* 1472 */                                                      int iI0000Il00O = liOO0oio.I0000Il00O(i1o1ooI000oI1ioi, bArr, i76, i2, i87, i1o1ll0i0);
/* 1476 */                                                      i1o1Oo i1o1oo = i1o1ooI000oI1ioi;
/* 1477 */                                                      i30 = i76;
/* 1478 */                                                      int i88 = i87;
/* 1479 */                                                      int i89 = i2;
/* 1482 */                                                      i1ilio0iI00000oOI.add(i1o1ll0i0.I0000Il00O);
                                                                while (true) {
/* 1485 */                                                          if (iI0000Il00O < i89) {
/* 1487 */                                                              int i90 = i88;
/* 1488 */                                                              i1o1Oo i1o1oo2 = i1o1oo;
/* 1491 */                                                              int iI0001Ioi1lo7 = liOO0oio.I0001Ioi1lo(bArr, iI0000Il00O, i1o1ll0i0);
/* 1497 */                                                              if (i5 == i1o1ll0i0.I00000oIO) {
/* 1501 */                                                                  iI0000Il00O = liOO0oio.I0000Il00O(i1o1oo2, bArr, iI0001Ioi1lo7, i2, i90, i1o1ll0i0);
/* 1508 */                                                                  i1ilio0iI00000oOI.add(i1o1ll0i0.I0000Il00O);
/* 1511 */                                                                  i1o1oo = i1o1oo2;
/* 1512 */                                                                  i88 = i90;
/* 1513 */                                                                  i89 = i2;
                                                                        } else {
/* 1517 */                                                                  bArr10 = bArr;
                                                                        }
                                                                    } else {
/* 1519 */                                                              bArr10 = bArr;
                                                                    }
                                                                }
/* 1522 */                                                      bArr7 = bArr10;
/* 1523 */                                                      i1o1ll0i07 = i1o1ll0i0;
/* 1524 */                                                      iI0000oI00 = iI0000Il00O;
/* 1525 */                                                      i29 = i30;
/* 1526 */                                                      i27 = iI000iOII;
/* 1528 */                                                      i28 = i41;
/* 2172 */                                                      if (iI0000oI00 != i29) {
                                                                }
                                                            } else {
/* 1536 */                                                      bArr7 = bArr;
/* 1538 */                                                      i1o1ll0i07 = i1o1ll0i0;
/* 1540 */                                                      i27 = iI000iOII;
/* 1542 */                                                      i28 = i41;
/* 1544 */                                                      i29 = i76;
/* 2171 */                                                      iI0000oI00 = i29;
/* 2172 */                                                      if (iI0000oI00 != i29) {
                                                                }
                                                            }
                                                            break;
                                                    }
                                                } else {
/* 2219 */                                          bArr6 = bArr;
/* 2221 */                                          i23 = iI000iOII;
/* 2223 */                                          i22 = i41;
/* 2229 */                                          if (iI000l1 != 50) {
/* 2310 */                                              long j4 = iArr[i23 + 2] & 1048575;
                                                        switch (iI000l1) {
                                                            case 51:
/* 2859 */                                                      bArr2 = bArr;
/* 2861 */                                                      i1o1ll0i02 = i1o1ll0i0;
/* 2863 */                                                      i10 = i22;
/* 2865 */                                                      i24 = i76;
/* 2868 */                                                      if (i43 == 1) {
/* 2870 */                                                          iI0001Ioi1lo2 = i24 + 8;
/* 2884 */                                                          unsafe.putObject(obj2, j, Double.valueOf(Double.longBitsToDouble(liOO0oio.I000iOII(i24, bArr2))));
/* 2887 */                                                          unsafe.putInt(obj2, j4, i10);
/* 2740 */                                                          iI0000oI00 = iI0001Ioi1lo2;
/* 2893 */                                                          if (iI0000oI00 != i24) {
/* 2914 */                                                              i4 = i3;
/* 2916 */                                                              i9 = iI0000oI00;
/* 2917 */                                                              i35 = i23;
/* 2919 */                                                              i37 = i77;
                                                                        break;
                                                                    } else {
/* 2895 */                                                              bArr11 = bArr2;
/* 2896 */                                                              i1o1ll0i010 = i1o1ll0i02;
/* 2897 */                                                              obj5 = obj2;
/* 2898 */                                                              i34 = i10;
/* 2899 */                                                              i35 = i23;
/* 2901 */                                                              i36 = i7;
/* 2903 */                                                              i37 = i77;
/* 2905 */                                                              iArr2 = iArr;
/* 2907 */                                                              i39 = 1048575;
/* 2910 */                                                              i32 = i2;
/* 2192 */                                                              i38 = i5;
/* 2194 */                                                              i33 = i8;
                                                                    }
                                                                }
/* 2892 */                                                      iI0000oI00 = i24;
/* 2893 */                                                      if (iI0000oI00 != i24) {
                                                                }
                                                            case 52:
/* 2827 */                                                      bArr2 = bArr;
/* 2829 */                                                      i1o1ll0i02 = i1o1ll0i0;
/* 2831 */                                                      i10 = i22;
/* 2833 */                                                      i24 = i76;
/* 2836 */                                                      if (i43 == 5) {
/* 2838 */                                                          iI0001Ioi1lo2 = i24 + 4;
/* 2852 */                                                          unsafe.putObject(obj2, j, Float.valueOf(Float.intBitsToFloat(liOO0oio.I00000oOI(i24, bArr2))));
/* 2855 */                                                          unsafe.putInt(obj2, j4, i10);
/* 2740 */                                                          iI0000oI00 = iI0001Ioi1lo2;
/* 2893 */                                                          if (iI0000oI00 != i24) {
                                                                    }
                                                                }
/* 2892 */                                                      iI0000oI00 = i24;
/* 2893 */                                                      if (iI0000oI00 != i24) {
                                                                }
                                                                break;
                                                            case 53:
                                                            case 54:
/* 2798 */                                                      bArr2 = bArr;
/* 2800 */                                                      i1o1ll0i02 = i1o1ll0i0;
/* 2802 */                                                      i10 = i22;
/* 2804 */                                                      i24 = i76;
/* 2806 */                                                      if (i43 == 0) {
/* 2808 */                                                          iI000O01llI02 = liOO0oio.I000O01llI0(bArr2, i24, i1o1ll0i02);
/* 2820 */                                                          unsafe.putObject(obj2, j, Long.valueOf(i1o1ll0i02.I00000oOI));
/* 2823 */                                                          unsafe.putInt(obj2, j4, i10);
/* 2709 */                                                          iI0000oI00 = iI000O01llI02;
/* 2893 */                                                          if (iI0000oI00 != i24) {
                                                                    }
                                                                }
/* 2892 */                                                      iI0000oI00 = i24;
/* 2893 */                                                      if (iI0000oI00 != i24) {
                                                                }
                                                                break;
                                                            case 55:
                                                            case 62:
/* 2771 */                                                      bArr2 = bArr;
/* 2773 */                                                      i1o1ll0i02 = i1o1ll0i0;
/* 2775 */                                                      i10 = i22;
/* 2777 */                                                      i24 = i76;
/* 2779 */                                                      if (i43 == 0) {
/* 2781 */                                                          iI0001Ioi1lo2 = liOO0oio.I0001Ioi1lo(bArr2, i24, i1o1ll0i02);
/* 2791 */                                                          unsafe.putObject(obj2, j, Integer.valueOf(i1o1ll0i02.I00000oIO));
/* 2794 */                                                          unsafe.putInt(obj2, j4, i10);
/* 2740 */                                                          iI0000oI00 = iI0001Ioi1lo2;
/* 2893 */                                                          if (iI0000oI00 != i24) {
                                                                    }
                                                                }
/* 2892 */                                                      iI0000oI00 = i24;
/* 2893 */                                                      if (iI0000oI00 != i24) {
                                                                }
                                                                break;
                                                            case 56:
                                                            case 65:
/* 2743 */                                                      bArr2 = bArr;
/* 2745 */                                                      i1o1ll0i02 = i1o1ll0i0;
/* 2747 */                                                      i10 = i22;
/* 2749 */                                                      i24 = i76;
/* 2752 */                                                      if (i43 == 1) {
/* 2754 */                                                          iI0001Ioi1lo2 = i24 + 8;
/* 2764 */                                                          unsafe.putObject(obj2, j, Long.valueOf(liOO0oio.I000iOII(i24, bArr2)));
/* 2767 */                                                          unsafe.putInt(obj2, j4, i10);
/* 2740 */                                                          iI0000oI00 = iI0001Ioi1lo2;
/* 2893 */                                                          if (iI0000oI00 != i24) {
                                                                    }
                                                                }
/* 2892 */                                                      iI0000oI00 = i24;
/* 2893 */                                                      if (iI0000oI00 != i24) {
                                                                }
                                                                break;
                                                            case 57:
                                                            case Barcode.FORMAT_EAN_8:
/* 2713 */                                                      bArr2 = bArr;
/* 2715 */                                                      i1o1ll0i02 = i1o1ll0i0;
/* 2717 */                                                      i10 = i22;
/* 2719 */                                                      i24 = i76;
/* 2722 */                                                      if (i43 == 5) {
/* 2724 */                                                          iI0001Ioi1lo2 = i24 + 4;
/* 2734 */                                                          unsafe.putObject(obj2, j, Integer.valueOf(liOO0oio.I00000oOI(i24, bArr2)));
/* 2737 */                                                          unsafe.putInt(obj2, j4, i10);
/* 2740 */                                                          iI0000oI00 = iI0001Ioi1lo2;
/* 2893 */                                                          if (iI0000oI00 != i24) {
                                                                    }
                                                                }
/* 2892 */                                                      iI0000oI00 = i24;
/* 2893 */                                                      if (iI0000oI00 != i24) {
                                                                }
                                                                break;
                                                            case 58:
/* 2672 */                                                      bArr2 = bArr;
/* 2674 */                                                      i1o1ll0i02 = i1o1ll0i0;
/* 2676 */                                                      i10 = i22;
/* 2678 */                                                      i24 = i76;
/* 2680 */                                                      if (i43 == 0) {
/* 2682 */                                                          iI000O01llI02 = liOO0oio.I000O01llI0(bArr2, i24, i1o1ll0i02);
/* 2703 */                                                          unsafe.putObject(obj2, j, Boolean.valueOf(i1o1ll0i02.I00000oOI != 0));
/* 2706 */                                                          unsafe.putInt(obj2, j4, i10);
/* 2709 */                                                          iI0000oI00 = iI000O01llI02;
/* 2893 */                                                          if (iI0000oI00 != i24) {
                                                                    }
                                                                }
/* 2892 */                                                      iI0000oI00 = i24;
/* 2893 */                                                      if (iI0000oI00 != i24) {
                                                                }
                                                                break;
                                                            case 59:
/* 2608 */                                                      bArr2 = bArr;
/* 2610 */                                                      i1o1ll0i02 = i1o1ll0i0;
/* 2612 */                                                      i10 = i22;
/* 2614 */                                                      i24 = i76;
/* 2617 */                                                      if (i43 == 2) {
/* 2619 */                                                          int iI0001Ioi1lo8 = liOO0oio.I0001Ioi1lo(bArr2, i24, i1o1ll0i02);
/* 2623 */                                                          int i91 = i1o1ll0i02.I00000oIO;
/* 2625 */                                                          if (i91 == 0) {
/* 2627 */                                                              unsafe.putObject(obj2, j, "");
                                                                    } else {
/* 2635 */                                                              int i92 = iI0001Ioi1lo8 + i91;
/* 2637 */                                                              if ((i44 & 536870912) != 0 && !i1oooOlO100I.I00000oOI(bArr2, iI0001Ioi1lo8, i92)) {
/* 2651 */                                                                  throw new i1ioIilo10("Protocol message had invalid UTF-8.");
                                                                        }
/* 2661 */                                                              unsafe.putObject(obj2, j, new String(bArr2, iI0001Ioi1lo8, i91, i1io0O.I00000oIO));
/* 2664 */                                                              iI0001Ioi1lo8 = i92;
                                                                    }
/* 2666 */                                                          unsafe.putInt(obj2, j4, i10);
/* 2669 */                                                          iI0000oI00 = iI0001Ioi1lo8;
                                                                } else {
/* 2892 */                                                          iI0000oI00 = i24;
                                                                }
/* 2893 */                                                      if (iI0000oI00 != i24) {
                                                                }
                                                                break;
                                                            case 60:
/* 2545 */                                                      bArr2 = bArr;
/* 2549 */                                                      i25 = i23;
/* 2551 */                                                      i10 = i22;
/* 2553 */                                                      i26 = i76;
/* 2556 */                                                      if (i43 == 2) {
/* 2558 */                                                          Object objI00100o1O0lo = I00100o1O0lo(obj2, i10, i25);
/* 2570 */                                                          int iI000OiO2 = liOO0oio.I000OiO(objI00100o1O0lo, I000oI1ioi(i25), bArr2, i26, i2, i1o1ll0i0);
/* 2574 */                                                          bArr2 = bArr2;
/* 2585 */                                                          unsafe6.putObject(obj2, I000lI(i25) & 1048575, objI00100o1O0lo);
/* 2593 */                                                          i1oo0I1oIiI.I0001Ioi1lo(obj2, i10, iArr[r13] & 1048575);
/* 2596 */                                                          i1o1ll0i02 = i1o1ll0i0;
/* 2598 */                                                          iI0000oI00 = iI000OiO2;
/* 2599 */                                                          i24 = i26;
/* 2600 */                                                          i23 = i25;
/* 2893 */                                                          if (iI0000oI00 != i24) {
                                                                    }
                                                                } else {
/* 2604 */                                                          i1o1ll0i02 = i1o1ll0i0;
/* 2443 */                                                          i23 = i25;
/* 2445 */                                                          i24 = i26;
/* 2892 */                                                          iI0000oI00 = i24;
/* 2893 */                                                          if (iI0000oI00 != i24) {
                                                                    }
                                                                }
                                                                break;
                                                            case 61:
/* 2519 */                                                      bArr2 = bArr;
/* 2521 */                                                      i1o1ll0i06 = i1o1ll0i0;
/* 2523 */                                                      i25 = i23;
/* 2525 */                                                      i10 = i22;
/* 2527 */                                                      i26 = i76;
/* 2530 */                                                      if (i43 == 2) {
/* 2532 */                                                          iI00000oIO = liOO0oio.I00000oIO(bArr2, i26, i1o1ll0i06);
/* 2538 */                                                          unsafe.putObject(obj2, j, i1o1ll0i06.I0000Il00O);
/* 2541 */                                                          unsafe.putInt(obj2, j4, i10);
/* 2484 */                                                          i1o1ll0i02 = i1o1ll0i06;
/* 2485 */                                                          iI0000oI00 = iI00000oIO;
/* 2439 */                                                          i23 = i25;
/* 2385 */                                                          i24 = i26;
/* 2893 */                                                          if (iI0000oI00 != i24) {
                                                                    }
                                                                }
/* 2442 */                                                      i1o1ll0i02 = i1o1ll0i06;
/* 2443 */                                                      i23 = i25;
/* 2445 */                                                      i24 = i26;
/* 2892 */                                                      iI0000oI00 = i24;
/* 2893 */                                                      if (iI0000oI00 != i24) {
                                                                }
                                                                break;
                                                            case 63:
/* 2487 */                                                      bArr2 = bArr;
/* 2489 */                                                      i1o1ll0i06 = i1o1ll0i0;
/* 2491 */                                                      i25 = i23;
/* 2493 */                                                      i10 = i22;
/* 2495 */                                                      i26 = i76;
/* 2497 */                                                      if (i43 == 0) {
/* 2499 */                                                          iI00000oIO = liOO0oio.I0001Ioi1lo(bArr2, i26, i1o1ll0i06);
/* 2503 */                                                          int i93 = i1o1ll0i06.I00000oIO;
/* 2505 */                                                          I000o00OoI0I(i25);
/* 2512 */                                                          unsafe.putObject(obj2, j, Integer.valueOf(i93));
/* 2515 */                                                          unsafe.putInt(obj2, j4, i10);
/* 2484 */                                                          i1o1ll0i02 = i1o1ll0i06;
/* 2485 */                                                          iI0000oI00 = iI00000oIO;
/* 2439 */                                                          i23 = i25;
/* 2385 */                                                          i24 = i26;
/* 2893 */                                                          if (iI0000oI00 != i24) {
                                                                    }
                                                                }
/* 2442 */                                                      i1o1ll0i02 = i1o1ll0i06;
/* 2443 */                                                      i23 = i25;
/* 2445 */                                                      i24 = i26;
/* 2892 */                                                      iI0000oI00 = i24;
/* 2893 */                                                      if (iI0000oI00 != i24) {
                                                                }
                                                                break;
                                                            case 66:
/* 2448 */                                                      bArr2 = bArr;
/* 2450 */                                                      i1o1ll0i06 = i1o1ll0i0;
/* 2452 */                                                      i25 = i23;
/* 2454 */                                                      i10 = i22;
/* 2456 */                                                      i26 = i76;
/* 2458 */                                                      if (i43 == 0) {
/* 2460 */                                                          iI00000oIO = liOO0oio.I0001Ioi1lo(bArr2, i26, i1o1ll0i06);
/* 2464 */                                                          int i94 = i1o1ll0i06.I00000oIO;
/* 2478 */                                                          unsafe.putObject(obj2, j, Integer.valueOf((i94 >>> 1) ^ (-(i94 & 1))));
/* 2481 */                                                          unsafe.putInt(obj2, j4, i10);
/* 2484 */                                                          i1o1ll0i02 = i1o1ll0i06;
/* 2485 */                                                          iI0000oI00 = iI00000oIO;
/* 2439 */                                                          i23 = i25;
/* 2385 */                                                          i24 = i26;
/* 2893 */                                                          if (iI0000oI00 != i24) {
                                                                    }
                                                                }
/* 2442 */                                                      i1o1ll0i02 = i1o1ll0i06;
/* 2443 */                                                      i23 = i25;
/* 2445 */                                                      i24 = i26;
/* 2892 */                                                      iI0000oI00 = i24;
/* 2893 */                                                      if (iI0000oI00 != i24) {
                                                                }
                                                                break;
                                                            case 67:
/* 2395 */                                                      bArr2 = bArr;
/* 2397 */                                                      i1o1ll0i06 = i1o1ll0i0;
/* 2399 */                                                      i25 = i23;
/* 2401 */                                                      i10 = i22;
/* 2403 */                                                      i26 = i76;
/* 2405 */                                                      if (i43 == 0) {
/* 2407 */                                                          int iI000O01llI05 = liOO0oio.I000O01llI0(bArr2, i26, i1o1ll0i06);
/* 2413 */                                                          long j5 = i1o1ll0i06.I00000oOI;
/* 2430 */                                                          unsafe.putObject(obj2, j, Long.valueOf((j5 >>> 1) ^ (-(j5 & 1))));
/* 2433 */                                                          unsafe.putInt(obj2, j4, i10);
/* 2436 */                                                          iI0000oI00 = iI000O01llI05;
/* 2438 */                                                          i1o1ll0i02 = i1o1ll0i06;
/* 2439 */                                                          i23 = i25;
/* 2385 */                                                          i24 = i26;
/* 2893 */                                                          if (iI0000oI00 != i24) {
                                                                    }
                                                                }
/* 2442 */                                                      i1o1ll0i02 = i1o1ll0i06;
/* 2443 */                                                      i23 = i25;
/* 2445 */                                                      i24 = i26;
/* 2892 */                                                      iI0000oI00 = i24;
/* 2893 */                                                      if (iI0000oI00 != i24) {
                                                                }
                                                                break;
                                                            case 68:
/* 2329 */                                                      if (i43 == 3) {
/* 2337 */                                                          i10 = i22;
/* 2339 */                                                          Object objI00100o1O0lo2 = I00100o1O0lo(obj2, i10, i23);
/* 2355 */                                                          int iI000OOo1O2 = liOO0oio.I000OOo1O(objI00100o1O0lo2, I000oI1ioi(i23), bArr, i76, i2, (i5 & (-8)) | 4, i1o1ll0i0);
/* 2359 */                                                          bArr2 = bArr;
/* 2360 */                                                          i26 = i76;
/* 2372 */                                                          unsafe6.putObject(obj2, I000lI(i23) & 1048575, objI00100o1O0lo2);
/* 2380 */                                                          i1oo0I1oIiI.I0001Ioi1lo(obj2, i10, iArr[r13] & 1048575);
/* 2383 */                                                          iI0000oI00 = iI000OOo1O2;
/* 2384 */                                                          i1o1ll0i02 = i1o1ll0i0;
/* 2385 */                                                          i24 = i26;
/* 2893 */                                                          if (iI0000oI00 != i24) {
                                                                    }
                                                                } else {
/* 2388 */                                                          i10 = i22;
/* 2390 */                                                          bArr2 = bArr;
/* 2392 */                                                          i1o1ll0i02 = i1o1ll0i0;
/* 2324 */                                                          i24 = i76;
/* 2892 */                                                          iI0000oI00 = i24;
/* 2893 */                                                          if (iI0000oI00 != i24) {
                                                                    }
                                                                }
                                                                break;
                                                            default:
/* 2318 */                                                      bArr2 = bArr;
/* 2320 */                                                      i1o1ll0i02 = i1o1ll0i0;
/* 2322 */                                                      i10 = i22;
/* 2324 */                                                      i24 = i76;
/* 2892 */                                                      iI0000oI00 = i24;
/* 2893 */                                                      if (iI0000oI00 != i24) {
                                                                }
                                                                break;
                                                        }
                                                    } else if (i43 == 2) {
/* 2236 */                                              int i95 = i23 / 3;
/* 2241 */                                              Object obj8 = this.I00000oOI[i95 + i95];
/* 2243 */                                              Object object = unsafe.getObject(obj2, j);
/* 2252 */                                              if (!((i1lIOII) object).I00iOIl) {
/* 2254 */                                                  i1lIOII i1lioii2 = i1lIOII.I00iiI;
/* 2260 */                                                  if (i1lioii2.isEmpty()) {
/* 2264 */                                                      i1lioii = new i1lIOII();
                                                            } else {
/* 2270 */                                                      i1lIOII i1lioii3 = new i1lIOII(i1lioii2);
/* 2274 */                                                      i1lioii3.I00iOIl = true;
/* 2276 */                                                      i1lioii = i1lioii3;
                                                            }
/* 2277 */                                                  liOiOli.I00000oIO(i1lioii, object);
/* 2280 */                                                  unsafe.putObject(obj2, j, i1lioii);
                                                        }
/* 2287 */                                              throw IIlIOloOOO.I000l1(obj8);
                                                    }
                                                }
                                            } else if (i43 == 2) {
/* 1337 */                                      i1iliO0I i1ilio0iI00000oOI2 = (i1iliO0I) unsafe.getObject(obj7, j);
/* 1344 */                                      if (!((i1o10iIooI) i1ilio0iI00000oOI2).I00iOIl) {
/* 1346 */                                          int size2 = i1ilio0iI00000oOI2.size();
/* 1358 */                                          i1ilio0iI00000oOI2 = ((i1o10iIooI) i1ilio0iI00000oOI2).I00000oOI(size2 == 0 ? 10 : size2 + size2);
/* 1362 */                                          unsafe.putObject(obj7, j, i1ilio0iI00000oOI2);
                                                }
/* 1370 */                                      i32 = i2;
/* 1380 */                                      iI0000oI00 = liOO0oio.I0000O(I000oI1ioi(iI000iOII), i38, bArr, i76, i32, i1ilio0iI00000oOI2, i1o1ll0i0);
/* 1385 */                                      bArr11 = bArr;
/* 1387 */                                      i1o1ll0i010 = i1o1ll0i0;
/* 1389 */                                      obj5 = obj;
/* 1390 */                                      i38 = i38;
/* 1392 */                                      i35 = iI000iOII;
/* 1393 */                                      i34 = i41;
/* 1394 */                                      i36 = i7;
/* 1396 */                                      i37 = i77;
                                            } else {
/* 1400 */                                      obj2 = obj7;
/* 1401 */                                      bArr6 = bArr;
/* 1403 */                                      i22 = i41;
/* 1405 */                                      i5 = i38;
/* 1407 */                                      i23 = iI000iOII;
                                            }
/* 2288 */                                  i4 = i3;
/* 2290 */                                  i1o1ll0i02 = i1o1ll0i0;
/* 2292 */                                  bArr2 = bArr6;
/* 2293 */                                  i35 = i23;
/* 2295 */                                  i37 = i77;
/* 2297 */                                  i10 = i22;
/* 2299 */                                  i9 = i76;
                                        }
                                    }
/* 2921 */                          if (i5 == i4 || i4 == 0) {
/* 2935 */                              i1ii0Io i1ii0io = (i1ii0Io) obj2;
/* 2937 */                              i1oi1looii1I00000oIO = i1ii0io.zzc;
/* 2941 */                              if (i1oi1looii1I00000oIO == i1oi1lOoII1.I0000oI00) {
/* 2943 */                                  i1oi1looii1I00000oIO = i1oi1lOoII1.I00000oIO();
/* 2947 */                                  i1ii0io.zzc = i1oi1looii1I00000oIO;
                                        }
/* 2955 */                              int i96 = i5;
/* 2961 */                              i1o1ll0i010 = i1o1ll0i0;
/* 2956 */                              iI0000oI00 = liOO0oio.I0000oI00(i96, bArr2, i9, i2, i1oi1looii1I00000oIO, i1o1ll0i02);
/* 2964 */                              i32 = i2;
/* 2965 */                              obj5 = obj2;
/* 2966 */                              i38 = i96;
/* 2968 */                              i34 = i10;
/* 2969 */                              i36 = i7;
/* 2971 */                              iArr2 = iArr;
/* 2973 */                              i33 = i8;
/* 2975 */                              i39 = 1048575;
/* 2978 */                              bArr11 = bArr;
                                    } else {
/* 2925 */                              i32 = i2;
/* 2927 */                              iI0000oI00 = i9;
/* 2928 */                              i36 = i7;
                                    }
                                } else {
/* 78 */                            iI000iOII = I000iOII(i41, 0);
                                }
/* 71 */                        i6 = -1;
/* 86 */                        if (iI000iOII != i6) {
                                }
/* 2921 */                      if (i5 == i4) {
                                }
/* 2935 */                      i1ii0Io i1ii0io2 = (i1ii0Io) obj2;
/* 2937 */                      i1oi1looii1I00000oIO = i1ii0io2.zzc;
/* 2941 */                      if (i1oi1looii1I00000oIO == i1oi1lOoII1.I0000oI00) {
                                }
/* 2955 */                      int i962 = i5;
/* 2961 */                      i1o1ll0i010 = i1o1ll0i0;
/* 2956 */                      iI0000oI00 = liOO0oio.I0000oI00(i962, bArr2, i9, i2, i1oi1looii1I00000oIO, i1o1ll0i02);
/* 2964 */                      i32 = i2;
/* 2965 */                      obj5 = obj2;
/* 2966 */                      i38 = i962;
/* 2968 */                      i34 = i10;
/* 2969 */                      i36 = i7;
/* 2971 */                      iArr2 = iArr;
/* 2973 */                      i33 = i8;
/* 2975 */                      i39 = 1048575;
/* 2978 */                      bArr11 = bArr;
                            } else {
/* 2982 */                      obj2 = obj5;
/* 2987 */                      iArr = iArr2;
/* 2989 */                      unsafe = unsafe5;
/* 2990 */                      i4 = i3;
/* 2992 */                      i5 = i38;
                            }
                        }
/* 255 */               iArr2 = iArr;
/* 257 */               i33 = i8;
                    }
/* 2995 */          if (i36 != 1048575) {
/* 2998 */              unsafe.putInt(obj2, i36, i37);
                    }
/* 3005 */          for (int i97 = this.I000II; i97 < this.I000O01llI0; i97++) {
/* 3009 */              int i98 = this.I0001Ioi1lo[i97];
/* 3011 */              int i99 = iArr[i98];
/* 3027 */              if (i1oo0I1oIiI.I0000Il00O(obj2, I000lI(i98) & 1048575) != null) {
/* 3030 */                  I000o00OoI0I(i98);
                        }
                    }
/* 3038 */          if (i4 == 0) {
/* 3040 */              if (iI0000oI00 != i32) {
/* 3048 */                  throw new i1ioIilo10("Failed to parse the message.");
                        }
                    } else if (iI0000oI00 > i32 || i5 != i4) {
/* 3059 */              throw new i1ioIilo10("Failed to parse the message.");
                    }
/* 3053 */          return iI0000oI00;
                }

                public final int I000iOII(int i, int i2) {
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

                public final int I000lI(int i) {
/* 5 */             return this.I00000oIO[i + 1];
                }

                public final void I000o00OoI0I(int i) {
/* 1 */             int i2 = i / 3;
/* 10 */            if (this.I00000oOI[i2 + i2 + 1] == null) {
/* 12 */                return;
                    }
/* 13 */            OIiilo1Ool0o.I00000oIO();
                }

                public final i1o1Oo I000oI1ioi(int i) {
/* 1 */             Object[] objArr = this.I00000oOI;
/* 3 */             int i2 = i / 3;
/* 5 */             int i3 = i2 + i2;
/* 8 */             i1o1Oo i1o1oo = (i1o1Oo) objArr[i3];
/* 10 */            if (i1o1oo != null) {
/* 12 */                return i1o1oo;
                    }
/* 21 */            i1o1Oo i1o1ooI00000oIO = i1o0Oi.I0000Il00O.I00000oIO((Class) objArr[i3 + 1]);
/* 25 */            objArr[i3] = i1o1ooI00000oIO;
/* 29 */            return i1o1ooI00000oIO;
                }

                public final Object I00100l0(int i, Object obj) {
/* 1 */             i1o1Oo i1o1ooI000oI1ioi = I000oI1ioi(i);
/* 12 */            int iI000lI = I000lI(i) & 1048575;
/* 17 */            if (!I0001Ioi1lo(i, obj)) {
/* 19 */                return i1o1ooI000oI1ioi.zzd();
                    }
/* 27 */            Object object = I000iOII.getObject(obj, iI000lI);
/* 35 */            if (I000II(object)) {
/* 37 */                return object;
                    }
/* 38 */            i1ii0Io i1ii0ioZzd = i1o1ooI000oI1ioi.zzd();
/* 42 */            if (object != null) {
/* 44 */                i1o1ooI000oI1ioi.I00000oIO(i1ii0ioZzd, object);
                    }
/* 106 */           return i1ii0ioZzd;
                }

                public final Object I00100o1O0lo(Object obj, int i, int i2) {
/* 1 */             i1o1Oo i1o1ooI000oI1ioi = I000oI1ioi(i2);
/* 9 */             if (!I000O01llI0(obj, i, i2)) {
/* 11 */                return i1o1ooI000oI1ioi.zzd();
                    }
/* 27 */            Object object = I000iOII.getObject(obj, I000lI(i2) & 1048575);
/* 35 */            if (I000II(object)) {
/* 37 */                return object;
                    }
/* 38 */            i1ii0Io i1ii0ioZzd = i1o1ooI000oI1ioi.zzd();
/* 42 */            if (object != null) {
/* 44 */                i1o1ooI000oI1ioi.I00000oIO(i1ii0ioZzd, object);
                    }
/* 98 */            return i1ii0ioZzd;
                }

                public final void I0010o(int i, Object obj, Object obj2) {
/* 5 */             if (I0001Ioi1lo(i, obj2)) {
/* 15 */                long jI000lI = I000lI(i) & 1048575;
/* 17 */                Unsafe unsafe = I000iOII;
/* 19 */                Object object = unsafe.getObject(obj2, jI000lI);
/* 23 */                if (object == null) {
/* 100 */                   I000II.I001IO000(IlIi0I0.I000OiO(this.I00000oIO[i], "Source subfield ", " is present but null: ", obj2.toString()));
/* 408 */                   return;
                        }
/* 25 */                i1o1Oo i1o1ooI000oI1ioi = I000oI1ioi(i);
/* 33 */                if (!I0001Ioi1lo(i, obj)) {
/* 39 */                    if (I000II(object)) {
/* 45 */                        i1ii0Io i1ii0ioZzd = i1o1ooI000oI1ioi.zzd();
/* 49 */                        i1o1ooI000oI1ioi.I00000oIO(i1ii0ioZzd, object);
/* 52 */                        unsafe.putObject(obj, jI000lI, i1ii0ioZzd);
                            } else {
/* 41 */                        unsafe.putObject(obj, jI000lI, object);
                            }
/* 55 */                    I001IIilI0O(i, obj);
/* 58 */                    return;
                        }
/* 59 */                Object object2 = unsafe.getObject(obj, jI000lI);
/* 67 */                if (!I000II(object2)) {
/* 69 */                    i1ii0Io i1ii0ioZzd2 = i1o1ooI000oI1ioi.zzd();
/* 73 */                    i1o1ooI000oI1ioi.I00000oIO(i1ii0ioZzd2, object2);
/* 76 */                    unsafe.putObject(obj, jI000lI, i1ii0ioZzd2);
/* 79 */                    object2 = i1ii0ioZzd2;
                        }
/* 80 */                i1o1ooI000oI1ioi.I00000oIO(object2, object);
                    }
                }

                public final void I00111O(int i, Object obj, Object obj2) {
/* 1 */             int[] iArr = this.I00000oIO;
/* 3 */             int i2 = iArr[i];
/* 9 */             if (I000O01llI0(obj2, i2, i)) {
/* 19 */                long jI000lI = I000lI(i) & 1048575;
/* 21 */                Unsafe unsafe = I000iOII;
/* 23 */                Object object = unsafe.getObject(obj2, jI000lI);
/* 27 */                if (object == null) {
/* 108 */                   I000II.I001IO000(IlIi0I0.I000OiO(iArr[i], "Source subfield ", " is present but null: ", obj2.toString()));
/* 408 */                   return;
                        }
/* 29 */                i1o1Oo i1o1ooI000oI1ioi = I000oI1ioi(i);
/* 37 */                if (!I000O01llI0(obj, i2, i)) {
/* 43 */                    if (I000II(object)) {
/* 49 */                        i1ii0Io i1ii0ioZzd = i1o1ooI000oI1ioi.zzd();
/* 53 */                        i1o1ooI000oI1ioi.I00000oIO(i1ii0ioZzd, object);
/* 56 */                        unsafe.putObject(obj, jI000lI, i1ii0ioZzd);
                            } else {
/* 45 */                        unsafe.putObject(obj, jI000lI, object);
                            }
/* 65 */                    i1oo0I1oIiI.I0001Ioi1lo(obj, i2, iArr[i + 2] & 1048575);
/* 68 */                    return;
                        }
/* 69 */                Object object2 = unsafe.getObject(obj, jI000lI);
/* 77 */                if (!I000II(object2)) {
/* 79 */                    i1ii0Io i1ii0ioZzd2 = i1o1ooI000oI1ioi.zzd();
/* 83 */                    i1o1ooI000oI1ioi.I00000oIO(i1ii0ioZzd2, object2);
/* 86 */                    unsafe.putObject(obj, jI000lI, i1ii0ioZzd2);
/* 89 */                    object2 = i1ii0ioZzd2;
                        }
/* 90 */                i1o1ooI000oI1ioi.I00000oIO(object2, object);
                    }
                }

                public final void I001IIilI0O(int i, Object obj) {
/* 5 */             int i2 = this.I00000oIO[i + 2];
/* 10 */            long j = 1048575 & i2;
/* 17 */            if (j == 1048575) {
/* 19 */                return;
                    }
/* 30 */            i1oo0I1oIiI.I0001Ioi1lo(obj, (1 << (i2 >>> 20)) | i1oo0I1oIiI.I00000oIO(obj, j), j);
                }

                @Override
                public final i1ii0Io zzd() {
/* 5 */             return ((i1ii0Io) this.I0000oI00).I0000Il00O();
                }

                /* JADX WARN: Removed duplicated region for block: B:28:0x006f  */
                @Override
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final void zze(Object obj) {
/* 5 */             if (I000II(obj)) {
/* 12 */                if (obj instanceof i1ii0Io) {
/* 15 */                    i1ii0Io i1ii0io = (i1ii0Io) obj;
/* 17 */                    i1ii0io.I000II();
/* 20 */                    i1ii0io.zza = 0;
/* 22 */                    i1ii0io.I0000oI00();
                        }
/* 25 */                int[] iArr = this.I00000oIO;
/* 29 */                for (int i = 0; i < iArr.length; i += 3) {
/* 31 */                    int iI000lI = I000lI(i);
/* 38 */                    int i2 = 1048575 & iI000lI;
/* 39 */                    int iI000l1 = I000l1(iI000lI);
                            long j = i2;
/* 46 */                    Unsafe unsafe = I000iOII;
/* 48 */                    if (iI000l1 != 9) {
/* 52 */                        if (iI000l1 != 60 && iI000l1 != 68) {
                                    switch (iI000l1) {
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
/* 83 */                                    i1o10iIooI i1o10iiooi = (i1o10iIooI) ((i1iliO0I) i1oo0I1oIiI.I0000Il00O(obj, j));
/* 87 */                                    if (i1o10iiooi.I00iOIl) {
/* 89 */                                        i1o10iiooi.I00iOIl = false;
                                                break;
                                            } else {
                                                break;
                                            }
                                        case 50:
/* 62 */                                    Object object = unsafe.getObject(obj, j);
/* 66 */                                    if (object != null) {
/* 71 */                                        ((i1lIOII) object).I00iOIl = false;
/* 73 */                                        unsafe.putObject(obj, j, object);
                                                break;
                                            } else {
                                                break;
                                            }
                                    }
                                } else if (I000O01llI0(obj, iArr[i], i)) {
/* 108 */                           I000oI1ioi(i).zze(unsafe.getObject(obj, j));
                                }
                            } else if (I0001Ioi1lo(i, obj)) {
/* 126 */                       I000oI1ioi(i).zze(unsafe.getObject(obj, j));
                            }
                        }
/* 134 */               this.I000OOo1O.getClass();
/* 139 */               i1oi1lOoII1 i1oi1looii1 = ((i1ii0Io) obj).zzc;
/* 143 */               if (i1oi1looii1.I0000O) {
/* 145 */                   i1oi1looii1.I0000O = false;
                        }
                    }
                }

                /* JADX WARN: Removed duplicated region for block: B:19:0x0043  */
                @Override
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final boolean zzi(Object obj) {
/* 5 */             int i = 0;
/* 6 */             int i2 = 0;
/* 7 */             int i3 = 1048575;
                    loop0: while (true) {
/* 10 */                boolean zI0001Ioi1lo = true;
/* 11 */                if (i >= this.I000II) {
/* 10 */                    return true;
                        }
/* 13 */                int[] iArr = this.I0001Ioi1lo;
/* 15 */                int[] iArr2 = this.I00000oIO;
/* 17 */                int i4 = iArr[i];
/* 19 */                int i5 = iArr2[i4];
/* 21 */                int iI000lI = I000lI(i4);
/* 27 */                int i6 = iArr2[i4 + 2];
/* 29 */                int i7 = i6 & 1048575;
/* 33 */                int i8 = 1 << (i6 >>> 20);
/* 35 */                if (i7 != i3) {
/* 37 */                    if (i7 != 1048575) {
/* 42 */                        i2 = I000iOII.getInt(obj, i7);
                            }
/* 46 */                    i3 = i7;
                        }
/* 50 */                if ((268435456 & iI000lI) != 0) {
/* 66 */                    if (!(i3 == 1048575 ? I0001Ioi1lo(i4, obj) : (i2 & i8) != 0)) {
                                break;
                            }
                        } else {
/* 68 */                    int iI000l1 = I000l1(iI000lI);
/* 74 */                    if (iI000l1 == 9 || iI000l1 == 17) {
/* 195 */                       if (i3 == 1048575) {
/* 197 */                           zI0001Ioi1lo = I0001Ioi1lo(i4, obj);
                                } else if ((i8 & i2) == 0) {
/* 206 */                           zI0001Ioi1lo = false;
                                }
/* 207 */                       if (zI0001Ioi1lo && !I000oI1ioi(i4).zzi(i1oo0I1oIiI.I0000Il00O(obj, iI000lI & 1048575))) {
                                    break;
                                }
/* 227 */                       i++;
                            } else {
/* 82 */                        if (iI000l1 != 27) {
/* 86 */                            if (iI000l1 == 60 || iI000l1 == 68) {
/* 135 */                               if (I000O01llI0(obj, i5, i4) && !I000oI1ioi(i4).zzi(i1oo0I1oIiI.I0000Il00O(obj, iI000lI & 1048575))) {
                                            break;
                                        }
                                    } else if (iI000l1 != 49) {
/* 98 */                                if (iI000l1 == 50 && !((i1lIOII) i1oo0I1oIiI.I0000Il00O(obj, iI000lI & 1048575)).isEmpty()) {
/* 119 */                                   int i9 = i4 / 3;
/* 130 */                                   throw IIlIOloOOO.I000l1(this.I00000oOI[i9 + i9]);
                                        }
                                    }
/* 227 */                           i++;
                                }
/* 162 */                       List list = (List) i1oo0I1oIiI.I0000Il00O(obj, iI000lI & 1048575);
/* 168 */                       if (list.isEmpty()) {
                                    continue;
                                } else {
/* 170 */                           i1o1Oo i1o1ooI000oI1ioi = I000oI1ioi(i4);
/* 179 */                           for (int i10 = 0; i10 < list.size(); i10++) {
/* 189 */                               if (!i1o1ooI000oI1ioi.zzi(list.get(i10))) {
                                            break loop0;
                                        }
                                    }
                                }
/* 227 */                       i++;
                            }
                        }
                    }
/* 1 */             return false;
                }
            }

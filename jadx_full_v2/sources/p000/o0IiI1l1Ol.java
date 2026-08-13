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
            
            public final class o0IiI1l1Ol implements o0O1iOilloll {
                public static final int[] I000l1 = new int[0];
                public static final Unsafe I000lI;
                public int[] I00000oIO;
                public Object[] I00000oOI;
                public int I0000Il00O;
                public int I0000O;
                public loOo1oOil I0000oI00;
                public boolean I0001Ioi1lo;
                public int[] I000II;
                public int I000O01llI0;
                public int I000OOo1O;
                public i1i0olI I000OiO;
                public o0llIi I000iOII;

                static {
                    Unsafe unsafe;
                    try {
/* 17 */                unsafe = (Unsafe) AccessController.doPrivileged(new OoiioO0o(22));
                    } catch (Throwable unused) {
/* 20 */                unsafe = null;
                    }
/* 21 */            I000lI = unsafe;
                }

                public static boolean I000oI1ioi(Object obj) {
/* 1 */             if (obj == null) {
/* 3 */                 return false;
                    }
/* 7 */             if (obj instanceof o001IlOi0O) {
/* 11 */                return ((o001IlOi0O) obj).I000OOo1O();
                    }
/* 16 */            return true;
                }

                public static o0i0oOOIl1Io I0010I0i(Object obj) {
/* 1 */             o001IlOi0O o001iloi0o = (o001IlOi0O) obj;
/* 3 */             o0i0oOOIl1Io o0i0oooil1io = o001iloi0o.zzc;
/* 7 */             if (o0i0oooil1io != o0i0oOOIl1Io.I0001Ioi1lo) {
/* 29 */                return o0i0oooil1io;
                    }
/* 9 */             o0i0oOOIl1Io o0i0oooil1ioI00000oOI = o0i0oOOIl1Io.I00000oOI();
/* 13 */            o001iloi0o.zzc = o0i0oooil1ioI00000oOI;
/* 29 */            return o0i0oooil1ioI00000oOI;
                }

                public static int I0010o(long j, Object obj) {
/* 7 */             return ((Integer) o0ii0oo.I000II(obj, j)).intValue();
                }

                public static int I001IIilI0O(int i) {
/* 3 */             return (i >>> 20) & 255;
                }

                public static long I001i1O0Ol(long j, Object obj) {
/* 7 */             return ((Long) o0ii0oo.I000II(obj, j)).longValue();
                }

                public static Field I001lllioOl(Class cls, String str) {
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

                /* JADX WARN: Removed duplicated region for block: B:28:0x006f  */
                @Override
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final void I00000oIO(Object obj) {
/* 1 */             int[] iArr = this.I00000oIO;
/* 7 */             if (I000oI1ioi(obj)) {
/* 14 */                if (obj instanceof o001IlOi0O) {
/* 17 */                    o001IlOi0O o001iloi0o = (o001IlOi0O) obj;
/* 19 */                    o001iloi0o.I000II();
/* 22 */                    o001iloi0o.zza = 0;
/* 24 */                    o001iloi0o.I0000oI00();
                        }
/* 29 */                for (int i = 0; i < iArr.length; i += 3) {
/* 31 */                    int iI001IO000 = I001IO000(i);
/* 38 */                    int i2 = 1048575 & iI001IO000;
/* 39 */                    int iI001IIilI0O = I001IIilI0O(iI001IO000);
                            long j = i2;
/* 46 */                    Unsafe unsafe = I000lI;
/* 48 */                    if (iI001IIilI0O != 9) {
/* 52 */                        if (iI001IIilI0O != 60 && iI001IIilI0O != 68) {
                                    switch (iI001IIilI0O) {
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
/* 83 */                                    loi01oO0o1OI loi01oo0o1oi = (loi01oO0o1OI) ((o00o01oI1oo) o0ii0oo.I000II(obj, j));
/* 87 */                                    if (loi01oo0o1oi.I00iOIl) {
/* 89 */                                        loi01oo0o1oi.I00iOIl = false;
                                                break;
                                            } else {
                                                break;
                                            }
                                        case 50:
/* 62 */                                    Object object = unsafe.getObject(obj, j);
/* 66 */                                    if (object != null) {
/* 71 */                                        ((o01lOilIiI) object).I00iOIl = false;
/* 73 */                                        unsafe.putObject(obj, j, object);
                                                break;
                                            } else {
                                                break;
                                            }
                                    }
                                } else if (I00100l0(obj, iArr[i], i)) {
/* 108 */                           I001iOo1i0O(i).I00000oIO(unsafe.getObject(obj, j));
                                }
                            } else if (I000lI(obj, i)) {
/* 126 */                       I001iOo1i0O(i).I00000oIO(unsafe.getObject(obj, j));
                            }
                        }
/* 134 */               this.I000OiO.getClass();
/* 140 */               o0i0oOOIl1Io o0i0oooil1io = ((o001IlOi0O) obj).zzc;
/* 144 */               if (o0i0oooil1io.I0000oI00) {
/* 146 */                   o0i0oooil1io.I0000oI00 = false;
                        }
/* 150 */               if (this.I0001Ioi1lo) {
/* 154 */                   this.I000iOII.getClass();
/* 161 */                   ((looo1olo1) obj).zzb.I0000oI00();
                        }
                    }
                }

                @Override
                public final void I00000oOI(Object obj, Object obj2) {
                    Object obj3;
/* 1 */             int[] iArr = this.I00000oIO;
/* 7 */             if (!I000oI1ioi(obj)) {
/* 520 */               I000II.I000iOII("Mutating immutable message: ".concat(String.valueOf(obj)));
/* 523 */               return;
                    }
/* 9 */             obj2.getClass();
/* 12 */            int i = 0;
/* 14 */            while (i < iArr.length) {
/* 16 */                int iI001IO000 = I001IO000(i);
/* 23 */                int i2 = iI001IO000 & 1048575;
/* 25 */                int iI001IIilI0O = I001IIilI0O(iI001IO000);
/* 29 */                int i3 = iArr[i];
                        long j = i2;
                        switch (iI001IIilI0O) {
                            case 0:
/* 473 */                       obj3 = obj;
/* 478 */                       if (I000lI(obj2, i)) {
/* 480 */                           Ooil0oIOI0l0 ooil0oIOI0l0 = o0ii0oo.I0000Il00O;
/* 486 */                           ooil0oIOI0l0.I00II0oii1o(obj3, j, ooil0oIOI0l0.I0010I0i(obj2, j));
/* 489 */                           I000iOII(i, obj3);
                                    continue;
                                }
/* 492 */                       i += 3;
/* 494 */                       obj = obj3;
                            case 1:
/* 453 */                       obj3 = obj;
/* 458 */                       if (I000lI(obj2, i)) {
/* 460 */                           Ooil0oIOI0l0 ooil0oIOI0l02 = o0ii0oo.I0000Il00O;
/* 466 */                           ooil0oIOI0l02.I00IioO0OiOi(obj3, j, ooil0oIOI0l02.I001IIilI0O(obj2, j));
/* 469 */                           I000iOII(i, obj3);
                                } else {
                                    continue;
                                }
/* 492 */                       i += 3;
/* 494 */                       obj = obj3;
                            case 2:
/* 431 */                       obj3 = obj;
/* 436 */                       if (I000lI(obj2, i)) {
/* 446 */                           o0ii0oo.I0000Il00O.I00000oOI.putLong(obj3, j, o0ii0oo.I0001Ioi1lo(obj2, j));
/* 449 */                           I000iOII(i, obj3);
                                } else {
                                    continue;
                                }
/* 492 */                       i += 3;
/* 494 */                       obj = obj3;
                            case 3:
/* 409 */                       obj3 = obj;
/* 414 */                       if (I000lI(obj2, i)) {
/* 424 */                           o0ii0oo.I0000Il00O.I00000oOI.putLong(obj3, j, o0ii0oo.I0001Ioi1lo(obj2, j));
/* 427 */                           I000iOII(i, obj3);
                                } else {
                                    continue;
                                }
/* 492 */                       i += 3;
/* 494 */                       obj = obj3;
                            case 4:
/* 391 */                       obj3 = obj;
/* 396 */                       if (I000lI(obj2, i)) {
/* 402 */                           o0ii0oo.I000O01llI0(obj3, j, o0ii0oo.I0000oI00(obj2, j));
/* 405 */                           I000iOII(i, obj3);
                                } else {
                                    continue;
                                }
/* 492 */                       i += 3;
/* 494 */                       obj = obj3;
                            case 5:
/* 369 */                       obj3 = obj;
/* 374 */                       if (I000lI(obj2, i)) {
/* 384 */                           o0ii0oo.I0000Il00O.I00000oOI.putLong(obj3, j, o0ii0oo.I0001Ioi1lo(obj2, j));
/* 387 */                           I000iOII(i, obj3);
                                } else {
                                    continue;
                                }
/* 492 */                       i += 3;
/* 494 */                       obj = obj3;
                            case 6:
/* 350 */                       obj3 = obj;
/* 355 */                       if (I000lI(obj2, i)) {
/* 361 */                           o0ii0oo.I000O01llI0(obj3, j, o0ii0oo.I0000oI00(obj2, j));
/* 364 */                           I000iOII(i, obj3);
                                } else {
                                    continue;
                                }
/* 492 */                       i += 3;
/* 494 */                       obj = obj3;
                            case 7:
/* 329 */                       obj3 = obj;
/* 334 */                       if (I000lI(obj2, i)) {
/* 336 */                           Ooil0oIOI0l0 ooil0oIOI0l03 = o0ii0oo.I0000Il00O;
/* 342 */                           ooil0oIOI0l03.I001iOo1i0O(obj3, j, ooil0oIOI0l03.I00Io1o110i(obj2, j));
/* 345 */                           I000iOII(i, obj3);
                                } else {
                                    continue;
                                }
/* 492 */                       i += 3;
/* 494 */                       obj = obj3;
                            case 8:
/* 310 */                       obj3 = obj;
/* 315 */                       if (I000lI(obj2, i)) {
/* 321 */                           o0ii0oo.I000OOo1O(obj3, j, o0ii0oo.I000II(obj2, j));
/* 324 */                           I000iOII(i, obj3);
                                } else {
                                    continue;
                                }
/* 492 */                       i += 3;
/* 494 */                       obj = obj3;
                            case 9:
/* 304 */                       obj3 = obj;
/* 305 */                       I000OOo1O(i, obj3, obj2);
                                continue;
/* 492 */                       i += 3;
/* 494 */                       obj = obj3;
                            case 10:
/* 285 */                       obj3 = obj;
/* 290 */                       if (I000lI(obj2, i)) {
/* 296 */                           o0ii0oo.I000OOo1O(obj3, j, o0ii0oo.I000II(obj2, j));
/* 299 */                           I000iOII(i, obj3);
                                } else {
                                    continue;
                                }
/* 492 */                       i += 3;
/* 494 */                       obj = obj3;
                            case 11:
/* 266 */                       obj3 = obj;
/* 271 */                       if (I000lI(obj2, i)) {
/* 277 */                           o0ii0oo.I000O01llI0(obj3, j, o0ii0oo.I0000oI00(obj2, j));
/* 280 */                           I000iOII(i, obj3);
                                } else {
                                    continue;
                                }
/* 492 */                       i += 3;
/* 494 */                       obj = obj3;
                            case 12:
/* 247 */                       obj3 = obj;
/* 252 */                       if (I000lI(obj2, i)) {
/* 258 */                           o0ii0oo.I000O01llI0(obj3, j, o0ii0oo.I0000oI00(obj2, j));
/* 261 */                           I000iOII(i, obj3);
                                } else {
                                    continue;
                                }
/* 492 */                       i += 3;
/* 494 */                       obj = obj3;
                            case 13:
/* 228 */                       obj3 = obj;
/* 233 */                       if (I000lI(obj2, i)) {
/* 239 */                           o0ii0oo.I000O01llI0(obj3, j, o0ii0oo.I0000oI00(obj2, j));
/* 242 */                           I000iOII(i, obj3);
                                } else {
                                    continue;
                                }
/* 492 */                       i += 3;
/* 494 */                       obj = obj3;
                            case 14:
/* 205 */                       obj3 = obj;
/* 210 */                       if (I000lI(obj2, i)) {
/* 220 */                           o0ii0oo.I0000Il00O.I00000oOI.putLong(obj3, j, o0ii0oo.I0001Ioi1lo(obj2, j));
/* 223 */                           I000iOII(i, obj3);
                                } else {
                                    continue;
                                }
/* 492 */                       i += 3;
/* 494 */                       obj = obj3;
                            case 15:
/* 186 */                       obj3 = obj;
/* 191 */                       if (I000lI(obj2, i)) {
/* 197 */                           o0ii0oo.I000O01llI0(obj3, j, o0ii0oo.I0000oI00(obj2, j));
/* 200 */                           I000iOII(i, obj3);
                                } else {
                                    continue;
                                }
/* 492 */                       i += 3;
/* 494 */                       obj = obj3;
                            case 16:
/* 167 */                       if (I000lI(obj2, i)) {
/* 177 */                           obj3 = obj;
/* 178 */                           o0ii0oo.I0000Il00O.I00000oOI.putLong(obj3, j, o0ii0oo.I0001Ioi1lo(obj2, j));
/* 181 */                           I000iOII(i, obj3);
                                }
/* 492 */                       i += 3;
/* 494 */                       obj = obj3;
                                break;
                            case 17:
/* 159 */                       I000OOo1O(i, obj, obj2);
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
/* 114 */                       o00o01oI1oo o00o01oi1ooI00000oOI = (o00o01oI1oo) o0ii0oo.I000II(obj, j);
/* 120 */                       o00o01oI1oo o00o01oi1oo = (o00o01oI1oo) o0ii0oo.I000II(obj2, j);
/* 122 */                       int size = o00o01oi1ooI00000oOI.size();
/* 126 */                       int size2 = o00o01oi1oo.size();
/* 130 */                       if (size > 0 && size2 > 0) {
/* 139 */                           if (!((loi01oO0o1OI) o00o01oi1ooI00000oOI).I00iOIl) {
/* 144 */                               o00o01oi1ooI00000oOI = ((o0O0lilol0O) o00o01oi1ooI00000oOI).I00000oOI(size2 + size);
                                    }
/* 148 */                           o00o01oi1ooI00000oOI.addAll(o00o01oi1oo);
                                }
/* 151 */                       if (size > 0) {
/* 154 */                           o00o01oi1oo = o00o01oi1ooI00000oOI;
                                }
/* 155 */                       o0ii0oo.I000OOo1O(obj, j, o00o01oi1oo);
                                break;
                            case 50:
/* 92 */                        i1i0olI i1i0oli = o0OIIlOIl01I.I00000oIO;
/* 106 */                       o0ii0oo.I000OOo1O(obj, j, ll1Ilololl.I00000oIO(o0ii0oo.I000II(obj, j), o0ii0oo.I000II(obj2, j)));
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
/* 73 */                        if (I00100l0(obj2, i3, i)) {
/* 79 */                            o0ii0oo.I000OOo1O(obj, j, o0ii0oo.I000II(obj2, j));
/* 88 */                            o0ii0oo.I000O01llI0(obj, iArr[i + 2] & 1048575, i3);
                                    break;
                                }
                                break;
                            case 60:
/* 65 */                        I000OiO(i, obj, obj2);
                                break;
                            case 61:
                            case 62:
                            case 63:
                            case Barcode.FORMAT_EAN_8:
                            case 65:
                            case 66:
                            case 67:
/* 46 */                        if (I00100l0(obj2, i3, i)) {
/* 52 */                            o0ii0oo.I000OOo1O(obj, j, o0ii0oo.I000II(obj2, j));
/* 61 */                            o0ii0oo.I000O01llI0(obj, iArr[i + 2] & 1048575, i3);
                                    break;
                                }
                                break;
                            case 68:
/* 38 */                        I000OiO(i, obj, obj2);
                                break;
                        }
/* 35 */                obj3 = obj;
/* 492 */               i += 3;
/* 494 */               obj = obj3;
                    }
/* 497 */           Object obj4 = obj;
/* 498 */           o0OIIlOIl01I.I0010o(obj4, obj2);
/* 503 */           if (this.I0001Ioi1lo) {
/* 505 */               o0OIIlOIl01I.I0010I0i(obj4, obj2);
                    }
                }

                @Override
                public final boolean I0000Il00O(Object obj) {
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
/* 23 */                    int iI001IO000 = I001IO000(i7);
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
/* 55 */                    if ((268435456 & iI001IO000) != 0) {
/* 57 */                        i2 = i7;
/* 58 */                        i3 = i6;
/* 64 */                        if (!I000o00OoI0I(obj, i2, i3, i, i11)) {
                                    break;
                                }
                            } else {
/* 67 */                        i2 = i7;
/* 68 */                        i3 = i6;
                            }
/* 69 */                    int iI001IIilI0O = I001IIilI0O(iI001IO000);
/* 75 */                    if (iI001IIilI0O == 9 || iI001IIilI0O == 17) {
/* 200 */                       if (I000o00OoI0I(obj, i2, i3, i, i11) && !I001iOo1i0O(i2).I0000Il00O(o0ii0oo.I000II(obj, iI001IO000 & 1048575))) {
                                    break;
                                }
/* 220 */                       i5++;
/* 222 */                       i6 = i3;
/* 223 */                       i4 = i;
                            } else {
/* 83 */                        if (iI001IIilI0O != 27) {
/* 87 */                            if (iI001IIilI0O == 60 || iI001IIilI0O == 68) {
/* 135 */                               if (I00100l0(obj, i8, i2) && !I001iOo1i0O(i2).I0000Il00O(o0ii0oo.I000II(obj, iI001IO000 & 1048575))) {
                                            break;
                                        }
                                    } else if (iI001IIilI0O != 49) {
/* 99 */                                if (iI001IIilI0O == 50 && !((o01lOilIiI) o0ii0oo.I000II(obj, iI001IO000 & 1048575)).isEmpty()) {
/* 119 */                                   int i12 = i2 / 3;
/* 130 */                                   throw IIlIOloOOO.I000l1(this.I00000oOI[i12 + i12]);
                                        }
                                    }
/* 220 */                           i5++;
/* 222 */                           i6 = i3;
/* 223 */                           i4 = i;
                                }
/* 162 */                       List list = (List) o0ii0oo.I000II(obj, iI001IO000 & 1048575);
/* 168 */                       if (list.isEmpty()) {
                                    continue;
                                } else {
/* 170 */                           o0O1iOilloll o0o1ioillollI001iOo1i0O = I001iOo1i0O(i2);
/* 179 */                           for (int i13 = 0; i13 < list.size(); i13++) {
/* 189 */                               if (!o0o1ioillollI001iOo1i0O.I0000Il00O(list.get(i13))) {
                                            break loop0;
                                        }
                                    }
                                }
/* 220 */                       i5++;
/* 222 */                       i6 = i3;
/* 223 */                       i4 = i;
                            }
                        } else if (!this.I0001Ioi1lo || ((looo1olo1) obj).zzb.I000II()) {
/* 14 */                    return true;
                        }
                    }
/* 5 */             return false;
                }

                /* JADX WARN: Removed duplicated region for block: B:147:0x0366  */
                /* JADX WARN: Removed duplicated region for block: B:200:0x04b1  */
                /* JADX WARN: Removed duplicated region for block: B:233:0x05a7  */
                /* JADX WARN: Removed duplicated region for block: B:236:0x05b6 A[PHI: r7
                  0x05b6: PHI (r7v12 int) = (r7v4 int), (r7v8 int), (r7v13 int) binds: [B:275:0x06b8, B:260:0x065f, B:235:0x05b4] A[DONT_GENERATE, DONT_INLINE]] */
                /* JADX WARN: Removed duplicated region for block: B:35:0x00b1  */
                @Override
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final int I0000O(loOo1oOil looo1ooil) {
                    int i;
                    int i2;
                    int iI00100l0;
                    int iI00000oIO;
                    int iI00100l02;
                    int iI0000oI00;
                    int iI00100l03;
                    int iI00000oIO2;
                    int i3;
                    int iI00100l04;
                    int i4;
                    int iI00000oIO3;
                    int iI000iOII;
                    int size;
                    int iI00100o1O0lo;
                    int iI00100l05;
                    int iI00100l06;
                    int iI00100l07;
                    int iI00100l08;
                    int size2;
                    int iI00100l09;
                    int size3;
                    int iI00100l010;
                    int iI00000oIO4;
                    int iI00100l011;
                    int iI00000oIO5;
                    int iI00100l012;
                    int iI0000oI002;
                    int iI0010o;
/* 1 */             o0IiI1l1Ol o0iii1l1ol = this;
/* 3 */             loOo1oOil looo1ooil2 = looo1ooil;
/* 5 */             int[] iArr = o0iii1l1ol.I00000oIO;
/* 7 */             int i5 = 1048575;
/* 10 */            int i6 = 1048575;
/* 11 */            int i7 = 0;
/* 12 */            int i8 = 0;
/* 13 */            int iI0010I0i = 0;
/* 15 */            while (i7 < iArr.length) {
/* 17 */                int iI001IO000 = o0iii1l1ol.I001IO000(i7);
/* 21 */                int iI001IIilI0O = I001IIilI0O(iI001IO000);
/* 27 */                int i9 = iArr[i7];
/* 29 */                int i10 = iArr[i7 + 2];
/* 31 */                int i11 = i10 & i5;
/* 38 */                Unsafe unsafe = I000lI;
/* 40 */                if (iI001IIilI0O <= 17) {
/* 42 */                    if (i11 != i6) {
/* 50 */                        i8 = i11 == i5 ? 0 : unsafe.getInt(looo1ooil2, i11);
/* 55 */                        i6 = i11;
                            }
/* 58 */                    i = 1 << (i10 >>> 20);
                        } else {
/* 61 */                    i = 0;
                        }
/* 63 */                int i12 = iI001IO000 & i5;
/* 68 */                if (iI001IIilI0O >= looi1iOlo.I00iiI.I00iOIl) {
/* 72 */                    int i13 = looi1iOlo.I00iiO.I00iOIl;
                        }
                        long j = i12;
/* 77 */                int iI00100l013 = 4;
                        switch (iI001IIilI0O) {
                            case 0:
/* 1730 */                      if (o0iii1l1ol.I000o00OoI0I(looo1ooil2, i7, i6, i8, i)) {
/* 1734 */                          iI0010I0i = io1OllI.I0010I0i(i9 << 3, 8, iI0010I0i);
                                }
/* 1738 */                      i7 += 3;
/* 1740 */                      looo1ooil2 = looo1ooil;
/* 1742 */                      i5 = 1048575;
                            case 1:
/* 1715 */                      i2 = 4;
/* 1721 */                      if (o0iii1l1ol.I000o00OoI0I(looo1ooil2, i7, i6, i8, i)) {
/* 1465 */                          iI0010I0i = io1OllI.I0010I0i(i9 << 3, i2, iI0010I0i);
                                }
/* 1410 */                      o0iii1l1ol = this;
/* 1738 */                      i7 += 3;
/* 1740 */                      looo1ooil2 = looo1ooil;
/* 1742 */                      i5 = 1048575;
                            case 2:
/* 1697 */                      if (o0iii1l1ol.I000o00OoI0I(looo1ooil2, i7, i6, i8, i)) {
/* 1701 */                          long j2 = unsafe.getLong(looo1ooil2, j);
/* 1705 */                          iI00100l0 = loliO00.I00100l0(i9 << 3);
/* 1709 */                          iI00000oIO = loliO00.I00000oIO(j2);
/* 1409 */                          iI0010I0i += iI00000oIO + iI00100l0;
                                }
/* 1410 */                      o0iii1l1ol = this;
/* 1738 */                      i7 += 3;
/* 1740 */                      looo1ooil2 = looo1ooil;
/* 1742 */                      i5 = 1048575;
                            case 3:
/* 1674 */                      if (o0iii1l1ol.I000o00OoI0I(looo1ooil2, i7, i6, i8, i)) {
/* 1678 */                          long j3 = unsafe.getLong(looo1ooil2, j);
/* 1682 */                          iI00100l0 = loliO00.I00100l0(i9 << 3);
/* 1686 */                          iI00000oIO = loliO00.I00000oIO(j3);
/* 1409 */                          iI0010I0i += iI00000oIO + iI00100l0;
                                }
/* 1410 */                      o0iii1l1ol = this;
/* 1738 */                      i7 += 3;
/* 1740 */                      looo1ooil2 = looo1ooil;
/* 1742 */                      i5 = 1048575;
                            case 4:
/* 1650 */                      if (o0iii1l1ol.I000o00OoI0I(looo1ooil2, i7, i6, i8, i)) {
/* 1654 */                          long j4 = unsafe.getInt(looo1ooil2, j);
/* 1659 */                          iI00100l0 = loliO00.I00100l0(i9 << 3);
/* 1663 */                          iI00000oIO = loliO00.I00000oIO(j4);
/* 1409 */                          iI0010I0i += iI00000oIO + iI00100l0;
                                }
/* 1410 */                      o0iii1l1ol = this;
/* 1738 */                      i7 += 3;
/* 1740 */                      looo1ooil2 = looo1ooil;
/* 1742 */                      i5 = 1048575;
                            case 5:
/* 1641 */                      if (o0iii1l1ol.I000o00OoI0I(looo1ooil2, i7, i6, i8, i)) {
/* 1450 */                          iI0010I0i = io1OllI.I0010I0i(i9 << 3, 8, iI0010I0i);
                                }
/* 1410 */                      o0iii1l1ol = this;
/* 1738 */                      i7 += 3;
/* 1740 */                      looo1ooil2 = looo1ooil;
/* 1742 */                      i5 = 1048575;
                            case 6:
/* 1626 */                      i2 = 4;
/* 1632 */                      if (o0iii1l1ol.I000o00OoI0I(looo1ooil2, i7, i6, i8, i)) {
                                }
/* 1410 */                      o0iii1l1ol = this;
/* 1738 */                      i7 += 3;
/* 1740 */                      looo1ooil2 = looo1ooil;
/* 1742 */                      i5 = 1048575;
                                break;
                            case 7:
/* 1616 */                      if (o0iii1l1ol.I000o00OoI0I(looo1ooil2, i7, i6, i8, i)) {
/* 1620 */                          iI0010I0i = io1OllI.I0010I0i(i9 << 3, 1, iI0010I0i);
                                }
/* 1410 */                      o0iii1l1ol = this;
/* 1738 */                      i7 += 3;
/* 1740 */                      looo1ooil2 = looo1ooil;
/* 1742 */                      i5 = 1048575;
                            case 8:
/* 1576 */                      if (o0iii1l1ol.I000o00OoI0I(looo1ooil2, i7, i6, i8, i)) {
/* 1578 */                          int i14 = i9 << 3;
/* 1580 */                          Object object = unsafe.getObject(looo1ooil2, j);
/* 1586 */                          if (object instanceof lol1I010) {
/* 1590 */                              iI00100l02 = loliO00.I00100l0(i14);
/* 1594 */                              iI0000oI00 = ((lol1I010) object).I0000oI00();
/* 1534 */                              iI0010I0i = io1OllI.I00111O(iI0000oI00, iI0000oI00, iI00100l02, iI0010I0i);
                                    } else {
/* 1601 */                              iI00100l0 = loliO00.I00100l0(i14);
/* 1605 */                              iI00000oIO = loliO00.I000oI1ioi((String) object);
/* 1409 */                              iI0010I0i += iI00000oIO + iI00100l0;
                                    }
                                }
/* 1410 */                      o0iii1l1ol = this;
/* 1738 */                      i7 += 3;
/* 1740 */                      looo1ooil2 = looo1ooil;
/* 1742 */                      i5 = 1048575;
                            case 9:
/* 1545 */                      if (o0iii1l1ol.I000o00OoI0I(looo1ooil2, i7, i6, i8, i)) {
/* 1547 */                          Object object2 = unsafe.getObject(looo1ooil2, j);
/* 1551 */                          o0O1iOilloll o0o1ioillollI001iOo1i0O = o0iii1l1ol.I001iOo1i0O(i7);
/* 1555 */                          i1i0olI i1i0oli = o0OIIlOIl01I.I00000oIO;
/* 1561 */                          iI00100l03 = loliO00.I00100l0(i9 << 3);
/* 1565 */                          iI00000oIO2 = ((loOo1oOil) object2).I00000oIO(o0o1ioillollI001iOo1i0O);
/* 290 */                           iI0010I0i = io1OllI.I00111O(iI00000oIO2, iI00000oIO2, iI00100l03, iI0010I0i);
/* 1738 */                          i7 += 3;
/* 1740 */                          looo1ooil2 = looo1ooil;
/* 1742 */                          i5 = 1048575;
                                } else {
/* 1738 */                          i7 += 3;
/* 1740 */                          looo1ooil2 = looo1ooil;
/* 1742 */                          i5 = 1048575;
                                }
                            case 10:
/* 1516 */                      if (o0iii1l1ol.I000o00OoI0I(looo1ooil2, i7, i6, i8, i)) {
/* 1524 */                          lol1I010 lol1i010 = (lol1I010) unsafe.getObject(looo1ooil2, j);
/* 1526 */                          iI00100l02 = loliO00.I00100l0(i9 << 3);
/* 1530 */                          iI0000oI00 = lol1i010.I0000oI00();
/* 1534 */                          iI0010I0i = io1OllI.I00111O(iI0000oI00, iI0000oI00, iI00100l02, iI0010I0i);
                                }
/* 1410 */                      o0iii1l1ol = this;
/* 1738 */                      i7 += 3;
/* 1740 */                      looo1ooil2 = looo1ooil;
/* 1742 */                      i5 = 1048575;
                            case 11:
/* 1498 */                      if (o0iii1l1ol.I000o00OoI0I(looo1ooil2, i7, i6, i8, i)) {
/* 1502 */                          i3 = unsafe.getInt(looo1ooil2, j);
/* 1506 */                          iI00100l04 = loliO00.I00100l0(i9 << 3);
/* 1436 */                          iI0010I0i = io1OllI.I0010I0i(i3, iI00100l04, iI0010I0i);
                                }
/* 1410 */                      o0iii1l1ol = this;
/* 1738 */                      i7 += 3;
/* 1740 */                      looo1ooil2 = looo1ooil;
/* 1742 */                      i5 = 1048575;
                            case 12:
/* 1475 */                      if (o0iii1l1ol.I000o00OoI0I(looo1ooil2, i7, i6, i8, i)) {
/* 1479 */                          long j5 = unsafe.getInt(looo1ooil2, j);
/* 1484 */                          iI00100l0 = loliO00.I00100l0(i9 << 3);
/* 1488 */                          iI00000oIO = loliO00.I00000oIO(j5);
/* 1409 */                          iI0010I0i += iI00000oIO + iI00100l0;
                                }
/* 1410 */                      o0iii1l1ol = this;
/* 1738 */                      i7 += 3;
/* 1740 */                      looo1ooil2 = looo1ooil;
/* 1742 */                      i5 = 1048575;
                            case 13:
/* 1455 */                      i2 = 4;
/* 1461 */                      if (o0iii1l1ol.I000o00OoI0I(looo1ooil2, i7, i6, i8, i)) {
                                }
/* 1410 */                      o0iii1l1ol = this;
/* 1738 */                      i7 += 3;
/* 1740 */                      looo1ooil2 = looo1ooil;
/* 1742 */                      i5 = 1048575;
                                break;
                            case 14:
/* 1446 */                      if (o0iii1l1ol.I000o00OoI0I(looo1ooil2, i7, i6, i8, i)) {
                                }
/* 1410 */                      o0iii1l1ol = this;
/* 1738 */                      i7 += 3;
/* 1740 */                      looo1ooil2 = looo1ooil;
/* 1742 */                      i5 = 1048575;
                                break;
                            case 15:
/* 1419 */                      if (o0iii1l1ol.I000o00OoI0I(looo1ooil2, i7, i6, i8, i)) {
/* 1423 */                          int i15 = unsafe.getInt(looo1ooil2, j);
/* 1431 */                          iI00100l04 = loliO00.I00100l0(i9 << 3);
/* 1435 */                          i3 = (i15 >> 31) ^ (i15 + i15);
/* 1436 */                          iI0010I0i = io1OllI.I0010I0i(i3, iI00100l04, iI0010I0i);
                                }
/* 1410 */                      o0iii1l1ol = this;
/* 1738 */                      i7 += 3;
/* 1740 */                      looo1ooil2 = looo1ooil;
/* 1742 */                      i5 = 1048575;
                            case 16:
/* 1387 */                      if (o0iii1l1ol.I000o00OoI0I(looo1ooil2, i7, i6, i8, i)) {
/* 1391 */                          long j6 = unsafe.getLong(looo1ooil2, j);
/* 1399 */                          iI00100l0 = loliO00.I00100l0(i9 << 3);
/* 1404 */                          iI00000oIO = loliO00.I00000oIO((j6 >> 63) ^ (j6 + j6));
/* 1409 */                          iI0010I0i += iI00000oIO + iI00100l0;
                                }
/* 1410 */                      o0iii1l1ol = this;
/* 1738 */                      i7 += 3;
/* 1740 */                      looo1ooil2 = looo1ooil;
/* 1742 */                      i5 = 1048575;
                            case 17:
/* 1357 */                      if (o0iii1l1ol.I000o00OoI0I(looo1ooil2, i7, i6, i8, i)) {
/* 1363 */                          loOo1oOil looo1ooil3 = (loOo1oOil) unsafe.getObject(looo1ooil2, j);
/* 1365 */                          o0O1iOilloll o0o1ioillollI001iOo1i0O2 = o0iii1l1ol.I001iOo1i0O(i7);
/* 1371 */                          int iI00100l014 = loliO00.I00100l0(i9 << 3);
/* 1375 */                          i4 = iI00100l014 + iI00100l014;
/* 1376 */                          iI00000oIO3 = looo1ooil3.I00000oIO(o0o1ioillollI001iOo1i0O2);
/* 112 */                           iI000iOII = iI00000oIO3 + i4;
/* 113 */                           iI0010I0i += iI000iOII;
/* 1738 */                          i7 += 3;
/* 1740 */                          looo1ooil2 = looo1ooil;
/* 1742 */                          i5 = 1048575;
                                } else {
/* 1738 */                          i7 += 3;
/* 1740 */                          looo1ooil2 = looo1ooil;
/* 1742 */                          i5 = 1048575;
                                }
                            case PoseLandmark.RIGHT_PINKY:
/* 1346 */                      iI000iOII = o0OIIlOIl01I.I000iOII(i9, (List) unsafe.getObject(looo1ooil2, j));
/* 113 */                       iI0010I0i += iI000iOII;
/* 1738 */                      i7 += 3;
/* 1740 */                      looo1ooil2 = looo1ooil;
/* 1742 */                      i5 = 1048575;
                            case PoseLandmark.LEFT_INDEX:
/* 1334 */                      iI000iOII = o0OIIlOIl01I.I000OiO(i9, (List) unsafe.getObject(looo1ooil2, j));
/* 113 */                       iI0010I0i += iI000iOII;
/* 1738 */                      i7 += 3;
/* 1740 */                      looo1ooil2 = looo1ooil;
/* 1742 */                      i5 = 1048575;
                            case PoseLandmark.RIGHT_INDEX:
/* 1300 */                      List list = (List) unsafe.getObject(looo1ooil2, j);
/* 1302 */                      i1i0olI i1i0oli2 = o0OIIlOIl01I.I00000oIO;
/* 1326 */                      iI00100l06 = list.size() == 0 ? 0 : (loliO00.I00100l0(i9 << 3) * list.size()) + o0OIIlOIl01I.I000lI(list);
/* 1213 */                      iI0010I0i += iI00100l06;
/* 1738 */                      i7 += 3;
/* 1740 */                      looo1ooil2 = looo1ooil;
/* 1742 */                      i5 = 1048575;
                            case PoseLandmark.LEFT_THUMB:
/* 1272 */                      List list2 = (List) unsafe.getObject(looo1ooil2, j);
/* 1274 */                      i1i0olI i1i0oli3 = o0OIIlOIl01I.I00000oIO;
/* 1276 */                      size = list2.size();
/* 1280 */                      if (size != 0) {
/* 1286 */                          iI00100o1O0lo = o0OIIlOIl01I.I00100o1O0lo(list2);
/* 1290 */                          iI00100l05 = loliO00.I00100l0(i9 << 3);
/* 885 */                           iI00100l07 = (iI00100l05 * size) + iI00100o1O0lo;
/* 886 */                           iI0010I0i += iI00100l07;
/* 1738 */                          i7 += 3;
/* 1740 */                          looo1ooil2 = looo1ooil;
/* 1742 */                          i5 = 1048575;
                                }
/* 871 */                       iI00100l07 = 0;
/* 886 */                       iI0010I0i += iI00100l07;
/* 1738 */                      i7 += 3;
/* 1740 */                      looo1ooil2 = looo1ooil;
/* 1742 */                      i5 = 1048575;
                            case PoseLandmark.RIGHT_THUMB:
/* 1244 */                      List list3 = (List) unsafe.getObject(looo1ooil2, j);
/* 1246 */                      i1i0olI i1i0oli4 = o0OIIlOIl01I.I00000oIO;
/* 1248 */                      size = list3.size();
/* 1252 */                      if (size != 0) {
/* 1258 */                          iI00100o1O0lo = o0OIIlOIl01I.I000l1(list3);
/* 1262 */                          iI00100l05 = loliO00.I00100l0(i9 << 3);
/* 885 */                           iI00100l07 = (iI00100l05 * size) + iI00100o1O0lo;
/* 886 */                           iI0010I0i += iI00100l07;
/* 1738 */                          i7 += 3;
/* 1740 */                          looo1ooil2 = looo1ooil;
/* 1742 */                          i5 = 1048575;
                                }
/* 871 */                       iI00100l07 = 0;
/* 886 */                       iI0010I0i += iI00100l07;
/* 1738 */                      i7 += 3;
/* 1740 */                      looo1ooil2 = looo1ooil;
/* 1742 */                      i5 = 1048575;
                            case PoseLandmark.LEFT_HIP:
/* 1234 */                      iI000iOII = o0OIIlOIl01I.I000iOII(i9, (List) unsafe.getObject(looo1ooil2, j));
/* 113 */                       iI0010I0i += iI000iOII;
/* 1738 */                      i7 += 3;
/* 1740 */                      looo1ooil2 = looo1ooil;
/* 1742 */                      i5 = 1048575;
                            case PoseLandmark.RIGHT_HIP:
/* 1222 */                      iI000iOII = o0OIIlOIl01I.I000OiO(i9, (List) unsafe.getObject(looo1ooil2, j));
/* 113 */                       iI0010I0i += iI000iOII;
/* 1738 */                      i7 += 3;
/* 1740 */                      looo1ooil2 = looo1ooil;
/* 1742 */                      i5 = 1048575;
                            case PoseLandmark.LEFT_KNEE:
/* 1192 */                      List list4 = (List) unsafe.getObject(looo1ooil2, j);
/* 1194 */                      i1i0olI i1i0oli5 = o0OIIlOIl01I.I00000oIO;
/* 1196 */                      int size4 = list4.size();
/* 1200 */                      if (size4 != 0) {
/* 1212 */                          iI00100l06 = (loliO00.I00100l0(i9 << 3) + 1) * size4;
                                }
/* 1213 */                      iI0010I0i += iI00100l06;
/* 1738 */                      i7 += 3;
/* 1740 */                      looo1ooil2 = looo1ooil;
/* 1742 */                      i5 = 1048575;
                                break;
                            case PoseLandmark.RIGHT_KNEE:
/* 1095 */                      List list5 = (List) unsafe.getObject(looo1ooil2, j);
/* 1097 */                      i1i0olI i1i0oli6 = o0OIIlOIl01I.I00000oIO;
/* 1099 */                      int size5 = list5.size();
/* 1103 */                      if (size5 == 0) {
/* 871 */                           iI00100l07 = 0;
                                } else {
/* 1113 */                          iI00100l07 = loliO00.I00100l0(i9 << 3) * size5;
/* 1116 */                          if (list5 instanceof o01I0lI1) {
/* 1118 */                              o01I0lI1 o01i0li1 = (o01I0lI1) list5;
/* 1122 */                              for (int i16 = 0; i16 < size5; i16++) {
/* 1124 */                                  Object objZza = o01i0li1.zza();
/* 1130 */                                  if (objZza instanceof lol1I010) {
/* 1134 */                                      int iI0000oI003 = ((lol1I010) objZza).I0000oI00();
/* 1138 */                                      iI00100l07 = io1OllI.I0010I0i(iI0000oI003, iI0000oI003, iI00100l07);
                                            } else {
/* 1149 */                                      iI00100l07 = loliO00.I000oI1ioi((String) objZza) + iI00100l07;
                                            }
                                        }
                                    } else {
/* 1156 */                              for (int i17 = 0; i17 < size5; i17++) {
/* 1158 */                                  Object obj = list5.get(i17);
/* 1164 */                                  if (obj instanceof lol1I010) {
/* 1168 */                                      int iI0000oI004 = ((lol1I010) obj).I0000oI00();
/* 1172 */                                      iI00100l07 = io1OllI.I0010I0i(iI0000oI004, iI0000oI004, iI00100l07);
                                            } else {
/* 1183 */                                      iI00100l07 = loliO00.I000oI1ioi((String) obj) + iI00100l07;
                                            }
                                        }
                                    }
                                }
/* 886 */                       iI0010I0i += iI00100l07;
/* 1738 */                      i7 += 3;
/* 1740 */                      looo1ooil2 = looo1ooil;
/* 1742 */                      i5 = 1048575;
                            case 27:
/* 1043 */                      List list6 = (List) unsafe.getObject(looo1ooil2, j);
/* 1045 */                      o0O1iOilloll o0o1ioillollI001iOo1i0O3 = o0iii1l1ol.I001iOo1i0O(i7);
/* 1049 */                      i1i0olI i1i0oli7 = o0OIIlOIl01I.I00000oIO;
/* 1051 */                      int size6 = list6.size();
/* 1055 */                      if (size6 == 0) {
/* 1057 */                          iI00100l08 = 0;
                                } else {
/* 1066 */                          iI00100l08 = loliO00.I00100l0(i9 << 3) * size6;
/* 1069 */                          for (int i18 = 0; i18 < size6; i18++) {
/* 1077 */                              int iI00000oIO6 = ((loOo1oOil) list6.get(i18)).I00000oIO(o0o1ioillollI001iOo1i0O3);
/* 1081 */                              iI00100l08 = io1OllI.I0010I0i(iI00000oIO6, iI00000oIO6, iI00100l08);
                                    }
                                }
/* 1088 */                      iI0010I0i += iI00100l08;
/* 1738 */                      i7 += 3;
/* 1740 */                      looo1ooil2 = looo1ooil;
/* 1742 */                      i5 = 1048575;
                            case PoseLandmark.RIGHT_ANKLE:
/* 995 */                       List list7 = (List) unsafe.getObject(looo1ooil2, j);
/* 997 */                       i1i0olI i1i0oli8 = o0OIIlOIl01I.I00000oIO;
/* 999 */                       int size7 = list7.size();
/* 1003 */                      if (size7 != 0) {
/* 1013 */                          iI00100l07 = loliO00.I00100l0(i9 << 3) * size7;
/* 1020 */                          for (int i19 = 0; i19 < list7.size(); i19++) {
/* 1028 */                              int iI0000oI005 = ((lol1I010) list7.get(i19)).I0000oI00();
/* 1032 */                              iI00100l07 = io1OllI.I0010I0i(iI0000oI005, iI0000oI005, iI00100l07);
                                    }
                                }
/* 886 */                       iI0010I0i += iI00100l07;
/* 1738 */                      i7 += 3;
/* 1740 */                      looo1ooil2 = looo1ooil;
/* 1742 */                      i5 = 1048575;
                                break;
                            case PoseLandmark.LEFT_HEEL:
/* 969 */                       List list8 = (List) unsafe.getObject(looo1ooil2, j);
/* 971 */                       i1i0olI i1i0oli9 = o0OIIlOIl01I.I00000oIO;
/* 973 */                       size = list8.size();
/* 977 */                       if (size != 0) {
/* 982 */                           iI00100o1O0lo = o0OIIlOIl01I.I00100l0(list8);
/* 986 */                           iI00100l05 = loliO00.I00100l0(i9 << 3);
/* 885 */                           iI00100l07 = (iI00100l05 * size) + iI00100o1O0lo;
/* 886 */                           iI0010I0i += iI00100l07;
/* 1738 */                          i7 += 3;
/* 1740 */                          looo1ooil2 = looo1ooil;
/* 1742 */                          i5 = 1048575;
                                }
/* 871 */                       iI00100l07 = 0;
/* 886 */                       iI0010I0i += iI00100l07;
/* 1738 */                      i7 += 3;
/* 1740 */                      looo1ooil2 = looo1ooil;
/* 1742 */                      i5 = 1048575;
                            case 30:
/* 943 */                       List list9 = (List) unsafe.getObject(looo1ooil2, j);
/* 945 */                       i1i0olI i1i0oli10 = o0OIIlOIl01I.I00000oIO;
/* 947 */                       size = list9.size();
/* 951 */                       if (size != 0) {
/* 956 */                           iI00100o1O0lo = o0OIIlOIl01I.I000OOo1O(list9);
/* 960 */                           iI00100l05 = loliO00.I00100l0(i9 << 3);
/* 885 */                           iI00100l07 = (iI00100l05 * size) + iI00100o1O0lo;
/* 886 */                           iI0010I0i += iI00100l07;
/* 1738 */                          i7 += 3;
/* 1740 */                          looo1ooil2 = looo1ooil;
/* 1742 */                          i5 = 1048575;
                                }
/* 871 */                       iI00100l07 = 0;
/* 886 */                       iI0010I0i += iI00100l07;
/* 1738 */                      i7 += 3;
/* 1740 */                      looo1ooil2 = looo1ooil;
/* 1742 */                      i5 = 1048575;
                            case PoseLandmark.LEFT_FOOT_INDEX:
/* 933 */                       iI000iOII = o0OIIlOIl01I.I000OiO(i9, (List) unsafe.getObject(looo1ooil2, j));
/* 113 */                       iI0010I0i += iI000iOII;
/* 1738 */                      i7 += 3;
/* 1740 */                      looo1ooil2 = looo1ooil;
/* 1742 */                      i5 = 1048575;
                            case 32:
/* 921 */                       iI000iOII = o0OIIlOIl01I.I000iOII(i9, (List) unsafe.getObject(looo1ooil2, j));
/* 113 */                       iI0010I0i += iI000iOII;
/* 1738 */                      i7 += 3;
/* 1740 */                      looo1ooil2 = looo1ooil;
/* 1742 */                      i5 = 1048575;
                            case 33:
/* 893 */                       List list10 = (List) unsafe.getObject(looo1ooil2, j);
/* 895 */                       i1i0olI i1i0oli11 = o0OIIlOIl01I.I00000oIO;
/* 897 */                       size = list10.size();
/* 901 */                       if (size != 0) {
/* 906 */                           iI00100o1O0lo = o0OIIlOIl01I.I000o00OoI0I(list10);
/* 910 */                           iI00100l05 = loliO00.I00100l0(i9 << 3);
/* 885 */                           iI00100l07 = (iI00100l05 * size) + iI00100o1O0lo;
/* 886 */                           iI0010I0i += iI00100l07;
/* 1738 */                          i7 += 3;
/* 1740 */                          looo1ooil2 = looo1ooil;
/* 1742 */                          i5 = 1048575;
                                }
/* 871 */                       iI00100l07 = 0;
/* 886 */                       iI0010I0i += iI00100l07;
/* 1738 */                      i7 += 3;
/* 1740 */                      looo1ooil2 = looo1ooil;
/* 1742 */                      i5 = 1048575;
                            case 34:
/* 861 */                       List list11 = (List) unsafe.getObject(looo1ooil2, j);
/* 863 */                       i1i0olI i1i0oli12 = o0OIIlOIl01I.I00000oIO;
/* 865 */                       size = list11.size();
/* 869 */                       if (size != 0) {
/* 876 */                           iI00100o1O0lo = o0OIIlOIl01I.I000oI1ioi(list11);
/* 880 */                           iI00100l05 = loliO00.I00100l0(i9 << 3);
/* 885 */                           iI00100l07 = (iI00100l05 * size) + iI00100o1O0lo;
/* 886 */                           iI0010I0i += iI00100l07;
/* 1738 */                          i7 += 3;
/* 1740 */                          looo1ooil2 = looo1ooil;
/* 1742 */                          i5 = 1048575;
                                }
/* 871 */                       iI00100l07 = 0;
/* 886 */                       iI0010I0i += iI00100l07;
/* 1738 */                      i7 += 3;
/* 1740 */                      looo1ooil2 = looo1ooil;
/* 1742 */                      i5 = 1048575;
                            case InputImage.IMAGE_FORMAT_YUV_420_888:
/* 838 */                       List list12 = (List) unsafe.getObject(looo1ooil2, j);
/* 840 */                       i1i0olI i1i0oli13 = o0OIIlOIl01I.I00000oIO;
/* 846 */                       size2 = list12.size() * 8;
/* 847 */                       if (size2 > 0) {
/* 851 */                           iI00100l09 = loliO00.I00100l0(i9 << 3);
/* 572 */                           iI0010I0i = io1OllI.I00111O(size2, iI00100l09, size2, iI0010I0i);
/* 1738 */                          i7 += 3;
/* 1740 */                          looo1ooil2 = looo1ooil;
/* 1742 */                          i5 = 1048575;
                                } else {
/* 1738 */                          i7 += 3;
/* 1740 */                          looo1ooil2 = looo1ooil;
/* 1742 */                          i5 = 1048575;
                                }
                            case 36:
/* 815 */                       List list13 = (List) unsafe.getObject(looo1ooil2, j);
/* 817 */                       i1i0olI i1i0oli14 = o0OIIlOIl01I.I00000oIO;
/* 823 */                       size3 = list13.size() * 4;
/* 824 */                       if (size3 > 0) {
/* 828 */                           iI00100l010 = loliO00.I00100l0(i9 << 3);
/* 640 */                           iI0010I0i = io1OllI.I00111O(size3, iI00100l010, size3, iI0010I0i);
/* 1738 */                          i7 += 3;
/* 1740 */                          looo1ooil2 = looo1ooil;
/* 1742 */                          i5 = 1048575;
                                } else {
/* 1738 */                          i7 += 3;
/* 1740 */                          looo1ooil2 = looo1ooil;
/* 1742 */                          i5 = 1048575;
                                }
                            case 37:
/* 797 */                       size2 = o0OIIlOIl01I.I000lI((List) unsafe.getObject(looo1ooil2, j));
/* 801 */                       if (size2 > 0) {
/* 805 */                           iI00100l09 = loliO00.I00100l0(i9 << 3);
/* 572 */                           iI0010I0i = io1OllI.I00111O(size2, iI00100l09, size2, iI0010I0i);
/* 1738 */                          i7 += 3;
/* 1740 */                          looo1ooil2 = looo1ooil;
/* 1742 */                          i5 = 1048575;
                                } else {
/* 1738 */                          i7 += 3;
/* 1740 */                          looo1ooil2 = looo1ooil;
/* 1742 */                          i5 = 1048575;
                                }
                            case 38:
/* 777 */                       size2 = o0OIIlOIl01I.I00100o1O0lo((List) unsafe.getObject(looo1ooil2, j));
/* 781 */                       if (size2 > 0) {
/* 785 */                           iI00100l09 = loliO00.I00100l0(i9 << 3);
/* 572 */                           iI0010I0i = io1OllI.I00111O(size2, iI00100l09, size2, iI0010I0i);
/* 1738 */                          i7 += 3;
/* 1740 */                          looo1ooil2 = looo1ooil;
/* 1742 */                          i5 = 1048575;
                                } else {
/* 1738 */                          i7 += 3;
/* 1740 */                          looo1ooil2 = looo1ooil;
/* 1742 */                          i5 = 1048575;
                                }
                            case 39:
/* 757 */                       size2 = o0OIIlOIl01I.I000l1((List) unsafe.getObject(looo1ooil2, j));
/* 761 */                       if (size2 > 0) {
/* 765 */                           iI00100l09 = loliO00.I00100l0(i9 << 3);
/* 572 */                           iI0010I0i = io1OllI.I00111O(size2, iI00100l09, size2, iI0010I0i);
/* 1738 */                          i7 += 3;
/* 1740 */                          looo1ooil2 = looo1ooil;
/* 1742 */                          i5 = 1048575;
                                } else {
/* 1738 */                          i7 += 3;
/* 1740 */                          looo1ooil2 = looo1ooil;
/* 1742 */                          i5 = 1048575;
                                }
                            case 40:
/* 732 */                       List list14 = (List) unsafe.getObject(looo1ooil2, j);
/* 734 */                       i1i0olI i1i0oli15 = o0OIIlOIl01I.I00000oIO;
/* 740 */                       size2 = list14.size() * 8;
/* 741 */                       if (size2 > 0) {
/* 745 */                           iI00100l09 = loliO00.I00100l0(i9 << 3);
/* 572 */                           iI0010I0i = io1OllI.I00111O(size2, iI00100l09, size2, iI0010I0i);
/* 1738 */                          i7 += 3;
/* 1740 */                          looo1ooil2 = looo1ooil;
/* 1742 */                          i5 = 1048575;
                                } else {
/* 1738 */                          i7 += 3;
/* 1740 */                          looo1ooil2 = looo1ooil;
/* 1742 */                          i5 = 1048575;
                                }
                            case 41:
/* 710 */                       List list15 = (List) unsafe.getObject(looo1ooil2, j);
/* 712 */                       i1i0olI i1i0oli16 = o0OIIlOIl01I.I00000oIO;
/* 718 */                       size3 = list15.size() * 4;
/* 719 */                       if (size3 > 0) {
/* 723 */                           iI00100l010 = loliO00.I00100l0(i9 << 3);
/* 640 */                           iI0010I0i = io1OllI.I00111O(size3, iI00100l010, size3, iI0010I0i);
/* 1738 */                          i7 += 3;
/* 1740 */                          looo1ooil2 = looo1ooil;
/* 1742 */                          i5 = 1048575;
                                } else {
/* 1738 */                          i7 += 3;
/* 1740 */                          looo1ooil2 = looo1ooil;
/* 1742 */                          i5 = 1048575;
                                }
                            case 42:
/* 688 */                       List list16 = (List) unsafe.getObject(looo1ooil2, j);
/* 690 */                       i1i0olI i1i0oli17 = o0OIIlOIl01I.I00000oIO;
/* 692 */                       size2 = list16.size();
/* 696 */                       if (size2 > 0) {
/* 700 */                           iI00100l09 = loliO00.I00100l0(i9 << 3);
/* 572 */                           iI0010I0i = io1OllI.I00111O(size2, iI00100l09, size2, iI0010I0i);
/* 1738 */                          i7 += 3;
/* 1740 */                          looo1ooil2 = looo1ooil;
/* 1742 */                          i5 = 1048575;
                                } else {
/* 1738 */                          i7 += 3;
/* 1740 */                          looo1ooil2 = looo1ooil;
/* 1742 */                          i5 = 1048575;
                                }
                            case 43:
/* 671 */                       size2 = o0OIIlOIl01I.I00100l0((List) unsafe.getObject(looo1ooil2, j));
/* 675 */                       if (size2 > 0) {
/* 679 */                           iI00100l09 = loliO00.I00100l0(i9 << 3);
/* 572 */                           iI0010I0i = io1OllI.I00111O(size2, iI00100l09, size2, iI0010I0i);
/* 1738 */                          i7 += 3;
/* 1740 */                          looo1ooil2 = looo1ooil;
/* 1742 */                          i5 = 1048575;
                                } else {
/* 1738 */                          i7 += 3;
/* 1740 */                          looo1ooil2 = looo1ooil;
/* 1742 */                          i5 = 1048575;
                                }
                            case 44:
/* 652 */                       size2 = o0OIIlOIl01I.I000OOo1O((List) unsafe.getObject(looo1ooil2, j));
/* 656 */                       if (size2 > 0) {
/* 660 */                           iI00100l09 = loliO00.I00100l0(i9 << 3);
/* 572 */                           iI0010I0i = io1OllI.I00111O(size2, iI00100l09, size2, iI0010I0i);
/* 1738 */                          i7 += 3;
/* 1740 */                          looo1ooil2 = looo1ooil;
/* 1742 */                          i5 = 1048575;
                                } else {
/* 1738 */                          i7 += 3;
/* 1740 */                          looo1ooil2 = looo1ooil;
/* 1742 */                          i5 = 1048575;
                                }
                            case BuildConfig.VERSION_CODE:
/* 623 */                       List list17 = (List) unsafe.getObject(looo1ooil2, j);
/* 625 */                       i1i0olI i1i0oli18 = o0OIIlOIl01I.I00000oIO;
/* 631 */                       size3 = list17.size() * 4;
/* 632 */                       if (size3 > 0) {
/* 636 */                           iI00100l010 = loliO00.I00100l0(i9 << 3);
/* 640 */                           iI0010I0i = io1OllI.I00111O(size3, iI00100l010, size3, iI0010I0i);
/* 1738 */                          i7 += 3;
/* 1740 */                          looo1ooil2 = looo1ooil;
/* 1742 */                          i5 = 1048575;
                                } else {
/* 1738 */                          i7 += 3;
/* 1740 */                          looo1ooil2 = looo1ooil;
/* 1742 */                          i5 = 1048575;
                                }
                            case 46:
/* 601 */                       List list18 = (List) unsafe.getObject(looo1ooil2, j);
/* 603 */                       i1i0olI i1i0oli19 = o0OIIlOIl01I.I00000oIO;
/* 609 */                       size2 = list18.size() * 8;
/* 610 */                       if (size2 > 0) {
/* 614 */                           iI00100l09 = loliO00.I00100l0(i9 << 3);
/* 572 */                           iI0010I0i = io1OllI.I00111O(size2, iI00100l09, size2, iI0010I0i);
/* 1738 */                          i7 += 3;
/* 1740 */                          looo1ooil2 = looo1ooil;
/* 1742 */                          i5 = 1048575;
                                } else {
/* 1738 */                          i7 += 3;
/* 1740 */                          looo1ooil2 = looo1ooil;
/* 1742 */                          i5 = 1048575;
                                }
                            case 47:
/* 584 */                       size2 = o0OIIlOIl01I.I000o00OoI0I((List) unsafe.getObject(looo1ooil2, j));
/* 588 */                       if (size2 > 0) {
/* 592 */                           iI00100l09 = loliO00.I00100l0(i9 << 3);
/* 572 */                           iI0010I0i = io1OllI.I00111O(size2, iI00100l09, size2, iI0010I0i);
/* 1738 */                          i7 += 3;
/* 1740 */                          looo1ooil2 = looo1ooil;
/* 1742 */                          i5 = 1048575;
                                } else {
/* 1738 */                          i7 += 3;
/* 1740 */                          looo1ooil2 = looo1ooil;
/* 1742 */                          i5 = 1048575;
                                }
                            case 48:
/* 560 */                       size2 = o0OIIlOIl01I.I000oI1ioi((List) unsafe.getObject(looo1ooil2, j));
/* 564 */                       if (size2 > 0) {
/* 568 */                           iI00100l09 = loliO00.I00100l0(i9 << 3);
/* 572 */                           iI0010I0i = io1OllI.I00111O(size2, iI00100l09, size2, iI0010I0i);
/* 1738 */                          i7 += 3;
/* 1740 */                          looo1ooil2 = looo1ooil;
/* 1742 */                          i5 = 1048575;
                                } else {
/* 1738 */                          i7 += 3;
/* 1740 */                          looo1ooil2 = looo1ooil;
/* 1742 */                          i5 = 1048575;
                                }
                            case 49:
/* 507 */                       List list19 = (List) unsafe.getObject(looo1ooil2, j);
/* 509 */                       o0O1iOilloll o0o1ioillollI001iOo1i0O4 = o0iii1l1ol.I001iOo1i0O(i7);
/* 513 */                       i1i0olI i1i0oli20 = o0OIIlOIl01I.I00000oIO;
/* 515 */                       int size8 = list19.size();
/* 519 */                       if (size8 == 0) {
/* 521 */                           iI00000oIO4 = 0;
                                } else {
/* 526 */                           iI00000oIO4 = 0;
/* 527 */                           for (int i20 = 0; i20 < size8; i20++) {
/* 533 */                               loOo1oOil looo1ooil4 = (loOo1oOil) list19.get(i20);
/* 537 */                               int iI00100l015 = loliO00.I00100l0(i9 << 3);
/* 547 */                               iI00000oIO4 += looo1ooil4.I00000oIO(o0o1ioillollI001iOo1i0O4) + iI00100l015 + iI00100l015;
                                    }
                                }
/* 551 */                       iI0010I0i += iI00000oIO4;
/* 1738 */                      i7 += 3;
/* 1740 */                      looo1ooil2 = looo1ooil;
/* 1742 */                      i5 = 1048575;
                            case 50:
/* 448 */                       Object object3 = unsafe.getObject(looo1ooil2, j);
/* 452 */                       int i21 = i7 / 3;
/* 459 */                       o01lOilIiI o01loiliii = (o01lOilIiI) object3;
/* 461 */                       if (o0iii1l1ol.I00000oOI[i21 + i21] != null) {
/* 499 */                           OIiilo1Ool0o.I00000oIO();
/* 36 */                            return 0;
                                }
/* 467 */                       if (o01loiliii.isEmpty()) {
                                    continue;
                                } else {
/* 473 */                           Iterator it = o01loiliii.entrySet().iterator();
/* 481 */                           if (it.hasNext()) {
/* 489 */                               Map.Entry entry = (Map.Entry) it.next();
/* 491 */                               entry.getKey();
/* 494 */                               entry.getValue();
/* 498 */                               throw null;
                                    }
                                }
/* 1738 */                      i7 += 3;
/* 1740 */                      looo1ooil2 = looo1ooil;
/* 1742 */                      i5 = 1048575;
                            case 51:
/* 444 */                       if (o0iii1l1ol.I00100l0(looo1ooil2, i9, i7)) {
/* 180 */                           iI0010I0i = io1OllI.I0010I0i(i9 << 3, 8, iI0010I0i);
                                }
/* 1738 */                      i7 += 3;
/* 1740 */                      looo1ooil2 = looo1ooil;
/* 1742 */                      i5 = 1048575;
                            case 52:
/* 436 */                       if (!o0iii1l1ol.I00100l0(looo1ooil2, i9, i7)) {
/* 1738 */                          i7 += 3;
/* 1740 */                          looo1ooil2 = looo1ooil;
/* 1742 */                          i5 = 1048575;
                                }
/* 192 */                       iI0010o = i9 << 3;
/* 166 */                       iI0010I0i = io1OllI.I0010I0i(iI0010o, iI00100l013, iI0010I0i);
/* 1738 */                      i7 += 3;
/* 1740 */                      looo1ooil2 = looo1ooil;
/* 1742 */                      i5 = 1048575;
                            case 53:
/* 414 */                       if (o0iii1l1ol.I00100l0(looo1ooil2, i9, i7)) {
/* 418 */                           long jI001i1O0Ol = I001i1O0Ol(j, looo1ooil2);
/* 422 */                           iI00100l011 = loliO00.I00100l0(i9 << 3);
/* 426 */                           iI00000oIO5 = loliO00.I00000oIO(jI001i1O0Ol);
/* 142 */                           iI0010I0i += iI00000oIO5 + iI00100l011;
/* 1738 */                          i7 += 3;
/* 1740 */                          looo1ooil2 = looo1ooil;
/* 1742 */                          i5 = 1048575;
                                } else {
/* 1738 */                          i7 += 3;
/* 1740 */                          looo1ooil2 = looo1ooil;
/* 1742 */                          i5 = 1048575;
                                }
                            case 54:
/* 392 */                       if (o0iii1l1ol.I00100l0(looo1ooil2, i9, i7)) {
/* 396 */                           long jI001i1O0Ol2 = I001i1O0Ol(j, looo1ooil2);
/* 400 */                           iI00100l011 = loliO00.I00100l0(i9 << 3);
/* 404 */                           iI00000oIO5 = loliO00.I00000oIO(jI001i1O0Ol2);
/* 142 */                           iI0010I0i += iI00000oIO5 + iI00100l011;
/* 1738 */                          i7 += 3;
/* 1740 */                          looo1ooil2 = looo1ooil;
/* 1742 */                          i5 = 1048575;
                                } else {
/* 1738 */                          i7 += 3;
/* 1740 */                          looo1ooil2 = looo1ooil;
/* 1742 */                          i5 = 1048575;
                                }
                            case 55:
/* 369 */                       if (o0iii1l1ol.I00100l0(looo1ooil2, i9, i7)) {
/* 373 */                           long jI0010o = I0010o(j, looo1ooil2);
/* 378 */                           iI00100l011 = loliO00.I00100l0(i9 << 3);
/* 382 */                           iI00000oIO5 = loliO00.I00000oIO(jI0010o);
/* 142 */                           iI0010I0i += iI00000oIO5 + iI00100l011;
/* 1738 */                          i7 += 3;
/* 1740 */                          looo1ooil2 = looo1ooil;
/* 1742 */                          i5 = 1048575;
                                } else {
/* 1738 */                          i7 += 3;
/* 1740 */                          looo1ooil2 = looo1ooil;
/* 1742 */                          i5 = 1048575;
                                }
                            case 56:
/* 361 */                       if (o0iii1l1ol.I00100l0(looo1ooil2, i9, i7)) {
                                }
/* 1738 */                      i7 += 3;
/* 1740 */                      looo1ooil2 = looo1ooil;
/* 1742 */                      i5 = 1048575;
                                break;
                            case 57:
/* 353 */                       if (!o0iii1l1ol.I00100l0(looo1ooil2, i9, i7)) {
/* 1738 */                          i7 += 3;
/* 1740 */                          looo1ooil2 = looo1ooil;
/* 1742 */                          i5 = 1048575;
                                }
/* 192 */                       iI0010o = i9 << 3;
/* 166 */                       iI0010I0i = io1OllI.I0010I0i(iI0010o, iI00100l013, iI0010I0i);
/* 1738 */                      i7 += 3;
/* 1740 */                      looo1ooil2 = looo1ooil;
/* 1742 */                      i5 = 1048575;
                            case 58:
/* 339 */                       if (o0iii1l1ol.I00100l0(looo1ooil2, i9, i7)) {
/* 343 */                           iI0010I0i = io1OllI.I0010I0i(i9 << 3, 1, iI0010I0i);
                                }
/* 1738 */                      i7 += 3;
/* 1740 */                      looo1ooil2 = looo1ooil;
/* 1742 */                      i5 = 1048575;
                            case 59:
/* 300 */                       if (o0iii1l1ol.I00100l0(looo1ooil2, i9, i7)) {
/* 302 */                           int i22 = i9 << 3;
/* 304 */                           Object object4 = unsafe.getObject(looo1ooil2, j);
/* 310 */                           if (object4 instanceof lol1I010) {
/* 314 */                               iI00100l012 = loliO00.I00100l0(i22);
/* 318 */                               iI0000oI002 = ((lol1I010) object4).I0000oI00();
/* 256 */                               iI0010I0i = io1OllI.I00111O(iI0000oI002, iI0000oI002, iI00100l012, iI0010I0i);
/* 1738 */                              i7 += 3;
/* 1740 */                              looo1ooil2 = looo1ooil;
/* 1742 */                              i5 = 1048575;
                                    } else {
/* 325 */                               iI00100l011 = loliO00.I00100l0(i22);
/* 329 */                               iI00000oIO5 = loliO00.I000oI1ioi((String) object4);
/* 142 */                               iI0010I0i += iI00000oIO5 + iI00100l011;
/* 1738 */                              i7 += 3;
/* 1740 */                              looo1ooil2 = looo1ooil;
/* 1742 */                              i5 = 1048575;
                                    }
                                } else {
/* 1738 */                          i7 += 3;
/* 1740 */                          looo1ooil2 = looo1ooil;
/* 1742 */                          i5 = 1048575;
                                }
                            case 60:
/* 266 */                       if (o0iii1l1ol.I00100l0(looo1ooil2, i9, i7)) {
/* 268 */                           Object object5 = unsafe.getObject(looo1ooil2, j);
/* 272 */                           o0O1iOilloll o0o1ioillollI001iOo1i0O5 = o0iii1l1ol.I001iOo1i0O(i7);
/* 276 */                           i1i0olI i1i0oli21 = o0OIIlOIl01I.I00000oIO;
/* 282 */                           iI00100l03 = loliO00.I00100l0(i9 << 3);
/* 286 */                           iI00000oIO2 = ((loOo1oOil) object5).I00000oIO(o0o1ioillollI001iOo1i0O5);
/* 290 */                           iI0010I0i = io1OllI.I00111O(iI00000oIO2, iI00000oIO2, iI00100l03, iI0010I0i);
/* 1738 */                          i7 += 3;
/* 1740 */                          looo1ooil2 = looo1ooil;
/* 1742 */                          i5 = 1048575;
                                } else {
/* 1738 */                          i7 += 3;
/* 1740 */                          looo1ooil2 = looo1ooil;
/* 1742 */                          i5 = 1048575;
                                }
                            case 61:
/* 238 */                       if (o0iii1l1ol.I00100l0(looo1ooil2, i9, i7)) {
/* 246 */                           lol1I010 lol1i0102 = (lol1I010) unsafe.getObject(looo1ooil2, j);
/* 248 */                           iI00100l012 = loliO00.I00100l0(i9 << 3);
/* 252 */                           iI0000oI002 = lol1i0102.I0000oI00();
/* 256 */                           iI0010I0i = io1OllI.I00111O(iI0000oI002, iI0000oI002, iI00100l012, iI0010I0i);
/* 1738 */                          i7 += 3;
/* 1740 */                          looo1ooil2 = looo1ooil;
/* 1742 */                          i5 = 1048575;
                                } else {
/* 1738 */                          i7 += 3;
/* 1740 */                          looo1ooil2 = looo1ooil;
/* 1742 */                          i5 = 1048575;
                                }
                            case 62:
/* 221 */                       if (o0iii1l1ol.I00100l0(looo1ooil2, i9, i7)) {
/* 225 */                           iI0010o = I0010o(j, looo1ooil2);
/* 229 */                           iI00100l013 = loliO00.I00100l0(i9 << 3);
/* 166 */                           iI0010I0i = io1OllI.I0010I0i(iI0010o, iI00100l013, iI0010I0i);
/* 1738 */                          i7 += 3;
/* 1740 */                          looo1ooil2 = looo1ooil;
/* 1742 */                          i5 = 1048575;
                                } else {
/* 1738 */                          i7 += 3;
/* 1740 */                          looo1ooil2 = looo1ooil;
/* 1742 */                          i5 = 1048575;
                                }
                            case 63:
/* 199 */                       if (o0iii1l1ol.I00100l0(looo1ooil2, i9, i7)) {
/* 203 */                           long jI0010o2 = I0010o(j, looo1ooil2);
/* 208 */                           iI00100l011 = loliO00.I00100l0(i9 << 3);
/* 212 */                           iI00000oIO5 = loliO00.I00000oIO(jI0010o2);
/* 142 */                           iI0010I0i += iI00000oIO5 + iI00100l011;
/* 1738 */                          i7 += 3;
/* 1740 */                          looo1ooil2 = looo1ooil;
/* 1742 */                          i5 = 1048575;
                                } else {
/* 1738 */                          i7 += 3;
/* 1740 */                          looo1ooil2 = looo1ooil;
/* 1742 */                          i5 = 1048575;
                                }
                            case Barcode.FORMAT_EAN_8:
/* 190 */                       if (!o0iii1l1ol.I00100l0(looo1ooil2, i9, i7)) {
/* 1738 */                          i7 += 3;
/* 1740 */                          looo1ooil2 = looo1ooil;
/* 1742 */                          i5 = 1048575;
                                }
/* 192 */                       iI0010o = i9 << 3;
/* 166 */                       iI0010I0i = io1OllI.I0010I0i(iI0010o, iI00100l013, iI0010I0i);
/* 1738 */                      i7 += 3;
/* 1740 */                      looo1ooil2 = looo1ooil;
/* 1742 */                      i5 = 1048575;
                            case 65:
/* 176 */                       if (o0iii1l1ol.I00100l0(looo1ooil2, i9, i7)) {
                                }
/* 1738 */                      i7 += 3;
/* 1740 */                      looo1ooil2 = looo1ooil;
/* 1742 */                      i5 = 1048575;
                                break;
                            case 66:
/* 149 */                       if (o0iii1l1ol.I00100l0(looo1ooil2, i9, i7)) {
/* 153 */                           int iI0010o2 = I0010o(j, looo1ooil2);
/* 161 */                           iI00100l013 = loliO00.I00100l0(i9 << 3);
/* 165 */                           iI0010o = (iI0010o2 >> 31) ^ (iI0010o2 + iI0010o2);
/* 166 */                           iI0010I0i = io1OllI.I0010I0i(iI0010o, iI00100l013, iI0010I0i);
/* 1738 */                          i7 += 3;
/* 1740 */                          looo1ooil2 = looo1ooil;
/* 1742 */                          i5 = 1048575;
                                } else {
/* 1738 */                          i7 += 3;
/* 1740 */                          looo1ooil2 = looo1ooil;
/* 1742 */                          i5 = 1048575;
                                }
                            case 67:
/* 120 */                       if (o0iii1l1ol.I00100l0(looo1ooil2, i9, i7)) {
/* 124 */                           long jI001i1O0Ol3 = I001i1O0Ol(j, looo1ooil2);
/* 132 */                           iI00100l011 = loliO00.I00100l0(i9 << 3);
/* 137 */                           iI00000oIO5 = loliO00.I00000oIO((jI001i1O0Ol3 >> 63) ^ (jI001i1O0Ol3 + jI001i1O0Ol3));
/* 142 */                           iI0010I0i += iI00000oIO5 + iI00100l011;
/* 1738 */                          i7 += 3;
/* 1740 */                          looo1ooil2 = looo1ooil;
/* 1742 */                          i5 = 1048575;
                                } else {
/* 1738 */                          i7 += 3;
/* 1740 */                          looo1ooil2 = looo1ooil;
/* 1742 */                          i5 = 1048575;
                                }
                            case 68:
/* 89 */                        if (o0iii1l1ol.I00100l0(looo1ooil2, i9, i7)) {
/* 95 */                            loOo1oOil looo1ooil5 = (loOo1oOil) unsafe.getObject(looo1ooil2, j);
/* 97 */                            o0O1iOilloll o0o1ioillollI001iOo1i0O6 = o0iii1l1ol.I001iOo1i0O(i7);
/* 103 */                           int iI00100l016 = loliO00.I00100l0(i9 << 3);
/* 107 */                           i4 = iI00100l016 + iI00100l016;
/* 108 */                           iI00000oIO3 = looo1ooil5.I00000oIO(o0o1ioillollI001iOo1i0O6);
/* 112 */                           iI000iOII = iI00000oIO3 + i4;
/* 113 */                           iI0010I0i += iI000iOII;
/* 1738 */                          i7 += 3;
/* 1740 */                          looo1ooil2 = looo1ooil;
/* 1742 */                          i5 = 1048575;
                                } else {
/* 1738 */                          i7 += 3;
/* 1740 */                          looo1ooil2 = looo1ooil;
/* 1742 */                          i5 = 1048575;
                                }
                            default:
/* 1738 */                      i7 += 3;
/* 1740 */                      looo1ooil2 = looo1ooil;
/* 1742 */                      i5 = 1048575;
                        }
                    }
/* 1747 */          int iI00000oIO7 = 0;
/* 1759 */          int iI00000oIO8 = ((o001IlOi0O) looo1ooil).zzc.I00000oIO() + iI0010I0i;
/* 1762 */          if (!o0iii1l1ol.I0001Ioi1lo) {
/* 1838 */              return iI00000oIO8;
                    }
/* 1768 */          looOi1oiO loooi1oio = ((looo1olo1) looo1ooil).zzb;
/* 1772 */          int i23 = loooi1oio.I00000oIO.I00iiI;
/* 1774 */          int i24 = 0;
                    while (true) {
/* 1776 */              o0OIiOo0oOi o0oiioo0ooi = loooi1oio.I00000oIO;
/* 1778 */              if (i24 >= i23) {
/* 1811 */                  for (Map.Entry entry2 : o0oiioo0ooi.I00000oIO()) {
/* 1833 */                      iI00000oIO7 = looOi1oiO.I00000oIO((looolOIIo) entry2.getKey(), entry2.getValue()) + iI00000oIO7;
                            }
/* 1836 */                  return iI00000oIO8 + iI00000oIO7;
                        }
/* 1780 */              o0OOOl0I1IO1 o0oool0i1io1I0000Il00O = o0oiioo0ooi.I0000Il00O(i24);
/* 1794 */              iI00000oIO7 = looOi1oiO.I00000oIO((looolOIIo) o0oool0i1io1I0000Il00O.I00iOIl, o0oool0i1io1I0000Il00O.I00iiI) + iI00000oIO7;
/* 1796 */              i24++;
                    }
                }

                @Override
                public final boolean I0000oI00(o001IlOi0O o001iloi0o, o001IlOi0O o001iloi0o2) {
                    boolean zI000O01llI0;
/* 1 */             int[] iArr = this.I00000oIO;
/* 4 */             int i = 0;
                    while (true) {
/* 6 */                 if (i < iArr.length) {
/* 8 */                     int iI001IO000 = I001IO000(i);
/* 15 */                    long j = iI001IO000 & 1048575;
                            switch (I001IIilI0O(iI001IO000)) {
                                case 0:
/* 432 */                           if (!I000l1(o001iloi0o, o001iloi0o2, i)) {
                                        break;
                                    } else {
/* 434 */                               Ooil0oIOI0l0 ooil0oIOI0l0 = o0ii0oo.I0000Il00O;
/* 454 */                               if (Double.doubleToLongBits(ooil0oIOI0l0.I0010I0i(o001iloi0o, j)) != Double.doubleToLongBits(ooil0oIOI0l0.I0010I0i(o001iloi0o2, j))) {
                                            break;
                                        } else {
                                            continue;
/* 456 */                                   i += 3;
                                        }
                                    }
                                case 1:
/* 405 */                           if (!I000l1(o001iloi0o, o001iloi0o2, i)) {
                                        break;
                                    } else {
/* 407 */                               Ooil0oIOI0l0 ooil0oIOI0l02 = o0ii0oo.I0000Il00O;
/* 425 */                               if (Float.floatToIntBits(ooil0oIOI0l02.I001IIilI0O(o001iloi0o, j)) != Float.floatToIntBits(ooil0oIOI0l02.I001IIilI0O(o001iloi0o2, j))) {
                                            break;
                                        } else {
                                            continue;
/* 456 */                                   i += 3;
                                        }
                                    }
                                case 2:
/* 386 */                           if (!I000l1(o001iloi0o, o001iloi0o2, i) || o0ii0oo.I0001Ioi1lo(o001iloi0o, j) != o0ii0oo.I0001Ioi1lo(o001iloi0o2, j)) {
                                        break;
                                    } else {
                                        continue;
/* 456 */                               i += 3;
                                    }
                                    break;
                                case 3:
/* 367 */                           if (!I000l1(o001iloi0o, o001iloi0o2, i) || o0ii0oo.I0001Ioi1lo(o001iloi0o, j) != o0ii0oo.I0001Ioi1lo(o001iloi0o2, j)) {
                                        break;
                                    } else {
                                        continue;
/* 456 */                               i += 3;
                                    }
                                    break;
                                case 4:
/* 350 */                           if (!I000l1(o001iloi0o, o001iloi0o2, i) || o0ii0oo.I0000oI00(o001iloi0o, j) != o0ii0oo.I0000oI00(o001iloi0o2, j)) {
                                        break;
                                    } else {
                                        continue;
/* 456 */                               i += 3;
                                    }
                                    break;
                                case 5:
/* 330 */                           if (!I000l1(o001iloi0o, o001iloi0o2, i) || o0ii0oo.I0001Ioi1lo(o001iloi0o, j) != o0ii0oo.I0001Ioi1lo(o001iloi0o2, j)) {
                                        break;
                                    } else {
                                        continue;
/* 456 */                               i += 3;
                                    }
                                    break;
                                case 6:
/* 312 */                           if (!I000l1(o001iloi0o, o001iloi0o2, i) || o0ii0oo.I0000oI00(o001iloi0o, j) != o0ii0oo.I0000oI00(o001iloi0o2, j)) {
                                        break;
                                    } else {
                                        continue;
/* 456 */                               i += 3;
                                    }
                                    break;
                                case 7:
/* 292 */                           if (!I000l1(o001iloi0o, o001iloi0o2, i)) {
                                        break;
                                    } else {
/* 294 */                               Ooil0oIOI0l0 ooil0oIOI0l03 = o0ii0oo.I0000Il00O;
/* 304 */                               if (ooil0oIOI0l03.I00Io1o110i(o001iloi0o, j) != ooil0oIOI0l03.I00Io1o110i(o001iloi0o2, j)) {
                                            break;
                                        } else {
                                            continue;
/* 456 */                                   i += 3;
                                        }
                                    }
                                case 8:
/* 270 */                           if (!I000l1(o001iloi0o, o001iloi0o2, i) || !o0OIIlOIl01I.I000O01llI0(o0ii0oo.I000II(o001iloi0o, j), o0ii0oo.I000II(o001iloi0o2, j))) {
                                        break;
                                    } else {
                                        continue;
/* 456 */                               i += 3;
                                    }
                                    break;
                                case 9:
/* 248 */                           if (!I000l1(o001iloi0o, o001iloi0o2, i) || !o0OIIlOIl01I.I000O01llI0(o0ii0oo.I000II(o001iloi0o, j), o0ii0oo.I000II(o001iloi0o2, j))) {
                                        break;
                                    } else {
                                        continue;
/* 456 */                               i += 3;
                                    }
                                    break;
                                case 10:
/* 226 */                           if (!I000l1(o001iloi0o, o001iloi0o2, i) || !o0OIIlOIl01I.I000O01llI0(o0ii0oo.I000II(o001iloi0o, j), o0ii0oo.I000II(o001iloi0o2, j))) {
                                        break;
                                    } else {
                                        continue;
/* 456 */                               i += 3;
                                    }
                                    break;
                                case 11:
/* 208 */                           if (!I000l1(o001iloi0o, o001iloi0o2, i) || o0ii0oo.I0000oI00(o001iloi0o, j) != o0ii0oo.I0000oI00(o001iloi0o2, j)) {
                                        break;
                                    } else {
                                        continue;
/* 456 */                               i += 3;
                                    }
                                    break;
                                case 12:
/* 190 */                           if (!I000l1(o001iloi0o, o001iloi0o2, i) || o0ii0oo.I0000oI00(o001iloi0o, j) != o0ii0oo.I0000oI00(o001iloi0o2, j)) {
                                        break;
                                    } else {
                                        continue;
/* 456 */                               i += 3;
                                    }
                                    break;
                                case 13:
/* 172 */                           if (!I000l1(o001iloi0o, o001iloi0o2, i) || o0ii0oo.I0000oI00(o001iloi0o, j) != o0ii0oo.I0000oI00(o001iloi0o2, j)) {
                                        break;
                                    } else {
                                        continue;
/* 456 */                               i += 3;
                                    }
                                    break;
                                case 14:
/* 152 */                           if (!I000l1(o001iloi0o, o001iloi0o2, i) || o0ii0oo.I0001Ioi1lo(o001iloi0o, j) != o0ii0oo.I0001Ioi1lo(o001iloi0o2, j)) {
                                        break;
                                    } else {
                                        continue;
/* 456 */                               i += 3;
                                    }
                                    break;
                                case 15:
/* 134 */                           if (!I000l1(o001iloi0o, o001iloi0o2, i) || o0ii0oo.I0000oI00(o001iloi0o, j) != o0ii0oo.I0000oI00(o001iloi0o2, j)) {
                                        break;
                                    } else {
                                        continue;
/* 456 */                               i += 3;
                                    }
                                    break;
                                case 16:
/* 114 */                           if (!I000l1(o001iloi0o, o001iloi0o2, i) || o0ii0oo.I0001Ioi1lo(o001iloi0o, j) != o0ii0oo.I0001Ioi1lo(o001iloi0o2, j)) {
                                        break;
                                    } else {
                                        continue;
/* 456 */                               i += 3;
                                    }
                                    break;
                                case 17:
/* 92 */                            if (!I000l1(o001iloi0o, o001iloi0o2, i) || !o0OIIlOIl01I.I000O01llI0(o0ii0oo.I000II(o001iloi0o, j), o0ii0oo.I000II(o001iloi0o2, j))) {
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
/* 80 */                            zI000O01llI0 = o0OIIlOIl01I.I000O01llI0(o0ii0oo.I000II(o001iloi0o, j), o0ii0oo.I000II(o001iloi0o2, j));
                                    break;
                                case 50:
/* 67 */                            zI000O01llI0 = o0OIIlOIl01I.I000O01llI0(o0ii0oo.I000II(o001iloi0o, j), o0ii0oo.I000II(o001iloi0o2, j));
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
/* 41 */                            if (o0ii0oo.I0000oI00(o001iloi0o, j2) != o0ii0oo.I0000oI00(o001iloi0o2, j2) || !o0OIIlOIl01I.I000O01llI0(o0ii0oo.I000II(o001iloi0o, j), o0ii0oo.I000II(o001iloi0o2, j))) {
                                        break;
                                    } else {
                                        continue;
/* 456 */                               i += 3;
                                    }
                                    break;
                                default:
/* 456 */                           i += 3;
                            }
/* 84 */                    if (zI000O01llI0) {
/* 456 */                       i += 3;
                            }
                        } else if (o001iloi0o.zzc.equals(o001iloi0o2.zzc)) {
/* 473 */                   if (this.I0001Ioi1lo) {
/* 483 */                       return ((looo1olo1) o001iloi0o).zzb.equals(((looo1olo1) o001iloi0o2).zzb);
                            }
/* 488 */                   return true;
                        }
                    }
/* 3 */             return false;
                }

                @Override
                public final void I0001Ioi1lo(Object obj, byte[] bArr, int i, int i2, i111i0I1 i111i0i1) throws o010O1 {
/* 8 */             I00100o1O0lo(obj, bArr, i, i2, 0, i111i0i1);
                }

                /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
                /* JADX WARN: Removed duplicated region for block: B:7:0x0027  */
                @Override
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final void I000II(Object obj, o0iO1llOoO o0io1llooo) throws IOO1IOl1O10 {
                    Map.Entry entry;
                    Iterator it;
                    int i;
                    int i2;
                    Map.Entry entry2;
                    int i3;
                    int i4;
                    boolean z;
/* 1 */             o0IiI1l1Ol o0iii1l1ol = this;
/* 7 */             o0llIi o0llii = o0iii1l1ol.I000iOII;
/* 9 */             int[] iArr = o0iii1l1ol.I00000oIO;
/* 13 */            if (o0iii1l1ol.I0001Ioi1lo) {
/* 18 */                looOi1oiO loooi1oio = ((looo1olo1) obj).zzb;
/* 26 */                if (loooi1oio.I00000oIO.isEmpty()) {
/* 40 */                    entry = null;
/* 41 */                    it = null;
                        } else {
/* 28 */                    Iterator itI0000Il00O = loooi1oio.I0000Il00O();
/* 36 */                    entry = (Map.Entry) itI0000Il00O.next();
/* 38 */                    it = itI0000Il00O;
                        }
                    }
/* 42 */            int i5 = 1048575;
/* 45 */            int i6 = 1048575;
/* 46 */            int i7 = 0;
/* 47 */            int i8 = 0;
/* 49 */            while (i7 < iArr.length) {
/* 51 */                int iI001IO000 = o0iii1l1ol.I001IO000(i7);
/* 55 */                int iI001IIilI0O = I001IIilI0O(iI001IO000);
/* 59 */                int i9 = iArr[i7];
/* 65 */                Unsafe unsafe = I000lI;
/* 67 */                if (iI001IIilI0O <= 17) {
/* 71 */                    int i10 = iArr[i7 + 2];
/* 73 */                    Map.Entry entry3 = entry;
/* 75 */                    int i11 = i10 & i5;
/* 77 */                    if (i11 != i6) {
/* 84 */                        i8 = i11 == i5 ? 0 : unsafe.getInt(obj, i11);
/* 89 */                        i6 = i11;
                            }
/* 92 */                    int i12 = 1 << (i10 >>> 20);
/* 94 */                    int i13 = i8;
/* 95 */                    i3 = i12;
/* 96 */                    i = i6;
/* 97 */                    i2 = i13;
/* 98 */                    entry2 = entry3;
                        } else {
/* 101 */                   Map.Entry entry4 = entry;
/* 103 */                   i = i6;
/* 104 */                   i2 = i8;
/* 105 */                   entry2 = entry4;
/* 107 */                   i3 = 0;
                        }
                        while (true) {
/* 108 */                   if (entry2 != null) {
/* 116 */                       i4 = i5;
/* 121 */                       if (i9 >= 202056002) {
/* 123 */                           o0llii.getClass();
/* 126 */                           o0llIi.I00IOO(o0io1llooo, entry2);
/* 133 */                           if (it.hasNext()) {
/* 139 */                               entry2 = (Map.Entry) it.next();
/* 141 */                               i5 = i4;
                                    } else {
/* 144 */                               i5 = i4;
/* 146 */                               entry2 = null;
                                    }
                                }
                            } else {
/* 148 */                       i4 = i5;
                            }
                        }
/* 150 */               int i14 = iI001IO000 & i4;
/* 152 */               o0llIi o0llii2 = o0llii;
/* 153 */               int[] iArr2 = iArr;
                        long j = i14;
                        switch (iI001IIilI0O) {
                            case 0:
/* 1520 */                      if (o0iii1l1ol.I000o00OoI0I(obj, i7, i, i2, i3)) {
/* 1536 */                          ((loliO00) o0io1llooo.I00000oIO).I000II(i9, Double.doubleToRawLongBits(o0ii0oo.I0000Il00O.I0010I0i(obj, j)));
                                }
/* 1539 */                      i7 += 3;
/* 1541 */                      o0iii1l1ol = this;
/* 1543 */                      i8 = i2;
/* 1544 */                      o0llii = o0llii2;
/* 1545 */                      i5 = i4;
/* 1547 */                      iArr = iArr2;
/* 1549 */                      i6 = i;
/* 1550 */                      entry = entry2;
                            case 1:
/* 1495 */                      if (o0iii1l1ol.I000o00OoI0I(obj, i7, i, i2, i3)) {
/* 1511 */                          ((loliO00) o0io1llooo.I00000oIO).I0000oI00(i9, Float.floatToRawIntBits(o0ii0oo.I0000Il00O.I001IIilI0O(obj, j)));
                                }
/* 1539 */                      i7 += 3;
/* 1541 */                      o0iii1l1ol = this;
/* 1543 */                      i8 = i2;
/* 1544 */                      o0llii = o0llii2;
/* 1545 */                      i5 = i4;
/* 1547 */                      iArr = iArr2;
/* 1549 */                      i6 = i;
/* 1550 */                      entry = entry2;
                            case 2:
/* 1476 */                      if (o0iii1l1ol.I000o00OoI0I(obj, i7, i, i2, i3)) {
/* 1486 */                          ((loliO00) o0io1llooo.I00000oIO).I000lI(i9, unsafe.getLong(obj, j));
                                }
/* 1539 */                      i7 += 3;
/* 1541 */                      o0iii1l1ol = this;
/* 1543 */                      i8 = i2;
/* 1544 */                      o0llii = o0llii2;
/* 1545 */                      i5 = i4;
/* 1547 */                      iArr = iArr2;
/* 1549 */                      i6 = i;
/* 1550 */                      entry = entry2;
                            case 3:
/* 1457 */                      if (o0iii1l1ol.I000o00OoI0I(obj, i7, i, i2, i3)) {
/* 1467 */                          ((loliO00) o0io1llooo.I00000oIO).I000lI(i9, unsafe.getLong(obj, j));
                                }
/* 1539 */                      i7 += 3;
/* 1541 */                      o0iii1l1ol = this;
/* 1543 */                      i8 = i2;
/* 1544 */                      o0llii = o0llii2;
/* 1545 */                      i5 = i4;
/* 1547 */                      iArr = iArr2;
/* 1549 */                      i6 = i;
/* 1550 */                      entry = entry2;
                            case 4:
/* 1426 */                      if (o0iii1l1ol.I000o00OoI0I(obj, i7, i, i2, i3)) {
/* 1428 */                          int i15 = unsafe.getInt(obj, j);
/* 1434 */                          loliO00 lolio00 = (loliO00) o0io1llooo.I00000oIO;
/* 1438 */                          lolio00.I000l1(i9 << 3);
/* 1441 */                          if (i15 >= 0) {
/* 1443 */                              lolio00.I000l1(i15);
                                    } else {
/* 1448 */                              lolio00.I000o00OoI0I(i15);
                                    }
                                }
/* 1539 */                      i7 += 3;
/* 1541 */                      o0iii1l1ol = this;
/* 1543 */                      i8 = i2;
/* 1544 */                      o0llii = o0llii2;
/* 1545 */                      i5 = i4;
/* 1547 */                      iArr = iArr2;
/* 1549 */                      i6 = i;
/* 1550 */                      entry = entry2;
                            case 5:
/* 1406 */                      if (o0iii1l1ol.I000o00OoI0I(obj, i7, i, i2, i3)) {
/* 1416 */                          ((loliO00) o0io1llooo.I00000oIO).I000II(i9, unsafe.getLong(obj, j));
                                }
/* 1539 */                      i7 += 3;
/* 1541 */                      o0iii1l1ol = this;
/* 1543 */                      i8 = i2;
/* 1544 */                      o0llii = o0llii2;
/* 1545 */                      i5 = i4;
/* 1547 */                      iArr = iArr2;
/* 1549 */                      i6 = i;
/* 1550 */                      entry = entry2;
                            case 6:
/* 1386 */                      if (o0iii1l1ol.I000o00OoI0I(obj, i7, i, i2, i3)) {
/* 1396 */                          ((loliO00) o0io1llooo.I00000oIO).I0000oI00(i9, unsafe.getInt(obj, j));
                                }
/* 1539 */                      i7 += 3;
/* 1541 */                      o0iii1l1ol = this;
/* 1543 */                      i8 = i2;
/* 1544 */                      o0llii = o0llii2;
/* 1545 */                      i5 = i4;
/* 1547 */                      iArr = iArr2;
/* 1549 */                      i6 = i;
/* 1550 */                      entry = entry2;
                            case 7:
/* 1359 */                      if (o0iii1l1ol.I000o00OoI0I(obj, i7, i, i2, i3)) {
/* 1363 */                          boolean zI00Io1o110i = o0ii0oo.I0000Il00O.I00Io1o110i(obj, j);
/* 1369 */                          loliO00 lolio002 = (loliO00) o0io1llooo.I00000oIO;
/* 1373 */                          lolio002.I000l1(i9 << 3);
/* 1376 */                          lolio002.I00000oOI(zI00Io1o110i ? (byte) 1 : (byte) 0);
                                }
/* 1539 */                      i7 += 3;
/* 1541 */                      o0iii1l1ol = this;
/* 1543 */                      i8 = i2;
/* 1544 */                      o0llii = o0llii2;
/* 1545 */                      i5 = i4;
/* 1547 */                      iArr = iArr2;
/* 1549 */                      i6 = i;
/* 1550 */                      entry = entry2;
                            case 8:
/* 1322 */                      if (o0iii1l1ol.I000o00OoI0I(obj, i7, i, i2, i3)) {
/* 1324 */                          Object object = unsafe.getObject(obj, j);
/* 1330 */                          if (object instanceof String) {
/* 1338 */                              ((loliO00) o0io1llooo.I00000oIO).I000OOo1O(i9, (String) object);
                                    } else {
/* 1349 */                              ((loliO00) o0io1llooo.I00000oIO).I0000O(i9, (lol1I010) object);
                                    }
                                }
/* 1539 */                      i7 += 3;
/* 1541 */                      o0iii1l1ol = this;
/* 1543 */                      i8 = i2;
/* 1544 */                      o0llii = o0llii2;
/* 1545 */                      i5 = i4;
/* 1547 */                      iArr = iArr2;
/* 1549 */                      i6 = i;
/* 1550 */                      entry = entry2;
                            case 9:
/* 1302 */                      if (o0iii1l1ol.I000o00OoI0I(obj, i7, i, i2, i3)) {
/* 1312 */                          o0io1llooo.I00000oOI(i9, unsafe.getObject(obj, j), o0iii1l1ol.I001iOo1i0O(i7));
                                }
/* 1539 */                      i7 += 3;
/* 1541 */                      o0iii1l1ol = this;
/* 1543 */                      i8 = i2;
/* 1544 */                      o0llii = o0llii2;
/* 1545 */                      i5 = i4;
/* 1547 */                      iArr = iArr2;
/* 1549 */                      i6 = i;
/* 1550 */                      entry = entry2;
                            case 10:
/* 1280 */                      if (o0iii1l1ol.I000o00OoI0I(obj, i7, i, i2, i3)) {
/* 1292 */                          ((loliO00) o0io1llooo.I00000oIO).I0000O(i9, (lol1I010) unsafe.getObject(obj, j));
                                }
/* 1539 */                      i7 += 3;
/* 1541 */                      o0iii1l1ol = this;
/* 1543 */                      i8 = i2;
/* 1544 */                      o0llii = o0llii2;
/* 1545 */                      i5 = i4;
/* 1547 */                      iArr = iArr2;
/* 1549 */                      i6 = i;
/* 1550 */                      entry = entry2;
                            case 11:
/* 1260 */                      if (o0iii1l1ol.I000o00OoI0I(obj, i7, i, i2, i3)) {
/* 1270 */                          ((loliO00) o0io1llooo.I00000oIO).I000iOII(i9, unsafe.getInt(obj, j));
                                }
/* 1539 */                      i7 += 3;
/* 1541 */                      o0iii1l1ol = this;
/* 1543 */                      i8 = i2;
/* 1544 */                      o0llii = o0llii2;
/* 1545 */                      i5 = i4;
/* 1547 */                      iArr = iArr2;
/* 1549 */                      i6 = i;
/* 1550 */                      entry = entry2;
                            case 12:
/* 1227 */                      if (o0iii1l1ol.I000o00OoI0I(obj, i7, i, i2, i3)) {
/* 1229 */                          int i16 = unsafe.getInt(obj, j);
/* 1235 */                          loliO00 lolio003 = (loliO00) o0io1llooo.I00000oIO;
/* 1239 */                          lolio003.I000l1(i9 << 3);
/* 1242 */                          if (i16 >= 0) {
/* 1244 */                              lolio003.I000l1(i16);
                                    } else {
/* 1250 */                              lolio003.I000o00OoI0I(i16);
                                    }
                                }
/* 1539 */                      i7 += 3;
/* 1541 */                      o0iii1l1ol = this;
/* 1543 */                      i8 = i2;
/* 1544 */                      o0llii = o0llii2;
/* 1545 */                      i5 = i4;
/* 1547 */                      iArr = iArr2;
/* 1549 */                      i6 = i;
/* 1550 */                      entry = entry2;
                            case 13:
/* 1207 */                      if (o0iii1l1ol.I000o00OoI0I(obj, i7, i, i2, i3)) {
/* 1217 */                          ((loliO00) o0io1llooo.I00000oIO).I0000oI00(i9, unsafe.getInt(obj, j));
                                }
/* 1539 */                      i7 += 3;
/* 1541 */                      o0iii1l1ol = this;
/* 1543 */                      i8 = i2;
/* 1544 */                      o0llii = o0llii2;
/* 1545 */                      i5 = i4;
/* 1547 */                      iArr = iArr2;
/* 1549 */                      i6 = i;
/* 1550 */                      entry = entry2;
                            case 14:
/* 1187 */                      if (o0iii1l1ol.I000o00OoI0I(obj, i7, i, i2, i3)) {
/* 1197 */                          ((loliO00) o0io1llooo.I00000oIO).I000II(i9, unsafe.getLong(obj, j));
                                }
/* 1539 */                      i7 += 3;
/* 1541 */                      o0iii1l1ol = this;
/* 1543 */                      i8 = i2;
/* 1544 */                      o0llii = o0llii2;
/* 1545 */                      i5 = i4;
/* 1547 */                      iArr = iArr2;
/* 1549 */                      i6 = i;
/* 1550 */                      entry = entry2;
                            case 15:
/* 1162 */                      if (o0iii1l1ol.I000o00OoI0I(obj, i7, i, i2, i3)) {
/* 1164 */                          int i17 = unsafe.getInt(obj, j);
/* 1177 */                          ((loliO00) o0io1llooo.I00000oIO).I000iOII(i9, (i17 >> 31) ^ (i17 + i17));
                                }
/* 1539 */                      i7 += 3;
/* 1541 */                      o0iii1l1ol = this;
/* 1543 */                      i8 = i2;
/* 1544 */                      o0llii = o0llii2;
/* 1545 */                      i5 = i4;
/* 1547 */                      iArr = iArr2;
/* 1549 */                      i6 = i;
/* 1550 */                      entry = entry2;
                            case 16:
/* 1137 */                      if (o0iii1l1ol.I000o00OoI0I(obj, i7, i, i2, i3)) {
/* 1139 */                          long j2 = unsafe.getLong(obj, j);
/* 1152 */                          ((loliO00) o0io1llooo.I00000oIO).I000lI(i9, (j2 + j2) ^ (j2 >> 63));
                                }
/* 1539 */                      i7 += 3;
/* 1541 */                      o0iii1l1ol = this;
/* 1543 */                      i8 = i2;
/* 1544 */                      o0llii = o0llii2;
/* 1545 */                      i5 = i4;
/* 1547 */                      iArr = iArr2;
/* 1549 */                      i6 = i;
/* 1550 */                      entry = entry2;
                            case 17:
/* 1117 */                      if (o0iii1l1ol.I000o00OoI0I(obj, i7, i, i2, i3)) {
/* 1127 */                          o0io1llooo.I00000oIO(i9, unsafe.getObject(obj, j), o0iii1l1ol.I001iOo1i0O(i7));
                                }
/* 1539 */                      i7 += 3;
/* 1541 */                      o0iii1l1ol = this;
/* 1543 */                      i8 = i2;
/* 1544 */                      o0llii = o0llii2;
/* 1545 */                      i5 = i4;
/* 1547 */                      iArr = iArr2;
/* 1549 */                      i6 = i;
/* 1550 */                      entry = entry2;
                            case PoseLandmark.RIGHT_PINKY:
/* 1107 */                      o0OIIlOIl01I.I001IO000(iArr2[i7], (List) unsafe.getObject(obj, j), o0io1llooo, false);
/* 1539 */                      i7 += 3;
/* 1541 */                      o0iii1l1ol = this;
/* 1543 */                      i8 = i2;
/* 1544 */                      o0llii = o0llii2;
/* 1545 */                      i5 = i4;
/* 1547 */                      iArr = iArr2;
/* 1549 */                      i6 = i;
/* 1550 */                      entry = entry2;
                            case PoseLandmark.LEFT_INDEX:
/* 1093 */                      o0OIIlOIl01I.I001l0I00(iArr2[i7], (List) unsafe.getObject(obj, j), o0io1llooo, false);
/* 1539 */                      i7 += 3;
/* 1541 */                      o0iii1l1ol = this;
/* 1543 */                      i8 = i2;
/* 1544 */                      o0llii = o0llii2;
/* 1545 */                      i5 = i4;
/* 1547 */                      iArr = iArr2;
/* 1549 */                      i6 = i;
/* 1550 */                      entry = entry2;
                            case PoseLandmark.RIGHT_INDEX:
/* 1079 */                      o0OIIlOIl01I.I001lllioOl(iArr2[i7], (List) unsafe.getObject(obj, j), o0io1llooo, false);
/* 1539 */                      i7 += 3;
/* 1541 */                      o0iii1l1ol = this;
/* 1543 */                      i8 = i2;
/* 1544 */                      o0llii = o0llii2;
/* 1545 */                      i5 = i4;
/* 1547 */                      iArr = iArr2;
/* 1549 */                      i6 = i;
/* 1550 */                      entry = entry2;
                            case PoseLandmark.LEFT_THUMB:
/* 1065 */                      o0OIIlOIl01I.I000II(iArr2[i7], (List) unsafe.getObject(obj, j), o0io1llooo, false);
/* 1539 */                      i7 += 3;
/* 1541 */                      o0iii1l1ol = this;
/* 1543 */                      i8 = i2;
/* 1544 */                      o0llii = o0llii2;
/* 1545 */                      i5 = i4;
/* 1547 */                      iArr = iArr2;
/* 1549 */                      i6 = i;
/* 1550 */                      entry = entry2;
                            case PoseLandmark.RIGHT_THUMB:
/* 1051 */                      o0OIIlOIl01I.I001lIiIIo1O(iArr2[i7], (List) unsafe.getObject(obj, j), o0io1llooo, false);
/* 1539 */                      i7 += 3;
/* 1541 */                      o0iii1l1ol = this;
/* 1543 */                      i8 = i2;
/* 1544 */                      o0llii = o0llii2;
/* 1545 */                      i5 = i4;
/* 1547 */                      iArr = iArr2;
/* 1549 */                      i6 = i;
/* 1550 */                      entry = entry2;
                            case PoseLandmark.LEFT_HIP:
/* 1037 */                      o0OIIlOIl01I.I001iOo1i0O(iArr2[i7], (List) unsafe.getObject(obj, j), o0io1llooo, false);
/* 1539 */                      i7 += 3;
/* 1541 */                      o0iii1l1ol = this;
/* 1543 */                      i8 = i2;
/* 1544 */                      o0llii = o0llii2;
/* 1545 */                      i5 = i4;
/* 1547 */                      iArr = iArr2;
/* 1549 */                      i6 = i;
/* 1550 */                      entry = entry2;
                            case PoseLandmark.RIGHT_HIP:
/* 1023 */                      o0OIIlOIl01I.I001i1lo1io(iArr2[i7], (List) unsafe.getObject(obj, j), o0io1llooo, false);
/* 1539 */                      i7 += 3;
/* 1541 */                      o0iii1l1ol = this;
/* 1543 */                      i8 = i2;
/* 1544 */                      o0llii = o0llii2;
/* 1545 */                      i5 = i4;
/* 1547 */                      iArr = iArr2;
/* 1549 */                      i6 = i;
/* 1550 */                      entry = entry2;
                            case PoseLandmark.LEFT_KNEE:
/* 1009 */                      o0OIIlOIl01I.I00111O(iArr2[i7], (List) unsafe.getObject(obj, j), o0io1llooo, false);
/* 1539 */                      i7 += 3;
/* 1541 */                      o0iii1l1ol = this;
/* 1543 */                      i8 = i2;
/* 1544 */                      o0llii = o0llii2;
/* 1545 */                      i5 = i4;
/* 1547 */                      iArr = iArr2;
/* 1549 */                      i6 = i;
/* 1550 */                      entry = entry2;
                            case PoseLandmark.RIGHT_KNEE:
/* 995 */                       o0OIIlOIl01I.I0000oI00(iArr2[i7], (List) unsafe.getObject(obj, j), o0io1llooo);
/* 1539 */                      i7 += 3;
/* 1541 */                      o0iii1l1ol = this;
/* 1543 */                      i8 = i2;
/* 1544 */                      o0llii = o0llii2;
/* 1545 */                      i5 = i4;
/* 1547 */                      iArr = iArr2;
/* 1549 */                      i6 = i;
/* 1550 */                      entry = entry2;
                            case 27:
/* 948 */                       int i18 = iArr2[i7];
/* 954 */                       List list = (List) unsafe.getObject(obj, j);
/* 956 */                       o0O1iOilloll o0o1ioillollI001iOo1i0O = o0iii1l1ol.I001iOo1i0O(i7);
/* 960 */                       i1i0olI i1i0oli = o0OIIlOIl01I.I00000oIO;
/* 962 */                       if (list != null && !list.isEmpty()) {
/* 975 */                           for (int i19 = 0; i19 < list.size(); i19++) {
/* 981 */                               o0io1llooo.I00000oOI(i18, list.get(i19), o0o1ioillollI001iOo1i0O);
                                    }
                                }
/* 1539 */                      i7 += 3;
/* 1541 */                      o0iii1l1ol = this;
/* 1543 */                      i8 = i2;
/* 1544 */                      o0llii = o0llii2;
/* 1545 */                      i5 = i4;
/* 1547 */                      iArr = iArr2;
/* 1549 */                      i6 = i;
/* 1550 */                      entry = entry2;
                                break;
                            case PoseLandmark.RIGHT_ANKLE:
/* 943 */                       o0OIIlOIl01I.I001IIilI0O(iArr2[i7], (List) unsafe.getObject(obj, j), o0io1llooo);
/* 1539 */                      i7 += 3;
/* 1541 */                      o0iii1l1ol = this;
/* 1543 */                      i8 = i2;
/* 1544 */                      o0llii = o0llii2;
/* 1545 */                      i5 = i4;
/* 1547 */                      iArr = iArr2;
/* 1549 */                      i6 = i;
/* 1550 */                      entry = entry2;
                            case PoseLandmark.LEFT_HEEL:
/* 922 */                       z = false;
/* 931 */                       o0OIIlOIl01I.I0001Ioi1lo(iArr2[i7], (List) unsafe.getObject(obj, j), o0io1llooo, false);
/* 1539 */                      i7 += 3;
/* 1541 */                      o0iii1l1ol = this;
/* 1543 */                      i8 = i2;
/* 1544 */                      o0llii = o0llii2;
/* 1545 */                      i5 = i4;
/* 1547 */                      iArr = iArr2;
/* 1549 */                      i6 = i;
/* 1550 */                      entry = entry2;
                            case 30:
/* 909 */                       z = false;
/* 918 */                       o0OIIlOIl01I.I001i1O0Ol(iArr2[i7], (List) unsafe.getObject(obj, j), o0io1llooo, false);
/* 1539 */                      i7 += 3;
/* 1541 */                      o0iii1l1ol = this;
/* 1543 */                      i8 = i2;
/* 1544 */                      o0llii = o0llii2;
/* 1545 */                      i5 = i4;
/* 1547 */                      iArr = iArr2;
/* 1549 */                      i6 = i;
/* 1550 */                      entry = entry2;
                            case PoseLandmark.LEFT_FOOT_INDEX:
/* 896 */                       z = false;
/* 905 */                       o0OIIlOIl01I.I00000oIO(iArr2[i7], (List) unsafe.getObject(obj, j), o0io1llooo, false);
/* 1539 */                      i7 += 3;
/* 1541 */                      o0iii1l1ol = this;
/* 1543 */                      i8 = i2;
/* 1544 */                      o0llii = o0llii2;
/* 1545 */                      i5 = i4;
/* 1547 */                      iArr = iArr2;
/* 1549 */                      i6 = i;
/* 1550 */                      entry = entry2;
                            case 32:
/* 883 */                       z = false;
/* 892 */                       o0OIIlOIl01I.I00000oOI(iArr2[i7], (List) unsafe.getObject(obj, j), o0io1llooo, false);
/* 1539 */                      i7 += 3;
/* 1541 */                      o0iii1l1ol = this;
/* 1543 */                      i8 = i2;
/* 1544 */                      o0llii = o0llii2;
/* 1545 */                      i5 = i4;
/* 1547 */                      iArr = iArr2;
/* 1549 */                      i6 = i;
/* 1550 */                      entry = entry2;
                            case 33:
/* 870 */                       z = false;
/* 879 */                       o0OIIlOIl01I.I0000Il00O(iArr2[i7], (List) unsafe.getObject(obj, j), o0io1llooo, false);
/* 1539 */                      i7 += 3;
/* 1541 */                      o0iii1l1ol = this;
/* 1543 */                      i8 = i2;
/* 1544 */                      o0llii = o0llii2;
/* 1545 */                      i5 = i4;
/* 1547 */                      iArr = iArr2;
/* 1549 */                      i6 = i;
/* 1550 */                      entry = entry2;
                            case 34:
/* 863 */                       z = false;
/* 864 */                       o0OIIlOIl01I.I0000O(iArr2[i7], (List) unsafe.getObject(obj, j), o0io1llooo, false);
/* 1539 */                      i7 += 3;
/* 1541 */                      o0iii1l1ol = this;
/* 1543 */                      i8 = i2;
/* 1544 */                      o0llii = o0llii2;
/* 1545 */                      i5 = i4;
/* 1547 */                      iArr = iArr2;
/* 1549 */                      i6 = i;
/* 1550 */                      entry = entry2;
                            case InputImage.IMAGE_FORMAT_YUV_420_888:
/* 850 */                       o0OIIlOIl01I.I001IO000(iArr2[i7], (List) unsafe.getObject(obj, j), o0io1llooo, true);
/* 1539 */                      i7 += 3;
/* 1541 */                      o0iii1l1ol = this;
/* 1543 */                      i8 = i2;
/* 1544 */                      o0llii = o0llii2;
/* 1545 */                      i5 = i4;
/* 1547 */                      iArr = iArr2;
/* 1549 */                      i6 = i;
/* 1550 */                      entry = entry2;
                            case 36:
/* 835 */                       o0OIIlOIl01I.I001l0I00(iArr2[i7], (List) unsafe.getObject(obj, j), o0io1llooo, true);
/* 1539 */                      i7 += 3;
/* 1541 */                      o0iii1l1ol = this;
/* 1543 */                      i8 = i2;
/* 1544 */                      o0llii = o0llii2;
/* 1545 */                      i5 = i4;
/* 1547 */                      iArr = iArr2;
/* 1549 */                      i6 = i;
/* 1550 */                      entry = entry2;
                            case 37:
/* 820 */                       o0OIIlOIl01I.I001lllioOl(iArr2[i7], (List) unsafe.getObject(obj, j), o0io1llooo, true);
/* 1539 */                      i7 += 3;
/* 1541 */                      o0iii1l1ol = this;
/* 1543 */                      i8 = i2;
/* 1544 */                      o0llii = o0llii2;
/* 1545 */                      i5 = i4;
/* 1547 */                      iArr = iArr2;
/* 1549 */                      i6 = i;
/* 1550 */                      entry = entry2;
                            case 38:
/* 805 */                       o0OIIlOIl01I.I000II(iArr2[i7], (List) unsafe.getObject(obj, j), o0io1llooo, true);
/* 1539 */                      i7 += 3;
/* 1541 */                      o0iii1l1ol = this;
/* 1543 */                      i8 = i2;
/* 1544 */                      o0llii = o0llii2;
/* 1545 */                      i5 = i4;
/* 1547 */                      iArr = iArr2;
/* 1549 */                      i6 = i;
/* 1550 */                      entry = entry2;
                            case 39:
/* 790 */                       o0OIIlOIl01I.I001lIiIIo1O(iArr2[i7], (List) unsafe.getObject(obj, j), o0io1llooo, true);
/* 1539 */                      i7 += 3;
/* 1541 */                      o0iii1l1ol = this;
/* 1543 */                      i8 = i2;
/* 1544 */                      o0llii = o0llii2;
/* 1545 */                      i5 = i4;
/* 1547 */                      iArr = iArr2;
/* 1549 */                      i6 = i;
/* 1550 */                      entry = entry2;
                            case 40:
/* 775 */                       o0OIIlOIl01I.I001iOo1i0O(iArr2[i7], (List) unsafe.getObject(obj, j), o0io1llooo, true);
/* 1539 */                      i7 += 3;
/* 1541 */                      o0iii1l1ol = this;
/* 1543 */                      i8 = i2;
/* 1544 */                      o0llii = o0llii2;
/* 1545 */                      i5 = i4;
/* 1547 */                      iArr = iArr2;
/* 1549 */                      i6 = i;
/* 1550 */                      entry = entry2;
                            case 41:
/* 760 */                       o0OIIlOIl01I.I001i1lo1io(iArr2[i7], (List) unsafe.getObject(obj, j), o0io1llooo, true);
/* 1539 */                      i7 += 3;
/* 1541 */                      o0iii1l1ol = this;
/* 1543 */                      i8 = i2;
/* 1544 */                      o0llii = o0llii2;
/* 1545 */                      i5 = i4;
/* 1547 */                      iArr = iArr2;
/* 1549 */                      i6 = i;
/* 1550 */                      entry = entry2;
                            case 42:
/* 745 */                       o0OIIlOIl01I.I00111O(iArr2[i7], (List) unsafe.getObject(obj, j), o0io1llooo, true);
/* 1539 */                      i7 += 3;
/* 1541 */                      o0iii1l1ol = this;
/* 1543 */                      i8 = i2;
/* 1544 */                      o0llii = o0llii2;
/* 1545 */                      i5 = i4;
/* 1547 */                      iArr = iArr2;
/* 1549 */                      i6 = i;
/* 1550 */                      entry = entry2;
                            case 43:
/* 730 */                       o0OIIlOIl01I.I0001Ioi1lo(iArr2[i7], (List) unsafe.getObject(obj, j), o0io1llooo, true);
/* 1539 */                      i7 += 3;
/* 1541 */                      o0iii1l1ol = this;
/* 1543 */                      i8 = i2;
/* 1544 */                      o0llii = o0llii2;
/* 1545 */                      i5 = i4;
/* 1547 */                      iArr = iArr2;
/* 1549 */                      i6 = i;
/* 1550 */                      entry = entry2;
                            case 44:
/* 715 */                       o0OIIlOIl01I.I001i1O0Ol(iArr2[i7], (List) unsafe.getObject(obj, j), o0io1llooo, true);
/* 1539 */                      i7 += 3;
/* 1541 */                      o0iii1l1ol = this;
/* 1543 */                      i8 = i2;
/* 1544 */                      o0llii = o0llii2;
/* 1545 */                      i5 = i4;
/* 1547 */                      iArr = iArr2;
/* 1549 */                      i6 = i;
/* 1550 */                      entry = entry2;
                            case BuildConfig.VERSION_CODE:
/* 700 */                       o0OIIlOIl01I.I00000oIO(iArr2[i7], (List) unsafe.getObject(obj, j), o0io1llooo, true);
/* 1539 */                      i7 += 3;
/* 1541 */                      o0iii1l1ol = this;
/* 1543 */                      i8 = i2;
/* 1544 */                      o0llii = o0llii2;
/* 1545 */                      i5 = i4;
/* 1547 */                      iArr = iArr2;
/* 1549 */                      i6 = i;
/* 1550 */                      entry = entry2;
                            case 46:
/* 685 */                       o0OIIlOIl01I.I00000oOI(iArr2[i7], (List) unsafe.getObject(obj, j), o0io1llooo, true);
/* 1539 */                      i7 += 3;
/* 1541 */                      o0iii1l1ol = this;
/* 1543 */                      i8 = i2;
/* 1544 */                      o0llii = o0llii2;
/* 1545 */                      i5 = i4;
/* 1547 */                      iArr = iArr2;
/* 1549 */                      i6 = i;
/* 1550 */                      entry = entry2;
                            case 47:
/* 670 */                       o0OIIlOIl01I.I0000Il00O(iArr2[i7], (List) unsafe.getObject(obj, j), o0io1llooo, true);
/* 1539 */                      i7 += 3;
/* 1541 */                      o0iii1l1ol = this;
/* 1543 */                      i8 = i2;
/* 1544 */                      o0llii = o0llii2;
/* 1545 */                      i5 = i4;
/* 1547 */                      iArr = iArr2;
/* 1549 */                      i6 = i;
/* 1550 */                      entry = entry2;
                            case 48:
/* 655 */                       o0OIIlOIl01I.I0000O(iArr2[i7], (List) unsafe.getObject(obj, j), o0io1llooo, true);
/* 1539 */                      i7 += 3;
/* 1541 */                      o0iii1l1ol = this;
/* 1543 */                      i8 = i2;
/* 1544 */                      o0llii = o0llii2;
/* 1545 */                      i5 = i4;
/* 1547 */                      iArr = iArr2;
/* 1549 */                      i6 = i;
/* 1550 */                      entry = entry2;
                            case 49:
/* 606 */                       int i20 = iArr2[i7];
/* 612 */                       List list2 = (List) unsafe.getObject(obj, j);
/* 614 */                       o0O1iOilloll o0o1ioillollI001iOo1i0O2 = o0iii1l1ol.I001iOo1i0O(i7);
/* 618 */                       i1i0olI i1i0oli2 = o0OIIlOIl01I.I00000oIO;
/* 620 */                       if (list2 != null && !list2.isEmpty()) {
/* 633 */                           for (int i21 = 0; i21 < list2.size(); i21++) {
/* 639 */                               o0io1llooo.I00000oIO(i20, list2.get(i21), o0o1ioillollI001iOo1i0O2);
                                    }
                                }
/* 1539 */                      i7 += 3;
/* 1541 */                      o0iii1l1ol = this;
/* 1543 */                      i8 = i2;
/* 1544 */                      o0llii = o0llii2;
/* 1545 */                      i5 = i4;
/* 1547 */                      iArr = iArr2;
/* 1549 */                      i6 = i;
/* 1550 */                      entry = entry2;
                                break;
                            case 50:
/* 590 */                       if (unsafe.getObject(obj, j) != null) {
/* 594 */                           int i22 = i7 / 3;
/* 605 */                           throw IIlIOloOOO.I000l1(o0iii1l1ol.I00000oOI[i22 + i22]);
                                }
/* 1539 */                      i7 += 3;
/* 1541 */                      o0iii1l1ol = this;
/* 1543 */                      i8 = i2;
/* 1544 */                      o0llii = o0llii2;
/* 1545 */                      i5 = i4;
/* 1547 */                      iArr = iArr2;
/* 1549 */                      i6 = i;
/* 1550 */                      entry = entry2;
                            case 51:
/* 561 */                       if (o0iii1l1ol.I00100l0(obj, i9, i7)) {
/* 581 */                           ((loliO00) o0io1llooo.I00000oIO).I000II(i9, Double.doubleToRawLongBits(((Double) o0ii0oo.I000II(obj, j)).doubleValue()));
                                }
/* 1539 */                      i7 += 3;
/* 1541 */                      o0iii1l1ol = this;
/* 1543 */                      i8 = i2;
/* 1544 */                      o0llii = o0llii2;
/* 1545 */                      i5 = i4;
/* 1547 */                      iArr = iArr2;
/* 1549 */                      i6 = i;
/* 1550 */                      entry = entry2;
                            case 52:
/* 532 */                       if (o0iii1l1ol.I00100l0(obj, i9, i7)) {
/* 552 */                           ((loliO00) o0io1llooo.I00000oIO).I0000oI00(i9, Float.floatToRawIntBits(((Float) o0ii0oo.I000II(obj, j)).floatValue()));
                                }
/* 1539 */                      i7 += 3;
/* 1541 */                      o0iii1l1ol = this;
/* 1543 */                      i8 = i2;
/* 1544 */                      o0llii = o0llii2;
/* 1545 */                      i5 = i4;
/* 1547 */                      iArr = iArr2;
/* 1549 */                      i6 = i;
/* 1550 */                      entry = entry2;
                            case 53:
/* 513 */                       if (o0iii1l1ol.I00100l0(obj, i9, i7)) {
/* 523 */                           ((loliO00) o0io1llooo.I00000oIO).I000lI(i9, I001i1O0Ol(j, obj));
                                }
/* 1539 */                      i7 += 3;
/* 1541 */                      o0iii1l1ol = this;
/* 1543 */                      i8 = i2;
/* 1544 */                      o0llii = o0llii2;
/* 1545 */                      i5 = i4;
/* 1547 */                      iArr = iArr2;
/* 1549 */                      i6 = i;
/* 1550 */                      entry = entry2;
                            case 54:
/* 494 */                       if (o0iii1l1ol.I00100l0(obj, i9, i7)) {
/* 504 */                           ((loliO00) o0io1llooo.I00000oIO).I000lI(i9, I001i1O0Ol(j, obj));
                                }
/* 1539 */                      i7 += 3;
/* 1541 */                      o0iii1l1ol = this;
/* 1543 */                      i8 = i2;
/* 1544 */                      o0llii = o0llii2;
/* 1545 */                      i5 = i4;
/* 1547 */                      iArr = iArr2;
/* 1549 */                      i6 = i;
/* 1550 */                      entry = entry2;
                            case 55:
/* 462 */                       if (o0iii1l1ol.I00100l0(obj, i9, i7)) {
/* 464 */                           int iI0010o = I0010o(j, obj);
/* 470 */                           loliO00 lolio004 = (loliO00) o0io1llooo.I00000oIO;
/* 474 */                           lolio004.I000l1(i9 << 3);
/* 477 */                           if (iI0010o >= 0) {
/* 479 */                               lolio004.I000l1(iI0010o);
                                    } else {
/* 485 */                               lolio004.I000o00OoI0I(iI0010o);
                                    }
                                }
/* 1539 */                      i7 += 3;
/* 1541 */                      o0iii1l1ol = this;
/* 1543 */                      i8 = i2;
/* 1544 */                      o0llii = o0llii2;
/* 1545 */                      i5 = i4;
/* 1547 */                      iArr = iArr2;
/* 1549 */                      i6 = i;
/* 1550 */                      entry = entry2;
                            case 56:
/* 443 */                       if (o0iii1l1ol.I00100l0(obj, i9, i7)) {
/* 453 */                           ((loliO00) o0io1llooo.I00000oIO).I000II(i9, I001i1O0Ol(j, obj));
                                }
/* 1539 */                      i7 += 3;
/* 1541 */                      o0iii1l1ol = this;
/* 1543 */                      i8 = i2;
/* 1544 */                      o0llii = o0llii2;
/* 1545 */                      i5 = i4;
/* 1547 */                      iArr = iArr2;
/* 1549 */                      i6 = i;
/* 1550 */                      entry = entry2;
                            case 57:
/* 424 */                       if (o0iii1l1ol.I00100l0(obj, i9, i7)) {
/* 434 */                           ((loliO00) o0io1llooo.I00000oIO).I0000oI00(i9, I0010o(j, obj));
                                }
/* 1539 */                      i7 += 3;
/* 1541 */                      o0iii1l1ol = this;
/* 1543 */                      i8 = i2;
/* 1544 */                      o0llii = o0llii2;
/* 1545 */                      i5 = i4;
/* 1547 */                      iArr = iArr2;
/* 1549 */                      i6 = i;
/* 1550 */                      entry = entry2;
                            case 58:
/* 394 */                       if (o0iii1l1ol.I00100l0(obj, i9, i7)) {
/* 402 */                           boolean zBooleanValue = ((Boolean) o0ii0oo.I000II(obj, j)).booleanValue();
/* 408 */                           loliO00 lolio005 = (loliO00) o0io1llooo.I00000oIO;
/* 412 */                           lolio005.I000l1(i9 << 3);
/* 415 */                           lolio005.I00000oOI(zBooleanValue ? (byte) 1 : (byte) 0);
                                }
/* 1539 */                      i7 += 3;
/* 1541 */                      o0iii1l1ol = this;
/* 1543 */                      i8 = i2;
/* 1544 */                      o0llii = o0llii2;
/* 1545 */                      i5 = i4;
/* 1547 */                      iArr = iArr2;
/* 1549 */                      i6 = i;
/* 1550 */                      entry = entry2;
                            case 59:
/* 358 */                       if (o0iii1l1ol.I00100l0(obj, i9, i7)) {
/* 360 */                           Object object2 = unsafe.getObject(obj, j);
/* 366 */                           if (object2 instanceof String) {
/* 374 */                               ((loliO00) o0io1llooo.I00000oIO).I000OOo1O(i9, (String) object2);
                                    } else {
/* 385 */                               ((loliO00) o0io1llooo.I00000oIO).I0000O(i9, (lol1I010) object2);
                                    }
                                }
/* 1539 */                      i7 += 3;
/* 1541 */                      o0iii1l1ol = this;
/* 1543 */                      i8 = i2;
/* 1544 */                      o0llii = o0llii2;
/* 1545 */                      i5 = i4;
/* 1547 */                      iArr = iArr2;
/* 1549 */                      i6 = i;
/* 1550 */                      entry = entry2;
                            case 60:
/* 339 */                       if (o0iii1l1ol.I00100l0(obj, i9, i7)) {
/* 349 */                           o0io1llooo.I00000oOI(i9, unsafe.getObject(obj, j), o0iii1l1ol.I001iOo1i0O(i7));
                                }
/* 1539 */                      i7 += 3;
/* 1541 */                      o0iii1l1ol = this;
/* 1543 */                      i8 = i2;
/* 1544 */                      o0llii = o0llii2;
/* 1545 */                      i5 = i4;
/* 1547 */                      iArr = iArr2;
/* 1549 */                      i6 = i;
/* 1550 */                      entry = entry2;
                            case 61:
/* 318 */                       if (o0iii1l1ol.I00100l0(obj, i9, i7)) {
/* 330 */                           ((loliO00) o0io1llooo.I00000oIO).I0000O(i9, (lol1I010) unsafe.getObject(obj, j));
                                }
/* 1539 */                      i7 += 3;
/* 1541 */                      o0iii1l1ol = this;
/* 1543 */                      i8 = i2;
/* 1544 */                      o0llii = o0llii2;
/* 1545 */                      i5 = i4;
/* 1547 */                      iArr = iArr2;
/* 1549 */                      i6 = i;
/* 1550 */                      entry = entry2;
                            case 62:
/* 299 */                       if (o0iii1l1ol.I00100l0(obj, i9, i7)) {
/* 309 */                           ((loliO00) o0io1llooo.I00000oIO).I000iOII(i9, I0010o(j, obj));
                                }
/* 1539 */                      i7 += 3;
/* 1541 */                      o0iii1l1ol = this;
/* 1543 */                      i8 = i2;
/* 1544 */                      o0llii = o0llii2;
/* 1545 */                      i5 = i4;
/* 1547 */                      iArr = iArr2;
/* 1549 */                      i6 = i;
/* 1550 */                      entry = entry2;
                            case 63:
/* 268 */                       if (o0iii1l1ol.I00100l0(obj, i9, i7)) {
/* 270 */                           int iI0010o2 = I0010o(j, obj);
/* 276 */                           loliO00 lolio006 = (loliO00) o0io1llooo.I00000oIO;
/* 280 */                           lolio006.I000l1(i9 << 3);
/* 283 */                           if (iI0010o2 >= 0) {
/* 285 */                               lolio006.I000l1(iI0010o2);
                                    } else {
/* 290 */                               lolio006.I000o00OoI0I(iI0010o2);
                                    }
                                }
/* 1539 */                      i7 += 3;
/* 1541 */                      o0iii1l1ol = this;
/* 1543 */                      i8 = i2;
/* 1544 */                      o0llii = o0llii2;
/* 1545 */                      i5 = i4;
/* 1547 */                      iArr = iArr2;
/* 1549 */                      i6 = i;
/* 1550 */                      entry = entry2;
                            case Barcode.FORMAT_EAN_8:
/* 250 */                       if (o0iii1l1ol.I00100l0(obj, i9, i7)) {
/* 260 */                           ((loliO00) o0io1llooo.I00000oIO).I0000oI00(i9, I0010o(j, obj));
                                }
/* 1539 */                      i7 += 3;
/* 1541 */                      o0iii1l1ol = this;
/* 1543 */                      i8 = i2;
/* 1544 */                      o0llii = o0llii2;
/* 1545 */                      i5 = i4;
/* 1547 */                      iArr = iArr2;
/* 1549 */                      i6 = i;
/* 1550 */                      entry = entry2;
                            case 65:
/* 232 */                       if (o0iii1l1ol.I00100l0(obj, i9, i7)) {
/* 242 */                           ((loliO00) o0io1llooo.I00000oIO).I000II(i9, I001i1O0Ol(j, obj));
                                }
/* 1539 */                      i7 += 3;
/* 1541 */                      o0iii1l1ol = this;
/* 1543 */                      i8 = i2;
/* 1544 */                      o0llii = o0llii2;
/* 1545 */                      i5 = i4;
/* 1547 */                      iArr = iArr2;
/* 1549 */                      i6 = i;
/* 1550 */                      entry = entry2;
                            case 66:
/* 209 */                       if (o0iii1l1ol.I00100l0(obj, i9, i7)) {
/* 211 */                           int iI0010o3 = I0010o(j, obj);
/* 224 */                           ((loliO00) o0io1llooo.I00000oIO).I000iOII(i9, (iI0010o3 >> 31) ^ (iI0010o3 + iI0010o3));
                                }
/* 1539 */                      i7 += 3;
/* 1541 */                      o0iii1l1ol = this;
/* 1543 */                      i8 = i2;
/* 1544 */                      o0llii = o0llii2;
/* 1545 */                      i5 = i4;
/* 1547 */                      iArr = iArr2;
/* 1549 */                      i6 = i;
/* 1550 */                      entry = entry2;
                            case 67:
/* 186 */                       if (o0iii1l1ol.I00100l0(obj, i9, i7)) {
/* 188 */                           long jI001i1O0Ol = I001i1O0Ol(j, obj);
/* 201 */                           ((loliO00) o0io1llooo.I00000oIO).I000lI(i9, (jI001i1O0Ol + jI001i1O0Ol) ^ (jI001i1O0Ol >> 63));
                                }
/* 1539 */                      i7 += 3;
/* 1541 */                      o0iii1l1ol = this;
/* 1543 */                      i8 = i2;
/* 1544 */                      o0llii = o0llii2;
/* 1545 */                      i5 = i4;
/* 1547 */                      iArr = iArr2;
/* 1549 */                      i6 = i;
/* 1550 */                      entry = entry2;
                            case 68:
/* 168 */                       if (o0iii1l1ol.I00100l0(obj, i9, i7)) {
/* 178 */                           o0io1llooo.I00000oIO(i9, unsafe.getObject(obj, j), o0iii1l1ol.I001iOo1i0O(i7));
                                }
/* 1539 */                      i7 += 3;
/* 1541 */                      o0iii1l1ol = this;
/* 1543 */                      i8 = i2;
/* 1544 */                      o0llii = o0llii2;
/* 1545 */                      i5 = i4;
/* 1547 */                      iArr = iArr2;
/* 1549 */                      i6 = i;
/* 1550 */                      entry = entry2;
                            default:
/* 1539 */                      i7 += 3;
/* 1541 */                      o0iii1l1ol = this;
/* 1543 */                      i8 = i2;
/* 1544 */                      o0llii = o0llii2;
/* 1545 */                      i5 = i4;
/* 1547 */                      iArr = iArr2;
/* 1549 */                      i6 = i;
/* 1550 */                      entry = entry2;
                        }
                    }
/* 1555 */          o0llIi o0llii3 = o0llii;
/* 1556 */          while (entry != null) {
/* 1558 */              o0llii3.getClass();
/* 1561 */              o0llIi.I00IOO(o0io1llooo, entry);
/* 1578 */              entry = it.hasNext() ? (Map.Entry) it.next() : null;
                    }
/* 1585 */          ((o001IlOi0O) obj).zzc.I0000O(o0io1llooo);
                }

                /* JADX WARN: Removed duplicated region for block: B:44:0x00db A[PHI: r2
                  0x00db: PHI (r2v34 int) = (r2v10 int), (r2v35 int) binds: [B:85:0x01ea, B:43:0x00d9] A[DONT_GENERATE, DONT_INLINE]] */
                @Override
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final int I000O01llI0(o001IlOi0O o001iloi0o) {
                    int i;
                    long jDoubleToLongBits;
                    int i2;
                    int iFloatToIntBits;
                    int i3;
                    int i4;
/* 1 */             int[] iArr = this.I00000oIO;
/* 4 */             int i5 = 0;
/* 6 */             for (int i6 = 0; i6 < iArr.length; i6 += 3) {
/* 8 */                 int iI001IO000 = I001IO000(i6);
/* 15 */                int i7 = 1048575 & iI001IO000;
/* 16 */                int iI001IIilI0O = I001IIilI0O(iI001IO000);
/* 20 */                int i8 = iArr[i6];
                        long j = i7;
/* 23 */                int i9 = 1237;
/* 27 */                int iHashCode = 37;
                        switch (iI001IIilI0O) {
                            case 0:
/* 555 */                       i = i5 * 53;
/* 563 */                       jDoubleToLongBits = Double.doubleToLongBits(o0ii0oo.I0000Il00O.I0010I0i(o001iloi0o, j));
/* 567 */                       Charset charset = o00oIoII0l1.I00000oIO;
/* 74 */                        i5 = i + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                                break;
                            case 1:
/* 541 */                       i2 = i5 * 53;
/* 549 */                       iFloatToIntBits = Float.floatToIntBits(o0ii0oo.I0000Il00O.I001IIilI0O(o001iloi0o, j));
/* 52 */                        i5 = iFloatToIntBits + i2;
                                break;
                            case 2:
/* 531 */                       i = i5 * 53;
/* 533 */                       jDoubleToLongBits = o0ii0oo.I0001Ioi1lo(o001iloi0o, j);
/* 537 */                       Charset charset2 = o00oIoII0l1.I00000oIO;
/* 74 */                        i5 = i + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                                break;
                            case 3:
/* 521 */                       i = i5 * 53;
/* 523 */                       jDoubleToLongBits = o0ii0oo.I0001Ioi1lo(o001iloi0o, j);
/* 527 */                       Charset charset3 = o00oIoII0l1.I00000oIO;
/* 74 */                        i5 = i + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                                break;
                            case 4:
/* 513 */                       i2 = i5 * 53;
/* 515 */                       iFloatToIntBits = o0ii0oo.I0000oI00(o001iloi0o, j);
/* 52 */                        i5 = iFloatToIntBits + i2;
                                break;
                            case 5:
/* 503 */                       i = i5 * 53;
/* 505 */                       jDoubleToLongBits = o0ii0oo.I0001Ioi1lo(o001iloi0o, j);
/* 509 */                       Charset charset4 = o00oIoII0l1.I00000oIO;
/* 74 */                        i5 = i + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                                break;
                            case 6:
/* 495 */                       i2 = i5 * 53;
/* 497 */                       iFloatToIntBits = o0ii0oo.I0000oI00(o001iloi0o, j);
/* 52 */                        i5 = iFloatToIntBits + i2;
                                break;
                            case 7:
/* 481 */                       i3 = i5 * 53;
/* 485 */                       boolean zI00Io1o110i = o0ii0oo.I0000Il00O.I00Io1o110i(o001iloi0o, j);
/* 489 */                       Charset charset5 = o00oIoII0l1.I00000oIO;
/* 491 */                       if (zI00Io1o110i) {
/* 220 */                           i9 = 1231;
                                }
/* 221 */                       i5 = i9 + i3;
                                break;
                            case 8:
/* 467 */                       i2 = i5 * 53;
/* 475 */                       iFloatToIntBits = ((String) o0ii0oo.I000II(o001iloi0o, j)).hashCode();
/* 52 */                        i5 = iFloatToIntBits + i2;
                                break;
                            case 9:
/* 454 */                       i4 = i5 * 53;
/* 456 */                       Object objI000II = o0ii0oo.I000II(o001iloi0o, j);
/* 460 */                       if (objI000II != null) {
/* 462 */                           iHashCode = objI000II.hashCode();
                                }
/* 387 */                       i5 = i4 + iHashCode;
                                break;
                            case 10:
/* 442 */                       i2 = i5 * 53;
/* 448 */                       iFloatToIntBits = o0ii0oo.I000II(o001iloi0o, j).hashCode();
/* 52 */                        i5 = iFloatToIntBits + i2;
                                break;
                            case 11:
/* 434 */                       i2 = i5 * 53;
/* 436 */                       iFloatToIntBits = o0ii0oo.I0000oI00(o001iloi0o, j);
/* 52 */                        i5 = iFloatToIntBits + i2;
                                break;
                            case 12:
/* 426 */                       i2 = i5 * 53;
/* 428 */                       iFloatToIntBits = o0ii0oo.I0000oI00(o001iloi0o, j);
/* 52 */                        i5 = iFloatToIntBits + i2;
                                break;
                            case 13:
/* 418 */                       i2 = i5 * 53;
/* 420 */                       iFloatToIntBits = o0ii0oo.I0000oI00(o001iloi0o, j);
/* 52 */                        i5 = iFloatToIntBits + i2;
                                break;
                            case 14:
/* 408 */                       i = i5 * 53;
/* 410 */                       jDoubleToLongBits = o0ii0oo.I0001Ioi1lo(o001iloi0o, j);
/* 414 */                       Charset charset6 = o00oIoII0l1.I00000oIO;
/* 74 */                        i5 = i + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                                break;
                            case 15:
/* 400 */                       i2 = i5 * 53;
/* 402 */                       iFloatToIntBits = o0ii0oo.I0000oI00(o001iloi0o, j);
/* 52 */                        i5 = iFloatToIntBits + i2;
                                break;
                            case 16:
/* 390 */                       i = i5 * 53;
/* 392 */                       jDoubleToLongBits = o0ii0oo.I0001Ioi1lo(o001iloi0o, j);
/* 396 */                       Charset charset7 = o00oIoII0l1.I00000oIO;
/* 74 */                        i5 = i + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                                break;
                            case 17:
/* 375 */                       i4 = i5 * 53;
/* 377 */                       Object objI000II2 = o0ii0oo.I000II(o001iloi0o, j);
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
/* 369 */                       iFloatToIntBits = o0ii0oo.I000II(o001iloi0o, j).hashCode();
/* 52 */                        i5 = iFloatToIntBits + i2;
                                break;
                            case 50:
/* 351 */                       i2 = i5 * 53;
/* 357 */                       iFloatToIntBits = o0ii0oo.I000II(o001iloi0o, j).hashCode();
/* 52 */                        i5 = iFloatToIntBits + i2;
                                break;
                            case 51:
/* 329 */                       if (I00100l0(o001iloi0o, i8, i6)) {
/* 331 */                           i = i5 * 53;
/* 343 */                           jDoubleToLongBits = Double.doubleToLongBits(((Double) o0ii0oo.I000II(o001iloi0o, j)).doubleValue());
/* 347 */                           Charset charset8 = o00oIoII0l1.I00000oIO;
/* 74 */                            i5 = i + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                                    break;
                                } else {
                                    break;
                                }
                            case 52:
/* 305 */                       if (I00100l0(o001iloi0o, i8, i6)) {
/* 307 */                           i2 = i5 * 53;
/* 319 */                           iFloatToIntBits = Float.floatToIntBits(((Float) o0ii0oo.I000II(o001iloi0o, j)).floatValue());
/* 52 */                            i5 = iFloatToIntBits + i2;
                                    break;
                                } else {
                                    break;
                                }
                            case 53:
/* 289 */                       if (I00100l0(o001iloi0o, i8, i6)) {
/* 291 */                           i = i5 * 53;
/* 293 */                           jDoubleToLongBits = I001i1O0Ol(j, o001iloi0o);
/* 297 */                           Charset charset9 = o00oIoII0l1.I00000oIO;
/* 74 */                            i5 = i + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                                    break;
                                } else {
                                    break;
                                }
                            case 54:
/* 273 */                       if (I00100l0(o001iloi0o, i8, i6)) {
/* 275 */                           i = i5 * 53;
/* 277 */                           jDoubleToLongBits = I001i1O0Ol(j, o001iloi0o);
/* 281 */                           Charset charset10 = o00oIoII0l1.I00000oIO;
/* 74 */                            i5 = i + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                                    break;
                                } else {
                                    break;
                                }
                            case 55:
/* 259 */                       if (I00100l0(o001iloi0o, i8, i6)) {
/* 261 */                           i2 = i5 * 53;
/* 263 */                           iFloatToIntBits = I0010o(j, o001iloi0o);
/* 52 */                            i5 = iFloatToIntBits + i2;
                                    break;
                                } else {
                                    break;
                                }
                            case 56:
/* 243 */                       if (I00100l0(o001iloi0o, i8, i6)) {
/* 245 */                           i = i5 * 53;
/* 247 */                           jDoubleToLongBits = I001i1O0Ol(j, o001iloi0o);
/* 251 */                           Charset charset11 = o00oIoII0l1.I00000oIO;
/* 74 */                            i5 = i + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                                    break;
                                } else {
                                    break;
                                }
                            case 57:
/* 229 */                       if (I00100l0(o001iloi0o, i8, i6)) {
/* 231 */                           i2 = i5 * 53;
/* 233 */                           iFloatToIntBits = I0010o(j, o001iloi0o);
/* 52 */                            i5 = iFloatToIntBits + i2;
                                    break;
                                } else {
                                    break;
                                }
                            case 58:
/* 202 */                       if (I00100l0(o001iloi0o, i8, i6)) {
/* 204 */                           i3 = i5 * 53;
/* 212 */                           boolean zBooleanValue = ((Boolean) o0ii0oo.I000II(o001iloi0o, j)).booleanValue();
/* 216 */                           Charset charset12 = o00oIoII0l1.I00000oIO;
/* 218 */                           if (zBooleanValue) {
                                    }
/* 221 */                           i5 = i9 + i3;
                                    break;
                                } else {
                                    break;
                                }
                            case 59:
/* 182 */                       if (I00100l0(o001iloi0o, i8, i6)) {
/* 184 */                           i2 = i5 * 53;
/* 192 */                           iFloatToIntBits = ((String) o0ii0oo.I000II(o001iloi0o, j)).hashCode();
/* 52 */                            i5 = iFloatToIntBits + i2;
                                    break;
                                } else {
                                    break;
                                }
                            case 60:
/* 165 */                       if (I00100l0(o001iloi0o, i8, i6)) {
/* 167 */                           i2 = i5 * 53;
/* 173 */                           iFloatToIntBits = o0ii0oo.I000II(o001iloi0o, j).hashCode();
/* 52 */                            i5 = iFloatToIntBits + i2;
                                    break;
                                } else {
                                    break;
                                }
                            case 61:
/* 148 */                       if (I00100l0(o001iloi0o, i8, i6)) {
/* 150 */                           i2 = i5 * 53;
/* 156 */                           iFloatToIntBits = o0ii0oo.I000II(o001iloi0o, j).hashCode();
/* 52 */                            i5 = iFloatToIntBits + i2;
                                    break;
                                } else {
                                    break;
                                }
                            case 62:
/* 135 */                       if (I00100l0(o001iloi0o, i8, i6)) {
/* 137 */                           i2 = i5 * 53;
/* 139 */                           iFloatToIntBits = I0010o(j, o001iloi0o);
/* 52 */                            i5 = iFloatToIntBits + i2;
                                    break;
                                } else {
                                    break;
                                }
                            case 63:
/* 122 */                       if (I00100l0(o001iloi0o, i8, i6)) {
/* 124 */                           i2 = i5 * 53;
/* 126 */                           iFloatToIntBits = I0010o(j, o001iloi0o);
/* 52 */                            i5 = iFloatToIntBits + i2;
                                    break;
                                } else {
                                    break;
                                }
                            case Barcode.FORMAT_EAN_8:
/* 109 */                       if (I00100l0(o001iloi0o, i8, i6)) {
/* 111 */                           i2 = i5 * 53;
/* 113 */                           iFloatToIntBits = I0010o(j, o001iloi0o);
/* 52 */                            i5 = iFloatToIntBits + i2;
                                    break;
                                } else {
                                    break;
                                }
                            case 65:
/* 94 */                        if (I00100l0(o001iloi0o, i8, i6)) {
/* 96 */                            i = i5 * 53;
/* 98 */                            jDoubleToLongBits = I001i1O0Ol(j, o001iloi0o);
/* 102 */                           Charset charset13 = o00oIoII0l1.I00000oIO;
/* 74 */                            i5 = i + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                                    break;
                                } else {
                                    break;
                                }
                            case 66:
/* 81 */                        if (I00100l0(o001iloi0o, i8, i6)) {
/* 83 */                            i2 = i5 * 53;
/* 85 */                            iFloatToIntBits = I0010o(j, o001iloi0o);
/* 52 */                            i5 = iFloatToIntBits + i2;
                                    break;
                                } else {
                                    break;
                                }
                            case 67:
/* 60 */                        if (I00100l0(o001iloi0o, i8, i6)) {
/* 62 */                            i = i5 * 53;
/* 64 */                            jDoubleToLongBits = I001i1O0Ol(j, o001iloi0o);
/* 68 */                            Charset charset14 = o00oIoII0l1.I00000oIO;
/* 74 */                            i5 = i + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                                    break;
                                } else {
                                    break;
                                }
                            case 68:
/* 40 */                        if (I00100l0(o001iloi0o, i8, i6)) {
/* 42 */                            i2 = i5 * 53;
/* 48 */                            iFloatToIntBits = o0ii0oo.I000II(o001iloi0o, j).hashCode();
/* 52 */                            i5 = iFloatToIntBits + i2;
                                    break;
                                } else {
                                    break;
                                }
                        }
                    }
/* 583 */           int iHashCode2 = o001iloi0o.zzc.hashCode() + (i5 * 53);
/* 586 */           if (!this.I0001Ioi1lo) {
/* 602 */               return iHashCode2;
                    }
/* 600 */           return ((looo1olo1) o001iloi0o).zzb.I00000oIO.hashCode() + (iHashCode2 * 53);
                }

                public final void I000OOo1O(int i, Object obj, Object obj2) {
/* 5 */             if (I000lI(obj2, i)) {
/* 15 */                long jI001IO000 = I001IO000(i) & 1048575;
/* 17 */                Unsafe unsafe = I000lI;
/* 19 */                Object object = unsafe.getObject(obj2, jI001IO000);
/* 23 */                if (object == null) {
/* 100 */                   I000II.I001IO000(IlIi0I0.I000OiO(this.I00000oIO[i], "Source subfield ", " is present but null: ", obj2.toString()));
/* 408 */                   return;
                        }
/* 25 */                o0O1iOilloll o0o1ioillollI001iOo1i0O = I001iOo1i0O(i);
/* 33 */                if (!I000lI(obj, i)) {
/* 39 */                    if (I000oI1ioi(object)) {
/* 45 */                        Object objZze = o0o1ioillollI001iOo1i0O.zze();
/* 49 */                        o0o1ioillollI001iOo1i0O.I00000oOI(objZze, object);
/* 52 */                        unsafe.putObject(obj, jI001IO000, objZze);
                            } else {
/* 41 */                        unsafe.putObject(obj, jI001IO000, object);
                            }
/* 55 */                    I000iOII(i, obj);
/* 58 */                    return;
                        }
/* 59 */                Object object2 = unsafe.getObject(obj, jI001IO000);
/* 67 */                if (!I000oI1ioi(object2)) {
/* 69 */                    Object objZze2 = o0o1ioillollI001iOo1i0O.zze();
/* 73 */                    o0o1ioillollI001iOo1i0O.I00000oOI(objZze2, object2);
/* 76 */                    unsafe.putObject(obj, jI001IO000, objZze2);
/* 79 */                    object2 = objZze2;
                        }
/* 80 */                o0o1ioillollI001iOo1i0O.I00000oOI(object2, object);
                    }
                }

                public final void I000OiO(int i, Object obj, Object obj2) {
/* 1 */             int[] iArr = this.I00000oIO;
/* 3 */             int i2 = iArr[i];
/* 9 */             if (I00100l0(obj2, i2, i)) {
/* 19 */                long jI001IO000 = I001IO000(i) & 1048575;
/* 21 */                Unsafe unsafe = I000lI;
/* 23 */                Object object = unsafe.getObject(obj2, jI001IO000);
/* 27 */                if (object == null) {
/* 108 */                   I000II.I001IO000(IlIi0I0.I000OiO(iArr[i], "Source subfield ", " is present but null: ", obj2.toString()));
/* 408 */                   return;
                        }
/* 29 */                o0O1iOilloll o0o1ioillollI001iOo1i0O = I001iOo1i0O(i);
/* 37 */                if (!I00100l0(obj, i2, i)) {
/* 43 */                    if (I000oI1ioi(object)) {
/* 49 */                        Object objZze = o0o1ioillollI001iOo1i0O.zze();
/* 53 */                        o0o1ioillollI001iOo1i0O.I00000oOI(objZze, object);
/* 56 */                        unsafe.putObject(obj, jI001IO000, objZze);
                            } else {
/* 45 */                        unsafe.putObject(obj, jI001IO000, object);
                            }
/* 65 */                    o0ii0oo.I000O01llI0(obj, iArr[i + 2] & 1048575, i2);
/* 68 */                    return;
                        }
/* 69 */                Object object2 = unsafe.getObject(obj, jI001IO000);
/* 77 */                if (!I000oI1ioi(object2)) {
/* 79 */                    Object objZze2 = o0o1ioillollI001iOo1i0O.zze();
/* 83 */                    o0o1ioillollI001iOo1i0O.I00000oOI(objZze2, object2);
/* 86 */                    unsafe.putObject(obj, jI001IO000, objZze2);
/* 89 */                    object2 = objZze2;
                        }
/* 90 */                o0o1ioillollI001iOo1i0O.I00000oOI(object2, object);
                    }
                }

                public final void I000iOII(int i, Object obj) {
/* 5 */             int i2 = this.I00000oIO[i + 2];
/* 10 */            long j = 1048575 & i2;
/* 17 */            if (j == 1048575) {
/* 19 */                return;
                    }
/* 30 */            o0ii0oo.I000O01llI0(obj, j, (1 << (i2 >>> 20)) | o0ii0oo.I0000oI00(obj, j));
                }

                public final boolean I000l1(o001IlOi0O o001iloi0o, o001IlOi0O o001iloi0o2, int i) {
                    return I000lI(o001iloi0o, i) == I000lI(o001iloi0o2, i);
                }

                public final boolean I000lI(Object obj, int i) {
/* 5 */             int i2 = this.I00000oIO[i + 2];
/* 10 */            long j = i2 & 1048575;
/* 20 */            if (j != 1048575) {
                        return ((1 << (i2 >>> 20)) & o0ii0oo.I0000oI00(obj, j)) != 0;
                    }
/* 22 */            int iI001IO000 = I001IO000(i);
/* 26 */            long j2 = iI001IO000 & 1048575;
                    switch (I001IIilI0O(iI001IO000)) {
                        case 0:
/* 232 */                   if (Double.doubleToRawLongBits(o0ii0oo.I0000Il00O.I0010I0i(obj, j2)) != 0) {
                            }
                            break;
                        case 1:
/* 217 */                   if (Float.floatToRawIntBits(o0ii0oo.I0000Il00O.I001IIilI0O(obj, j2)) != 0) {
                            }
                            break;
                        case 2:
/* 204 */                   if (o0ii0oo.I0001Ioi1lo(obj, j2) != 0) {
                            }
                            break;
                        case 3:
/* 195 */                   if (o0ii0oo.I0001Ioi1lo(obj, j2) != 0) {
                            }
                            break;
                        case 4:
/* 186 */                   if (o0ii0oo.I0000oI00(obj, j2) != 0) {
                            }
                            break;
                        case 5:
/* 179 */                   if (o0ii0oo.I0001Ioi1lo(obj, j2) != 0) {
                            }
                            break;
                        case 6:
/* 170 */                   if (o0ii0oo.I0000oI00(obj, j2) != 0) {
                            }
                            break;
                        case 7:
                            break;
                        case 8:
/* 124 */                   Object objI000II = o0ii0oo.I000II(obj, j2);
/* 130 */                   if (!(objI000II instanceof String)) {
/* 144 */                       if (!(objI000II instanceof lol1I010)) {
/* 155 */                           OIiilo1Ool0o.I00100o1O0lo();
                                    break;
                                } else if (!lol1I010.I00iiI.equals(objI000II)) {
                                }
                            } else if (!((String) objI000II).isEmpty()) {
                            }
                            break;
                        case 9:
/* 120 */                   if (o0ii0oo.I000II(obj, j2) != null) {
                            }
                            break;
                        case 10:
/* 112 */                   if (!lol1I010.I00iiI.equals(o0ii0oo.I000II(obj, j2))) {
                            }
                            break;
                        case 11:
/* 98 */                    if (o0ii0oo.I0000oI00(obj, j2) != 0) {
                            }
                            break;
                        case 12:
/* 90 */                    if (o0ii0oo.I0000oI00(obj, j2) != 0) {
                            }
                            break;
                        case 13:
/* 82 */                    if (o0ii0oo.I0000oI00(obj, j2) != 0) {
                            }
                            break;
                        case 14:
/* 74 */                    if (o0ii0oo.I0001Ioi1lo(obj, j2) != 0) {
                            }
                            break;
                        case 15:
/* 64 */                    if (o0ii0oo.I0000oI00(obj, j2) != 0) {
                            }
                            break;
                        case 16:
/* 56 */                    if (o0ii0oo.I0001Ioi1lo(obj, j2) != 0) {
                            }
                            break;
                        case 17:
/* 46 */                    if (o0ii0oo.I000II(obj, j2) != null) {
                            }
                            break;
                        default:
/* 38 */                    OIiilo1Ool0o.I00100o1O0lo();
                            break;
                    }
/* 18 */            return false;
                }

                public final boolean I000o00OoI0I(Object obj, int i, int i2, int i3, int i4) {
                    return i2 == 1048575 ? I000lI(obj, i) : (i3 & i4) != 0;
                }

                public final boolean I00100l0(Object obj, int i, int i2) {
                    return o0ii0oo.I0000oI00(obj, (long) (this.I00000oIO[i2 + 2] & 1048575)) == i;
                }

                /*  JADX ERROR: Type inference failed
                    jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
                    	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                    	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                    	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
                    */
                public final int I00100o1O0lo(java.lang.Object r39, byte[] r40, int r41, int r42, int r43, p000.i111i0I1 r44) throws p000.o010O1 {
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
                        Method dump skipped, instructions count: 3912
                        To view this dump change 'Code comments level' option to 'DEBUG'
                    */
                    throw new UnsupportedOperationException("Method not decompiled: p000.o0IiI1l1Ol.I00100o1O0lo(java.lang.Object, byte[], int, int, int, i111i0I1):int");
                }

                public final int I00111O(int i, int i2) {
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

                public final int I001IO000(int i) {
/* 5 */             return this.I00000oIO[i + 1];
                }

                public final i1IOi0lOi1II I001i1lo1io(int i) {
/* 1 */             int i2 = i / 3;
/* 10 */            return (i1IOi0lOi1II) this.I00000oOI[i2 + i2 + 1];
                }

                public final o0O1iOilloll I001iOo1i0O(int i) {
/* 1 */             Object[] objArr = this.I00000oOI;
/* 3 */             int i2 = i / 3;
/* 5 */             int i3 = i2 + i2;
/* 8 */             o0O1iOilloll o0o1ioilloll = (o0O1iOilloll) objArr[i3];
/* 10 */            if (o0o1ioilloll != null) {
/* 12 */                return o0o1ioilloll;
                    }
/* 21 */            o0O1iOilloll o0o1ioillollI00000oIO = o0Ioolo.I0000Il00O.I00000oIO((Class) objArr[i3 + 1]);
/* 25 */            objArr[i3] = o0o1ioillollI00000oIO;
/* 29 */            return o0o1ioillollI00000oIO;
                }

                public final Object I001l0I00(int i, Object obj) {
/* 1 */             o0O1iOilloll o0o1ioillollI001iOo1i0O = I001iOo1i0O(i);
/* 12 */            int iI001IO000 = I001IO000(i) & 1048575;
/* 17 */            if (!I000lI(obj, i)) {
/* 19 */                return o0o1ioillollI001iOo1i0O.zze();
                    }
/* 27 */            Object object = I000lI.getObject(obj, iI001IO000);
/* 35 */            if (I000oI1ioi(object)) {
/* 37 */                return object;
                    }
/* 38 */            Object objZze = o0o1ioillollI001iOo1i0O.zze();
/* 42 */            if (object != null) {
/* 44 */                o0o1ioillollI001iOo1i0O.I00000oOI(objZze, object);
                    }
/* 106 */           return objZze;
                }

                public final Object I001lIiIIo1O(Object obj, int i, int i2) {
/* 1 */             o0O1iOilloll o0o1ioillollI001iOo1i0O = I001iOo1i0O(i2);
/* 9 */             if (!I00100l0(obj, i, i2)) {
/* 11 */                return o0o1ioillollI001iOo1i0O.zze();
                    }
/* 27 */            Object object = I000lI.getObject(obj, I001IO000(i2) & 1048575);
/* 35 */            if (I000oI1ioi(object)) {
/* 37 */                return object;
                    }
/* 38 */            Object objZze = o0o1ioillollI001iOo1i0O.zze();
/* 42 */            if (object != null) {
/* 44 */                o0o1ioillollI001iOo1i0O.I00000oOI(objZze, object);
                    }
/* 98 */            return objZze;
                }

                @Override
                public final Object zze() {
/* 11 */            return (o001IlOi0O) ((o001IlOi0O) this.I0000oI00).I000iOII(4, null);
                }
            }

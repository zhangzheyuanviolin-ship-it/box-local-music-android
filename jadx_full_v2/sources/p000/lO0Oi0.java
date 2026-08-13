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
            
            public final class lO0Oi0 implements lO1liolI0IO {
                public static final int[] I000l1 = new int[0];
                public static final Unsafe I000lI;
                public int[] I00000oIO;
                public Object[] I00000oOI;
                public int I0000Il00O;
                public int I0000O;
                public lIoolOoilO I0000oI00;
                public boolean I0001Ioi1lo;
                public int[] I000II;
                public int I000O01llI0;
                public int I000OOo1O;
                public o0iOli I000OiO;
                public liIoOiiO1Oi I000iOII;

                static {
                    Unsafe unsafe;
                    try {
/* 17 */                unsafe = (Unsafe) AccessController.doPrivileged(new OoiioO0o(20));
                    } catch (Throwable unused) {
/* 20 */                unsafe = null;
                    }
/* 21 */            I000lI = unsafe;
                }

                public static boolean I000oI1ioi(Object obj) {
/* 1 */             if (obj == null) {
/* 3 */                 return false;
                    }
/* 7 */             if (obj instanceof lIIOO0oi1o) {
/* 11 */                return ((lIIOO0oi1o) obj).I000O01llI0();
                    }
/* 16 */            return true;
                }

                public static lOOlilii I0010I0i(Object obj) {
/* 1 */             lIIOO0oi1o liioo0oi1o = (lIIOO0oi1o) obj;
/* 3 */             lOOlilii loolilii = liioo0oi1o.zzc;
/* 7 */             if (loolilii != lOOlilii.I0001Ioi1lo) {
/* 29 */                return loolilii;
                    }
/* 9 */             lOOlilii looliliiI00000oOI = lOOlilii.I00000oOI();
/* 13 */            liioo0oi1o.zzc = looliliiI00000oOI;
/* 29 */            return looliliiI00000oOI;
                }

                public static int I0010o(long j, Object obj) {
/* 7 */             return ((Integer) lOiiillo.I000II(obj, j)).intValue();
                }

                public static int I001IIilI0O(int i) {
/* 3 */             return (i >>> 20) & 255;
                }

                public static long I001i1O0Ol(long j, Object obj) {
/* 7 */             return ((Long) lOiiillo.I000II(obj, j)).longValue();
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
/* 14 */                if (obj instanceof lIIOO0oi1o) {
/* 17 */                    lIIOO0oi1o liioo0oi1o = (lIIOO0oi1o) obj;
/* 19 */                    liioo0oi1o.I0001Ioi1lo();
/* 22 */                    liioo0oi1o.zza = 0;
/* 24 */                    liioo0oi1o.I0000O();
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
/* 83 */                                    l1Io0Iiio1o0 l1io0iiio1o0 = (l1Io0Iiio1o0) ((lIOIoo1O) lOiiillo.I000II(obj, j));
/* 87 */                                    if (l1io0iiio1o0.I00iOIl) {
/* 89 */                                        l1io0iiio1o0.I00iOIl = false;
                                                break;
                                            } else {
                                                break;
                                            }
                                        case 50:
/* 62 */                                    Object object = unsafe.getObject(obj, j);
/* 66 */                                    if (object != null) {
/* 71 */                                        ((lIo10Iolio) object).I00iOIl = false;
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
/* 140 */               lOOlilii loolilii = ((lIIOO0oi1o) obj).zzc;
/* 144 */               if (loolilii.I0000oI00) {
/* 146 */                   loolilii.I0000oI00 = false;
                        }
/* 150 */               if (this.I0001Ioi1lo) {
/* 154 */                   this.I000iOII.getClass();
/* 161 */                   ((lI1oIOl10iIo) obj).zzb.I0000Il00O();
                        }
                    }
                }

                @Override
                public final void I00000oOI(Object obj, Object obj2) {
                    Object obj3;
/* 1 */             int[] iArr = this.I00000oIO;
/* 7 */             if (!I000oI1ioi(obj)) {
/* 518 */               I000II.I000iOII("Mutating immutable message: ".concat(String.valueOf(obj)));
/* 521 */               return;
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
/* 471 */                       obj3 = obj;
/* 476 */                       if (I000lI(obj2, i)) {
/* 478 */                           Ooil0oIOI0l0 ooil0oIOI0l0 = lOiiillo.I0000Il00O;
/* 484 */                           ooil0oIOI0l0.I00II0oii1o(obj3, j, ooil0oIOI0l0.I0010I0i(obj2, j));
/* 487 */                           I000iOII(i, obj3);
                                    continue;
                                }
/* 490 */                       i += 3;
/* 492 */                       obj = obj3;
                            case 1:
/* 451 */                       obj3 = obj;
/* 456 */                       if (I000lI(obj2, i)) {
/* 458 */                           Ooil0oIOI0l0 ooil0oIOI0l02 = lOiiillo.I0000Il00O;
/* 464 */                           ooil0oIOI0l02.I00IioO0OiOi(obj3, j, ooil0oIOI0l02.I001IIilI0O(obj2, j));
/* 467 */                           I000iOII(i, obj3);
                                } else {
                                    continue;
                                }
/* 490 */                       i += 3;
/* 492 */                       obj = obj3;
                            case 2:
/* 429 */                       obj3 = obj;
/* 434 */                       if (I000lI(obj2, i)) {
/* 444 */                           lOiiillo.I0000Il00O.I00000oOI.putLong(obj3, j, lOiiillo.I0001Ioi1lo(obj2, j));
/* 447 */                           I000iOII(i, obj3);
                                } else {
                                    continue;
                                }
/* 490 */                       i += 3;
/* 492 */                       obj = obj3;
                            case 3:
/* 407 */                       obj3 = obj;
/* 412 */                       if (I000lI(obj2, i)) {
/* 422 */                           lOiiillo.I0000Il00O.I00000oOI.putLong(obj3, j, lOiiillo.I0001Ioi1lo(obj2, j));
/* 425 */                           I000iOII(i, obj3);
                                } else {
                                    continue;
                                }
/* 490 */                       i += 3;
/* 492 */                       obj = obj3;
                            case 4:
/* 389 */                       obj3 = obj;
/* 394 */                       if (I000lI(obj2, i)) {
/* 400 */                           lOiiillo.I000O01llI0(obj3, j, lOiiillo.I0000oI00(obj2, j));
/* 403 */                           I000iOII(i, obj3);
                                } else {
                                    continue;
                                }
/* 490 */                       i += 3;
/* 492 */                       obj = obj3;
                            case 5:
/* 367 */                       obj3 = obj;
/* 372 */                       if (I000lI(obj2, i)) {
/* 382 */                           lOiiillo.I0000Il00O.I00000oOI.putLong(obj3, j, lOiiillo.I0001Ioi1lo(obj2, j));
/* 385 */                           I000iOII(i, obj3);
                                } else {
                                    continue;
                                }
/* 490 */                       i += 3;
/* 492 */                       obj = obj3;
                            case 6:
/* 348 */                       obj3 = obj;
/* 353 */                       if (I000lI(obj2, i)) {
/* 359 */                           lOiiillo.I000O01llI0(obj3, j, lOiiillo.I0000oI00(obj2, j));
/* 362 */                           I000iOII(i, obj3);
                                } else {
                                    continue;
                                }
/* 490 */                       i += 3;
/* 492 */                       obj = obj3;
                            case 7:
/* 327 */                       obj3 = obj;
/* 332 */                       if (I000lI(obj2, i)) {
/* 334 */                           Ooil0oIOI0l0 ooil0oIOI0l03 = lOiiillo.I0000Il00O;
/* 340 */                           ooil0oIOI0l03.I001iOo1i0O(obj3, j, ooil0oIOI0l03.I00Io1o110i(obj2, j));
/* 343 */                           I000iOII(i, obj3);
                                } else {
                                    continue;
                                }
/* 490 */                       i += 3;
/* 492 */                       obj = obj3;
                            case 8:
/* 308 */                       obj3 = obj;
/* 313 */                       if (I000lI(obj2, i)) {
/* 319 */                           lOiiillo.I000OOo1O(obj3, j, lOiiillo.I000II(obj2, j));
/* 322 */                           I000iOII(i, obj3);
                                } else {
                                    continue;
                                }
/* 490 */                       i += 3;
/* 492 */                       obj = obj3;
                            case 9:
/* 302 */                       obj3 = obj;
/* 303 */                       I000OOo1O(i, obj3, obj2);
                                continue;
/* 490 */                       i += 3;
/* 492 */                       obj = obj3;
                            case 10:
/* 283 */                       obj3 = obj;
/* 288 */                       if (I000lI(obj2, i)) {
/* 294 */                           lOiiillo.I000OOo1O(obj3, j, lOiiillo.I000II(obj2, j));
/* 297 */                           I000iOII(i, obj3);
                                } else {
                                    continue;
                                }
/* 490 */                       i += 3;
/* 492 */                       obj = obj3;
                            case 11:
/* 264 */                       obj3 = obj;
/* 269 */                       if (I000lI(obj2, i)) {
/* 275 */                           lOiiillo.I000O01llI0(obj3, j, lOiiillo.I0000oI00(obj2, j));
/* 278 */                           I000iOII(i, obj3);
                                } else {
                                    continue;
                                }
/* 490 */                       i += 3;
/* 492 */                       obj = obj3;
                            case 12:
/* 245 */                       obj3 = obj;
/* 250 */                       if (I000lI(obj2, i)) {
/* 256 */                           lOiiillo.I000O01llI0(obj3, j, lOiiillo.I0000oI00(obj2, j));
/* 259 */                           I000iOII(i, obj3);
                                } else {
                                    continue;
                                }
/* 490 */                       i += 3;
/* 492 */                       obj = obj3;
                            case 13:
/* 226 */                       obj3 = obj;
/* 231 */                       if (I000lI(obj2, i)) {
/* 237 */                           lOiiillo.I000O01llI0(obj3, j, lOiiillo.I0000oI00(obj2, j));
/* 240 */                           I000iOII(i, obj3);
                                } else {
                                    continue;
                                }
/* 490 */                       i += 3;
/* 492 */                       obj = obj3;
                            case 14:
/* 203 */                       obj3 = obj;
/* 208 */                       if (I000lI(obj2, i)) {
/* 218 */                           lOiiillo.I0000Il00O.I00000oOI.putLong(obj3, j, lOiiillo.I0001Ioi1lo(obj2, j));
/* 221 */                           I000iOII(i, obj3);
                                } else {
                                    continue;
                                }
/* 490 */                       i += 3;
/* 492 */                       obj = obj3;
                            case 15:
/* 184 */                       obj3 = obj;
/* 189 */                       if (I000lI(obj2, i)) {
/* 195 */                           lOiiillo.I000O01llI0(obj3, j, lOiiillo.I0000oI00(obj2, j));
/* 198 */                           I000iOII(i, obj3);
                                } else {
                                    continue;
                                }
/* 490 */                       i += 3;
/* 492 */                       obj = obj3;
                            case 16:
/* 165 */                       if (I000lI(obj2, i)) {
/* 175 */                           obj3 = obj;
/* 176 */                           lOiiillo.I0000Il00O.I00000oOI.putLong(obj3, j, lOiiillo.I0001Ioi1lo(obj2, j));
/* 179 */                           I000iOII(i, obj3);
                                }
/* 490 */                       i += 3;
/* 492 */                       obj = obj3;
                                break;
                            case 17:
/* 157 */                       I000OOo1O(i, obj, obj2);
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
/* 114 */                       lIOIoo1O lioioo1oZzd = (lIOIoo1O) lOiiillo.I000II(obj, j);
/* 120 */                       lIOIoo1O lioioo1o = (lIOIoo1O) lOiiillo.I000II(obj2, j);
/* 122 */                       int size = lioioo1oZzd.size();
/* 126 */                       int size2 = lioioo1o.size();
/* 130 */                       if (size > 0 && size2 > 0) {
/* 139 */                           if (!((l1Io0Iiio1o0) lioioo1oZzd).I00iOIl) {
/* 142 */                               lioioo1oZzd = lioioo1oZzd.zzd(size2 + size);
                                    }
/* 146 */                           lioioo1oZzd.addAll(lioioo1o);
                                }
/* 149 */                       if (size > 0) {
/* 152 */                           lioioo1o = lioioo1oZzd;
                                }
/* 153 */                       lOiiillo.I000OOo1O(obj, j, lioioo1o);
                                break;
                            case 50:
/* 92 */                        o0iOli o0ioli = lOI01O1oI.I00000oIO;
/* 106 */                       lOiiillo.I000OOo1O(obj, j, ll0i0l0.I00000oIO(lOiiillo.I000II(obj, j), lOiiillo.I000II(obj2, j)));
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
/* 79 */                            lOiiillo.I000OOo1O(obj, j, lOiiillo.I000II(obj2, j));
/* 88 */                            lOiiillo.I000O01llI0(obj, iArr[i + 2] & 1048575, i3);
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
/* 52 */                            lOiiillo.I000OOo1O(obj, j, lOiiillo.I000II(obj2, j));
/* 61 */                            lOiiillo.I000O01llI0(obj, iArr[i + 2] & 1048575, i3);
                                    break;
                                }
                                break;
                            case 68:
/* 38 */                        I000OiO(i, obj, obj2);
                                break;
                        }
/* 35 */                obj3 = obj;
/* 490 */               i += 3;
/* 492 */               obj = obj3;
                    }
/* 495 */           Object obj4 = obj;
/* 496 */           lOI01O1oI.I00100l0(obj4, obj2);
/* 501 */           if (this.I0001Ioi1lo) {
/* 503 */               lOI01O1oI.I000oI1ioi(obj4, obj2);
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
/* 15 */            while (i5 < this.I000O01llI0) {
/* 19 */                int i7 = this.I000II[i5];
/* 21 */                int i8 = iArr[i7];
/* 23 */                int iI001IO000 = I001IO000(i7);
/* 29 */                int i9 = iArr[i7 + 2];
/* 31 */                int i10 = i9 & 1048575;
/* 35 */                int i11 = 1 << (i9 >>> 20);
/* 37 */                if (i10 != i6) {
/* 39 */                    if (i10 != 1048575) {
/* 44 */                        i4 = I000lI.getInt(obj, i10);
                            }
/* 48 */                    i = i4;
/* 49 */                    i6 = i10;
                        } else {
/* 51 */                    i = i4;
                        }
/* 55 */                if ((268435456 & iI001IO000) != 0) {
/* 57 */                    i2 = i7;
/* 58 */                    i3 = i6;
/* 64 */                    if (I000o00OoI0I(obj, i2, i3, i, i11)) {
                            }
/* 5 */                     return false;
                        }
/* 67 */                i2 = i7;
/* 68 */                i3 = i6;
/* 69 */                int iI001IIilI0O = I001IIilI0O(iI001IO000);
/* 75 */                if (iI001IIilI0O == 9 || iI001IIilI0O == 17) {
/* 200 */                   if (I000o00OoI0I(obj, i2, i3, i, i11) && !I001iOo1i0O(i2).I0000Il00O(lOiiillo.I000II(obj, iI001IO000 & 1048575))) {
/* 5 */                         return false;
                            }
/* 220 */                   i5++;
/* 222 */                   i6 = i3;
/* 223 */                   i4 = i;
                        } else {
/* 83 */                    if (iI001IIilI0O != 27) {
/* 87 */                        if (iI001IIilI0O == 60 || iI001IIilI0O == 68) {
/* 135 */                           if (I00100l0(obj, i8, i2) && !I001iOo1i0O(i2).I0000Il00O(lOiiillo.I000II(obj, iI001IO000 & 1048575))) {
/* 5 */                                 return false;
                                    }
                                } else if (iI001IIilI0O != 49) {
/* 99 */                            if (iI001IIilI0O == 50 && !((lIo10Iolio) lOiiillo.I000II(obj, iI001IO000 & 1048575)).isEmpty()) {
/* 119 */                               int i12 = i2 / 3;
/* 130 */                               throw IIlIOloOOO.I000l1(this.I00000oOI[i12 + i12]);
                                    }
                                }
/* 220 */                       i5++;
/* 222 */                       i6 = i3;
/* 223 */                       i4 = i;
                            }
/* 162 */                   List list = (List) lOiiillo.I000II(obj, iI001IO000 & 1048575);
/* 168 */                   if (list.isEmpty()) {
                                continue;
                            } else {
/* 170 */                       lO1liolI0IO lo1lioli0ioI001iOo1i0O = I001iOo1i0O(i2);
/* 179 */                       for (int i13 = 0; i13 < list.size(); i13++) {
/* 189 */                           if (!lo1lioli0ioI001iOo1i0O.I0000Il00O(list.get(i13))) {
/* 5 */                                 return false;
                                    }
                                }
                            }
/* 220 */                   i5++;
/* 222 */                   i6 = i3;
/* 223 */                   i4 = i;
                        }
                    }
/* 228 */           if (this.I0001Ioi1lo) {
/* 235 */               ((lI1oIOl10iIo) obj).zzb.I0000O();
                    }
/* 14 */            return true;
                }

                /* JADX WARN: Removed duplicated region for block: B:147:0x036d  */
                /* JADX WARN: Removed duplicated region for block: B:200:0x04ba  */
                /* JADX WARN: Removed duplicated region for block: B:233:0x05b2  */
                /* JADX WARN: Removed duplicated region for block: B:236:0x05c1 A[PHI: r7
                  0x05c1: PHI (r7v9 int) = (r7v1 int), (r7v5 int), (r7v10 int) binds: [B:275:0x06c5, B:260:0x066c, B:235:0x05bf] A[DONT_GENERATE, DONT_INLINE]] */
                /* JADX WARN: Removed duplicated region for block: B:35:0x00b5  */
                @Override
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final int I0000O(l1Ii10o l1ii10o) {
                    int i;
                    int i2;
                    int iI0010I0i;
                    int iI00000oIO;
                    int iI0010I0i2;
                    int iI0000oI00;
                    int iI0010I0i3;
                    int iI00000oIO2;
                    int i3;
                    int iI0010I0i4;
                    int i4;
                    int iI00000oIO3;
                    int iI000O01llI0;
                    int size;
                    int iI000o00OoI0I;
                    int iI0010I0i5;
                    int iI0010I0i6;
                    int iI0010I0i7;
                    int iI0010I0i8;
                    int size2;
                    int iI0010I0i9;
                    int size3;
                    int iI0010I0i10;
                    int iI00000oIO4;
                    int iI0010I0i11;
                    int iI00000oIO5;
                    int iI0010I0i12;
                    int iI0000oI002;
                    int iI0010o;
/* 1 */             lO0Oi0 lo0oi0 = this;
/* 3 */             l1Ii10o l1ii10o2 = l1ii10o;
/* 5 */             int[] iArr = lo0oi0.I00000oIO;
/* 7 */             int i5 = 1048575;
/* 10 */            int i6 = 1048575;
/* 11 */            int i7 = 0;
/* 12 */            int i8 = 0;
/* 13 */            int iI00100l0 = 0;
/* 15 */            while (i7 < iArr.length) {
/* 17 */                int iI001IO000 = lo0oi0.I001IO000(i7);
/* 21 */                int iI001IIilI0O = I001IIilI0O(iI001IO000);
/* 27 */                int i9 = iArr[i7];
/* 29 */                int i10 = iArr[i7 + 2];
/* 31 */                int i11 = i10 & i5;
/* 40 */                Unsafe unsafe = I000lI;
/* 42 */                if (iI001IIilI0O <= 17) {
/* 44 */                    if (i11 != i6) {
/* 52 */                        i8 = i11 == i5 ? 0 : unsafe.getInt(l1ii10o2, i11);
/* 57 */                        i6 = i11;
                            }
/* 60 */                    i = 1 << (i10 >>> 20);
                        } else {
/* 63 */                    i = 0;
                        }
/* 65 */                int i12 = iI001IO000 & i5;
/* 70 */                if (iI001IIilI0O >= lI0oI0OIoI0.I00iiI.I00iOIl) {
/* 74 */                    int i13 = lI0oI0OIoI0.I00iiO.I00iOIl;
                        }
                        long j = i12;
/* 79 */                int iI0010I0i13 = 4;
                        switch (iI001IIilI0O) {
                            case 0:
/* 1743 */                      if (lo0oi0.I000o00OoI0I(l1ii10o2, i7, i6, i8, i)) {
/* 1747 */                          iI00100l0 = io1OllI.I00100l0(i9 << 3, 8, iI00100l0);
                                }
/* 1751 */                      i7 += 3;
/* 1753 */                      l1ii10o2 = l1ii10o;
/* 1755 */                      i5 = 1048575;
                            case 1:
/* 1728 */                      i2 = 4;
/* 1734 */                      if (lo0oi0.I000o00OoI0I(l1ii10o2, i7, i6, i8, i)) {
/* 1476 */                          iI00100l0 = io1OllI.I00100l0(i9 << 3, i2, iI00100l0);
                                }
/* 1421 */                      lo0oi0 = this;
/* 1751 */                      i7 += 3;
/* 1753 */                      l1ii10o2 = l1ii10o;
/* 1755 */                      i5 = 1048575;
                            case 2:
/* 1710 */                      if (lo0oi0.I000o00OoI0I(l1ii10o2, i7, i6, i8, i)) {
/* 1714 */                          long j2 = unsafe.getLong(l1ii10o2, j);
/* 1718 */                          iI0010I0i = l1lo010IOi0.I0010I0i(i9 << 3);
/* 1722 */                          iI00000oIO = l1lo010IOi0.I00000oIO(j2);
/* 1420 */                          iI00100l0 += iI00000oIO + iI0010I0i;
                                }
/* 1421 */                      lo0oi0 = this;
/* 1751 */                      i7 += 3;
/* 1753 */                      l1ii10o2 = l1ii10o;
/* 1755 */                      i5 = 1048575;
                            case 3:
/* 1687 */                      if (lo0oi0.I000o00OoI0I(l1ii10o2, i7, i6, i8, i)) {
/* 1691 */                          long j3 = unsafe.getLong(l1ii10o2, j);
/* 1695 */                          iI0010I0i = l1lo010IOi0.I0010I0i(i9 << 3);
/* 1699 */                          iI00000oIO = l1lo010IOi0.I00000oIO(j3);
/* 1420 */                          iI00100l0 += iI00000oIO + iI0010I0i;
                                }
/* 1421 */                      lo0oi0 = this;
/* 1751 */                      i7 += 3;
/* 1753 */                      l1ii10o2 = l1ii10o;
/* 1755 */                      i5 = 1048575;
                            case 4:
/* 1663 */                      if (lo0oi0.I000o00OoI0I(l1ii10o2, i7, i6, i8, i)) {
/* 1667 */                          long j4 = unsafe.getInt(l1ii10o2, j);
/* 1672 */                          iI0010I0i = l1lo010IOi0.I0010I0i(i9 << 3);
/* 1676 */                          iI00000oIO = l1lo010IOi0.I00000oIO(j4);
/* 1420 */                          iI00100l0 += iI00000oIO + iI0010I0i;
                                }
/* 1421 */                      lo0oi0 = this;
/* 1751 */                      i7 += 3;
/* 1753 */                      l1ii10o2 = l1ii10o;
/* 1755 */                      i5 = 1048575;
                            case 5:
/* 1654 */                      if (lo0oi0.I000o00OoI0I(l1ii10o2, i7, i6, i8, i)) {
/* 1461 */                          iI00100l0 = io1OllI.I00100l0(i9 << 3, 8, iI00100l0);
                                }
/* 1421 */                      lo0oi0 = this;
/* 1751 */                      i7 += 3;
/* 1753 */                      l1ii10o2 = l1ii10o;
/* 1755 */                      i5 = 1048575;
                            case 6:
/* 1639 */                      i2 = 4;
/* 1645 */                      if (lo0oi0.I000o00OoI0I(l1ii10o2, i7, i6, i8, i)) {
                                }
/* 1421 */                      lo0oi0 = this;
/* 1751 */                      i7 += 3;
/* 1753 */                      l1ii10o2 = l1ii10o;
/* 1755 */                      i5 = 1048575;
                                break;
                            case 7:
/* 1629 */                      if (lo0oi0.I000o00OoI0I(l1ii10o2, i7, i6, i8, i)) {
/* 1633 */                          iI00100l0 = io1OllI.I00100l0(i9 << 3, 1, iI00100l0);
                                }
/* 1421 */                      lo0oi0 = this;
/* 1751 */                      i7 += 3;
/* 1753 */                      l1ii10o2 = l1ii10o;
/* 1755 */                      i5 = 1048575;
                            case 8:
/* 1589 */                      if (lo0oi0.I000o00OoI0I(l1ii10o2, i7, i6, i8, i)) {
/* 1591 */                          int i14 = i9 << 3;
/* 1593 */                          Object object = unsafe.getObject(l1ii10o2, j);
/* 1599 */                          if (object instanceof l1l1O1i) {
/* 1603 */                              iI0010I0i2 = l1lo010IOi0.I0010I0i(i14);
/* 1607 */                              iI0000oI00 = ((l1l1O1i) object).I0000oI00();
/* 1545 */                              iI00100l0 = io1OllI.I0010o(iI0000oI00, iI0000oI00, iI0010I0i2, iI00100l0);
                                    } else {
/* 1614 */                              iI0010I0i = l1lo010IOi0.I0010I0i(i14);
/* 1618 */                              iI00000oIO = l1lo010IOi0.I00100o1O0lo((String) object);
/* 1420 */                              iI00100l0 += iI00000oIO + iI0010I0i;
                                    }
                                }
/* 1421 */                      lo0oi0 = this;
/* 1751 */                      i7 += 3;
/* 1753 */                      l1ii10o2 = l1ii10o;
/* 1755 */                      i5 = 1048575;
                            case 9:
/* 1556 */                      if (lo0oi0.I000o00OoI0I(l1ii10o2, i7, i6, i8, i)) {
/* 1558 */                          Object object2 = unsafe.getObject(l1ii10o2, j);
/* 1562 */                          lO1liolI0IO lo1lioli0ioI001iOo1i0O = lo0oi0.I001iOo1i0O(i7);
/* 1566 */                          o0iOli o0ioli = lOI01O1oI.I00000oIO;
/* 1572 */                          iI0010I0i3 = l1lo010IOi0.I0010I0i(i9 << 3);
/* 1578 */                          iI00000oIO2 = ((l1Ii10o) ((lIoolOoilO) object2)).I00000oIO(lo1lioli0ioI001iOo1i0O);
/* 296 */                           iI00100l0 = io1OllI.I0010o(iI00000oIO2, iI00000oIO2, iI0010I0i3, iI00100l0);
/* 1751 */                          i7 += 3;
/* 1753 */                          l1ii10o2 = l1ii10o;
/* 1755 */                          i5 = 1048575;
                                } else {
/* 1751 */                          i7 += 3;
/* 1753 */                          l1ii10o2 = l1ii10o;
/* 1755 */                          i5 = 1048575;
                                }
                            case 10:
/* 1527 */                      if (lo0oi0.I000o00OoI0I(l1ii10o2, i7, i6, i8, i)) {
/* 1535 */                          l1l1O1i l1l1o1i = (l1l1O1i) unsafe.getObject(l1ii10o2, j);
/* 1537 */                          iI0010I0i2 = l1lo010IOi0.I0010I0i(i9 << 3);
/* 1541 */                          iI0000oI00 = l1l1o1i.I0000oI00();
/* 1545 */                          iI00100l0 = io1OllI.I0010o(iI0000oI00, iI0000oI00, iI0010I0i2, iI00100l0);
                                }
/* 1421 */                      lo0oi0 = this;
/* 1751 */                      i7 += 3;
/* 1753 */                      l1ii10o2 = l1ii10o;
/* 1755 */                      i5 = 1048575;
                            case 11:
/* 1509 */                      if (lo0oi0.I000o00OoI0I(l1ii10o2, i7, i6, i8, i)) {
/* 1513 */                          i3 = unsafe.getInt(l1ii10o2, j);
/* 1517 */                          iI0010I0i4 = l1lo010IOi0.I0010I0i(i9 << 3);
/* 1447 */                          iI00100l0 = io1OllI.I00100l0(i3, iI0010I0i4, iI00100l0);
                                }
/* 1421 */                      lo0oi0 = this;
/* 1751 */                      i7 += 3;
/* 1753 */                      l1ii10o2 = l1ii10o;
/* 1755 */                      i5 = 1048575;
                            case 12:
/* 1486 */                      if (lo0oi0.I000o00OoI0I(l1ii10o2, i7, i6, i8, i)) {
/* 1490 */                          long j5 = unsafe.getInt(l1ii10o2, j);
/* 1495 */                          iI0010I0i = l1lo010IOi0.I0010I0i(i9 << 3);
/* 1499 */                          iI00000oIO = l1lo010IOi0.I00000oIO(j5);
/* 1420 */                          iI00100l0 += iI00000oIO + iI0010I0i;
                                }
/* 1421 */                      lo0oi0 = this;
/* 1751 */                      i7 += 3;
/* 1753 */                      l1ii10o2 = l1ii10o;
/* 1755 */                      i5 = 1048575;
                            case 13:
/* 1466 */                      i2 = 4;
/* 1472 */                      if (lo0oi0.I000o00OoI0I(l1ii10o2, i7, i6, i8, i)) {
                                }
/* 1421 */                      lo0oi0 = this;
/* 1751 */                      i7 += 3;
/* 1753 */                      l1ii10o2 = l1ii10o;
/* 1755 */                      i5 = 1048575;
                                break;
                            case 14:
/* 1457 */                      if (lo0oi0.I000o00OoI0I(l1ii10o2, i7, i6, i8, i)) {
                                }
/* 1421 */                      lo0oi0 = this;
/* 1751 */                      i7 += 3;
/* 1753 */                      l1ii10o2 = l1ii10o;
/* 1755 */                      i5 = 1048575;
                                break;
                            case 15:
/* 1430 */                      if (lo0oi0.I000o00OoI0I(l1ii10o2, i7, i6, i8, i)) {
/* 1434 */                          int i15 = unsafe.getInt(l1ii10o2, j);
/* 1442 */                          iI0010I0i4 = l1lo010IOi0.I0010I0i(i9 << 3);
/* 1446 */                          i3 = (i15 >> 31) ^ (i15 + i15);
/* 1447 */                          iI00100l0 = io1OllI.I00100l0(i3, iI0010I0i4, iI00100l0);
                                }
/* 1421 */                      lo0oi0 = this;
/* 1751 */                      i7 += 3;
/* 1753 */                      l1ii10o2 = l1ii10o;
/* 1755 */                      i5 = 1048575;
                            case 16:
/* 1398 */                      if (lo0oi0.I000o00OoI0I(l1ii10o2, i7, i6, i8, i)) {
/* 1402 */                          long j6 = unsafe.getLong(l1ii10o2, j);
/* 1410 */                          iI0010I0i = l1lo010IOi0.I0010I0i(i9 << 3);
/* 1415 */                          iI00000oIO = l1lo010IOi0.I00000oIO((j6 >> 63) ^ (j6 + j6));
/* 1420 */                          iI00100l0 += iI00000oIO + iI0010I0i;
                                }
/* 1421 */                      lo0oi0 = this;
/* 1751 */                      i7 += 3;
/* 1753 */                      l1ii10o2 = l1ii10o;
/* 1755 */                      i5 = 1048575;
                            case 17:
/* 1366 */                      if (lo0oi0.I000o00OoI0I(l1ii10o2, i7, i6, i8, i)) {
/* 1372 */                          lIoolOoilO lioolooilo = (lIoolOoilO) unsafe.getObject(l1ii10o2, j);
/* 1374 */                          lO1liolI0IO lo1lioli0ioI001iOo1i0O2 = lo0oi0.I001iOo1i0O(i7);
/* 1380 */                          int iI0010I0i14 = l1lo010IOi0.I0010I0i(i9 << 3);
/* 1384 */                          i4 = iI0010I0i14 + iI0010I0i14;
/* 1387 */                          iI00000oIO3 = ((l1Ii10o) lioolooilo).I00000oIO(lo1lioli0ioI001iOo1i0O2);
/* 116 */                           iI000O01llI0 = iI00000oIO3 + i4;
/* 117 */                           iI00100l0 += iI000O01llI0;
/* 1751 */                          i7 += 3;
/* 1753 */                          l1ii10o2 = l1ii10o;
/* 1755 */                          i5 = 1048575;
                                } else {
/* 1751 */                          i7 += 3;
/* 1753 */                          l1ii10o2 = l1ii10o;
/* 1755 */                          i5 = 1048575;
                                }
                            case PoseLandmark.RIGHT_PINKY:
/* 1355 */                      iI000O01llI0 = lOI01O1oI.I000O01llI0(i9, (List) unsafe.getObject(l1ii10o2, j));
/* 117 */                       iI00100l0 += iI000O01llI0;
/* 1751 */                      i7 += 3;
/* 1753 */                      l1ii10o2 = l1ii10o;
/* 1755 */                      i5 = 1048575;
                            case PoseLandmark.LEFT_INDEX:
/* 1343 */                      iI000O01llI0 = lOI01O1oI.I000II(i9, (List) unsafe.getObject(l1ii10o2, j));
/* 117 */                       iI00100l0 += iI000O01llI0;
/* 1751 */                      i7 += 3;
/* 1753 */                      l1ii10o2 = l1ii10o;
/* 1755 */                      i5 = 1048575;
                            case PoseLandmark.RIGHT_INDEX:
/* 1309 */                      List list = (List) unsafe.getObject(l1ii10o2, j);
/* 1311 */                      o0iOli o0ioli2 = lOI01O1oI.I00000oIO;
/* 1335 */                      iI0010I0i6 = list.size() == 0 ? 0 : (l1lo010IOi0.I0010I0i(i9 << 3) * list.size()) + lOI01O1oI.I000OiO(list);
/* 1222 */                      iI00100l0 += iI0010I0i6;
/* 1751 */                      i7 += 3;
/* 1753 */                      l1ii10o2 = l1ii10o;
/* 1755 */                      i5 = 1048575;
                            case PoseLandmark.LEFT_THUMB:
/* 1281 */                      List list2 = (List) unsafe.getObject(l1ii10o2, j);
/* 1283 */                      o0iOli o0ioli3 = lOI01O1oI.I00000oIO;
/* 1285 */                      size = list2.size();
/* 1289 */                      if (size != 0) {
/* 1295 */                          iI000o00OoI0I = lOI01O1oI.I000o00OoI0I(list2);
/* 1299 */                          iI0010I0i5 = l1lo010IOi0.I0010I0i(i9 << 3);
/* 892 */                           iI0010I0i7 = (iI0010I0i5 * size) + iI000o00OoI0I;
/* 893 */                           iI00100l0 += iI0010I0i7;
/* 1751 */                          i7 += 3;
/* 1753 */                          l1ii10o2 = l1ii10o;
/* 1755 */                          i5 = 1048575;
                                }
/* 878 */                       iI0010I0i7 = 0;
/* 893 */                       iI00100l0 += iI0010I0i7;
/* 1751 */                      i7 += 3;
/* 1753 */                      l1ii10o2 = l1ii10o;
/* 1755 */                      i5 = 1048575;
                            case PoseLandmark.RIGHT_THUMB:
/* 1253 */                      List list3 = (List) unsafe.getObject(l1ii10o2, j);
/* 1255 */                      o0iOli o0ioli4 = lOI01O1oI.I00000oIO;
/* 1257 */                      size = list3.size();
/* 1261 */                      if (size != 0) {
/* 1267 */                          iI000o00OoI0I = lOI01O1oI.I000OOo1O(list3);
/* 1271 */                          iI0010I0i5 = l1lo010IOi0.I0010I0i(i9 << 3);
/* 892 */                           iI0010I0i7 = (iI0010I0i5 * size) + iI000o00OoI0I;
/* 893 */                           iI00100l0 += iI0010I0i7;
/* 1751 */                          i7 += 3;
/* 1753 */                          l1ii10o2 = l1ii10o;
/* 1755 */                          i5 = 1048575;
                                }
/* 878 */                       iI0010I0i7 = 0;
/* 893 */                       iI00100l0 += iI0010I0i7;
/* 1751 */                      i7 += 3;
/* 1753 */                      l1ii10o2 = l1ii10o;
/* 1755 */                      i5 = 1048575;
                            case PoseLandmark.LEFT_HIP:
/* 1243 */                      iI000O01llI0 = lOI01O1oI.I000O01llI0(i9, (List) unsafe.getObject(l1ii10o2, j));
/* 117 */                       iI00100l0 += iI000O01llI0;
/* 1751 */                      i7 += 3;
/* 1753 */                      l1ii10o2 = l1ii10o;
/* 1755 */                      i5 = 1048575;
                            case PoseLandmark.RIGHT_HIP:
/* 1231 */                      iI000O01llI0 = lOI01O1oI.I000II(i9, (List) unsafe.getObject(l1ii10o2, j));
/* 117 */                       iI00100l0 += iI000O01llI0;
/* 1751 */                      i7 += 3;
/* 1753 */                      l1ii10o2 = l1ii10o;
/* 1755 */                      i5 = 1048575;
                            case PoseLandmark.LEFT_KNEE:
/* 1201 */                      List list4 = (List) unsafe.getObject(l1ii10o2, j);
/* 1203 */                      o0iOli o0ioli5 = lOI01O1oI.I00000oIO;
/* 1205 */                      int size4 = list4.size();
/* 1209 */                      if (size4 != 0) {
/* 1221 */                          iI0010I0i6 = (l1lo010IOi0.I0010I0i(i9 << 3) + 1) * size4;
                                }
/* 1222 */                      iI00100l0 += iI0010I0i6;
/* 1751 */                      i7 += 3;
/* 1753 */                      l1ii10o2 = l1ii10o;
/* 1755 */                      i5 = 1048575;
                                break;
                            case PoseLandmark.RIGHT_KNEE:
/* 1104 */                      List list5 = (List) unsafe.getObject(l1ii10o2, j);
/* 1106 */                      o0iOli o0ioli6 = lOI01O1oI.I00000oIO;
/* 1108 */                      int size5 = list5.size();
/* 1112 */                      if (size5 == 0) {
/* 878 */                           iI0010I0i7 = 0;
                                } else {
/* 1122 */                          iI0010I0i7 = l1lo010IOi0.I0010I0i(i9 << 3) * size5;
/* 1125 */                          if (list5 instanceof lIl0I01lo) {
/* 1127 */                              lIl0I01lo lil0i01lo = (lIl0I01lo) list5;
/* 1131 */                              for (int i16 = 0; i16 < size5; i16++) {
/* 1133 */                                  Object objZza = lil0i01lo.zza();
/* 1139 */                                  if (objZza instanceof l1l1O1i) {
/* 1143 */                                      int iI0000oI003 = ((l1l1O1i) objZza).I0000oI00();
/* 1147 */                                      iI0010I0i7 = io1OllI.I00100l0(iI0000oI003, iI0000oI003, iI0010I0i7);
                                            } else {
/* 1158 */                                      iI0010I0i7 = l1lo010IOi0.I00100o1O0lo((String) objZza) + iI0010I0i7;
                                            }
                                        }
                                    } else {
/* 1165 */                              for (int i17 = 0; i17 < size5; i17++) {
/* 1167 */                                  Object obj = list5.get(i17);
/* 1173 */                                  if (obj instanceof l1l1O1i) {
/* 1177 */                                      int iI0000oI004 = ((l1l1O1i) obj).I0000oI00();
/* 1181 */                                      iI0010I0i7 = io1OllI.I00100l0(iI0000oI004, iI0000oI004, iI0010I0i7);
                                            } else {
/* 1192 */                                      iI0010I0i7 = l1lo010IOi0.I00100o1O0lo((String) obj) + iI0010I0i7;
                                            }
                                        }
                                    }
                                }
/* 893 */                       iI00100l0 += iI0010I0i7;
/* 1751 */                      i7 += 3;
/* 1753 */                      l1ii10o2 = l1ii10o;
/* 1755 */                      i5 = 1048575;
                            case 27:
/* 1050 */                      List list6 = (List) unsafe.getObject(l1ii10o2, j);
/* 1052 */                      lO1liolI0IO lo1lioli0ioI001iOo1i0O3 = lo0oi0.I001iOo1i0O(i7);
/* 1056 */                      o0iOli o0ioli7 = lOI01O1oI.I00000oIO;
/* 1058 */                      int size6 = list6.size();
/* 1062 */                      if (size6 == 0) {
/* 1064 */                          iI0010I0i8 = 0;
                                } else {
/* 1073 */                          iI0010I0i8 = l1lo010IOi0.I0010I0i(i9 << 3) * size6;
/* 1076 */                          for (int i18 = 0; i18 < size6; i18++) {
/* 1086 */                              int iI00000oIO6 = ((l1Ii10o) ((lIoolOoilO) list6.get(i18))).I00000oIO(lo1lioli0ioI001iOo1i0O3);
/* 1090 */                              iI0010I0i8 = io1OllI.I00100l0(iI00000oIO6, iI00000oIO6, iI0010I0i8);
                                    }
                                }
/* 1097 */                      iI00100l0 += iI0010I0i8;
/* 1751 */                      i7 += 3;
/* 1753 */                      l1ii10o2 = l1ii10o;
/* 1755 */                      i5 = 1048575;
                            case PoseLandmark.RIGHT_ANKLE:
/* 1002 */                      List list7 = (List) unsafe.getObject(l1ii10o2, j);
/* 1004 */                      o0iOli o0ioli8 = lOI01O1oI.I00000oIO;
/* 1006 */                      int size7 = list7.size();
/* 1010 */                      if (size7 != 0) {
/* 1020 */                          iI0010I0i7 = l1lo010IOi0.I0010I0i(i9 << 3) * size7;
/* 1027 */                          for (int i19 = 0; i19 < list7.size(); i19++) {
/* 1035 */                              int iI0000oI005 = ((l1l1O1i) list7.get(i19)).I0000oI00();
/* 1039 */                              iI0010I0i7 = io1OllI.I00100l0(iI0000oI005, iI0000oI005, iI0010I0i7);
                                    }
                                }
/* 893 */                       iI00100l0 += iI0010I0i7;
/* 1751 */                      i7 += 3;
/* 1753 */                      l1ii10o2 = l1ii10o;
/* 1755 */                      i5 = 1048575;
                                break;
                            case PoseLandmark.LEFT_HEEL:
/* 976 */                       List list8 = (List) unsafe.getObject(l1ii10o2, j);
/* 978 */                       o0iOli o0ioli9 = lOI01O1oI.I00000oIO;
/* 980 */                       size = list8.size();
/* 984 */                       if (size != 0) {
/* 989 */                           iI000o00OoI0I = lOI01O1oI.I000lI(list8);
/* 993 */                           iI0010I0i5 = l1lo010IOi0.I0010I0i(i9 << 3);
/* 892 */                           iI0010I0i7 = (iI0010I0i5 * size) + iI000o00OoI0I;
/* 893 */                           iI00100l0 += iI0010I0i7;
/* 1751 */                          i7 += 3;
/* 1753 */                          l1ii10o2 = l1ii10o;
/* 1755 */                          i5 = 1048575;
                                }
/* 878 */                       iI0010I0i7 = 0;
/* 893 */                       iI00100l0 += iI0010I0i7;
/* 1751 */                      i7 += 3;
/* 1753 */                      l1ii10o2 = l1ii10o;
/* 1755 */                      i5 = 1048575;
                            case 30:
/* 950 */                       List list9 = (List) unsafe.getObject(l1ii10o2, j);
/* 952 */                       o0iOli o0ioli10 = lOI01O1oI.I00000oIO;
/* 954 */                       size = list9.size();
/* 958 */                       if (size != 0) {
/* 963 */                           iI000o00OoI0I = lOI01O1oI.I0001Ioi1lo(list9);
/* 967 */                           iI0010I0i5 = l1lo010IOi0.I0010I0i(i9 << 3);
/* 892 */                           iI0010I0i7 = (iI0010I0i5 * size) + iI000o00OoI0I;
/* 893 */                           iI00100l0 += iI0010I0i7;
/* 1751 */                          i7 += 3;
/* 1753 */                          l1ii10o2 = l1ii10o;
/* 1755 */                          i5 = 1048575;
                                }
/* 878 */                       iI0010I0i7 = 0;
/* 893 */                       iI00100l0 += iI0010I0i7;
/* 1751 */                      i7 += 3;
/* 1753 */                      l1ii10o2 = l1ii10o;
/* 1755 */                      i5 = 1048575;
                            case PoseLandmark.LEFT_FOOT_INDEX:
/* 940 */                       iI000O01llI0 = lOI01O1oI.I000II(i9, (List) unsafe.getObject(l1ii10o2, j));
/* 117 */                       iI00100l0 += iI000O01llI0;
/* 1751 */                      i7 += 3;
/* 1753 */                      l1ii10o2 = l1ii10o;
/* 1755 */                      i5 = 1048575;
                            case 32:
/* 928 */                       iI000O01llI0 = lOI01O1oI.I000O01llI0(i9, (List) unsafe.getObject(l1ii10o2, j));
/* 117 */                       iI00100l0 += iI000O01llI0;
/* 1751 */                      i7 += 3;
/* 1753 */                      l1ii10o2 = l1ii10o;
/* 1755 */                      i5 = 1048575;
                            case 33:
/* 900 */                       List list10 = (List) unsafe.getObject(l1ii10o2, j);
/* 902 */                       o0iOli o0ioli11 = lOI01O1oI.I00000oIO;
/* 904 */                       size = list10.size();
/* 908 */                       if (size != 0) {
/* 913 */                           iI000o00OoI0I = lOI01O1oI.I000iOII(list10);
/* 917 */                           iI0010I0i5 = l1lo010IOi0.I0010I0i(i9 << 3);
/* 892 */                           iI0010I0i7 = (iI0010I0i5 * size) + iI000o00OoI0I;
/* 893 */                           iI00100l0 += iI0010I0i7;
/* 1751 */                          i7 += 3;
/* 1753 */                          l1ii10o2 = l1ii10o;
/* 1755 */                          i5 = 1048575;
                                }
/* 878 */                       iI0010I0i7 = 0;
/* 893 */                       iI00100l0 += iI0010I0i7;
/* 1751 */                      i7 += 3;
/* 1753 */                      l1ii10o2 = l1ii10o;
/* 1755 */                      i5 = 1048575;
                            case 34:
/* 868 */                       List list11 = (List) unsafe.getObject(l1ii10o2, j);
/* 870 */                       o0iOli o0ioli12 = lOI01O1oI.I00000oIO;
/* 872 */                       size = list11.size();
/* 876 */                       if (size != 0) {
/* 883 */                           iI000o00OoI0I = lOI01O1oI.I000l1(list11);
/* 887 */                           iI0010I0i5 = l1lo010IOi0.I0010I0i(i9 << 3);
/* 892 */                           iI0010I0i7 = (iI0010I0i5 * size) + iI000o00OoI0I;
/* 893 */                           iI00100l0 += iI0010I0i7;
/* 1751 */                          i7 += 3;
/* 1753 */                          l1ii10o2 = l1ii10o;
/* 1755 */                          i5 = 1048575;
                                }
/* 878 */                       iI0010I0i7 = 0;
/* 893 */                       iI00100l0 += iI0010I0i7;
/* 1751 */                      i7 += 3;
/* 1753 */                      l1ii10o2 = l1ii10o;
/* 1755 */                      i5 = 1048575;
                            case InputImage.IMAGE_FORMAT_YUV_420_888:
/* 845 */                       List list12 = (List) unsafe.getObject(l1ii10o2, j);
/* 847 */                       o0iOli o0ioli13 = lOI01O1oI.I00000oIO;
/* 853 */                       size2 = list12.size() * 8;
/* 854 */                       if (size2 > 0) {
/* 858 */                           iI0010I0i9 = l1lo010IOi0.I0010I0i(i9 << 3);
/* 579 */                           iI00100l0 = io1OllI.I0010o(size2, iI0010I0i9, size2, iI00100l0);
/* 1751 */                          i7 += 3;
/* 1753 */                          l1ii10o2 = l1ii10o;
/* 1755 */                          i5 = 1048575;
                                } else {
/* 1751 */                          i7 += 3;
/* 1753 */                          l1ii10o2 = l1ii10o;
/* 1755 */                          i5 = 1048575;
                                }
                            case 36:
/* 822 */                       List list13 = (List) unsafe.getObject(l1ii10o2, j);
/* 824 */                       o0iOli o0ioli14 = lOI01O1oI.I00000oIO;
/* 830 */                       size3 = list13.size() * 4;
/* 831 */                       if (size3 > 0) {
/* 835 */                           iI0010I0i10 = l1lo010IOi0.I0010I0i(i9 << 3);
/* 647 */                           iI00100l0 = io1OllI.I0010o(size3, iI0010I0i10, size3, iI00100l0);
/* 1751 */                          i7 += 3;
/* 1753 */                          l1ii10o2 = l1ii10o;
/* 1755 */                          i5 = 1048575;
                                } else {
/* 1751 */                          i7 += 3;
/* 1753 */                          l1ii10o2 = l1ii10o;
/* 1755 */                          i5 = 1048575;
                                }
                            case 37:
/* 804 */                       size2 = lOI01O1oI.I000OiO((List) unsafe.getObject(l1ii10o2, j));
/* 808 */                       if (size2 > 0) {
/* 812 */                           iI0010I0i9 = l1lo010IOi0.I0010I0i(i9 << 3);
/* 579 */                           iI00100l0 = io1OllI.I0010o(size2, iI0010I0i9, size2, iI00100l0);
/* 1751 */                          i7 += 3;
/* 1753 */                          l1ii10o2 = l1ii10o;
/* 1755 */                          i5 = 1048575;
                                } else {
/* 1751 */                          i7 += 3;
/* 1753 */                          l1ii10o2 = l1ii10o;
/* 1755 */                          i5 = 1048575;
                                }
                            case 38:
/* 784 */                       size2 = lOI01O1oI.I000o00OoI0I((List) unsafe.getObject(l1ii10o2, j));
/* 788 */                       if (size2 > 0) {
/* 792 */                           iI0010I0i9 = l1lo010IOi0.I0010I0i(i9 << 3);
/* 579 */                           iI00100l0 = io1OllI.I0010o(size2, iI0010I0i9, size2, iI00100l0);
/* 1751 */                          i7 += 3;
/* 1753 */                          l1ii10o2 = l1ii10o;
/* 1755 */                          i5 = 1048575;
                                } else {
/* 1751 */                          i7 += 3;
/* 1753 */                          l1ii10o2 = l1ii10o;
/* 1755 */                          i5 = 1048575;
                                }
                            case 39:
/* 764 */                       size2 = lOI01O1oI.I000OOo1O((List) unsafe.getObject(l1ii10o2, j));
/* 768 */                       if (size2 > 0) {
/* 772 */                           iI0010I0i9 = l1lo010IOi0.I0010I0i(i9 << 3);
/* 579 */                           iI00100l0 = io1OllI.I0010o(size2, iI0010I0i9, size2, iI00100l0);
/* 1751 */                          i7 += 3;
/* 1753 */                          l1ii10o2 = l1ii10o;
/* 1755 */                          i5 = 1048575;
                                } else {
/* 1751 */                          i7 += 3;
/* 1753 */                          l1ii10o2 = l1ii10o;
/* 1755 */                          i5 = 1048575;
                                }
                            case 40:
/* 739 */                       List list14 = (List) unsafe.getObject(l1ii10o2, j);
/* 741 */                       o0iOli o0ioli15 = lOI01O1oI.I00000oIO;
/* 747 */                       size2 = list14.size() * 8;
/* 748 */                       if (size2 > 0) {
/* 752 */                           iI0010I0i9 = l1lo010IOi0.I0010I0i(i9 << 3);
/* 579 */                           iI00100l0 = io1OllI.I0010o(size2, iI0010I0i9, size2, iI00100l0);
/* 1751 */                          i7 += 3;
/* 1753 */                          l1ii10o2 = l1ii10o;
/* 1755 */                          i5 = 1048575;
                                } else {
/* 1751 */                          i7 += 3;
/* 1753 */                          l1ii10o2 = l1ii10o;
/* 1755 */                          i5 = 1048575;
                                }
                            case 41:
/* 717 */                       List list15 = (List) unsafe.getObject(l1ii10o2, j);
/* 719 */                       o0iOli o0ioli16 = lOI01O1oI.I00000oIO;
/* 725 */                       size3 = list15.size() * 4;
/* 726 */                       if (size3 > 0) {
/* 730 */                           iI0010I0i10 = l1lo010IOi0.I0010I0i(i9 << 3);
/* 647 */                           iI00100l0 = io1OllI.I0010o(size3, iI0010I0i10, size3, iI00100l0);
/* 1751 */                          i7 += 3;
/* 1753 */                          l1ii10o2 = l1ii10o;
/* 1755 */                          i5 = 1048575;
                                } else {
/* 1751 */                          i7 += 3;
/* 1753 */                          l1ii10o2 = l1ii10o;
/* 1755 */                          i5 = 1048575;
                                }
                            case 42:
/* 695 */                       List list16 = (List) unsafe.getObject(l1ii10o2, j);
/* 697 */                       o0iOli o0ioli17 = lOI01O1oI.I00000oIO;
/* 699 */                       size2 = list16.size();
/* 703 */                       if (size2 > 0) {
/* 707 */                           iI0010I0i9 = l1lo010IOi0.I0010I0i(i9 << 3);
/* 579 */                           iI00100l0 = io1OllI.I0010o(size2, iI0010I0i9, size2, iI00100l0);
/* 1751 */                          i7 += 3;
/* 1753 */                          l1ii10o2 = l1ii10o;
/* 1755 */                          i5 = 1048575;
                                } else {
/* 1751 */                          i7 += 3;
/* 1753 */                          l1ii10o2 = l1ii10o;
/* 1755 */                          i5 = 1048575;
                                }
                            case 43:
/* 678 */                       size2 = lOI01O1oI.I000lI((List) unsafe.getObject(l1ii10o2, j));
/* 682 */                       if (size2 > 0) {
/* 686 */                           iI0010I0i9 = l1lo010IOi0.I0010I0i(i9 << 3);
/* 579 */                           iI00100l0 = io1OllI.I0010o(size2, iI0010I0i9, size2, iI00100l0);
/* 1751 */                          i7 += 3;
/* 1753 */                          l1ii10o2 = l1ii10o;
/* 1755 */                          i5 = 1048575;
                                } else {
/* 1751 */                          i7 += 3;
/* 1753 */                          l1ii10o2 = l1ii10o;
/* 1755 */                          i5 = 1048575;
                                }
                            case 44:
/* 659 */                       size2 = lOI01O1oI.I0001Ioi1lo((List) unsafe.getObject(l1ii10o2, j));
/* 663 */                       if (size2 > 0) {
/* 667 */                           iI0010I0i9 = l1lo010IOi0.I0010I0i(i9 << 3);
/* 579 */                           iI00100l0 = io1OllI.I0010o(size2, iI0010I0i9, size2, iI00100l0);
/* 1751 */                          i7 += 3;
/* 1753 */                          l1ii10o2 = l1ii10o;
/* 1755 */                          i5 = 1048575;
                                } else {
/* 1751 */                          i7 += 3;
/* 1753 */                          l1ii10o2 = l1ii10o;
/* 1755 */                          i5 = 1048575;
                                }
                            case BuildConfig.VERSION_CODE:
/* 630 */                       List list17 = (List) unsafe.getObject(l1ii10o2, j);
/* 632 */                       o0iOli o0ioli18 = lOI01O1oI.I00000oIO;
/* 638 */                       size3 = list17.size() * 4;
/* 639 */                       if (size3 > 0) {
/* 643 */                           iI0010I0i10 = l1lo010IOi0.I0010I0i(i9 << 3);
/* 647 */                           iI00100l0 = io1OllI.I0010o(size3, iI0010I0i10, size3, iI00100l0);
/* 1751 */                          i7 += 3;
/* 1753 */                          l1ii10o2 = l1ii10o;
/* 1755 */                          i5 = 1048575;
                                } else {
/* 1751 */                          i7 += 3;
/* 1753 */                          l1ii10o2 = l1ii10o;
/* 1755 */                          i5 = 1048575;
                                }
                            case 46:
/* 608 */                       List list18 = (List) unsafe.getObject(l1ii10o2, j);
/* 610 */                       o0iOli o0ioli19 = lOI01O1oI.I00000oIO;
/* 616 */                       size2 = list18.size() * 8;
/* 617 */                       if (size2 > 0) {
/* 621 */                           iI0010I0i9 = l1lo010IOi0.I0010I0i(i9 << 3);
/* 579 */                           iI00100l0 = io1OllI.I0010o(size2, iI0010I0i9, size2, iI00100l0);
/* 1751 */                          i7 += 3;
/* 1753 */                          l1ii10o2 = l1ii10o;
/* 1755 */                          i5 = 1048575;
                                } else {
/* 1751 */                          i7 += 3;
/* 1753 */                          l1ii10o2 = l1ii10o;
/* 1755 */                          i5 = 1048575;
                                }
                            case 47:
/* 591 */                       size2 = lOI01O1oI.I000iOII((List) unsafe.getObject(l1ii10o2, j));
/* 595 */                       if (size2 > 0) {
/* 599 */                           iI0010I0i9 = l1lo010IOi0.I0010I0i(i9 << 3);
/* 579 */                           iI00100l0 = io1OllI.I0010o(size2, iI0010I0i9, size2, iI00100l0);
/* 1751 */                          i7 += 3;
/* 1753 */                          l1ii10o2 = l1ii10o;
/* 1755 */                          i5 = 1048575;
                                } else {
/* 1751 */                          i7 += 3;
/* 1753 */                          l1ii10o2 = l1ii10o;
/* 1755 */                          i5 = 1048575;
                                }
                            case 48:
/* 567 */                       size2 = lOI01O1oI.I000l1((List) unsafe.getObject(l1ii10o2, j));
/* 571 */                       if (size2 > 0) {
/* 575 */                           iI0010I0i9 = l1lo010IOi0.I0010I0i(i9 << 3);
/* 579 */                           iI00100l0 = io1OllI.I0010o(size2, iI0010I0i9, size2, iI00100l0);
/* 1751 */                          i7 += 3;
/* 1753 */                          l1ii10o2 = l1ii10o;
/* 1755 */                          i5 = 1048575;
                                } else {
/* 1751 */                          i7 += 3;
/* 1753 */                          l1ii10o2 = l1ii10o;
/* 1755 */                          i5 = 1048575;
                                }
                            case 49:
/* 512 */                       List list19 = (List) unsafe.getObject(l1ii10o2, j);
/* 514 */                       lO1liolI0IO lo1lioli0ioI001iOo1i0O4 = lo0oi0.I001iOo1i0O(i7);
/* 518 */                       o0iOli o0ioli20 = lOI01O1oI.I00000oIO;
/* 520 */                       int size8 = list19.size();
/* 524 */                       if (size8 == 0) {
/* 526 */                           iI00000oIO4 = 0;
                                } else {
/* 531 */                           iI00000oIO4 = 0;
/* 532 */                           for (int i20 = 0; i20 < size8; i20++) {
/* 538 */                               lIoolOoilO lioolooilo2 = (lIoolOoilO) list19.get(i20);
/* 542 */                               int iI0010I0i15 = l1lo010IOi0.I0010I0i(i9 << 3);
/* 554 */                               iI00000oIO4 += ((l1Ii10o) lioolooilo2).I00000oIO(lo1lioli0ioI001iOo1i0O4) + iI0010I0i15 + iI0010I0i15;
                                    }
                                }
/* 558 */                       iI00100l0 += iI00000oIO4;
/* 1751 */                      i7 += 3;
/* 1753 */                      l1ii10o2 = l1ii10o;
/* 1755 */                      i5 = 1048575;
                            case 50:
/* 454 */                       Object object3 = unsafe.getObject(l1ii10o2, j);
/* 458 */                       int i21 = i7 / 3;
/* 465 */                       lIo10Iolio lio10iolio = (lIo10Iolio) object3;
/* 467 */                       if (lo0oi0.I00000oOI[i21 + i21] != null) {
/* 504 */                           OIiilo1Ool0o.I00000oIO();
/* 38 */                            return 0;
                                }
/* 473 */                       if (lio10iolio.isEmpty()) {
                                    continue;
                                } else {
/* 479 */                           Iterator it = lio10iolio.entrySet().iterator();
/* 487 */                           if (it.hasNext()) {
/* 495 */                               Map.Entry entry = (Map.Entry) it.next();
/* 497 */                               entry.getKey();
/* 500 */                               entry.getValue();
/* 503 */                               throw null;
                                    }
                                }
/* 1751 */                      i7 += 3;
/* 1753 */                      l1ii10o2 = l1ii10o;
/* 1755 */                      i5 = 1048575;
                            case 51:
/* 450 */                       if (lo0oi0.I00100l0(l1ii10o2, i9, i7)) {
/* 184 */                           iI00100l0 = io1OllI.I00100l0(i9 << 3, 8, iI00100l0);
                                }
/* 1751 */                      i7 += 3;
/* 1753 */                      l1ii10o2 = l1ii10o;
/* 1755 */                      i5 = 1048575;
                            case 52:
/* 442 */                       if (!lo0oi0.I00100l0(l1ii10o2, i9, i7)) {
/* 1751 */                          i7 += 3;
/* 1753 */                          l1ii10o2 = l1ii10o;
/* 1755 */                          i5 = 1048575;
                                }
/* 196 */                       iI0010o = i9 << 3;
/* 170 */                       iI00100l0 = io1OllI.I00100l0(iI0010o, iI0010I0i13, iI00100l0);
/* 1751 */                      i7 += 3;
/* 1753 */                      l1ii10o2 = l1ii10o;
/* 1755 */                      i5 = 1048575;
                            case 53:
/* 420 */                       if (lo0oi0.I00100l0(l1ii10o2, i9, i7)) {
/* 424 */                           long jI001i1O0Ol = I001i1O0Ol(j, l1ii10o2);
/* 428 */                           iI0010I0i11 = l1lo010IOi0.I0010I0i(i9 << 3);
/* 432 */                           iI00000oIO5 = l1lo010IOi0.I00000oIO(jI001i1O0Ol);
/* 146 */                           iI00100l0 += iI00000oIO5 + iI0010I0i11;
/* 1751 */                          i7 += 3;
/* 1753 */                          l1ii10o2 = l1ii10o;
/* 1755 */                          i5 = 1048575;
                                } else {
/* 1751 */                          i7 += 3;
/* 1753 */                          l1ii10o2 = l1ii10o;
/* 1755 */                          i5 = 1048575;
                                }
                            case 54:
/* 398 */                       if (lo0oi0.I00100l0(l1ii10o2, i9, i7)) {
/* 402 */                           long jI001i1O0Ol2 = I001i1O0Ol(j, l1ii10o2);
/* 406 */                           iI0010I0i11 = l1lo010IOi0.I0010I0i(i9 << 3);
/* 410 */                           iI00000oIO5 = l1lo010IOi0.I00000oIO(jI001i1O0Ol2);
/* 146 */                           iI00100l0 += iI00000oIO5 + iI0010I0i11;
/* 1751 */                          i7 += 3;
/* 1753 */                          l1ii10o2 = l1ii10o;
/* 1755 */                          i5 = 1048575;
                                } else {
/* 1751 */                          i7 += 3;
/* 1753 */                          l1ii10o2 = l1ii10o;
/* 1755 */                          i5 = 1048575;
                                }
                            case 55:
/* 375 */                       if (lo0oi0.I00100l0(l1ii10o2, i9, i7)) {
/* 379 */                           long jI0010o = I0010o(j, l1ii10o2);
/* 384 */                           iI0010I0i11 = l1lo010IOi0.I0010I0i(i9 << 3);
/* 388 */                           iI00000oIO5 = l1lo010IOi0.I00000oIO(jI0010o);
/* 146 */                           iI00100l0 += iI00000oIO5 + iI0010I0i11;
/* 1751 */                          i7 += 3;
/* 1753 */                          l1ii10o2 = l1ii10o;
/* 1755 */                          i5 = 1048575;
                                } else {
/* 1751 */                          i7 += 3;
/* 1753 */                          l1ii10o2 = l1ii10o;
/* 1755 */                          i5 = 1048575;
                                }
                            case 56:
/* 367 */                       if (lo0oi0.I00100l0(l1ii10o2, i9, i7)) {
                                }
/* 1751 */                      i7 += 3;
/* 1753 */                      l1ii10o2 = l1ii10o;
/* 1755 */                      i5 = 1048575;
                                break;
                            case 57:
/* 359 */                       if (!lo0oi0.I00100l0(l1ii10o2, i9, i7)) {
/* 1751 */                          i7 += 3;
/* 1753 */                          l1ii10o2 = l1ii10o;
/* 1755 */                          i5 = 1048575;
                                }
/* 196 */                       iI0010o = i9 << 3;
/* 170 */                       iI00100l0 = io1OllI.I00100l0(iI0010o, iI0010I0i13, iI00100l0);
/* 1751 */                      i7 += 3;
/* 1753 */                      l1ii10o2 = l1ii10o;
/* 1755 */                      i5 = 1048575;
                            case 58:
/* 345 */                       if (lo0oi0.I00100l0(l1ii10o2, i9, i7)) {
/* 349 */                           iI00100l0 = io1OllI.I00100l0(i9 << 3, 1, iI00100l0);
                                }
/* 1751 */                      i7 += 3;
/* 1753 */                      l1ii10o2 = l1ii10o;
/* 1755 */                      i5 = 1048575;
                            case 59:
/* 306 */                       if (lo0oi0.I00100l0(l1ii10o2, i9, i7)) {
/* 308 */                           int i22 = i9 << 3;
/* 310 */                           Object object4 = unsafe.getObject(l1ii10o2, j);
/* 316 */                           if (object4 instanceof l1l1O1i) {
/* 320 */                               iI0010I0i12 = l1lo010IOi0.I0010I0i(i22);
/* 324 */                               iI0000oI002 = ((l1l1O1i) object4).I0000oI00();
/* 260 */                               iI00100l0 = io1OllI.I0010o(iI0000oI002, iI0000oI002, iI0010I0i12, iI00100l0);
/* 1751 */                              i7 += 3;
/* 1753 */                              l1ii10o2 = l1ii10o;
/* 1755 */                              i5 = 1048575;
                                    } else {
/* 331 */                               iI0010I0i11 = l1lo010IOi0.I0010I0i(i22);
/* 335 */                               iI00000oIO5 = l1lo010IOi0.I00100o1O0lo((String) object4);
/* 146 */                               iI00100l0 += iI00000oIO5 + iI0010I0i11;
/* 1751 */                              i7 += 3;
/* 1753 */                              l1ii10o2 = l1ii10o;
/* 1755 */                              i5 = 1048575;
                                    }
                                } else {
/* 1751 */                          i7 += 3;
/* 1753 */                          l1ii10o2 = l1ii10o;
/* 1755 */                          i5 = 1048575;
                                }
                            case 60:
/* 270 */                       if (lo0oi0.I00100l0(l1ii10o2, i9, i7)) {
/* 272 */                           Object object5 = unsafe.getObject(l1ii10o2, j);
/* 276 */                           lO1liolI0IO lo1lioli0ioI001iOo1i0O5 = lo0oi0.I001iOo1i0O(i7);
/* 280 */                           o0iOli o0ioli21 = lOI01O1oI.I00000oIO;
/* 286 */                           iI0010I0i3 = l1lo010IOi0.I0010I0i(i9 << 3);
/* 292 */                           iI00000oIO2 = ((l1Ii10o) ((lIoolOoilO) object5)).I00000oIO(lo1lioli0ioI001iOo1i0O5);
/* 296 */                           iI00100l0 = io1OllI.I0010o(iI00000oIO2, iI00000oIO2, iI0010I0i3, iI00100l0);
/* 1751 */                          i7 += 3;
/* 1753 */                          l1ii10o2 = l1ii10o;
/* 1755 */                          i5 = 1048575;
                                } else {
/* 1751 */                          i7 += 3;
/* 1753 */                          l1ii10o2 = l1ii10o;
/* 1755 */                          i5 = 1048575;
                                }
                            case 61:
/* 242 */                       if (lo0oi0.I00100l0(l1ii10o2, i9, i7)) {
/* 250 */                           l1l1O1i l1l1o1i2 = (l1l1O1i) unsafe.getObject(l1ii10o2, j);
/* 252 */                           iI0010I0i12 = l1lo010IOi0.I0010I0i(i9 << 3);
/* 256 */                           iI0000oI002 = l1l1o1i2.I0000oI00();
/* 260 */                           iI00100l0 = io1OllI.I0010o(iI0000oI002, iI0000oI002, iI0010I0i12, iI00100l0);
/* 1751 */                          i7 += 3;
/* 1753 */                          l1ii10o2 = l1ii10o;
/* 1755 */                          i5 = 1048575;
                                } else {
/* 1751 */                          i7 += 3;
/* 1753 */                          l1ii10o2 = l1ii10o;
/* 1755 */                          i5 = 1048575;
                                }
                            case 62:
/* 225 */                       if (lo0oi0.I00100l0(l1ii10o2, i9, i7)) {
/* 229 */                           iI0010o = I0010o(j, l1ii10o2);
/* 233 */                           iI0010I0i13 = l1lo010IOi0.I0010I0i(i9 << 3);
/* 170 */                           iI00100l0 = io1OllI.I00100l0(iI0010o, iI0010I0i13, iI00100l0);
/* 1751 */                          i7 += 3;
/* 1753 */                          l1ii10o2 = l1ii10o;
/* 1755 */                          i5 = 1048575;
                                } else {
/* 1751 */                          i7 += 3;
/* 1753 */                          l1ii10o2 = l1ii10o;
/* 1755 */                          i5 = 1048575;
                                }
                            case 63:
/* 203 */                       if (lo0oi0.I00100l0(l1ii10o2, i9, i7)) {
/* 207 */                           long jI0010o2 = I0010o(j, l1ii10o2);
/* 212 */                           iI0010I0i11 = l1lo010IOi0.I0010I0i(i9 << 3);
/* 216 */                           iI00000oIO5 = l1lo010IOi0.I00000oIO(jI0010o2);
/* 146 */                           iI00100l0 += iI00000oIO5 + iI0010I0i11;
/* 1751 */                          i7 += 3;
/* 1753 */                          l1ii10o2 = l1ii10o;
/* 1755 */                          i5 = 1048575;
                                } else {
/* 1751 */                          i7 += 3;
/* 1753 */                          l1ii10o2 = l1ii10o;
/* 1755 */                          i5 = 1048575;
                                }
                            case Barcode.FORMAT_EAN_8:
/* 194 */                       if (!lo0oi0.I00100l0(l1ii10o2, i9, i7)) {
/* 1751 */                          i7 += 3;
/* 1753 */                          l1ii10o2 = l1ii10o;
/* 1755 */                          i5 = 1048575;
                                }
/* 196 */                       iI0010o = i9 << 3;
/* 170 */                       iI00100l0 = io1OllI.I00100l0(iI0010o, iI0010I0i13, iI00100l0);
/* 1751 */                      i7 += 3;
/* 1753 */                      l1ii10o2 = l1ii10o;
/* 1755 */                      i5 = 1048575;
                            case 65:
/* 180 */                       if (lo0oi0.I00100l0(l1ii10o2, i9, i7)) {
                                }
/* 1751 */                      i7 += 3;
/* 1753 */                      l1ii10o2 = l1ii10o;
/* 1755 */                      i5 = 1048575;
                                break;
                            case 66:
/* 153 */                       if (lo0oi0.I00100l0(l1ii10o2, i9, i7)) {
/* 157 */                           int iI0010o2 = I0010o(j, l1ii10o2);
/* 165 */                           iI0010I0i13 = l1lo010IOi0.I0010I0i(i9 << 3);
/* 169 */                           iI0010o = (iI0010o2 >> 31) ^ (iI0010o2 + iI0010o2);
/* 170 */                           iI00100l0 = io1OllI.I00100l0(iI0010o, iI0010I0i13, iI00100l0);
/* 1751 */                          i7 += 3;
/* 1753 */                          l1ii10o2 = l1ii10o;
/* 1755 */                          i5 = 1048575;
                                } else {
/* 1751 */                          i7 += 3;
/* 1753 */                          l1ii10o2 = l1ii10o;
/* 1755 */                          i5 = 1048575;
                                }
                            case 67:
/* 124 */                       if (lo0oi0.I00100l0(l1ii10o2, i9, i7)) {
/* 128 */                           long jI001i1O0Ol3 = I001i1O0Ol(j, l1ii10o2);
/* 136 */                           iI0010I0i11 = l1lo010IOi0.I0010I0i(i9 << 3);
/* 141 */                           iI00000oIO5 = l1lo010IOi0.I00000oIO((jI001i1O0Ol3 >> 63) ^ (jI001i1O0Ol3 + jI001i1O0Ol3));
/* 146 */                           iI00100l0 += iI00000oIO5 + iI0010I0i11;
/* 1751 */                          i7 += 3;
/* 1753 */                          l1ii10o2 = l1ii10o;
/* 1755 */                          i5 = 1048575;
                                } else {
/* 1751 */                          i7 += 3;
/* 1753 */                          l1ii10o2 = l1ii10o;
/* 1755 */                          i5 = 1048575;
                                }
                            case 68:
/* 91 */                        if (lo0oi0.I00100l0(l1ii10o2, i9, i7)) {
/* 97 */                            lIoolOoilO lioolooilo3 = (lIoolOoilO) unsafe.getObject(l1ii10o2, j);
/* 99 */                            lO1liolI0IO lo1lioli0ioI001iOo1i0O6 = lo0oi0.I001iOo1i0O(i7);
/* 105 */                           int iI0010I0i16 = l1lo010IOi0.I0010I0i(i9 << 3);
/* 109 */                           i4 = iI0010I0i16 + iI0010I0i16;
/* 112 */                           iI00000oIO3 = ((l1Ii10o) lioolooilo3).I00000oIO(lo1lioli0ioI001iOo1i0O6);
/* 116 */                           iI000O01llI0 = iI00000oIO3 + i4;
/* 117 */                           iI00100l0 += iI000O01llI0;
/* 1751 */                          i7 += 3;
/* 1753 */                          l1ii10o2 = l1ii10o;
/* 1755 */                          i5 = 1048575;
                                } else {
/* 1751 */                          i7 += 3;
/* 1753 */                          l1ii10o2 = l1ii10o;
/* 1755 */                          i5 = 1048575;
                                }
                            default:
/* 1751 */                      i7 += 3;
/* 1753 */                      l1ii10o2 = l1ii10o;
/* 1755 */                      i5 = 1048575;
                        }
                    }
/* 1774 */          int iI00000oIO7 = ((lIIOO0oi1o) l1ii10o).zzc.I00000oIO() + iI00100l0;
/* 1777 */          if (!lo0oi0.I0001Ioi1lo) {
/* 1840 */              return iI00000oIO7;
                    }
/* 1785 */          lOI1I000IoiI loi1i000ioii = ((lI1oIOl10iIo) l1ii10o).zzb.I00000oIO;
/* 1789 */          if (loi1i000ioii.I00iiI > 0) {
/* 1834 */              loi1i000ioii.I0000Il00O(0).I00iOIl.getClass();
/* 1837 */              OIiilo1Ool0o.I00000oIO();
/* 1762 */              return 0;
                    }
/* 1795 */          Iterator it2 = loi1i000ioii.I00000oIO().iterator();
/* 1803 */          if (!it2.hasNext()) {
/* 1840 */              return iI00000oIO7;
                    }
/* 1810 */          Map.Entry entry2 = (Map.Entry) it2.next();
/* 1816 */          if (entry2.getKey() != null) {
/* 1818 */              OIiilo1Ool0o.I00000oIO();
/* 1762 */              return 0;
                    }
/* 1822 */          entry2.getValue();
/* 1825 */          throw null;
                }

                @Override
                public final void I0000oI00(Object obj, i11I1Ili i11i1ili) throws IOO1IOl1O10 {
                    int i;
                    int i2;
/* 1 */             lO0Oi0 lo0oi0 = this;
/* 7 */             int[] iArr = lo0oi0.I00000oIO;
/* 11 */            Map.Entry entry = null;
/* 12 */            if (lo0oi0.I0001Ioi1lo) {
/* 17 */                lI0ioliI0l li0iolii0l = ((lI1oIOl10iIo) obj).zzb;
/* 25 */                if (!li0iolii0l.I00000oIO.isEmpty()) {
/* 36 */                    entry = (Map.Entry) li0iolii0l.I00000oOI().next();
                        }
                    }
/* 38 */            Map.Entry entry2 = entry;
/* 39 */            int i3 = 1048575;
/* 42 */            int i4 = 1048575;
/* 43 */            int i5 = 0;
/* 44 */            int i6 = 0;
/* 46 */            while (i5 < iArr.length) {
/* 48 */                int iI001IO000 = lo0oi0.I001IO000(i5);
/* 52 */                int iI001IIilI0O = I001IIilI0O(iI001IO000);
/* 56 */                int i7 = iArr[i5];
/* 61 */                Unsafe unsafe = I000lI;
/* 63 */                if (iI001IIilI0O <= 17) {
/* 67 */                    int i8 = iArr[i5 + 2];
/* 69 */                    int i9 = i8 & i3;
/* 71 */                    if (i9 != i4) {
/* 78 */                        i6 = i9 == i3 ? 0 : unsafe.getInt(obj, i9);
/* 83 */                        i4 = i9;
                            }
/* 90 */                    i = iI001IO000;
/* 86 */                    i2 = 1 << (i8 >>> 20);
                        } else {
/* 94 */                    i = iI001IO000;
/* 95 */                    i2 = 0;
                        }
/* 96 */                if (entry2 != null) {
/* 1515 */                  entry2.getKey().getClass();
/* 1518 */                  OIiilo1Ool0o.I00000oIO();
/* 1521 */                  return;
                        }
/* 98 */                long j = i & i3;
                        switch (iI001IIilI0O) {
                            case 0:
/* 1483 */                      if (lo0oi0.I000o00OoI0I(obj, i5, i4, i6, i2)) {
/* 1499 */                          ((l1lo010IOi0) i11i1ili.I00iiI).I000II(i7, Double.doubleToRawLongBits(lOiiillo.I0000Il00O.I0010I0i(obj, j)));
                                    continue;
                                }
/* 1502 */                      i5 += 3;
/* 1504 */                      i3 = 1048575;
/* 1507 */                      lo0oi0 = this;
                            case 1:
/* 1458 */                      if (lo0oi0.I000o00OoI0I(obj, i5, i4, i6, i2)) {
/* 1474 */                          ((l1lo010IOi0) i11i1ili.I00iiI).I0000oI00(i7, Float.floatToRawIntBits(lOiiillo.I0000Il00O.I001IIilI0O(obj, j)));
                                } else {
                                    continue;
                                }
/* 1502 */                      i5 += 3;
/* 1504 */                      i3 = 1048575;
/* 1507 */                      lo0oi0 = this;
                            case 2:
/* 1439 */                      if (lo0oi0.I000o00OoI0I(obj, i5, i4, i6, i2)) {
/* 1449 */                          ((l1lo010IOi0) i11i1ili.I00iiI).I000oI1ioi(i7, unsafe.getLong(obj, j));
                                } else {
                                    continue;
                                }
/* 1502 */                      i5 += 3;
/* 1504 */                      i3 = 1048575;
/* 1507 */                      lo0oi0 = this;
                            case 3:
/* 1420 */                      if (lo0oi0.I000o00OoI0I(obj, i5, i4, i6, i2)) {
/* 1430 */                          ((l1lo010IOi0) i11i1ili.I00iiI).I000oI1ioi(i7, unsafe.getLong(obj, j));
                                } else {
                                    continue;
                                }
/* 1502 */                      i5 += 3;
/* 1504 */                      i3 = 1048575;
/* 1507 */                      lo0oi0 = this;
                            case 4:
/* 1401 */                      if (lo0oi0.I000o00OoI0I(obj, i5, i4, i6, i2)) {
/* 1411 */                          ((l1lo010IOi0) i11i1ili.I00iiI).I000OOo1O(i7, unsafe.getInt(obj, j));
                                } else {
                                    continue;
                                }
/* 1502 */                      i5 += 3;
/* 1504 */                      i3 = 1048575;
/* 1507 */                      lo0oi0 = this;
                            case 5:
/* 1382 */                      if (lo0oi0.I000o00OoI0I(obj, i5, i4, i6, i2)) {
/* 1392 */                          ((l1lo010IOi0) i11i1ili.I00iiI).I000II(i7, unsafe.getLong(obj, j));
                                } else {
                                    continue;
                                }
/* 1502 */                      i5 += 3;
/* 1504 */                      i3 = 1048575;
/* 1507 */                      lo0oi0 = this;
                            case 6:
/* 1362 */                      if (lo0oi0.I000o00OoI0I(obj, i5, i4, i6, i2)) {
/* 1372 */                          ((l1lo010IOi0) i11i1ili.I00iiI).I0000oI00(i7, unsafe.getInt(obj, j));
                                } else {
                                    continue;
                                }
/* 1502 */                      i5 += 3;
/* 1504 */                      i3 = 1048575;
/* 1507 */                      lo0oi0 = this;
                            case 7:
/* 1335 */                      if (lo0oi0.I000o00OoI0I(obj, i5, i4, i6, i2)) {
/* 1339 */                          boolean zI00Io1o110i = lOiiillo.I0000Il00O.I00Io1o110i(obj, j);
/* 1345 */                          l1lo010IOi0 l1lo010ioi0 = (l1lo010IOi0) i11i1ili.I00iiI;
/* 1349 */                          l1lo010ioi0.I000o00OoI0I(i7 << 3);
/* 1352 */                          l1lo010ioi0.I00000oOI(zI00Io1o110i ? (byte) 1 : (byte) 0);
                                } else {
                                    continue;
                                }
/* 1502 */                      i5 += 3;
/* 1504 */                      i3 = 1048575;
/* 1507 */                      lo0oi0 = this;
                            case 8:
/* 1298 */                      if (lo0oi0.I000o00OoI0I(obj, i5, i4, i6, i2)) {
/* 1300 */                          Object object = unsafe.getObject(obj, j);
/* 1306 */                          if (object instanceof String) {
/* 1314 */                              ((l1lo010IOi0) i11i1ili.I00iiI).I000iOII(i7, (String) object);
                                    } else {
/* 1325 */                              ((l1lo010IOi0) i11i1ili.I00iiI).I0000O(i7, (l1l1O1i) object);
                                    }
                                } else {
                                    continue;
                                }
/* 1502 */                      i5 += 3;
/* 1504 */                      i3 = 1048575;
/* 1507 */                      lo0oi0 = this;
                            case 9:
/* 1278 */                      if (lo0oi0.I000o00OoI0I(obj, i5, i4, i6, i2)) {
/* 1288 */                          i11i1ili.I000OOo1O(i7, unsafe.getObject(obj, j), lo0oi0.I001iOo1i0O(i5));
                                } else {
                                    continue;
                                }
/* 1502 */                      i5 += 3;
/* 1504 */                      i3 = 1048575;
/* 1507 */                      lo0oi0 = this;
                            case 10:
/* 1256 */                      if (lo0oi0.I000o00OoI0I(obj, i5, i4, i6, i2)) {
/* 1268 */                          ((l1lo010IOi0) i11i1ili.I00iiI).I0000O(i7, (l1l1O1i) unsafe.getObject(obj, j));
                                } else {
                                    continue;
                                }
/* 1502 */                      i5 += 3;
/* 1504 */                      i3 = 1048575;
/* 1507 */                      lo0oi0 = this;
                            case 11:
/* 1236 */                      if (lo0oi0.I000o00OoI0I(obj, i5, i4, i6, i2)) {
/* 1246 */                          ((l1lo010IOi0) i11i1ili.I00iiI).I000lI(i7, unsafe.getInt(obj, j));
                                } else {
                                    continue;
                                }
/* 1502 */                      i5 += 3;
/* 1504 */                      i3 = 1048575;
/* 1507 */                      lo0oi0 = this;
                            case 12:
/* 1216 */                      if (lo0oi0.I000o00OoI0I(obj, i5, i4, i6, i2)) {
/* 1226 */                          ((l1lo010IOi0) i11i1ili.I00iiI).I000OOo1O(i7, unsafe.getInt(obj, j));
                                } else {
                                    continue;
                                }
/* 1502 */                      i5 += 3;
/* 1504 */                      i3 = 1048575;
/* 1507 */                      lo0oi0 = this;
                            case 13:
/* 1196 */                      if (lo0oi0.I000o00OoI0I(obj, i5, i4, i6, i2)) {
/* 1206 */                          ((l1lo010IOi0) i11i1ili.I00iiI).I0000oI00(i7, unsafe.getInt(obj, j));
                                } else {
                                    continue;
                                }
/* 1502 */                      i5 += 3;
/* 1504 */                      i3 = 1048575;
/* 1507 */                      lo0oi0 = this;
                            case 14:
/* 1176 */                      if (lo0oi0.I000o00OoI0I(obj, i5, i4, i6, i2)) {
/* 1186 */                          ((l1lo010IOi0) i11i1ili.I00iiI).I000II(i7, unsafe.getLong(obj, j));
                                } else {
                                    continue;
                                }
/* 1502 */                      i5 += 3;
/* 1504 */                      i3 = 1048575;
/* 1507 */                      lo0oi0 = this;
                            case 15:
/* 1151 */                      if (lo0oi0.I000o00OoI0I(obj, i5, i4, i6, i2)) {
/* 1153 */                          int i10 = unsafe.getInt(obj, j);
/* 1166 */                          ((l1lo010IOi0) i11i1ili.I00iiI).I000lI(i7, (i10 >> 31) ^ (i10 + i10));
                                } else {
                                    continue;
                                }
/* 1502 */                      i5 += 3;
/* 1504 */                      i3 = 1048575;
/* 1507 */                      lo0oi0 = this;
                            case 16:
/* 1126 */                      if (lo0oi0.I000o00OoI0I(obj, i5, i4, i6, i2)) {
/* 1128 */                          long j2 = unsafe.getLong(obj, j);
/* 1141 */                          ((l1lo010IOi0) i11i1ili.I00iiI).I000oI1ioi(i7, (j2 >> 63) ^ (j2 + j2));
                                } else {
                                    continue;
                                }
/* 1502 */                      i5 += 3;
/* 1504 */                      i3 = 1048575;
/* 1507 */                      lo0oi0 = this;
                            case 17:
/* 1106 */                      if (lo0oi0.I000o00OoI0I(obj, i5, i4, i6, i2)) {
/* 1116 */                          i11i1ili.I000II(i7, unsafe.getObject(obj, j), lo0oi0.I001iOo1i0O(i5));
                                } else {
                                    continue;
                                }
/* 1502 */                      i5 += 3;
/* 1504 */                      i3 = 1048575;
/* 1507 */                      lo0oi0 = this;
                            case PoseLandmark.RIGHT_PINKY:
/* 1096 */                      lOI01O1oI.I0010I0i(iArr[i5], (List) unsafe.getObject(obj, j), i11i1ili, false);
                                continue;
/* 1502 */                      i5 += 3;
/* 1504 */                      i3 = 1048575;
/* 1507 */                      lo0oi0 = this;
                            case PoseLandmark.LEFT_INDEX:
/* 1082 */                      lOI01O1oI.I001IO000(iArr[i5], (List) unsafe.getObject(obj, j), i11i1ili, false);
                                continue;
/* 1502 */                      i5 += 3;
/* 1504 */                      i3 = 1048575;
/* 1507 */                      lo0oi0 = this;
                            case PoseLandmark.RIGHT_INDEX:
/* 1068 */                      lOI01O1oI.I001i1lo1io(iArr[i5], (List) unsafe.getObject(obj, j), i11i1ili, false);
                                continue;
/* 1502 */                      i5 += 3;
/* 1504 */                      i3 = 1048575;
/* 1507 */                      lo0oi0 = this;
                            case PoseLandmark.LEFT_THUMB:
/* 1054 */                      lOI01O1oI.I0000O(iArr[i5], (List) unsafe.getObject(obj, j), i11i1ili, false);
                                continue;
/* 1502 */                      i5 += 3;
/* 1504 */                      i3 = 1048575;
/* 1507 */                      lo0oi0 = this;
                            case PoseLandmark.RIGHT_THUMB:
/* 1040 */                      lOI01O1oI.I001i1O0Ol(iArr[i5], (List) unsafe.getObject(obj, j), i11i1ili, false);
                                continue;
/* 1502 */                      i5 += 3;
/* 1504 */                      i3 = 1048575;
/* 1507 */                      lo0oi0 = this;
                            case PoseLandmark.LEFT_HIP:
/* 1026 */                      lOI01O1oI.I001IIilI0O(iArr[i5], (List) unsafe.getObject(obj, j), i11i1ili, false);
                                continue;
/* 1502 */                      i5 += 3;
/* 1504 */                      i3 = 1048575;
/* 1507 */                      lo0oi0 = this;
                            case PoseLandmark.RIGHT_HIP:
/* 1012 */                      lOI01O1oI.I00111O(iArr[i5], (List) unsafe.getObject(obj, j), i11i1ili, false);
                                continue;
/* 1502 */                      i5 += 3;
/* 1504 */                      i3 = 1048575;
/* 1507 */                      lo0oi0 = this;
                            case PoseLandmark.LEFT_KNEE:
/* 998 */                       lOI01O1oI.I00100o1O0lo(iArr[i5], (List) unsafe.getObject(obj, j), i11i1ili, false);
                                continue;
/* 1502 */                      i5 += 3;
/* 1504 */                      i3 = 1048575;
/* 1507 */                      lo0oi0 = this;
                            case PoseLandmark.RIGHT_KNEE:
/* 912 */                       int i11 = iArr[i5];
/* 918 */                       List list = (List) unsafe.getObject(obj, j);
/* 920 */                       o0iOli o0ioli = lOI01O1oI.I00000oIO;
/* 922 */                       if (list != null && !list.isEmpty()) {
/* 932 */                           l1lo010IOi0 l1lo010ioi02 = (l1lo010IOi0) i11i1ili.I00iiI;
/* 936 */                           if (list instanceof lIl0I01lo) {
/* 939 */                               lIl0I01lo lil0i01lo = (lIl0I01lo) list;
/* 946 */                               for (int i12 = 0; i12 < list.size(); i12++) {
/* 948 */                                   Object objZza = lil0i01lo.zza();
/* 954 */                                   if (objZza instanceof String) {
/* 958 */                                       l1lo010ioi02.I000iOII(i11, (String) objZza);
                                            } else {
/* 964 */                                       l1lo010ioi02.I0000O(i11, (l1l1O1i) objZza);
                                            }
                                        }
                                        break;
                                    } else {
/* 975 */                               for (int i13 = 0; i13 < list.size(); i13++) {
/* 983 */                                   l1lo010ioi02.I000iOII(i11, (String) list.get(i13));
                                        }
                                        break;
                                    }
                                }
                                break;
                            case 27:
/* 873 */                       int i14 = iArr[i5];
/* 879 */                       List list2 = (List) unsafe.getObject(obj, j);
/* 881 */                       lO1liolI0IO lo1lioli0ioI001iOo1i0O = lo0oi0.I001iOo1i0O(i5);
/* 885 */                       o0iOli o0ioli2 = lOI01O1oI.I00000oIO;
/* 887 */                       if (list2 != null && !list2.isEmpty()) {
/* 900 */                           for (int i15 = 0; i15 < list2.size(); i15++) {
/* 906 */                               i11i1ili.I000OOo1O(i14, list2.get(i15), lo1lioli0ioI001iOo1i0O);
                                    }
                                    break;
                                }
                                break;
                            case PoseLandmark.RIGHT_ANKLE:
/* 829 */                       int i16 = iArr[i5];
/* 835 */                       List list3 = (List) unsafe.getObject(obj, j);
/* 837 */                       o0iOli o0ioli3 = lOI01O1oI.I00000oIO;
/* 839 */                       if (list3 != null && !list3.isEmpty()) {
/* 847 */                           i11i1ili.getClass();
/* 855 */                           for (int i17 = 0; i17 < list3.size(); i17++) {
/* 867 */                               ((l1lo010IOi0) i11i1ili.I00iiI).I0000O(i16, (l1l1O1i) list3.get(i17));
                                    }
                                    break;
                                }
                                break;
                            case PoseLandmark.LEFT_HEEL:
/* 824 */                       lOI01O1oI.I0000Il00O(iArr[i5], (List) unsafe.getObject(obj, j), i11i1ili, false);
                                continue;
/* 1502 */                      i5 += 3;
/* 1504 */                      i3 = 1048575;
/* 1507 */                      lo0oi0 = this;
                            case 30:
/* 810 */                       lOI01O1oI.I0010o(iArr[i5], (List) unsafe.getObject(obj, j), i11i1ili, false);
                                continue;
/* 1502 */                      i5 += 3;
/* 1504 */                      i3 = 1048575;
/* 1507 */                      lo0oi0 = this;
                            case PoseLandmark.LEFT_FOOT_INDEX:
/* 796 */                       lOI01O1oI.I001iOo1i0O(iArr[i5], (List) unsafe.getObject(obj, j), i11i1ili, false);
                                continue;
/* 1502 */                      i5 += 3;
/* 1504 */                      i3 = 1048575;
/* 1507 */                      lo0oi0 = this;
                            case 32:
/* 782 */                       lOI01O1oI.I001l0I00(iArr[i5], (List) unsafe.getObject(obj, j), i11i1ili, false);
                                continue;
/* 1502 */                      i5 += 3;
/* 1504 */                      i3 = 1048575;
/* 1507 */                      lo0oi0 = this;
                            case 33:
/* 768 */                       lOI01O1oI.I00000oIO(iArr[i5], (List) unsafe.getObject(obj, j), i11i1ili, false);
                                continue;
/* 1502 */                      i5 += 3;
/* 1504 */                      i3 = 1048575;
/* 1507 */                      lo0oi0 = this;
                            case 34:
/* 754 */                       lOI01O1oI.I00000oOI(iArr[i5], (List) unsafe.getObject(obj, j), i11i1ili, false);
                                continue;
/* 1502 */                      i5 += 3;
/* 1504 */                      i3 = 1048575;
/* 1507 */                      lo0oi0 = this;
                            case InputImage.IMAGE_FORMAT_YUV_420_888:
/* 740 */                       lOI01O1oI.I0010I0i(iArr[i5], (List) unsafe.getObject(obj, j), i11i1ili, true);
                                break;
                            case 36:
/* 727 */                       lOI01O1oI.I001IO000(iArr[i5], (List) unsafe.getObject(obj, j), i11i1ili, true);
                                break;
                            case 37:
/* 714 */                       lOI01O1oI.I001i1lo1io(iArr[i5], (List) unsafe.getObject(obj, j), i11i1ili, true);
                                break;
                            case 38:
/* 701 */                       lOI01O1oI.I0000O(iArr[i5], (List) unsafe.getObject(obj, j), i11i1ili, true);
                                break;
                            case 39:
/* 688 */                       lOI01O1oI.I001i1O0Ol(iArr[i5], (List) unsafe.getObject(obj, j), i11i1ili, true);
                                break;
                            case 40:
/* 675 */                       lOI01O1oI.I001IIilI0O(iArr[i5], (List) unsafe.getObject(obj, j), i11i1ili, true);
                                break;
                            case 41:
/* 662 */                       lOI01O1oI.I00111O(iArr[i5], (List) unsafe.getObject(obj, j), i11i1ili, true);
                                break;
                            case 42:
/* 649 */                       lOI01O1oI.I00100o1O0lo(iArr[i5], (List) unsafe.getObject(obj, j), i11i1ili, true);
                                break;
                            case 43:
/* 636 */                       lOI01O1oI.I0000Il00O(iArr[i5], (List) unsafe.getObject(obj, j), i11i1ili, true);
                                break;
                            case 44:
/* 623 */                       lOI01O1oI.I0010o(iArr[i5], (List) unsafe.getObject(obj, j), i11i1ili, true);
                                break;
                            case BuildConfig.VERSION_CODE:
/* 610 */                       lOI01O1oI.I001iOo1i0O(iArr[i5], (List) unsafe.getObject(obj, j), i11i1ili, true);
                                break;
                            case 46:
/* 597 */                       lOI01O1oI.I001l0I00(iArr[i5], (List) unsafe.getObject(obj, j), i11i1ili, true);
                                break;
                            case 47:
/* 584 */                       lOI01O1oI.I00000oIO(iArr[i5], (List) unsafe.getObject(obj, j), i11i1ili, true);
                                break;
                            case 48:
/* 571 */                       lOI01O1oI.I00000oOI(iArr[i5], (List) unsafe.getObject(obj, j), i11i1ili, true);
                                break;
                            case 49:
/* 524 */                       int i18 = iArr[i5];
/* 530 */                       List list4 = (List) unsafe.getObject(obj, j);
/* 532 */                       lO1liolI0IO lo1lioli0ioI001iOo1i0O2 = lo0oi0.I001iOo1i0O(i5);
/* 536 */                       o0iOli o0ioli4 = lOI01O1oI.I00000oIO;
/* 538 */                       if (list4 != null && !list4.isEmpty()) {
/* 551 */                           for (int i19 = 0; i19 < list4.size(); i19++) {
/* 557 */                               i11i1ili.I000II(i18, list4.get(i19), lo1lioli0ioI001iOo1i0O2);
                                    }
                                    break;
                                }
                                break;
                            case 50:
/* 508 */                       if (unsafe.getObject(obj, j) != null) {
/* 512 */                           int i20 = i5 / 3;
/* 523 */                           throw IIlIOloOOO.I000l1(lo0oi0.I00000oOI[i20 + i20]);
                                }
                                break;
                            case 51:
/* 479 */                       if (lo0oi0.I00100l0(obj, i7, i5)) {
/* 499 */                           ((l1lo010IOi0) i11i1ili.I00iiI).I000II(i7, Double.doubleToRawLongBits(((Double) lOiiillo.I000II(obj, j)).doubleValue()));
                                    break;
                                }
                                break;
                            case 52:
/* 450 */                       if (lo0oi0.I00100l0(obj, i7, i5)) {
/* 470 */                           ((l1lo010IOi0) i11i1ili.I00iiI).I0000oI00(i7, Float.floatToRawIntBits(((Float) lOiiillo.I000II(obj, j)).floatValue()));
                                    break;
                                }
                                break;
                            case 53:
/* 431 */                       if (lo0oi0.I00100l0(obj, i7, i5)) {
/* 441 */                           ((l1lo010IOi0) i11i1ili.I00iiI).I000oI1ioi(i7, I001i1O0Ol(j, obj));
                                    break;
                                }
                                break;
                            case 54:
/* 412 */                       if (lo0oi0.I00100l0(obj, i7, i5)) {
/* 422 */                           ((l1lo010IOi0) i11i1ili.I00iiI).I000oI1ioi(i7, I001i1O0Ol(j, obj));
                                    break;
                                }
                                break;
                            case 55:
/* 393 */                       if (lo0oi0.I00100l0(obj, i7, i5)) {
/* 403 */                           ((l1lo010IOi0) i11i1ili.I00iiI).I000OOo1O(i7, I0010o(j, obj));
                                    break;
                                }
                                break;
                            case 56:
/* 374 */                       if (lo0oi0.I00100l0(obj, i7, i5)) {
/* 384 */                           ((l1lo010IOi0) i11i1ili.I00iiI).I000II(i7, I001i1O0Ol(j, obj));
                                    break;
                                }
                                break;
                            case 57:
/* 355 */                       if (lo0oi0.I00100l0(obj, i7, i5)) {
/* 365 */                           ((l1lo010IOi0) i11i1ili.I00iiI).I0000oI00(i7, I0010o(j, obj));
                                    break;
                                }
                                break;
                            case 58:
/* 325 */                       if (lo0oi0.I00100l0(obj, i7, i5)) {
/* 333 */                           boolean zBooleanValue = ((Boolean) lOiiillo.I000II(obj, j)).booleanValue();
/* 339 */                           l1lo010IOi0 l1lo010ioi03 = (l1lo010IOi0) i11i1ili.I00iiI;
/* 343 */                           l1lo010ioi03.I000o00OoI0I(i7 << 3);
/* 346 */                           l1lo010ioi03.I00000oOI(zBooleanValue ? (byte) 1 : (byte) 0);
                                    break;
                                }
                                break;
                            case 59:
/* 289 */                       if (lo0oi0.I00100l0(obj, i7, i5)) {
/* 291 */                           Object object2 = unsafe.getObject(obj, j);
/* 297 */                           if (object2 instanceof String) {
/* 305 */                               ((l1lo010IOi0) i11i1ili.I00iiI).I000iOII(i7, (String) object2);
                                        break;
                                    } else {
/* 316 */                               ((l1lo010IOi0) i11i1ili.I00iiI).I0000O(i7, (l1l1O1i) object2);
                                        break;
                                    }
                                }
                                break;
                            case 60:
/* 270 */                       if (lo0oi0.I00100l0(obj, i7, i5)) {
/* 280 */                           i11i1ili.I000OOo1O(i7, unsafe.getObject(obj, j), lo0oi0.I001iOo1i0O(i5));
                                    break;
                                }
                                break;
                            case 61:
/* 249 */                       if (lo0oi0.I00100l0(obj, i7, i5)) {
/* 261 */                           ((l1lo010IOi0) i11i1ili.I00iiI).I0000O(i7, (l1l1O1i) unsafe.getObject(obj, j));
                                    break;
                                }
                                break;
                            case 62:
/* 230 */                       if (lo0oi0.I00100l0(obj, i7, i5)) {
/* 240 */                           ((l1lo010IOi0) i11i1ili.I00iiI).I000lI(i7, I0010o(j, obj));
                                    break;
                                }
                                break;
                            case 63:
/* 212 */                       if (lo0oi0.I00100l0(obj, i7, i5)) {
/* 222 */                           ((l1lo010IOi0) i11i1ili.I00iiI).I000OOo1O(i7, I0010o(j, obj));
                                    break;
                                }
                                break;
                            case Barcode.FORMAT_EAN_8:
/* 194 */                       if (lo0oi0.I00100l0(obj, i7, i5)) {
/* 204 */                           ((l1lo010IOi0) i11i1ili.I00iiI).I0000oI00(i7, I0010o(j, obj));
                                    break;
                                }
                                break;
                            case 65:
/* 176 */                       if (lo0oi0.I00100l0(obj, i7, i5)) {
/* 186 */                           ((l1lo010IOi0) i11i1ili.I00iiI).I000II(i7, I001i1O0Ol(j, obj));
                                    break;
                                }
                                break;
                            case 66:
/* 153 */                       if (lo0oi0.I00100l0(obj, i7, i5)) {
/* 155 */                           int iI0010o = I0010o(j, obj);
/* 168 */                           ((l1lo010IOi0) i11i1ili.I00iiI).I000lI(i7, (iI0010o >> 31) ^ (iI0010o + iI0010o));
                                    break;
                                }
                                break;
                            case 67:
/* 130 */                       if (lo0oi0.I00100l0(obj, i7, i5)) {
/* 132 */                           long jI001i1O0Ol = I001i1O0Ol(j, obj);
/* 145 */                           ((l1lo010IOi0) i11i1ili.I00iiI).I000oI1ioi(i7, (jI001i1O0Ol >> 63) ^ (jI001i1O0Ol + jI001i1O0Ol));
                                    break;
                                }
                                break;
                            case 68:
/* 112 */                       if (lo0oi0.I00100l0(obj, i7, i5)) {
/* 122 */                           i11i1ili.I000II(i7, unsafe.getObject(obj, j), lo0oi0.I001iOo1i0O(i5));
                                    break;
                                }
                                break;
                        }
/* 1502 */              i5 += 3;
/* 1504 */              i3 = 1048575;
/* 1507 */              lo0oi0 = this;
                    }
/* 1522 */          if (entry2 == null) {
/* 1529 */              ((lIIOO0oi1o) obj).zzc.I0000O(i11i1ili);
                    } else {
/* 1537 */              entry2.getKey().getClass();
/* 1540 */              OIiilo1Ool0o.I00000oIO();
                    }
                }

                @Override
                public final boolean I0001Ioi1lo(lIIOO0oi1o liioo0oi1o, lIIOO0oi1o liioo0oi1o2) {
                    boolean zI0000oI00;
/* 1 */             int[] iArr = this.I00000oIO;
/* 4 */             int i = 0;
                    while (true) {
/* 6 */                 if (i < iArr.length) {
/* 8 */                     int iI001IO000 = I001IO000(i);
/* 15 */                    long j = iI001IO000 & 1048575;
                            switch (I001IIilI0O(iI001IO000)) {
                                case 0:
/* 432 */                           if (!I000l1(liioo0oi1o, liioo0oi1o2, i)) {
                                        break;
                                    } else {
/* 434 */                               Ooil0oIOI0l0 ooil0oIOI0l0 = lOiiillo.I0000Il00O;
/* 454 */                               if (Double.doubleToLongBits(ooil0oIOI0l0.I0010I0i(liioo0oi1o, j)) != Double.doubleToLongBits(ooil0oIOI0l0.I0010I0i(liioo0oi1o2, j))) {
                                            break;
                                        } else {
                                            continue;
/* 456 */                                   i += 3;
                                        }
                                    }
                                case 1:
/* 405 */                           if (!I000l1(liioo0oi1o, liioo0oi1o2, i)) {
                                        break;
                                    } else {
/* 407 */                               Ooil0oIOI0l0 ooil0oIOI0l02 = lOiiillo.I0000Il00O;
/* 425 */                               if (Float.floatToIntBits(ooil0oIOI0l02.I001IIilI0O(liioo0oi1o, j)) != Float.floatToIntBits(ooil0oIOI0l02.I001IIilI0O(liioo0oi1o2, j))) {
                                            break;
                                        } else {
                                            continue;
/* 456 */                                   i += 3;
                                        }
                                    }
                                case 2:
/* 386 */                           if (!I000l1(liioo0oi1o, liioo0oi1o2, i) || lOiiillo.I0001Ioi1lo(liioo0oi1o, j) != lOiiillo.I0001Ioi1lo(liioo0oi1o2, j)) {
                                        break;
                                    } else {
                                        continue;
/* 456 */                               i += 3;
                                    }
                                    break;
                                case 3:
/* 367 */                           if (!I000l1(liioo0oi1o, liioo0oi1o2, i) || lOiiillo.I0001Ioi1lo(liioo0oi1o, j) != lOiiillo.I0001Ioi1lo(liioo0oi1o2, j)) {
                                        break;
                                    } else {
                                        continue;
/* 456 */                               i += 3;
                                    }
                                    break;
                                case 4:
/* 350 */                           if (!I000l1(liioo0oi1o, liioo0oi1o2, i) || lOiiillo.I0000oI00(liioo0oi1o, j) != lOiiillo.I0000oI00(liioo0oi1o2, j)) {
                                        break;
                                    } else {
                                        continue;
/* 456 */                               i += 3;
                                    }
                                    break;
                                case 5:
/* 330 */                           if (!I000l1(liioo0oi1o, liioo0oi1o2, i) || lOiiillo.I0001Ioi1lo(liioo0oi1o, j) != lOiiillo.I0001Ioi1lo(liioo0oi1o2, j)) {
                                        break;
                                    } else {
                                        continue;
/* 456 */                               i += 3;
                                    }
                                    break;
                                case 6:
/* 312 */                           if (!I000l1(liioo0oi1o, liioo0oi1o2, i) || lOiiillo.I0000oI00(liioo0oi1o, j) != lOiiillo.I0000oI00(liioo0oi1o2, j)) {
                                        break;
                                    } else {
                                        continue;
/* 456 */                               i += 3;
                                    }
                                    break;
                                case 7:
/* 292 */                           if (!I000l1(liioo0oi1o, liioo0oi1o2, i)) {
                                        break;
                                    } else {
/* 294 */                               Ooil0oIOI0l0 ooil0oIOI0l03 = lOiiillo.I0000Il00O;
/* 304 */                               if (ooil0oIOI0l03.I00Io1o110i(liioo0oi1o, j) != ooil0oIOI0l03.I00Io1o110i(liioo0oi1o2, j)) {
                                            break;
                                        } else {
                                            continue;
/* 456 */                                   i += 3;
                                        }
                                    }
                                case 8:
/* 270 */                           if (!I000l1(liioo0oi1o, liioo0oi1o2, i) || !lOI01O1oI.I0000oI00(lOiiillo.I000II(liioo0oi1o, j), lOiiillo.I000II(liioo0oi1o2, j))) {
                                        break;
                                    } else {
                                        continue;
/* 456 */                               i += 3;
                                    }
                                    break;
                                case 9:
/* 248 */                           if (!I000l1(liioo0oi1o, liioo0oi1o2, i) || !lOI01O1oI.I0000oI00(lOiiillo.I000II(liioo0oi1o, j), lOiiillo.I000II(liioo0oi1o2, j))) {
                                        break;
                                    } else {
                                        continue;
/* 456 */                               i += 3;
                                    }
                                    break;
                                case 10:
/* 226 */                           if (!I000l1(liioo0oi1o, liioo0oi1o2, i) || !lOI01O1oI.I0000oI00(lOiiillo.I000II(liioo0oi1o, j), lOiiillo.I000II(liioo0oi1o2, j))) {
                                        break;
                                    } else {
                                        continue;
/* 456 */                               i += 3;
                                    }
                                    break;
                                case 11:
/* 208 */                           if (!I000l1(liioo0oi1o, liioo0oi1o2, i) || lOiiillo.I0000oI00(liioo0oi1o, j) != lOiiillo.I0000oI00(liioo0oi1o2, j)) {
                                        break;
                                    } else {
                                        continue;
/* 456 */                               i += 3;
                                    }
                                    break;
                                case 12:
/* 190 */                           if (!I000l1(liioo0oi1o, liioo0oi1o2, i) || lOiiillo.I0000oI00(liioo0oi1o, j) != lOiiillo.I0000oI00(liioo0oi1o2, j)) {
                                        break;
                                    } else {
                                        continue;
/* 456 */                               i += 3;
                                    }
                                    break;
                                case 13:
/* 172 */                           if (!I000l1(liioo0oi1o, liioo0oi1o2, i) || lOiiillo.I0000oI00(liioo0oi1o, j) != lOiiillo.I0000oI00(liioo0oi1o2, j)) {
                                        break;
                                    } else {
                                        continue;
/* 456 */                               i += 3;
                                    }
                                    break;
                                case 14:
/* 152 */                           if (!I000l1(liioo0oi1o, liioo0oi1o2, i) || lOiiillo.I0001Ioi1lo(liioo0oi1o, j) != lOiiillo.I0001Ioi1lo(liioo0oi1o2, j)) {
                                        break;
                                    } else {
                                        continue;
/* 456 */                               i += 3;
                                    }
                                    break;
                                case 15:
/* 134 */                           if (!I000l1(liioo0oi1o, liioo0oi1o2, i) || lOiiillo.I0000oI00(liioo0oi1o, j) != lOiiillo.I0000oI00(liioo0oi1o2, j)) {
                                        break;
                                    } else {
                                        continue;
/* 456 */                               i += 3;
                                    }
                                    break;
                                case 16:
/* 114 */                           if (!I000l1(liioo0oi1o, liioo0oi1o2, i) || lOiiillo.I0001Ioi1lo(liioo0oi1o, j) != lOiiillo.I0001Ioi1lo(liioo0oi1o2, j)) {
                                        break;
                                    } else {
                                        continue;
/* 456 */                               i += 3;
                                    }
                                    break;
                                case 17:
/* 92 */                            if (!I000l1(liioo0oi1o, liioo0oi1o2, i) || !lOI01O1oI.I0000oI00(lOiiillo.I000II(liioo0oi1o, j), lOiiillo.I000II(liioo0oi1o2, j))) {
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
/* 80 */                            zI0000oI00 = lOI01O1oI.I0000oI00(lOiiillo.I000II(liioo0oi1o, j), lOiiillo.I000II(liioo0oi1o2, j));
                                    break;
                                case 50:
/* 67 */                            zI0000oI00 = lOI01O1oI.I0000oI00(lOiiillo.I000II(liioo0oi1o, j), lOiiillo.I000II(liioo0oi1o2, j));
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
/* 41 */                            if (lOiiillo.I0000oI00(liioo0oi1o, j2) != lOiiillo.I0000oI00(liioo0oi1o2, j2) || !lOI01O1oI.I0000oI00(lOiiillo.I000II(liioo0oi1o, j), lOiiillo.I000II(liioo0oi1o2, j))) {
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
                        } else if (liioo0oi1o.zzc.equals(liioo0oi1o2.zzc)) {
/* 473 */                   if (this.I0001Ioi1lo) {
/* 483 */                       return ((lI1oIOl10iIo) liioo0oi1o).zzb.equals(((lI1oIOl10iIo) liioo0oi1o2).zzb);
                            }
/* 488 */                   return true;
                        }
                    }
/* 3 */             return false;
                }

                /* JADX WARN: Removed duplicated region for block: B:44:0x00db A[PHI: r2
                  0x00db: PHI (r2v34 int) = (r2v10 int), (r2v35 int) binds: [B:85:0x01ea, B:43:0x00d9] A[DONT_GENERATE, DONT_INLINE]] */
                @Override
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final int I000II(lIIOO0oi1o liioo0oi1o) {
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
/* 563 */                       jDoubleToLongBits = Double.doubleToLongBits(lOiiillo.I0000Il00O.I0010I0i(liioo0oi1o, j));
/* 567 */                       Charset charset = lIOOlo11OOii.I00000oIO;
/* 74 */                        i5 = i + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                                break;
                            case 1:
/* 541 */                       i2 = i5 * 53;
/* 549 */                       iFloatToIntBits = Float.floatToIntBits(lOiiillo.I0000Il00O.I001IIilI0O(liioo0oi1o, j));
/* 52 */                        i5 = iFloatToIntBits + i2;
                                break;
                            case 2:
/* 531 */                       i = i5 * 53;
/* 533 */                       jDoubleToLongBits = lOiiillo.I0001Ioi1lo(liioo0oi1o, j);
/* 537 */                       Charset charset2 = lIOOlo11OOii.I00000oIO;
/* 74 */                        i5 = i + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                                break;
                            case 3:
/* 521 */                       i = i5 * 53;
/* 523 */                       jDoubleToLongBits = lOiiillo.I0001Ioi1lo(liioo0oi1o, j);
/* 527 */                       Charset charset3 = lIOOlo11OOii.I00000oIO;
/* 74 */                        i5 = i + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                                break;
                            case 4:
/* 513 */                       i2 = i5 * 53;
/* 515 */                       iFloatToIntBits = lOiiillo.I0000oI00(liioo0oi1o, j);
/* 52 */                        i5 = iFloatToIntBits + i2;
                                break;
                            case 5:
/* 503 */                       i = i5 * 53;
/* 505 */                       jDoubleToLongBits = lOiiillo.I0001Ioi1lo(liioo0oi1o, j);
/* 509 */                       Charset charset4 = lIOOlo11OOii.I00000oIO;
/* 74 */                        i5 = i + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                                break;
                            case 6:
/* 495 */                       i2 = i5 * 53;
/* 497 */                       iFloatToIntBits = lOiiillo.I0000oI00(liioo0oi1o, j);
/* 52 */                        i5 = iFloatToIntBits + i2;
                                break;
                            case 7:
/* 481 */                       i3 = i5 * 53;
/* 485 */                       boolean zI00Io1o110i = lOiiillo.I0000Il00O.I00Io1o110i(liioo0oi1o, j);
/* 489 */                       Charset charset5 = lIOOlo11OOii.I00000oIO;
/* 491 */                       if (zI00Io1o110i) {
/* 220 */                           i9 = 1231;
                                }
/* 221 */                       i5 = i9 + i3;
                                break;
                            case 8:
/* 467 */                       i2 = i5 * 53;
/* 475 */                       iFloatToIntBits = ((String) lOiiillo.I000II(liioo0oi1o, j)).hashCode();
/* 52 */                        i5 = iFloatToIntBits + i2;
                                break;
                            case 9:
/* 454 */                       i4 = i5 * 53;
/* 456 */                       Object objI000II = lOiiillo.I000II(liioo0oi1o, j);
/* 460 */                       if (objI000II != null) {
/* 462 */                           iHashCode = objI000II.hashCode();
                                }
/* 387 */                       i5 = i4 + iHashCode;
                                break;
                            case 10:
/* 442 */                       i2 = i5 * 53;
/* 448 */                       iFloatToIntBits = lOiiillo.I000II(liioo0oi1o, j).hashCode();
/* 52 */                        i5 = iFloatToIntBits + i2;
                                break;
                            case 11:
/* 434 */                       i2 = i5 * 53;
/* 436 */                       iFloatToIntBits = lOiiillo.I0000oI00(liioo0oi1o, j);
/* 52 */                        i5 = iFloatToIntBits + i2;
                                break;
                            case 12:
/* 426 */                       i2 = i5 * 53;
/* 428 */                       iFloatToIntBits = lOiiillo.I0000oI00(liioo0oi1o, j);
/* 52 */                        i5 = iFloatToIntBits + i2;
                                break;
                            case 13:
/* 418 */                       i2 = i5 * 53;
/* 420 */                       iFloatToIntBits = lOiiillo.I0000oI00(liioo0oi1o, j);
/* 52 */                        i5 = iFloatToIntBits + i2;
                                break;
                            case 14:
/* 408 */                       i = i5 * 53;
/* 410 */                       jDoubleToLongBits = lOiiillo.I0001Ioi1lo(liioo0oi1o, j);
/* 414 */                       Charset charset6 = lIOOlo11OOii.I00000oIO;
/* 74 */                        i5 = i + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                                break;
                            case 15:
/* 400 */                       i2 = i5 * 53;
/* 402 */                       iFloatToIntBits = lOiiillo.I0000oI00(liioo0oi1o, j);
/* 52 */                        i5 = iFloatToIntBits + i2;
                                break;
                            case 16:
/* 390 */                       i = i5 * 53;
/* 392 */                       jDoubleToLongBits = lOiiillo.I0001Ioi1lo(liioo0oi1o, j);
/* 396 */                       Charset charset7 = lIOOlo11OOii.I00000oIO;
/* 74 */                        i5 = i + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                                break;
                            case 17:
/* 375 */                       i4 = i5 * 53;
/* 377 */                       Object objI000II2 = lOiiillo.I000II(liioo0oi1o, j);
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
/* 369 */                       iFloatToIntBits = lOiiillo.I000II(liioo0oi1o, j).hashCode();
/* 52 */                        i5 = iFloatToIntBits + i2;
                                break;
                            case 50:
/* 351 */                       i2 = i5 * 53;
/* 357 */                       iFloatToIntBits = lOiiillo.I000II(liioo0oi1o, j).hashCode();
/* 52 */                        i5 = iFloatToIntBits + i2;
                                break;
                            case 51:
/* 329 */                       if (I00100l0(liioo0oi1o, i8, i6)) {
/* 331 */                           i = i5 * 53;
/* 343 */                           jDoubleToLongBits = Double.doubleToLongBits(((Double) lOiiillo.I000II(liioo0oi1o, j)).doubleValue());
/* 347 */                           Charset charset8 = lIOOlo11OOii.I00000oIO;
/* 74 */                            i5 = i + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                                    break;
                                } else {
                                    break;
                                }
                            case 52:
/* 305 */                       if (I00100l0(liioo0oi1o, i8, i6)) {
/* 307 */                           i2 = i5 * 53;
/* 319 */                           iFloatToIntBits = Float.floatToIntBits(((Float) lOiiillo.I000II(liioo0oi1o, j)).floatValue());
/* 52 */                            i5 = iFloatToIntBits + i2;
                                    break;
                                } else {
                                    break;
                                }
                            case 53:
/* 289 */                       if (I00100l0(liioo0oi1o, i8, i6)) {
/* 291 */                           i = i5 * 53;
/* 293 */                           jDoubleToLongBits = I001i1O0Ol(j, liioo0oi1o);
/* 297 */                           Charset charset9 = lIOOlo11OOii.I00000oIO;
/* 74 */                            i5 = i + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                                    break;
                                } else {
                                    break;
                                }
                            case 54:
/* 273 */                       if (I00100l0(liioo0oi1o, i8, i6)) {
/* 275 */                           i = i5 * 53;
/* 277 */                           jDoubleToLongBits = I001i1O0Ol(j, liioo0oi1o);
/* 281 */                           Charset charset10 = lIOOlo11OOii.I00000oIO;
/* 74 */                            i5 = i + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                                    break;
                                } else {
                                    break;
                                }
                            case 55:
/* 259 */                       if (I00100l0(liioo0oi1o, i8, i6)) {
/* 261 */                           i2 = i5 * 53;
/* 263 */                           iFloatToIntBits = I0010o(j, liioo0oi1o);
/* 52 */                            i5 = iFloatToIntBits + i2;
                                    break;
                                } else {
                                    break;
                                }
                            case 56:
/* 243 */                       if (I00100l0(liioo0oi1o, i8, i6)) {
/* 245 */                           i = i5 * 53;
/* 247 */                           jDoubleToLongBits = I001i1O0Ol(j, liioo0oi1o);
/* 251 */                           Charset charset11 = lIOOlo11OOii.I00000oIO;
/* 74 */                            i5 = i + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                                    break;
                                } else {
                                    break;
                                }
                            case 57:
/* 229 */                       if (I00100l0(liioo0oi1o, i8, i6)) {
/* 231 */                           i2 = i5 * 53;
/* 233 */                           iFloatToIntBits = I0010o(j, liioo0oi1o);
/* 52 */                            i5 = iFloatToIntBits + i2;
                                    break;
                                } else {
                                    break;
                                }
                            case 58:
/* 202 */                       if (I00100l0(liioo0oi1o, i8, i6)) {
/* 204 */                           i3 = i5 * 53;
/* 212 */                           boolean zBooleanValue = ((Boolean) lOiiillo.I000II(liioo0oi1o, j)).booleanValue();
/* 216 */                           Charset charset12 = lIOOlo11OOii.I00000oIO;
/* 218 */                           if (zBooleanValue) {
                                    }
/* 221 */                           i5 = i9 + i3;
                                    break;
                                } else {
                                    break;
                                }
                            case 59:
/* 182 */                       if (I00100l0(liioo0oi1o, i8, i6)) {
/* 184 */                           i2 = i5 * 53;
/* 192 */                           iFloatToIntBits = ((String) lOiiillo.I000II(liioo0oi1o, j)).hashCode();
/* 52 */                            i5 = iFloatToIntBits + i2;
                                    break;
                                } else {
                                    break;
                                }
                            case 60:
/* 165 */                       if (I00100l0(liioo0oi1o, i8, i6)) {
/* 167 */                           i2 = i5 * 53;
/* 173 */                           iFloatToIntBits = lOiiillo.I000II(liioo0oi1o, j).hashCode();
/* 52 */                            i5 = iFloatToIntBits + i2;
                                    break;
                                } else {
                                    break;
                                }
                            case 61:
/* 148 */                       if (I00100l0(liioo0oi1o, i8, i6)) {
/* 150 */                           i2 = i5 * 53;
/* 156 */                           iFloatToIntBits = lOiiillo.I000II(liioo0oi1o, j).hashCode();
/* 52 */                            i5 = iFloatToIntBits + i2;
                                    break;
                                } else {
                                    break;
                                }
                            case 62:
/* 135 */                       if (I00100l0(liioo0oi1o, i8, i6)) {
/* 137 */                           i2 = i5 * 53;
/* 139 */                           iFloatToIntBits = I0010o(j, liioo0oi1o);
/* 52 */                            i5 = iFloatToIntBits + i2;
                                    break;
                                } else {
                                    break;
                                }
                            case 63:
/* 122 */                       if (I00100l0(liioo0oi1o, i8, i6)) {
/* 124 */                           i2 = i5 * 53;
/* 126 */                           iFloatToIntBits = I0010o(j, liioo0oi1o);
/* 52 */                            i5 = iFloatToIntBits + i2;
                                    break;
                                } else {
                                    break;
                                }
                            case Barcode.FORMAT_EAN_8:
/* 109 */                       if (I00100l0(liioo0oi1o, i8, i6)) {
/* 111 */                           i2 = i5 * 53;
/* 113 */                           iFloatToIntBits = I0010o(j, liioo0oi1o);
/* 52 */                            i5 = iFloatToIntBits + i2;
                                    break;
                                } else {
                                    break;
                                }
                            case 65:
/* 94 */                        if (I00100l0(liioo0oi1o, i8, i6)) {
/* 96 */                            i = i5 * 53;
/* 98 */                            jDoubleToLongBits = I001i1O0Ol(j, liioo0oi1o);
/* 102 */                           Charset charset13 = lIOOlo11OOii.I00000oIO;
/* 74 */                            i5 = i + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                                    break;
                                } else {
                                    break;
                                }
                            case 66:
/* 81 */                        if (I00100l0(liioo0oi1o, i8, i6)) {
/* 83 */                            i2 = i5 * 53;
/* 85 */                            iFloatToIntBits = I0010o(j, liioo0oi1o);
/* 52 */                            i5 = iFloatToIntBits + i2;
                                    break;
                                } else {
                                    break;
                                }
                            case 67:
/* 60 */                        if (I00100l0(liioo0oi1o, i8, i6)) {
/* 62 */                            i = i5 * 53;
/* 64 */                            jDoubleToLongBits = I001i1O0Ol(j, liioo0oi1o);
/* 68 */                            Charset charset14 = lIOOlo11OOii.I00000oIO;
/* 74 */                            i5 = i + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                                    break;
                                } else {
                                    break;
                                }
                            case 68:
/* 40 */                        if (I00100l0(liioo0oi1o, i8, i6)) {
/* 42 */                            i2 = i5 * 53;
/* 48 */                            iFloatToIntBits = lOiiillo.I000II(liioo0oi1o, j).hashCode();
/* 52 */                            i5 = iFloatToIntBits + i2;
                                    break;
                                } else {
                                    break;
                                }
                        }
                    }
/* 583 */           int iHashCode2 = liioo0oi1o.zzc.hashCode() + (i5 * 53);
/* 586 */           if (!this.I0001Ioi1lo) {
/* 602 */               return iHashCode2;
                    }
/* 600 */           return ((lI1oIOl10iIo) liioo0oi1o).zzb.I00000oIO.hashCode() + (iHashCode2 * 53);
                }

                @Override
                public final void I000O01llI0(Object obj, byte[] bArr, int i, int i2, i111i0I1 i111i0i1) throws lIi0II001O1I {
/* 8 */             I00100o1O0lo(obj, bArr, i, i2, 0, i111i0i1);
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
/* 25 */                lO1liolI0IO lo1lioli0ioI001iOo1i0O = I001iOo1i0O(i);
/* 33 */                if (!I000lI(obj, i)) {
/* 39 */                    if (I000oI1ioi(object)) {
/* 45 */                        Object objZze = lo1lioli0ioI001iOo1i0O.zze();
/* 49 */                        lo1lioli0ioI001iOo1i0O.I00000oOI(objZze, object);
/* 52 */                        unsafe.putObject(obj, jI001IO000, objZze);
                            } else {
/* 41 */                        unsafe.putObject(obj, jI001IO000, object);
                            }
/* 55 */                    I000iOII(i, obj);
/* 58 */                    return;
                        }
/* 59 */                Object object2 = unsafe.getObject(obj, jI001IO000);
/* 67 */                if (!I000oI1ioi(object2)) {
/* 69 */                    Object objZze2 = lo1lioli0ioI001iOo1i0O.zze();
/* 73 */                    lo1lioli0ioI001iOo1i0O.I00000oOI(objZze2, object2);
/* 76 */                    unsafe.putObject(obj, jI001IO000, objZze2);
/* 79 */                    object2 = objZze2;
                        }
/* 80 */                lo1lioli0ioI001iOo1i0O.I00000oOI(object2, object);
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
/* 29 */                lO1liolI0IO lo1lioli0ioI001iOo1i0O = I001iOo1i0O(i);
/* 37 */                if (!I00100l0(obj, i2, i)) {
/* 43 */                    if (I000oI1ioi(object)) {
/* 49 */                        Object objZze = lo1lioli0ioI001iOo1i0O.zze();
/* 53 */                        lo1lioli0ioI001iOo1i0O.I00000oOI(objZze, object);
/* 56 */                        unsafe.putObject(obj, jI001IO000, objZze);
                            } else {
/* 45 */                        unsafe.putObject(obj, jI001IO000, object);
                            }
/* 65 */                    lOiiillo.I000O01llI0(obj, iArr[i + 2] & 1048575, i2);
/* 68 */                    return;
                        }
/* 69 */                Object object2 = unsafe.getObject(obj, jI001IO000);
/* 77 */                if (!I000oI1ioi(object2)) {
/* 79 */                    Object objZze2 = lo1lioli0ioI001iOo1i0O.zze();
/* 83 */                    lo1lioli0ioI001iOo1i0O.I00000oOI(objZze2, object2);
/* 86 */                    unsafe.putObject(obj, jI001IO000, objZze2);
/* 89 */                    object2 = objZze2;
                        }
/* 90 */                lo1lioli0ioI001iOo1i0O.I00000oOI(object2, object);
                    }
                }

                public final void I000iOII(int i, Object obj) {
/* 5 */             int i2 = this.I00000oIO[i + 2];
/* 10 */            long j = 1048575 & i2;
/* 17 */            if (j == 1048575) {
/* 19 */                return;
                    }
/* 30 */            lOiiillo.I000O01llI0(obj, j, (1 << (i2 >>> 20)) | lOiiillo.I0000oI00(obj, j));
                }

                public final boolean I000l1(lIIOO0oi1o liioo0oi1o, lIIOO0oi1o liioo0oi1o2, int i) {
                    return I000lI(liioo0oi1o, i) == I000lI(liioo0oi1o2, i);
                }

                public final boolean I000lI(Object obj, int i) {
/* 5 */             int i2 = this.I00000oIO[i + 2];
/* 10 */            long j = i2 & 1048575;
/* 20 */            if (j != 1048575) {
                        return ((1 << (i2 >>> 20)) & lOiiillo.I0000oI00(obj, j)) != 0;
                    }
/* 22 */            int iI001IO000 = I001IO000(i);
/* 26 */            long j2 = iI001IO000 & 1048575;
                    switch (I001IIilI0O(iI001IO000)) {
                        case 0:
/* 232 */                   if (Double.doubleToRawLongBits(lOiiillo.I0000Il00O.I0010I0i(obj, j2)) != 0) {
                            }
                            break;
                        case 1:
/* 217 */                   if (Float.floatToRawIntBits(lOiiillo.I0000Il00O.I001IIilI0O(obj, j2)) != 0) {
                            }
                            break;
                        case 2:
/* 204 */                   if (lOiiillo.I0001Ioi1lo(obj, j2) != 0) {
                            }
                            break;
                        case 3:
/* 195 */                   if (lOiiillo.I0001Ioi1lo(obj, j2) != 0) {
                            }
                            break;
                        case 4:
/* 186 */                   if (lOiiillo.I0000oI00(obj, j2) != 0) {
                            }
                            break;
                        case 5:
/* 179 */                   if (lOiiillo.I0001Ioi1lo(obj, j2) != 0) {
                            }
                            break;
                        case 6:
/* 170 */                   if (lOiiillo.I0000oI00(obj, j2) != 0) {
                            }
                            break;
                        case 7:
                            break;
                        case 8:
/* 124 */                   Object objI000II = lOiiillo.I000II(obj, j2);
/* 130 */                   if (!(objI000II instanceof String)) {
/* 144 */                       if (!(objI000II instanceof l1l1O1i)) {
/* 155 */                           OIiilo1Ool0o.I00100o1O0lo();
                                    break;
                                } else if (!l1l1O1i.I00iiI.equals(objI000II)) {
                                }
                            } else if (!((String) objI000II).isEmpty()) {
                            }
                            break;
                        case 9:
/* 120 */                   if (lOiiillo.I000II(obj, j2) != null) {
                            }
                            break;
                        case 10:
/* 112 */                   if (!l1l1O1i.I00iiI.equals(lOiiillo.I000II(obj, j2))) {
                            }
                            break;
                        case 11:
/* 98 */                    if (lOiiillo.I0000oI00(obj, j2) != 0) {
                            }
                            break;
                        case 12:
/* 90 */                    if (lOiiillo.I0000oI00(obj, j2) != 0) {
                            }
                            break;
                        case 13:
/* 82 */                    if (lOiiillo.I0000oI00(obj, j2) != 0) {
                            }
                            break;
                        case 14:
/* 74 */                    if (lOiiillo.I0001Ioi1lo(obj, j2) != 0) {
                            }
                            break;
                        case 15:
/* 64 */                    if (lOiiillo.I0000oI00(obj, j2) != 0) {
                            }
                            break;
                        case 16:
/* 56 */                    if (lOiiillo.I0001Ioi1lo(obj, j2) != 0) {
                            }
                            break;
                        case 17:
/* 46 */                    if (lOiiillo.I000II(obj, j2) != null) {
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
                    return lOiiillo.I0000oI00(obj, (long) (this.I00000oIO[i2 + 2] & 1048575)) == i;
                }

                /* JADX WARN: Code restructure failed: missing block: B:110:0x0332, code lost:
                
                    p000.iilo0lOo110.I0001Ioi1lo("Protocol message had invalid UTF-8.");
                 */
                /* JADX WARN: Code restructure failed: missing block: B:111:0x0337, code lost:
                
                    return 0;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:131:0x038b, code lost:
                
                    p000.iilo0lOo110.I0001Ioi1lo("Protocol message had invalid UTF-8.");
                 */
                /* JADX WARN: Code restructure failed: missing block: B:132:0x0390, code lost:
                
                    return 0;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:146:0x03f6, code lost:
                
                    p000.iilo0lOo110.I0001Ioi1lo("Protocol message had invalid UTF-8.");
                 */
                /* JADX WARN: Code restructure failed: missing block: B:147:0x03fa, code lost:
                
                    return 0;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:167:0x046f, code lost:
                
                    r10 = r2;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:182:0x052f, code lost:
                
                    r10 = r1;
                    r13 = r2;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:186:0x055e, code lost:
                
                    r7 = r14;
                    r17 = r15;
                    r12 = r19;
                    r13 = r22;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:193:0x05d8, code lost:
                
                    r13 = r2;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:197:0x0621, code lost:
                
                    r3 = r13;
                    r13 = r7;
                    r7 = r9;
                    r9 = r3;
                    r11 = r42;
                    r3 = r4;
                    r8 = r12;
                    r23 = r16;
                    r16 = r1;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:41:0x0122, code lost:
                
                    r1 = r6;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:485:0x0c6b, code lost:
                
                    r11 = r42;
                    r8 = r12;
                    r3 = r14;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:48:0x0167, code lost:
                
                    r10 = r9;
                    r9 = r7;
                    r7 = r10;
                    r10 = r2;
                    r22 = r13;
                    r13 = r1;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:73:0x0288, code lost:
                
                    r13 = r7;
                    r7 = r1;
                 */
                /* JADX WARN: Removed duplicated region for block: B:21:0x005a  */
                /* JADX WARN: Removed duplicated region for block: B:24:0x0074  */
                /* JADX WARN: Removed duplicated region for block: B:464:0x0bf1  */
                /* JADX WARN: Removed duplicated region for block: B:565:0x0e95  */
                /* JADX WARN: Removed duplicated region for block: B:566:0x0ea7  */
                /* JADX WARN: Removed duplicated region for block: B:577:0x0ee2  */
                /* JADX WARN: Removed duplicated region for block: B:654:0x005e A[SYNTHETIC] */
                /* JADX WARN: Removed duplicated region for block: B:687:0x0c09 A[SYNTHETIC] */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final int I00100o1O0lo(Object obj, byte[] bArr, int i, int i2, int i3, i111i0I1 i111i0i1) throws lIi0II001O1I {
                    int i4;
                    Object[] objArr;
                    int[] iArr;
                    Unsafe unsafe;
                    int i5;
                    Object obj2;
                    int i6;
                    int i7;
                    int iI00111O;
                    int i8;
                    byte[] bArr2;
                    int i9;
                    i111i0I1 i111i0i12;
                    int iI0000oI00;
                    int i10;
                    int i11;
                    int i12;
                    byte[] bArr3;
                    i111i0I1 i111i0i13;
                    int i13;
                    int i14;
                    int i15;
                    Unsafe unsafe2;
                    int i16;
                    Object obj3;
                    Unsafe unsafe3;
                    i111i0I1 i111i0i14;
                    int i17;
                    int i18;
                    int iI0001Ioi1lo;
                    int i19;
                    int i20;
                    int i21;
                    byte b;
                    byte b2;
                    byte[] bArr4;
                    i111i0I1 i111i0i15;
                    Object obj4;
                    Unsafe unsafe4;
                    int i22;
                    int i23;
                    int i24;
                    int i25;
                    int i26;
                    int iI0001Ioi1lo2;
                    int iI000OOo1O;
                    i111i0I1 i111i0i16;
                    int i27;
                    int iI00000oIO;
                    int iI0001Ioi1lo3;
                    lIo10Iolio lio10iolio;
                    int i28;
                    int i29;
                    int iI0001Ioi1lo4;
                    int iI0000O;
                    byte[] bArr5;
                    int i30;
                    i111i0I1 i111i0i17;
                    byte[] bArr6;
                    int i31;
                    i111i0I1 i111i0i18;
                    int i32;
                    int i33;
                    int iI000O01llI0;
                    int i34;
                    illiO0i illio0i;
                    int i35;
                    byte[] bArr7;
                    int i36;
                    i111i0I1 i111i0i19;
                    int i37;
                    int iI0001Ioi1lo5;
                    int i38;
/* 3 */             Object obj5 = obj;
/* 5 */             byte[] bArr8 = bArr;
/* 7 */             int i39 = i2;
/* 9 */             i111i0I1 i111i0i110 = i111i0i1;
/* 11 */            Object[] objArr2 = this.I00000oOI;
/* 13 */            int[] iArr2 = this.I00000oIO;
/* 15 */            int i40 = this.I0000O;
/* 21 */            if (!I000oI1ioi(obj5)) {
/* 3950 */              I000II.I000iOII("Mutating immutable message: ".concat(String.valueOf(obj5)));
/* 3938 */              return 0;
                    }
/* 23 */            int iI000OiO = i;
/* 25 */            int i41 = -1;
/* 26 */            int i42 = 0;
/* 27 */            int i43 = 1048575;
/* 30 */            int i44 = 0;
/* 32 */            int i45 = 0;
                    while (true) {
/* 34 */                int i46 = 1048575;
                        while (true) {
/* 37 */                    Unsafe unsafe5 = I000lI;
/* 39 */                    if (iI000OiO < i39) {
/* 43 */                        int iI000II = iI000OiO + 1;
/* 45 */                        int i47 = bArr8[iI000OiO];
/* 47 */                        if (i47 < 0) {
/* 49 */                            iI000II = ll0I0olIli.I000II(i47, bArr8, iI000II, i111i0i110);
/* 53 */                            i47 = i111i0i110.I00000oIO;
                                }
/* 55 */                        int i48 = i47;
/* 57 */                        int i49 = iI000II;
/* 60 */                        i7 = i48 >>> 3;
/* 62 */                        i45 = i48;
/* 64 */                        int i50 = this.I0000Il00O;
/* 66 */                        if (i7 > i41) {
/* 91 */                            iI00111O = (i7 < i50 || i7 > i40) ? -1 : I00111O(i7, i42 / 3);
/* 93 */                            if (iI00111O == -1) {
/* 117 */                               int i51 = i45 & 7;
/* 121 */                               int i52 = iArr2[iI00111O + 1];
/* 123 */                               int iI001IIilI0O = I001IIilI0O(i52);
/* 129 */                               long j = i52 & i46;
/* 134 */                               Unsafe unsafe6 = I000lI;
/* 140 */                               String str = "";
/* 152 */                               if (iI001IIilI0O > 17) {
/* 1586 */                                  objArr = objArr2;
/* 1588 */                                  unsafe = unsafe5;
/* 1589 */                                  i6 = i45;
/* 1597 */                                  i111i0I1 i111i0i111 = i111i0i110;
/* 1598 */                                  iArr = iArr2;
/* 1600 */                                  int i53 = iI00111O;
/* 1601 */                                  int i54 = i40;
/* 1603 */                                  Object obj6 = obj5;
/* 1606 */                                  i8 = i54;
/* 1612 */                                  if (iI001IIilI0O != 27) {
/* 1687 */                                      if (iI001IIilI0O <= 49) {
                                                    long j2 = i52;
/* 1696 */                                          lIOIoo1O lioioo1oZzd = (lIOIoo1O) unsafe.getObject(obj6, j);
/* 1705 */                                          if (!((l1Io0Iiio1o0) lioioo1oZzd).I00iOIl) {
/* 1707 */                                              int size = lioioo1oZzd.size();
/* 1719 */                                              lioioo1oZzd = lioioo1oZzd.zzd(size != 0 ? size + size : 10);
/* 1723 */                                              unsafe.putObject(obj6, j, lioioo1oZzd);
                                                    }
/* 1726 */                                          String str2 = "While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.";
                                                    switch (iI001IIilI0O) {
                                                        case PoseLandmark.RIGHT_PINKY:
                                                        case InputImage.IMAGE_FORMAT_YUV_420_888:
/* 3036 */                                                  bArr2 = bArr;
/* 3038 */                                                  i28 = i2;
/* 3040 */                                                  i111i0i12 = i111i0i1;
/* 3042 */                                                  i23 = i7;
/* 3044 */                                                  i29 = i49;
/* 3047 */                                                  i4 = i43;
/* 3050 */                                                  if (i51 == 2) {
/* 3100 */                                                      OIiilo1Ool0o.I00000oIO();
/* 3098 */                                                      return 0;
                                                            }
/* 3053 */                                                  if (i51 == 1) {
/* 3092 */                                                      OIiilo1Ool0o.I00000oIO();
/* 3095 */                                                      return 0;
                                                            }
/* 3055 */                                                  iI0000O = i29;
/* 3056 */                                                  if (iI0000O != i29) {
/* 3082 */                                                      obj2 = obj;
/* 3084 */                                                      i5 = i3;
/* 3086 */                                                      i9 = iI0000O;
/* 3087 */                                                      i42 = i53;
                                                                break;
                                                            } else {
/* 3058 */                                                      i39 = i28;
/* 3059 */                                                      bArr8 = bArr2;
/* 3060 */                                                      i42 = i53;
/* 3061 */                                                      i111i0i110 = i111i0i12;
/* 3062 */                                                      i45 = i6;
/* 3064 */                                                      iArr2 = iArr;
/* 3066 */                                                      i40 = i8;
/* 3068 */                                                      i43 = i4;
/* 3070 */                                                      i41 = i23;
/* 3072 */                                                      objArr2 = objArr;
/* 3074 */                                                      i46 = 1048575;
/* 3077 */                                                      iI000OiO = iI0000O;
/* 3078 */                                                      obj5 = obj;
                                                            }
                                                        case PoseLandmark.LEFT_INDEX:
                                                        case 36:
/* 2939 */                                                  bArr2 = bArr;
/* 2941 */                                                  i28 = i2;
/* 2943 */                                                  i111i0i12 = i111i0i1;
/* 2947 */                                                  lIOIoo1O lioioo1o = lioioo1oZzd;
/* 2948 */                                                  i23 = i7;
/* 2950 */                                                  i29 = i49;
/* 2953 */                                                  i4 = i43;
/* 2956 */                                                  if (i51 == 2) {
/* 2959 */                                                      lI101iOli li101ioli = (lI101iOli) lioioo1o;
/* 2961 */                                                      iI0001Ioi1lo4 = ll0I0olIli.I0001Ioi1lo(bArr2, i29, i111i0i12);
/* 2967 */                                                      int i55 = i111i0i12.I00000oIO + iI0001Ioi1lo4;
/* 2968 */                                                      while (iI0001Ioi1lo4 < i55) {
/* 2978 */                                                          li101ioli.I0000O(Float.intBitsToFloat(ll0I0olIli.I00000oOI(iI0001Ioi1lo4, bArr2)));
/* 2981 */                                                          iI0001Ioi1lo4 += 4;
                                                                }
/* 2984 */                                                      if (iI0001Ioi1lo4 != i55) {
/* 2987 */                                                          iilo0lOo110.I0001Ioi1lo("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
/* 2990 */                                                          return 0;
                                                                }
                                                            } else {
/* 2994 */                                                      if (i51 == 5) {
/* 2996 */                                                          iI0001Ioi1lo4 = i29 + 4;
/* 2999 */                                                          lI101iOli li101ioli2 = (lI101iOli) lioioo1o;
/* 3009 */                                                          li101ioli2.I0000O(Float.intBitsToFloat(ll0I0olIli.I00000oOI(i29, bArr2)));
/* 3012 */                                                          while (iI0001Ioi1lo4 < i28) {
/* 3014 */                                                              int iI0001Ioi1lo6 = ll0I0olIli.I0001Ioi1lo(bArr2, iI0001Ioi1lo4, i111i0i12);
/* 3020 */                                                              if (i6 == i111i0i12.I00000oIO) {
/* 3030 */                                                                  li101ioli2.I0000O(Float.intBitsToFloat(ll0I0olIli.I00000oOI(iI0001Ioi1lo6, bArr2)));
/* 3033 */                                                                  iI0001Ioi1lo4 = iI0001Ioi1lo6 + 4;
                                                                        }
                                                                    }
                                                                }
/* 3055 */                                                      iI0000O = i29;
/* 3056 */                                                      if (iI0000O != i29) {
                                                                }
                                                            }
/* 2896 */                                                  iI0000O = iI0001Ioi1lo4;
/* 3056 */                                                  if (iI0000O != i29) {
                                                            }
                                                            break;
                                                        case PoseLandmark.RIGHT_INDEX:
                                                        case PoseLandmark.LEFT_THUMB:
                                                        case 37:
                                                        case 38:
/* 2853 */                                                  bArr2 = bArr;
/* 2855 */                                                  i28 = i2;
/* 2857 */                                                  i111i0i12 = i111i0i1;
/* 2861 */                                                  lIOIoo1O lioioo1o2 = lioioo1oZzd;
/* 2862 */                                                  i23 = i7;
/* 2864 */                                                  i29 = i49;
/* 2867 */                                                  i4 = i43;
/* 2870 */                                                  if (i51 == 2) {
/* 2873 */                                                      lIlIoll lilioll = (lIlIoll) lioioo1o2;
/* 2875 */                                                      iI0001Ioi1lo4 = ll0I0olIli.I0001Ioi1lo(bArr2, i29, i111i0i12);
/* 2881 */                                                      int i56 = i111i0i12.I00000oIO + iI0001Ioi1lo4;
/* 2882 */                                                      while (iI0001Ioi1lo4 < i56) {
/* 2884 */                                                          iI0001Ioi1lo4 = ll0I0olIli.I000OOo1O(bArr2, iI0001Ioi1lo4, i111i0i12);
/* 2890 */                                                          lilioll.I0000oI00(i111i0i12.I00000oOI);
                                                                }
/* 2894 */                                                      if (iI0001Ioi1lo4 != i56) {
/* 2899 */                                                          iilo0lOo110.I0001Ioi1lo("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
/* 2902 */                                                          return 0;
                                                                }
                                                            } else {
/* 2905 */                                                      if (i51 == 0) {
/* 2908 */                                                          lIlIoll lilioll2 = (lIlIoll) lioioo1o2;
/* 2910 */                                                          iI0001Ioi1lo4 = ll0I0olIli.I000OOo1O(bArr2, i29, i111i0i12);
/* 2916 */                                                          lilioll2.I0000oI00(i111i0i12.I00000oOI);
/* 2919 */                                                          while (iI0001Ioi1lo4 < i28) {
/* 2921 */                                                              int iI0001Ioi1lo7 = ll0I0olIli.I0001Ioi1lo(bArr2, iI0001Ioi1lo4, i111i0i12);
/* 2927 */                                                              if (i6 == i111i0i12.I00000oIO) {
/* 2929 */                                                                  iI0001Ioi1lo4 = ll0I0olIli.I000OOo1O(bArr2, iI0001Ioi1lo7, i111i0i12);
/* 2935 */                                                                  lilioll2.I0000oI00(i111i0i12.I00000oOI);
                                                                        }
                                                                    }
                                                                }
/* 3055 */                                                      iI0000O = i29;
/* 3056 */                                                      if (iI0000O != i29) {
                                                                }
                                                            }
/* 2896 */                                                  iI0000O = iI0001Ioi1lo4;
/* 3056 */                                                  if (iI0000O != i29) {
                                                            }
                                                            break;
                                                        case PoseLandmark.RIGHT_THUMB:
                                                        case PoseLandmark.LEFT_HEEL:
                                                        case 39:
                                                        case 43:
/* 2812 */                                                  bArr5 = bArr;
/* 2814 */                                                  i28 = i2;
/* 2816 */                                                  lIOIoo1O lioioo1o3 = lioioo1oZzd;
/* 2817 */                                                  i23 = i7;
/* 2819 */                                                  i30 = i49;
/* 2822 */                                                  i111i0i17 = i111i0i1;
/* 2824 */                                                  i4 = i43;
/* 2827 */                                                  if (i51 == 2) {
/* 2829 */                                                      iI0000O = ll0I0olIli.I0000O(bArr5, i30, lioioo1o3, i111i0i17);
/* 2497 */                                                      bArr2 = bArr5;
/* 2498 */                                                      i29 = i30;
/* 2499 */                                                      i111i0i12 = i111i0i17;
/* 3056 */                                                      if (iI0000O != i29) {
                                                                }
                                                            } else {
/* 2836 */                                                      if (i51 == 0) {
/* 2843 */                                                          int iI000O01llI02 = ll0I0olIli.I000O01llI0(i6, bArr5, i30, i28, lioioo1o3, i111i0i17);
/* 2847 */                                                          bArr2 = bArr5;
/* 2848 */                                                          i29 = i30;
/* 2849 */                                                          i111i0i12 = i111i0i17;
/* 2850 */                                                          iI0000O = iI000O01llI02;
/* 3056 */                                                          if (iI0000O != i29) {
                                                                    }
                                                                }
/* 2610 */                                                      bArr2 = bArr5;
/* 2611 */                                                      i29 = i30;
/* 2612 */                                                      i111i0i12 = i111i0i17;
/* 3055 */                                                      iI0000O = i29;
/* 3056 */                                                      if (iI0000O != i29) {
                                                                }
                                                            }
                                                            break;
                                                        case PoseLandmark.LEFT_HIP:
                                                        case 32:
                                                        case 40:
                                                        case 46:
/* 2728 */                                                  bArr5 = bArr;
/* 2730 */                                                  i28 = i2;
/* 2734 */                                                  lIOIoo1O lioioo1o4 = lioioo1oZzd;
/* 2735 */                                                  i23 = i7;
/* 2737 */                                                  i30 = i49;
/* 2740 */                                                  i111i0i17 = i111i0i1;
/* 2742 */                                                  i4 = i43;
/* 2745 */                                                  if (i51 == 2) {
/* 2747 */                                                      lIlIoll lilioll3 = (lIlIoll) lioioo1o4;
/* 2749 */                                                      iI0000O = ll0I0olIli.I0001Ioi1lo(bArr5, i30, i111i0i17);
/* 2755 */                                                      int i57 = i111i0i17.I00000oIO + iI0000O;
/* 2756 */                                                      while (iI0000O < i57) {
/* 2762 */                                                          lilioll3.I0000oI00(ll0I0olIli.I000lI(iI0000O, bArr5));
/* 2765 */                                                          iI0000O += 8;
                                                                }
/* 2768 */                                                      if (iI0000O != i57) {
/* 2772 */                                                          iilo0lOo110.I0001Ioi1lo("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
/* 2775 */                                                          return 0;
                                                                }
                                                            } else {
/* 2779 */                                                      if (i51 == 1) {
/* 2781 */                                                          iI0000O = i30 + 8;
/* 2783 */                                                          lIlIoll lilioll4 = (lIlIoll) lioioo1o4;
/* 2789 */                                                          lilioll4.I0000oI00(ll0I0olIli.I000lI(i30, bArr5));
/* 2792 */                                                          while (iI0000O < i28) {
/* 2794 */                                                              int iI0001Ioi1lo8 = ll0I0olIli.I0001Ioi1lo(bArr5, iI0000O, i111i0i17);
/* 2800 */                                                              if (i6 == i111i0i17.I00000oIO) {
/* 2806 */                                                                  lilioll4.I0000oI00(ll0I0olIli.I000lI(iI0001Ioi1lo8, bArr5));
/* 2809 */                                                                  iI0000O = iI0001Ioi1lo8 + 8;
                                                                        }
                                                                    }
                                                                }
/* 2610 */                                                      bArr2 = bArr5;
/* 2611 */                                                      i29 = i30;
/* 2612 */                                                      i111i0i12 = i111i0i17;
/* 3055 */                                                      iI0000O = i29;
/* 3056 */                                                      if (iI0000O != i29) {
                                                                }
                                                            }
/* 2497 */                                                  bArr2 = bArr5;
/* 2498 */                                                  i29 = i30;
/* 2499 */                                                  i111i0i12 = i111i0i17;
/* 3056 */                                                  if (iI0000O != i29) {
                                                            }
                                                            break;
                                                        case PoseLandmark.RIGHT_HIP:
                                                        case PoseLandmark.LEFT_FOOT_INDEX:
                                                        case 41:
                                                        case BuildConfig.VERSION_CODE:
/* 2644 */                                                  bArr5 = bArr;
/* 2646 */                                                  i28 = i2;
/* 2650 */                                                  lIOIoo1O lioioo1o5 = lioioo1oZzd;
/* 2651 */                                                  i23 = i7;
/* 2653 */                                                  i30 = i49;
/* 2656 */                                                  i111i0i17 = i111i0i1;
/* 2658 */                                                  i4 = i43;
/* 2661 */                                                  if (i51 == 2) {
/* 2663 */                                                      lIIOOOli10 liioooli10 = (lIIOOOli10) lioioo1o5;
/* 2665 */                                                      iI0000O = ll0I0olIli.I0001Ioi1lo(bArr5, i30, i111i0i17);
/* 2671 */                                                      int i58 = i111i0i17.I00000oIO + iI0000O;
/* 2672 */                                                      while (iI0000O < i58) {
/* 2678 */                                                          liioooli10.I0000oI00(ll0I0olIli.I00000oOI(iI0000O, bArr5));
/* 2681 */                                                          iI0000O += 4;
                                                                }
/* 2684 */                                                      if (iI0000O != i58) {
/* 2688 */                                                          iilo0lOo110.I0001Ioi1lo("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
/* 2691 */                                                          return 0;
                                                                }
                                                            } else {
/* 2695 */                                                      if (i51 == 5) {
/* 2697 */                                                          iI0000O = i30 + 4;
/* 2699 */                                                          lIIOOOli10 liioooli102 = (lIIOOOli10) lioioo1o5;
/* 2705 */                                                          liioooli102.I0000oI00(ll0I0olIli.I00000oOI(i30, bArr5));
/* 2708 */                                                          while (iI0000O < i28) {
/* 2710 */                                                              int iI0001Ioi1lo9 = ll0I0olIli.I0001Ioi1lo(bArr5, iI0000O, i111i0i17);
/* 2716 */                                                              if (i6 == i111i0i17.I00000oIO) {
/* 2722 */                                                                  liioooli102.I0000oI00(ll0I0olIli.I00000oOI(iI0001Ioi1lo9, bArr5));
/* 2725 */                                                                  iI0000O = iI0001Ioi1lo9 + 4;
                                                                        }
                                                                    }
                                                                }
/* 2610 */                                                      bArr2 = bArr5;
/* 2611 */                                                      i29 = i30;
/* 2612 */                                                      i111i0i12 = i111i0i17;
/* 3055 */                                                      iI0000O = i29;
/* 3056 */                                                      if (iI0000O != i29) {
                                                                }
                                                            }
/* 2497 */                                                  bArr2 = bArr5;
/* 2498 */                                                  i29 = i30;
/* 2499 */                                                  i111i0i12 = i111i0i17;
/* 3056 */                                                  if (iI0000O != i29) {
                                                            }
                                                            break;
                                                        case PoseLandmark.LEFT_KNEE:
                                                        case 42:
/* 2615 */                                                  bArr5 = bArr;
/* 2617 */                                                  i28 = i2;
/* 2619 */                                                  i111i0i17 = i111i0i1;
/* 2621 */                                                  i23 = i7;
/* 2623 */                                                  i30 = i49;
/* 2628 */                                                  i4 = i43;
/* 2631 */                                                  if (i51 == 2) {
/* 2640 */                                                      OIiilo1Ool0o.I00000oIO();
/* 2626 */                                                      return 0;
                                                            }
/* 2633 */                                                  if (i51 == 0) {
/* 2636 */                                                      OIiilo1Ool0o.I00000oIO();
/* 2626 */                                                      return 0;
                                                            }
/* 2610 */                                                  bArr2 = bArr5;
/* 2611 */                                                  i29 = i30;
/* 2612 */                                                  i111i0i12 = i111i0i17;
/* 3055 */                                                  iI0000O = i29;
/* 3056 */                                                  if (iI0000O != i29) {
                                                            }
                                                            break;
                                                        case PoseLandmark.RIGHT_KNEE:
/* 2403 */                                                  bArr5 = bArr;
/* 2405 */                                                  i28 = i2;
/* 2407 */                                                  lIOIoo1O lioioo1o6 = lioioo1oZzd;
/* 2408 */                                                  i23 = i7;
/* 2410 */                                                  i30 = i49;
/* 2413 */                                                  i111i0i17 = i111i0i1;
/* 2415 */                                                  i4 = i43;
/* 2418 */                                                  if (i51 == 2) {
/* 2427 */                                                      if ((j2 & 536870912) == 0) {
/* 2429 */                                                          iI0000O = ll0I0olIli.I0001Ioi1lo(bArr5, i30, i111i0i17);
/* 2433 */                                                          int i59 = i111i0i17.I00000oIO;
/* 2435 */                                                          if (i59 < 0) {
/* 2504 */                                                              iilo0lOo110.I0001Ioi1lo("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
/* 2502 */                                                              return 0;
                                                                    }
/* 2437 */                                                          if (i59 == 0) {
/* 2439 */                                                              lioioo1o6.add("");
                                                                    } else {
/* 2450 */                                                              lioioo1o6.add(new String(bArr5, iI0000O, i59, lIOOlo11OOii.I00000oIO));
/* 2453 */                                                              iI0000O += i59;
                                                                    }
/* 2454 */                                                          while (iI0000O < i28) {
/* 2456 */                                                              int iI0001Ioi1lo10 = ll0I0olIli.I0001Ioi1lo(bArr5, iI0000O, i111i0i17);
/* 2462 */                                                              if (i6 == i111i0i17.I00000oIO) {
/* 2464 */                                                                  iI0000O = ll0I0olIli.I0001Ioi1lo(bArr5, iI0001Ioi1lo10, i111i0i17);
/* 2468 */                                                                  int i60 = i111i0i17.I00000oIO;
/* 2470 */                                                                  if (i60 < 0) {
/* 2489 */                                                                      iilo0lOo110.I0001Ioi1lo("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
/* 2492 */                                                                      return 0;
                                                                            }
/* 2472 */                                                                  if (i60 == 0) {
/* 2474 */                                                                      lioioo1o6.add("");
                                                                            } else {
/* 2485 */                                                                      lioioo1o6.add(new String(bArr5, iI0000O, i60, lIOOlo11OOii.I00000oIO));
/* 2453 */                                                                      iI0000O += i60;
                                                                            }
                                                                        }
                                                                    }
                                                                } else {
/* 2508 */                                                          iI0000O = ll0I0olIli.I0001Ioi1lo(bArr5, i30, i111i0i17);
/* 2512 */                                                          int i61 = i111i0i17.I00000oIO;
/* 2514 */                                                          if (i61 < 0) {
/* 2604 */                                                              iilo0lOo110.I0001Ioi1lo("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
/* 2602 */                                                              return 0;
                                                                    }
/* 2516 */                                                          if (i61 == 0) {
/* 2518 */                                                              lioioo1o6.add("");
                                                                    } else {
/* 2522 */                                                              int i62 = iI0000O + i61;
/* 2528 */                                                              if (!lOl0l1O01.I0000O(bArr5, iI0000O, i62)) {
/* 2598 */                                                                  iilo0lOo110.I0001Ioi1lo("Protocol message had invalid UTF-8.");
/* 2596 */                                                                  return 0;
                                                                        }
/* 2537 */                                                              lioioo1o6.add(new String(bArr5, iI0000O, i61, lIOOlo11OOii.I00000oIO));
/* 2540 */                                                              iI0000O = i62;
                                                                    }
/* 2541 */                                                          while (iI0000O < i28) {
/* 2543 */                                                              int iI0001Ioi1lo11 = ll0I0olIli.I0001Ioi1lo(bArr5, iI0000O, i111i0i17);
/* 2549 */                                                              if (i6 == i111i0i17.I00000oIO) {
/* 2551 */                                                                  iI0000O = ll0I0olIli.I0001Ioi1lo(bArr5, iI0001Ioi1lo11, i111i0i17);
/* 2555 */                                                                  int i63 = i111i0i17.I00000oIO;
/* 2557 */                                                                  if (i63 < 0) {
/* 2592 */                                                                      iilo0lOo110.I0001Ioi1lo("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
/* 2590 */                                                                      return 0;
                                                                            }
/* 2559 */                                                                  if (i63 == 0) {
/* 2561 */                                                                      lioioo1o6.add("");
                                                                            } else {
/* 2565 */                                                                      int i64 = iI0000O + i63;
/* 2571 */                                                                      if (!lOl0l1O01.I0000O(bArr5, iI0000O, i64)) {
/* 2584 */                                                                          iilo0lOo110.I0001Ioi1lo("Protocol message had invalid UTF-8.");
/* 2587 */                                                                          return 0;
                                                                                }
/* 2580 */                                                                      lioioo1o6.add(new String(bArr5, iI0000O, i63, lIOOlo11OOii.I00000oIO));
/* 2540 */                                                                      iI0000O = i64;
                                                                            }
                                                                        }
                                                                    }
                                                                }
/* 2497 */                                                      bArr2 = bArr5;
/* 2498 */                                                      i29 = i30;
/* 2499 */                                                      i111i0i12 = i111i0i17;
/* 3056 */                                                      if (iI0000O != i29) {
                                                                }
                                                            } else {
/* 2610 */                                                      bArr2 = bArr5;
/* 2611 */                                                      i29 = i30;
/* 2612 */                                                      i111i0i12 = i111i0i17;
/* 3055 */                                                      iI0000O = i29;
/* 3056 */                                                      if (iI0000O != i29) {
                                                                }
                                                            }
                                                            break;
                                                        case 27:
/* 2365 */                                                  i23 = i7;
/* 2371 */                                                  i4 = i43;
/* 2373 */                                                  if (i51 == 2) {
/* 2375 */                                                      i6 = i6;
/* 2384 */                                                      int iI0000Il00O = ll0I0olIli.I0000Il00O(I001iOo1i0O(i53), i6, bArr, i49, i2, lioioo1oZzd, i111i0i1);
/* 2388 */                                                      i29 = i49;
/* 2389 */                                                      i28 = i2;
/* 2390 */                                                      i111i0i12 = i111i0i1;
/* 2391 */                                                      iI0000O = iI0000Il00O;
/* 2392 */                                                      bArr2 = bArr;
/* 3056 */                                                      if (iI0000O != i29) {
                                                                }
                                                            } else {
/* 2396 */                                                      i6 = i6;
/* 2397 */                                                      bArr2 = bArr;
/* 2398 */                                                      i29 = i49;
/* 2399 */                                                      i28 = i2;
/* 2400 */                                                      i111i0i12 = i111i0i1;
/* 3055 */                                                      iI0000O = i29;
/* 3056 */                                                      if (iI0000O != i29) {
                                                                }
                                                            }
                                                            break;
                                                        case PoseLandmark.RIGHT_ANKLE:
/* 2240 */                                                  bArr6 = bArr;
/* 2242 */                                                  i31 = i2;
/* 2244 */                                                  i111i0i18 = i111i0i1;
/* 2248 */                                                  i23 = i7;
/* 2251 */                                                  i32 = i49;
/* 2254 */                                                  i4 = i43;
/* 2256 */                                                  if (i51 == 2) {
/* 2258 */                                                      iI0000O = ll0I0olIli.I0001Ioi1lo(bArr6, i32, i111i0i18);
/* 2262 */                                                      int i65 = i111i0i18.I00000oIO;
/* 2264 */                                                      if (i65 < 0) {
/* 2353 */                                                          iilo0lOo110.I0001Ioi1lo("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
/* 2351 */                                                          return 0;
                                                                }
/* 2268 */                                                      if (i65 > bArr6.length - iI0000O) {
/* 2347 */                                                          iilo0lOo110.I0001Ioi1lo("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
/* 2345 */                                                          return 0;
                                                                }
/* 2270 */                                                      if (i65 == 0) {
/* 2274 */                                                          lioioo1oZzd.add(l1l1O1i.I00iiI);
                                                                } else {
/* 2282 */                                                          lioioo1oZzd.add(l1l1O1i.I000OOo1O(bArr6, iI0000O, i65));
/* 2285 */                                                          iI0000O += i65;
                                                                }
/* 2286 */                                                      while (iI0000O < i31) {
/* 2288 */                                                          int iI0001Ioi1lo12 = ll0I0olIli.I0001Ioi1lo(bArr6, iI0000O, i111i0i18);
/* 2294 */                                                          if (i6 == i111i0i18.I00000oIO) {
/* 2296 */                                                              iI0000O = ll0I0olIli.I0001Ioi1lo(bArr6, iI0001Ioi1lo12, i111i0i18);
/* 2300 */                                                              int i66 = i111i0i18.I00000oIO;
/* 2302 */                                                              if (i66 < 0) {
/* 2332 */                                                                  iilo0lOo110.I0001Ioi1lo("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
/* 2330 */                                                                  return 0;
                                                                        }
/* 2306 */                                                              if (i66 > bArr6.length - iI0000O) {
/* 2324 */                                                                  iilo0lOo110.I0001Ioi1lo("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
/* 2327 */                                                                  return 0;
                                                                        }
/* 2308 */                                                              if (i66 == 0) {
/* 2312 */                                                                  lioioo1oZzd.add(l1l1O1i.I00iiI);
                                                                        } else {
/* 2320 */                                                                  lioioo1oZzd.add(l1l1O1i.I000OOo1O(bArr6, iI0000O, i66));
/* 2285 */                                                                  iI0000O += i66;
                                                                        }
                                                                    } else {
/* 2338 */                                                              i6 = i6;
/* 2339 */                                                              bArr2 = bArr6;
/* 2340 */                                                              i29 = i32;
/* 2341 */                                                              i28 = i31;
/* 2342 */                                                              i111i0i12 = i111i0i18;
/* 3056 */                                                              if (iI0000O != i29) {
                                                                        }
                                                                    }
                                                                }
/* 2338 */                                                      i6 = i6;
/* 2339 */                                                      bArr2 = bArr6;
/* 2340 */                                                      i29 = i32;
/* 2341 */                                                      i28 = i31;
/* 2342 */                                                      i111i0i12 = i111i0i18;
/* 3056 */                                                      if (iI0000O != i29) {
                                                                }
                                                            } else {
/* 2357 */                                                      i6 = i6;
/* 2233 */                                                      bArr2 = bArr6;
/* 2234 */                                                      i29 = i32;
/* 2235 */                                                      i28 = i31;
/* 2236 */                                                      i111i0i12 = i111i0i18;
/* 3055 */                                                      iI0000O = i29;
/* 3056 */                                                      if (iI0000O != i29) {
                                                                }
                                                            }
                                                            break;
                                                        case 30:
                                                        case 44:
/* 2065 */                                                  bArr6 = bArr;
/* 2067 */                                                  i31 = i2;
/* 2069 */                                                  i111i0i18 = i111i0i1;
/* 2071 */                                                  i32 = i49;
/* 2074 */                                                  if (i51 == 2) {
/* 2076 */                                                      iI000O01llI0 = ll0I0olIli.I0000O(bArr6, i32, lioioo1oZzd, i111i0i18);
/* 2081 */                                                      i33 = i6;
                                                            } else if (i51 == 0) {
/* 2089 */                                                      i33 = i6;
/* 2090 */                                                      iI000O01llI0 = ll0I0olIli.I000O01llI0(i33, bArr6, i32, i31, lioioo1oZzd, i111i0i18);
/* 2094 */                                                      i31 = i31;
/* 2095 */                                                      i32 = i32;
/* 2096 */                                                      bArr6 = bArr6;
                                                            } else {
/* 2229 */                                                      i4 = i43;
/* 2231 */                                                      i23 = i7;
/* 2233 */                                                      bArr2 = bArr6;
/* 2234 */                                                      i29 = i32;
/* 2235 */                                                      i28 = i31;
/* 2236 */                                                      i111i0i12 = i111i0i18;
/* 3055 */                                                      iI0000O = i29;
/* 3056 */                                                      if (iI0000O != i29) {
                                                                }
                                                            }
/* 2097 */                                                  illiO0i illio0iI001i1lo1io = I001i1lo1io(i53);
/* 2101 */                                                  o0iOli o0ioli = lOI01O1oI.I00000oIO;
/* 2103 */                                                  if (illio0iI001i1lo1io != null) {
/* 2105 */                                                      int size2 = lioioo1oZzd.size();
/* 2109 */                                                      lOOlilii loolilii = null;
/* 2110 */                                                      i34 = iI000O01llI0;
/* 2112 */                                                      i4 = i43;
/* 2114 */                                                      int i67 = 0;
/* 2115 */                                                      int i68 = 0;
/* 2116 */                                                      while (i67 < size2) {
/* 2122 */                                                          lOOlilii loolilii2 = loolilii;
/* 2126 */                                                          Integer num = (Integer) lioioo1oZzd.get(i67);
/* 2128 */                                                          int i69 = i7;
/* 2130 */                                                          int iIntValue = num.intValue();
/* 2138 */                                                          if (illio0iI001i1lo1io.I00000oIO(iIntValue)) {
/* 2140 */                                                              if (i67 != i68) {
/* 2142 */                                                                  lioioo1oZzd.set(i68, num);
                                                                        }
/* 2145 */                                                              i68++;
/* 2147 */                                                              illio0i = illio0iI001i1lo1io;
/* 2149 */                                                              i35 = i67;
/* 2151 */                                                              loolilii = loolilii2;
                                                                    } else {
/* 2154 */                                                              if (loolilii2 == null) {
/* 2157 */                                                                  lIIOO0oi1o liioo0oi1o = (lIIOO0oi1o) obj6;
/* 2159 */                                                                  illio0i = illio0iI001i1lo1io;
/* 2161 */                                                                  lOOlilii looliliiI00000oOI = liioo0oi1o.zzc;
/* 2163 */                                                                  i35 = i67;
/* 2167 */                                                                  if (looliliiI00000oOI == lOOlilii.I0001Ioi1lo) {
/* 2169 */                                                                      looliliiI00000oOI = lOOlilii.I00000oOI();
/* 2173 */                                                                      liioo0oi1o.zzc = looliliiI00000oOI;
                                                                            }
/* 2175 */                                                                  loolilii = looliliiI00000oOI;
                                                                        } else {
/* 2177 */                                                                  illio0i = illio0iI001i1lo1io;
/* 2179 */                                                                  i35 = i67;
/* 2181 */                                                                  loolilii = loolilii2;
                                                                        }
/* 2190 */                                                              loolilii.I0000Il00O(i69 << 3, Long.valueOf(iIntValue));
                                                                    }
/* 2193 */                                                          i67 = i35 + 1;
/* 2195 */                                                          obj6 = obj;
/* 2197 */                                                          i7 = i69;
/* 2199 */                                                          illio0iI001i1lo1io = illio0i;
                                                                }
/* 2202 */                                                      i23 = i7;
/* 2204 */                                                      if (i68 != size2) {
/* 2210 */                                                          lioioo1oZzd.subList(i68, size2).clear();
                                                                }
                                                            } else {
/* 2214 */                                                      i34 = iI000O01llI0;
/* 2216 */                                                      i4 = i43;
/* 2218 */                                                      i23 = i7;
                                                            }
/* 2220 */                                                  i6 = i33;
/* 2221 */                                                  bArr2 = bArr6;
/* 2222 */                                                  i29 = i32;
/* 2223 */                                                  i28 = i31;
/* 2224 */                                                  i111i0i12 = i111i0i18;
/* 2225 */                                                  iI0000O = i34;
/* 3056 */                                                  if (iI0000O != i29) {
                                                            }
                                                            break;
                                                        case 33:
                                                        case 47:
/* 1961 */                                                  bArr7 = bArr;
/* 1963 */                                                  i36 = i2;
/* 1965 */                                                  i111i0i19 = i111i0i1;
/* 1967 */                                                  i37 = i49;
/* 1970 */                                                  if (i51 == 2) {
/* 1972 */                                                      lIIOOOli10 liioooli103 = (lIIOOOli10) lioioo1oZzd;
/* 1974 */                                                      iI0000O = ll0I0olIli.I0001Ioi1lo(bArr7, i37, i111i0i19);
/* 1980 */                                                      int i70 = i111i0i19.I00000oIO + iI0000O;
/* 1981 */                                                      while (iI0000O < i70) {
/* 1983 */                                                          iI0000O = ll0I0olIli.I0001Ioi1lo(bArr7, iI0000O, i111i0i19);
/* 1987 */                                                          int i71 = i111i0i19.I00000oIO;
/* 1999 */                                                          liioooli103.I0000oI00((-(i71 & 1)) ^ (i71 >>> 1));
/* 2002 */                                                          str2 = str2;
                                                                }
/* 2005 */                                                      String str3 = str2;
/* 2007 */                                                      if (iI0000O != i70) {
/* 2010 */                                                          iilo0lOo110.I0001Ioi1lo(str3);
/* 2013 */                                                          return 0;
                                                                }
/* 1890 */                                                      bArr2 = bArr7;
/* 1891 */                                                      i111i0i12 = i111i0i19;
/* 1892 */                                                      i4 = i43;
/* 1894 */                                                      i23 = i7;
/* 1897 */                                                      i29 = i37;
/* 1898 */                                                      i28 = i36;
/* 3056 */                                                      if (iI0000O != i29) {
                                                                }
                                                            } else {
/* 2016 */                                                      if (i51 == 0) {
/* 2018 */                                                          lIIOOOli10 liioooli104 = (lIIOOOli10) lioioo1oZzd;
/* 2020 */                                                          iI0001Ioi1lo5 = ll0I0olIli.I0001Ioi1lo(bArr7, i37, i111i0i19);
/* 2024 */                                                          int i72 = i111i0i19.I00000oIO;
/* 2034 */                                                          liioooli104.I0000oI00((i72 >>> 1) ^ (-(i72 & 1)));
/* 2037 */                                                          while (iI0001Ioi1lo5 < i36) {
/* 2039 */                                                              int iI0001Ioi1lo13 = ll0I0olIli.I0001Ioi1lo(bArr7, iI0001Ioi1lo5, i111i0i19);
/* 2045 */                                                              if (i6 == i111i0i19.I00000oIO) {
/* 2047 */                                                                  iI0001Ioi1lo5 = ll0I0olIli.I0001Ioi1lo(bArr7, iI0001Ioi1lo13, i111i0i19);
/* 2051 */                                                                  int i73 = i111i0i19.I00000oIO;
/* 2061 */                                                                  liioooli104.I0000oI00((i73 >>> 1) ^ (-(i73 & 1)));
                                                                        } else {
/* 1948 */                                                                  iI0000O = iI0001Ioi1lo5;
/* 1890 */                                                                  bArr2 = bArr7;
/* 1891 */                                                                  i111i0i12 = i111i0i19;
/* 1892 */                                                                  i4 = i43;
/* 1894 */                                                                  i23 = i7;
/* 1897 */                                                                  i29 = i37;
/* 1898 */                                                                  i28 = i36;
/* 3056 */                                                                  if (iI0000O != i29) {
                                                                            }
                                                                        }
                                                                    }
/* 1948 */                                                          iI0000O = iI0001Ioi1lo5;
/* 1890 */                                                          bArr2 = bArr7;
/* 1891 */                                                          i111i0i12 = i111i0i19;
/* 1892 */                                                          i4 = i43;
/* 1894 */                                                          i23 = i7;
/* 1897 */                                                          i29 = i37;
/* 1898 */                                                          i28 = i36;
/* 3056 */                                                          if (iI0000O != i29) {
                                                                    }
                                                                }
/* 1950 */                                                      bArr2 = bArr7;
/* 1951 */                                                      i111i0i12 = i111i0i19;
/* 1952 */                                                      i4 = i43;
/* 1954 */                                                      i23 = i7;
/* 1957 */                                                      i29 = i37;
/* 1958 */                                                      i28 = i36;
/* 3055 */                                                      iI0000O = i29;
/* 3056 */                                                      if (iI0000O != i29) {
                                                                }
                                                            }
                                                            break;
                                                        case 34:
                                                        case 48:
/* 1845 */                                                  bArr7 = bArr;
/* 1847 */                                                  i36 = i2;
/* 1849 */                                                  i111i0i19 = i111i0i1;
/* 1851 */                                                  i37 = i49;
/* 1855 */                                                  if (i51 == 2) {
/* 1857 */                                                      lIlIoll lilioll5 = (lIlIoll) lioioo1oZzd;
/* 1859 */                                                      iI0000O = ll0I0olIli.I0001Ioi1lo(bArr7, i37, i111i0i19);
/* 1865 */                                                      int i74 = i111i0i19.I00000oIO + iI0000O;
/* 1866 */                                                      while (iI0000O < i74) {
/* 1868 */                                                          iI0000O = ll0I0olIli.I000OOo1O(bArr7, iI0000O, i111i0i19);
/* 1880 */                                                          lilioll5.I0000oI00(ll0Iil.I00000oIO(i111i0i19.I00000oOI));
/* 1883 */                                                          i74 = i74;
                                                                }
/* 1888 */                                                      if (iI0000O != i74) {
/* 1901 */                                                          iilo0lOo110.I0001Ioi1lo("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
/* 1904 */                                                          return 0;
                                                                }
/* 1890 */                                                      bArr2 = bArr7;
/* 1891 */                                                      i111i0i12 = i111i0i19;
/* 1892 */                                                      i4 = i43;
/* 1894 */                                                      i23 = i7;
/* 1897 */                                                      i29 = i37;
/* 1898 */                                                      i28 = i36;
/* 3056 */                                                      if (iI0000O != i29) {
                                                                }
                                                            } else {
/* 1907 */                                                      if (i51 == 0) {
/* 1909 */                                                          lIlIoll lilioll6 = (lIlIoll) lioioo1oZzd;
/* 1911 */                                                          iI0001Ioi1lo5 = ll0I0olIli.I000OOo1O(bArr7, i37, i111i0i19);
/* 1921 */                                                          lilioll6.I0000oI00(ll0Iil.I00000oIO(i111i0i19.I00000oOI));
/* 1924 */                                                          while (iI0001Ioi1lo5 < i36) {
/* 1926 */                                                              int iI0001Ioi1lo14 = ll0I0olIli.I0001Ioi1lo(bArr7, iI0001Ioi1lo5, i111i0i19);
/* 1932 */                                                              if (i6 == i111i0i19.I00000oIO) {
/* 1934 */                                                                  iI0001Ioi1lo5 = ll0I0olIli.I000OOo1O(bArr7, iI0001Ioi1lo14, i111i0i19);
/* 1944 */                                                                  lilioll6.I0000oI00(ll0Iil.I00000oIO(i111i0i19.I00000oOI));
                                                                        } else {
/* 1948 */                                                                  iI0000O = iI0001Ioi1lo5;
/* 1890 */                                                                  bArr2 = bArr7;
/* 1891 */                                                                  i111i0i12 = i111i0i19;
/* 1892 */                                                                  i4 = i43;
/* 1894 */                                                                  i23 = i7;
/* 1897 */                                                                  i29 = i37;
/* 1898 */                                                                  i28 = i36;
/* 3056 */                                                                  if (iI0000O != i29) {
                                                                            }
                                                                        }
                                                                    }
/* 1948 */                                                          iI0000O = iI0001Ioi1lo5;
/* 1890 */                                                          bArr2 = bArr7;
/* 1891 */                                                          i111i0i12 = i111i0i19;
/* 1892 */                                                          i4 = i43;
/* 1894 */                                                          i23 = i7;
/* 1897 */                                                          i29 = i37;
/* 1898 */                                                          i28 = i36;
/* 3056 */                                                          if (iI0000O != i29) {
                                                                    }
                                                                }
/* 1950 */                                                      bArr2 = bArr7;
/* 1951 */                                                      i111i0i12 = i111i0i19;
/* 1952 */                                                      i4 = i43;
/* 1954 */                                                      i23 = i7;
/* 1957 */                                                      i29 = i37;
/* 1958 */                                                      i28 = i36;
/* 3055 */                                                      iI0000O = i29;
/* 3056 */                                                      if (iI0000O != i29) {
                                                                }
                                                            }
                                                            break;
                                                        default:
/* 1732 */                                                  if (i51 == 3) {
/* 1736 */                                                      int i75 = (i6 & (-8)) | 4;
/* 1738 */                                                      lO1liolI0IO lo1lioli0ioI001iOo1i0O = I001iOo1i0O(i53);
/* 1742 */                                                      Object objZze = lo1lioli0ioI001iOo1i0O.zze();
/* 1751 */                                                      int i76 = i49;
/* 1755 */                                                      int iI000OiO2 = ll0I0olIli.I000OiO(objZze, lo1lioli0ioI001iOo1i0O, bArr, i76, i2, i75, i111i0i1);
/* 1762 */                                                      int i77 = i75;
/* 1763 */                                                      i111i0I1 i111i0i112 = i111i0i1;
/* 1765 */                                                      lo1lioli0ioI001iOo1i0O.I00000oIO(objZze);
/* 1768 */                                                      i111i0i112.I0000Il00O = objZze;
/* 1770 */                                                      lioioo1oZzd.add(objZze);
/* 1773 */                                                      int i78 = iI000OiO2;
                                                                while (true) {
/* 1775 */                                                          i38 = i76;
/* 1777 */                                                          if (i78 < i2) {
/* 1779 */                                                              int iI0001Ioi1lo15 = ll0I0olIli.I0001Ioi1lo(bArr, i78, i111i0i112);
/* 1785 */                                                              if (i6 == i111i0i112.I00000oIO) {
/* 1787 */                                                                  int i79 = i77;
/* 1788 */                                                                  Object objZze2 = lo1lioli0ioI001iOo1i0O.zze();
/* 1794 */                                                                  int iI000OiO3 = ll0I0olIli.I000OiO(objZze2, lo1lioli0ioI001iOo1i0O, bArr, iI0001Ioi1lo15, i2, i79, i111i0i1);
/* 1801 */                                                                  i77 = i79;
/* 1802 */                                                                  i111i0i112 = i111i0i1;
/* 1804 */                                                                  lo1lioli0ioI001iOo1i0O.I00000oIO(objZze2);
/* 1807 */                                                                  i111i0i112.I0000Il00O = objZze2;
/* 1809 */                                                                  lioioo1oZzd.add(objZze2);
/* 1812 */                                                                  i78 = iI000OiO3;
/* 1813 */                                                                  i76 = i38;
                                                                        }
                                                                    }
                                                                }
/* 1817 */                                                      i28 = i2;
/* 1818 */                                                      i111i0i12 = i111i0i112;
/* 1819 */                                                      iI0000O = i78;
/* 1820 */                                                      i23 = i7;
/* 1822 */                                                      i29 = i38;
/* 1824 */                                                      bArr2 = bArr;
/* 1825 */                                                      i4 = i43;
/* 3056 */                                                      if (iI0000O != i29) {
                                                                }
                                                            } else {
/* 1830 */                                                      bArr2 = bArr;
/* 1832 */                                                      i28 = i2;
/* 1834 */                                                      i111i0i12 = i111i0i1;
/* 1836 */                                                      i23 = i7;
/* 1838 */                                                      i29 = i49;
/* 1840 */                                                      i4 = i43;
/* 3055 */                                                      iI0000O = i29;
/* 3056 */                                                      if (iI0000O != i29) {
                                                                }
                                                            }
                                                            break;
                                                    }
                                                } else {
/* 3104 */                                          bArr2 = bArr;
/* 3106 */                                          i111i0i12 = i111i0i1;
/* 3108 */                                          i4 = i43;
/* 3110 */                                          i23 = i7;
/* 3116 */                                          i24 = i49;
/* 3121 */                                          if (iI001IIilI0O != 50) {
/* 3185 */                                              obj2 = obj;
/* 3196 */                                              long j3 = iArr[i53 + 2] & 1048575;
                                                        switch (iI001IIilI0O) {
                                                            case 51:
/* 3701 */                                                      i25 = i24;
/* 3702 */                                                      i7 = i23;
/* 3705 */                                                      i26 = i53;
/* 3707 */                                                      if (i51 == 1) {
/* 3709 */                                                          iI0001Ioi1lo2 = i25 + 8;
/* 3723 */                                                          unsafe.putObject(obj2, j, Double.valueOf(Double.longBitsToDouble(ll0I0olIli.I000lI(i25, bArr2))));
/* 3726 */                                                          unsafe.putInt(obj2, j3, i7);
/* 3595 */                                                          iI000OiO = iI0001Ioi1lo2;
/* 3732 */                                                          if (iI000OiO == i25) {
/* 3734 */                                                              i39 = i2;
/* 3736 */                                                              bArr8 = bArr2;
/* 3737 */                                                              obj5 = obj2;
/* 3738 */                                                              i111i0i110 = i111i0i12;
/* 3739 */                                                              i41 = i7;
/* 3740 */                                                              i45 = i6;
/* 3742 */                                                              iArr2 = iArr;
/* 3744 */                                                              i40 = i8;
/* 3746 */                                                              i43 = i4;
/* 3748 */                                                              i42 = i26;
                                                                        break;
                                                                    } else {
/* 3752 */                                                              i5 = i3;
/* 3754 */                                                              i9 = iI000OiO;
/* 3755 */                                                              i42 = i26;
                                                                        break;
                                                                    }
                                                                }
/* 3731 */                                                      iI000OiO = i25;
/* 3732 */                                                      if (iI000OiO == i25) {
                                                                }
                                                            case 52:
/* 3672 */                                                      i25 = i24;
/* 3673 */                                                      i7 = i23;
/* 3676 */                                                      i26 = i53;
/* 3678 */                                                      if (i51 == 5) {
/* 3680 */                                                          iI0001Ioi1lo2 = i25 + 4;
/* 3694 */                                                          unsafe.putObject(obj2, j, Float.valueOf(Float.intBitsToFloat(ll0I0olIli.I00000oOI(i25, bArr2))));
/* 3697 */                                                          unsafe.putInt(obj2, j3, i7);
/* 3595 */                                                          iI000OiO = iI0001Ioi1lo2;
/* 3732 */                                                          if (iI000OiO == i25) {
                                                                    }
                                                                }
/* 3731 */                                                      iI000OiO = i25;
/* 3732 */                                                      if (iI000OiO == i25) {
                                                                }
                                                                break;
                                                            case 53:
                                                            case 54:
/* 3647 */                                                      i25 = i24;
/* 3648 */                                                      i7 = i23;
/* 3650 */                                                      i26 = i53;
/* 3652 */                                                      if (i51 == 0) {
/* 3654 */                                                          iI000OOo1O = ll0I0olIli.I000OOo1O(bArr2, i25, i111i0i12);
/* 3665 */                                                          unsafe.putObject(obj2, j, Long.valueOf(i111i0i12.I00000oOI));
/* 3668 */                                                          unsafe.putInt(obj2, j3, i7);
/* 3568 */                                                          iI000OiO = iI000OOo1O;
/* 3732 */                                                          if (iI000OiO == i25) {
                                                                    }
                                                                }
/* 3731 */                                                      iI000OiO = i25;
/* 3732 */                                                      if (iI000OiO == i25) {
                                                                }
                                                                break;
                                                            case 55:
                                                            case 62:
/* 3623 */                                                      i25 = i24;
/* 3624 */                                                      i7 = i23;
/* 3626 */                                                      i26 = i53;
/* 3628 */                                                      if (i51 == 0) {
/* 3630 */                                                          iI0001Ioi1lo2 = ll0I0olIli.I0001Ioi1lo(bArr2, i25, i111i0i12);
/* 3640 */                                                          unsafe.putObject(obj2, j, Integer.valueOf(i111i0i12.I00000oIO));
/* 3643 */                                                          unsafe.putInt(obj2, j3, i7);
/* 3595 */                                                          iI000OiO = iI0001Ioi1lo2;
/* 3732 */                                                          if (iI000OiO == i25) {
                                                                    }
                                                                }
/* 3731 */                                                      iI000OiO = i25;
/* 3732 */                                                      if (iI000OiO == i25) {
                                                                }
                                                                break;
                                                            case 56:
                                                            case 65:
/* 3598 */                                                      i25 = i24;
/* 3599 */                                                      i7 = i23;
/* 3602 */                                                      i26 = i53;
/* 3604 */                                                      if (i51 == 1) {
/* 3606 */                                                          iI0001Ioi1lo2 = i25 + 8;
/* 3616 */                                                          unsafe.putObject(obj2, j, Long.valueOf(ll0I0olIli.I000lI(i25, bArr2)));
/* 3619 */                                                          unsafe.putInt(obj2, j3, i7);
/* 3595 */                                                          iI000OiO = iI0001Ioi1lo2;
/* 3732 */                                                          if (iI000OiO == i25) {
                                                                    }
                                                                }
/* 3731 */                                                      iI000OiO = i25;
/* 3732 */                                                      if (iI000OiO == i25) {
                                                                }
                                                                break;
                                                            case 57:
                                                            case Barcode.FORMAT_EAN_8:
/* 3571 */                                                      i25 = i24;
/* 3572 */                                                      i7 = i23;
/* 3575 */                                                      i26 = i53;
/* 3577 */                                                      if (i51 == 5) {
/* 3579 */                                                          iI0001Ioi1lo2 = i25 + 4;
/* 3589 */                                                          unsafe.putObject(obj2, j, Integer.valueOf(ll0I0olIli.I00000oOI(i25, bArr2)));
/* 3592 */                                                          unsafe.putInt(obj2, j3, i7);
/* 3595 */                                                          iI000OiO = iI0001Ioi1lo2;
/* 3732 */                                                          if (iI000OiO == i25) {
                                                                    }
                                                                }
/* 3731 */                                                      iI000OiO = i25;
/* 3732 */                                                      if (iI000OiO == i25) {
                                                                }
                                                                break;
                                                            case 58:
/* 3535 */                                                      i25 = i24;
/* 3536 */                                                      i7 = i23;
/* 3538 */                                                      i26 = i53;
/* 3540 */                                                      if (i51 == 0) {
/* 3542 */                                                          iI000OOo1O = ll0I0olIli.I000OOo1O(bArr2, i25, i111i0i12);
/* 3562 */                                                          unsafe.putObject(obj2, j, Boolean.valueOf(i111i0i12.I00000oOI != 0));
/* 3565 */                                                          unsafe.putInt(obj2, j3, i7);
/* 3568 */                                                          iI000OiO = iI000OOo1O;
/* 3732 */                                                          if (iI000OiO == i25) {
                                                                    }
                                                                }
/* 3731 */                                                      iI000OiO = i25;
/* 3732 */                                                      if (iI000OiO == i25) {
                                                                }
                                                                break;
                                                            case 59:
/* 3472 */                                                      i25 = i24;
/* 3473 */                                                      i7 = i23;
/* 3476 */                                                      if (i51 == 2) {
/* 3478 */                                                          int iI0001Ioi1lo16 = ll0I0olIli.I0001Ioi1lo(bArr2, i25, i111i0i12);
/* 3482 */                                                          int i80 = i111i0i12.I00000oIO;
/* 3484 */                                                          if (i80 == 0) {
/* 3486 */                                                              unsafe.putObject(obj2, j, "");
/* 3489 */                                                              i26 = i53;
                                                                    } else {
/* 3496 */                                                              int i81 = iI0001Ioi1lo16 + i80;
/* 3498 */                                                              if ((i52 & 536870912) != 0 && !lOl0l1O01.I0000O(bArr2, iI0001Ioi1lo16, i81)) {
/* 3509 */                                                                  iilo0lOo110.I0001Ioi1lo("Protocol message had invalid UTF-8.");
/* 3512 */                                                                  return 0;
                                                                        }
/* 3517 */                                                              i26 = i53;
/* 3524 */                                                              unsafe.putObject(obj2, j, new String(bArr2, iI0001Ioi1lo16, i80, lIOOlo11OOii.I00000oIO));
/* 3527 */                                                              iI0001Ioi1lo16 = i81;
                                                                    }
/* 3529 */                                                          unsafe.putInt(obj2, j3, i7);
/* 3532 */                                                          iI000OiO = iI0001Ioi1lo16;
/* 3732 */                                                          if (iI000OiO == i25) {
                                                                    }
                                                                }
/* 3205 */                                                      i26 = i53;
/* 3731 */                                                      iI000OiO = i25;
/* 3732 */                                                      if (iI000OiO == i25) {
                                                                }
                                                                break;
                                                            case 60:
/* 3416 */                                                      i7 = i23;
/* 3419 */                                                      if (i51 == 2) {
/* 3421 */                                                          Object objI001lIiIIo1O = I001lIiIIo1O(obj2, i7, i53);
/* 3433 */                                                          int iI000iOII = ll0I0olIli.I000iOII(objI001lIiIIo1O, I001iOo1i0O(i53), bArr2, i24, i2, i111i0i12);
/* 3437 */                                                          i111i0i12 = i111i0i12;
/* 3448 */                                                          unsafe6.putObject(obj2, I001IO000(i53) & 1048575, objI001lIiIIo1O);
/* 3456 */                                                          lOiiillo.I000O01llI0(obj2, iArr[r17] & 1048575, i7);
/* 3459 */                                                          i25 = i24;
/* 3460 */                                                          i26 = i53;
/* 3462 */                                                          iI000OiO = iI000iOII;
/* 3732 */                                                          if (iI000OiO == i25) {
                                                                    }
                                                                } else {
/* 3466 */                                                          i111i0i12 = i111i0i12;
/* 3467 */                                                          i25 = i24;
/* 3205 */                                                          i26 = i53;
/* 3731 */                                                          iI000OiO = i25;
/* 3732 */                                                          if (iI000OiO == i25) {
                                                                    }
                                                                }
                                                                break;
                                                            case 61:
/* 3394 */                                                      i111i0i16 = i111i0i12;
/* 3395 */                                                      i27 = i24;
/* 3396 */                                                      i7 = i23;
/* 3399 */                                                      if (i51 == 2) {
/* 3401 */                                                          iI00000oIO = ll0I0olIli.I00000oIO(bArr2, i27, i111i0i16);
/* 3407 */                                                          unsafe.putObject(obj2, j, i111i0i16.I0000Il00O);
/* 3410 */                                                          unsafe.putInt(obj2, j3, i7);
/* 3391 */                                                          iI000OiO = iI00000oIO;
/* 3262 */                                                          i26 = i53;
/* 3264 */                                                          i25 = i27;
/* 3265 */                                                          i111i0i12 = i111i0i16;
/* 3732 */                                                          if (iI000OiO == i25) {
                                                                    }
                                                                }
/* 3300 */                                                      i26 = i53;
/* 3302 */                                                      i25 = i27;
/* 3303 */                                                      i111i0i12 = i111i0i16;
/* 3731 */                                                      iI000OiO = i25;
/* 3732 */                                                      if (iI000OiO == i25) {
                                                                }
                                                                break;
                                                            case 63:
/* 3339 */                                                      i111i0i16 = i111i0i12;
/* 3340 */                                                      i27 = i24;
/* 3341 */                                                      i7 = i23;
/* 3343 */                                                      i26 = i53;
/* 3345 */                                                      if (i51 == 0) {
/* 3347 */                                                          iI00000oIO = ll0I0olIli.I0001Ioi1lo(bArr2, i27, i111i0i16);
/* 3351 */                                                          int i82 = i111i0i16.I00000oIO;
/* 3353 */                                                          i53 = i26;
/* 3355 */                                                          illiO0i illio0iI001i1lo1io2 = I001i1lo1io(i53);
/* 3359 */                                                          if (illio0iI001i1lo1io2 == null || illio0iI001i1lo1io2.I00000oIO(i82)) {
/* 3385 */                                                              unsafe.putObject(obj2, j, Integer.valueOf(i82));
/* 3388 */                                                              unsafe.putInt(obj2, j3, i7);
                                                                    } else {
/* 3377 */                                                              I0010I0i(obj2).I0000Il00O(i6, Long.valueOf(i82));
                                                                    }
/* 3391 */                                                          iI000OiO = iI00000oIO;
/* 3262 */                                                          i26 = i53;
/* 3264 */                                                          i25 = i27;
/* 3265 */                                                          i111i0i12 = i111i0i16;
/* 3732 */                                                          if (iI000OiO == i25) {
                                                                    }
                                                                }
/* 3302 */                                                      i25 = i27;
/* 3303 */                                                      i111i0i12 = i111i0i16;
/* 3731 */                                                      iI000OiO = i25;
/* 3732 */                                                      if (iI000OiO == i25) {
                                                                }
                                                                break;
                                                            case 66:
/* 3306 */                                                      i111i0i16 = i111i0i12;
/* 3307 */                                                      i27 = i24;
/* 3308 */                                                      i7 = i23;
/* 3310 */                                                      i26 = i53;
/* 3312 */                                                      if (i51 == 0) {
/* 3314 */                                                          iI0001Ioi1lo3 = ll0I0olIli.I0001Ioi1lo(bArr2, i27, i111i0i16);
/* 3318 */                                                          int i83 = i111i0i16.I00000oIO;
/* 3332 */                                                          unsafe.putObject(obj2, j, Integer.valueOf((i83 >>> 1) ^ (-(i83 & 1))));
/* 3335 */                                                          unsafe.putInt(obj2, j3, i7);
/* 3298 */                                                          iI000OiO = iI0001Ioi1lo3;
/* 3264 */                                                          i25 = i27;
/* 3265 */                                                          i111i0i12 = i111i0i16;
/* 3732 */                                                          if (iI000OiO == i25) {
                                                                    }
                                                                }
/* 3302 */                                                      i25 = i27;
/* 3303 */                                                      i111i0i12 = i111i0i16;
/* 3731 */                                                      iI000OiO = i25;
/* 3732 */                                                      if (iI000OiO == i25) {
                                                                }
                                                                break;
                                                            case 67:
/* 3270 */                                                      i111i0i16 = i111i0i12;
/* 3271 */                                                      i27 = i24;
/* 3272 */                                                      i7 = i23;
/* 3274 */                                                      if (i51 == 0) {
/* 3276 */                                                          iI0001Ioi1lo3 = ll0I0olIli.I000OOo1O(bArr2, i27, i111i0i16);
/* 3280 */                                                          i26 = i53;
/* 3292 */                                                          unsafe.putObject(obj2, j, Long.valueOf(ll0Iil.I00000oIO(i111i0i16.I00000oOI)));
/* 3295 */                                                          unsafe.putInt(obj2, j3, i7);
/* 3298 */                                                          iI000OiO = iI0001Ioi1lo3;
/* 3264 */                                                          i25 = i27;
/* 3265 */                                                          i111i0i12 = i111i0i16;
/* 3732 */                                                          if (iI000OiO == i25) {
                                                                    }
                                                                }
/* 3300 */                                                      i26 = i53;
/* 3302 */                                                      i25 = i27;
/* 3303 */                                                      i111i0i12 = i111i0i16;
/* 3731 */                                                      iI000OiO = i25;
/* 3732 */                                                      if (iI000OiO == i25) {
                                                                }
                                                                break;
                                                            case 68:
/* 3211 */                                                      if (i51 == 3) {
/* 3219 */                                                          Object objI001lIiIIo1O2 = I001lIiIIo1O(obj2, i23, i53);
/* 3232 */                                                          int iI000OiO4 = ll0I0olIli.I000OiO(objI001lIiIIo1O2, I001iOo1i0O(i53), bArr2, i24, i2, (i6 & (-8)) | 4, i111i0i12);
/* 3236 */                                                          i27 = i24;
/* 3237 */                                                          i111i0i16 = i111i0i12;
/* 3238 */                                                          bArr2 = bArr2;
/* 3249 */                                                          unsafe6.putObject(obj2, I001IO000(i53) & 1048575, objI001lIiIIo1O2);
/* 3257 */                                                          lOiiillo.I000O01llI0(obj2, iArr[r17] & 1048575, i23);
/* 3260 */                                                          iI000OiO = iI000OiO4;
/* 3261 */                                                          i7 = i23;
/* 3262 */                                                          i26 = i53;
/* 3264 */                                                          i25 = i27;
/* 3265 */                                                          i111i0i12 = i111i0i16;
/* 3732 */                                                          if (iI000OiO == i25) {
                                                                    }
                                                                }
                                                                break;
                                                            default:
/* 3202 */                                                      i25 = i24;
/* 3203 */                                                      i7 = i23;
/* 3205 */                                                      i26 = i53;
/* 3731 */                                                      iI000OiO = i25;
/* 3732 */                                                      if (iI000OiO == i25) {
                                                                }
                                                                break;
                                                        }
                                                    } else {
/* 3124 */                                              if (i51 == 2) {
/* 3126 */                                                  int i84 = i53 / 3;
/* 3129 */                                                  Object obj7 = objArr[i84 + i84];
/* 3133 */                                                  Object object = unsafe.getObject(obj, j);
/* 3142 */                                                  if (!((lIo10Iolio) object).I00iOIl) {
/* 3144 */                                                      lIo10Iolio lio10iolio2 = lIo10Iolio.I00iiI;
/* 3150 */                                                      if (lio10iolio2.isEmpty()) {
/* 3154 */                                                          lio10iolio = new lIo10Iolio();
                                                                } else {
/* 3160 */                                                          lIo10Iolio lio10iolio3 = new lIo10Iolio(lio10iolio2);
/* 3164 */                                                          lio10iolio3.I00iOIl = true;
/* 3166 */                                                          lio10iolio = lio10iolio3;
                                                                }
/* 3167 */                                                      ll0i0l0.I00000oIO(lio10iolio, object);
/* 3170 */                                                      unsafe.putObject(obj, j, lio10iolio);
                                                            }
/* 3177 */                                                  throw IIlIOloOOO.I000l1(obj7);
                                                        }
/* 3178 */                                              obj2 = obj;
                                                    }
                                                }
                                            } else if (i51 == 2) {
/* 1621 */                                      lIOIoo1O lioioo1oZzd2 = (lIOIoo1O) unsafe.getObject(obj6, j);
/* 1628 */                                      if (!((l1Io0Iiio1o0) lioioo1oZzd2).I00iOIl) {
/* 1630 */                                          int size3 = lioioo1oZzd2.size();
/* 1642 */                                          lioioo1oZzd2 = lioioo1oZzd2.zzd(size3 != 0 ? size3 + size3 : 10);
/* 1646 */                                          unsafe.putObject(obj6, j, lioioo1oZzd2);
                                                }
/* 1649 */                                      lIOIoo1O lioioo1o7 = lioioo1oZzd2;
/* 1654 */                                      bArr8 = bArr;
/* 1656 */                                      i39 = i2;
/* 1659 */                                      iI000OiO = ll0I0olIli.I0000Il00O(I001iOo1i0O(i53), i6, bArr8, i49, i39, lioioo1o7, i111i0i111);
/* 1663 */                                      i111i0i110 = i111i0i1;
/* 1665 */                                      i42 = i53;
/* 1666 */                                      obj5 = obj6;
                                            } else {
/* 1669 */                                      bArr2 = bArr;
/* 1671 */                                      i4 = i43;
/* 1673 */                                      obj2 = obj6;
/* 1674 */                                      i23 = i7;
/* 1678 */                                      i111i0i12 = i111i0i1;
/* 1680 */                                      i24 = i49;
                                            }
                                        } else {
/* 156 */                                   int i85 = iArr2[iI00111O + 2];
/* 160 */                                   int i86 = 1 << (i85 >>> 20);
/* 162 */                                   int i87 = i85 & i46;
/* 164 */                                   if (i87 != i43) {
/* 166 */                                       int i88 = i46;
/* 168 */                                       i10 = i52;
/* 170 */                                       if (i43 != i88) {
/* 175 */                                           unsafe5.putInt(obj5, i43, i44);
/* 178 */                                           i88 = 1048575;
                                                }
/* 186 */                                       i11 = i87 == i88 ? 0 : unsafe5.getInt(obj5, i87);
/* 190 */                                       i12 = i87;
                                            } else {
/* 193 */                                       i10 = i52;
/* 195 */                                       i11 = i44;
/* 197 */                                       i12 = i43;
                                            }
                                            switch (iI001IIilI0O) {
                                                case 0:
/* 1499 */                                          bArr3 = bArr;
/* 1501 */                                          i111i0i13 = i111i0i1;
/* 1503 */                                          objArr = objArr2;
/* 1505 */                                          unsafe = unsafe5;
/* 1506 */                                          i6 = i45;
/* 1508 */                                          i13 = i49;
/* 1514 */                                          iArr = iArr2;
/* 1516 */                                          i14 = iI00111O;
/* 1517 */                                          i15 = i11;
/* 1520 */                                          i8 = i40;
/* 1522 */                                          if (i51 != 1) {
                                                        break;
                                                    } else {
/* 1543 */                                              lOiiillo.I0000Il00O.I00II0oii1o(obj5, j, Double.longBitsToDouble(ll0I0olIli.I000lI(i13, bArr3)));
/* 1546 */                                              i39 = i2;
/* 1548 */                                              i111i0i110 = i111i0i13;
/* 1524 */                                              iI000OiO = i13 + 8;
/* 1550 */                                              bArr8 = bArr3;
/* 1551 */                                              i42 = i14;
/* 1552 */                                              i41 = i7;
/* 1553 */                                              i45 = i6;
/* 1555 */                                              i43 = i12;
/* 1557 */                                              iArr2 = iArr;
/* 1559 */                                              i40 = i8;
/* 1561 */                                              objArr2 = objArr;
/* 1563 */                                              i46 = 1048575;
/* 1526 */                                              i44 = i15 | i86;
                                                    }
                                                case 1:
/* 1432 */                                          bArr3 = bArr;
/* 1434 */                                          i111i0i13 = i111i0i1;
/* 1436 */                                          objArr = objArr2;
/* 1438 */                                          unsafe = unsafe5;
/* 1439 */                                          i6 = i45;
/* 1441 */                                          i13 = i49;
/* 1446 */                                          iArr = iArr2;
/* 1448 */                                          i14 = iI00111O;
/* 1449 */                                          i15 = i11;
/* 1452 */                                          i8 = i40;
/* 1454 */                                          if (i51 != 5) {
                                                        break;
                                                    } else {
/* 1470 */                                              lOiiillo.I0000Il00O.I00IioO0OiOi(obj5, j, Float.intBitsToFloat(ll0I0olIli.I00000oOI(i13, bArr3)));
/* 1473 */                                              i39 = i2;
/* 1456 */                                              iI000OiO = i13 + 4;
/* 1476 */                                              i111i0i110 = i111i0i13;
/* 1477 */                                              bArr8 = bArr3;
/* 1478 */                                              i42 = i14;
/* 1479 */                                              i41 = i7;
/* 1480 */                                              i45 = i6;
/* 1482 */                                              i43 = i12;
/* 1484 */                                              iArr2 = iArr;
/* 1486 */                                              i40 = i8;
/* 1488 */                                              objArr2 = objArr;
/* 1490 */                                              i46 = 1048575;
/* 1458 */                                              i44 = i15 | i86;
                                                    }
                                                case 2:
                                                case 3:
/* 1384 */                                          bArr3 = bArr;
/* 1386 */                                          i111i0i13 = i111i0i1;
/* 1388 */                                          objArr = objArr2;
/* 1390 */                                          i13 = i49;
/* 1396 */                                          iArr = iArr2;
/* 1398 */                                          i8 = i40;
/* 1400 */                                          i14 = iI00111O;
/* 1401 */                                          unsafe2 = unsafe5;
/* 1402 */                                          i6 = i45;
/* 1404 */                                          if (i51 != 0) {
                                                        break;
                                                    } else {
/* 1406 */                                              i16 = i11 | i86;
/* 1408 */                                              int iI000OOo1O2 = ll0I0olIli.I000OOo1O(bArr3, i13, i111i0i13);
/* 1415 */                                              unsafe2.putLong(obj5, j, i111i0i13.I00000oOI);
/* 1418 */                                              i39 = i2;
/* 1420 */                                              i111i0i110 = i111i0i13;
/* 1421 */                                              bArr8 = bArr3;
/* 1422 */                                              iI000OiO = iI000OOo1O2;
/* 1423 */                                              i41 = i7;
/* 1424 */                                              i45 = i6;
/* 1426 */                                              i43 = i12;
/* 1428 */                                              i40 = i8;
/* 339 */                                               objArr2 = objArr;
/* 341 */                                               i46 = 1048575;
/* 344 */                                               i44 = i16;
/* 346 */                                               i42 = i14;
/* 347 */                                               iArr2 = iArr;
                                                    }
                                                case 4:
                                                case 11:
/* 1332 */                                          bArr3 = bArr;
/* 1334 */                                          i111i0i13 = i111i0i1;
/* 1336 */                                          objArr = objArr2;
/* 1338 */                                          i13 = i49;
/* 1344 */                                          iArr = iArr2;
/* 1346 */                                          i8 = i40;
/* 1348 */                                          i14 = iI00111O;
/* 1349 */                                          unsafe2 = unsafe5;
/* 1350 */                                          i6 = i45;
/* 1352 */                                          if (i51 == 0) {
/* 1356 */                                              iI000OiO = ll0I0olIli.I0001Ioi1lo(bArr3, i13, i111i0i13);
/* 1362 */                                              unsafe2.putInt(obj5, j, i111i0i13.I00000oIO);
/* 1365 */                                              int i89 = i12;
/* 1354 */                                              i44 = i11 | i86;
/* 1369 */                                              bArr8 = bArr3;
/* 1370 */                                              i43 = i89;
/* 1371 */                                              i39 = i2;
/* 1373 */                                              i111i0i110 = i111i0i13;
/* 1374 */                                              i42 = i14;
                                                        break;
                                                    }
                                                    break;
                                                case 5:
                                                case 14:
/* 1257 */                                          bArr3 = bArr;
/* 1259 */                                          Object obj8 = obj5;
/* 1260 */                                          objArr = objArr2;
/* 1263 */                                          i6 = i45;
/* 1265 */                                          i13 = i49;
/* 1273 */                                          iArr = iArr2;
/* 1275 */                                          i8 = i40;
/* 1277 */                                          i14 = iI00111O;
/* 1280 */                                          if (i51 != 1) {
/* 1324 */                                              i111i0i13 = i111i0i1;
/* 1325 */                                              unsafe2 = unsafe5;
/* 1326 */                                              obj5 = obj8;
                                                        break;
                                                    } else {
/* 1284 */                                              int i90 = i11 | i86;
/* 1293 */                                              obj5 = obj8;
/* 1295 */                                              unsafe5.putLong(obj5, j, ll0I0olIli.I000lI(i13, bArr3));
/* 1298 */                                              i39 = i2;
/* 1300 */                                              i111i0i110 = i111i0i1;
/* 1282 */                                              iI000OiO = i13 + 8;
/* 1302 */                                              bArr8 = bArr3;
/* 1303 */                                              i42 = i14;
/* 1304 */                                              i41 = i7;
/* 1305 */                                              i45 = i6;
/* 1307 */                                              i43 = i12;
/* 1309 */                                              iArr2 = iArr;
/* 1311 */                                              objArr2 = objArr;
/* 1313 */                                              i46 = 1048575;
/* 1316 */                                              i44 = i90;
/* 1318 */                                              i40 = i8;
                                                    }
                                                case 6:
                                                case 13:
/* 1206 */                                          bArr3 = bArr;
/* 1208 */                                          obj3 = obj5;
/* 1209 */                                          objArr = objArr2;
/* 1211 */                                          unsafe3 = unsafe5;
/* 1212 */                                          i6 = i45;
/* 1214 */                                          i13 = i49;
/* 1221 */                                          iArr = iArr2;
/* 1223 */                                          i8 = i40;
/* 1225 */                                          i14 = iI00111O;
/* 1226 */                                          i111i0i14 = i111i0i1;
/* 1228 */                                          if (i51 != 5) {
                                                        break;
                                                    } else {
/* 1232 */                                              i17 = i11 | i86;
/* 1238 */                                              unsafe3.putInt(obj3, j, ll0I0olIli.I00000oOI(i13, bArr3));
/* 1241 */                                              i111i0i110 = i111i0i14;
/* 1230 */                                              iI000OiO = i13 + 4;
/* 1243 */                                              obj5 = obj3;
/* 1244 */                                              bArr8 = bArr3;
/* 1245 */                                              i42 = i14;
/* 1246 */                                              i41 = i7;
/* 1247 */                                              i45 = i6;
/* 1249 */                                              i43 = i12;
/* 1251 */                                              iArr2 = iArr;
/* 1253 */                                              i40 = i8;
/* 522 */                                               objArr2 = objArr;
/* 524 */                                               i46 = 1048575;
/* 527 */                                               i44 = i17;
/* 529 */                                               i39 = i2;
                                                    }
                                                case 7:
/* 1139 */                                          bArr3 = bArr;
/* 1141 */                                          obj3 = obj5;
/* 1142 */                                          objArr = objArr2;
/* 1144 */                                          unsafe3 = unsafe5;
/* 1145 */                                          i6 = i45;
/* 1147 */                                          i13 = i49;
/* 1153 */                                          iArr = iArr2;
/* 1155 */                                          i8 = i40;
/* 1157 */                                          i14 = iI00111O;
/* 1158 */                                          i111i0i14 = i111i0i1;
/* 1160 */                                          if (i51 != 0) {
                                                        break;
                                                    } else {
/* 1162 */                                              int i91 = i11 | i86;
/* 1164 */                                              iI000OiO = ll0I0olIli.I000OOo1O(bArr3, i13, i111i0i14);
/* 1180 */                                              lOiiillo.I0000Il00O.I001iOo1i0O(obj3, j, i111i0i14.I00000oOI != 0);
/* 1183 */                                              i39 = i2;
/* 1185 */                                              i111i0i110 = i111i0i14;
/* 1186 */                                              bArr8 = bArr3;
/* 1187 */                                              i42 = i14;
/* 1188 */                                              i45 = i6;
/* 1190 */                                              i43 = i12;
/* 1192 */                                              iArr2 = iArr;
/* 1194 */                                              i40 = i8;
/* 1196 */                                              objArr2 = objArr;
/* 1198 */                                              i46 = 1048575;
/* 1201 */                                              i44 = i91;
/* 1203 */                                              obj5 = obj3;
/* 425 */                                               i41 = i7;
                                                    }
                                                case 8:
/* 653 */                                           bArr3 = bArr;
/* 655 */                                           obj3 = obj5;
/* 656 */                                           objArr = objArr2;
/* 658 */                                           unsafe3 = unsafe5;
/* 659 */                                           i6 = i45;
/* 661 */                                           i13 = i49;
/* 668 */                                           iArr = iArr2;
/* 670 */                                           i14 = iI00111O;
/* 671 */                                           i111i0i14 = i111i0i1;
/* 673 */                                           if (i51 != 2) {
/* 1134 */                                              i8 = i40;
                                                        break;
                                                    } else {
/* 677 */                                               if ((i10 & 536870912) != 0) {
/* 679 */                                                   iI0001Ioi1lo = ll0I0olIli.I0001Ioi1lo(bArr3, i13, i111i0i14);
/* 683 */                                                   int i92 = i111i0i14.I00000oIO;
/* 685 */                                                   if (i92 < 0) {
/* 1069 */                                                      iilo0lOo110.I0001Ioi1lo("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
/* 1068 */                                                      return 0;
                                                            }
/* 687 */                                                   int i93 = i11 | i86;
/* 689 */                                                   if (i92 == 0) {
/* 691 */                                                       i111i0i14.I0000Il00O = "";
/* 693 */                                                       i21 = i93;
/* 695 */                                                       i18 = i40;
                                                            } else {
/* 700 */                                                       int i94 = lOl0l1O01.I00000oIO;
/* 702 */                                                       int length = bArr3.length;
/* 710 */                                                       if ((iI0001Ioi1lo | i92 | ((length - iI0001Ioi1lo) - i92)) < 0) {
/* 1064 */                                                          OoOil11Ol1o.I000o00OoI0I("buffer length=%d, index=%d, size=%d", new Object[]{Integer.valueOf(length), Integer.valueOf(iI0001Ioi1lo), Integer.valueOf(i92)});
/* 1045 */                                                          return 0;
                                                                }
/* 712 */                                                       int i95 = iI0001Ioi1lo + i92;
/* 714 */                                                       char[] cArr = new char[i92];
/* 716 */                                                       int i96 = 0;
                                                                while (true) {
/* 717 */                                                           i20 = iI0001Ioi1lo;
/* 719 */                                                           if (iI0001Ioi1lo < i95 && (b2 = bArr3[i20]) >= 0) {
/* 730 */                                                               cArr[i96] = (char) b2;
/* 725 */                                                               iI0001Ioi1lo = i20 + 1;
/* 727 */                                                               i96++;
                                                                    }
                                                                }
/* 737 */                                                       int i97 = i20;
/* 739 */                                                       while (i97 < i95) {
/* 741 */                                                           int i98 = i97;
/* 743 */                                                           i97 = i98 + 1;
/* 745 */                                                           int i99 = i93;
/* 747 */                                                           byte b3 = bArr3[i98];
/* 749 */                                                           if (b3 < 0) {
/* 775 */                                                               int i100 = i40;
/* 779 */                                                               if (b3 >= -32) {
/* 833 */                                                                   if (b3 < -16) {
/* 837 */                                                                       if (i97 >= i95 - 1) {
/* 916 */                                                                           iilo0lOo110.I0001Ioi1lo("Protocol message had invalid UTF-8.");
/* 914 */                                                                           return 0;
                                                                                }
/* 839 */                                                                       int i101 = i96 + 1;
/* 841 */                                                                       int i102 = i98 + 2;
/* 843 */                                                                       byte b4 = bArr3[i97];
/* 845 */                                                                       int i103 = i98 + 3;
/* 847 */                                                                       byte b5 = bArr3[i102];
/* 853 */                                                                       if (ll0lIo.I00000oIO(b4)) {
                                                                                    break;
                                                                                } else {
/* 855 */                                                                           int i104 = i95;
/* 863 */                                                                           if (b3 == -32) {
/* 865 */                                                                               if (b4 < -96) {
                                                                                            break;
                                                                                        } else {
/* 867 */                                                                                   b3 = -32;
                                                                                        }
                                                                                    }
/* 870 */                                                                           if (b3 == -19) {
/* 872 */                                                                               if (b4 >= -96) {
                                                                                            break;
                                                                                        } else {
/* 874 */                                                                                   b3 = -19;
                                                                                        }
                                                                                    }
/* 879 */                                                                           if (ll0lIo.I00000oIO(b5)) {
                                                                                        break;
                                                                                    } else {
/* 894 */                                                                               cArr[i96] = (char) (((b4 & 63) << 6) | ((b3 & 15) << 12) | (b5 & 63));
/* 896 */                                                                               i93 = i99;
/* 898 */                                                                               i97 = i103;
/* 900 */                                                                               i40 = i100;
/* 902 */                                                                               i95 = i104;
/* 904 */                                                                               i96 = i101;
                                                                                    }
                                                                                }
                                                                            } else {
/* 920 */                                                                       int i105 = i95;
/* 924 */                                                                       if (i97 >= i105 - 2) {
/* 1021 */                                                                          iilo0lOo110.I0001Ioi1lo("Protocol message had invalid UTF-8.");
/* 1020 */                                                                          return 0;
                                                                                }
/* 928 */                                                                       byte b6 = bArr3[i97];
/* 930 */                                                                       int i106 = i98 + 3;
/* 932 */                                                                       byte b7 = bArr3[i98 + 2];
/* 934 */                                                                       int i107 = i98 + 4;
/* 936 */                                                                       byte b8 = bArr3[i106];
/* 942 */                                                                       if (ll0lIo.I00000oIO(b6)) {
                                                                                    break;
                                                                                } else if ((((b6 + 112) + (b3 << 28)) >> 30) != 0 || ll0lIo.I00000oIO(b7) || ll0lIo.I00000oIO(b8)) {
                                                                                    break;
                                                                                } else {
/* 982 */                                                                           int i108 = ((b6 & 63) << 12) | ((b3 & 7) << 18) | ((b7 & 63) << 6) | (b8 & 63);
/* 990 */                                                                           cArr[i96] = (char) ((i108 >>> 10) + 55232);
/* 1001 */                                                                          cArr[i96 + 1] = (char) ((i108 & 1023) + 56320);
/* 1003 */                                                                          i96 += 2;
/* 1005 */                                                                          i93 = i99;
/* 1007 */                                                                          i97 = i107;
/* 1009 */                                                                          i40 = i100;
/* 1011 */                                                                          i95 = i105;
                                                                                }
                                                                            }
                                                                        } else {
/* 781 */                                                                   if (i97 >= i95) {
/* 827 */                                                                       iilo0lOo110.I0001Ioi1lo("Protocol message had invalid UTF-8.");
/* 825 */                                                                       return 0;
                                                                            }
/* 783 */                                                                   int i109 = i96 + 1;
/* 785 */                                                                   int i110 = i98 + 2;
/* 787 */                                                                   byte b9 = bArr3[i97];
/* 793 */                                                                   if (b3 < -62 || ll0lIo.I00000oIO(b9)) {
                                                                                break;
                                                                            } else {
/* 809 */                                                                       cArr[i96] = (char) (((b3 & 31) << 6) | (b9 & 63));
/* 811 */                                                                       i93 = i99;
/* 813 */                                                                       i96 = i109;
/* 814 */                                                                       i97 = i110;
/* 816 */                                                                       i40 = i100;
                                                                            }
                                                                        }
                                                                    } else {
/* 751 */                                                               int i111 = i96 + 1;
/* 754 */                                                               cArr[i96] = (char) b3;
                                                                        while (true) {
/* 756 */                                                                   i96 = i111;
/* 758 */                                                                   if (i97 < i95 && (b = bArr3[i97]) >= 0) {
/* 764 */                                                                       i97++;
/* 766 */                                                                       i111 = i96 + 1;
/* 769 */                                                                       cArr[i96] = (char) b;
                                                                            }
                                                                        }
/* 772 */                                                               i93 = i99;
                                                                    }
                                                                }
/* 1025 */                                                      int i112 = i95;
/* 1027 */                                                      i21 = i93;
/* 1029 */                                                      i18 = i40;
/* 1034 */                                                      str = new String(cArr, 0, i96);
/* 1037 */                                                      i111i0i14.I0000Il00O = str;
/* 1039 */                                                      iI0001Ioi1lo = i112;
                                                            }
/* 1041 */                                                  i19 = i21;
                                                        } else {
/* 1073 */                                                  i18 = i40;
/* 1075 */                                                  iI0001Ioi1lo = ll0I0olIli.I0001Ioi1lo(bArr3, i13, i111i0i14);
/* 1079 */                                                  int i113 = i111i0i14.I00000oIO;
/* 1081 */                                                  if (i113 < 0) {
/* 1128 */                                                      iilo0lOo110.I0001Ioi1lo("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
/* 1131 */                                                      return 0;
                                                            }
/* 1083 */                                                  i19 = i11 | i86;
/* 1085 */                                                  if (i113 == 0) {
/* 1087 */                                                      i111i0i14.I0000Il00O = "";
                                                            } else {
/* 1094 */                                                      str = new String(bArr3, iI0001Ioi1lo, i113, lIOOlo11OOii.I00000oIO);
/* 1097 */                                                      i111i0i14.I0000Il00O = str;
/* 1099 */                                                      iI0001Ioi1lo += i113;
                                                            }
                                                        }
/* 1043 */                                              iI000OiO = iI0001Ioi1lo;
/* 1101 */                                              unsafe3.putObject(obj3, j, str);
/* 1104 */                                              i39 = i2;
/* 1106 */                                              obj5 = obj3;
/* 1107 */                                              bArr8 = bArr3;
/* 1108 */                                              i42 = i14;
/* 1109 */                                              i41 = i7;
/* 1110 */                                              i45 = i6;
/* 1112 */                                              i43 = i12;
/* 1114 */                                              iArr2 = iArr;
/* 1116 */                                              i40 = i18;
/* 1118 */                                              objArr2 = objArr;
/* 1120 */                                              i46 = 1048575;
/* 1123 */                                              i44 = i19;
/* 1125 */                                              i111i0i110 = i111i0i14;
                                                    }
                                                    break;
                                                case 9:
/* 572 */                                           objArr = objArr2;
/* 574 */                                           i13 = i49;
/* 581 */                                           iArr = iArr2;
/* 583 */                                           i14 = iI00111O;
/* 584 */                                           Object obj9 = obj5;
/* 586 */                                           i6 = i45;
/* 588 */                                           if (i51 != 2) {
/* 642 */                                               obj3 = obj9;
/* 643 */                                               i111i0i14 = i111i0i1;
/* 644 */                                               bArr3 = bArr;
/* 646 */                                               unsafe = unsafe5;
/* 647 */                                               i8 = i40;
                                                        break;
                                                    } else {
/* 590 */                                               i16 = i11 | i86;
/* 593 */                                               Object objI001l0I00 = I001l0I00(i14, obj9);
/* 607 */                                               iI000OiO = ll0I0olIli.I000iOII(objI001l0I00, I001iOo1i0O(i14), bArr, i13, i2, i111i0i1);
/* 624 */                                               unsafe6.putObject(obj, I001IO000(i14) & 1048575, objI001l0I00);
/* 627 */                                               I000iOII(i14, obj);
/* 630 */                                               i39 = i2;
/* 632 */                                               i111i0i110 = i111i0i1;
/* 633 */                                               obj5 = obj;
/* 634 */                                               bArr8 = bArr;
/* 635 */                                               i41 = i7;
/* 636 */                                               i45 = i6;
/* 337 */                                               i43 = i12;
/* 339 */                                               objArr2 = objArr;
/* 341 */                                               i46 = 1048575;
/* 344 */                                               i44 = i16;
/* 346 */                                               i42 = i14;
/* 347 */                                               iArr2 = iArr;
                                                    }
                                                case 10:
/* 533 */                                           bArr4 = bArr;
/* 535 */                                           i111i0i15 = i111i0i1;
/* 537 */                                           objArr = objArr2;
/* 539 */                                           i13 = i49;
/* 546 */                                           iArr = iArr2;
/* 548 */                                           i14 = iI00111O;
/* 549 */                                           obj4 = obj5;
/* 550 */                                           unsafe4 = unsafe5;
/* 551 */                                           i6 = i45;
/* 553 */                                           if (i51 != 2) {
                                                        break;
                                                    } else {
/* 555 */                                               i22 = i11 | i86;
/* 557 */                                               iI000OiO = ll0I0olIli.I00000oIO(bArr4, i13, i111i0i15);
/* 563 */                                               unsafe4.putObject(obj4, j, i111i0i15.I0000Il00O);
/* 406 */                                               i39 = i2;
/* 408 */                                               obj5 = obj4;
/* 409 */                                               i111i0i110 = i111i0i15;
/* 410 */                                               i42 = i14;
/* 411 */                                               i45 = i6;
/* 413 */                                               i43 = i12;
/* 415 */                                               iArr2 = iArr;
/* 417 */                                               objArr2 = objArr;
/* 419 */                                               i46 = 1048575;
/* 422 */                                               i44 = i22;
/* 424 */                                               bArr8 = bArr4;
/* 425 */                                               i41 = i7;
                                                    }
                                                case 12:
/* 428 */                                           bArr4 = bArr;
/* 430 */                                           i111i0i15 = i111i0i1;
/* 432 */                                           objArr = objArr2;
/* 434 */                                           i13 = i49;
/* 440 */                                           iArr = iArr2;
/* 442 */                                           i14 = iI00111O;
/* 443 */                                           obj4 = obj5;
/* 444 */                                           unsafe4 = unsafe5;
/* 445 */                                           i6 = i45;
/* 447 */                                           if (i51 != 0) {
                                                        break;
                                                    } else {
/* 449 */                                               iI000OiO = ll0I0olIli.I0001Ioi1lo(bArr4, i13, i111i0i15);
/* 453 */                                               int i114 = i111i0i15.I00000oIO;
/* 455 */                                               illiO0i illio0iI001i1lo1io3 = I001i1lo1io(i14);
/* 463 */                                               if ((i10 & Integer.MIN_VALUE) != 0 && illio0iI001i1lo1io3 != null && !illio0iI001i1lo1io3.I00000oIO(i114)) {
/* 483 */                                                   I0010I0i(obj4).I0000Il00O(i6, Long.valueOf(i114));
/* 486 */                                                   int i115 = i12;
/* 488 */                                                   i44 = i11;
/* 490 */                                                   i111i0i110 = i111i0i15;
/* 491 */                                                   i43 = i115;
/* 492 */                                                   i39 = i2;
/* 494 */                                                   obj5 = obj4;
/* 495 */                                                   bArr8 = bArr4;
/* 496 */                                                   i42 = i14;
/* 497 */                                                   i41 = i7;
/* 498 */                                                   i45 = i6;
/* 500 */                                                   iArr2 = iArr;
                                                            break;
                                                        } else {
/* 506 */                                                   i17 = i11 | i86;
/* 508 */                                                   unsafe4.putInt(obj4, j, i114);
/* 511 */                                                   obj5 = obj4;
/* 512 */                                                   bArr8 = bArr4;
/* 513 */                                                   i111i0i110 = i111i0i15;
/* 514 */                                                   i42 = i14;
/* 515 */                                                   i41 = i7;
/* 516 */                                                   i45 = i6;
/* 518 */                                                   i43 = i12;
/* 520 */                                                   iArr2 = iArr;
/* 522 */                                                   objArr2 = objArr;
/* 524 */                                                   i46 = 1048575;
/* 527 */                                                   i44 = i17;
/* 529 */                                                   i39 = i2;
                                                        }
                                                    }
                                                case 15:
/* 368 */                                           bArr4 = bArr;
/* 370 */                                           i111i0i15 = i111i0i1;
/* 372 */                                           objArr = objArr2;
/* 374 */                                           i13 = i49;
/* 380 */                                           iArr = iArr2;
/* 382 */                                           i14 = iI00111O;
/* 383 */                                           obj4 = obj5;
/* 384 */                                           unsafe4 = unsafe5;
/* 385 */                                           i6 = i45;
/* 387 */                                           if (i51 != 0) {
                                                        break;
                                                    } else {
/* 389 */                                               i22 = i11 | i86;
/* 391 */                                               iI000OiO = ll0I0olIli.I0001Ioi1lo(bArr4, i13, i111i0i15);
/* 395 */                                               int i116 = i111i0i15.I00000oIO;
/* 403 */                                               unsafe4.putInt(obj4, j, (i116 >>> 1) ^ (-(i116 & 1)));
/* 406 */                                               i39 = i2;
/* 408 */                                               obj5 = obj4;
/* 409 */                                               i111i0i110 = i111i0i15;
/* 410 */                                               i42 = i14;
/* 411 */                                               i45 = i6;
/* 413 */                                               i43 = i12;
/* 415 */                                               iArr2 = iArr;
/* 417 */                                               objArr2 = objArr;
/* 419 */                                               i46 = 1048575;
/* 422 */                                               i44 = i22;
/* 424 */                                               bArr8 = bArr4;
/* 425 */                                               i41 = i7;
                                                    }
                                                case 16:
/* 294 */                                           bArr4 = bArr;
/* 296 */                                           i111i0i15 = i111i0i1;
/* 298 */                                           objArr = objArr2;
/* 300 */                                           i13 = i49;
/* 304 */                                           if (i51 != 0) {
/* 353 */                                               iArr = iArr2;
/* 355 */                                               i14 = iI00111O;
/* 356 */                                               obj4 = obj5;
/* 357 */                                               unsafe4 = unsafe5;
/* 358 */                                               i6 = i45;
                                                        break;
                                                    } else {
/* 306 */                                               i16 = i11 | i86;
/* 308 */                                               int iI000OOo1O3 = ll0I0olIli.I000OOo1O(bArr4, i13, i111i0i15);
/* 322 */                                               iArr = iArr2;
/* 324 */                                               i14 = iI00111O;
/* 328 */                                               unsafe5.putLong(obj5, j, ll0Iil.I00000oIO(i111i0i15.I00000oOI));
/* 331 */                                               i39 = i2;
/* 333 */                                               bArr8 = bArr4;
/* 334 */                                               i111i0i110 = i111i0i15;
/* 335 */                                               iI000OiO = iI000OOo1O3;
/* 336 */                                               i41 = i7;
/* 337 */                                               i43 = i12;
/* 339 */                                               objArr2 = objArr;
/* 341 */                                               i46 = 1048575;
/* 344 */                                               i44 = i16;
/* 346 */                                               i42 = i14;
/* 347 */                                               iArr2 = iArr;
                                                    }
                                                default:
/* 204 */                                           if (i51 != 3) {
/* 272 */                                               objArr = objArr2;
/* 274 */                                               bArr3 = bArr;
/* 276 */                                               i111i0i13 = i111i0i1;
/* 278 */                                               i8 = i40;
/* 280 */                                               unsafe = unsafe5;
/* 281 */                                               i6 = i45;
/* 283 */                                               i13 = i49;
/* 287 */                                               Object obj10 = obj5;
/* 288 */                                               iArr = iArr2;
/* 290 */                                               i14 = iI00111O;
                                                        break;
                                                    } else {
/* 206 */                                               int i117 = i11 | i86;
/* 208 */                                               Object objI001l0I002 = I001l0I00(iI00111O, obj5);
/* 234 */                                               iI000OiO = ll0I0olIli.I000OiO(objI001l0I002, I001iOo1i0O(iI00111O), bArr, i49, i2, (i7 << 3) | 4, i111i0i1);
/* 249 */                                               unsafe6.putObject(obj5, I001IO000(iI00111O) & 1048575, objI001l0I002);
/* 252 */                                               I000iOII(iI00111O, obj5);
/* 255 */                                               i39 = i2;
/* 257 */                                               i42 = iI00111O;
/* 258 */                                               bArr8 = bArr;
/* 259 */                                               i111i0i110 = i111i0i1;
/* 260 */                                               i41 = i7;
/* 261 */                                               i43 = i12;
/* 263 */                                               objArr2 = objArr2;
/* 265 */                                               i46 = 1048575;
/* 268 */                                               i44 = i117;
                                                    }
                                            }
                                        }
                                    } else {
/* 97 */                                i4 = i43;
/* 99 */                                objArr = objArr2;
/* 101 */                               iArr = iArr2;
/* 103 */                               i8 = i40;
/* 105 */                               unsafe = unsafe5;
/* 106 */                               i6 = i45;
/* 108 */                               i42 = 0;
/* 109 */                               i5 = i3;
/* 111 */                               obj2 = obj5;
/* 112 */                               bArr2 = bArr8;
/* 113 */                               i9 = i49;
/* 114 */                               i111i0i12 = i111i0i110;
                                    }
                                } else {
/* 80 */                            if (i7 >= i50 && i7 <= i40) {
/* 85 */                                iI00111O = I00111O(i7, 0);
                                    }
/* 93 */                            if (iI00111O == -1) {
                                    }
                                }
                            } else {
/* 3844 */                      i4 = i43;
/* 3846 */                      objArr = objArr2;
/* 3848 */                      iArr = iArr2;
/* 3850 */                      unsafe = unsafe5;
/* 3851 */                      i5 = i3;
/* 3853 */                      obj2 = obj5;
/* 3854 */                      i6 = i45;
                            }
                        }
/* 3088 */              i7 = i23;
/* 3757 */              if (i6 != i5 || i5 == 0) {
/* 3775 */                  if (this.I0001Ioi1lo) {
/* 3779 */                      lI0011loIOIo li0011loioio = (lI0011loIOIo) i111i0i12.I0000oI00;
/* 3781 */                      lI0011loIOIo li0011loioio2 = lI0011loIOIo.I00000oOI;
/* 3783 */                      lO1Ilo0lloiO lo1ilo0lloio = lO1Ilo0lloiO.I0000Il00O;
/* 3787 */                      if (li0011loioio != lI0011loIOIo.I00000oOI) {
/* 3791 */                          li0011loioio.I00000oIO(this.I0000oI00, i7);
/* 3803 */                          iI0000oI00 = ll0I0olIli.I0000oI00(i6, bArr2, i9, i2, I0010I0i(obj2), i111i0i12);
/* 3807 */                          i39 = i2;
                                } else {
/* 3822 */                          iI0000oI00 = ll0I0olIli.I0000oI00(i6, bArr, i9, i2, I0010I0i(obj2), i111i0i1);
/* 3826 */                          i39 = i2;
                                }
/* 3809 */                      iI000OiO = iI0000oI00;
/* 3828 */                      bArr8 = bArr;
/* 3830 */                      i111i0i110 = i111i0i1;
/* 3832 */                      obj5 = obj2;
/* 3833 */                      i41 = i7;
/* 3834 */                      i45 = i6;
/* 3836 */                      iArr2 = iArr;
/* 3838 */                      i40 = i8;
/* 3840 */                      i43 = i4;
                            }
/* 502 */                   objArr2 = objArr;
                        } else {
/* 3761 */                  i39 = i2;
/* 3763 */                  iI000OiO = i9;
                        }
                    }
/* 3764 */          int i118 = i44;
/* 3766 */          int i119 = i4;
/* 3857 */          if (i119 != 1048575) {
/* 3860 */              unsafe.putInt(obj2, i119, i118);
                    }
/* 3867 */          for (int i120 = this.I000O01llI0; i120 < this.I000OOo1O; i120++) {
/* 3871 */              int i121 = this.I000II[i120];
/* 3873 */              int i122 = iArr[i121];
/* 3885 */              Object objI000II = lOiiillo.I000II(obj2, I001IO000(i121) & 1048575);
/* 3889 */              if (objI000II != null && I001i1lo1io(i121) != null) {
/* 3904 */                  int i123 = i121 / 3;
/* 3912 */                  throw IIlIOloOOO.I000l1(objArr[i123 + i123]);
                        }
                    }
/* 3915 */          if (i5 == 0) {
/* 3917 */              if (iI000OiO != i39) {
/* 3920 */                  iilo0lOo110.I0001Ioi1lo("Failed to parse the message.");
/* 3923 */                  return 0;
                        }
                    } else if (iI000OiO > i39 || i6 != i5) {
/* 3933 */              iilo0lOo110.I0001Ioi1lo("Failed to parse the message.");
/* 3926 */              return 0;
                    }
/* 3932 */          return iI000OiO;
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

                public final illiO0i I001i1lo1io(int i) {
/* 1 */             int i2 = i / 3;
/* 10 */            return (illiO0i) this.I00000oOI[i2 + i2 + 1];
                }

                public final lO1liolI0IO I001iOo1i0O(int i) {
/* 1 */             Object[] objArr = this.I00000oOI;
/* 3 */             int i2 = i / 3;
/* 5 */             int i3 = i2 + i2;
/* 8 */             lO1liolI0IO lo1lioli0io = (lO1liolI0IO) objArr[i3];
/* 10 */            if (lo1lioli0io != null) {
/* 12 */                return lo1lioli0io;
                    }
/* 21 */            lO1liolI0IO lo1lioli0ioI00000oIO = lO1Ilo0lloiO.I0000Il00O.I00000oIO((Class) objArr[i3 + 1]);
/* 25 */            objArr[i3] = lo1lioli0ioI00000oIO;
/* 29 */            return lo1lioli0ioI00000oIO;
                }

                public final Object I001l0I00(int i, Object obj) {
/* 1 */             lO1liolI0IO lo1lioli0ioI001iOo1i0O = I001iOo1i0O(i);
/* 12 */            int iI001IO000 = I001IO000(i) & 1048575;
/* 17 */            if (!I000lI(obj, i)) {
/* 19 */                return lo1lioli0ioI001iOo1i0O.zze();
                    }
/* 27 */            Object object = I000lI.getObject(obj, iI001IO000);
/* 35 */            if (I000oI1ioi(object)) {
/* 37 */                return object;
                    }
/* 38 */            Object objZze = lo1lioli0ioI001iOo1i0O.zze();
/* 42 */            if (object != null) {
/* 44 */                lo1lioli0ioI001iOo1i0O.I00000oOI(objZze, object);
                    }
/* 106 */           return objZze;
                }

                public final Object I001lIiIIo1O(Object obj, int i, int i2) {
/* 1 */             lO1liolI0IO lo1lioli0ioI001iOo1i0O = I001iOo1i0O(i2);
/* 9 */             if (!I00100l0(obj, i, i2)) {
/* 11 */                return lo1lioli0ioI001iOo1i0O.zze();
                    }
/* 27 */            Object object = I000lI.getObject(obj, I001IO000(i2) & 1048575);
/* 35 */            if (I000oI1ioi(object)) {
/* 37 */                return object;
                    }
/* 38 */            Object objZze = lo1lioli0ioI001iOo1i0O.zze();
/* 42 */            if (object != null) {
/* 44 */                lo1lioli0ioI001iOo1i0O.I00000oOI(objZze, object);
                    }
/* 98 */            return objZze;
                }

                @Override
                public final Object zze() {
/* 11 */            return (lIIOO0oi1o) ((lIIOO0oi1o) this.I0000oI00).I000OiO(4, null);
                }
            }

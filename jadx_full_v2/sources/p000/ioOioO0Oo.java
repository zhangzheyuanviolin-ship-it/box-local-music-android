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
            
            public final class ioOioO0Oo implements iooIIllo {
                public static final int[] I000l1 = new int[0];
                public static final Unsafe I000lI;
                public int[] I00000oIO;
                public Object[] I00000oOI;
                public int I0000Il00O;
                public int I0000O;
                public il00ioIl I0000oI00;
                public boolean I0001Ioi1lo;
                public int[] I000II;
                public int I000O01llI0;
                public int I000OOo1O;
                public i1O01oOIoI0I I000OiO;
                public iOl0lOIi11 I000iOII;

                static {
                    Unsafe unsafe;
                    try {
/* 17 */                unsafe = (Unsafe) AccessController.doPrivileged(new OoiioO0o(18));
                    } catch (Throwable unused) {
/* 20 */                unsafe = null;
                    }
/* 21 */            I000lI = unsafe;
                }

                public static boolean I000oI1ioi(Object obj) {
/* 1 */             if (obj == null) {
/* 3 */                 return false;
                    }
/* 7 */             if (obj instanceof illOil) {
/* 11 */                return ((illOil) obj).I000lI();
                    }
/* 16 */            return true;
                }

                public static l01IO0I1I I0010I0i(Object obj) {
/* 1 */             illOil illoil = (illOil) obj;
/* 3 */             l01IO0I1I l01io0i1i = illoil.zzc;
/* 7 */             if (l01io0i1i != l01IO0I1I.I0001Ioi1lo) {
/* 29 */                return l01io0i1i;
                    }
/* 9 */             l01IO0I1I l01io0i1iI00000oOI = l01IO0I1I.I00000oOI();
/* 13 */            illoil.zzc = l01io0i1iI00000oOI;
/* 29 */            return l01io0i1iI00000oOI;
                }

                public static int I0010o(long j, Object obj) {
/* 7 */             return ((Integer) l0II0IlI.I000II(obj, j)).intValue();
                }

                public static int I001IIilI0O(int i) {
/* 3 */             return (i >>> 20) & 255;
                }

                public static long I001i1O0Ol(long j, Object obj) {
/* 7 */             return ((Long) l0II0IlI.I000II(obj, j)).longValue();
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
/* 14 */                if (obj instanceof illOil) {
/* 17 */                    illOil illoil = (illOil) obj;
/* 19 */                    illoil.I000iOII();
/* 22 */                    illoil.zza = 0;
/* 24 */                    illoil.I000OOo1O();
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
/* 83 */                                    il0II1iiI il0ii1iii = (il0II1iiI) ((iloOl100) l0II0IlI.I000II(obj, j));
/* 87 */                                    if (il0ii1iii.I00iOIl) {
/* 89 */                                        il0ii1iii.I00iOIl = false;
                                                break;
                                            } else {
                                                break;
                                            }
                                        case 50:
/* 62 */                                    Object object = unsafe.getObject(obj, j);
/* 66 */                                    if (object != null) {
/* 71 */                                        ((ioI1oI1I) object).I00iOIl = false;
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
/* 140 */               l01IO0I1I l01io0i1i = ((illOil) obj).zzc;
/* 144 */               if (l01io0i1i.I0000oI00) {
/* 146 */                   l01io0i1i.I0000oI00 = false;
                        }
/* 150 */               if (this.I0001Ioi1lo) {
/* 154 */                   this.I000iOII.getClass();
/* 161 */                   ((ill0o1o) obj).zzb.I0000O();
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
/* 478 */                           Ooil0oIOI0l0 ooil0oIOI0l0 = l0II0IlI.I0000Il00O;
/* 484 */                           ooil0oIOI0l0.I00II0oii1o(obj3, j, ooil0oIOI0l0.I0010I0i(obj2, j));
/* 487 */                           I000iOII(i, obj3);
                                    continue;
                                }
/* 490 */                       i += 3;
/* 492 */                       obj = obj3;
                            case 1:
/* 451 */                       obj3 = obj;
/* 456 */                       if (I000lI(obj2, i)) {
/* 458 */                           Ooil0oIOI0l0 ooil0oIOI0l02 = l0II0IlI.I0000Il00O;
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
/* 444 */                           l0II0IlI.I0000Il00O.I00000oOI.putLong(obj3, j, l0II0IlI.I0001Ioi1lo(obj2, j));
/* 447 */                           I000iOII(i, obj3);
                                } else {
                                    continue;
                                }
/* 490 */                       i += 3;
/* 492 */                       obj = obj3;
                            case 3:
/* 407 */                       obj3 = obj;
/* 412 */                       if (I000lI(obj2, i)) {
/* 422 */                           l0II0IlI.I0000Il00O.I00000oOI.putLong(obj3, j, l0II0IlI.I0001Ioi1lo(obj2, j));
/* 425 */                           I000iOII(i, obj3);
                                } else {
                                    continue;
                                }
/* 490 */                       i += 3;
/* 492 */                       obj = obj3;
                            case 4:
/* 389 */                       obj3 = obj;
/* 394 */                       if (I000lI(obj2, i)) {
/* 400 */                           l0II0IlI.I000O01llI0(obj3, j, l0II0IlI.I0000oI00(obj2, j));
/* 403 */                           I000iOII(i, obj3);
                                } else {
                                    continue;
                                }
/* 490 */                       i += 3;
/* 492 */                       obj = obj3;
                            case 5:
/* 367 */                       obj3 = obj;
/* 372 */                       if (I000lI(obj2, i)) {
/* 382 */                           l0II0IlI.I0000Il00O.I00000oOI.putLong(obj3, j, l0II0IlI.I0001Ioi1lo(obj2, j));
/* 385 */                           I000iOII(i, obj3);
                                } else {
                                    continue;
                                }
/* 490 */                       i += 3;
/* 492 */                       obj = obj3;
                            case 6:
/* 348 */                       obj3 = obj;
/* 353 */                       if (I000lI(obj2, i)) {
/* 359 */                           l0II0IlI.I000O01llI0(obj3, j, l0II0IlI.I0000oI00(obj2, j));
/* 362 */                           I000iOII(i, obj3);
                                } else {
                                    continue;
                                }
/* 490 */                       i += 3;
/* 492 */                       obj = obj3;
                            case 7:
/* 327 */                       obj3 = obj;
/* 332 */                       if (I000lI(obj2, i)) {
/* 334 */                           Ooil0oIOI0l0 ooil0oIOI0l03 = l0II0IlI.I0000Il00O;
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
/* 319 */                           l0II0IlI.I000OOo1O(obj3, j, l0II0IlI.I000II(obj2, j));
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
/* 294 */                           l0II0IlI.I000OOo1O(obj3, j, l0II0IlI.I000II(obj2, j));
/* 297 */                           I000iOII(i, obj3);
                                } else {
                                    continue;
                                }
/* 490 */                       i += 3;
/* 492 */                       obj = obj3;
                            case 11:
/* 264 */                       obj3 = obj;
/* 269 */                       if (I000lI(obj2, i)) {
/* 275 */                           l0II0IlI.I000O01llI0(obj3, j, l0II0IlI.I0000oI00(obj2, j));
/* 278 */                           I000iOII(i, obj3);
                                } else {
                                    continue;
                                }
/* 490 */                       i += 3;
/* 492 */                       obj = obj3;
                            case 12:
/* 245 */                       obj3 = obj;
/* 250 */                       if (I000lI(obj2, i)) {
/* 256 */                           l0II0IlI.I000O01llI0(obj3, j, l0II0IlI.I0000oI00(obj2, j));
/* 259 */                           I000iOII(i, obj3);
                                } else {
                                    continue;
                                }
/* 490 */                       i += 3;
/* 492 */                       obj = obj3;
                            case 13:
/* 226 */                       obj3 = obj;
/* 231 */                       if (I000lI(obj2, i)) {
/* 237 */                           l0II0IlI.I000O01llI0(obj3, j, l0II0IlI.I0000oI00(obj2, j));
/* 240 */                           I000iOII(i, obj3);
                                } else {
                                    continue;
                                }
/* 490 */                       i += 3;
/* 492 */                       obj = obj3;
                            case 14:
/* 203 */                       obj3 = obj;
/* 208 */                       if (I000lI(obj2, i)) {
/* 218 */                           l0II0IlI.I0000Il00O.I00000oOI.putLong(obj3, j, l0II0IlI.I0001Ioi1lo(obj2, j));
/* 221 */                           I000iOII(i, obj3);
                                } else {
                                    continue;
                                }
/* 490 */                       i += 3;
/* 492 */                       obj = obj3;
                            case 15:
/* 184 */                       obj3 = obj;
/* 189 */                       if (I000lI(obj2, i)) {
/* 195 */                           l0II0IlI.I000O01llI0(obj3, j, l0II0IlI.I0000oI00(obj2, j));
/* 198 */                           I000iOII(i, obj3);
                                } else {
                                    continue;
                                }
/* 490 */                       i += 3;
/* 492 */                       obj = obj3;
                            case 16:
/* 165 */                       if (I000lI(obj2, i)) {
/* 175 */                           obj3 = obj;
/* 176 */                           l0II0IlI.I0000Il00O.I00000oOI.putLong(obj3, j, l0II0IlI.I0001Ioi1lo(obj2, j));
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
/* 114 */                       iloOl100 ilool100Zzd = (iloOl100) l0II0IlI.I000II(obj, j);
/* 120 */                       iloOl100 ilool100 = (iloOl100) l0II0IlI.I000II(obj2, j);
/* 122 */                       int size = ilool100Zzd.size();
/* 126 */                       int size2 = ilool100.size();
/* 130 */                       if (size > 0 && size2 > 0) {
/* 139 */                           if (!((il0II1iiI) ilool100Zzd).I00iOIl) {
/* 142 */                               ilool100Zzd = ilool100Zzd.zzd(size2 + size);
                                    }
/* 146 */                           ilool100Zzd.addAll(ilool100);
                                }
/* 149 */                       if (size > 0) {
/* 152 */                           ilool100 = ilool100Zzd;
                                }
/* 153 */                       l0II0IlI.I000OOo1O(obj, j, ilool100);
                                break;
                            case 50:
/* 92 */                        i1O01oOIoI0I i1o01ooioi0i = iooiolOil0.I00000oIO;
/* 106 */                       l0II0IlI.I000OOo1O(obj, j, lioiO1.I00000oIO(l0II0IlI.I000II(obj, j), l0II0IlI.I000II(obj2, j)));
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
/* 79 */                            l0II0IlI.I000OOo1O(obj, j, l0II0IlI.I000II(obj2, j));
/* 88 */                            l0II0IlI.I000O01llI0(obj, iArr[i + 2] & 1048575, i3);
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
/* 52 */                            l0II0IlI.I000OOo1O(obj, j, l0II0IlI.I000II(obj2, j));
/* 61 */                            l0II0IlI.I000O01llI0(obj, iArr[i + 2] & 1048575, i3);
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
/* 496 */           iooiolOil0.I00100l0(obj4, obj2);
/* 501 */           if (this.I0001Ioi1lo) {
/* 503 */               iooiolOil0.I000oI1ioi(obj4, obj2);
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
/* 200 */                       if (I000o00OoI0I(obj, i2, i3, i, i11) && !I001iOo1i0O(i2).I0000Il00O(l0II0IlI.I000II(obj, iI001IO000 & 1048575))) {
                                    break;
                                }
/* 220 */                       i5++;
/* 222 */                       i6 = i3;
/* 223 */                       i4 = i;
                            } else {
/* 83 */                        if (iI001IIilI0O != 27) {
/* 87 */                            if (iI001IIilI0O == 60 || iI001IIilI0O == 68) {
/* 135 */                               if (I00100l0(obj, i8, i2) && !I001iOo1i0O(i2).I0000Il00O(l0II0IlI.I000II(obj, iI001IO000 & 1048575))) {
                                            break;
                                        }
                                    } else if (iI001IIilI0O != 49) {
/* 99 */                                if (iI001IIilI0O == 50 && !((ioI1oI1I) l0II0IlI.I000II(obj, iI001IO000 & 1048575)).isEmpty()) {
/* 119 */                                   int i12 = i2 / 3;
/* 130 */                                   throw IIlIOloOOO.I000l1(this.I00000oOI[i12 + i12]);
                                        }
                                    }
/* 220 */                           i5++;
/* 222 */                           i6 = i3;
/* 223 */                           i4 = i;
                                }
/* 162 */                       List list = (List) l0II0IlI.I000II(obj, iI001IO000 & 1048575);
/* 168 */                       if (list.isEmpty()) {
                                    continue;
                                } else {
/* 170 */                           iooIIllo iooiilloI001iOo1i0O = I001iOo1i0O(i2);
/* 179 */                           for (int i13 = 0; i13 < list.size(); i13++) {
/* 189 */                               if (!iooiilloI001iOo1i0O.I0000Il00O(list.get(i13))) {
                                            break loop0;
                                        }
                                    }
                                }
/* 220 */                       i5++;
/* 222 */                       i6 = i3;
/* 223 */                       i4 = i;
                            }
                        } else if (!this.I0001Ioi1lo || ((ill0o1o) obj).zzb.I0001Ioi1lo()) {
/* 14 */                    return true;
                        }
                    }
/* 5 */             return false;
                }

                /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
                /* JADX WARN: Removed duplicated region for block: B:101:0x026d  */
                /* JADX WARN: Removed duplicated region for block: B:102:0x027e  */
                /* JADX WARN: Removed duplicated region for block: B:103:0x028f  */
                /* JADX WARN: Removed duplicated region for block: B:104:0x02a0  */
                /* JADX WARN: Removed duplicated region for block: B:105:0x02b1  */
                /* JADX WARN: Removed duplicated region for block: B:106:0x02c2  */
                /* JADX WARN: Removed duplicated region for block: B:107:0x02d3  */
                /* JADX WARN: Removed duplicated region for block: B:108:0x02e4  */
                /* JADX WARN: Removed duplicated region for block: B:109:0x02f5  */
                /* JADX WARN: Removed duplicated region for block: B:110:0x0306  */
                /* JADX WARN: Removed duplicated region for block: B:111:0x0317  */
                /* JADX WARN: Removed duplicated region for block: B:112:0x0328  */
                /* JADX WARN: Removed duplicated region for block: B:113:0x0339  */
                /* JADX WARN: Removed duplicated region for block: B:114:0x034a  */
                /* JADX WARN: Removed duplicated region for block: B:115:0x035b  */
                /* JADX WARN: Removed duplicated region for block: B:117:0x036d  */
                /* JADX WARN: Removed duplicated region for block: B:118:0x037c  */
                /* JADX WARN: Removed duplicated region for block: B:119:0x038b  */
                /* JADX WARN: Removed duplicated region for block: B:120:0x039a  */
                /* JADX WARN: Removed duplicated region for block: B:121:0x03a9  */
                /* JADX WARN: Removed duplicated region for block: B:122:0x03b8  */
                /* JADX WARN: Removed duplicated region for block: B:130:0x03e6  */
                /* JADX WARN: Removed duplicated region for block: B:138:0x040f  */
                /* JADX WARN: Removed duplicated region for block: B:156:0x0460  */
                /* JADX WARN: Removed duplicated region for block: B:157:0x0470  */
                /* JADX WARN: Removed duplicated region for block: B:158:0x0480  */
                /* JADX WARN: Removed duplicated region for block: B:159:0x0490  */
                /* JADX WARN: Removed duplicated region for block: B:160:0x04a0  */
                /* JADX WARN: Removed duplicated region for block: B:161:0x04b0  */
                /* JADX WARN: Removed duplicated region for block: B:162:0x04c0  */
                /* JADX WARN: Removed duplicated region for block: B:163:0x04d0  */
                /* JADX WARN: Removed duplicated region for block: B:164:0x04e0  */
                /* JADX WARN: Removed duplicated region for block: B:167:0x04f6  */
                /* JADX WARN: Removed duplicated region for block: B:170:0x0512  */
                /* JADX WARN: Removed duplicated region for block: B:173:0x052e  */
                /* JADX WARN: Removed duplicated region for block: B:176:0x0545  */
                /* JADX WARN: Removed duplicated region for block: B:179:0x055c  */
                /* JADX WARN: Removed duplicated region for block: B:182:0x0573  */
                /* JADX WARN: Removed duplicated region for block: B:185:0x058a  */
                /* JADX WARN: Removed duplicated region for block: B:188:0x05a3  */
                /* JADX WARN: Removed duplicated region for block: B:191:0x05ba  */
                /* JADX WARN: Removed duplicated region for block: B:197:0x05e2  */
                /* JADX WARN: Removed duplicated region for block: B:200:0x05fe  */
                /* JADX WARN: Removed duplicated region for block: B:203:0x0615  */
                /* JADX WARN: Removed duplicated region for block: B:206:0x062c  */
                /* JADX WARN: Removed duplicated region for block: B:209:0x0642  */
                /* JADX WARN: Removed duplicated region for block: B:212:0x0658  */
                /* JADX WARN: Removed duplicated region for block: B:215:0x066e  */
                /* JADX WARN: Removed duplicated region for block: B:218:0x0688  */
                /* JADX WARN: Removed duplicated region for block: B:30:0x0096  */
                /* JADX WARN: Removed duplicated region for block: B:31:0x009a  */
                /* JADX WARN: Removed duplicated region for block: B:34:0x00ae  */
                /* JADX WARN: Removed duplicated region for block: B:37:0x00c5  */
                /* JADX WARN: Removed duplicated region for block: B:40:0x00dc  */
                /* JADX WARN: Removed duplicated region for block: B:43:0x00ee  */
                /* JADX WARN: Removed duplicated region for block: B:46:0x0100  */
                /* JADX WARN: Removed duplicated region for block: B:49:0x0112  */
                /* JADX WARN: Removed duplicated region for block: B:52:0x0125  */
                /* JADX WARN: Removed duplicated region for block: B:55:0x013c  */
                /* JADX WARN: Removed duplicated region for block: B:58:0x0151  */
                /* JADX WARN: Removed duplicated region for block: B:64:0x0177  */
                /* JADX WARN: Removed duplicated region for block: B:67:0x0195  */
                /* JADX WARN: Removed duplicated region for block: B:70:0x01a8  */
                /* JADX WARN: Removed duplicated region for block: B:73:0x01bb  */
                /* JADX WARN: Removed duplicated region for block: B:76:0x01ce  */
                /* JADX WARN: Removed duplicated region for block: B:79:0x01e1  */
                /* JADX WARN: Removed duplicated region for block: B:7:0x0027  */
                /* JADX WARN: Removed duplicated region for block: B:82:0x01f4  */
                /* JADX WARN: Removed duplicated region for block: B:85:0x0211  */
                /* JADX WARN: Removed duplicated region for block: B:88:0x022e  */
                /* JADX WARN: Removed duplicated region for block: B:93:0x0244  */
                @Override
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final void I0000O(Object obj, i1IoOl i1iool) throws IOO1IOl1O10 {
                    Map.Entry entry;
                    Iterator it;
                    int i;
                    int i2;
                    Map.Entry entry2;
                    int i3;
                    boolean z;
/* 1 */             ioOioO0Oo iooioo0oo = this;
/* 7 */             iOl0lOIi11 iol0loii11 = iooioo0oo.I000iOII;
/* 9 */             int[] iArr = iooioo0oo.I00000oIO;
/* 13 */            if (iooioo0oo.I0001Ioi1lo) {
/* 18 */                ilOol10I0IlI ilool10i0ili = ((ill0o1o) obj).zzb;
/* 26 */                if (ilool10i0ili.I00000oIO.isEmpty()) {
/* 40 */                    entry = null;
/* 41 */                    it = null;
                        } else {
/* 28 */                    Iterator itI0000Il00O = ilool10i0ili.I0000Il00O();
/* 36 */                    entry = (Map.Entry) itI0000Il00O.next();
/* 38 */                    it = itI0000Il00O;
                        }
                    }
/* 42 */            int i4 = 1048575;
/* 45 */            int i5 = 1048575;
/* 46 */            int i6 = 0;
/* 47 */            int i7 = 0;
/* 49 */            while (i6 < iArr.length) {
/* 51 */                int iI001IO000 = iooioo0oo.I001IO000(i6);
/* 55 */                int iI001IIilI0O = I001IIilI0O(iI001IO000);
/* 59 */                int i8 = iArr[i6];
/* 65 */                Unsafe unsafe = I000lI;
/* 67 */                if (iI001IIilI0O <= 17) {
/* 71 */                    int i9 = iArr[i6 + 2];
/* 73 */                    Map.Entry entry3 = entry;
/* 75 */                    int i10 = i9 & i4;
/* 77 */                    if (i10 != i5) {
/* 84 */                        i7 = i10 == i4 ? 0 : unsafe.getInt(obj, i10);
/* 89 */                        i5 = i10;
                            }
/* 92 */                    int i11 = 1 << (i9 >>> 20);
/* 94 */                    int i12 = i7;
/* 95 */                    i3 = i11;
/* 96 */                    i = i5;
/* 97 */                    i2 = i12;
/* 98 */                    entry2 = entry3;
                        } else {
/* 101 */                   Map.Entry entry4 = entry;
/* 103 */                   i = i5;
/* 104 */                   i2 = i7;
/* 105 */                   entry2 = entry4;
/* 107 */                   i3 = 0;
                        }
/* 108 */               while (entry2 != null) {
/* 116 */                   ((ill110ll) entry2.getKey()).getClass();
/* 119 */                   if (i8 >= 0) {
/* 121 */                       iol0loii11.getClass();
/* 124 */                       iOl0lOIi11.I001IIilI0O(i1iool, entry2);
/* 140 */                       entry2 = it.hasNext() ? (Map.Entry) it.next() : null;
                            } else {
/* 142 */                       long j = iI001IO000 & i4;
                                switch (iI001IIilI0O) {
                                    case 0:
/* 1679 */                              if (iooioo0oo.I000o00OoI0I(obj, i6, i, i2, i3)) {
/* 1695 */                                  ((ilIO10iO) i1iool.I00iOIl).I000O01llI0(i8, Double.doubleToRawLongBits(l0II0IlI.I0000Il00O.I0010I0i(obj, j)));
                                        }
/* 1698 */                              i6 += 3;
/* 1700 */                              i4 = 1048575;
/* 1703 */                              iooioo0oo = this;
/* 1705 */                              i7 = i2;
/* 1706 */                              i5 = i;
/* 1707 */                              entry = entry2;
                                    case 1:
/* 1653 */                              if (iooioo0oo.I000o00OoI0I(obj, i6, i, i2, i3)) {
/* 1669 */                                  ((ilIO10iO) i1iool.I00iOIl).I0001Ioi1lo(i8, Float.floatToRawIntBits(l0II0IlI.I0000Il00O.I001IIilI0O(obj, j)));
                                        }
/* 1698 */                              i6 += 3;
/* 1700 */                              i4 = 1048575;
/* 1703 */                              iooioo0oo = this;
/* 1705 */                              i7 = i2;
/* 1706 */                              i5 = i;
/* 1707 */                              entry = entry2;
                                    case 2:
/* 1633 */                              if (iooioo0oo.I000o00OoI0I(obj, i6, i, i2, i3)) {
/* 1643 */                                  ((ilIO10iO) i1iool.I00iOIl).I00100l0(i8, unsafe.getLong(obj, j));
                                        }
/* 1698 */                              i6 += 3;
/* 1700 */                              i4 = 1048575;
/* 1703 */                              iooioo0oo = this;
/* 1705 */                              i7 = i2;
/* 1706 */                              i5 = i;
/* 1707 */                              entry = entry2;
                                    case 3:
/* 1611 */                              if (iooioo0oo.I000o00OoI0I(obj, i6, i, i2, i3)) {
/* 1621 */                                  ((ilIO10iO) i1iool.I00iOIl).I00100l0(i8, unsafe.getLong(obj, j));
                                        }
/* 1698 */                              i6 += 3;
/* 1700 */                              i4 = 1048575;
/* 1703 */                              iooioo0oo = this;
/* 1705 */                              i7 = i2;
/* 1706 */                              i5 = i;
/* 1707 */                              entry = entry2;
                                    case 4:
/* 1589 */                              if (iooioo0oo.I000o00OoI0I(obj, i6, i, i2, i3)) {
/* 1599 */                                  ((ilIO10iO) i1iool.I00iOIl).I000OiO(i8, unsafe.getInt(obj, j));
                                        }
/* 1698 */                              i6 += 3;
/* 1700 */                              i4 = 1048575;
/* 1703 */                              iooioo0oo = this;
/* 1705 */                              i7 = i2;
/* 1706 */                              i5 = i;
/* 1707 */                              entry = entry2;
                                    case 5:
/* 1566 */                              if (iooioo0oo.I000o00OoI0I(obj, i6, i, i2, i3)) {
/* 1576 */                                  ((ilIO10iO) i1iool.I00iOIl).I000O01llI0(i8, unsafe.getLong(obj, j));
                                        }
/* 1698 */                              i6 += 3;
/* 1700 */                              i4 = 1048575;
/* 1703 */                              iooioo0oo = this;
/* 1705 */                              i7 = i2;
/* 1706 */                              i5 = i;
/* 1707 */                              entry = entry2;
                                    case 6:
/* 1543 */                              if (iooioo0oo.I000o00OoI0I(obj, i6, i, i2, i3)) {
/* 1553 */                                  ((ilIO10iO) i1iool.I00iOIl).I0001Ioi1lo(i8, unsafe.getInt(obj, j));
                                        }
/* 1698 */                              i6 += 3;
/* 1700 */                              i4 = 1048575;
/* 1703 */                              iooioo0oo = this;
/* 1705 */                              i7 = i2;
/* 1706 */                              i5 = i;
/* 1707 */                              entry = entry2;
                                    case 7:
/* 1513 */                              if (iooioo0oo.I000o00OoI0I(obj, i6, i, i2, i3)) {
/* 1517 */                                  boolean zI00Io1o110i = l0II0IlI.I0000Il00O.I00Io1o110i(obj, j);
/* 1523 */                                  ilIO10iO ilio10io = (ilIO10iO) i1iool.I00iOIl;
/* 1527 */                                  ilio10io.I000oI1ioi(i8 << 3);
/* 1530 */                                  ilio10io.I0000Il00O(zI00Io1o110i ? (byte) 1 : (byte) 0);
                                        }
/* 1698 */                              i6 += 3;
/* 1700 */                              i4 = 1048575;
/* 1703 */                              iooioo0oo = this;
/* 1705 */                              i7 = i2;
/* 1706 */                              i5 = i;
/* 1707 */                              entry = entry2;
                                    case 8:
/* 1475 */                              if (iooioo0oo.I000o00OoI0I(obj, i6, i, i2, i3)) {
/* 1477 */                                  Object object = unsafe.getObject(obj, j);
/* 1483 */                                  if (object instanceof String) {
/* 1491 */                                      ((ilIO10iO) i1iool.I00iOIl).I000l1(i8, (String) object);
                                            } else {
/* 1502 */                                      ((ilIO10iO) i1iool.I00iOIl).I0000oI00(i8, (il1oII0OlIo) object);
                                            }
                                        }
/* 1698 */                              i6 += 3;
/* 1700 */                              i4 = 1048575;
/* 1703 */                              iooioo0oo = this;
/* 1705 */                              i7 = i2;
/* 1706 */                              i5 = i;
/* 1707 */                              entry = entry2;
                                    case 9:
/* 1452 */                              if (iooioo0oo.I000o00OoI0I(obj, i6, i, i2, i3)) {
/* 1462 */                                  i1iool.I0000O(i8, unsafe.getObject(obj, j), iooioo0oo.I001iOo1i0O(i6));
                                        }
/* 1698 */                              i6 += 3;
/* 1700 */                              i4 = 1048575;
/* 1703 */                              iooioo0oo = this;
/* 1705 */                              i7 = i2;
/* 1706 */                              i5 = i;
/* 1707 */                              entry = entry2;
                                    case 10:
/* 1427 */                              if (iooioo0oo.I000o00OoI0I(obj, i6, i, i2, i3)) {
/* 1439 */                                  ((ilIO10iO) i1iool.I00iOIl).I0000oI00(i8, (il1oII0OlIo) unsafe.getObject(obj, j));
                                        }
/* 1698 */                              i6 += 3;
/* 1700 */                              i4 = 1048575;
/* 1703 */                              iooioo0oo = this;
/* 1705 */                              i7 = i2;
/* 1706 */                              i5 = i;
/* 1707 */                              entry = entry2;
                                    case 11:
/* 1404 */                              if (iooioo0oo.I000o00OoI0I(obj, i6, i, i2, i3)) {
/* 1414 */                                  ((ilIO10iO) i1iool.I00iOIl).I000o00OoI0I(i8, unsafe.getInt(obj, j));
                                        }
/* 1698 */                              i6 += 3;
/* 1700 */                              i4 = 1048575;
/* 1703 */                              iooioo0oo = this;
/* 1705 */                              i7 = i2;
/* 1706 */                              i5 = i;
/* 1707 */                              entry = entry2;
                                    case 12:
/* 1381 */                              if (iooioo0oo.I000o00OoI0I(obj, i6, i, i2, i3)) {
/* 1391 */                                  ((ilIO10iO) i1iool.I00iOIl).I000OiO(i8, unsafe.getInt(obj, j));
                                        }
/* 1698 */                              i6 += 3;
/* 1700 */                              i4 = 1048575;
/* 1703 */                              iooioo0oo = this;
/* 1705 */                              i7 = i2;
/* 1706 */                              i5 = i;
/* 1707 */                              entry = entry2;
                                    case 13:
/* 1358 */                              if (iooioo0oo.I000o00OoI0I(obj, i6, i, i2, i3)) {
/* 1368 */                                  ((ilIO10iO) i1iool.I00iOIl).I0001Ioi1lo(i8, unsafe.getInt(obj, j));
                                        }
/* 1698 */                              i6 += 3;
/* 1700 */                              i4 = 1048575;
/* 1703 */                              iooioo0oo = this;
/* 1705 */                              i7 = i2;
/* 1706 */                              i5 = i;
/* 1707 */                              entry = entry2;
                                    case 14:
/* 1335 */                              if (iooioo0oo.I000o00OoI0I(obj, i6, i, i2, i3)) {
/* 1345 */                                  ((ilIO10iO) i1iool.I00iOIl).I000O01llI0(i8, unsafe.getLong(obj, j));
                                        }
/* 1698 */                              i6 += 3;
/* 1700 */                              i4 = 1048575;
/* 1703 */                              iooioo0oo = this;
/* 1705 */                              i7 = i2;
/* 1706 */                              i5 = i;
/* 1707 */                              entry = entry2;
                                    case 15:
/* 1307 */                              if (iooioo0oo.I000o00OoI0I(obj, i6, i, i2, i3)) {
/* 1309 */                                  int i13 = unsafe.getInt(obj, j);
/* 1322 */                                  ((ilIO10iO) i1iool.I00iOIl).I000o00OoI0I(i8, (i13 >> 31) ^ (i13 + i13));
                                        }
/* 1698 */                              i6 += 3;
/* 1700 */                              i4 = 1048575;
/* 1703 */                              iooioo0oo = this;
/* 1705 */                              i7 = i2;
/* 1706 */                              i5 = i;
/* 1707 */                              entry = entry2;
                                    case 16:
/* 1279 */                              if (iooioo0oo.I000o00OoI0I(obj, i6, i, i2, i3)) {
/* 1281 */                                  long j2 = unsafe.getLong(obj, j);
/* 1294 */                                  ((ilIO10iO) i1iool.I00iOIl).I00100l0(i8, (j2 + j2) ^ (j2 >> 63));
                                        }
/* 1698 */                              i6 += 3;
/* 1700 */                              i4 = 1048575;
/* 1703 */                              iooioo0oo = this;
/* 1705 */                              i7 = i2;
/* 1706 */                              i5 = i;
/* 1707 */                              entry = entry2;
                                    case 17:
/* 1251 */                              z = false;
/* 1256 */                              if (iooioo0oo.I000o00OoI0I(obj, i6, i, i2, i3)) {
/* 1266 */                                  i1iool.I0000Il00O(i8, unsafe.getObject(obj, j), iooioo0oo.I001iOo1i0O(i6));
                                        }
/* 1698 */                              i6 += 3;
/* 1700 */                              i4 = 1048575;
/* 1703 */                              iooioo0oo = this;
/* 1705 */                              i7 = i2;
/* 1706 */                              i5 = i;
/* 1707 */                              entry = entry2;
                                    case PoseLandmark.RIGHT_PINKY:
/* 1235 */                              z = false;
/* 1244 */                              iooiolOil0.I0010I0i(iArr[i6], (List) unsafe.getObject(obj, j), i1iool, false);
/* 1698 */                              i6 += 3;
/* 1700 */                              i4 = 1048575;
/* 1703 */                              iooioo0oo = this;
/* 1705 */                              i7 = i2;
/* 1706 */                              i5 = i;
/* 1707 */                              entry = entry2;
                                    case PoseLandmark.LEFT_INDEX:
/* 1219 */                              z = false;
/* 1228 */                              iooiolOil0.I001IO000(iArr[i6], (List) unsafe.getObject(obj, j), i1iool, false);
/* 1698 */                              i6 += 3;
/* 1700 */                              i4 = 1048575;
/* 1703 */                              iooioo0oo = this;
/* 1705 */                              i7 = i2;
/* 1706 */                              i5 = i;
/* 1707 */                              entry = entry2;
                                    case PoseLandmark.RIGHT_INDEX:
/* 1203 */                              z = false;
/* 1212 */                              iooiolOil0.I001i1lo1io(iArr[i6], (List) unsafe.getObject(obj, j), i1iool, false);
/* 1698 */                              i6 += 3;
/* 1700 */                              i4 = 1048575;
/* 1703 */                              iooioo0oo = this;
/* 1705 */                              i7 = i2;
/* 1706 */                              i5 = i;
/* 1707 */                              entry = entry2;
                                    case PoseLandmark.LEFT_THUMB:
/* 1187 */                              z = false;
/* 1196 */                              iooiolOil0.I0000O(iArr[i6], (List) unsafe.getObject(obj, j), i1iool, false);
/* 1698 */                              i6 += 3;
/* 1700 */                              i4 = 1048575;
/* 1703 */                              iooioo0oo = this;
/* 1705 */                              i7 = i2;
/* 1706 */                              i5 = i;
/* 1707 */                              entry = entry2;
                                    case PoseLandmark.RIGHT_THUMB:
/* 1171 */                              z = false;
/* 1180 */                              iooiolOil0.I001i1O0Ol(iArr[i6], (List) unsafe.getObject(obj, j), i1iool, false);
/* 1698 */                              i6 += 3;
/* 1700 */                              i4 = 1048575;
/* 1703 */                              iooioo0oo = this;
/* 1705 */                              i7 = i2;
/* 1706 */                              i5 = i;
/* 1707 */                              entry = entry2;
                                    case PoseLandmark.LEFT_HIP:
/* 1155 */                              z = false;
/* 1164 */                              iooiolOil0.I001IIilI0O(iArr[i6], (List) unsafe.getObject(obj, j), i1iool, false);
/* 1698 */                              i6 += 3;
/* 1700 */                              i4 = 1048575;
/* 1703 */                              iooioo0oo = this;
/* 1705 */                              i7 = i2;
/* 1706 */                              i5 = i;
/* 1707 */                              entry = entry2;
                                    case PoseLandmark.RIGHT_HIP:
/* 1139 */                              z = false;
/* 1148 */                              iooiolOil0.I00111O(iArr[i6], (List) unsafe.getObject(obj, j), i1iool, false);
/* 1698 */                              i6 += 3;
/* 1700 */                              i4 = 1048575;
/* 1703 */                              iooioo0oo = this;
/* 1705 */                              i7 = i2;
/* 1706 */                              i5 = i;
/* 1707 */                              entry = entry2;
                                    case PoseLandmark.LEFT_KNEE:
/* 1131 */                              z = false;
/* 1132 */                              iooiolOil0.I00100o1O0lo(iArr[i6], (List) unsafe.getObject(obj, j), i1iool, false);
/* 1698 */                              i6 += 3;
/* 1700 */                              i4 = 1048575;
/* 1703 */                              iooioo0oo = this;
/* 1705 */                              i7 = i2;
/* 1706 */                              i5 = i;
/* 1707 */                              entry = entry2;
                                    case PoseLandmark.RIGHT_KNEE:
/* 1042 */                              int i14 = iArr[i6];
/* 1048 */                              List list = (List) unsafe.getObject(obj, j);
/* 1050 */                              i1O01oOIoI0I i1o01ooioi0i = iooiolOil0.I00000oIO;
/* 1052 */                              if (list != null && !list.isEmpty()) {
/* 1062 */                                  ilIO10iO ilio10io2 = (ilIO10iO) i1iool.I00iOIl;
/* 1066 */                                  if (list instanceof io0lO0Oi) {
/* 1069 */                                      io0lO0Oi io0lo0oi = (io0lO0Oi) list;
/* 1076 */                                      for (int i15 = 0; i15 < list.size(); i15++) {
/* 1078 */                                          Object objZza = io0lo0oi.zza();
/* 1084 */                                          if (objZza instanceof String) {
/* 1088 */                                              ilio10io2.I000l1(i14, (String) objZza);
                                                    } else {
/* 1094 */                                              ilio10io2.I0000oI00(i14, (il1oII0OlIo) objZza);
                                                    }
                                                }
                                            } else {
/* 1107 */                                      for (int i16 = 0; i16 < list.size(); i16++) {
/* 1115 */                                          ilio10io2.I000l1(i14, (String) list.get(i16));
                                                }
                                            }
                                        }
/* 1698 */                              i6 += 3;
/* 1700 */                              i4 = 1048575;
/* 1703 */                              iooioo0oo = this;
/* 1705 */                              i7 = i2;
/* 1706 */                              i5 = i;
/* 1707 */                              entry = entry2;
                                        break;
                                    case 27:
/* 1001 */                              int i17 = iArr[i6];
/* 1007 */                              List list2 = (List) unsafe.getObject(obj, j);
/* 1009 */                              iooIIllo iooiilloI001iOo1i0O = iooioo0oo.I001iOo1i0O(i6);
/* 1013 */                              i1O01oOIoI0I i1o01ooioi0i2 = iooiolOil0.I00000oIO;
/* 1015 */                              if (list2 != null && !list2.isEmpty()) {
/* 1028 */                                  for (int i18 = 0; i18 < list2.size(); i18++) {
/* 1034 */                                      i1iool.I0000O(i17, list2.get(i18), iooiilloI001iOo1i0O);
                                            }
                                        }
/* 1698 */                              i6 += 3;
/* 1700 */                              i4 = 1048575;
/* 1703 */                              iooioo0oo = this;
/* 1705 */                              i7 = i2;
/* 1706 */                              i5 = i;
/* 1707 */                              entry = entry2;
                                        break;
                                    case PoseLandmark.RIGHT_ANKLE:
/* 955 */                               int i19 = iArr[i6];
/* 961 */                               List list3 = (List) unsafe.getObject(obj, j);
/* 963 */                               i1O01oOIoI0I i1o01ooioi0i3 = iooiolOil0.I00000oIO;
/* 965 */                               if (list3 != null && !list3.isEmpty()) {
/* 973 */                                   i1iool.getClass();
/* 981 */                                   for (int i20 = 0; i20 < list3.size(); i20++) {
/* 993 */                                       ((ilIO10iO) i1iool.I00iOIl).I0000oI00(i19, (il1oII0OlIo) list3.get(i20));
                                            }
                                        }
/* 1698 */                              i6 += 3;
/* 1700 */                              i4 = 1048575;
/* 1703 */                              iooioo0oo = this;
/* 1705 */                              i7 = i2;
/* 1706 */                              i5 = i;
/* 1707 */                              entry = entry2;
                                        break;
                                    case PoseLandmark.LEFT_HEEL:
/* 940 */                               z = false;
/* 949 */                               iooiolOil0.I0000Il00O(iArr[i6], (List) unsafe.getObject(obj, j), i1iool, false);
/* 1698 */                              i6 += 3;
/* 1700 */                              i4 = 1048575;
/* 1703 */                              iooioo0oo = this;
/* 1705 */                              i7 = i2;
/* 1706 */                              i5 = i;
/* 1707 */                              entry = entry2;
                                    case 30:
/* 925 */                               z = false;
/* 934 */                               iooiolOil0.I0010o(iArr[i6], (List) unsafe.getObject(obj, j), i1iool, false);
/* 1698 */                              i6 += 3;
/* 1700 */                              i4 = 1048575;
/* 1703 */                              iooioo0oo = this;
/* 1705 */                              i7 = i2;
/* 1706 */                              i5 = i;
/* 1707 */                              entry = entry2;
                                    case PoseLandmark.LEFT_FOOT_INDEX:
/* 910 */                               z = false;
/* 919 */                               iooiolOil0.I001iOo1i0O(iArr[i6], (List) unsafe.getObject(obj, j), i1iool, false);
/* 1698 */                              i6 += 3;
/* 1700 */                              i4 = 1048575;
/* 1703 */                              iooioo0oo = this;
/* 1705 */                              i7 = i2;
/* 1706 */                              i5 = i;
/* 1707 */                              entry = entry2;
                                    case 32:
/* 895 */                               z = false;
/* 904 */                               iooiolOil0.I001l0I00(iArr[i6], (List) unsafe.getObject(obj, j), i1iool, false);
/* 1698 */                              i6 += 3;
/* 1700 */                              i4 = 1048575;
/* 1703 */                              iooioo0oo = this;
/* 1705 */                              i7 = i2;
/* 1706 */                              i5 = i;
/* 1707 */                              entry = entry2;
                                    case 33:
/* 880 */                               z = false;
/* 889 */                               iooiolOil0.I00000oIO(iArr[i6], (List) unsafe.getObject(obj, j), i1iool, false);
/* 1698 */                              i6 += 3;
/* 1700 */                              i4 = 1048575;
/* 1703 */                              iooioo0oo = this;
/* 1705 */                              i7 = i2;
/* 1706 */                              i5 = i;
/* 1707 */                              entry = entry2;
                                    case 34:
/* 870 */                               z = false;
/* 871 */                               iooiolOil0.I00000oOI(iArr[i6], (List) unsafe.getObject(obj, j), i1iool, false);
/* 1698 */                              i6 += 3;
/* 1700 */                              i4 = 1048575;
/* 1703 */                              iooioo0oo = this;
/* 1705 */                              i7 = i2;
/* 1706 */                              i5 = i;
/* 1707 */                              entry = entry2;
                                    case InputImage.IMAGE_FORMAT_YUV_420_888:
/* 855 */                               iooiolOil0.I0010I0i(iArr[i6], (List) unsafe.getObject(obj, j), i1iool, true);
/* 1698 */                              i6 += 3;
/* 1700 */                              i4 = 1048575;
/* 1703 */                              iooioo0oo = this;
/* 1705 */                              i7 = i2;
/* 1706 */                              i5 = i;
/* 1707 */                              entry = entry2;
                                    case 36:
/* 838 */                               iooiolOil0.I001IO000(iArr[i6], (List) unsafe.getObject(obj, j), i1iool, true);
/* 1698 */                              i6 += 3;
/* 1700 */                              i4 = 1048575;
/* 1703 */                              iooioo0oo = this;
/* 1705 */                              i7 = i2;
/* 1706 */                              i5 = i;
/* 1707 */                              entry = entry2;
                                    case 37:
/* 821 */                               iooiolOil0.I001i1lo1io(iArr[i6], (List) unsafe.getObject(obj, j), i1iool, true);
/* 1698 */                              i6 += 3;
/* 1700 */                              i4 = 1048575;
/* 1703 */                              iooioo0oo = this;
/* 1705 */                              i7 = i2;
/* 1706 */                              i5 = i;
/* 1707 */                              entry = entry2;
                                    case 38:
/* 804 */                               iooiolOil0.I0000O(iArr[i6], (List) unsafe.getObject(obj, j), i1iool, true);
/* 1698 */                              i6 += 3;
/* 1700 */                              i4 = 1048575;
/* 1703 */                              iooioo0oo = this;
/* 1705 */                              i7 = i2;
/* 1706 */                              i5 = i;
/* 1707 */                              entry = entry2;
                                    case 39:
/* 787 */                               iooiolOil0.I001i1O0Ol(iArr[i6], (List) unsafe.getObject(obj, j), i1iool, true);
/* 1698 */                              i6 += 3;
/* 1700 */                              i4 = 1048575;
/* 1703 */                              iooioo0oo = this;
/* 1705 */                              i7 = i2;
/* 1706 */                              i5 = i;
/* 1707 */                              entry = entry2;
                                    case 40:
/* 770 */                               iooiolOil0.I001IIilI0O(iArr[i6], (List) unsafe.getObject(obj, j), i1iool, true);
/* 1698 */                              i6 += 3;
/* 1700 */                              i4 = 1048575;
/* 1703 */                              iooioo0oo = this;
/* 1705 */                              i7 = i2;
/* 1706 */                              i5 = i;
/* 1707 */                              entry = entry2;
                                    case 41:
/* 753 */                               iooiolOil0.I00111O(iArr[i6], (List) unsafe.getObject(obj, j), i1iool, true);
/* 1698 */                              i6 += 3;
/* 1700 */                              i4 = 1048575;
/* 1703 */                              iooioo0oo = this;
/* 1705 */                              i7 = i2;
/* 1706 */                              i5 = i;
/* 1707 */                              entry = entry2;
                                    case 42:
/* 736 */                               iooiolOil0.I00100o1O0lo(iArr[i6], (List) unsafe.getObject(obj, j), i1iool, true);
/* 1698 */                              i6 += 3;
/* 1700 */                              i4 = 1048575;
/* 1703 */                              iooioo0oo = this;
/* 1705 */                              i7 = i2;
/* 1706 */                              i5 = i;
/* 1707 */                              entry = entry2;
                                    case 43:
/* 719 */                               iooiolOil0.I0000Il00O(iArr[i6], (List) unsafe.getObject(obj, j), i1iool, true);
/* 1698 */                              i6 += 3;
/* 1700 */                              i4 = 1048575;
/* 1703 */                              iooioo0oo = this;
/* 1705 */                              i7 = i2;
/* 1706 */                              i5 = i;
/* 1707 */                              entry = entry2;
                                    case 44:
/* 702 */                               iooiolOil0.I0010o(iArr[i6], (List) unsafe.getObject(obj, j), i1iool, true);
/* 1698 */                              i6 += 3;
/* 1700 */                              i4 = 1048575;
/* 1703 */                              iooioo0oo = this;
/* 1705 */                              i7 = i2;
/* 1706 */                              i5 = i;
/* 1707 */                              entry = entry2;
                                    case BuildConfig.VERSION_CODE:
/* 685 */                               iooiolOil0.I001iOo1i0O(iArr[i6], (List) unsafe.getObject(obj, j), i1iool, true);
/* 1698 */                              i6 += 3;
/* 1700 */                              i4 = 1048575;
/* 1703 */                              iooioo0oo = this;
/* 1705 */                              i7 = i2;
/* 1706 */                              i5 = i;
/* 1707 */                              entry = entry2;
                                    case 46:
/* 668 */                               iooiolOil0.I001l0I00(iArr[i6], (List) unsafe.getObject(obj, j), i1iool, true);
/* 1698 */                              i6 += 3;
/* 1700 */                              i4 = 1048575;
/* 1703 */                              iooioo0oo = this;
/* 1705 */                              i7 = i2;
/* 1706 */                              i5 = i;
/* 1707 */                              entry = entry2;
                                    case 47:
/* 651 */                               iooiolOil0.I00000oIO(iArr[i6], (List) unsafe.getObject(obj, j), i1iool, true);
/* 1698 */                              i6 += 3;
/* 1700 */                              i4 = 1048575;
/* 1703 */                              iooioo0oo = this;
/* 1705 */                              i7 = i2;
/* 1706 */                              i5 = i;
/* 1707 */                              entry = entry2;
                                    case 48:
/* 634 */                               iooiolOil0.I00000oOI(iArr[i6], (List) unsafe.getObject(obj, j), i1iool, true);
/* 1698 */                              i6 += 3;
/* 1700 */                              i4 = 1048575;
/* 1703 */                              iooioo0oo = this;
/* 1705 */                              i7 = i2;
/* 1706 */                              i5 = i;
/* 1707 */                              entry = entry2;
                                    case 49:
/* 583 */                               int i21 = iArr[i6];
/* 589 */                               List list4 = (List) unsafe.getObject(obj, j);
/* 591 */                               iooIIllo iooiilloI001iOo1i0O2 = iooioo0oo.I001iOo1i0O(i6);
/* 595 */                               i1O01oOIoI0I i1o01ooioi0i4 = iooiolOil0.I00000oIO;
/* 597 */                               if (list4 != null && !list4.isEmpty()) {
/* 610 */                                   for (int i22 = 0; i22 < list4.size(); i22++) {
/* 616 */                                       i1iool.I0000Il00O(i21, list4.get(i22), iooiilloI001iOo1i0O2);
                                            }
                                        }
/* 1698 */                              i6 += 3;
/* 1700 */                              i4 = 1048575;
/* 1703 */                              iooioo0oo = this;
/* 1705 */                              i7 = i2;
/* 1706 */                              i5 = i;
/* 1707 */                              entry = entry2;
                                        break;
                                    case 50:
/* 565 */                               if (unsafe.getObject(obj, j) != null) {
/* 569 */                                   int i23 = i6 / 3;
/* 580 */                                   throw IIlIOloOOO.I000l1(iooioo0oo.I00000oOI[i23 + i23]);
                                        }
/* 1698 */                              i6 += 3;
/* 1700 */                              i4 = 1048575;
/* 1703 */                              iooioo0oo = this;
/* 1705 */                              i7 = i2;
/* 1706 */                              i5 = i;
/* 1707 */                              entry = entry2;
                                    case 51:
/* 534 */                               if (iooioo0oo.I00100l0(obj, i8, i6)) {
/* 554 */                                   ((ilIO10iO) i1iool.I00iOIl).I000O01llI0(i8, Double.doubleToRawLongBits(((Double) l0II0IlI.I000II(obj, j)).doubleValue()));
                                        }
/* 1698 */                              i6 += 3;
/* 1700 */                              i4 = 1048575;
/* 1703 */                              iooioo0oo = this;
/* 1705 */                              i7 = i2;
/* 1706 */                              i5 = i;
/* 1707 */                              entry = entry2;
                                    case 52:
/* 505 */                               if (iooioo0oo.I00100l0(obj, i8, i6)) {
/* 525 */                                   ((ilIO10iO) i1iool.I00iOIl).I0001Ioi1lo(i8, Float.floatToRawIntBits(((Float) l0II0IlI.I000II(obj, j)).floatValue()));
                                        }
/* 1698 */                              i6 += 3;
/* 1700 */                              i4 = 1048575;
/* 1703 */                              iooioo0oo = this;
/* 1705 */                              i7 = i2;
/* 1706 */                              i5 = i;
/* 1707 */                              entry = entry2;
                                    case 53:
/* 486 */                               if (iooioo0oo.I00100l0(obj, i8, i6)) {
/* 496 */                                   ((ilIO10iO) i1iool.I00iOIl).I00100l0(i8, I001i1O0Ol(j, obj));
                                        }
/* 1698 */                              i6 += 3;
/* 1700 */                              i4 = 1048575;
/* 1703 */                              iooioo0oo = this;
/* 1705 */                              i7 = i2;
/* 1706 */                              i5 = i;
/* 1707 */                              entry = entry2;
                                    case 54:
/* 467 */                               if (iooioo0oo.I00100l0(obj, i8, i6)) {
/* 477 */                                   ((ilIO10iO) i1iool.I00iOIl).I00100l0(i8, I001i1O0Ol(j, obj));
                                        }
/* 1698 */                              i6 += 3;
/* 1700 */                              i4 = 1048575;
/* 1703 */                              iooioo0oo = this;
/* 1705 */                              i7 = i2;
/* 1706 */                              i5 = i;
/* 1707 */                              entry = entry2;
                                    case 55:
/* 448 */                               if (iooioo0oo.I00100l0(obj, i8, i6)) {
/* 458 */                                   ((ilIO10iO) i1iool.I00iOIl).I000OiO(i8, I0010o(j, obj));
                                        }
/* 1698 */                              i6 += 3;
/* 1700 */                              i4 = 1048575;
/* 1703 */                              iooioo0oo = this;
/* 1705 */                              i7 = i2;
/* 1706 */                              i5 = i;
/* 1707 */                              entry = entry2;
                                    case 56:
/* 429 */                               if (iooioo0oo.I00100l0(obj, i8, i6)) {
/* 439 */                                   ((ilIO10iO) i1iool.I00iOIl).I000O01llI0(i8, I001i1O0Ol(j, obj));
                                        }
/* 1698 */                              i6 += 3;
/* 1700 */                              i4 = 1048575;
/* 1703 */                              iooioo0oo = this;
/* 1705 */                              i7 = i2;
/* 1706 */                              i5 = i;
/* 1707 */                              entry = entry2;
                                    case 57:
/* 410 */                               if (iooioo0oo.I00100l0(obj, i8, i6)) {
/* 420 */                                   ((ilIO10iO) i1iool.I00iOIl).I0001Ioi1lo(i8, I0010o(j, obj));
                                        }
/* 1698 */                              i6 += 3;
/* 1700 */                              i4 = 1048575;
/* 1703 */                              iooioo0oo = this;
/* 1705 */                              i7 = i2;
/* 1706 */                              i5 = i;
/* 1707 */                              entry = entry2;
                                    case 58:
/* 380 */                               if (iooioo0oo.I00100l0(obj, i8, i6)) {
/* 388 */                                   boolean zBooleanValue = ((Boolean) l0II0IlI.I000II(obj, j)).booleanValue();
/* 394 */                                   ilIO10iO ilio10io3 = (ilIO10iO) i1iool.I00iOIl;
/* 398 */                                   ilio10io3.I000oI1ioi(i8 << 3);
/* 401 */                                   ilio10io3.I0000Il00O(zBooleanValue ? (byte) 1 : (byte) 0);
                                        }
/* 1698 */                              i6 += 3;
/* 1700 */                              i4 = 1048575;
/* 1703 */                              iooioo0oo = this;
/* 1705 */                              i7 = i2;
/* 1706 */                              i5 = i;
/* 1707 */                              entry = entry2;
                                    case 59:
/* 344 */                               if (iooioo0oo.I00100l0(obj, i8, i6)) {
/* 346 */                                   Object object2 = unsafe.getObject(obj, j);
/* 352 */                                   if (object2 instanceof String) {
/* 360 */                                       ((ilIO10iO) i1iool.I00iOIl).I000l1(i8, (String) object2);
                                            } else {
/* 371 */                                       ((ilIO10iO) i1iool.I00iOIl).I0000oI00(i8, (il1oII0OlIo) object2);
                                            }
                                        }
/* 1698 */                              i6 += 3;
/* 1700 */                              i4 = 1048575;
/* 1703 */                              iooioo0oo = this;
/* 1705 */                              i7 = i2;
/* 1706 */                              i5 = i;
/* 1707 */                              entry = entry2;
                                    case 60:
/* 323 */                               if (iooioo0oo.I00100l0(obj, i8, i6)) {
/* 333 */                                   i1iool.I0000O(i8, unsafe.getObject(obj, j), iooioo0oo.I001iOo1i0O(i6));
                                        }
/* 1698 */                              i6 += 3;
/* 1700 */                              i4 = 1048575;
/* 1703 */                              iooioo0oo = this;
/* 1705 */                              i7 = i2;
/* 1706 */                              i5 = i;
/* 1707 */                              entry = entry2;
                                    case 61:
/* 300 */                               if (iooioo0oo.I00100l0(obj, i8, i6)) {
/* 312 */                                   ((ilIO10iO) i1iool.I00iOIl).I0000oI00(i8, (il1oII0OlIo) unsafe.getObject(obj, j));
                                        }
/* 1698 */                              i6 += 3;
/* 1700 */                              i4 = 1048575;
/* 1703 */                              iooioo0oo = this;
/* 1705 */                              i7 = i2;
/* 1706 */                              i5 = i;
/* 1707 */                              entry = entry2;
                                    case 62:
/* 279 */                               if (iooioo0oo.I00100l0(obj, i8, i6)) {
/* 289 */                                   ((ilIO10iO) i1iool.I00iOIl).I000o00OoI0I(i8, I0010o(j, obj));
                                        }
/* 1698 */                              i6 += 3;
/* 1700 */                              i4 = 1048575;
/* 1703 */                              iooioo0oo = this;
/* 1705 */                              i7 = i2;
/* 1706 */                              i5 = i;
/* 1707 */                              entry = entry2;
                                    case 63:
/* 261 */                               if (iooioo0oo.I00100l0(obj, i8, i6)) {
/* 271 */                                   ((ilIO10iO) i1iool.I00iOIl).I000OiO(i8, I0010o(j, obj));
                                        }
/* 1698 */                              i6 += 3;
/* 1700 */                              i4 = 1048575;
/* 1703 */                              iooioo0oo = this;
/* 1705 */                              i7 = i2;
/* 1706 */                              i5 = i;
/* 1707 */                              entry = entry2;
                                    case Barcode.FORMAT_EAN_8:
/* 243 */                               if (iooioo0oo.I00100l0(obj, i8, i6)) {
/* 253 */                                   ((ilIO10iO) i1iool.I00iOIl).I0001Ioi1lo(i8, I0010o(j, obj));
                                        }
/* 1698 */                              i6 += 3;
/* 1700 */                              i4 = 1048575;
/* 1703 */                              iooioo0oo = this;
/* 1705 */                              i7 = i2;
/* 1706 */                              i5 = i;
/* 1707 */                              entry = entry2;
                                    case 65:
/* 225 */                               if (iooioo0oo.I00100l0(obj, i8, i6)) {
/* 235 */                                   ((ilIO10iO) i1iool.I00iOIl).I000O01llI0(i8, I001i1O0Ol(j, obj));
                                        }
/* 1698 */                              i6 += 3;
/* 1700 */                              i4 = 1048575;
/* 1703 */                              iooioo0oo = this;
/* 1705 */                              i7 = i2;
/* 1706 */                              i5 = i;
/* 1707 */                              entry = entry2;
                                    case 66:
/* 202 */                               if (iooioo0oo.I00100l0(obj, i8, i6)) {
/* 204 */                                   int iI0010o = I0010o(j, obj);
/* 217 */                                   ((ilIO10iO) i1iool.I00iOIl).I000o00OoI0I(i8, (iI0010o >> 31) ^ (iI0010o + iI0010o));
                                        }
/* 1698 */                              i6 += 3;
/* 1700 */                              i4 = 1048575;
/* 1703 */                              iooioo0oo = this;
/* 1705 */                              i7 = i2;
/* 1706 */                              i5 = i;
/* 1707 */                              entry = entry2;
                                    case 67:
/* 179 */                               if (iooioo0oo.I00100l0(obj, i8, i6)) {
/* 181 */                                   long jI001i1O0Ol = I001i1O0Ol(j, obj);
/* 194 */                                   ((ilIO10iO) i1iool.I00iOIl).I00100l0(i8, (jI001i1O0Ol + jI001i1O0Ol) ^ (jI001i1O0Ol >> 63));
                                        }
/* 1698 */                              i6 += 3;
/* 1700 */                              i4 = 1048575;
/* 1703 */                              iooioo0oo = this;
/* 1705 */                              i7 = i2;
/* 1706 */                              i5 = i;
/* 1707 */                              entry = entry2;
                                    case 68:
/* 159 */                               if (iooioo0oo.I00100l0(obj, i8, i6)) {
/* 171 */                                   i1iool.I0000Il00O(i8, unsafe.getObject(obj, j), iooioo0oo.I001iOo1i0O(i6));
                                        }
/* 1698 */                              i6 += 3;
/* 1700 */                              i4 = 1048575;
/* 1703 */                              iooioo0oo = this;
/* 1705 */                              i7 = i2;
/* 1706 */                              i5 = i;
/* 1707 */                              entry = entry2;
                                    default:
/* 1698 */                              i6 += 3;
/* 1700 */                              i4 = 1048575;
/* 1703 */                              iooioo0oo = this;
/* 1705 */                              i7 = i2;
/* 1706 */                              i5 = i;
/* 1707 */                              entry = entry2;
                                }
                            }
                        }
/* 142 */               long j3 = iI001IO000 & i4;
                        switch (iI001IIilI0O) {
                        }
                    }
/* 1712 */          while (entry != null) {
/* 1714 */              iol0loii11.getClass();
/* 1717 */              iOl0lOIi11.I001IIilI0O(i1iool, entry);
/* 1734 */              entry = it.hasNext() ? (Map.Entry) it.next() : null;
                    }
/* 1741 */          ((illOil) obj).zzc.I0000O(i1iool);
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
                public final int I0000oI00(il00ioIl il00ioil) {
                    int i;
                    int i2;
                    int iI00000oIO;
                    int iI00000oOI;
                    int iI00000oIO2;
                    int iI0001Ioi1lo;
                    int iI00000oIO3;
                    int iI00000oOI2;
                    int i3;
                    int iI00000oIO4;
                    int i4;
                    int iI00000oOI3;
                    int iI000O01llI0;
                    int size;
                    int iI000o00OoI0I;
                    int iI00000oIO5;
                    int iI00000oIO6;
                    int iI00000oIO7;
                    int iI00000oIO8;
                    int size2;
                    int iI00000oIO9;
                    int size3;
                    int iI00000oIO10;
                    int iI00000oOI4;
                    int iI00000oIO11;
                    int iI00000oOI5;
                    int iI00000oIO12;
                    int iI0001Ioi1lo2;
                    int iI0010o;
/* 1 */             ioOioO0Oo iooioo0oo = this;
/* 3 */             il00ioIl il00ioil2 = il00ioil;
/* 5 */             int[] iArr = iooioo0oo.I00000oIO;
/* 7 */             int i5 = 1048575;
/* 10 */            int i6 = 1048575;
/* 11 */            int i7 = 0;
/* 12 */            int i8 = 0;
/* 13 */            int iI001lloI = 0;
/* 15 */            while (i7 < iArr.length) {
/* 17 */                int iI001IO000 = iooioo0oo.I001IO000(i7);
/* 21 */                int iI001IIilI0O = I001IIilI0O(iI001IO000);
/* 27 */                int i9 = iArr[i7];
/* 29 */                int i10 = iArr[i7 + 2];
/* 31 */                int i11 = i10 & i5;
/* 38 */                Unsafe unsafe = I000lI;
/* 40 */                if (iI001IIilI0O <= 17) {
/* 42 */                    if (i11 != i6) {
/* 50 */                        i8 = i11 == i5 ? 0 : unsafe.getInt(il00ioil2, i11);
/* 55 */                        i6 = i11;
                            }
/* 58 */                    i = 1 << (i10 >>> 20);
                        } else {
/* 61 */                    i = 0;
                        }
/* 63 */                int i12 = iI001IO000 & i5;
/* 68 */                if (iI001IIilI0O >= ili0l110.I00iiI.I00iOIl) {
/* 72 */                    int i13 = ili0l110.I00iiO.I00iOIl;
                        }
                        long j = i12;
/* 77 */                int iI00000oIO13 = 4;
                        switch (iI001IIilI0O) {
                            case 0:
/* 1730 */                      if (iooioo0oo.I000o00OoI0I(il00ioil2, i7, i6, i8, i)) {
/* 1734 */                          iI001lloI = OooioIOo1.I001lloI(i9 << 3, 8, iI001lloI);
                                }
/* 1738 */                      i7 += 3;
/* 1740 */                      il00ioil2 = il00ioil;
/* 1742 */                      i5 = 1048575;
                            case 1:
/* 1715 */                      i2 = 4;
/* 1721 */                      if (iooioo0oo.I000o00OoI0I(il00ioil2, i7, i6, i8, i)) {
/* 1465 */                          iI001lloI = OooioIOo1.I001lloI(i9 << 3, i2, iI001lloI);
                                }
/* 1410 */                      iooioo0oo = this;
/* 1738 */                      i7 += 3;
/* 1740 */                      il00ioil2 = il00ioil;
/* 1742 */                      i5 = 1048575;
                            case 2:
/* 1697 */                      if (iooioo0oo.I000o00OoI0I(il00ioil2, i7, i6, i8, i)) {
/* 1701 */                          long j2 = unsafe.getLong(il00ioil2, j);
/* 1705 */                          iI00000oIO = ilIO10iO.I00000oIO(i9 << 3);
/* 1709 */                          iI00000oOI = ilIO10iO.I00000oOI(j2);
/* 1409 */                          iI001lloI += iI00000oOI + iI00000oIO;
                                }
/* 1410 */                      iooioo0oo = this;
/* 1738 */                      i7 += 3;
/* 1740 */                      il00ioil2 = il00ioil;
/* 1742 */                      i5 = 1048575;
                            case 3:
/* 1674 */                      if (iooioo0oo.I000o00OoI0I(il00ioil2, i7, i6, i8, i)) {
/* 1678 */                          long j3 = unsafe.getLong(il00ioil2, j);
/* 1682 */                          iI00000oIO = ilIO10iO.I00000oIO(i9 << 3);
/* 1686 */                          iI00000oOI = ilIO10iO.I00000oOI(j3);
/* 1409 */                          iI001lloI += iI00000oOI + iI00000oIO;
                                }
/* 1410 */                      iooioo0oo = this;
/* 1738 */                      i7 += 3;
/* 1740 */                      il00ioil2 = il00ioil;
/* 1742 */                      i5 = 1048575;
                            case 4:
/* 1650 */                      if (iooioo0oo.I000o00OoI0I(il00ioil2, i7, i6, i8, i)) {
/* 1654 */                          long j4 = unsafe.getInt(il00ioil2, j);
/* 1659 */                          iI00000oIO = ilIO10iO.I00000oIO(i9 << 3);
/* 1663 */                          iI00000oOI = ilIO10iO.I00000oOI(j4);
/* 1409 */                          iI001lloI += iI00000oOI + iI00000oIO;
                                }
/* 1410 */                      iooioo0oo = this;
/* 1738 */                      i7 += 3;
/* 1740 */                      il00ioil2 = il00ioil;
/* 1742 */                      i5 = 1048575;
                            case 5:
/* 1641 */                      if (iooioo0oo.I000o00OoI0I(il00ioil2, i7, i6, i8, i)) {
/* 1450 */                          iI001lloI = OooioIOo1.I001lloI(i9 << 3, 8, iI001lloI);
                                }
/* 1410 */                      iooioo0oo = this;
/* 1738 */                      i7 += 3;
/* 1740 */                      il00ioil2 = il00ioil;
/* 1742 */                      i5 = 1048575;
                            case 6:
/* 1626 */                      i2 = 4;
/* 1632 */                      if (iooioo0oo.I000o00OoI0I(il00ioil2, i7, i6, i8, i)) {
                                }
/* 1410 */                      iooioo0oo = this;
/* 1738 */                      i7 += 3;
/* 1740 */                      il00ioil2 = il00ioil;
/* 1742 */                      i5 = 1048575;
                                break;
                            case 7:
/* 1616 */                      if (iooioo0oo.I000o00OoI0I(il00ioil2, i7, i6, i8, i)) {
/* 1620 */                          iI001lloI = OooioIOo1.I001lloI(i9 << 3, 1, iI001lloI);
                                }
/* 1410 */                      iooioo0oo = this;
/* 1738 */                      i7 += 3;
/* 1740 */                      il00ioil2 = il00ioil;
/* 1742 */                      i5 = 1048575;
                            case 8:
/* 1576 */                      if (iooioo0oo.I000o00OoI0I(il00ioil2, i7, i6, i8, i)) {
/* 1578 */                          int i14 = i9 << 3;
/* 1580 */                          Object object = unsafe.getObject(il00ioil2, j);
/* 1586 */                          if (object instanceof il1oII0OlIo) {
/* 1590 */                              iI00000oIO2 = ilIO10iO.I00000oIO(i14);
/* 1594 */                              iI0001Ioi1lo = ((il1oII0OlIo) object).I0001Ioi1lo();
/* 1534 */                              iI001lloI = io1OllI.I00100o1O0lo(iI0001Ioi1lo, iI0001Ioi1lo, iI00000oIO2, iI001lloI);
                                    } else {
/* 1601 */                              iI00000oIO = ilIO10iO.I00000oIO(i14);
/* 1605 */                              iI00000oOI = ilIO10iO.I0010I0i((String) object);
/* 1409 */                              iI001lloI += iI00000oOI + iI00000oIO;
                                    }
                                }
/* 1410 */                      iooioo0oo = this;
/* 1738 */                      i7 += 3;
/* 1740 */                      il00ioil2 = il00ioil;
/* 1742 */                      i5 = 1048575;
                            case 9:
/* 1545 */                      if (iooioo0oo.I000o00OoI0I(il00ioil2, i7, i6, i8, i)) {
/* 1547 */                          Object object2 = unsafe.getObject(il00ioil2, j);
/* 1551 */                          iooIIllo iooiilloI001iOo1i0O = iooioo0oo.I001iOo1i0O(i7);
/* 1555 */                          i1O01oOIoI0I i1o01ooioi0i = iooiolOil0.I00000oIO;
/* 1561 */                          iI00000oIO3 = ilIO10iO.I00000oIO(i9 << 3);
/* 1565 */                          iI00000oOI2 = ((il00ioIl) object2).I00000oOI(iooiilloI001iOo1i0O);
/* 290 */                           iI001lloI = io1OllI.I00100o1O0lo(iI00000oOI2, iI00000oOI2, iI00000oIO3, iI001lloI);
/* 1738 */                          i7 += 3;
/* 1740 */                          il00ioil2 = il00ioil;
/* 1742 */                          i5 = 1048575;
                                } else {
/* 1738 */                          i7 += 3;
/* 1740 */                          il00ioil2 = il00ioil;
/* 1742 */                          i5 = 1048575;
                                }
                            case 10:
/* 1516 */                      if (iooioo0oo.I000o00OoI0I(il00ioil2, i7, i6, i8, i)) {
/* 1524 */                          il1oII0OlIo il1oii0olio = (il1oII0OlIo) unsafe.getObject(il00ioil2, j);
/* 1526 */                          iI00000oIO2 = ilIO10iO.I00000oIO(i9 << 3);
/* 1530 */                          iI0001Ioi1lo = il1oii0olio.I0001Ioi1lo();
/* 1534 */                          iI001lloI = io1OllI.I00100o1O0lo(iI0001Ioi1lo, iI0001Ioi1lo, iI00000oIO2, iI001lloI);
                                }
/* 1410 */                      iooioo0oo = this;
/* 1738 */                      i7 += 3;
/* 1740 */                      il00ioil2 = il00ioil;
/* 1742 */                      i5 = 1048575;
                            case 11:
/* 1498 */                      if (iooioo0oo.I000o00OoI0I(il00ioil2, i7, i6, i8, i)) {
/* 1502 */                          i3 = unsafe.getInt(il00ioil2, j);
/* 1506 */                          iI00000oIO4 = ilIO10iO.I00000oIO(i9 << 3);
/* 1436 */                          iI001lloI = OooioIOo1.I001lloI(i3, iI00000oIO4, iI001lloI);
                                }
/* 1410 */                      iooioo0oo = this;
/* 1738 */                      i7 += 3;
/* 1740 */                      il00ioil2 = il00ioil;
/* 1742 */                      i5 = 1048575;
                            case 12:
/* 1475 */                      if (iooioo0oo.I000o00OoI0I(il00ioil2, i7, i6, i8, i)) {
/* 1479 */                          long j5 = unsafe.getInt(il00ioil2, j);
/* 1484 */                          iI00000oIO = ilIO10iO.I00000oIO(i9 << 3);
/* 1488 */                          iI00000oOI = ilIO10iO.I00000oOI(j5);
/* 1409 */                          iI001lloI += iI00000oOI + iI00000oIO;
                                }
/* 1410 */                      iooioo0oo = this;
/* 1738 */                      i7 += 3;
/* 1740 */                      il00ioil2 = il00ioil;
/* 1742 */                      i5 = 1048575;
                            case 13:
/* 1455 */                      i2 = 4;
/* 1461 */                      if (iooioo0oo.I000o00OoI0I(il00ioil2, i7, i6, i8, i)) {
                                }
/* 1410 */                      iooioo0oo = this;
/* 1738 */                      i7 += 3;
/* 1740 */                      il00ioil2 = il00ioil;
/* 1742 */                      i5 = 1048575;
                                break;
                            case 14:
/* 1446 */                      if (iooioo0oo.I000o00OoI0I(il00ioil2, i7, i6, i8, i)) {
                                }
/* 1410 */                      iooioo0oo = this;
/* 1738 */                      i7 += 3;
/* 1740 */                      il00ioil2 = il00ioil;
/* 1742 */                      i5 = 1048575;
                                break;
                            case 15:
/* 1419 */                      if (iooioo0oo.I000o00OoI0I(il00ioil2, i7, i6, i8, i)) {
/* 1423 */                          int i15 = unsafe.getInt(il00ioil2, j);
/* 1431 */                          iI00000oIO4 = ilIO10iO.I00000oIO(i9 << 3);
/* 1435 */                          i3 = (i15 >> 31) ^ (i15 + i15);
/* 1436 */                          iI001lloI = OooioIOo1.I001lloI(i3, iI00000oIO4, iI001lloI);
                                }
/* 1410 */                      iooioo0oo = this;
/* 1738 */                      i7 += 3;
/* 1740 */                      il00ioil2 = il00ioil;
/* 1742 */                      i5 = 1048575;
                            case 16:
/* 1387 */                      if (iooioo0oo.I000o00OoI0I(il00ioil2, i7, i6, i8, i)) {
/* 1391 */                          long j6 = unsafe.getLong(il00ioil2, j);
/* 1399 */                          iI00000oIO = ilIO10iO.I00000oIO(i9 << 3);
/* 1404 */                          iI00000oOI = ilIO10iO.I00000oOI((j6 >> 63) ^ (j6 + j6));
/* 1409 */                          iI001lloI += iI00000oOI + iI00000oIO;
                                }
/* 1410 */                      iooioo0oo = this;
/* 1738 */                      i7 += 3;
/* 1740 */                      il00ioil2 = il00ioil;
/* 1742 */                      i5 = 1048575;
                            case 17:
/* 1357 */                      if (iooioo0oo.I000o00OoI0I(il00ioil2, i7, i6, i8, i)) {
/* 1363 */                          il00ioIl il00ioil3 = (il00ioIl) unsafe.getObject(il00ioil2, j);
/* 1365 */                          iooIIllo iooiilloI001iOo1i0O2 = iooioo0oo.I001iOo1i0O(i7);
/* 1371 */                          int iI00000oIO14 = ilIO10iO.I00000oIO(i9 << 3);
/* 1375 */                          i4 = iI00000oIO14 + iI00000oIO14;
/* 1376 */                          iI00000oOI3 = il00ioil3.I00000oOI(iooiilloI001iOo1i0O2);
/* 112 */                           iI000O01llI0 = iI00000oOI3 + i4;
/* 113 */                           iI001lloI += iI000O01llI0;
/* 1738 */                          i7 += 3;
/* 1740 */                          il00ioil2 = il00ioil;
/* 1742 */                          i5 = 1048575;
                                } else {
/* 1738 */                          i7 += 3;
/* 1740 */                          il00ioil2 = il00ioil;
/* 1742 */                          i5 = 1048575;
                                }
                            case PoseLandmark.RIGHT_PINKY:
/* 1346 */                      iI000O01llI0 = iooiolOil0.I000O01llI0(i9, (List) unsafe.getObject(il00ioil2, j));
/* 113 */                       iI001lloI += iI000O01llI0;
/* 1738 */                      i7 += 3;
/* 1740 */                      il00ioil2 = il00ioil;
/* 1742 */                      i5 = 1048575;
                            case PoseLandmark.LEFT_INDEX:
/* 1334 */                      iI000O01llI0 = iooiolOil0.I000II(i9, (List) unsafe.getObject(il00ioil2, j));
/* 113 */                       iI001lloI += iI000O01llI0;
/* 1738 */                      i7 += 3;
/* 1740 */                      il00ioil2 = il00ioil;
/* 1742 */                      i5 = 1048575;
                            case PoseLandmark.RIGHT_INDEX:
/* 1300 */                      List list = (List) unsafe.getObject(il00ioil2, j);
/* 1302 */                      i1O01oOIoI0I i1o01ooioi0i2 = iooiolOil0.I00000oIO;
/* 1326 */                      iI00000oIO6 = list.size() == 0 ? 0 : (ilIO10iO.I00000oIO(i9 << 3) * list.size()) + iooiolOil0.I000OiO(list);
/* 1213 */                      iI001lloI += iI00000oIO6;
/* 1738 */                      i7 += 3;
/* 1740 */                      il00ioil2 = il00ioil;
/* 1742 */                      i5 = 1048575;
                            case PoseLandmark.LEFT_THUMB:
/* 1272 */                      List list2 = (List) unsafe.getObject(il00ioil2, j);
/* 1274 */                      i1O01oOIoI0I i1o01ooioi0i3 = iooiolOil0.I00000oIO;
/* 1276 */                      size = list2.size();
/* 1280 */                      if (size != 0) {
/* 1286 */                          iI000o00OoI0I = iooiolOil0.I000o00OoI0I(list2);
/* 1290 */                          iI00000oIO5 = ilIO10iO.I00000oIO(i9 << 3);
/* 885 */                           iI00000oIO7 = (iI00000oIO5 * size) + iI000o00OoI0I;
/* 886 */                           iI001lloI += iI00000oIO7;
/* 1738 */                          i7 += 3;
/* 1740 */                          il00ioil2 = il00ioil;
/* 1742 */                          i5 = 1048575;
                                }
/* 871 */                       iI00000oIO7 = 0;
/* 886 */                       iI001lloI += iI00000oIO7;
/* 1738 */                      i7 += 3;
/* 1740 */                      il00ioil2 = il00ioil;
/* 1742 */                      i5 = 1048575;
                            case PoseLandmark.RIGHT_THUMB:
/* 1244 */                      List list3 = (List) unsafe.getObject(il00ioil2, j);
/* 1246 */                      i1O01oOIoI0I i1o01ooioi0i4 = iooiolOil0.I00000oIO;
/* 1248 */                      size = list3.size();
/* 1252 */                      if (size != 0) {
/* 1258 */                          iI000o00OoI0I = iooiolOil0.I000OOo1O(list3);
/* 1262 */                          iI00000oIO5 = ilIO10iO.I00000oIO(i9 << 3);
/* 885 */                           iI00000oIO7 = (iI00000oIO5 * size) + iI000o00OoI0I;
/* 886 */                           iI001lloI += iI00000oIO7;
/* 1738 */                          i7 += 3;
/* 1740 */                          il00ioil2 = il00ioil;
/* 1742 */                          i5 = 1048575;
                                }
/* 871 */                       iI00000oIO7 = 0;
/* 886 */                       iI001lloI += iI00000oIO7;
/* 1738 */                      i7 += 3;
/* 1740 */                      il00ioil2 = il00ioil;
/* 1742 */                      i5 = 1048575;
                            case PoseLandmark.LEFT_HIP:
/* 1234 */                      iI000O01llI0 = iooiolOil0.I000O01llI0(i9, (List) unsafe.getObject(il00ioil2, j));
/* 113 */                       iI001lloI += iI000O01llI0;
/* 1738 */                      i7 += 3;
/* 1740 */                      il00ioil2 = il00ioil;
/* 1742 */                      i5 = 1048575;
                            case PoseLandmark.RIGHT_HIP:
/* 1222 */                      iI000O01llI0 = iooiolOil0.I000II(i9, (List) unsafe.getObject(il00ioil2, j));
/* 113 */                       iI001lloI += iI000O01llI0;
/* 1738 */                      i7 += 3;
/* 1740 */                      il00ioil2 = il00ioil;
/* 1742 */                      i5 = 1048575;
                            case PoseLandmark.LEFT_KNEE:
/* 1192 */                      List list4 = (List) unsafe.getObject(il00ioil2, j);
/* 1194 */                      i1O01oOIoI0I i1o01ooioi0i5 = iooiolOil0.I00000oIO;
/* 1196 */                      int size4 = list4.size();
/* 1200 */                      if (size4 != 0) {
/* 1212 */                          iI00000oIO6 = (ilIO10iO.I00000oIO(i9 << 3) + 1) * size4;
                                }
/* 1213 */                      iI001lloI += iI00000oIO6;
/* 1738 */                      i7 += 3;
/* 1740 */                      il00ioil2 = il00ioil;
/* 1742 */                      i5 = 1048575;
                                break;
                            case PoseLandmark.RIGHT_KNEE:
/* 1095 */                      List list5 = (List) unsafe.getObject(il00ioil2, j);
/* 1097 */                      i1O01oOIoI0I i1o01ooioi0i6 = iooiolOil0.I00000oIO;
/* 1099 */                      int size5 = list5.size();
/* 1103 */                      if (size5 == 0) {
/* 871 */                           iI00000oIO7 = 0;
                                } else {
/* 1113 */                          iI00000oIO7 = ilIO10iO.I00000oIO(i9 << 3) * size5;
/* 1116 */                          if (list5 instanceof io0lO0Oi) {
/* 1118 */                              io0lO0Oi io0lo0oi = (io0lO0Oi) list5;
/* 1122 */                              for (int i16 = 0; i16 < size5; i16++) {
/* 1124 */                                  Object objZza = io0lo0oi.zza();
/* 1130 */                                  if (objZza instanceof il1oII0OlIo) {
/* 1134 */                                      int iI0001Ioi1lo3 = ((il1oII0OlIo) objZza).I0001Ioi1lo();
/* 1138 */                                      iI00000oIO7 = OooioIOo1.I001lloI(iI0001Ioi1lo3, iI0001Ioi1lo3, iI00000oIO7);
                                            } else {
/* 1149 */                                      iI00000oIO7 = ilIO10iO.I0010I0i((String) objZza) + iI00000oIO7;
                                            }
                                        }
                                    } else {
/* 1156 */                              for (int i17 = 0; i17 < size5; i17++) {
/* 1158 */                                  Object obj = list5.get(i17);
/* 1164 */                                  if (obj instanceof il1oII0OlIo) {
/* 1168 */                                      int iI0001Ioi1lo4 = ((il1oII0OlIo) obj).I0001Ioi1lo();
/* 1172 */                                      iI00000oIO7 = OooioIOo1.I001lloI(iI0001Ioi1lo4, iI0001Ioi1lo4, iI00000oIO7);
                                            } else {
/* 1183 */                                      iI00000oIO7 = ilIO10iO.I0010I0i((String) obj) + iI00000oIO7;
                                            }
                                        }
                                    }
                                }
/* 886 */                       iI001lloI += iI00000oIO7;
/* 1738 */                      i7 += 3;
/* 1740 */                      il00ioil2 = il00ioil;
/* 1742 */                      i5 = 1048575;
                            case 27:
/* 1043 */                      List list6 = (List) unsafe.getObject(il00ioil2, j);
/* 1045 */                      iooIIllo iooiilloI001iOo1i0O3 = iooioo0oo.I001iOo1i0O(i7);
/* 1049 */                      i1O01oOIoI0I i1o01ooioi0i7 = iooiolOil0.I00000oIO;
/* 1051 */                      int size6 = list6.size();
/* 1055 */                      if (size6 == 0) {
/* 1057 */                          iI00000oIO8 = 0;
                                } else {
/* 1066 */                          iI00000oIO8 = ilIO10iO.I00000oIO(i9 << 3) * size6;
/* 1069 */                          for (int i18 = 0; i18 < size6; i18++) {
/* 1077 */                              int iI00000oOI6 = ((il00ioIl) list6.get(i18)).I00000oOI(iooiilloI001iOo1i0O3);
/* 1081 */                              iI00000oIO8 = OooioIOo1.I001lloI(iI00000oOI6, iI00000oOI6, iI00000oIO8);
                                    }
                                }
/* 1088 */                      iI001lloI += iI00000oIO8;
/* 1738 */                      i7 += 3;
/* 1740 */                      il00ioil2 = il00ioil;
/* 1742 */                      i5 = 1048575;
                            case PoseLandmark.RIGHT_ANKLE:
/* 995 */                       List list7 = (List) unsafe.getObject(il00ioil2, j);
/* 997 */                       i1O01oOIoI0I i1o01ooioi0i8 = iooiolOil0.I00000oIO;
/* 999 */                       int size7 = list7.size();
/* 1003 */                      if (size7 != 0) {
/* 1013 */                          iI00000oIO7 = ilIO10iO.I00000oIO(i9 << 3) * size7;
/* 1020 */                          for (int i19 = 0; i19 < list7.size(); i19++) {
/* 1028 */                              int iI0001Ioi1lo5 = ((il1oII0OlIo) list7.get(i19)).I0001Ioi1lo();
/* 1032 */                              iI00000oIO7 = OooioIOo1.I001lloI(iI0001Ioi1lo5, iI0001Ioi1lo5, iI00000oIO7);
                                    }
                                }
/* 886 */                       iI001lloI += iI00000oIO7;
/* 1738 */                      i7 += 3;
/* 1740 */                      il00ioil2 = il00ioil;
/* 1742 */                      i5 = 1048575;
                                break;
                            case PoseLandmark.LEFT_HEEL:
/* 969 */                       List list8 = (List) unsafe.getObject(il00ioil2, j);
/* 971 */                       i1O01oOIoI0I i1o01ooioi0i9 = iooiolOil0.I00000oIO;
/* 973 */                       size = list8.size();
/* 977 */                       if (size != 0) {
/* 982 */                           iI000o00OoI0I = iooiolOil0.I000lI(list8);
/* 986 */                           iI00000oIO5 = ilIO10iO.I00000oIO(i9 << 3);
/* 885 */                           iI00000oIO7 = (iI00000oIO5 * size) + iI000o00OoI0I;
/* 886 */                           iI001lloI += iI00000oIO7;
/* 1738 */                          i7 += 3;
/* 1740 */                          il00ioil2 = il00ioil;
/* 1742 */                          i5 = 1048575;
                                }
/* 871 */                       iI00000oIO7 = 0;
/* 886 */                       iI001lloI += iI00000oIO7;
/* 1738 */                      i7 += 3;
/* 1740 */                      il00ioil2 = il00ioil;
/* 1742 */                      i5 = 1048575;
                            case 30:
/* 943 */                       List list9 = (List) unsafe.getObject(il00ioil2, j);
/* 945 */                       i1O01oOIoI0I i1o01ooioi0i10 = iooiolOil0.I00000oIO;
/* 947 */                       size = list9.size();
/* 951 */                       if (size != 0) {
/* 956 */                           iI000o00OoI0I = iooiolOil0.I0001Ioi1lo(list9);
/* 960 */                           iI00000oIO5 = ilIO10iO.I00000oIO(i9 << 3);
/* 885 */                           iI00000oIO7 = (iI00000oIO5 * size) + iI000o00OoI0I;
/* 886 */                           iI001lloI += iI00000oIO7;
/* 1738 */                          i7 += 3;
/* 1740 */                          il00ioil2 = il00ioil;
/* 1742 */                          i5 = 1048575;
                                }
/* 871 */                       iI00000oIO7 = 0;
/* 886 */                       iI001lloI += iI00000oIO7;
/* 1738 */                      i7 += 3;
/* 1740 */                      il00ioil2 = il00ioil;
/* 1742 */                      i5 = 1048575;
                            case PoseLandmark.LEFT_FOOT_INDEX:
/* 933 */                       iI000O01llI0 = iooiolOil0.I000II(i9, (List) unsafe.getObject(il00ioil2, j));
/* 113 */                       iI001lloI += iI000O01llI0;
/* 1738 */                      i7 += 3;
/* 1740 */                      il00ioil2 = il00ioil;
/* 1742 */                      i5 = 1048575;
                            case 32:
/* 921 */                       iI000O01llI0 = iooiolOil0.I000O01llI0(i9, (List) unsafe.getObject(il00ioil2, j));
/* 113 */                       iI001lloI += iI000O01llI0;
/* 1738 */                      i7 += 3;
/* 1740 */                      il00ioil2 = il00ioil;
/* 1742 */                      i5 = 1048575;
                            case 33:
/* 893 */                       List list10 = (List) unsafe.getObject(il00ioil2, j);
/* 895 */                       i1O01oOIoI0I i1o01ooioi0i11 = iooiolOil0.I00000oIO;
/* 897 */                       size = list10.size();
/* 901 */                       if (size != 0) {
/* 906 */                           iI000o00OoI0I = iooiolOil0.I000iOII(list10);
/* 910 */                           iI00000oIO5 = ilIO10iO.I00000oIO(i9 << 3);
/* 885 */                           iI00000oIO7 = (iI00000oIO5 * size) + iI000o00OoI0I;
/* 886 */                           iI001lloI += iI00000oIO7;
/* 1738 */                          i7 += 3;
/* 1740 */                          il00ioil2 = il00ioil;
/* 1742 */                          i5 = 1048575;
                                }
/* 871 */                       iI00000oIO7 = 0;
/* 886 */                       iI001lloI += iI00000oIO7;
/* 1738 */                      i7 += 3;
/* 1740 */                      il00ioil2 = il00ioil;
/* 1742 */                      i5 = 1048575;
                            case 34:
/* 861 */                       List list11 = (List) unsafe.getObject(il00ioil2, j);
/* 863 */                       i1O01oOIoI0I i1o01ooioi0i12 = iooiolOil0.I00000oIO;
/* 865 */                       size = list11.size();
/* 869 */                       if (size != 0) {
/* 876 */                           iI000o00OoI0I = iooiolOil0.I000l1(list11);
/* 880 */                           iI00000oIO5 = ilIO10iO.I00000oIO(i9 << 3);
/* 885 */                           iI00000oIO7 = (iI00000oIO5 * size) + iI000o00OoI0I;
/* 886 */                           iI001lloI += iI00000oIO7;
/* 1738 */                          i7 += 3;
/* 1740 */                          il00ioil2 = il00ioil;
/* 1742 */                          i5 = 1048575;
                                }
/* 871 */                       iI00000oIO7 = 0;
/* 886 */                       iI001lloI += iI00000oIO7;
/* 1738 */                      i7 += 3;
/* 1740 */                      il00ioil2 = il00ioil;
/* 1742 */                      i5 = 1048575;
                            case InputImage.IMAGE_FORMAT_YUV_420_888:
/* 838 */                       List list12 = (List) unsafe.getObject(il00ioil2, j);
/* 840 */                       i1O01oOIoI0I i1o01ooioi0i13 = iooiolOil0.I00000oIO;
/* 846 */                       size2 = list12.size() * 8;
/* 847 */                       if (size2 > 0) {
/* 851 */                           iI00000oIO9 = ilIO10iO.I00000oIO(i9 << 3);
/* 572 */                           iI001lloI = io1OllI.I00100o1O0lo(size2, iI00000oIO9, size2, iI001lloI);
/* 1738 */                          i7 += 3;
/* 1740 */                          il00ioil2 = il00ioil;
/* 1742 */                          i5 = 1048575;
                                } else {
/* 1738 */                          i7 += 3;
/* 1740 */                          il00ioil2 = il00ioil;
/* 1742 */                          i5 = 1048575;
                                }
                            case 36:
/* 815 */                       List list13 = (List) unsafe.getObject(il00ioil2, j);
/* 817 */                       i1O01oOIoI0I i1o01ooioi0i14 = iooiolOil0.I00000oIO;
/* 823 */                       size3 = list13.size() * 4;
/* 824 */                       if (size3 > 0) {
/* 828 */                           iI00000oIO10 = ilIO10iO.I00000oIO(i9 << 3);
/* 640 */                           iI001lloI = io1OllI.I00100o1O0lo(size3, iI00000oIO10, size3, iI001lloI);
/* 1738 */                          i7 += 3;
/* 1740 */                          il00ioil2 = il00ioil;
/* 1742 */                          i5 = 1048575;
                                } else {
/* 1738 */                          i7 += 3;
/* 1740 */                          il00ioil2 = il00ioil;
/* 1742 */                          i5 = 1048575;
                                }
                            case 37:
/* 797 */                       size2 = iooiolOil0.I000OiO((List) unsafe.getObject(il00ioil2, j));
/* 801 */                       if (size2 > 0) {
/* 805 */                           iI00000oIO9 = ilIO10iO.I00000oIO(i9 << 3);
/* 572 */                           iI001lloI = io1OllI.I00100o1O0lo(size2, iI00000oIO9, size2, iI001lloI);
/* 1738 */                          i7 += 3;
/* 1740 */                          il00ioil2 = il00ioil;
/* 1742 */                          i5 = 1048575;
                                } else {
/* 1738 */                          i7 += 3;
/* 1740 */                          il00ioil2 = il00ioil;
/* 1742 */                          i5 = 1048575;
                                }
                            case 38:
/* 777 */                       size2 = iooiolOil0.I000o00OoI0I((List) unsafe.getObject(il00ioil2, j));
/* 781 */                       if (size2 > 0) {
/* 785 */                           iI00000oIO9 = ilIO10iO.I00000oIO(i9 << 3);
/* 572 */                           iI001lloI = io1OllI.I00100o1O0lo(size2, iI00000oIO9, size2, iI001lloI);
/* 1738 */                          i7 += 3;
/* 1740 */                          il00ioil2 = il00ioil;
/* 1742 */                          i5 = 1048575;
                                } else {
/* 1738 */                          i7 += 3;
/* 1740 */                          il00ioil2 = il00ioil;
/* 1742 */                          i5 = 1048575;
                                }
                            case 39:
/* 757 */                       size2 = iooiolOil0.I000OOo1O((List) unsafe.getObject(il00ioil2, j));
/* 761 */                       if (size2 > 0) {
/* 765 */                           iI00000oIO9 = ilIO10iO.I00000oIO(i9 << 3);
/* 572 */                           iI001lloI = io1OllI.I00100o1O0lo(size2, iI00000oIO9, size2, iI001lloI);
/* 1738 */                          i7 += 3;
/* 1740 */                          il00ioil2 = il00ioil;
/* 1742 */                          i5 = 1048575;
                                } else {
/* 1738 */                          i7 += 3;
/* 1740 */                          il00ioil2 = il00ioil;
/* 1742 */                          i5 = 1048575;
                                }
                            case 40:
/* 732 */                       List list14 = (List) unsafe.getObject(il00ioil2, j);
/* 734 */                       i1O01oOIoI0I i1o01ooioi0i15 = iooiolOil0.I00000oIO;
/* 740 */                       size2 = list14.size() * 8;
/* 741 */                       if (size2 > 0) {
/* 745 */                           iI00000oIO9 = ilIO10iO.I00000oIO(i9 << 3);
/* 572 */                           iI001lloI = io1OllI.I00100o1O0lo(size2, iI00000oIO9, size2, iI001lloI);
/* 1738 */                          i7 += 3;
/* 1740 */                          il00ioil2 = il00ioil;
/* 1742 */                          i5 = 1048575;
                                } else {
/* 1738 */                          i7 += 3;
/* 1740 */                          il00ioil2 = il00ioil;
/* 1742 */                          i5 = 1048575;
                                }
                            case 41:
/* 710 */                       List list15 = (List) unsafe.getObject(il00ioil2, j);
/* 712 */                       i1O01oOIoI0I i1o01ooioi0i16 = iooiolOil0.I00000oIO;
/* 718 */                       size3 = list15.size() * 4;
/* 719 */                       if (size3 > 0) {
/* 723 */                           iI00000oIO10 = ilIO10iO.I00000oIO(i9 << 3);
/* 640 */                           iI001lloI = io1OllI.I00100o1O0lo(size3, iI00000oIO10, size3, iI001lloI);
/* 1738 */                          i7 += 3;
/* 1740 */                          il00ioil2 = il00ioil;
/* 1742 */                          i5 = 1048575;
                                } else {
/* 1738 */                          i7 += 3;
/* 1740 */                          il00ioil2 = il00ioil;
/* 1742 */                          i5 = 1048575;
                                }
                            case 42:
/* 688 */                       List list16 = (List) unsafe.getObject(il00ioil2, j);
/* 690 */                       i1O01oOIoI0I i1o01ooioi0i17 = iooiolOil0.I00000oIO;
/* 692 */                       size2 = list16.size();
/* 696 */                       if (size2 > 0) {
/* 700 */                           iI00000oIO9 = ilIO10iO.I00000oIO(i9 << 3);
/* 572 */                           iI001lloI = io1OllI.I00100o1O0lo(size2, iI00000oIO9, size2, iI001lloI);
/* 1738 */                          i7 += 3;
/* 1740 */                          il00ioil2 = il00ioil;
/* 1742 */                          i5 = 1048575;
                                } else {
/* 1738 */                          i7 += 3;
/* 1740 */                          il00ioil2 = il00ioil;
/* 1742 */                          i5 = 1048575;
                                }
                            case 43:
/* 671 */                       size2 = iooiolOil0.I000lI((List) unsafe.getObject(il00ioil2, j));
/* 675 */                       if (size2 > 0) {
/* 679 */                           iI00000oIO9 = ilIO10iO.I00000oIO(i9 << 3);
/* 572 */                           iI001lloI = io1OllI.I00100o1O0lo(size2, iI00000oIO9, size2, iI001lloI);
/* 1738 */                          i7 += 3;
/* 1740 */                          il00ioil2 = il00ioil;
/* 1742 */                          i5 = 1048575;
                                } else {
/* 1738 */                          i7 += 3;
/* 1740 */                          il00ioil2 = il00ioil;
/* 1742 */                          i5 = 1048575;
                                }
                            case 44:
/* 652 */                       size2 = iooiolOil0.I0001Ioi1lo((List) unsafe.getObject(il00ioil2, j));
/* 656 */                       if (size2 > 0) {
/* 660 */                           iI00000oIO9 = ilIO10iO.I00000oIO(i9 << 3);
/* 572 */                           iI001lloI = io1OllI.I00100o1O0lo(size2, iI00000oIO9, size2, iI001lloI);
/* 1738 */                          i7 += 3;
/* 1740 */                          il00ioil2 = il00ioil;
/* 1742 */                          i5 = 1048575;
                                } else {
/* 1738 */                          i7 += 3;
/* 1740 */                          il00ioil2 = il00ioil;
/* 1742 */                          i5 = 1048575;
                                }
                            case BuildConfig.VERSION_CODE:
/* 623 */                       List list17 = (List) unsafe.getObject(il00ioil2, j);
/* 625 */                       i1O01oOIoI0I i1o01ooioi0i18 = iooiolOil0.I00000oIO;
/* 631 */                       size3 = list17.size() * 4;
/* 632 */                       if (size3 > 0) {
/* 636 */                           iI00000oIO10 = ilIO10iO.I00000oIO(i9 << 3);
/* 640 */                           iI001lloI = io1OllI.I00100o1O0lo(size3, iI00000oIO10, size3, iI001lloI);
/* 1738 */                          i7 += 3;
/* 1740 */                          il00ioil2 = il00ioil;
/* 1742 */                          i5 = 1048575;
                                } else {
/* 1738 */                          i7 += 3;
/* 1740 */                          il00ioil2 = il00ioil;
/* 1742 */                          i5 = 1048575;
                                }
                            case 46:
/* 601 */                       List list18 = (List) unsafe.getObject(il00ioil2, j);
/* 603 */                       i1O01oOIoI0I i1o01ooioi0i19 = iooiolOil0.I00000oIO;
/* 609 */                       size2 = list18.size() * 8;
/* 610 */                       if (size2 > 0) {
/* 614 */                           iI00000oIO9 = ilIO10iO.I00000oIO(i9 << 3);
/* 572 */                           iI001lloI = io1OllI.I00100o1O0lo(size2, iI00000oIO9, size2, iI001lloI);
/* 1738 */                          i7 += 3;
/* 1740 */                          il00ioil2 = il00ioil;
/* 1742 */                          i5 = 1048575;
                                } else {
/* 1738 */                          i7 += 3;
/* 1740 */                          il00ioil2 = il00ioil;
/* 1742 */                          i5 = 1048575;
                                }
                            case 47:
/* 584 */                       size2 = iooiolOil0.I000iOII((List) unsafe.getObject(il00ioil2, j));
/* 588 */                       if (size2 > 0) {
/* 592 */                           iI00000oIO9 = ilIO10iO.I00000oIO(i9 << 3);
/* 572 */                           iI001lloI = io1OllI.I00100o1O0lo(size2, iI00000oIO9, size2, iI001lloI);
/* 1738 */                          i7 += 3;
/* 1740 */                          il00ioil2 = il00ioil;
/* 1742 */                          i5 = 1048575;
                                } else {
/* 1738 */                          i7 += 3;
/* 1740 */                          il00ioil2 = il00ioil;
/* 1742 */                          i5 = 1048575;
                                }
                            case 48:
/* 560 */                       size2 = iooiolOil0.I000l1((List) unsafe.getObject(il00ioil2, j));
/* 564 */                       if (size2 > 0) {
/* 568 */                           iI00000oIO9 = ilIO10iO.I00000oIO(i9 << 3);
/* 572 */                           iI001lloI = io1OllI.I00100o1O0lo(size2, iI00000oIO9, size2, iI001lloI);
/* 1738 */                          i7 += 3;
/* 1740 */                          il00ioil2 = il00ioil;
/* 1742 */                          i5 = 1048575;
                                } else {
/* 1738 */                          i7 += 3;
/* 1740 */                          il00ioil2 = il00ioil;
/* 1742 */                          i5 = 1048575;
                                }
                            case 49:
/* 507 */                       List list19 = (List) unsafe.getObject(il00ioil2, j);
/* 509 */                       iooIIllo iooiilloI001iOo1i0O4 = iooioo0oo.I001iOo1i0O(i7);
/* 513 */                       i1O01oOIoI0I i1o01ooioi0i20 = iooiolOil0.I00000oIO;
/* 515 */                       int size8 = list19.size();
/* 519 */                       if (size8 == 0) {
/* 521 */                           iI00000oOI4 = 0;
                                } else {
/* 526 */                           iI00000oOI4 = 0;
/* 527 */                           for (int i20 = 0; i20 < size8; i20++) {
/* 533 */                               il00ioIl il00ioil4 = (il00ioIl) list19.get(i20);
/* 537 */                               int iI00000oIO15 = ilIO10iO.I00000oIO(i9 << 3);
/* 547 */                               iI00000oOI4 += il00ioil4.I00000oOI(iooiilloI001iOo1i0O4) + iI00000oIO15 + iI00000oIO15;
                                    }
                                }
/* 551 */                       iI001lloI += iI00000oOI4;
/* 1738 */                      i7 += 3;
/* 1740 */                      il00ioil2 = il00ioil;
/* 1742 */                      i5 = 1048575;
                            case 50:
/* 448 */                       Object object3 = unsafe.getObject(il00ioil2, j);
/* 452 */                       int i21 = i7 / 3;
/* 459 */                       ioI1oI1I ioi1oi1i = (ioI1oI1I) object3;
/* 461 */                       if (iooioo0oo.I00000oOI[i21 + i21] != null) {
/* 499 */                           OIiilo1Ool0o.I00000oIO();
/* 36 */                            return 0;
                                }
/* 467 */                       if (ioi1oi1i.isEmpty()) {
                                    continue;
                                } else {
/* 473 */                           Iterator it = ioi1oi1i.entrySet().iterator();
/* 481 */                           if (it.hasNext()) {
/* 489 */                               Map.Entry entry = (Map.Entry) it.next();
/* 491 */                               entry.getKey();
/* 494 */                               entry.getValue();
/* 498 */                               throw null;
                                    }
                                }
/* 1738 */                      i7 += 3;
/* 1740 */                      il00ioil2 = il00ioil;
/* 1742 */                      i5 = 1048575;
                            case 51:
/* 444 */                       if (iooioo0oo.I00100l0(il00ioil2, i9, i7)) {
/* 180 */                           iI001lloI = OooioIOo1.I001lloI(i9 << 3, 8, iI001lloI);
                                }
/* 1738 */                      i7 += 3;
/* 1740 */                      il00ioil2 = il00ioil;
/* 1742 */                      i5 = 1048575;
                            case 52:
/* 436 */                       if (!iooioo0oo.I00100l0(il00ioil2, i9, i7)) {
/* 1738 */                          i7 += 3;
/* 1740 */                          il00ioil2 = il00ioil;
/* 1742 */                          i5 = 1048575;
                                }
/* 192 */                       iI0010o = i9 << 3;
/* 166 */                       iI001lloI = OooioIOo1.I001lloI(iI0010o, iI00000oIO13, iI001lloI);
/* 1738 */                      i7 += 3;
/* 1740 */                      il00ioil2 = il00ioil;
/* 1742 */                      i5 = 1048575;
                            case 53:
/* 414 */                       if (iooioo0oo.I00100l0(il00ioil2, i9, i7)) {
/* 418 */                           long jI001i1O0Ol = I001i1O0Ol(j, il00ioil2);
/* 422 */                           iI00000oIO11 = ilIO10iO.I00000oIO(i9 << 3);
/* 426 */                           iI00000oOI5 = ilIO10iO.I00000oOI(jI001i1O0Ol);
/* 142 */                           iI001lloI += iI00000oOI5 + iI00000oIO11;
/* 1738 */                          i7 += 3;
/* 1740 */                          il00ioil2 = il00ioil;
/* 1742 */                          i5 = 1048575;
                                } else {
/* 1738 */                          i7 += 3;
/* 1740 */                          il00ioil2 = il00ioil;
/* 1742 */                          i5 = 1048575;
                                }
                            case 54:
/* 392 */                       if (iooioo0oo.I00100l0(il00ioil2, i9, i7)) {
/* 396 */                           long jI001i1O0Ol2 = I001i1O0Ol(j, il00ioil2);
/* 400 */                           iI00000oIO11 = ilIO10iO.I00000oIO(i9 << 3);
/* 404 */                           iI00000oOI5 = ilIO10iO.I00000oOI(jI001i1O0Ol2);
/* 142 */                           iI001lloI += iI00000oOI5 + iI00000oIO11;
/* 1738 */                          i7 += 3;
/* 1740 */                          il00ioil2 = il00ioil;
/* 1742 */                          i5 = 1048575;
                                } else {
/* 1738 */                          i7 += 3;
/* 1740 */                          il00ioil2 = il00ioil;
/* 1742 */                          i5 = 1048575;
                                }
                            case 55:
/* 369 */                       if (iooioo0oo.I00100l0(il00ioil2, i9, i7)) {
/* 373 */                           long jI0010o = I0010o(j, il00ioil2);
/* 378 */                           iI00000oIO11 = ilIO10iO.I00000oIO(i9 << 3);
/* 382 */                           iI00000oOI5 = ilIO10iO.I00000oOI(jI0010o);
/* 142 */                           iI001lloI += iI00000oOI5 + iI00000oIO11;
/* 1738 */                          i7 += 3;
/* 1740 */                          il00ioil2 = il00ioil;
/* 1742 */                          i5 = 1048575;
                                } else {
/* 1738 */                          i7 += 3;
/* 1740 */                          il00ioil2 = il00ioil;
/* 1742 */                          i5 = 1048575;
                                }
                            case 56:
/* 361 */                       if (iooioo0oo.I00100l0(il00ioil2, i9, i7)) {
                                }
/* 1738 */                      i7 += 3;
/* 1740 */                      il00ioil2 = il00ioil;
/* 1742 */                      i5 = 1048575;
                                break;
                            case 57:
/* 353 */                       if (!iooioo0oo.I00100l0(il00ioil2, i9, i7)) {
/* 1738 */                          i7 += 3;
/* 1740 */                          il00ioil2 = il00ioil;
/* 1742 */                          i5 = 1048575;
                                }
/* 192 */                       iI0010o = i9 << 3;
/* 166 */                       iI001lloI = OooioIOo1.I001lloI(iI0010o, iI00000oIO13, iI001lloI);
/* 1738 */                      i7 += 3;
/* 1740 */                      il00ioil2 = il00ioil;
/* 1742 */                      i5 = 1048575;
                            case 58:
/* 339 */                       if (iooioo0oo.I00100l0(il00ioil2, i9, i7)) {
/* 343 */                           iI001lloI = OooioIOo1.I001lloI(i9 << 3, 1, iI001lloI);
                                }
/* 1738 */                      i7 += 3;
/* 1740 */                      il00ioil2 = il00ioil;
/* 1742 */                      i5 = 1048575;
                            case 59:
/* 300 */                       if (iooioo0oo.I00100l0(il00ioil2, i9, i7)) {
/* 302 */                           int i22 = i9 << 3;
/* 304 */                           Object object4 = unsafe.getObject(il00ioil2, j);
/* 310 */                           if (object4 instanceof il1oII0OlIo) {
/* 314 */                               iI00000oIO12 = ilIO10iO.I00000oIO(i22);
/* 318 */                               iI0001Ioi1lo2 = ((il1oII0OlIo) object4).I0001Ioi1lo();
/* 256 */                               iI001lloI = io1OllI.I00100o1O0lo(iI0001Ioi1lo2, iI0001Ioi1lo2, iI00000oIO12, iI001lloI);
/* 1738 */                              i7 += 3;
/* 1740 */                              il00ioil2 = il00ioil;
/* 1742 */                              i5 = 1048575;
                                    } else {
/* 325 */                               iI00000oIO11 = ilIO10iO.I00000oIO(i22);
/* 329 */                               iI00000oOI5 = ilIO10iO.I0010I0i((String) object4);
/* 142 */                               iI001lloI += iI00000oOI5 + iI00000oIO11;
/* 1738 */                              i7 += 3;
/* 1740 */                              il00ioil2 = il00ioil;
/* 1742 */                              i5 = 1048575;
                                    }
                                } else {
/* 1738 */                          i7 += 3;
/* 1740 */                          il00ioil2 = il00ioil;
/* 1742 */                          i5 = 1048575;
                                }
                            case 60:
/* 266 */                       if (iooioo0oo.I00100l0(il00ioil2, i9, i7)) {
/* 268 */                           Object object5 = unsafe.getObject(il00ioil2, j);
/* 272 */                           iooIIllo iooiilloI001iOo1i0O5 = iooioo0oo.I001iOo1i0O(i7);
/* 276 */                           i1O01oOIoI0I i1o01ooioi0i21 = iooiolOil0.I00000oIO;
/* 282 */                           iI00000oIO3 = ilIO10iO.I00000oIO(i9 << 3);
/* 286 */                           iI00000oOI2 = ((il00ioIl) object5).I00000oOI(iooiilloI001iOo1i0O5);
/* 290 */                           iI001lloI = io1OllI.I00100o1O0lo(iI00000oOI2, iI00000oOI2, iI00000oIO3, iI001lloI);
/* 1738 */                          i7 += 3;
/* 1740 */                          il00ioil2 = il00ioil;
/* 1742 */                          i5 = 1048575;
                                } else {
/* 1738 */                          i7 += 3;
/* 1740 */                          il00ioil2 = il00ioil;
/* 1742 */                          i5 = 1048575;
                                }
                            case 61:
/* 238 */                       if (iooioo0oo.I00100l0(il00ioil2, i9, i7)) {
/* 246 */                           il1oII0OlIo il1oii0olio2 = (il1oII0OlIo) unsafe.getObject(il00ioil2, j);
/* 248 */                           iI00000oIO12 = ilIO10iO.I00000oIO(i9 << 3);
/* 252 */                           iI0001Ioi1lo2 = il1oii0olio2.I0001Ioi1lo();
/* 256 */                           iI001lloI = io1OllI.I00100o1O0lo(iI0001Ioi1lo2, iI0001Ioi1lo2, iI00000oIO12, iI001lloI);
/* 1738 */                          i7 += 3;
/* 1740 */                          il00ioil2 = il00ioil;
/* 1742 */                          i5 = 1048575;
                                } else {
/* 1738 */                          i7 += 3;
/* 1740 */                          il00ioil2 = il00ioil;
/* 1742 */                          i5 = 1048575;
                                }
                            case 62:
/* 221 */                       if (iooioo0oo.I00100l0(il00ioil2, i9, i7)) {
/* 225 */                           iI0010o = I0010o(j, il00ioil2);
/* 229 */                           iI00000oIO13 = ilIO10iO.I00000oIO(i9 << 3);
/* 166 */                           iI001lloI = OooioIOo1.I001lloI(iI0010o, iI00000oIO13, iI001lloI);
/* 1738 */                          i7 += 3;
/* 1740 */                          il00ioil2 = il00ioil;
/* 1742 */                          i5 = 1048575;
                                } else {
/* 1738 */                          i7 += 3;
/* 1740 */                          il00ioil2 = il00ioil;
/* 1742 */                          i5 = 1048575;
                                }
                            case 63:
/* 199 */                       if (iooioo0oo.I00100l0(il00ioil2, i9, i7)) {
/* 203 */                           long jI0010o2 = I0010o(j, il00ioil2);
/* 208 */                           iI00000oIO11 = ilIO10iO.I00000oIO(i9 << 3);
/* 212 */                           iI00000oOI5 = ilIO10iO.I00000oOI(jI0010o2);
/* 142 */                           iI001lloI += iI00000oOI5 + iI00000oIO11;
/* 1738 */                          i7 += 3;
/* 1740 */                          il00ioil2 = il00ioil;
/* 1742 */                          i5 = 1048575;
                                } else {
/* 1738 */                          i7 += 3;
/* 1740 */                          il00ioil2 = il00ioil;
/* 1742 */                          i5 = 1048575;
                                }
                            case Barcode.FORMAT_EAN_8:
/* 190 */                       if (!iooioo0oo.I00100l0(il00ioil2, i9, i7)) {
/* 1738 */                          i7 += 3;
/* 1740 */                          il00ioil2 = il00ioil;
/* 1742 */                          i5 = 1048575;
                                }
/* 192 */                       iI0010o = i9 << 3;
/* 166 */                       iI001lloI = OooioIOo1.I001lloI(iI0010o, iI00000oIO13, iI001lloI);
/* 1738 */                      i7 += 3;
/* 1740 */                      il00ioil2 = il00ioil;
/* 1742 */                      i5 = 1048575;
                            case 65:
/* 176 */                       if (iooioo0oo.I00100l0(il00ioil2, i9, i7)) {
                                }
/* 1738 */                      i7 += 3;
/* 1740 */                      il00ioil2 = il00ioil;
/* 1742 */                      i5 = 1048575;
                                break;
                            case 66:
/* 149 */                       if (iooioo0oo.I00100l0(il00ioil2, i9, i7)) {
/* 153 */                           int iI0010o2 = I0010o(j, il00ioil2);
/* 161 */                           iI00000oIO13 = ilIO10iO.I00000oIO(i9 << 3);
/* 165 */                           iI0010o = (iI0010o2 >> 31) ^ (iI0010o2 + iI0010o2);
/* 166 */                           iI001lloI = OooioIOo1.I001lloI(iI0010o, iI00000oIO13, iI001lloI);
/* 1738 */                          i7 += 3;
/* 1740 */                          il00ioil2 = il00ioil;
/* 1742 */                          i5 = 1048575;
                                } else {
/* 1738 */                          i7 += 3;
/* 1740 */                          il00ioil2 = il00ioil;
/* 1742 */                          i5 = 1048575;
                                }
                            case 67:
/* 120 */                       if (iooioo0oo.I00100l0(il00ioil2, i9, i7)) {
/* 124 */                           long jI001i1O0Ol3 = I001i1O0Ol(j, il00ioil2);
/* 132 */                           iI00000oIO11 = ilIO10iO.I00000oIO(i9 << 3);
/* 137 */                           iI00000oOI5 = ilIO10iO.I00000oOI((jI001i1O0Ol3 >> 63) ^ (jI001i1O0Ol3 + jI001i1O0Ol3));
/* 142 */                           iI001lloI += iI00000oOI5 + iI00000oIO11;
/* 1738 */                          i7 += 3;
/* 1740 */                          il00ioil2 = il00ioil;
/* 1742 */                          i5 = 1048575;
                                } else {
/* 1738 */                          i7 += 3;
/* 1740 */                          il00ioil2 = il00ioil;
/* 1742 */                          i5 = 1048575;
                                }
                            case 68:
/* 89 */                        if (iooioo0oo.I00100l0(il00ioil2, i9, i7)) {
/* 95 */                            il00ioIl il00ioil5 = (il00ioIl) unsafe.getObject(il00ioil2, j);
/* 97 */                            iooIIllo iooiilloI001iOo1i0O6 = iooioo0oo.I001iOo1i0O(i7);
/* 103 */                           int iI00000oIO16 = ilIO10iO.I00000oIO(i9 << 3);
/* 107 */                           i4 = iI00000oIO16 + iI00000oIO16;
/* 108 */                           iI00000oOI3 = il00ioil5.I00000oOI(iooiilloI001iOo1i0O6);
/* 112 */                           iI000O01llI0 = iI00000oOI3 + i4;
/* 113 */                           iI001lloI += iI000O01llI0;
/* 1738 */                          i7 += 3;
/* 1740 */                          il00ioil2 = il00ioil;
/* 1742 */                          i5 = 1048575;
                                } else {
/* 1738 */                          i7 += 3;
/* 1740 */                          il00ioil2 = il00ioil;
/* 1742 */                          i5 = 1048575;
                                }
                            default:
/* 1738 */                      i7 += 3;
/* 1740 */                      il00ioil2 = il00ioil;
/* 1742 */                      i5 = 1048575;
                        }
                    }
/* 1747 */          int iI00000oIO17 = 0;
/* 1759 */          int iI00000oIO18 = ((illOil) il00ioil).zzc.I00000oIO() + iI001lloI;
/* 1762 */          if (!iooioo0oo.I0001Ioi1lo) {
/* 1838 */              return iI00000oIO18;
                    }
/* 1768 */          ilOol10I0IlI ilool10i0ili = ((ill0o1o) il00ioil).zzb;
/* 1772 */          int i23 = ilool10i0ili.I00000oIO.I00iiI;
/* 1774 */          int i24 = 0;
                    while (true) {
/* 1776 */              ioolilol1oO0 ioolilol1oo0 = ilool10i0ili.I00000oIO;
/* 1778 */              if (i24 >= i23) {
/* 1811 */                  for (Map.Entry entry2 : ioolilol1oo0.I00000oIO()) {
/* 1833 */                      iI00000oIO17 = ilOol10I0IlI.I00000oIO((ill110ll) entry2.getKey(), entry2.getValue()) + iI00000oIO17;
                            }
/* 1836 */                  return iI00000oIO18 + iI00000oIO17;
                        }
/* 1780 */              ioooi010 ioooi010VarI0000Il00O = ioolilol1oo0.I0000Il00O(i24);
/* 1794 */              iI00000oIO17 = ilOol10I0IlI.I00000oIO((ill110ll) ioooi010VarI0000Il00O.I00iOIl, ioooi010VarI0000Il00O.I00iiI) + iI00000oIO17;
/* 1796 */              i24++;
                    }
                }

                @Override
                public final boolean I0001Ioi1lo(illOil illoil, illOil illoil2) {
                    boolean zI0000oI00;
/* 1 */             int[] iArr = this.I00000oIO;
/* 4 */             int i = 0;
                    while (true) {
/* 6 */                 if (i < iArr.length) {
/* 8 */                     int iI001IO000 = I001IO000(i);
/* 15 */                    long j = iI001IO000 & 1048575;
                            switch (I001IIilI0O(iI001IO000)) {
                                case 0:
/* 432 */                           if (!I000l1(illoil, illoil2, i)) {
                                        break;
                                    } else {
/* 434 */                               Ooil0oIOI0l0 ooil0oIOI0l0 = l0II0IlI.I0000Il00O;
/* 454 */                               if (Double.doubleToLongBits(ooil0oIOI0l0.I0010I0i(illoil, j)) != Double.doubleToLongBits(ooil0oIOI0l0.I0010I0i(illoil2, j))) {
                                            break;
                                        } else {
                                            continue;
/* 456 */                                   i += 3;
                                        }
                                    }
                                case 1:
/* 405 */                           if (!I000l1(illoil, illoil2, i)) {
                                        break;
                                    } else {
/* 407 */                               Ooil0oIOI0l0 ooil0oIOI0l02 = l0II0IlI.I0000Il00O;
/* 425 */                               if (Float.floatToIntBits(ooil0oIOI0l02.I001IIilI0O(illoil, j)) != Float.floatToIntBits(ooil0oIOI0l02.I001IIilI0O(illoil2, j))) {
                                            break;
                                        } else {
                                            continue;
/* 456 */                                   i += 3;
                                        }
                                    }
                                case 2:
/* 386 */                           if (!I000l1(illoil, illoil2, i) || l0II0IlI.I0001Ioi1lo(illoil, j) != l0II0IlI.I0001Ioi1lo(illoil2, j)) {
                                        break;
                                    } else {
                                        continue;
/* 456 */                               i += 3;
                                    }
                                    break;
                                case 3:
/* 367 */                           if (!I000l1(illoil, illoil2, i) || l0II0IlI.I0001Ioi1lo(illoil, j) != l0II0IlI.I0001Ioi1lo(illoil2, j)) {
                                        break;
                                    } else {
                                        continue;
/* 456 */                               i += 3;
                                    }
                                    break;
                                case 4:
/* 350 */                           if (!I000l1(illoil, illoil2, i) || l0II0IlI.I0000oI00(illoil, j) != l0II0IlI.I0000oI00(illoil2, j)) {
                                        break;
                                    } else {
                                        continue;
/* 456 */                               i += 3;
                                    }
                                    break;
                                case 5:
/* 330 */                           if (!I000l1(illoil, illoil2, i) || l0II0IlI.I0001Ioi1lo(illoil, j) != l0II0IlI.I0001Ioi1lo(illoil2, j)) {
                                        break;
                                    } else {
                                        continue;
/* 456 */                               i += 3;
                                    }
                                    break;
                                case 6:
/* 312 */                           if (!I000l1(illoil, illoil2, i) || l0II0IlI.I0000oI00(illoil, j) != l0II0IlI.I0000oI00(illoil2, j)) {
                                        break;
                                    } else {
                                        continue;
/* 456 */                               i += 3;
                                    }
                                    break;
                                case 7:
/* 292 */                           if (!I000l1(illoil, illoil2, i)) {
                                        break;
                                    } else {
/* 294 */                               Ooil0oIOI0l0 ooil0oIOI0l03 = l0II0IlI.I0000Il00O;
/* 304 */                               if (ooil0oIOI0l03.I00Io1o110i(illoil, j) != ooil0oIOI0l03.I00Io1o110i(illoil2, j)) {
                                            break;
                                        } else {
                                            continue;
/* 456 */                                   i += 3;
                                        }
                                    }
                                case 8:
/* 270 */                           if (!I000l1(illoil, illoil2, i) || !iooiolOil0.I0000oI00(l0II0IlI.I000II(illoil, j), l0II0IlI.I000II(illoil2, j))) {
                                        break;
                                    } else {
                                        continue;
/* 456 */                               i += 3;
                                    }
                                    break;
                                case 9:
/* 248 */                           if (!I000l1(illoil, illoil2, i) || !iooiolOil0.I0000oI00(l0II0IlI.I000II(illoil, j), l0II0IlI.I000II(illoil2, j))) {
                                        break;
                                    } else {
                                        continue;
/* 456 */                               i += 3;
                                    }
                                    break;
                                case 10:
/* 226 */                           if (!I000l1(illoil, illoil2, i) || !iooiolOil0.I0000oI00(l0II0IlI.I000II(illoil, j), l0II0IlI.I000II(illoil2, j))) {
                                        break;
                                    } else {
                                        continue;
/* 456 */                               i += 3;
                                    }
                                    break;
                                case 11:
/* 208 */                           if (!I000l1(illoil, illoil2, i) || l0II0IlI.I0000oI00(illoil, j) != l0II0IlI.I0000oI00(illoil2, j)) {
                                        break;
                                    } else {
                                        continue;
/* 456 */                               i += 3;
                                    }
                                    break;
                                case 12:
/* 190 */                           if (!I000l1(illoil, illoil2, i) || l0II0IlI.I0000oI00(illoil, j) != l0II0IlI.I0000oI00(illoil2, j)) {
                                        break;
                                    } else {
                                        continue;
/* 456 */                               i += 3;
                                    }
                                    break;
                                case 13:
/* 172 */                           if (!I000l1(illoil, illoil2, i) || l0II0IlI.I0000oI00(illoil, j) != l0II0IlI.I0000oI00(illoil2, j)) {
                                        break;
                                    } else {
                                        continue;
/* 456 */                               i += 3;
                                    }
                                    break;
                                case 14:
/* 152 */                           if (!I000l1(illoil, illoil2, i) || l0II0IlI.I0001Ioi1lo(illoil, j) != l0II0IlI.I0001Ioi1lo(illoil2, j)) {
                                        break;
                                    } else {
                                        continue;
/* 456 */                               i += 3;
                                    }
                                    break;
                                case 15:
/* 134 */                           if (!I000l1(illoil, illoil2, i) || l0II0IlI.I0000oI00(illoil, j) != l0II0IlI.I0000oI00(illoil2, j)) {
                                        break;
                                    } else {
                                        continue;
/* 456 */                               i += 3;
                                    }
                                    break;
                                case 16:
/* 114 */                           if (!I000l1(illoil, illoil2, i) || l0II0IlI.I0001Ioi1lo(illoil, j) != l0II0IlI.I0001Ioi1lo(illoil2, j)) {
                                        break;
                                    } else {
                                        continue;
/* 456 */                               i += 3;
                                    }
                                    break;
                                case 17:
/* 92 */                            if (!I000l1(illoil, illoil2, i) || !iooiolOil0.I0000oI00(l0II0IlI.I000II(illoil, j), l0II0IlI.I000II(illoil2, j))) {
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
/* 80 */                            zI0000oI00 = iooiolOil0.I0000oI00(l0II0IlI.I000II(illoil, j), l0II0IlI.I000II(illoil2, j));
                                    break;
                                case 50:
/* 67 */                            zI0000oI00 = iooiolOil0.I0000oI00(l0II0IlI.I000II(illoil, j), l0II0IlI.I000II(illoil2, j));
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
/* 41 */                            if (l0II0IlI.I0000oI00(illoil, j2) != l0II0IlI.I0000oI00(illoil2, j2) || !iooiolOil0.I0000oI00(l0II0IlI.I000II(illoil, j), l0II0IlI.I000II(illoil2, j))) {
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
                        } else if (illoil.zzc.equals(illoil2.zzc)) {
/* 473 */                   if (this.I0001Ioi1lo) {
/* 483 */                       return ((ill0o1o) illoil).zzb.equals(((ill0o1o) illoil2).zzb);
                            }
/* 488 */                   return true;
                        }
                    }
/* 3 */             return false;
                }

                @Override
                public final void I000II(Object obj, byte[] bArr, int i, int i2, i111i0I1 i111i0i1) throws iloll1i {
/* 8 */             I00100o1O0lo(obj, bArr, i, i2, 0, i111i0i1);
                }

                /* JADX WARN: Removed duplicated region for block: B:44:0x00db A[PHI: r2
                  0x00db: PHI (r2v34 int) = (r2v10 int), (r2v35 int) binds: [B:85:0x01ea, B:43:0x00d9] A[DONT_GENERATE, DONT_INLINE]] */
                @Override
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final int I000O01llI0(illOil illoil) {
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
/* 563 */                       jDoubleToLongBits = Double.doubleToLongBits(l0II0IlI.I0000Il00O.I0010I0i(illoil, j));
/* 567 */                       Charset charset = iloi1OI100li.I00000oIO;
/* 74 */                        i5 = i + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                                break;
                            case 1:
/* 541 */                       i2 = i5 * 53;
/* 549 */                       iFloatToIntBits = Float.floatToIntBits(l0II0IlI.I0000Il00O.I001IIilI0O(illoil, j));
/* 52 */                        i5 = iFloatToIntBits + i2;
                                break;
                            case 2:
/* 531 */                       i = i5 * 53;
/* 533 */                       jDoubleToLongBits = l0II0IlI.I0001Ioi1lo(illoil, j);
/* 537 */                       Charset charset2 = iloi1OI100li.I00000oIO;
/* 74 */                        i5 = i + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                                break;
                            case 3:
/* 521 */                       i = i5 * 53;
/* 523 */                       jDoubleToLongBits = l0II0IlI.I0001Ioi1lo(illoil, j);
/* 527 */                       Charset charset3 = iloi1OI100li.I00000oIO;
/* 74 */                        i5 = i + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                                break;
                            case 4:
/* 513 */                       i2 = i5 * 53;
/* 515 */                       iFloatToIntBits = l0II0IlI.I0000oI00(illoil, j);
/* 52 */                        i5 = iFloatToIntBits + i2;
                                break;
                            case 5:
/* 503 */                       i = i5 * 53;
/* 505 */                       jDoubleToLongBits = l0II0IlI.I0001Ioi1lo(illoil, j);
/* 509 */                       Charset charset4 = iloi1OI100li.I00000oIO;
/* 74 */                        i5 = i + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                                break;
                            case 6:
/* 495 */                       i2 = i5 * 53;
/* 497 */                       iFloatToIntBits = l0II0IlI.I0000oI00(illoil, j);
/* 52 */                        i5 = iFloatToIntBits + i2;
                                break;
                            case 7:
/* 481 */                       i3 = i5 * 53;
/* 485 */                       boolean zI00Io1o110i = l0II0IlI.I0000Il00O.I00Io1o110i(illoil, j);
/* 489 */                       Charset charset5 = iloi1OI100li.I00000oIO;
/* 491 */                       if (zI00Io1o110i) {
/* 220 */                           i9 = 1231;
                                }
/* 221 */                       i5 = i9 + i3;
                                break;
                            case 8:
/* 467 */                       i2 = i5 * 53;
/* 475 */                       iFloatToIntBits = ((String) l0II0IlI.I000II(illoil, j)).hashCode();
/* 52 */                        i5 = iFloatToIntBits + i2;
                                break;
                            case 9:
/* 454 */                       i4 = i5 * 53;
/* 456 */                       Object objI000II = l0II0IlI.I000II(illoil, j);
/* 460 */                       if (objI000II != null) {
/* 462 */                           iHashCode = objI000II.hashCode();
                                }
/* 387 */                       i5 = i4 + iHashCode;
                                break;
                            case 10:
/* 442 */                       i2 = i5 * 53;
/* 448 */                       iFloatToIntBits = l0II0IlI.I000II(illoil, j).hashCode();
/* 52 */                        i5 = iFloatToIntBits + i2;
                                break;
                            case 11:
/* 434 */                       i2 = i5 * 53;
/* 436 */                       iFloatToIntBits = l0II0IlI.I0000oI00(illoil, j);
/* 52 */                        i5 = iFloatToIntBits + i2;
                                break;
                            case 12:
/* 426 */                       i2 = i5 * 53;
/* 428 */                       iFloatToIntBits = l0II0IlI.I0000oI00(illoil, j);
/* 52 */                        i5 = iFloatToIntBits + i2;
                                break;
                            case 13:
/* 418 */                       i2 = i5 * 53;
/* 420 */                       iFloatToIntBits = l0II0IlI.I0000oI00(illoil, j);
/* 52 */                        i5 = iFloatToIntBits + i2;
                                break;
                            case 14:
/* 408 */                       i = i5 * 53;
/* 410 */                       jDoubleToLongBits = l0II0IlI.I0001Ioi1lo(illoil, j);
/* 414 */                       Charset charset6 = iloi1OI100li.I00000oIO;
/* 74 */                        i5 = i + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                                break;
                            case 15:
/* 400 */                       i2 = i5 * 53;
/* 402 */                       iFloatToIntBits = l0II0IlI.I0000oI00(illoil, j);
/* 52 */                        i5 = iFloatToIntBits + i2;
                                break;
                            case 16:
/* 390 */                       i = i5 * 53;
/* 392 */                       jDoubleToLongBits = l0II0IlI.I0001Ioi1lo(illoil, j);
/* 396 */                       Charset charset7 = iloi1OI100li.I00000oIO;
/* 74 */                        i5 = i + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                                break;
                            case 17:
/* 375 */                       i4 = i5 * 53;
/* 377 */                       Object objI000II2 = l0II0IlI.I000II(illoil, j);
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
/* 369 */                       iFloatToIntBits = l0II0IlI.I000II(illoil, j).hashCode();
/* 52 */                        i5 = iFloatToIntBits + i2;
                                break;
                            case 50:
/* 351 */                       i2 = i5 * 53;
/* 357 */                       iFloatToIntBits = l0II0IlI.I000II(illoil, j).hashCode();
/* 52 */                        i5 = iFloatToIntBits + i2;
                                break;
                            case 51:
/* 329 */                       if (I00100l0(illoil, i8, i6)) {
/* 331 */                           i = i5 * 53;
/* 343 */                           jDoubleToLongBits = Double.doubleToLongBits(((Double) l0II0IlI.I000II(illoil, j)).doubleValue());
/* 347 */                           Charset charset8 = iloi1OI100li.I00000oIO;
/* 74 */                            i5 = i + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                                    break;
                                } else {
                                    break;
                                }
                            case 52:
/* 305 */                       if (I00100l0(illoil, i8, i6)) {
/* 307 */                           i2 = i5 * 53;
/* 319 */                           iFloatToIntBits = Float.floatToIntBits(((Float) l0II0IlI.I000II(illoil, j)).floatValue());
/* 52 */                            i5 = iFloatToIntBits + i2;
                                    break;
                                } else {
                                    break;
                                }
                            case 53:
/* 289 */                       if (I00100l0(illoil, i8, i6)) {
/* 291 */                           i = i5 * 53;
/* 293 */                           jDoubleToLongBits = I001i1O0Ol(j, illoil);
/* 297 */                           Charset charset9 = iloi1OI100li.I00000oIO;
/* 74 */                            i5 = i + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                                    break;
                                } else {
                                    break;
                                }
                            case 54:
/* 273 */                       if (I00100l0(illoil, i8, i6)) {
/* 275 */                           i = i5 * 53;
/* 277 */                           jDoubleToLongBits = I001i1O0Ol(j, illoil);
/* 281 */                           Charset charset10 = iloi1OI100li.I00000oIO;
/* 74 */                            i5 = i + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                                    break;
                                } else {
                                    break;
                                }
                            case 55:
/* 259 */                       if (I00100l0(illoil, i8, i6)) {
/* 261 */                           i2 = i5 * 53;
/* 263 */                           iFloatToIntBits = I0010o(j, illoil);
/* 52 */                            i5 = iFloatToIntBits + i2;
                                    break;
                                } else {
                                    break;
                                }
                            case 56:
/* 243 */                       if (I00100l0(illoil, i8, i6)) {
/* 245 */                           i = i5 * 53;
/* 247 */                           jDoubleToLongBits = I001i1O0Ol(j, illoil);
/* 251 */                           Charset charset11 = iloi1OI100li.I00000oIO;
/* 74 */                            i5 = i + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                                    break;
                                } else {
                                    break;
                                }
                            case 57:
/* 229 */                       if (I00100l0(illoil, i8, i6)) {
/* 231 */                           i2 = i5 * 53;
/* 233 */                           iFloatToIntBits = I0010o(j, illoil);
/* 52 */                            i5 = iFloatToIntBits + i2;
                                    break;
                                } else {
                                    break;
                                }
                            case 58:
/* 202 */                       if (I00100l0(illoil, i8, i6)) {
/* 204 */                           i3 = i5 * 53;
/* 212 */                           boolean zBooleanValue = ((Boolean) l0II0IlI.I000II(illoil, j)).booleanValue();
/* 216 */                           Charset charset12 = iloi1OI100li.I00000oIO;
/* 218 */                           if (zBooleanValue) {
                                    }
/* 221 */                           i5 = i9 + i3;
                                    break;
                                } else {
                                    break;
                                }
                            case 59:
/* 182 */                       if (I00100l0(illoil, i8, i6)) {
/* 184 */                           i2 = i5 * 53;
/* 192 */                           iFloatToIntBits = ((String) l0II0IlI.I000II(illoil, j)).hashCode();
/* 52 */                            i5 = iFloatToIntBits + i2;
                                    break;
                                } else {
                                    break;
                                }
                            case 60:
/* 165 */                       if (I00100l0(illoil, i8, i6)) {
/* 167 */                           i2 = i5 * 53;
/* 173 */                           iFloatToIntBits = l0II0IlI.I000II(illoil, j).hashCode();
/* 52 */                            i5 = iFloatToIntBits + i2;
                                    break;
                                } else {
                                    break;
                                }
                            case 61:
/* 148 */                       if (I00100l0(illoil, i8, i6)) {
/* 150 */                           i2 = i5 * 53;
/* 156 */                           iFloatToIntBits = l0II0IlI.I000II(illoil, j).hashCode();
/* 52 */                            i5 = iFloatToIntBits + i2;
                                    break;
                                } else {
                                    break;
                                }
                            case 62:
/* 135 */                       if (I00100l0(illoil, i8, i6)) {
/* 137 */                           i2 = i5 * 53;
/* 139 */                           iFloatToIntBits = I0010o(j, illoil);
/* 52 */                            i5 = iFloatToIntBits + i2;
                                    break;
                                } else {
                                    break;
                                }
                            case 63:
/* 122 */                       if (I00100l0(illoil, i8, i6)) {
/* 124 */                           i2 = i5 * 53;
/* 126 */                           iFloatToIntBits = I0010o(j, illoil);
/* 52 */                            i5 = iFloatToIntBits + i2;
                                    break;
                                } else {
                                    break;
                                }
                            case Barcode.FORMAT_EAN_8:
/* 109 */                       if (I00100l0(illoil, i8, i6)) {
/* 111 */                           i2 = i5 * 53;
/* 113 */                           iFloatToIntBits = I0010o(j, illoil);
/* 52 */                            i5 = iFloatToIntBits + i2;
                                    break;
                                } else {
                                    break;
                                }
                            case 65:
/* 94 */                        if (I00100l0(illoil, i8, i6)) {
/* 96 */                            i = i5 * 53;
/* 98 */                            jDoubleToLongBits = I001i1O0Ol(j, illoil);
/* 102 */                           Charset charset13 = iloi1OI100li.I00000oIO;
/* 74 */                            i5 = i + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                                    break;
                                } else {
                                    break;
                                }
                            case 66:
/* 81 */                        if (I00100l0(illoil, i8, i6)) {
/* 83 */                            i2 = i5 * 53;
/* 85 */                            iFloatToIntBits = I0010o(j, illoil);
/* 52 */                            i5 = iFloatToIntBits + i2;
                                    break;
                                } else {
                                    break;
                                }
                            case 67:
/* 60 */                        if (I00100l0(illoil, i8, i6)) {
/* 62 */                            i = i5 * 53;
/* 64 */                            jDoubleToLongBits = I001i1O0Ol(j, illoil);
/* 68 */                            Charset charset14 = iloi1OI100li.I00000oIO;
/* 74 */                            i5 = i + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                                    break;
                                } else {
                                    break;
                                }
                            case 68:
/* 40 */                        if (I00100l0(illoil, i8, i6)) {
/* 42 */                            i2 = i5 * 53;
/* 48 */                            iFloatToIntBits = l0II0IlI.I000II(illoil, j).hashCode();
/* 52 */                            i5 = iFloatToIntBits + i2;
                                    break;
                                } else {
                                    break;
                                }
                        }
                    }
/* 583 */           int iHashCode2 = illoil.zzc.hashCode() + (i5 * 53);
/* 586 */           if (!this.I0001Ioi1lo) {
/* 602 */               return iHashCode2;
                    }
/* 600 */           return ((ill0o1o) illoil).zzb.I00000oIO.hashCode() + (iHashCode2 * 53);
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
/* 25 */                iooIIllo iooiilloI001iOo1i0O = I001iOo1i0O(i);
/* 33 */                if (!I000lI(obj, i)) {
/* 39 */                    if (I000oI1ioi(object)) {
/* 45 */                        Object objZze = iooiilloI001iOo1i0O.zze();
/* 49 */                        iooiilloI001iOo1i0O.I00000oOI(objZze, object);
/* 52 */                        unsafe.putObject(obj, jI001IO000, objZze);
                            } else {
/* 41 */                        unsafe.putObject(obj, jI001IO000, object);
                            }
/* 55 */                    I000iOII(i, obj);
/* 58 */                    return;
                        }
/* 59 */                Object object2 = unsafe.getObject(obj, jI001IO000);
/* 67 */                if (!I000oI1ioi(object2)) {
/* 69 */                    Object objZze2 = iooiilloI001iOo1i0O.zze();
/* 73 */                    iooiilloI001iOo1i0O.I00000oOI(objZze2, object2);
/* 76 */                    unsafe.putObject(obj, jI001IO000, objZze2);
/* 79 */                    object2 = objZze2;
                        }
/* 80 */                iooiilloI001iOo1i0O.I00000oOI(object2, object);
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
/* 29 */                iooIIllo iooiilloI001iOo1i0O = I001iOo1i0O(i);
/* 37 */                if (!I00100l0(obj, i2, i)) {
/* 43 */                    if (I000oI1ioi(object)) {
/* 49 */                        Object objZze = iooiilloI001iOo1i0O.zze();
/* 53 */                        iooiilloI001iOo1i0O.I00000oOI(objZze, object);
/* 56 */                        unsafe.putObject(obj, jI001IO000, objZze);
                            } else {
/* 45 */                        unsafe.putObject(obj, jI001IO000, object);
                            }
/* 65 */                    l0II0IlI.I000O01llI0(obj, iArr[i + 2] & 1048575, i2);
/* 68 */                    return;
                        }
/* 69 */                Object object2 = unsafe.getObject(obj, jI001IO000);
/* 77 */                if (!I000oI1ioi(object2)) {
/* 79 */                    Object objZze2 = iooiilloI001iOo1i0O.zze();
/* 83 */                    iooiilloI001iOo1i0O.I00000oOI(objZze2, object2);
/* 86 */                    unsafe.putObject(obj, jI001IO000, objZze2);
/* 89 */                    object2 = objZze2;
                        }
/* 90 */                iooiilloI001iOo1i0O.I00000oOI(object2, object);
                    }
                }

                public final void I000iOII(int i, Object obj) {
/* 5 */             int i2 = this.I00000oIO[i + 2];
/* 10 */            long j = 1048575 & i2;
/* 17 */            if (j == 1048575) {
/* 19 */                return;
                    }
/* 30 */            l0II0IlI.I000O01llI0(obj, j, (1 << (i2 >>> 20)) | l0II0IlI.I0000oI00(obj, j));
                }

                public final boolean I000l1(illOil illoil, illOil illoil2, int i) {
                    return I000lI(illoil, i) == I000lI(illoil2, i);
                }

                public final boolean I000lI(Object obj, int i) {
/* 5 */             int i2 = this.I00000oIO[i + 2];
/* 10 */            long j = i2 & 1048575;
/* 20 */            if (j != 1048575) {
                        return ((1 << (i2 >>> 20)) & l0II0IlI.I0000oI00(obj, j)) != 0;
                    }
/* 22 */            int iI001IO000 = I001IO000(i);
/* 26 */            long j2 = iI001IO000 & 1048575;
                    switch (I001IIilI0O(iI001IO000)) {
                        case 0:
/* 232 */                   if (Double.doubleToRawLongBits(l0II0IlI.I0000Il00O.I0010I0i(obj, j2)) != 0) {
                            }
                            break;
                        case 1:
/* 217 */                   if (Float.floatToRawIntBits(l0II0IlI.I0000Il00O.I001IIilI0O(obj, j2)) != 0) {
                            }
                            break;
                        case 2:
/* 204 */                   if (l0II0IlI.I0001Ioi1lo(obj, j2) != 0) {
                            }
                            break;
                        case 3:
/* 195 */                   if (l0II0IlI.I0001Ioi1lo(obj, j2) != 0) {
                            }
                            break;
                        case 4:
/* 186 */                   if (l0II0IlI.I0000oI00(obj, j2) != 0) {
                            }
                            break;
                        case 5:
/* 179 */                   if (l0II0IlI.I0001Ioi1lo(obj, j2) != 0) {
                            }
                            break;
                        case 6:
/* 170 */                   if (l0II0IlI.I0000oI00(obj, j2) != 0) {
                            }
                            break;
                        case 7:
                            break;
                        case 8:
/* 124 */                   Object objI000II = l0II0IlI.I000II(obj, j2);
/* 130 */                   if (!(objI000II instanceof String)) {
/* 144 */                       if (!(objI000II instanceof il1oII0OlIo)) {
/* 155 */                           OIiilo1Ool0o.I00100o1O0lo();
                                    break;
                                } else if (!il1oII0OlIo.I00iiI.equals(objI000II)) {
                                }
                            } else if (!((String) objI000II).isEmpty()) {
                            }
                            break;
                        case 9:
/* 120 */                   if (l0II0IlI.I000II(obj, j2) != null) {
                            }
                            break;
                        case 10:
/* 112 */                   if (!il1oII0OlIo.I00iiI.equals(l0II0IlI.I000II(obj, j2))) {
                            }
                            break;
                        case 11:
/* 98 */                    if (l0II0IlI.I0000oI00(obj, j2) != 0) {
                            }
                            break;
                        case 12:
/* 90 */                    if (l0II0IlI.I0000oI00(obj, j2) != 0) {
                            }
                            break;
                        case 13:
/* 82 */                    if (l0II0IlI.I0000oI00(obj, j2) != 0) {
                            }
                            break;
                        case 14:
/* 74 */                    if (l0II0IlI.I0001Ioi1lo(obj, j2) != 0) {
                            }
                            break;
                        case 15:
/* 64 */                    if (l0II0IlI.I0000oI00(obj, j2) != 0) {
                            }
                            break;
                        case 16:
/* 56 */                    if (l0II0IlI.I0001Ioi1lo(obj, j2) != 0) {
                            }
                            break;
                        case 17:
/* 46 */                    if (l0II0IlI.I000II(obj, j2) != null) {
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
                    return l0II0IlI.I0000oI00(obj, (long) (this.I00000oIO[i2 + 2] & 1048575)) == i;
                }

                /* JADX WARN: Code restructure failed: missing block: B:110:0x0336, code lost:
                
                    p000.iilo0lOo110.I0000oI00("Protocol message had invalid UTF-8.");
                 */
                /* JADX WARN: Code restructure failed: missing block: B:111:0x033b, code lost:
                
                    return 0;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:131:0x038f, code lost:
                
                    p000.iilo0lOo110.I0000oI00("Protocol message had invalid UTF-8.");
                 */
                /* JADX WARN: Code restructure failed: missing block: B:132:0x0394, code lost:
                
                    return 0;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:146:0x03fa, code lost:
                
                    p000.iilo0lOo110.I0000oI00("Protocol message had invalid UTF-8.");
                 */
                /* JADX WARN: Code restructure failed: missing block: B:147:0x03fe, code lost:
                
                    return 0;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:163:0x0463, code lost:
                
                    r8 = r12;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:164:0x0464, code lost:
                
                    r7 = r14;
                    r17 = r15;
                    r12 = r19;
                    r13 = r22;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:166:0x046f, code lost:
                
                    r10 = r2;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:181:0x052f, code lost:
                
                    r10 = r1;
                    r13 = r2;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:191:0x05d0, code lost:
                
                    r13 = r2;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:195:0x0619, code lost:
                
                    r14 = r7;
                    r7 = r9;
                    r9 = r10;
                    r10 = r14;
                    r11 = r43;
                    r3 = r4;
                    r8 = r12;
                    r26 = r16;
                    r16 = r1;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:41:0x0125, code lost:
                
                    r1 = r6;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:462:0x0bdd, code lost:
                
                    r11 = r43;
                    r8 = r12;
                    r3 = r14;
                    r14 = r10;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:48:0x016c, code lost:
                
                    r10 = r9;
                    r9 = r7;
                    r7 = r10;
                    r10 = r2;
                    r22 = r13;
                    r13 = r1;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:73:0x028b, code lost:
                
                    r13 = r7;
                    r7 = r1;
                 */
                /* JADX WARN: Removed duplicated region for block: B:21:0x005a  */
                /* JADX WARN: Removed duplicated region for block: B:24:0x0075  */
                /* JADX WARN: Removed duplicated region for block: B:441:0x0b61  */
                /* JADX WARN: Removed duplicated region for block: B:542:0x0e14  */
                /* JADX WARN: Removed duplicated region for block: B:544:0x0e26  */
                /* JADX WARN: Removed duplicated region for block: B:555:0x0e61  */
                /* JADX WARN: Removed duplicated region for block: B:632:0x005e A[SYNTHETIC] */
                /* JADX WARN: Removed duplicated region for block: B:664:0x0b78 A[SYNTHETIC] */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final int I00100o1O0lo(Object obj, byte[] bArr, int i, int i2, int i3, i111i0I1 i111i0i1) throws iloll1i {
                    Object obj2;
                    int i4;
                    Object[] objArr;
                    int[] iArr;
                    Unsafe unsafe;
                    int i5;
                    int i6;
                    int iI00111O;
                    int i7;
                    int i8;
                    byte[] bArr2;
                    int i9;
                    i111i0I1 i111i0i12;
                    int iI000II;
                    int i10;
                    int i11;
                    int i12;
                    byte[] bArr3;
                    i111i0I1 i111i0i13;
                    Unsafe unsafe2;
                    int i13;
                    int i14;
                    int i15;
                    Unsafe unsafe3;
                    int i16;
                    Object obj3;
                    Unsafe unsafe4;
                    i111i0I1 i111i0i14;
                    int i17;
                    int i18;
                    int i19;
                    int i20;
                    byte b;
                    byte b2;
                    byte[] bArr4;
                    i111i0I1 i111i0i15;
                    Object obj4;
                    Unsafe unsafe5;
                    int i21;
                    int i22;
                    i111i0I1 i111i0i16;
                    int i23;
                    int i24;
                    int i25;
                    int iI000O01llI0;
                    int iI000iOII;
                    i111i0I1 i111i0i17;
                    int iI00000oIO;
                    int iI000O01llI02;
                    ioI1oI1I ioi1oi1i;
                    int i26;
                    int i27;
                    Unsafe unsafe6;
                    i111i0I1 i111i0i18;
                    int iI0001Ioi1lo;
                    byte[] bArr5;
                    int i28;
                    int i29;
                    i111i0I1 i111i0i19;
                    int i30;
                    byte[] bArr6;
                    int i31;
                    i111i0I1 i111i0i110;
                    int i32;
                    int iI0001Ioi1lo2;
                    int i33;
                    int i34;
                    iI1Il0l1O ii1il0l1o;
                    l01IO0I1I l01io0i1iI00000oOI;
                    Unsafe unsafe7;
                    int i35;
/* 3 */             Object obj5 = obj;
/* 5 */             byte[] bArr7 = bArr;
/* 7 */             int i36 = i2;
/* 9 */             i111i0I1 i111i0i111 = i111i0i1;
/* 11 */            Object[] objArr2 = this.I00000oOI;
/* 13 */            int[] iArr2 = this.I00000oIO;
/* 15 */            int i37 = this.I0000O;
/* 21 */            if (!I000oI1ioi(obj5)) {
/* 3818 */              I000II.I000iOII("Mutating immutable message: ".concat(String.valueOf(obj5)));
/* 3806 */              return 0;
                    }
/* 23 */            int iI000l1 = i;
/* 25 */            int i38 = -1;
/* 26 */            int i39 = 0;
/* 27 */            int i40 = 1048575;
/* 30 */            int i41 = 0;
/* 32 */            int i42 = 0;
                    while (true) {
/* 34 */                int i43 = 1048575;
                        while (true) {
/* 37 */                    Unsafe unsafe8 = I000lI;
/* 39 */                    if (iI000l1 < i36) {
/* 43 */                        int iI000OOo1O = iI000l1 + 1;
/* 45 */                        int i44 = bArr7[iI000l1];
/* 47 */                        if (i44 < 0) {
/* 49 */                            iI000OOo1O = lillI0io.I000OOo1O(i44, bArr7, iI000OOo1O, i111i0i111);
/* 53 */                            i44 = i111i0i111.I00000oIO;
                                }
/* 55 */                        int i45 = i44;
/* 57 */                        int i46 = iI000OOo1O;
/* 60 */                        int i47 = i45 >>> 3;
/* 62 */                        i42 = i45;
/* 64 */                        int i48 = this.I0000Il00O;
/* 66 */                        if (i47 > i38) {
/* 91 */                            iI00111O = (i47 < i48 || i47 > i37) ? -1 : I00111O(i47, i39 / 3);
/* 93 */                            if (iI00111O == -1) {
/* 118 */                               int i49 = i42 & 7;
/* 122 */                               int i50 = iArr2[iI00111O + 1];
/* 124 */                               int iI001IIilI0O = I001IIilI0O(i50);
/* 130 */                               long j = i50 & i43;
/* 137 */                               Unsafe unsafe9 = I000lI;
/* 155 */                               if (iI001IIilI0O > 17) {
/* 1579 */                                  objArr = objArr2;
/* 1581 */                                  Unsafe unsafe10 = unsafe8;
/* 1582 */                                  i6 = i42;
/* 1590 */                                  i111i0I1 i111i0i112 = i111i0i111;
/* 1591 */                                  iArr = iArr2;
/* 1593 */                                  int i51 = iI00111O;
/* 1594 */                                  int i52 = i37;
/* 1596 */                                  obj2 = obj5;
/* 1599 */                                  i7 = i52;
/* 1605 */                                  if (iI001IIilI0O != 27) {
/* 1680 */                                      if (iI001IIilI0O <= 49) {
                                                    long j2 = i50;
/* 1689 */                                          iloOl100 ilool100Zzd = (iloOl100) unsafe10.getObject(obj2, j);
/* 1698 */                                          if (!((il0II1iiI) ilool100Zzd).I00iOIl) {
/* 1700 */                                              int size = ilool100Zzd.size();
/* 1712 */                                              ilool100Zzd = ilool100Zzd.zzd(size != 0 ? size + size : 10);
/* 1716 */                                              unsafe10.putObject(obj2, j, ilool100Zzd);
                                                    }
                                                    switch (iI001IIilI0O) {
                                                        case PoseLandmark.RIGHT_PINKY:
                                                        case InputImage.IMAGE_FORMAT_YUV_420_888:
/* 2890 */                                                  bArr2 = bArr;
/* 2892 */                                                  i26 = i2;
/* 2894 */                                                  i4 = i40;
/* 2896 */                                                  i22 = i47;
/* 2898 */                                                  i27 = i46;
/* 2902 */                                                  unsafe6 = unsafe10;
/* 2904 */                                                  i111i0i18 = i111i0i1;
/* 2906 */                                                  if (i49 == 2) {
/* 2956 */                                                      OIiilo1Ool0o.I00000oIO();
/* 2954 */                                                      return 0;
                                                            }
/* 2909 */                                                  if (i49 == 1) {
/* 2948 */                                                      OIiilo1Ool0o.I00000oIO();
/* 2951 */                                                      return 0;
                                                            }
/* 2911 */                                                  iI0001Ioi1lo = i27;
/* 2912 */                                                  if (iI0001Ioi1lo != i27) {
/* 2937 */                                                      i5 = i3;
/* 2939 */                                                      i9 = iI0001Ioi1lo;
/* 2940 */                                                      i111i0i12 = i111i0i18;
/* 2941 */                                                      i39 = i51;
/* 2942 */                                                      unsafe = unsafe6;
                                                                break;
                                                            } else {
/* 2914 */                                                      i36 = i26;
/* 2915 */                                                      bArr7 = bArr2;
/* 2916 */                                                      i111i0i111 = i111i0i18;
/* 2917 */                                                      i39 = i51;
/* 2918 */                                                      obj5 = obj2;
/* 2919 */                                                      i42 = i6;
/* 2921 */                                                      iArr2 = iArr;
/* 2923 */                                                      i37 = i7;
/* 2925 */                                                      i40 = i4;
/* 2927 */                                                      i38 = i22;
/* 2929 */                                                      objArr2 = objArr;
/* 2931 */                                                      i43 = 1048575;
/* 2934 */                                                      iI000l1 = iI0001Ioi1lo;
                                                            }
                                                        case PoseLandmark.LEFT_INDEX:
                                                        case 36:
/* 2792 */                                                  bArr2 = bArr;
/* 2794 */                                                  i26 = i2;
/* 2796 */                                                  i4 = i40;
/* 2798 */                                                  iloOl100 ilool100 = ilool100Zzd;
/* 2799 */                                                  i22 = i47;
/* 2801 */                                                  i27 = i46;
/* 2805 */                                                  unsafe6 = unsafe10;
/* 2807 */                                                  i111i0i18 = i111i0i1;
/* 2809 */                                                  if (i49 == 2) {
/* 2812 */                                                      iliO1I10o0 ilio1i10o0 = (iliO1I10o0) ilool100;
/* 2814 */                                                      int iI000O01llI03 = lillI0io.I000O01llI0(bArr2, i27, i111i0i18);
/* 2820 */                                                      int i53 = i111i0i18.I00000oIO + iI000O01llI03;
/* 2821 */                                                      while (iI000O01llI03 < i53) {
/* 2831 */                                                          ilio1i10o0.I00000oOI(Float.intBitsToFloat(lillI0io.I0000Il00O(iI000O01llI03, bArr2)));
/* 2834 */                                                          iI000O01llI03 += 4;
                                                                }
/* 2837 */                                                      if (iI000O01llI03 != i53) {
/* 2841 */                                                          iilo0lOo110.I0000oI00("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
/* 2844 */                                                          return 0;
                                                                }
/* 2839 */                                                      iI0001Ioi1lo = iI000O01llI03;
                                                            } else if (i49 == 5) {
/* 2850 */                                                      iI0001Ioi1lo = i27 + 4;
/* 2853 */                                                      iliO1I10o0 ilio1i10o02 = (iliO1I10o0) ilool100;
/* 2863 */                                                      ilio1i10o02.I00000oOI(Float.intBitsToFloat(lillI0io.I0000Il00O(i27, bArr2)));
/* 2866 */                                                      while (iI0001Ioi1lo < i26) {
/* 2868 */                                                          int iI000O01llI04 = lillI0io.I000O01llI0(bArr2, iI0001Ioi1lo, i111i0i18);
/* 2874 */                                                          if (i6 == i111i0i18.I00000oIO) {
/* 2884 */                                                              ilio1i10o02.I00000oOI(Float.intBitsToFloat(lillI0io.I0000Il00O(iI000O01llI04, bArr2)));
/* 2887 */                                                              iI0001Ioi1lo = iI000O01llI04 + 4;
                                                                    }
                                                                }
                                                            } else {
/* 2911 */                                                      iI0001Ioi1lo = i27;
                                                            }
/* 2912 */                                                  if (iI0001Ioi1lo != i27) {
                                                            }
                                                            break;
                                                        case PoseLandmark.RIGHT_INDEX:
                                                        case PoseLandmark.LEFT_THUMB:
                                                        case 37:
                                                        case 38:
/* 2758 */                                                  bArr2 = bArr;
/* 2760 */                                                  i26 = i2;
/* 2762 */                                                  i4 = i40;
/* 2764 */                                                  i22 = i47;
/* 2766 */                                                  i27 = i46;
/* 2770 */                                                  unsafe6 = unsafe10;
/* 2772 */                                                  i111i0i18 = i111i0i1;
/* 2774 */                                                  if (i49 == 2) {
/* 2788 */                                                      OIiilo1Ool0o.I00000oIO();
/* 2786 */                                                      return 0;
                                                            }
/* 2776 */                                                  if (i49 == 0) {
/* 2780 */                                                      OIiilo1Ool0o.I00000oIO();
/* 2783 */                                                      return 0;
                                                            }
/* 2911 */                                                  iI0001Ioi1lo = i27;
/* 2912 */                                                  if (iI0001Ioi1lo != i27) {
                                                            }
                                                            break;
                                                        case PoseLandmark.RIGHT_THUMB:
                                                        case PoseLandmark.LEFT_HEEL:
                                                        case 39:
                                                        case 43:
/* 2717 */                                                  bArr5 = bArr;
/* 2719 */                                                  i26 = i2;
/* 2721 */                                                  i4 = i40;
/* 2723 */                                                  i22 = i47;
/* 2727 */                                                  iloOl100 ilool1002 = ilool100Zzd;
/* 2728 */                                                  i28 = i46;
/* 2730 */                                                  unsafe6 = unsafe10;
/* 2732 */                                                  i111i0i18 = i111i0i1;
/* 2734 */                                                  if (i49 == 2) {
/* 2736 */                                                      iI0001Ioi1lo = lillI0io.I0001Ioi1lo(bArr5, i28, ilool1002, i111i0i18);
/* 2431 */                                                      bArr2 = bArr5;
/* 2432 */                                                      i27 = i28;
/* 2912 */                                                      if (iI0001Ioi1lo != i27) {
                                                                }
                                                            } else {
/* 2742 */                                                      if (i49 == 0) {
/* 2749 */                                                          int iI000OiO = lillI0io.I000OiO(i6, bArr5, i28, i26, ilool1002, i111i0i18);
/* 2753 */                                                          bArr2 = bArr5;
/* 2754 */                                                          i27 = i28;
/* 2755 */                                                          iI0001Ioi1lo = iI000OiO;
/* 2912 */                                                          if (iI0001Ioi1lo != i27) {
                                                                    }
                                                                }
/* 2560 */                                                      bArr2 = bArr5;
/* 2561 */                                                      i27 = i28;
/* 2911 */                                                      iI0001Ioi1lo = i27;
/* 2912 */                                                      if (iI0001Ioi1lo != i27) {
                                                                }
                                                            }
                                                            break;
                                                        case PoseLandmark.LEFT_HIP:
                                                        case 32:
                                                        case 40:
                                                        case 46:
/* 2683 */                                                  bArr5 = bArr;
/* 2685 */                                                  i26 = i2;
/* 2687 */                                                  i4 = i40;
/* 2689 */                                                  i22 = i47;
/* 2691 */                                                  i28 = i46;
/* 2695 */                                                  unsafe6 = unsafe10;
/* 2697 */                                                  i111i0i18 = i111i0i1;
/* 2699 */                                                  if (i49 == 2) {
/* 2713 */                                                      OIiilo1Ool0o.I00000oIO();
/* 2711 */                                                      return 0;
                                                            }
/* 2702 */                                                  if (i49 == 1) {
/* 2705 */                                                      OIiilo1Ool0o.I00000oIO();
/* 2708 */                                                      return 0;
                                                            }
/* 2560 */                                                  bArr2 = bArr5;
/* 2561 */                                                  i27 = i28;
/* 2911 */                                                  iI0001Ioi1lo = i27;
/* 2912 */                                                  if (iI0001Ioi1lo != i27) {
                                                            }
                                                            break;
                                                        case PoseLandmark.RIGHT_HIP:
                                                        case PoseLandmark.LEFT_FOOT_INDEX:
                                                        case 41:
                                                        case BuildConfig.VERSION_CODE:
/* 2595 */                                                  bArr5 = bArr;
/* 2597 */                                                  i26 = i2;
/* 2599 */                                                  i4 = i40;
/* 2601 */                                                  i22 = i47;
/* 2605 */                                                  iloOl100 ilool1003 = ilool100Zzd;
/* 2606 */                                                  i28 = i46;
/* 2608 */                                                  unsafe6 = unsafe10;
/* 2610 */                                                  i111i0i18 = i111i0i1;
/* 2612 */                                                  if (i49 == 2) {
/* 2615 */                                                      illiooo1io0I illiooo1io0i = (illiooo1io0I) ilool1003;
/* 2617 */                                                      int iI000O01llI05 = lillI0io.I000O01llI0(bArr5, i28, i111i0i18);
/* 2623 */                                                      int i54 = i111i0i18.I00000oIO + iI000O01llI05;
/* 2624 */                                                      while (iI000O01llI05 < i54) {
/* 2630 */                                                          illiooo1io0i.I0000O(lillI0io.I0000Il00O(iI000O01llI05, bArr5));
/* 2633 */                                                          iI000O01llI05 += 4;
                                                                }
/* 2636 */                                                      if (iI000O01llI05 != i54) {
/* 2642 */                                                          iilo0lOo110.I0000oI00("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
/* 2645 */                                                          return 0;
                                                                }
/* 2638 */                                                      bArr2 = bArr5;
/* 2639 */                                                      iI0001Ioi1lo = iI000O01llI05;
/* 2432 */                                                      i27 = i28;
/* 2912 */                                                      if (iI0001Ioi1lo != i27) {
                                                                }
                                                            } else {
/* 2649 */                                                      if (i49 == 5) {
/* 2651 */                                                          iI0001Ioi1lo = i28 + 4;
/* 2654 */                                                          illiooo1io0I illiooo1io0i2 = (illiooo1io0I) ilool1003;
/* 2660 */                                                          illiooo1io0i2.I0000O(lillI0io.I0000Il00O(i28, bArr5));
/* 2663 */                                                          while (iI0001Ioi1lo < i26) {
/* 2665 */                                                              int iI000O01llI06 = lillI0io.I000O01llI0(bArr5, iI0001Ioi1lo, i111i0i18);
/* 2671 */                                                              if (i6 == i111i0i18.I00000oIO) {
/* 2677 */                                                                  illiooo1io0i2.I0000O(lillI0io.I0000Il00O(iI000O01llI06, bArr5));
/* 2680 */                                                                  iI0001Ioi1lo = iI000O01llI06 + 4;
                                                                        } else {
/* 2431 */                                                                  bArr2 = bArr5;
/* 2432 */                                                                  i27 = i28;
/* 2912 */                                                                  if (iI0001Ioi1lo != i27) {
                                                                            }
                                                                        }
                                                                    }
/* 2431 */                                                          bArr2 = bArr5;
/* 2432 */                                                          i27 = i28;
/* 2912 */                                                          if (iI0001Ioi1lo != i27) {
                                                                    }
                                                                }
/* 2560 */                                                      bArr2 = bArr5;
/* 2561 */                                                      i27 = i28;
/* 2911 */                                                      iI0001Ioi1lo = i27;
/* 2912 */                                                      if (iI0001Ioi1lo != i27) {
                                                                }
                                                            }
                                                            break;
                                                        case PoseLandmark.LEFT_KNEE:
                                                        case 42:
/* 2564 */                                                  bArr5 = bArr;
/* 2566 */                                                  i26 = i2;
/* 2568 */                                                  i4 = i40;
/* 2570 */                                                  i22 = i47;
/* 2572 */                                                  i28 = i46;
/* 2578 */                                                  unsafe6 = unsafe10;
/* 2580 */                                                  i111i0i18 = i111i0i1;
/* 2582 */                                                  if (i49 == 2) {
/* 2591 */                                                      OIiilo1Ool0o.I00000oIO();
/* 2576 */                                                      return 0;
                                                            }
/* 2584 */                                                  if (i49 == 0) {
/* 2587 */                                                      OIiilo1Ool0o.I00000oIO();
/* 2576 */                                                      return 0;
                                                            }
/* 2560 */                                                  bArr2 = bArr5;
/* 2561 */                                                  i27 = i28;
/* 2911 */                                                  iI0001Ioi1lo = i27;
/* 2912 */                                                  if (iI0001Ioi1lo != i27) {
                                                            }
                                                            break;
                                                        case PoseLandmark.RIGHT_KNEE:
/* 2338 */                                                  bArr5 = bArr;
/* 2340 */                                                  i26 = i2;
/* 2342 */                                                  i4 = i40;
/* 2344 */                                                  i22 = i47;
/* 2348 */                                                  iloOl100 ilool1004 = ilool100Zzd;
/* 2349 */                                                  i28 = i46;
/* 2351 */                                                  unsafe6 = unsafe10;
/* 2353 */                                                  i111i0i18 = i111i0i1;
/* 2355 */                                                  if (i49 == 2) {
/* 2363 */                                                      if ((536870912 & j2) == 0) {
/* 2365 */                                                          iI0001Ioi1lo = lillI0io.I000O01llI0(bArr5, i28, i111i0i18);
/* 2369 */                                                          int i55 = i111i0i18.I00000oIO;
/* 2371 */                                                          if (i55 < 0) {
/* 2436 */                                                              iilo0lOo110.I0000oI00("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
/* 2435 */                                                              return 0;
                                                                    }
/* 2373 */                                                          if (i55 == 0) {
/* 2375 */                                                              ilool1004.add("");
                                                                    } else {
/* 2386 */                                                              ilool1004.add(new String(bArr5, iI0001Ioi1lo, i55, iloi1OI100li.I00000oIO));
/* 2389 */                                                              iI0001Ioi1lo += i55;
                                                                    }
/* 2390 */                                                          while (iI0001Ioi1lo < i26) {
/* 2392 */                                                              int iI000O01llI07 = lillI0io.I000O01llI0(bArr5, iI0001Ioi1lo, i111i0i18);
/* 2398 */                                                              if (i6 == i111i0i18.I00000oIO) {
/* 2400 */                                                                  iI0001Ioi1lo = lillI0io.I000O01llI0(bArr5, iI000O01llI07, i111i0i18);
/* 2404 */                                                                  int i56 = i111i0i18.I00000oIO;
/* 2406 */                                                                  if (i56 < 0) {
/* 2425 */                                                                      iilo0lOo110.I0000oI00("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
/* 2428 */                                                                      return 0;
                                                                            }
/* 2408 */                                                                  if (i56 == 0) {
/* 2410 */                                                                      ilool1004.add("");
                                                                            } else {
/* 2421 */                                                                      ilool1004.add(new String(bArr5, iI0001Ioi1lo, i56, iloi1OI100li.I00000oIO));
/* 2389 */                                                                      iI0001Ioi1lo += i56;
                                                                            }
                                                                        }
                                                                    }
                                                                } else {
/* 2441 */                                                          iI0001Ioi1lo = lillI0io.I000O01llI0(bArr5, i28, i111i0i18);
/* 2445 */                                                          int i57 = i111i0i18.I00000oIO;
/* 2447 */                                                          if (i57 < 0) {
/* 2554 */                                                              iilo0lOo110.I0000oI00("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
/* 2440 */                                                              return 0;
                                                                    }
/* 2449 */                                                          if (i57 == 0) {
/* 2451 */                                                              ilool1004.add("");
                                                                    } else {
/* 2455 */                                                              int i58 = iI0001Ioi1lo + i57;
/* 2459 */                                                              l0O1O1.I00000oIO.getClass();
/* 2466 */                                                              if (iOl0lOIi11.I0010o(0, bArr5, iI0001Ioi1lo, i58) != 0) {
/* 2548 */                                                                  iilo0lOo110.I0000oI00("Protocol message had invalid UTF-8.");
/* 2546 */                                                                  return 0;
                                                                        }
/* 2475 */                                                              ilool1004.add(new String(bArr5, iI0001Ioi1lo, i57, iloi1OI100li.I00000oIO));
/* 2478 */                                                              iI0001Ioi1lo = i58;
                                                                    }
/* 2479 */                                                          while (iI0001Ioi1lo < i26) {
/* 2481 */                                                              int iI000O01llI08 = lillI0io.I000O01llI0(bArr5, iI0001Ioi1lo, i111i0i18);
/* 2487 */                                                              if (i6 == i111i0i18.I00000oIO) {
/* 2489 */                                                                  iI0001Ioi1lo = lillI0io.I000O01llI0(bArr5, iI000O01llI08, i111i0i18);
/* 2493 */                                                                  int i59 = i111i0i18.I00000oIO;
/* 2495 */                                                                  if (i59 < 0) {
/* 2539 */                                                                      iilo0lOo110.I0000oI00("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
/* 2537 */                                                                      return 0;
                                                                            }
/* 2497 */                                                                  if (i59 == 0) {
/* 2499 */                                                                      ilool1004.add("");
                                                                            } else {
/* 2503 */                                                                      int i60 = iI0001Ioi1lo + i59;
/* 2507 */                                                                      l0O1O1.I00000oIO.getClass();
/* 2515 */                                                                      if (iOl0lOIi11.I0010o(0, bArr5, iI0001Ioi1lo, i60) != 0) {
/* 2533 */                                                                          iilo0lOo110.I0000oI00("Protocol message had invalid UTF-8.");
/* 2510 */                                                                          return 0;
                                                                                }
/* 2526 */                                                                      ilool1004.add(new String(bArr5, iI0001Ioi1lo, i59, iloi1OI100li.I00000oIO));
/* 2529 */                                                                      iI0001Ioi1lo = i60;
                                                                            }
                                                                        }
                                                                    }
                                                                }
/* 2431 */                                                      bArr2 = bArr5;
/* 2432 */                                                      i27 = i28;
/* 2912 */                                                      if (iI0001Ioi1lo != i27) {
                                                                }
                                                            } else {
/* 2560 */                                                      bArr2 = bArr5;
/* 2561 */                                                      i27 = i28;
/* 2911 */                                                      iI0001Ioi1lo = i27;
/* 2912 */                                                      if (iI0001Ioi1lo != i27) {
                                                                }
                                                            }
                                                            break;
                                                        case 27:
/* 2301 */                                                  i29 = i2;
/* 2303 */                                                  i111i0i19 = i111i0i1;
/* 2305 */                                                  i4 = i40;
/* 2307 */                                                  i22 = i47;
/* 2309 */                                                  i30 = i46;
/* 2312 */                                                  unsafe6 = unsafe10;
/* 2314 */                                                  if (i49 == 2) {
/* 2324 */                                                      iI0001Ioi1lo = lillI0io.I0000oI00(I001iOo1i0O(i51), i6, bArr, i30, i29, ilool100Zzd, i111i0i19);
/* 2328 */                                                      i27 = i30;
/* 2329 */                                                      i26 = i29;
/* 2330 */                                                      i111i0i18 = i111i0i19;
/* 2331 */                                                      bArr2 = bArr;
/* 2912 */                                                      if (iI0001Ioi1lo != i27) {
                                                                }
                                                            } else {
/* 2335 */                                                      bArr2 = bArr;
/* 1988 */                                                      i27 = i30;
/* 1989 */                                                      i26 = i29;
/* 1990 */                                                      i111i0i18 = i111i0i19;
/* 2911 */                                                      iI0001Ioi1lo = i27;
/* 2912 */                                                      if (iI0001Ioi1lo != i27) {
                                                                }
                                                            }
                                                            break;
                                                        case PoseLandmark.RIGHT_ANKLE:
/* 2184 */                                                  bArr6 = bArr;
/* 2186 */                                                  i31 = i2;
/* 2188 */                                                  i111i0i110 = i111i0i1;
/* 2190 */                                                  i4 = i40;
/* 2192 */                                                  i22 = i47;
/* 2194 */                                                  i32 = i46;
/* 2197 */                                                  unsafe6 = unsafe10;
/* 2199 */                                                  if (i49 == 2) {
/* 2201 */                                                      int iI000O01llI09 = lillI0io.I000O01llI0(bArr6, i32, i111i0i110);
/* 2205 */                                                      int i61 = i111i0i110.I00000oIO;
/* 2207 */                                                      if (i61 < 0) {
/* 2295 */                                                          iilo0lOo110.I0000oI00("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
/* 2293 */                                                          return 0;
                                                                }
/* 2211 */                                                      if (i61 > bArr6.length - iI000O01llI09) {
/* 2289 */                                                          iilo0lOo110.I0000oI00("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
/* 2287 */                                                          return 0;
                                                                }
/* 2213 */                                                      if (i61 == 0) {
/* 2217 */                                                          ilool100Zzd.add(il1oII0OlIo.I00iiI);
                                                                } else {
/* 2225 */                                                          ilool100Zzd.add(il1oII0OlIo.I001IO000(bArr6, iI000O01llI09, i61));
/* 2228 */                                                          iI000O01llI09 += i61;
                                                                }
/* 2229 */                                                      while (iI000O01llI09 < i31) {
/* 2231 */                                                          int iI000O01llI010 = lillI0io.I000O01llI0(bArr6, iI000O01llI09, i111i0i110);
/* 2237 */                                                          if (i6 == i111i0i110.I00000oIO) {
/* 2239 */                                                              iI000O01llI09 = lillI0io.I000O01llI0(bArr6, iI000O01llI010, i111i0i110);
/* 2243 */                                                              int i62 = i111i0i110.I00000oIO;
/* 2245 */                                                              if (i62 < 0) {
/* 2275 */                                                                  iilo0lOo110.I0000oI00("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
/* 2273 */                                                                  return 0;
                                                                        }
/* 2249 */                                                              if (i62 > bArr6.length - iI000O01llI09) {
/* 2267 */                                                                  iilo0lOo110.I0000oI00("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
/* 2270 */                                                                  return 0;
                                                                        }
/* 2251 */                                                              if (i62 == 0) {
/* 2255 */                                                                  ilool100Zzd.add(il1oII0OlIo.I00iiI);
                                                                        } else {
/* 2263 */                                                                  ilool100Zzd.add(il1oII0OlIo.I001IO000(bArr6, iI000O01llI09, i62));
/* 2228 */                                                                  iI000O01llI09 += i62;
                                                                        }
                                                                    } else {
/* 2281 */                                                              iI0001Ioi1lo = iI000O01llI09;
/* 2282 */                                                              bArr2 = bArr6;
/* 2283 */                                                              i27 = i32;
/* 2284 */                                                              i26 = i31;
/* 2285 */                                                              i111i0i18 = i111i0i110;
/* 2912 */                                                              if (iI0001Ioi1lo != i27) {
                                                                        }
                                                                    }
                                                                }
/* 2281 */                                                      iI0001Ioi1lo = iI000O01llI09;
/* 2282 */                                                      bArr2 = bArr6;
/* 2283 */                                                      i27 = i32;
/* 2284 */                                                      i26 = i31;
/* 2285 */                                                      i111i0i18 = i111i0i110;
/* 2912 */                                                      if (iI0001Ioi1lo != i27) {
                                                                }
                                                            }
/* 2177 */                                                  bArr2 = bArr6;
/* 2178 */                                                  i27 = i32;
/* 2179 */                                                  i26 = i31;
/* 2180 */                                                  i111i0i18 = i111i0i110;
/* 2911 */                                                  iI0001Ioi1lo = i27;
/* 2912 */                                                  if (iI0001Ioi1lo != i27) {
                                                            }
                                                            break;
                                                        case 30:
                                                        case 44:
/* 1993 */                                                  bArr6 = bArr;
/* 1995 */                                                  i31 = i2;
/* 1997 */                                                  i111i0i110 = i111i0i1;
/* 1999 */                                                  i32 = i46;
/* 2002 */                                                  if (i49 == 2) {
/* 2004 */                                                      iI0001Ioi1lo2 = lillI0io.I0001Ioi1lo(bArr6, i32, ilool100Zzd, i111i0i110);
                                                            } else if (i49 == 0) {
/* 2016 */                                                      int iI000OiO2 = lillI0io.I000OiO(i6, bArr6, i32, i31, ilool100Zzd, i111i0i110);
/* 2020 */                                                      i31 = i31;
/* 2021 */                                                      i32 = i32;
/* 2022 */                                                      bArr6 = bArr6;
/* 2023 */                                                      iI0001Ioi1lo2 = iI000OiO2;
                                                            } else {
/* 2171 */                                                      i4 = i40;
/* 2173 */                                                      unsafe6 = unsafe10;
/* 2175 */                                                      i22 = i47;
/* 2177 */                                                      bArr2 = bArr6;
/* 2178 */                                                      i27 = i32;
/* 2179 */                                                      i26 = i31;
/* 2180 */                                                      i111i0i18 = i111i0i110;
/* 2911 */                                                      iI0001Ioi1lo = i27;
/* 2912 */                                                      if (iI0001Ioi1lo != i27) {
                                                                }
                                                            }
/* 2024 */                                                  iI1Il0l1O ii1il0l1oI001i1lo1io = I001i1lo1io(i51);
/* 2028 */                                                  i1O01oOIoI0I i1o01ooioi0i = iooiolOil0.I00000oIO;
/* 2030 */                                                  if (ii1il0l1oI001i1lo1io != null) {
/* 2032 */                                                      int size2 = ilool100Zzd.size();
/* 2037 */                                                      i33 = iI0001Ioi1lo2;
/* 2039 */                                                      l01IO0I1I l01io0i1i = null;
/* 2041 */                                                      int i63 = 0;
/* 2042 */                                                      int i64 = 0;
/* 2043 */                                                      while (i63 < size2) {
/* 2049 */                                                          int i65 = i40;
/* 2053 */                                                          Integer num = (Integer) ilool100Zzd.get(i63);
/* 2055 */                                                          int i66 = i47;
/* 2057 */                                                          int iIntValue = num.intValue();
/* 2065 */                                                          if (ii1il0l1oI001i1lo1io.I00000oIO(iIntValue)) {
/* 2067 */                                                              if (i63 != i64) {
/* 2069 */                                                                  ilool100Zzd.set(i64, num);
                                                                        }
/* 2072 */                                                              i64++;
/* 2074 */                                                              i34 = i63;
/* 2076 */                                                              ii1il0l1o = ii1il0l1oI001i1lo1io;
/* 2078 */                                                              l01io0i1iI00000oOI = l01io0i1i;
/* 2080 */                                                              unsafe7 = unsafe10;
                                                                    } else {
/* 2083 */                                                              if (l01io0i1i == null) {
/* 2086 */                                                                  illOil illoil = (illOil) obj2;
/* 2088 */                                                                  i34 = i63;
/* 2090 */                                                                  l01io0i1iI00000oOI = illoil.zzc;
/* 2092 */                                                                  ii1il0l1o = ii1il0l1oI001i1lo1io;
/* 2096 */                                                                  if (l01io0i1iI00000oOI == l01IO0I1I.I0001Ioi1lo) {
/* 2098 */                                                                      l01io0i1iI00000oOI = l01IO0I1I.I00000oOI();
/* 2102 */                                                                      illoil.zzc = l01io0i1iI00000oOI;
                                                                            }
                                                                        } else {
/* 2107 */                                                                  i34 = i63;
/* 2109 */                                                                  ii1il0l1o = ii1il0l1oI001i1lo1io;
/* 2111 */                                                                  l01io0i1iI00000oOI = l01io0i1i;
                                                                        }
/* 2104 */                                                              unsafe7 = unsafe10;
/* 2121 */                                                              l01io0i1iI00000oOI.I0000Il00O(i66 << 3, Long.valueOf(iIntValue));
                                                                    }
/* 2126 */                                                          unsafe10 = unsafe7;
/* 2128 */                                                          i40 = i65;
/* 2130 */                                                          i47 = i66;
/* 2132 */                                                          l01io0i1i = l01io0i1iI00000oOI;
/* 2124 */                                                          i63 = i34 + 1;
/* 2135 */                                                          ii1il0l1oI001i1lo1io = ii1il0l1o;
                                                                }
/* 2138 */                                                      i4 = i40;
/* 2140 */                                                      unsafe6 = unsafe10;
/* 2142 */                                                      i22 = i47;
/* 2144 */                                                      if (i64 != size2) {
/* 2150 */                                                          ilool100Zzd.subList(i64, size2).clear();
                                                                }
                                                            } else {
/* 2154 */                                                      i33 = iI0001Ioi1lo2;
/* 2156 */                                                      i4 = i40;
/* 2158 */                                                      unsafe6 = unsafe10;
/* 2160 */                                                      i22 = i47;
                                                            }
/* 2162 */                                                  bArr2 = bArr6;
/* 2163 */                                                  i27 = i32;
/* 2164 */                                                  i26 = i31;
/* 2165 */                                                  i111i0i18 = i111i0i110;
/* 2166 */                                                  iI0001Ioi1lo = i33;
/* 2912 */                                                  if (iI0001Ioi1lo != i27) {
                                                            }
                                                            break;
                                                        case 33:
                                                        case 47:
/* 1883 */                                                  i29 = i2;
/* 1885 */                                                  i111i0i19 = i111i0i1;
/* 1887 */                                                  i30 = i46;
/* 1891 */                                                  if (i49 == 2) {
/* 1893 */                                                      illiooo1io0I illiooo1io0i3 = (illiooo1io0I) ilool100Zzd;
/* 1895 */                                                      int iI000O01llI011 = lillI0io.I000O01llI0(bArr, i30, i111i0i19);
/* 1901 */                                                      int i67 = i111i0i19.I00000oIO + iI000O01llI011;
/* 1902 */                                                      while (iI000O01llI011 < i67) {
/* 1904 */                                                          iI000O01llI011 = lillI0io.I000O01llI0(bArr, iI000O01llI011, i111i0i19);
/* 1914 */                                                          illiooo1io0i3.I0000O(lilloo.I00000oIO(i111i0i19.I00000oIO));
                                                                }
/* 1919 */                                                      if (iI000O01llI011 != i67) {
/* 1933 */                                                          iilo0lOo110.I0000oI00("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
/* 1936 */                                                          return 0;
                                                                }
/* 1921 */                                                      iI0001Ioi1lo = iI000O01llI011;
                                                            } else if (i49 == 0) {
/* 1941 */                                                      illiooo1io0I illiooo1io0i4 = (illiooo1io0I) ilool100Zzd;
/* 1943 */                                                      iI0001Ioi1lo = lillI0io.I000O01llI0(bArr, i30, i111i0i19);
/* 1953 */                                                      illiooo1io0i4.I0000O(lilloo.I00000oIO(i111i0i19.I00000oIO));
/* 1956 */                                                      while (iI0001Ioi1lo < i29) {
/* 1958 */                                                          int iI000O01llI012 = lillI0io.I000O01llI0(bArr, iI0001Ioi1lo, i111i0i19);
/* 1964 */                                                          if (i6 == i111i0i19.I00000oIO) {
/* 1966 */                                                              iI0001Ioi1lo = lillI0io.I000O01llI0(bArr, iI000O01llI012, i111i0i19);
/* 1976 */                                                              illiooo1io0i4.I0000O(lilloo.I00000oIO(i111i0i19.I00000oIO));
                                                                    }
                                                                }
                                                            } else {
/* 1980 */                                                      bArr2 = bArr;
/* 1981 */                                                      i4 = i40;
/* 1983 */                                                      unsafe6 = unsafe10;
/* 1985 */                                                      i22 = i47;
/* 1988 */                                                      i27 = i30;
/* 1989 */                                                      i26 = i29;
/* 1990 */                                                      i111i0i18 = i111i0i19;
/* 2911 */                                                      iI0001Ioi1lo = i27;
/* 2912 */                                                      if (iI0001Ioi1lo != i27) {
                                                                }
                                                            }
/* 1922 */                                                  bArr2 = bArr;
/* 1923 */                                                  i4 = i40;
/* 1925 */                                                  unsafe6 = unsafe10;
/* 1927 */                                                  i22 = i47;
/* 1930 */                                                  i27 = i30;
/* 1931 */                                                  i26 = i29;
/* 1822 */                                                  i111i0i18 = i111i0i19;
/* 2912 */                                                  if (iI0001Ioi1lo != i27) {
                                                            }
                                                            break;
                                                        case 34:
                                                        case 48:
/* 1852 */                                                  if (i49 == 2) {
/* 1877 */                                                      OIiilo1Ool0o.I00000oIO();
/* 1875 */                                                      return 0;
                                                            }
/* 1854 */                                                  if (i49 == 0) {
/* 1869 */                                                      OIiilo1Ool0o.I00000oIO();
/* 1872 */                                                      return 0;
                                                            }
/* 1856 */                                                  i4 = i40;
/* 1858 */                                                  unsafe6 = unsafe10;
/* 1860 */                                                  i22 = i47;
/* 1862 */                                                  i27 = i46;
/* 1863 */                                                  i26 = i2;
/* 1864 */                                                  i111i0i18 = i111i0i1;
/* 1866 */                                                  bArr2 = bArr;
/* 2911 */                                                  iI0001Ioi1lo = i27;
/* 2912 */                                                  if (iI0001Ioi1lo != i27) {
                                                            }
                                                            break;
                                                        default:
/* 1725 */                                                  if (i49 == 3) {
/* 1729 */                                                      int i68 = (i6 & (-8)) | 4;
/* 1731 */                                                      iooIIllo iooiilloI001iOo1i0O = I001iOo1i0O(i51);
/* 1735 */                                                      Object objZze = iooiilloI001iOo1i0O.zze();
/* 1744 */                                                      int i69 = i46;
/* 1748 */                                                      int iI000l12 = lillI0io.I000l1(objZze, iooiilloI001iOo1i0O, bArr, i69, i2, i68, i111i0i1);
/* 1755 */                                                      int i70 = i68;
/* 1756 */                                                      i111i0i19 = i111i0i1;
/* 1758 */                                                      iooiilloI001iOo1i0O.I00000oIO(objZze);
/* 1761 */                                                      i111i0i19.I0000Il00O = objZze;
/* 1763 */                                                      ilool100Zzd.add(objZze);
/* 1766 */                                                      int i71 = iI000l12;
                                                                while (true) {
/* 1768 */                                                          i35 = i69;
/* 1770 */                                                          if (i71 < i2) {
/* 1772 */                                                              int iI000O01llI013 = lillI0io.I000O01llI0(bArr, i71, i111i0i19);
/* 1778 */                                                              if (i6 == i111i0i19.I00000oIO) {
/* 1780 */                                                                  int i72 = i70;
/* 1781 */                                                                  Object objZze2 = iooiilloI001iOo1i0O.zze();
/* 1787 */                                                                  int iI000l13 = lillI0io.I000l1(objZze2, iooiilloI001iOo1i0O, bArr, iI000O01llI013, i2, i72, i111i0i1);
/* 1794 */                                                                  i70 = i72;
/* 1795 */                                                                  i111i0i19 = i111i0i1;
/* 1797 */                                                                  iooiilloI001iOo1i0O.I00000oIO(objZze2);
/* 1800 */                                                                  i111i0i19.I0000Il00O = objZze2;
/* 1802 */                                                                  ilool100Zzd.add(objZze2);
/* 1805 */                                                                  i71 = iI000l13;
/* 1806 */                                                                  i69 = i35;
                                                                        }
                                                                    }
                                                                }
/* 1810 */                                                      i26 = i2;
/* 1811 */                                                      iI0001Ioi1lo = i71;
/* 1812 */                                                      i4 = i40;
/* 1814 */                                                      i22 = i47;
/* 1816 */                                                      i27 = i35;
/* 1819 */                                                      bArr2 = bArr;
/* 1820 */                                                      unsafe6 = unsafe10;
/* 1822 */                                                      i111i0i18 = i111i0i19;
/* 2912 */                                                      if (iI0001Ioi1lo != i27) {
                                                                }
                                                            } else {
/* 1825 */                                                      bArr2 = bArr;
/* 1827 */                                                      i26 = i2;
/* 1829 */                                                      i4 = i40;
/* 1831 */                                                      i22 = i47;
/* 1833 */                                                      i27 = i46;
/* 1836 */                                                      unsafe6 = unsafe10;
/* 1838 */                                                      i111i0i18 = i111i0i1;
/* 2911 */                                                      iI0001Ioi1lo = i27;
/* 2912 */                                                      if (iI0001Ioi1lo != i27) {
                                                                }
                                                            }
                                                            break;
                                                    }
                                                } else {
/* 2960 */                                          bArr2 = bArr;
/* 2962 */                                          i4 = i40;
/* 2966 */                                          i22 = i47;
/* 2972 */                                          i111i0i16 = i111i0i1;
/* 2974 */                                          i23 = i46;
/* 2979 */                                          if (iI001IIilI0O != 50) {
/* 3044 */                                              unsafe = unsafe10;
/* 3055 */                                              long j3 = iArr[i51 + 2] & 1048575;
                                                        switch (iI001IIilI0O) {
                                                            case 51:
/* 3571 */                                                      i24 = i51;
/* 3573 */                                                      i25 = i23;
/* 3575 */                                                      i111i0i12 = i111i0i16;
/* 3576 */                                                      i8 = i22;
/* 3578 */                                                      if (i49 == 1) {
/* 3580 */                                                          iI000O01llI0 = i25 + 8;
/* 3594 */                                                          unsafe.putObject(obj2, j, Double.valueOf(Double.longBitsToDouble(lillI0io.I000oI1ioi(i25, bArr2))));
/* 3597 */                                                          unsafe.putInt(obj2, j3, i8);
/* 3461 */                                                          iI000l1 = iI000O01llI0;
/* 3603 */                                                          if (iI000l1 == i25) {
/* 3605 */                                                              i36 = i2;
/* 3607 */                                                              bArr7 = bArr2;
/* 3608 */                                                              i38 = i8;
/* 3609 */                                                              obj5 = obj2;
/* 3610 */                                                              i111i0i111 = i111i0i12;
/* 3611 */                                                              i42 = i6;
/* 3613 */                                                              iArr2 = iArr;
/* 3615 */                                                              i37 = i7;
/* 3617 */                                                              i39 = i24;
                                                                        break;
                                                                    } else {
/* 3623 */                                                              i5 = i3;
/* 3625 */                                                              i9 = iI000l1;
/* 3626 */                                                              i39 = i24;
                                                                        break;
                                                                    }
                                                                }
/* 3602 */                                                      iI000l1 = i25;
/* 3603 */                                                      if (iI000l1 == i25) {
                                                                }
                                                            case 52:
/* 3541 */                                                      i24 = i51;
/* 3543 */                                                      i25 = i23;
/* 3545 */                                                      i111i0i12 = i111i0i16;
/* 3546 */                                                      i8 = i22;
/* 3548 */                                                      if (i49 == 5) {
/* 3550 */                                                          iI000O01llI0 = i25 + 4;
/* 3564 */                                                          unsafe.putObject(obj2, j, Float.valueOf(Float.intBitsToFloat(lillI0io.I0000Il00O(i25, bArr2))));
/* 3567 */                                                          unsafe.putInt(obj2, j3, i8);
/* 3461 */                                                          iI000l1 = iI000O01llI0;
/* 3603 */                                                          if (iI000l1 == i25) {
                                                                    }
                                                                }
/* 3602 */                                                      iI000l1 = i25;
/* 3603 */                                                      if (iI000l1 == i25) {
                                                                }
                                                                break;
                                                            case 53:
                                                            case 54:
/* 3515 */                                                      i24 = i51;
/* 3517 */                                                      i25 = i23;
/* 3518 */                                                      i111i0i12 = i111i0i16;
/* 3519 */                                                      i8 = i22;
/* 3521 */                                                      if (i49 == 0) {
/* 3523 */                                                          iI000iOII = lillI0io.I000iOII(bArr2, i25, i111i0i12);
/* 3534 */                                                          unsafe.putObject(obj2, j, Long.valueOf(i111i0i12.I00000oOI));
/* 3537 */                                                          unsafe.putInt(obj2, j3, i8);
/* 3433 */                                                          iI000l1 = iI000iOII;
/* 3603 */                                                          if (iI000l1 == i25) {
                                                                    }
                                                                }
/* 3602 */                                                      iI000l1 = i25;
/* 3603 */                                                      if (iI000l1 == i25) {
                                                                }
                                                                break;
                                                            case 55:
                                                            case 62:
/* 3490 */                                                      i24 = i51;
/* 3492 */                                                      i25 = i23;
/* 3493 */                                                      i111i0i12 = i111i0i16;
/* 3494 */                                                      i8 = i22;
/* 3496 */                                                      if (i49 == 0) {
/* 3498 */                                                          iI000O01llI0 = lillI0io.I000O01llI0(bArr2, i25, i111i0i12);
/* 3508 */                                                          unsafe.putObject(obj2, j, Integer.valueOf(i111i0i12.I00000oIO));
/* 3511 */                                                          unsafe.putInt(obj2, j3, i8);
/* 3461 */                                                          iI000l1 = iI000O01llI0;
/* 3603 */                                                          if (iI000l1 == i25) {
                                                                    }
                                                                }
/* 3602 */                                                      iI000l1 = i25;
/* 3603 */                                                      if (iI000l1 == i25) {
                                                                }
                                                                break;
                                                            case 56:
                                                            case 65:
/* 3464 */                                                      i24 = i51;
/* 3466 */                                                      i25 = i23;
/* 3468 */                                                      i111i0i12 = i111i0i16;
/* 3469 */                                                      i8 = i22;
/* 3471 */                                                      if (i49 == 1) {
/* 3473 */                                                          iI000O01llI0 = i25 + 8;
/* 3483 */                                                          unsafe.putObject(obj2, j, Long.valueOf(lillI0io.I000oI1ioi(i25, bArr2)));
/* 3486 */                                                          unsafe.putInt(obj2, j3, i8);
/* 3461 */                                                          iI000l1 = iI000O01llI0;
/* 3603 */                                                          if (iI000l1 == i25) {
                                                                    }
                                                                }
/* 3602 */                                                      iI000l1 = i25;
/* 3603 */                                                      if (iI000l1 == i25) {
                                                                }
                                                                break;
                                                            case 57:
                                                            case Barcode.FORMAT_EAN_8:
/* 3436 */                                                      i24 = i51;
/* 3438 */                                                      i25 = i23;
/* 3440 */                                                      i111i0i12 = i111i0i16;
/* 3441 */                                                      i8 = i22;
/* 3443 */                                                      if (i49 == 5) {
/* 3445 */                                                          iI000O01llI0 = i25 + 4;
/* 3455 */                                                          unsafe.putObject(obj2, j, Integer.valueOf(lillI0io.I0000Il00O(i25, bArr2)));
/* 3458 */                                                          unsafe.putInt(obj2, j3, i8);
/* 3461 */                                                          iI000l1 = iI000O01llI0;
/* 3603 */                                                          if (iI000l1 == i25) {
                                                                    }
                                                                }
/* 3602 */                                                      iI000l1 = i25;
/* 3603 */                                                      if (iI000l1 == i25) {
                                                                }
                                                                break;
                                                            case 58:
/* 3399 */                                                      i24 = i51;
/* 3401 */                                                      i25 = i23;
/* 3402 */                                                      i111i0i12 = i111i0i16;
/* 3403 */                                                      i8 = i22;
/* 3405 */                                                      if (i49 == 0) {
/* 3407 */                                                          iI000iOII = lillI0io.I000iOII(bArr2, i25, i111i0i12);
/* 3427 */                                                          unsafe.putObject(obj2, j, Boolean.valueOf(i111i0i12.I00000oOI != 0));
/* 3430 */                                                          unsafe.putInt(obj2, j3, i8);
/* 3433 */                                                          iI000l1 = iI000iOII;
/* 3603 */                                                          if (iI000l1 == i25) {
                                                                    }
                                                                }
/* 3602 */                                                      iI000l1 = i25;
/* 3603 */                                                      if (iI000l1 == i25) {
                                                                }
                                                                break;
                                                            case 59:
/* 3329 */                                                      i25 = i23;
/* 3331 */                                                      i111i0i12 = i111i0i16;
/* 3332 */                                                      i8 = i22;
/* 3334 */                                                      if (i49 == 2) {
/* 3336 */                                                          int iI000O01llI014 = lillI0io.I000O01llI0(bArr2, i25, i111i0i12);
/* 3340 */                                                          int i73 = i111i0i12.I00000oIO;
/* 3342 */                                                          if (i73 == 0) {
/* 3344 */                                                              unsafe.putObject(obj2, j, "");
/* 3347 */                                                              i24 = i51;
                                                                    } else {
/* 3354 */                                                              int i74 = iI000O01llI014 + i73;
/* 3356 */                                                              if ((i50 & 536870912) != 0) {
/* 3360 */                                                                  l0O1O1.I00000oIO.getClass();
/* 3363 */                                                                  i24 = i51;
/* 3370 */                                                                  if (iOl0lOIi11.I0010o(0, bArr2, iI000O01llI014, i74) != 0) {
/* 3373 */                                                                      iilo0lOo110.I0000oI00("Protocol message had invalid UTF-8.");
/* 3365 */                                                                      return 0;
                                                                            }
                                                                        } else {
/* 3377 */                                                                  i24 = i51;
                                                                        }
/* 3388 */                                                              unsafe.putObject(obj2, j, new String(bArr2, iI000O01llI014, i73, iloi1OI100li.I00000oIO));
/* 3391 */                                                              iI000O01llI014 = i74;
                                                                    }
/* 3393 */                                                          unsafe.putInt(obj2, j3, i8);
/* 3396 */                                                          iI000l1 = iI000O01llI014;
/* 3603 */                                                          if (iI000l1 == i25) {
                                                                    }
                                                                }
/* 3323 */                                                      i24 = i51;
/* 3602 */                                                      iI000l1 = i25;
/* 3603 */                                                      if (iI000l1 == i25) {
                                                                }
                                                                break;
                                                            case 60:
/* 3271 */                                                      i8 = i22;
/* 3274 */                                                      if (i49 == 2) {
/* 3276 */                                                          Object objI001lIiIIo1O = I001lIiIIo1O(obj2, i8, i51);
/* 3288 */                                                          int iI000lI = lillI0io.I000lI(objI001lIiIIo1O, I001iOo1i0O(i51), bArr2, i23, i2, i111i0i16);
/* 3292 */                                                          i111i0i12 = i111i0i16;
/* 3303 */                                                          unsafe9.putObject(obj2, I001IO000(i51) & 1048575, objI001lIiIIo1O);
/* 3311 */                                                          l0II0IlI.I000O01llI0(obj2, iArr[r17] & 1048575, i8);
/* 3314 */                                                          i25 = i23;
/* 3315 */                                                          i24 = i51;
/* 3317 */                                                          iI000l1 = iI000lI;
/* 3603 */                                                          if (iI000l1 == i25) {
                                                                    }
                                                                } else {
/* 3321 */                                                          i111i0i12 = i111i0i16;
/* 3322 */                                                          i25 = i23;
/* 3323 */                                                          i24 = i51;
/* 3602 */                                                          iI000l1 = i25;
/* 3603 */                                                          if (iI000l1 == i25) {
                                                                    }
                                                                }
                                                                break;
                                                            case 61:
/* 3251 */                                                      i111i0i17 = i111i0i16;
/* 3252 */                                                      i8 = i22;
/* 3255 */                                                      if (i49 == 2) {
/* 3257 */                                                          iI00000oIO = lillI0io.I00000oIO(bArr2, i23, i111i0i17);
/* 3263 */                                                          unsafe.putObject(obj2, j, i111i0i17.I0000Il00O);
/* 3266 */                                                          unsafe.putInt(obj2, j3, i8);
/* 3248 */                                                          iI000l1 = iI00000oIO;
/* 3121 */                                                          i24 = i51;
/* 3123 */                                                          i25 = i23;
/* 3124 */                                                          i111i0i12 = i111i0i17;
/* 3603 */                                                          if (iI000l1 == i25) {
                                                                    }
                                                                }
/* 3163 */                                                      i24 = i51;
/* 3165 */                                                      i25 = i23;
/* 3166 */                                                      i111i0i12 = i111i0i17;
/* 3602 */                                                      iI000l1 = i25;
/* 3603 */                                                      if (iI000l1 == i25) {
                                                                }
                                                                break;
                                                            case 63:
/* 3197 */                                                      i111i0i17 = i111i0i16;
/* 3198 */                                                      i24 = i51;
/* 3200 */                                                      i8 = i22;
/* 3202 */                                                      if (i49 == 0) {
/* 3204 */                                                          iI00000oIO = lillI0io.I000O01llI0(bArr2, i23, i111i0i17);
/* 3208 */                                                          int i75 = i111i0i17.I00000oIO;
/* 3210 */                                                          i51 = i24;
/* 3212 */                                                          iI1Il0l1O ii1il0l1oI001i1lo1io2 = I001i1lo1io(i51);
/* 3216 */                                                          if (ii1il0l1oI001i1lo1io2 == null || ii1il0l1oI001i1lo1io2.I00000oIO(i75)) {
/* 3242 */                                                              unsafe.putObject(obj2, j, Integer.valueOf(i75));
/* 3245 */                                                              unsafe.putInt(obj2, j3, i8);
                                                                    } else {
/* 3234 */                                                              I0010I0i(obj2).I0000Il00O(i6, Long.valueOf(i75));
                                                                    }
/* 3248 */                                                          iI000l1 = iI00000oIO;
/* 3121 */                                                          i24 = i51;
/* 3123 */                                                          i25 = i23;
/* 3124 */                                                          i111i0i12 = i111i0i17;
/* 3603 */                                                          if (iI000l1 == i25) {
                                                                    }
                                                                }
/* 3165 */                                                      i25 = i23;
/* 3166 */                                                      i111i0i12 = i111i0i17;
/* 3602 */                                                      iI000l1 = i25;
/* 3603 */                                                      if (iI000l1 == i25) {
                                                                }
                                                                break;
                                                            case 66:
/* 3169 */                                                      i111i0i17 = i111i0i16;
/* 3170 */                                                      i24 = i51;
/* 3172 */                                                      i8 = i22;
/* 3174 */                                                      if (i49 == 0) {
/* 3176 */                                                          iI000O01llI02 = lillI0io.I000O01llI0(bArr2, i23, i111i0i17);
/* 3190 */                                                          unsafe.putObject(obj2, j, Integer.valueOf(lilloo.I00000oIO(i111i0i17.I00000oIO)));
/* 3193 */                                                          unsafe.putInt(obj2, j3, i8);
/* 3161 */                                                          iI000l1 = iI000O01llI02;
/* 3123 */                                                          i25 = i23;
/* 3124 */                                                          i111i0i12 = i111i0i17;
/* 3603 */                                                          if (iI000l1 == i25) {
                                                                    }
                                                                }
/* 3165 */                                                      i25 = i23;
/* 3166 */                                                      i111i0i12 = i111i0i17;
/* 3602 */                                                      iI000l1 = i25;
/* 3603 */                                                      if (iI000l1 == i25) {
                                                                }
                                                                break;
                                                            case 67:
/* 3127 */                                                      i111i0i17 = i111i0i16;
/* 3128 */                                                      i8 = i22;
/* 3130 */                                                      if (i49 == 0) {
/* 3132 */                                                          iI000O01llI02 = lillI0io.I000iOII(bArr2, i23, i111i0i17);
/* 3136 */                                                          i24 = i51;
/* 3138 */                                                          long j4 = i111i0i17.I00000oOI;
/* 3155 */                                                          unsafe.putObject(obj2, j, Long.valueOf((j4 >>> 1) ^ (-(j4 & 1))));
/* 3158 */                                                          unsafe.putInt(obj2, j3, i8);
/* 3161 */                                                          iI000l1 = iI000O01llI02;
/* 3123 */                                                          i25 = i23;
/* 3124 */                                                          i111i0i12 = i111i0i17;
/* 3603 */                                                          if (iI000l1 == i25) {
                                                                    }
                                                                }
/* 3163 */                                                      i24 = i51;
/* 3165 */                                                      i25 = i23;
/* 3166 */                                                      i111i0i12 = i111i0i17;
/* 3602 */                                                      iI000l1 = i25;
/* 3603 */                                                      if (iI000l1 == i25) {
                                                                }
                                                                break;
                                                            case 68:
/* 3071 */                                                      if (i49 == 3) {
/* 3079 */                                                          Object objI001lIiIIo1O2 = I001lIiIIo1O(obj2, i22, i51);
/* 3092 */                                                          int iI000l14 = lillI0io.I000l1(objI001lIiIIo1O2, I001iOo1i0O(i51), bArr2, i23, i2, (i6 & (-8)) | 4, i111i0i16);
/* 3096 */                                                          i111i0i17 = i111i0i16;
/* 3097 */                                                          bArr2 = bArr2;
/* 3108 */                                                          unsafe9.putObject(obj2, I001IO000(i51) & 1048575, objI001lIiIIo1O2);
/* 3116 */                                                          l0II0IlI.I000O01llI0(obj2, iArr[r17] & 1048575, i22);
/* 3119 */                                                          iI000l1 = iI000l14;
/* 3120 */                                                          i8 = i22;
/* 3121 */                                                          i24 = i51;
/* 3123 */                                                          i25 = i23;
/* 3124 */                                                          i111i0i12 = i111i0i17;
/* 3603 */                                                          if (iI000l1 == i25) {
                                                                    }
                                                                }
                                                                break;
                                                            default:
/* 3061 */                                                      i24 = i51;
/* 3063 */                                                      i25 = i23;
/* 3064 */                                                      i111i0i12 = i111i0i16;
/* 3065 */                                                      i8 = i22;
/* 3602 */                                                      iI000l1 = i25;
/* 3603 */                                                      if (iI000l1 == i25) {
                                                                }
                                                                break;
                                                        }
                                                    } else {
/* 2982 */                                              if (i49 == 2) {
/* 2984 */                                                  int i76 = i51 / 3;
/* 2987 */                                                  Object obj6 = objArr[i76 + i76];
/* 2991 */                                                  Object object = unsafe10.getObject(obj2, j);
/* 3000 */                                                  if (!((ioI1oI1I) object).I00iOIl) {
/* 3002 */                                                      ioI1oI1I ioi1oi1i2 = ioI1oI1I.I00iiI;
/* 3008 */                                                      if (ioi1oi1i2.isEmpty()) {
/* 3012 */                                                          ioi1oi1i = new ioI1oI1I();
                                                                } else {
/* 3018 */                                                          ioI1oI1I ioi1oi1i3 = new ioI1oI1I(ioi1oi1i2);
/* 3022 */                                                          ioi1oi1i3.I00iOIl = true;
/* 3024 */                                                          ioi1oi1i = ioi1oi1i3;
                                                                }
/* 3025 */                                                      lioiO1.I00000oIO(ioi1oi1i, object);
/* 3028 */                                                      unsafe10.putObject(obj2, j, ioi1oi1i);
                                                            }
/* 3035 */                                                  throw IIlIOloOOO.I000l1(obj6);
                                                        }
/* 3036 */                                              unsafe = unsafe10;
                                                    }
                                                }
                                            } else if (i49 == 2) {
/* 1614 */                                      iloOl100 ilool100Zzd2 = (iloOl100) unsafe10.getObject(obj2, j);
/* 1621 */                                      if (!((il0II1iiI) ilool100Zzd2).I00iOIl) {
/* 1623 */                                          int size3 = ilool100Zzd2.size();
/* 1635 */                                          ilool100Zzd2 = ilool100Zzd2.zzd(size3 != 0 ? size3 + size3 : 10);
/* 1639 */                                          unsafe10.putObject(obj2, j, ilool100Zzd2);
                                                }
/* 1642 */                                      iloOl100 ilool1005 = ilool100Zzd2;
/* 1647 */                                      bArr7 = bArr;
/* 1649 */                                      i36 = i2;
/* 1652 */                                      iI000l1 = lillI0io.I0000oI00(I001iOo1i0O(i51), i6, bArr7, i46, i36, ilool1005, i111i0i112);
/* 1656 */                                      i111i0i111 = i111i0i1;
/* 1658 */                                      i39 = i51;
/* 1659 */                                      obj5 = obj2;
                                            } else {
/* 1662 */                                      bArr2 = bArr;
/* 1664 */                                      i4 = i40;
/* 1666 */                                      unsafe = unsafe10;
/* 1667 */                                      i22 = i47;
/* 1671 */                                      i111i0i16 = i111i0i1;
/* 1673 */                                      i23 = i46;
                                            }
                                        } else {
/* 159 */                                   int i77 = iArr2[iI00111O + 2];
/* 163 */                                   int i78 = 1 << (i77 >>> 20);
/* 165 */                                   int i79 = i77 & i43;
/* 167 */                                   if (i79 != i40) {
/* 169 */                                       int i80 = i43;
/* 171 */                                       i10 = i50;
/* 173 */                                       if (i40 != i80) {
/* 178 */                                           unsafe8.putInt(obj5, i40, i41);
/* 181 */                                           i80 = 1048575;
                                                }
/* 189 */                                       i11 = i79 == i80 ? 0 : unsafe8.getInt(obj5, i79);
/* 193 */                                       i12 = i79;
                                            } else {
/* 196 */                                       i10 = i50;
/* 198 */                                       i11 = i41;
/* 200 */                                       i12 = i40;
                                            }
                                            switch (iI001IIilI0O) {
                                                case 0:
/* 1491 */                                          bArr3 = bArr;
/* 1493 */                                          i111i0i13 = i111i0i1;
/* 1495 */                                          objArr = objArr2;
/* 1497 */                                          unsafe2 = unsafe8;
/* 1498 */                                          i6 = i42;
/* 1500 */                                          i13 = i46;
/* 1506 */                                          iArr = iArr2;
/* 1508 */                                          i14 = iI00111O;
/* 1509 */                                          i15 = i11;
/* 1512 */                                          i7 = i37;
/* 1514 */                                          if (i49 != 1) {
                                                        break;
                                                    } else {
/* 1535 */                                              l0II0IlI.I0000Il00O.I00II0oii1o(obj5, j, Double.longBitsToDouble(lillI0io.I000oI1ioi(i13, bArr3)));
/* 1538 */                                              i36 = i2;
/* 1540 */                                              i111i0i111 = i111i0i13;
/* 1516 */                                              iI000l1 = i13 + 8;
/* 1542 */                                              bArr7 = bArr3;
/* 1543 */                                              i39 = i14;
/* 1544 */                                              i38 = i47;
/* 1545 */                                              i42 = i6;
/* 1547 */                                              i40 = i12;
/* 1549 */                                              iArr2 = iArr;
/* 1551 */                                              i37 = i7;
/* 1553 */                                              objArr2 = objArr;
/* 1555 */                                              i43 = 1048575;
/* 1518 */                                              i41 = i15 | i78;
                                                    }
                                                case 1:
/* 1424 */                                          bArr3 = bArr;
/* 1426 */                                          i111i0i13 = i111i0i1;
/* 1428 */                                          objArr = objArr2;
/* 1430 */                                          unsafe2 = unsafe8;
/* 1431 */                                          i6 = i42;
/* 1433 */                                          i13 = i46;
/* 1438 */                                          iArr = iArr2;
/* 1440 */                                          i14 = iI00111O;
/* 1441 */                                          i15 = i11;
/* 1444 */                                          i7 = i37;
/* 1446 */                                          if (i49 != 5) {
                                                        break;
                                                    } else {
/* 1462 */                                              l0II0IlI.I0000Il00O.I00IioO0OiOi(obj5, j, Float.intBitsToFloat(lillI0io.I0000Il00O(i13, bArr3)));
/* 1465 */                                              i36 = i2;
/* 1448 */                                              iI000l1 = i13 + 4;
/* 1468 */                                              i111i0i111 = i111i0i13;
/* 1469 */                                              bArr7 = bArr3;
/* 1470 */                                              i39 = i14;
/* 1471 */                                              i38 = i47;
/* 1472 */                                              i42 = i6;
/* 1474 */                                              i40 = i12;
/* 1476 */                                              iArr2 = iArr;
/* 1478 */                                              i37 = i7;
/* 1480 */                                              objArr2 = objArr;
/* 1482 */                                              i43 = 1048575;
/* 1450 */                                              i41 = i15 | i78;
                                                    }
                                                case 2:
                                                case 3:
/* 1376 */                                          bArr3 = bArr;
/* 1378 */                                          i111i0i13 = i111i0i1;
/* 1380 */                                          objArr = objArr2;
/* 1382 */                                          i13 = i46;
/* 1388 */                                          iArr = iArr2;
/* 1390 */                                          i7 = i37;
/* 1392 */                                          i14 = iI00111O;
/* 1393 */                                          unsafe3 = unsafe8;
/* 1394 */                                          i6 = i42;
/* 1396 */                                          if (i49 != 0) {
                                                        break;
                                                    } else {
/* 1398 */                                              i16 = i11 | i78;
/* 1400 */                                              int iI000iOII2 = lillI0io.I000iOII(bArr3, i13, i111i0i13);
/* 1407 */                                              unsafe3.putLong(obj5, j, i111i0i13.I00000oOI);
/* 1410 */                                              i36 = i2;
/* 1412 */                                              i111i0i111 = i111i0i13;
/* 1413 */                                              bArr7 = bArr3;
/* 1414 */                                              iI000l1 = iI000iOII2;
/* 1415 */                                              i38 = i47;
/* 1416 */                                              i42 = i6;
/* 1418 */                                              i40 = i12;
/* 1420 */                                              i37 = i7;
/* 344 */                                               objArr2 = objArr;
/* 346 */                                               i43 = 1048575;
/* 349 */                                               i41 = i16;
/* 351 */                                               i39 = i14;
/* 352 */                                               iArr2 = iArr;
                                                    }
                                                case 4:
                                                case 11:
/* 1332 */                                          bArr3 = bArr;
/* 1334 */                                          i111i0i13 = i111i0i1;
/* 1336 */                                          objArr = objArr2;
/* 1338 */                                          i13 = i46;
/* 1344 */                                          iArr = iArr2;
/* 1346 */                                          i7 = i37;
/* 1348 */                                          i14 = iI00111O;
/* 1349 */                                          unsafe3 = unsafe8;
/* 1350 */                                          i6 = i42;
/* 1352 */                                          if (i49 == 0) {
/* 1356 */                                              iI000l1 = lillI0io.I000O01llI0(bArr3, i13, i111i0i13);
/* 1362 */                                              unsafe3.putInt(obj5, j, i111i0i13.I00000oIO);
/* 1365 */                                              int i81 = i12;
/* 1354 */                                              i41 = i11 | i78;
/* 1369 */                                              bArr7 = bArr3;
/* 1370 */                                              i40 = i81;
/* 1371 */                                              i36 = i2;
/* 1373 */                                              i111i0i111 = i111i0i13;
                                                        break;
                                                    }
                                                    break;
                                                case 5:
                                                case 14:
/* 1257 */                                          bArr3 = bArr;
/* 1259 */                                          Object obj7 = obj5;
/* 1260 */                                          objArr = objArr2;
/* 1263 */                                          i6 = i42;
/* 1265 */                                          i13 = i46;
/* 1273 */                                          iArr = iArr2;
/* 1275 */                                          i7 = i37;
/* 1277 */                                          i14 = iI00111O;
/* 1280 */                                          if (i49 != 1) {
/* 1324 */                                              i111i0i13 = i111i0i1;
/* 1325 */                                              unsafe3 = unsafe8;
/* 1326 */                                              obj5 = obj7;
                                                        break;
                                                    } else {
/* 1284 */                                              int i82 = i11 | i78;
/* 1293 */                                              obj5 = obj7;
/* 1295 */                                              unsafe8.putLong(obj5, j, lillI0io.I000oI1ioi(i13, bArr3));
/* 1298 */                                              i36 = i2;
/* 1300 */                                              i111i0i111 = i111i0i1;
/* 1282 */                                              iI000l1 = i13 + 8;
/* 1302 */                                              bArr7 = bArr3;
/* 1303 */                                              i39 = i14;
/* 1304 */                                              i38 = i47;
/* 1305 */                                              i42 = i6;
/* 1307 */                                              i40 = i12;
/* 1309 */                                              iArr2 = iArr;
/* 1311 */                                              objArr2 = objArr;
/* 1313 */                                              i43 = 1048575;
/* 1316 */                                              i41 = i82;
/* 1318 */                                              i37 = i7;
                                                    }
                                                case 6:
                                                case 13:
/* 1206 */                                          bArr3 = bArr;
/* 1208 */                                          obj3 = obj5;
/* 1209 */                                          objArr = objArr2;
/* 1211 */                                          unsafe4 = unsafe8;
/* 1212 */                                          i6 = i42;
/* 1214 */                                          i13 = i46;
/* 1221 */                                          iArr = iArr2;
/* 1223 */                                          i7 = i37;
/* 1225 */                                          i14 = iI00111O;
/* 1226 */                                          i111i0i14 = i111i0i1;
/* 1228 */                                          if (i49 != 5) {
                                                        break;
                                                    } else {
/* 1232 */                                              i17 = i11 | i78;
/* 1238 */                                              unsafe4.putInt(obj3, j, lillI0io.I0000Il00O(i13, bArr3));
/* 1241 */                                              i111i0i111 = i111i0i14;
/* 1230 */                                              iI000l1 = i13 + 4;
/* 1243 */                                              obj5 = obj3;
/* 1244 */                                              bArr7 = bArr3;
/* 1245 */                                              i39 = i14;
/* 1246 */                                              i38 = i47;
/* 1247 */                                              i42 = i6;
/* 1249 */                                              i40 = i12;
/* 1251 */                                              iArr2 = iArr;
/* 1253 */                                              i37 = i7;
/* 525 */                                               objArr2 = objArr;
/* 527 */                                               i43 = 1048575;
/* 530 */                                               i41 = i17;
/* 532 */                                               i36 = i2;
                                                    }
                                                case 7:
/* 1139 */                                          bArr3 = bArr;
/* 1141 */                                          obj3 = obj5;
/* 1142 */                                          objArr = objArr2;
/* 1144 */                                          unsafe4 = unsafe8;
/* 1145 */                                          i6 = i42;
/* 1147 */                                          i13 = i46;
/* 1153 */                                          iArr = iArr2;
/* 1155 */                                          i7 = i37;
/* 1157 */                                          i14 = iI00111O;
/* 1158 */                                          i111i0i14 = i111i0i1;
/* 1160 */                                          if (i49 != 0) {
                                                        break;
                                                    } else {
/* 1162 */                                              int i83 = i11 | i78;
/* 1164 */                                              iI000l1 = lillI0io.I000iOII(bArr3, i13, i111i0i14);
/* 1180 */                                              l0II0IlI.I0000Il00O.I001iOo1i0O(obj3, j, i111i0i14.I00000oOI != 0);
/* 1183 */                                              i36 = i2;
/* 1185 */                                              i111i0i111 = i111i0i14;
/* 1186 */                                              bArr7 = bArr3;
/* 1187 */                                              i39 = i14;
/* 1188 */                                              i42 = i6;
/* 1190 */                                              i40 = i12;
/* 1192 */                                              iArr2 = iArr;
/* 1194 */                                              i37 = i7;
/* 1196 */                                              objArr2 = objArr;
/* 1198 */                                              i43 = 1048575;
/* 1201 */                                              i41 = i83;
/* 1203 */                                              obj5 = obj3;
/* 428 */                                               i38 = i47;
                                                    }
                                                case 8:
/* 656 */                                           bArr3 = bArr;
/* 658 */                                           obj3 = obj5;
/* 659 */                                           objArr = objArr2;
/* 661 */                                           unsafe4 = unsafe8;
/* 662 */                                           i6 = i42;
/* 664 */                                           i13 = i46;
/* 671 */                                           iArr = iArr2;
/* 673 */                                           i14 = iI00111O;
/* 674 */                                           i111i0i14 = i111i0i1;
/* 676 */                                           if (i49 == 2) {
/* 680 */                                               if ((i10 & 536870912) != 0) {
/* 682 */                                                   int iI000O01llI015 = lillI0io.I000O01llI0(bArr3, i13, i111i0i14);
/* 686 */                                                   int i84 = i111i0i14.I00000oIO;
/* 688 */                                                   if (i84 < 0) {
/* 1073 */                                                      iilo0lOo110.I0000oI00("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
/* 1072 */                                                      return 0;
                                                            }
/* 690 */                                                   int i85 = i11 | i78;
/* 692 */                                                   if (i84 == 0) {
/* 694 */                                                       i111i0i14.I0000Il00O = "";
/* 696 */                                                       i20 = i85;
/* 698 */                                                       i7 = i37;
                                                            } else {
/* 705 */                                                       int length = bArr3.length;
/* 710 */                                                       iOl0lOIi11 iol0loii11 = l0O1O1.I00000oIO;
/* 714 */                                                       if ((iI000O01llI015 | i84 | ((length - iI000O01llI015) - i84)) < 0) {
/* 1068 */                                                          OoOil11Ol1o.I000o00OoI0I("buffer length=%d, index=%d, size=%d", new Object[]{Integer.valueOf(length), Integer.valueOf(iI000O01llI015), Integer.valueOf(i84)});
/* 1049 */                                                          return 0;
                                                                }
/* 716 */                                                       int i86 = iI000O01llI015 + i84;
/* 718 */                                                       char[] cArr = new char[i84];
/* 720 */                                                       int i87 = 0;
                                                                while (true) {
/* 721 */                                                           i19 = iI000O01llI015;
/* 723 */                                                           if (iI000O01llI015 < i86 && (b2 = bArr3[i19]) >= 0) {
/* 734 */                                                               cArr[i87] = (char) b2;
/* 729 */                                                               iI000O01llI015 = i19 + 1;
/* 731 */                                                               i87++;
                                                                    }
                                                                }
/* 741 */                                                       int i88 = i19;
/* 743 */                                                       while (i88 < i86) {
/* 745 */                                                           int i89 = i88;
/* 747 */                                                           i88 = i89 + 1;
/* 749 */                                                           int i90 = i85;
/* 751 */                                                           byte b3 = bArr3[i89];
/* 753 */                                                           if (b3 < 0) {
/* 779 */                                                               int i91 = i37;
/* 783 */                                                               if (b3 >= -32) {
/* 837 */                                                                   if (b3 < -16) {
/* 841 */                                                                       if (i88 >= i86 - 1) {
/* 920 */                                                                           iilo0lOo110.I0000oI00("Protocol message had invalid UTF-8.");
/* 918 */                                                                           return 0;
                                                                                }
/* 843 */                                                                       int i92 = i87 + 1;
/* 845 */                                                                       int i93 = i89 + 2;
/* 847 */                                                                       byte b4 = bArr3[i88];
/* 849 */                                                                       int i94 = i89 + 3;
/* 851 */                                                                       byte b5 = bArr3[i93];
/* 857 */                                                                       if (ll00lOO1o.I00000oIO(b4)) {
                                                                                    break;
                                                                                } else {
/* 859 */                                                                           int i95 = i86;
/* 867 */                                                                           if (b3 == -32) {
/* 869 */                                                                               if (b4 < -96) {
                                                                                            break;
                                                                                        } else {
/* 871 */                                                                                   b3 = -32;
                                                                                        }
                                                                                    }
/* 874 */                                                                           if (b3 == -19) {
/* 876 */                                                                               if (b4 >= -96) {
                                                                                            break;
                                                                                        } else {
/* 878 */                                                                                   b3 = -19;
                                                                                        }
                                                                                    }
/* 883 */                                                                           if (ll00lOO1o.I00000oIO(b5)) {
                                                                                        break;
                                                                                    } else {
/* 898 */                                                                               cArr[i87] = (char) (((b4 & 63) << 6) | ((b3 & 15) << 12) | (b5 & 63));
/* 900 */                                                                               i85 = i90;
/* 902 */                                                                               i88 = i94;
/* 904 */                                                                               i37 = i91;
/* 906 */                                                                               i86 = i95;
/* 908 */                                                                               i87 = i92;
                                                                                    }
                                                                                }
                                                                            } else {
/* 924 */                                                                       int i96 = i86;
/* 928 */                                                                       if (i88 >= i96 - 2) {
/* 1025 */                                                                          iilo0lOo110.I0000oI00("Protocol message had invalid UTF-8.");
/* 1024 */                                                                          return 0;
                                                                                }
/* 932 */                                                                       byte b6 = bArr3[i88];
/* 934 */                                                                       int i97 = i89 + 3;
/* 936 */                                                                       byte b7 = bArr3[i89 + 2];
/* 938 */                                                                       int i98 = i89 + 4;
/* 940 */                                                                       byte b8 = bArr3[i97];
/* 946 */                                                                       if (ll00lOO1o.I00000oIO(b6)) {
                                                                                    break;
                                                                                } else if ((((b6 + 112) + (b3 << 28)) >> 30) != 0 || ll00lOO1o.I00000oIO(b7) || ll00lOO1o.I00000oIO(b8)) {
                                                                                    break;
                                                                                } else {
/* 986 */                                                                           int i99 = ((b6 & 63) << 12) | ((b3 & 7) << 18) | ((b7 & 63) << 6) | (b8 & 63);
/* 994 */                                                                           cArr[i87] = (char) ((i99 >>> 10) + 55232);
/* 1005 */                                                                          cArr[i87 + 1] = (char) ((i99 & 1023) + 56320);
/* 1007 */                                                                          i87 += 2;
/* 1009 */                                                                          i85 = i90;
/* 1011 */                                                                          i88 = i98;
/* 1013 */                                                                          i37 = i91;
/* 1015 */                                                                          i86 = i96;
                                                                                }
                                                                            }
                                                                        } else {
/* 785 */                                                                   if (i88 >= i86) {
/* 831 */                                                                       iilo0lOo110.I0000oI00("Protocol message had invalid UTF-8.");
/* 829 */                                                                       return 0;
                                                                            }
/* 787 */                                                                   int i100 = i87 + 1;
/* 789 */                                                                   int i101 = i89 + 2;
/* 791 */                                                                   byte b9 = bArr3[i88];
/* 797 */                                                                   if (b3 < -62 || ll00lOO1o.I00000oIO(b9)) {
                                                                                break;
                                                                            } else {
/* 813 */                                                                       cArr[i87] = (char) (((b3 & 31) << 6) | (b9 & 63));
/* 815 */                                                                       i85 = i90;
/* 817 */                                                                       i87 = i100;
/* 818 */                                                                       i88 = i101;
/* 820 */                                                                       i37 = i91;
                                                                            }
                                                                        }
                                                                    } else {
/* 755 */                                                               int i102 = i87 + 1;
/* 758 */                                                               cArr[i87] = (char) b3;
                                                                        while (true) {
/* 760 */                                                                   i87 = i102;
/* 762 */                                                                   if (i88 < i86 && (b = bArr3[i88]) >= 0) {
/* 768 */                                                                       i88++;
/* 770 */                                                                       i102 = i87 + 1;
/* 773 */                                                                       cArr[i87] = (char) b;
                                                                            }
                                                                        }
/* 776 */                                                               i85 = i90;
                                                                    }
                                                                }
/* 1031 */                                                      i20 = i85;
/* 1033 */                                                      i7 = i37;
/* 1041 */                                                      i111i0i14.I0000Il00O = new String(cArr, 0, i87);
/* 1043 */                                                      iI000O01llI015 = i86;
                                                            }
/* 1045 */                                                  iI000l1 = iI000O01llI015;
/* 1046 */                                                  i18 = i20;
                                                        } else {
/* 1077 */                                                  i7 = i37;
/* 1079 */                                                  i18 = i11 | i78;
/* 1081 */                                                  iI000l1 = lillI0io.I000O01llI0(bArr3, i13, i111i0i14);
/* 1085 */                                                  int i103 = i111i0i14.I00000oIO;
/* 1087 */                                                  if (i103 < 0) {
/* 1105 */                                                      iilo0lOo110.I0000oI00("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
/* 1108 */                                                      iI000l1 = 0;
                                                            } else if (i103 == 0) {
/* 1091 */                                                      i111i0i14.I0000Il00O = "";
                                                            } else {
/* 1101 */                                                      i111i0i14.I0000Il00O = new String(bArr3, iI000l1, i103, iloi1OI100li.I00000oIO);
/* 1103 */                                                      iI000l1 += i103;
                                                            }
                                                        }
/* 1111 */                                              unsafe4.putObject(obj3, j, i111i0i14.I0000Il00O);
/* 1114 */                                              int i104 = i12;
/* 1116 */                                              i41 = i18;
/* 1118 */                                              bArr7 = bArr3;
/* 1119 */                                              i40 = i104;
/* 1120 */                                              i36 = i2;
/* 1122 */                                              i111i0i111 = i111i0i14;
/* 1123 */                                              obj5 = obj3;
                                                        break;
                                                    } else {
/* 1134 */                                              i7 = i37;
                                                        break;
                                                    }
                                                    break;
                                                case 9:
/* 575 */                                           objArr = objArr2;
/* 577 */                                           i13 = i46;
/* 584 */                                           iArr = iArr2;
/* 586 */                                           i14 = iI00111O;
/* 587 */                                           Object obj8 = obj5;
/* 589 */                                           i6 = i42;
/* 591 */                                           if (i49 != 2) {
/* 645 */                                               obj3 = obj8;
/* 646 */                                               i111i0i14 = i111i0i1;
/* 647 */                                               bArr3 = bArr;
/* 649 */                                               unsafe2 = unsafe8;
/* 650 */                                               i7 = i37;
                                                        break;
                                                    } else {
/* 593 */                                               i16 = i11 | i78;
/* 596 */                                               Object objI001l0I00 = I001l0I00(i14, obj8);
/* 610 */                                               iI000l1 = lillI0io.I000lI(objI001l0I00, I001iOo1i0O(i14), bArr, i13, i2, i111i0i1);
/* 627 */                                               unsafe9.putObject(obj, I001IO000(i14) & 1048575, objI001l0I00);
/* 630 */                                               I000iOII(i14, obj);
/* 633 */                                               i36 = i2;
/* 635 */                                               i111i0i111 = i111i0i1;
/* 636 */                                               obj5 = obj;
/* 637 */                                               bArr7 = bArr;
/* 638 */                                               i38 = i47;
/* 639 */                                               i42 = i6;
/* 342 */                                               i40 = i12;
/* 344 */                                               objArr2 = objArr;
/* 346 */                                               i43 = 1048575;
/* 349 */                                               i41 = i16;
/* 351 */                                               i39 = i14;
/* 352 */                                               iArr2 = iArr;
                                                    }
                                                case 10:
/* 536 */                                           bArr4 = bArr;
/* 538 */                                           i111i0i15 = i111i0i1;
/* 540 */                                           objArr = objArr2;
/* 542 */                                           i13 = i46;
/* 549 */                                           iArr = iArr2;
/* 551 */                                           i14 = iI00111O;
/* 552 */                                           obj4 = obj5;
/* 553 */                                           unsafe5 = unsafe8;
/* 554 */                                           i6 = i42;
/* 556 */                                           if (i49 != 2) {
                                                        break;
                                                    } else {
/* 558 */                                               i21 = i11 | i78;
/* 560 */                                               iI000l1 = lillI0io.I00000oIO(bArr4, i13, i111i0i15);
/* 566 */                                               unsafe5.putObject(obj4, j, i111i0i15.I0000Il00O);
/* 409 */                                               i36 = i2;
/* 411 */                                               obj5 = obj4;
/* 412 */                                               i111i0i111 = i111i0i15;
/* 413 */                                               i39 = i14;
/* 414 */                                               i42 = i6;
/* 416 */                                               i40 = i12;
/* 418 */                                               iArr2 = iArr;
/* 420 */                                               objArr2 = objArr;
/* 422 */                                               i43 = 1048575;
/* 425 */                                               i41 = i21;
/* 427 */                                               bArr7 = bArr4;
/* 428 */                                               i38 = i47;
                                                    }
                                                case 12:
/* 431 */                                           bArr4 = bArr;
/* 433 */                                           i111i0i15 = i111i0i1;
/* 435 */                                           objArr = objArr2;
/* 437 */                                           i13 = i46;
/* 443 */                                           iArr = iArr2;
/* 445 */                                           i14 = iI00111O;
/* 446 */                                           obj4 = obj5;
/* 447 */                                           unsafe5 = unsafe8;
/* 448 */                                           i6 = i42;
/* 450 */                                           if (i49 != 0) {
                                                        break;
                                                    } else {
/* 452 */                                               iI000l1 = lillI0io.I000O01llI0(bArr4, i13, i111i0i15);
/* 456 */                                               int i105 = i111i0i15.I00000oIO;
/* 458 */                                               iI1Il0l1O ii1il0l1oI001i1lo1io3 = I001i1lo1io(i14);
/* 466 */                                               if ((i10 & Integer.MIN_VALUE) != 0 && ii1il0l1oI001i1lo1io3 != null && !ii1il0l1oI001i1lo1io3.I00000oIO(i105)) {
/* 486 */                                                   I0010I0i(obj4).I0000Il00O(i6, Long.valueOf(i105));
/* 489 */                                                   int i106 = i12;
/* 491 */                                                   i41 = i11;
/* 493 */                                                   i111i0i111 = i111i0i15;
/* 494 */                                                   i40 = i106;
/* 495 */                                                   i36 = i2;
/* 497 */                                                   obj5 = obj4;
/* 498 */                                                   bArr7 = bArr4;
/* 499 */                                                   i39 = i14;
/* 500 */                                                   i38 = i47;
/* 501 */                                                   i42 = i6;
/* 503 */                                                   iArr2 = iArr;
                                                            break;
                                                        } else {
/* 509 */                                                   i17 = i11 | i78;
/* 511 */                                                   unsafe5.putInt(obj4, j, i105);
/* 514 */                                                   obj5 = obj4;
/* 515 */                                                   bArr7 = bArr4;
/* 516 */                                                   i111i0i111 = i111i0i15;
/* 517 */                                                   i39 = i14;
/* 518 */                                                   i38 = i47;
/* 519 */                                                   i42 = i6;
/* 521 */                                                   i40 = i12;
/* 523 */                                                   iArr2 = iArr;
/* 525 */                                                   objArr2 = objArr;
/* 527 */                                                   i43 = 1048575;
/* 530 */                                                   i41 = i17;
/* 532 */                                                   i36 = i2;
                                                        }
                                                    }
                                                case 15:
/* 373 */                                           bArr4 = bArr;
/* 375 */                                           i111i0i15 = i111i0i1;
/* 377 */                                           objArr = objArr2;
/* 379 */                                           i13 = i46;
/* 385 */                                           iArr = iArr2;
/* 387 */                                           i14 = iI00111O;
/* 388 */                                           obj4 = obj5;
/* 389 */                                           unsafe5 = unsafe8;
/* 390 */                                           i6 = i42;
/* 392 */                                           if (i49 != 0) {
                                                        break;
                                                    } else {
/* 394 */                                               i21 = i11 | i78;
/* 396 */                                               iI000l1 = lillI0io.I000O01llI0(bArr4, i13, i111i0i15);
/* 406 */                                               unsafe5.putInt(obj4, j, lilloo.I00000oIO(i111i0i15.I00000oIO));
/* 409 */                                               i36 = i2;
/* 411 */                                               obj5 = obj4;
/* 412 */                                               i111i0i111 = i111i0i15;
/* 413 */                                               i39 = i14;
/* 414 */                                               i42 = i6;
/* 416 */                                               i40 = i12;
/* 418 */                                               iArr2 = iArr;
/* 420 */                                               objArr2 = objArr;
/* 422 */                                               i43 = 1048575;
/* 425 */                                               i41 = i21;
/* 427 */                                               bArr7 = bArr4;
/* 428 */                                               i38 = i47;
                                                    }
                                                case 16:
/* 297 */                                           bArr4 = bArr;
/* 299 */                                           i111i0i15 = i111i0i1;
/* 301 */                                           objArr = objArr2;
/* 303 */                                           i13 = i46;
/* 307 */                                           if (i49 != 0) {
/* 358 */                                               iArr = iArr2;
/* 360 */                                               i14 = iI00111O;
/* 361 */                                               obj4 = obj5;
/* 362 */                                               unsafe5 = unsafe8;
/* 363 */                                               i6 = i42;
                                                        break;
                                                    } else {
/* 309 */                                               i16 = i11 | i78;
/* 311 */                                               int iI000iOII3 = lillI0io.I000iOII(bArr4, i13, i111i0i15);
/* 315 */                                               long j5 = i111i0i15.I00000oOI;
/* 327 */                                               iArr = iArr2;
/* 329 */                                               i14 = iI00111O;
/* 333 */                                               unsafe8.putLong(obj5, j, (-(j5 & 1)) ^ (j5 >>> 1));
/* 336 */                                               i36 = i2;
/* 338 */                                               bArr7 = bArr4;
/* 339 */                                               i111i0i111 = i111i0i15;
/* 340 */                                               iI000l1 = iI000iOII3;
/* 341 */                                               i38 = i47;
/* 342 */                                               i40 = i12;
/* 344 */                                               objArr2 = objArr;
/* 346 */                                               i43 = 1048575;
/* 349 */                                               i41 = i16;
/* 351 */                                               i39 = i14;
/* 352 */                                               iArr2 = iArr;
                                                    }
                                                default:
/* 207 */                                           if (i49 != 3) {
/* 275 */                                               objArr = objArr2;
/* 277 */                                               bArr3 = bArr;
/* 279 */                                               i111i0i13 = i111i0i1;
/* 281 */                                               i7 = i37;
/* 283 */                                               unsafe2 = unsafe8;
/* 284 */                                               i6 = i42;
/* 286 */                                               i13 = i46;
/* 290 */                                               obj2 = obj5;
/* 291 */                                               iArr = iArr2;
/* 293 */                                               i14 = iI00111O;
                                                        break;
                                                    } else {
/* 209 */                                               int i107 = i11 | i78;
/* 211 */                                               Object objI001l0I002 = I001l0I00(iI00111O, obj5);
/* 237 */                                               iI000l1 = lillI0io.I000l1(objI001l0I002, I001iOo1i0O(iI00111O), bArr, i46, i2, (i47 << 3) | 4, i111i0i1);
/* 252 */                                               unsafe9.putObject(obj5, I001IO000(iI00111O) & 1048575, objI001l0I002);
/* 255 */                                               I000iOII(iI00111O, obj5);
/* 258 */                                               i36 = i2;
/* 260 */                                               i39 = iI00111O;
/* 261 */                                               bArr7 = bArr;
/* 262 */                                               i111i0i111 = i111i0i1;
/* 263 */                                               i38 = i47;
/* 264 */                                               i40 = i12;
/* 266 */                                               objArr2 = objArr2;
/* 268 */                                               i43 = 1048575;
/* 271 */                                               i41 = i107;
                                                    }
                                            }
                                        }
                                    } else {
/* 97 */                                i4 = i40;
/* 99 */                                objArr = objArr2;
/* 101 */                               iArr = iArr2;
/* 103 */                               i7 = i37;
/* 105 */                               i8 = i47;
/* 106 */                               unsafe = unsafe8;
/* 107 */                               i6 = i42;
/* 109 */                               i39 = 0;
/* 110 */                               i5 = i3;
/* 112 */                               obj2 = obj5;
/* 113 */                               bArr2 = bArr7;
/* 114 */                               i9 = i46;
/* 115 */                               i111i0i12 = i111i0i111;
                                    }
                                } else {
/* 80 */                            if (i47 >= i48 && i47 <= i37) {
/* 85 */                                iI00111O = I00111O(i47, 0);
                                    }
/* 93 */                            if (iI00111O == -1) {
                                    }
                                }
                            } else {
/* 3712 */                      obj2 = obj5;
/* 3713 */                      i4 = i40;
/* 3715 */                      objArr = objArr2;
/* 3717 */                      iArr = iArr2;
/* 3719 */                      unsafe = unsafe8;
/* 3720 */                      i5 = i3;
/* 3722 */                      i6 = i42;
                            }
                        }
/* 2944 */              i8 = i22;
/* 3628 */              if (i6 != i5 || i5 == 0) {
/* 3646 */                  if (this.I0001Ioi1lo) {
/* 3650 */                      ilOO1I1l iloo1i1l = (ilOO1I1l) i111i0i12.I0000oI00;
/* 3652 */                      ilOO1I1l iloo1i1l2 = ilOO1I1l.I00000oOI;
/* 3654 */                      ioiO0iOooii ioio0ioooii = ioiO0iOooii.I0000Il00O;
/* 3658 */                      if (iloo1i1l != ilOO1I1l.I00000oOI) {
/* 3662 */                          iloo1i1l.I00000oIO(this.I0000oI00, i8);
/* 3674 */                          iI000II = lillI0io.I000II(i6, bArr2, i9, i2, I0010I0i(obj2), i111i0i12);
/* 3678 */                          i36 = i2;
                                } else {
/* 3693 */                          iI000II = lillI0io.I000II(i6, bArr, i9, i2, I0010I0i(obj2), i111i0i1);
/* 3697 */                          i36 = i2;
                                }
/* 3680 */                      iI000l1 = iI000II;
/* 3699 */                      bArr7 = bArr;
/* 3701 */                      i111i0i111 = i111i0i1;
/* 3703 */                      i38 = i8;
/* 3704 */                      obj5 = obj2;
/* 3705 */                      i42 = i6;
/* 3707 */                      iArr2 = iArr;
/* 3709 */                      i37 = i7;
/* 3619 */                      i40 = i4;
                            }
/* 505 */                   objArr2 = objArr;
                        } else {
/* 3632 */                  i36 = i2;
/* 3634 */                  iI000l1 = i9;
                        }
                    }
/* 3635 */          int i108 = i41;
/* 3637 */          int i109 = i4;
/* 3725 */          if (i109 != 1048575) {
/* 3728 */              unsafe.putInt(obj2, i109, i108);
                    }
/* 3735 */          for (int i110 = this.I000O01llI0; i110 < this.I000OOo1O; i110++) {
/* 3739 */              int i111 = this.I000II[i110];
/* 3741 */              int i112 = iArr[i111];
/* 3753 */              Object objI000II = l0II0IlI.I000II(obj2, I001IO000(i111) & 1048575);
/* 3757 */              if (objI000II != null && I001i1lo1io(i111) != null) {
/* 3772 */                  int i113 = i111 / 3;
/* 3780 */                  throw IIlIOloOOO.I000l1(objArr[i113 + i113]);
                        }
                    }
/* 3783 */          if (i5 == 0) {
/* 3785 */              if (iI000l1 != i36) {
/* 3788 */                  iilo0lOo110.I0000oI00("Failed to parse the message.");
/* 3791 */                  return 0;
                        }
                    } else if (iI000l1 > i36 || i6 != i5) {
/* 3801 */              iilo0lOo110.I0000oI00("Failed to parse the message.");
/* 3794 */              return 0;
                    }
/* 3800 */          return iI000l1;
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

                public final iI1Il0l1O I001i1lo1io(int i) {
/* 1 */             int i2 = i / 3;
/* 10 */            return (iI1Il0l1O) this.I00000oOI[i2 + i2 + 1];
                }

                public final iooIIllo I001iOo1i0O(int i) {
/* 1 */             Object[] objArr = this.I00000oOI;
/* 3 */             int i2 = i / 3;
/* 5 */             int i3 = i2 + i2;
/* 8 */             iooIIllo iooiillo = (iooIIllo) objArr[i3];
/* 10 */            if (iooiillo != null) {
/* 12 */                return iooiillo;
                    }
/* 21 */            iooIIllo iooiilloI00000oIO = ioiO0iOooii.I0000Il00O.I00000oIO((Class) objArr[i3 + 1]);
/* 25 */            objArr[i3] = iooiilloI00000oIO;
/* 29 */            return iooiilloI00000oIO;
                }

                public final Object I001l0I00(int i, Object obj) {
/* 1 */             iooIIllo iooiilloI001iOo1i0O = I001iOo1i0O(i);
/* 12 */            int iI001IO000 = I001IO000(i) & 1048575;
/* 17 */            if (!I000lI(obj, i)) {
/* 19 */                return iooiilloI001iOo1i0O.zze();
                    }
/* 27 */            Object object = I000lI.getObject(obj, iI001IO000);
/* 35 */            if (I000oI1ioi(object)) {
/* 37 */                return object;
                    }
/* 38 */            Object objZze = iooiilloI001iOo1i0O.zze();
/* 42 */            if (object != null) {
/* 44 */                iooiilloI001iOo1i0O.I00000oOI(objZze, object);
                    }
/* 106 */           return objZze;
                }

                public final Object I001lIiIIo1O(Object obj, int i, int i2) {
/* 1 */             iooIIllo iooiilloI001iOo1i0O = I001iOo1i0O(i2);
/* 9 */             if (!I00100l0(obj, i, i2)) {
/* 11 */                return iooiilloI001iOo1i0O.zze();
                    }
/* 27 */            Object object = I000lI.getObject(obj, I001IO000(i2) & 1048575);
/* 35 */            if (I000oI1ioi(object)) {
/* 37 */                return object;
                    }
/* 38 */            Object objZze = iooiilloI001iOo1i0O.zze();
/* 42 */            if (object != null) {
/* 44 */                iooiilloI001iOo1i0O.I00000oOI(objZze, object);
                    }
/* 98 */            return objZze;
                }

                @Override
                public final Object zze() {
/* 11 */            return (illOil) ((illOil) this.I0000oI00).I000oI1ioi(4, null);
                }
            }

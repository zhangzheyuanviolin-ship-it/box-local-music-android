            package p000;

            import com.google.ai.edge.gallery.BuildConfig;
            import com.google.mlkit.vision.barcode.common.Barcode;
            import com.google.mlkit.vision.common.InputImage;
            import com.google.mlkit.vision.pose.PoseLandmark;
            import java.io.IOException;
            import java.lang.reflect.Field;
            import java.nio.charset.Charset;
            import java.security.AccessController;
            import java.util.Arrays;
            import java.util.Iterator;
            import java.util.List;
            import java.util.Map;
            import sun.misc.Unsafe;
            
            public final class ii0lOl implements ii0oioOi00i {
                public static final int[] I000lI = new int[0];
                public static final Unsafe I000o00OoI0I;
                public int[] I00000oIO;
                public Object[] I00000oOI;
                public int I0000Il00O;
                public int I0000O;
                public ii00oo I0000oI00;
                public boolean I0001Ioi1lo;
                public boolean I000II;
                public int[] I000O01llI0;
                public int I000OOo1O;
                public int I000OiO;
                public i1i0olI I000iOII;
                public l1I0oI I000l1;

                static {
                    Unsafe unsafe;
                    try {
/* 17 */                unsafe = (Unsafe) AccessController.doPrivileged(new OoiioO0o(11));
                    } catch (Throwable unused) {
/* 20 */                unsafe = null;
                    }
/* 21 */            I000o00OoI0I = unsafe;
                }

                public static Field I000l1(Class cls, String str) {
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

                public static void I000lI(Object obj) {
/* 5 */             if (I001i1lo1io(obj)) {
/* 7 */                 return;
                    }
/* 18 */            I000II.I000iOII("Mutating immutable message: ".concat(String.valueOf(obj)));
                }

                public static boolean I001i1lo1io(Object obj) {
/* 1 */             if (obj == null) {
/* 3 */                 return false;
                    }
/* 7 */             if (obj instanceof ii0OoOo10) {
/* 11 */                return ((ii0OoOo10) obj).I00100l0();
                    }
/* 16 */            return true;
                }

                public static final int I001l0I00(byte[] bArr, int i, int i2, ii10iIl ii10iil, Class cls, i111i0I1 i111i0i1) {
/* 1 */             ii10iIl ii10iil2 = ii10iIl.I00iiO;
                    switch (ii10iil.ordinal()) {
                        case 0:
/* 164 */                   int i3 = i + 8;
/* 178 */                   i111i0i1.I0000Il00O = Double.valueOf(Double.longBitsToDouble(lil1OOilooi0.I000oI1ioi(i, bArr)));
/* 180 */                   return i3;
                        case 1:
/* 147 */                   int i4 = i + 4;
/* 161 */                   i111i0i1.I0000Il00O = Float.valueOf(Float.intBitsToFloat(lil1OOilooi0.I00000oOI(i, bArr)));
/* 163 */                   return i4;
                        case 2:
                        case 3:
/* 134 */                   int iI000iOII = lil1OOilooi0.I000iOII(bArr, i, i111i0i1);
/* 144 */                   i111i0i1.I0000Il00O = Long.valueOf(i111i0i1.I00000oOI);
/* 146 */                   return iI000iOII;
                        case 4:
                        case 12:
                        case 13:
/* 121 */                   int iI000O01llI0 = lil1OOilooi0.I000O01llI0(bArr, i, i111i0i1);
/* 131 */                   i111i0i1.I0000Il00O = Integer.valueOf(i111i0i1.I00000oIO);
/* 133 */                   return iI000O01llI0;
                        case 5:
                        case 15:
/* 108 */                   int i5 = i + 8;
/* 118 */                   i111i0i1.I0000Il00O = Long.valueOf(lil1OOilooi0.I000oI1ioi(i, bArr));
/* 120 */                   return i5;
                        case 6:
                        case 14:
/* 95 */                    int i6 = i + 4;
/* 105 */                   i111i0i1.I0000Il00O = Integer.valueOf(lil1OOilooi0.I00000oOI(i, bArr));
/* 107 */                   return i6;
                        case 7:
/* 73 */                    int iI000iOII2 = lil1OOilooi0.I000iOII(bArr, i, i111i0i1);
/* 92 */                    i111i0i1.I0000Il00O = Boolean.valueOf(i111i0i1.I00000oOI != 0);
/* 94 */                    return iI000iOII2;
                        case 8:
/* 68 */                    return lil1OOilooi0.I0001Ioi1lo(bArr, i, i111i0i1);
                        case 9:
                        default:
/* 17 */                    throw new RuntimeException("unsupported field type.");
                        case 10:
/* 63 */                    return lil1OOilooi0.I0000Il00O(ii0oIOiIl.I0000Il00O.I00000oIO(cls), bArr, i, i2, i111i0i1);
                        case 11:
/* 52 */                    return lil1OOilooi0.I00000oIO(bArr, i, i111i0i1);
                        case 16:
/* 35 */                    int iI000O01llI02 = lil1OOilooi0.I000O01llI0(bArr, i, i111i0i1);
/* 49 */                    i111i0i1.I0000Il00O = Integer.valueOf(IOOOI0.I00IoIO0lI(i111i0i1.I00000oIO));
/* 51 */                    return iI000O01llI02;
                        case 17:
/* 18 */                    int iI000iOII3 = lil1OOilooi0.I000iOII(bArr, i, i111i0i1);
/* 32 */                    i111i0i1.I0000Il00O = Long.valueOf(IOOOI0.I00IoO0(i111i0i1.I00000oOI));
/* 34 */                    return iI000iOII3;
                    }
                }

                public static ii10O1i0I I001lllioOl(Object obj) {
/* 1 */             ii0OoOo10 ii0oooo10 = (ii0OoOo10) obj;
/* 3 */             ii10O1i0I ii10o1i0i = ii0oooo10.zzc;
/* 7 */             if (ii10o1i0i != ii10O1i0I.I0001Ioi1lo) {
/* 29 */                return ii10o1i0i;
                    }
/* 9 */             ii10O1i0I ii10o1i0iI00000oOI = ii10O1i0I.I00000oOI();
/* 13 */            ii0oooo10.zzc = ii10o1i0iI00000oOI;
/* 29 */            return ii10o1i0iI00000oOI;
                }

                public static int I001lloI(long j, Object obj) {
/* 7 */             return ((Integer) ii10Oo1I0.I000II(obj, j)).intValue();
                }

                public static int I00II0oii1o(int i) {
/* 3 */             return (i >>> 20) & 255;
                }

                public static long I00IO1oi11O(long j, Object obj) {
/* 7 */             return ((Long) ii10Oo1I0.I000II(obj, j)).longValue();
                }

                /* JADX WARN: Removed duplicated region for block: B:28:0x006f  */
                @Override
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final void I00000oIO(Object obj) {
/* 1 */             int[] iArr = this.I00000oIO;
/* 7 */             if (I001i1lo1io(obj)) {
/* 14 */                if (obj instanceof ii0OoOo10) {
/* 17 */                    ii0OoOo10 ii0oooo10 = (ii0OoOo10) obj;
/* 19 */                    ii0oooo10.I000o00OoI0I();
/* 22 */                    ii0oooo10.zza = 0;
/* 24 */                    ii0oooo10.I000l1();
                        }
/* 29 */                for (int i = 0; i < iArr.length; i += 3) {
/* 31 */                    int iI00IO1 = I00IO1(i);
/* 38 */                    int i2 = 1048575 & iI00IO1;
/* 39 */                    int iI00II0oii1o = I00II0oii1o(iI00IO1);
                            long j = i2;
/* 46 */                    Unsafe unsafe = I000o00OoI0I;
/* 48 */                    if (iI00II0oii1o != 9) {
/* 52 */                        if (iI00II0oii1o != 60 && iI00II0oii1o != 68) {
                                    switch (iI00II0oii1o) {
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
/* 83 */                                    ii010ilOI1O1 ii010iloi1o1 = (ii010ilOI1O1) ((ii0i1l11) ii10Oo1I0.I000II(obj, j));
/* 87 */                                    if (ii010iloi1o1.I00iOIl) {
/* 89 */                                        ii010iloi1o1.I00iOIl = false;
                                                break;
                                            } else {
                                                break;
                                            }
                                        case 50:
/* 62 */                                    Object object = unsafe.getObject(obj, j);
/* 66 */                                    if (object != null) {
/* 71 */                                        ((ii0l1oio1O) object).I00iOIl = false;
/* 73 */                                        unsafe.putObject(obj, j, object);
                                                break;
                                            } else {
                                                break;
                                            }
                                    }
                                } else if (I001iOo1i0O(obj, iArr[i], i)) {
/* 108 */                           I00IioO0OiOi(i).I00000oIO(unsafe.getObject(obj, j));
                                }
                            } else if (I001IO000(i, obj)) {
/* 126 */                       I00IioO0OiOi(i).I00000oIO(unsafe.getObject(obj, j));
                            }
                        }
/* 134 */               this.I000iOII.getClass();
/* 140 */               ii10O1i0I ii10o1i0i = ((ii0OoOo10) obj).zzc;
/* 144 */               if (ii10o1i0i.I0000oI00) {
/* 146 */                   ii10o1i0i.I0000oI00 = false;
                        }
/* 150 */               if (this.I0001Ioi1lo) {
/* 154 */                   this.I000l1.getClass();
/* 161 */                   ((ii0Oi0OiillI) obj).zzb.I0000O();
                        }
                    }
                }

                /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
                /* JADX WARN: Removed duplicated region for block: B:7:0x001e  */
                @Override
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final void I00000oOI(Object obj, Object obj2) {
                    Object obj3;
/* 1 */             int[] iArr = this.I00000oIO;
/* 3 */             I000lI(obj);
/* 6 */             obj2.getClass();
/* 9 */             int i = 0;
/* 11 */            while (i < iArr.length) {
/* 13 */                int iI00IO1 = I00IO1(i);
/* 20 */                int i2 = 1048575 & iI00IO1;
/* 21 */                int iI00II0oii1o = I00II0oii1o(iI00IO1);
/* 25 */                int i3 = iArr[i];
                        long j = i2;
                        switch (iI00II0oii1o) {
                            case 0:
/* 428 */                       if (!I001IO000(i, obj2)) {
/* 31 */                            obj3 = obj;
                                    break;
                                } else {
/* 430 */                           Ooil0oIOI0l0 ooil0oIOI0l0 = ii10Oo1I0.I0000Il00O;
/* 436 */                           obj3 = obj;
/* 437 */                           ooil0oIOI0l0.I00II0oii1o(obj3, j, ooil0oIOI0l0.I0010I0i(obj2, j));
/* 440 */                           I00100o1O0lo(i, obj3);
                                    break;
                                }
                            case 1:
/* 408 */                       if (I001IO000(i, obj2)) {
/* 410 */                           Ooil0oIOI0l0 ooil0oIOI0l02 = ii10Oo1I0.I0000Il00O;
/* 416 */                           ooil0oIOI0l02.I00IioO0OiOi(obj, j, ooil0oIOI0l02.I001IIilI0O(obj2, j));
/* 419 */                           I00100o1O0lo(i, obj);
                                }
/* 31 */                        obj3 = obj;
                                break;
                            case 2:
/* 390 */                       if (I001IO000(i, obj2)) {
/* 396 */                           ii10Oo1I0.I000OiO(obj, j, ii10Oo1I0.I0001Ioi1lo(obj2, j));
/* 399 */                           I00100o1O0lo(i, obj);
                                }
/* 31 */                        obj3 = obj;
                                break;
                            case 3:
/* 372 */                       if (I001IO000(i, obj2)) {
/* 378 */                           ii10Oo1I0.I000OiO(obj, j, ii10Oo1I0.I0001Ioi1lo(obj2, j));
/* 381 */                           I00100o1O0lo(i, obj);
                                }
/* 31 */                        obj3 = obj;
                                break;
                            case 4:
/* 354 */                       if (I001IO000(i, obj2)) {
/* 360 */                           ii10Oo1I0.I000OOo1O(obj, j, ii10Oo1I0.I0000oI00(obj2, j));
/* 363 */                           I00100o1O0lo(i, obj);
                                }
/* 31 */                        obj3 = obj;
                                break;
                            case 5:
/* 336 */                       if (I001IO000(i, obj2)) {
/* 342 */                           ii10Oo1I0.I000OiO(obj, j, ii10Oo1I0.I0001Ioi1lo(obj2, j));
/* 345 */                           I00100o1O0lo(i, obj);
                                }
/* 31 */                        obj3 = obj;
                                break;
                            case 6:
/* 318 */                       if (I001IO000(i, obj2)) {
/* 324 */                           ii10Oo1I0.I000OOo1O(obj, j, ii10Oo1I0.I0000oI00(obj2, j));
/* 327 */                           I00100o1O0lo(i, obj);
                                }
/* 31 */                        obj3 = obj;
                                break;
                            case 7:
/* 298 */                       if (I001IO000(i, obj2)) {
/* 300 */                           Ooil0oIOI0l0 ooil0oIOI0l03 = ii10Oo1I0.I0000Il00O;
/* 306 */                           ooil0oIOI0l03.I001iOo1i0O(obj, j, ooil0oIOI0l03.I00Io1o110i(obj2, j));
/* 309 */                           I00100o1O0lo(i, obj);
                                }
/* 31 */                        obj3 = obj;
                                break;
                            case 8:
/* 280 */                       if (I001IO000(i, obj2)) {
/* 286 */                           ii10Oo1I0.I000iOII(obj, j, ii10Oo1I0.I000II(obj2, j));
/* 289 */                           I00100o1O0lo(i, obj);
                                }
/* 31 */                        obj3 = obj;
                                break;
                            case 9:
/* 271 */                       I000o00OoI0I(i, obj, obj2);
/* 31 */                        obj3 = obj;
                                break;
                            case 10:
/* 257 */                       if (I001IO000(i, obj2)) {
/* 263 */                           ii10Oo1I0.I000iOII(obj, j, ii10Oo1I0.I000II(obj2, j));
/* 266 */                           I00100o1O0lo(i, obj);
                                }
/* 31 */                        obj3 = obj;
                                break;
                            case 11:
/* 239 */                       if (I001IO000(i, obj2)) {
/* 245 */                           ii10Oo1I0.I000OOo1O(obj, j, ii10Oo1I0.I0000oI00(obj2, j));
/* 248 */                           I00100o1O0lo(i, obj);
                                }
/* 31 */                        obj3 = obj;
                                break;
                            case 12:
/* 221 */                       if (I001IO000(i, obj2)) {
/* 227 */                           ii10Oo1I0.I000OOo1O(obj, j, ii10Oo1I0.I0000oI00(obj2, j));
/* 230 */                           I00100o1O0lo(i, obj);
                                }
/* 31 */                        obj3 = obj;
                                break;
                            case 13:
/* 203 */                       if (I001IO000(i, obj2)) {
/* 209 */                           ii10Oo1I0.I000OOo1O(obj, j, ii10Oo1I0.I0000oI00(obj2, j));
/* 212 */                           I00100o1O0lo(i, obj);
                                }
/* 31 */                        obj3 = obj;
                                break;
                            case 14:
/* 185 */                       if (I001IO000(i, obj2)) {
/* 191 */                           ii10Oo1I0.I000OiO(obj, j, ii10Oo1I0.I0001Ioi1lo(obj2, j));
/* 194 */                           I00100o1O0lo(i, obj);
                                }
/* 31 */                        obj3 = obj;
                                break;
                            case 15:
/* 167 */                       if (I001IO000(i, obj2)) {
/* 173 */                           ii10Oo1I0.I000OOo1O(obj, j, ii10Oo1I0.I0000oI00(obj2, j));
/* 176 */                           I00100o1O0lo(i, obj);
                                }
/* 31 */                        obj3 = obj;
                                break;
                            case 16:
/* 149 */                       if (I001IO000(i, obj2)) {
/* 155 */                           ii10Oo1I0.I000OiO(obj, j, ii10Oo1I0.I0001Ioi1lo(obj2, j));
/* 158 */                           I00100o1O0lo(i, obj);
                                }
/* 31 */                        obj3 = obj;
                                break;
                            case 17:
/* 141 */                       I000o00OoI0I(i, obj, obj2);
/* 31 */                        obj3 = obj;
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
/* 98 */                        ii0i1l11 ii0i1l11VarZzd = (ii0i1l11) ii10Oo1I0.I000II(obj, j);
/* 104 */                       ii0i1l11 ii0i1l11Var = (ii0i1l11) ii10Oo1I0.I000II(obj2, j);
/* 106 */                       int size = ii0i1l11VarZzd.size();
/* 110 */                       int size2 = ii0i1l11Var.size();
/* 114 */                       if (size > 0 && size2 > 0) {
/* 123 */                           if (!((ii010ilOI1O1) ii0i1l11VarZzd).I00iOIl) {
/* 126 */                               ii0i1l11VarZzd = ii0i1l11VarZzd.zzd(size2 + size);
                                    }
/* 130 */                           ii0i1l11VarZzd.addAll(ii0i1l11Var);
                                }
/* 133 */                       if (size > 0) {
/* 136 */                           ii0i1l11Var = ii0i1l11VarZzd;
                                }
/* 137 */                       ii10Oo1I0.I000iOII(obj, j, ii0i1l11Var);
/* 31 */                        obj3 = obj;
                                break;
                            case 50:
/* 76 */                        i1i0olI i1i0oli = ii0olI1ooOiO.I00000oIO;
/* 90 */                        ii10Oo1I0.I000iOII(obj, j, lilI0O1.I00000oIO(ii10Oo1I0.I000II(obj, j), ii10Oo1I0.I000II(obj2, j)));
/* 31 */                        obj3 = obj;
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
/* 63 */                        if (I001iOo1i0O(obj2, i3, i)) {
/* 69 */                            ii10Oo1I0.I000iOII(obj, j, ii10Oo1I0.I000II(obj2, j));
/* 72 */                            I0010I0i(obj, i3, i);
                                }
/* 31 */                        obj3 = obj;
                                break;
                            case 60:
/* 55 */                        I000oI1ioi(i, obj, obj2);
/* 31 */                        obj3 = obj;
                                break;
                            case 61:
                            case 62:
                            case 63:
                            case Barcode.FORMAT_EAN_8:
                            case 65:
                            case 66:
                            case 67:
/* 42 */                        if (I001iOo1i0O(obj2, i3, i)) {
/* 48 */                            ii10Oo1I0.I000iOII(obj, j, ii10Oo1I0.I000II(obj2, j));
/* 51 */                            I0010I0i(obj, i3, i);
                                }
/* 31 */                        obj3 = obj;
                                break;
                            case 68:
/* 34 */                        I000oI1ioi(i, obj, obj2);
/* 31 */                        obj3 = obj;
                                break;
                        }
/* 443 */               i += 3;
/* 445 */               obj = obj3;
                    }
/* 448 */           Object obj4 = obj;
/* 449 */           ii0olI1ooOiO.I0010I0i(obj4, obj2);
/* 454 */           if (this.I0001Ioi1lo) {
/* 456 */               ii0olI1ooOiO.I00100o1O0lo(obj4, obj2);
                    }
                }

                /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
                /* JADX WARN: Removed duplicated region for block: B:7:0x0027  */
                @Override
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final void I0000Il00O(Object obj, i0OI1l1Oo i0oi1l1oo) {
                    Map.Entry entry;
                    boolean z;
                    int i;
                    int i2;
                    boolean z2;
/* 1 */             ii0lOl ii0lol = this;
/* 7 */             l1I0oI l1i0oi = ii0lol.I000l1;
/* 9 */             int[] iArr = ii0lol.I00000oIO;
/* 13 */            if (ii0lol.I0001Ioi1lo) {
/* 18 */                ii0O1Ol1i ii0o1ol1i = ((ii0Oi0OiillI) obj).zzb;
/* 40 */                entry = !ii0o1ol1i.I00000oIO.isEmpty() ? (Map.Entry) ii0o1ol1i.I0000Il00O().next() : null;
                    }
/* 41 */            int i3 = 1048575;
/* 44 */            int i4 = 1048575;
/* 45 */            int i5 = 0;
/* 46 */            int i6 = 0;
/* 48 */            while (i5 < iArr.length) {
/* 50 */                int iI00IO1 = ii0lol.I00IO1(i5);
/* 54 */                int iI00II0oii1o = I00II0oii1o(iI00IO1);
/* 58 */                int i7 = iArr[i5];
/* 64 */                Unsafe unsafe = I000o00OoI0I;
/* 66 */                if (iI00II0oii1o <= 17) {
/* 70 */                    int i8 = iArr[i5 + 2];
/* 72 */                    z = true;
/* 74 */                    int i9 = i8 & i3;
/* 76 */                    if (i9 != i4) {
/* 83 */                        i6 = i9 == i3 ? 0 : unsafe.getInt(obj, i9);
/* 88 */                        i4 = i9;
                            }
/* 95 */                    i = iI00IO1;
/* 91 */                    i2 = 1 << (i8 >>> 20);
                        } else {
/* 99 */                    z = true;
/* 101 */                   i = iI00IO1;
/* 102 */                   i2 = 0;
                        }
/* 103 */               if (entry != null) {
/* 114 */                   if (i7 >= 32149011) {
/* 117 */                       l1i0oi.getClass();
/* 126 */                       ii10iIl ii10iil = ii10iIl.I00iiO;
/* 128 */                       throw null;
                            }
                        }
/* 129 */               long j = i & i3;
                        switch (iI00II0oii1o) {
                            case 0:
/* 1713 */                      if (ii0lol.I001i1O0Ol(obj, i5, i4, i6, i2)) {
/* 1729 */                          ((ii0I1Il) i0oi1l1oo.I00iOIl).I000lI(i7, Double.doubleToRawLongBits(ii10Oo1I0.I0000Il00O.I0010I0i(obj, j)));
                                    break;
                                } else {
                                    break;
                                }
                            case 1:
/* 1688 */                      if (ii0lol.I001i1O0Ol(obj, i5, i4, i6, i2)) {
/* 1704 */                          ((ii0I1Il) i0oi1l1oo.I00iOIl).I000iOII(i7, Float.floatToRawIntBits(ii10Oo1I0.I0000Il00O.I001IIilI0O(obj, j)));
                                    break;
                                } else {
                                    break;
                                }
                            case 2:
/* 1669 */                      if (ii0lol.I001i1O0Ol(obj, i5, i4, i6, i2)) {
/* 1679 */                          ((ii0I1Il) i0oi1l1oo.I00iOIl).I001l0I00(i7, unsafe.getLong(obj, j));
                                    break;
                                } else {
                                    break;
                                }
                            case 3:
/* 1648 */                      if (ii0lol.I001i1O0Ol(obj, i5, i4, i6, i2)) {
/* 1658 */                          ((ii0I1Il) i0oi1l1oo.I00iOIl).I001l0I00(i7, unsafe.getLong(obj, j));
                                    break;
                                } else {
                                    break;
                                }
                            case 4:
/* 1627 */                      if (ii0lol.I001i1O0Ol(obj, i5, i4, i6, i2)) {
/* 1637 */                          ((ii0I1Il) i0oi1l1oo.I00iOIl).I000oI1ioi(i7, unsafe.getInt(obj, j));
                                    break;
                                } else {
                                    break;
                                }
                            case 5:
/* 1605 */                      if (ii0lol.I001i1O0Ol(obj, i5, i4, i6, i2)) {
/* 1615 */                          ((ii0I1Il) i0oi1l1oo.I00iOIl).I000lI(i7, unsafe.getLong(obj, j));
                                    break;
                                } else {
                                    break;
                                }
                            case 6:
/* 1583 */                      if (ii0lol.I001i1O0Ol(obj, i5, i4, i6, i2)) {
/* 1593 */                          ((ii0I1Il) i0oi1l1oo.I00iOIl).I000iOII(i7, unsafe.getInt(obj, j));
                                    break;
                                } else {
                                    break;
                                }
                            case 7:
/* 1559 */                      if (ii0lol.I001i1O0Ol(obj, i5, i4, i6, i2)) {
/* 1571 */                          ((ii0I1Il) i0oi1l1oo.I00iOIl).I0001Ioi1lo(i7, ii10Oo1I0.I0000Il00O.I00Io1o110i(obj, j));
                                    break;
                                } else {
                                    break;
                                }
                            case 8:
/* 1522 */                      if (ii0lol.I001i1O0Ol(obj, i5, i4, i6, i2)) {
/* 1524 */                          Object object = unsafe.getObject(obj, j);
/* 1530 */                          if (object instanceof String) {
/* 1538 */                              ((ii0I1Il) i0oi1l1oo.I00iOIl).I001IIilI0O(i7, (String) object);
                                        break;
                                    } else {
/* 1549 */                              ((ii0I1Il) i0oi1l1oo.I00iOIl).I000OOo1O(i7, (ii01lO0l11ii) object);
                                        break;
                                    }
                                } else {
                                    break;
                                }
                            case 9:
/* 1491 */                      if (ii0lol.I001i1O0Ol(obj, i5, i4, i6, i2)) {
/* 1493 */                          Object object2 = unsafe.getObject(obj, j);
/* 1497 */                          ii0oioOi00i ii0oiooi00iI00IioO0OiOi = ii0lol.I00IioO0OiOi(i5);
/* 1501 */                          i0oi1l1oo.getClass();
/* 1510 */                          ((ii0I1Il) i0oi1l1oo.I00iOIl).I00100o1O0lo(i7, (ii00oo) object2, ii0oiooi00iI00IioO0OiOi);
                                    break;
                                } else {
                                    break;
                                }
                            case 10:
/* 1467 */                      if (ii0lol.I001i1O0Ol(obj, i5, i4, i6, i2)) {
/* 1479 */                          ((ii0I1Il) i0oi1l1oo.I00iOIl).I000OOo1O(i7, (ii01lO0l11ii) unsafe.getObject(obj, j));
                                    break;
                                } else {
                                    break;
                                }
                            case 11:
/* 1445 */                      if (ii0lol.I001i1O0Ol(obj, i5, i4, i6, i2)) {
/* 1455 */                          ((ii0I1Il) i0oi1l1oo.I00iOIl).I001i1lo1io(i7, unsafe.getInt(obj, j));
                                    break;
                                } else {
                                    break;
                                }
                            case 12:
/* 1423 */                      if (ii0lol.I001i1O0Ol(obj, i5, i4, i6, i2)) {
/* 1433 */                          ((ii0I1Il) i0oi1l1oo.I00iOIl).I000oI1ioi(i7, unsafe.getInt(obj, j));
                                    break;
                                } else {
                                    break;
                                }
                            case 13:
/* 1401 */                      if (ii0lol.I001i1O0Ol(obj, i5, i4, i6, i2)) {
/* 1411 */                          ((ii0I1Il) i0oi1l1oo.I00iOIl).I000iOII(i7, unsafe.getInt(obj, j));
                                    break;
                                } else {
                                    break;
                                }
                            case 14:
/* 1379 */                      if (ii0lol.I001i1O0Ol(obj, i5, i4, i6, i2)) {
/* 1389 */                          ((ii0I1Il) i0oi1l1oo.I00iOIl).I000lI(i7, unsafe.getLong(obj, j));
                                    break;
                                } else {
                                    break;
                                }
                            case 15:
/* 1352 */                      if (ii0lol.I001i1O0Ol(obj, i5, i4, i6, i2)) {
/* 1354 */                          int i10 = unsafe.getInt(obj, j);
/* 1367 */                          ((ii0I1Il) i0oi1l1oo.I00iOIl).I001i1lo1io(i7, (i10 >> 31) ^ (i10 + i10));
                                    break;
                                } else {
                                    break;
                                }
                            case 16:
/* 1325 */                      if (ii0lol.I001i1O0Ol(obj, i5, i4, i6, i2)) {
/* 1327 */                          long j2 = unsafe.getLong(obj, j);
/* 1340 */                          ((ii0I1Il) i0oi1l1oo.I00iOIl).I001l0I00(i7, (j2 + j2) ^ (j2 >> 63));
                                    break;
                                } else {
                                    break;
                                }
                            case 17:
/* 1303 */                      if (ii0lol.I001i1O0Ol(obj, i5, i4, i6, i2)) {
/* 1313 */                          i0oi1l1oo.I000O01llI0(i7, unsafe.getObject(obj, j), ii0lol.I00IioO0OiOi(i5));
                                    break;
                                } else {
                                    break;
                                }
                            case PoseLandmark.RIGHT_PINKY:
/* 1291 */                      ii0olI1ooOiO.I00111O(iArr[i5], (List) unsafe.getObject(obj, j), i0oi1l1oo, false);
                                break;
                            case PoseLandmark.LEFT_INDEX:
/* 1275 */                      ii0olI1ooOiO.I001i1lo1io(iArr[i5], (List) unsafe.getObject(obj, j), i0oi1l1oo, false);
                                break;
                            case PoseLandmark.RIGHT_INDEX:
/* 1259 */                      ii0olI1ooOiO.I001l0I00(iArr[i5], (List) unsafe.getObject(obj, j), i0oi1l1oo, false);
                                break;
                            case PoseLandmark.LEFT_THUMB:
/* 1243 */                      ii0olI1ooOiO.I0000oI00(iArr[i5], (List) unsafe.getObject(obj, j), i0oi1l1oo, false);
                                break;
                            case PoseLandmark.RIGHT_THUMB:
/* 1227 */                      ii0olI1ooOiO.I001iOo1i0O(iArr[i5], (List) unsafe.getObject(obj, j), i0oi1l1oo, false);
                                break;
                            case PoseLandmark.LEFT_HIP:
/* 1211 */                      ii0olI1ooOiO.I001i1O0Ol(iArr[i5], (List) unsafe.getObject(obj, j), i0oi1l1oo, false);
                                break;
                            case PoseLandmark.RIGHT_HIP:
/* 1195 */                      ii0olI1ooOiO.I001IO000(iArr[i5], (List) unsafe.getObject(obj, j), i0oi1l1oo, false);
                                break;
                            case PoseLandmark.LEFT_KNEE:
/* 1179 */                      ii0olI1ooOiO.I0010o(iArr[i5], (List) unsafe.getObject(obj, j), i0oi1l1oo, false);
                                break;
                            case PoseLandmark.RIGHT_KNEE:
/* 1091 */                      int i11 = iArr[i5];
/* 1097 */                      List list = (List) unsafe.getObject(obj, j);
/* 1099 */                      i1i0olI i1i0oli = ii0olI1ooOiO.I00000oIO;
/* 1101 */                      if (list != null && !list.isEmpty()) {
/* 1111 */                          ii0I1Il ii0i1il = (ii0I1Il) i0oi1l1oo.I00iOIl;
/* 1115 */                          if (list instanceof ii0ioio1) {
/* 1118 */                              ii0ioio1 ii0ioio1Var = (ii0ioio1) list;
/* 1125 */                              for (int i12 = 0; i12 < list.size(); i12++) {
/* 1127 */                                  Object objZzc = ii0ioio1Var.zzc();
/* 1133 */                                  if (objZzc instanceof String) {
/* 1137 */                                      ii0i1il.I001IIilI0O(i11, (String) objZzc);
                                            } else {
/* 1143 */                                      ii0i1il.I000OOo1O(i11, (ii01lO0l11ii) objZzc);
                                            }
                                        }
                                    } else {
/* 1154 */                              for (int i13 = 0; i13 < list.size(); i13++) {
/* 1162 */                                  ii0i1il.I001IIilI0O(i11, (String) list.get(i13));
                                        }
                                    }
                                }
                                break;
                            case 27:
/* 1041 */                      int i14 = iArr[i5];
/* 1047 */                      List list2 = (List) unsafe.getObject(obj, j);
/* 1049 */                      ii0oioOi00i ii0oiooi00iI00IioO0OiOi2 = ii0lol.I00IioO0OiOi(i5);
/* 1053 */                      i1i0olI i1i0oli2 = ii0olI1ooOiO.I00000oIO;
/* 1055 */                      if (list2 != null && !list2.isEmpty()) {
/* 1068 */                          for (int i15 = 0; i15 < list2.size(); i15++) {
/* 1070 */                              Object obj2 = list2.get(i15);
/* 1074 */                              i0oi1l1oo.getClass();
/* 1083 */                              ((ii0I1Il) i0oi1l1oo.I00iOIl).I00100o1O0lo(i14, (ii00oo) obj2, ii0oiooi00iI00IioO0OiOi2);
                                    }
                                }
                                break;
                            case PoseLandmark.RIGHT_ANKLE:
/* 995 */                       int i16 = iArr[i5];
/* 1001 */                      List list3 = (List) unsafe.getObject(obj, j);
/* 1003 */                      i1i0olI i1i0oli3 = ii0olI1ooOiO.I00000oIO;
/* 1005 */                      if (list3 != null && !list3.isEmpty()) {
/* 1013 */                          i0oi1l1oo.getClass();
/* 1021 */                          for (int i17 = 0; i17 < list3.size(); i17++) {
/* 1033 */                              ((ii0I1Il) i0oi1l1oo.I00iOIl).I000OOo1O(i16, (ii01lO0l11ii) list3.get(i17));
                                    }
                                }
                                break;
                            case PoseLandmark.LEFT_HEEL:
/* 980 */                       z2 = false;
/* 989 */                       ii0olI1ooOiO.I0000O(iArr[i5], (List) unsafe.getObject(obj, j), i0oi1l1oo, false);
                                break;
                            case 30:
/* 965 */                       z2 = false;
/* 974 */                       ii0olI1ooOiO.I001IIilI0O(iArr[i5], (List) unsafe.getObject(obj, j), i0oi1l1oo, false);
                                break;
                            case PoseLandmark.LEFT_FOOT_INDEX:
/* 950 */                       z2 = false;
/* 959 */                       ii0olI1ooOiO.I001lIiIIo1O(iArr[i5], (List) unsafe.getObject(obj, j), i0oi1l1oo, false);
                                break;
                            case 32:
/* 935 */                       z2 = false;
/* 944 */                       ii0olI1ooOiO.I00000oIO(iArr[i5], (List) unsafe.getObject(obj, j), i0oi1l1oo, false);
                                break;
                            case 33:
/* 920 */                       z2 = false;
/* 929 */                       ii0olI1ooOiO.I00000oOI(iArr[i5], (List) unsafe.getObject(obj, j), i0oi1l1oo, false);
                                break;
                            case 34:
/* 911 */                       z2 = false;
/* 912 */                       ii0olI1ooOiO.I0000Il00O(iArr[i5], (List) unsafe.getObject(obj, j), i0oi1l1oo, false);
                                break;
                            case InputImage.IMAGE_FORMAT_YUV_420_888:
/* 896 */                       ii0olI1ooOiO.I00111O(iArr[i5], (List) unsafe.getObject(obj, j), i0oi1l1oo, z);
                                break;
                            case 36:
/* 879 */                       ii0olI1ooOiO.I001i1lo1io(iArr[i5], (List) unsafe.getObject(obj, j), i0oi1l1oo, z);
                                break;
                            case 37:
/* 862 */                       ii0olI1ooOiO.I001l0I00(iArr[i5], (List) unsafe.getObject(obj, j), i0oi1l1oo, z);
                                break;
                            case 38:
/* 845 */                       ii0olI1ooOiO.I0000oI00(iArr[i5], (List) unsafe.getObject(obj, j), i0oi1l1oo, z);
                                break;
                            case 39:
/* 828 */                       ii0olI1ooOiO.I001iOo1i0O(iArr[i5], (List) unsafe.getObject(obj, j), i0oi1l1oo, z);
                                break;
                            case 40:
/* 811 */                       ii0olI1ooOiO.I001i1O0Ol(iArr[i5], (List) unsafe.getObject(obj, j), i0oi1l1oo, z);
                                break;
                            case 41:
/* 794 */                       ii0olI1ooOiO.I001IO000(iArr[i5], (List) unsafe.getObject(obj, j), i0oi1l1oo, z);
                                break;
                            case 42:
/* 777 */                       ii0olI1ooOiO.I0010o(iArr[i5], (List) unsafe.getObject(obj, j), i0oi1l1oo, z);
                                break;
                            case 43:
/* 760 */                       ii0olI1ooOiO.I0000O(iArr[i5], (List) unsafe.getObject(obj, j), i0oi1l1oo, z);
                                break;
                            case 44:
/* 743 */                       ii0olI1ooOiO.I001IIilI0O(iArr[i5], (List) unsafe.getObject(obj, j), i0oi1l1oo, z);
                                break;
                            case BuildConfig.VERSION_CODE:
/* 726 */                       ii0olI1ooOiO.I001lIiIIo1O(iArr[i5], (List) unsafe.getObject(obj, j), i0oi1l1oo, z);
                                break;
                            case 46:
/* 709 */                       ii0olI1ooOiO.I00000oIO(iArr[i5], (List) unsafe.getObject(obj, j), i0oi1l1oo, z);
                                break;
                            case 47:
/* 692 */                       ii0olI1ooOiO.I00000oOI(iArr[i5], (List) unsafe.getObject(obj, j), i0oi1l1oo, z);
                                break;
                            case 48:
/* 675 */                       ii0olI1ooOiO.I0000Il00O(iArr[i5], (List) unsafe.getObject(obj, j), i0oi1l1oo, z);
                                break;
                            case 49:
/* 624 */                       int i18 = iArr[i5];
/* 630 */                       List list4 = (List) unsafe.getObject(obj, j);
/* 632 */                       ii0oioOi00i ii0oiooi00iI00IioO0OiOi3 = ii0lol.I00IioO0OiOi(i5);
/* 636 */                       i1i0olI i1i0oli4 = ii0olI1ooOiO.I00000oIO;
/* 638 */                       if (list4 != null && !list4.isEmpty()) {
/* 651 */                           for (int i19 = 0; i19 < list4.size(); i19++) {
/* 657 */                               i0oi1l1oo.I000O01llI0(i18, list4.get(i19), ii0oiooi00iI00IioO0OiOi3);
                                    }
                                }
                                break;
                            case 50:
/* 551 */                       Object object3 = unsafe.getObject(obj, j);
/* 555 */                       if (object3 != null) {
/* 563 */                           OillOo0 oillOo0 = ((ii0l1l) ii0lol.I00Io1lO(i5)).I00000oIO;
/* 569 */                           ii0I1Il ii0i1il2 = (ii0I1Il) i0oi1l1oo.I00iOIl;
/* 583 */                           for (Map.Entry entry2 : ((ii0l1oio1O) object3).entrySet()) {
/* 592 */                               ii0i1il2.I001i1O0Ol(i7, 2);
/* 607 */                               ii0i1il2.I001iOo1i0O(ii0l1l.I00000oIO(oillOo0, entry2.getKey(), entry2.getValue()));
/* 618 */                               ii0l1l.I0000Il00O(ii0i1il2, oillOo0, entry2.getKey(), entry2.getValue());
                                    }
                                }
                                break;
                            case 51:
/* 524 */                       if (ii0lol.I001iOo1i0O(obj, i7, i5)) {
/* 544 */                           ((ii0I1Il) i0oi1l1oo.I00iOIl).I000lI(i7, Double.doubleToRawLongBits(((Double) ii10Oo1I0.I000II(obj, j)).doubleValue()));
                                }
                                break;
                            case 52:
/* 495 */                       if (ii0lol.I001iOo1i0O(obj, i7, i5)) {
/* 515 */                           ((ii0I1Il) i0oi1l1oo.I00iOIl).I000iOII(i7, Float.floatToRawIntBits(((Float) ii10Oo1I0.I000II(obj, j)).floatValue()));
                                }
                                break;
                            case 53:
/* 476 */                       if (ii0lol.I001iOo1i0O(obj, i7, i5)) {
/* 486 */                           ((ii0I1Il) i0oi1l1oo.I00iOIl).I001l0I00(i7, I00IO1oi11O(j, obj));
                                }
                                break;
                            case 54:
/* 457 */                       if (ii0lol.I001iOo1i0O(obj, i7, i5)) {
/* 467 */                           ((ii0I1Il) i0oi1l1oo.I00iOIl).I001l0I00(i7, I00IO1oi11O(j, obj));
                                }
                                break;
                            case 55:
/* 438 */                       if (ii0lol.I001iOo1i0O(obj, i7, i5)) {
/* 448 */                           ((ii0I1Il) i0oi1l1oo.I00iOIl).I000oI1ioi(i7, I001lloI(j, obj));
                                }
                                break;
                            case 56:
/* 419 */                       if (ii0lol.I001iOo1i0O(obj, i7, i5)) {
/* 429 */                           ((ii0I1Il) i0oi1l1oo.I00iOIl).I000lI(i7, I00IO1oi11O(j, obj));
                                }
                                break;
                            case 57:
/* 400 */                       if (ii0lol.I001iOo1i0O(obj, i7, i5)) {
/* 410 */                           ((ii0I1Il) i0oi1l1oo.I00iOIl).I000iOII(i7, I001lloI(j, obj));
                                }
                                break;
                            case 58:
/* 375 */                       if (ii0lol.I001iOo1i0O(obj, i7, i5)) {
/* 391 */                           ((ii0I1Il) i0oi1l1oo.I00iOIl).I0001Ioi1lo(i7, ((Boolean) ii10Oo1I0.I000II(obj, j)).booleanValue());
                                }
                                break;
                            case 59:
/* 339 */                       if (ii0lol.I001iOo1i0O(obj, i7, i5)) {
/* 341 */                           Object object4 = unsafe.getObject(obj, j);
/* 347 */                           if (object4 instanceof String) {
/* 355 */                               ((ii0I1Il) i0oi1l1oo.I00iOIl).I001IIilI0O(i7, (String) object4);
                                    } else {
/* 366 */                               ((ii0I1Il) i0oi1l1oo.I00iOIl).I000OOo1O(i7, (ii01lO0l11ii) object4);
                                    }
                                }
                                break;
                            case 60:
/* 309 */                       if (ii0lol.I001iOo1i0O(obj, i7, i5)) {
/* 311 */                           Object object5 = unsafe.getObject(obj, j);
/* 315 */                           ii0oioOi00i ii0oiooi00iI00IioO0OiOi4 = ii0lol.I00IioO0OiOi(i5);
/* 319 */                           i0oi1l1oo.getClass();
/* 328 */                           ((ii0I1Il) i0oi1l1oo.I00iOIl).I00100o1O0lo(i7, (ii00oo) object5, ii0oiooi00iI00IioO0OiOi4);
                                }
                                break;
                            case 61:
/* 286 */                       if (ii0lol.I001iOo1i0O(obj, i7, i5)) {
/* 298 */                           ((ii0I1Il) i0oi1l1oo.I00iOIl).I000OOo1O(i7, (ii01lO0l11ii) unsafe.getObject(obj, j));
                                }
                                break;
                            case 62:
/* 265 */                       if (ii0lol.I001iOo1i0O(obj, i7, i5)) {
/* 275 */                           ((ii0I1Il) i0oi1l1oo.I00iOIl).I001i1lo1io(i7, I001lloI(j, obj));
                                }
                                break;
                            case 63:
/* 247 */                       if (ii0lol.I001iOo1i0O(obj, i7, i5)) {
/* 257 */                           ((ii0I1Il) i0oi1l1oo.I00iOIl).I000oI1ioi(i7, I001lloI(j, obj));
                                }
                                break;
                            case Barcode.FORMAT_EAN_8:
/* 229 */                       if (ii0lol.I001iOo1i0O(obj, i7, i5)) {
/* 239 */                           ((ii0I1Il) i0oi1l1oo.I00iOIl).I000iOII(i7, I001lloI(j, obj));
                                }
                                break;
                            case 65:
/* 211 */                       if (ii0lol.I001iOo1i0O(obj, i7, i5)) {
/* 221 */                           ((ii0I1Il) i0oi1l1oo.I00iOIl).I000lI(i7, I00IO1oi11O(j, obj));
                                }
                                break;
                            case 66:
/* 188 */                       if (ii0lol.I001iOo1i0O(obj, i7, i5)) {
/* 190 */                           int iI001lloI = I001lloI(j, obj);
/* 203 */                           ((ii0I1Il) i0oi1l1oo.I00iOIl).I001i1lo1io(i7, (iI001lloI >> 31) ^ (iI001lloI + iI001lloI));
                                }
                                break;
                            case 67:
/* 165 */                       if (ii0lol.I001iOo1i0O(obj, i7, i5)) {
/* 167 */                           long jI00IO1oi11O = I00IO1oi11O(j, obj);
/* 180 */                           ((ii0I1Il) i0oi1l1oo.I00iOIl).I001l0I00(i7, (jI00IO1oi11O + jI00IO1oi11O) ^ (jI00IO1oi11O >> 63));
                                }
                                break;
                            case 68:
/* 145 */                       if (ii0lol.I001iOo1i0O(obj, i7, i5)) {
/* 157 */                           i0oi1l1oo.I000O01llI0(i7, unsafe.getObject(obj, j), ii0lol.I00IioO0OiOi(i5));
                                }
                                break;
                        }
/* 1732 */              i5 += 3;
/* 1734 */              i3 = 1048575;
/* 1737 */              ii0lol = this;
                    }
/* 1743 */          if (entry == null) {
/* 1750 */              ((ii0OoOo10) obj).zzc.I0000O(i0oi1l1oo);
/* 1753 */              return;
                    }
/* 1754 */          l1i0oi.getClass();
/* 1763 */          ii10iIl ii10iil2 = ii10iIl.I00iiO;
/* 1765 */          throw null;
                }

                @Override
                public final boolean I0000O(Object obj) {
                    int i;
                    int i2;
                    int i3;
/* 3 */             int[] iArr = this.I00000oIO;
/* 9 */             int i4 = 0;
/* 10 */            int i5 = 0;
/* 11 */            int i6 = 1048575;
                    loop0: while (true) {
/* 15 */                if (i5 < this.I000OOo1O) {
/* 19 */                    int i7 = this.I000O01llI0[i5];
/* 21 */                    int i8 = iArr[i7];
/* 23 */                    int iI00IO1 = I00IO1(i7);
/* 29 */                    int i9 = iArr[i7 + 2];
/* 31 */                    int i10 = i9 & 1048575;
/* 35 */                    int i11 = 1 << (i9 >>> 20);
/* 37 */                    if (i10 != i6) {
/* 39 */                        if (i10 != 1048575) {
/* 44 */                            i4 = I000o00OoI0I.getInt(obj, i10);
                                }
/* 48 */                        i = i4;
/* 49 */                        i6 = i10;
                            } else {
/* 51 */                        i = i4;
                            }
/* 55 */                    if ((268435456 & iI00IO1) != 0) {
/* 57 */                        i2 = i7;
/* 58 */                        i3 = i6;
/* 64 */                        if (!I001i1O0Ol(obj, i2, i3, i, i11)) {
                                    break;
                                }
                            } else {
/* 67 */                        i2 = i7;
/* 68 */                        i3 = i6;
                            }
/* 69 */                    int iI00II0oii1o = I00II0oii1o(iI00IO1);
/* 75 */                    if (iI00II0oii1o == 9 || iI00II0oii1o == 17) {
/* 244 */                       if (I001i1O0Ol(obj, i2, i3, i, i11) && !I00IioO0OiOi(i2).I0000O(ii10Oo1I0.I000II(obj, iI00IO1 & 1048575))) {
                                    break;
                                }
/* 264 */                       i5++;
/* 266 */                       i6 = i3;
/* 267 */                       i4 = i;
                            } else {
/* 83 */                        if (iI00II0oii1o != 27) {
/* 87 */                            if (iI00II0oii1o == 60 || iI00II0oii1o == 68) {
/* 179 */                               if (I001iOo1i0O(obj, i8, i2) && !I00IioO0OiOi(i2).I0000O(ii10Oo1I0.I000II(obj, iI00IO1 & 1048575))) {
                                            break;
                                        }
/* 264 */                               i5++;
/* 266 */                               i6 = i3;
/* 267 */                               i4 = i;
                                    } else if (iI00II0oii1o != 49) {
/* 99 */                                if (iI00II0oii1o != 50) {
                                            continue;
                                        } else {
/* 110 */                                   ii0l1oio1O ii0l1oio1o = (ii0l1oio1O) ii10Oo1I0.I000II(obj, iI00IO1 & 1048575);
/* 116 */                                   if (!ii0l1oio1o.isEmpty() && ((ii10iIl) ((ii0l1l) I00Io1lO(i2)).I00000oIO.I00iio).I00iOIl == ii10l1.I00l0I0l0lO1) {
/* 144 */                                       ii0oioOi00i ii0oiooi00iI00000oIO = null;
/* 149 */                                       for (Object obj2 : ii0l1oio1o.values()) {
/* 155 */                                           if (ii0oiooi00iI00000oIO == null) {
/* 163 */                                               ii0oiooi00iI00000oIO = ii0oIOiIl.I0000Il00O.I00000oIO(obj2.getClass());
                                                    }
/* 171 */                                           if (!ii0oiooi00iI00000oIO.I0000O(obj2)) {
                                                        break loop0;
                                                    }
                                                }
                                            }
                                        }
/* 264 */                               i5++;
/* 266 */                               i6 = i3;
/* 267 */                               i4 = i;
                                    }
                                }
/* 206 */                       List list = (List) ii10Oo1I0.I000II(obj, iI00IO1 & 1048575);
/* 212 */                       if (list.isEmpty()) {
                                    continue;
                                } else {
/* 214 */                           ii0oioOi00i ii0oiooi00iI00IioO0OiOi = I00IioO0OiOi(i2);
/* 223 */                           for (int i12 = 0; i12 < list.size(); i12++) {
/* 233 */                               if (!ii0oiooi00iI00IioO0OiOi.I0000O(list.get(i12))) {
                                            break loop0;
                                        }
                                    }
                                }
/* 264 */                       i5++;
/* 266 */                       i6 = i3;
/* 267 */                       i4 = i;
                            }
                        } else if (!this.I0001Ioi1lo || ((ii0Oi0OiillI) obj).zzb.I0001Ioi1lo()) {
/* 14 */                    return true;
                        }
                    }
/* 5 */             return false;
                }

                /* JADX WARN: Removed duplicated region for block: B:44:0x00db A[PHI: r2
                  0x00db: PHI (r2v34 int) = (r2v10 int), (r2v35 int) binds: [B:85:0x01ea, B:43:0x00d9] A[DONT_GENERATE, DONT_INLINE]] */
                @Override
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final int I0000oI00(ii0OoOo10 ii0oooo10) {
                    int i;
                    long jDoubleToLongBits;
                    int i2;
                    int iFloatToIntBits;
                    int i3;
                    int i4;
/* 1 */             int[] iArr = this.I00000oIO;
/* 4 */             int i5 = 0;
/* 6 */             for (int i6 = 0; i6 < iArr.length; i6 += 3) {
/* 8 */                 int iI00IO1 = I00IO1(i6);
/* 15 */                int i7 = 1048575 & iI00IO1;
/* 16 */                int iI00II0oii1o = I00II0oii1o(iI00IO1);
/* 20 */                int i8 = iArr[i6];
                        long j = i7;
/* 23 */                int i9 = 1237;
/* 27 */                int iHashCode = 37;
                        switch (iI00II0oii1o) {
                            case 0:
/* 555 */                       i = i5 * 53;
/* 563 */                       jDoubleToLongBits = Double.doubleToLongBits(ii10Oo1I0.I0000Il00O.I0010I0i(ii0oooo10, j));
/* 567 */                       Charset charset = ii0i1ll10I0.I00000oIO;
/* 74 */                        i5 = i + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                                break;
                            case 1:
/* 541 */                       i2 = i5 * 53;
/* 549 */                       iFloatToIntBits = Float.floatToIntBits(ii10Oo1I0.I0000Il00O.I001IIilI0O(ii0oooo10, j));
/* 52 */                        i5 = iFloatToIntBits + i2;
                                break;
                            case 2:
/* 531 */                       i = i5 * 53;
/* 533 */                       jDoubleToLongBits = ii10Oo1I0.I0001Ioi1lo(ii0oooo10, j);
/* 537 */                       Charset charset2 = ii0i1ll10I0.I00000oIO;
/* 74 */                        i5 = i + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                                break;
                            case 3:
/* 521 */                       i = i5 * 53;
/* 523 */                       jDoubleToLongBits = ii10Oo1I0.I0001Ioi1lo(ii0oooo10, j);
/* 527 */                       Charset charset3 = ii0i1ll10I0.I00000oIO;
/* 74 */                        i5 = i + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                                break;
                            case 4:
/* 513 */                       i2 = i5 * 53;
/* 515 */                       iFloatToIntBits = ii10Oo1I0.I0000oI00(ii0oooo10, j);
/* 52 */                        i5 = iFloatToIntBits + i2;
                                break;
                            case 5:
/* 503 */                       i = i5 * 53;
/* 505 */                       jDoubleToLongBits = ii10Oo1I0.I0001Ioi1lo(ii0oooo10, j);
/* 509 */                       Charset charset4 = ii0i1ll10I0.I00000oIO;
/* 74 */                        i5 = i + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                                break;
                            case 6:
/* 495 */                       i2 = i5 * 53;
/* 497 */                       iFloatToIntBits = ii10Oo1I0.I0000oI00(ii0oooo10, j);
/* 52 */                        i5 = iFloatToIntBits + i2;
                                break;
                            case 7:
/* 481 */                       i3 = i5 * 53;
/* 485 */                       boolean zI00Io1o110i = ii10Oo1I0.I0000Il00O.I00Io1o110i(ii0oooo10, j);
/* 489 */                       Charset charset5 = ii0i1ll10I0.I00000oIO;
/* 491 */                       if (zI00Io1o110i) {
/* 220 */                           i9 = 1231;
                                }
/* 221 */                       i5 = i9 + i3;
                                break;
                            case 8:
/* 467 */                       i2 = i5 * 53;
/* 475 */                       iFloatToIntBits = ((String) ii10Oo1I0.I000II(ii0oooo10, j)).hashCode();
/* 52 */                        i5 = iFloatToIntBits + i2;
                                break;
                            case 9:
/* 454 */                       i4 = i5 * 53;
/* 456 */                       Object objI000II = ii10Oo1I0.I000II(ii0oooo10, j);
/* 460 */                       if (objI000II != null) {
/* 462 */                           iHashCode = objI000II.hashCode();
                                }
/* 387 */                       i5 = i4 + iHashCode;
                                break;
                            case 10:
/* 442 */                       i2 = i5 * 53;
/* 448 */                       iFloatToIntBits = ii10Oo1I0.I000II(ii0oooo10, j).hashCode();
/* 52 */                        i5 = iFloatToIntBits + i2;
                                break;
                            case 11:
/* 434 */                       i2 = i5 * 53;
/* 436 */                       iFloatToIntBits = ii10Oo1I0.I0000oI00(ii0oooo10, j);
/* 52 */                        i5 = iFloatToIntBits + i2;
                                break;
                            case 12:
/* 426 */                       i2 = i5 * 53;
/* 428 */                       iFloatToIntBits = ii10Oo1I0.I0000oI00(ii0oooo10, j);
/* 52 */                        i5 = iFloatToIntBits + i2;
                                break;
                            case 13:
/* 418 */                       i2 = i5 * 53;
/* 420 */                       iFloatToIntBits = ii10Oo1I0.I0000oI00(ii0oooo10, j);
/* 52 */                        i5 = iFloatToIntBits + i2;
                                break;
                            case 14:
/* 408 */                       i = i5 * 53;
/* 410 */                       jDoubleToLongBits = ii10Oo1I0.I0001Ioi1lo(ii0oooo10, j);
/* 414 */                       Charset charset6 = ii0i1ll10I0.I00000oIO;
/* 74 */                        i5 = i + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                                break;
                            case 15:
/* 400 */                       i2 = i5 * 53;
/* 402 */                       iFloatToIntBits = ii10Oo1I0.I0000oI00(ii0oooo10, j);
/* 52 */                        i5 = iFloatToIntBits + i2;
                                break;
                            case 16:
/* 390 */                       i = i5 * 53;
/* 392 */                       jDoubleToLongBits = ii10Oo1I0.I0001Ioi1lo(ii0oooo10, j);
/* 396 */                       Charset charset7 = ii0i1ll10I0.I00000oIO;
/* 74 */                        i5 = i + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                                break;
                            case 17:
/* 375 */                       i4 = i5 * 53;
/* 377 */                       Object objI000II2 = ii10Oo1I0.I000II(ii0oooo10, j);
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
/* 369 */                       iFloatToIntBits = ii10Oo1I0.I000II(ii0oooo10, j).hashCode();
/* 52 */                        i5 = iFloatToIntBits + i2;
                                break;
                            case 50:
/* 351 */                       i2 = i5 * 53;
/* 357 */                       iFloatToIntBits = ii10Oo1I0.I000II(ii0oooo10, j).hashCode();
/* 52 */                        i5 = iFloatToIntBits + i2;
                                break;
                            case 51:
/* 329 */                       if (I001iOo1i0O(ii0oooo10, i8, i6)) {
/* 331 */                           i = i5 * 53;
/* 343 */                           jDoubleToLongBits = Double.doubleToLongBits(((Double) ii10Oo1I0.I000II(ii0oooo10, j)).doubleValue());
/* 347 */                           Charset charset8 = ii0i1ll10I0.I00000oIO;
/* 74 */                            i5 = i + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                                    break;
                                } else {
                                    break;
                                }
                            case 52:
/* 305 */                       if (I001iOo1i0O(ii0oooo10, i8, i6)) {
/* 307 */                           i2 = i5 * 53;
/* 319 */                           iFloatToIntBits = Float.floatToIntBits(((Float) ii10Oo1I0.I000II(ii0oooo10, j)).floatValue());
/* 52 */                            i5 = iFloatToIntBits + i2;
                                    break;
                                } else {
                                    break;
                                }
                            case 53:
/* 289 */                       if (I001iOo1i0O(ii0oooo10, i8, i6)) {
/* 291 */                           i = i5 * 53;
/* 293 */                           jDoubleToLongBits = I00IO1oi11O(j, ii0oooo10);
/* 297 */                           Charset charset9 = ii0i1ll10I0.I00000oIO;
/* 74 */                            i5 = i + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                                    break;
                                } else {
                                    break;
                                }
                            case 54:
/* 273 */                       if (I001iOo1i0O(ii0oooo10, i8, i6)) {
/* 275 */                           i = i5 * 53;
/* 277 */                           jDoubleToLongBits = I00IO1oi11O(j, ii0oooo10);
/* 281 */                           Charset charset10 = ii0i1ll10I0.I00000oIO;
/* 74 */                            i5 = i + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                                    break;
                                } else {
                                    break;
                                }
                            case 55:
/* 259 */                       if (I001iOo1i0O(ii0oooo10, i8, i6)) {
/* 261 */                           i2 = i5 * 53;
/* 263 */                           iFloatToIntBits = I001lloI(j, ii0oooo10);
/* 52 */                            i5 = iFloatToIntBits + i2;
                                    break;
                                } else {
                                    break;
                                }
                            case 56:
/* 243 */                       if (I001iOo1i0O(ii0oooo10, i8, i6)) {
/* 245 */                           i = i5 * 53;
/* 247 */                           jDoubleToLongBits = I00IO1oi11O(j, ii0oooo10);
/* 251 */                           Charset charset11 = ii0i1ll10I0.I00000oIO;
/* 74 */                            i5 = i + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                                    break;
                                } else {
                                    break;
                                }
                            case 57:
/* 229 */                       if (I001iOo1i0O(ii0oooo10, i8, i6)) {
/* 231 */                           i2 = i5 * 53;
/* 233 */                           iFloatToIntBits = I001lloI(j, ii0oooo10);
/* 52 */                            i5 = iFloatToIntBits + i2;
                                    break;
                                } else {
                                    break;
                                }
                            case 58:
/* 202 */                       if (I001iOo1i0O(ii0oooo10, i8, i6)) {
/* 204 */                           i3 = i5 * 53;
/* 212 */                           boolean zBooleanValue = ((Boolean) ii10Oo1I0.I000II(ii0oooo10, j)).booleanValue();
/* 216 */                           Charset charset12 = ii0i1ll10I0.I00000oIO;
/* 218 */                           if (zBooleanValue) {
                                    }
/* 221 */                           i5 = i9 + i3;
                                    break;
                                } else {
                                    break;
                                }
                            case 59:
/* 182 */                       if (I001iOo1i0O(ii0oooo10, i8, i6)) {
/* 184 */                           i2 = i5 * 53;
/* 192 */                           iFloatToIntBits = ((String) ii10Oo1I0.I000II(ii0oooo10, j)).hashCode();
/* 52 */                            i5 = iFloatToIntBits + i2;
                                    break;
                                } else {
                                    break;
                                }
                            case 60:
/* 165 */                       if (I001iOo1i0O(ii0oooo10, i8, i6)) {
/* 167 */                           i2 = i5 * 53;
/* 173 */                           iFloatToIntBits = ii10Oo1I0.I000II(ii0oooo10, j).hashCode();
/* 52 */                            i5 = iFloatToIntBits + i2;
                                    break;
                                } else {
                                    break;
                                }
                            case 61:
/* 148 */                       if (I001iOo1i0O(ii0oooo10, i8, i6)) {
/* 150 */                           i2 = i5 * 53;
/* 156 */                           iFloatToIntBits = ii10Oo1I0.I000II(ii0oooo10, j).hashCode();
/* 52 */                            i5 = iFloatToIntBits + i2;
                                    break;
                                } else {
                                    break;
                                }
                            case 62:
/* 135 */                       if (I001iOo1i0O(ii0oooo10, i8, i6)) {
/* 137 */                           i2 = i5 * 53;
/* 139 */                           iFloatToIntBits = I001lloI(j, ii0oooo10);
/* 52 */                            i5 = iFloatToIntBits + i2;
                                    break;
                                } else {
                                    break;
                                }
                            case 63:
/* 122 */                       if (I001iOo1i0O(ii0oooo10, i8, i6)) {
/* 124 */                           i2 = i5 * 53;
/* 126 */                           iFloatToIntBits = I001lloI(j, ii0oooo10);
/* 52 */                            i5 = iFloatToIntBits + i2;
                                    break;
                                } else {
                                    break;
                                }
                            case Barcode.FORMAT_EAN_8:
/* 109 */                       if (I001iOo1i0O(ii0oooo10, i8, i6)) {
/* 111 */                           i2 = i5 * 53;
/* 113 */                           iFloatToIntBits = I001lloI(j, ii0oooo10);
/* 52 */                            i5 = iFloatToIntBits + i2;
                                    break;
                                } else {
                                    break;
                                }
                            case 65:
/* 94 */                        if (I001iOo1i0O(ii0oooo10, i8, i6)) {
/* 96 */                            i = i5 * 53;
/* 98 */                            jDoubleToLongBits = I00IO1oi11O(j, ii0oooo10);
/* 102 */                           Charset charset13 = ii0i1ll10I0.I00000oIO;
/* 74 */                            i5 = i + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                                    break;
                                } else {
                                    break;
                                }
                            case 66:
/* 81 */                        if (I001iOo1i0O(ii0oooo10, i8, i6)) {
/* 83 */                            i2 = i5 * 53;
/* 85 */                            iFloatToIntBits = I001lloI(j, ii0oooo10);
/* 52 */                            i5 = iFloatToIntBits + i2;
                                    break;
                                } else {
                                    break;
                                }
                            case 67:
/* 60 */                        if (I001iOo1i0O(ii0oooo10, i8, i6)) {
/* 62 */                            i = i5 * 53;
/* 64 */                            jDoubleToLongBits = I00IO1oi11O(j, ii0oooo10);
/* 68 */                            Charset charset14 = ii0i1ll10I0.I00000oIO;
/* 74 */                            i5 = i + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                                    break;
                                } else {
                                    break;
                                }
                            case 68:
/* 40 */                        if (I001iOo1i0O(ii0oooo10, i8, i6)) {
/* 42 */                            i2 = i5 * 53;
/* 48 */                            iFloatToIntBits = ii10Oo1I0.I000II(ii0oooo10, j).hashCode();
/* 52 */                            i5 = iFloatToIntBits + i2;
                                    break;
                                } else {
                                    break;
                                }
                        }
                    }
/* 583 */           int iHashCode2 = ii0oooo10.zzc.hashCode() + (i5 * 53);
/* 586 */           if (!this.I0001Ioi1lo) {
/* 602 */               return iHashCode2;
                    }
/* 600 */           return ((ii0Oi0OiillI) ii0oooo10).zzb.I00000oIO.hashCode() + (iHashCode2 * 53);
                }

                @Override
                public final boolean I0001Ioi1lo(ii0OoOo10 ii0oooo10, ii0OoOo10 ii0oooo102) {
                    boolean zI0001Ioi1lo;
/* 1 */             int[] iArr = this.I00000oIO;
/* 4 */             int i = 0;
                    while (true) {
/* 6 */                 if (i < iArr.length) {
/* 8 */                     int iI00IO1 = I00IO1(i);
/* 15 */                    long j = iI00IO1 & 1048575;
                            switch (I00II0oii1o(iI00IO1)) {
                                case 0:
/* 432 */                           if (!I001IIilI0O(ii0oooo10, ii0oooo102, i)) {
                                        break;
                                    } else {
/* 434 */                               Ooil0oIOI0l0 ooil0oIOI0l0 = ii10Oo1I0.I0000Il00O;
/* 454 */                               if (Double.doubleToLongBits(ooil0oIOI0l0.I0010I0i(ii0oooo10, j)) != Double.doubleToLongBits(ooil0oIOI0l0.I0010I0i(ii0oooo102, j))) {
                                            break;
                                        } else {
                                            continue;
/* 456 */                                   i += 3;
                                        }
                                    }
                                case 1:
/* 405 */                           if (!I001IIilI0O(ii0oooo10, ii0oooo102, i)) {
                                        break;
                                    } else {
/* 407 */                               Ooil0oIOI0l0 ooil0oIOI0l02 = ii10Oo1I0.I0000Il00O;
/* 425 */                               if (Float.floatToIntBits(ooil0oIOI0l02.I001IIilI0O(ii0oooo10, j)) != Float.floatToIntBits(ooil0oIOI0l02.I001IIilI0O(ii0oooo102, j))) {
                                            break;
                                        } else {
                                            continue;
/* 456 */                                   i += 3;
                                        }
                                    }
                                case 2:
/* 386 */                           if (!I001IIilI0O(ii0oooo10, ii0oooo102, i) || ii10Oo1I0.I0001Ioi1lo(ii0oooo10, j) != ii10Oo1I0.I0001Ioi1lo(ii0oooo102, j)) {
                                        break;
                                    } else {
                                        continue;
/* 456 */                               i += 3;
                                    }
                                    break;
                                case 3:
/* 367 */                           if (!I001IIilI0O(ii0oooo10, ii0oooo102, i) || ii10Oo1I0.I0001Ioi1lo(ii0oooo10, j) != ii10Oo1I0.I0001Ioi1lo(ii0oooo102, j)) {
                                        break;
                                    } else {
                                        continue;
/* 456 */                               i += 3;
                                    }
                                    break;
                                case 4:
/* 350 */                           if (!I001IIilI0O(ii0oooo10, ii0oooo102, i) || ii10Oo1I0.I0000oI00(ii0oooo10, j) != ii10Oo1I0.I0000oI00(ii0oooo102, j)) {
                                        break;
                                    } else {
                                        continue;
/* 456 */                               i += 3;
                                    }
                                    break;
                                case 5:
/* 330 */                           if (!I001IIilI0O(ii0oooo10, ii0oooo102, i) || ii10Oo1I0.I0001Ioi1lo(ii0oooo10, j) != ii10Oo1I0.I0001Ioi1lo(ii0oooo102, j)) {
                                        break;
                                    } else {
                                        continue;
/* 456 */                               i += 3;
                                    }
                                    break;
                                case 6:
/* 312 */                           if (!I001IIilI0O(ii0oooo10, ii0oooo102, i) || ii10Oo1I0.I0000oI00(ii0oooo10, j) != ii10Oo1I0.I0000oI00(ii0oooo102, j)) {
                                        break;
                                    } else {
                                        continue;
/* 456 */                               i += 3;
                                    }
                                    break;
                                case 7:
/* 292 */                           if (!I001IIilI0O(ii0oooo10, ii0oooo102, i)) {
                                        break;
                                    } else {
/* 294 */                               Ooil0oIOI0l0 ooil0oIOI0l03 = ii10Oo1I0.I0000Il00O;
/* 304 */                               if (ooil0oIOI0l03.I00Io1o110i(ii0oooo10, j) != ooil0oIOI0l03.I00Io1o110i(ii0oooo102, j)) {
                                            break;
                                        } else {
                                            continue;
/* 456 */                                   i += 3;
                                        }
                                    }
                                case 8:
/* 270 */                           if (!I001IIilI0O(ii0oooo10, ii0oooo102, i) || !ii0olI1ooOiO.I0001Ioi1lo(ii10Oo1I0.I000II(ii0oooo10, j), ii10Oo1I0.I000II(ii0oooo102, j))) {
                                        break;
                                    } else {
                                        continue;
/* 456 */                               i += 3;
                                    }
                                    break;
                                case 9:
/* 248 */                           if (!I001IIilI0O(ii0oooo10, ii0oooo102, i) || !ii0olI1ooOiO.I0001Ioi1lo(ii10Oo1I0.I000II(ii0oooo10, j), ii10Oo1I0.I000II(ii0oooo102, j))) {
                                        break;
                                    } else {
                                        continue;
/* 456 */                               i += 3;
                                    }
                                    break;
                                case 10:
/* 226 */                           if (!I001IIilI0O(ii0oooo10, ii0oooo102, i) || !ii0olI1ooOiO.I0001Ioi1lo(ii10Oo1I0.I000II(ii0oooo10, j), ii10Oo1I0.I000II(ii0oooo102, j))) {
                                        break;
                                    } else {
                                        continue;
/* 456 */                               i += 3;
                                    }
                                    break;
                                case 11:
/* 208 */                           if (!I001IIilI0O(ii0oooo10, ii0oooo102, i) || ii10Oo1I0.I0000oI00(ii0oooo10, j) != ii10Oo1I0.I0000oI00(ii0oooo102, j)) {
                                        break;
                                    } else {
                                        continue;
/* 456 */                               i += 3;
                                    }
                                    break;
                                case 12:
/* 190 */                           if (!I001IIilI0O(ii0oooo10, ii0oooo102, i) || ii10Oo1I0.I0000oI00(ii0oooo10, j) != ii10Oo1I0.I0000oI00(ii0oooo102, j)) {
                                        break;
                                    } else {
                                        continue;
/* 456 */                               i += 3;
                                    }
                                    break;
                                case 13:
/* 172 */                           if (!I001IIilI0O(ii0oooo10, ii0oooo102, i) || ii10Oo1I0.I0000oI00(ii0oooo10, j) != ii10Oo1I0.I0000oI00(ii0oooo102, j)) {
                                        break;
                                    } else {
                                        continue;
/* 456 */                               i += 3;
                                    }
                                    break;
                                case 14:
/* 152 */                           if (!I001IIilI0O(ii0oooo10, ii0oooo102, i) || ii10Oo1I0.I0001Ioi1lo(ii0oooo10, j) != ii10Oo1I0.I0001Ioi1lo(ii0oooo102, j)) {
                                        break;
                                    } else {
                                        continue;
/* 456 */                               i += 3;
                                    }
                                    break;
                                case 15:
/* 134 */                           if (!I001IIilI0O(ii0oooo10, ii0oooo102, i) || ii10Oo1I0.I0000oI00(ii0oooo10, j) != ii10Oo1I0.I0000oI00(ii0oooo102, j)) {
                                        break;
                                    } else {
                                        continue;
/* 456 */                               i += 3;
                                    }
                                    break;
                                case 16:
/* 114 */                           if (!I001IIilI0O(ii0oooo10, ii0oooo102, i) || ii10Oo1I0.I0001Ioi1lo(ii0oooo10, j) != ii10Oo1I0.I0001Ioi1lo(ii0oooo102, j)) {
                                        break;
                                    } else {
                                        continue;
/* 456 */                               i += 3;
                                    }
                                    break;
                                case 17:
/* 92 */                            if (!I001IIilI0O(ii0oooo10, ii0oooo102, i) || !ii0olI1ooOiO.I0001Ioi1lo(ii10Oo1I0.I000II(ii0oooo10, j), ii10Oo1I0.I000II(ii0oooo102, j))) {
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
/* 80 */                            zI0001Ioi1lo = ii0olI1ooOiO.I0001Ioi1lo(ii10Oo1I0.I000II(ii0oooo10, j), ii10Oo1I0.I000II(ii0oooo102, j));
                                    break;
                                case 50:
/* 67 */                            zI0001Ioi1lo = ii0olI1ooOiO.I0001Ioi1lo(ii10Oo1I0.I000II(ii0oooo10, j), ii10Oo1I0.I000II(ii0oooo102, j));
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
/* 41 */                            if (ii10Oo1I0.I0000oI00(ii0oooo10, j2) != ii10Oo1I0.I0000oI00(ii0oooo102, j2) || !ii0olI1ooOiO.I0001Ioi1lo(ii10Oo1I0.I000II(ii0oooo10, j), ii10Oo1I0.I000II(ii0oooo102, j))) {
                                        break;
                                    } else {
                                        continue;
/* 456 */                               i += 3;
                                    }
                                    break;
                                default:
/* 456 */                           i += 3;
                            }
/* 84 */                    if (zI0001Ioi1lo) {
/* 456 */                       i += 3;
                            }
                        } else if (ii0oooo10.zzc.equals(ii0oooo102.zzc)) {
/* 473 */                   if (this.I0001Ioi1lo) {
/* 483 */                       return ((ii0Oi0OiillI) ii0oooo10).zzb.equals(((ii0Oi0OiillI) ii0oooo102).zzb);
                            }
/* 488 */                   return true;
                        }
                    }
/* 3 */             return false;
                }

                @Override
                public final void I000II(Object obj, byte[] bArr, int i, int i2, i111i0I1 i111i0i1) throws ii0iI11ol {
/* 8 */             I001lIiIIo1O(obj, bArr, i, i2, 0, i111i0i1);
                }

                /* JADX WARN: Removed duplicated region for block: B:212:0x07d5  */
                /* JADX WARN: Removed duplicated region for block: B:214:0x07e1  */
                /* JADX WARN: Removed duplicated region for block: B:220:0x07ed A[LOOP:1: B:219:0x07eb->B:220:0x07ed, LOOP_END] */
                /* JADX WARN: Removed duplicated region for block: B:222:0x07fe  */
                /* JADX WARN: Removed duplicated region for block: B:225:0x07ac A[EXC_TOP_SPLITTER, SYNTHETIC] */
                /* JADX WARN: Removed duplicated region for block: B:326:0x07bd A[SYNTHETIC] */
                /* JADX WARN: Removed duplicated region for block: B:350:? A[RETURN, SYNTHETIC] */
                @Override
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final void I000O01llI0(Object obj, IOOOi1 iOOOi1, ii0II11oi0I ii0ii11oi0i) throws Throwable {
                    Object obj2;
                    Object objI00IlilI0i0i;
                    Object objI00IlilI0i0i2;
                    ii0lOl ii0lol;
                    i1i0olI i1i0oli;
                    Object obj3;
                    ii0lOl ii0lol2;
                    Object objI0010I0i;
                    Object obj4;
/* 1 */             ii0lOl ii0lol3 = this;
/* 10 */            IOOOI0 ioooi0 = (IOOOI0) iOOOi1.I0000oI00;
/* 12 */            int[] iArr = ii0lol3.I000O01llI0;
/* 14 */            int i = ii0lol3.I000OiO;
/* 16 */            int i2 = ii0lol3.I000OOo1O;
/* 18 */            ii0ii11oi0i.getClass();
/* 21 */            I000lI(obj);
/* 24 */            i1i0olI i1i0oli2 = ii0lol3.I000iOII;
/* 27 */            Object objI0010I0i2 = null;
                    while (true) {
                        try {
/* 28 */                    int iI01Iol = iOOOi1.I01Iol();
/* 47 */                    int iI00II0Ol1O0l = (iI01Iol < ii0lol3.I0000Il00O || iI01Iol > ii0lol3.I0000O) ? -1 : ii0lol3.I00II0Ol1O0l(iI01Iol, 0);
/* 49 */                    if (iI00II0Ol1O0l >= 0) {
/* 127 */                       int iI00IO1 = ii0lol3.I00IO1(iI00II0Ol1O0l);
                                try {
                                    try {
                                    } catch (ii0iI0IiOo unused) {
/* 154 */                               ii0lol = ii0lol3;
/* 155 */                               obj2 = objI0010I0i2;
/* 157 */                               i1i0oli = i1i0oli2;
/* 159 */                               obj3 = obj;
                                    }
                                    switch (I00II0oii1o(iI00IO1)) {
                                        case 0:
/* 1911 */                                  obj2 = objI0010I0i2;
/* 1913 */                                  i1i0oli = i1i0oli2;
/* 1915 */                                  ii0lOl ii0lol4 = ii0lol3;
/* 1918 */                                  int i3 = iI00IO1 & 1048575;
                                            try {
/* 1920 */                                      iOOOi1.I01Io001O(1);
/* 1932 */                                      ii0lol = ii0lol4;
/* 1935 */                                      ii10Oo1I0.I0000Il00O.I00II0oii1o(obj, i3, ioooi0.I00O0i0ii());
/* 1938 */                                      ii0lol.I00100o1O0lo(iI00II0Ol1O0l, obj);
/* 1941 */                                      ii0lol3 = ii0lol;
/* 1942 */                                      i1i0oli2 = i1i0oli;
/* 1944 */                                      objI0010I0i2 = obj2;
                                            } catch (Throwable th) {
/* 1948 */                                      th = th;
/* 260 */                                       i1i0oli2 = i1i0oli;
/* 2025 */                                      objI0010I0i2 = obj2;
/* 2027 */                                      objI00IlilI0i0i = objI0010I0i2;
/* 2028 */                                      while (i2 < i) {
                                                }
/* 2045 */                                      if (objI00IlilI0i0i != null) {
                                                }
/* 2058 */                                      throw th;
                                            }
                                            break;
                                        case 1:
/* 1883 */                                  obj2 = objI0010I0i2;
/* 1885 */                                  i1i0oli = i1i0oli2;
/* 1887 */                                  ii0lol2 = ii0lol3;
/* 1893 */                                  iOOOi1.I01Io001O(5);
/* 1903 */                                  ii10Oo1I0.I0000Il00O.I00IioO0OiOi(obj, iI00IO1 & 1048575, ioooi0.I00OI1());
/* 1906 */                                  ii0lol2.I00100o1O0lo(iI00II0Ol1O0l, obj);
/* 1465 */                                  ii0lol = ii0lol2;
/* 1941 */                                  ii0lol3 = ii0lol;
/* 1942 */                                  i1i0oli2 = i1i0oli;
/* 1944 */                                  objI0010I0i2 = obj2;
                                        case 2:
/* 1858 */                                  obj2 = objI0010I0i2;
/* 1860 */                                  i1i0oli = i1i0oli2;
/* 1862 */                                  ii0lol2 = ii0lol3;
/* 1867 */                                  iOOOi1.I01Io001O(0);
/* 1875 */                                  ii10Oo1I0.I000OiO(obj, iI00IO1 & 1048575, ioooi0.I00i01iIIliI());
/* 1878 */                                  ii0lol2.I00100o1O0lo(iI00II0Ol1O0l, obj);
/* 1465 */                                  ii0lol = ii0lol2;
/* 1941 */                                  ii0lol3 = ii0lol;
/* 1942 */                                  i1i0oli2 = i1i0oli;
/* 1944 */                                  objI0010I0i2 = obj2;
                                        case 3:
/* 1833 */                                  obj2 = objI0010I0i2;
/* 1835 */                                  i1i0oli = i1i0oli2;
/* 1837 */                                  ii0lol2 = ii0lol3;
/* 1842 */                                  iOOOi1.I01Io001O(0);
/* 1850 */                                  ii10Oo1I0.I000OiO(obj, iI00IO1 & 1048575, ioooi0.I00i0oil());
/* 1853 */                                  ii0lol2.I00100o1O0lo(iI00II0Ol1O0l, obj);
/* 1465 */                                  ii0lol = ii0lol2;
/* 1941 */                                  ii0lol3 = ii0lol;
/* 1942 */                                  i1i0oli2 = i1i0oli;
/* 1944 */                                  objI0010I0i2 = obj2;
                                        case 4:
/* 1808 */                                  obj2 = objI0010I0i2;
/* 1810 */                                  i1i0oli = i1i0oli2;
/* 1812 */                                  ii0lol2 = ii0lol3;
/* 1817 */                                  iOOOi1.I01Io001O(0);
/* 1825 */                                  ii10Oo1I0.I000OOo1O(obj, iI00IO1 & 1048575, ioooi0.I00OilO00Il());
/* 1828 */                                  ii0lol2.I00100o1O0lo(iI00II0Ol1O0l, obj);
/* 1465 */                                  ii0lol = ii0lol2;
/* 1941 */                                  ii0lol3 = ii0lol;
/* 1942 */                                  i1i0oli2 = i1i0oli;
/* 1944 */                                  objI0010I0i2 = obj2;
                                        case 5:
/* 1783 */                                  obj2 = objI0010I0i2;
/* 1785 */                                  i1i0oli = i1i0oli2;
/* 1787 */                                  ii0lol2 = ii0lol3;
/* 1792 */                                  iOOOi1.I01Io001O(1);
/* 1800 */                                  ii10Oo1I0.I000OiO(obj, iI00IO1 & 1048575, ioooi0.I00OloOo());
/* 1803 */                                  ii0lol2.I00100o1O0lo(iI00II0Ol1O0l, obj);
/* 1465 */                                  ii0lol = ii0lol2;
/* 1941 */                                  ii0lol3 = ii0lol;
/* 1942 */                                  i1i0oli2 = i1i0oli;
/* 1944 */                                  objI0010I0i2 = obj2;
                                        case 6:
/* 1757 */                                  obj2 = objI0010I0i2;
/* 1759 */                                  i1i0oli = i1i0oli2;
/* 1761 */                                  ii0lol2 = ii0lol3;
/* 1767 */                                  iOOOi1.I01Io001O(5);
/* 1775 */                                  ii10Oo1I0.I000OOo1O(obj, iI00IO1 & 1048575, ioooi0.I00OOll1());
/* 1778 */                                  ii0lol2.I00100o1O0lo(iI00II0Ol1O0l, obj);
/* 1465 */                                  ii0lol = ii0lol2;
/* 1941 */                                  ii0lol3 = ii0lol;
/* 1942 */                                  i1i0oli2 = i1i0oli;
/* 1944 */                                  objI0010I0i2 = obj2;
                                        case 7:
/* 1730 */                                  obj2 = objI0010I0i2;
/* 1732 */                                  i1i0oli = i1i0oli2;
/* 1734 */                                  ii0lol2 = ii0lol3;
/* 1739 */                                  iOOOi1.I01Io001O(0);
/* 1749 */                                  ii10Oo1I0.I0000Il00O.I001iOo1i0O(obj, iI00IO1 & 1048575, ioooi0.I00Io1lO());
/* 1752 */                                  ii0lol2.I00100o1O0lo(iI00II0Ol1O0l, obj);
/* 1465 */                                  ii0lol = ii0lol2;
/* 1941 */                                  ii0lol3 = ii0lol;
/* 1942 */                                  i1i0oli2 = i1i0oli;
/* 1944 */                                  objI0010I0i2 = obj2;
                                        case 8:
/* 1715 */                                  obj2 = objI0010I0i2;
/* 1717 */                                  i1i0oli = i1i0oli2;
/* 1719 */                                  ii0lol2 = ii0lol3;
/* 1722 */                                  ii0lol2.I00100l0(iI00IO1, iOOOi1, obj);
/* 1725 */                                  ii0lol2.I00100o1O0lo(iI00II0Ol1O0l, obj);
/* 1465 */                                  ii0lol = ii0lol2;
/* 1941 */                                  ii0lol3 = ii0lol;
/* 1942 */                                  i1i0oli2 = i1i0oli;
/* 1944 */                                  objI0010I0i2 = obj2;
                                        case 9:
/* 1686 */                                  obj2 = objI0010I0i2;
/* 1688 */                                  i1i0oli = i1i0oli2;
/* 1690 */                                  ii0lol2 = ii0lol3;
/* 1697 */                                  ii00oo ii00ooVar = (ii00oo) ii0lol2.I000OiO(iI00II0Ol1O0l, obj);
/* 1699 */                                  ii0oioOi00i ii0oiooi00iI00IioO0OiOi = ii0lol2.I00IioO0OiOi(iI00II0Ol1O0l);
/* 1704 */                                  iOOOi1.I01Io001O(2);
/* 1707 */                                  iOOOi1.I01Ilioliio(ii00ooVar, ii0oiooi00iI00IioO0OiOi, ii0ii11oi0i);
/* 1710 */                                  ii0lol2.I0010o(iI00II0Ol1O0l, obj, ii00ooVar);
/* 1465 */                                  ii0lol = ii0lol2;
/* 1941 */                                  ii0lol3 = ii0lol;
/* 1942 */                                  i1i0oli2 = i1i0oli;
/* 1944 */                                  objI0010I0i2 = obj2;
                                        case 10:
/* 1664 */                                  obj2 = objI0010I0i2;
/* 1666 */                                  i1i0oli = i1i0oli2;
/* 1668 */                                  ii0lol2 = ii0lol3;
/* 1678 */                                  ii10Oo1I0.I000iOII(obj, iI00IO1 & 1048575, iOOOi1.I01O10iIoo1O());
/* 1681 */                                  ii0lol2.I00100o1O0lo(iI00II0Ol1O0l, obj);
/* 1465 */                                  ii0lol = ii0lol2;
/* 1941 */                                  ii0lol3 = ii0lol;
/* 1942 */                                  i1i0oli2 = i1i0oli;
/* 1944 */                                  objI0010I0i2 = obj2;
                                        case 11:
/* 1639 */                                  obj2 = objI0010I0i2;
/* 1641 */                                  i1i0oli = i1i0oli2;
/* 1643 */                                  ii0lol2 = ii0lol3;
/* 1648 */                                  iOOOi1.I01Io001O(0);
/* 1656 */                                  ii10Oo1I0.I000OOo1O(obj, iI00IO1 & 1048575, ioooi0.I00Ol1ll1());
/* 1659 */                                  ii0lol2.I00100o1O0lo(iI00II0Ol1O0l, obj);
/* 1465 */                                  ii0lol = ii0lol2;
/* 1941 */                                  ii0lol3 = ii0lol;
/* 1942 */                                  i1i0oli2 = i1i0oli;
/* 1944 */                                  objI0010I0i2 = obj2;
                                        case 12:
/* 1568 */                                  obj2 = objI0010I0i2;
/* 1570 */                                  i1i0oli = i1i0oli2;
/* 1572 */                                  ii0lol2 = ii0lol3;
/* 1575 */                                  iOOOi1.I01Io001O(0);
/* 1578 */                                  int iI00OIo = ioooi0.I00OIo();
/* 1582 */                                  ii0i10o ii0i10oVarI00IOO = ii0lol2.I00IOO(iI00II0Ol1O0l);
/* 1586 */                                  if (ii0i10oVarI00IOO != null && !ii0i10oVarI00IOO.zza(iI00OIo)) {
/* 1595 */                                      i1i0olI i1i0oli3 = ii0olI1ooOiO.I00000oIO;
/* 1597 */                                      if (obj2 == null) {
/* 1599 */                                          i1i0oli.getClass();
/* 1602 */                                          objI0010I0i = i1i0olI.I0010I0i(obj);
                                                } else {
/* 1607 */                                          objI0010I0i = obj2;
                                                }
/* 1610 */                                      i1i0oli.getClass();
/* 1622 */                                      ((ii10O1i0I) objI0010I0i).I0000Il00O(iI01Iol << 3, Long.valueOf(iI00OIo));
/* 1625 */                                      ii0lol3 = ii0lol2;
/* 424 */                                       objI0010I0i2 = objI0010I0i;
/* 205 */                                       i1i0oli2 = i1i0oli;
                                            }
/* 1631 */                                  ii10Oo1I0.I000OOo1O(obj, iI00IO1 & 1048575, iI00OIo);
/* 1634 */                                  ii0lol2.I00100o1O0lo(iI00II0Ol1O0l, obj);
/* 1465 */                                  ii0lol = ii0lol2;
/* 1941 */                                  ii0lol3 = ii0lol;
/* 1942 */                                  i1i0oli2 = i1i0oli;
/* 1944 */                                  objI0010I0i2 = obj2;
                                            break;
                                        case 13:
/* 1543 */                                  obj2 = objI0010I0i2;
/* 1545 */                                  i1i0oli = i1i0oli2;
/* 1547 */                                  ii0lol2 = ii0lol3;
/* 1553 */                                  iOOOi1.I01Io001O(5);
/* 1561 */                                  ii10Oo1I0.I000OOo1O(obj, iI00IO1 & 1048575, ioooi0.I00Oio());
/* 1564 */                                  ii0lol2.I00100o1O0lo(iI00II0Ol1O0l, obj);
/* 1465 */                                  ii0lol = ii0lol2;
/* 1941 */                                  ii0lol3 = ii0lol;
/* 1942 */                                  i1i0oli2 = i1i0oli;
/* 1944 */                                  objI0010I0i2 = obj2;
                                        case 14:
/* 1519 */                                  obj2 = objI0010I0i2;
/* 1521 */                                  i1i0oli = i1i0oli2;
/* 1523 */                                  ii0lol2 = ii0lol3;
/* 1528 */                                  iOOOi1.I01Io001O(1);
/* 1536 */                                  ii10Oo1I0.I000OiO(obj, iI00IO1 & 1048575, ioooi0.I00i0O());
/* 1539 */                                  ii0lol2.I00100o1O0lo(iI00II0Ol1O0l, obj);
/* 1465 */                                  ii0lol = ii0lol2;
/* 1941 */                                  ii0lol3 = ii0lol;
/* 1942 */                                  i1i0oli2 = i1i0oli;
/* 1944 */                                  objI0010I0i2 = obj2;
                                        case 15:
/* 1495 */                                  obj2 = objI0010I0i2;
/* 1497 */                                  i1i0oli = i1i0oli2;
/* 1499 */                                  ii0lol2 = ii0lol3;
/* 1504 */                                  iOOOi1.I01Io001O(0);
/* 1512 */                                  ii10Oo1I0.I000OOo1O(obj, iI00IO1 & 1048575, ioooi0.I00Ol00());
/* 1515 */                                  ii0lol2.I00100o1O0lo(iI00II0Ol1O0l, obj);
/* 1465 */                                  ii0lol = ii0lol2;
/* 1941 */                                  ii0lol3 = ii0lol;
/* 1942 */                                  i1i0oli2 = i1i0oli;
/* 1944 */                                  objI0010I0i2 = obj2;
                                        case 16:
/* 1471 */                                  obj2 = objI0010I0i2;
/* 1473 */                                  i1i0oli = i1i0oli2;
/* 1475 */                                  ii0lol2 = ii0lol3;
/* 1480 */                                  iOOOi1.I01Io001O(0);
/* 1488 */                                  ii10Oo1I0.I000OiO(obj, iI00IO1 & 1048575, ioooi0.I00i0ilIl0i());
/* 1491 */                                  ii0lol2.I00100o1O0lo(iI00II0Ol1O0l, obj);
/* 1465 */                                  ii0lol = ii0lol2;
/* 1941 */                                  ii0lol3 = ii0lol;
/* 1942 */                                  i1i0oli2 = i1i0oli;
/* 1944 */                                  objI0010I0i2 = obj2;
                                        case 17:
/* 1439 */                                  obj2 = objI0010I0i2;
/* 1441 */                                  i1i0oli = i1i0oli2;
/* 1443 */                                  ii0lol2 = ii0lol3;
/* 1444 */                                  obj3 = obj;
                                            try {
/* 1450 */                                      ii00oo ii00ooVar2 = (ii00oo) ii0lol2.I000OiO(iI00II0Ol1O0l, obj3);
/* 1452 */                                      ii0oioOi00i ii0oiooi00iI00IioO0OiOi2 = ii0lol2.I00IioO0OiOi(iI00II0Ol1O0l);
/* 1456 */                                      iOOOi1.I01Io001O(3);
/* 1459 */                                      iOOOi1.I01Iio10lo(ii00ooVar2, ii0oiooi00iI00IioO0OiOi2, ii0ii11oi0i);
/* 1462 */                                      ii0lol2.I0010o(iI00II0Ol1O0l, obj3, ii00ooVar2);
/* 1465 */                                      ii0lol = ii0lol2;
/* 1941 */                                      ii0lol3 = ii0lol;
/* 1942 */                                      i1i0oli2 = i1i0oli;
/* 1944 */                                      objI0010I0i2 = obj2;
                                            } catch (ii0iI0IiOo unused2) {
/* 1468 */                                      ii0lol = ii0lol2;
/* 1961 */                                      objI0010I0i2 = obj2;
/* 1963 */                                      if (objI0010I0i2 == null) {
                                                }
/* 1973 */                                      i1i0oli.getClass();
/* 1980 */                                      if (i1i0olI.I00111O(0, iOOOi1, objI0010I0i2)) {
                                                }
                                            }
                                            break;
                                        case PoseLandmark.RIGHT_PINKY:
/* 1420 */                                  ii0lol = ii0lol3;
/* 1421 */                                  obj2 = objI0010I0i2;
/* 1423 */                                  i1i0oli = i1i0oli2;
/* 1434 */                                  iOOOi1.I01OoOi(lil1oioOIlo0.I00000oIO(iI00IO1 & 1048575, obj));
/* 1941 */                                  ii0lol3 = ii0lol;
/* 1942 */                                  i1i0oli2 = i1i0oli;
/* 1944 */                                  objI0010I0i2 = obj2;
                                        case PoseLandmark.LEFT_INDEX:
/* 1401 */                                  ii0lol = ii0lol3;
/* 1402 */                                  obj2 = objI0010I0i2;
/* 1404 */                                  i1i0oli = i1i0oli2;
/* 1415 */                                  iOOOi1.I00olI(lil1oioOIlo0.I00000oIO(iI00IO1 & 1048575, obj));
/* 1941 */                                  ii0lol3 = ii0lol;
/* 1942 */                                  i1i0oli2 = i1i0oli;
/* 1944 */                                  objI0010I0i2 = obj2;
                                        case PoseLandmark.RIGHT_INDEX:
/* 1382 */                                  ii0lol = ii0lol3;
/* 1383 */                                  obj2 = objI0010I0i2;
/* 1385 */                                  i1i0oli = i1i0oli2;
/* 1396 */                                  iOOOi1.I010101Oo1lO(lil1oioOIlo0.I00000oIO(iI00IO1 & 1048575, obj));
/* 1941 */                                  ii0lol3 = ii0lol;
/* 1942 */                                  i1i0oli2 = i1i0oli;
/* 1944 */                                  objI0010I0i2 = obj2;
                                        case PoseLandmark.LEFT_THUMB:
/* 1363 */                                  ii0lol = ii0lol3;
/* 1364 */                                  obj2 = objI0010I0i2;
/* 1366 */                                  i1i0oli = i1i0oli2;
/* 1377 */                                  iOOOi1.I011iiii0i(lil1oioOIlo0.I00000oIO(iI00IO1 & 1048575, obj));
/* 1941 */                                  ii0lol3 = ii0lol;
/* 1942 */                                  i1i0oli2 = i1i0oli;
/* 1944 */                                  objI0010I0i2 = obj2;
                                        case PoseLandmark.RIGHT_THUMB:
/* 1344 */                                  ii0lol = ii0lol3;
/* 1345 */                                  obj2 = objI0010I0i2;
/* 1347 */                                  i1i0oli = i1i0oli2;
/* 1358 */                                  iOOOi1.I00oooO(lil1oioOIlo0.I00000oIO(iI00IO1 & 1048575, obj));
/* 1941 */                                  ii0lol3 = ii0lol;
/* 1942 */                                  i1i0oli2 = i1i0oli;
/* 1944 */                                  objI0010I0i2 = obj2;
                                        case PoseLandmark.LEFT_HIP:
/* 1325 */                                  ii0lol = ii0lol3;
/* 1326 */                                  obj2 = objI0010I0i2;
/* 1328 */                                  i1i0oli = i1i0oli2;
/* 1339 */                                  iOOOi1.I00oO101o(lil1oioOIlo0.I00000oIO(iI00IO1 & 1048575, obj));
/* 1941 */                                  ii0lol3 = ii0lol;
/* 1942 */                                  i1i0oli2 = i1i0oli;
/* 1944 */                                  objI0010I0i2 = obj2;
                                        case PoseLandmark.RIGHT_HIP:
/* 1306 */                                  ii0lol = ii0lol3;
/* 1307 */                                  obj2 = objI0010I0i2;
/* 1309 */                                  i1i0oli = i1i0oli2;
/* 1320 */                                  iOOOi1.I00oI0i(lil1oioOIlo0.I00000oIO(iI00IO1 & 1048575, obj));
/* 1941 */                                  ii0lol3 = ii0lol;
/* 1942 */                                  i1i0oli2 = i1i0oli;
/* 1944 */                                  objI0010I0i2 = obj2;
                                        case PoseLandmark.LEFT_KNEE:
/* 1287 */                                  ii0lol = ii0lol3;
/* 1288 */                                  obj2 = objI0010I0i2;
/* 1290 */                                  i1i0oli = i1i0oli2;
/* 1301 */                                  iOOOi1.I01OiO1OI(lil1oioOIlo0.I00000oIO(iI00IO1 & 1048575, obj));
/* 1941 */                                  ii0lol3 = ii0lol;
/* 1942 */                                  i1i0oli2 = i1i0oli;
/* 1944 */                                  objI0010I0i2 = obj2;
                                        case PoseLandmark.RIGHT_KNEE:
/* 1246 */                                  ii0lol = ii0lol3;
/* 1247 */                                  obj2 = objI0010I0i2;
/* 1249 */                                  i1i0oli = i1i0oli2;
/* 1261 */                                  if ((536870912 & iI00IO1) != 0) {
/* 1270 */                                      iOOOi1.I011Ill(lil1oioOIlo0.I00000oIO(iI00IO1 & 1048575, obj), true);
                                            } else {
/* 1282 */                                      iOOOi1.I011Ill(lil1oioOIlo0.I00000oIO(iI00IO1 & 1048575, obj), false);
                                            }
/* 1941 */                                  ii0lol3 = ii0lol;
/* 1942 */                                  i1i0oli2 = i1i0oli;
/* 1944 */                                  objI0010I0i2 = obj2;
                                        case 27:
/* 1223 */                                  ii0lol = ii0lol3;
/* 1224 */                                  obj2 = objI0010I0i2;
/* 1226 */                                  i1i0oli = i1i0oli2;
/* 1241 */                                  iOOOi1.I010ioo(lil1oioOIlo0.I00000oIO(iI00IO1 & 1048575, obj), ii0lol.I00IioO0OiOi(iI00II0Ol1O0l), ii0ii11oi0i);
/* 1941 */                                  ii0lol3 = ii0lol;
/* 1942 */                                  i1i0oli2 = i1i0oli;
/* 1944 */                                  objI0010I0i2 = obj2;
                                        case PoseLandmark.RIGHT_ANKLE:
/* 1204 */                                  ii0lol = ii0lol3;
/* 1205 */                                  obj2 = objI0010I0i2;
/* 1207 */                                  i1i0oli = i1i0oli2;
/* 1218 */                                  iOOOi1.I01OlOoii0(lil1oioOIlo0.I00000oIO(iI00IO1 & 1048575, obj));
/* 1941 */                                  ii0lol3 = ii0lol;
/* 1942 */                                  i1i0oli2 = i1i0oli;
/* 1944 */                                  objI0010I0i2 = obj2;
                                        case PoseLandmark.LEFT_HEEL:
/* 1182 */                                  ii0lol = ii0lol3;
/* 1183 */                                  obj2 = objI0010I0i2;
/* 1185 */                                  i1i0oli = i1i0oli2;
/* 1187 */                                  obj3 = obj;
                                            try {
                                                try {
/* 1196 */                                          iOOOi1.I011Ol0(lil1oioOIlo0.I00000oIO(iI00IO1 & 1048575, obj3));
/* 1941 */                                          ii0lol3 = ii0lol;
/* 1942 */                                          i1i0oli2 = i1i0oli;
/* 1944 */                                          objI0010I0i2 = obj2;
                                                } catch (ii0iI0IiOo unused3) {
/* 1961 */                                          objI0010I0i2 = obj2;
/* 1963 */                                          if (objI0010I0i2 == null) {
                                                        try {
/* 1965 */                                                  i1i0oli.getClass();
/* 1968 */                                                  objI0010I0i2 = i1i0olI.I0010I0i(obj3);
                                                        } catch (Throwable th2) {
/* 2022 */                                                  th = th2;
/* 220 */                                                   i1i0oli2 = i1i0oli;
/* 2027 */                                                  objI00IlilI0i0i = objI0010I0i2;
/* 2028 */                                                  while (i2 < i) {
/* 2038 */                                                      objI00IlilI0i0i = I00IlilI0i0i(obj, iArr[i2], objI00IlilI0i0i, i1i0oli2, obj);
/* 2042 */                                                      i2++;
                                                            }
/* 2045 */                                                  if (objI00IlilI0i0i != null) {
/* 2047 */                                                      i1i0oli2.getClass();
/* 2056 */                                                      ((ii0OoOo10) obj).zzc = (ii10O1i0I) objI00IlilI0i0i;
                                                            }
/* 2058 */                                                  throw th;
                                                        }
                                                    }
/* 1973 */                                          i1i0oli.getClass();
/* 1980 */                                          if (i1i0olI.I00111O(0, iOOOi1, objI0010I0i2)) {
/* 2018 */                                              ii0lol3 = this;
/* 205 */                                               i1i0oli2 = i1i0oli;
                                                    } else {
/* 1982 */                                              objI00IlilI0i0i2 = objI0010I0i2;
/* 1983 */                                              while (i2 < i) {
/* 1993 */                                                  objI00IlilI0i0i2 = ii0lol.I00IlilI0i0i(obj3, iArr[i2], objI00IlilI0i0i2, i1i0oli, obj);
/* 1997 */                                                  i2++;
/* 1999 */                                                  ii0lol = this;
/* 2001 */                                                  obj3 = obj;
                                                        }
/* 197 */                                               i1i0oli2 = i1i0oli;
/* 2004 */                                              if (objI00IlilI0i0i2 == null) {
                                                        }
                                                    }
                                                }
                                            } catch (Throwable th3) {
/* 1201 */                                      th = th3;
/* 260 */                                       i1i0oli2 = i1i0oli;
/* 2025 */                                      objI0010I0i2 = obj2;
/* 2027 */                                      objI00IlilI0i0i = objI0010I0i2;
/* 2028 */                                      while (i2 < i) {
                                                }
/* 2045 */                                      if (objI00IlilI0i0i != null) {
                                                }
/* 2058 */                                      throw th;
                                            }
                                            break;
                                        case 30:
/* 1134 */                                  ii0lol = ii0lol3;
/* 1135 */                                  i1i0oli = i1i0oli2;
/* 1137 */                                  obj3 = obj;
/* 1139 */                                  Object obj5 = objI0010I0i2;
                                            try {
/* 1144 */                                      ii0i1l11 ii0i1l11VarI00000oIO = lil1oioOIlo0.I00000oIO(iI00IO1 & 1048575, obj3);
/* 1148 */                                      iOOOi1.I00o0iI0io1(ii0i1l11VarI00000oIO);
                                                try {
/* 1157 */                                          objI0010I0i2 = ii0olI1ooOiO.I00100l0(obj3, iI01Iol, ii0i1l11VarI00000oIO, ii0lol.I00IOO(iI00II0Ol1O0l), obj5, i1i0oli);
/* 1161 */                                          i1i0oli = i1i0oli;
/* 1163 */                                          ii0lol3 = ii0lol;
                                                } catch (Throwable th4) {
/* 1166 */                                          th = th4;
/* 1167 */                                          obj2 = obj5;
/* 1169 */                                          i1i0oli = i1i0oli;
/* 260 */                                           i1i0oli2 = i1i0oli;
/* 2025 */                                          objI0010I0i2 = obj2;
/* 2027 */                                          objI00IlilI0i0i = objI0010I0i2;
/* 2028 */                                          while (i2 < i) {
                                                    }
/* 2045 */                                          if (objI00IlilI0i0i != null) {
                                                    }
/* 2058 */                                          throw th;
                                                }
                                            } catch (ii0iI0IiOo unused4) {
/* 1178 */                                      obj2 = obj5;
/* 1961 */                                      objI0010I0i2 = obj2;
/* 1963 */                                      if (objI0010I0i2 == null) {
                                                }
/* 1973 */                                      i1i0oli.getClass();
/* 1980 */                                      if (i1i0olI.I00111O(0, iOOOi1, objI0010I0i2)) {
                                                }
                                            } catch (Throwable th5) {
/* 1173 */                                      th = th5;
/* 1174 */                                      obj2 = obj5;
                                            }
/* 205 */                                   i1i0oli2 = i1i0oli;
                                            break;
                                        case PoseLandmark.LEFT_FOOT_INDEX:
/* 1119 */                                  ii0lol = ii0lol3;
/* 1129 */                                  iOOOi1.I010l1ol111(lil1oioOIlo0.I00000oIO(iI00IO1 & 1048575, obj));
/* 950 */                                   obj2 = objI0010I0i2;
/* 952 */                                   i1i0oli = i1i0oli2;
/* 1941 */                                  ii0lol3 = ii0lol;
/* 1942 */                                  i1i0oli2 = i1i0oli;
/* 1944 */                                  objI0010I0i2 = obj2;
                                        case 32:
/* 1104 */                                  ii0lol = ii0lol3;
/* 1114 */                                  iOOOi1.I010oio1OO0(lil1oioOIlo0.I00000oIO(iI00IO1 & 1048575, obj));
/* 950 */                                   obj2 = objI0010I0i2;
/* 952 */                                   i1i0oli = i1i0oli2;
/* 1941 */                                  ii0lol3 = ii0lol;
/* 1942 */                                  i1i0oli2 = i1i0oli;
/* 1944 */                                  objI0010I0i2 = obj2;
                                        case 33:
/* 1089 */                                  ii0lol = ii0lol3;
/* 1099 */                                  iOOOi1.I0110OiO(lil1oioOIlo0.I00000oIO(iI00IO1 & 1048575, obj));
/* 950 */                                   obj2 = objI0010I0i2;
/* 952 */                                   i1i0oli = i1i0oli2;
/* 1941 */                                  ii0lol3 = ii0lol;
/* 1942 */                                  i1i0oli2 = i1i0oli;
/* 1944 */                                  objI0010I0i2 = obj2;
                                        case 34:
/* 1074 */                                  ii0lol = ii0lol3;
/* 1084 */                                  iOOOi1.I011IO1I11OI(lil1oioOIlo0.I00000oIO(iI00IO1 & 1048575, obj));
/* 950 */                                   obj2 = objI0010I0i2;
/* 952 */                                   i1i0oli = i1i0oli2;
/* 1941 */                                  ii0lol3 = ii0lol;
/* 1942 */                                  i1i0oli2 = i1i0oli;
/* 1944 */                                  objI0010I0i2 = obj2;
                                        case InputImage.IMAGE_FORMAT_YUV_420_888:
/* 1060 */                                  ii0lol = ii0lol3;
/* 1070 */                                  iOOOi1.I01OoOi(lil1oioOIlo0.I00000oIO(iI00IO1 & 1048575, obj));
/* 950 */                                   obj2 = objI0010I0i2;
/* 952 */                                   i1i0oli = i1i0oli2;
/* 1941 */                                  ii0lol3 = ii0lol;
/* 1942 */                                  i1i0oli2 = i1i0oli;
/* 1944 */                                  objI0010I0i2 = obj2;
                                        case 36:
/* 1046 */                                  ii0lol = ii0lol3;
/* 1056 */                                  iOOOi1.I00olI(lil1oioOIlo0.I00000oIO(iI00IO1 & 1048575, obj));
/* 950 */                                   obj2 = objI0010I0i2;
/* 952 */                                   i1i0oli = i1i0oli2;
/* 1941 */                                  ii0lol3 = ii0lol;
/* 1942 */                                  i1i0oli2 = i1i0oli;
/* 1944 */                                  objI0010I0i2 = obj2;
                                        case 37:
/* 1032 */                                  ii0lol = ii0lol3;
/* 1042 */                                  iOOOi1.I010101Oo1lO(lil1oioOIlo0.I00000oIO(iI00IO1 & 1048575, obj));
/* 950 */                                   obj2 = objI0010I0i2;
/* 952 */                                   i1i0oli = i1i0oli2;
/* 1941 */                                  ii0lol3 = ii0lol;
/* 1942 */                                  i1i0oli2 = i1i0oli;
/* 1944 */                                  objI0010I0i2 = obj2;
                                        case 38:
/* 1018 */                                  ii0lol = ii0lol3;
/* 1028 */                                  iOOOi1.I011iiii0i(lil1oioOIlo0.I00000oIO(iI00IO1 & 1048575, obj));
/* 950 */                                   obj2 = objI0010I0i2;
/* 952 */                                   i1i0oli = i1i0oli2;
/* 1941 */                                  ii0lol3 = ii0lol;
/* 1942 */                                  i1i0oli2 = i1i0oli;
/* 1944 */                                  objI0010I0i2 = obj2;
                                        case 39:
/* 1004 */                                  ii0lol = ii0lol3;
/* 1014 */                                  iOOOi1.I00oooO(lil1oioOIlo0.I00000oIO(iI00IO1 & 1048575, obj));
/* 950 */                                   obj2 = objI0010I0i2;
/* 952 */                                   i1i0oli = i1i0oli2;
/* 1941 */                                  ii0lol3 = ii0lol;
/* 1942 */                                  i1i0oli2 = i1i0oli;
/* 1944 */                                  objI0010I0i2 = obj2;
                                        case 40:
/* 990 */                                   ii0lol = ii0lol3;
/* 1000 */                                  iOOOi1.I00oO101o(lil1oioOIlo0.I00000oIO(iI00IO1 & 1048575, obj));
/* 950 */                                   obj2 = objI0010I0i2;
/* 952 */                                   i1i0oli = i1i0oli2;
/* 1941 */                                  ii0lol3 = ii0lol;
/* 1942 */                                  i1i0oli2 = i1i0oli;
/* 1944 */                                  objI0010I0i2 = obj2;
                                        case 41:
/* 976 */                                   ii0lol = ii0lol3;
/* 986 */                                   iOOOi1.I00oI0i(lil1oioOIlo0.I00000oIO(iI00IO1 & 1048575, obj));
/* 950 */                                   obj2 = objI0010I0i2;
/* 952 */                                   i1i0oli = i1i0oli2;
/* 1941 */                                  ii0lol3 = ii0lol;
/* 1942 */                                  i1i0oli2 = i1i0oli;
/* 1944 */                                  objI0010I0i2 = obj2;
                                        case 42:
/* 962 */                                   ii0lol = ii0lol3;
/* 972 */                                   iOOOi1.I01OiO1OI(lil1oioOIlo0.I00000oIO(iI00IO1 & 1048575, obj));
/* 950 */                                   obj2 = objI0010I0i2;
/* 952 */                                   i1i0oli = i1i0oli2;
/* 1941 */                                  ii0lol3 = ii0lol;
/* 1942 */                                  i1i0oli2 = i1i0oli;
/* 1944 */                                  objI0010I0i2 = obj2;
                                        case 43:
/* 937 */                                   ii0lol = ii0lol3;
/* 938 */                                   obj3 = obj;
                                            try {
/* 947 */                                       iOOOi1.I011Ol0(lil1oioOIlo0.I00000oIO(iI00IO1 & 1048575, obj3));
/* 950 */                                       obj2 = objI0010I0i2;
/* 952 */                                       i1i0oli = i1i0oli2;
/* 1941 */                                      ii0lol3 = ii0lol;
/* 1942 */                                      i1i0oli2 = i1i0oli;
/* 1944 */                                      objI0010I0i2 = obj2;
                                            } catch (ii0iI0IiOo unused5) {
/* 956 */                                       obj2 = objI0010I0i2;
/* 958 */                                       i1i0oli = i1i0oli2;
/* 1961 */                                      objI0010I0i2 = obj2;
/* 1963 */                                      if (objI0010I0i2 == null) {
                                                }
/* 1973 */                                      i1i0oli.getClass();
/* 1980 */                                      if (i1i0olI.I00111O(0, iOOOi1, objI0010I0i2)) {
                                                }
                                            }
                                            break;
                                        case 44:
/* 881 */                                   i1i0oli = i1i0oli2;
                                            try {
/* 888 */                                       ii0i1l11 ii0i1l11VarI00000oIO2 = lil1oioOIlo0.I00000oIO(iI00IO1 & 1048575, obj);
/* 892 */                                       iOOOi1.I00o0iI0io1(ii0i1l11VarI00000oIO2);
/* 895 */                                       ii0i10o ii0i10oVarI00IOO2 = ii0lol3.I00IOO(iI00II0Ol1O0l);
/* 899 */                                       ii0lol = ii0lol3;
/* 900 */                                       obj3 = obj;
/* 903 */                                       Object obj6 = objI0010I0i2;
                                                try {
                                                    try {
/* 905 */                                               objI0010I0i2 = ii0olI1ooOiO.I00100l0(obj3, iI01Iol, ii0i1l11VarI00000oIO2, ii0i10oVarI00IOO2, obj6, i1i0oli);
/* 909 */                                               i1i0oli2 = i1i0oli;
/* 910 */                                               ii0lol3 = ii0lol;
                                                    } catch (Throwable th6) {
/* 913 */                                               th = th6;
/* 914 */                                               objI0010I0i2 = obj6;
/* 915 */                                               i1i0oli2 = i1i0oli;
/* 93 */                                                obj2 = objI0010I0i2;
/* 2025 */                                              objI0010I0i2 = obj2;
/* 2027 */                                              objI00IlilI0i0i = objI0010I0i2;
/* 2028 */                                              while (i2 < i) {
                                                        }
/* 2045 */                                              if (objI00IlilI0i0i != null) {
                                                        }
/* 2058 */                                              throw th;
                                                    }
                                                } catch (ii0iI0IiOo unused6) {
/* 918 */                                           obj2 = obj6;
/* 920 */                                           i1i0oli = i1i0oli;
/* 1961 */                                          objI0010I0i2 = obj2;
/* 1963 */                                          if (objI0010I0i2 == null) {
                                                    }
/* 1973 */                                          i1i0oli.getClass();
/* 1980 */                                          if (i1i0olI.I00111O(0, iOOOi1, objI0010I0i2)) {
                                                    }
                                                }
                                            } catch (ii0iI0IiOo unused7) {
/* 931 */                                       ii0lol = ii0lol3;
/* 932 */                                       obj3 = obj;
/* 933 */                                       obj2 = objI0010I0i2;
                                            } catch (Throwable th7) {
/* 924 */                                       th = th7;
/* 927 */                                       i1i0oli2 = i1i0oli;
                                            }
                                            break;
                                        case BuildConfig.VERSION_CODE:
/* 865 */                                   i1i0oli = i1i0oli2;
/* 867 */                                   obj4 = obj;
/* 876 */                                   iOOOi1.I010l1ol111(lil1oioOIlo0.I00000oIO(iI00IO1 & 1048575, obj4));
/* 251 */                                   ii0lol = ii0lol3;
/* 252 */                                   obj2 = objI0010I0i2;
/* 1941 */                                  ii0lol3 = ii0lol;
/* 1942 */                                  i1i0oli2 = i1i0oli;
/* 1944 */                                  objI0010I0i2 = obj2;
                                        case 46:
/* 849 */                                   i1i0oli = i1i0oli2;
/* 851 */                                   obj4 = obj;
/* 860 */                                   iOOOi1.I010oio1OO0(lil1oioOIlo0.I00000oIO(iI00IO1 & 1048575, obj4));
/* 251 */                                   ii0lol = ii0lol3;
/* 252 */                                   obj2 = objI0010I0i2;
/* 1941 */                                  ii0lol3 = ii0lol;
/* 1942 */                                  i1i0oli2 = i1i0oli;
/* 1944 */                                  objI0010I0i2 = obj2;
                                        case 47:
/* 833 */                                   i1i0oli = i1i0oli2;
/* 835 */                                   obj4 = obj;
/* 844 */                                   iOOOi1.I0110OiO(lil1oioOIlo0.I00000oIO(iI00IO1 & 1048575, obj4));
/* 251 */                                   ii0lol = ii0lol3;
/* 252 */                                   obj2 = objI0010I0i2;
/* 1941 */                                  ii0lol3 = ii0lol;
/* 1942 */                                  i1i0oli2 = i1i0oli;
/* 1944 */                                  objI0010I0i2 = obj2;
                                        case 48:
/* 817 */                                   i1i0oli = i1i0oli2;
/* 819 */                                   obj4 = obj;
/* 828 */                                   iOOOi1.I011IO1I11OI(lil1oioOIlo0.I00000oIO(iI00IO1 & 1048575, obj4));
/* 251 */                                   ii0lol = ii0lol3;
/* 252 */                                   obj2 = objI0010I0i2;
/* 1941 */                                  ii0lol3 = ii0lol;
/* 1942 */                                  i1i0oli2 = i1i0oli;
/* 1944 */                                  objI0010I0i2 = obj2;
                                        case 49:
/* 797 */                                   i1i0oli = i1i0oli2;
/* 799 */                                   obj4 = obj;
/* 812 */                                   iOOOi1.I00oo1iO0ll(lil1oioOIlo0.I00000oIO(iI00IO1 & 1048575, obj4), ii0lol3.I00IioO0OiOi(iI00II0Ol1O0l), ii0ii11oi0i);
/* 251 */                                   ii0lol = ii0lol3;
/* 252 */                                   obj2 = objI0010I0i2;
/* 1941 */                                  ii0lol3 = ii0lol;
/* 1942 */                                  i1i0oli2 = i1i0oli;
/* 1944 */                                  objI0010I0i2 = obj2;
                                        case 50:
/* 735 */                                   i1i0oli = i1i0oli2;
/* 737 */                                   obj4 = obj;
/* 739 */                                   Object objI00Io1lO = ii0lol3.I00Io1lO(iI00II0Ol1O0l);
/* 747 */                                   long jI00IO1 = ii0lol3.I00IO1(iI00II0Ol1O0l) & 1048575;
/* 750 */                                   Object objI000II = ii10Oo1I0.I000II(obj4, jI00IO1);
/* 754 */                                   if (objI000II == null) {
/* 758 */                                       objI000II = ii0l1oio1O.I00iiI.I00000oIO();
/* 762 */                                       ii10Oo1I0.I000iOII(obj4, jI00IO1, objI000II);
                                            } else if (!((ii0l1oio1O) objI000II).I00iOIl) {
/* 775 */                                       Object objI00000oIO = ii0l1oio1O.I00iiI.I00000oIO();
/* 779 */                                       lilI0O1.I00000oIO(objI00000oIO, objI000II);
/* 782 */                                       ii10Oo1I0.I000iOII(obj4, jI00IO1, objI00000oIO);
/* 785 */                                       objI000II = objI00000oIO;
                                            }
/* 792 */                                   iOOOi1.I010OIo1l((ii0l1oio1O) objI000II, ((ii0l1l) objI00Io1lO).I00000oIO, ii0ii11oi0i);
/* 251 */                                   ii0lol = ii0lol3;
/* 252 */                                   obj2 = objI0010I0i2;
/* 1941 */                                  ii0lol3 = ii0lol;
/* 1942 */                                  i1i0oli2 = i1i0oli;
/* 1944 */                                  objI0010I0i2 = obj2;
                                        case 51:
/* 709 */                                   i1i0oli = i1i0oli2;
/* 711 */                                   obj4 = obj;
/* 715 */                                   iOOOi1.I01Io001O(1);
/* 727 */                                   ii10Oo1I0.I000iOII(obj4, iI00IO1 & 1048575, Double.valueOf(ioooi0.I00O0i0ii()));
/* 730 */                                   ii0lol3.I0010I0i(obj4, iI01Iol, iI00II0Ol1O0l);
/* 251 */                                   ii0lol = ii0lol3;
/* 252 */                                   obj2 = objI0010I0i2;
/* 1941 */                                  ii0lol3 = ii0lol;
/* 1942 */                                  i1i0oli2 = i1i0oli;
/* 1944 */                                  objI0010I0i2 = obj2;
                                        case 52:
/* 682 */                                   i1i0oli = i1i0oli2;
/* 684 */                                   obj4 = obj;
/* 689 */                                   iOOOi1.I01Io001O(5);
/* 701 */                                   ii10Oo1I0.I000iOII(obj4, iI00IO1 & 1048575, Float.valueOf(ioooi0.I00OI1()));
/* 704 */                                   ii0lol3.I0010I0i(obj4, iI01Iol, iI00II0Ol1O0l);
/* 251 */                                   ii0lol = ii0lol3;
/* 252 */                                   obj2 = objI0010I0i2;
/* 1941 */                                  ii0lol3 = ii0lol;
/* 1942 */                                  i1i0oli2 = i1i0oli;
/* 1944 */                                  objI0010I0i2 = obj2;
                                        case 53:
/* 656 */                                   i1i0oli = i1i0oli2;
/* 658 */                                   obj4 = obj;
/* 662 */                                   iOOOi1.I01Io001O(0);
/* 674 */                                   ii10Oo1I0.I000iOII(obj4, iI00IO1 & 1048575, Long.valueOf(ioooi0.I00i01iIIliI()));
/* 677 */                                   ii0lol3.I0010I0i(obj4, iI01Iol, iI00II0Ol1O0l);
/* 251 */                                   ii0lol = ii0lol3;
/* 252 */                                   obj2 = objI0010I0i2;
/* 1941 */                                  ii0lol3 = ii0lol;
/* 1942 */                                  i1i0oli2 = i1i0oli;
/* 1944 */                                  objI0010I0i2 = obj2;
                                        case 54:
/* 630 */                                   i1i0oli = i1i0oli2;
/* 632 */                                   obj4 = obj;
/* 636 */                                   iOOOi1.I01Io001O(0);
/* 648 */                                   ii10Oo1I0.I000iOII(obj4, iI00IO1 & 1048575, Long.valueOf(ioooi0.I00i0oil()));
/* 651 */                                   ii0lol3.I0010I0i(obj4, iI01Iol, iI00II0Ol1O0l);
/* 251 */                                   ii0lol = ii0lol3;
/* 252 */                                   obj2 = objI0010I0i2;
/* 1941 */                                  ii0lol3 = ii0lol;
/* 1942 */                                  i1i0oli2 = i1i0oli;
/* 1944 */                                  objI0010I0i2 = obj2;
                                        case 55:
/* 604 */                                   i1i0oli = i1i0oli2;
/* 606 */                                   obj4 = obj;
/* 610 */                                   iOOOi1.I01Io001O(0);
/* 622 */                                   ii10Oo1I0.I000iOII(obj4, iI00IO1 & 1048575, Integer.valueOf(ioooi0.I00OilO00Il()));
/* 625 */                                   ii0lol3.I0010I0i(obj4, iI01Iol, iI00II0Ol1O0l);
/* 251 */                                   ii0lol = ii0lol3;
/* 252 */                                   obj2 = objI0010I0i2;
/* 1941 */                                  ii0lol3 = ii0lol;
/* 1942 */                                  i1i0oli2 = i1i0oli;
/* 1944 */                                  objI0010I0i2 = obj2;
                                        case 56:
/* 578 */                                   i1i0oli = i1i0oli2;
/* 580 */                                   obj4 = obj;
/* 584 */                                   iOOOi1.I01Io001O(1);
/* 596 */                                   ii10Oo1I0.I000iOII(obj4, iI00IO1 & 1048575, Long.valueOf(ioooi0.I00OloOo()));
/* 599 */                                   ii0lol3.I0010I0i(obj4, iI01Iol, iI00II0Ol1O0l);
/* 251 */                                   ii0lol = ii0lol3;
/* 252 */                                   obj2 = objI0010I0i2;
/* 1941 */                                  ii0lol3 = ii0lol;
/* 1942 */                                  i1i0oli2 = i1i0oli;
/* 1944 */                                  objI0010I0i2 = obj2;
                                        case 57:
/* 551 */                                   i1i0oli = i1i0oli2;
/* 553 */                                   obj4 = obj;
/* 558 */                                   iOOOi1.I01Io001O(5);
/* 570 */                                   ii10Oo1I0.I000iOII(obj4, iI00IO1 & 1048575, Integer.valueOf(ioooi0.I00OOll1()));
/* 573 */                                   ii0lol3.I0010I0i(obj4, iI01Iol, iI00II0Ol1O0l);
/* 251 */                                   ii0lol = ii0lol3;
/* 252 */                                   obj2 = objI0010I0i2;
/* 1941 */                                  ii0lol3 = ii0lol;
/* 1942 */                                  i1i0oli2 = i1i0oli;
/* 1944 */                                  objI0010I0i2 = obj2;
                                        case 58:
/* 525 */                                   i1i0oli = i1i0oli2;
/* 527 */                                   obj4 = obj;
/* 531 */                                   iOOOi1.I01Io001O(0);
/* 543 */                                   ii10Oo1I0.I000iOII(obj4, iI00IO1 & 1048575, Boolean.valueOf(ioooi0.I00Io1lO()));
/* 546 */                                   ii0lol3.I0010I0i(obj4, iI01Iol, iI00II0Ol1O0l);
/* 251 */                                   ii0lol = ii0lol3;
/* 252 */                                   obj2 = objI0010I0i2;
/* 1941 */                                  ii0lol3 = ii0lol;
/* 1942 */                                  i1i0oli2 = i1i0oli;
/* 1944 */                                  objI0010I0i2 = obj2;
                                        case 59:
/* 513 */                                   i1i0oli = i1i0oli2;
/* 515 */                                   obj4 = obj;
/* 517 */                                   ii0lol3.I00100l0(iI00IO1, iOOOi1, obj4);
/* 520 */                                   ii0lol3.I0010I0i(obj4, iI01Iol, iI00II0Ol1O0l);
/* 251 */                                   ii0lol = ii0lol3;
/* 252 */                                   obj2 = objI0010I0i2;
/* 1941 */                                  ii0lol3 = ii0lol;
/* 1942 */                                  i1i0oli2 = i1i0oli;
/* 1944 */                                  objI0010I0i2 = obj2;
                                        case 60:
/* 487 */                                   i1i0oli = i1i0oli2;
/* 489 */                                   obj4 = obj;
/* 495 */                                   ii00oo ii00ooVar3 = (ii00oo) ii0lol3.I000iOII(obj4, iI01Iol, iI00II0Ol1O0l);
/* 497 */                                   ii0oioOi00i ii0oiooi00iI00IioO0OiOi3 = ii0lol3.I00IioO0OiOi(iI00II0Ol1O0l);
/* 502 */                                   iOOOi1.I01Io001O(2);
/* 505 */                                   iOOOi1.I01Ilioliio(ii00ooVar3, ii0oiooi00iI00IioO0OiOi3, ii0ii11oi0i);
/* 508 */                                   ii0lol3.I00111O(obj4, iI01Iol, iI00II0Ol1O0l, ii00ooVar3);
/* 251 */                                   ii0lol = ii0lol3;
/* 252 */                                   obj2 = objI0010I0i2;
/* 1941 */                                  ii0lol3 = ii0lol;
/* 1942 */                                  i1i0oli2 = i1i0oli;
/* 1944 */                                  objI0010I0i2 = obj2;
                                        case 61:
/* 468 */                                   i1i0oli = i1i0oli2;
/* 470 */                                   obj4 = obj;
/* 479 */                                   ii10Oo1I0.I000iOII(obj4, iI00IO1 & 1048575, iOOOi1.I01O10iIoo1O());
/* 482 */                                   ii0lol3.I0010I0i(obj4, iI01Iol, iI00II0Ol1O0l);
/* 251 */                                   ii0lol = ii0lol3;
/* 252 */                                   obj2 = objI0010I0i2;
/* 1941 */                                  ii0lol3 = ii0lol;
/* 1942 */                                  i1i0oli2 = i1i0oli;
/* 1944 */                                  objI0010I0i2 = obj2;
                                        case 62:
/* 442 */                                   i1i0oli = i1i0oli2;
/* 444 */                                   obj4 = obj;
/* 448 */                                   iOOOi1.I01Io001O(0);
/* 460 */                                   ii10Oo1I0.I000iOII(obj4, iI00IO1 & 1048575, Integer.valueOf(ioooi0.I00Ol1ll1()));
/* 463 */                                   ii0lol3.I0010I0i(obj4, iI01Iol, iI00II0Ol1O0l);
/* 251 */                                   ii0lol = ii0lol3;
/* 252 */                                   obj2 = objI0010I0i2;
/* 1941 */                                  ii0lol3 = ii0lol;
/* 1942 */                                  i1i0oli2 = i1i0oli;
/* 1944 */                                  objI0010I0i2 = obj2;
                                        case 63:
/* 371 */                                   i1i0oli = i1i0oli2;
/* 373 */                                   obj4 = obj;
/* 375 */                                   iOOOi1.I01Io001O(0);
/* 378 */                                   int iI00OIo2 = ioooi0.I00OIo();
/* 382 */                                   ii0i10o ii0i10oVarI00IOO3 = ii0lol3.I00IOO(iI00II0Ol1O0l);
/* 386 */                                   if (ii0i10oVarI00IOO3 != null && !ii0i10oVarI00IOO3.zza(iI00OIo2)) {
/* 395 */                                       i1i0olI i1i0oli4 = ii0olI1ooOiO.I00000oIO;
/* 397 */                                       if (objI0010I0i2 == null) {
/* 399 */                                           i1i0oli.getClass();
/* 402 */                                           objI0010I0i = i1i0olI.I0010I0i(obj4);
                                                } else {
/* 407 */                                           objI0010I0i = objI0010I0i2;
                                                }
/* 409 */                                       i1i0oli.getClass();
/* 421 */                                       ((ii10O1i0I) objI0010I0i).I0000Il00O(iI01Iol << 3, Long.valueOf(iI00OIo2));
/* 424 */                                       objI0010I0i2 = objI0010I0i;
/* 205 */                                       i1i0oli2 = i1i0oli;
                                            }
/* 434 */                                   ii10Oo1I0.I000iOII(obj4, iI00IO1 & 1048575, Integer.valueOf(iI00OIo2));
/* 437 */                                   ii0lol3.I0010I0i(obj4, iI01Iol, iI00II0Ol1O0l);
/* 251 */                                   ii0lol = ii0lol3;
/* 252 */                                   obj2 = objI0010I0i2;
/* 1941 */                                  ii0lol3 = ii0lol;
/* 1942 */                                  i1i0oli2 = i1i0oli;
/* 1944 */                                  objI0010I0i2 = obj2;
                                            break;
                                        case Barcode.FORMAT_EAN_8:
/* 345 */                                   i1i0oli = i1i0oli2;
/* 347 */                                   obj4 = obj;
/* 352 */                                   iOOOi1.I01Io001O(5);
/* 364 */                                   ii10Oo1I0.I000iOII(obj4, iI00IO1 & 1048575, Integer.valueOf(ioooi0.I00Oio()));
/* 367 */                                   ii0lol3.I0010I0i(obj4, iI01Iol, iI00II0Ol1O0l);
/* 251 */                                   ii0lol = ii0lol3;
/* 252 */                                   obj2 = objI0010I0i2;
/* 1941 */                                  ii0lol3 = ii0lol;
/* 1942 */                                  i1i0oli2 = i1i0oli;
/* 1944 */                                  objI0010I0i2 = obj2;
                                        case 65:
/* 320 */                                   i1i0oli = i1i0oli2;
/* 322 */                                   obj4 = obj;
/* 326 */                                   iOOOi1.I01Io001O(1);
/* 338 */                                   ii10Oo1I0.I000iOII(obj4, iI00IO1 & 1048575, Long.valueOf(ioooi0.I00i0O()));
/* 341 */                                   ii0lol3.I0010I0i(obj4, iI01Iol, iI00II0Ol1O0l);
/* 251 */                                   ii0lol = ii0lol3;
/* 252 */                                   obj2 = objI0010I0i2;
/* 1941 */                                  ii0lol3 = ii0lol;
/* 1942 */                                  i1i0oli2 = i1i0oli;
/* 1944 */                                  objI0010I0i2 = obj2;
                                        case 66:
/* 295 */                                   i1i0oli = i1i0oli2;
/* 297 */                                   obj4 = obj;
/* 301 */                                   iOOOi1.I01Io001O(0);
/* 313 */                                   ii10Oo1I0.I000iOII(obj4, iI00IO1 & 1048575, Integer.valueOf(ioooi0.I00Ol00()));
/* 316 */                                   ii0lol3.I0010I0i(obj4, iI01Iol, iI00II0Ol1O0l);
/* 251 */                                   ii0lol = ii0lol3;
/* 252 */                                   obj2 = objI0010I0i2;
/* 1941 */                                  ii0lol3 = ii0lol;
/* 1942 */                                  i1i0oli2 = i1i0oli;
/* 1944 */                                  objI0010I0i2 = obj2;
                                        case 67:
/* 270 */                                   i1i0oli = i1i0oli2;
/* 272 */                                   obj4 = obj;
/* 276 */                                   iOOOi1.I01Io001O(0);
/* 288 */                                   ii10Oo1I0.I000iOII(obj4, iI00IO1 & 1048575, Long.valueOf(ioooi0.I00i0ilIl0i()));
/* 291 */                                   ii0lol3.I0010I0i(obj4, iI01Iol, iI00II0Ol1O0l);
/* 251 */                                   ii0lol = ii0lol3;
/* 252 */                                   obj2 = objI0010I0i2;
/* 1941 */                                  ii0lol3 = ii0lol;
/* 1942 */                                  i1i0oli2 = i1i0oli;
/* 1944 */                                  objI0010I0i2 = obj2;
                                        case 68:
/* 228 */                                   i1i0oli = i1i0oli2;
/* 230 */                                   obj4 = obj;
                                            try {
/* 236 */                                       ii00oo ii00ooVar4 = (ii00oo) ii0lol3.I000iOII(obj4, iI01Iol, iI00II0Ol1O0l);
/* 238 */                                       ii0oioOi00i ii0oiooi00iI00IioO0OiOi4 = ii0lol3.I00IioO0OiOi(iI00II0Ol1O0l);
/* 242 */                                       iOOOi1.I01Io001O(3);
/* 245 */                                       iOOOi1.I01Iio10lo(ii00ooVar4, ii0oiooi00iI00IioO0OiOi4, ii0ii11oi0i);
/* 248 */                                       ii0lol3.I00111O(obj4, iI01Iol, iI00II0Ol1O0l, ii00ooVar4);
/* 251 */                                       ii0lol = ii0lol3;
/* 252 */                                       obj2 = objI0010I0i2;
/* 1941 */                                      ii0lol3 = ii0lol;
/* 1942 */                                      i1i0oli2 = i1i0oli;
/* 1944 */                                      objI0010I0i2 = obj2;
                                            } catch (ii0iI0IiOo unused8) {
/* 264 */                                       ii0lol = ii0lol3;
/* 265 */                                       obj2 = objI0010I0i2;
/* 267 */                                       obj3 = obj4;
/* 1961 */                                      objI0010I0i2 = obj2;
/* 1963 */                                      if (objI0010I0i2 == null) {
                                                }
/* 1973 */                                      i1i0oli.getClass();
/* 1980 */                                      if (i1i0olI.I00111O(0, iOOOi1, objI0010I0i2)) {
                                                }
                                            } catch (Throwable th8) {
/* 257 */                                       th = th8;
/* 258 */                                       obj2 = objI0010I0i2;
/* 260 */                                       i1i0oli2 = i1i0oli;
/* 2025 */                                      objI0010I0i2 = obj2;
/* 2027 */                                      objI00IlilI0i0i = objI0010I0i2;
/* 2028 */                                      while (i2 < i) {
                                                }
/* 2045 */                                      if (objI00IlilI0i0i != null) {
                                                }
/* 2058 */                                      throw th;
                                            }
                                            break;
                                        default:
/* 143 */                                   if (objI0010I0i2 == null) {
/* 145 */                                       i1i0oli2.getClass();
/* 148 */                                       objI0010I0i2 = i1i0olI.I0010I0i(obj);
                                            }
                                            try {
/* 163 */                                       i1i0oli2.getClass();
                                            } catch (ii0iI0IiOo unused9) {
/* 215 */                                       i1i0oli = i1i0oli2;
/* 224 */                                       ii0lol = ii0lol3;
/* 225 */                                       obj3 = obj;
/* 1963 */                                      if (objI0010I0i2 == null) {
                                                }
/* 1973 */                                      i1i0oli.getClass();
/* 1980 */                                      if (i1i0olI.I00111O(0, iOOOi1, objI0010I0i2)) {
                                                }
                                            } catch (Throwable th9) {
/* 209 */                                       th = th9;
/* 210 */                                       i1i0oli = i1i0oli2;
/* 220 */                                       i1i0oli2 = i1i0oli;
/* 2027 */                                      objI00IlilI0i0i = objI0010I0i2;
/* 2028 */                                      while (i2 < i) {
                                                }
/* 2045 */                                      if (objI00IlilI0i0i != null) {
                                                }
/* 2058 */                                      throw th;
                                            }
/* 170 */                                   if (!i1i0olI.I00111O(0, iOOOi1, objI0010I0i2)) {
/* 172 */                                       objI00IlilI0i0i2 = objI0010I0i2;
/* 173 */                                       while (i2 < i) {
/* 181 */                                           objI00IlilI0i0i2 = ii0lol3.I00IlilI0i0i(obj, iArr[i2], objI00IlilI0i0i2, i1i0oli2, obj);
/* 188 */                                           i2++;
/* 190 */                                           i1i0oli2 = i1i0oli2;
                                                }
/* 193 */                                       i1i0oli = i1i0oli2;
                                                break;
                                            } else {
/* 201 */                                       i1i0oli = i1i0oli2;
/* 205 */                                       i1i0oli2 = i1i0oli;
                                            }
                                            break;
                                    }
                                } catch (Throwable th10) {
/* 1952 */                          th = th10;
/* 1954 */                          obj2 = objI0010I0i2;
                                }
                            } else if (iI01Iol == Integer.MAX_VALUE) {
/* 56 */                        objI00IlilI0i0i2 = objI0010I0i2;
/* 57 */                        while (i2 < i) {
/* 65 */                            objI00IlilI0i0i2 = ii0lol3.I00IlilI0i0i(obj, iArr[i2], objI00IlilI0i0i2, i1i0oli2, obj);
/* 69 */                            i2++;
                                }
                            } else {
/* 74 */                        if (ii0lol3.I0001Ioi1lo) {
/* 79 */                            ii0ii11oi0i.I00000oIO(iI01Iol, ii0lol3.I0000oI00);
                                }
/* 82 */                        if (objI0010I0i2 == null) {
/* 84 */                            i1i0oli2.getClass();
/* 87 */                            objI0010I0i2 = i1i0olI.I0010I0i(obj);
                                }
                                try {
/* 97 */                            i1i0oli2.getClass();
/* 104 */                           if (!i1i0olI.I00111O(0, iOOOi1, objI0010I0i2)) {
/* 106 */                               objI00IlilI0i0i2 = objI0010I0i2;
/* 107 */                               while (i2 < i) {
/* 115 */                                   objI00IlilI0i0i2 = ii0lol3.I00IlilI0i0i(obj, iArr[i2], objI00IlilI0i0i2, i1i0oli2, obj);
/* 119 */                                   i2++;
                                        }
                                    }
                                } catch (Throwable th11) {
/* 122 */                           th = th11;
/* 2027 */                          objI00IlilI0i0i = objI0010I0i2;
/* 2028 */                          while (i2 < i) {
                                    }
/* 2045 */                          if (objI00IlilI0i0i != null) {
                                    }
/* 2058 */                          throw th;
                                }
                            }
                        } catch (Throwable th12) {
/* 125 */                   th = th12;
                        }
                    }
/* 197 */           i1i0oli2 = i1i0oli;
/* 2004 */          if (objI00IlilI0i0i2 == null) {
/* 2006 */              i1i0oli2.getClass();
/* 2015 */              ((ii0OoOo10) obj).zzc = (ii10O1i0I) objI00IlilI0i0i2;
                    }
                }

                /* JADX WARN: Removed duplicated region for block: B:196:0x04b5  */
                /* JADX WARN: Removed duplicated region for block: B:229:0x05aa  */
                /* JADX WARN: Removed duplicated region for block: B:232:0x05b9 A[PHI: r7
                  0x05b9: PHI (r7v9 int) = (r7v1 int), (r7v5 int), (r7v10 int) binds: [B:271:0x06bb, B:256:0x0662, B:231:0x05b7] A[DONT_GENERATE, DONT_INLINE]] */
                /* JADX WARN: Removed duplicated region for block: B:35:0x00ad  */
                /* JADX WARN: Removed duplicated region for block: B:85:0x01cd  */
                @Override
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final int I000OOo1O(ii00oo ii00ooVar) {
                    int i;
                    int i2;
                    int iI00000oOI;
                    int iI0000Il00O;
                    int iI00000oOI2;
                    int iI0001Ioi1lo;
                    int iI00000oOI3;
                    int iI00000oIO;
                    int i3;
                    int iI00000oOI4;
                    int i4;
                    int iI00000oIO2;
                    int iI000OOo1O;
                    int size;
                    int iI000oI1ioi;
                    int iI00000oOI5;
                    int iI00000oOI6;
                    int iI00000oOI7;
                    int iI00000oOI8;
                    int size2;
                    int iI00000oOI9;
                    int size3;
                    int iI00000oOI10;
                    int iI00000oIO3;
                    int iI00000oOI11;
                    int iI0000Il00O2;
                    int iI00000oOI12;
                    int iI0001Ioi1lo2;
                    int iI001lloI;
/* 1 */             ii0lOl ii0lol = this;
/* 3 */             ii00oo ii00ooVar2 = ii00ooVar;
/* 5 */             int[] iArr = ii0lol.I00000oIO;
/* 7 */             int i5 = 1048575;
/* 10 */            int i6 = 1048575;
/* 11 */            int i7 = 0;
/* 12 */            int i8 = 0;
/* 13 */            int iI001lllioOl = 0;
/* 15 */            while (i7 < iArr.length) {
/* 17 */                int iI00IO1 = ii0lol.I00IO1(i7);
/* 21 */                int iI00II0oii1o = I00II0oii1o(iI00IO1);
/* 27 */                int i9 = iArr[i7];
/* 29 */                int i10 = iArr[i7 + 2];
/* 31 */                int i11 = i10 & i5;
/* 36 */                Unsafe unsafe = I000o00OoI0I;
/* 38 */                if (iI00II0oii1o <= 17) {
/* 40 */                    if (i11 != i6) {
/* 47 */                        i8 = i11 == i5 ? 0 : unsafe.getInt(ii00ooVar2, i11);
/* 52 */                        i6 = i11;
                            }
/* 55 */                    i = 1 << (i10 >>> 20);
                        } else {
/* 58 */                    i = 0;
                        }
/* 59 */                int i12 = iI00IO1 & i5;
/* 64 */                if (iI00II0oii1o >= ii0O1l0l10.I00iiI.I00iOIl) {
/* 68 */                    int i13 = ii0O1l0l10.I00iiO.I00iOIl;
                        }
                        long j = i12;
/* 73 */                int iI00000oOI13 = 4;
                        switch (iI00II0oii1o) {
                            case 0:
/* 1733 */                      if (ii0lol.I001i1O0Ol(ii00ooVar2, i7, i6, i8, i)) {
/* 1737 */                          iI001lllioOl = OooioIOo1.I001lllioOl(i9 << 3, 8, iI001lllioOl);
                                    break;
                                } else {
                                    break;
                                }
                            case 1:
/* 1718 */                      i2 = 4;
/* 1724 */                      if (ii0lol.I001i1O0Ol(ii00ooVar2, i7, i6, i8, i)) {
/* 1468 */                          iI001lllioOl = OooioIOo1.I001lllioOl(i9 << 3, i2, iI001lllioOl);
                                }
/* 1413 */                      ii0lol = this;
                                break;
                            case 2:
/* 1700 */                      if (ii0lol.I001i1O0Ol(ii00ooVar2, i7, i6, i8, i)) {
/* 1704 */                          long j2 = unsafe.getLong(ii00ooVar2, j);
/* 1708 */                          iI00000oOI = ii0I1Il.I00000oOI(i9 << 3);
/* 1712 */                          iI0000Il00O = ii0I1Il.I0000Il00O(j2);
/* 1412 */                          iI001lllioOl += iI0000Il00O + iI00000oOI;
                                }
/* 1413 */                      ii0lol = this;
                                break;
                            case 3:
/* 1677 */                      if (ii0lol.I001i1O0Ol(ii00ooVar2, i7, i6, i8, i)) {
/* 1681 */                          long j3 = unsafe.getLong(ii00ooVar2, j);
/* 1685 */                          iI00000oOI = ii0I1Il.I00000oOI(i9 << 3);
/* 1689 */                          iI0000Il00O = ii0I1Il.I0000Il00O(j3);
/* 1412 */                          iI001lllioOl += iI0000Il00O + iI00000oOI;
                                }
/* 1413 */                      ii0lol = this;
                                break;
                            case 4:
/* 1653 */                      if (ii0lol.I001i1O0Ol(ii00ooVar2, i7, i6, i8, i)) {
/* 1657 */                          long j4 = unsafe.getInt(ii00ooVar2, j);
/* 1662 */                          iI00000oOI = ii0I1Il.I00000oOI(i9 << 3);
/* 1666 */                          iI0000Il00O = ii0I1Il.I0000Il00O(j4);
/* 1412 */                          iI001lllioOl += iI0000Il00O + iI00000oOI;
                                }
/* 1413 */                      ii0lol = this;
                                break;
                            case 5:
/* 1644 */                      if (ii0lol.I001i1O0Ol(ii00ooVar2, i7, i6, i8, i)) {
/* 1453 */                          iI001lllioOl = OooioIOo1.I001lllioOl(i9 << 3, 8, iI001lllioOl);
                                }
/* 1413 */                      ii0lol = this;
                                break;
                            case 6:
/* 1629 */                      i2 = 4;
/* 1635 */                      if (ii0lol.I001i1O0Ol(ii00ooVar2, i7, i6, i8, i)) {
                                }
/* 1413 */                      ii0lol = this;
                                break;
                            case 7:
/* 1619 */                      if (ii0lol.I001i1O0Ol(ii00ooVar2, i7, i6, i8, i)) {
/* 1623 */                          iI001lllioOl = OooioIOo1.I001lllioOl(i9 << 3, 1, iI001lllioOl);
                                }
/* 1413 */                      ii0lol = this;
                                break;
                            case 8:
/* 1579 */                      if (ii0lol.I001i1O0Ol(ii00ooVar2, i7, i6, i8, i)) {
/* 1581 */                          int i14 = i9 << 3;
/* 1583 */                          Object object = unsafe.getObject(ii00ooVar2, j);
/* 1589 */                          if (object instanceof ii01lO0l11ii) {
/* 1593 */                              iI00000oOI2 = ii0I1Il.I00000oOI(i14);
/* 1597 */                              iI0001Ioi1lo = ((ii01lO0l11ii) object).I0001Ioi1lo();
/* 1537 */                              iI001lllioOl = OooioIOo1.I001lIiIIo1O(iI0001Ioi1lo, iI0001Ioi1lo, iI00000oOI2, iI001lllioOl);
                                    } else {
/* 1604 */                              iI00000oOI = ii0I1Il.I00000oOI(i14);
/* 1608 */                              iI0000Il00O = ii0I1Il.I00000oIO((String) object);
/* 1412 */                              iI001lllioOl += iI0000Il00O + iI00000oOI;
                                    }
                                }
/* 1413 */                      ii0lol = this;
                                break;
                            case 9:
/* 1548 */                      if (ii0lol.I001i1O0Ol(ii00ooVar2, i7, i6, i8, i)) {
/* 1550 */                          Object object2 = unsafe.getObject(ii00ooVar2, j);
/* 1554 */                          ii0oioOi00i ii0oiooi00iI00IioO0OiOi = ii0lol.I00IioO0OiOi(i7);
/* 1558 */                          i1i0olI i1i0oli = ii0olI1ooOiO.I00000oIO;
/* 1564 */                          iI00000oOI3 = ii0I1Il.I00000oOI(i9 << 3);
/* 1568 */                          iI00000oIO = ((ii00oo) object2).I00000oIO(ii0oiooi00iI00IioO0OiOi);
/* 286 */                           iI001lllioOl = OooioIOo1.I001lIiIIo1O(iI00000oIO, iI00000oIO, iI00000oOI3, iI001lllioOl);
                                    break;
                                } else {
                                    break;
                                }
                            case 10:
/* 1519 */                      if (ii0lol.I001i1O0Ol(ii00ooVar2, i7, i6, i8, i)) {
/* 1527 */                          ii01lO0l11ii ii01lo0l11ii = (ii01lO0l11ii) unsafe.getObject(ii00ooVar2, j);
/* 1529 */                          iI00000oOI2 = ii0I1Il.I00000oOI(i9 << 3);
/* 1533 */                          iI0001Ioi1lo = ii01lo0l11ii.I0001Ioi1lo();
/* 1537 */                          iI001lllioOl = OooioIOo1.I001lIiIIo1O(iI0001Ioi1lo, iI0001Ioi1lo, iI00000oOI2, iI001lllioOl);
                                }
/* 1413 */                      ii0lol = this;
                                break;
                            case 11:
/* 1501 */                      if (ii0lol.I001i1O0Ol(ii00ooVar2, i7, i6, i8, i)) {
/* 1505 */                          i3 = unsafe.getInt(ii00ooVar2, j);
/* 1509 */                          iI00000oOI4 = ii0I1Il.I00000oOI(i9 << 3);
/* 1439 */                          iI001lllioOl = OooioIOo1.I001lllioOl(i3, iI00000oOI4, iI001lllioOl);
                                }
/* 1413 */                      ii0lol = this;
                                break;
                            case 12:
/* 1478 */                      if (ii0lol.I001i1O0Ol(ii00ooVar2, i7, i6, i8, i)) {
/* 1482 */                          long j5 = unsafe.getInt(ii00ooVar2, j);
/* 1487 */                          iI00000oOI = ii0I1Il.I00000oOI(i9 << 3);
/* 1491 */                          iI0000Il00O = ii0I1Il.I0000Il00O(j5);
/* 1412 */                          iI001lllioOl += iI0000Il00O + iI00000oOI;
                                }
/* 1413 */                      ii0lol = this;
                                break;
                            case 13:
/* 1458 */                      i2 = 4;
/* 1464 */                      if (ii0lol.I001i1O0Ol(ii00ooVar2, i7, i6, i8, i)) {
                                }
/* 1413 */                      ii0lol = this;
                                break;
                            case 14:
/* 1449 */                      if (ii0lol.I001i1O0Ol(ii00ooVar2, i7, i6, i8, i)) {
                                }
/* 1413 */                      ii0lol = this;
                                break;
                            case 15:
/* 1422 */                      if (ii0lol.I001i1O0Ol(ii00ooVar2, i7, i6, i8, i)) {
/* 1426 */                          int i15 = unsafe.getInt(ii00ooVar2, j);
/* 1434 */                          iI00000oOI4 = ii0I1Il.I00000oOI(i9 << 3);
/* 1438 */                          i3 = (i15 >> 31) ^ (i15 + i15);
/* 1439 */                          iI001lllioOl = OooioIOo1.I001lllioOl(i3, iI00000oOI4, iI001lllioOl);
                                }
/* 1413 */                      ii0lol = this;
                                break;
                            case 16:
/* 1390 */                      if (ii0lol.I001i1O0Ol(ii00ooVar2, i7, i6, i8, i)) {
/* 1394 */                          long j6 = unsafe.getLong(ii00ooVar2, j);
/* 1402 */                          iI00000oOI = ii0I1Il.I00000oOI(i9 << 3);
/* 1407 */                          iI0000Il00O = ii0I1Il.I0000Il00O((j6 >> 63) ^ (j6 + j6));
/* 1412 */                          iI001lllioOl += iI0000Il00O + iI00000oOI;
                                }
/* 1413 */                      ii0lol = this;
                                break;
                            case 17:
/* 1360 */                      if (ii0lol.I001i1O0Ol(ii00ooVar2, i7, i6, i8, i)) {
/* 1366 */                          ii00oo ii00ooVar3 = (ii00oo) unsafe.getObject(ii00ooVar2, j);
/* 1368 */                          ii0oioOi00i ii0oiooi00iI00IioO0OiOi2 = ii0lol.I00IioO0OiOi(i7);
/* 1374 */                          int iI00000oOI14 = ii0I1Il.I00000oOI(i9 << 3);
/* 1378 */                          i4 = iI00000oOI14 + iI00000oOI14;
/* 1379 */                          iI00000oIO2 = ii00ooVar3.I00000oIO(ii0oiooi00iI00IioO0OiOi2);
/* 108 */                           iI000OOo1O = iI00000oIO2 + i4;
/* 109 */                           iI001lllioOl += iI000OOo1O;
                                    break;
                                } else {
                                    break;
                                }
                            case PoseLandmark.RIGHT_PINKY:
/* 1349 */                      iI000OOo1O = ii0olI1ooOiO.I000OOo1O(i9, (List) unsafe.getObject(ii00ooVar2, j));
/* 109 */                       iI001lllioOl += iI000OOo1O;
                                break;
                            case PoseLandmark.LEFT_INDEX:
/* 1337 */                      iI000OOo1O = ii0olI1ooOiO.I000O01llI0(i9, (List) unsafe.getObject(ii00ooVar2, j));
/* 109 */                       iI001lllioOl += iI000OOo1O;
                                break;
                            case PoseLandmark.RIGHT_INDEX:
/* 1303 */                      List list = (List) unsafe.getObject(ii00ooVar2, j);
/* 1305 */                      i1i0olI i1i0oli2 = ii0olI1ooOiO.I00000oIO;
/* 1329 */                      iI00000oOI6 = list.size() == 0 ? 0 : (ii0I1Il.I00000oOI(i9 << 3) * list.size()) + ii0olI1ooOiO.I000iOII(list);
/* 1216 */                      iI001lllioOl += iI00000oOI6;
                                break;
                            case PoseLandmark.LEFT_THUMB:
/* 1275 */                      List list2 = (List) unsafe.getObject(ii00ooVar2, j);
/* 1277 */                      i1i0olI i1i0oli3 = ii0olI1ooOiO.I00000oIO;
/* 1279 */                      size = list2.size();
/* 1283 */                      if (size != 0) {
/* 1289 */                          iI000oI1ioi = ii0olI1ooOiO.I000oI1ioi(list2);
/* 1293 */                          iI00000oOI5 = ii0I1Il.I00000oOI(i9 << 3);
/* 892 */                           iI00000oOI7 = (iI00000oOI5 * size) + iI000oI1ioi;
/* 510 */                           iI001lllioOl += iI00000oOI7;
                                    break;
                                }
/* 462 */                       iI00000oOI7 = 0;
/* 510 */                       iI001lllioOl += iI00000oOI7;
                            case PoseLandmark.RIGHT_THUMB:
/* 1247 */                      List list3 = (List) unsafe.getObject(ii00ooVar2, j);
/* 1249 */                      i1i0olI i1i0oli4 = ii0olI1ooOiO.I00000oIO;
/* 1251 */                      size = list3.size();
/* 1255 */                      if (size != 0) {
/* 1261 */                          iI000oI1ioi = ii0olI1ooOiO.I000OiO(list3);
/* 1265 */                          iI00000oOI5 = ii0I1Il.I00000oOI(i9 << 3);
/* 892 */                           iI00000oOI7 = (iI00000oOI5 * size) + iI000oI1ioi;
/* 510 */                           iI001lllioOl += iI00000oOI7;
                                    break;
                                }
/* 462 */                       iI00000oOI7 = 0;
/* 510 */                       iI001lllioOl += iI00000oOI7;
                            case PoseLandmark.LEFT_HIP:
/* 1237 */                      iI000OOo1O = ii0olI1ooOiO.I000OOo1O(i9, (List) unsafe.getObject(ii00ooVar2, j));
/* 109 */                       iI001lllioOl += iI000OOo1O;
                                break;
                            case PoseLandmark.RIGHT_HIP:
/* 1225 */                      iI000OOo1O = ii0olI1ooOiO.I000O01llI0(i9, (List) unsafe.getObject(ii00ooVar2, j));
/* 109 */                       iI001lllioOl += iI000OOo1O;
                                break;
                            case PoseLandmark.LEFT_KNEE:
/* 1196 */                      List list4 = (List) unsafe.getObject(ii00ooVar2, j);
/* 1198 */                      i1i0olI i1i0oli5 = ii0olI1ooOiO.I00000oIO;
/* 1200 */                      int size4 = list4.size();
/* 1204 */                      if (size4 != 0) {
/* 1215 */                          iI00000oOI6 = (ii0I1Il.I00000oOI(i9 << 3) + 1) * size4;
                                }
/* 1216 */                      iI001lllioOl += iI00000oOI6;
                                break;
                            case PoseLandmark.RIGHT_KNEE:
/* 1101 */                      List list5 = (List) unsafe.getObject(ii00ooVar2, j);
/* 1103 */                      i1i0olI i1i0oli6 = ii0olI1ooOiO.I00000oIO;
/* 1105 */                      int size5 = list5.size();
/* 1109 */                      if (size5 == 0) {
/* 462 */                           iI00000oOI7 = 0;
                                } else {
/* 1119 */                          iI00000oOI7 = ii0I1Il.I00000oOI(i9 << 3) * size5;
/* 1122 */                          if (list5 instanceof ii0ioio1) {
/* 1124 */                              ii0ioio1 ii0ioio1Var = (ii0ioio1) list5;
/* 1127 */                              for (int i16 = 0; i16 < size5; i16++) {
/* 1129 */                                  Object objZzc = ii0ioio1Var.zzc();
/* 1135 */                                  if (objZzc instanceof ii01lO0l11ii) {
/* 1139 */                                      int iI0001Ioi1lo3 = ((ii01lO0l11ii) objZzc).I0001Ioi1lo();
/* 1143 */                                      iI00000oOI7 = OooioIOo1.I001lllioOl(iI0001Ioi1lo3, iI0001Ioi1lo3, iI00000oOI7);
                                            } else {
/* 1154 */                                      iI00000oOI7 = ii0I1Il.I00000oIO((String) objZzc) + iI00000oOI7;
                                            }
                                        }
                                    } else {
/* 1160 */                              for (int i17 = 0; i17 < size5; i17++) {
/* 1162 */                                  Object obj = list5.get(i17);
/* 1168 */                                  if (obj instanceof ii01lO0l11ii) {
/* 1172 */                                      int iI0001Ioi1lo4 = ((ii01lO0l11ii) obj).I0001Ioi1lo();
/* 1176 */                                      iI00000oOI7 = OooioIOo1.I001lllioOl(iI0001Ioi1lo4, iI0001Ioi1lo4, iI00000oOI7);
                                            } else {
/* 1187 */                                      iI00000oOI7 = ii0I1Il.I00000oIO((String) obj) + iI00000oOI7;
                                            }
                                        }
                                    }
                                }
/* 510 */                       iI001lllioOl += iI00000oOI7;
                                break;
                            case 27:
/* 1051 */                      List list6 = (List) unsafe.getObject(ii00ooVar2, j);
/* 1053 */                      ii0oioOi00i ii0oiooi00iI00IioO0OiOi3 = ii0lol.I00IioO0OiOi(i7);
/* 1057 */                      i1i0olI i1i0oli7 = ii0olI1ooOiO.I00000oIO;
/* 1059 */                      int size6 = list6.size();
/* 1063 */                      if (size6 == 0) {
/* 1065 */                          iI00000oOI8 = 0;
                                } else {
/* 1073 */                          iI00000oOI8 = ii0I1Il.I00000oOI(i9 << 3) * size6;
/* 1075 */                          for (int i18 = 0; i18 < size6; i18++) {
/* 1083 */                              int iI00000oIO4 = ((ii00oo) list6.get(i18)).I00000oIO(ii0oiooi00iI00IioO0OiOi3);
/* 1087 */                              iI00000oOI8 = OooioIOo1.I001lllioOl(iI00000oIO4, iI00000oIO4, iI00000oOI8);
                                    }
                                }
/* 1094 */                      iI001lllioOl += iI00000oOI8;
                                break;
                            case PoseLandmark.RIGHT_ANKLE:
/* 1004 */                      List list7 = (List) unsafe.getObject(ii00ooVar2, j);
/* 1006 */                      i1i0olI i1i0oli8 = ii0olI1ooOiO.I00000oIO;
/* 1008 */                      int size7 = list7.size();
/* 1012 */                      if (size7 != 0) {
/* 1022 */                          iI00000oOI7 = ii0I1Il.I00000oOI(i9 << 3) * size7;
/* 1028 */                          for (int i19 = 0; i19 < list7.size(); i19++) {
/* 1036 */                              int iI0001Ioi1lo5 = ((ii01lO0l11ii) list7.get(i19)).I0001Ioi1lo();
/* 1040 */                              iI00000oOI7 = OooioIOo1.I001lllioOl(iI0001Ioi1lo5, iI0001Ioi1lo5, iI00000oOI7);
                                    }
                                }
/* 510 */                       iI001lllioOl += iI00000oOI7;
                                break;
                            case PoseLandmark.LEFT_HEEL:
/* 977 */                       List list8 = (List) unsafe.getObject(ii00ooVar2, j);
/* 979 */                       i1i0olI i1i0oli9 = ii0olI1ooOiO.I00000oIO;
/* 981 */                       size = list8.size();
/* 985 */                       if (size != 0) {
/* 991 */                           iI000oI1ioi = ii0olI1ooOiO.I000o00OoI0I(list8);
/* 995 */                           iI00000oOI5 = ii0I1Il.I00000oOI(i9 << 3);
/* 892 */                           iI00000oOI7 = (iI00000oOI5 * size) + iI000oI1ioi;
/* 510 */                           iI001lllioOl += iI00000oOI7;
                                    break;
                                }
/* 462 */                       iI00000oOI7 = 0;
/* 510 */                       iI001lllioOl += iI00000oOI7;
                            case 30:
/* 950 */                       List list9 = (List) unsafe.getObject(ii00ooVar2, j);
/* 952 */                       i1i0olI i1i0oli10 = ii0olI1ooOiO.I00000oIO;
/* 954 */                       size = list9.size();
/* 958 */                       if (size != 0) {
/* 964 */                           iI000oI1ioi = ii0olI1ooOiO.I000II(list9);
/* 968 */                           iI00000oOI5 = ii0I1Il.I00000oOI(i9 << 3);
/* 892 */                           iI00000oOI7 = (iI00000oOI5 * size) + iI000oI1ioi;
/* 510 */                           iI001lllioOl += iI00000oOI7;
                                    break;
                                }
/* 462 */                       iI00000oOI7 = 0;
/* 510 */                       iI001lllioOl += iI00000oOI7;
                            case PoseLandmark.LEFT_FOOT_INDEX:
/* 940 */                       iI000OOo1O = ii0olI1ooOiO.I000O01llI0(i9, (List) unsafe.getObject(ii00ooVar2, j));
/* 109 */                       iI001lllioOl += iI000OOo1O;
                                break;
                            case 32:
/* 928 */                       iI000OOo1O = ii0olI1ooOiO.I000OOo1O(i9, (List) unsafe.getObject(ii00ooVar2, j));
/* 109 */                       iI001lllioOl += iI000OOo1O;
                                break;
                            case 33:
/* 899 */                       List list10 = (List) unsafe.getObject(ii00ooVar2, j);
/* 901 */                       i1i0olI i1i0oli11 = ii0olI1ooOiO.I00000oIO;
/* 903 */                       size = list10.size();
/* 907 */                       if (size != 0) {
/* 913 */                           iI000oI1ioi = ii0olI1ooOiO.I000l1(list10);
/* 917 */                           iI00000oOI5 = ii0I1Il.I00000oOI(i9 << 3);
/* 892 */                           iI00000oOI7 = (iI00000oOI5 * size) + iI000oI1ioi;
/* 510 */                           iI001lllioOl += iI00000oOI7;
                                    break;
                                }
/* 462 */                       iI00000oOI7 = 0;
/* 510 */                       iI001lllioOl += iI00000oOI7;
                            case 34:
/* 869 */                       List list11 = (List) unsafe.getObject(ii00ooVar2, j);
/* 871 */                       i1i0olI i1i0oli12 = ii0olI1ooOiO.I00000oIO;
/* 873 */                       size = list11.size();
/* 877 */                       if (size != 0) {
/* 883 */                           iI000oI1ioi = ii0olI1ooOiO.I000lI(list11);
/* 887 */                           iI00000oOI5 = ii0I1Il.I00000oOI(i9 << 3);
/* 892 */                           iI00000oOI7 = (iI00000oOI5 * size) + iI000oI1ioi;
/* 510 */                           iI001lllioOl += iI00000oOI7;
                                    break;
                                }
/* 462 */                       iI00000oOI7 = 0;
/* 510 */                       iI001lllioOl += iI00000oOI7;
                            case InputImage.IMAGE_FORMAT_YUV_420_888:
/* 846 */                       List list12 = (List) unsafe.getObject(ii00ooVar2, j);
/* 848 */                       i1i0olI i1i0oli13 = ii0olI1ooOiO.I00000oIO;
/* 854 */                       size2 = list12.size() * 8;
/* 855 */                       if (size2 > 0) {
/* 859 */                           iI00000oOI9 = ii0I1Il.I00000oOI(i9 << 3);
/* 580 */                           iI001lllioOl = OooioIOo1.I001lIiIIo1O(size2, iI00000oOI9, size2, iI001lllioOl);
                                    break;
                                } else {
                                    break;
                                }
                            case 36:
/* 823 */                       List list13 = (List) unsafe.getObject(ii00ooVar2, j);
/* 825 */                       i1i0olI i1i0oli14 = ii0olI1ooOiO.I00000oIO;
/* 831 */                       size3 = list13.size() * 4;
/* 832 */                       if (size3 > 0) {
/* 836 */                           iI00000oOI10 = ii0I1Il.I00000oOI(i9 << 3);
/* 648 */                           iI001lllioOl = OooioIOo1.I001lIiIIo1O(size3, iI00000oOI10, size3, iI001lllioOl);
                                    break;
                                } else {
                                    break;
                                }
                            case 37:
/* 805 */                       size2 = ii0olI1ooOiO.I000iOII((List) unsafe.getObject(ii00ooVar2, j));
/* 809 */                       if (size2 > 0) {
/* 813 */                           iI00000oOI9 = ii0I1Il.I00000oOI(i9 << 3);
/* 580 */                           iI001lllioOl = OooioIOo1.I001lIiIIo1O(size2, iI00000oOI9, size2, iI001lllioOl);
                                    break;
                                } else {
                                    break;
                                }
                            case 38:
/* 785 */                       size2 = ii0olI1ooOiO.I000oI1ioi((List) unsafe.getObject(ii00ooVar2, j));
/* 789 */                       if (size2 > 0) {
/* 793 */                           iI00000oOI9 = ii0I1Il.I00000oOI(i9 << 3);
/* 580 */                           iI001lllioOl = OooioIOo1.I001lIiIIo1O(size2, iI00000oOI9, size2, iI001lllioOl);
                                    break;
                                } else {
                                    break;
                                }
                            case 39:
/* 765 */                       size2 = ii0olI1ooOiO.I000OiO((List) unsafe.getObject(ii00ooVar2, j));
/* 769 */                       if (size2 > 0) {
/* 773 */                           iI00000oOI9 = ii0I1Il.I00000oOI(i9 << 3);
/* 580 */                           iI001lllioOl = OooioIOo1.I001lIiIIo1O(size2, iI00000oOI9, size2, iI001lllioOl);
                                    break;
                                } else {
                                    break;
                                }
                            case 40:
/* 740 */                       List list14 = (List) unsafe.getObject(ii00ooVar2, j);
/* 742 */                       i1i0olI i1i0oli15 = ii0olI1ooOiO.I00000oIO;
/* 748 */                       size2 = list14.size() * 8;
/* 749 */                       if (size2 > 0) {
/* 753 */                           iI00000oOI9 = ii0I1Il.I00000oOI(i9 << 3);
/* 580 */                           iI001lllioOl = OooioIOo1.I001lIiIIo1O(size2, iI00000oOI9, size2, iI001lllioOl);
                                    break;
                                } else {
                                    break;
                                }
                            case 41:
/* 718 */                       List list15 = (List) unsafe.getObject(ii00ooVar2, j);
/* 720 */                       i1i0olI i1i0oli16 = ii0olI1ooOiO.I00000oIO;
/* 726 */                       size3 = list15.size() * 4;
/* 727 */                       if (size3 > 0) {
/* 731 */                           iI00000oOI10 = ii0I1Il.I00000oOI(i9 << 3);
/* 648 */                           iI001lllioOl = OooioIOo1.I001lIiIIo1O(size3, iI00000oOI10, size3, iI001lllioOl);
                                    break;
                                } else {
                                    break;
                                }
                            case 42:
/* 696 */                       List list16 = (List) unsafe.getObject(ii00ooVar2, j);
/* 698 */                       i1i0olI i1i0oli17 = ii0olI1ooOiO.I00000oIO;
/* 700 */                       size2 = list16.size();
/* 704 */                       if (size2 > 0) {
/* 708 */                           iI00000oOI9 = ii0I1Il.I00000oOI(i9 << 3);
/* 580 */                           iI001lllioOl = OooioIOo1.I001lIiIIo1O(size2, iI00000oOI9, size2, iI001lllioOl);
                                    break;
                                } else {
                                    break;
                                }
                            case 43:
/* 679 */                       size2 = ii0olI1ooOiO.I000o00OoI0I((List) unsafe.getObject(ii00ooVar2, j));
/* 683 */                       if (size2 > 0) {
/* 687 */                           iI00000oOI9 = ii0I1Il.I00000oOI(i9 << 3);
/* 580 */                           iI001lllioOl = OooioIOo1.I001lIiIIo1O(size2, iI00000oOI9, size2, iI001lllioOl);
                                    break;
                                } else {
                                    break;
                                }
                            case 44:
/* 660 */                       size2 = ii0olI1ooOiO.I000II((List) unsafe.getObject(ii00ooVar2, j));
/* 664 */                       if (size2 > 0) {
/* 668 */                           iI00000oOI9 = ii0I1Il.I00000oOI(i9 << 3);
/* 580 */                           iI001lllioOl = OooioIOo1.I001lIiIIo1O(size2, iI00000oOI9, size2, iI001lllioOl);
                                    break;
                                } else {
                                    break;
                                }
                            case BuildConfig.VERSION_CODE:
/* 631 */                       List list17 = (List) unsafe.getObject(ii00ooVar2, j);
/* 633 */                       i1i0olI i1i0oli18 = ii0olI1ooOiO.I00000oIO;
/* 639 */                       size3 = list17.size() * 4;
/* 640 */                       if (size3 > 0) {
/* 644 */                           iI00000oOI10 = ii0I1Il.I00000oOI(i9 << 3);
/* 648 */                           iI001lllioOl = OooioIOo1.I001lIiIIo1O(size3, iI00000oOI10, size3, iI001lllioOl);
                                    break;
                                } else {
                                    break;
                                }
                            case 46:
/* 609 */                       List list18 = (List) unsafe.getObject(ii00ooVar2, j);
/* 611 */                       i1i0olI i1i0oli19 = ii0olI1ooOiO.I00000oIO;
/* 617 */                       size2 = list18.size() * 8;
/* 618 */                       if (size2 > 0) {
/* 622 */                           iI00000oOI9 = ii0I1Il.I00000oOI(i9 << 3);
/* 580 */                           iI001lllioOl = OooioIOo1.I001lIiIIo1O(size2, iI00000oOI9, size2, iI001lllioOl);
                                    break;
                                } else {
                                    break;
                                }
                            case 47:
/* 592 */                       size2 = ii0olI1ooOiO.I000l1((List) unsafe.getObject(ii00ooVar2, j));
/* 596 */                       if (size2 > 0) {
/* 600 */                           iI00000oOI9 = ii0I1Il.I00000oOI(i9 << 3);
/* 580 */                           iI001lllioOl = OooioIOo1.I001lIiIIo1O(size2, iI00000oOI9, size2, iI001lllioOl);
                                    break;
                                } else {
                                    break;
                                }
                            case 48:
/* 568 */                       size2 = ii0olI1ooOiO.I000lI((List) unsafe.getObject(ii00ooVar2, j));
/* 572 */                       if (size2 > 0) {
/* 576 */                           iI00000oOI9 = ii0I1Il.I00000oOI(i9 << 3);
/* 580 */                           iI001lllioOl = OooioIOo1.I001lIiIIo1O(size2, iI00000oOI9, size2, iI001lllioOl);
                                    break;
                                } else {
                                    break;
                                }
                            case 49:
/* 517 */                       List list19 = (List) unsafe.getObject(ii00ooVar2, j);
/* 519 */                       ii0oioOi00i ii0oiooi00iI00IioO0OiOi4 = ii0lol.I00IioO0OiOi(i7);
/* 523 */                       i1i0olI i1i0oli20 = ii0olI1ooOiO.I00000oIO;
/* 525 */                       int size8 = list19.size();
/* 529 */                       if (size8 == 0) {
/* 531 */                           iI00000oIO3 = 0;
                                } else {
/* 534 */                           iI00000oIO3 = 0;
/* 535 */                           for (int i20 = 0; i20 < size8; i20++) {
/* 541 */                               ii00oo ii00ooVar4 = (ii00oo) list19.get(i20);
/* 545 */                               int iI00000oOI15 = ii0I1Il.I00000oOI(i9 << 3);
/* 555 */                               iI00000oIO3 += ii00ooVar4.I00000oIO(ii0oiooi00iI00IioO0OiOi4) + iI00000oOI15 + iI00000oOI15;
                                    }
                                }
/* 559 */                       iI001lllioOl += iI00000oIO3;
                                break;
                            case 50:
/* 452 */                       ii0l1oio1O ii0l1oio1o = (ii0l1oio1O) unsafe.getObject(ii00ooVar2, j);
/* 454 */                       ii0l1l ii0l1lVar = (ii0l1l) ii0lol.I00Io1lO(i7);
/* 460 */                       if (!ii0l1oio1o.isEmpty()) {
/* 472 */                           iI00000oOI7 = 0;
/* 477 */                           for (Map.Entry entry : ii0l1oio1o.entrySet()) {
/* 485 */                               Object key = entry.getKey();
/* 489 */                               Object value = entry.getValue();
/* 493 */                               OillOo0 oillOo0 = ii0l1lVar.I00000oIO;
/* 497 */                               int iI00000oOI16 = ii0I1Il.I00000oOI(i9 << 3);
/* 501 */                               int iI00000oIO5 = ii0l1l.I00000oIO(oillOo0, key, value);
/* 505 */                               iI00000oOI7 = OooioIOo1.I001lIiIIo1O(iI00000oIO5, iI00000oIO5, iI00000oOI16, iI00000oOI7);
                                    }
                                }
/* 510 */                       iI001lllioOl += iI00000oOI7;
                                break;
                            case 51:
/* 440 */                       if (ii0lol.I001iOo1i0O(ii00ooVar2, i9, i7)) {
/* 176 */                           iI001lllioOl = OooioIOo1.I001lllioOl(i9 << 3, 8, iI001lllioOl);
                                    break;
                                } else {
                                    break;
                                }
                            case 52:
/* 432 */                       if (!ii0lol.I001iOo1i0O(ii00ooVar2, i9, i7)) {
                                    break;
                                }
/* 188 */                       iI001lloI = i9 << 3;
/* 162 */                       iI001lllioOl = OooioIOo1.I001lllioOl(iI001lloI, iI00000oOI13, iI001lllioOl);
                                break;
                            case 53:
/* 410 */                       if (ii0lol.I001iOo1i0O(ii00ooVar2, i9, i7)) {
/* 414 */                           long jI00IO1oi11O = I00IO1oi11O(j, ii00ooVar2);
/* 418 */                           iI00000oOI11 = ii0I1Il.I00000oOI(i9 << 3);
/* 422 */                           iI0000Il00O2 = ii0I1Il.I0000Il00O(jI00IO1oi11O);
/* 138 */                           iI001lllioOl += iI0000Il00O2 + iI00000oOI11;
                                    break;
                                } else {
                                    break;
                                }
                            case 54:
/* 388 */                       if (ii0lol.I001iOo1i0O(ii00ooVar2, i9, i7)) {
/* 392 */                           long jI00IO1oi11O2 = I00IO1oi11O(j, ii00ooVar2);
/* 396 */                           iI00000oOI11 = ii0I1Il.I00000oOI(i9 << 3);
/* 400 */                           iI0000Il00O2 = ii0I1Il.I0000Il00O(jI00IO1oi11O2);
/* 138 */                           iI001lllioOl += iI0000Il00O2 + iI00000oOI11;
                                    break;
                                } else {
                                    break;
                                }
                            case 55:
/* 365 */                       if (ii0lol.I001iOo1i0O(ii00ooVar2, i9, i7)) {
/* 369 */                           long jI001lloI = I001lloI(j, ii00ooVar2);
/* 374 */                           iI00000oOI11 = ii0I1Il.I00000oOI(i9 << 3);
/* 378 */                           iI0000Il00O2 = ii0I1Il.I0000Il00O(jI001lloI);
/* 138 */                           iI001lllioOl += iI0000Il00O2 + iI00000oOI11;
                                    break;
                                } else {
                                    break;
                                }
                            case 56:
/* 357 */                       if (!ii0lol.I001iOo1i0O(ii00ooVar2, i9, i7)) {
                                    break;
                                }
                                break;
                            case 57:
/* 349 */                       if (!ii0lol.I001iOo1i0O(ii00ooVar2, i9, i7)) {
                                    break;
                                }
/* 188 */                       iI001lloI = i9 << 3;
/* 162 */                       iI001lllioOl = OooioIOo1.I001lllioOl(iI001lloI, iI00000oOI13, iI001lllioOl);
                                break;
                            case 58:
/* 335 */                       if (ii0lol.I001iOo1i0O(ii00ooVar2, i9, i7)) {
/* 339 */                           iI001lllioOl = OooioIOo1.I001lllioOl(i9 << 3, 1, iI001lllioOl);
                                    break;
                                } else {
                                    break;
                                }
                            case 59:
/* 296 */                       if (ii0lol.I001iOo1i0O(ii00ooVar2, i9, i7)) {
/* 298 */                           int i21 = i9 << 3;
/* 300 */                           Object object3 = unsafe.getObject(ii00ooVar2, j);
/* 306 */                           if (object3 instanceof ii01lO0l11ii) {
/* 310 */                               iI00000oOI12 = ii0I1Il.I00000oOI(i21);
/* 314 */                               iI0001Ioi1lo2 = ((ii01lO0l11ii) object3).I0001Ioi1lo();
/* 252 */                               iI001lllioOl = OooioIOo1.I001lIiIIo1O(iI0001Ioi1lo2, iI0001Ioi1lo2, iI00000oOI12, iI001lllioOl);
                                        break;
                                    } else {
/* 321 */                               iI00000oOI11 = ii0I1Il.I00000oOI(i21);
/* 325 */                               iI0000Il00O2 = ii0I1Il.I00000oIO((String) object3);
/* 138 */                               iI001lllioOl += iI0000Il00O2 + iI00000oOI11;
                                        break;
                                    }
                                } else {
                                    break;
                                }
                            case 60:
/* 262 */                       if (ii0lol.I001iOo1i0O(ii00ooVar2, i9, i7)) {
/* 264 */                           Object object4 = unsafe.getObject(ii00ooVar2, j);
/* 268 */                           ii0oioOi00i ii0oiooi00iI00IioO0OiOi5 = ii0lol.I00IioO0OiOi(i7);
/* 272 */                           i1i0olI i1i0oli21 = ii0olI1ooOiO.I00000oIO;
/* 278 */                           iI00000oOI3 = ii0I1Il.I00000oOI(i9 << 3);
/* 282 */                           iI00000oIO = ((ii00oo) object4).I00000oIO(ii0oiooi00iI00IioO0OiOi5);
/* 286 */                           iI001lllioOl = OooioIOo1.I001lIiIIo1O(iI00000oIO, iI00000oIO, iI00000oOI3, iI001lllioOl);
                                    break;
                                } else {
                                    break;
                                }
                            case 61:
/* 234 */                       if (ii0lol.I001iOo1i0O(ii00ooVar2, i9, i7)) {
/* 242 */                           ii01lO0l11ii ii01lo0l11ii2 = (ii01lO0l11ii) unsafe.getObject(ii00ooVar2, j);
/* 244 */                           iI00000oOI12 = ii0I1Il.I00000oOI(i9 << 3);
/* 248 */                           iI0001Ioi1lo2 = ii01lo0l11ii2.I0001Ioi1lo();
/* 252 */                           iI001lllioOl = OooioIOo1.I001lIiIIo1O(iI0001Ioi1lo2, iI0001Ioi1lo2, iI00000oOI12, iI001lllioOl);
                                    break;
                                } else {
                                    break;
                                }
                            case 62:
/* 217 */                       if (ii0lol.I001iOo1i0O(ii00ooVar2, i9, i7)) {
/* 221 */                           iI001lloI = I001lloI(j, ii00ooVar2);
/* 225 */                           iI00000oOI13 = ii0I1Il.I00000oOI(i9 << 3);
/* 162 */                           iI001lllioOl = OooioIOo1.I001lllioOl(iI001lloI, iI00000oOI13, iI001lllioOl);
                                    break;
                                } else {
                                    break;
                                }
                            case 63:
/* 195 */                       if (ii0lol.I001iOo1i0O(ii00ooVar2, i9, i7)) {
/* 199 */                           long jI001lloI2 = I001lloI(j, ii00ooVar2);
/* 204 */                           iI00000oOI11 = ii0I1Il.I00000oOI(i9 << 3);
/* 208 */                           iI0000Il00O2 = ii0I1Il.I0000Il00O(jI001lloI2);
/* 138 */                           iI001lllioOl += iI0000Il00O2 + iI00000oOI11;
                                    break;
                                } else {
                                    break;
                                }
                            case Barcode.FORMAT_EAN_8:
/* 186 */                       if (!ii0lol.I001iOo1i0O(ii00ooVar2, i9, i7)) {
                                    break;
                                }
/* 188 */                       iI001lloI = i9 << 3;
/* 162 */                       iI001lllioOl = OooioIOo1.I001lllioOl(iI001lloI, iI00000oOI13, iI001lllioOl);
                                break;
                            case 65:
/* 172 */                       if (!ii0lol.I001iOo1i0O(ii00ooVar2, i9, i7)) {
                                    break;
                                }
                                break;
                            case 66:
/* 145 */                       if (ii0lol.I001iOo1i0O(ii00ooVar2, i9, i7)) {
/* 149 */                           int iI001lloI2 = I001lloI(j, ii00ooVar2);
/* 157 */                           iI00000oOI13 = ii0I1Il.I00000oOI(i9 << 3);
/* 161 */                           iI001lloI = (iI001lloI2 >> 31) ^ (iI001lloI2 + iI001lloI2);
/* 162 */                           iI001lllioOl = OooioIOo1.I001lllioOl(iI001lloI, iI00000oOI13, iI001lllioOl);
                                    break;
                                } else {
                                    break;
                                }
                            case 67:
/* 116 */                       if (ii0lol.I001iOo1i0O(ii00ooVar2, i9, i7)) {
/* 120 */                           long jI00IO1oi11O3 = I00IO1oi11O(j, ii00ooVar2);
/* 128 */                           iI00000oOI11 = ii0I1Il.I00000oOI(i9 << 3);
/* 133 */                           iI0000Il00O2 = ii0I1Il.I0000Il00O((jI00IO1oi11O3 >> 63) ^ (jI00IO1oi11O3 + jI00IO1oi11O3));
/* 138 */                           iI001lllioOl += iI0000Il00O2 + iI00000oOI11;
                                    break;
                                } else {
                                    break;
                                }
                            case 68:
/* 85 */                        if (ii0lol.I001iOo1i0O(ii00ooVar2, i9, i7)) {
/* 91 */                            ii00oo ii00ooVar5 = (ii00oo) unsafe.getObject(ii00ooVar2, j);
/* 93 */                            ii0oioOi00i ii0oiooi00iI00IioO0OiOi6 = ii0lol.I00IioO0OiOi(i7);
/* 99 */                            int iI00000oOI17 = ii0I1Il.I00000oOI(i9 << 3);
/* 103 */                           i4 = iI00000oOI17 + iI00000oOI17;
/* 104 */                           iI00000oIO2 = ii00ooVar5.I00000oIO(ii0oiooi00iI00IioO0OiOi6);
/* 108 */                           iI000OOo1O = iI00000oIO2 + i4;
/* 109 */                           iI001lllioOl += iI000OOo1O;
                                    break;
                                } else {
                                    break;
                                }
                        }
/* 1741 */              i7 += 3;
/* 1743 */              ii00ooVar2 = ii00ooVar;
/* 1745 */              i5 = 1048575;
                    }
/* 1760 */          int iI00000oIO6 = ((ii0OoOo10) ii00ooVar).zzc.I00000oIO() + iI001lllioOl;
/* 1763 */          if (ii0lol.I0001Ioi1lo) {
/* 1771 */              ii0oll0il ii0oll0ilVar = ((ii0Oi0OiillI) ii00ooVar).zzb.I00000oIO;
/* 1776 */              if (ii0oll0ilVar.I00iiI > 0) {
/* 1818 */                  throw null;
                        }
/* 1782 */              Iterator it = ii0oll0ilVar.I00000oIO().iterator();
/* 1790 */              if (it.hasNext()) {
/* 1797 */                  Map.Entry entry2 = (Map.Entry) it.next();
/* 1805 */                  entry2.getValue();
/* 1808 */                  throw null;
                        }
                    }
/* 1819 */          return iI00000oIO6;
                }

                public final Object I000OiO(int i, Object obj) {
/* 1 */             ii0oioOi00i ii0oiooi00iI00IioO0OiOi = I00IioO0OiOi(i);
/* 12 */            int iI00IO1 = I00IO1(i) & 1048575;
/* 17 */            if (!I001IO000(i, obj)) {
/* 19 */                return ii0oiooi00iI00IioO0OiOi.zze();
                    }
/* 27 */            Object object = I000o00OoI0I.getObject(obj, iI00IO1);
/* 35 */            if (I001i1lo1io(object)) {
/* 37 */                return object;
                    }
/* 38 */            Object objZze = ii0oiooi00iI00IioO0OiOi.zze();
/* 42 */            if (object != null) {
/* 44 */                ii0oiooi00iI00IioO0OiOi.I00000oOI(objZze, object);
                    }
/* 106 */           return objZze;
                }

                public final Object I000iOII(Object obj, int i, int i2) {
/* 1 */             ii0oioOi00i ii0oiooi00iI00IioO0OiOi = I00IioO0OiOi(i2);
/* 9 */             if (!I001iOo1i0O(obj, i, i2)) {
/* 11 */                return ii0oiooi00iI00IioO0OiOi.zze();
                    }
/* 27 */            Object object = I000o00OoI0I.getObject(obj, I00IO1(i2) & 1048575);
/* 35 */            if (I001i1lo1io(object)) {
/* 37 */                return object;
                    }
/* 38 */            Object objZze = ii0oiooi00iI00IioO0OiOi.zze();
/* 42 */            if (object != null) {
/* 44 */                ii0oiooi00iI00IioO0OiOi.I00000oOI(objZze, object);
                    }
/* 98 */            return objZze;
                }

                public final void I000o00OoI0I(int i, Object obj, Object obj2) {
/* 5 */             if (I001IO000(i, obj2)) {
/* 15 */                long jI00IO1 = I00IO1(i) & 1048575;
/* 17 */                Unsafe unsafe = I000o00OoI0I;
/* 19 */                Object object = unsafe.getObject(obj2, jI00IO1);
/* 23 */                if (object == null) {
/* 100 */                   I000II.I001IO000(IlIi0I0.I000OiO(this.I00000oIO[i], "Source subfield ", " is present but null: ", obj2.toString()));
/* 408 */                   return;
                        }
/* 25 */                ii0oioOi00i ii0oiooi00iI00IioO0OiOi = I00IioO0OiOi(i);
/* 33 */                if (!I001IO000(i, obj)) {
/* 39 */                    if (I001i1lo1io(object)) {
/* 45 */                        Object objZze = ii0oiooi00iI00IioO0OiOi.zze();
/* 49 */                        ii0oiooi00iI00IioO0OiOi.I00000oOI(objZze, object);
/* 52 */                        unsafe.putObject(obj, jI00IO1, objZze);
                            } else {
/* 41 */                        unsafe.putObject(obj, jI00IO1, object);
                            }
/* 55 */                    I00100o1O0lo(i, obj);
/* 58 */                    return;
                        }
/* 59 */                Object object2 = unsafe.getObject(obj, jI00IO1);
/* 67 */                if (!I001i1lo1io(object2)) {
/* 69 */                    Object objZze2 = ii0oiooi00iI00IioO0OiOi.zze();
/* 73 */                    ii0oiooi00iI00IioO0OiOi.I00000oOI(objZze2, object2);
/* 76 */                    unsafe.putObject(obj, jI00IO1, objZze2);
/* 79 */                    object2 = objZze2;
                        }
/* 80 */                ii0oiooi00iI00IioO0OiOi.I00000oOI(object2, object);
                    }
                }

                public final void I000oI1ioi(int i, Object obj, Object obj2) {
/* 1 */             int[] iArr = this.I00000oIO;
/* 3 */             int i2 = iArr[i];
/* 9 */             if (I001iOo1i0O(obj2, i2, i)) {
/* 19 */                long jI00IO1 = I00IO1(i) & 1048575;
/* 21 */                Unsafe unsafe = I000o00OoI0I;
/* 23 */                Object object = unsafe.getObject(obj2, jI00IO1);
/* 27 */                if (object == null) {
/* 102 */                   I000II.I001IO000(IlIi0I0.I000OiO(iArr[i], "Source subfield ", " is present but null: ", obj2.toString()));
/* 408 */                   return;
                        }
/* 29 */                ii0oioOi00i ii0oiooi00iI00IioO0OiOi = I00IioO0OiOi(i);
/* 37 */                if (!I001iOo1i0O(obj, i2, i)) {
/* 43 */                    if (I001i1lo1io(object)) {
/* 49 */                        Object objZze = ii0oiooi00iI00IioO0OiOi.zze();
/* 53 */                        ii0oiooi00iI00IioO0OiOi.I00000oOI(objZze, object);
/* 56 */                        unsafe.putObject(obj, jI00IO1, objZze);
                            } else {
/* 45 */                        unsafe.putObject(obj, jI00IO1, object);
                            }
/* 59 */                    I0010I0i(obj, i2, i);
/* 62 */                    return;
                        }
/* 63 */                Object object2 = unsafe.getObject(obj, jI00IO1);
/* 71 */                if (!I001i1lo1io(object2)) {
/* 73 */                    Object objZze2 = ii0oiooi00iI00IioO0OiOi.zze();
/* 77 */                    ii0oiooi00iI00IioO0OiOi.I00000oOI(objZze2, object2);
/* 80 */                    unsafe.putObject(obj, jI00IO1, objZze2);
/* 83 */                    object2 = objZze2;
                        }
/* 84 */                ii0oiooi00iI00IioO0OiOi.I00000oOI(object2, object);
                    }
                }

                public final void I00100l0(int i, IOOOi1 iOOOi1, Object obj) {
/* 3 */             IOOOI0 ioooi0 = (IOOOI0) iOOOi1.I0000oI00;
/* 16 */            long j = i & 1048575;
/* 19 */            if ((536870912 & i) != 0) {
/* 21 */                iOOOi1.I01Io001O(2);
/* 28 */                ii10Oo1I0.I000iOII(obj, j, ioooi0.I00iiI());
                    } else if (!this.I000II) {
/* 51 */                ii10Oo1I0.I000iOII(obj, j, iOOOi1.I01O10iIoo1O());
                    } else {
/* 36 */                iOOOi1.I01Io001O(2);
/* 43 */                ii10Oo1I0.I000iOII(obj, j, ioooi0.I00iOIl());
                    }
                }

                public final void I00100o1O0lo(int i, Object obj) {
/* 5 */             int i2 = this.I00000oIO[i + 2];
/* 10 */            long j = 1048575 & i2;
/* 17 */            if (j == 1048575) {
/* 19 */                return;
                    }
/* 30 */            ii10Oo1I0.I000OOo1O(obj, j, (1 << (i2 >>> 20)) | ii10Oo1I0.I0000oI00(obj, j));
                }

                public final void I0010I0i(Object obj, int i, int i2) {
/* 12 */            ii10Oo1I0.I000OOo1O(obj, this.I00000oIO[i2 + 2] & 1048575, i);
                }

                public final void I0010o(int i, Object obj, Object obj2) {
/* 12 */            I000o00OoI0I.putObject(obj, I00IO1(i) & 1048575, obj2);
/* 15 */            I00100o1O0lo(i, obj);
                }

                public final void I00111O(Object obj, int i, int i2, Object obj2) {
/* 12 */            I000o00OoI0I.putObject(obj, I00IO1(i2) & 1048575, obj2);
/* 15 */            I0010I0i(obj, i, i2);
                }

                public final boolean I001IIilI0O(ii0OoOo10 ii0oooo10, ii0OoOo10 ii0oooo102, int i) {
                    return I001IO000(i, ii0oooo10) == I001IO000(i, ii0oooo102);
                }

                public final boolean I001IO000(int i, Object obj) {
/* 5 */             int i2 = this.I00000oIO[i + 2];
/* 10 */            long j = i2 & 1048575;
/* 20 */            if (j != 1048575) {
                        return ((1 << (i2 >>> 20)) & ii10Oo1I0.I0000oI00(obj, j)) != 0;
                    }
/* 22 */            int iI00IO1 = I00IO1(i);
/* 26 */            long j2 = iI00IO1 & 1048575;
                    switch (I00II0oii1o(iI00IO1)) {
                        case 0:
/* 232 */                   if (Double.doubleToRawLongBits(ii10Oo1I0.I0000Il00O.I0010I0i(obj, j2)) != 0) {
                            }
                            break;
                        case 1:
/* 217 */                   if (Float.floatToRawIntBits(ii10Oo1I0.I0000Il00O.I001IIilI0O(obj, j2)) != 0) {
                            }
                            break;
                        case 2:
/* 204 */                   if (ii10Oo1I0.I0001Ioi1lo(obj, j2) != 0) {
                            }
                            break;
                        case 3:
/* 195 */                   if (ii10Oo1I0.I0001Ioi1lo(obj, j2) != 0) {
                            }
                            break;
                        case 4:
/* 186 */                   if (ii10Oo1I0.I0000oI00(obj, j2) != 0) {
                            }
                            break;
                        case 5:
/* 179 */                   if (ii10Oo1I0.I0001Ioi1lo(obj, j2) != 0) {
                            }
                            break;
                        case 6:
/* 170 */                   if (ii10Oo1I0.I0000oI00(obj, j2) != 0) {
                            }
                            break;
                        case 7:
                            break;
                        case 8:
/* 124 */                   Object objI000II = ii10Oo1I0.I000II(obj, j2);
/* 130 */                   if (!(objI000II instanceof String)) {
/* 144 */                       if (!(objI000II instanceof ii01lO0l11ii)) {
/* 155 */                           OIiilo1Ool0o.I00100o1O0lo();
                                    break;
                                } else if (!ii01lO0l11ii.I00iiI.equals(objI000II)) {
                                }
                            } else if (!((String) objI000II).isEmpty()) {
                            }
                            break;
                        case 9:
/* 120 */                   if (ii10Oo1I0.I000II(obj, j2) != null) {
                            }
                            break;
                        case 10:
/* 112 */                   if (!ii01lO0l11ii.I00iiI.equals(ii10Oo1I0.I000II(obj, j2))) {
                            }
                            break;
                        case 11:
/* 98 */                    if (ii10Oo1I0.I0000oI00(obj, j2) != 0) {
                            }
                            break;
                        case 12:
/* 90 */                    if (ii10Oo1I0.I0000oI00(obj, j2) != 0) {
                            }
                            break;
                        case 13:
/* 82 */                    if (ii10Oo1I0.I0000oI00(obj, j2) != 0) {
                            }
                            break;
                        case 14:
/* 74 */                    if (ii10Oo1I0.I0001Ioi1lo(obj, j2) != 0) {
                            }
                            break;
                        case 15:
/* 64 */                    if (ii10Oo1I0.I0000oI00(obj, j2) != 0) {
                            }
                            break;
                        case 16:
/* 56 */                    if (ii10Oo1I0.I0001Ioi1lo(obj, j2) != 0) {
                            }
                            break;
                        case 17:
/* 46 */                    if (ii10Oo1I0.I000II(obj, j2) != null) {
                            }
                            break;
                        default:
/* 38 */                    OIiilo1Ool0o.I00100o1O0lo();
                            break;
                    }
/* 18 */            return false;
                }

                public final boolean I001i1O0Ol(Object obj, int i, int i2, int i3, int i4) {
                    return i2 == 1048575 ? I001IO000(i, obj) : (i3 & i4) != 0;
                }

                public final boolean I001iOo1i0O(Object obj, int i, int i2) {
                    return ii10Oo1I0.I0000oI00(obj, (long) (this.I00000oIO[i2 + 2] & 1048575)) == i;
                }

                /*  JADX ERROR: Type inference failed
                    jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
                    	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                    	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                    	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
                    */
                public final int I001lIiIIo1O(java.lang.Object r40, byte[] r41, int r42, int r43, int r44, p000.i111i0I1 r45) throws p000.ii0iI11ol {
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
                        Method dump skipped, instructions count: 3624
                        To view this dump change 'Code comments level' option to 'DEBUG'
                    */
                    throw new UnsupportedOperationException("Method not decompiled: p000.ii0lOl.I001lIiIIo1O(java.lang.Object, byte[], int, int, int, i111i0I1):int");
                }

                public final int I00II0Ol1O0l(int i, int i2) {
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

                public final int I00IO1(int i) {
/* 5 */             return this.I00000oIO[i + 1];
                }

                public final ii0i10o I00IOO(int i) {
/* 1 */             int i2 = i / 3;
/* 10 */            return (ii0i10o) this.I00000oOI[i2 + i2 + 1];
                }

                public final ii0oioOi00i I00IioO0OiOi(int i) {
/* 1 */             Object[] objArr = this.I00000oOI;
/* 3 */             int i2 = i / 3;
/* 5 */             int i3 = i2 + i2;
/* 8 */             ii0oioOi00i ii0oiooi00i = (ii0oioOi00i) objArr[i3];
/* 10 */            if (ii0oiooi00i != null) {
/* 12 */                return ii0oiooi00i;
                    }
/* 21 */            ii0oioOi00i ii0oiooi00iI00000oIO = ii0oIOiIl.I0000Il00O.I00000oIO((Class) objArr[i3 + 1]);
/* 25 */            objArr[i3] = ii0oiooi00iI00000oIO;
/* 29 */            return ii0oiooi00iI00000oIO;
                }

                public final Object I00IlilI0i0i(Object obj, int i, Object obj2, i1i0olI i1i0oli, Object obj3) {
                    ii0i10o ii0i10oVarI00IOO;
/* 3 */             int i2 = this.I00000oIO[i];
/* 14 */            Object objI000II = ii10Oo1I0.I000II(obj, I00IO1(i) & 1048575);
/* 18 */            if (objI000II == null || (ii0i10oVarI00IOO = I00IOO(i)) == null) {
/* 27 */                return obj2;
                    }
/* 36 */            OillOo0 oillOo0 = ((ii0l1l) I00Io1lO(i)).I00000oIO;
/* 42 */            Iterator it = ((ii0l1oio1O) objI000II).entrySet().iterator();
/* 50 */            while (it.hasNext()) {
/* 56 */                Map.Entry entry = (Map.Entry) it.next();
/* 72 */                if (!ii0i10oVarI00IOO.zza(((Integer) entry.getValue()).intValue())) {
/* 74 */                    if (obj2 == null) {
/* 76 */                        i1i0oli.getClass();
/* 79 */                        obj2 = i1i0olI.I0010I0i(obj3);
                            }
/* 91 */                    int iI00000oIO = ii0l1l.I00000oIO(oillOo0, entry.getKey(), entry.getValue());
/* 95 */                    ii01iiOoo ii01iiooo = ii01lO0l11ii.I00iiI;
/* 97 */                    byte[] bArr = new byte[iI00000oIO];
/* 101 */                   ii01oiO ii01oio = new ii01oiO(iI00000oIO, bArr);
                            try {
/* 113 */                       ii0l1l.I0000Il00O(ii01oio, oillOo0, entry.getKey(), entry.getValue());
/* 120 */                       if (ii01oio.I001lllioOl() != 0) {
/* 146 */                           I000II.I001IO000("Did not write as much data as expected.");
/* 104 */                           return null;
                                }
/* 124 */                       ii01iiOoo ii01iiooo2 = new ii01iiOoo(bArr);
/* 127 */                       i1i0oli.getClass();
/* 137 */                       ((ii10O1i0I) obj2).I0000Il00O((i2 << 3) | 2, ii01iiooo2);
/* 140 */                       it.remove();
                            } catch (IOException e) {
/* 151 */                       IioIoO10iOiI.I000lI(e);
/* 104 */                       return null;
                            }
                        }
                    }
/* 399 */           return obj2;
                }

                public final Object I00Io1lO(int i) {
/* 1 */             int i2 = i / 3;
/* 6 */             return this.I00000oOI[i2 + i2];
                }

                @Override
                public final Object zze() {
/* 5 */             return ((ii0OoOo10) this.I0000oI00).I000II();
                }
            }

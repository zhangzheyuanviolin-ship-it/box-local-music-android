            package p000;

            import com.google.ai.edge.gallery.BuildConfig;
            import com.google.mlkit.vision.barcode.common.Barcode;
            import com.google.mlkit.vision.common.InputImage;
            import com.google.mlkit.vision.pose.PoseLandmark;
            import java.io.IOException;
            import java.lang.reflect.Field;
            import java.util.Arrays;
            import java.util.Iterator;
            import java.util.List;
            import java.util.Map;
            import sun.misc.Unsafe;
            
            public final class iI0oOI1oolI1 implements iI110OIoiOl {
                public static final int[] I000iOII = new int[0];
                public static final Unsafe I000l1 = iI1Oili0OI.I000iOII();
                public int[] I00000oIO;
                public Object[] I00000oOI;
                public int I0000Il00O;
                public int I0000O;
                public i1ilO0II I0000oI00;
                public boolean I0001Ioi1lo;
                public int[] I000II;
                public int I000O01llI0;
                public int I000OOo1O;
                public O1oO0lOoI1 I000OiO;

                public static int I00000oOI(int i) {
/* 3 */             return (i >>> 20) & 255;
                }

                public static boolean I000iOII(Object obj) {
/* 1 */             if (obj == null) {
/* 3 */                 return false;
                    }
/* 7 */             if (obj instanceof i1oi01OllI) {
/* 11 */                return ((i1oi01OllI) obj).I0001Ioi1lo();
                    }
/* 16 */            return true;
                }

                public static void I000l1(Object obj) {
/* 5 */             if (I000iOII(obj)) {
/* 7 */                 return;
                    }
/* 18 */            I000II.I000iOII("Mutating immutable message: ".concat(String.valueOf(obj)));
                }

                public static int I000lI(long j, Object obj) {
/* 7 */             return ((Integer) iI1Oili0OI.I000O01llI0(j, obj)).intValue();
                }

                public static long I000o00OoI0I(long j, Object obj) {
/* 7 */             return ((Long) iI1Oili0OI.I000O01llI0(j, obj)).longValue();
                }

                public static final int I001IO000(byte[] bArr, int i, int i2, iI1iii00l ii1iii00l, Class cls, i1O1ll0i0 i1o1ll0i0) {
/* 1 */             iI1iii00l ii1iii00l2 = iI1iii00l.I00iiO;
                    switch (ii1iii00l.ordinal()) {
                        case 0:
/* 201 */                   int i3 = i + 8;
/* 215 */                   i1o1ll0i0.I0000Il00O = Double.valueOf(Double.longBitsToDouble(liOiOioooO.I0000oI00(i, bArr)));
/* 217 */                   return i3;
                        case 1:
/* 181 */                   int i4 = i + 4;
/* 195 */                   i1o1ll0i0.I0000Il00O = Float.valueOf(Float.intBitsToFloat(liOiOioooO.I0000O(i, bArr)));
/* 197 */                   return i4;
                        case 2:
                        case 3:
/* 165 */                   int iI0000Il00O = liOiOioooO.I0000Il00O(bArr, i, i1o1ll0i0);
/* 175 */                   i1o1ll0i0.I0000Il00O = Long.valueOf(i1o1ll0i0.I00000oOI);
/* 177 */                   return iI0000Il00O;
                        case 4:
                        case 12:
                        case 13:
/* 149 */                   int iI00000oIO = liOiOioooO.I00000oIO(bArr, i, i1o1ll0i0);
/* 159 */                   i1o1ll0i0.I0000Il00O = Integer.valueOf(i1o1ll0i0.I00000oIO);
/* 161 */                   return iI00000oIO;
                        case 5:
                        case 15:
/* 133 */                   int i5 = i + 8;
/* 143 */                   i1o1ll0i0.I0000Il00O = Long.valueOf(liOiOioooO.I0000oI00(i, bArr));
/* 145 */                   return i5;
                        case 6:
                        case 14:
/* 117 */                   int i6 = i + 4;
/* 127 */                   i1o1ll0i0.I0000Il00O = Integer.valueOf(liOiOioooO.I0000O(i, bArr));
/* 129 */                   return i6;
                        case 7:
/* 92 */                    int iI0000Il00O2 = liOiOioooO.I0000Il00O(bArr, i, i1o1ll0i0);
/* 111 */                   i1o1ll0i0.I0000Il00O = Boolean.valueOf(i1o1ll0i0.I00000oOI != 0);
/* 113 */                   return iI0000Il00O2;
                        case 8:
/* 84 */                    return liOiOioooO.I0001Ioi1lo(bArr, i, i1o1ll0i0);
                        case 9:
                        default:
/* 17 */                    throw new RuntimeException("unsupported field type.");
                        case 10:
/* 59 */                    iI110OIoiOl ii110oioiolI00000oIO = iI10O00O.I0000Il00O.I00000oIO(cls);
/* 63 */                    i1oi01OllI i1oi01olliZza = ii110oioiolI00000oIO.zza();
/* 71 */                    int iI000O01llI0 = liOiOioooO.I000O01llI0(i1oi01olliZza, ii110oioiolI00000oIO, bArr, i, i2, i1o1ll0i0);
/* 75 */                    ii110oioiolI00000oIO.I0000Il00O(i1oi01olliZza);
/* 78 */                    i1o1ll0i0.I0000Il00O = i1oi01olliZza;
/* 80 */                    return iI000O01llI0;
                        case 11:
/* 52 */                    return liOiOioooO.I000II(bArr, i, i1o1ll0i0);
                        case 16:
/* 35 */                    int iI00000oIO2 = liOiOioooO.I00000oIO(bArr, i, i1o1ll0i0);
/* 49 */                    i1o1ll0i0.I0000Il00O = Integer.valueOf(IOOOIO1O.I00IlilI0i0i(i1o1ll0i0.I00000oIO));
/* 51 */                    return iI00000oIO2;
                        case 17:
/* 18 */                    int iI0000Il00O3 = liOiOioooO.I0000Il00O(bArr, i, i1o1ll0i0);
/* 32 */                    i1o1ll0i0.I0000Il00O = Long.valueOf(IOOOIO1O.I00Io1lO(i1o1ll0i0.I00000oOI));
/* 34 */                    return iI0000Il00O3;
                    }
                }

                public static Field I001i1lo1io(Class cls, String str) {
                    try {
/* 1 */                 return cls.getDeclaredField(str);
                    } catch (NoSuchFieldException e) {
/* 7 */                 Field[] declaredFields = cls.getDeclaredFields();
/* 13 */                for (Field field : declaredFields) {
/* 25 */                    if (str.equals(field.getName())) {
/* 27 */                        return field;
                            }
                        }
/* 31 */                String name = cls.getName();
/* 35 */                String string = Arrays.toString(declaredFields);
/* 67 */                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 11 + name.length() + 29 + String.valueOf(string).length());
/* 74 */                IIl001iO0Io.I001lIiIIo1O(sb, "Field ", str, " for ", name);
/* 83 */                OIiilo1Ool0o.I000iOII(IIl001iO0Io.I00100l0(sb, " not found. Known fields are ", string), e);
/* 86 */                return null;
                    }
                }

                public final int I00000oIO(int i) {
/* 5 */             return this.I00000oIO[i + 1];
                }

                /* JADX WARN: Removed duplicated region for block: B:28:0x006f  */
                @Override
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final void I0000Il00O(Object obj) {
/* 5 */             if (I000iOII(obj)) {
/* 12 */                if (obj instanceof i1oi01OllI) {
/* 15 */                    i1oi01OllI i1oi01olli = (i1oi01OllI) obj;
/* 17 */                    i1oi01olli.I000iOII();
/* 20 */                    i1oi01olli.zza = 0;
/* 22 */                    i1oi01olli.I000II();
                        }
/* 25 */                int[] iArr = this.I00000oIO;
/* 29 */                for (int i = 0; i < iArr.length; i += 3) {
/* 31 */                    int iI00000oIO = I00000oIO(i);
/* 38 */                    int i2 = 1048575 & iI00000oIO;
/* 39 */                    int iI00000oOI = I00000oOI(iI00000oIO);
                            long j = i2;
/* 46 */                    Unsafe unsafe = I000l1;
/* 48 */                    if (iI00000oOI != 9) {
/* 52 */                        if (iI00000oOI != 60 && iI00000oOI != 68) {
                                    switch (iI00000oOI) {
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
/* 83 */                                    i1io1OO01oI i1io1oo01oi = (i1io1OO01oI) ((iI00IlI1oII) iI1Oili0OI.I000O01llI0(j, obj));
/* 87 */                                    if (i1io1oo01oi.I00iOIl) {
/* 89 */                                        i1io1oo01oi.I00iOIl = false;
                                                break;
                                            } else {
                                                break;
                                            }
                                        case 50:
/* 62 */                                    Object object = unsafe.getObject(obj, j);
/* 66 */                                    if (object != null) {
/* 71 */                                        ((iI0Ol0) object).I00iOIl = false;
/* 73 */                                        unsafe.putObject(obj, j, object);
                                                break;
                                            } else {
                                                break;
                                            }
                                    }
                                } else if (I0010o(obj, iArr[i], i)) {
/* 108 */                           I001lIiIIo1O(i).I0000Il00O(unsafe.getObject(obj, j));
                                }
                            } else if (I00100o1O0lo(i, obj)) {
/* 126 */                       I001lIiIIo1O(i).I0000Il00O(unsafe.getObject(obj, j));
                            }
                        }
/* 134 */               this.I000OiO.getClass();
/* 139 */               iI1O01I1 ii1o01i1 = ((i1oi01OllI) obj).zzc;
/* 143 */               if (ii1o01i1.I0000oI00) {
/* 145 */                   ii1o01i1.I0000oI00 = false;
                        }
                    }
                }

                @Override
                public final boolean I0000O(Object obj) {
                    int i;
                    int i2;
/* 5 */             int i3 = 0;
/* 6 */             int i4 = 0;
/* 7 */             int i5 = 1048575;
/* 11 */            while (i3 < this.I000O01llI0) {
/* 15 */                int i6 = this.I000II[i3];
/* 17 */                int iI00000oIO = this.I00000oIO(i6);
/* 21 */                int[] iArr = this.I00000oIO;
/* 25 */                int i7 = iArr[i6 + 2];
/* 27 */                int i8 = i7 & 1048575;
/* 31 */                int i9 = 1 << (i7 >>> 20);
/* 33 */                if (i8 != i5) {
/* 35 */                    if (i8 != 1048575) {
/* 40 */                        i4 = I000l1.getInt(obj, i8);
                            }
/* 44 */                    i2 = i4;
/* 45 */                    i = i8;
                        } else {
/* 47 */                    i = i5;
/* 48 */                    i2 = i4;
                        }
/* 52 */                iI0oOI1oolI1 ii0ooi1ooli1 = this;
/* 53 */                Object obj2 = obj;
/* 54 */                if ((268435456 & iI00000oIO) == 0 || ii0ooi1ooli1.I00100l0(obj2, i6, i, i2, i9)) {
/* 64 */                    int iI00000oOI = I00000oOI(iI00000oIO);
/* 70 */                    if (iI00000oOI != 9 && iI00000oOI != 17) {
/* 78 */                        if (iI00000oOI != 27) {
/* 82 */                            if (iI00000oOI == 60 || iI00000oOI == 68) {
/* 175 */                               if (!ii0ooi1ooli1.I0010o(obj2, iArr[i6], i6) || ii0ooi1ooli1.I001lIiIIo1O(i6).I0000O(iI1Oili0OI.I000O01llI0(iI00000oIO & 1048575, obj2))) {
/* 259 */                                   i3++;
/* 261 */                                   this = ii0ooi1ooli1;
/* 262 */                                   obj = obj2;
/* 263 */                                   i5 = i;
/* 264 */                                   i4 = i2;
                                        }
                                    } else if (iI00000oOI != 49) {
/* 94 */                                if (iI00000oOI != 50) {
                                            continue;
                                        } else {
/* 105 */                                   iI0Ol0 ii0ol0 = (iI0Ol0) iI1Oili0OI.I000O01llI0(iI00000oIO & 1048575, obj2);
/* 111 */                                   if (!ii0ol0.isEmpty() && ((iI1iii00l) ((iI0OO101i0lO) ii0ooi1ooli1.I001lllioOl(i6)).I00000oIO.I00iiO).I00iOIl == iI1ilOliIi.I00l0I0l0lO1) {
/* 139 */                                       iI110OIoiOl ii110oioiolI00000oIO = null;
/* 144 */                                       for (Object obj3 : ii0ol0.values()) {
/* 150 */                                           if (ii110oioiolI00000oIO == null) {
/* 158 */                                               ii110oioiolI00000oIO = iI10O00O.I0000Il00O.I00000oIO(obj3.getClass());
                                                    }
/* 166 */                                           if (!ii110oioiolI00000oIO.I0000O(obj3)) {
                                                    }
                                                }
                                            }
                                        }
/* 259 */                               i3++;
/* 261 */                               this = ii0ooi1ooli1;
/* 262 */                               obj = obj2;
/* 263 */                               i5 = i;
/* 264 */                               i4 = i2;
                                    }
                                }
/* 202 */                       List list = (List) iI1Oili0OI.I000O01llI0(iI00000oIO & 1048575, obj2);
/* 208 */                       if (list.isEmpty()) {
                                    continue;
                                } else {
/* 210 */                           iI110OIoiOl ii110oioiolI001lIiIIo1O = ii0ooi1ooli1.I001lIiIIo1O(i6);
/* 219 */                           for (int i10 = 0; i10 < list.size(); i10++) {
/* 229 */                               if (ii110oioiolI001lIiIIo1O.I0000O(list.get(i10))) {
                                        }
                                    }
                                }
/* 259 */                       i3++;
/* 261 */                       this = ii0ooi1ooli1;
/* 262 */                       obj = obj2;
/* 263 */                       i5 = i;
/* 264 */                       i4 = i2;
                            } else if (!ii0ooi1ooli1.I00100l0(obj2, i6, i, i2, i9) || ii0ooi1ooli1.I001lIiIIo1O(i6).I0000O(iI1Oili0OI.I000O01llI0(iI00000oIO & 1048575, obj2))) {
/* 259 */                       i3++;
/* 261 */                       this = ii0ooi1ooli1;
/* 262 */                       obj = obj2;
/* 263 */                       i5 = i;
/* 264 */                       i4 = i2;
                            }
                        }
/* 1 */                 return false;
                    }
/* 10 */            return true;
                }

                /* JADX WARN: Removed duplicated region for block: B:197:0x04b3  */
                /* JADX WARN: Removed duplicated region for block: B:229:0x05a3  */
                /* JADX WARN: Removed duplicated region for block: B:232:0x05b1  */
                /* JADX WARN: Removed duplicated region for block: B:35:0x00ae  */
                /* JADX WARN: Removed duplicated region for block: B:38:0x00bc  */
                /* JADX WARN: Removed duplicated region for block: B:85:0x01d2  */
                @Override
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final int I0000oI00(i1ilO0II i1ilo0ii) {
                    int i;
                    int iI00000oIO;
                    int iI00000oOI;
                    int iI00000oIO2;
                    int iI00000oOI2;
                    int iI00000oIO3;
                    int iI0000Il00O;
                    int i2;
                    int iI00000oIO4;
                    int iI001l0I00;
                    int i3;
                    int iI0000Il00O2;
                    int size;
                    int iI0010o;
                    int iI00000oIO5;
                    int iI00000oIO6;
                    int iI00000oIO7;
                    int iI00000oIO8;
                    int size2;
                    int iI00000oIO9;
                    int iI0000Il00O3;
                    int iI00000oIO10;
                    int iI00000oOI3;
                    int iI00000oIO11;
                    int iI00000oOI4;
                    int iI000lI;
                    int iI00000oIO12;
/* 1 */             iI0oOI1oolI1 ii0ooi1ooli1 = this;
/* 3 */             i1ilO0II i1ilo0ii2 = i1ilo0ii;
/* 5 */             int i4 = 1048575;
/* 8 */             int i5 = 1048575;
/* 9 */             int i6 = 0;
/* 10 */            int i7 = 0;
/* 11 */            int iI001IIilI0O = 0;
                    while (true) {
/* 12 */                int[] iArr = ii0ooi1ooli1.I00000oIO;
/* 15 */                if (i6 >= iArr.length) {
/* 1734 */                  return ((i1oi01OllI) i1ilo0ii).zzc.I0000Il00O() + iI001IIilI0O;
                        }
/* 17 */                int iI00000oIO13 = ii0ooi1ooli1.I00000oIO(i6);
/* 21 */                int iI00000oOI5 = I00000oOI(iI00000oIO13);
/* 25 */                int i8 = iArr[i6];
/* 29 */                int i9 = iArr[i6 + 2];
/* 31 */                int i10 = i9 & i4;
/* 36 */                Unsafe unsafe = I000l1;
/* 38 */                if (iI00000oOI5 <= 17) {
/* 40 */                    if (i10 != i5) {
/* 47 */                        i7 = i10 == i4 ? 0 : unsafe.getInt(i1ilo0ii2, i10);
/* 52 */                        i5 = i10;
                            }
/* 55 */                    i = 1 << (i9 >>> 20);
                        } else {
/* 58 */                    i = 0;
                        }
/* 59 */                int i11 = iI00000oIO13 & i4;
/* 64 */                if (iI00000oOI5 >= i1oIO0.I00iiI.I00iOIl) {
/* 68 */                    int i12 = i1oIO0.I00iiO.I00iOIl;
                        }
                        long j = i11;
                        switch (iI00000oOI5) {
                            case 0:
/* 1709 */                      if (ii0ooi1ooli1.I00100l0(i1ilo0ii2, i6, i5, i7, i)) {
/* 1446 */                          iI001IIilI0O = OooioIOo1.I001IIilI0O(i8 << 3, 8, iI001IIilI0O);
                                    break;
                                } else {
                                    break;
                                }
                            case 1:
/* 1701 */                      if (ii0ooi1ooli1.I00100l0(i1ilo0ii2, i6, i5, i7, i)) {
/* 1460 */                          iI001IIilI0O = OooioIOo1.I001IIilI0O(i8 << 3, 4, iI001IIilI0O);
                                    break;
                                } else {
                                    break;
                                }
                            case 2:
/* 1679 */                      if (ii0ooi1ooli1.I00100l0(i1ilo0ii2, i6, i5, i7, i)) {
/* 1683 */                          long j2 = unsafe.getLong(i1ilo0ii2, j);
/* 1687 */                          iI00000oIO = i1lllO0.I00000oIO(i8 << 3);
/* 1691 */                          iI00000oOI = i1lllO0.I00000oOI(j2);
/* 1408 */                          iI001l0I00 = iI00000oOI + iI00000oIO;
/* 111 */                           iI001IIilI0O += iI001l0I00;
                                    break;
                                } else {
                                    break;
                                }
                            case 3:
/* 1657 */                      if (ii0ooi1ooli1.I00100l0(i1ilo0ii2, i6, i5, i7, i)) {
/* 1661 */                          long j3 = unsafe.getLong(i1ilo0ii2, j);
/* 1665 */                          iI00000oIO = i1lllO0.I00000oIO(i8 << 3);
/* 1669 */                          iI00000oOI = i1lllO0.I00000oOI(j3);
/* 1408 */                          iI001l0I00 = iI00000oOI + iI00000oIO;
/* 111 */                           iI001IIilI0O += iI001l0I00;
                                    break;
                                } else {
                                    break;
                                }
                            case 4:
/* 1634 */                      if (ii0ooi1ooli1.I00100l0(i1ilo0ii2, i6, i5, i7, i)) {
/* 1638 */                          long j4 = unsafe.getInt(i1ilo0ii2, j);
/* 1643 */                          iI00000oIO = i1lllO0.I00000oIO(i8 << 3);
/* 1647 */                          iI00000oOI = i1lllO0.I00000oOI(j4);
/* 1408 */                          iI001l0I00 = iI00000oOI + iI00000oIO;
/* 111 */                           iI001IIilI0O += iI001l0I00;
                                    break;
                                } else {
                                    break;
                                }
                            case 5:
/* 1626 */                      if (!ii0ooi1ooli1.I00100l0(i1ilo0ii2, i6, i5, i7, i)) {
                                    break;
                                }
                                break;
                            case 6:
/* 1618 */                      if (!ii0ooi1ooli1.I00100l0(i1ilo0ii2, i6, i5, i7, i)) {
                                    break;
                                }
                                break;
                            case 7:
/* 1605 */                      if (ii0ooi1ooli1.I00100l0(i1ilo0ii2, i6, i5, i7, i)) {
/* 1609 */                          iI001IIilI0O = OooioIOo1.I001IIilI0O(i8 << 3, 1, iI001IIilI0O);
                                    break;
                                } else {
                                    break;
                                }
                            case 8:
/* 1567 */                      if (ii0ooi1ooli1.I00100l0(i1ilo0ii2, i6, i5, i7, i)) {
/* 1569 */                          int i13 = i8 << 3;
/* 1571 */                          Object object = unsafe.getObject(i1ilo0ii2, j);
/* 1577 */                          if (object instanceof i1lIIl01O) {
/* 1581 */                              iI00000oIO2 = i1lllO0.I00000oIO(i13);
/* 1585 */                              iI00000oOI2 = ((i1lIIl01O) object).I0000O();
                                    } else {
/* 1592 */                              iI00000oIO2 = i1lllO0.I00000oIO(i13);
/* 1596 */                              iI00000oOI2 = iI1i1o0lIl1o.I00000oOI((String) object);
                                    }
/* 1527 */                          iI001IIilI0O = OooioIOo1.I001IO000(iI00000oOI2, iI00000oOI2, iI00000oIO2, iI001IIilI0O);
                                    break;
                                } else {
                                    break;
                                }
                            case 9:
/* 1537 */                      if (ii0ooi1ooli1.I00100l0(i1ilo0ii2, i6, i5, i7, i)) {
/* 1539 */                          Object object2 = unsafe.getObject(i1ilo0ii2, j);
/* 1543 */                          iI110OIoiOl ii110oioiolI001lIiIIo1O = ii0ooi1ooli1.I001lIiIIo1O(i6);
/* 1547 */                          O1oO0lOoI1 o1oO0lOoI1 = iI111lOOO.I00000oIO;
/* 1553 */                          iI00000oIO3 = i1lllO0.I00000oIO(i8 << 3);
/* 1557 */                          iI0000Il00O = ((i1ilO0II) object2).I0000Il00O(ii110oioiolI001lIiIIo1O);
/* 292 */                           iI001IIilI0O = OooioIOo1.I001IO000(iI0000Il00O, iI0000Il00O, iI00000oIO3, iI001IIilI0O);
                                    break;
                                } else {
                                    break;
                                }
                            case 10:
/* 1509 */                      if (ii0ooi1ooli1.I00100l0(i1ilo0ii2, i6, i5, i7, i)) {
/* 1517 */                          i1lIIl01O i1liil01o = (i1lIIl01O) unsafe.getObject(i1ilo0ii2, j);
/* 1519 */                          iI00000oIO2 = i1lllO0.I00000oIO(i8 << 3);
/* 1523 */                          iI00000oOI2 = i1liil01o.I0000O();
/* 1527 */                          iI001IIilI0O = OooioIOo1.I001IO000(iI00000oOI2, iI00000oOI2, iI00000oIO2, iI001IIilI0O);
                                    break;
                                } else {
                                    break;
                                }
                            case 11:
/* 1492 */                      if (ii0ooi1ooli1.I00100l0(i1ilo0ii2, i6, i5, i7, i)) {
/* 1496 */                          i2 = unsafe.getInt(i1ilo0ii2, j);
/* 1500 */                          iI00000oIO4 = i1lllO0.I00000oIO(i8 << 3);
/* 1432 */                          iI001IIilI0O = OooioIOo1.I001IIilI0O(i2, iI00000oIO4, iI001IIilI0O);
                                    break;
                                } else {
                                    break;
                                }
                            case 12:
/* 1470 */                      if (ii0ooi1ooli1.I00100l0(i1ilo0ii2, i6, i5, i7, i)) {
/* 1474 */                          long j5 = unsafe.getInt(i1ilo0ii2, j);
/* 1479 */                          iI00000oIO = i1lllO0.I00000oIO(i8 << 3);
/* 1483 */                          iI00000oOI = i1lllO0.I00000oOI(j5);
/* 1408 */                          iI001l0I00 = iI00000oOI + iI00000oIO;
/* 111 */                           iI001IIilI0O += iI001l0I00;
                                    break;
                                } else {
                                    break;
                                }
                            case 13:
/* 1456 */                      if (!ii0ooi1ooli1.I00100l0(i1ilo0ii2, i6, i5, i7, i)) {
                                    break;
                                }
                                break;
                            case 14:
/* 1442 */                      if (!ii0ooi1ooli1.I00100l0(i1ilo0ii2, i6, i5, i7, i)) {
                                    break;
                                }
                                break;
                            case 15:
/* 1415 */                      if (ii0ooi1ooli1.I00100l0(i1ilo0ii2, i6, i5, i7, i)) {
/* 1419 */                          int i14 = unsafe.getInt(i1ilo0ii2, j);
/* 1427 */                          iI00000oIO4 = i1lllO0.I00000oIO(i8 << 3);
/* 1431 */                          i2 = (i14 >> 31) ^ (i14 + i14);
/* 1432 */                          iI001IIilI0O = OooioIOo1.I001IIilI0O(i2, iI00000oIO4, iI001IIilI0O);
                                    break;
                                } else {
                                    break;
                                }
                            case 16:
/* 1388 */                      if (ii0ooi1ooli1.I00100l0(i1ilo0ii2, i6, i5, i7, i)) {
/* 1392 */                          long j6 = unsafe.getLong(i1ilo0ii2, j);
/* 1399 */                          iI00000oIO = i1lllO0.I00000oIO(i8 << 3);
/* 1404 */                          iI00000oOI = i1lllO0.I00000oOI((j6 >> 63) ^ (j6 + j6));
/* 1408 */                          iI001l0I00 = iI00000oOI + iI00000oIO;
/* 111 */                           iI001IIilI0O += iI001l0I00;
                                    break;
                                } else {
                                    break;
                                }
                            case 17:
/* 1357 */                      if (ii0ooi1ooli1.I00100l0(i1ilo0ii2, i6, i5, i7, i)) {
/* 1363 */                          i1ilO0II i1ilo0ii3 = (i1ilO0II) unsafe.getObject(i1ilo0ii2, j);
/* 1365 */                          iI110OIoiOl ii110oioiolI001lIiIIo1O2 = ii0ooi1ooli1.I001lIiIIo1O(i6);
/* 1369 */                          O1oO0lOoI1 o1oO0lOoI12 = iI111lOOO.I00000oIO;
/* 1373 */                          int iI00000oIO14 = i1lllO0.I00000oIO(i8 << 3);
/* 1377 */                          i3 = iI00000oIO14 + iI00000oIO14;
/* 1378 */                          iI0000Il00O2 = i1ilo0ii3.I0000Il00O(ii110oioiolI001lIiIIo1O2);
/* 110 */                           iI001l0I00 = iI0000Il00O2 + i3;
/* 111 */                           iI001IIilI0O += iI001l0I00;
                                    break;
                                } else {
                                    break;
                                }
                            case PoseLandmark.RIGHT_PINKY:
/* 1347 */                      iI001l0I00 = iI111lOOO.I001l0I00(i8, (List) unsafe.getObject(i1ilo0ii2, j));
/* 111 */                       iI001IIilI0O += iI001l0I00;
                                break;
                            case PoseLandmark.LEFT_INDEX:
/* 1335 */                      iI001l0I00 = iI111lOOO.I001iOo1i0O(i8, (List) unsafe.getObject(i1ilo0ii2, j));
/* 111 */                       iI001IIilI0O += iI001l0I00;
                                break;
                            case PoseLandmark.RIGHT_INDEX:
/* 1301 */                      List list = (List) unsafe.getObject(i1ilo0ii2, j);
/* 1303 */                      O1oO0lOoI1 o1oO0lOoI13 = iI111lOOO.I00000oIO;
/* 1327 */                      iI00000oIO6 = list.size() == 0 ? 0 : (i1lllO0.I00000oIO(i8 << 3) * list.size()) + iI111lOOO.I0010I0i(list);
/* 1214 */                      iI001IIilI0O += iI00000oIO6;
                                break;
                            case PoseLandmark.LEFT_THUMB:
/* 1273 */                      List list2 = (List) unsafe.getObject(i1ilo0ii2, j);
/* 1275 */                      O1oO0lOoI1 o1oO0lOoI14 = iI111lOOO.I00000oIO;
/* 1277 */                      size = list2.size();
/* 1281 */                      if (size != 0) {
/* 1287 */                          iI0010o = iI111lOOO.I0010o(list2);
/* 1291 */                          iI00000oIO5 = i1lllO0.I00000oIO(i8 << 3);
/* 892 */                           iI00000oIO7 = (iI00000oIO5 * size) + iI0010o;
/* 515 */                           iI001IIilI0O += iI00000oIO7;
                                    break;
                                }
/* 467 */                       iI00000oIO7 = 0;
/* 515 */                       iI001IIilI0O += iI00000oIO7;
                            case PoseLandmark.RIGHT_THUMB:
/* 1245 */                      List list3 = (List) unsafe.getObject(i1ilo0ii2, j);
/* 1247 */                      O1oO0lOoI1 o1oO0lOoI15 = iI111lOOO.I00000oIO;
/* 1249 */                      size = list3.size();
/* 1253 */                      if (size != 0) {
/* 1259 */                          iI0010o = iI111lOOO.I001IO000(list3);
/* 1263 */                          iI00000oIO5 = i1lllO0.I00000oIO(i8 << 3);
/* 892 */                           iI00000oIO7 = (iI00000oIO5 * size) + iI0010o;
/* 515 */                           iI001IIilI0O += iI00000oIO7;
                                    break;
                                }
/* 467 */                       iI00000oIO7 = 0;
/* 515 */                       iI001IIilI0O += iI00000oIO7;
                            case PoseLandmark.LEFT_HIP:
/* 1235 */                      iI001l0I00 = iI111lOOO.I001l0I00(i8, (List) unsafe.getObject(i1ilo0ii2, j));
/* 111 */                       iI001IIilI0O += iI001l0I00;
                                break;
                            case PoseLandmark.RIGHT_HIP:
/* 1223 */                      iI001l0I00 = iI111lOOO.I001iOo1i0O(i8, (List) unsafe.getObject(i1ilo0ii2, j));
/* 111 */                       iI001IIilI0O += iI001l0I00;
                                break;
                            case PoseLandmark.LEFT_KNEE:
/* 1194 */                      List list4 = (List) unsafe.getObject(i1ilo0ii2, j);
/* 1196 */                      O1oO0lOoI1 o1oO0lOoI16 = iI111lOOO.I00000oIO;
/* 1198 */                      int size3 = list4.size();
/* 1202 */                      if (size3 != 0) {
/* 1213 */                          iI00000oIO6 = (i1lllO0.I00000oIO(i8 << 3) + 1) * size3;
                                }
/* 1214 */                      iI001IIilI0O += iI00000oIO6;
                                break;
                            case PoseLandmark.RIGHT_KNEE:
/* 1101 */                      List list5 = (List) unsafe.getObject(i1ilo0ii2, j);
/* 1103 */                      O1oO0lOoI1 o1oO0lOoI17 = iI111lOOO.I00000oIO;
/* 1105 */                      int size4 = list5.size();
/* 1109 */                      if (size4 == 0) {
/* 467 */                           iI00000oIO7 = 0;
                                } else {
/* 1119 */                          iI00000oIO7 = i1lllO0.I00000oIO(i8 << 3) * size4;
/* 1122 */                          if (list5 instanceof iI0II1iil) {
/* 1124 */                              iI0II1iil ii0ii1iil = (iI0II1iil) list5;
/* 1127 */                              for (int i15 = 0; i15 < size4; i15++) {
/* 1129 */                                  Object objZzc = ii0ii1iil.zzc();
/* 1150 */                                  int iI0000O = objZzc instanceof i1lIIl01O ? ((i1lIIl01O) objZzc).I0000O() : iI1i1o0lIl1o.I00000oOI((String) objZzc);
/* 1143 */                                  iI00000oIO7 = OooioIOo1.I001IIilI0O(iI0000O, iI0000O, iI00000oIO7);
                                        }
                                    } else {
/* 1159 */                              for (int i16 = 0; i16 < size4; i16++) {
/* 1161 */                                  Object obj = list5.get(i16);
/* 1182 */                                  int iI0000O2 = obj instanceof i1lIIl01O ? ((i1lIIl01O) obj).I0000O() : iI1i1o0lIl1o.I00000oOI((String) obj);
/* 1175 */                                  iI00000oIO7 = OooioIOo1.I001IIilI0O(iI0000O2, iI0000O2, iI00000oIO7);
                                        }
                                    }
                                }
/* 515 */                       iI001IIilI0O += iI00000oIO7;
                                break;
                            case 27:
/* 1051 */                      List list6 = (List) unsafe.getObject(i1ilo0ii2, j);
/* 1053 */                      iI110OIoiOl ii110oioiolI001lIiIIo1O3 = ii0ooi1ooli1.I001lIiIIo1O(i6);
/* 1057 */                      O1oO0lOoI1 o1oO0lOoI18 = iI111lOOO.I00000oIO;
/* 1059 */                      int size5 = list6.size();
/* 1063 */                      if (size5 == 0) {
/* 1065 */                          iI00000oIO8 = 0;
                                } else {
/* 1073 */                          iI00000oIO8 = i1lllO0.I00000oIO(i8 << 3) * size5;
/* 1075 */                          for (int i17 = 0; i17 < size5; i17++) {
/* 1083 */                              int iI0000Il00O4 = ((i1ilO0II) list6.get(i17)).I0000Il00O(ii110oioiolI001lIiIIo1O3);
/* 1087 */                              iI00000oIO8 = OooioIOo1.I001IIilI0O(iI0000Il00O4, iI0000Il00O4, iI00000oIO8);
                                    }
                                }
/* 1094 */                      iI001IIilI0O += iI00000oIO8;
                                break;
                            case PoseLandmark.RIGHT_ANKLE:
/* 1004 */                      List list7 = (List) unsafe.getObject(i1ilo0ii2, j);
/* 1006 */                      O1oO0lOoI1 o1oO0lOoI19 = iI111lOOO.I00000oIO;
/* 1008 */                      int size6 = list7.size();
/* 1012 */                      if (size6 != 0) {
/* 1022 */                          iI00000oIO7 = i1lllO0.I00000oIO(i8 << 3) * size6;
/* 1028 */                          for (int i18 = 0; i18 < list7.size(); i18++) {
/* 1036 */                              int iI0000O3 = ((i1lIIl01O) list7.get(i18)).I0000O();
/* 1040 */                              iI00000oIO7 = OooioIOo1.I001IIilI0O(iI0000O3, iI0000O3, iI00000oIO7);
                                    }
                                }
/* 515 */                       iI001IIilI0O += iI00000oIO7;
                                break;
                            case PoseLandmark.LEFT_HEEL:
/* 977 */                       List list8 = (List) unsafe.getObject(i1ilo0ii2, j);
/* 979 */                       O1oO0lOoI1 o1oO0lOoI110 = iI111lOOO.I00000oIO;
/* 981 */                       size = list8.size();
/* 985 */                       if (size != 0) {
/* 991 */                           iI0010o = iI111lOOO.I001i1O0Ol(list8);
/* 995 */                           iI00000oIO5 = i1lllO0.I00000oIO(i8 << 3);
/* 892 */                           iI00000oIO7 = (iI00000oIO5 * size) + iI0010o;
/* 515 */                           iI001IIilI0O += iI00000oIO7;
                                    break;
                                }
/* 467 */                       iI00000oIO7 = 0;
/* 515 */                       iI001IIilI0O += iI00000oIO7;
                            case 30:
/* 950 */                       List list9 = (List) unsafe.getObject(i1ilo0ii2, j);
/* 952 */                       O1oO0lOoI1 o1oO0lOoI111 = iI111lOOO.I00000oIO;
/* 954 */                       size = list9.size();
/* 958 */                       if (size != 0) {
/* 964 */                           iI0010o = iI111lOOO.I001IIilI0O(list9);
/* 968 */                           iI00000oIO5 = i1lllO0.I00000oIO(i8 << 3);
/* 892 */                           iI00000oIO7 = (iI00000oIO5 * size) + iI0010o;
/* 515 */                           iI001IIilI0O += iI00000oIO7;
                                    break;
                                }
/* 467 */                       iI00000oIO7 = 0;
/* 515 */                       iI001IIilI0O += iI00000oIO7;
                            case PoseLandmark.LEFT_FOOT_INDEX:
/* 940 */                       iI001l0I00 = iI111lOOO.I001iOo1i0O(i8, (List) unsafe.getObject(i1ilo0ii2, j));
/* 111 */                       iI001IIilI0O += iI001l0I00;
                                break;
                            case 32:
/* 928 */                       iI001l0I00 = iI111lOOO.I001l0I00(i8, (List) unsafe.getObject(i1ilo0ii2, j));
/* 111 */                       iI001IIilI0O += iI001l0I00;
                                break;
                            case 33:
/* 899 */                       List list10 = (List) unsafe.getObject(i1ilo0ii2, j);
/* 901 */                       O1oO0lOoI1 o1oO0lOoI112 = iI111lOOO.I00000oIO;
/* 903 */                       size = list10.size();
/* 907 */                       if (size != 0) {
/* 913 */                           iI0010o = iI111lOOO.I001i1lo1io(list10);
/* 917 */                           iI00000oIO5 = i1lllO0.I00000oIO(i8 << 3);
/* 892 */                           iI00000oIO7 = (iI00000oIO5 * size) + iI0010o;
/* 515 */                           iI001IIilI0O += iI00000oIO7;
                                    break;
                                }
/* 467 */                       iI00000oIO7 = 0;
/* 515 */                       iI001IIilI0O += iI00000oIO7;
                            case 34:
/* 869 */                       List list11 = (List) unsafe.getObject(i1ilo0ii2, j);
/* 871 */                       O1oO0lOoI1 o1oO0lOoI113 = iI111lOOO.I00000oIO;
/* 873 */                       size = list11.size();
/* 877 */                       if (size != 0) {
/* 883 */                           iI0010o = iI111lOOO.I00111O(list11);
/* 887 */                           iI00000oIO5 = i1lllO0.I00000oIO(i8 << 3);
/* 892 */                           iI00000oIO7 = (iI00000oIO5 * size) + iI0010o;
/* 515 */                           iI001IIilI0O += iI00000oIO7;
                                    break;
                                }
/* 467 */                       iI00000oIO7 = 0;
/* 515 */                       iI001IIilI0O += iI00000oIO7;
                            case InputImage.IMAGE_FORMAT_YUV_420_888:
/* 846 */                       List list12 = (List) unsafe.getObject(i1ilo0ii2, j);
/* 848 */                       O1oO0lOoI1 o1oO0lOoI114 = iI111lOOO.I00000oIO;
/* 854 */                       size2 = list12.size() * 8;
/* 855 */                       if (size2 > 0) {
/* 859 */                           iI00000oIO9 = i1lllO0.I00000oIO(i8 << 3);
/* 585 */                           iI001IIilI0O = OooioIOo1.I001IO000(size2, iI00000oIO9, size2, iI001IIilI0O);
                                    break;
                                } else {
                                    break;
                                }
                            case 36:
/* 823 */                       List list13 = (List) unsafe.getObject(i1ilo0ii2, j);
/* 825 */                       O1oO0lOoI1 o1oO0lOoI115 = iI111lOOO.I00000oIO;
/* 831 */                       size2 = list13.size() * 4;
/* 832 */                       if (size2 > 0) {
/* 836 */                           iI00000oIO9 = i1lllO0.I00000oIO(i8 << 3);
/* 585 */                           iI001IIilI0O = OooioIOo1.I001IO000(size2, iI00000oIO9, size2, iI001IIilI0O);
                                    break;
                                } else {
                                    break;
                                }
                            case 37:
/* 805 */                       size2 = iI111lOOO.I0010I0i((List) unsafe.getObject(i1ilo0ii2, j));
/* 809 */                       if (size2 > 0) {
/* 813 */                           iI00000oIO9 = i1lllO0.I00000oIO(i8 << 3);
/* 585 */                           iI001IIilI0O = OooioIOo1.I001IO000(size2, iI00000oIO9, size2, iI001IIilI0O);
                                    break;
                                } else {
                                    break;
                                }
                            case 38:
/* 785 */                       size2 = iI111lOOO.I0010o((List) unsafe.getObject(i1ilo0ii2, j));
/* 789 */                       if (size2 > 0) {
/* 793 */                           iI00000oIO9 = i1lllO0.I00000oIO(i8 << 3);
/* 585 */                           iI001IIilI0O = OooioIOo1.I001IO000(size2, iI00000oIO9, size2, iI001IIilI0O);
                                    break;
                                } else {
                                    break;
                                }
                            case 39:
/* 765 */                       size2 = iI111lOOO.I001IO000((List) unsafe.getObject(i1ilo0ii2, j));
/* 769 */                       if (size2 > 0) {
/* 773 */                           iI00000oIO9 = i1lllO0.I00000oIO(i8 << 3);
/* 585 */                           iI001IIilI0O = OooioIOo1.I001IO000(size2, iI00000oIO9, size2, iI001IIilI0O);
                                    break;
                                } else {
                                    break;
                                }
                            case 40:
/* 740 */                       List list14 = (List) unsafe.getObject(i1ilo0ii2, j);
/* 742 */                       O1oO0lOoI1 o1oO0lOoI116 = iI111lOOO.I00000oIO;
/* 748 */                       size2 = list14.size() * 8;
/* 749 */                       if (size2 > 0) {
/* 753 */                           iI00000oIO9 = i1lllO0.I00000oIO(i8 << 3);
/* 585 */                           iI001IIilI0O = OooioIOo1.I001IO000(size2, iI00000oIO9, size2, iI001IIilI0O);
                                    break;
                                } else {
                                    break;
                                }
                            case 41:
/* 717 */                       List list15 = (List) unsafe.getObject(i1ilo0ii2, j);
/* 719 */                       O1oO0lOoI1 o1oO0lOoI117 = iI111lOOO.I00000oIO;
/* 725 */                       size2 = list15.size() * 4;
/* 726 */                       if (size2 > 0) {
/* 730 */                           iI00000oIO9 = i1lllO0.I00000oIO(i8 << 3);
/* 585 */                           iI001IIilI0O = OooioIOo1.I001IO000(size2, iI00000oIO9, size2, iI001IIilI0O);
                                    break;
                                } else {
                                    break;
                                }
                            case 42:
/* 696 */                       List list16 = (List) unsafe.getObject(i1ilo0ii2, j);
/* 698 */                       O1oO0lOoI1 o1oO0lOoI118 = iI111lOOO.I00000oIO;
/* 700 */                       size2 = list16.size();
/* 704 */                       if (size2 > 0) {
/* 708 */                           iI00000oIO9 = i1lllO0.I00000oIO(i8 << 3);
/* 585 */                           iI001IIilI0O = OooioIOo1.I001IO000(size2, iI00000oIO9, size2, iI001IIilI0O);
                                    break;
                                } else {
                                    break;
                                }
                            case 43:
/* 679 */                       size2 = iI111lOOO.I001i1O0Ol((List) unsafe.getObject(i1ilo0ii2, j));
/* 683 */                       if (size2 > 0) {
/* 687 */                           iI00000oIO9 = i1lllO0.I00000oIO(i8 << 3);
/* 585 */                           iI001IIilI0O = OooioIOo1.I001IO000(size2, iI00000oIO9, size2, iI001IIilI0O);
                                    break;
                                } else {
                                    break;
                                }
                            case 44:
/* 660 */                       size2 = iI111lOOO.I001IIilI0O((List) unsafe.getObject(i1ilo0ii2, j));
/* 664 */                       if (size2 > 0) {
/* 668 */                           iI00000oIO9 = i1lllO0.I00000oIO(i8 << 3);
/* 585 */                           iI001IIilI0O = OooioIOo1.I001IO000(size2, iI00000oIO9, size2, iI001IIilI0O);
                                    break;
                                } else {
                                    break;
                                }
                            case BuildConfig.VERSION_CODE:
/* 636 */                       List list17 = (List) unsafe.getObject(i1ilo0ii2, j);
/* 638 */                       O1oO0lOoI1 o1oO0lOoI119 = iI111lOOO.I00000oIO;
/* 644 */                       size2 = list17.size() * 4;
/* 645 */                       if (size2 > 0) {
/* 649 */                           iI00000oIO9 = i1lllO0.I00000oIO(i8 << 3);
/* 585 */                           iI001IIilI0O = OooioIOo1.I001IO000(size2, iI00000oIO9, size2, iI001IIilI0O);
                                    break;
                                } else {
                                    break;
                                }
                            case 46:
/* 614 */                       List list18 = (List) unsafe.getObject(i1ilo0ii2, j);
/* 616 */                       O1oO0lOoI1 o1oO0lOoI120 = iI111lOOO.I00000oIO;
/* 622 */                       size2 = list18.size() * 8;
/* 623 */                       if (size2 > 0) {
/* 627 */                           iI00000oIO9 = i1lllO0.I00000oIO(i8 << 3);
/* 585 */                           iI001IIilI0O = OooioIOo1.I001IO000(size2, iI00000oIO9, size2, iI001IIilI0O);
                                    break;
                                } else {
                                    break;
                                }
                            case 47:
/* 597 */                       size2 = iI111lOOO.I001i1lo1io((List) unsafe.getObject(i1ilo0ii2, j));
/* 601 */                       if (size2 > 0) {
/* 605 */                           iI00000oIO9 = i1lllO0.I00000oIO(i8 << 3);
/* 585 */                           iI001IIilI0O = OooioIOo1.I001IO000(size2, iI00000oIO9, size2, iI001IIilI0O);
                                    break;
                                } else {
                                    break;
                                }
                            case 48:
/* 573 */                       size2 = iI111lOOO.I00111O((List) unsafe.getObject(i1ilo0ii2, j));
/* 577 */                       if (size2 > 0) {
/* 581 */                           iI00000oIO9 = i1lllO0.I00000oIO(i8 << 3);
/* 585 */                           iI001IIilI0O = OooioIOo1.I001IO000(size2, iI00000oIO9, size2, iI001IIilI0O);
                                    break;
                                } else {
                                    break;
                                }
                            case 49:
/* 522 */                       List list19 = (List) unsafe.getObject(i1ilo0ii2, j);
/* 524 */                       iI110OIoiOl ii110oioiolI001lIiIIo1O4 = ii0ooi1ooli1.I001lIiIIo1O(i6);
/* 528 */                       O1oO0lOoI1 o1oO0lOoI121 = iI111lOOO.I00000oIO;
/* 530 */                       int size7 = list19.size();
/* 534 */                       if (size7 == 0) {
/* 536 */                           iI0000Il00O3 = 0;
                                } else {
/* 539 */                           iI0000Il00O3 = 0;
/* 540 */                           for (int i19 = 0; i19 < size7; i19++) {
/* 546 */                               i1ilO0II i1ilo0ii4 = (i1ilO0II) list19.get(i19);
/* 550 */                               int iI00000oIO15 = i1lllO0.I00000oIO(i8 << 3);
/* 560 */                               iI0000Il00O3 += i1ilo0ii4.I0000Il00O(ii110oioiolI001lIiIIo1O4) + iI00000oIO15 + iI00000oIO15;
                                    }
                                }
/* 564 */                       iI001IIilI0O += iI0000Il00O3;
                                break;
                            case 50:
/* 457 */                       iI0Ol0 ii0ol0 = (iI0Ol0) unsafe.getObject(i1ilo0ii2, j);
/* 459 */                       iI0OO101i0lO ii0oo101i0lo = (iI0OO101i0lO) ii0ooi1ooli1.I001lllioOl(i6);
/* 465 */                       if (!ii0ol0.isEmpty()) {
/* 477 */                           iI00000oIO7 = 0;
/* 482 */                           for (Map.Entry entry : ii0ol0.entrySet()) {
/* 490 */                               Object key = entry.getKey();
/* 494 */                               Object value = entry.getValue();
/* 498 */                               Oo1ol1ll oo1ol1ll = ii0oo101i0lo.I00000oIO;
/* 502 */                               int iI00000oIO16 = i1lllO0.I00000oIO(i8 << 3);
/* 506 */                               int iI0000Il00O5 = iI0OO101i0lO.I0000Il00O(oo1ol1ll, key, value);
/* 510 */                               iI00000oIO7 = OooioIOo1.I001IO000(iI0000Il00O5, iI0000Il00O5, iI00000oIO16, iI00000oIO7);
                                    }
                                }
/* 515 */                       iI001IIilI0O += iI00000oIO7;
                                break;
                            case 51:
/* 445 */                       if (ii0ooi1ooli1.I0010o(i1ilo0ii2, i8, i6)) {
/* 177 */                           iI001IIilI0O = OooioIOo1.I001IIilI0O(i8 << 3, 8, iI001IIilI0O);
                                    break;
                                } else {
                                    break;
                                }
                            case 52:
/* 437 */                       if (ii0ooi1ooli1.I0010o(i1ilo0ii2, i8, i6)) {
/* 191 */                           iI001IIilI0O = OooioIOo1.I001IIilI0O(i8 << 3, 4, iI001IIilI0O);
                                    break;
                                } else {
                                    break;
                                }
                            case 53:
/* 415 */                       if (ii0ooi1ooli1.I0010o(i1ilo0ii2, i8, i6)) {
/* 419 */                           long jI000o00OoI0I = I000o00OoI0I(j, i1ilo0ii2);
/* 423 */                           iI00000oIO10 = i1lllO0.I00000oIO(i8 << 3);
/* 427 */                           iI00000oOI3 = i1lllO0.I00000oOI(jI000o00OoI0I);
/* 139 */                           iI001IIilI0O += iI00000oOI3 + iI00000oIO10;
                                    break;
                                } else {
                                    break;
                                }
                            case 54:
/* 393 */                       if (ii0ooi1ooli1.I0010o(i1ilo0ii2, i8, i6)) {
/* 397 */                           long jI000o00OoI0I2 = I000o00OoI0I(j, i1ilo0ii2);
/* 401 */                           iI00000oIO10 = i1lllO0.I00000oIO(i8 << 3);
/* 405 */                           iI00000oOI3 = i1lllO0.I00000oOI(jI000o00OoI0I2);
/* 139 */                           iI001IIilI0O += iI00000oOI3 + iI00000oIO10;
                                    break;
                                } else {
                                    break;
                                }
                            case 55:
/* 370 */                       if (ii0ooi1ooli1.I0010o(i1ilo0ii2, i8, i6)) {
/* 374 */                           long jI000lI = I000lI(j, i1ilo0ii2);
/* 379 */                           iI00000oIO10 = i1lllO0.I00000oIO(i8 << 3);
/* 383 */                           iI00000oOI3 = i1lllO0.I00000oOI(jI000lI);
/* 139 */                           iI001IIilI0O += iI00000oOI3 + iI00000oIO10;
                                    break;
                                } else {
                                    break;
                                }
                            case 56:
/* 362 */                       if (!ii0ooi1ooli1.I0010o(i1ilo0ii2, i8, i6)) {
                                    break;
                                }
                                break;
                            case 57:
/* 354 */                       if (!ii0ooi1ooli1.I0010o(i1ilo0ii2, i8, i6)) {
                                    break;
                                }
                                break;
                            case 58:
/* 340 */                       if (ii0ooi1ooli1.I0010o(i1ilo0ii2, i8, i6)) {
/* 344 */                           iI001IIilI0O = OooioIOo1.I001IIilI0O(i8 << 3, 1, iI001IIilI0O);
                                    break;
                                } else {
                                    break;
                                }
                            case 59:
/* 302 */                       if (ii0ooi1ooli1.I0010o(i1ilo0ii2, i8, i6)) {
/* 304 */                           int i20 = i8 << 3;
/* 306 */                           Object object3 = unsafe.getObject(i1ilo0ii2, j);
/* 312 */                           if (object3 instanceof i1lIIl01O) {
/* 316 */                               iI00000oIO11 = i1lllO0.I00000oIO(i20);
/* 320 */                               iI00000oOI4 = ((i1lIIl01O) object3).I0000O();
                                    } else {
/* 327 */                               iI00000oIO11 = i1lllO0.I00000oIO(i20);
/* 331 */                               iI00000oOI4 = iI1i1o0lIl1o.I00000oOI((String) object3);
                                    }
/* 258 */                           iI001IIilI0O = OooioIOo1.I001IO000(iI00000oOI4, iI00000oOI4, iI00000oIO11, iI001IIilI0O);
                                    break;
                                } else {
                                    break;
                                }
                            case 60:
/* 268 */                       if (ii0ooi1ooli1.I0010o(i1ilo0ii2, i8, i6)) {
/* 270 */                           Object object4 = unsafe.getObject(i1ilo0ii2, j);
/* 274 */                           iI110OIoiOl ii110oioiolI001lIiIIo1O5 = ii0ooi1ooli1.I001lIiIIo1O(i6);
/* 278 */                           O1oO0lOoI1 o1oO0lOoI122 = iI111lOOO.I00000oIO;
/* 284 */                           iI00000oIO3 = i1lllO0.I00000oIO(i8 << 3);
/* 288 */                           iI0000Il00O = ((i1ilO0II) object4).I0000Il00O(ii110oioiolI001lIiIIo1O5);
/* 292 */                           iI001IIilI0O = OooioIOo1.I001IO000(iI0000Il00O, iI0000Il00O, iI00000oIO3, iI001IIilI0O);
                                    break;
                                } else {
                                    break;
                                }
                            case 61:
/* 240 */                       if (ii0ooi1ooli1.I0010o(i1ilo0ii2, i8, i6)) {
/* 248 */                           i1lIIl01O i1liil01o2 = (i1lIIl01O) unsafe.getObject(i1ilo0ii2, j);
/* 250 */                           iI00000oIO11 = i1lllO0.I00000oIO(i8 << 3);
/* 254 */                           iI00000oOI4 = i1liil01o2.I0000O();
/* 258 */                           iI001IIilI0O = OooioIOo1.I001IO000(iI00000oOI4, iI00000oOI4, iI00000oIO11, iI001IIilI0O);
                                    break;
                                } else {
                                    break;
                                }
                            case 62:
/* 223 */                       if (ii0ooi1ooli1.I0010o(i1ilo0ii2, i8, i6)) {
/* 227 */                           iI000lI = I000lI(j, i1ilo0ii2);
/* 231 */                           iI00000oIO12 = i1lllO0.I00000oIO(i8 << 3);
/* 163 */                           iI001IIilI0O = OooioIOo1.I001IIilI0O(iI000lI, iI00000oIO12, iI001IIilI0O);
                                    break;
                                } else {
                                    break;
                                }
                            case 63:
/* 201 */                       if (ii0ooi1ooli1.I0010o(i1ilo0ii2, i8, i6)) {
/* 205 */                           long jI000lI2 = I000lI(j, i1ilo0ii2);
/* 210 */                           iI00000oIO10 = i1lllO0.I00000oIO(i8 << 3);
/* 214 */                           iI00000oOI3 = i1lllO0.I00000oOI(jI000lI2);
/* 139 */                           iI001IIilI0O += iI00000oOI3 + iI00000oIO10;
                                    break;
                                } else {
                                    break;
                                }
                            case Barcode.FORMAT_EAN_8:
/* 187 */                       if (!ii0ooi1ooli1.I0010o(i1ilo0ii2, i8, i6)) {
                                    break;
                                }
                                break;
                            case 65:
/* 173 */                       if (!ii0ooi1ooli1.I0010o(i1ilo0ii2, i8, i6)) {
                                    break;
                                }
                                break;
                            case 66:
/* 146 */                       if (ii0ooi1ooli1.I0010o(i1ilo0ii2, i8, i6)) {
/* 150 */                           int iI000lI2 = I000lI(j, i1ilo0ii2);
/* 158 */                           iI00000oIO12 = i1lllO0.I00000oIO(i8 << 3);
/* 162 */                           iI000lI = (iI000lI2 >> 31) ^ (iI000lI2 + iI000lI2);
/* 163 */                           iI001IIilI0O = OooioIOo1.I001IIilI0O(iI000lI, iI00000oIO12, iI001IIilI0O);
                                    break;
                                } else {
                                    break;
                                }
                            case 67:
/* 118 */                       if (ii0ooi1ooli1.I0010o(i1ilo0ii2, i8, i6)) {
/* 122 */                           long jI000o00OoI0I3 = I000o00OoI0I(j, i1ilo0ii2);
/* 129 */                           iI00000oIO10 = i1lllO0.I00000oIO(i8 << 3);
/* 134 */                           iI00000oOI3 = i1lllO0.I00000oOI((jI000o00OoI0I3 >> 63) ^ (jI000o00OoI0I3 + jI000o00OoI0I3));
/* 139 */                           iI001IIilI0O += iI00000oOI3 + iI00000oIO10;
                                    break;
                                } else {
                                    break;
                                }
                            case 68:
/* 85 */                        if (ii0ooi1ooli1.I0010o(i1ilo0ii2, i8, i6)) {
/* 91 */                            i1ilO0II i1ilo0ii5 = (i1ilO0II) unsafe.getObject(i1ilo0ii2, j);
/* 93 */                            iI110OIoiOl ii110oioiolI001lIiIIo1O6 = ii0ooi1ooli1.I001lIiIIo1O(i6);
/* 97 */                            O1oO0lOoI1 o1oO0lOoI123 = iI111lOOO.I00000oIO;
/* 101 */                           int iI00000oIO17 = i1lllO0.I00000oIO(i8 << 3);
/* 105 */                           i3 = iI00000oIO17 + iI00000oIO17;
/* 106 */                           iI0000Il00O2 = i1ilo0ii5.I0000Il00O(ii110oioiolI001lIiIIo1O6);
/* 110 */                           iI001l0I00 = iI0000Il00O2 + i3;
/* 111 */                           iI001IIilI0O += iI001l0I00;
                                    break;
                                } else {
                                    break;
                                }
                        }
/* 1713 */              i6 += 3;
/* 1715 */              ii0ooi1ooli1 = this;
/* 1717 */              i1ilo0ii2 = i1ilo0ii;
/* 1719 */              i4 = 1048575;
                    }
                }

                /* JADX WARN: Removed duplicated region for block: B:209:0x07d5  */
                /* JADX WARN: Removed duplicated region for block: B:211:0x07e1  */
                /* JADX WARN: Removed duplicated region for block: B:217:0x07ed A[LOOP:1: B:216:0x07eb->B:217:0x07ed, LOOP_END] */
                /* JADX WARN: Removed duplicated region for block: B:219:0x07fe  */
                /* JADX WARN: Removed duplicated region for block: B:226:0x07ac A[EXC_TOP_SPLITTER, SYNTHETIC] */
                /* JADX WARN: Removed duplicated region for block: B:323:0x07bd A[SYNTHETIC] */
                /* JADX WARN: Removed duplicated region for block: B:347:? A[RETURN, SYNTHETIC] */
                @Override
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final void I0001Ioi1lo(Object obj, IOOOi1 iOOOi1, i1o0l0i i1o0l0iVar) throws Throwable {
                    Object obj2;
                    Object objI00IOO;
                    Object objI00IOO2;
                    iI0oOI1oolI1 ii0ooi1ooli1;
                    O1oO0lOoI1 o1oO0lOoI1;
                    Object obj3;
                    iI0oOI1oolI1 ii0ooi1ooli12;
                    Object objI0001Ioi1lo;
                    Object obj4;
/* 1 */             iI0oOI1oolI1 ii0ooi1ooli13 = this;
/* 10 */            IOOOIO1O ioooio1o = (IOOOIO1O) iOOOi1.I0000oI00;
/* 12 */            int[] iArr = ii0ooi1ooli13.I000II;
/* 14 */            int i = ii0ooi1ooli13.I000OOo1O;
/* 16 */            int i2 = ii0ooi1ooli13.I000O01llI0;
/* 18 */            i1o0l0iVar.getClass();
/* 21 */            I000l1(obj);
/* 24 */            O1oO0lOoI1 o1oO0lOoI12 = ii0ooi1ooli13.I000OiO;
/* 27 */            Object objI0001Ioi1lo2 = null;
                    while (true) {
                        try {
/* 28 */                    int iI01IoO = iOOOi1.I01IoO();
/* 47 */                    int iI001IIilI0O = (iI01IoO < ii0ooi1ooli13.I0000Il00O || iI01IoO > ii0ooi1ooli13.I0000O) ? -1 : ii0ooi1ooli13.I001IIilI0O(iI01IoO, 0);
/* 49 */                    if (iI001IIilI0O >= 0) {
/* 124 */                       int iI00000oIO = ii0ooi1ooli13.I00000oIO(iI001IIilI0O);
                                try {
                                    try {
                                    } catch (iI00ilIl1I unused) {
/* 151 */                               ii0ooi1ooli1 = ii0ooi1ooli13;
/* 152 */                               obj2 = objI0001Ioi1lo2;
/* 154 */                               o1oO0lOoI1 = o1oO0lOoI12;
/* 156 */                               obj3 = obj;
                                    }
                                    switch (I00000oOI(iI00000oIO)) {
                                        case 0:
/* 1911 */                                  obj2 = objI0001Ioi1lo2;
/* 1913 */                                  o1oO0lOoI1 = o1oO0lOoI12;
/* 1915 */                                  iI0oOI1oolI1 ii0ooi1ooli14 = ii0ooi1ooli13;
/* 1918 */                                  int i3 = iI00000oIO & 1048575;
                                            try {
/* 1920 */                                      iOOOi1.I011lIilI0lo(1);
/* 1932 */                                      ii0ooi1ooli1 = ii0ooi1ooli14;
/* 1935 */                                      iI1Oili0OI.I0000Il00O.I00Io1lO(obj, i3, ioooio1o.I00IoiI());
/* 1938 */                                      ii0ooi1ooli1.I0010I0i(iI001IIilI0O, obj);
/* 1941 */                                      ii0ooi1ooli13 = ii0ooi1ooli1;
/* 1942 */                                      o1oO0lOoI12 = o1oO0lOoI1;
/* 1944 */                                      objI0001Ioi1lo2 = obj2;
                                            } catch (Throwable th) {
/* 1948 */                                      th = th;
/* 257 */                                       o1oO0lOoI12 = o1oO0lOoI1;
/* 2025 */                                      objI0001Ioi1lo2 = obj2;
/* 2027 */                                      objI00IOO = objI0001Ioi1lo2;
/* 2028 */                                      while (i2 < i) {
                                                }
/* 2045 */                                      if (objI00IOO != null) {
                                                }
/* 2058 */                                      throw th;
                                            }
                                            break;
                                        case 1:
/* 1883 */                                  obj2 = objI0001Ioi1lo2;
/* 1885 */                                  o1oO0lOoI1 = o1oO0lOoI12;
/* 1887 */                                  ii0ooi1ooli12 = ii0ooi1ooli13;
/* 1893 */                                  iOOOi1.I011lIilI0lo(5);
/* 1903 */                                  iI1Oili0OI.I0000Il00O.I00IO1(obj, iI00000oIO & 1048575, ioooio1o.I00Iooi00oi());
/* 1906 */                                  ii0ooi1ooli12.I0010I0i(iI001IIilI0O, obj);
/* 1465 */                                  ii0ooi1ooli1 = ii0ooi1ooli12;
/* 1941 */                                  ii0ooi1ooli13 = ii0ooi1ooli1;
/* 1942 */                                  o1oO0lOoI12 = o1oO0lOoI1;
/* 1944 */                                  objI0001Ioi1lo2 = obj2;
                                        case 2:
/* 1858 */                                  obj2 = objI0001Ioi1lo2;
/* 1860 */                                  o1oO0lOoI1 = o1oO0lOoI12;
/* 1862 */                                  ii0ooi1ooli12 = ii0ooi1ooli13;
/* 1867 */                                  iOOOi1.I011lIilI0lo(0);
/* 1875 */                                  iI1Oili0OI.I000II(obj, iI00000oIO & 1048575, ioooio1o.I00O0o1oo());
/* 1878 */                                  ii0ooi1ooli12.I0010I0i(iI001IIilI0O, obj);
/* 1465 */                                  ii0ooi1ooli1 = ii0ooi1ooli12;
/* 1941 */                                  ii0ooi1ooli13 = ii0ooi1ooli1;
/* 1942 */                                  o1oO0lOoI12 = o1oO0lOoI1;
/* 1944 */                                  objI0001Ioi1lo2 = obj2;
                                        case 3:
/* 1833 */                                  obj2 = objI0001Ioi1lo2;
/* 1835 */                                  o1oO0lOoI1 = o1oO0lOoI12;
/* 1837 */                                  ii0ooi1ooli12 = ii0ooi1ooli13;
/* 1842 */                                  iOOOi1.I011lIilI0lo(0);
/* 1850 */                                  iI1Oili0OI.I000II(obj, iI00000oIO & 1048575, ioooio1o.I00O0i0ii());
/* 1853 */                                  ii0ooi1ooli12.I0010I0i(iI001IIilI0O, obj);
/* 1465 */                                  ii0ooi1ooli1 = ii0ooi1ooli12;
/* 1941 */                                  ii0ooi1ooli13 = ii0ooi1ooli1;
/* 1942 */                                  o1oO0lOoI12 = o1oO0lOoI1;
/* 1944 */                                  objI0001Ioi1lo2 = obj2;
                                        case 4:
/* 1808 */                                  obj2 = objI0001Ioi1lo2;
/* 1810 */                                  o1oO0lOoI1 = o1oO0lOoI12;
/* 1812 */                                  ii0ooi1ooli12 = ii0ooi1ooli13;
/* 1817 */                                  iOOOi1.I011lIilI0lo(0);
/* 1825 */                                  iI1Oili0OI.I0000oI00(obj, ioooio1o.I00O10llo(), iI00000oIO & 1048575);
/* 1828 */                                  ii0ooi1ooli12.I0010I0i(iI001IIilI0O, obj);
/* 1465 */                                  ii0ooi1ooli1 = ii0ooi1ooli12;
/* 1941 */                                  ii0ooi1ooli13 = ii0ooi1ooli1;
/* 1942 */                                  o1oO0lOoI12 = o1oO0lOoI1;
/* 1944 */                                  objI0001Ioi1lo2 = obj2;
                                        case 5:
/* 1783 */                                  obj2 = objI0001Ioi1lo2;
/* 1785 */                                  o1oO0lOoI1 = o1oO0lOoI12;
/* 1787 */                                  ii0ooi1ooli12 = ii0ooi1ooli13;
/* 1792 */                                  iOOOi1.I011lIilI0lo(1);
/* 1800 */                                  iI1Oili0OI.I000II(obj, iI00000oIO & 1048575, ioooio1o.I00OI1());
/* 1803 */                                  ii0ooi1ooli12.I0010I0i(iI001IIilI0O, obj);
/* 1465 */                                  ii0ooi1ooli1 = ii0ooi1ooli12;
/* 1941 */                                  ii0ooi1ooli13 = ii0ooi1ooli1;
/* 1942 */                                  o1oO0lOoI12 = o1oO0lOoI1;
/* 1944 */                                  objI0001Ioi1lo2 = obj2;
                                        case 6:
/* 1757 */                                  obj2 = objI0001Ioi1lo2;
/* 1759 */                                  o1oO0lOoI1 = o1oO0lOoI12;
/* 1761 */                                  ii0ooi1ooli12 = ii0ooi1ooli13;
/* 1767 */                                  iOOOi1.I011lIilI0lo(5);
/* 1775 */                                  iI1Oili0OI.I0000oI00(obj, ioooio1o.I00OIO1(), iI00000oIO & 1048575);
/* 1778 */                                  ii0ooi1ooli12.I0010I0i(iI001IIilI0O, obj);
/* 1465 */                                  ii0ooi1ooli1 = ii0ooi1ooli12;
/* 1941 */                                  ii0ooi1ooli13 = ii0ooi1ooli1;
/* 1942 */                                  o1oO0lOoI12 = o1oO0lOoI1;
/* 1944 */                                  objI0001Ioi1lo2 = obj2;
                                        case 7:
/* 1730 */                                  obj2 = objI0001Ioi1lo2;
/* 1732 */                                  o1oO0lOoI1 = o1oO0lOoI12;
/* 1734 */                                  ii0ooi1ooli12 = ii0ooi1ooli13;
/* 1739 */                                  iOOOi1.I011lIilI0lo(0);
/* 1749 */                                  iI1Oili0OI.I0000Il00O.I001iOo1i0O(obj, iI00000oIO & 1048575, ioooio1o.I00OIl());
/* 1752 */                                  ii0ooi1ooli12.I0010I0i(iI001IIilI0O, obj);
/* 1465 */                                  ii0ooi1ooli1 = ii0ooi1ooli12;
/* 1941 */                                  ii0ooi1ooli13 = ii0ooi1ooli1;
/* 1942 */                                  o1oO0lOoI12 = o1oO0lOoI1;
/* 1944 */                                  objI0001Ioi1lo2 = obj2;
                                        case 8:
/* 1715 */                                  obj2 = objI0001Ioi1lo2;
/* 1717 */                                  o1oO0lOoI1 = o1oO0lOoI12;
/* 1719 */                                  ii0ooi1ooli12 = ii0ooi1ooli13;
/* 1722 */                                  ii0ooi1ooli12.I00IioO0OiOi(iI00000oIO, iOOOi1, obj);
/* 1725 */                                  ii0ooi1ooli12.I0010I0i(iI001IIilI0O, obj);
/* 1465 */                                  ii0ooi1ooli1 = ii0ooi1ooli12;
/* 1941 */                                  ii0ooi1ooli13 = ii0ooi1ooli1;
/* 1942 */                                  o1oO0lOoI12 = o1oO0lOoI1;
/* 1944 */                                  objI0001Ioi1lo2 = obj2;
                                        case 9:
/* 1686 */                                  obj2 = objI0001Ioi1lo2;
/* 1688 */                                  o1oO0lOoI1 = o1oO0lOoI12;
/* 1690 */                                  ii0ooi1ooli12 = ii0ooi1ooli13;
/* 1697 */                                  i1ilO0II i1ilo0ii = (i1ilO0II) ii0ooi1ooli12.I00II0Ol1O0l(iI001IIilI0O, obj);
/* 1699 */                                  iI110OIoiOl ii110oioiolI001lIiIIo1O = ii0ooi1ooli12.I001lIiIIo1O(iI001IIilI0O);
/* 1704 */                                  iOOOi1.I011lIilI0lo(2);
/* 1707 */                                  iOOOi1.I011olOoO(i1ilo0ii, ii110oioiolI001lIiIIo1O, i1o0l0iVar);
/* 1710 */                                  ii0ooi1ooli12.I00II0oii1o(iI001IIilI0O, obj, i1ilo0ii);
/* 1465 */                                  ii0ooi1ooli1 = ii0ooi1ooli12;
/* 1941 */                                  ii0ooi1ooli13 = ii0ooi1ooli1;
/* 1942 */                                  o1oO0lOoI12 = o1oO0lOoI1;
/* 1944 */                                  objI0001Ioi1lo2 = obj2;
                                        case 10:
/* 1664 */                                  obj2 = objI0001Ioi1lo2;
/* 1666 */                                  o1oO0lOoI1 = o1oO0lOoI12;
/* 1668 */                                  ii0ooi1ooli12 = ii0ooi1ooli13;
/* 1678 */                                  iI1Oili0OI.I000OOo1O(obj, iI00000oIO & 1048575, iOOOi1.I01OIo());
/* 1681 */                                  ii0ooi1ooli12.I0010I0i(iI001IIilI0O, obj);
/* 1465 */                                  ii0ooi1ooli1 = ii0ooi1ooli12;
/* 1941 */                                  ii0ooi1ooli13 = ii0ooi1ooli1;
/* 1942 */                                  o1oO0lOoI12 = o1oO0lOoI1;
/* 1944 */                                  objI0001Ioi1lo2 = obj2;
                                        case 11:
/* 1639 */                                  obj2 = objI0001Ioi1lo2;
/* 1641 */                                  o1oO0lOoI1 = o1oO0lOoI12;
/* 1643 */                                  ii0ooi1ooli12 = ii0ooi1ooli13;
/* 1648 */                                  iOOOi1.I011lIilI0lo(0);
/* 1656 */                                  iI1Oili0OI.I0000oI00(obj, ioooio1o.I00Ol00(), iI00000oIO & 1048575);
/* 1659 */                                  ii0ooi1ooli12.I0010I0i(iI001IIilI0O, obj);
/* 1465 */                                  ii0ooi1ooli1 = ii0ooi1ooli12;
/* 1941 */                                  ii0ooi1ooli13 = ii0ooi1ooli1;
/* 1942 */                                  o1oO0lOoI12 = o1oO0lOoI1;
/* 1944 */                                  objI0001Ioi1lo2 = obj2;
                                        case 12:
/* 1568 */                                  obj2 = objI0001Ioi1lo2;
/* 1570 */                                  o1oO0lOoI1 = o1oO0lOoI12;
/* 1572 */                                  ii0ooi1ooli12 = ii0ooi1ooli13;
/* 1575 */                                  iOOOi1.I011lIilI0lo(0);
/* 1578 */                                  int iI00Ol10 = ioooio1o.I00Ol10();
/* 1582 */                                  i1iOOl0o i1iool0oI001lloI = ii0ooi1ooli12.I001lloI(iI001IIilI0O);
/* 1586 */                                  if (i1iool0oI001lloI != null && !i1iool0oI001lloI.I00000oIO(iI00Ol10)) {
/* 1595 */                                      O1oO0lOoI1 o1oO0lOoI13 = iI111lOOO.I00000oIO;
/* 1597 */                                      if (obj2 == null) {
/* 1599 */                                          o1oO0lOoI1.getClass();
/* 1602 */                                          objI0001Ioi1lo = O1oO0lOoI1.I0001Ioi1lo(obj);
                                                } else {
/* 1607 */                                          objI0001Ioi1lo = obj2;
                                                }
/* 1610 */                                      o1oO0lOoI1.getClass();
/* 1622 */                                      ((iI1O01I1) objI0001Ioi1lo).I0000O(iI01IoO << 3, Long.valueOf(iI00Ol10));
/* 1625 */                                      ii0ooi1ooli13 = ii0ooi1ooli12;
/* 421 */                                       objI0001Ioi1lo2 = objI0001Ioi1lo;
/* 202 */                                       o1oO0lOoI12 = o1oO0lOoI1;
                                            }
/* 1631 */                                  iI1Oili0OI.I0000oI00(obj, iI00Ol10, iI00000oIO & 1048575);
/* 1634 */                                  ii0ooi1ooli12.I0010I0i(iI001IIilI0O, obj);
/* 1465 */                                  ii0ooi1ooli1 = ii0ooi1ooli12;
/* 1941 */                                  ii0ooi1ooli13 = ii0ooi1ooli1;
/* 1942 */                                  o1oO0lOoI12 = o1oO0lOoI1;
/* 1944 */                                  objI0001Ioi1lo2 = obj2;
                                            break;
                                        case 13:
/* 1543 */                                  obj2 = objI0001Ioi1lo2;
/* 1545 */                                  o1oO0lOoI1 = o1oO0lOoI12;
/* 1547 */                                  ii0ooi1ooli12 = ii0ooi1ooli13;
/* 1553 */                                  iOOOi1.I011lIilI0lo(5);
/* 1561 */                                  iI1Oili0OI.I0000oI00(obj, ioooio1o.I00Ol1ll1(), iI00000oIO & 1048575);
/* 1564 */                                  ii0ooi1ooli12.I0010I0i(iI001IIilI0O, obj);
/* 1465 */                                  ii0ooi1ooli1 = ii0ooi1ooli12;
/* 1941 */                                  ii0ooi1ooli13 = ii0ooi1ooli1;
/* 1942 */                                  o1oO0lOoI12 = o1oO0lOoI1;
/* 1944 */                                  objI0001Ioi1lo2 = obj2;
                                        case 14:
/* 1519 */                                  obj2 = objI0001Ioi1lo2;
/* 1521 */                                  o1oO0lOoI1 = o1oO0lOoI12;
/* 1523 */                                  ii0ooi1ooli12 = ii0ooi1ooli13;
/* 1528 */                                  iOOOi1.I011lIilI0lo(1);
/* 1536 */                                  iI1Oili0OI.I000II(obj, iI00000oIO & 1048575, ioooio1o.I00OloOo());
/* 1539 */                                  ii0ooi1ooli12.I0010I0i(iI001IIilI0O, obj);
/* 1465 */                                  ii0ooi1ooli1 = ii0ooi1ooli12;
/* 1941 */                                  ii0ooi1ooli13 = ii0ooi1ooli1;
/* 1942 */                                  o1oO0lOoI12 = o1oO0lOoI1;
/* 1944 */                                  objI0001Ioi1lo2 = obj2;
                                        case 15:
/* 1495 */                                  obj2 = objI0001Ioi1lo2;
/* 1497 */                                  o1oO0lOoI1 = o1oO0lOoI12;
/* 1499 */                                  ii0ooi1ooli12 = ii0ooi1ooli13;
/* 1504 */                                  iOOOi1.I011lIilI0lo(0);
/* 1512 */                                  iI1Oili0OI.I0000oI00(obj, ioooio1o.I00i01iIIliI(), iI00000oIO & 1048575);
/* 1515 */                                  ii0ooi1ooli12.I0010I0i(iI001IIilI0O, obj);
/* 1465 */                                  ii0ooi1ooli1 = ii0ooi1ooli12;
/* 1941 */                                  ii0ooi1ooli13 = ii0ooi1ooli1;
/* 1942 */                                  o1oO0lOoI12 = o1oO0lOoI1;
/* 1944 */                                  objI0001Ioi1lo2 = obj2;
                                        case 16:
/* 1471 */                                  obj2 = objI0001Ioi1lo2;
/* 1473 */                                  o1oO0lOoI1 = o1oO0lOoI12;
/* 1475 */                                  ii0ooi1ooli12 = ii0ooi1ooli13;
/* 1480 */                                  iOOOi1.I011lIilI0lo(0);
/* 1488 */                                  iI1Oili0OI.I000II(obj, iI00000oIO & 1048575, ioooio1o.I00i0O());
/* 1491 */                                  ii0ooi1ooli12.I0010I0i(iI001IIilI0O, obj);
/* 1465 */                                  ii0ooi1ooli1 = ii0ooi1ooli12;
/* 1941 */                                  ii0ooi1ooli13 = ii0ooi1ooli1;
/* 1942 */                                  o1oO0lOoI12 = o1oO0lOoI1;
/* 1944 */                                  objI0001Ioi1lo2 = obj2;
                                        case 17:
/* 1439 */                                  obj2 = objI0001Ioi1lo2;
/* 1441 */                                  o1oO0lOoI1 = o1oO0lOoI12;
/* 1443 */                                  ii0ooi1ooli12 = ii0ooi1ooli13;
/* 1444 */                                  obj3 = obj;
                                            try {
/* 1450 */                                      i1ilO0II i1ilo0ii2 = (i1ilO0II) ii0ooi1ooli12.I00II0Ol1O0l(iI001IIilI0O, obj3);
/* 1452 */                                      iI110OIoiOl ii110oioiolI001lIiIIo1O2 = ii0ooi1ooli12.I001lIiIIo1O(iI001IIilI0O);
/* 1456 */                                      iOOOi1.I011lIilI0lo(3);
/* 1459 */                                      iOOOi1.I01IO0oio(i1ilo0ii2, ii110oioiolI001lIiIIo1O2, i1o0l0iVar);
/* 1462 */                                      ii0ooi1ooli12.I00II0oii1o(iI001IIilI0O, obj3, i1ilo0ii2);
/* 1465 */                                      ii0ooi1ooli1 = ii0ooi1ooli12;
/* 1941 */                                      ii0ooi1ooli13 = ii0ooi1ooli1;
/* 1942 */                                      o1oO0lOoI12 = o1oO0lOoI1;
/* 1944 */                                      objI0001Ioi1lo2 = obj2;
                                            } catch (iI00ilIl1I unused2) {
/* 1468 */                                      ii0ooi1ooli1 = ii0ooi1ooli12;
/* 1961 */                                      objI0001Ioi1lo2 = obj2;
/* 1963 */                                      if (objI0001Ioi1lo2 == null) {
                                                    try {
/* 1965 */                                              o1oO0lOoI1.getClass();
/* 1968 */                                              objI0001Ioi1lo2 = O1oO0lOoI1.I0001Ioi1lo(obj3);
                                                    } catch (Throwable th2) {
/* 2022 */                                              th = th2;
/* 217 */                                               o1oO0lOoI12 = o1oO0lOoI1;
/* 2027 */                                              objI00IOO = objI0001Ioi1lo2;
/* 2028 */                                              while (i2 < i) {
/* 2038 */                                                  objI00IOO = I00IOO(obj, iArr[i2], objI00IOO, o1oO0lOoI12, obj);
/* 2042 */                                                  i2++;
                                                        }
/* 2045 */                                              if (objI00IOO != null) {
/* 2047 */                                                  o1oO0lOoI12.getClass();
/* 2056 */                                                  ((i1oi01OllI) obj).zzc = (iI1O01I1) objI00IOO;
                                                        }
/* 2058 */                                              throw th;
                                                    }
                                                }
/* 1973 */                                      o1oO0lOoI1.getClass();
/* 1980 */                                      if (O1oO0lOoI1.I000II(0, iOOOi1, objI0001Ioi1lo2)) {
/* 2018 */                                          ii0ooi1ooli13 = this;
/* 202 */                                           o1oO0lOoI12 = o1oO0lOoI1;
                                                } else {
/* 1982 */                                          objI00IOO2 = objI0001Ioi1lo2;
/* 1983 */                                          while (i2 < i) {
/* 1993 */                                              objI00IOO2 = ii0ooi1ooli1.I00IOO(obj3, iArr[i2], objI00IOO2, o1oO0lOoI1, obj);
/* 1997 */                                              i2++;
/* 1999 */                                              ii0ooi1ooli1 = this;
/* 2001 */                                              obj3 = obj;
                                                    }
/* 194 */                                           o1oO0lOoI12 = o1oO0lOoI1;
/* 2004 */                                          if (objI00IOO2 == null) {
                                                    }
                                                }
                                            }
                                            break;
                                        case PoseLandmark.RIGHT_PINKY:
/* 1420 */                                  ii0ooi1ooli1 = ii0ooi1ooli13;
/* 1421 */                                  obj2 = objI0001Ioi1lo2;
/* 1423 */                                  o1oO0lOoI1 = o1oO0lOoI12;
/* 1434 */                                  iOOOi1.I01Oi01Ilol(lii0OIO1o0i0.I00000oIO(iI00000oIO & 1048575, obj));
/* 1941 */                                  ii0ooi1ooli13 = ii0ooi1ooli1;
/* 1942 */                                  o1oO0lOoI12 = o1oO0lOoI1;
/* 1944 */                                  objI0001Ioi1lo2 = obj2;
                                        case PoseLandmark.LEFT_INDEX:
/* 1401 */                                  ii0ooi1ooli1 = ii0ooi1ooli13;
/* 1402 */                                  obj2 = objI0001Ioi1lo2;
/* 1404 */                                  o1oO0lOoI1 = o1oO0lOoI12;
/* 1415 */                                  iOOOi1.I01OlIoIl(lii0OIO1o0i0.I00000oIO(iI00000oIO & 1048575, obj));
/* 1941 */                                  ii0ooi1ooli13 = ii0ooi1ooli1;
/* 1942 */                                  o1oO0lOoI12 = o1oO0lOoI1;
/* 1944 */                                  objI0001Ioi1lo2 = obj2;
                                        case PoseLandmark.RIGHT_INDEX:
/* 1382 */                                  ii0ooi1ooli1 = ii0ooi1ooli13;
/* 1383 */                                  obj2 = objI0001Ioi1lo2;
/* 1385 */                                  o1oO0lOoI1 = o1oO0lOoI12;
/* 1396 */                                  iOOOi1.I00lll10(lii0OIO1o0i0.I00000oIO(iI00000oIO & 1048575, obj));
/* 1941 */                                  ii0ooi1ooli13 = ii0ooi1ooli1;
/* 1942 */                                  o1oO0lOoI12 = o1oO0lOoI1;
/* 1944 */                                  objI0001Ioi1lo2 = obj2;
                                        case PoseLandmark.LEFT_THUMB:
/* 1363 */                                  ii0ooi1ooli1 = ii0ooi1ooli13;
/* 1364 */                                  obj2 = objI0001Ioi1lo2;
/* 1366 */                                  o1oO0lOoI1 = o1oO0lOoI12;
/* 1377 */                                  iOOOi1.I01OoIoio00O(lii0OIO1o0i0.I00000oIO(iI00000oIO & 1048575, obj));
/* 1941 */                                  ii0ooi1ooli13 = ii0ooi1ooli1;
/* 1942 */                                  o1oO0lOoI12 = o1oO0lOoI1;
/* 1944 */                                  objI0001Ioi1lo2 = obj2;
                                        case PoseLandmark.RIGHT_THUMB:
/* 1344 */                                  ii0ooi1ooli1 = ii0ooi1ooli13;
/* 1345 */                                  obj2 = objI0001Ioi1lo2;
/* 1347 */                                  o1oO0lOoI1 = o1oO0lOoI12;
/* 1358 */                                  iOOOi1.I00o101lO(lii0OIO1o0i0.I00000oIO(iI00000oIO & 1048575, obj));
/* 1941 */                                  ii0ooi1ooli13 = ii0ooi1ooli1;
/* 1942 */                                  o1oO0lOoI12 = o1oO0lOoI1;
/* 1944 */                                  objI0001Ioi1lo2 = obj2;
                                        case PoseLandmark.LEFT_HIP:
/* 1325 */                                  ii0ooi1ooli1 = ii0ooi1ooli13;
/* 1326 */                                  obj2 = objI0001Ioi1lo2;
/* 1328 */                                  o1oO0lOoI1 = o1oO0lOoI12;
/* 1339 */                                  iOOOi1.I00oIiI10(lii0OIO1o0i0.I00000oIO(iI00000oIO & 1048575, obj));
/* 1941 */                                  ii0ooi1ooli13 = ii0ooi1ooli1;
/* 1942 */                                  o1oO0lOoI12 = o1oO0lOoI1;
/* 1944 */                                  objI0001Ioi1lo2 = obj2;
                                        case PoseLandmark.RIGHT_HIP:
/* 1306 */                                  ii0ooi1ooli1 = ii0ooi1ooli13;
/* 1307 */                                  obj2 = objI0001Ioi1lo2;
/* 1309 */                                  o1oO0lOoI1 = o1oO0lOoI12;
/* 1320 */                                  iOOOi1.I00ol1(lii0OIO1o0i0.I00000oIO(iI00000oIO & 1048575, obj));
/* 1941 */                                  ii0ooi1ooli13 = ii0ooi1ooli1;
/* 1942 */                                  o1oO0lOoI12 = o1oO0lOoI1;
/* 1944 */                                  objI0001Ioi1lo2 = obj2;
                                        case PoseLandmark.LEFT_KNEE:
/* 1287 */                                  ii0ooi1ooli1 = ii0ooi1ooli13;
/* 1288 */                                  obj2 = objI0001Ioi1lo2;
/* 1290 */                                  o1oO0lOoI1 = o1oO0lOoI12;
/* 1301 */                                  iOOOi1.I00oliIiO01i(lii0OIO1o0i0.I00000oIO(iI00000oIO & 1048575, obj));
/* 1941 */                                  ii0ooi1ooli13 = ii0ooi1ooli1;
/* 1942 */                                  o1oO0lOoI12 = o1oO0lOoI1;
/* 1944 */                                  objI0001Ioi1lo2 = obj2;
                                        case PoseLandmark.RIGHT_KNEE:
/* 1246 */                                  ii0ooi1ooli1 = ii0ooi1ooli13;
/* 1247 */                                  obj2 = objI0001Ioi1lo2;
/* 1249 */                                  o1oO0lOoI1 = o1oO0lOoI12;
/* 1261 */                                  if ((536870912 & iI00000oIO) != 0) {
/* 1270 */                                      iOOOi1.I00ooiO1I(lii0OIO1o0i0.I00000oIO(iI00000oIO & 1048575, obj), true);
                                            } else {
/* 1282 */                                      iOOOi1.I00ooiO1I(lii0OIO1o0i0.I00000oIO(iI00000oIO & 1048575, obj), false);
                                            }
/* 1941 */                                  ii0ooi1ooli13 = ii0ooi1ooli1;
/* 1942 */                                  o1oO0lOoI12 = o1oO0lOoI1;
/* 1944 */                                  objI0001Ioi1lo2 = obj2;
                                        case 27:
/* 1223 */                                  ii0ooi1ooli1 = ii0ooi1ooli13;
/* 1224 */                                  obj2 = objI0001Ioi1lo2;
/* 1226 */                                  o1oO0lOoI1 = o1oO0lOoI12;
/* 1241 */                                  iOOOi1.I0100o111I(lii0OIO1o0i0.I00000oIO(iI00000oIO & 1048575, obj), ii0ooi1ooli1.I001lIiIIo1O(iI001IIilI0O), i1o0l0iVar);
/* 1941 */                                  ii0ooi1ooli13 = ii0ooi1ooli1;
/* 1942 */                                  o1oO0lOoI12 = o1oO0lOoI1;
/* 1944 */                                  objI0001Ioi1lo2 = obj2;
                                        case PoseLandmark.RIGHT_ANKLE:
/* 1204 */                                  ii0ooi1ooli1 = ii0ooi1ooli13;
/* 1205 */                                  obj2 = objI0001Ioi1lo2;
/* 1207 */                                  o1oO0lOoI1 = o1oO0lOoI12;
/* 1218 */                                  iOOOi1.I010iIIOlo(lii0OIO1o0i0.I00000oIO(iI00000oIO & 1048575, obj));
/* 1941 */                                  ii0ooi1ooli13 = ii0ooi1ooli1;
/* 1942 */                                  o1oO0lOoI12 = o1oO0lOoI1;
/* 1944 */                                  objI0001Ioi1lo2 = obj2;
                                        case PoseLandmark.LEFT_HEEL:
/* 1182 */                                  ii0ooi1ooli1 = ii0ooi1ooli13;
/* 1183 */                                  obj2 = objI0001Ioi1lo2;
/* 1185 */                                  o1oO0lOoI1 = o1oO0lOoI12;
/* 1187 */                                  obj3 = obj;
                                            try {
                                                try {
/* 1196 */                                          iOOOi1.I010l1O(lii0OIO1o0i0.I00000oIO(iI00000oIO & 1048575, obj3));
/* 1941 */                                          ii0ooi1ooli13 = ii0ooi1ooli1;
/* 1942 */                                          o1oO0lOoI12 = o1oO0lOoI1;
/* 1944 */                                          objI0001Ioi1lo2 = obj2;
                                                } catch (iI00ilIl1I unused3) {
/* 1961 */                                          objI0001Ioi1lo2 = obj2;
/* 1963 */                                          if (objI0001Ioi1lo2 == null) {
                                                    }
/* 1973 */                                          o1oO0lOoI1.getClass();
/* 1980 */                                          if (O1oO0lOoI1.I000II(0, iOOOi1, objI0001Ioi1lo2)) {
                                                    }
                                                }
                                            } catch (Throwable th3) {
/* 1201 */                                      th = th3;
/* 257 */                                       o1oO0lOoI12 = o1oO0lOoI1;
/* 2025 */                                      objI0001Ioi1lo2 = obj2;
/* 2027 */                                      objI00IOO = objI0001Ioi1lo2;
/* 2028 */                                      while (i2 < i) {
                                                }
/* 2045 */                                      if (objI00IOO != null) {
                                                }
/* 2058 */                                      throw th;
                                            }
                                            break;
                                        case 30:
/* 1134 */                                  ii0ooi1ooli1 = ii0ooi1ooli13;
/* 1135 */                                  o1oO0lOoI1 = o1oO0lOoI12;
/* 1137 */                                  obj3 = obj;
/* 1139 */                                  Object obj5 = objI0001Ioi1lo2;
                                            try {
/* 1144 */                                      iI00IlI1oII ii00ili1oiiI00000oIO = lii0OIO1o0i0.I00000oIO(iI00000oIO & 1048575, obj3);
/* 1148 */                                      iOOOi1.I010o0o0oO(ii00ili1oiiI00000oIO);
                                                try {
/* 1157 */                                          objI0001Ioi1lo2 = iI111lOOO.I0000Il00O(obj3, iI01IoO, ii00ili1oiiI00000oIO, ii0ooi1ooli1.I001lloI(iI001IIilI0O), obj5, o1oO0lOoI1);
/* 1161 */                                          o1oO0lOoI1 = o1oO0lOoI1;
/* 1163 */                                          ii0ooi1ooli13 = ii0ooi1ooli1;
                                                } catch (Throwable th4) {
/* 1166 */                                          th = th4;
/* 1167 */                                          obj2 = obj5;
/* 1169 */                                          o1oO0lOoI1 = o1oO0lOoI1;
/* 257 */                                           o1oO0lOoI12 = o1oO0lOoI1;
/* 2025 */                                          objI0001Ioi1lo2 = obj2;
/* 2027 */                                          objI00IOO = objI0001Ioi1lo2;
/* 2028 */                                          while (i2 < i) {
                                                    }
/* 2045 */                                          if (objI00IOO != null) {
                                                    }
/* 2058 */                                          throw th;
                                                }
                                            } catch (iI00ilIl1I unused4) {
/* 1178 */                                      obj2 = obj5;
/* 1961 */                                      objI0001Ioi1lo2 = obj2;
/* 1963 */                                      if (objI0001Ioi1lo2 == null) {
                                                }
/* 1973 */                                      o1oO0lOoI1.getClass();
/* 1980 */                                      if (O1oO0lOoI1.I000II(0, iOOOi1, objI0001Ioi1lo2)) {
                                                }
                                            } catch (Throwable th5) {
/* 1173 */                                      th = th5;
/* 1174 */                                      obj2 = obj5;
                                            }
/* 202 */                                   o1oO0lOoI12 = o1oO0lOoI1;
                                            break;
                                        case PoseLandmark.LEFT_FOOT_INDEX:
/* 1119 */                                  ii0ooi1ooli1 = ii0ooi1ooli13;
/* 1129 */                                  iOOOi1.I01101olii(lii0OIO1o0i0.I00000oIO(iI00000oIO & 1048575, obj));
/* 947 */                                   obj2 = objI0001Ioi1lo2;
/* 949 */                                   o1oO0lOoI1 = o1oO0lOoI12;
/* 1941 */                                  ii0ooi1ooli13 = ii0ooi1ooli1;
/* 1942 */                                  o1oO0lOoI12 = o1oO0lOoI1;
/* 1944 */                                  objI0001Ioi1lo2 = obj2;
                                        case 32:
/* 1104 */                                  ii0ooi1ooli1 = ii0ooi1ooli13;
/* 1114 */                                  iOOOi1.I0111i(lii0OIO1o0i0.I00000oIO(iI00000oIO & 1048575, obj));
/* 947 */                                   obj2 = objI0001Ioi1lo2;
/* 949 */                                   o1oO0lOoI1 = o1oO0lOoI12;
/* 1941 */                                  ii0ooi1ooli13 = ii0ooi1ooli1;
/* 1942 */                                  o1oO0lOoI12 = o1oO0lOoI1;
/* 1944 */                                  objI0001Ioi1lo2 = obj2;
                                        case 33:
/* 1089 */                                  ii0ooi1ooli1 = ii0ooi1ooli13;
/* 1099 */                                  iOOOi1.I011IOil(lii0OIO1o0i0.I00000oIO(iI00000oIO & 1048575, obj));
/* 947 */                                   obj2 = objI0001Ioi1lo2;
/* 949 */                                   o1oO0lOoI1 = o1oO0lOoI12;
/* 1941 */                                  ii0ooi1ooli13 = ii0ooi1ooli1;
/* 1942 */                                  o1oO0lOoI12 = o1oO0lOoI1;
/* 1944 */                                  objI0001Ioi1lo2 = obj2;
                                        case 34:
/* 1074 */                                  ii0ooi1ooli1 = ii0ooi1ooli13;
/* 1084 */                                  iOOOi1.I011Io0I1ioi(lii0OIO1o0i0.I00000oIO(iI00000oIO & 1048575, obj));
/* 947 */                                   obj2 = objI0001Ioi1lo2;
/* 949 */                                   o1oO0lOoI1 = o1oO0lOoI12;
/* 1941 */                                  ii0ooi1ooli13 = ii0ooi1ooli1;
/* 1942 */                                  o1oO0lOoI12 = o1oO0lOoI1;
/* 1944 */                                  objI0001Ioi1lo2 = obj2;
                                        case InputImage.IMAGE_FORMAT_YUV_420_888:
/* 1060 */                                  ii0ooi1ooli1 = ii0ooi1ooli13;
/* 1070 */                                  iOOOi1.I01Oi01Ilol(lii0OIO1o0i0.I00000oIO(iI00000oIO & 1048575, obj));
/* 947 */                                   obj2 = objI0001Ioi1lo2;
/* 949 */                                   o1oO0lOoI1 = o1oO0lOoI12;
/* 1941 */                                  ii0ooi1ooli13 = ii0ooi1ooli1;
/* 1942 */                                  o1oO0lOoI12 = o1oO0lOoI1;
/* 1944 */                                  objI0001Ioi1lo2 = obj2;
                                        case 36:
/* 1046 */                                  ii0ooi1ooli1 = ii0ooi1ooli13;
/* 1056 */                                  iOOOi1.I01OlIoIl(lii0OIO1o0i0.I00000oIO(iI00000oIO & 1048575, obj));
/* 947 */                                   obj2 = objI0001Ioi1lo2;
/* 949 */                                   o1oO0lOoI1 = o1oO0lOoI12;
/* 1941 */                                  ii0ooi1ooli13 = ii0ooi1ooli1;
/* 1942 */                                  o1oO0lOoI12 = o1oO0lOoI1;
/* 1944 */                                  objI0001Ioi1lo2 = obj2;
                                        case 37:
/* 1032 */                                  ii0ooi1ooli1 = ii0ooi1ooli13;
/* 1042 */                                  iOOOi1.I00lll10(lii0OIO1o0i0.I00000oIO(iI00000oIO & 1048575, obj));
/* 947 */                                   obj2 = objI0001Ioi1lo2;
/* 949 */                                   o1oO0lOoI1 = o1oO0lOoI12;
/* 1941 */                                  ii0ooi1ooli13 = ii0ooi1ooli1;
/* 1942 */                                  o1oO0lOoI12 = o1oO0lOoI1;
/* 1944 */                                  objI0001Ioi1lo2 = obj2;
                                        case 38:
/* 1018 */                                  ii0ooi1ooli1 = ii0ooi1ooli13;
/* 1028 */                                  iOOOi1.I01OoIoio00O(lii0OIO1o0i0.I00000oIO(iI00000oIO & 1048575, obj));
/* 947 */                                   obj2 = objI0001Ioi1lo2;
/* 949 */                                   o1oO0lOoI1 = o1oO0lOoI12;
/* 1941 */                                  ii0ooi1ooli13 = ii0ooi1ooli1;
/* 1942 */                                  o1oO0lOoI12 = o1oO0lOoI1;
/* 1944 */                                  objI0001Ioi1lo2 = obj2;
                                        case 39:
/* 1004 */                                  ii0ooi1ooli1 = ii0ooi1ooli13;
/* 1014 */                                  iOOOi1.I00o101lO(lii0OIO1o0i0.I00000oIO(iI00000oIO & 1048575, obj));
/* 947 */                                   obj2 = objI0001Ioi1lo2;
/* 949 */                                   o1oO0lOoI1 = o1oO0lOoI12;
/* 1941 */                                  ii0ooi1ooli13 = ii0ooi1ooli1;
/* 1942 */                                  o1oO0lOoI12 = o1oO0lOoI1;
/* 1944 */                                  objI0001Ioi1lo2 = obj2;
                                        case 40:
/* 990 */                                   ii0ooi1ooli1 = ii0ooi1ooli13;
/* 1000 */                                  iOOOi1.I00oIiI10(lii0OIO1o0i0.I00000oIO(iI00000oIO & 1048575, obj));
/* 947 */                                   obj2 = objI0001Ioi1lo2;
/* 949 */                                   o1oO0lOoI1 = o1oO0lOoI12;
/* 1941 */                                  ii0ooi1ooli13 = ii0ooi1ooli1;
/* 1942 */                                  o1oO0lOoI12 = o1oO0lOoI1;
/* 1944 */                                  objI0001Ioi1lo2 = obj2;
                                        case 41:
/* 976 */                                   ii0ooi1ooli1 = ii0ooi1ooli13;
/* 986 */                                   iOOOi1.I00ol1(lii0OIO1o0i0.I00000oIO(iI00000oIO & 1048575, obj));
/* 947 */                                   obj2 = objI0001Ioi1lo2;
/* 949 */                                   o1oO0lOoI1 = o1oO0lOoI12;
/* 1941 */                                  ii0ooi1ooli13 = ii0ooi1ooli1;
/* 1942 */                                  o1oO0lOoI12 = o1oO0lOoI1;
/* 1944 */                                  objI0001Ioi1lo2 = obj2;
                                        case 42:
/* 962 */                                   ii0ooi1ooli1 = ii0ooi1ooli13;
/* 972 */                                   iOOOi1.I00oliIiO01i(lii0OIO1o0i0.I00000oIO(iI00000oIO & 1048575, obj));
/* 947 */                                   obj2 = objI0001Ioi1lo2;
/* 949 */                                   o1oO0lOoI1 = o1oO0lOoI12;
/* 1941 */                                  ii0ooi1ooli13 = ii0ooi1ooli1;
/* 1942 */                                  o1oO0lOoI12 = o1oO0lOoI1;
/* 1944 */                                  objI0001Ioi1lo2 = obj2;
                                        case 43:
/* 934 */                                   ii0ooi1ooli1 = ii0ooi1ooli13;
/* 935 */                                   obj3 = obj;
                                            try {
/* 944 */                                       iOOOi1.I010l1O(lii0OIO1o0i0.I00000oIO(iI00000oIO & 1048575, obj3));
/* 947 */                                       obj2 = objI0001Ioi1lo2;
/* 949 */                                       o1oO0lOoI1 = o1oO0lOoI12;
/* 1941 */                                      ii0ooi1ooli13 = ii0ooi1ooli1;
/* 1942 */                                      o1oO0lOoI12 = o1oO0lOoI1;
/* 1944 */                                      objI0001Ioi1lo2 = obj2;
                                            } catch (iI00ilIl1I unused5) {
/* 956 */                                       obj2 = objI0001Ioi1lo2;
/* 958 */                                       o1oO0lOoI1 = o1oO0lOoI12;
/* 1961 */                                      objI0001Ioi1lo2 = obj2;
/* 1963 */                                      if (objI0001Ioi1lo2 == null) {
                                                }
/* 1973 */                                      o1oO0lOoI1.getClass();
/* 1980 */                                      if (O1oO0lOoI1.I000II(0, iOOOi1, objI0001Ioi1lo2)) {
                                                }
                                            }
                                            break;
                                        case 44:
/* 878 */                                   o1oO0lOoI1 = o1oO0lOoI12;
                                            try {
/* 885 */                                       iI00IlI1oII ii00ili1oiiI00000oIO2 = lii0OIO1o0i0.I00000oIO(iI00000oIO & 1048575, obj);
/* 889 */                                       iOOOi1.I010o0o0oO(ii00ili1oiiI00000oIO2);
/* 892 */                                       i1iOOl0o i1iool0oI001lloI2 = ii0ooi1ooli13.I001lloI(iI001IIilI0O);
/* 896 */                                       ii0ooi1ooli1 = ii0ooi1ooli13;
/* 897 */                                       obj3 = obj;
/* 900 */                                       Object obj6 = objI0001Ioi1lo2;
                                                try {
                                                    try {
/* 902 */                                               objI0001Ioi1lo2 = iI111lOOO.I0000Il00O(obj3, iI01IoO, ii00ili1oiiI00000oIO2, i1iool0oI001lloI2, obj6, o1oO0lOoI1);
/* 906 */                                               o1oO0lOoI12 = o1oO0lOoI1;
/* 907 */                                               ii0ooi1ooli13 = ii0ooi1ooli1;
                                                    } catch (iI00ilIl1I unused6) {
/* 915 */                                               obj2 = obj6;
/* 917 */                                               o1oO0lOoI1 = o1oO0lOoI1;
/* 1961 */                                              objI0001Ioi1lo2 = obj2;
/* 1963 */                                              if (objI0001Ioi1lo2 == null) {
                                                        }
/* 1973 */                                              o1oO0lOoI1.getClass();
/* 1980 */                                              if (O1oO0lOoI1.I000II(0, iOOOi1, objI0001Ioi1lo2)) {
                                                        }
                                                    }
                                                } catch (Throwable th6) {
/* 910 */                                           th = th6;
/* 911 */                                           objI0001Ioi1lo2 = obj6;
/* 912 */                                           o1oO0lOoI12 = o1oO0lOoI1;
/* 85 */                                            obj2 = objI0001Ioi1lo2;
/* 2025 */                                          objI0001Ioi1lo2 = obj2;
/* 2027 */                                          objI00IOO = objI0001Ioi1lo2;
/* 2028 */                                          while (i2 < i) {
                                                    }
/* 2045 */                                          if (objI00IOO != null) {
                                                    }
/* 2058 */                                          throw th;
                                                }
                                            } catch (iI00ilIl1I unused7) {
/* 928 */                                       ii0ooi1ooli1 = ii0ooi1ooli13;
/* 929 */                                       obj3 = obj;
/* 930 */                                       obj2 = objI0001Ioi1lo2;
                                            } catch (Throwable th7) {
/* 921 */                                       th = th7;
/* 924 */                                       o1oO0lOoI12 = o1oO0lOoI1;
                                            }
                                            break;
                                        case BuildConfig.VERSION_CODE:
/* 862 */                                   o1oO0lOoI1 = o1oO0lOoI12;
/* 864 */                                   obj4 = obj;
/* 873 */                                   iOOOi1.I01101olii(lii0OIO1o0i0.I00000oIO(iI00000oIO & 1048575, obj4));
/* 248 */                                   ii0ooi1ooli1 = ii0ooi1ooli13;
/* 249 */                                   obj2 = objI0001Ioi1lo2;
/* 1941 */                                  ii0ooi1ooli13 = ii0ooi1ooli1;
/* 1942 */                                  o1oO0lOoI12 = o1oO0lOoI1;
/* 1944 */                                  objI0001Ioi1lo2 = obj2;
                                        case 46:
/* 846 */                                   o1oO0lOoI1 = o1oO0lOoI12;
/* 848 */                                   obj4 = obj;
/* 857 */                                   iOOOi1.I0111i(lii0OIO1o0i0.I00000oIO(iI00000oIO & 1048575, obj4));
/* 248 */                                   ii0ooi1ooli1 = ii0ooi1ooli13;
/* 249 */                                   obj2 = objI0001Ioi1lo2;
/* 1941 */                                  ii0ooi1ooli13 = ii0ooi1ooli1;
/* 1942 */                                  o1oO0lOoI12 = o1oO0lOoI1;
/* 1944 */                                  objI0001Ioi1lo2 = obj2;
                                        case 47:
/* 830 */                                   o1oO0lOoI1 = o1oO0lOoI12;
/* 832 */                                   obj4 = obj;
/* 841 */                                   iOOOi1.I011IOil(lii0OIO1o0i0.I00000oIO(iI00000oIO & 1048575, obj4));
/* 248 */                                   ii0ooi1ooli1 = ii0ooi1ooli13;
/* 249 */                                   obj2 = objI0001Ioi1lo2;
/* 1941 */                                  ii0ooi1ooli13 = ii0ooi1ooli1;
/* 1942 */                                  o1oO0lOoI12 = o1oO0lOoI1;
/* 1944 */                                  objI0001Ioi1lo2 = obj2;
                                        case 48:
/* 814 */                                   o1oO0lOoI1 = o1oO0lOoI12;
/* 816 */                                   obj4 = obj;
/* 825 */                                   iOOOi1.I011Io0I1ioi(lii0OIO1o0i0.I00000oIO(iI00000oIO & 1048575, obj4));
/* 248 */                                   ii0ooi1ooli1 = ii0ooi1ooli13;
/* 249 */                                   obj2 = objI0001Ioi1lo2;
/* 1941 */                                  ii0ooi1ooli13 = ii0ooi1ooli1;
/* 1942 */                                  o1oO0lOoI12 = o1oO0lOoI1;
/* 1944 */                                  objI0001Ioi1lo2 = obj2;
                                        case 49:
/* 794 */                                   o1oO0lOoI1 = o1oO0lOoI12;
/* 796 */                                   obj4 = obj;
/* 809 */                                   iOOOi1.I010II(lii0OIO1o0i0.I00000oIO(iI00000oIO & 1048575, obj4), ii0ooi1ooli13.I001lIiIIo1O(iI001IIilI0O), i1o0l0iVar);
/* 248 */                                   ii0ooi1ooli1 = ii0ooi1ooli13;
/* 249 */                                   obj2 = objI0001Ioi1lo2;
/* 1941 */                                  ii0ooi1ooli13 = ii0ooi1ooli1;
/* 1942 */                                  o1oO0lOoI12 = o1oO0lOoI1;
/* 1944 */                                  objI0001Ioi1lo2 = obj2;
                                        case 50:
/* 732 */                                   o1oO0lOoI1 = o1oO0lOoI12;
/* 734 */                                   obj4 = obj;
/* 736 */                                   Object objI001lllioOl = ii0ooi1ooli13.I001lllioOl(iI001IIilI0O);
/* 744 */                                   long jI00000oIO = ii0ooi1ooli13.I00000oIO(iI001IIilI0O) & 1048575;
/* 747 */                                   Object objI000O01llI0 = iI1Oili0OI.I000O01llI0(jI00000oIO, obj4);
/* 751 */                                   if (objI000O01llI0 == null) {
/* 755 */                                       objI000O01llI0 = iI0Ol0.I00iiI.I00000oIO();
/* 759 */                                       iI1Oili0OI.I000OOo1O(obj4, jI00000oIO, objI000O01llI0);
                                            } else if (!((iI0Ol0) objI000O01llI0).I00iOIl) {
/* 772 */                                       Object objI00000oIO = iI0Ol0.I00iiI.I00000oIO();
/* 776 */                                       lii10iIIooio.I00000oIO(objI00000oIO, objI000O01llI0);
/* 779 */                                       iI1Oili0OI.I000OOo1O(obj4, jI00000oIO, objI00000oIO);
/* 782 */                                       objI000O01llI0 = objI00000oIO;
                                            }
/* 789 */                                   iOOOi1.I011iO((iI0Ol0) objI000O01llI0, ((iI0OO101i0lO) objI001lllioOl).I00000oIO, i1o0l0iVar);
/* 248 */                                   ii0ooi1ooli1 = ii0ooi1ooli13;
/* 249 */                                   obj2 = objI0001Ioi1lo2;
/* 1941 */                                  ii0ooi1ooli13 = ii0ooi1ooli1;
/* 1942 */                                  o1oO0lOoI12 = o1oO0lOoI1;
/* 1944 */                                  objI0001Ioi1lo2 = obj2;
                                        case 51:
/* 706 */                                   o1oO0lOoI1 = o1oO0lOoI12;
/* 708 */                                   obj4 = obj;
/* 712 */                                   iOOOi1.I011lIilI0lo(1);
/* 724 */                                   iI1Oili0OI.I000OOo1O(obj4, iI00000oIO & 1048575, Double.valueOf(ioooio1o.I00IoiI()));
/* 727 */                                   ii0ooi1ooli13.I00111O(obj4, iI01IoO, iI001IIilI0O);
/* 248 */                                   ii0ooi1ooli1 = ii0ooi1ooli13;
/* 249 */                                   obj2 = objI0001Ioi1lo2;
/* 1941 */                                  ii0ooi1ooli13 = ii0ooi1ooli1;
/* 1942 */                                  o1oO0lOoI12 = o1oO0lOoI1;
/* 1944 */                                  objI0001Ioi1lo2 = obj2;
                                        case 52:
/* 679 */                                   o1oO0lOoI1 = o1oO0lOoI12;
/* 681 */                                   obj4 = obj;
/* 686 */                                   iOOOi1.I011lIilI0lo(5);
/* 698 */                                   iI1Oili0OI.I000OOo1O(obj4, iI00000oIO & 1048575, Float.valueOf(ioooio1o.I00Iooi00oi()));
/* 701 */                                   ii0ooi1ooli13.I00111O(obj4, iI01IoO, iI001IIilI0O);
/* 248 */                                   ii0ooi1ooli1 = ii0ooi1ooli13;
/* 249 */                                   obj2 = objI0001Ioi1lo2;
/* 1941 */                                  ii0ooi1ooli13 = ii0ooi1ooli1;
/* 1942 */                                  o1oO0lOoI12 = o1oO0lOoI1;
/* 1944 */                                  objI0001Ioi1lo2 = obj2;
                                        case 53:
/* 653 */                                   o1oO0lOoI1 = o1oO0lOoI12;
/* 655 */                                   obj4 = obj;
/* 659 */                                   iOOOi1.I011lIilI0lo(0);
/* 671 */                                   iI1Oili0OI.I000OOo1O(obj4, iI00000oIO & 1048575, Long.valueOf(ioooio1o.I00O0o1oo()));
/* 674 */                                   ii0ooi1ooli13.I00111O(obj4, iI01IoO, iI001IIilI0O);
/* 248 */                                   ii0ooi1ooli1 = ii0ooi1ooli13;
/* 249 */                                   obj2 = objI0001Ioi1lo2;
/* 1941 */                                  ii0ooi1ooli13 = ii0ooi1ooli1;
/* 1942 */                                  o1oO0lOoI12 = o1oO0lOoI1;
/* 1944 */                                  objI0001Ioi1lo2 = obj2;
                                        case 54:
/* 627 */                                   o1oO0lOoI1 = o1oO0lOoI12;
/* 629 */                                   obj4 = obj;
/* 633 */                                   iOOOi1.I011lIilI0lo(0);
/* 645 */                                   iI1Oili0OI.I000OOo1O(obj4, iI00000oIO & 1048575, Long.valueOf(ioooio1o.I00O0i0ii()));
/* 648 */                                   ii0ooi1ooli13.I00111O(obj4, iI01IoO, iI001IIilI0O);
/* 248 */                                   ii0ooi1ooli1 = ii0ooi1ooli13;
/* 249 */                                   obj2 = objI0001Ioi1lo2;
/* 1941 */                                  ii0ooi1ooli13 = ii0ooi1ooli1;
/* 1942 */                                  o1oO0lOoI12 = o1oO0lOoI1;
/* 1944 */                                  objI0001Ioi1lo2 = obj2;
                                        case 55:
/* 601 */                                   o1oO0lOoI1 = o1oO0lOoI12;
/* 603 */                                   obj4 = obj;
/* 607 */                                   iOOOi1.I011lIilI0lo(0);
/* 619 */                                   iI1Oili0OI.I000OOo1O(obj4, iI00000oIO & 1048575, Integer.valueOf(ioooio1o.I00O10llo()));
/* 622 */                                   ii0ooi1ooli13.I00111O(obj4, iI01IoO, iI001IIilI0O);
/* 248 */                                   ii0ooi1ooli1 = ii0ooi1ooli13;
/* 249 */                                   obj2 = objI0001Ioi1lo2;
/* 1941 */                                  ii0ooi1ooli13 = ii0ooi1ooli1;
/* 1942 */                                  o1oO0lOoI12 = o1oO0lOoI1;
/* 1944 */                                  objI0001Ioi1lo2 = obj2;
                                        case 56:
/* 575 */                                   o1oO0lOoI1 = o1oO0lOoI12;
/* 577 */                                   obj4 = obj;
/* 581 */                                   iOOOi1.I011lIilI0lo(1);
/* 593 */                                   iI1Oili0OI.I000OOo1O(obj4, iI00000oIO & 1048575, Long.valueOf(ioooio1o.I00OI1()));
/* 596 */                                   ii0ooi1ooli13.I00111O(obj4, iI01IoO, iI001IIilI0O);
/* 248 */                                   ii0ooi1ooli1 = ii0ooi1ooli13;
/* 249 */                                   obj2 = objI0001Ioi1lo2;
/* 1941 */                                  ii0ooi1ooli13 = ii0ooi1ooli1;
/* 1942 */                                  o1oO0lOoI12 = o1oO0lOoI1;
/* 1944 */                                  objI0001Ioi1lo2 = obj2;
                                        case 57:
/* 548 */                                   o1oO0lOoI1 = o1oO0lOoI12;
/* 550 */                                   obj4 = obj;
/* 555 */                                   iOOOi1.I011lIilI0lo(5);
/* 567 */                                   iI1Oili0OI.I000OOo1O(obj4, iI00000oIO & 1048575, Integer.valueOf(ioooio1o.I00OIO1()));
/* 570 */                                   ii0ooi1ooli13.I00111O(obj4, iI01IoO, iI001IIilI0O);
/* 248 */                                   ii0ooi1ooli1 = ii0ooi1ooli13;
/* 249 */                                   obj2 = objI0001Ioi1lo2;
/* 1941 */                                  ii0ooi1ooli13 = ii0ooi1ooli1;
/* 1942 */                                  o1oO0lOoI12 = o1oO0lOoI1;
/* 1944 */                                  objI0001Ioi1lo2 = obj2;
                                        case 58:
/* 522 */                                   o1oO0lOoI1 = o1oO0lOoI12;
/* 524 */                                   obj4 = obj;
/* 528 */                                   iOOOi1.I011lIilI0lo(0);
/* 540 */                                   iI1Oili0OI.I000OOo1O(obj4, iI00000oIO & 1048575, Boolean.valueOf(ioooio1o.I00OIl()));
/* 543 */                                   ii0ooi1ooli13.I00111O(obj4, iI01IoO, iI001IIilI0O);
/* 248 */                                   ii0ooi1ooli1 = ii0ooi1ooli13;
/* 249 */                                   obj2 = objI0001Ioi1lo2;
/* 1941 */                                  ii0ooi1ooli13 = ii0ooi1ooli1;
/* 1942 */                                  o1oO0lOoI12 = o1oO0lOoI1;
/* 1944 */                                  objI0001Ioi1lo2 = obj2;
                                        case 59:
/* 510 */                                   o1oO0lOoI1 = o1oO0lOoI12;
/* 512 */                                   obj4 = obj;
/* 514 */                                   ii0ooi1ooli13.I00IioO0OiOi(iI00000oIO, iOOOi1, obj4);
/* 517 */                                   ii0ooi1ooli13.I00111O(obj4, iI01IoO, iI001IIilI0O);
/* 248 */                                   ii0ooi1ooli1 = ii0ooi1ooli13;
/* 249 */                                   obj2 = objI0001Ioi1lo2;
/* 1941 */                                  ii0ooi1ooli13 = ii0ooi1ooli1;
/* 1942 */                                  o1oO0lOoI12 = o1oO0lOoI1;
/* 1944 */                                  objI0001Ioi1lo2 = obj2;
                                        case 60:
/* 484 */                                   o1oO0lOoI1 = o1oO0lOoI12;
/* 486 */                                   obj4 = obj;
/* 492 */                                   i1ilO0II i1ilo0ii3 = (i1ilO0II) ii0ooi1ooli13.I00IO1(obj4, iI01IoO, iI001IIilI0O);
/* 494 */                                   iI110OIoiOl ii110oioiolI001lIiIIo1O3 = ii0ooi1ooli13.I001lIiIIo1O(iI001IIilI0O);
/* 499 */                                   iOOOi1.I011lIilI0lo(2);
/* 502 */                                   iOOOi1.I011olOoO(i1ilo0ii3, ii110oioiolI001lIiIIo1O3, i1o0l0iVar);
/* 505 */                                   ii0ooi1ooli13.I00IO1oi11O(obj4, iI01IoO, iI001IIilI0O, i1ilo0ii3);
/* 248 */                                   ii0ooi1ooli1 = ii0ooi1ooli13;
/* 249 */                                   obj2 = objI0001Ioi1lo2;
/* 1941 */                                  ii0ooi1ooli13 = ii0ooi1ooli1;
/* 1942 */                                  o1oO0lOoI12 = o1oO0lOoI1;
/* 1944 */                                  objI0001Ioi1lo2 = obj2;
                                        case 61:
/* 465 */                                   o1oO0lOoI1 = o1oO0lOoI12;
/* 467 */                                   obj4 = obj;
/* 476 */                                   iI1Oili0OI.I000OOo1O(obj4, iI00000oIO & 1048575, iOOOi1.I01OIo());
/* 479 */                                   ii0ooi1ooli13.I00111O(obj4, iI01IoO, iI001IIilI0O);
/* 248 */                                   ii0ooi1ooli1 = ii0ooi1ooli13;
/* 249 */                                   obj2 = objI0001Ioi1lo2;
/* 1941 */                                  ii0ooi1ooli13 = ii0ooi1ooli1;
/* 1942 */                                  o1oO0lOoI12 = o1oO0lOoI1;
/* 1944 */                                  objI0001Ioi1lo2 = obj2;
                                        case 62:
/* 439 */                                   o1oO0lOoI1 = o1oO0lOoI12;
/* 441 */                                   obj4 = obj;
/* 445 */                                   iOOOi1.I011lIilI0lo(0);
/* 457 */                                   iI1Oili0OI.I000OOo1O(obj4, iI00000oIO & 1048575, Integer.valueOf(ioooio1o.I00Ol00()));
/* 460 */                                   ii0ooi1ooli13.I00111O(obj4, iI01IoO, iI001IIilI0O);
/* 248 */                                   ii0ooi1ooli1 = ii0ooi1ooli13;
/* 249 */                                   obj2 = objI0001Ioi1lo2;
/* 1941 */                                  ii0ooi1ooli13 = ii0ooi1ooli1;
/* 1942 */                                  o1oO0lOoI12 = o1oO0lOoI1;
/* 1944 */                                  objI0001Ioi1lo2 = obj2;
                                        case 63:
/* 368 */                                   o1oO0lOoI1 = o1oO0lOoI12;
/* 370 */                                   obj4 = obj;
/* 372 */                                   iOOOi1.I011lIilI0lo(0);
/* 375 */                                   int iI00Ol102 = ioooio1o.I00Ol10();
/* 379 */                                   i1iOOl0o i1iool0oI001lloI3 = ii0ooi1ooli13.I001lloI(iI001IIilI0O);
/* 383 */                                   if (i1iool0oI001lloI3 != null && !i1iool0oI001lloI3.I00000oIO(iI00Ol102)) {
/* 392 */                                       O1oO0lOoI1 o1oO0lOoI14 = iI111lOOO.I00000oIO;
/* 394 */                                       if (objI0001Ioi1lo2 == null) {
/* 396 */                                           o1oO0lOoI1.getClass();
/* 399 */                                           objI0001Ioi1lo = O1oO0lOoI1.I0001Ioi1lo(obj4);
                                                } else {
/* 404 */                                           objI0001Ioi1lo = objI0001Ioi1lo2;
                                                }
/* 406 */                                       o1oO0lOoI1.getClass();
/* 418 */                                       ((iI1O01I1) objI0001Ioi1lo).I0000O(iI01IoO << 3, Long.valueOf(iI00Ol102));
/* 421 */                                       objI0001Ioi1lo2 = objI0001Ioi1lo;
/* 202 */                                       o1oO0lOoI12 = o1oO0lOoI1;
                                            }
/* 431 */                                   iI1Oili0OI.I000OOo1O(obj4, iI00000oIO & 1048575, Integer.valueOf(iI00Ol102));
/* 434 */                                   ii0ooi1ooli13.I00111O(obj4, iI01IoO, iI001IIilI0O);
/* 248 */                                   ii0ooi1ooli1 = ii0ooi1ooli13;
/* 249 */                                   obj2 = objI0001Ioi1lo2;
/* 1941 */                                  ii0ooi1ooli13 = ii0ooi1ooli1;
/* 1942 */                                  o1oO0lOoI12 = o1oO0lOoI1;
/* 1944 */                                  objI0001Ioi1lo2 = obj2;
                                            break;
                                        case Barcode.FORMAT_EAN_8:
/* 342 */                                   o1oO0lOoI1 = o1oO0lOoI12;
/* 344 */                                   obj4 = obj;
/* 349 */                                   iOOOi1.I011lIilI0lo(5);
/* 361 */                                   iI1Oili0OI.I000OOo1O(obj4, iI00000oIO & 1048575, Integer.valueOf(ioooio1o.I00Ol1ll1()));
/* 364 */                                   ii0ooi1ooli13.I00111O(obj4, iI01IoO, iI001IIilI0O);
/* 248 */                                   ii0ooi1ooli1 = ii0ooi1ooli13;
/* 249 */                                   obj2 = objI0001Ioi1lo2;
/* 1941 */                                  ii0ooi1ooli13 = ii0ooi1ooli1;
/* 1942 */                                  o1oO0lOoI12 = o1oO0lOoI1;
/* 1944 */                                  objI0001Ioi1lo2 = obj2;
                                        case 65:
/* 317 */                                   o1oO0lOoI1 = o1oO0lOoI12;
/* 319 */                                   obj4 = obj;
/* 323 */                                   iOOOi1.I011lIilI0lo(1);
/* 335 */                                   iI1Oili0OI.I000OOo1O(obj4, iI00000oIO & 1048575, Long.valueOf(ioooio1o.I00OloOo()));
/* 338 */                                   ii0ooi1ooli13.I00111O(obj4, iI01IoO, iI001IIilI0O);
/* 248 */                                   ii0ooi1ooli1 = ii0ooi1ooli13;
/* 249 */                                   obj2 = objI0001Ioi1lo2;
/* 1941 */                                  ii0ooi1ooli13 = ii0ooi1ooli1;
/* 1942 */                                  o1oO0lOoI12 = o1oO0lOoI1;
/* 1944 */                                  objI0001Ioi1lo2 = obj2;
                                        case 66:
/* 292 */                                   o1oO0lOoI1 = o1oO0lOoI12;
/* 294 */                                   obj4 = obj;
/* 298 */                                   iOOOi1.I011lIilI0lo(0);
/* 310 */                                   iI1Oili0OI.I000OOo1O(obj4, iI00000oIO & 1048575, Integer.valueOf(ioooio1o.I00i01iIIliI()));
/* 313 */                                   ii0ooi1ooli13.I00111O(obj4, iI01IoO, iI001IIilI0O);
/* 248 */                                   ii0ooi1ooli1 = ii0ooi1ooli13;
/* 249 */                                   obj2 = objI0001Ioi1lo2;
/* 1941 */                                  ii0ooi1ooli13 = ii0ooi1ooli1;
/* 1942 */                                  o1oO0lOoI12 = o1oO0lOoI1;
/* 1944 */                                  objI0001Ioi1lo2 = obj2;
                                        case 67:
/* 267 */                                   o1oO0lOoI1 = o1oO0lOoI12;
/* 269 */                                   obj4 = obj;
/* 273 */                                   iOOOi1.I011lIilI0lo(0);
/* 285 */                                   iI1Oili0OI.I000OOo1O(obj4, iI00000oIO & 1048575, Long.valueOf(ioooio1o.I00i0O()));
/* 288 */                                   ii0ooi1ooli13.I00111O(obj4, iI01IoO, iI001IIilI0O);
/* 248 */                                   ii0ooi1ooli1 = ii0ooi1ooli13;
/* 249 */                                   obj2 = objI0001Ioi1lo2;
/* 1941 */                                  ii0ooi1ooli13 = ii0ooi1ooli1;
/* 1942 */                                  o1oO0lOoI12 = o1oO0lOoI1;
/* 1944 */                                  objI0001Ioi1lo2 = obj2;
                                        case 68:
/* 225 */                                   o1oO0lOoI1 = o1oO0lOoI12;
/* 227 */                                   obj4 = obj;
                                            try {
/* 233 */                                       i1ilO0II i1ilo0ii4 = (i1ilO0II) ii0ooi1ooli13.I00IO1(obj4, iI01IoO, iI001IIilI0O);
/* 235 */                                       iI110OIoiOl ii110oioiolI001lIiIIo1O4 = ii0ooi1ooli13.I001lIiIIo1O(iI001IIilI0O);
/* 239 */                                       iOOOi1.I011lIilI0lo(3);
/* 242 */                                       iOOOi1.I01IO0oio(i1ilo0ii4, ii110oioiolI001lIiIIo1O4, i1o0l0iVar);
/* 245 */                                       ii0ooi1ooli13.I00IO1oi11O(obj4, iI01IoO, iI001IIilI0O, i1ilo0ii4);
/* 248 */                                       ii0ooi1ooli1 = ii0ooi1ooli13;
/* 249 */                                       obj2 = objI0001Ioi1lo2;
/* 1941 */                                      ii0ooi1ooli13 = ii0ooi1ooli1;
/* 1942 */                                      o1oO0lOoI12 = o1oO0lOoI1;
/* 1944 */                                      objI0001Ioi1lo2 = obj2;
                                            } catch (iI00ilIl1I unused8) {
/* 261 */                                       ii0ooi1ooli1 = ii0ooi1ooli13;
/* 262 */                                       obj2 = objI0001Ioi1lo2;
/* 264 */                                       obj3 = obj4;
/* 1961 */                                      objI0001Ioi1lo2 = obj2;
/* 1963 */                                      if (objI0001Ioi1lo2 == null) {
                                                }
/* 1973 */                                      o1oO0lOoI1.getClass();
/* 1980 */                                      if (O1oO0lOoI1.I000II(0, iOOOi1, objI0001Ioi1lo2)) {
                                                }
                                            } catch (Throwable th8) {
/* 254 */                                       th = th8;
/* 255 */                                       obj2 = objI0001Ioi1lo2;
/* 257 */                                       o1oO0lOoI12 = o1oO0lOoI1;
/* 2025 */                                      objI0001Ioi1lo2 = obj2;
/* 2027 */                                      objI00IOO = objI0001Ioi1lo2;
/* 2028 */                                      while (i2 < i) {
                                                }
/* 2045 */                                      if (objI00IOO != null) {
                                                }
/* 2058 */                                      throw th;
                                            }
                                            break;
                                        default:
/* 140 */                                   if (objI0001Ioi1lo2 == null) {
/* 142 */                                       o1oO0lOoI12.getClass();
/* 145 */                                       objI0001Ioi1lo2 = O1oO0lOoI1.I0001Ioi1lo(obj);
                                            }
                                            try {
/* 160 */                                       o1oO0lOoI12.getClass();
                                            } catch (iI00ilIl1I unused9) {
/* 212 */                                       o1oO0lOoI1 = o1oO0lOoI12;
/* 221 */                                       ii0ooi1ooli1 = ii0ooi1ooli13;
/* 222 */                                       obj3 = obj;
/* 1963 */                                      if (objI0001Ioi1lo2 == null) {
                                                }
/* 1973 */                                      o1oO0lOoI1.getClass();
/* 1980 */                                      if (O1oO0lOoI1.I000II(0, iOOOi1, objI0001Ioi1lo2)) {
                                                }
                                            } catch (Throwable th9) {
/* 206 */                                       th = th9;
/* 207 */                                       o1oO0lOoI1 = o1oO0lOoI12;
/* 217 */                                       o1oO0lOoI12 = o1oO0lOoI1;
/* 2027 */                                      objI00IOO = objI0001Ioi1lo2;
/* 2028 */                                      while (i2 < i) {
                                                }
/* 2045 */                                      if (objI00IOO != null) {
                                                }
/* 2058 */                                      throw th;
                                            }
/* 167 */                                   if (!O1oO0lOoI1.I000II(0, iOOOi1, objI0001Ioi1lo2)) {
/* 169 */                                       objI00IOO2 = objI0001Ioi1lo2;
/* 170 */                                       while (i2 < i) {
/* 178 */                                           objI00IOO2 = ii0ooi1ooli13.I00IOO(obj, iArr[i2], objI00IOO2, o1oO0lOoI12, obj);
/* 185 */                                           i2++;
/* 187 */                                           o1oO0lOoI12 = o1oO0lOoI12;
                                                }
/* 190 */                                       o1oO0lOoI1 = o1oO0lOoI12;
                                                break;
                                            } else {
/* 198 */                                       o1oO0lOoI1 = o1oO0lOoI12;
/* 202 */                                       o1oO0lOoI12 = o1oO0lOoI1;
                                            }
                                            break;
                                    }
                                } catch (Throwable th10) {
/* 1952 */                          th = th10;
/* 1954 */                          obj2 = objI0001Ioi1lo2;
                                }
                            } else if (iI01IoO == Integer.MAX_VALUE) {
/* 56 */                        objI00IOO2 = objI0001Ioi1lo2;
/* 57 */                        while (i2 < i) {
/* 65 */                            objI00IOO2 = ii0ooi1ooli13.I00IOO(obj, iArr[i2], objI00IOO2, o1oO0lOoI12, obj);
/* 69 */                            i2++;
/* 71 */                            ii0ooi1ooli13 = this;
                                }
                            } else {
/* 74 */                        if (objI0001Ioi1lo2 == null) {
/* 76 */                            o1oO0lOoI12.getClass();
/* 79 */                            objI0001Ioi1lo2 = O1oO0lOoI1.I0001Ioi1lo(obj);
                                }
                                try {
/* 89 */                            o1oO0lOoI12.getClass();
/* 96 */                            if (O1oO0lOoI1.I000II(0, iOOOi1, objI0001Ioi1lo2)) {
/* 116 */                               ii0ooi1ooli13 = this;
                                    } else {
/* 98 */                                objI00IOO2 = objI0001Ioi1lo2;
/* 99 */                                while (i2 < i) {
/* 109 */                                   objI00IOO2 = I00IOO(obj, iArr[i2], objI00IOO2, o1oO0lOoI12, obj);
/* 113 */                                   i2++;
                                        }
                                    }
                                } catch (Throwable th11) {
/* 119 */                           th = th11;
/* 2027 */                          objI00IOO = objI0001Ioi1lo2;
/* 2028 */                          while (i2 < i) {
                                    }
/* 2045 */                          if (objI00IOO != null) {
                                    }
/* 2058 */                          throw th;
                                }
                            }
                        } catch (Throwable th12) {
/* 953 */                   th = th12;
                        }
                    }
/* 194 */           o1oO0lOoI12 = o1oO0lOoI1;
/* 2004 */          if (objI00IOO2 == null) {
/* 2006 */              o1oO0lOoI12.getClass();
/* 2015 */              ((i1oi01OllI) obj).zzc = (iI1O01I1) objI00IOO2;
                    }
                }

                @Override
                public final void I000II(Object obj, byte[] bArr, int i, int i2, i1O1ll0i0 i1o1ll0i0) throws iI00lI {
/* 8 */             I001i1O0Ol(obj, bArr, i, i2, 0, i1o1ll0i0);
                }

                @Override
                public final int I000O01llI0(i1oi01OllI i1oi01olli) {
                    int i;
                    long jDoubleToLongBits;
                    int i2;
                    int iFloatToIntBits;
                    int i3;
                    int i4;
/* 3 */             int iHashCode = 0;
/* 10 */            for (int i5 = 0; i5 < this.I00000oIO.length; i5 += 3) {
/* 12 */                int iI00000oIO = I00000oIO(i5);
/* 16 */                int iI00000oOI = I00000oOI(iI00000oIO);
/* 22 */                if (iI00000oOI <= 50 || iI00000oOI >= 69) {
/* 28 */                    long j = iI00000oIO & 1048575;
/* 30 */                    int iHashCode2 = 37;
                            switch (iI00000oOI) {
                                case 0:
/* 244 */                           i = iHashCode * 53;
/* 252 */                           jDoubleToLongBits = Double.doubleToLongBits(iI1Oili0OI.I0000Il00O.I00IO1oi11O(j, i1oi01olli));
/* 256 */                           byte[] bArr = iI000IO.I00000oIO;
/* 89 */                            i3 = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
/* 90 */                            iHashCode = i + i3;
                                    break;
                                case 1:
/* 230 */                           i2 = iHashCode * 53;
/* 238 */                           iFloatToIntBits = Float.floatToIntBits(iI1Oili0OI.I0000Il00O.I001l0I00(j, i1oi01olli));
/* 49 */                            iHashCode = i2 + iFloatToIntBits;
                                    break;
                                case 2:
/* 220 */                           i = iHashCode * 53;
/* 222 */                           jDoubleToLongBits = iI1Oili0OI.I0001Ioi1lo(j, i1oi01olli);
/* 226 */                           byte[] bArr2 = iI000IO.I00000oIO;
/* 89 */                            i3 = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
/* 90 */                            iHashCode = i + i3;
                                    break;
                                case 3:
/* 210 */                           i = iHashCode * 53;
/* 212 */                           jDoubleToLongBits = iI1Oili0OI.I0001Ioi1lo(j, i1oi01olli);
/* 216 */                           byte[] bArr3 = iI000IO.I00000oIO;
/* 89 */                            i3 = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
/* 90 */                            iHashCode = i + i3;
                                    break;
                                case 4:
/* 202 */                           i2 = iHashCode * 53;
/* 204 */                           iFloatToIntBits = iI1Oili0OI.I0000O(i1oi01olli, j);
/* 49 */                            iHashCode = i2 + iFloatToIntBits;
                                    break;
                                case 5:
/* 193 */                           i = iHashCode * 53;
/* 195 */                           jDoubleToLongBits = iI1Oili0OI.I0001Ioi1lo(j, i1oi01olli);
/* 199 */                           byte[] bArr4 = iI000IO.I00000oIO;
/* 89 */                            i3 = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
/* 90 */                            iHashCode = i + i3;
                                    break;
                                case 6:
/* 185 */                           i2 = iHashCode * 53;
/* 187 */                           iFloatToIntBits = iI1Oili0OI.I0000O(i1oi01olli, j);
/* 49 */                            iHashCode = i2 + iFloatToIntBits;
                                    break;
                                case 7:
/* 167 */                           i = iHashCode * 53;
/* 171 */                           boolean zI001i1O0Ol = iI1Oili0OI.I0000Il00O.I001i1O0Ol(j, i1oi01olli);
/* 175 */                           byte[] bArr5 = iI000IO.I00000oIO;
/* 182 */                           i3 = zI001i1O0Ol ? 1231 : 1237;
/* 90 */                            iHashCode = i + i3;
                                    break;
                                case 8:
/* 154 */                           i2 = iHashCode * 53;
/* 162 */                           iFloatToIntBits = ((String) iI1Oili0OI.I000O01llI0(j, i1oi01olli)).hashCode();
/* 49 */                            iHashCode = i2 + iFloatToIntBits;
                                    break;
                                case 9:
/* 141 */                           i4 = iHashCode * 53;
/* 143 */                           Object objI000O01llI0 = iI1Oili0OI.I000O01llI0(j, i1oi01olli);
/* 147 */                           if (objI000O01llI0 != null) {
/* 149 */                               iHashCode2 = objI000O01llI0.hashCode();
                                    }
/* 75 */                            iHashCode = i4 + iHashCode2;
                                    break;
                                case 10:
/* 130 */                           i2 = iHashCode * 53;
/* 136 */                           iFloatToIntBits = iI1Oili0OI.I000O01llI0(j, i1oi01olli).hashCode();
/* 49 */                            iHashCode = i2 + iFloatToIntBits;
                                    break;
                                case 11:
/* 123 */                           i2 = iHashCode * 53;
/* 125 */                           iFloatToIntBits = iI1Oili0OI.I0000O(i1oi01olli, j);
/* 49 */                            iHashCode = i2 + iFloatToIntBits;
                                    break;
                                case 12:
/* 116 */                           i2 = iHashCode * 53;
/* 118 */                           iFloatToIntBits = iI1Oili0OI.I0000O(i1oi01olli, j);
/* 49 */                            iHashCode = i2 + iFloatToIntBits;
                                    break;
                                case 13:
/* 109 */                           i2 = iHashCode * 53;
/* 111 */                           iFloatToIntBits = iI1Oili0OI.I0000O(i1oi01olli, j);
/* 49 */                            iHashCode = i2 + iFloatToIntBits;
                                    break;
                                case 14:
/* 100 */                           i = iHashCode * 53;
/* 102 */                           jDoubleToLongBits = iI1Oili0OI.I0001Ioi1lo(j, i1oi01olli);
/* 106 */                           byte[] bArr6 = iI000IO.I00000oIO;
/* 89 */                            i3 = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
/* 90 */                            iHashCode = i + i3;
                                    break;
                                case 15:
/* 93 */                            i2 = iHashCode * 53;
/* 95 */                            iFloatToIntBits = iI1Oili0OI.I0000O(i1oi01olli, j);
/* 49 */                            iHashCode = i2 + iFloatToIntBits;
                                    break;
                                case 16:
/* 78 */                            i = iHashCode * 53;
/* 80 */                            jDoubleToLongBits = iI1Oili0OI.I0001Ioi1lo(j, i1oi01olli);
/* 84 */                            byte[] bArr7 = iI000IO.I00000oIO;
/* 89 */                            i3 = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
/* 90 */                            iHashCode = i + i3;
                                    break;
                                case 17:
/* 63 */                            i4 = iHashCode * 53;
/* 65 */                            Object objI000O01llI02 = iI1Oili0OI.I000O01llI0(j, i1oi01olli);
/* 69 */                            if (objI000O01llI02 != null) {
/* 71 */                                iHashCode2 = objI000O01llI02.hashCode();
                                    }
/* 75 */                            iHashCode = i4 + iHashCode2;
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
/* 52 */                            i2 = iHashCode * 53;
/* 58 */                            iFloatToIntBits = iI1Oili0OI.I000O01llI0(j, i1oi01olli).hashCode();
/* 49 */                            iHashCode = i2 + iFloatToIntBits;
                                    break;
                                case 50:
/* 39 */                            i2 = iHashCode * 53;
/* 45 */                            iFloatToIntBits = iI1Oili0OI.I000O01llI0(j, i1oi01olli).hashCode();
/* 49 */                            iHashCode = i2 + iFloatToIntBits;
                                    break;
                            }
                        }
                    }
/* 264 */           int i6 = this.I000OOo1O;
                    while (true) {
/* 266 */               int[] iArr = this.I000II;
/* 269 */               if (i6 >= iArr.length) {
/* 308 */                   return i1oi01olli.zzc.hashCode() + (iHashCode * 53);
                        }
/* 277 */               if (!I0010o(i1oi01olli, 0, iArr[i6])) {
/* 295 */                   iHashCode = iI1Oili0OI.I000O01llI0(I00000oIO(r3) & 1048575, i1oi01olli).hashCode() + (iHashCode * 53);
                        }
/* 297 */               i6++;
                    }
                }

                /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
                @Override
                public final void I000OOo1O(Object obj, Oi1ol0llI oi1ol0llI) {
                    int i;
                    int i2;
                    boolean z;
/* 1 */             iI0oOI1oolI1 ii0ooi1ooli1 = this;
/* 10 */            i1lllO0 i1lllo0 = (i1lllO0) oi1ol0llI.I00iiI;
/* 12 */            int[] iArr = ii0ooi1ooli1.I00000oIO;
/* 14 */            int i3 = 1048575;
/* 17 */            int i4 = 1048575;
/* 18 */            int i5 = 0;
/* 19 */            int i6 = 0;
/* 21 */            while (i5 < iArr.length) {
/* 23 */                int iI00000oIO = ii0ooi1ooli1.I00000oIO(i5);
/* 27 */                int iI00000oOI = I00000oOI(iI00000oIO);
/* 31 */                int i7 = iArr[i5];
/* 36 */                Unsafe unsafe = I000l1;
/* 38 */                if (iI00000oOI <= 17) {
/* 42 */                    int i8 = iArr[i5 + 2];
/* 44 */                    int i9 = i8 & i3;
/* 46 */                    if (i9 != i4) {
/* 53 */                        i6 = i9 == i3 ? 0 : unsafe.getInt(obj, i9);
/* 58 */                        i4 = i9;
                            }
/* 65 */                    i = iI00000oIO;
/* 61 */                    i2 = 1 << (i8 >>> 20);
                        } else {
/* 69 */                    i = iI00000oIO;
/* 70 */                    i2 = 0;
                        }
/* 71 */                long j = i & i3;
                        switch (iI00000oOI) {
                            case 0:
/* 1372 */                      if (ii0ooi1ooli1.I00100l0(obj, i5, i4, i6, i2)) {
/* 1384 */                          i1lllo0.I000OOo1O(i7, Double.doubleToRawLongBits(iI1Oili0OI.I0000Il00O.I00IO1oi11O(j, obj)));
                                    break;
                                } else {
                                    break;
                                }
                            case 1:
/* 1351 */                      if (ii0ooi1ooli1.I00100l0(obj, i5, i4, i6, i2)) {
/* 1363 */                          i1lllo0.I000II(i7, Float.floatToRawIntBits(iI1Oili0OI.I0000Il00O.I001l0I00(j, obj)));
                                    break;
                                } else {
                                    break;
                                }
                            case 2:
/* 1336 */                      if (ii0ooi1ooli1.I00100l0(obj, i5, i4, i6, i2)) {
/* 1342 */                          i1lllo0.I000O01llI0(i7, unsafe.getLong(obj, j));
                                    break;
                                } else {
                                    break;
                                }
                            case 3:
/* 1321 */                      if (ii0ooi1ooli1.I00100l0(obj, i5, i4, i6, i2)) {
/* 1327 */                          i1lllo0.I000O01llI0(i7, unsafe.getLong(obj, j));
                                    break;
                                } else {
                                    break;
                                }
                            case 4:
/* 1306 */                      if (ii0ooi1ooli1.I00100l0(obj, i5, i4, i6, i2)) {
/* 1312 */                          i1lllo0.I0000oI00(i7, unsafe.getInt(obj, j));
                                    break;
                                } else {
                                    break;
                                }
                            case 5:
/* 1291 */                      if (ii0ooi1ooli1.I00100l0(obj, i5, i4, i6, i2)) {
/* 1297 */                          i1lllo0.I000OOo1O(i7, unsafe.getLong(obj, j));
                                    break;
                                } else {
                                    break;
                                }
                            case 6:
/* 1276 */                      if (ii0ooi1ooli1.I00100l0(obj, i5, i4, i6, i2)) {
/* 1282 */                          i1lllo0.I000II(i7, unsafe.getInt(obj, j));
                                    break;
                                } else {
                                    break;
                                }
                            case 7:
/* 1258 */                      if (ii0ooi1ooli1.I00100l0(obj, i5, i4, i6, i2)) {
/* 1266 */                          i1lllo0.I000OiO(i7, iI1Oili0OI.I0000Il00O.I001i1O0Ol(j, obj));
                                    break;
                                } else {
                                    break;
                                }
                            case 8:
/* 1229 */                      if (ii0ooi1ooli1.I00100l0(obj, i5, i4, i6, i2)) {
/* 1231 */                          Object object = unsafe.getObject(obj, j);
/* 1237 */                          if (object instanceof String) {
/* 1241 */                              i1lllo0.I000iOII(i7, (String) object);
                                        break;
                                    } else {
/* 1248 */                              i1lllo0.I000l1(i7, (i1lIIl01O) object);
                                        break;
                                    }
                                } else {
                                    break;
                                }
                            case 9:
/* 1209 */                      if (ii0ooi1ooli1.I00100l0(obj, i5, i4, i6, i2)) {
/* 1219 */                          oi1ol0llI.I0010o(i7, unsafe.getObject(obj, j), ii0ooi1ooli1.I001lIiIIo1O(i5));
                                    break;
                                } else {
                                    break;
                                }
                            case 10:
/* 1191 */                      if (ii0ooi1ooli1.I00100l0(obj, i5, i4, i6, i2)) {
/* 1199 */                          i1lllo0.I000l1(i7, (i1lIIl01O) unsafe.getObject(obj, j));
                                    break;
                                } else {
                                    break;
                                }
                            case 11:
/* 1175 */                      if (ii0ooi1ooli1.I00100l0(obj, i5, i4, i6, i2)) {
/* 1181 */                          i1lllo0.I0001Ioi1lo(i7, unsafe.getInt(obj, j));
                                    break;
                                } else {
                                    break;
                                }
                            case 12:
/* 1159 */                      if (ii0ooi1ooli1.I00100l0(obj, i5, i4, i6, i2)) {
/* 1165 */                          i1lllo0.I0000oI00(i7, unsafe.getInt(obj, j));
                                    break;
                                } else {
                                    break;
                                }
                            case 13:
/* 1143 */                      if (ii0ooi1ooli1.I00100l0(obj, i5, i4, i6, i2)) {
/* 1149 */                          i1lllo0.I000II(i7, unsafe.getInt(obj, j));
                                    break;
                                } else {
                                    break;
                                }
                            case 14:
/* 1127 */                      if (ii0ooi1ooli1.I00100l0(obj, i5, i4, i6, i2)) {
/* 1133 */                          i1lllo0.I000OOo1O(i7, unsafe.getLong(obj, j));
                                    break;
                                } else {
                                    break;
                                }
                            case 15:
/* 1106 */                      if (ii0ooi1ooli1.I00100l0(obj, i5, i4, i6, i2)) {
/* 1108 */                          int i10 = unsafe.getInt(obj, j);
/* 1117 */                          i1lllo0.I0001Ioi1lo(i7, (i10 >> 31) ^ (i10 + i10));
                                    break;
                                } else {
                                    break;
                                }
                            case 16:
/* 1085 */                      if (ii0ooi1ooli1.I00100l0(obj, i5, i4, i6, i2)) {
/* 1087 */                          long j2 = unsafe.getLong(obj, j);
/* 1096 */                          i1lllo0.I000O01llI0(i7, (j2 >> 63) ^ (j2 + j2));
                                    break;
                                } else {
                                    break;
                                }
                            case 17:
/* 1057 */                      if (ii0ooi1ooli1.I00100l0(obj, i5, i4, i6, i2)) {
/* 1059 */                          Object object2 = unsafe.getObject(obj, j);
/* 1069 */                          i1lllo0.I0000O(i7, 3);
/* 1072 */                          ii0ooi1ooli1.I001lIiIIo1O(i5).I000OOo1O((i1ilO0II) object2, oi1ol0llI);
/* 1075 */                          i1lllo0.I0000O(i7, 4);
                                    break;
                                } else {
                                    break;
                                }
                            case PoseLandmark.RIGHT_PINKY:
/* 1047 */                      iI111lOOO.I0000O(iArr[i5], (List) unsafe.getObject(obj, j), oi1ol0llI, false);
                                break;
                            case PoseLandmark.LEFT_INDEX:
/* 1033 */                      iI111lOOO.I0000oI00(iArr[i5], (List) unsafe.getObject(obj, j), oi1ol0llI, false);
                                break;
                            case PoseLandmark.RIGHT_INDEX:
/* 1019 */                      iI111lOOO.I0001Ioi1lo(iArr[i5], (List) unsafe.getObject(obj, j), oi1ol0llI, false);
                                break;
                            case PoseLandmark.LEFT_THUMB:
/* 1005 */                      iI111lOOO.I000II(iArr[i5], (List) unsafe.getObject(obj, j), oi1ol0llI, false);
                                break;
                            case PoseLandmark.RIGHT_THUMB:
/* 991 */                       iI111lOOO.I000iOII(iArr[i5], (List) unsafe.getObject(obj, j), oi1ol0llI, false);
                                break;
                            case PoseLandmark.LEFT_HIP:
/* 977 */                       iI111lOOO.I000OOo1O(iArr[i5], (List) unsafe.getObject(obj, j), oi1ol0llI, false);
                                break;
                            case PoseLandmark.RIGHT_HIP:
/* 963 */                       iI111lOOO.I000o00OoI0I(iArr[i5], (List) unsafe.getObject(obj, j), oi1ol0llI, false);
                                break;
                            case PoseLandmark.LEFT_KNEE:
/* 949 */                       iI111lOOO.I00100o1O0lo(iArr[i5], (List) unsafe.getObject(obj, j), oi1ol0llI, false);
                                break;
                            case PoseLandmark.RIGHT_KNEE:
/* 867 */                       int i11 = iArr[i5];
/* 873 */                       List list = (List) unsafe.getObject(obj, j);
/* 875 */                       O1oO0lOoI1 o1oO0lOoI1 = iI111lOOO.I00000oIO;
/* 877 */                       if (list != null && !list.isEmpty()) {
/* 887 */                           if (list instanceof iI0II1iil) {
/* 890 */                               iI0II1iil ii0ii1iil = (iI0II1iil) list;
/* 897 */                               for (int i12 = 0; i12 < list.size(); i12++) {
/* 899 */                                   Object objZzc = ii0ii1iil.zzc();
/* 905 */                                   if (objZzc instanceof String) {
/* 909 */                                       i1lllo0.I000iOII(i11, (String) objZzc);
                                            } else {
/* 915 */                                       i1lllo0.I000l1(i11, (i1lIIl01O) objZzc);
                                            }
                                        }
                                    } else {
/* 926 */                               for (int i13 = 0; i13 < list.size(); i13++) {
/* 934 */                                   i1lllo0.I000iOII(i11, (String) list.get(i13));
                                        }
                                    }
                                }
                                break;
                            case 27:
/* 828 */                       int i14 = iArr[i5];
/* 834 */                       List list2 = (List) unsafe.getObject(obj, j);
/* 836 */                       iI110OIoiOl ii110oioiolI001lIiIIo1O = ii0ooi1ooli1.I001lIiIIo1O(i5);
/* 840 */                       O1oO0lOoI1 o1oO0lOoI12 = iI111lOOO.I00000oIO;
/* 842 */                       if (list2 != null && !list2.isEmpty()) {
/* 855 */                           for (int i15 = 0; i15 < list2.size(); i15++) {
/* 861 */                               oi1ol0llI.I0010o(i14, list2.get(i15), ii110oioiolI001lIiIIo1O);
                                    }
                                }
                                break;
                            case PoseLandmark.RIGHT_ANKLE:
/* 791 */                       int i16 = iArr[i5];
/* 797 */                       List list3 = (List) unsafe.getObject(obj, j);
/* 799 */                       O1oO0lOoI1 o1oO0lOoI13 = iI111lOOO.I00000oIO;
/* 801 */                       if (list3 != null && !list3.isEmpty()) {
/* 814 */                           for (int i17 = 0; i17 < list3.size(); i17++) {
/* 822 */                               i1lllo0.I000l1(i16, (i1lIIl01O) list3.get(i17));
                                    }
                                }
                                break;
                            case PoseLandmark.LEFT_HEEL:
/* 778 */                       z = false;
/* 787 */                       iI111lOOO.I000l1(iArr[i5], (List) unsafe.getObject(obj, j), oi1ol0llI, false);
                                break;
                            case 30:
/* 765 */                       z = false;
/* 774 */                       iI111lOOO.I00100l0(iArr[i5], (List) unsafe.getObject(obj, j), oi1ol0llI, false);
                                break;
                            case PoseLandmark.LEFT_FOOT_INDEX:
/* 752 */                       z = false;
/* 761 */                       iI111lOOO.I000oI1ioi(iArr[i5], (List) unsafe.getObject(obj, j), oi1ol0llI, false);
                                break;
                            case 32:
/* 739 */                       z = false;
/* 748 */                       iI111lOOO.I000OiO(iArr[i5], (List) unsafe.getObject(obj, j), oi1ol0llI, false);
                                break;
                            case 33:
/* 726 */                       z = false;
/* 735 */                       iI111lOOO.I000lI(iArr[i5], (List) unsafe.getObject(obj, j), oi1ol0llI, false);
                                break;
                            case 34:
/* 719 */                       z = false;
/* 720 */                       iI111lOOO.I000O01llI0(iArr[i5], (List) unsafe.getObject(obj, j), oi1ol0llI, false);
                                break;
                            case InputImage.IMAGE_FORMAT_YUV_420_888:
/* 706 */                       iI111lOOO.I0000O(iArr[i5], (List) unsafe.getObject(obj, j), oi1ol0llI, true);
                                break;
                            case 36:
/* 693 */                       iI111lOOO.I0000oI00(iArr[i5], (List) unsafe.getObject(obj, j), oi1ol0llI, true);
                                break;
                            case 37:
/* 680 */                       iI111lOOO.I0001Ioi1lo(iArr[i5], (List) unsafe.getObject(obj, j), oi1ol0llI, true);
                                break;
                            case 38:
/* 667 */                       iI111lOOO.I000II(iArr[i5], (List) unsafe.getObject(obj, j), oi1ol0llI, true);
                                break;
                            case 39:
/* 654 */                       iI111lOOO.I000iOII(iArr[i5], (List) unsafe.getObject(obj, j), oi1ol0llI, true);
                                break;
                            case 40:
/* 641 */                       iI111lOOO.I000OOo1O(iArr[i5], (List) unsafe.getObject(obj, j), oi1ol0llI, true);
                                break;
                            case 41:
/* 628 */                       iI111lOOO.I000o00OoI0I(iArr[i5], (List) unsafe.getObject(obj, j), oi1ol0llI, true);
                                break;
                            case 42:
/* 615 */                       iI111lOOO.I00100o1O0lo(iArr[i5], (List) unsafe.getObject(obj, j), oi1ol0llI, true);
                                break;
                            case 43:
/* 602 */                       iI111lOOO.I000l1(iArr[i5], (List) unsafe.getObject(obj, j), oi1ol0llI, true);
                                break;
                            case 44:
/* 589 */                       iI111lOOO.I00100l0(iArr[i5], (List) unsafe.getObject(obj, j), oi1ol0llI, true);
                                break;
                            case BuildConfig.VERSION_CODE:
/* 576 */                       iI111lOOO.I000oI1ioi(iArr[i5], (List) unsafe.getObject(obj, j), oi1ol0llI, true);
                                break;
                            case 46:
/* 563 */                       iI111lOOO.I000OiO(iArr[i5], (List) unsafe.getObject(obj, j), oi1ol0llI, true);
                                break;
                            case 47:
/* 550 */                       iI111lOOO.I000lI(iArr[i5], (List) unsafe.getObject(obj, j), oi1ol0llI, true);
                                break;
                            case 48:
/* 537 */                       iI111lOOO.I000O01llI0(iArr[i5], (List) unsafe.getObject(obj, j), oi1ol0llI, true);
                                break;
                            case 49:
/* 482 */                       int i18 = iArr[i5];
/* 488 */                       List list4 = (List) unsafe.getObject(obj, j);
/* 490 */                       iI110OIoiOl ii110oioiolI001lIiIIo1O2 = ii0ooi1ooli1.I001lIiIIo1O(i5);
/* 494 */                       O1oO0lOoI1 o1oO0lOoI14 = iI111lOOO.I00000oIO;
/* 496 */                       if (list4 != null && !list4.isEmpty()) {
/* 509 */                           for (int i19 = 0; i19 < list4.size(); i19++) {
/* 515 */                               i1ilO0II i1ilo0ii = (i1ilO0II) list4.get(i19);
/* 517 */                               i1lllo0.I0000O(i18, 3);
/* 520 */                               ii110oioiolI001lIiIIo1O2.I000OOo1O(i1ilo0ii, oi1ol0llI);
/* 523 */                               i1lllo0.I0000O(i18, 4);
                                    }
                                }
                                break;
                            case 50:
/* 415 */                       Object object3 = unsafe.getObject(obj, j);
/* 419 */                       if (object3 != null) {
/* 427 */                           Oo1ol1ll oo1ol1ll = ((iI0OO101i0lO) ii0ooi1ooli1.I001lllioOl(i5)).I00000oIO;
/* 443 */                           for (Map.Entry entry : ((iI0Ol0) object3).entrySet()) {
/* 452 */                               i1lllo0.I0000O(i7, 2);
/* 467 */                               i1lllo0.I0010I0i(iI0OO101i0lO.I0000Il00O(oo1ol1ll, entry.getKey(), entry.getValue()));
/* 478 */                               iI0OO101i0lO.I00000oOI(i1lllo0, oo1ol1ll, entry.getKey(), entry.getValue());
                                    }
                                }
                                break;
                            case 51:
/* 394 */                       if (ii0ooi1ooli1.I0010o(obj, i7, i5)) {
/* 410 */                           i1lllo0.I000OOo1O(i7, Double.doubleToRawLongBits(((Double) iI1Oili0OI.I000O01llI0(j, obj)).doubleValue()));
                                }
                                break;
                            case 52:
/* 369 */                       if (ii0ooi1ooli1.I0010o(obj, i7, i5)) {
/* 385 */                           i1lllo0.I000II(i7, Float.floatToRawIntBits(((Float) iI1Oili0OI.I000O01llI0(j, obj)).floatValue()));
                                }
                                break;
                            case 53:
/* 354 */                       if (ii0ooi1ooli1.I0010o(obj, i7, i5)) {
/* 360 */                           i1lllo0.I000O01llI0(i7, I000o00OoI0I(j, obj));
                                }
                                break;
                            case 54:
/* 339 */                       if (ii0ooi1ooli1.I0010o(obj, i7, i5)) {
/* 345 */                           i1lllo0.I000O01llI0(i7, I000o00OoI0I(j, obj));
                                }
                                break;
                            case 55:
/* 324 */                       if (ii0ooi1ooli1.I0010o(obj, i7, i5)) {
/* 330 */                           i1lllo0.I0000oI00(i7, I000lI(j, obj));
                                }
                                break;
                            case 56:
/* 309 */                       if (ii0ooi1ooli1.I0010o(obj, i7, i5)) {
/* 315 */                           i1lllo0.I000OOo1O(i7, I000o00OoI0I(j, obj));
                                }
                                break;
                            case 57:
/* 294 */                       if (ii0ooi1ooli1.I0010o(obj, i7, i5)) {
/* 300 */                           i1lllo0.I000II(i7, I000lI(j, obj));
                                }
                                break;
                            case 58:
/* 273 */                       if (ii0ooi1ooli1.I0010o(obj, i7, i5)) {
/* 285 */                           i1lllo0.I000OiO(i7, ((Boolean) iI1Oili0OI.I000O01llI0(j, obj)).booleanValue());
                                }
                                break;
                            case 59:
/* 245 */                       if (ii0ooi1ooli1.I0010o(obj, i7, i5)) {
/* 247 */                           Object object4 = unsafe.getObject(obj, j);
/* 253 */                           if (object4 instanceof String) {
/* 257 */                               i1lllo0.I000iOII(i7, (String) object4);
                                    } else {
/* 264 */                               i1lllo0.I000l1(i7, (i1lIIl01O) object4);
                                    }
                                }
                                break;
                            case 60:
/* 226 */                       if (ii0ooi1ooli1.I0010o(obj, i7, i5)) {
/* 236 */                           oi1ol0llI.I0010o(i7, unsafe.getObject(obj, j), ii0ooi1ooli1.I001lIiIIo1O(i5));
                                }
                                break;
                            case 61:
/* 209 */                       if (ii0ooi1ooli1.I0010o(obj, i7, i5)) {
/* 217 */                           i1lllo0.I000l1(i7, (i1lIIl01O) unsafe.getObject(obj, j));
                                }
                                break;
                            case 62:
/* 195 */                       if (ii0ooi1ooli1.I0010o(obj, i7, i5)) {
/* 201 */                           i1lllo0.I0001Ioi1lo(i7, I000lI(j, obj));
                                }
                                break;
                            case 63:
/* 181 */                       if (ii0ooi1ooli1.I0010o(obj, i7, i5)) {
/* 187 */                           i1lllo0.I0000oI00(i7, I000lI(j, obj));
                                }
                                break;
                            case Barcode.FORMAT_EAN_8:
/* 167 */                       if (ii0ooi1ooli1.I0010o(obj, i7, i5)) {
/* 173 */                           i1lllo0.I000II(i7, I000lI(j, obj));
                                }
                                break;
                            case 65:
/* 153 */                       if (ii0ooi1ooli1.I0010o(obj, i7, i5)) {
/* 159 */                           i1lllo0.I000OOo1O(i7, I000o00OoI0I(j, obj));
                                }
                                break;
                            case 66:
/* 134 */                       if (ii0ooi1ooli1.I0010o(obj, i7, i5)) {
/* 136 */                           int iI000lI = I000lI(j, obj);
/* 145 */                           i1lllo0.I0001Ioi1lo(i7, (iI000lI >> 31) ^ (iI000lI + iI000lI));
                                }
                                break;
                            case 67:
/* 115 */                       if (ii0ooi1ooli1.I0010o(obj, i7, i5)) {
/* 117 */                           long jI000o00OoI0I = I000o00OoI0I(j, obj);
/* 126 */                           i1lllo0.I000O01llI0(i7, (jI000o00OoI0I >> 63) ^ (jI000o00OoI0I + jI000o00OoI0I));
                                }
                                break;
                            case 68:
/* 89 */                        if (ii0ooi1ooli1.I0010o(obj, i7, i5)) {
/* 91 */                            Object object5 = unsafe.getObject(obj, j);
/* 101 */                           i1lllo0.I0000O(i7, 3);
/* 104 */                           ii0ooi1ooli1.I001lIiIIo1O(i5).I000OOo1O((i1ilO0II) object5, oi1ol0llI);
/* 107 */                           i1lllo0.I0000O(i7, 4);
                                }
                                break;
                        }
/* 1387 */              i5 += 3;
/* 1389 */              i3 = 1048575;
/* 1392 */              ii0ooi1ooli1 = this;
                    }
/* 1401 */          ((i1oi01OllI) obj).zzc.I00000oOI(oi1ol0llI);
                }

                /* JADX WARN: Code restructure failed: missing block: B:174:0x01d1, code lost:
                
                    continue;
                 */
                /* JADX WARN: Removed duplicated region for block: B:134:0x0218 A[SYNTHETIC] */
                /* JADX WARN: Removed duplicated region for block: B:171:0x01d1 A[SYNTHETIC] */
                @Override
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final boolean I000OiO(i1oi01OllI i1oi01olli, i1oi01OllI i1oi01olli2) {
                    boolean zI00000oIO;
/* 1 */             int[] iArr = this.I00000oIO;
/* 4 */             int i = 0;
                    while (true) {
/* 9 */                 if (i < iArr.length) {
/* 11 */                    int iI00000oIO = I00000oIO(i);
/* 15 */                    int iI00000oOI = I00000oOI(iI00000oIO);
/* 21 */                    if (iI00000oOI <= 50 || iI00000oOI >= 69) {
/* 29 */                        long j = iI00000oIO & 1048575;
                                switch (iI00000oOI) {
                                    case 0:
/* 442 */                               if (!I000oI1ioi(i1oi01olli, i1oi01olli2, i)) {
                                            break;
                                        } else {
/* 444 */                                   Ooil0oIOI0l0 ooil0oIOI0l0 = iI1Oili0OI.I0000Il00O;
/* 464 */                                   if (Double.doubleToLongBits(ooil0oIOI0l0.I00IO1oi11O(j, i1oi01olli)) != Double.doubleToLongBits(ooil0oIOI0l0.I00IO1oi11O(j, i1oi01olli2))) {
                                                break;
                                            } else {
                                                break;
                                            }
                                        }
                                    case 1:
/* 415 */                               if (!I000oI1ioi(i1oi01olli, i1oi01olli2, i)) {
                                            break;
                                        } else {
/* 417 */                                   Ooil0oIOI0l0 ooil0oIOI0l02 = iI1Oili0OI.I0000Il00O;
/* 435 */                                   if (Float.floatToIntBits(ooil0oIOI0l02.I001l0I00(j, i1oi01olli)) != Float.floatToIntBits(ooil0oIOI0l02.I001l0I00(j, i1oi01olli2))) {
                                                break;
                                            } else {
                                                break;
                                            }
                                        }
                                    case 2:
/* 396 */                               if (!I000oI1ioi(i1oi01olli, i1oi01olli2, i) || iI1Oili0OI.I0001Ioi1lo(j, i1oi01olli) != iI1Oili0OI.I0001Ioi1lo(j, i1oi01olli2)) {
                                            break;
                                        } else {
                                            break;
                                        }
                                        break;
                                    case 3:
/* 377 */                               if (!I000oI1ioi(i1oi01olli, i1oi01olli2, i) || iI1Oili0OI.I0001Ioi1lo(j, i1oi01olli) != iI1Oili0OI.I0001Ioi1lo(j, i1oi01olli2)) {
                                            break;
                                        } else {
                                            break;
                                        }
                                        break;
                                    case 4:
/* 360 */                               if (!I000oI1ioi(i1oi01olli, i1oi01olli2, i) || iI1Oili0OI.I0000O(i1oi01olli, j) != iI1Oili0OI.I0000O(i1oi01olli2, j)) {
                                            break;
                                        } else {
                                            break;
                                        }
                                        break;
                                    case 5:
/* 340 */                               if (!I000oI1ioi(i1oi01olli, i1oi01olli2, i) || iI1Oili0OI.I0001Ioi1lo(j, i1oi01olli) != iI1Oili0OI.I0001Ioi1lo(j, i1oi01olli2)) {
                                            break;
                                        } else {
                                            break;
                                        }
                                        break;
                                    case 6:
/* 322 */                               if (!I000oI1ioi(i1oi01olli, i1oi01olli2, i) || iI1Oili0OI.I0000O(i1oi01olli, j) != iI1Oili0OI.I0000O(i1oi01olli2, j)) {
                                            break;
                                        } else {
                                            break;
                                        }
                                    case 7:
/* 302 */                               if (!I000oI1ioi(i1oi01olli, i1oi01olli2, i)) {
                                            break;
                                        } else {
/* 304 */                                   Ooil0oIOI0l0 ooil0oIOI0l03 = iI1Oili0OI.I0000Il00O;
/* 314 */                                   if (ooil0oIOI0l03.I001i1O0Ol(j, i1oi01olli) != ooil0oIOI0l03.I001i1O0Ol(j, i1oi01olli2)) {
                                                break;
                                            } else {
                                                break;
                                            }
                                        }
                                    case 8:
/* 280 */                               if (!I000oI1ioi(i1oi01olli, i1oi01olli2, i) || !iI111lOOO.I00000oIO(iI1Oili0OI.I000O01llI0(j, i1oi01olli), iI1Oili0OI.I000O01llI0(j, i1oi01olli2))) {
                                            break;
                                        } else {
                                            break;
                                        }
                                        break;
                                    case 9:
/* 258 */                               if (!I000oI1ioi(i1oi01olli, i1oi01olli2, i) || !iI111lOOO.I00000oIO(iI1Oili0OI.I000O01llI0(j, i1oi01olli), iI1Oili0OI.I000O01llI0(j, i1oi01olli2))) {
                                            break;
                                        } else {
                                            break;
                                        }
                                        break;
                                    case 10:
/* 236 */                               if (!I000oI1ioi(i1oi01olli, i1oi01olli2, i) || !iI111lOOO.I00000oIO(iI1Oili0OI.I000O01llI0(j, i1oi01olli), iI1Oili0OI.I000O01llI0(j, i1oi01olli2))) {
                                            break;
                                        } else {
                                            break;
                                        }
                                    case 11:
/* 218 */                               if (!I000oI1ioi(i1oi01olli, i1oi01olli2, i) || iI1Oili0OI.I0000O(i1oi01olli, j) != iI1Oili0OI.I0000O(i1oi01olli2, j)) {
                                            break;
                                        } else {
                                            break;
                                        }
                                        break;
                                    case 12:
/* 200 */                               if (!I000oI1ioi(i1oi01olli, i1oi01olli2, i) || iI1Oili0OI.I0000O(i1oi01olli, j) != iI1Oili0OI.I0000O(i1oi01olli2, j)) {
                                            break;
                                        } else {
                                            break;
                                        }
                                        break;
                                    case 13:
/* 182 */                               if (!I000oI1ioi(i1oi01olli, i1oi01olli2, i) || iI1Oili0OI.I0000O(i1oi01olli, j) != iI1Oili0OI.I0000O(i1oi01olli2, j)) {
                                            break;
                                        } else {
                                            break;
                                        }
                                    case 14:
/* 162 */                               if (!I000oI1ioi(i1oi01olli, i1oi01olli2, i) || iI1Oili0OI.I0001Ioi1lo(j, i1oi01olli) != iI1Oili0OI.I0001Ioi1lo(j, i1oi01olli2)) {
                                            break;
                                        } else {
                                            break;
                                        }
                                        break;
                                    case 15:
/* 144 */                               if (!I000oI1ioi(i1oi01olli, i1oi01olli2, i) || iI1Oili0OI.I0000O(i1oi01olli, j) != iI1Oili0OI.I0000O(i1oi01olli2, j)) {
                                            break;
                                        } else {
                                            break;
                                        }
                                        break;
                                    case 16:
/* 124 */                               if (!I000oI1ioi(i1oi01olli, i1oi01olli2, i) || iI1Oili0OI.I0001Ioi1lo(j, i1oi01olli) != iI1Oili0OI.I0001Ioi1lo(j, i1oi01olli2)) {
                                            break;
                                        } else {
                                            break;
                                        }
                                    case 17:
/* 102 */                               if (!I000oI1ioi(i1oi01olli, i1oi01olli2, i) || !iI111lOOO.I00000oIO(iI1Oili0OI.I000O01llI0(j, i1oi01olli), iI1Oili0OI.I000O01llI0(j, i1oi01olli2))) {
                                            break;
                                        } else {
                                            break;
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
/* 90 */                                zI00000oIO = iI111lOOO.I00000oIO(iI1Oili0OI.I000O01llI0(j, i1oi01olli), iI1Oili0OI.I000O01llI0(j, i1oi01olli2));
/* 94 */                                if (!zI00000oIO) {
                                            break;
                                        } else {
                                            break;
                                        }
                                    case 50:
/* 77 */                                zI00000oIO = iI111lOOO.I00000oIO(iI1Oili0OI.I000O01llI0(j, i1oi01olli), iI1Oili0OI.I000O01llI0(j, i1oi01olli2));
/* 94 */                                if (!zI00000oIO) {
                                        }
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
/* 40 */                                long j2 = iArr[i + 2] & 1048575;
/* 50 */                                if (iI1Oili0OI.I0000O(i1oi01olli, j2) == iI1Oili0OI.I0000O(i1oi01olli2, j2) && iI111lOOO.I00000oIO(iI1Oili0OI.I000O01llI0(j, i1oi01olli), iI1Oili0OI.I000O01llI0(j, i1oi01olli2))) {
                                            break;
                                        }
                                        break;
                                }
/* 3 */                         return false;
                            }
/* 466 */                   i += 3;
                        } else {
/* 470 */                   int i2 = this.I000OOo1O;
                            while (true) {
/* 472 */                       int[] iArr2 = this.I000II;
/* 475 */                       if (i2 < iArr2.length) {
/* 477 */                           int i3 = iArr2[i2];
/* 483 */                           long j3 = iArr[i3 + 2] & 1048575;
/* 493 */                           if (iI1Oili0OI.I0000O(i1oi01olli, j3) != iI1Oili0OI.I0000O(i1oi01olli2, j3)) {
/* 3 */                                 return false;
                                    }
/* 499 */                           if (!I0010o(i1oi01olli, 0, i3)) {
/* 506 */                               long jI00000oIO = I00000oIO(i3) & 1048575;
/* 520 */                               if (!iI111lOOO.I00000oIO(iI1Oili0OI.I000O01llI0(jI00000oIO, i1oi01olli), iI1Oili0OI.I000O01llI0(jI00000oIO, i1oi01olli2))) {
                                        }
                                    }
/* 523 */                           i2++;
                                } else if (i1oi01olli.zzc.equals(i1oi01olli2.zzc)) {
/* 538 */                           return true;
                                }
                            }
                        }
                    }
/* 3 */             return false;
                }

                public final boolean I000oI1ioi(i1oi01OllI i1oi01olli, i1oi01OllI i1oi01olli2, int i) {
                    return I00100o1O0lo(i, i1oi01olli) == I00100o1O0lo(i, i1oi01olli2);
                }

                public final boolean I00100l0(Object obj, int i, int i2, int i3, int i4) {
                    return i2 == 1048575 ? I00100o1O0lo(i, obj) : (i3 & i4) != 0;
                }

                public final boolean I00100o1O0lo(int i, Object obj) {
/* 5 */             int i2 = this.I00000oIO[i + 2];
/* 10 */            long j = i2 & 1048575;
/* 20 */            if (j != 1048575) {
                        return ((1 << (i2 >>> 20)) & iI1Oili0OI.I0000O(obj, j)) != 0;
                    }
/* 22 */            int iI00000oIO = I00000oIO(i);
/* 26 */            long j2 = iI00000oIO & 1048575;
                    switch (I00000oOI(iI00000oIO)) {
                        case 0:
/* 232 */                   if (Double.doubleToRawLongBits(iI1Oili0OI.I0000Il00O.I00IO1oi11O(j2, obj)) != 0) {
                            }
                            break;
                        case 1:
/* 217 */                   if (Float.floatToRawIntBits(iI1Oili0OI.I0000Il00O.I001l0I00(j2, obj)) != 0) {
                            }
                            break;
                        case 2:
/* 204 */                   if (iI1Oili0OI.I0001Ioi1lo(j2, obj) != 0) {
                            }
                            break;
                        case 3:
/* 195 */                   if (iI1Oili0OI.I0001Ioi1lo(j2, obj) != 0) {
                            }
                            break;
                        case 4:
/* 186 */                   if (iI1Oili0OI.I0000O(obj, j2) != 0) {
                            }
                            break;
                        case 5:
/* 179 */                   if (iI1Oili0OI.I0001Ioi1lo(j2, obj) != 0) {
                            }
                            break;
                        case 6:
/* 170 */                   if (iI1Oili0OI.I0000O(obj, j2) != 0) {
                            }
                            break;
                        case 7:
                            break;
                        case 8:
/* 124 */                   Object objI000O01llI0 = iI1Oili0OI.I000O01llI0(j2, obj);
/* 130 */                   if (!(objI000O01llI0 instanceof String)) {
/* 144 */                       if (!(objI000O01llI0 instanceof i1lIIl01O)) {
/* 155 */                           OIiilo1Ool0o.I00100o1O0lo();
                                    break;
                                } else if (!i1lIIl01O.I00iiI.equals(objI000O01llI0)) {
                                }
                            } else if (!((String) objI000O01llI0).isEmpty()) {
                            }
                            break;
                        case 9:
/* 120 */                   if (iI1Oili0OI.I000O01llI0(j2, obj) != null) {
                            }
                            break;
                        case 10:
/* 112 */                   if (!i1lIIl01O.I00iiI.equals(iI1Oili0OI.I000O01llI0(j2, obj))) {
                            }
                            break;
                        case 11:
/* 98 */                    if (iI1Oili0OI.I0000O(obj, j2) != 0) {
                            }
                            break;
                        case 12:
/* 90 */                    if (iI1Oili0OI.I0000O(obj, j2) != 0) {
                            }
                            break;
                        case 13:
/* 82 */                    if (iI1Oili0OI.I0000O(obj, j2) != 0) {
                            }
                            break;
                        case 14:
/* 74 */                    if (iI1Oili0OI.I0001Ioi1lo(j2, obj) != 0) {
                            }
                            break;
                        case 15:
/* 64 */                    if (iI1Oili0OI.I0000O(obj, j2) != 0) {
                            }
                            break;
                        case 16:
/* 56 */                    if (iI1Oili0OI.I0001Ioi1lo(j2, obj) != 0) {
                            }
                            break;
                        case 17:
/* 46 */                    if (iI1Oili0OI.I000O01llI0(j2, obj) != null) {
                            }
                            break;
                        default:
/* 38 */                    OIiilo1Ool0o.I00100o1O0lo();
                            break;
                    }
/* 18 */            return false;
                }

                public final void I0010I0i(int i, Object obj) {
/* 5 */             int i2 = this.I00000oIO[i + 2];
/* 10 */            long j = 1048575 & i2;
/* 17 */            if (j == 1048575) {
/* 19 */                return;
                    }
/* 30 */            iI1Oili0OI.I0000oI00(obj, (1 << (i2 >>> 20)) | iI1Oili0OI.I0000O(obj, j), j);
                }

                public final boolean I0010o(Object obj, int i, int i2) {
                    return iI1Oili0OI.I0000O(obj, (long) (this.I00000oIO[i2 + 2] & 1048575)) == i;
                }

                public final void I00111O(Object obj, int i, int i2) {
/* 12 */            iI1Oili0OI.I0000oI00(obj, i, this.I00000oIO[i2 + 2] & 1048575);
                }

                public final int I001IIilI0O(int i, int i2) {
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

                /*  JADX ERROR: Type inference failed
                    jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
                    	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                    	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                    	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
                    */
                public final int I001i1O0Ol(java.lang.Object r34, byte[] r35, int r36, int r37, int r38, p000.i1O1ll0i0 r39) throws p000.iI00lI {
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
                        Method dump skipped, instructions count: 3508
                        To view this dump change 'Code comments level' option to 'DEBUG'
                    */
                    throw new UnsupportedOperationException("Method not decompiled: p000.iI0oOI1oolI1.I001i1O0Ol(java.lang.Object, byte[], int, int, int, i1O1ll0i0):int");
                }

                public final void I001iOo1i0O(int i, Object obj, Object obj2) {
/* 5 */             if (I00100o1O0lo(i, obj2)) {
/* 15 */                long jI00000oIO = I00000oIO(i) & 1048575;
/* 17 */                Unsafe unsafe = I000l1;
/* 19 */                Object object = unsafe.getObject(obj2, jI00000oIO);
/* 23 */                if (object == null) {
/* 86 */                    int i2 = this.I00000oIO[i];
/* 88 */                    String string = obj2.toString();
/* 107 */                   OoOil11Ol1o.I000O01llI0(string, String.valueOf(i2).length() + 38 + string.length(), i2);
/* 408 */                   return;
                        }
/* 25 */                iI110OIoiOl ii110oioiolI001lIiIIo1O = I001lIiIIo1O(i);
/* 33 */                if (!I00100o1O0lo(i, obj)) {
/* 39 */                    if (I000iOII(object)) {
/* 45 */                        i1oi01OllI i1oi01olliZza = ii110oioiolI001lIiIIo1O.zza();
/* 49 */                        ii110oioiolI001lIiIIo1O.zzd(i1oi01olliZza, object);
/* 52 */                        unsafe.putObject(obj, jI00000oIO, i1oi01olliZza);
                            } else {
/* 41 */                        unsafe.putObject(obj, jI00000oIO, object);
                            }
/* 55 */                    I0010I0i(i, obj);
/* 58 */                    return;
                        }
/* 59 */                Object object2 = unsafe.getObject(obj, jI00000oIO);
/* 67 */                if (!I000iOII(object2)) {
/* 69 */                    i1oi01OllI i1oi01olliZza2 = ii110oioiolI001lIiIIo1O.zza();
/* 73 */                    ii110oioiolI001lIiIIo1O.zzd(i1oi01olliZza2, object2);
/* 76 */                    unsafe.putObject(obj, jI00000oIO, i1oi01olliZza2);
/* 79 */                    object2 = i1oi01olliZza2;
                        }
/* 80 */                ii110oioiolI001lIiIIo1O.zzd(object2, object);
                    }
                }

                public final void I001l0I00(int i, Object obj, Object obj2) {
/* 1 */             int[] iArr = this.I00000oIO;
/* 3 */             int i2 = iArr[i];
/* 9 */             if (I0010o(obj2, i2, i)) {
/* 19 */                long jI00000oIO = I00000oIO(i) & 1048575;
/* 21 */                Unsafe unsafe = I000l1;
/* 23 */                Object object = unsafe.getObject(obj2, jI00000oIO);
/* 27 */                if (object == null) {
/* 88 */                    int i3 = iArr[i];
/* 90 */                    String string = obj2.toString();
/* 109 */                   OoOil11Ol1o.I000O01llI0(string, String.valueOf(i3).length() + 38 + string.length(), i3);
/* 408 */                   return;
                        }
/* 29 */                iI110OIoiOl ii110oioiolI001lIiIIo1O = I001lIiIIo1O(i);
/* 37 */                if (!I0010o(obj, i2, i)) {
/* 43 */                    if (I000iOII(object)) {
/* 49 */                        i1oi01OllI i1oi01olliZza = ii110oioiolI001lIiIIo1O.zza();
/* 53 */                        ii110oioiolI001lIiIIo1O.zzd(i1oi01olliZza, object);
/* 56 */                        unsafe.putObject(obj, jI00000oIO, i1oi01olliZza);
                            } else {
/* 45 */                        unsafe.putObject(obj, jI00000oIO, object);
                            }
/* 59 */                    I00111O(obj, i2, i);
/* 62 */                    return;
                        }
/* 63 */                Object object2 = unsafe.getObject(obj, jI00000oIO);
/* 71 */                if (!I000iOII(object2)) {
/* 73 */                    i1oi01OllI i1oi01olliZza2 = ii110oioiolI001lIiIIo1O.zza();
/* 77 */                    ii110oioiolI001lIiIIo1O.zzd(i1oi01olliZza2, object2);
/* 80 */                    unsafe.putObject(obj, jI00000oIO, i1oi01olliZza2);
/* 83 */                    object2 = i1oi01olliZza2;
                        }
/* 84 */                ii110oioiolI001lIiIIo1O.zzd(object2, object);
                    }
                }

                public final iI110OIoiOl I001lIiIIo1O(int i) {
/* 1 */             Object[] objArr = this.I00000oOI;
/* 3 */             int i2 = i / 3;
/* 5 */             int i3 = i2 + i2;
/* 8 */             iI110OIoiOl ii110oioiol = (iI110OIoiOl) objArr[i3];
/* 10 */            if (ii110oioiol != null) {
/* 12 */                return ii110oioiol;
                    }
/* 21 */            iI110OIoiOl ii110oioiolI00000oIO = iI10O00O.I0000Il00O.I00000oIO((Class) objArr[i3 + 1]);
/* 25 */            objArr[i3] = ii110oioiolI00000oIO;
/* 29 */            return ii110oioiolI00000oIO;
                }

                public final Object I001lllioOl(int i) {
/* 1 */             int i2 = i / 3;
/* 6 */             return this.I00000oOI[i2 + i2];
                }

                public final i1iOOl0o I001lloI(int i) {
/* 1 */             int i2 = i / 3;
/* 10 */            return (i1iOOl0o) this.I00000oOI[i2 + i2 + 1];
                }

                public final Object I00II0Ol1O0l(int i, Object obj) {
/* 1 */             iI110OIoiOl ii110oioiolI001lIiIIo1O = I001lIiIIo1O(i);
/* 12 */            int iI00000oIO = I00000oIO(i) & 1048575;
/* 17 */            if (!I00100o1O0lo(i, obj)) {
/* 19 */                return ii110oioiolI001lIiIIo1O.zza();
                    }
/* 27 */            Object object = I000l1.getObject(obj, iI00000oIO);
/* 35 */            if (I000iOII(object)) {
/* 37 */                return object;
                    }
/* 38 */            i1oi01OllI i1oi01olliZza = ii110oioiolI001lIiIIo1O.zza();
/* 42 */            if (object != null) {
/* 44 */                ii110oioiolI001lIiIIo1O.zzd(i1oi01olliZza, object);
                    }
/* 106 */           return i1oi01olliZza;
                }

                public final void I00II0oii1o(int i, Object obj, Object obj2) {
/* 12 */            I000l1.putObject(obj, I00000oIO(i) & 1048575, obj2);
/* 15 */            I0010I0i(i, obj);
                }

                public final Object I00IO1(Object obj, int i, int i2) {
/* 1 */             iI110OIoiOl ii110oioiolI001lIiIIo1O = I001lIiIIo1O(i2);
/* 9 */             if (!I0010o(obj, i, i2)) {
/* 11 */                return ii110oioiolI001lIiIIo1O.zza();
                    }
/* 27 */            Object object = I000l1.getObject(obj, I00000oIO(i2) & 1048575);
/* 35 */            if (I000iOII(object)) {
/* 37 */                return object;
                    }
/* 38 */            i1oi01OllI i1oi01olliZza = ii110oioiolI001lIiIIo1O.zza();
/* 42 */            if (object != null) {
/* 44 */                ii110oioiolI001lIiIIo1O.zzd(i1oi01olliZza, object);
                    }
/* 98 */            return i1oi01olliZza;
                }

                public final void I00IO1oi11O(Object obj, int i, int i2, Object obj2) {
/* 12 */            I000l1.putObject(obj, I00000oIO(i2) & 1048575, obj2);
/* 15 */            I00111O(obj, i, i2);
                }

                public final Object I00IOO(Object obj, int i, Object obj2, O1oO0lOoI1 o1oO0lOoI1, Object obj3) {
                    i1iOOl0o i1iool0oI001lloI;
/* 3 */             int i2 = this.I00000oIO[i];
/* 14 */            Object objI000O01llI0 = iI1Oili0OI.I000O01llI0(I00000oIO(i) & 1048575, obj);
/* 18 */            if (objI000O01llI0 == null || (i1iool0oI001lloI = I001lloI(i)) == null) {
/* 27 */                return obj2;
                    }
/* 36 */            Oo1ol1ll oo1ol1ll = ((iI0OO101i0lO) I001lllioOl(i)).I00000oIO;
/* 42 */            Iterator it = ((iI0Ol0) objI000O01llI0).entrySet().iterator();
/* 50 */            while (it.hasNext()) {
/* 56 */                Map.Entry entry = (Map.Entry) it.next();
/* 72 */                if (!i1iool0oI001lloI.I00000oIO(((Integer) entry.getValue()).intValue())) {
/* 74 */                    if (obj2 == null) {
/* 76 */                        o1oO0lOoI1.getClass();
/* 79 */                        obj2 = O1oO0lOoI1.I0001Ioi1lo(obj3);
                            }
/* 91 */                    int iI0000Il00O = iI0OO101i0lO.I0000Il00O(oo1ol1ll, entry.getKey(), entry.getValue());
/* 95 */                    i1lI1O i1li1o = i1lIIl01O.I00iiI;
/* 97 */                    byte[] bArr = new byte[iI0000Il00O];
/* 99 */                    boolean z = i1lllO0.I00000oOI;
/* 103 */                   i1lOo10 i1loo10 = new i1lOo10(iI0000Il00O, bArr);
                            try {
/* 115 */                       iI0OO101i0lO.I00000oOI(i1loo10, oo1ol1ll, entry.getKey(), entry.getValue());
/* 122 */                       if (i1loo10.I001i1lo1io() > 0) {
/* 160 */                           I000II.I001IO000("Did not write as much data as expected.");
/* 106 */                           return null;
                                }
/* 128 */                       if (i1loo10.I001i1lo1io() < 0) {
/* 154 */                           I000II.I001IO000("Wrote more data than expected.");
/* 106 */                           return null;
                                }
/* 132 */                       i1lI1O i1li1o2 = new i1lI1O(bArr);
/* 135 */                       o1oO0lOoI1.getClass();
/* 145 */                       ((iI1O01I1) obj2).I0000O((i2 << 3) | 2, i1li1o2);
/* 148 */                       it.remove();
                            } catch (IOException e) {
/* 165 */                       IioIoO10iOiI.I000lI(e);
/* 106 */                       return null;
                            }
                        }
                    }
/* 399 */           return obj2;
                }

                public final void I00IioO0OiOi(int i, IOOOi1 iOOOi1, Object obj) {
/* 3 */             IOOOIO1O ioooio1o = (IOOOIO1O) iOOOi1.I0000oI00;
/* 16 */            long j = i & 1048575;
/* 19 */            if ((536870912 & i) != 0) {
/* 21 */                iOOOi1.I011lIilI0lo(2);
/* 28 */                iI1Oili0OI.I000OOo1O(obj, j, ioooio1o.I00OOll1());
                    } else if (!this.I0001Ioi1lo) {
/* 51 */                iI1Oili0OI.I000OOo1O(obj, j, iOOOi1.I01OIo());
                    } else {
/* 36 */                iOOOi1.I011lIilI0lo(2);
/* 43 */                iI1Oili0OI.I000OOo1O(obj, j, ioooio1o.I00OIo());
                    }
                }

                @Override
                public final i1oi01OllI zza() {
/* 5 */             return ((i1oi01OllI) this.I0000oI00).I000O01llI0();
                }

                /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
                /* JADX WARN: Removed duplicated region for block: B:7:0x001e  */
                @Override
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final void zzd(Object obj, Object obj2) {
                    Object obj3;
/* 1 */             I000l1(obj);
/* 4 */             obj2.getClass();
/* 7 */             int i = 0;
                    while (true) {
/* 8 */                 int[] iArr = this.I00000oIO;
/* 11 */                if (i >= iArr.length) {
/* 449 */                   iI111lOOO.I00000oOI(obj, obj2);
/* 452 */                   return;
                        }
/* 13 */                int iI00000oIO = I00000oIO(i);
/* 20 */                int i2 = 1048575 & iI00000oIO;
/* 21 */                int iI00000oOI = I00000oOI(iI00000oIO);
/* 25 */                int i3 = iArr[i];
                        long j = i2;
                        switch (iI00000oOI) {
                            case 0:
/* 428 */                       if (!I00100o1O0lo(i, obj2)) {
/* 31 */                            obj3 = obj;
                                    break;
                                } else {
/* 430 */                           Ooil0oIOI0l0 ooil0oIOI0l0 = iI1Oili0OI.I0000Il00O;
/* 436 */                           obj3 = obj;
/* 437 */                           ooil0oIOI0l0.I00Io1lO(obj3, j, ooil0oIOI0l0.I00IO1oi11O(j, obj2));
/* 440 */                           I0010I0i(i, obj3);
                                    break;
                                }
                            case 1:
/* 408 */                       if (I00100o1O0lo(i, obj2)) {
/* 410 */                           Ooil0oIOI0l0 ooil0oIOI0l02 = iI1Oili0OI.I0000Il00O;
/* 416 */                           ooil0oIOI0l02.I00IO1(obj, j, ooil0oIOI0l02.I001l0I00(j, obj2));
/* 419 */                           I0010I0i(i, obj);
                                }
/* 31 */                        obj3 = obj;
                                break;
                            case 2:
/* 390 */                       if (I00100o1O0lo(i, obj2)) {
/* 396 */                           iI1Oili0OI.I000II(obj, j, iI1Oili0OI.I0001Ioi1lo(j, obj2));
/* 399 */                           I0010I0i(i, obj);
                                }
/* 31 */                        obj3 = obj;
                                break;
                            case 3:
/* 372 */                       if (I00100o1O0lo(i, obj2)) {
/* 378 */                           iI1Oili0OI.I000II(obj, j, iI1Oili0OI.I0001Ioi1lo(j, obj2));
/* 381 */                           I0010I0i(i, obj);
                                }
/* 31 */                        obj3 = obj;
                                break;
                            case 4:
/* 354 */                       if (I00100o1O0lo(i, obj2)) {
/* 360 */                           iI1Oili0OI.I0000oI00(obj, iI1Oili0OI.I0000O(obj2, j), j);
/* 363 */                           I0010I0i(i, obj);
                                }
/* 31 */                        obj3 = obj;
                                break;
                            case 5:
/* 336 */                       if (I00100o1O0lo(i, obj2)) {
/* 342 */                           iI1Oili0OI.I000II(obj, j, iI1Oili0OI.I0001Ioi1lo(j, obj2));
/* 345 */                           I0010I0i(i, obj);
                                }
/* 31 */                        obj3 = obj;
                                break;
                            case 6:
/* 318 */                       if (I00100o1O0lo(i, obj2)) {
/* 324 */                           iI1Oili0OI.I0000oI00(obj, iI1Oili0OI.I0000O(obj2, j), j);
/* 327 */                           I0010I0i(i, obj);
                                }
/* 31 */                        obj3 = obj;
                                break;
                            case 7:
/* 298 */                       if (I00100o1O0lo(i, obj2)) {
/* 300 */                           Ooil0oIOI0l0 ooil0oIOI0l03 = iI1Oili0OI.I0000Il00O;
/* 306 */                           ooil0oIOI0l03.I001iOo1i0O(obj, j, ooil0oIOI0l03.I001i1O0Ol(j, obj2));
/* 309 */                           I0010I0i(i, obj);
                                }
/* 31 */                        obj3 = obj;
                                break;
                            case 8:
/* 280 */                       if (I00100o1O0lo(i, obj2)) {
/* 286 */                           iI1Oili0OI.I000OOo1O(obj, j, iI1Oili0OI.I000O01llI0(j, obj2));
/* 289 */                           I0010I0i(i, obj);
                                }
/* 31 */                        obj3 = obj;
                                break;
                            case 9:
/* 271 */                       I001iOo1i0O(i, obj, obj2);
/* 31 */                        obj3 = obj;
                                break;
                            case 10:
/* 257 */                       if (I00100o1O0lo(i, obj2)) {
/* 263 */                           iI1Oili0OI.I000OOo1O(obj, j, iI1Oili0OI.I000O01llI0(j, obj2));
/* 266 */                           I0010I0i(i, obj);
                                }
/* 31 */                        obj3 = obj;
                                break;
                            case 11:
/* 239 */                       if (I00100o1O0lo(i, obj2)) {
/* 245 */                           iI1Oili0OI.I0000oI00(obj, iI1Oili0OI.I0000O(obj2, j), j);
/* 248 */                           I0010I0i(i, obj);
                                }
/* 31 */                        obj3 = obj;
                                break;
                            case 12:
/* 221 */                       if (I00100o1O0lo(i, obj2)) {
/* 227 */                           iI1Oili0OI.I0000oI00(obj, iI1Oili0OI.I0000O(obj2, j), j);
/* 230 */                           I0010I0i(i, obj);
                                }
/* 31 */                        obj3 = obj;
                                break;
                            case 13:
/* 203 */                       if (I00100o1O0lo(i, obj2)) {
/* 209 */                           iI1Oili0OI.I0000oI00(obj, iI1Oili0OI.I0000O(obj2, j), j);
/* 212 */                           I0010I0i(i, obj);
                                }
/* 31 */                        obj3 = obj;
                                break;
                            case 14:
/* 185 */                       if (I00100o1O0lo(i, obj2)) {
/* 191 */                           iI1Oili0OI.I000II(obj, j, iI1Oili0OI.I0001Ioi1lo(j, obj2));
/* 194 */                           I0010I0i(i, obj);
                                }
/* 31 */                        obj3 = obj;
                                break;
                            case 15:
/* 167 */                       if (I00100o1O0lo(i, obj2)) {
/* 173 */                           iI1Oili0OI.I0000oI00(obj, iI1Oili0OI.I0000O(obj2, j), j);
/* 176 */                           I0010I0i(i, obj);
                                }
/* 31 */                        obj3 = obj;
                                break;
                            case 16:
/* 149 */                       if (I00100o1O0lo(i, obj2)) {
/* 155 */                           iI1Oili0OI.I000II(obj, j, iI1Oili0OI.I0001Ioi1lo(j, obj2));
/* 158 */                           I0010I0i(i, obj);
                                }
/* 31 */                        obj3 = obj;
                                break;
                            case 17:
/* 141 */                       I001iOo1i0O(i, obj, obj2);
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
/* 98 */                        iI00IlI1oII ii00ili1oiiI00iOIl = (iI00IlI1oII) iI1Oili0OI.I000O01llI0(j, obj);
/* 104 */                       iI00IlI1oII ii00ili1oii = (iI00IlI1oII) iI1Oili0OI.I000O01llI0(j, obj2);
/* 106 */                       int size = ii00ili1oiiI00iOIl.size();
/* 110 */                       int size2 = ii00ili1oii.size();
/* 114 */                       if (size > 0 && size2 > 0) {
/* 123 */                           if (!((i1io1OO01oI) ii00ili1oiiI00iOIl).I00iOIl) {
/* 126 */                               ii00ili1oiiI00iOIl = ii00ili1oiiI00iOIl.I00iOIl(size2 + size);
                                    }
/* 130 */                           ii00ili1oiiI00iOIl.addAll(ii00ili1oii);
                                }
/* 133 */                       if (size > 0) {
/* 136 */                           ii00ili1oii = ii00ili1oiiI00iOIl;
                                }
/* 137 */                       iI1Oili0OI.I000OOo1O(obj, j, ii00ili1oii);
/* 31 */                        obj3 = obj;
                                break;
                            case 50:
/* 76 */                        O1oO0lOoI1 o1oO0lOoI1 = iI111lOOO.I00000oIO;
/* 90 */                        iI1Oili0OI.I000OOo1O(obj, j, lii10iIIooio.I00000oIO(iI1Oili0OI.I000O01llI0(j, obj), iI1Oili0OI.I000O01llI0(j, obj2)));
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
/* 63 */                        if (I0010o(obj2, i3, i)) {
/* 69 */                            iI1Oili0OI.I000OOo1O(obj, j, iI1Oili0OI.I000O01llI0(j, obj2));
/* 72 */                            I00111O(obj, i3, i);
                                }
/* 31 */                        obj3 = obj;
                                break;
                            case 60:
/* 55 */                        I001l0I00(i, obj, obj2);
/* 31 */                        obj3 = obj;
                                break;
                            case 61:
                            case 62:
                            case 63:
                            case Barcode.FORMAT_EAN_8:
                            case 65:
                            case 66:
                            case 67:
/* 42 */                        if (I0010o(obj2, i3, i)) {
/* 48 */                            iI1Oili0OI.I000OOo1O(obj, j, iI1Oili0OI.I000O01llI0(j, obj2));
/* 51 */                            I00111O(obj, i3, i);
                                }
/* 31 */                        obj3 = obj;
                                break;
                            case 68:
/* 34 */                        I001l0I00(i, obj, obj2);
/* 31 */                        obj3 = obj;
                                break;
                        }
/* 443 */               i += 3;
/* 445 */               obj = obj3;
                    }
                }
            }

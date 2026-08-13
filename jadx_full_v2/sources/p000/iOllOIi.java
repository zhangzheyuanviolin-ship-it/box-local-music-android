            package p000;

            import com.google.ai.edge.gallery.BuildConfig;
            import com.google.mlkit.vision.barcode.common.Barcode;
            import com.google.mlkit.vision.common.InputImage;
            import com.google.mlkit.vision.pose.PoseLandmark;
            import java.lang.reflect.Field;
            import java.nio.charset.StandardCharsets;
            import java.util.Arrays;
            import java.util.List;
            import sun.misc.Unsafe;
            
            public final class iOllOIi implements iOloi11 {
                public static final int[] I000OOo1O = new int[0];
                public static final Unsafe I000OiO = iOo0Ii1l.I0001Ioi1lo();
                public int[] I00000oIO;
                public Object[] I00000oOI;
                public int I0000Il00O;
                public int I0000O;
                public iOl10IOiOi0 I0000oI00;
                public int[] I0001Ioi1lo;
                public int I000II;
                public int I000O01llI0;

                public static Field I000iOII(Class cls, String str) {
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

                public static int I0010o(int i) {
/* 3 */             return (i >>> 20) & 255;
                }

                public static boolean I00111O(Object obj) {
/* 1 */             if (obj == null) {
/* 3 */                 return false;
                    }
/* 7 */             if (obj instanceof iOlOoOlI0li1) {
/* 11 */                return ((iOlOoOlI0li1) obj).I00000oIO();
                    }
/* 16 */            return true;
                }

                @Override
                public final int I00000oIO(iOlOoOlI0li1 ioloooli0li1) {
                    int i;
                    long jDoubleToLongBits;
                    int i2;
                    int iFloatToIntBits;
                    int i3;
                    int i4;
/* 3 */             int iHashCode = 0;
/* 10 */            for (int i5 = 0; i5 < this.I00000oIO.length; i5 += 3) {
/* 12 */                int iI0010I0i = I0010I0i(i5);
/* 16 */                int iI0010o = I0010o(iI0010I0i);
/* 22 */                if (iI0010o <= 50 || iI0010o >= 69) {
/* 28 */                    long j = iI0010I0i & 1048575;
/* 30 */                    int iHashCode2 = 37;
                            switch (iI0010o) {
                                case 0:
/* 244 */                           i = iHashCode * 53;
/* 252 */                           jDoubleToLongBits = Double.doubleToLongBits(iOo0Ii1l.I0000Il00O.I00II0Ol1O0l(j, ioloooli0li1));
/* 256 */                           byte[] bArr = iOlilI1ill0.I00000oIO;
/* 89 */                            i3 = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
/* 90 */                            iHashCode = i + i3;
                                    break;
                                case 1:
/* 230 */                           i2 = iHashCode * 53;
/* 238 */                           iFloatToIntBits = Float.floatToIntBits(iOo0Ii1l.I0000Il00O.I001i1lo1io(j, ioloooli0li1));
/* 49 */                            iHashCode = i2 + iFloatToIntBits;
                                    break;
                                case 2:
/* 220 */                           i = iHashCode * 53;
/* 222 */                           jDoubleToLongBits = iOo0Ii1l.I0000Il00O(ioloooli0li1, j);
/* 226 */                           byte[] bArr2 = iOlilI1ill0.I00000oIO;
/* 89 */                            i3 = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
/* 90 */                            iHashCode = i + i3;
                                    break;
                                case 3:
/* 210 */                           i = iHashCode * 53;
/* 212 */                           jDoubleToLongBits = iOo0Ii1l.I0000Il00O(ioloooli0li1, j);
/* 216 */                           byte[] bArr3 = iOlilI1ill0.I00000oIO;
/* 89 */                            i3 = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
/* 90 */                            iHashCode = i + i3;
                                    break;
                                case 4:
/* 202 */                           i2 = iHashCode * 53;
/* 204 */                           iFloatToIntBits = iOo0Ii1l.I00000oIO(j, ioloooli0li1);
/* 49 */                            iHashCode = i2 + iFloatToIntBits;
                                    break;
                                case 5:
/* 193 */                           i = iHashCode * 53;
/* 195 */                           jDoubleToLongBits = iOo0Ii1l.I0000Il00O(ioloooli0li1, j);
/* 199 */                           byte[] bArr4 = iOlilI1ill0.I00000oIO;
/* 89 */                            i3 = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
/* 90 */                            iHashCode = i + i3;
                                    break;
                                case 6:
/* 185 */                           i2 = iHashCode * 53;
/* 187 */                           iFloatToIntBits = iOo0Ii1l.I00000oIO(j, ioloooli0li1);
/* 49 */                            iHashCode = i2 + iFloatToIntBits;
                                    break;
                                case 7:
/* 167 */                           i = iHashCode * 53;
/* 171 */                           boolean zI00111O = iOo0Ii1l.I0000Il00O.I00111O(j, ioloooli0li1);
/* 175 */                           byte[] bArr5 = iOlilI1ill0.I00000oIO;
/* 182 */                           i3 = zI00111O ? 1231 : 1237;
/* 90 */                            iHashCode = i + i3;
                                    break;
                                case 8:
/* 154 */                           i2 = iHashCode * 53;
/* 162 */                           iFloatToIntBits = ((String) iOo0Ii1l.I0000O(j, ioloooli0li1)).hashCode();
/* 49 */                            iHashCode = i2 + iFloatToIntBits;
                                    break;
                                case 9:
/* 141 */                           i4 = iHashCode * 53;
/* 143 */                           Object objI0000O = iOo0Ii1l.I0000O(j, ioloooli0li1);
/* 147 */                           if (objI0000O != null) {
/* 149 */                               iHashCode2 = objI0000O.hashCode();
                                    }
/* 75 */                            iHashCode = i4 + iHashCode2;
                                    break;
                                case 10:
/* 130 */                           i2 = iHashCode * 53;
/* 136 */                           iFloatToIntBits = iOo0Ii1l.I0000O(j, ioloooli0li1).hashCode();
/* 49 */                            iHashCode = i2 + iFloatToIntBits;
                                    break;
                                case 11:
/* 123 */                           i2 = iHashCode * 53;
/* 125 */                           iFloatToIntBits = iOo0Ii1l.I00000oIO(j, ioloooli0li1);
/* 49 */                            iHashCode = i2 + iFloatToIntBits;
                                    break;
                                case 12:
/* 116 */                           i2 = iHashCode * 53;
/* 118 */                           iFloatToIntBits = iOo0Ii1l.I00000oIO(j, ioloooli0li1);
/* 49 */                            iHashCode = i2 + iFloatToIntBits;
                                    break;
                                case 13:
/* 109 */                           i2 = iHashCode * 53;
/* 111 */                           iFloatToIntBits = iOo0Ii1l.I00000oIO(j, ioloooli0li1);
/* 49 */                            iHashCode = i2 + iFloatToIntBits;
                                    break;
                                case 14:
/* 100 */                           i = iHashCode * 53;
/* 102 */                           jDoubleToLongBits = iOo0Ii1l.I0000Il00O(ioloooli0li1, j);
/* 106 */                           byte[] bArr6 = iOlilI1ill0.I00000oIO;
/* 89 */                            i3 = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
/* 90 */                            iHashCode = i + i3;
                                    break;
                                case 15:
/* 93 */                            i2 = iHashCode * 53;
/* 95 */                            iFloatToIntBits = iOo0Ii1l.I00000oIO(j, ioloooli0li1);
/* 49 */                            iHashCode = i2 + iFloatToIntBits;
                                    break;
                                case 16:
/* 78 */                            i = iHashCode * 53;
/* 80 */                            jDoubleToLongBits = iOo0Ii1l.I0000Il00O(ioloooli0li1, j);
/* 84 */                            byte[] bArr7 = iOlilI1ill0.I00000oIO;
/* 89 */                            i3 = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
/* 90 */                            iHashCode = i + i3;
                                    break;
                                case 17:
/* 63 */                            i4 = iHashCode * 53;
/* 65 */                            Object objI0000O2 = iOo0Ii1l.I0000O(j, ioloooli0li1);
/* 69 */                            if (objI0000O2 != null) {
/* 71 */                                iHashCode2 = objI0000O2.hashCode();
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
/* 58 */                            iFloatToIntBits = iOo0Ii1l.I0000O(j, ioloooli0li1).hashCode();
/* 49 */                            iHashCode = i2 + iFloatToIntBits;
                                    break;
                                case 50:
/* 39 */                            i2 = iHashCode * 53;
/* 45 */                            iFloatToIntBits = iOo0Ii1l.I0000O(j, ioloooli0li1).hashCode();
/* 49 */                            iHashCode = i2 + iFloatToIntBits;
                                    break;
                            }
                        }
                    }
/* 264 */           int i6 = this.I000O01llI0;
                    while (true) {
/* 266 */               int[] iArr = this.I0001Ioi1lo;
/* 269 */               if (i6 >= iArr.length) {
/* 308 */                   return ioloooli0li1.zzc.hashCode() + (iHashCode * 53);
                        }
/* 277 */               if (!I000O01llI0(ioloooli0li1, 0, iArr[i6])) {
/* 295 */                   iHashCode = iOo0Ii1l.I0000O(I0010I0i(r3) & 1048575, ioloooli0li1).hashCode() + (iHashCode * 53);
                        }
/* 297 */               i6++;
                    }
                }

                @Override
                public final void I00000oOI(Object obj, byte[] bArr, int i, int i2, i1O1ll0i0 i1o1ll0i0) {
/* 8 */             I000OiO(obj, bArr, i, i2, 0, i1o1ll0i0);
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
                public final boolean I0000Il00O(iOlOoOlI0li1 ioloooli0li1, iOlOoOlI0li1 ioloooli0li12) {
                    boolean zI00000oIO;
/* 1 */             int[] iArr = this.I00000oIO;
/* 4 */             int i = 0;
                    while (true) {
/* 9 */                 if (i < iArr.length) {
/* 11 */                    int iI0010I0i = I0010I0i(i);
/* 15 */                    int iI0010o = I0010o(iI0010I0i);
/* 21 */                    if (iI0010o <= 50 || iI0010o >= 69) {
/* 29 */                        long j = iI0010I0i & 1048575;
                                switch (iI0010o) {
                                    case 0:
/* 442 */                               if (!I0000oI00(ioloooli0li1, ioloooli0li12, i)) {
                                            break;
                                        } else {
/* 444 */                                   Ooil0oIOI0l0 ooil0oIOI0l0 = iOo0Ii1l.I0000Il00O;
/* 464 */                                   if (Double.doubleToLongBits(ooil0oIOI0l0.I00II0Ol1O0l(j, ioloooli0li1)) != Double.doubleToLongBits(ooil0oIOI0l0.I00II0Ol1O0l(j, ioloooli0li12))) {
                                                break;
                                            } else {
                                                break;
                                            }
                                        }
                                    case 1:
/* 415 */                               if (!I0000oI00(ioloooli0li1, ioloooli0li12, i)) {
                                            break;
                                        } else {
/* 417 */                                   Ooil0oIOI0l0 ooil0oIOI0l02 = iOo0Ii1l.I0000Il00O;
/* 435 */                                   if (Float.floatToIntBits(ooil0oIOI0l02.I001i1lo1io(j, ioloooli0li1)) != Float.floatToIntBits(ooil0oIOI0l02.I001i1lo1io(j, ioloooli0li12))) {
                                                break;
                                            } else {
                                                break;
                                            }
                                        }
                                    case 2:
/* 396 */                               if (!I0000oI00(ioloooli0li1, ioloooli0li12, i) || iOo0Ii1l.I0000Il00O(ioloooli0li1, j) != iOo0Ii1l.I0000Il00O(ioloooli0li12, j)) {
                                            break;
                                        } else {
                                            break;
                                        }
                                        break;
                                    case 3:
/* 377 */                               if (!I0000oI00(ioloooli0li1, ioloooli0li12, i) || iOo0Ii1l.I0000Il00O(ioloooli0li1, j) != iOo0Ii1l.I0000Il00O(ioloooli0li12, j)) {
                                            break;
                                        } else {
                                            break;
                                        }
                                        break;
                                    case 4:
/* 360 */                               if (!I0000oI00(ioloooli0li1, ioloooli0li12, i) || iOo0Ii1l.I00000oIO(j, ioloooli0li1) != iOo0Ii1l.I00000oIO(j, ioloooli0li12)) {
                                            break;
                                        } else {
                                            break;
                                        }
                                        break;
                                    case 5:
/* 340 */                               if (!I0000oI00(ioloooli0li1, ioloooli0li12, i) || iOo0Ii1l.I0000Il00O(ioloooli0li1, j) != iOo0Ii1l.I0000Il00O(ioloooli0li12, j)) {
                                            break;
                                        } else {
                                            break;
                                        }
                                        break;
                                    case 6:
/* 322 */                               if (!I0000oI00(ioloooli0li1, ioloooli0li12, i) || iOo0Ii1l.I00000oIO(j, ioloooli0li1) != iOo0Ii1l.I00000oIO(j, ioloooli0li12)) {
                                            break;
                                        } else {
                                            break;
                                        }
                                    case 7:
/* 302 */                               if (!I0000oI00(ioloooli0li1, ioloooli0li12, i)) {
                                            break;
                                        } else {
/* 304 */                                   Ooil0oIOI0l0 ooil0oIOI0l03 = iOo0Ii1l.I0000Il00O;
/* 314 */                                   if (ooil0oIOI0l03.I00111O(j, ioloooli0li1) != ooil0oIOI0l03.I00111O(j, ioloooli0li12)) {
                                                break;
                                            } else {
                                                break;
                                            }
                                        }
                                    case 8:
/* 280 */                               if (!I0000oI00(ioloooli0li1, ioloooli0li12, i) || !iOloiOio.I00000oIO(iOo0Ii1l.I0000O(j, ioloooli0li1), iOo0Ii1l.I0000O(j, ioloooli0li12))) {
                                            break;
                                        } else {
                                            break;
                                        }
                                        break;
                                    case 9:
/* 258 */                               if (!I0000oI00(ioloooli0li1, ioloooli0li12, i) || !iOloiOio.I00000oIO(iOo0Ii1l.I0000O(j, ioloooli0li1), iOo0Ii1l.I0000O(j, ioloooli0li12))) {
                                            break;
                                        } else {
                                            break;
                                        }
                                        break;
                                    case 10:
/* 236 */                               if (!I0000oI00(ioloooli0li1, ioloooli0li12, i) || !iOloiOio.I00000oIO(iOo0Ii1l.I0000O(j, ioloooli0li1), iOo0Ii1l.I0000O(j, ioloooli0li12))) {
                                            break;
                                        } else {
                                            break;
                                        }
                                    case 11:
/* 218 */                               if (!I0000oI00(ioloooli0li1, ioloooli0li12, i) || iOo0Ii1l.I00000oIO(j, ioloooli0li1) != iOo0Ii1l.I00000oIO(j, ioloooli0li12)) {
                                            break;
                                        } else {
                                            break;
                                        }
                                        break;
                                    case 12:
/* 200 */                               if (!I0000oI00(ioloooli0li1, ioloooli0li12, i) || iOo0Ii1l.I00000oIO(j, ioloooli0li1) != iOo0Ii1l.I00000oIO(j, ioloooli0li12)) {
                                            break;
                                        } else {
                                            break;
                                        }
                                        break;
                                    case 13:
/* 182 */                               if (!I0000oI00(ioloooli0li1, ioloooli0li12, i) || iOo0Ii1l.I00000oIO(j, ioloooli0li1) != iOo0Ii1l.I00000oIO(j, ioloooli0li12)) {
                                            break;
                                        } else {
                                            break;
                                        }
                                    case 14:
/* 162 */                               if (!I0000oI00(ioloooli0li1, ioloooli0li12, i) || iOo0Ii1l.I0000Il00O(ioloooli0li1, j) != iOo0Ii1l.I0000Il00O(ioloooli0li12, j)) {
                                            break;
                                        } else {
                                            break;
                                        }
                                        break;
                                    case 15:
/* 144 */                               if (!I0000oI00(ioloooli0li1, ioloooli0li12, i) || iOo0Ii1l.I00000oIO(j, ioloooli0li1) != iOo0Ii1l.I00000oIO(j, ioloooli0li12)) {
                                            break;
                                        } else {
                                            break;
                                        }
                                        break;
                                    case 16:
/* 124 */                               if (!I0000oI00(ioloooli0li1, ioloooli0li12, i) || iOo0Ii1l.I0000Il00O(ioloooli0li1, j) != iOo0Ii1l.I0000Il00O(ioloooli0li12, j)) {
                                            break;
                                        } else {
                                            break;
                                        }
                                    case 17:
/* 102 */                               if (!I0000oI00(ioloooli0li1, ioloooli0li12, i) || !iOloiOio.I00000oIO(iOo0Ii1l.I0000O(j, ioloooli0li1), iOo0Ii1l.I0000O(j, ioloooli0li12))) {
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
/* 90 */                                zI00000oIO = iOloiOio.I00000oIO(iOo0Ii1l.I0000O(j, ioloooli0li1), iOo0Ii1l.I0000O(j, ioloooli0li12));
/* 94 */                                if (!zI00000oIO) {
                                            break;
                                        } else {
                                            break;
                                        }
                                    case 50:
/* 77 */                                zI00000oIO = iOloiOio.I00000oIO(iOo0Ii1l.I0000O(j, ioloooli0li1), iOo0Ii1l.I0000O(j, ioloooli0li12));
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
/* 50 */                                if (iOo0Ii1l.I00000oIO(j2, ioloooli0li1) == iOo0Ii1l.I00000oIO(j2, ioloooli0li12) && iOloiOio.I00000oIO(iOo0Ii1l.I0000O(j, ioloooli0li1), iOo0Ii1l.I0000O(j, ioloooli0li12))) {
                                            break;
                                        }
                                        break;
                                }
/* 3 */                         return false;
                            }
/* 466 */                   i += 3;
                        } else {
/* 470 */                   int i2 = this.I000O01llI0;
                            while (true) {
/* 472 */                       int[] iArr2 = this.I0001Ioi1lo;
/* 475 */                       if (i2 < iArr2.length) {
/* 477 */                           int i3 = iArr2[i2];
/* 483 */                           long j3 = iArr[i3 + 2] & 1048575;
/* 493 */                           if (iOo0Ii1l.I00000oIO(j3, ioloooli0li1) != iOo0Ii1l.I00000oIO(j3, ioloooli0li12)) {
/* 3 */                                 return false;
                                    }
/* 499 */                           if (!I000O01llI0(ioloooli0li1, 0, i3)) {
/* 506 */                               long jI0010I0i = I0010I0i(i3) & 1048575;
/* 520 */                               if (!iOloiOio.I00000oIO(iOo0Ii1l.I0000O(jI0010I0i, ioloooli0li1), iOo0Ii1l.I0000O(jI0010I0i, ioloooli0li12))) {
                                        }
                                    }
/* 523 */                           i2++;
                                } else if (ioloooli0li1.zzc.equals(ioloooli0li12.zzc)) {
/* 538 */                           return true;
                                }
                            }
                        }
                    }
/* 3 */             return false;
                }

                /* JADX WARN: Removed duplicated region for block: B:28:0x006f  */
                @Override
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final void I0000O(Object obj) {
/* 5 */             if (I00111O(obj)) {
/* 12 */                if (obj instanceof iOlOoOlI0li1) {
/* 15 */                    iOlOoOlI0li1 ioloooli0li1 = (iOlOoOlI0li1) obj;
/* 17 */                    ioloooli0li1.I0000Il00O();
/* 20 */                    ioloooli0li1.zza = 0;
/* 22 */                    ioloooli0li1.I00000oOI();
                        }
/* 25 */                int[] iArr = this.I00000oIO;
/* 29 */                for (int i = 0; i < iArr.length; i += 3) {
/* 31 */                    int iI0010I0i = I0010I0i(i);
/* 38 */                    int i2 = 1048575 & iI0010I0i;
/* 39 */                    int iI0010o = I0010o(iI0010I0i);
                            long j = i2;
/* 46 */                    Unsafe unsafe = I000OiO;
/* 48 */                    if (iI0010o != 9) {
/* 52 */                        if (iI0010o != 60 && iI0010o != 68) {
                                    switch (iI0010o) {
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
/* 83 */                                    iOloOiOiiOO iolooioiioo = (iOloOiOiiOO) ((iOlil0i) iOo0Ii1l.I0000O(j, obj));
/* 87 */                                    if (iolooioiioo.I00iOIl) {
/* 89 */                                        iolooioiioo.I00iOIl = false;
                                                break;
                                            } else {
                                                break;
                                            }
                                        case 50:
/* 62 */                                    Object object = unsafe.getObject(obj, j);
/* 66 */                                    if (object != null) {
/* 71 */                                        ((iOllI1i1l) object).I00iOIl = false;
/* 73 */                                        unsafe.putObject(obj, j, object);
                                                break;
                                            } else {
                                                break;
                                            }
                                    }
                                } else if (I000O01llI0(obj, iArr[i], i)) {
/* 108 */                           I000o00OoI0I(i).I0000O(unsafe.getObject(obj, j));
                                }
                            } else if (I0001Ioi1lo(i, obj)) {
/* 126 */                       I000o00OoI0I(i).I0000O(unsafe.getObject(obj, j));
                            }
                        }
/* 134 */               iOo00o ioo00o = ((iOlOoOlI0li1) obj).zzc;
/* 138 */               if (ioo00o.I0000O) {
/* 140 */                   ioo00o.I0000O = false;
                        }
                    }
                }

                public final boolean I0000oI00(iOlOoOlI0li1 ioloooli0li1, iOlOoOlI0li1 ioloooli0li12, int i) {
                    return I0001Ioi1lo(i, ioloooli0li1) == I0001Ioi1lo(i, ioloooli0li12);
                }

                public final boolean I0001Ioi1lo(int i, Object obj) {
/* 5 */             int i2 = this.I00000oIO[i + 2];
/* 10 */            long j = i2 & 1048575;
/* 20 */            if (j != 1048575) {
                        return ((1 << (i2 >>> 20)) & iOo0Ii1l.I00000oIO(j, obj)) != 0;
                    }
/* 22 */            int iI0010I0i = I0010I0i(i);
/* 26 */            long j2 = iI0010I0i & 1048575;
                    switch (I0010o(iI0010I0i)) {
                        case 0:
/* 232 */                   if (Double.doubleToRawLongBits(iOo0Ii1l.I0000Il00O.I00II0Ol1O0l(j2, obj)) != 0) {
                            }
                            break;
                        case 1:
/* 217 */                   if (Float.floatToRawIntBits(iOo0Ii1l.I0000Il00O.I001i1lo1io(j2, obj)) != 0) {
                            }
                            break;
                        case 2:
/* 204 */                   if (iOo0Ii1l.I0000Il00O(obj, j2) != 0) {
                            }
                            break;
                        case 3:
/* 195 */                   if (iOo0Ii1l.I0000Il00O(obj, j2) != 0) {
                            }
                            break;
                        case 4:
/* 186 */                   if (iOo0Ii1l.I00000oIO(j2, obj) != 0) {
                            }
                            break;
                        case 5:
/* 179 */                   if (iOo0Ii1l.I0000Il00O(obj, j2) != 0) {
                            }
                            break;
                        case 6:
/* 170 */                   if (iOo0Ii1l.I00000oIO(j2, obj) != 0) {
                            }
                            break;
                        case 7:
                            break;
                        case 8:
/* 124 */                   Object objI0000O = iOo0Ii1l.I0000O(j2, obj);
/* 130 */                   if (!(objI0000O instanceof String)) {
/* 144 */                       if (!(objI0000O instanceof iOl1iiIll)) {
/* 155 */                           OIiilo1Ool0o.I00100o1O0lo();
                                    break;
                                } else if (!iOl1iiIll.I00iiI.equals(objI0000O)) {
                                }
                            } else if (!((String) objI0000O).isEmpty()) {
                            }
                            break;
                        case 9:
/* 120 */                   if (iOo0Ii1l.I0000O(j2, obj) != null) {
                            }
                            break;
                        case 10:
/* 112 */                   if (!iOl1iiIll.I00iiI.equals(iOo0Ii1l.I0000O(j2, obj))) {
                            }
                            break;
                        case 11:
/* 98 */                    if (iOo0Ii1l.I00000oIO(j2, obj) != 0) {
                            }
                            break;
                        case 12:
/* 90 */                    if (iOo0Ii1l.I00000oIO(j2, obj) != 0) {
                            }
                            break;
                        case 13:
/* 82 */                    if (iOo0Ii1l.I00000oIO(j2, obj) != 0) {
                            }
                            break;
                        case 14:
/* 74 */                    if (iOo0Ii1l.I0000Il00O(obj, j2) != 0) {
                            }
                            break;
                        case 15:
/* 64 */                    if (iOo0Ii1l.I00000oIO(j2, obj) != 0) {
                            }
                            break;
                        case 16:
/* 56 */                    if (iOo0Ii1l.I0000Il00O(obj, j2) != 0) {
                            }
                            break;
                        case 17:
/* 46 */                    if (iOo0Ii1l.I0000O(j2, obj) != null) {
                            }
                            break;
                        default:
/* 38 */                    OIiilo1Ool0o.I00100o1O0lo();
                            break;
                    }
/* 18 */            return false;
                }

                public final void I000II(int i, Object obj) {
/* 5 */             int i2 = this.I00000oIO[i + 2];
/* 10 */            long j = 1048575 & i2;
/* 17 */            if (j == 1048575) {
/* 19 */                return;
                    }
/* 30 */            iOo0Ii1l.I00000oOI(obj, (1 << (i2 >>> 20)) | iOo0Ii1l.I00000oIO(j, obj), j);
                }

                public final boolean I000O01llI0(Object obj, int i, int i2) {
                    return iOo0Ii1l.I00000oIO((long) (this.I00000oIO[i2 + 2] & 1048575), obj) == i;
                }

                public final int I000OOo1O(int i, int i2) {
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

                /* JADX WARN: Code restructure failed: missing block: B:109:0x02ef, code lost:
                
                    throw new p000.iOlio0iO001("Protocol message had invalid UTF-8.");
                 */
                /* JADX WARN: Code restructure failed: missing block: B:131:0x0344, code lost:
                
                    throw new p000.iOlio0iO001("Protocol message had invalid UTF-8.");
                 */
                /* JADX WARN: Code restructure failed: missing block: B:146:0x03a8, code lost:
                
                    throw new p000.iOlio0iO001("Protocol message had invalid UTF-8.");
                 */
                /* JADX WARN: Code restructure failed: missing block: B:162:0x03f9, code lost:
                
                    r5 = r42;
                    r7 = r2;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:163:0x03fc, code lost:
                
                    r3 = r9;
                    r2 = r14;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:164:0x03fe, code lost:
                
                    r9 = r17;
                    r8 = r21;
                    r11 = r22;
                    r12 = r23;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:165:0x0406, code lost:
                
                    r17 = r30;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:183:0x0488, code lost:
                
                    r5 = r42;
                    r4 = r7;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:184:0x048b, code lost:
                
                    r3 = r9;
                    r7 = r12;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:40:0x0108, code lost:
                
                    r11 = r22;
                    r12 = r23;
                 */
                /* JADX WARN: Removed duplicated region for block: B:124:0x031f  */
                /* JADX WARN: Removed duplicated region for block: B:126:0x0322 A[PHI: r15
                  0x0322: PHI (r15v15 byte) = (r15v14 byte), (r15v16 byte) binds: [B:123:0x031d, B:125:0x0321] A[DONT_GENERATE, DONT_INLINE]] */
                /* JADX WARN: Removed duplicated region for block: B:128:0x0328  */
                /* JADX WARN: Removed duplicated region for block: B:20:0x0059  */
                /* JADX WARN: Removed duplicated region for block: B:24:0x0073  */
                /* JADX WARN: Removed duplicated region for block: B:399:0x08ef  */
                /* JADX WARN: Removed duplicated region for block: B:497:0x0c17 A[PHI: r3 r4 r8 r13 r14 r21
                  0x0c17: PHI (r3v160 iOo00o) = 
                  (r3v133 iOo00o)
                  (r3v134 iOo00o)
                  (r3v135 iOo00o)
                  (r3v136 iOo00o)
                  (r3v137 iOo00o)
                  (r3v138 iOo00o)
                  (r3v139 iOo00o)
                  (r3v140 iOo00o)
                  (r3v142 iOo00o)
                  (r3v147 iOo00o)
                  (r3v153 iOo00o)
                  (r3v161 iOo00o)
                 binds: [B:495:0x0c00, B:492:0x0bdc, B:489:0x0bbc, B:486:0x0b9c, B:483:0x0b7c, B:480:0x0b5b, B:473:0x0b31, B:459:0x0aee, B:457:0x0ad0, B:453:0x0a86, B:432:0x09e9, B:421:0x0964] A[DONT_GENERATE, DONT_INLINE]
                  0x0c17: PHI (r4v148 byte[]) = 
                  (r4v117 byte[])
                  (r4v118 byte[])
                  (r4v119 byte[])
                  (r4v120 byte[])
                  (r4v121 byte[])
                  (r4v122 byte[])
                  (r4v123 byte[])
                  (r4v125 byte[])
                  (r4v127 byte[])
                  (r4v130 byte[])
                  (r4v137 byte[])
                  (r4v149 byte[])
                 binds: [B:495:0x0c00, B:492:0x0bdc, B:489:0x0bbc, B:486:0x0b9c, B:483:0x0b7c, B:480:0x0b5b, B:473:0x0b31, B:459:0x0aee, B:457:0x0ad0, B:453:0x0a86, B:432:0x09e9, B:421:0x0964] A[DONT_GENERATE, DONT_INLINE]
                  0x0c17: PHI (r8v76 int) = 
                  (r8v45 int)
                  (r8v46 int)
                  (r8v47 int)
                  (r8v48 int)
                  (r8v49 int)
                  (r8v50 int)
                  (r8v51 int)
                  (r8v52 int)
                  (r8v53 int)
                  (r8v56 int)
                  (r8v67 int)
                  (r8v77 int)
                 binds: [B:495:0x0c00, B:492:0x0bdc, B:489:0x0bbc, B:486:0x0b9c, B:483:0x0b7c, B:480:0x0b5b, B:473:0x0b31, B:459:0x0aee, B:457:0x0ad0, B:453:0x0a86, B:432:0x09e9, B:421:0x0964] A[DONT_GENERATE, DONT_INLINE]
                  0x0c17: PHI (r13v90 i1O1ll0i0) = 
                  (r13v58 i1O1ll0i0)
                  (r13v59 i1O1ll0i0)
                  (r13v60 i1O1ll0i0)
                  (r13v61 i1O1ll0i0)
                  (r13v62 i1O1ll0i0)
                  (r13v63 i1O1ll0i0)
                  (r13v64 i1O1ll0i0)
                  (r13v65 i1O1ll0i0)
                  (r13v66 i1O1ll0i0)
                  (r13v69 i1O1ll0i0)
                  (r13v79 i1O1ll0i0)
                  (r13v91 i1O1ll0i0)
                 binds: [B:495:0x0c00, B:492:0x0bdc, B:489:0x0bbc, B:486:0x0b9c, B:483:0x0b7c, B:480:0x0b5b, B:473:0x0b31, B:459:0x0aee, B:457:0x0ad0, B:453:0x0a86, B:432:0x09e9, B:421:0x0964] A[DONT_GENERATE, DONT_INLINE]
                  0x0c17: PHI (r14v46 int) = 
                  (r14v25 int)
                  (r14v26 int)
                  (r14v27 int)
                  (r14v28 int)
                  (r14v29 int)
                  (r14v30 int)
                  (r14v31 int)
                  (r14v32 int)
                  (r14v33 int)
                  (r14v35 int)
                  (r14v40 int)
                  (r14v47 int)
                 binds: [B:495:0x0c00, B:492:0x0bdc, B:489:0x0bbc, B:486:0x0b9c, B:483:0x0b7c, B:480:0x0b5b, B:473:0x0b31, B:459:0x0aee, B:457:0x0ad0, B:453:0x0a86, B:432:0x09e9, B:421:0x0964] A[DONT_GENERATE, DONT_INLINE]
                  0x0c17: PHI (r21v55 int) = 
                  (r21v31 int)
                  (r21v32 int)
                  (r21v33 int)
                  (r21v34 int)
                  (r21v35 int)
                  (r21v36 int)
                  (r21v37 int)
                  (r21v38 int)
                  (r21v40 int)
                  (r21v43 int)
                  (r21v48 int)
                  (r21v56 int)
                 binds: [B:495:0x0c00, B:492:0x0bdc, B:489:0x0bbc, B:486:0x0b9c, B:483:0x0b7c, B:480:0x0b5b, B:473:0x0b31, B:459:0x0aee, B:457:0x0ad0, B:453:0x0a86, B:432:0x09e9, B:421:0x0964] A[DONT_GENERATE, DONT_INLINE]] */
                /* JADX WARN: Removed duplicated region for block: B:507:0x0c54  */
                /* JADX WARN: Removed duplicated region for block: B:548:0x033f A[SYNTHETIC] */
                /* JADX WARN: Removed duplicated region for block: B:605:0x08de A[SYNTHETIC] */
                /* JADX WARN: Removed duplicated region for block: B:606:0x0c1a A[SYNTHETIC] */
                /* JADX WARN: Removed duplicated region for block: B:607:0x005f A[SYNTHETIC] */
                /* JADX WARN: Removed duplicated region for block: B:629:0x0c36 A[SYNTHETIC] */
                /* JADX WARN: Removed duplicated region for block: B:93:0x02a5  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final int I000OiO(Object obj, byte[] bArr, int i, int i2, int i3, i1O1ll0i0 i1o1ll0i0) {
                    Unsafe unsafe;
                    int i4;
                    Object[] objArr;
                    int[] iArr;
                    Object obj2;
                    int i5;
                    int i6;
                    int iI000OOo1O;
                    int i7;
                    int i8;
                    int i9;
                    byte[] bArr2;
                    i1O1ll0i0 i1o1ll0i02;
                    iOo00o ioo00o;
                    iOo00o ioo00oI00000oIO;
                    int i10;
                    byte[] bArr3;
                    int i11;
                    int i12;
                    int i13;
                    int i14;
                    i1O1ll0i0 i1o1ll0i03;
                    int iI0000Il00O;
                    Unsafe unsafe2;
                    Object obj3;
                    Object obj4;
                    i1O1ll0i0 i1o1ll0i04;
                    Unsafe unsafe3;
                    int iI00000oIO;
                    int i15;
                    int i16;
                    byte[] bArr4;
                    int i17;
                    Object obj5;
                    int i18;
                    byte[] bArr5;
                    i1O1ll0i0 i1o1ll0i05;
                    Unsafe unsafe4;
                    iOo00o ioo00o2;
                    int i19;
                    int i20;
                    byte[] bArr6;
                    int i21;
                    int i22;
                    iOo00o ioo00o3;
                    byte[] bArr7;
                    int i23;
                    i1O1ll0i0 i1o1ll0i06;
                    int i24;
                    int i25;
                    byte[] bArr8;
                    int i26;
                    int i27;
                    iOllI1i1l iolli1i1l;
                    int i28;
                    int i29;
                    int iI0000Il00O2;
                    byte[] bArr9;
                    i1O1ll0i0 i1o1ll0i07;
                    iOo00o ioo00o4;
                    int i30;
                    int i31;
                    int iI0001Ioi1lo;
                    int iI00000oIO2;
/* 1 */             iOllOIi iolloii = this;
/* 3 */             Object obj6 = obj;
/* 5 */             byte[] bArr10 = bArr;
/* 7 */             int i32 = i2;
/* 9 */             i1O1ll0i0 i1o1ll0i08 = i1o1ll0i0;
/* 11 */            Object[] objArr2 = iolloii.I00000oOI;
/* 13 */            int[] iArr2 = iolloii.I00000oIO;
/* 15 */            int i33 = iolloii.I0000O;
/* 21 */            if (!I00111O(obj6)) {
/* 3306 */              I000II.I000iOII("Mutating immutable message: ".concat(String.valueOf(obj6)));
/* 3309 */              return 0;
                    }
/* 23 */            int iI00000oIO3 = i;
/* 25 */            int i34 = -1;
/* 26 */            int i35 = 0;
/* 27 */            int i36 = 1048575;
/* 30 */            int i37 = 0;
/* 32 */            int i38 = 0;
                    while (true) {
/* 34 */                int i39 = 1048575;
                        while (true) {
/* 39 */                    unsafe = I000OiO;
/* 41 */                    if (iI00000oIO3 < i32) {
/* 43 */                        int iI00000oOI = iI00000oIO3 + 1;
/* 45 */                        int i40 = bArr10[iI00000oIO3];
/* 47 */                        if (i40 < 0) {
/* 49 */                            iI00000oOI = liio0i0O.I00000oOI(i40, bArr10, iI00000oOI, i1o1ll0i08);
/* 53 */                            i40 = i1o1ll0i08.I00000oIO;
                                }
/* 55 */                        int i41 = i40;
/* 57 */                        int i42 = iI00000oOI;
/* 60 */                        int i43 = i41 >>> 3;
/* 62 */                        i38 = i41;
/* 64 */                        int i44 = iolloii.I0000Il00O;
/* 66 */                        if (i43 > i34) {
/* 90 */                            iI000OOo1O = (i43 < i44 || i43 > i33) ? -1 : iolloii.I000OOo1O(i43, i35 / 3);
/* 91 */                            iOo00o ioo00o5 = iOo00o.I0000oI00;
/* 94 */                            if (iI000OOo1O != -1) {
/* 96 */                                i4 = i3;
/* 98 */                                i7 = i42;
/* 101 */                               objArr = objArr2;
/* 103 */                               iArr = iArr2;
/* 105 */                               i8 = i33;
/* 107 */                               i9 = i38;
/* 109 */                               obj2 = obj6;
/* 110 */                               bArr2 = bArr10;
/* 111 */                               i1o1ll0i02 = i1o1ll0i08;
/* 112 */                               ioo00o = ioo00o5;
/* 113 */                               i35 = 0;
                                    } else {
/* 116 */                               int i45 = i38 & 7;
/* 120 */                               int i46 = iArr2[iI000OOo1O + 1];
/* 124 */                               int iI0010o = I0010o(i46);
/* 130 */                               objArr = objArr2;
/* 132 */                               iArr = iArr2;
/* 128 */                               long j = i46 & i39;
/* 137 */                               Unsafe unsafe5 = I000OiO;
/* 145 */                               String str = "";
/* 157 */                               if (iI0010o <= 17) {
/* 161 */                                   int i47 = iArr[iI000OOo1O + 2];
/* 165 */                                   int i48 = 1 << (i47 >>> 20);
/* 167 */                                   int i49 = i47 & i39;
/* 169 */                                   i8 = i33;
/* 171 */                                   if (i49 != i36) {
/* 173 */                                       int i50 = i39;
/* 175 */                                       i10 = i43;
/* 177 */                                       if (i36 != i50) {
/* 182 */                                           unsafe.putInt(obj6, i36, i37);
/* 185 */                                           i50 = 1048575;
                                                }
/* 193 */                                       i37 = i49 == i50 ? 0 : unsafe.getInt(obj6, i49);
                                            } else {
/* 200 */                                       i10 = i43;
/* 204 */                                       i49 = i36;
                                            }
                                            switch (iI0010o) {
                                                case 0:
/* 1280 */                                          bArr3 = bArr;
/* 1282 */                                          i11 = i38;
/* 1284 */                                          i12 = i42;
/* 1292 */                                          i13 = iI000OOo1O;
/* 1294 */                                          i14 = i49;
/* 1296 */                                          i1o1ll0i03 = i1o1ll0i0;
/* 1298 */                                          if (i45 == 1) {
/* 1300 */                                              iI0000Il00O = i12 + 8;
/* 1302 */                                              i37 |= i48;
/* 1315 */                                              iOo0Ii1l.I0000Il00O.I00IOO(obj6, j, Double.longBitsToDouble(liio0i0O.I0000oI00(i12, bArr3)));
                                                        break;
                                                    }
/* 1205 */                                          obj3 = obj6;
/* 1320 */                                          i4 = i3;
/* 1322 */                                          ioo00o = ioo00o5;
/* 1323 */                                          i1o1ll0i02 = i1o1ll0i03;
/* 1324 */                                          i35 = i13;
/* 1326 */                                          i9 = i11;
/* 1328 */                                          i43 = i10;
/* 1330 */                                          obj2 = obj3;
/* 1331 */                                          i7 = i12;
/* 1332 */                                          bArr2 = bArr3;
/* 1333 */                                          i36 = i14;
                                                    break;
                                                case 1:
/* 1240 */                                          bArr3 = bArr;
/* 1242 */                                          i11 = i38;
/* 1244 */                                          i12 = i42;
/* 1251 */                                          i13 = iI000OOo1O;
/* 1253 */                                          i14 = i49;
/* 1255 */                                          i1o1ll0i03 = i1o1ll0i0;
/* 1257 */                                          if (i45 == 5) {
/* 1261 */                                              i37 |= i48;
/* 1273 */                                              iOo0Ii1l.I0000Il00O.I001lloI(obj6, j, Float.intBitsToFloat(liio0i0O.I0000O(i12, bArr3)));
/* 1276 */                                              i32 = i2;
/* 1259 */                                              iI00000oIO3 = i12 + 4;
                                                        break;
                                                    }
/* 1205 */                                          obj3 = obj6;
/* 1320 */                                          i4 = i3;
/* 1322 */                                          ioo00o = ioo00o5;
/* 1323 */                                          i1o1ll0i02 = i1o1ll0i03;
/* 1324 */                                          i35 = i13;
/* 1326 */                                          i9 = i11;
/* 1328 */                                          i43 = i10;
/* 1330 */                                          obj2 = obj3;
/* 1331 */                                          i7 = i12;
/* 1332 */                                          bArr2 = bArr3;
/* 1333 */                                          i36 = i14;
                                                    break;
                                                case 2:
                                                case 3:
/* 1208 */                                          bArr3 = bArr;
/* 1210 */                                          i11 = i38;
/* 1212 */                                          i12 = i42;
/* 1218 */                                          i13 = iI000OOo1O;
/* 1220 */                                          i14 = i49;
/* 1222 */                                          unsafe2 = unsafe;
/* 1223 */                                          i1o1ll0i03 = i1o1ll0i0;
/* 1225 */                                          if (i45 == 0) {
/* 1227 */                                              i37 |= i48;
/* 1229 */                                              iI0000Il00O = liio0i0O.I0000Il00O(bArr3, i12, i1o1ll0i03);
/* 1236 */                                              unsafe2.putLong(obj6, j, i1o1ll0i03.I00000oOI);
                                                        break;
                                                    }
/* 1204 */                                          unsafe = unsafe2;
/* 1205 */                                          obj3 = obj6;
/* 1320 */                                          i4 = i3;
/* 1322 */                                          ioo00o = ioo00o5;
/* 1323 */                                          i1o1ll0i02 = i1o1ll0i03;
/* 1324 */                                          i35 = i13;
/* 1326 */                                          i9 = i11;
/* 1328 */                                          i43 = i10;
/* 1330 */                                          obj2 = obj3;
/* 1331 */                                          i7 = i12;
/* 1332 */                                          bArr2 = bArr3;
/* 1333 */                                          i36 = i14;
                                                    break;
                                                case 4:
                                                case 11:
/* 1171 */                                          bArr3 = bArr;
/* 1173 */                                          i11 = i38;
/* 1175 */                                          i12 = i42;
/* 1181 */                                          i13 = iI000OOo1O;
/* 1183 */                                          i14 = i49;
/* 1185 */                                          unsafe2 = unsafe;
/* 1186 */                                          i1o1ll0i03 = i1o1ll0i0;
/* 1188 */                                          if (i45 == 0) {
/* 1190 */                                              i37 |= i48;
/* 1192 */                                              iI00000oIO3 = liio0i0O.I00000oIO(bArr3, i12, i1o1ll0i03);
/* 1198 */                                              unsafe2.putInt(obj6, j, i1o1ll0i03.I00000oIO);
/* 1201 */                                              i32 = i2;
                                                        break;
                                                    }
/* 1204 */                                          unsafe = unsafe2;
/* 1205 */                                          obj3 = obj6;
/* 1320 */                                          i4 = i3;
/* 1322 */                                          ioo00o = ioo00o5;
/* 1323 */                                          i1o1ll0i02 = i1o1ll0i03;
/* 1324 */                                          i35 = i13;
/* 1326 */                                          i9 = i11;
/* 1328 */                                          i43 = i10;
/* 1330 */                                          obj2 = obj3;
/* 1331 */                                          i7 = i12;
/* 1332 */                                          bArr2 = bArr3;
/* 1333 */                                          i36 = i14;
                                                    break;
                                                case 5:
                                                case 14:
/* 1125 */                                          bArr3 = bArr;
/* 1127 */                                          obj4 = obj6;
/* 1128 */                                          i11 = i38;
/* 1130 */                                          i12 = i42;
/* 1138 */                                          i13 = iI000OOo1O;
/* 1140 */                                          i14 = i49;
/* 1145 */                                          if (i45 == 1) {
/* 1147 */                                              iI0000Il00O = i12 + 8;
/* 1149 */                                              i37 |= i48;
/* 1156 */                                              i1o1ll0i03 = i1o1ll0i0;
/* 1157 */                                              obj6 = obj4;
/* 1158 */                                              unsafe.putLong(obj6, j, liio0i0O.I0000oI00(i12, bArr3));
                                                        break;
                                                    } else {
/* 1168 */                                              i1o1ll0i03 = i1o1ll0i0;
/* 1169 */                                              unsafe = unsafe;
/* 1043 */                                              obj3 = obj4;
/* 1320 */                                              i4 = i3;
/* 1322 */                                              ioo00o = ioo00o5;
/* 1323 */                                              i1o1ll0i02 = i1o1ll0i03;
/* 1324 */                                              i35 = i13;
/* 1326 */                                              i9 = i11;
/* 1328 */                                              i43 = i10;
/* 1330 */                                              obj2 = obj3;
/* 1331 */                                              i7 = i12;
/* 1332 */                                              bArr2 = bArr3;
/* 1333 */                                              i36 = i14;
                                                        break;
                                                    }
                                                case 6:
                                                case 13:
/* 1088 */                                          bArr3 = bArr;
/* 1090 */                                          obj4 = obj6;
/* 1091 */                                          i11 = i38;
/* 1093 */                                          i12 = i42;
/* 1098 */                                          i1o1ll0i04 = i1o1ll0i0;
/* 1100 */                                          i13 = iI000OOo1O;
/* 1102 */                                          i14 = i49;
/* 1104 */                                          unsafe3 = unsafe;
/* 1107 */                                          if (i45 == 5) {
/* 1111 */                                              i37 |= i48;
/* 1117 */                                              unsafe3.putInt(obj4, j, liio0i0O.I0000O(i12, bArr3));
/* 1120 */                                              i32 = i2;
/* 1122 */                                              i1o1ll0i08 = i1o1ll0i04;
/* 1109 */                                              iI00000oIO3 = i12 + 4;
                                                        break;
                                                    }
/* 1041 */                                          unsafe = unsafe3;
/* 1042 */                                          i1o1ll0i03 = i1o1ll0i04;
/* 1043 */                                          obj3 = obj4;
/* 1320 */                                          i4 = i3;
/* 1322 */                                          ioo00o = ioo00o5;
/* 1323 */                                          i1o1ll0i02 = i1o1ll0i03;
/* 1324 */                                          i35 = i13;
/* 1326 */                                          i9 = i11;
/* 1328 */                                          i43 = i10;
/* 1330 */                                          obj2 = obj3;
/* 1331 */                                          i7 = i12;
/* 1332 */                                          bArr2 = bArr3;
/* 1333 */                                          i36 = i14;
                                                    break;
                                                case 7:
/* 1046 */                                          bArr3 = bArr;
/* 1048 */                                          obj4 = obj6;
/* 1049 */                                          i11 = i38;
/* 1051 */                                          i12 = i42;
/* 1055 */                                          i1o1ll0i04 = i1o1ll0i0;
/* 1057 */                                          i13 = iI000OOo1O;
/* 1059 */                                          i14 = i49;
/* 1061 */                                          unsafe3 = unsafe;
/* 1064 */                                          if (i45 == 0) {
/* 1066 */                                              i37 |= i48;
/* 1068 */                                              iI00000oIO3 = liio0i0O.I0000Il00O(bArr3, i12, i1o1ll0i04);
/* 1084 */                                              iOo0Ii1l.I0000Il00O.I001IO000(obj4, j, i1o1ll0i04.I00000oOI != 0);
                                                        break;
                                                    }
/* 1041 */                                          unsafe = unsafe3;
/* 1042 */                                          i1o1ll0i03 = i1o1ll0i04;
/* 1043 */                                          obj3 = obj4;
/* 1320 */                                          i4 = i3;
/* 1322 */                                          ioo00o = ioo00o5;
/* 1323 */                                          i1o1ll0i02 = i1o1ll0i03;
/* 1324 */                                          i35 = i13;
/* 1326 */                                          i9 = i11;
/* 1328 */                                          i43 = i10;
/* 1330 */                                          obj2 = obj3;
/* 1331 */                                          i7 = i12;
/* 1332 */                                          bArr2 = bArr3;
/* 1333 */                                          i36 = i14;
                                                    break;
                                                case 8:
/* 603 */                                           bArr3 = bArr;
/* 605 */                                           obj4 = obj6;
/* 606 */                                           i11 = i38;
/* 608 */                                           i12 = i42;
/* 612 */                                           i1o1ll0i04 = i1o1ll0i0;
/* 614 */                                           i13 = iI000OOo1O;
/* 616 */                                           i14 = i49;
/* 618 */                                           unsafe3 = unsafe;
/* 622 */                                           if (i45 == 2) {
/* 626 */                                               if ((i46 & 536870912) != 0) {
/* 628 */                                                   iI00000oIO = liio0i0O.I00000oIO(bArr3, i12, i1o1ll0i04);
/* 632 */                                                   int i51 = i1o1ll0i04.I00000oIO;
/* 634 */                                                   if (i51 < 0) {
/* 988 */                                                       throw new iOlio0iO001("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                                            }
/* 636 */                                                   i15 = i37 | i48;
/* 638 */                                                   if (i51 == 0) {
/* 640 */                                                       i1o1ll0i04.I0000Il00O = "";
                                                            } else {
/* 645 */                                                       int i52 = iOo0OoO0l.I00000oIO;
/* 647 */                                                       int length = bArr3.length;
/* 654 */                                                       if ((((length - iI00000oIO) - i51) | iI00000oIO | i51) < 0) {
/* 979 */                                                           OoOil11Ol1o.I000o00OoI0I("buffer length=%d, index=%d, size=%d", new Object[]{Integer.valueOf(length), Integer.valueOf(iI00000oIO), Integer.valueOf(i51)});
/* 960 */                                                           return 0;
                                                                }
/* 656 */                                                       int i53 = iI00000oIO + i51;
/* 658 */                                                       char[] cArr = new char[i51];
/* 660 */                                                       int i54 = 0;
/* 661 */                                                       while (iI00000oIO < i53) {
/* 663 */                                                           byte b = bArr3[iI00000oIO];
/* 665 */                                                           if (b >= 0) {
/* 667 */                                                               iI00000oIO++;
/* 672 */                                                               cArr[i54] = (char) b;
/* 669 */                                                               i54++;
                                                                    } else {
/* 676 */                                                               while (iI00000oIO < i53) {
/* 678 */                                                                   int i55 = iI00000oIO + 1;
/* 680 */                                                                   byte b2 = bArr3[iI00000oIO];
/* 682 */                                                                   if (b2 >= 0) {
/* 687 */                                                                       cArr[i54] = (char) b2;
/* 684 */                                                                       i54++;
/* 690 */                                                                       iI00000oIO = i55;
/* 691 */                                                                       while (iI00000oIO < i53) {
/* 693 */                                                                           byte b3 = bArr3[iI00000oIO];
/* 695 */                                                                           if (b3 >= 0) {
/* 697 */                                                                               iI00000oIO++;
/* 702 */                                                                               cArr[i54] = (char) b3;
/* 699 */                                                                               i54++;
                                                                                    }
                                                                                }
                                                                            } else {
/* 706 */                                                                       int i56 = iI00000oIO;
/* 710 */                                                                       if (b2 >= -32) {
/* 761 */                                                                           if (b2 < -16) {
/* 765 */                                                                               if (i55 >= i53 - 1) {
/* 843 */                                                                                   throw new iOlio0iO001("Protocol message had invalid UTF-8.");
                                                                                        }
/* 767 */                                                                               int i57 = i54 + 1;
/* 769 */                                                                               int i58 = i56 + 2;
/* 771 */                                                                               byte b4 = bArr3[i55];
/* 773 */                                                                               int i59 = i56 + 3;
/* 775 */                                                                               byte b5 = bArr3[i58];
/* 781 */                                                                               if (lil01o.I00000oIO(b4)) {
                                                                                            break;
                                                                                        } else {
/* 787 */                                                                                   i16 = i53;
/* 791 */                                                                                   if (b2 == -32) {
/* 793 */                                                                                       if (b4 < -96) {
                                                                                                    break;
                                                                                                } else {
/* 795 */                                                                                           b2 = -32;
/* 798 */                                                                                           if (b2 == -19) {
                                                                                                    }
                                                                                                }
                                                                                            } else if (b2 == -19) {
/* 800 */                                                                                       if (b4 >= -96) {
                                                                                                    break;
                                                                                                } else {
/* 802 */                                                                                           b2 = -19;
/* 807 */                                                                                           if (!lil01o.I00000oIO(b5)) {
                                                                                                    }
                                                                                                }
                                                                                            } else if (!lil01o.I00000oIO(b5)) {
                                                                                                break;
                                                                                            } else {
/* 822 */                                                                                       cArr[i54] = (char) (((b2 & 15) << 12) | ((b4 & 63) << 6) | (b5 & 63));
/* 824 */                                                                                       iI00000oIO = i59;
/* 826 */                                                                                       i54 = i57;
                                                                                            }
                                                                                        }
                                                                                    } else {
/* 844 */                                                                               i16 = i53;
/* 848 */                                                                               if (i55 >= i16 - 2) {
/* 943 */                                                                                   throw new iOlio0iO001("Protocol message had invalid UTF-8.");
                                                                                        }
/* 852 */                                                                               byte b6 = bArr3[i55];
/* 854 */                                                                               int i60 = i56 + 3;
/* 856 */                                                                               byte b7 = bArr3[i56 + 2];
/* 858 */                                                                               int i61 = i56 + 4;
/* 860 */                                                                               byte b8 = bArr3[i60];
/* 866 */                                                                               if (lil01o.I00000oIO(b6)) {
                                                                                            break;
                                                                                        } else if ((((b6 + 112) + (b2 << 28)) >> 30) != 0 || lil01o.I00000oIO(b7) || lil01o.I00000oIO(b8)) {
                                                                                            break;
                                                                                        } else {
/* 906 */                                                                                   int i62 = ((b7 & 63) << 6) | ((b6 & 63) << 12) | ((b2 & 7) << 18) | (b8 & 63);
/* 914 */                                                                                   cArr[i54] = (char) ((i62 >>> 10) + 55232);
/* 925 */                                                                                   cArr[i54 + 1] = (char) ((i62 & 1023) + 56320);
/* 927 */                                                                                   i54 += 2;
/* 929 */                                                                                   iI00000oIO = i61;
                                                                                        }
                                                                                    }
/* 828 */                                                                           i53 = i16;
                                                                                } else {
/* 712 */                                                                           if (i55 >= i53) {
/* 758 */                                                                               throw new iOlio0iO001("Protocol message had invalid UTF-8.");
                                                                                    }
/* 714 */                                                                           int i63 = i54 + 1;
/* 716 */                                                                           int i64 = i56 + 2;
/* 718 */                                                                           byte b9 = bArr3[i55];
/* 724 */                                                                           if (b2 < -62 || lil01o.I00000oIO(b9)) {
                                                                                        break;
                                                                                    } else {
/* 740 */                                                                               cArr[i54] = (char) (((b2 & 31) << 6) | (b9 & 63));
/* 742 */                                                                               i54 = i63;
/* 744 */                                                                               iI00000oIO = i64;
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
/* 944 */                                                               int i65 = i53;
/* 949 */                                                               str = new String(cArr, 0, i54);
/* 952 */                                                               i1o1ll0i04.I0000Il00O = str;
/* 954 */                                                               iI00000oIO = i65;
                                                                    }
                                                                }
/* 676 */                                                       while (iI00000oIO < i53) {
                                                                }
/* 944 */                                                       int i652 = i53;
/* 949 */                                                       str = new String(cArr, 0, i54);
/* 952 */                                                       i1o1ll0i04.I0000Il00O = str;
/* 954 */                                                       iI00000oIO = i652;
                                                            }
                                                        } else {
/* 989 */                                                   iI00000oIO = liio0i0O.I00000oIO(bArr3, i12, i1o1ll0i04);
/* 993 */                                                   int i66 = i1o1ll0i04.I00000oIO;
/* 995 */                                                   if (i66 < 0) {
/* 1040 */                                                      throw new iOlio0iO001("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                                            }
/* 997 */                                                   i15 = i37 | i48;
/* 999 */                                                   if (i66 == 0) {
/* 1001 */                                                      i1o1ll0i04.I0000Il00O = "";
                                                            } else {
/* 1008 */                                                      str = new String(bArr3, iI00000oIO, i66, StandardCharsets.UTF_8);
/* 1011 */                                                      i1o1ll0i04.I0000Il00O = str;
/* 1013 */                                                      iI00000oIO += i66;
                                                            }
                                                        }
/* 956 */                                               iI00000oIO3 = iI00000oIO;
/* 957 */                                               i37 = i15;
/* 1015 */                                              unsafe3.putObject(obj4, j, str);
                                                        break;
                                                    }
/* 1041 */                                          unsafe = unsafe3;
/* 1042 */                                          i1o1ll0i03 = i1o1ll0i04;
/* 1043 */                                          obj3 = obj4;
/* 1320 */                                          i4 = i3;
/* 1322 */                                          ioo00o = ioo00o5;
/* 1323 */                                          i1o1ll0i02 = i1o1ll0i03;
/* 1324 */                                          i35 = i13;
/* 1326 */                                          i9 = i11;
/* 1328 */                                          i43 = i10;
/* 1330 */                                          obj2 = obj3;
/* 1331 */                                          i7 = i12;
/* 1332 */                                          bArr2 = bArr3;
/* 1333 */                                          i36 = i14;
                                                    break;
                                                case 9:
/* 537 */                                           i17 = iI000OOo1O;
/* 538 */                                           obj5 = obj6;
/* 540 */                                           i18 = i38;
/* 542 */                                           i12 = i42;
/* 549 */                                           i14 = i49;
/* 551 */                                           if (i45 != 2) {
/* 595 */                                               bArr3 = bArr;
/* 596 */                                               i1o1ll0i03 = i1o1ll0i0;
/* 597 */                                               i13 = i17;
/* 599 */                                               i11 = i18;
/* 601 */                                               unsafe = unsafe;
/* 498 */                                               obj3 = obj5;
/* 1320 */                                              i4 = i3;
/* 1322 */                                              ioo00o = ioo00o5;
/* 1323 */                                              i1o1ll0i02 = i1o1ll0i03;
/* 1324 */                                              i35 = i13;
/* 1326 */                                              i9 = i11;
/* 1328 */                                              i43 = i10;
/* 1330 */                                              obj2 = obj3;
/* 1331 */                                              i7 = i12;
/* 1332 */                                              bArr2 = bArr3;
/* 1333 */                                              i36 = i14;
                                                        break;
                                                    } else {
/* 553 */                                               i37 |= i48;
/* 555 */                                               Object objI00100l0 = iolloii.I00100l0(i17, obj5);
/* 567 */                                               iI00000oIO3 = liio0i0O.I000O01llI0(objI00100l0, iolloii.I000o00OoI0I(i17), bArr, i12, i2, i1o1ll0i0);
/* 583 */                                               unsafe5.putObject(obj5, iolloii.I0010I0i(i17) & 1048575, objI00100l0);
/* 586 */                                               iolloii.I000II(i17, obj5);
/* 589 */                                               i32 = i2;
/* 591 */                                               i1o1ll0i08 = i1o1ll0i0;
/* 592 */                                               bArr10 = bArr;
/* 466 */                                               obj6 = obj5;
/* 467 */                                               i35 = i17;
/* 468 */                                               i36 = i14;
/* 470 */                                               objArr2 = objArr;
/* 472 */                                               iArr2 = iArr;
/* 474 */                                               i33 = i8;
/* 476 */                                               i34 = i10;
/* 478 */                                               i39 = 1048575;
/* 481 */                                               i38 = i18;
                                                    }
                                                case 10:
/* 501 */                                           bArr5 = bArr;
/* 503 */                                           i1o1ll0i05 = i1o1ll0i0;
/* 505 */                                           i17 = iI000OOo1O;
/* 506 */                                           obj5 = obj6;
/* 507 */                                           unsafe4 = unsafe;
/* 508 */                                           i18 = i38;
/* 510 */                                           i12 = i42;
/* 515 */                                           i14 = i49;
/* 519 */                                           if (i45 != 2) {
/* 491 */                                               i1o1ll0i03 = i1o1ll0i05;
/* 492 */                                               i13 = i17;
/* 494 */                                               i11 = i18;
/* 496 */                                               unsafe = unsafe4;
/* 497 */                                               bArr3 = bArr5;
/* 498 */                                               obj3 = obj5;
/* 1320 */                                              i4 = i3;
/* 1322 */                                              ioo00o = ioo00o5;
/* 1323 */                                              i1o1ll0i02 = i1o1ll0i03;
/* 1324 */                                              i35 = i13;
/* 1326 */                                              i9 = i11;
/* 1328 */                                              i43 = i10;
/* 1330 */                                              obj2 = obj3;
/* 1331 */                                              i7 = i12;
/* 1332 */                                              bArr2 = bArr3;
/* 1333 */                                              i36 = i14;
                                                        break;
                                                    } else {
/* 521 */                                               i37 |= i48;
/* 523 */                                               iI00000oIO3 = liio0i0O.I0001Ioi1lo(bArr5, i12, i1o1ll0i05);
/* 529 */                                               unsafe4.putObject(obj5, j, i1o1ll0i05.I0000Il00O);
/* 462 */                                               i32 = i2;
/* 464 */                                               bArr10 = bArr5;
/* 465 */                                               i1o1ll0i08 = i1o1ll0i05;
/* 466 */                                               obj6 = obj5;
/* 467 */                                               i35 = i17;
/* 468 */                                               i36 = i14;
/* 470 */                                               objArr2 = objArr;
/* 472 */                                               iArr2 = iArr;
/* 474 */                                               i33 = i8;
/* 476 */                                               i34 = i10;
/* 478 */                                               i39 = 1048575;
/* 481 */                                               i38 = i18;
                                                    }
                                                case 12:
/* 398 */                                           bArr5 = bArr;
/* 400 */                                           i1o1ll0i05 = i1o1ll0i0;
/* 402 */                                           i17 = iI000OOo1O;
/* 403 */                                           obj5 = obj6;
/* 404 */                                           unsafe4 = unsafe;
/* 405 */                                           i18 = i38;
/* 407 */                                           i12 = i42;
/* 411 */                                           i14 = i49;
/* 415 */                                           if (i45 != 0) {
/* 491 */                                               i1o1ll0i03 = i1o1ll0i05;
/* 492 */                                               i13 = i17;
/* 494 */                                               i11 = i18;
/* 496 */                                               unsafe = unsafe4;
/* 497 */                                               bArr3 = bArr5;
/* 498 */                                               obj3 = obj5;
/* 1320 */                                              i4 = i3;
/* 1322 */                                              ioo00o = ioo00o5;
/* 1323 */                                              i1o1ll0i02 = i1o1ll0i03;
/* 1324 */                                              i35 = i13;
/* 1326 */                                              i9 = i11;
/* 1328 */                                              i43 = i10;
/* 1330 */                                              obj2 = obj3;
/* 1331 */                                              i7 = i12;
/* 1332 */                                              bArr2 = bArr3;
/* 1333 */                                              i36 = i14;
                                                        break;
                                                    } else {
/* 417 */                                               iI00000oIO3 = liio0i0O.I00000oIO(bArr5, i12, i1o1ll0i05);
/* 421 */                                               int i67 = i1o1ll0i05.I00000oIO;
/* 423 */                                               iOo10Oi ioo10oiI000oI1ioi = iolloii.I000oI1ioi(i17);
/* 430 */                                               if ((i46 & Integer.MIN_VALUE) == 0 || ioo10oiI000oI1ioi == null || ioo10oiI000oI1ioi.I00000oIO(i67)) {
/* 485 */                                                   i37 |= i48;
/* 487 */                                                   unsafe4.putInt(obj5, j, i67);
                                                        } else {
/* 442 */                                                   iOlOoOlI0li1 ioloooli0li1 = (iOlOoOlI0li1) obj5;
/* 444 */                                                   iOo00o ioo00oI00000oIO2 = ioloooli0li1.zzc;
/* 446 */                                                   if (ioo00oI00000oIO2 == ioo00o5) {
/* 448 */                                                       ioo00oI00000oIO2 = iOo00o.I00000oIO();
/* 452 */                                                       ioloooli0li1.zzc = ioo00oI00000oIO2;
                                                            }
/* 459 */                                                   ioo00oI00000oIO2.I00000oOI(i18, Long.valueOf(i67));
                                                        }
/* 462 */                                               i32 = i2;
/* 464 */                                               bArr10 = bArr5;
/* 465 */                                               i1o1ll0i08 = i1o1ll0i05;
/* 466 */                                               obj6 = obj5;
/* 467 */                                               i35 = i17;
/* 468 */                                               i36 = i14;
/* 470 */                                               objArr2 = objArr;
/* 472 */                                               iArr2 = iArr;
/* 474 */                                               i33 = i8;
/* 476 */                                               i34 = i10;
/* 478 */                                               i39 = 1048575;
/* 481 */                                               i38 = i18;
                                                    }
                                                case 15:
/* 344 */                                           bArr4 = bArr;
/* 348 */                                           int i68 = iI000OOo1O;
/* 349 */                                           Object obj7 = obj6;
/* 353 */                                           i12 = i42;
/* 359 */                                           if (i45 == 0) {
/* 361 */                                               i37 |= i48;
/* 363 */                                               iI00000oIO3 = liio0i0O.I00000oIO(bArr4, i12, i1o1ll0i0);
/* 367 */                                               int i69 = i1o1ll0i0.I00000oIO;
/* 375 */                                               unsafe.putInt(obj7, j, (i69 >>> 1) ^ (-(i69 & 1)));
/* 378 */                                               i32 = i2;
/* 380 */                                               bArr10 = bArr4;
/* 381 */                                               i1o1ll0i08 = i1o1ll0i0;
/* 382 */                                               obj6 = obj7;
/* 383 */                                               i36 = i49;
/* 384 */                                               i35 = i68;
/* 385 */                                               i38 = i38;
                                                        break;
                                                    } else {
/* 388 */                                               i14 = i49;
/* 390 */                                               i13 = i68;
/* 392 */                                               i11 = i38;
/* 394 */                                               unsafe = unsafe;
/* 395 */                                               i1o1ll0i03 = i1o1ll0i0;
/* 396 */                                               obj3 = obj7;
/* 341 */                                               bArr3 = bArr4;
/* 1320 */                                              i4 = i3;
/* 1322 */                                              ioo00o = ioo00o5;
/* 1323 */                                              i1o1ll0i02 = i1o1ll0i03;
/* 1324 */                                              i35 = i13;
/* 1326 */                                              i9 = i11;
/* 1328 */                                              i43 = i10;
/* 1330 */                                              obj2 = obj3;
/* 1331 */                                              i7 = i12;
/* 1332 */                                              bArr2 = bArr3;
/* 1333 */                                              i36 = i14;
                                                        break;
                                                    }
                                                case 16:
/* 292 */                                           bArr4 = bArr;
/* 296 */                                           i12 = i42;
/* 300 */                                           if (i45 == 0) {
/* 302 */                                               i37 |= i48;
/* 304 */                                               int iI0000Il00O3 = liio0i0O.I0000Il00O(bArr4, i12, i1o1ll0i0);
/* 308 */                                               long j2 = i1o1ll0i0.I00000oOI;
/* 322 */                                               unsafe.putLong(obj6, j, (-(j2 & 1)) ^ (j2 >>> 1));
/* 325 */                                               i32 = i2;
/* 327 */                                               bArr10 = bArr4;
/* 328 */                                               iI00000oIO3 = iI0000Il00O3;
/* 329 */                                               i1o1ll0i08 = i1o1ll0i0;
/* 330 */                                               i36 = i49;
/* 331 */                                               i35 = iI000OOo1O;
                                                        break;
                                                    } else {
/* 333 */                                               i13 = iI000OOo1O;
/* 335 */                                               obj3 = obj6;
/* 336 */                                               i11 = i38;
/* 338 */                                               i14 = i49;
/* 340 */                                               i1o1ll0i03 = i1o1ll0i0;
/* 341 */                                               bArr3 = bArr4;
/* 1320 */                                              i4 = i3;
/* 1322 */                                              ioo00o = ioo00o5;
/* 1323 */                                              i1o1ll0i02 = i1o1ll0i03;
/* 1324 */                                              i35 = i13;
/* 1326 */                                              i9 = i11;
/* 1328 */                                              i43 = i10;
/* 1330 */                                              obj2 = obj3;
/* 1331 */                                              i7 = i12;
/* 1332 */                                              bArr2 = bArr3;
/* 1333 */                                              i36 = i14;
                                                        break;
                                                    }
                                                default:
/* 210 */                                           if (i45 == 3) {
/* 212 */                                               i37 |= i48;
/* 214 */                                               Object objI00100l02 = iolloii.I00100l0(iI000OOo1O, obj6);
/* 238 */                                               iI00000oIO3 = liio0i0O.I000OOo1O(objI00100l02, iolloii.I000o00OoI0I(iI000OOo1O), bArr, i42, i2, (i10 << 3) | 4, i1o1ll0i0);
/* 253 */                                               unsafe5.putObject(obj6, iolloii.I0010I0i(iI000OOo1O) & 1048575, objI00100l02);
/* 256 */                                               iolloii.I000II(iI000OOo1O, obj6);
/* 259 */                                               i32 = i2;
/* 261 */                                               i35 = iI000OOo1O;
/* 262 */                                               bArr10 = bArr;
/* 263 */                                               i1o1ll0i08 = i1o1ll0i0;
/* 264 */                                               i36 = i49;
                                                        break;
                                                    } else {
/* 277 */                                               bArr3 = bArr;
/* 279 */                                               i11 = i38;
/* 281 */                                               i12 = i42;
/* 283 */                                               i13 = iI000OOo1O;
/* 285 */                                               obj3 = obj6;
/* 286 */                                               i14 = i49;
/* 288 */                                               i1o1ll0i03 = i1o1ll0i0;
/* 1320 */                                              i4 = i3;
/* 1322 */                                              ioo00o = ioo00o5;
/* 1323 */                                              i1o1ll0i02 = i1o1ll0i03;
/* 1324 */                                              i35 = i13;
/* 1326 */                                              i9 = i11;
/* 1328 */                                              i43 = i10;
/* 1330 */                                              obj2 = obj3;
/* 1331 */                                              i7 = i12;
/* 1332 */                                              bArr2 = bArr3;
/* 1333 */                                              i36 = i14;
                                                        break;
                                                    }
                                            }
                                        } else {
/* 1337 */                                  Object obj8 = obj6;
/* 1338 */                                  int i70 = iI000OOo1O;
/* 1340 */                                  i8 = i33;
/* 1342 */                                  i10 = i43;
/* 1344 */                                  int i71 = i37;
/* 1350 */                                  int i72 = i36;
/* 1358 */                                  if (iI0010o != 27) {
/* 1452 */                                      obj2 = obj8;
/* 1453 */                                      i19 = i71;
/* 1455 */                                      i20 = i70;
/* 1460 */                                      if (iI0010o <= 49) {
                                                    long j3 = i46;
/* 1469 */                                          iOlil0i iolil0iI0000oI00 = (iOlil0i) unsafe.getObject(obj2, j);
/* 1476 */                                          if (!((iOloOiOiiOO) iolil0iI0000oI00).I00iOIl) {
/* 1478 */                                              int size = iolil0iI0000oI00.size();
/* 1485 */                                              iolil0iI0000oI00 = ((iOloOiOiiOO) iolil0iI0000oI00).I0000oI00(size + size);
/* 1489 */                                              unsafe.putObject(obj2, j, iolil0iI0000oI00);
                                                    }
/* 1492 */                                          iOlil0i iolil0i = iolil0iI0000oI00;
                                                    switch (iI0010o) {
                                                        case PoseLandmark.RIGHT_PINKY:
                                                        case InputImage.IMAGE_FORMAT_YUV_420_888:
/* 2248 */                                                  bArr6 = bArr;
/* 2250 */                                                  i21 = i2;
/* 2252 */                                                  i1o1ll0i02 = i1o1ll0i0;
/* 2254 */                                                  i11 = i38;
/* 2256 */                                                  i22 = i42;
/* 2261 */                                                  ioo00o3 = ioo00o5;
/* 2263 */                                                  if (i45 == 2) {
/* 2309 */                                                      OIiilo1Ool0o.I00000oIO();
/* 2259 */                                                      return 0;
                                                            }
/* 2266 */                                                  if (i45 == 1) {
/* 2305 */                                                      OIiilo1Ool0o.I00000oIO();
/* 2259 */                                                      return 0;
                                                            }
/* 2268 */                                                  iI00000oIO3 = i22;
/* 2269 */                                                  if (iI00000oIO3 == i22) {
/* 2271 */                                                      iolloii = this;
/* 2273 */                                                      bArr10 = bArr6;
/* 2274 */                                                      i32 = i21;
/* 2275 */                                                      obj6 = obj2;
/* 2276 */                                                      i1o1ll0i08 = i1o1ll0i02;
/* 2277 */                                                      i35 = i20;
/* 2278 */                                                      i36 = i72;
/* 2280 */                                                      objArr2 = objArr;
/* 2282 */                                                      iArr2 = iArr;
/* 2284 */                                                      i37 = i19;
                                                                break;
                                                            } else {
/* 2288 */                                                      i4 = i3;
/* 2290 */                                                      i7 = iI00000oIO3;
/* 2291 */                                                      bArr2 = bArr6;
/* 2292 */                                                      i35 = i20;
/* 2293 */                                                      i36 = i72;
/* 2295 */                                                      ioo00o = ioo00o3;
/* 2297 */                                                      i37 = i19;
/* 2299 */                                                      i9 = i11;
                                                                break;
                                                            }
                                                        case PoseLandmark.LEFT_INDEX:
                                                        case 36:
/* 2219 */                                                  bArr6 = bArr;
/* 2221 */                                                  i21 = i2;
/* 2223 */                                                  i1o1ll0i02 = i1o1ll0i0;
/* 2225 */                                                  i11 = i38;
/* 2227 */                                                  i22 = i42;
/* 2232 */                                                  ioo00o3 = ioo00o5;
/* 2234 */                                                  if (i45 == 2) {
/* 2244 */                                                      OIiilo1Ool0o.I00000oIO();
/* 2230 */                                                      return 0;
                                                            }
/* 2237 */                                                  if (i45 == 5) {
/* 2240 */                                                      OIiilo1Ool0o.I00000oIO();
/* 2230 */                                                      return 0;
                                                            }
/* 2268 */                                                  iI00000oIO3 = i22;
/* 2269 */                                                  if (iI00000oIO3 == i22) {
                                                            }
                                                            break;
                                                        case PoseLandmark.RIGHT_INDEX:
                                                        case PoseLandmark.LEFT_THUMB:
                                                        case 37:
                                                        case 38:
/* 2191 */                                                  bArr6 = bArr;
/* 2193 */                                                  i21 = i2;
/* 2195 */                                                  i1o1ll0i02 = i1o1ll0i0;
/* 2197 */                                                  i11 = i38;
/* 2199 */                                                  i22 = i42;
/* 2204 */                                                  ioo00o3 = ioo00o5;
/* 2206 */                                                  if (i45 == 2) {
/* 2215 */                                                      OIiilo1Ool0o.I00000oIO();
/* 2202 */                                                      return 0;
                                                            }
/* 2208 */                                                  if (i45 == 0) {
/* 2211 */                                                      OIiilo1Ool0o.I00000oIO();
/* 2202 */                                                      return 0;
                                                            }
/* 2268 */                                                  iI00000oIO3 = i22;
/* 2269 */                                                  if (iI00000oIO3 == i22) {
                                                            }
                                                            break;
                                                        case PoseLandmark.RIGHT_THUMB:
                                                        case PoseLandmark.LEFT_HEEL:
                                                        case 39:
                                                        case 43:
/* 2163 */                                                  bArr6 = bArr;
/* 2165 */                                                  i21 = i2;
/* 2167 */                                                  i1o1ll0i02 = i1o1ll0i0;
/* 2169 */                                                  i11 = i38;
/* 2171 */                                                  i22 = i42;
/* 2176 */                                                  ioo00o3 = ioo00o5;
/* 2178 */                                                  if (i45 == 2) {
/* 2187 */                                                      OIiilo1Ool0o.I00000oIO();
/* 2174 */                                                      return 0;
                                                            }
/* 2180 */                                                  if (i45 == 0) {
/* 2183 */                                                      OIiilo1Ool0o.I00000oIO();
/* 2174 */                                                      return 0;
                                                            }
/* 2268 */                                                  iI00000oIO3 = i22;
/* 2269 */                                                  if (iI00000oIO3 == i22) {
                                                            }
                                                            break;
                                                        case PoseLandmark.LEFT_HIP:
                                                        case 32:
                                                        case 40:
                                                        case 46:
/* 2133 */                                                  bArr6 = bArr;
/* 2135 */                                                  i21 = i2;
/* 2137 */                                                  i1o1ll0i02 = i1o1ll0i0;
/* 2139 */                                                  i11 = i38;
/* 2141 */                                                  i22 = i42;
/* 2146 */                                                  ioo00o3 = ioo00o5;
/* 2148 */                                                  if (i45 == 2) {
/* 2159 */                                                      OIiilo1Ool0o.I00000oIO();
/* 2144 */                                                      return 0;
                                                            }
/* 2151 */                                                  if (i45 == 1) {
/* 2155 */                                                      OIiilo1Ool0o.I00000oIO();
/* 2144 */                                                      return 0;
                                                            }
/* 2268 */                                                  iI00000oIO3 = i22;
/* 2269 */                                                  if (iI00000oIO3 == i22) {
                                                            }
                                                            break;
                                                        case PoseLandmark.RIGHT_HIP:
                                                        case PoseLandmark.LEFT_FOOT_INDEX:
                                                        case 41:
                                                        case BuildConfig.VERSION_CODE:
/* 2103 */                                                  bArr6 = bArr;
/* 2105 */                                                  i21 = i2;
/* 2107 */                                                  i1o1ll0i02 = i1o1ll0i0;
/* 2109 */                                                  i11 = i38;
/* 2111 */                                                  i22 = i42;
/* 2116 */                                                  ioo00o3 = ioo00o5;
/* 2118 */                                                  if (i45 == 2) {
/* 2129 */                                                      OIiilo1Ool0o.I00000oIO();
/* 2114 */                                                      return 0;
                                                            }
/* 2121 */                                                  if (i45 == 5) {
/* 2125 */                                                      OIiilo1Ool0o.I00000oIO();
/* 2114 */                                                      return 0;
                                                            }
/* 2268 */                                                  iI00000oIO3 = i22;
/* 2269 */                                                  if (iI00000oIO3 == i22) {
                                                            }
                                                            break;
                                                        case PoseLandmark.LEFT_KNEE:
                                                        case 42:
/* 2072 */                                                  bArr6 = bArr;
/* 2074 */                                                  i21 = i2;
/* 2076 */                                                  i1o1ll0i02 = i1o1ll0i0;
/* 2078 */                                                  i11 = i38;
/* 2080 */                                                  i22 = i42;
/* 2083 */                                                  ioo00o3 = ioo00o5;
/* 2085 */                                                  if (i45 == 2) {
/* 2099 */                                                      OIiilo1Ool0o.I00000oIO();
/* 2097 */                                                      return 0;
                                                            }
/* 2087 */                                                  if (i45 == 0) {
/* 2091 */                                                      OIiilo1Ool0o.I00000oIO();
/* 2094 */                                                      return 0;
                                                            }
/* 2268 */                                                  iI00000oIO3 = i22;
/* 2269 */                                                  if (iI00000oIO3 == i22) {
                                                            }
                                                            break;
                                                        case PoseLandmark.RIGHT_KNEE:
/* 1854 */                                                  i21 = i2;
/* 1856 */                                                  i1o1ll0i02 = i1o1ll0i0;
/* 1861 */                                                  int i73 = i38;
/* 1863 */                                                  i22 = i42;
/* 1866 */                                                  bArr6 = bArr;
/* 1868 */                                                  if (i45 == 2) {
/* 1877 */                                                      if ((j3 & 536870912) == 0) {
/* 1879 */                                                          iI00000oIO3 = liio0i0O.I00000oIO(bArr6, i22, i1o1ll0i02);
/* 1883 */                                                          int i74 = i1o1ll0i02.I00000oIO;
/* 1885 */                                                          if (i74 < 0) {
/* 1957 */                                                              throw new iOlio0iO001("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                                                    }
/* 1887 */                                                          if (i74 == 0) {
/* 1889 */                                                              iolil0i.add("");
/* 1892 */                                                              ioo00o3 = ioo00o5;
                                                                    } else {
/* 1897 */                                                              ioo00o3 = ioo00o5;
/* 1904 */                                                              iolil0i.add(new String(bArr6, iI00000oIO3, i74, StandardCharsets.UTF_8));
/* 1907 */                                                              iI00000oIO3 += i74;
                                                                    }
/* 1908 */                                                          while (iI00000oIO3 < i21) {
/* 1910 */                                                              int iI00000oIO4 = liio0i0O.I00000oIO(bArr6, iI00000oIO3, i1o1ll0i02);
/* 1916 */                                                              if (i73 == i1o1ll0i02.I00000oIO) {
/* 1918 */                                                                  iI00000oIO3 = liio0i0O.I00000oIO(bArr6, iI00000oIO4, i1o1ll0i02);
/* 1922 */                                                                  int i75 = i1o1ll0i02.I00000oIO;
/* 1924 */                                                                  if (i75 < 0) {
/* 1948 */                                                                      throw new iOlio0iO001("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                                                            }
/* 1926 */                                                                  if (i75 == 0) {
/* 1928 */                                                                      iolil0i.add("");
                                                                            } else {
/* 1939 */                                                                      iolil0i.add(new String(bArr6, iI00000oIO3, i75, StandardCharsets.UTF_8));
/* 1907 */                                                                      iI00000oIO3 += i75;
                                                                            }
                                                                        }
                                                                    }
                                                                } else {
/* 1958 */                                                          ioo00o3 = ioo00o5;
/* 1960 */                                                          iI00000oIO3 = liio0i0O.I00000oIO(bArr6, i22, i1o1ll0i02);
/* 1964 */                                                          int i76 = i1o1ll0i02.I00000oIO;
/* 1966 */                                                          if (i76 < 0) {
/* 2067 */                                                              throw new iOlio0iO001("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                                                    }
/* 1968 */                                                          if (i76 == 0) {
/* 1970 */                                                              iolil0i.add("");
                                                                    } else {
/* 1974 */                                                              int i77 = iI00000oIO3 + i76;
/* 1980 */                                                              if (!iOo0OoO0l.I00000oIO(bArr6, iI00000oIO3, i77)) {
/* 2061 */                                                                  throw new iOlio0iO001("Protocol message had invalid UTF-8.");
                                                                        }
/* 1991 */                                                              iolil0i.add(new String(bArr6, iI00000oIO3, i76, StandardCharsets.UTF_8));
/* 1994 */                                                              iI00000oIO3 = i77;
                                                                    }
/* 1996 */                                                          while (iI00000oIO3 < i21) {
/* 1998 */                                                              int iI00000oIO5 = liio0i0O.I00000oIO(bArr6, iI00000oIO3, i1o1ll0i02);
/* 2004 */                                                              if (i73 == i1o1ll0i02.I00000oIO) {
/* 2006 */                                                                  iI00000oIO3 = liio0i0O.I00000oIO(bArr6, iI00000oIO5, i1o1ll0i02);
/* 2010 */                                                                  int i78 = i1o1ll0i02.I00000oIO;
/* 2012 */                                                                  if (i78 < 0) {
/* 2055 */                                                                      throw new iOlio0iO001("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                                                            }
/* 2014 */                                                                  if (i78 == 0) {
/* 2016 */                                                                      iolil0i.add("");
                                                                            } else {
/* 2020 */                                                                      int i79 = iI00000oIO3 + i78;
/* 2026 */                                                                      if (!iOo0OoO0l.I00000oIO(bArr6, iI00000oIO3, i79)) {
/* 2049 */                                                                          throw new iOlio0iO001("Protocol message had invalid UTF-8.");
                                                                                }
/* 2037 */                                                                      iolil0i.add(new String(bArr6, iI00000oIO3, i78, StandardCharsets.UTF_8));
/* 2040 */                                                                      iI00000oIO3 = i79;
/* 2041 */                                                                      i73 = i73;
                                                                            }
                                                                        }
                                                                    }
                                                                }
/* 1949 */                                                      i11 = i73;
/* 2269 */                                                      if (iI00000oIO3 == i22) {
                                                                }
                                                            } else {
/* 2068 */                                                      i11 = i73;
/* 1848 */                                                      ioo00o3 = ioo00o5;
/* 2268 */                                                      iI00000oIO3 = i22;
/* 2269 */                                                      if (iI00000oIO3 == i22) {
                                                                }
                                                            }
                                                            break;
                                                        case 27:
/* 1811 */                                                  if (i45 == 2) {
/* 1820 */                                                      int iI000OiO = liio0i0O.I000OiO(iolloii.I000o00OoI0I(i20), i38, bArr, i42, i2, iolil0i, i1o1ll0i0);
/* 1824 */                                                      bArr6 = bArr;
/* 1825 */                                                      i21 = i2;
/* 1826 */                                                      i1o1ll0i02 = i1o1ll0i0;
/* 1829 */                                                      iI00000oIO3 = iI000OiO;
/* 1830 */                                                      i22 = i42;
/* 1832 */                                                      i11 = i38;
/* 1834 */                                                      ioo00o3 = ioo00o5;
/* 2269 */                                                      if (iI00000oIO3 == i22) {
                                                                }
                                                            } else {
/* 1840 */                                                      bArr6 = bArr;
/* 1843 */                                                      i21 = i2;
/* 1844 */                                                      i1o1ll0i02 = i1o1ll0i0;
/* 1845 */                                                      i11 = i38;
/* 1847 */                                                      i22 = i42;
/* 1848 */                                                      ioo00o3 = ioo00o5;
/* 2268 */                                                      iI00000oIO3 = i22;
/* 2269 */                                                      if (iI00000oIO3 == i22) {
                                                                }
                                                            }
                                                            break;
                                                        case PoseLandmark.RIGHT_ANKLE:
/* 1687 */                                                  bArr7 = bArr;
/* 1689 */                                                  i23 = i2;
/* 1691 */                                                  i1o1ll0i06 = i1o1ll0i0;
/* 1693 */                                                  i24 = i38;
/* 1695 */                                                  i25 = i42;
/* 1698 */                                                  if (i45 == 2) {
/* 1700 */                                                      int iI00000oIO6 = liio0i0O.I00000oIO(bArr7, i25, i1o1ll0i06);
/* 1704 */                                                      int i80 = i1o1ll0i06.I00000oIO;
/* 1706 */                                                      if (i80 < 0) {
/* 1799 */                                                          throw new iOlio0iO001("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                                                }
/* 1712 */                                                      if (i80 > bArr7.length - iI00000oIO6) {
/* 1793 */                                                          throw new iOlio0iO001("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                                                }
/* 1714 */                                                      if (i80 == 0) {
/* 1718 */                                                          iolil0i.add(iOl1iiIll.I00iiI);
                                                                } else {
/* 1726 */                                                          iolil0i.add(iOl1iiIll.I000iOII(bArr7, iI00000oIO6, i80));
/* 1729 */                                                          iI00000oIO6 += i80;
                                                                }
/* 1730 */                                                      while (iI00000oIO6 < i23) {
/* 1732 */                                                          int iI00000oIO7 = liio0i0O.I00000oIO(bArr7, iI00000oIO6, i1o1ll0i06);
/* 1738 */                                                          if (i24 == i1o1ll0i06.I00000oIO) {
/* 1740 */                                                              iI00000oIO6 = liio0i0O.I00000oIO(bArr7, iI00000oIO7, i1o1ll0i06);
/* 1744 */                                                              int i81 = i1o1ll0i06.I00000oIO;
/* 1746 */                                                              if (i81 < 0) {
/* 1779 */                                                                  throw new iOlio0iO001("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                                                        }
/* 1750 */                                                              if (i81 > bArr7.length - iI00000oIO6) {
/* 1773 */                                                                  throw new iOlio0iO001("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                                                        }
/* 1752 */                                                              if (i81 == 0) {
/* 1756 */                                                                  iolil0i.add(iOl1iiIll.I00iiI);
                                                                        } else {
/* 1764 */                                                                  iolil0i.add(iOl1iiIll.I000iOII(bArr7, iI00000oIO6, i81));
/* 1729 */                                                                  iI00000oIO6 += i81;
                                                                        }
                                                                    } else {
/* 1780 */                                                              iI00000oIO3 = iI00000oIO6;
/* 1781 */                                                              bArr6 = bArr7;
/* 1782 */                                                              ioo00o3 = ioo00o5;
/* 1784 */                                                              i11 = i24;
/* 1567 */                                                              i22 = i25;
/* 1570 */                                                              i21 = i23;
/* 1571 */                                                              i1o1ll0i02 = i1o1ll0i06;
/* 2269 */                                                              if (iI00000oIO3 == i22) {
                                                                        }
                                                                    }
                                                                }
/* 1780 */                                                      iI00000oIO3 = iI00000oIO6;
/* 1781 */                                                      bArr6 = bArr7;
/* 1782 */                                                      ioo00o3 = ioo00o5;
/* 1784 */                                                      i11 = i24;
/* 1567 */                                                      i22 = i25;
/* 1570 */                                                      i21 = i23;
/* 1571 */                                                      i1o1ll0i02 = i1o1ll0i06;
/* 2269 */                                                      if (iI00000oIO3 == i22) {
                                                                }
                                                            }
/* 1605 */                                                  bArr6 = bArr7;
/* 1606 */                                                  ioo00o3 = ioo00o5;
/* 1608 */                                                  i11 = i24;
/* 1610 */                                                  i22 = i25;
/* 1613 */                                                  i21 = i23;
/* 1614 */                                                  i1o1ll0i02 = i1o1ll0i06;
/* 2268 */                                                  iI00000oIO3 = i22;
/* 2269 */                                                  if (iI00000oIO3 == i22) {
                                                            }
                                                            break;
                                                        case 30:
                                                        case 44:
/* 1661 */                                                  bArr8 = bArr;
/* 1663 */                                                  i23 = i2;
/* 1665 */                                                  i1o1ll0i06 = i1o1ll0i0;
/* 1667 */                                                  i26 = i38;
/* 1669 */                                                  i27 = i42;
/* 1674 */                                                  if (i45 == 2) {
/* 1683 */                                                      OIiilo1Ool0o.I00000oIO();
/* 1672 */                                                      return 0;
                                                            }
/* 1676 */                                                  if (i45 == 0) {
/* 1679 */                                                      OIiilo1Ool0o.I00000oIO();
/* 1672 */                                                      return 0;
                                                            }
/* 1646 */                                                  bArr6 = bArr8;
/* 1647 */                                                  ioo00o3 = ioo00o5;
/* 1649 */                                                  i11 = i26;
/* 1651 */                                                  i22 = i27;
/* 1613 */                                                  i21 = i23;
/* 1614 */                                                  i1o1ll0i02 = i1o1ll0i06;
/* 2268 */                                                  iI00000oIO3 = i22;
/* 2269 */                                                  if (iI00000oIO3 == i22) {
                                                            }
                                                            break;
                                                        case 33:
                                                        case 47:
/* 1629 */                                                  bArr8 = bArr;
/* 1631 */                                                  i23 = i2;
/* 1633 */                                                  i1o1ll0i06 = i1o1ll0i0;
/* 1635 */                                                  i26 = i38;
/* 1637 */                                                  i27 = i42;
/* 1642 */                                                  if (i45 == 2) {
/* 1657 */                                                      OIiilo1Ool0o.I00000oIO();
/* 1640 */                                                      return 0;
                                                            }
/* 1644 */                                                  if (i45 == 0) {
/* 1653 */                                                      OIiilo1Ool0o.I00000oIO();
/* 1640 */                                                      return 0;
                                                            }
/* 1646 */                                                  bArr6 = bArr8;
/* 1647 */                                                  ioo00o3 = ioo00o5;
/* 1649 */                                                  i11 = i26;
/* 1651 */                                                  i22 = i27;
/* 1613 */                                                  i21 = i23;
/* 1614 */                                                  i1o1ll0i02 = i1o1ll0i06;
/* 2268 */                                                  iI00000oIO3 = i22;
/* 2269 */                                                  if (iI00000oIO3 == i22) {
                                                            }
                                                            break;
                                                        case 34:
                                                        case 48:
/* 1590 */                                                  bArr7 = bArr;
/* 1592 */                                                  i23 = i2;
/* 1594 */                                                  i1o1ll0i06 = i1o1ll0i0;
/* 1596 */                                                  i24 = i38;
/* 1598 */                                                  i25 = i42;
/* 1601 */                                                  if (i45 == 2) {
/* 1625 */                                                      OIiilo1Ool0o.I00000oIO();
/* 1623 */                                                      return 0;
                                                            }
/* 1603 */                                                  if (i45 == 0) {
/* 1617 */                                                      OIiilo1Ool0o.I00000oIO();
/* 1620 */                                                      return 0;
                                                            }
/* 1605 */                                                  bArr6 = bArr7;
/* 1606 */                                                  ioo00o3 = ioo00o5;
/* 1608 */                                                  i11 = i24;
/* 1610 */                                                  i22 = i25;
/* 1613 */                                                  i21 = i23;
/* 1614 */                                                  i1o1ll0i02 = i1o1ll0i06;
/* 2268 */                                                  iI00000oIO3 = i22;
/* 2269 */                                                  if (iI00000oIO3 == i22) {
                                                            }
                                                            break;
                                                        default:
/* 1497 */                                                  if (i45 == 3) {
/* 1501 */                                                      int i82 = (i38 & (-8)) | 4;
/* 1503 */                                                      iOloi11 ioloi11I000o00OoI0I = iolloii.I000o00OoI0I(i20);
/* 1507 */                                                      iOlOoOlI0li1 ioloooli0li1Zza = ioloi11I000o00OoI0I.zza();
/* 1513 */                                                      i23 = i2;
/* 1515 */                                                      i1o1ll0i06 = i1o1ll0i0;
/* 1521 */                                                      int iI000OOo1O2 = liio0i0O.I000OOo1O(ioloooli0li1Zza, ioloi11I000o00OoI0I, bArr, i42, i23, i82, i1o1ll0i06);
/* 1525 */                                                      i25 = i42;
/* 1526 */                                                      ioloi11I000o00OoI0I.I0000O(ioloooli0li1Zza);
/* 1529 */                                                      i1o1ll0i06.I0000Il00O = ioloooli0li1Zza;
/* 1531 */                                                      iolil0i.add(ioloooli0li1Zza);
/* 1534 */                                                      while (iI000OOo1O2 < i23) {
/* 1536 */                                                          int iI00000oIO8 = liio0i0O.I00000oIO(bArr, iI000OOo1O2, i1o1ll0i06);
/* 1542 */                                                          if (i38 == i1o1ll0i06.I00000oIO) {
/* 1544 */                                                              iOlOoOlI0li1 ioloooli0li1Zza2 = ioloi11I000o00OoI0I.zza();
/* 1548 */                                                              iI000OOo1O2 = liio0i0O.I000OOo1O(ioloooli0li1Zza2, ioloi11I000o00OoI0I, bArr, iI00000oIO8, i23, i82, i1o1ll0i06);
/* 1552 */                                                              ioloi11I000o00OoI0I.I0000O(ioloooli0li1Zza2);
/* 1555 */                                                              i1o1ll0i06.I0000Il00O = ioloooli0li1Zza2;
/* 1557 */                                                              iolil0i.add(ioloooli0li1Zza2);
                                                                    } else {
/* 1561 */                                                              bArr6 = bArr;
/* 1562 */                                                              ioo00o3 = ioo00o5;
/* 1564 */                                                              i11 = i38;
/* 1566 */                                                              iI00000oIO3 = iI000OOo1O2;
/* 1567 */                                                              i22 = i25;
/* 1570 */                                                              i21 = i23;
/* 1571 */                                                              i1o1ll0i02 = i1o1ll0i06;
/* 2269 */                                                              if (iI00000oIO3 == i22) {
                                                                        }
                                                                    }
                                                                }
/* 1561 */                                                      bArr6 = bArr;
/* 1562 */                                                      ioo00o3 = ioo00o5;
/* 1564 */                                                      i11 = i38;
/* 1566 */                                                      iI00000oIO3 = iI000OOo1O2;
/* 1567 */                                                      i22 = i25;
/* 1570 */                                                      i21 = i23;
/* 1571 */                                                      i1o1ll0i02 = i1o1ll0i06;
/* 2269 */                                                      if (iI00000oIO3 == i22) {
                                                                }
                                                            } else {
/* 1574 */                                                      bArr6 = bArr;
/* 1576 */                                                      i21 = i2;
/* 1578 */                                                      i1o1ll0i02 = i1o1ll0i0;
/* 1580 */                                                      i11 = i38;
/* 1582 */                                                      i22 = i42;
/* 1586 */                                                      ioo00o3 = ioo00o5;
/* 2268 */                                                      iI00000oIO3 = i22;
/* 2269 */                                                      if (iI00000oIO3 == i22) {
                                                                }
                                                            }
                                                            break;
                                                    }
                                                } else {
/* 2313 */                                          i9 = i38;
/* 2314 */                                          ioo00o2 = ioo00o5;
/* 2316 */                                          i7 = i42;
/* 2320 */                                          if (iI0010o != 50) {
/* 2397 */                                              long j4 = iArr[i20 + 2] & 1048575;
                                                        switch (iI0010o) {
                                                            case 51:
/* 3060 */                                                      bArr2 = bArr;
/* 3062 */                                                      i1o1ll0i02 = i1o1ll0i0;
/* 3064 */                                                      ioo00o = ioo00o2;
/* 3066 */                                                      i28 = i7;
/* 3069 */                                                      i29 = i20;
/* 3071 */                                                      i43 = i10;
/* 3073 */                                                      if (i45 == 1) {
/* 3075 */                                                          iI0000Il00O2 = i28 + 8;
/* 3089 */                                                          unsafe.putObject(obj2, j, Double.valueOf(Double.longBitsToDouble(liio0i0O.I0000oI00(i28, bArr2))));
/* 3092 */                                                          unsafe.putInt(obj2, j4, i43);
                                                                } else {
/* 3096 */                                                          iI0000Il00O2 = i28;
                                                                }
/* 3097 */                                                      if (iI0000Il00O2 != i28) {
/* 3127 */                                                          i4 = i3;
/* 3129 */                                                          i7 = iI0000Il00O2;
/* 3130 */                                                          i36 = i72;
/* 3132 */                                                          i35 = i29;
/* 3134 */                                                          i37 = i19;
                                                                    break;
                                                                } else {
/* 3099 */                                                          i38 = i9;
/* 3101 */                                                          bArr10 = bArr2;
/* 3102 */                                                          iI00000oIO3 = iI0000Il00O2;
/* 3103 */                                                          obj6 = obj2;
/* 3104 */                                                          i1o1ll0i08 = i1o1ll0i02;
/* 3105 */                                                          i34 = i43;
/* 3106 */                                                          i36 = i72;
/* 3108 */                                                          i35 = i29;
/* 3110 */                                                          objArr2 = objArr;
/* 3112 */                                                          iArr2 = iArr;
/* 3114 */                                                          i37 = i19;
/* 3116 */                                                          i33 = i8;
/* 3118 */                                                          i39 = 1048575;
/* 3121 */                                                          iolloii = this;
/* 3123 */                                                          i32 = i2;
                                                                }
                                                            case 52:
/* 3024 */                                                      bArr2 = bArr;
/* 3026 */                                                      i1o1ll0i02 = i1o1ll0i0;
/* 3028 */                                                      ioo00o = ioo00o2;
/* 3030 */                                                      i28 = i7;
/* 3033 */                                                      i29 = i20;
/* 3035 */                                                      i43 = i10;
/* 3037 */                                                      if (i45 == 5) {
/* 3039 */                                                          iI0000Il00O2 = i28 + 4;
/* 3053 */                                                          unsafe.putObject(obj2, j, Float.valueOf(Float.intBitsToFloat(liio0i0O.I0000O(i28, bArr2))));
/* 3056 */                                                          unsafe.putInt(obj2, j4, i43);
                                                                }
/* 3097 */                                                      if (iI0000Il00O2 != i28) {
                                                                }
                                                                break;
                                                            case 53:
                                                            case 54:
/* 2993 */                                                      bArr2 = bArr;
/* 2995 */                                                      i1o1ll0i02 = i1o1ll0i0;
/* 2997 */                                                      ioo00o = ioo00o2;
/* 2999 */                                                      i28 = i7;
/* 3001 */                                                      i29 = i20;
/* 3003 */                                                      i43 = i10;
/* 3005 */                                                      if (i45 == 0) {
/* 3007 */                                                          iI0000Il00O2 = liio0i0O.I0000Il00O(bArr2, i28, i1o1ll0i02);
/* 3017 */                                                          unsafe.putObject(obj2, j, Long.valueOf(i1o1ll0i02.I00000oOI));
/* 3020 */                                                          unsafe.putInt(obj2, j4, i43);
                                                                }
/* 3097 */                                                      if (iI0000Il00O2 != i28) {
                                                                }
                                                                break;
                                                            case 55:
                                                            case 62:
/* 2961 */                                                      bArr2 = bArr;
/* 2963 */                                                      i1o1ll0i02 = i1o1ll0i0;
/* 2965 */                                                      ioo00o = ioo00o2;
/* 2967 */                                                      i28 = i7;
/* 2969 */                                                      i29 = i20;
/* 2971 */                                                      i43 = i10;
/* 2973 */                                                      if (i45 == 0) {
/* 2975 */                                                          iI0000Il00O2 = liio0i0O.I00000oIO(bArr2, i28, i1o1ll0i02);
/* 2985 */                                                          unsafe.putObject(obj2, j, Integer.valueOf(i1o1ll0i02.I00000oIO));
/* 2988 */                                                          unsafe.putInt(obj2, j4, i43);
                                                                }
/* 3097 */                                                      if (iI0000Il00O2 != i28) {
                                                                }
                                                                break;
                                                            case 56:
                                                            case 65:
/* 2928 */                                                      bArr2 = bArr;
/* 2930 */                                                      i1o1ll0i02 = i1o1ll0i0;
/* 2932 */                                                      ioo00o = ioo00o2;
/* 2934 */                                                      i28 = i7;
/* 2937 */                                                      i29 = i20;
/* 2939 */                                                      i43 = i10;
/* 2941 */                                                      if (i45 == 1) {
/* 2943 */                                                          iI0000Il00O2 = i28 + 8;
/* 2953 */                                                          unsafe.putObject(obj2, j, Long.valueOf(liio0i0O.I0000oI00(i28, bArr2)));
/* 2956 */                                                          unsafe.putInt(obj2, j4, i43);
                                                                }
/* 3097 */                                                      if (iI0000Il00O2 != i28) {
                                                                }
                                                                break;
                                                            case 57:
                                                            case Barcode.FORMAT_EAN_8:
/* 2895 */                                                      bArr2 = bArr;
/* 2897 */                                                      i1o1ll0i02 = i1o1ll0i0;
/* 2899 */                                                      ioo00o = ioo00o2;
/* 2901 */                                                      i28 = i7;
/* 2904 */                                                      i29 = i20;
/* 2906 */                                                      i43 = i10;
/* 2908 */                                                      if (i45 == 5) {
/* 2910 */                                                          iI0000Il00O2 = i28 + 4;
/* 2920 */                                                          unsafe.putObject(obj2, j, Integer.valueOf(liio0i0O.I0000O(i28, bArr2)));
/* 2923 */                                                          unsafe.putInt(obj2, j4, i43);
                                                                }
/* 3097 */                                                      if (iI0000Il00O2 != i28) {
                                                                }
                                                                break;
                                                            case 58:
/* 2854 */                                                      bArr2 = bArr;
/* 2856 */                                                      i1o1ll0i02 = i1o1ll0i0;
/* 2858 */                                                      ioo00o = ioo00o2;
/* 2860 */                                                      i28 = i7;
/* 2862 */                                                      i29 = i20;
/* 2864 */                                                      i43 = i10;
/* 2866 */                                                      if (i45 == 0) {
/* 2868 */                                                          iI0000Il00O2 = liio0i0O.I0000Il00O(bArr2, i28, i1o1ll0i02);
/* 2887 */                                                          unsafe.putObject(obj2, j, Boolean.valueOf(i1o1ll0i02.I00000oOI != 0));
/* 2890 */                                                          unsafe.putInt(obj2, j4, i43);
                                                                }
/* 3097 */                                                      if (iI0000Il00O2 != i28) {
                                                                }
                                                                break;
                                                            case 59:
/* 2787 */                                                      ioo00o = ioo00o2;
/* 2788 */                                                      bArr2 = bArr;
/* 2790 */                                                      i1o1ll0i02 = i1o1ll0i0;
/* 2792 */                                                      i28 = i7;
/* 2795 */                                                      i29 = i20;
/* 2797 */                                                      i43 = i10;
/* 2799 */                                                      if (i45 == 2) {
/* 2801 */                                                          int iI00000oIO9 = liio0i0O.I00000oIO(bArr2, i28, i1o1ll0i02);
/* 2805 */                                                          int i83 = i1o1ll0i02.I00000oIO;
/* 2807 */                                                          if (i83 == 0) {
/* 2809 */                                                              unsafe.putObject(obj2, j, "");
                                                                    } else {
/* 2817 */                                                              int i84 = iI00000oIO9 + i83;
/* 2819 */                                                              if ((i46 & 536870912) != 0 && !iOo0OoO0l.I00000oIO(bArr2, iI00000oIO9, i84)) {
/* 2833 */                                                                  throw new iOlio0iO001("Protocol message had invalid UTF-8.");
                                                                        }
/* 2843 */                                                              unsafe.putObject(obj2, j, new String(bArr2, iI00000oIO9, i83, StandardCharsets.UTF_8));
/* 2846 */                                                              iI00000oIO9 = i84;
                                                                    }
/* 2848 */                                                          unsafe.putInt(obj2, j4, i43);
/* 2851 */                                                          iI0000Il00O2 = iI00000oIO9;
                                                                }
/* 3097 */                                                      if (iI0000Il00O2 != i28) {
                                                                }
                                                                break;
                                                            case 60:
/* 2715 */                                                      if (i45 == 2) {
/* 2717 */                                                          Object objI00100o1O0lo = I00100o1O0lo(obj2, i10, i20);
/* 2729 */                                                          int iI000O01llI0 = liio0i0O.I000O01llI0(objI00100o1O0lo, I000o00OoI0I(i20), bArr, i7, i2, i1o1ll0i0);
/* 2735 */                                                          bArr2 = bArr;
/* 2746 */                                                          unsafe5.putObject(obj2, I0010I0i(i20) & 1048575, objI00100o1O0lo);
/* 2754 */                                                          iOo0Ii1l.I00000oOI(obj2, i10, iArr[r8] & 1048575);
/* 2757 */                                                          i1o1ll0i02 = i1o1ll0i0;
/* 2759 */                                                          iI0000Il00O2 = iI000O01llI0;
/* 2760 */                                                          ioo00o = ioo00o2;
/* 2762 */                                                          i28 = i7;
/* 2764 */                                                          i29 = i20;
/* 2766 */                                                          i43 = i10;
/* 3097 */                                                          if (iI0000Il00O2 != i28) {
                                                                    }
                                                                } else {
/* 2771 */                                                          bArr2 = bArr;
/* 2772 */                                                          i1o1ll0i02 = i1o1ll0i0;
/* 2774 */                                                          ioo00o = ioo00o2;
/* 2776 */                                                          i28 = i7;
/* 2778 */                                                          i29 = i20;
/* 2780 */                                                          i43 = i10;
/* 3096 */                                                          iI0000Il00O2 = i28;
/* 3097 */                                                          if (iI0000Il00O2 != i28) {
                                                                    }
                                                                }
                                                                break;
                                                            case 61:
/* 2669 */                                                      bArr9 = bArr;
/* 2671 */                                                      i1o1ll0i07 = i1o1ll0i0;
/* 2673 */                                                      ioo00o4 = ioo00o2;
/* 2675 */                                                      i30 = i7;
/* 2677 */                                                      i31 = i10;
/* 2680 */                                                      if (i45 == 2) {
/* 2682 */                                                          iI0001Ioi1lo = liio0i0O.I0001Ioi1lo(bArr9, i30, i1o1ll0i07);
/* 2688 */                                                          unsafe.putObject(obj2, j, i1o1ll0i07.I0000Il00O);
/* 2691 */                                                          unsafe.putInt(obj2, j4, i31);
/* 2657 */                                                          i28 = i30;
/* 2658 */                                                          i29 = i20;
/* 2660 */                                                          bArr2 = bArr9;
/* 2661 */                                                          i43 = i31;
/* 2662 */                                                          iI0000Il00O2 = iI0001Ioi1lo;
/* 2663 */                                                          ioo00o = ioo00o4;
/* 2664 */                                                          i1o1ll0i02 = i1o1ll0i07;
/* 3097 */                                                          if (iI0000Il00O2 != i28) {
                                                                    }
                                                                } else {
/* 2695 */                                                          i28 = i30;
/* 2696 */                                                          i29 = i20;
/* 2698 */                                                          bArr2 = bArr9;
/* 2699 */                                                          i43 = i31;
/* 2700 */                                                          ioo00o = ioo00o4;
/* 2701 */                                                          i1o1ll0i02 = i1o1ll0i07;
/* 3096 */                                                          iI0000Il00O2 = i28;
/* 3097 */                                                          if (iI0000Il00O2 != i28) {
                                                                    }
                                                                }
                                                                break;
                                                            case 63:
/* 2588 */                                                      bArr9 = bArr;
/* 2590 */                                                      i1o1ll0i07 = i1o1ll0i0;
/* 2592 */                                                      i30 = i7;
/* 2594 */                                                      i31 = i10;
/* 2596 */                                                      i29 = i20;
/* 2598 */                                                      if (i45 == 0) {
/* 2600 */                                                          iI0001Ioi1lo = liio0i0O.I00000oIO(bArr9, i30, i1o1ll0i07);
/* 2604 */                                                          int i85 = i1o1ll0i07.I00000oIO;
/* 2606 */                                                          i20 = i29;
/* 2608 */                                                          iOo10Oi ioo10oiI000oI1ioi2 = I000oI1ioi(i20);
/* 2612 */                                                          if (ioo10oiI000oI1ioi2 == null || ioo10oiI000oI1ioi2.I00000oIO(i85)) {
/* 2620 */                                                              ioo00o4 = ioo00o2;
/* 2651 */                                                              unsafe.putObject(obj2, j, Integer.valueOf(i85));
/* 2654 */                                                              unsafe.putInt(obj2, j4, i31);
                                                                    } else {
/* 2624 */                                                              iOlOoOlI0li1 ioloooli0li12 = (iOlOoOlI0li1) obj2;
/* 2626 */                                                              iOo00o ioo00oI00000oIO3 = ioloooli0li12.zzc;
/* 2628 */                                                              ioo00o4 = ioo00o2;
/* 2630 */                                                              if (ioo00oI00000oIO3 == ioo00o4) {
/* 2632 */                                                                  ioo00oI00000oIO3 = iOo00o.I00000oIO();
/* 2636 */                                                                  ioloooli0li12.zzc = ioo00oI00000oIO3;
                                                                        }
/* 2643 */                                                              ioo00oI00000oIO3.I00000oOI(i9, Long.valueOf(i85));
                                                                    }
/* 2657 */                                                          i28 = i30;
/* 2658 */                                                          i29 = i20;
/* 2660 */                                                          bArr2 = bArr9;
/* 2661 */                                                          i43 = i31;
/* 2662 */                                                          iI0000Il00O2 = iI0001Ioi1lo;
/* 2663 */                                                          ioo00o = ioo00o4;
/* 2664 */                                                          i1o1ll0i02 = i1o1ll0i07;
/* 3097 */                                                          if (iI0000Il00O2 != i28) {
                                                                    }
                                                                }
/* 2581 */                                                      i28 = i30;
/* 2582 */                                                      i43 = i31;
/* 2583 */                                                      i1o1ll0i02 = i1o1ll0i07;
/* 2584 */                                                      bArr2 = bArr9;
/* 2538 */                                                      ioo00o = ioo00o2;
/* 3096 */                                                      iI0000Il00O2 = i28;
/* 3097 */                                                      if (iI0000Il00O2 != i28) {
                                                                }
                                                                break;
                                                            case 66:
/* 2544 */                                                      bArr9 = bArr;
/* 2546 */                                                      i1o1ll0i07 = i1o1ll0i0;
/* 2548 */                                                      i30 = i7;
/* 2550 */                                                      i31 = i10;
/* 2552 */                                                      i29 = i20;
/* 2554 */                                                      if (i45 == 0) {
/* 2556 */                                                          iI00000oIO2 = liio0i0O.I00000oIO(bArr9, i30, i1o1ll0i07);
/* 2560 */                                                          int i86 = i1o1ll0i07.I00000oIO;
/* 2574 */                                                          unsafe.putObject(obj2, j, Integer.valueOf((i86 >>> 1) ^ (-(i86 & 1))));
/* 2577 */                                                          unsafe.putInt(obj2, j4, i31);
/* 2526 */                                                          i28 = i30;
/* 2527 */                                                          i43 = i31;
/* 2528 */                                                          iI0000Il00O2 = iI00000oIO2;
/* 2529 */                                                          i1o1ll0i02 = i1o1ll0i07;
/* 2530 */                                                          bArr2 = bArr9;
/* 2478 */                                                          ioo00o = ioo00o2;
/* 3097 */                                                          if (iI0000Il00O2 != i28) {
                                                                    }
                                                                }
/* 2581 */                                                      i28 = i30;
/* 2582 */                                                      i43 = i31;
/* 2583 */                                                      i1o1ll0i02 = i1o1ll0i07;
/* 2584 */                                                      bArr2 = bArr9;
/* 2538 */                                                      ioo00o = ioo00o2;
/* 3096 */                                                      iI0000Il00O2 = i28;
/* 3097 */                                                      if (iI0000Il00O2 != i28) {
                                                                }
                                                                break;
                                                            case 67:
/* 2487 */                                                      bArr9 = bArr;
/* 2489 */                                                      i1o1ll0i07 = i1o1ll0i0;
/* 2491 */                                                      i30 = i7;
/* 2493 */                                                      i31 = i10;
/* 2495 */                                                      if (i45 == 0) {
/* 2497 */                                                          iI00000oIO2 = liio0i0O.I0000Il00O(bArr9, i30, i1o1ll0i07);
/* 2501 */                                                          i29 = i20;
/* 2503 */                                                          long j5 = i1o1ll0i07.I00000oOI;
/* 2520 */                                                          unsafe.putObject(obj2, j, Long.valueOf((j5 >>> 1) ^ (-(j5 & 1))));
/* 2523 */                                                          unsafe.putInt(obj2, j4, i31);
/* 2526 */                                                          i28 = i30;
/* 2527 */                                                          i43 = i31;
/* 2528 */                                                          iI0000Il00O2 = iI00000oIO2;
/* 2529 */                                                          i1o1ll0i02 = i1o1ll0i07;
/* 2530 */                                                          bArr2 = bArr9;
/* 2478 */                                                          ioo00o = ioo00o2;
/* 3097 */                                                          if (iI0000Il00O2 != i28) {
                                                                    }
                                                                } else {
/* 2532 */                                                          i28 = i30;
/* 2533 */                                                          i1o1ll0i02 = i1o1ll0i07;
/* 2534 */                                                          i29 = i20;
/* 2536 */                                                          bArr2 = bArr9;
/* 2537 */                                                          i43 = i31;
/* 2538 */                                                          ioo00o = ioo00o2;
/* 3096 */                                                          iI0000Il00O2 = i28;
/* 3097 */                                                          if (iI0000Il00O2 != i28) {
                                                                    }
                                                                }
                                                                break;
                                                            case 68:
/* 2420 */                                                      if (i45 == 3) {
/* 2430 */                                                          Object objI00100o1O0lo2 = I00100o1O0lo(obj2, i10, i20);
/* 2446 */                                                          int iI000OOo1O3 = liio0i0O.I000OOo1O(objI00100o1O0lo2, I000o00OoI0I(i20), bArr, i7, i2, (i9 & (-8)) | 4, i1o1ll0i0);
/* 2460 */                                                          unsafe5.putObject(obj2, I0010I0i(i20) & 1048575, objI00100o1O0lo2);
/* 2468 */                                                          iOo0Ii1l.I00000oOI(obj2, i10, iArr[r8] & 1048575);
/* 2471 */                                                          iI0000Il00O2 = iI000OOo1O3;
/* 2472 */                                                          i28 = i7;
/* 2473 */                                                          i1o1ll0i02 = i1o1ll0i0;
/* 2474 */                                                          i29 = i20;
/* 2476 */                                                          bArr2 = bArr;
/* 2477 */                                                          i43 = i10;
/* 2478 */                                                          ioo00o = ioo00o2;
/* 3097 */                                                          if (iI0000Il00O2 != i28) {
                                                                    }
                                                                }
                                                                break;
                                                            default:
/* 2405 */                                                      bArr2 = bArr;
/* 2407 */                                                      i1o1ll0i02 = i1o1ll0i0;
/* 2409 */                                                      ioo00o = ioo00o2;
/* 2411 */                                                      i28 = i7;
/* 2413 */                                                      i29 = i20;
/* 2415 */                                                      i43 = i10;
/* 3096 */                                                      iI0000Il00O2 = i28;
/* 3097 */                                                      if (iI0000Il00O2 != i28) {
                                                                }
                                                                break;
                                                        }
                                                    } else {
/* 2323 */                                              if (i45 == 2) {
/* 2326 */                                                  int i87 = i20 / 3;
/* 2329 */                                                  Object obj9 = objArr[i87 + i87];
/* 2331 */                                                  Object object = unsafe.getObject(obj2, j);
/* 2340 */                                                  if (!((iOllI1i1l) object).I00iOIl) {
/* 2342 */                                                      iOllI1i1l iolli1i1l2 = iOllI1i1l.I00iiI;
/* 2348 */                                                      if (iolli1i1l2.isEmpty()) {
/* 2352 */                                                          iolli1i1l = new iOllI1i1l();
                                                                } else {
/* 2358 */                                                          iOllI1i1l iolli1i1l3 = new iOllI1i1l(iolli1i1l2);
/* 2362 */                                                          iolli1i1l3.I00iOIl = true;
/* 2364 */                                                          iolli1i1l = iolli1i1l3;
                                                                }
/* 2365 */                                                      lil01Olill.I00000oIO(iolli1i1l, object);
/* 2368 */                                                      unsafe.putObject(obj2, j, iolli1i1l);
                                                            }
/* 2375 */                                                  throw IIlIOloOOO.I000l1(obj9);
                                                        }
/* 2376 */                                              bArr2 = bArr;
/* 2378 */                                              i4 = i3;
/* 2380 */                                              i1o1ll0i02 = i1o1ll0i0;
/* 2382 */                                              i35 = i20;
/* 2383 */                                              i36 = i72;
/* 2385 */                                              ioo00o = ioo00o2;
/* 2387 */                                              i37 = i19;
                                                    }
                                                }
                                            } else if (i45 == 2) {
/* 1367 */                                      iOlil0i iolil0iI0000oI002 = (iOlil0i) unsafe.getObject(obj8, j);
/* 1374 */                                      if (!((iOloOiOiiOO) iolil0iI0000oI002).I00iOIl) {
/* 1376 */                                          int size2 = iolil0iI0000oI002.size();
/* 1388 */                                          iolil0iI0000oI002 = ((iOloOiOiiOO) iolil0iI0000oI002).I0000oI00(size2 == 0 ? 10 : size2 + size2);
/* 1392 */                                          unsafe.putObject(obj8, j, iolil0iI0000oI002);
                                                }
/* 1395 */                                      iOlil0i iolil0i2 = iolil0iI0000oI002;
/* 1402 */                                      bArr10 = bArr;
/* 1404 */                                      i32 = i2;
/* 1406 */                                      i1o1ll0i08 = i1o1ll0i0;
/* 1414 */                                      iI00000oIO3 = liio0i0O.I000OiO(iolloii.I000o00OoI0I(i70), i38, bArr10, i42, i32, iolil0i2, i1o1ll0i08);
/* 1418 */                                      i38 = i38;
/* 1420 */                                      obj6 = obj;
/* 1421 */                                      i36 = i72;
/* 1423 */                                      i35 = i70;
/* 1425 */                                      objArr2 = objArr;
/* 1427 */                                      iArr2 = iArr;
/* 1429 */                                      i33 = i8;
/* 1431 */                                      i34 = i10;
/* 1433 */                                      i39 = 1048575;
/* 1436 */                                      i37 = i71;
                                            } else {
/* 1440 */                                      obj2 = obj8;
/* 1441 */                                      i7 = i42;
/* 1443 */                                      ioo00o2 = ioo00o5;
/* 1445 */                                      i19 = i71;
/* 1447 */                                      i9 = i38;
/* 1449 */                                      i20 = i70;
/* 2376 */                                      bArr2 = bArr;
/* 2378 */                                      i4 = i3;
/* 2380 */                                      i1o1ll0i02 = i1o1ll0i0;
/* 2382 */                                      i35 = i20;
/* 2383 */                                      i36 = i72;
/* 2385 */                                      ioo00o = ioo00o2;
/* 2387 */                                      i37 = i19;
                                            }
/* 2301 */                                  i43 = i10;
                                        }
                                    }
/* 3136 */                          if (i9 == i4 || i4 == 0) {
/* 3151 */                              iOlOoOlI0li1 ioloooli0li13 = (iOlOoOlI0li1) obj2;
/* 3153 */                              ioo00oI00000oIO = ioloooli0li13.zzc;
/* 3155 */                              if (ioo00oI00000oIO == ioo00o) {
/* 3157 */                                  ioo00oI00000oIO = iOo00o.I00000oIO();
/* 3161 */                                  ioloooli0li13.zzc = ioo00oI00000oIO;
                                        }
/* 3168 */                              int i88 = i9;
/* 3169 */                              int iI000iOII = liio0i0O.I000iOII(i88, bArr2, i7, i2, ioo00oI00000oIO, i1o1ll0i02);
/* 3174 */                              bArr10 = bArr;
/* 3176 */                              i1o1ll0i08 = i1o1ll0i0;
/* 3178 */                              i38 = i88;
/* 3180 */                              i32 = i2;
/* 3181 */                              obj6 = obj2;
/* 3182 */                              i34 = i43;
/* 3183 */                              objArr2 = objArr;
/* 3185 */                              iArr2 = iArr;
/* 3187 */                              i33 = i8;
/* 3189 */                              i39 = 1048575;
/* 3192 */                              iI00000oIO3 = iI000iOII;
/* 3193 */                              iolloii = this;
                                    } else {
/* 3140 */                              i32 = i2;
/* 3142 */                              iI00000oIO3 = i7;
/* 3143 */                              i5 = i9;
/* 3144 */                              i6 = i37;
                                    }
                                } else {
/* 79 */                            if (i43 >= i44 && i43 <= i33) {
/* 84 */                                iI000OOo1O = iolloii.I000OOo1O(i43, 0);
                                    }
/* 91 */                            iOo00o ioo00o52 = iOo00o.I0000oI00;
/* 94 */                            if (iI000OOo1O != -1) {
                                    }
/* 3136 */                          if (i9 == i4) {
                                    }
/* 3151 */                          iOlOoOlI0li1 ioloooli0li132 = (iOlOoOlI0li1) obj2;
/* 3153 */                          ioo00oI00000oIO = ioloooli0li132.zzc;
/* 3155 */                          if (ioo00oI00000oIO == ioo00o) {
                                    }
/* 3168 */                          int i882 = i9;
/* 3169 */                          int iI000iOII2 = liio0i0O.I000iOII(i882, bArr2, i7, i2, ioo00oI00000oIO, i1o1ll0i02);
/* 3174 */                          bArr10 = bArr;
/* 3176 */                          i1o1ll0i08 = i1o1ll0i0;
/* 3178 */                          i38 = i882;
/* 3180 */                          i32 = i2;
/* 3181 */                          obj6 = obj2;
/* 3182 */                          i34 = i43;
/* 3183 */                          objArr2 = objArr;
/* 3185 */                          iArr2 = iArr;
/* 3187 */                          i33 = i8;
/* 3189 */                          i39 = 1048575;
/* 3192 */                          iI00000oIO3 = iI000iOII2;
/* 3193 */                          iolloii = this;
                                }
                            } else {
/* 3197 */                      i4 = i3;
/* 3199 */                      objArr = objArr2;
/* 3201 */                      iArr = iArr2;
/* 3205 */                      obj2 = obj6;
/* 3208 */                      i5 = i38;
/* 3210 */                      i6 = i37;
                            }
                        }
/* 269 */               i33 = i8;
/* 271 */               i34 = i10;
                    }
/* 3213 */          if (i36 != 1048575) {
/* 3216 */              unsafe.putInt(obj2, i36, i6);
                    }
/* 3225 */          for (int i89 = this.I000II; i89 < this.I000O01llI0; i89++) {
/* 3229 */              int i90 = this.I0001Ioi1lo[i89];
/* 3231 */              int i91 = iArr[i90];
/* 3243 */              Object objI0000O = iOo0Ii1l.I0000O(I0010I0i(i90) & 1048575, obj2);
/* 3247 */              if (objI0000O != null && I000oI1ioi(i90) != null) {
/* 3262 */                  int i92 = i90 / 3;
/* 3270 */                  throw IIlIOloOOO.I000l1(objArr[i92 + i92]);
                        }
                    }
/* 3273 */          if (i4 == 0) {
/* 3275 */              if (iI00000oIO3 != i32) {
/* 3283 */                  throw new iOlio0iO001("Failed to parse the message.");
                        }
                    } else if (iI00000oIO3 > i32 || i5 != i4) {
/* 3294 */              throw new iOlio0iO001("Failed to parse the message.");
                    }
/* 3288 */          return iI00000oIO3;
                }

                public final void I000l1(int i, Object obj, Object obj2) {
/* 5 */             if (I0001Ioi1lo(i, obj2)) {
/* 15 */                long jI0010I0i = I0010I0i(i) & 1048575;
/* 17 */                Unsafe unsafe = I000OiO;
/* 19 */                Object object = unsafe.getObject(obj2, jI0010I0i);
/* 23 */                if (object == null) {
/* 86 */                    int i2 = this.I00000oIO[i];
/* 88 */                    String string = obj2.toString();
/* 107 */                   OoOil11Ol1o.I000O01llI0(string, String.valueOf(i2).length() + 38 + string.length(), i2);
/* 408 */                   return;
                        }
/* 25 */                iOloi11 ioloi11I000o00OoI0I = I000o00OoI0I(i);
/* 33 */                if (!I0001Ioi1lo(i, obj)) {
/* 39 */                    if (I00111O(object)) {
/* 45 */                        iOlOoOlI0li1 ioloooli0li1Zza = ioloi11I000o00OoI0I.zza();
/* 49 */                        ioloi11I000o00OoI0I.zzd(ioloooli0li1Zza, object);
/* 52 */                        unsafe.putObject(obj, jI0010I0i, ioloooli0li1Zza);
                            } else {
/* 41 */                        unsafe.putObject(obj, jI0010I0i, object);
                            }
/* 55 */                    I000II(i, obj);
/* 58 */                    return;
                        }
/* 59 */                Object object2 = unsafe.getObject(obj, jI0010I0i);
/* 67 */                if (!I00111O(object2)) {
/* 69 */                    iOlOoOlI0li1 ioloooli0li1Zza2 = ioloi11I000o00OoI0I.zza();
/* 73 */                    ioloi11I000o00OoI0I.zzd(ioloooli0li1Zza2, object2);
/* 76 */                    unsafe.putObject(obj, jI0010I0i, ioloooli0li1Zza2);
/* 79 */                    object2 = ioloooli0li1Zza2;
                        }
/* 80 */                ioloi11I000o00OoI0I.zzd(object2, object);
                    }
                }

                public final void I000lI(int i, Object obj, Object obj2) {
/* 1 */             int[] iArr = this.I00000oIO;
/* 3 */             int i2 = iArr[i];
/* 9 */             if (I000O01llI0(obj2, i2, i)) {
/* 19 */                long jI0010I0i = I0010I0i(i) & 1048575;
/* 21 */                Unsafe unsafe = I000OiO;
/* 23 */                Object object = unsafe.getObject(obj2, jI0010I0i);
/* 27 */                if (object == null) {
/* 94 */                    int i3 = iArr[i];
/* 96 */                    String string = obj2.toString();
/* 115 */                   OoOil11Ol1o.I000O01llI0(string, String.valueOf(i3).length() + 38 + string.length(), i3);
/* 408 */                   return;
                        }
/* 29 */                iOloi11 ioloi11I000o00OoI0I = I000o00OoI0I(i);
/* 37 */                if (!I000O01llI0(obj, i2, i)) {
/* 43 */                    if (I00111O(object)) {
/* 49 */                        iOlOoOlI0li1 ioloooli0li1Zza = ioloi11I000o00OoI0I.zza();
/* 53 */                        ioloi11I000o00OoI0I.zzd(ioloooli0li1Zza, object);
/* 56 */                        unsafe.putObject(obj, jI0010I0i, ioloooli0li1Zza);
                            } else {
/* 45 */                        unsafe.putObject(obj, jI0010I0i, object);
                            }
/* 65 */                    iOo0Ii1l.I00000oOI(obj, i2, iArr[i + 2] & 1048575);
/* 68 */                    return;
                        }
/* 69 */                Object object2 = unsafe.getObject(obj, jI0010I0i);
/* 77 */                if (!I00111O(object2)) {
/* 79 */                    iOlOoOlI0li1 ioloooli0li1Zza2 = ioloi11I000o00OoI0I.zza();
/* 83 */                    ioloi11I000o00OoI0I.zzd(ioloooli0li1Zza2, object2);
/* 86 */                    unsafe.putObject(obj, jI0010I0i, ioloooli0li1Zza2);
/* 89 */                    object2 = ioloooli0li1Zza2;
                        }
/* 90 */                ioloi11I000o00OoI0I.zzd(object2, object);
                    }
                }

                public final iOloi11 I000o00OoI0I(int i) {
/* 1 */             Object[] objArr = this.I00000oOI;
/* 3 */             int i2 = i / 3;
/* 5 */             int i3 = i2 + i2;
/* 8 */             iOloi11 ioloi11 = (iOloi11) objArr[i3];
/* 10 */            if (ioloi11 != null) {
/* 12 */                return ioloi11;
                    }
/* 21 */            iOloi11 ioloi11I00000oIO = iOloOOOIOII.I00000oOI.I00000oIO((Class) objArr[i3 + 1]);
/* 25 */            objArr[i3] = ioloi11I00000oIO;
/* 29 */            return ioloi11I00000oIO;
                }

                public final iOo10Oi I000oI1ioi(int i) {
/* 1 */             int i2 = i / 3;
/* 10 */            return (iOo10Oi) this.I00000oOI[i2 + i2 + 1];
                }

                public final Object I00100l0(int i, Object obj) {
/* 1 */             iOloi11 ioloi11I000o00OoI0I = I000o00OoI0I(i);
/* 12 */            int iI0010I0i = I0010I0i(i) & 1048575;
/* 17 */            if (!I0001Ioi1lo(i, obj)) {
/* 19 */                return ioloi11I000o00OoI0I.zza();
                    }
/* 27 */            Object object = I000OiO.getObject(obj, iI0010I0i);
/* 35 */            if (I00111O(object)) {
/* 37 */                return object;
                    }
/* 38 */            iOlOoOlI0li1 ioloooli0li1Zza = ioloi11I000o00OoI0I.zza();
/* 42 */            if (object != null) {
/* 44 */                ioloi11I000o00OoI0I.zzd(ioloooli0li1Zza, object);
                    }
/* 106 */           return ioloooli0li1Zza;
                }

                public final Object I00100o1O0lo(Object obj, int i, int i2) {
/* 1 */             iOloi11 ioloi11I000o00OoI0I = I000o00OoI0I(i2);
/* 9 */             if (!I000O01llI0(obj, i, i2)) {
/* 11 */                return ioloi11I000o00OoI0I.zza();
                    }
/* 27 */            Object object = I000OiO.getObject(obj, I0010I0i(i2) & 1048575);
/* 35 */            if (I00111O(object)) {
/* 37 */                return object;
                    }
/* 38 */            iOlOoOlI0li1 ioloooli0li1Zza = ioloi11I000o00OoI0I.zza();
/* 42 */            if (object != null) {
/* 44 */                ioloi11I000o00OoI0I.zzd(ioloooli0li1Zza, object);
                    }
/* 98 */            return ioloooli0li1Zza;
                }

                public final int I0010I0i(int i) {
/* 5 */             return this.I00000oIO[i + 1];
                }

                @Override
                public final iOlOoOlI0li1 zza() {
/* 10 */            return (iOlOoOlI0li1) ((iOlOoOlI0li1) this.I0000oI00).I000O01llI0(4);
                }

                @Override
                public final void zzd(Object obj, Object obj2) {
                    Object obj3;
/* 1 */             int[] iArr = this.I00000oIO;
/* 7 */             if (!I00111O(obj)) {
/* 513 */               I000II.I000iOII("Mutating immutable message: ".concat(String.valueOf(obj)));
/* 516 */               return;
                    }
/* 9 */             obj2.getClass();
/* 12 */            int i = 0;
/* 14 */            while (i < iArr.length) {
/* 16 */                int iI0010I0i = I0010I0i(i);
/* 23 */                int i2 = iI0010I0i & 1048575;
/* 25 */                int iI0010o = I0010o(iI0010I0i);
/* 29 */                int i3 = iArr[i];
                        long j = i2;
                        switch (iI0010o) {
                            case 0:
/* 473 */                       obj3 = obj;
/* 478 */                       if (I0001Ioi1lo(i, obj2)) {
/* 480 */                           Ooil0oIOI0l0 ooil0oIOI0l0 = iOo0Ii1l.I0000Il00O;
/* 486 */                           ooil0oIOI0l0.I00IOO(obj3, j, ooil0oIOI0l0.I00II0Ol1O0l(j, obj2));
/* 489 */                           I000II(i, obj3);
                                    continue;
                                }
/* 492 */                       i += 3;
/* 494 */                       obj = obj3;
                            case 1:
/* 453 */                       obj3 = obj;
/* 458 */                       if (I0001Ioi1lo(i, obj2)) {
/* 460 */                           Ooil0oIOI0l0 ooil0oIOI0l02 = iOo0Ii1l.I0000Il00O;
/* 466 */                           ooil0oIOI0l02.I001lloI(obj3, j, ooil0oIOI0l02.I001i1lo1io(j, obj2));
/* 469 */                           I000II(i, obj3);
                                } else {
                                    continue;
                                }
/* 492 */                       i += 3;
/* 494 */                       obj = obj3;
                            case 2:
/* 431 */                       obj3 = obj;
/* 436 */                       if (I0001Ioi1lo(i, obj2)) {
/* 446 */                           iOo0Ii1l.I0000Il00O.I00000oOI.putLong(obj3, j, iOo0Ii1l.I0000Il00O(obj2, j));
/* 449 */                           I000II(i, obj3);
                                } else {
                                    continue;
                                }
/* 492 */                       i += 3;
/* 494 */                       obj = obj3;
                            case 3:
/* 409 */                       obj3 = obj;
/* 414 */                       if (I0001Ioi1lo(i, obj2)) {
/* 424 */                           iOo0Ii1l.I0000Il00O.I00000oOI.putLong(obj3, j, iOo0Ii1l.I0000Il00O(obj2, j));
/* 427 */                           I000II(i, obj3);
                                } else {
                                    continue;
                                }
/* 492 */                       i += 3;
/* 494 */                       obj = obj3;
                            case 4:
/* 391 */                       obj3 = obj;
/* 396 */                       if (I0001Ioi1lo(i, obj2)) {
/* 402 */                           iOo0Ii1l.I00000oOI(obj3, iOo0Ii1l.I00000oIO(j, obj2), j);
/* 405 */                           I000II(i, obj3);
                                } else {
                                    continue;
                                }
/* 492 */                       i += 3;
/* 494 */                       obj = obj3;
                            case 5:
/* 369 */                       obj3 = obj;
/* 374 */                       if (I0001Ioi1lo(i, obj2)) {
/* 384 */                           iOo0Ii1l.I0000Il00O.I00000oOI.putLong(obj3, j, iOo0Ii1l.I0000Il00O(obj2, j));
/* 387 */                           I000II(i, obj3);
                                } else {
                                    continue;
                                }
/* 492 */                       i += 3;
/* 494 */                       obj = obj3;
                            case 6:
/* 350 */                       obj3 = obj;
/* 355 */                       if (I0001Ioi1lo(i, obj2)) {
/* 361 */                           iOo0Ii1l.I00000oOI(obj3, iOo0Ii1l.I00000oIO(j, obj2), j);
/* 364 */                           I000II(i, obj3);
                                } else {
                                    continue;
                                }
/* 492 */                       i += 3;
/* 494 */                       obj = obj3;
                            case 7:
/* 329 */                       obj3 = obj;
/* 334 */                       if (I0001Ioi1lo(i, obj2)) {
/* 336 */                           Ooil0oIOI0l0 ooil0oIOI0l03 = iOo0Ii1l.I0000Il00O;
/* 342 */                           ooil0oIOI0l03.I001IO000(obj3, j, ooil0oIOI0l03.I00111O(j, obj2));
/* 345 */                           I000II(i, obj3);
                                } else {
                                    continue;
                                }
/* 492 */                       i += 3;
/* 494 */                       obj = obj3;
                            case 8:
/* 310 */                       obj3 = obj;
/* 315 */                       if (I0001Ioi1lo(i, obj2)) {
/* 321 */                           iOo0Ii1l.I0000oI00(obj3, j, iOo0Ii1l.I0000O(j, obj2));
/* 324 */                           I000II(i, obj3);
                                } else {
                                    continue;
                                }
/* 492 */                       i += 3;
/* 494 */                       obj = obj3;
                            case 9:
/* 304 */                       obj3 = obj;
/* 305 */                       I000l1(i, obj3, obj2);
                                continue;
/* 492 */                       i += 3;
/* 494 */                       obj = obj3;
                            case 10:
/* 285 */                       obj3 = obj;
/* 290 */                       if (I0001Ioi1lo(i, obj2)) {
/* 296 */                           iOo0Ii1l.I0000oI00(obj3, j, iOo0Ii1l.I0000O(j, obj2));
/* 299 */                           I000II(i, obj3);
                                } else {
                                    continue;
                                }
/* 492 */                       i += 3;
/* 494 */                       obj = obj3;
                            case 11:
/* 266 */                       obj3 = obj;
/* 271 */                       if (I0001Ioi1lo(i, obj2)) {
/* 277 */                           iOo0Ii1l.I00000oOI(obj3, iOo0Ii1l.I00000oIO(j, obj2), j);
/* 280 */                           I000II(i, obj3);
                                } else {
                                    continue;
                                }
/* 492 */                       i += 3;
/* 494 */                       obj = obj3;
                            case 12:
/* 247 */                       obj3 = obj;
/* 252 */                       if (I0001Ioi1lo(i, obj2)) {
/* 258 */                           iOo0Ii1l.I00000oOI(obj3, iOo0Ii1l.I00000oIO(j, obj2), j);
/* 261 */                           I000II(i, obj3);
                                } else {
                                    continue;
                                }
/* 492 */                       i += 3;
/* 494 */                       obj = obj3;
                            case 13:
/* 228 */                       obj3 = obj;
/* 233 */                       if (I0001Ioi1lo(i, obj2)) {
/* 239 */                           iOo0Ii1l.I00000oOI(obj3, iOo0Ii1l.I00000oIO(j, obj2), j);
/* 242 */                           I000II(i, obj3);
                                } else {
                                    continue;
                                }
/* 492 */                       i += 3;
/* 494 */                       obj = obj3;
                            case 14:
/* 205 */                       obj3 = obj;
/* 210 */                       if (I0001Ioi1lo(i, obj2)) {
/* 220 */                           iOo0Ii1l.I0000Il00O.I00000oOI.putLong(obj3, j, iOo0Ii1l.I0000Il00O(obj2, j));
/* 223 */                           I000II(i, obj3);
                                } else {
                                    continue;
                                }
/* 492 */                       i += 3;
/* 494 */                       obj = obj3;
                            case 15:
/* 186 */                       obj3 = obj;
/* 191 */                       if (I0001Ioi1lo(i, obj2)) {
/* 197 */                           iOo0Ii1l.I00000oOI(obj3, iOo0Ii1l.I00000oIO(j, obj2), j);
/* 200 */                           I000II(i, obj3);
                                } else {
                                    continue;
                                }
/* 492 */                       i += 3;
/* 494 */                       obj = obj3;
                            case 16:
/* 167 */                       if (I0001Ioi1lo(i, obj2)) {
/* 177 */                           obj3 = obj;
/* 178 */                           iOo0Ii1l.I0000Il00O.I00000oOI.putLong(obj3, j, iOo0Ii1l.I0000Il00O(obj2, j));
/* 181 */                           I000II(i, obj3);
                                }
/* 492 */                       i += 3;
/* 494 */                       obj = obj3;
                                break;
                            case 17:
/* 159 */                       I000l1(i, obj, obj2);
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
/* 114 */                       iOlil0i iolil0iI0000oI00 = (iOlil0i) iOo0Ii1l.I0000O(j, obj);
/* 120 */                       iOlil0i iolil0i = (iOlil0i) iOo0Ii1l.I0000O(j, obj2);
/* 122 */                       int size = iolil0iI0000oI00.size();
/* 126 */                       int size2 = iolil0i.size();
/* 130 */                       if (size > 0 && size2 > 0) {
/* 139 */                           if (!((iOloOiOiiOO) iolil0iI0000oI00).I00iOIl) {
/* 144 */                               iolil0iI0000oI00 = ((iOloOiOiiOO) iolil0iI0000oI00).I0000oI00(size2 + size);
                                    }
/* 148 */                           iolil0iI0000oI00.addAll(iolil0i);
                                }
/* 151 */                       if (size > 0) {
/* 154 */                           iolil0i = iolil0iI0000oI00;
                                }
/* 155 */                       iOo0Ii1l.I0000oI00(obj, j, iolil0i);
                                break;
                            case 50:
/* 92 */                        i1i0olI i1i0oli = iOloiOio.I00000oIO;
/* 106 */                       iOo0Ii1l.I0000oI00(obj, j, lil01Olill.I00000oIO(iOo0Ii1l.I0000O(j, obj), iOo0Ii1l.I0000O(j, obj2)));
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
/* 79 */                            iOo0Ii1l.I0000oI00(obj, j, iOo0Ii1l.I0000O(j, obj2));
/* 88 */                            iOo0Ii1l.I00000oOI(obj, i3, iArr[i + 2] & 1048575);
                                    break;
                                }
                                break;
                            case 60:
/* 65 */                        I000lI(i, obj, obj2);
                                break;
                            case 61:
                            case 62:
                            case 63:
                            case Barcode.FORMAT_EAN_8:
                            case 65:
                            case 66:
                            case 67:
/* 46 */                        if (I000O01llI0(obj2, i3, i)) {
/* 52 */                            iOo0Ii1l.I0000oI00(obj, j, iOo0Ii1l.I0000O(j, obj2));
/* 61 */                            iOo0Ii1l.I00000oOI(obj, i3, iArr[i + 2] & 1048575);
                                    break;
                                }
                                break;
                            case 68:
/* 38 */                        I000lI(i, obj, obj2);
                                break;
                        }
/* 35 */                obj3 = obj;
/* 492 */               i += 3;
/* 494 */               obj = obj3;
                    }
/* 498 */           iOloiOio.I00000oOI(obj, obj2);
                }

                /* JADX WARN: Removed duplicated region for block: B:20:0x0043  */
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
/* 15 */                int i4 = this.I0001Ioi1lo[i];
/* 17 */                int iI0010I0i = I0010I0i(i4);
/* 21 */                int[] iArr = this.I00000oIO;
/* 25 */                int i5 = iArr[i4 + 2];
/* 27 */                int i6 = i5 & 1048575;
/* 31 */                int i7 = 1 << (i5 >>> 20);
/* 33 */                if (i6 != i3) {
/* 35 */                    if (i6 != 1048575) {
/* 40 */                        i2 = I000OiO.getInt(obj, i6);
                            }
/* 44 */                    i3 = i6;
                        }
/* 48 */                if ((268435456 & iI0010I0i) != 0) {
/* 64 */                    if (!(i3 == 1048575 ? I0001Ioi1lo(i4, obj) : (i2 & i7) != 0)) {
                                break;
                            }
                        } else {
/* 68 */                    int iI0010o = I0010o(iI0010I0i);
/* 74 */                    if (iI0010o == 9 || iI0010o == 17) {
/* 197 */                       if (i3 == 1048575) {
/* 199 */                           zI0001Ioi1lo = I0001Ioi1lo(i4, obj);
                                } else if ((i2 & i7) == 0) {
/* 209 */                           zI0001Ioi1lo = false;
                                }
/* 210 */                       if (zI0001Ioi1lo && !I000o00OoI0I(i4).zzi(iOo0Ii1l.I0000O(iI0010I0i & 1048575, obj))) {
                                    break;
                                }
/* 230 */                       i++;
                            } else {
/* 82 */                        if (iI0010o != 27) {
/* 86 */                            if (iI0010o == 60 || iI0010o == 68) {
/* 137 */                               if (I000O01llI0(obj, iArr[i4], i4) && !I000o00OoI0I(i4).zzi(iOo0Ii1l.I0000O(iI0010I0i & 1048575, obj))) {
                                            break;
                                        }
                                    } else if (iI0010o != 49) {
/* 98 */                                if (iI0010o == 50 && !((iOllI1i1l) iOo0Ii1l.I0000O(iI0010I0i & 1048575, obj)).isEmpty()) {
/* 119 */                                   int i8 = i4 / 3;
/* 130 */                                   throw IIlIOloOOO.I000l1(this.I00000oOI[i8 + i8]);
                                        }
                                    }
/* 230 */                           i++;
                                }
/* 164 */                       List list = (List) iOo0Ii1l.I0000O(iI0010I0i & 1048575, obj);
/* 170 */                       if (list.isEmpty()) {
                                    continue;
                                } else {
/* 172 */                           iOloi11 ioloi11I000o00OoI0I = I000o00OoI0I(i4);
/* 181 */                           for (int i9 = 0; i9 < list.size(); i9++) {
/* 191 */                               if (!ioloi11I000o00OoI0I.zzi(list.get(i9))) {
                                            break loop0;
                                        }
                                    }
                                }
/* 230 */                       i++;
                            }
                        }
                    }
/* 1 */             return false;
                }
            }

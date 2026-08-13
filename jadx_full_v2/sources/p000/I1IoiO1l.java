            package p000;

            import java.io.IOException;
            import java.lang.invoke.VarHandle;
            import java.util.ArrayList;
            import java.util.Arrays;
            import java.util.Collections;
            import java.util.LinkedHashSet;
            import java.util.List;
            import java.util.Set;
            import kotlin.jvm.functions.Function1;
            
            public abstract class I1IoiO1l extends iOO1il1Ii1oo {
                public static Iterable I00000oOI(Object[] objArr) {
/* 2 */             if (objArr.length == 0) {
/* 4 */                 return Il01100l.I00iOIl;
                    }
/* 10 */            I1IollOi01 i1IollOi01 = new I1IollOi01(0);
/* 13 */            i1IollOi01.I00iiI = objArr;
/* 15 */            VarHandle.storeStoreFence();
/* 49 */            return i1IollOi01;
                }

                public static OilO0iOl I0000Il00O(Object[] objArr) {
/* 2 */             if (objArr.length == 0) {
/* 4 */                 return Il01lilOo00I.I00000oIO;
                    }
/* 10 */            I1Iolliil0i i1Iolliil0i = new I1Iolliil0i(0);
/* 13 */            i1Iolliil0i.I00000oOI = objArr;
/* 15 */            VarHandle.storeStoreFence();
/* 49 */            return i1Iolliil0i;
                }

                public static boolean I0000O(long j, long[] jArr) {
/* 1 */             int length = jArr.length;
/* 3 */             int i = 0;
                    while (true) {
/* 4 */                 if (i >= length) {
/* 16 */                    i = -1;
                            break;
                        }
/* 10 */                if (j == jArr[i]) {
                            break;
                        }
/* 13 */                i++;
                    }
                    return i >= 0;
                }

                public static boolean I0000oI00(int[] iArr, int i) {
/* 1 */             int length = iArr.length;
/* 3 */             int i2 = 0;
                    while (true) {
/* 4 */                 if (i2 >= length) {
/* 14 */                    i2 = -1;
                            break;
                        }
/* 8 */                 if (i == iArr[i2]) {
                            break;
                        }
/* 11 */                i2++;
                    }
                    return i2 >= 0;
                }

                public static boolean I0001Ioi1lo(Object[] objArr, Object obj) {
                    return I001l0I00(objArr, obj) >= 0;
                }

                public static boolean I000II(Object[] objArr, Object[] objArr2) {
/* 1 */             if (objArr == objArr2) {
/* 317 */               return true;
                    }
/* 6 */             if (objArr != null && objArr2 != null && objArr.length == objArr2.length) {
/* 16 */                int length = objArr.length;
/* 18 */                for (int i = 0; i < length; i++) {
/* 20 */                    Object obj = objArr[i];
/* 22 */                    Object obj2 = objArr2[i];
/* 24 */                    if (obj != obj2) {
/* 28 */                        if (obj != null && obj2 != null) {
/* 36 */                            if ((obj instanceof Object[]) && (obj2 instanceof Object[])) {
/* 50 */                                if (!I000II((Object[]) obj, (Object[]) obj2)) {
                                        }
                                    } else if ((obj instanceof byte[]) && (obj2 instanceof byte[])) {
/* 70 */                                if (!Arrays.equals((byte[]) obj, (byte[]) obj2)) {
                                        }
                                    } else if ((obj instanceof short[]) && (obj2 instanceof short[])) {
/* 90 */                                if (!Arrays.equals((short[]) obj, (short[]) obj2)) {
                                        }
                                    } else if ((obj instanceof int[]) && (obj2 instanceof int[])) {
/* 110 */                               if (!Arrays.equals((int[]) obj, (int[]) obj2)) {
                                        }
                                    } else if ((obj instanceof long[]) && (obj2 instanceof long[])) {
/* 130 */                               if (!Arrays.equals((long[]) obj, (long[]) obj2)) {
                                        }
                                    } else if ((obj instanceof float[]) && (obj2 instanceof float[])) {
/* 150 */                               if (!Arrays.equals((float[]) obj, (float[]) obj2)) {
                                        }
                                    } else if ((obj instanceof double[]) && (obj2 instanceof double[])) {
/* 170 */                               if (!Arrays.equals((double[]) obj, (double[]) obj2)) {
                                        }
                                    } else if ((obj instanceof char[]) && (obj2 instanceof char[])) {
/* 190 */                               if (!Arrays.equals((char[]) obj, (char[]) obj2)) {
                                        }
                                    } else if ((obj instanceof boolean[]) && (obj2 instanceof boolean[])) {
/* 210 */                               if (!Arrays.equals((boolean[]) obj, (boolean[]) obj2)) {
                                        }
                                    } else if ((obj instanceof OoOoo0oO0) && (obj2 instanceof OoOoo0oO0)) {
/* 234 */                               if (!Arrays.equals(((OoOoo0oO0) obj).I00iOIl, ((OoOoo0oO0) obj2).I00iOIl)) {
                                        }
                                    } else if ((obj instanceof Ooi1Ioi10) && (obj2 instanceof Ooi1Ioi10)) {
/* 257 */                               if (!Arrays.equals(((Ooi1Ioi10) obj).I00iOIl, ((Ooi1Ioi10) obj2).I00iOIl)) {
                                        }
                                    } else if ((obj instanceof Ooi0IOoioOOl) && (obj2 instanceof Ooi0IOoioOOl)) {
/* 280 */                               if (!Arrays.equals(((Ooi0IOoioOOl) obj).I00iOIl, ((Ooi0IOoioOOl) obj2).I00iOIl)) {
                                        }
                                    } else if ((obj instanceof Ooi0l101o) && (obj2 instanceof Ooi0l101o)) {
/* 303 */                               if (!Arrays.equals(((Ooi0l101o) obj).I00iOIl, ((Ooi0l101o) obj2).I00iOIl)) {
                                        }
                                    } else if (!obj.equals(obj2)) {
                                    }
                                }
                            }
                        }
/* 317 */               return true;
                    }
/* 5 */             return false;
                }

                public static void I000O01llI0(int i, int i2, int i3, int[] iArr, int[] iArr2) {
/* 2 */             System.arraycopy(iArr, i2, iArr2, i, i3 - i2);
                }

                public static void I000OOo1O(byte[] bArr, int i, byte[] bArr2, int i2, int i3) {
/* 2 */             System.arraycopy(bArr, i2, bArr2, i, i3 - i2);
                }

                public static void I000OiO(long[] jArr, long[] jArr2, int i, int i2, int i3) {
/* 2 */             System.arraycopy(jArr, i2, jArr2, i, i3 - i2);
                }

                public static void I000iOII(Object[] objArr, int i, Object[] objArr2, int i2, int i3) {
/* 2 */             System.arraycopy(objArr, i2, objArr2, i, i3 - i2);
                }

                public static void I000l1(int i, int i2, int i3, int[] iArr, int[] iArr2) {
/* 4 */             if ((i3 & 2) != 0) {
/* 6 */                 i = 0;
                    }
/* 9 */             if ((i3 & 8) != 0) {
/* 11 */                i2 = iArr.length;
                    }
/* 12 */            System.arraycopy(iArr, 0, iArr2, i, i2);
                }

                public static void I000lI(byte[] bArr, byte[] bArr2, int i, int i2) {
/* 3 */             System.arraycopy(bArr, i, bArr2, 0, i2 - i);
                }

                public static void I000o00OoI0I(float[] fArr, float[] fArr2, int i) {
/* 9 */             System.arraycopy(fArr, 0, fArr2, 0, (i & 8) != 0 ? fArr.length : 6);
                }

                public static void I000oI1ioi(Object[] objArr, int i, Object[] objArr2, int i2, int i3) {
/* 4 */             if ((i3 & 4) != 0) {
/* 6 */                 i = 0;
                    }
/* 9 */             if ((i3 & 8) != 0) {
/* 11 */                i2 = objArr.length;
                    }
/* 13 */            System.arraycopy(objArr, i, objArr2, 0, i2 - i);
                }

                public static byte[] I00100l0(byte[] bArr, int i, int i2) {
/* 2 */             iOO1il1Ii1oo.I00000oIO(i2, bArr.length);
/* 5 */             return Arrays.copyOfRange(bArr, i, i2);
                }

                public static Object[] I00100o1O0lo(Object[] objArr, int i, int i2) {
/* 2 */             iOO1il1Ii1oo.I00000oIO(i2, objArr.length);
/* 5 */             return Arrays.copyOfRange(objArr, i, i2);
                }

                public static List I0010I0i(int i, Object[] objArr) {
/* 6 */             if (i < 0) {
/* 62 */                I000II.I0010I0i(IIlIOloOOO.I00100l0("Requested element count ", i, " is less than zero."));
/* 1 */                 return null;
                    }
/* 9 */             int length = objArr.length - i;
/* 10 */            if (length < 0) {
/* 12 */                length = 0;
                    }
/* 13 */            if (length < 0) {
/* 54 */                I000II.I0010I0i(IIlIOloOOO.I00100l0("Requested element count ", length, " is less than zero."));
/* 1 */                 return null;
                    }
/* 15 */            if (length == 0) {
/* 17 */                return Il01100l.I00iOIl;
                    }
/* 20 */            int length2 = objArr.length;
                    return length >= length2 ? I00IioO0OiOi(objArr) : length == 1 ? Collections.singletonList(objArr[length2 - 1]) : Arrays.asList(I00100o1O0lo(objArr, length2 - length, length2));
                }

                public static void I0010o(long j, long[] jArr) {
/* 3 */             Arrays.fill(jArr, 0, jArr.length, j);
                }

                public static void I00111O(Object[] objArr, Object obj) {
/* 3 */             Arrays.fill(objArr, 0, objArr.length, obj);
                }

                public static ArrayList I001IIilI0O(Object[] objArr) {
/* 3 */             ArrayList arrayList = new ArrayList();
/* 8 */             for (Object obj : objArr) {
/* 12 */                if (obj != null) {
/* 14 */                    arrayList.add(obj);
                        }
                    }
/* 49 */            return arrayList;
                }

                public static Object I001IO000(Object[] objArr) {
/* 2 */             if (objArr.length != 0) {
/* 5 */                 return objArr[0];
                    }
/* 10 */            OIiilo1Ool0o.I000II("Array is empty.");
/* 13 */            return null;
                }

                public static Object I001i1O0Ol(Object[] objArr) {
/* 2 */             if (objArr.length == 0) {
/* 4 */                 return null;
                    }
/* 7 */             return objArr[0];
                }

                public static IooO11l I001i1lo1io(int[] iArr) {
/* 7 */             return new IooO11l(0, iArr.length - 1, 1);
                }

                public static Object I001iOo1i0O(int i, Object[] objArr) {
/* 1 */             if (i < 0 || i >= objArr.length) {
/* 9 */                 return null;
                    }
/* 6 */             return objArr[i];
                }

                public static int I001l0I00(Object[] objArr, Object obj) {
/* 1 */             int i = 0;
/* 2 */             if (obj == null) {
/* 4 */                 int length = objArr.length;
/* 5 */                 while (i < length) {
/* 9 */                     if (objArr[i] == null) {
/* 11 */                        return i;
                            }
/* 12 */                    i++;
                        }
/* 30 */                return -1;
                    }
/* 15 */            int length2 = objArr.length;
/* 16 */            while (i < length2) {
/* 24 */                if (obj.equals(objArr[i])) {
/* 26 */                    return i;
                        }
/* 27 */                i++;
                    }
/* 30 */            return -1;
                }

                public static final void I001lIiIIo1O(Object[] objArr, StringBuilder sb, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, CharSequence charSequence4, Function1 function1) throws IOException {
/* 1 */             sb.append(charSequence2);
/* 6 */             int i = 0;
/* 7 */             for (Object obj : objArr) {
/* 12 */                i++;
/* 13 */                if (i > 1) {
/* 15 */                    sb.append(charSequence);
                        }
/* 18 */                OlOoOOooiIll.I00000oIO(sb, obj, function1);
                    }
/* 24 */            sb.append(charSequence3);
                }

                public static String I001lllioOl(Object[] objArr, String str, String str2, String str3, Function1 function1, int i) throws IOException {
/* 3 */             if ((i & 1) != 0) {
/* 5 */                 str = ", ";
                    }
/* 7 */             String str4 = str;
/* 16 */            String str5 = (i & 2) != 0 ? "" : str2;
/* 23 */            String str6 = (i & 4) != 0 ? "" : str3;
/* 26 */            if ((i & 32) != 0) {
/* 28 */                function1 = null;
                    }
/* 32 */            StringBuilder sb = new StringBuilder();
/* 38 */            I001lIiIIo1O(objArr, sb, str4, str5, str6, "...", function1);
/* 41 */            return sb.toString();
                }

                public static Object I001lloI(Object[] objArr) {
/* 2 */             if (objArr.length != 0) {
/* 7 */                 return objArr[objArr.length - 1];
                    }
/* 12 */            OIiilo1Ool0o.I000II("Array is empty.");
/* 15 */            return null;
                }

                public static float I00II0Ol1O0l(float[] fArr) {
/* 2 */             if (fArr.length == 0) {
/* 24 */                IoOOl0iOl1io.I00000oOI();
/* 27 */                return 0.0f;
                    }
/* 5 */             float fMax = fArr[0];
/* 8 */             int i = 1;
/* 9 */             int length = fArr.length - 1;
/* 10 */            if (1 <= length) {
                        while (true) {
/* 14 */                    fMax = Math.max(fMax, fArr[i]);
/* 18 */                    if (i == length) {
                                break;
                            }
/* 20 */                    i++;
                        }
                    }
/* 23 */            return fMax;
                }

                public static Object I00II0oii1o(Object[] objArr) {
/* 1 */             int length = objArr.length;
/* 3 */             if (length == 0) {
/* 20 */                OIiilo1Ool0o.I000II("Array is empty.");
/* 2 */                 return null;
                    }
/* 6 */             if (length == 1) {
/* 9 */                 return objArr[0];
                    }
/* 14 */            I000II.I000iOII("Array has more than one element.");
/* 2 */             return null;
                }

                public static float I00IO1(float[] fArr) {
/* 2 */             float f = 0.0f;
/* 4 */             for (float f2 : fArr) {
/* 8 */                 f += f2;
                    }
/* 49 */            return f;
                }

                public static List I00IO1oi11O(float[] fArr) {
/* 1 */             int length = fArr.length;
/* 2 */             if (length == 0) {
/* 41 */                return Il01100l.I00iOIl;
                    }
/* 6 */             if (length == 1) {
/* 36 */                return Collections.singletonList(Float.valueOf(fArr[0]));
                    }
/* 11 */            ArrayList arrayList = new ArrayList(fArr.length);
/* 15 */            for (float f : fArr) {
/* 23 */                arrayList.add(Float.valueOf(f));
                    }
/* 29 */            return arrayList;
                }

                public static List I00IOO(int[] iArr) {
/* 1 */             int length = iArr.length;
/* 2 */             if (length == 0) {
/* 41 */                return Il01100l.I00iOIl;
                    }
/* 6 */             if (length == 1) {
/* 36 */                return Collections.singletonList(Integer.valueOf(iArr[0]));
                    }
/* 11 */            ArrayList arrayList = new ArrayList(iArr.length);
/* 15 */            for (int i : iArr) {
/* 23 */                arrayList.add(Integer.valueOf(i));
                    }
/* 29 */            return arrayList;
                }

                public static List I00IioO0OiOi(Object[] objArr) {
/* 1 */             int length = objArr.length;
                    return length != 0 ? length != 1 ? Arrays.asList(Arrays.copyOf(objArr, objArr.length)) : Collections.singletonList(objArr[0]) : Il01100l.I00iOIl;
                }

                public static Set I00IlilI0i0i(Object[] objArr) {
/* 1 */             int length = objArr.length;
/* 2 */             if (length == 0) {
/* 37 */                return Il01llIol0.I00iOIl;
                    }
/* 6 */             if (length == 1) {
/* 32 */                return Collections.singleton(objArr[0]);
                    }
/* 15 */            LinkedHashSet linkedHashSet = new LinkedHashSet(O1Oii0o0Oi.I00000oIO(objArr.length));
/* 19 */            for (Object obj : objArr) {
/* 23 */                linkedHashSet.add(obj);
                    }
/* 29 */            return linkedHashSet;
                }

                public static ArrayList I00Io1lO(Object[] objArr, Object[] objArr2) {
/* 3 */             int iMin = Math.min(objArr.length, objArr2.length);
/* 9 */             ArrayList arrayList = new ArrayList(iMin);
/* 13 */            for (int i = 0; i < iMin; i++) {
/* 24 */                arrayList.add(new OIoi0IIoi(objArr[i], objArr2[i]));
                    }
/* 89 */            return arrayList;
                }
            }

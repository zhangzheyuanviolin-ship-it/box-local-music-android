            package p000;
            
            public abstract class liilllI1l {
                public static int I00000oIO(Object obj, Object obj2, int i, Object obj3, int[] iArr, Object[] objArr, Object[] objArr2) {
                    int i2;
                    int i3;
/* 9 */             int iI00000oIO = liio00ol.I00000oIO(obj == null ? 0 : obj.hashCode());
/* 13 */            int i4 = iI00000oIO & i;
/* 15 */            int iI00000oOI = I00000oOI(i4, obj3);
/* 20 */            if (iI00000oOI != 0) {
/* 22 */                int i5 = ~i;
/* 23 */                int i6 = iI00000oIO & i5;
/* 24 */                int i7 = -1;
                        while (true) {
                            i2 = iI00000oOI - 1;
/* 26 */                    int i8 = iArr[i2];
/* 28 */                    i3 = i8 & i;
/* 31 */                    if ((i8 & i5) != i6 || !ll0o0IOO.I00000oIO(obj, objArr[i2]) || (objArr2 != null && !ll0o0IOO.I00000oIO(obj2, objArr2[i2]))) {
/* 66 */                        if (i3 == 0) {
                                    break;
                                }
/* 68 */                        i7 = i2;
/* 69 */                        iI00000oOI = i3;
                            } else {
                                break;
                            }
                        }
/* 51 */                if (i7 == -1) {
/* 53 */                    I0000O(obj3, i4, i3);
/* 56 */                    return i2;
                        }
/* 63 */                iArr[i7] = (iArr[i7] & i5) | (i3 & i);
/* 65 */                return i2;
                    }
/* 19 */            return -1;
                }

                public static int I00000oOI(int i, Object obj) {
                    return obj instanceof byte[] ? ((byte[]) obj)[i] & 255 : obj instanceof short[] ? (char) ((short[]) obj)[i] : ((int[]) obj)[i];
                }

                public static Object I0000Il00O(int i) {
/* 2 */             if (i >= 2 && i <= 1073741824 && Integer.highestOneBit(i) == i) {
                        return i <= 256 ? new byte[i] : i <= 65536 ? new short[i] : new int[i];
                    }
/* 37 */            I000II.I000iOII(Oi010OO0.I000oI1ioi(i, "must be power of 2 between 2^1 and 2^30: "));
/* 40 */            return null;
                }

                public static void I0000O(Object obj, int i, int i2) {
/* 3 */             if (obj instanceof byte[]) {
/* 8 */                 ((byte[]) obj)[i] = (byte) i2;
                    } else if (obj instanceof short[]) {
/* 18 */                ((short[]) obj)[i] = (short) i2;
                    } else {
/* 23 */                ((int[]) obj)[i] = i2;
                    }
                }
            }

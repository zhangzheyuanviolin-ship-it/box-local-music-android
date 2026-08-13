            package p000;
            
            public abstract class lil1Ool1oiiI {
                public static int I00000oIO(Object obj, Object obj2, int i, Object obj3, int[] iArr, Object[] objArr, Object[] objArr2) {
                    int i2;
                    int i3;
/* 1 */             int iI00000oIO = lil1l1oIl.I00000oIO(obj);
/* 5 */             int i4 = iI00000oIO & i;
/* 7 */             int iI00000oOI = I00000oOI(i4, obj3);
/* 12 */            if (iI00000oOI != 0) {
/* 14 */                int i5 = ~i;
/* 15 */                int i6 = iI00000oIO & i5;
/* 16 */                int i7 = -1;
                        while (true) {
                            i2 = iI00000oOI - 1;
/* 18 */                    i3 = iArr[i2];
/* 22 */                    if ((i3 & i5) != i6 || !ll1Oll0I0o1.I00000oIO(obj, objArr[i2]) || (objArr2 != null && !ll1Oll0I0o1.I00000oIO(obj2, objArr2[i2]))) {
/* 58 */                        int i8 = i3 & i;
/* 60 */                        if (i8 == 0) {
                                    break;
                                }
/* 63 */                        i7 = i2;
/* 64 */                        iI00000oOI = i8;
                            } else {
                                break;
                            }
                        }
/* 42 */                int i9 = i3 & i;
/* 44 */                if (i7 == -1) {
/* 46 */                    I0000O(obj3, i4, i9);
/* 49 */                    return i2;
                        }
/* 55 */                iArr[i7] = (i9 & i) | (iArr[i7] & i5);
/* 57 */                return i2;
                    }
/* 11 */            return -1;
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

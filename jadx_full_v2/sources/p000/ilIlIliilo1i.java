            package p000;

            import java.io.Serializable;
            
            public abstract class ilIlIliilo1i {
                /* JADX WARN: Multi-variable type inference failed */
                public static long[] I00000oIO(Serializable serializable) {
/* 3 */             if (!(serializable instanceof int[])) {
/* 25 */                if (serializable instanceof long[]) {
/* 27 */                    return (long[]) serializable;
                        }
/* 30 */                return null;
                    }
/* 5 */             int[] iArr = (int[]) serializable;
/* 8 */             long[] jArr = new long[iArr.length];
/* 12 */            for (int i = 0; i < iArr.length; i++) {
/* 17 */                jArr[i] = iArr[i];
                    }
/* 22 */            return jArr;
                }

                public static boolean I00000oOI(byte[] bArr, byte[] bArr2) {
/* 2 */             if (bArr2 != null && bArr.length >= bArr2.length) {
/* 12 */                for (int i = 0; i < bArr2.length; i++) {
/* 18 */                    if (bArr[i] == bArr2[i]) {
                            }
                        }
/* 24 */                return true;
                    }
/* 1 */             return false;
                }
            }

            package p000;

            import java.util.Arrays;
            
            public abstract class IlOOlO01I {
                public static final float[] I00000oIO;

                static {
/* 1 */             long[] jArr = OiO10oio.I00000oIO;
/* 4 */             int iI0000O = OiO10oio.I0000O(0);
/* 20 */            int iMax = iI0000O > 0 ? Math.max(7, OiO10oio.I0000Il00O(iI0000O)) : 0;
/* 21 */            if (iMax != 0) {
/* 28 */                int i = ((iMax + 15) & (-8)) >> 3;
/* 30 */                long[] jArr2 = new long[i];
/* 37 */                Arrays.fill(jArr2, 0, i, -9187201950435737472L);
/* 40 */                jArr = jArr2;
                    }
/* 41 */            int i2 = iMax >> 3;
/* 51 */            long j = 255 << ((iMax & 7) << 3);
/* 56 */            jArr[i2] = (jArr[i2] & (~j)) | j;
/* 58 */            float[] fArr = new float[iMax];
/* 62 */            I00000oIO = new float[0];
                }
            }

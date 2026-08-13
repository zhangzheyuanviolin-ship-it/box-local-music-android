            package p000;

            import android.graphics.LinearGradient;
            import android.graphics.RadialGradient;
            import android.graphics.SweepGradient;
            
            public final class Io0ioo1Iooi1 {
                public static final Io0ioo1Iooi1 I00000oIO = new Io0ioo1Iooi1();

                public final LinearGradient I00000oIO(long j, long j2, long[] jArr, float[] fArr, int i) {
/* 42 */            return new LinearGradient(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)), Float.intBitsToFloat((int) (j2 >> 32)), Float.intBitsToFloat((int) (j2 & 4294967295L)), jArr, fArr, iOIoIi0o.I00000oIO(i));
                }

                public final RadialGradient I00000oOI(long j, float f, long[] jArr, float[] fArr, int i) {
/* 28 */            return new RadialGradient(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)), f, jArr, fArr, iOIoIi0o.I00000oIO(i));
                }

                public final SweepGradient I0000Il00O(long j, long[] jArr, float[] fArr) {
/* 23 */            return new SweepGradient(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)), jArr, fArr);
                }
            }

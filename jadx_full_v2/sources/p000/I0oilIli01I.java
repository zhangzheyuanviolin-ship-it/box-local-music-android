            package p000;

            import android.graphics.Paint;
            
            public abstract class I0oilIli01I {
                public static final int[] I00000oIO;
                public static final int[] I00000oOI;

                static {
                    try {
/* 15 */                new int[Paint.Style.values().length][Paint.Style.STROKE.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
/* 22 */            int[] iArr = new int[Paint.Cap.values().length];
                    try {
/* 30 */                iArr[Paint.Cap.BUTT.ordinal()] = 1;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
/* 39 */                iArr[Paint.Cap.ROUND.ordinal()] = 2;
                    } catch (NoSuchFieldError unused3) {
                    }
                    try {
/* 48 */                iArr[Paint.Cap.SQUARE.ordinal()] = 3;
                    } catch (NoSuchFieldError unused4) {
                    }
/* 50 */            I00000oIO = iArr;
/* 57 */            int[] iArr2 = new int[Paint.Join.values().length];
                    try {
/* 65 */                iArr2[Paint.Join.MITER.ordinal()] = 1;
                    } catch (NoSuchFieldError unused5) {
                    }
                    try {
/* 73 */                iArr2[Paint.Join.BEVEL.ordinal()] = 2;
                    } catch (NoSuchFieldError unused6) {
                    }
                    try {
/* 81 */                iArr2[Paint.Join.ROUND.ordinal()] = 3;
                    } catch (NoSuchFieldError unused7) {
                    }
/* 83 */            I00000oOI = iArr2;
                }
            }

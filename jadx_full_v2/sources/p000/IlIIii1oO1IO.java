            package p000;
            
            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            public final class IlIIii1oO1IO {
                public static final IlIIii1oO1IO[] I00iOIl;
                public static final Il0li01oOil I00iiI;

                static {
/* 41 */            IlIIii1oO1IO[] ilIIii1oO1IOArr = {new IlIIii1oO1IO("DYNAMIC_RANGE", 0), new IlIIii1oO1IO("FPS_RANGE", 1), new IlIIii1oO1IO("VIDEO_STABILIZATION", 2), new IlIIii1oO1IO("IMAGE_FORMAT", 3), new IlIIii1oO1IO("RECORDING_QUALITY", 4)};
/* 45 */            I00iOIl = ilIIii1oO1IOArr;
/* 51 */            I00iiI = ilIII1o11.I00000oIO(ilIIii1oO1IOArr);
                }

                public static IlIIii1oO1IO valueOf(String str) {
/* 7 */             return (IlIIii1oO1IO) Enum.valueOf(IlIIii1oO1IO.class, str);
                }

                public static IlIIii1oO1IO[] values() {
/* 7 */             return (IlIIii1oO1IO[]) I00iOIl.clone();
                }
            }

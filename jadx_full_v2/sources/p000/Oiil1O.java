            package p000;
            
            public abstract class Oiil1O {
                public static final Oil0IoooOio I00000oIO = new Oil0IoooOio("SelectionHandleInfo");

                public static final long I00000oIO(long j) {
/* 6 */             float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
/* 23 */            float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L)) - 1.0f;
/* 37 */            return (Float.floatToRawIntBits(fIntBitsToFloat2) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32);
                }
            }

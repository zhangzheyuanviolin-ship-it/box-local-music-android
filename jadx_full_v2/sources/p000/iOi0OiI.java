            package p000;

            import java.lang.invoke.VarHandle;
            
            public abstract class iOi0OiI {
                public static final O1ooiI111i I00000oIO(O1ooiI111i o1ooiI111i, float f, long j, OioOIi1o0I oioOIi1o0I) {
/* 3 */             OlI00IIlOO olI00IIlOO = new OlI00IIlOO(j);
/* 8 */             II1IOl iI1IOl = new II1IOl();
/* 11 */            iI1IOl.I00000oIO = f;
/* 13 */            iI1IOl.I00000oOI = olI00IIlOO;
/* 15 */            iI1IOl.I0000Il00O = oioOIi1o0I;
/* 17 */            VarHandle.storeStoreFence();
/* 20 */            return o1ooiI111i.I0000O(iI1IOl);
                }

                public static final long I00000oOI(float f, long j) {
/* 12 */            float fMax = Math.max(0.0f, Float.intBitsToFloat((int) (j >> 32)) - f);
/* 28 */            float fMax2 = Math.max(0.0f, Float.intBitsToFloat((int) (j & 4294967295L)) - f);
/* 46 */            return (Float.floatToRawIntBits(fMax) << 32) | (Float.floatToRawIntBits(fMax2) & 4294967295L);
                }
            }

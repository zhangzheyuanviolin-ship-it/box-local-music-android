            package p000;
            
            public abstract class il1iiOO1ioI1 {
                public static final int I00000oIO(long j, long j2) {
/* 1 */             boolean zI0000O = I0000O(j);
/* 11 */            if (zI0000O != I0000O(j2)) {
                        return zI0000O ? -1 : 1;
                    }
                    return (Math.min(I00000oOI(j), I00000oOI(j2)) >= 0.0f && I0000Il00O(j) != I0000Il00O(j2)) ? I0000Il00O(j) ? -1 : 1 : (int) Math.signum(I00000oOI(j) - I00000oOI(j2));
                }

                public static final float I00000oOI(long j) {
/* 5 */             return Float.intBitsToFloat((int) (j >> 32));
                }

                public static final boolean I0000Il00O(long j) {
                    return (j & 2) != 0;
                }

                public static final boolean I0000O(long j) {
                    return (j & 1) != 0;
                }
            }

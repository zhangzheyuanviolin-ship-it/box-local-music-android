            package p000;
            
            public final class O0olOolil {
                public static final float I00000oOI;
                public static final float I0000Il00O;
                public static final float I0000O;
                public float I00000oIO;

                static {
/* 2 */             I00000oIO(0.0f);
/* 7 */             I00000oIO(0.5f);
/* 10 */            I00000oOI = 0.5f;
/* 14 */            I00000oIO(-1.0f);
/* 17 */            I0000Il00O = -1.0f;
/* 21 */            I00000oIO(1.0f);
/* 24 */            I0000O = 1.0f;
                }

                public static void I00000oIO(float f) {
/* 4 */             if ((0.0f > f || f > 1.0f) && f != -1.0f) {
/* 22 */                Ioliol.I0000Il00O("topRatio should be in [0..1] range or -1");
                    }
                }

                public static String I00000oOI(float f) {
/* 4 */             if (f == 0.0f) {
/* 6 */                 return "LineHeightStyle.Alignment.Top";
                    }
/* 13 */            if (f == I00000oOI) {
/* 15 */                return "LineHeightStyle.Alignment.Center";
                    }
/* 22 */            if (f == I0000Il00O) {
/* 24 */                return "LineHeightStyle.Alignment.Proportional";
                    }
/* 31 */            if (f == I0000O) {
/* 33 */                return "LineHeightStyle.Alignment.Bottom";
                    }
/* 51 */            return "LineHeightStyle.Alignment(topPercentage = " + f + ")";
                }

                public final boolean equals(Object obj) {
                    return (obj instanceof O0olOolil) && Float.compare(this.I00000oIO, ((O0olOolil) obj).I00000oIO) == 0;
                }

                public final int hashCode() {
/* 3 */             return Float.hashCode(this.I00000oIO);
                }

                public final String toString() {
/* 3 */             return I00000oOI(this.I00000oIO);
                }
            }

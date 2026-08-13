            package p000;
            
            public abstract class Oiol1l10l {
                public static final OOiIii I00000oIO;

                static {
/* 1 */             IiIOOioOO iiIOOioOO = IiIOOioOO.I00io1l;
/* 5 */             OOiIii oOiIii = new OOiIii();
/* 8 */             oOiIii.I00000oIO = iiIOOioOO;
/* 10 */            I00000oIO = oOiIii;
                }

                public static final long I00000oIO(O0iOOo0Ii o0iOOo0Ii, O0iOOo0Ii o0iOOo0Ii2, long j) {
/* 2 */             OOo0IO oOo0IOI00IoiI = o0iOOo0Ii2.I00IoiI(o0iOOo0Ii, false);
/* 6 */             float f = oOo0IOI00IoiI.I00000oIO;
/* 16 */            float fI0000Il00O = (OoI0l01O.I0000Il00O(j) * (oOo0IOI00IoiI.I0000Il00O - f)) + f;
/* 17 */            float f2 = oOo0IOI00IoiI.I00000oOI;
/* 27 */            float fI0000O = (OoI0l01O.I0000O(j) * (oOo0IOI00IoiI.I0000O - f2)) + f2;
/* 47 */            return (Float.floatToRawIntBits(fI0000Il00O) << 32) | (Float.floatToRawIntBits(fI0000O) & 4294967295L);
                }

                public static final long I00000oOI(float f, long j, long j2) {
/* 12 */            int i = (int) (j2 >> 32);
/* 25 */            float fIntBitsToFloat = Float.intBitsToFloat(i) + ((Float.intBitsToFloat((int) (j >> 32)) - Float.intBitsToFloat(i)) * f) + 0.0f;
/* 39 */            int i2 = (int) (j2 & 4294967295L);
/* 51 */            float fIntBitsToFloat2 = Float.intBitsToFloat(i2) + ((Float.intBitsToFloat((int) (j & 4294967295L)) - Float.intBitsToFloat(i2)) * f) + 0.0f;
/* 66 */            return (Float.floatToRawIntBits(fIntBitsToFloat) << 32) | (Float.floatToRawIntBits(fIntBitsToFloat2) & 4294967295L);
                }
            }

            package p000;
            
            public abstract class ioi000 {
                public static final boolean I00000oIO(Iol1O1 iol1O1) {
                    return !iol1O1.I000O01llI0 && iol1O1.I0000O;
                }

                public static final boolean I00000oOI(Iol1O1 iol1O1) {
                    return iol1O1.I000O01llI0 && !iol1O1.I0000O;
                }

                public static final long I0000Il00O(Iol1O1 iol1O1, OIilII oIilII, Iol1IlIII10 iol1IlIII10, boolean z) {
                    float fIntBitsToFloat;
                    long jFloatToRawIntBits;
                    long j;
/* 1 */             long j2 = iol1O1.I000II;
/* 3 */             if (oIilII != null) {
/* 6 */                 int i = iol1IlIII10.I00000oIO;
/* 16 */                if (i == 1) {
/* 20 */                    fIntBitsToFloat = Float.intBitsToFloat((int) (j2 >> 32));
                        } else if (i == 2) {
/* 30 */                    fIntBitsToFloat = Float.intBitsToFloat((int) (j2 & 4294967295L));
                        }
/* 37 */                if (oIilII == OIilII.I00iiI) {
/* 39 */                    long jFloatToRawIntBits2 = Float.floatToRawIntBits(fIntBitsToFloat);
/* 44 */                    jFloatToRawIntBits = Float.floatToRawIntBits(0.0f);
/* 49 */                    j = jFloatToRawIntBits2 << 32;
                        } else {
/* 54 */                    long jFloatToRawIntBits3 = Float.floatToRawIntBits(0.0f);
/* 59 */                    jFloatToRawIntBits = Float.floatToRawIntBits(fIntBitsToFloat);
/* 64 */                    j = jFloatToRawIntBits3 << 32;
                        }
/* 52 */                j2 = j | (jFloatToRawIntBits & 4294967295L);
                    }
/* 71 */            long jI0001Ioi1lo = OIOlIiiioi.I0001Ioi1lo(I0000O(iol1O1, oIilII, iol1IlIII10), j2);
/* 75 */            if (z || !iol1O1.I000OOo1O) {
/* 204 */               return jI0001Ioi1lo;
                    }
/* 81 */            return 0L;
                }

                public static final long I0000O(Iol1O1 iol1O1, OIilII oIilII, Iol1IlIII10 iol1IlIII10) {
                    float fIntBitsToFloat;
                    long jFloatToRawIntBits;
                    long j;
/* 1 */             if (oIilII == null) {
/* 3 */                 return iol1O1.I0000Il00O;
                    }
/* 6 */             int i = iol1IlIII10.I00000oIO;
/* 16 */            if (i == 1) {
/* 22 */                fIntBitsToFloat = Float.intBitsToFloat((int) (iol1O1.I0000Il00O >> 32));
                    } else {
/* 28 */                if (i != 2) {
/* 70 */                    return iol1O1.I0000Il00O;
                        }
/* 34 */                fIntBitsToFloat = Float.intBitsToFloat((int) (iol1O1.I0000Il00O & 4294967295L));
                    }
/* 41 */            if (oIilII == OIilII.I00iiI) {
/* 43 */                long jFloatToRawIntBits2 = Float.floatToRawIntBits(fIntBitsToFloat);
/* 48 */                jFloatToRawIntBits = Float.floatToRawIntBits(0.0f);
/* 53 */                j = jFloatToRawIntBits2 << 32;
                    } else {
/* 57 */                long jFloatToRawIntBits3 = Float.floatToRawIntBits(0.0f);
/* 62 */                jFloatToRawIntBits = Float.floatToRawIntBits(fIntBitsToFloat);
/* 67 */                j = jFloatToRawIntBits3 << 32;
                    }
/* 55 */            return j | (4294967295L & jFloatToRawIntBits);
                }
            }

            package p000;
            
            public abstract class l0o0IlOil1 {
                public static final OOo0IO I00000oIO(O0iOOo0Ii o0iOOo0Ii) {
/* 1 */             O0iOOo0Ii o0iOOo0IiI00II0oii1o = o0iOOo0Ii.I00II0oii1o();
                    return o0iOOo0IiI00II0oii1o != null ? o0iOOo0IiI00II0oii1o.I00IoiI(o0iOOo0Ii, true) : new OOo0IO(0.0f, 0.0f, (int) (o0iOOo0Ii.I000iOII() >> 32), (int) (o0iOOo0Ii.I000iOII() & 4294967295L));
                }

                public static final OOo0IO I00000oOI(O0iOOo0Ii o0iOOo0Ii, boolean z) {
/* 1 */             O0iOOo0Ii o0iOOo0IiI0000Il00O = I0000Il00O(o0iOOo0Ii);
/* 12 */            float fI000iOII = (int) (o0iOOo0IiI0000Il00O.I000iOII() >> 32);
/* 24 */            float fI000iOII2 = (int) (o0iOOo0IiI0000Il00O.I000iOII() & 4294967295L);
/* 26 */            OOo0IO oOo0IOI00IoiI = o0iOOo0IiI0000Il00O.I00IoiI(o0iOOo0Ii, z);
/* 30 */            float f = oOo0IOI00IoiI.I00000oIO;
/* 33 */            if (z) {
/* 37 */                if (f < 0.0f) {
/* 39 */                    f = 0.0f;
                        }
/* 42 */                if (f > fI000iOII) {
/* 44 */                    f = fI000iOII;
                        }
                    }
/* 45 */            float f2 = oOo0IOI00IoiI.I00000oOI;
/* 47 */            if (z) {
/* 51 */                if (f2 < 0.0f) {
/* 53 */                    f2 = 0.0f;
                        }
/* 56 */                if (f2 > fI000iOII2) {
/* 58 */                    f2 = fI000iOII2;
                        }
                    }
/* 59 */            float f3 = oOo0IOI00IoiI.I0000Il00O;
/* 61 */            if (z) {
/* 65 */                if (f3 < 0.0f) {
/* 67 */                    f3 = 0.0f;
                        }
/* 70 */                if (f3 <= fI000iOII) {
/* 73 */                    fI000iOII = f3;
                        }
/* 74 */                f3 = fI000iOII;
                    }
/* 75 */            float f4 = oOo0IOI00IoiI.I0000O;
/* 77 */            if (z) {
/* 81 */                float f5 = f4 >= 0.0f ? f4 : 0.0f;
/* 87 */                if (f5 <= fI000iOII2) {
/* 90 */                    fI000iOII2 = f5;
                        }
/* 91 */                f4 = fI000iOII2;
                    }
/* 94 */            if (f == f3 || f2 == f4) {
/* 101 */               return OOo0IO.I0000oI00;
                    }
/* 117 */           long jI0000O = o0iOOo0IiI0000Il00O.I0000O((Float.floatToRawIntBits(f) << 32) | (Float.floatToRawIntBits(f2) & 4294967295L));
/* 134 */           long jI0000O2 = o0iOOo0IiI0000Il00O.I0000O((Float.floatToRawIntBits(f3) << 32) | (Float.floatToRawIntBits(f2) & 4294967295L));
/* 151 */           long jI0000O3 = o0iOOo0IiI0000Il00O.I0000O((Float.floatToRawIntBits(f3) << 32) | (Float.floatToRawIntBits(f4) & 4294967295L));
/* 168 */           long jI0000O4 = o0iOOo0IiI0000Il00O.I0000O((Float.floatToRawIntBits(f4) & 4294967295L) | (Float.floatToRawIntBits(f) << 32));
/* 175 */           float fIntBitsToFloat = Float.intBitsToFloat((int) (jI0000O >> 32));
/* 182 */           float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jI0000O2 >> 32));
/* 189 */           float fIntBitsToFloat3 = Float.intBitsToFloat((int) (jI0000O4 >> 32));
/* 196 */           float fIntBitsToFloat4 = Float.intBitsToFloat((int) (jI0000O3 >> 32));
/* 208 */           float fMin = Math.min(fIntBitsToFloat, Math.min(fIntBitsToFloat2, Math.min(fIntBitsToFloat3, fIntBitsToFloat4)));
/* 220 */           float fMax = Math.max(fIntBitsToFloat, Math.max(fIntBitsToFloat2, Math.max(fIntBitsToFloat3, fIntBitsToFloat4)));
/* 226 */           float fIntBitsToFloat5 = Float.intBitsToFloat((int) (jI0000O & 4294967295L));
/* 233 */           float fIntBitsToFloat6 = Float.intBitsToFloat((int) (jI0000O2 & 4294967295L));
/* 239 */           float fIntBitsToFloat7 = Float.intBitsToFloat((int) (jI0000O4 & 4294967295L));
/* 246 */           float fIntBitsToFloat8 = Float.intBitsToFloat((int) (jI0000O3 & 4294967295L));
/* 276 */           return new OOo0IO(fMin, Math.min(fIntBitsToFloat5, Math.min(fIntBitsToFloat6, Math.min(fIntBitsToFloat7, fIntBitsToFloat8))), fMax, Math.max(fIntBitsToFloat5, Math.max(fIntBitsToFloat6, Math.max(fIntBitsToFloat7, fIntBitsToFloat8))));
                }

                public static final O0iOOo0Ii I0000Il00O(O0iOOo0Ii o0iOOo0Ii) {
                    O0iOOo0Ii o0iOOo0Ii2;
/* 1 */             O0iOOo0Ii o0iOOo0IiI00II0oii1o = o0iOOo0Ii.I00II0oii1o();
                    while (true) {
/* 5 */                 O0iOOo0Ii o0iOOo0Ii3 = o0iOOo0IiI00II0oii1o;
/* 6 */                 o0iOOo0Ii2 = o0iOOo0Ii;
/* 7 */                 o0iOOo0Ii = o0iOOo0Ii3;
/* 8 */                 if (o0iOOo0Ii == null) {
                            break;
                        }
/* 10 */                o0iOOo0IiI00II0oii1o = o0iOOo0Ii.I00II0oii1o();
                    }
/* 23 */            OIIlIII0Ili oIIlIII0Ili = o0iOOo0Ii2 instanceof OIIlIII0Ili ? (OIIlIII0Ili) o0iOOo0Ii2 : null;
/* 24 */            if (oIIlIII0Ili == null) {
/* 26 */                return o0iOOo0Ii2;
                    }
/* 27 */            OIIlIII0Ili oIIlIII0Ili2 = oIIlIII0Ili.I00oli;
                    while (true) {
/* 29 */                OIIlIII0Ili oIIlIII0Ili3 = oIIlIII0Ili2;
/* 30 */                OIIlIII0Ili oIIlIII0Ili4 = oIIlIII0Ili;
/* 31 */                oIIlIII0Ili = oIIlIII0Ili3;
/* 32 */                if (oIIlIII0Ili == null) {
/* 77 */                    return oIIlIII0Ili4;
                        }
/* 34 */                oIIlIII0Ili2 = oIIlIII0Ili.I00oli;
                    }
                }
            }

            package p000;

            import android.graphics.PointF;
            
            public abstract class illiOoIi {
                public static final int I00000oIO(OI0OIIiOi oI0OIIiOi, long j, Oooii1o1 oooii1o1) {
/* 8 */             float fI000II = oooii1o1 != null ? oooii1o1.I000II() : 0.0f;
/* 15 */            int i = (int) (4294967295L & j);
/* 20 */            int iI0000oI00 = oI0OIIiOi.I0000oI00(Float.intBitsToFloat(i));
/* 35 */            if (Float.intBitsToFloat(i) < oI0OIIiOi.I0001Ioi1lo(iI0000oI00) - fI000II || Float.intBitsToFloat(i) > oI0OIIiOi.I00000oOI(iI0000oI00) + fI000II) {
/* 77 */                return -1;
                    }
/* 54 */            int i2 = (int) (j >> 32);
/* 62 */            if (Float.intBitsToFloat(i2) < (-fI000II) || Float.intBitsToFloat(i2) > oI0OIIiOi.I0000O + fI000II) {
/* 77 */                return -1;
                    }
/* 76 */            return iI0000oI00;
                }

                public static final int I00000oOI(O0oIlOolIO o0oIlOolIO, long j, Oooii1o1 oooii1o1) {
                    long jI00IoO0;
                    int iI00000oIO;
/* 1 */             Oo0il0olo1l oo0il0olo1lI0000O = o0oIlOolIO.I0000O();
/* 6 */             if (oo0il0olo1lI0000O != null) {
/* 10 */                OI0OIIiOi oI0OIIiOi = oo0il0olo1lI0000O.I00000oIO.I00000oOI;
/* 12 */                O0iOOo0Ii o0iOOo0IiI0000Il00O = o0oIlOolIO.I0000Il00O();
/* 16 */                if (o0iOOo0IiI0000Il00O != null && (iI00000oIO = I00000oIO(oI0OIIiOi, (jI00IoO0 = o0iOOo0IiI0000Il00O.I00IoO0(j)), oooii1o1)) != -1) {
/* 46 */                    return oI0OIIiOi.I000II(OIOlIiiioi.I00000oOI(jI00IoO0, (oI0OIIiOi.I00000oOI(iI00000oIO) + oI0OIIiOi.I0001Ioi1lo(iI00000oIO)) / 2.0f, 1));
                        }
                    }
/* 5 */             return -1;
                }

                public static final long I0000Il00O(O0oIlOolIO o0oIlOolIO, OOo0IO oOo0IO, int i) {
/* 1 */             OIiilo1Ool0o oIiilo1Ool0o = iolOOiI.I00ioIO;
/* 3 */             Oo0il0olo1l oo0il0olo1lI0000O = o0oIlOolIO.I0000O();
/* 14 */            OI0OIIiOi oI0OIIiOi = oo0il0olo1lI0000O != null ? oo0il0olo1lI0000O.I00000oIO.I00000oOI : null;
/* 15 */            O0iOOo0Ii o0iOOo0IiI0000Il00O = o0oIlOolIO.I0000Il00O();
                    return (oI0OIIiOi == null || o0iOOo0IiI0000Il00O == null) ? Oo0lI00l.I00000oOI : oI0OIIiOi.I000O01llI0(oOo0IO.I000OiO(o0iOOo0IiI0000Il00O.I00IoO0(0L)), i, oIiilo1Ool0o);
                }

                public static final long I0000O(O0oIlOolIO o0oIlOolIO, OOo0IO oOo0IO, OOo0IO oOo0IO2, int i) {
/* 1 */             long jI0000Il00O = I0000Il00O(o0oIlOolIO, oOo0IO, i);
/* 9 */             if (Oo0lI00l.I0000O(jI0000Il00O)) {
/* 11 */                return Oo0lI00l.I00000oOI;
                    }
/* 14 */            long jI0000Il00O2 = I0000Il00O(o0oIlOolIO, oOo0IO2, i);
/* 22 */            if (Oo0lI00l.I0000O(jI0000Il00O2)) {
/* 24 */                return Oo0lI00l.I00000oOI;
                    }
/* 31 */            int i2 = (int) (jI0000Il00O >> 32);
/* 42 */            int i3 = (int) (jI0000Il00O2 & 4294967295L);
/* 47 */            return lOliOi0Oi.I00000oIO(Math.min(i2, i2), Math.max(i3, i3));
                }

                public static final boolean I0000oI00(Oo0iil0o0oI oo0iil0o0oI, int i) {
/* 1 */             OI0OIIiOi oI0OIIiOi = oo0iil0o0oI.I00000oOI;
/* 3 */             int iI0000O = oI0OIIiOi.I0000O(i);
                    return i == oo0iil0o0oI.I000O01llI0(iI0000O) || i == oI0OIIiOi.I0000Il00O(iI0000O, false) ? oo0iil0o0oI.I000OOo1O(i) != oo0iil0o0oI.I00000oIO(i) : oo0iil0o0oI.I00000oIO(i) != oo0iil0o0oI.I00000oIO(i - 1);
                }

                public static final boolean I0001Ioi1lo(int i) {
/* 1 */             int type = Character.getType(i);
                    return type == 23 || type == 20 || type == 22 || type == 30 || type == 29 || type == 24 || type == 21;
                }

                public static final boolean I000II(int i) {
                    return Character.isWhitespace(i) || i == 160;
                }

                public static final boolean I000O01llI0(int i) {
                    int type;
                    return (!I000II(i) || (type = Character.getType(i)) == 14 || type == 13 || i == 10) ? false : true;
                }

                public static final long I000OOo1O(PointF pointF) {
/* 1 */             float f = pointF.x;
/* 3 */             float f2 = pointF.y;
/* 24 */            return (Float.floatToRawIntBits(f) << 32) | (Float.floatToRawIntBits(f2) & 4294967295L);
                }
            }

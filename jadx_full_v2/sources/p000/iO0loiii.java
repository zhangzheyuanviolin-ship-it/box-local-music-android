            package p000;
            
            public abstract class iO0loiii {
                public static final OOo0IO I00000oIO = new OOo0IO(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY);

                public static final boolean I00000oIO(OOo0IO oOo0IO, long j) {
/* 1 */             float f = oOo0IO.I00000oIO;
/* 3 */             float f2 = oOo0IO.I0000Il00O;
/* 10 */            float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
/* 16 */            if (f > fIntBitsToFloat || fIntBitsToFloat > f2) {
/* 47 */                return false;
                    }
/* 22 */            float f3 = oOo0IO.I00000oOI;
/* 24 */            float f4 = oOo0IO.I0000O;
/* 33 */            float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
                    return f3 <= fIntBitsToFloat2 && fIntBitsToFloat2 <= f4;
                }

                public static final long I00000oOI(Oiill0lI1il1 oiill0lI1il1, long j, OiiOOli oiiOOli) {
                    O0iOOo0Ii o0iOOo0IiI0000Il00O;
                    long jI00000oIO;
                    long j2;
                    OI0OIIiOi oI0OIIiOi;
                    int iI0000O;
                    float fI00000oOI;
                    OI0OIIiOi oI0OIIiOi2;
                    int iI0000O2;
                    OI0OIIiOi oI0OIIiOi3;
                    int iI0000O3;
                    float fI00000oOI2;
                    OI0OIIiOi oI0OIIiOi4;
                    int iI0000O4;
/* 7 */             OI0i1o0iOo0 oI0i1o0iOo0I0001Ioi1lo = oiill0lI1il1.I0001Ioi1lo(oiiOOli);
/* 11 */            if (oI0i1o0iOo0I0001Ioi1lo == null) {
/* 299 */               return 9205357640488583168L;
                    }
/* 15 */            Oiii0oI1o oiii0oI1o = oI0i1o0iOo0I0001Ioi1lo.I0000Il00O;
/* 17 */            O0iOOo0Ii o0iOOo0Ii = oiill0lI1il1.I00ll1;
/* 19 */            if (o0iOOo0Ii == null || (o0iOOo0IiI0000Il00O = oI0i1o0iOo0I0001Ioi1lo.I0000Il00O()) == null) {
/* 299 */               return 9205357640488583168L;
                    }
/* 31 */            int i = oiiOOli.I00000oOI;
/* 37 */            Oo0iil0o0oI oo0iil0o0oI = (Oo0iil0o0oI) oiii0oI1o.invoke();
/* 48 */            if (i > (oo0iil0o0oI == null ? 0 : oI0i1o0iOo0I0001Ioi1lo.I00000oOI(oo0iil0o0oI))) {
/* 299 */               return 9205357640488583168L;
                    }
/* 70 */            float fIntBitsToFloat = Float.intBitsToFloat((int) (o0iOOo0IiI0000Il00O.I00IoIO0lI(o0iOOo0Ii, ((OIOlIiiioi) oiill0lI1il1.I00o101lO.getValue()).I00000oIO) >> 32));
/* 78 */            Oo0iil0o0oI oo0iil0o0oI2 = (Oo0iil0o0oI) oiii0oI1o.invoke();
/* 81 */            if (oo0iil0o0oI2 == null) {
/* 83 */                jI00000oIO = Oo0lI00l.I00000oOI;
                    } else {
/* 86 */                OI0OIIiOi oI0OIIiOi5 = oo0iil0o0oI2.I00000oOI;
/* 88 */                int iI00000oOI = oI0i1o0iOo0I0001Ioi1lo.I00000oOI(oo0iil0o0oI2);
/* 92 */                if (iI00000oOI < 1) {
/* 94 */                    jI00000oIO = Oo0lI00l.I00000oOI;
                        } else {
/* 102 */                   int iI0000O5 = oI0OIIiOi5.I0000O(lIiioliIlo.I0000Il00O(i, 0, iI00000oOI - 1));
/* 114 */                   jI00000oIO = lOliOi0Oi.I00000oIO(oo0iil0o0oI2.I000O01llI0(iI0000O5), oI0OIIiOi5.I0000Il00O(iI0000O5, true));
                        }
                    }
/* 124 */           if (Oo0lI00l.I0000O(jI00000oIO)) {
/* 130 */               Oo0iil0o0oI oo0iil0o0oI3 = (Oo0iil0o0oI) oiii0oI1o.invoke();
/* 147 */               fI00000oOI = (oo0iil0o0oI3 != null && (iI0000O4 = (oI0OIIiOi4 = oo0iil0o0oI3.I00000oOI).I0000O(i)) < oI0OIIiOi4.I0001Ioi1lo) ? oo0iil0o0oI3.I0001Ioi1lo(iI0000O4) : -1.0f;
/* 151 */               j2 = 4294967295L;
                    } else {
/* 159 */               j2 = 4294967295L;
/* 166 */               int i2 = (int) (jI00000oIO >> 32);
/* 171 */               Oo0iil0o0oI oo0iil0o0oI4 = (Oo0iil0o0oI) oiii0oI1o.invoke();
/* 188 */               float fI0001Ioi1lo = (oo0iil0o0oI4 != null && (iI0000O2 = (oI0OIIiOi2 = oo0iil0o0oI4.I00000oOI).I0000O(i2)) < oI0OIIiOi2.I0001Ioi1lo) ? oo0iil0o0oI4.I0001Ioi1lo(iI0000O2) : -1.0f;
                        int i3 = ((int) (jI00000oIO & 4294967295L)) - 1;
/* 200 */               Oo0iil0o0oI oo0iil0o0oI5 = (Oo0iil0o0oI) oiii0oI1o.invoke();
/* 217 */               float fI000II = (oo0iil0o0oI5 != null && (iI0000O = (oI0OIIiOi = oo0iil0o0oI5.I00000oOI).I0000O(i3)) < oI0OIIiOi.I0001Ioi1lo) ? oo0iil0o0oI5.I000II(iI0000O) : -1.0f;
/* 229 */               fI00000oOI = lIiioliIlo.I00000oOI(fIntBitsToFloat, Math.min(fI0001Ioi1lo, fI000II), Math.max(fI0001Ioi1lo, fI000II));
                    }
/* 235 */           if (fI00000oOI == -1.0f) {
/* 299 */               return 9205357640488583168L;
                    }
/* 244 */           if (!IooOl0ol01.I0000Il00O(j, 0L) && Math.abs(fIntBitsToFloat - fI00000oOI) > ((int) (j >> 32)) / 2) {
/* 299 */               return 9205357640488583168L;
                    }
/* 265 */           Oo0iil0o0oI oo0iil0o0oI6 = (Oo0iil0o0oI) oiii0oI1o.invoke();
/* 267 */           if (oo0iil0o0oI6 != null && (iI0000O3 = (oI0OIIiOi3 = oo0iil0o0oI6.I00000oOI).I0000O(i)) < oI0OIIiOi3.I0001Ioi1lo) {
/* 282 */               float fI0001Ioi1lo2 = oI0OIIiOi3.I0001Ioi1lo(iI0000O3);
/* 294 */               fI00000oOI2 = ((oI0OIIiOi3.I00000oOI(iI0000O3) - fI0001Ioi1lo2) / 2.0f) + fI0001Ioi1lo2;
                    } else {
/* 269 */               fI00000oOI2 = -1.0f;
                    }
/* 297 */           if (fI00000oOI2 == -1.0f) {
/* 299 */               return 9205357640488583168L;
                    }
/* 320 */           return o0iOOo0Ii.I00IoIO0lI(o0iOOo0IiI0000Il00O, (Float.floatToRawIntBits(fI00000oOI) << 32) | (Float.floatToRawIntBits(fI00000oOI2) & j2));
                }

                public static final OOo0IO I0000Il00O(O0iOOo0Ii o0iOOo0Ii) {
/* 2 */             OOo0IO oOo0IOI00000oOI = l0o0IlOil1.I00000oOI(o0iOOo0Ii, true);
/* 10 */            long jI001lloI = o0iOOo0Ii.I001lloI(oOo0IOI00000oOI.I0000oI00());
/* 14 */            float f = oOo0IOI00000oOI.I0000Il00O;
/* 16 */            float f2 = oOo0IOI00000oOI.I0000O;
/* 38 */            long jI001lloI2 = o0iOOo0Ii.I001lloI((Float.floatToRawIntBits(f) << 32) | (Float.floatToRawIntBits(f2) & 4294967295L));
/* 71 */            return new OOo0IO(Float.intBitsToFloat((int) (jI001lloI >> 32)), Float.intBitsToFloat((int) (jI001lloI & 4294967295L)), Float.intBitsToFloat((int) (jI001lloI2 >> 32)), Float.intBitsToFloat((int) (jI001lloI2 & 4294967295L)));
                }
            }

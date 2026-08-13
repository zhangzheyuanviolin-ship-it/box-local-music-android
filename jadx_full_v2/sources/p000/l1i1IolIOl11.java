            package p000;
            
            public abstract class l1i1IolIOl11 {
                public static final Iii1I01II I00000oIO(Iii1I01II iii1I01II, Iii1I01II iii1I01II2, OiilIIlI00io oiilIIlI00io, long j, OiiOOli oiiOOli) {
/* 1 */             if (oiiOOli == null) {
/* 32 */                return lO1OIiO0i.I00000oOI(iii1I01II, iii1I01II2);
                    }
/* 15 */            int iCompare = oiilIIlI00io.I000II.compare(Long.valueOf(oiiOOli.I0000Il00O), Long.valueOf(j));
                    return iCompare < 0 ? Iii1I01II.I00iOIl : iCompare > 0 ? Iii1I01II.I00iiO : Iii1I01II.I00iiI;
                }

                public static final int I00000oOI(long j, Oo0iil0o0oI oo0iil0o0oI) {
/* 7 */             int i = (int) (4294967295L & j);
/* 15 */            if (Float.intBitsToFloat(i) <= 0.0f) {
/* 17 */                return 0;
                    }
/* 19 */            float fIntBitsToFloat = Float.intBitsToFloat(i);
/* 23 */            OI0OIIiOi oI0OIIiOi = oo0iil0o0oI.I00000oOI;
                    return fIntBitsToFloat >= oI0OIIiOi.I0000oI00 ? oo0iil0o0oI.I00000oIO.I00000oIO.I00iiI.length() : oI0OIIiOi.I000II(j);
                }
            }

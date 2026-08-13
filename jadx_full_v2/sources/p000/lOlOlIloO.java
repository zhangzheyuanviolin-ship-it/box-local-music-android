            package p000;

            import java.util.ArrayList;
            
            public abstract class lOlOlIloO {
                public static final float I00000oIO(Oo0iil0o0oI oo0iil0o0oI, int i) {
/* 1 */             if (i < 0) {
/* 71 */                return 0.0f;
                    }
/* 3 */             Oo0iiO1 oo0iiO1 = oo0iil0o0oI.I00000oIO;
/* 5 */             OI0OIIiOi oI0OIIiOi = oo0iil0o0oI.I00000oOI;
/* 15 */            if (oo0iiO1.I00000oIO.I00iiI.length() == 0) {
/* 71 */                return 0.0f;
                    }
/* 34 */            int iMin = Math.min(oI0OIIiOi.I0000O(i), Math.min(oI0OIIiOi.I00000oOI - 1, oI0OIIiOi.I0001Ioi1lo - 1));
/* 43 */            if (i > oI0OIIiOi.I0000Il00O(iMin, false)) {
/* 71 */                return 0.0f;
                    }
/* 46 */            oI0OIIiOi.I000lI(iMin);
/* 49 */            ArrayList arrayList = oI0OIIiOi.I000O01llI0;
/* 59 */            OIoiIo0o1O oIoiIo0o1O = (OIoiIo0o1O) arrayList.get(l1i1Il1il1.I00000oOI(iMin, arrayList));
/* 66 */            return oIoiIo0o1O.I00000oIO.I0000Il00O(iMin - oIoiIo0o1O.I0000O);
                }
            }

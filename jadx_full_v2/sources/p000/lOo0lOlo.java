            package p000;

            import java.util.List;
            
            public abstract class lOo0lOlo {
                public static final long I00000oIO(OO1Oooio101 oO1Oooio101, boolean z) {
/* 1 */             List list = oO1Oooio101.I00000oIO;
/* 6 */             int size = list.size();
/* 10 */            long jI000II = 0;
/* 13 */            int i = 0;
/* 14 */            for (int i2 = 0; i2 < size; i2++) {
/* 20 */                OO1il00lI oO1il00lI = (OO1il00lI) list.get(i2);
/* 24 */                if (oO1il00lI.I0000O && oO1il00lI.I000O01llI0) {
/* 37 */                    jI000II = OIOlIiiioi.I000II(jI000II, z ? oO1il00lI.I0000Il00O : oO1il00lI.I000II);
/* 41 */                    i++;
                        }
                    }
/* 46 */            if (i == 0) {
/* 48 */                return 9205357640488583168L;
                    }
/* 55 */            return OIOlIiiioi.I0000Il00O(i, jI000II);
                }

                public static final float I00000oOI(OO1Oooio101 oO1Oooio101, boolean z) {
/* 1 */             long jI00000oIO = I00000oIO(oO1Oooio101, z);
/* 14 */            float fI0000oI00 = 0.0f;
/* 15 */            if (OIOlIiiioi.I0000O(jI00000oIO, 9205357640488583168L)) {
/* 14 */                return 0.0f;
                    }
/* 18 */            List list = oO1Oooio101.I00000oIO;
/* 23 */            int size = list.size();
/* 28 */            int i = 0;
/* 29 */            for (int i2 = 0; i2 < size; i2++) {
/* 35 */                OO1il00lI oO1il00lI = (OO1il00lI) list.get(i2);
/* 39 */                if (oO1il00lI.I0000O && oO1il00lI.I000O01llI0) {
/* 61 */                    i++;
/* 60 */                    fI0000oI00 = OIOlIiiioi.I0000oI00(OIOlIiiioi.I0001Ioi1lo(z ? oO1il00lI.I0000Il00O : oO1il00lI.I000II, jI00000oIO)) + fI0000oI00;
                        }
                    }
/* 68 */            return fI0000oI00 / i;
                }
            }

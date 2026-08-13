            package p000;
            
            public abstract class Oi1iliO {
                public static final IOlO1IilOlOl I00000oIO = iiliio0o.I0000Il00O(new Oi1O00OI(3));
                public static final IOlO1IilOlOl I00000oOI = iiliio0o.I0000O(new OOii01Ioi1(10));
                public static final Oi1lioiOilI I0000Il00O;
                public static final Oi1lioiOilI I0000O;

                static {
/* 28 */            long j = IOOiio0i.I000o00OoI0I;
/* 38 */            I0000Il00O = new Oi1lioiOilI(true, Float.NaN, j, null, true);
/* 51 */            I0000O = new Oi1lioiOilI(false, Float.NaN, j, null, true);
                }

                public static Oi1lioiOilI I00000oIO(boolean z, float f, long j, OioOIi1o0I oioOIi1o0I, int i) {
/* 3 */             if ((i & 1) != 0) {
/* 5 */                 z = true;
                    }
/* 6 */             boolean z2 = z;
/* 15 */            float f2 = (i & 2) != 0 ? Float.NaN : f;
/* 18 */            if ((i & 4) != 0) {
/* 20 */                j = IOOiio0i.I000o00OoI0I;
                    }
/* 22 */            long j2 = j;
/* 25 */            if ((i & 8) != 0) {
/* 27 */                oioOIi1o0I = null;
                    }
/* 28 */            OioOIi1o0I oioOIi1o0I2 = oioOIi1o0I;
                    return (Iil1010O.I0000Il00O(f2, Float.NaN) && Ooi0i1.I00000oOI(j2, IOOiio0i.I000o00OoI0I) && oioOIi1o0I2 == null) ? z2 ? I0000Il00O : I0000O : new Oi1lioiOilI(z2, f2, j2, oioOIi1o0I2, true);
                }
            }

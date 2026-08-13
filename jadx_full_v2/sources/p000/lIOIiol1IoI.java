            package p000;

            import java.util.List;
            
            public abstract class lIOIiol1IoI {
                public static final Object I00000oIO(Io000liOIo io000liOIo, Io00Iioo io00Iioo) {
/* 5 */             if (io000liOIo.I000l1(io00Iioo)) {
/* 7 */                 return io000liOIo.I000iOII(io00Iioo);
                    }
/* 12 */            return null;
                }

                public static final Object I00000oOI(Io000liOIo io000liOIo, Io00Iioo io00Iioo, int i) {
/* 1 */             io000liOIo.I00100l0(io00Iioo);
/* 4 */             IlIO0iI10oI ilIO0iI10oI = io000liOIo.I00iOIl;
/* 6 */             Io0010Ill io0010Ill = io00Iioo.I0000O;
/* 8 */             ilIO0iI10oI.getClass();
/* 11 */            Ol1Io01IOiO ol1Io01IOiO = ilIO0iI10oI.I00000oIO;
/* 18 */            if (!io0010Ill.I00iiO) {
/* 68 */                I000II.I000iOII("getRepeatedField() can only be called on repeated fields.");
/* 15 */                return null;
                    }
/* 20 */            Object obj = ol1Io01IOiO.get(io0010Ill);
/* 34 */            if (i < (obj == null ? 0 : ((List) obj).size())) {
/* 36 */                io000liOIo.I00100l0(io00Iioo);
/* 41 */                if (io0010Ill.I00iiO) {
/* 43 */                    Object obj2 = ol1Io01IOiO.get(io0010Ill);
/* 47 */                    if (obj2 != null) {
/* 55 */                        return io00Iioo.I00000oIO(((List) obj2).get(i));
                            }
/* 60 */                    OoOil11Ol1o.I001i1lo1io();
/* 15 */                    return null;
                        }
/* 64 */                I000II.I000iOII("getRepeatedField() can only be called on repeated fields.");
                    }
/* 15 */            return null;
                }
            }

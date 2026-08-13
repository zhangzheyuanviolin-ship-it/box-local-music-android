            package p000;
            
            public final class OoiO0li {
                public static OoiO0I1O1II I00000oIO(Object obj) {
/* 1 */             Io00Io0IO11 io00Io0IO11 = (Io00Io0IO11) obj;
/* 3 */             OoiO0I1O1II ooiO0I1O1II = io00Io0IO11.unknownFields;
/* 7 */             if (ooiO0I1O1II != OoiO0I1O1II.I0001Ioi1lo) {
/* 49 */                return ooiO0I1O1II;
                    }
/* 9 */             OoiO0I1O1II ooiO0I1O1III0000Il00O = OoiO0I1O1II.I0000Il00O();
/* 13 */            io00Io0IO11.unknownFields = ooiO0I1O1III0000Il00O;
/* 49 */            return ooiO0I1O1III0000Il00O;
                }

                public static boolean I00000oOI(Object obj, IOOOi1 iOOOi1) throws O000lI0, O000oiiiOI0, O000o1i {
/* 3 */             IOOOI0 ioooi0 = (IOOOI0) iOOOi1.I0000oI00;
/* 5 */             int i = iOOOi1.I00000oOI;
/* 7 */             int i2 = i >>> 3;
/* 9 */             int i3 = i & 7;
/* 14 */            if (i3 == 0) {
/* 133 */               iOOOi1.I00ilI0I1(0);
/* 148 */               ((OoiO0I1O1II) obj).I0000O(i2 << 3, Long.valueOf(ioooi0.I001i1O0Ol()));
/* 12 */                return true;
                    }
/* 16 */            if (i3 == 1) {
/* 113 */               iOOOi1.I00ilI0I1(1);
/* 129 */               ((OoiO0I1O1II) obj).I0000O((i2 << 3) | 1, Long.valueOf(ioooi0.I00111O()));
/* 12 */                return true;
                    }
/* 19 */            if (i3 == 2) {
/* 109 */               ((OoiO0I1O1II) obj).I0000O((i2 << 3) | 2, iOOOi1.I0010I0i());
/* 12 */                return true;
                    }
/* 21 */            if (i3 != 3) {
/* 24 */                if (i3 == 4) {
/* 11 */                    return false;
                        }
/* 27 */                if (i3 != 5) {
/* 53 */                    throw O000oiiiOI0.I0000Il00O();
                        }
/* 29 */                iOOOi1.I00ilI0I1(5);
/* 45 */                ((OoiO0I1O1II) obj).I0000O((i2 << 3) | 5, Integer.valueOf(ioooi0.I0010o()));
/* 12 */                return true;
                    }
/* 55 */            OoiO0I1O1II ooiO0I1O1III0000Il00O = OoiO0I1O1II.I0000Il00O();
/* 59 */            int i4 = i2 << 3;
/* 61 */            int i5 = i4 | 4;
/* 70 */            while (iOOOi1.I0000O() != Integer.MAX_VALUE && I00000oOI(ooiO0I1O1III0000Il00O, iOOOi1)) {
                    }
/* 80 */            if (i5 != iOOOi1.I00000oOI) {
/* 99 */                throw new O000oiiiOI0("Protocol message end-group tag did not match expected tag.");
                    }
/* 82 */            ooiO0I1O1III0000Il00O.I0000oI00 = false;
/* 88 */            ((OoiO0I1O1II) obj).I0000O(i4 | 3, ooiO0I1O1III0000Il00O);
/* 12 */            return true;
                }
            }

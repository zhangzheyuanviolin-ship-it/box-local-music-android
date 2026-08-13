            package p000;
            
            public final class OoiO0oloIiI {
                public static OoiO0l I00000oIO(Object obj) {
/* 1 */             Io00l0 io00l0 = (Io00l0) obj;
/* 3 */             OoiO0l ooiO0l = io00l0.unknownFields;
/* 7 */             if (ooiO0l != OoiO0l.I0001Ioi1lo) {
/* 29 */                return ooiO0l;
                    }
/* 19 */            OoiO0l ooiO0l2 = new OoiO0l(0, new int[8], new Object[8], true);
/* 22 */            io00l0.unknownFields = ooiO0l2;
/* 29 */            return ooiO0l2;
                }

                public static boolean I00000oOI(int i, IOOOi1 iOOOi1, Object obj) throws O000illO, O000lI0, O0011oo {
/* 1 */             int i2 = iOOOi1.I00000oOI;
/* 5 */             IOOOI0 ioooi0 = (IOOOI0) iOOOi1.I0000oI00;
/* 7 */             int i3 = i2 >>> 3;
/* 9 */             int i4 = i2 & 7;
/* 14 */            if (i4 == 0) {
/* 157 */               iOOOi1.I00ilI0I1(0);
/* 172 */               ((OoiO0l) obj).I0000Il00O(i3 << 3, Long.valueOf(ioooi0.I001i1O0Ol()));
/* 12 */                return true;
                    }
/* 16 */            if (i4 == 1) {
/* 137 */               iOOOi1.I00ilI0I1(1);
/* 153 */               ((OoiO0l) obj).I0000Il00O((i3 << 3) | 1, Long.valueOf(ioooi0.I00111O()));
/* 12 */                return true;
                    }
/* 19 */            if (i4 == 2) {
/* 133 */               ((OoiO0l) obj).I0000Il00O((i3 << 3) | 2, iOOOi1.I00100o1O0lo());
/* 12 */                return true;
                    }
/* 21 */            if (i4 != 3) {
/* 24 */                if (i4 == 4) {
/* 11 */                    return false;
                        }
/* 27 */                if (i4 != 5) {
/* 53 */                    throw O0011oo.I00000oOI();
                        }
/* 29 */                iOOOi1.I00ilI0I1(5);
/* 45 */                ((OoiO0l) obj).I0000Il00O(5 | (i3 << 3), Integer.valueOf(ioooi0.I0010o()));
/* 12 */                return true;
                    }
/* 63 */            OoiO0l ooiO0l = new OoiO0l(0, new int[8], new Object[8], true);
/* 66 */            int i5 = i3 << 3;
/* 68 */            int i6 = i5 | 4;
/* 70 */            int i7 = i + 1;
/* 73 */            if (i7 >= 100) {
/* 123 */               throw new O0011oo("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
                    }
/* 82 */            while (iOOOi1.I0000O() != Integer.MAX_VALUE && I00000oOI(i7, iOOOi1, ooiO0l)) {
                    }
/* 92 */            if (i6 != iOOOi1.I00000oOI) {
/* 115 */               throw new O0011oo("Protocol message end-group tag did not match expected tag.");
                    }
/* 96 */            if (ooiO0l.I0000oI00) {
/* 98 */                ooiO0l.I0000oI00 = false;
                    }
/* 104 */           ((OoiO0l) obj).I0000Il00O(i5 | 3, ooiO0l);
/* 12 */            return true;
                }
            }

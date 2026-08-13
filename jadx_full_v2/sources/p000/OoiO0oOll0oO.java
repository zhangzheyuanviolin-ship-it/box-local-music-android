            package p000;
            
            public final class OoiO0oOll0oO {
                public static OoiO0IO0il I00000oIO(Object obj) {
/* 1 */             Io00Ol1o10O io00Ol1o10O = (Io00Ol1o10O) obj;
/* 3 */             OoiO0IO0il ooiO0IO0il = io00Ol1o10O.unknownFields;
/* 7 */             if (ooiO0IO0il != OoiO0IO0il.I0001Ioi1lo) {
/* 49 */                return ooiO0IO0il;
                    }
/* 19 */            OoiO0IO0il ooiO0IO0il2 = new OoiO0IO0il(0, new int[8], new Object[8], true);
/* 22 */            io00Ol1o10O.unknownFields = ooiO0IO0il2;
/* 49 */            return ooiO0IO0il2;
                }

                public static boolean I00000oOI(int i, IOOOi1 iOOOi1, Object obj) throws O000illO, O0010I0o, O000o1i {
/* 3 */             IOOOIO1O ioooio1o = (IOOOIO1O) iOOOi1.I0000oI00;
/* 5 */             int i2 = iOOOi1.I00000oOI;
/* 7 */             int i3 = i2 >>> 3;
/* 9 */             int i4 = i2 & 7;
/* 14 */            if (i4 == 0) {
/* 165 */               iOOOi1.I00ilI0I1(0);
/* 180 */               ((OoiO0IO0il) obj).I0000Il00O(i3 << 3, Long.valueOf(ioooio1o.I000o00OoI0I()));
/* 12 */                return true;
                    }
/* 16 */            if (i4 == 1) {
/* 145 */               iOOOi1.I00ilI0I1(1);
/* 161 */               ((OoiO0IO0il) obj).I0000Il00O((i3 << 3) | 1, Long.valueOf(ioooio1o.I000iOII()));
/* 12 */                return true;
                    }
/* 19 */            if (i4 == 2) {
/* 141 */               ((OoiO0IO0il) obj).I0000Il00O((i3 << 3) | 2, iOOOi1.I00100l0());
/* 12 */                return true;
                    }
/* 23 */            if (i4 != 3) {
/* 26 */                if (i4 == 4) {
/* 56 */                    if (i != 0) {
/* 11 */                        return false;
                            }
/* 64 */                    throw new O0010I0o("Protocol message end-group tag did not match expected tag.");
                        }
/* 29 */                if (i4 != 5) {
/* 55 */                    throw O0010I0o.I00000oOI();
                        }
/* 31 */                iOOOi1.I00ilI0I1(5);
/* 47 */                ((OoiO0IO0il) obj).I0000Il00O(5 | (i3 << 3), Integer.valueOf(ioooio1o.I000OiO()));
/* 12 */                return true;
                    }
/* 73 */            OoiO0IO0il ooiO0IO0il = new OoiO0IO0il(0, new int[8], new Object[8], true);
/* 76 */            int i5 = i3 << 3;
/* 78 */            int i6 = i5 | 4;
/* 80 */            int i7 = i + 1;
/* 83 */            if (i7 >= 100) {
/* 131 */               throw new O0010I0o("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
                    }
/* 92 */            while (iOOOi1.I0000O() != Integer.MAX_VALUE && I00000oOI(i7, iOOOi1, ooiO0IO0il)) {
                    }
/* 102 */           if (i6 != iOOOi1.I00000oOI) {
/* 123 */               throw new O0010I0o("Protocol message end-group tag did not match expected tag.");
                    }
/* 106 */           if (ooiO0IO0il.I0000oI00) {
/* 108 */               ooiO0IO0il.I0000oI00 = false;
                    }
/* 114 */           ((OoiO0IO0il) obj).I0000Il00O(i5 | 3, ooiO0IO0il);
/* 12 */            return true;
                }
            }

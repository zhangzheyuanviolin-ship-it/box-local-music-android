            package p000;
            
            public abstract class iO1i0iI {
                public static final char[] I00000oIO = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

                public static final void I00000oIO(long j, long j2, long j3) {
/* 7 */             if (j2 < 0 || j3 > j) {
/* 46 */                StringBuilder sbI001iOo1i0O = Oi010OO0.I001iOo1i0O(j2, "startIndex (", ") and endIndex (");
/* 50 */                sbI001iOo1i0O.append(j3);
/* 55 */                sbI001iOo1i0O.append(") are not within the range [0..size(");
/* 58 */                sbI001iOo1i0O.append(j);
/* 63 */                sbI001iOo1i0O.append("))");
/* 215 */               throw new IndexOutOfBoundsException(sbI001iOo1i0O.toString());
                    }
/* 15 */            if (j2 <= j3) {
/* 17 */                return;
                    }
/* 22 */            StringBuilder sbI001iOo1i0O2 = Oi010OO0.I001iOo1i0O(j2, "startIndex (", ") > endIndex (");
/* 26 */            sbI001iOo1i0O2.append(j3);
/* 31 */            sbI001iOo1i0O2.append(')');
/* 41 */            throw new IllegalArgumentException(sbI001iOo1i0O2.toString());
                }

                public static final void I00000oOI(long j, long j2) {
/* 5 */             if (0 > j || j < j2 || j2 < 0) {
/* 30 */                I000II.I000iOII(IlIi0I0.I000o00OoI0I(Oi010OO0.I001iOo1i0O(j2, "offset (0) and byteCount (", ") are not within the range [0..size("), j, "))"));
                    }
                }
            }

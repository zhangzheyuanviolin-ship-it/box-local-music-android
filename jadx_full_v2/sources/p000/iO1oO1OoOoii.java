            package p000;
            
            public abstract class iO1oO1OoOoii {
                public static final boolean I00000oIO(byte[] bArr, int i, byte[] bArr2, int i2, int i3) {
/* 3 */             for (int i4 = 0; i4 < i3; i4++) {
/* 13 */                if (bArr[i4 + i] != bArr2[i4 + i2]) {
/* 1 */                     return false;
                        }
                    }
/* 19 */            return true;
                }

                public static final void I00000oOI(long j, long j2, long j3) {
/* 7 */             if ((j2 | j3) < 0 || j2 > j || j - j2 < j3) {
/* 26 */                StringBuilder sbI001iOo1i0O = Oi010OO0.I001iOo1i0O(j, "size=", " offset=");
/* 30 */                sbI001iOo1i0O.append(j2);
/* 35 */                sbI001iOo1i0O.append(" byteCount=");
/* 38 */                sbI001iOo1i0O.append(j3);
/* 215 */               throw new ArrayIndexOutOfBoundsException(sbI001iOo1i0O.toString());
                    }
                }

                public static final String I0000Il00O(int i) {
/* 1 */             if (i == 0) {
/* 3 */                 return OIllioIilO.I01OO1I;
                    }
/* 6 */             char[] cArr = I0lllI01iooo.I00000oIO;
/* 58 */            int i2 = 0;
/* 56 */            char[] cArr2 = {cArr[(i >> 28) & 15], cArr[(i >> 24) & 15], cArr[(i >> 20) & 15], cArr[(i >> 16) & 15], cArr[(i >> 12) & 15], cArr[(i >> 8) & 15], cArr[(i >> 4) & 15], cArr[i & 15]};
/* 82 */            while (i2 < 8 && cArr2[i2] == '0') {
/* 90 */                i2++;
                    }
/* 93 */            iOI0OiiiOl1.I00000oIO(i2, 8, 8);
/* 100 */           return new String(cArr2, i2, 8 - i2);
                }
            }

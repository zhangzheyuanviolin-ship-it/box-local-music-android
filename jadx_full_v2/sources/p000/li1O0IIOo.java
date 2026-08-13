            package p000;
            
            public abstract class li1O0IIOo {
                public static final void I00000oIO(long j, byte[] bArr, int i, int i2, int i3) {
/* 1 */             int i4 = 7 - i2;
/* 3 */             int i5 = 8 - i3;
/* 5 */             if (i5 > i4) {
/* 966 */               return;
                    }
                    while (true) {
/* 17 */                int i6 = Io1i1io.I00000oIO[(int) ((j >> (i4 << 3)) & 255)];
/* 19 */                int i7 = i + 1;
/* 24 */                bArr[i] = (byte) (i6 >> 8);
/* 26 */                i += 2;
/* 29 */                bArr[i7] = (byte) i6;
/* 31 */                if (i4 == i5) {
/* 966 */                   return;
                        } else {
                            i4--;
                        }
                    }
                }

                public static final long I00000oOI(int i, byte[] bArr) {
/* 76 */            return (bArr[i + 7] & 255) | ((bArr[i] & 255) << 56) | ((bArr[i + 1] & 255) << 48) | ((bArr[i + 2] & 255) << 40) | ((bArr[i + 3] & 255) << 32) | ((bArr[i + 4] & 255) << 24) | ((bArr[i + 5] & 255) << 16) | ((bArr[i + 6] & 255) << 8);
                }

                public static final Oollooi1l I0000Il00O() {
/* 3 */             byte[] bArr = new byte[16];
/* 7 */             Oii0IlIlO.I00000oIO.nextBytes(bArr);
/* 15 */            byte b = (byte) (bArr[6] & 15);
/* 16 */            bArr[6] = b;
/* 21 */            bArr[6] = (byte) (b | 64);
/* 29 */            byte b2 = (byte) (bArr[8] & 63);
/* 30 */            bArr[8] = b2;
/* 35 */            bArr[8] = (byte) (b2 | 128);
/* 38 */            long jI00000oOI = I00000oOI(0, bArr);
/* 42 */            long jI00000oOI2 = I00000oOI(8, bArr);
                    return (jI00000oOI == 0 && jI00000oOI2 == 0) ? Oollooi1l.I00iiO : new Oollooi1l(jI00000oOI, jI00000oOI2);
                }

                public static final void I0000O(String str, int i, String str2) {
/* 9 */             StringBuilder sbI00111O = IIlIOloOOO.I00111O(i, "Expected ", str2, " at index ", ", but was '");
/* 17 */            sbI00111O.append(str.charAt(i));
/* 22 */            sbI00111O.append('\'');
/* 215 */           throw new IllegalArgumentException(sbI00111O.toString());
                }
            }

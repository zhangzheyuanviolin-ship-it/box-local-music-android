            package p000;

            import java.lang.invoke.VarHandle;
            
            public abstract class lOooIO1I1I {
                public static final Ooi01Oi0II I00000oIO(String str) {
                    int i;
/* 3 */             iOlI1lIi0.I00000oIO(10);
/* 6 */             int length = str.length();
/* 10 */            if (length == 0) {
/* 81 */                return null;
                    }
/* 13 */            int i2 = 0;
/* 14 */            char cCharAt = str.charAt(0);
/* 24 */            if (O0000Ioio00.I0000oI00(cCharAt, 48) < 0) {
/* 26 */                i = 1;
/* 27 */                if (length == 1 || cCharAt != '+') {
/* 81 */                    return null;
                        }
                    } else {
/* 34 */                i = 0;
                    }
/* 38 */            int iDivideUnsigned = 119304647;
/* 39 */            while (i < length) {
/* 45 */                int iDigit = Character.digit((int) str.charAt(i), 10);
/* 49 */                if (iDigit < 0) {
/* 81 */                    return null;
                        }
/* 56 */                if (Integer.compareUnsigned(i2, iDivideUnsigned) > 0) {
/* 58 */                    if (iDivideUnsigned != 119304647) {
/* 81 */                        return null;
                            }
/* 61 */                    iDivideUnsigned = Integer.divideUnsigned(-1, 10);
/* 69 */                    if (Integer.compareUnsigned(i2, iDivideUnsigned) > 0) {
/* 81 */                        return null;
                            }
                        }
/* 72 */                int i3 = i2 * 10;
/* 74 */                int i4 = iDigit + i3;
/* 79 */                if (Integer.compareUnsigned(i4, i3) < 0) {
/* 81 */                    return null;
                        }
/* 83 */                i++;
/* 85 */                i2 = i4;
                    }
/* 89 */            Ooi01Oi0II ooi01Oi0II = new Ooi01Oi0II();
/* 92 */            ooi01Oi0II.I00iOIl = i2;
/* 94 */            VarHandle.storeStoreFence();
/* 186 */           return ooi01Oi0II;
                }

                public static final Ooi0i1 I00000oOI(String str) {
/* 3 */             iOlI1lIi0.I00000oIO(10);
/* 6 */             int length = str.length();
/* 10 */            if (length == 0) {
/* 95 */                return null;
                    }
/* 13 */            int i = 0;
/* 14 */            char cCharAt = str.charAt(0);
/* 24 */            if (O0000Ioio00.I0000oI00(cCharAt, 48) < 0) {
/* 26 */                i = 1;
/* 27 */                if (length == 1 || cCharAt != '+') {
/* 95 */                    return null;
                        }
                    }
/* 39 */            long j = 0;
/* 41 */            long jDivideUnsigned = 512409557603043100L;
/* 42 */            while (i < length) {
/* 48 */                int iDigit = Character.digit((int) str.charAt(i), 10);
/* 52 */                if (iDigit < 0) {
/* 95 */                    return null;
                        }
/* 61 */                if (Long.compareUnsigned(j, jDivideUnsigned) > 0) {
/* 65 */                    if (jDivideUnsigned != 512409557603043100L) {
/* 95 */                        return null;
                            }
/* 69 */                    jDivideUnsigned = Long.divideUnsigned(-1L, 10L);
/* 77 */                    if (Long.compareUnsigned(j, jDivideUnsigned) > 0) {
/* 95 */                        return null;
                            }
                        }
/* 80 */                long j2 = j * 10;
/* 88 */                long j3 = (iDigit & 4294967295L) + j2;
/* 93 */                if (Long.compareUnsigned(j3, j2) < 0) {
/* 95 */                    return null;
                        }
/* 97 */                i++;
/* 99 */                j = j3;
                    }
/* 101 */           return Ooi0i1.I00000oIO(j);
                }
            }

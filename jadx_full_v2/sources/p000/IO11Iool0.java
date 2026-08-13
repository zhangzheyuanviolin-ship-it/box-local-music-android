            package p000;
            
            public final class IO11Iool0 {
                public static final char[] I00000oIO = new char[117];
                public static final byte[] I00000oOI = new byte[126];

                static {
/* 17 */            for (int i = 0; i < 32; i++) {
                    }
/* 26 */            I00000oIO('b', 8);
/* 33 */            I00000oIO('t', 9);
/* 40 */            I00000oIO('n', 10);
/* 47 */            I00000oIO('f', 12);
/* 54 */            I00000oIO('r', 13);
/* 59 */            I00000oIO('/', 47);
/* 64 */            I00000oIO('\"', 34);
/* 69 */            I00000oIO('\\', 92);
/* 72 */            byte[] bArr = I00000oOI;
/* 76 */            for (int i2 = 0; i2 < 33; i2++) {
/* 80 */                bArr[i2] = Byte.MAX_VALUE;
                    }
/* 86 */            bArr[9] = 3;
/* 88 */            bArr[10] = 3;
/* 90 */            bArr[13] = 3;
/* 92 */            bArr[32] = 3;
/* 97 */            bArr[44] = 4;
/* 102 */           bArr[58] = 5;
/* 107 */           bArr[123] = 6;
/* 112 */           bArr[125] = 7;
/* 116 */           bArr[91] = 8;
/* 120 */           bArr[93] = 9;
/* 123 */           bArr[34] = 1;
/* 126 */           bArr[92] = 2;
                }

                public static void I00000oIO(char c, int i) {
/* 3 */             if (c != 'u') {
/* 8 */                 I00000oIO[c] = (char) i;
                    }
                }
            }

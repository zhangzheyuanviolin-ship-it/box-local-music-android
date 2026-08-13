            package p000;

            import java.util.Arrays;
            
            public abstract class lI1lO10O0i {
                public static byte[] I00000oIO(byte[] bArr, byte[] bArr2) {
/* 8 */             if (bArr.length != 32) {
/* 539 */               I000II.I000iOII("The key length in bytes must be 32.");
/* 542 */               return null;
                    }
/* 18 */            long jI00000oOI = I00000oOI(0, bArr) & 67108863;
/* 19 */            int i = 3;
/* 29 */            long jI00000oOI2 = (I00000oOI(3, bArr) >> 2) & 67108611;
/* 40 */            long jI00000oOI3 = (I00000oOI(6, bArr) >> 4) & 67092735;
/* 55 */            long jI00000oOI4 = (I00000oOI(9, bArr) >> 6) & 66076671;
/* 72 */            long jI00000oOI5 = (I00000oOI(12, bArr) >> 8) & 1048575;
/* 76 */            long j = jI00000oOI2 * 5;
/* 78 */            long j2 = jI00000oOI3 * 5;
/* 80 */            long j3 = jI00000oOI4 * 5;
/* 82 */            long j4 = jI00000oOI5 * 5;
/* 90 */            byte[] bArr3 = new byte[17];
/* 92 */            long j5 = 0;
/* 96 */            long j6 = 0;
/* 98 */            long j7 = 0;
/* 100 */           long j8 = 0;
/* 102 */           long j9 = 0;
/* 104 */           int i2 = 0;
/* 112 */           while (i2 < bArr2.length) {
/* 116 */               int iMin = Math.min(16, bArr2.length - i2);
/* 120 */               System.arraycopy(bArr2, i2, bArr3, 0, iMin);
/* 125 */               bArr3[iMin] = 1;
/* 127 */               if (iMin != 16) {
/* 131 */                   Arrays.fill(bArr3, iMin + 1, 17, (byte) 0);
                        }
/* 140 */               long jI00000oOI6 = j9 + (I00000oOI(0, bArr3) & 67108863);
/* 150 */               long jI00000oOI7 = j5 + ((I00000oOI(i, bArr3) >> 2) & 67108863);
/* 160 */               long jI00000oOI8 = j6 + ((I00000oOI(6, bArr3) >> 4) & 67108863);
/* 172 */               long jI00000oOI9 = j7 + ((I00000oOI(9, bArr3) >> 6) & 67108863);
/* 188 */               long j10 = jI00000oOI2;
/* 193 */               long jI00000oOI10 = j8 + (((I00000oOI(12, bArr3) >> 8) & 67108863) | (bArr3[16] << 24));
/* 211 */               long j11 = (jI00000oOI10 * j) + (jI00000oOI9 * j2) + (jI00000oOI8 * j3) + (jI00000oOI7 * j4) + (jI00000oOI6 * jI00000oOI);
/* 229 */               long j12 = (jI00000oOI10 * j2) + (jI00000oOI9 * j3) + (jI00000oOI8 * j4) + (jI00000oOI7 * jI00000oOI) + (jI00000oOI6 * j10);
/* 247 */               long j13 = (jI00000oOI10 * j3) + (jI00000oOI9 * j4) + (jI00000oOI8 * jI00000oOI) + (jI00000oOI7 * j10) + (jI00000oOI6 * jI00000oOI3);
/* 265 */               long j14 = (jI00000oOI10 * j4) + (jI00000oOI9 * jI00000oOI) + (jI00000oOI8 * j10) + (jI00000oOI7 * jI00000oOI3) + (jI00000oOI6 * jI00000oOI4);
/* 277 */               long j15 = jI00000oOI9 * j10;
/* 281 */               long j16 = jI00000oOI10 * jI00000oOI;
/* 289 */               long j17 = j12 + (j11 >> 26);
/* 295 */               long j18 = j13 + (j17 >> 26);
/* 301 */               long j19 = j14 + (j18 >> 26);
/* 307 */               long j20 = j16 + j15 + (jI00000oOI8 * jI00000oOI3) + (jI00000oOI7 * jI00000oOI4) + (jI00000oOI6 * jI00000oOI5) + (j19 >> 26);
/* 309 */               long j21 = j20 >> 26;
/* 311 */               j8 = j20 & 67108863;
/* 315 */               long j22 = (j21 * 5) + (j11 & 67108863);
/* 323 */               i2 += 16;
/* 299 */               j6 = j18 & 67108863;
/* 305 */               j7 = j19 & 67108863;
/* 319 */               j9 = j22 & 67108863;
/* 321 */               j5 = (j17 & 67108863) + (j22 >> 26);
/* 335 */               jI00000oOI2 = j10;
/* 337 */               i = 3;
                    }
/* 344 */           long j23 = j6 + (j5 >> 26);
/* 348 */           long j24 = j23 & 67108863;
/* 350 */           long j25 = j7 + (j23 >> 26);
/* 354 */           long j26 = j25 & 67108863;
/* 356 */           long j27 = j8 + (j25 >> 26);
/* 360 */           long j28 = j27 & 67108863;
/* 364 */           long j29 = ((j27 >> 26) * 5) + j9;
/* 366 */           long j30 = j29 >> 26;
/* 368 */           long j31 = j29 & 67108863;
/* 370 */           long j32 = (j5 & 67108863) + j30;
/* 372 */           long j33 = j31 + 5;
/* 376 */           long j34 = j33 & 67108863;
/* 378 */           long j35 = j32 + (j33 >> 26);
/* 384 */           long j36 = j24 + (j35 >> 26);
/* 390 */           long j37 = j26 + (j36 >> 26);
/* 394 */           long j38 = j37 & 67108863;
/* 401 */           long j39 = (j28 + (j37 >> 26)) - 67108864;
/* 408 */           long j40 = j39 >> 63;
/* 410 */           long j41 = j31 & j40;
/* 411 */           long j42 = j32 & j40;
/* 412 */           long j43 = j24 & j40;
/* 413 */           long j44 = j26 & j40;
/* 414 */           long j45 = j28 & j40;
/* 416 */           long j46 = ~j40;
/* 423 */           long j47 = j42 | (j35 & 67108863 & j46);
/* 427 */           long j48 = j43 | (j36 & 67108863 & j46);
/* 431 */           long j49 = j44 | (j38 & j46);
/* 446 */           long j50 = (j41 | (j34 & j46) | (j47 << 26)) & 4294967295L;
/* 454 */           long j51 = ((j47 >> 6) | (j48 << 20)) & 4294967295L;
/* 465 */           long j52 = ((j48 >> 12) | (j49 << 14)) & 4294967295L;
/* 473 */           long j53 = ((j49 >> 18) | ((j45 | (j39 & j46)) << 8)) & 4294967295L;
/* 479 */           long jI00000oOI11 = I00000oOI(16, bArr) + j50;
/* 480 */           long j54 = jI00000oOI11 & 4294967295L;
/* 489 */           long jI00000oOI12 = I00000oOI(20, bArr) + j51 + (jI00000oOI11 >> 32);
/* 501 */           long jI00000oOI13 = I00000oOI(24, bArr) + j52 + (jI00000oOI12 >> 32);
/* 514 */           long jI00000oOI14 = (I00000oOI(28, bArr) + j53 + (jI00000oOI13 >> 32)) & 4294967295L;
/* 516 */           byte[] bArr4 = new byte[16];
/* 518 */           I0000Il00O(bArr4, j54, 0);
/* 523 */           I0000Il00O(bArr4, jI00000oOI12 & 4294967295L, 4);
/* 528 */           I0000Il00O(bArr4, jI00000oOI13 & 4294967295L, 8);
/* 533 */           I0000Il00O(bArr4, jI00000oOI14, 12);
/* 536 */           return bArr4;
                }

                public static long I00000oOI(int i, byte[] bArr) {
/* 38 */            return (((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16)) & 4294967295L;
                }

                public static void I0000Il00O(byte[] bArr, long j, int i) {
/* 1 */             int i2 = 0;
/* 3 */             while (i2 < 4) {
/* 12 */                bArr[i + i2] = (byte) (255 & j);
/* 14 */                i2++;
/* 18 */                j >>= 8;
                    }
                }
            }

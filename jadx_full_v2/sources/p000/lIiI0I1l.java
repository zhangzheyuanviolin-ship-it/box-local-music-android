            package p000;

            import java.nio.charset.StandardCharsets;
            
            public abstract class lIiI0I1l {
                public static String I00000oIO(byte[] bArr, byte[][] bArr2, int i) {
                    int i2;
                    boolean z;
                    int i3;
                    int i4;
/* 5 */             int length = bArr.length;
/* 6 */             int i5 = 0;
/* 7 */             while (i5 < length) {
/* 11 */                int i6 = (i5 + length) / 2;
/* 16 */                while (i6 > -1 && bArr[i6] != 10) {
                            i6--;
                        }
/* 25 */                int i7 = i6 + 1;
/* 28 */                int i8 = 1;
                        while (true) {
/* 29 */                    i2 = i7 + i8;
/* 33 */                    if (bArr[i2] == 10) {
                                break;
                            }
/* 35 */                    i8++;
                        }
/* 38 */                int i9 = i2 - i7;
/* 40 */                int i10 = i;
/* 42 */                boolean z2 = false;
/* 43 */                int i11 = 0;
/* 44 */                int i12 = 0;
                        while (true) {
/* 45 */                    if (z2) {
/* 47 */                        i3 = 46;
/* 49 */                        z = false;
                            } else {
/* 53 */                        byte b = bArr2[i10][i11];
/* 55 */                        byte[] bArr3 = OollIoI001lo.I00000oIO;
/* 57 */                        int i13 = b & 255;
/* 61 */                        z = z2;
/* 62 */                        i3 = i13;
                            }
/* 66 */                    byte b2 = bArr[i7 + i12];
/* 68 */                    byte[] bArr4 = OollIoI001lo.I00000oIO;
/* 72 */                    i4 = i3 - (b2 & 255);
/* 73 */                    if (i4 != 0) {
                                break;
                            }
/* 75 */                    i12++;
/* 77 */                    i11++;
/* 79 */                    if (i12 == i9) {
                                break;
                            }
/* 84 */                    if (bArr2[i10].length != i11) {
/* 96 */                        z2 = z;
                            } else {
/* 88 */                        if (i10 == bArr2.length - 1) {
                                    break;
                                }
/* 91 */                        i10++;
/* 93 */                        i11 = -1;
/* 94 */                        z2 = true;
                            }
                        }
/* 98 */                if (i4 >= 0) {
/* 102 */                   if (i4 <= 0) {
/* 107 */                       int i14 = i9 - i12;
/* 112 */                       int length2 = bArr2[i10].length - i11;
/* 115 */                       int length3 = bArr2.length;
/* 116 */                       for (int i15 = i10 + 1; i15 < length3; i15++) {
/* 121 */                           length2 += bArr2[i15].length;
                                }
/* 125 */                       if (length2 >= i14) {
/* 128 */                           if (length2 <= i14) {
/* 135 */                               return new String(bArr, i7, i9, StandardCharsets.UTF_8);
                                    }
                                }
                            }
/* 104 */                   i5 = i2 + 1;
                        }
/* 100 */               length = i6;
                    }
/* 139 */           return null;
                }
            }

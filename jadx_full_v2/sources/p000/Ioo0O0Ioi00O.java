            package p000;

            import java.security.InvalidKeyException;
            import java.util.Arrays;
            
            public final class Ioo0O0Ioi00O extends IOOOI0 {
                public final int I0000Il00O;

                public Ioo0O0Ioi00O(byte[] bArr, int i, int i2) throws InvalidKeyException {
/* 1 */             this.I0000Il00O = i2;
/* 9 */             if (bArr.length != 32) {
/* 215 */               throw new InvalidKeyException("The key length in bytes must be 32.");
                    }
/* 15 */            this.I00000oOI = IO0oi1.I0000Il00O(bArr);
/* 17 */            this.I00000oIO = i;
                }

                @Override
                public final int[] I0000Il00O(int[] iArr, int i) {
                    switch (this.I0000Il00O) {
                        case 0:
/* 126 */                   if (iArr.length != 3) {
/* 164 */                       OIiilo1Ool0o.I000l1("ChaCha20 uses 96-bit nonces, but got a %d-bit nonce", new Object[]{Integer.valueOf(iArr.length * 32)});
                                break;
                            } else {
/* 128 */                       int[] iArr2 = new int[16];
/* 132 */                       int[] iArr3 = (int[]) this.I00000oOI;
/* 134 */                       int[] iArr4 = IO0oi1.I00000oIO;
/* 137 */                       System.arraycopy(iArr4, 0, iArr2, 0, iArr4.length);
/* 141 */                       System.arraycopy(iArr3, 0, iArr2, iArr4.length, 8);
/* 144 */                       iArr2[12] = i;
/* 147 */                       System.arraycopy(iArr, 0, iArr2, 13, iArr.length);
                                break;
                            }
                        default:
/* 19 */                    if (iArr.length != 6) {
/* 121 */                       OIiilo1Ool0o.I000l1("XChaCha20 uses 192-bit nonces, but got a %d-bit nonce", new Object[]{Integer.valueOf(iArr.length * 32)});
                                break;
                            } else {
/* 21 */                        int[] iArr5 = new int[16];
/* 25 */                        int[] iArr6 = (int[]) this.I00000oOI;
/* 27 */                        int[] iArr7 = new int[16];
/* 29 */                        int[] iArr8 = IO0oi1.I00000oIO;
/* 32 */                        System.arraycopy(iArr8, 0, iArr7, 0, iArr8.length);
/* 36 */                        System.arraycopy(iArr6, 0, iArr7, iArr8.length, 8);
/* 41 */                        iArr7[12] = iArr[0];
/* 46 */                        iArr7[13] = iArr[1];
/* 53 */                        iArr7[14] = iArr[2];
/* 59 */                        iArr7[15] = iArr[3];
/* 61 */                        IO0oi1.I00000oOI(iArr7);
/* 67 */                        iArr7[4] = iArr7[12];
/* 72 */                        iArr7[5] = iArr7[13];
/* 76 */                        iArr7[6] = iArr7[14];
/* 81 */                        iArr7[7] = iArr7[15];
/* 83 */                        int[] iArrCopyOf = Arrays.copyOf(iArr7, 8);
/* 88 */                        System.arraycopy(iArr8, 0, iArr5, 0, iArr8.length);
/* 92 */                        System.arraycopy(iArrCopyOf, 0, iArr5, iArr8.length, 8);
/* 95 */                        iArr5[12] = i;
/* 97 */                        iArr5[13] = 0;
/* 101 */                       iArr5[14] = iArr[4];
/* 105 */                       iArr5[15] = iArr[5];
                                break;
                            }
                    }
/* 3 */             return null;
                }

                @Override
                public final int I000OiO() {
                    switch (this.I0000Il00O) {
                        case 0:
/* 9 */                     return 12;
                        default:
/* 6 */                     return 24;
                    }
                }
            }

            package p000;
            
/* 27 */    public final class Ii0o1i extends I00Io1lO {
                @Override
                public final void I000oI1ioi(O1OIll00i o1OIll00i, boolean z) {
/* 7 */             o1OIll00i.I00Ol10(24, z, I00II0oii1o());
                }

                @Override
                public final int I0010I0i(boolean z) {
/* 6 */             return O1OIll00i.I00O10llo(I00II0oii1o().length, z);
                }

                public final byte[] I00II0oii1o() {
/* 1 */             byte[] bArr = this.I00iOIl;
/* 10 */            if (bArr[bArr.length - 1] == 90) {
/* 19 */                if (!I001lloI(10) || !I001lloI(11)) {
/* 134 */                   byte[] bArr2 = new byte[bArr.length + 4];
/* 139 */                   System.arraycopy(bArr, 0, bArr2, 0, bArr.length - 1);
/* 142 */                   int i = OlOoIoi11.I00000oIO;
/* 145 */                   byte[] bArr3 = new byte[5];
/* 148 */                   for (int i2 = 0; i2 != 5; i2++) {
/* 157 */                       bArr3[i2] = (byte) "0000Z".charAt(i2);
                            }
/* 165 */                   System.arraycopy(bArr3, 0, bArr2, bArr.length - 1, 5);
/* 168 */                   return bArr2;
                        }
/* 35 */                if (!I001lloI(12) || !I001lloI(13)) {
/* 96 */                    byte[] bArr4 = new byte[bArr.length + 2];
/* 101 */                   System.arraycopy(bArr, 0, bArr4, 0, bArr.length - 1);
/* 104 */                   int i3 = OlOoIoi11.I00000oIO;
/* 107 */                   byte[] bArr5 = new byte[3];
/* 110 */                   for (int i4 = 0; i4 != 3; i4++) {
/* 119 */                       bArr5[i4] = (byte) "00Z".charAt(i4);
                            }
/* 127 */                   System.arraycopy(bArr5, 0, bArr4, bArr.length - 1, 3);
/* 130 */                   return bArr4;
                        }
/* 49 */                if (I001lllioOl()) {
                            int length = bArr.length - 2;
/* 54 */                    while (length > 0 && bArr[length] == 48) {
                                length--;
                            }
/* 69 */                    if (bArr[length] == 46) {
/* 73 */                        byte[] bArr6 = new byte[length + 1];
/* 75 */                        System.arraycopy(bArr, 0, bArr6, 0, length);
/* 78 */                        bArr6[length] = 90;
/* 80 */                        return bArr6;
                            }
/* 83 */                    byte[] bArr7 = new byte[length + 2];
/* 85 */                    int i5 = length + 1;
/* 87 */                    System.arraycopy(bArr, 0, bArr7, 0, i5);
/* 90 */                    bArr7[i5] = 90;
/* 92 */                    return bArr7;
                        }
                    }
/* 541 */           return bArr;
                }

                @Override
/* 28 */        public final I00OIO1 I001IIilI0O() {
/* 29 */            return this;
                }

                @Override
/* 28 */        public final I00OIO1 I001IO000() {
/* 29 */            return this;
                }
            }

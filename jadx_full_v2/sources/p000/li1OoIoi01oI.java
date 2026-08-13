            package p000;
            
            public abstract class li1OoIoi01oI {
                public static final float I00000oIO(float[] fArr, float[] fArr2) {
/* 1 */             int length = fArr.length;
/* 2 */             float f = 0.0f;
/* 4 */             for (int i = 0; i < length; i++) {
/* 11 */                f += fArr[i] * fArr2[i];
                    }
/* 37 */            return f;
                }

                public static final void I00000oOI(float[] fArr, float[] fArr2, int i, float[] fArr3) {
/* 3 */             if (i == 0) {
/* 7 */                 IolioOO1.I00000oIO("At least one point must be provided");
                    }
/* 13 */            int i2 = 2 >= i ? i - 1 : 2;
/* 15 */            int i3 = i2 + 1;
/* 17 */            float[][] fArr4 = new float[i3][];
/* 21 */            for (int i4 = 0; i4 < i3; i4++) {
/* 25 */                fArr4[i4] = new float[i];
                    }
/* 33 */            for (int i5 = 0; i5 < i; i5++) {
/* 37 */                fArr4[0][i5] = 1.0f;
/* 40 */                for (int i6 = 1; i6 < i3; i6++) {
/* 53 */                    fArr4[i6][i5] = fArr4[i6 - 1][i5] * fArr[i5];
                        }
                    }
/* 61 */            float[][] fArr5 = new float[i3][];
/* 64 */            for (int i7 = 0; i7 < i3; i7++) {
/* 68 */                fArr5[i7] = new float[i];
                    }
/* 73 */            float[][] fArr6 = new float[i3][];
/* 76 */            for (int i8 = 0; i8 < i3; i8++) {
/* 80 */                fArr6[i8] = new float[i3];
                    }
/* 85 */            int i9 = 0;
/* 86 */            while (i9 < i3) {
/* 88 */                float[] fArr7 = fArr5[i9];
/* 92 */                System.arraycopy(fArr4[i9], 0, fArr7, 0, i);
/* 96 */                for (int i10 = 0; i10 < i9; i10++) {
/* 98 */                    float[] fArr8 = fArr5[i10];
/* 100 */                   float fI00000oIO = I00000oIO(fArr7, fArr8);
/* 105 */                   for (int i11 = 0; i11 < i; i11++) {
/* 113 */                       fArr7[i11] = fArr7[i11] - (fArr8[i11] * fI00000oIO);
                            }
                        }
/* 130 */               float fSqrt = (float) Math.sqrt(I00000oIO(fArr7, fArr7));
/* 136 */               if (fSqrt < 1.0E-6f) {
/* 138 */                   fSqrt = 1.0E-6f;
                        }
/* 139 */               float f = 1.0f / fSqrt;
/* 142 */               for (int i12 = 0; i12 < i; i12++) {
/* 147 */                   fArr7[i12] = fArr7[i12] * f;
                        }
/* 152 */               float[] fArr9 = fArr6[i9];
/* 154 */               int i13 = 0;
/* 155 */               while (i13 < i3) {
/* 167 */                   fArr9[i13] = i13 < i9 ? 0.0f : I00000oIO(fArr7, fArr4[i13]);
/* 169 */                   i13++;
                        }
/* 172 */               i9++;
                    }
/* 177 */           for (int i14 = i2; -1 < i14; i14--) {
/* 183 */               float fI00000oIO2 = I00000oIO(fArr5[i14], fArr2);
/* 187 */               float[] fArr10 = fArr6[i14];
/* 189 */               int i15 = i14 + 1;
/* 191 */               if (i15 <= i2) {
/* 193 */                   int i16 = i2;
                            while (true) {
/* 199 */                       fI00000oIO2 -= fArr10[i16] * fArr3[i16];
/* 200 */                       if (i16 != i15) {
                                    i16--;
                                }
                            }
                        }
/* 208 */               fArr3[i14] = fI00000oIO2 / fArr10[i14];
                    }
                }
            }

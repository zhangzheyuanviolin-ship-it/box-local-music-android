            package p000;
            
            public final class O1Il11 {
                public byte[] I00000oIO;
                public int I00000oOI;
                public long I0000Il00O;
                public int I0000O;
                public int I0000oI00;
                public int I0001Ioi1lo;
                public int I000II;
                public int I000O01llI0;
                public int[] I000OOo1O;
                public int I000OiO;

                public final void I00000oIO() {
/* 3 */             int[] iArr = this.I000OOo1O;
/* 10 */            for (int i = 16; i < 80; i++) {
/* 30 */                int i2 = ((iArr[i - 3] ^ iArr[i - 8]) ^ iArr[i - 14]) ^ iArr[i - 16];
/* 36 */                iArr[i] = (i2 >>> 31) | (i2 << 1);
                    }
/* 41 */            int iI0000Il00O = this.I0000O;
/* 43 */            int iI0000Il00O2 = this.I0000oI00;
/* 45 */            int i3 = this.I0001Ioi1lo;
/* 47 */            int i4 = this.I000II;
/* 49 */            int i5 = this.I000O01llI0;
/* 53 */            int i6 = 0;
/* 55 */            for (int i7 = 0; i7 < 4; i7++) {
/* 75 */                int iI0000Il00O3 = IIlIOloOOO.I0000Il00O(((iI0000Il00O2 & i3) | ((~iI0000Il00O2) & i4)) + ((iI0000Il00O << 5) | (iI0000Il00O >>> 27)), iArr[i6], 1518500249, i5);
/* 83 */                int i8 = (iI0000Il00O2 >>> 2) | (iI0000Il00O2 << 30);
/* 99 */                int iI0000Il00O4 = IIlIOloOOO.I0000Il00O(((iI0000Il00O & i8) | ((~iI0000Il00O) & i3)) + ((iI0000Il00O3 << 5) | (iI0000Il00O3 >>> 27)), iArr[i6 + 1], 1518500249, i4);
/* 107 */               int i9 = (iI0000Il00O >>> 2) | (iI0000Il00O << 30);
/* 123 */               int iI0000Il00O5 = IIlIOloOOO.I0000Il00O(((iI0000Il00O3 & i9) | ((~iI0000Il00O3) & i8)) + ((iI0000Il00O4 << 5) | (iI0000Il00O4 >>> 27)), iArr[i6 + 2], 1518500249, i3);
/* 131 */               i5 = (iI0000Il00O3 >>> 2) | (iI0000Il00O3 << 30);
/* 143 */               int i10 = i6 + 4;
/* 147 */               iI0000Il00O2 = IIlIOloOOO.I0000Il00O(((iI0000Il00O4 & i5) | ((~iI0000Il00O4) & i9)) + ((iI0000Il00O5 << 5) | (iI0000Il00O5 >>> 27)), iArr[i6 + 3], 1518500249, i8);
/* 155 */               i4 = (iI0000Il00O4 >>> 2) | (iI0000Il00O4 << 30);
/* 167 */               i6 += 5;
/* 171 */               iI0000Il00O = IIlIOloOOO.I0000Il00O(((iI0000Il00O5 & i4) | ((~iI0000Il00O5) & i5)) + ((iI0000Il00O2 << 5) | (iI0000Il00O2 >>> 27)), iArr[i10], 1518500249, i9);
/* 179 */               i3 = (iI0000Il00O5 >>> 2) | (iI0000Il00O5 << 30);
                    }
/* 185 */           for (int i11 = 0; i11 < 4; i11++) {
/* 203 */               int iI0000Il00O6 = IIlIOloOOO.I0000Il00O(((iI0000Il00O << 5) | (iI0000Il00O >>> 27)) + ((iI0000Il00O2 ^ i3) ^ i4), iArr[i6], 1859775393, i5);
/* 211 */               int i12 = (iI0000Il00O2 >>> 2) | (iI0000Il00O2 << 30);
/* 225 */               int iI0000Il00O7 = IIlIOloOOO.I0000Il00O(((iI0000Il00O6 << 5) | (iI0000Il00O6 >>> 27)) + ((iI0000Il00O ^ i12) ^ i3), iArr[i6 + 1], 1859775393, i4);
/* 233 */               int i13 = (iI0000Il00O >>> 2) | (iI0000Il00O << 30);
/* 247 */               int iI0000Il00O8 = IIlIOloOOO.I0000Il00O(((iI0000Il00O7 << 5) | (iI0000Il00O7 >>> 27)) + ((iI0000Il00O6 ^ i13) ^ i12), iArr[i6 + 2], 1859775393, i3);
/* 255 */               i5 = (iI0000Il00O6 >>> 2) | (iI0000Il00O6 << 30);
/* 265 */               int i14 = i6 + 4;
/* 269 */               iI0000Il00O2 = IIlIOloOOO.I0000Il00O(((iI0000Il00O8 << 5) | (iI0000Il00O8 >>> 27)) + ((iI0000Il00O7 ^ i5) ^ i13), iArr[i6 + 3], 1859775393, i12);
/* 277 */               i4 = (iI0000Il00O7 >>> 2) | (iI0000Il00O7 << 30);
/* 287 */               i6 += 5;
/* 291 */               iI0000Il00O = IIlIOloOOO.I0000Il00O(((iI0000Il00O2 << 5) | (iI0000Il00O2 >>> 27)) + ((iI0000Il00O8 ^ i4) ^ i5), iArr[i14], 1859775393, i13);
/* 299 */               i3 = (iI0000Il00O8 >>> 2) | (iI0000Il00O8 << 30);
                    }
/* 304 */           for (int i15 = 0; i15 < 4; i15++) {
/* 325 */               int iI0000Il00O9 = IIlIOloOOO.I0000Il00O((((i3 | i4) & iI0000Il00O2) | (i3 & i4)) + ((iI0000Il00O << 5) | (iI0000Il00O >>> 27)), iArr[i6], -1894007588, i5);
/* 333 */               int i16 = (iI0000Il00O2 >>> 2) | (iI0000Il00O2 << 30);
/* 351 */               int iI0000Il00O10 = IIlIOloOOO.I0000Il00O((((i16 | i3) & iI0000Il00O) | (i16 & i3)) + ((iI0000Il00O9 << 5) | (iI0000Il00O9 >>> 27)), iArr[i6 + 1], -1894007588, i4);
/* 359 */               int i17 = (iI0000Il00O >>> 2) | (iI0000Il00O << 30);
/* 377 */               int iI0000Il00O11 = IIlIOloOOO.I0000Il00O((((i17 | i16) & iI0000Il00O9) | (i17 & i16)) + ((iI0000Il00O10 << 5) | (iI0000Il00O10 >>> 27)), iArr[i6 + 2], -1894007588, i3);
/* 385 */               i5 = (iI0000Il00O9 >>> 2) | (iI0000Il00O9 << 30);
/* 399 */               int i18 = i6 + 4;
/* 403 */               iI0000Il00O2 = IIlIOloOOO.I0000Il00O((((i5 | i17) & iI0000Il00O10) | (i5 & i17)) + ((iI0000Il00O11 << 5) | (iI0000Il00O11 >>> 27)), iArr[i6 + 3], -1894007588, i16);
/* 411 */               i4 = (iI0000Il00O10 >>> 2) | (iI0000Il00O10 << 30);
/* 425 */               i6 += 5;
/* 429 */               iI0000Il00O = IIlIOloOOO.I0000Il00O((((i4 | i5) & iI0000Il00O11) | (i4 & i5)) + ((iI0000Il00O2 << 5) | (iI0000Il00O2 >>> 27)), iArr[i18], -1894007588, i17);
/* 437 */               i3 = (iI0000Il00O11 >>> 2) | (iI0000Il00O11 << 30);
                    }
/* 444 */           for (int i19 = 0; i19 <= 3; i19++) {
/* 462 */               int iI0000Il00O12 = IIlIOloOOO.I0000Il00O(((iI0000Il00O << 5) | (iI0000Il00O >>> 27)) + ((iI0000Il00O2 ^ i3) ^ i4), iArr[i6], -899497514, i5);
/* 470 */               int i20 = (iI0000Il00O2 >>> 2) | (iI0000Il00O2 << 30);
/* 484 */               int iI0000Il00O13 = IIlIOloOOO.I0000Il00O(((iI0000Il00O12 << 5) | (iI0000Il00O12 >>> 27)) + ((iI0000Il00O ^ i20) ^ i3), iArr[i6 + 1], -899497514, i4);
/* 492 */               int i21 = (iI0000Il00O >>> 2) | (iI0000Il00O << 30);
/* 506 */               int iI0000Il00O14 = IIlIOloOOO.I0000Il00O(((iI0000Il00O13 << 5) | (iI0000Il00O13 >>> 27)) + ((iI0000Il00O12 ^ i21) ^ i20), iArr[i6 + 2], -899497514, i3);
/* 514 */               i5 = (iI0000Il00O12 >>> 2) | (iI0000Il00O12 << 30);
/* 524 */               int i22 = i6 + 4;
/* 528 */               iI0000Il00O2 = IIlIOloOOO.I0000Il00O(((iI0000Il00O14 << 5) | (iI0000Il00O14 >>> 27)) + ((iI0000Il00O13 ^ i5) ^ i21), iArr[i6 + 3], -899497514, i20);
/* 536 */               i4 = (iI0000Il00O13 >>> 2) | (iI0000Il00O13 << 30);
/* 546 */               i6 += 5;
/* 550 */               iI0000Il00O = IIlIOloOOO.I0000Il00O(((iI0000Il00O2 << 5) | (iI0000Il00O2 >>> 27)) + ((iI0000Il00O14 ^ i4) ^ i5), iArr[i22], -899497514, i21);
/* 558 */               i3 = (iI0000Il00O14 >>> 2) | (iI0000Il00O14 << 30);
                    }
                    this.I0000O += iI0000Il00O;
                    this.I0000oI00 += iI0000Il00O2;
                    this.I0001Ioi1lo += i3;
                    this.I000II += i4;
                    this.I000O01llI0 += i5;
/* 587 */           this.I000OiO = 0;
/* 590 */           for (int i23 = 0; i23 < 16; i23++) {
/* 592 */               iArr[i23] = 0;
                    }
                }

                public final void I00000oOI(int i, byte[] bArr) {
/* 30 */            int i2 = (bArr[i + 3] & 255) | (bArr[i] << 24) | ((bArr[i + 1] & 255) << 16) | ((bArr[i + 2] & 255) << 8);
/* 31 */            int[] iArr = this.I000OOo1O;
/* 33 */            int i3 = this.I000OiO;
/* 35 */            iArr[i3] = i2;
/* 37 */            int i4 = i3 + 1;
/* 39 */            this.I000OiO = i4;
/* 41 */            if (i4 == 16) {
/* 43 */                I00000oIO();
                    }
                }

                public final void I0000Il00O() {
/* 3 */             this.I0000Il00O = 0L;
/* 6 */             this.I00000oOI = 0;
/* 8 */             int i = 0;
                    while (true) {
/* 9 */                 byte[] bArr = this.I00000oIO;
/* 12 */                if (i >= bArr.length) {
                            break;
                        }
/* 14 */                bArr[i] = 0;
/* 16 */                i++;
                    }
/* 22 */            this.I0000O = 1732584193;
/* 27 */            this.I0000oI00 = -271733879;
/* 32 */            this.I0001Ioi1lo = -1732584194;
/* 37 */            this.I000II = 271733878;
/* 42 */            this.I000O01llI0 = -1009589776;
/* 44 */            this.I000OiO = 0;
/* 46 */            int i2 = 0;
                    while (true) {
/* 47 */                int[] iArr = this.I000OOo1O;
/* 50 */                if (i2 == iArr.length) {
/* 113 */                   return;
                        }
/* 52 */                iArr[i2] = 0;
/* 54 */                i2++;
                    }
                }

                public final void I0000O(byte b) {
/* 1 */             byte[] bArr = this.I00000oIO;
/* 3 */             int i = this.I00000oOI;
/* 5 */             int i2 = i + 1;
/* 7 */             this.I00000oOI = i2;
/* 9 */             bArr[i] = b;
/* 12 */            if (i2 == bArr.length) {
/* 15 */                I00000oOI(0, bArr);
/* 18 */                this.I00000oOI = 0;
                    }
                    this.I0000Il00O++;
                }
            }

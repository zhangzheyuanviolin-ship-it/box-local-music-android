            package p000;
            
            public final class I1IioI implements I1IiiOO0i0io, I1IioI1l10 {
                public final float I00iOIl;
                public final boolean I00iiI;
                public final I000II I00iiO;
                public final float I00iio;

                public I1IioI(float f, boolean z, I000II i000ii) {
/* 4 */             this.I00iOIl = f;
/* 6 */             this.I00iiI = z;
/* 8 */             this.I00iiO = i000ii;
/* 10 */            this.I00iio = f;
                }

                @Override
                public final float I00000oIO() {
/* 1 */             return this.I00iio;
                }

                @Override
                public final void I0001Ioi1lo(IiIooOOOI iiIooOOOI, int i, int[] iArr, O0iOOoiioO o0iOOoiioO, int[] iArr2) {
                    int i2;
                    int iRound;
/* 2 */             if (iArr.length == 0) {
/* 155 */               return;
                    }
/* 8 */             int iI00l0OO0IO = iiIooOOOI.I00l0OO0IO(this.I00iOIl);
/* 23 */            boolean z = this.I00iiI && o0iOOoiioO == O0iOOoiioO.I00iiI;
/* 24 */            if (z) {
/* 26 */                int length = iArr.length;
/* 27 */                int i3 = 0;
/* 28 */                int iMin = 0;
/* 29 */                int i4 = 0;
/* 30 */                while (i3 < length) {
/* 37 */                    int iMax = Math.max(0, i - iArr[i3]);
/* 41 */                    iArr2[i4] = iMax;
/* 43 */                    iMin = Math.min(iI00l0OO0IO, iMax);
/* 49 */                    i = iArr2[i4] - iMin;
/* 50 */                    i3++;
/* 34 */                    i4++;
                        }
/* 54 */                i2 = i + iMin;
                    } else {
/* 56 */                int length2 = iArr.length;
/* 57 */                int i5 = 0;
/* 58 */                int i6 = 0;
/* 59 */                int i7 = 0;
/* 60 */                int i8 = 0;
/* 61 */                while (i5 < length2) {
/* 63 */                    int i9 = iArr[i5];
/* 69 */                    int iMin2 = Math.min(i6, i - i9);
/* 73 */                    iArr2[i8] = iMin2;
/* 78 */                    int iMin3 = Math.min(iI00l0OO0IO, (i - iMin2) - i9);
/* 85 */                    int i10 = iArr2[i8] + i9 + iMin3;
/* 87 */                    i5++;
/* 90 */                    i7 = iMin3;
/* 91 */                    i6 = i10;
/* 65 */                    i8++;
                        }
/* 95 */                i2 = i - (i6 - i7);
                    }
/* 96 */            I000II i000ii = this.I00iiO;
/* 98 */            if (i000ii == null || i2 <= 0) {
/* 155 */               return;
                    }
                    switch (i000ii.I00iOIl) {
                        case 10:
/* 135 */                   iRound = Math.round((1.0f + 0.0f) * ((i2 + 0) / 2.0f));
                            break;
                        default:
/* 123 */                   iRound = Math.round((1.0f + (o0iOOoiioO == O0iOOoiioO.I00iOIl ? -1.0f : 1.0f)) * (i2 / 2.0f));
                            break;
                    }
/* 139 */           if (z) {
/* 141 */               iRound -= i2;
                    }
/* 142 */           if (iRound != 0) {
/* 144 */               int length3 = iArr2.length;
/* 145 */               for (int i11 = 0; i11 < length3; i11++) {
/* 150 */                   iArr2[i11] = iArr2[i11] + iRound;
                        }
                    }
                }

                @Override
                public final void I000O01llI0(IiIooOOOI iiIooOOOI, int i, int[] iArr, int[] iArr2) {
/* 8 */             I0001Ioi1lo(iiIooOOOI, i, iArr, O0iOOoiioO.I00iOIl, iArr2);
                }

                public final boolean equals(Object obj) {
/* 1 */             if (this == obj) {
/* 41 */                return true;
                    }
/* 6 */             if (!(obj instanceof I1IioI)) {
/* 39 */                return false;
                    }
/* 9 */             I1IioI i1IioI = (I1IioI) obj;
                    return Iil1010O.I0000Il00O(this.I00iOIl, i1IioI.I00iOIl) && this.I00iiI == i1IioI.I00iiI && O0000Ioio00.I0000O(this.I00iiO, i1IioI.I00iiO);
                }

                public final int hashCode() {
/* 12 */            int iI000OOo1O = Oi010OO0.I000OOo1O(Float.hashCode(this.I00iOIl) * 31, 31, this.I00iiI);
/* 16 */            I000II i000ii = this.I00iiO;
/* 26 */            return iI000OOo1O + (i000ii == null ? 0 : i000ii.hashCode());
                }

                public final String toString() {
/* 44 */            return (this.I00iiI ? "" : "Absolute") + "Arrangement#spacedAligned(" + Iil1010O.I0000O(this.I00iOIl) + ", " + this.I00iiO + ")";
                }
            }

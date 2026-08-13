            package p000;
            
            public final class IOI110lioii implements I1IiiOO0i0io {
                public float I00iOIl;
                public float I00iiI;
                public float I00iiO;

                @Override
                public final float I00000oIO() {
/* 1 */             return this.I00iiO;
                }

                /* JADX WARN: Removed duplicated region for block: B:13:0x0022  */
                @Override
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final void I0001Ioi1lo(IiIooOOOI iiIooOOOI, int i, int[] iArr, O0iOOoiioO o0iOOoiioO, int[] iArr2) {
                    int i2;
/* 2 */             if (iArr.length == 0) {
/* 399 */               return;
                    }
/* 7 */             int iI00l0OO0IO = iiIooOOOI.I00l0OO0IO(this.I00iOIl);
/* 13 */            int iI00l0OO0IO2 = iiIooOOOI.I00l0OO0IO(this.I00iiI);
/* 17 */            int length = iArr.length;
/* 19 */            int i3 = 0;
/* 20 */            int i4 = 0;
/* 21 */            while (i3 < length) {
/* 23 */                int i5 = iArr[i3];
/* 25 */                int i6 = i4 + 1;
/* 27 */                if (i4 == 0) {
/* 35 */                    i2 = 0;
                        } else if (i4 == 1) {
/* 40 */                    int i7 = iArr[0];
/* 47 */                    i2 = i7 + (i7 > 0 ? iI00l0OO0IO : iI00l0OO0IO2);
                        } else if (i4 == 2) {
/* 37 */                    i2 = i - i5;
                        }
/* 50 */                if (o0iOOoiioO != O0iOOoiioO.I00iOIl) {
/* 55 */                    i2 = (i - i2) - i5;
                        }
/* 56 */                iArr2[i4] = i2;
/* 58 */                i3++;
/* 60 */                i4 = i6;
                    }
                }
            }

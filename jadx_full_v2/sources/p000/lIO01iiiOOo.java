            package p000;
            
            public abstract class lIO01iiiOOo {
                public static final int I00000oIO(int i, int i2, int i3) {
/* 1 */             if (i3 > 0) {
/* 3 */                 if (i < i2) {
/* 6 */                     int i4 = i2 % i3;
/* 8 */                     if (i4 < 0) {
/* 11 */                        i4 += i3;
                            }
/* 12 */                    int i5 = i % i3;
/* 13 */                    if (i5 < 0) {
/* 16 */                        i5 += i3;
                            }
/* 18 */                    int i6 = (i4 - i5) % i3;
/* 19 */                    if (i6 < 0) {
/* 22 */                        i6 += i3;
                            }
/* 23 */                    return i2 - i6;
                        }
                    } else {
/* 25 */                if (i3 >= 0) {
/* 52 */                    I000II.I000iOII("Step is zero.");
/* 55 */                    return 0;
                        }
/* 27 */                if (i > i2) {
/* 30 */                    int i7 = -i3;
/* 31 */                    int i8 = i % i7;
/* 32 */                    if (i8 < 0) {
/* 35 */                        i8 += i7;
                            }
/* 36 */                    int i9 = i2 % i7;
/* 38 */                    if (i9 < 0) {
/* 41 */                        i9 += i7;
                            }
/* 43 */                    int i10 = (i8 - i9) % i7;
/* 44 */                    if (i10 < 0) {
/* 47 */                        i10 += i7;
                            }
/* 48 */                    return i10 + i2;
                        }
                    }
/* 29 */            return i2;
                }
            }

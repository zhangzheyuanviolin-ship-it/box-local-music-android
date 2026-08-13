            package p000;
            
            public abstract class lIIO11 {
                public static final void I00000oIO(OI0l1iiooO oI0l1iiooO, int i) {
/* 3 */             if (oI0l1iiooO.I00000oOI == 0 || !(oI0l1iiooO.I0000Il00O(0) == i || oI0l1iiooO.I0000Il00O(oI0l1iiooO.I00000oOI - 1) == i)) {
/* 23 */                int i2 = oI0l1iiooO.I00000oOI;
/* 25 */                oI0l1iiooO.I00000oIO(i);
/* 28 */                while (i2 > 0) {
                            int i3 = ((i2 + 1) >>> 1) - 1;
/* 36 */                    int iI0000Il00O = oI0l1iiooO.I0000Il00O(i3);
/* 40 */                    if (i <= iI0000Il00O) {
                                break;
                            }
/* 42 */                    oI0l1iiooO.I0001Ioi1lo(i2, iI0000Il00O);
/* 45 */                    i2 = i3;
                        }
/* 47 */                oI0l1iiooO.I0001Ioi1lo(i2, i);
                    }
                }

                public static final int I00000oOI(OI0l1iiooO oI0l1iiooO) {
                    int iI0000Il00O;
/* 1 */             int i = oI0l1iiooO.I00000oOI;
/* 4 */             int iI0000Il00O2 = oI0l1iiooO.I0000Il00O(0);
/* 10 */            while (oI0l1iiooO.I00000oOI != 0 && oI0l1iiooO.I0000Il00O(0) == iI0000Il00O2) {
/* 22 */                oI0l1iiooO.I0001Ioi1lo(0, oI0l1iiooO.I0000O());
/* 29 */                oI0l1iiooO.I0000oI00(oI0l1iiooO.I00000oOI - 1);
/* 32 */                int i2 = oI0l1iiooO.I00000oOI;
/* 34 */                int i3 = i2 >>> 1;
/* 36 */                int i4 = 0;
/* 37 */                while (i4 < i3) {
/* 39 */                    int iI0000Il00O3 = oI0l1iiooO.I0000Il00O(i4);
/* 45 */                    int i5 = (i4 + 1) * 2;
                            int i6 = i5 - 1;
/* 49 */                    int iI0000Il00O4 = oI0l1iiooO.I0000Il00O(i6);
/* 53 */                    if (i5 >= i2 || (iI0000Il00O = oI0l1iiooO.I0000Il00O(i5)) <= iI0000Il00O4) {
/* 71 */                        if (iI0000Il00O4 > iI0000Il00O3) {
/* 73 */                            oI0l1iiooO.I0001Ioi1lo(i4, iI0000Il00O4);
/* 76 */                            oI0l1iiooO.I0001Ioi1lo(i6, iI0000Il00O3);
/* 79 */                            i4 = i6;
                                }
                            } else if (iI0000Il00O > iI0000Il00O3) {
/* 63 */                        oI0l1iiooO.I0001Ioi1lo(i4, iI0000Il00O);
/* 66 */                        oI0l1iiooO.I0001Ioi1lo(i5, iI0000Il00O3);
/* 69 */                        i4 = i5;
                            }
                        }
                    }
/* 168 */           return iI0000Il00O2;
                }
            }

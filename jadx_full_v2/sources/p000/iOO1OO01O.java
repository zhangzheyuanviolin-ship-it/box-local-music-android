            package p000;
            
            public abstract class iOO1OO01O {
                public static final int I00000oIO(I1Io1oIoo i1Io1oIoo, Object obj, int i) {
/* 1 */             int i2 = i1Io1oIoo.I00iiO;
/* 3 */             if (i2 == 0) {
/* 5 */                 return -1;
                    }
                    try {
/* 9 */                 int iI00000oIO = iIIl1I0OIlO0.I00000oIO(i2, i, i1Io1oIoo.I00iOIl);
/* 13 */                if (iI00000oIO < 0 || O0000Ioio00.I0000O(obj, i1Io1oIoo.I00iiI[iI00000oIO])) {
/* 26 */                    return iI00000oIO;
                        }
/* 27 */                int i3 = iI00000oIO + 1;
/* 29 */                while (i3 < i2 && i1Io1oIoo.I00iOIl[i3] == i) {
/* 45 */                    if (O0000Ioio00.I0000O(obj, i1Io1oIoo.I00iiI[i3])) {
/* 47 */                        return i3;
                            }
/* 48 */                    i3++;
                        }
/* 53 */                for (int i4 = iI00000oIO - 1; i4 >= 0 && i1Io1oIoo.I00iOIl[i4] == i; i4--) {
/* 69 */                    if (O0000Ioio00.I0000O(obj, i1Io1oIoo.I00iiI[i4])) {
/* 71 */                        return i4;
                            }
                        }
/* 75 */                return ~i3;
                    } catch (IndexOutOfBoundsException unused) {
/* 77 */                I000II.I001IIilI0O();
/* 80 */                return 0;
                    }
                }
            }

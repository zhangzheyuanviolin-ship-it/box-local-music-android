            package p000;
            
            public class l1l0llOlIl extends l1l1O1i {
                public final byte[] I00iiO;

                public l1l0llOlIl(byte[] bArr) {
/* 5 */             this.I00iOIl = 0;
/* 7 */             bArr.getClass();
/* 10 */            this.I00iiO = bArr;
                }

                @Override
                public byte I00000oOI(int i) {
/* 3 */             return this.I00iiO[i];
                }

                @Override
                public byte I0000O(int i) {
/* 3 */             return this.I00iiO[i];
                }

                @Override
                public int I0000oI00() {
/* 3 */             return this.I00iiO.length;
                }

                public final boolean equals(Object obj) {
/* 1 */             if (obj == this) {
/* 83 */                return true;
                    }
/* 7 */             if ((obj instanceof l1l1O1i) && I0000oI00() == ((l1l1O1i) obj).I0000oI00()) {
/* 28 */                if (I0000oI00() == 0) {
/* 83 */                    return true;
                        }
/* 33 */                if (!(obj instanceof l1l0llOlIl)) {
/* 109 */                   return obj.equals(this);
                        }
/* 35 */                l1l0llOlIl l1l0llolil = (l1l0llOlIl) obj;
/* 37 */                int i = this.I00iOIl;
/* 39 */                int i2 = l1l0llolil.I00iOIl;
/* 41 */                if (i == 0 || i2 == 0 || i == i2) {
/* 47 */                    int iI0000oI00 = I0000oI00();
/* 55 */                    if (iI0000oI00 > l1l0llolil.I0000oI00()) {
/* 105 */                       I000II.I00100o1O0lo(iI0000oI00, I0000oI00());
/* 6 */                         return false;
                            }
/* 61 */                    if (iI0000oI00 > l1l0llolil.I0000oI00()) {
/* 97 */                        I000II.I000iOII(IIl001iO0Io.I000l1(iI0000oI00, l1l0llolil.I0000oI00(), "Ran off end of other: 0, ", ", "));
/* 6 */                         return false;
                            }
/* 63 */                    byte[] bArr = l1l0llolil.I00iiO;
/* 65 */                    int i3 = 0;
/* 66 */                    int i4 = 0;
/* 67 */                    while (i3 < iI0000oI00) {
/* 75 */                        if (this.I00iiO[i3] == bArr[i4]) {
/* 78 */                            i3++;
/* 80 */                            i4++;
                                }
                            }
/* 83 */                    return true;
                        }
                    }
/* 6 */             return false;
                }
            }

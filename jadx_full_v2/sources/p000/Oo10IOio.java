            package p000;

            import java.util.Arrays;
            
            public abstract class Oo10IOio {
                public static final long I00000oOI = I1Ioolli0l0o.I00000oIO.objectFieldOffset(Oo10IOio.class.getDeclaredField("_size$volatile"));
                public Il10lO[] I00000oIO;
                private volatile int _size$volatile;

                public final void I00000oIO(Il10lO il10lO) {
/* 4 */             il10lO.I0000O((Il10li0OlI) this);
/* 7 */             Il10lO[] il10lOArr = this.I00000oIO;
/* 9 */             if (il10lOArr == null) {
/* 12 */                il10lOArr = new Il10lO[4];
/* 14 */                this.I00000oIO = il10lOArr;
                    } else if (I00000oOI() >= il10lOArr.length) {
/* 34 */                il10lOArr = (Il10lO[]) Arrays.copyOf(il10lOArr, I00000oOI() * 2);
/* 36 */                this.I00000oIO = il10lOArr;
                    }
/* 38 */            int iI00000oOI = I00000oOI();
/* 48 */            I1Ioolli0l0o.I00000oIO.putIntVolatile(this, I00000oOI, iI00000oOI + 1);
/* 51 */            il10lOArr[iI00000oOI] = il10lO;
/* 53 */            il10lO.I00iiI = iI00000oOI;
/* 55 */            while (iI00000oOI > 0) {
/* 58 */                Object[] objArr = this.I00000oIO;
/* 62 */                int i = (iI00000oOI - 1) / 2;
/* 72 */                if (objArr[i].compareTo(objArr[iI00000oOI]) <= 0) {
/* 74 */                    return;
                        }
/* 75 */                I0000O(iI00000oOI, i);
/* 78 */                iI00000oOI = i;
                    }
                }

                public final int I00000oOI() {
/* 5 */             return I1Ioolli0l0o.I00000oIO.getIntVolatile(this, I00000oOI);
                }

                public final Il10lO I0000Il00O(int i) {
/* 1 */             Object[] objArr = this.I00000oIO;
/* 13 */            I1Ioolli0l0o.I00000oIO.putIntVolatile(this, I00000oOI, I00000oOI() - 1);
/* 20 */            if (i < I00000oOI()) {
/* 26 */                I0000O(i, I00000oOI());
/* 31 */                int i2 = (i - 1) / 2;
/* 33 */                if (i <= 0 || objArr[i].compareTo(objArr[i2]) >= 0) {
                            while (true) {
/* 73 */                        int i3 = i * 2;
/* 75 */                        int i4 = i3 + 1;
/* 81 */                        if (i4 >= I00000oOI()) {
                                    break;
                                }
/* 84 */                        Object[] objArr2 = this.I00000oIO;
/* 86 */                        int i5 = i3 + 2;
/* 92 */                        if (i5 >= I00000oOI() || objArr2[i5].compareTo(objArr2[i4]) >= 0) {
/* 105 */                           i5 = i4;
                                }
/* 114 */                       if (objArr2[i].compareTo(objArr2[i5]) <= 0) {
                                    break;
                                }
/* 117 */                       I0000O(i, i5);
/* 120 */                       i = i5;
                            }
                        } else {
/* 45 */                    I0000O(i, i2);
/* 48 */                    while (i2 > 0) {
/* 51 */                        Object[] objArr3 = this.I00000oIO;
/* 55 */                        int i6 = (i2 - 1) / 2;
/* 65 */                        if (objArr3[i6].compareTo(objArr3[i2]) <= 0) {
                                    break;
                                }
/* 68 */                        I0000O(i2, i6);
/* 71 */                        i2 = i6;
                            }
                        }
                    }
/* 126 */           Il10lO il10lO = objArr[I00000oOI()];
/* 129 */           il10lO.I0000O(null);
/* 132 */           il10lO.I00iiI = -1;
/* 138 */           objArr[I00000oOI()] = null;
/* 186 */           return il10lO;
                }

                public final void I0000O(int i, int i2) {
/* 1 */             Il10lO[] il10lOArr = this.I00000oIO;
/* 3 */             Il10lO il10lO = il10lOArr[i2];
/* 5 */             Il10lO il10lO2 = il10lOArr[i];
/* 7 */             il10lOArr[i] = il10lO;
/* 9 */             il10lOArr[i2] = il10lO2;
/* 11 */            il10lO.I00iiI = i;
/* 13 */            il10lO2.I00iiI = i2;
                }
            }

            package p000;
            
            public abstract class O1O11l00i1IO {
                public static final O1Io0oOooO[][] I00000oIO;

                static {
/* 1 */             O1Io0oOooO o1Io0oOooO = O1Io0oOooO.I00iiI;
/* 3 */             O1Io0oOooO o1Io0oOooO2 = O1Io0oOooO.I00iiO;
/* 5 */             O1Io0oOooO o1Io0oOooO3 = O1Io0oOooO.I00ilI0I1;
/* 7 */             O1Io0oOooO o1Io0oOooO4 = O1Io0oOooO.I00ilO0;
/* 9 */             O1Io0oOooO o1Io0oOooO5 = O1Io0oOooO.I00iio;
/* 14 */            O1Io0oOooO[] o1Io0oOooOArr = {o1Io0oOooO, o1Io0oOooO2, o1Io0oOooO3, o1Io0oOooO4, o1Io0oOooO, o1Io0oOooO, o1Io0oOooO, o1Io0oOooO5};
/* 19 */            O1Io0oOooO o1Io0oOooO6 = O1Io0oOooO.I00iOIl;
/* 132 */           I00000oIO = new O1Io0oOooO[][]{o1Io0oOooOArr, new O1Io0oOooO[]{o1Io0oOooO2, o1Io0oOooO2, o1Io0oOooO6, o1Io0oOooO4, o1Io0oOooO, o1Io0oOooO, o1Io0oOooO, o1Io0oOooO5}, new O1Io0oOooO[]{o1Io0oOooO3, o1Io0oOooO3, o1Io0oOooO6, o1Io0oOooO6, o1Io0oOooO3, o1Io0oOooO6, o1Io0oOooO6, o1Io0oOooO3}, new O1Io0oOooO[]{o1Io0oOooO4, o1Io0oOooO4, o1Io0oOooO6, o1Io0oOooO, o1Io0oOooO4, o1Io0oOooO, o1Io0oOooO, o1Io0oOooO4}, new O1Io0oOooO[]{o1Io0oOooO, o1Io0oOooO, o1Io0oOooO6, o1Io0oOooO, o1Io0oOooO, o1Io0oOooO, o1Io0oOooO, o1Io0oOooO}, new O1Io0oOooO[]{o1Io0oOooO, o1Io0oOooO2, o1Io0oOooO3, o1Io0oOooO4, o1Io0oOooO, o1Io0oOooO, o1Io0oOooO, o1Io0oOooO5}, new O1Io0oOooO[]{o1Io0oOooO5, o1Io0oOooO5, o1Io0oOooO6, o1Io0oOooO5, o1Io0oOooO5, o1Io0oOooO5, o1Io0oOooO5, o1Io0oOooO5}, new O1Io0oOooO[]{o1Io0oOooO5, o1Io0oOooO2, o1Io0oOooO3, o1Io0oOooO4, o1Io0oOooO5, o1Io0oOooO, o1Io0oOooO5, o1Io0oOooO5}, new O1Io0oOooO[]{o1Io0oOooO3, o1Io0oOooO5, o1Io0oOooO3, o1Io0oOooO4, o1Io0oOooO, o1Io0oOooO, o1Io0oOooO, o1Io0oOooO5}};
                }

                public static final int I00000oIO(O1IoiiO0o1 o1IoiiO0o1, boolean z) throws O1Ooo1IIioo {
/* 1 */             int iOrdinal = o1IoiiO0o1.ordinal();
/* 7 */             if (iOrdinal != 1) {
/* 10 */                if (iOrdinal == 4) {
/* 6 */                     return 1;
                        }
/* 13 */                if (iOrdinal == 5) {
/* 53 */                    return 2;
                        }
/* 17 */                if (iOrdinal != 21 && iOrdinal != 22) {
                            switch (iOrdinal) {
                                case 7:
/* 51 */                            return 3;
                                case 8:
/* 9 */                             return 4;
                                case 9:
/* 12 */                            return 5;
                                case 10:
                                case 14:
/* 47 */                            return 7;
                                case 11:
/* 34 */                            if (z) {
/* 36 */                                return 8;
                                    }
/* 46 */                            throw new O1Ooo1IIioo("Interelement space undefined for radical on the right. Treat radical as ordinary.");
                                case 12:
/* 32 */                            return 6;
                                case 13:
                                    break;
                                default:
/* 28 */                            IoOOl0iOl1io.I001iOo1i0O("Interelement space undefined for type ", o1IoiiO0o1);
/* 5 */                             return 0;
                            }
                        }
                    }
/* 5 */             return 0;
                }
            }

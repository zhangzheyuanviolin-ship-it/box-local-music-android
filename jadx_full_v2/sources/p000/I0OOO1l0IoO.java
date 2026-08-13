            package p000;
            
            public final class I0OOO1l0IoO {
                public static final I0OOO1l0IoO I0000Il00O;
                public static final I0OOO1l0IoO I0000O;
                public static final I0OOO1l0IoO I0000oI00;
                public static final I0OOO1l0IoO I0001Ioi1lo;
                public static final I0OOO1l0IoO I000II;
                public static final I0OOO1l0IoO I000O01llI0;
                public final int I00000oIO;
                public final String I00000oOI;

                static {
/* 5 */             int i = 0;
/* 9 */             I0000Il00O = new I0OOO1l0IoO("TINK", i);
/* 18 */            I0000O = new I0OOO1l0IoO("CRUNCHY", i);
/* 27 */            I0000oI00 = new I0OOO1l0IoO("LEGACY", i);
/* 36 */            I0001Ioi1lo = new I0OOO1l0IoO("NO_PREFIX", i);
/* 42 */            int i2 = 1;
/* 46 */            I000II = new I0OOO1l0IoO("VERTICAL", i2);
/* 55 */            I000O01llI0 = new I0OOO1l0IoO("HORIZONTAL", i2);
                }

                public I0OOO1l0IoO(String str, int i) {
/* 1 */             this.I00000oIO = i;
/* 3 */             this.I00000oOI = str;
                }

                public final String toString() {
/* 1 */             int i = this.I00000oIO;
/* 3 */             String str = this.I00000oOI;
                    switch (i) {
                        case 0:
                        case 1:
                        case 2:
/* 21 */                    return str;
                        default:
/* 17 */                    return IIl001iO0Io.I00100l0(new StringBuilder("Phase('"), str, "')");
                    }
                }
            }

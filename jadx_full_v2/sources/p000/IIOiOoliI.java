            package p000;

            import java.util.Arrays;
            
            public final class IIOiOoliI extends ilO110i0o {
                public int I00000oIO;
                public int I00000oOI;
                public IIOiiIi[] I0000Il00O;
                public int I0000O;

                @Override
                public final int I00000oIO(int i) {
/* 2 */             int i2 = 0;
                    while (true) {
/* 3 */                 int i3 = this.I00000oOI;
/* 5 */                 if (i2 >= i3) {
/* 1 */                     return 0;
                        }
/* 7 */                 IIOiiIi[] iIOiiIiArr = this.I0000Il00O;
/* 9 */                 IIOiiIi iIOiiIi = iIOiiIiArr[i2];
/* 13 */                if (iIOiiIi.I00000oOI <= i) {
/* 15 */                    int i4 = i2 + 1;
/* 17 */                    if (i4 >= i3) {
/* 30 */                        if (this.I0000O > i) {
/* 32 */                            return iIOiiIi.I0000Il00O;
                                }
/* 35 */                        return -1;
                            }
/* 23 */                    if (iIOiiIiArr[i4].I00000oOI > i) {
/* 25 */                        return iIOiiIi.I0000Il00O;
                            }
                        }
/* 37 */                i2++;
                    }
                }

                public final String toString() {
/* 9 */             StringBuilder sb = new StringBuilder(IIOiOoliI.class.getName());
/* 14 */            sb.append("[format=");
/* 19 */            sb.append(this.I00000oIO);
/* 24 */            sb.append(" nbRanges=");
/* 29 */            sb.append(this.I00000oOI);
/* 34 */            sb.append(", range3=");
/* 43 */            sb.append(Arrays.toString(this.I0000Il00O));
/* 48 */            sb.append(" sentinel=");
/* 55 */            return IIl001iO0Io.I000lI(this.I0000O, "]", sb);
                }
            }

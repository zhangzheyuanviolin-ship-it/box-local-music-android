            package p000;

            import java.util.Arrays;
            
            public final class Io0O1i extends IO0i1l1Io {
                public final int I00iiI;
                public Object I00iiO;

                @Override
                public final int I00000oIO(int i) {
                    switch (this.I00iiI) {
                        case 0:
/* 38 */                    return Arrays.binarySearch((int[]) this.I00iiO, i);
                        default:
/* 12 */                    for (IioIO1i iioIO1i : (IioIO1i[]) this.I00iiO) {
/* 16 */                        int i2 = iioIO1i.I00000oOI;
/* 18 */                        if (i2 <= i && i <= iioIO1i.I0000Il00O) {
/* 27 */                            return (iioIO1i.I0000O + i) - i2;
                                }
                            }
/* 32 */                    return -1;
                    }
                }

                public final String toString() {
                    switch (this.I00iiI) {
                        case 0:
/* 43 */                    return String.format("CoverageTableFormat1[coverageFormat=%d,glyphArray=%s]", Integer.valueOf(this.I00iOIl), Arrays.toString((int[]) this.I00iiO));
                        default:
/* 18 */                    return String.format("CoverageTableFormat2[coverageFormat=%d]", Integer.valueOf(this.I00iOIl));
                    }
                }
            }

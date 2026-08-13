            package p000;

            import java.util.Arrays;
            
            public final class i0Ol1iO1 {
                public I11Oil I00000oIO;
                public IlIII1l I00000oOI;

                public final boolean equals(Object obj) {
/* 3 */             if (!(obj instanceof i0Ol1iO1)) {
/* 29 */                return false;
                    }
/* 5 */             i0Ol1iO1 i0ol1io1 = (i0Ol1iO1) obj;
                    return l1ioii1I10Io.I00000oIO(this.I00000oIO, i0ol1io1.I00000oIO) && l1ioii1I10Io.I00000oIO(this.I00000oOI, i0ol1io1.I00000oOI);
                }

                public final int hashCode() {
/* 9 */             return Arrays.hashCode(new Object[]{this.I00000oIO, this.I00000oOI});
                }

                public final String toString() {
/* 1 */             Iol01110 iol01110I00000oOI = l1ioii1I10Io.I00000oOI(this);
/* 9 */             iol01110I00000oOI.I0000Il00O("key", this.I00000oIO);
/* 16 */            iol01110I00000oOI.I0000Il00O("feature", this.I00000oOI);
/* 19 */            return iol01110I00000oOI.toString();
                }
            }

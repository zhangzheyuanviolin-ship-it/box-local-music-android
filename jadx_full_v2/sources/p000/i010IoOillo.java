            package p000;

            import java.util.ArrayList;
            import java.util.List;
            
            public final class i010IoOillo {
                public static final List I0000Il00O;
                public static final List I0000O;
                public static final List I0000oI00;
                public final int I00000oIO;
                public final int I00000oOI;

                static {
/* 22 */            List listI000O01llI0 = IOOi1I.I000O01llI0(0, 600, 840);
/* 26 */            I0000Il00O = listI000O01llI0;
/* 53 */            ArrayList arrayListI00O10llo = IOOi0Ool1i.I00O10llo(listI000O01llI0, IOOi1I.I000O01llI0(1200, 1600));
/* 73 */            List listI000O01llI02 = IOOi1I.I000O01llI0(0, 480, 900);
/* 77 */            I0000O = listI000O01llI02;
/* 79 */            I0000oI00 = listI000O01llI02;
/* 81 */            lolOiIoiillI.I0000O(listI000O01llI0, listI000O01llI02);
/* 84 */            lolOiIoiillI.I0000O(arrayListI00O10llo, listI000O01llI02);
                }

                public i010IoOillo(int i, int i2) {
/* 4 */             this.I00000oIO = i;
/* 6 */             this.I00000oOI = i2;
/* 10 */            if (i < 0) {
/* 32 */                I000II.I0010I0i(Oi010OO0.I0010I0i("Expected minWidthDp to be at least 0, minWidthDp: ", i, '.'));
/* 37 */                throw null;
                    }
/* 12 */            if (i2 >= 0) {
/* 14 */                return;
                    }
/* 21 */            I000II.I0010I0i(Oi010OO0.I0010I0i("Expected minHeightDp to be at least 0, minHeightDp: ", i2, '.'));
/* 25 */            throw null;
                }

                public final boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
/* 6 */             if (obj == null || i010IoOillo.class != obj.getClass()) {
/* 5 */                 return false;
                    }
/* 17 */            i010IoOillo i010iooillo = (i010IoOillo) obj;
                    return this.I00000oIO == i010iooillo.I00000oIO && this.I00000oOI == i010iooillo.I00000oOI;
                }

                public final int hashCode() {
/* 7 */             return (this.I00000oIO * 31) + this.I00000oOI;
                }

                public final String toString() {
/* 5 */             StringBuilder sb = new StringBuilder("WindowSizeClass(minWidthDp=");
/* 10 */            sb.append(this.I00000oIO);
/* 15 */            sb.append(", minHeightDp=");
/* 22 */            return Oi010OO0.I001i1lo1io(sb, this.I00000oOI, ')');
                }
            }

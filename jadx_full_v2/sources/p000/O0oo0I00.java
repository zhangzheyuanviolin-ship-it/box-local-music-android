            package p000;
            
            public final class O0oo0I00 {
                public static final O0oo0I00 I0000O = new O0oo0I00(17, 0, O0olOolil.I0000Il00O);
                public final float I00000oIO;
                public final int I00000oOI;
                public final int I0000Il00O;

                public O0oo0I00(int i, int i2, float f) {
/* 4 */             this.I00000oIO = f;
/* 6 */             this.I00000oOI = i;
/* 8 */             this.I0000Il00O = i2;
                }

                public final boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
/* 8 */             if (!(obj instanceof O0oo0I00)) {
/* 7 */                 return false;
                    }
/* 11 */            O0oo0I00 o0oo0I00 = (O0oo0I00) obj;
/* 13 */            float f = o0oo0I00.I00000oIO;
/* 15 */            float f2 = O0olOolil.I00000oOI;
                    return Float.compare(this.I00000oIO, f) == 0 && this.I00000oOI == o0oo0I00.I00000oOI && this.I0000Il00O == o0oo0I00.I0000Il00O;
                }

                public final int hashCode() {
/* 1 */             float f = O0olOolil.I00000oOI;
/* 24 */            return Integer.hashCode(this.I0000Il00O) + IIl001iO0Io.I0000O(this.I00000oOI, Float.hashCode(this.I00000oIO) * 31, 31);
                }

                public final String toString() {
/* 3 */             String strI00000oOI = O0olOolil.I00000oOI(this.I00000oIO);
/* 7 */             String str = "Invalid";
/* 9 */             int i = this.I00000oOI;
/* 33 */            String str2 = i == 1 ? "LineHeightStyle.Trim.FirstLineTop" : i == 16 ? "LineHeightStyle.Trim.LastLineBottom" : i == 17 ? "LineHeightStyle.Trim.Both" : i == 0 ? "LineHeightStyle.Trim.None" : "Invalid";
/* 37 */            int i2 = this.I0000Il00O;
/* 39 */            if (i2 == 0) {
/* 41 */                str = "LineHeightStyle.Mode.Fixed";
                    } else if (i2 == 1) {
/* 46 */                str = "LineHeightStyle.Mode.Minimum";
                    } else if (i2 == 2) {
/* 52 */                str = "LineHeightStyle.Mode.Tight";
                    }
/* 66 */            return IIl001iO0Io.I00100l0(IIl001iO0Io.I00111O("LineHeightStyle(alignment=", strI00000oOI, ", trim=", str2, ",mode="), str, ")");
                }
            }

            package p000;
            
            public final class IIi100 {
                public static final IIi100 I000o00OoI0I = new IIi100(true, false, -1, -1, false, false, false, -1, -1, false, false, false, null);
                public static final IIi100 I000oI1ioi = new IIi100(false, false, -1, -1, false, false, false, Integer.MAX_VALUE, -1, true, false, false, null);
                public final boolean I00000oIO;
                public final boolean I00000oOI;
                public final int I0000Il00O;
                public final int I0000O;
                public final boolean I0000oI00;
                public final boolean I0001Ioi1lo;
                public final boolean I000II;
                public final int I000O01llI0;
                public final int I000OOo1O;
                public final boolean I000OiO;
                public final boolean I000iOII;
                public final boolean I000l1;
                public String I000lI;

                public IIi100(boolean z, boolean z2, int i, int i2, boolean z3, boolean z4, boolean z5, int i3, int i4, boolean z6, boolean z7, boolean z8, String str) {
/* 4 */             this.I00000oIO = z;
/* 6 */             this.I00000oOI = z2;
/* 8 */             this.I0000Il00O = i;
/* 10 */            this.I0000O = i2;
/* 12 */            this.I0000oI00 = z3;
/* 14 */            this.I0001Ioi1lo = z4;
/* 16 */            this.I000II = z5;
/* 18 */            this.I000O01llI0 = i3;
/* 20 */            this.I000OOo1O = i4;
/* 22 */            this.I000OiO = z6;
/* 24 */            this.I000iOII = z7;
/* 26 */            this.I000l1 = z8;
/* 28 */            this.I000lI = str;
                }

                public final String toString() {
/* 1 */             String str = this.I000lI;
/* 3 */             if (str != null) {
/* 245 */               return str;
                    }
/* 7 */             StringBuilder sb = new StringBuilder();
/* 12 */            if (this.I00000oIO) {
/* 16 */                sb.append("no-cache, ");
                    }
/* 21 */            if (this.I00000oOI) {
/* 25 */                sb.append("no-store, ");
                    }
/* 28 */            int i = this.I0000Il00O;
/* 33 */            if (i != -1) {
/* 37 */                sb.append("max-age=");
/* 40 */                sb.append(i);
/* 43 */                sb.append(", ");
                    }
/* 46 */            int i2 = this.I0000O;
/* 48 */            if (i2 != -1) {
/* 52 */                sb.append("s-maxage=");
/* 55 */                sb.append(i2);
/* 58 */                sb.append(", ");
                    }
/* 63 */            if (this.I0000oI00) {
/* 67 */                sb.append("private, ");
                    }
/* 72 */            if (this.I0001Ioi1lo) {
/* 76 */                sb.append("public, ");
                    }
/* 81 */            if (this.I000II) {
/* 85 */                sb.append("must-revalidate, ");
                    }
/* 88 */            int i3 = this.I000O01llI0;
/* 90 */            if (i3 != -1) {
/* 94 */                sb.append("max-stale=");
/* 97 */                sb.append(i3);
/* 100 */               sb.append(", ");
                    }
/* 103 */           int i4 = this.I000OOo1O;
/* 105 */           if (i4 != -1) {
/* 109 */               sb.append("min-fresh=");
/* 112 */               sb.append(i4);
/* 115 */               sb.append(", ");
                    }
/* 120 */           if (this.I000OiO) {
/* 124 */               sb.append("only-if-cached, ");
                    }
/* 129 */           if (this.I000iOII) {
/* 133 */               sb.append("no-transform, ");
                    }
/* 138 */           if (this.I000l1) {
/* 142 */               sb.append("immutable, ");
                    }
/* 149 */           if (sb.length() == 0) {
/* 151 */               return "";
                    }
/* 164 */           sb.delete(sb.length() - 2, sb.length());
/* 167 */           String string = sb.toString();
/* 171 */           this.I000lI = string;
/* 245 */           return string;
                }
            }

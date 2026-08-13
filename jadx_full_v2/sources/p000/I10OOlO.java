            package p000;
            
            public final class I10OOlO implements i00O0OOIlOO {
                public int I00000oIO;
                public String I00000oOI;
                public OIooliIO0 I0000Il00O;
                public OIooliIO0 I0000O;

                @Override
                public final int I00000oIO(IiIooOOOI iiIooOOOI) {
/* 5 */             return I0000oI00().I00000oOI;
                }

                @Override
                public final int I00000oOI(IiIooOOOI iiIooOOOI, O0iOOoiioO o0iOOoiioO) {
/* 5 */             return I0000oI00().I0000Il00O;
                }

                @Override
                public final int I0000Il00O(IiIooOOOI iiIooOOOI) {
/* 5 */             return I0000oI00().I0000O;
                }

                @Override
                public final int I0000O(IiIooOOOI iiIooOOOI, O0iOOoiioO o0iOOoiioO) {
/* 5 */             return I0000oI00().I00000oIO;
                }

                public final Ioo0l0I I0000oI00() {
/* 7 */             return (Ioo0l0I) this.I0000Il00O.getValue();
                }

                public final void I0001Ioi1lo(boolean z) {
/* 7 */             this.I0000O.setValue(Boolean.valueOf(z));
                }

                public final void I000II(i00iooo00li i00iooo00liVar, int i) {
/* 1 */             int i2 = this.I00000oIO;
/* 3 */             if (i == 0 || (i & i2) != 0) {
/* 18 */                this.I0000Il00O.setValue(i00iooo00liVar.I00000oIO.I000OOo1O(i2));
/* 27 */                I0001Ioi1lo(i00iooo00liVar.I00000oIO.I001IIilI0O(i2));
                    }
                }

                public final boolean equals(Object obj) {
/* 1 */             if (this == obj) {
/* 17 */                return true;
                    }
                    return (obj instanceof I10OOlO) && this.I00000oIO == ((I10OOlO) obj).I00000oIO;
                }

                public final int hashCode() {
/* 1 */             return this.I00000oIO;
                }

                public final String toString() {
/* 1 */             String str = this.I00000oOI;
/* 7 */             int i = I0000oI00().I00000oIO;
/* 13 */            int i2 = I0000oI00().I00000oOI;
/* 19 */            int i3 = I0000oI00().I0000Il00O;
/* 25 */            int i4 = I0000oI00().I0000O;
/* 29 */            StringBuilder sb = new StringBuilder(str);
/* 34 */            sb.append("(");
/* 37 */            sb.append(i);
/* 42 */            sb.append(", ");
/* 45 */            sb.append(i2);
/* 48 */            IIlIOloOOO.I001l0I00(sb, ", ", i3, ", ", i4);
/* 53 */            sb.append(")");
/* 56 */            return sb.toString();
                }
            }

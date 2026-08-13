            package p000;
            
            public final class OololIOo implements i00O0OOIlOO {
                public String I00000oIO;
                public OIooliIO0 I00000oOI;

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

                public final Ioo1Io I0000oI00() {
/* 7 */             return (Ioo1Io) this.I00000oOI.getValue();
                }

                public final void I0001Ioi1lo(Ioo1Io ioo1Io) {
/* 3 */             this.I00000oOI.setValue(ioo1Io);
                }

                public final boolean equals(Object obj) {
/* 1 */             if (obj == this) {
/* 3 */                 return true;
                    }
/* 7 */             if (obj instanceof OololIOo) {
/* 21 */                return O0000Ioio00.I0000O(I0000oI00(), ((OololIOo) obj).I0000oI00());
                    }
/* 9 */             return false;
                }

                public final int hashCode() {
/* 3 */             return this.I00000oIO.hashCode();
                }

                public final String toString() {
/* 1 */             String str = this.I00000oIO;
/* 7 */             int i = I0000oI00().I00000oIO;
/* 13 */            int i2 = I0000oI00().I00000oOI;
/* 19 */            int i3 = I0000oI00().I0000Il00O;
/* 25 */            int i4 = I0000oI00().I0000O;
/* 29 */            StringBuilder sb = new StringBuilder(str);
/* 34 */            sb.append("(left=");
/* 37 */            sb.append(i);
/* 42 */            sb.append(", top=");
/* 45 */            sb.append(i2);
/* 52 */            IIlIOloOOO.I001l0I00(sb, ", right=", i3, ", bottom=", i4);
/* 57 */            sb.append(")");
/* 60 */            return sb.toString();
                }
            }

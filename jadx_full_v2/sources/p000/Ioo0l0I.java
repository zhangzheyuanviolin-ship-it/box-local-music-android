            package p000;

            import android.graphics.Insets;
            
            public final class Ioo0l0I {
                public static final Ioo0l0I I0000oI00 = new Ioo0l0I(0, 0, 0, 0);
                public final int I00000oIO;
                public final int I00000oOI;
                public final int I0000Il00O;
                public final int I0000O;

                public Ioo0l0I(int i, int i2, int i3, int i4) {
/* 4 */             this.I00000oIO = i;
/* 6 */             this.I00000oOI = i2;
/* 8 */             this.I0000Il00O = i3;
/* 10 */            this.I0000O = i4;
                }

                public static Ioo0l0I I00000oIO(int i, int i2, int i3, int i4) {
                    return (i == 0 && i2 == 0 && i3 == 0 && i4 == 0) ? I0000oI00 : new Ioo0l0I(i, i2, i3, i4);
                }

                public static Ioo0l0I I00000oOI(Insets insets) {
/* 9 */             return I00000oIO(insets.left, insets.top, insets.right, insets.bottom);
                }

                public final Insets I0000Il00O() {
/* 9 */             return Insets.of(this.I00000oIO, this.I00000oOI, this.I0000Il00O, this.I0000O);
                }

                public final boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
/* 6 */             if (obj == null || Ioo0l0I.class != obj.getClass()) {
/* 5 */                 return false;
                    }
/* 17 */            Ioo0l0I ioo0l0I = (Ioo0l0I) obj;
                    return this.I0000O == ioo0l0I.I0000O && this.I00000oIO == ioo0l0I.I00000oIO && this.I0000Il00O == ioo0l0I.I0000Il00O && this.I00000oOI == ioo0l0I.I00000oOI;
                }

                public final int hashCode() {
/* 17 */            return (((((this.I00000oIO * 31) + this.I00000oOI) * 31) + this.I0000Il00O) * 31) + this.I0000O;
                }

                public final String toString() {
/* 5 */             StringBuilder sb = new StringBuilder("Insets{left=");
/* 10 */            sb.append(this.I00000oIO);
/* 15 */            sb.append(", top=");
/* 20 */            sb.append(this.I00000oOI);
/* 25 */            sb.append(", right=");
/* 30 */            sb.append(this.I0000Il00O);
/* 35 */            sb.append(", bottom=");
/* 42 */            return Oi010OO0.I001i1lo1io(sb, this.I0000O, '}');
                }
            }

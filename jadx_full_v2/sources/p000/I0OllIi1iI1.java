            package p000;

            import java.util.Objects;
            
            public final class I0OllIi1iI1 extends I0OIoOl0l0I0 {
                public int I00000oIO;
                public int I00000oOI;
                public int I0000Il00O;
                public IIlIi0lIii I0000O;

                public final boolean equals(Object obj) {
/* 4 */             if (!(obj instanceof I0OllIi1iI1)) {
/* 3 */                 return false;
                    }
/* 7 */             I0OllIi1iI1 i0OllIi1iI1 = (I0OllIi1iI1) obj;
                    return i0OllIi1iI1.I00000oIO == this.I00000oIO && i0OllIi1iI1.I00000oOI == this.I00000oOI && i0OllIi1iI1.I0000Il00O == this.I0000Il00O && i0OllIi1iI1.I0000O == this.I0000O;
                }

                public final int hashCode() {
/* 25 */            return Objects.hash(Integer.valueOf(this.I00000oIO), Integer.valueOf(this.I00000oOI), Integer.valueOf(this.I0000Il00O), this.I0000O);
                }

                public final String toString() {
/* 5 */             StringBuilder sb = new StringBuilder("AesEax Parameters (variant: ");
/* 10 */            sb.append(this.I0000O);
/* 15 */            sb.append(", ");
/* 20 */            sb.append(this.I00000oOI);
/* 25 */            sb.append("-byte IV, ");
/* 30 */            sb.append(this.I0000Il00O);
/* 35 */            sb.append("-byte tag, and ");
/* 42 */            return IIl001iO0Io.I000lI(this.I00000oIO, "-byte key)", sb);
                }
            }

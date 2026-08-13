            package p000;

            import java.util.Objects;
            
            public final class I0i000lio extends I0OIoOl0l0I0 {
                public int I00000oIO;
                public int I00000oOI;
                public int I0000Il00O;
                public I0OooiI1I I0000O;

                public final boolean equals(Object obj) {
/* 4 */             if (!(obj instanceof I0i000lio)) {
/* 3 */                 return false;
                    }
/* 7 */             I0i000lio i0i000lio = (I0i000lio) obj;
                    return i0i000lio.I00000oIO == this.I00000oIO && i0i000lio.I00000oOI == this.I00000oOI && i0i000lio.I0000Il00O == this.I0000Il00O && i0i000lio.I0000O == this.I0000O;
                }

                public final int hashCode() {
/* 25 */            return Objects.hash(Integer.valueOf(this.I00000oIO), Integer.valueOf(this.I00000oOI), Integer.valueOf(this.I0000Il00O), this.I0000O);
                }

                public final String toString() {
/* 5 */             StringBuilder sb = new StringBuilder("AesGcm Parameters (variant: ");
/* 10 */            sb.append(this.I0000O);
/* 15 */            sb.append(", ");
/* 20 */            sb.append(this.I00000oOI);
/* 25 */            sb.append("-byte IV, ");
/* 30 */            sb.append(this.I0000Il00O);
/* 35 */            sb.append("-byte tag, and ");
/* 42 */            return IIl001iO0Io.I000lI(this.I00000oIO, "-byte key)", sb);
                }
            }

            package p000;

            import java.util.Objects;
            
            public final class I0i0l1O extends I0OIoOl0l0I0 {
                public int I00000oIO;
                public I0i0io0oOOi I00000oOI;

                public final boolean equals(Object obj) {
/* 4 */             if (!(obj instanceof I0i0l1O)) {
/* 3 */                 return false;
                    }
/* 7 */             I0i0l1O i0i0l1O = (I0i0l1O) obj;
                    return i0i0l1O.I00000oIO == this.I00000oIO && i0i0l1O.I00000oOI == this.I00000oOI;
                }

                public final int hashCode() {
/* 13 */            return Objects.hash(Integer.valueOf(this.I00000oIO), this.I00000oOI);
                }

                public final String toString() {
/* 5 */             StringBuilder sb = new StringBuilder("AesGcmSiv Parameters (variant: ");
/* 10 */            sb.append(this.I00000oOI);
/* 15 */            sb.append(", ");
/* 22 */            return IIl001iO0Io.I000lI(this.I00000oIO, "-byte key)", sb);
                }
            }

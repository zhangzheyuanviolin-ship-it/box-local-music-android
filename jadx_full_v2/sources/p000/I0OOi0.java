            package p000;

            import java.util.Objects;
            
            public final class I0OOi0 extends I0OIoOl0l0I0 {
                public int I00000oIO;
                public int I00000oOI;
                public I0OOO1l0IoO I0000Il00O;

                public final int I00000oIO() {
/* 1 */             int i = this.I00000oOI;
/* 3 */             I0OOO1l0IoO i0OOO1l0IoO = this.I0000Il00O;
/* 7 */             if (i0OOO1l0IoO == I0OOO1l0IoO.I0001Ioi1lo) {
/* 9 */                 return i;
                    }
/* 12 */            if (i0OOO1l0IoO == I0OOO1l0IoO.I0000Il00O) {
/* 14 */                return i + 5;
                    }
/* 19 */            if (i0OOO1l0IoO == I0OOO1l0IoO.I0000O) {
/* 21 */                return i + 5;
                    }
/* 26 */            if (i0OOO1l0IoO == I0OOO1l0IoO.I0000oI00) {
/* 28 */                return i + 5;
                    }
/* 33 */            I000II.I001IO000("Unknown variant");
/* 36 */            return 0;
                }

                public final boolean equals(Object obj) {
/* 4 */             if (!(obj instanceof I0OOi0)) {
/* 3 */                 return false;
                    }
/* 7 */             I0OOi0 i0OOi0 = (I0OOi0) obj;
                    return i0OOi0.I00000oIO == this.I00000oIO && i0OOi0.I00000oIO() == I00000oIO() && i0OOi0.I0000Il00O == this.I0000Il00O;
                }

                public final int hashCode() {
/* 19 */            return Objects.hash(Integer.valueOf(this.I00000oIO), Integer.valueOf(this.I00000oOI), this.I0000Il00O);
                }

                public final String toString() {
/* 5 */             StringBuilder sb = new StringBuilder("AES-CMAC Parameters (variant: ");
/* 10 */            sb.append(this.I0000Il00O);
/* 15 */            sb.append(", ");
/* 20 */            sb.append(this.I00000oOI);
/* 25 */            sb.append("-byte tags, and ");
/* 32 */            return IIl001iO0Io.I000lI(this.I00000oIO, "-byte key)", sb);
                }
            }

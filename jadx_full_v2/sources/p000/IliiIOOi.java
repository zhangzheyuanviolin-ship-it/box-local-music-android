            package p000;

            import java.util.List;
            import java.util.Objects;
            
            public final class IliiIOOi {
                public String I00000oIO;
                public String I00000oOI;
                public List I0000Il00O;

                public final boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
/* 8 */             if (!(obj instanceof IliiIOOi)) {
/* 7 */                 return false;
                    }
/* 11 */            IliiIOOi iliiIOOi = (IliiIOOi) obj;
                    return Objects.equals(this.I00000oIO, iliiIOOi.I00000oIO) && Objects.equals(this.I00000oOI, iliiIOOi.I00000oOI) && Objects.equals(this.I0000Il00O, iliiIOOi.I0000Il00O);
                }

                public final int hashCode() {
/* 11 */            return Objects.hash(this.I00000oIO, this.I00000oOI, this.I0000Il00O);
                }
            }

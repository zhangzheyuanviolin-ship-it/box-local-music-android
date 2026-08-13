            package p000;

            import kotlin.jvm.functions.Function1;
            
            public final class Ol0oo1IioO {
                public final Function1 I00000oIO;
                public final IlIoO1ilo1 I00000oOI;

                public Ol0oo1IioO(Function1 function1, IlIoO1ilo1 ilIoO1ilo1) {
/* 4 */             this.I00000oIO = function1;
/* 6 */             this.I00000oOI = ilIoO1ilo1;
                }

                public final boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
/* 8 */             if (!(obj instanceof Ol0oo1IioO)) {
/* 7 */                 return false;
                    }
/* 11 */            Ol0oo1IioO ol0oo1IioO = (Ol0oo1IioO) obj;
                    return O0000Ioio00.I0000O(this.I00000oIO, ol0oo1IioO.I00000oIO) && O0000Ioio00.I0000O(this.I00000oOI, ol0oo1IioO.I00000oOI);
                }

                public final int hashCode() {
/* 15 */            return this.I00000oOI.hashCode() + (this.I00000oIO.hashCode() * 31);
                }

                public final String toString() {
/* 28 */            return "Slide(slideOffset=" + this.I00000oIO + ", animationSpec=" + this.I00000oOI + ")";
                }
            }

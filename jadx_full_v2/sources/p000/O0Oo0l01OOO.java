            package p000;

            import java.lang.invoke.VarHandle;
            
            public final class O0Oo0l01OOO extends O0Oli0OO {
                public int I00000oIO;

                @Override
                public final Object I00000oIO() {
/* 1 */             int i = this.I00000oIO;
/* 5 */             Ooi01Oi0II ooi01Oi0II = new Ooi01Oi0II();
/* 8 */             ooi01Oi0II.I00iOIl = i;
/* 10 */            VarHandle.storeStoreFence();
/* 29 */            return ooi01Oi0II;
                }

                public final boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
                    return (obj instanceof O0Oo0l01OOO) && this.I00000oIO == ((O0Oo0l01OOO) obj).I00000oIO;
                }

                public final int hashCode() {
/* 3 */             return Integer.hashCode(this.I00000oIO);
                }
            }

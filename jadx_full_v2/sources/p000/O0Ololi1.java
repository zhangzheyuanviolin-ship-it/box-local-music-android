            package p000;

            import java.lang.invoke.VarHandle;
            
            public final class O0Ololi1 extends O0Oli0OO {
                public byte I00000oIO;

                @Override
                public final Object I00000oIO() {
/* 1 */             byte b = this.I00000oIO;
/* 5 */             OoOoil0I ooOoil0I = new OoOoil0I();
/* 8 */             ooOoil0I.I00iOIl = b;
/* 10 */            VarHandle.storeStoreFence();
/* 29 */            return ooOoil0I;
                }

                public final boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
                    return (obj instanceof O0Ololi1) && this.I00000oIO == ((O0Ololi1) obj).I00000oIO;
                }

                public final int hashCode() {
/* 3 */             return Byte.hashCode(this.I00000oIO);
                }
            }

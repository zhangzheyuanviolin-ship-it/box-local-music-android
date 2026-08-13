            package p000;

            import java.lang.invoke.VarHandle;
            
            public final class O0Oo1iool extends O0Oli0OO {
                public short I00000oIO;

                @Override
                public final Object I00000oIO() {
/* 1 */             short s = this.I00000oIO;
/* 5 */             Ooi1IIOloiii ooi1IIOloiii = new Ooi1IIOloiii();
/* 8 */             ooi1IIOloiii.I00iOIl = s;
/* 10 */            VarHandle.storeStoreFence();
/* 29 */            return ooi1IIOloiii;
                }

                public final boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
                    return (obj instanceof O0Oo1iool) && this.I00000oIO == ((O0Oo1iool) obj).I00000oIO;
                }

                public final int hashCode() {
/* 3 */             return Short.hashCode(this.I00000oIO);
                }
            }

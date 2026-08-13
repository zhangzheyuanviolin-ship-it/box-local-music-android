            package p000;

            import java.lang.invoke.VarHandle;
            
            public final class Ilil10oOo {
                public int I00000oIO;

                public static final Ilil10oOo I00000oIO(int i) {
/* 3 */             Ilil10oOo ilil10oOo = new Ilil10oOo();
/* 6 */             ilil10oOo.I00000oIO = i;
/* 8 */             VarHandle.storeStoreFence();
/* 29 */            return ilil10oOo;
                }

                public final boolean equals(Object obj) {
                    return (obj instanceof Ilil10oOo) && this.I00000oIO == ((Ilil10oOo) obj).I00000oIO;
                }

                public final int hashCode() {
/* 3 */             return Integer.hashCode(this.I00000oIO);
                }

                public final String toString() {
/* 1 */             int i = this.I00000oIO;
                    return i == 0 ? "None" : i == 1 ? "Weight" : i == 2 ? "Style" : i == 65535 ? "All" : "Invalid";
                }
            }

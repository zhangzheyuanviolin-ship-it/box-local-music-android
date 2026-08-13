            package p000;

            import java.lang.invoke.VarHandle;
            
            public final class Ilil10i {
                public int I00000oIO;

                public static final Ilil10i I00000oIO(int i) {
/* 3 */             Ilil10i ilil10i = new Ilil10i();
/* 6 */             ilil10i.I00000oIO = i;
/* 8 */             VarHandle.storeStoreFence();
/* 29 */            return ilil10i;
                }

                public final boolean equals(Object obj) {
                    return (obj instanceof Ilil10i) && this.I00000oIO == ((Ilil10i) obj).I00000oIO;
                }

                public final int hashCode() {
/* 3 */             return Integer.hashCode(this.I00000oIO);
                }

                public final String toString() {
/* 1 */             int i = this.I00000oIO;
                    return i == 0 ? OIllioIilO.I01IO1il : i == 1 ? "Italic" : "Invalid";
                }
            }

            package p000;

            import java.lang.invoke.VarHandle;
            
            public final class Ili0i1il0l0l {
                public int I00000oIO;

                public static final Ili0i1il0l0l I00000oIO(int i) {
/* 3 */             Ili0i1il0l0l ili0i1il0l0l = new Ili0i1il0l0l();
/* 6 */             ili0i1il0l0l.I00000oIO = i;
/* 8 */             VarHandle.storeStoreFence();
/* 29 */            return ili0i1il0l0l;
                }

                public static String I00000oOI(int i) {
                    return i == 1 ? "Next" : i == 2 ? "Previous" : i == 3 ? "Left" : i == 4 ? "Right" : i == 5 ? "Up" : i == 6 ? "Down" : i == 7 ? "Enter" : i == 8 ? "Exit" : "Invalid FocusDirection";
                }

                public final boolean equals(Object obj) {
                    return (obj instanceof Ili0i1il0l0l) && this.I00000oIO == ((Ili0i1il0l0l) obj).I00000oIO;
                }

                public final int hashCode() {
/* 3 */             return Integer.hashCode(this.I00000oIO);
                }

                public final String toString() {
/* 3 */             return I00000oOI(this.I00000oIO);
                }
            }

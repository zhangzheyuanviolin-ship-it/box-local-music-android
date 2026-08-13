            package p000;

            import java.lang.ref.WeakReference;
            
            public final class i000OI {
                public WeakReference I00000oIO;
                public int I00000oOI;

                public final boolean equals(Object obj) {
                    return (obj instanceof i000OI) && this.I00000oIO.get() == ((i000OI) obj).I00000oIO.get();
                }

                public final int hashCode() {
/* 1 */             return this.I00000oOI;
                }

                public final String toString() {
                    String string;
/* 7 */             ClassLoader classLoader = (ClassLoader) this.I00000oIO.get();
                    return (classLoader == null || (string = classLoader.toString()) == null) ? "<null>" : string;
                }
            }

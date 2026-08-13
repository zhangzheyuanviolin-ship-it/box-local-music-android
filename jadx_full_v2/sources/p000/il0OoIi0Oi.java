            package p000;

            import java.util.ArrayList;
            import java.util.Iterator;
            
            public final class il0OoIi0Oi extends il0ioI1OI implements Iterable {
                public ArrayList I00iOIl;

                public final boolean equals(Object obj) {
/* 2 */             if (obj != this) {
                        return (obj instanceof il0OoIi0Oi) && ((il0OoIi0Oi) obj).I00iOIl.equals(this.I00iOIl);
                    }
/* 1 */             return true;
                }

                public final int hashCode() {
/* 3 */             return this.I00iOIl.hashCode();
                }

                @Override
                public final Iterator iterator() {
/* 3 */             return this.I00iOIl.iterator();
                }
            }

            package p000;

            import java.util.ArrayList;
            import java.util.Iterator;
            
            public final class llI001IilOi extends llII0l1O1l1 implements Iterable {
                public ArrayList I00iOIl;

                public final boolean equals(Object obj) {
/* 2 */             if (obj != this) {
                        return (obj instanceof llI001IilOi) && ((llI001IilOi) obj).I00iOIl.equals(this.I00iOIl);
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

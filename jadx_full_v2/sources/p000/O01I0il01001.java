            package p000;

            import java.util.ArrayList;
            import java.util.Iterator;
            
            public final class O01I0il01001 extends O01O10Ii implements Iterable {
                public final ArrayList I00iOIl = new ArrayList();

                @Override
                public final String I0000O() {
/* 1 */             ArrayList arrayList = this.I00iOIl;
/* 3 */             int size = arrayList.size();
/* 8 */             if (size == 1) {
/* 17 */                return ((O01O10Ii) arrayList.get(0)).I0000O();
                    }
/* 28 */            I000II.I001IO000(Oi010OO0.I000oI1ioi(size, "Array must have size 1, but has size "));
/* 31 */            return null;
                }

                public final void I0000oI00(O01O10Ii o01O10Ii) {
/* 1 */             if (o01O10Ii == null) {
/* 3 */                 o01O10Ii = O01iIOolI.I00iOIl;
                    }
/* 7 */             this.I00iOIl.add(o01O10Ii);
                }

                public final boolean equals(Object obj) {
/* 1 */             if (obj != this) {
                        return (obj instanceof O01I0il01001) && ((O01I0il01001) obj).I00iOIl.equals(this.I00iOIl);
                    }
/* 22 */            return true;
                }

                public final int hashCode() {
/* 3 */             return this.I00iOIl.hashCode();
                }

                @Override
                public final Iterator iterator() {
/* 3 */             return this.I00iOIl.iterator();
                }
            }

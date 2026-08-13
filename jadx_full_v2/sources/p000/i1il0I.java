            package p000;

            import java.util.Iterator;
            
            public final class i1il0I implements Iterator {
                public Iterator I00iOIl;
                public Iterator I00iiI;

                @Override
                public final boolean hasNext() {
/* 7 */             if (this.I00iOIl.hasNext()) {
/* 9 */                 return true;
                    }
/* 13 */            return this.I00iiI.hasNext();
                }

                @Override
                public final Object next() {
/* 1 */             Iterator it = this.I00iOIl;
/* 7 */             if (it.hasNext()) {
/* 21 */                return new iOO00I0O(((Integer) it.next()).toString());
                    }
/* 25 */            Iterator it2 = this.I00iiI;
/* 31 */            if (it2.hasNext()) {
/* 41 */                return new iOO00I0O((String) it2.next());
                    }
/* 45 */            IoOOl0iOl1io.I00000oOI();
/* 48 */            return null;
                }
            }

            package p000;

            import java.util.Iterator;
            import java.util.Set;
            
            public abstract class iOo0iiol extends i0IIio0oIoio implements Set {
                public transient iOio11oiIi0I I00lll10;

                public final iOio11oiIi0I I001i1O0Ol() {
/* 1 */             iOio11oiIi0I ioio11oiii0i = this.I00lll10;
/* 3 */             if (ioio11oiii0i != null) {
/* 29 */                return ioio11oiii0i;
                    }
/* 10 */            iiIIOo01Io0 iiiioo01io0 = new iiIIOo01Io0((iiIiIlIo0) this);
/* 13 */            this.I00lll10 = iiiioo01io0;
/* 15 */            return iiiioo01io0;
                }

                @Override
                public final boolean equals(Object obj) {
/* 2 */             if (obj == this || obj == this) {
/* 1 */                 return true;
                    }
/* 10 */            if (obj instanceof Set) {
/* 12 */                Set set = (Set) obj;
                        try {
/* 22 */                    if (size() == set.size()) {
                                return containsAll(set);
                            }
                        } catch (ClassCastException | NullPointerException unused) {
                        }
                    }
/* 9 */             return false;
                }

                @Override
                public final int hashCode() {
/* 1 */             Iterator it = iterator();
/* 6 */             int iHashCode = 0;
/* 11 */            while (it.hasNext()) {
/* 13 */                Object next = it.next();
/* 25 */                iHashCode += next != null ? next.hashCode() : 0;
                    }
/* 29 */            return iHashCode;
                }
            }

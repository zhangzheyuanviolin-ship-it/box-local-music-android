            package p000;

            import java.util.Iterator;
            import java.util.Set;
            
            public abstract class io1ilIOo extends io0I1oIiiili implements Set {
                public transient io0o00I1ol1o I00iiI;

                @Override
                public io0o00I1ol1o I0001Ioi1lo() {
/* 1 */             io0o00I1ol1o io0o00i1ol1o = this.I00iiI;
/* 3 */             if (io0o00i1ol1o != null) {
/* 20 */                return io0o00i1ol1o;
                    }
/* 5 */             io0o00I1ol1o io0o00i1ol1oI000iOII = I000iOII();
/* 9 */             this.I00iiI = io0o00i1ol1oI000iOII;
/* 20 */            return io0o00i1ol1oI000iOII;
                }

                public io0o00I1ol1o I000iOII() {
/* 3 */             Object[] array = toArray(io0I1oIiiili.I00iOIl);
/* 7 */             io0iIOO0 io0iioo0 = io0o00I1ol1o.I00iiI;
/* 10 */            return io0o00I1ol1o.I000lI(array.length, array);
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
/* 55 */            return iHashCode;
                }
            }

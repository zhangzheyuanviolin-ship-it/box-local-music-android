            package p000;

            import java.util.Iterator;
            import java.util.Set;
            
            public abstract class io10ooI0OiIl extends ilooOi1I1 implements Set {
                public transient io0OIIlOli1 I00iiI;

                @Override
                public io0OIIlOli1 I0001Ioi1lo() {
/* 1 */             io0OIIlOli1 io0oiiloli1 = this.I00iiI;
/* 3 */             if (io0oiiloli1 != null) {
/* 20 */                return io0oiiloli1;
                    }
/* 5 */             io0OIIlOli1 io0oiiloli1I000iOII = I000iOII();
/* 9 */             this.I00iiI = io0oiiloli1I000iOII;
/* 20 */            return io0oiiloli1I000iOII;
                }

                public io0OIIlOli1 I000iOII() {
/* 3 */             Object[] array = toArray(ilooOi1I1.I00iOIl);
/* 7 */             io00I0oIIIi io00i0oiiii = io0OIIlOli1.I00iiI;
/* 10 */            return io0OIIlOli1.I000lI(array.length, array);
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

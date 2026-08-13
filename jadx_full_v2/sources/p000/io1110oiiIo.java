            package p000;

            import java.util.Iterator;
            import java.util.Set;
            
            public abstract class io1110oiiIo extends ilooiO0I implements Set {
                public transient io0OO101I I00iiI;

                @Override
                public io0OO101I I0001Ioi1lo() {
/* 1 */             io0OO101I io0oo101i = this.I00iiI;
/* 3 */             if (io0oo101i != null) {
/* 20 */                return io0oo101i;
                    }
/* 5 */             io0OO101I io0oo101iI000iOII = I000iOII();
/* 9 */             this.I00iiI = io0oo101iI000iOII;
/* 20 */            return io0oo101iI000iOII;
                }

                public io0OO101I I000iOII() {
/* 3 */             Object[] array = toArray(ilooiO0I.I00iOIl);
/* 7 */             io00III0o0i io00iii0o0i = io0OO101I.I00iiI;
/* 10 */            return io0OO101I.I000lI(array.length, array);
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

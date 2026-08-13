            package p000;

            import java.util.HashSet;
            import java.util.Iterator;
            import java.util.Set;
            
            public abstract class lOI00O {
                public static int I00000oIO(Set set) {
/* 1 */             Iterator it = set.iterator();
/* 6 */             int i = 0;
/* 11 */            while (it.hasNext()) {
/* 13 */                Object next = it.next();
/* 27 */                i = ~(~(i + (next != null ? next.hashCode() : 0)));
                    }
/* 29 */            return i;
                }

                public static HashSet I00000oOI(int i) {
                    int iCeil;
/* 4 */             if (i < 3) {
/* 8 */                 ii1oO1IOiI1o.I00000oIO(i, "expectedSize");
/* 11 */                iCeil = i + 1;
                    } else {
/* 28 */                iCeil = i < 1073741824 ? (int) Math.ceil(i / 0.75d) : Integer.MAX_VALUE;
                    }
/* 31 */            return new HashSet(iCeil);
                }
            }

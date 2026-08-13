            package p000;

            import java.util.HashSet;
            import java.util.Iterator;
            import java.util.Set;
            
            public abstract class l1IiOIii00o1 {
                public static final HashSet I00000oIO(Iterable iterable) {
/* 3 */             HashSet hashSet = new HashSet();
/* 6 */             Iterator it = iterable.iterator();
/* 14 */            while (it.hasNext()) {
/* 22 */                Set setI0000O = ((O1iil1I01o) it.next()).I0000O();
/* 28 */                if (setI0000O == null) {
/* 30 */                    return null;
                        }
/* 32 */                IOOii0O10Io0.I00100l0(hashSet, setI0000O);
                    }
/* 49 */            return hashSet;
                }
            }

            package p000;

            import java.util.Collection;
            import java.util.Iterator;
            
            public abstract class iOoi0l1IOiiI {
                public static boolean I00000oIO(IIiO00o1o iIiO00o1o) {
/* 11 */            if (!IIIOooO0ol.I0000O.contains(iIiO00o1o.getName())) {
/* 86 */                return false;
                    }
/* 26 */            if (IOOi0Ool1i.I001i1O0Ol(IIIOooO0ol.I0000Il00O, IiOiOOIo.I0000Il00O(iIiO00o1o)) && iIiO00o1o.I00Iooi00oi().isEmpty()) {
/* 84 */                return true;
                    }
/* 43 */            if (!O0i1lI0o1io.I001l0I00(iIiO00o1o)) {
/* 86 */                return false;
                    }
/* 46 */            Collection collectionI000o00OoI0I = iIiO00o1o.I000o00OoI0I();
/* 59 */            if (collectionI000o00OoI0I.isEmpty()) {
/* 86 */                return false;
                    }
/* 62 */            Iterator it = collectionI000o00OoI0I.iterator();
/* 70 */            while (it.hasNext()) {
/* 82 */                if (I00000oIO((IIiO00o1o) it.next())) {
/* 84 */                    return true;
                        }
                    }
/* 86 */            return false;
                }
            }

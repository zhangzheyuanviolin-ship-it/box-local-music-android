            package p000;

            import java.util.Collection;
            import java.util.Iterator;
            
            public abstract class ilO01lO {
                public static final O0Oooi0I1 I00000oIO(Collection collection, O0i001110 o0i001110) {
/* 1 */             Iterator it = collection.iterator();
/* 6 */             O0Oooi0I1 o0Oooi0I1 = null;
/* 11 */            while (it.hasNext()) {
/* 17 */                O0Oooi0I1 o0Oooi0I12 = (O0Oooi0I1) it.next();
/* 27 */                if (O0000Ioio00.I0000O(o0Oooi0I12.getType(), o0i001110)) {
/* 29 */                    if (o0Oooi0I1 != null) {
/* 35 */                        IoOOl0iOl1io.I000OOo1O("Multiple extensions handle the same extension type: ", o0i001110);
/* 5 */                         return null;
                            }
/* 31 */                    o0Oooi0I1 = o0Oooi0I12;
                        }
                    }
/* 39 */            if (o0Oooi0I1 != null) {
/* 41 */                return o0Oooi0I1;
                    }
/* 44 */            IoOOl0iOl1io.I000OOo1O("No extensions handle the extension type: ", o0i001110);
/* 5 */             return null;
                }
            }

            package p000;

            import java.lang.reflect.Type;
            import java.util.Iterator;
            
            public abstract class OOoIlii implements O00l0Oi0o {
                @Override
                public OOo1O1i I00000oIO(Ill0IO ill0IO) {
                    Object next;
/* 7 */             Iterator it = getAnnotations().iterator();
                    while (true) {
/* 15 */                if (!it.hasNext()) {
/* 51 */                    next = null;
                            break;
                        }
/* 17 */                next = it.next();
/* 48 */                if (O0000Ioio00.I0000O(OOo1Io0I0.I00000oIO(((IOIO10iOi1) l0O00Ol.I00000oIO(((OOo1O1i) next).I00000oIO)).I001l0I00()).I00000oIO(), ill0IO)) {
                            break;
                        }
                    }
/* 52 */            return (OOo1O1i) next;
                }

                public abstract Type I00000oOI();

                public final boolean equals(Object obj) {
                    return (obj instanceof OOoIlii) && O0000Ioio00.I0000O(I00000oOI(), ((OOoIlii) obj).I00000oOI());
                }

                public final int hashCode() {
/* 5 */             return I00000oOI().hashCode();
                }

                public final String toString() {
/* 26 */            return getClass().getName() + ": " + I00000oOI();
                }
            }

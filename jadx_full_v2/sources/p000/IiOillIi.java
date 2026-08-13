            package p000;

            import java.util.Iterator;
            import java.util.List;
            
            public class IiOillIi implements I11IlOOO {
                public static final O0O00I1Ili[] I00iiI = {OOoOl0i.I00000oIO.I000O01llI0(new OOOOIO0i(IiOillIi.class, "annotations", "getAnnotations()Ljava/util/List;", 0))};
                public final O1I0II11i I00iOIl;

                public IiOillIi(O1I0OloI o1I0OloI, IllOOo00lI illOOo00lI) {
/* 9 */             this.I00iOIl = new O1I0II11i(o1I0OloI, illOOo00lI);
                }

                @Override
                public final boolean I001l0I00(Ill0IO ill0IO) {
                    return I00IOO(ill0IO) != null;
                }

                @Override
                public final I111oOiIiO0 I00IOO(Ill0IO ill0IO) {
                    Object next;
/* 1 */             Iterator it = iterator();
                    while (true) {
/* 9 */                 if (!it.hasNext()) {
/* 29 */                    next = null;
                            break;
                        }
/* 11 */                next = it.next();
/* 26 */                if (O0000Ioio00.I0000O(((I111oOiIiO0) next).I0010o(), ill0IO)) {
                            break;
                        }
                    }
/* 30 */            return (I111oOiIiO0) next;
                }

                @Override
                public boolean isEmpty() {
/* 4 */             O0O00I1Ili o0O00I1Ili = I00iiI[0];
/* 14 */            return ((List) this.I00iOIl.invoke()).isEmpty();
                }

                @Override
                public final Iterator iterator() {
/* 4 */             O0O00I1Ili o0O00I1Ili = I00iiI[0];
/* 14 */            return ((List) this.I00iOIl.invoke()).iterator();
                }
            }

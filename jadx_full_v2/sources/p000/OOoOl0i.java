            package p000;

            import java.util.Collections;
            
            public abstract class OOoOl0i {
                public static final OOoOl1001II I00000oIO;

                static {
/* 1 */             OOoOl1001II oOoOl1001II = null;
                    try {
/* 8 */                 oOoOl1001II = (OOoOl1001II) OOoOlioi0IO.class.newInstance();
                    } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException unused) {
                    }
/* 11 */            if (oOoOl1001II == null) {
/* 16 */                oOoOl1001II = new OOoOl1001II();
                    }
/* 19 */            I00000oIO = oOoOl1001II;
                }

                public static O0O01O0o I00000oIO(Class cls) {
/* 1 */             OOoOl1001II oOoOl1001II = I00000oIO;
/* 10 */            return oOoOl1001II.I000lI(oOoOl1001II.I00000oOI(cls), Collections.EMPTY_LIST, false);
                }

                public static O0O01O0o I00000oOI(Class cls, O0O0o1io o0O0o1io) {
/* 1 */             OOoOl1001II oOoOl1001II = I00000oIO;
/* 12 */            return oOoOl1001II.I000lI(oOoOl1001II.I00000oOI(cls), Collections.singletonList(o0O0o1io), false);
                }

                public static O0O01O0o I0000Il00O(Class cls, O0O0o1io... o0O0o1ioArr) {
/* 1 */             OOoOl1001II oOoOl1001II = I00000oIO;
/* 12 */            return oOoOl1001II.I000lI(oOoOl1001II.I00000oOI(cls), I1IoiO1l.I00IioO0OiOi(o0O0o1ioArr), false);
                }
            }

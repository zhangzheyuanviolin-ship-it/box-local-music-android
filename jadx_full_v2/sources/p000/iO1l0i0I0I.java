            package p000;

            import java.lang.invoke.VarHandle;
            import java.util.HashMap;
            import java.util.Iterator;
            import java.util.Set;
            
            public abstract class iO1l0i0I0I {
                public static final ii10o1 I00000oIO;
                public static final ii1IlO0lI0 I00000oOI;

                static {
/* 3 */             int i = 1;
/* 7 */             I00000oIO = new ii10o1(i);
/* 14 */            I00000oOI = new ii1IlO0lI0(i);
                }

                public static ii1llo1liOl0 I00000oIO(Set set) {
/* 3 */             ii1llo1liOl0 ii1llo1liol0 = new ii1llo1liOl0();
/* 11 */            ii1llo1liol0.I00000oIO = new HashMap();
/* 18 */            ii1llo1liol0.I00000oOI = new HashMap();
/* 22 */            ii1llo1liol0.I0000Il00O = I00000oIO;
/* 24 */            VarHandle.storeStoreFence();
/* 29 */            ii1llo1liol0.I0000O = I00000oOI;
/* 31 */            Iterator it = set.iterator();
/* 39 */            while (it.hasNext()) {
/* 45 */                iIIoI1 iiioi1 = (iIIoI1) it.next();
/* 47 */                HashMap map = ii1llo1liol0.I00000oOI;
/* 49 */                HashMap map2 = ii1llo1liol0.I00000oIO;
/* 53 */                lio00OOillO.I00000oIO("key", iiioi1);
/* 56 */                boolean z = iiioi1.I0000Il00O;
/* 58 */                if (!z) {
/* 78 */                    map.remove(iiioi1);
/* 83 */                    map2.put(iiioi1, ii1llo1liOl0.I0000oI00);
                        } else {
/* 60 */                    if (!z) {
/* 73 */                        I000II.I000iOII("key must be repeating");
/* 76 */                        return null;
                            }
/* 62 */                    map2.remove(iiioi1);
/* 67 */                    map.put(iiioi1, ii1llo1liOl0.I0001Ioi1lo);
                        }
                    }
/* 168 */           return ii1llo1liol0;
                }
            }

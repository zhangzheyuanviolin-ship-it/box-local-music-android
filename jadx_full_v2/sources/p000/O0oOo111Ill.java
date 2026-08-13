            package p000;

            import java.lang.invoke.VarHandle;
            import java.util.ArrayDeque;
            import java.util.HashMap;
            import java.util.LinkedHashMap;
            
            public abstract class O0oOo111Ill {
                public static final LinkedHashMap I00000oIO = new LinkedHashMap();

                public static final O0oOooi1l I00000oIO(int i) {
                    O0oOooi1l o0oOooi1l;
/* 1 */             LinkedHashMap linkedHashMap = I00000oIO;
                    synchronized (linkedHashMap) {
                        try {
/* 4 */                     Integer numValueOf = Integer.valueOf(i);
/* 8 */                     Object obj = linkedHashMap.get(numValueOf);
                            Object obj2 = obj;
/* 12 */                    if (obj == null) {
/* 16 */                        O0oOooi1l o0oOooi1l2 = new O0oOooi1l();
/* 24 */                        o0oOooi1l2.I00000oIO = new Object();
/* 31 */                        o0oOooi1l2.I00000oOI = new HashMap();
/* 38 */                        o0oOooi1l2.I0000Il00O = new HashMap();
/* 45 */                        o0oOooi1l2.I0000O = new ArrayDeque();
/* 47 */                        VarHandle.storeStoreFence();
/* 50 */                        linkedHashMap.put(numValueOf, o0oOooi1l2);
                                obj2 = o0oOooi1l2;
                            }
/* 56 */                    o0oOooi1l = (O0oOooi1l) obj2;
                        } catch (Throwable th) {
/* 77 */                    throw th;
                        }
                    }
/* 59 */            return o0oOooi1l;
                }
            }

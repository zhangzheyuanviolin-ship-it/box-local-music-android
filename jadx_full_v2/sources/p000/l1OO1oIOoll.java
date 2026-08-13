            package p000;

            import java.lang.invoke.VarHandle;
            import java.util.HashMap;
            
            public abstract class l1OO1oIOoll {
                public static O1lOllO I00000oIO(O0IOli0o0 o0IOli0o0, String str) {
                    O1lOllO o1lOllO;
/* 1 */             HashMap map = O1lOllO.I0000Il00O;
                    synchronized (map) {
                        try {
/* 4 */                     Object obj = map.get(str);
                            Object obj2 = obj;
/* 8 */                     if (obj == null) {
/* 12 */                        O1lOllO o1lOllO2 = new O1lOllO();
/* 15 */                        o1lOllO2.I00000oIO = str;
/* 17 */                        o1lOllO2.I00000oOI = o0IOli0o0;
/* 19 */                        VarHandle.storeStoreFence();
/* 22 */                        map.put(str, o1lOllO2);
                                obj2 = o1lOllO2;
                            }
/* 28 */                    o1lOllO = (O1lOllO) obj2;
/* 36 */                    if (!O0000Ioio00.I0000O(o1lOllO.I00000oOI, o0IOli0o0)) {
/* 47 */                        throw new IllegalStateException("Check failed.");
                            }
                        } catch (Throwable th) {
/* 106 */                   throw th;
                        }
                    }
/* 39 */            return o1lOllO;
                }
            }

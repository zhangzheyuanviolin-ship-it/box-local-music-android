            package p000;

            import java.util.Map;
            import java.util.concurrent.ConcurrentHashMap;
            
            public final class IOlOl10 {
                public ConcurrentHashMap I00000oIO;

                public final Object I00000oIO(I1OoollI1Il1 i1OoollI1Il1, IllOOo00lI illOOo00lI) {
/* 1 */             ConcurrentHashMap concurrentHashMap = this.I00000oIO;
/* 3 */             Object obj = concurrentHashMap.get(i1OoollI1Il1);
/* 7 */             if (obj != null) {
/* 9 */                 return obj;
                    }
/* 10 */            Object objInvoke = illOOo00lI.invoke();
/* 14 */            Object objPutIfAbsent = concurrentHashMap.putIfAbsent(i1OoollI1Il1, objInvoke);
                    return objPutIfAbsent == null ? objInvoke : objPutIfAbsent;
                }

                public final Object I00000oOI(I1OoollI1Il1 i1OoollI1Il1) {
/* 1 */             Object objI0000O = I0000O(i1OoollI1Il1);
/* 5 */             if (objI0000O != null) {
/* 7 */                 return objI0000O;
                    }
/* 10 */            IoOOl0iOl1io.I000OOo1O("No instance for key ", i1OoollI1Il1);
/* 13 */            return null;
                }

                public final Map I0000Il00O() {
/* 1 */             return this.I00000oIO;
                }

                public final Object I0000O(I1OoollI1Il1 i1OoollI1Il1) {
/* 5 */             return I0000Il00O().get(i1OoollI1Il1);
                }

                public final void I0000oI00(I1OoollI1Il1 i1OoollI1Il1, Object obj) {
/* 5 */             I0000Il00O().put(i1OoollI1Il1, obj);
                }
            }

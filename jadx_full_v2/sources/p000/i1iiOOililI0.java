            package p000;

            import java.util.concurrent.ConcurrentHashMap;
            
            public abstract class i1iiOOililI0 {
                public final ConcurrentHashMap I00000oIO;

                public i1iiOOililI0(int i) {
                    switch (i) {
                        case 1:
/* 23 */                    this.I00000oIO = new ConcurrentHashMap();
                            break;
                        default:
/* 12 */                    this.I00000oIO = new ConcurrentHashMap();
                            break;
                    }
                }

                public abstract Object I00000oIO();

                public Object I00000oOI(i1IOlOO0OlIi i1ioloo0olii, lilI1ii lili1ii) {
/* 1 */             ConcurrentHashMap concurrentHashMap = this.I00000oIO;
/* 3 */             Object obj = concurrentHashMap.get(i1ioloo0olii);
/* 7 */             if (obj != null) {
/* 9 */                 return obj;
                    }
/* 10 */            Object objI00000oIO = I00000oIO();
/* 14 */            Object objPutIfAbsent = concurrentHashMap.putIfAbsent(i1ioloo0olii, objI00000oIO);
/* 18 */            if (objPutIfAbsent != null) {
/* 106 */               return objPutIfAbsent;
                    }
/* 20 */            int iI00000oIO = lili1ii.I00000oIO();
/* 25 */            for (int i = 0; i < iI00000oIO; i++) {
/* 37 */                if (loO1I0io.I0001Ioi1lo.equals(lili1ii.I00000oOI(i))) {
/* 39 */                    lili1ii.I0000O(i);
                        }
                    }
/* 45 */            return objI00000oIO;
                }

                public Object I0000Il00O(o0oi11O1 o0oi11o1, ll1lIIo ll1liio) {
/* 1 */             ConcurrentHashMap concurrentHashMap = this.I00000oIO;
/* 3 */             Object obj = concurrentHashMap.get(o0oi11o1);
/* 7 */             if (obj != null) {
/* 9 */                 return obj;
                    }
/* 10 */            Object objI00000oIO = I00000oIO();
/* 14 */            Object objPutIfAbsent = concurrentHashMap.putIfAbsent(o0oi11o1, objI00000oIO);
/* 18 */            if (objPutIfAbsent != null) {
/* 106 */               return objPutIfAbsent;
                    }
/* 20 */            int iI00000oIO = ll1liio.I00000oIO();
/* 25 */            for (int i = 0; i < iI00000oIO; i++) {
/* 37 */                if (o0o11001.I0001Ioi1lo.equals(ll1liio.I00000oOI(i))) {
/* 39 */                    ll1liio.I0000Il00O(i);
                        }
                    }
/* 45 */            return objI00000oIO;
                }
            }

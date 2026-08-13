            package p000;

            import kotlin.jvm.functions.Function1;
            
            public abstract class l1l0ii1lOoI1 {
                public static final void I00000oIO(Function1 function1, Object obj, Ii00l101O ii00l101O) {
/* 2 */             IOiIIo1l iOiIIo1lI00000oOI = I00000oOI(function1, obj, null);
/* 6 */             if (iOiIIo1lI00000oOI != null) {
/* 8 */                 iiooO1ll.I00000oIO(ii00l101O, iOiIIo1lI00000oOI);
                    }
                }

                public static final IOiIIo1l I00000oOI(Function1 function1, Object obj, IOiIIo1l iOiIIo1l) {
                    try {
/* 1 */                 function1.invoke(obj);
/* 4 */                 return iOiIIo1l;
                    } catch (Throwable th) {
/* 6 */                 if (iOiIIo1l != null && iOiIIo1l.getCause() != th) {
/* 14 */                    ilIilolOlIoO.I00000oIO(iOiIIo1l, th);
/* 17 */                    return iOiIIo1l;
                        }
/* 36 */                return new IOiIIo1l("Exception in undelivered element handler for " + obj, th, 10);
                    }
                }
            }

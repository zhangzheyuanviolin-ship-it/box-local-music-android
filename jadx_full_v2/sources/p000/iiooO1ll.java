            package p000;
            
            public abstract class iiooO1ll {
                public static final void I00000oIO(Ii00l101O ii00l101O, Throwable th) {
/* 3 */             if (th instanceof IiiI1OOll0l1) {
/* 7 */                 th = ((IiiI1OOll0l1) th).I00iOIl;
                    }
                    try {
/* 15 */                Ii00lil0 ii00lil0 = (Ii00lil0) ii00l101O.I00lli11(IIIOlol.I00iiO);
/* 17 */                if (ii00lil0 != null) {
/* 19 */                    ii00lil0.I00IOO(ii00l101O, th);
                        } else {
/* 25 */                    iioo1llOllO.I00000oIO(ii00l101O, th);
                        }
                    } catch (Throwable th2) {
/* 29 */                if (th != th2) {
/* 36 */                    RuntimeException runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
/* 39 */                    ilIilolOlIoO.I00000oIO(runtimeException, th);
/* 42 */                    th = runtimeException;
                        }
/* 43 */                iioo1llOllO.I00000oIO(ii00l101O, th);
                    }
                }
            }

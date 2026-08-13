            package p000;

            import java.lang.invoke.VarHandle;
            import java.lang.reflect.InvocationTargetException;
            import java.util.Iterator;
            
            public abstract class iioo1llOllO {
                public static final void I00000oIO(Ii00l101O ii00l101O, Throwable th) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
                    Throwable runtimeException;
/* 3 */             Iterator it = Ii00o100.I00000oIO.iterator();
/* 11 */            while (it.hasNext()) {
                        try {
/* 19 */                    ((Ii00lil0) it.next()).I00IOO(ii00l101O, th);
                        } catch (Throwable th2) {
/* 24 */                    if (th == th2) {
/* 26 */                        runtimeException = th;
                            } else {
/* 32 */                        runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
/* 35 */                        ilIilolOlIoO.I00000oIO(runtimeException, th);
                            }
/* 38 */                    Thread threadCurrentThread = Thread.currentThread();
                            try {
/* 46 */                        threadCurrentThread.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread, runtimeException);
                            } catch (Throwable unused) {
                            }
                        }
                    }
                    try {
/* 52 */                IiOooI0o0OI1 iiOooI0o0OI1 = new IiOooI0o0OI1();
/* 55 */                iiOooI0o0OI1.I00iOIl = ii00l101O;
/* 57 */                VarHandle.storeStoreFence();
/* 60 */                ilIilolOlIoO.I00000oIO(th, iiOooI0o0OI1);
                    } catch (Throwable unused2) {
                    }
/* 63 */            Thread threadCurrentThread2 = Thread.currentThread();
                    try {
/* 71 */                threadCurrentThread2.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread2, th);
                    } catch (Throwable unused3) {
                    }
                }
            }

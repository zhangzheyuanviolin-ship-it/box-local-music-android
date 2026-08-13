            package p000;

            import android.os.Looper;
            import java.lang.invoke.VarHandle;
            import java.util.Objects;
            import java.util.concurrent.Callable;
            import java.util.concurrent.CancellationException;
            import java.util.concurrent.CountDownLatch;
            import java.util.concurrent.ExecutionException;
            import java.util.concurrent.Executor;
            import java.util.concurrent.TimeUnit;
            import java.util.concurrent.TimeoutException;
            
            public abstract class lOio0o {
                public static Object I00000oIO(OloIIoII1oo oloIIoII1oo) {
/* 3 */             lII0I0I000I.I0001Ioi1lo("Must not be called on the main application thread");
/* 6 */             Looper looperMyLooper = Looper.myLooper();
/* 10 */            if (looperMyLooper != null && Objects.equals(looperMyLooper.getThread().getName(), "GoogleApiHandler")) {
/* 31 */                I000II.I001IO000("Must not be called on GoogleApiHandler thread.");
/* 34 */                return null;
                    }
/* 38 */            lII0I0I000I.I000O01llI0("Task must not be null", oloIIoII1oo);
/* 45 */            if (oloIIoII1oo.I000O01llI0()) {
/* 47 */                return I0001Ioi1lo(oloIIoII1oo);
                    }
/* 56 */            Oi0Oooi oi0Oooi = new Oi0Oooi(26);
/* 59 */            Executor executor = OloIo0oOIO0.I00000oOI;
/* 61 */            oloIIoII1oo.I0000oI00(executor, oi0Oooi);
/* 64 */            oloIIoII1oo.I0000O(executor, oi0Oooi);
/* 67 */            oloIIoII1oo.I00000oIO(executor, oi0Oooi);
/* 74 */            ((CountDownLatch) oi0Oooi.I00iiI).await();
/* 77 */            return I0001Ioi1lo(oloIIoII1oo);
                }

                public static Object I00000oOI(OloIIoII1oo oloIIoII1oo, long j, TimeUnit timeUnit) throws TimeoutException {
/* 3 */             lII0I0I000I.I0001Ioi1lo("Must not be called on the main application thread");
/* 6 */             Looper looperMyLooper = Looper.myLooper();
/* 10 */            if (looperMyLooper != null && Objects.equals(looperMyLooper.getThread().getName(), "GoogleApiHandler")) {
/* 31 */                I000II.I001IO000("Must not be called on GoogleApiHandler thread.");
/* 34 */                return null;
                    }
/* 38 */            lII0I0I000I.I000O01llI0("Task must not be null", oloIIoII1oo);
/* 43 */            lII0I0I000I.I000O01llI0("TimeUnit must not be null", timeUnit);
/* 50 */            if (oloIIoII1oo.I000O01llI0()) {
/* 52 */                return I0001Ioi1lo(oloIIoII1oo);
                    }
/* 61 */            Oi0Oooi oi0Oooi = new Oi0Oooi(26);
/* 64 */            Executor executor = OloIo0oOIO0.I00000oOI;
/* 66 */            oloIIoII1oo.I0000oI00(executor, oi0Oooi);
/* 69 */            oloIIoII1oo.I0000O(executor, oi0Oooi);
/* 72 */            oloIIoII1oo.I00000oIO(executor, oi0Oooi);
/* 83 */            if (((CountDownLatch) oi0Oooi.I00iiI).await(j, timeUnit)) {
/* 85 */                return I0001Ioi1lo(oloIIoII1oo);
                    }
/* 98 */            throw new TimeoutException("Timed out waiting for Task");
                }

                public static o0IiOl I0000Il00O(Callable callable, Executor executor) {
/* 3 */             lII0I0I000I.I000O01llI0("Executor must not be null", executor);
/* 8 */             o0IiOl o0iiol = new o0IiOl();
/* 15 */            IlloOi1I1OO illoOi1I1OO = new IlloOi1I1OO(12);
/* 18 */            illoOi1I1OO.I00iiI = o0iiol;
/* 20 */            illoOi1I1OO.I00iiO = callable;
/* 22 */            VarHandle.storeStoreFence();
/* 25 */            executor.execute(illoOi1I1OO);
/* 37 */            return o0iiol;
                }

                public static o0IiOl I0000O(Exception exc) {
/* 3 */             o0IiOl o0iiol = new o0IiOl();
/* 6 */             o0iiol.I000oI1ioi(exc);
/* 29 */            return o0iiol;
                }

                public static o0IiOl I0000oI00(Object obj) {
/* 3 */             o0IiOl o0iiol = new o0IiOl();
/* 6 */             o0iiol.I000lI(obj);
/* 29 */            return o0iiol;
                }

                public static Object I0001Ioi1lo(OloIIoII1oo oloIIoII1oo) throws ExecutionException {
/* 5 */             if (oloIIoII1oo.I000OOo1O()) {
/* 7 */                 return oloIIoII1oo.I000II();
                    }
/* 17 */            if (((o0IiOl) oloIIoII1oo).I0000O) {
/* 26 */                throw new CancellationException("Task is already canceled");
                    }
/* 77 */            throw new ExecutionException(oloIIoII1oo.I0001Ioi1lo());
                }
            }

            package p000;

            import com.google.common.util.concurrent.ListenableFuture;
            import java.util.concurrent.Executor;
            import java.util.concurrent.Future;
            
            public abstract class ll0li01oO0li {
                public static lii1I01 I00000oIO(Object obj) {
                    return obj == null ? lii1I01.I00iiI : new lii1I01(obj);
                }

                public static liOoo0oli0 I00000oOI(Exception exc) {
/* 3 */             liOoo0oli0 liooo0oli0 = new liOoo0oli0();
/* 6 */             liooo0oli0.I000OOo1O(exc);
/* 29 */            return liooo0oli0;
                }

                public static li1ii1 I0000Il00O(ListenableFuture listenableFuture, liI0OilOI1I1 lii0oiloi1i1, Executor executor) {
/* 1 */             int i = li1o00OoI0.I00l0OO0IO;
/* 5 */             li1ii1 li1ii1Var = new li1ii1(listenableFuture, lii0oiloi1i1);
/* 12 */            listenableFuture.addListener(li1ii1Var, ll0o0IiI.I00000oIO(executor, li1ii1Var));
/* 98 */            return li1ii1Var;
                }

                public static li1l1liO1i0l I0000O(ListenableFuture listenableFuture, lIIOoiIOO0 liiooiioo0, Executor executor) {
/* 1 */             int i = li1o00OoI0.I00l0OO0IO;
/* 5 */             li1l1liO1i0l li1l1lio1i0l = new li1l1liO1i0l(listenableFuture, liiooiioo0);
/* 12 */            listenableFuture.addListener(li1l1lio1i0l, ll0o0IiI.I00000oIO(executor, li1l1lio1i0l));
/* 98 */            return li1l1lio1i0l;
                }

                public static Object I0000oI00(Future future) {
                    Object obj;
/* 5 */             if (!future.isDone()) {
/* 46 */                I000II.I001IO000(ll0Oo10I10.I00000oIO("Future was expected to be done: %s", future));
/* 49 */                return null;
                    }
/* 7 */             boolean z = false;
                    while (true) {
                        try {
/* 8 */                     obj = future.get();
                            break;
                        } catch (InterruptedException unused) {
/* 34 */                    z = true;
                        } catch (Throwable th) {
/* 23 */                    if (z) {
/* 30 */                        Thread.currentThread().interrupt();
                            }
/* 33 */                    throw th;
                        }
                    }
/* 12 */            if (z) {
/* 18 */                Thread.currentThread().interrupt();
                    }
/* 21 */            return obj;
                }
            }

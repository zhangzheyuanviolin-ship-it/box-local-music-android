            package p000;

            import com.google.common.util.concurrent.ListenableFuture;
            import java.util.concurrent.Executor;
            import java.util.concurrent.RejectedExecutionException;
            
            public final class l011O01 implements Executor {
                public final int I00iOIl;
                public Executor I00iiI;
                public ListenableFuture I00iiO;

                @Override
                public final void execute(Runnable runnable) {
                    switch (this.I00iOIl) {
                        case 0:
/* 66 */                    Executor executor = this.I00iiI;
/* 70 */                    iolIIiIlOo ioliiiiloo = (iolIIiIlOo) this.I00iiO;
                            try {
/* 72 */                        executor.execute(runnable);
                                break;
                            } catch (RejectedExecutionException e) {
/* 77 */                        ioliiiiloo.I000OOo1O(e);
/* 80 */                        return;
                            }
                        case 1:
/* 51 */                    Executor executor2 = this.I00iiI;
/* 55 */                    iolIIol1 ioliiol1 = (iolIIol1) this.I00iiO;
                            try {
/* 57 */                        executor2.execute(runnable);
                                break;
                            } catch (RejectedExecutionException e2) {
/* 62 */                        ioliiol1.I000OOo1O(e2);
/* 65 */                        return;
                            }
                        case 2:
/* 36 */                    Executor executor3 = this.I00iiI;
/* 40 */                    ioo0IOiOoi1 ioo0ioiooi1 = (ioo0IOiOoi1) this.I00iiO;
                            try {
/* 42 */                        executor3.execute(runnable);
                                break;
                            } catch (RejectedExecutionException e3) {
/* 47 */                        ioo0ioiooi1.I000OOo1O(e3);
/* 50 */                        return;
                            }
                        case 3:
/* 21 */                    Executor executor4 = this.I00iiI;
/* 25 */                    l0OiIioI1I0 l0oiiioi1i0 = (l0OiIioI1I0) this.I00iiO;
                            try {
/* 27 */                        executor4.execute(runnable);
                                break;
                            } catch (RejectedExecutionException e4) {
/* 32 */                        l0oiiioi1i0.I000OOo1O(e4);
/* 35 */                        return;
                            }
                        default:
/* 6 */                     Executor executor5 = this.I00iiI;
/* 10 */                    liIIoo1oo liiioo1oo = (liIIoo1oo) this.I00iiO;
                            try {
/* 12 */                        executor5.execute(runnable);
                                break;
                            } catch (RejectedExecutionException e5) {
/* 17 */                        liiioo1oo.I000OOo1O(e5);
                            }
                    }
                }
            }

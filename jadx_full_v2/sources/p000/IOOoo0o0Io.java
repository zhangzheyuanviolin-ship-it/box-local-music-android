            package p000;

            import com.google.common.util.concurrent.ListenableFuture;
            import java.lang.invoke.VarHandle;
            import java.util.Collections;
            import java.util.Objects;
            import java.util.Set;
            import java.util.concurrent.ConcurrentHashMap;
            import java.util.concurrent.ExecutionException;
            import java.util.concurrent.Executor;
            import java.util.concurrent.Future;
            import java.util.concurrent.RejectedExecutionException;
            import java.util.logging.Level;
            
            public final class IOOoo0o0Io extends I0ii1I1ii {
                public static final O0o0ill01o0 I00o0iI0io1 = new O0o0ill01o0(0, IOOoo0o0Io.class);
                public IoilO0iiOo1 I00ll1;
                public final boolean I00lli11;
                public IOOoiII1ioO I00lll10;

                public IOOoo0o0Io(IoillO0OOoo ioillO0OOoo, boolean z) {
/* 1 */             int size = ioillO0OOoo.size();
/* 9 */             this.I00ioIO = null;
/* 11 */            this.I00l0I0l0lO1 = size;
/* 13 */            this.I00ll1 = ioillO0OOoo;
/* 15 */            this.I00lli11 = z;
                }

                @Override
                public final void I0000O() {
/* 1 */             IoilO0iiOo1 ioilO0iiOo1 = this.I00ll1;
/* 4 */             this.I00ll1 = null;
/* 6 */             this.I00lll10 = null;
/* 18 */            if ((this.I00iOIl instanceof I010i10l) && (ioilO0iiOo1 != null)) {
/* 20 */                boolean zI000oI1ioi = I000oI1ioi();
/* 24 */                OoiOOoOlo it = ioilO0iiOo1.iterator();
/* 32 */                while (it.hasNext()) {
/* 40 */                    ((Future) it.next()).cancel(zI000oI1ioi);
                        }
                    }
                }

                @Override
                public final void I000OiO() {
/* 1 */             IOOoiII1ioO iOOoiII1ioO = this.I00lll10;
/* 3 */             if (iOOoiII1ioO != null) {
/* 5 */                 iOOoiII1ioO.I0000Il00O();
                    }
                }

                @Override
                public final String I000iOII() {
/* 1 */             IoilO0iiOo1 ioilO0iiOo1 = this.I00ll1;
/* 3 */             if (ioilO0iiOo1 == null) {
/* 20 */                return super.I000iOII();
                    }
/* 15 */            return "futures=" + ioilO0iiOo1;
                }

                public final void I00100l0(IoilO0iiOo1 ioilO0iiOo1) {
/* 3 */             int iI00000oOI = I0ii1I1ii.I00l0OO0IO.I00000oOI(this);
/* 14 */            lII0I0I01I1l.I000OOo1O("Less than 0 remaining futures", iI00000oOI >= 0);
/* 17 */            if (iI00000oOI == 0) {
/* 19 */                if (ioilO0iiOo1 != null) {
/* 21 */                    OoiOOoOlo it = ioilO0iiOo1.iterator();
/* 29 */                    while (it.hasNext()) {
/* 35 */                        Future future = (Future) it.next();
/* 41 */                        if (!future.isCancelled()) {
                                    try {
/* 43 */                                li010iilO.I00000oIO(future);
                                    } catch (ExecutionException e) {
/* 57 */                                I00100o1O0lo(e.getCause());
                                    } catch (Throwable th) {
/* 48 */                                I00100o1O0lo(th);
                                    }
                                }
                            }
                        }
/* 62 */                this.I00ioIO = null;
/* 64 */                IOOoiII1ioO iOOoiII1ioO = this.I00lll10;
/* 66 */                if (iOOoiII1ioO != null) {
                            try {
/* 70 */                        iOOoiII1ioO.I00iiO.execute(iOOoiII1ioO);
                            } catch (RejectedExecutionException e2) {
/* 77 */                        iOOoiII1ioO.I00iio.I000lI(e2);
                            }
                        }
/* 80 */                this.I00ll1 = null;
                    }
                }

                public final void I00100o1O0lo(Throwable th) {
/* 1 */             th.getClass();
/* 8 */             if (this.I00lli11 && !I000lI(th)) {
/* 16 */                Set set = this.I00ioIO;
/* 18 */                if (set == null) {
/* 25 */                    Set setNewSetFromMap = Collections.newSetFromMap(new ConcurrentHashMap());
/* 29 */                    setNewSetFromMap.getClass();
/* 36 */                    if (!(this.I00iOIl instanceof I010i10l)) {
/* 38 */                        Throwable thI00000oOI = I00000oOI();
/* 42 */                        Objects.requireNonNull(thI00000oOI);
/* 45 */                        while (thI00000oOI != null && setNewSetFromMap.add(thI00000oOI)) {
/* 54 */                            thI00000oOI = thI00000oOI.getCause();
                                }
                            }
/* 61 */                    I0ii1I1ii.I00l0OO0IO.I00000oIO(this, setNewSetFromMap);
/* 64 */                    Set set2 = this.I00ioIO;
/* 66 */                    Objects.requireNonNull(set2);
/* 70 */                    set = set2;
                        }
/* 73 */                for (Throwable cause = th; cause != null; cause = cause.getCause()) {
/* 79 */                    if (set.add(cause)) {
                            }
                        }
/* 102 */               I00o0iI0io1.I00000oIO().log(Level.SEVERE, th instanceof Error ? "Input Future failed with Error" : "Got more than one input Future failure. Logging failures after the first", th);
/* 105 */               return;
                    }
/* 108 */           if (th instanceof Error) {
/* 118 */               I00o0iI0io1.I00000oIO().log(Level.SEVERE, "Input Future failed with Error", th);
                    }
                }

                public final void I0010I0i() {
/* 3 */             Objects.requireNonNull(this.I00ll1);
/* 12 */            if (this.I00ll1.isEmpty()) {
/* 14 */                IOOoiII1ioO iOOoiII1ioO = this.I00lll10;
/* 16 */                if (iOOoiII1ioO != null) {
                            try {
/* 20 */                        iOOoiII1ioO.I00iiO.execute(iOOoiII1ioO);
/* 23 */                        return;
                            } catch (RejectedExecutionException e) {
/* 27 */                        iOOoiII1ioO.I00iio.I000lI(e);
/* 30 */                        return;
                            }
                        }
/* 541 */               return;
                    }
/* 31 */            IoilO0iiOo1 ioilO0iiOo1 = this.I00ll1;
/* 33 */            Executor executor = Iii11Ooi.I00iOIl;
/* 37 */            if (this.I00lli11) {
/* 39 */                OoiOOoOlo it = ioilO0iiOo1.iterator();
/* 47 */                while (it.hasNext()) {
/* 53 */                    ListenableFuture listenableFuture = (ListenableFuture) it.next();
/* 59 */                    if (listenableFuture.isDone()) {
/* 61 */                        I0010o(listenableFuture);
                            } else {
/* 68 */                        I0iOo0oioiO i0iOo0oioiO = new I0iOo0oioiO(0);
/* 71 */                        i0iOo0oioiO.I00iiI = this;
/* 73 */                        i0iOo0oioiO.I00iiO = listenableFuture;
/* 75 */                        VarHandle.storeStoreFence();
/* 78 */                        listenableFuture.addListener(i0iOo0oioiO, executor);
                            }
                        }
/* 541 */               return;
                    }
/* 85 */            I0iOo0oioiO i0iOo0oioiO2 = new I0iOo0oioiO(1);
/* 88 */            i0iOo0oioiO2.I00iiI = this;
/* 91 */            i0iOo0oioiO2.I00iiO = null;
/* 93 */            VarHandle.storeStoreFence();
/* 96 */            OoiOOoOlo it2 = ioilO0iiOo1.iterator();
/* 104 */           while (it2.hasNext()) {
/* 110 */               ListenableFuture listenableFuture2 = (ListenableFuture) it2.next();
/* 116 */               if (listenableFuture2.isDone()) {
/* 118 */                   I00100l0(null);
                        } else {
/* 122 */                   listenableFuture2.addListener(i0iOo0oioiO2, executor);
                        }
                    }
                }

                public final void I0010o(ListenableFuture listenableFuture) {
                    try {
/* 6 */                 if (listenableFuture.isCancelled()) {
/* 8 */                     this.I00ll1 = null;
/* 11 */                    cancel(false);
                        } else {
                            try {
/* 17 */                        li010iilO.I00000oIO(listenableFuture);
                            } catch (ExecutionException e) {
/* 31 */                        I00100o1O0lo(e.getCause());
                            } catch (Throwable th) {
/* 22 */                        I00100o1O0lo(th);
                            }
                        }
                    } finally {
/* 38 */                I00100l0(null);
                    }
                }
            }

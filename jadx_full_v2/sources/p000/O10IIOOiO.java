            package p000;

            import com.google.common.util.concurrent.ListenableFuture;
            import java.lang.invoke.VarHandle;
            import java.util.ArrayList;
            import java.util.Iterator;
            import java.util.List;
            import java.util.concurrent.Executor;
            import java.util.concurrent.TimeUnit;
            import java.util.concurrent.atomic.AtomicInteger;
            
/* 55 */    public final class O10IIOOiO implements ListenableFuture {
                public ArrayList I00iOIl;
                public ArrayList I00iiI;
                public final boolean I00iiO;
                public final AtomicInteger I00iio;
                public final IIiOiI0il I00ilI0I1;
                public IIiOOI I00ilO0;

                public O10IIOOiO(ArrayList arrayList, boolean z, Iii11l iii11l) {
/* 4 */             this.I00iOIl = arrayList;
/* 15 */            this.I00iiI = new ArrayList(arrayList.size());
/* 17 */            this.I00iiO = z;
/* 28 */            this.I00iio = new AtomicInteger(arrayList.size());
/* 34 */            I0IIiO0iI i0IIiO0iI = new I0IIiO0iI(16);
/* 37 */            i0IIiO0iI.I00iiI = this;
/* 39 */            VarHandle.storeStoreFence();
/* 42 */            IIiOiI0il iIiOiI0ilI00000oIO = iOiiloIII0O.I00000oIO(i0IIiO0iI);
/* 46 */            this.I00ilI0I1 = iIiOiI0ilI00000oIO;
/* 52 */            I0lil01 i0lil01 = new I0lil01(9);
/* 55 */            i0lil01.I00iiI = this;
/* 57 */            VarHandle.storeStoreFence();
/* 64 */            iIiOiI0ilI00000oIO.addListener(i0lil01, Iii11l.I00000oIO());
/* 73 */            if (this.I00iOIl.isEmpty()) {
/* 84 */                this.I00ilO0.I00000oOI(new ArrayList(this.I00iiI));
/* 87 */                return;
                    }
/* 96 */            for (int i = 0; i < this.I00iOIl.size(); i++) {
/* 101 */               this.I00iiI.add(null);
                    }
/* 107 */           ArrayList arrayList2 = this.I00iOIl;
/* 113 */           for (int i2 = 0; i2 < arrayList2.size(); i2++) {
/* 119 */               ListenableFuture listenableFuture = (ListenableFuture) arrayList2.get(i2);
/* 124 */               I1I1Oi0iil i1I1Oi0iil = new I1I1Oi0iil(1);
/* 127 */               i1I1Oi0iil.I00iio = this;
/* 129 */               i1I1Oi0iil.I00iiI = i2;
/* 131 */               i1I1Oi0iil.I00iiO = listenableFuture;
/* 133 */               VarHandle.storeStoreFence();
/* 136 */               listenableFuture.addListener(i1I1Oi0iil, iii11l);
                    }
                }

                @Override
                public final void addListener(Runnable runnable, Executor executor) {
/* 3 */             this.I00ilI0I1.addListener(runnable, executor);
                }

                @Override
                public final boolean cancel(boolean z) {
/* 1 */             ArrayList arrayList = this.I00iOIl;
/* 3 */             if (arrayList != null) {
/* 5 */                 Iterator it = arrayList.iterator();
/* 13 */                while (it.hasNext()) {
/* 21 */                    ((ListenableFuture) it.next()).cancel(z);
                        }
                    }
/* 27 */            return this.I00ilI0I1.cancel(z);
                }

                @Override
                public final Object get() throws InterruptedException {
/* 1 */             ArrayList arrayList = this.I00iOIl;
/* 3 */             if (arrayList != null && !isDone()) {
/* 11 */                Iterator it = arrayList.iterator();
/* 19 */                loop0: while (it.hasNext()) {
/* 25 */                    ListenableFuture listenableFuture = (ListenableFuture) it.next();
/* 31 */                    while (!listenableFuture.isDone()) {
                                try {
/* 33 */                            listenableFuture.get();
                                } catch (Error e) {
/* 45 */                            throw e;
                                } catch (InterruptedException e2) {
/* 43 */                            throw e2;
                                } catch (Throwable unused) {
/* 39 */                            if (this.I00iiO) {
                                        break loop0;
                                    }
                                }
                            }
                        }
                    }
/* 54 */            return (List) this.I00ilI0I1.I00iiI.get();
                }

                @Override
                public final boolean isCancelled() {
/* 3 */             return this.I00ilI0I1.isCancelled();
                }

                @Override
                public final boolean isDone() {
/* 5 */             return this.I00ilI0I1.I00iiI.isDone();
                }

                @Override
/* 56 */        public final Object get(long j, TimeUnit timeUnit) {
/* 60 */            return (List) this.I00ilI0I1.I00iiI.get(j, timeUnit);
                }
            }

            package p000;

            import java.lang.invoke.VarHandle;
            import java.util.Iterator;
            import java.util.concurrent.ExecutorService;
            import java.util.concurrent.ForkJoinPool;
            import java.util.concurrent.TimeUnit;
            import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
            
            public final class IllIll1I1 extends I01loIooI implements OIl1Oll {
                public final int I0000Il00O;
                public final int I0000O;
                public final I1OollilIo I0000oI00;
                public final IllO00OiO I0001Ioi1lo;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public IllIll1I1(IllO00OiO illO00OiO, int i, int i2, I1OollilIo i1OollilIo) {
/* 4 */             super(6);
/* 1 */             this.I0001Ioi1lo = illO00OiO;
/* 7 */             this.I0000Il00O = i;
/* 9 */             this.I0000O = i2;
/* 11 */            this.I0000oI00 = i1OollilIo;
                }

                @Override
                public final void I00000oOI(Object obj) throws Exception {
                    Object obj2;
                    IllIo0 illIo0;
                    AutoCloseable oioo0iIlil;
                    boolean zIsTerminated;
/* 10 */            OIl1lIlo1Oi oIl1lIlo1Oi = (OIl1lIlo1Oi) (OIl1lo10.I00000oOI(obj) ? obj : null);
/* 13 */            if (oIl1lIlo1Oi != null) {
/* 17 */                if (oIl1lIlo1Oi instanceof Oioo0iIlil) {
/* 21 */                    oioo0iIlil = ((Oioo0iIlil) oIl1lIlo1Oi).I00000oIO();
                        } else {
/* 38 */                    Oioo0iIlil oioo0iIlil2 = (Oioo0iIlil) oIl1lIlo1Oi.I00l0I0l0lO1(OOoOl0i.I00000oIO.I00000oOI(Oioo0iIlil.class));
/* 40 */                    if (oioo0iIlil2 != null) {
/* 42 */                        oioo0iIlil = oioo0iIlil2.I00000oIO();
                            } else {
/* 49 */                        IOO1lioOO iOO1lioOO = IOO1lioOO.I00000oOI;
/* 53 */                        IOO000ilo iOO000ilo = new IOO000ilo(28);
/* 56 */                        iOO000ilo.I00iiI = oIl1lIlo1Oi;
/* 62 */                        iOO000ilo.I00iiO = iOOOIOoiIlII.I00000oOI(1);
/* 68 */                        iOO000ilo.I00iio = iOOOIOoiIlII.I0000O(iOO1lioOO);
/* 70 */                        VarHandle.storeStoreFence();
/* 75 */                        oioo0iIlil = new Oioo0iIlil(oIl1lIlo1Oi, iOO000ilo);
                            }
                        }
/* 91 */                if (!((IOi10loi) this.I00000oOI).I00O10llo(OIl1lo10.I00000oIO(oioo0iIlil))) {
/* 95 */                    if (oioo0iIlil instanceof AutoCloseable) {
/* 97 */                        oioo0iIlil.close();
                            } else {
/* 103 */                       if (!(oioo0iIlil instanceof ExecutorService)) {
/* 152 */                           OIiilo1Ool0o.I00100o1O0lo();
/* 155 */                           return;
                                }
/* 105 */                       ExecutorService executorService = (ExecutorService) oioo0iIlil;
/* 111 */                       if (executorService != ForkJoinPool.commonPool() && !(zIsTerminated = executorService.isTerminated())) {
/* 120 */                           executorService.shutdown();
/* 123 */                           boolean z = false;
/* 124 */                           while (!zIsTerminated) {
                                        try {
/* 130 */                                   zIsTerminated = executorService.awaitTermination(1L, TimeUnit.DAYS);
                                        } catch (InterruptedException unused) {
/* 135 */                                   if (!z) {
/* 137 */                                       executorService.shutdownNow();
/* 140 */                                       z = true;
                                            }
                                        }
                                    }
/* 142 */                           if (z) {
/* 148 */                               Thread.currentThread().interrupt();
                                    }
                                }
                            }
                        }
                    } else {
/* 184 */               ((IOi10loi) this.I00000oOI).I00O10llo(OIl1lo10.I00000oIO(OIlI0iOIo.I00000oIO(OIl1lo10.I00000oOI(obj) ? 1 : obj == null ? 2 : ((OIlI0iOIo) obj).I00000oIO)));
                    }
/* 187 */           I1OollilIo i1OollilIo = this.I0000oI00;
/* 189 */           AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = I1OollilIo.I00000oOI;
/* 195 */           if (atomicIntegerFieldUpdater.decrementAndGet(i1OollilIo) == 0) {
/* 201 */               Iterator it = this.I0001Ioi1lo.I000O01llI0.iterator();
/* 209 */               if (it.hasNext()) {
/* 329 */                   throw IIlIOloOOO.I000lI(it);
                        }
/* 211 */               IllO00OiO illO00OiO = this.I0001Ioi1lo;
/* 213 */               I1OollilIo i1OollilIo2 = illO00OiO.I000II;
/* 215 */               i1OollilIo2.getClass();
/* 222 */               if (atomicIntegerFieldUpdater.decrementAndGet(i1OollilIo2) != 0) {
/* 437 */                   return;
                        }
/* 225 */               I1OooIoiIO i1OooIoiIO = illO00OiO.I0001Ioi1lo;
/* 284 */               do {
/* 227 */                   obj2 = i1OooIoiIO.I00000oIO;
/* 230 */                   IllIo0 illIo02 = (IllIo0) obj2;
/* 232 */                   int iOrdinal = illIo02.ordinal();
/* 236 */                   if (iOrdinal == 0) {
/* 276 */                       illIo0 = IllIo0.I00iiO;
                            } else {
/* 238 */                       if (iOrdinal != 1) {
/* 275 */                           throw new IllegalStateException("Unexpected frame state for " + illO00OiO + "! State is " + illIo02 + ' ');
                                }
/* 240 */                       illIo0 = IllIo0.I00iio;
                            }
/* 284 */               } while (!I1OooIoiIO.I00000oOI.compareAndSet(i1OooIoiIO, obj2, illIo0));
/* 288 */               Iterator it2 = illO00OiO.I000O01llI0.iterator();
/* 296 */               if (it2.hasNext()) {
/* 324 */                   throw IIlIOloOOO.I000lI(it2);
                        }
/* 300 */               if (illIo0 == IllIo0.I00iio) {
/* 304 */                   Iterator it3 = illO00OiO.I000O01llI0.iterator();
/* 312 */                   if (it3.hasNext()) {
/* 319 */                       throw IIlIOloOOO.I000lI(it3);
                            }
                        }
                    }
                }
            }

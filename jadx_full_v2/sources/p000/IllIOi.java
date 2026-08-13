            package p000;

            import android.util.Log;
            import java.util.Set;
            import java.util.concurrent.ExecutorService;
            import java.util.concurrent.ForkJoinPool;
            import java.util.concurrent.TimeUnit;
            
            public final class IllIOi implements AutoCloseable {
                public IllO00OiO I00iOIl;
                public Set I00iiI;
                public I1Ool1IoO110 I00iiO;

                public final boolean I00000oIO() {
                    boolean zIsTerminated;
/* 1 */             IllO00OiO illO00OiO = this.I00iOIl;
/* 3 */             O101lO1 o101lO1 = illO00OiO.I0000oI00;
/* 12 */            if (!this.I00iiO.I00000oIO()) {
/* 11 */                return false;
                    }
/* 14 */            IllIll illIll = illO00OiO.I0000O;
/* 27 */            if (I1OollilIo.I00000oOI.decrementAndGet((I1OollilIo) illIll.I00000oIO) == 0) {
/* 41 */                ((IOi10loi) illIll.I00000oOI).I00O10llo(OIl1lo10.I00000oIO(OIlI0iOIo.I00000oIO(2)));
                    }
/* 44 */            int iI00000oOI = o101lO1.I00000oOI();
/* 50 */            for (int i = 0; i < iI00000oOI; i++) {
/* 56 */                IllIll1I1 illIll1I1 = (IllIll1I1) o101lO1.get(i);
/* 70 */                if (this.I00iiI.contains(OlOO0I1.I00000oIO(illIll1I1.I0000Il00O))) {
/* 82 */                    if (I1OollilIo.I00000oOI.decrementAndGet((I1OollilIo) illIll1I1.I00000oIO) == 0) {
/* 96 */                        ((IOi10loi) illIll1I1.I00000oOI).I00O10llo(OIl1lo10.I00000oIO(OIlI0iOIo.I00000oIO(2)));
/* 101 */                       IOi10loi iOi10loi = (IOi10loi) illIll1I1.I00000oOI;
/* 107 */                       Object obj = null;
/* 108 */                       if (iOi10loi.I00oII() && !iOi10loi.isCancelled()) {
/* 122 */                           Object obj2 = ((OIl1lo10) iOi10loi.I00II0Ol1O0l()).I00000oIO;
/* 128 */                           if (OIl1lo10.I00000oOI(obj2)) {
/* 130 */                               obj = obj2;
                                    }
                                }
/* 131 */                       OIl1lIlo1Oi oIl1lIlo1Oi = (Oioo0iIlil) obj;
/* 133 */                       if (oIl1lIlo1Oi != null) {
/* 137 */                           if (oIl1lIlo1Oi instanceof AutoCloseable) {
/* 139 */                               oIl1lIlo1Oi.close();
                                    } else if (oIl1lIlo1Oi instanceof ExecutorService) {
/* 147 */                               ExecutorService executorService = (ExecutorService) oIl1lIlo1Oi;
/* 153 */                               if (executorService != ForkJoinPool.commonPool() && !(zIsTerminated = executorService.isTerminated())) {
/* 162 */                                   executorService.shutdown();
/* 165 */                                   boolean z = false;
/* 166 */                                   while (!zIsTerminated) {
                                                try {
/* 172 */                                           zIsTerminated = executorService.awaitTermination(1L, TimeUnit.DAYS);
                                                } catch (InterruptedException unused) {
/* 177 */                                           if (!z) {
/* 179 */                                               executorService.shutdownNow();
/* 182 */                                               z = true;
                                                    }
                                                }
                                            }
/* 184 */                                   if (z) {
/* 190 */                                       Thread.currentThread().interrupt();
                                            }
                                        }
                                    } else {
/* 194 */                               OIiilo1Ool0o.I00100o1O0lo();
                                    }
                                }
                            }
                        }
                    }
/* 49 */            return true;
                }

                @Override
                public final void close() {
/* 1 */             I00000oIO();
                }

                public final void finalize() {
/* 5 */             if (I00000oIO()) {
/* 28 */                Log.e("CXCP", "Failed to close " + this + "! This indicates a memory leak and could cause the camera to stall, or images to be lost.");
                    }
                }

                public final String toString() {
/* 3 */             return this.I00iOIl.toString();
                }
            }

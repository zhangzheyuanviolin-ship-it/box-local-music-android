            package p000;

            import android.os.SystemClock;
            import android.os.Trace;
            import android.util.Log;
            import android.view.Surface;
            import java.lang.invoke.VarHandle;
            import java.util.ArrayList;
            import java.util.Arrays;
            import java.util.Iterator;
            import java.util.LinkedHashMap;
            import java.util.LinkedHashSet;
            import java.util.List;
            import java.util.Map;
            import java.util.Set;
            import java.util.concurrent.CountDownLatch;
            import java.util.concurrent.ExecutorService;
            import java.util.concurrent.ForkJoinPool;
            import java.util.concurrent.TimeUnit;
            
            public final class IO0Il0o1OI implements Oiloill1 {
                public Io0oi0 I00000oIO;
                public IO0I000 I00000oOI;
                public I1ii1o0 I0000Il00O;
                public IIoI1li1o1l I0000O;
                public IIliOiI I0000oI00;
                public OlOO00iI0lI I0001Ioi1lo;
                public Oo10IliO00O I000II;
                public Ii0110 I000O01llI0;
                public int I000OOo1O;
                public Object I000OiO;
                public I1OooIoiIO I000iOII;
                public Map I000l1;
                public Map I000lI;
                public Oo11iO1 I000o00OoI0I;
                public Oi0Oooi I000oI1ioi;
                public IIlOl1oOlo1o I00100l0;
                public IO0I001I0 I00100o1O0lo;
                public Map I0010I0i;
                public LinkedHashMap I0010o;
                public IO0I10o I00111O;
                public CountDownLatch I001IIilI0O;
                public boolean I001IO000;
                public CountDownLatch I001i1O0Ol;
                public Map I001i1lo1io;
                public LinkedHashMap I001iOo1i0O;

                @Override
                public final void I00000oIO() throws Exception {
/* 1 */             I1OooIoiIO i1OooIoiIO = this.I000iOII;
/* 3 */             Boolean bool = Boolean.FALSE;
/* 5 */             Boolean bool2 = Boolean.TRUE;
/* 7 */             i1OooIoiIO.getClass();
/* 16 */            if (I1OooIoiIO.I00000oOI.compareAndSet(i1OooIoiIO, bool, bool2)) {
/* 18 */                toString();
/* 38 */                Trace.beginSection(this + "#onSessionFinalized");
/* 41 */                I000iOII();
/* 46 */                I000II(0L);
/* 49 */                Trace.endSection();
                    }
                }

                @Override
                public final void I00000oOI() {
/* 1 */             toString();
/* 21 */            Trace.beginSection(this + "#onSessionDisconnected");
/* 24 */            I0000oI00();
                    try {
/* 44 */                Trace.beginSection(this + "#onSessionDisconnected Await");
/* 49 */                this.I001IIilI0O.await();
/* 52 */                Trace.endSection();
                    } finally {
/* 60 */                Trace.endSection();
                    }
                }

                /* JADX WARN: Removed duplicated region for block: B:19:0x0071  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final void I0000Il00O(IIlIIOi iIlIIOi) {
                    boolean z;
                    synchronized (this.I000OiO) {
                        try {
/* 6 */                     IO0I001I0 io0i001i0 = this.I00100o1O0lo;
/* 9 */                     if (io0i001i0 == null && iIlIIOi != null) {
/* 19 */                        IIl00O iIl00OI001IIilI0O = this.I0000Il00O.I001IIilI0O(iIlIIOi, this.I000l1, this.I000lI);
/* 28 */                        I0oiil10Ili i0oiil10Ili = new I0oiil10Ili(2);
/* 31 */                        i0oiil10Ili.I00iiO = iIl00OI001IIilI0O;
/* 33 */                        I1OollilIo i1OollilIo = Io0oiIo1Ol.I00000oIO;
/* 35 */                        i1OollilIo.getClass();
/* 44 */                        i0oiil10Ili.I00iiI = I1OollilIo.I00000oOI.incrementAndGet(i1OollilIo);
/* 50 */                        i0oiil10Ili.I00iio = iOOOIOoiIlII.I00000oIO(false);
/* 57 */                        i0oiil10Ili.I00ilI0I1 = new ArrayList();
/* 63 */                        O1OIll00i o1OIll00i = new O1OIll00i(12);
/* 66 */                        o1OIll00i.I00iiI = i0oiil10Ili;
/* 68 */                        VarHandle.storeStoreFence();
/* 71 */                        i0oiil10Ili.I00ilO0 = o1OIll00i;
/* 73 */                        VarHandle.storeStoreFence();
/* 76 */                        IO0I001I0 io0i001i02 = new IO0I001I0();
/* 79 */                        io0i001i02.I00000oIO = iIlIIOi;
/* 81 */                        io0i001i02.I00000oOI = i0oiil10Ili;
/* 83 */                        io0i001i02.I0000Il00O = iIl00OI001IIilI0O;
/* 85 */                        VarHandle.storeStoreFence();
/* 88 */                        this.I00100o1O0lo = io0i001i02;
/* 90 */                        io0i001i0 = io0i001i02;
                            }
/* 98 */                    if (this.I00111O == IO0I10o.I00iiO && io0i001i0 != null) {
/* 106 */                       if (this.I0010I0i != null) {
/* 114 */                           z = this.I0010o != null;
                                }
/* 116 */                       if (z) {
/* 118 */                           I0001Ioi1lo(false);
                                }
                                synchronized (this.I000OiO) {
/* 181 */                           Log.i("CXCP", "Configured " + this + " in " + String.format(null, "%.3f ms", Arrays.copyOf(new Object[]{Double.valueOf((SystemClock.elapsedRealtimeNanos() - this.I000o00OoI0I.I00000oIO) / 1000000.0d)}, 1)));
/* 188 */                           this.I00000oIO.I00000oOI(io0i001i0.I00000oOI);
                                }
                            }
                        } catch (Throwable th) {
/* 437 */                   throw th;
                        }
                    }
                }

                public final void I0000O(Map map) {
                    synchronized (this.I000OiO) {
                        try {
/* 4 */                     IO0I10o iO0I10o = this.I00111O;
/* 8 */                     if (iO0I10o != IO0I10o.I00iio && iO0I10o != IO0I10o.I00ilI0I1) {
/* 15 */                        Map map2 = this.I001i1lo1io;
/* 17 */                        if (map2 == null) {
/* 19 */                            map2 = Il011I1OiO0I.I00iOIl;
                                }
/* 24 */                        I000lI(map2, map);
/* 27 */                        this.I001i1lo1io = map;
/* 29 */                        Map map3 = this.I0010I0i;
/* 32 */                        IOoil1iiIilo iOoil1iiIilo = null;
/* 33 */                        if (map3 != null && this.I0010o == null) {
/* 41 */                            LinkedHashMap linkedHashMap = new LinkedHashMap();
/* 56 */                            for (Map.Entry entry : map.entrySet()) {
/* 72 */                                if (map3.containsKey(entry.getKey())) {
/* 82 */                                    linkedHashMap.put(entry.getKey(), entry.getValue());
                                        }
                                    }
/* 94 */                            if (linkedHashMap.size() == map3.size()) {
/* 96 */                                this.I0010o = linkedHashMap;
/* 106 */                               iOi1II01i0.I0000O(this.I000O01llI0, null, null, new I1iOI0oo(this, iOoil1iiIilo, 4), 3);
                                    }
                                }
/* 117 */                       iOi1II01i0.I0000O(this.I000O01llI0, null, null, new IO0II0ilO(this, iOoil1iiIilo, 1), 3);
                            }
                        } catch (Throwable th) {
/* 168 */                   throw th;
                        }
                    }
                }

                public final void I0000oI00() {
                    IO0I001I0 io0i001i0;
                    synchronized (this.I000OiO) {
                        try {
/* 4 */                     IO0I10o iO0I10o = this.I00111O;
/* 6 */                     IO0I10o iO0I10o2 = IO0I10o.I00iio;
/* 8 */                     if (iO0I10o != iO0I10o2 && iO0I10o != IO0I10o.I00ilI0I1) {
/* 16 */                        this.I00111O = iO0I10o2;
/* 18 */                        IO0I001I0 io0i001i02 = this.I00100o1O0lo;
/* 20 */                        IOoil1iiIilo iOoil1iiIilo = null;
/* 21 */                        boolean z = false;
/* 22 */                        if (io0i001i02 != null) {
/* 24 */                            this.I00100o1O0lo = null;
                                } else {
/* 34 */                            if (this.I0000oI00.I0000O && this.I001IO000) {
/* 40 */                                z = true;
                                    }
/* 41 */                            io0i001i02 = null;
                                }
/* 43 */                        Oi0Oooi oi0Oooi = this.I000oI1ioi;
/* 45 */                        if (oi0Oooi != null) {
/* 47 */                            oi0Oooi.I001IIilI0O();
                                }
/* 50 */                        int i = 2;
/* 53 */                        if (z) {
/* 68 */                            if (((OoiIlOl1iI) this.I000II.I00000oOI(3000L, new I10OoO(this, iOoil1iiIilo, i))) == null) {
/* 74 */                                Log.e("CXCP", "Waiting for CameraCaptureSession configuration timed out");
                                    }
                                    synchronized (this.I000OiO) {
/* 80 */                                io0i001i0 = this.I00100o1O0lo;
/* 82 */                                this.I00100o1O0lo = null;
                                    }
/* 85 */                            io0i001i02 = io0i001i0;
                                }
/* 109 */                       Trace.beginSection(this.I00000oIO + "#onGraphStopping");
/* 112 */                       Io0oi0 io0oi0 = this.I00000oIO;
/* 114 */                       io0oi0.toString();
/* 117 */                       OlO0OIIl1 olO0OIIl1 = io0oi0.I0000oI00;
/* 119 */                       Io100oIl io100oIl = Io100oIl.I00000oOI;
/* 121 */                       olO0OIIl1.getClass();
/* 124 */                       olO0OIIl1.I000lI(null, io100oIl);
/* 129 */                       io0oi0.I0000Il00O.I00Io1lO(null);
/* 142 */                       for (Io101ll1ol io101ll1ol : io0oi0.I0000O) {
/* 156 */                           io101ll1ol.I00000oIO.I00000oOI(io101ll1ol.I00000oIO(), io100oIl);
                                }
/* 160 */                       Trace.endSection();
/* 163 */                       if (io0i001i02 != null) {
/* 165 */                           I0oiil10Ili i0oiil10Ili = io0i001i02.I00000oOI;
/* 167 */                           toString();
/* 187 */                           Trace.beginSection(this + "#shutdown");
/* 194 */                           if (this.I0000oI00.I00000oIO && ((OoiIlOl1iI) this.I000II.I00000oOI(2000L, new I10OloIi(this, i0oiil10Ili, iOoil1iiIilo, 3))) == null) {
/* 218 */                               Log.e("CXCP", "Failed to abort captures in 2000ms");
                                    }
/* 238 */                           Trace.beginSection(this + "#disconnect");
/* 243 */                           io0i001i02.I0000Il00O.I0000Il00O();
/* 246 */                           Trace.endSection();
/* 253 */                           if (this.I0000oI00.I0000O && ((OoiIlOl1iI) this.I000II.I00000oOI(3000L, new I10OloIi(this, io0i001i02, iOoil1iiIilo, i))) == null) {
/* 274 */                               Log.e("CXCP", "Failed to close the capture session in 3000ms");
                                    }
/* 296 */                           Trace.beginSection(this.I00000oIO + "#onGraphStopped");
/* 301 */                           this.I00000oIO.I0000Il00O();
/* 304 */                           Trace.endSection();
/* 307 */                           Trace.endSection();
                                } else {
/* 330 */                           Trace.beginSection(this.I00000oIO + "#onGraphStopped");
/* 335 */                           this.I00000oIO.I0000Il00O();
/* 338 */                           Trace.endSection();
                                }
/* 343 */                       this.I001IIilI0O.countDown();
                            }
                        } catch (Throwable th) {
/* 743 */                   throw th;
                        }
                    }
                }

                public final void I0001Ioi1lo(boolean z) {
                    IO0I001I0 io0i001i0;
                    Map map;
                    LinkedHashMap linkedHashMap;
                    boolean z2;
                    synchronized (this.I000OiO) {
/* 4 */                 io0i001i0 = this.I00100o1O0lo;
/* 6 */                 map = this.I0010I0i;
/* 8 */                 linkedHashMap = this.I0010o;
                    }
/* 11 */            if (io0i001i0 == null || map == null || linkedHashMap == null) {
/* 409 */               return;
                    }
/* 34 */            Trace.beginSection(this + "#finalizeOutputConfigurations");
/* 37 */            long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
/* 53 */            for (Map.Entry entry : map.entrySet()) {
/* 67 */                int i = ((OlOO0I1) entry.getKey()).I00000oIO;
/* 73 */                I0oiIOi00lo1 i0oiIOi00lo1 = (I0oiIOi00lo1) entry.getValue();
/* 79 */                Object obj = linkedHashMap.get(OlOO0I1.I00000oIO(i));
/* 83 */                if (obj == null) {
/* 95 */                    I000II.I001IO000("Required value was null.");
/* 98 */                    return;
                        }
/* 89 */                i0oiIOi00lo1.I00iOIl.addSurface((Surface) obj);
                    }
/* 101 */           LinkedHashSet linkedHashSet = new LinkedHashSet();
/* 108 */           Iterator it = map.entrySet().iterator();
/* 116 */           while (it.hasNext()) {
/* 130 */               linkedHashSet.add((I0oiIOi00lo1) ((Map.Entry) it.next()).getValue());
                    }
/* 140 */           io0i001i0.I00000oIO.I00iiO(IOOi0Ool1i.I00iIi0i1o(linkedHashSet));
                    synchronized (this.I000OiO) {
                        try {
/* 150 */                   if (this.I00111O == IO0I10o.I00iiO) {
/* 154 */                       this.I000l1.putAll(linkedHashMap);
/* 161 */                       Iterator it2 = linkedHashMap.entrySet().iterator();
                                while (true) {
/* 169 */                           z2 = true;
/* 170 */                           if (it2.hasNext()) {
/* 176 */                               Map.Entry entry2 = (Map.Entry) it2.next();
/* 184 */                               int i2 = ((OlOO0I1) entry2.getKey()).I00000oIO;
/* 190 */                               Surface surface = (Surface) entry2.getValue();
/* 194 */                               IIo1loI0 iIo1loI0I00000oIO = this.I0001Ioi1lo.I00000oIO(i2);
/* 198 */                               if (iIo1loI0I00000oIO == null) {
/* 246 */                                   throw new IllegalStateException("Required value was null.");
                                        }
/* 206 */                               if (iIo1loI0I00000oIO.I00000oOI.size() != 1) {
/* 238 */                                   throw new IllegalStateException("Cannot finalize a multi-output stream!");
                                        }
/* 224 */                               this.I000lI.put(OIl1lI0ll101.I00000oIO(((OlOIo0l1O0Ol) IOOi0Ool1i.I00OilO00Il(iIo1loI0I00000oIO.I00000oOI)).I00000oIO), surface);
                                    } else {
/* 253 */                               long jElapsedRealtimeNanos2 = SystemClock.elapsedRealtimeNanos() - jElapsedRealtimeNanos;
/* 256 */                               StringBuilder sb = new StringBuilder();
/* 261 */                               sb.append("Finalized ");
/* 270 */                               ArrayList arrayList = new ArrayList(map.size());
/* 277 */                               Iterator it3 = map.entrySet().iterator();
/* 285 */                               while (it3.hasNext()) {
/* 305 */                                   arrayList.add(OlOO0I1.I00000oIO(((OlOO0I1) ((Map.Entry) it3.next()).getKey()).I00000oIO));
                                        }
/* 309 */                               sb.append(arrayList);
/* 314 */                               sb.append(" for ");
/* 317 */                               sb.append(this);
/* 322 */                               sb.append(" in ");
/* 372 */                               sb.append(String.format(null, "%.3f ms", Arrays.copyOf(new Object[]{Double.valueOf(jElapsedRealtimeNanos2 / 1000000.0d)}, 1)));
/* 379 */                               Log.i("CXCP", sb.toString());
                                    }
                                }
                            } else {
/* 383 */                       z2 = false;
                            }
                        } catch (Throwable th) {
/* 408 */                   throw th;
                        }
                    }
/* 385 */           if (z2 && z) {
/* 389 */               Io0oi0 io0oi0 = this.I00000oIO;
/* 391 */               io0oi0.toString();
/* 400 */               io0oi0.I0000Il00O.I00io1l.I0010I0i(Io0l00io.I00000oOI);
                    }
/* 403 */           Trace.endSection();
                }

                public final void I000II(long j) throws Exception {
                    List<AutoCloseable> listI00iIi0i1o;
                    boolean zIsTerminated;
/* 5 */             if (j != 0) {
/* 16 */                iOi1II01i0.I0000O(this.I000O01llI0, null, null, new IO0IOi1Oi(j, this, (IOoil1iiIilo) null), 3);
/* 19 */                return;
                    }
/* 20 */            toString();
                    synchronized (this.I000OiO) {
/* 34 */                listI00iIi0i1o = IOOi0Ool1i.I00iIi0i1o(this.I001iOo1i0O.values());
/* 40 */                this.I001iOo1i0O.clear();
                    }
/* 54 */            for (AutoCloseable autoCloseable : listI00iIi0i1o) {
/* 64 */                if (autoCloseable instanceof AutoCloseable) {
/* 66 */                    autoCloseable.close();
                        } else {
/* 72 */                    if (!(autoCloseable instanceof ExecutorService)) {
/* 121 */                       OIiilo1Ool0o.I00100o1O0lo();
/* 124 */                       return;
                            }
/* 74 */                    ExecutorService executorService = (ExecutorService) autoCloseable;
/* 80 */                    if (executorService != ForkJoinPool.commonPool() && !(zIsTerminated = executorService.isTerminated())) {
/* 89 */                        executorService.shutdown();
/* 92 */                        boolean z = false;
/* 93 */                        while (!zIsTerminated) {
                                    try {
/* 99 */                                zIsTerminated = executorService.awaitTermination(1L, TimeUnit.DAYS);
                                    } catch (InterruptedException unused) {
/* 104 */                               if (!z) {
/* 106 */                                   executorService.shutdownNow();
/* 109 */                                   z = true;
                                        }
                                    }
                                }
/* 111 */                       if (z) {
/* 117 */                           Thread.currentThread().interrupt();
                                }
                            }
                        }
                    }
                }

                public final void I000O01llI0() throws Exception {
/* 1 */             toString();
/* 21 */            Trace.beginSection(this + "#onClosed");
/* 24 */            I000iOII();
/* 29 */            this.I001i1O0Ol.countDown();
/* 32 */            Oi0Oooi oi0Oooi = this.I000oI1ioi;
/* 34 */            if (oi0Oooi != null) {
/* 36 */                oi0Oooi.I001IIilI0O();
                    }
/* 39 */            Trace.endSection();
                }

                public final void I000OOo1O() throws Exception {
/* 20 */            Log.w("CXCP", this + " Configuration Failed");
/* 40 */            Trace.beginSection(this + "#onConfigureFailed");
/* 53 */            this.I00000oIO.I00000oIO(new Io0oll10il(9, false));
/* 56 */            I000iOII();
/* 61 */            this.I001i1O0Ol.countDown();
/* 64 */            Oi0Oooi oi0Oooi = this.I000oI1ioi;
/* 66 */            if (oi0Oooi != null) {
/* 68 */                oi0Oooi.I001IIilI0O();
                    }
/* 71 */            Trace.endSection();
                }

                public final void I000OiO(IIlIIOi iIlIIOi) {
/* 1 */             toString();
/* 21 */            Trace.beginSection(this + "#configure");
/* 24 */            I0000Il00O(iIlIIOi);
/* 29 */            this.I001i1O0Ol.countDown();
/* 32 */            Oi0Oooi oi0Oooi = this.I000oI1ioi;
/* 34 */            if (oi0Oooi != null) {
/* 36 */                oi0Oooi.I001IIilI0O();
                    }
/* 39 */            Trace.endSection();
                }

                /* JADX WARN: Removed duplicated region for block: B:19:0x0027  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final void I000iOII() throws Exception {
                    long j;
                    boolean z;
                    int i;
/* 1 */             I0000oI00();
                    synchronized (this.I000OiO) {
                        try {
/* 7 */                     IO0I10o iO0I10o = this.I00111O;
/* 9 */                     IO0I10o iO0I10o2 = IO0I10o.I00ilI0I1;
/* 11 */                    j = 0;
/* 13 */                    if (iO0I10o != iO0I10o2) {
/* 17 */                        z = true;
/* 18 */                        if (this.I00100l0 != null && this.I001IO000 && (i = this.I0000oI00.I0000Il00O) != 1) {
/* 33 */                            if (i == 2) {
/* 35 */                                j = 2000;
                                    } else {
/* 40 */                                z = false;
                                    }
                                }
                            }
/* 42 */                    this.I00100l0 = null;
/* 44 */                    this.I00111O = iO0I10o2;
                        } catch (Throwable th) {
/* 55 */                    throw th;
                        }
                    }
/* 47 */            if (z) {
/* 49 */                I000II(j);
                    }
                }

                /* JADX WARN: Removed duplicated region for block: B:38:0x00a0  */
                /* JADX WARN: Removed duplicated region for block: B:39:0x00a5  */
                /* JADX WARN: Removed duplicated region for block: B:41:0x00a8  */
                /* JADX WARN: Removed duplicated region for block: B:42:0x00ab  */
                /* JADX WARN: Removed duplicated region for block: B:45:0x00d8  */
                /* JADX WARN: Removed duplicated region for block: B:46:0x00dd  */
                /* JADX WARN: Removed duplicated region for block: B:51:0x00fc  */
                /* JADX WARN: Removed duplicated region for block: B:53:0x0117  */
                /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object I000l1(IOoilo iOoilo) throws Throwable {
                    IO0IOloilOIO iO0IOloilOIO;
                    OOo0ooi oOo0ooi;
                    OOo0ooi oOo0ooi2;
                    OOo0ooi oOo0ooi3;
                    OOo0ooi oOo0ooi4;
                    IO01oi0 iO01oi0I00000oIO;
                    LinkedHashMap linkedHashMap;
/* 9 */             if (iOoilo instanceof IO0IOloilOIO) {
/* 12 */                iO0IOloilOIO = (IO0IOloilOIO) iOoilo;
/* 14 */                int i = iO0IOloilOIO.I00ilI0I1;
/* 20 */                if ((i & Integer.MIN_VALUE) != 0) {
/* 23 */                    iO0IOloilOIO.I00ilI0I1 = i - Integer.MIN_VALUE;
                        } else {
/* 28 */                    iO0IOloilOIO = new IO0IOloilOIO(this, iOoilo);
                        }
                    }
/* 31 */            Object obj = iO0IOloilOIO.I00iiO;
/* 33 */            Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 35 */            int i2 = iO0IOloilOIO.I00ilI0I1;
                    try {
/* 39 */                if (i2 == 0) {
/* 57 */                    lIoii1l01l0i.I00000oOI(obj);
/* 62 */                    oOo0ooi = new OOo0ooi();
/* 67 */                    oOo0ooi2 = new OOo0ooi();
                            synchronized (this.I000OiO) {
/* 77 */                        if (this.I00111O != IO0I10o.I00iOIl) {
/* 79 */                            return OoiIlOl1iI.I00000oIO;
                                }
/* 88 */                        oOo0ooi.I00iOIl = this.I001i1lo1io;
/* 90 */                        IIlOl1oOlo1o iIlOl1oOlo1o = this.I00100l0;
/* 92 */                        oOo0ooi2.I00iOIl = iIlOl1oOlo1o;
/* 96 */                        if (oOo0ooi.I00iOIl != null && iIlOl1oOlo1o != null) {
/* 104 */                           this.I00111O = IO0I10o.I00iiI;
/* 106 */                           this.I001IO000 = true;
/* 108 */                           long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
/* 114 */                           Oo11iO1 oo11iO1 = new Oo11iO1();
/* 117 */                           oo11iO1.I00000oIO = jElapsedRealtimeNanos;
/* 119 */                           VarHandle.storeStoreFence();
/* 122 */                           this.I000o00OoI0I = oo11iO1;
/* 125 */                           Oi0Oooi oi0Oooi = this.I000oI1ioi;
/* 127 */                           if (oi0Oooi != null) {
/* 129 */                               iO0IOloilOIO.I00iOIl = oOo0ooi;
/* 131 */                               iO0IOloilOIO.I00iiI = oOo0ooi2;
/* 133 */                               iO0IOloilOIO.I00ilI0I1 = 1;
/* 139 */                               if (oi0Oooi.I0000oI00(iO0IOloilOIO) == ii0111o) {
/* 141 */                                   return ii0111o;
                                        }
/* 142 */                               oOo0ooi3 = oOo0ooi;
/* 143 */                               oOo0ooi4 = oOo0ooi2;
                                    }
/* 152 */                           StringBuilder sb = new StringBuilder("Creating CameraCaptureSession from ");
/* 157 */                           IIlOl1oOlo1o iIlOl1oOlo1o2 = (IIlOl1oOlo1o) oOo0ooi2.I00iOIl;
/* 166 */                           String strI000l1 = iIlOl1oOlo1o2 == null ? iIlOl1oOlo1o2.I000l1() : null;
/* 176 */                           sb.append((Object) (strI000l1 != null ? "null" : IIllI0o.I0000Il00O(strI000l1)));
/* 181 */                           sb.append(" using ");
/* 184 */                           sb.append(this);
/* 189 */                           sb.append(" with ");
/* 194 */                           sb.append(oOo0ooi.I00iOIl);
/* 201 */                           Log.i("CXCP", sb.toString());
/* 208 */                           StringBuilder sb2 = new StringBuilder("CameraDevice-");
/* 213 */                           IIlOl1oOlo1o iIlOl1oOlo1o3 = (IIlOl1oOlo1o) oOo0ooi2.I00iOIl;
/* 229 */                           Trace.beginSection(IIl001iO0Io.I00100l0(sb2, iIlOl1oOlo1o3 == null ? iIlOl1oOlo1o3.I000l1() : null, "#createCaptureSession"));
/* 242 */                           iO01oi0I00000oIO = this.I00000oOI.I00000oIO((IIlOl1oOlo1o) oOo0ooi2.I00iOIl, (Map) oOo0ooi.I00iOIl, this);
/* 246 */                           Trace.endSection();
/* 251 */                           if (iO01oi0I00000oIO instanceof IO01oi) {
/* 274 */                               Log.e("CXCP", "Failed to create capture session for " + this + '!');
/* 277 */                               return OoiIlOl1iI.I00000oIO;
                                    }
                                    synchronized (this.I000OiO) {
                                        try {
/* 283 */                                   IO0I10o iO0I10o = this.I00111O;
/* 287 */                                   if (iO0I10o != IO0I10o.I00iio && iO0I10o != IO0I10o.I00ilI0I1) {
/* 297 */                                       if (iO0I10o != IO0I10o.I00iiI) {
/* 489 */                                           throw new IllegalStateException(("Unexpected state: " + this.I00111O).toString());
                                                }
/* 301 */                                       this.I00111O = IO0I10o.I00iiO;
/* 309 */                                       this.I000l1.putAll((Map) oOo0ooi.I00iOIl);
/* 319 */                                       this.I000lI.putAll(((IO01oi) iO01oi0I00000oIO).I00iiI);
/* 324 */                                       Map map = ((IO01oi) iO01oi0I00000oIO).I00iOIl;
/* 330 */                                       if (!map.isEmpty()) {
/* 386 */                                           Log.i("CXCP", "Created " + this + " with " + IOOi0Ool1i.I00iIi0i1o(((Map) oOo0ooi.I00iOIl).keySet()) + ". Waiting to finalize " + IOOi0Ool1i.I00iIi0i1o(map.keySet()));
/* 389 */                                           this.I0010I0i = map;
/* 391 */                                           Map map2 = this.I001i1lo1io;
/* 393 */                                           if (map2 != null) {
/* 397 */                                               linkedHashMap = new LinkedHashMap();
/* 412 */                                               for (Map.Entry entry : map2.entrySet()) {
/* 428 */                                                   if (map.containsKey(entry.getKey())) {
/* 438 */                                                       linkedHashMap.put(entry.getKey(), entry.getValue());
                                                            }
                                                        }
                                                    } else {
/* 444 */                                               linkedHashMap = null;
                                                    }
/* 445 */                                           if (linkedHashMap != null && linkedHashMap.size() == map.size()) {
/* 457 */                                               this.I0010o = linkedHashMap;
                                                    }
                                                }
/* 460 */                                       I0000Il00O(null);
/* 463 */                                       return OoiIlOl1iI.I00000oIO;
                                            }
/* 519 */                                   Log.i("CXCP", "Warning: " + this + " was " + this.I00111O + " while configuration was in progress.");
/* 522 */                                   return OoiIlOl1iI.I00000oIO;
                                        } catch (Throwable th) {
/* 527 */                                   throw th;
                                        }
                                    }
                                }
/* 533 */                       return OoiIlOl1iI.I00000oIO;
                            }
                        }
/* 41 */                if (i2 != 1) {
/* 53 */                    I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 38 */                    return null;
                        }
/* 43 */                oOo0ooi4 = iO0IOloilOIO.I00iiI;
/* 45 */                oOo0ooi3 = iO0IOloilOIO.I00iOIl;
/* 47 */                lIoii1l01l0i.I00000oOI(obj);
/* 229 */               Trace.beginSection(IIl001iO0Io.I00100l0(sb2, iIlOl1oOlo1o3 == null ? iIlOl1oOlo1o3.I000l1() : null, "#createCaptureSession"));
/* 242 */               iO01oi0I00000oIO = this.I00000oOI.I00000oIO((IIlOl1oOlo1o) oOo0ooi2.I00iOIl, (Map) oOo0ooi.I00iOIl, this);
/* 246 */               Trace.endSection();
/* 251 */               if (iO01oi0I00000oIO instanceof IO01oi) {
                        }
                    } catch (Throwable th2) {
/* 529 */               Trace.endSection();
/* 532 */               throw th2;
                    }
/* 144 */           oOo0ooi = oOo0ooi3;
/* 145 */           oOo0ooi2 = oOo0ooi4;
/* 152 */           StringBuilder sb3 = new StringBuilder("Creating CameraCaptureSession from ");
/* 157 */           IIlOl1oOlo1o iIlOl1oOlo1o22 = (IIlOl1oOlo1o) oOo0ooi2.I00iOIl;
/* 166 */           if (iIlOl1oOlo1o22 == null) {
                    }
/* 176 */           sb3.append((Object) (strI000l1 != null ? "null" : IIllI0o.I0000Il00O(strI000l1)));
/* 181 */           sb3.append(" using ");
/* 184 */           sb3.append(this);
/* 189 */           sb3.append(" with ");
/* 194 */           sb3.append(oOo0ooi.I00iOIl);
/* 201 */           Log.i("CXCP", sb3.toString());
/* 208 */           StringBuilder sb22 = new StringBuilder("CameraDevice-");
/* 213 */           IIlOl1oOlo1o iIlOl1oOlo1o32 = (IIlOl1oOlo1o) oOo0ooi2.I00iOIl;
                }

                public final void I000lI(Map map, Map map2) throws Exception {
                    boolean zIsTerminated;
/* 1 */             LinkedHashMap linkedHashMap = this.I001iOo1i0O;
/* 9 */             Set setI00iio = IOOi0Ool1i.I00iio(map.values());
/* 19 */            Set setI00iio2 = IOOi0Ool1i.I00iio(map2.values());
/* 38 */            for (Surface surface : Oio0lI.I0000Il00O(setI00iio, setI00iio2)) {
/* 50 */                AutoCloseable autoCloseable = (AutoCloseable) linkedHashMap.remove(surface);
/* 52 */                if (autoCloseable == null) {
/* 118 */                   autoCloseable = null;
                        } else if (autoCloseable instanceof AutoCloseable) {
/* 58 */                    autoCloseable.close();
                        } else {
/* 64 */                    if (!(autoCloseable instanceof ExecutorService)) {
/* 114 */                       OIiilo1Ool0o.I00100o1O0lo();
/* 117 */                       return;
                            }
/* 67 */                    ExecutorService executorService = (ExecutorService) autoCloseable;
/* 73 */                    if (executorService != ForkJoinPool.commonPool() && !(zIsTerminated = executorService.isTerminated())) {
/* 82 */                        executorService.shutdown();
/* 85 */                        boolean z = false;
/* 86 */                        while (!zIsTerminated) {
                                    try {
/* 92 */                                zIsTerminated = executorService.awaitTermination(1L, TimeUnit.DAYS);
                                    } catch (InterruptedException unused) {
/* 97 */                                if (!z) {
/* 99 */                                    executorService.shutdownNow();
/* 102 */                                   z = true;
                                        }
                                    }
                                }
/* 104 */                       if (z) {
/* 110 */                           Thread.currentThread().interrupt();
                                }
                            }
                        }
/* 119 */               if (autoCloseable == null) {
/* 126 */                   IOOlIIilOl0.I0001Ioi1lo(surface, "Surface ", " doesn't have a matching surface token!");
/* 129 */                   return;
                        }
                    }
/* 144 */           for (Surface surface2 : Oio0lI.I0000Il00O(setI00iio2, setI00iio)) {
/* 158 */               linkedHashMap.put(surface2, this.I0000O.I00000oIO(surface2));
                    }
                }

                public final String toString() {
/* 13 */            return "CaptureSessionState-" + this.I000OOo1O;
                }
            }

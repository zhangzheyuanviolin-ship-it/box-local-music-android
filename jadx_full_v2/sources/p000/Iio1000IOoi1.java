            package p000;

            import android.graphics.SurfaceTexture;
            import android.os.Handler;
            import android.os.HandlerThread;
            import android.view.Surface;
            import java.lang.invoke.VarHandle;
            import java.util.Collections;
            import java.util.Iterator;
            import java.util.LinkedHashMap;
            import java.util.Map;
            import java.util.concurrent.ExecutionException;
            import java.util.concurrent.RejectedExecutionException;
            import java.util.concurrent.atomic.AtomicBoolean;
            
            public final class Iio1000IOoi1 implements Olioli, SurfaceTexture.OnFrameAvailableListener {
                public Iio0oli1Ool I00000oIO;
                public HandlerThread I00000oOI;
                public Io11oioo I0000Il00O;
                public Handler I0000O;
                public int I0000oI00;
                public boolean I0001Ioi1lo;
                public AtomicBoolean I000II;
                public LinkedHashMap I000O01llI0;
                public SurfaceTexture I000OOo1O;
                public SurfaceTexture I000OiO;

                @Override
                public final void I00000oIO() {
/* 8 */             if (this.I000II.getAndSet(true)) {
/* 10 */                return;
                    }
/* 15 */            I0100i i0100i = new I0100i(20);
/* 18 */            i0100i.I00iiI = this;
/* 20 */            VarHandle.storeStoreFence();
/* 29 */            I0001Ioi1lo(i0100i, new I0il01i00i(2));
                }

                @Override
                public final void I00000oOI(Oll0I0l1i1 oll0I0l1i1) {
/* 7 */             if (this.I000II.get()) {
/* 9 */                 oll0I0l1i1.I0000Il00O();
/* 12 */                return;
                    }
/* 17 */            I0iOo0oioiO i0iOo0oioiO = new I0iOo0oioiO(28);
/* 20 */            i0iOo0oioiO.I00iiI = this;
/* 22 */            i0iOo0oioiO.I00iiO = oll0I0l1i1;
/* 24 */            VarHandle.storeStoreFence();
/* 30 */            IiI1lo0lOI iiI1lo0lOI = new IiI1lo0lOI(0);
/* 33 */            iiI1lo0lOI.I00iiI = oll0I0l1i1;
/* 35 */            VarHandle.storeStoreFence();
/* 38 */            I0001Ioi1lo(i0iOo0oioiO, iiI1lo0lOI);
                }

                @Override
                public final void I0000O(OliolIlIO oliolIlIO) {
/* 7 */             if (this.I000II.get()) {
/* 9 */                 oliolIlIO.close();
/* 12 */                return;
                    }
/* 17 */            I0iOo0oioiO i0iOo0oioiO = new I0iOo0oioiO(29);
/* 20 */            i0iOo0oioiO.I00iiI = this;
/* 22 */            i0iOo0oioiO.I00iiO = oliolIlIO;
/* 24 */            VarHandle.storeStoreFence();
/* 31 */            I0100i i0100i = new I0100i(18);
/* 34 */            i0100i.I00iiI = oliolIlIO;
/* 36 */            VarHandle.storeStoreFence();
/* 39 */            I0001Ioi1lo(i0iOo0oioiO, i0100i);
                }

                public final void I0000oI00() {
/* 1 */             LinkedHashMap linkedHashMap = this.I000O01llI0;
/* 5 */             if (this.I0001Ioi1lo && this.I0000oI00 == 0) {
/* 15 */                Iterator it = linkedHashMap.keySet().iterator();
/* 23 */                while (it.hasNext()) {
/* 31 */                    ((OliolIlIO) it.next()).close();
                        }
/* 35 */                linkedHashMap.clear();
/* 38 */                Iio0oli1Ool iio0oli1Ool = this.I00000oIO;
/* 49 */                if (((AtomicBoolean) iio0oli1Ool.I00iiO).getAndSet(false)) {
/* 56 */                    Ilo0O01IO.I0000Il00O((Thread) iio0oli1Ool.I00ilI0I1);
/* 59 */                    iio0oli1Ool.I000lI();
                        }
/* 63 */                iio0oli1Ool.I00lll10 = -1;
/* 65 */                iio0oli1Ool.I00o0iI0io1 = -1;
/* 69 */                this.I00000oOI.quit();
                    }
                }

                public final void I0001Ioi1lo(Runnable runnable, Runnable runnable2) {
                    try {
/* 1 */                 Io11oioo io11oioo = this.I0000Il00O;
/* 7 */                 I00ioIO i00ioIO = new I00ioIO(9);
/* 10 */                i00ioIO.I00iiI = this;
/* 12 */                i00ioIO.I00iiO = runnable2;
/* 14 */                i00ioIO.I00iio = runnable;
/* 16 */                VarHandle.storeStoreFence();
/* 19 */                io11oioo.execute(i00ioIO);
                    } catch (RejectedExecutionException e) {
/* 28 */                l11I11lO.I0001Ioi1lo("DualSurfaceProcessor", "Unable to executor runnable", e);
/* 31 */                runnable2.run();
                    }
                }

                public final void I000II(Iio1oiI iio1oiI) {
/* 1 */             Map map = Collections.EMPTY_MAP;
/* 6 */             IIoIil iIoIil = new IIoIil(6);
/* 9 */             iIoIil.I00iiI = this;
/* 11 */            iIoIil.I00iiO = iio1oiI;
/* 13 */            VarHandle.storeStoreFence();
                    try {
/* 20 */                iOiiloIII0O.I00000oIO(iIoIil).get();
                    } catch (InterruptedException | ExecutionException e) {
/* 24 */                e = e;
/* 27 */                if (e instanceof ExecutionException) {
/* 29 */                    e = e.getCause();
                        }
/* 35 */                if (e instanceof RuntimeException) {
/* 77 */                    throw ((RuntimeException) e);
                        }
/* 39 */                IoOOl0iOl1io.I000l1("Failed to create DefaultSurfaceProcessor", e);
                    }
                }

                @Override
                public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
                    SurfaceTexture surfaceTexture2;
/* 7 */             if (this.I000II.get() || (surfaceTexture2 = this.I000OOo1O) == null || this.I000OiO == null) {
/* 168 */               return;
                    }
/* 19 */            surfaceTexture2.updateTexImage();
/* 24 */            this.I000OiO.updateTexImage();
/* 41 */            for (Map.Entry entry : this.I000O01llI0.entrySet()) {
/* 54 */                Surface surface = (Surface) entry.getValue();
/* 61 */                OliolIlIO oliolIlIO = (OliolIlIO) entry.getKey();
/* 67 */                if (oliolIlIO.I00iiO == 34) {
                            try {
/* 79 */                        this.I00000oIO.I0010I0i(surfaceTexture.getTimestamp(), surface, oliolIlIO, this.I000OOo1O, this.I000OiO);
                            } catch (RuntimeException e) {
/* 88 */                        l11I11lO.I00000oOI("DualSurfaceProcessor", "Failed to render with OpenGL.", e);
                            }
                        }
                    }
                }
            }

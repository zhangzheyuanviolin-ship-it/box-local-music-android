            package p000;

            import android.os.Trace;
            import android.view.Choreographer;
            import android.view.View;
            import java.util.PriorityQueue;
            import java.util.concurrent.TimeUnit;
            
            public final class I0oo0lloI implements OOI1lioOOo0, View.OnAttachStateChangeListener, Runnable, Choreographer.FrameCallback {
                public static long I00ioIO;
                public View I00iOIl;
                public PriorityQueue I00iiI;
                public boolean I00iiO;
                public Choreographer I00iio;
                public I0oo0IlI01li I00ilI0I1;
                public boolean I00ilO0;
                public long I00io1l;

                @Override
                public final void I00000oIO(OOI1io1Ioo oOI1io1Ioo) {
/* 9 */             this.I00iiI.add(new OOIl01(1, oOI1io1Ioo));
/* 14 */            if (this.I00iiO) {
/* 29 */                return;
                    }
/* 16 */            this.I00iiO = true;
/* 20 */            this.I00iOIl.post(this);
                }

                public final boolean I00000oOI() {
/* 1 */             PriorityQueue priorityQueue = this.I00iiI;
/* 3 */             I0oo0IlI01li i0oo0IlI01li = this.I00ilI0I1;
/* 5 */             long jI00000oIO = i0oo0IlI01li.I00000oIO();
/* 11 */            Trace.setCounter("compose:lazy:prefetch:available_time_nanos", jI00000oIO);
/* 18 */            boolean z = true;
/* 19 */            if (jI00000oIO > 0) {
/* 34 */                if (!((OOIl01) priorityQueue.peek()).I00000oOI.I0000Il00O(i0oo0IlI01li)) {
/* 37 */                    priorityQueue.poll();
/* 40 */                    z = false;
                        }
/* 41 */                i0oo0IlI01li.I00000oIO = false;
                    }
/* 55 */            return z;
                }

                @Override
                public final void doFrame(long j) {
/* 3 */             if (this.I00ilO0) {
/* 5 */                 this.I00io1l = j;
/* 9 */                 this.I00iOIl.post(this);
                    }
                }

                @Override
                public final void onViewAttachedToWindow(View view) {
/* 2 */             this.I00ilO0 = true;
                }

                @Override
                public final void onViewDetachedFromWindow(View view) {
/* 2 */             this.I00ilO0 = false;
/* 6 */             this.I00iOIl.removeCallbacks(this);
/* 11 */            this.I00iio.removeFrameCallback(this);
                }

                @Override
                public final void run() {
/* 1 */             View view = this.I00iOIl;
/* 3 */             I0oo0IlI01li i0oo0IlI01li = this.I00ilI0I1;
/* 5 */             PriorityQueue priorityQueue = this.I00iiI;
/* 12 */            if (priorityQueue.isEmpty() || !this.I00iiO || !this.I00ilO0 || view.getWindowVisibility() != 0) {
/* 123 */               this.I00iiO = false;
/* 245 */               return;
                    }
/* 35 */            long nanos = TimeUnit.MILLISECONDS.toNanos(view.getDrawingTime());
/* 56 */            i0oo0IlI01li.I00000oIO = System.nanoTime() > (2 * I00ioIO) + nanos;
/* 67 */            i0oo0IlI01li.I00000oOI = Math.max(this.I00io1l, nanos) + I00ioIO;
/* 69 */            boolean zI00000oOI = false;
/* 74 */            while (!priorityQueue.isEmpty() && !zI00000oOI) {
/* 80 */                if (i0oo0IlI01li.I00000oIO) {
/* 84 */                    Trace.beginSection("compose:lazy:prefetch:idle_frame");
                            try {
/* 87 */                        zI00000oOI = I00000oOI();
                            } finally {
/* 96 */                        Trace.endSection();
                            }
                        } else {
/* 100 */                   zI00000oOI = I00000oOI();
                        }
                    }
/* 105 */           if (zI00000oOI) {
/* 109 */               this.I00iio.postFrameCallback(this);
                    } else {
/* 113 */               this.I00iiO = false;
                    }
/* 119 */           Trace.setCounter("compose:lazy:prefetch:available_time_nanos", 0L);
                }
            }

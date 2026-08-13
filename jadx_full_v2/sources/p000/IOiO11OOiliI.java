            package p000;

            import android.os.Looper;
            import android.os.SystemClock;
            import android.view.View;
            import android.view.ViewTreeObserver;
            import java.lang.invoke.VarHandle;
            import java.util.concurrent.Executor;
            
            public final class IOiO11OOiliI implements ViewTreeObserver.OnDrawListener, Runnable, Executor {
                public long I00iOIl;
                public Runnable I00iiI;
                public boolean I00iiO;
                public Ill0oOi0 I00iio;

                public final void I00000oIO(View view) {
/* 3 */             if (this.I00iiO) {
/* 29 */                return;
                    }
/* 6 */             this.I00iiO = true;
/* 12 */            view.getViewTreeObserver().addOnDrawListener(this);
                }

                @Override
                public final void execute(Runnable runnable) {
/* 1 */             this.I00iiI = runnable;
/* 9 */             View decorView = this.I00iio.getWindow().getDecorView();
/* 15 */            if (this.I00iiO) {
/* 29 */                if (O0000Ioio00.I0000O(Looper.myLooper(), Looper.getMainLooper())) {
/* 31 */                    decorView.invalidate();
/* 34 */                    return;
                        } else {
/* 35 */                    decorView.postInvalidate();
/* 38 */                    return;
                        }
                    }
/* 43 */            I0100i i0100i = new I0100i(14);
/* 46 */            i0100i.I00iiI = this;
/* 48 */            VarHandle.storeStoreFence();
/* 51 */            decorView.postOnAnimation(i0100i);
                }

                @Override
                public final void onDraw() {
                    boolean z;
/* 1 */             Runnable runnable = this.I00iiI;
/* 4 */             if (runnable == null) {
/* 57 */                if (SystemClock.uptimeMillis() > this.I00iOIl) {
/* 59 */                    this.I00iiO = false;
/* 71 */                    this.I00iio.getWindow().getDecorView().post(this);
/* 110 */                   return;
                        }
/* 110 */               return;
                    }
/* 6 */             runnable.run();
/* 10 */            this.I00iiI = null;
/* 20 */            IllOIi01iOl illOIi01iOl = (IllOIi01iOl) this.I00iio.I00io1l.getValue();
                    synchronized (illOIi01iOl.I00000oIO) {
/* 25 */                z = illOIi01iOl.I00000oOI;
                    }
/* 28 */            if (z) {
/* 30 */                this.I00iiO = false;
/* 42 */                this.I00iio.getWindow().getDecorView().post(this);
                    }
                }

                @Override
                public final void run() {
/* 15 */            this.I00iio.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(this);
                }
            }

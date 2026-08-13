            package p000;

            import android.os.Handler;
            import android.view.Choreographer;
            import java.lang.invoke.VarHandle;
            import java.util.ArrayList;
            
            public final class I101OO01 extends Ii00lIOoi {
                public static final OllO00oiil I00ll1 = new OllO00oiil(new I01iOOoiOI(12));
                public static final I0OiiiO I00lli11 = new I0OiiiO(4);
                public final Choreographer I00iiI;
                public final Handler I00iiO;
                public final Object I00iio = new Object();
                public final I1Il0loi I00ilI0I1 = new I1Il0loi();
                public ArrayList I00ilO0 = new ArrayList();
                public ArrayList I00io1l = new ArrayList();
                public boolean I00ioIO;
                public boolean I00l0I0l0lO1;
                public final I101Illool I00l0OO0IO;
                public final I101iI1i I00li1OI;

                public I101OO01(Choreographer choreographer, Handler handler) {
/* 4 */             this.I00iiI = choreographer;
/* 6 */             this.I00iiO = handler;
/* 38 */            I101Illool i101Illool = new I101Illool();
/* 41 */            i101Illool.I00iOIl = this;
/* 43 */            VarHandle.storeStoreFence();
/* 46 */            this.I00l0OO0IO = i101Illool;
/* 51 */            I101iI1i i101iI1i = new I101iI1i(0);
/* 54 */            i101iI1i.I00iiI = choreographer;
/* 56 */            i101iI1i.I00iiO = this;
/* 58 */            VarHandle.storeStoreFence();
/* 61 */            this.I00li1OI = i101iI1i;
                }

                @Override
                public final void I00iOIl(Ii00l101O ii00l101O, Runnable runnable) {
                    synchronized (this.I00iio) {
/* 6 */                 this.I00ilI0I1.addLast(runnable);
/* 11 */                if (!this.I00ioIO) {
/* 14 */                    this.I00ioIO = true;
/* 20 */                    this.I00iiO.post(this.I00l0OO0IO);
/* 25 */                    if (!this.I00l0I0l0lO1) {
/* 27 */                        this.I00l0I0l0lO1 = true;
/* 33 */                        this.I00iiI.postFrameCallback(this.I00l0OO0IO);
                            }
                        }
                    }
                }

                public final void I00ooiO1I() {
                    Runnable runnable;
                    boolean z;
/* 70 */            do {
                        synchronized (this.I00iio) {
/* 4 */                     I1Il0loi i1Il0loi = this.I00ilI0I1;
/* 19 */                    runnable = (Runnable) (i1Il0loi.isEmpty() ? null : i1Il0loi.removeFirst());
                        }
/* 22 */                while (runnable != null) {
/* 24 */                    runnable.run();
                            synchronized (this.I00iio) {
/* 30 */                        I1Il0loi i1Il0loi2 = this.I00ilI0I1;
/* 44 */                        runnable = (Runnable) (i1Il0loi2.isEmpty() ? null : i1Il0loi2.removeFirst());
                            }
                        }
                        synchronized (this.I00iio) {
/* 60 */                    if (this.I00ilI0I1.isEmpty()) {
/* 62 */                        z = false;
/* 63 */                        this.I00ioIO = false;
                            } else {
/* 68 */                        z = true;
                            }
                        }
/* 70 */            } while (z);
                }
            }

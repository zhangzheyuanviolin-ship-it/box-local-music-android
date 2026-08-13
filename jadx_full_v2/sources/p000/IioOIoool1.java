            package p000;

            import android.os.Trace;
            import android.view.View;
            import com.google.common.util.concurrent.ListenableFuture;
            import java.lang.invoke.VarHandle;
            
            public final class IioOIoool1 implements Runnable {
                public final int I00iOIl;
                public Object I00iiI;
                public Object I00iiO;
                public Object I00iio;
                public Object I00ilI0I1;
                public Object I00ilO0;

                public IioOIoool1(int i) {
/* 1 */             this.I00iOIl = i;
                }

                @Override
                public final void run() {
                    switch (this.I00iOIl) {
                        case 0:
/* 139 */                   IioOoIooO iioOoIooO = (IioOoIooO) this.I00iiI;
/* 144 */                   OllO11I0Ooo ollO11I0Ooo = (OllO11I0Ooo) this.I00iiO;
/* 149 */                   OllO11I0Ooo ollO11I0Ooo2 = (OllO11I0Ooo) this.I00iio;
/* 153 */                   IOiO1Ol iOiO1Ol = (IOiO1Ol) this.I00ilI0I1;
/* 158 */                   View view = (View) this.I00ilO0;
/* 196 */                   iioOoIooO.I00000oIO(ollO11I0Ooo, ollO11I0Ooo2, iOiO1Ol.getWindow(), view, ((Boolean) ollO11I0Ooo.I0000Il00O.invoke(view.getResources())).booleanValue(), ((Boolean) ollO11I0Ooo2.I0000Il00O.invoke(view.getResources())).booleanValue());
/* 199 */                   return;
                        case 1:
/* 85 */                    OoIlol ooIlol = (OoIlol) this.I00iiI;
/* 89 */                    Oio0llilli oio0llilli = (Oio0llilli) this.I00iiO;
/* 93 */                    ListenableFuture listenableFuture = (ListenableFuture) this.I00iio;
/* 97 */                    ListenableFuture listenableFuture2 = (ListenableFuture) this.I00ilI0I1;
/* 101 */                   Il11olIIio1i il11olIIio1i = (Il11olIIio1i) this.I00ilO0;
/* 107 */                   if (ooIlol.isDone()) {
/* 109 */                       oio0llilli.I000o00OoI0I(listenableFuture);
/* 135 */                       return;
                            } else {
/* 117 */                       if (listenableFuture2.isCancelled()) {
/* 119 */                           int i = Il11olIIio1i.I00ilI0I1;
/* 129 */                           if (il11olIIio1i.compareAndSet(Il11o0l.I00iOIl, Il11o0l.I00iiI)) {
/* 132 */                               ooIlol.cancel(false);
/* 135 */                               return;
                                    }
/* 135 */                           return;
                                }
/* 135 */                       return;
                            }
                        default:
/* 8 */                     O1oO0lOoI1 o1oO0lOoI1 = (O1oO0lOoI1) this.I00iiI;
/* 12 */                    String str = (String) this.I00iiO;
/* 16 */                    IllOOo00lI illOOo00lI = (IllOOo00lI) this.I00iio;
/* 20 */                    OI0lOii0I oI0lOii0I = (OI0lOii0I) this.I00ilI0I1;
/* 24 */                    IIiOOI iIiOOI = (IIiOOI) this.I00ilO0;
/* 26 */                    o1oO0lOoI1.getClass();
/* 29 */                    boolean zIsEnabled = Trace.isEnabled();
/* 33 */                    if (zIsEnabled) {
                                try {
/* 35 */                            lOo0I0iOi11O.I00000oIO(str);
                                } finally {
                                }
                            }
                            try {
/* 42 */                        illOOo00lI.invoke();
/* 45 */                        OIiOOiO1O oIiOOiO1O = IIloOI.I00iiO;
/* 47 */                        oI0lOii0I.I000OOo1O(oIiOOiO1O);
/* 50 */                        iIiOOI.I00000oOI(oIiOOiO1O);
                            } catch (Throwable th) {
/* 57 */                        OIiOIoI oIiOIoI = new OIiOIoI();
/* 60 */                        oIiOIoI.I00000oIO = th;
/* 62 */                        VarHandle.storeStoreFence();
/* 65 */                        oI0lOii0I.I000OOo1O(oIiOIoI);
/* 68 */                        iIiOOI.I0000O(th);
                            }
/* 71 */                    if (zIsEnabled) {
/* 73 */                        Trace.endSection();
/* 76 */                        return;
                            }
/* 76 */                    return;
                    }
                }
            }

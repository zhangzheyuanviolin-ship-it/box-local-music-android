            package p000;

            import android.content.ComponentCallbacks2;
            import android.content.Context;
            import android.content.res.Configuration;
            import java.lang.ref.WeakReference;
            import java.util.concurrent.atomic.AtomicBoolean;
            
            public final class OllO11Iooi implements ComponentCallbacks2 {
                public Context I00iOIl;
                public WeakReference I00iiI;
                public OIIO0loiI I00iiO;
                public volatile boolean I00iio;
                public AtomicBoolean I00ilI0I1;

                public final void I00000oIO() {
/* 8 */             if (this.I00ilI0I1.getAndSet(true)) {
/* 10 */                return;
                    }
/* 13 */            this.I00iOIl.unregisterComponentCallbacks(this);
/* 18 */            this.I00iiO.shutdown();
                }

                @Override
                public final void onConfigurationChanged(Configuration configuration) {
/* 9 */             if (((OOllOII) this.I00iiI.get()) == null) {
/* 11 */                I00000oIO();
                    }
                }

                @Override
                public final void onLowMemory() {
/* 3 */             onTrimMemory(80);
                }

                @Override
                public final void onTrimMemory(int i) {
                    OoiIlOl1iI ooiIlOl1iI;
/* 7 */             OOllOII oOllOII = (OOllOII) this.I00iiI.get();
/* 9 */             if (oOllOII != null) {
/* 17 */                OOlliOiioo oOlliOiioo = (OOlliOiioo) oOllOII.I00000oOI.getValue();
/* 19 */                if (oOlliOiioo != null) {
/* 23 */                    oOlliOiioo.I00000oIO.I000OiO(i);
/* 26 */                    O1I1OO o1i1oo = oOlliOiioo.I00000oOI;
                            synchronized (o1i1oo) {
/* 31 */                        if (i >= 10 && i != 20) {
/* 37 */                            o1i1oo.I00000oOI();
                                }
                            }
                        }
/* 45 */                ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
                    } else {
/* 48 */                ooiIlOl1iI = null;
                    }
/* 49 */            if (ooiIlOl1iI == null) {
/* 51 */                I00000oIO();
                    }
                }
            }

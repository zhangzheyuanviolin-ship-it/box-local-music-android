            package p000;

            import android.content.Context;
            import android.net.ConnectivityManager;
            import android.net.NetworkInfo;
            import java.lang.invoke.VarHandle;
            import java.util.Objects;
            
            public final class Ool0I1 implements Runnable {
                public IiOili0lOO1 I00iOIl;
                public I1lO11 I00iiI;
                public int I00iiO;
                public Runnable I00iio;

                @Override
                public final void run() {
/* 1 */             IiOili0lOO1 iiOili0lOO1 = this.I00iOIl;
/* 3 */             I1lO11 i1lO11 = this.I00iiI;
/* 5 */             int i = this.I00iiO;
/* 7 */             Runnable runnable = this.I00iio;
/* 11 */            OiIIilol0iO oiIIilol0iO = (OiIIilol0iO) iiOili0lOO1.I00io1l;
                    try {
                        try {
/* 15 */                    OiIIilol0iO oiIIilol0iO2 = (OiIIilol0iO) iiOili0lOO1.I00iio;
/* 17 */                    Objects.requireNonNull(oiIIilol0iO2);
/* 23 */                    OiIIOl oiIIOl = new OiIIOl(2);
/* 26 */                    oiIIOl.I00iiI = oiIIilol0iO2;
/* 28 */                    VarHandle.storeStoreFence();
/* 31 */                    oiIIilol0iO.I00100l0(oiIIOl);
/* 46 */                    NetworkInfo activeNetworkInfo = ((ConnectivityManager) ((Context) iiOili0lOO1.I00iiI).getSystemService("connectivity")).getActiveNetworkInfo();
/* 50 */                    if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
/* 66 */                        Ool0IOlo0o ool0IOlo0o = new Ool0IOlo0o();
/* 69 */                        ool0IOlo0o.I00iOIl = iiOili0lOO1;
/* 71 */                        ool0IOlo0o.I00iiI = i1lO11;
/* 73 */                        ool0IOlo0o.I00iiO = i;
/* 75 */                        VarHandle.storeStoreFence();
/* 78 */                        oiIIilol0iO.I00100l0(ool0IOlo0o);
                            } else {
/* 58 */                        iiOili0lOO1.I0000O(i1lO11, i);
                            }
/* 81 */                    runnable.run();
                        } catch (OllIlol unused) {
/* 92 */                    ((IOO000ilo) iiOili0lOO1.I00ilI0I1).I00II0Ol1O0l(i1lO11, i + 1, false);
/* 95 */                    runnable.run();
                        }
                    } catch (Throwable th) {
/* 99 */                runnable.run();
/* 110 */               throw th;
                    }
                }
            }

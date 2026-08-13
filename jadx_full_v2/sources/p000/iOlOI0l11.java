            package p000;

            import android.content.Context;
            import android.util.Log;
            import java.lang.invoke.VarHandle;
            import java.util.concurrent.ExecutorService;
            import java.util.concurrent.Executors;
            
            public final class iOlOI0l11 {
                public static final ExecutorService I000OOo1O = Executors.newSingleThreadExecutor();
                public static final long I000OiO = 604800;
                public static final long I000iOII = 43200;
                public static iOlOI0l11 I000l1;
                public final i0OOo0 I00000oIO;
                public final ExecutorService I00000oOI;
                public final i1Il01 I0000Il00O;
                public final iOliOoiOlI1 I0000O;
                public final long I0000oI00;
                public final long I0001Ioi1lo;
                public final Object I000II;
                public final iOliil I000O01llI0;

                public iOlOI0l11(iOliil ioliil, ExecutorService executorService, i0OOo0 i0ooo0, i1Il01 i1il01, long j, long j2) {
/* 3 */             String str = iOliOoiOlI1.I00000oOI;
/* 5 */             iOliOoiOlI1 ioliooioli1 = new iOliOoiOlI1();
/* 8 */             ioliooioli1.I00000oIO = str;
/* 10 */            VarHandle.storeStoreFence();
/* 21 */            this.I000II = new Object();
/* 23 */            this.I000O01llI0 = ioliil;
/* 25 */            this.I00000oOI = executorService;
/* 27 */            this.I00000oIO = i0ooo0;
/* 29 */            this.I0000O = ioliooioli1;
/* 31 */            this.I0000Il00O = i1il01;
/* 33 */            this.I0000oI00 = j;
/* 35 */            this.I0001Ioi1lo = j2;
                }

                public static synchronized iOlOI0l11 I00000oIO(Context context) {
                    iOlOI0l11 ioloi0l11;
                    iOliil ioliil;
/* 4 */             ioloi0l11 = I000l1;
/* 6 */             if (ioloi0l11 == null) {
                        synchronized (iOliil.class) {
/* 13 */                    ioliil = iOliil.I00ilO0;
/* 15 */                    if (ioliil == null) {
/* 21 */                        ioliil = new iOliil(context, iOll00o11OI.I00000oIO);
/* 24 */                        iOliil.I00ilO0 = ioliil;
                            }
                        }
/* 31 */                ExecutorService executorService = I000OOo1O;
/* 35 */                i0OOo0 i0ooo0 = new i0OOo0();
/* 38 */                i0ooo0.I00000oIO = context;
/* 40 */                VarHandle.storeStoreFence();
/* 47 */                iOllO10O iollo10oI0000O = iOloioo.I0000O("shared-acceleration-allowlist");
/* 52 */                i1Il01 i1il01 = new i1Il01(2);
/* 55 */                i1il01.I00iiI = iollo10oI0000O;
/* 57 */                VarHandle.storeStoreFence();
/* 65 */                iOlOI0l11 ioloi0l112 = new iOlOI0l11(ioliil, executorService, i0ooo0, i1il01, I000OiO, I000iOII);
/* 68 */                I000l1 = ioloi0l112;
/* 70 */                ioloi0l11 = ioloi0l112;
                    }
/* 78 */            return ioloi0l11;
                }

                public final void I00000oOI(String str, String str2) {
/* 11 */            String strI001iOo1i0O = liio1lOi0l0.I00000oIO().I00000oIO.I00111O().I001iOo1i0O();
                    try {
/* 21 */                if (Integer.parseInt(strI001iOo1i0O) < 29) {
/* 24 */                    lOio0o.I0000oI00(null);
/* 27 */                    return;
                        }
/* 33 */                iOlOi1iIii ioloi1iiii = new iOlOi1iIii(0);
/* 36 */                ioloi1iiii.I0000O();
/* 41 */                OloIlI0ll oloIlI0ll = new OloIlI0ll();
/* 46 */                iOlO1o iolo1o = new iOlO1o(0);
/* 49 */                iolo1o.I00iiO = this;
/* 51 */                iolo1o.I00iiI = str;
/* 53 */                iolo1o.I00iio = str2;
/* 55 */                iolo1o.I00ilI0I1 = ioloi1iiii;
/* 57 */                iolo1o.I00ilO0 = oloIlI0ll;
/* 59 */                VarHandle.storeStoreFence();
/* 64 */                this.I00000oOI.execute(iolo1o);
                    } catch (NumberFormatException e) {
/* 89 */                Log.e("AccelerationAllowlist", "Unable to parse OS version returned by the AndroidSystemInfoProvider '" + strI001iOo1i0O + "'", e);
/* 92 */                lOio0o.I0000O(e);
                    }
                }
            }

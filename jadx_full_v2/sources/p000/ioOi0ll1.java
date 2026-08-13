            package p000;

            import com.google.common.util.concurrent.ListenableFuture;
            import java.util.logging.Level;
            import java.util.logging.Logger;
            
            public abstract class ioOi0ll1 implements ListenableFuture {
                public static final Object I00iio = new Object();
                public static final O0o0ill01o0 I00ilI0I1 = new O0o0ill01o0(4, ioOI0i0o11I.class);
                public static final boolean I00ilO0;
                public static final lioii00ii I00io1l;
                public volatile Object I00iOIl;
                public volatile ioO100ol0 I00iiI;
                public volatile ioOOO0liOIIo I00iiO;

                static {
                    boolean z;
                    lioii00ii iooiooilo10i;
                    Throwable th;
                    Throwable th2;
                    try {
/* 26 */                z = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
                    } catch (SecurityException unused) {
/* 31 */                z = false;
                    }
/* 32 */            I00ilO0 = z;
/* 38 */            String property = System.getProperty("java.runtime.name", "");
/* 42 */            Throwable th3 = null;
/* 43 */            if (property == null || property.contains("Android")) {
                        try {
/* 70 */                    iooiooilo10i = new ioOO0OllIil0();
                        } catch (Error | Exception e) {
                            try {
/* 78 */                        iooiooilo10i = new ioOIiliOi();
                            } catch (Error | Exception e2) {
/* 85 */                        th3 = e2;
/* 88 */                        iooiooilo10i = new ioOIooilo10i();
                            }
/* 81 */                    th = th3;
/* 82 */                    th2 = e;
                        }
                    } else {
                        try {
/* 56 */                    iooiooilo10i = new ioOIiliOi();
                        } catch (NoClassDefFoundError unused2) {
/* 64 */                    iooiooilo10i = new ioOIooilo10i();
                        }
                    }
/* 59 */            th = null;
/* 60 */            th2 = null;
/* 92 */            I00io1l = iooiooilo10i;
/* 94 */            if (th != null) {
/* 96 */                O0o0ill01o0 o0o0ill01o0 = I00ilI0I1;
/* 98 */                Logger loggerI00000oOI = o0o0ill01o0.I00000oOI();
/* 102 */               Level level = Level.SEVERE;
/* 111 */               loggerI00000oOI.logp(level, "com.google.common.util.concurrent.AbstractFutureState", "<clinit>", "UnsafeAtomicHelper is broken!", th2);
/* 124 */               o0o0ill01o0.I00000oOI().logp(level, "com.google.common.util.concurrent.AbstractFutureState", "<clinit>", "AtomicReferenceFieldUpdaterAtomicHelper is broken!", th);
                    }
                }

                public final void I00000oIO(ioOOO0liOIIo ioooo0lioiio) {
/* 2 */             ioooo0lioiio.I00000oIO = null;
                    while (true) {
/* 4 */                 ioOOO0liOIIo ioooo0lioiio2 = this.I00iiO;
/* 8 */                 if (ioooo0lioiio2 != ioOOO0liOIIo.I0000Il00O) {
/* 10 */                    ioOOO0liOIIo ioooo0lioiio3 = null;
/* 11 */                    while (ioooo0lioiio2 != null) {
/* 13 */                        ioOOO0liOIIo ioooo0lioiio4 = ioooo0lioiio2.I00000oOI;
/* 17 */                        if (ioooo0lioiio2.I00000oIO != null) {
/* 19 */                            ioooo0lioiio3 = ioooo0lioiio2;
                                } else if (ioooo0lioiio3 != null) {
/* 23 */                            ioooo0lioiio3.I00000oOI = ioooo0lioiio4;
/* 27 */                            if (ioooo0lioiio3.I00000oIO == null) {
                                        break;
                                    }
                                } else if (!I00io1l.I000II(this, ioooo0lioiio2, ioooo0lioiio4)) {
                                    break;
                                }
/* 39 */                        ioooo0lioiio2 = ioooo0lioiio4;
                            }
/* 77 */                    return;
                        }
/* 77 */                return;
                    }
                }

                public abstract Throwable I00000oOI();
            }

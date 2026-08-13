            package p000;

            import com.google.common.util.concurrent.ListenableFuture;
            import java.util.logging.Level;
            import java.util.logging.Logger;
            
            public abstract class ioOi11iiI implements ListenableFuture {
                public static final Object I00iio = new Object();
                public static final O0o0ill01o0 I00ilI0I1 = new O0o0ill01o0(5, ioOI0o10I.class);
                public static final boolean I00ilO0;
                public static final lioiOiO I00io1l;
                public volatile Object I00iOIl;
                public volatile ioO100IioiO0 I00iiI;
                public volatile ioOOIoo I00iiO;

                static {
                    boolean z;
                    lioiOiO iooilooolo;
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
/* 70 */                    iooilooolo = new ioOO0IiIl();
                        } catch (Error | Exception e) {
                            try {
/* 78 */                        iooilooolo = new ioOIiO1();
                            } catch (Error | Exception e2) {
/* 85 */                        th3 = e2;
/* 88 */                        iooilooolo = new ioOIloOolo();
                            }
/* 81 */                    th = th3;
/* 82 */                    th2 = e;
                        }
                    } else {
                        try {
/* 56 */                    iooilooolo = new ioOIiO1();
                        } catch (NoClassDefFoundError unused2) {
/* 64 */                    iooilooolo = new ioOIloOolo();
                        }
                    }
/* 59 */            th = null;
/* 60 */            th2 = null;
/* 92 */            I00io1l = iooilooolo;
/* 94 */            if (th != null) {
/* 96 */                O0o0ill01o0 o0o0ill01o0 = I00ilI0I1;
/* 98 */                Logger loggerI00000oOI = o0o0ill01o0.I00000oOI();
/* 102 */               Level level = Level.SEVERE;
/* 111 */               loggerI00000oOI.logp(level, "com.google.common.util.concurrent.AbstractFutureState", "<clinit>", "UnsafeAtomicHelper is broken!", th2);
/* 124 */               o0o0ill01o0.I00000oOI().logp(level, "com.google.common.util.concurrent.AbstractFutureState", "<clinit>", "AtomicReferenceFieldUpdaterAtomicHelper is broken!", th);
                    }
                }

                public final void I00000oIO(ioOOIoo ioooioo) {
/* 2 */             ioooioo.I00000oIO = null;
                    while (true) {
/* 4 */                 ioOOIoo ioooioo2 = this.I00iiO;
/* 8 */                 if (ioooioo2 != ioOOIoo.I0000Il00O) {
/* 10 */                    ioOOIoo ioooioo3 = null;
/* 11 */                    while (ioooioo2 != null) {
/* 13 */                        ioOOIoo ioooioo4 = ioooioo2.I00000oOI;
/* 17 */                        if (ioooioo2.I00000oIO != null) {
/* 19 */                            ioooioo3 = ioooioo2;
                                } else if (ioooioo3 != null) {
/* 23 */                            ioooioo3.I00000oOI = ioooioo4;
/* 27 */                            if (ioooioo3.I00000oIO == null) {
                                        break;
                                    }
                                } else if (!I00io1l.I000II(this, ioooioo2, ioooioo4)) {
                                    break;
                                }
/* 39 */                        ioooioo2 = ioooioo4;
                            }
/* 77 */                    return;
                        }
/* 77 */                return;
                    }
                }

                public abstract Throwable I00000oOI();
            }

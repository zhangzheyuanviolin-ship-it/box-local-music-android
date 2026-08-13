            package p000;

            import com.google.common.util.concurrent.ListenableFuture;
            import java.util.logging.Level;
            import java.util.logging.Logger;
            
            public abstract class ioi01lIi1 implements ListenableFuture {
                public static final Object I00iio = new Object();
                public static final O0o0ill01o0 I00ilI0I1 = new O0o0ill01o0(6, ioOlolI0ll00.class);
                public static final boolean I00ilO0;
                public static final lioiiOOIoO I00io1l;
                public volatile Object I00iOIl;
                public volatile ioOlIi I00iiI;
                public volatile ioOooi000 I00iiO;

                static {
                    boolean z;
                    lioiiOOIoO ioooloii;
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
/* 70 */                    ioooloii = new ioOooOO();
                        } catch (Error | Exception e) {
                            try {
/* 78 */                        ioooloii = new ioOoi11ooIo();
                            } catch (Error | Exception e2) {
/* 85 */                        th3 = e2;
/* 88 */                        ioooloii = new ioOolOII();
                            }
/* 81 */                    th = th3;
/* 82 */                    th2 = e;
                        }
                    } else {
                        try {
/* 56 */                    ioooloii = new ioOoi11ooIo();
                        } catch (NoClassDefFoundError unused2) {
/* 64 */                    ioooloii = new ioOolOII();
                        }
                    }
/* 59 */            th = null;
/* 60 */            th2 = null;
/* 92 */            I00io1l = ioooloii;
/* 94 */            if (th != null) {
/* 96 */                O0o0ill01o0 o0o0ill01o0 = I00ilI0I1;
/* 98 */                Logger loggerI00000oOI = o0o0ill01o0.I00000oOI();
/* 102 */               Level level = Level.SEVERE;
/* 111 */               loggerI00000oOI.logp(level, "com.google.common.util.concurrent.AbstractFutureState", "<clinit>", "UnsafeAtomicHelper is broken!", th2);
/* 124 */               o0o0ill01o0.I00000oOI().logp(level, "com.google.common.util.concurrent.AbstractFutureState", "<clinit>", "AtomicReferenceFieldUpdaterAtomicHelper is broken!", th);
                    }
                }

                public final void I00000oIO(ioOooi000 iooooi000) {
/* 2 */             iooooi000.I00000oIO = null;
                    while (true) {
/* 4 */                 ioOooi000 iooooi0002 = this.I00iiO;
/* 8 */                 if (iooooi0002 != ioOooi000.I0000Il00O) {
/* 10 */                    ioOooi000 iooooi0003 = null;
/* 11 */                    while (iooooi0002 != null) {
/* 13 */                        ioOooi000 iooooi0004 = iooooi0002.I00000oOI;
/* 17 */                        if (iooooi0002.I00000oIO != null) {
/* 19 */                            iooooi0003 = iooooi0002;
                                } else if (iooooi0003 != null) {
/* 23 */                            iooooi0003.I00000oOI = iooooi0004;
/* 27 */                            if (iooooi0003.I00000oIO == null) {
                                        break;
                                    }
                                } else if (!I00io1l.I000II(this, iooooi0002, iooooi0004)) {
                                    break;
                                }
/* 39 */                        iooooi0002 = iooooi0004;
                            }
/* 77 */                    return;
                        }
/* 77 */                return;
                    }
                }

                public abstract Throwable I00000oOI();
            }

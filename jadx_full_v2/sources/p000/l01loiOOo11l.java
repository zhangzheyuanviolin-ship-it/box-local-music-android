            package p000;

            import com.google.common.util.concurrent.ListenableFuture;
            import java.util.logging.Level;
            import java.util.logging.Logger;
            
            public abstract class l01loiOOo11l implements ListenableFuture {
                public static final Object I00iio = new Object();
                public static final O0o0ill01o0 I00ilI0I1 = new O0o0ill01o0(7, l01iOilOl1il.class);
                public static final boolean I00ilO0;
                public static final liooi0 I00io1l;
                public volatile Object I00iOIl;
                public volatile l01Olo10 I00iiI;
                public volatile l01l0oIOl1 I00iiO;

                static {
                    boolean z;
                    liooi0 l01l0io0lo11Var;
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
/* 70 */                    l01l0io0lo11Var = new l01l0iooIil();
                        } catch (Error | Exception e) {
                            try {
/* 78 */                        l01l0io0lo11Var = new l01l0OooI();
                            } catch (Error | Exception e2) {
/* 85 */                        th3 = e2;
/* 88 */                        l01l0io0lo11Var = new l01l0io0lo11();
                            }
/* 81 */                    th = th3;
/* 82 */                    th2 = e;
                        }
                    } else {
                        try {
/* 56 */                    l01l0io0lo11Var = new l01l0OooI();
                        } catch (NoClassDefFoundError unused2) {
/* 64 */                    l01l0io0lo11Var = new l01l0io0lo11();
                        }
                    }
/* 59 */            th = null;
/* 60 */            th2 = null;
/* 92 */            I00io1l = l01l0io0lo11Var;
/* 94 */            if (th != null) {
/* 96 */                O0o0ill01o0 o0o0ill01o0 = I00ilI0I1;
/* 98 */                Logger loggerI00000oOI = o0o0ill01o0.I00000oOI();
/* 102 */               Level level = Level.SEVERE;
/* 111 */               loggerI00000oOI.logp(level, "com.google.common.util.concurrent.AbstractFutureState", "<clinit>", "UnsafeAtomicHelper is broken!", th2);
/* 124 */               o0o0ill01o0.I00000oOI().logp(level, "com.google.common.util.concurrent.AbstractFutureState", "<clinit>", "AtomicReferenceFieldUpdaterAtomicHelper is broken!", th);
                    }
                }

                public final void I00000oIO(l01l0oIOl1 l01l0oiol1) {
/* 2 */             l01l0oiol1.I00000oIO = null;
                    while (true) {
/* 4 */                 l01l0oIOl1 l01l0oiol12 = this.I00iiO;
/* 8 */                 if (l01l0oiol12 != l01l0oIOl1.I0000Il00O) {
/* 10 */                    l01l0oIOl1 l01l0oiol13 = null;
/* 11 */                    while (l01l0oiol12 != null) {
/* 13 */                        l01l0oIOl1 l01l0oiol14 = l01l0oiol12.I00000oOI;
/* 17 */                        if (l01l0oiol12.I00000oIO != null) {
/* 19 */                            l01l0oiol13 = l01l0oiol12;
                                } else if (l01l0oiol13 != null) {
/* 23 */                            l01l0oiol13.I00000oOI = l01l0oiol14;
/* 27 */                            if (l01l0oiol13.I00000oIO == null) {
                                        break;
                                    }
                                } else if (!I00io1l.I000II(this, l01l0oiol12, l01l0oiol14)) {
                                    break;
                                }
/* 39 */                        l01l0oiol12 = l01l0oiol14;
                            }
/* 77 */                    return;
                        }
/* 77 */                return;
                    }
                }

                public abstract Throwable I00000oOI();
            }

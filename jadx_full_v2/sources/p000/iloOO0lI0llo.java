            package p000;

            import java.lang.invoke.VarHandle;
            import java.util.concurrent.Future;
            import java.util.logging.Level;
            import java.util.logging.Logger;
            
            public abstract class iloOO0lI0llo implements Future {
                public static final Object I00iio = new Object();
                public static final O0o0ill01o0 I00ilI0I1;
                public static final boolean I00ilO0;
                public static final lioI0I I00io1l;
                public volatile Object I00iOIl;
                public volatile iloI0IOOI I00iiI;
                public volatile iloO01 I00iiO;

                static {
                    boolean z;
                    lioI0I iloilo1;
                    Throwable th;
                    Throwable th2;
/* 11 */            O0o0ill01o0 o0o0ill01o0 = new O0o0ill01o0(2);
/* 20 */            o0o0ill01o0.I0000Il00O = new IIiO01(3);
/* 28 */            o0o0ill01o0.I00000oOI = lli100OOO0.class.getName();
/* 30 */            VarHandle.storeStoreFence();
/* 33 */            I00ilI0I1 = o0o0ill01o0;
                    try {
/* 43 */                z = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
                    } catch (SecurityException unused) {
/* 48 */                z = false;
                    }
/* 49 */            I00ilO0 = z;
/* 55 */            String property = System.getProperty("java.runtime.name", "");
/* 59 */            Throwable th3 = null;
/* 60 */            if (property == null || property.contains("Android")) {
                        try {
/* 87 */                    iloilo1 = new iloIoi();
                        } catch (Error | Exception e) {
                            try {
/* 95 */                        iloilo1 = new iloIlOi1();
                            } catch (Error | Exception e2) {
/* 102 */                       th3 = e2;
/* 105 */                       iloilo1 = new iloIlo1();
                            }
/* 98 */                    th = th3;
/* 99 */                    th2 = e;
                        }
                    } else {
                        try {
/* 73 */                    iloilo1 = new iloIlOi1();
                        } catch (NoClassDefFoundError unused2) {
/* 81 */                    iloilo1 = new iloIlo1();
                        }
                    }
/* 76 */            th = null;
/* 77 */            th2 = null;
/* 109 */           I00io1l = iloilo1;
/* 111 */           if (th != null) {
/* 113 */               O0o0ill01o0 o0o0ill01o02 = I00ilI0I1;
/* 115 */               Logger loggerI00000oOI = o0o0ill01o02.I00000oOI();
/* 119 */               Level level = Level.SEVERE;
/* 128 */               loggerI00000oOI.logp(level, "com.google.common.util.concurrent.AbstractFutureState", "<clinit>", "UnsafeAtomicHelper is broken!", th2);
/* 141 */               o0o0ill01o02.I00000oOI().logp(level, "com.google.common.util.concurrent.AbstractFutureState", "<clinit>", "AtomicReferenceFieldUpdaterAtomicHelper is broken!", th);
                    }
                }

                public final void I00000oIO(iloO01 iloo01) {
/* 2 */             iloo01.I00000oIO = null;
                    while (true) {
/* 4 */                 iloO01 iloo012 = this.I00iiO;
/* 8 */                 if (iloo012 != iloO01.I0000Il00O) {
/* 10 */                    iloO01 iloo013 = null;
/* 11 */                    while (iloo012 != null) {
/* 13 */                        iloO01 iloo014 = iloo012.I00000oOI;
/* 17 */                        if (iloo012.I00000oIO != null) {
/* 19 */                            iloo013 = iloo012;
                                } else if (iloo013 != null) {
/* 23 */                            iloo013.I00000oOI = iloo014;
/* 27 */                            if (iloo013.I00000oIO == null) {
                                        break;
                                    }
                                } else if (!I00io1l.I0000Il00O(this, iloo012, iloo014)) {
                                    break;
                                }
/* 39 */                        iloo012 = iloo014;
                            }
/* 77 */                    return;
                        }
/* 77 */                return;
                    }
                }
            }

            package p000;

            import com.google.common.util.concurrent.ListenableFuture;
            import java.util.logging.Level;
            import java.util.logging.Logger;
            
            public abstract class li11oiolO implements ListenableFuture {
                public static final Object I00iio = new Object();
                public static final O0o0ill01o0 I00ilI0I1 = new O0o0ill01o0(8, li10iIlI1O.class);
                public static final boolean I00ilO0;
                public static final ll0lOI I00io1l;
                public volatile Object I00iOIl;
                public volatile li10IIOIIO I00iiI;
                public volatile li111il1iiIi I00iiO;

                static {
                    boolean z;
                    ll0lOI li110olol;
                    Throwable th;
                    Throwable th2;
                    try {
/* 27 */                z = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
                    } catch (SecurityException unused) {
/* 32 */                z = false;
                    }
/* 33 */            I00ilO0 = z;
/* 39 */            String property = System.getProperty("java.runtime.name", "");
/* 43 */            Throwable th3 = null;
/* 44 */            if (property == null || property.contains("Android")) {
                        try {
/* 71 */                    li110olol = new li1111OIill();
                        } catch (Error | Exception e) {
                            try {
/* 79 */                        li110olol = new li110O1();
                            } catch (Error | Exception e2) {
/* 86 */                        th3 = e2;
/* 89 */                        li110olol = new li110OlOl();
                            }
/* 82 */                    th = th3;
/* 83 */                    th2 = e;
                        }
                    } else {
                        try {
/* 57 */                    li110olol = new li110O1();
                        } catch (NoClassDefFoundError unused2) {
/* 65 */                    li110olol = new li110OlOl();
                        }
                    }
/* 60 */            th = null;
/* 61 */            th2 = null;
/* 93 */            I00io1l = li110olol;
/* 95 */            if (th != null) {
/* 97 */                O0o0ill01o0 o0o0ill01o0 = I00ilI0I1;
/* 99 */                Logger loggerI00000oOI = o0o0ill01o0.I00000oOI();
/* 103 */               Level level = Level.SEVERE;
/* 112 */               loggerI00000oOI.logp(level, "com.google.common.util.concurrent.AbstractFutureState", "<clinit>", "UnsafeAtomicHelper is broken!", th2);
/* 125 */               o0o0ill01o0.I00000oOI().logp(level, "com.google.common.util.concurrent.AbstractFutureState", "<clinit>", "AtomicReferenceFieldUpdaterAtomicHelper is broken!", th);
                    }
                }

                public final void I00000oIO(li111il1iiIi li111il1iiii) {
/* 2 */             li111il1iiii.I00000oIO = null;
                    while (true) {
/* 4 */                 li111il1iiIi li111il1iiii2 = this.I00iiO;
/* 8 */                 if (li111il1iiii2 != li111il1iiIi.I0000Il00O) {
/* 10 */                    li111il1iiIi li111il1iiii3 = null;
/* 11 */                    while (li111il1iiii2 != null) {
/* 13 */                        li111il1iiIi li111il1iiii4 = li111il1iiii2.I00000oOI;
/* 17 */                        if (li111il1iiii2.I00000oIO != null) {
/* 19 */                            li111il1iiii3 = li111il1iiii2;
                                } else if (li111il1iiii3 != null) {
/* 23 */                            li111il1iiii3.I00000oOI = li111il1iiii4;
/* 27 */                            if (li111il1iiii3.I00000oIO == null) {
                                        break;
                                    }
                                } else if (!I00io1l.I0000Il00O(this, li111il1iiii2, li111il1iiii4)) {
                                    break;
                                }
/* 39 */                        li111il1iiii2 = li111il1iiii4;
                            }
/* 77 */                    return;
                        }
/* 77 */                return;
                    }
                }

                public abstract Throwable I00000oOI();
            }

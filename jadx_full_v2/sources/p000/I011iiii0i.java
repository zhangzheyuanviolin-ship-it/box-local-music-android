            package p000;

            import com.google.common.util.concurrent.ListenableFuture;
            import java.util.logging.Level;
            import java.util.logging.Logger;
            
            public abstract class I011iiii0i implements ListenableFuture {
                public static final Object I00iio = new Object();
                public static final O0o0ill01o0 I00ilI0I1 = new O0o0ill01o0(0, I011IO1I11OI.class);
                public static final boolean I00ilO0;
                public static final iOI011o I00io1l;
                public volatile Object I00iOIl;
                public volatile I010o0o0oO I00iiI;
                public volatile I011iO I00iiO;

                static {
                    iOI011o i011Io0I1ioi;
                    Throwable th;
                    iOI011o i011iIOio;
/* 10 */            boolean z = false;
                    try {
/* 26 */                z = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
                    } catch (SecurityException unused) {
                    }
/* 30 */            I00ilO0 = z;
/* 36 */            String property = System.getProperty("java.runtime.name", "");
/* 40 */            Throwable e = null;
/* 41 */            if (property == null || property.contains("Android")) {
                        try {
/* 67 */                    i011iIOio = new I011iIOio();
                        } catch (Error | Exception e2) {
                            try {
/* 74 */                        i011Io0I1ioi = new I011Ill();
                            } catch (Error | Exception e3) {
/* 78 */                        e = e3;
/* 81 */                        i011Io0I1ioi = new I011Io0I1ioi();
                            }
/* 84 */                    iOI011o ioi011o = i011Io0I1ioi;
/* 85 */                    th = e2;
/* 86 */                    i011iIOio = ioi011o;
                        }
                    } else {
                        try {
/* 54 */                    i011iIOio = new I011Ill();
                        } catch (NoClassDefFoundError unused2) {
/* 61 */                    i011iIOio = new I011Io0I1ioi();
                        }
                    }
/* 57 */            th = null;
/* 87 */            I00io1l = i011iIOio;
/* 89 */            if (e != null) {
/* 91 */                O0o0ill01o0 o0o0ill01o0 = I00ilI0I1;
/* 93 */                Logger loggerI00000oIO = o0o0ill01o0.I00000oIO();
/* 97 */                Level level = Level.SEVERE;
/* 101 */               loggerI00000oIO.log(level, "UnsafeAtomicHelper is broken!", th);
/* 110 */               o0o0ill01o0.I00000oIO().log(level, "AtomicReferenceFieldUpdaterAtomicHelper is broken!", e);
                    }
                }

                public final void I00000oIO(I011iO i011iO) {
/* 2 */             i011iO.I00000oIO = null;
                    while (true) {
/* 4 */                 I011iO i011iO2 = this.I00iiO;
/* 8 */                 if (i011iO2 == I011iO.I0000Il00O) {
/* 49 */                    return;
                        }
/* 11 */                I011iO i011iO3 = null;
/* 12 */                while (i011iO2 != null) {
/* 14 */                    I011iO i011iO4 = i011iO2.I00000oOI;
/* 18 */                    if (i011iO2.I00000oIO != null) {
/* 20 */                        i011iO3 = i011iO2;
                            } else if (i011iO3 != null) {
/* 24 */                        i011iO3.I00000oOI = i011iO4;
/* 28 */                        if (i011iO3.I00000oIO == null) {
                                    break;
                                }
                            } else if (!I00io1l.I0000Il00O(this, i011iO2, i011iO4)) {
                                break;
                            }
/* 40 */                    i011iO2 = i011iO4;
                        }
/* 49 */                return;
                    }
                }

                public abstract Throwable I00000oOI();
            }

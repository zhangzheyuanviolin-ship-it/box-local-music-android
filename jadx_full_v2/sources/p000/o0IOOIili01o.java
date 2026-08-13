            package p000;

            import android.os.Trace;
            import java.lang.invoke.VarHandle;
            import java.util.ArrayDeque;
            import java.util.UUID;
            import java.util.WeakHashMap;
            import java.util.concurrent.atomic.AtomicReference;
            
            public abstract class o0IOOIili01o {
                public static final AtomicReference I00000oIO;
                public static final WeakHashMap I00000oOI;
                public static final I0OiiiO I0000Il00O;

                static {
/* 16 */            Ioio0O.I000o00OoI0I(5, "androidx.fragment.app.FragmentViewLifecycleOwner.handleLifecycleEvent", "com.google.android.libraries.logging.logger.transmitters.clearcut", "com.google.android.libraries.performance.primes.transmitter.clearcut", "com.google.android.libraries.performance.primes.metrics.crash.CrashMetricServiceImpl", "com.google.android.libraries.performance.primes.metrics.crash.applicationexit.ApplicationExitMetricServiceImpl");
/* 26 */            I00000oIO = new AtomicReference(OOoliIo1ol.I00l0OO0IO);
/* 33 */            I00000oOI = new WeakHashMap();
/* 42 */            I0000Il00O = new I0OiiiO(18);
/* 46 */            new ArrayDeque();
/* 51 */            new ArrayDeque();
                }

                public static o0OllIoI I00000oIO() {
/* 1 */             o0Ol1IO o0ol1ioI0000Il00O = I0000Il00O();
/* 5 */             o0OllIoI o0ollioi = o0ol1ioI0000Il00O.I00000oOI;
/* 7 */             if (o0ollioi != null && o0ollioi != o0O11Oi0i0l.I00io1l) {
/* 14 */                return o0ollioi;
                    }
/* 15 */            iI1oo1lO1 ii1oo1lo1 = o0Ioi0OIOI0.I00io1l;
/* 19 */            UUID uuidI00000oOI = o0IiIlIllI.I0000Il00O.I00000oOI();
/* 23 */            String strI00000oIO = o01iIll0IO.I00000oIO(uuidI00000oOI);
/* 33 */            Ioio0O ioio0O = (Ioio0O) I00000oIO.get();
/* 39 */            if (!ioio0O.isEmpty()) {
/* 47 */                ioio0O.forEach(new iIoiolOlooo(1));
                    }
/* 52 */            iI1oo1lO1 ii1oo1lo12 = o0Ioi0OIOI0.I00io1l;
/* 56 */            o0Ioi0OIOI0 o0ioi0oioi0 = new o0Ioi0OIOI0("<missing root>", uuidI00000oOI, strI00000oIO, o0ol1ioI0000Il00O);
/* 59 */            o0ioi0oioi0.I00ilO0 = ii1oo1lo12;
/* 61 */            VarHandle.storeStoreFence();
/* 110 */           return o0ioi0oioi0;
                }

                /* JADX WARN: Removed duplicated region for block: B:23:0x003f  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public static o0OllIoI I00000oOI(o0Ol1IO o0ol1io, o0OllIoI o0ollioi) {
/* 1 */             o0ol1io.getClass();
/* 4 */             o0OllIoI o0ollioi2 = o0ol1io.I00000oOI;
/* 6 */             if (o0ollioi2 != o0ollioi) {
/* 9 */                 if (o0ollioi2 == null) {
/* 15 */                    o0ol1io.I00000oIO = Trace.isEnabled();
                        }
/* 19 */                if (o0ol1io.I00000oIO) {
/* 21 */                    if (o0ollioi2 != null) {
/* 23 */                        if (o0ollioi != null) {
/* 30 */                            if (((o01iIll0IO) o0ollioi2).I00iOIl == o0ollioi && !ll1OIooo.I0000Il00O(o0ollioi2)) {
/* 38 */                                Trace.endSection();
                                    } else if (o0ollioi2 == ((o01iIll0IO) o0ollioi).I00iOIl && !ll1OIooo.I0000Il00O(o0ollioi)) {
/* 55 */                                ll1OIooo.I0000O(o0ollioi);
                                    }
                                }
/* 59 */                        ll1OIooo.I00000oOI(o0ollioi2);
/* 62 */                        if (o0ollioi != null) {
                                }
                            } else if (o0ollioi != null) {
/* 64 */                        ll1OIooo.I00000oIO(o0ollioi);
                            }
                        }
/* 67 */                if (o0ollioi2 != o0ollioi) {
/* 69 */                    o0ol1io.I00000oOI = o0ollioi;
/* 71 */                    return o0ollioi2;
                        }
                    }
/* 106 */           return o0ollioi;
                }

                public static o0Ol1IO I0000Il00O() {
/* 7 */             return (o0Ol1IO) I0000Il00O.get();
                }
            }

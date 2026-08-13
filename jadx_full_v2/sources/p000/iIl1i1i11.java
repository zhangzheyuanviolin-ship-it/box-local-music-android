            package p000;

            import android.os.Trace;
            import java.util.ArrayDeque;
            import java.util.WeakHashMap;
            import java.util.concurrent.atomic.AtomicReference;
            
            public abstract class iIl1i1i11 {
                public static final boolean I00000oIO;
                public static final AtomicReference I00000oOI;
                public static final WeakHashMap I0000Il00O;
                public static final I0OiiiO I0000O;

                static {
/* 16 */            iiOlI01i1iI.I001lloI(5, "androidx.fragment.app.FragmentViewLifecycleOwner.handleLifecycleEvent", "com.google.android.libraries.logging.logger.transmitters.clearcut", "com.google.android.libraries.performance.primes.transmitter.clearcut", "com.google.android.libraries.performance.primes.metrics.crash.CrashMetricServiceImpl", "com.google.android.libraries.performance.primes.metrics.crash.applicationexit.ApplicationExitMetricServiceImpl");
/* 20 */            I00000oIO = true;
/* 29 */            I00000oOI = new AtomicReference(iilIooO.I00oO101o);
/* 36 */            I0000Il00O = new WeakHashMap();
/* 45 */            I0000O = new I0OiiiO(14);
/* 49 */            new ArrayDeque();
/* 54 */            new ArrayDeque();
                }

                public static void I00000oIO(iOli00o11Olo ioli00o11olo, iO0Oiil0l0 io0oiil0l0, int i) {
                    iO0Oiil0l0 io0oiil0l02;
                    iO0Oiil0l0 io0oiil0l03;
                    iO0Oiil0l0 io0oiil0l04;
/* 1 */             iO0Oiil0l0 io0oiil0l05 = ioli00o11olo.I00000oOI;
/* 4 */             if (io0oiil0l05 == io0oiil0l0 && (i == 2 || i == 4 || io0oiil0l05 == null)) {
/* 408 */               return;
                    }
/* 13 */            if (io0oiil0l05 == null) {
/* 19 */                ioli00o11olo.I00000oIO = Trace.isEnabled();
                    }
/* 21 */            Oi0Oooi oi0Oooi = ioli00o11olo.I0000O;
/* 26 */            if (ioli00o11olo.I00000oIO) {
/* 30 */                if (oi0Oooi != null) {
                            int i2 = i - 1;
/* 34 */                    if (i2 == 0) {
/* 44 */                        io0oiil0l03 = io0oiil0l0;
/* 45 */                        io0oiil0l04 = null;
                            } else if (i2 != 2) {
/* 38 */                        io0oiil0l03 = io0oiil0l0;
/* 39 */                        io0oiil0l04 = io0oiil0l05;
                            } else {
/* 41 */                        io0oiil0l04 = io0oiil0l05;
/* 42 */                        io0oiil0l03 = null;
                            }
/* 46 */                    if (io0oiil0l04 != null) {
/* 48 */                        Trace.endSection();
/* 51 */                        Trace.endSection();
                            }
/* 54 */                    if (io0oiil0l03 != null) {
/* 58 */                        Trace.beginSection(io0oiil0l03.I00iOIl);
/* 61 */                        Trace.beginSection("<missing root>");
                            }
                        } else {
/* 65 */                    if (io0oiil0l05 != null) {
/* 71 */                        io0oiil0l02 = io0oiil0l0 != null ? io0oiil0l0 : null;
/* 72 */                        Thread.currentThread();
/* 75 */                        Trace.endSection();
/* 78 */                        Trace.endSection();
                            } else {
/* 82 */                        io0oiil0l02 = io0oiil0l0;
                            }
/* 83 */                    if (io0oiil0l02 != null) {
/* 85 */                        Thread.currentThread();
/* 90 */                        Trace.beginSection(io0oiil0l02.I00iOIl);
/* 93 */                        Trace.beginSection("<missing root>");
                            }
                        }
                    }
/* 96 */            if (io0oiil0l05 == io0oiil0l0) {
/* 408 */               return;
                    }
/* 99 */            if (io0oiil0l0 == null) {
/* 101 */               io0oiil0l0 = null;
                    }
/* 102 */           ioli00o11olo.I00000oOI = io0oiil0l0;
/* 104 */           if (i == 2) {
/* 106 */               if (oi0Oooi != null) {
/* 108 */                   oi0Oooi.I00iiI = io0oiil0l0;
                        } else {
/* 113 */                   IOOlIIilOl0.I000II("Coroutine is executing but trace storage is not being set.");
                        }
                    }
                }
            }

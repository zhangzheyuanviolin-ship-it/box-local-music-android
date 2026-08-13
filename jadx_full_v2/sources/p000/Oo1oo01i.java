            package p000;

            import android.content.Context;
            import android.os.PowerManager;
            import android.util.Log;
            import com.google.firebase.messaging.FirebaseMessaging;
            import java.io.IOException;
            import java.lang.invoke.VarHandle;
            import java.util.ArrayDeque;
            import java.util.concurrent.ScheduledThreadPoolExecutor;
            import java.util.concurrent.TimeUnit;
            
            public final class Oo1oo01i {
                public Context I00000oIO;
                public I101oOiOiI I00000oOI;
                public Oo1ol1ll I0000Il00O;
                public I1Io0i0II I0000O;
                public ScheduledThreadPoolExecutor I0000oI00;
                public boolean I0001Ioi1lo;
                public Oo1ol1loo1 I000II;

                public final synchronized void I00000oIO(boolean z) {
/* 2 */             this.I0001Ioi1lo = z;
                }

                /* JADX WARN: Removed duplicated region for block: B:25:0x009a A[Catch: IOException -> 0x0061, TRY_LEAVE, TryCatch #2 {IOException -> 0x0061, blocks: (B:12:0x001a, B:25:0x009a, B:17:0x002b, B:19:0x0033, B:22:0x0064, B:24:0x006c), top: B:77:0x001a }] */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final boolean I00000oOI() throws IOException {
                    Oo1oiIOOloI oo1oiIOOloII00000oIO;
                    while (true) {
                        synchronized (this) {
                            try {
/* 4 */                         oo1oiIOOloII00000oIO = this.I000II.I00000oIO();
/* 9 */                         if (oo1oiIOOloII00000oIO == null) {
/* 13 */                            Log.isLoggable("FirebaseMessaging", 3);
/* 16 */                            return true;
                                }
                            } finally {
                            }
                        }
/* 25 */                Oo1ol1ll oo1ol1ll = this.I0000Il00O;
                        try {
/* 27 */                    String str = oo1oiIOOloII00000oIO.I00000oOI;
/* 29 */                    String str2 = oo1oiIOOloII00000oIO.I00000oIO;
/* 31 */                    int iHashCode = str.hashCode();
/* 37 */                    if (iHashCode != 83) {
/* 41 */                        if (iHashCode == 85 && str.equals("U")) {
/* 56 */                            IlO01o11oOOO ilO01o11oOOO = (IlO01o11oOOO) ((IlO0Ii1Il00o) oo1ol1ll.I00iiI);
/* 68 */                            String str3 = ((I1l0o01O0) Oo1ol1ll.I0001Ioi1lo(ilO01o11oOOO.I0000O())).I00000oIO;
/* 74 */                            ((FirebaseMessaging) oo1ol1ll.I00iio).I00000oIO();
/* 89 */                            oo1ol1ll.I000l1(str2, str3, (String) Oo1ol1ll.I0001Ioi1lo(ilO01o11oOOO.I0000Il00O()), "unsubscribe");
/* 94 */                            Log.isLoggable("FirebaseMessaging", 3);
                                } else {
/* 157 */                           Log.isLoggable("FirebaseMessaging", 3);
                                }
                            } else if (str.equals(OIlOl1.I00iiI)) {
/* 113 */                       IlO01o11oOOO ilO01o11oOOO2 = (IlO01o11oOOO) ((IlO0Ii1Il00o) oo1ol1ll.I00iiI);
/* 125 */                       String str4 = ((I1l0o01O0) Oo1ol1ll.I0001Ioi1lo(ilO01o11oOOO2.I0000O())).I00000oIO;
/* 131 */                       ((FirebaseMessaging) oo1ol1ll.I00iio).I00000oIO();
/* 146 */                       oo1ol1ll.I000l1(str2, str4, (String) Oo1ol1ll.I0001Ioi1lo(ilO01o11oOOO2.I0000Il00O()), "subscribe");
/* 151 */                       Log.isLoggable("FirebaseMessaging", 3);
                            }
/* 160 */                   Oo1ol1loo1 oo1ol1loo1 = this.I000II;
                            synchronized (oo1ol1loo1) {
/* 163 */                       I1ii1o0 i1ii1o0 = oo1ol1loo1.I00000oIO;
/* 165 */                       String str5 = oo1oiIOOloII00000oIO.I0000Il00O;
                                synchronized (((ArrayDeque) i1ii1o0.I00ilI0I1)) {
/* 180 */                           if (((ArrayDeque) i1ii1o0.I00ilI0I1).remove(str5)) {
/* 184 */                               ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = (ScheduledThreadPoolExecutor) i1ii1o0.I00ilO0;
/* 189 */                               OOIl1i1 oOIl1i1 = new OOIl1i1(6);
/* 192 */                               oOIl1i1.I00iiI = i1ii1o0;
/* 194 */                               VarHandle.storeStoreFence();
/* 197 */                               scheduledThreadPoolExecutor.execute(oOIl1i1);
                                    }
                                }
                            }
                            synchronized (this.I0000O) {
                                try {
/* 205 */                           String str6 = oo1oiIOOloII00000oIO.I0000Il00O;
/* 213 */                           if (this.I0000O.containsKey(str6)) {
/* 226 */                               ArrayDeque arrayDeque = (ArrayDeque) this.I0000O.get(str6);
/* 232 */                               OloIlI0ll oloIlI0ll = (OloIlI0ll) arrayDeque.poll();
/* 234 */                               if (oloIlI0ll != null) {
/* 237 */                                   oloIlI0ll.I00000oOI(null);
                                        }
/* 244 */                               if (arrayDeque.isEmpty()) {
/* 248 */                                   this.I0000O.remove(str6);
                                        }
                                    }
                                } finally {
                                }
                            }
                        } catch (IOException e) {
/* 272 */                   if (!"SERVICE_NOT_AVAILABLE".equals(e.getMessage()) && !"INTERNAL_SERVER_ERROR".equals(e.getMessage())) {
/* 291 */                       if (e.getMessage() != null) {
/* 299 */                           throw e;
                                }
/* 295 */                       Log.e("FirebaseMessaging", "Topic operation failed without exception message. Will retry Topic operation.");
/* 326 */                       return false;
                            }
/* 323 */                   Log.e("FirebaseMessaging", "Topic operation failed: " + e.getMessage() + ". Will retry Topic operation.");
/* 326 */                   return false;
                        }
                    }
                }

                public final void I0000Il00O(long j) {
/* 12 */            long jMin = Math.min(Math.max(30L, 2 * j), 28800L);
/* 18 */            Context context = this.I00000oIO;
/* 20 */            I101oOiOiI i101oOiOiI = this.I00000oOI;
/* 23 */            Oo1ooo0ollI oo1ooo0ollI = new Oo1ooo0ollI(0);
/* 26 */            oo1ooo0ollI.I00ilO0 = this;
/* 28 */            oo1ooo0ollI.I00iiO = context;
/* 30 */            oo1ooo0ollI.I00iiI = jMin;
/* 32 */            oo1ooo0ollI.I00iio = i101oOiOiI;
/* 49 */            oo1ooo0ollI.I00ilI0I1 = ((PowerManager) context.getSystemService("power")).newWakeLock(1, "wake:com.google.firebase.messaging");
/* 51 */            VarHandle.storeStoreFence();
/* 58 */            this.I0000oI00.schedule(oo1ooo0ollI, j, TimeUnit.SECONDS);
/* 61 */            I00000oIO(true);
                }
            }

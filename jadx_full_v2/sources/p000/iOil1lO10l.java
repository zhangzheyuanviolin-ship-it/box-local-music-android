            package p000;

            import android.content.Context;
            import android.os.SystemClock;
            import android.os.UserManager;
            import android.util.Log;
            import com.google.common.util.concurrent.ListenableFuture;
            import com.google.mlkit.genai.common.GenAiException;
            import com.google.mlkit.genai.common.StreamingCallback;
            import java.lang.invoke.VarHandle;
            import java.time.Duration;
            import java.util.Optional;
            import java.util.concurrent.ExecutorService;
            import java.util.concurrent.Executors;
            import java.util.concurrent.ScheduledExecutorService;
            import java.util.concurrent.atomic.AtomicLong;
            
            public abstract class iOil1lO10l extends iOiiOlio {
                public iOil1lO10l(ExecutorService executorService, int i, iOi1l1i1O ioi1l1i1o) {
                    ScheduledExecutorService scheduledExecutorService;
                    lil11i lil11iVar;
                    lil11i lil11iVar2;
/* 5 */             this.I00ilO0 = true;
/* 11 */            Context contextI00000oOI = O1o0111OI00.I0000Il00O().I00000oOI();
/* 15 */            Optional.empty();
/* 19 */            if (contextI00000oOI == null) {
/* 265 */               IOOlIIilOl0.I000II("Null context");
/* 408 */               throw null;
                    }
/* 21 */            ilIOOoi0ioI ilioooi0ioi = ilIOOoi0ioI.I00iiI;
/* 23 */            if (ilioooi0ioi == null) {
/* 259 */               IOOlIIilOl0.I000II("Null callbackExecutor");
/* 262 */               throw null;
                    }
/* 29 */            if (Duration.ZERO == null) {
/* 253 */               IOOlIIilOl0.I000II("Null autoUnbindTimeoutMs");
/* 256 */               throw null;
                    }
/* 31 */            Optional optionalEmpty = Optional.empty();
/* 35 */            if (optionalEmpty == null) {
/* 249 */               IOOlIIilOl0.I000II("Null autoDownloadEnabled");
/* 252 */               throw null;
                    }
/* 39 */            Duration durationOfMinutes = Duration.ofMinutes(10L);
/* 43 */            if (durationOfMinutes == null) {
/* 243 */               IOOlIIilOl0.I000II("Null autoUnbindTimeoutMs");
/* 246 */               throw null;
                    }
/* 45 */            executorService = executorService == null ? null : executorService;
/* 64 */            if (!(executorService == null ? Optional.empty() : Optional.of(executorService)).isPresent() && (executorService = Executors.newCachedThreadPool(new iO10oo0i1o("AiCoreClientWorker", 4))) == null) {
/* 83 */                IOOlIIilOl0.I000II("Null workerExecutor");
/* 86 */                throw null;
                    }
/* 95 */            if (Optional.empty().isPresent()) {
/* 108 */               scheduledExecutorService = null;
                    } else {
/* 97 */                scheduledExecutorService = ilII1I10.I00000oIO;
/* 99 */                if (scheduledExecutorService == null) {
/* 104 */                   IOOlIIilOl0.I000II("Null autoUnbindScheduledExecutor");
/* 107 */                   throw null;
                        }
                    }
/* 109 */           if (executorService == null || scheduledExecutorService == null) {
/* 212 */               StringBuilder sb = new StringBuilder();
/* 215 */               if (executorService == null) {
/* 219 */                   sb.append(" workerExecutor");
                        }
/* 222 */               if (scheduledExecutorService == null) {
/* 226 */                   sb.append(" autoUnbindScheduledExecutor");
                        }
/* 239 */               I000II.I001IO000("Missing required properties:".concat(sb.toString()));
/* 242 */               throw null;
                    }
/* 116 */           l00Iil l00iil = new l00Iil();
/* 124 */           l00iil.I00l0I0l0lO1 = new Object();
/* 126 */           l00iil.I00iiI = contextI00000oOI;
/* 130 */           if (executorService instanceof lil11i) {
/* 132 */               lil11iVar2 = (lil11i) executorService;
                    } else {
/* 137 */               if (executorService instanceof ScheduledExecutorService) {
/* 141 */                   ScheduledExecutorService scheduledExecutorService2 = (ScheduledExecutorService) executorService;
/* 143 */                   lili10loO lili10loo = new lili10loO(scheduledExecutorService2);
/* 146 */                   lili10loo.I00iiI = scheduledExecutorService2;
/* 148 */                   VarHandle.storeStoreFence();
                            lil11iVar = lili10loo;
                        } else {
/* 155 */                   lil11iVar = new lil11i(executorService);
                        }
/* 151 */               lil11iVar2 = lil11iVar;
                    }
/* 159 */           l00iil.I00iOIl = lil11iVar2;
/* 161 */           l00iil.I00iiO = ilioooi0ioi;
/* 163 */           l00iil.I00iio = true;
/* 169 */           l00iil.I00ilI0I1 = durationOfMinutes.toMillis();
/* 171 */           l00iil.I00ilO0 = scheduledExecutorService;
/* 181 */           l00iil.I00io1l = (UserManager) contextI00000oOI.getSystemService("user");
/* 195 */           l00iil.I00ioIO = ((Boolean) optionalEmpty.orElse(Boolean.TRUE)).booleanValue();
/* 197 */           VarHandle.storeStoreFence();
/* 200 */           this.I00iOIl = l00iil;
/* 202 */           this.I00iiI = i;
/* 204 */           this.I00iiO = ioi1l1i1o;
/* 206 */           ioi1l1i1o.zza();
                }

                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public static Object I001l0I00(iOil1lO10l ioil1lo10l, IOoil1iiIilo iOoil1iiIilo) throws Throwable {
                    iOiio1OIlO0O ioiio1oilo0o;
/* 3 */             if (iOoil1iiIilo instanceof iOiio1OIlO0O) {
/* 6 */                 ioiio1oilo0o = (iOiio1OIlO0O) iOoil1iiIilo;
/* 8 */                 int i = ioiio1oilo0o.I00iiO;
/* 14 */                if ((i & Integer.MIN_VALUE) != 0) {
/* 17 */                    ioiio1oilo0o.I00iiO = i - Integer.MIN_VALUE;
                        } else {
/* 22 */                    ioiio1oilo0o = new iOiio1OIlO0O(ioil1lo10l, iOoil1iiIilo);
                        }
                    }
/* 25 */            Object objI00000oIO = ioiio1oilo0o.I00iOIl;
/* 27 */            Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 29 */            int i2 = ioiio1oilo0o.I00iiO;
/* 32 */            if (i2 == 0) {
/* 47 */                lIoii1l01l0i.I00000oOI(objI00000oIO);
/* 66 */                li0lOl1ol1I li0lol1ol1iI0000Il00O = ioil1lo10l.I0000Il00O(ll0li01oO0li.I0000Il00O(ioil1lo10l.I00000oIO(), iOi1iOl1IIoI.I0000Il00O, ioil1lo10l.I00iOIl.I00iOIl), Iioi0lilII.I00l0OO0IO);
/* 70 */                ioiio1oilo0o.I00iiO = 1;
/* 72 */                objI00000oIO = l10o1ollO.I00000oIO(li0lol1ol1iI0000Il00O, ioiio1oilo0o);
/* 76 */                if (objI00000oIO == ii0111o) {
/* 78 */                    return ii0111o;
                        }
                    } else {
/* 34 */                if (i2 != 1) {
/* 42 */                    I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 45 */                    return null;
                        }
/* 36 */                lIoii1l01l0i.I00000oOI(objI00000oIO);
                    }
/* 106 */           return objI00000oIO;
                }

                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public static Object I00IOO(iOil1lO10l ioil1lo10l, IOoilo iOoilo) throws Throwable {
                    iOiiiiOioIO ioiiiioioio;
/* 3 */             if (iOoilo instanceof iOiiiiOioIO) {
/* 6 */                 ioiiiioioio = (iOiiiiOioIO) iOoilo;
/* 8 */                 int i = ioiiiioioio.I00iiO;
/* 14 */                if ((i & Integer.MIN_VALUE) != 0) {
/* 17 */                    ioiiiioioio.I00iiO = i - Integer.MIN_VALUE;
                        } else {
/* 22 */                    ioiiiioioio = new iOiiiiOioIO(ioil1lo10l, iOoilo);
                        }
                    }
/* 25 */            Object objI00000oIO = ioiiiioioio.I00iOIl;
/* 27 */            Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 29 */            int i2 = ioiiiioioio.I00iiO;
                    try {
/* 32 */                if (i2 == 0) {
/* 47 */                    lIoii1l01l0i.I00000oOI(objI00000oIO);
/* 50 */                    ListenableFuture listenableFutureI00100l0 = ioil1lo10l.I00100l0();
/* 54 */                    ioiiiioioio.I00iiO = 1;
/* 56 */                    objI00000oIO = l10o1ollO.I00000oIO(listenableFutureI00100l0, ioiiiioioio);
/* 60 */                    if (objI00000oIO == ii0111o) {
/* 62 */                        return ii0111o;
                            }
                        } else {
/* 34 */                    if (i2 != 1) {
/* 42 */                        I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 45 */                        return null;
                            }
/* 36 */                    lIoii1l01l0i.I00000oOI(objI00000oIO);
                        }
/* 63 */                return objI00000oIO;
                    } catch (GenAiException e) {
/* 69 */                Log.w("GenAiProcessorKt", "checkFeatureStatus failed", e);
/* 75 */                return new Integer(0);
                    }
                }

                public static Object I00IioO0OiOi(iOil1lO10l ioil1lo10l, IOoilo iOoilo) {
/* 21 */            Object objI00000oIO = l10o1ollO.I00000oIO(ioil1lo10l.I0000Il00O(ll0li01oO0li.I0000Il00O(ioil1lo10l.I001i1lo1io(), iOi1iOl1IIoI.I00000oOI, ioil1lo10l.I00iOIl.I00iOIl), Iioi0lilII.I00l0OO0IO), iOoilo);
                    return objI00000oIO == Ii0111o.I00iOIl ? objI00000oIO : OoiIlOl1iI.I00000oIO;
                }

                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public static Object I00Io1lO(iOil1lO10l ioil1lo10l, i1O0ll11O0ll i1o0ll11o0ll, IOoilo iOoilo) throws Throwable {
                    iOil11IIl1IO ioil11iil1io;
/* 3 */             if (iOoilo instanceof iOil11IIl1IO) {
/* 6 */                 ioil11iil1io = (iOil11IIl1IO) iOoilo;
/* 8 */                 int i = ioil11iil1io.I00iiO;
/* 14 */                if ((i & Integer.MIN_VALUE) != 0) {
/* 17 */                    ioil11iil1io.I00iiO = i - Integer.MIN_VALUE;
                        } else {
/* 22 */                    ioil11iil1io = new iOil11IIl1IO(ioil1lo10l, iOoilo);
                        }
                    }
/* 25 */            Object objI00000oIO = ioil11iil1io.I00iOIl;
/* 27 */            Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 29 */            int i2 = ioil11iil1io.I00iiO;
/* 31 */            int i3 = 1;
/* 32 */            if (i2 == 0) {
/* 47 */                lIoii1l01l0i.I00000oOI(objI00000oIO);
/* 50 */                long jElapsedRealtime = SystemClock.elapsedRealtime();
/* 54 */                ListenableFuture listenableFutureI001i1lo1io = ioil1lo10l.I001i1lo1io();
/* 60 */                iOiOl0Oi0 ioiol0oi0 = new iOiOl0Oi0(i3);
/* 63 */                ioiol0oi0.I00000oOI = ioil1lo10l;
/* 65 */                ioiol0oi0.I0000Il00O = i1o0ll11o0ll;
/* 67 */                VarHandle.storeStoreFence();
/* 70 */                l00Iil l00iil = ioil1lo10l.I00iOIl;
/* 74 */                li1ii1 li1ii1VarI0000Il00O = ll0li01oO0li.I0000Il00O(listenableFutureI001i1lo1io, ioiol0oi0, l00iil.I00iOIl);
/* 80 */                iOiOlI11oo ioioli11oo = new iOiOlI11oo();
/* 83 */                ioioli11oo.I00000oIO = ioil1lo10l;
/* 85 */                ioioli11oo.I00000oOI = jElapsedRealtime;
/* 87 */                ioioli11oo.I0000Il00O = i1o0ll11o0ll;
/* 89 */                VarHandle.storeStoreFence();
/* 94 */                li1o00OoI0 li1o00ooi0I0000O = ll0li01oO0li.I0000O(li1ii1VarI0000Il00O, ioioli11oo, l00iil.I00iOIl);
/* 101 */               OoOlO1O0o ooOlO1O0o = new OoOlO1O0o(5);
/* 104 */               ooOlO1O0o.I00iiI = ioil1lo10l;
/* 106 */               ooOlO1O0o.I00iiO = i1o0ll11o0ll;
/* 108 */               VarHandle.storeStoreFence();
/* 111 */               li0lOl1ol1I li0lol1ol1iI0000Il00O = ioil1lo10l.I0000Il00O(li1o00ooi0I0000O, ooOlO1O0o);
/* 115 */               ioil11iil1io.I00iiO = 1;
/* 117 */               objI00000oIO = l10o1ollO.I00000oIO(li0lol1ol1iI0000Il00O, ioil11iil1io);
/* 121 */               if (objI00000oIO == ii0111o) {
/* 123 */                   return ii0111o;
                        }
                    } else {
/* 34 */                if (i2 != 1) {
/* 42 */                    I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 45 */                    return null;
                        }
/* 36 */                lIoii1l01l0i.I00000oOI(objI00000oIO);
                    }
/* 408 */           return objI00000oIO;
                }

                public final Object I00IoiI(Object obj, StreamingCallback streamingCallback, IOoilo iOoilo) {
                    iOi1Olo ioi1olo;
/* 1 */             long jElapsedRealtime = SystemClock.elapsedRealtime();
/* 7 */             AtomicLong atomicLong = new AtomicLong();
/* 10 */            if (streamingCallback != null) {
/* 14 */                ioi1olo = new iOi1Olo();
/* 17 */                ioi1olo.I00000oIO = atomicLong;
/* 19 */                ioi1olo.I00000oOI = jElapsedRealtime;
/* 21 */                ioi1olo.I0000Il00O = streamingCallback;
/* 23 */                VarHandle.storeStoreFence();
                    } else {
/* 27 */                ioi1olo = null;
                    }
/* 28 */            ListenableFuture listenableFutureI001i1lo1io = I001i1lo1io();
/* 35 */            iOii0lO0 ioii0lo0 = new iOii0lO0(0);
/* 38 */            ioii0lo0.I00000oOI = this;
/* 40 */            ioii0lo0.I0000Il00O = obj;
/* 42 */            ioii0lo0.I0000O = ioi1olo;
/* 44 */            VarHandle.storeStoreFence();
/* 47 */            l00Iil l00iil = this.I00iOIl;
/* 51 */            li1ii1 li1ii1VarI0000Il00O = ll0li01oO0li.I0000Il00O(listenableFutureI001i1lo1io, ioii0lo0, l00iil.I00iOIl);
/* 57 */            iOiiIIIii0Io ioiiiiiii0io = new iOiiIIIii0Io();
/* 60 */            ioiiiiiii0io.I00000oIO = this;
/* 62 */            ioiiiiiii0io.I00000oOI = atomicLong;
/* 64 */            ioiiiiiii0io.I0000Il00O = jElapsedRealtime;
/* 66 */            ioiiiiiii0io.I0000O = obj;
/* 68 */            VarHandle.storeStoreFence();
/* 73 */            li1o00OoI0 li1o00ooi0I0000O = ll0li01oO0li.I0000O(li1ii1VarI0000Il00O, ioiiiiiii0io, l00iil.I00iOIl);
/* 81 */            OoIol00Ool ooIol00Ool = new OoIol00Ool(8);
/* 84 */            ooIol00Ool.I00iiI = this;
/* 86 */            ooIol00Ool.I00iiO = obj;
/* 88 */            VarHandle.storeStoreFence();
/* 95 */            return l10o1ollO.I00000oIO(I0000Il00O(li1o00ooi0I0000O, ooIol00Ool), iOoilo);
                }

                public Object I00OIl(IOoilo iOoilo) {
/* 1 */             return I00IOO(this, iOoilo);
                }
            }

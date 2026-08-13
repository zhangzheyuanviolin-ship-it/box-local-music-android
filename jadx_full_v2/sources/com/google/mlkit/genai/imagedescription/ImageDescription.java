            package com.google.mlkit.genai.imagedescription;

            import android.content.Context;
            import java.lang.invoke.VarHandle;
            import java.time.Duration;
            import java.util.concurrent.ExecutorService;
            import java.util.concurrent.Executors;
            import java.util.concurrent.ScheduledExecutorService;
            import p000.I000II;
            import p000.IOOlIIilOl0;
            import p000.i1IoOioloO1;
            import p000.i1OII10oOIl;
            import p000.i1OO1io;
            import p000.i1OlIi1OoI0;
            import p000.i1i0OooII;
            import p000.iO0i0IOoll00;
            import p000.iO10oo0i1o;
            import p000.il1OOI0;
            import p000.l0oOo0Ili1i;
            import p000.l101i0IllIO1;
            import p000.l1OIlloI1l0;
            
            public final class ImageDescription {
                private ImageDescription() {
                }

                public static ImageDescriber getClient(ImageDescriberOptions imageDescriberOptions) {
                    l0oOo0Ili1i l0ooo0ili1i;
                    l0oOo0Ili1i l0ooo0ili1i2;
                    i1OlIi1OoI0 i1olii1ooi0;
/* 3 */             Context contextZza = imageDescriberOptions.zza();
/* 15 */            ExecutorService executorServiceNewCachedThreadPool = Executors.newCachedThreadPool(new iO10oo0i1o("AiCoreClientWorker", 0));
/* 27 */            ScheduledExecutorService scheduledExecutorServiceNewScheduledThreadPool = Executors.newScheduledThreadPool(1, new iO10oo0i1o("AiCoreClientScheduler", 0));
/* 31 */            iO0i0IOoll00 io0i0iooll00 = iO0i0IOoll00.I00iiI;
/* 34 */            if (io0i0iooll00 == null) {
/* 242 */               IOOlIIilOl0.I000II("Null callbackExecutor");
/* 33 */                return null;
                    }
/* 36 */            if (executorServiceNewCachedThreadPool == null) {
/* 236 */               IOOlIIilOl0.I000II("Null workerExecutor");
/* 33 */                return null;
                    }
/* 40 */            if (Duration.ZERO == null) {
/* 230 */               IOOlIIilOl0.I000II("Null autoUnbindTimeoutMs");
/* 33 */                return null;
                    }
/* 42 */            if (scheduledExecutorServiceNewScheduledThreadPool == null) {
/* 224 */               IOOlIIilOl0.I000II("Null autoUnbindScheduledExecutor");
/* 33 */                return null;
                    }
/* 46 */            Duration durationOfMinutes = Duration.ofMinutes(10L);
/* 50 */            if (durationOfMinutes == null) {
/* 218 */               IOOlIIilOl0.I000II("Null autoUnbindTimeoutMs");
/* 33 */                return null;
                    }
/* 52 */            if (contextZza == null) {
/* 192 */               StringBuilder sb = new StringBuilder();
/* 195 */               if (contextZza == null) {
/* 199 */                   sb.append(" context");
                        }
/* 212 */               I000II.I001IO000("Missing required properties:".concat(sb.toString()));
/* 33 */                return null;
                    }
/* 56 */            il1OOI0 il1ooi0 = new il1OOI0();
/* 64 */            il1ooi0.I00ioIO = new Object();
/* 66 */            il1ooi0.I00iiI = contextZza;
/* 70 */            if (executorServiceNewCachedThreadPool instanceof l0oOo0Ili1i) {
/* 72 */                l0ooo0ili1i2 = (l0oOo0Ili1i) executorServiceNewCachedThreadPool;
                    } else {
/* 77 */                if (executorServiceNewCachedThreadPool instanceof ScheduledExecutorService) {
/* 81 */                    ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) executorServiceNewCachedThreadPool;
/* 83 */                    l101i0IllIO1 l101i0illio1 = new l101i0IllIO1(scheduledExecutorService);
/* 86 */                    l101i0illio1.I00iiI = scheduledExecutorService;
/* 88 */                    VarHandle.storeStoreFence();
                            l0ooo0ili1i = l101i0illio1;
                        } else {
/* 95 */                    l0ooo0ili1i = new l0oOo0Ili1i(executorServiceNewCachedThreadPool);
                        }
/* 91 */                l0ooo0ili1i2 = l0ooo0ili1i;
                    }
/* 99 */            il1ooi0.I00iOIl = l0ooo0ili1i2;
/* 101 */           il1ooi0.I00iiO = io0i0iooll00;
/* 103 */           il1ooi0.I00iio = true;
/* 109 */           il1ooi0.I00ilI0I1 = durationOfMinutes.toMillis();
/* 111 */           il1ooi0.I00ilO0 = scheduledExecutorServiceNewScheduledThreadPool;
/* 113 */           il1ooi0.I00io1l = true;
/* 115 */           VarHandle.storeStoreFence();
                    synchronized (i1i0OooII.class) {
/* 125 */               i1OII10oOIl i1oii10ooil = new i1OII10oOIl();
/* 130 */               i1oii10ooil.I00000oIO = "genai-image-description";
/* 132 */               i1oii10ooil.I00000oOI = true;
/* 137 */               byte b = (byte) (i1oii10ooil.I0000O | 1);
/* 138 */               i1oii10ooil.I0000Il00O = 1;
/* 143 */               i1oii10ooil.I0000O = (byte) (b | 2);
/* 145 */               i1OO1io i1oo1ioI00000oIO = i1oii10ooil.I00000oIO();
                        synchronized (i1i0OooII.class) {
                            try {
/* 150 */                       i1IoOioloO1 i1iooioloo1 = i1i0OooII.I00000oIO;
/* 152 */                       if (i1iooioloo1 == null) {
/* 157 */                           i1iooioloo1 = new i1IoOioloO1(3);
/* 160 */                           i1i0OooII.I00000oIO = i1iooioloo1;
                                }
/* 169 */                       i1olii1ooi0 = (i1OlIi1OoI0) i1iooioloo1.get(i1oo1ioI00000oIO);
                            } catch (Throwable th) {
/* 186 */                       throw th;
                            }
                        }
/* 173 */               l1OIlloI1l0 l1oilloi1l0 = new l1OIlloI1l0();
/* 176 */               l1oilloi1l0.I00000oIO = i1olii1ooi0;
/* 178 */               VarHandle.storeStoreFence();
/* 181 */               return new ImageDescriber(il1ooi0, l1oilloi1l0);
                    }
/* 173 */           l1OIlloI1l0 l1oilloi1l02 = new l1OIlloI1l0();
/* 176 */           l1oilloi1l02.I00000oIO = i1olii1ooi0;
/* 178 */           VarHandle.storeStoreFence();
/* 181 */           return new ImageDescriber(il1ooi0, l1oilloi1l02);
                }
            }

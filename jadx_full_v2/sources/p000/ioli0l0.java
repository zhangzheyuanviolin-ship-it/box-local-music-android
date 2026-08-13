            package p000;

            import android.content.BroadcastReceiver;
            import android.content.Context;
            import android.content.Intent;
            import android.os.Parcelable;
            import android.util.Log;
            import com.google.firebase.iid.FirebaseInstanceIdReceiver;
            import java.lang.invoke.VarHandle;
            import java.lang.ref.SoftReference;
            import java.util.concurrent.CountDownLatch;
            import java.util.concurrent.ExecutionException;
            import java.util.concurrent.Executor;
            import java.util.concurrent.ExecutorService;
            import java.util.concurrent.Executors;
            import java.util.concurrent.LinkedBlockingQueue;
            import java.util.concurrent.ThreadPoolExecutor;
            import java.util.concurrent.TimeUnit;
            
            public final class ioli0l0 implements Runnable {
                public final int I00iOIl;
                public boolean I00iiI;
                public Parcelable I00iiO;
                public Object I00iio;
                public Object I00ilI0I1;

                public ioli0l0(int i) {
/* 1 */             this.I00iOIl = i;
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r2v7, types: [java.util.concurrent.Executor] */
                @Override
                public final void run() {
                    ExecutorService executorServiceUnconfigurableExecutorService;
                    int iI00000oIO;
                    switch (this.I00iOIl) {
                        case 0:
/* 149 */                   Intent intent = (Intent) this.I00iiO;
/* 153 */                   Context context = (Context) this.I00iio;
/* 155 */                   boolean z = this.I00iiI;
/* 160 */                   BroadcastReceiver.PendingResult pendingResult = (BroadcastReceiver.PendingResult) this.I00ilI0I1;
                            try {
/* 164 */                       Parcelable parcelableExtra = intent.getParcelableExtra("wrapped_intent");
/* 178 */                       Intent intent2 = parcelableExtra instanceof Intent ? (Intent) parcelableExtra : null;
/* 179 */                       if (intent2 != null) {
/* 181 */                           iI00000oIO = FirebaseInstanceIdReceiver.I00000oIO(intent2);
                                } else {
/* 193 */                           int iIntValue = 500;
/* 195 */                           if (intent.getExtras() != null) {
/* 202 */                               IOO1o0 iOO1o0 = new IOO1o0(intent);
/* 208 */                               CountDownLatch countDownLatch = new CountDownLatch(1);
                                        synchronized (FirebaseInstanceIdReceiver.class) {
                                            try {
/* 214 */                                       SoftReference softReference = FirebaseInstanceIdReceiver.I00000oOI;
/* 222 */                                       executorServiceUnconfigurableExecutorService = softReference != null ? (Executor) softReference.get() : null;
/* 228 */                                       if (executorServiceUnconfigurableExecutorService == null) {
/* 253 */                                           ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new iO10oo0i1o("pscm-ack-executor", 5));
/* 256 */                                           threadPoolExecutor.allowCoreThreadTimeOut(true);
/* 259 */                                           executorServiceUnconfigurableExecutorService = Executors.unconfigurableExecutorService(threadPoolExecutor);
/* 268 */                                           FirebaseInstanceIdReceiver.I00000oOI = new SoftReference(executorServiceUnconfigurableExecutorService);
                                                }
                                            } finally {
                                            }
                                        }
/* 275 */                               O10oO1IiI1 o10oO1IiI1 = new O10oO1IiI1(10);
/* 278 */                               o10oO1IiI1.I00iiI = context;
/* 280 */                               o10oO1IiI1.I00iiO = iOO1o0;
/* 282 */                               o10oO1IiI1.I00iio = countDownLatch;
/* 284 */                               VarHandle.storeStoreFence();
/* 287 */                               executorServiceUnconfigurableExecutorService.execute(o10oO1IiI1);
                                        try {
/* 305 */                                   iIntValue = ((Integer) lOio0o.I00000oIO(new IIlio101Io(context).I00ooiO1I(intent))).intValue();
                                        } catch (InterruptedException | ExecutionException e) {
/* 316 */                                   Log.e("FirebaseMessaging", "Failed to send message to service.", e);
                                        }
                                        try {
/* 327 */                                   if (!countDownLatch.await(1000L, TimeUnit.MILLISECONDS)) {
/* 333 */                                       Log.w("CloudMessagingReceiver", "Message ack timed out");
                                            }
                                        } catch (InterruptedException e2) {
/* 349 */                                   Log.w("CloudMessagingReceiver", "Message ack failed: ".concat(e2.toString()));
                                        }
                                    }
/* 197 */                           iI00000oIO = iIntValue;
                                }
/* 354 */                       if (z && pendingResult != null) {
/* 358 */                           pendingResult.setResultCode(iI00000oIO);
                                }
/* 361 */                       if (pendingResult != null) {
/* 363 */                           pendingResult.finish();
/* 366 */                           return;
                                }
/* 366 */                       return;
                            } catch (Throwable th) {
/* 369 */                       if (pendingResult != null) {
/* 371 */                           pendingResult.finish();
                                }
/* 374 */                       throw th;
                            }
                        case 1:
/* 103 */                   lOliOlO1Io loliolo1io = (lOliOlO1Io) this.I00ilI0I1;
/* 105 */                   iolll0ill1i iolll0ill1iVar = loliolo1io.I00iio;
/* 107 */                   if (iolll0ill1iVar != null) {
/* 140 */                       loliolo1io.I011Io0I1ioi(iolll0ill1iVar, this.I00iiI ? null : (lio0llOI0) this.I00iio, (lli10iI) this.I00iiO);
/* 143 */                       loliolo1io.I0110OiO();
/* 146 */                       return;
                            } else {
/* 113 */                       l01O0IO1ooO0 l01o0io1ooo0 = ((l0olllO1i) loliolo1io.I00iOIl).I00ilO0;
/* 115 */                       l0olllO1i.I000II(l01o0io1ooo0);
/* 122 */                       l01o0io1ooo0.I00ilO0.I00000oOI("Discarding data. Failed to set user property");
/* 146 */                       return;
                            }
                        case 2:
/* 57 */                    lOliOlO1Io loliolo1io2 = (lOliOlO1Io) this.I00ilI0I1;
/* 59 */                    iolll0ill1i iolll0ill1iVar2 = loliolo1io2.I00iio;
/* 61 */                    if (iolll0ill1iVar2 != null) {
/* 94 */                        loliolo1io2.I011Io0I1ioi(iolll0ill1iVar2, this.I00iiI ? null : (ii0oooi0IO0l) this.I00iio, (lli10iI) this.I00iiO);
/* 97 */                        loliolo1io2.I0110OiO();
/* 100 */                       return;
                            } else {
/* 67 */                        l01O0IO1ooO0 l01o0io1ooo02 = ((l0olllO1i) loliolo1io2.I00iOIl).I00ilO0;
/* 69 */                        l0olllO1i.I000II(l01o0io1ooo02);
/* 76 */                        l01o0io1ooo02.I00ilO0.I00000oOI("Discarding data. Failed to send event to service");
/* 100 */                       return;
                            }
                        default:
/* 11 */                    lOliOlO1Io loliolo1io3 = (lOliOlO1Io) this.I00ilI0I1;
/* 13 */                    iolll0ill1i iolll0ill1iVar3 = loliolo1io3.I00iio;
/* 15 */                    if (iolll0ill1iVar3 == null) {
/* 21 */                        l01O0IO1ooO0 l01o0io1ooo03 = ((l0olllO1i) loliolo1io3.I00iOIl).I00ilO0;
/* 23 */                        l0olllO1i.I000II(l01o0io1ooo03);
/* 30 */                        l01o0io1ooo03.I00ilO0.I00000oOI("Discarding data. Failed to send conditional user property to service");
/* 54 */                        return;
                            } else {
/* 48 */                        loliolo1io3.I011Io0I1ioi(iolll0ill1iVar3, this.I00iiI ? null : (iII000ol000) this.I00iio, (lli10iI) this.I00iiO);
/* 51 */                        loliolo1io3.I0110OiO();
/* 54 */                        return;
                            }
                    }
                }
            }

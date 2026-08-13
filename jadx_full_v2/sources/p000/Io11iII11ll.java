            package p000;

            import android.app.job.JobParameters;
            import android.graphics.SurfaceTexture;
            import android.graphics.Typeface;
            import android.os.Trace;
            import android.view.Surface;
            import androidx.work.multiprocess.RemoteWorkManagerClient;
            import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;
            import com.google.common.util.concurrent.ListenableFuture;
            import com.google.mlkit.vision.pose.PoseLandmark;
            import java.lang.invoke.VarHandle;
            import java.util.HashSet;
            import java.util.Iterator;
            import java.util.LinkedHashSet;
            import java.util.Map;
            import java.util.Objects;
            import java.util.concurrent.CountDownLatch;
            import java.util.concurrent.ExecutionException;
            import java.util.concurrent.Executor;
            import java.util.concurrent.atomic.AtomicReference;
            
            public final class Io11iII11ll implements Runnable {
                public final int I00iOIl;
                public Object I00iiI;
                public Object I00iiO;

                public Io11iII11ll(int i) {
/* 1 */             this.I00iOIl = i;
                }

                @Override
                public final void run() throws Exception {
/* 4 */             boolean z = false;
                    switch (this.I00iOIl) {
                        case 0:
/* 746 */                   ((IIoOoIol0Io0) this.I00iiI).I001lloI((Io11l1li) this.I00iiO, OoiIlOl1iI.I00000oIO);
/* 749 */                   return;
                        case 1:
/* 721 */                   OOlli1l1lOlI oOlli1l1lOlI = (OOlli1l1lOlI) this.I00iiI;
/* 725 */                   OOlli1l1lOlI oOlli1l1lOlI2 = (OOlli1l1lOlI) this.I00iiO;
/* 727 */                   oOlli1l1lOlI.I000O01llI0();
/* 730 */                   if (oOlli1l1lOlI2 != null) {
/* 732 */                       oOlli1l1lOlI2.I000O01llI0();
/* 735 */                       return;
                            }
/* 735 */                   return;
                        case 2:
/* 700 */                   IoiI0l1IiIlo ioiI0l1IiIlo = (IoiI0l1IiIlo) this.I00iiI;
/* 704 */                   OloIlI0ll oloIlI0ll = (OloIlI0ll) this.I00iiO;
                            try {
/* 710 */                       oloIlI0ll.I00000oOI(ioiI0l1IiIlo.I00000oIO());
/* 718 */                       return;
                            } catch (Exception e) {
/* 715 */                       oloIlI0ll.I00000oIO(e);
/* 718 */                       return;
                            }
                        case 3:
/* 686 */                   JobInfoSchedulerService jobInfoSchedulerService = (JobInfoSchedulerService) this.I00iiI;
/* 690 */                   JobParameters jobParameters = (JobParameters) this.I00iiO;
/* 692 */                   int i = JobInfoSchedulerService.I00iOIl;
/* 694 */                   jobInfoSchedulerService.jobFinished(jobParameters, false);
/* 697 */                   return;
                        case 4:
/* 656 */                   Oi0Oooi oi0Oooi = (Oi0Oooi) this.I00iiI;
/* 660 */                   IOiOol0 iOiOol0 = (IOiOol0) this.I00iiO;
/* 664 */                   HashSet hashSet = new HashSet();
/* 667 */                   if (oi0Oooi != null) {
/* 673 */                       hashSet.addAll((LinkedHashSet) oi0Oooi.I00iiI);
                            }
/* 680 */                   ((IiOoil1O) iOiOol0.I00io1l).getClass();
/* 683 */                   return;
                        case 5:
/* 629 */                   IoIlOo1o0IIl ioIlOo1o0IIl = (IoIlOo1o0IIl) this.I00iiI;
/* 633 */                   OIOiOllolii oIOiOllolii = (OIOiOllolii) this.I00iiO;
/* 643 */                   O110oIO0 o110oIO0 = (O110oIO0) ((OI0lOii0I) ioIlOo1o0IIl.I00iiI).I0000O();
/* 645 */                   if (o110oIO0 == null) {
/* 653 */                       return;
                            }
/* 650 */                   oIOiOllolii.I00000oIO(o110oIO0.I00000oIO);
/* 653 */                   return;
                        case 6:
/* 606 */                   Map.Entry entry = (Map.Entry) this.I00iiI;
/* 610 */                   O110oIO0 o110oIO02 = (O110oIO0) this.I00iiO;
/* 616 */                   OIOiOllolii oIOiOllolii2 = (OIOiOllolii) entry.getKey();
/* 618 */                   o110oIO02.getClass();
/* 623 */                   oIOiOllolii2.I00000oIO(o110oIO02.I00000oIO);
/* 626 */                   return;
                        case 7:
/* 542 */                   IO0oo1I0oIO iO0oo1I0oIO = (IO0oo1I0oIO) this.I00iiI;
/* 546 */                   O1i0lolo o1i0lolo = (O1i0lolo) this.I00iiO;
/* 552 */                   OOIl1Io0 oOIl1Io0 = (OOIl1Io0) iO0oo1I0oIO.get();
                            try {
/* 554 */                       IIo0l1 iIo0l1 = IIo0l1.I00000oOI;
/* 556 */                       IOiOol0 iOiOol02 = oOIl1Io0.I00000oIO;
/* 560 */                       lOo0I0iOi11O.I00000oIO("CX:hasCamera");
                                try {
/* 573 */                           iIo0l1.I0000Il00O(((IIoIloi0) iOiOol02.I00io1l).I00000oIO.I0000Il00O());
/* 576 */                           z = true;
                                } catch (IllegalArgumentException unused) {
                                } catch (Throwable th) {
/* 579 */                           Trace.endSection();
/* 582 */                           throw th;
                                }
/* 583 */                       Trace.endSection();
/* 590 */                       o1i0lolo.invoke(Boolean.valueOf(z));
/* 603 */                       return;
                            } catch (Exception e2) {
/* 595 */                       e2.printStackTrace();
/* 600 */                       o1i0lolo.invoke(Boolean.FALSE);
/* 603 */                       return;
                            }
                        case 8:
/* 536 */                   ((IoiO1iOOil11) this.I00iiO).I0000Il00O((O1li1Il) this.I00iiI);
/* 539 */                   return;
                        case 9:
/* 515 */                   Surface surface = (Surface) this.I00iiI;
/* 519 */                   SurfaceTexture surfaceTexture = (SurfaceTexture) this.I00iiO;
/* 521 */                   surface.release();
/* 524 */                   surfaceTexture.release();
/* 527 */                   return;
                        case 10:
/* 509 */                   ((OOIIOiIoll0) this.I00iiI).I0000oI00((Oll0I0l1i1) this.I00iiO);
/* 512 */                   return;
                        case 11:
/* 497 */                   ((OOIIooi) ((iiOlilo0IIIl) this.I00iiI).I00iOIl).I00ll1.I0000oI00((Oll0I0l1i1) this.I00iiO);
/* 500 */                   return;
                        case 12:
/* 402 */                   OOIo1Iiiil oOIo1Iiiil = (OOIo1Iiiil) this.I00iiI;
/* 406 */                   IoiO1IO1I1i ioiO1IO1I1i = (IoiO1IO1I1i) this.I00iiO;
/* 426 */                   l11I11lO.I0000Il00O("ProcessingRequest", "onFinalResult(ImageProxy): request ID = " + oOIo1Iiiil.I00000oIO);
/* 429 */                   Oi0Oi10I oi0Oi10I = oOIo1Iiiil.I000II;
/* 431 */                   oi0Oi10I.getClass();
/* 434 */                   lOllIO.I00000oIO();
/* 439 */                   if (oi0Oi10I.I000II) {
/* 441 */                       ioiO1IO1I1i.close();
/* 482 */                       return;
                            }
/* 455 */                   lII1OI11o1I.I0000oI00("onImageCaptured() must be called before onFinalResult()", oi0Oi10I.I0000Il00O.I00iiI.isDone());
/* 458 */                   oi0Oi10I.I00000oIO();
/* 461 */                   I1lO0I0 i1lO0I0 = oi0Oi10I.I00000oIO;
/* 463 */                   Executor executor = i1lO0I0.I0000Il00O;
/* 469 */                   Io11iII11ll io11iII11ll = new Io11iII11ll(20);
/* 472 */                   io11iII11ll.I00iiI = i1lO0I0;
/* 474 */                   io11iII11ll.I00iiO = ioiO1IO1I1i;
/* 476 */                   VarHandle.storeStoreFence();
/* 479 */                   executor.execute(io11iII11ll);
/* 482 */                   return;
                        case 13:
/* 319 */                   OOIo1Iiiil oOIo1Iiiil2 = (OOIo1Iiiil) this.I00iiI;
/* 323 */                   Ioi1lIO ioi1lIO = (Ioi1lIO) this.I00iiO;
/* 343 */                   l11I11lO.I0001Ioi1lo("ProcessingRequest", "onProcessFailure: request ID = " + oOIo1Iiiil2.I00000oIO, ioi1lIO);
/* 346 */                   Oi0Oi10I oi0Oi10I2 = oOIo1Iiiil2.I000II;
/* 348 */                   oi0Oi10I2.getClass();
/* 351 */                   lOllIO.I00000oIO();
/* 356 */                   if (oi0Oi10I2.I000II) {
/* 399 */                       return;
                            }
/* 369 */                   lII1OI11o1I.I0000oI00("onImageCaptured() must be called before onFinalResult()", oi0Oi10I2.I0000Il00O.I00iiI.isDone());
/* 372 */                   oi0Oi10I2.I00000oIO();
/* 375 */                   lOllIO.I00000oIO();
/* 378 */                   I1lO0I0 i1lO0I02 = oi0Oi10I2.I00000oIO;
/* 380 */                   Executor executor2 = i1lO0I02.I0000Il00O;
/* 386 */                   Io11iII11ll io11iII11ll2 = new Io11iII11ll(19);
/* 389 */                   io11iII11ll2.I00iiI = i1lO0I02;
/* 391 */                   io11iII11ll2.I00iiO = ioi1lIO;
/* 393 */                   VarHandle.storeStoreFence();
/* 396 */                   executor2.execute(io11iII11ll2);
/* 399 */                   return;
                        case 14:
/* 280 */                   OOIo1i0 oOIo1i0 = (OOIo1i0) this.I00iiI;
/* 284 */                   i01IIlI i01iili = (i01IIlI) this.I00iiO;
                            synchronized (oOIo1i0.I000iOII) {
                                try {
/* 291 */                           Iterator it = oOIo1i0.I000OiO.iterator();
/* 299 */                           while (it.hasNext()) {
/* 307 */                               ((Il11ii) it.next()).I0000Il00O(i01iili, false);
                                    }
                                } catch (Throwable th2) {
/* 316 */                           throw th2;
                                }
                            }
/* 314 */                   return;
                        case 15:
/* 262 */                   RemoteWorkManagerClient remoteWorkManagerClient = (RemoteWorkManagerClient) this.I00iiI;
/* 266 */                   ListenableFuture listenableFuture = (ListenableFuture) this.I00iiO;
/* 268 */                   String str = RemoteWorkManagerClient.I000OOo1O;
                            try {
/* 270 */                       listenableFuture.get();
/* 277 */                       return;
                            } catch (InterruptedException | ExecutionException unused2) {
/* 274 */                       remoteWorkManagerClient.I00000oOI();
/* 277 */                       return;
                            }
                        case 16:
/* 256 */                   ((I1I1OO00o1o) this.I00iiI).I001i1O0Ol((Typeface) this.I00iiO);
/* 259 */                   return;
                        case 17:
/* 219 */                   OliolIlIO oliolIlIO = (OliolIlIO) this.I00iiI;
/* 223 */                   AtomicReference atomicReference = (AtomicReference) this.I00iiO;
/* 225 */                   oliolIlIO.getClass();
/* 232 */                   IOo1llI iOo1llI = (IOo1llI) atomicReference.get();
/* 236 */                   I1lIolllii i1lIolllii = new I1lIolllii();
/* 239 */                   i1lIolllii.I00000oIO = oliolIlIO;
/* 241 */                   VarHandle.storeStoreFence();
/* 244 */                   iOo1llI.accept(i1lIolllii);
/* 247 */                   return;
                        case PoseLandmark.RIGHT_PINKY:
/* 213 */                   ((Olo1I1) this.I00iiI).I00ilI0I1.remove((Oi0Oi10I) this.I00iiO);
/* 216 */                   return;
                        case PoseLandmark.LEFT_INDEX:
/* 183 */                   I1lO0I0 i1lO0I03 = (I1lO0I0) this.I00iiI;
/* 187 */                   Ioi1lIO ioi1lIO2 = (Ioi1lIO) this.I00iiO;
/* 189 */                   ioIOOi0 ioiooi0 = i1lO0I03.I0000O;
/* 191 */                   if (ioiooi0 != null) {
/* 193 */                       ioiooi0.I00000oOI(ioi1lIO2);
/* 202 */                       return;
                            } else {
/* 199 */                       I000II.I001IO000("One and only one callback is allowed.");
/* 202 */                       return;
                            }
                        case PoseLandmark.RIGHT_INDEX:
/* 163 */                   I1lO0I0 i1lO0I04 = (I1lO0I0) this.I00iiI;
/* 167 */                   IoiO1IO1I1i ioiO1IO1I1i2 = (IoiO1IO1I1i) this.I00iiO;
/* 169 */                   ioIOOi0 ioiooi02 = i1lO0I04.I0000O;
/* 171 */                   Objects.requireNonNull(ioiooi02);
/* 174 */                   Objects.requireNonNull(ioiO1IO1I1i2);
/* 177 */                   ioiooi02.I00000oIO(ioiO1IO1I1i2);
/* 180 */                   return;
                        case PoseLandmark.LEFT_THUMB:
/* 135 */                   Oo0oI1oo oo0oI1oo = (Oo0oI1oo) this.I00iiI;
/* 139 */                   Oll0I0l1i1 oll0I0l1i1 = (Oll0I0l1i1) this.I00iiO;
/* 141 */                   Oll0I0l1i1 oll0I0l1i12 = oo0oI1oo.I000O01llI0;
/* 143 */                   if (oll0I0l1i12 != null && oll0I0l1i12 == oll0I0l1i1) {
/* 147 */                       oo0oI1oo.I000O01llI0 = null;
/* 149 */                       oo0oI1oo.I000II = null;
                            }
/* 151 */                   IiI0oIlol0 iiI0oIlol0 = oo0oI1oo.I000l1;
/* 153 */                   if (iiI0oIlol0 != null) {
/* 155 */                       iiI0oIlol0.I00000oIO();
/* 158 */                       oo0oI1oo.I000l1 = null;
/* 160 */                       return;
                            }
/* 160 */                   return;
                        case PoseLandmark.RIGHT_THUMB:
/* 112 */                   OOo0ooi oOo0ooi = (OOo0ooi) this.I00iiI;
/* 116 */                   OOo0ooi oOo0ooi2 = (OOo0ooi) this.I00iiO;
/* 122 */                   il001oo1.I00000oOI((Ii0110) oOo0ooi.I00iOIl, null);
/* 129 */                   il001oo1.I00000oOI((Ii0110) oOo0ooi2.I00iOIl, null);
/* 132 */                   return;
                        case PoseLandmark.LEFT_HIP:
/* 92 */                    I0100i i0100i = (I0100i) this.I00iiI;
/* 96 */                    CountDownLatch countDownLatch = (CountDownLatch) this.I00iiO;
                            try {
/* 98 */                        i0100i.run();
/* 104 */                       return;
                            } finally {
/* 106 */                       countDownLatch.countDown();
                            }
                        case PoseLandmark.RIGHT_HIP:
/* 86 */                    ((i000IO) ((iOliil) this.I00iiI).I00iiO).I0000oI00((OlO0000lIOII) this.I00iiO, 3);
/* 89 */                    return;
                        case PoseLandmark.LEFT_KNEE:
/* 55 */                    Runnable runnable = (Runnable) this.I00iiI;
/* 59 */                    OilOol oilOol = (OilOol) this.I00iiO;
                            try {
/* 61 */                        runnable.run();
/* 67 */                        return;
                            } finally {
/* 69 */                        oilOol.I00000oIO();
                            }
                        case PoseLandmark.RIGHT_KNEE:
/* 28 */                    OolOi0i oolOi0i = (OolOi0i) this.I00iiI;
/* 32 */                    Runnable runnable2 = (Runnable) this.I00iiO;
/* 34 */                    ThreadLocal threadLocal = oolOi0i.I0000Il00O;
/* 38 */                    threadLocal.set(Boolean.TRUE);
                            try {
/* 41 */                        runnable2.run();
/* 47 */                        return;
                            } finally {
/* 49 */                        threadLocal.remove();
                            }
                        default:
/* 10 */                    i01l0IiO i01l0iio = (i01l0IiO) this.I00iiI;
/* 14 */                    I01O1lIi i01O1lIi = (I01O1lIi) this.I00iiO;
/* 18 */                    if (i01l0iio.I00iiO) {
/* 25 */                        return;
                            }
/* 20 */                    i01l0iio.I00iio = i01O1lIi;
/* 22 */                    i01O1lIi.I00li1OI(i01l0iio);
/* 25 */                    return;
                    }
                }
            }

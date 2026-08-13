            package p000;

            import android.graphics.SurfaceTexture;
            import android.hardware.camera2.CameraCaptureSession;
            import android.os.Process;
            import android.os.StrictMode;
            import android.util.Log;
            import android.util.LongSparseArray;
            import android.util.Size;
            import android.view.Surface;
            import androidx.work.impl.WorkDatabase;
            import androidx.work.impl.model.Preference;
            import com.google.common.util.concurrent.ListenableFuture;
            import com.google.mlkit.vision.pose.PoseLandmark;
            import java.lang.invoke.VarHandle;
            import java.util.ArrayList;
            import java.util.HashMap;
            import java.util.Iterator;
            import java.util.List;
            import java.util.Set;
            import java.util.UUID;
            import java.util.concurrent.Callable;
            import java.util.concurrent.Executor;
            import java.util.concurrent.atomic.AtomicBoolean;
            
            public final class I0iOo0oioiO implements Runnable {
                public final int I00iOIl;
                public Object I00iiI;
                public Object I00iiO;

                public I0iOo0oioiO(int i) {
/* 1 */             this.I00iOIl = i;
                }

                private final void I00000oIO() {
/* 3 */             IIoIloi0 iIoIloi0 = (IIoIloi0) this.I00iiI;
/* 7 */             IIiOOI iIiOOI = (IIiOOI) this.I00iiO;
/* 9 */             IIlOoolol0ll iIlOoolol0ll = iIoIloi0.I000II;
/* 21 */            if (!((AtomicBoolean) iIlOoolol0ll.I00li1OI).getAndSet(true)) {
/* 27 */                IIlOO01iI iIlOO01iI = (IIlOO01iI) iIlOoolol0ll.I00io1l;
/* 29 */                iIlOO01iI.getClass();
/* 33 */                iIlOO01iI.I000II = false;
                        synchronized (iIlOO01iI.I00000oOI) {
/* 38 */                    iIlOO01iI.I0000Il00O = null;
/* 42 */                    iIlOO01iI.I0000O = Il01100l.I00iOIl;
/* 44 */                    iIlOO01iI.I0001Ioi1lo = 0;
/* 48 */                    iIlOO01iI.I0000oI00.clear();
                        }
/* 54 */                OoIlIoo1oiOo ooIlIoo1oiOo = (OoIlIoo1oiOo) iIlOoolol0ll.I00ioIO;
/* 56 */                ooIlIoo1oiOo.getClass();
/* 63 */                Log.i("PipePresenceSrc", "Stopping camera ID flow collection.");
/* 74 */                if (((AtomicBoolean) ooIlIoo1oiOo.I00l0OO0IO).compareAndSet(true, false)) {
/* 79 */                    OlIl0i olIl0i = (OlIl0i) ooIlIoo1oiOo.I00l0I0l0lO1;
/* 81 */                    if (olIl0i != null) {
/* 83 */                        olIl0i.I000II(null);
                            }
/* 86 */                    ooIlIoo1oiOo.I00l0I0l0lO1 = null;
                        }
/* 96 */                if (((OllO00oiil) iIlOoolol0ll.I00iiI).I00000oOI()) {
/* 106 */                   IIloOiil iIloOiil = (IIloOiil) ((OllO00oiil) iIlOoolol0ll.I00iiI).getValue();
                            synchronized (iIloOiil.I0000Il00O) {
/* 113 */                       if (iIloOiil.I0000O) {
/* 141 */                           throw new IllegalStateException("Check failed.");
                                }
/* 125 */                       ((IIo000I0ilI) iIloOiil.I00000oIO.I0000oI00.get()).I00000oOI();
/* 128 */                       iIloOiil.I0000O = true;
                            }
                        }
                    }
/* 146 */           if (iIoIloi0.I0001Ioi1lo != null) {
/* 148 */               Executor executor = iIoIloi0.I0000O;
/* 152 */               if (executor instanceof IIlOool) {
/* 154 */                   IIlOool iIlOool = (IIlOool) executor;
                            synchronized (iIlOool.I00iOIl) {
                                try {
/* 165 */                           if (!iIlOool.I00iiI.isShutdown()) {
/* 169 */                               iIlOool.I00iiI.shutdown();
                                    }
                                } finally {
                                }
                            }
                        }
/* 181 */               iIoIloi0.I0001Ioi1lo.quit();
                    }
/* 184 */           iIiOOI.I00000oOI(null);
                }

                private final void I00000oOI() {
/* 3 */             IiIO1ol1i1o0 iiIO1ol1i1o0 = (IiIO1ol1i1o0) this.I00iiI;
/* 7 */             String str = (String) this.I00iiO;
                    try {
/* 11 */                iiIO1ol1i1o0.I0000oI00.get();
/* 16 */                IiIO1ol1i1o0.I000lI.decrementAndGet();
/* 21 */                IiIO1ol1i1o0.I000l1.get();
/* 24 */                iiIO1ol1i1o0.I0000oI00();
                    } catch (Exception e) {
/* 53 */                l11I11lO.I00000oIO("DeferrableSurface", "Unexpected surface termination for " + iiIO1ol1i1o0 + "\nStack Trace:\n" + str);
                        synchronized (iiIO1ol1i1o0.I00000oIO) {
/* 86 */                    throw new IllegalArgumentException(String.format("DeferrableSurface %s [closed: %b, use_count: %s] terminated with unexpected exception.", iiIO1ol1i1o0, Boolean.valueOf(iiIO1ol1i1o0.I0000Il00O), Integer.valueOf(iiIO1ol1i1o0.I00000oOI)), e);
                        }
                    }
                }

                @Override
                public final void run() throws SecurityException, IllegalArgumentException {
                    OIiilo1Ool0o oIiilo1Ool0o;
/* 4 */             int i = 1;
                    switch (this.I00iOIl) {
                        case 0:
/* 927 */                   ((IOOoo0o0Io) this.I00iiI).I0010o((ListenableFuture) this.I00iiO);
/* 930 */                   return;
                        case 1:
/* 915 */                   ((IOOoo0o0Io) this.I00iiI).I00100l0((IoilO0iiOo1) this.I00iiO);
/* 918 */                   return;
                        case 2:
/* 903 */                   iOIl0o.I00000oIO((I0lo1oIo) this.I00iiI, (LongSparseArray) this.I00iiO);
/* 906 */                   return;
                        case 3:
/* 882 */                   I0oO0iO1l0lo i0oO0iO1l0lo = (I0oO0iO1l0lo) this.I00iiI;
/* 886 */                   IoiO1iOOil11 ioiO1iOOil11 = (IoiO1iOOil11) this.I00iiO;
/* 888 */                   i0oO0iO1l0lo.getClass();
/* 891 */                   ioiO1iOOil11.I0000Il00O(i0oO0iO1l0lo);
/* 894 */                   return;
                        case 4:
/* 859 */                   I11liO i11liO = (I11liO) this.I00iiI;
/* 863 */                   Runnable runnable = (Runnable) this.I00iiO;
/* 865 */                   i11liO.getClass();
                            try {
/* 868 */                       runnable.run();
/* 874 */                       return;
                            } finally {
/* 876 */                       i11liO.I00000oIO();
                            }
                        case 5:
/* 834 */                   II0i11 iI0i11 = (II0i11) this.I00iiI;
/* 838 */                   II0iil1 iI0iil1 = (II0iil1) this.I00iiO;
/* 840 */                   II0lI0lO1 iI0lI0lO1 = iI0i11.I0110OiO;
/* 842 */                   iOOol1iOiIO iI0ioIIollll = iI0lI0lO1.I0000Il00O;
/* 844 */                   if (iI0ioIIollll == null) {
/* 848 */                       iI0ioIIollll = new II0ioIIollll();
/* 851 */                       iI0lI0lO1.I0000Il00O = iI0ioIIollll;
                            }
/* 853 */                   iI0ioIIollll.I0000Il00O(iI0iil1);
/* 856 */                   return;
                        case 6:
/* 815 */                   AtomicBoolean atomicBoolean = (AtomicBoolean) this.I00iiI;
/* 819 */                   IllOOo00lI illOOo00lI = (IllOOo00lI) this.I00iiO;
/* 826 */                   if (atomicBoolean.compareAndSet(false, true)) {
/* 828 */                       illOOo00lI.invoke();
/* 831 */                       return;
                            }
/* 831 */                   return;
                        case 7:
/* 809 */                   ((IIoIIOi1O) this.I00iiI).I00000oIO.onCaptureSequenceAborted((CameraCaptureSession) this.I00iiO, -1);
/* 812 */                   return;
                        case 8:
/* 689 */                   IIo01Oii0 iIo01Oii0 = (IIo01Oii0) this.I00iiI;
/* 693 */                   Set<IIllII> set = (Set) this.I00iiO;
/* 695 */                   IOiOol0 iOiOol0 = iIo01Oii0.I00000oIO;
/* 697 */                   iOiOol0.getClass();
/* 700 */                   lOllIO.I00000oIO();
                            synchronized (iOiOol0.I00iiO) {
                                try {
/* 714 */                           for (IIllII iIllII : set) {
/* 726 */                               Set setKeySet = ((HashMap) iOiOol0.I00iiI).keySet();
/* 734 */                               ArrayList arrayList = new ArrayList();
/* 745 */                               for (Object obj : setKeySet) {
/* 762 */                                   if (((IIllII) obj).I00000oIO.equals(iIllII.I00000oIO)) {
/* 764 */                                       arrayList.add(obj);
                                            }
                                        }
/* 770 */                               Iterator it = arrayList.iterator();
/* 778 */                               while (it.hasNext()) {
/* 790 */                                   ((HashMap) iOiOol0.I00iiI).remove((IIllII) it.next());
                                        }
                                    }
                                } catch (Throwable th) {
/* 797 */                           throw th;
                                }
                            }
/* 795 */                   return;
                        case 9:
/* 683 */                   ((IIllOo0) this.I00iiI).I0010o().I0000O().I000OiO((OIOilII0IlO) this.I00iiO);
/* 686 */                   return;
                        case 10:
/* 641 */                   IIo0IOlilI iIo0IOlilI = (IIo0IOlilI) this.I00iiI;
/* 645 */                   IOiOol0 iOiOol02 = (IOiOol0) this.I00iiO;
/* 661 */                   if (IOOi0Ool1i.I00iio(iIo0IOlilI.I000iOII).isEmpty()) {
/* 666 */                       return;
                            }
/* 663 */                   iOiOol02.getClass();
/* 666 */                   return;
                        case 11:
/* 635 */                   ((IIllOioOlolI) this.I00iiI).I0000O().I0001Ioi1lo((IIo01011I) this.I00iiO);
/* 638 */                   return;
                        case 12:
/* 580 */                   IIo0ii1Oi iIo0ii1Oi = (IIo0ii1Oi) this.I00iiI;
/* 584 */                   IIllOo0 iIllOo0 = (IIllOo0) this.I00iiO;
                            synchronized (iIo0ii1Oi.I00000oIO) {
                                try {
/* 591 */                           iIo0ii1Oi.I0000Il00O.remove(iIllOo0);
/* 600 */                           if (iIo0ii1Oi.I0000Il00O.isEmpty()) {
/* 604 */                               iIo0ii1Oi.I0000oI00.getClass();
/* 609 */                               iIo0ii1Oi.I0000oI00.I00000oOI(null);
/* 612 */                               iIo0ii1Oi.I0000oI00 = null;
/* 614 */                               iIo0ii1Oi.I0000O = null;
                                    }
                                } finally {
                                }
                            }
/* 620 */                   return;
                        case 13:
/* 574 */                   ((IOo1llI) this.I00iiI).accept((I1illlI1) this.I00iiO);
/* 577 */                   return;
                        case 14:
/* 562 */                   I00000oIO();
/* 565 */                   return;
                        case 15:
/* 558 */                   iOl0OOll.I00000oIO((i01IlOO) this.I00iiI, ((UUID) this.I00iiO).toString());
/* 561 */                   return;
                        case 16:
/* 482 */                   WorkDatabase workDatabase = (WorkDatabase) this.I00iiI;
/* 486 */                   i01IlOO i01iloo = (i01IlOO) this.I00iiO;
/* 496 */                   Iterator<String> it2 = workDatabase.I001lIiIIo1O().getAllUnfinishedWork().iterator();
/* 504 */                   while (it2.hasNext()) {
/* 512 */                       iOl0OOll.I00000oIO(i01iloo, it2.next());
                            }
/* 520 */                   i01iloo.I00000oOI.I0000O.getClass();
/* 542 */                   workDatabase.I001IO000().insertPreference(new Preference("last_cancel_all_time_ms", Long.valueOf(System.currentTimeMillis())));
/* 545 */                   return;
                        case 17:
/* 476 */                   ((Oi01Ooii1Ol) this.I00iiI).I00OOll1((Oi01iIoI) this.I00iiO);
/* 479 */                   return;
                        case PoseLandmark.RIGHT_PINKY:
/* 444 */                   Ill0oOi0 ill0oOi0 = (Ill0oOi0) this.I00iiI;
/* 448 */                   OIOoO1IOIo oIOoO1IOIo = (OIOoO1IOIo) this.I00iiO;
/* 450 */                   O0oiiOll0O1 o0oiiOll0O1 = ill0oOi0.I00iOIl;
/* 454 */                   IOiIlIll0I iOiIlIll0I = new IOiIlIll0I();
/* 457 */                   iOiIlIll0I.I00iOIl = oIOoO1IOIo;
/* 459 */                   iOiIlIll0I.I00iiI = ill0oOi0;
/* 461 */                   VarHandle.storeStoreFence();
/* 464 */                   o0oiiOll0O1.I00li1OI(iOiIlIll0I);
/* 467 */                   return;
                        case PoseLandmark.LEFT_INDEX:
/* 409 */                   OIiioO1l oIiioO1l = (OIiioO1l) this.I00iiI;
/* 413 */                   OOiO0Il oOiO0Il = (OOiO0Il) this.I00iiO;
/* 419 */                   if (oIiioO1l.I00000oOI != OIiioO1l.I0000O) {
/* 438 */                       I000II.I001IO000("provide() can be called only once.");
/* 441 */                       return;
                            }
                            synchronized (oIiioO1l) {
/* 422 */                       oIiilo1Ool0o = oIiioO1l.I00000oIO;
/* 424 */                       oIiioO1l.I00000oIO = null;
/* 426 */                       oIiioO1l.I00000oOI = oOiO0Il;
                            }
/* 429 */                   oIiilo1Ool0o.getClass();
/* 441 */                   return;
                        case PoseLandmark.RIGHT_INDEX:
/* 375 */                   O0o11IlioI o0o11IlioI = (O0o11IlioI) this.I00iiI;
/* 379 */                   OOiO0Il oOiO0Il2 = (OOiO0Il) this.I00iiO;
                            synchronized (o0o11IlioI) {
                                try {
/* 384 */                           if (o0o11IlioI.I00000oOI == null) {
/* 388 */                               o0o11IlioI.I00000oIO.add(oOiO0Il2);
                                    } else {
/* 400 */                               o0o11IlioI.I00000oOI.add(oOiO0Il2.get());
                                    }
                                } finally {
                                }
                            }
/* 404 */                   return;
                        case PoseLandmark.LEFT_THUMB:
/* 342 */                   List list = (List) this.I00iiI;
/* 346 */                   I1oolIoOllO i1oolIoOllO = (I1oolIoOllO) this.I00iiO;
/* 350 */                   Iterator it3 = list.iterator();
/* 358 */                   while (it3.hasNext()) {
/* 368 */                       ((I1oI11I) it3.next()).I00000oIO(i1oolIoOllO.I0000oI00);
                            }
/* 372 */                   return;
                        case PoseLandmark.RIGHT_THUMB:
/* 318 */                   Ii0l1oioII ii0l1oioII = (Ii0l1oioII) this.I00iiI;
/* 322 */                   Runnable runnable2 = (Runnable) this.I00iiO;
/* 326 */                   Process.setThreadPriority(ii0l1oioII.I0000Il00O);
/* 329 */                   StrictMode.ThreadPolicy threadPolicy = ii0l1oioII.I0000O;
/* 331 */                   if (threadPolicy != null) {
/* 333 */                       StrictMode.setThreadPolicy(threadPolicy);
                            }
/* 336 */                   runnable2.run();
/* 339 */                   return;
                        case PoseLandmark.LEFT_HIP:
/* 312 */                   ((IiI1oOoo) this.I00iiI).I000iOII.add((I1ioiIOl0) this.I00iiO);
/* 315 */                   return;
                        case PoseLandmark.RIGHT_HIP:
/* 267 */                   IiI1oOoo iiI1oOoo = (IiI1oOoo) this.I00iiI;
/* 271 */                   OliolIlIO oliolIlIO = (OliolIlIO) this.I00iiO;
/* 273 */                   Io11oioo io11oioo = iiI1oOoo.I0000Il00O;
/* 277 */                   IIoIIO iIoIIO = new IIoIIO(i);
/* 280 */                   iIoIIO.I00000oOI = iiI1oOoo;
/* 282 */                   iIoIIO.I0000Il00O = oliolIlIO;
/* 284 */                   VarHandle.storeStoreFence();
/* 287 */                   Surface surfaceI0000Il00O = oliolIlIO.I0000Il00O(io11oioo, iIoIIO);
/* 293 */                   iiI1oOoo.I00000oIO.I000l1(surfaceI0000Il00O);
/* 298 */                   iiI1oOoo.I000O01llI0.put(oliolIlIO, surfaceI0000Il00O);
/* 301 */                   return;
                        case PoseLandmark.LEFT_KNEE:
/* 170 */                   IiI1oOoo iiI1oOoo2 = (IiI1oOoo) this.I00iiI;
/* 174 */                   Oll0I0l1i1 oll0I0l1i1 = (Oll0I0l1i1) this.I00iiO;
                            iiI1oOoo2.I000OOo1O++;
/* 183 */                   OIi0ooo0l1 oIi0ooo0l1 = iiI1oOoo2.I00000oIO;
/* 189 */                   Ilo0O01IO.I0000O((AtomicBoolean) oIi0ooo0l1.I00iiO, true);
/* 196 */                   Ilo0O01IO.I0000Il00O((Thread) oIi0ooo0l1.I00ilI0I1);
/* 201 */                   SurfaceTexture surfaceTexture = new SurfaceTexture(oIi0ooo0l1.I00iOIl);
/* 204 */                   Size size = oll0I0l1i1.I00000oOI;
/* 214 */                   surfaceTexture.setDefaultBufferSize(size.getWidth(), size.getHeight());
/* 219 */                   Surface surface = new Surface(surfaceTexture);
/* 222 */                   Io11oioo io11oioo2 = iiI1oOoo2.I0000Il00O;
/* 227 */                   IIoIil iIoIil = new IIoIil(5);
/* 230 */                   iIoIil.I00iiI = iiI1oOoo2;
/* 232 */                   iIoIil.I00iiO = oll0I0l1i1;
/* 234 */                   VarHandle.storeStoreFence();
/* 237 */                   oll0I0l1i1.I00000oOI(io11oioo2, iIoIil);
/* 242 */                   IiI1o00 iiI1o00 = new IiI1o00();
/* 245 */                   iiI1o00.I00000oIO = iiI1oOoo2;
/* 247 */                   iiI1o00.I00000oOI = oll0I0l1i1;
/* 249 */                   iiI1o00.I0000Il00O = surfaceTexture;
/* 251 */                   iiI1o00.I0000O = surface;
/* 253 */                   VarHandle.storeStoreFence();
/* 256 */                   oll0I0l1i1.I00000oIO(surface, io11oioo2, iiI1o00);
/* 261 */                   surfaceTexture.setOnFrameAvailableListener(iiI1oOoo2, iiI1oOoo2.I0000O);
/* 264 */                   return;
                        case PoseLandmark.RIGHT_KNEE:
/* 164 */                   I00000oOI();
/* 167 */                   return;
                        case 27:
/* 141 */                   Callable callable = (Callable) this.I00iiI;
/* 149 */                   IiIlIiO0 iiIlIiO0 = (IiIlIiO0) ((iiOlilo0IIIl) this.I00iiO).I00iOIl;
                            try {
/* 155 */                       iiIlIiO0.I000OOo1O(callable.call());
/* 163 */                       return;
                            } catch (Exception e) {
/* 160 */                       iiIlIiO0.I000OiO(e);
/* 163 */                       return;
                            }
                        case PoseLandmark.RIGHT_ANKLE:
/* 48 */                    Iio1000IOoi1 iio1000IOoi1 = (Iio1000IOoi1) this.I00iiI;
/* 52 */                    Oll0I0l1i1 oll0I0l1i12 = (Oll0I0l1i1) this.I00iiO;
                            iio1000IOoi1.I0000oI00++;
/* 61 */                    Iio0oli1Ool iio0oli1Ool = iio1000IOoi1.I00000oIO;
/* 63 */                    boolean z = oll0I0l1i12.I0000oI00;
/* 65 */                    Size size2 = oll0I0l1i12.I00000oOI;
/* 71 */                    Ilo0O01IO.I0000O((AtomicBoolean) iio0oli1Ool.I00iiO, true);
/* 78 */                    Ilo0O01IO.I0000Il00O((Thread) iio0oli1Ool.I00ilI0I1);
/* 88 */                    SurfaceTexture surfaceTexture2 = new SurfaceTexture(z ? iio0oli1Ool.I00lll10 : iio0oli1Ool.I00o0iI0io1);
/* 99 */                    surfaceTexture2.setDefaultBufferSize(size2.getWidth(), size2.getHeight());
/* 104 */                   Surface surface2 = new Surface(surfaceTexture2);
/* 107 */                   Io11oioo io11oioo3 = iio1000IOoi1.I0000Il00O;
/* 111 */                   Iio0oliloo0 iio0oliloo0 = new Iio0oliloo0();
/* 114 */                   iio0oliloo0.I00000oIO = iio1000IOoi1;
/* 116 */                   iio0oliloo0.I00000oOI = surfaceTexture2;
/* 118 */                   iio0oliloo0.I0000Il00O = surface2;
/* 120 */                   VarHandle.storeStoreFence();
/* 123 */                   oll0I0l1i12.I00000oIO(surface2, io11oioo3, iio0oliloo0);
/* 126 */                   if (z) {
/* 128 */                       iio1000IOoi1.I000OOo1O = surfaceTexture2;
/* 138 */                       return;
                            } else {
/* 131 */                       iio1000IOoi1.I000OiO = surfaceTexture2;
/* 135 */                       surfaceTexture2.setOnFrameAvailableListener(iio1000IOoi1, iio1000IOoi1.I0000O);
/* 138 */                       return;
                            }
                        default:
/* 10 */                    Iio1000IOoi1 iio1000IOoi12 = (Iio1000IOoi1) this.I00iiI;
/* 14 */                    OliolIlIO oliolIlIO2 = (OliolIlIO) this.I00iiO;
/* 16 */                    Io11oioo io11oioo4 = iio1000IOoi12.I0000Il00O;
/* 21 */                    IIoIIO iIoIIO2 = new IIoIIO(2);
/* 24 */                    iIoIIO2.I00000oOI = iio1000IOoi12;
/* 26 */                    iIoIIO2.I0000Il00O = oliolIlIO2;
/* 28 */                    VarHandle.storeStoreFence();
/* 31 */                    Surface surfaceI0000Il00O2 = oliolIlIO2.I0000Il00O(io11oioo4, iIoIIO2);
/* 37 */                    iio1000IOoi12.I00000oIO.I000l1(surfaceI0000Il00O2);
/* 42 */                    iio1000IOoi12.I000O01llI0.put(oliolIlIO2, surfaceI0000Il00O2);
/* 45 */                    return;
                    }
                }
            }

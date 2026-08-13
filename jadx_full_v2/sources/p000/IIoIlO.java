            package p000;

            import android.content.Context;
            import android.os.Handler;
            import android.os.SystemClock;
            import android.os.Trace;
            import java.lang.invoke.VarHandle;
            import java.util.Iterator;
            import java.util.concurrent.Executor;
            
            public final class IIoIlO implements Runnable {
                public final int I00iOIl;
                public IIoIloi0 I00iiI;
                public Executor I00iiO;
                public long I00iio;
                public int I00ilI0I1;
                public Context I00ilO0;
                public IIiOOI I00io1l;

                public IIoIlO(int i) {
/* 1 */             this.I00iOIl = i;
                }

                /* JADX WARN: Finally extract failed */
                /* JADX WARN: Removed duplicated region for block: B:60:0x0195 A[Catch: all -> 0x0247, TryCatch #2 {all -> 0x0247, blocks: (B:7:0x0043, B:9:0x004b, B:11:0x006b, B:13:0x007a, B:15:0x0089, B:17:0x0097, B:19:0x00b7, B:22:0x00c5, B:23:0x00ee, B:25:0x00f4, B:26:0x0104, B:28:0x012a, B:30:0x0130, B:31:0x0137, B:32:0x0139, B:37:0x013f, B:58:0x0184, B:60:0x0195, B:61:0x019d, B:65:0x01a6, B:89:0x023c, B:66:0x01e6, B:67:0x01e8, B:71:0x01ed, B:73:0x01f1, B:74:0x01f3, B:77:0x01f7, B:81:0x01fe, B:82:0x01ff, B:84:0x0203, B:85:0x022c, B:87:0x0230, B:88:0x0234, B:94:0x0246, B:44:0x014c, B:47:0x014f, B:48:0x015d, B:54:0x0166, B:55:0x0174, B:56:0x0175, B:57:0x0183, B:69:0x01ea, B:70:0x01ec, B:75:0x01f4, B:76:0x01f6), top: B:102:0x0043, inners: #0, #6 }] */
                /* JADX WARN: Removed duplicated region for block: B:66:0x01e6 A[Catch: all -> 0x0247, TryCatch #2 {all -> 0x0247, blocks: (B:7:0x0043, B:9:0x004b, B:11:0x006b, B:13:0x007a, B:15:0x0089, B:17:0x0097, B:19:0x00b7, B:22:0x00c5, B:23:0x00ee, B:25:0x00f4, B:26:0x0104, B:28:0x012a, B:30:0x0130, B:31:0x0137, B:32:0x0139, B:37:0x013f, B:58:0x0184, B:60:0x0195, B:61:0x019d, B:65:0x01a6, B:89:0x023c, B:66:0x01e6, B:67:0x01e8, B:71:0x01ed, B:73:0x01f1, B:74:0x01f3, B:77:0x01f7, B:81:0x01fe, B:82:0x01ff, B:84:0x0203, B:85:0x022c, B:87:0x0230, B:88:0x0234, B:94:0x0246, B:44:0x014c, B:47:0x014f, B:48:0x015d, B:54:0x0166, B:55:0x0174, B:56:0x0175, B:57:0x0183, B:69:0x01ea, B:70:0x01ec, B:75:0x01f4, B:76:0x01f6), top: B:102:0x0043, inners: #0, #6 }] */
                /* JADX WARN: Removed duplicated region for block: B:68:0x01e9  */
                @Override
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final void run() {
                    Object obj;
                    Oi110I oi110II00000oOI;
                    IIli01O iIli01OI000OOo1O;
                    OlOO1i11110 olOO1i11110;
/* 5 */             int i = 1;
                    switch (this.I00iOIl) {
                        case 0:
/* 50 */                    IIoIloi0 iIoIloi0 = this.I00iiI;
/* 52 */                    Context context = this.I00ilO0;
/* 54 */                    Executor executor = this.I00iiO;
/* 56 */                    int i2 = this.I00ilI0I1;
/* 58 */                    IIiOOI iIiOOI = this.I00io1l;
/* 60 */                    long j = this.I00iio;
/* 64 */                    lOo0I0iOi11O.I00000oIO("CX:initAndRetryRecursively");
/* 67 */                    int i3 = 0;
                            try {
                                try {
/* 70 */                            iIli01OI000OOo1O = iIoIloi0.I0000Il00O.I000OOo1O();
                                    try {
                                    } catch (IIoIiOlOIiO | IolIoOoi11 | RuntimeException e) {
/* 328 */                               e = e;
                                    }
                                } finally {
/* 585 */                           Trace.endSection();
                                }
                            } catch (IIoIiOlOIiO | IolIoOoi11 | RuntimeException e2) {
/* 356 */                       e = e2;
/* 357 */                       obj = null;
                            }
/* 74 */                    if (iIli01OI000OOo1O == null) {
/* 388 */                       throw new IolIoOoi11(new IllegalArgumentException("Invalid app configuration provided. Missing CameraFactory."));
                            }
/* 80 */                    I1ioIOoI1o0 i1ioIOoI1o0I00000oIO = I1ioIOoI1o0.I00000oIO(iIoIloi0.I0000O, iIoIloi0.I0000oI00);
/* 86 */                    IIo0l1 iIo0l1I0001Ioi1lo = iIoIloi0.I0000Il00O.I0001Ioi1lo();
/* 90 */                    IIOo1i iIOo1iI0000Il00O = IIOo1i.I0000Il00O(context, iIo0l1I0001Ioi1lo);
/* 96 */                    long jI000iOII = iIoIloi0.I0000Il00O.I000iOII();
/* 106 */                   if (iIoIloi0.I0000Il00O.I0010I0i() == null) {
/* 373 */                       throw new IolIoOoi11(new IllegalArgumentException("Invalid app configuration provided. Missing UseCaseConfigFactory."));
                            }
/* 108 */                   IIoIi0iI iIoIi0iII00000oIO = IIl00l.I00000oIO(context);
/* 112 */                   iIoIloi0.I000OOo1O = iIoIi0iII00000oIO;
                            try {
/* 125 */                       olOO1i11110 = new OlOO1i11110(iIoIi0iII00000oIO);
/* 128 */                       iIoIloi0.I000OiO = olOO1i11110;
                            } catch (IIoIiOlOIiO | IolIoOoi11 | RuntimeException e3) {
/* 351 */                       e = e3;
/* 352 */                       obj = null;
/* 354 */                       i3 = 4;
/* 396 */                       oi110II00000oOI = iIoIloi0.I000l1.I00000oOI(new IIo0IiiO(j, e));
/* 404 */                       if (Trace.isEnabled()) {
/* 411 */                           Trace.setCounter("CX:CameraProvider-RetryStatus", r3.I00000oIO);
                                }
/* 416 */                       if (oi110II00000oOI.I00000oOI || i2 >= Integer.MAX_VALUE) {
                                    synchronized (iIoIloi0.I00000oOI) {
/* 491 */                               iIoIloi0.I00100l0 = 3;
                                    }
/* 496 */                           if (oi110II00000oOI.I0000Il00O) {
                                        synchronized (iIoIloi0.I00000oOI) {
/* 501 */                                   iIoIloi0.I00100l0 = i3;
                                        }
/* 504 */                               iIiOOI.I00000oOI(obj);
/* 580 */                               return;
                                    }
/* 514 */                           if (e instanceof IIoIiOlOIiO) {
/* 534 */                               String str = "Device reporting less cameras than anticipated. On real devices: Retrying initialization might resolve temporary camera errors. On emulators: Ensure virtual camera configuration matches supported camera features as reported by PackageManager#hasSystemFeature. Available cameras: " + ((IIoIiOlOIiO) e).I00iOIl;
/* 540 */                               l11I11lO.I00000oOI("CameraX", str, e);
/* 553 */                               iIiOOI.I0000O(new IolIoOoi11(new IIoII01(str)));
                                    } else if (e instanceof IolIoOoi11) {
/* 561 */                               iIiOOI.I0000O(e);
                                    } else {
/* 570 */                               iIiOOI.I0000O(new IolIoOoi11(e));
                                    }
                                } else {
/* 454 */                           l11I11lO.I0001Ioi1lo("CameraX", "Retry init. Start time " + j + " current time " + SystemClock.elapsedRealtime(), e);
/* 457 */                           Handler handler = iIoIloi0.I0000oI00;
/* 461 */                           IIoIlO iIoIlO = new IIoIlO(i);
/* 464 */                           iIoIlO.I00iiI = iIoIloi0;
/* 466 */                           iIoIlO.I00iiO = executor;
/* 468 */                           iIoIlO.I00iio = j;
/* 470 */                           iIoIlO.I00ilI0I1 = i2;
/* 472 */                           iIoIlO.I00ilO0 = context;
/* 474 */                           iIoIlO.I00io1l = iIiOOI;
/* 476 */                           VarHandle.storeStoreFence();
/* 483 */                           handler.postDelayed(iIoIlO, "retry_token", oi110II00000oOI.I00000oIO);
                                }
/* 575 */                       iIoIloi0.I000o00OoI0I.I0001Ioi1lo();
/* 580 */                       return;
                            }
                            try {
/* 142 */                       iIoIloi0.I000II = iIli01OI000OOo1O.I00000oIO(context, i1ioIOoI1o0I00000oIO, iIo0l1I0001Ioi1lo, jI000iOII, iIoIloi0.I0000Il00O, olOO1i11110);
                            } catch (IIoIiOlOIiO | IolIoOoi11 | RuntimeException e4) {
/* 193 */                       e = e4;
/* 194 */                       i3 = 4;
/* 195 */                       obj = null;
/* 396 */                       oi110II00000oOI = iIoIloi0.I000l1.I00000oOI(new IIo0IiiO(j, e));
/* 404 */                       if (Trace.isEnabled()) {
                                }
/* 416 */                       if (oi110II00000oOI.I00000oOI) {
                                    synchronized (iIoIloi0.I00000oOI) {
                                    }
                                }
/* 580 */                       return;
                            }
/* 150 */                   if (iIoIloi0.I0000Il00O.I000lI() == null) {
/* 350 */                       throw new IolIoOoi11(new IllegalArgumentException("Invalid app configuration provided. Missing CameraDeviceSurfaceManager."));
                            }
/* 170 */                   IIoI00I00I iIoI00I00II00000oIO = IIl00i0o0oI.I00000oIO(context, (Ii10Ioo00l) ((OllO00oiil) iIoIloi0.I000II.I00iiO).getValue(), iIoIloi0.I000II.I000OOo1O());
/* 174 */                   iIoIloi0.I000O01llI0 = iIoI00I00II00000oIO;
/* 178 */                   iIoIloi0.I000OiO.I00iiO = iIoI00I00II00000oIO;
/* 182 */                   if (executor instanceof IIlOool) {
/* 189 */                       ((IIlOool) executor).I00000oIO(iIoIloi0.I000II);
                            }
/* 202 */                   iIoIloi0.I00000oIO.I0000O(iIoIloi0.I000II);
/* 210 */                   IIlOO01iI iIlOO01iI = (IIlOO01iI) iIoIloi0.I000II.I00io1l;
/* 214 */                   iIlOO01iI.I00000oOI(iIoIloi0.I00000oIO);
/* 219 */                   IIo0ii1Oi iIo0ii1Oi = iIoIloi0.I00000oIO;
/* 229 */                   iIoIloi0.I000iOII = new OillOo0(iIo0ii1Oi, iIlOO01iI, iIoIloi0.I000OOo1O, iIoIloi0.I000OiO, 4);
/* 235 */                   Iterator it = iIo0ii1Oi.I0000Il00O().iterator();
/* 243 */                   while (it.hasNext()) {
/* 257 */                       ((IIllOo0) it.next()).I0010o().I000OiO(iIoIloi0.I000iOII);
                            }
/* 267 */                   iIoIloi0.I000o00OoI0I.I000II(iIOo1iI0000Il00O, iIoIloi0.I000II, iIoIloi0.I00000oIO);
/* 276 */                   iIoIloi0.I000o00OoI0I.I000lI.add(iIoIloi0.I000O01llI0);
/* 289 */                   iIoIloi0.I000o00OoI0I.I000lI.add((IIlOO01iI) iIoIloi0.I000II.I00io1l);
/* 294 */                   iIOo1iI0000Il00O.I001l0I00(iIoIloi0.I00000oIO);
/* 297 */                   if (i2 > 1 && Trace.isEnabled()) {
/* 309 */                       Trace.setCounter("CX:CameraProvider-RetryStatus", -1);
                            }
                            synchronized (iIoIloi0.I00000oOI) {
                                try {
/* 316 */                           iIoIloi0.I00100l0 = 4;
                                } catch (Throwable th) {
/* 330 */                           th = th;
                                    while (true) {
                                        try {
/* 333 */                                   throw th;
                                        } catch (Throwable th2) {
/* 334 */                                   th = th2;
                                        }
                                    }
                                }
                            }
/* 320 */                   iIiOOI.I00000oOI(null);
/* 580 */                   return;
                        default:
/* 9 */                     IIoIloi0 iIoIloi02 = this.I00iiI;
/* 11 */                    Executor executor2 = this.I00iiO;
/* 13 */                    long j2 = this.I00iio;
/* 15 */                    int i4 = this.I00ilI0I1;
/* 17 */                    Context context2 = this.I00ilO0;
/* 19 */                    IIiOOI iIiOOI2 = this.I00io1l;
/* 22 */                    iIoIloi02.getClass();
/* 28 */                    IIoIlO iIoIlO2 = new IIoIlO(0);
/* 31 */                    iIoIlO2.I00iiI = iIoIloi02;
/* 33 */                    iIoIlO2.I00ilO0 = context2;
/* 35 */                    iIoIlO2.I00iiO = executor2;
/* 37 */                    iIoIlO2.I00ilI0I1 = i4 + 1;
/* 39 */                    iIoIlO2.I00io1l = iIiOOI2;
/* 41 */                    iIoIlO2.I00iio = j2;
/* 43 */                    VarHandle.storeStoreFence();
/* 46 */                    executor2.execute(iIoIlO2);
/* 49 */                    return;
                    }
                }
            }

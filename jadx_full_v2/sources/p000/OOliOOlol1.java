            package p000;

            import java.io.IOException;
            import java.util.concurrent.atomic.AtomicInteger;
            
            public final class OOliOOlol1 implements Runnable {
                public I01i01OoI I00iOIl;
                public volatile AtomicInteger I00iiI;
                public OOlioiIOOO1 I00iiO;

                @Override
                public final void run() {
                    OIOlo0OloOi oIOlo0OloOi;
/* 19 */            String strConcat = "OkHttp ".concat(((IoOi01OlIl1o) this.I00iiO.I00iiI.I00iiI).I0001Ioi1lo());
/* 23 */            OOlioiIOOO1 oOlioiIOOO1 = this.I00iiO;
/* 25 */            Thread threadCurrentThread = Thread.currentThread();
/* 29 */            String name = threadCurrentThread.getName();
/* 33 */            threadCurrentThread.setName(strConcat);
                    try {
/* 38 */                oOlioiIOOO1.I00iio.I000O01llI0();
/* 41 */                boolean z = false;
                        try {
                            try {
                                try {
/* 53 */                            ((IIoOoIol0Io0) this.I00iOIl.I00iiO).resumeWith(oOlioiIOOO1.I000II());
/* 56 */                            oIOlo0OloOi = oOlioiIOOO1.I00iOIl;
                                } catch (IOException e) {
/* 74 */                            e = e;
/* 70 */                            z = true;
/* 124 */                           if (z) {
/* 126 */                               OO1I1IllO oO1I1IllO = OO1I1IllO.I00000oIO;
/* 128 */                               OO1I1IllO oO1I1IllO2 = OO1I1IllO.I00000oIO;
/* 132 */                               StringBuilder sb = new StringBuilder("Callback failure for ");
/* 176 */                               sb.append((oOlioiIOOO1.I00lli11 ? "canceled " : "") + "call to " + ((IoOi01OlIl1o) oOlioiIOOO1.I00iiI.I00iiI).I0001Ioi1lo());
/* 179 */                               String string = sb.toString();
/* 183 */                               oO1I1IllO2.getClass();
/* 187 */                               OO1I1IllO.I0001Ioi1lo(string, e, 4);
                                    } else {
/* 191 */                               I01i01OoI i01i01OoI = this.I00iOIl;
/* 195 */                               if (!oOlioiIOOO1.I00lli11) {
/* 205 */                                   ((IIoOoIol0Io0) i01i01OoI.I00iiO).resumeWith(lIoii1l01l0i.I00000oIO(e));
                                        }
                                    }
/* 208 */                           oIOlo0OloOi = oOlioiIOOO1.I00iOIl;
/* 60 */                            oIOlo0OloOi.I00iOIl.I000II(this);
                                } catch (Throwable th) {
/* 72 */                            th = th;
/* 68 */                            z = true;
/* 77 */                            oOlioiIOOO1.I0000O();
/* 80 */                            if (!z) {
/* 96 */                                IOException iOException = new IOException("canceled due to " + th);
/* 99 */                                ilIilolOlIoO.I00000oIO(iOException, th);
/* 102 */                               I01i01OoI i01i01OoI2 = this.I00iOIl;
/* 106 */                               if (!oOlioiIOOO1.I00lli11) {
/* 116 */                                   ((IIoOoIol0Io0) i01i01OoI2.I00iiO).resumeWith(lIoii1l01l0i.I00000oIO(iOException));
                                        }
                                    }
/* 122 */                           throw th;
                                }
                            } catch (Throwable th2) {
/* 220 */                       oOlioiIOOO1.I00iOIl.I00iOIl.I000II(this);
/* 223 */                       throw th2;
                            }
                        } catch (IOException e2) {
/* 123 */                   e = e2;
                        } catch (Throwable th3) {
/* 76 */                    th = th3;
                        }
/* 60 */                oIOlo0OloOi.I00iOIl.I000II(this);
                    } finally {
/* 224 */               threadCurrentThread.setName(name);
                    }
                }
            }

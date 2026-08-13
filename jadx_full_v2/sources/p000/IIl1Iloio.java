            package p000;

            import android.hardware.camera2.CameraCaptureSession;
            import android.hardware.camera2.CameraExtensionSession;
            import android.hardware.camera2.CaptureFailure;
            import android.hardware.camera2.CaptureRequest;
            import android.hardware.camera2.CaptureResult;
            import android.hardware.camera2.TotalCaptureResult;
            import android.view.Surface;
            import java.lang.invoke.VarHandle;
            import java.util.LinkedHashMap;
            import java.util.Map;
            import java.util.concurrent.Executor;
            
            public final class IIl1Iloio implements Oi01Ooii1Ol {
                public final LinkedHashMap I00iOIl = new LinkedHashMap();
                public final OllO00oiil I00iiI = new OllO00oiil(new IIl11il0I0io(0));
                public volatile Map I00iiO = Il011I1OiO0I.I00iOIl;

                public static int I0000O(Oi0Iil oi0Iil) {
/* 7 */             Olo0o1II0 olo0o1II0 = (Olo0o1II0) oi0Iil.I00000oOI(Olo10o10.I00000oIO);
/* 21 */            Object obj = olo0o1II0 != null ? olo0o1II0.I00000oIO.get("CAPTURE_CONFIG_ID_KEY") : null;
/* 27 */            Integer num = obj instanceof Integer ? (Integer) obj : null;
/* 29 */            if (num != null) {
/* 31 */                return num.intValue();
                    }
/* 36 */            return -1;
                }

                public final void I00000oIO(IIl1Ol iIl1Ol, Executor executor) {
/* 7 */             if (this.I00iiO.containsKey(iIl1Ol)) {
/* 106 */               throw new IllegalStateException((iIl1Ol + " was already registered!").toString());
                    }
                    synchronized (this.I00iOIl) {
/* 14 */                this.I00iOIl.put(iIl1Ol, executor);
/* 23 */                this.I00iiO = O1Oii0O0loo.I000iOII(this.I00iOIl);
                    }
                }

                public final CameraCaptureSession I00000oOI(Oi0Iil oi0Iil) {
/* 1 */             OOoOl1001II oOoOl1001II = OOoOl0i.I00000oIO;
/* 13 */            CameraCaptureSession cameraCaptureSession = (CameraCaptureSession) oi0Iil.I00l0I0l0lO1(oOoOl1001II.I00000oOI(CameraCaptureSession.class));
/* 15 */            if (cameraCaptureSession != null) {
/* 77 */                return cameraCaptureSession;
                    }
/* 29 */            if (((CameraExtensionSession) oi0Iil.I00l0I0l0lO1(oOoOl1001II.I00000oOI(CameraExtensionSession.class))) != null) {
/* 37 */                return (CameraCaptureSession) this.I00iiI.getValue();
                    }
/* 40 */            return null;
                }

                @Override
                public final void I0000Il00O(Oi0Iil oi0Iil, long j, int i, int i2) {
/* 15 */            for (Map.Entry entry : this.I00iiO.entrySet()) {
/* 27 */                IIl1Ol iIl1Ol = (IIl1Ol) entry.getKey();
/* 33 */                Executor executor = (Executor) entry.getValue();
/* 37 */                if (iIl1Ol instanceof IIoIIOi1O) {
/* 39 */                    OOoOl1001II oOoOl1001II = OOoOl0i.I00000oIO;
/* 51 */                    CameraCaptureSession cameraCaptureSession = (CameraCaptureSession) oi0Iil.I00l0I0l0lO1(oOoOl1001II.I00000oOI(CameraCaptureSession.class));
/* 63 */                    CaptureRequest captureRequest = (CaptureRequest) oi0Iil.I00l0I0l0lO1(oOoOl1001II.I00000oOI(CaptureRequest.class));
/* 77 */                    Surface surface = (Surface) oi0Iil.I00IoiI().get(OlOO0I1.I00000oIO(i));
/* 79 */                    if (cameraCaptureSession != null && captureRequest != null && surface != null) {
/* 87 */                        IIl1Ii0i iIl1Ii0i = new IIl1Ii0i();
/* 92 */                        iIl1Ii0i.I00iOIl = (IIoIIOi1O) iIl1Ol;
/* 94 */                        iIl1Ii0i.I00iiI = cameraCaptureSession;
/* 96 */                        iIl1Ii0i.I00iiO = captureRequest;
/* 98 */                        iIl1Ii0i.I00iio = surface;
/* 100 */                       iIl1Ii0i.I00ilI0I1 = j;
/* 102 */                       VarHandle.storeStoreFence();
/* 105 */                       executor.execute(iIl1Ii0i);
                            }
                        }
                    }
                }

                @Override
                public final void I000II(Oi0Iil oi0Iil, long j, long j2) {
/* 15 */            for (Map.Entry entry : this.I00iiO.entrySet()) {
/* 27 */                IIl1Ol iIl1Ol = (IIl1Ol) entry.getKey();
/* 33 */                Executor executor = (Executor) entry.getValue();
/* 37 */                if (iIl1Ol instanceof IIoIIOi1O) {
/* 39 */                    OOoOl1001II oOoOl1001II = OOoOl0i.I00000oIO;
/* 51 */                    CameraCaptureSession cameraCaptureSession = (CameraCaptureSession) oi0Iil.I00l0I0l0lO1(oOoOl1001II.I00000oOI(CameraCaptureSession.class));
/* 63 */                    CaptureRequest captureRequest = (CaptureRequest) oi0Iil.I00l0I0l0lO1(oOoOl1001II.I00000oOI(CaptureRequest.class));
/* 65 */                    if (cameraCaptureSession != null && captureRequest != null) {
/* 72 */                        IIl1I1 iIl1I1 = new IIl1I1(1);
/* 77 */                        iIl1I1.I00iiI = (IIoIIOi1O) iIl1Ol;
/* 79 */                        iIl1I1.I00iiO = cameraCaptureSession;
/* 81 */                        iIl1I1.I00iio = captureRequest;
/* 83 */                        iIl1I1.I00ilI0I1 = j2;
/* 85 */                        iIl1I1.I00ilO0 = j;
/* 87 */                        VarHandle.storeStoreFence();
/* 90 */                        executor.execute(iIl1I1);
                            }
                        }
                    }
                }

                @Override
                public final void I000l1(Oi0Iil oi0Iil, long j) {
/* 15 */            for (Map.Entry entry : this.I00iiO.entrySet()) {
/* 27 */                IIl1Ol iIl1Ol = (IIl1Ol) entry.getKey();
/* 33 */                Executor executor = (Executor) entry.getValue();
/* 37 */                if (iIl1Ol instanceof IIoIIOi1O) {
/* 39 */                    CameraCaptureSession cameraCaptureSessionI00000oOI = I00000oOI(oi0Iil);
/* 55 */                    CaptureRequest captureRequest = (CaptureRequest) oi0Iil.I00l0I0l0lO1(OOoOl0i.I00000oIO.I00000oOI(CaptureRequest.class));
/* 57 */                    if (cameraCaptureSessionI00000oOI != null && captureRequest != null) {
/* 64 */                        IIl1Ill1lo iIl1Ill1lo = new IIl1Ill1lo(0);
/* 69 */                        iIl1Ill1lo.I00iiO = (IIoIIOi1O) iIl1Ol;
/* 71 */                        iIl1Ill1lo.I00iio = cameraCaptureSessionI00000oOI;
/* 73 */                        iIl1Ill1lo.I00iiI = j;
/* 75 */                        VarHandle.storeStoreFence();
/* 78 */                        executor.execute(iIl1Ill1lo);
                            }
                        }
                    }
                }

                @Override
                public final void I00100l0(Oi0Iil oi0Iil) {
/* 15 */            for (Map.Entry entry : this.I00iiO.entrySet()) {
/* 27 */                IIl1Ol iIl1Ol = (IIl1Ol) entry.getKey();
/* 33 */                Executor executor = (Executor) entry.getValue();
/* 37 */                if (iIl1Ol instanceof IIoIIOi1O) {
/* 39 */                    OOoOl1001II oOoOl1001II = OOoOl0i.I00000oIO;
/* 51 */                    CameraCaptureSession cameraCaptureSession = (CameraCaptureSession) oi0Iil.I00l0I0l0lO1(oOoOl1001II.I00000oOI(CameraCaptureSession.class));
/* 63 */                    CaptureRequest captureRequest = (CaptureRequest) oi0Iil.I00l0I0l0lO1(oOoOl1001II.I00000oOI(CaptureRequest.class));
/* 65 */                    if (cameraCaptureSession != null && captureRequest != null) {
/* 72 */                        I0iOo0oioiO i0iOo0oioiO = new I0iOo0oioiO(7);
/* 77 */                        i0iOo0oioiO.I00iiI = (IIoIIOi1O) iIl1Ol;
/* 79 */                        i0iOo0oioiO.I00iiO = cameraCaptureSession;
/* 81 */                        VarHandle.storeStoreFence();
/* 84 */                        executor.execute(i0iOo0oioiO);
                            }
                        } else {
/* 91 */                    IIl1IIoooOl iIl1IIoooOl = new IIl1IIoooOl(1);
/* 94 */                    iIl1IIoooOl.I00iiI = iIl1Ol;
/* 96 */                    iIl1IIoooOl.I00iiO = oi0Iil;
/* 98 */                    VarHandle.storeStoreFence();
/* 101 */                   executor.execute(iIl1IIoooOl);
                        }
                    }
                }

                @Override
                public final void I001i1lo1io(Oi0Iil oi0Iil, long j, long j2) {
/* 15 */            for (Map.Entry entry : this.I00iiO.entrySet()) {
/* 27 */                IIl1Ol iIl1Ol = (IIl1Ol) entry.getKey();
/* 33 */                Executor executor = (Executor) entry.getValue();
/* 38 */                if (iIl1Ol instanceof IIoIIOi1O) {
/* 40 */                    CameraCaptureSession cameraCaptureSessionI00000oOI = I00000oOI(oi0Iil);
/* 56 */                    CaptureRequest captureRequest = (CaptureRequest) oi0Iil.I00l0I0l0lO1(OOoOl0i.I00000oIO.I00000oOI(CaptureRequest.class));
/* 58 */                    if (cameraCaptureSessionI00000oOI != null && captureRequest != null) {
/* 64 */                        IIl1I1 iIl1I1 = new IIl1I1(0);
/* 69 */                        iIl1I1.I00iiI = (IIoIIOi1O) iIl1Ol;
/* 71 */                        iIl1I1.I00iiO = cameraCaptureSessionI00000oOI;
/* 73 */                        iIl1I1.I00iio = captureRequest;
/* 75 */                        iIl1I1.I00ilI0I1 = j2;
/* 77 */                        iIl1I1.I00ilO0 = j;
/* 79 */                        VarHandle.storeStoreFence();
/* 82 */                        executor.execute(iIl1I1);
                            }
                        } else {
/* 88 */                    IIl1IIoooOl iIl1IIoooOl = new IIl1IIoooOl(0);
/* 91 */                    iIl1IIoooOl.I00iiI = iIl1Ol;
/* 93 */                    iIl1IIoooOl.I00iiO = oi0Iil;
/* 95 */                    VarHandle.storeStoreFence();
/* 98 */                    executor.execute(iIl1IIoooOl);
                        }
                    }
                }

                @Override
                public final void I001l0I00(Oi0Iil oi0Iil, int i) {
/* 15 */            for (Map.Entry entry : this.I00iiO.entrySet()) {
/* 27 */                IIl1Ol iIl1Ol = (IIl1Ol) entry.getKey();
/* 33 */                Executor executor = (Executor) entry.getValue();
/* 37 */                if (iIl1Ol instanceof IIoIIOi1O) {
/* 39 */                    OOoOl1001II oOoOl1001II = OOoOl0i.I00000oIO;
/* 51 */                    CameraCaptureSession cameraCaptureSession = (CameraCaptureSession) oi0Iil.I00l0I0l0lO1(oOoOl1001II.I00000oOI(CameraCaptureSession.class));
/* 63 */                    CaptureRequest captureRequest = (CaptureRequest) oi0Iil.I00l0I0l0lO1(oOoOl1001II.I00000oOI(CaptureRequest.class));
/* 75 */                    CaptureResult captureResult = (CaptureResult) oi0Iil.I00l0I0l0lO1(oOoOl1001II.I00000oOI(CaptureResult.class));
/* 77 */                    if (cameraCaptureSession != null && captureRequest != null && captureResult != null) {
/* 86 */                        IIl1IO0O0li1 iIl1IO0O0li1 = new IIl1IO0O0li1(0);
/* 91 */                        iIl1IO0O0li1.I00iiI = (IIoIIOi1O) iIl1Ol;
/* 93 */                        iIl1IO0O0li1.I00iiO = cameraCaptureSession;
/* 95 */                        iIl1IO0O0li1.I00iio = captureRequest;
/* 97 */                        iIl1IO0O0li1.I00ilI0I1 = captureResult;
/* 99 */                        VarHandle.storeStoreFence();
/* 102 */                       executor.execute(iIl1IO0O0li1);
                            }
                        } else {
/* 109 */                   II0OlOll iI0OlOll = new II0OlOll(1);
/* 112 */                   iI0OlOll.I00iiO = iIl1Ol;
/* 114 */                   iI0OlOll.I00iio = oi0Iil;
/* 116 */                   iI0OlOll.I00iiI = i;
/* 118 */                   VarHandle.storeStoreFence();
/* 121 */                   executor.execute(iI0OlOll);
                        }
                    }
                }

                @Override
                public final void I00Io1lO(Oi0Iil oi0Iil, long j, I0oIl0101 i0oIl0101) {
/* 15 */            for (Map.Entry entry : this.I00iiO.entrySet()) {
/* 27 */                IIl1Ol iIl1Ol = (IIl1Ol) entry.getKey();
/* 33 */                Executor executor = (Executor) entry.getValue();
/* 37 */                if (iIl1Ol instanceof IIoIIOi1O) {
/* 39 */                    OOoOl1001II oOoOl1001II = OOoOl0i.I00000oIO;
/* 51 */                    CameraCaptureSession cameraCaptureSession = (CameraCaptureSession) oi0Iil.I00l0I0l0lO1(oOoOl1001II.I00000oOI(CameraCaptureSession.class));
/* 63 */                    CaptureRequest captureRequest = (CaptureRequest) oi0Iil.I00l0I0l0lO1(oOoOl1001II.I00000oOI(CaptureRequest.class));
/* 75 */                    CaptureResult captureResult = (CaptureResult) i0oIl0101.I00l0I0l0lO1(oOoOl1001II.I00000oOI(CaptureResult.class));
/* 77 */                    if (cameraCaptureSession != null && captureRequest != null && captureResult != null) {
/* 86 */                        IIl1IO0O0li1 iIl1IO0O0li1 = new IIl1IO0O0li1(1);
/* 91 */                        iIl1IO0O0li1.I00iiI = (IIoIIOi1O) iIl1Ol;
/* 93 */                        iIl1IO0O0li1.I00iiO = cameraCaptureSession;
/* 95 */                        iIl1IO0O0li1.I00iio = captureRequest;
/* 97 */                        iIl1IO0O0li1.I00ilI0I1 = captureResult;
/* 99 */                        VarHandle.storeStoreFence();
/* 102 */                       executor.execute(iIl1IO0O0li1);
                            }
                        }
                    }
                }

                @Override
                public final void I00IoiI(Oi0Iil oi0Iil, long j, Oi0I000 oi0I000) {
/* 15 */            for (Map.Entry entry : this.I00iiO.entrySet()) {
/* 27 */                IIl1Ol iIl1Ol = (IIl1Ol) entry.getKey();
/* 33 */                Executor executor = (Executor) entry.getValue();
/* 37 */                if (iIl1Ol instanceof IIoIIOi1O) {
/* 39 */                    CameraCaptureSession cameraCaptureSessionI00000oOI = I00000oOI(oi0Iil);
/* 43 */                    OOoOl1001II oOoOl1001II = OOoOl0i.I00000oIO;
/* 55 */                    CaptureRequest captureRequest = (CaptureRequest) oi0Iil.I00l0I0l0lO1(oOoOl1001II.I00000oOI(CaptureRequest.class));
/* 67 */                    CaptureFailure captureFailure = (CaptureFailure) oi0I000.I00l0I0l0lO1(oOoOl1001II.I00000oOI(CaptureFailure.class));
/* 69 */                    if (cameraCaptureSessionI00000oOI != null && captureRequest != null && captureFailure != null) {
/* 78 */                        IIl1IO iIl1IO = new IIl1IO(1);
/* 83 */                        iIl1IO.I00iiI = (IIoIIOi1O) iIl1Ol;
/* 85 */                        iIl1IO.I00iiO = cameraCaptureSessionI00000oOI;
/* 87 */                        iIl1IO.I00iio = captureRequest;
/* 89 */                        iIl1IO.I00ilI0I1 = captureFailure;
/* 91 */                        VarHandle.storeStoreFence();
/* 94 */                        executor.execute(iIl1IO);
                            }
                        } else {
/* 102 */                   lo1iloiI1 lo1iloii1 = new lo1iloiI1(9);
/* 108 */                   I00ioIO i00ioIO = new I00ioIO(3);
/* 111 */                   i00ioIO.I00iiI = iIl1Ol;
/* 113 */                   i00ioIO.I00iiO = oi0Iil;
/* 115 */                   i00ioIO.I00iio = lo1iloii1;
/* 117 */                   VarHandle.storeStoreFence();
/* 120 */                   executor.execute(i00ioIO);
                        }
                    }
                }

                @Override
                public final void I00OIl(Oi0Iil oi0Iil, long j, I0oIili1iI i0oIili1iI) {
/* 15 */            for (Map.Entry entry : this.I00iiO.entrySet()) {
/* 27 */                IIl1Ol iIl1Ol = (IIl1Ol) entry.getKey();
/* 33 */                Executor executor = (Executor) entry.getValue();
/* 37 */                if (iIl1Ol instanceof IIoIIOi1O) {
/* 39 */                    CameraCaptureSession cameraCaptureSessionI00000oOI = I00000oOI(oi0Iil);
/* 43 */                    OOoOl1001II oOoOl1001II = OOoOl0i.I00000oIO;
/* 55 */                    CaptureRequest captureRequest = (CaptureRequest) oi0Iil.I00l0I0l0lO1(oOoOl1001II.I00000oOI(CaptureRequest.class));
/* 67 */                    TotalCaptureResult totalCaptureResult = (TotalCaptureResult) i0oIili1iI.I00l0I0l0lO1(oOoOl1001II.I00000oOI(TotalCaptureResult.class));
/* 69 */                    if (cameraCaptureSessionI00000oOI != null && captureRequest != null && totalCaptureResult != null) {
/* 78 */                        IIl1IO iIl1IO = new IIl1IO(0);
/* 83 */                        iIl1IO.I00iiI = (IIoIIOi1O) iIl1Ol;
/* 85 */                        iIl1IO.I00iiO = cameraCaptureSessionI00000oOI;
/* 87 */                        iIl1IO.I00iio = captureRequest;
/* 89 */                        iIl1IO.I00ilI0I1 = totalCaptureResult;
/* 91 */                        VarHandle.storeStoreFence();
/* 94 */                        executor.execute(iIl1IO);
                            }
                        } else {
/* 100 */                   IO01oO iO01oO = new IO01oO(oi0Iil, i0oIili1iI);
/* 106 */                   I00ioIO i00ioIO = new I00ioIO(2);
/* 109 */                   i00ioIO.I00iiI = iIl1Ol;
/* 111 */                   i00ioIO.I00iiO = oi0Iil;
/* 113 */                   i00ioIO.I00iio = iO01oO;
/* 115 */                   VarHandle.storeStoreFence();
/* 118 */                   executor.execute(i00ioIO);
                        }
                    }
                }

                @Override
                public final void I00OOll1(Oi01iIoI oi01iIoI) {
/* 15 */            for (Map.Entry entry : this.I00iiO.entrySet()) {
/* 27 */                IIl1Ol iIl1Ol = (IIl1Ol) entry.getKey();
/* 33 */                Executor executor = (Executor) entry.getValue();
/* 39 */                Object obj = oi01iIoI.I0000Il00O.get(Olo10o10.I00000oIO);
/* 51 */                Olo0o1II0 olo0o1II0 = obj instanceof Olo0o1II0 ? (Olo0o1II0) obj : null;
/* 63 */                Object obj2 = olo0o1II0 != null ? olo0o1II0.I00000oIO.get("CAPTURE_CONFIG_ID_KEY") : null;
/* 69 */                Integer num = obj2 instanceof Integer ? (Integer) obj2 : null;
/* 78 */                int iIntValue = num != null ? num.intValue() : -1;
/* 82 */                I1010Iil i1010Iil = new I1010Iil(2);
/* 85 */                i1010Iil.I00iiO = iIl1Ol;
/* 87 */                i1010Iil.I00iiI = iIntValue;
/* 89 */                VarHandle.storeStoreFence();
/* 92 */                executor.execute(i1010Iil);
                    }
                }
            }

            package p000;

            import android.hardware.camera2.CameraAccessException;
            import android.hardware.camera2.CameraCaptureSession;
            import android.hardware.camera2.CameraExtensionSession;
            import android.hardware.camera2.CaptureRequest;
            import android.util.Log;
            import android.view.Surface;
            import java.util.ArrayList;
            import java.util.HashMap;
            import java.util.Iterator;
            import java.util.List;
            
            public final class I0lIl0ol1IO implements IIlIIOi, OoilIiI0oi, AutoCloseable {
                public I0lIi00oO I00iOIl;
                public CameraExtensionSession I00iiI;
                public IIl0l10l I00iiO;
                public II0l011 I00iio;
                public I1OooI1 I00ilI0I1;
                public HashMap I00ilO0;

                @Override
                public final Integer I00IO1(CaptureRequest captureRequest, CameraCaptureSession.CaptureCallback captureCallback) throws Exception {
/* 3 */             String str = this.I00iOIl.I00iiO;
/* 5 */             IIl0l10l iIl0l10l = this.I00iiO;
                    try {
/* 22 */                return Integer.valueOf(this.I00iiI.capture(captureRequest, this.I00iio, new I0lIl0l1011o(this, (IIl0001i1o01) captureCallback)));
                    } catch (Exception e) {
/* 30 */                int i = 0;
/* 33 */                if (!(e instanceof CameraAccessException)) {
/* 110 */                   if (!(e instanceof IllegalArgumentException) && !(e instanceof SecurityException) && !(e instanceof UnsupportedOperationException) && !(e instanceof NullPointerException)) {
/* 127 */                       if (e instanceof IllegalStateException) {
/* 157 */                           return null;
                                }
/* 130 */                       throw e;
                            }
/* 149 */                   Log.w("CXCP", "Failed to execute call: Unexpected exception: " + e.getMessage());
/* 154 */                   iIl0l10l.I00000oIO(false, str, 9);
/* 157 */                   return null;
                        }
/* 53 */                Log.w("CXCP", "Failed to execute call: Camera encountered an error: " + e.getMessage());
/* 56 */                CameraAccessException cameraAccessException = (CameraAccessException) e;
/* 58 */                int reason = cameraAccessException.getReason();
/* 64 */                if (reason == 1) {
/* 103 */                   i = 3;
                        } else if (reason == 2) {
/* 101 */                   i = 6;
                        } else if (reason != 3) {
/* 72 */                    if (reason == 4) {
/* 99 */                        i = 1;
                            } else if (reason != 5) {
/* 91 */                        Log.w("CXCP", "Unexpected CameraAccessException: " + cameraAccessException);
/* 94 */                        i = 11;
                            } else {
/* 97 */                        i = 2;
                            }
                        }
/* 104 */               iIl0l10l.I00000oIO(true, str, i);
/* 157 */               return null;
                    }
                }

                @Override
                public final boolean I00OIo() {
/* 1 */             return false;
                }

                @Override
                public final IIlOl1oOlo1o I00Ol10() {
/* 1 */             return this.I00iOIl;
                }

                @Override
                public final boolean I00iiO(List list) {
/* 5 */             Log.w("CXCP", "CameraExtensionSession does not support finalizeOutputConfigurations()");
/* 8 */             return false;
                }

                @Override
                public final boolean I00ilI0I1() throws Exception {
                    OoiIlOl1iI ooiIlOl1iI;
/* 3 */             String str = this.I00iOIl.I00iiO;
/* 5 */             IIl0l10l iIl0l10l = this.I00iiO;
                    try {
/* 11 */                this.I00iiI.stopRepeating();
/* 14 */                ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
                    } catch (Exception e) {
/* 24 */                if (e instanceof CameraAccessException) {
/* 44 */                    Log.w("CXCP", "Failed to execute call: Camera encountered an error: " + e.getMessage());
/* 47 */                    CameraAccessException cameraAccessException = (CameraAccessException) e;
/* 49 */                    int reason = cameraAccessException.getReason();
/* 53 */                    int i = 3;
/* 54 */                    if (reason != 1) {
/* 57 */                        if (reason == 2) {
/* 93 */                            i = 6;
                                } else if (reason == 3) {
/* 91 */                            i = 0;
                                } else if (reason == 4) {
/* 89 */                            i = 1;
                                } else if (reason != 5) {
/* 81 */                            Log.w("CXCP", "Unexpected CameraAccessException: " + cameraAccessException);
/* 84 */                            i = 11;
                                } else {
/* 87 */                            i = 2;
                                }
                            }
/* 94 */                    iIl0l10l.I00000oIO(true, str, i);
                        } else if ((e instanceof IllegalArgumentException) || (e instanceof SecurityException) || (e instanceof UnsupportedOperationException) || (e instanceof NullPointerException)) {
/* 140 */                   Log.w("CXCP", "Failed to execute call: Unexpected exception: " + e.getMessage());
/* 145 */                   iIl0l10l.I00000oIO(false, str, 9);
                        } else if (!(e instanceof IllegalStateException)) {
/* 121 */                   throw e;
                        }
/* 97 */                ooiIlOl1iI = null;
                    }
                    return ooiIlOl1iI != null;
                }

                @Override
                public final Object I00l0I0l0lO1(O0IOli0o0 o0IOli0o0) {
/* 13 */            if (o0IOli0o0.equals(OOoOl0i.I00000oIO.I00000oOI(CameraExtensionSession.class))) {
/* 15 */                return this.I00iiI;
                    }
/* 18 */            return null;
                }

                @Override
                public final Integer I00oI0i(ArrayList arrayList, CameraCaptureSession.CaptureCallback captureCallback) {
/* 6 */             if (arrayList.size() == 1) {
/* 14 */                return I00oO101o((CaptureRequest) IOOi0Ool1i.I00OilO00Il(arrayList), captureCallback);
                    }
/* 21 */            I000II.I001IO000("CameraExtensionSession does not support setRepeatingBurst for more than oneCaptureRequest");
/* 24 */            return null;
                }

                @Override
                public final Integer I00oO101o(CaptureRequest captureRequest, CameraCaptureSession.CaptureCallback captureCallback) throws Exception {
/* 3 */             String str = this.I00iOIl.I00iiO;
/* 5 */             IIl0l10l iIl0l10l = this.I00iiO;
                    try {
/* 22 */                return Integer.valueOf(this.I00iiI.setRepeatingRequest(captureRequest, this.I00iio, new I0lIl0l1011o(this, (IIl0001i1o01) captureCallback)));
                    } catch (Exception e) {
/* 30 */                int i = 0;
/* 33 */                if (!(e instanceof CameraAccessException)) {
/* 110 */                   if (!(e instanceof IllegalArgumentException) && !(e instanceof SecurityException) && !(e instanceof UnsupportedOperationException) && !(e instanceof NullPointerException)) {
/* 127 */                       if (e instanceof IllegalStateException) {
/* 157 */                           return null;
                                }
/* 130 */                       throw e;
                            }
/* 149 */                   Log.w("CXCP", "Failed to execute call: Unexpected exception: " + e.getMessage());
/* 154 */                   iIl0l10l.I00000oIO(false, str, 9);
/* 157 */                   return null;
                        }
/* 53 */                Log.w("CXCP", "Failed to execute call: Camera encountered an error: " + e.getMessage());
/* 56 */                CameraAccessException cameraAccessException = (CameraAccessException) e;
/* 58 */                int reason = cameraAccessException.getReason();
/* 64 */                if (reason == 1) {
/* 103 */                   i = 3;
                        } else if (reason == 2) {
/* 101 */                   i = 6;
                        } else if (reason != 3) {
/* 72 */                    if (reason == 4) {
/* 99 */                        i = 1;
                            } else if (reason != 5) {
/* 91 */                        Log.w("CXCP", "Unexpected CameraAccessException: " + cameraAccessException);
/* 94 */                        i = 11;
                            } else {
/* 97 */                        i = 2;
                            }
                        }
/* 104 */               iIl0l10l.I00000oIO(true, str, i);
/* 157 */               return null;
                    }
                }

                @Override
                public final Integer I00oOio10iI1(ArrayList arrayList, CameraCaptureSession.CaptureCallback captureCallback) throws Exception {
/* 1 */             Iterator it = arrayList.iterator();
/* 9 */             while (it.hasNext()) {
/* 17 */                I00IO1((CaptureRequest) it.next(), captureCallback);
                    }
/* 21 */            return null;
                }

                @Override
                public final void close() throws CameraAccessException {
/* 3 */             this.I00iiI.close();
                }

                @Override
                public final Surface getInputSurface() {
/* 1 */             return null;
                }
            }

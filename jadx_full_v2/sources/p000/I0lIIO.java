            package p000;

            import android.hardware.camera2.CameraAccessException;
            import android.hardware.camera2.CameraCaptureSession;
            import android.hardware.camera2.CaptureRequest;
            import android.hardware.camera2.params.OutputConfiguration;
            import android.os.Handler;
            import android.os.SystemClock;
            import android.os.Trace;
            import android.util.Log;
            import android.view.Surface;
            import java.util.ArrayList;
            import java.util.Arrays;
            import java.util.Iterator;
            import java.util.List;
            
            public class I0lIIO implements IIlIIOi {
                public final I0lIi00oO I00iOIl;
                public final CameraCaptureSession I00iiI;
                public final IIl0l10l I00iiO;
                public final Handler I00iio;

                public I0lIIO(I0lIi00oO i0lIi00oO, CameraCaptureSession cameraCaptureSession, IIl0l10l iIl0l10l, Handler handler) {
/* 4 */             this.I00iOIl = i0lIi00oO;
/* 6 */             this.I00iiI = cameraCaptureSession;
/* 8 */             this.I00iiO = iIl0l10l;
/* 10 */            this.I00iio = handler;
/* 12 */            I1OollilIo i1OollilIo = IIllol.I00000oIO;
/* 14 */            i1OollilIo.getClass();
/* 19 */            I1OollilIo.I00000oOI.incrementAndGet(i1OollilIo);
                }

                @Override
                public final Integer I00IO1(CaptureRequest captureRequest, CameraCaptureSession.CaptureCallback captureCallback) {
                    Integer numValueOf;
/* 11 */            StringBuilder sb = new StringBuilder("CXCP#capture-");
/* 16 */            String str = this.I00iOIl.I00iiO;
/* 18 */            sb.append(str);
/* 21 */            String string = sb.toString();
/* 25 */            long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
                    try {
/* 36 */                Trace.beginSection(string);
/* 39 */                IIl0l10l iIl0l10l = this.I00iiO;
                        try {
/* 49 */                    numValueOf = Integer.valueOf(this.I00iiI.capture(captureRequest, captureCallback, this.I00iio));
                        } catch (Exception e) {
/* 61 */                    int i = 0;
/* 64 */                    if (e instanceof CameraAccessException) {
/* 82 */                        Log.w("CXCP", "Failed to execute call: Camera encountered an error: " + e.getMessage());
/* 85 */                        CameraAccessException cameraAccessException = (CameraAccessException) e;
/* 87 */                        int reason = cameraAccessException.getReason();
/* 92 */                        if (reason == 1) {
/* 131 */                           i = 3;
                                } else if (reason == 2) {
/* 129 */                           i = 6;
                                } else if (reason != 3) {
/* 100 */                           if (reason == 4) {
/* 127 */                               i = 1;
                                    } else if (reason != 5) {
/* 119 */                               Log.w("CXCP", "Unexpected CameraAccessException: " + cameraAccessException);
/* 122 */                               i = 11;
                                    } else {
/* 125 */                               i = 2;
                                    }
                                }
/* 132 */                       iIl0l10l.I00000oIO(true, str, i);
                            } else if ((e instanceof IllegalArgumentException) || (e instanceof SecurityException) || (e instanceof UnsupportedOperationException) || (e instanceof NullPointerException)) {
/* 176 */                       Log.w("CXCP", "Failed to execute call: Unexpected exception: " + e.getMessage());
/* 181 */                       iIl0l10l.I00000oIO(false, str, 9);
                            } else if (!(e instanceof IllegalStateException)) {
/* 159 */                       throw e;
                            }
/* 135 */                   numValueOf = null;
                        }
/* 206 */               return numValueOf;
                    } finally {
/* 225 */               String.format(null, "%.3f ms", Arrays.copyOf(new Object[]{Double.valueOf(IIlIOloOOO.I0000oI00(jElapsedRealtimeNanos) / 1000000.0d)}, 1));
                    }
                }

                @Override
                public final boolean I00OIo() {
                    OoiIlOl1iI ooiIlOl1iI;
/* 11 */            StringBuilder sb = new StringBuilder("CXCP#abortCaptures-");
/* 16 */            String str = this.I00iOIl.I00iiO;
/* 18 */            sb.append(str);
/* 21 */            String string = sb.toString();
/* 25 */            long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
                    try {
/* 36 */                Trace.beginSection(string);
/* 39 */                IIl0l10l iIl0l10l = this.I00iiO;
                        try {
/* 44 */                    this.I00iiI.abortCaptures();
/* 47 */                    ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
                        } catch (Exception e) {
/* 59 */                    if (e instanceof CameraAccessException) {
/* 77 */                        Log.w("CXCP", "Failed to execute call: Camera encountered an error: " + e.getMessage());
/* 80 */                        CameraAccessException cameraAccessException = (CameraAccessException) e;
/* 82 */                        int reason = cameraAccessException.getReason();
/* 86 */                        int i = 3;
/* 87 */                        if (reason != 1) {
/* 90 */                            if (reason == 2) {
/* 126 */                               i = 6;
                                    } else if (reason == 3) {
/* 124 */                               i = 0;
                                    } else if (reason == 4) {
/* 122 */                               i = 1;
                                    } else if (reason != 5) {
/* 114 */                               Log.w("CXCP", "Unexpected CameraAccessException: " + cameraAccessException);
/* 117 */                               i = 11;
                                    } else {
/* 120 */                               i = 2;
                                    }
                                }
/* 127 */                       iIl0l10l.I00000oIO(true, str, i);
                            } else if ((e instanceof IllegalArgumentException) || (e instanceof SecurityException) || (e instanceof UnsupportedOperationException) || (e instanceof NullPointerException)) {
/* 171 */                       Log.w("CXCP", "Failed to execute call: Unexpected exception: " + e.getMessage());
/* 176 */                       iIl0l10l.I00000oIO(false, str, 9);
                            } else if (!(e instanceof IllegalStateException)) {
/* 154 */                       throw e;
                            }
/* 130 */                   ooiIlOl1iI = null;
                        }
                        return ooiIlOl1iI != null;
                    } finally {
/* 224 */               String.format(null, "%.3f ms", Arrays.copyOf(new Object[]{Double.valueOf(IIlIOloOOO.I0000oI00(jElapsedRealtimeNanos) / 1000000.0d)}, 1));
                    }
                }

                @Override
                public final IIlOl1oOlo1o I00Ol10() {
/* 1 */             return this.I00iOIl;
                }

                @Override
                public final boolean I00iiO(List list) {
                    OoiIlOl1iI ooiIlOl1iI;
/* 7 */             StringBuilder sb = new StringBuilder("CXCP#finalizeOutputConfigurations-");
/* 12 */            String str = this.I00iOIl.I00iiO;
/* 14 */            sb.append(str);
/* 17 */            String string = sb.toString();
/* 21 */            long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
                    try {
/* 32 */                Trace.beginSection(string);
/* 35 */                IIl0l10l iIl0l10l = this.I00iiO;
                        try {
/* 38 */                    CameraCaptureSession cameraCaptureSession = this.I00iiI;
/* 40 */                    List list2 = list;
/* 50 */                    ArrayList arrayList = new ArrayList(IOOi1I.I0000O(list2, 10));
/* 53 */                    Iterator it = list2.iterator();
/* 61 */                    while (it.hasNext()) {
/* 83 */                        arrayList.add((OutputConfiguration) ((I0oiIOi00lo1) it.next()).I00l0I0l0lO1(OOoOl0i.I00000oIO.I00000oOI(OutputConfiguration.class)));
                            }
/* 92 */                    cameraCaptureSession.finalizeOutputConfigurations(arrayList);
/* 95 */                    ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
                        } catch (Exception e) {
/* 103 */                   if (e instanceof CameraAccessException) {
/* 126 */                       Log.w("CXCP", "Failed to execute call: Camera encountered an error: " + e.getMessage());
/* 129 */                       CameraAccessException cameraAccessException = (CameraAccessException) e;
/* 131 */                       int reason = cameraAccessException.getReason();
/* 135 */                       int i = 3;
/* 136 */                       if (reason != 1) {
/* 139 */                           if (reason == 2) {
/* 175 */                               i = 6;
                                    } else if (reason == 3) {
/* 173 */                               i = 0;
                                    } else if (reason == 4) {
/* 171 */                               i = 1;
                                    } else if (reason != 5) {
/* 163 */                               Log.w("CXCP", "Unexpected CameraAccessException: " + cameraAccessException);
/* 166 */                               i = 11;
                                    } else {
/* 169 */                               i = 2;
                                    }
                                }
/* 176 */                       iIl0l10l.I00000oIO(true, str, i);
                            } else if ((e instanceof IllegalArgumentException) || (e instanceof SecurityException) || (e instanceof UnsupportedOperationException) || (e instanceof NullPointerException)) {
/* 225 */                       Log.w("CXCP", "Failed to execute call: Unexpected exception: " + e.getMessage());
/* 230 */                       iIl0l10l.I00000oIO(false, str, 9);
                            } else if (!(e instanceof IllegalStateException)) {
/* 203 */                       throw e;
                            }
/* 179 */                   ooiIlOl1iI = null;
                        }
/* 252 */               String.format(null, "%.3f ms", Arrays.copyOf(new Object[]{Double.valueOf(IIlIOloOOO.I0000oI00(jElapsedRealtimeNanos) / 1000000.0d)}, 1));
                        return ooiIlOl1iI != null;
                    } catch (Throwable th) {
/* 278 */               String.format(null, "%.3f ms", Arrays.copyOf(new Object[]{Double.valueOf(IIlIOloOOO.I0000oI00(jElapsedRealtimeNanos) / 1000000.0d)}, 1));
/* 437 */               throw th;
                    }
                }

                @Override
                public final boolean I00ilI0I1() {
                    OoiIlOl1iI ooiIlOl1iI;
/* 11 */            StringBuilder sb = new StringBuilder("CXCP#stopRepeating-");
/* 16 */            String str = this.I00iOIl.I00iiO;
/* 18 */            sb.append(str);
/* 21 */            String string = sb.toString();
/* 25 */            long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
                    try {
/* 36 */                Trace.beginSection(string);
/* 39 */                IIl0l10l iIl0l10l = this.I00iiO;
                        try {
/* 44 */                    this.I00iiI.stopRepeating();
/* 47 */                    ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
                        } catch (Exception e) {
/* 59 */                    if (e instanceof CameraAccessException) {
/* 77 */                        Log.w("CXCP", "Failed to execute call: Camera encountered an error: " + e.getMessage());
/* 80 */                        CameraAccessException cameraAccessException = (CameraAccessException) e;
/* 82 */                        int reason = cameraAccessException.getReason();
/* 86 */                        int i = 3;
/* 87 */                        if (reason != 1) {
/* 90 */                            if (reason == 2) {
/* 126 */                               i = 6;
                                    } else if (reason == 3) {
/* 124 */                               i = 0;
                                    } else if (reason == 4) {
/* 122 */                               i = 1;
                                    } else if (reason != 5) {
/* 114 */                               Log.w("CXCP", "Unexpected CameraAccessException: " + cameraAccessException);
/* 117 */                               i = 11;
                                    } else {
/* 120 */                               i = 2;
                                    }
                                }
/* 127 */                       iIl0l10l.I00000oIO(true, str, i);
                            } else if ((e instanceof IllegalArgumentException) || (e instanceof SecurityException) || (e instanceof UnsupportedOperationException) || (e instanceof NullPointerException)) {
/* 171 */                       Log.w("CXCP", "Failed to execute call: Unexpected exception: " + e.getMessage());
/* 176 */                       iIl0l10l.I00000oIO(false, str, 9);
                            } else if (!(e instanceof IllegalStateException)) {
/* 154 */                       throw e;
                            }
/* 130 */                   ooiIlOl1iI = null;
                        }
                        return ooiIlOl1iI != null;
                    } finally {
/* 224 */               String.format(null, "%.3f ms", Arrays.copyOf(new Object[]{Double.valueOf(IIlIOloOOO.I0000oI00(jElapsedRealtimeNanos) / 1000000.0d)}, 1));
                    }
                }

                @Override
                public Object I00l0I0l0lO1(O0IOli0o0 o0IOli0o0) {
/* 13 */            if (o0IOli0o0.equals(OOoOl0i.I00000oIO.I00000oOI(CameraCaptureSession.class))) {
/* 15 */                return this.I00iiI;
                    }
/* 18 */            return null;
                }

                @Override
                public final Integer I00oI0i(ArrayList arrayList, CameraCaptureSession.CaptureCallback captureCallback) {
                    Integer numValueOf;
/* 11 */            StringBuilder sb = new StringBuilder("CXCP#setRepeatingBurst-");
/* 16 */            String str = this.I00iOIl.I00iiO;
/* 18 */            sb.append(str);
/* 21 */            String string = sb.toString();
/* 25 */            long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
                    try {
/* 36 */                Trace.beginSection(string);
/* 39 */                IIl0l10l iIl0l10l = this.I00iiO;
                        try {
/* 49 */                    numValueOf = Integer.valueOf(this.I00iiI.setRepeatingBurst(arrayList, captureCallback, this.I00iio));
                        } catch (Exception e) {
/* 61 */                    int i = 0;
/* 64 */                    if (e instanceof CameraAccessException) {
/* 82 */                        Log.w("CXCP", "Failed to execute call: Camera encountered an error: " + e.getMessage());
/* 85 */                        CameraAccessException cameraAccessException = (CameraAccessException) e;
/* 87 */                        int reason = cameraAccessException.getReason();
/* 92 */                        if (reason == 1) {
/* 131 */                           i = 3;
                                } else if (reason == 2) {
/* 129 */                           i = 6;
                                } else if (reason != 3) {
/* 100 */                           if (reason == 4) {
/* 127 */                               i = 1;
                                    } else if (reason != 5) {
/* 119 */                               Log.w("CXCP", "Unexpected CameraAccessException: " + cameraAccessException);
/* 122 */                               i = 11;
                                    } else {
/* 125 */                               i = 2;
                                    }
                                }
/* 132 */                       iIl0l10l.I00000oIO(true, str, i);
                            } else if ((e instanceof IllegalArgumentException) || (e instanceof SecurityException) || (e instanceof UnsupportedOperationException) || (e instanceof NullPointerException)) {
/* 176 */                       Log.w("CXCP", "Failed to execute call: Unexpected exception: " + e.getMessage());
/* 181 */                       iIl0l10l.I00000oIO(false, str, 9);
                            } else if (!(e instanceof IllegalStateException)) {
/* 159 */                       throw e;
                            }
/* 135 */                   numValueOf = null;
                        }
/* 206 */               return numValueOf;
                    } finally {
/* 225 */               String.format(null, "%.3f ms", Arrays.copyOf(new Object[]{Double.valueOf(IIlIOloOOO.I0000oI00(jElapsedRealtimeNanos) / 1000000.0d)}, 1));
                    }
                }

                @Override
                public final Integer I00oO101o(CaptureRequest captureRequest, CameraCaptureSession.CaptureCallback captureCallback) {
                    Integer numValueOf;
/* 11 */            StringBuilder sb = new StringBuilder("CXCP#setRepeatingRequest-");
/* 16 */            String str = this.I00iOIl.I00iiO;
/* 18 */            sb.append(str);
/* 21 */            String string = sb.toString();
/* 25 */            long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
                    try {
/* 36 */                Trace.beginSection(string);
/* 39 */                IIl0l10l iIl0l10l = this.I00iiO;
                        try {
/* 49 */                    numValueOf = Integer.valueOf(this.I00iiI.setRepeatingRequest(captureRequest, captureCallback, this.I00iio));
                        } catch (Exception e) {
/* 61 */                    int i = 0;
/* 64 */                    if (e instanceof CameraAccessException) {
/* 82 */                        Log.w("CXCP", "Failed to execute call: Camera encountered an error: " + e.getMessage());
/* 85 */                        CameraAccessException cameraAccessException = (CameraAccessException) e;
/* 87 */                        int reason = cameraAccessException.getReason();
/* 92 */                        if (reason == 1) {
/* 131 */                           i = 3;
                                } else if (reason == 2) {
/* 129 */                           i = 6;
                                } else if (reason != 3) {
/* 100 */                           if (reason == 4) {
/* 127 */                               i = 1;
                                    } else if (reason != 5) {
/* 119 */                               Log.w("CXCP", "Unexpected CameraAccessException: " + cameraAccessException);
/* 122 */                               i = 11;
                                    } else {
/* 125 */                               i = 2;
                                    }
                                }
/* 132 */                       iIl0l10l.I00000oIO(true, str, i);
                            } else if ((e instanceof IllegalArgumentException) || (e instanceof SecurityException) || (e instanceof UnsupportedOperationException) || (e instanceof NullPointerException)) {
/* 176 */                       Log.w("CXCP", "Failed to execute call: Unexpected exception: " + e.getMessage());
/* 181 */                       iIl0l10l.I00000oIO(false, str, 9);
                            } else if (!(e instanceof IllegalStateException)) {
/* 159 */                       throw e;
                            }
/* 135 */                   numValueOf = null;
                        }
/* 206 */               return numValueOf;
                    } finally {
/* 225 */               String.format(null, "%.3f ms", Arrays.copyOf(new Object[]{Double.valueOf(IIlIOloOOO.I0000oI00(jElapsedRealtimeNanos) / 1000000.0d)}, 1));
                    }
                }

                @Override
                public final Integer I00oOio10iI1(ArrayList arrayList, CameraCaptureSession.CaptureCallback captureCallback) {
                    Integer numValueOf;
/* 11 */            StringBuilder sb = new StringBuilder("CXCP#captureBurst-");
/* 16 */            String str = this.I00iOIl.I00iiO;
/* 18 */            sb.append(str);
/* 21 */            String string = sb.toString();
/* 25 */            long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
                    try {
/* 36 */                Trace.beginSection(string);
/* 39 */                IIl0l10l iIl0l10l = this.I00iiO;
                        try {
/* 49 */                    numValueOf = Integer.valueOf(this.I00iiI.captureBurst(arrayList, captureCallback, this.I00iio));
                        } catch (Exception e) {
/* 61 */                    int i = 0;
/* 64 */                    if (e instanceof CameraAccessException) {
/* 82 */                        Log.w("CXCP", "Failed to execute call: Camera encountered an error: " + e.getMessage());
/* 85 */                        CameraAccessException cameraAccessException = (CameraAccessException) e;
/* 87 */                        int reason = cameraAccessException.getReason();
/* 92 */                        if (reason == 1) {
/* 131 */                           i = 3;
                                } else if (reason == 2) {
/* 129 */                           i = 6;
                                } else if (reason != 3) {
/* 100 */                           if (reason == 4) {
/* 127 */                               i = 1;
                                    } else if (reason != 5) {
/* 119 */                               Log.w("CXCP", "Unexpected CameraAccessException: " + cameraAccessException);
/* 122 */                               i = 11;
                                    } else {
/* 125 */                               i = 2;
                                    }
                                }
/* 132 */                       iIl0l10l.I00000oIO(true, str, i);
                            } else if ((e instanceof IllegalArgumentException) || (e instanceof SecurityException) || (e instanceof UnsupportedOperationException) || (e instanceof NullPointerException)) {
/* 176 */                       Log.w("CXCP", "Failed to execute call: Unexpected exception: " + e.getMessage());
/* 181 */                       iIl0l10l.I00000oIO(false, str, 9);
                            } else if (!(e instanceof IllegalStateException)) {
/* 159 */                       throw e;
                            }
/* 135 */                   numValueOf = null;
                        }
/* 206 */               return numValueOf;
                    } finally {
/* 225 */               String.format(null, "%.3f ms", Arrays.copyOf(new Object[]{Double.valueOf(IIlIOloOOO.I0000oI00(jElapsedRealtimeNanos) / 1000000.0d)}, 1));
                    }
                }

                @Override
                public final void close() {
/* 3 */             this.I00iiI.close();
                }

                @Override
                public final Surface getInputSurface() {
/* 3 */             return this.I00iiI.getInputSurface();
                }
            }

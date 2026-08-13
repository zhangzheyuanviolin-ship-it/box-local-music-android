            package p000;

            import android.hardware.camera2.CameraAccessException;
            import android.hardware.camera2.CameraDevice;
            import android.hardware.camera2.CaptureRequest;
            import android.hardware.camera2.TotalCaptureResult;
            import android.hardware.camera2.params.ExtensionSessionConfiguration;
            import android.hardware.camera2.params.InputConfiguration;
            import android.hardware.camera2.params.OutputConfiguration;
            import android.hardware.camera2.params.SessionConfiguration;
            import android.os.SystemClock;
            import android.os.Trace;
            import android.util.Log;
            import java.util.ArrayList;
            import java.util.Arrays;
            import java.util.Iterator;
            import java.util.List;
            import java.util.Locale;
            import java.util.Map;
            import java.util.Set;
            
            public final class I0lIi00oO implements IIlOl1oOlo1o {
                public IIlo0i0ll I00iOIl;
                public CameraDevice I00iiI;
                public String I00iiO;
                public IIl0l10l I00iio;
                public I1I0i0Ilo1Oi I00ilI0I1;
                public Oo10IliO00O I00ilO0;
                public I1Ool1IoO110 I00io1l;
                public I1OooIoiIO I00ioIO;

                public final OIoi0IIoi I00000oIO(Oiloill1 oiloill1) {
/* 7 */             if (this.I00io1l.I00000oOI()) {
/* 9 */                 I0000O(oiloill1);
/* 17 */                return new OIoi0IIoi(Boolean.FALSE, null);
                    }
/* 33 */            return new OIoi0IIoi(Boolean.TRUE, I1OooIoiIO.I00000oOI.getAndSet(this.I00ioIO, oiloill1));
                }

                public final void I00000oOI(Oiloill1 oiloill1) {
                    try {
/* 18 */                Trace.beginSection(this + "#onSessionDisconnected");
/* 21 */                oiloill1.I00000oOI();
                    } finally {
/* 29 */                Trace.endSection();
                    }
                }

                public final void I0000O(Oiloill1 oiloill1) {
                    try {
/* 18 */                Trace.beginSection(this + "#onSessionFinalized");
/* 21 */                oiloill1.I00000oIO();
                    } finally {
/* 29 */                Trace.endSection();
                    }
                }

                /* JADX WARN: Removed duplicated region for block: B:74:0x0160  */
                /* JADX WARN: Removed duplicated region for block: B:78:0x017d A[RETURN, SYNTHETIC] */
                /* JADX WARN: Removed duplicated region for block: B:79:0x017f  */
                @Override
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final boolean I000II(IoloIII01 ioloIII01, ArrayList arrayList, IO0Il0o1OI iO0Il0o1OI) throws Throwable {
                    double d;
                    IIl0l10l iIl0l10l;
                    IIl0l10l iIl0l10l2;
                    boolean z;
                    OoiIlOl1iI ooiIlOl1iI;
                    IIl0l10l iIl0l10l3;
                    InputConfiguration inputConfiguration;
                    ArrayList arrayList2;
/* 7 */             Oo10IliO00O oo10IliO00O = this.I00ilO0;
/* 9 */             CameraDevice cameraDevice = this.I00iiI;
/* 11 */            String str = this.I00iiO;
/* 17 */            OIoi0IIoi oIoi0IIoiI00000oIO = I00000oIO(iO0Il0o1OI);
/* 25 */            boolean zBooleanValue = ((Boolean) oIoi0IIoiI00000oIO.I00iOIl).booleanValue();
/* 31 */            Oiloill1 oiloill1 = (Oiloill1) oIoi0IIoiI00000oIO.I00iiI;
/* 34 */            if (!zBooleanValue) {
/* 33 */                return false;
                    }
/* 37 */            if (oiloill1 != null) {
/* 39 */                I00000oOI(oiloill1);
                    }
/* 44 */            String strI000o00OoI0I = IIl001iO0Io.I000o00OoI0I("CXCP#createReprocessableCaptureSessionByConfigurations-", str);
/* 48 */            long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
                    try {
/* 52 */                Trace.beginSection(strI000o00OoI0I);
/* 55 */                iIl0l10l = this.I00iio;
/* 57 */                d = 1000000.0d;
                    } catch (Throwable th) {
/* 386 */               th = th;
/* 387 */               d = 1000000.0d;
                    }
                    try {
                        try {
/* 70 */                    inputConfiguration = new InputConfiguration(ioloIII01.I00000oIO, ioloIII01.I00000oOI, ioloIII01.I0000Il00O);
/* 83 */                    arrayList2 = new ArrayList(IOOi1I.I0000O(arrayList, 10));
/* 86 */                    Iterator it = arrayList.iterator();
/* 94 */                    while (it.hasNext()) {
/* 116 */                       arrayList2.add((OutputConfiguration) ((I0oiIOi00lo1) it.next()).I00l0I0l0lO1(OOoOl0i.I00000oIO.I00000oOI(OutputConfiguration.class)));
                            }
                            try {
                                try {
                                    try {
/* 144 */                               iIl0l10l2 = iIl0l10l;
                                    } catch (Exception e) {
/* 166 */                               e = e;
/* 167 */                               iIl0l10l2 = iIl0l10l;
                                    }
                                } catch (Exception e2) {
/* 170 */                           e = e2;
/* 171 */                           iIl0l10l2 = iIl0l10l;
                                }
                            } catch (Exception e3) {
/* 174 */                       e = e3;
/* 175 */                       iIl0l10l2 = iIl0l10l;
                            }
                        } catch (Exception e4) {
/* 126 */                   e = e4;
/* 127 */                   iIl0l10l2 = iIl0l10l;
                        }
                        try {
/* 156 */                   cameraDevice.createReprocessableCaptureSessionByConfigurations(inputConfiguration, arrayList2, new I0lO1111(this, iO0Il0o1OI, oiloill1, this.I00iio, this.I00ilI0I1, oo10IliO00O.I00000oIO()), oo10IliO00O.I00000oIO());
/* 159 */                   ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
/* 161 */                   z = false;
                        } catch (Exception e5) {
/* 164 */                   e = e5;
/* 179 */                   if (e instanceof CameraAccessException) {
/* 202 */                       Log.w("CXCP", "Failed to execute call: Camera encountered an error: " + e.getMessage());
/* 205 */                       CameraAccessException cameraAccessException = (CameraAccessException) e;
/* 207 */                       int reason = cameraAccessException.getReason();
/* 211 */                       int i = 3;
/* 212 */                       boolean z2 = true;
/* 213 */                       if (reason != 1) {
/* 216 */                           if (reason == 2) {
/* 261 */                               i = 6;
                                    } else if (reason == 3) {
/* 256 */                               iIl0l10l3 = iIl0l10l2;
/* 258 */                               z2 = true;
/* 259 */                               i = 0;
                                    } else if (reason == 4) {
/* 251 */                               iIl0l10l3 = iIl0l10l2;
/* 253 */                               z2 = true;
/* 254 */                               i = 1;
                                    } else if (reason != 5) {
/* 240 */                               Log.w("CXCP", "Unexpected CameraAccessException: " + cameraAccessException);
/* 243 */                               i = 11;
                                    } else {
/* 249 */                               i = 2;
                                    }
/* 245 */                           iIl0l10l3 = iIl0l10l2;
/* 247 */                           z2 = true;
                                } else {
/* 263 */                           iIl0l10l3 = iIl0l10l2;
                                }
/* 265 */                       iIl0l10l3.I00000oIO(z2, str, i);
                            } else {
/* 271 */                       IIl0l10l iIl0l10l4 = iIl0l10l2;
/* 275 */                       if (!(e instanceof IllegalArgumentException) && !(e instanceof SecurityException) && !(e instanceof UnsupportedOperationException) && !(e instanceof NullPointerException)) {
/* 292 */                           if (!(e instanceof IllegalStateException)) {
/* 295 */                               throw e;
                                    }
                                }
/* 317 */                       Log.w("CXCP", "Failed to execute call: Unexpected exception: " + e.getMessage());
/* 322 */                       z = false;
/* 323 */                       iIl0l10l4.I00000oIO(false, str, 9);
/* 269 */                       ooiIlOl1iI = null;
/* 348 */                       String.format(null, "%.3f ms", Arrays.copyOf(new Object[]{Double.valueOf(IIlIOloOOO.I0000oI00(jElapsedRealtimeNanos) / 1000000.0d)}, 1));
/* 351 */                       if (ooiIlOl1iI == null) {
                                }
/* 380 */                       if (ooiIlOl1iI != null) {
                                }
                            }
/* 268 */                   z = false;
/* 269 */                   ooiIlOl1iI = null;
/* 348 */                   String.format(null, "%.3f ms", Arrays.copyOf(new Object[]{Double.valueOf(IIlIOloOOO.I0000oI00(jElapsedRealtimeNanos) / 1000000.0d)}, 1));
/* 351 */                   if (ooiIlOl1iI == null) {
                            }
/* 380 */                   if (ooiIlOl1iI != null) {
                            }
                        }
/* 348 */               String.format(null, "%.3f ms", Arrays.copyOf(new Object[]{Double.valueOf(IIlIOloOOO.I0000oI00(jElapsedRealtimeNanos) / 1000000.0d)}, 1));
/* 351 */               if (ooiIlOl1iI == null) {
/* 372 */                   Log.w("CXCP", "Failed to create reprocess session from " + cameraDevice + ". Finalizing previous session");
/* 375 */                   if (oiloill1 != null) {
/* 377 */                       I0000O(oiloill1);
                            }
                        }
/* 380 */               if (ooiIlOl1iI != null) {
/* 382 */                   return true;
                        }
/* 384 */               return z;
                    } catch (Throwable th2) {
/* 123 */               th = th2;
/* 413 */               String.format(null, "%.3f ms", Arrays.copyOf(new Object[]{Double.valueOf(IIlIOloOOO.I0000oI00(jElapsedRealtimeNanos) / d)}, 1));
/* 1638 */              throw th;
                    }
                }

                /* JADX WARN: Removed duplicated region for block: B:42:0x00bd A[Catch: all -> 0x006c, TryCatch #6 {all -> 0x006c, blocks: (B:14:0x0059, B:40:0x00b9, B:42:0x00bd, B:51:0x00ea, B:57:0x0109, B:59:0x010e, B:61:0x0112, B:63:0x0116, B:65:0x011a, B:68:0x011f, B:71:0x0124, B:72:0x0125, B:24:0x0082, B:26:0x008c, B:28:0x0092, B:30:0x009b), top: B:87:0x0059 }] */
                /* JADX WARN: Removed duplicated region for block: B:59:0x010e A[Catch: all -> 0x006c, TryCatch #6 {all -> 0x006c, blocks: (B:14:0x0059, B:40:0x00b9, B:42:0x00bd, B:51:0x00ea, B:57:0x0109, B:59:0x010e, B:61:0x0112, B:63:0x0116, B:65:0x011a, B:68:0x011f, B:71:0x0124, B:72:0x0125, B:24:0x0082, B:26:0x008c, B:28:0x0092, B:30:0x009b), top: B:87:0x0059 }] */
                /* JADX WARN: Removed duplicated region for block: B:76:0x015e  */
                /* JADX WARN: Removed duplicated region for block: B:80:0x017b A[RETURN, SYNTHETIC] */
                /* JADX WARN: Removed duplicated region for block: B:81:0x017d  */
                @Override
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final boolean I000O01llI0(ArrayList arrayList, IO0Il0o1OI iO0Il0o1OI) throws Throwable {
                    double d;
                    Oiloill1 oiloill1;
                    IIl0l10l iIl0l10l;
                    boolean z;
                    OoiIlOl1iI ooiIlOl1iI;
/* 5 */             Oo10IliO00O oo10IliO00O = this.I00ilO0;
/* 7 */             CameraDevice cameraDevice = this.I00iiI;
/* 9 */             String str = this.I00iiO;
/* 15 */            OIoi0IIoi oIoi0IIoiI00000oIO = I00000oIO(iO0Il0o1OI);
/* 23 */            boolean zBooleanValue = ((Boolean) oIoi0IIoiI00000oIO.I00iOIl).booleanValue();
/* 30 */            Oiloill1 oiloill12 = (Oiloill1) oIoi0IIoiI00000oIO.I00iiI;
/* 33 */            if (!zBooleanValue) {
/* 32 */                return false;
                    }
/* 36 */            if (oiloill12 != null) {
/* 38 */                I00000oOI(oiloill12);
                    }
/* 43 */            String strI000o00OoI0I = IIl001iO0Io.I000o00OoI0I("CXCP#createCaptureSessionByOutputConfigurations-", str);
/* 47 */            long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
                    try {
/* 51 */                Trace.beginSection(strI000o00OoI0I);
/* 54 */                IIl0l10l iIl0l10l2 = this.I00iio;
                        try {
/* 66 */                    ArrayList arrayList2 = new ArrayList(IOOi1I.I0000O(arrayList, 10));
/* 69 */                    Iterator it = arrayList.iterator();
/* 77 */                    while (it.hasNext()) {
                                try {
/* 85 */                            d = 1000000.0d;
                                    try {
                                        try {
/* 104 */                                   arrayList2.add((OutputConfiguration) ((I0oiIOi00lo1) it.next()).I00l0I0l0lO1(OOoOl0i.I00000oIO.I00000oOI(OutputConfiguration.class)));
                                        } catch (Exception e) {
/* 112 */                                   e = e;
/* 113 */                                   oiloill1 = oiloill12;
/* 114 */                                   iIl0l10l = iIl0l10l2;
/* 188 */                                   if (e instanceof CameraAccessException) {
                                            }
/* 269 */                                   ooiIlOl1iI = null;
/* 168 */                                   z = false;
/* 346 */                                   String.format(null, "%.3f ms", Arrays.copyOf(new Object[]{Double.valueOf(IIlIOloOOO.I0000oI00(jElapsedRealtimeNanos) / d)}, 1));
/* 349 */                                   if (ooiIlOl1iI == null) {
                                            }
/* 378 */                                   if (ooiIlOl1iI == null) {
                                            }
                                        }
                                    } catch (Throwable th) {
/* 109 */                               th = th;
/* 405 */                               String.format(null, "%.3f ms", Arrays.copyOf(new Object[]{Double.valueOf(IIlIOloOOO.I0000oI00(jElapsedRealtimeNanos) / d)}, 1));
/* 900 */                               throw th;
                                    }
                                } catch (Exception e2) {
/* 124 */                           e = e2;
/* 125 */                           d = 1000000.0d;
/* 113 */                           oiloill1 = oiloill12;
/* 114 */                           iIl0l10l = iIl0l10l2;
/* 188 */                           if (e instanceof CameraAccessException) {
                                    }
/* 269 */                           ooiIlOl1iI = null;
/* 168 */                           z = false;
/* 346 */                           String.format(null, "%.3f ms", Arrays.copyOf(new Object[]{Double.valueOf(IIlIOloOOO.I0000oI00(jElapsedRealtimeNanos) / d)}, 1));
/* 349 */                           if (ooiIlOl1iI == null) {
                                    }
/* 378 */                           if (ooiIlOl1iI == null) {
                                    }
                                }
                            }
/* 132 */                   d = 1000000.0d;
/* 140 */                   oiloill1 = oiloill12;
                            try {
                                try {
/* 154 */                           iIl0l10l = iIl0l10l2;
                                } catch (Exception e3) {
/* 173 */                           e = e3;
/* 174 */                           iIl0l10l = iIl0l10l2;
                                }
                            } catch (Exception e4) {
/* 176 */                       e = e4;
/* 114 */                       iIl0l10l = iIl0l10l2;
/* 188 */                       if (e instanceof CameraAccessException) {
/* 273 */                           if (!(e instanceof IllegalArgumentException) && !(e instanceof SecurityException) && !(e instanceof UnsupportedOperationException) && !(e instanceof NullPointerException)) {
/* 290 */                               if (!(e instanceof IllegalStateException)) {
/* 293 */                                   throw e;
                                        }
                                    }
/* 315 */                           Log.w("CXCP", "Failed to execute call: Unexpected exception: " + e.getMessage());
/* 320 */                           z = false;
/* 321 */                           iIl0l10l.I00000oIO(false, str, 9);
/* 324 */                           ooiIlOl1iI = null;
/* 346 */                           String.format(null, "%.3f ms", Arrays.copyOf(new Object[]{Double.valueOf(IIlIOloOOO.I0000oI00(jElapsedRealtimeNanos) / d)}, 1));
/* 349 */                           if (ooiIlOl1iI == null) {
                                    }
/* 378 */                           if (ooiIlOl1iI == null) {
                                    }
                                } else {
/* 211 */                           Log.w("CXCP", "Failed to execute call: Camera encountered an error: " + e.getMessage());
/* 214 */                           CameraAccessException cameraAccessException = (CameraAccessException) e;
/* 216 */                           int reason = cameraAccessException.getReason();
/* 220 */                           int i = 3;
/* 221 */                           boolean z2 = true;
/* 222 */                           if (reason != 1) {
/* 225 */                               if (reason == 2) {
/* 264 */                                   i = 6;
                                        } else if (reason == 3) {
/* 261 */                                   z2 = true;
/* 262 */                                   i = 0;
                                        } else if (reason == 4) {
/* 258 */                                   z2 = true;
/* 259 */                                   i = 1;
                                        } else if (reason != 5) {
/* 249 */                                   Log.w("CXCP", "Unexpected CameraAccessException: " + cameraAccessException);
/* 252 */                                   i = 11;
                                        } else {
/* 256 */                                   i = 2;
                                        }
/* 254 */                               z2 = true;
                                    }
/* 266 */                           iIl0l10l.I00000oIO(z2, str, i);
                                }
/* 269 */                       ooiIlOl1iI = null;
/* 168 */                       z = false;
/* 346 */                       String.format(null, "%.3f ms", Arrays.copyOf(new Object[]{Double.valueOf(IIlIOloOOO.I0000oI00(jElapsedRealtimeNanos) / d)}, 1));
/* 349 */                       if (ooiIlOl1iI == null) {
                                }
/* 378 */                       if (ooiIlOl1iI == null) {
                                }
                            }
                            try {
/* 163 */                       cameraDevice.createCaptureSessionByOutputConfigurations(arrayList2, new I0lO1111(this, iO0Il0o1OI, oiloill1, this.I00iio, this.I00ilI0I1, oo10IliO00O.I00000oIO()), oo10IliO00O.I00000oIO());
/* 166 */                       ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
                            } catch (Exception e5) {
/* 171 */                       e = e5;
/* 188 */                       if (e instanceof CameraAccessException) {
                                }
/* 269 */                       ooiIlOl1iI = null;
/* 168 */                       z = false;
/* 346 */                       String.format(null, "%.3f ms", Arrays.copyOf(new Object[]{Double.valueOf(IIlIOloOOO.I0000oI00(jElapsedRealtimeNanos) / d)}, 1));
/* 349 */                       if (ooiIlOl1iI == null) {
                                }
/* 378 */                       if (ooiIlOl1iI == null) {
                                }
                            }
                        } catch (Exception e6) {
/* 178 */                   e = e6;
/* 179 */                   oiloill1 = oiloill12;
/* 180 */                   iIl0l10l = iIl0l10l2;
/* 181 */                   d = 1000000.0d;
                        }
/* 168 */               z = false;
/* 346 */               String.format(null, "%.3f ms", Arrays.copyOf(new Object[]{Double.valueOf(IIlIOloOOO.I0000oI00(jElapsedRealtimeNanos) / d)}, 1));
/* 349 */               if (ooiIlOl1iI == null) {
/* 370 */                   Log.w("CXCP", "Failed to create capture session from " + cameraDevice + ". Finalizing previous session");
/* 373 */                   if (oiloill1 != null) {
/* 375 */                       I0000O(oiloill1);
                            }
                        }
/* 378 */               if (ooiIlOl1iI == null) {
/* 380 */                   return true;
                        }
/* 382 */               return z;
                    } catch (Throwable th2) {
/* 116 */               th = th2;
/* 117 */               d = 1000000.0d;
                    }
                }

                @Override
                public final String I000l1() {
/* 1 */             return this.I00iiO;
                }

                @Override
                public final CaptureRequest.Builder I00100l0(TotalCaptureResult totalCaptureResult) {
                    CaptureRequest.Builder builderCreateReprocessCaptureRequest;
/* 11 */            StringBuilder sb = new StringBuilder("CXCP#createReprocessCaptureRequest-");
/* 14 */            String str = this.I00iiO;
/* 16 */            sb.append(str);
/* 19 */            String string = sb.toString();
/* 23 */            long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
                    try {
/* 34 */                Trace.beginSection(string);
/* 37 */                IIl0l10l iIl0l10l = this.I00iio;
                        try {
/* 41 */                    builderCreateReprocessCaptureRequest = this.I00iiI.createReprocessCaptureRequest(totalCaptureResult);
                        } catch (Exception e) {
/* 53 */                    int i = 0;
/* 56 */                    if (e instanceof CameraAccessException) {
/* 74 */                        Log.w("CXCP", "Failed to execute call: Camera encountered an error: " + e.getMessage());
/* 77 */                        CameraAccessException cameraAccessException = (CameraAccessException) e;
/* 79 */                        int reason = cameraAccessException.getReason();
/* 84 */                        if (reason == 1) {
/* 123 */                           i = 3;
                                } else if (reason == 2) {
/* 121 */                           i = 6;
                                } else if (reason != 3) {
/* 92 */                            if (reason == 4) {
/* 119 */                               i = 1;
                                    } else if (reason != 5) {
/* 111 */                               Log.w("CXCP", "Unexpected CameraAccessException: " + cameraAccessException);
/* 114 */                               i = 11;
                                    } else {
/* 117 */                               i = 2;
                                    }
                                }
/* 124 */                       iIl0l10l.I00000oIO(true, str, i);
                            } else if ((e instanceof IllegalArgumentException) || (e instanceof SecurityException) || (e instanceof UnsupportedOperationException) || (e instanceof NullPointerException)) {
/* 168 */                       Log.w("CXCP", "Failed to execute call: Unexpected exception: " + e.getMessage());
/* 173 */                       iIl0l10l.I00000oIO(false, str, 9);
                            } else if (!(e instanceof IllegalStateException)) {
/* 151 */                       throw e;
                            }
/* 127 */                   builderCreateReprocessCaptureRequest = null;
                        }
/* 198 */               return builderCreateReprocessCaptureRequest;
                    } finally {
/* 217 */               String.format(null, "%.3f ms", Arrays.copyOf(new Object[]{Double.valueOf(IIlIOloOOO.I0000oI00(jElapsedRealtimeNanos) / 1000000.0d)}, 1));
                    }
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:37:0x008f A[Catch: all -> 0x006a, TryCatch #6 {all -> 0x006a, blocks: (B:17:0x0057, B:35:0x008b, B:37:0x008f, B:46:0x00b6, B:52:0x00d6, B:54:0x00db, B:56:0x00e1, B:58:0x00e5, B:60:0x00e9, B:63:0x00ee, B:66:0x00f3, B:67:0x00f4), top: B:86:0x0057 }] */
                /* JADX WARN: Removed duplicated region for block: B:54:0x00db A[Catch: all -> 0x006a, TryCatch #6 {all -> 0x006a, blocks: (B:17:0x0057, B:35:0x008b, B:37:0x008f, B:46:0x00b6, B:52:0x00d6, B:54:0x00db, B:56:0x00e1, B:58:0x00e5, B:60:0x00e9, B:63:0x00ee, B:66:0x00f3, B:67:0x00f4), top: B:86:0x0057 }] */
                /* JADX WARN: Removed duplicated region for block: B:71:0x0127  */
                /* JADX WARN: Removed duplicated region for block: B:76:0x0145  */
                /* JADX WARN: Removed duplicated region for block: B:94:? A[RETURN, SYNTHETIC] */
                /* JADX WARN: Type inference failed for: r14v10 */
                /* JADX WARN: Type inference failed for: r14v11 */
                /* JADX WARN: Type inference failed for: r14v12 */
                /* JADX WARN: Type inference failed for: r14v13 */
                /* JADX WARN: Type inference failed for: r14v17 */
                /* JADX WARN: Type inference failed for: r14v18 */
                /* JADX WARN: Type inference failed for: r14v3 */
                /* JADX WARN: Type inference failed for: r14v4 */
                /* JADX WARN: Type inference failed for: r14v5 */
                /* JADX WARN: Type inference failed for: r14v6, types: [boolean] */
                /* JADX WARN: Type inference failed for: r14v7, types: [boolean, int] */
                /* JADX WARN: Type inference failed for: r2v7 */
                /* JADX WARN: Type inference failed for: r2v8, types: [IIl0l10l] */
                /* JADX WARN: Type inference failed for: r2v9 */
                @Override
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final boolean I001i1lo1io(InputConfiguration inputConfiguration, ArrayList arrayList, IO0Il0o1OI iO0Il0o1OI) throws Throwable {
                    int i;
                    Locale locale;
                    Oiloill1 oiloill1;
                    ?? r14;
                    IIl0l10l iIl0l10l;
                    boolean z;
                    OoiIlOl1iI ooiIlOl1iI;
                    ?? r2;
                    ?? r142;
                    boolean z2;
/* 5 */             Oo10IliO00O oo10IliO00O = this.I00ilO0;
/* 7 */             CameraDevice cameraDevice = this.I00iiI;
/* 9 */             String str = this.I00iiO;
/* 19 */            OIoi0IIoi oIoi0IIoiI00000oIO = I00000oIO(iO0Il0o1OI);
/* 27 */            boolean zBooleanValue = ((Boolean) oIoi0IIoiI00000oIO.I00iOIl).booleanValue();
/* 34 */            Oiloill1 oiloill12 = (Oiloill1) oIoi0IIoiI00000oIO.I00iiI;
/* 37 */            if (!zBooleanValue) {
/* 36 */                return false;
                    }
/* 40 */            if (oiloill12 != null) {
/* 42 */                I00000oOI(oiloill12);
                    }
/* 47 */            String strI000o00OoI0I = IIl001iO0Io.I000o00OoI0I("CXCP#createReprocessableCaptureSession-", str);
/* 51 */            long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
                    try {
/* 62 */                Trace.beginSection(strI000o00OoI0I);
/* 65 */                IIl0l10l iIl0l10l2 = this.I00iio;
                        try {
                            try {
/* 71 */                        oiloill1 = oiloill12;
                            } catch (Throwable th) {
/* 129 */                       th = th;
/* 130 */                       r14 = 1;
                            }
                        } catch (Exception e) {
/* 137 */                   e = e;
/* 138 */                   oiloill1 = oiloill12;
                        }
                        try {
                            try {
                                try {
                                    try {
/* 84 */                                r14 = 1;
/* 86 */                                iIl0l10l = iIl0l10l2;
                                        try {
                                            try {
/* 99 */                                        cameraDevice.createReprocessableCaptureSession(inputConfiguration, arrayList, new I0lO1111(this, iO0Il0o1OI, oiloill1, this.I00iio, this.I00ilI0I1, oo10IliO00O.I00000oIO()), oo10IliO00O.I00000oIO());
/* 102 */                                       ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
                                                z2 = r14;
                                            } catch (Exception e2) {
/* 111 */                                       e = e2;
/* 142 */                                       if (e instanceof CameraAccessException) {
/* 220 */                                           IIl0l10l iIl0l10l3 = iIl0l10l;
/* 224 */                                           if (!(e instanceof IllegalArgumentException) && !(e instanceof SecurityException) && !(e instanceof UnsupportedOperationException) && !(e instanceof NullPointerException)) {
/* 241 */                                               if (!(e instanceof IllegalStateException)) {
/* 244 */                                                   throw e;
                                                        }
                                                    }
/* 261 */                                           Log.w("CXCP", "Failed to execute call: Unexpected exception: " + e.getMessage());
/* 266 */                                           z = false;
/* 267 */                                           iIl0l10l3.I00000oIO(false, str, 9);
/* 270 */                                           ooiIlOl1iI = null;
                                                    r142 = r14;
/* 291 */                                           String.format(null, "%.3f ms", Arrays.copyOf(new Object[]{Double.valueOf(IIlIOloOOO.I0000oI00(jElapsedRealtimeNanos) / 1000000.0d)}, (int) r142));
/* 294 */                                           if (ooiIlOl1iI == null) {
                                                    }
                                                    if (ooiIlOl1iI != null) {
                                                    }
                                                } else {
/* 160 */                                           Log.w("CXCP", "Failed to execute call: Camera encountered an error: " + e.getMessage());
/* 163 */                                           CameraAccessException cameraAccessException = (CameraAccessException) e;
/* 165 */                                           int reason = cameraAccessException.getReason();
/* 169 */                                           int i2 = 3;
/* 170 */                                           if (reason == r14) {
/* 202 */                                               r2 = iIl0l10l;
/* 215 */                                               r2.I00000oIO(r14, str, i2);
                                                    } else {
/* 173 */                                               if (reason == 2) {
/* 213 */                                                   i2 = 6;
                                                        } else if (reason == 3) {
/* 209 */                                                   r2 = iIl0l10l;
/* 211 */                                                   i2 = 0;
/* 215 */                                                   r2.I00000oIO(r14, str, i2);
                                                        } else if (reason == 4) {
/* 207 */                                                   i2 = r14 == true ? 1 : 0;
                                                        } else if (reason != 5) {
/* 197 */                                                   Log.w("CXCP", "Unexpected CameraAccessException: " + cameraAccessException);
/* 200 */                                                   i2 = 11;
                                                        } else {
/* 205 */                                                   i2 = 2;
                                                        }
/* 202 */                                               r2 = iIl0l10l;
/* 215 */                                               r2.I00000oIO(r14, str, i2);
                                                    }
/* 291 */                                           String.format(null, "%.3f ms", Arrays.copyOf(new Object[]{Double.valueOf(IIlIOloOOO.I0000oI00(jElapsedRealtimeNanos) / 1000000.0d)}, (int) r142));
/* 294 */                                           if (ooiIlOl1iI == null) {
                                                    }
                                                    if (ooiIlOl1iI != null) {
                                                    }
                                                }
/* 218 */                                       ooiIlOl1iI = null;
                                                z2 = r14;
/* 104 */                                       z = false;
                                                r142 = z2;
/* 291 */                                       String.format(null, "%.3f ms", Arrays.copyOf(new Object[]{Double.valueOf(IIlIOloOOO.I0000oI00(jElapsedRealtimeNanos) / 1000000.0d)}, (int) r142));
/* 294 */                                       if (ooiIlOl1iI == null) {
                                                }
                                                if (ooiIlOl1iI != null) {
                                                }
                                            }
                                        } catch (Throwable th2) {
/* 107 */                                   th = th2;
/* 108 */                                   locale = null;
                                            i = r14;
/* 350 */                                   String.format(locale, "%.3f ms", Arrays.copyOf(new Object[]{Double.valueOf(IIlIOloOOO.I0000oI00(jElapsedRealtimeNanos) / 1000000.0d)}, i));
/* 408 */                                   throw th;
                                        }
                                    } catch (Exception e3) {
/* 117 */                               e = e3;
/* 118 */                               r14 = 1;
/* 120 */                               iIl0l10l = iIl0l10l2;
                                    }
                                } catch (Throwable th3) {
/* 113 */                           th = th3;
/* 114 */                           r14 = 1;
                                }
                            } catch (Exception e4) {
/* 123 */                       e = e4;
/* 124 */                       iIl0l10l = iIl0l10l2;
/* 126 */                       r14 = 1;
                            }
                        } catch (Exception e5) {
/* 132 */                   e = e5;
/* 133 */                   r14 = 1;
/* 134 */                   iIl0l10l = iIl0l10l2;
/* 142 */                   if (e instanceof CameraAccessException) {
                            }
/* 218 */                   ooiIlOl1iI = null;
                            z2 = r14;
/* 104 */                   z = false;
                            r142 = z2;
/* 291 */                   String.format(null, "%.3f ms", Arrays.copyOf(new Object[]{Double.valueOf(IIlIOloOOO.I0000oI00(jElapsedRealtimeNanos) / 1000000.0d)}, (int) r142));
/* 294 */                   if (ooiIlOl1iI == null) {
                            }
                            if (ooiIlOl1iI != null) {
                            }
                        }
/* 104 */               z = false;
                        r142 = z2;
/* 291 */               String.format(null, "%.3f ms", Arrays.copyOf(new Object[]{Double.valueOf(IIlIOloOOO.I0000oI00(jElapsedRealtimeNanos) / 1000000.0d)}, (int) r142));
/* 294 */               if (ooiIlOl1iI == null) {
/* 315 */                   Log.w("CXCP", "Failed to create reprocess session from " + cameraDevice + ". Finalizing previous session");
/* 318 */                   if (oiloill1 != null) {
/* 320 */                       I0000O(oiloill1);
                            }
                        }
                        return ooiIlOl1iI != null ? r142 : z;
                    } catch (Throwable th4) {
/* 328 */               th = th4;
/* 329 */               i = 1;
/* 330 */               locale = null;
                    }
                }

                @Override
                public final void I001l0I00(int i) {
                    try {
/* 7 */                 Trace.beginSection("setCameraAudioRestriction");
/* 10 */                String str = this.I00iiO;
/* 12 */                IIl0l10l iIl0l10l = this.I00iio;
                        try {
/* 16 */                    this.I00iiI.setCameraAudioRestriction(i);
                        } catch (Exception e) {
/* 24 */                    int i2 = 0;
/* 27 */                    if (e instanceof CameraAccessException) {
/* 45 */                        Log.w("CXCP", "Failed to execute call: Camera encountered an error: " + e.getMessage());
/* 48 */                        CameraAccessException cameraAccessException = (CameraAccessException) e;
/* 50 */                        int reason = cameraAccessException.getReason();
/* 56 */                        if (reason == 1) {
/* 95 */                            i2 = 3;
                                } else if (reason == 2) {
/* 93 */                            i2 = 6;
                                } else if (reason != 3) {
/* 64 */                            if (reason == 4) {
/* 91 */                                i2 = 1;
                                    } else if (reason != 5) {
/* 83 */                                Log.w("CXCP", "Unexpected CameraAccessException: " + cameraAccessException);
/* 86 */                                i2 = 11;
                                    } else {
/* 89 */                                i2 = 2;
                                    }
                                }
/* 96 */                        iIl0l10l.I00000oIO(true, str, i2);
                            } else if ((e instanceof IllegalArgumentException) || (e instanceof SecurityException) || (e instanceof UnsupportedOperationException) || (e instanceof NullPointerException)) {
/* 139 */                       Log.w("CXCP", "Failed to execute call: Unexpected exception: " + e.getMessage());
/* 144 */                       iIl0l10l.I00000oIO(false, str, 9);
                            } else if (!(e instanceof IllegalStateException)) {
/* 122 */                       throw e;
                            }
                        }
                    } finally {
/* 152 */               Trace.endSection();
                    }
                }

                @Override
                public final void I00IioO0OiOi() {
                    Oiloill1 oiloill1;
/* 7 */             if (!this.I00io1l.I00000oIO() || (oiloill1 = (Oiloill1) this.I00ioIO.I00000oIO) == null) {
/* 20 */                return;
                    }
/* 17 */            I00000oOI(oiloill1);
                }

                /* JADX WARN: Removed duplicated region for block: B:102:0x0221 A[RETURN, SYNTHETIC] */
                /* JADX WARN: Removed duplicated region for block: B:103:0x0223  */
                /* JADX WARN: Removed duplicated region for block: B:64:0x0163 A[Catch: all -> 0x00ae, TryCatch #7 {all -> 0x00ae, blocks: (B:25:0x009a, B:27:0x00a6, B:34:0x00bf, B:35:0x00df, B:37:0x00e5, B:38:0x00f3, B:39:0x00fd, B:41:0x0103, B:43:0x0115, B:45:0x0122, B:46:0x0126, B:48:0x0135, B:51:0x013e, B:52:0x0141, B:54:0x0143, B:55:0x0146, B:62:0x015f, B:64:0x0163, B:73:0x0190, B:79:0x01af, B:81:0x01b4, B:83:0x01b8, B:85:0x01bc, B:87:0x01c0, B:90:0x01c5, B:93:0x01ca, B:94:0x01cb), top: B:113:0x0032 }] */
                /* JADX WARN: Removed duplicated region for block: B:81:0x01b4 A[Catch: all -> 0x00ae, TryCatch #7 {all -> 0x00ae, blocks: (B:25:0x009a, B:27:0x00a6, B:34:0x00bf, B:35:0x00df, B:37:0x00e5, B:38:0x00f3, B:39:0x00fd, B:41:0x0103, B:43:0x0115, B:45:0x0122, B:46:0x0126, B:48:0x0135, B:51:0x013e, B:52:0x0141, B:54:0x0143, B:55:0x0146, B:62:0x015f, B:64:0x0163, B:73:0x0190, B:79:0x01af, B:81:0x01b4, B:83:0x01b8, B:85:0x01bc, B:87:0x01c0, B:90:0x01c5, B:93:0x01ca, B:94:0x01cb), top: B:113:0x0032 }] */
                /* JADX WARN: Removed duplicated region for block: B:98:0x0204  */
                @Override
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final boolean I00OIl(Oilo110oloIl oilo110oloIl) throws Throwable {
                    long j;
                    double d;
                    Oiloill1 oiloill1;
                    long j2;
                    IIl0l10l iIl0l10l;
                    boolean z;
                    OoiIlOl1iI ooiIlOl1iI;
                    int i;
                    ArrayList arrayList;
/* 7 */             CameraDevice cameraDevice = this.I00iiI;
/* 9 */             String str = this.I00iiO;
/* 13 */            IO0Il0o1OI iO0Il0o1OI = oilo110oloIl.I0000oI00;
/* 15 */            OIoi0IIoi oIoi0IIoiI00000oIO = I00000oIO(iO0Il0o1OI);
/* 23 */            boolean zBooleanValue = ((Boolean) oIoi0IIoiI00000oIO.I00iOIl).booleanValue();
/* 30 */            Oiloill1 oiloill12 = (Oiloill1) oIoi0IIoiI00000oIO.I00iiI;
/* 33 */            if (!zBooleanValue) {
/* 32 */                return false;
                    }
/* 36 */            if (oiloill12 != null) {
/* 38 */                I00000oOI(oiloill12);
                    }
/* 43 */            String strI000o00OoI0I = IIl001iO0Io.I000o00OoI0I("CXCP#createCaptureSession-", str);
/* 47 */            long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
                    try {
                        try {
/* 51 */                    Trace.beginSection(strI000o00OoI0I);
/* 54 */                    IIl0l10l iIl0l10l2 = this.I00iio;
                            try {
/* 56 */                        i = oilo110oloIl.I00000oIO;
/* 58 */                        ArrayList arrayList2 = oilo110oloIl.I0000Il00O;
/* 60 */                        d = 1000000.0d;
                                try {
                                    try {
/* 73 */                                arrayList = new ArrayList(IOOi1I.I0000O(arrayList2, 10));
/* 76 */                                Iterator it = arrayList2.iterator();
/* 84 */                                while (it.hasNext()) {
/* 108 */                                   arrayList.add((OutputConfiguration) ((I0oiIOi00lo1) it.next()).I00l0I0l0lO1(OOoOl0i.I00000oIO.I00000oOI(OutputConfiguration.class)));
/* 111 */                                   i = i;
                                        }
/* 134 */                               oiloill1 = oiloill12;
                                    } catch (Throwable th) {
/* 116 */                               th = th;
/* 117 */                               j = jElapsedRealtimeNanos;
/* 571 */                               String.format(null, "%.3f ms", Arrays.copyOf(new Object[]{Double.valueOf(IIlIOloOOO.I0000oI00(j) / d)}, 1));
/* 1261 */                              throw th;
                                    }
                                } catch (Exception e) {
/* 121 */                           e = e;
/* 122 */                           oiloill1 = oiloill12;
                                }
                                try {
/* 147 */                           j2 = jElapsedRealtimeNanos;
/* 151 */                           iIl0l10l = iIl0l10l2;
                                } catch (Exception e2) {
/* 328 */                           e = e2;
/* 123 */                           j2 = jElapsedRealtimeNanos;
/* 125 */                           iIl0l10l = iIl0l10l2;
/* 354 */                           if (e instanceof CameraAccessException) {
/* 439 */                               if (!(e instanceof IllegalArgumentException) && !(e instanceof SecurityException) && !(e instanceof UnsupportedOperationException) && !(e instanceof NullPointerException)) {
/* 456 */                                   if (!(e instanceof IllegalStateException)) {
/* 459 */                                       throw e;
                                            }
                                        }
/* 481 */                               Log.w("CXCP", "Failed to execute call: Unexpected exception: " + e.getMessage());
/* 486 */                               z = false;
/* 487 */                               iIl0l10l.I00000oIO(false, str, 9);
/* 490 */                               ooiIlOl1iI = null;
/* 512 */                               String.format(null, "%.3f ms", Arrays.copyOf(new Object[]{Double.valueOf(IIlIOloOOO.I0000oI00(j2) / d)}, 1));
/* 515 */                               if (ooiIlOl1iI == null) {
                                        }
/* 544 */                               if (ooiIlOl1iI == null) {
                                        }
                                    } else {
/* 377 */                               Log.w("CXCP", "Failed to execute call: Camera encountered an error: " + e.getMessage());
/* 380 */                               CameraAccessException cameraAccessException = (CameraAccessException) e;
/* 382 */                               int reason = cameraAccessException.getReason();
/* 386 */                               int i2 = 3;
/* 387 */                               boolean z2 = true;
/* 388 */                               if (reason != 1) {
/* 391 */                                   if (reason == 2) {
/* 430 */                                       i2 = 6;
                                            } else if (reason == 3) {
/* 427 */                                       z2 = true;
/* 428 */                                       i2 = 0;
                                            } else if (reason == 4) {
/* 424 */                                       z2 = true;
/* 425 */                                       i2 = 1;
                                            } else if (reason != 5) {
/* 415 */                                       Log.w("CXCP", "Unexpected CameraAccessException: " + cameraAccessException);
/* 418 */                                       i2 = 11;
                                            } else {
/* 422 */                                       i2 = 2;
                                            }
/* 420 */                                   z2 = true;
                                        }
/* 432 */                               iIl0l10l.I00000oIO(z2, str, i2);
                                    }
/* 435 */                           ooiIlOl1iI = null;
/* 315 */                           z = false;
/* 512 */                           String.format(null, "%.3f ms", Arrays.copyOf(new Object[]{Double.valueOf(IIlIOloOOO.I0000oI00(j2) / d)}, 1));
/* 515 */                           if (ooiIlOl1iI == null) {
                                    }
/* 544 */                           if (ooiIlOl1iI == null) {
                                    }
                                }
                            } catch (Exception e3) {
/* 341 */                       e = e3;
/* 342 */                       oiloill1 = oiloill12;
/* 343 */                       j2 = jElapsedRealtimeNanos;
/* 345 */                       d = 1000000.0d;
                            }
                            try {
/* 160 */                       SessionConfiguration sessionConfiguration = new SessionConfiguration(i, arrayList, oilo110oloIl.I0000O, new I0lO1111(this, iO0Il0o1OI, oiloill1, this.I00iio, this.I00ilI0I1, this.I00ilO0.I00000oIO()));
/* 163 */                       ArrayList arrayList3 = oilo110oloIl.I00000oOI;
/* 165 */                       if (arrayList3 != null) {
/* 171 */                           sessionConfiguration.setInputConfiguration(iOO0iii0O0i1.I00000oIO(str, arrayList3));
                                }
                                try {
/* 183 */                           Trace.beginSection("createCaptureRequest");
/* 188 */                           CaptureRequest.Builder builderCreateCaptureRequest = cameraDevice.createCaptureRequest(oilo110oloIl.I0001Ioi1lo);
/* 192 */                           Trace.endSection();
/* 205 */                           Set set = (Set) ((IIioli) this.I00iOIl).I00ioIO.getValue();
/* 217 */                           ArrayList arrayList4 = new ArrayList(IOOi1I.I0000O(set, 10));
/* 220 */                           Iterator it2 = set.iterator();
/* 228 */                           while (it2.hasNext()) {
/* 240 */                               arrayList4.add(((CaptureRequest.Key) it2.next()).getName());
                                    }
/* 258 */                           for (Map.Entry entry : oilo110oloIl.I000II.entrySet()) {
/* 266 */                               Object key = entry.getKey();
/* 270 */                               Object value = entry.getValue();
/* 276 */                               if ((key instanceof CaptureRequest.Key) && arrayList4.contains(((CaptureRequest.Key) key).getName())) {
/* 291 */                                   lIoO00l.I00000oIO(builderCreateCaptureRequest, key, value);
                                        }
                                    }
/* 299 */                           sessionConfiguration.setSessionParameters(builderCreateCaptureRequest.build());
                                    try {
/* 304 */                               Trace.beginSection("Api28Compat.createCaptureSession");
/* 307 */                               cameraDevice.createCaptureSession(sessionConfiguration);
/* 310 */                               Trace.endSection();
/* 313 */                               ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
                                    } finally {
                                    }
                                } finally {
                                }
                            } catch (Exception e4) {
/* 178 */                       e = e4;
/* 354 */                       if (e instanceof CameraAccessException) {
                                }
/* 435 */                       ooiIlOl1iI = null;
/* 315 */                       z = false;
/* 512 */                       String.format(null, "%.3f ms", Arrays.copyOf(new Object[]{Double.valueOf(IIlIOloOOO.I0000oI00(j2) / d)}, 1));
/* 515 */                       if (ooiIlOl1iI == null) {
                                }
/* 544 */                       if (ooiIlOl1iI == null) {
                                }
                            }
/* 315 */                   z = false;
/* 512 */                   String.format(null, "%.3f ms", Arrays.copyOf(new Object[]{Double.valueOf(IIlIOloOOO.I0000oI00(j2) / d)}, 1));
/* 515 */                   if (ooiIlOl1iI == null) {
/* 536 */                       Log.w("CXCP", "Failed to create capture session from " + cameraDevice + ". Finalizing previous session");
/* 539 */                       if (oiloill1 != null) {
/* 541 */                           I0000O(oiloill1);
                                }
                            }
/* 544 */                   if (ooiIlOl1iI == null) {
/* 546 */                       return true;
                            }
/* 548 */                   return z;
                        } catch (Throwable th2) {
/* 331 */                   th = th2;
/* 332 */                   j = jElapsedRealtimeNanos;
/* 334 */                   d = 1000000.0d;
                        }
                    } catch (Throwable th3) {
/* 175 */               th = th3;
                    }
                }

                @Override
                public final CaptureRequest.Builder I00OOll1(int i) {
                    CaptureRequest.Builder builderCreateCaptureRequest;
/* 11 */            StringBuilder sb = new StringBuilder("CXCP#createCaptureRequest-");
/* 14 */            String str = this.I00iiO;
/* 16 */            sb.append(str);
/* 19 */            String string = sb.toString();
/* 23 */            long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
                    try {
/* 34 */                Trace.beginSection(string);
/* 37 */                IIl0l10l iIl0l10l = this.I00iio;
                        try {
/* 41 */                    builderCreateCaptureRequest = this.I00iiI.createCaptureRequest(i);
                        } catch (Exception e) {
/* 53 */                    int i2 = 0;
/* 56 */                    if (e instanceof CameraAccessException) {
/* 74 */                        Log.w("CXCP", "Failed to execute call: Camera encountered an error: " + e.getMessage());
/* 77 */                        CameraAccessException cameraAccessException = (CameraAccessException) e;
/* 79 */                        int reason = cameraAccessException.getReason();
/* 84 */                        if (reason == 1) {
/* 123 */                           i2 = 3;
                                } else if (reason == 2) {
/* 121 */                           i2 = 6;
                                } else if (reason != 3) {
/* 92 */                            if (reason == 4) {
/* 119 */                               i2 = 1;
                                    } else if (reason != 5) {
/* 111 */                               Log.w("CXCP", "Unexpected CameraAccessException: " + cameraAccessException);
/* 114 */                               i2 = 11;
                                    } else {
/* 117 */                               i2 = 2;
                                    }
                                }
/* 124 */                       iIl0l10l.I00000oIO(true, str, i2);
                            } else if ((e instanceof IllegalArgumentException) || (e instanceof SecurityException) || (e instanceof UnsupportedOperationException) || (e instanceof NullPointerException)) {
/* 168 */                       Log.w("CXCP", "Failed to execute call: Unexpected exception: " + e.getMessage());
/* 173 */                       iIl0l10l.I00000oIO(false, str, 9);
                            } else if (!(e instanceof IllegalStateException)) {
/* 151 */                       throw e;
                            }
/* 127 */                   builderCreateCaptureRequest = null;
                        }
/* 198 */               return builderCreateCaptureRequest;
                    } finally {
/* 217 */               String.format(null, "%.3f ms", Arrays.copyOf(new Object[]{Double.valueOf(IIlIOloOOO.I0000oI00(jElapsedRealtimeNanos) / 1000000.0d)}, 1));
                    }
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:37:0x008d A[Catch: all -> 0x0068, TryCatch #2 {all -> 0x0068, blocks: (B:17:0x0057, B:35:0x0089, B:37:0x008d, B:46:0x00b4, B:52:0x00d4, B:54:0x00d9, B:56:0x00df, B:58:0x00e3, B:60:0x00e7, B:63:0x00ec, B:66:0x00f1, B:67:0x00f2), top: B:82:0x0057 }] */
                /* JADX WARN: Removed duplicated region for block: B:54:0x00d9 A[Catch: all -> 0x0068, TryCatch #2 {all -> 0x0068, blocks: (B:17:0x0057, B:35:0x0089, B:37:0x008d, B:46:0x00b4, B:52:0x00d4, B:54:0x00d9, B:56:0x00df, B:58:0x00e3, B:60:0x00e7, B:63:0x00ec, B:66:0x00f1, B:67:0x00f2), top: B:82:0x0057 }] */
                /* JADX WARN: Removed duplicated region for block: B:71:0x0125  */
                /* JADX WARN: Removed duplicated region for block: B:76:0x0143  */
                /* JADX WARN: Removed duplicated region for block: B:94:? A[RETURN, SYNTHETIC] */
                /* JADX WARN: Type inference failed for: r14v10 */
                /* JADX WARN: Type inference failed for: r14v11 */
                /* JADX WARN: Type inference failed for: r14v12 */
                /* JADX WARN: Type inference failed for: r14v13 */
                /* JADX WARN: Type inference failed for: r14v17 */
                /* JADX WARN: Type inference failed for: r14v18 */
                /* JADX WARN: Type inference failed for: r14v3 */
                /* JADX WARN: Type inference failed for: r14v4 */
                /* JADX WARN: Type inference failed for: r14v5 */
                /* JADX WARN: Type inference failed for: r14v6, types: [boolean] */
                /* JADX WARN: Type inference failed for: r14v7, types: [boolean, int] */
                /* JADX WARN: Type inference failed for: r2v7 */
                /* JADX WARN: Type inference failed for: r2v8, types: [IIl0l10l] */
                /* JADX WARN: Type inference failed for: r2v9 */
                @Override
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final boolean I00iiI(List list, IO0Il0o1OI iO0Il0o1OI) throws Throwable {
                    int i;
                    Locale locale;
                    ?? r14;
                    Oiloill1 oiloill1;
                    IIl0l10l iIl0l10l;
                    boolean z;
                    OoiIlOl1iI ooiIlOl1iI;
                    ?? r2;
                    ?? r142;
                    boolean z2;
/* 5 */             Oo10IliO00O oo10IliO00O = this.I00ilO0;
/* 7 */             CameraDevice cameraDevice = this.I00iiI;
/* 9 */             String str = this.I00iiO;
/* 19 */            OIoi0IIoi oIoi0IIoiI00000oIO = I00000oIO(iO0Il0o1OI);
/* 27 */            boolean zBooleanValue = ((Boolean) oIoi0IIoiI00000oIO.I00iOIl).booleanValue();
/* 34 */            Oiloill1 oiloill12 = (Oiloill1) oIoi0IIoiI00000oIO.I00iiI;
/* 37 */            if (!zBooleanValue) {
/* 36 */                return false;
                    }
/* 40 */            if (oiloill12 != null) {
/* 42 */                I00000oOI(oiloill12);
                    }
/* 47 */            String strI000o00OoI0I = IIl001iO0Io.I000o00OoI0I("CXCP#createCaptureSession-", str);
/* 51 */            long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
                    try {
/* 62 */                Trace.beginSection(strI000o00OoI0I);
/* 65 */                IIl0l10l iIl0l10l2 = this.I00iio;
                        try {
                            try {
/* 71 */                        oiloill1 = oiloill12;
                            } catch (Exception e) {
/* 135 */                       e = e;
/* 136 */                       oiloill1 = oiloill12;
                            }
                            try {
                                try {
                                    try {
                                        try {
/* 84 */                                    r14 = 1;
/* 86 */                                    iIl0l10l = iIl0l10l2;
                                            try {
                                                try {
/* 97 */                                            cameraDevice.createCaptureSession(list, new I0lO1111(this, iO0Il0o1OI, oiloill1, this.I00iio, this.I00ilI0I1, oo10IliO00O.I00000oIO()), oo10IliO00O.I00000oIO());
/* 100 */                                           ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
                                                    z2 = r14;
                                                } catch (Exception e2) {
/* 109 */                                           e = e2;
/* 140 */                                           if (e instanceof CameraAccessException) {
/* 218 */                                               IIl0l10l iIl0l10l3 = iIl0l10l;
/* 222 */                                               if (!(e instanceof IllegalArgumentException) && !(e instanceof SecurityException) && !(e instanceof UnsupportedOperationException) && !(e instanceof NullPointerException)) {
/* 239 */                                                   if (!(e instanceof IllegalStateException)) {
/* 242 */                                                       throw e;
                                                            }
                                                        }
/* 259 */                                               Log.w("CXCP", "Failed to execute call: Unexpected exception: " + e.getMessage());
/* 264 */                                               z = false;
/* 265 */                                               iIl0l10l3.I00000oIO(false, str, 9);
/* 268 */                                               ooiIlOl1iI = null;
                                                        r142 = r14;
/* 289 */                                               String.format(null, "%.3f ms", Arrays.copyOf(new Object[]{Double.valueOf(IIlIOloOOO.I0000oI00(jElapsedRealtimeNanos) / 1000000.0d)}, (int) r142));
/* 292 */                                               if (ooiIlOl1iI == null) {
                                                        }
                                                        if (ooiIlOl1iI != null) {
                                                        }
                                                    } else {
/* 158 */                                               Log.w("CXCP", "Failed to execute call: Camera encountered an error: " + e.getMessage());
/* 161 */                                               CameraAccessException cameraAccessException = (CameraAccessException) e;
/* 163 */                                               int reason = cameraAccessException.getReason();
/* 167 */                                               int i2 = 3;
/* 168 */                                               if (reason == r14) {
/* 200 */                                                   r2 = iIl0l10l;
/* 213 */                                                   r2.I00000oIO(r14, str, i2);
                                                        } else {
/* 171 */                                                   if (reason == 2) {
/* 211 */                                                       i2 = 6;
                                                            } else if (reason == 3) {
/* 207 */                                                       r2 = iIl0l10l;
/* 209 */                                                       i2 = 0;
/* 213 */                                                       r2.I00000oIO(r14, str, i2);
                                                            } else if (reason == 4) {
/* 205 */                                                       i2 = r14 == true ? 1 : 0;
                                                            } else if (reason != 5) {
/* 195 */                                                       Log.w("CXCP", "Unexpected CameraAccessException: " + cameraAccessException);
/* 198 */                                                       i2 = 11;
                                                            } else {
/* 203 */                                                       i2 = 2;
                                                            }
/* 200 */                                                   r2 = iIl0l10l;
/* 213 */                                                   r2.I00000oIO(r14, str, i2);
                                                        }
/* 289 */                                               String.format(null, "%.3f ms", Arrays.copyOf(new Object[]{Double.valueOf(IIlIOloOOO.I0000oI00(jElapsedRealtimeNanos) / 1000000.0d)}, (int) r142));
/* 292 */                                               if (ooiIlOl1iI == null) {
                                                        }
                                                        if (ooiIlOl1iI != null) {
                                                        }
                                                    }
/* 216 */                                           ooiIlOl1iI = null;
                                                    z2 = r14;
/* 102 */                                           z = false;
                                                    r142 = z2;
/* 289 */                                           String.format(null, "%.3f ms", Arrays.copyOf(new Object[]{Double.valueOf(IIlIOloOOO.I0000oI00(jElapsedRealtimeNanos) / 1000000.0d)}, (int) r142));
/* 292 */                                           if (ooiIlOl1iI == null) {
                                                    }
                                                    if (ooiIlOl1iI != null) {
                                                    }
                                                }
                                            } catch (Throwable th) {
/* 105 */                                       th = th;
/* 106 */                                       locale = null;
                                                i = r14;
/* 348 */                                       String.format(locale, "%.3f ms", Arrays.copyOf(new Object[]{Double.valueOf(IIlIOloOOO.I0000oI00(jElapsedRealtimeNanos) / 1000000.0d)}, i));
/* 900 */                                       throw th;
                                            }
                                        } catch (Exception e3) {
/* 115 */                                   e = e3;
/* 116 */                                   r14 = 1;
/* 118 */                                   iIl0l10l = iIl0l10l2;
                                        }
                                    } catch (Exception e4) {
/* 121 */                               e = e4;
/* 122 */                               iIl0l10l = iIl0l10l2;
/* 124 */                               r14 = 1;
                                    }
                                } catch (Throwable th2) {
/* 111 */                           th = th2;
/* 112 */                           r14 = 1;
                                }
                            } catch (Exception e5) {
/* 130 */                       e = e5;
/* 131 */                       r14 = 1;
/* 132 */                       iIl0l10l = iIl0l10l2;
/* 140 */                       if (e instanceof CameraAccessException) {
                                }
/* 216 */                       ooiIlOl1iI = null;
                                z2 = r14;
/* 102 */                       z = false;
                                r142 = z2;
/* 289 */                       String.format(null, "%.3f ms", Arrays.copyOf(new Object[]{Double.valueOf(IIlIOloOOO.I0000oI00(jElapsedRealtimeNanos) / 1000000.0d)}, (int) r142));
/* 292 */                       if (ooiIlOl1iI == null) {
                                }
                                if (ooiIlOl1iI != null) {
                                }
                            }
/* 102 */                   z = false;
                            r142 = z2;
/* 289 */                   String.format(null, "%.3f ms", Arrays.copyOf(new Object[]{Double.valueOf(IIlIOloOOO.I0000oI00(jElapsedRealtimeNanos) / 1000000.0d)}, (int) r142));
/* 292 */                   if (ooiIlOl1iI == null) {
/* 313 */                       Log.w("CXCP", "Failed to create capture session from " + cameraDevice + ". Finalizing previous session");
/* 316 */                       if (oiloill1 != null) {
/* 318 */                           I0000O(oiloill1);
                                }
                            }
                            return ooiIlOl1iI != null ? r142 : z;
                        } catch (Throwable th3) {
/* 127 */                   th = th3;
/* 128 */                   r14 = 1;
                        }
                    } catch (Throwable th4) {
/* 326 */               th = th4;
/* 327 */               i = 1;
/* 328 */               locale = null;
                    }
                }

                @Override
                public final void I00ioIO() {
/* 7 */             if (!this.I00io1l.I00000oOI()) {
/* 28 */                I000II.I001IO000("Check failed.");
/* 55 */                return;
                    }
/* 18 */            Oiloill1 oiloill1 = (Oiloill1) I1OooIoiIO.I00000oOI.getAndSet(this.I00ioIO, null);
/* 20 */            if (oiloill1 != null) {
/* 22 */                I0000O(oiloill1);
                    }
                }

                @Override
                public final Object I00l0I0l0lO1(O0IOli0o0 o0IOli0o0) {
/* 13 */            if (o0IOli0o0.equals(OOoOl0i.I00000oIO.I00000oOI(CameraDevice.class))) {
/* 15 */                return this.I00iiI;
                    }
/* 18 */            return null;
                }

                /* JADX WARN: Can't wrap try/catch for region: R(17:91|8|(2:93|9)|(12:10|11|(2:88|13)(1:94)|16|17|39|(3:41|(3:43|(1:(2:46|(2:48|(1:50)(1:52))(1:53))(1:54))(1:55)|51)(1:56)|57)(7:60|(2:69|(1:71)(1:72))|73|59|75|(2:77|(1:79))|(1:81)(2:82|83))|58|59|75|(0)|(0)(0))|18|19|86|20|21|90|22|(2:24|(1:26)(2:29|30))|31|32|75|(0)|(0)(0)) */
                /* JADX WARN: Code restructure failed: missing block: B:27:0x00a8, code lost:
                
                    r0 = e;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:33:0x00ba, code lost:
                
                    r0 = e;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:34:0x00bb, code lost:
                
                    r15 = r4;
                 */
                /* JADX WARN: Removed duplicated region for block: B:77:0x016b  */
                /* JADX WARN: Removed duplicated region for block: B:81:0x0188 A[RETURN, SYNTHETIC] */
                /* JADX WARN: Removed duplicated region for block: B:82:0x018a  */
                @Override
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final boolean I00lll10(Il1o1i1I1I il1o1i1I1I) throws Throwable {
                    long j;
                    IIl0l10l iIl0l10l;
                    OoiIlOl1iI ooiIlOl1iI;
                    boolean z;
                    int i;
                    int iIntValue;
                    ArrayList arrayList;
                    Iterator it;
/* 5 */             II0l011 iI0l011 = il1o1i1I1I.I00000oOI;
/* 9 */             CameraDevice cameraDevice = this.I00iiI;
/* 11 */            String str = this.I00iiO;
/* 15 */            Integer num = il1o1i1I1I.I0001Ioi1lo;
/* 17 */            Il1oI0O il1oI0O = il1o1i1I1I.I000II;
/* 19 */            OIoi0IIoi oIoi0IIoiI00000oIO = I00000oIO(il1oI0O);
/* 27 */            boolean zBooleanValue = ((Boolean) oIoi0IIoiI00000oIO.I00iOIl).booleanValue();
/* 33 */            Oiloill1 oiloill1 = (Oiloill1) oIoi0IIoiI00000oIO.I00iiI;
/* 36 */            if (!zBooleanValue) {
/* 35 */                return false;
                    }
/* 39 */            if (oiloill1 != null) {
/* 41 */                I00000oOI(oiloill1);
                    }
/* 46 */            String strI000o00OoI0I = IIl001iO0Io.I000o00OoI0I("CXCP#createExtensionSession-", str);
/* 50 */            long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
                    try {
/* 59 */                Trace.beginSection(strI000o00OoI0I);
/* 62 */                IIl0l10l iIl0l10l2 = this.I00iio;
                        try {
/* 64 */                    iIntValue = num.intValue();
/* 68 */                    ArrayList arrayList2 = il1o1i1I1I.I00000oIO;
/* 78 */                    arrayList = new ArrayList(IOOi1I.I0000O(arrayList2, 10));
/* 81 */                    it = arrayList2.iterator();
                        } catch (Exception e) {
/* 195 */                   e = e;
/* 196 */                   iIl0l10l = iIl0l10l2;
/* 197 */                   j = jElapsedRealtimeNanos;
                        }
                        while (true) {
/* 89 */                    j = jElapsedRealtimeNanos;
/* 93 */                    if (!it.hasNext()) {
                                break;
                            }
                            try {
                                try {
/* 113 */                           arrayList.add((OutputConfiguration) ((I0oiIOi00lo1) it.next()).I00l0I0l0lO1(OOoOl0i.I00000oIO.I00000oOI(OutputConfiguration.class)));
/* 116 */                           jElapsedRealtimeNanos = j;
                                } catch (Throwable th) {
/* 119 */                           th = th;
/* 418 */                           String.format(null, "%.3f ms", Arrays.copyOf(new Object[]{Double.valueOf(IIlIOloOOO.I0000oI00(j) / 1000000.0d)}, 1));
/* 437 */                           throw th;
                                }
                            } catch (Exception e2) {
/* 122 */                       e = e2;
/* 123 */                       iIl0l10l = iIl0l10l2;
                            }
/* 122 */                   e = e2;
/* 123 */                   iIl0l10l = iIl0l10l2;
/* 201 */                   if (!(e instanceof CameraAccessException)) {
/* 286 */                       if (!(e instanceof IllegalArgumentException) && !(e instanceof SecurityException) && !(e instanceof UnsupportedOperationException) && !(e instanceof NullPointerException)) {
/* 303 */                           if (!(e instanceof IllegalStateException)) {
/* 306 */                               throw e;
                                    }
                                }
/* 328 */                       Log.w("CXCP", "Failed to execute call: Unexpected exception: " + e.getMessage());
/* 333 */                       z = false;
/* 334 */                       iIl0l10l.I00000oIO(false, str, 9);
/* 282 */                       ooiIlOl1iI = null;
/* 359 */                       String.format(null, "%.3f ms", Arrays.copyOf(new Object[]{Double.valueOf(IIlIOloOOO.I0000oI00(j) / 1000000.0d)}, 1));
/* 362 */                       if (ooiIlOl1iI == null) {
/* 383 */                           Log.w("CXCP", "Failed to create extension session from " + cameraDevice + ". Finalizing previous session");
/* 386 */                           if (oiloill1 != null) {
/* 388 */                               I0000O(oiloill1);
                                    }
                                }
/* 391 */                       if (ooiIlOl1iI != null) {
/* 393 */                           return true;
                                }
/* 395 */                       return z;
                            }
/* 224 */                   Log.w("CXCP", "Failed to execute call: Camera encountered an error: " + e.getMessage());
/* 227 */                   CameraAccessException cameraAccessException = (CameraAccessException) e;
/* 229 */                   int reason = cameraAccessException.getReason();
/* 234 */                   boolean z2 = true;
/* 235 */                   if (reason != 1) {
/* 238 */                       if (reason == 2) {
/* 275 */                           i = 6;
                                } else if (reason == 3) {
/* 273 */                           i = 0;
                                } else if (reason == 4) {
/* 271 */                           i = 1;
                                } else if (reason != 5) {
/* 262 */                           Log.w("CXCP", "Unexpected CameraAccessException: " + cameraAccessException);
/* 265 */                           i = 11;
                                } else {
/* 269 */                           i = 2;
                                }
/* 267 */                       z2 = true;
                            } else {
/* 277 */                       i = 3;
                            }
/* 278 */                   iIl0l10l.I00000oIO(z2, str, i);
/* 281 */                   z = false;
/* 282 */                   ooiIlOl1iI = null;
/* 359 */                   String.format(null, "%.3f ms", Arrays.copyOf(new Object[]{Double.valueOf(IIlIOloOOO.I0000oI00(j) / 1000000.0d)}, 1));
/* 362 */                   if (ooiIlOl1iI == null) {
                            }
/* 391 */                   if (ooiIlOl1iI != null) {
                            }
                        }
/* 136 */               iIl0l10l = iIl0l10l2;
/* 144 */               ExtensionSessionConfiguration extensionSessionConfiguration = new ExtensionSessionConfiguration(iIntValue, arrayList, iI0l011, new I0oI0IilooO(this, il1oI0O, oiloill1, this.I00iio, this.I00ilI0I1, iI0l011));
/* 147 */               I0oiIOi00lo1 i0oiIOi00lo1 = il1o1i1I1I.I000O01llI0;
/* 149 */               if (i0oiIOi00lo1 != null) {
/* 161 */                   OutputConfiguration outputConfiguration = (OutputConfiguration) i0oiIOi00lo1.I00l0I0l0lO1(OOoOl0i.I00000oIO.I00000oOI(OutputConfiguration.class));
/* 163 */                   if (outputConfiguration == null) {
/* 178 */                       throw new IllegalStateException("Failed to unwrap Postview OutputConfiguration");
                            }
/* 165 */                   extensionSessionConfiguration.setPostviewOutputConfiguration(outputConfiguration);
                        }
/* 179 */               cameraDevice.createExtensionSession(extensionSessionConfiguration);
/* 182 */               ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
/* 184 */               z = false;
/* 359 */               String.format(null, "%.3f ms", Arrays.copyOf(new Object[]{Double.valueOf(IIlIOloOOO.I0000oI00(j) / 1000000.0d)}, 1));
/* 362 */               if (ooiIlOl1iI == null) {
                        }
/* 391 */               if (ooiIlOl1iI != null) {
                        }
                    } catch (Throwable th2) {
/* 190 */               th = th2;
/* 191 */               j = jElapsedRealtimeNanos;
                    }
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:37:0x008d A[Catch: all -> 0x0068, TryCatch #2 {all -> 0x0068, blocks: (B:17:0x0057, B:35:0x0089, B:37:0x008d, B:46:0x00b4, B:52:0x00d4, B:54:0x00d9, B:56:0x00df, B:58:0x00e3, B:60:0x00e7, B:63:0x00ec, B:66:0x00f1, B:67:0x00f2), top: B:82:0x0057 }] */
                /* JADX WARN: Removed duplicated region for block: B:54:0x00d9 A[Catch: all -> 0x0068, TryCatch #2 {all -> 0x0068, blocks: (B:17:0x0057, B:35:0x0089, B:37:0x008d, B:46:0x00b4, B:52:0x00d4, B:54:0x00d9, B:56:0x00df, B:58:0x00e3, B:60:0x00e7, B:63:0x00ec, B:66:0x00f1, B:67:0x00f2), top: B:82:0x0057 }] */
                /* JADX WARN: Removed duplicated region for block: B:71:0x0125  */
                /* JADX WARN: Removed duplicated region for block: B:76:0x0143  */
                /* JADX WARN: Removed duplicated region for block: B:94:? A[RETURN, SYNTHETIC] */
                /* JADX WARN: Type inference failed for: r14v10 */
                /* JADX WARN: Type inference failed for: r14v11 */
                /* JADX WARN: Type inference failed for: r14v12 */
                /* JADX WARN: Type inference failed for: r14v13 */
                /* JADX WARN: Type inference failed for: r14v17 */
                /* JADX WARN: Type inference failed for: r14v18 */
                /* JADX WARN: Type inference failed for: r14v3 */
                /* JADX WARN: Type inference failed for: r14v4 */
                /* JADX WARN: Type inference failed for: r14v5 */
                /* JADX WARN: Type inference failed for: r14v6, types: [boolean] */
                /* JADX WARN: Type inference failed for: r14v7, types: [boolean, int] */
                /* JADX WARN: Type inference failed for: r2v7 */
                /* JADX WARN: Type inference failed for: r2v8, types: [IIl0l10l] */
                /* JADX WARN: Type inference failed for: r2v9 */
                @Override
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final boolean I00o0iI0io1(ArrayList arrayList, IO0Il0o1OI iO0Il0o1OI) throws Throwable {
                    int i;
                    Locale locale;
                    ?? r14;
                    Oiloill1 oiloill1;
                    IIl0l10l iIl0l10l;
                    boolean z;
                    OoiIlOl1iI ooiIlOl1iI;
                    ?? r2;
                    ?? r142;
                    boolean z2;
/* 5 */             Oo10IliO00O oo10IliO00O = this.I00ilO0;
/* 7 */             CameraDevice cameraDevice = this.I00iiI;
/* 9 */             String str = this.I00iiO;
/* 19 */            OIoi0IIoi oIoi0IIoiI00000oIO = I00000oIO(iO0Il0o1OI);
/* 27 */            boolean zBooleanValue = ((Boolean) oIoi0IIoiI00000oIO.I00iOIl).booleanValue();
/* 34 */            Oiloill1 oiloill12 = (Oiloill1) oIoi0IIoiI00000oIO.I00iiI;
/* 37 */            if (!zBooleanValue) {
/* 36 */                return false;
                    }
/* 40 */            if (oiloill12 != null) {
/* 42 */                I00000oOI(oiloill12);
                    }
/* 47 */            String strI000o00OoI0I = IIl001iO0Io.I000o00OoI0I("CXCP#createConstrainedHighSpeedCaptureSession-", str);
/* 51 */            long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
                    try {
/* 62 */                Trace.beginSection(strI000o00OoI0I);
/* 65 */                IIl0l10l iIl0l10l2 = this.I00iio;
                        try {
                            try {
/* 71 */                        oiloill1 = oiloill12;
                            } catch (Exception e) {
/* 135 */                       e = e;
/* 136 */                       oiloill1 = oiloill12;
                            }
                            try {
                                try {
                                    try {
                                        try {
/* 84 */                                    r14 = 1;
/* 86 */                                    iIl0l10l = iIl0l10l2;
                                            try {
                                                try {
/* 97 */                                            cameraDevice.createConstrainedHighSpeedCaptureSession(arrayList, new I0lO1111(this, iO0Il0o1OI, oiloill1, this.I00iio, this.I00ilI0I1, oo10IliO00O.I00000oIO()), oo10IliO00O.I00000oIO());
/* 100 */                                           ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
                                                    z2 = r14;
                                                } catch (Exception e2) {
/* 109 */                                           e = e2;
/* 140 */                                           if (e instanceof CameraAccessException) {
/* 218 */                                               IIl0l10l iIl0l10l3 = iIl0l10l;
/* 222 */                                               if (!(e instanceof IllegalArgumentException) && !(e instanceof SecurityException) && !(e instanceof UnsupportedOperationException) && !(e instanceof NullPointerException)) {
/* 239 */                                                   if (!(e instanceof IllegalStateException)) {
/* 242 */                                                       throw e;
                                                            }
                                                        }
/* 259 */                                               Log.w("CXCP", "Failed to execute call: Unexpected exception: " + e.getMessage());
/* 264 */                                               z = false;
/* 265 */                                               iIl0l10l3.I00000oIO(false, str, 9);
/* 268 */                                               ooiIlOl1iI = null;
                                                        r142 = r14;
/* 289 */                                               String.format(null, "%.3f ms", Arrays.copyOf(new Object[]{Double.valueOf(IIlIOloOOO.I0000oI00(jElapsedRealtimeNanos) / 1000000.0d)}, (int) r142));
/* 292 */                                               if (ooiIlOl1iI == null) {
                                                        }
                                                        if (ooiIlOl1iI != null) {
                                                        }
                                                    } else {
/* 158 */                                               Log.w("CXCP", "Failed to execute call: Camera encountered an error: " + e.getMessage());
/* 161 */                                               CameraAccessException cameraAccessException = (CameraAccessException) e;
/* 163 */                                               int reason = cameraAccessException.getReason();
/* 167 */                                               int i2 = 3;
/* 168 */                                               if (reason == r14) {
/* 200 */                                                   r2 = iIl0l10l;
/* 213 */                                                   r2.I00000oIO(r14, str, i2);
                                                        } else {
/* 171 */                                                   if (reason == 2) {
/* 211 */                                                       i2 = 6;
                                                            } else if (reason == 3) {
/* 207 */                                                       r2 = iIl0l10l;
/* 209 */                                                       i2 = 0;
/* 213 */                                                       r2.I00000oIO(r14, str, i2);
                                                            } else if (reason == 4) {
/* 205 */                                                       i2 = r14 == true ? 1 : 0;
                                                            } else if (reason != 5) {
/* 195 */                                                       Log.w("CXCP", "Unexpected CameraAccessException: " + cameraAccessException);
/* 198 */                                                       i2 = 11;
                                                            } else {
/* 203 */                                                       i2 = 2;
                                                            }
/* 200 */                                                   r2 = iIl0l10l;
/* 213 */                                                   r2.I00000oIO(r14, str, i2);
                                                        }
/* 289 */                                               String.format(null, "%.3f ms", Arrays.copyOf(new Object[]{Double.valueOf(IIlIOloOOO.I0000oI00(jElapsedRealtimeNanos) / 1000000.0d)}, (int) r142));
/* 292 */                                               if (ooiIlOl1iI == null) {
                                                        }
                                                        if (ooiIlOl1iI != null) {
                                                        }
                                                    }
/* 216 */                                           ooiIlOl1iI = null;
                                                    z2 = r14;
/* 102 */                                           z = false;
                                                    r142 = z2;
/* 289 */                                           String.format(null, "%.3f ms", Arrays.copyOf(new Object[]{Double.valueOf(IIlIOloOOO.I0000oI00(jElapsedRealtimeNanos) / 1000000.0d)}, (int) r142));
/* 292 */                                           if (ooiIlOl1iI == null) {
                                                    }
                                                    if (ooiIlOl1iI != null) {
                                                    }
                                                }
                                            } catch (Throwable th) {
/* 105 */                                       th = th;
/* 106 */                                       locale = null;
                                                i = r14;
/* 348 */                                       String.format(locale, "%.3f ms", Arrays.copyOf(new Object[]{Double.valueOf(IIlIOloOOO.I0000oI00(jElapsedRealtimeNanos) / 1000000.0d)}, i));
/* 900 */                                       throw th;
                                            }
                                        } catch (Exception e3) {
/* 115 */                                   e = e3;
/* 116 */                                   r14 = 1;
/* 118 */                                   iIl0l10l = iIl0l10l2;
                                        }
                                    } catch (Exception e4) {
/* 121 */                               e = e4;
/* 122 */                               iIl0l10l = iIl0l10l2;
/* 124 */                               r14 = 1;
                                    }
                                } catch (Throwable th2) {
/* 111 */                           th = th2;
/* 112 */                           r14 = 1;
                                }
                            } catch (Exception e5) {
/* 130 */                       e = e5;
/* 131 */                       r14 = 1;
/* 132 */                       iIl0l10l = iIl0l10l2;
/* 140 */                       if (e instanceof CameraAccessException) {
                                }
/* 216 */                       ooiIlOl1iI = null;
                                z2 = r14;
/* 102 */                       z = false;
                                r142 = z2;
/* 289 */                       String.format(null, "%.3f ms", Arrays.copyOf(new Object[]{Double.valueOf(IIlIOloOOO.I0000oI00(jElapsedRealtimeNanos) / 1000000.0d)}, (int) r142));
/* 292 */                       if (ooiIlOl1iI == null) {
                                }
                                if (ooiIlOl1iI != null) {
                                }
                            }
/* 102 */                   z = false;
                            r142 = z2;
/* 289 */                   String.format(null, "%.3f ms", Arrays.copyOf(new Object[]{Double.valueOf(IIlIOloOOO.I0000oI00(jElapsedRealtimeNanos) / 1000000.0d)}, (int) r142));
/* 292 */                   if (ooiIlOl1iI == null) {
/* 313 */                       Log.w("CXCP", "Failed to create capture session from " + cameraDevice + ". Finalizing previous session");
/* 316 */                       if (oiloill1 != null) {
/* 318 */                           I0000O(oiloill1);
                                }
                            }
                            return ooiIlOl1iI != null ? r142 : z;
                        } catch (Throwable th3) {
/* 127 */                   th = th3;
/* 128 */                   r14 = 1;
                        }
                    } catch (Throwable th4) {
/* 326 */               th = th4;
/* 327 */               i = 1;
/* 328 */               locale = null;
                    }
                }

                public final String toString() {
/* 22 */            return "AndroidCameraDevice(camera=" + ((Object) IIllI0o.I0000Il00O(this.I00iiO)) + ')';
                }
            }

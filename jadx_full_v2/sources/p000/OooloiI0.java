            package p000;

            import android.hardware.camera2.CaptureRequest;
            import android.hardware.camera2.TotalCaptureResult;
            import android.hardware.camera2.params.InputConfiguration;
            import android.util.Log;
            import java.util.ArrayList;
            import java.util.List;
            
            public final class OooloiI0 implements IIlOl1oOlo1o {
                public I0lIi00oO I00iOIl;
                public Object I00iiI;
                public boolean I00iiO;

                @Override
                public final boolean I000II(IoloIII01 ioloIII01, ArrayList arrayList, IO0Il0o1OI iO0Il0o1OI) {
                    boolean zI000II;
                    synchronized (this.I00iiI) {
                        try {
/* 6 */                     if (this.I00iiO) {
/* 12 */                        Log.w("CXCP", "createReprocessableCaptureSessionByConfigurations failed: Virtual device disconnected");
/* 15 */                        iO0Il0o1OI.I00000oIO();
/* 18 */                        zI000II = false;
                            } else {
/* 24 */                        zI000II = this.I00iOIl.I000II(ioloIII01, arrayList, iO0Il0o1OI);
                            }
                        } catch (Throwable th) {
/* 98 */                    throw th;
                        }
                    }
/* 29 */            return zI000II;
                }

                @Override
                public final boolean I000O01llI0(ArrayList arrayList, IO0Il0o1OI iO0Il0o1OI) {
                    boolean zI000O01llI0;
                    synchronized (this.I00iiI) {
                        try {
/* 6 */                     if (this.I00iiO) {
/* 12 */                        Log.w("CXCP", "createCaptureSessionByOutputConfigurations failed: Virtual device disconnected");
/* 15 */                        iO0Il0o1OI.I00000oIO();
/* 18 */                        zI000O01llI0 = false;
                            } else {
/* 24 */                        zI000O01llI0 = this.I00iOIl.I000O01llI0(arrayList, iO0Il0o1OI);
                            }
                        } catch (Throwable th) {
/* 37 */                    throw th;
                        }
                    }
/* 29 */            return zI000O01llI0;
                }

                @Override
                public final String I000l1() {
/* 3 */             return this.I00iOIl.I00iiO;
                }

                @Override
                public final CaptureRequest.Builder I00100l0(TotalCaptureResult totalCaptureResult) {
                    CaptureRequest.Builder builderI00100l0;
                    synchronized (this.I00iiI) {
                        try {
/* 6 */                     if (this.I00iiO) {
/* 12 */                        Log.w("CXCP", "createReprocessCaptureRequest failed: Virtual device disconnected");
/* 15 */                        builderI00100l0 = null;
                            } else {
/* 21 */                        builderI00100l0 = this.I00iOIl.I00100l0(totalCaptureResult);
                            }
                        } catch (Throwable th) {
/* 29 */                    throw th;
                        }
                    }
/* 26 */            return builderI00100l0;
                }

                @Override
                public final boolean I001i1lo1io(InputConfiguration inputConfiguration, ArrayList arrayList, IO0Il0o1OI iO0Il0o1OI) {
                    boolean zI001i1lo1io;
                    synchronized (this.I00iiI) {
                        try {
/* 6 */                     if (this.I00iiO) {
/* 12 */                        Log.w("CXCP", "createReprocessableCaptureSession failed: Virtual device disconnected");
/* 15 */                        iO0Il0o1OI.I00000oIO();
/* 18 */                        zI001i1lo1io = false;
                            } else {
/* 24 */                        zI001i1lo1io = this.I00iOIl.I001i1lo1io(inputConfiguration, arrayList, iO0Il0o1OI);
                            }
                        } catch (Throwable th) {
/* 98 */                    throw th;
                        }
                    }
/* 29 */            return zI001i1lo1io;
                }

                @Override
                public final void I001l0I00(int i) {
/* 3 */             this.I00iOIl.I001l0I00(i);
                }

                @Override
                public final void I00IioO0OiOi() {
/* 3 */             this.I00iOIl.I00IioO0OiOi();
                }

                @Override
                public final boolean I00OIl(Oilo110oloIl oilo110oloIl) {
                    boolean zI00OIl;
                    synchronized (this.I00iiI) {
                        try {
/* 6 */                     if (this.I00iiO) {
/* 12 */                        Log.w("CXCP", "createCaptureSession failed: Virtual device disconnected");
/* 17 */                        oilo110oloIl.I0000oI00.I00000oIO();
/* 20 */                        zI00OIl = false;
                            } else {
/* 26 */                        zI00OIl = this.I00iOIl.I00OIl(oilo110oloIl);
                            }
                        } catch (Throwable th) {
/* 77 */                    throw th;
                        }
                    }
/* 31 */            return zI00OIl;
                }

                @Override
                public final CaptureRequest.Builder I00OOll1(int i) {
                    CaptureRequest.Builder builderI00OOll1;
                    synchronized (this.I00iiI) {
                        try {
/* 6 */                     if (this.I00iiO) {
/* 12 */                        Log.w("CXCP", "createCaptureRequest failed: Virtual device disconnected");
/* 15 */                        builderI00OOll1 = null;
                            } else {
/* 21 */                        builderI00OOll1 = this.I00iOIl.I00OOll1(i);
                            }
                        } catch (Throwable th) {
/* 29 */                    throw th;
                        }
                    }
/* 26 */            return builderI00OOll1;
                }

                @Override
                public final boolean I00iiI(List list, IO0Il0o1OI iO0Il0o1OI) {
                    boolean zI00iiI;
                    synchronized (this.I00iiI) {
                        try {
/* 6 */                     if (this.I00iiO) {
/* 12 */                        Log.w("CXCP", "createCaptureSession failed: Virtual device disconnected");
/* 15 */                        iO0Il0o1OI.I00000oIO();
/* 18 */                        zI00iiI = false;
                            } else {
/* 24 */                        zI00iiI = this.I00iOIl.I00iiI(list, iO0Il0o1OI);
                            }
                        } catch (Throwable th) {
/* 37 */                    throw th;
                        }
                    }
/* 29 */            return zI00iiI;
                }

                @Override
                public final void I00ioIO() {
/* 3 */             this.I00iOIl.I00ioIO();
                }

                @Override
                public final Object I00l0I0l0lO1(O0IOli0o0 o0IOli0o0) {
/* 3 */             return this.I00iOIl.I00l0I0l0lO1(o0IOli0o0);
                }

                @Override
                public final boolean I00lll10(Il1o1i1I1I il1o1i1I1I) {
                    boolean zI00lll10;
                    synchronized (this.I00iiI) {
                        try {
/* 6 */                     if (this.I00iiO) {
/* 12 */                        Log.w("CXCP", "createExtensionSession failed: Virtual device disconnected");
/* 17 */                        il1o1i1I1I.I000II.I00000oIO();
/* 20 */                        zI00lll10 = false;
                            } else {
/* 26 */                        zI00lll10 = this.I00iOIl.I00lll10(il1o1i1I1I);
                            }
                        } catch (Throwable th) {
/* 77 */                    throw th;
                        }
                    }
/* 31 */            return zI00lll10;
                }

                @Override
                public final boolean I00o0iI0io1(ArrayList arrayList, IO0Il0o1OI iO0Il0o1OI) {
                    boolean zI00o0iI0io1;
                    synchronized (this.I00iiI) {
                        try {
/* 6 */                     if (this.I00iiO) {
/* 12 */                        Log.w("CXCP", "createConstrainedHighSpeedCaptureSession failed: Virtual device disconnected");
/* 15 */                        iO0Il0o1OI.I00000oIO();
/* 18 */                        zI00o0iI0io1 = false;
                            } else {
/* 24 */                        zI00o0iI0io1 = this.I00iOIl.I00o0iI0io1(arrayList, iO0Il0o1OI);
                            }
                        } catch (Throwable th) {
/* 37 */                    throw th;
                        }
                    }
/* 29 */            return zI00o0iI0io1;
                }
            }

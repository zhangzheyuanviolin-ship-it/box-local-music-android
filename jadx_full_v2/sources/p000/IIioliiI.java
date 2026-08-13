            package p000;

            import android.hardware.camera2.CameraAccessException;
            import android.hardware.camera2.CameraManager;
            import android.util.Log;
            import java.lang.invoke.VarHandle;
            
/* 10 */    public final class IIioliiI extends CameraManager.AvailabilityCallback {
                public final int I00000oIO = 1;
                public final OOIoOo0O I00000oOI;
                public final Object I0000Il00O;

                public IIioliiI(OOIoOo0O oOIoOo0O, IIioo1 iIioo1) {
/* 4 */             this.I00000oOI = oOIoOo0O;
/* 6 */             this.I0000Il00O = iIioo1;
                }

                @Override
                public void onCameraAccessPrioritiesChanged() {
                    switch (this.I00000oIO) {
                        case 0:
/* 20 */                    if (iOlI0o0II.I00000oIO(this.I00000oOI, IIo1O0.I00000oIO) instanceof IO10l0l0) {
/* 26 */                        Log.w("CXCP", "Failed to emit CameraPrioritiesChanged");
                                break;
                            }
                            break;
                        default:
/* 6 */                     super.onCameraAccessPrioritiesChanged();
                            break;
                    }
                }

                @Override
                public final void onCameraAvailable(String str) throws CameraAccessException {
/* 1 */             int i = this.I00000oIO;
/* 3 */             OOIoOo0O oOIoOo0O = this.I00000oOI;
/* 5 */             Object obj = this.I0000Il00O;
                    switch (i) {
                        case 0:
/* 25 */                    if (str.equals(((IIioo1) obj).I00iiI)) {
/* 30 */                        IIllI0o.I00000oOI(str);
/* 33 */                        IIo1Ill1I iIo1Ill1I = new IIo1Ill1I();
/* 36 */                        iIo1Ill1I.I00000oIO = str;
/* 38 */                        VarHandle.storeStoreFence();
/* 47 */                        if (iOlI0o0II.I00000oIO(oOIoOo0O, iIo1Ill1I) instanceof IO10l0l0) {
/* 70 */                            Log.w("CXCP", "Failed to emit CameraAvailable(" + str + ')');
                                    break;
                                }
                            }
                            break;
                        default:
/* 13 */                    ((IIl01i0I) obj).I0000Il00O(oOIoOo0O, str, true);
                            break;
                    }
                }

                @Override
                public final void onCameraUnavailable(String str) throws CameraAccessException {
/* 1 */             int i = this.I00000oIO;
/* 3 */             OOIoOo0O oOIoOo0O = this.I00000oOI;
/* 5 */             Object obj = this.I0000Il00O;
                    switch (i) {
                        case 0:
/* 25 */                    if (str.equals(((IIioo1) obj).I00iiI)) {
/* 30 */                        IIllI0o.I00000oOI(str);
/* 42 */                        if (iOlI0o0II.I00000oIO(oOIoOo0O, new IIo1O0l(str)) instanceof IO10l0l0) {
/* 65 */                            Log.w("CXCP", "Failed to emit CameraUnavailable(" + str + ')');
                                    break;
                                }
                            }
                            break;
                        default:
/* 13 */                    ((IIl01i0I) obj).I0000Il00O(oOIoOo0O, str, false);
                            break;
                    }
                }

/* 11 */        public IIioliiI(IIl01i0I iIl01i0I, OOIoOo0O oOIoOo0O) {
                    this.I0000Il00O = iIl01i0I;
                    this.I00000oOI = oOIoOo0O;
                }
            }

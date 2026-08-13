            package androidx.window.layout.adapter.sidecar;

            import android.os.IBinder;
            import androidx.window.sidecar.SidecarDeviceState;
            import androidx.window.sidecar.SidecarInterface;
            import androidx.window.sidecar.SidecarWindowLayoutInfo;
            import java.util.WeakHashMap;
            import p000.O0000Ioio00;
            import p000.Ol01o1oOI;
            import p000.Ol01ol0;
            
            public class DistinctElementSidecarCallback implements SidecarInterface.SidecarCallback {
                public Object I00000oIO;
                public SidecarDeviceState I00000oOI;
                public WeakHashMap I0000Il00O;
                public Ol01ol0 I0000O;
                public SidecarInterface.SidecarCallback I0000oI00;

                /* JADX WARN: Code restructure failed: missing block: B:20:0x002c, code lost:
                
                    if (r1 == r2) goto L21;
                 */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public void onDeviceStateChanged(SidecarDeviceState sidecarDeviceState) {
/* 1 */             if (sidecarDeviceState == null) {
/* 3 */                 return;
                    }
                    synchronized (this.I00000oIO) {
                        try {
/* 7 */                     Ol01ol0 ol01ol0 = this.I0000O;
/* 9 */                     SidecarDeviceState sidecarDeviceState2 = this.I00000oOI;
/* 11 */                    ol01ol0.getClass();
/* 18 */                    if (!O0000Ioio00.I0000O(sidecarDeviceState2, sidecarDeviceState)) {
/* 21 */                        if (sidecarDeviceState2 != null) {
/* 24 */                            int iI00000oIO = Ol01o1oOI.I00000oIO(sidecarDeviceState2);
/* 28 */                            int i = 0;
/* 30 */                            if (iI00000oIO < 0 || iI00000oIO > 4) {
/* 34 */                                iI00000oIO = 0;
                                    }
/* 35 */                            int iI00000oIO2 = Ol01o1oOI.I00000oIO(sidecarDeviceState);
/* 39 */                            if (iI00000oIO2 >= 0 && iI00000oIO2 <= 4) {
/* 44 */                                i = iI00000oIO2;
                                    }
                                }
/* 51 */                        this.I00000oOI = sidecarDeviceState;
/* 56 */                        this.I0000oI00.onDeviceStateChanged(sidecarDeviceState);
                            }
                        } finally {
                        }
                    }
                }

                public void onWindowLayoutChanged(IBinder iBinder, SidecarWindowLayoutInfo sidecarWindowLayoutInfo) {
                    synchronized (this.I00000oIO) {
                        try {
/* 10 */                    SidecarWindowLayoutInfo sidecarWindowLayoutInfo2 = (SidecarWindowLayoutInfo) this.I0000Il00O.get(iBinder);
/* 14 */                    this.I0000O.getClass();
/* 45 */                    if (O0000Ioio00.I0000O(sidecarWindowLayoutInfo2, sidecarWindowLayoutInfo) ? true : (sidecarWindowLayoutInfo2 == null || sidecarWindowLayoutInfo == null) ? false : Ol01ol0.I00000oOI(Ol01o1oOI.I00000oOI(sidecarWindowLayoutInfo2), Ol01o1oOI.I00000oOI(sidecarWindowLayoutInfo))) {
/* 48 */                        return;
                            }
/* 53 */                    this.I0000Il00O.put(iBinder, sidecarWindowLayoutInfo);
/* 59 */                    this.I0000oI00.onWindowLayoutChanged(iBinder, sidecarWindowLayoutInfo);
                        } finally {
                        }
                    }
                }
            }

            package p000;

            import android.hardware.camera2.CameraDevice;
            import android.hardware.camera2.params.SessionConfiguration;
            import java.util.ArrayList;
            import java.util.Iterator;
            
            public final class I0ii1OiO {
                public final int I00000oIO;
                public Object I00000oOI;

                public final IIi0oIl I00000oIO(SessionConfiguration sessionConfiguration) throws NumberFormatException {
                    switch (this.I00000oIO) {
                        case 0:
/* 40 */                    Iterator it = ((ArrayList) this.I00000oOI).iterator();
/* 48 */                    while (it.hasNext()) {
/* 56 */                        IIi0oIl iIi0oIlI00000oIO = ((I0ii1OiO) it.next()).I00000oIO(sessionConfiguration);
/* 62 */                        if (iIi0oIlI00000oIO.I00iOIl != 0) {
/* 71 */                            return iIi0oIlI00000oIO;
                                }
                            }
/* 68 */                    return new IIi0oIl(0);
                        default:
/* 20 */                    int i = ((CameraDevice.CameraDeviceSetup) this.I00000oOI).isSessionConfigurationSupported(sessionConfiguration) ? 1 : 2;
/* 23 */                    String property = System.getProperty("ro.build.date.utc");
/* 27 */                    if (property != null) {
                                try {
/* 29 */                            Long.parseLong(property);
                                } catch (NumberFormatException unused) {
                                }
                            }
/* 32 */                    return new IIi0oIl(i);
                    }
                }
            }

            package p000;

            import android.content.Context;
            import android.hardware.camera2.CameraCaptureSession;
            import android.hardware.camera2.CaptureFailure;
            import android.hardware.camera2.CaptureRequest;
            import android.hardware.camera2.TotalCaptureResult;
            import android.view.Surface;
            import androidx.work.impl.WorkDatabase;
            import java.util.Iterator;
            import java.util.List;
            
            public final class IIl1IO implements Runnable {
                public final int I00iOIl;
                public Object I00iiI;
                public Object I00iiO;
                public Object I00iio;
                public Object I00ilI0I1;

                public IIl1IO(int i) {
/* 1 */             this.I00iOIl = i;
                }

                @Override
                public final void run() {
                    switch (this.I00iOIl) {
                        case 0:
/* 211 */                   ((IIoIIOi1O) this.I00iiI).I00000oIO.onCaptureCompleted((CameraCaptureSession) this.I00iiO, (CaptureRequest) this.I00iio, (TotalCaptureResult) this.I00ilI0I1);
                            break;
                        case 1:
/* 189 */                   ((IIoIIOi1O) this.I00iiI).I00000oIO.onCaptureFailed((CameraCaptureSession) this.I00iiO, (CaptureRequest) this.I00iio, (CaptureFailure) this.I00ilI0I1);
                            break;
                        case 2:
/* 98 */                    Context context = (Context) this.I00iiI;
/* 102 */                   O0oiOi o0oiOi = (O0oiOi) this.I00iiO;
/* 106 */                   Ioi1Io1o ioi1Io1o = (Ioi1Io1o) this.I00iio;
/* 110 */                   OOIIooi oOIIooi = (OOIIooi) this.I00ilI0I1;
/* 112 */                   OOIl1Io0 oOIl1Io0 = OOIl1Io0.I00000oOI;
/* 122 */                   OOIl1Io0 oOIl1Io02 = (OOIl1Io0) lIIOO11.I00000oIO(context).get();
/* 130 */                   OOIIOiolI oOIIOiolII00000oOI = new IIl0lo1oi(1).I00000oOI();
/* 138 */                   oOIIOiolII00000oOI.I00IO1oi11O(oOIIooi.getSurfaceProvider());
                            try {
/* 141 */                       oOIl1Io02.I00000oOI();
/* 154 */                       oOIl1Io02.I00000oIO(o0oiOi, IIo0l1.I0000Il00O, oOIIOiolII00000oOI, ioi1Io1o);
                                break;
                            } catch (Exception e) {
/* 167 */                       IIlIOloOOO.I001iOo1i0O("Describe camera bind failed: ", e.getMessage(), "GeminiNanoHub");
/* 170 */                       return;
                            }
                        case 3:
/* 56 */                    List list = (List) this.I00iiI;
/* 60 */                    i01IIlI i01iili = (i01IIlI) this.I00iiO;
/* 64 */                    IOllii iOllii = (IOllii) this.I00iio;
/* 68 */                    WorkDatabase workDatabase = (WorkDatabase) this.I00ilI0I1;
/* 70 */                    Iterator it = list.iterator();
/* 78 */                    while (it.hasNext()) {
/* 88 */                        ((OiOI1oIoooI) it.next()).I0000oI00(i01iili.I00000oIO);
                            }
/* 92 */                    OiOIOI.I00000oOI(iOllii, workDatabase, list);
                            break;
                        default:
/* 8 */                     Oo0oI1oo oo0oI1oo = (Oo0oI1oo) this.I00iiI;
/* 12 */                    Surface surface = (Surface) this.I00iiO;
/* 16 */                    IIiOiI0il iIiOiI0il = (IIiOiI0il) this.I00iio;
/* 20 */                    Oll0I0l1i1 oll0I0l1i1 = (Oll0I0l1i1) this.I00ilI0I1;
/* 25 */                    l11I11lO.I0000O(3, "TextureViewImpl");
/* 28 */                    IiI0oIlol0 iiI0oIlol0 = oo0oI1oo.I000l1;
/* 31 */                    if (iiI0oIlol0 != null) {
/* 33 */                        iiI0oIlol0.I00000oIO();
/* 36 */                        oo0oI1oo.I000l1 = null;
                            }
/* 38 */                    surface.release();
/* 43 */                    if (oo0oI1oo.I000II == iIiOiI0il) {
/* 45 */                        oo0oI1oo.I000II = null;
                            }
/* 49 */                    if (oo0oI1oo.I000O01llI0 == oll0I0l1i1) {
/* 51 */                        oo0oI1oo.I000O01llI0 = null;
                                break;
                            }
                            break;
                    }
                }
            }

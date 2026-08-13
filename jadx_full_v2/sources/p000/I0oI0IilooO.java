            package p000;

            import android.hardware.camera2.CameraCaptureSession;
            import android.hardware.camera2.CameraExtensionSession;
            import java.lang.invoke.VarHandle;
            import java.util.HashMap;
            import java.util.Iterator;
            import java.util.List;
            
            public final class I0oI0IilooO extends CameraExtensionSession.StateCallback {
                public final I0lIi00oO I00000oIO;
                public final Il1oI0O I00000oOI;
                public final IIl0l10l I0000Il00O;
                public final I1I0i0Ilo1Oi I0000O;
                public final II0l011 I0000oI00;
                public final I1OooIoiIO I0001Ioi1lo;
                public final I1OooIoiIO I000II = iOOOIOoiIlII.I0000O(null);

                public I0oI0IilooO(I0lIi00oO i0lIi00oO, Il1oI0O il1oI0O, Oiloill1 oiloill1, IIl0l10l iIl0l10l, I1I0i0Ilo1Oi i1I0i0Ilo1Oi, II0l011 iI0l011) {
/* 4 */             this.I00000oIO = i0lIi00oO;
/* 6 */             this.I00000oOI = il1oI0O;
/* 8 */             this.I0000Il00O = iIl0l10l;
/* 10 */            this.I0000O = i1I0i0Ilo1Oi;
/* 12 */            this.I0000oI00 = iI0l011;
/* 18 */            this.I0001Ioi1lo = iOOOIOoiIlII.I0000O(oiloill1);
                }

                public final I0lIl0ol1IO I00000oIO(CameraExtensionSession cameraExtensionSession, IIl0l10l iIl0l10l) {
/* 5 */             I0lIl0ol1IO i0lIl0ol1IO = (I0lIl0ol1IO) this.I000II.I00000oIO;
/* 7 */             if (i0lIl0ol1IO != null) {
/* 9 */                 return i0lIl0ol1IO;
                    }
/* 12 */            I0lIi00oO i0lIi00oO = this.I00000oIO;
/* 14 */            II0l011 iI0l011 = this.I0000oI00;
/* 16 */            I0lIl0ol1IO i0lIl0ol1IO2 = new I0lIl0ol1IO();
/* 19 */            i0lIl0ol1IO2.I00iOIl = i0lIi00oO;
/* 21 */            i0lIl0ol1IO2.I00iiI = cameraExtensionSession;
/* 23 */            i0lIl0ol1IO2.I00iiO = iIl0l10l;
/* 25 */            i0lIl0ol1IO2.I00iio = iI0l011;
/* 27 */            I1OollilIo i1OollilIo = IIllol.I00000oIO;
/* 29 */            i1OollilIo.getClass();
/* 34 */            I1OollilIo.I00000oOI.incrementAndGet(i1OollilIo);
/* 41 */            i0lIl0ol1IO2.I00ilI0I1 = iOOOIOoiIlII.I0000Il00O();
/* 48 */            i0lIl0ol1IO2.I00ilO0 = new HashMap();
/* 50 */            VarHandle.storeStoreFence();
                    return I1OooIoiIO.I00000oOI.compareAndSet(this.I000II, null, i0lIl0ol1IO2) ? i0lIl0ol1IO2 : (I0lIl0ol1IO) this.I000II.I00000oIO;
                }

                @Override
                public final void onClosed(CameraExtensionSession cameraExtensionSession) throws Exception {
/* 1 */             IIl0l10l iIl0l10l = this.I0000Il00O;
/* 3 */             I00000oIO(cameraExtensionSession, iIl0l10l);
/* 6 */             Il1oI0O il1oI0O = this.I00000oOI;
/* 8 */             I00000oIO(cameraExtensionSession, iIl0l10l);
/* 13 */            il1oI0O.I00000oIO.I000O01llI0();
/* 25 */            Oiloill1 oiloill1 = (Oiloill1) I1OooIoiIO.I00000oOI.getAndSet(this.I0001Ioi1lo, null);
/* 27 */            if (oiloill1 != null) {
/* 29 */                oiloill1.I00000oIO();
                    }
/* 34 */            this.I00000oOI.I00000oIO();
/* 37 */            I1I0i0Ilo1Oi i1I0i0Ilo1Oi = this.I0000O;
/* 39 */            if (i1I0i0Ilo1Oi != null) {
/* 49 */                Iterator it = ((List) ((I1OooIoiIO) i1I0i0Ilo1Oi.I00iiO).I00000oIO).iterator();
/* 57 */                while (it.hasNext()) {
/* 69 */                    ((CameraCaptureSession.StateCallback) it.next()).onClosed((OOolliO) i1I0i0Ilo1Oi.I00iiI);
                        }
                    }
                }

                @Override
                public final void onConfigureFailed(CameraExtensionSession cameraExtensionSession) throws Exception {
/* 3 */             I00000oIO(cameraExtensionSession, this.I0000Il00O);
/* 10 */            this.I00000oOI.I00000oIO.I000OOo1O();
/* 22 */            Oiloill1 oiloill1 = (Oiloill1) I1OooIoiIO.I00000oOI.getAndSet(this.I0001Ioi1lo, null);
/* 24 */            if (oiloill1 != null) {
/* 26 */                oiloill1.I00000oIO();
                    }
/* 31 */            this.I00000oOI.I00000oIO();
/* 34 */            I1I0i0Ilo1Oi i1I0i0Ilo1Oi = this.I0000O;
/* 36 */            if (i1I0i0Ilo1Oi != null) {
/* 46 */                Iterator it = ((List) ((I1OooIoiIO) i1I0i0Ilo1Oi.I00iiO).I00000oIO).iterator();
/* 54 */                while (it.hasNext()) {
/* 66 */                    ((CameraCaptureSession.StateCallback) it.next()).onConfigureFailed((OOolliO) i1I0i0Ilo1Oi.I00iiI);
                        }
                    }
                }

                @Override
                public final void onConfigured(CameraExtensionSession cameraExtensionSession) {
/* 11 */            this.I00000oOI.I00000oIO.I000OiO(I00000oIO(cameraExtensionSession, this.I0000Il00O));
/* 23 */            Oiloill1 oiloill1 = (Oiloill1) I1OooIoiIO.I00000oOI.getAndSet(this.I0001Ioi1lo, null);
/* 25 */            if (oiloill1 != null) {
/* 27 */                oiloill1.I00000oIO();
                    }
/* 30 */            I1I0i0Ilo1Oi i1I0i0Ilo1Oi = this.I0000O;
/* 32 */            if (i1I0i0Ilo1Oi != null) {
/* 42 */                Iterator it = ((List) ((I1OooIoiIO) i1I0i0Ilo1Oi.I00iiO).I00000oIO).iterator();
/* 50 */                while (it.hasNext()) {
/* 62 */                    ((CameraCaptureSession.StateCallback) it.next()).onConfigured((OOolliO) i1I0i0Ilo1Oi.I00iiI);
                        }
                    }
                }
            }

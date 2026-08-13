            package p000;

            import android.hardware.camera2.CameraCaptureSession;
            import android.hardware.camera2.CameraConstrainedHighSpeedCaptureSession;
            import android.os.Handler;
            import java.lang.invoke.VarHandle;
            import java.util.Iterator;
            import java.util.List;
            
            public final class I0lO1111 extends CameraCaptureSession.StateCallback {
                public final I0lIi00oO I00000oIO;
                public final IO0Il0o1OI I00000oOI;
                public final IIl0l10l I0000Il00O;
                public final I1I0i0Ilo1Oi I0000O;
                public final Handler I0000oI00;
                public final I1OooIoiIO I0001Ioi1lo;
                public final I1OooIoiIO I000II = iOOOIOoiIlII.I0000O(null);

                public I0lO1111(I0lIi00oO i0lIi00oO, IO0Il0o1OI iO0Il0o1OI, Oiloill1 oiloill1, IIl0l10l iIl0l10l, I1I0i0Ilo1Oi i1I0i0Ilo1Oi, Handler handler) {
/* 4 */             this.I00000oIO = i0lIi00oO;
/* 6 */             this.I00000oOI = iO0Il0o1OI;
/* 8 */             this.I0000Il00O = iIl0l10l;
/* 10 */            this.I0000O = i1I0i0Ilo1Oi;
/* 12 */            this.I0000oI00 = handler;
/* 18 */            this.I0001Ioi1lo = iOOOIOoiIlII.I0000O(oiloill1);
                }

                public final IIlIIOi I00000oIO(CameraCaptureSession cameraCaptureSession, IIl0l10l iIl0l10l) {
                    I0lIIO i0lIIO;
/* 5 */             IIlIIOi iIlIIOi = (IIlIIOi) this.I000II.I00000oIO;
/* 7 */             if (iIlIIOi != null) {
/* 9 */                 return iIlIIOi;
                    }
/* 10 */            Handler handler = this.I0000oI00;
/* 12 */            boolean z = cameraCaptureSession instanceof CameraConstrainedHighSpeedCaptureSession;
/* 14 */            I0lIi00oO i0lIi00oO = this.I00000oIO;
/* 16 */            if (z) {
/* 20 */                CameraConstrainedHighSpeedCaptureSession cameraConstrainedHighSpeedCaptureSession = (CameraConstrainedHighSpeedCaptureSession) cameraCaptureSession;
/* 22 */                I0lIOolO i0lIOolO = new I0lIOolO(i0lIi00oO, cameraConstrainedHighSpeedCaptureSession, iIl0l10l, handler);
/* 25 */                i0lIOolO.I00ilI0I1 = cameraConstrainedHighSpeedCaptureSession;
/* 27 */                VarHandle.storeStoreFence();
                        i0lIIO = i0lIOolO;
                    } else {
/* 33 */                i0lIIO = new I0lIIO(i0lIi00oO, cameraCaptureSession, iIl0l10l, handler);
                    }
                    return I1OooIoiIO.I00000oOI.compareAndSet(this.I000II, null, i0lIIO) ? i0lIIO : (IIlIIOi) this.I000II.I00000oIO;
                }

                @Override
                public final void onActive(CameraCaptureSession cameraCaptureSession) {
/* 3 */             I00000oIO(cameraCaptureSession, this.I0000Il00O);
/* 6 */             IO0Il0o1OI iO0Il0o1OI = this.I00000oOI;
/* 10 */            I00000oIO(cameraCaptureSession, this.I0000Il00O);
/* 13 */            iO0Il0o1OI.toString();
/* 16 */            I1I0i0Ilo1Oi i1I0i0Ilo1Oi = this.I0000O;
/* 18 */            if (i1I0i0Ilo1Oi != null) {
/* 28 */                Iterator it = ((List) ((I1OooIoiIO) i1I0i0Ilo1Oi.I00iiO).I00000oIO).iterator();
/* 36 */                while (it.hasNext()) {
/* 48 */                    ((CameraCaptureSession.StateCallback) it.next()).onActive((OOolliO) i1I0i0Ilo1Oi.I00iiI);
                        }
                    }
                }

                @Override
                public final void onCaptureQueueEmpty(CameraCaptureSession cameraCaptureSession) {
/* 3 */             I00000oIO(cameraCaptureSession, this.I0000Il00O);
/* 6 */             IO0Il0o1OI iO0Il0o1OI = this.I00000oOI;
/* 10 */            I00000oIO(cameraCaptureSession, this.I0000Il00O);
/* 13 */            iO0Il0o1OI.toString();
/* 16 */            I1I0i0Ilo1Oi i1I0i0Ilo1Oi = this.I0000O;
/* 18 */            if (i1I0i0Ilo1Oi != null) {
/* 22 */                OOolliO oOolliO = (OOolliO) i1I0i0Ilo1Oi.I00iiI;
/* 32 */                Iterator it = ((List) ((I1OooIoiIO) i1I0i0Ilo1Oi.I00iiO).I00000oIO).iterator();
/* 40 */                while (it.hasNext()) {
/* 48 */                    ((CameraCaptureSession.StateCallback) it.next()).onCaptureQueueEmpty(oOolliO);
                        }
                    }
                }

                @Override
                public final void onClosed(CameraCaptureSession cameraCaptureSession) throws Exception {
/* 1 */             IIl0l10l iIl0l10l = this.I0000Il00O;
/* 3 */             I00000oIO(cameraCaptureSession, iIl0l10l);
/* 6 */             IO0Il0o1OI iO0Il0o1OI = this.I00000oOI;
/* 8 */             I00000oIO(cameraCaptureSession, iIl0l10l);
/* 11 */            iO0Il0o1OI.I000O01llI0();
/* 23 */            Oiloill1 oiloill1 = (Oiloill1) I1OooIoiIO.I00000oOI.getAndSet(this.I0001Ioi1lo, null);
/* 25 */            if (oiloill1 != null) {
/* 27 */                oiloill1.I00000oIO();
                    }
/* 32 */            this.I00000oOI.I00000oIO();
/* 35 */            I1I0i0Ilo1Oi i1I0i0Ilo1Oi = this.I0000O;
/* 37 */            if (i1I0i0Ilo1Oi != null) {
/* 47 */                Iterator it = ((List) ((I1OooIoiIO) i1I0i0Ilo1Oi.I00iiO).I00000oIO).iterator();
/* 55 */                while (it.hasNext()) {
/* 67 */                    ((CameraCaptureSession.StateCallback) it.next()).onClosed((OOolliO) i1I0i0Ilo1Oi.I00iiI);
                        }
                    }
                }

                @Override
                public final void onConfigureFailed(CameraCaptureSession cameraCaptureSession) throws Exception {
/* 3 */             I00000oIO(cameraCaptureSession, this.I0000Il00O);
/* 8 */             this.I00000oOI.I000OOo1O();
/* 20 */            Oiloill1 oiloill1 = (Oiloill1) I1OooIoiIO.I00000oOI.getAndSet(this.I0001Ioi1lo, null);
/* 22 */            if (oiloill1 != null) {
/* 24 */                oiloill1.I00000oIO();
                    }
/* 29 */            this.I00000oOI.I00000oIO();
/* 32 */            I1I0i0Ilo1Oi i1I0i0Ilo1Oi = this.I0000O;
/* 34 */            if (i1I0i0Ilo1Oi != null) {
/* 44 */                Iterator it = ((List) ((I1OooIoiIO) i1I0i0Ilo1Oi.I00iiO).I00000oIO).iterator();
/* 52 */                while (it.hasNext()) {
/* 64 */                    ((CameraCaptureSession.StateCallback) it.next()).onConfigureFailed((OOolliO) i1I0i0Ilo1Oi.I00iiI);
                        }
                    }
                }

                @Override
                public final void onConfigured(CameraCaptureSession cameraCaptureSession) {
/* 9 */             this.I00000oOI.I000OiO(I00000oIO(cameraCaptureSession, this.I0000Il00O));
/* 21 */            Oiloill1 oiloill1 = (Oiloill1) I1OooIoiIO.I00000oOI.getAndSet(this.I0001Ioi1lo, null);
/* 23 */            if (oiloill1 != null) {
/* 25 */                oiloill1.I00000oIO();
                    }
/* 28 */            I1I0i0Ilo1Oi i1I0i0Ilo1Oi = this.I0000O;
/* 30 */            if (i1I0i0Ilo1Oi != null) {
/* 40 */                Iterator it = ((List) ((I1OooIoiIO) i1I0i0Ilo1Oi.I00iiO).I00000oIO).iterator();
/* 48 */                while (it.hasNext()) {
/* 60 */                    ((CameraCaptureSession.StateCallback) it.next()).onConfigured((OOolliO) i1I0i0Ilo1Oi.I00iiI);
                        }
                    }
                }

                @Override
                public final void onReady(CameraCaptureSession cameraCaptureSession) {
/* 3 */             I00000oIO(cameraCaptureSession, this.I0000Il00O);
/* 6 */             IO0Il0o1OI iO0Il0o1OI = this.I00000oOI;
/* 10 */            I00000oIO(cameraCaptureSession, this.I0000Il00O);
/* 13 */            iO0Il0o1OI.toString();
/* 16 */            I1I0i0Ilo1Oi i1I0i0Ilo1Oi = this.I0000O;
/* 18 */            if (i1I0i0Ilo1Oi != null) {
/* 28 */                Iterator it = ((List) ((I1OooIoiIO) i1I0i0Ilo1Oi.I00iiO).I00000oIO).iterator();
/* 36 */                while (it.hasNext()) {
/* 48 */                    ((CameraCaptureSession.StateCallback) it.next()).onReady((OOolliO) i1I0i0Ilo1Oi.I00iiI);
                        }
                    }
                }
            }

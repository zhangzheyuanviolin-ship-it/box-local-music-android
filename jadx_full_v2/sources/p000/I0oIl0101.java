            package p000;

            import android.hardware.camera2.CaptureResult;
            import android.hardware.camera2.TotalCaptureResult;
            
            public final class I0oIl0101 implements O1lOoI01, OoilIiI0oi {
                public final CaptureResult I00iOIl;
                public final String I00iiI;

                public I0oIl0101(CaptureResult captureResult, String str) {
/* 4 */             this.I00iOIl = captureResult;
/* 6 */             this.I00iiI = str;
                }

                @Override
                public final Object I00l0I0l0lO1(O0IOli0o0 o0IOli0o0) {
/* 1 */             OOoOl1001II oOoOl1001II = OOoOl0i.I00000oIO;
/* 9 */             boolean zEquals = o0IOli0o0.equals(oOoOl1001II.I00000oOI(CaptureResult.class));
/* 13 */            CaptureResult captureResult = this.I00iOIl;
/* 15 */            if (zEquals) {
/* 17 */                return captureResult;
                    }
/* 28 */            if (!o0IOli0o0.equals(oOoOl1001II.I00000oOI(TotalCaptureResult.class)) || captureResult == null) {
/* 34 */                return null;
                    }
/* 33 */            return captureResult;
                }

                public final String toString() {
/* 36 */            return "FrameMetadata(camera: " + ((Object) IIllI0o.I0000Il00O(this.I00iiI)) + ", frameNumber: " + this.I00iOIl.getFrameNumber() + ')';
                }
            }

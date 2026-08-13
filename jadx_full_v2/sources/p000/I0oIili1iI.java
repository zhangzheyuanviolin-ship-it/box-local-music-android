            package p000;

            import android.hardware.camera2.CaptureResult;
            import android.hardware.camera2.TotalCaptureResult;
            
            public final class I0oIili1iI implements IllIi0lI {
                public TotalCaptureResult I00iOIl;
                public I0oIl0101 I00iiI;

                @Override
                public final I0oIl0101 I0000Il00O() {
/* 1 */             return this.I00iiI;
                }

                @Override
                public final Object I00l0I0l0lO1(O0IOli0o0 o0IOli0o0) {
/* 1 */             TotalCaptureResult totalCaptureResult = this.I00iOIl;
/* 3 */             OOoOl1001II oOoOl1001II = OOoOl0i.I00000oIO;
/* 15 */            if (o0IOli0o0.equals(oOoOl1001II.I00000oOI(CaptureResult.class)) || o0IOli0o0.equals(oOoOl1001II.I00000oOI(TotalCaptureResult.class))) {
/* 30 */                return totalCaptureResult;
                    }
/* 31 */            return null;
                }

                public final String toString() {
/* 5 */             StringBuilder sb = new StringBuilder("FrameInfo(camera: ");
/* 8 */             I0oIl0101 i0oIl0101 = this.I00iiI;
/* 16 */            sb.append((Object) IIllI0o.I0000Il00O(i0oIl0101.I00iiI));
/* 21 */            sb.append(", frameNumber: ");
/* 30 */            sb.append(i0oIl0101.I00iOIl.getFrameNumber());
/* 35 */            sb.append(')');
/* 38 */            return sb.toString();
                }
            }

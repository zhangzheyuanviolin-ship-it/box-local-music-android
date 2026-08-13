            package p000;

            import android.hardware.camera2.CameraCaptureSession;
            import android.hardware.camera2.CameraExtensionSession;
            import android.hardware.camera2.CaptureRequest;
            import android.util.ArrayMap;
            import java.util.Map;
            
            public final class IIl10I1I implements Oi0Iil {
                public final IIlIIOi I00iOIl;
                public final CaptureRequest I00iiI;
                public final Map I00iiO;
                public final Map I00iio;
                public final Map I00ilI0I1;
                public final ArrayMap I00ilO0;
                public final boolean I00io1l;
                public final Oi01iIoI I00ioIO;
                public final long I00l0I0l0lO1;

                public IIl10I1I(IIlIIOi iIlIIOi, CaptureRequest captureRequest, Map map, Map map2, Map map3, ArrayMap arrayMap, boolean z, Oi01iIoI oi01iIoI, long j) {
/* 4 */             this.I00iOIl = iIlIIOi;
/* 6 */             this.I00iiI = captureRequest;
/* 8 */             this.I00iiO = map;
/* 10 */            this.I00iio = map2;
/* 12 */            this.I00ilI0I1 = map3;
/* 14 */            this.I00ilO0 = arrayMap;
/* 16 */            this.I00io1l = z;
/* 18 */            this.I00ioIO = oi01iIoI;
/* 20 */            this.I00l0I0l0lO1 = j;
                }

                @Override
                public final Object I00000oIO(O1lOllO o1lOllO, Olo0o1II0 olo0o1II0) {
/* 1 */             Object objI00000oOI = I00000oOI(o1lOllO);
                    return objI00000oOI == null ? olo0o1II0 : objI00000oOI;
                }

                @Override
                public final Object I00000oOI(O1lOllO o1lOllO) {
/* 3 */             Map map = this.I00ioIO.I0000Il00O;
/* 5 */             Map map2 = this.I00ilI0I1;
/* 11 */            if (map2.containsKey(o1lOllO)) {
/* 13 */                return map2.get(o1lOllO);
                    }
/* 22 */            if (map.containsKey(o1lOllO)) {
/* 24 */                return map.get(o1lOllO);
                    }
/* 29 */            Map map3 = this.I00iio;
                    return map3.containsKey(o1lOllO) ? map3.get(o1lOllO) : this.I00iiO.get(o1lOllO);
                }

                @Override
                public final Map I00IoiI() {
/* 1 */             return this.I00ilO0;
                }

                @Override
                public final boolean I00Ol00() {
/* 1 */             return this.I00io1l;
                }

                @Override
                public final long I00iOIl() {
/* 1 */             return this.I00l0I0l0lO1;
                }

                @Override
                public final Object I00l0I0l0lO1(O0IOli0o0 o0IOli0o0) {
                    Object objI00l0I0l0lO1;
/* 1 */             OOoOl1001II oOoOl1001II = OOoOl0i.I00000oIO;
/* 13 */            if (o0IOli0o0.equals(oOoOl1001II.I00000oOI(CaptureRequest.class))) {
/* 15 */                return this.I00iiI;
                    }
/* 24 */            boolean zEquals = o0IOli0o0.equals(oOoOl1001II.I00000oOI(CameraCaptureSession.class));
/* 28 */            IIlIIOi iIlIIOi = this.I00iOIl;
/* 30 */            if (zEquals) {
/* 36 */                Object objI00l0I0l0lO12 = iIlIIOi.I00l0I0l0lO1(oOoOl1001II.I00000oOI(CameraCaptureSession.class));
/* 40 */                if (objI00l0I0l0lO12 == null) {
/* 68 */                    return null;
                        }
/* 43 */                return objI00l0I0l0lO12;
                    }
/* 54 */            if (!o0IOli0o0.equals(oOoOl1001II.I00000oOI(CameraExtensionSession.class)) || (objI00l0I0l0lO1 = iIlIIOi.I00l0I0l0lO1(oOoOl1001II.I00000oOI(CameraExtensionSession.class))) == null) {
/* 68 */                return null;
                    }
/* 67 */            return objI00l0I0l0lO1;
                }

                @Override
                public final Oi01iIoI I00lli11() {
/* 1 */             return this.I00ioIO;
                }
            }

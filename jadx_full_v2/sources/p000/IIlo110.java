            package p000;

            import android.hardware.camera2.CameraDevice;
            
            public final class IIlo110 {
                public CameraDevice.StateCallback I00000oIO;
                public I1I0i0Ilo1Oi I00000oOI;
                public Iio1ilIOl10o I0000Il00O;

                public final boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
/* 8 */             if (!(obj instanceof IIlo110)) {
/* 7 */                 return false;
                    }
/* 11 */            IIlo110 iIlo110 = (IIlo110) obj;
                    return O0000Ioio00.I0000O(this.I00000oIO, iIlo110.I00000oIO) && O0000Ioio00.I0000O(this.I00000oOI, iIlo110.I00000oOI) && O0000Ioio00.I0000O(this.I0000Il00O, iIlo110.I0000Il00O);
                }

                public final int hashCode() {
/* 2 */             CameraDevice.StateCallback stateCallback = this.I00000oIO;
/* 12 */            int iHashCode = (stateCallback == null ? 0 : stateCallback.hashCode()) * 31;
/* 14 */            I1I0i0Ilo1Oi i1I0i0Ilo1Oi = this.I00000oOI;
/* 25 */            int iHashCode2 = (iHashCode + (i1I0i0Ilo1Oi == null ? 0 : i1I0i0Ilo1Oi.hashCode())) * 31;
/* 27 */            Iio1ilIOl10o iio1ilIOl10o = this.I0000Il00O;
/* 38 */            return iHashCode2 + (iio1ilIOl10o != null ? Long.hashCode(iio1ilIOl10o.I00000oIO) : 0);
                }

                public final String toString() {
/* 38 */            return "CameraInteropConfig(cameraDeviceStateCallback=" + this.I00000oIO + ", cameraCaptureSessionListener=" + this.I00000oOI + ", cameraOpenRetryMaxTimeoutNs=" + this.I0000Il00O + ')';
                }
            }

            package p000;
            
            public final class IO0I001I0 {
                public IIlIIOi I00000oIO;
                public I0oiil10Ili I00000oOI;
                public IIl00O I0000Il00O;

                public final boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
/* 8 */             if (obj instanceof IO0I001I0) {
/* 11 */                IO0I001I0 io0i001i0 = (IO0I001I0) obj;
                        return O0000Ioio00.I0000O(this.I00000oIO, io0i001i0.I00000oIO) && this.I00000oOI == io0i001i0.I00000oOI && this.I0000Il00O == io0i001i0.I0000Il00O;
                    }
/* 7 */             return false;
                }

                public final int hashCode() {
/* 24 */            return this.I0000Il00O.hashCode() + ((this.I00000oOI.hashCode() + (this.I00000oIO.hashCode() * 31)) * 31);
                }

                public final String toString() {
/* 38 */            return "ConfiguredCameraCaptureSession(session=" + this.I00000oIO + ", processor=" + this.I00000oOI + ", captureSequenceProcessor=" + this.I0000Il00O + ')';
                }
            }

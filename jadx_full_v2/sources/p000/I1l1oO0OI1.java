            package p000;

            import android.graphics.Matrix;
            import android.graphics.Rect;
            import android.util.Size;
            
            public final class I1l1oO0OI1 {
                public final Object I00000oIO;
                public final Il1I0ll I00000oOI;
                public final int I0000Il00O;
                public final Size I0000O;
                public final Rect I0000oI00;
                public final int I0001Ioi1lo;
                public final Matrix I000II;
                public final IIlI0I1li I000O01llI0;

                public I1l1oO0OI1(Object obj, Il1I0ll il1I0ll, int i, Size size, Rect rect, int i2, Matrix matrix, IIlI0I1li iIlI0I1li) {
/* 5 */             if (obj == null) {
/* 50 */                IOOlIIilOl0.I000II("Null data");
/* 1750 */              throw null;
                    }
/* 7 */             this.I00000oIO = obj;
/* 9 */             this.I00000oOI = il1I0ll;
/* 11 */            this.I0000Il00O = i;
/* 13 */            this.I0000O = size;
/* 15 */            if (rect == null) {
/* 44 */                IOOlIIilOl0.I000II("Null cropRect");
/* 47 */                throw null;
                    }
/* 17 */            this.I0000oI00 = rect;
/* 19 */            this.I0001Ioi1lo = i2;
/* 21 */            if (matrix == null) {
/* 38 */                IOOlIIilOl0.I000II("Null sensorToBufferTransform");
/* 41 */                throw null;
                    }
/* 23 */            this.I000II = matrix;
/* 25 */            if (iIlI0I1li != null) {
/* 27 */                this.I000O01llI0 = iIlI0I1li;
                    } else {
/* 32 */                IOOlIIilOl0.I000II("Null cameraCaptureResult");
/* 35 */                throw null;
                    }
                }

                public final boolean equals(Object obj) {
/* 1 */             if (obj == this) {
/* 85 */                return true;
                    }
/* 7 */             if (obj instanceof I1l1oO0OI1) {
/* 9 */                 I1l1oO0OI1 i1l1oO0OI1 = (I1l1oO0OI1) obj;
/* 19 */                if (this.I00000oIO.equals(i1l1oO0OI1.I00000oIO)) {
/* 21 */                    Il1I0ll il1I0ll = i1l1oO0OI1.I00000oOI;
/* 23 */                    Il1I0ll il1I0ll2 = this.I00000oOI;
/* 25 */                    if (il1I0ll2 == null) {
/* 27 */                        if (il1I0ll == null) {
                                }
                            } else if (il1I0ll2 != il1I0ll) {
/* 6 */                         return false;
                            }
/* 37 */                    if (this.I0000Il00O == i1l1oO0OI1.I0000Il00O && this.I0000O.equals(i1l1oO0OI1.I0000O) && this.I0000oI00.equals(i1l1oO0OI1.I0000oI00) && this.I0001Ioi1lo == i1l1oO0OI1.I0001Ioi1lo && this.I000II.equals(i1l1oO0OI1.I000II) && this.I000O01llI0.equals(i1l1oO0OI1.I000O01llI0)) {
/* 85 */                        return true;
                            }
                        }
                    }
/* 6 */             return false;
                }

                public final int hashCode() {
/* 11 */            int iHashCode = (this.I00000oIO.hashCode() ^ 1000003) * 1000003;
/* 12 */            Il1I0ll il1I0ll = this.I00000oOI;
/* 62 */            return this.I000O01llI0.hashCode() ^ ((((((((((((iHashCode ^ (il1I0ll == null ? 0 : il1I0ll.hashCode())) * 1000003) ^ this.I0000Il00O) * 1000003) ^ this.I0000O.hashCode()) * 1000003) ^ this.I0000oI00.hashCode()) * 1000003) ^ this.I0001Ioi1lo) * 1000003) ^ this.I000II.hashCode()) * 1000003);
                }

                public final String toString() {
/* 88 */            return "Packet{data=" + this.I00000oIO + ", exif=" + this.I00000oOI + ", format=" + this.I0000Il00O + ", size=" + this.I0000O + ", cropRect=" + this.I0000oI00 + ", rotationDegrees=" + this.I0001Ioi1lo + ", sensorToBufferTransform=" + this.I000II + ", cameraCaptureResult=" + this.I000O01llI0 + "}";
                }
            }

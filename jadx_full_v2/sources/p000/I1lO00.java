            package p000;

            import android.graphics.Matrix;
            import android.graphics.Rect;
            
            public final class I1lO00 {
                public Rect I00000oIO;
                public int I00000oOI;
                public int I0000Il00O;
                public boolean I0000O;
                public Matrix I0000oI00;
                public boolean I0001Ioi1lo;

                public final boolean equals(Object obj) {
/* 2 */             if (obj == this) {
/* 1 */                 return true;
                    }
/* 8 */             if (obj instanceof I1lO00) {
/* 10 */                I1lO00 i1lO00 = (I1lO00) obj;
/* 20 */                if (this.I00000oIO.equals(i1lO00.I00000oIO) && this.I00000oOI == i1lO00.I00000oOI && this.I0000Il00O == i1lO00.I0000Il00O && this.I0000O == i1lO00.I0000O && this.I0000oI00.equals(i1lO00.I0000oI00) && this.I0001Ioi1lo == i1lO00.I0001Ioi1lo) {
/* 1 */                     return true;
                        }
                    }
/* 7 */             return false;
                }

                public final int hashCode() {
/* 46 */            return ((((((((((this.I00000oIO.hashCode() ^ 1000003) * 1000003) ^ this.I00000oOI) * 1000003) ^ this.I0000Il00O) * 1000003) ^ (this.I0000O ? 1231 : 1237)) * 1000003) ^ this.I0000oI00.hashCode()) * 1000003) ^ (this.I0001Ioi1lo ? 1231 : 1237);
                }

                public final String toString() {
/* 5 */             StringBuilder sb = new StringBuilder("TransformationInfo{getCropRect=");
/* 10 */            sb.append(this.I00000oIO);
/* 15 */            sb.append(", getRotationDegrees=");
/* 20 */            sb.append(this.I00000oOI);
/* 25 */            sb.append(", getTargetRotation=");
/* 30 */            sb.append(this.I0000Il00O);
/* 35 */            sb.append(", hasCameraTransform=");
/* 40 */            sb.append(this.I0000O);
/* 45 */            sb.append(", getSensorToBufferTransform=");
/* 50 */            sb.append(this.I0000oI00);
/* 55 */            sb.append(", isMirroring=");
/* 62 */            return IIlIOloOOO.I0010o(sb, this.I0001Ioi1lo, "}");
                }
            }

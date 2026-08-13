            package p000;

            import android.graphics.Rect;
            import android.util.Size;
            import java.util.UUID;
            
            public final class I1l1llI1 {
                public UUID I00000oIO;
                public int I00000oOI;
                public int I0000Il00O;
                public Rect I0000O;
                public Size I0000oI00;
                public int I0001Ioi1lo;
                public boolean I000II;

                public final boolean equals(Object obj) {
/* 2 */             if (obj == this) {
/* 1 */                 return true;
                    }
/* 7 */             if (!(obj instanceof I1l1llI1)) {
/* 66 */                return false;
                    }
/* 9 */             I1l1llI1 i1l1llI1 = (I1l1llI1) obj;
                    return this.I00000oIO.equals(i1l1llI1.I00000oIO) && this.I00000oOI == i1l1llI1.I00000oOI && this.I0000Il00O == i1l1llI1.I0000Il00O && this.I0000O.equals(i1l1llI1.I0000O) && this.I0000oI00.equals(i1l1llI1.I0000oI00) && this.I0001Ioi1lo == i1l1llI1.I0001Ioi1lo && this.I000II == i1l1llI1.I000II;
                }

                public final int hashCode() {
/* 52 */            return (((this.I000II ? 1231 : 1237) ^ ((((((((((((this.I00000oIO.hashCode() ^ 1000003) * 1000003) ^ this.I00000oOI) * 1000003) ^ this.I0000Il00O) * 1000003) ^ this.I0000O.hashCode()) * 1000003) ^ this.I0000oI00.hashCode()) * 1000003) ^ this.I0001Ioi1lo) * 1000003)) * 1000003) ^ 1237;
                }

                public final String toString() {
/* 5 */             StringBuilder sb = new StringBuilder("OutConfig{getUuid=");
/* 10 */            sb.append(this.I00000oIO);
/* 15 */            sb.append(", getTargets=");
/* 20 */            sb.append(this.I00000oOI);
/* 25 */            sb.append(", getFormat=");
/* 30 */            sb.append(this.I0000Il00O);
/* 35 */            sb.append(", getCropRect=");
/* 40 */            sb.append(this.I0000O);
/* 45 */            sb.append(", getSize=");
/* 50 */            sb.append(this.I0000oI00);
/* 55 */            sb.append(", getRotationDegrees=");
/* 60 */            sb.append(this.I0001Ioi1lo);
/* 65 */            sb.append(", isMirroring=");
/* 72 */            return IIlIOloOOO.I0010o(sb, this.I000II, ", shouldRespectInputCropRect=false}");
                }
            }

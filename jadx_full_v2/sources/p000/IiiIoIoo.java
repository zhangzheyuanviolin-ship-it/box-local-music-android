            package p000;

            import java.util.Objects;
            
            public final class IiiIoIoo {
                public String I00000oIO;
                public int I00000oOI;
                public int I0000Il00O;

                public final boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
/* 7 */             if (!(obj instanceof IiiIoIoo)) {
/* 35 */                return false;
                    }
/* 10 */            IiiIoIoo iiiIoIoo = (IiiIoIoo) obj;
                    return this.I00000oIO.equals(iiiIoIoo.I00000oIO) && this.I00000oOI == iiiIoIoo.I00000oOI && this.I0000Il00O == iiiIoIoo.I0000Il00O;
                }

                public final int hashCode() {
/* 1 */             String str = this.I00000oIO;
/* 5 */             Integer numValueOf = Integer.valueOf(this.I00000oOI);
/* 11 */            Integer numValueOf2 = Integer.valueOf(this.I0000Il00O);
/* 17 */            Float fValueOf = Float.valueOf(1.0f);
/* 33 */            return Objects.hash(str, numValueOf, numValueOf2, fValueOf, 0, 0, 0, fValueOf);
                }

                public final String toString() {
/* 5 */             StringBuilder sb = new StringBuilder("DisplayShapeCompat{ spec=");
/* 18 */            sb.append(Integer.valueOf(this.I00000oIO.hashCode()));
/* 23 */            sb.append(" displayWidth=");
/* 28 */            sb.append(this.I00000oOI);
/* 33 */            sb.append(" displayHeight=");
/* 40 */            return IIl001iO0Io.I000lI(this.I0000Il00O, " physicalPixelDisplaySizeRatio=1.0 rotation=0 offsetX=0 offsetY=0 scale=1.0}", sb);
                }
            }

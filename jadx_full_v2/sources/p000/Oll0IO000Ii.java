            package p000;

            import java.util.LinkedHashMap;
            
            public final class Oll0IO000Ii {
                public LinkedHashMap I00000oIO;
                public LinkedHashMap I00000oOI;
                public int I0000Il00O;

                public final boolean equals(Object obj) {
/* 1 */             if (this == obj) {
/* 41 */                return true;
                    }
/* 6 */             if (!(obj instanceof Oll0IO000Ii)) {
/* 39 */                return false;
                    }
/* 9 */             Oll0IO000Ii oll0IO000Ii = (Oll0IO000Ii) obj;
                    return this.I00000oIO.equals(oll0IO000Ii.I00000oIO) && this.I00000oOI.equals(oll0IO000Ii.I00000oOI) && this.I0000Il00O == oll0IO000Ii.I0000Il00O;
                }

                public final int hashCode() {
/* 24 */            return Integer.hashCode(this.I0000Il00O) + ((this.I00000oOI.hashCode() + (this.I00000oIO.hashCode() * 31)) * 31);
                }

                public final String toString() {
/* 5 */             StringBuilder sb = new StringBuilder("SurfaceStreamSpecQueryResult(useCaseStreamSpecs=");
/* 10 */            sb.append(this.I00000oIO);
/* 15 */            sb.append(", attachedSurfaceStreamSpecs=");
/* 20 */            sb.append(this.I00000oOI);
/* 25 */            sb.append(", maxSupportedFrameRate=");
/* 32 */            return Oi010OO0.I001i1lo1io(sb, this.I0000Il00O, ')');
                }
            }

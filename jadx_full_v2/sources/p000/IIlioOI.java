            package p000;

            import java.util.Map;
            
            public final class IIlioOI {
                public IIliIi1O0OiO I00000oIO;
                public Map I00000oOI;

                public final boolean equals(Object obj) {
/* 1 */             if (this == obj) {
/* 34 */                return true;
                    }
/* 6 */             if (!(obj instanceof IIlioOI)) {
/* 32 */                return false;
                    }
/* 9 */             IIlioOI iIlioOI = (IIlioOI) obj;
                    return this.I00000oIO.equals(iIlioOI.I00000oIO) && this.I00000oOI.equals(iIlioOI.I00000oOI);
                }

                public final int hashCode() {
/* 15 */            return this.I00000oOI.hashCode() + (this.I00000oIO.hashCode() * 31);
                }

                public final String toString() {
/* 28 */            return "CameraGraphCreationResult(config=" + this.I00000oIO + ", streamConfigMap=" + this.I00000oOI + ')';
                }
            }

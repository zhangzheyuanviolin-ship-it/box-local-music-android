            package p000;

            import java.util.ArrayList;
            import java.util.HashMap;
            import java.util.LinkedHashSet;
            
            public final class IIiI0Oo {
                public LinkedHashSet I00000oIO;
                public ArrayList I00000oOI;
                public ArrayList I0000Il00O;
                public ArrayList I0000O;
                public ArrayList I0000oI00;
                public OlOO1Io010o I0001Ioi1lo;
                public Ool10o I000II;
                public HashMap I000O01llI0;
                public OlOO1i0ll0 I000OOo1O;
                public OlOO1i0ll0 I000OiO;

                public final boolean equals(Object obj) {
/* 1 */             if (this == obj) {
/* 124 */               return true;
                    }
/* 7 */             if (!(obj instanceof IIiI0Oo)) {
/* 122 */               return false;
                    }
/* 11 */            IIiI0Oo iIiI0Oo = (IIiI0Oo) obj;
                    return this.I00000oIO.equals(iIiI0Oo.I00000oIO) && this.I00000oOI.equals(iIiI0Oo.I00000oOI) && this.I0000Il00O.equals(iIiI0Oo.I0000Il00O) && this.I0000O.equals(iIiI0Oo.I0000O) && this.I0000oI00.equals(iIiI0Oo.I0000oI00) && O0000Ioio00.I0000O(this.I0001Ioi1lo, iIiI0Oo.I0001Ioi1lo) && O0000Ioio00.I0000O(this.I000II, iIiI0Oo.I000II) && this.I000O01llI0.equals(iIiI0Oo.I000O01llI0) && this.I000OOo1O.equals(iIiI0Oo.I000OOo1O) && O0000Ioio00.I0000O(this.I000OiO, iIiI0Oo.I000OiO);
                }

                public final int hashCode() {
/* 43 */            int iHashCode = (this.I0000oI00.hashCode() + ((this.I0000O.hashCode() + ((this.I0000Il00O.hashCode() + ((this.I00000oOI.hashCode() + (this.I00000oIO.hashCode() * 31)) * 31)) * 31)) * 31)) * 31;
/* 45 */            OlOO1Io010o olOO1Io010o = this.I0001Ioi1lo;
/* 57 */            int iHashCode2 = (iHashCode + (olOO1Io010o == null ? 0 : olOO1Io010o.hashCode())) * 31;
/* 59 */            Ool10o ool10o = this.I000II;
/* 88 */            int iHashCode3 = (this.I000OOo1O.hashCode() + ((this.I000O01llI0.hashCode() + ((iHashCode2 + (ool10o == null ? 0 : ool10o.hashCode())) * 31)) * 31)) * 31;
/* 90 */            OlOO1i0ll0 olOO1i0ll0 = this.I000OiO;
/* 99 */            return iHashCode3 + (olOO1i0ll0 != null ? olOO1i0ll0.hashCode() : 0);
                }

                public final String toString() {
/* 108 */           return "CalculatedUseCaseInfo(appUseCases=" + this.I00000oIO + ", cameraUseCases=" + this.I00000oOI + ", cameraUseCasesToAttach=" + this.I0000Il00O + ", cameraUseCasesToKeep=" + this.I0000O + ", cameraUseCasesToDetach=" + this.I0000oI00 + ", streamSharing=" + this.I0001Ioi1lo + ", placeholderForExtensions=" + this.I000II + ", useCaseConfigs=" + this.I000O01llI0 + ", primaryStreamSpecResult=" + this.I000OOo1O + ", secondaryStreamSpecResult=" + this.I000OiO + ')';
                }
            }

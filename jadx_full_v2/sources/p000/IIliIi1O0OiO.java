            package p000;

            import java.util.ArrayList;
            import java.util.List;
            import java.util.Map;
            
            public final class IIliIi1O0OiO {
                public String I00000oIO;
                public List I00000oOI;
                public List I0000Il00O;
                public ArrayList I0000O;
                public IIo1lioOolol I0000oI00;
                public int I0001Ioi1lo;
                public Map I000II;
                public int I000O01llI0;
                public Map I000OOo1O;
                public List I000OiO;
                public List I000iOII;
                public Map I000l1;
                public O1liO1 I000lI;
                public IIliOiI I000o00OoI0I;

                public final boolean equals(Object obj) {
/* 1 */             if (this == obj) {
/* 161 */               return true;
                    }
/* 7 */             if (!(obj instanceof IIliIi1O0OiO)) {
/* 163 */               return false;
                    }
/* 11 */            IIliIi1O0OiO iIliIi1O0OiO = (IIliIi1O0OiO) obj;
                    return O0000Ioio00.I0000O(this.I00000oIO, iIliIi1O0OiO.I00000oIO) && this.I00000oOI.equals(iIliIi1O0OiO.I00000oOI) && this.I0000Il00O.equals(iIliIi1O0OiO.I0000Il00O) && O0000Ioio00.I0000O(this.I0000O, iIliIi1O0OiO.I0000O) && O0000Ioio00.I0000O(this.I0000oI00, iIliIi1O0OiO.I0000oI00) && this.I0001Ioi1lo == iIliIi1O0OiO.I0001Ioi1lo && this.I000II.equals(iIliIi1O0OiO.I000II) && this.I000O01llI0 == iIliIi1O0OiO.I000O01llI0 && this.I000OOo1O.equals(iIliIi1O0OiO.I000OOo1O) && this.I000OiO.equals(iIliIi1O0OiO.I000OiO) && this.I000iOII.equals(iIliIi1O0OiO.I000iOII) && this.I000l1.equals(iIliIi1O0OiO.I000l1) && this.I000lI.equals(iIliIi1O0OiO.I000lI) && this.I000o00OoI0I.equals(iIliIi1O0OiO.I000o00OoI0I);
                }

                public final int hashCode() {
/* 18 */            int iI0000oI00 = IIl001iO0Io.I0000oI00(IIl001iO0Io.I0000oI00(this.I00000oIO.hashCode() * 31, 31, this.I00000oOI), 31, this.I0000Il00O);
/* 22 */            ArrayList arrayList = this.I0000O;
/* 34 */            int iHashCode = (iI0000oI00 + (arrayList == null ? 0 : arrayList.hashCode())) * 31;
/* 35 */            IIo1lioOolol iIo1lioOolol = this.I0000oI00;
/* 110 */           return (this.I000o00OoI0I.hashCode() + ((this.I000lI.hashCode() + Oi010OO0.I000iOII(this.I000l1, IIl001iO0Io.I0000oI00(IIl001iO0Io.I0000oI00(Oi010OO0.I000iOII(this.I000OOo1O, IIl001iO0Io.I0000O(1, IIl001iO0Io.I0000O(this.I000O01llI0, Oi010OO0.I000iOII(this.I000II, IIl001iO0Io.I0000O(this.I0001Ioi1lo, (iHashCode + (iIo1lioOolol != null ? iIo1lioOolol.hashCode() : 0)) * 31, 31), 31), 31), 31), 31), 31, this.I000OiO), 31, this.I000iOII), 29791)) * 31)) * 31;
                }

                public final String toString() {
/* 191 */           return "Config(camera=" + ((Object) IIllI0o.I0000Il00O(this.I00000oIO)) + ", streams=" + this.I00000oOI + ", exclusiveStreamGroups=" + this.I0000Il00O + ", input=" + this.I0000O + ", postviewStream=" + this.I0000oI00 + ", sessionTemplate=" + ((Object) Oi0OO1IIl1.I0000Il00O(this.I0001Ioi1lo)) + ", sessionParameters=" + this.I000II + ", sessionMode=" + ((Object) iOililO0i0.I00000oIO(this.I000O01llI0)) + ", defaultTemplate=" + ((Object) Oi0OO1IIl1.I0000Il00O(1)) + ", defaultParameters=" + this.I000OOo1O + ", defaultListeners=" + this.I000OiO + ", graphStateListeners=" + this.I000iOII + ", requiredParameters=" + this.I000l1 + ", cameraBackendId=" + ((Object) "null") + ", customCameraBackend=null, metadataTransform=" + this.I000lI + ", flags=" + this.I000o00OoI0I + ", sessionColorSpace=" + ((Object) "null") + ')';
                }
            }

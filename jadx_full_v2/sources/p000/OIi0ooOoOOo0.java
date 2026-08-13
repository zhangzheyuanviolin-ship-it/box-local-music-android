            package p000;
            
            public final class OIi0ooOoOOo0 {
                public final I0lIllO I00000oIO;
                public final IIlOloloOil I00000oOI;

                public OIi0ooOoOOo0(I0lIllO i0lIllO, IIlOloloOil iIlOloloOil, int i) {
/* 4 */             i0lIllO = (i & 1) != 0 ? null : i0lIllO;
/* 9 */             iIlOloloOil = (i & 2) != 0 ? null : iIlOloloOil;
/* 15 */            this.I00000oIO = i0lIllO;
/* 17 */            this.I00000oOI = iIlOloloOil;
                }

                public final boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
/* 8 */             if (!(obj instanceof OIi0ooOoOOo0)) {
/* 7 */                 return false;
                    }
/* 11 */            OIi0ooOoOOo0 oIi0ooOoOOo0 = (OIi0ooOoOOo0) obj;
                    return O0000Ioio00.I0000O(this.I00000oIO, oIi0ooOoOOo0.I00000oIO) && O0000Ioio00.I0000O(this.I00000oOI, oIi0ooOoOOo0.I00000oOI);
                }

                public final int hashCode() {
/* 2 */             I0lIllO i0lIllO = this.I00000oIO;
/* 12 */            int iHashCode = (i0lIllO == null ? 0 : i0lIllO.hashCode()) * 31;
/* 14 */            IIlOloloOil iIlOloloOil = this.I00000oOI;
/* 25 */            return iHashCode + (iIlOloloOil != null ? Integer.hashCode(iIlOloloOil.I00000oIO) : 0);
                }

                public final String toString() {
/* 28 */            return "OpenCameraResult(cameraState=" + this.I00000oIO + ", errorCode=" + this.I00000oOI + ')';
                }
            }

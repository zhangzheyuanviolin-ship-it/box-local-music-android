            package p000;

            import java.util.ArrayList;
            
            public final class IIllII {
                public ArrayList I00000oIO;
                public I1l0i11iIiI I00000oOI;

                public final String I00000oIO() {
/* 1 */             ArrayList arrayList = this.I00000oIO;
/* 14 */            lII1OI11o1I.I0000oI00("getInternalId() is only available for single-camera identifiers.", arrayList.size() == 1);
/* 21 */            return (String) IOOi0Ool1i.I001lllioOl(arrayList);
                }

                public final boolean equals(Object obj) {
/* 1 */             if (this == obj) {
/* 34 */                return true;
                    }
/* 6 */             if (!(obj instanceof IIllII)) {
/* 32 */                return false;
                    }
/* 11 */            IIllII iIllII = (IIllII) obj;
                    return this.I00000oIO.equals(iIllII.I00000oIO) && O0000Ioio00.I0000O(this.I00000oOI, iIllII.I00000oOI);
                }

                public final int hashCode() {
/* 7 */             int iHashCode = this.I00000oIO.hashCode() * 31;
/* 9 */             I1l0i11iIiI i1l0i11iIiI = this.I00000oOI;
/* 19 */            return iHashCode + (i1l0i11iIiI != null ? i1l0i11iIiI.hashCode() : 0);
                }

                public final String toString() {
                    String str;
/* 5 */             StringBuilder sb = new StringBuilder("CameraIdentifier{cameraIds=");
/* 21 */            sb.append(IOOi0Ool1i.I00IlilI0i0i(this.I00000oIO, ",", null, null, null, 62));
/* 24 */            I1l0i11iIiI i1l0i11iIiI = this.I00000oOI;
/* 26 */            if (i1l0i11iIiI != null) {
/* 38 */                str = ", compatId=" + i1l0i11iIiI;
                    } else {
/* 43 */                str = "";
                    }
/* 47 */            return IlIi0I0.I000oI1ioi(sb, str, '}');
                }
            }

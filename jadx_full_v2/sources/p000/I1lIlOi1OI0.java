            package p000;

            import java.util.Collections;
            import java.util.List;
            
            public final class I1lIlOi1OI0 {
                public IiIO1ol1i1o0 I00000oIO;
                public List I00000oOI;
                public int I0000Il00O;
                public int I0000O;
                public Iio1oiI I0000oI00;

                public static I1ii1o0 I00000oIO(IiIO1ol1i1o0 iiIO1ol1i1o0) {
/* 10 */            I1ii1o0 i1ii1o0 = new I1ii1o0(1, false);
/* 14 */            if (iiIO1ol1i1o0 == null) {
/* 41 */                IOOlIIilOl0.I000II("Null surface");
/* 13 */                return null;
                    }
/* 16 */            i1ii1o0.I00iiI = iiIO1ol1i1o0;
/* 18 */            List list = Collections.EMPTY_LIST;
/* 20 */            if (list == null) {
/* 35 */                IOOlIIilOl0.I000II("Null sharedSurfaces");
/* 13 */                return null;
                    }
/* 22 */            i1ii1o0.I00iiO = list;
/* 24 */            i1ii1o0.I00iio = -1;
/* 26 */            i1ii1o0.I00ilI0I1 = -1;
/* 30 */            i1ii1o0.I00ilO0 = Iio1oiI.I0000O;
/* 32 */            return i1ii1o0;
                }

                public final boolean equals(Object obj) {
/* 1 */             if (obj == this) {
/* 52 */                return true;
                    }
/* 6 */             if (!(obj instanceof I1lIlOi1OI0)) {
/* 54 */                return false;
                    }
/* 8 */             I1lIlOi1OI0 i1lIlOi1OI0 = (I1lIlOi1OI0) obj;
                    return this.I00000oIO.equals(i1lIlOi1OI0.I00000oIO) && this.I00000oOI.equals(i1lIlOi1OI0.I00000oOI) && this.I0000Il00O == i1lIlOi1OI0.I0000Il00O && this.I0000O == i1lIlOi1OI0.I0000O && this.I0000oI00.equals(i1lIlOi1OI0.I0000oI00);
                }

                public final int hashCode() {
/* 37 */            return this.I0000oI00.hashCode() ^ ((((((((this.I00000oIO.hashCode() ^ 1000003) * 1000003) ^ this.I00000oOI.hashCode()) * (-721379959)) ^ this.I0000Il00O) * 1000003) ^ this.I0000O) * 1000003);
                }

                public final String toString() {
/* 58 */            return "OutputConfig{surface=" + this.I00000oIO + ", sharedSurfaces=" + this.I00000oOI + ", physicalCameraId=null, mirrorMode=" + this.I0000Il00O + ", surfaceGroupId=" + this.I0000O + ", dynamicRange=" + this.I0000oI00 + "}";
                }
            }

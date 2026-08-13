            package p000;

            import android.util.Range;
            import android.util.Size;
            
            public final class I1lIoOIi {
                public static final Range I000O01llI0 = new Range(0, 0);
                public Size I00000oIO;
                public Size I00000oOI;
                public Iio1oiI I0000Il00O;
                public int I0000O;
                public Range I0000oI00;
                public IOlOo1ll1l1 I0001Ioi1lo;
                public boolean I000II;

                public static IOiOol0 I00000oIO(Size size) {
/* 4 */             IOiOol0 iOiOol0 = new IOiOol0(3);
/* 8 */             if (size == null) {
/* 44 */                IOOlIIilOl0.I000II("Null resolution");
/* 7 */                 return null;
                    }
/* 10 */            iOiOol0.I00iiI = size;
/* 12 */            iOiOol0.I00iiO = size;
/* 19 */            iOiOol0.I00ilI0I1 = 0;
/* 21 */            Range range = I000O01llI0;
/* 23 */            if (range == null) {
/* 38 */                IOOlIIilOl0.I000II("Null expectedFrameRateRange");
/* 7 */                 return null;
                    }
/* 25 */            iOiOol0.I00ilO0 = range;
/* 29 */            iOiOol0.I00iio = Iio1oiI.I0000O;
/* 33 */            iOiOol0.I00ioIO = Boolean.FALSE;
/* 35 */            return iOiOol0;
                }

                public final IOiOol0 I00000oOI() {
/* 4 */             IOiOol0 iOiOol0 = new IOiOol0(3);
/* 9 */             iOiOol0.I00iiI = this.I00000oIO;
/* 13 */            iOiOol0.I00iiO = this.I00000oOI;
/* 17 */            iOiOol0.I00iio = this.I0000Il00O;
/* 25 */            iOiOol0.I00ilI0I1 = Integer.valueOf(this.I0000O);
/* 29 */            iOiOol0.I00ilO0 = this.I0000oI00;
/* 33 */            iOiOol0.I00io1l = this.I0001Ioi1lo;
/* 41 */            iOiOol0.I00ioIO = Boolean.valueOf(this.I000II);
/* 55 */            return iOiOol0;
                }

                public final boolean equals(Object obj) {
/* 2 */             if (obj == this) {
/* 1 */                 return true;
                    }
/* 8 */             if (obj instanceof I1lIoOIi) {
/* 10 */                I1lIoOIi i1lIoOIi = (I1lIoOIi) obj;
/* 20 */                if (this.I00000oIO.equals(i1lIoOIi.I00000oIO) && this.I00000oOI.equals(i1lIoOIi.I00000oOI) && this.I0000Il00O.equals(i1lIoOIi.I0000Il00O) && this.I0000O == i1lIoOIi.I0000O && this.I0000oI00.equals(i1lIoOIi.I0000oI00)) {
/* 58 */                    IOlOo1ll1l1 iOlOo1ll1l1 = this.I0001Ioi1lo;
/* 60 */                    IOlOo1ll1l1 iOlOo1ll1l12 = i1lIoOIi.I0001Ioi1lo;
/* 62 */                    if (iOlOo1ll1l1 != null ? iOlOo1ll1l1.equals(iOlOo1ll1l12) : iOlOo1ll1l12 == null) {
/* 77 */                        if (this.I000II == i1lIoOIi.I000II) {
/* 1 */                             return true;
                                }
                            }
                        }
                    }
/* 7 */             return false;
                }

                public final int hashCode() {
/* 39 */            int iHashCode = (((((((((this.I00000oIO.hashCode() ^ 1000003) * 1000003) ^ this.I00000oOI.hashCode()) * 1000003) ^ this.I0000Il00O.hashCode()) * 1000003) ^ this.I0000O) * 1000003) ^ this.I0000oI00.hashCode()) * 1000003;
/* 40 */            IOlOo1ll1l1 iOlOo1ll1l1 = this.I0001Ioi1lo;
/* 61 */            return (this.I000II ? 1231 : 1237) ^ ((iHashCode ^ (iOlOo1ll1l1 == null ? 0 : iOlOo1ll1l1.hashCode())) * 1000003);
                }

                public final String toString() {
/* 5 */             StringBuilder sb = new StringBuilder("StreamSpec{resolution=");
/* 10 */            sb.append(this.I00000oIO);
/* 15 */            sb.append(", originalConfiguredResolution=");
/* 20 */            sb.append(this.I00000oOI);
/* 25 */            sb.append(", dynamicRange=");
/* 30 */            sb.append(this.I0000Il00O);
/* 35 */            sb.append(", sessionType=");
/* 40 */            sb.append(this.I0000O);
/* 45 */            sb.append(", expectedFrameRateRange=");
/* 50 */            sb.append(this.I0000oI00);
/* 55 */            sb.append(", implementationOptions=");
/* 60 */            sb.append(this.I0001Ioi1lo);
/* 65 */            sb.append(", zslDisabled=");
/* 72 */            return IIlIOloOOO.I0010o(sb, this.I000II, "}");
                }
            }

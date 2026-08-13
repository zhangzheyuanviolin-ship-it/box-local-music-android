            package p000;
            
            public final class OI1OIlllll0 {
                public final OI1OIiIiIl I00000oIO;
                public final int I00000oOI;
                public final int I0000Il00O;

                public OI1OIlllll0(OI1OIiIiIl oI1OIiIiIl, int i, int i2) {
/* 4 */             this.I00000oIO = oI1OIiIiIl;
/* 6 */             this.I00000oOI = i;
/* 8 */             this.I0000Il00O = i2;
                }

                public final boolean equals(Object obj) {
/* 1 */             if (this == obj) {
/* 37 */                return true;
                    }
/* 6 */             if (!(obj instanceof OI1OIlllll0)) {
/* 35 */                return false;
                    }
/* 9 */             OI1OIlllll0 oI1OIlllll0 = (OI1OIlllll0) obj;
                    return this.I00000oIO.equals(oI1OIlllll0.I00000oIO) && this.I00000oOI == oI1OIlllll0.I00000oOI && this.I0000Il00O == oI1OIlllll0.I0000Il00O;
                }

                public final int hashCode() {
/* 22 */            return Integer.hashCode(this.I0000Il00O) + IIl001iO0Io.I0000O(this.I00000oOI, this.I00000oIO.hashCode() * 31, 31);
                }

                public final String toString() {
/* 5 */             StringBuilder sb = new StringBuilder("NanoOverlayState(overlay=");
/* 10 */            sb.append(this.I00000oIO);
/* 15 */            sb.append(", srcW=");
/* 20 */            sb.append(this.I00000oOI);
/* 25 */            sb.append(", srcH=");
/* 32 */            return IIl001iO0Io.I000lI(this.I0000Il00O, ")", sb);
                }
            }

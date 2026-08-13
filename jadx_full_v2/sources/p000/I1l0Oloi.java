            package p000;
            
            public final class I1l0Oloi {
                public String I00000oIO;
                public String I00000oOI;
                public String I0000Il00O;
                public String I0000O;

                public final boolean equals(Object obj) {
/* 1 */             if (obj == this) {
/* 50 */                return true;
                    }
/* 6 */             if (!(obj instanceof I1l0Oloi)) {
/* 52 */                return false;
                    }
/* 8 */             I1l0Oloi i1l0Oloi = (I1l0Oloi) obj;
                    return this.I00000oIO.equals(i1l0Oloi.I00000oIO) && this.I00000oOI.equals(i1l0Oloi.I00000oOI) && this.I0000Il00O.equals(i1l0Oloi.I0000Il00O) && this.I0000O.equals(i1l0Oloi.I0000O);
                }

                public final int hashCode() {
/* 34 */            return this.I0000O.hashCode() ^ ((((((this.I00000oIO.hashCode() ^ 1000003) * 1000003) ^ this.I00000oOI.hashCode()) * 1000003) ^ this.I0000Il00O.hashCode()) * 1000003);
                }

                public final String toString() {
/* 5 */             StringBuilder sb = new StringBuilder("GraphicDeviceInfo{glVersion=");
/* 10 */            sb.append(this.I00000oIO);
/* 15 */            sb.append(", eglVersion=");
/* 20 */            sb.append(this.I00000oOI);
/* 25 */            sb.append(", glExtensions=");
/* 30 */            sb.append(this.I0000Il00O);
/* 35 */            sb.append(", eglExtensions=");
/* 42 */            return IIl001iO0Io.I00100l0(sb, this.I0000O, "}");
                }
            }

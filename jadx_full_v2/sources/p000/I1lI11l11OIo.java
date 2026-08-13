            package p000;
            
            public final class I1lI11l11OIo extends OO11il0 {
                public String I00000oIO;
                public String I00000oOI;
                public String I0000Il00O;
                public String I0000O;

                public final boolean equals(Object obj) {
/* 2 */             if (obj == this) {
/* 1 */                 return true;
                    }
/* 8 */             if (obj instanceof OO11il0) {
/* 14 */                I1lI11l11OIo i1lI11l11OIo = (I1lI11l11OIo) ((OO11il0) obj);
/* 22 */                if (this.I00000oIO.equals(i1lI11l11OIo.I00000oIO) && this.I00000oOI.equals(i1lI11l11OIo.I00000oOI) && this.I0000Il00O.equals(i1lI11l11OIo.I0000Il00O) && this.I0000O.equals(i1lI11l11OIo.I0000O)) {
/* 1 */                     return true;
                        }
                    }
/* 7 */             return false;
                }

                public final int hashCode() {
/* 26 */            int iHashCode = ((((this.I00000oIO.hashCode() ^ 1000003) * 1000003) ^ this.I00000oOI.hashCode()) * 1000003) ^ this.I0000Il00O.hashCode();
/* 34 */            return this.I0000O.hashCode() ^ (iHashCode * 1000003);
                }

                public final String toString() {
/* 5 */             StringBuilder sb = new StringBuilder("PipelineId{namespace=");
/* 10 */            sb.append(this.I00000oIO);
/* 15 */            sb.append(", name=");
/* 20 */            sb.append(this.I00000oOI);
/* 25 */            sb.append(", clientLibraryName=");
/* 30 */            sb.append(this.I0000Il00O);
/* 35 */            sb.append(", clientLibraryVersion=");
/* 42 */            return IIl001iO0Io.I00100l0(sb, this.I0000O, "}");
                }
            }

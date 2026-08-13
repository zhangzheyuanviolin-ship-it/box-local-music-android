            package p000;

            import java.util.ArrayList;
            
            public final class I1lII0lO {
                public IioO0ilo1Ii I00000oIO;
                public IioO0ilo1Ii I00000oOI;
                public int I0000Il00O;
                public ArrayList I0000O;

                public final boolean equals(Object obj) {
/* 1 */             if (obj == this) {
/* 41 */                return true;
                    }
/* 7 */             if (obj instanceof I1lII0lO) {
/* 9 */                 I1lII0lO i1lII0lO = (I1lII0lO) obj;
/* 15 */                if (this.I00000oIO == i1lII0lO.I00000oIO && this.I00000oOI == i1lII0lO.I00000oOI && this.I0000Il00O == i1lII0lO.I0000Il00O && this.I0000O.equals(i1lII0lO.I0000O)) {
/* 41 */                    return true;
                        }
                    }
/* 6 */             return false;
                }

                public final int hashCode() {
/* 30 */            return this.I0000O.hashCode() ^ ((((((this.I00000oIO.hashCode() ^ 1000003) * 1000003) ^ this.I00000oOI.hashCode()) * 1000003) ^ this.I0000Il00O) * 1000003);
                }

                public final String toString() {
/* 48 */            return "In{edge=" + this.I00000oIO + ", postviewEdge=" + this.I00000oOI + ", inputFormat=" + this.I0000Il00O + ", outputFormats=" + this.I0000O + "}";
                }
            }

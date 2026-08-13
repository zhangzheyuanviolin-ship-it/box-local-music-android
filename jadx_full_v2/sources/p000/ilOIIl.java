            package p000;
            
            public final class ilOIIl {
                public il00ioIl I00000oIO;
                public int I00000oOI;

                public final boolean equals(Object obj) {
/* 3 */             if (!(obj instanceof ilOIIl)) {
/* 22 */                return false;
                    }
/* 6 */             ilOIIl iloiil = (ilOIIl) obj;
                    return this.I00000oIO == iloiil.I00000oIO && this.I00000oOI == iloiil.I00000oOI;
                }

                public final int hashCode() {
/* 13 */            return (System.identityHashCode(this.I00000oIO) * 65535) + this.I00000oOI;
                }
            }

            package p000;
            
            public final class OOO10o0l0 {
                public final String I00000oIO;
                public final String I00000oOI;

                public OOO10o0l0(String str, String str2) {
/* 4 */             this.I00000oIO = str;
/* 6 */             this.I00000oOI = str2;
                }

                public final boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
/* 8 */             if (!(obj instanceof OOO10o0l0)) {
/* 7 */                 return false;
                    }
/* 11 */            OOO10o0l0 oOO10o0l0 = (OOO10o0l0) obj;
                    return O0000Ioio00.I0000O(this.I00000oIO, oOO10o0l0.I00000oIO) && O0000Ioio00.I0000O(this.I00000oOI, oOO10o0l0.I00000oOI);
                }

                public final int hashCode() {
/* 15 */            return this.I00000oOI.hashCode() + (this.I00000oIO.hashCode() * 31);
                }

                public final String toString() {
/* 11 */            return Oi010OO0.I001IO000("ProgressPanelItem(title=", this.I00000oIO, ", description=", this.I00000oOI, ")");
                }
            }

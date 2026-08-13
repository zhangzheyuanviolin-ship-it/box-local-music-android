            package p000;
            
            public final class I01lOOlO0o {
                public final String I00000oIO;
                public final IlliIlI I00000oOI;

                public I01lOOlO0o(String str, IlliIlI illiIlI) {
/* 4 */             this.I00000oIO = str;
/* 6 */             this.I00000oOI = illiIlI;
                }

                public final boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
/* 8 */             if (!(obj instanceof I01lOOlO0o)) {
/* 7 */                 return false;
                    }
/* 11 */            I01lOOlO0o i01lOOlO0o = (I01lOOlO0o) obj;
                    return O0000Ioio00.I0000O(this.I00000oIO, i01lOOlO0o.I00000oIO) && O0000Ioio00.I0000O(this.I00000oOI, i01lOOlO0o.I00000oOI);
                }

                public final int hashCode() {
/* 2 */             String str = this.I00000oIO;
/* 12 */            int iHashCode = (str != null ? str.hashCode() : 0) * 31;
/* 14 */            IlliIlI illiIlI = this.I00000oOI;
/* 22 */            return iHashCode + (illiIlI != null ? illiIlI.hashCode() : 0);
                }

                public final String toString() {
/* 28 */            return "AccessibilityAction(label=" + this.I00000oIO + ", action=" + this.I00000oOI + ")";
                }
            }

            package p000;
            
            public final class Io1loIilO10I {
                public final boolean I00000oIO;
                public final String I00000oOI;

                public Io1loIilO10I(String str, boolean z) {
/* 4 */             this.I00000oIO = z;
/* 6 */             this.I00000oOI = str;
                }

                public final boolean equals(Object obj) {
/* 1 */             if (this == obj) {
/* 30 */                return true;
                    }
/* 6 */             if (!(obj instanceof Io1loIilO10I)) {
/* 28 */                return false;
                    }
/* 9 */             Io1loIilO10I io1loIilO10I = (Io1loIilO10I) obj;
                    return this.I00000oIO == io1loIilO10I.I00000oIO && this.I00000oOI.equals(io1loIilO10I.I00000oOI);
                }

                public final int hashCode() {
/* 15 */            return this.I00000oOI.hashCode() + (Boolean.hashCode(this.I00000oIO) * 31);
                }

                public final String toString() {
/* 28 */            return "HoldToDictateUiState(recognizing=" + this.I00000oIO + ", recognizedText=" + this.I00000oOI + ")";
                }
            }

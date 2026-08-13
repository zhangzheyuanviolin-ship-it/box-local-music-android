            package p000;
            
            public final class il1O0lOli0iO {
                public String I00000oIO;

                public final boolean equals(Object obj) {
/* 1 */             if (obj == this) {
/* 3 */                 return true;
                    }
/* 7 */             if (obj instanceof il1O0lOli0iO) {
/* 15 */                return this.I00000oIO.equals(((il1O0lOli0iO) obj).I00000oIO);
                    }
/* 20 */            return false;
                }

                public final int hashCode() {
/* 10 */            return this.I00000oIO.hashCode() ^ 1000003;
                }

                public final String toString() {
/* 12 */            return IIl001iO0Io.I00100l0(new StringBuilder("SummarizationMessage{message="), this.I00000oIO, "}");
                }
            }

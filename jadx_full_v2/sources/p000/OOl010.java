            package p000;
            
            public final class OOl010 implements OOl0Io1 {
                public String I00000oIO;

                public final boolean equals(Object obj) {
/* 1 */             if (this == obj) {
/* 23 */                return true;
                    }
                    return (obj instanceof OOl010) && this.I00000oIO.equals(((OOl010) obj).I00000oIO);
                }

                public final int hashCode() {
/* 3 */             return this.I00000oIO.hashCode();
                }

                public final String toString() {
/* 7 */             return IlIi0I0.I000lI("Token(text=", this.I00000oIO, ")");
                }
            }

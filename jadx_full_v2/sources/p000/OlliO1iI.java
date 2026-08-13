            package p000;
            
            public final class OlliO1iI {
                public final int I00000oIO;
                public final IoiOolO1iOo I00000oOI;

                public OlliO1iI(int i, IoiOolO1iOo ioiOolO1iOo) {
/* 4 */             this.I00000oIO = i;
/* 6 */             this.I00000oOI = ioiOolO1iOo;
                }

                public final boolean equals(Object obj) {
/* 1 */             if (this == obj) {
/* 30 */                return true;
                    }
/* 6 */             if (!(obj instanceof OlliO1iI)) {
/* 28 */                return false;
                    }
/* 9 */             OlliO1iI olliO1iI = (OlliO1iI) obj;
                    return this.I00000oIO == olliO1iI.I00000oIO && this.I00000oOI.equals(olliO1iI.I00000oOI);
                }

                public final int hashCode() {
/* 15 */            return this.I00000oOI.hashCode() + (Integer.hashCode(this.I00000oIO) * 31);
                }

                public final String toString() {
/* 28 */            return "Tab(labelResId=" + this.I00000oIO + ", icon=" + this.I00000oOI + ")";
                }
            }

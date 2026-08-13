            package p000;
            
            public final class OiIiIOOIii1 {
                public final int I00000oIO;
                public final IoiOolO1iOo I00000oOI;

                public OiIiIOOIii1(int i, IoiOolO1iOo ioiOolO1iOo) {
/* 4 */             this.I00000oIO = i;
/* 6 */             this.I00000oOI = ioiOolO1iOo;
                }

                public final boolean equals(Object obj) {
/* 1 */             if (this == obj) {
/* 30 */                return true;
                    }
/* 6 */             if (!(obj instanceof OiIiIOOIii1)) {
/* 28 */                return false;
                    }
/* 9 */             OiIiIOOIii1 oiIiIOOIii1 = (OiIiIOOIii1) obj;
                    return this.I00000oIO == oiIiIOOIii1.I00000oIO && this.I00000oOI.equals(oiIiIOOIii1.I00000oOI);
                }

                public final int hashCode() {
/* 15 */            return this.I00000oOI.hashCode() + (Integer.hashCode(this.I00000oIO) * 31);
                }

                public final String toString() {
/* 28 */            return "SampleActionItem(labelResId=" + this.I00000oIO + ", icon=" + this.I00000oOI + ")";
                }
            }

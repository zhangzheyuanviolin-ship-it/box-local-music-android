            package p000;
            
            public final class Il1ll1110iiO {
                public final Object I00000oIO;
                public final int I00000oOI;

                public Il1ll1110iiO(Object obj, int i) {
/* 4 */             this.I00000oIO = obj;
/* 6 */             this.I00000oOI = i;
                }

                public final boolean equals(Object obj) {
/* 4 */             if (!(obj instanceof Il1ll1110iiO)) {
/* 3 */                 return false;
                    }
/* 7 */             Il1ll1110iiO il1ll1110iiO = (Il1ll1110iiO) obj;
                    return this.I00000oIO == il1ll1110iiO.I00000oIO && this.I00000oOI == il1ll1110iiO.I00000oOI;
                }

                public final int hashCode() {
/* 13 */            return (System.identityHashCode(this.I00000oIO) * 65535) + this.I00000oOI;
                }
            }

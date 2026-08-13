            package p000;
            
            public final class IoO1o1 {
                public final OoOO010 I00000oIO;
                public final Object I00000oOI;

                public IoO1o1(OoOO010 ooOO010, Object obj) {
/* 4 */             this.I00000oIO = ooOO010;
/* 6 */             this.I00000oOI = obj;
                }

                public final boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
/* 8 */             if (!(obj instanceof IoO1o1)) {
/* 7 */                 return false;
                    }
/* 11 */            IoO1o1 ioO1o1 = (IoO1o1) obj;
                    return O0000Ioio00.I0000O(this.I00000oIO, ioO1o1.I00000oIO) && O0000Ioio00.I0000O(this.I00000oOI, ioO1o1.I00000oOI);
                }

                public final int hashCode() {
/* 15 */            return this.I00000oOI.hashCode() + (this.I00000oIO.hashCode() * 31);
                }

                public final String toString() {
/* 28 */            return "HttpResponseContainer(expectedType=" + this.I00000oIO + ", response=" + this.I00000oOI + ')';
                }
            }

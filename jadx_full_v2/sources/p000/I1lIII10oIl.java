            package p000;
            
            public final class I1lIII10oIl {
                public OOIo1Iiiil I00000oIO;
                public IoiO1IO1I1i I00000oOI;

                public final boolean equals(Object obj) {
/* 2 */             if (obj == this) {
/* 1 */                 return true;
                    }
/* 8 */             if (obj instanceof I1lIII10oIl) {
/* 10 */                I1lIII10oIl i1lIII10oIl = (I1lIII10oIl) obj;
/* 20 */                if (this.I00000oIO.equals(i1lIII10oIl.I00000oIO) && this.I00000oOI.equals(i1lIII10oIl.I00000oOI)) {
/* 1 */                     return true;
                        }
                    }
/* 7 */             return false;
                }

                public final int hashCode() {
/* 18 */            return this.I00000oOI.hashCode() ^ ((this.I00000oIO.hashCode() ^ 1000003) * 1000003);
                }

                public final String toString() {
/* 28 */            return "InputPacket{processingRequest=" + this.I00000oIO + ", imageProxy=" + this.I00000oOI + "}";
                }
            }

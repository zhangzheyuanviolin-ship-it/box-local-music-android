            package p000;
            
            public final class IoiOoolI {
                public IoiOolO1iOo I00000oIO;
                public int I00000oOI;

                public final boolean equals(Object obj) {
/* 1 */             if (this == obj) {
/* 30 */                return true;
                    }
/* 6 */             if (!(obj instanceof IoiOoolI)) {
/* 28 */                return false;
                    }
/* 9 */             IoiOoolI ioiOoolI = (IoiOoolI) obj;
                    return this.I00000oIO.equals(ioiOoolI.I00000oIO) && this.I00000oOI == ioiOoolI.I00000oOI;
                }

                public final int hashCode() {
/* 15 */            return Integer.hashCode(this.I00000oOI) + (this.I00000oIO.hashCode() * 31);
                }

                public final String toString() {
/* 28 */            return "ImageVectorEntry(imageVector=" + this.I00000oIO + ", configFlags=" + this.I00000oOI + ")";
                }
            }

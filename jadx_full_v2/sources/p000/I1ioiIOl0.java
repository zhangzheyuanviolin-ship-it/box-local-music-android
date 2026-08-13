            package p000;
            
            public final class I1ioiIOl0 {
                public int I00000oIO;
                public int I00000oOI;
                public IIiOOI I0000Il00O;

                public final boolean equals(Object obj) {
/* 2 */             if (obj == this) {
/* 1 */                 return true;
                    }
/* 8 */             if (obj instanceof I1ioiIOl0) {
/* 10 */                I1ioiIOl0 i1ioiIOl0 = (I1ioiIOl0) obj;
/* 16 */                if (this.I00000oIO == i1ioiIOl0.I00000oIO && this.I00000oOI == i1ioiIOl0.I00000oOI && this.I0000Il00O.equals(i1ioiIOl0.I0000Il00O)) {
/* 1 */                     return true;
                        }
                    }
/* 7 */             return false;
                }

                public final int hashCode() {
/* 18 */            return this.I0000Il00O.hashCode() ^ ((((this.I00000oIO ^ 1000003) * 1000003) ^ this.I00000oOI) * 1000003);
                }

                public final String toString() {
/* 38 */            return "PendingSnapshot{jpegQuality=" + this.I00000oIO + ", rotationDegrees=" + this.I00000oOI + ", completer=" + this.I0000Il00O + "}";
                }
            }

            package p000;
            
            public final class Ioloo0I1O0l0 {
                public I0oIollOil0 I00000oIO;
                public IllIi0lI I00000oOI;

                public final boolean equals(Object obj) {
/* 1 */             if (this == obj) {
/* 30 */                return true;
                    }
/* 7 */             if (obj instanceof Ioloo0I1O0l0) {
/* 10 */                Ioloo0I1O0l0 ioloo0I1O0l0 = (Ioloo0I1O0l0) obj;
/* 16 */                if (this.I00000oIO == ioloo0I1O0l0.I00000oIO && this.I00000oOI.equals(ioloo0I1O0l0.I00000oOI)) {
/* 30 */                    return true;
                        }
                    }
/* 6 */             return false;
                }

                public final int hashCode() {
/* 15 */            return this.I00000oOI.hashCode() + (this.I00000oIO.hashCode() * 31);
                }

                public final String toString() {
/* 28 */            return "InputRequest(image=" + this.I00000oIO + ", frameInfo=" + this.I00000oOI + ')';
                }
            }

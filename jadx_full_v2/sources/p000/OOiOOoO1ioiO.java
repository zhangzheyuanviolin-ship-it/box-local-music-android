            package p000;
            
            public final class OOiOOoO1ioiO implements OOiOi1IIlIll {
                public I0II0i00l I00000oIO;
                public OI1I11lO1i I00000oOI;

                public final boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
/* 8 */             if (!(obj instanceof OOiOOoO1ioiO)) {
/* 7 */                 return false;
                    }
/* 11 */            OOiOOoO1ioiO oOiOOoO1ioiO = (OOiOOoO1ioiO) obj;
                    return this.I00000oIO == oOiOOoO1ioiO.I00000oIO && this.I00000oOI == oOiOOoO1ioiO.I00000oOI;
                }

                public final int hashCode() {
/* 15 */            return this.I00000oOI.hashCode() + (this.I00000oIO.hashCode() * 31);
                }

                public final String toString() {
/* 28 */            return "Success(activeCamera=" + this.I00000oIO + ", token=" + this.I00000oOI + ')';
                }
            }

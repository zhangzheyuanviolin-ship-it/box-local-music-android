            package p000;
            
            public final class I1Oi1Oi0O {
                public iOOO0ooiIo I00000oIO;
                public I1OiI110i I00000oOI;

                public final boolean equals(Object obj) {
/* 1 */             if (this == obj) {
/* 34 */                return true;
                    }
/* 6 */             if (!(obj instanceof I1Oi1Oi0O)) {
/* 32 */                return false;
                    }
/* 11 */            I1Oi1Oi0O i1Oi1Oi0O = (I1Oi1Oi0O) obj;
                    return this.I00000oIO.equals(i1Oi1Oi0O.I00000oIO) && this.I00000oOI.equals(i1Oi1Oi0O.I00000oOI);
                }

                public final int hashCode() {
/* 15 */            return this.I00000oOI.hashCode() + (this.I00000oIO.hashCode() * 31);
                }
            }

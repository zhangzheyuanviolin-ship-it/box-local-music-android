            package p000;
            
            public final class Oo1IoiO0o {
                public final Oo1Ioili0lO I00000oIO;
                public final String I00000oOI;

                public Oo1IoiO0o(Oo1Ioili0lO oo1Ioili0lO, String str) {
/* 4 */             this.I00000oIO = oo1Ioili0lO;
/* 6 */             this.I00000oOI = str;
                }

                public final boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
/* 8 */             if (!(obj instanceof Oo1IoiO0o)) {
/* 7 */                 return false;
                    }
/* 11 */            Oo1IoiO0o oo1IoiO0o = (Oo1IoiO0o) obj;
                    return this.I00000oIO == oo1IoiO0o.I00000oIO && O0000Ioio00.I0000O(this.I00000oOI, oo1IoiO0o.I00000oOI);
                }

                public final int hashCode() {
/* 7 */             int iHashCode = this.I00000oIO.hashCode() * 31;
/* 9 */             String str = this.I00000oOI;
/* 19 */            return iHashCode + (str == null ? 0 : str.hashCode());
                }

                public final String toString() {
/* 28 */            return "TokenRequestResult(status=" + this.I00000oIO + ", errorMessage=" + this.I00000oOI + ")";
                }
            }

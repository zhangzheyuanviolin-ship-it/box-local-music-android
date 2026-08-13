            package p000;
            
            public final class IlIIOlio00io implements IlIIiO {
                public String I00000oIO;
                public Io1100oIo I00000oOI;

                public final boolean equals(Object obj) {
/* 1 */             if (this == obj) {
/* 34 */                return true;
                    }
/* 6 */             if (!(obj instanceof IlIIOlio00io)) {
/* 32 */                return false;
                    }
/* 9 */             IlIIOlio00io ilIIOlio00io = (IlIIOlio00io) obj;
                    return this.I00000oIO.equals(ilIIOlio00io.I00000oIO) && O0000Ioio00.I0000O(this.I00000oOI, ilIIOlio00io.I00000oOI);
                }

                public final int hashCode() {
/* 15 */            return this.I00000oOI.hashCode() + (this.I00000oIO.hashCode() * 31);
                }

                public final String toString() {
/* 28 */            return "UseCaseMissing(requiredUseCases=" + this.I00000oIO + ", featureRequiring=" + this.I00000oOI + ')';
                }
            }

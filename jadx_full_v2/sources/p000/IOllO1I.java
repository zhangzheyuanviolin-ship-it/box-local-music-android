            package p000;
            
            public final class IOllO1I {
                public final String I00000oIO;
                public final String I00000oOI;

                public IOllO1I(String str, String str2) {
/* 4 */             this.I00000oIO = str;
/* 6 */             this.I00000oOI = str2;
                }

                public final boolean equals(Object obj) {
/* 1 */             if (this == obj) {
/* 34 */                return true;
                    }
/* 6 */             if (!(obj instanceof IOllO1I)) {
/* 32 */                return false;
                    }
/* 9 */             IOllO1I iOllO1I = (IOllO1I) obj;
                    return this.I00000oIO.equals(iOllO1I.I00000oIO) && this.I00000oOI.equals(iOllO1I.I00000oOI);
                }

                public final int hashCode() {
/* 15 */            return this.I00000oOI.hashCode() + (this.I00000oIO.hashCode() * 31);
                }

                public final String toString() {
/* 11 */            return Oi010OO0.I001IO000("ConfigKey(id=", this.I00000oIO, ", label=", this.I00000oOI, ")");
                }
            }

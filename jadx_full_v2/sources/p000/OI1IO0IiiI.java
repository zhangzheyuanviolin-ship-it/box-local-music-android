            package p000;
            
/* 7 */     public final class OI1IO0IiiI {
                public int I00000oIO;
                public int I00000oOI;

                public OI1IO0IiiI(int i, int i2) {
/* 4 */             this.I00000oIO = i;
/* 6 */             this.I00000oOI = i2;
                }

                public static OI1IO0IiiI I00000oIO(OI1IO0IiiI oI1IO0IiiI) {
/* 1 */             int i = oI1IO0IiiI.I00000oIO;
/* 3 */             int i2 = oI1IO0IiiI.I00000oOI;
/* 5 */             oI1IO0IiiI.getClass();
/* 10 */            return new OI1IO0IiiI(i, i2);
                }

                public final boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
/* 8 */             if (!(obj instanceof OI1IO0IiiI)) {
/* 7 */                 return false;
                    }
/* 11 */            OI1IO0IiiI oI1IO0IiiI = (OI1IO0IiiI) obj;
                    return this.I00000oIO == oI1IO0IiiI.I00000oIO && this.I00000oOI == oI1IO0IiiI.I00000oOI;
                }

                public final int hashCode() {
/* 15 */            return Integer.hashCode(this.I00000oOI) + (Integer.hashCode(this.I00000oIO) * 31);
                }

                public final String toString() {
/* 11 */            return Oi010OO0.I0010o("NSRange(location=", this.I00000oIO, ", length=", this.I00000oOI, ")");
                }

/* 8 */         public OI1IO0IiiI() {
/* 9 */             this(-1, 0);
                }
            }

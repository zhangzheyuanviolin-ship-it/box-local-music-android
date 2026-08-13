            package p000;
            
            public final class OlIIlO1 {
                public String I00000oIO;
                public OI1Iio0ii1 I00000oOI;
                public String I0000Il00O;
                public String I0000O;
                public String I0000oI00;

                public final boolean equals(Object obj) {
/* 1 */             if (this == obj) {
/* 56 */                return true;
                    }
/* 6 */             if (!(obj instanceof OlIIlO1)) {
/* 54 */                return false;
                    }
/* 9 */             OlIIlO1 olIIlO1 = (OlIIlO1) obj;
                    return this.I00000oIO.equals(olIIlO1.I00000oIO) && this.I00000oOI.equals(olIIlO1.I00000oOI) && this.I0000Il00O.equals(olIIlO1.I0000Il00O) && this.I0000O.equals(olIIlO1.I0000O);
                }

                public final int hashCode() {
/* 30 */            return this.I0000O.hashCode() + Oi010OO0.I000O01llI0((this.I00000oOI.hashCode() + (this.I00000oIO.hashCode() * 31)) * 31, 31, this.I0000Il00O);
                }

                public final String toString() {
/* 5 */             StringBuilder sb = new StringBuilder("NameAndSignature(classInternalName=");
/* 10 */            sb.append(this.I00000oIO);
/* 15 */            sb.append(", name=");
/* 20 */            sb.append(this.I00000oOI);
/* 25 */            sb.append(", parameters=");
/* 30 */            sb.append(this.I0000Il00O);
/* 35 */            sb.append(", returnType=");
/* 42 */            return IlIi0I0.I000oI1ioi(sb, this.I0000O, ')');
                }
            }

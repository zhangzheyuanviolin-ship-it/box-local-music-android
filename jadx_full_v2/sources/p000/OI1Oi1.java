            package p000;
            
            public final class OI1Oi1 {
                public OII0I1ii I00000oIO;
                public boolean I00000oOI;
                public boolean I0000Il00O;
                public Object I0000O;

                public final boolean equals(Object obj) {
/* 1 */             if (this == obj) {
/* 55 */                return true;
                    }
/* 4 */             if (obj == null || OI1Oi1.class != obj.getClass()) {
/* 57 */                return false;
                    }
/* 15 */            OI1Oi1 oI1Oi1 = (OI1Oi1) obj;
/* 21 */            if (this.I00000oOI != oI1Oi1.I00000oOI || this.I0000Il00O != oI1Oi1.I0000Il00O || !O0000Ioio00.I0000O(this.I00000oIO, oI1Oi1.I00000oIO)) {
/* 57 */                return false;
                    }
/* 42 */            Object obj2 = this.I0000O;
/* 44 */            Object obj3 = oI1Oi1.I0000O;
                    return obj2 != null ? obj2.equals(obj3) : obj3 == null;
                }

                public final int hashCode() {
/* 17 */            int iHashCode = ((((this.I00000oIO.hashCode() * 31) + (this.I00000oOI ? 1 : 0)) * 31) + (this.I0000Il00O ? 1 : 0)) * 31;
/* 19 */            Object obj = this.I0000O;
/* 29 */            return iHashCode + (obj != null ? obj.hashCode() : 0);
                }

                public final String toString() {
/* 3 */             StringBuilder sb = new StringBuilder();
/* 18 */            sb.append(OOoOl0i.I00000oIO.I00000oOI(OI1Oi1.class).I000oI1ioi());
/* 37 */            sb.append(" Type: " + this.I00000oIO);
/* 56 */            sb.append(" Nullable: " + this.I00000oOI);
/* 61 */            if (this.I0000Il00O) {
/* 79 */                sb.append(" DefaultValue: " + this.I0000O);
                    }
/* 82 */            return sb.toString();
                }
            }

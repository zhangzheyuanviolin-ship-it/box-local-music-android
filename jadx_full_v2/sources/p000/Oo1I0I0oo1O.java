            package p000;

            import java.util.List;
            
            public final class Oo1I0I0oo1O {
                public final int I00000oIO;
                public final List I00000oOI;
                public final long I0000Il00O;

                public Oo1I0I0oo1O(int i, List list) {
/* 1 */             long jCurrentTimeMillis = System.currentTimeMillis();
/* 8 */             this.I00000oIO = i;
/* 10 */            this.I00000oOI = list;
/* 12 */            this.I0000Il00O = jCurrentTimeMillis;
                }

                public final boolean equals(Object obj) {
/* 1 */             if (this == obj) {
/* 39 */                return true;
                    }
/* 6 */             if (!(obj instanceof Oo1I0I0oo1O)) {
/* 37 */                return false;
                    }
/* 9 */             Oo1I0I0oo1O oo1I0I0oo1O = (Oo1I0I0oo1O) obj;
                    return this.I00000oIO == oo1I0I0oo1O.I00000oIO && this.I00000oOI.equals(oo1I0I0oo1O.I00000oOI) && this.I0000Il00O == oo1I0I0oo1O.I0000Il00O;
                }

                public final int hashCode() {
/* 22 */            return Long.hashCode(this.I0000Il00O) + IIl001iO0Io.I0000oI00(Integer.hashCode(this.I00000oIO) * 31, 31, this.I00000oOI);
                }

                public final String toString() {
/* 5 */             StringBuilder sb = new StringBuilder("TinyGardenCommand(item=");
/* 10 */            sb.append(this.I00000oIO);
/* 15 */            sb.append(", plots=");
/* 20 */            sb.append(this.I00000oOI);
/* 25 */            sb.append(", ts=");
/* 32 */            return IlIi0I0.I000o00OoI0I(sb, this.I0000Il00O, ")");
                }
            }

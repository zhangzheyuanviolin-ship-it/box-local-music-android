            package p000;

            import java.util.LinkedHashMap;
            import java.util.LinkedHashSet;
            import java.util.Map;
            import java.util.Set;
            
/* 32 */    public final class Ool1o1l {
                public final IIl0lo1oi I00000oIO;
                public final Map I00000oOI;
                public final Set I0000Il00O;
                public Oi0OO1IIl1 I0000O;

                public Ool1o1l(IIl0lo1oi iIl0lo1oi, LinkedHashMap linkedHashMap, Oi0OO1IIl1 oi0OO1IIl1, int i) {
/* 30 */            this((i & 1) != 0 ? new IIl0lo1oi(0) : iIl0lo1oi, (i & 2) != 0 ? new LinkedHashMap() : linkedHashMap, new LinkedHashSet(), (i & 8) != 0 ? null : oi0OO1IIl1);
                }

                public final boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
/* 8 */             if (!(obj instanceof Ool1o1l)) {
/* 7 */                 return false;
                    }
/* 11 */            Ool1o1l ool1o1l = (Ool1o1l) obj;
                    return O0000Ioio00.I0000O(this.I00000oIO, ool1o1l.I00000oIO) && O0000Ioio00.I0000O(this.I00000oOI, ool1o1l.I00000oOI) && O0000Ioio00.I0000O(this.I0000Il00O, ool1o1l.I0000Il00O) && O0000Ioio00.I0000O(this.I0000O, ool1o1l.I0000O);
                }

                public final int hashCode() {
/* 23 */            int iHashCode = (this.I0000Il00O.hashCode() + Oi010OO0.I000iOII(this.I00000oOI, this.I00000oIO.hashCode() * 31, 31)) * 31;
/* 24 */            Oi0OO1IIl1 oi0OO1IIl1 = this.I0000O;
/* 36 */            return iHashCode + (oi0OO1IIl1 == null ? 0 : Integer.hashCode(oi0OO1IIl1.I00000oIO));
                }

                public final String toString() {
/* 48 */            return "InfoBundle(options=" + this.I00000oIO + ", tags=" + this.I00000oOI + ", listeners=" + this.I0000Il00O + ", template=" + this.I0000O + ')';
                }

/* 33 */        public Ool1o1l(IIl0lo1oi iIl0lo1oi, Map map, Set set, Oi0OO1IIl1 oi0OO1IIl1) {
/* 35 */            this.I00000oIO = iIl0lo1oi;
/* 36 */            this.I00000oOI = map;
/* 37 */            this.I0000Il00O = set;
/* 38 */            this.I0000O = oi0OO1IIl1;
                }
            }

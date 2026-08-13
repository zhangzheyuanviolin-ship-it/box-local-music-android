            package p000;

            import java.util.List;
            
            public abstract class O10IO0olI1I implements OilOloI {
                public final OilOloI I00000oIO;

                public O10IO0olI1I(OilOloI oilOloI) {
/* 4 */             this.I00000oIO = oilOloI;
                }

                @Override
                public final int I0000O(String str) {
/* 3 */             Integer numI000lI = OlOolloIIOl0.I000lI(10, str);
/* 7 */             if (numI000lI != null) {
/* 9 */                 return numI000lI.intValue();
                    }
/* 20 */            I000II.I000iOII(str.concat(" is not a valid list index"));
/* 23 */            return 0;
                }

                @Override
                public final int I0000oI00() {
/* 1 */             return 1;
                }

                @Override
                public final String I0001Ioi1lo(int i) {
/* 1 */             return String.valueOf(i);
                }

                @Override
                public final List I000II(int i) {
/* 1 */             if (i >= 0) {
/* 3 */                 return Il01100l.I00iOIl;
                    }
/* 20 */            IoOOl0iOl1io.I00111O(IlIi0I0.I00100o1O0lo("Illegal index ", i, ", "), I00000oIO(), " expects only non-negative indices");
/* 23 */            return null;
                }

                @Override
                public final OilOloI I000O01llI0(int i) {
/* 1 */             if (i >= 0) {
/* 3 */                 return this.I00000oIO;
                    }
/* 20 */            IoOOl0iOl1io.I00111O(IlIi0I0.I00100o1O0lo("Illegal index ", i, ", "), I00000oIO(), " expects only non-negative indices");
/* 23 */            return null;
                }

                @Override
                public final boolean I000OOo1O(int i) {
/* 1 */             if (i >= 0) {
/* 3 */                 return false;
                    }
/* 19 */            IoOOl0iOl1io.I00111O(IlIi0I0.I00100o1O0lo("Illegal index ", i, ", "), I00000oIO(), " expects only non-negative indices");
/* 22 */            return false;
                }

                @Override
                public final lO1oIl1ii I000oI1ioi() {
/* 1 */             return Oli00oo0l.I0000Il00O;
                }

                public final boolean equals(Object obj) {
/* 1 */             if (this == obj) {
/* 35 */                return true;
                    }
/* 6 */             if (!(obj instanceof O10IO0olI1I)) {
/* 37 */                return false;
                    }
/* 9 */             O10IO0olI1I o10IO0olI1I = (O10IO0olI1I) obj;
                    return this.I00000oIO.equals(o10IO0olI1I.I00000oIO) && O0000Ioio00.I0000O(I00000oIO(), o10IO0olI1I.I00000oIO());
                }

                public final int hashCode() {
/* 17 */            return I00000oIO().hashCode() + (this.I00000oIO.hashCode() * 31);
                }

                public final String toString() {
/* 28 */            return I00000oIO() + '(' + this.I00000oIO + ')';
                }
            }

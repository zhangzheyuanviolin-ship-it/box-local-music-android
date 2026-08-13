            package p000;

            import java.util.List;
            
            public final class O100I0 implements OilOloI {
                public OilOloI I00000oIO;
                public OilOloI I00000oOI;

                @Override
                public final String I00000oIO() {
/* 1 */             return "kotlin.collections.LinkedHashMap";
                }

                @Override
                public final int I0000O(String str) {
/* 3 */             Integer numI000lI = OlOolloIIOl0.I000lI(10, str);
/* 7 */             if (numI000lI != null) {
/* 9 */                 return numI000lI.intValue();
                    }
/* 20 */            I000II.I000iOII(str.concat(" is not a valid map index"));
/* 23 */            return 0;
                }

                @Override
                public final int I0000oI00() {
/* 1 */             return 2;
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
/* 14 */            I000II.I0010I0i(IIlIOloOOO.I00100l0("Illegal index ", i, ", kotlin.collections.LinkedHashMap expects only non-negative indices"));
/* 17 */            return null;
                }

                @Override
                public final OilOloI I000O01llI0(int i) {
/* 2 */             if (i < 0) {
/* 31 */                I000II.I0010I0i(IIlIOloOOO.I00100l0("Illegal index ", i, ", kotlin.collections.LinkedHashMap expects only non-negative indices"));
/* 1 */                 return null;
                    }
/* 4 */             int i2 = i % 2;
/* 6 */             if (i2 == 0) {
/* 20 */                return this.I00000oIO;
                    }
/* 9 */             if (i2 == 1) {
/* 11 */                return this.I00000oOI;
                    }
/* 16 */            I000II.I001IO000("Unreached");
/* 1 */             return null;
                }

                @Override
                public final boolean I000OOo1O(int i) {
/* 1 */             if (i >= 0) {
/* 3 */                 return false;
                    }
/* 13 */            I000II.I0010I0i(IIlIOloOOO.I00100l0("Illegal index ", i, ", kotlin.collections.LinkedHashMap expects only non-negative indices"));
/* 16 */            return false;
                }

                @Override
                public final lO1oIl1ii I000oI1ioi() {
/* 1 */             return Oli00oo0l.I0000O;
                }

                public final boolean equals(Object obj) {
/* 1 */             if (this == obj) {
/* 34 */                return true;
                    }
/* 6 */             if (!(obj instanceof O100I0)) {
/* 32 */                return false;
                    }
/* 9 */             O100I0 o100i0 = (O100I0) obj;
                    return this.I00000oIO.equals(o100i0.I00000oIO) && this.I00000oOI.equals(o100i0.I00000oOI);
                }

                public final int hashCode() {
/* 19 */            return this.I00000oOI.hashCode() + ((this.I00000oIO.hashCode() + 710441009) * 31);
                }

                public final String toString() {
/* 28 */            return "kotlin.collections.LinkedHashMap(" + this.I00000oIO + ", " + this.I00000oOI + ')';
                }
            }

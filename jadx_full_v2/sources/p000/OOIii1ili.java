            package p000;

            import java.util.List;
            
            public final class OOIii1ili implements OilOloI {
                public final String I00000oIO;
                public final OOIOoio0iiI I00000oOI;

                public OOIii1ili(String str, OOIOoio0iiI oOIOoio0iiI) {
/* 4 */             this.I00000oIO = str;
/* 6 */             this.I00000oOI = oOIOoio0iiI;
                }

                @Override
                public final String I00000oIO() {
/* 1 */             return this.I00000oIO;
                }

                public final void I00000oOI() {
/* 29 */            throw new IllegalStateException(IIl001iO0Io.I00100l0(new StringBuilder("Primitive descriptor "), this.I00000oIO, " does not have elements"));
                }

                @Override
                public final int I0000O(String str) {
/* 1 */             I00000oOI();
/* 49 */            throw null;
                }

                @Override
                public final int I0000oI00() {
/* 1 */             return 0;
                }

                @Override
                public final String I0001Ioi1lo(int i) {
/* 1 */             I00000oOI();
/* 49 */            throw null;
                }

                @Override
                public final List I000II(int i) {
/* 1 */             I00000oOI();
/* 49 */            throw null;
                }

                @Override
                public final OilOloI I000O01llI0(int i) {
/* 1 */             I00000oOI();
/* 49 */            throw null;
                }

                @Override
                public final boolean I000OOo1O(int i) {
/* 1 */             I00000oOI();
/* 49 */            throw null;
                }

                @Override
                public final lO1oIl1ii I000oI1ioi() {
/* 1 */             return this.I00000oOI;
                }

                public final boolean equals(Object obj) {
/* 1 */             if (this == obj) {
/* 31 */                return true;
                    }
/* 6 */             if (!(obj instanceof OOIii1ili)) {
/* 33 */                return false;
                    }
/* 9 */             OOIii1ili oOIii1ili = (OOIii1ili) obj;
                    return this.I00000oIO.equals(oOIii1ili.I00000oIO) && O0000Ioio00.I0000O(this.I00000oOI, oOIii1ili.I00000oOI);
                }

                public final int hashCode() {
/* 15 */            return (this.I00000oOI.hashCode() * 31) + this.I00000oIO.hashCode();
                }

                public final String toString() {
/* 12 */            return IlIi0I0.I000oI1ioi(new StringBuilder("PrimitiveDescriptor("), this.I00000oIO, ')');
                }
            }

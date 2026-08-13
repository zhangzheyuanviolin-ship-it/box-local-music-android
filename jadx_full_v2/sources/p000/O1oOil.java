            package p000;

            import java.util.Set;
            
/* 9 */     public final class O1oOil {
                public final O1oOl0 I00000oIO;
                public final String I00000oOI;
                public final Set I0000Il00O;

                public O1oOil(O1oOl0 o1oOl0, String str, Set set) {
/* 4 */             this.I00000oIO = o1oOl0;
/* 6 */             this.I00000oOI = str;
/* 8 */             this.I0000Il00O = set;
                }

                public final boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
/* 8 */             if (!(obj instanceof O1oOil)) {
/* 7 */                 return false;
                    }
/* 11 */            O1oOil o1oOil = (O1oOil) obj;
                    return this.I00000oIO == o1oOil.I00000oIO && O0000Ioio00.I0000O(this.I00000oOI, o1oOil.I00000oOI) && O0000Ioio00.I0000O(this.I0000Il00O, o1oOil.I0000Il00O);
                }

                public final int hashCode() {
/* 22 */            return this.I0000Il00O.hashCode() + Oi010OO0.I000O01llI0(this.I00000oIO.hashCode() * 31, 31, this.I00000oOI);
                }

                public final String toString() {
/* 38 */            return "ModelInitializationStatus(status=" + this.I00000oIO + ", error=" + this.I00000oOI + ", initializedBackends=" + this.I0000Il00O + ")";
                }

/* 10 */        public O1oOil(O1oOl0 o1oOl0) {
/* 13 */            this(o1oOl0, "", Il01llIol0.I00iOIl);
                }
            }

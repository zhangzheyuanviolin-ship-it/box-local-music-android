            package p000;

            import java.lang.reflect.Type;
            import java.util.Objects;
            
            public final class o0IOi0io1iOo {
                public final Class I00000oIO;
                public final Type I00000oOI;
                public final int I0000Il00O;

                public o0IOi0io1iOo(Type type) {
/* 4 */             Objects.requireNonNull(type);
/* 9 */             Type typeI00000oIO = iO1lo1I1iI.I00000oIO(type);
/* 13 */            this.I00000oOI = typeI00000oIO;
/* 19 */            this.I00000oIO = iO1lo1I1iI.I00000oOI(typeI00000oIO);
/* 25 */            this.I0000Il00O = typeI00000oIO.hashCode();
                }

                public final boolean equals(Object obj) {
/* 3 */             if (obj instanceof o0IOi0io1iOo) {
                        return iO1lo1I1iI.I0000Il00O(this.I00000oOI, ((o0IOi0io1iOo) obj).I00000oOI);
                    }
/* 19 */            return false;
                }

                public final int hashCode() {
/* 1 */             return this.I0000Il00O;
                }

                public final String toString() {
/* 3 */             return iO1lo1I1iI.I0000O(this.I00000oOI);
                }
            }

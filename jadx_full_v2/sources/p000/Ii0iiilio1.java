            package p000;
            
            @Oili0O
            public final class Ii0iiilio1 implements OIO0ii {
                public static final Ii0iiil0O Companion = new Ii0iiil0O();
                public O1llOlOo I00000oIO;
                public I1oO1o1111o I00000oOI;

                @Override
                public final OIO1iOO1iiOI I00000oIO() {
/* 1 */             return this.I00000oOI;
                }

                public final boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
/* 8 */             if (!(obj instanceof Ii0iiilio1)) {
/* 7 */                 return false;
                    }
/* 11 */            Ii0iiilio1 ii0iiilio1 = (Ii0iiilio1) obj;
                    return O0000Ioio00.I0000O(this.I00000oIO, ii0iiilio1.I00000oIO) && O0000Ioio00.I0000O(this.I00000oOI, ii0iiilio1.I00000oOI);
                }

                @Override
                public final O1llOlOo getMethod() {
/* 1 */             return this.I00000oIO;
                }

                public final int hashCode() {
/* 7 */             int iHashCode = this.I00000oIO.hashCode() * 31;
/* 9 */             I1oO1o1111o i1oO1o1111o = this.I00000oOI;
/* 19 */            return iHashCode + (i1oO1o1111o == null ? 0 : i1oO1o1111o.hashCode());
                }

                public final String toString() {
/* 28 */            return "CustomNotification(method=" + this.I00000oIO + ", params=" + this.I00000oOI + ")";
                }
            }

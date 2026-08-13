            package p000;
            
            public final class iOIoOO0Ii1o0 implements i1IOlOO0OlIi {
                public i1IOlOO0OlIi I00000oIO;
                public Object I00000oOI;

                public final boolean equals(Object obj) {
/* 3 */             if (!(obj instanceof iOIoOO0Ii1o0)) {
/* 30 */                return false;
                    }
/* 6 */             iOIoOO0Ii1o0 ioiooo0ii1o0 = (iOIoOO0Ii1o0) obj;
                    return this.I00000oIO.equals(ioiooo0ii1o0.I00000oIO) && this.I00000oOI.equals(ioiooo0ii1o0.I00000oOI);
                }

                public final int hashCode() {
/* 13 */            return this.I00000oIO.hashCode() ^ this.I00000oOI.hashCode();
                }

                public final String toString() {
/* 19 */            return Oi010OO0.I001IO000("SpecializedLogSiteKey{ delegate='", this.I00000oIO.toString(), "', qualifier='", this.I00000oOI.toString(), "' }");
                }
            }

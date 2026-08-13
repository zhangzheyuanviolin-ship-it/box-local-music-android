            package p000;

            import java.util.LinkedHashMap;
            import java.util.Map;
            
            public final class IO1looOIi {
                public final boolean I00000oIO;
                public final boolean I00000oOI;
                public final boolean I0000Il00O;
                public final Map I0000O;
                public final Map I0000oI00;

                public IO1looOIi(boolean z, boolean z2, boolean z3, Map map, Map map2) {
/* 4 */             this.I00000oIO = z;
/* 6 */             this.I00000oOI = z2;
/* 8 */             this.I0000Il00O = z3;
/* 10 */            this.I0000O = map;
/* 12 */            this.I0000oI00 = map2;
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r10v2, types: [java.util.Map] */
                public static IO1looOIi I00000oIO(IO1looOIi iO1looOIi, boolean z, boolean z2, boolean z3, LinkedHashMap linkedHashMap, int i) {
/* 3 */             if ((i & 1) != 0) {
/* 5 */                 z = iO1looOIi.I00000oIO;
                    }
/* 7 */             boolean z4 = z;
/* 10 */            if ((i & 2) != 0) {
/* 12 */                z2 = iO1looOIi.I00000oOI;
                    }
/* 14 */            boolean z5 = z2;
/* 17 */            if ((i & 4) != 0) {
/* 19 */                z3 = iO1looOIi.I0000Il00O;
                    }
/* 21 */            boolean z6 = z3;
                    LinkedHashMap linkedHashMap2 = linkedHashMap;
/* 24 */            if ((i & 8) != 0) {
/* 26 */                linkedHashMap2 = iO1looOIi.I0000O;
                    }
/* 29 */            Map map = iO1looOIi.I0000oI00;
/* 31 */            iO1looOIi.getClass();
/* 36 */            return new IO1looOIi(z4, z5, z6, linkedHashMap2, map);
                }

                public final boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
/* 8 */             if (!(obj instanceof IO1looOIi)) {
/* 7 */                 return false;
                    }
/* 11 */            IO1looOIi iO1looOIi = (IO1looOIi) obj;
                    return this.I00000oIO == iO1looOIi.I00000oIO && this.I00000oOI == iO1looOIi.I00000oOI && this.I0000Il00O == iO1looOIi.I0000Il00O && O0000Ioio00.I0000O(this.I0000O, iO1looOIi.I0000O) && O0000Ioio00.I0000O(this.I0000oI00, iO1looOIi.I0000oI00);
                }

                public final int hashCode() {
/* 34 */            return this.I0000oI00.hashCode() + Oi010OO0.I000iOII(this.I0000O, Oi010OO0.I000OOo1O(Oi010OO0.I000OOo1O(Boolean.hashCode(this.I00000oIO) * 31, 31, this.I00000oOI), 31, this.I0000Il00O), 31);
                }

                public final String toString() {
/* 58 */            return "ChatUiState(inProgress=" + this.I00000oIO + ", isResettingSession=" + this.I00000oOI + ", preparing=" + this.I0000Il00O + ", messagesByModel=" + this.I0000O + ", streamingMessagesByModel=" + this.I0000oI00 + ")";
                }
            }

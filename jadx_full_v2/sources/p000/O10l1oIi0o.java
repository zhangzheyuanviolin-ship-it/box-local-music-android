            package p000;

            import kotlin.jvm.functions.Function1;
            
            public final class O10l1oIi0o {
                public static final O10l1oIi0o I0001Ioi1lo = new O10l1oIi0o(null, null, null, null, null);
                public final Oo0o1OiIo I00000oIO;
                public final Oo0o1OiIo I00000oOI;
                public final Oo0o1OiIo I0000Il00O;
                public final Function1 I0000O;
                public final Function1 I0000oI00;

                public O10l1oIi0o(Oo0o1OiIo oo0o1OiIo, Oo0o1OiIo oo0o1OiIo2, Oo0o1OiIo oo0o1OiIo3, Function1 function1, Function1 function12) {
/* 4 */             this.I00000oIO = oo0o1OiIo;
/* 6 */             this.I00000oOI = oo0o1OiIo2;
/* 8 */             this.I0000Il00O = oo0o1OiIo3;
/* 10 */            this.I0000O = function1;
/* 12 */            this.I0000oI00 = function12;
                }

                public final boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
/* 8 */             if (!(obj instanceof O10l1oIi0o)) {
/* 7 */                 return false;
                    }
/* 11 */            O10l1oIi0o o10l1oIi0o = (O10l1oIi0o) obj;
                    return O0000Ioio00.I0000O(this.I00000oIO, o10l1oIi0o.I00000oIO) && O0000Ioio00.I0000O(this.I00000oOI, o10l1oIi0o.I00000oOI) && O0000Ioio00.I0000O(this.I0000Il00O, o10l1oIi0o.I0000Il00O) && O0000Ioio00.I0000O(this.I0000O, o10l1oIi0o.I0000O) && O0000Ioio00.I0000O(this.I0000oI00, o10l1oIi0o.I0000oI00);
                }

                public final int hashCode() {
/* 2 */             Oo0o1OiIo oo0o1OiIo = this.I00000oIO;
/* 14 */            int iHashCode = (oo0o1OiIo == null ? 0 : Long.hashCode(oo0o1OiIo.I00000oIO)) * 31;
/* 16 */            Oo0o1OiIo oo0o1OiIo2 = this.I00000oOI;
/* 29 */            int iHashCode2 = (iHashCode + (oo0o1OiIo2 == null ? 0 : Long.hashCode(oo0o1OiIo2.I00000oIO))) * 31;
/* 31 */            Oo0o1OiIo oo0o1OiIo3 = this.I0000Il00O;
/* 44 */            int iHashCode3 = (iHashCode2 + (oo0o1OiIo3 == null ? 0 : Long.hashCode(oo0o1OiIo3.I00000oIO))) * 31;
/* 46 */            Function1 function1 = this.I0000O;
/* 57 */            int iHashCode4 = (iHashCode3 + (function1 == null ? 0 : function1.hashCode())) * 31;
/* 59 */            Function1 function12 = this.I0000oI00;
/* 68 */            return iHashCode4 + (function12 != null ? function12.hashCode() : 0);
                }

                public final String toString() {
/* 58 */            return "ListStyle(markerIndent=" + this.I00000oIO + ", contentsIndent=" + this.I00000oOI + ", itemSpacing=" + this.I0000Il00O + ", orderedMarkers=" + this.I0000O + ", unorderedMarkers=" + this.I0000oI00 + ")";
                }
            }

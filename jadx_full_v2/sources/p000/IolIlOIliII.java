            package p000;

            import kotlin.jvm.functions.Function3;
            
            public final class IolIlOIliII {
                public static final IolIlOIliII I0000O = new IolIlOIliII(null, null, null);
                public final OIo1Oi1l1lI I00000oIO;
                public final Function3 I00000oOI;
                public final Function3 I0000Il00O;

                public IolIlOIliII(OIo1Oi1l1lI oIo1Oi1l1lI, Function3 function3, Function3 function32) {
/* 4 */             this.I00000oIO = oIo1Oi1l1lI;
/* 6 */             this.I00000oOI = function3;
/* 8 */             this.I0000Il00O = function32;
                }

                public final boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
/* 8 */             if (!(obj instanceof IolIlOIliII)) {
/* 7 */                 return false;
                    }
/* 11 */            IolIlOIliII iolIlOIliII = (IolIlOIliII) obj;
                    return O0000Ioio00.I0000O(this.I00000oIO, iolIlOIliII.I00000oIO) && O0000Ioio00.I0000O(this.I00000oOI, iolIlOIliII.I00000oOI) && O0000Ioio00.I0000O(this.I0000Il00O, iolIlOIliII.I0000Il00O);
                }

                public final int hashCode() {
/* 2 */             OIo1Oi1l1lI oIo1Oi1l1lI = this.I00000oIO;
/* 12 */            int iHashCode = (oIo1Oi1l1lI == null ? 0 : oIo1Oi1l1lI.hashCode()) * 31;
/* 14 */            Function3 function3 = this.I00000oOI;
/* 25 */            int iHashCode2 = (iHashCode + (function3 == null ? 0 : function3.hashCode())) * 31;
/* 27 */            Function3 function32 = this.I0000Il00O;
/* 36 */            return iHashCode2 + (function32 != null ? function32.hashCode() : 0);
                }

                public final String toString() {
/* 38 */            return "InfoPanelStyle(contentPadding=" + this.I00000oIO + ", background=" + this.I00000oOI + ", textStyle=" + this.I0000Il00O + ")";
                }
            }

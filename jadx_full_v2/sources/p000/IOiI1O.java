            package p000;

            import java.util.List;
            
            @Oili0O
            public final class IOiI1O {
                public static final IOiI11i001 Companion = new IOiI11i001();
                public static final O0ioIllo0i1[] I0000O = {l0oi0lOi11i.I00000oIO(O0oI01I0oo.I00iOIl, new IIl11il0I0io(5)), null, null};
                public List I00000oIO;
                public Integer I00000oOI;
                public Boolean I0000Il00O;

                public final boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
/* 8 */             if (!(obj instanceof IOiI1O)) {
/* 7 */                 return false;
                    }
/* 11 */            IOiI1O iOiI1O = (IOiI1O) obj;
                    return O0000Ioio00.I0000O(this.I00000oIO, iOiI1O.I00000oIO) && O0000Ioio00.I0000O(this.I00000oOI, iOiI1O.I00000oOI) && O0000Ioio00.I0000O(this.I0000Il00O, iOiI1O.I0000Il00O);
                }

                public final int hashCode() {
/* 7 */             int iHashCode = this.I00000oIO.hashCode() * 31;
/* 9 */             Integer num = this.I00000oOI;
/* 21 */            int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
/* 23 */            Boolean bool = this.I0000Il00O;
/* 32 */            return iHashCode2 + (bool != null ? bool.hashCode() : 0);
                }

                public final String toString() {
/* 38 */            return "Completion(values=" + this.I00000oIO + ", total=" + this.I00000oOI + ", hasMore=" + this.I0000Il00O + ")";
                }
            }

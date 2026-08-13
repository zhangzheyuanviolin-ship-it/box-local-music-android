            package p000;

            import java.util.ArrayList;
            import java.util.Set;
            
            public final class IO0lll0O {
                public static final IO0lll0O I0000Il00O = new IO0lll0O(IOOi0Ool1i.I00iio(new ArrayList()), null);
                public final Set I00000oIO;
                public final iOl11OooolI0 I00000oOI;

                public IO0lll0O(Set set, iOl11OooolI0 iol11ooooli0) {
/* 4 */             this.I00000oIO = set;
/* 6 */             this.I00000oOI = iol11ooooli0;
                }

                public final boolean equals(Object obj) {
/* 3 */             if (!(obj instanceof IO0lll0O)) {
/* 29 */                return false;
                    }
/* 5 */             IO0lll0O iO0lll0O = (IO0lll0O) obj;
                    return iO0lll0O.I00000oIO.equals(this.I00000oIO) && O0000Ioio00.I0000O(iO0lll0O.I00000oOI, this.I00000oOI);
                }

                public final int hashCode() {
/* 9 */             int iHashCode = (this.I00000oIO.hashCode() + 1517) * 41;
/* 11 */            iOl11OooolI0 iol11ooooli0 = this.I00000oOI;
/* 21 */            return iHashCode + (iol11ooooli0 != null ? iol11ooooli0.hashCode() : 0);
                }
            }

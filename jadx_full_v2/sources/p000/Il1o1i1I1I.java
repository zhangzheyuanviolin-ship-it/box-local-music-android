            package p000;

            import java.util.ArrayList;
            import java.util.Map;
            
            public final class Il1o1i1I1I {
                public ArrayList I00000oIO;
                public II0l011 I00000oOI;
                public IO0Il0o1OI I0000Il00O;
                public int I0000O;
                public Map I0000oI00;
                public Integer I0001Ioi1lo;
                public Il1oI0O I000II;
                public I0oiIOi00lo1 I000O01llI0;

                public final boolean equals(Object obj) {
/* 1 */             if (this == obj) {
/* 84 */                return true;
                    }
/* 7 */             if (obj instanceof Il1o1i1I1I) {
/* 10 */                Il1o1i1I1I il1o1i1I1I = (Il1o1i1I1I) obj;
/* 20 */                if (this.I00000oIO.equals(il1o1i1I1I.I00000oIO) && this.I00000oOI == il1o1i1I1I.I00000oOI && this.I0000Il00O == il1o1i1I1I.I0000Il00O && this.I0000O == il1o1i1I1I.I0000O && this.I0000oI00.equals(il1o1i1I1I.I0000oI00) && this.I0001Ioi1lo.equals(il1o1i1I1I.I0001Ioi1lo) && this.I000II == il1o1i1I1I.I000II && O0000Ioio00.I0000O(this.I000O01llI0, il1o1i1I1I.I000O01llI0)) {
/* 84 */                    return true;
                        }
                    }
/* 6 */             return false;
                }

                public final int hashCode() {
/* 60 */            int iHashCode = (this.I000II.hashCode() + ((this.I0001Ioi1lo.hashCode() + Oi010OO0.I000iOII(this.I0000oI00, IIl001iO0Io.I0000O(this.I0000O, (this.I0000Il00O.hashCode() + ((this.I00000oOI.hashCode() + ((this.I00000oIO.hashCode() + (Integer.hashCode(2) * 31)) * 31)) * 31)) * 31, 31), 31)) * 31)) * 31;
/* 61 */            I0oiIOi00lo1 i0oiIOi00lo1 = this.I000O01llI0;
/* 71 */            return iHashCode + (i0oiIOi00lo1 == null ? 0 : i0oiIOi00lo1.hashCode());
                }

                public final String toString() {
/* 88 */            return "ExtensionSessionConfigData(sessionType=2, outputConfigurations=" + this.I00000oIO + ", executor=" + this.I00000oOI + ", stateCallback=" + this.I0000Il00O + ", sessionTemplateId=" + this.I0000O + ", sessionParameters=" + this.I0000oI00 + ", extensionMode=" + this.I0001Ioi1lo + ", extensionStateCallback=" + this.I000II + ", postviewOutputConfiguration=" + this.I000O01llI0 + ')';
                }
            }

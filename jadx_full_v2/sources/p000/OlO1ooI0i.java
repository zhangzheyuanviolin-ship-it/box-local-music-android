            package p000;

            import java.util.ArrayList;
            
            public final class OlO1ooI0i {
                public ArrayList I00000oIO;
                public int I00000oOI;
                public int I0000Il00O;
                public IOi10loi I0000O;

                public final boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
/* 8 */             if (obj instanceof OlO1ooI0i) {
/* 11 */                OlO1ooI0i olO1ooI0i = (OlO1ooI0i) obj;
                        return this.I00000oIO.equals(olO1ooI0i.I00000oIO) && this.I00000oOI == olO1ooI0i.I00000oOI && this.I0000Il00O == olO1ooI0i.I0000Il00O && this.I0000O == olO1ooI0i.I0000O;
                    }
/* 7 */             return false;
                }

                public final int hashCode() {
/* 28 */            return this.I0000O.hashCode() + IIl001iO0Io.I0000O(this.I0000Il00O, IIl001iO0Io.I0000O(this.I00000oOI, this.I00000oIO.hashCode() * 31, 31), 31);
                }

                public final String toString() {
/* 48 */            return "CaptureRequest(captureConfigs=" + this.I00000oIO + ", captureMode=" + this.I00000oOI + ", flashType=" + this.I0000Il00O + ", result=" + this.I0000O + ')';
                }
            }

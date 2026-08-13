            package p000;

            import java.util.List;
            
            public final class IIooO1o11oo1 {
                public List I00000oIO;
                public int I00000oOI;
                public IOlOo1ll1l1 I0000Il00O;

                public final boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
/* 8 */             if (!(obj instanceof IIooO1o11oo1)) {
/* 7 */                 return false;
                    }
/* 11 */            IIooO1o11oo1 iIooO1o11oo1 = (IIooO1o11oo1) obj;
                    return O0000Ioio00.I0000O(this.I00000oIO, iIooO1o11oo1.I00000oIO) && this.I00000oOI == iIooO1o11oo1.I00000oOI && O0000Ioio00.I0000O(this.I0000Il00O, iIooO1o11oo1.I0000Il00O);
                }

                public final int hashCode() {
/* 22 */            return this.I0000Il00O.hashCode() + IIl001iO0Io.I0000O(this.I00000oOI, this.I00000oIO.hashCode() * 31, 31);
                }

                public final String toString() {
/* 42 */            return "MainCaptureParams(configs=" + this.I00000oIO + ", requestTemplate=" + ((Object) Oi0OO1IIl1.I0000Il00O(this.I00000oOI)) + ", sessionConfigOptions=" + this.I0000Il00O + ')';
                }
            }

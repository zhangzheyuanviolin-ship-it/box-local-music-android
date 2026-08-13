            package p000;

            import kotlin.Metadata;
            
            @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"LO0lO11O;", "LO1oooooIio;", "LO0lO1IooO0I0;", "foundation"}, m18k = 1, mv = {2, 1, 0}, xi = 48)
            public final class O0lO11O extends O1oooooIio {
                public OlIOiI1iI1 I00000oIO;
                public IlIoO1ilo1 I00000oOI;
                public OlIOiI1iI1 I0000Il00O;

                @Override
                public final O1ooOo I000II() {
/* 3 */             OlIOiI1iI1 olIOiI1iI1 = this.I00000oIO;
/* 5 */             IlIoO1ilo1 ilIoO1ilo1 = this.I00000oOI;
/* 7 */             OlIOiI1iI1 olIOiI1iI12 = this.I0000Il00O;
/* 9 */             O0lO1IooO0I0 o0lO1IooO0I0 = new O0lO1IooO0I0();
/* 12 */            o0lO1IooO0I0.I00o0iI0io1 = olIOiI1iI1;
/* 14 */            o0lO1IooO0I0.I00o0l1o1o0 = ilIoO1ilo1;
/* 16 */            o0lO1IooO0I0.I00o101lO = olIOiI1iI12;
/* 20 */            return o0lO1IooO0I0;
                }

                @Override
                public final void I000O01llI0(O1ooOo o1ooOo) {
/* 1 */             O0lO1IooO0I0 o0lO1IooO0I0 = (O0lO1IooO0I0) o1ooOo;
/* 5 */             o0lO1IooO0I0.I00o0iI0io1 = this.I00000oIO;
/* 9 */             o0lO1IooO0I0.I00o0l1o1o0 = this.I00000oOI;
/* 13 */            o0lO1IooO0I0.I00o101lO = this.I0000Il00O;
                }

                public final boolean equals(Object obj) {
/* 1 */             if (this == obj) {
/* 45 */                return true;
                    }
/* 6 */             if (!(obj instanceof O0lO11O)) {
/* 43 */                return false;
                    }
/* 9 */             O0lO11O o0lO11O = (O0lO11O) obj;
                    return O0000Ioio00.I0000O(this.I00000oIO, o0lO11O.I00000oIO) && O0000Ioio00.I0000O(this.I00000oOI, o0lO11O.I00000oOI) && O0000Ioio00.I0000O(this.I0000Il00O, o0lO11O.I0000Il00O);
                }

                public final int hashCode() {
/* 1 */             OlIOiI1iI1 olIOiI1iI1 = this.I00000oIO;
/* 12 */            int iHashCode = (olIOiI1iI1 == null ? 0 : olIOiI1iI1.hashCode()) * 31;
/* 14 */            IlIoO1ilo1 ilIoO1ilo1 = this.I00000oOI;
/* 25 */            int iHashCode2 = (iHashCode + (ilIoO1ilo1 == null ? 0 : ilIoO1ilo1.hashCode())) * 31;
/* 27 */            OlIOiI1iI1 olIOiI1iI12 = this.I0000Il00O;
/* 36 */            return iHashCode2 + (olIOiI1iI12 != null ? olIOiI1iI12.hashCode() : 0);
                }

                public final String toString() {
/* 38 */            return "LazyLayoutAnimateItemElement(fadeInSpec=" + this.I00000oIO + ", placementSpec=" + this.I00000oOI + ", fadeOutSpec=" + this.I0000Il00O + ")";
                }
            }

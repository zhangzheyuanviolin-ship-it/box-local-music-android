            package p000;

            import kotlin.Metadata;
            
            @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"LOlliOl110Ii;", "LO1oooooIio;", "LOllii0ii0lOl;", "material3"}, m18k = 1, mv = {2, 1, 0}, xi = 48)
            public final class OlliOl110Ii extends O1oooooIio {
                public final OlO01l1oOil I00000oIO;
                public final int I00000oOI;
                public final IlIoO1ilo1 I0000Il00O;

                public OlliOl110Ii(OIooliIO0 oIooliIO0, int i, IlIoO1ilo1 ilIoO1ilo1) {
/* 4 */             this.I00000oIO = oIooliIO0;
/* 6 */             this.I00000oOI = i;
/* 8 */             this.I0000Il00O = ilIoO1ilo1;
                }

                @Override
                public final O1ooOo I000II() {
/* 3 */             Ollii0ii0lOl ollii0ii0lOl = new Ollii0ii0lOl();
/* 8 */             ollii0ii0lOl.I00o0iI0io1 = this.I00000oIO;
/* 12 */            ollii0ii0lOl.I00o0l1o1o0 = this.I00000oOI;
/* 15 */            ollii0ii0lOl.I00o101lO = true;
/* 19 */            ollii0ii0lOl.I00oI0i = this.I0000Il00O;
/* 55 */            return ollii0ii0lOl;
                }

                @Override
                public final void I000O01llI0(O1ooOo o1ooOo) {
/* 1 */             Ollii0ii0lOl ollii0ii0lOl = (Ollii0ii0lOl) o1ooOo;
/* 5 */             ollii0ii0lOl.I00o0iI0io1 = this.I00000oIO;
/* 9 */             ollii0ii0lOl.I00o0l1o1o0 = this.I00000oOI;
/* 12 */            ollii0ii0lOl.I00o101lO = true;
/* 16 */            ollii0ii0lOl.I00oI0i = this.I0000Il00O;
                }

                public final boolean equals(Object obj) {
/* 1 */             if (this == obj) {
/* 41 */                return true;
                    }
/* 6 */             if (!(obj instanceof OlliOl110Ii)) {
/* 39 */                return false;
                    }
/* 9 */             OlliOl110Ii olliOl110Ii = (OlliOl110Ii) obj;
                    return O0000Ioio00.I0000O(this.I00000oIO, olliOl110Ii.I00000oIO) && this.I00000oOI == olliOl110Ii.I00000oOI && O0000Ioio00.I0000O(this.I0000Il00O, olliOl110Ii.I0000Il00O);
                }

                public final int hashCode() {
/* 27 */            return this.I0000Il00O.hashCode() + Oi010OO0.I000OOo1O(IIl001iO0Io.I0000O(this.I00000oOI, this.I00000oIO.hashCode() * 31, 31), 31, true);
                }

                public final String toString() {
/* 38 */            return "TabIndicatorModifier(tabPositionsState=" + this.I00000oIO + ", selectedTabIndex=" + this.I00000oOI + ", followContentSize=true, animationSpec=" + this.I0000Il00O + ")";
                }
            }

            package p000;

            import kotlin.Metadata;
            
            @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"LOiOoiOOo;", "LO1oooooIio;", "LOiOiiIo0l;", "foundation"}, m18k = 1, mv = {2, 1, 0}, xi = 48)
            public final class OiOoiOOo extends O1oooooIio {
                public OiOl01il10lO I00000oIO;
                public boolean I00000oOI;

                @Override
                public final O1ooOo I000II() {
/* 3 */             OiOl01il10lO oiOl01il10lO = this.I00000oIO;
/* 5 */             boolean z = this.I00000oOI;
/* 7 */             OiOiiIo0l oiOiiIo0l = new OiOiiIo0l();
/* 10 */            oiOiiIo0l.I00o0iI0io1 = oiOl01il10lO;
/* 12 */            oiOiiIo0l.I00o0l1o1o0 = z;
/* 20 */            return oiOiiIo0l;
                }

                @Override
                public final void I000O01llI0(O1ooOo o1ooOo) {
/* 1 */             OiOiiIo0l oiOiiIo0l = (OiOiiIo0l) o1ooOo;
/* 5 */             oiOiiIo0l.I00o0iI0io1 = this.I00000oIO;
/* 9 */             oiOiiIo0l.I00o0l1o1o0 = this.I00000oOI;
                }

                public final boolean equals(Object obj) {
/* 3 */             if (!(obj instanceof OiOoiOOo)) {
/* 26 */                return false;
                    }
/* 8 */             OiOoiOOo oiOoiOOo = (OiOoiOOo) obj;
                    return O0000Ioio00.I0000O(this.I00000oIO, oiOoiOOo.I00000oIO) && this.I00000oOI == oiOoiOOo.I00000oOI;
                }

                public final int hashCode() {
/* 21 */            return Boolean.hashCode(this.I00000oOI) + Oi010OO0.I000OOo1O(this.I00000oIO.hashCode() * 31, 31, false);
                }
            }

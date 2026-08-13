            package p000;

            import kotlin.Metadata;
            
            @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"LO0lOIOli1O0O;", "LO1oooooIio;", "LO0lOOOI0Oo;", "foundation"}, m18k = 1, mv = {2, 1, 0}, xi = 48)
            final class O0lOIOli1O0O extends O1oooooIio {
                public O0lOOii I00000oIO;
                public Oi1ol0llI I00000oOI;
                public OIilII I0000Il00O;

                @Override
                public final O1ooOo I000II() {
/* 3 */             O0lOOii o0lOOii = this.I00000oIO;
/* 5 */             Oi1ol0llI oi1ol0llI = this.I00000oOI;
/* 7 */             OIilII oIilII = this.I0000Il00O;
/* 9 */             O0lOOOI0Oo o0lOOOI0Oo = new O0lOOOI0Oo();
/* 12 */            o0lOOOI0Oo.I00o0iI0io1 = o0lOOii;
/* 14 */            o0lOOOI0Oo.I00o0l1o1o0 = oi1ol0llI;
/* 16 */            o0lOOOI0Oo.I00o101lO = oIilII;
/* 20 */            return o0lOOOI0Oo;
                }

                @Override
                public final void I000O01llI0(O1ooOo o1ooOo) {
/* 1 */             O0lOOOI0Oo o0lOOOI0Oo = (O0lOOOI0Oo) o1ooOo;
/* 3 */             O0lOOii o0lOOii = this.I00000oIO;
/* 5 */             Oi1ol0llI oi1ol0llI = this.I00000oOI;
/* 7 */             OIilII oIilII = this.I0000Il00O;
/* 9 */             o0lOOOI0Oo.I00o0iI0io1 = o0lOOii;
/* 11 */            o0lOOOI0Oo.I00o0l1o1o0 = oi1ol0llI;
/* 13 */            o0lOOOI0Oo.I00o101lO = oIilII;
                }

                public final boolean equals(Object obj) {
/* 1 */             if (this == obj) {
/* 41 */                return true;
                    }
/* 6 */             if (!(obj instanceof O0lOIOli1O0O)) {
/* 39 */                return false;
                    }
/* 11 */            O0lOIOli1O0O o0lOIOli1O0O = (O0lOIOli1O0O) obj;
                    return O0000Ioio00.I0000O(this.I00000oIO, o0lOIOli1O0O.I00000oIO) && O0000Ioio00.I0000O(this.I00000oOI, o0lOIOli1O0O.I00000oOI) && this.I0000Il00O == o0lOIOli1O0O.I0000Il00O;
                }

                public final int hashCode() {
/* 29 */            return this.I0000Il00O.hashCode() + Oi010OO0.I000OOo1O((this.I00000oOI.hashCode() + (this.I00000oIO.hashCode() * 31)) * 31, 31, false);
                }
            }

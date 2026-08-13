            package p000;

            import kotlin.Metadata;
            
            @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"LOo10llOii1o;", "LO1oooooIio;", "LOo10o0lI00O;", "material3"}, m18k = 1, mv = {2, 1, 0}, xi = 48)
            final class Oo10llOii1o extends O1oooooIio {
                public OI0lOIiOIOOo I00000oIO;
                public boolean I00000oOI;
                public IlIoO1ilo1 I0000Il00O;

                @Override
                public final O1ooOo I000II() {
/* 3 */             OI0lOIiOIOOo oI0lOIiOIOOo = this.I00000oIO;
/* 5 */             boolean z = this.I00000oOI;
/* 7 */             IlIoO1ilo1 ilIoO1ilo1 = this.I0000Il00O;
/* 9 */             Oo10o0lI00O oo10o0lI00O = new Oo10o0lI00O();
/* 12 */            oo10o0lI00O.I00o0iI0io1 = oI0lOIiOIOOo;
/* 14 */            oo10o0lI00O.I00o0l1o1o0 = z;
/* 16 */            oo10o0lI00O.I00o101lO = ilIoO1ilo1;
/* 20 */            oo10o0lI00O.I00oO101o = Float.NaN;
/* 22 */            oo10o0lI00O.I00oOio10iI1 = Float.NaN;
/* 55 */            return oo10o0lI00O;
                }

                @Override
                public final void I000O01llI0(O1ooOo o1ooOo) {
/* 1 */             Oo10o0lI00O oo10o0lI00O = (Oo10o0lI00O) o1ooOo;
/* 5 */             oo10o0lI00O.I00o0iI0io1 = this.I00000oIO;
/* 7 */             boolean z = oo10o0lI00O.I00o0l1o1o0;
/* 9 */             boolean z2 = this.I00000oOI;
/* 11 */            if (z != z2) {
/* 13 */                l0o11Oi.I00000oOI(oo10o0lI00O);
                    }
/* 16 */            oo10o0lI00O.I00o0l1o1o0 = z2;
/* 20 */            oo10o0lI00O.I00o101lO = this.I0000Il00O;
/* 24 */            if (oo10o0lI00O.I00oIiI10 == null && !Float.isNaN(oo10o0lI00O.I00oOio10iI1)) {
/* 40 */                oo10o0lI00O.I00oIiI10 = O1OI1ll1Il0i.I00000oIO(oo10o0lI00O.I00oOio10iI1);
                    }
/* 44 */            if (oo10o0lI00O.I00oII != null || Float.isNaN(oo10o0lI00O.I00oO101o)) {
/* 77 */                return;
                    }
/* 60 */            oo10o0lI00O.I00oII = O1OI1ll1Il0i.I00000oIO(oo10o0lI00O.I00oO101o);
                }

                public final boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
/* 8 */             if (!(obj instanceof Oo10llOii1o)) {
/* 7 */                 return false;
                    }
/* 11 */            Oo10llOii1o oo10llOii1o = (Oo10llOii1o) obj;
                    return O0000Ioio00.I0000O(this.I00000oIO, oo10llOii1o.I00000oIO) && this.I00000oOI == oo10llOii1o.I00000oOI && O0000Ioio00.I0000O(this.I0000Il00O, oo10llOii1o.I0000Il00O);
                }

                public final int hashCode() {
/* 22 */            return this.I0000Il00O.hashCode() + Oi010OO0.I000OOo1O(this.I00000oIO.hashCode() * 31, 31, this.I00000oOI);
                }

                public final String toString() {
/* 38 */            return "ThumbElement(interactionSource=" + this.I00000oIO + ", checked=" + this.I00000oOI + ", animationSpec=" + this.I0000Il00O + ")";
                }
            }

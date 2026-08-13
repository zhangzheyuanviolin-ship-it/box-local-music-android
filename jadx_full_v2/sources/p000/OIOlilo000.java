            package p000;

            import kotlin.Metadata;
            import kotlin.jvm.functions.Function1;
            
            @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"LOIOlilo000;", "LO1oooooIio;", "LOIOlio0llOo;", "foundation-layout"}, m18k = 1, mv = {2, 1, 0}, xi = 48)
            final class OIOlilo000 extends O1oooooIio {
                public Function1 I00000oIO;
                public boolean I00000oOI;

                @Override
                public final O1ooOo I000II() {
/* 3 */             Function1 function1 = this.I00000oIO;
/* 5 */             boolean z = this.I00000oOI;
/* 7 */             OIOlio0llOo oIOlio0llOo = new OIOlio0llOo();
/* 10 */            oIOlio0llOo.I00o0iI0io1 = function1;
/* 12 */            oIOlio0llOo.I00o0l1o1o0 = z;
/* 20 */            return oIOlio0llOo;
                }

                @Override
                public final void I000O01llI0(O1ooOo o1ooOo) {
/* 1 */             OIOlio0llOo oIOlio0llOo = (OIOlio0llOo) o1ooOo;
/* 3 */             Function1 function1 = this.I00000oIO;
/* 5 */             boolean z = this.I00000oOI;
/* 9 */             if (oIOlio0llOo.I00o0iI0io1 != function1 || oIOlio0llOo.I00o0l1o1o0 != z) {
/* 20 */                il0lI1i1olii.I000O01llI0(oIOlio0llOo).I00Oio(false);
                    }
/* 23 */            oIOlio0llOo.I00o0iI0io1 = function1;
/* 25 */            oIOlio0llOo.I00o0l1o1o0 = z;
                }

                public final boolean equals(Object obj) {
/* 1 */             if (this == obj) {
/* 27 */                return true;
                    }
/* 11 */            OIOlilo000 oIOlilo000 = obj instanceof OIOlilo000 ? (OIOlilo000) obj : null;
                    return oIOlilo000 != null && this.I00000oIO == oIOlilo000.I00000oIO && this.I00000oOI == oIOlilo000.I00000oOI;
                }

                public final int hashCode() {
/* 15 */            return Boolean.hashCode(this.I00000oOI) + (this.I00000oIO.hashCode() * 31);
                }

                public final String toString() {
/* 28 */            return "OffsetPxModifier(offset=" + this.I00000oIO + ", rtlAware=" + this.I00000oOI + ")";
                }
            }

            package p000;

            import kotlin.Metadata;
            
            @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"LOoiIOii0O;", "LO1oooooIio;", "LOoiIlI1;", "foundation-layout"}, m18k = 1, mv = {2, 1, 0}, xi = 48)
            final class OoiIOii0O extends O1oooooIio {
                public i00O0OOIlOO I00000oIO;

                @Override
                public final O1ooOo I000II() {
/* 3 */             i00O0OOIlOO i00o0ooiloo = this.I00000oIO;
/* 5 */             OoiIlI1 ooiIlI1 = new OoiIlI1();
/* 8 */             ooiIlI1.I00o101lO = i00o0ooiloo;
/* 20 */            return ooiIlI1;
                }

                @Override
                public final void I000O01llI0(O1ooOo o1ooOo) {
/* 1 */             OoiIlI1 ooiIlI1 = (OoiIlI1) o1ooOo;
/* 3 */             i00O0OOIlOO i00o0ooiloo = this.I00000oIO;
/* 11 */            if (O0000Ioio00.I0000O(i00o0ooiloo, ooiIlI1.I00o101lO)) {
/* 29 */                return;
                    }
/* 13 */            ooiIlI1.I00o101lO = i00o0ooiloo;
/* 15 */            ooiIlI1.I010l1ol111();
                }

                public final boolean equals(Object obj) {
/* 1 */             if (this == obj) {
/* 3 */                 return true;
                    }
/* 7 */             if (obj instanceof OoiIOii0O) {
/* 17 */                return O0000Ioio00.I0000O(((OoiIOii0O) obj).I00000oIO, this.I00000oIO);
                    }
/* 9 */             return false;
                }

                public final int hashCode() {
/* 3 */             return this.I00000oIO.hashCode();
                }
            }

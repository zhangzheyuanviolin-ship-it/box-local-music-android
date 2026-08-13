            package p000;

            import kotlin.Metadata;
            
            @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"LO0iOl1llOil1;", "LO1oooooIio;", "LO0iOl1lo1Ol;", "ui"}, m18k = 1, mv = {2, 1, 0}, xi = 48)
            final class O0iOl1llOil1 extends O1oooooIio {
                public Object I00000oIO;

                @Override
                public final O1ooOo I000II() {
/* 3 */             Object obj = this.I00000oIO;
/* 5 */             O0iOl1lo1Ol o0iOl1lo1Ol = new O0iOl1lo1Ol();
/* 8 */             o0iOl1lo1Ol.I00o0iI0io1 = obj;
/* 20 */            return o0iOl1lo1Ol;
                }

                @Override
                public final void I000O01llI0(O1ooOo o1ooOo) {
/* 5 */             ((O0iOl1lo1Ol) o1ooOo).I00o0iI0io1 = this.I00000oIO;
                }

                public final boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
                    return (obj instanceof O0iOl1llOil1) && O0000Ioio00.I0000O(this.I00000oIO, ((O0iOl1llOil1) obj).I00000oIO);
                }

                public final int hashCode() {
/* 3 */             return this.I00000oIO.hashCode();
                }

                public final String toString() {
/* 18 */            return "LayoutIdElement(layoutId=" + this.I00000oIO + ")";
                }
            }

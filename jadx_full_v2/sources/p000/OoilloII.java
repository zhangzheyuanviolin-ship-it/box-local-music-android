            package p000;

            import kotlin.Metadata;
            
            @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"LOoilloII;", "LO1oooooIio;", "LOoio00oo;", "foundation-layout"}, m18k = 1, mv = {2, 1, 0}, xi = 48)
            final class OoilloII extends O1oooooIio {
                public float I00000oIO;
                public float I00000oOI;

                @Override
                public final O1ooOo I000II() {
/* 3 */             float f = this.I00000oIO;
/* 5 */             float f2 = this.I00000oOI;
/* 7 */             Ooio00oo ooio00oo = new Ooio00oo();
/* 10 */            ooio00oo.I00o0iI0io1 = f;
/* 12 */            ooio00oo.I00o0l1o1o0 = f2;
/* 20 */            return ooio00oo;
                }

                @Override
                public final void I000O01llI0(O1ooOo o1ooOo) {
/* 1 */             Ooio00oo ooio00oo = (Ooio00oo) o1ooOo;
/* 5 */             ooio00oo.I00o0iI0io1 = this.I00000oIO;
/* 9 */             ooio00oo.I00o0l1o1o0 = this.I00000oOI;
                }

                public final boolean equals(Object obj) {
/* 3 */             if (!(obj instanceof OoilloII)) {
/* 30 */                return false;
                    }
/* 8 */             OoilloII ooilloII = (OoilloII) obj;
                    return Iil1010O.I0000Il00O(this.I00000oIO, ooilloII.I00000oIO) && Iil1010O.I0000Il00O(this.I00000oOI, ooilloII.I00000oOI);
                }

                public final int hashCode() {
/* 15 */            return Float.hashCode(this.I00000oOI) + (Float.hashCode(this.I00000oIO) * 31);
                }
            }

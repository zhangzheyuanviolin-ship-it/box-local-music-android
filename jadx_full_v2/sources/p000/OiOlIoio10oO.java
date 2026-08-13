            package p000;

            import kotlin.Metadata;
            
            @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"LOiOlIoio10oO;", "LO1oooooIio;", "LOiOoIO1;", "foundation"}, m18k = 1, mv = {2, 1, 0}, xi = 48)
            final class OiOlIoio10oO extends O1oooooIio {
                public OiOoi0I0o0i I00000oIO;
                public OIilII I00000oOI;
                public boolean I0000Il00O;
                public boolean I0000O;
                public OI0lOIiOIOOo I0000oI00;

                @Override
                public final O1ooOo I000II() {
/* 3 */             OiOoi0I0o0i oiOoi0I0o0i = this.I00000oIO;
/* 16 */            return new OiOoIO1(null, null, null, this.I0000oI00, this.I00000oOI, oiOoi0I0o0i, this.I0000Il00O, this.I0000O);
                }

                @Override
                public final void I000O01llI0(O1ooOo o1ooOo) {
/* 4 */             OiOoi0I0o0i oiOoi0I0o0i = this.I00000oIO;
/* 17 */            ((OiOoIO1) o1ooOo).I011lOIoo0l(null, null, null, this.I0000oI00, this.I00000oOI, oiOoi0I0o0i, this.I0000Il00O, this.I0000O);
                }

                public final boolean equals(Object obj) {
/* 1 */             if (this == obj) {
/* 55 */                return true;
                    }
/* 6 */             if (!(obj instanceof OiOlIoio10oO)) {
/* 53 */                return false;
                    }
/* 11 */            OiOlIoio10oO oiOlIoio10oO = (OiOlIoio10oO) obj;
                    return O0000Ioio00.I0000O(this.I00000oIO, oiOlIoio10oO.I00000oIO) && this.I00000oOI == oiOlIoio10oO.I00000oOI && this.I0000Il00O == oiOlIoio10oO.I0000Il00O && this.I0000O == oiOlIoio10oO.I0000O && O0000Ioio00.I0000O(this.I0000oI00, oiOlIoio10oO.I0000oI00);
                }

                public final int hashCode() {
/* 28 */            int iI000OOo1O = Oi010OO0.I000OOo1O(Oi010OO0.I000OOo1O((this.I00000oOI.hashCode() + (this.I00000oIO.hashCode() * 31)) * 961, 31, this.I0000Il00O), 961, this.I0000O);
/* 32 */            OI0lOIiOIOOo oI0lOIiOIOOo = this.I0000oI00;
/* 43 */            return (iI000OOo1O + (oI0lOIiOIOOo != null ? oI0lOIiOIOOo.hashCode() : 0)) * 31;
                }
            }

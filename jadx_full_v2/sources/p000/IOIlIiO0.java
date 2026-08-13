            package p000;

            import kotlin.Metadata;
            
            @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"LIOIlIiO0;", "LO1oooooIio;", "LIOIliOOoi00;", "foundation"}, m18k = 1, mv = {2, 1, 0}, xi = 48)
            final class IOIlIiO0 extends O1oooooIio {
                public final OI0lOIiOIOOo I00000oIO;
                public final Iol100iI0lO I00000oOI;
                public final boolean I0000Il00O;
                public final boolean I0000O;
                public final String I0000oI00;
                public final Oi1o00lo I0001Ioi1lo;
                public final IllOOo00lI I000II;

                public IOIlIiO0(OI0lOIiOIOOo oI0lOIiOIOOo, Iol100iI0lO iol100iI0lO, boolean z, boolean z2, String str, Oi1o00lo oi1o00lo, IllOOo00lI illOOo00lI) {
/* 4 */             this.I00000oIO = oI0lOIiOIOOo;
/* 6 */             this.I00000oOI = iol100iI0lO;
/* 8 */             this.I0000Il00O = z;
/* 10 */            this.I0000O = z2;
/* 12 */            this.I0000oI00 = str;
/* 14 */            this.I0001Ioi1lo = oi1o00lo;
/* 16 */            this.I000II = illOOo00lI;
                }

                @Override
                public final O1ooOo I000II() {
/* 17 */            return new IOIliOOoi00(this.I00000oIO, this.I00000oOI, this.I0000Il00O, this.I0000O, this.I0000oI00, this.I0001Ioi1lo, this.I000II);
                }

                @Override
                public final void I000O01llI0(O1ooOo o1ooOo) {
/* 18 */            ((IOIliOOoi00) o1ooOo).I011iO(this.I00000oIO, this.I00000oOI, this.I0000Il00O, this.I0000O, this.I0000oI00, this.I0001Ioi1lo, this.I000II);
                }

                public final boolean equals(Object obj) {
/* 1 */             if (this == obj) {
/* 84 */                return true;
                    }
/* 4 */             if (obj == null || IOIlIiO0.class != obj.getClass()) {
/* 82 */                return false;
                    }
/* 16 */            IOIlIiO0 iOIlIiO0 = (IOIlIiO0) obj;
                    return O0000Ioio00.I0000O(this.I00000oIO, iOIlIiO0.I00000oIO) && O0000Ioio00.I0000O(this.I00000oOI, iOIlIiO0.I00000oOI) && this.I0000Il00O == iOIlIiO0.I0000Il00O && this.I0000O == iOIlIiO0.I0000O && O0000Ioio00.I0000O(this.I0000oI00, iOIlIiO0.I0000oI00) && O0000Ioio00.I0000O(this.I0001Ioi1lo, iOIlIiO0.I0001Ioi1lo) && this.I000II == iOIlIiO0.I000II;
                }

                public final int hashCode() {
/* 2 */             OI0lOIiOIOOo oI0lOIiOIOOo = this.I00000oIO;
/* 14 */            int iHashCode = (oI0lOIiOIOOo != null ? oI0lOIiOIOOo.hashCode() : 0) * 31;
/* 15 */            Iol100iI0lO iol100iI0lO = this.I00000oOI;
/* 35 */            int iI000OOo1O = Oi010OO0.I000OOo1O(Oi010OO0.I000OOo1O((iHashCode + (iol100iI0lO != null ? iol100iI0lO.hashCode() : 0)) * 31, 31, this.I0000Il00O), 31, this.I0000O);
/* 39 */            String str = this.I0000oI00;
/* 50 */            int iHashCode2 = (iI000OOo1O + (str != null ? str.hashCode() : 0)) * 31;
/* 51 */            Oi1o00lo oi1o00lo = this.I0001Ioi1lo;
/* 69 */            return this.I000II.hashCode() + ((iHashCode2 + (oi1o00lo != null ? Integer.hashCode(oi1o00lo.I00000oIO) : 0)) * 31);
                }
            }

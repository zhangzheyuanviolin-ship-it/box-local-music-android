            package p000;

            import kotlin.Metadata;
            
            @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"LOiiO00Ol0;", "LO1oooooIio;", "LOiiO1iOolol;", "foundation"}, m18k = 1, mv = {2, 1, 0}, xi = 48)
            final class OiiO00Ol0 extends O1oooooIio {
                public final boolean I00000oIO;
                public final OI0lOIiOIOOo I00000oOI;
                public final Iol100iI0lO I0000Il00O;
                public final boolean I0000O;
                public final Oi1o00lo I0000oI00;
                public final IllOOo00lI I0001Ioi1lo;

                public OiiO00Ol0(boolean z, OI0lOIiOIOOo oI0lOIiOIOOo, Iol100iI0lO iol100iI0lO, boolean z2, Oi1o00lo oi1o00lo, IllOOo00lI illOOo00lI) {
/* 4 */             this.I00000oIO = z;
/* 6 */             this.I00000oOI = oI0lOIiOIOOo;
/* 8 */             this.I0000Il00O = iol100iI0lO;
/* 10 */            this.I0000O = z2;
/* 12 */            this.I0000oI00 = oi1o00lo;
/* 14 */            this.I0001Ioi1lo = illOOo00lI;
                }

                @Override
                public final O1ooOo I000II() {
/* 15 */            OiiO1iOolol oiiO1iOolol = new OiiO1iOolol(this.I00000oOI, this.I0000Il00O, false, this.I0000O, null, this.I0000oI00, this.I0001Ioi1lo);
/* 20 */            oiiO1iOolol.I010ioo = this.I00000oIO;
/* 55 */            return oiiO1iOolol;
                }

                @Override
                public final void I000O01llI0(O1ooOo o1ooOo) {
/* 2 */             OiiO1iOolol oiiO1iOolol = (OiiO1iOolol) o1ooOo;
/* 4 */             boolean z = oiiO1iOolol.I010ioo;
/* 6 */             boolean z2 = this.I00000oIO;
/* 8 */             if (z != z2) {
/* 10 */                oiiO1iOolol.I010ioo = z2;
/* 12 */                lO1OiIiIo0oi.I00000oOI(oiiO1iOolol);
                    }
/* 27 */            oiiO1iOolol.I011iO(this.I00000oOI, this.I0000Il00O, false, this.I0000O, null, this.I0000oI00, this.I0001Ioi1lo);
                }

                public final boolean equals(Object obj) {
/* 1 */             if (this == obj) {
/* 73 */                return true;
                    }
/* 4 */             if (obj == null || OiiO00Ol0.class != obj.getClass()) {
/* 71 */                return false;
                    }
/* 16 */            OiiO00Ol0 oiiO00Ol0 = (OiiO00Ol0) obj;
                    return this.I00000oIO == oiiO00Ol0.I00000oIO && O0000Ioio00.I0000O(this.I00000oOI, oiiO00Ol0.I00000oOI) && O0000Ioio00.I0000O(this.I0000Il00O, oiiO00Ol0.I0000Il00O) && this.I0000O == oiiO00Ol0.I0000O && O0000Ioio00.I0000O(this.I0000oI00, oiiO00Ol0.I0000oI00) && this.I0001Ioi1lo == oiiO00Ol0.I0001Ioi1lo;
                }

                public final int hashCode() {
/* 9 */             int iHashCode = Boolean.hashCode(this.I00000oIO) * 31;
/* 11 */            OI0lOIiOIOOo oI0lOIiOIOOo = this.I00000oOI;
/* 22 */            int iHashCode2 = (iHashCode + (oI0lOIiOIOOo != null ? oI0lOIiOIOOo.hashCode() : 0)) * 31;
/* 23 */            Iol100iI0lO iol100iI0lO = this.I0000Il00O;
/* 41 */            int iI000OOo1O = Oi010OO0.I000OOo1O(Oi010OO0.I000OOo1O((iHashCode2 + (iol100iI0lO != null ? iol100iI0lO.hashCode() : 0)) * 31, 31, false), 31, this.I0000O);
/* 45 */            Oi1o00lo oi1o00lo = this.I0000oI00;
/* 63 */            return this.I0001Ioi1lo.hashCode() + ((iI000OOo1O + (oi1o00lo != null ? Integer.hashCode(oi1o00lo.I00000oIO) : 0)) * 31);
                }
            }

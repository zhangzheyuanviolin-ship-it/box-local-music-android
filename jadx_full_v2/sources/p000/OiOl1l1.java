            package p000;

            import kotlin.Metadata;
            
            @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"LOiOl1l1;", "LO1oooooIio;", "LOiOlI0ol1;", "foundation"}, m18k = 1, mv = {2, 1, 0}, xi = 48)
            final class OiOl1l1 extends O1oooooIio {
                public final OiOoi0I0o0i I00000oIO;
                public final OIilII I00000oOI;
                public final boolean I0000Il00O;
                public final IlOIll0o11Ii I0000O;
                public final OI0lOIiOIOOo I0000oI00;
                public final III0liIO I0001Ioi1lo;
                public final boolean I000II;
                public final I0o1iIoolIi I000O01llI0;

                public OiOl1l1(I0o1iIoolIi i0o1iIoolIi, III0liIO iII0liIO, IlOIll0o11Ii ilOIll0o11Ii, OI0lOIiOIOOo oI0lOIiOIOOo, OIilII oIilII, OiOoi0I0o0i oiOoi0I0o0i, boolean z, boolean z2) {
/* 4 */             this.I00000oIO = oiOoi0I0o0i;
/* 6 */             this.I00000oOI = oIilII;
/* 8 */             this.I0000Il00O = z;
/* 10 */            this.I0000O = ilOIll0o11Ii;
/* 12 */            this.I0000oI00 = oI0lOIiOIOOo;
/* 14 */            this.I0001Ioi1lo = iII0liIO;
/* 16 */            this.I000II = z2;
/* 18 */            this.I000O01llI0 = i0o1iIoolIi;
                }

                @Override
                public final O1ooOo I000II() {
/* 3 */             OiOlI0ol1 oiOlI0ol1 = new OiOlI0ol1();
/* 8 */             oiOlI0ol1.I00o101lO = this.I00000oIO;
/* 12 */            oiOlI0ol1.I00oI0i = this.I00000oOI;
/* 16 */            oiOlI0ol1.I00oII = this.I0000Il00O;
/* 20 */            oiOlI0ol1.I00oIiI10 = this.I0000O;
/* 24 */            oiOlI0ol1.I00oO101o = this.I0000oI00;
/* 28 */            oiOlI0ol1.I00oOio10iI1 = this.I0001Ioi1lo;
/* 32 */            oiOlI0ol1.I00ol1 = this.I000II;
/* 36 */            oiOlI0ol1.I00olI = this.I000O01llI0;
/* 55 */            return oiOlI0ol1;
                }

                @Override
                public final void I000O01llI0(O1ooOo o1ooOo) {
/* 4 */             OI0lOIiOIOOo oI0lOIiOIOOo = this.I0000oI00;
/* 20 */            ((OiOlI0ol1) o1ooOo).I01101IOlO(this.I000O01llI0, this.I0001Ioi1lo, this.I0000O, oI0lOIiOIOOo, this.I00000oOI, this.I00000oIO, this.I000II, this.I0000Il00O);
                }

                public final boolean equals(Object obj) {
/* 1 */             if (this == obj) {
/* 93 */                return true;
                    }
/* 4 */             if (obj == null || OiOl1l1.class != obj.getClass()) {
/* 95 */                return false;
                    }
/* 15 */            OiOl1l1 oiOl1l1 = (OiOl1l1) obj;
                    return this.I00000oIO.equals(oiOl1l1.I00000oIO) && this.I00000oOI == oiOl1l1.I00000oOI && this.I0000Il00O == oiOl1l1.I0000Il00O && O0000Ioio00.I0000O(this.I0000O, oiOl1l1.I0000O) && O0000Ioio00.I0000O(this.I0000oI00, oiOl1l1.I0000oI00) && O0000Ioio00.I0000O(this.I0001Ioi1lo, oiOl1l1.I0001Ioi1lo) && this.I000II == oiOl1l1.I000II && O0000Ioio00.I0000O(this.I000O01llI0, oiOl1l1.I000O01llI0);
                }

                public final int hashCode() {
/* 25 */            int iI000OOo1O = Oi010OO0.I000OOo1O(Oi010OO0.I000OOo1O((this.I00000oOI.hashCode() + (this.I00000oIO.hashCode() * 31)) * 31, 31, this.I0000Il00O), 31, false);
/* 29 */            IlOIll0o11Ii ilOIll0o11Ii = this.I0000O;
/* 40 */            int iHashCode = (iI000OOo1O + (ilOIll0o11Ii != null ? ilOIll0o11Ii.hashCode() : 0)) * 31;
/* 41 */            OI0lOIiOIOOo oI0lOIiOIOOo = this.I0000oI00;
/* 52 */            int iHashCode2 = (iHashCode + (oI0lOIiOIOOo != null ? oI0lOIiOIOOo.hashCode() : 0)) * 31;
/* 53 */            III0liIO iII0liIO = this.I0001Ioi1lo;
/* 67 */            int iI000OOo1O2 = Oi010OO0.I000OOo1O((iHashCode2 + (iII0liIO != null ? iII0liIO.hashCode() : 0)) * 31, 31, this.I000II);
/* 71 */            I0o1iIoolIi i0o1iIoolIi = this.I000O01llI0;
/* 79 */            return iI000OOo1O2 + (i0o1iIoolIi != null ? i0o1iIoolIi.hashCode() : 0);
                }
            }

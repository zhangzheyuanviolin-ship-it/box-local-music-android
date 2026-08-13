            package p000;

            import kotlin.Metadata;
            
            @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"LOoIi0Il;", "LO1oooooIio;", "LOoIi11Io;", "foundation"}, m18k = 1, mv = {2, 1, 0}, xi = 48)
            final class OoIi0Il extends O1oooooIio {
                public final Oo1IiOO1IoI I00000oIO;
                public final OI0lOIiOIOOo I00000oOI;
                public final Iol100iI0lO I0000Il00O;
                public final boolean I0000O;
                public final Oi1o00lo I0000oI00;
                public final IllOOo00lI I0001Ioi1lo;

                public OoIi0Il(Oo1IiOO1IoI oo1IiOO1IoI, OI0lOIiOIOOo oI0lOIiOIOOo, Iol100iI0lO iol100iI0lO, boolean z, Oi1o00lo oi1o00lo, IllOOo00lI illOOo00lI) {
/* 4 */             this.I00000oIO = oo1IiOO1IoI;
/* 6 */             this.I00000oOI = oI0lOIiOIOOo;
/* 8 */             this.I0000Il00O = iol100iI0lO;
/* 10 */            this.I0000O = z;
/* 12 */            this.I0000oI00 = oi1o00lo;
/* 14 */            this.I0001Ioi1lo = illOOo00lI;
                }

                @Override
                public final O1ooOo I000II() {
/* 15 */            OoIi11Io ooIi11Io = new OoIi11Io(this.I00000oOI, this.I0000Il00O, false, this.I0000O, null, this.I0000oI00, this.I0001Ioi1lo);
/* 20 */            ooIi11Io.I010ioo = this.I00000oIO;
/* 55 */            return ooIi11Io;
                }

                @Override
                public final void I000O01llI0(O1ooOo o1ooOo) {
/* 2 */             OoIi11Io ooIi11Io = (OoIi11Io) o1ooOo;
/* 4 */             Oo1IiOO1IoI oo1IiOO1IoI = ooIi11Io.I010ioo;
/* 6 */             Oo1IiOO1IoI oo1IiOO1IoI2 = this.I00000oIO;
/* 8 */             if (oo1IiOO1IoI != oo1IiOO1IoI2) {
/* 10 */                ooIi11Io.I010ioo = oo1IiOO1IoI2;
/* 12 */                lO1OiIiIo0oi.I00000oOI(ooIi11Io);
                    }
/* 27 */            ooIi11Io.I011iO(this.I00000oOI, this.I0000Il00O, false, this.I0000O, null, this.I0000oI00, this.I0001Ioi1lo);
                }

                public final boolean equals(Object obj) {
/* 1 */             if (this == obj) {
/* 73 */                return true;
                    }
/* 4 */             if (obj == null || OoIi0Il.class != obj.getClass()) {
/* 71 */                return false;
                    }
/* 16 */            OoIi0Il ooIi0Il = (OoIi0Il) obj;
                    return this.I00000oIO == ooIi0Il.I00000oIO && O0000Ioio00.I0000O(this.I00000oOI, ooIi0Il.I00000oOI) && O0000Ioio00.I0000O(this.I0000Il00O, ooIi0Il.I0000Il00O) && this.I0000O == ooIi0Il.I0000O && this.I0000oI00.equals(ooIi0Il.I0000oI00) && this.I0001Ioi1lo == ooIi0Il.I0001Ioi1lo;
                }

                public final int hashCode() {
/* 9 */             int iHashCode = this.I00000oIO.hashCode() * 31;
/* 11 */            OI0lOIiOIOOo oI0lOIiOIOOo = this.I00000oOI;
/* 22 */            int iHashCode2 = (iHashCode + (oI0lOIiOIOOo != null ? oI0lOIiOIOOo.hashCode() : 0)) * 31;
/* 23 */            Iol100iI0lO iol100iI0lO = this.I0000Il00O;
/* 59 */            return this.I0001Ioi1lo.hashCode() + IIl001iO0Io.I0000O(this.I0000oI00.I00000oIO, Oi010OO0.I000OOo1O(Oi010OO0.I000OOo1O((iHashCode2 + (iol100iI0lO != null ? iol100iI0lO.hashCode() : 0)) * 31, 31, false), 31, this.I0000O), 31);
                }
            }

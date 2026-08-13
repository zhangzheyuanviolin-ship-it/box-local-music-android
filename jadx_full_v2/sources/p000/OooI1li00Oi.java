            package p000;

            import kotlin.Metadata;
            
            @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"LOooI1li00Oi;", "LO1oooooIio;", "LOooIO0OoIO0O;", "animation"}, m18k = 1, mv = {2, 1, 0}, xi = 48)
            final class OooI1li00Oi extends O1oooooIio {
                public OoI1iOl0IoI I00000oIO;
                public OoI1I1i1 I00000oOI;
                public Il0l0iooI I0000Il00O;
                public Il1OOloOIl1 I0000O;
                public Oiolo1I I0000oI00;

                @Override
                public final O1ooOo I000II() {
/* 3 */             OoI1I1i1 ooI1I1i1 = this.I00000oOI;
/* 5 */             Il0l0iooI il0l0iooI = this.I0000Il00O;
/* 7 */             Il1OOloOIl1 il1OOloOIl1 = this.I0000O;
/* 9 */             Oiolo1I oiolo1I = this.I0000oI00;
/* 11 */            OooIO0OoIO0O oooIO0OoIO0O = new OooIO0OoIO0O();
/* 14 */            oooIO0OoIO0O.I00o0iI0io1 = ooI1I1i1;
/* 16 */            oooIO0OoIO0O.I00o0l1o1o0 = il0l0iooI;
/* 18 */            oooIO0OoIO0O.I00o101lO = il1OOloOIl1;
/* 20 */            oooIO0OoIO0O.I00oI0i = oiolo1I;
/* 55 */            return oooIO0OoIO0O;
                }

                @Override
                public final void I000O01llI0(O1ooOo o1ooOo) {
/* 1 */             OooIO0OoIO0O oooIO0OoIO0O = (OooIO0OoIO0O) o1ooOo;
/* 3 */             oooIO0OoIO0O.getClass();
/* 8 */             oooIO0OoIO0O.I00o0iI0io1 = this.I00000oOI;
/* 12 */            oooIO0OoIO0O.I00o0l1o1o0 = this.I0000Il00O;
/* 16 */            oooIO0OoIO0O.I00o101lO = this.I0000O;
/* 20 */            oooIO0OoIO0O.I00oI0i = this.I0000oI00;
                }

                public final boolean equals(Object obj) {
/* 1 */             if (this == obj) {
/* 67 */                return true;
                    }
/* 6 */             if (!(obj instanceof OooI1li00Oi)) {
/* 65 */                return false;
                    }
/* 9 */             OooI1li00Oi oooI1li00Oi = (OooI1li00Oi) obj;
                    return O0000Ioio00.I0000O(this.I00000oIO, oooI1li00Oi.I00000oIO) && O0000Ioio00.I0000O(this.I00000oOI, oooI1li00Oi.I00000oOI) && O0000Ioio00.I0000O(this.I0000Il00O, oooI1li00Oi.I0000Il00O) && O0000Ioio00.I0000O(this.I0000O, oooI1li00Oi.I0000O) && O0000Ioio00.I0000O(this.I0000oI00, oooI1li00Oi.I0000oI00);
                }

                public final int hashCode() {
/* 46 */            return this.I0000oI00.hashCode() + ((this.I0000O.I00000oIO.hashCode() + ((this.I0000Il00O.I00000oIO.hashCode() + ((this.I00000oOI.hashCode() + (this.I00000oIO.hashCode() * 31)) * 31)) * 31)) * 31);
                }

                public final String toString() {
/* 58 */            return "VeilModifierElement(transition=" + this.I00000oIO + ", veilAnimation=" + this.I00000oOI + ", enter=" + this.I0000Il00O + ", exit=" + this.I0000O + ", mutableTransformState=" + this.I0000oI00 + ")";
                }
            }

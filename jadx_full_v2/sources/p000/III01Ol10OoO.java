            package p000;

            import kotlin.Metadata;
            
            @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"LIII01Ol10OoO;", "LO1oooooIio;", "LIII0IoO1OI1o;", "foundation"}, m18k = 1, mv = {2, 1, 0}, xi = 48)
            final class III01Ol10OoO extends O1oooooIio {
                public III0Ii I00000oIO;

                @Override
                public final O1ooOo I000II() {
/* 3 */             III0Ii iII0Ii = this.I00000oIO;
/* 5 */             III0IoO1OI1o iII0IoO1OI1o = new III0IoO1OI1o();
/* 8 */             iII0IoO1OI1o.I00o0iI0io1 = iII0Ii;
/* 20 */            return iII0IoO1OI1o;
                }

                @Override
                public final void I000O01llI0(O1ooOo o1ooOo) {
/* 1 */             III0IoO1OI1o iII0IoO1OI1o = (III0IoO1OI1o) o1ooOo;
/* 3 */             III0Ii iII0Ii = this.I00000oIO;
/* 5 */             III0Ii iII0Ii2 = iII0IoO1OI1o.I00o0iI0io1;
/* 7 */             if (iII0Ii2 != null) {
/* 11 */                iII0Ii2.I00000oIO.I000iOII(iII0IoO1OI1o);
                    }
/* 14 */            if (iII0Ii != null) {
/* 18 */                iII0Ii.I00000oIO.I00000oOI(iII0IoO1OI1o);
                    }
/* 21 */            iII0IoO1OI1o.I00o0iI0io1 = iII0Ii;
                }

                public final boolean equals(Object obj) {
/* 1 */             if (this != obj) {
                        return (obj instanceof III01Ol10OoO) && O0000Ioio00.I0000O(this.I00000oIO, ((III01Ol10OoO) obj).I00000oIO);
                    }
/* 22 */            return true;
                }

                public final int hashCode() {
/* 3 */             return this.I00000oIO.hashCode();
                }
            }

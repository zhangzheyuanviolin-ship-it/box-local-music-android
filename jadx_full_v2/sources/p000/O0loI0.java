            package p000;

            import java.lang.invoke.VarHandle;
            import kotlin.Metadata;
            
            @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"LO0loI0;", "LO1oooooIio;", "LO0loIO11Ilo;", "foundation"}, m18k = 1, mv = {2, 1, 0}, xi = 48)
            final class O0loI0 extends O1oooooIio {
                public IllOOo00lI I00000oIO;
                public O0lo0l I00000oOI;
                public OIilII I0000Il00O;
                public boolean I0000O;

                @Override
                public final O1ooOo I000II() {
/* 3 */             IllOOo00lI illOOo00lI = this.I00000oIO;
/* 5 */             O0lo0l o0lo0l = this.I00000oOI;
/* 7 */             OIilII oIilII = this.I0000Il00O;
/* 9 */             boolean z = this.I0000O;
/* 11 */            O0loIO11Ilo o0loIO11Ilo = new O0loIO11Ilo();
/* 14 */            o0loIO11Ilo.I00o0iI0io1 = illOOo00lI;
/* 16 */            o0loIO11Ilo.I00o0l1o1o0 = o0lo0l;
/* 18 */            o0loIO11Ilo.I00o101lO = oIilII;
/* 20 */            o0loIO11Ilo.I00oI0i = z;
/* 25 */            O0loI1ilo1ii o0loI1ilo1ii = new O0loI1ilo1ii(0);
/* 28 */            o0loI1ilo1ii.I00iiI = o0loIO11Ilo;
/* 30 */            VarHandle.storeStoreFence();
/* 33 */            o0loIO11Ilo.I00oIiI10 = o0loI1ilo1ii;
/* 35 */            o0loIO11Ilo.I010l1O();
/* 38 */            VarHandle.storeStoreFence();
/* 55 */            return o0loIO11Ilo;
                }

                @Override
                public final void I000O01llI0(O1ooOo o1ooOo) {
/* 1 */             O0loIO11Ilo o0loIO11Ilo = (O0loIO11Ilo) o1ooOo;
/* 3 */             IllOOo00lI illOOo00lI = this.I00000oIO;
/* 5 */             O0lo0l o0lo0l = this.I00000oOI;
/* 7 */             OIilII oIilII = this.I0000Il00O;
/* 9 */             boolean z = this.I0000O;
/* 11 */            o0loIO11Ilo.I00o0iI0io1 = illOOo00lI;
/* 13 */            o0loIO11Ilo.I00o0l1o1o0 = o0lo0l;
/* 17 */            if (o0loIO11Ilo.I00o101lO != oIilII) {
/* 19 */                o0loIO11Ilo.I00o101lO = oIilII;
/* 21 */                lO1OiIiIo0oi.I00000oOI(o0loIO11Ilo);
                    }
/* 26 */            if (o0loIO11Ilo.I00oI0i == z) {
/* 28 */                return;
                    }
/* 29 */            o0loIO11Ilo.I00oI0i = z;
/* 31 */            o0loIO11Ilo.I010l1O();
/* 34 */            lO1OiIiIo0oi.I00000oOI(o0loIO11Ilo);
                }

                public final boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
/* 7 */             if (!(obj instanceof O0loI0)) {
/* 43 */                return false;
                    }
/* 12 */            O0loI0 o0loI0 = (O0loI0) obj;
                    return this.I00000oIO == o0loI0.I00000oIO && O0000Ioio00.I0000O(this.I00000oOI, o0loI0.I00000oOI) && this.I0000Il00O == o0loI0.I0000Il00O && this.I0000O == o0loI0.I0000O;
                }

                public final int hashCode() {
/* 37 */            return Boolean.hashCode(false) + Oi010OO0.I000OOo1O((this.I0000Il00O.hashCode() + ((this.I00000oOI.hashCode() + (this.I00000oIO.hashCode() * 31)) * 31)) * 31, 31, this.I0000O);
                }
            }

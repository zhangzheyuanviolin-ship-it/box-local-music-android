            package p000;

            import java.lang.invoke.VarHandle;
            import kotlin.Metadata;
            
            @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"LOli110il1;", "LO1oooooIio;", "LOli1Oio1O;", "foundation"}, m18k = 1, mv = {2, 1, 0}, xi = 48)
            final class Oli110il1 extends O1oooooIio {
                public IllOOo00lI I00000oIO;

                @Override
                public final O1ooOo I000II() {
/* 3 */             IllOOo00lI illOOo00lI = this.I00000oIO;
/* 5 */             Oli1Oio1O oli1Oio1O = new Oli1Oio1O();
/* 8 */             oli1Oio1O.I00o101lO = illOOo00lI;
/* 14 */            I0o1Oi0IO1 i0o1Oi0IO1 = new I0o1Oi0IO1(8);
/* 17 */            i0o1Oi0IO1.I00000oOI = oli1Oio1O;
/* 19 */            VarHandle.storeStoreFence();
/* 22 */            OO1Oooio101 oO1Oooio101 = Oll10I.I00000oIO;
/* 27 */            Oll1OII0o oll1OII0o = new Oll1OII0o(null, null, i0o1Oi0IO1);
/* 30 */            oli1Oio1O.I010l1O(oll1OII0o);
/* 33 */            oli1Oio1O.I00oII = oll1OII0o;
/* 35 */            VarHandle.storeStoreFence();
/* 55 */            return oli1Oio1O;
                }

                @Override
                public final void I000O01llI0(O1ooOo o1ooOo) {
/* 5 */             ((Oli1Oio1O) o1ooOo).I00o101lO = this.I00000oIO;
                }

                public final boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
                    return (obj instanceof Oli110il1) && this.I00000oIO == ((Oli110il1) obj).I00000oIO;
                }

                public final int hashCode() {
/* 3 */             return this.I00000oIO.hashCode();
                }
            }

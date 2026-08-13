            package p000;

            import java.lang.invoke.VarHandle;
            import kotlin.Metadata;
            
            @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"LIII00iO1Oill;", "LO1oooooIio;", "LIII010oO1l;", "ui"}, m18k = 1, mv = {2, 1, 0}, xi = 48)
            final class III00iO1Oill extends O1oooooIio {
                public I10I00IO I00000oIO;

                @Override
                public final O1ooOo I000II() {
/* 3 */             I10I00IO i10i00io = this.I00000oIO;
/* 5 */             III010oO1l iII010oO1l = new III010oO1l();
/* 8 */             iII010oO1l.I00o0iI0io1 = i10i00io;
/* 14 */            IIOIlOoI111 iIOIlOoI111 = new IIOIlOoI111(21);
/* 17 */            iIOIlOoI111.I00iiI = iII010oO1l;
/* 19 */            VarHandle.storeStoreFence();
/* 22 */            iII010oO1l.I00o0l1o1o0 = iIOIlOoI111;
/* 24 */            VarHandle.storeStoreFence();
/* 55 */            return iII010oO1l;
                }

                @Override
                public final void I000O01llI0(O1ooOo o1ooOo) {
/* 1 */             III010oO1l iII010oO1l = (III010oO1l) o1ooOo;
/* 3 */             I10I00IO i10i00io = this.I00000oIO;
/* 5 */             iII010oO1l.I00o0iI0io1 = i10i00io;
/* 9 */             if (iII010oO1l.I00lll10) {
/* 13 */                i10i00io.invoke(iII010oO1l.I00o0l1o1o0);
                    }
                }

                public final boolean equals(Object obj) {
/* 1 */             if (this != obj) {
                        return (obj instanceof III00iO1Oill) && this.I00000oIO == ((III00iO1Oill) obj).I00000oIO;
                    }
/* 18 */            return true;
                }

                public final int hashCode() {
/* 3 */             return this.I00000oIO.hashCode();
                }
            }

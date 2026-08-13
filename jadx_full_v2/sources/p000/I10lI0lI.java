            package p000;

            import java.lang.invoke.VarHandle;
            import kotlin.Metadata;
            
            @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u0000*\u0004\b\u0001\u0010\u00012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00030\u0002¨\u0006\u0004"}, d2 = {"LI10lI0lI;", OIlOl1.I00iiI, "LO1oooooIio;", "LI10li01;", "animation"}, m18k = 1, mv = {2, 1, 0}, xi = 48)
            final class I10lI0lI<S> extends O1oooooIio {
                public OoI1I1i1 I00000oIO;
                public OI10i0Il I00000oOI;
                public I10llI0II11l I0000Il00O;

                @Override
                public final O1ooOo I000II() {
/* 3 */             OoI1I1i1 ooI1I1i1 = this.I00000oIO;
/* 5 */             OI10i0Il oI10i0Il = this.I00000oOI;
/* 7 */             I10llI0II11l i10llI0II11l = this.I0000Il00O;
/* 10 */            I10li01 i10li01 = new I10li01(1);
/* 13 */            i10li01.I00o0l1o1o0 = ooI1I1i1;
/* 15 */            i10li01.I00o101lO = oI10i0Il;
/* 17 */            i10li01.I00oI0i = i10llI0II11l;
/* 21 */            i10li01.I00oO101o = 0L;
/* 23 */            i10li01.I00oOio10iI1 = 0L;
/* 30 */            i10li01.I00ol1 = new I10lIO(i10li01, 1);
/* 38 */            i10li01.I00olI = new I10lIO(i10li01, 0);
/* 45 */            i10li01.I00oli = -9223372034707292160L;
/* 47 */            VarHandle.storeStoreFence();
/* 55 */            return i10li01;
                }

                @Override
                public final void I000O01llI0(O1ooOo o1ooOo) {
/* 1 */             I10li01 i10li01 = (I10li01) o1ooOo;
/* 5 */             i10li01.I00o0l1o1o0 = this.I00000oIO;
/* 9 */             i10li01.I00o101lO = this.I00000oOI;
/* 13 */            i10li01.I00oI0i = this.I0000Il00O;
                }

                public final boolean equals(Object obj) {
/* 3 */             if (!(obj instanceof I10lI0lI)) {
/* 29 */                return false;
                    }
/* 5 */             I10lI0lI i10lI0lI = (I10lI0lI) obj;
                    return O0000Ioio00.I0000O(i10lI0lI.I00000oIO, this.I00000oIO) && O0000Ioio00.I0000O(i10lI0lI.I00000oOI, this.I00000oOI);
                }

                public final int hashCode() {
/* 7 */             int iHashCode = this.I0000Il00O.hashCode() * 31;
/* 9 */             OoI1I1i1 ooI1I1i1 = this.I00000oIO;
/* 28 */            return this.I00000oOI.hashCode() + ((iHashCode + (ooI1I1i1 != null ? ooI1I1i1.hashCode() : 0)) * 31);
                }
            }

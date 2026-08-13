            package p000;

            import java.lang.invoke.VarHandle;
            import kotlin.Metadata;
            
            @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"LIOOo11lI1;", "LO1oooooIio;", "LIOOoIo0;", "foundation"}, m18k = 1, mv = {2, 1, 0}, xi = 48)
            final class IOOo11lI1 extends O1oooooIio {
                public final OI0lOIiOIOOo I00000oIO;
                public final boolean I00000oOI;
                public final IllOOo00lI I0000Il00O;
                public final IllOOo00lI I0000O;

                public IOOo11lI1(OI0lOIiOIOOo oI0lOIiOIOOo, boolean z, IllOOo00lI illOOo00lI, IllOOo00lI illOOo00lI2) {
/* 4 */             this.I00000oIO = oI0lOIiOIOOo;
/* 6 */             this.I00000oOI = z;
/* 8 */             this.I0000Il00O = illOOo00lI;
/* 10 */            this.I0000O = illOOo00lI2;
                }

                @Override
                public final O1ooOo I000II() {
/* 13 */            IOOoIo0 iOOoIo0 = new IOOoIo0(this.I00000oIO, null, this.I00000oOI, true, null, null, this.I0000Il00O);
/* 18 */            iOOoIo0.I010i10l = this.I0000O;
/* 21 */            iOOoIo0.I010iIIOlo = true;
/* 23 */            OI0lli1 oI0lli1 = O1IO1IIIO0OO.I00000oIO;
/* 30 */            iOOoIo0.I010ioo = new OI0lli1();
/* 37 */            iOOoIo0.I010l10O = new OI0lli1();
/* 41 */            iOOoIo0.I01101IOlO = -1L;
/* 43 */            iOOoIo0.I011Ill = -1L;
/* 45 */            VarHandle.storeStoreFence();
/* 55 */            return iOOoIo0;
                }

                @Override
                public final void I000O01llI0(O1ooOo o1ooOo) {
                    boolean z;
/* 2 */             IOOoIo0 iOOoIo0 = (IOOoIo0) o1ooOo;
/* 5 */             iOOoIo0.I010iIIOlo = true;
/* 14 */            boolean z2 = iOOoIo0.I010i10l == null;
/* 15 */            IllOOo00lI illOOo00lI = this.I0000O;
/* 22 */            if (z2 != (illOOo00lI == null)) {
/* 24 */                iOOoIo0.I01101IOlO();
/* 27 */                lO1OiIiIo0oi.I00000oOI(iOOoIo0);
/* 30 */                z = true;
                    } else {
/* 32 */                z = false;
                    }
/* 33 */            iOOoIo0.I010i10l = illOOo00lI;
/* 42 */            boolean z3 = !iOOoIo0.I00oOio10iI1 ? true : z;
/* 52 */            iOOoIo0.I011iO(this.I00000oIO, null, this.I00000oOI, true, null, null, this.I0000Il00O);
/* 55 */            if (z3) {
/* 57 */                iOOoIo0.I011iiii0i(false);
/* 60 */                iOOoIo0.I011iiii0i(true);
                    }
                }

                public final boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
/* 5 */             if (obj == null || IOOo11lI1.class != obj.getClass()) {
/* 50 */                return false;
                    }
/* 17 */            IOOo11lI1 iOOo11lI1 = (IOOo11lI1) obj;
                    return O0000Ioio00.I0000O(this.I00000oIO, iOOo11lI1.I00000oIO) && this.I00000oOI == iOOo11lI1.I00000oOI && this.I0000Il00O == iOOo11lI1.I0000Il00O && this.I0000O == iOOo11lI1.I0000O;
                }

                public final int hashCode() {
/* 2 */             OI0lOIiOIOOo oI0lOIiOIOOo = this.I00000oIO;
/* 36 */            int iHashCode = (this.I0000Il00O.hashCode() + Oi010OO0.I000OOo1O(Oi010OO0.I000OOo1O((oI0lOIiOIOOo != null ? oI0lOIiOIOOo.hashCode() : 0) * 961, 31, this.I00000oOI), 29791, true)) * 961;
/* 38 */            IllOOo00lI illOOo00lI = this.I0000O;
/* 53 */            return Boolean.hashCode(true) + ((iHashCode + (illOOo00lI != null ? illOOo00lI.hashCode() : 0)) * 961);
                }
            }

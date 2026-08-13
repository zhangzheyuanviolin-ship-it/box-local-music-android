            package p000;

            import kotlin.Metadata;
            
            @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"LIiiO0I1OoOi;", "LO1oooooIio;", "LIiiO11O;", "foundation"}, m18k = 1, mv = {2, 1, 0}, xi = 48)
            final class IiiO0I1OoOi extends O1oooooIio {
                public O0li0o I00000oIO;

                @Override
                public final O1ooOo I000II() {
/* 3 */             O0li0o o0li0o = this.I00000oIO;
/* 5 */             IiiO11O iiiO11O = new IiiO11O();
/* 8 */             iiiO11O.I00o0iI0io1 = o0li0o;
/* 20 */            return iiiO11O;
                }

                @Override
                public final void I000O01llI0(O1ooOo o1ooOo) {
/* 1 */             IiiO11O iiiO11O = (IiiO11O) o1ooOo;
/* 3 */             O0li0o o0li0o = this.I00000oIO;
/* 11 */            if (O0000Ioio00.I0000O(iiiO11O.I00o0iI0io1, o0li0o) || !iiiO11O.I00iOIl.I00lll10) {
/* 77 */                return;
                    }
/* 19 */            O0li0o o0li0o2 = iiiO11O.I00o0iI0io1;
/* 21 */            o0li0o2.I0000oI00();
/* 25 */            o0li0o2.I00000oOI = null;
/* 28 */            o0li0o2.I0000Il00O = -1;
/* 30 */            o0li0o.I000OiO = iiiO11O;
/* 32 */            iiiO11O.I00o0iI0io1 = o0li0o;
                }

                public final boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
                    return (obj instanceof IiiO0I1OoOi) && O0000Ioio00.I0000O(this.I00000oIO, ((IiiO0I1OoOi) obj).I00000oIO);
                }

                public final int hashCode() {
/* 3 */             return this.I00000oIO.hashCode();
                }

                public final String toString() {
/* 18 */            return "DisplayingDisappearingItemsElement(animator=" + this.I00000oIO + ")";
                }
            }

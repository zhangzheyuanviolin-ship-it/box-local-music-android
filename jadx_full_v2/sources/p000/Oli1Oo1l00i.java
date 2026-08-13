            package p000;

            import java.lang.invoke.VarHandle;
            import kotlin.Metadata;
            
            @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"LOli1Oo1l00i;", "LO1oooooIio;", "LOli1i00iIo;", "ui"}, m18k = 1, mv = {2, 1, 0}, xi = 48)
            public final class Oli1Oo1l00i extends O1oooooIio {
                public I0olOlooIO0o I00000oIO;
                public Iil1iOI I00000oOI;

                @Override
                public final O1ooOo I000II() {
/* 7 */             Oli1i00iIo oli1i00iIo = new Oli1i00iIo(this.I00000oIO, this.I00000oOI);
/* 10 */            VarHandle.storeStoreFence();
/* 20 */            return oli1i00iIo;
                }

                @Override
                public final void I000O01llI0(O1ooOo o1ooOo) {
/* 1 */             Oli1i00iIo oli1i00iIo = (Oli1i00iIo) o1ooOo;
/* 3 */             I0olOlooIO0o i0olOlooIO0o = this.I00000oIO;
/* 11 */            if (!O0000Ioio00.I0000O(oli1i00iIo.I00o0l1o1o0, i0olOlooIO0o)) {
/* 13 */                oli1i00iIo.I00o0l1o1o0 = i0olOlooIO0o;
/* 17 */                if (oli1i00iIo.I00o101lO) {
/* 19 */                    oli1i00iIo.I010lI0oi();
                        }
                    }
/* 24 */            oli1i00iIo.I00o0iI0io1 = this.I00000oOI;
                }

                public final boolean equals(Object obj) {
/* 1 */             if (this == obj) {
/* 34 */                return true;
                    }
/* 6 */             if (!(obj instanceof Oli1Oo1l00i)) {
/* 32 */                return false;
                    }
/* 9 */             Oli1Oo1l00i oli1Oo1l00i = (Oli1Oo1l00i) obj;
                    return O0000Ioio00.I0000O(this.I00000oIO, oli1Oo1l00i.I00000oIO) && O0000Ioio00.I0000O(this.I00000oOI, oli1Oo1l00i.I00000oOI);
                }

                public final int hashCode() {
/* 9 */             int iI000OOo1O = Oi010OO0.I000OOo1O(this.I00000oIO.I00000oOI * 31, 31, false);
/* 13 */            Iil1iOI iil1iOI = this.I00000oOI;
/* 22 */            return iI000OOo1O + (iil1iOI != null ? iil1iOI.hashCode() : 0);
                }

                public final String toString() {
/* 28 */            return "StylusHoverIconModifierElement(icon=" + this.I00000oIO + ", overrideDescendants=false, touchBoundsExpansion=" + this.I00000oOI + ")";
                }
            }

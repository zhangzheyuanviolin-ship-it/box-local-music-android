            package p000;

            import java.lang.invoke.VarHandle;
            import kotlin.Metadata;
            
            @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"LOO1iIOi10OIo;", "LO1oooooIio;", "LOO1iIi01;", "ui"}, m18k = 1, mv = {2, 1, 0}, xi = 48)
            public final class OO1iIOi10OIo extends O1oooooIio {
                public I0olOlooIO0o I00000oIO;

                @Override
                public final O1ooOo I000II() {
/* 6 */             OO1iIi01 oO1iIi01 = new OO1iIi01(this.I00000oIO, null);
/* 9 */             VarHandle.storeStoreFence();
/* 20 */            return oO1iIi01;
                }

                @Override
                public final void I000O01llI0(O1ooOo o1ooOo) {
/* 1 */             OO1iIi01 oO1iIi01 = (OO1iIi01) o1ooOo;
/* 3 */             I0olOlooIO0o i0olOlooIO0o = this.I00000oIO;
/* 11 */            if (O0000Ioio00.I0000O(oO1iIi01.I00o0l1o1o0, i0olOlooIO0o)) {
/* 29 */                return;
                    }
/* 13 */            oO1iIi01.I00o0l1o1o0 = i0olOlooIO0o;
/* 17 */            if (oO1iIi01.I00o101lO) {
/* 19 */                oO1iIi01.I010lI0oi();
                    }
                }

                public final boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
                    return (obj instanceof OO1iIOi10OIo) && O0000Ioio00.I0000O(this.I00000oIO, ((OO1iIOi10OIo) obj).I00000oIO);
                }

                public final int hashCode() {
/* 14 */            return Boolean.hashCode(false) + (this.I00000oIO.hashCode() * 31);
                }

                public final String toString() {
/* 18 */            return "PointerHoverIconModifierElement(icon=" + this.I00000oIO + ", overrideDescendants=false)";
                }
            }

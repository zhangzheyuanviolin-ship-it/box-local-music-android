            package p000;

            import kotlin.Metadata;
            
            @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Li01illii1lI1;", "LO1oooooIio;", "Li01iloIOIo0;", "iO1OlI011Oo1", "foundation-layout"}, m18k = 1, mv = {2, 1, 0}, xi = 48)
            final class i01illii1lI1 extends O1oooooIio {
                public final Iii1I1O0 I00000oIO;
                public final IlliIl1l11O I00000oOI;
                public final Object I0000Il00O;

                public i01illii1lI1(Iii1I1O0 iii1I1O0, IlliIl1l11O illiIl1l11O, Object obj) {
/* 4 */             this.I00000oIO = iii1I1O0;
/* 6 */             this.I00000oOI = illiIl1l11O;
/* 8 */             this.I0000Il00O = obj;
                }

                @Override
                public final O1ooOo I000II() {
/* 3 */             i01iloIOIo0 i01iloioio0 = new i01iloIOIo0();
/* 8 */             i01iloioio0.I00o0iI0io1 = this.I00000oIO;
/* 12 */            i01iloioio0.I00o0l1o1o0 = this.I00000oOI;
/* 20 */            return i01iloioio0;
                }

                @Override
                public final void I000O01llI0(O1ooOo o1ooOo) {
/* 1 */             i01iloIOIo0 i01iloioio0 = (i01iloIOIo0) o1ooOo;
/* 5 */             i01iloioio0.I00o0iI0io1 = this.I00000oIO;
/* 9 */             i01iloioio0.I00o0l1o1o0 = this.I00000oOI;
                }

                public final boolean equals(Object obj) {
/* 1 */             if (this == obj) {
/* 37 */                return true;
                    }
/* 4 */             if (obj == null || i01illii1lI1.class != obj.getClass()) {
/* 35 */                return false;
                    }
/* 16 */            i01illii1lI1 i01illii1li1 = (i01illii1lI1) obj;
                    return this.I00000oIO == i01illii1li1.I00000oIO && O0000Ioio00.I0000O(this.I0000Il00O, i01illii1li1.I0000Il00O);
                }

                public final int hashCode() {
/* 21 */            return this.I0000Il00O.hashCode() + Oi010OO0.I000OOo1O(this.I00000oIO.hashCode() * 31, 31, false);
                }
            }

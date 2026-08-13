            package p000;

            import kotlin.Metadata;
            
            @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"LIoooIol1O0;", "LO1oooooIio;", "LIoooOl0I00;", "foundation-layout"}, m18k = 1, mv = {2, 1, 0}, xi = 48)
            final class IoooIol1O0 extends O1oooooIio {
                public Ioooi1OOlliO I00000oIO;
                public boolean I00000oOI;

                @Override
                public final O1ooOo I000II() {
/* 3 */             Ioooi1OOlliO ioooi1OOlliO = this.I00000oIO;
/* 5 */             boolean z = this.I00000oOI;
/* 8 */             IoooOl0I00 ioooOl0I00 = new IoooOl0I00(0);
/* 11 */            ioooOl0I00.I00o0l1o1o0 = ioooi1OOlliO;
/* 13 */            ioooOl0I00.I00o101lO = z;
/* 20 */            return ioooOl0I00;
                }

                @Override
                public final void I000O01llI0(O1ooOo o1ooOo) {
/* 1 */             IoooOl0I00 ioooOl0I00 = (IoooOl0I00) o1ooOo;
/* 5 */             ioooOl0I00.I00o0l1o1o0 = this.I00000oIO;
/* 9 */             ioooOl0I00.I00o101lO = this.I00000oOI;
                }

                public final boolean equals(Object obj) {
/* 1 */             if (this == obj) {
/* 27 */                return true;
                    }
/* 11 */            IoooIol1O0 ioooIol1O0 = obj instanceof IoooIol1O0 ? (IoooIol1O0) obj : null;
                    return ioooIol1O0 != null && this.I00000oIO == ioooIol1O0.I00000oIO && this.I00000oOI == ioooIol1O0.I00000oOI;
                }

                public final int hashCode() {
/* 15 */            return Boolean.hashCode(this.I00000oOI) + (this.I00000oIO.hashCode() * 31);
                }
            }

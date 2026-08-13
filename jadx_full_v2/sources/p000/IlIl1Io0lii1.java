            package p000;

            import kotlin.Metadata;
            
            @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"LIlIl1Io0lii1;", "LO1oooooIio;", "LIlIl1O0;", "foundation-layout"}, m18k = 1, mv = {2, 1, 0}, xi = 48)
            final class IlIl1Io0lii1 extends O1oooooIio {
                public final Iii1I1O0 I00000oIO;
                public final float I00000oOI;

                public IlIl1Io0lii1(Iii1I1O0 iii1I1O0, float f) {
/* 4 */             this.I00000oIO = iii1I1O0;
/* 6 */             this.I00000oOI = f;
                }

                @Override
                public final O1ooOo I000II() {
/* 3 */             IlIl1O0 ilIl1O0 = new IlIl1O0();
/* 8 */             ilIl1O0.I00o0iI0io1 = this.I00000oIO;
/* 12 */            ilIl1O0.I00o0l1o1o0 = this.I00000oOI;
/* 20 */            return ilIl1O0;
                }

                @Override
                public final void I000O01llI0(O1ooOo o1ooOo) {
/* 1 */             IlIl1O0 ilIl1O0 = (IlIl1O0) o1ooOo;
/* 5 */             ilIl1O0.I00o0iI0io1 = this.I00000oIO;
/* 9 */             ilIl1O0.I00o0l1o1o0 = this.I00000oOI;
                }

                public final boolean equals(Object obj) {
/* 1 */             if (this == obj) {
/* 26 */                return true;
                    }
/* 6 */             if (!(obj instanceof IlIl1Io0lii1)) {
/* 28 */                return false;
                    }
/* 9 */             IlIl1Io0lii1 ilIl1Io0lii1 = (IlIl1Io0lii1) obj;
                    return this.I00000oIO == ilIl1Io0lii1.I00000oIO && this.I00000oOI == ilIl1Io0lii1.I00000oOI;
                }

                public final int hashCode() {
/* 15 */            return Float.hashCode(this.I00000oOI) + (this.I00000oIO.hashCode() * 31);
                }
            }

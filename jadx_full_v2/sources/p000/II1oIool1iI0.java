            package p000;

            import kotlin.Metadata;
            
            @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"LII1oIool1iI0;", "LO1oooooIio;", "LII1oO1;", "foundation-layout"}, m18k = 1, mv = {2, 1, 0}, xi = 48)
            final class II1oIool1iI0 extends O1oooooIio {
                public final II0O01li0 I00000oIO;
                public final boolean I00000oOI;

                public II1oIool1iI0(II0O01li0 iI0O01li0, boolean z) {
/* 4 */             this.I00000oIO = iI0O01li0;
/* 6 */             this.I00000oOI = z;
                }

                @Override
                public final O1ooOo I000II() {
/* 3 */             II1oO1 iI1oO1 = new II1oO1();
/* 8 */             iI1oO1.I00o0iI0io1 = this.I00000oIO;
/* 12 */            iI1oO1.I00o0l1o1o0 = this.I00000oOI;
/* 20 */            return iI1oO1;
                }

                @Override
                public final void I000O01llI0(O1ooOo o1ooOo) {
/* 1 */             II1oO1 iI1oO1 = (II1oO1) o1ooOo;
/* 5 */             iI1oO1.I00o0iI0io1 = this.I00000oIO;
/* 9 */             iI1oO1.I00o0l1o1o0 = this.I00000oOI;
                }

                public final boolean equals(Object obj) {
/* 1 */             if (this == obj) {
/* 31 */                return true;
                    }
/* 11 */            II1oIool1iI0 iI1oIool1iI0 = obj instanceof II1oIool1iI0 ? (II1oIool1iI0) obj : null;
                    return iI1oIool1iI0 != null && this.I00000oIO.equals(iI1oIool1iI0.I00000oIO) && this.I00000oOI == iI1oIool1iI0.I00000oOI;
                }

                public final int hashCode() {
/* 15 */            return Boolean.hashCode(this.I00000oOI) + (this.I00000oIO.hashCode() * 31);
                }
            }

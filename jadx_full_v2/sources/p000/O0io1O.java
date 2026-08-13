            package p000;

            import kotlin.Metadata;
            
            @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"LO0io1O;", "LO1oooooIio;", "LO0io1oOlO;", "foundation-layout"}, m18k = 1, mv = {2, 1, 0}, xi = 48)
            public final class O0io1O extends O1oooooIio {
                public final float I00000oIO;
                public final boolean I00000oOI;

                public O0io1O(float f, boolean z) {
/* 4 */             this.I00000oIO = f;
/* 6 */             this.I00000oOI = z;
                }

                @Override
                public final O1ooOo I000II() {
/* 3 */             O0io1oOlO o0io1oOlO = new O0io1oOlO();
/* 8 */             o0io1oOlO.I00o0iI0io1 = this.I00000oIO;
/* 12 */            o0io1oOlO.I00o0l1o1o0 = this.I00000oOI;
/* 20 */            return o0io1oOlO;
                }

                @Override
                public final void I000O01llI0(O1ooOo o1ooOo) {
/* 1 */             O0io1oOlO o0io1oOlO = (O0io1oOlO) o1ooOo;
/* 5 */             o0io1oOlO.I00o0iI0io1 = this.I00000oIO;
/* 9 */             o0io1oOlO.I00o0l1o1o0 = this.I00000oOI;
                }

                public final boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
/* 12 */            O0io1O o0io1O = obj instanceof O0io1O ? (O0io1O) obj : null;
                    return o0io1O != null && this.I00000oIO == o0io1O.I00000oIO && this.I00000oOI == o0io1O.I00000oOI;
                }

                public final int hashCode() {
/* 15 */            return Boolean.hashCode(this.I00000oOI) + (Float.hashCode(this.I00000oIO) * 31);
                }
            }

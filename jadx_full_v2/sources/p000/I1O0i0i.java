            package p000;

            import kotlin.Metadata;
            
            @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"LI1O0i0i;", "LO1oooooIio;", "LI1O0l0olo;", "foundation-layout"}, m18k = 1, mv = {2, 1, 0}, xi = 48)
            final class I1O0i0i extends O1oooooIio {
                public float I00000oIO;

                @Override
                public final O1ooOo I000II() {
/* 3 */             float f = this.I00000oIO;
/* 5 */             I1O0l0olo i1O0l0olo = new I1O0l0olo();
/* 8 */             i1O0l0olo.I00o0iI0io1 = f;
/* 20 */            return i1O0l0olo;
                }

                @Override
                public final void I000O01llI0(O1ooOo o1ooOo) {
/* 5 */             ((I1O0l0olo) o1ooOo).I00o0iI0io1 = this.I00000oIO;
                }

                public final boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
/* 13 */            I1O0i0i i1O0i0i = obj instanceof I1O0i0i ? (I1O0i0i) obj : null;
/* 14 */            if (i1O0i0i == null || this.I00000oIO != i1O0i0i.I00000oIO) {
/* 31 */                return false;
                    }
/* 27 */            ((I1O0i0i) obj).getClass();
/* 1 */             return true;
                }

                public final int hashCode() {
/* 14 */            return Boolean.hashCode(false) + (Float.hashCode(this.I00000oIO) * 31);
                }
            }

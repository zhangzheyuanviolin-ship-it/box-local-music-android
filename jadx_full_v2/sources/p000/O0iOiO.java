            package p000;

            import kotlin.Metadata;
            import kotlin.jvm.functions.Function3;
            
            @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"LO0iOiO;", "LO1oooooIio;", "LO0iOo1i1l1i;", "ui"}, m18k = 1, mv = {2, 1, 0}, xi = 48)
            final class O0iOiO extends O1oooooIio {
                public Function3 I00000oIO;

                @Override
                public final O1ooOo I000II() {
/* 3 */             Function3 function3 = this.I00000oIO;
/* 5 */             O0iOo1i1l1i o0iOo1i1l1i = new O0iOo1i1l1i();
/* 8 */             o0iOo1i1l1i.I00o0iI0io1 = function3;
/* 20 */            return o0iOo1i1l1i;
                }

                @Override
                public final void I000O01llI0(O1ooOo o1ooOo) {
/* 5 */             ((O0iOo1i1l1i) o1ooOo).I00o0iI0io1 = this.I00000oIO;
                }

                public final boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
                    return (obj instanceof O0iOiO) && this.I00000oIO == ((O0iOiO) obj).I00000oIO;
                }

                public final int hashCode() {
/* 3 */             return this.I00000oIO.hashCode();
                }
            }

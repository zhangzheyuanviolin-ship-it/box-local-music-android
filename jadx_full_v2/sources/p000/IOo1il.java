            package p000;

            import kotlin.Metadata;
            import kotlin.jvm.functions.Function1;
            
            @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"LIOo1il;", "LO1oooooIio;", "LIOo1lOI10l0;", "foundation-layout"}, m18k = 1, mv = {2, 1, 0}, xi = 48)
            final class IOo1il extends O1oooooIio {
                public Function1 I00000oIO;

                @Override
                public final O1ooOo I000II() {
/* 3 */             Function1 function1 = this.I00000oIO;
/* 5 */             IOo1lOI10l0 iOo1lOI10l0 = new IOo1lOI10l0();
/* 8 */             iOo1lOI10l0.I00o101lO = function1;
/* 20 */            return iOo1lOI10l0;
                }

                @Override
                public final void I000O01llI0(O1ooOo o1ooOo) {
/* 1 */             IOo1lOI10l0 iOo1lOI10l0 = (IOo1lOI10l0) o1ooOo;
/* 3 */             Function1 function1 = this.I00000oIO;
/* 7 */             if (function1 != iOo1lOI10l0.I00o101lO) {
/* 9 */                 iOo1lOI10l0.I00o101lO = function1;
/* 11 */                iOo1lOI10l0.I010l1ol111();
                    }
                }

                public final boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
                    return (obj instanceof IOo1il) && ((IOo1il) obj).I00000oIO == this.I00000oIO;
                }

                public final int hashCode() {
/* 3 */             return this.I00000oIO.hashCode();
                }
            }

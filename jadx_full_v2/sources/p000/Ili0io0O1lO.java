            package p000;

            import kotlin.Metadata;
            import kotlin.jvm.functions.Function1;
            
            @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"LIli0io0O1lO;", "LO1oooooIio;", "LIli0l0ilII;", "ui"}, m18k = 1, mv = {2, 1, 0}, xi = 48)
            final class Ili0io0O1lO extends O1oooooIio {
                public Function1 I00000oIO;

                @Override
                public final O1ooOo I000II() {
/* 3 */             Function1 function1 = this.I00000oIO;
/* 5 */             Ili0l0ilII ili0l0ilII = new Ili0l0ilII();
/* 8 */             ili0l0ilII.I00o0iI0io1 = function1;
/* 20 */            return ili0l0ilII;
                }

                @Override
                public final void I000O01llI0(O1ooOo o1ooOo) {
/* 5 */             ((Ili0l0ilII) o1ooOo).I00o0iI0io1 = this.I00000oIO;
                }

                public final boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
                    return (obj instanceof Ili0io0O1lO) && this.I00000oIO == ((Ili0io0O1lO) obj).I00000oIO;
                }

                public final int hashCode() {
/* 3 */             return this.I00000oIO.hashCode();
                }
            }

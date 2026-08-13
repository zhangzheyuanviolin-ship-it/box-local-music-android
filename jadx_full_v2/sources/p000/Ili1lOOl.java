            package p000;

            import kotlin.Metadata;
            
            @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"LIli1lOOl;", "LO1oooooIio;", "LIli1ooiIi;", "ui"}, m18k = 1, mv = {2, 1, 0}, xi = 48)
            final class Ili1lOOl extends O1oooooIio {
                public Ili1lII I00000oIO;

                @Override
                public final O1ooOo I000II() {
/* 3 */             Ili1lII ili1lII = this.I00000oIO;
/* 5 */             Ili1ooiIi ili1ooiIi = new Ili1ooiIi();
/* 8 */             ili1ooiIi.I00o0iI0io1 = ili1lII;
/* 20 */            return ili1ooiIi;
                }

                @Override
                public final void I000O01llI0(O1ooOo o1ooOo) {
/* 1 */             Ili1ooiIi ili1ooiIi = (Ili1ooiIi) o1ooOo;
/* 7 */             ili1ooiIi.I00o0iI0io1.I00000oIO.I000iOII(ili1ooiIi);
/* 10 */            Ili1lII ili1lII = this.I00000oIO;
/* 12 */            ili1ooiIi.I00o0iI0io1 = ili1lII;
/* 16 */            ili1lII.I00000oIO.I00000oOI(ili1ooiIi);
                }

                public final boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
                    return (obj instanceof Ili1lOOl) && O0000Ioio00.I0000O(this.I00000oIO, ((Ili1lOOl) obj).I00000oIO);
                }

                public final int hashCode() {
/* 3 */             return this.I00000oIO.hashCode();
                }

                public final String toString() {
/* 18 */            return "FocusRequesterElement(focusRequester=" + this.I00000oIO + ")";
                }
            }

            package p000;

            import kotlin.Metadata;
            import kotlin.jvm.functions.Function1;
            
            @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"LII0oOOi;", "LO1oooooIio;", "LII0oOiiIO;", "ui"}, m18k = 1, mv = {2, 1, 0}, xi = 48)
            final class II0oOOi extends O1oooooIio {
                public Function1 I00000oIO;

                @Override
                public final O1ooOo I000II() {
/* 5 */             return new II0oOiiIO(this.I00000oIO);
                }

                @Override
                public final void I000O01llI0(O1ooOo o1ooOo) {
/* 1 */             II0oOiiIO iI0oOiiIO = (II0oOiiIO) o1ooOo;
/* 3 */             Function1 function1 = this.I00000oIO;
/* 5 */             iI0oOiiIO.I00o0iI0io1 = function1;
/* 7 */             l0o11Oi.I0000Il00O(iI0oOiiIO, function1);
                }

                public final boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
                    return (obj instanceof II0oOOi) && this.I00000oIO == ((II0oOOi) obj).I00000oIO;
                }

                public final int hashCode() {
/* 3 */             return this.I00000oIO.hashCode();
                }
            }

            package p000;

            import java.lang.invoke.VarHandle;
            import kotlin.Metadata;
            import kotlin.jvm.functions.Function1;
            
            @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"LOIi01l1OlI;", "LO1oooooIio;", "LOIi0IO;", "ui"}, m18k = 1, mv = {2, 1, 0}, xi = 48)
            final class OIi01l1OlI extends O1oooooIio {
                public Function1 I00000oIO;

                @Override
                public final O1ooOo I000II() {
/* 3 */             Function1 function1 = this.I00000oIO;
/* 5 */             OIi0IO oIi0IO = new OIi0IO();
/* 8 */             oIi0IO.I00o0iI0io1 = function1;
/* 15 */            oIi0IO.I00o0l1o1o0 = -9223372034707292160L;
/* 17 */            VarHandle.storeStoreFence();
/* 20 */            return oIi0IO;
                }

                @Override
                public final void I000O01llI0(O1ooOo o1ooOo) {
/* 1 */             OIi0IO oIi0IO = (OIi0IO) o1ooOo;
/* 5 */             oIi0IO.I00o0iI0io1 = this.I00000oIO;
/* 12 */            oIi0IO.I00o0l1o1o0 = -9223372034707292160L;
                }

                public final boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
                    return (obj instanceof OIi01l1OlI) && this.I00000oIO == ((OIi01l1OlI) obj).I00000oIO;
                }

                public final int hashCode() {
/* 3 */             return this.I00000oIO.hashCode();
                }
            }

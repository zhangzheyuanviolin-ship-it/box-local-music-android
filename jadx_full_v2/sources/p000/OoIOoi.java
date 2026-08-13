            package p000;

            import java.lang.invoke.VarHandle;
            import kotlin.Metadata;
            
            @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0083\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"LOoIOoi;", "LO1oooooIio;", "LOoIOoioo1;", "foundation"}, m18k = 1, mv = {2, 1, 0}, xi = 48)
            final class OoIOoi extends O1oooooIio {
                public O0llioI1 I00000oIO;

                @Override
                public final O1ooOo I000II() {
/* 3 */             O0llioI1 o0llioI1 = this.I00000oIO;
/* 5 */             OoIOoioo1 ooIOoioo1 = new OoIOoioo1();
/* 8 */             ooIOoioo1.I00o0iI0io1 = o0llioI1;
/* 10 */            VarHandle.storeStoreFence();
/* 20 */            return ooIOoioo1;
                }

                @Override
                public final void I000O01llI0(O1ooOo o1ooOo) {
/* 5 */             ((OoIOoioo1) o1ooOo).I00o0iI0io1 = this.I00000oIO;
                }

                public final boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
                    return (obj instanceof OoIOoi) && O0000Ioio00.I0000O(this.I00000oIO, ((OoIOoi) obj).I00000oIO);
                }

                public final int hashCode() {
/* 3 */             return this.I00000oIO.hashCode();
                }

                public final String toString() {
/* 18 */            return "TraversablePrefetchStateModifierElement(prefetchState=" + this.I00000oIO + ")";
                }
            }

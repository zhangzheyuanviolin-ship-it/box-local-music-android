            package p000;

            import java.lang.invoke.VarHandle;
            import kotlin.Metadata;
            
            @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"LOO010O1l;", "LO1oooooIio;", "LOO010O1i1001;", "material3"}, m18k = 1, mv = {2, 1, 0}, xi = 48)
            public final class OO010O1l extends O1oooooIio {
                public I01oIoOI01l I00000oIO;

                @Override
                public final O1ooOo I000II() {
/* 3 */             I01oIoOI01l i01oIoOI01l = this.I00000oIO;
/* 5 */             OO010O1i1001 oO010O1i1001 = new OO010O1i1001();
/* 8 */             oO010O1i1001.I00o0iI0io1 = i01oIoOI01l;
/* 10 */            VarHandle.storeStoreFence();
/* 20 */            return oO010O1i1001;
                }

                @Override
                public final void I000O01llI0(O1ooOo o1ooOo) {
/* 1 */             OO010O1i1001 oO010O1i1001 = (OO010O1i1001) o1ooOo;
/* 5 */             oO010O1i1001.I00o0iI0io1 = this.I00000oIO;
/* 7 */             lO1OiIiIo0oi.I00000oOI(oO010O1i1001);
                }

                public final boolean equals(Object obj) {
/* 1 */             if (this == obj) {
/* 17 */                return true;
                    }
                    return (obj instanceof OO010O1l) && this.I00000oIO == ((OO010O1l) obj).I00000oIO;
                }

                public final int hashCode() {
/* 3 */             return this.I00000oIO.hashCode();
                }
            }

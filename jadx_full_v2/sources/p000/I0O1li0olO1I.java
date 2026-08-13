            package p000;

            import java.lang.invoke.VarHandle;
            import kotlin.Metadata;
            
            @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"LI0O1li0olO1I;", "LO1oooooIio;", "LI0O1lii01O;", "foundation"}, m18k = 1, mv = {2, 1, 0}, xi = 48)
            final class I0O1li0olO1I extends O1oooooIio {
                public IlliIl1l11O I00000oIO;

                @Override
                public final O1ooOo I000II() {
/* 3 */             IlliIl1l11O illiIl1l11O = this.I00000oIO;
/* 5 */             I0O1lii01O i0O1lii01O = new I0O1lii01O();
/* 8 */             i0O1lii01O.I00o101lO = illiIl1l11O;
/* 15 */            IIOIlOoI111 iIOIlOoI111 = new IIOIlOoI111(5);
/* 18 */            iIOIlOoI111.I00iiI = i0O1lii01O;
/* 20 */            VarHandle.storeStoreFence();
/* 23 */            I0O1lI0oi i0O1lI0oi = new I0O1lI0oi();
/* 26 */            i0O1lI0oi.I00o0iI0io1 = iIOIlOoI111;
/* 28 */            i0O1lii01O.I010l1O(i0O1lI0oi);
/* 55 */            return i0O1lii01O;
                }

                @Override
                public final void I000O01llI0(O1ooOo o1ooOo) {
/* 5 */             ((I0O1lii01O) o1ooOo).I00o101lO = this.I00000oIO;
                }

                public final boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
                    return (obj instanceof I0O1li0olO1I) && this.I00000oIO == ((I0O1li0olO1I) obj).I00000oIO;
                }

                public final int hashCode() {
/* 3 */             return this.I00000oIO.hashCode();
                }
            }

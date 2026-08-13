            package p000;

            import java.lang.invoke.VarHandle;
            
            public abstract class llOl001olOi {
                public abstract Object I00000oIO(o0IlOioo o0iloioo);

                public final llOi1o I00000oOI() {
/* 3 */             if (this instanceof llOi1o) {
/* 16 */                return (llOi1o) this;
                    }
/* 7 */             llOi1o lloi1o = new llOi1o();
/* 10 */            lloi1o.I00000oIO = this;
/* 12 */            VarHandle.storeStoreFence();
/* 15 */            return lloi1o;
                }
            }

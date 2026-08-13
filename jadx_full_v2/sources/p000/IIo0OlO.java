            package p000;

            import java.lang.invoke.VarHandle;
            
            public final class IIo0OlO {
                public final IIlo0i0ll I00000oIO;
                public final OlOIOo0 I00000oOI;
                public final OllO00oiil I0000Il00O;

                public IIo0OlO(IIlo0i0ll iIlo0i0ll, OlOIOo0 olOIOo0) {
/* 4 */             this.I00000oIO = iIlo0i0ll;
/* 6 */             this.I00000oOI = olOIOo0;
/* 12 */            I0OIOO00l0O i0OIOO00l0O = new I0OIOO00l0O(15);
/* 15 */            i0OIOO00l0O.I00iiI = this;
/* 17 */            VarHandle.storeStoreFence();
/* 25 */            this.I0000Il00O = new OllO00oiil(i0OIOO00l0O);
                }

                public final OOil0lI I00000oIO() {
/* 7 */             return (OOil0lI) this.I0000Il00O.getValue();
                }
            }

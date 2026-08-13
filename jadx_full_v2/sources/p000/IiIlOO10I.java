            package p000;
            
            public abstract class IiIlOO10I extends IiIlIil {
                public final Ol0O0iI0l0O I00iiI;

                public IiIlOO10I(Ol0O0iI0l0O ol0O0iI0l0O) {
/* 4 */             this.I00iiI = ol0O0iI0l0O;
                }

                @Override
                public final Ol0O0iI0l0O I00li1OI(boolean z) {
                    return z == I00iiI() ? this : this.I00iiI.I00li1OI(z).I00lli11(I00OloOo());
                }

                @Override
                public final Ol0O0iI0l0O I00lli11(OoOI1i1i ooOI1i1i) {
                    return ooOI1i1i != I00OloOo() ? new Ol0O1IOl1I(this, ooOI1i1i) : this;
                }

                @Override
                public final Ol0O0iI0l0O I00o0l1o1o0() {
/* 1 */             return this.I00iiI;
                }
            }

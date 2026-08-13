            package p000;
            
/* 18 */    public final class OiIo0IlO1Il0 implements O0oiIoI0, AutoCloseable {
                public String I00iOIl;
                public OiIloOOiiOii I00iiI;
                public boolean I00iiO;

                public final void I00000oIO(I1I0i0Ilo1Oi i1I0i0Ilo1Oi, I01O1lIi i01O1lIi) {
/* 3 */             if (this.I00iiO) {
/* 27 */                I000II.I001IO000("Already attached to lifecycleOwner");
/* 37 */                return;
                    }
/* 6 */             this.I00iiO = true;
/* 8 */             i01O1lIi.I00li1OI(this);
/* 21 */            i1I0i0Ilo1Oi.I00Ol00(this.I00iOIl, (Iiii00iIoO) this.I00iiI.I00000oOI.I00ilO0);
                }

                @Override
                public final void I000II(O0oiOi o0oiOi, O0oOOiI0 o0oOOiI0) {
/* 3 */             if (o0oOOiI0 == O0oOOiI0.ON_DESTROY) {
/* 6 */                 this.I00iiO = false;
/* 12 */                o0oiOi.I000iOII().I00ooIo0(this);
                    }
                }

                @Override
/* 19 */        public final void close() {
                }
            }

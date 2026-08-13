            package p000;
            
            public final class IOlO1IilOlOl extends OOiIOoiOO {
                public final int I00000oOI;
                public Object I0000Il00O;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public IOlO1IilOlOl(IllOOo00lI illOOo00lI, int i) {
/* 3 */             super(illOOo00lI);
/* 1 */             this.I00000oOI = i;
                }

                @Override
                public final OOiIo1lll I00000oIO(Object obj) {
                    switch (this.I00000oOI) {
                        case 0:
/* 43 */                    return new OOiIo1lll(this, obj, obj == null, null, null, true);
                        default:
/* 24 */                    return new OOiIo1lll(this, obj, obj == null, (Ol1lllIil) this.I0000Il00O, null, true);
                    }
                }

                @Override
                public OoloiloOIo I00000oOI() {
                    switch (this.I00000oOI) {
                        case 0:
/* 13 */                    return (IOlO1lli) this.I0000Il00O;
                        default:
/* 6 */                     return super.I00000oOI();
                    }
                }
            }

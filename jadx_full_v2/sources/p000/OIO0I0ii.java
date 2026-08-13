            package p000;
            
            public final class OIO0I0ii extends IiIlOO10I {
                public final int I00iiO;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public OIO0I0ii(Ol0O0iI0l0O ol0O0iI0l0O, int i) {
/* 3 */             super(ol0O0iI0l0O);
/* 1 */             this.I00iiO = i;
                }

                @Override
                public final boolean I00iiI() {
                    switch (this.I00iiO) {
                        case 0:
/* 8 */                     return false;
                        default:
/* 6 */                     return true;
                    }
                }

                @Override
                public final IiIlIil I00oI0i(Ol0O0iI0l0O ol0O0iI0l0O) {
                    switch (this.I00iiO) {
                        case 0:
/* 16 */                    return new OIO0I0ii(ol0O0iI0l0O, 0);
                        default:
/* 9 */                     return new OIO0I0ii(ol0O0iI0l0O, 1);
                    }
                }
            }

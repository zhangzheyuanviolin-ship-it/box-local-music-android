            package p000;
            
            public final class Ooo001looIiO extends O1iiOlI {
                public static final Ooo001looIiO I0000O = new Ooo001looIiO("must have no value parameters", 0);
                public static final Ooo001looIiO I0000oI00 = new Ooo001looIiO("must have a single value parameter", 1);
                public final int I0000Il00O;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public Ooo001looIiO(String str, int i) {
/* 4 */             super(str, 1);
/* 1 */             this.I0000Il00O = i;
                }

                @Override
                public final boolean I00000oIO(O00loo1i111O o00loo1i111O) {
                    switch (this.I0000Il00O) {
                        case 0:
/* 24 */                    return o00loo1i111O.I00Iooi00oi().isEmpty();
                        default:
                            return o00loo1i111O.I00Iooi00oi().size() == 1;
                    }
                }
            }

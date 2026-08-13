            package p000;
            
            public final class O1iiOiiIi extends O1iiOlI {
                public static final O1iiOiiIi I0000O = new O1iiOiiIi("must be a member function", 0);
                public static final O1iiOiiIi I0000oI00 = new O1iiOiiIi("must be a member or an extension function", 1);
                public final int I0000Il00O;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public O1iiOiiIi(String str, int i) {
/* 4 */             super(str, 0);
/* 1 */             this.I0000Il00O = i;
                }

                @Override
                public final boolean I00000oIO(O00loo1i111O o00loo1i111O) {
                    switch (this.I0000Il00O) {
                        case 0:
/* 21 */                    if (o00loo1i111O.I00l0OO0IO == null) {
                                break;
                            }
                            break;
                        default:
/* 10 */                    if (o00loo1i111O.I00l0OO0IO == null && o00loo1i111O.I00l0I0l0lO1 == null) {
                                break;
                            }
                            break;
                    }
/* 4 */             return false;
                }
            }

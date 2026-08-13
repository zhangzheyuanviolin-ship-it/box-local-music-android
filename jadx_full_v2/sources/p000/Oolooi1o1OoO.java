            package p000;
            
/* 31 */    public final class Oolooi1o1OoO extends O1iiOlI {
                public final int I0000Il00O = 0;
                public int I0000O;

                /* JADX WARN: Illegal instructions before constructor call */
                public Oolooi1o1OoO(int i) {
/* 8 */             StringBuilder sbI00100o1O0lo = IlIi0I0.I00100o1O0lo("must have at least ", i, " value parameter");
/* 20 */            sbI00100o1O0lo.append(i > 1 ? "s" : "");
/* 27 */            super(sbI00100o1O0lo.toString(), 1);
/* 30 */            this.I0000O = i;
                }

                @Override
                public final boolean I00000oIO(O00loo1i111O o00loo1i111O) {
                    switch (this.I0000Il00O) {
                        case 0:
/* 32 */                    if (o00loo1i111O.I00Iooi00oi().size() >= this.I0000O) {
                                break;
                            }
                            break;
                        default:
/* 18 */                    if (o00loo1i111O.I00Iooi00oi().size() == this.I0000O) {
                                break;
                            }
                            break;
                    }
/* 4 */             return true;
                }

/* 32 */        public Oolooi1o1OoO(String str) {
/* 33 */            super(str, 1);
                }
            }

            package p000;
            
            public final class IiIiOIi0 extends IiIlIil implements Ii0lIOIlO, IiIiOl1l0oI {
                public final Ol0O0iI0l0O I00iiI;
                public final boolean I00iiO;

                public IiIiOIi0(Ol0O0iI0l0O ol0O0iI0l0O, boolean z) {
/* 4 */             this.I00iiI = ol0O0iI0l0O;
/* 6 */             this.I00iiO = z;
                }

                @Override
                public final Ooioo0o1l0 I001i1O0Ol(O0iIl1 o0iIl1) {
/* 1 */             Ooioo0o1l0 ooioo0o1l0I00l0OO0IO = o0iIl1.I00l0OO0IO();
/* 7 */             IiIiOIi0 iiIiOIi0I0000O = lo1iloiI1.I0000O(ooioo0o1l0I00l0OO0IO, this.I00iiO);
/* 11 */            if (iiIiOIi0I0000O != null) {
/* 13 */                return iiIiOIi0I0000O;
                    }
/* 14 */            Ol0O0iI0l0O ol0O0iI0l0OI00000oOI = lOOIol01.I00000oOI(ooioo0o1l0I00l0OO0IO);
                    return ol0O0iI0l0OI00000oOI != null ? ol0O0iI0l0OI00000oOI : ooioo0o1l0I00l0OO0IO.I00li1OI(false);
                }

                @Override
                public final boolean I00II0oii1o() {
/* 1 */             Ol0O0iI0l0O ol0O0iI0l0O = this.I00iiI;
/* 3 */             ol0O0iI0l0O.I00iOIl();
                    return ol0O0iI0l0O.I00iOIl().I00100o1O0lo() instanceof OoOOiO;
                }

                @Override
                public final boolean I00iiI() {
/* 1 */             return false;
                }

                @Override
                public final Ol0O0iI0l0O I00li1OI(boolean z) {
                    return z ? this.I00iiI.I00li1OI(z) : this;
                }

                @Override
                public final Ol0O0iI0l0O I00lli11(OoOI1i1i ooOI1i1i) {
/* 11 */            return new IiIiOIi0(this.I00iiI.I00lli11(ooOI1i1i), this.I00iiO);
                }

                @Override
                public final Ol0O0iI0l0O I00o0l1o1o0() {
/* 1 */             return this.I00iiI;
                }

                @Override
                public final IiIlIil I00oI0i(Ol0O0iI0l0O ol0O0iI0l0O) {
/* 5 */             return new IiIiOIi0(ol0O0iI0l0O, this.I00iiO);
                }

                @Override
                public final String toString() {
/* 16 */            return this.I00iiI + " & Any";
                }
            }

            package p000;
            
            public final class OIO0IOO extends IiIlIil implements Ii0lIOIlO {
                public final Ol0O0iI0l0O I00iiI;

                public OIO0IOO(Ol0O0iI0l0O ol0O0iI0l0O) {
/* 4 */             this.I00iiI = ol0O0iI0l0O;
                }

                @Override
                public final Ooioo0o1l0 I001i1O0Ol(O0iIl1 o0iIl1) {
/* 1 */             Ooioo0o1l0 ooioo0o1l0I00l0OO0IO = o0iIl1.I00l0OO0IO();
/* 9 */             if (!OoOilo0Oliii.I0001Ioi1lo(ooioo0o1l0I00l0OO0IO) && !OoOilo0Oliii.I0000oI00(ooioo0o1l0I00l0OO0IO)) {
/* 17 */                return ooioo0o1l0I00l0OO0IO;
                    }
/* 21 */            if (ooioo0o1l0I00l0OO0IO instanceof Ol0O0iI0l0O) {
/* 23 */                Ol0O0iI0l0O ol0O0iI0l0O = (Ol0O0iI0l0O) ooioo0o1l0I00l0OO0IO;
/* 25 */                Ol0O0iI0l0O ol0O0iI0l0OI00li1OI = ol0O0iI0l0O.I00li1OI(false);
                        return !OoOilo0Oliii.I0001Ioi1lo(ol0O0iI0l0O) ? ol0O0iI0l0OI00li1OI : new OIO0IOO(ol0O0iI0l0OI00li1OI);
                    }
/* 44 */            if (!(ooioo0o1l0I00l0OO0IO instanceof IlOIOIi00io)) {
/* 100 */               I000II.I00000oIO();
/* 103 */               return null;
                    }
/* 47 */            IlOIOIi00io ilOIOIi00io = (IlOIOIi00io) ooioo0o1l0I00l0OO0IO;
/* 49 */            Ol0O0iI0l0O ol0O0iI0l0O2 = ilOIOIi00io.I00iiI;
/* 51 */            Ol0O0iI0l0O ol0O0iI0l0OI00li1OI2 = ol0O0iI0l0O2.I00li1OI(false);
/* 59 */            if (OoOilo0Oliii.I0001Ioi1lo(ol0O0iI0l0O2)) {
/* 64 */                ol0O0iI0l0OI00li1OI2 = new OIO0IOO(ol0O0iI0l0OI00li1OI2);
                    }
/* 68 */            Ol0O0iI0l0O ol0O0iI0l0O3 = ilOIOIi00io.I00iiO;
/* 70 */            Ol0O0iI0l0O ol0O0iI0l0OI00li1OI3 = ol0O0iI0l0O3.I00li1OI(false);
/* 78 */            if (OoOilo0Oliii.I0001Ioi1lo(ol0O0iI0l0O3)) {
/* 83 */                ol0O0iI0l0OI00li1OI3 = new OIO0IOO(ol0O0iI0l0OI00li1OI3);
                    }
/* 95 */            return lOoll01ll0I.I00000oOI(l0loOIIo0iOo.I00000oIO(ol0O0iI0l0OI00li1OI2, ol0O0iI0l0OI00li1OI3), lOoll01ll0I.I00000oIO(ooioo0o1l0I00l0OO0IO));
                }

                @Override
                public final boolean I00II0oii1o() {
/* 1 */             return true;
                }

                @Override
                public final boolean I00iiI() {
/* 1 */             return false;
                }

                @Override
                public final Ooioo0o1l0 I00lli11(OoOI1i1i ooOI1i1i) {
/* 9 */             return new OIO0IOO(this.I00iiI.I00lli11(ooOI1i1i));
                }

                @Override
                public final Ol0O0iI0l0O I00li1OI(boolean z) {
                    return z ? this.I00iiI.I00li1OI(true) : this;
                }

                @Override
                public final Ol0O0iI0l0O I00lli11(OoOI1i1i ooOI1i1i) {
/* 9 */             return new OIO0IOO(this.I00iiI.I00lli11(ooOI1i1i));
                }

                @Override
                public final Ol0O0iI0l0O I00o0l1o1o0() {
/* 1 */             return this.I00iiI;
                }

                @Override
                public final IiIlIil I00oI0i(Ol0O0iI0l0O ol0O0iI0l0O) {
/* 3 */             return new OIO0IOO(ol0O0iI0l0O);
                }
            }

            package p000;
            
            public final class IlOIi0io00l extends IlOIOIi00io implements Ii0lIOIlO {
                @Override
                public final Ooioo0o1l0 I001i1O0Ol(O0iIl1 o0iIl1) {
                    Ooioo0o1l0 ooioo0o1l0I00000oIO;
/* 1 */             Ooioo0o1l0 ooioo0o1l0I00l0OO0IO = o0iIl1.I00l0OO0IO();
/* 7 */             if (ooioo0o1l0I00l0OO0IO instanceof IlOIOIi00io) {
/* 9 */                 ooioo0o1l0I00000oIO = ooioo0o1l0I00l0OO0IO;
                    } else {
/* 13 */                if (!(ooioo0o1l0I00l0OO0IO instanceof Ol0O0iI0l0O)) {
/* 36 */                    I000II.I00000oIO();
/* 39 */                    return null;
                        }
/* 16 */                Ol0O0iI0l0O ol0O0iI0l0O = (Ol0O0iI0l0O) ooioo0o1l0I00l0OO0IO;
/* 23 */                ooioo0o1l0I00000oIO = l0loOIIo0iOo.I00000oIO(ol0O0iI0l0O, ol0O0iI0l0O.I00li1OI(true));
                    }
/* 31 */            return lOoll01ll0I.I00000oOI(ooioo0o1l0I00000oIO, lOoll01ll0I.I00000oIO(ooioo0o1l0I00l0OO0IO));
                }

                @Override
                public final boolean I00II0oii1o() {
/* 1 */             Ol0O0iI0l0O ol0O0iI0l0O = this.I00iiI;
                    return (ol0O0iI0l0O.I00iOIl().I00100o1O0lo() instanceof OoOOiO) && O0000Ioio00.I0000O(ol0O0iI0l0O.I00iOIl(), this.I00iiO.I00iOIl());
                }

                @Override
                public final O0iIl1 I00ll1(O0iIoIOO0O0 o0iIoIOO0O0) {
/* 7 */             return new IlOIi0io00l(this.I00iiI, this.I00iiO);
                }

                @Override
                public final Ooioo0o1l0 I00li1OI(boolean z) {
/* 13 */            return l0loOIIo0iOo.I00000oIO(this.I00iiI.I00li1OI(z), this.I00iiO.I00li1OI(z));
                }

                @Override
                public final Ooioo0o1l0 I00ll1(O0iIoIOO0O0 o0iIoIOO0O0) {
/* 7 */             return new IlOIi0io00l(this.I00iiI, this.I00iiO);
                }

                @Override
                public final Ooioo0o1l0 I00lli11(OoOI1i1i ooOI1i1i) {
/* 13 */            return l0loOIIo0iOo.I00000oIO(this.I00iiI.I00lli11(ooOI1i1i), this.I00iiO.I00lli11(ooOI1i1i));
                }

                @Override
                public final Ol0O0iI0l0O I00lll10() {
/* 1 */             return this.I00iiI;
                }

                @Override
                public final String I00o0iI0io1(IiOOllOI0io iiOOllOI0io, IiOOllOI0io iiOOllOI0io2) {
/* 3 */             boolean zI000o00OoI0I = iiOOllOI0io2.I00000oIO.I000o00OoI0I();
/* 7 */             Ol0O0iI0l0O ol0O0iI0l0O = this.I00iiO;
/* 9 */             Ol0O0iI0l0O ol0O0iI0l0O2 = this.I00iiI;
/* 11 */            if (!zI000o00OoI0I) {
/* 61 */                return iiOOllOI0io.I00II0Ol1O0l(iiOOllOI0io.I00OIl(ol0O0iI0l0O2), iiOOllOI0io.I00OIl(ol0O0iI0l0O), lOoliOIOlIO0.I0000O(this));
                    }
/* 44 */            return "(" + iiOOllOI0io.I00OIl(ol0O0iI0l0O2) + ".." + iiOOllOI0io.I00OIl(ol0O0iI0l0O) + ')';
                }

                @Override
                public final String toString() {
/* 28 */            return "(" + this.I00iiI + ".." + this.I00iiO + ')';
                }
            }

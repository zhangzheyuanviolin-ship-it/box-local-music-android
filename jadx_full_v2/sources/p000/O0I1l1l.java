            package p000;
            
            public final class O0I1l1l implements IiOlIoIo {
                public O0I0oiO1I I00iOIl;
                public O0I0oiO1I I00iiI;
                public OOoOI1lIOi I00iiO;

                public final IOIOill I00000oIO() {
                    Ill0IO ill0IO;
/* 3 */             O0I0oiO1I o0I0oiO1I = this.I00iOIl;
/* 5 */             String str = o0I0oiO1I.I00000oIO;
/* 9 */             int iLastIndexOf = str.lastIndexOf("/");
/* 16 */            if (iLastIndexOf == -1) {
/* 18 */                ill0IO = Ill0IO.I0000Il00O;
/* 20 */                if (ill0IO == null) {
/* 25 */                    O0I0oiO1I.I00000oIO(9);
/* 29 */                    throw null;
                        }
                    } else {
/* 43 */                ill0IO = new Ill0IO(str.substring(0, iLastIndexOf).replace('/', '.'));
                    }
/* 47 */            String strI0000O = o0I0oiO1I.I0000O();
/* 59 */            return new IOIOill(ill0IO, OI1Iio0ii1.I0000oI00(OlOoOIi0o.I00O0i0ii('/', strI0000O, strI0000O)));
                }

                @Override
                public final String I000O01llI0() {
/* 22 */            return IlIi0I0.I000oI1ioi(new StringBuilder("Class '"), I00000oIO().I00000oIO().I00000oIO.I00000oIO, '\'');
                }

                public final String toString() {
/* 22 */            return O0I1l1l.class.getSimpleName() + ": " + this.I00iOIl;
                }
            }

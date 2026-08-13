            package p000;

            import kotlin.jvm.functions.Function1;
            
            public final class IiOOlOlI1I0 implements Function1 {
                public final int I00iOIl;
                public IiOOllOI0io I00iiI;

                public IiOOlOlI1I0(int i) {
/* 1 */             this.I00iOIl = i;
                }

                @Override
                public final Object invoke(Object obj) {
/* 1 */             int i = this.I00iOIl;
/* 3 */             IiOOllOI0io iiOOllOI0io = this.I00iiI;
                    switch (i) {
                        case 0:
/* 15 */                    OoOi1Ol ooOi1Ol = (OoOi1Ol) obj;
/* 21 */                    if (ooOi1Ol.I0000Il00O()) {
/* 23 */                        return "*";
                            }
/* 30 */                    String strI00OIl = iiOOllOI0io.I00OIl(ooOi1Ol.I00000oOI());
/* 40 */                    if (ooOi1Ol.I00000oIO() == Ooo0Ioii0o0.I00iiO) {
/* 67 */                        return strI00OIl;
                            }
/* 63 */                    return ooOi1Ol.I00000oIO() + ' ' + strI00OIl;
                        default:
/* 10 */                    return iiOOllOI0io.I00OIl((O0iIl1) obj);
                    }
                }
            }

            package p000;

            import java.util.HashMap;
            
            public final class il00IloliiI implements Il0IIIOll {
                public static final iIOo0oiIi1 I0000O = new iIOo0oiIi1(23);
                public static final l0iO10io0IOO I0000oI00 = new l0iO10io0IOO(1);
                public final int I00000oIO;
                public HashMap I00000oOI;
                public HashMap I0000Il00O;

                @Override
                public final Il0IIIOll registerEncoder(Class cls, OIOi0lOI oIOi0lOI) {
                    switch (this.I00000oIO) {
                        case 0:
/* 19 */                    this.I00000oOI.put(cls, oIOi0lOI);
/* 24 */                    this.I0000Il00O.remove(cls);
                            break;
                        default:
/* 8 */                     this.I00000oOI.put(cls, oIOi0lOI);
/* 13 */                    this.I0000Il00O.remove(cls);
                            break;
                    }
/* 16 */            return this;
                }
            }

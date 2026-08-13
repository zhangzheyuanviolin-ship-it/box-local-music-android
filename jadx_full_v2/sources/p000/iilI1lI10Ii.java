            package p000;

            import java.util.HashMap;
            
            public final class iilI1lI10Ii implements Il0IIIOll {
                public static final iIOo0oiIi1 I0000O = new iIOo0oiIi1(19);
                public static final iIOo0oiIi1 I0000oI00 = new iIOo0oiIi1(27);
                public static final l0iO10io0IOO I0001Ioi1lo = new l0iO10io0IOO(5);
                public final int I00000oIO;
                public HashMap I00000oOI;
                public HashMap I0000Il00O;

                public iilI1lI10Ii(int i) {
/* 1 */             this.I00000oIO = i;
                }

                @Override
                public final Il0IIIOll registerEncoder(Class cls, OIOi0lOI oIOi0lOI) {
                    switch (this.I00000oIO) {
                        case 0:
/* 63 */                    this.I00000oOI.put(cls, oIOi0lOI);
/* 68 */                    this.I0000Il00O.remove(cls);
                            break;
                        case 1:
/* 52 */                    this.I00000oOI.put(cls, oIOi0lOI);
/* 57 */                    this.I0000Il00O.remove(cls);
                            break;
                        case 2:
/* 41 */                    this.I00000oOI.put(cls, oIOi0lOI);
/* 46 */                    this.I0000Il00O.remove(cls);
                            break;
                        case 3:
/* 30 */                    this.I00000oOI.put(cls, oIOi0lOI);
/* 35 */                    this.I0000Il00O.remove(cls);
                            break;
                        case 4:
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

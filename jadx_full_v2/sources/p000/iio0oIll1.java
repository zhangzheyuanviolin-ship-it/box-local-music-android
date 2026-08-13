            package p000;

            import java.util.HashMap;
            
            public final class iio0oIll1 implements Il0IIIOll {
                public static final iIOo0oiIi1 I0000O = new iIOo0oiIi1(21);
                public static final l0iO10io0IOO I0000oI00 = new l0iO10io0IOO(0);
                public static final l0iO10io0IOO I0001Ioi1lo = new l0iO10io0IOO(7);
                public final int I00000oIO;
                public HashMap I00000oOI;
                public HashMap I0000Il00O;

                public iio0oIll1(int i) {
/* 1 */             this.I00000oIO = i;
                }

                @Override
                public final Il0IIIOll registerEncoder(Class cls, OIOi0lOI oIOi0lOI) {
                    switch (this.I00000oIO) {
                        case 0:
/* 30 */                    this.I00000oOI.put(cls, oIOi0lOI);
/* 35 */                    this.I0000Il00O.remove(cls);
                            break;
                        case 1:
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

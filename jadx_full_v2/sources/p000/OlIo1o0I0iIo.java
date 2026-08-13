            package p000;

            import java.util.ArrayList;
            import java.util.Map;
            
            public final class OlIo1o0I0iIo extends OoOIlIi1 {
                public final int I0000Il00O;
                public Object I0000O;

                public OlIo1o0I0iIo(int i) {
/* 1 */             this.I0000Il00O = i;
                }

                @Override
                public boolean I00000oIO() {
                    switch (this.I0000Il00O) {
                        case 1:
/* 11 */                    return false;
                        default:
/* 6 */                     return super.I00000oIO();
                    }
                }

                @Override
                public boolean I0000oI00() {
                    switch (this.I0000Il00O) {
                        case 1:
/* 15 */                    return ((Map) this.I0000O).isEmpty();
                        default:
/* 6 */                     return super.I0000oI00();
                    }
                }

                @Override
                public final OoOi1Ol I000II(OoOIOoO1I ooOIOoO1I) {
                    switch (this.I0000Il00O) {
                        case 0:
/* 25 */                    if (((ArrayList) this.I0000O).contains(ooOIOoO1I)) {
/* 33 */                        return OoOilo0Oliii.I000iOII((OoOOiO) ooOIOoO1I.I00100o1O0lo());
                            }
/* 38 */                    return null;
                        default:
/* 14 */                    return (OoOi1Ol) ((Map) this.I0000O).get(ooOIOoO1I);
                    }
                }
            }

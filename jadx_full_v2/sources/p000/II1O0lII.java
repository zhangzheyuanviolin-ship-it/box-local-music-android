            package p000;

            import java.util.Set;
            import kotlin.jvm.functions.Function1;
            
            public final class II1O0lII implements Function1 {
                public final int I00iOIl;
                public float I00iiI;
                public float I00iiO;
                public Object I00iio;

                public II1O0lII(int i) {
/* 1 */             this.I00iOIl = i;
                }

                @Override
                public final Object invoke(Object obj) {
                    boolean z;
/* 1 */             int i = this.I00iOIl;
/* 3 */             OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
                    switch (i) {
                        case 0:
/* 30 */                    float f = this.I00iiI;
/* 34 */                    Ol010000lo00 ol010000lo00 = (Ol010000lo00) this.I00iio;
/* 36 */                    float f2 = this.I00iiO;
/* 38 */                    Iill00 iill00 = (Iill00) obj;
/* 42 */                    iill00.I00000oIO(Ol010l0o0O.I00iOIl, f);
/* 45 */                    Set set = ol010000lo00.I00000oIO;
/* 47 */                    Ol010l0o0O ol010l0o0O = Ol010l0o0O.I00iiO;
/* 53 */                    if (set.contains(ol010l0o0O) && ((z = ol010000lo00.I0000O) || f2 > f / 2.0f)) {
/* 80 */                        iill00.I00000oIO(ol010l0o0O, f - (z ? Math.min(f / 2.0f, f2) : f / 2.0f));
                            }
/* 86 */                    if (f2 != 0.0f) {
/* 96 */                        iill00.I00000oIO(Ol010l0o0O.I00iiI, Math.max(0.0f, f - f2));
                                break;
                            }
                            break;
                        default:
/* 2 */                     ((OO11o0IO) obj).I000O01llI0((OO1I0001000i) this.I00iio, Math.round(this.I00iiI), Math.round(this.I00iiO), 0.0f);
                            break;
                    }
/* 29 */            return ooiIlOl1iI;
                }
            }

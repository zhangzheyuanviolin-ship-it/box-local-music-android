            package p000;

            import kotlin.jvm.functions.Function1;
            
            public final class II1O1Oi0l0 implements Function1 {
                public final int I00iOIl;
                public Ol010000lo00 I00iiI;

                public II1O1Oi0l0(int i) {
/* 1 */             this.I00iOIl = i;
                }

                @Override
                public final Object invoke(Object obj) {
/* 1 */             int i = this.I00iOIl;
/* 3 */             OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
/* 15 */            Ol010000lo00 ol010000lo00 = this.I00iiI;
                    switch (i) {
                        case 0:
/* 145 */                   ((Float) obj).getClass();
                            break;
                        case 1:
/* 81 */                    Oi11lOiIoi oi11lOiIoi = (Oi11lOiIoi) obj;
/* 83 */                    I0l1OOl1l10 i0l1OOl1l10 = ol010000lo00.I0000oI00;
/* 89 */                    float fI000II = ((OIooO1iiliI) i0l1OOl1l10.I000l1).I000II();
/* 97 */                    float fI0000oI00 = i0l1OOl1l10.I0000Il00O().I0000oI00();
/* 107 */                   float f = fI000II < fI0000oI00 ? fI0000oI00 - fI000II : 0.0f;
/* 132 */                   oi11lOiIoi.I000l1(f > 0.0f ? (Float.intBitsToFloat((int) (oi11lOiIoi.I00oI0i & 4294967295L)) + f) / Float.intBitsToFloat((int) (oi11lOiIoi.I00oI0i & 4294967295L)) : 1.0f);
/* 139 */                   oi11lOiIoi.I001iOo1i0O(lOo0o0.I00000oIO(0.5f, 0.0f));
                            break;
                        default:
/* 20 */                    Oi11lOiIoi oi11lOiIoi2 = (Oi11lOiIoi) obj;
/* 22 */                    I0l1OOl1l10 i0l1OOl1l102 = ol010000lo00.I0000oI00;
/* 28 */                    float fI000II2 = ((OIooO1iiliI) i0l1OOl1l102.I000l1).I000II();
/* 36 */                    float fI0000oI002 = i0l1OOl1l102.I0000Il00O().I0000oI00();
/* 46 */                    float f2 = fI000II2 < fI0000oI002 ? fI0000oI002 - fI000II2 : 0.0f;
/* 70 */                    oi11lOiIoi2.I000l1(f2 > 0.0f ? 1.0f / ((Float.intBitsToFloat((int) (oi11lOiIoi2.I00oI0i & 4294967295L)) + f2) / Float.intBitsToFloat((int) (4294967295L & oi11lOiIoi2.I00oI0i))) : 1.0f);
/* 77 */                    oi11lOiIoi2.I001iOo1i0O(lOo0o0.I00000oIO(0.5f, 0.0f));
                            break;
                    }
/* 80 */            return ooiIlOl1iI;
                }
            }

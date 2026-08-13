            package p000;

            import kotlin.jvm.functions.Function1;
            
            public final class I10lIO extends O0iO10011II implements Function1 {
                public final int I00iOIl;
                public final I10li01 I00iiI;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public I10lIO(I10li01 i10li01, int i) {
/* 6 */             super(1);
/* 1 */             this.I00iOIl = i;
/* 3 */             this.I00iiI = i10li01;
                }

                @Override
                public final Object invoke(Object obj) {
/* 1 */             int i = this.I00iOIl;
/* 3 */             OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
/* 12 */            I10li01 i10li01 = this.I00iiI;
                    switch (i) {
                        case 0:
/* 73 */                    OO11o0IO.I000OiO((OO11o0IO) obj, i10li01.I00oIiI10, i10li01.I00oI0i.I00000oOI.I00000oIO((r0.I00iOIl << 32) | (4294967295L & r0.I00iiI), i10li01.I00oOio10iI1, O0iOOoiioO.I00iOIl));
                            break;
                        default:
/* 43 */                    OO11o0IO.I000OiO((OO11o0IO) obj, i10li01.I00oII, i10li01.I00oI0i.I00000oOI.I00000oIO((r0.I00iOIl << 32) | (4294967295L & r0.I00iiI), i10li01.I00oO101o, O0iOOoiioO.I00iOIl));
                            break;
                    }
/* 46 */            return ooiIlOl1iI;
                }
            }

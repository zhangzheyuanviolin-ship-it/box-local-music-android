            package p000;

            import java.lang.invoke.VarHandle;
            import kotlin.jvm.functions.Function1;
            
            public final class I10iiiO1l0lo extends O0iO10011II implements Function1 {
                public final int I00iOIl;
                public final Object I00iiI;
                public final Object I00iiO;
                public final Object I00iio;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public I10iiiO1l0lo(Object obj, Object obj2, Object obj3, int i) {
/* 10 */            super(1);
/* 1 */             this.I00iOIl = i;
/* 3 */             this.I00iiI = obj;
/* 5 */             this.I00iiO = obj2;
/* 7 */             this.I00iio = obj3;
                }

                @Override
                public final Object invoke(Object obj) {
/* 1 */             int i = this.I00iOIl;
/* 3 */             Object obj2 = this.I00iio;
/* 5 */             Object obj3 = this.I00iiO;
/* 7 */             Object obj4 = this.I00iiI;
                    switch (i) {
                        case 0:
/* 56 */                    I01oiO0OI0 i01oiO0OI0 = new I01oiO0OI0(1);
/* 59 */                    i01oiO0OI0.I00000oOI = (Ol1o0O0O0) obj4;
/* 61 */                    i01oiO0OI0.I0000Il00O = obj3;
/* 63 */                    i01oiO0OI0.I0000O = (I10llI0II11l) obj2;
/* 65 */                    VarHandle.storeStoreFence();
/* 68 */                    return i01oiO0OI0;
                        default:
/* 12 */                    OO11o0IO oO11o0IO = (OO11o0IO) obj;
/* 14 */                    O0iOOo0Ii o0iOOo0IiI0000Il00O = oO11o0IO.I0000Il00O();
/* 18 */                    if (o0iOOo0IiI0000Il00O != null) {
/* 22 */                        boolean zI00OloOo = ((O1iOIoOiO0) obj4).I00OloOo();
/* 28 */                        Oiool011li oiool011li = ((Ol000oOO0) obj3).I00o0iI0io1;
/* 30 */                        if (zI00OloOo) {
/* 35 */                            oiool011li.I00ilO0 = o0iOOo0IiI0000Il00O;
                                } else {
/* 32 */                            oiool011li.I00ilI0I1 = o0iOOo0IiI0000Il00O;
                                }
                            }
/* 41 */                    oO11o0IO.I000O01llI0((OO1I0001000i) obj2, 0, 0, 0.0f);
/* 44 */                    return OoiIlOl1iI.I00000oIO;
                    }
                }
            }

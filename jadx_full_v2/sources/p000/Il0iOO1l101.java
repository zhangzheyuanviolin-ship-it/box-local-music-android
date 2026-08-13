            package p000;

            import kotlin.jvm.functions.Function1;
            
            public final class Il0iOO1l101 extends O0iO10011II implements Function1 {
                public final int I00iOIl;
                public final Function1 I00iiI;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public Il0iOO1l101(int i, Function1 function1) {
/* 6 */             super(1);
/* 1 */             this.I00iOIl = i;
/* 3 */             this.I00iiI = function1;
                }

                @Override
                public final Object invoke(Object obj) {
/* 1 */             int i = this.I00iOIl;
/* 10 */            Function1 function1 = this.I00iiI;
                    switch (i) {
                        case 0:
/* 118 */                   return IooO0O.I00000oIO(((Number) function1.invoke(Integer.valueOf((int) (((IooOl0ol01) obj).I00000oIO >> 32)))).intValue() << 32);
                        case 1:
/* 91 */                    return IooO0O.I00000oIO(((Number) function1.invoke(Integer.valueOf((int) (((IooOl0ol01) obj).I00000oIO & 4294967295L)))).intValue() & 4294967295L);
                        case 2:
/* 64 */                    return IooO0O.I00000oIO(((Number) function1.invoke(Integer.valueOf((int) (((IooOl0ol01) obj).I00000oIO >> 32)))).intValue() << 32);
                        default:
/* 37 */                    return IooO0O.I00000oIO(((Number) function1.invoke(Integer.valueOf((int) (((IooOl0ol01) obj).I00000oIO & 4294967295L)))).intValue() & 4294967295L);
                    }
                }
            }

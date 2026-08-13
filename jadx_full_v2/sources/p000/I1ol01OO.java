            package p000;

            import java.lang.invoke.VarHandle;
            import kotlin.jvm.functions.Function1;
            
            public final class I1ol01OO implements Function1 {
                public final int I00iOIl;
                public Oo0io0 I00iiI;
                public Function1 I00iiO;

                public I1ol01OO(int i) {
/* 1 */             this.I00iOIl = i;
                }

                @Override
                public final Object invoke(Object obj) {
                    switch (this.I00iOIl) {
                        case 0:
/* 32 */                    Oo0io0 oo0io0 = this.I00iiI;
/* 34 */                    Function1 function1 = this.I00iiO;
/* 36 */                    Oo0iil0o0oI oo0iil0o0oI = (Oo0iil0o0oI) obj;
/* 38 */                    if (oo0io0 != null) {
/* 42 */                        oo0io0.I00000oIO.setValue(oo0iil0o0oI);
                            }
/* 45 */                    if (function1 != null) {
/* 47 */                        function1.invoke(oo0iil0o0oI);
                            }
/* 50 */                    return OoiIlOl1iI.I00000oIO;
                        default:
/* 6 */                     Oo0io0 oo0io02 = this.I00iiI;
/* 8 */                     Function1 function12 = this.I00iiO;
/* 14 */                    oo0io02.I0000Il00O.add(function12);
/* 21 */                    I1loO00 i1loO00 = new I1loO00(12);
/* 24 */                    i1loO00.I00000oOI = oo0io02;
/* 26 */                    i1loO00.I0000Il00O = function12;
/* 28 */                    VarHandle.storeStoreFence();
/* 31 */                    return i1loO00;
                    }
                }
            }

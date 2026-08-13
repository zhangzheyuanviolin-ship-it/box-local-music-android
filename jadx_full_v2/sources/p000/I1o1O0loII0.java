            package p000;

            import kotlin.jvm.functions.Function1;
            
            public final class I1o1O0loII0 implements Function1 {
                public final int I00iOIl;
                public IIoOoIol0Io0 I00iiI;

                public I1o1O0loII0(int i) {
/* 1 */             this.I00iOIl = i;
                }

                @Override
                public final Object invoke(Object obj) {
/* 1 */             int i = this.I00iOIl;
/* 3 */             OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
                    switch (i) {
                        case 0:
/* 18 */                    this.I00iiI.resumeWith(obj);
                            break;
                        default:
/* 12 */                    this.I00iiI.resumeWith(ooiIlOl1iI);
                            break;
                    }
/* 15 */            return ooiIlOl1iI;
                }
            }

            package p000;

            import kotlin.jvm.functions.Function1;
            
            public final class Ioo0l1 implements Function1 {
                public final int I00iOIl;
                public Ioo0liiIOl I00iiI;

                public Ioo0l1(int i) {
/* 1 */             this.I00iOIl = i;
                }

                @Override
                public final Object invoke(Object obj) {
/* 1 */             int i = this.I00iOIl;
/* 3 */             Ioo0liiIOl ioo0liiIOl = this.I00iiI;
/* 5 */             OoIOloiIii ooIOloiIii = (OoIOloiIii) obj;
                    switch (i) {
                        case 0:
/* 19 */                    Ioo0liiIOl ioo0liiIOl2 = (Ioo0liiIOl) ooIOloiIii;
/* 21 */                    i00O0OOIlOO i00o0ooiloo = ioo0liiIOl.I00o0l1o1o0;
/* 29 */                    if (!O0000Ioio00.I0000O(ioo0liiIOl2.I00o0iI0io1, i00o0ooiloo)) {
/* 31 */                        ioo0liiIOl2.I00o0iI0io1 = i00o0ooiloo;
/* 33 */                        ioo0liiIOl2.I010l1ol111();
                            }
/* 36 */                    return OoIOloOIOI1l.I00iiI;
                        default:
/* 14 */                    ioo0liiIOl.I00o0iI0io1 = ((Ioo0liiIOl) ooIOloiIii).I00o0l1o1o0;
/* 16 */                    return Boolean.FALSE;
                    }
                }
            }

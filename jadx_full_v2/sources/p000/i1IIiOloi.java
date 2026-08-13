            package p000;

            import java.lang.invoke.VarHandle;
            import java.util.concurrent.Callable;
            
            public final class i1IIiOloi implements Callable {
                public final int I00000oIO;
                public iil1iIlO I00000oOI;

                @Override
                public final Object call() {
                    switch (this.I00000oIO) {
                        case 0:
/* 28 */                    OlilOlOiI olilOlOiI = this.I00000oOI.I0000Il00O;
/* 33 */                    l1oo00Iio10 l1oo00iio10 = new l1oo00Iio10("internal.eventLogger", 0);
/* 36 */                    l1oo00iio10.I00iio = olilOlOiI;
/* 38 */                    VarHandle.storeStoreFence();
/* 41 */                    return l1oo00iio10;
                        default:
/* 10 */                    OoOlO1O0o ooOlO1O0o = this.I00000oOI.I0000O;
/* 15 */                    l1oo00Iio10 l1oo00iio102 = new l1oo00Iio10("internal.registerCallback", 4);
/* 18 */                    l1oo00iio102.I00iio = ooOlO1O0o;
/* 20 */                    VarHandle.storeStoreFence();
/* 23 */                    return l1oo00iio102;
                    }
                }
            }

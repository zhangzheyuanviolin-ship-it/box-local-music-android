            package p000;

            import java.lang.invoke.VarHandle;
            import java.util.Collections;
            import java.util.List;
            
            public final class O0I0OoOi implements IllOOo00lI {
                public final int I00iOIl;
                public O0I0iO0I1iI I00iiI;

                public O0I0OoOi(int i) {
/* 1 */             this.I00iOIl = i;
                }

                @Override
                public final Object invoke() {
/* 1 */             int i = this.I00iOIl;
/* 3 */             O0I0iO0I1iI o0I0iO0I1iI = this.I00iiI;
                    switch (i) {
                        case 0:
/* 31 */                    List listSingletonList = Collections.singletonList(I11IO1Io.I00000oIO(o0I0iO0I1iI.I00iOIl.I00iio, "This member is not fully supported by Kotlin compiler, so it may be absent or have different signature in next major version", "", "WARNING"));
/* 39 */                    if (listSingletonList.isEmpty()) {
/* 41 */                        return i1i0olI.I00iiO;
                            }
/* 46 */                    I11Io0oil0i0 i11Io0oil0i0 = new I11Io0oil0i0();
/* 49 */                    i11Io0oil0i0.I00iiI = listSingletonList;
/* 51 */                    VarHandle.storeStoreFence();
/* 54 */                    return i11Io0oil0i0;
                        default:
/* 12 */                    return o0I0iO0I1iI.I00iOIl.I00iio.I0000oI00();
                    }
                }
            }

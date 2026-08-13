            package p000;

            import java.lang.invoke.VarHandle;
            import java.util.List;
            
            public final class I00lli11 implements IllOOo00lI {
                public final int I00iOIl;
                public I00lll10 I00iiI;

                public I00lli11(int i) {
/* 1 */             this.I00iOIl = i;
                }

                @Override
                public final Object invoke() {
                    switch (this.I00iOIl) {
                        case 0:
/* 47 */                    I00lll10 i00lll10 = this.I00iiI;
/* 49 */                    O1iil1I01o o1iil1I01oI00l0OO0IO = i00lll10.I00l0OO0IO();
/* 56 */                    I00iiI i00iiI = new I00iiI(1);
/* 59 */                    i00iiI.I00iiI = this;
/* 61 */                    VarHandle.storeStoreFence();
/* 64 */                    Il0oo01OllO0 il0oo01OllO0 = OoOilo0Oliii.I00000oIO;
/* 70 */                    if (Il0ooiloI.I0000oI00(i00lll10)) {
/* 82 */                        return Il0ooiloI.I00000oOI(Il0ooO1IO.I00li1OI, i00lll10.toString());
                            }
/* 87 */                    OoOIOoO1I ooOIOoO1II000OOo1O = i00lll10.I000OOo1O();
/* 92 */                    if (ooOIOoO1II000OOo1O == null) {
/* 125 */                       OoOilo0Oliii.I00000oIO(12);
/* 128 */                       throw null;
                            }
/* 94 */                    if (o1iil1I01oI00l0OO0IO == null) {
/* 119 */                       OoOilo0Oliii.I00000oIO(13);
/* 122 */                       throw null;
                            }
/* 100 */                   List listI0000O = OoOilo0Oliii.I0000O(ooOIOoO1II000OOo1O.I000II());
/* 106 */                   OoOI1i1i.I00iiI.getClass();
/* 112 */                   return l0loOIIo0iOo.I0000oI00(OoOI1i1i.I00iiO, ooOIOoO1II000OOo1O, listI0000O, false, o1iil1I01oI00l0OO0IO, i00iiI);
                        case 1:
/* 43 */                    return new IollllOOIol(this.I00iiI.I00l0OO0IO());
                        default:
/* 8 */                     I00lll10 i00lll102 = this.I00iiI;
/* 14 */                    O0ioOi0Oo1ii o0ioOi0Oo1ii = new O0ioOi0Oo1ii(i1i0olI.I00iiO, OlIIoO0Ol0o1.I0000O);
/* 17 */                    o0ioOi0Oo1ii.I00iio = i00lll102;
/* 21 */                    IoioOiO1 ioioOiO1 = new IoioOiO1();
/* 24 */                    ioioOiO1.I00iOIl = i00lll102;
/* 26 */                    VarHandle.storeStoreFence();
/* 29 */                    o0ioOi0Oo1ii.I00ilI0I1 = ioioOiO1;
/* 31 */                    VarHandle.storeStoreFence();
/* 34 */                    return o0ioOi0Oo1ii;
                    }
                }
            }

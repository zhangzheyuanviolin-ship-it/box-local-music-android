            package p000;

            import com.google.ai.edge.gallery.data.RuntimeType;
            
            public final class IiIo0O00 implements IllOOo00lI {
                public final int I00iOIl;
                public O1ol100o0O I00iiI;
                public O1oIOiI11o0 I00iiO;
                public OI10i0Il I00iio;

                public IiIo0O00(int i) {
/* 1 */             this.I00iOIl = i;
                }

                @Override
                public final Object invoke() {
/* 1 */             int i = this.I00iOIl;
/* 6 */             OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
                    switch (i) {
                        case 0:
/* 96 */                    O1ol100o0O o1ol100o0O = this.I00iiI;
/* 98 */                    O1oIOiI11o0 o1oIOiI11o0 = this.I00iiO;
/* 100 */                   OI10i0Il oI10i0Il = this.I00iio;
/* 102 */                   o1ol100o0O.I000oI1ioi(o1oIOiI11o0);
/* 107 */                   oI10i0Il.setValue(Boolean.FALSE);
                            break;
                        case 1:
/* 55 */                    O1ol100o0O o1ol100o0O2 = this.I00iiI;
/* 57 */                    O1oIOiI11o0 o1oIOiI11o02 = this.I00iiO;
/* 61 */                    Iil0O0iOiIil.I00000oOI(this.I00iio, false);
/* 64 */                    o1ol100o0O2.getClass();
/* 71 */                    if (o1oIOiI11o02.I00100l0 != RuntimeType.AICORE) {
/* 92 */                        o1ol100o0O2.I00000oOI.I0000Il00O.I00000oIO("modelName:" + o1oIOiI11o02.I00000oIO);
                                break;
                            }
                            break;
                        default:
/* 11 */                    O1ol100o0O o1ol100o0O3 = this.I00iiI;
/* 13 */                    O1oIOiI11o0 o1oIOiI11o03 = this.I00iiO;
/* 17 */                    Iil0O0iOiIil.I00000oOI(this.I00iio, false);
/* 20 */                    o1ol100o0O3.getClass();
/* 27 */                    if (o1oIOiI11o03.I00100l0 != RuntimeType.AICORE) {
/* 48 */                        o1ol100o0O3.I00000oOI.I0000Il00O.I00000oIO("modelName:" + o1oIOiI11o03.I00000oIO);
/* 51 */                        o1ol100o0O3.I000oI1ioi(o1oIOiI11o03);
                                break;
                            }
                            break;
                    }
/* 54 */            return ooiIlOl1iI;
                }
            }

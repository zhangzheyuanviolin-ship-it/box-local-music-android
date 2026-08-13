            package p000;

            import android.content.Context;
            import android.net.Uri;
            import kotlin.jvm.functions.Function1;
            
            public final class IlI00o0Ioi implements Function1 {
                public final int I00iOIl;
                public IlI1loI1lO1 I00iiI;
                public Context I00iiO;
                public O1oIOiI11o0 I00iio;

                @Override
                public final Object invoke(Object obj) {
/* 1 */             int i = this.I00iOIl;
/* 3 */             OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
                    switch (i) {
                        case 0:
/* 56 */                    IlI1loI1lO1 ilI1loI1lO1 = this.I00iiI;
/* 58 */                    Context context = this.I00iiO;
/* 60 */                    O1oIOiI11o0 o1oIOiI11o0 = this.I00iio;
/* 63 */                    Uri uri = (Uri) obj;
/* 65 */                    if (uri != null) {
/* 67 */                        Object obj2 = o1oIOiI11o0.I00IlilI0i0i;
/* 77 */                        IlI00iOi1 ilI00iOi1 = obj2 instanceof IlI00iOi1 ? (IlI00iOi1) obj2 : null;
/* 78 */                        if (ilI00iOi1 != null) {
/* 96 */                            iOi1II01i0.I0000O(OooiooIOO.I00000oIO(ilI1loI1lO1), IiiIil1lOIO.I00000oIO, null, new IlI10l0(ilI1loI1lO1, context, uri, ilI00iOi1, (IOoil1iiIilo) null), 2);
                                    break;
                                } else {
/* 80 */                            ilI1loI1lO1.I000O01llI0("Model not ready");
                                    break;
                                }
                            }
                            break;
                        default:
/* 12 */                    IlI1loI1lO1 ilI1loI1lO12 = this.I00iiI;
/* 14 */                    Context context2 = this.I00iiO;
/* 16 */                    O1oIOiI11o0 o1oIOiI11o02 = this.I00iio;
/* 19 */                    Uri uri2 = (Uri) obj;
/* 21 */                    if (uri2 != null) {
/* 23 */                        Object obj3 = o1oIOiI11o02.I00IlilI0i0i;
/* 33 */                        IlI00iOi1 ilI00iOi12 = obj3 instanceof IlI00iOi1 ? (IlI00iOi1) obj3 : null;
/* 34 */                        if (ilI00iOi12 != null) {
/* 52 */                            iOi1II01i0.I0000O(OooiooIOO.I00000oIO(ilI1loI1lO12), IiiIil1lOIO.I00000oIO, null, new IlI1OOiIO0(ilI1loI1lO12, context2, uri2, ilI00iOi12, null), 2);
                                    break;
                                } else {
/* 36 */                            ilI1loI1lO12.I000O01llI0("Model not ready");
                                    break;
                                }
                            }
                            break;
                    }
/* 55 */            return ooiIlOl1iI;
                }
            }

            package p000;

            import android.content.Context;
            
            public final class O1lI0i1ili implements IllOOo00lI {
                public final int I00iOIl;
                public Context I00iiI;
                public IllOOo00lI I00iiO;
                public O1OIi1 I00iio;

                @Override
                public final Object invoke() throws Exception {
/* 1 */             int i = this.I00iOIl;
/* 3 */             OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
                    switch (i) {
                        case 0:
/* 30 */                    Context context = this.I00iiI;
/* 32 */                    IllOOo00lI illOOo00lI = this.I00iiO;
/* 34 */                    O1OIi1 o1OIi1 = this.I00iio;
/* 42 */                    if (iOI10i0I11.I00000oIO(context, "android.permission.RECORD_AUDIO") != 0) {
/* 48 */                        o1OIi1.I00000oIO("android.permission.RECORD_AUDIO");
                                break;
                            } else {
/* 44 */                        illOOo00lI.invoke();
                                break;
                            }
                        default:
/* 8 */                     Context context2 = this.I00iiI;
/* 10 */                    IllOOo00lI illOOo00lI2 = this.I00iiO;
/* 12 */                    O1OIi1 o1OIi12 = this.I00iio;
/* 20 */                    if (iOI10i0I11.I00000oIO(context2, "android.permission.CAMERA") != 0) {
/* 26 */                        o1OIi12.I00000oIO("android.permission.CAMERA");
                                break;
                            } else {
/* 22 */                        illOOo00lI2.invoke();
                                break;
                            }
                    }
/* 29 */            return ooiIlOl1iI;
                }
            }

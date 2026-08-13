            package p000;

            import android.content.Context;
            import android.content.Intent;
            import android.net.Uri;
            import kotlin.jvm.functions.Function1;
            
/* 12 */    public final class IloOl0lo1o11 implements Function1 {
                public final int I00iOIl = 0;
                public Ii0110 I00iiI;
                public Context I00iiO;
                public OI10i0Il I00iio;

                public IloOl0lo1o11(Ii0110 ii0110, Context context, OI10i0Il oI10i0Il) {
/* 7 */             this.I00iiI = ii0110;
/* 9 */             this.I00iiO = context;
/* 11 */            this.I00iio = oI10i0Il;
                }

                @Override
                public final Object invoke(Object obj) {
                    Intent intent;
                    Uri data;
/* 1 */             int i = this.I00iOIl;
/* 3 */             OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
                    switch (i) {
                        case 0:
/* 48 */                    Ii0110 ii0110 = this.I00iiI;
/* 50 */                    Context context = this.I00iiO;
/* 52 */                    OI10i0Il oI10i0Il = this.I00iio;
/* 55 */                    Uri uri = (Uri) obj;
/* 57 */                    if (uri != null) {
/* 68 */                        iOi1II01i0.I0000O(ii0110, null, null, new I0iOI0o1i(context, uri, oI10i0Il, (IOoil1iiIilo) null, 24), 3);
                                break;
                            }
                            break;
                        default:
/* 8 */                     Ii0110 ii01102 = this.I00iiI;
/* 10 */                    Context context2 = this.I00iiO;
/* 12 */                    OI10i0Il oI10i0Il2 = this.I00iio;
/* 14 */                    I0IIOOO1O i0iiooo1o = (I0IIOOO1O) obj;
/* 19 */                    if (i0iiooo1o.I00iOIl == -1 && (intent = i0iiooo1o.I00iiI) != null && (data = intent.getData()) != null) {
/* 31 */                        IiI0oillOO10 iiI0oillOO10 = IiiIil1lOIO.I00000oIO;
/* 44 */                        iOi1II01i0.I0000O(ii01102, Ii1oo1ooill0.I00iiI, null, new IiI110i1O(context2, data, oI10i0Il2, null, 23), 2);
                                break;
                            }
                            break;
                    }
/* 47 */            return ooiIlOl1iI;
                }

/* 13 */        public IloOl0lo1o11() {
                }
            }

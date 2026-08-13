            package p000;

            import android.content.Context;
            import android.widget.Toast;
            import java.util.List;
            
            public final class IO1OI110o1 extends Oll0io implements IlliIl1l11O {
                public final int I00iOIl;
                public final Context I00iiI;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public IO1OI110o1(Context context, IOoil1iiIilo iOoil1iiIilo, int i) {
/* 6 */             super(2, iOoil1iiIilo);
/* 1 */             this.I00iOIl = i;
/* 3 */             this.I00iiI = context;
                }

                @Override
                public final IOoil1iiIilo create(Object obj, IOoil1iiIilo iOoil1iiIilo) {
                    switch (this.I00iOIl) {
                        case 0:
/* 29 */                    return new IO1OI110o1(this.I00iiI, iOoil1iiIilo, 0);
                        case 1:
/* 20 */                    return new IO1OI110o1(this.I00iiI, iOoil1iiIilo, 1);
                        default:
/* 11 */                    return new IO1OI110o1(this.I00iiI, iOoil1iiIilo, 2);
                    }
                }

                @Override
                public final Object invoke(Object obj, Object obj2) throws Throwable {
/* 1 */             int i = this.I00iOIl;
/* 3 */             OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
/* 5 */             Ii0110 ii0110 = (Ii0110) obj;
/* 7 */             IOoil1iiIilo iOoil1iiIilo = (IOoil1iiIilo) obj2;
                    switch (i) {
                        case 0:
/* 38 */                    ((IO1OI110o1) create(ii0110, iOoil1iiIilo)).invokeSuspend(ooiIlOl1iI);
                            break;
                        case 1:
/* 28 */                    ((IO1OI110o1) create(ii0110, iOoil1iiIilo)).invokeSuspend(ooiIlOl1iI);
                            break;
                        default:
/* 18 */                    ((IO1OI110o1) create(ii0110, iOoil1iiIilo)).invokeSuspend(ooiIlOl1iI);
                            break;
                    }
/* 21 */            return ooiIlOl1iI;
                }

                @Override
                public final Object invokeSuspend(Object obj) throws Throwable {
/* 1 */             int i = this.I00iOIl;
/* 5 */             OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
/* 8 */             Context context = this.I00iiI;
                    switch (i) {
                        case 0:
/* 65 */                    Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 67 */                    lIoii1l01l0i.I00000oOI(obj);
/* 74 */                    Toast.makeText(context, "Export failed", 0).show();
                            break;
                        case 1:
/* 52 */                    Ii0111o ii0111o2 = Ii0111o.I00iOIl;
/* 54 */                    lIoii1l01l0i.I00000oOI(obj);
/* 61 */                    Toast.makeText(context, "Export failed", 0).show();
                            break;
                        default:
/* 13 */                    Ii0111o ii0111o3 = Ii0111o.I00iOIl;
/* 15 */                    lIoii1l01l0i.I00000oOI(obj);
/* 18 */                    List list = OI1OO1oo.I00000oIO;
/* 22 */                    if (!OI1OO1oo.I0000Il00O) {
/* 45 */                        OI1OO1oo.I00000oOI.setValue(Long.valueOf(context.getSharedPreferences("nano_vision_prefs", 0).getLong("refresh_interval_ms", 500L)));
/* 49 */                        OI1OO1oo.I0000Il00O = true;
                                break;
                            }
                            break;
                    }
/* 51 */            return ooiIlOl1iI;
                }
            }

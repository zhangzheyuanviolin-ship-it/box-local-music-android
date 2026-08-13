            package p000;

            import kotlin.jvm.functions.Function3;
            
            public final class IillI1lo11l0 extends Oll0io implements Function3 {
                public final int I00iOIl;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public IillI1lo11l0(int i, IOoil1iiIilo iOoil1iiIilo, int i2) {
/* 3 */             super(i, iOoil1iiIilo);
/* 1 */             this.I00iOIl = i2;
                }

                @Override
                public final Object invoke(Object obj, Object obj2, Object obj3) throws Throwable {
/* 1 */             int i = this.I00iOIl;
/* 3 */             OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
/* 5 */             int i2 = 3;
                    switch (i) {
                        case 0:
/* 66 */                    long j = ((OIOlIiiioi) obj2).I00000oIO;
/* 76 */                    new IillI1lo11l0(i2, (IOoil1iiIilo) obj3, 0).invokeSuspend(ooiIlOl1iI);
/* 79 */                    return ooiIlOl1iI;
                        case 1:
/* 47 */                    ((Number) obj2).floatValue();
/* 58 */                    new IillI1lo11l0(i2, (IOoil1iiIilo) obj3, 1).invokeSuspend(ooiIlOl1iI);
/* 61 */                    return ooiIlOl1iI;
                        case 2:
/* 38 */                    return new IillI1lo11l0(i2, (IOoil1iiIilo) obj3, 2).invokeSuspend(ooiIlOl1iI);
                        default:
/* 13 */                    long j2 = ((OIOlIiiioi) obj2).I00000oIO;
/* 22 */                    new IillI1lo11l0(i2, (IOoil1iiIilo) obj3, i2).invokeSuspend(ooiIlOl1iI);
/* 25 */                    return ooiIlOl1iI;
                    }
                }

                @Override
                public final Object invokeSuspend(Object obj) throws Throwable {
/* 1 */             int i = this.I00iOIl;
/* 3 */             OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
                    switch (i) {
                        case 0:
/* 31 */                    Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 33 */                    lIoii1l01l0i.I00000oOI(obj);
/* 36 */                    return ooiIlOl1iI;
                        case 1:
/* 25 */                    Ii0111o ii0111o2 = Ii0111o.I00iOIl;
/* 27 */                    lIoii1l01l0i.I00000oOI(obj);
/* 30 */                    return ooiIlOl1iI;
                        case 2:
/* 14 */                    Ii0111o ii0111o3 = Ii0111o.I00iOIl;
/* 16 */                    lIoii1l01l0i.I00000oOI(obj);
/* 21 */                    return new Il01l1iIl();
                        default:
/* 8 */                     Ii0111o ii0111o4 = Ii0111o.I00iOIl;
/* 10 */                    lIoii1l01l0i.I00000oOI(obj);
/* 13 */                    return ooiIlOl1iI;
                    }
                }
            }

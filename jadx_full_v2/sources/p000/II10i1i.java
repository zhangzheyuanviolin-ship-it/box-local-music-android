            package p000;

            import java.util.concurrent.CancellationException;
            import kotlin.jvm.functions.Function3;
            
/* 8 */     public final class II10i1i extends Oll0io implements Function3 {
                public final int I00iOIl;
                public Object I00iiI;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public II10i1i(Object obj, IOoil1iiIilo iOoil1iiIilo, int i) {
/* 6 */             super(3, iOoil1iiIilo);
/* 1 */             this.I00iOIl = i;
/* 3 */             this.I00iiI = obj;
                }

                @Override
                public final Object invoke(Object obj, Object obj2, Object obj3) throws Throwable {
/* 1 */             int i = this.I00iOIl;
/* 3 */             int i2 = 3;
/* 4 */             OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
                    switch (i) {
                        case 0:
/* 78 */                    II10i1i iI10i1i = new II10i1i(i2, (IOoil1iiIilo) obj3, 0);
/* 81 */                    iI10i1i.I00iiI = (IoO10oI0o) obj;
/* 83 */                    iI10i1i.invokeSuspend(ooiIlOl1iI);
                            break;
                        case 1:
/* 65 */                    new II10i1i((OOo0l0ii10l) this.I00iiI, (IOoil1iiIilo) obj3, 1).invokeSuspend(ooiIlOl1iI);
                            break;
                        case 2:
/* 40 */                    II10i1i iI10i1i2 = new II10i1i(i2, (IOoil1iiIilo) obj3, 2);
/* 43 */                    iI10i1i2.I00iiI = (Throwable) obj2;
/* 45 */                    iI10i1i2.invokeSuspend(ooiIlOl1iI);
                            break;
                        default:
/* 13 */                    ((Number) obj2).floatValue();
/* 27 */                    new II10i1i((Ol111o0) this.I00iiI, (IOoil1iiIilo) obj3, i2).invokeSuspend(ooiIlOl1iI);
                            break;
                    }
/* 30 */            return ooiIlOl1iI;
                }

                @Override
                public final Object invokeSuspend(Object obj) throws Throwable {
/* 1 */             int i = this.I00iOIl;
/* 3 */             OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
                    switch (i) {
                        case 0:
/* 78 */                    IoO10oI0o ioO10oI0o = (IoO10oI0o) this.I00iiI;
/* 80 */                    Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 82 */                    lIoii1l01l0i.I00000oOI(obj);
/* 93 */                    if (ioO10oI0o.I0001Ioi1lo.I0000O(II10iIII.I00000oIO) == null) {
/* 99 */                        return null;
                            }
/* 96 */                    OIiilo1Ool0o.I00000oIO();
/* 99 */                    return null;
                        case 1:
/* 63 */                    Ii0111o ii0111o2 = Ii0111o.I00iOIl;
/* 65 */                    lIoii1l01l0i.I00000oOI(obj);
/* 73 */                    ((OOo0l0ii10l) this.I00iiI).I00iOIl = true;
/* 75 */                    return ooiIlOl1iI;
                        case 2:
/* 25 */                    Throwable th = (Throwable) this.I00iiI;
/* 27 */                    Ii0111o ii0111o3 = Ii0111o.I00iOIl;
/* 29 */                    lIoii1l01l0i.I00000oOI(obj);
/* 34 */                    if (th instanceof CancellationException) {
/* 36 */                        return ooiIlOl1iI;
                            }
/* 37 */                    O1I1OOiol o1I1OOiol = OiIOOIOIo.I00000oIO;
/* 43 */                    if (!o1I1OOiol.I000II()) {
/* 62 */                        throw th;
                            }
/* 59 */                    o1I1OOiol.I000o00OoI0I("Error during SSE session processing: " + th);
/* 62 */                    throw th;
                        default:
/* 8 */                     Ii0111o ii0111o4 = Ii0111o.I00iOIl;
/* 10 */                    lIoii1l01l0i.I00000oOI(obj);
/* 19 */                    ((Ol111o0) this.I00iiI).I00100o1O0lo.invoke();
/* 22 */                    return ooiIlOl1iI;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
/* 9 */         public II10i1i(int i, IOoil1iiIilo iOoil1iiIilo, int i2) {
                    super(i, iOoil1iiIilo);
/* 10 */            this.I00iOIl = i2;
                }
            }

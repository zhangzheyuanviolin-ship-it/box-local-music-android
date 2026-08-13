            package p000;

            import java.lang.invoke.VarHandle;
            import java.util.List;
            import kotlin.jvm.functions.Function3;
            
/* 8 */     public final class IOIllll extends Oll0io implements Function3 {
                public final int I00iOIl;
                public int I00iiI;
                public Object I00iiO;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public IOIllll(Object obj, IOoil1iiIilo iOoil1iiIilo, int i) {
/* 6 */             super(3, iOoil1iiIilo);
/* 1 */             this.I00iOIl = i;
/* 3 */             this.I00iiO = obj;
                }

                @Override
                public final Object invoke(Object obj, Object obj2, Object obj3) {
/* 1 */             int i = this.I00iOIl;
/* 3 */             OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
                    switch (i) {
                        case 0:
/* 67 */                    return new IOIllll((IOIo001i1o) this.I00iiO, (IOoil1iiIilo) obj3, 0).invokeSuspend(ooiIlOl1iI);
                        case 1:
/* 46 */                    return new IOIllll((Ii1OIIlOi) this.I00iiO, (IOoil1iiIilo) obj3, 1).invokeSuspend(ooiIlOl1iI);
                        default:
/* 12 */                    ((Boolean) obj2).getClass();
/* 20 */                    IOIllll iOIllll = new IOIllll(3, (IOoil1iiIilo) obj3);
/* 23 */                    iOIllll.I00iiO = (IlIi00o) obj;
/* 25 */                    return iOIllll.invokeSuspend(ooiIlOl1iI);
                    }
                }

                @Override
                public final Object invokeSuspend(Object obj) throws Throwable {
/* 6 */             IOoil1iiIilo iOoil1iiIilo = null;
                    switch (this.I00iOIl) {
                        case 0:
/* 103 */                   Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 105 */                   int i = this.I00iiI;
/* 107 */                   if (i != 0) {
/* 109 */                       if (i == 1) {
/* 111 */                           lIoii1l01l0i.I00000oOI(obj);
/* 160 */                           return obj;
                                }
/* 115 */                       I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 6 */                         return null;
                            }
/* 120 */                   lIoii1l01l0i.I00000oOI(obj);
/* 125 */                   IOIo001i1o iOIo001i1o = (IOIo001i1o) this.I00iiO;
/* 127 */                   this.I00iiI = 1;
/* 129 */                   int i2 = IOIo001i1o.I0010I0i;
/* 141 */                   List listI00iIi0i1o = IOOi0Ool1i.I00iIi0i1o(((I01Ii0ll10O) ((OO0oOlOi1) iOIo001i1o.I00100o1O0lo)).I0000O());
/* 147 */                   O10l1101 o10l1101 = new O10l1101();
/* 150 */                   o10l1101.I00000oIO = listI00iIi0i1o;
/* 152 */                   o10l1101.I00000oOI = null;
/* 154 */                   VarHandle.storeStoreFence();
                            return o10l1101 == ii0111o ? ii0111o : o10l1101;
                        case 1:
/* 67 */                    Ii0111o ii0111o2 = Ii0111o.I00iOIl;
/* 69 */                    int i3 = this.I00iiI;
/* 71 */                    if (i3 == 0) {
/* 83 */                        lIoii1l01l0i.I00000oOI(obj);
/* 88 */                        Ii1OIIlOi ii1OIIlOi = (Ii1OIIlOi) this.I00iiO;
/* 90 */                        this.I00iiI = 1;
/* 96 */                        if (ii1OIIlOi.I00000oOI(this) == ii0111o2) {
/* 98 */                            return ii0111o2;
                                }
                            } else {
/* 73 */                        if (i3 != 1) {
/* 79 */                            I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 6 */                             return null;
                                }
/* 75 */                        lIoii1l01l0i.I00000oOI(obj);
                            }
/* 100 */                   return OoiIlOl1iI.I00000oIO;
                        default:
/* 10 */                    Ii0111o ii0111o3 = Ii0111o.I00iOIl;
/* 12 */                    int i4 = this.I00iiI;
/* 14 */                    if (i4 == 0) {
/* 27 */                        lIoii1l01l0i.I00000oOI(obj);
/* 32 */                        IlIi00o ilIi00o = (IlIi00o) this.I00iiO;
/* 34 */                        this.I00iiI = 1;
/* 42 */                        if (!ilIi00o.I0000Il00O.get()) {
/* 52 */                            Object objI00000oIO = ilOIl0o0.I00000oIO(ilIi00o.I00000oIO, new I0l11loiOIl(ilIi00o, iOoil1iiIilo, 4), this);
                                    return objI00000oIO == ii0111o3 ? ii0111o3 : objI00000oIO;
                                }
/* 62 */                        I000II.I001IO000("This scope has already been closed.");
                            } else {
/* 16 */                        if (i4 == 1) {
/* 18 */                            lIoii1l01l0i.I00000oOI(obj);
/* 66 */                            return obj;
                                }
/* 22 */                        I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
                            }
/* 6 */                     return null;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
/* 9 */         public IOIllll(int i, IOoil1iiIilo iOoil1iiIilo) {
                    super(i, iOoil1iiIilo);
/* 10 */            this.I00iOIl = 2;
                }
            }

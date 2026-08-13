            package p000;

            import java.lang.invoke.VarHandle;
            
            public final class IOoolOIio0lO extends Oll0io implements IlliIl1l11O {
                public final int I00iOIl;
                public int I00iiI;
                public final OO1io0l0 I00iiO;
                public final OlooOo I00iio;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public IOoolOIio0lO(OO1io0l0 oO1io0l0, OlooOo olooOo, IOoil1iiIilo iOoil1iiIilo, int i) {
/* 8 */             super(2, iOoil1iiIilo);
/* 1 */             this.I00iOIl = i;
/* 3 */             this.I00iiO = oO1io0l0;
/* 5 */             this.I00iio = olooOo;
                }

                @Override
                public final IOoil1iiIilo create(Object obj, IOoil1iiIilo iOoil1iiIilo) {
                    switch (this.I00iOIl) {
                        case 0:
/* 35 */                    return new IOoolOIio0lO(this.I00iiO, this.I00iio, iOoil1iiIilo, 0);
                        case 1:
/* 24 */                    return new IOoolOIio0lO(this.I00iiO, this.I00iio, iOoil1iiIilo, 1);
                        default:
/* 13 */                    return new IOoolOIio0lO(this.I00iiO, this.I00iio, iOoil1iiIilo, 2);
                    }
                }

                @Override
                public final Object invoke(Object obj, Object obj2) {
/* 1 */             int i = this.I00iOIl;
/* 3 */             OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
/* 5 */             Ii0110 ii0110 = (Ii0110) obj;
/* 7 */             IOoil1iiIilo iOoil1iiIilo = (IOoil1iiIilo) obj2;
                    switch (i) {
                    }
/* 18 */            return ((IOoolOIio0lO) create(ii0110, iOoil1iiIilo)).invokeSuspend(ooiIlOl1iI);
                }

                @Override
                public final Object invokeSuspend(Object obj) throws Throwable {
/* 1 */             int i = this.I00iOIl;
/* 3 */             OO1io0l0 oO1io0l0 = this.I00iiO;
/* 6 */             OlooOo olooOo = this.I00iio;
/* 10 */            OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
                    switch (i) {
                        case 0:
/* 136 */                   Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 138 */                   int i2 = this.I00iiI;
/* 140 */                   if (i2 == 0) {
/* 153 */                       lIoii1l01l0i.I00000oOI(obj);
/* 156 */                       this.I00iiI = 1;
                                return l11Il1.I00000oIO(oO1io0l0, olooOo, this) == ii0111o ? ii0111o : ooiIlOl1iI;
                            }
/* 142 */                   if (i2 == 1) {
/* 144 */                       lIoii1l01l0i.I00000oOI(obj);
/* 165 */                       return ooiIlOl1iI;
                            }
/* 148 */                   I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 12 */                    return null;
                        case 1:
/* 96 */                    Ii0111o ii0111o2 = Ii0111o.I00iOIl;
/* 98 */                    int i3 = this.I00iiI;
/* 100 */                   if (i3 != 0) {
/* 102 */                       if (i3 == 1) {
/* 104 */                           lIoii1l01l0i.I00000oOI(obj);
/* 134 */                           return ooiIlOl1iI;
                                }
/* 108 */                       I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 12 */                        return null;
                            }
/* 113 */                   lIoii1l01l0i.I00000oOI(obj);
/* 116 */                   this.I00iiI = 1;
/* 123 */                   Object objI0000Il00O = ililI0.I0000Il00O(oO1io0l0, new Il1ii1000(olooOo, null, 2), this);
/* 127 */                   if (objI0000Il00O != ii0111o2) {
/* 130 */                       objI0000Il00O = ooiIlOl1iI;
                            }
                            return objI0000Il00O == ii0111o2 ? ii0111o2 : ooiIlOl1iI;
                        default:
/* 17 */                    Ii0111o ii0111o3 = Ii0111o.I00iOIl;
/* 19 */                    int i4 = this.I00iiI;
/* 21 */                    if (i4 != 0) {
/* 23 */                        if (i4 == 1) {
/* 25 */                            lIoii1l01l0i.I00000oOI(obj);
/* 94 */                            return ooiIlOl1iI;
                                }
/* 29 */                        I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 12 */                        return null;
                            }
/* 34 */                    lIoii1l01l0i.I00000oOI(obj);
/* 37 */                    this.I00iiI = 1;
/* 42 */                    O1IOi0li o1IOi0li = new O1IOi0li(0);
/* 45 */                    o1IOi0li.I00iiI = olooOo;
/* 47 */                    VarHandle.storeStoreFence();
/* 52 */                    O1IOi100li o1IOi100li = new O1IOi100li(0);
/* 55 */                    o1IOi100li.I00iiI = olooOo;
/* 57 */                    VarHandle.storeStoreFence();
/* 62 */                    O1IOi100li o1IOi100li2 = new O1IOi100li(1);
/* 65 */                    o1IOi100li2.I00iiI = olooOo;
/* 67 */                    VarHandle.storeStoreFence();
/* 72 */                    O1IIii o1IIii = new O1IIii(2);
/* 75 */                    o1IIii.I00iiI = olooOo;
/* 77 */                    VarHandle.storeStoreFence();
/* 83 */                    Object objI0001Ioi1lo = IilOo0l01l.I0001Ioi1lo(this.I00iiO, o1IOi0li, o1IOi100li, o1IOi100li2, o1IIii, this);
/* 87 */                    if (objI0001Ioi1lo != ii0111o3) {
/* 90 */                        objI0001Ioi1lo = ooiIlOl1iI;
                            }
                            return objI0001Ioi1lo == ii0111o3 ? ii0111o3 : ooiIlOl1iI;
                    }
                }
            }

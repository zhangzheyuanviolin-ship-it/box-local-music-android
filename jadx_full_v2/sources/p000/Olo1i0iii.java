            package p000;
            
            public final class Olo1i0iii extends Oll0io implements IlliIl1l11O {
                public final int I00iOIl;
                public int I00iiI;
                public final OOIII0OOoOi1 I00iiO;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public Olo1i0iii(OOIII0OOoOi1 oOIII0OOoOi1, IOoil1iiIilo iOoil1iiIilo, int i) {
/* 6 */             super(2, iOoil1iiIilo);
/* 1 */             this.I00iOIl = i;
/* 3 */             this.I00iiO = oOIII0OOoOi1;
                }

                @Override
                public final IOoil1iiIilo create(Object obj, IOoil1iiIilo iOoil1iiIilo) {
/* 1 */             int i = this.I00iOIl;
/* 3 */             OOIII0OOoOi1 oOIII0OOoOi1 = this.I00iiO;
                    switch (i) {
                        case 0:
/* 18 */                    return new Olo1i0iii(oOIII0OOoOi1, iOoil1iiIilo, 0);
                        default:
/* 11 */                    return new Olo1i0iii(oOIII0OOoOi1, iOoil1iiIilo, 1);
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
/* 18 */            return ((Olo1i0iii) create(ii0110, iOoil1iiIilo)).invokeSuspend(ooiIlOl1iI);
                }

                @Override
                public final Object invokeSuspend(Object obj) throws Throwable {
/* 1 */             int i = this.I00iOIl;
/* 3 */             OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
/* 5 */             OOIII0OOoOi1 oOIII0OOoOi1 = this.I00iiO;
                    switch (i) {
                        case 0:
/* 44 */                    Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 46 */                    int i2 = this.I00iiI;
/* 48 */                    if (i2 == 0) {
/* 61 */                        lIoii1l01l0i.I00000oOI(obj);
/* 64 */                        this.I00iiI = 1;
                                return oOIII0OOoOi1.I0001Ioi1lo(this) == ii0111o ? ii0111o : ooiIlOl1iI;
                            }
/* 50 */                    if (i2 == 1) {
/* 52 */                        lIoii1l01l0i.I00000oOI(obj);
/* 73 */                        return ooiIlOl1iI;
                            }
/* 56 */                    I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 7 */                     return null;
                        default:
/* 14 */                    Ii0111o ii0111o2 = Ii0111o.I00iOIl;
/* 16 */                    int i3 = this.I00iiI;
/* 18 */                    if (i3 == 0) {
/* 31 */                        lIoii1l01l0i.I00000oOI(obj);
/* 34 */                        this.I00iiI = 1;
                                return oOIII0OOoOi1.I0001Ioi1lo(this) == ii0111o2 ? ii0111o2 : ooiIlOl1iI;
                            }
/* 20 */                    if (i3 == 1) {
/* 22 */                        lIoii1l01l0i.I00000oOI(obj);
/* 43 */                        return ooiIlOl1iI;
                            }
/* 26 */                    I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 7 */                     return null;
                    }
                }
            }

            package p000;
            
            public final class IiIi0II extends Oll0io implements IlliIl1l11O {
                public final int I00iOIl;
                public int I00iiI;
                public final IiIi1o I00iiO;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public IiIi0II(IiIi1o iiIi1o, IOoil1iiIilo iOoil1iiIilo, int i) {
/* 6 */             super(2, iOoil1iiIilo);
/* 1 */             this.I00iOIl = i;
/* 3 */             this.I00iiO = iiIi1o;
                }

                @Override
                public final IOoil1iiIilo create(Object obj, IOoil1iiIilo iOoil1iiIilo) {
/* 1 */             int i = this.I00iOIl;
/* 3 */             IiIi1o iiIi1o = this.I00iiO;
                    switch (i) {
                        case 0:
/* 25 */                    return new IiIi0II(iiIi1o, iOoil1iiIilo, 0);
                        case 1:
/* 18 */                    return new IiIi0II(iiIi1o, iOoil1iiIilo, 1);
                        default:
/* 11 */                    return new IiIi0II(iiIi1o, iOoil1iiIilo, 2);
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
/* 18 */            return ((IiIi0II) create(ii0110, iOoil1iiIilo)).invokeSuspend(ooiIlOl1iI);
                }

                @Override
                public final Object invokeSuspend(Object obj) throws Throwable {
/* 1 */             int i = this.I00iOIl;
/* 3 */             IiIi1o iiIi1o = this.I00iiO;
                    switch (i) {
                        case 0:
/* 92 */                    Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 94 */                    int i2 = this.I00iiI;
/* 96 */                    if (i2 != 0) {
/* 98 */                        if (i2 == 1) {
/* 100 */                           lIoii1l01l0i.I00000oOI(obj);
/* 125 */                           return obj;
                                }
/* 104 */                       I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 5 */                         return null;
                            }
/* 109 */                   lIoii1l01l0i.I00000oOI(obj);
/* 112 */                   OolI1lo oolI1loI000o00OoI0I = iiIi1o.I000o00OoI0I();
/* 116 */                   this.I00iiI = 1;
/* 118 */                   Object objI0000oI00 = oolI1loI000o00OoI0I.I0000oI00(this);
                            return objI0000oI00 == ii0111o ? ii0111o : objI0000oI00;
                        case 1:
/* 52 */                    Ii0111o ii0111o2 = Ii0111o.I00iOIl;
/* 54 */                    int i3 = this.I00iiI;
/* 56 */                    if (i3 != 0) {
/* 58 */                        if (i3 == 1) {
/* 60 */                            lIoii1l01l0i.I00000oOI(obj);
/* 91 */                            return obj;
                                }
/* 64 */                        I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 5 */                         return null;
                            }
/* 69 */                    lIoii1l01l0i.I00000oOI(obj);
/* 76 */                    IiIOI1ol0o iiIOI1ol0oI000lI = iiIi1o.I000o00OoI0I().I000lI();
/* 80 */                    this.I00iiI = 1;
/* 84 */                    Object objI0010o = ((IOi10loi) iiIOI1ol0oI000lI).I0010o(this);
                            return objI0010o == ii0111o2 ? ii0111o2 : objI0010o;
                        default:
/* 12 */                    Ii0111o ii0111o3 = Ii0111o.I00iOIl;
/* 14 */                    int i4 = this.I00iiI;
/* 16 */                    if (i4 != 0) {
/* 18 */                        if (i4 == 1) {
/* 20 */                            lIoii1l01l0i.I00000oOI(obj);
/* 51 */                            return obj;
                                }
/* 24 */                        I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 5 */                         return null;
                            }
/* 29 */                    lIoii1l01l0i.I00000oOI(obj);
/* 36 */                    IiIOI1ol0o iiIOI1ol0oI00000oOI = iiIi1o.I000o00OoI0I().I00000oOI();
/* 40 */                    this.I00iiI = 1;
/* 44 */                    Object objI0010o2 = ((IOi10loi) iiIOI1ol0oI00000oOI).I0010o(this);
                            return objI0010o2 == ii0111o3 ? ii0111o3 : objI0010o2;
                    }
                }
            }

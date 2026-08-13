            package p000;
            
            public final class IoI0iiIi extends Oll0io implements IlliIl1l11O {
                public final int I00iOIl;
                public int I00iiI;
                public final IiloOlIoIool I00iiO;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public IoI0iiIi(IiloOlIoIool iiloOlIoIool, IOoil1iiIilo iOoil1iiIilo, int i) {
/* 6 */             super(2, iOoil1iiIilo);
/* 1 */             this.I00iOIl = i;
/* 3 */             this.I00iiO = iiloOlIoIool;
                }

                @Override
                public final IOoil1iiIilo create(Object obj, IOoil1iiIilo iOoil1iiIilo) {
/* 1 */             int i = this.I00iOIl;
/* 3 */             IiloOlIoIool iiloOlIoIool = this.I00iiO;
                    switch (i) {
                        case 0:
/* 53 */                    return new IoI0iiIi(iiloOlIoIool, iOoil1iiIilo, 0);
                        case 1:
/* 46 */                    return new IoI0iiIi(iiloOlIoIool, iOoil1iiIilo, 1);
                        case 2:
/* 39 */                    return new IoI0iiIi(iiloOlIoIool, iOoil1iiIilo, 2);
                        case 3:
/* 32 */                    return new IoI0iiIi(iiloOlIoIool, iOoil1iiIilo, 3);
                        case 4:
/* 25 */                    return new IoI0iiIi(iiloOlIoIool, iOoil1iiIilo, 4);
                        case 5:
/* 18 */                    return new IoI0iiIi(iiloOlIoIool, iOoil1iiIilo, 5);
                        default:
/* 11 */                    return new IoI0iiIi(iiloOlIoIool, iOoil1iiIilo, 6);
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
/* 18 */            return ((IoI0iiIi) create(ii0110, iOoil1iiIilo)).invokeSuspend(ooiIlOl1iI);
                }

                @Override
                public final Object invokeSuspend(Object obj) throws Throwable {
/* 1 */             int i = this.I00iOIl;
/* 3 */             OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
/* 5 */             IiloOlIoIool iiloOlIoIool = this.I00iiO;
                    switch (i) {
                        case 0:
/* 230 */                   Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 232 */                   int i2 = this.I00iiI;
/* 234 */                   if (i2 == 0) {
/* 247 */                       lIoii1l01l0i.I00000oOI(obj);
/* 250 */                       this.I00iiI = 1;
                                return iiloOlIoIool.I00000oOI(this) == ii0111o ? ii0111o : ooiIlOl1iI;
                            }
/* 236 */                   if (i2 == 1) {
/* 238 */                       lIoii1l01l0i.I00000oOI(obj);
/* 259 */                       return ooiIlOl1iI;
                            }
/* 242 */                   I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 7 */                     return null;
                        case 1:
/* 200 */                   Ii0111o ii0111o2 = Ii0111o.I00iOIl;
/* 202 */                   int i3 = this.I00iiI;
/* 204 */                   if (i3 == 0) {
/* 217 */                       lIoii1l01l0i.I00000oOI(obj);
/* 220 */                       this.I00iiI = 1;
                                return iiloOlIoIool.I00000oOI(this) == ii0111o2 ? ii0111o2 : ooiIlOl1iI;
                            }
/* 206 */                   if (i3 == 1) {
/* 208 */                       lIoii1l01l0i.I00000oOI(obj);
/* 229 */                       return ooiIlOl1iI;
                            }
/* 212 */                   I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 7 */                     return null;
                        case 2:
/* 170 */                   Ii0111o ii0111o3 = Ii0111o.I00iOIl;
/* 172 */                   int i4 = this.I00iiI;
/* 174 */                   if (i4 == 0) {
/* 187 */                       lIoii1l01l0i.I00000oOI(obj);
/* 190 */                       this.I00iiI = 1;
                                return iiloOlIoIool.I00000oOI(this) == ii0111o3 ? ii0111o3 : ooiIlOl1iI;
                            }
/* 176 */                   if (i4 == 1) {
/* 178 */                       lIoii1l01l0i.I00000oOI(obj);
/* 199 */                       return ooiIlOl1iI;
                            }
/* 182 */                   I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 7 */                     return null;
                        case 3:
/* 104 */                   Ii0111o ii0111o4 = Ii0111o.I00iOIl;
/* 106 */                   int i5 = this.I00iiI;
/* 109 */                   if (i5 != 0) {
/* 111 */                       if (i5 == 1 || i5 == 2) {
/* 115 */                           lIoii1l01l0i.I00000oOI(obj);
/* 169 */                           return ooiIlOl1iI;
                                }
/* 119 */                       I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 7 */                         return null;
                            }
/* 124 */                   lIoii1l01l0i.I00000oOI(obj);
/* 141 */                   if (((IiloiO) ((OIooliIO0) iiloOlIoIool.I00000oOI.I000O01llI0).getValue()) == IiloiO.I00iOIl) {
/* 143 */                       this.I00iiI = 1;
/* 149 */                       Object objI00000oIO = IiloOlIoIool.I00000oIO(iiloOlIoIool, IiloiO.I00iiI, iiloOlIoIool.I0000O, this);
/* 153 */                       if (objI00000oIO != ii0111o4) {
/* 156 */                           objI00000oIO = ooiIlOl1iI;
                                }
/* 157 */                       if (objI00000oIO != ii0111o4) {
/* 169 */                           return ooiIlOl1iI;
                                }
                            } else {
/* 160 */                       this.I00iiI = 2;
/* 166 */                       if (iiloOlIoIool.I00000oOI(this) != ii0111o4) {
/* 169 */                           return ooiIlOl1iI;
                                }
                            }
/* 168 */                   return ii0111o4;
                        case 4:
/* 74 */                    Ii0111o ii0111o5 = Ii0111o.I00iOIl;
/* 76 */                    int i6 = this.I00iiI;
/* 78 */                    if (i6 == 0) {
/* 91 */                        lIoii1l01l0i.I00000oOI(obj);
/* 94 */                        this.I00iiI = 1;
                                return iiloOlIoIool.I00000oOI(this) == ii0111o5 ? ii0111o5 : ooiIlOl1iI;
                            }
/* 80 */                    if (i6 == 1) {
/* 82 */                        lIoii1l01l0i.I00000oOI(obj);
/* 103 */                       return ooiIlOl1iI;
                            }
/* 86 */                    I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 7 */                     return null;
                        case 5:
/* 44 */                    Ii0111o ii0111o6 = Ii0111o.I00iOIl;
/* 46 */                    int i7 = this.I00iiI;
/* 48 */                    if (i7 == 0) {
/* 61 */                        lIoii1l01l0i.I00000oOI(obj);
/* 64 */                        this.I00iiI = 1;
                                return iiloOlIoIool.I00000oOI(this) == ii0111o6 ? ii0111o6 : ooiIlOl1iI;
                            }
/* 50 */                    if (i7 == 1) {
/* 52 */                        lIoii1l01l0i.I00000oOI(obj);
/* 73 */                        return ooiIlOl1iI;
                            }
/* 56 */                    I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 7 */                     return null;
                        default:
/* 14 */                    Ii0111o ii0111o7 = Ii0111o.I00iOIl;
/* 16 */                    int i8 = this.I00iiI;
/* 18 */                    if (i8 == 0) {
/* 31 */                        lIoii1l01l0i.I00000oOI(obj);
/* 34 */                        this.I00iiI = 1;
                                return iiloOlIoIool.I00000oOI(this) == ii0111o7 ? ii0111o7 : ooiIlOl1iI;
                            }
/* 20 */                    if (i8 == 1) {
/* 22 */                        lIoii1l01l0i.I00000oOI(obj);
/* 43 */                        return ooiIlOl1iI;
                            }
/* 26 */                    I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 7 */                     return null;
                    }
                }
            }

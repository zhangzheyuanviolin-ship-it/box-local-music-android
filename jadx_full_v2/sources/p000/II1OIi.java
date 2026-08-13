            package p000;

            import kotlin.jvm.functions.Function1;
            
            public final class II1OIi extends Oll0io implements IlliIl1l11O {
                public final int I00iOIl;
                public int I00iiI;
                public final Ol010000lo00 I00iiO;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public II1OIi(Ol010000lo00 ol010000lo00, IOoil1iiIilo iOoil1iiIilo, int i) {
/* 6 */             super(2, iOoil1iiIilo);
/* 1 */             this.I00iOIl = i;
/* 3 */             this.I00iiO = ol010000lo00;
                }

                @Override
                public final IOoil1iiIilo create(Object obj, IOoil1iiIilo iOoil1iiIilo) {
/* 1 */             int i = this.I00iOIl;
/* 3 */             Ol010000lo00 ol010000lo00 = this.I00iiO;
                    switch (i) {
                        case 0:
/* 84 */                    return new II1OIi(ol010000lo00, iOoil1iiIilo, 0);
                        case 1:
/* 77 */                    return new II1OIi(ol010000lo00, iOoil1iiIilo, 1);
                        case 2:
/* 70 */                    return new II1OIi(ol010000lo00, iOoil1iiIilo, 2);
                        case 3:
/* 63 */                    return new II1OIi(ol010000lo00, iOoil1iiIilo, 3);
                        case 4:
/* 56 */                    return new II1OIi(ol010000lo00, iOoil1iiIilo, 4);
                        case 5:
/* 49 */                    return new II1OIi(ol010000lo00, iOoil1iiIilo, 5);
                        case 6:
/* 42 */                    return new II1OIi(ol010000lo00, iOoil1iiIilo, 6);
                        case 7:
/* 35 */                    return new II1OIi(ol010000lo00, iOoil1iiIilo, 7);
                        case 8:
/* 28 */                    return new II1OIi(ol010000lo00, iOoil1iiIilo, 8);
                        case 9:
/* 20 */                    return new II1OIi(ol010000lo00, iOoil1iiIilo, 9);
                        default:
/* 12 */                    return new II1OIi(ol010000lo00, iOoil1iiIilo, 10);
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
/* 18 */            return ((II1OIi) create(ii0110, iOoil1iiIilo)).invokeSuspend(ooiIlOl1iI);
                }

                @Override
                public final Object invokeSuspend(Object obj) throws Throwable {
                    Object objI00000oOI;
                    Object objI00000oOI2;
/* 1 */             int i = this.I00iOIl;
/* 3 */             OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
/* 5 */             Ol010000lo00 ol010000lo00 = this.I00iiO;
                    switch (i) {
                        case 0:
/* 358 */                   Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 360 */                   int i2 = this.I00iiI;
/* 362 */                   if (i2 == 0) {
/* 375 */                       lIoii1l01l0i.I00000oOI(obj);
/* 378 */                       this.I00iiI = 1;
                                return ol010000lo00.I0001Ioi1lo(this) == ii0111o ? ii0111o : ooiIlOl1iI;
                            }
/* 364 */                   if (i2 == 1) {
/* 366 */                       lIoii1l01l0i.I00000oOI(obj);
/* 387 */                       return ooiIlOl1iI;
                            }
/* 370 */                   I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 7 */                     return null;
                        case 1:
/* 328 */                   Ii0111o ii0111o2 = Ii0111o.I00iOIl;
/* 330 */                   int i3 = this.I00iiI;
/* 332 */                   if (i3 == 0) {
/* 345 */                       lIoii1l01l0i.I00000oOI(obj);
/* 348 */                       this.I00iiI = 1;
                                return ol010000lo00.I0000O(this) == ii0111o2 ? ii0111o2 : ooiIlOl1iI;
                            }
/* 334 */                   if (i3 == 1) {
/* 336 */                       lIoii1l01l0i.I00000oOI(obj);
/* 357 */                       return ooiIlOl1iI;
                            }
/* 340 */                   I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 7 */                     return null;
                        case 2:
/* 276 */                   Ii0111o ii0111o3 = Ii0111o.I00iOIl;
/* 278 */                   int i4 = this.I00iiI;
/* 280 */                   if (i4 != 0) {
/* 282 */                       if (i4 == 1) {
/* 284 */                           lIoii1l01l0i.I00000oOI(obj);
/* 327 */                           return ooiIlOl1iI;
                                }
/* 288 */                       I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 7 */                         return null;
                            }
/* 293 */                   lIoii1l01l0i.I00000oOI(obj);
/* 296 */                   this.I00iiI = 1;
/* 298 */                   Function1 function1 = ol010000lo00.I0000Il00O;
/* 300 */                   Ol010l0o0O ol010l0o0O = Ol010l0o0O.I00iiI;
/* 312 */                   if (!((Boolean) function1.invoke(ol010l0o0O)).booleanValue() || (objI00000oOI = ol010000lo00.I00000oOI(ol010l0o0O, ol010000lo00.I0001Ioi1lo, this)) != ii0111o3) {
/* 323 */                       objI00000oOI = ooiIlOl1iI;
                            }
                            return objI00000oOI == ii0111o3 ? ii0111o3 : ooiIlOl1iI;
                        case 3:
/* 246 */                   Ii0111o ii0111o4 = Ii0111o.I00iOIl;
/* 248 */                   int i5 = this.I00iiI;
/* 250 */                   if (i5 == 0) {
/* 263 */                       lIoii1l01l0i.I00000oOI(obj);
/* 266 */                       this.I00iiI = 1;
                                return ol010000lo00.I000II(this) == ii0111o4 ? ii0111o4 : ooiIlOl1iI;
                            }
/* 252 */                   if (i5 == 1) {
/* 254 */                       lIoii1l01l0i.I00000oOI(obj);
/* 275 */                       return ooiIlOl1iI;
                            }
/* 258 */                   I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 7 */                     return null;
                        case 4:
/* 194 */                   Ii0111o ii0111o5 = Ii0111o.I00iOIl;
/* 196 */                   int i6 = this.I00iiI;
/* 198 */                   if (i6 != 0) {
/* 200 */                       if (i6 == 1) {
/* 202 */                           lIoii1l01l0i.I00000oOI(obj);
/* 245 */                           return ooiIlOl1iI;
                                }
/* 206 */                       I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 7 */                         return null;
                            }
/* 211 */                   lIoii1l01l0i.I00000oOI(obj);
/* 214 */                   this.I00iiI = 1;
/* 216 */                   Function1 function12 = ol010000lo00.I0000Il00O;
/* 218 */                   Ol010l0o0O ol010l0o0O2 = Ol010l0o0O.I00iiI;
/* 230 */                   if (!((Boolean) function12.invoke(ol010l0o0O2)).booleanValue() || (objI00000oOI2 = ol010000lo00.I00000oOI(ol010l0o0O2, ol010000lo00.I0001Ioi1lo, this)) != ii0111o5) {
/* 241 */                       objI00000oOI2 = ooiIlOl1iI;
                            }
                            return objI00000oOI2 == ii0111o5 ? ii0111o5 : ooiIlOl1iI;
                        case 5:
/* 164 */                   Ii0111o ii0111o6 = Ii0111o.I00iOIl;
/* 166 */                   int i7 = this.I00iiI;
/* 168 */                   if (i7 == 0) {
/* 181 */                       lIoii1l01l0i.I00000oOI(obj);
/* 184 */                       this.I00iiI = 1;
                                return ol010000lo00.I0001Ioi1lo(this) == ii0111o6 ? ii0111o6 : ooiIlOl1iI;
                            }
/* 170 */                   if (i7 == 1) {
/* 172 */                       lIoii1l01l0i.I00000oOI(obj);
/* 193 */                       return ooiIlOl1iI;
                            }
/* 176 */                   I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 7 */                     return null;
                        case 6:
/* 134 */                   Ii0111o ii0111o7 = Ii0111o.I00iOIl;
/* 136 */                   int i8 = this.I00iiI;
/* 138 */                   if (i8 == 0) {
/* 151 */                       lIoii1l01l0i.I00000oOI(obj);
/* 154 */                       this.I00iiI = 1;
                                return ol010000lo00.I0000O(this) == ii0111o7 ? ii0111o7 : ooiIlOl1iI;
                            }
/* 140 */                   if (i8 == 1) {
/* 142 */                       lIoii1l01l0i.I00000oOI(obj);
/* 163 */                       return ooiIlOl1iI;
                            }
/* 146 */                   I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 7 */                     return null;
                        case 7:
/* 104 */                   Ii0111o ii0111o8 = Ii0111o.I00iOIl;
/* 106 */                   int i9 = this.I00iiI;
/* 108 */                   if (i9 == 0) {
/* 121 */                       lIoii1l01l0i.I00000oOI(obj);
/* 124 */                       this.I00iiI = 1;
                                return ol010000lo00.I000II(this) == ii0111o8 ? ii0111o8 : ooiIlOl1iI;
                            }
/* 110 */                   if (i9 == 1) {
/* 112 */                       lIoii1l01l0i.I00000oOI(obj);
/* 133 */                       return ooiIlOl1iI;
                            }
/* 116 */                   I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 7 */                     return null;
                        case 8:
/* 74 */                    Ii0111o ii0111o9 = Ii0111o.I00iOIl;
/* 76 */                    int i10 = this.I00iiI;
/* 78 */                    if (i10 == 0) {
/* 91 */                        lIoii1l01l0i.I00000oOI(obj);
/* 94 */                        this.I00iiI = 1;
                                return ol010000lo00.I0000O(this) == ii0111o9 ? ii0111o9 : ooiIlOl1iI;
                            }
/* 80 */                    if (i10 == 1) {
/* 82 */                        lIoii1l01l0i.I00000oOI(obj);
/* 103 */                       return ooiIlOl1iI;
                            }
/* 86 */                    I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 7 */                     return null;
                        case 9:
/* 44 */                    Ii0111o ii0111o10 = Ii0111o.I00iOIl;
/* 46 */                    int i11 = this.I00iiI;
/* 48 */                    if (i11 == 0) {
/* 61 */                        lIoii1l01l0i.I00000oOI(obj);
/* 64 */                        this.I00iiI = 1;
                                return ol010000lo00.I0001Ioi1lo(this) == ii0111o10 ? ii0111o10 : ooiIlOl1iI;
                            }
/* 50 */                    if (i11 == 1) {
/* 52 */                        lIoii1l01l0i.I00000oOI(obj);
/* 73 */                        return ooiIlOl1iI;
                            }
/* 56 */                    I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 7 */                     return null;
                        default:
/* 14 */                    Ii0111o ii0111o11 = Ii0111o.I00iOIl;
/* 16 */                    int i12 = this.I00iiI;
/* 18 */                    if (i12 == 0) {
/* 31 */                        lIoii1l01l0i.I00000oOI(obj);
/* 34 */                        this.I00iiI = 1;
                                return ol010000lo00.I0000O(this) == ii0111o11 ? ii0111o11 : ooiIlOl1iI;
                            }
/* 20 */                    if (i12 == 1) {
/* 22 */                        lIoii1l01l0i.I00000oOI(obj);
/* 43 */                        return ooiIlOl1iI;
                            }
/* 26 */                    I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 7 */                     return null;
                    }
                }
            }

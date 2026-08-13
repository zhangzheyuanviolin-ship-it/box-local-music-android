            package p000;
            
            public final class IO1lI1l0Oi extends Oll0io implements IlliIl1l11O {
                public final int I00iOIl;
                public int I00iiI;
                public final Ol1OlloIO I00iiO;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public IO1lI1l0Oi(Ol1OlloIO ol1OlloIO, IOoil1iiIilo iOoil1iiIilo, int i) {
/* 6 */             super(2, iOoil1iiIilo);
/* 1 */             this.I00iOIl = i;
/* 3 */             this.I00iiO = ol1OlloIO;
                }

                @Override
                public final IOoil1iiIilo create(Object obj, IOoil1iiIilo iOoil1iiIilo) {
                    switch (this.I00iOIl) {
                        case 0:
/* 114 */                   return new IO1lI1l0Oi(this.I00iiO, iOoil1iiIilo, 0);
                        case 1:
/* 105 */                   return new IO1lI1l0Oi(this.I00iiO, iOoil1iiIilo, 1);
                        case 2:
/* 96 */                    return new IO1lI1l0Oi(this.I00iiO, iOoil1iiIilo, 2);
                        case 3:
/* 87 */                    return new IO1lI1l0Oi(this.I00iiO, iOoil1iiIilo, 3);
                        case 4:
/* 78 */                    return new IO1lI1l0Oi(this.I00iiO, iOoil1iiIilo, 4);
                        case 5:
/* 69 */                    return new IO1lI1l0Oi(this.I00iiO, iOoil1iiIilo, 5);
                        case 6:
/* 60 */                    return new IO1lI1l0Oi(this.I00iiO, iOoil1iiIilo, 6);
                        case 7:
/* 51 */                    return new IO1lI1l0Oi(this.I00iiO, iOoil1iiIilo, 7);
                        case 8:
/* 42 */                    return new IO1lI1l0Oi(this.I00iiO, iOoil1iiIilo, 8);
                        case 9:
/* 32 */                    return new IO1lI1l0Oi(this.I00iiO, iOoil1iiIilo, 9);
                        case 10:
/* 22 */                    return new IO1lI1l0Oi(this.I00iiO, iOoil1iiIilo, 10);
                        default:
/* 12 */                    return new IO1lI1l0Oi(this.I00iiO, iOoil1iiIilo, 11);
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
/* 18 */            return ((IO1lI1l0Oi) create(ii0110, iOoil1iiIilo)).invokeSuspend(ooiIlOl1iI);
                }

                @Override
                public final Object invokeSuspend(Object obj) throws Throwable {
/* 1 */             int i = this.I00iOIl;
/* 7 */             OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
/* 11 */            Ol1OlloIO ol1OlloIO = this.I00iiO;
                    switch (i) {
                        case 0:
/* 352 */                   Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 354 */                   int i2 = this.I00iiI;
/* 356 */                   if (i2 == 0) {
/* 369 */                       lIoii1l01l0i.I00000oOI(obj);
/* 372 */                       this.I00iiI = 1;
                                return Ol1OlloIO.I00000oOI(ol1OlloIO, "Copied", this, 14) == ii0111o ? ii0111o : ooiIlOl1iI;
                            }
/* 358 */                   if (i2 == 1) {
/* 360 */                       lIoii1l01l0i.I00000oOI(obj);
/* 383 */                       return ooiIlOl1iI;
                            }
/* 364 */                   I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 13 */                    return null;
                        case 1:
/* 322 */                   Ii0111o ii0111o2 = Ii0111o.I00iOIl;
/* 324 */                   int i3 = this.I00iiI;
/* 326 */                   if (i3 == 0) {
/* 339 */                       lIoii1l01l0i.I00000oOI(obj);
/* 342 */                       this.I00iiI = 1;
                                return Ol1OlloIO.I00000oOI(ol1OlloIO, "Gemini Nano model not ready on this device.", this, 14) == ii0111o2 ? ii0111o2 : ooiIlOl1iI;
                            }
/* 328 */                   if (i3 == 1) {
/* 330 */                       lIoii1l01l0i.I00000oOI(obj);
/* 351 */                       return ooiIlOl1iI;
                            }
/* 334 */                   I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 13 */                    return null;
                        case 2:
/* 292 */                   Ii0111o ii0111o3 = Ii0111o.I00iOIl;
/* 294 */                   int i4 = this.I00iiI;
/* 296 */                   if (i4 == 0) {
/* 309 */                       lIoii1l01l0i.I00000oOI(obj);
/* 312 */                       this.I00iiI = 1;
                                return Ol1OlloIO.I00000oOI(ol1OlloIO, "Gemini Nano model not ready on this device.", this, 14) == ii0111o3 ? ii0111o3 : ooiIlOl1iI;
                            }
/* 298 */                   if (i4 == 1) {
/* 300 */                       lIoii1l01l0i.I00000oOI(obj);
/* 321 */                       return ooiIlOl1iI;
                            }
/* 304 */                   I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 13 */                    return null;
                        case 3:
/* 262 */                   Ii0111o ii0111o4 = Ii0111o.I00iOIl;
/* 264 */                   int i5 = this.I00iiI;
/* 266 */                   if (i5 == 0) {
/* 279 */                       lIoii1l01l0i.I00000oOI(obj);
/* 282 */                       this.I00iiI = 1;
                                return Ol1OlloIO.I00000oOI(ol1OlloIO, "Gemini Nano model not ready on this device.", this, 14) == ii0111o4 ? ii0111o4 : ooiIlOl1iI;
                            }
/* 268 */                   if (i5 == 1) {
/* 270 */                       lIoii1l01l0i.I00000oOI(obj);
/* 291 */                       return ooiIlOl1iI;
                            }
/* 274 */                   I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 13 */                    return null;
                        case 4:
/* 232 */                   Ii0111o ii0111o5 = Ii0111o.I00iOIl;
/* 234 */                   int i6 = this.I00iiI;
/* 236 */                   if (i6 == 0) {
/* 249 */                       lIoii1l01l0i.I00000oOI(obj);
/* 252 */                       this.I00iiI = 1;
                                return Ol1OlloIO.I00000oOI(ol1OlloIO, "No file-picker app is available on this device.", this, 14) == ii0111o5 ? ii0111o5 : ooiIlOl1iI;
                            }
/* 238 */                   if (i6 == 1) {
/* 240 */                       lIoii1l01l0i.I00000oOI(obj);
/* 261 */                       return ooiIlOl1iI;
                            }
/* 244 */                   I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 13 */                    return null;
                        case 5:
/* 202 */                   Ii0111o ii0111o6 = Ii0111o.I00iOIl;
/* 204 */                   int i7 = this.I00iiI;
/* 206 */                   if (i7 == 0) {
/* 219 */                       lIoii1l01l0i.I00000oOI(obj);
/* 222 */                       this.I00iiI = 1;
                                return Ol1OlloIO.I00000oOI(ol1OlloIO, "No file-picker app is available on this device.", this, 14) == ii0111o6 ? ii0111o6 : ooiIlOl1iI;
                            }
/* 208 */                   if (i7 == 1) {
/* 210 */                       lIoii1l01l0i.I00000oOI(obj);
/* 231 */                       return ooiIlOl1iI;
                            }
/* 214 */                   I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 13 */                    return null;
                        case 6:
/* 172 */                   Ii0111o ii0111o7 = Ii0111o.I00iOIl;
/* 174 */                   int i8 = this.I00iiI;
/* 176 */                   if (i8 == 0) {
/* 189 */                       lIoii1l01l0i.I00000oOI(obj);
/* 192 */                       this.I00iiI = 1;
                                return Ol1OlloIO.I00000oOI(ol1OlloIO, "Gemini Nano model not ready on this device.", this, 14) == ii0111o7 ? ii0111o7 : ooiIlOl1iI;
                            }
/* 178 */                   if (i8 == 1) {
/* 180 */                       lIoii1l01l0i.I00000oOI(obj);
/* 201 */                       return ooiIlOl1iI;
                            }
/* 184 */                   I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 13 */                    return null;
                        case 7:
/* 142 */                   Ii0111o ii0111o8 = Ii0111o.I00iOIl;
/* 144 */                   int i9 = this.I00iiI;
/* 146 */                   if (i9 == 0) {
/* 159 */                       lIoii1l01l0i.I00000oOI(obj);
/* 162 */                       this.I00iiI = 1;
                                return Ol1OlloIO.I00000oOI(ol1OlloIO, "No file-picker app is available on this device.", this, 14) == ii0111o8 ? ii0111o8 : ooiIlOl1iI;
                            }
/* 148 */                   if (i9 == 1) {
/* 150 */                       lIoii1l01l0i.I00000oOI(obj);
/* 171 */                       return ooiIlOl1iI;
                            }
/* 154 */                   I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 13 */                    return null;
                        case 8:
/* 112 */                   Ii0111o ii0111o9 = Ii0111o.I00iOIl;
/* 114 */                   int i10 = this.I00iiI;
/* 116 */                   if (i10 == 0) {
/* 129 */                       lIoii1l01l0i.I00000oOI(obj);
/* 132 */                       this.I00iiI = 1;
                                return Ol1OlloIO.I00000oOI(ol1OlloIO, "Gemini Nano model not ready on this device.", this, 14) == ii0111o9 ? ii0111o9 : ooiIlOl1iI;
                            }
/* 118 */                   if (i10 == 1) {
/* 120 */                       lIoii1l01l0i.I00000oOI(obj);
/* 141 */                       return ooiIlOl1iI;
                            }
/* 124 */                   I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 13 */                    return null;
                        case 9:
/* 82 */                    Ii0111o ii0111o10 = Ii0111o.I00iOIl;
/* 84 */                    int i11 = this.I00iiI;
/* 86 */                    if (i11 == 0) {
/* 99 */                        lIoii1l01l0i.I00000oOI(obj);
/* 102 */                       this.I00iiI = 1;
                                return Ol1OlloIO.I00000oOI(ol1OlloIO, "No file-picker app is available on this device.", this, 14) == ii0111o10 ? ii0111o10 : ooiIlOl1iI;
                            }
/* 88 */                    if (i11 == 1) {
/* 90 */                        lIoii1l01l0i.I00000oOI(obj);
/* 111 */                       return ooiIlOl1iI;
                            }
/* 94 */                    I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 13 */                    return null;
                        case 10:
/* 52 */                    Ii0111o ii0111o11 = Ii0111o.I00iOIl;
/* 54 */                    int i12 = this.I00iiI;
/* 56 */                    if (i12 == 0) {
/* 69 */                        lIoii1l01l0i.I00000oOI(obj);
/* 72 */                        this.I00iiI = 1;
                                return Ol1OlloIO.I00000oOI(ol1OlloIO, "Gemini Nano model not ready on this device.", this, 14) == ii0111o11 ? ii0111o11 : ooiIlOl1iI;
                            }
/* 58 */                    if (i12 == 1) {
/* 60 */                        lIoii1l01l0i.I00000oOI(obj);
/* 81 */                        return ooiIlOl1iI;
                            }
/* 64 */                    I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 13 */                    return null;
                        default:
/* 20 */                    Ii0111o ii0111o12 = Ii0111o.I00iOIl;
/* 22 */                    int i13 = this.I00iiI;
/* 24 */                    if (i13 == 0) {
/* 37 */                        lIoii1l01l0i.I00000oOI(obj);
/* 40 */                        this.I00iiI = 1;
                                return Ol1OlloIO.I00000oOI(ol1OlloIO, "Model imported successfully", this, 14) == ii0111o12 ? ii0111o12 : ooiIlOl1iI;
                            }
/* 26 */                    if (i13 == 1) {
/* 28 */                        lIoii1l01l0i.I00000oOI(obj);
/* 51 */                        return ooiIlOl1iI;
                            }
/* 32 */                    I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 13 */                    return null;
                    }
                }
            }

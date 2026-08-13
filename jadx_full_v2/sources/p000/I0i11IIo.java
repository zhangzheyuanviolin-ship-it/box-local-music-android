            package p000;

            import java.lang.invoke.VarHandle;
            import java.util.List;
            import java.util.concurrent.CancellationException;
            import kotlin.jvm.functions.Function1;
            import kotlin.jvm.functions.Function3;
            
/* 13 */    public final class I0i11IIo extends Oll0io implements Function3 {
                public final int I00iOIl;
                public int I00iiI;
                public Object I00iiO;
                public Object I00iio;
                public Object I00ilI0I1;
                public final Object I00ilO0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public I0i11IIo(Io1o01Ol0i01 io1o01Ol0i01, Function1 function1, Function1 function12, IOoil1iiIilo iOoil1iiIilo) {
/* 11 */            super(3, iOoil1iiIilo);
/* 2 */             this.I00iOIl = 2;
/* 4 */             this.I00ilI0I1 = io1o01Ol0i01;
/* 6 */             this.I00iiO = function1;
/* 8 */             this.I00ilO0 = function12;
                }

                @Override
                public final Object invoke(Object obj, Object obj2, Object obj3) {
/* 1 */             int i = this.I00iOIl;
/* 3 */             OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
/* 5 */             Object obj4 = this.I00ilO0;
                    switch (i) {
                        case 0:
/* 142 */                   I0i11IIo i0i11IIo = new I0i11IIo((Function3) obj4, (IOoil1iiIilo) obj3, 0);
/* 145 */                   i0i11IIo.I00ilI0I1 = (OO11OoloI) obj;
/* 147 */                   i0i11IIo.I00iiO = obj2;
/* 149 */                   return i0i11IIo.invokeSuspend(ooiIlOl1iI);
                        case 1:
/* 121 */                   I0i11IIo i0i11IIo2 = new I0i11IIo((IlliIl1l11O) obj4, (IOoil1iiIilo) obj3, 1);
/* 124 */                   i0i11IIo2.I00ilI0I1 = (IlOil1iooOO0) obj;
/* 126 */                   i0i11IIo2.I00iiO = obj2;
/* 128 */                   return i0i11IIo2.invokeSuspend(ooiIlOl1iI);
                        case 2:
/* 86 */                    long j = ((OIOlIiiioi) obj2).I00000oIO;
/* 102 */                   I0i11IIo i0i11IIo3 = new I0i11IIo((Io1o01Ol0i01) this.I00ilI0I1, (Function1) this.I00iiO, (Function1) obj4, (IOoil1iiIilo) obj3);
/* 105 */                   i0i11IIo3.I00iio = (OOIII0OOoOi1) obj;
/* 107 */                   return i0i11IIo3.invokeSuspend(ooiIlOl1iI);
                        case 3:
/* 70 */                    I0i11IIo i0i11IIo4 = new I0i11IIo((List) obj4, (IOoil1iiIilo) obj3, 3);
/* 73 */                    i0i11IIo4.I00ilI0I1 = (Oil11Ii) obj;
/* 75 */                    i0i11IIo4.I00iiO = (IoO10oI0o) obj2;
/* 77 */                    return i0i11IIo4.invokeSuspend(ooiIlOl1iI);
                        case 4:
/* 47 */                    I0i11IIo i0i11IIo5 = new I0i11IIo((IOIooi0ol1i) obj4, (IOoil1iiIilo) obj3, 4);
/* 50 */                    i0i11IIo5.I00ilI0I1 = (IoO10oI0o) obj;
/* 52 */                    i0i11IIo5.I00iiO = (Function1) obj2;
/* 54 */                    return i0i11IIo5.invokeSuspend(ooiIlOl1iI);
                        default:
/* 24 */                    I0i11IIo i0i11IIo6 = new I0i11IIo((Function3) obj4, (IoIlI1oli) this.I00iiO, (IOoil1iiIilo) obj3);
/* 27 */                    i0i11IIo6.I00iio = (Oil1i1) obj;
/* 29 */                    i0i11IIo6.I00ilI0I1 = (IoO10oI0o) obj2;
/* 31 */                    return i0i11IIo6.invokeSuspend(ooiIlOl1iI);
                    }
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r0v12, types: [Io1o01Ol0i01, OooioIIoi0O, java.lang.Object] */
                /* JADX WARN: Type inference failed for: r0v14 */
                /* JADX WARN: Type inference failed for: r1v0 */
                /* JADX WARN: Type inference failed for: r1v4 */
                @Override
                public final Object invokeSuspend(Object obj) throws Throwable {
                    Oliiii0 oliiii0;
/* 1 */             int i = this.I00iOIl;
/* 3 */             boolean z = 0;
/* 5 */             OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
/* 7 */             Object obj2 = this.I00ilO0;
/* 12 */            IOoil1iiIilo iOoil1iiIilo = null;
                    switch (i) {
                        case 0:
/* 443 */                   OO11OoloI oO11OoloI = (OO11OoloI) this.I00ilI0I1;
/* 445 */                   Object obj3 = this.I00iiO;
/* 447 */                   Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 449 */                   int i2 = this.I00iiI;
/* 451 */                   if (i2 == 0) {
/* 474 */                       lIoii1l01l0i.I00000oOI(obj);
/* 479 */                       if (!(obj3 instanceof OIio0oloI1I)) {
/* 516 */                           return ooiIlOl1iI;
                                }
/* 484 */                       Object obj4 = oO11OoloI.I00iOIl;
/* 486 */                       this.I00ilI0I1 = null;
/* 488 */                       this.I00iiO = null;
/* 490 */                       this.I00iio = oO11OoloI;
/* 492 */                       this.I00iiI = 1;
/* 494 */                       obj = ((Function3) obj2).invoke(obj4, obj3, this);
/* 498 */                       if (obj != ii0111o) {
                                }
/* 515 */                       return ii0111o;
                            }
/* 453 */                   if (i2 != 1) {
/* 455 */                       if (i2 == 2) {
/* 457 */                           lIoii1l01l0i.I00000oOI(obj);
/* 516 */                           return ooiIlOl1iI;
                                }
/* 461 */                       I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 12 */                        return null;
                            }
/* 468 */                   oO11OoloI = (OO11OoloI) this.I00iio;
/* 470 */                   lIoii1l01l0i.I00000oOI(obj);
/* 501 */                   this.I00ilI0I1 = null;
/* 503 */                   this.I00iiO = null;
/* 505 */                   this.I00iio = null;
/* 507 */                   this.I00iiI = 2;
/* 513 */                   if (oO11OoloI.I0000oI00(this, obj) != ii0111o) {
/* 516 */                       return ooiIlOl1iI;
                            }
/* 515 */                   return ii0111o;
                        case 1:
/* 374 */                   IlOil1iooOO0 ilOil1iooOO0 = (IlOil1iooOO0) this.I00ilI0I1;
/* 376 */                   Object obj5 = this.I00iiO;
/* 378 */                   Ii0111o ii0111o2 = Ii0111o.I00iOIl;
/* 380 */                   int i3 = this.I00iiI;
/* 382 */                   if (i3 == 0) {
/* 405 */                       lIoii1l01l0i.I00000oOI(obj);
/* 410 */                       this.I00ilI0I1 = null;
/* 412 */                       this.I00iiO = null;
/* 414 */                       this.I00iio = ilOil1iooOO0;
/* 416 */                       this.I00iiI = 1;
/* 418 */                       obj = ((IlliIl1l11O) obj2).invoke(obj5, this);
/* 422 */                       if (obj != ii0111o2) {
                                }
/* 439 */                       return ii0111o2;
                            }
/* 384 */                   if (i3 != 1) {
/* 386 */                       if (i3 == 2) {
/* 388 */                           lIoii1l01l0i.I00000oOI(obj);
/* 440 */                           return ooiIlOl1iI;
                                }
/* 392 */                       I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 12 */                        return null;
                            }
/* 399 */                   ilOil1iooOO0 = (IlOil1iooOO0) this.I00iio;
/* 401 */                   lIoii1l01l0i.I00000oOI(obj);
/* 425 */                   this.I00ilI0I1 = null;
/* 427 */                   this.I00iiO = null;
/* 429 */                   this.I00iio = null;
/* 431 */                   this.I00iiI = 2;
/* 437 */                   if (ilOil1iooOO0.emit(obj, this) != ii0111o2) {
/* 440 */                       return ooiIlOl1iI;
                            }
/* 439 */                   return ii0111o2;
                        case 2:
/* 289 */                   Io1o01Ol0i01 io1o01Ol0i01 = (Io1o01Ol0i01) this.I00ilI0I1;
/* 293 */                   OOIII0OOoOi1 oOIII0OOoOi1 = (OOIII0OOoOi1) this.I00iio;
/* 295 */                   Ii0111o ii0111o3 = Ii0111o.I00iOIl;
/* 297 */                   int i4 = this.I00iiI;
                            try {
/* 299 */                       if (i4 == 0) {
/* 312 */                           lIoii1l01l0i.I00000oOI(obj);
/* 321 */                           io1o01Ol0i01.I0001Ioi1lo = (Function1) this.I00iiO;
/* 323 */                           io1o01Ol0i01.I000II = (Function1) obj2;
/* 329 */                           io1o01Ol0i01.I0000O.startListening(io1o01Ol0i01.I0000oI00);
/* 334 */                           io1o01Ol0i01.I0000oI00("");
/* 337 */                           io1o01Ol0i01.I0001Ioi1lo(true);
/* 340 */                           this.I00iio = null;
/* 342 */                           this.I00iiI = 1;
/* 348 */                           if (oOIII0OOoOi1.I00000oOI(this) == ii0111o3) {
/* 350 */                               return ii0111o3;
                                    }
                                } else {
/* 301 */                           if (i4 != 1) {
/* 307 */                               I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 12 */                                return null;
                                    }
/* 303 */                           lIoii1l01l0i.I00000oOI(obj);
                                }
/* 352 */                       IOO11li1OoII iOO11li1OoIII00000oIO = OooiooIOO.I00000oIO(io1o01Ol0i01);
/* 358 */                       z = 22;
/* 360 */                       I0II0OiI i0II0OiI = new I0II0OiI((Object) io1o01Ol0i01, iOoil1iiIilo, (char) 22);
/* 363 */                       io1o01Ol0i01 = 3;
/* 364 */                       iOi1II01i0.I0000O(iOO11li1OoIII00000oIO, null, null, i0II0OiI, 3);
/* 371 */                       return ooiIlOl1iI;
                            } catch (CancellationException unused) {
/* 368 */                       io1o01Ol0i01.I0001Ioi1lo(z);
/* 371 */                       return ooiIlOl1iI;
                            }
                        case 3:
/* 210 */                   Oil11Ii oil11Ii = (Oil11Ii) this.I00ilI0I1;
/* 214 */                   IoO10oI0o ioO10oI0o = (IoO10oI0o) this.I00iiO;
/* 216 */                   Ii0111o ii0111o4 = Ii0111o.I00iOIl;
/* 218 */                   int i5 = this.I00iiI;
/* 220 */                   if (i5 == 0) {
/* 243 */                       lIoii1l01l0i.I00000oOI(obj);
/* 246 */                       this.I00ilI0I1 = null;
/* 248 */                       this.I00iiO = null;
/* 250 */                       this.I00iiI = 1;
/* 254 */                       obj = oil11Ii.I00iOIl.I00000oIO(ioO10oI0o, this);
/* 258 */                       if (obj != ii0111o4) {
                                }
/* 283 */                       return ii0111o4;
                            }
/* 222 */                   if (i5 != 1) {
/* 224 */                       if (i5 != 2) {
/* 235 */                           I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 12 */                            return null;
                                }
/* 229 */                       IoIlIolo10o ioIlIolo10o = (IoIlIolo10o) this.I00iio;
/* 231 */                       lIoii1l01l0i.I00000oOI(obj);
/* 286 */                       return ioIlIolo10o;
                            }
/* 239 */                   lIoii1l01l0i.I00000oOI(obj);
/* 261 */                   IoIlIolo10o ioIlIolo10o2 = (IoIlIolo10o) obj;
/* 265 */                   Ii1olII1lO1 ii1olII1lO1I0000oI00 = ioIlIolo10o2.I0000oI00();
/* 269 */                   this.I00ilI0I1 = null;
/* 271 */                   this.I00iiO = null;
/* 273 */                   this.I00iio = ioIlIolo10o2;
/* 275 */                   this.I00iiI = 2;
/* 281 */                   if (IoIiolOl00.I00000oOI((List) obj2, ii1olII1lO1I0000oI00, this) != ii0111o4) {
/* 285 */                       return ioIlIolo10o2;
                            }
/* 283 */                   return ii0111o4;
                        case 4:
/* 80 */                    IoO10oI0o ioO10oI0o2 = (IoO10oI0o) this.I00ilI0I1;
/* 84 */                    Function1 function1 = (Function1) this.I00iiO;
/* 86 */                    Ii0111o ii0111o5 = Ii0111o.I00iOIl;
/* 88 */                    int i6 = this.I00iiI;
/* 90 */                    if (i6 != 0) {
/* 92 */                        if (i6 != 1) {
/* 104 */                           I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 12 */                            return null;
                                }
/* 96 */                        oliiii0 = (Oliiii0) this.I00iio;
                                try {
/* 98 */                            lIoii1l01l0i.I00000oOI(obj);
/* 188 */                           return ooiIlOl1iI;
                                } catch (Throwable th) {
/* 102 */                           th = th;
                                    try {
/* 191 */                               oliiii0.getClass();
/* 199 */                               oliiii0.I00O10llo(new IOiIII1I(false, th));
/* 202 */                               throw th;
                                    } finally {
/* 204 */                               oliiii0.I00iIO();
                                    }
                                }
                            }
/* 109 */                   lIoii1l01l0i.I00000oOI(obj);
/* 116 */                   Oliiii0 oliiii02 = new Oliiii0(ioO10oI0o2.I0000oI00);
/* 131 */                   O010OIi o010OIi = (O010OIi) ((IOIooi0ol1i) obj2).I00000oIO.I00iiO.I00lli11(Iioi0lilII.I00iio);
/* 133 */                   O1I1OOiol o1I1OOiol = IoO11I1oI.I00000oIO;
/* 139 */                   Iil1olo iil1olo = new Iil1olo(24);
/* 142 */                   iil1olo.I00iiI = oliiii02;
/* 144 */                   VarHandle.storeStoreFence();
/* 147 */                   IiiOlIiio iiiOlIiioI00iiI = o010OIi.I00iiI(iil1olo);
/* 155 */                   Iil1olo iil1olo2 = new Iil1olo(25);
/* 158 */                   iil1olo2.I00iiI = iiiOlIiioI00iiI;
/* 160 */                   VarHandle.storeStoreFence();
/* 163 */                   oliiii02.I00iiI(iil1olo2);
                            try {
/* 166 */                       ioO10oI0o2.I0000oI00 = oliiii02;
/* 168 */                       this.I00ilI0I1 = null;
/* 170 */                       this.I00iiO = null;
/* 172 */                       this.I00iio = oliiii02;
/* 174 */                       this.I00iiI = 1;
/* 180 */                       if (function1.invoke(this) == ii0111o5) {
/* 182 */                           return ii0111o5;
                                }
/* 184 */                       oliiii0 = oliiii02;
/* 188 */                       return ooiIlOl1iI;
                            } catch (Throwable th2) {
/* 189 */                       th = th2;
/* 190 */                       oliiii0 = oliiii02;
/* 191 */                       oliiii0.getClass();
/* 199 */                       oliiii0.I00O10llo(new IOiIII1I(false, th));
/* 202 */                       throw th;
                            }
                        default:
/* 18 */                    Oil1i1 oil1i1 = (Oil1i1) this.I00iio;
/* 22 */                    Object obj6 = (IoO10oI0o) this.I00ilI0I1;
/* 24 */                    Object obj7 = Ii0111o.I00iOIl;
/* 26 */                    int i7 = this.I00iiI;
/* 28 */                    if (i7 != 0) {
/* 30 */                        if (i7 == 1) {
/* 32 */                            lIoii1l01l0i.I00000oOI(obj);
/* 77 */                            return obj;
                                }
/* 36 */                        I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 12 */                        return null;
                            }
/* 41 */                    lIoii1l01l0i.I00000oOI(obj);
/* 52 */                    Ii00l101O ii00l101O = ((IoIlI1oli) this.I00iiO).I00iiO;
/* 54 */                    Oil11Ii oil11Ii2 = new Oil11Ii();
/* 57 */                    oil11Ii2.I00iOIl = oil1i1;
/* 59 */                    oil11Ii2.I00iiI = ii00l101O;
/* 61 */                    VarHandle.storeStoreFence();
/* 64 */                    this.I00iio = null;
/* 66 */                    this.I00ilI0I1 = null;
/* 68 */                    this.I00iiI = 1;
/* 70 */                    Object objInvoke = ((Function3) obj2).invoke(oil11Ii2, obj6, this);
                            return objInvoke == obj7 ? obj7 : objInvoke;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
/* 14 */        public I0i11IIo(Object obj, IOoil1iiIilo iOoil1iiIilo, int i) {
                    super(3, iOoil1iiIilo);
/* 15 */            this.I00iOIl = i;
                    this.I00ilO0 = obj;
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
/* 15 */        public I0i11IIo(Function3 function3, IoIlI1oli ioIlI1oli, IOoil1iiIilo iOoil1iiIilo) {
                    super(3, iOoil1iiIilo);
                    this.I00iOIl = 5;
/* 16 */            this.I00ilO0 = function3;
                    this.I00iiO = ioIlI1oli;
                }
            }

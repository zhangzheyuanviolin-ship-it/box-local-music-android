            package p000;

            import java.io.InputStream;
            import java.lang.invoke.VarHandle;
            import java.util.Map;
            import kotlin.jvm.functions.Function3;
            
/* 8 */     public final class IiIIl0OOio0O extends Oll0io implements Function3 {
                public final int I00iOIl;
                public int I00iiI;
                public Object I00iiO;
                public Object I00iio;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public IiIIl0OOio0O(Object obj, IOoil1iiIilo iOoil1iiIilo, int i) {
/* 6 */             super(3, iOoil1iiIilo);
/* 1 */             this.I00iOIl = i;
/* 3 */             this.I00iio = obj;
                }

                @Override
                public final Object invoke(Object obj, Object obj2, Object obj3) {
/* 1 */             int i = this.I00iOIl;
/* 3 */             int i2 = 3;
/* 4 */             OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
                    switch (i) {
                        case 0:
/* 122 */                   IiIIl0OOio0O iiIIl0OOio0O = new IiIIl0OOio0O(i2, (IOoil1iiIilo) obj3, 0);
/* 125 */                   iiIIl0OOio0O.I00iiO = (OO11OoloI) obj;
/* 127 */                   iiIIl0OOio0O.I00iio = obj2;
/* 129 */                   return iiIIl0OOio0O.invokeSuspend(ooiIlOl1iI);
                        case 1:
/* 103 */                   IiIIl0OOio0O iiIIl0OOio0O2 = new IiIIl0OOio0O(i2, (IOoil1iiIilo) obj3, 1);
/* 106 */                   iiIIl0OOio0O2.I00iiO = (OO11OoloI) obj;
/* 108 */                   iiIIl0OOio0O2.I00iio = (IoO1o1) obj2;
/* 110 */                   return iiIIl0OOio0O2.invokeSuspend(ooiIlOl1iI);
                        case 2:
/* 84 */                    IiIIl0OOio0O iiIIl0OOio0O3 = new IiIIl0OOio0O((IoIlI1oli) this.I00iio, (IOoil1iiIilo) obj3, 2);
/* 87 */                    iiIIl0OOio0O3.I00iiO = (OO11OoloI) obj;
/* 89 */                    return iiIIl0OOio0O3.invokeSuspend(ooiIlOl1iI);
                        case 3:
/* 61 */                    IiIIl0OOio0O iiIIl0OOio0O4 = new IiIIl0OOio0O((IlliOIilI) this.I00iio, (IOoil1iiIilo) obj3, i2);
/* 64 */                    iiIIl0OOio0O4.I00iiO = (OO11OoloI) obj;
/* 66 */                    return iiIIl0OOio0O4.invokeSuspend(ooiIlOl1iI);
                        case 4:
/* 41 */                    IiIIl0OOio0O iiIIl0OOio0O5 = new IiIIl0OOio0O((IlliIl1l11O) this.I00iio, (IOoil1iiIilo) obj3, 4);
/* 44 */                    iiIIl0OOio0O5.I00iiO = (OO11OoloI) obj;
/* 46 */                    return iiIIl0OOio0O5.invokeSuspend(ooiIlOl1iI);
                        default:
/* 18 */                    IiIIl0OOio0O iiIIl0OOio0O6 = new IiIIl0OOio0O(i2, (IOoil1iiIilo) obj3, 5);
/* 21 */                    iiIIl0OOio0O6.I00iiO = (IlOil1iooOO0) obj;
/* 23 */                    iiIIl0OOio0O6.I00iio = (Object[]) obj2;
/* 25 */                    return iiIIl0OOio0O6.invokeSuspend(ooiIlOl1iI);
                    }
                }

                @Override
                public final Object invokeSuspend(Object obj) throws Throwable {
                    IOoOloI0iI iOoOloI0iII00000oIO;
                    OIio0oloI1I oloil11oIooi;
                    IOo100ol1lIo iOo100ol1lIo;
/* 1 */             int i = this.I00iOIl;
/* 3 */             int i2 = 0;
/* 4 */             OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
/* 8 */             int i3 = 1;
/* 9 */             IOo100ol1lIo iOo100ol1lIo2 = null;
                    switch (i) {
                        case 0:
/* 338 */                   OO11OoloI oO11OoloI = (OO11OoloI) this.I00iiO;
/* 340 */                   Object obj2 = this.I00iio;
/* 342 */                   Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 344 */                   int i4 = this.I00iiI;
/* 346 */                   if (i4 != 0) {
/* 348 */                       if (i4 == 1) {
/* 350 */                           lIoii1l01l0i.I00000oOI(obj);
/* 620 */                           return ooiIlOl1iI;
                                }
/* 355 */                       I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 9 */                         return null;
                            }
/* 361 */                   lIoii1l01l0i.I00000oOI(obj);
/* 364 */                   Object obj3 = oO11OoloI.I00iOIl;
/* 377 */                   if (((IoO10oI0o) obj3).I0000Il00O.I00oII("Accept") == null) {
/* 386 */                       ((IoO10oI0o) obj3).I0000Il00O.I00ll1("Accept", "*/*");
                            }
/* 389 */                   IoO10oI0o ioO10oI0o = (IoO10oI0o) obj3;
/* 395 */                   String strI00oII = ioO10oI0o.I0000Il00O.I00oII("Content-Type");
/* 399 */                   if (strI00oII != null) {
/* 401 */                       IOoOloI0iI iOoOloI0iI = IOoOloI0iI.I0000oI00;
/* 403 */                       iOoOloI0iII00000oIO = iioIIll1.I00000oIO(strI00oII);
                            } else {
/* 408 */                       iOoOloI0iII00000oIO = null;
                            }
/* 411 */                   if (obj2 instanceof String) {
/* 416 */                       String str = (String) obj2;
/* 418 */                       if (iOoOloI0iII00000oIO == null) {
/* 420 */                           iOoOloI0iII00000oIO = IOoOiii0.I00000oIO;
                                }
/* 422 */                       oloil11oIooi = new Oloil11oIooi(str, iOoOloI0iII00000oIO);
                            } else if (obj2 instanceof byte[]) {
/* 433 */                       IiIIOii1IOl0 iiIIOii1IOl0 = new IiIIOii1IOl0();
/* 436 */                       iiIIOii1IOl0.I0000Il00O = obj2;
/* 438 */                       if (iOoOloI0iII00000oIO == null) {
/* 440 */                           iOoOloI0iII00000oIO = IOoOi11i1I.I00000oOI;
                                }
/* 442 */                       iiIIOii1IOl0.I00000oIO = iOoOloI0iII00000oIO;
/* 449 */                       iiIIOii1IOl0.I00000oOI = ((byte[]) obj2).length;
/* 451 */                       VarHandle.storeStoreFence();
                                oloil11oIooi = iiIIOii1IOl0;
                            } else if (obj2 instanceof IIIoloiiI1) {
/* 463 */                       IiIIi1ii111 iiIIi1ii111 = new IiIIi1ii111(i2);
/* 466 */                       iiIIi1ii111.I0000O = obj2;
/* 470 */                       String strI00oII2 = ioO10oI0o.I0000Il00O.I00oII("Content-Length");
/* 486 */                       iiIIi1ii111.I00000oOI = strI00oII2 != null ? Long.valueOf(Long.parseLong(strI00oII2)) : null;
/* 488 */                       if (iOoOloI0iII00000oIO == null) {
/* 490 */                           iOoOloI0iII00000oIO = IOoOi11i1I.I00000oOI;
                                }
/* 492 */                       iiIIi1ii111.I0000Il00O = iOoOloI0iII00000oIO;
/* 494 */                       VarHandle.storeStoreFence();
/* 497 */                       oloil11oIooi = iiIIi1ii111;
                            } else if (obj2 instanceof OIio0oloI1I) {
/* 504 */                       oloil11oIooi = (OIio0oloI1I) obj2;
                            } else if (obj2 instanceof InputStream) {
/* 513 */                       IiIIi1ii111 iiIIi1ii1112 = new IiIIi1ii111(i3);
/* 516 */                       iiIIi1ii1112.I0000O = obj2;
/* 520 */                       String strI00oII3 = ioO10oI0o.I0000Il00O.I00oII("Content-Length");
/* 536 */                       iiIIi1ii1112.I00000oOI = strI00oII3 != null ? Long.valueOf(Long.parseLong(strI00oII3)) : null;
/* 538 */                       if (iOoOloI0iII00000oIO == null) {
/* 540 */                           iOoOloI0iII00000oIO = IOoOi11i1I.I00000oOI;
                                }
/* 542 */                       iiIIi1ii1112.I0000Il00O = iOoOloI0iII00000oIO;
/* 544 */                       VarHandle.storeStoreFence();
                                oloil11oIooi = iiIIi1ii1112;
                            } else {
/* 548 */                       oloil11oIooi = null;
                            }
/* 557 */                   if ((oloil11oIooi != null ? oloil11oIooi.I00000oOI() : null) == null) {
/* 620 */                       return ooiIlOl1iI;
                            }
/* 565 */                   ((Map) ioO10oI0o.I0000Il00O.I00iOIl).remove("Content-Type");
/* 604 */                   IiIO0IO0lll.I00000oIO.I000o00OoI0I("Transformed with default transformers request body for " + ioO10oI0o.I00000oIO + " from " + OOoOl0i.I00000oIO.I00000oOI(obj2.getClass()));
/* 607 */                   this.I00iiO = null;
/* 609 */                   this.I00iio = null;
/* 611 */                   this.I00iiI = 1;
                            return oO11OoloI.I0000oI00(this, oloil11oIooi) == ii0111o ? ii0111o : ooiIlOl1iI;
                        case 1:
/* 238 */                   OO11OoloI oO11OoloI2 = (OO11OoloI) this.I00iiO;
/* 242 */                   IoO1o1 ioO1o1 = (IoO1o1) this.I00iio;
/* 244 */                   Ii0111o ii0111o2 = Ii0111o.I00iOIl;
/* 246 */                   int i5 = this.I00iiI;
/* 248 */                   if (i5 != 0) {
/* 250 */                       if (i5 == 1) {
/* 252 */                           lIoii1l01l0i.I00000oOI(obj);
/* 335 */                           return ooiIlOl1iI;
                                }
/* 256 */                       I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 9 */                         return null;
                            }
/* 261 */                   lIoii1l01l0i.I00000oOI(obj);
/* 264 */                   OoOO010 ooOO010 = ioO1o1.I00000oIO;
/* 266 */                   Object obj4 = ioO1o1.I00000oOI;
/* 270 */                   if (!(obj4 instanceof IIIoloiiI1) || !O0000Ioio00.I0000O(ooOO010.I00000oIO, OOoOl0i.I00000oIO.I00000oOI(InputStream.class))) {
/* 335 */                       return ooiIlOl1iI;
                            }
/* 319 */                   IoO1o1 ioO1o12 = new IoO1o1(ooOO010, new II101Ool(new II101Ool((IIIoloiiI1) obj4, i2), i3));
/* 322 */                   this.I00iiO = null;
/* 324 */                   this.I00iio = null;
/* 326 */                   this.I00iiI = 1;
                            return oO11OoloI2.I0000oI00(this, ioO1o12) == ii0111o2 ? ii0111o2 : ooiIlOl1iI;
                        case 2:
/* 170 */                   OO11OoloI oO11OoloI3 = (OO11OoloI) this.I00iiO;
/* 172 */                   Ii0111o ii0111o3 = Ii0111o.I00iOIl;
/* 174 */                   int i6 = this.I00iiI;
                            try {
/* 176 */                       if (i6 == 0) {
/* 191 */                           lIoii1l01l0i.I00000oOI(obj);
/* 194 */                           this.I00iiO = oO11OoloI3;
/* 196 */                           this.I00iiI = 1;
/* 198 */                           obj = oO11OoloI3.I0000O(this);
/* 202 */                           if (obj == ii0111o3) {
/* 204 */                               return ii0111o3;
                                    }
                                } else {
/* 178 */                           if (i6 != 1) {
/* 186 */                               I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 9 */                                 return null;
                                    }
/* 180 */                           lIoii1l01l0i.I00000oOI(obj);
                                }
/* 208 */                       return ooiIlOl1iI;
                            } catch (Throwable th) {
/* 213 */                       I0IIiO0iI i0IIiO0iI = ((IoIlI1oli) this.I00iio).I00l0I0l0lO1;
/* 219 */                       ((IoIlIolo10o) oO11OoloI3.I00iOIl).I0000oI00();
/* 232 */                       IIlIOloOOO.I001i1lo1io(((IOollI1oO) i0IIiO0iI.I00iiI).I00000oIO(IOIoi11o.I0000O));
/* 235 */                       throw th;
                            }
                        case 3:
/* 119 */                   OO11OoloI oO11OoloI4 = (OO11OoloI) this.I00iiO;
/* 121 */                   Ii0111o ii0111o4 = Ii0111o.I00iOIl;
/* 123 */                   int i7 = this.I00iiI;
/* 125 */                   if (i7 != 0) {
/* 127 */                       if (i7 == 1) {
/* 129 */                           lIoii1l01l0i.I00000oOI(obj);
/* 167 */                           return ooiIlOl1iI;
                                }
/* 133 */                       I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 9 */                         return null;
                            }
/* 138 */                   lIoii1l01l0i.I00000oOI(obj);
/* 143 */                   IlliOIilI illiOIilI = (IlliOIilI) this.I00iio;
/* 147 */                   OIi011olI0ll oIi011olI0ll = new OIi011olI0ll();
/* 150 */                   Object obj5 = oO11OoloI4.I00iOIl;
/* 152 */                   Object objI0000Il00O = oO11OoloI4.I0000Il00O();
/* 156 */                   this.I00iiO = null;
/* 158 */                   this.I00iiI = 1;
                            return illiOIilI.I000l1(oIi011olI0ll, obj5, objI0000Il00O, this) == ii0111o4 ? ii0111o4 : ooiIlOl1iI;
                        case 4:
/* 77 */                    OO11OoloI oO11OoloI5 = (OO11OoloI) this.I00iiO;
/* 79 */                    Ii0111o ii0111o5 = Ii0111o.I00iOIl;
/* 81 */                    int i8 = this.I00iiI;
/* 83 */                    if (i8 != 0) {
/* 85 */                        if (i8 == 1) {
/* 87 */                            lIoii1l01l0i.I00000oOI(obj);
/* 116 */                           return ooiIlOl1iI;
                                }
/* 91 */                        I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 9 */                         return null;
                            }
/* 96 */                    lIoii1l01l0i.I00000oOI(obj);
/* 101 */                   IlliIl1l11O illiIl1l11O = (IlliIl1l11O) this.I00iio;
/* 103 */                   Object obj6 = oO11OoloI5.I00iOIl;
/* 105 */                   this.I00iiO = null;
/* 107 */                   this.I00iiI = 1;
                            return illiIl1l11O.invoke(obj6, this) == ii0111o5 ? ii0111o5 : ooiIlOl1iI;
                        default:
/* 13 */                    Ii0111o ii0111o6 = Ii0111o.I00iOIl;
/* 15 */                    int i9 = this.I00iiI;
/* 17 */                    if (i9 != 0) {
/* 19 */                        if (i9 == 1) {
/* 21 */                            lIoii1l01l0i.I00000oOI(obj);
/* 74 */                            return ooiIlOl1iI;
                                }
/* 25 */                        I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 9 */                         return null;
                            }
/* 30 */                    lIoii1l01l0i.I00000oOI(obj);
/* 35 */                    IlOil1iooOO0 ilOil1iooOO0 = (IlOil1iooOO0) this.I00iiO;
/* 41 */                    IOo100ol1lIo[] iOo100ol1lIoArr = (IOo100ol1lIo[]) ((Object[]) this.I00iio);
/* 43 */                    int length = iOo100ol1lIoArr.length;
                            while (true) {
/* 44 */                        iOo100ol1lIo = IOo0oo1oo1OI.I00000oIO;
/* 46 */                        if (i2 < length) {
/* 48 */                            IOo100ol1lIo iOo100ol1lIo3 = iOo100ol1lIoArr[i2];
/* 54 */                            if (O0000Ioio00.I0000O(iOo100ol1lIo3, iOo100ol1lIo)) {
/* 58 */                                i2++;
                                    } else {
/* 56 */                                iOo100ol1lIo2 = iOo100ol1lIo3;
                                    }
                                }
                            }
/* 61 */                    if (iOo100ol1lIo2 != null) {
/* 64 */                        iOo100ol1lIo = iOo100ol1lIo2;
                            }
/* 65 */                    this.I00iiI = 1;
                            return ilOil1iooOO0.emit(iOo100ol1lIo, this) == ii0111o6 ? ii0111o6 : ooiIlOl1iI;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
/* 9 */         public IiIIl0OOio0O(int i, IOoil1iiIilo iOoil1iiIilo, int i2) {
                    super(i, iOoil1iiIilo);
/* 10 */            this.I00iOIl = i2;
                }
            }

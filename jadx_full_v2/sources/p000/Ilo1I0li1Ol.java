            package p000;

            import android.content.Context;
            import android.util.Log;
            import java.util.Collection;
            import java.util.Iterator;
            import java.util.List;
            import java.util.Map;
            import kotlin.jvm.functions.Function1;
            
/* 18 */    public final class Ilo1I0li1Ol extends Oll0io implements IlliIl1l11O {
                public final int I00iOIl;
                public final Object I00iiI;
                public final Object I00iiO;
                public final Object I00iio;
                public final Object I00ilI0I1;
                public final Object I00ilO0;
                public Object I00io1l;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public Ilo1I0li1Ol(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, IOoil1iiIilo iOoil1iiIilo, int i) {
/* 16 */            super(2, iOoil1iiIilo);
/* 1 */             this.I00iOIl = i;
/* 3 */             this.I00iiI = obj;
/* 5 */             this.I00iiO = obj2;
/* 7 */             this.I00iio = obj3;
/* 9 */             this.I00ilI0I1 = obj4;
/* 11 */            this.I00ilO0 = obj5;
/* 13 */            this.I00io1l = obj6;
                }

                @Override
                public final IOoil1iiIilo create(Object obj, IOoil1iiIilo iOoil1iiIilo) {
/* 3 */             int i = this.I00iOIl;
/* 5 */             Object obj2 = this.I00ilO0;
/* 7 */             Object obj3 = this.I00iio;
/* 9 */             Object obj4 = this.I00ilI0I1;
/* 11 */            Object obj5 = this.I00iiO;
/* 13 */            Object obj6 = this.I00iiI;
                    switch (i) {
                        case 0:
/* 128 */                   return new Ilo1I0li1Ol((O1oIOiI11o0) obj6, (O1oIOiI11o0) obj5, (O1ol100o0O) obj3, (Context) obj4, (OloIl1l1oOii) obj2, this.I00io1l, iOoil1iiIilo, 0);
                        case 1:
/* 101 */                   return new Ilo1I0li1Ol((OI10i0Il) obj6, (O0oiOi) obj5, (OOIIOiolI) obj3, (Ioi1Io1o) obj4, (OIooi1iOiOol) obj2, (OI10i0Il) this.I00io1l, iOoil1iiIilo, 1);
                        case 2:
/* 71 */                    return new Ilo1I0li1Ol((OoI1Oi0l1I0o) obj6, (OI1o1o1iO1l) obj5, (OI1OloOIO1O) obj3, (OI0o0olO1) obj4, (OlO01l1oOil) obj2, (IOl00O1iI1Oo) this.I00io1l, iOoil1iiIilo, 2);
                        default:
/* 37 */                    Ilo1I0li1Ol ilo1I0li1Ol = new Ilo1I0li1Ol((String) obj6, (IOiOol0) obj5, (Context) obj4, (o0l0iIlo0O) obj3, (Function1) obj2, iOoil1iiIilo);
/* 42 */                    ilo1I0li1Ol.I00io1l = obj;
/* 44 */                    return ilo1I0li1Ol;
                    }
                }

                @Override
                public final Object invoke(Object obj, Object obj2) throws Throwable {
/* 1 */             int i = this.I00iOIl;
/* 3 */             OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
                    switch (i) {
                        case 0:
/* 60 */                    ((Ilo1I0li1Ol) create((Ii0110) obj, (IOoil1iiIilo) obj2)).invokeSuspend(ooiIlOl1iI);
                            break;
                        case 1:
/* 46 */                    ((Ilo1I0li1Ol) create((Ii0110) obj, (IOoil1iiIilo) obj2)).invokeSuspend(ooiIlOl1iI);
                            break;
                        case 2:
/* 32 */                    ((Ilo1I0li1Ol) create((Ii0110) obj, (IOoil1iiIilo) obj2)).invokeSuspend(ooiIlOl1iI);
                            break;
                        default:
/* 18 */                    ((Ilo1I0li1Ol) create((Map) obj, (IOoil1iiIilo) obj2)).invokeSuspend(ooiIlOl1iI);
                            break;
                    }
/* 21 */            return ooiIlOl1iI;
                }

                /* JADX WARN: Removed duplicated region for block: B:43:0x014d  */
                @Override
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object invokeSuspend(Object obj) throws Throwable {
/* 1 */             int i = this.I00iOIl;
/* 3 */             OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
/* 5 */             Object obj2 = this.I00ilO0;
/* 7 */             Object obj3 = this.I00iiI;
/* 9 */             Object obj4 = this.I00iiO;
/* 11 */            Object obj5 = this.I00ilI0I1;
/* 13 */            Object obj6 = this.I00iio;
                    switch (i) {
                        case 0:
/* 369 */                   Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 371 */                   lIoii1l01l0i.I00000oOI(obj);
/* 375 */                   O1oIOiI11o0 o1oIOiI11o0 = (O1oIOiI11o0) obj3;
/* 379 */                   O1oIOiI11o0 o1oIOiI11o02 = (O1oIOiI11o0) obj4;
/* 387 */                   if (!O0000Ioio00.I0000O(o1oIOiI11o0.I00000oIO, o1oIOiI11o02.I00000oIO)) {
/* 403 */                       O1ol100o0O.I000O01llI0((O1ol100o0O) obj6, (Context) obj5, (OloIl1l1oOii) obj2, o1oIOiI11o0, this.I00io1l, null, 16);
                            }
/* 408 */                   ((O1ol100o0O) obj6).I00IlilI0i0i(o1oIOiI11o02);
                            break;
                        case 1:
/* 340 */                   Ii0111o ii0111o2 = Ii0111o.I00iOIl;
/* 342 */                   lIoii1l01l0i.I00000oOI(obj);
/* 365 */                   l1O0o1.I0000O((OI10i0Il) obj3, (O0oiOi) obj4, (OOIIOiolI) obj6, (Ioi1Io1o) obj5, (OIooi1iOiOol) obj2, (OI10i0Il) this.I00io1l);
                            break;
                        case 2:
/* 161 */                   Ii0111o ii0111o3 = Ii0111o.I00iOIl;
/* 163 */                   lIoii1l01l0i.I00000oOI(obj);
/* 166 */                   OoI1Oi0l1I0o ooI1Oi0l1I0o = (OoI1Oi0l1I0o) obj3;
/* 170 */                   Object objI00olI = ooI1Oi0l1I0o.I00000oIO.I00olI();
/* 174 */                   OIooliIO0 oIooliIO0 = ooI1Oi0l1I0o.I0000O;
/* 184 */                   if (O0000Ioio00.I0000O(objI00olI, oIooliIO0.getValue()) && (((OI1OloOIO1O) ((OI1o1o1iO1l) obj4).I00000oOI.I0001Ioi1lo.I000o00OoI0I()) == null || O0000Ioio00.I0000O(oIooliIO0.getValue(), (OI1OloOIO1O) obj6))) {
/* 218 */                       List list = (List) ((OlO01l1oOil) obj2).getValue();
/* 224 */                       IOl00O1iI1Oo iOl00O1iI1Oo = (IOl00O1iI1Oo) this.I00io1l;
/* 226 */                       Iterator it = list.iterator();
/* 234 */                       while (it.hasNext()) {
/* 246 */                           iOl00O1iI1Oo.I00000oOI().I00000oOI((OI1OloOIO1O) it.next());
                                }
/* 250 */                       OI0o0olO1 oI0o0olO1 = (OI0o0olO1) obj5;
/* 252 */                       long[] jArr = oI0o0olO1.I00000oIO;
                                int length = jArr.length - 2;
/* 257 */                       if (length >= 0) {
/* 260 */                           int i2 = 0;
                                    while (true) {
/* 261 */                               long j = jArr[i2];
/* 275 */                               if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
/* 284 */                                   int i3 = 8 - ((~(i2 - length)) >>> 31);
/* 287 */                                   for (int i4 = 0; i4 < i3; i4++) {
/* 296 */                                       if ((255 & j) < 128) {
/* 300 */                                           int i5 = (i2 << 3) + i4;
/* 303 */                                           Object obj7 = oI0o0olO1.I00000oOI[i5];
/* 307 */                                           float f = oI0o0olO1.I0000Il00O[i5];
/* 323 */                                           if (!O0000Ioio00.I0000O((String) obj7, ((OI1OloOIO1O) oIooliIO0.getValue()).I00ilO0)) {
/* 325 */                                               oI0o0olO1.I0000oI00(i5);
                                                    }
                                                }
/* 328 */                                       j >>= 8;
                                            }
/* 332 */                                   if (i3 != 8) {
                                                break;
                                            } else if (i2 == length) {
                                                break;
                                            } else {
/* 336 */                                       i2++;
                                            }
                                        }
                                    }
                                }
                            }
                            break;
                        default:
/* 18 */                    Context context = (Context) obj5;
/* 20 */                    IOiOol0 iOiOol0 = (IOiOol0) obj4;
/* 22 */                    Ii0111o ii0111o4 = Ii0111o.I00iOIl;
/* 24 */                    lIoii1l01l0i.I00000oOI(obj);
/* 29 */                    Map map = (Map) this.I00io1l;
/* 31 */                    String str = (String) obj3;
/* 37 */                    o0l0iIlo0O o0l0iilo0o = (o0l0iIlo0O) map.get(str);
/* 41 */                    if (o0l0iilo0o != null) {
/* 55 */                        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 31);
/* 60 */                        sb.append("Overwriting cache with name '");
/* 63 */                        sb.append(str);
/* 68 */                        sb.append("'.");
/* 75 */                        Log.i("CacheFileManager", sb.toString());
/* 78 */                        IOiOol0.I00O0i0ii(iOiOol0, context, o0l0iilo0o);
                            }
/* 81 */                    o0l0iIlo0O o0l0iilo0o2 = (o0l0iIlo0O) obj6;
/* 83 */                    map.put(str, o0l0iilo0o2);
/* 86 */                    Function1 function1 = (Function1) obj2;
/* 88 */                    if (function1 != null) {
/* 104 */                       for (o0l0iIlo0O o0l0iilo0o3 : (Collection) function1.invoke(map)) {
/* 124 */                           if (O0000Ioio00.I0000O(o0l0iilo0o3.zza(), o0l0iilo0o2.zza())) {
/* 140 */                               Log.w("CacheFileManager", "Eviction policy attempts to delete cache being written: ".concat(String.valueOf(o0l0iilo0o3.zza())));
                                    } else {
/* 152 */                               o0l0iIlo0O o0l0iilo0o4 = (o0l0iIlo0O) map.remove(o0l0iilo0o3.zza());
/* 154 */                               if (o0l0iilo0o4 != null) {
/* 156 */                                   IOiOol0.I00O0i0ii(iOiOol0, context, o0l0iilo0o4);
                                        }
                                    }
                                }
                                break;
                            }
                            break;
                    }
/* 160 */           return ooiIlOl1iI;
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
/* 19 */        public Ilo1I0li1Ol(String str, IOiOol0 iOiOol0, Context context, o0l0iIlo0O o0l0iilo0o, Function1 function1, IOoil1iiIilo iOoil1iiIilo) {
                    super(2, iOoil1iiIilo);
                    this.I00iOIl = 3;
/* 20 */            this.I00iiI = str;
                    this.I00iiO = iOiOol0;
                    this.I00ilI0I1 = context;
                    this.I00iio = o0l0iilo0o;
                    this.I00ilO0 = function1;
                }
            }

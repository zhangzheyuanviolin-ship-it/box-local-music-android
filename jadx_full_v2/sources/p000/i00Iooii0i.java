            package p000;

            import android.content.Context;
            import androidx.work.impl.model.WorkSpec;
            import com.google.common.util.concurrent.ListenableFuture;
            import com.google.mlkit.genai.common.DownloadCallback;
            import java.lang.invoke.VarHandle;
            import java.util.ArrayList;
            import java.util.Iterator;
            
/* 13 */    public final class i00Iooii0i extends Oll0io implements IlliIl1l11O {
                public final int I00iOIl;
                public int I00iiI;
                public Object I00iiO;
                public final Object I00iio;
                public final Object I00ilI0I1;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public i00Iooii0i(IOiOol0 iOiOol0, IOoil1iiIilo iOoil1iiIilo, Context context, String str) {
/* 11 */            super(2, iOoil1iiIilo);
/* 2 */             this.I00iOIl = 3;
/* 4 */             this.I00iiO = iOiOol0;
/* 6 */             this.I00ilI0I1 = context;
/* 8 */             this.I00iio = str;
                }

                @Override
                public final IOoil1iiIilo create(Object obj, IOoil1iiIilo iOoil1iiIilo) {
/* 1 */             int i = this.I00iOIl;
/* 3 */             Object obj2 = this.I00ilI0I1;
/* 5 */             Object obj3 = this.I00iio;
                    switch (i) {
                        case 0:
/* 104 */                   i00Iooii0i i00iooii0i = new i00Iooii0i((Oi1ol0llI) obj3, (Context) obj2, iOoil1iiIilo, 0);
/* 107 */                   i00iooii0i.I00iiO = obj;
/* 109 */                   return i00iooii0i;
                        case 1:
/* 92 */                    return new i00Iooii0i((OlIOOOoi0IlI) this.I00iiO, (WorkSpec) obj3, (OIOollli) obj2, iOoil1iiIilo, 1);
                        case 2:
/* 73 */                    return new i00Iooii0i((i01ilO) this.I00iiO, (O10oIiIi0OI0) obj3, (IliliOoOloi) obj2, iOoil1iiIilo, 2);
                        case 3:
/* 54 */                    return new i00Iooii0i((IOiOol0) this.I00iiO, iOoil1iiIilo, (Context) obj2, (String) obj3);
                        case 4:
/* 37 */                    i00Iooii0i i00iooii0i2 = new i00Iooii0i((Ii0110) obj3, (IliI1Ii1II) obj2, iOoil1iiIilo, 4);
/* 40 */                    i00iooii0i2.I00iiO = obj;
/* 42 */                    return i00iooii0i2;
                        default:
/* 25 */                    return new i00Iooii0i((o1I0I0O) this.I00iiO, (IIiOOI) obj3, (DownloadCallback) obj2, iOoil1iiIilo, 5);
                    }
                }

                @Override
                public final Object invoke(Object obj, Object obj2) {
/* 1 */             int i = this.I00iOIl;
/* 3 */             OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
                    switch (i) {
                        case 0:
/* 93 */                    return ((i00Iooii0i) create((OOIoOo0O) obj, (IOoil1iiIilo) obj2)).invokeSuspend(ooiIlOl1iI);
                        case 1:
/* 78 */                    return ((i00Iooii0i) create((Ii0110) obj, (IOoil1iiIilo) obj2)).invokeSuspend(ooiIlOl1iI);
                        case 2:
/* 63 */                    return ((i00Iooii0i) create((Ii0110) obj, (IOoil1iiIilo) obj2)).invokeSuspend(ooiIlOl1iI);
                        case 3:
/* 48 */                    return ((i00Iooii0i) create((Ii0110) obj, (IOoil1iiIilo) obj2)).invokeSuspend(ooiIlOl1iI);
                        case 4:
/* 33 */                    return ((i00Iooii0i) create((OOIoOo0O) obj, (IOoil1iiIilo) obj2)).invokeSuspend(ooiIlOl1iI);
                        default:
/* 18 */                    return ((i00Iooii0i) create((Ii0110) obj, (IOoil1iiIilo) obj2)).invokeSuspend(ooiIlOl1iI);
                    }
                }

                @Override
                public final Object invokeSuspend(Object obj) throws Throwable {
/* 1 */             int i = this.I00iOIl;
/* 6 */             OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
/* 8 */             Object obj2 = this.I00ilI0I1;
/* 11 */            Object obj3 = this.I00iio;
                    switch (i) {
                        case 0:
/* 390 */                   Oi1ol0llI oi1ol0llI = (Oi1ol0llI) obj3;
/* 392 */                   Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 394 */                   int i2 = this.I00iiI;
/* 396 */                   if (i2 != 0) {
/* 398 */                       if (i2 == 1) {
/* 400 */                           lIoii1l01l0i.I00000oOI(obj);
/* 463 */                           return ooiIlOl1iI;
                                }
/* 404 */                       I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 10 */                        return null;
                            }
/* 409 */                   lIoii1l01l0i.I00000oOI(obj);
/* 414 */                   OOIoOo0O oOIoOo0O = (OOIoOo0O) this.I00iiO;
/* 418 */                   Olioo011il1 olioo011il1 = new Olioo011il1(3);
/* 421 */                   olioo011il1.I00000oOI = oOIoOo0O;
/* 423 */                   VarHandle.storeStoreFence();
/* 437 */                   ((i00I1il0) oi1ol0llI.I00iiI).I00000oIO((Context) obj2, new I1Ii1lIoOI(1), olioo011il1);
/* 444 */                   OlolIi000l ololIi000l = new OlolIi000l(9);
/* 447 */                   ololIi000l.I00iiI = oi1ol0llI;
/* 449 */                   ololIi000l.I00iiO = olioo011il1;
/* 451 */                   VarHandle.storeStoreFence();
/* 454 */                   this.I00iiI = 1;
                            return lIIl0IOilo0.I00000oIO(oOIoOo0O, ololIi000l, this) == ii0111o ? ii0111o : ooiIlOl1iI;
                        case 1:
/* 235 */                   WorkSpec workSpec = (WorkSpec) obj3;
/* 237 */                   Ii0111o ii0111o2 = Ii0111o.I00iOIl;
/* 239 */                   int i3 = this.I00iiI;
/* 241 */                   if (i3 != 0) {
/* 243 */                       if (i3 == 1) {
/* 245 */                           lIoii1l01l0i.I00000oOI(obj);
/* 389 */                           return ooiIlOl1iI;
                                }
/* 250 */                       I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 10 */                        return null;
                            }
/* 256 */                   lIoii1l01l0i.I00000oOI(obj);
/* 263 */                   ArrayList arrayList = ((OlIOOOoi0IlI) this.I00iiO).I00000oIO;
/* 267 */                   ArrayList arrayList2 = new ArrayList();
/* 278 */                   for (Object obj4 : arrayList) {
/* 291 */                       if (((IOo0i1o) obj4).I00000oOI(workSpec)) {
/* 293 */                           arrayList2.add(obj4);
                                }
                            }
/* 305 */                   ArrayList arrayList3 = new ArrayList(IOOi1I.I0000O(arrayList2, 10));
/* 308 */                   Iterator it = arrayList2.iterator();
/* 316 */                   while (it.hasNext()) {
/* 330 */                       arrayList3.add(((IOo0i1o) it.next()).I00000oIO(workSpec.constraints));
                            }
/* 347 */                   IlOil1ii[] ilOil1iiArr = (IlOil1ii[]) IOOi0Ool1i.I00iIi0i1o(arrayList3).toArray(new IlOil1ii[0]);
/* 352 */                   Ii1Io1loiI ii1Io1loiI = new Ii1Io1loiI(4);
/* 355 */                   ii1Io1loiI.I00iiI = ilOil1iiArr;
/* 357 */                   VarHandle.storeStoreFence();
/* 360 */                   IlOil1ii ilOil1iiI00000oIO = iIOIO0IO0l.I00000oIO(ii1Io1loiI);
/* 370 */                   IIilO0 iIilO0 = new IIilO0(8);
/* 373 */                   iIilO0.I00iiI = (OIOollli) obj2;
/* 375 */                   iIilO0.I00iiO = workSpec;
/* 377 */                   VarHandle.storeStoreFence();
/* 380 */                   this.I00iiI = 1;
                            return ilOil1iiI00000oIO.I00000oIO(iIilO0, this) == ii0111o2 ? ii0111o2 : ooiIlOl1iI;
                        case 2:
/* 166 */                   O10oIiIi0OI0 o10oIiIi0OI0 = (O10oIiIi0OI0) obj3;
/* 172 */                   WorkSpec workSpec2 = ((i01ilO) this.I00iiO).I00000oIO;
/* 174 */                   Ii0111o ii0111o3 = Ii0111o.I00iOIl;
/* 176 */                   int i4 = this.I00iiI;
/* 179 */                   if (i4 == 0) {
/* 198 */                       lIoii1l01l0i.I00000oOI(obj);
/* 201 */                       this.I00iiI = 1;
/* 203 */                       int i5 = i01II0.I00000oIO;
/* 205 */                       boolean z = workSpec2.expedited;
/* 207 */                       if (ooiIlOl1iI != ii0111o3) {
                                }
/* 233 */                       return ii0111o3;
                            }
/* 181 */                   if (i4 != 1) {
/* 183 */                       if (i4 == 2) {
/* 185 */                           lIoii1l01l0i.I00000oOI(obj);
/* 234 */                           return obj;
                                }
/* 189 */                       I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 10 */                        return null;
                            }
/* 194 */                   lIoii1l01l0i.I00000oOI(obj);
/* 210 */                   String str = i01ilOlII00I.I00000oIO;
/* 212 */                   IIi0oIl iIi0oIlI000II = IIi0oIl.I000II();
/* 216 */                   String str2 = workSpec2.workerClassName;
/* 218 */                   iIi0oIlI000II.getClass();
/* 221 */                   ListenableFuture listenableFutureStartWork = o10oIiIi0OI0.startWork();
/* 225 */                   this.I00iiI = 2;
/* 227 */                   Object objI00000oIO = i01ilOlII00I.I00000oIO(listenableFutureStartWork, o10oIiIi0OI0, this);
/* 231 */                   if (objI00000oIO != ii0111o3) {
/* 234 */                       return objI00000oIO;
                            }
/* 233 */                   return ii0111o3;
                        case 3:
/* 133 */                   Ii0111o ii0111o4 = Ii0111o.I00iOIl;
/* 135 */                   int i6 = this.I00iiI;
/* 137 */                   lIoii1l01l0i.I00000oOI(obj);
/* 140 */                   if (i6 != 0) {
/* 165 */                       return obj;
                            }
/* 145 */                   IOiOol0 iOiOol0 = (IOiOol0) this.I00iiO;
/* 147 */                   Context context = (Context) obj2;
/* 153 */                   II01IloII iI01IloII = new II01IloII(iOiOol0, (IOoil1iiIilo) null, context, (String) obj3);
/* 156 */                   this.I00iiI = 1;
/* 158 */                   Object objI00OilO00Il = iOiOol0.I00OilO00Il(context, iI01IloII, this);
                            return objI00OilO00Il == ii0111o4 ? ii0111o4 : objI00OilO00Il;
                        case 4:
/* 74 */                    Ii0111o ii0111o5 = Ii0111o.I00iOIl;
/* 76 */                    int i7 = this.I00iiI;
/* 78 */                    lIoii1l01l0i.I00000oOI(obj);
/* 81 */                    if (i7 != 0) {
/* 132 */                       return ooiIlOl1iI;
                            }
/* 86 */                    OOIoOo0O oOIoOo0O2 = (OOIoOo0O) this.I00iiO;
/* 90 */                    o100I0Oo0il o100i0oo0il = new o100I0Oo0il();
/* 93 */                    o100i0oo0il.I00000oIO = oOIoOo0O2;
/* 95 */                    VarHandle.storeStoreFence();
/* 107 */                   OlIl0i olIl0iI0000O = iOi1II01i0.I0000O((Ii0110) obj3, null, null, new o10110I((IliI1Ii1II) obj2, o100i0oo0il, oOIoOo0O2, null), 3);
/* 115 */                   O0l1iloO o0l1iloO = new O0l1iloO(12);
/* 118 */                   o0l1iloO.I00iiI = olIl0iI0000O;
/* 120 */                   VarHandle.storeStoreFence();
/* 123 */                   this.I00iiI = 1;
                            return lIIl0IOilo0.I00000oIO(oOIoOo0O2, o0l1iloO, this) == ii0111o5 ? ii0111o5 : ooiIlOl1iI;
                        default:
/* 17 */                    IIiOOI iIiOOI = (IIiOOI) obj3;
/* 19 */                    Ii0111o ii0111o6 = Ii0111o.I00iOIl;
                            try {
/* 23 */                        if (this.I00iiI != 0) {
/* 25 */                            lIoii1l01l0i.I00000oOI(obj);
                                } else {
/* 31 */                            lIoii1l01l0i.I00000oOI(obj);
/* 38 */                            IlOil1ii ilOil1iiDownload = ((o1I0I0O) this.I00iiO).download();
/* 46 */                            o11IOiiO0oll o11ioiio0oll = new o11IOiiO0oll();
/* 49 */                            o11ioiio0oll.I00iOIl = (DownloadCallback) obj2;
/* 51 */                            VarHandle.storeStoreFence();
/* 54 */                            this.I00iiI = 1;
/* 62 */                            if (((IO101i) ilOil1iiDownload).I00000oIO(o11ioiio0oll, this) == ii0111o6) {
/* 64 */                                return ii0111o6;
                                    }
                                }
/* 66 */                        iIiOOI.I00000oOI(null);
/* 73 */                        return ooiIlOl1iI;
                            } catch (Exception e) {
/* 70 */                        iIiOOI.I0000O(e);
/* 73 */                        return ooiIlOl1iI;
                            }
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
/* 14 */        public i00Iooii0i(Object obj, Object obj2, IOoil1iiIilo iOoil1iiIilo, int i) {
                    super(2, iOoil1iiIilo);
/* 15 */            this.I00iOIl = i;
                    this.I00iio = obj;
                    this.I00ilI0I1 = obj2;
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
/* 15 */        public i00Iooii0i(Object obj, Object obj2, Object obj3, IOoil1iiIilo iOoil1iiIilo, int i) {
                    super(2, iOoil1iiIilo);
/* 16 */            this.I00iOIl = i;
                    this.I00iiO = obj;
                    this.I00iio = obj2;
                    this.I00ilI0I1 = obj3;
                }
            }

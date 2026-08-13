            package p000;

            import java.util.ArrayList;
            import java.util.Iterator;
            
            public final class Ii1lO0 extends Oll0io implements IlliIl1l11O {
                public final int I00iOIl;
                public Object I00iiI;
                public final ArrayList I00iiO;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public Ii1lO0(ArrayList arrayList, IOoil1iiIilo iOoil1iiIilo, int i) {
/* 6 */             super(2, iOoil1iiIilo);
/* 1 */             this.I00iOIl = i;
/* 3 */             this.I00iiO = arrayList;
                }

                @Override
                public final IOoil1iiIilo create(Object obj, IOoil1iiIilo iOoil1iiIilo) {
/* 1 */             int i = this.I00iOIl;
/* 3 */             ArrayList arrayList = this.I00iiO;
                    switch (i) {
                        case 0:
/* 29 */                    Ii1lO0 ii1lO0 = new Ii1lO0(arrayList, iOoil1iiIilo, 0);
/* 32 */                    ii1lO0.I00iiI = obj;
/* 34 */                    return ii1lO0;
                        case 1:
/* 20 */                    Ii1lO0 ii1lO02 = new Ii1lO0(arrayList, iOoil1iiIilo, 1);
/* 23 */                    ii1lO02.I00iiI = obj;
/* 25 */                    return ii1lO02;
                        default:
/* 11 */                    Ii1lO0 ii1lO03 = new Ii1lO0(arrayList, iOoil1iiIilo, 2);
/* 14 */                    ii1lO03.I00iiI = obj;
/* 16 */                    return ii1lO03;
                    }
                }

                @Override
                public final Object invoke(Object obj, Object obj2) {
/* 1 */             int i = this.I00iOIl;
/* 3 */             OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
                    switch (i) {
                        case 0:
/* 48 */                    return ((Ii1lO0) create((Oio11o) obj, (IOoil1iiIilo) obj2)).invokeSuspend(ooiIlOl1iI);
                        case 1:
/* 33 */                    return ((Ii1lO0) create((Ol0olo0) obj, (IOoil1iiIilo) obj2)).invokeSuspend(ooiIlOl1iI);
                        default:
/* 18 */                    return ((Ii1lO0) create((O1i1liOl) obj, (IOoil1iiIilo) obj2)).invokeSuspend(ooiIlOl1iI);
                    }
                }

                @Override
                public final Object invokeSuspend(Object obj) throws Throwable {
                    Object next;
/* 1 */             int i = this.I00iOIl;
/* 3 */             ArrayList<O1i1Ooo0ll> arrayList = this.I00iiO;
/* 5 */             Object obj2 = this.I00iiI;
                    switch (i) {
                        case 0:
/* 149 */                   Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 151 */                   lIoii1l01l0i.I00000oOI(obj);
/* 158 */                   Oio0ooOi0 oio0ooOi0 = (Oio0ooOi0) ((Oio11o) obj2).I00100o1O0lo();
/* 160 */                   oio0ooOi0.I0000O();
/* 167 */                   ((Oio11o) oio0ooOi0.I00iiI).I00111O();
/* 170 */                   oio0ooOi0.I0000O();
/* 177 */                   ((Oio11o) oio0ooOi0.I00iiI).I0010I0i(arrayList);
/* 180 */                   return oio0ooOi0.I00000oOI();
                        case 1:
/* 118 */                   Ii0111o ii0111o2 = Ii0111o.I00iOIl;
/* 120 */                   lIoii1l01l0i.I00000oOI(obj);
/* 127 */                   Ol0olO ol0olO = (Ol0olO) ((Ol0olo0) obj2).I00100o1O0lo();
/* 129 */                   ol0olO.I0000O();
/* 136 */                   ((Ol0olo0) ol0olO.I00iiI).I0010o();
/* 139 */                   ol0olO.I000II(arrayList);
/* 142 */                   return ol0olO.I00000oOI();
                        default:
/* 10 */                    O1i1liOl o1i1liOl = (O1i1liOl) obj2;
/* 12 */                    Ii0111o ii0111o3 = Ii0111o.I00iOIl;
/* 14 */                    lIoii1l01l0i.I00000oOI(obj);
/* 25 */                    ArrayList arrayList2 = new ArrayList(IOOi1I.I0000O(arrayList, 10));
/* 36 */                    for (O1i1Ooo0ll o1i1Ooo0ll : arrayList) {
/* 44 */                        String str = o1i1Ooo0ll.I0000Il00O;
/* 46 */                        O1i1OolO o1i1OolO = o1i1Ooo0ll.I00000oIO;
/* 48 */                        if (str != null) {
/* 54 */                            Iterator<E> it = o1i1liOl.I00111O().iterator();
                                    while (true) {
/* 62 */                                if (it.hasNext()) {
/* 64 */                                    next = it.next();
/* 83 */                                    if (O0000Ioio00.I0000O(((O1i1OolO) next).I001i1O0Ol(), o1i1OolO.I001i1O0Ol())) {
                                            }
                                        } else {
/* 86 */                                    next = null;
                                        }
                                    }
/* 87 */                            O1i1OolO o1i1OolO2 = (O1i1OolO) next;
/* 89 */                            if (o1i1OolO2 != null) {
/* 92 */                                o1i1OolO = o1i1OolO2;
                                    }
                                }
/* 93 */                        arrayList2.add(o1i1OolO);
                            }
/* 97 */                    O1i1l1 o1i1l1I001IIilI0O = O1i1liOl.I001IIilI0O();
/* 101 */                   o1i1l1I001IIilI0O.I0000O();
/* 108 */                   ((O1i1liOl) o1i1l1I001IIilI0O.I00iiI).I0010I0i(arrayList2);
/* 111 */                   return o1i1l1I001IIilI0O.I00000oOI();
                    }
                }
            }

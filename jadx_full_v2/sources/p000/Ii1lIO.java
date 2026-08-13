            package p000;

            import java.util.ArrayList;
            import java.util.Collection;
            import java.util.Iterator;
            import java.util.Set;
            
            public final class Ii1lIO extends Oll0io implements IlliIl1l11O {
                public final int I00iOIl;
                public Object I00iiI;
                public final Set I00iiO;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public Ii1lIO(Set set, IOoil1iiIilo iOoil1iiIilo, int i) {
/* 6 */             super(2, iOoil1iiIilo);
/* 1 */             this.I00iOIl = i;
/* 3 */             this.I00iiO = set;
                }

                @Override
                public final IOoil1iiIilo create(Object obj, IOoil1iiIilo iOoil1iiIilo) {
/* 1 */             int i = this.I00iOIl;
/* 3 */             Set set = this.I00iiO;
                    switch (i) {
                        case 0:
/* 20 */                    Ii1lIO ii1lIO = new Ii1lIO(set, iOoil1iiIilo, 0);
/* 23 */                    ii1lIO.I00iiI = obj;
/* 25 */                    return ii1lIO;
                        default:
/* 11 */                    Ii1lIO ii1lIO2 = new Ii1lIO(set, iOoil1iiIilo, 1);
/* 14 */                    ii1lIO2.I00iiI = obj;
/* 16 */                    return ii1lIO2;
                    }
                }

                @Override
                public final Object invoke(Object obj, Object obj2) {
/* 1 */             int i = this.I00iOIl;
/* 3 */             OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
                    switch (i) {
                        case 0:
/* 33 */                    return ((Ii1lIO) create((Ol0olo0) obj, (IOoil1iiIilo) obj2)).invokeSuspend(ooiIlOl1iI);
                        default:
/* 18 */                    return ((Ii1lIO) create((OI0ooi10l) obj, (IOoil1iiIilo) obj2)).invokeSuspend(ooiIlOl1iI);
                    }
                }

                @Override
                public final Object invokeSuspend(Object obj) throws Throwable {
/* 1 */             int i = this.I00iOIl;
/* 3 */             Set set = this.I00iiO;
                    switch (i) {
                        case 0:
/* 113 */                   Ol0olo0 ol0olo0 = (Ol0olo0) this.I00iiI;
/* 115 */                   Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 117 */                   lIoii1l01l0i.I00000oOI(obj);
/* 120 */                   Iool1IOO1o0i iool1IOO1o0iI001IIilI0O = ol0olo0.I001IIilI0O();
/* 126 */                   ArrayList arrayList = new ArrayList();
/* 137 */                   for (Object obj2 : iool1IOO1o0iI001IIilI0O) {
/* 154 */                       if (!set.contains(((Ol0ioI1iI) obj2).I001i1O0Ol())) {
/* 156 */                           arrayList.add(obj2);
                                }
                            }
/* 164 */                   Ol0olO ol0olO = (Ol0olO) ol0olo0.I00100o1O0lo();
/* 166 */                   ol0olO.I0000O();
/* 173 */                   ((Ol0olo0) ol0olO.I00iiI).I0010o();
/* 176 */                   ol0olO.I000II(arrayList);
/* 179 */                   return ol0olO.I00000oOI();
                        default:
/* 8 */                     Ii0111o ii0111o2 = Ii0111o.I00iOIl;
/* 10 */                    lIoii1l01l0i.I00000oOI(obj);
/* 21 */                    Set setKeySet = ((OI0ooi10l) this.I00iiI).I00000oIO().keySet();
/* 35 */                    ArrayList arrayList2 = new ArrayList(IOOi1I.I0000O(setKeySet, 10));
/* 38 */                    Iterator it = setKeySet.iterator();
/* 46 */                    while (it.hasNext()) {
/* 56 */                        arrayList2.add(((OOI0IO111Ii) it.next()).I00000oIO);
                            }
/* 62 */                    boolean z = true;
/* 63 */                    if (set != OiooIl.I00000oIO) {
/* 66 */                        Set set2 = set;
/* 71 */                        if ((set2 instanceof Collection) && set2.isEmpty()) {
/* 82 */                            z = false;
                                } else {
/* 84 */                            Iterator it2 = set2.iterator();
/* 92 */                            while (it2.hasNext()) {
/* 104 */                               if (!arrayList2.contains((String) it2.next())) {
                                        }
                                    }
/* 82 */                            z = false;
                                }
                            }
/* 106 */                   return Boolean.valueOf(z);
                    }
                }
            }

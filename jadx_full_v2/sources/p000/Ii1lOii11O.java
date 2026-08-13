            package p000;

            import java.lang.invoke.VarHandle;
            import java.util.ArrayList;
            import java.util.Iterator;
            
            public final class Ii1lOii11O extends Oll0io implements IlliIl1l11O {
                public final int I00iOIl;
                public Object I00iiI;
                public final boolean I00iiO;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public Ii1lOii11O(boolean z, IOoil1iiIilo iOoil1iiIilo, int i) {
/* 6 */             super(2, iOoil1iiIilo);
/* 1 */             this.I00iOIl = i;
/* 3 */             this.I00iiO = z;
                }

                @Override
                public final IOoil1iiIilo create(Object obj, IOoil1iiIilo iOoil1iiIilo) {
                    switch (this.I00iOIl) {
                        case 0:
/* 77 */                    Ii1lOii11O ii1lOii11O = new Ii1lOii11O(this.I00iiO, iOoil1iiIilo, 0);
/* 80 */                    ii1lOii11O.I00iiI = obj;
/* 82 */                    return ii1lOii11O;
                        case 1:
/* 66 */                    Ii1lOii11O ii1lOii11O2 = new Ii1lOii11O(this.I00iiO, iOoil1iiIilo, 1);
/* 69 */                    ii1lOii11O2.I00iiI = obj;
/* 71 */                    return ii1lOii11O2;
                        case 2:
/* 55 */                    Ii1lOii11O ii1lOii11O3 = new Ii1lOii11O(this.I00iiO, iOoil1iiIilo, 2);
/* 58 */                    ii1lOii11O3.I00iiI = obj;
/* 60 */                    return ii1lOii11O3;
                        case 3:
/* 44 */                    Ii1lOii11O ii1lOii11O4 = new Ii1lOii11O(this.I00iiO, iOoil1iiIilo, 3);
/* 47 */                    ii1lOii11O4.I00iiI = obj;
/* 49 */                    return ii1lOii11O4;
                        case 4:
/* 33 */                    Ii1lOii11O ii1lOii11O5 = new Ii1lOii11O(this.I00iiO, iOoil1iiIilo, 4);
/* 36 */                    ii1lOii11O5.I00iiI = obj;
/* 38 */                    return ii1lOii11O5;
                        case 5:
/* 22 */                    Ii1lOii11O ii1lOii11O6 = new Ii1lOii11O(this.I00iiO, iOoil1iiIilo, 5);
/* 25 */                    ii1lOii11O6.I00iiI = obj;
/* 27 */                    return ii1lOii11O6;
                        default:
/* 11 */                    Ii1lOii11O ii1lOii11O7 = new Ii1lOii11O(this.I00iiO, iOoil1iiIilo, 6);
/* 14 */                    ii1lOii11O7.I00iiI = obj;
/* 16 */                    return ii1lOii11O7;
                    }
                }

                @Override
                public final Object invoke(Object obj, Object obj2) throws Throwable {
/* 1 */             int i = this.I00iOIl;
/* 3 */             OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
                    switch (i) {
                        case 0:
/* 107 */                   return ((Ii1lOii11O) create((Ol0olo0) obj, (IOoil1iiIilo) obj2)).invokeSuspend(ooiIlOl1iI);
                        case 1:
/* 92 */                    return ((Ii1lOii11O) create((Oio11o) obj, (IOoil1iiIilo) obj2)).invokeSuspend(ooiIlOl1iI);
                        case 2:
/* 77 */                    return ((Ii1lOii11O) create((Oio11o) obj, (IOoil1iiIilo) obj2)).invokeSuspend(ooiIlOl1iI);
                        case 3:
/* 62 */                    return ((Ii1lOii11O) create((Oio11o) obj, (IOoil1iiIilo) obj2)).invokeSuspend(ooiIlOl1iI);
                        case 4:
/* 47 */                    return ((Ii1lOii11O) create((Oio11o) obj, (IOoil1iiIilo) obj2)).invokeSuspend(ooiIlOl1iI);
                        case 5:
/* 32 */                    return ((Ii1lOii11O) create((Oio11o) obj, (IOoil1iiIilo) obj2)).invokeSuspend(ooiIlOl1iI);
                        default:
/* 18 */                    ((Ii1lOii11O) create((IoO10oI0o) obj, (IOoil1iiIilo) obj2)).invokeSuspend(ooiIlOl1iI);
/* 21 */                    return ooiIlOl1iI;
                    }
                }

                @Override
                public final Object invokeSuspend(Object obj) throws Throwable {
/* 1 */             int i = this.I00iOIl;
/* 3 */             boolean z = this.I00iiO;
/* 5 */             Object obj2 = this.I00iiI;
                    switch (i) {
                        case 0:
/* 154 */                   Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 156 */                   lIoii1l01l0i.I00000oOI(obj);
/* 161 */                   ArrayList arrayList = new ArrayList();
/* 168 */                   Iterator it = ((Ol0olo0) obj2).I001IIilI0O().iterator();
/* 176 */                   while (it.hasNext()) {
/* 188 */                       Ol0ilO ol0ilO = (Ol0ilO) ((Ol0ioI1iI) it.next()).I00100o1O0lo();
/* 190 */                       ol0ilO.I000II(z);
/* 197 */                       arrayList.add(ol0ilO.I00000oOI());
                            }
/* 201 */                   Ol0olO ol0olOI001IO000 = Ol0olo0.I001IO000();
/* 205 */                   ol0olOI001IO000.I000II(arrayList);
/* 208 */                   return ol0olOI001IO000.I00000oOI();
                        case 1:
/* 131 */                   Ii0111o ii0111o2 = Ii0111o.I00iOIl;
/* 133 */                   lIoii1l01l0i.I00000oOI(obj);
/* 140 */                   Oio0ooOi0 oio0ooOi0 = (Oio0ooOi0) ((Oio11o) obj2).I00100o1O0lo();
/* 144 */                   oio0ooOi0.I000II("collapse_thinking", z);
/* 147 */                   return oio0ooOi0.I00000oOI();
                        case 2:
/* 108 */                   Ii0111o ii0111o3 = Ii0111o.I00iOIl;
/* 110 */                   lIoii1l01l0i.I00000oOI(obj);
/* 117 */                   Oio0ooOi0 oio0ooOi02 = (Oio0ooOi0) ((Oio11o) obj2).I00100o1O0lo();
/* 121 */                   oio0ooOi02.I000II("confirm_clear_chat", z);
/* 124 */                   return oio0ooOi02.I00000oOI();
                        case 3:
/* 85 */                    Ii0111o ii0111o4 = Ii0111o.I00iOIl;
/* 87 */                    lIoii1l01l0i.I00000oOI(obj);
/* 94 */                    Oio0ooOi0 oio0ooOi03 = (Oio0ooOi0) ((Oio11o) obj2).I00100o1O0lo();
/* 98 */                    oio0ooOi03.I000II("haptic_on_send", z);
/* 101 */                   return oio0ooOi03.I00000oOI();
                        case 4:
/* 62 */                    Ii0111o ii0111o5 = Ii0111o.I00iOIl;
/* 64 */                    lIoii1l01l0i.I00000oOI(obj);
/* 71 */                    Oio0ooOi0 oio0ooOi04 = (Oio0ooOi0) ((Oio11o) obj2).I00100o1O0lo();
/* 75 */                    oio0ooOi04.I000II("keep_screen_on", z);
/* 78 */                    return oio0ooOi04.I00000oOI();
                        case 5:
/* 39 */                    Ii0111o ii0111o6 = Ii0111o.I00iOIl;
/* 41 */                    lIoii1l01l0i.I00000oOI(obj);
/* 48 */                    Oio0ooOi0 oio0ooOi05 = (Oio0ooOi0) ((Oio11o) obj2).I00100o1O0lo();
/* 52 */                    oio0ooOi05.I000II("realtime_tts", z);
/* 55 */                    return oio0ooOi05.I00000oOI();
                        default:
/* 12 */                    Ii0111o ii0111o7 = Ii0111o.I00iOIl;
/* 14 */                    lIoii1l01l0i.I00000oOI(obj);
/* 17 */                    IOlOl10 iOlOl10 = ((IoO10oI0o) obj2).I0001Ioi1lo;
/* 19 */                    I1OoollI1Il1 i1OoollI1Il1 = IoIiolOl00.I0000Il00O;
/* 23 */                    IoIii1ill1OO ioIii1ill1OO = new IoIii1ill1OO();
/* 26 */                    ioIii1ill1OO.I00iOIl = z;
/* 28 */                    VarHandle.storeStoreFence();
/* 31 */                    iOlOl10.I00000oIO(i1OoollI1Il1, ioIii1ill1OO);
/* 34 */                    return OoiIlOl1iI.I00000oIO;
                    }
                }
            }

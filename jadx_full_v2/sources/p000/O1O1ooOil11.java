            package p000;

            import com.box.gallery.MainActivity;
            import java.lang.invoke.VarHandle;
            
            public final class O1O1ooOil11 extends Oll0io implements IlliIl1l11O {
                public final int I00iOIl;
                public int I00iiI;
                public final MainActivity I00iiO;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public O1O1ooOil11(MainActivity mainActivity, IOoil1iiIilo iOoil1iiIilo, int i) {
/* 6 */             super(2, iOoil1iiIilo);
/* 1 */             this.I00iOIl = i;
/* 3 */             this.I00iiO = mainActivity;
                }

                @Override
                public final IOoil1iiIilo create(Object obj, IOoil1iiIilo iOoil1iiIilo) {
/* 1 */             int i = this.I00iOIl;
/* 3 */             MainActivity mainActivity = this.I00iiO;
                    switch (i) {
                        case 0:
/* 25 */                    return new O1O1ooOil11(mainActivity, iOoil1iiIilo, 0);
                        case 1:
/* 18 */                    return new O1O1ooOil11(mainActivity, iOoil1iiIilo, 1);
                        default:
/* 11 */                    return new O1O1ooOil11(mainActivity, iOoil1iiIilo, 2);
                    }
                }

                @Override
                public final Object invoke(Object obj, Object obj2) throws Throwable {
/* 1 */             int i = this.I00iOIl;
/* 3 */             OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
/* 5 */             Ii0110 ii0110 = (Ii0110) obj;
/* 7 */             IOoil1iiIilo iOoil1iiIilo = (IOoil1iiIilo) obj2;
                    switch (i) {
                        case 0:
/* 42 */                    ((O1O1ooOil11) create(ii0110, iOoil1iiIilo)).invokeSuspend(ooiIlOl1iI);
                            break;
                        case 1:
/* 30 */                    ((O1O1ooOil11) create(ii0110, iOoil1iiIilo)).invokeSuspend(ooiIlOl1iI);
                            break;
                        default:
/* 18 */                    ((O1O1ooOil11) create(ii0110, iOoil1iiIilo)).invokeSuspend(ooiIlOl1iI);
                            break;
                    }
/* 21 */            return Ii0111o.I00iOIl;
                }

                @Override
                public final Object invokeSuspend(Object obj) throws Throwable {
/* 1 */             int i = this.I00iOIl;
/* 3 */             MainActivity mainActivity = this.I00iiO;
/* 7 */             int i2 = 1;
                    switch (i) {
                        case 0:
/* 99 */                    Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 101 */                   int i3 = this.I00iiI;
/* 103 */                   if (i3 != 0) {
/* 105 */                       if (i3 != 1) {
/* 107 */                           I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 8 */                             return null;
                                }
/* 111 */                       lIoii1l01l0i.I00000oOI(obj);
/* 114 */                       IOOlIIilOl0.I0000Il00O();
/* 8 */                         return null;
                            }
/* 118 */                   lIoii1l01l0i.I00000oOI(obj);
/* 121 */                   OOli1O oOli1O = I1IIl0I0l1I.I0000Il00O;
/* 126 */                   O1O1oo1lio1 o1O1oo1lio1 = new O1O1oo1lio1(0);
/* 129 */                   o1O1oo1lio1.I00iiI = mainActivity;
/* 131 */                   VarHandle.storeStoreFence();
/* 134 */                   this.I00iiI = 1;
/* 138 */                   oOli1O.I00iOIl.I00000oIO(o1O1oo1lio1, this);
/* 141 */                   return ii0111o;
                        case 1:
/* 56 */                    Ii0111o ii0111o2 = Ii0111o.I00iOIl;
/* 58 */                    int i4 = this.I00iiI;
/* 60 */                    if (i4 != 0) {
/* 62 */                        if (i4 != 1) {
/* 64 */                            I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 8 */                             return null;
                                }
/* 68 */                        lIoii1l01l0i.I00000oOI(obj);
/* 71 */                        IOOlIIilOl0.I0000Il00O();
/* 8 */                         return null;
                            }
/* 75 */                    lIoii1l01l0i.I00000oOI(obj);
/* 78 */                    OOli1O oOli1O2 = I1IIl0I0l1I.I0000oI00;
/* 82 */                    O1O1oo1lio1 o1O1oo1lio12 = new O1O1oo1lio1(i2);
/* 85 */                    o1O1oo1lio12.I00iiI = mainActivity;
/* 87 */                    VarHandle.storeStoreFence();
/* 90 */                    this.I00iiI = 1;
/* 94 */                    oOli1O2.I00iOIl.I00000oIO(o1O1oo1lio12, this);
/* 97 */                    return ii0111o2;
                        default:
/* 12 */                    Ii0111o ii0111o3 = Ii0111o.I00iOIl;
/* 14 */                    int i5 = this.I00iiI;
/* 16 */                    if (i5 != 0) {
/* 18 */                        if (i5 != 1) {
/* 20 */                            I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 8 */                             return null;
                                }
/* 24 */                        lIoii1l01l0i.I00000oOI(obj);
/* 27 */                        IOOlIIilOl0.I0000Il00O();
/* 8 */                         return null;
                            }
/* 31 */                    lIoii1l01l0i.I00000oOI(obj);
/* 34 */                    OOli1O oOli1O3 = I1IIl0I0l1I.I000II;
/* 39 */                    O1O1oo1lio1 o1O1oo1lio13 = new O1O1oo1lio1(2);
/* 42 */                    o1O1oo1lio13.I00iiI = mainActivity;
/* 44 */                    VarHandle.storeStoreFence();
/* 47 */                    this.I00iiI = 1;
/* 51 */                    oOli1O3.I00iOIl.I00000oIO(o1O1oo1lio13, this);
/* 54 */                    return ii0111o3;
                    }
                }
            }

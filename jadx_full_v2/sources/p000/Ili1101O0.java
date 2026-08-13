            package p000;

            import java.lang.invoke.VarHandle;
            import java.util.ArrayList;
            
            public final class Ili1101O0 extends Oll0io implements IlliIl1l11O {
                public final int I00iOIl;
                public int I00iiI;
                public final OI0lOIiOIOOo I00iiO;
                public final OI10i0Il I00iio;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public Ili1101O0(OI0lOIiOIOOo oI0lOIiOIOOo, OI10i0Il oI10i0Il, IOoil1iiIilo iOoil1iiIilo, int i) {
/* 8 */             super(2, iOoil1iiIilo);
/* 1 */             this.I00iOIl = i;
/* 3 */             this.I00iiO = oI0lOIiOIOOo;
/* 5 */             this.I00iio = oI10i0Il;
                }

                @Override
                public final IOoil1iiIilo create(Object obj, IOoil1iiIilo iOoil1iiIilo) {
                    switch (this.I00iOIl) {
                        case 0:
/* 24 */                    return new Ili1101O0(this.I00iiO, this.I00iio, iOoil1iiIilo, 0);
                        default:
/* 13 */                    return new Ili1101O0(this.I00iiO, this.I00iio, iOoil1iiIilo, 1);
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
/* 18 */            return ((Ili1101O0) create(ii0110, iOoil1iiIilo)).invokeSuspend(ooiIlOl1iI);
                }

                @Override
                public final Object invokeSuspend(Object obj) throws Throwable {
/* 1 */             int i = this.I00iOIl;
/* 3 */             OI10i0Il oI10i0Il = this.I00iio;
/* 5 */             OI0lOIiOIOOo oI0lOIiOIOOo = this.I00iiO;
/* 10 */            OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
                    switch (i) {
                        case 0:
/* 65 */                    Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 67 */                    int i2 = this.I00iiI;
/* 69 */                    if (i2 != 0) {
/* 71 */                        if (i2 == 1) {
/* 73 */                            lIoii1l01l0i.I00000oOI(obj);
/* 76 */                            return ooiIlOl1iI;
                                }
/* 78 */                        I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 7 */                         return null;
                            }
/* 82 */                    lIoii1l01l0i.I00000oOI(obj);
/* 87 */                    ArrayList arrayList = new ArrayList();
/* 90 */                    Oiolio oiolio = oI0lOIiOIOOo.I00000oIO;
/* 95 */                    Ili10oOio1O ili10oOio1O = new Ili10oOio1O(0);
/* 98 */                    ili10oOio1O.I00iiI = arrayList;
/* 100 */                   ili10oOio1O.I00iiO = oI10i0Il;
/* 102 */                   VarHandle.storeStoreFence();
/* 105 */                   this.I00iiI = 1;
/* 107 */                   oiolio.getClass();
/* 110 */                   Oiolio.I000lI(oiolio, ili10oOio1O, this);
/* 113 */                   return ii0111o;
                        default:
/* 16 */                    Ii0111o ii0111o2 = Ii0111o.I00iOIl;
/* 18 */                    int i3 = this.I00iiI;
/* 20 */                    if (i3 != 0) {
/* 22 */                        if (i3 == 1) {
/* 24 */                            lIoii1l01l0i.I00000oOI(obj);
/* 27 */                            return ooiIlOl1iI;
                                }
/* 29 */                        I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 7 */                         return null;
                            }
/* 33 */                    lIoii1l01l0i.I00000oOI(obj);
/* 38 */                    ArrayList arrayList2 = new ArrayList();
/* 41 */                    Oiolio oiolio2 = oI0lOIiOIOOo.I00000oIO;
/* 45 */                    Ili10oOio1O ili10oOio1O2 = new Ili10oOio1O(1);
/* 48 */                    ili10oOio1O2.I00iiI = arrayList2;
/* 50 */                    ili10oOio1O2.I00iiO = oI10i0Il;
/* 52 */                    VarHandle.storeStoreFence();
/* 55 */                    this.I00iiI = 1;
/* 57 */                    oiolio2.getClass();
/* 60 */                    Oiolio.I000lI(oiolio2, ili10oOio1O2, this);
/* 63 */                    return ii0111o2;
                    }
                }
            }

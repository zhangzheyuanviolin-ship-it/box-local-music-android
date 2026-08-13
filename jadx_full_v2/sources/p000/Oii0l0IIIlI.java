            package p000;

            import kotlin.jvm.functions.Function1;
            
            public final class Oii0l0IIIlI extends Oll0io implements Function1 {
                public final int I00iOIl;
                public int I00iiI;
                public final Oii110oOoO I00iiO;
                public final Object I00iio;
                public final OoI1Oi0l1I0o I00ilI0I1;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public Oii0l0IIIlI(Oii110oOoO oii110oOoO, Object obj, OoI1Oi0l1I0o ooI1Oi0l1I0o, IOoil1iiIilo iOoil1iiIilo, int i) {
/* 10 */            super(1, iOoil1iiIilo);
/* 1 */             this.I00iOIl = i;
/* 3 */             this.I00iiO = oii110oOoO;
/* 5 */             this.I00iio = obj;
/* 7 */             this.I00ilI0I1 = ooI1Oi0l1I0o;
                }

                @Override
                public final IOoil1iiIilo create(IOoil1iiIilo iOoil1iiIilo) {
                    switch (this.I00iOIl) {
                        case 0:
/* 31 */                    return new Oii0l0IIIlI(this.I00iiO, this.I00iio, this.I00ilI0I1, iOoil1iiIilo, 0);
                        default:
/* 16 */                    return new Oii0l0IIIlI(this.I00iiO, this.I00iio, this.I00ilI0I1, iOoil1iiIilo, 1);
                    }
                }

                @Override
                public final Object invoke(Object obj) {
/* 1 */             int i = this.I00iOIl;
/* 3 */             OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
/* 5 */             IOoil1iiIilo iOoil1iiIilo = (IOoil1iiIilo) obj;
                    switch (i) {
                    }
/* 16 */            return ((Oii0l0IIIlI) create(iOoil1iiIilo)).invokeSuspend(ooiIlOl1iI);
                }

                @Override
                public final Object invokeSuspend(Object obj) throws Throwable {
/* 1 */             int i = this.I00iOIl;
/* 3 */             OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
                    switch (i) {
                        case 0:
/* 120 */                   Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 122 */                   int i2 = this.I00iiI;
/* 124 */                   if (i2 == 0) {
/* 137 */                       lIoii1l01l0i.I00000oOI(obj);
/* 151 */                       I000oI1ioi i000oI1ioi = new I000oI1ioi(this.I00iiO, this.I00iio, this.I00ilI0I1, null, 19);
/* 154 */                       this.I00iiI = 1;
                                return il001oo1.I0000Il00O(i000oI1ioi, this) == ii0111o ? ii0111o : ooiIlOl1iI;
                            }
/* 126 */                   if (i2 == 1) {
/* 128 */                       lIoii1l01l0i.I00000oOI(obj);
/* 163 */                       return ooiIlOl1iI;
                            }
/* 132 */                   I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 5 */                     return null;
                        default:
/* 12 */                    Oii110oOoO oii110oOoO = this.I00iiO;
/* 14 */                    OIooliIO0 oIooliIO0 = oii110oOoO.I00iiI;
/* 16 */                    Ii0111o ii0111o2 = Ii0111o.I00iOIl;
/* 18 */                    int i3 = this.I00iiI;
/* 20 */                    OoI1Oi0l1I0o ooI1Oi0l1I0o = this.I00ilI0I1;
/* 22 */                    if (i3 == 0) {
/* 35 */                        lIoii1l01l0i.I00000oOI(obj);
/* 38 */                        oii110oOoO.I010iIIOlo();
/* 43 */                        oii110oOoO.I00lli11 = Long.MIN_VALUE;
/* 46 */                        oii110oOoO.I010o0o0oO(0.0f);
/* 51 */                        Object value = oii110oOoO.I00iiO.getValue();
/* 55 */                        Object obj2 = this.I00iio;
/* 81 */                        float f = O0000Ioio00.I0000O(obj2, value) ? -4.0f : O0000Ioio00.I0000O(obj2, oIooliIO0.getValue()) ? -5.0f : -3.0f;
/* 82 */                        ooI1Oi0l1I0o.I00111O(obj2);
/* 87 */                        ooI1Oi0l1I0o.I00100l0(0L);
/* 90 */                        oIooliIO0.setValue(obj2);
/* 93 */                        oii110oOoO.I010o0o0oO(0.0f);
/* 96 */                        oii110oOoO.I00oooO(obj2);
/* 99 */                        ooI1Oi0l1I0o.I000l1(f);
/* 104 */                       if (f == -3.0f) {
/* 106 */                           this.I00iiI = 1;
/* 112 */                           if (oii110oOoO.I0110OiO(this) == ii0111o2) {
/* 114 */                               return ii0111o2;
                                    }
                                }
                            } else {
/* 24 */                        if (i3 != 1) {
/* 30 */                            I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 5 */                             return null;
                                }
/* 26 */                        lIoii1l01l0i.I00000oOI(obj);
                            }
/* 116 */                   ooI1Oi0l1I0o.I000iOII();
/* 119 */                   return ooiIlOl1iI;
                    }
                }
            }

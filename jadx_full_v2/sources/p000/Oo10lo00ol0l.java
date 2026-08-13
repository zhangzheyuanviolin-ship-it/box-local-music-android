            package p000;
            
            public final class Oo10lo00ol0l extends Oll0io implements IlliIl1l11O {
                public final int I00iOIl;
                public int I00iiI;
                public final Oo10o0lI00O I00iiO;
                public final float I00iio;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public Oo10lo00ol0l(Oo10o0lI00O oo10o0lI00O, float f, IOoil1iiIilo iOoil1iiIilo, int i) {
/* 8 */             super(2, iOoil1iiIilo);
/* 1 */             this.I00iOIl = i;
/* 3 */             this.I00iiO = oo10o0lI00O;
/* 5 */             this.I00iio = f;
                }

                @Override
                public final IOoil1iiIilo create(Object obj, IOoil1iiIilo iOoil1iiIilo) {
/* 1 */             int i = this.I00iOIl;
/* 3 */             float f = this.I00iio;
/* 5 */             Oo10o0lI00O oo10o0lI00O = this.I00iiO;
                    switch (i) {
                        case 0:
/* 20 */                    return new Oo10lo00ol0l(oo10o0lI00O, f, iOoil1iiIilo, 0);
                        default:
/* 13 */                    return new Oo10lo00ol0l(oo10o0lI00O, f, iOoil1iiIilo, 1);
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
/* 18 */            return ((Oo10lo00ol0l) create(ii0110, iOoil1iiIilo)).invokeSuspend(ooiIlOl1iI);
                }

                @Override
                public final Object invokeSuspend(Object obj) throws Throwable {
                    Object objI00000oIO;
                    Object objI00000oIO2;
/* 1 */             int i = this.I00iOIl;
/* 3 */             OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
/* 5 */             float f = this.I00iio;
/* 11 */            Oo10o0lI00O oo10o0lI00O = this.I00iiO;
                    switch (i) {
                        case 0:
/* 76 */                    Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 78 */                    int i2 = this.I00iiI;
/* 80 */                    if (i2 == 0) {
/* 94 */                        lIoii1l01l0i.I00000oOI(obj);
/* 97 */                        I10i01 i10i01 = oo10o0lI00O.I00oIiI10;
/* 99 */                        if (i10i01 != null) {
/* 103 */                           Float f2 = new Float(f);
/* 113 */                           I110IiI0o1Il i110IiI0o1Il = oo10o0lI00O.I00oI0i ? OllI1oooIo1o.I00000oOI : oo10o0lI00O.I00o101lO;
/* 115 */                           this.I00iiI = 1;
/* 125 */                           objI00000oIO = I10i01.I00000oIO(i10i01, f2, i110IiI0o1Il, null, null, this, 12);
/* 129 */                           if (objI00000oIO == ii0111o) {
                                        break;
                                    }
                                }
                            } else if (i2 != 1) {
/* 89 */                        I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
                                break;
                            } else {
/* 84 */                        lIoii1l01l0i.I00000oOI(obj);
/* 87 */                        objI00000oIO = obj;
                            }
                            break;
                        default:
/* 16 */                    Ii0111o ii0111o2 = Ii0111o.I00iOIl;
/* 18 */                    int i3 = this.I00iiI;
/* 20 */                    if (i3 == 0) {
/* 34 */                        lIoii1l01l0i.I00000oOI(obj);
/* 37 */                        I10i01 i10i012 = oo10o0lI00O.I00oII;
/* 39 */                        if (i10i012 != null) {
/* 43 */                            Float f3 = new Float(f);
/* 53 */                            I110IiI0o1Il i110IiI0o1Il2 = oo10o0lI00O.I00oI0i ? OllI1oooIo1o.I00000oOI : oo10o0lI00O.I00o101lO;
/* 55 */                            this.I00iiI = 1;
/* 65 */                            objI00000oIO2 = I10i01.I00000oIO(i10i012, f3, i110IiI0o1Il2, null, null, this, 12);
/* 69 */                            if (objI00000oIO2 == ii0111o2) {
                                        break;
                                    }
                                }
                            } else if (i3 != 1) {
/* 29 */                        I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
                                break;
                            } else {
/* 24 */                        lIoii1l01l0i.I00000oOI(obj);
/* 27 */                        objI00000oIO2 = obj;
                            }
                            break;
                    }
/* 75 */            return ooiIlOl1iI;
                }
            }

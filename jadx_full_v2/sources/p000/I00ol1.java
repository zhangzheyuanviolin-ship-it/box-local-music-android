            package p000;
            
            public final class I00ol1 extends Oll0io implements IlliIl1l11O {
                public final int I00iOIl;
                public int I00iiI;
                public final OI0lOIiOIOOo I00iiO;
                public final OOIII1oOoolO I00iio;
                public final I00oo1iO0ll I00ilI0I1;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public I00ol1(OI0lOIiOIOOo oI0lOIiOIOOo, OOIII1oOoolO oOIII1oOoolO, I00oo1iO0ll i00oo1iO0ll, IOoil1iiIilo iOoil1iiIilo, int i) {
/* 10 */            super(2, iOoil1iiIilo);
/* 1 */             this.I00iOIl = i;
/* 3 */             this.I00iiO = oI0lOIiOIOOo;
/* 5 */             this.I00iio = oOIII1oOoolO;
/* 7 */             this.I00ilI0I1 = i00oo1iO0ll;
                }

                @Override
                public final IOoil1iiIilo create(Object obj, IOoil1iiIilo iOoil1iiIilo) {
                    switch (this.I00iOIl) {
                        case 0:
/* 31 */                    return new I00ol1(this.I00iiO, this.I00iio, this.I00ilI0I1, iOoil1iiIilo, 0);
                        default:
/* 16 */                    return new I00ol1(this.I00iiO, this.I00iio, this.I00ilI0I1, iOoil1iiIilo, 1);
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
/* 18 */            return ((I00ol1) create(ii0110, iOoil1iiIilo)).invokeSuspend(ooiIlOl1iI);
                }

                /* JADX WARN: Code restructure failed: missing block: B:15:0x003d, code lost:
                
                    if (r3.I00000oIO(r8, r10) == r0) goto L16;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:30:0x006f, code lost:
                
                    if (r3.I00000oIO(r8, r10) == r0) goto L31;
                 */
                @Override
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object invokeSuspend(Object obj) throws Throwable {
/* 1 */             int i = this.I00iOIl;
/* 3 */             OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
/* 5 */             I00oo1iO0ll i00oo1iO0ll = this.I00ilI0I1;
/* 7 */             OI0lOIiOIOOo oI0lOIiOIOOo = this.I00iiO;
/* 14 */            OOIII1oOoolO oOIII1oOoolO = this.I00iio;
                    switch (i) {
                        case 0:
/* 69 */                    Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 71 */                    int i2 = this.I00iiI;
/* 73 */                    if (i2 == 0) {
/* 92 */                        lIoii1l01l0i.I00000oOI(obj);
/* 95 */                        long j = IOIlliil00.I00000oIO;
/* 97 */                        this.I00iiI = 1;
/* 103 */                       if (il0l1o1l.I00000oOI(j, this) != ii0111o) {
                                }
                                break;
                            } else if (i2 == 1) {
/* 88 */                        lIoii1l01l0i.I00000oOI(obj);
                            } else if (i2 != 2) {
/* 83 */                        I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
                                break;
                            } else {
/* 79 */                        lIoii1l01l0i.I00000oOI(obj);
/* 116 */                       i00oo1iO0ll.I010101Oo1lO = oOIII1oOoolO;
                                break;
                            }
/* 106 */                   this.I00iiI = 2;
                            break;
                        default:
/* 19 */                    Ii0111o ii0111o2 = Ii0111o.I00iOIl;
/* 21 */                    int i3 = this.I00iiI;
/* 23 */                    if (i3 == 0) {
/* 42 */                        lIoii1l01l0i.I00000oOI(obj);
/* 45 */                        long j2 = IOIlliil00.I00000oIO;
/* 47 */                        this.I00iiI = 1;
/* 53 */                        if (il0l1o1l.I00000oOI(j2, this) != ii0111o2) {
                                }
                                break;
                            } else if (i3 == 1) {
/* 38 */                        lIoii1l01l0i.I00000oOI(obj);
                            } else if (i3 != 2) {
/* 33 */                        I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
                                break;
                            } else {
/* 29 */                        lIoii1l01l0i.I00000oOI(obj);
/* 66 */                        i00oo1iO0ll.I00ooiO1I = oOIII1oOoolO;
                                break;
                            }
/* 56 */                    this.I00iiI = 2;
                            break;
                    }
/* 68 */            return ooiIlOl1iI;
                }
            }

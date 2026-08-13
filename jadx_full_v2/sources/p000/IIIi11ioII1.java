            package p000;
            
            public final class IIIi11ioII1 extends Oll0io implements IlliIl1l11O {
                public final int I00iOIl;
                public int I00iiI;
                public final I10i01 I00iiO;
                public final float I00iio;
                public final boolean I00ilI0I1;
                public final IooiIloo0i I00ilO0;
                public final Object I00io1l;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public IIIi11ioII1(I10i01 i10i01, float f, boolean z, Object obj, IooiIloo0i iooiIloo0i, IOoil1iiIilo iOoil1iiIilo, int i) {
/* 14 */            super(2, iOoil1iiIilo);
/* 1 */             this.I00iOIl = i;
/* 3 */             this.I00iiO = i10i01;
/* 5 */             this.I00iio = f;
/* 7 */             this.I00ilI0I1 = z;
/* 9 */             this.I00io1l = obj;
/* 11 */            this.I00ilO0 = iooiIloo0i;
                }

                @Override
                public final IOoil1iiIilo create(Object obj, IOoil1iiIilo iOoil1iiIilo) {
/* 1 */             int i = this.I00iOIl;
/* 3 */             Object obj2 = this.I00io1l;
                    switch (i) {
                        case 0:
/* 43 */                    return new IIIi11ioII1(this.I00iiO, this.I00iio, this.I00ilI0I1, (IIIi1IOoio) obj2, this.I00ilO0, iOoil1iiIilo, 0);
                        default:
/* 23 */                    return new IIIi11ioII1(this.I00iiO, this.I00iio, this.I00ilI0I1, (IO0i0lIl) obj2, this.I00ilO0, iOoil1iiIilo, 1);
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
/* 18 */            return ((IIIi11ioII1) create(ii0110, iOoil1iiIilo)).invokeSuspend(ooiIlOl1iI);
                }

                @Override
                public final Object invokeSuspend(Object obj) throws Throwable {
/* 1 */             int i = this.I00iOIl;
/* 3 */             OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
/* 5 */             IooiIloo0i iooiIloo0i = this.I00ilO0;
/* 9 */             boolean z = this.I00ilI0I1;
/* 13 */            Object obj2 = this.I00io1l;
/* 15 */            I10i01 i10i01 = this.I00iiO;
/* 17 */            float f = this.I00iio;
/* 21 */            IooiIloo0i ili10OO0ii = null;
                    switch (i) {
                        case 0:
/* 158 */                   IIIi1IOoio iIIi1IOoio = (IIIi1IOoio) obj2;
/* 160 */                   Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 162 */                   int i2 = this.I00iiI;
/* 164 */                   if (i2 != 0) {
/* 166 */                       if (i2 == 1 || i2 == 2) {
/* 176 */                           lIoii1l01l0i.I00000oOI(obj);
/* 271 */                           return ooiIlOl1iI;
                                }
/* 171 */                       I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 21 */                        return null;
                            }
/* 180 */                   lIoii1l01l0i.I00000oOI(obj);
/* 197 */                   if (Iil1010O.I0000Il00O(((Iil1010O) i10i01.I0000oI00.getValue()).I00iOIl, f)) {
/* 271 */                       return ooiIlOl1iI;
                            }
/* 199 */                   if (z) {
/* 222 */                       float f2 = ((Iil1010O) i10i01.I0000oI00.getValue()).I00iOIl;
/* 229 */                       if (Iil1010O.I0000Il00O(f2, 0.0f)) {
/* 233 */                           ili10OO0ii = new OOIII1oOoolO(0L);
                                } else if (Iil1010O.I0000Il00O(f2, iIIi1IOoio.I00000oIO)) {
/* 247 */                           ili10OO0ii = new IoI1l00l();
                                } else if (Iil1010O.I0000Il00O(f2, 0.0f)) {
/* 259 */                           ili10OO0ii = new Ili10OO0ii();
                                }
/* 262 */                       this.I00iiI = 2;
/* 268 */                       if (IioiI11o101O.I00000oIO(i10i01, f, ili10OO0ii, iooiIloo0i, this) != ii0111o) {
/* 271 */                           return ooiIlOl1iI;
                                }
                            } else {
/* 201 */                       Iil1010O iil1010OI00000oIO = Iil1010O.I00000oIO(f);
/* 205 */                       this.I00iiI = 1;
/* 211 */                       if (i10i01.I0001Ioi1lo(this, iil1010OI00000oIO) != ii0111o) {
/* 271 */                           return ooiIlOl1iI;
                                }
                            }
/* 270 */                   return ii0111o;
                        default:
/* 25 */                    IO0i0lIl iO0i0lIl = (IO0i0lIl) obj2;
/* 27 */                    Ii0111o ii0111o2 = Ii0111o.I00iOIl;
/* 29 */                    int i3 = this.I00iiI;
/* 31 */                    if (i3 != 0) {
/* 33 */                        if (i3 == 1 || i3 == 2) {
/* 44 */                            lIoii1l01l0i.I00000oOI(obj);
/* 157 */                           return ooiIlOl1iI;
                                }
/* 38 */                        I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 21 */                        return null;
                            }
/* 49 */                    lIoii1l01l0i.I00000oOI(obj);
/* 66 */                    if (Iil1010O.I0000Il00O(((Iil1010O) i10i01.I0000oI00.getValue()).I00iOIl, f)) {
/* 157 */                       return ooiIlOl1iI;
                            }
/* 68 */                    if (z) {
/* 91 */                        float f3 = ((Iil1010O) i10i01.I0000oI00.getValue()).I00iOIl;
/* 99 */                        if (Iil1010O.I0000Il00O(f3, iO0i0lIl.I00000oOI)) {
/* 103 */                           ili10OO0ii = new OOIII1oOoolO(0L);
                                } else if (Iil1010O.I0000Il00O(f3, iO0i0lIl.I0000O)) {
/* 117 */                           ili10OO0ii = new IoI1l00l();
                                } else if (Iil1010O.I0000Il00O(f3, iO0i0lIl.I0000Il00O)) {
/* 131 */                           ili10OO0ii = new Ili10OO0ii();
                                } else if (Iil1010O.I0000Il00O(f3, iO0i0lIl.I0000oI00)) {
/* 145 */                           ili10OO0ii = new IilioOoi1O();
                                }
/* 148 */                       this.I00iiI = 2;
/* 154 */                       if (IioiI11o101O.I00000oIO(i10i01, f, ili10OO0ii, iooiIloo0i, this) != ii0111o2) {
/* 157 */                           return ooiIlOl1iI;
                                }
                            } else {
/* 70 */                        Iil1010O iil1010OI00000oIO2 = Iil1010O.I00000oIO(f);
/* 74 */                        this.I00iiI = 1;
/* 80 */                        if (i10i01.I0001Ioi1lo(this, iil1010OI00000oIO2) != ii0111o2) {
/* 157 */                           return ooiIlOl1iI;
                                }
                            }
/* 156 */                   return ii0111o2;
                    }
                }
            }

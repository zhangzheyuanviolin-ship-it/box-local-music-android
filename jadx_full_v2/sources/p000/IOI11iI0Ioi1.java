            package p000;
            
            public final class IOI11iI0Ioi1 extends Oll0io implements IlliIl1l11O {
                public final int I00iOIl;
                public int I00iiI;
                public final I10i01 I00iiO;
                public final float I00iio;
                public final boolean I00ilI0I1;
                public final IooiIloo0i I00ilO0;
                public final OI10i0Il I00io1l;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public IOI11iI0Ioi1(I10i01 i10i01, float f, boolean z, IooiIloo0i iooiIloo0i, OI10i0Il oI10i0Il, IOoil1iiIilo iOoil1iiIilo, int i) {
/* 14 */            super(2, iOoil1iiIilo);
/* 1 */             this.I00iOIl = i;
/* 3 */             this.I00iiO = i10i01;
/* 5 */             this.I00iio = f;
/* 7 */             this.I00ilI0I1 = z;
/* 9 */             this.I00ilO0 = iooiIloo0i;
/* 11 */            this.I00io1l = oI10i0Il;
                }

                @Override
                public final IOoil1iiIilo create(Object obj, IOoil1iiIilo iOoil1iiIilo) {
                    switch (this.I00iOIl) {
                        case 0:
/* 39 */                    return new IOI11iI0Ioi1(this.I00iiO, this.I00iio, this.I00ilI0I1, this.I00ilO0, this.I00io1l, iOoil1iiIilo, 0);
                        default:
/* 20 */                    return new IOI11iI0Ioi1(this.I00iiO, this.I00iio, this.I00ilI0I1, this.I00ilO0, this.I00io1l, iOoil1iiIilo, 1);
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
/* 18 */            return ((IOI11iI0Ioi1) create(ii0110, iOoil1iiIilo)).invokeSuspend(ooiIlOl1iI);
                }

                /* JADX WARN: Code restructure failed: missing block: B:15:0x0049, code lost:
                
                    if (r5.I0001Ioi1lo(r12, r13) == r0) goto L19;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:18:0x0058, code lost:
                
                    if (p000.IioiI11o101O.I00000oIO(r5, r6, r13, r10, r12) == r0) goto L19;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:33:0x0093, code lost:
                
                    if (r5.I0001Ioi1lo(r12, r13) == r0) goto L37;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:36:0x00a2, code lost:
                
                    if (p000.IioiI11o101O.I00000oIO(r5, r6, r13, r10, r12) == r0) goto L37;
                 */
                @Override
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object invokeSuspend(Object obj) throws Throwable {
/* 1 */             int i = this.I00iOIl;
/* 3 */             OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
/* 5 */             boolean z = this.I00ilI0I1;
/* 10 */            I10i01 i10i01 = this.I00iiO;
/* 12 */            float f = this.I00iio;
/* 16 */            OI10i0Il oI10i0Il = this.I00io1l;
/* 18 */            IooiIloo0i iooiIloo0i = this.I00ilO0;
                    switch (i) {
                        case 0:
/* 97 */                    Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 99 */                    int i2 = this.I00iiI;
/* 101 */                   if (i2 == 0) {
/* 117 */                       lIoii1l01l0i.I00000oOI(obj);
/* 134 */                       if (!Iil1010O.I0000Il00O(((Iil1010O) i10i01.I0000oI00.getValue()).I00iOIl, f)) {
/* 136 */                           if (!z) {
/* 138 */                               Iil1010O iil1010OI00000oIO = Iil1010O.I00000oIO(f);
/* 142 */                               this.I00iiI = 1;
                                        break;
                                    } else {
/* 155 */                               IooiIloo0i iooiIloo0i2 = (IooiIloo0i) oI10i0Il.getValue();
/* 157 */                               this.I00iiI = 2;
                                        break;
                                    }
                                }
                            } else if (i2 != 1 && i2 != 2) {
/* 108 */                       I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
                                break;
                            } else {
/* 113 */                       lIoii1l01l0i.I00000oOI(obj);
                            }
/* 167 */                   oI10i0Il.setValue(iooiIloo0i);
                            break;
                        default:
/* 23 */                    Ii0111o ii0111o2 = Ii0111o.I00iOIl;
/* 25 */                    int i3 = this.I00iiI;
/* 27 */                    if (i3 == 0) {
/* 43 */                        lIoii1l01l0i.I00000oOI(obj);
/* 60 */                        if (!Iil1010O.I0000Il00O(((Iil1010O) i10i01.I0000oI00.getValue()).I00iOIl, f)) {
/* 62 */                            if (!z) {
/* 64 */                                Iil1010O iil1010OI00000oIO2 = Iil1010O.I00000oIO(f);
/* 68 */                                this.I00iiI = 1;
                                        break;
                                    } else {
/* 81 */                                IooiIloo0i iooiIloo0i3 = (IooiIloo0i) oI10i0Il.getValue();
/* 83 */                                this.I00iiI = 2;
                                        break;
                                    }
                                }
                            } else if (i3 != 1 && i3 != 2) {
/* 34 */                        I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
                                break;
                            } else {
/* 39 */                        lIoii1l01l0i.I00000oOI(obj);
                            }
/* 93 */                    oI10i0Il.setValue(iooiIloo0i);
                            break;
                    }
/* 96 */            return ooiIlOl1iI;
                }
            }

            package p000;
            
            public final class IO1lIOi extends Oll0io implements IlliIl1l11O {
                public final int I00iOIl;
                public int I00iiI;
                public final O0o0I1i0O I00iiO;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public IO1lIOi(int i, IOoil1iiIilo iOoil1iiIilo, O0o0I1i0O o0o0I1i0O) {
/* 6 */             super(2, iOoil1iiIilo);
/* 1 */             this.I00iOIl = i;
/* 3 */             this.I00iiO = o0o0I1i0O;
                }

                @Override
                public final IOoil1iiIilo create(Object obj, IOoil1iiIilo iOoil1iiIilo) {
                    switch (this.I00iOIl) {
                        case 0:
/* 29 */                    return new IO1lIOi(0, iOoil1iiIilo, this.I00iiO);
                        case 1:
/* 20 */                    return new IO1lIOi(1, iOoil1iiIilo, this.I00iiO);
                        default:
/* 11 */                    return new IO1lIOi(2, iOoil1iiIilo, this.I00iiO);
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
/* 18 */            return ((IO1lIOi) create(ii0110, iOoil1iiIilo)).invokeSuspend(ooiIlOl1iI);
                }

                @Override
                public final Object invokeSuspend(Object obj) throws Throwable {
/* 1 */             int i = this.I00iOIl;
/* 7 */             OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
/* 13 */            O0o0I1i0O o0o0I1i0O = this.I00iiO;
                    switch (i) {
                        case 0:
/* 138 */                   Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 140 */                   int i2 = this.I00iiI;
/* 142 */                   if (i2 == 0) {
/* 155 */                       lIoii1l01l0i.I00000oOI(obj);
/* 158 */                       this.I00iiI = 1;
                                return i1Ioo11OIl.I00000oOI(o0o0I1i0O, this) == ii0111o ? ii0111o : ooiIlOl1iI;
                            }
/* 144 */                   if (i2 == 1) {
/* 146 */                       lIoii1l01l0i.I00000oOI(obj);
/* 167 */                       return ooiIlOl1iI;
                            }
/* 150 */                   I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 9 */                     return null;
                        case 1:
/* 78 */                    Ii0111o ii0111o2 = Ii0111o.I00iOIl;
/* 80 */                    int i3 = this.I00iiI;
/* 82 */                    if (i3 == 0) {
/* 101 */                       lIoii1l01l0i.I00000oOI(obj);
/* 104 */                       this.I00iiI = 1;
/* 110 */                       if (il0l1o1l.I00000oOI(300L, this) != ii0111o2) {
                                }
/* 136 */                       return ii0111o2;
                            }
/* 84 */                    if (i3 != 1) {
/* 86 */                        if (i3 == 2) {
/* 88 */                            lIoii1l01l0i.I00000oOI(obj);
/* 137 */                           return ooiIlOl1iI;
                                }
/* 92 */                        I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 9 */                         return null;
                            }
/* 97 */                    lIoii1l01l0i.I00000oOI(obj);
/* 119 */                   if (o0o0I1i0O.I000OiO().I000oI1ioi <= 0) {
/* 137 */                       return ooiIlOl1iI;
                            }
/* 127 */                   int i4 = o0o0I1i0O.I000OiO().I000oI1ioi - 1;
/* 128 */                   this.I00iiI = 2;
/* 134 */                   if (o0o0I1i0O.I0001Ioi1lo(i4, 0, this) != ii0111o2) {
/* 137 */                       return ooiIlOl1iI;
                            }
/* 136 */                   return ii0111o2;
                        default:
/* 18 */                    Ii0111o ii0111o3 = Ii0111o.I00iOIl;
/* 20 */                    int i5 = this.I00iiI;
/* 22 */                    if (i5 == 0) {
/* 41 */                        lIoii1l01l0i.I00000oOI(obj);
/* 44 */                        this.I00iiI = 1;
/* 50 */                        if (il0l1o1l.I00000oOI(300L, this) != ii0111o3) {
                                }
/* 76 */                        return ii0111o3;
                            }
/* 24 */                    if (i5 != 1) {
/* 26 */                        if (i5 == 2) {
/* 28 */                            lIoii1l01l0i.I00000oOI(obj);
/* 77 */                            return ooiIlOl1iI;
                                }
/* 32 */                        I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 9 */                         return null;
                            }
/* 37 */                    lIoii1l01l0i.I00000oOI(obj);
/* 59 */                    if (o0o0I1i0O.I000OiO().I000oI1ioi <= 0) {
/* 77 */                        return ooiIlOl1iI;
                            }
/* 67 */                    int i6 = o0o0I1i0O.I000OiO().I000oI1ioi - 1;
/* 68 */                    this.I00iiI = 2;
/* 74 */                    if (o0o0I1i0O.I0001Ioi1lo(i6, 0, this) != ii0111o3) {
/* 77 */                        return ooiIlOl1iI;
                            }
/* 76 */                    return ii0111o3;
                    }
                }
            }

            package p000;

            import java.util.Iterator;
            
/* 13 */    public final class IoI0i1110 extends Oll0io implements IlliIl1l11O {
                public final int I00iOIl = 0;
                public final O0o0I1i0O I00iiI;
                public int I00iiO;
                public final int I00iio;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public IoI0i1110(O0o0I1i0O o0o0I1i0O, int i, int i2, IOoil1iiIilo iOoil1iiIilo) {
/* 11 */            super(2, iOoil1iiIilo);
/* 4 */             this.I00iiI = o0o0I1i0O;
/* 6 */             this.I00iiO = i;
/* 8 */             this.I00iio = i2;
                }

                @Override
                public final IOoil1iiIilo create(Object obj, IOoil1iiIilo iOoil1iiIilo) {
/* 1 */             int i = this.I00iOIl;
/* 3 */             int i2 = this.I00iio;
/* 5 */             O0o0I1i0O o0o0I1i0O = this.I00iiI;
                    switch (i) {
                        case 0:
/* 20 */                    return new IoI0i1110(i2, iOoil1iiIilo, o0o0I1i0O);
                        default:
/* 14 */                    return new IoI0i1110(o0o0I1i0O, this.I00iiO, i2, iOoil1iiIilo);
                    }
                }

                @Override
                public final Object invoke(Object obj, Object obj2) throws Throwable {
/* 1 */             int i = this.I00iOIl;
/* 3 */             OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
                    switch (i) {
                        case 0:
/* 32 */                    return ((IoI0i1110) create((Ii0110) obj, (IOoil1iiIilo) obj2)).invokeSuspend(ooiIlOl1iI);
                        default:
/* 18 */                    ((IoI0i1110) create((OiOiliiO) obj, (IOoil1iiIilo) obj2)).invokeSuspend(ooiIlOl1iI);
/* 21 */                    return ooiIlOl1iI;
                    }
                }

                @Override
                public final Object invokeSuspend(Object obj) throws Throwable {
                    int i;
/* 1 */             int i2 = this.I00iOIl;
/* 3 */             OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
/* 5 */             int i3 = this.I00iio;
/* 7 */             O0o0I1i0O o0o0I1i0O = this.I00iiI;
                    switch (i2) {
                        case 0:
/* 23 */                    Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 25 */                    int i4 = this.I00iiO;
/* 27 */                    Object obj2 = null;
/* 29 */                    if (i4 != 0) {
/* 31 */                        if (i4 == 1) {
/* 33 */                            lIoii1l01l0i.I00000oOI(obj);
/* 114 */                           return ooiIlOl1iI;
                                }
/* 39 */                        I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 27 */                        return null;
                            }
/* 44 */                    lIoii1l01l0i.I00000oOI(obj);
/* 55 */                    Iterator it = o0o0I1i0O.I000OiO().I000l1.iterator();
                            while (true) {
/* 63 */                        if (it.hasNext()) {
/* 65 */                            Object next = it.next();
/* 76 */                            if (((O0o0100I) next).I00000oIO == i3 + 1) {
/* 78 */                                obj2 = next;
                                    }
                                }
                            }
/* 79 */                    O0o0100I o0o0100I = (O0o0100I) obj2;
/* 81 */                    if (o0o0100I != null && (i = o0o0100I.I000o00OoI0I) >= 0 && i + o0o0100I.I000oI1ioi <= ((int) (o0o0I1i0O.I000OiO().I000OOo1O() >> 32))) {
/* 114 */                       return ooiIlOl1iI;
                            }
/* 104 */                   this.I00iiO = 1;
                            return o0o0I1i0O.I0001Ioi1lo(i3, 0, this) == ii0111o ? ii0111o : ooiIlOl1iI;
                        default:
/* 12 */                    Ii0111o ii0111o2 = Ii0111o.I00iOIl;
/* 14 */                    lIoii1l01l0i.I00000oOI(obj);
/* 19 */                    o0o0I1i0O.I000l1(this.I00iiO, i3);
/* 22 */                    return ooiIlOl1iI;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
/* 14 */        public IoI0i1110(int i, IOoil1iiIilo iOoil1iiIilo, O0o0I1i0O o0o0I1i0O) {
                    super(2, iOoil1iiIilo);
/* 15 */            this.I00iiI = o0o0I1i0O;
                    this.I00iio = i;
                }
            }

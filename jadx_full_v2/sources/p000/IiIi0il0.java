            package p000;

            import java.lang.invoke.VarHandle;
            import java.util.ArrayList;
            
/* 17 */    public final class IiIi0il0 extends Oll0io implements IlliIl1l11O {
                public final int I00iOIl = 0;
                public int I00iiI;
                public final int I00iiO;
                public final int I00iio;
                public Object I00ilI0I1;
                public final Object I00ilO0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public IiIi0il0(IiIi1o iiIi1o, IOoil1iiIilo iOoil1iiIilo, ArrayList arrayList, int i, int i2, int i3) {
/* 15 */            super(2, iOoil1iiIilo);
/* 4 */             this.I00ilI0I1 = iiIi1o;
/* 6 */             this.I00ilO0 = arrayList;
/* 8 */             this.I00iiI = i;
/* 10 */            this.I00iiO = i2;
/* 12 */            this.I00iio = i3;
                }

                @Override
                public final IOoil1iiIilo create(Object obj, IOoil1iiIilo iOoil1iiIilo) {
/* 1 */             int i = this.I00iOIl;
/* 3 */             Object obj2 = this.I00ilO0;
                    switch (i) {
                        case 0:
/* 39 */                    return new IiIi0il0((IiIi1o) this.I00ilI0I1, iOoil1iiIilo, (ArrayList) obj2, this.I00iiI, this.I00iiO, this.I00iio);
                        default:
/* 16 */                    IiIi0il0 iiIi0il0 = new IiIi0il0((O0o0I1i0O) obj2, this.I00iiO, this.I00iio, iOoil1iiIilo);
/* 19 */                    iiIi0il0.I00ilI0I1 = obj;
/* 21 */                    return iiIi0il0;
                    }
                }

                @Override
                public final Object invoke(Object obj, Object obj2) {
/* 1 */             int i = this.I00iOIl;
/* 3 */             OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
                    switch (i) {
                        case 0:
/* 33 */                    return ((IiIi0il0) create((Ii0110) obj, (IOoil1iiIilo) obj2)).invokeSuspend(ooiIlOl1iI);
                        default:
/* 18 */                    return ((IiIi0il0) create((OiOiliiO) obj, (IOoil1iiIilo) obj2)).invokeSuspend(ooiIlOl1iI);
                    }
                }

                @Override
                public final Object invokeSuspend(Object obj) throws Throwable {
/* 1 */             int i = this.I00iOIl;
/* 3 */             Object obj2 = this.I00ilO0;
                    switch (i) {
                        case 0:
/* 80 */                    Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 82 */                    lIoii1l01l0i.I00000oOI(obj);
/* 101 */                   return ((IiIi1o) this.I00ilI0I1).I000o00OoI0I().I0001Ioi1lo((ArrayList) obj2, this.I00iiI, this.I00iiO, this.I00iio);
                        default:
/* 8 */                     Ii0111o ii0111o2 = Ii0111o.I00iOIl;
/* 10 */                    int i2 = this.I00iiI;
/* 13 */                    if (i2 == 0) {
/* 28 */                        lIoii1l01l0i.I00000oOI(obj);
/* 33 */                        OiOiliiO oiOiliiO = (OiOiliiO) this.I00ilI0I1;
/* 35 */                        O0o0I1i0O o0o0I1i0O = (O0o0I1i0O) obj2;
/* 40 */                        O0o0101i o0o0101i = new O0o0101i(0);
/* 43 */                        o0o0101i.I0000Il00O = o0o0I1i0O;
/* 45 */                        o0o0101i.I00000oOI = oiOiliiO;
/* 47 */                        VarHandle.storeStoreFence();
/* 58 */                        IiIooOOOI iiIooOOOI = ((O0o00O1Oi00) o0o0I1i0O.I0001Ioi1lo.getValue()).I000OOo1O;
/* 60 */                        this.I00iiI = 1;
/* 73 */                        if (l100Il0I1l1l.I00000oIO(o0o0101i, this.I00iiO, this.I00iio, 100, iiIooOOOI, this) == ii0111o2) {
/* 78 */                            return ii0111o2;
                                }
                            } else {
/* 15 */                        if (i2 != 1) {
/* 23 */                            I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 26 */                            return null;
                                }
/* 17 */                        lIoii1l01l0i.I00000oOI(obj);
                            }
/* 76 */                    return OoiIlOl1iI.I00000oIO;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
/* 18 */        public IiIi0il0(O0o0I1i0O o0o0I1i0O, int i, int i2, IOoil1iiIilo iOoil1iiIilo) {
                    super(2, iOoil1iiIilo);
/* 19 */            this.I00ilO0 = o0o0I1i0O;
                    this.I00iiO = i;
                    this.I00iio = i2;
                }
            }

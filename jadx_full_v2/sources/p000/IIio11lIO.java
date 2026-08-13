            package p000;

            import java.lang.invoke.VarHandle;
            
            public final class IIio11lIO extends Oll0io implements IlliIl1l11O {
                public final int I00iOIl;
                public int I00iiI;
                public final IIioIlI0 I00iiO;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public IIio11lIO(IIioIlI0 iIioIlI0, IOoil1iiIilo iOoil1iiIilo, int i) {
/* 6 */             super(2, iOoil1iiIilo);
/* 1 */             this.I00iOIl = i;
/* 3 */             this.I00iiO = iIioIlI0;
                }

                @Override
                public final IOoil1iiIilo create(Object obj, IOoil1iiIilo iOoil1iiIilo) {
/* 1 */             int i = this.I00iOIl;
/* 3 */             IIioIlI0 iIioIlI0 = this.I00iiO;
                    switch (i) {
                        case 0:
/* 25 */                    return new IIio11lIO(iIioIlI0, iOoil1iiIilo, 0);
                        case 1:
/* 18 */                    return new IIio11lIO(iIioIlI0, iOoil1iiIilo, 1);
                        default:
/* 11 */                    return new IIio11lIO(iIioIlI0, iOoil1iiIilo, 2);
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
/* 41 */                    ((IIio11lIO) create(ii0110, iOoil1iiIilo)).invokeSuspend(ooiIlOl1iI);
/* 44 */                    return Ii0111o.I00iOIl;
                        case 1:
/* 29 */                    ((IIio11lIO) create(ii0110, iOoil1iiIilo)).invokeSuspend(ooiIlOl1iI);
/* 32 */                    return Ii0111o.I00iOIl;
                        default:
/* 18 */                    return ((IIio11lIO) create(ii0110, iOoil1iiIilo)).invokeSuspend(ooiIlOl1iI);
                    }
                }

                @Override
                public final Object invokeSuspend(Object obj) throws Throwable {
                    OoooIIOo10 ooooIIOo10;
                    IO0Il0o1OI iO0Il0o1OI;
                    Object objI00000oIO;
/* 4 */             int i = 1;
                    switch (this.I00iOIl) {
                        case 0:
/* 137 */                   Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 139 */                   int i2 = this.I00iiI;
/* 141 */                   if (i2 != 0) {
/* 143 */                       if (i2 != 1) {
/* 147 */                           I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 3 */                             return null;
                                }
/* 151 */                       lIoii1l01l0i.I00000oOI(obj);
/* 154 */                       IOOlIIilOl0.I0000Il00O();
/* 3 */                         return null;
                            }
/* 158 */                   lIoii1l01l0i.I00000oOI(obj);
/* 161 */                   IIioIlI0 iIioIlI0 = this.I00iiO;
/* 165 */                   OOli1O oOli1O = iIioIlI0.I0001Ioi1lo.I00io1l;
/* 170 */                   IIio0l1 iIio0l1 = new IIio0l1(0);
/* 173 */                   iIio0l1.I00iiI = iIioIlI0;
/* 175 */                   VarHandle.storeStoreFence();
/* 178 */                   this.I00iiI = 1;
/* 182 */                   oOli1O.I00iOIl.I00000oIO(iIio0l1, this);
/* 185 */                   return ii0111o;
                        case 1:
/* 88 */                    Ii0111o ii0111o2 = Ii0111o.I00iOIl;
/* 90 */                    int i3 = this.I00iiI;
/* 92 */                    if (i3 != 0) {
/* 94 */                        if (i3 != 1) {
/* 98 */                            I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 3 */                             return null;
                                }
/* 102 */                       lIoii1l01l0i.I00000oOI(obj);
/* 105 */                       IOOlIIilOl0.I0000Il00O();
/* 3 */                         return null;
                            }
/* 109 */                   lIoii1l01l0i.I00000oOI(obj);
/* 112 */                   IIioIlI0 iIioIlI02 = this.I00iiO;
/* 116 */                   OOli00O001 oOli00O001 = iIioIlI02.I0001Ioi1lo.I00l0I0l0lO1;
/* 120 */                   IIio0l1 iIio0l12 = new IIio0l1(i);
/* 123 */                   iIio0l12.I00iiI = iIioIlI02;
/* 125 */                   VarHandle.storeStoreFence();
/* 128 */                   this.I00iiI = 1;
/* 132 */                   oOli00O001.I00iOIl.I00000oIO(iIio0l12, this);
/* 135 */                   return ii0111o2;
                        default:
/* 8 */                     Object obj2 = Ii0111o.I00iOIl;
/* 10 */                    int i4 = this.I00iiI;
/* 12 */                    if (i4 == 0) {
/* 26 */                        lIoii1l01l0i.I00000oOI(obj);
/* 29 */                        IIioIlI0 iIioIlI03 = this.I00iiO;
/* 31 */                        this.I00iiI = 1;
/* 35 */                        OOo0ooi oOo0ooi = new OOo0ooi();
                                synchronized (iIioIlI03.I000oI1ioi) {
/* 41 */                            ooooIIOo10 = iIioIlI03.I001i1O0Ol;
/* 43 */                            iO0Il0o1OI = iIioIlI03.I001i1lo1io;
/* 45 */                            oOo0ooi.I00iOIl = iO0Il0o1OI;
                                }
/* 48 */                        if (ooooIIOo10 == null || iO0Il0o1OI == null) {
/* 76 */                            objI00000oIO = OoiIlOl1iI.I00000oIO;
                                } else {
/* 52 */                            IlOil1ii ilOil1ii = ooooIIOo10.I000OOo1O;
/* 56 */                            IIilO0 iIilO0 = new IIilO0(1);
/* 59 */                            iIilO0.I00iiI = oOo0ooi;
/* 61 */                            iIilO0.I00iiO = iIioIlI03;
/* 63 */                            VarHandle.storeStoreFence();
/* 66 */                            objI00000oIO = ilOil1ii.I00000oIO(iIilO0, this);
/* 70 */                            if (objI00000oIO != obj2) {
/* 73 */                                objI00000oIO = OoiIlOl1iI.I00000oIO;
                                    }
                                }
/* 78 */                        if (objI00000oIO == obj2) {
/* 80 */                            return obj2;
                                }
                            } else {
/* 14 */                        if (i4 != 1) {
/* 22 */                            I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 3 */                             return null;
                                }
/* 16 */                        lIoii1l01l0i.I00000oOI(obj);
                            }
/* 82 */                    return OoiIlOl1iI.I00000oIO;
                    }
                }
            }

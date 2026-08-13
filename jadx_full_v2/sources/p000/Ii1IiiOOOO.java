            package p000;

            import java.lang.invoke.VarHandle;
            
            public final class Ii1IiiOOOO extends Oll0io implements IlliIl1l11O {
                public final int I00iOIl;
                public int I00iiI;
                public final Ii1OIIlOi I00iiO;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public Ii1IiiOOOO(Ii1OIIlOi ii1OIIlOi, IOoil1iiIilo iOoil1iiIilo, int i) {
/* 6 */             super(2, iOoil1iiIilo);
/* 1 */             this.I00iOIl = i;
/* 3 */             this.I00iiO = ii1OIIlOi;
                }

                @Override
                public final IOoil1iiIilo create(Object obj, IOoil1iiIilo iOoil1iiIilo) {
/* 1 */             int i = this.I00iOIl;
/* 3 */             Ii1OIIlOi ii1OIIlOi = this.I00iiO;
                    switch (i) {
                        case 0:
/* 25 */                    return new Ii1IiiOOOO(ii1OIIlOi, iOoil1iiIilo, 0);
                        case 1:
/* 18 */                    return new Ii1IiiOOOO(ii1OIIlOi, iOoil1iiIilo, 1);
                        default:
/* 11 */                    return new Ii1IiiOOOO(ii1OIIlOi, iOoil1iiIilo, 2);
                    }
                }

                @Override
                public final Object invoke(Object obj, Object obj2) {
/* 1 */             int i = this.I00iOIl;
/* 3 */             OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
                    switch (i) {
                    }
/* 18 */            return ((Ii1IiiOOOO) create((Ii0110) obj, (IOoil1iiIilo) obj2)).invokeSuspend(ooiIlOl1iI);
                }

                /* JADX WARN: Code restructure failed: missing block: B:21:0x0049, code lost:
                
                    if (r10 == r1) goto L22;
                 */
                @Override
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object invokeSuspend(Object obj) throws Throwable {
/* 1 */             int i = this.I00iOIl;
/* 3 */             OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
/* 10 */            Ii1OIIlOi ii1OIIlOi = this.I00iiO;
                    switch (i) {
                        case 0:
/* 164 */                   Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 166 */                   int i2 = this.I00iiI;
/* 168 */                   if (i2 == 0) {
/* 181 */                       lIoii1l01l0i.I00000oOI(obj);
/* 184 */                       this.I00iiI = 1;
                                return ii1OIIlOi.I0000oI00(this) == ii0111o ? ii0111o : ooiIlOl1iI;
                            }
/* 170 */                   if (i2 == 1) {
/* 172 */                       lIoii1l01l0i.I00000oOI(obj);
/* 193 */                       return ooiIlOl1iI;
                            }
/* 176 */                   I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 7 */                     return null;
                        case 1:
/* 88 */                    Ii0111o ii0111o2 = Ii0111o.I00iOIl;
/* 90 */                    int i3 = this.I00iiI;
/* 92 */                    if (i3 == 0) {
/* 111 */                       lIoii1l01l0i.I00000oOI(obj);
/* 114 */                       o01l1ioOo0 o01l1iooo0 = ii1OIIlOi.I000OOo1O;
/* 116 */                       this.I00iiI = 1;
/* 122 */                       Object objI0010o = ((IOi10loi) o01l1iooo0.I00iiI).I0010o(this);
/* 126 */                       if (objI0010o != ii0111o2) {
/* 129 */                           objI0010o = ooiIlOl1iI;
                                }
/* 130 */                       if (objI0010o != ii0111o2) {
                                }
/* 162 */                       return ii0111o2;
                            }
/* 94 */                    if (i3 != 1) {
/* 96 */                        if (i3 == 2) {
/* 98 */                            lIoii1l01l0i.I00000oOI(obj);
/* 163 */                           return ooiIlOl1iI;
                                }
/* 102 */                       I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 7 */                         return null;
                            }
/* 107 */                   lIoii1l01l0i.I00000oOI(obj);
/* 139 */                   IlOil1ii ilOil1iiI00000oIO = ilOlOoO1lO.I00000oIO(ii1OIIlOi.I0000Il00O().I0000Il00O, -1);
/* 146 */                   I0oOII1l i0oOII1l = new I0oOII1l(3);
/* 149 */                   i0oOII1l.I00iiI = ii1OIIlOi;
/* 151 */                   VarHandle.storeStoreFence();
/* 154 */                   this.I00iiI = 2;
/* 160 */                   if (ilOil1iiI00000oIO.I00000oIO(i0oOII1l, this) != ii0111o2) {
/* 163 */                       return ooiIlOl1iI;
                            }
/* 162 */                   return ii0111o2;
                        default:
/* 16 */                    Ii1OIo10 ii1OIo10 = ii1OIIlOi.I000O01llI0;
/* 18 */                    Ii0111o ii0111o3 = Ii0111o.I00iOIl;
/* 20 */                    int i4 = this.I00iiI;
                            try {
/* 22 */                        if (i4 == 0) {
/* 42 */                            lIoii1l01l0i.I00000oOI(obj);
/* 51 */                            if (ii1OIo10.I00000oOI() instanceof IlIo0ol0) {
/* 53 */                                return ii1OIo10.I00000oOI();
                                    }
/* 58 */                            this.I00iiI = 1;
/* 64 */                            if (ii1OIIlOi.I0001Ioi1lo(this) != ii0111o3) {
                                    }
/* 76 */                            return ii0111o3;
                                }
/* 24 */                        if (i4 != 1) {
/* 26 */                            if (i4 == 2) {
/* 28 */                                lIoii1l01l0i.I00000oOI(obj);
/* 79 */                                return (OlO00iO01io) obj;
                                    }
/* 32 */                            I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 7 */                             return null;
                                }
/* 36 */                        lIoii1l01l0i.I00000oOI(obj);
/* 67 */                        this.I00iiI = 2;
/* 70 */                        obj = ii1OIIlOi.I000II(false, this);
                                break;
                            } catch (Throwable th) {
/* 84 */                        return new OOlIilOIlOi1(th, -1);
                            }
                    }
                }
            }

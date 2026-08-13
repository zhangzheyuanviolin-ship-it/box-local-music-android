            package p000;
            
            public final class IOOoIiIl extends Oll0io implements IlliIl1l11O {
                public final int I00iOIl;
                public int I00iiI;
                public final IOOoIo0 I00iiO;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public IOOoIiIl(IOOoIo0 iOOoIo0, IOoil1iiIilo iOoil1iiIilo, int i) {
/* 6 */             super(2, iOoil1iiIilo);
/* 1 */             this.I00iOIl = i;
/* 3 */             this.I00iiO = iOOoIo0;
                }

                @Override
                public final IOoil1iiIilo create(Object obj, IOoil1iiIilo iOoil1iiIilo) {
/* 1 */             int i = this.I00iOIl;
/* 3 */             IOOoIo0 iOOoIo0 = this.I00iiO;
                    switch (i) {
                        case 0:
/* 25 */                    return new IOOoIiIl(iOOoIo0, iOoil1iiIilo, 0);
                        case 1:
/* 18 */                    return new IOOoIiIl(iOOoIo0, iOoil1iiIilo, 1);
                        default:
/* 11 */                    return new IOOoIiIl(iOOoIo0, iOoil1iiIilo, 2);
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
/* 18 */            return ((IOOoIiIl) create(ii0110, iOoil1iiIilo)).invokeSuspend(ooiIlOl1iI);
                }

                @Override
                public final Object invokeSuspend(Object obj) throws Throwable {
/* 1 */             int i = this.I00iOIl;
/* 4 */             OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
/* 9 */             IOOoIo0 iOOoIo0 = this.I00iiO;
                    switch (i) {
                        case 0:
/* 145 */                   Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 147 */                   int i2 = this.I00iiI;
/* 149 */                   if (i2 == 0) {
/* 162 */                       lIoii1l01l0i.I00000oOI(obj);
/* 173 */                       long jI00000oOI = ((Oooii1o1) iiliIooIliOo.I00000oIO(iOOoIo0, IOlO0o100i1i.I00111O)).I00000oOI();
/* 177 */                       this.I00iiI = 1;
/* 183 */                       if (il0l1o1l.I00000oOI(jI00000oOI, this) == ii0111o) {
                                    break;
                                }
                            } else if (i2 != 1) {
/* 157 */                       I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
                                break;
                            } else {
/* 153 */                       lIoii1l01l0i.I00000oOI(obj);
                            }
/* 187 */                   IllOOo00lI illOOo00lI = iOOoIo0.I010i10l;
/* 189 */                   if (illOOo00lI != null) {
/* 191 */                       illOOo00lI.invoke();
                            }
/* 196 */                   if (iOOoIo0.I010iIIOlo) {
/* 208 */                       ((OO1IIll00O) ((Io1I0l) iiliIooIliOo.I00000oIO(iOOoIo0, IOlO0o100i1i.I000l1))).I00000oIO(0);
                            }
/* 211 */                   iOOoIo0.I010oio1OO0 = true;
/* 213 */                   OlIl0i olIl0i = iOOoIo0.I010lI0oi;
/* 215 */                   if (olIl0i != null) {
/* 217 */                       olIl0i.I000II(null);
                            }
/* 220 */                   iOOoIo0.I010lI0oi = null;
/* 222 */                   iOOoIo0.I010l1ol111 = null;
                            break;
                        case 1:
/* 65 */                    Ii0111o ii0111o2 = Ii0111o.I00iOIl;
/* 67 */                    int i3 = this.I00iiI;
/* 69 */                    if (i3 == 0) {
/* 82 */                        lIoii1l01l0i.I00000oOI(obj);
/* 93 */                        long jI00000oOI2 = ((Oooii1o1) iiliIooIliOo.I00000oIO(iOOoIo0, IOlO0o100i1i.I00111O)).I00000oOI();
/* 97 */                        this.I00iiI = 1;
/* 103 */                       if (il0l1o1l.I00000oOI(jI00000oOI2, this) == ii0111o2) {
                                    break;
                                }
                            } else if (i3 != 1) {
/* 77 */                        I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
                                break;
                            } else {
/* 73 */                        lIoii1l01l0i.I00000oOI(obj);
                            }
/* 107 */                   IllOOo00lI illOOo00lI2 = iOOoIo0.I010i10l;
/* 109 */                   if (illOOo00lI2 != null) {
/* 111 */                       illOOo00lI2.invoke();
                            }
/* 116 */                   if (iOOoIo0.I010iIIOlo) {
/* 128 */                       ((OO1IIll00O) ((Io1I0l) iiliIooIliOo.I00000oIO(iOOoIo0, IOlO0o100i1i.I000l1))).I00000oIO(0);
                            }
/* 131 */                   iOOoIo0.I011IOil = true;
/* 133 */                   OlIl0i olIl0i2 = iOOoIo0.I0111i;
/* 135 */                   if (olIl0i2 != null) {
/* 137 */                       olIl0i2.I000II(null);
                            }
/* 140 */                   iOOoIo0.I0111i = null;
/* 142 */                   iOOoIo0.I0110o = null;
                            break;
                        default:
/* 15 */                    Ii0111o ii0111o3 = Ii0111o.I00iOIl;
/* 17 */                    int i4 = this.I00iiI;
/* 19 */                    if (i4 == 0) {
/* 32 */                        lIoii1l01l0i.I00000oOI(obj);
/* 43 */                        long jI00000oOI3 = ((Oooii1o1) iiliIooIliOo.I00000oIO(iOOoIo0, IOlO0o100i1i.I00111O)).I00000oOI();
/* 47 */                        this.I00iiI = 1;
/* 53 */                        if (il0l1o1l.I00000oOI(jI00000oOI3, this) == ii0111o3) {
                                    break;
                                }
                            } else if (i4 != 1) {
/* 27 */                        I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
                                break;
                            } else {
/* 23 */                        lIoii1l01l0i.I00000oOI(obj);
                            }
/* 57 */                    IllOOo00lI illOOo00lI3 = iOOoIo0.I010i10l;
/* 59 */                    if (illOOo00lI3 != null) {
/* 61 */                        illOOo00lI3.invoke();
                                break;
                            }
                            break;
                    }
/* 64 */            return ooiIlOl1iI;
                }
            }

            package p000;

            import java.util.Objects;
            import kotlin.jvm.functions.Function1;
            
/* 13 */    public final class IO0IOi1Oi extends Oll0io implements IlliIl1l11O {
                public final int I00iOIl = 0;
                public int I00iiI;
                public Object I00iiO;
                public final long I00iio;
                public final Object I00ilI0I1;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public IO0IOi1Oi(long j, OoIO11oiiiil ooIO11oiiiil, OoIIOoO ooIIOoO, IOoil1iiIilo iOoil1iiIilo) {
/* 11 */            super(2, iOoil1iiIilo);
/* 4 */             this.I00iio = j;
/* 6 */             this.I00iiO = ooIO11oiiiil;
/* 8 */             this.I00ilI0I1 = ooIIOoO;
                }

                @Override
                public final IOoil1iiIilo create(Object obj, IOoil1iiIilo iOoil1iiIilo) {
/* 1 */             int i = this.I00iOIl;
/* 3 */             long j = this.I00iio;
/* 5 */             Object obj2 = this.I00ilI0I1;
                    switch (i) {
                        case 0:
/* 62 */                    IO0IOi1Oi iO0IOi1Oi = new IO0IOi1Oi(j, (IO0Il0o1OI) obj2, iOoil1iiIilo);
/* 65 */                    iO0IOi1Oi.I00iiO = obj;
/* 67 */                    return iO0IOi1Oi;
                        case 1:
/* 51 */                    IO0IOi1Oi iO0IOi1Oi2 = new IO0IOi1Oi((IillIill1IO1) obj2, j, iOoil1iiIilo);
/* 54 */                    iO0IOi1Oi2.I00iiO = obj;
/* 56 */                    return iO0IOi1Oi2;
                        case 2:
/* 42 */                    return new IO0IOi1Oi((Oo10IliO00O) this.I00iiO, (Function1) obj2, this.I00iio, iOoil1iiIilo);
                        default:
/* 23 */                    return new IO0IOi1Oi(this.I00iio, (OoIO11oiiiil) this.I00iiO, (OoIIOoO) obj2, iOoil1iiIilo);
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
/* 18 */            return ((IO0IOi1Oi) create(ii0110, iOoil1iiIilo)).invokeSuspend(ooiIlOl1iI);
                }

                @Override
                public final Object invokeSuspend(Object obj) throws Exception {
/* 1 */             int i = this.I00iOIl;
/* 3 */             OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
/* 5 */             Object obj2 = this.I00ilI0I1;
/* 7 */             long j = this.I00iio;
/* 11 */            IOoil1iiIilo iOoil1iiIilo = null;
                    switch (i) {
                        case 0:
/* 185 */                   Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 187 */                   int i2 = this.I00iiI;
/* 189 */                   if (i2 == 0) {
/* 202 */                       lIoii1l01l0i.I00000oOI(obj);
/* 209 */                       Objects.toString((Ii0110) this.I00iiO);
/* 212 */                       this.I00iiI = 1;
/* 218 */                       if (il0l1o1l.I00000oOI(j, this) == ii0111o) {
/* 220 */                           return ii0111o;
                                }
                            } else {
/* 191 */                       if (i2 != 1) {
/* 197 */                           I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 11 */                            return null;
                                }
/* 193 */                       lIoii1l01l0i.I00000oOI(obj);
                            }
/* 226 */                   ((IO0Il0o1OI) obj2).I000II(0L);
/* 229 */                   return ooiIlOl1iI;
                        case 1:
/* 144 */                   Ii0111o ii0111o2 = Ii0111o.I00iOIl;
/* 146 */                   int i3 = this.I00iiI;
/* 148 */                   if (i3 != 0) {
/* 150 */                       if (i3 == 1) {
/* 152 */                           lIoii1l01l0i.I00000oOI(obj);
/* 184 */                           return ooiIlOl1iI;
                                }
/* 156 */                       I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 11 */                        return null;
                            }
/* 161 */                   lIoii1l01l0i.I00000oOI(obj);
/* 166 */                   Ii0110 ii0110 = (Ii0110) this.I00iiO;
/* 170 */                   IillI1lo11l0 iillI1lo11l0 = ((IillIill1IO1) obj2).I010iIIOlo;
/* 172 */                   OIOlIiiioi oIOlIiiioiI00000oIO = OIOlIiiioi.I00000oIO(j);
/* 176 */                   this.I00iiI = 1;
/* 178 */                   iillI1lo11l0.invoke(ii0110, oIOlIiiioiI00000oIO, this);
                            return ooiIlOl1iI == ii0111o2 ? ii0111o2 : ooiIlOl1iI;
                        case 2:
/* 87 */                    Ii0111o ii0111o3 = Ii0111o.I00iOIl;
/* 89 */                    int i4 = this.I00iiI;
/* 91 */                    if (i4 != 0) {
/* 93 */                        if (i4 == 1) {
/* 95 */                            lIoii1l01l0i.I00000oOI(obj);
/* 143 */                           return obj;
                                }
/* 99 */                        I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 11 */                        return null;
                            }
/* 104 */                   lIoii1l01l0i.I00000oOI(obj);
/* 109 */                   Oo10IliO00O oo10IliO00O = (Oo10IliO00O) this.I00iiO;
/* 131 */                   O1iOlO o1iOlO = new O1iOlO(iOi1II01i0.I00000oOI(oo10IliO00O.I00000oOI, oo10IliO00O.I0000O, new Oo0Il1il1ol(1, null, (Function1) obj2), 2), iOoil1iiIilo, 11);
/* 134 */                   this.I00iiI = 1;
/* 136 */                   Object objI0000Il00O = lOlo0o.I0000Il00O(j, o1iOlO, this);
                            return objI0000Il00O == ii0111o3 ? ii0111o3 : objI0000Il00O;
                        default:
/* 18 */                    OoIO11oiiiil ooIO11oiiiil = (OoIO11oiiiil) this.I00iiO;
/* 20 */                    OlO0OIIl1 olO0OIIl1 = ooIO11oiiiil.I00000oOI;
/* 22 */                    Ii0111o ii0111o4 = Ii0111o.I00iOIl;
/* 24 */                    int i5 = this.I00iiI;
/* 26 */                    if (i5 == 0) {
/* 39 */                        lIoii1l01l0i.I00000oOI(obj);
/* 42 */                        this.I00iiI = 1;
/* 48 */                        if (il0l1o1l.I00000oOI(j, this) == ii0111o4) {
/* 50 */                            return ii0111o4;
                                }
                            } else {
/* 28 */                        if (i5 != 1) {
/* 34 */                            I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 11 */                            return null;
                                }
/* 30 */                        lIoii1l01l0i.I00000oOI(obj);
                            }
/* 60 */                    if (!((OoIIo0oOI1) olO0OIIl1.getValue()).I000II || ((OoIIo0oOI1) olO0OIIl1.getValue()).I0000Il00O != OoII00OiO.I00iOIl) {
/* 86 */                        return ooiIlOl1iI;
                            }
/* 75 */                    OoIIOoO ooIIOoO = (OoIIOoO) obj2;
/* 77 */                    OoIIOoO ooIIOoO2 = OoIIOoO.I00iOIl;
/* 79 */                    if (ooIIOoO == ooIIOoO2) {
/* 81 */                        ooIIOoO2 = OoIIOoO.I00iiI;
                            }
/* 83 */                    ooIO11oiiiil.I000OiO(ooIIOoO2);
/* 86 */                    return ooiIlOl1iI;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
/* 14 */        public IO0IOi1Oi(long j, IO0Il0o1OI iO0Il0o1OI, IOoil1iiIilo iOoil1iiIilo) {
                    super(2, iOoil1iiIilo);
/* 15 */            this.I00iio = j;
                    this.I00ilI0I1 = iO0Il0o1OI;
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
/* 15 */        public IO0IOi1Oi(IillIill1IO1 iillIill1IO1, long j, IOoil1iiIilo iOoil1iiIilo) {
                    super(2, iOoil1iiIilo);
/* 16 */            this.I00ilI0I1 = iillIill1IO1;
                    this.I00iio = j;
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
/* 16 */        public IO0IOi1Oi(Oo10IliO00O oo10IliO00O, Function1 function1, long j, IOoil1iiIilo iOoil1iiIilo) {
                    super(2, iOoil1iiIilo);
/* 17 */            this.I00iiO = oo10IliO00O;
                    this.I00ilI0I1 = function1;
                    this.I00iio = j;
                }
            }

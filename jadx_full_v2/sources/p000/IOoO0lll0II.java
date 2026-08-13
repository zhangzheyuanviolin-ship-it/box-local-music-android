            package p000;

            import java.lang.invoke.VarHandle;
            
/* 19 */    public final class IOoO0lll0II extends Oll0io implements IlliIl1l11O {
                public final int I00iOIl = 1;
                public int I00iiI;
                public final long I00iiO;
                public Object I00iio;
                public final Object I00ilI0I1;
                public final Object I00ilO0;
                public final Object I00io1l;
                public final Object I00ioIO;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public IOoO0lll0II(OO1O0I oo1o0i, String str, long j, Oo0lI00l oo0lI00l, Oo0IOoOi01 oo0IOoOi01, OIOlOI oIOlOI, IOoil1iiIilo iOoil1iiIilo) {
/* 17 */            super(2, iOoil1iiIilo);
/* 4 */             this.I00iio = oo1o0i;
/* 6 */             this.I00ilI0I1 = str;
/* 8 */             this.I00iiO = j;
/* 10 */            this.I00ilO0 = oo0lI00l;
/* 12 */            this.I00io1l = oo0IOoOi01;
/* 14 */            this.I00ioIO = oIOlOI;
                }

                @Override
                public final IOoil1iiIilo create(Object obj, IOoil1iiIilo iOoil1iiIilo) {
/* 1 */             int i = this.I00iOIl;
/* 3 */             Object obj2 = this.I00ioIO;
/* 5 */             Object obj3 = this.I00io1l;
/* 7 */             Object obj4 = this.I00ilO0;
/* 9 */             Object obj5 = this.I00ilI0I1;
                    switch (i) {
                        case 0:
/* 59 */                    IOoO0lll0II iOoO0lll0II = new IOoO0lll0II((Ooioool0) obj5, (IOoO1ol1) obj4, (III0liIO) obj3, this.I00iiO, (O010OIi) obj2, iOoil1iiIilo);
/* 62 */                    iOoO0lll0II.I00iio = obj;
/* 64 */                    return iOoO0lll0II;
                        default:
/* 37 */                    return new IOoO0lll0II((OO1O0I) this.I00iio, (String) obj5, this.I00iiO, (Oo0lI00l) obj4, (Oo0IOoOi01) obj3, (OIOlOI) obj2, iOoil1iiIilo);
                    }
                }

                @Override
                public final Object invoke(Object obj, Object obj2) {
/* 1 */             int i = this.I00iOIl;
/* 3 */             OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
                    switch (i) {
                        case 0:
/* 33 */                    return ((IOoO0lll0II) create((OiOol0il0il) obj, (IOoil1iiIilo) obj2)).invokeSuspend(ooiIlOl1iI);
                        default:
/* 18 */                    return ((IOoO0lll0II) create((Ii0110) obj, (IOoil1iiIilo) obj2)).invokeSuspend(ooiIlOl1iI);
                    }
                }

                /* JADX WARN: Removed duplicated region for block: B:14:0x004c  */
                /* JADX WARN: Removed duplicated region for block: B:17:0x0062  */
                @Override
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object invokeSuspend(Object obj) throws Throwable {
                    Object objI0000oI00;
/* 3 */             int i = this.I00iOIl;
/* 5 */             Object obj2 = this.I00ilO0;
/* 9 */             Object obj3 = this.I00io1l;
/* 12 */            Object obj4 = this.I00ilI0I1;
/* 14 */            Object obj5 = this.I00ioIO;
/* 16 */            OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
/* 18 */            IOoil1iiIilo iOoil1iiIilo = null;
                    switch (i) {
                        case 0:
/* 179 */                   III0liIO iII0liIO = (III0liIO) obj3;
/* 181 */                   IOoO1ol1 iOoO1ol1 = (IOoO1ol1) obj2;
/* 183 */                   Ooioool0 ooioool0 = (Ooioool0) obj4;
/* 185 */                   Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 187 */                   int i2 = this.I00iiI;
/* 189 */                   if (i2 != 0) {
/* 191 */                       if (i2 == 1) {
/* 193 */                           lIoii1l01l0i.I00000oOI(obj);
/* 260 */                           return ooiIlOl1iI;
                                }
/* 197 */                       I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 18 */                        return null;
                            }
/* 202 */                   lIoii1l01l0i.I00000oOI(obj);
/* 207 */                   OiOol0il0il oiOol0il0il = (OiOol0il0il) this.I00iio;
/* 215 */                   ooioool0.I0000oI00 = iOoO1ol1.I010l1O(iII0liIO, this.I00iiO);
/* 223 */                   I01oIoOI01l i01oIoOI01l = new I01oIoOI01l(11);
/* 226 */                   i01oIoOI01l.I00iiI = iOoO1ol1;
/* 228 */                   i01oIoOI01l.I00iiO = (O010OIi) obj5;
/* 230 */                   i01oIoOI01l.I00iio = oiOol0il0il;
/* 232 */                   VarHandle.storeStoreFence();
/* 239 */                   I0iI0O1IoIoI i0iI0O1IoIoI = new I0iI0O1IoIoI(12);
/* 242 */                   i0iI0O1IoIoI.I00iiI = iOoO1ol1;
/* 244 */                   i0iI0O1IoIoI.I00iiO = ooioool0;
/* 246 */                   i0iI0O1IoIoI.I00iio = iII0liIO;
/* 248 */                   VarHandle.storeStoreFence();
/* 251 */                   this.I00iiI = 1;
                            return ooioool0.I00000oIO(i01oIoOI01l, i0iI0O1IoIoI, this) == ii0111o ? ii0111o : ooiIlOl1iI;
                        default:
/* 22 */                    OIOlOI oIOlOI = (OIOlOI) obj5;
/* 25 */                    String str = (String) obj4;
/* 27 */                    Oo0IOoOi01 oo0IOoOi01 = (Oo0IOoOi01) obj3;
/* 29 */                    Ii0111o ii0111o2 = Ii0111o.I00iOIl;
/* 31 */                    int i3 = this.I00iiI;
/* 33 */                    if (i3 == 0) {
/* 49 */                        lIoii1l01l0i.I00000oOI(obj);
/* 55 */                        OO1O0I oo1o0i = (OO1O0I) this.I00iio;
/* 57 */                        this.I00iiI = 1;
/* 59 */                        oo1o0i.getClass();
/* 66 */                        if (str.length() == 0) {
/* 77 */                            objI0000oI00 = null;
/* 97 */                            if (objI0000oI00 == ii0111o2) {
/* 99 */                                return ii0111o2;
                                    }
                                } else {
/* 69 */                            long j = this.I00iiO;
/* 75 */                            if (!Oo0lI00l.I0000O(j)) {
/* 93 */                                objI0000oI00 = iOi1II01i0.I0000oI00(oo1o0i.I00000oIO, new O1o1iI(oo1o0i, new OO1Iool1ol(str, j, oo1o0i, (IOoil1iiIilo) null), iOoil1iiIilo, 5), this);
                                    }
/* 97 */                            if (objI0000oI00 == ii0111o2) {
                                    }
                                }
                            } else {
/* 35 */                        if (i3 != 1) {
/* 43 */                            I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 18 */                            return null;
                                }
/* 37 */                        lIoii1l01l0i.I00000oOI(obj);
/* 40 */                        objI0000oI00 = obj;
                            }
/* 101 */                   Oo0lI00l oo0lI00l = (Oo0lI00l) objI0000oI00;
/* 103 */                   if (oo0lI00l == null) {
/* 178 */                       return ooiIlOl1iI;
                            }
/* 105 */                   long j2 = oo0lI00l.I00000oIO;
/* 127 */                   long jI00000oIO = lOliOi0Oi.I00000oIO(oIOlOI.I000O01llI0((int) (j2 >> 32)), oIOlOI.I000O01llI0((int) (j2 & 4294967295L)));
/* 137 */                   if (Oo0lI00l.I00000oOI(jI00000oIO, (Oo0lI00l) obj2) || !O0000Ioio00.I0000O(oo0IOoOi01.I000l1().I00000oIO.I00iiI, str) || oIOlOI != oo0IOoOi01.I00000oOI) {
/* 178 */                       return ooiIlOl1iI;
                            }
/* 169 */                   oo0IOoOi01.I0000Il00O.invoke(Oo0IOoOi01.I00000oOI(oo0IOoOi01.I000l1().I00000oIO, jI00000oIO));
/* 176 */                   oo0IOoOi01.I001i1O0Ol = Oo0lI00l.I00000oIO(jI00000oIO);
/* 178 */                   return ooiIlOl1iI;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
/* 20 */        public IOoO0lll0II(Ooioool0 ooioool0, IOoO1ol1 iOoO1ol1, III0liIO iII0liIO, long j, O010OIi o010OIi, IOoil1iiIilo iOoil1iiIilo) {
                    super(2, iOoil1iiIilo);
/* 21 */            this.I00ilI0I1 = ooioool0;
                    this.I00ilO0 = iOoO1ol1;
                    this.I00io1l = iII0liIO;
                    this.I00iiO = j;
                    this.I00ioIO = o010OIi;
                }
            }

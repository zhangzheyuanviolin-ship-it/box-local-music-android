            package p000;

            import java.lang.invoke.VarHandle;
            import java.util.concurrent.atomic.AtomicInteger;
            import kotlin.jvm.functions.Function1;
            
            public final class OO01Ol implements OOl1o0IOoI, OO1lOI {
                public IliI1Ii1II I00000oIO;
                public Olil0III I00000oOI;
                public AtomicInteger I0000Il00O;
                public OoI0Oii0Ol00 I0000O;

                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                @Override
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object I00000oIO(String str, Function1 function1, IOoilo iOoilo) throws Throwable {
                    OO01OIo0 oO01OIo0;
/* 3 */             if (iOoilo instanceof OO01OIo0) {
/* 6 */                 oO01OIo0 = (OO01OIo0) iOoilo;
/* 8 */                 int i = oO01OIo0.I00ilI0I1;
/* 14 */                if ((i & Integer.MIN_VALUE) != 0) {
/* 17 */                    oO01OIo0.I00ilI0I1 = i - Integer.MIN_VALUE;
                        } else {
/* 22 */                    oO01OIo0 = new OO01OIo0(this, iOoilo);
                        }
                    }
/* 25 */            Object objI0000Il00O = oO01OIo0.I00iiO;
/* 27 */            Object obj = Ii0111o.I00iOIl;
/* 29 */            int i2 = oO01OIo0.I00ilI0I1;
/* 33 */            if (i2 == 0) {
/* 60 */                lIoii1l01l0i.I00000oOI(objI0000Il00O);
/* 63 */                oO01OIo0.I00iOIl = str;
/* 65 */                oO01OIo0.I00iiI = function1;
/* 67 */                oO01OIo0.I00ilI0I1 = 1;
/* 69 */                objI0000Il00O = I0000Il00O(oO01OIo0);
/* 73 */                if (objI0000Il00O != obj) {
                        }
                    }
/* 35 */            if (i2 != 1) {
/* 37 */                if (i2 == 2) {
/* 39 */                    lIoii1l01l0i.I00000oOI(objI0000Il00O);
/* 42 */                    return objI0000Il00O;
                        }
/* 45 */                I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 48 */                return null;
                    }
/* 50 */            function1 = oO01OIo0.I00iiI;
/* 52 */            str = oO01OIo0.I00iOIl;
/* 54 */            lIoii1l01l0i.I00000oOI(objI0000Il00O);
/* 57 */            String str2 = str;
/* 58 */            Function1 function12 = function1;
/* 82 */            IOoil1iiIilo iOoil1iiIilo = null;
/* 83 */            if (((Boolean) objI0000Il00O).booleanValue()) {
/* 85 */                IliI1Ii1II iliI1Ii1II = this.I00000oIO;
/* 91 */                IIo10iOO iIo10iOO = new IIo10iOO(this, str2, function12, iOoil1iiIilo, 1);
/* 94 */                oO01OIo0.I00iOIl = null;
/* 96 */                oO01OIo0.I00iiI = null;
/* 98 */                oO01OIo0.I00ilI0I1 = 2;
/* 100 */               Object objInvoke = iliI1Ii1II.invoke(iIo10iOO, oO01OIo0);
                        return objInvoke == obj ? obj : objInvoke;
                    }
/* 111 */           OiIIl0O1l0l oiIIl0O1l0lI00000oIO = this.I00000oOI.I00000oIO(str2);
                    try {
/* 115 */               Object objInvoke2 = function12.invoke(oiIIl0O1l0lI00000oIO);
/* 119 */               iOOl00.I00000oIO(oiIIl0O1l0lI00000oIO, null);
/* 122 */               return objInvoke2;
                    } finally {
                    }
                }

                @Override
                public final Olil0III I00000oOI() {
/* 1 */             return this.I00000oOI;
                }

                public final Boolean I0000Il00O(IOoil1iiIilo iOoil1iiIilo) {
/* 19 */            return Boolean.valueOf(this.I0000O != null || this.I00000oOI.I00iOIl.I00li1OI());
                }

                /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object I0000O(OoI0Oii0Ol00 ooI0Oii0Ol00, IlliIl1l11O illiIl1l11O, IOoilo iOoilo) {
                    OO01IoOil0 oO01IoOil0;
/* 1 */             AtomicInteger atomicInteger = this.I0000Il00O;
/* 3 */             Olil0III olil0III = this.I00000oOI;
/* 7 */             if (iOoilo instanceof OO01IoOil0) {
/* 10 */                oO01IoOil0 = (OO01IoOil0) iOoilo;
/* 12 */                int i = oO01IoOil0.I00iio;
/* 18 */                if ((i & Integer.MIN_VALUE) != 0) {
/* 21 */                    oO01IoOil0.I00iio = i - Integer.MIN_VALUE;
                        } else {
/* 26 */                    oO01IoOil0 = new OO01IoOil0(this, iOoilo);
                        }
                    }
/* 29 */            Object objInvoke = oO01IoOil0.I00iiI;
/* 31 */            Object obj = Ii0111o.I00iOIl;
/* 33 */            int i2 = oO01IoOil0.I00iio;
/* 38 */            int i3 = 1;
                    try {
/* 39 */                if (i2 == 0) {
/* 57 */                    lIoii1l01l0i.I00000oOI(objInvoke);
/* 60 */                    int iOrdinal = ooI0Oii0Ol00.ordinal();
/* 64 */                    if (iOrdinal == 0) {
/* 89 */                        lO0I0Io.I00000oIO(olil0III, "BEGIN DEFERRED TRANSACTION");
                            } else if (iOrdinal == 1) {
/* 83 */                        lO0I0Io.I00000oIO(olil0III, "BEGIN IMMEDIATE TRANSACTION");
                            } else {
/* 69 */                        if (iOrdinal != 2) {
/* 77 */                            I000II.I00000oIO();
/* 37 */                            return null;
                                }
/* 73 */                        lO0I0Io.I00000oIO(olil0III, "BEGIN EXCLUSIVE TRANSACTION");
                            }
/* 96 */                    if (atomicInteger.incrementAndGet() > 0) {
/* 98 */                        this.I0000O = ooI0Oii0Ol00;
                            }
/* 102 */                   OO01IO1Oo oO01IO1Oo = new OO01IO1Oo();
/* 105 */                   oO01IO1Oo.I00000oIO = this;
/* 107 */                   VarHandle.storeStoreFence();
/* 110 */                   oO01IoOil0.I00iOIl = 1;
/* 112 */                   oO01IoOil0.I00iio = 1;
/* 114 */                   objInvoke = illiIl1l11O.invoke(oO01IO1Oo, oO01IoOil0);
/* 118 */                   if (objInvoke == obj) {
/* 120 */                       return obj;
                            }
                        } else {
/* 41 */                    if (i2 != 1) {
/* 53 */                        I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 37 */                        return null;
                            }
/* 43 */                    i3 = oO01IoOil0.I00iOIl;
/* 45 */                    lIoii1l01l0i.I00000oOI(objInvoke);
                        }
/* 125 */               if (atomicInteger.decrementAndGet() == 0) {
/* 127 */                   this.I0000O = null;
                        }
/* 129 */               if (i3 != 0) {
/* 133 */                   lO0I0Io.I00000oIO(olil0III, "END TRANSACTION");
/* 136 */                   return objInvoke;
                        }
/* 137 */               lO0I0Io.I00000oIO(olil0III, "ROLLBACK TRANSACTION");
/* 140 */               return objInvoke;
                    } finally {
                    }
                }

                public final Object I0000oI00(OoI0Oii0Ol00 ooI0Oii0Ol00, IlliIl1l11O illiIl1l11O, Oll0io oll0io) {
/* 13 */            Object objInvoke = this.I00000oIO.invoke(new I0l1I01o10I1(this, ooI0Oii0Ol00, illiIl1l11O, null, 1), oll0io);
/* 17 */            Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 98 */            return objInvoke;
                }
            }

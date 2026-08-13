            package p000;

            import java.util.concurrent.CancellationException;
            
            public final class IOoO1Ooii extends Oll0io implements IlliIl1l11O {
                public int I00iOIl;
                public Object I00iiI;
                public final IOoO1ol1 I00iiO;
                public final Ooioool0 I00iio;
                public final III0liIO I00ilI0I1;
                public final long I00ilO0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public IOoO1Ooii(IOoO1ol1 iOoO1ol1, Ooioool0 ooioool0, III0liIO iII0liIO, long j, IOoil1iiIilo iOoil1iiIilo) {
/* 10 */            super(2, iOoil1iiIilo);
/* 1 */             this.I00iiO = iOoO1ol1;
/* 3 */             this.I00iio = ooioool0;
/* 5 */             this.I00ilI0I1 = iII0liIO;
/* 7 */             this.I00ilO0 = j;
                }

                @Override
                public final IOoil1iiIilo create(Object obj, IOoil1iiIilo iOoil1iiIilo) {
/* 12 */            IOoO1Ooii iOoO1Ooii = new IOoO1Ooii(this.I00iiO, this.I00iio, this.I00ilI0I1, this.I00ilO0, iOoil1iiIilo);
/* 15 */            iOoO1Ooii.I00iiI = obj;
/* 37 */            return iOoO1Ooii;
                }

                @Override
                public final Object invoke(Object obj, Object obj2) {
/* 13 */            return ((IOoO1Ooii) create((Ii0110) obj, (IOoil1iiIilo) obj2)).invokeSuspend(OoiIlOl1iI.I00000oIO);
                }

                @Override
                public final Object invokeSuspend(Object obj) throws Throwable {
/* 1 */             IOoO1ol1 iOoO1ol1 = this.I00iiO;
/* 3 */             Oi00IilOloo0 oi00IilOloo0 = iOoO1ol1.I00oIiI10;
/* 5 */             Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 7 */             int i = this.I00iOIl;
                    try {
                        try {
/* 12 */                    if (i == 0) {
/* 33 */                        lIoii1l01l0i.I00000oOI(obj);
/* 44 */                        O010OIi o010OIiI0000oI00 = l01oO1iOo.I0000oI00(((Ii0110) this.I00iiI).I00000oIO());
/* 48 */                        iOoO1ol1.I00ol1 = true;
/* 50 */                        Oii00o1ll oii00o1ll = iOoO1ol1.I00o0l1o1o0;
/* 52 */                        OI110lo oI110lo = OI110lo.I00iOIl;
/* 63 */                        IOoO0lll0II iOoO0lll0II = new IOoO0lll0II(this.I00iio, iOoO1ol1, this.I00ilI0I1, this.I00ilO0, o010OIiI0000oI00, null);
/* 66 */                        this.I00iOIl = 1;
/* 72 */                        if (oii00o1ll.I000II(oI110lo, iOoO0lll0II, this) == ii0111o) {
/* 74 */                            return ii0111o;
                                }
                            } else {
/* 14 */                        if (i != 1) {
/* 29 */                            I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 11 */                            return null;
                                }
/* 16 */                        lIoii1l01l0i.I00000oOI(obj);
                            }
/* 75 */                    oi00IilOloo0.I001i1lo1io();
/* 78 */                    iOoO1ol1.I00ol1 = false;
/* 80 */                    oi00IilOloo0.I00111O(null);
/* 83 */                    iOoO1ol1.I00oO101o = false;
/* 85 */                    return OoiIlOl1iI.I00000oIO;
                        } catch (CancellationException e) {
/* 88 */                    throw e;
                        }
                    } catch (Throwable th) {
/* 89 */                iOoO1ol1.I00ol1 = false;
/* 91 */                oi00IilOloo0.I00111O(null);
/* 94 */                iOoO1ol1.I00oO101o = false;
/* 168 */               throw th;
                    }
                }
            }

            package p000;

            import androidx.work.impl.WorkDatabase;
            import java.lang.invoke.VarHandle;
            import java.util.concurrent.CancellationException;
            
            public final class i01iiOO11 extends Oll0io implements IlliIl1l11O {
                public final int I00iOIl;
                public int I00iiI;
                public final i01ilO I00iiO;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public i01iiOO11(i01ilO i01ilo, IOoil1iiIilo iOoil1iiIilo, int i) {
/* 6 */             super(2, iOoil1iiIilo);
/* 1 */             this.I00iOIl = i;
/* 3 */             this.I00iiO = i01ilo;
                }

                @Override
                public final IOoil1iiIilo create(Object obj, IOoil1iiIilo iOoil1iiIilo) {
/* 1 */             int i = this.I00iOIl;
/* 3 */             i01ilO i01ilo = this.I00iiO;
                    switch (i) {
                        case 0:
/* 18 */                    return new i01iiOO11(i01ilo, iOoil1iiIilo, 0);
                        default:
/* 11 */                    return new i01iiOO11(i01ilo, iOoil1iiIilo, 1);
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
/* 18 */            return ((i01iiOO11) create(ii0110, iOoil1iiIilo)).invokeSuspend(ooiIlOl1iI);
                }

                @Override
                public final Object invokeSuspend(Object obj) throws Throwable {
                    Object i01iooio;
/* 1 */             int i = this.I00iOIl;
/* 5 */             i01ilO i01ilo = this.I00iiO;
/* 7 */             IOoil1iiIilo iOoil1iiIilo = null;
/* 8 */             int i2 = 1;
                    switch (i) {
                        case 0:
/* 105 */                   Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 107 */                   int i3 = this.I00iiI;
/* 109 */                   if (i3 == 0) {
/* 122 */                       lIoii1l01l0i.I00000oOI(obj);
/* 125 */                       this.I00iiI = 1;
/* 127 */                       Object objI0000Il00O = i01ilo.I0000Il00O(this);
                                return objI0000Il00O == ii0111o ? ii0111o : objI0000Il00O;
                            }
/* 111 */                   if (i3 == 1) {
/* 113 */                       lIoii1l01l0i.I00000oOI(obj);
/* 134 */                       return obj;
                            }
/* 117 */                   I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 7 */                     return null;
                        default:
/* 12 */                    Ii0111o ii0111o2 = Ii0111o.I00iOIl;
/* 14 */                    int i4 = this.I00iiI;
                            try {
/* 16 */                        if (i4 == 0) {
/* 32 */                            lIoii1l01l0i.I00000oOI(obj);
/* 35 */                            O010loOOi0Oo o010loOOi0Oo = i01ilo.I000o00OoI0I;
/* 40 */                            i01iiOO11 i01iioo11 = new i01iiOO11(i01ilo, iOoil1iiIilo, 0);
/* 43 */                            this.I00iiI = 1;
/* 45 */                            obj = iOi1II01i0.I0000oI00(o010loOOi0Oo, i01iioo11, this);
/* 49 */                            if (obj == ii0111o2) {
/* 51 */                                return ii0111o2;
                                    }
                                } else {
/* 18 */                            if (i4 != 1) {
/* 28 */                                I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 7 */                                 return null;
                                    }
/* 20 */                            lIoii1l01l0i.I00000oOI(obj);
                                }
/* 53 */                        i01iooio = (i01iiO) obj;
                            } catch (i01iIoo1loO e) {
/* 83 */                        i01iooio = new i01iiI111lo(e.I00iOIl);
                            } catch (CancellationException unused) {
/* 75 */                        i01iooio = new i01iOoio();
                            } catch (Throwable th) {
/* 64 */                        IIi0oIl.I000II().I0001Ioi1lo(i01ilOlII00I.I00000oIO, "Unexpected error in WorkerWrapper", th);
/* 69 */                        i01iooio = new i01iOoio();
                            }
/* 86 */                    WorkDatabase workDatabase = i01ilo.I000OOo1O;
/* 90 */                    IlII1oo ilII1oo = new IlII1oo(i2);
/* 93 */                    ilII1oo.I00000oOI = i01iooio;
/* 95 */                    ilII1oo.I0000Il00O = i01ilo;
/* 97 */                    VarHandle.storeStoreFence();
/* 100 */                   return workDatabase.I00100o1O0lo(ilII1oo);
                    }
                }
            }

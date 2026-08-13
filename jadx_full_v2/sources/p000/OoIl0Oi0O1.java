            package p000;

            import android.database.SQLException;
            import java.util.Set;
            
            public final class OoIl0Oi0O1 extends Oll0io implements IlliIl1l11O {
                public final int I00iOIl;
                public int I00iiI;
                public Object I00iiO;
                public final OoIlIoo1oiOo I00iio;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public OoIl0Oi0O1(OoIlIoo1oiOo ooIlIoo1oiOo, IOoil1iiIilo iOoil1iiIilo, int i) {
/* 6 */             super(2, iOoil1iiIilo);
/* 1 */             this.I00iOIl = i;
/* 3 */             this.I00iio = ooIlIoo1oiOo;
                }

                @Override
                public final IOoil1iiIilo create(Object obj, IOoil1iiIilo iOoil1iiIilo) {
/* 1 */             int i = this.I00iOIl;
/* 3 */             OoIlIoo1oiOo ooIlIoo1oiOo = this.I00iio;
                    switch (i) {
                        case 0:
/* 20 */                    OoIl0Oi0O1 ooIl0Oi0O1 = new OoIl0Oi0O1(ooIlIoo1oiOo, iOoil1iiIilo, 0);
/* 23 */                    ooIl0Oi0O1.I00iiO = obj;
/* 25 */                    return ooIl0Oi0O1;
                        default:
/* 11 */                    OoIl0Oi0O1 ooIl0Oi0O12 = new OoIl0Oi0O1(ooIlIoo1oiOo, iOoil1iiIilo, 1);
/* 14 */                    ooIl0Oi0O12.I00iiO = obj;
/* 16 */                    return ooIl0Oi0O12;
                    }
                }

                @Override
                public final Object invoke(Object obj, Object obj2) {
/* 1 */             int i = this.I00iOIl;
/* 3 */             OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
                    switch (i) {
                        case 0:
/* 33 */                    return ((OoIl0Oi0O1) create((OO01IO1Oo) obj, (IOoil1iiIilo) obj2)).invokeSuspend(ooiIlOl1iI);
                        default:
/* 18 */                    return ((OoIl0Oi0O1) create((OO01Ol) obj, (IOoil1iiIilo) obj2)).invokeSuspend(ooiIlOl1iI);
                    }
                }

                /* JADX WARN: Code restructure failed: missing block: B:19:0x0052, code lost:
                
                    if (r8 == r0) goto L20;
                 */
                @Override
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object invokeSuspend(Object obj) throws Throwable {
                    OO01Ol oO01Ol;
/* 1 */             int i = this.I00iOIl;
/* 3 */             OoIlIoo1oiOo ooIlIoo1oiOo = this.I00iio;
/* 8 */             IOoil1iiIilo iOoil1iiIilo = null;
                    switch (i) {
                        case 0:
/* 94 */                    Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 96 */                    int i2 = this.I00iiI;
/* 98 */                    if (i2 != 0) {
/* 100 */                       if (i2 == 1) {
/* 102 */                           lIoii1l01l0i.I00000oOI(obj);
/* 127 */                           return obj;
                                }
/* 106 */                       I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 8 */                         return null;
                            }
/* 111 */                   lIoii1l01l0i.I00000oOI(obj);
/* 116 */                   OO01IO1Oo oO01IO1Oo = (OO01IO1Oo) this.I00iiO;
/* 118 */                   this.I00iiI = 1;
/* 120 */                   Object objI00000oIO = ooIlIoo1oiOo.I00000oIO(oO01IO1Oo, this);
                            return objI00000oIO == ii0111o ? ii0111o : objI00000oIO;
                        default:
/* 12 */                    Ii0111o ii0111o2 = Ii0111o.I00iOIl;
/* 14 */                    int i3 = this.I00iiI;
                            try {
/* 17 */                        if (i3 == 0) {
/* 39 */                            lIoii1l01l0i.I00000oOI(obj);
/* 45 */                            oO01Ol = (OO01Ol) this.I00iiO;
/* 47 */                            this.I00iiO = oO01Ol;
/* 49 */                            this.I00iiI = 1;
/* 51 */                            obj = oO01Ol.I0000Il00O(this);
/* 55 */                            if (obj != ii0111o2) {
                                    }
/* 85 */                            return ii0111o2;
                                }
/* 19 */                        if (i3 != 1) {
/* 21 */                            if (i3 == 2) {
/* 23 */                                lIoii1l01l0i.I00000oOI(obj);
/* 88 */                                return (Set) obj;
                                    }
/* 27 */                            I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 8 */                             return null;
                                }
/* 33 */                        oO01Ol = (OO01Ol) this.I00iiO;
/* 35 */                        lIoii1l01l0i.I00000oOI(obj);
/* 64 */                        if (!((Boolean) obj).booleanValue()) {
/* 67 */                            OoI0Oii0Ol00 ooI0Oii0Ol00 = OoI0Oii0Ol00.I00iiI;
/* 72 */                            OoIl0Oi0O1 ooIl0Oi0O1 = new OoIl0Oi0O1(ooIlIoo1oiOo, iOoil1iiIilo, 0);
/* 75 */                            this.I00iiO = null;
/* 77 */                            this.I00iiI = 2;
/* 79 */                            obj = oO01Ol.I0000oI00(ooI0Oii0Ol00, ooIl0Oi0O1, this);
                                    break;
                                }
                            } catch (SQLException unused) {
                            }
/* 91 */                    return Il01llIol0.I00iOIl;
                    }
                }
            }

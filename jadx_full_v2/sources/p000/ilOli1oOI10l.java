            package p000;

            import java.lang.invoke.VarHandle;
            import kotlin.jvm.functions.Function3;
            
            public abstract class ilOli1oOI10l {
                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public static final Object I00000oIO(Oo10iolo oo10iolo, Function3 function3, Throwable th, IOoilo iOoilo) throws Throwable {
                    IlOio11 ilOio11;
/* 3 */             if (iOoilo instanceof IlOio11) {
/* 6 */                 ilOio11 = (IlOio11) iOoilo;
/* 8 */                 int i = ilOio11.I00iiO;
/* 14 */                if ((i & Integer.MIN_VALUE) != 0) {
/* 17 */                    ilOio11.I00iiO = i - Integer.MIN_VALUE;
                        } else {
/* 22 */                    ilOio11 = new IlOio11(iOoilo);
                        }
                    }
/* 25 */            Object obj = ilOio11.I00iiI;
/* 27 */            Object obj2 = Ii0111o.I00iOIl;
/* 29 */            int i2 = ilOio11.I00iiO;
                    try {
/* 32 */                if (i2 == 0) {
/* 51 */                    lIoii1l01l0i.I00000oOI(obj);
/* 54 */                    ilOio11.I00iOIl = th;
/* 56 */                    ilOio11.I00iiO = 1;
/* 62 */                    if (function3.invoke(oo10iolo, th, ilOio11) == obj2) {
/* 64 */                        return obj2;
                            }
                        } else {
/* 34 */                    if (i2 != 1) {
/* 46 */                        I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 49 */                        return null;
                            }
/* 36 */                    th = ilOio11.I00iOIl;
/* 38 */                    lIoii1l01l0i.I00000oOI(obj);
                        }
/* 65 */                return OoiIlOl1iI.I00000oIO;
                    } catch (Throwable th2) {
/* 68 */                if (th != null && th != th2) {
/* 72 */                    ilIilolOlIoO.I00000oIO(th2, th);
                        }
/* 483 */               throw th2;
                    }
                }

                public static final IlOioIoiI I00000oOI(IlOil1ii ilOil1ii, Function3 function3) {
/* 4 */             IlOioIoiI ilOioIoiI = new IlOioIoiI(0);
/* 7 */             ilOioIoiI.I00iiI = ilOil1ii;
/* 9 */             ilOioIoiI.I00iiO = function3;
/* 11 */            VarHandle.storeStoreFence();
/* 89 */            return ilOioIoiI;
                }
            }

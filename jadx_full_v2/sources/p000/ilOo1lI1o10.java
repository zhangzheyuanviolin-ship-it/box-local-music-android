            package p000;

            import java.io.Serializable;
            import java.lang.invoke.VarHandle;
            import java.util.concurrent.CancellationException;
            import kotlin.jvm.functions.Function3;
            
            public abstract class ilOo1lI1o10 {
                public static final IlOioIoiI I00000oIO(IlOil1ii ilOil1ii, Function3 function3) {
/* 4 */             IlOioIoiI ilOioIoiI = new IlOioIoiI(1);
/* 7 */             ilOioIoiI.I00iiI = ilOil1ii;
/* 9 */             ilOioIoiI.I00iiO = function3;
/* 11 */            VarHandle.storeStoreFence();
/* 89 */            return ilOioIoiI;
                }

                /* JADX WARN: Removed duplicated region for block: B:46:0x008a A[RETURN] */
                /* JADX WARN: Removed duplicated region for block: B:47:0x008b  */
                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public static final Serializable I00000oOI(IlOil1ii ilOil1ii, IlOil1iooOO0 ilOil1iooOO0, IOoilo iOoilo) throws Throwable {
                    IlOlIoOI ilOlIoOI;
                    OOo0ooi oOo0ooi;
                    Throwable th;
                    O010OIi o010OIi;
                    CancellationException cancellationExceptionI00Io1lO;
/* 3 */             if (iOoilo instanceof IlOlIoOI) {
/* 6 */                 ilOlIoOI = (IlOlIoOI) iOoilo;
/* 8 */                 int i = ilOlIoOI.I00iiO;
/* 14 */                if ((i & Integer.MIN_VALUE) != 0) {
/* 17 */                    ilOlIoOI.I00iiO = i - Integer.MIN_VALUE;
                        } else {
/* 22 */                    ilOlIoOI = new IlOlIoOI(iOoilo);
                        }
                    }
/* 25 */            Object obj = ilOlIoOI.I00iiI;
/* 27 */            Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 29 */            int i2 = ilOlIoOI.I00iiO;
/* 33 */            if (i2 == 0) {
/* 51 */                lIoii1l01l0i.I00000oOI(obj);
/* 56 */                OOo0ooi oOo0ooi2 = new OOo0ooi();
                        try {
                        } catch (Throwable th2) {
/* 83 */                    th = th2;
                        }
                        try {
/* 61 */                    IiiilIli iiiilIli = new IiiilIli(1);
/* 64 */                    iiiilIli.I00iiI = ilOil1iooOO0;
/* 66 */                    iiiilIli.I00iiO = oOo0ooi2;
/* 68 */                    VarHandle.storeStoreFence();
/* 71 */                    ilOlIoOI.I00iOIl = oOo0ooi2;
/* 73 */                    ilOlIoOI.I00iiO = 1;
/* 79 */                    if (ilOil1ii.I00000oIO(iiiilIli, ilOlIoOI) == ii0111o) {
/* 81 */                        return ii0111o;
                            }
/* 32 */                    return null;
                        } catch (Throwable th3) {
/* 86 */                    th = th3;
/* 84 */                    oOo0ooi = oOo0ooi2;
/* 92 */                    th = (Throwable) oOo0ooi.I00iOIl;
/* 94 */                    if (th == null) {
/* 137 */                       if (th == null) {
                                }
                            } else if (th == null) {
                            }
/* 136 */                   throw th;
                        }
                    }
/* 35 */            if (i2 != 1) {
/* 47 */                I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 32 */                return null;
                    }
/* 37 */            oOo0ooi = ilOlIoOI.I00iOIl;
                    try {
/* 39 */                lIoii1l01l0i.I00000oOI(obj);
/* 32 */                return null;
                    } catch (Throwable th4) {
/* 43 */                th = th4;
                    }
/* 92 */            th = (Throwable) oOo0ooi.I00iOIl;
/* 94 */            if ((th == null && th.equals(th)) || ((o010OIi = (O010OIi) ilOlIoOI.getContext().I00lli11(Iioi0lilII.I00iio)) != null && o010OIi.isCancelled() && (cancellationExceptionI00Io1lO = o010OIi.I00Io1lO()) != null && cancellationExceptionI00Io1lO.equals(th))) {
/* 136 */               throw th;
                    }
/* 137 */           if (th == null) {
/* 139 */               return th;
                    }
/* 142 */           if (th instanceof CancellationException) {
/* 144 */               ilIilolOlIoO.I00000oIO(th, th);
/* 147 */               throw th;
                    }
/* 148 */           ilIilolOlIoO.I00000oIO(th, th);
/* 215 */           throw th;
                }
            }

            package p000;

            import java.util.concurrent.CancellationException;
            
            public abstract class ilOl0o1O {
                /* JADX WARN: Code restructure failed: missing block: B:32:0x0083, code lost:
                
                    if (r2.emit(r10, r0) == r1) goto L33;
                 */
                /* JADX WARN: Removed duplicated region for block: B:27:0x0064  */
                /* JADX WARN: Removed duplicated region for block: B:28:0x0065  */
                /* JADX WARN: Removed duplicated region for block: B:31:0x0071 A[Catch: all -> 0x0035, TRY_LEAVE, TryCatch #0 {all -> 0x0035, blocks: (B:13:0x002f, B:25:0x0054, B:29:0x0069, B:31:0x0071, B:20:0x0045, B:24:0x0050), top: B:50:0x0021 }] */
                /* JADX WARN: Removed duplicated region for block: B:34:0x0086  */
                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x0083 -> B:14:0x0032). Please report as a decompilation issue!!! */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public static final Object I00000oIO(IlOil1iooOO0 ilOil1iooOO0, OOlloO oOlloO, boolean z, IOoil1iiIilo iOoil1iiIilo) {
                    IlOilo ilOilo;
                    IIII0iI10 it;
                    IIII0iI10 iIII0iI10;
                    IlOil1iooOO0 ilOil1iooOO02;
                    Object objI00000oOI;
/* 3 */             if (iOoil1iiIilo instanceof IlOilo) {
/* 6 */                 ilOilo = (IlOilo) iOoil1iiIilo;
/* 8 */                 int i = ilOilo.I00ilO0;
/* 14 */                if ((i & Integer.MIN_VALUE) != 0) {
/* 17 */                    ilOilo.I00ilO0 = i - Integer.MIN_VALUE;
                        } else {
/* 22 */                    ilOilo = new IlOilo(iOoil1iiIilo);
                        }
                    }
/* 25 */            Object obj = ilOilo.I00ilI0I1;
/* 27 */            Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 29 */            int i2 = ilOilo.I00ilO0;
/* 33 */            CancellationException cancellationExceptionI00000oIO = null;
                    try {
/* 34 */                if (i2 == 0) {
/* 74 */                    lIoii1l01l0i.I00000oOI(obj);
/* 79 */                    if (ilOil1iooOO0 instanceof Oo10iolo) {
/* 483 */                       throw ((Oo10iolo) ilOil1iooOO0).I00iOIl;
                            }
/* 81 */                    it = oOlloO.iterator();
/* 85 */                    ilOilo.I00iOIl = ilOil1iooOO0;
/* 87 */                    ilOilo.I00iiI = oOlloO;
/* 89 */                    ilOilo.I00iiO = it;
/* 91 */                    ilOilo.I00iio = z;
/* 93 */                    ilOilo.I00ilO0 = 1;
/* 95 */                    objI00000oOI = it.I00000oOI(ilOilo);
/* 99 */                    if (objI00000oOI != ii0111o) {
                            }
                        } else if (i2 == 1) {
/* 62 */                    z = ilOilo.I00iio;
/* 64 */                    iIII0iI10 = ilOilo.I00iiO;
/* 66 */                    oOlloO = ilOilo.I00iiI;
/* 68 */                    ilOil1iooOO02 = ilOilo.I00iOIl;
/* 70 */                    lIoii1l01l0i.I00000oOI(obj);
/* 112 */                   if (((Boolean) obj).booleanValue()) {
                            }
                        } else {
/* 38 */                    if (i2 != 2) {
/* 58 */                        I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 33 */                        return null;
                            }
/* 40 */                    z = ilOilo.I00iio;
/* 42 */                    iIII0iI10 = ilOilo.I00iiO;
/* 44 */                    oOlloO = ilOilo.I00iiI;
/* 46 */                    ilOil1iooOO02 = ilOilo.I00iOIl;
/* 48 */                    lIoii1l01l0i.I00000oOI(obj);
/* 51 */                    it = iIII0iI10;
/* 52 */                    ilOil1iooOO0 = ilOil1iooOO02;
/* 85 */                    ilOilo.I00iOIl = ilOil1iooOO0;
/* 87 */                    ilOilo.I00iiI = oOlloO;
/* 89 */                    ilOilo.I00iiO = it;
/* 91 */                    ilOilo.I00iio = z;
/* 93 */                    ilOilo.I00ilO0 = 1;
/* 95 */                    objI00000oOI = it.I00000oOI(ilOilo);
/* 99 */                    if (objI00000oOI != ii0111o) {
/* 134 */                       return ii0111o;
                            }
/* 103 */                   ilOil1iooOO02 = ilOil1iooOO0;
/* 104 */                   iIII0iI10 = it;
/* 105 */                   obj = objI00000oOI;
/* 112 */                   if (((Boolean) obj).booleanValue()) {
/* 135 */                       if (z) {
/* 137 */                           oOlloO.I000II(null);
                                }
/* 140 */                       return OoiIlOl1iI.I00000oIO;
                            }
/* 114 */                   Object objI0000Il00O = iIII0iI10.I0000Il00O();
/* 118 */                   ilOilo.I00iOIl = ilOil1iooOO02;
/* 120 */                   ilOilo.I00iiI = oOlloO;
/* 122 */                   ilOilo.I00iiO = iIII0iI10;
/* 124 */                   ilOilo.I00iio = z;
/* 126 */                   ilOilo.I00ilO0 = 2;
                        }
                    } finally {
                    }
                }
            }

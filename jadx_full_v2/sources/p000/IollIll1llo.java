            package p000;

            import java.lang.invoke.VarHandle;
            import kotlin.jvm.functions.Function3;
            
            public final class IollIll1llo implements Function3 {
                public long I00iOIl;
                public Ioll0ll0 I00iiI;
                public IiIooOOOI I00iiO;
                public OI10i0Il I00iio;

                /* JADX WARN: Removed duplicated region for block: B:19:0x0046  */
                @Override
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object invoke(Object obj, Object obj2, Object obj3) {
/* 1 */             String str = (String) obj;
/* 3 */             IloI0lOlll1 iloI0lOlll1 = (IloI0lOlll1) obj2;
/* 7 */             int iIntValue = ((Number) obj3).intValue();
/* 11 */            long j = this.I00iOIl;
/* 15 */            if ((iIntValue & 6) == 0) {
/* 26 */                iIntValue |= iloI0lOlll1.I000II(str) ? 4 : 2;
                    }
/* 31 */            if ((iIntValue & 19) == 18 && iloI0lOlll1.I00IO1()) {
/* 40 */                iloI0lOlll1.I00OilO00Il();
                    } else {
/* 45 */                Ioll0ll0 ioll0ll0 = this.I00iiI;
/* 47 */                IiIooOOOI iiIooOOOI = this.I00iiO;
/* 52 */                iloI0lOlll1.I00i01iIIliI(243502826);
/* 55 */                boolean zI0001Ioi1lo = iloI0lOlll1.I0001Ioi1lo(j);
/* 59 */                OI10i0Il oI10i0Il = this.I00iio;
/* 61 */                Object objI00O0i0ii = iloI0lOlll1.I00O0i0ii();
/* 65 */                if (!zI0001Ioi1lo) {
                            Object obj4 = objI00O0i0ii;
/* 69 */                    if (objI00O0i0ii == IOl11li.I00000oIO) {
/* 73 */                        IollI1O iollI1O = new IollI1O();
/* 76 */                        iollI1O.I00000oIO = j;
/* 78 */                        iollI1O.I00000oOI = oI10i0Il;
/* 80 */                        VarHandle.storeStoreFence();
/* 83 */                        iloI0lOlll1.I00iio(iollI1O);
                                obj4 = iollI1O;
                            }
/* 86 */                    O1iOIl0o10 o1iOIl0o10 = (O1iOIl0o10) obj4;
/* 89 */                    iloI0lOlll1.I0010I0i(false);
/* 92 */                    int iI00000oIO = iilI1O0il0.I00000oIO(iloI0lOlll1);
/* 96 */                    OO0lO0l0 oO0lO0l0I000lI = iloI0lOlll1.I000lI();
/* 102 */                   O1ooiI111i o1ooiI111iI0000Il00O = iilOllOlO1.I0000Il00O(iloI0lOlll1, O1ooIo101ll.I00000oIO);
/* 108 */                   IOl0oi0lOl1.I000lI.getClass();
/* 111 */                   iloI0lOlll1.I00i0oil();
/* 116 */                   if (iloI0lOlll1.I00O10llo) {
/* 120 */                       iloI0lOlll1.I000l1(O0iiOioolIi.I01101IOlO);
                            } else {
/* 124 */                       iloI0lOlll1.I00io1l();
                            }
/* 129 */                   li01Ooiio01.I0000Il00O(lolOiIoiillI.I00io1l, iloI0lOlll1, o1iOIl0o10);
/* 134 */                   li01Ooiio01.I0000Il00O(lolOiIoiillI.I00ilO0, iloI0lOlll1, oO0lO0l0I000lI);
/* 137 */                   IOioOOi0I iOioOOi0I = lolOiIoiillI.I00ioIO;
/* 141 */                   if (iloI0lOlll1.I00O10llo || !O0000Ioio00.I0000O(iloI0lOlll1.I00O0i0ii(), Integer.valueOf(iI00000oIO))) {
/* 161 */                       iloI0lOlll1.I00iio(Integer.valueOf(iI00000oIO));
/* 168 */                       iloI0lOlll1.I00000oOI(iOioOOi0I, Integer.valueOf(iI00000oIO));
                            }
/* 173 */                   li01Ooiio01.I0000Il00O(lolOiIoiillI.I00ilI0I1, iloI0lOlll1, o1ooiI111iI0000Il00O);
/* 186 */                   ioll0ll0.I00000oOI.I000l1(iiIooOOOI, str, iloI0lOlll1, Integer.valueOf((iIntValue << 3) & 112));
/* 190 */                   iloI0lOlll1.I0010I0i(true);
                        }
                    }
/* 193 */           return OoiIlOl1iI.I00000oIO;
                }
            }

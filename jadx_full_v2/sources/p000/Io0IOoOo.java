            package p000;

            import java.lang.invoke.VarHandle;
            import kotlin.jvm.functions.Function3;
            
            public final class Io0IOoOo implements Function3 {
                public final int I00iOIl;
                public IllOOo00lI I00iiI;

                public Io0IOoOo(int i) {
/* 1 */             this.I00iOIl = i;
                }

                /* JADX WARN: Removed duplicated region for block: B:18:0x0076  */
                @Override
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object invoke(Object obj, Object obj2, Object obj3) {
/* 1 */             int i = this.I00iOIl;
/* 4 */             IllOOo00lI illOOo00lI = this.I00iiI;
                    switch (i) {
                        case 0:
/* 82 */                    IloI0lOlll1 iloI0lOlll1 = (IloI0lOlll1) obj2;
/* 86 */                    int iIntValue = ((Integer) obj3).intValue();
/* 103 */                   if (iloI0lOlll1.I00OIl(iIntValue & 1, (iIntValue & 17) != 16)) {
/* 105 */                       boolean zI000II = iloI0lOlll1.I000II(illOOo00lI);
/* 109 */                       Object objI00O0i0ii = iloI0lOlll1.I00O0i0ii();
/* 113 */                       if (!zI000II) {
                                    Object obj4 = objI00O0i0ii;
/* 117 */                           if (objI00O0i0ii == IOl11li.I00000oIO) {
/* 122 */                               I0O1OI i0o1oi = new I0O1OI(7);
/* 125 */                               i0o1oi.I00iiI = illOOo00lI;
/* 127 */                               VarHandle.storeStoreFence();
/* 130 */                               iloI0lOlll1.I00iio(i0o1oi);
                                        obj4 = i0o1oi;
                                    }
/* 146 */                           iIo1101O.I00000oIO((IllOOo00lI) obj4, null, false, null, null, i1i10Oi.I00000oIO, iloI0lOlll1, 1572864, 62);
                                }
                            } else {
/* 150 */                       iloI0lOlll1.I00OilO00Il();
                            }
/* 153 */                   return OoiIlOl1iI.I00000oIO;
                        default:
/* 9 */                     O1iOIoOiO0 o1iOIoOiO0 = (O1iOIoOiO0) obj;
/* 11 */                    O1iIo0ll o1iIo0ll = (O1iIo0ll) obj2;
/* 13 */                    IOo0oO11ll1O iOo0oO11ll1O = (IOo0oO11ll1O) obj3;
/* 21 */                    float f = ((Iil1010O) illOOo00lI.invoke()).I00iOIl;
/* 52 */                    OO1I0001000i oO1I0001000iI001lllioOl = o1iIo0ll.I001lllioOl(IOo0oO11ll1O.I0000Il00O(iOo0oO11ll1O.I00000oIO, 0, 0, IOo0olo.I0001Ioi1lo(Iil1010O.I0000Il00O(f, Float.NaN) ? 0 : o1iOIoOiO0.I00l0OO0IO(f), iOo0oO11ll1O.I00000oIO), 0, 11));
/* 56 */                    int i2 = oO1I0001000iI001lllioOl.I00iOIl;
/* 58 */                    int i3 = oO1I0001000iI001lllioOl.I00iiI;
/* 64 */                    I0li0o i0li0o = new I0li0o(14);
/* 67 */                    i0li0o.I00iiI = oO1I0001000iI001lllioOl;
/* 69 */                    VarHandle.storeStoreFence();
/* 74 */                    return o1iOIoOiO0.I001i1lo1io(i2, i3, Il011I1OiO0I.I00iOIl, i0li0o);
                    }
                }
            }

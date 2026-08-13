            package p000;

            import java.lang.invoke.VarHandle;
            
            public final class IOiiil0i implements IlliOIilI {
                public static final IOiiil0i I00iiI = new IOiiil0i(0);
                public static final IOiiil0i I00iiO = new IOiiil0i(1);
                public static final IOiiil0i I00iio = new IOiiil0i(2);
                public static final IOiiil0i I00ilI0I1 = new IOiiil0i(3);
                public static final IOiiil0i I00ilO0 = new IOiiil0i(4);
                public final int I00iOIl;

                public IOiiil0i(int i) {
/* 1 */             this.I00iOIl = i;
                }

                @Override
                public final Object I000l1(Object obj, Object obj2, Object obj3, Object obj4) {
                    int i;
                    int i2;
                    int i3;
                    int i4;
/* 1 */             int i5 = this.I00iOIl;
/* 12 */            OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
/* 14 */            int i6 = 2;
                    switch (i5) {
                        case 0:
/* 345 */                   ((Number) obj4).intValue();
                            break;
                        case 1:
/* 276 */                   Oo0lloOiiIOI oo0lloOiiIOI = (Oo0lloOiiIOI) obj;
/* 278 */                   IlliIl1l11O illiIl1l11O = (IlliIl1l11O) obj2;
/* 280 */                   IloI0lOlll1 iloI0lOlll1 = (IloI0lOlll1) obj3;
/* 284 */                   int iIntValue = ((Number) obj4).intValue();
/* 290 */                   if ((iIntValue & 6) == 0) {
/* 300 */                       i = iIntValue | (iloI0lOlll1.I000II(oo0lloOiiIOI) ? 4 : 2);
                            } else {
/* 303 */                       i = iIntValue;
                            }
/* 306 */                   if ((iIntValue & 48) == 0) {
/* 315 */                       i |= iloI0lOlll1.I000OOo1O(illiIl1l11O) ? 32 : 16;
                            }
/* 318 */                   if ((i & 147) != 146 || !iloI0lOlll1.I00IO1()) {
/* 333 */                       Oo0i1oIIoOO.I00000oIO(oo0lloOiiIOI, illiIl1l11O, iloI0lOlll1, i & 126);
                                break;
                            } else {
/* 327 */                       iloI0lOlll1.I00OilO00Il();
                                break;
                            }
                            break;
                        case 2:
/* 190 */                   long j = ((IOOiio0i) obj).I00000oIO;
/* 192 */                   IlliIl1l11O illiIl1l11O2 = (IlliIl1l11O) obj2;
/* 194 */                   IloI0lOlll1 iloI0lOlll12 = (IloI0lOlll1) obj3;
/* 198 */                   int iIntValue2 = ((Number) obj4).intValue();
/* 204 */                   if ((iIntValue2 & 6) == 0) {
/* 214 */                       i2 = (iloI0lOlll12.I0001Ioi1lo(j) ? 4 : 2) | iIntValue2;
                            } else {
/* 216 */                       i2 = iIntValue2;
                            }
/* 219 */                   if ((iIntValue2 & 48) == 0) {
/* 228 */                       i2 |= iloI0lOlll12.I000OOo1O(illiIl1l11O2) ? 32 : 16;
                            }
/* 231 */                   if ((i2 & 147) != 146 || !iloI0lOlll12.I00IO1()) {
/* 250 */                       OOiIo1lll oOiIo1lllI00000oIO = IOoIioIOoolI.I00000oIO.I00000oIO(IOOiio0i.I00000oIO(j));
/* 257 */                       IOio100lIliI iOio100lIliI = new IOio100lIliI(0);
/* 260 */                       iOio100lIliI.I00iiI = illiIl1l11O2;
/* 262 */                       VarHandle.storeStoreFence();
/* 272 */                       iiliio0o.I00000oIO(oOiIo1lllI00000oIO, iiioOl1O.I00000oOI(-2003013541, iOio100lIliI, iloI0lOlll12), iloI0lOlll12, 56);
                                break;
                            } else {
/* 240 */                       iloI0lOlll12.I00OilO00Il();
                                break;
                            }
                        case 3:
/* 105 */                   Oo0lloOiiIOI oo0lloOiiIOI2 = (Oo0lloOiiIOI) obj;
/* 107 */                   IlliIl1l11O illiIl1l11O3 = (IlliIl1l11O) obj2;
/* 109 */                   IloI0lOlll1 iloI0lOlll13 = (IloI0lOlll1) obj3;
/* 113 */                   int iIntValue3 = ((Number) obj4).intValue();
/* 119 */                   if ((iIntValue3 & 6) == 0) {
/* 129 */                       i3 = iIntValue3 | (iloI0lOlll13.I000II(oo0lloOiiIOI2) ? 4 : 2);
                            } else {
/* 132 */                       i3 = iIntValue3;
                            }
/* 135 */                   if ((iIntValue3 & 48) == 0) {
/* 144 */                       i3 |= iloI0lOlll13.I000OOo1O(illiIl1l11O3) ? 32 : 16;
                            }
/* 147 */                   if ((i3 & 147) != 146 || !iloI0lOlll13.I00IO1()) {
/* 162 */                       OOiIo1lll oOiIo1lllI00000oIO2 = Oi1Io0I.I00000oIO.I00000oIO(oo0lloOiiIOI2);
/* 169 */                       IOio100lIliI iOio100lIliI2 = new IOio100lIliI(1);
/* 172 */                       iOio100lIliI2.I00iiI = illiIl1l11O3;
/* 174 */                       VarHandle.storeStoreFence();
/* 184 */                       iiliio0o.I00000oIO(oOiIo1lllI00000oIO2, iiioOl1O.I00000oOI(2071797151, iOio100lIliI2, iloI0lOlll13), iloI0lOlll13, 56);
                                break;
                            } else {
/* 156 */                       iloI0lOlll13.I00OilO00Il();
                                break;
                            }
                            break;
                        default:
/* 20 */                    long j2 = ((IOOiio0i) obj).I00000oIO;
/* 22 */                    IlliIl1l11O illiIl1l11O4 = (IlliIl1l11O) obj2;
/* 24 */                    IloI0lOlll1 iloI0lOlll14 = (IloI0lOlll1) obj3;
/* 28 */                    int iIntValue4 = ((Number) obj4).intValue();
/* 34 */                    if ((iIntValue4 & 6) == 0) {
/* 44 */                        i4 = (iloI0lOlll14.I0001Ioi1lo(j2) ? 4 : 2) | iIntValue4;
                            } else {
/* 46 */                        i4 = iIntValue4;
                            }
/* 49 */                    if ((iIntValue4 & 48) == 0) {
/* 58 */                        i4 |= iloI0lOlll14.I000OOo1O(illiIl1l11O4) ? 32 : 16;
                            }
/* 61 */                    if ((i4 & 147) != 146 || !iloI0lOlll14.I00IO1()) {
/* 80 */                        OOiIo1lll oOiIo1lllI00000oIO3 = Oi1Io0I.I00000oOI.I00000oIO(IOOiio0i.I00000oIO(j2));
/* 86 */                        IOio100lIliI iOio100lIliI3 = new IOio100lIliI(i6);
/* 89 */                        iOio100lIliI3.I00iiI = illiIl1l11O4;
/* 91 */                        VarHandle.storeStoreFence();
/* 101 */                       iiliio0o.I00000oIO(oOiIo1lllI00000oIO3, iiioOl1O.I00000oOI(-824975258, iOio100lIliI3, iloI0lOlll14), iloI0lOlll14, 56);
                                break;
                            } else {
/* 70 */                        iloI0lOlll14.I00OilO00Il();
                                break;
                            }
                            break;
                    }
/* 104 */           return ooiIlOl1iI;
                }
            }

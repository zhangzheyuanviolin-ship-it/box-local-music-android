            package p000;

            import java.lang.invoke.VarHandle;
            import kotlin.jvm.functions.Function1;
            import kotlin.jvm.functions.Function3;
            
/* 12 */    public final class I0o0i11iOOlI implements IlliIl1l11O {
                public final int I00iOIl;
                public long I00iiI;
                public Object I00iiO;
                public Object I00iio;

                public I0o0i11iOOlI(OI10i0Il oI10i0Il, OIooi1iOiOol oIooi1iOiOol, long j) {
/* 2 */             this.I00iOIl = 2;
/* 7 */             this.I00iiO = oI10i0Il;
/* 9 */             this.I00iio = oIooi1iOiOol;
/* 11 */            this.I00iiI = j;
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r0v7, types: [IloI0lOlll1] */
                /* JADX WARN: Type inference failed for: r2v10, types: [java.lang.Object] */
                /* JADX WARN: Type inference failed for: r2v11, types: [IOlioIoOO1, java.lang.Object] */
                /* JADX WARN: Type inference failed for: r2v12 */
                @Override
                public final Object invoke(Object obj, Object obj2) {
/* 3 */             int i = this.I00iOIl;
/* 5 */             OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
/* 7 */             int i2 = 2;
                    switch (i) {
                        case 0:
/* 359 */                   ((Integer) obj2).getClass();
/* 366 */                   I0o0ioOO.I00000oIO((OIOlil0i) this.I00iiO, (O1ooiI111i) this.I00iio, this.I00iiI, (IloI0lOlll1) obj, lIill1iOoIO.I00000oIO(1));
                            break;
                        case 1:
/* 260 */                   long j = this.I00iiI;
/* 264 */                   OIo1Oi1l1lI oIo1Oi1l1lI = (OIo1Oi1l1lI) this.I00iiO;
/* 268 */                   Function3 function3 = (Function3) this.I00iio;
/* 272 */                   IloI0lOlll1 iloI0lOlll1 = (IloI0lOlll1) obj;
/* 278 */                   int iIntValue = ((Integer) obj2).intValue();
/* 294 */                   if (iloI0lOlll1.I00OIl(iIntValue & 1, (iIntValue & 3) != 2)) {
/* 306 */                       Oo0lloOiiIOI oo0lloOiiIOI = ((O1OoiOIi1ooi) iloI0lOlll1.I000iOII(O1OoilIO.I00000oOI)).I00000oOI.I000lI;
/* 312 */                       I0Il0I1o i0Il0I1o = new I0Il0I1o(18);
/* 315 */                       i0Il0I1o.I00iiO = oIo1Oi1l1lI;
/* 317 */                       i0Il0I1o.I00iiI = function3;
/* 319 */                       VarHandle.storeStoreFence();
/* 331 */                       lIOi11I01oo.I00000oIO(j, oo0lloOiiIOI, iiioOl1O.I00000oOI(417635459, i0Il0I1o, iloI0lOlll1), iloI0lOlll1, 384);
                                break;
                            } else {
/* 335 */                       iloI0lOlll1.I00OilO00Il();
                                break;
                            }
                        case 2:
/* 61 */                    OI10i0Il oI10i0Il = (OI10i0Il) this.I00iiO;
/* 65 */                    OIooi1iOiOol oIooi1iOiOol = (OIooi1iOiOol) this.I00iio;
/* 67 */                    long j2 = this.I00iiI;
/* 71 */                    ?? r0 = (IloI0lOlll1) obj;
/* 77 */                    int iIntValue2 = ((Integer) obj2).intValue();
/* 93 */                    if (r0.I00OIl(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
/* 103 */                       int i3 = 0;
/* 108 */                       for (OlliO1iI olliO1iI : O1o0iO.I0000Il00O) {
/* 110 */                           int i4 = i3 + 1;
/* 135 */                           boolean z = i3 == 0 || (i3 == 1 && !((O1o0lio) oI10i0Il.getValue()).I0001Ioi1lo);
/* 144 */                           boolean z2 = oIooi1iOiOol.I000II() == i3;
/* 145 */                           boolean zI000O01llI0 = r0.I000O01llI0(z);
/* 149 */                           Object objI00O0i0ii = r0.I00O0i0ii();
/* 153 */                           IOO0o0I1l iOO0o0I1l = IOl11li.I00000oIO;
                                    Object obj3 = objI00O0i0ii;
/* 155 */                           if (zI000O01llI0 || objI00O0i0ii == iOO0o0I1l) {
/* 161 */                               II1ilOO1OIi iI1ilOO1OIi = new II1ilOO1OIi(2);
/* 164 */                               iI1ilOO1OIi.I00iiI = z;
/* 166 */                               VarHandle.storeStoreFence();
/* 169 */                               r0.I00iio(iI1ilOO1OIi);
                                        obj3 = iI1ilOO1OIi;
                                    }
/* 176 */                           O1ooiI111i o1ooiI111iI00000oIO = iIlll1lo.I00000oIO(O1ooIo101ll.I00000oIO, (Function1) obj3);
/* 180 */                           boolean zI0000oI00 = r0.I0000oI00(i3);
/* 184 */                           ?? I00O0i0ii = r0.I00O0i0ii();
/* 188 */                           if (zI0000oI00 || I00O0i0ii == iOO0o0I1l) {
/* 194 */                               I00O0i0ii = new IOlioIoOO1(1);
/* 197 */                               I00O0i0ii.I00iiI = i3;
/* 199 */                               I00O0i0ii.I00iiO = oIooi1iOiOol;
/* 201 */                               VarHandle.storeStoreFence();
/* 204 */                               r0.I00iio(I00O0i0ii);
                                    }
/* 211 */                           OOiIiiIioiO oOiIiiIioiO = new OOiIiiIioiO(i2);
/* 214 */                           oOiIiiIioiO.I00ilI0I1 = i3;
/* 216 */                           oOiIiiIioiO.I00iiI = j2;
/* 218 */                           oOiIiiIioiO.I00iiO = olliO1iI;
/* 220 */                           oOiIiiIioiO.I00iio = oIooi1iOiOol;
/* 222 */                           VarHandle.storeStoreFence();
/* 247 */                           lOiOoOi.I00000oOI(z2, (IllOOo00lI) I00O0i0ii, o1ooiI111iI00000oIO, z, iiioOl1O.I00000oOI(1732515642, oOiIiiIioiO, r0), 0L, 0L, r0, 24576, 480);
/* 250 */                           i3 = i4;
                                }
                                break;
                            } else {
/* 256 */                       r0.I00OilO00Il();
                                break;
                            }
                        default:
/* 12 */                    long j3 = this.I00iiI;
/* 17 */                    Oo0lloOiiIOI oo0lloOiiIOI2 = (Oo0lloOiiIOI) this.I00iiO;
/* 22 */                    IlliIl1l11O illiIl1l11O = (IlliIl1l11O) this.I00iio;
/* 26 */                    IloI0lOlll1 iloI0lOlll12 = (IloI0lOlll1) obj;
/* 32 */                    int iIntValue3 = ((Integer) obj2).intValue();
/* 48 */                    if (iloI0lOlll12.I00OIl(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
/* 51 */                        lOl0l1O.I0000O(j3, oo0lloOiiIOI2, illiIl1l11O, iloI0lOlll12, 0);
                                break;
                            } else {
/* 55 */                        iloI0lOlll12.I00OilO00Il();
                                break;
                            }
                    }
/* 58 */            return ooiIlOl1iI;
                }

/* 13 */        public I0o0i11iOOlI(int i) {
/* 14 */            this.I00iOIl = i;
                }
            }

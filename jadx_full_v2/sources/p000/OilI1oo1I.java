            package p000;

            import java.lang.invoke.VarHandle;
            import kotlin.jvm.functions.Function1;
            import kotlin.jvm.functions.Function3;
            
            public final class OilI1oo1I implements Function3 {
                public final int I00iOIl;
                public Function1 I00iiI;
                public OI10i0Il I00iiO;

                public OilI1oo1I(int i) {
/* 1 */             this.I00iOIl = i;
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r15v1, types: [IloI0lOlll1] */
                /* JADX WARN: Type inference failed for: r15v3, types: [IloI0lOlll1] */
                /* JADX WARN: Type inference failed for: r7v18, types: [java.lang.Object] */
                /* JADX WARN: Type inference failed for: r7v19, types: [O1oiilO, java.lang.Object] */
                /* JADX WARN: Type inference failed for: r7v20 */
                /* JADX WARN: Type inference failed for: r7v7, types: [java.lang.Object] */
                /* JADX WARN: Type inference failed for: r7v8, types: [I0O01OoI1Oi, java.lang.Object] */
                /* JADX WARN: Type inference failed for: r7v9 */
                @Override
                public final Object invoke(Object obj, Object obj2, Object obj3) {
/* 3 */             int i = this.I00iOIl;
/* 5 */             OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
/* 7 */             IOO0o0I1l iOO0o0I1l = IOl11li.I00000oIO;
                    switch (i) {
                        case 0:
/* 143 */                   Function1 function1 = this.I00iiI;
/* 145 */                   OI10i0Il oI10i0Il = this.I00iiO;
/* 153 */                   ?? r15 = (IloI0lOlll1) obj2;
/* 159 */                   int iIntValue = ((Integer) obj3).intValue();
/* 174 */                   if (r15.I00OIl(iIntValue & 1, (iIntValue & 17) != 16)) {
/* 188 */                       for (OIoi0IIoi oIoi0IIoi : Oil1lO.I00000oOI) {
/* 198 */                           String str = (String) oIoi0IIoi.I00iOIl;
/* 202 */                           String str2 = (String) oIoi0IIoi.I00iiI;
/* 208 */                           I0Iooi0i1l0l i0Iooi0i1l0l = new I0Iooi0i1l0l(11);
/* 211 */                           i0Iooi0i1l0l.I00iiI = str2;
/* 213 */                           VarHandle.storeStoreFence();
/* 219 */                           IOii1l iOii1lI00000oOI = iiioOl1O.I00000oOI(-132840611, i0Iooi0i1l0l, r15);
/* 231 */                           boolean zI000II = r15.I000II(function1) | r15.I000II(str);
/* 232 */                           IllOOo00lI illOOo00lII00O0i0ii = r15.I00O0i0ii();
/* 236 */                           if (zI000II || illOOo00lII00O0i0ii == iOO0o0I1l) {
/* 243 */                               illOOo00lII00O0i0ii = new I0O01OoI1Oi(3);
/* 246 */                               illOOo00lII00O0i0ii.I00iiI = function1;
/* 248 */                               illOOo00lII00O0i0ii.I00iiO = str;
/* 250 */                               illOOo00lII00O0i0ii.I00iio = oI10i0Il;
/* 252 */                               VarHandle.storeStoreFence();
/* 255 */                               r15.I00iio(illOOo00lII00O0i0ii);
                                    }
/* 270 */                           iOIliO1I1i.I00000oOI(iOii1lI00000oOI, illOOo00lII00O0i0ii, null, null, false, null, null, r15, 6, 508);
                                }
                                break;
                            } else {
/* 274 */                       r15.I00OilO00Il();
                                break;
                            }
                        default:
/* 16 */                    Function1 function12 = this.I00iiI;
/* 18 */                    OI10i0Il oI10i0Il2 = this.I00iiO;
/* 26 */                    ?? r152 = (IloI0lOlll1) obj2;
/* 32 */                    int iIntValue2 = ((Integer) obj3).intValue();
/* 47 */                    if (r152.I00OIl(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
/* 61 */                        for (OoI1lOl ooI1lOl : OoIO1Oli1.I00000oIO) {
/* 72 */                            Ol0Oo0 ol0Oo0 = new Ol0Oo0(7);
/* 75 */                            ol0Oo0.I00iiI = ooI1lOl;
/* 77 */                            VarHandle.storeStoreFence();
/* 83 */                            IOii1l iOii1lI00000oOI2 = iiioOl1O.I00000oOI(-1403816041, ol0Oo0, r152);
/* 95 */                            boolean zI000II2 = r152.I000II(function12) | r152.I000II(ooI1lOl);
/* 96 */                            IllOOo00lI illOOo00lII00O0i0ii2 = r152.I00O0i0ii();
/* 100 */                           if (zI000II2 || illOOo00lII00O0i0ii2 == iOO0o0I1l) {
/* 108 */                               illOOo00lII00O0i0ii2 = new O1oiilO(19);
/* 111 */                               illOOo00lII00O0i0ii2.I00iiI = function12;
/* 113 */                               illOOo00lII00O0i0ii2.I00iiO = ooI1lOl;
/* 115 */                               illOOo00lII00O0i0ii2.I00iio = oI10i0Il2;
/* 117 */                               VarHandle.storeStoreFence();
/* 120 */                               r152.I00iio(illOOo00lII00O0i0ii2);
                                    }
/* 135 */                           iOIliO1I1i.I00000oOI(iOii1lI00000oOI2, illOOo00lII00O0i0ii2, null, null, false, null, null, r152, 6, 508);
                                }
                                break;
                            } else {
/* 139 */                       r152.I00OilO00Il();
                                break;
                            }
                    }
/* 142 */           return ooiIlOl1iI;
                }
            }

            package p000;

            import java.lang.invoke.VarHandle;
            import java.util.List;
            import kotlin.jvm.functions.Function1;
            import kotlin.jvm.functions.Function3;
            
            public final class I0O0O11i0lio implements Function3 {
                public final int I00iOIl;
                public List I00iiI;
                public Function1 I00iiO;
                public OI10i0Il I00iio;

                public I0O0O11i0lio(int i) {
/* 1 */             this.I00iOIl = i;
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r10v10 */
                /* JADX WARN: Type inference failed for: r10v2, types: [java.lang.Object] */
                /* JADX WARN: Type inference failed for: r10v3, types: [I0O01OoI1Oi, java.lang.Object] */
                /* JADX WARN: Type inference failed for: r10v4 */
                /* JADX WARN: Type inference failed for: r10v8, types: [java.lang.Object] */
                /* JADX WARN: Type inference failed for: r10v9, types: [Iil00oollOO, java.lang.Object] */
                /* JADX WARN: Type inference failed for: r8v3, types: [IloI0lOlll1] */
                /* JADX WARN: Type inference failed for: r8v7, types: [IloI0lOlll1] */
                @Override
                public final Object invoke(Object obj, Object obj2, Object obj3) {
/* 3 */             int i = this.I00iOIl;
/* 5 */             OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
/* 7 */             IOO0o0I1l iOO0o0I1l = IOl11li.I00000oIO;
                    switch (i) {
                        case 0:
/* 143 */                   List<String> list = this.I00iiI;
/* 145 */                   Function1 function1 = this.I00iiO;
/* 147 */                   OI10i0Il oI10i0Il = this.I00iio;
/* 155 */                   ?? r8 = (IloI0lOlll1) obj2;
/* 161 */                   int iIntValue = ((Integer) obj3).intValue();
/* 176 */                   if (r8.I00OIl(iIntValue & 1, (iIntValue & 17) != 16)) {
/* 186 */                       for (String str : list) {
/* 196 */                           I0Iooi0i1l0l i0Iooi0i1l0l = new I0Iooi0i1l0l(1);
/* 199 */                           i0Iooi0i1l0l.I00iiI = str;
/* 201 */                           VarHandle.storeStoreFence();
/* 207 */                           IOii1l iOii1lI00000oOI = iiioOl1O.I00000oOI(-1981499942, i0Iooi0i1l0l, r8);
/* 219 */                           boolean zI000II = r8.I000II(function1) | r8.I000II(str);
/* 220 */                           ?? I00O0i0ii = r8.I00O0i0ii();
/* 224 */                           if (zI000II || I00O0i0ii == iOO0o0I1l) {
/* 230 */                               I00O0i0ii = new I0O01OoI1Oi(1);
/* 233 */                               I00O0i0ii.I00iiI = function1;
/* 235 */                               I00O0i0ii.I00iiO = str;
/* 237 */                               I00O0i0ii.I00iio = oI10i0Il;
/* 239 */                               VarHandle.storeStoreFence();
/* 242 */                               r8.I00iio(I00O0i0ii);
                                    }
/* 258 */                           iOIliO1I1i.I00000oOI(iOii1lI00000oOI, (IllOOo00lI) I00O0i0ii, null, null, false, null, null, r8, 6, 508);
                                }
                                break;
                            } else {
/* 264 */                       r8.I00OilO00Il();
                                break;
                            }
                        default:
/* 16 */                    List<O1oIOiI11o0> list2 = this.I00iiI;
/* 18 */                    Function1 function12 = this.I00iiO;
/* 20 */                    OI10i0Il oI10i0Il2 = this.I00iio;
/* 28 */                    ?? r82 = (IloI0lOlll1) obj2;
/* 34 */                    int iIntValue2 = ((Integer) obj3).intValue();
/* 49 */                    if (r82.I00OIl(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
/* 61 */                        for (O1oIOiI11o0 o1oIOiI11o0 : list2) {
/* 71 */                            IOlo00IiI1IO iOlo00IiI1IO = new IOlo00IiI1IO(1);
/* 74 */                            iOlo00IiI1IO.I00iiI = o1oIOiI11o0;
/* 76 */                            VarHandle.storeStoreFence();
/* 82 */                            IOii1l iOii1lI00000oOI2 = iiioOl1O.I00000oOI(-964126191, iOlo00IiI1IO, r82);
/* 94 */                            boolean zI000II2 = r82.I000II(function12) | r82.I000OOo1O(o1oIOiI11o0);
/* 95 */                            ?? I00O0i0ii2 = r82.I00O0i0ii();
/* 99 */                            if (zI000II2 || I00O0i0ii2 == iOO0o0I1l) {
/* 105 */                               I00O0i0ii2 = new Iil00oollOO(1);
/* 108 */                               I00O0i0ii2.I00iiI = function12;
/* 110 */                               I00O0i0ii2.I00iiO = o1oIOiI11o0;
/* 112 */                               I00O0i0ii2.I00iio = oI10i0Il2;
/* 114 */                               VarHandle.storeStoreFence();
/* 117 */                               r82.I00iio(I00O0i0ii2);
                                    }
/* 133 */                           iOIliO1I1i.I00000oOI(iOii1lI00000oOI2, (IllOOo00lI) I00O0i0ii2, null, null, false, null, null, r82, 6, 508);
                                }
                                break;
                            } else {
/* 139 */                       r82.I00OilO00Il();
                                break;
                            }
                    }
/* 142 */           return ooiIlOl1iI;
                }
            }

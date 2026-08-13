            package p000;

            import java.lang.invoke.VarHandle;
            import java.util.Iterator;
            import kotlin.jvm.functions.Function1;
            
            public final class IO0i1IlOoI implements IlliIl1l11O {
                public final int I00iOIl;
                public Object I00iiI;
                public Object I00iiO;
                public boolean I00iio;
                public Object I00ilI0I1;
                public Object I00ilO0;
                public Object I00io1l;

                public IO0i1IlOoI(int i) {
/* 1 */             this.I00iOIl = i;
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r15v2, types: [java.lang.Object] */
                /* JADX WARN: Type inference failed for: r15v3, types: [I10OI0, java.lang.Object] */
                /* JADX WARN: Type inference failed for: r15v4 */
                /* JADX WARN: Type inference failed for: r8v11 */
                /* JADX WARN: Type inference failed for: r8v12 */
                /* JADX WARN: Type inference failed for: r8v9, types: [IloI0lOlll1] */
                @Override
                public final Object invoke(Object obj, Object obj2) {
/* 3 */             int i = this.I00iOIl;
/* 5 */             boolean z = true;
/* 6 */             OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
                    switch (i) {
                        case 0:
/* 400 */                   ((Integer) obj2).getClass();
/* 410 */                   iOl111l1l.I0000Il00O((IllOOo00lI) this.I00iiI, (O1ooiI111i) this.I00iiO, this.I00iio, (OioOIi1o0I) this.I00ilI0I1, (IO0i0i) this.I00ilO0, (IO0i0lIl) this.I00io1l, (IloI0lOlll1) obj, lIill1iOoIO.I00000oIO(12582961));
/* 413 */                   return ooiIlOl1iI;
                        case 1:
/* 354 */                   ((Integer) obj2).getClass();
/* 361 */                   Io0IlOI0l.I00000oIO((O1ol100o0O) this.I00ilI0I1, (IllOOo00lI) this.I00iiI, (IlliIl1l11O) this.I00ilO0, (Function1) this.I00io1l, (O1ooiI111i) this.I00iiO, this.I00iio, (IloI0lOlll1) obj, lIill1iOoIO.I00000oIO(1));
/* 364 */                   return ooiIlOl1iI;
                        case 2:
/* 303 */                   ((Integer) obj2).getClass();
/* 313 */                   iloO1li000o.I00000oIO((OloIl1l1oOii) this.I00iiI, (Io1o01Ol0i01) this.I00ilI0I1, (Function1) this.I00ilO0, (Function1) this.I00io1l, this.I00iio, (O1ooiI111i) this.I00iiO, (IloI0lOlll1) obj, lIill1iOoIO.I00000oIO(196609));
/* 316 */                   return ooiIlOl1iI;
                        case 3:
/* 257 */                   ((Integer) obj2).getClass();
/* 264 */                   l1OoOiiO1I.I00000oIO((OloIl1l1oOii) this.I00ilI0I1, (O1ol100o0O) this.I00ilO0, this.I00iio, (IllOOo00lI) this.I00iiI, (Function1) this.I00io1l, (O1ooiI111i) this.I00iiO, (IloI0lOlll1) obj, lIill1iOoIO.I00000oIO(1));
/* 267 */                   return ooiIlOl1iI;
                        default:
/* 11 */                    boolean z2 = this.I00iio;
/* 15 */                    O11l1I o11l1I = (O11l1I) this.I00iiI;
/* 19 */                    O1oIOiI11o0 o1oIOiI11o0 = (O1oIOiI11o0) this.I00iiO;
/* 23 */                    OIooi1iOiOol oIooi1iOiOol = (OIooi1iOiOol) this.I00ilI0I1;
/* 27 */                    Ol1o1llOII ol1o1llOII = (Ol1o1llOII) this.I00ilO0;
/* 31 */                    OI10i0Il oI10i0Il = (OI10i0Il) this.I00io1l;
/* 35 */                    IloI0lOlll1 iloI0lOlll1 = (IloI0lOlll1) obj;
/* 41 */                    int iIntValue = ((Integer) obj2).intValue();
/* 47 */                    int i2 = 2;
/* 61 */                    if (iloI0lOlll1.I00OIl(iIntValue & 1, (iIntValue & 3) != 2)) {
/* 65 */                        Iterator it = OOOIo1O1I0I.I00000oOI.iterator();
/* 69 */                        int i3 = 0;
                                ?? r8 = iloI0lOlll1;
/* 75 */                        while (it.hasNext()) {
/* 77 */                            Object next = it.next();
/* 81 */                            int i4 = i3 + 1;
/* 83 */                            if (i3 < 0) {
/* 209 */                               IOOi1I.I000lI();
/* 213 */                               throw null;
                                    }
/* 85 */                            String str = (String) next;
/* 95 */                            boolean z3 = oIooi1iOiOol.I000II() == i3 ? z : false;
                                    boolean z4 = !z2;
/* 112 */                           boolean zI0000oI00 = r8.I0000oI00(i3) | r8.I000OOo1O(o11l1I) | r8.I000OOo1O(o1oIOiI11o0);
/* 113 */                           ?? I00O0i0ii = r8.I00O0i0ii();
/* 117 */                           if (zI0000oI00 || I00O0i0ii == IOl11li.I00000oIO) {
/* 125 */                               I00O0i0ii = new I10OI0(i2);
/* 128 */                               I00O0i0ii.I00iiO = ol1o1llOII;
/* 130 */                               I00O0i0ii.I00iiI = i3;
/* 132 */                               I00O0i0ii.I00iio = o11l1I;
/* 134 */                               I00O0i0ii.I00ilI0I1 = o1oIOiI11o0;
/* 136 */                               I00O0i0ii.I00ilO0 = oI10i0Il;
/* 138 */                               I00O0i0ii.I00io1l = oIooi1iOiOol;
/* 140 */                               VarHandle.storeStoreFence();
/* 143 */                               r8.I00iio(I00O0i0ii);
                                    }
/* 153 */                           I0oololOOll1 i0oololOOll1 = new I0oololOOll1(3);
/* 156 */                           i0oololOOll1.I00iio = str;
/* 158 */                           i0oololOOll1.I00iiI = z2;
/* 160 */                           i0oololOOll1.I00iiO = i3;
/* 162 */                           i0oololOOll1.I00ilI0I1 = oIooi1iOiOol;
/* 164 */                           VarHandle.storeStoreFence();
/* 193 */                           IloI0lOlll1 iloI0lOlll12 = r8;
/* 197 */                           lOiOoOi.I00000oOI(z3, (IllOOo00lI) I00O0i0ii, null, z4, iiioOl1O.I00000oOI(-395502573, i0oololOOll1, r8), 0L, 0L, iloI0lOlll12, 24576, 484);
/* 200 */                           i2 = i2;
/* 201 */                           r8 = iloI0lOlll12;
/* 203 */                           i3 = i4;
/* 205 */                           z = z;
                                }
                            } else {
/* 216 */                       iloI0lOlll1.I00OilO00Il();
                            }
/* 219 */                   return ooiIlOl1iI;
                    }
                }
            }

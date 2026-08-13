            package p000;

            import java.lang.invoke.VarHandle;
            import kotlin.jvm.functions.Function1;
            import kotlin.jvm.functions.Function3;
            
            public final class OoIII0Iil implements Function3 {
                public OoI1lOl I00iOIl;
                public boolean I00iiI;
                public String I00iiO;
                public OI10i0Il I00iio;
                public Function1 I00ilI0I1;

                @Override
                public final Object invoke(Object obj, Object obj2, Object obj3) {
/* 3 */             OoI1lOl ooI1lOl = this.I00iOIl;
/* 5 */             boolean z = this.I00iiI;
/* 7 */             String str = this.I00iiO;
/* 9 */             OI10i0Il oI10i0Il = this.I00iio;
/* 11 */            Function1 function1 = this.I00ilI0I1;
/* 15 */            Il1ii01 il1ii01 = (Il1ii01) obj;
/* 19 */            IloI0lOlll1 iloI0lOlll1 = (IloI0lOlll1) obj2;
/* 25 */            int iIntValue = ((Integer) obj3).intValue();
/* 31 */            if ((iIntValue & 6) == 0) {
/* 51 */                iIntValue |= (iIntValue & 8) == 0 ? iloI0lOlll1.I000II(il1ii01) : iloI0lOlll1.I000OOo1O(il1ii01) ? 4 : 2;
                    }
/* 52 */            int i = iIntValue;
/* 70 */            if (iloI0lOlll1.I00OIl(i & 1, (i & 19) != 18)) {
/* 72 */                String str2 = ooI1lOl.I00000oIO;
/* 82 */                O1ooiI111i o1ooiI111iI0000oI00 = Ol0iOOO0.I0000oI00(Il1ii01.I00000oOI(il1ii01, "PrimaryNotEditable"), 1.0f);
/* 86 */                Object objI00O0i0ii = iloI0lOlll1.I00O0i0ii();
/* 90 */                IOO0o0I1l iOO0o0I1l = IOl11li.I00000oIO;
/* 92 */                if (objI00O0i0ii == iOO0o0I1l) {
/* 97 */                    objI00O0i0ii = new I01OoIoio00O(7);
/* 100 */                   iloI0lOlll1.I00iio(objI00O0i0ii);
                        }
/* 109 */               I0Iooi0i1l0l i0Iooi0i1l0l = new I0Iooi0i1l0l(20);
/* 112 */               i0Iooi0i1l0l.I00iiI = str;
/* 114 */               VarHandle.storeStoreFence();
/* 120 */               IOii1l iOii1lI00000oOI = iiioOl1O.I00000oOI(808871708, i0Iooi0i1l0l, iloI0lOlll1);
/* 127 */               OioIilOIOO1 oioIilOIOO1 = new OioIilOIOO1(6);
/* 130 */               oioIilOIOO1.I00iiI = oI10i0Il;
/* 132 */               VarHandle.storeStoreFence();
/* 209 */               l1liIOil0i1o.I00000oOI(str2, (Function1) objI00O0i0ii, o1ooiI111iI0000oI00, z, true, null, iOii1lI00000oOI, null, null, iiioOl1O.I00000oOI(-1601295393, oioIilOIOO1, iloI0lOlll1), null, false, null, null, null, true, 0, 0, null, null, iloI0lOlll1, 806903856, 12582912, 8256928);
/* 220 */               boolean zBooleanValue = ((Boolean) oI10i0Il.getValue()).booleanValue();
/* 224 */               Object objI00O0i0ii2 = iloI0lOlll1.I00O0i0ii();
                        Object obj4 = objI00O0i0ii2;
/* 228 */               if (objI00O0i0ii2 == iOO0o0I1l) {
/* 234 */                   Ol0ioi ol0ioi = new Ol0ioi(16);
/* 237 */                   ol0ioi.I00iiI = oI10i0Il;
/* 239 */                   VarHandle.storeStoreFence();
/* 242 */                   iloI0lOlll1.I00iio(ol0ioi);
                            obj4 = ol0ioi;
                        }
/* 251 */               OilI1oo1I oilI1oo1I = new OilI1oo1I(1);
/* 256 */               oilI1oo1I.I00iiI = function1;
/* 258 */               oilI1oo1I.I00iiO = oI10i0Il;
/* 260 */               VarHandle.storeStoreFence();
/* 289 */               il1ii01.I00000oIO(zBooleanValue, (IllOOo00lI) obj4, null, null, false, null, 0L, 0.0f, iiioOl1O.I00000oOI(-1090808584, oilI1oo1I, iloI0lOlll1), iloI0lOlll1, 48, 6 | ((i << 3) & 112));
                    } else {
/* 295 */               iloI0lOlll1.I00OilO00Il();
                    }
/* 298 */           return OoiIlOl1iI.I00000oIO;
                }
            }

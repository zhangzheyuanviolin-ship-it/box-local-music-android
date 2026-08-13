            package p000;

            import java.lang.invoke.VarHandle;
            import kotlin.jvm.functions.Function1;
            
            public abstract class lIoIooOO {
                public static final void I00000oIO(Oi1O00I1 oi1O00I1, I1Oi1Oi0O i1Oi1Oi0O, IloI0lOlll1 iloI0lOlll1, int i) {
                    int i2;
/* 5 */             iloI0lOlll1.I00i0O(1246740314);
/* 11 */            if ((i & 6) == 0) {
/* 22 */                i2 = (iloI0lOlll1.I000II(oi1O00I1) ? 4 : 2) | i;
                    } else {
/* 24 */                i2 = i;
                    }
/* 29 */            if ((i & 48) == 0) {
/* 41 */                i2 |= iloI0lOlll1.I000II(i1Oi1Oi0O) ? 32 : 16;
                    }
/* 46 */            if ((i2 & 19) == 18 && iloI0lOlll1.I00IO1()) {
/* 55 */                iloI0lOlll1.I00OilO00Il();
                    } else {
/* 62 */                iloI0lOlll1.I00i01iIIliI(-1265661332);
/* 65 */                int i3 = i2 & 112;
/* 73 */                boolean z = i3 == 32;
/* 74 */                Object objI00O0i0ii = iloI0lOlll1.I00O0i0ii();
/* 78 */                Object obj = IOl11li.I00000oIO;
                        Object obj2 = objI00O0i0ii;
/* 80 */                if (z || objI00O0i0ii == obj) {
/* 86 */                    Oi00o1llI1ii oi00o1llI1ii = new Oi00o1llI1ii(0);
/* 89 */                    oi00o1llI1ii.I00iiI = i1Oi1Oi0O;
/* 91 */                    VarHandle.storeStoreFence();
/* 94 */                    iloI0lOlll1.I00iio(oi00o1llI1ii);
                            obj2 = oi00o1llI1ii;
                        }
/* 97 */                Function1 function1 = (Function1) obj2;
/* 99 */                iloI0lOlll1.I0010I0i(false);
/* 105 */               iloI0lOlll1.I00i01iIIliI(-1265651420);
/* 112 */               boolean z2 = i3 == 32;
/* 113 */               Object objI00O0i0ii2 = iloI0lOlll1.I00O0i0ii();
                        Object obj3 = objI00O0i0ii2;
/* 117 */               if (z2 || objI00O0i0ii2 == obj) {
/* 123 */                   Oi00o1llI1ii oi00o1llI1ii2 = new Oi00o1llI1ii(1);
/* 126 */                   oi00o1llI1ii2.I00iiI = i1Oi1Oi0O;
/* 128 */                   VarHandle.storeStoreFence();
/* 131 */                   iloI0lOlll1.I00iio(oi00o1llI1ii2);
                            obj3 = oi00o1llI1ii2;
                        }
/* 136 */               iloI0lOlll1.I0010I0i(false);
/* 145 */               Olo0O1oOi1I.I00000oIO(oi1O00I1, null, function1, (Function1) obj3, iloI0lOlll1, i2 & 14);
                    }
/* 148 */           OOloioIl oOloioIlI001IO000 = iloI0lOlll1.I001IO000();
/* 152 */           if (oOloioIlI001IO000 != null) {
/* 156 */               I1oiOo i1oiOo = new I1oiOo(4);
/* 159 */               i1oiOo.I00iiI = oi1O00I1;
/* 161 */               i1oiOo.I00iiO = i1Oi1Oi0O;
/* 163 */               i1oiOo.I00iio = i;
/* 165 */               VarHandle.storeStoreFence();
/* 168 */               oOloioIlI001IO000.I0000O = i1oiOo;
                    }
                }
            }

            package p000;

            import java.lang.invoke.VarHandle;
            import kotlin.jvm.functions.Function1;
            import kotlin.jvm.functions.Function3;
            
            public final class O1oiO0i0 implements Function3 {
                public OloIl1l1oOii I00iOIl;
                public O1ol100o0O I00iiI;
                public boolean I00iiO;
                public Function1 I00iio;
                public boolean I00ilI0I1;
                public O1OIi1 I00ilO0;

                @Override
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    IllOOo00lI illOOo00lI;
/* 1 */             OloIl1l1oOii oloIl1l1oOii = this.I00iOIl;
/* 3 */             O1ol100o0O o1ol100o0O = this.I00iiI;
/* 5 */             boolean z = this.I00iiO;
/* 7 */             Function1 function1 = this.I00iio;
/* 9 */             boolean z2 = this.I00ilI0I1;
/* 11 */            O1OIi1 o1OIi1 = this.I00ilO0;
/* 13 */            OIo1Oi1l1lI oIo1Oi1l1lI = (OIo1Oi1l1lI) obj;
/* 16 */            IloI0lOlll1 iloI0lOlll1 = (IloI0lOlll1) obj2;
/* 20 */            int iIntValue = ((Integer) obj3).intValue();
/* 26 */            if ((iIntValue & 6) == 0) {
/* 37 */                iIntValue |= iloI0lOlll1.I000II(oIo1Oi1l1lI) ? 4 : 2;
                    }
/* 54 */            if (iloI0lOlll1.I00OIl(iIntValue & 1, (iIntValue & 19) != 18)) {
/* 56 */                Object objI00O0i0ii = iloI0lOlll1.I00O0i0ii();
/* 60 */                Object obj4 = IOl11li.I00000oIO;
/* 62 */                if (objI00O0i0ii == obj4) {
/* 68 */                    objI00O0i0ii = new I01OoIoio00O(8);
/* 71 */                    iloI0lOlll1.I00iio(objI00O0i0ii);
                        }
/* 74 */                Function1 function12 = (Function1) objI00O0i0ii;
/* 76 */                if (z2) {
/* 81 */                    iloI0lOlll1.I00i01iIIliI(275761400);
/* 84 */                    boolean zI000OOo1O = iloI0lOlll1.I000OOo1O(o1OIi1);
/* 88 */                    Object objI00O0i0ii2 = iloI0lOlll1.I00O0i0ii();
                            Object obj5 = objI00O0i0ii2;
/* 92 */                    if (zI000OOo1O || objI00O0i0ii2 == obj4) {
/* 98 */                        I0O1I11 i0o1i11 = new I0O1I11(18);
/* 101 */                       i0o1i11.I00iiI = o1OIi1;
/* 103 */                       VarHandle.storeStoreFence();
/* 106 */                       iloI0lOlll1.I00iio(i0o1i11);
                                obj5 = i0o1i11;
                            }
/* 109 */                   illOOo00lI = (IllOOo00lI) obj5;
/* 111 */                   iloI0lOlll1.I0010I0i(false);
                        } else {
/* 119 */                   iloI0lOlll1.I00i01iIIliI(275977934);
/* 122 */                   iloI0lOlll1.I0010I0i(false);
/* 125 */                   illOOo00lI = null;
                        }
/* 139 */               l1OoOIIO.I00000oIO(oloIl1l1oOii, o1ol100o0O, oIo1Oi1l1lI, z, function1, function12, illOOo00lI, Ol0iOOO0.I0000Il00O, iloI0lOlll1, ((iIntValue << 6) & 896) | 12779520);
                    } else {
/* 143 */               iloI0lOlll1.I00OilO00Il();
                    }
/* 146 */           return OoiIlOl1iI.I00000oIO;
                }
            }

            package p000;

            import android.app.Activity;
            import java.lang.invoke.VarHandle;
            import kotlin.jvm.functions.Function1;
            import kotlin.jvm.functions.Function3;
            
            public final class Oo1IOioIl implements Function3 {
                public final int I00iOIl;
                public boolean I00iiI;
                public Object I00iiO;
                public Object I00iio;
                public Object I00ilI0I1;
                public Object I00ilO0;

                public Oo1IOioIl(int i) {
/* 1 */             this.I00iOIl = i;
                }

                @Override
                public final Object invoke(Object obj, Object obj2, Object obj3) {
/* 1 */             int i = this.I00iOIl;
/* 4 */             IOO0o0I1l iOO0o0I1l = IOl11li.I00000oIO;
                    switch (i) {
                        case 0:
/* 124 */                   IloI0lOlll1 iloI0lOlll1 = (IloI0lOlll1) obj2;
/* 128 */                   ((Number) obj3).intValue();
/* 134 */                   iloI0lOlll1.I00i01iIIliI(-1525724089);
/* 137 */                   Object objI00O0i0ii = iloI0lOlll1.I00O0i0ii();
/* 141 */                   if (objI00O0i0ii == iOO0o0I1l) {
/* 143 */                       objI00O0i0ii = l001l0.I00000oIO();
/* 147 */                       iloI0lOlll1.I00iio(objI00O0i0ii);
                            }
/* 151 */                   OI0lOIiOIOOo oI0lOIiOIOOo = (OI0lOIiOIOOo) objI00O0i0ii;
/* 186 */                   O1ooiI111i o1ooiI111iI0000O = Iol0oOO.I00000oIO(O1ooIo101ll.I00000oIO, oI0lOIiOIOOo, (Iol100iI0lO) this.I00iiO).I0000O(new OoIi0Il((Oo1IiOO1IoI) this.I00iio, oI0lOIiOIOOo, null, this.I00iiI, (Oi1o00lo) this.I00ilI0I1, (IllOOo00lI) this.I00ilO0));
/* 190 */                   iloI0lOlll1.I0010I0i(false);
/* 193 */                   return o1ooiI111iI0000O;
                        default:
/* 11 */                    int iIntValue = ((Integer) obj3).intValue();
/* 16 */                    IloI0lOlll1 iloI0lOlll12 = (IloI0lOlll1) obj2;
/* 33 */                    if (iloI0lOlll12.I00OIl(iIntValue & 1, (iIntValue & 17) != 16)) {
/* 37 */                        Activity activity = (Activity) this.I00ilI0I1;
/* 39 */                        boolean zI000OOo1O = iloI0lOlll12.I000OOo1O(activity);
/* 43 */                        Object objI00O0i0ii2 = iloI0lOlll12.I00O0i0ii();
                                Object obj4 = objI00O0i0ii2;
/* 47 */                        if (zI000OOo1O || objI00O0i0ii2 == iOO0o0I1l) {
/* 55 */                            O0l1iloO o0l1iloO = new O0l1iloO(11);
/* 58 */                            o0l1iloO.I00iiI = activity;
/* 60 */                            VarHandle.storeStoreFence();
/* 63 */                            iloI0lOlll12.I00iio(o0l1iloO);
                                    obj4 = o0l1iloO;
                                }
/* 67 */                        IllOOo00lI illOOo00lI = (IllOOo00lI) obj4;
/* 69 */                        Object objI00O0i0ii3 = iloI0lOlll12.I00O0i0ii();
/* 73 */                        if (objI00O0i0ii3 == iOO0o0I1l) {
/* 77 */                            Ol1o0O0O0 ol1o0O0O0 = (Ol1o0O0O0) this.I00ilO0;
/* 83 */                            OiI0lII1i oiI0lII1i = new OiI0lII1i(9);
/* 86 */                            oiI0lII1i.I00iiI = ol1o0O0O0;
/* 88 */                            VarHandle.storeStoreFence();
/* 91 */                            iloI0lOlll12.I00iio(oiI0lII1i);
/* 94 */                            objI00O0i0ii3 = oiI0lII1i;
                                }
/* 112 */                       ll1l0Iil0.I00000oIO((ii1iOiO) this.I00iiO, (String) this.I00iio, illOOo00lI, (Function1) objI00O0i0ii3, this.I00iiI, iloI0lOlll12, 3072);
                            } else {
/* 116 */                       iloI0lOlll12.I00OilO00Il();
                            }
/* 119 */                   return OoiIlOl1iI.I00000oIO;
                    }
                }
            }

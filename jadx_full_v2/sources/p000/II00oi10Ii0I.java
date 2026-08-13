            package p000;

            import com.box.gallery.R;
            import java.lang.invoke.VarHandle;
            
            public final class II00oi10Ii0I implements IlliIl1l11O {
                public final int I00iOIl;
                public Ol1o0O0O0 I00iiI;
                public OI10i0Il I00iiO;

                public II00oi10Ii0I(int i) {
/* 1 */             this.I00iOIl = i;
                }

                @Override
                public final Object invoke(Object obj, Object obj2) {
                    String strI00000oOI;
/* 3 */             int i = this.I00iOIl;
/* 5 */             OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
                    switch (i) {
                        case 0:
/* 144 */                   Ol1o0O0O0 ol1o0O0O0 = this.I00iiI;
/* 146 */                   OI10i0Il oI10i0Il = this.I00iiO;
/* 150 */                   IloI0lOlll1 iloI0lOlll1 = (IloI0lOlll1) obj;
/* 156 */                   int iIntValue = ((Integer) obj2).intValue();
/* 172 */                   if (!iloI0lOlll1.I00OIl(iIntValue & 1, (iIntValue & 3) != 2)) {
/* 250 */                       iloI0lOlll1.I00OilO00Il();
                                break;
                            } else if (ol1o0O0O0.size() <= 1) {
/* 232 */                       iloI0lOlll1.I00i01iIIliI(1065040134);
/* 243 */                       lOO1OIO00.I00000oIO(iloI0lOlll1, Ol0iOOO0.I000lI(O1ooIo101ll.I00000oIO, 48.0f));
/* 246 */                       iloI0lOlll1.I0010I0i(false);
                                break;
                            } else {
/* 183 */                       iloI0lOlll1.I00i01iIIliI(1064765970);
/* 186 */                       Object objI00O0i0ii = iloI0lOlll1.I00O0i0ii();
                                Object obj3 = objI00O0i0ii;
/* 192 */                       if (objI00O0i0ii == IOl11li.I00000oIO) {
/* 197 */                           I1ol0OoiOI1o i1ol0OoiOI1o = new I1ol0OoiOI1o(4);
/* 200 */                           i1ol0OoiOI1o.I00iiI = oI10i0Il;
/* 202 */                           VarHandle.storeStoreFence();
/* 205 */                           iloI0lOlll1.I00iio(i1ol0OoiOI1o);
                                    obj3 = i1ol0OoiOI1o;
                                }
/* 222 */                       iIo1101O.I00000oIO((IllOOo00lI) obj3, null, false, null, null, i1OOl00lO.I00000oIO, iloI0lOlll1, 1572870, 62);
/* 225 */                       iloI0lOlll1.I0010I0i(false);
                                break;
                            }
                        default:
/* 13 */                    Ol1o0O0O0 ol1o0O0O02 = this.I00iiI;
/* 15 */                    OI10i0Il oI10i0Il2 = this.I00iiO;
/* 19 */                    IloI0lOlll1 iloI0lOlll12 = (IloI0lOlll1) obj;
/* 25 */                    int iIntValue2 = ((Integer) obj2).intValue();
/* 41 */                    if (!iloI0lOlll12.I00OIl(1 & iIntValue2, (iIntValue2 & 3) != 2)) {
/* 140 */                       iloI0lOlll12.I00OilO00Il();
                                break;
                            } else {
/* 47 */                        if (Ol0lllilO0Ol.I0000oI00(oI10i0Il2)) {
/* 52 */                            iloI0lOlll12.I00i01iIIliI(919387973);
/* 73 */                            strI00000oOI = lOOoli.I00000oIO(R.plurals.delete_selected_skills_content, ol1o0O0O02.size(), new Object[]{Integer.valueOf(ol1o0O0O02.size())}, iloI0lOlll12);
/* 77 */                            iloI0lOlll12.I0010I0i(false);
                                } else {
/* 84 */                            iloI0lOlll12.I00i01iIIliI(919394148);
/* 90 */                            strI00000oOI = lOOoli.I00000oOI(R.string.delete_skill_dialog_content, iloI0lOlll12);
/* 94 */                            iloI0lOlll12.I0010I0i(false);
                                }
/* 134 */                       Oo0i1oIIoOO.I00000oOI(strI00000oOI, null, 0L, null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, null, iloI0lOlll12, 0, 0, 262142);
                                break;
                            }
                    }
/* 143 */           return ooiIlOl1iI;
                }
            }
